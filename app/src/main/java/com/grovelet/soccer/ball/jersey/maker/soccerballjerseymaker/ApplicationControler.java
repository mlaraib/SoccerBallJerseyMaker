package com.grovelet.soccer.ball.jersey.maker.soccerballjerseymaker;

/**
 * Created by iamla on 10/27/2016.
 */
import android.app.Application;
import uk.co.chrisjenx.calligraphy.R;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig;
import uk.co.chrisjenx.calligraphy.CalligraphyConfig.Builder;

public class ApplicationControler extends Application {
    public void onCreate() {
        super.onCreate();
        CalligraphyConfig.initDefault(new Builder().setDefaultFontPath("fonts/font.ttf").setFontAttrId(R.attr.fontPath).build());
    }
}
