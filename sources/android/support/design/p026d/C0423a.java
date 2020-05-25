package android.support.design.p026d;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.p043v7.p044a.p045a.C1124a;

/* renamed from: android.support.design.d.a */
public final class C0423a {
    /* renamed from: a */
    public static ColorStateList m1032a(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                ColorStateList a = C1124a.m3313a(context, resourceId);
                if (a != null) {
                    return a;
                }
            }
        }
        return typedArray.getColorStateList(i);
    }

    /* renamed from: b */
    public static Drawable m1033b(Context context, TypedArray typedArray, int i) {
        if (typedArray.hasValue(i)) {
            int resourceId = typedArray.getResourceId(i, 0);
            if (resourceId != 0) {
                Drawable b = C1124a.m3315b(context, resourceId);
                if (b != null) {
                    return b;
                }
            }
        }
        return typedArray.getDrawable(i);
    }
}
