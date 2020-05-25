package com.facebook.drawee.p939e;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.os.SystemClock;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.common.p920d.C13689i;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.e.f */
public final class C13803f extends C13797a {

    /* renamed from: b */
    public int f35972b;

    /* renamed from: c */
    public int f35973c;

    /* renamed from: d */
    long f35974d;

    /* renamed from: e */
    int[] f35975e;

    /* renamed from: f */
    int[] f35976f;

    /* renamed from: g */
    int f35977g;

    /* renamed from: h */
    boolean[] f35978h;

    /* renamed from: i */
    int f35979i;

    /* renamed from: j */
    private final Drawable[] f35980j;

    public final int getAlpha() {
        return this.f35977g;
    }

    /* renamed from: f */
    private static long m27989f() {
        return SystemClock.uptimeMillis();
    }

    /* renamed from: b */
    public final void mo25811b() {
        this.f35979i++;
    }

    public final void invalidateSelf() {
        if (this.f35979i == 0) {
            super.invalidateSelf();
        }
    }

    /* renamed from: c */
    public final void mo25813c() {
        this.f35979i--;
        invalidateSelf();
    }

    /* renamed from: d */
    public final void mo25815d() {
        this.f35972b = 0;
        Arrays.fill(this.f35978h, true);
        invalidateSelf();
    }

    /* renamed from: e */
    public final void mo25817e() {
        int i;
        this.f35972b = 2;
        for (int i2 = 0; i2 < this.f35980j.length; i2++) {
            int[] iArr = this.f35976f;
            if (this.f35978h[i2]) {
                i = NormalGiftView.ALPHA_255;
            } else {
                i = 0;
            }
            iArr[i2] = i;
        }
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo25812b(int i) {
        this.f35973c = i;
        if (this.f35972b == 1) {
            this.f35972b = 0;
        }
    }

    public final void setAlpha(int i) {
        if (this.f35977g != i) {
            this.f35977g = i;
            invalidateSelf();
        }
    }

    /* renamed from: c */
    public final void mo25814c(int i) {
        this.f35972b = 0;
        this.f35978h[i] = true;
        invalidateSelf();
    }

    /* renamed from: d */
    public final void mo25816d(int i) {
        this.f35972b = 0;
        this.f35978h[i] = false;
        invalidateSelf();
    }

    public C13803f(Drawable[] drawableArr) {
        boolean z;
        super(drawableArr);
        if (drawableArr.length > 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27658b(z, "At least one layer required!");
        this.f35980j = drawableArr;
        this.f35975e = new int[drawableArr.length];
        this.f35976f = new int[drawableArr.length];
        this.f35977g = NormalGiftView.ALPHA_255;
        this.f35978h = new boolean[drawableArr.length];
        this.f35979i = 0;
        this.f35972b = 2;
        Arrays.fill(this.f35975e, 0);
        this.f35975e[0] = 255;
        Arrays.fill(this.f35976f, 0);
        this.f35976f[0] = 255;
        Arrays.fill(this.f35978h, false);
        this.f35978h[0] = true;
    }

    /* renamed from: a */
    private boolean m27988a(float f) {
        int i;
        boolean z = true;
        for (int i2 = 0; i2 < this.f35980j.length; i2++) {
            if (this.f35978h[i2]) {
                i = 1;
            } else {
                i = -1;
            }
            this.f35976f[i2] = (int) (((float) this.f35975e[i2]) + (((float) (i * NormalGiftView.ALPHA_255)) * f));
            if (this.f35976f[i2] < 0) {
                this.f35976f[i2] = 0;
            }
            if (this.f35976f[i2] > 255) {
                this.f35976f[i2] = 255;
            }
            if (this.f35978h[i2] && this.f35976f[i2] < 255) {
                z = false;
            }
            if (!this.f35978h[i2] && this.f35976f[i2] > 0) {
                z = false;
            }
        }
        return z;
    }

    public final void draw(Canvas canvas) {
        boolean z;
        float f;
        boolean z2;
        int i = 2;
        switch (this.f35972b) {
            case 0:
                System.arraycopy(this.f35976f, 0, this.f35975e, 0, this.f35980j.length);
                this.f35974d = m27989f();
                if (this.f35973c == 0) {
                    f = 1.0f;
                } else {
                    f = 0.0f;
                }
                z = m27988a(f);
                if (!z) {
                    i = 1;
                }
                this.f35972b = i;
                break;
            case 1:
                if (this.f35973c > 0) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                C13689i.m27657b(z2);
                z = m27988a(((float) (m27989f() - this.f35974d)) / ((float) this.f35973c));
                if (!z) {
                    i = 1;
                }
                this.f35972b = i;
                break;
            default:
                z = true;
                break;
        }
        for (int i2 = 0; i2 < this.f35980j.length; i2++) {
            Drawable drawable = this.f35980j[i2];
            int i3 = (this.f35976f[i2] * this.f35977g) / NormalGiftView.ALPHA_255;
            if (drawable != null && i3 > 0) {
                this.f35979i++;
                drawable.mutate().setAlpha(i3);
                this.f35979i--;
                drawable.draw(canvas);
            }
        }
        if (!z) {
            invalidateSelf();
        }
    }
}
