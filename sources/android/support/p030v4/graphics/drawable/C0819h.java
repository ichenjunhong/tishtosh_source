package android.support.p030v4.graphics.drawable;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Outline;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build.VERSION;
import java.lang.reflect.Method;

/* renamed from: android.support.v4.graphics.drawable.h */
final class C0819h extends C0816g {

    /* renamed from: d */
    private static Method f2775d;

    /* renamed from: android.support.v4.graphics.drawable.h$a */
    static class C0820a extends C0817a {
        public final Drawable newDrawable(Resources resources) {
            return new C0819h(this, resources);
        }

        C0820a(C0817a aVar, Resources resources) {
            super(aVar, null);
        }
    }

    public final Rect getDirtyBounds() {
        return this.f2766c.getDirtyBounds();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final C0817a mo2625b() {
        return new C0820a(this.f2765b, null);
    }

    /* renamed from: d */
    private static void m2353d() {
        if (f2775d == null) {
            try {
                f2775d = Drawable.class.getDeclaredMethod("isProjected", new Class[0]);
            } catch (Exception unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final boolean mo2626c() {
        if (VERSION.SDK_INT != 21) {
            return false;
        }
        Drawable drawable = this.f2766c;
        if ((drawable instanceof GradientDrawable) || (drawable instanceof DrawableContainer) || (drawable instanceof InsetDrawable) || (drawable instanceof RippleDrawable)) {
            return true;
        }
        return false;
    }

    C0819h(Drawable drawable) {
        super(drawable);
        m2353d();
    }

    public final void getOutline(Outline outline) {
        this.f2766c.getOutline(outline);
    }

    public final boolean setState(int[] iArr) {
        if (!super.setState(iArr)) {
            return false;
        }
        invalidateSelf();
        return true;
    }

    public final void setTint(int i) {
        if (mo2626c()) {
            super.setTint(i);
        } else {
            this.f2766c.setTint(i);
        }
    }

    public final void setTintList(ColorStateList colorStateList) {
        if (mo2626c()) {
            super.setTintList(colorStateList);
        } else {
            this.f2766c.setTintList(colorStateList);
        }
    }

    public final void setTintMode(Mode mode) {
        if (mo2626c()) {
            super.setTintMode(mode);
        } else {
            this.f2766c.setTintMode(mode);
        }
    }

    public final void setHotspot(float f, float f2) {
        this.f2766c.setHotspot(f, f2);
    }

    C0819h(C0817a aVar, Resources resources) {
        super(aVar, resources);
        m2353d();
    }

    public final void setHotspotBounds(int i, int i2, int i3, int i4) {
        this.f2766c.setHotspotBounds(i, i2, i3, i4);
    }
}
