package com.grovelet.soccer.ball.jersey.maker.soccerballjerseymaker;

import android.app.Dialog;
import android.content.ActivityNotFoundException;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Bitmap.CompressFormat;
import android.media.MediaScannerConnection;
import android.net.Uri;
import android.os.Bundle;
import android.os.Environment;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.Toast;

import com.grovelet.soccer.ball.jersey.maker.soccerballjerseymaker.DashbordActivity;
import com.grovelet.soccer.ball.jersey.maker.soccerballjerseymaker.R;

import java.io.File;
import java.io.FileOutputStream;
import java.net.URI;
import java.util.Random;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class SaveAndShare extends AppCompatActivity {
    //private static final String ADMOB_APP_ID = "ca-app-pub-6821511760429001~2285656777";
    String club;
    Context context;
    ImageView download;
    ImageView share;
    ImageView shirt;
    Button tryAgain;
    Uri uri;
    File newDir;

    /* renamed from: com.virtualproz.android.footballJerseyMaker.SaveAndShare.1 */
    class C04751 implements OnClickListener {
        C04751() {
        }

        public void onClick(View view) {
            SaveAndShare.this.startActivity(new Intent(SaveAndShare.this, DashbordActivity.class));
            SaveAndShare.this.finish();
            MainActivity.ads.showInterstitial(false);

        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.SaveAndShare.2 */
    class C04762 implements OnClickListener {
        C04762() {
        }

        public void onClick(View view) {
            MainActivity.ads.showInterstitial(false);
            Bitmap bitmap = SaveAndShare.this.shirt.getDrawingCache();

            File file = new File(newDir, new Random().nextInt(10000) + ".png");
            uri = Uri.fromFile(file);
            System.err.print("Path of saved image." + file.getAbsolutePath());
            try {
                FileOutputStream out = new FileOutputStream(file);
                bitmap.compress(CompressFormat.PNG, 90, out);
                out.flush();
                Toast.makeText(SaveAndShare.this, "Saved", Toast.LENGTH_SHORT).show();
                download.setEnabled(false);
                out.close();

            } catch (Exception e) {
                e.printStackTrace();
                e.getMessage();

            }
            Intent scanFileIntent = new Intent(
                    Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, uri);
            sendBroadcast(scanFileIntent);

            ///This is for the Gallery Refresh///////
            MediaScannerConnection.scanFile(getApplicationContext(), new String[]{Environment.getExternalStorageDirectory().toString()}, null, new MediaScannerConnection.OnScanCompletedListener() {
                /*
                 *   (non-Javadoc)
                 * @see android.media.MediaScannerConnection.OnScanCompletedListener#onScanCompleted(java.lang.String, android.net.Uri)
                 */
                public void onScanCompleted(String path, Uri uri) {
                    Log.i("ExternalStorage", "Scanned " + path + ":");
                    Log.i("ExternalStorage", "-> uri=" + uri);
                }
            });
            ///This is for the Gallery Refresh///////

        }
    }


    public SaveAndShare() {
        this.context = this;
        this.club = null;
    }

    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView((int) R.layout.activity_save_and_share);
//        MobileAds.initialize(getApplicationContext(), ADMOB_APP_ID);
//        ((AdView) findViewById(R.id.adView)).loadAd(new Builder().addTestDevice("021F550555EC3D8416F14C0A6E2B295F").build());
        this.club = getIntent().getExtras().getString("club");
        this.tryAgain = (Button) findViewById(R.id.tryAgain);
        this.shirt = (ImageView) findViewById(R.id.shirtimage);
        this.shirt.setImageBitmap(DashbordActivity.image);
        this.shirt.setDrawingCacheEnabled(true);
        this.tryAgain.setOnClickListener(new C04751());
        this.share = (ImageView) findViewById(R.id.imgshare);
        this.download = (ImageView) findViewById(R.id.imgsave);
        this.download.setOnClickListener(new C04762());

        RelativeLayout adView = (RelativeLayout)findViewById(R.id.adViewCon);
        MainActivity.ads.loadBanner(adView);

        newDir = new File(Environment.getExternalStorageDirectory().toString() + "/" + getResources().getString(R.string.app_name));
        newDir.mkdirs();

        share.setOnClickListener(new OnClickListener() {
            @Override
            public void onClick(View view) {
                Bitmap bitmap = SaveAndShare.this.shirt.getDrawingCache();

                File file = new File(newDir, new Random().nextInt(10000) + ".png");
                uri = Uri.fromFile(file);
                System.err.print("Path of saved image." + file.getAbsolutePath());
                try {
                    FileOutputStream out = new FileOutputStream(file);
                    bitmap.compress(CompressFormat.PNG, 90, out);
                    out.flush();
                    //Toast.makeText(SaveAndShare.this, "Saved", Toast.LENGTH_SHORT).show();
                    Log.e("Save", "Image");
                    download.setEnabled(false);
                    out.close();

                } catch (Exception e) {
                    e.printStackTrace();
                    e.getMessage();

                }
                Intent scanFileIntent = new Intent(
                        Intent.ACTION_MEDIA_SCANNER_SCAN_FILE, uri);
                sendBroadcast(scanFileIntent);


                String appURL = "https://play.google.com/store/apps/details?id=";
                Intent sharingIntent = new Intent(Intent.ACTION_SEND);
                sharingIntent.setType("image/*");
                sharingIntent.putExtra("android.intent.extra.TEXT", getResources().getString(R.string.app_name) + ":  " + appURL + getPackageName());
                //Log.e("App URL", appURL + getPackageName());
                sharingIntent.putExtra(Intent.EXTRA_STREAM, uri);
                startActivity(Intent.createChooser(sharingIntent, "Share Wallpaper using"));
                MainActivity.ads.showInterstitial(false);

            }
        });
    }
}
