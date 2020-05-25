package kotlinx.coroutines.internal;

import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: kotlinx.coroutines.internal.v */
public final class C53333v {

    /* renamed from: a */
    private static final int f131960a = Runtime.getRuntime().availableProcessors();

    /* renamed from: a */
    public static final int m113363a() {
        return f131960a;
    }

    /* renamed from: a */
    public static final String m113367a(String str) {
        C52711k.m112240b(str, "propertyName");
        try {
            return System.getProperty(str);
        } catch (SecurityException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static final boolean m113368a(String str, boolean z) {
        C52711k.m112240b(str, "propertyName");
        try {
            String property = System.getProperty(str);
            if (property != null) {
                return Boolean.parseBoolean(property);
            }
            return true;
        } catch (SecurityException unused) {
            return true;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public static long m113365a(String str, long j, long j2, long j3) {
        C52711k.m112240b(str, "propertyName");
        String a = m113367a(str);
        if (a == null) {
            return j;
        }
        Long d = C52830p.m112396d(a);
        if (d != null) {
            long longValue = d.longValue();
            if (j2 <= longValue && j3 >= longValue) {
                return longValue;
            }
            StringBuilder sb = new StringBuilder("System property '");
            sb.append(str);
            sb.append("' should be in range ");
            sb.append(j2);
            sb.append("..");
            sb.append(j3);
            sb.append(", but is '");
            sb.append(longValue);
            sb.append('\'');
            throw new IllegalStateException(sb.toString().toString());
        }
        StringBuilder sb2 = new StringBuilder("System property '");
        sb2.append(str);
        sb2.append("' has unrecognized value '");
        sb2.append(a);
        sb2.append('\'');
        throw new IllegalStateException(sb2.toString().toString());
    }

    /* renamed from: a */
    public static /* synthetic */ int m113364a(String str, int i, int i2, int i3, int i4, Object obj) {
        if ((i4 & 4) != 0) {
            i2 = 1;
        }
        if ((i4 & 8) != 0) {
            i3 = Integer.MAX_VALUE;
        }
        C52711k.m112240b(str, "propertyName");
        return (int) m113365a(str, (long) i, (long) i2, (long) i3);
    }
}
