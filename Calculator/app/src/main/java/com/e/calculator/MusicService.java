package com.e.calculator;

import android.app.Service;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.IBinder;

/**
 * Κλάση MusicService για την αναπαραγωγή της μουσικής στο background.
 */
public class MusicService extends Service
{
    private MediaPlayer md;

    @Override
    public IBinder onBind(Intent intent)
    {
        return null;
    }

    @Override
    public int onStartCommand(Intent intent, int flags, int startId)
    {
        md = MediaPlayer.create(this, R.raw.summer);
        md.setLooping(true);
        md.start();

        return START_STICKY;
    }


    @Override
    public void onDestroy()
    {
        super.onDestroy();
        md.stop();
        md.release();
    }
}