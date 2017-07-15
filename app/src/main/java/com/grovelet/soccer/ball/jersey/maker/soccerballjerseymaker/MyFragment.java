package com.grovelet.soccer.ball.jersey.maker.soccerballjerseymaker;

import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.nineoldandroids.view.ViewHelper;
import com.grovelet.soccer.ball.jersey.maker.soccerballjerseymaker.R;

import java.util.Locale;

public class MyFragment extends Fragment {
    Typeface typeface;

    public static Fragment newInstance(DashbordActivity context, int pos, float scale, boolean IsBlured) {
        Bundle b = new Bundle();
        b.putInt("pos", pos);
        b.putFloat("scale", scale);
        b.putBoolean("IsBlured", IsBlured);
        return Fragment.instantiate(context, MyFragment.class.getName(), b);
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        if (container == null) {
            return null;
        }
        this.typeface = Typeface.createFromAsset(getActivity().getApplicationContext().getAssets(), String.format(Locale.US, "fonts/%s", new Object[]{"font.ttf"}));
        LinearLayout l = (LinearLayout) inflater.inflate(R.layout.mf, container, false);
        int pos = getArguments().getInt("pos");
        ImageView clubShirt = (ImageView) l.findViewById(R.id.ClubShirt);
        ((TextView) l.findViewById(R.id.text)).setText(((String[]) Utils.getClubs().get(Integer.valueOf(DashbordActivity.countryNumber)))[pos]);
        clubShirt.setImageResource(((int[]) Utils.getShirts().get(Integer.valueOf(DashbordActivity.countryNumber)))[pos]);
        MyLinearLayout root = (MyLinearLayout) l.findViewById(R.id.root);
        TextView name = (TextView) l.findViewById(R.id.name);
        TextView number = (TextView) l.findViewById(R.id.number);
        name.setTypeface(this.typeface);
        number.setTypeface(this.typeface);
        number.setTextColor(((int[]) Utils.getColors().get(Integer.valueOf(DashbordActivity.countryNumber)))[pos]);
        name.setTextColor(((int[]) Utils.getColors().get(Integer.valueOf(DashbordActivity.countryNumber)))[pos]);
        name.setText(DashbordActivity.name);
        number.setText(DashbordActivity.number);
        root.setScaleBoth(getArguments().getFloat("scale"));
        if (!getArguments().getBoolean("IsBlured")) {
            return l;
        }
        ViewHelper.setAlpha(root, MyPagerAdapter.getMinAlpha());
        ViewHelper.setRotationY(root, MyPagerAdapter.getMinDegree());
        return l;
    }
}
