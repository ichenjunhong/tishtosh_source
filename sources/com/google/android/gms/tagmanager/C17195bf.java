package com.google.android.gms.tagmanager;

/* renamed from: com.google.android.gms.tagmanager.bf */
final class C17195bf extends Number implements Comparable<C17195bf> {

    /* renamed from: a */
    private double f48615a;

    /* renamed from: b */
    private long f48616b;

    /* renamed from: c */
    private boolean f48617c = true;

    C17195bf(long j) {
        this.f48616b = j;
    }

    public final String toString() {
        return this.f48617c ? Long.toString(this.f48616b) : Double.toString(this.f48615a);
    }

    public final boolean equals(Object obj) {
        return (obj instanceof C17195bf) && compareTo((C17195bf) obj) == 0;
    }

    public final int hashCode() {
        return new Long(longValue()).hashCode();
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public int compareTo(C17195bf bfVar) {
        if (!this.f48617c || !bfVar.f48617c) {
            return Double.compare(doubleValue(), bfVar.doubleValue());
        }
        return new Long(this.f48616b).compareTo(Long.valueOf(bfVar.f48616b));
    }

    /* renamed from: a */
    public final boolean mo33445a() {
        return !this.f48617c;
    }

    /* renamed from: b */
    public final boolean mo33446b() {
        return this.f48617c;
    }

    public final double doubleValue() {
        return this.f48617c ? (double) this.f48616b : this.f48615a;
    }

    public final float floatValue() {
        return (float) doubleValue();
    }

    public final long longValue() {
        return this.f48617c ? this.f48616b : (long) this.f48615a;
    }

    public final int intValue() {
        return (int) longValue();
    }

    public final short shortValue() {
        return (short) ((int) longValue());
    }

    public final byte byteValue() {
        return (byte) ((int) longValue());
    }
}
