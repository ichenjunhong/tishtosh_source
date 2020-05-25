package p2628d.p2650m;

import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: d.m.w */
public class C52839w extends C52838v {
    /* renamed from: c */
    public static final Integer m112395c(String str) {
        C52711k.m112240b(str, "$this$toIntOrNull");
        return C52830p.m112393a(str, 10);
    }

    /* renamed from: d */
    public static final Long m112396d(String str) {
        C52711k.m112240b(str, "$this$toLongOrNull");
        return C52830p.m112394b(str, 10);
    }

    /* renamed from: a */
    public static final Integer m112393a(String str, int i) {
        boolean z;
        C52711k.m112240b(str, "$this$toIntOrNull");
        C52804a.m112363a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        int i2 = 0;
        char charAt = str.charAt(0);
        int i3 = -2147483647;
        int i4 = 1;
        if (charAt >= '0') {
            z = false;
            i4 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                i3 = DynamicTabYellowPointVersion.DEFAULT;
                z = true;
            } else if (charAt != '+') {
                return null;
            } else {
                z = false;
            }
        }
        int i5 = -59652323;
        while (i4 < length) {
            int a = C52804a.m112362a(str.charAt(i4), 10);
            if (a < 0) {
                return null;
            }
            if (i2 < i5) {
                if (i5 != -59652323) {
                    return null;
                }
                i5 = i3 / 10;
                if (i2 < i5) {
                    return null;
                }
            }
            int i6 = i2 * 10;
            if (i6 < i3 + a) {
                return null;
            }
            i2 = i6 - a;
            i4++;
        }
        if (z) {
            return Integer.valueOf(i2);
        }
        return Integer.valueOf(-i2);
    }

    /* renamed from: b */
    public static final Long m112394b(String str, int i) {
        String str2 = str;
        C52711k.m112240b(str2, "$this$toLongOrNull");
        C52804a.m112363a(10);
        int length = str.length();
        if (length == 0) {
            return null;
        }
        boolean z = false;
        char charAt = str2.charAt(0);
        long j = -9223372036854775807L;
        int i2 = 1;
        if (charAt >= '0') {
            i2 = 0;
        } else if (length == 1) {
            return null;
        } else {
            if (charAt == '-') {
                j = Long.MIN_VALUE;
                z = true;
            } else if (charAt != '+') {
                return null;
            }
        }
        long j2 = 0;
        long j3 = -256204778801521550L;
        while (i2 < length) {
            int a = C52804a.m112362a(str2.charAt(i2), 10);
            if (a < 0) {
                return null;
            }
            if (j2 < j3) {
                if (j3 != -256204778801521550L) {
                    return null;
                }
                j3 = j / 10;
                if (j2 < j3) {
                    return null;
                }
            }
            long j4 = j2 * 10;
            long j5 = (long) a;
            if (j4 < j + j5) {
                return null;
            }
            j2 = j4 - j5;
            i2++;
        }
        if (z) {
            return Long.valueOf(j2);
        }
        return Long.valueOf(-j2);
    }
}
