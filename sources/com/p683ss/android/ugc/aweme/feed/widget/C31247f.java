package com.p683ss.android.ugc.aweme.feed.widget;

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

/* renamed from: com.ss.android.ugc.aweme.feed.widget.f */
public final class C31247f extends ReplacementSpan {

    /* renamed from: a */
    private Context f81836a;

    /* renamed from: b */
    private int f81837b;

    /* renamed from: c */
    private String f81838c;

    /* renamed from: d */
    private float f81839d;

    /* renamed from: e */
    private float f81840e;

    /* renamed from: f */
    private float f81841f;

    /* renamed from: g */
    private float f81842g;

    /* renamed from: h */
    private float f81843h;

    /* renamed from: i */
    private float f81844i;

    /* renamed from: j */
    private int f81845j;

    /* renamed from: k */
    private Paint f81846k;

    /* renamed from: l */
    private TextPaint f81847l;

    /* renamed from: m */
    private WeakReference<Drawable> f81848m;

    /* renamed from: b */
    private static Xfermode m72961b() {
        return new PorterDuffXfermode(Mode.DST_OUT);
    }

    /* renamed from: d */
    private Drawable m72963d() {
        return this.f81836a.getResources().getDrawable(this.f81845j);
    }

    /* renamed from: c */
    private Drawable m72962c() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f81848m;
        if (weakReference != null) {
            drawable = (Drawable) weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        Drawable d = m72963d();
        this.f81848m = new WeakReference<>(d);
        return d;
    }

    /* renamed from: a */
    private void m72960a() {
        if (this.f81847l == null) {
            this.f81847l = new TextPaint();
            this.f81847l.setTextSize(this.f81843h);
            this.f81847l.setXfermode(m72961b());
            this.f81847l.setAntiAlias(true);
        }
    }

    public C31247f(Context context, int i, String str, int i2) {
        this(context, R.color.cg, str, R.drawable.dg7, 15);
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return (int) this.f81840e;
    }

    public C31247f(Context context, int i, String str, int i2, int i3) {
        float f;
        if (!TextUtils.isEmpty(str)) {
            this.f81836a = context.getApplicationContext();
            this.f81837b = i;
            this.f81838c = str;
            this.f81844i = TypedValue.applyDimension(1, 1.0f, this.f81836a.getResources().getDisplayMetrics());
            this.f81839d = ((float) i3) * this.f81844i;
            this.f81842g = this.f81844i * 2.0f;
            this.f81841f = this.f81844i * 2.0f;
            this.f81843h = this.f81844i * 12.0f;
            this.f81845j = i2;
            if (str.length() > 1) {
                m72960a();
                Rect rect = new Rect();
                this.f81847l.getTextBounds(str, 0, str.length(), rect);
                f = ((float) rect.width()) + (this.f81844i * 4.0f * 3.0f) + ((float) m72962c().getIntrinsicWidth());
            } else {
                f = this.f81839d;
            }
            this.f81840e = f;
        }
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        if (this.f81846k == null) {
            this.f81846k = new Paint();
            this.f81846k.setColor(C0726c.m2098c(this.f81836a, this.f81837b));
            this.f81846k.setStyle(Style.FILL);
            this.f81846k.setAntiAlias(true);
        }
        m72960a();
        FontMetrics fontMetrics = this.f81847l.getFontMetrics();
        float f2 = (float) i4;
        float f3 = fontMetrics.ascent + f2;
        float f4 = fontMetrics.descent + f2;
        float min = Math.min(Math.min(f3, ((float) canvas.getHeight()) - f4), (this.f81839d - (f4 - f3)) * 0.5f);
        canvas.drawRoundRect(new RectF(f, f3 - min, this.f81840e + f, f4 + min), this.f81841f, this.f81841f, this.f81846k);
        canvas.drawText(this.f81838c, (this.f81844i * 6.0f) + f + ((float) m72962c().getIntrinsicWidth()), f2, this.f81847l);
        Bitmap bitmap = ((BitmapDrawable) m72962c()).getBitmap();
        Paint paint2 = new Paint();
        paint2.setXfermode(m72961b());
        canvas.drawBitmap(bitmap, f + C9432q.m18687b(this.f81836a, 4.0f), ((float) (i4 - m72962c().getMinimumHeight())) + C9432q.m18687b(this.f81836a, 1.5f), paint2);
    }
}
