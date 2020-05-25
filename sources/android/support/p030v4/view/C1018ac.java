package android.support.p030v4.view;

import android.os.Build.VERSION;
import android.view.WindowInsets;

/* renamed from: android.support.v4.view.ac */
public final class C1018ac {

    /* renamed from: a */
    public final Object f3271a;

    public final int hashCode() {
        if (this.f3271a == null) {
            return 0;
        }
        return this.f3271a.hashCode();
    }

    /* renamed from: a */
    public final int mo3184a() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3271a).getSystemWindowInsetLeft();
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo3186b() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3271a).getSystemWindowInsetTop();
        }
        return 0;
    }

    /* renamed from: c */
    public final int mo3187c() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3271a).getSystemWindowInsetRight();
        }
        return 0;
    }

    /* renamed from: d */
    public final int mo3188d() {
        if (VERSION.SDK_INT >= 20) {
            return ((WindowInsets) this.f3271a).getSystemWindowInsetBottom();
        }
        return 0;
    }

    /* renamed from: e */
    public final boolean mo3189e() {
        if (VERSION.SDK_INT >= 21) {
            return ((WindowInsets) this.f3271a).isConsumed();
        }
        return false;
    }

    public C1018ac(Object obj) {
        this.f3271a = obj;
    }

    /* renamed from: a */
    static Object m2936a(C1018ac acVar) {
        if (acVar == null) {
            return null;
        }
        return acVar.f3271a;
    }

    /* renamed from: a */
    static C1018ac m2935a(Object obj) {
        if (obj == null) {
            return null;
        }
        return new C1018ac(obj);
    }

    public C1018ac(C1018ac acVar) {
        WindowInsets windowInsets = null;
        if (VERSION.SDK_INT >= 20) {
            if (acVar != null) {
                windowInsets = new WindowInsets((WindowInsets) acVar.f3271a);
            }
            this.f3271a = windowInsets;
            return;
        }
        this.f3271a = null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C1018ac acVar = (C1018ac) obj;
        if (this.f3271a != null) {
            return this.f3271a.equals(acVar.f3271a);
        }
        if (acVar.f3271a == null) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final C1018ac mo3185a(int i, int i2, int i3, int i4) {
        if (VERSION.SDK_INT >= 20) {
            return new C1018ac((Object) ((WindowInsets) this.f3271a).replaceSystemWindowInsets(i, i2, i3, i4));
        }
        return null;
    }
}
