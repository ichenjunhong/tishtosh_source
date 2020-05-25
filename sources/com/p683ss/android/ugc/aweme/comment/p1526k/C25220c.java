package com.p683ss.android.ugc.aweme.comment.p1526k;

import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Paint.Style;
import android.graphics.RectF;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.comment.adapter.C25112e;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.comment.k.c */
public final class C25220c {

    /* renamed from: com.ss.android.ugc.aweme.comment.k.c$a */
    public static class C25221a extends ReplacementSpan {

        /* renamed from: a */
        private int f66811a;

        /* renamed from: b */
        private int f66812b;

        public C25221a(int i) {
            this.f66812b = i;
        }

        /* renamed from: a */
        public final TextPaint mo51481a(Paint paint) {
            int i;
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setTextSize((float) C23728o.m58246c(10.0d));
            if (this.f66812b == 1) {
                i = C11010c.m22280a().getResources().getColor(R.color.jg);
            } else {
                i = C11010c.m22280a().getResources().getColor(R.color.a19);
            }
            textPaint.setColor(i);
            return textPaint;
        }

        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
            this.f66811a = (int) mo51481a(paint).measureText(charSequence.subSequence(i, i2).toString());
            return this.f66811a + C23728o.m58241a(16.0d);
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            int i6;
            boolean z;
            int i7;
            int i8;
            Canvas canvas2 = canvas;
            int i9 = i3;
            int i10 = i5;
            Paint paint2 = new Paint();
            paint2.setStyle(Style.FILL);
            if (this.f66812b == 1) {
                i6 = C11010c.m22280a().getResources().getColor(R.color.ja);
            } else {
                i6 = C11010c.m22280a().getResources().getColor(R.color.j3);
            }
            paint2.setColor(i6);
            paint2.setAntiAlias(true);
            CharSequence subSequence = charSequence.subSequence(i, i2);
            FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            TextPaint a = mo51481a(paint);
            FontMetricsInt fontMetricsInt2 = a.getFontMetricsInt();
            if (C11010c.m22280a().getResources().getDisplayMetrics().density < 4.0f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                i7 = (((i10 - i9) - (fontMetricsInt.descent - fontMetricsInt.ascent)) / 2) + C23728o.m58241a(1.0d);
            } else {
                i7 = ((i10 - i9) - (fontMetricsInt.descent - fontMetricsInt.ascent)) + 3;
            }
            float f2 = (float) i7;
            canvas2.drawRoundRect(new RectF(f + ((float) C23728o.m58241a(4.0d)), ((float) i9) + f2, (float) ((int) (f + ((float) this.f66811a) + ((float) C23728o.m58241a(12.0d)))), ((float) i10) - f2), (float) C23728o.m58241a(4.0d), (float) C23728o.m58241a(4.0d), paint2);
            String charSequence2 = subSequence.toString();
            float a2 = f + ((float) C23728o.m58241a(8.0d));
            int i11 = i4 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent));
            if (z) {
                i8 = 1;
            } else {
                i8 = 3;
            }
            canvas2.drawText(charSequence2, a2, (float) (i11 - i8), a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.k.c$b */
    public static class C25222b extends ReplacementSpan {

        /* renamed from: a */
        private int f66813a;

        /* renamed from: b */
        private int f66814b;

        /* renamed from: a */
        private TextPaint m61329a(Paint paint) {
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setTextSize((float) this.f66813a);
            textPaint.setColor(this.f66814b);
            return textPaint;
        }

        public C25222b(int i, int i2) {
            this.f66813a = i;
            this.f66814b = i2;
        }

        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
            return (int) m61329a(paint).measureText(charSequence.subSequence(i, i2).toString());
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            CharSequence subSequence = charSequence.subSequence(i, i2);
            FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            TextPaint a = m61329a(paint);
            FontMetricsInt fontMetricsInt2 = a.getFontMetricsInt();
            canvas.drawText(subSequence.toString(), f, (float) (i4 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent))), a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.k.c$c */
    public static class C25223c extends ReplacementSpan {

        /* renamed from: a */
        private int f66815a;

        /* renamed from: b */
        private int f66816b;

        /* renamed from: c */
        private int f66817c;

        /* renamed from: d */
        private int f66818d;

        /* renamed from: e */
        private int f66819e;

        /* renamed from: f */
        private int f66820f;

        /* renamed from: g */
        private int f66821g;

        /* renamed from: h */
        private int f66822h;

        public C25223c() {
            int i;
            int i2;
            Resources resources = C11010c.m22280a().getResources();
            if (C25112e.m61020a()) {
                i = R.color.axc;
            } else {
                i = R.color.fh;
            }
            this.f66815a = resources.getColor(i);
            Resources resources2 = C11010c.m22280a().getResources();
            if (C25112e.m61020a()) {
                i2 = R.color.axh;
            } else {
                i2 = R.color.g5;
            }
            this.f66816b = resources2.getColor(i2);
            this.f66817c = C23728o.m58241a(10.0d);
            this.f66818d = C23728o.m58241a(15.0d);
            this.f66819e = C23728o.m58241a(4.0d);
            this.f66820f = C23728o.m58241a(4.0d);
            this.f66821g = C23728o.m58241a(1.0d);
        }

        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setTextSize((float) this.f66817c);
            this.f66822h = (int) textPaint.measureText(charSequence.subSequence(i, i2).toString());
            return this.f66822h + this.f66819e + this.f66820f;
        }

        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            CharSequence subSequence = charSequence.subSequence(i, i2);
            TextPaint textPaint = new TextPaint(paint);
            textPaint.setColor(this.f66815a);
            int i6 = ((i5 - i3) - this.f66818d) / 2;
            canvas.drawRoundRect(new RectF(f, (float) (i3 + i6), ((float) this.f66822h) + f + ((float) this.f66819e) + ((float) this.f66820f), (float) (i5 - i6)), (float) this.f66821g, (float) this.f66821g, textPaint);
            textPaint.setTextSize((float) this.f66817c);
            textPaint.setColor(this.f66816b);
            FontMetricsInt fontMetricsInt = paint.getFontMetricsInt();
            FontMetricsInt fontMetricsInt2 = textPaint.getFontMetricsInt();
            canvas.drawText(subSequence.toString(), f + ((float) this.f66819e), (float) (i4 - ((((fontMetricsInt.descent - fontMetricsInt.ascent) / 2) - fontMetricsInt.descent) - (((fontMetricsInt2.descent - fontMetricsInt2.ascent) / 2) - fontMetricsInt2.descent))), textPaint);
        }
    }
}
