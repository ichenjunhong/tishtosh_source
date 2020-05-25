package com.google.android.gms.internal.measurement;

/* renamed from: com.google.android.gms.internal.measurement.fg */
public final class C16679fg extends C16675fc<Double> {
    public C16679fg(C16681fi fiVar, String str, Double d) {
        super(fiVar, str, d, null);
    }

    /* renamed from: b */
    private static Double m39842b(Object obj) {
        if (obj instanceof Double) {
            return (Double) obj;
        }
        if (obj instanceof Float) {
            return Double.valueOf(((Float) obj).doubleValue());
        }
        if (obj instanceof String) {
            try {
                return Double.valueOf(Double.parseDouble((String) obj));
            } catch (NumberFormatException unused) {
            }
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo31983a(Object obj) {
        return m39842b(obj);
    }
}
