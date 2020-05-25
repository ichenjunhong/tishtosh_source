package android.support.p043v7.widget;

import android.graphics.PorterDuff.Mode;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Drawable.ConstantState;
import android.graphics.drawable.DrawableContainer;
import android.graphics.drawable.DrawableContainer.DrawableContainerState;
import android.graphics.drawable.GradientDrawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.LayerDrawable;
import android.graphics.drawable.ScaleDrawable;
import android.os.Build.VERSION;
import android.support.p030v4.graphics.drawable.C0815f;
import android.support.p043v7.p046b.p047a.C1193c;

/* renamed from: android.support.v7.widget.y */
public final class C1518y {

    /* renamed from: a */
    public static final Rect f5456a = new Rect();

    /* renamed from: b */
    private static Class<?> f5457b;

    static {
        if (VERSION.SDK_INT >= 18) {
            try {
                f5457b = Class.forName("android.graphics.Insets");
            } catch (ClassNotFoundException unused) {
            }
        }
    }

    /* renamed from: b */
    static void m5427b(Drawable drawable) {
        if (VERSION.SDK_INT == 21 && "android.graphics.drawable.VectorDrawable".equals(drawable.getClass().getName())) {
            m5429d(drawable);
        }
    }

    /* renamed from: d */
    private static void m5429d(Drawable drawable) {
        int[] state = drawable.getState();
        if (state == null || state.length == 0) {
            drawable.setState(C1446ax.f5215e);
        } else {
            drawable.setState(C1446ax.f5218h);
        }
        drawable.setState(state);
    }

    /* renamed from: c */
    public static boolean m5428c(Drawable drawable) {
        while (true) {
            if (VERSION.SDK_INT < 15 && (drawable instanceof InsetDrawable)) {
                return false;
            }
            if (VERSION.SDK_INT < 15 && (drawable instanceof GradientDrawable)) {
                return false;
            }
            if (VERSION.SDK_INT >= 17 || !(drawable instanceof LayerDrawable)) {
                if (!(drawable instanceof DrawableContainer)) {
                    if (!(drawable instanceof C0815f)) {
                        if (!(drawable instanceof C1193c)) {
                            if (!(drawable instanceof ScaleDrawable)) {
                                break;
                            }
                            drawable = ((ScaleDrawable) drawable).getDrawable();
                        } else {
                            drawable = ((C1193c) drawable).f3949l;
                        }
                    } else {
                        drawable = ((C0815f) drawable).mo2623a();
                    }
                } else {
                    ConstantState constantState = drawable.getConstantState();
                    if (constantState instanceof DrawableContainerState) {
                        for (Drawable c : ((DrawableContainerState) constantState).getChildren()) {
                            if (!m5428c(c)) {
                                return false;
                            }
                        }
                    }
                }
            } else {
                return false;
            }
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:33:0x007e A[Catch:{ Exception -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:34:0x007f A[Catch:{ Exception -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x0086 A[Catch:{ Exception -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:36:0x008d A[Catch:{ Exception -> 0x009e }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x0094 A[Catch:{ Exception -> 0x009e }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.graphics.Rect m5426a(android.graphics.drawable.Drawable r10) {
        /*
            java.lang.Class<?> r0 = f5457b
            if (r0 == 0) goto L_0x009e
            boolean r0 = r10 instanceof android.support.p030v4.graphics.drawable.C0815f     // Catch:{ Exception -> 0x009e }
            if (r0 == 0) goto L_0x000e
            android.support.v4.graphics.drawable.f r10 = (android.support.p030v4.graphics.drawable.C0815f) r10     // Catch:{ Exception -> 0x009e }
            android.graphics.drawable.Drawable r10 = r10.mo2623a()     // Catch:{ Exception -> 0x009e }
        L_0x000e:
            java.lang.Class r0 = r10.getClass()     // Catch:{ Exception -> 0x009e }
            java.lang.String r1 = "getOpticalInsets"
            r2 = 0
            java.lang.Class[] r3 = new java.lang.Class[r2]     // Catch:{ Exception -> 0x009e }
            java.lang.reflect.Method r0 = r0.getMethod(r1, r3)     // Catch:{ Exception -> 0x009e }
            java.lang.Object[] r1 = new java.lang.Object[r2]     // Catch:{ Exception -> 0x009e }
            java.lang.Object r10 = r0.invoke(r10, r1)     // Catch:{ Exception -> 0x009e }
            if (r10 == 0) goto L_0x009e
            android.graphics.Rect r0 = new android.graphics.Rect     // Catch:{ Exception -> 0x009e }
            r0.<init>()     // Catch:{ Exception -> 0x009e }
            java.lang.Class<?> r1 = f5457b     // Catch:{ Exception -> 0x009e }
            java.lang.reflect.Field[] r1 = r1.getFields()     // Catch:{ Exception -> 0x009e }
            int r3 = r1.length     // Catch:{ Exception -> 0x009e }
            r4 = 0
        L_0x0030:
            if (r4 >= r3) goto L_0x009d
            r5 = r1[r4]     // Catch:{ Exception -> 0x009e }
            java.lang.String r6 = r5.getName()     // Catch:{ Exception -> 0x009e }
            r7 = -1
            int r8 = r6.hashCode()     // Catch:{ Exception -> 0x009e }
            r9 = -1383228885(0xffffffffad8d9a2b, float:-1.6098308E-11)
            if (r8 == r9) goto L_0x0070
            r9 = 115029(0x1c155, float:1.6119E-40)
            if (r8 == r9) goto L_0x0066
            r9 = 3317767(0x32a007, float:4.649182E-39)
            if (r8 == r9) goto L_0x005c
            r9 = 108511772(0x677c21c, float:4.6598146E-35)
            if (r8 == r9) goto L_0x0052
            goto L_0x007a
        L_0x0052:
            java.lang.String r8 = "right"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x009e }
            if (r6 == 0) goto L_0x007a
            r6 = 2
            goto L_0x007b
        L_0x005c:
            java.lang.String r8 = "left"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x009e }
            if (r6 == 0) goto L_0x007a
            r6 = 0
            goto L_0x007b
        L_0x0066:
            java.lang.String r8 = "top"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x009e }
            if (r6 == 0) goto L_0x007a
            r6 = 1
            goto L_0x007b
        L_0x0070:
            java.lang.String r8 = "bottom"
            boolean r6 = r6.equals(r8)     // Catch:{ Exception -> 0x009e }
            if (r6 == 0) goto L_0x007a
            r6 = 3
            goto L_0x007b
        L_0x007a:
            r6 = -1
        L_0x007b:
            switch(r6) {
                case 0: goto L_0x0094;
                case 1: goto L_0x008d;
                case 2: goto L_0x0086;
                case 3: goto L_0x007f;
                default: goto L_0x007e;
            }     // Catch:{ Exception -> 0x009e }
        L_0x007e:
            goto L_0x009a
        L_0x007f:
            int r5 = r5.getInt(r10)     // Catch:{ Exception -> 0x009e }
            r0.bottom = r5     // Catch:{ Exception -> 0x009e }
            goto L_0x009a
        L_0x0086:
            int r5 = r5.getInt(r10)     // Catch:{ Exception -> 0x009e }
            r0.right = r5     // Catch:{ Exception -> 0x009e }
            goto L_0x009a
        L_0x008d:
            int r5 = r5.getInt(r10)     // Catch:{ Exception -> 0x009e }
            r0.top = r5     // Catch:{ Exception -> 0x009e }
            goto L_0x009a
        L_0x0094:
            int r5 = r5.getInt(r10)     // Catch:{ Exception -> 0x009e }
            r0.left = r5     // Catch:{ Exception -> 0x009e }
        L_0x009a:
            int r4 = r4 + 1
            goto L_0x0030
        L_0x009d:
            return r0
        L_0x009e:
            android.graphics.Rect r10 = f5456a
            return r10
        */
        throw new UnsupportedOperationException("Method not decompiled: android.support.p043v7.widget.C1518y.m5426a(android.graphics.drawable.Drawable):android.graphics.Rect");
    }

    /* renamed from: a */
    public static Mode m5425a(int i, Mode mode) {
        if (i == 3) {
            return Mode.SRC_OVER;
        }
        if (i == 5) {
            return Mode.SRC_IN;
        }
        if (i == 9) {
            return Mode.SRC_ATOP;
        }
        switch (i) {
            case 14:
                return Mode.MULTIPLY;
            case 15:
                return Mode.SCREEN;
            case 16:
                return Mode.ADD;
            default:
                return mode;
        }
    }
}
