package android.support.p030v4.view;

import android.os.Build.VERSION;
import android.view.View;
import android.view.ViewParent;

/* renamed from: android.support.v4.view.x */
public final class C1062x {
    /* renamed from: a */
    public static void m3093a(ViewParent viewParent, View view, int i) {
        if (viewParent instanceof C1049n) {
            ((C1049n) viewParent).mo1332b(view, i);
            return;
        }
        if (i == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onStopNestedScroll(view);
                } catch (AbstractMethodError unused) {
                }
            } else if (viewParent instanceof C1048m) {
                ((C1048m) viewParent).onStopNestedScroll(view);
            }
        }
    }

    /* renamed from: a */
    public static boolean m3096a(ViewParent viewParent, View view, float f, float f2) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedPreFling(view, f, f2);
            } catch (AbstractMethodError unused) {
            }
        } else {
            if (viewParent instanceof C1048m) {
                return ((C1048m) viewParent).onNestedPreFling(view, f, f2);
            }
            return false;
        }
    }

    /* renamed from: b */
    public static void m3099b(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C1049n) {
            ((C1049n) viewParent).mo1333b(view, view2, i, i2);
            return;
        }
        if (i2 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScrollAccepted(view, view2, i);
                } catch (AbstractMethodError unused) {
                }
            } else if (viewParent instanceof C1048m) {
                ((C1048m) viewParent).onNestedScrollAccepted(view, view2, i);
            }
        }
    }

    /* renamed from: a */
    public static boolean m3097a(ViewParent viewParent, View view, float f, float f2, boolean z) {
        if (VERSION.SDK_INT >= 21) {
            try {
                return viewParent.onNestedFling(view, f, f2, z);
            } catch (AbstractMethodError unused) {
            }
        } else {
            if (viewParent instanceof C1048m) {
                return ((C1048m) viewParent).onNestedFling(view, f, f2, z);
            }
            return false;
        }
    }

    /* renamed from: a */
    public static boolean m3098a(ViewParent viewParent, View view, View view2, int i, int i2) {
        if (viewParent instanceof C1049n) {
            return ((C1049n) viewParent).mo1330a(view, view2, i, i2);
        }
        if (i2 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    return viewParent.onStartNestedScroll(view, view2, i);
                } catch (AbstractMethodError unused) {
                }
            } else if (viewParent instanceof C1048m) {
                return ((C1048m) viewParent).onStartNestedScroll(view, view2, i);
            }
        }
        return false;
    }

    /* renamed from: a */
    public static void m3095a(ViewParent viewParent, View view, int i, int i2, int[] iArr, int i3) {
        if (viewParent instanceof C1049n) {
            ((C1049n) viewParent).mo1328a(view, i, i2, iArr, i3);
            return;
        }
        if (i3 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedPreScroll(view, i, i2, iArr);
                } catch (AbstractMethodError unused) {
                }
            } else if (viewParent instanceof C1048m) {
                ((C1048m) viewParent).onNestedPreScroll(view, i, i2, iArr);
            }
        }
    }

    /* renamed from: a */
    public static void m3094a(ViewParent viewParent, View view, int i, int i2, int i3, int i4, int i5) {
        if (viewParent instanceof C1049n) {
            ((C1049n) viewParent).mo1327a(view, i, i2, i3, i4, i5);
            return;
        }
        if (i5 == 0) {
            if (VERSION.SDK_INT >= 21) {
                try {
                    viewParent.onNestedScroll(view, i, i2, i3, i4);
                } catch (AbstractMethodError unused) {
                }
            } else if (viewParent instanceof C1048m) {
                ((C1048m) viewParent).onNestedScroll(view, i, i2, i3, i4);
            }
        }
    }
}
