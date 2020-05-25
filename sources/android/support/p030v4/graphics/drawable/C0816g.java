package android.support.p030v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.graphics.drawable.Drawable.ConstantState;

/* renamed from: android.support.v4.graphics.drawable.g */
class C0816g extends Drawable implements Callback, C0814e, C0815f {

    /* renamed from: a */
    static final Mode f2764a = Mode.SRC_IN;

    /* renamed from: b */
    C0817a f2765b;

    /* renamed from: c */
    Drawable f2766c;

    /* renamed from: d */
    private int f2767d;

    /* renamed from: e */
    private Mode f2768e;

    /* renamed from: f */
    private boolean f2769f;

    /* renamed from: g */
    private boolean f2770g;

    /* renamed from: android.support.v4.graphics.drawable.g$a */
    protected static abstract class C0817a extends ConstantState {

        /* renamed from: a */
        int f2771a;

        /* renamed from: b */
        ConstantState f2772b;

        /* renamed from: c */
        ColorStateList f2773c;

        /* renamed from: d */
        Mode f2774d = C0816g.f2764a;

        public abstract Drawable newDrawable(Resources resources);

        public Drawable newDrawable() {
            return newDrawable(null);
        }

        public int getChangingConfigurations() {
            int i;
            int i2 = this.f2771a;
            if (this.f2772b != null) {
                i = this.f2772b.getChangingConfigurations();
            } else {
                i = 0;
            }
            return i2 | i;
        }

        C0817a(C0817a aVar, Resources resources) {
            if (aVar != null) {
                this.f2771a = aVar.f2771a;
                this.f2772b = aVar.f2772b;
                this.f2773c = aVar.f2773c;
                this.f2774d = aVar.f2774d;
            }
        }
    }

    /* renamed from: android.support.v4.graphics.drawable.g$b */
    static class C0818b extends C0817a {
        public final Drawable newDrawable(Resources resources) {
            return new C0816g(this, resources);
        }

        C0818b(C0817a aVar, Resources resources) {
            super(aVar, null);
        }
    }

    /* renamed from: a */
    public final Drawable mo2623a() {
        return this.f2766c;
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public boolean mo2626c() {
        return true;
    }

    public Drawable getCurrent() {
        return this.f2766c.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f2766c.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f2766c.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f2766c.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f2766c.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f2766c.getOpacity();
    }

    public int[] getState() {
        return this.f2766c.getState();
    }

    public Region getTransparentRegion() {
        return this.f2766c.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        return this.f2766c.isAutoMirrored();
    }

    public void jumpToCurrentState() {
        this.f2766c.jumpToCurrentState();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public C0817a mo2625b() {
        return new C0818b(this.f2765b, null);
    }

    public int getChangingConfigurations() {
        int i;
        int changingConfigurations = super.getChangingConfigurations();
        if (this.f2765b != null) {
            i = this.f2765b.getChangingConfigurations();
        } else {
            i = 0;
        }
        return changingConfigurations | i | this.f2766c.getChangingConfigurations();
    }

    public ConstantState getConstantState() {
        boolean z;
        if (this.f2765b != null) {
            if (this.f2765b.f2772b != null) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                this.f2765b.f2771a = getChangingConfigurations();
                return this.f2765b;
            }
        }
        return null;
    }

    public boolean isStateful() {
        ColorStateList colorStateList;
        if (!mo2626c() || this.f2765b == null) {
            colorStateList = null;
        } else {
            colorStateList = this.f2765b.f2773c;
        }
        if ((colorStateList == null || !colorStateList.isStateful()) && !this.f2766c.isStateful()) {
            return false;
        }
        return true;
    }

    public Drawable mutate() {
        ConstantState constantState;
        if (!this.f2770g && super.mutate() == this) {
            this.f2765b = mo2625b();
            if (this.f2766c != null) {
                this.f2766c.mutate();
            }
            if (this.f2765b != null) {
                C0817a aVar = this.f2765b;
                if (this.f2766c != null) {
                    constantState = this.f2766c.getConstantState();
                } else {
                    constantState = null;
                }
                aVar.f2772b = constantState;
            }
            this.f2770g = true;
        }
        return this;
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f2766c.draw(canvas);
    }

    public boolean getPadding(Rect rect) {
        return this.f2766c.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f2766c.setLevel(i);
    }

    public void setAlpha(int i) {
        this.f2766c.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        this.f2766c.setAutoMirrored(z);
    }

    public void setChangingConfigurations(int i) {
        this.f2766c.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f2766c.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f2766c.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f2766c.setFilterBitmap(z);
    }

    public void setTint(int i) {
        setTintList(ColorStateList.valueOf(i));
    }

    C0816g(Drawable drawable) {
        this.f2765b = mo2625b();
        mo2624a(drawable);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f2766c != null) {
            this.f2766c.setBounds(rect);
        }
    }

    public void setTintList(ColorStateList colorStateList) {
        this.f2765b.f2773c = colorStateList;
        m2348a(getState());
    }

    public void setTintMode(Mode mode) {
        this.f2765b.f2774d = mode;
        m2348a(getState());
    }

    public boolean setState(int[] iArr) {
        boolean state = this.f2766c.setState(iArr);
        if (m2348a(iArr) || state) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private boolean m2348a(int[] iArr) {
        if (!mo2626c()) {
            return false;
        }
        ColorStateList colorStateList = this.f2765b.f2773c;
        Mode mode = this.f2765b.f2774d;
        if (colorStateList == null || mode == null) {
            this.f2769f = false;
            clearColorFilter();
        } else {
            int colorForState = colorStateList.getColorForState(iArr, colorStateList.getDefaultColor());
            if (!(this.f2769f && colorForState == this.f2767d && mode == this.f2768e)) {
                setColorFilter(colorForState, mode);
                this.f2767d = colorForState;
                this.f2768e = mode;
                this.f2769f = true;
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo2624a(Drawable drawable) {
        if (this.f2766c != null) {
            this.f2766c.setCallback(null);
        }
        this.f2766c = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            setVisible(drawable.isVisible(), true);
            setState(drawable.getState());
            setLevel(drawable.getLevel());
            setBounds(drawable.getBounds());
            if (this.f2765b != null) {
                this.f2765b.f2772b = drawable.getConstantState();
            }
        }
        invalidateSelf();
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    C0816g(C0817a aVar, Resources resources) {
        this.f2765b = aVar;
        if (this.f2765b != null && this.f2765b.f2772b != null) {
            mo2624a(this.f2765b.f2772b.newDrawable(resources));
        }
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.f2766c.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }
}
