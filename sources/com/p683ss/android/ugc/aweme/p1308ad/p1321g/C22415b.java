package com.p683ss.android.ugc.aweme.p1308ad.p1321g;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Xfermode;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.support.p030v4.content.C0726c;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.ad.g.b */
public final class C22415b extends ReplacementSpan {

    /* renamed from: a */
    private Context f60372a;

    /* renamed from: b */
    private int f60373b;

    /* renamed from: c */
    private String f60374c;

    /* renamed from: d */
    private float f60375d;

    /* renamed from: e */
    private float f60376e;

    /* renamed from: f */
    private float f60377f;

    /* renamed from: g */
    private float f60378g;

    /* renamed from: h */
    private float f60379h;

    /* renamed from: i */
    private float f60380i;

    /* renamed from: j */
    private int f60381j;

    /* renamed from: k */
    private Paint f60382k;

    /* renamed from: l */
    private TextPaint f60383l;

    /* renamed from: m */
    private WeakReference<Drawable> f60384m;

    /* renamed from: b */
    private static Xfermode m55440b() {
        return new PorterDuffXfermode(Mode.DST_OUT);
    }

    /* renamed from: d */
    private Drawable m55442d() {
        return this.f60372a.getResources().getDrawable(this.f60381j);
    }

    /* renamed from: c */
    private Drawable m55441c() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f60384m;
        if (weakReference != null) {
            drawable = (Drawable) weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        Drawable d = m55442d();
        this.f60384m = new WeakReference<>(d);
        return d;
    }

    /* renamed from: a */
    private void m55439a() {
        if (this.f60383l == null) {
            this.f60383l = new TextPaint();
            this.f60383l.setTextSize(this.f60379h);
            this.f60383l.setXfermode(m55440b());
            this.f60383l.setAntiAlias(true);
        }
    }

    public C22415b(Context context, int i, String str, int i2) {
        this(context, R.color.cg, str, R.drawable.aip, 15);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return (int) this.f60376e;
    }

    private C22415b(Context context, int i, String str, int i2, int i3) {
        float f;
        if (!TextUtils.isEmpty(str)) {
            this.f60372a = context.getApplicationContext();
            this.f60373b = i;
            this.f60374c = str;
            this.f60380i = TypedValue.applyDimension(1, 1.0f, this.f60372a.getResources().getDisplayMetrics());
            this.f60375d = ((float) 15) * this.f60380i;
            this.f60378g = this.f60380i * 2.0f;
            this.f60377f = this.f60380i * 2.0f;
            this.f60379h = this.f60380i * 12.0f;
            this.f60381j = i2;
            if (str.length() > 1) {
                m55439a();
                Rect rect = new Rect();
                this.f60383l.getTextBounds(str, 0, str.length(), rect);
                f = ((float) rect.width()) + (this.f60380i * 4.0f * 3.0f) + ((float) m55441c().getIntrinsicWidth());
            } else {
                f = this.f60375d;
            }
            this.f60376e = f;
        }
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f60382k == null) {
            this.f60382k = new Paint();
            this.f60382k.setColor(C0726c.m2098c(this.f60372a, this.f60373b));
            this.f60382k.setStyle(Style.FILL);
            this.f60382k.setAntiAlias(true);
        }
        m55439a();
        FontMetrics fontMetrics = this.f60383l.getFontMetrics();
        float f2 = (float) i4;
        float f3 = fontMetrics.ascent + f2;
        float f4 = fontMetrics.descent + f2;
        float min = Math.min(Math.min(f3, ((float) canvas.getHeight()) - f4), (this.f60375d - (f4 - f3)) * 0.5f);
        canvas.drawRoundRect(new RectF(f, f3 - min, this.f60376e + f, f4 + min), this.f60377f, this.f60377f, this.f60382k);
        canvas.drawText(this.f60374c, (this.f60380i * 6.0f) + f + ((float) m55441c().getIntrinsicWidth()), f2, this.f60383l);
        Bitmap bitmap = ((BitmapDrawable) m55441c()).getBitmap();
        Paint paint2 = new Paint();
        paint2.setXfermode(m55440b());
        canvas.drawBitmap(bitmap, f + C9432q.m18687b(this.f60372a, 4.0f), ((float) (i4 - m55441c().getMinimumHeight())) + C9432q.m18687b(this.f60372a, 1.5f), paint2);
    }
}
