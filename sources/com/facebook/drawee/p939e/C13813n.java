package com.facebook.drawee.p939e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Matrix.ScaleToFit;
import android.graphics.Path;
import android.graphics.Path.Direction;
import android.graphics.Path.FillType;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import com.facebook.common.p920d.C13689i;
import com.facebook.imagepipeline.p976p.C14237b;
import java.util.Arrays;

/* renamed from: com.facebook.drawee.e.n */
public abstract class C13813n extends Drawable implements C13807j, C13829r {

    /* renamed from: A */
    private boolean f36026A = true;

    /* renamed from: B */
    private C13830s f36027B;

    /* renamed from: a */
    private final float[] f36028a = new float[8];

    /* renamed from: b */
    protected final Drawable f36029b;

    /* renamed from: c */
    protected boolean f36030c;

    /* renamed from: d */
    protected boolean f36031d;

    /* renamed from: e */
    protected float f36032e;

    /* renamed from: f */
    protected final Path f36033f = new Path();

    /* renamed from: g */
    protected boolean f36034g = true;

    /* renamed from: h */
    protected int f36035h = 0;

    /* renamed from: i */
    protected final Path f36036i = new Path();

    /* renamed from: j */
    final float[] f36037j = new float[8];

    /* renamed from: k */
    float[] f36038k;

    /* renamed from: l */
    final RectF f36039l = new RectF();

    /* renamed from: m */
    final RectF f36040m = new RectF();

    /* renamed from: n */
    final RectF f36041n = new RectF();

    /* renamed from: o */
    final RectF f36042o = new RectF();

    /* renamed from: p */
    RectF f36043p;

    /* renamed from: q */
    final Matrix f36044q = new Matrix();

    /* renamed from: r */
    final Matrix f36045r = new Matrix();

    /* renamed from: s */
    final Matrix f36046s = new Matrix();

    /* renamed from: t */
    final Matrix f36047t = new Matrix();

    /* renamed from: u */
    final Matrix f36048u = new Matrix();

    /* renamed from: v */
    Matrix f36049v;

    /* renamed from: w */
    Matrix f36050w;

    /* renamed from: x */
    final Matrix f36051x = new Matrix();

    /* renamed from: y */
    private float f36052y = 0.0f;

    /* renamed from: z */
    private boolean f36053z = false;

    public void clearColorFilter() {
        this.f36029b.clearColorFilter();
    }

    public int getAlpha() {
        return this.f36029b.getAlpha();
    }

    public ColorFilter getColorFilter() {
        return this.f36029b.getColorFilter();
    }

    public int getIntrinsicHeight() {
        return this.f36029b.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f36029b.getIntrinsicWidth();
    }

    public int getOpacity() {
        return this.f36029b.getOpacity();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo25850a() {
        if (this.f36030c || this.f36031d || this.f36032e > 0.0f) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo25864c() {
        float f;
        if (this.f36026A) {
            this.f36036i.reset();
            this.f36039l.inset(this.f36032e / 2.0f, this.f36032e / 2.0f);
            if (this.f36030c) {
                this.f36036i.addCircle(this.f36039l.centerX(), this.f36039l.centerY(), Math.min(this.f36039l.width(), this.f36039l.height()) / 2.0f, Direction.CW);
            } else {
                for (int i = 0; i < this.f36037j.length; i++) {
                    this.f36037j[i] = (this.f36028a[i] + this.f36052y) - (this.f36032e / 2.0f);
                }
                this.f36036i.addRoundRect(this.f36039l, this.f36037j, Direction.CW);
            }
            this.f36039l.inset((-this.f36032e) / 2.0f, (-this.f36032e) / 2.0f);
            this.f36033f.reset();
            float f2 = this.f36052y;
            if (this.f36053z) {
                f = this.f36032e;
            } else {
                f = 0.0f;
            }
            float f3 = f2 + f;
            this.f36039l.inset(f3, f3);
            if (this.f36030c) {
                this.f36033f.addCircle(this.f36039l.centerX(), this.f36039l.centerY(), Math.min(this.f36039l.width(), this.f36039l.height()) / 2.0f, Direction.CW);
            } else if (this.f36053z) {
                if (this.f36038k == null) {
                    this.f36038k = new float[8];
                }
                for (int i2 = 0; i2 < this.f36037j.length; i2++) {
                    this.f36038k[i2] = this.f36028a[i2] - this.f36032e;
                }
                this.f36033f.addRoundRect(this.f36039l, this.f36038k, Direction.CW);
            } else {
                this.f36033f.addRoundRect(this.f36039l, this.f36028a, Direction.CW);
            }
            float f4 = -f3;
            this.f36039l.inset(f4, f4);
            this.f36033f.setFillType(FillType.WINDING);
            this.f36026A = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo25863b() {
        if (this.f36027B != null) {
            this.f36027B.getTransform(this.f36046s);
            this.f36027B.getRootBounds(this.f36039l);
        } else {
            this.f36046s.reset();
            this.f36039l.set(getBounds());
        }
        this.f36041n.set(0.0f, 0.0f, (float) getIntrinsicWidth(), (float) getIntrinsicHeight());
        this.f36042o.set(this.f36029b.getBounds());
        this.f36044q.setRectToRect(this.f36041n, this.f36042o, ScaleToFit.FILL);
        if (this.f36053z) {
            if (this.f36043p == null) {
                this.f36043p = new RectF(this.f36039l);
            } else {
                this.f36043p.set(this.f36039l);
            }
            this.f36043p.inset(this.f36032e, this.f36032e);
            if (this.f36049v == null) {
                this.f36049v = new Matrix();
            }
            this.f36049v.setRectToRect(this.f36039l, this.f36043p, ScaleToFit.FILL);
        } else if (this.f36049v != null) {
            this.f36049v.reset();
        }
        if (!this.f36046s.equals(this.f36047t) || !this.f36044q.equals(this.f36045r) || (this.f36049v != null && !this.f36049v.equals(this.f36050w))) {
            this.f36034g = true;
            this.f36046s.invert(this.f36048u);
            this.f36051x.set(this.f36046s);
            if (this.f36053z) {
                this.f36051x.postConcat(this.f36049v);
            }
            this.f36051x.preConcat(this.f36044q);
            this.f36047t.set(this.f36046s);
            this.f36045r.set(this.f36044q);
            if (this.f36053z) {
                if (this.f36050w == null) {
                    this.f36050w = new Matrix(this.f36049v);
                } else {
                    this.f36050w.set(this.f36049v);
                }
            } else if (this.f36050w != null) {
                this.f36050w.reset();
            }
        }
        if (!this.f36039l.equals(this.f36040m)) {
            this.f36026A = true;
            this.f36040m.set(this.f36039l);
        }
    }

    public void setTransformCallback(C13830s sVar) {
        this.f36027B = sVar;
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f36029b.setBounds(rect);
    }

    public void setAlpha(int i) {
        this.f36029b.setAlpha(i);
    }

    /* renamed from: a */
    public final void mo25846a(boolean z) {
        this.f36030c = z;
        this.f36026A = true;
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo25848b(float f) {
        if (this.f36052y != f) {
            this.f36052y = f;
            this.f36026A = true;
            invalidateSelf();
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f36029b.setColorFilter(colorFilter);
    }

    /* renamed from: a */
    public final void mo25844a(float f) {
        C13689i.m27657b(true);
        Arrays.fill(this.f36028a, 0.0f);
        this.f36031d = false;
        this.f36026A = true;
        invalidateSelf();
    }

    /* renamed from: b */
    public final void mo25849b(boolean z) {
        if (this.f36053z != z) {
            this.f36053z = z;
            this.f36026A = true;
            invalidateSelf();
        }
    }

    public void draw(Canvas canvas) {
        if (C14237b.m29187b()) {
            C14237b.m29186a("RoundedDrawable#draw");
        }
        this.f36029b.draw(canvas);
        if (C14237b.m29187b()) {
            C14237b.m29185a();
        }
    }

    C13813n(Drawable drawable) {
        this.f36029b = drawable;
    }

    /* renamed from: a */
    public final void mo25847a(float[] fArr) {
        boolean z;
        boolean z2;
        if (fArr == null) {
            Arrays.fill(this.f36028a, 0.0f);
            this.f36031d = false;
        } else {
            if (fArr.length == 8) {
                z = true;
            } else {
                z = false;
            }
            C13689i.m27656a(z, (Object) "radii should have exactly 8 values");
            System.arraycopy(fArr, 0, this.f36028a, 0, 8);
            this.f36031d = false;
            for (int i = 0; i < 8; i++) {
                boolean z3 = this.f36031d;
                if (fArr[i] > 0.0f) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f36031d = z3 | z2;
            }
        }
        this.f36026A = true;
        invalidateSelf();
    }

    public void setColorFilter(int i, Mode mode) {
        this.f36029b.setColorFilter(i, mode);
    }

    /* renamed from: a */
    public final void mo25845a(int i, float f) {
        if (this.f36035h != i || this.f36032e != f) {
            this.f36035h = i;
            this.f36032e = f;
            this.f36026A = true;
            invalidateSelf();
        }
    }
}
