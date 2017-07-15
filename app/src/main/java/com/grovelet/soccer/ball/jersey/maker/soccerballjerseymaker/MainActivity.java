package com.grovelet.soccer.ball.jersey.maker.soccerballjerseymaker;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.google.android.gms.analytics.GoogleAnalytics;
import com.google.android.gms.analytics.Tracker;
import com.grovelet.soccer.ball.jersey.maker.soccerballjerseymaker.BuildConfig;
import com.grovelet.soccer.ball.jersey.maker.soccerballjerseymaker.R;

public class MainActivity extends AppCompatActivity {

    EditText name;
    Button next;
    EditText number;

    public static Ads ads;
    public static GoogleAnalytics analytics;
    public static Tracker tracker;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ads = new Ads(this, true, true, true);

        if (android.os.Build.VERSION.SDK_INT >= 21) {
            Window statusBar = getWindow();
            statusBar.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            statusBar.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            statusBar.setStatusBarColor(getResources().getColor(R.color.colorPrimaryDark));
            statusBar.setNavigationBarColor(getResources().getColor(R.color.colorPrimaryDark));
        }
        setContentView(R.layout.activity_main);
        RelativeLayout adView = (RelativeLayout)findViewById(R.id.adViewCon);

        ads.loadInterstitial();
        ads.loadBanner(adView);

        analytics = GoogleAnalytics.getInstance(this);
        analytics.setLocalDispatchPeriod(10);
        tracker = analytics.newTracker(getResources().getString(R.string.analytics_id));
        tracker.enableAutoActivityTracking(true);


        name= (EditText) findViewById(R.id.username);
        number= (EditText) findViewById(R.id.shirtnumber);



//Test 1
//        name.setOnKeyListener(new View.OnKeyListener() {
//
//            @Override
//            public boolean onKey(View v , int keyCode , KeyEvent event) {
//
//                EditText number = (EditText) findViewById(R.id.shirtnumber);
//
//                // TODO Auto-generated method stub
//                if (keyCode == event.KEYCODE_ENTER) {
//
//                    Selection.setSelection((Editable) number.getText(), name.getSelectionStart());
//                    number.requestFocus();
//                }
//
//                return true;
//            }
//        });




        name.setOnKeyListener(new View.OnKeyListener() {

            public boolean onKey(View v, int keyCode, KeyEvent event) {
                // If the event is a key-down event on the "enter" button
                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER))
                {
                    // Perform action on Enter key press
                    name.clearFocus();
                    number.requestFocus();
                    return true;
                }
                return false;
            }
        });

        number.setOnKeyListener(new View.OnKeyListener() {

            public boolean onKey(View v, int keyCode, KeyEvent event) {

                if ((event.getAction() == KeyEvent.ACTION_DOWN) &&
                        (keyCode == KeyEvent.KEYCODE_ENTER))
                {
                    // Perform action on Enter key press
                    // check for username - password correctness here
                    return true;
                }
                return false;
            }
        });


        next= (Button) findViewById(R.id.btnNext);

        next.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {


                if (MainActivity.this.name.getText().toString().equals(BuildConfig.FLAVOR) || MainActivity.this.number.getText().toString().equals(BuildConfig.FLAVOR)) {
                    Toast.makeText(MainActivity.this, "Please fill both fields", Toast.LENGTH_SHORT).show();
                    return;
                }else
                {
                    Intent myintent = new Intent(MainActivity.this, DashbordActivity.class);
                    myintent.putExtra("name", MainActivity.this.name.getText().toString());
                    myintent.putExtra("number", MainActivity.this.number.getText().toString());
                    MainActivity.this.startActivity(myintent);
                    ads.showInterstitial(false);
                }
            }
        });


    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        ads.showInterstitial(true);
    }
}
