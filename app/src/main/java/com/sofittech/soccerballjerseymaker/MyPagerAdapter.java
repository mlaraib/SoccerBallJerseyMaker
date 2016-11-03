package com.sofittech.soccerballjerseymaker;

/**
 * Created by iamla on 10/27/2016.
 */

import android.net.Uri;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.ViewPager.OnPageChangeListener;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;

import com.nineoldandroids.view.ViewHelper;


public class MyPagerAdapter extends FragmentPagerAdapter implements OnPageChangeListener {
    private static float maxAlpha;
    private static float minAlpha;
    private static float minDegree;
    private boolean IsBlured;
    private DashbordActivity context;
    private int counter;
    private MyLinearLayout cur;
    private FragmentManager fm;
    private int lastPage;
    private MyLinearLayout next;
    View view;
    private MyLinearLayout nextnext;
    private Uri personUri;
    private MyLinearLayout prev;
    private MyLinearLayout prevprev;
    private float scale;
    private boolean swipedLeft;

    public Object instantiateItem(ViewGroup container, int position) {
        return super.instantiateItem(container, position);
    }

    static {
        minAlpha = 0.6f;
        maxAlpha = DashbordActivity.BIG_SCALE;
        minDegree = 60.0f;
    }

    public static float getMinDegree() {
        return minDegree;
    }

    public static float getMinAlpha() {
        return minAlpha;
    }

    public static float getMaxAlpha() {
        return maxAlpha;
    }

    public MyPagerAdapter(DashbordActivity context, FragmentManager fm) {
        super(fm);
        this.swipedLeft = false;
        this.lastPage = 10;
        this.cur = null;
        this.next = null;
        this.prev = null;
        this.prevprev = null;
        this.nextnext = null;
        this.counter = 0;
        this.fm = fm;
        this.context = context;
    }

    public long getItemId(int position) {
        return super.getItemId(position);
    }

    public int getItemPosition(Object object) {
        return -2;
    }

    public Fragment getItem(int position) {
        if (position == 10) {
            this.scale = DashbordActivity.BIG_SCALE;
        } else {
            this.scale = DashbordActivity.SMALL_SCALE;
            this.IsBlured = true;
        }
        Log.d("position", String.valueOf(position));
        MyFragment myFragment = new MyFragment();
        Fragment curFragment = MyFragment.newInstance(this.context, position, this.scale, this.IsBlured);
        this.cur = getRootView(position);
        this.next = getRootView(position + 1);
        this.prev = getRootView(position - 1);
        return curFragment;

    }

    public int getCount() {
        return Utils.count[DashbordActivity.countryNumber];
    }

    public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {
        if (positionOffset >= 0.0f && positionOffset <= DashbordActivity.BIG_SCALE) {
            positionOffset *= positionOffset;
            this.cur = getRootView(position);
            this.next = getRootView(position + 1);
            this.prev = getRootView(position - 1);
            this.nextnext = getRootView(position + 2);

//            ViewHelper.setAlpha(this.cur, maxAlpha - (0.5f * positionOffset));
//            ViewHelper.setAlpha(this.next, minAlpha + (0.5f * positionOffset));
//            ViewHelper.setAlpha(this.prev, minAlpha + (0.5f * positionOffset));
            if (this.nextnext != null) {
                ViewHelper.setAlpha(this.nextnext, minAlpha);
                ViewHelper.setRotationY(this.nextnext, -minDegree);
            }
            if (this.cur != null) {
                this.cur.setScaleBoth(DashbordActivity.BIG_SCALE - (DashbordActivity.DIFF_SCALE * positionOffset));
                ViewHelper.setRotationY(this.cur, 0.0f);
            }
            if (this.next != null) {
                this.next.setScaleBoth(DashbordActivity.SMALL_SCALE + (DashbordActivity.DIFF_SCALE * positionOffset));
                ViewHelper.setRotationY(this.next, -minDegree);
            }
            if (this.prev != null) {
                ViewHelper.setRotationY(this.prev, minDegree);
            }
            if (this.swipedLeft) {
                if (this.next != null) {
                    ViewHelper.setRotationY(this.next, (-minDegree) + (minDegree * positionOffset));
                }
                if (this.cur != null) {
                    ViewHelper.setRotationY(this.cur, (minDegree * positionOffset) + 0.0f);
                }
            } else {
                if (this.next != null) {
                    ViewHelper.setRotationY(this.next, (-minDegree) + (minDegree * positionOffset));
                }
                if (this.cur != null) {
                    ViewHelper.setRotationY(this.cur, (minDegree * positionOffset) + 0.0f);
                }
            }
        }
        if (positionOffset >= DashbordActivity.BIG_SCALE) {
            ViewHelper.setAlpha(this.cur, maxAlpha);
        }
    }

    public void onPageSelected(int position) {
        if (this.lastPage <= position) {
            this.swipedLeft = true;
        } else if (this.lastPage > position) {
            this.swipedLeft = false;
        }
        this.lastPage = position;
    }

    public void onPageScrollStateChanged(int state) {
    }

    public void notifyDataSetChanged() {
        super.notifyDataSetChanged();
    }

    public MyLinearLayout getRootView(int position) {
        try {
            MyLinearLayout ly = (MyLinearLayout) this.fm.findFragmentByTag(getFragmentTag(position)).getView().findViewById(R.id.root);
            if (ly != null) {
                return ly;
            }
            return null;
        } catch (Exception e) {
            return null;
        }
    }

    private String getFragmentTag(int position) {
        return "android:switcher:" + this.context.pager.getId() + ":" + position;
    }
}