package android.support.p043v7.app;

import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p043v7.view.C1218b;
import android.support.p043v7.view.C1218b.C1219a;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.View;
import android.view.ViewGroup.MarginLayoutParams;

/* renamed from: android.support.v7.app.ActionBar */
public abstract class ActionBar {

    /* renamed from: android.support.v7.app.ActionBar$LayoutParams */
    public static class LayoutParams extends MarginLayoutParams {

        /* renamed from: a */
        public int f3592a;

        public LayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public LayoutParams(LayoutParams layoutParams) {
            super(layoutParams);
            this.f3592a = layoutParams.f3592a;
        }

        public LayoutParams(int i, int i2) {
            super(i, i2);
            this.f3592a = 8388627;
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842931});
            this.f3592a = obtainStyledAttributes.getInt(0, 0);
            obtainStyledAttributes.recycle();
        }
    }

    /* renamed from: android.support.v7.app.ActionBar$a */
    public static abstract class C1126a {
        /* renamed from: a */
        public abstract Drawable mo3603a();

        /* renamed from: b */
        public abstract CharSequence mo3604b();

        /* renamed from: c */
        public abstract View mo3605c();

        /* renamed from: d */
        public abstract CharSequence mo3606d();
    }

    /* renamed from: a */
    public abstract int mo3583a();

    /* renamed from: a */
    public C1218b mo3584a(C1219a aVar) {
        return null;
    }

    /* renamed from: a */
    public void mo3586a(int i) {
    }

    /* renamed from: a */
    public void mo3587a(Configuration configuration) {
    }

    /* renamed from: a */
    public void mo3588a(CharSequence charSequence) {
    }

    /* renamed from: a */
    public abstract void mo3589a(boolean z);

    /* renamed from: a */
    public boolean mo3590a(int i, KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: a */
    public boolean mo3591a(KeyEvent keyEvent) {
        return false;
    }

    /* renamed from: b */
    public Context mo3592b() {
        return null;
    }

    /* renamed from: b */
    public abstract void mo3593b(boolean z);

    /* renamed from: c */
    public boolean mo3595c() {
        return false;
    }

    /* renamed from: d */
    public void mo3596d(boolean z) {
    }

    /* renamed from: d */
    public boolean mo3597d() {
        return false;
    }

    /* renamed from: e */
    public void mo3598e(boolean z) {
    }

    /* renamed from: e */
    public boolean mo3599e() {
        return false;
    }

    /* renamed from: f */
    public void mo3600f(boolean z) {
    }

    /* renamed from: f */
    public boolean mo3601f() {
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public void mo3602g() {
    }

    /* renamed from: c */
    public void mo3594c(boolean z) {
        throw new UnsupportedOperationException("Hide on content scroll is not supported in this action bar configuration.");
    }

    /* renamed from: a */
    public void mo3585a(float f) {
        if (f != 0.0f) {
            throw new UnsupportedOperationException("Setting a non-zero elevation is not supported in this action bar configuration.");
        }
    }
}
