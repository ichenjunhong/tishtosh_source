package com.google.android.gms.internal.ads;

public final class bml {

    /* renamed from: a */
    public static final bml f42970a = new bml(1.0f, 1.0f);

    /* renamed from: b */
    public final float f42971b;

    /* renamed from: c */
    public final float f42972c;

    /* renamed from: d */
    private final int f42973d;

    public bml(float f, float f2) {
        this.f42971b = f;
        this.f42972c = f2;
        this.f42973d = Math.round(f * 1000.0f);
    }

    /* renamed from: a */
    public final long mo30399a(long j) {
        return j * ((long) this.f42973d);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        bml bml = (bml) obj;
        return this.f42971b == bml.f42971b && this.f42972c == bml.f42972c;
    }

    public final int hashCode() {
        return ((Float.floatToRawIntBits(this.f42971b) + 527) * 31) + Float.floatToRawIntBits(this.f42972c);
    }
}
