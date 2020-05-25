package android.support.design.internal;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p043v7.widget.C1451bb;
import android.util.AttributeSet;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.design.internal.f */
public final class C0456f {

    /* renamed from: a */
    private static final int[] f1526a = {R.attr.fx};

    /* renamed from: b */
    private static final int[] f1527b = {R.attr.g0};

    /* renamed from: a */
    public static void m1108a(Context context) {
        m1110a(context, f1526a, "Theme.AppCompat");
    }

    /* renamed from: b */
    private static void m1113b(Context context) {
        m1110a(context, f1527b, "Theme.MaterialComponents");
    }

    /* renamed from: a */
    private static boolean m1111a(Context context, int[] iArr) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(iArr);
        boolean hasValue = obtainStyledAttributes.hasValue(0);
        obtainStyledAttributes.recycle();
        return hasValue;
    }

    /* renamed from: a */
    private static void m1110a(Context context, int[] iArr, String str) {
        if (!m1111a(context, iArr)) {
            StringBuilder sb = new StringBuilder("The style on this component requires your app theme to be ");
            sb.append(str);
            sb.append(" (or a descendant).");
            throw new IllegalArgumentException(sb.toString());
        }
    }

    /* renamed from: a */
    private static void m1109a(Context context, AttributeSet attributeSet, int i, int i2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842804, R.attr.ks, R.attr.kt}, i, i2);
        boolean z = obtainStyledAttributes.getBoolean(1, false);
        obtainStyledAttributes.recycle();
        if (z) {
            m1113b(context);
        }
        m1108a(context);
    }

    /* renamed from: a */
    public static TypedArray m1107a(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m1109a(context, attributeSet, i, i2);
        m1114c(context, attributeSet, iArr, i, i2, iArr2);
        return context.obtainStyledAttributes(attributeSet, iArr, i, i2);
    }

    /* renamed from: b */
    public static C1451bb m1112b(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        m1109a(context, attributeSet, i, i2);
        m1114c(context, attributeSet, iArr, i, i2, iArr2);
        return C1451bb.m5032a(context, attributeSet, iArr, i, i2);
    }

    /* renamed from: d */
    private static boolean m1115d(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, iArr, i, i2);
        for (int resourceId : iArr2) {
            if (obtainStyledAttributes.getResourceId(resourceId, -1) == -1) {
                obtainStyledAttributes.recycle();
                return false;
            }
        }
        obtainStyledAttributes.recycle();
        return true;
    }

    /* renamed from: c */
    private static void m1114c(Context context, AttributeSet attributeSet, int[] iArr, int i, int i2, int... iArr2) {
        boolean z;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{16842804, R.attr.ks, R.attr.kt}, i, i2);
        if (!obtainStyledAttributes.getBoolean(2, false)) {
            obtainStyledAttributes.recycle();
            return;
        }
        if (iArr2 != null && iArr2.length != 0) {
            z = m1115d(context, attributeSet, iArr, i, i2, iArr2);
        } else if (obtainStyledAttributes.getResourceId(0, -1) != -1) {
            z = true;
        } else {
            z = false;
        }
        obtainStyledAttributes.recycle();
        if (!z) {
            throw new IllegalArgumentException("This component requires that you specify a valid TextAppearance attribute. Update your app theme to inherit from Theme.MaterialComponents (or a descendant).");
        }
    }
}
