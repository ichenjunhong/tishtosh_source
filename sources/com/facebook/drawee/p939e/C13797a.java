package com.facebook.drawee.p939e;

import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Matrix;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import com.facebook.common.p920d.C13689i;

/* renamed from: com.facebook.drawee.e.a */
public class C13797a extends Drawable implements Callback, C13829r, C13830s {

    /* renamed from: a */
    public final C13800c[] f35953a;

    /* renamed from: b */
    private C13830s f35954b;

    /* renamed from: c */
    private final C13801d f35955c = new C13801d();

    /* renamed from: d */
    private final Drawable[] f35956d;

    /* renamed from: e */
    private final Rect f35957e = new Rect();

    /* renamed from: f */
    private boolean f35958f;

    /* renamed from: g */
    private boolean f35959g;

    /* renamed from: h */
    private boolean f35960h;

    /* renamed from: a */
    public final int mo25778a() {
        return this.f35956d.length;
    }

    public int getIntrinsicHeight() {
        int i = -1;
        for (Drawable drawable : this.f35956d) {
            if (drawable != null) {
                i = Math.max(i, drawable.getIntrinsicHeight());
            }
        }
        if (i > 0) {
            return i;
        }
        return -1;
    }

    public int getIntrinsicWidth() {
        int i = -1;
        for (Drawable drawable : this.f35956d) {
            if (drawable != null) {
                i = Math.max(i, drawable.getIntrinsicWidth());
            }
        }
        if (i > 0) {
            return i;
        }
        return -1;
    }

    public int getOpacity() {
        if (this.f35956d.length == 0) {
            return -2;
        }
        int i = -1;
        for (int i2 = 1; i2 < this.f35956d.length; i2++) {
            Drawable drawable = this.f35956d[i2];
            if (drawable != null) {
                i = Drawable.resolveOpacity(i, drawable.getOpacity());
            }
        }
        return i;
    }

    public Drawable mutate() {
        for (Drawable drawable : this.f35956d) {
            if (drawable != null) {
                drawable.mutate();
            }
        }
        this.f35960h = true;
        return this;
    }

    public boolean isStateful() {
        if (!this.f35959g) {
            this.f35958f = false;
            int i = 0;
            while (true) {
                boolean z = true;
                if (i >= this.f35956d.length) {
                    break;
                }
                Drawable drawable = this.f35956d[i];
                boolean z2 = this.f35958f;
                if (drawable == null || !drawable.isStateful()) {
                    z = false;
                }
                this.f35958f = z2 | z;
                i++;
            }
            this.f35959g = true;
        }
        return this.f35958f;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void setTransformCallback(C13830s sVar) {
        this.f35954b = sVar;
    }

    public void getTransform(Matrix matrix) {
        if (this.f35954b != null) {
            this.f35954b.getTransform(matrix);
        } else {
            matrix.reset();
        }
    }

    /* renamed from: a */
    public final Drawable mo25779a(int i) {
        boolean z;
        boolean z2 = false;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        if (i < this.f35956d.length) {
            z2 = true;
        }
        C13689i.m27655a(z2);
        return this.f35956d[i];
    }

    public void draw(Canvas canvas) {
        for (Drawable drawable : this.f35956d) {
            if (drawable != null) {
                drawable.draw(canvas);
            }
        }
    }

    public void getRootBounds(RectF rectF) {
        if (this.f35954b != null) {
            this.f35954b.getRootBounds(rectF);
        } else {
            rectF.set(getBounds());
        }
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        for (Drawable drawable : this.f35956d) {
            if (drawable != null) {
                drawable.setBounds(rect);
            }
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        boolean z = false;
        for (Drawable drawable : this.f35956d) {
            if (drawable != null && drawable.setLevel(i)) {
                z = true;
            }
        }
        return z;
    }

    /* access modifiers changed from: protected */
    public boolean onStateChange(int[] iArr) {
        boolean z = false;
        for (Drawable drawable : this.f35956d) {
            if (drawable != null && drawable.setState(iArr)) {
                z = true;
            }
        }
        return z;
    }

    public void setAlpha(int i) {
        this.f35955c.f35967a = i;
        for (Drawable drawable : this.f35956d) {
            if (drawable != null) {
                drawable.setAlpha(i);
            }
        }
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f35955c.mo25807a(colorFilter);
        for (Drawable drawable : this.f35956d) {
            if (drawable != null) {
                drawable.setColorFilter(colorFilter);
            }
        }
    }

    public void setDither(boolean z) {
        this.f35955c.mo25809a(z);
        for (Drawable drawable : this.f35956d) {
            if (drawable != null) {
                drawable.setDither(z);
            }
        }
    }

    public void setFilterBitmap(boolean z) {
        this.f35955c.mo25810b(z);
        for (Drawable drawable : this.f35956d) {
            if (drawable != null) {
                drawable.setFilterBitmap(z);
            }
        }
    }

    public C13797a(Drawable[] drawableArr) {
        this.f35958f = false;
        this.f35959g = false;
        this.f35960h = false;
        C13689i.m27652a(drawableArr);
        this.f35956d = drawableArr;
        for (Drawable a : this.f35956d) {
            C13802e.m27985a(a, this, this);
        }
        this.f35953a = new C13800c[this.f35956d.length];
    }

    public boolean getPadding(Rect rect) {
        rect.left = 0;
        rect.top = 0;
        rect.right = 0;
        rect.bottom = 0;
        Rect rect2 = this.f35957e;
        for (Drawable drawable : this.f35956d) {
            if (drawable != null) {
                drawable.getPadding(rect2);
                rect.left = Math.max(rect.left, rect2.left);
                rect.top = Math.max(rect.top, rect2.top);
                rect.right = Math.max(rect.right, rect2.right);
                rect.bottom = Math.max(rect.bottom, rect2.bottom);
            }
        }
        return true;
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void setHotspot(float f, float f2) {
        for (Drawable drawable : this.f35956d) {
            if (drawable != null) {
                drawable.setHotspot(f, f2);
            }
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        boolean visible = super.setVisible(z, z2);
        for (Drawable drawable : this.f35956d) {
            if (drawable != null) {
                drawable.setVisible(z, z2);
            }
        }
        return visible;
    }

    /* renamed from: a */
    public final Drawable mo25780a(int i, Drawable drawable) {
        boolean z;
        boolean z2 = true;
        if (i >= 0) {
            z = true;
        } else {
            z = false;
        }
        C13689i.m27655a(z);
        if (i >= this.f35956d.length) {
            z2 = false;
        }
        C13689i.m27655a(z2);
        Drawable drawable2 = this.f35956d[i];
        if (drawable != drawable2) {
            if (drawable != null && this.f35960h) {
                drawable.mutate();
            }
            C13802e.m27985a(this.f35956d[i], null, null);
            C13802e.m27985a(drawable, null, null);
            C13802e.m27987a(drawable, this.f35955c);
            C13802e.m27986a(drawable, (Drawable) this);
            C13802e.m27985a(drawable, this, this);
            this.f35959g = false;
            this.f35956d[i] = drawable;
            invalidateSelf();
        }
        return drawable2;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
