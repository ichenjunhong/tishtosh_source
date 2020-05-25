package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.ff */
public final class C16678ff extends C16675fc<Boolean> {
    public C16678ff(C16681fi fiVar, String str, Boolean bool) {
        super(fiVar, str, bool, null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo31983a(Object obj) {
        if (obj instanceof Boolean) {
            return (Boolean) obj;
        }
        if (obj instanceof String) {
            String str = (String) obj;
            if (C16660eo.f46879b.matcher(str).matches()) {
                return Boolean.valueOf(true);
            }
            if (C16660eo.f46880c.matcher(str).matches()) {
                return Boolean.valueOf(false);
            }
        }
        return null;
    }
}
