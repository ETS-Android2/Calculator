package com.e.calculator;

import android.content.Context;
import android.media.AudioAttributes;
import android.media.MediaPlayer;
import android.net.Uri;

/**
 * MediaPlayerClass: Αναπαραγωγή μουσικής με mediaplayer
 * Το τραγούδι παίζει σε λούπα
 */
public class MediaPlayerClass implements MediaPlayer.OnCompletionListener
{
    private static MediaPlayer mediaPlayer;
    private static Context mdContext;

    public static void initPlayer(Context mContext)
    {
        mdContext = mContext;

        try
        {
        Uri mUri = Uri.parse("android.resource://com.e.calculator/" + R.raw.summer);
        mediaPlayer = new MediaPlayer();
        mediaPlayer.setAudioAttributes(
                new AudioAttributes.Builder()
                        .setContentType(AudioAttributes.CONTENT_TYPE_MUSIC)
                        .setUsage(AudioAttributes.USAGE_MEDIA)
                        .build()
        );
        mediaPlayer.setDataSource(mContext, mUri);
        mediaPlayer.prepare();
        mediaPlayer.start();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void PausePlayer()
    {
        try
        {
            mediaPlayer.pause();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void ResumePlayer()
    {
        try
        {
            mediaPlayer.start();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }

    public static void ReleasePlayer()
    {
        try
        {
            mediaPlayer.stop();
            mediaPlayer.release();
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }


    @Override
    public void onCompletion(MediaPlayer mp)
    {
        try
        {
            initPlayer(mdContext);
        }
        catch (Exception e)
        {
            e.printStackTrace();
        }
    }
}
