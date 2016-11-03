package com.sofittech.soccerballjerseymaker;

import android.app.ProgressDialog;
import android.content.Intent;
import android.os.Handler;
import android.support.v4.view.accessibility.AccessibilityNodeInfoCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class SplashScreen extends AppCompatActivity {

    Handler handler;
    ProgressDialog pd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        requestWindowFeature(1);
        getWindow().setFlags(AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT, AccessibilityNodeInfoCompat.ACTION_NEXT_HTML_ELEMENT);

        setContentView(R.layout.activity_splash_screen);

        this.handler = new Handler();
        this.handler.postDelayed(new C04851(), 3000);
//        pd = new ProgressDialog(SplashScreen.this);
//
//        pd.setCancelable(false);
//        pd.show();

    }


    class C04851 implements Runnable {
        C04851() {
        }

        public void run() {
            SplashScreen.this.startActivity(new Intent(SplashScreen.this, MainActivity.class));
            //pd.dismiss();
            SplashScreen.this.finish();
        }
    }

}



