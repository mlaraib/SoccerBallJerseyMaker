package com.sofittech.soccerballjerseymaker;

import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.design.widget.NavigationView.OnNavigationItemSelectedListener;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.view.Gravity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
//import com.google.android.gms.ads.AdRequest.Builder;
//import com.google.android.gms.ads.AdView;
//import com.google.android.gms.ads.MobileAds;
import uk.co.chrisjenx.calligraphy.BuildConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyContextWrapper;

public class DashbordActivity extends AppCompatActivity implements OnNavigationItemSelectedListener {
    private static final String ADMOB_APP_ID = "ca-app-pub-6821511760429001~2285656777";
    public static final float BIG_SCALE = 1.0f;
    public static final float DIFF_SCALE = 0.19999999f;
    public static final int FIRST_PAGE = 10;
    public static final int LOOPS = 10;
    public static final int PAGES = 10;
    public static final float SMALL_SCALE = 0.8f;
    public static int countryNumber;
    public static Bitmap image;
    public static String name;
    public static String number;
    public MyPagerAdapter adapter;
    LinearLayout lastPressed;
    public ViewPager pager;
    Typeface typeface;

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.10 */
    class AnonymousClass10 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Chile;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass10(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Chile = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 8;
            this.val$countryName.setText("Chile");
//            this.val$Chile.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Chile;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.11 */
    class AnonymousClass11 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Colombia;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass11(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Colombia = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 9;
            this.val$countryName.setText("Colombia");
            //this.val$Colombia.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
            //DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Colombia;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.12 */
    class AnonymousClass12 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Costa_rica;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass12(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Costa_rica = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = DashbordActivity.PAGES;
            this.val$countryName.setText("Costa Rica");
           // this.val$Costa_rica.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
         //   DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Costa_rica;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.13 */
    class AnonymousClass13 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Czech_Republic;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass13(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Czech_Republic = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 11;
            this.val$countryName.setText("Czech Republic");
     //       this.val$Czech_Republic.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
       //     DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Czech_Republic;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.14 */
    class AnonymousClass14 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Denmark;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass14(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Denmark = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 12;
            this.val$countryName.setText("Denmark");
 //           this.val$Denmark.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
   //         DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Denmark;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.15 */
    class AnonymousClass15 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Ecuador;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass15(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Ecuador = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 13;
            this.val$countryName.setText("Ecuador");
//            this.val$Ecuador.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
 //           DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Ecuador;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.16 */
    class AnonymousClass16 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Egypt;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass16(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Egypt = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 14;
            this.val$countryName.setText("Egypt");
//            this.val$Egypt.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
 //           DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Egypt;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.17 */
    class AnonymousClass17 implements OnClickListener {
        final /* synthetic */ LinearLayout val$England;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass17(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$England = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 15;
            this.val$countryName.setText("England");
//            this.val$England.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//          DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$England;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.18 */
    class AnonymousClass18 implements OnClickListener {
        final /* synthetic */ LinearLayout val$France;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass18(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$France = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 16;
            this.val$countryName.setText("France");
//            this.val$France.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$France;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.19 */
    class AnonymousClass19 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Germany;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass19(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Germany = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 17;
            this.val$countryName.setText("Germany");
//            this.val$Germany.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Germany;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.1 */
    class C04641 implements OnClickListener {
        C04641() {
        }

        public void onClick(View view) {
            RelativeLayout relativeLayout = (RelativeLayout) DashbordActivity.this.adapter.getRootView(DashbordActivity.this.pager.getCurrentItem()).getChildAt(1);
            String clubName = ((String[]) Utils.getClubs().get(Integer.valueOf(DashbordActivity.countryNumber)))[DashbordActivity.this.pager.getCurrentItem()].replace(" ", BuildConfig.FLAVOR);
            relativeLayout.setDrawingCacheEnabled(true);
            DashbordActivity.image = relativeLayout.getDrawingCache();
            Intent intent = new Intent(DashbordActivity.this, SaveAndShare.class);
            intent.putExtra("club", clubName);
            DashbordActivity.this.startActivity(intent);
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.20 */
    class AnonymousClass20 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Indonasia;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass20(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Indonasia = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 18;
            this.val$countryName.setText("Indonasia");
//            this.val$Indonasia.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Indonasia;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.21 */
    class AnonymousClass21 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Italy;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass21(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Italy = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 19;
            this.val$countryName.setText("Italy");
//            this.val$Italy.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Italy;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.22 */
    class AnonymousClass22 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Malaysia;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass22(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Malaysia = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 20;
            this.val$countryName.setText("Malaysia");
//            this.val$Malaysia.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Malaysia;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.23 */
    class AnonymousClass23 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Mexico;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass23(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Mexico = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 21;
            this.val$countryName.setText("Mexico");
//            this.val$Mexico.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Mexico;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.24 */
    class AnonymousClass24 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Netherland;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass24(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Netherland = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 22;
            this.val$countryName.setText("Netherlands");
//            this.val$Netherland.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Netherland;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.25 */
    class AnonymousClass25 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Nigeria;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass25(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Nigeria = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 23;
            this.val$countryName.setText("Nigeria");
//            this.val$Nigeria.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Nigeria;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.26 */
    class AnonymousClass26 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Peru;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass26(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Peru = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 24;
            this.val$countryName.setText("Peru");
//            this.val$Peru.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Peru;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.27 */
    class AnonymousClass27 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Poland;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass27(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Poland = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 25;
            this.val$countryName.setText("Poland");
//            this.val$Poland.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Poland;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.28 */
    class AnonymousClass28 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Portugal;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass28(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Portugal = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 26;
            this.val$countryName.setText("Portugal");
//            this.val$Portugal.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Portugal;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.29 */
    class AnonymousClass29 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Russia;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass29(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Russia = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 27;
            this.val$countryName.setText("Russia");
//            this.val$Russia.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Russia;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.2 */
    class C04652 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Algeria;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        C04652(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Algeria = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 0;
            this.val$countryName.setText("Algeria");
//            this.val$Algeria.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Algeria;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.30 */
    class AnonymousClass30 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Saudia_Arabia;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass30(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Saudia_Arabia = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 28;
            this.val$countryName.setText("Saudia Arabia");
//            this.val$Saudia_Arabia.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Saudia_Arabia;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.31 */
    class AnonymousClass31 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Spain;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass31(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Spain = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 29;
            this.val$countryName.setText("Spain");
//            this.val$Spain.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Spain;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.32 */
    class AnonymousClass32 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Sweden;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass32(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Sweden = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 30;
            this.val$countryName.setText("Sweden");
//            this.val$Sweden.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Sweden;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.33 */
    class AnonymousClass33 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Switzerland;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass33(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Switzerland = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 31;
            this.val$countryName.setText("Switzerland");
//            this.val$Switzerland.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Switzerland;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.34 */
    class AnonymousClass34 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Turkey;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass34(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Turkey = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 32;
            this.val$countryName.setText("Turkey");
//            this.val$Turkey.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Turkey;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.35 */
    class AnonymousClass35 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Uruguay;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass35(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Uruguay = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 33;
            this.val$countryName.setText("Uruguay");
//            this.val$Uruguay.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Uruguay;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.36 */
    class AnonymousClass36 implements OnClickListener {
        final /* synthetic */ LinearLayout val$USA;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass36(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$USA = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 34;
            this.val$countryName.setText("USA");
//            this.val$USA.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$USA;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.37 */
    class AnonymousClass37 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Venezuela;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass37(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Venezuela = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 35;
            this.val$countryName.setText("Venezuela");
//            this.val$Venezuela.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Venezuela;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.38 */
    class AnonymousClass38 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Wales;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass38(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Wales = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 36;
            this.val$countryName.setText("Wales");
//            this.val$Wales.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Wales;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.39 */
    class AnonymousClass39 implements OnClickListener {
        final /* synthetic */ DrawerLayout val$drawer;

        AnonymousClass39(DrawerLayout drawerLayout) {
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            this.val$drawer.openDrawer(GravityCompat.START);
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.3 */
    class C04663 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Argentina;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        C04663(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Argentina = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 1;
            this.val$countryName.setText("Argentina");
//            this.val$Argentina.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Argentina;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.4 */
    class C04674 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Australia;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        C04674(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Australia = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 2;
            this.val$countryName.setText("Australia");
//            this.val$Australia.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Australia;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.5 */
    class C04685 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Austria;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        C04685(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Austria = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 3;
            this.val$countryName.setText("Austria");
//            this.val$Austria.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Austria;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.6 */
    class C04696 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Belgium;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        C04696(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Belgium = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 4;
            this.val$countryName.setText("Belgium");
//            this.val$Belgium.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Belgium;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.7 */
    class C04707 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Bolivia;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        C04707(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Bolivia = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 5;
            this.val$countryName.setText("Bolivia");
//            this.val$Bolivia.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Bolivia;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.8 */
    class C04718 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Bosnia;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        C04718(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Bosnia = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 6;
            this.val$countryName.setText("Bosnia");
//            this.val$Bosnia.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Bosnia;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    /* renamed from: com.virtualproz.android.footballJerseyMaker.DashbordActivity.9 */
    class C04729 implements OnClickListener {
        final /* synthetic */ LinearLayout val$Brazil;
        final /* synthetic */ TextView val$countryName;
        final /* synthetic */ DrawerLayout val$drawer;

        C04729(TextView textView, LinearLayout linearLayout, DrawerLayout drawerLayout) {
            this.val$countryName = textView;
            this.val$Brazil = linearLayout;
            this.val$drawer = drawerLayout;
        }

        public void onClick(View view) {
            DashbordActivity.countryNumber = 7;
            this.val$countryName.setText("Brazil");
//            this.val$Brazil.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.pressedColor));
//            DashbordActivity.this.lastPressed.setBackgroundColor(DashbordActivity.this.getResources().getColor(R.color.normalColor));
            DashbordActivity.this.lastPressed = this.val$Brazil;
            this.val$drawer.closeDrawer(Gravity.LEFT);
            DashbordActivity.this.adapter.notifyDataSetChanged();
        }
    }

    public DashbordActivity() {
        this.lastPressed = null;
    }

    static {
        countryNumber = 0;
        image = null;
        name = BuildConfig.FLAVOR;
        number = BuildConfig.FLAVOR;
    }

    protected void attachBaseContext(Context newBase) {
        super.attachBaseContext(CalligraphyContextWrapper.wrap(newBase));
    }

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dashbord);
//        MobileAds.initialize(getApplicationContext(), ADMOB_APP_ID);
//        ((AdView) findViewById(R.id.adView)).loadAd(new Builder().addTestDevice("021F550555EC3D8416F14C0A6E2B295F").build());
        try {
            name = getIntent().getExtras().getString("name");
            number = getIntent().getExtras().getString("number");
        } catch (Exception e) {
            e.printStackTrace();
        }
        setMyAdapter();
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle actionBarDrawerToggle = new ActionBarDrawerToggle(this, drawer, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(actionBarDrawerToggle);
        actionBarDrawerToggle.syncState();
        ((NavigationView) findViewById(R.id.nav_view)).setNavigationItemSelectedListener(this);
        if (Utils.isFristTime == 0) {
            drawer.openDrawer(Gravity.LEFT);
        }
        Utils.isFristTime = 1;
        ((Button) findViewById(R.id.btnNext)).setOnClickListener(new C04641());
        LinearLayout Algeria = (LinearLayout) findViewById(R.id.Algeria);
        this.lastPressed = Algeria;
        LinearLayout Argentina = (LinearLayout) findViewById(R.id.Argentina);
        LinearLayout Australia = (LinearLayout) findViewById(R.id.Australia);
        LinearLayout Austria = (LinearLayout) findViewById(R.id.Austria);
        LinearLayout Belgium = (LinearLayout) findViewById(R.id.Belgium);
        LinearLayout Bolivia = (LinearLayout) findViewById(R.id.Bolivia);
        LinearLayout Bosnia = (LinearLayout) findViewById(R.id.Bosnia);
        LinearLayout Brazil = (LinearLayout) findViewById(R.id.Brazil);
        LinearLayout Chile = (LinearLayout) findViewById(R.id.Chile);
        LinearLayout Colombia = (LinearLayout) findViewById(R.id.Colombia);
        LinearLayout Costa_rica = (LinearLayout) findViewById(R.id.Costa_rica);
        LinearLayout Czech_Republic = (LinearLayout) findViewById(R.id.Czech_Republic);
        LinearLayout Denmark = (LinearLayout) findViewById(R.id.Denmark);
        LinearLayout Ecuador = (LinearLayout) findViewById(R.id.Ecuador);
        LinearLayout Egypt = (LinearLayout) findViewById(R.id.Egypt);
        LinearLayout England = (LinearLayout) findViewById(R.id.England);
        LinearLayout France = (LinearLayout) findViewById(R.id.France);
        LinearLayout Germany = (LinearLayout) findViewById(R.id.Germany);
        LinearLayout Indonasia = (LinearLayout) findViewById(R.id.Indonesia);
        LinearLayout Italy = (LinearLayout) findViewById(R.id.Italy);
        LinearLayout Malaysia = (LinearLayout) findViewById(R.id.Malaysia);
        LinearLayout Mexico = (LinearLayout) findViewById(R.id.Mexico);
        LinearLayout Netherland = (LinearLayout) findViewById(R.id.Netherlands);
        LinearLayout Nigeria = (LinearLayout) findViewById(R.id.Nigeria);
        LinearLayout Peru = (LinearLayout) findViewById(R.id.Peru);
        LinearLayout Poland = (LinearLayout) findViewById(R.id.Poland);
        LinearLayout Portugal = (LinearLayout) findViewById(R.id.Portugal);
        LinearLayout Russia = (LinearLayout) findViewById(R.id.Russia);
        LinearLayout Saudia_Arabia = (LinearLayout) findViewById(R.id.Saudia_Arabia);
        LinearLayout Spain = (LinearLayout) findViewById(R.id.Spain);
        LinearLayout Sweden = (LinearLayout) findViewById(R.id.Sweden);
        LinearLayout Switzerland = (LinearLayout) findViewById(R.id.Switzerland);
        LinearLayout Turkey = (LinearLayout) findViewById(R.id.Turkey);
        LinearLayout Uruguay = (LinearLayout) findViewById(R.id.Uruguay);
        LinearLayout USA = (LinearLayout) findViewById(R.id.USA);
        LinearLayout Venezuela = (LinearLayout) findViewById(R.id.Venezuela);
        LinearLayout Wales = (LinearLayout) findViewById(R.id.Wales);
        TextView countryName = (TextView) findViewById(R.id.toobalcountryname);
        Algeria.setOnClickListener(new C04652(countryName, Algeria, drawer));
        Argentina.setOnClickListener(new C04663(countryName, Argentina, drawer));
        Australia.setOnClickListener(new C04674(countryName, Australia, drawer));
        Austria.setOnClickListener(new C04685(countryName, Austria, drawer));
        Belgium.setOnClickListener(new C04696(countryName, Belgium, drawer));
        Bolivia.setOnClickListener(new C04707(countryName, Bolivia, drawer));
        Bosnia.setOnClickListener(new C04718(countryName, Bosnia, drawer));
        Brazil.setOnClickListener(new C04729(countryName, Brazil, drawer));
        Chile.setOnClickListener(new AnonymousClass10(countryName, Chile, drawer));
        Colombia.setOnClickListener(new AnonymousClass11(countryName, Colombia, drawer));
        Costa_rica.setOnClickListener(new AnonymousClass12(countryName, Costa_rica, drawer));
        Czech_Republic.setOnClickListener(new AnonymousClass13(countryName, Czech_Republic, drawer));
        Denmark.setOnClickListener(new AnonymousClass14(countryName, Denmark, drawer));
        Ecuador.setOnClickListener(new AnonymousClass15(countryName, Ecuador, drawer));
        Egypt.setOnClickListener(new AnonymousClass16(countryName, Egypt, drawer));
        England.setOnClickListener(new AnonymousClass17(countryName, England, drawer));
        France.setOnClickListener(new AnonymousClass18(countryName, France, drawer));
        Germany.setOnClickListener(new AnonymousClass19(countryName, Germany, drawer));
        Indonasia.setOnClickListener(new AnonymousClass20(countryName, Indonasia, drawer));
        Italy.setOnClickListener(new AnonymousClass21(countryName, Italy, drawer));
        Malaysia.setOnClickListener(new AnonymousClass22(countryName, Malaysia, drawer));
        Mexico.setOnClickListener(new AnonymousClass23(countryName, Mexico, drawer));
        Netherland.setOnClickListener(new AnonymousClass24(countryName, Netherland, drawer));
        Nigeria.setOnClickListener(new AnonymousClass25(countryName, Nigeria, drawer));
        Peru.setOnClickListener(new AnonymousClass26(countryName, Peru, drawer));
        Poland.setOnClickListener(new AnonymousClass27(countryName, Poland, drawer));
        Portugal.setOnClickListener(new AnonymousClass28(countryName, Portugal, drawer));
        Russia.setOnClickListener(new AnonymousClass29(countryName, Russia, drawer));
        Saudia_Arabia.setOnClickListener(new AnonymousClass30(countryName, Saudia_Arabia, drawer));
        Spain.setOnClickListener(new AnonymousClass31(countryName, Spain, drawer));
        Sweden.setOnClickListener(new AnonymousClass32(countryName, Sweden, drawer));
        Switzerland.setOnClickListener(new AnonymousClass33(countryName, Switzerland, drawer));
        Turkey.setOnClickListener(new AnonymousClass34(countryName, Turkey, drawer));
        Uruguay.setOnClickListener(new AnonymousClass35(countryName, Uruguay, drawer));
        USA.setOnClickListener(new AnonymousClass36(countryName, USA, drawer));
        Venezuela.setOnClickListener(new AnonymousClass37(countryName, Venezuela, drawer));
        Wales.setOnClickListener(new AnonymousClass38(countryName, Wales, drawer));
        ((ImageView) findViewById(R.id.toolbarimage)).setOnClickListener(new AnonymousClass39(drawer));
    }

    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen((int) GravityCompat.START)) {
            drawer.closeDrawer((int) GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

//    public boolean onCreateOptionsMenu(Menu menu) {
//        getMenuInflater().inflate(R.menu.dashbord, menu);
//        return true;
//    }
//
//    public boolean onOptionsItemSelected(MenuItem item) {
//        if (item.getItemId() == R.id.action_settings) {
//            return true;
//        }
//        return super.onOptionsItemSelected(item);
//    }

    public boolean onNavigationItemSelected(MenuItem item) {
        int id = item.getItemId();
//        if (!(id == R.id.pakistan || id == R.id.nav_gallery || id == R.id.nav_slideshow || id != R.id.nav_manage)) {
//        }
        ((DrawerLayout) findViewById(R.id.drawer_layout)).closeDrawer((int) GravityCompat.START);
        return true;
    }

    public void setMyAdapter() {
        this.adapter = new MyPagerAdapter(this, getSupportFragmentManager());
        this.pager = (ViewPager) findViewById(R.id.myviewpager);
        this.pager.setAdapter(this.adapter);
        this.adapter.notifyDataSetChanged();
        this.pager.getAdapter().notifyDataSetChanged();
        this.pager.setOnPageChangeListener(this.adapter);
        this.pager.setCurrentItem(PAGES);
        this.pager.setOffscreenPageLimit(3);
        this.pager.setPageMargin(Integer.parseInt(getString(R.string.pagermargin)));
    }
}




