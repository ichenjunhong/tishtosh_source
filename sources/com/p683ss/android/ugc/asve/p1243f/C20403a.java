package com.p683ss.android.ugc.asve.p1243f;

import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.Paint.Align;
import android.graphics.Typeface;
import android.os.Build.VERSION;
import android.text.Layout.Alignment;
import android.text.StaticLayout;
import android.text.TextPaint;
import android.text.TextUtils.TruncateAt;
import com.p683ss.android.vesdk.model.BefTextLayout;

/* renamed from: com.ss.android.ugc.asve.f.a */
public final class C20403a {

    /* renamed from: a */
    public int f55934a;

    /* renamed from: b */
    public int f55935b;

    /* renamed from: c */
    public int f55936c;

    /* renamed from: d */
    private TextPaint f55937d = new TextPaint();

    /* renamed from: e */
    private int f55938e;

    /* renamed from: f */
    private int f55939f;

    /* renamed from: g */
    private long f55940g;

    /* renamed from: h */
    private long f55941h;

    /* renamed from: i */
    private int f55942i;

    /* renamed from: j */
    private float f55943j;

    /* renamed from: k */
    private String f55944k;

    public C20403a(BefTextLayout befTextLayout) {
        this.f55934a = befTextLayout.getLineWidth();
        this.f55938e = befTextLayout.getLineCount();
        this.f55943j = befTextLayout.getLineHeight();
        this.f55939f = befTextLayout.getSplit();
        this.f55942i = befTextLayout.getCharSize();
        this.f55940g = befTextLayout.getBackColor();
        this.f55941h = befTextLayout.getTextColor();
        this.f55944k = befTextLayout.getFamilyName();
        this.f55937d.setAntiAlias(true);
        this.f55937d.setTextSize((float) befTextLayout.getCharSize());
        this.f55937d.setTypeface(Typeface.create(this.f55944k, 0));
        this.f55937d.setColor(((((int) this.f55941h) >> 8) & 16777215) | ((((int) this.f55941h) << 24) & -16777216));
        if (VERSION.SDK_INT >= 21) {
            this.f55937d.setLetterSpacing((float) befTextLayout.getLetterSpacing());
        }
        this.f55937d.setTextAlign(Align.LEFT);
    }

    /* renamed from: a */
    public final Bitmap mo43231a(String str) {
        StaticLayout staticLayout;
        int i;
        if (this.f55939f != 2) {
            staticLayout = new StaticLayout(str, this.f55937d, this.f55934a, Alignment.ALIGN_NORMAL, this.f55943j, 0.0f, false);
        } else {
            String str2 = str;
            staticLayout = new StaticLayout(str2, 0, str.length(), this.f55937d, this.f55934a, Alignment.ALIGN_NORMAL, this.f55943j, 0.0f, false, TruncateAt.END, this.f55934a * this.f55938e);
        }
        if (this.f55938e == 0) {
            i = Integer.MAX_VALUE;
        } else {
            i = this.f55938e;
        }
        this.f55936c = Math.min(i, staticLayout.getLineCount());
        Bitmap createBitmap = Bitmap.createBitmap(staticLayout.getWidth(), staticLayout.getHeight(), Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        canvas.drawColor(((((int) this.f55940g) >> 8) & 16777215) | ((((int) this.f55940g) << 24) & -16777216));
        staticLayout.draw(canvas);
        this.f55935b = Math.min(Math.round((((float) this.f55936c) * this.f55943j * ((float) this.f55942i)) + this.f55937d.getFontMetrics().descent), createBitmap.getHeight());
        return Bitmap.createBitmap(createBitmap, 0, 0, this.f55934a, this.f55935b);
    }
}
