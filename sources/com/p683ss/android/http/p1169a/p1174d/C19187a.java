package com.p683ss.android.http.p1169a.p1174d;

/* renamed from: com.ss.android.http.a.d.a */
public final class C19187a {

    /* renamed from: a */
    public byte[] f52886a;

    /* renamed from: b */
    public int f52887b;

    public C19187a(int i) {
        if (i >= 0) {
            this.f52886a = new byte[i];
            return;
        }
        throw new IllegalArgumentException("Buffer capacity may not be negative");
    }
}
