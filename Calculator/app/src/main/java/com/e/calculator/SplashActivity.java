package com.e.calculator;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

// TODO Έχει αφαιρεθεί από το Manifest καθώς η εφαρμογή θα ανέβει Playstore.

/**
 * Κλάση SplashActivity: περιλαμβάνει το όνομα της εφαρμογής και τα ονόματα των φοιτητών
 */
public class SplashActivity extends AppCompatActivity implements View.OnClickListener
{
    Button BtNext;

    /**
     * Αρχικοποίηση αρχικής οθόνης
     * @param savedInstanceState
     */
    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.splash_lay);

        BtNext = findViewById(R.id.BtNext);
        BtNext.setOnClickListener(this);
    }

    /**
     * onClick listener για το κουμπί continue που πάει στο activity με το calculator
     * @param v
     */
    @Override
    public void onClick(View v)
    {
        if (v == BtNext)
        {
            Intent intent = new Intent(this, MainActivity.class);
            startActivity(intent);
        }
    }
}
