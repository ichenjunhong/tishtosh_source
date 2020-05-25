package com.bytedance.android.livesdk.gift.relay.view;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.Cap;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.widget.FrameLayout;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;

public class CountDownAnimationView extends FrameLayout {

    /* renamed from: a */
    private float f21050a;

    /* renamed from: b */
    private float f21051b;

    /* renamed from: c */
    private float f21052c;

    /* renamed from: d */
    private Paint f21053d;

    /* renamed from: e */
    private RectF f21054e;

    /* renamed from: f */
    private LinearGradient f21055f;

    /* renamed from: g */
    private float f21056g;

    /* renamed from: h */
    private int f21057h;

    /* renamed from: i */
    private TextView f21058i;

    public CountDownAnimationView(Context context) {
        this(context, null);
    }

    public void setCountDownTime(int i) {
        this.f21057h = i;
        setTime(this.f21057h);
    }

    public void setProgress(float f) {
        this.f21056g = f;
        invalidate();
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        canvas.drawArc(this.f21054e, -90.0f, -this.f21056g, false, this.f21053d);
    }

    public void setTime(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(i));
        sb.append(" ");
        this.f21058i.setText(sb.toString());
    }

    public CountDownAnimationView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public CountDownAnimationView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        LayoutInflater.from(getContext()).inflate(R.layout.akz, this);
        this.f21050a = getResources().getDimension(R.dimen.pz);
        this.f21051b = getResources().getDimension(R.dimen.py);
        this.f21052c = getResources().getDimension(R.dimen.q1);
        this.f21053d = new Paint();
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f21050a, this.f21051b, getResources().getColor(R.color.af9), getResources().getColor(R.color.af8), TileMode.CLAMP);
        this.f21055f = linearGradient;
        this.f21053d.setAntiAlias(true);
        this.f21053d.setShader(this.f21055f);
        this.f21053d.setStyle(Style.STROKE);
        this.f21053d.setStrokeCap(Cap.ROUND);
        this.f21053d.setStrokeWidth(this.f21052c);
        float f = this.f21052c / 2.0f;
        this.f21054e = new RectF(f, f, this.f21050a - f, this.f21051b - f);
        this.f21058i = (TextView) findViewById(R.id.a17);
        setWillNotDraw(false);
    }
}
