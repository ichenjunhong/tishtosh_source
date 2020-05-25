package com.google.android.gms.internal.ads;

public final class bxc {

    /* renamed from: a */
    final long f44497a;

    /* renamed from: b */
    final String f44498b;

    /* renamed from: c */
    final int f44499c;

    bxc(long j, String str, int i) {
        this.f44497a = j;
        this.f44498b = str;
        this.f44499c = i;
    }

    public final boolean equals(Object obj) {
        if (obj == null || !(obj instanceof bxc)) {
            return false;
        }
        bxc bxc = (bxc) obj;
        if (bxc.f44497a == this.f44497a && bxc.f44499c == this.f44499c) {
            return true;
        }
        return false;
    }

    public final int hashCode() {
        return (int) this.f44497a;
    }
}
