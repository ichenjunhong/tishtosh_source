package android.support.p043v7.p046b.p047a;

import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.Callback;
import android.support.p030v4.graphics.drawable.C0809a;

/* renamed from: android.support.v7.b.a.c */
public class C1193c extends Drawable implements Callback {

    /* renamed from: l */
    public Drawable f3949l;

    public int getChangingConfigurations() {
        return this.f3949l.getChangingConfigurations();
    }

    public Drawable getCurrent() {
        return this.f3949l.getCurrent();
    }

    public int getIntrinsicHeight() {
        return this.f3949l.getIntrinsicHeight();
    }

    public int getIntrinsicWidth() {
        return this.f3949l.getIntrinsicWidth();
    }

    public int getMinimumHeight() {
        return this.f3949l.getMinimumHeight();
    }

    public int getMinimumWidth() {
        return this.f3949l.getMinimumWidth();
    }

    public int getOpacity() {
        return this.f3949l.getOpacity();
    }

    public int[] getState() {
        return this.f3949l.getState();
    }

    public Region getTransparentRegion() {
        return this.f3949l.getTransparentRegion();
    }

    public boolean isAutoMirrored() {
        return C0809a.m2332b(this.f3949l);
    }

    public boolean isStateful() {
        return this.f3949l.isStateful();
    }

    public void jumpToCurrentState() {
        C0809a.m2323a(this.f3949l);
    }

    public void invalidateDrawable(Drawable drawable) {
        invalidateSelf();
    }

    public void draw(Canvas canvas) {
        this.f3949l.draw(canvas);
    }

    public boolean getPadding(Rect rect) {
        return this.f3949l.getPadding(rect);
    }

    /* access modifiers changed from: protected */
    public void onBoundsChange(Rect rect) {
        this.f3949l.setBounds(rect);
    }

    /* access modifiers changed from: protected */
    public boolean onLevelChange(int i) {
        return this.f3949l.setLevel(i);
    }

    public void setAlpha(int i) {
        this.f3949l.setAlpha(i);
    }

    public void setAutoMirrored(boolean z) {
        C0809a.m2331a(this.f3949l, z);
    }

    public void setChangingConfigurations(int i) {
        this.f3949l.setChangingConfigurations(i);
    }

    public void setColorFilter(ColorFilter colorFilter) {
        this.f3949l.setColorFilter(colorFilter);
    }

    public void setDither(boolean z) {
        this.f3949l.setDither(z);
    }

    public void setFilterBitmap(boolean z) {
        this.f3949l.setFilterBitmap(z);
    }

    public boolean setState(int[] iArr) {
        return this.f3949l.setState(iArr);
    }

    public void setTint(int i) {
        C0809a.m2325a(this.f3949l, i);
    }

    public void setTintList(ColorStateList colorStateList) {
        C0809a.m2327a(this.f3949l, colorStateList);
    }

    public void setTintMode(Mode mode) {
        C0809a.m2330a(this.f3949l, mode);
    }

    public C1193c(Drawable drawable) {
        if (this.f3949l != null) {
            this.f3949l.setCallback(null);
        }
        this.f3949l = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
        }
    }

    public void unscheduleDrawable(Drawable drawable, Runnable runnable) {
        unscheduleSelf(runnable);
    }

    public void setHotspot(float f, float f2) {
        C0809a.m2324a(this.f3949l, f, f2);
    }

    public boolean setVisible(boolean z, boolean z2) {
        if (super.setVisible(z, z2) || this.f3949l.setVisible(z, z2)) {
            return true;
        }
        return false;
    }

    public void scheduleDrawable(Drawable drawable, Runnable runnable, long j) {
        scheduleSelf(runnable, j);
    }

    public void setHotspotBounds(int i, int i2, int i3, int i4) {
        C0809a.m2326a(this.f3949l, i, i2, i3, i4);
    }
}
