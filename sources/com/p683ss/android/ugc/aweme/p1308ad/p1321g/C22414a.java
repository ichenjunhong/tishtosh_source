package com.p683ss.android.ugc.aweme.p1308ad.p1321g;

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

/* renamed from: com.ss.android.ugc.aweme.ad.g.a */
public final class C22414a extends ReplacementSpan {

    /* renamed from: a */
    public boolean f60360a;

    /* renamed from: b */
    private Context f60361b;

    /* renamed from: c */
    private String f60362c;

    /* renamed from: d */
    private float f60363d;

    /* renamed from: e */
    private float f60364e;

    /* renamed from: f */
    private float f60365f;

    /* renamed from: g */
    private float f60366g;

    /* renamed from: h */
    private float f60367h;

    /* renamed from: i */
    private float f60368i;

    /* renamed from: j */
    private float f60369j;

    /* renamed from: k */
    private String f60370k;

    /* renamed from: l */
    private String f60371l;

    public C22414a(Context context, String str, String str2, String str3) {
        float f;
        if (!TextUtils.isEmpty(str2)) {
            this.f60361b = context.getApplicationContext();
            this.f60370k = str;
            this.f60362c = str2;
            this.f60369j = TypedValue.applyDimension(1, 1.0f, this.f60361b.getResources().getDisplayMetrics());
            this.f60363d = this.f60369j * 16.0f;
            this.f60366g = this.f60369j * 2.0f;
            this.f60365f = this.f60369j * 2.0f;
            this.f60368i = this.f60369j * 10.0f;
            this.f60371l = str3;
            this.f60367h = this.f60369j * 3.0f;
            if (str2.length() > 1) {
                Rect rect = new Rect();
                Paint paint = new Paint();
                paint.setTextSize(this.f60368i);
                paint.getTextBounds(str2, 0, str2.length(), rect);
                f = ((float) rect.width()) + (this.f60369j * 4.0f * 2.0f);
            } else {
                f = this.f60363d;
            }
            this.f60364e = f;
        }
    }

    /* renamed from: a */
    private float m55438a(Canvas canvas, float f, int i, Paint paint) {
        Paint paint2 = new Paint();
        try {
            if (!TextUtils.isEmpty(this.f60370k)) {
                paint2.setColor(Color.parseColor(this.f60370k));
            } else {
                paint2.setColor(C0726c.m2098c(this.f60361b, R.color.ss));
            }
        } catch (Exception unused) {
            paint2.setColor(-1);
        }
        paint2.setStyle(Style.FILL);
        paint2.setAntiAlias(true);
        FontMetrics fontMetrics = paint.getFontMetrics();
        float f2 = ((float) i) + (((fontMetrics.descent - fontMetrics.ascent) - this.f60363d) / 2.0f) + fontMetrics.ascent;
        if (f != 0.0f) {
            f += this.f60367h;
        }
        canvas.drawRoundRect(new RectF(f, f2, this.f60364e + f, this.f60363d + f2), this.f60365f, this.f60365f, paint2);
        return f2;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        return (int) (this.f60364e + this.f60367h);
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        int i6;
        float a = m55438a(canvas, f, i4, paint);
        TextPaint textPaint = new TextPaint();
        textPaint.setTextSize(this.f60368i);
        if (this.f60360a) {
            textPaint.setXfermode(new PorterDuffXfermode(Mode.DST_OUT));
        }
        try {
            if (!TextUtils.isEmpty(this.f60371l)) {
                if (this.f60360a) {
                    i6 = -16777216;
                } else {
                    i6 = Color.parseColor(this.f60371l);
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
            f += this.f60367h;
        }
        RectF rectF = new RectF(f, a, this.f60364e + f, this.f60363d + a);
        canvas.drawText(this.f60362c, (f + (this.f60369j * 4.0f)) - (this.f60369j * 0.5f), ((float) ((int) ((((rectF.bottom + rectF.top) - ((float) fontMetricsInt.bottom)) - ((float) fontMetricsInt.top)) / 2.0f))) - (this.f60369j * 0.5f), textPaint);
    }
}
