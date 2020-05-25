package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fe */
public final class C16677fe extends C16675fc<Integer> {
    public C16677fe(C16681fi fiVar, String str, Integer num) {
        super(fiVar, str, num, null);
    }

    /* renamed from: b */
    private static Integer m39839b(Object obj) {
        if (obj instanceof Integer) {
            return (Integer) obj;
        }
        if (obj instanceof Long) {
            return Integer.valueOf(((Long) obj).intValue());
        }
        if (obj instanceof String) {
            try {
                return Integer.valueOf(Integer.parseInt((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo31983a(Object obj) {
        return m39839b(obj);
    }
}
