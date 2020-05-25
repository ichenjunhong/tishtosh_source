package com.google.android.gms.internal.ads;

import android.net.Uri;

public final class bkn {

    /* renamed from: a */
    public final Uri f42786a;

    /* renamed from: b */
    public final long f42787b;

    /* renamed from: c */
    public final long f42788c;

    /* renamed from: d */
    public final long f42789d;

    /* renamed from: e */
    public final String f42790e;

    /* renamed from: f */
    public final int f42791f;

    public bkn(Uri uri) {
        this(uri, 0);
    }

    private bkn(Uri uri, int i) {
        this(uri, 0, -1, null, 0);
    }

    public bkn(Uri uri, long j, long j2, String str) {
        this(uri, j, j, j2, null, 0);
    }

    private bkn(Uri uri, long j, long j2, String str, int i) {
        this(uri, 0, 0, -1, null, 0);
    }

    public bkn(Uri uri, long j, long j2, long j3, String str, int i) {
        boolean z = false;
        blg.m35999a(j >= 0);
        blg.m35999a(j2 >= 0);
        if (j3 > 0 || j3 == -1) {
            z = true;
        }
        blg.m35999a(z);
        this.f42786a = uri;
        this.f42787b = j;
        this.f42788c = j2;
        this.f42789d = j3;
        this.f42790e = str;
        this.f42791f = i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.f42786a);
        long j = this.f42787b;
        long j2 = this.f42788c;
        long j3 = this.f42789d;
        String str = this.f42790e;
        int i = this.f42791f;
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 91 + String.valueOf(str).length());
        sb.append("DataSpec[");
        sb.append(valueOf);
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
