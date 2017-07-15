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
            File newDir = new File(Environment.getExternalStorageDirectory().toString() + getResources().getString(R.string.app_name));
            newDir.mkdirs();
            File file = new File(newDir, new Random().nextInt(10000) + ".png");
            uri = Uri.fromFile(file);
            System.err.print("Path of saved image." + file.getAbsolutePath());
            try {
                FileOutputStream out = new FileOutputStream(file);
                bitmap.compress(CompressFormat.PNG, 90, out);
                out.flush();
                Toast.makeText(SaveAndShare.this.getApplicationContext(), "Picture has been saved to your phone", Toast.LENGTH_SHORT).show();
                download.setEnabled(false);
                out.close();

            } catch (Exception e) {
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

    /* renamed from: com.virtualproz.android.footballJerseyMaker.SaveAndShare.3 */
    class C04843 implements OnClickListener {

        /* renamed from: com.virtualproz.android.footballJerseyMaker.SaveAndShare.3.1 */
        class C04771 implements OnClickListener {
            final /* synthetic */ Dialog val$dialog;

            C04771(Dialog dialog) {
                this.val$dialog = dialog;
            }

            public void onClick(View view) {
                Bitmap image = SaveAndShare.this.shirt.getDrawingCache();
                File newDir = new File(Environment.getExternalStorageDirectory().toString() + "/saved_picture");
                newDir.mkdirs();
                File file = new File(newDir, "share.png");
                Uri shareUri = Uri.fromFile(file);
                System.err.print("Path of saved image." + file.getAbsolutePath());
                try {
                    FileOutputStream out = new FileOutputStream(file);
                    image.compress(CompressFormat.PNG, 90, out);
                    out.flush();
                    out.close();
                } catch (Exception e) {
                }
                Intent gmailIntent = new Intent("android.intent.action.SEND");
                gmailIntent.setType("image/*");
                gmailIntent.setPackage("com.google.android.gm");
                gmailIntent.putExtra("android.intent.extra.TEXT", "My #" + SaveAndShare.this.club + " jersey\nMake yours at\nAndroid: put package here\niOS: put package here");
                gmailIntent.putExtra("android.intent.extra.STREAM", shareUri);
                this.val$dialog.dismiss();
                try {
                    SaveAndShare.this.startActivity(gmailIntent);
                } catch (ActivityNotFoundException e2) {
                    Toast.makeText(SaveAndShare.this, "gmail have not been installed.", Toast.LENGTH_SHORT).show();
                    String appPackageName = "com.google.android.gm";
                    try {
                        SaveAndShare.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.google.android.gm")));
                    } catch (ActivityNotFoundException e3) {
                        SaveAndShare.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.google.android.gm")));
                    }
                }
            }
        }
        /* renamed from: com.virtualproz.android.footballJerseyMaker.SaveAndShare.3.2 */
        class C04782 implements OnClickListener {
            final /* synthetic */ Dialog val$dialog;

            C04782(Dialog dialog) {
                this.val$dialog = dialog;
            }

            public void onClick(View view) {
                Bitmap image = SaveAndShare.this.shirt.getDrawingCache();
                File newDir = new File(Environment.getExternalStorageDirectory().toString() + "/saved_picture");
                newDir.mkdirs();
                File file = new File(newDir, "share.png");
                Uri shareUri = Uri.fromFile(file);
                System.err.print("Path of saved image." + file.getAbsolutePath());
                try {
                    FileOutputStream out = new FileOutputStream(file);
                    image.compress(CompressFormat.PNG, 90, out);
                    out.flush();
                    out.close();
                } catch (Exception e) {
                }
                Intent instagramIntent = new Intent("android.intent.action.SEND");
                instagramIntent.setType("image/*");
                instagramIntent.setPackage("com.instagram.android");
                instagramIntent.putExtra("android.intent.extra.TEXT", "My #" + SaveAndShare.this.club + " jersey\nMake yours at\nAndroid: put package here\niOS: put package here");
                instagramIntent.putExtra("android.intent.extra.STREAM", shareUri);
                this.val$dialog.dismiss();
                try {
                    SaveAndShare.this.startActivity(instagramIntent);
                } catch (ActivityNotFoundException e2) {
                    Toast.makeText(SaveAndShare.this, "instagram have not been installed.", Toast.LENGTH_SHORT).show();
                    String appPackageName = "com.instagram.android";
                    try {
                        SaveAndShare.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.instagram.android")));
                    } catch (ActivityNotFoundException e3) {
                        SaveAndShare.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.instagram.android")));
                    }
                }
            }
        }

        /* renamed from: com.virtualproz.android.footballJerseyMaker.SaveAndShare.3.3 */
        class C04793 implements OnClickListener {
            final /* synthetic */ Dialog val$dialog;

            C04793(Dialog dialog) {
                this.val$dialog = dialog;
            }

            public void onClick(View view) {
                Bitmap image = SaveAndShare.this.shirt.getDrawingCache();
                File newDir = new File(Environment.getExternalStorageDirectory().toString() + "/saved_picture");
                newDir.mkdirs();
                File file = new File(newDir, "share.png");
                Uri shareUri = Uri.fromFile(file);
                System.err.print("Path of saved image." + file.getAbsolutePath());
                try {
                    FileOutputStream out = new FileOutputStream(file);
                    image.compress(CompressFormat.PNG, 90, out);
                    out.flush();
                    out.close();
                } catch (Exception e) {
                }
                Intent viberIntent = new Intent("android.intent.action.SEND");
                viberIntent.setType("image/*");
                viberIntent.setPackage("com.viber.voip");
                viberIntent.putExtra("android.intent.extra.TEXT", "My #" + SaveAndShare.this.club + " jersey\nMake yours at\nAndroid: put package here\niOS: put package here");
                viberIntent.putExtra("android.intent.extra.STREAM", shareUri);
                this.val$dialog.dismiss();
                try {
                    SaveAndShare.this.startActivity(viberIntent);
                } catch (ActivityNotFoundException e2) {
                    Toast.makeText(SaveAndShare.this, "viber have not been installed.", Toast.LENGTH_SHORT).show();
                    String appPackageName = "com.viber.voip";
                    try {
                        SaveAndShare.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.viber.voip")));
                    } catch (ActivityNotFoundException e3) {
                        SaveAndShare.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.viber.voip")));
                    }
                }
            }
        }
        /* renamed from: com.virtualproz.android.footballJerseyMaker.SaveAndShare.3.4 */
        class C04804 implements OnClickListener {
            final /* synthetic */ Dialog val$dialog;

            C04804(Dialog dialog) {
                this.val$dialog = dialog;
            }

            public void onClick(View view) {
                Bitmap image = SaveAndShare.this.shirt.getDrawingCache();
                File newDir = new File(Environment.getExternalStorageDirectory().toString() + "/saved_picture");
                newDir.mkdirs();
                File file = new File(newDir, "share.png");
                Uri shareUri = Uri.fromFile(file);
                System.err.print("Path of saved image." + file.getAbsolutePath());
                try {
                    FileOutputStream out = new FileOutputStream(file);
                    image.compress(CompressFormat.PNG, 90, out);
                    out.flush();
                    out.close();
                } catch (Exception e) {
                }
                Intent whatsappIntent = new Intent("android.intent.action.SEND");
                whatsappIntent.setType("image/*");
                whatsappIntent.setPackage("com.whatsapp");
                whatsappIntent.putExtra("android.intent.extra.TEXT", "My #" + SaveAndShare.this.club + " jersey\nMake yours at\nAndroid: put package here\niOS: put package here");
                whatsappIntent.putExtra("android.intent.extra.STREAM", shareUri);
                this.val$dialog.dismiss();
                try {
                    SaveAndShare.this.startActivity(whatsappIntent);
                } catch (ActivityNotFoundException e2) {
                    Toast.makeText(SaveAndShare.this, "Whatsapp have not been installed.", Toast.LENGTH_SHORT).show();
                    String appPackageName = "com.whatsapp";
                    try {
                        SaveAndShare.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.whatsapp")));
                    } catch (ActivityNotFoundException e3) {
                        SaveAndShare.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.whatsapp")));
                    }
                }
            }
        }

        /* renamed from: com.virtualproz.android.footballJerseyMaker.SaveAndShare.3.5 */
        class C04815 implements OnClickListener {
            final /* synthetic */ Dialog val$dialog;

            C04815(Dialog dialog) {
                this.val$dialog = dialog;
            }

            public void onClick(View view) {
                Bitmap image = SaveAndShare.this.shirt.getDrawingCache();
                File newDir = new File(Environment.getExternalStorageDirectory().toString() + "/saved_picture");
                newDir.mkdirs();
                File file = new File(newDir, "share.png");
                Uri shareUri = Uri.fromFile(file);
                System.err.print("Path of saved image." + file.getAbsolutePath());
                try {
                    FileOutputStream out = new FileOutputStream(file);
                    image.compress(CompressFormat.PNG, 90, out);
                    out.flush();
                    out.close();
                } catch (Exception e) {
                }
                Intent whatsappIntent = new Intent("android.intent.action.SEND");
                whatsappIntent.setType("image/*");
                whatsappIntent.setPackage("com.facebook.katana");
                whatsappIntent.putExtra("android.intent.extra.TEXT", "My #" + SaveAndShare.this.club + " jersey\nMake yours at\nAndroid: put package here\niOS: put package here");
                whatsappIntent.putExtra("android.intent.extra.STREAM", shareUri);
                this.val$dialog.dismiss();
                try {
                    SaveAndShare.this.startActivity(whatsappIntent);
                } catch (ActivityNotFoundException e2) {
                    Toast.makeText(SaveAndShare.this, "Facebook have not been installed.", Toast.LENGTH_SHORT).show();
                    String appPackageName = "com.facebook.katana";
                    try {
                        SaveAndShare.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.facebook.katana")));
                    } catch (ActivityNotFoundException e3) {
                        SaveAndShare.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.facebook.katana")));
                    }
                }
            }
        }
        /* renamed from: com.virtualproz.android.footballJerseyMaker.SaveAndShare.3.6 */
        class C04826 implements OnClickListener {
            final /* synthetic */ Dialog val$dialog;

            C04826(Dialog dialog) {
                this.val$dialog = dialog;
            }

            public void onClick(View view) {
                Bitmap image = SaveAndShare.this.shirt.getDrawingCache();
                File newDir = new File(Environment.getExternalStorageDirectory().toString() + "/saved_picture");
                newDir.mkdirs();
                File file = new File(newDir, "share.png");
                Uri shareUri = Uri.fromFile(file);
                System.err.print("Path of saved image." + file.getAbsolutePath());
                try {
                    FileOutputStream out = new FileOutputStream(file);
                    image.compress(CompressFormat.PNG, 90, out);
                    out.flush();
                    out.close();
                } catch (Exception e) {
                }
                Intent whatsappIntent = new Intent("android.intent.action.SEND");
                whatsappIntent.setType("image/*");
                whatsappIntent.setPackage("com.twitter.android");
                whatsappIntent.putExtra("android.intent.extra.TEXT", "My #" + SaveAndShare.this.club + " jersey\nMake yours at\nAndroid: put package here\niOS: put package here");
                whatsappIntent.putExtra("android.intent.extra.STREAM", shareUri);
                this.val$dialog.dismiss();
                try {
                    SaveAndShare.this.startActivity(whatsappIntent);
                } catch (ActivityNotFoundException e2) {
                    Toast.makeText(SaveAndShare.this, "Twitter have not been installed.", Toast.LENGTH_SHORT).show();
                    String appPackageName = "com.twitter.android";
                    try {
                        SaveAndShare.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("market://details?id=com.twitter.android")));
                    } catch (ActivityNotFoundException e3) {
                        SaveAndShare.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://play.google.com/store/apps/details?id=com.twitter.android")));
                    }
                }
            }
        }

        /* renamed from: com.virtualproz.android.footballJerseyMaker.SaveAndShare.3.7 */
        class C04837 implements OnClickListener {
            final /* synthetic */ Dialog val$dialog;

            C04837(Dialog dialog) {
                this.val$dialog = dialog;
            }

            public void onClick(View view) {
                this.val$dialog.dismiss();
            }
        }

        C04843() {
        }

        public void onClick(View view) {
            /*Dialog dialog = new Dialog(SaveAndShare.this.context);
            dialog.setContentView(R.layout.coustom_dialog);
            dialog.setTitle("Share with");
            Button dialogButton = (Button) dialog.findViewById(R.id.dialogButtonCancle);
            ImageView facebook = (ImageView) dialog.findViewById(R.id.facebook);
            ImageView twitter = (ImageView) dialog.findViewById(R.id.twitter);
            ImageView whatsapp = (ImageView) dialog.findViewById(R.id.whatsapp);
            ImageView instagram = (ImageView) dialog.findViewById(R.id.instagram);
            ImageView viber = (ImageView) dialog.findViewById(R.id.viber);
            ((ImageView) dialog.findViewById(R.id.gmail)).setOnClickListener(new C04771(dialog));
            instagram.setOnClickListener(new C04782(dialog));
            viber.setOnClickListener(new C04793(dialog));
            whatsapp.setOnClickListener(new C04804(dialog));
            facebook.setOnClickListener(new C04815(dialog));
            twitter.setOnClickListener(new C04826(dialog));
            dialogButton.setOnClickListener(new C04837(dialog));
            dialog.show();*/


            String appURL = "https://play.google.com/store/apps/details?id=";
            Intent sharingIntent = new Intent(Intent.ACTION_SEND);
            sharingIntent.setType("image/*");
            sharingIntent.putExtra("android.intent.extra.TEXT", getResources().getString(R.string.app_name) + ":  " + appURL + getPackageName());
            Log.e("App URL", appURL + getPackageName());
            sharingIntent.putExtra(Intent.EXTRA_STREAM, uri);
            startActivity(Intent.createChooser(sharingIntent, "Share Wallpaper using"));
            MainActivity.ads.showInterstitial(false);

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
        this.share.setOnClickListener(new C04843());
        RelativeLayout adView = (RelativeLayout)findViewById(R.id.adViewCon);
        MainActivity.ads.loadBanner(adView);
    }
}
