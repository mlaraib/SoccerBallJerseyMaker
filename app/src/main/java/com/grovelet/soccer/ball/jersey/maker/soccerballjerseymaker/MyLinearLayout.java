package com.grovelet.soccer.ball.jersey.maker.soccerballjerseymaker;

/**
 * Created by iamla on 10/27/2016.
 */
import android.content.Context;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.widget.LinearLayout;

public class MyLinearLayout extends LinearLayout {
    private float scale;

    public MyLinearLayout(Context context, AttributeSet attrs) {
        super(context, attrs);
        this.scale = DashbordActivity.BIG_SCALE;
    }

    public MyLinearLayout(Context context) {
        super(context);
        this.scale = DashbordActivity.BIG_SCALE;
    }

    public void setScaleBoth(float scale) {
        this.scale = scale;
        invalidate();
    }

    protected void onDraw(Canvas canvas) {
        canvas.scale(this.scale, this.scale, (float) (getWidth() / 2), (float) (getHeight() / 2));
        super.onDraw(canvas);
    }
}

