package com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.d.a.a.a.c */
public final class C48543c implements Serializable, Comparable<C48543c> {
    private static final long serialVersionUID = 7003130400674500845L;
    public final double mDownThreshold;
    public final double mRate;
    public final double mUpThreshold;

    public final double getMedianThreshold() {
        return (this.mDownThreshold + this.mUpThreshold) / 2.0d;
    }

    public final int hashCode() {
        long doubleToLongBits = Double.doubleToLongBits(this.mRate);
        int i = (int) (doubleToLongBits ^ (doubleToLongBits >>> 32));
        long doubleToLongBits2 = Double.doubleToLongBits(this.mDownThreshold);
        int i2 = (i * 31) + ((int) (doubleToLongBits2 ^ (doubleToLongBits2 >>> 32)));
        long doubleToLongBits3 = Double.doubleToLongBits(this.mUpThreshold);
        return (i2 * 31) + ((int) ((doubleToLongBits3 >>> 32) ^ doubleToLongBits3));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Shift{mRate=");
        sb.append(this.mRate);
        sb.append(", mDownThreshold=");
        sb.append(this.mDownThreshold);
        sb.append(", mUpThreshold=");
        sb.append(this.mUpThreshold);
        sb.append('}');
        return sb.toString();
    }

    public final int compareTo(C48543c cVar) {
        return Double.compare(this.mRate, cVar.mRate);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C48543c)) {
            return false;
        }
        C48543c cVar = (C48543c) obj;
        if (Double.compare(cVar.mRate, this.mRate) == 0 && Double.compare(cVar.mDownThreshold, this.mDownThreshold) == 0 && Double.compare(cVar.mUpThreshold, this.mUpThreshold) == 0) {
            return true;
        }
        return false;
    }

    public C48543c(double d, double d2, double d3) {
        this.mRate = d;
        this.mDownThreshold = d2;
        this.mUpThreshold = d3;
    }
}
