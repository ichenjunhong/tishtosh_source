package com.p683ss.android.ugc.aweme.shortvideo.cutmusic;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.shortvideo.cutmusic.C43191e.C43193b;
import com.ss.android.ugc.trill.R;
import java.util.Arrays;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cutmusic.b */
public final class C43187b {

    /* renamed from: a */
    public int f109203a;

    /* renamed from: b */
    int f109204b;

    /* renamed from: c */
    int f109205c;

    /* renamed from: d */
    public int f109206d;

    /* renamed from: e */
    int f109207e;

    /* renamed from: f */
    public float[] f109208f = new float[0];

    /* renamed from: g */
    public boolean f109209g = true;

    /* renamed from: h */
    private int f109210h;

    /* renamed from: i */
    private Paint f109211i;

    /* renamed from: j */
    private int f109212j = -1;

    /* renamed from: k */
    private Paint f109213k;

    public C43187b() {
    }

    /* renamed from: a */
    public final void mo87789a(int i) {
        this.f109212j = i;
        Paint paint = this.f109211i;
        if (paint == null) {
            C52711k.m112237a("mPaint");
        }
        paint.setColor(i);
    }

    public C43187b(Context context) {
        C52711k.m112240b(context, "context");
        mo87791a(context);
    }

    /* renamed from: a */
    public final void mo87793a(float[] fArr) {
        if (C43193b.m94756a(fArr)) {
            if (fArr == null) {
                C52711k.m112234a();
            }
            float[] copyOf = Arrays.copyOf(fArr, fArr.length);
            C52711k.m112236a((Object) copyOf, "java.util.Arrays.copyOf(this, size)");
            this.f109208f = copyOf;
        }
    }

    /* renamed from: a */
    public final void mo87792a(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        if (this.f109209g) {
            float f = (float) ((this.f109205c / 2) + this.f109206d);
            float f2 = (float) this.f109210h;
            float f3 = (float) ((this.f109205c / 2) + this.f109206d);
            Paint paint = this.f109213k;
            if (paint == null) {
                C52711k.m112237a("centerLinePaint");
            }
            canvas.drawLine(0.0f, f, f2, f3, paint);
        }
        int length = this.f109208f.length;
        for (int i = 0; i < length; i++) {
            int i2 = (int) (this.f109208f[i] * ((float) this.f109205c));
            int i3 = ((this.f109204b + this.f109203a) * i) + this.f109203a;
            int i4 = ((this.f109205c - i2) / 2) + this.f109206d;
            RectF rectF = new RectF((float) i3, (float) i4, (float) (this.f109204b + i3), (float) (i2 + i4));
            float f4 = (float) this.f109207e;
            float f5 = (float) this.f109207e;
            Paint paint2 = this.f109211i;
            if (paint2 == null) {
                C52711k.m112237a("mPaint");
            }
            canvas.drawRoundRect(rectF, f4, f5, paint2);
        }
    }

    /* renamed from: a */
    public final void mo87791a(Context context) {
        C52711k.m112240b(context, "context");
        this.f109211i = new Paint();
        Paint paint = this.f109211i;
        if (paint == null) {
            C52711k.m112237a("mPaint");
        }
        paint.setColor(this.f109212j);
        Paint paint2 = this.f109211i;
        if (paint2 == null) {
            C52711k.m112237a("mPaint");
        }
        paint2.setStyle(Style.FILL);
        Paint paint3 = this.f109211i;
        if (paint3 == null) {
            C52711k.m112237a("mPaint");
        }
        paint3.setAntiAlias(true);
        this.f109213k = new Paint();
        Paint paint4 = this.f109213k;
        if (paint4 == null) {
            C52711k.m112237a("centerLinePaint");
        }
        paint4.setColor(context.getResources().getColor(R.color.aw3));
        Paint paint5 = this.f109213k;
        if (paint5 == null) {
            C52711k.m112237a("centerLinePaint");
        }
        paint5.setStrokeWidth((float) ((int) C9432q.m18687b(context, 1.0f)));
        Paint paint6 = this.f109213k;
        if (paint6 == null) {
            C52711k.m112237a("centerLinePaint");
        }
        paint6.setStyle(Style.FILL);
        Paint paint7 = this.f109213k;
        if (paint7 == null) {
            C52711k.m112237a("centerLinePaint");
        }
        paint7.setAntiAlias(true);
        this.f109207e = (int) C9432q.m18687b(context, 3.0f);
        this.f109203a = (int) C9432q.m18687b(context, 3.0f);
        this.f109204b = (int) C9432q.m18687b(context, 2.0f);
    }

    /* renamed from: a */
    public final void mo87790a(int i, int i2) {
        this.f109210h = i;
        this.f109205c = i2;
        this.f109205c -= this.f109206d * 2;
    }
}
