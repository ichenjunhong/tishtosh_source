package android.support.p030v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.l */
public final class C1047l {

    /* renamed from: a */
    public boolean f3329a;

    /* renamed from: b */
    private ViewParent f3330b;

    /* renamed from: c */
    private ViewParent f3331c;

    /* renamed from: d */
    private final View f3332d;

    /* renamed from: e */
    private int[] f3333e;

    /* renamed from: a */
    public final boolean mo3229a(int i, int i2, int[] iArr, int[] iArr2) {
        return mo3230a(i, i2, iArr, iArr2, 0);
    }

    /* renamed from: a */
    public final boolean mo3230a(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        int i4;
        int i5;
        if (this.f3329a) {
            ViewParent d = m2990d(i3);
            if (d == null) {
                return false;
            }
            if (i != 0 || i2 != 0) {
                if (iArr2 != null) {
                    this.f3332d.getLocationInWindow(iArr2);
                    i5 = iArr2[0];
                    i4 = iArr2[1];
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (iArr == null) {
                    if (this.f3333e == null) {
                        this.f3333e = new int[2];
                    }
                    iArr = this.f3333e;
                }
                iArr[0] = 0;
                iArr[1] = 0;
                C1062x.m3095a(d, this.f3332d, i, i2, iArr, i3);
                if (iArr2 != null) {
                    this.f3332d.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i5;
                    iArr2[1] = iArr2[1] - i4;
                }
                if (iArr[0] == 0 && iArr[1] == 0) {
                    return false;
                }
                return true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo3222a() {
        return mo3225a(0);
    }

    /* renamed from: b */
    public final void mo3231b() {
        mo3233c(0);
    }

    public C1047l(View view) {
        this.f3332d = view;
    }

    /* renamed from: a */
    public final boolean mo3225a(int i) {
        if (m2990d(i) != null) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo3232b(int i) {
        return mo3226a(i, 0);
    }

    /* renamed from: c */
    public final void mo3233c(int i) {
        ViewParent d = m2990d(i);
        if (d != null) {
            C1062x.m3093a(d, this.f3332d, i);
            m2989a(i, (ViewParent) null);
        }
    }

    /* renamed from: d */
    private ViewParent m2990d(int i) {
        switch (i) {
            case 0:
                return this.f3330b;
            case 1:
                return this.f3331c;
            default:
                return null;
        }
    }

    /* renamed from: a */
    public final void mo3221a(boolean z) {
        if (this.f3329a) {
            View view = this.f3332d;
            if (VERSION.SDK_INT >= 21) {
                view.stopNestedScroll();
            } else if (view instanceof C1045j) {
                ((C1045j) view).stopNestedScroll();
            }
        }
        this.f3329a = z;
    }

    /* renamed from: a */
    private void m2989a(int i, ViewParent viewParent) {
        switch (i) {
            case 0:
                this.f3330b = viewParent;
                return;
            case 1:
                this.f3331c = viewParent;
                break;
        }
    }

    /* renamed from: a */
    public final boolean mo3223a(float f, float f2) {
        if (this.f3329a) {
            ViewParent d = m2990d(0);
            if (d != null) {
                return C1062x.m3096a(d, this.f3332d, f, f2);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo3226a(int i, int i2) {
        if (mo3225a(i2)) {
            return true;
        }
        if (this.f3329a) {
            View view = this.f3332d;
            for (ViewParent parent = this.f3332d.getParent(); parent != null; parent = parent.getParent()) {
                if (C1062x.m3098a(parent, view, this.f3332d, i, i2)) {
                    m2989a(i2, parent);
                    C1062x.m3099b(parent, view, this.f3332d, i, i2);
                    return true;
                }
                if (parent instanceof View) {
                    view = (View) parent;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo3224a(float f, float f2, boolean z) {
        if (this.f3329a) {
            ViewParent d = m2990d(0);
            if (d != null) {
                return C1062x.m3097a(d, this.f3332d, f, f2, z);
            }
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo3227a(int i, int i2, int i3, int i4, int[] iArr) {
        return mo3228a(i, i2, i3, i4, iArr, 0);
    }

    /* renamed from: a */
    public final boolean mo3228a(int i, int i2, int i3, int i4, int[] iArr, int i5) {
        int i6;
        int i7;
        int[] iArr2 = iArr;
        if (this.f3329a) {
            ViewParent d = m2990d(i5);
            if (d == null) {
                return false;
            }
            if (i != 0 || i2 != 0 || i3 != 0 || i4 != 0) {
                if (iArr2 != null) {
                    this.f3332d.getLocationInWindow(iArr2);
                    i7 = iArr2[0];
                    i6 = iArr2[1];
                } else {
                    i7 = 0;
                    i6 = 0;
                }
                C1062x.m3094a(d, this.f3332d, i, i2, i3, i4, i5);
                if (iArr2 != null) {
                    this.f3332d.getLocationInWindow(iArr2);
                    iArr2[0] = iArr2[0] - i7;
                    iArr2[1] = iArr2[1] - i6;
                }
                return true;
            } else if (iArr2 != null) {
                iArr2[0] = 0;
                iArr2[1] = 0;
            }
        }
        return false;
    }
}
