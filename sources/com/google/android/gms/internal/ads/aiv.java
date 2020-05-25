package com.google.android.gms.internal.ads;

final /* synthetic */ class aiv implements Runnable {

    /* renamed from: a */
    private final ain f40643a;

    /* renamed from: b */
    private final String f40644b;

    /* renamed from: c */
    private final String f40645c;

    aiv(ain ain, String str, String str2) {
        this.f40643a = ain;
        this.f40644b = str;
        this.f40645c = str2;
    }

    public final void run() {
        ain ain = this.f40643a;
        String str = this.f40644b;
        String str2 = this.f40645c;
        if (ain.f40608d != null) {
            ain.f40608d.mo28878a(str, str2);
        }
    }
}
