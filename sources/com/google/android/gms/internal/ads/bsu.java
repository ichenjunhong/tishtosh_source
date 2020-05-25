package com.google.android.gms.internal.ads;

import android.net.Uri;
import java.util.Arrays;

public final class bsu {

    /* renamed from: a */
    public final Uri f43789a;

    /* renamed from: b */
    public final byte[] f43790b;

    /* renamed from: c */
    public final long f43791c;

    /* renamed from: d */
    public final long f43792d;

    /* renamed from: e */
    public final long f43793e;

    /* renamed from: f */
    public final String f43794f;

    /* renamed from: g */
    public final int f43795g;

    public bsu(Uri uri) {
        this(uri, 0);
    }

    private bsu(Uri uri, int i) {
        this(uri, 0, -1, null, 0);
    }

    public bsu(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, str, 0);
    }

    private bsu(Uri uri, long j, long j2, String str, int i) {
        this(uri, 0, 0, -1, null, 0);
    }

    private bsu(Uri uri, long j, long j2, long j3, String str, int i) {
        this(uri, null, j, j2, j3, str, 0);
    }

    public bsu(Uri uri, byte[] bArr, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        bti.m36699a(j >= 0);
        bti.m36699a(j2 >= 0);
        if (j3 > 0 || j3 == -1) {
            z = true;
        }
        bti.m36699a(z);
        this.f43789a = uri;
        this.f43790b = bArr;
        this.f43791c = j;
        this.f43792d = j2;
        this.f43793e = j3;
        this.f43794f = str;
        this.f43795g = i;
    }

    /* renamed from: a */
    public final boolean mo30670a(int i) {
        return (this.f43795g & 1) == 1;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f43789a);
        String arrays = Arrays.toString(this.f43790b);
        long j = this.f43791c;
        long j2 = this.f43792d;
        long j3 = this.f43793e;
        String str = this.f43794f;
        int i = this.f43795g;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 93 + String.valueOf(arrays).length() + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
        sb.append(", ");
        sb.append(arrays);
        sb.append(", ");
        sb.append(j);
        sb.append(", ");
        sb.append(j2);
        sb.append(", ");
        sb.append(j3);
        sb.append(", ");
        sb.append(str);
        sb.append(", ");
        sb.append(i);
        sb.append("]");
        return sb.toString();
    }
}
