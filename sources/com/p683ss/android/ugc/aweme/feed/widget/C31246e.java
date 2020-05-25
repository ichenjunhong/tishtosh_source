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
import android.os.Build.VERSION;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.e */
public final class C31246e extends ReplacementSpan {

    /* renamed from: a */
    float f81822a = -1.0f;

    /* renamed from: b */
    int f81823b = -1;

    /* renamed from: c */
    private Context f81824c;

    /* renamed from: d */
    private int f81825d;

    /* renamed from: e */
    private String f81826e;

    /* renamed from: f */
    private float f81827f;

    /* renamed from: g */
    private float f81828g;

    /* renamed from: h */
    private float f81829h;

    /* renamed from: i */
    private float f81830i;

    /* renamed from: j */
    private float f81831j;

    /* renamed from: k */
    private float f81832k;

    /* renamed from: l */
    private int f81833l = 12;

    /* renamed from: m */
    private int f81834m;

    /* renamed from: n */
    private WeakReference<Drawable> f81835n;

    /* renamed from: a */
    private static Xfermode m72957a() {
        return new PorterDuffXfermode(Mode.DST_OUT);
    }

    /* renamed from: c */
    private Drawable m72959c() {
        return this.f81824c.getResources().getDrawable(this.f81834m);
    }

    /* renamed from: b */
    private Drawable m72958b() {
        Drawable drawable;
        WeakReference<Drawable> weakReference = this.f81835n;
        if (weakReference != null) {
            drawable = (Drawable) weakReference.get();
        } else {
            drawable = null;
        }
        if (drawable != null) {
            return drawable;
        }
        Drawable c = m72959c();
        this.f81835n = new WeakReference<>(c);
        return c;
    }

    public C31246e(Context context, int i, String str, int i2) {
        float f;
        if (!TextUtils.isEmpty(str)) {
            this.f81824c = context.getApplicationContext();
            this.f81825d = R.color.cg;
            this.f81826e = str;
            this.f81832k = TypedValue.applyDimension(1, 1.0f, this.f81824c.getResources().getDisplayMetrics());
            this.f81827f = this.f81832k * 18.0f;
            this.f81830i = this.f81832k * 2.0f;
            this.f81829h = this.f81832k * 4.0f;
            this.f81831j = this.f81832k * 12.0f;
            this.f81834m = i2;
            if (str.length() > 1) {
                Rect rect = new Rect();
                Paint paint = new Paint();
                paint.setTextSize(this.f81831j);
                paint.getTextBounds(str, 0, str.length(), rect);
                f = ((float) rect.width()) + (this.f81832k * 4.0f * 3.0f) + ((float) m72958b().getIntrinsicWidth());
            } else {
                f = this.f81827f;
            }
            this.f81828g = f;
        }
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return (int) this.f81828g;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        if (this.f81822a < 0.0f) {
            this.f81822a = f;
        }
        if (this.f81823b < 0) {
            this.f81823b = i4;
        }
        float f2 = this.f81822a;
        int i7 = this.f81823b;
        Paint paint2 = new Paint();
        paint2.setColor(this.f81824c.getResources().getColor(this.f81825d));
        paint2.setStyle(Style.FILL);
        paint2.setAntiAlias(true);
        FontMetrics fontMetrics = paint.getFontMetrics();
        float f3 = ((float) i7) + (((fontMetrics.descent - fontMetrics.ascent) - this.f81827f) / 2.0f) + fontMetrics.ascent;
        RectF rectF = new RectF(f2, f3, this.f81828g + f2, this.f81827f + f3);
        if (VERSION.SDK_INT >= 21) {
            i6 = canvas.saveLayer(rectF, paint2);
        } else {
            i6 = canvas.saveLayer(rectF, paint2, 31);
        }
        canvas.drawRoundRect(rectF, this.f81829h, this.f81829h, paint2);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(this.f81831j);
        textPaint.setXfermode(m72957a());
        textPaint.setAntiAlias(true);
        FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        RectF rectF2 = new RectF(f2, f3, this.f81828g + f2, this.f81827f + f3);
        canvas.drawText(this.f81826e, (this.f81832k * 6.0f) + f2 + ((float) m72958b().getIntrinsicWidth()), (float) ((int) ((((rectF2.bottom + rectF2.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f)), textPaint);
        Bitmap bitmap = ((BitmapDrawable) m72958b()).getBitmap();
        Paint paint3 = new Paint();
        paint3.setXfermode(m72957a());
        canvas.drawBitmap(bitmap, f2 + C9432q.m18687b(this.f81824c, 4.0f), ((float) (i7 - m72958b().getMinimumHeight())) + C9432q.m18687b(this.f81824c, -1.0f), paint3);
        canvas.restoreToCount(i6);
    }
}
