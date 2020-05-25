package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fd */
public final class C16676fd extends C16675fc<Long> {
    public C16676fd(C16681fi fiVar, String str, Long l) {
        super(fiVar, str, l, null);
    }

    /* renamed from: b */
    private static Long m39837b(Object obj) {
        if (obj instanceof Long) {
            return (Long) obj;
        }
        if (obj instanceof String) {
            try {
                return Long.valueOf(Long.parseLong((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo31983a(Object obj) {
        return m39837b(obj);
    }
}
