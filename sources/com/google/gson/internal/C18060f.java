package com.google.gson.internal;

import java.io.ObjectStreamException;
import java.math.BigDecimal;

/* renamed from: com.google.gson.internal.f */
public final class C18060f extends Number {

    /* renamed from: a */
    private final String f50108a;

    public final String toString() {
        return this.f50108a;
    }

    private Object writeReplace() throws ObjectStreamException {
        return new BigDecimal(this.f50108a);
    }

    public final double doubleValue() {
        return Double.parseDouble(this.f50108a);
    }

    public final float floatValue() {
        return Float.parseFloat(this.f50108a);
    }

    public final int hashCode() {
        return this.f50108a.hashCode();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x000e, code lost:
        return (int) java.lang.Long.parseLong(r2.f50108a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x001a, code lost:
        return new java.math.BigDecimal(r2.f50108a).intValue();
     */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:3:0x0007 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final int intValue() {
        /*
            r2 = this;
            java.lang.String r0 = r2.f50108a     // Catch:{ NumberFormatException -> 0x0007 }
            int r0 = java.lang.Integer.parseInt(r0)     // Catch:{ NumberFormatException -> 0x0007 }
            return r0
        L_0x0007:
            java.lang.String r0 = r2.f50108a     // Catch:{ NumberFormatException -> 0x000f }
            long r0 = java.lang.Long.parseLong(r0)     // Catch:{ NumberFormatException -> 0x000f }
            int r0 = (int) r0
            return r0
        L_0x000f:
            java.math.BigDecimal r0 = new java.math.BigDecimal
            java.lang.String r1 = r2.f50108a
            r0.<init>(r1)
            int r0 = r0.intValue()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.google.gson.internal.C18060f.intValue():int");
    }

    public final long longValue() {
        try {
            return Long.parseLong(this.f50108a);
        } catch (NumberFormatException unused) {
            return new BigDecimal(this.f50108a).longValue();
        }
    }

    public C18060f(String str) {
        this.f50108a = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18060f)) {
            return false;
        }
        C18060f fVar = (C18060f) obj;
        if (this.f50108a == fVar.f50108a || this.f50108a.equals(fVar.f50108a)) {
            return true;
        }
        return false;
    }
}
