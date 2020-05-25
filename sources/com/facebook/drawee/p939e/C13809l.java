package com.facebook.drawee.p939e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.facebook.common.p920d.C13689i;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.e.l */
public final class C13809l extends Drawable implements C13807j {

    /* renamed from: a */
    final float[] f35994a = new float[8];

    /* renamed from: b */
    float[] f35995b;

    /* renamed from: c */
    final Paint f35996c = new Paint(1);

    /* renamed from: d */
    final Path f35997d = new Path();

    /* renamed from: e */
    final Path f35998e = new Path();

    /* renamed from: f */
    public int f35999f = 0;

    /* renamed from: g */
    private final float[] f36000g = new float[8];

    /* renamed from: h */
    private boolean f36001h = false;

    /* renamed from: i */
    private float f36002i = 0.0f;

    /* renamed from: j */
    private float f36003j = 0.0f;

    /* renamed from: k */
    private int f36004k = 0;

    /* renamed from: l */
    private boolean f36005l = false;

    /* renamed from: m */
    private final RectF f36006m = new RectF();

    /* renamed from: n */
    private int f36007n = NormalGiftView.ALPHA_255;

    public final int getAlpha() {
        return this.f36007n;
    }

    public final void setColorFilter(ColorFilter colorFilter) {
    }

    public final int getOpacity() {
        int a = C13802e.m27984a(this.f35999f, this.f36007n) >>> 24;
        if (a == 255) {
            return -1;
        }
        if (a == 0) {
            return -2;
        }
        return -3;
    }

    /* renamed from: a */
    private void m28006a() {
        float f;
        this.f35997d.reset();
        this.f35998e.reset();
        this.f36006m.set(getBounds());
        this.f36006m.inset(this.f36002i / 2.0f, this.f36002i / 2.0f);
        if (this.f36001h) {
            this.f35998e.addCircle(this.f36006m.centerX(), this.f36006m.centerY(), Math.min(this.f36006m.width(), this.f36006m.height()) / 2.0f, Direction.CW);
        } else {
            for (int i = 0; i < this.f35994a.length; i++) {
                this.f35994a[i] = (this.f36000g[i] + this.f36003j) - (this.f36002i / 2.0f);
            }
            this.f35998e.addRoundRect(this.f36006m, this.f35994a, Direction.CW);
        }
        this.f36006m.inset((-this.f36002i) / 2.0f, (-this.f36002i) / 2.0f);
        float f2 = this.f36003j;
        if (this.f36005l) {
            f = this.f36002i;
        } else {
            f = 0.0f;
        }
        float f3 = f2 + f;
        this.f36006m.inset(f3, f3);
        if (this.f36001h) {
            this.f35997d.addCircle(this.f36006m.centerX(), this.f36006m.centerY(), Math.min(this.f36006m.width(), this.f36006m.height()) / 2.0f, Direction.CW);
        } else if (this.f36005l) {
            if (this.f35995b == null) {
                this.f35995b = new float[8];
            }
            for (int i2 = 0; i2 < this.f35995b.length; i2++) {
                this.f35995b[i2] = this.f36000g[i2] - this.f36002i;
            }
            this.f35997d.addRoundRect(this.f36006m, this.f35995b, Direction.CW);
        } else {
            this.f35997d.addRoundRect(this.f36006m, this.f36000g, Direction.CW);
        }
        float f4 = -f3;
        this.f36006m.inset(f4, f4);
    }

    /* access modifiers changed from: protected */
    public final void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        m28006a();
    }

    /* renamed from: a */
    public static C13809l m28005a(ColorDrawable colorDrawable) {
        return new C13809l(colorDrawable.getColor());
    }

    /* renamed from: b */
    public final void mo25848b(float f) {
        if (this.f36003j != f) {
            this.f36003j = f;
            m28006a();
            invalidateSelf();
        }
    }

    public final void setAlpha(int i) {
        if (i != this.f36007n) {
            this.f36007n = i;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo25844a(float f) {
        C13689i.m27656a(true, (Object) "radius should be non negative");
        Arrays.fill(this.f36000g, 0.0f);
        m28006a();
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo25849b(boolean z) {
        if (this.f36005l != z) {
            this.f36005l = z;
            m28006a();
            invalidateSelf();
        }
    }

    private C13809l(int i) {
        if (this.f35999f != i) {
            this.f35999f = i;
            invalidateSelf();
        }
    }

    /* renamed from: a */
    public final void mo25846a(boolean z) {
        this.f36001h = z;
        m28006a();
        invalidateSelf();
    }

    public final void draw(Canvas canvas) {
        this.f35996c.setColor(C13802e.m27984a(this.f35999f, this.f36007n));
        this.f35996c.setStyle(Style.FILL);
        canvas.drawPath(this.f35997d, this.f35996c);
        if (this.f36002i != 0.0f) {
            this.f35996c.setColor(C13802e.m27984a(this.f36004k, this.f36007n));
            this.f35996c.setStyle(Style.STROKE);
            this.f35996c.setStrokeWidth(this.f36002i);
            canvas.drawPath(this.f35998e, this.f35996c);
        }
    }

    /* renamed from: a */
    public final void mo25847a(float[] fArr) {
        boolean z;
        if (fArr == null) {
            Arrays.fill(this.f36000g, 0.0f);
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C13689i.m27656a(z, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f36000g, 0, 8);
        }
        m28006a();
        invalidateSelf();
    }

    /* renamed from: a */
    public final void mo25845a(int i, float f) {
        if (this.f36004k != i) {
            this.f36004k = i;
            invalidateSelf();
        }
        if (this.f36002i != f) {
            this.f36002i = f;
            m28006a();
            invalidateSelf();
        }
    }
}
