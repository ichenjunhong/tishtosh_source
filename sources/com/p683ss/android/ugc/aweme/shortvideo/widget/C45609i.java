package com.p683ss.android.ugc.aweme.shortvideo.widget;

import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.ColorFilter;
import android.graphics.LinearGradient;
import android.graphics.Paint;
import android.graphics.PorterDuff.Mode;
import android.graphics.PorterDuffXfermode;
import android.graphics.RectF;
import android.graphics.Shader.TileMode;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1056u;
import android.view.View;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.i */
public final class C45609i extends Drawable {

    /* renamed from: a */
    public static final int f115355a = 1;

    /* renamed from: b */
    public static final int f115356b = 2;

    /* renamed from: c */
    public static final C45611b f115357c = new C45611b(null);

    /* renamed from: d */
    private final Paint f115358d;

    /* renamed from: e */
    private final Paint f115359e;

    /* renamed from: f */
    private RectF f115360f;

    /* renamed from: g */
    private final int f115361g;

    /* renamed from: h */
    private final int[] f115362h;

    /* renamed from: i */
    private final int f115363i;

    /* renamed from: j */
    private final int f115364j;

    /* renamed from: k */
    private final int f115365k;

    /* renamed from: l */
    private final int f115366l;

    /* renamed from: m */
    private final int f115367m;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.i$a */
    public static final class C45610a {

        /* renamed from: a */
        private int f115368a = C45609i.f115355a;

        /* renamed from: b */
        private int f115369b = 12;

        /* renamed from: c */
        private int f115370c = Color.parseColor("#4d000000");

        /* renamed from: d */
        private int f115371d = 18;

        /* renamed from: e */
        private int f115372e = 0;

        /* renamed from: f */
        private int f115373f = 0;

        /* renamed from: g */
        private int[] f115374g = new int[1];

        /* renamed from: a */
        public final C45609i mo91994a() {
            C45609i iVar = new C45609i(this.f115368a, this.f115374g, this.f115369b, this.f115370c, this.f115371d, this.f115372e, this.f115373f, null);
            return iVar;
        }

        public C45610a() {
            this.f115374g[0] = 0;
        }

        /* renamed from: a */
        public final C45610a mo91993a(int i) {
            this.f115369b = i;
            return this;
        }

        /* renamed from: b */
        public final C45610a mo91995b(int i) {
            this.f115370c = i;
            return this;
        }

        /* renamed from: c */
        public final C45610a mo91996c(int i) {
            this.f115371d = i;
            return this;
        }

        /* renamed from: d */
        public final C45610a mo91997d(int i) {
            this.f115372e = i;
            return this;
        }

        /* renamed from: e */
        public final C45610a mo91998e(int i) {
            this.f115373f = i;
            return this;
        }

        /* renamed from: f */
        public final C45610a mo91999f(int i) {
            this.f115374g[0] = i;
            return this;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.widget.i$b */
    public static final class C45611b {
        private C45611b() {
        }

        public /* synthetic */ C45611b(C52707g gVar) {
            this();
        }

        /* renamed from: a */
        public static void m99351a(View view, int i, int i2, int i3, int i4, int i5, int i6) {
            C52711k.m112240b(view, "view");
            C45609i a = new C45610a().mo91999f(i).mo91993a(i2).mo91995b(i3).mo91996c(i4).mo91997d(0).mo91998e(0).mo91994a();
            view.setLayerType(1, null);
            C1056u.m3030a(view, (Drawable) a);
        }
    }

    public final int getOpacity() {
        return -3;
    }

    public final void setAlpha(int i) {
        this.f115358d.setAlpha(i);
    }

    public final void setColorFilter(ColorFilter colorFilter) {
        this.f115358d.setColorFilter(colorFilter);
    }

    public final void draw(Canvas canvas) {
        C52711k.m112240b(canvas, "canvas");
        if (this.f115362h != null) {
            if (this.f115362h.length == 1) {
                this.f115359e.setColor(this.f115362h[0]);
            } else {
                Paint paint = this.f115359e;
                RectF rectF = this.f115360f;
                if (rectF == null) {
                    C52711k.m112234a();
                }
                float f = rectF.left;
                RectF rectF2 = this.f115360f;
                if (rectF2 == null) {
                    C52711k.m112234a();
                }
                float height = rectF2.height() / 2.0f;
                RectF rectF3 = this.f115360f;
                if (rectF3 == null) {
                    C52711k.m112234a();
                }
                float f2 = rectF3.right;
                RectF rectF4 = this.f115360f;
                if (rectF4 == null) {
                    C52711k.m112234a();
                }
                LinearGradient linearGradient = new LinearGradient(f, height, f2, rectF4.height() / 2.0f, this.f115362h, null, TileMode.CLAMP);
                paint.setShader(linearGradient);
            }
        }
        if (this.f115361g == f115355a) {
            RectF rectF5 = this.f115360f;
            if (rectF5 == null) {
                C52711k.m112234a();
            }
            canvas.drawRoundRect(rectF5, (float) this.f115363i, (float) this.f115363i, this.f115358d);
            RectF rectF6 = this.f115360f;
            if (rectF6 == null) {
                C52711k.m112234a();
            }
            canvas.drawRoundRect(rectF6, (float) this.f115363i, (float) this.f115363i, this.f115359e);
            return;
        }
        RectF rectF7 = this.f115360f;
        if (rectF7 == null) {
            C52711k.m112234a();
        }
        float centerX = rectF7.centerX();
        RectF rectF8 = this.f115360f;
        if (rectF8 == null) {
            C52711k.m112234a();
        }
        float centerY = rectF8.centerY();
        RectF rectF9 = this.f115360f;
        if (rectF9 == null) {
            C52711k.m112234a();
        }
        float width = rectF9.width();
        RectF rectF10 = this.f115360f;
        if (rectF10 == null) {
            C52711k.m112234a();
        }
        canvas.drawCircle(centerX, centerY, Math.min(width, rectF10.height()) / 2.0f, this.f115358d);
        RectF rectF11 = this.f115360f;
        if (rectF11 == null) {
            C52711k.m112234a();
        }
        float centerX2 = rectF11.centerX();
        RectF rectF12 = this.f115360f;
        if (rectF12 == null) {
            C52711k.m112234a();
        }
        float centerY2 = rectF12.centerY();
        RectF rectF13 = this.f115360f;
        if (rectF13 == null) {
            C52711k.m112234a();
        }
        float width2 = rectF13.width();
        RectF rectF14 = this.f115360f;
        if (rectF14 == null) {
            C52711k.m112234a();
        }
        canvas.drawCircle(centerX2, centerY2, Math.min(width2, rectF14.height()) / 2.0f, this.f115359e);
    }

    public final void setBounds(int i, int i2, int i3, int i4) {
        super.setBounds(i, i2, i3, i4);
        this.f115360f = new RectF((float) ((i + this.f115365k) - this.f115366l), (float) ((i2 + this.f115365k) - this.f115367m), (float) ((i3 - this.f115365k) - this.f115366l), (float) ((i4 - this.f115365k) - this.f115367m));
    }

    private C45609i(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6) {
        this.f115361g = i;
        this.f115362h = iArr;
        this.f115363i = i2;
        this.f115364j = i3;
        this.f115365k = i4;
        this.f115366l = i5;
        this.f115367m = i6;
        this.f115358d = new Paint();
        this.f115358d.setColor(0);
        this.f115358d.setAntiAlias(true);
        this.f115358d.setShadowLayer((float) this.f115365k, (float) this.f115366l, (float) this.f115367m, this.f115364j);
        this.f115358d.setXfermode(new PorterDuffXfermode(Mode.DST_ATOP));
        this.f115359e = new Paint();
        this.f115359e.setAntiAlias(true);
    }

    public /* synthetic */ C45609i(int i, int[] iArr, int i2, int i3, int i4, int i5, int i6, C52707g gVar) {
        this(i, iArr, i2, i3, i4, i5, i6);
    }
}
