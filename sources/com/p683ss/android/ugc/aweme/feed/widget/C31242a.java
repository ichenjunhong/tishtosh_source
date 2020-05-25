package com.p683ss.android.ugc.aweme.feed.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.Paint.FontMetrics;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.support.p030v4.content.C0726c;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import android.util.TypedValue;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.widget.a */
public final class C31242a extends ReplacementSpan {

    /* renamed from: a */
    public boolean f81792a;

    /* renamed from: b */
    private Context f81793b;

    /* renamed from: c */
    private String f81794c;

    /* renamed from: d */
    private float f81795d;

    /* renamed from: e */
    private float f81796e;

    /* renamed from: f */
    private float f81797f;

    /* renamed from: g */
    private float f81798g;

    /* renamed from: h */
    private float f81799h;

    /* renamed from: i */
    private float f81800i;

    /* renamed from: j */
    private float f81801j;

    /* renamed from: k */
    private String f81802k;

    /* renamed from: l */
    private String f81803l;

    public C31242a(Context context, String str, String str2, String str3) {
        float f;
        if (!TextUtils.isEmpty(str2)) {
            this.f81793b = context.getApplicationContext();
            this.f81802k = str;
            this.f81794c = str2;
            this.f81801j = TypedValue.applyDimension(1, 1.0f, this.f81793b.getResources().getDisplayMetrics());
            this.f81795d = this.f81801j * 16.0f;
            this.f81798g = this.f81801j * 2.0f;
            this.f81797f = this.f81801j * 2.0f;
            this.f81800i = this.f81801j * 10.0f;
            this.f81803l = str3;
            this.f81799h = this.f81801j * 3.0f;
            if (str2.length() > 1) {
                Rect rect = new Rect();
                Paint paint = new Paint();
                paint.setTextSize(this.f81800i);
                paint.getTextBounds(str2, 0, str2.length(), rect);
                f = ((float) rect.width()) + (this.f81801j * 4.0f * 2.0f);
            } else {
                f = this.f81795d;
            }
            this.f81796e = f;
        }
    }

    /* renamed from: a */
    private float m72950a(Canvas canvas, float f, int i, Paint paint) {
        Paint paint2 = new Paint();
        try {
            if (!TextUtils.isEmpty(this.f81802k)) {
                paint2.setColor(Color.parseColor(this.f81802k));
            } else {
                paint2.setColor(C0726c.m2098c(this.f81793b, R.color.ss));
            }
        } catch (Exception unused) {
            paint2.setColor(-1);
        }
        paint2.setStyle(Style.FILL);
        paint2.setAntiAlias(true);
        FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = ((float) i) + (((fontMetrics.descent - fontMetrics.ascent) - this.f81795d) / 2.0f) + fontMetrics.ascent;
        if (f != 0.0f) {
            f += this.f81799h;
        }
        canvas.drawRoundRect(new RectF(f, f2, this.f81796e + f, this.f81795d + f2), this.f81797f, this.f81797f, paint2);
        return f2;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return (int) (this.f81796e + this.f81799h);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        float a = m72950a(canvas, f, i4, paint);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(this.f81800i);
        if (this.f81792a) {
            textPaint.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        }
        try {
            if (!TextUtils.isEmpty(this.f81803l)) {
                if (this.f81792a) {
                    i6 = -16777216;
                } else {
                    i6 = Color.parseColor(this.f81803l);
                }
                textPaint.setColor(i6);
            } else {
                textPaint.setColor(-1);
            }
            textPaint.setFakeBoldText(true);
        } catch (Exception unused) {
            textPaint.setColor(-1);
        }
        textPaint.setAntiAlias(true);
        FontMetricsInt fontMetricsInt = textPaint.getFontMetricsInt();
        if (f != 0.0f) {
            f += this.f81799h;
        }
        RectF rectF = new RectF(f, a, this.f81796e + f, this.f81795d + a);
        canvas.drawText(this.f81794c, (f + (this.f81801j * 4.0f)) - (this.f81801j * 0.5f), ((float) ((int) ((((rectF.bottom + rectF.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f))) - (this.f81801j * 0.5f), textPaint);
    }
}
