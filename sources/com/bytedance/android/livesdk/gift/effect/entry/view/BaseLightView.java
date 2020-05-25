package com.bytedance.android.livesdk.gift.effect.entry.view;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Bitmap.Config;
import android.graphics.Canvas;
import android.graphics.ComposeShader;
import android.graphics.LinearGradient;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.Shader.TileMode;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.ss.android.ugc.trill.R;

public class BaseLightView extends View {

    /* renamed from: a */
    private boolean f20210a;

    /* renamed from: b */
    private boolean f20211b;

    /* renamed from: c */
    private Matrix f20212c;

    /* renamed from: d */
    private float f20213d;

    /* renamed from: e */
    private Shader f20214e;

    /* renamed from: f */
    private Shader f20215f;

    /* renamed from: g */
    private ComposeShader f20216g;

    /* renamed from: h */
    private Matrix f20217h;

    /* renamed from: i */
    private Paint f20218i;

    /* renamed from: j */
    private Paint f20219j;

    /* renamed from: k */
    private Canvas f20220k;

    /* renamed from: l */
    private RectF f20221l;

    /* renamed from: m */
    private Bitmap f20222m;

    /* renamed from: n */
    private float f20223n;

    /* renamed from: o */
    private float f20224o;

    /* renamed from: a */
    public final void mo13663a() {
        this.f20211b = true;
        m15273b();
        invalidate();
    }

    /* renamed from: b */
    private void m15273b() {
        int color = getResources().getColor(R.color.alg);
        int color2 = getResources().getColor(R.color.ali);
        int color3 = getResources().getColor(R.color.alh);
        this.f20221l = new RectF(0.0f, 0.0f, this.f20223n, this.f20224o);
        this.f20212c = new Matrix();
        this.f20213d = this.f20223n;
        LinearGradient linearGradient = new LinearGradient(0.0f, 0.0f, this.f20223n, this.f20224o, color, color, TileMode.CLAMP);
        this.f20214e = linearGradient;
        int[] iArr = {color3, color2, color2, color3};
        LinearGradient linearGradient2 = new LinearGradient(0.0f, 0.0f, 60.0f, 14.0f, iArr, new float[]{0.0f, 0.4f, 0.6f, 1.0f}, TileMode.CLAMP);
        this.f20215f = linearGradient2;
        this.f20216g = new ComposeShader(this.f20214e, this.f20215f, Mode.DST_ATOP);
        this.f20222m = Bitmap.createBitmap((int) this.f20223n, (int) this.f20224o, Config.ARGB_8888);
        this.f20220k = new Canvas(this.f20222m);
        this.f20214e.setLocalMatrix(this.f20217h);
        this.f20215f.setLocalMatrix(this.f20217h);
        this.f20216g.setLocalMatrix(this.f20217h);
    }

    public BaseLightView(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f20210a && this.f20211b) {
            this.f20220k.drawPaint(this.f20219j);
            this.f20213d -= 30.0f;
            this.f20212c.setTranslate(this.f20213d, 0.0f);
            this.f20215f.setLocalMatrix(this.f20212c);
            this.f20216g = new ComposeShader(this.f20214e, this.f20215f, Mode.DST_ATOP);
            this.f20216g.setLocalMatrix(this.f20217h);
            this.f20218i.setShader(this.f20216g);
            this.f20220k.drawRoundRect(this.f20221l, 10.0f, 10.0f, this.f20218i);
            this.f20218i.setAlpha(128);
            canvas.drawBitmap(this.f20222m, 0.0f, 0.0f, this.f20218i);
            if (this.f20213d <= (-this.f20223n) / 2.0f) {
                this.f20211b = false;
            }
            if (this.f20213d > (-this.f20223n) / 2.0f) {
                postInvalidateDelayed(20);
            }
        }
    }

    public BaseLightView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        this.f20223n = (float) MeasureSpec.getSize(i);
        this.f20224o = (float) MeasureSpec.getSize(i2);
    }

    public BaseLightView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f20218i = new Paint();
        this.f20218i.setAntiAlias(true);
        this.f20219j = new Paint();
        this.f20219j.setXfermode(new PorterDuffXfermode(Mode.CLEAR));
        this.f20212c = new Matrix();
        this.f20217h = new Matrix();
        this.f20217h.setTranslate(1.0f, 0.0f);
        this.f20223n = (float) getWidth();
        this.f20224o = (float) getHeight();
        this.f20221l = new RectF(0.0f, 0.0f, this.f20223n, this.f20224o);
    }
}
