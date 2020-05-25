package com.p683ss.android.ugc.aweme.p1323ae.p1327d;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.Paint.FontMetricsInt;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.text.TextUtils;
import android.text.style.ReplacementSpan;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.ae.d.a */
public final class C22474a extends ReplacementSpan {

    /* renamed from: h */
    private static int[] f60529h = {R.drawable.dgq, R.drawable.dh1, R.drawable.dhb, R.drawable.dhd, R.drawable.dhe, R.drawable.dhf, R.drawable.dhg, R.drawable.dhh, R.drawable.dhi, R.drawable.dgr, R.drawable.dgs, R.drawable.dgt, R.drawable.dgu, R.drawable.dgv, R.drawable.dgw, R.drawable.dgx, R.drawable.dgy, R.drawable.dgz, R.drawable.dh0, R.drawable.dh2, R.drawable.dh3, R.drawable.dh4, R.drawable.dh5, R.drawable.dh6, R.drawable.dh7, R.drawable.dh8, R.drawable.dh9, R.drawable.dh_, R.drawable.dha, R.drawable.dhc};

    /* renamed from: a */
    private int f60530a;

    /* renamed from: b */
    private Drawable f60531b;

    /* renamed from: c */
    private String f60532c;

    /* renamed from: d */
    private int f60533d = C23728o.m58246c(8.5d);

    /* renamed from: e */
    private int f60534e = Color.parseColor("#8b3312");

    /* renamed from: f */
    private Drawable f60535f;

    /* renamed from: g */
    private int f60536g;

    /* renamed from: a */
    private Drawable m55524a() {
        if (this.f60531b == null) {
            this.f60531b = C11010c.m22280a().getResources().getDrawable(R.drawable.dep);
            this.f60531b.setBounds(0, 0, this.f60531b.getIntrinsicWidth(), this.f60531b.getIntrinsicHeight());
        }
        return this.f60531b;
    }

    /* renamed from: a */
    private Drawable m55525a(int i) {
        if (this.f60535f == null) {
            this.f60535f = C11010c.m22280a().getResources().getDrawable(f60529h[i - 1]);
            this.f60535f.setBounds(0, 0, this.f60535f.getIntrinsicWidth(), this.f60535f.getIntrinsicHeight());
        }
        return this.f60535f;
    }

    public C22474a(int i, String str, int i2) {
        this.f60530a = i;
        this.f60532c = str;
        this.f60536g = i2;
    }

    public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, FontMetricsInt fontMetricsInt) {
        Rect bounds = m55524a().getBounds();
        if (TextUtils.isEmpty(this.f60532c)) {
            return bounds.right;
        }
        paint.setTextSize((float) this.f60533d);
        return bounds.right + ((int) paint.measureText(this.f60532c)) + 14;
    }

    public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
        Canvas canvas2 = canvas;
        float f2 = f;
        Paint paint2 = paint;
        if (TextUtils.isEmpty(this.f60532c)) {
            Drawable a = m55524a();
            canvas.save();
            canvas2.translate(f2, (float) (i3 + C23728o.m58241a((double) this.f60536g)));
            a.draw(canvas2);
            Drawable a2 = m55525a(this.f60530a);
            canvas2.translate(9.0f, 0.0f);
            a2.draw(canvas2);
            canvas.restore();
            return;
        }
        Drawable a3 = m55524a();
        if (!TextUtils.isEmpty(this.f60532c)) {
            canvas.save();
            canvas2.translate(f2, (float) (i3 + C23728o.m58241a((double) this.f60536g)));
            canvas2.translate((float) (a3.getBounds().right - 2), 0.0f);
            paint.reset();
            paint2.setTextSize((float) this.f60533d);
            float measureText = paint2.measureText(this.f60532c) + 16.0f;
            LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, measureText, 0.0f, Color.parseColor("#FFD95E"), Color.parseColor("#FFB700"), TileMode.CLAMP);
            paint2.setShader(linearGradient);
            RectF rectF = new RectF(0.0f, (float) (a3.getBounds().bottom - C23728o.m58241a(12.5d)), measureText, (float) a3.getBounds().bottom);
            float a4 = (float) C23728o.m58241a(2.0d);
            canvas2.drawRoundRect(rectF, a4, a4, paint2);
            float f3 = a4;
            Paint paint3 = paint;
            canvas.drawRect(rectF.left, rectF.top, f3, a4, paint3);
            canvas.drawRect(rectF.left, rectF.bottom - a4, f3, rectF.bottom, paint3);
            paint.reset();
            paint2.setAntiAlias(true);
            paint2.setTypeface(Typeface.DEFAULT_BOLD);
            paint2.setTextSize((float) this.f60533d);
            paint2.setColor(this.f60534e);
            canvas2.drawText(this.f60532c, 8.0f, ((float) a3.getBounds().bottom) - (((((((float) a3.getBounds().bottom) + paint.getFontMetrics().descent) + ((float) a3.getBounds().bottom)) + paint.getFontMetrics().ascent) / 2.0f) - ((rectF.bottom + rectF.top) / 2.0f)), paint2);
            canvas.restore();
        }
        canvas.save();
        canvas2.translate(f2, (float) (i3 + C23728o.m58241a((double) this.f60536g)));
        a3.draw(canvas2);
        Drawable a5 = m55525a(this.f60530a);
        canvas2.translate(9.0f, 0.0f);
        a5.draw(canvas2);
        canvas.restore();
    }
}
