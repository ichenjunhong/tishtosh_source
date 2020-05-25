package p2628d.p2650m;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.m.v */
public class C52838v extends C52837u {
    /* renamed from: a */
    public static final Float m112391a(String str) {
        C52711k.m112240b(str, "$this$toFloatOrNull");
        try {
            if (C52829o.f131082a.matches(str)) {
                return Float.valueOf(Float.parseFloat(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static final Double m112392b(String str) {
        C52711k.m112240b(str, "$this$toDoubleOrNull");
        try {
            if (C52829o.f131082a.matches(str)) {
                return Double.valueOf(Double.parseDouble(str));
            }
            return null;
        } catch (NumberFormatException unused) {
            return null;
        }
    }
}
