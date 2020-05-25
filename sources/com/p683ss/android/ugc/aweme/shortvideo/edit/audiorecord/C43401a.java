package com.p683ss.android.ugc.aweme.shortvideo.edit.audiorecord;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.view.View;
import com.p683ss.android.ugc.aweme.audiorecord.Point;
import com.ss.android.ugc.trill.R;
import java.util.Stack;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.audiorecord.a */
public final class C43401a extends View {

    /* renamed from: a */
    final float f109714a;

    /* renamed from: b */
    int f109715b = -1;

    /* renamed from: c */
    Paint f109716c = new Paint();

    /* renamed from: d */
    int f109717d = 1;

    /* renamed from: e */
    float f109718e = 1.0f;

    /* renamed from: f */
    private final Stack<Point> f109719f = new Stack<>();

    public final int getCoverColor() {
        return this.f109715b;
    }

    public final int getMMax() {
        return this.f109717d;
    }

    public final Paint getMPaint() {
        return this.f109716c;
    }

    public final Stack<Point> getMStack() {
        return this.f109719f;
    }

    public final float getPADDING_BORDER() {
        return this.f109714a;
    }

    public final float getPadding() {
        return this.f109718e;
    }

    public final void setCoverColor(int i) {
        this.f109715b = i;
    }

    public final void setMMax(int i) {
        this.f109717d = i;
    }

    public final void setPadding(float f) {
        this.f109718e = f;
    }

    public final void setMPaint(Paint paint) {
        C52711k.m112240b(paint, "<set-?>");
        this.f109716c = paint;
    }

    public C43401a(Context context) {
        C52711k.m112240b(context, "mContext");
        super(context);
        setBackgroundResource(R.drawable.j5);
    }

    /* access modifiers changed from: protected */
    public final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        for (Point point : this.f109719f) {
            double x = (double) point.getX();
            double d = (double) this.f109717d;
            Double.isNaN(x);
            Double.isNaN(d);
            double d2 = x / d;
            double width = (double) getWidth();
            Double.isNaN(width);
            float f = (float) (d2 * width);
            double y = (double) point.getY();
            double d3 = (double) this.f109717d;
            Double.isNaN(y);
            Double.isNaN(d3);
            double d4 = y / d3;
            double width2 = (double) getWidth();
            Double.isNaN(width2);
            float f2 = (float) (d4 * width2);
            if (canvas != null) {
                canvas.drawRect(f, 0.0f, f2, (float) getHeight(), this.f109716c);
            }
        }
    }
}
