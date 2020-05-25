package android.support.p017a.p018a;

import android.content.res.Resources.Theme;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.graphics.drawable.C0814e;

/* renamed from: android.support.a.a.h */
abstract class C0226h extends Drawable implements C0814e {

    /* renamed from: b */
    Drawable f518b;

    C0226h() {
    }

    public void clearColorFilter() {
        if (this.f518b != null) {
            this.f518b.clearColorFilter();
        } else {
            super.clearColorFilter();
        }
    }

    public Drawable getCurrent() {
        if (this.f518b != null) {
            return this.f518b.getCurrent();
        }
        return super.getCurrent();
    }

    public int getMinimumHeight() {
        if (this.f518b != null) {
            return this.f518b.getMinimumHeight();
        }
        return super.getMinimumHeight();
    }

    public int getMinimumWidth() {
        if (this.f518b != null) {
            return this.f518b.getMinimumWidth();
        }
        return super.getMinimumWidth();
    }

    public int[] getState() {
        if (this.f518b != null) {
            return this.f518b.getState();
        }
        return super.getState();
    }

    public Region getTransparentRegion() {
        if (this.f518b != null) {
            return this.f518b.getTransparentRegion();
        }
        return super.getTransparentRegion();
    }

    public void jumpToCurrentState() {
        if (this.f518b != null) {
            C0809a.m2323a(this.f518b);
        }
    }

    public ColorFilter getColorFilter() {
        if (this.f518b == null) {
            return null;
        }
        Drawable drawable = this.f518b;
        if (VERSION.SDK_INT >= 21) {
            return drawable.getColorFilter();
        }
        return null;
    }

    public void applyTheme(Theme theme) {
        if (this.f518b != null) {
            C0809a.m2328a(this.f518b, theme);
        }
    }

    public boolean getPadding(Rect rect) {
        if (this.f518b != null) {
            return this.f518b.getPadding(rect);
        }
        return super.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        if (this.f518b != null) {
            this.f518b.setBounds(rect);
        } else {
            super.onBoundsChange(rect);
        }
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        if (this.f518b != null) {
            return this.f518b.setLevel(i);
        }
        return super.onLevelChange(i);
    }

    public void setChangingConfigurations(int i) {
        if (this.f518b != null) {
            this.f518b.setChangingConfigurations(i);
        } else {
            super.setChangingConfigurations(i);
        }
    }

    public void setFilterBitmap(boolean z) {
        if (this.f518b != null) {
            this.f518b.setFilterBitmap(z);
        }
    }

    public boolean setState(int[] iArr) {
        if (this.f518b != null) {
            return this.f518b.setState(iArr);
        }
        return super.setState(iArr);
    }

    public void setColorFilter(int i, Mode mode) {
        if (this.f518b != null) {
            this.f518b.setColorFilter(i, mode);
        } else {
            super.setColorFilter(i, mode);
        }
    }

    public void setHotspot(float f, float f2) {
        if (this.f518b != null) {
            C0809a.m2324a(this.f518b, f, f2);
        }
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        if (this.f518b != null) {
            C0809a.m2326a(this.f518b, i, i2, i3, i4);
        }
    }
}
