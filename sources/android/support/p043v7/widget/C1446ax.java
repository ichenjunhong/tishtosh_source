package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Color;
import android.support.p030v4.graphics.C0803a;
import android.util.AttributeSet;
import android.util.TypedValue;

/* renamed from: android.support.v7.widget.ax */
final class C1446ax {

    /* renamed from: a */
    static final int[] f5211a = {-16842910};

    /* renamed from: b */
    static final int[] f5212b = {16842908};

    /* renamed from: c */
    static final int[] f5213c = {16843518};

    /* renamed from: d */
    static final int[] f5214d = {16842919};

    /* renamed from: e */
    static final int[] f5215e = {16842912};

    /* renamed from: f */
    static final int[] f5216f = {16842913};

    /* renamed from: g */
    static final int[] f5217g = {-16842919, -16842908};

    /* renamed from: h */
    static final int[] f5218h = new int[0];

    /* renamed from: i */
    private static final ThreadLocal<TypedValue> f5219i = new ThreadLocal<>();

    /* renamed from: j */
    private static final int[] f5220j = new int[1];

    /* renamed from: a */
    private static TypedValue m5025a() {
        TypedValue typedValue = (TypedValue) f5219i.get();
        if (typedValue != null) {
            return typedValue;
        }
        TypedValue typedValue2 = new TypedValue();
        f5219i.set(typedValue2);
        return typedValue2;
    }

    /* renamed from: a */
    public static int m5023a(Context context, int i) {
        f5220j[0] = i;
        C1451bb a = C1451bb.m5031a(context, (AttributeSet) null, f5220j);
        try {
            return a.mo5655b(0, 0);
        } finally {
            a.mo5653a();
        }
    }

    /* renamed from: b */
    public static ColorStateList m5026b(Context context, int i) {
        f5220j[0] = i;
        C1451bb a = C1451bb.m5031a(context, (AttributeSet) null, f5220j);
        try {
            return a.mo5662e(0);
        } finally {
            a.mo5653a();
        }
    }

    /* renamed from: c */
    public static int m5027c(Context context, int i) {
        ColorStateList b = m5026b(context, i);
        if (b != null && b.isStateful()) {
            return b.getColorForState(f5211a, b.getDefaultColor());
        }
        TypedValue a = m5025a();
        context.getTheme().resolveAttribute(16842803, a, true);
        return m5024a(context, i, a.getFloat());
    }

    /* renamed from: a */
    private static int m5024a(Context context, int i, float f) {
        int a = m5023a(context, i);
        return C0803a.m2298b(a, Math.round(((float) Color.alpha(a)) * f));
    }
}
