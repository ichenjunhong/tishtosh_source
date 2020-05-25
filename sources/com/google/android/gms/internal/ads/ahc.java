package com.google.android.gms.internal.ads;

final class ahc implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ String f40472a;

    /* renamed from: b */
    private final /* synthetic */ String f40473b;

    /* renamed from: c */
    private final /* synthetic */ agy f40474c;

    ahc(agy agy, String str, String str2) {
        this.f40474c = agy;
        this.f40472a = str;
        this.f40473b = str2;
    }

    public final void run() {
        if (this.f40474c.f40453a != null) {
            this.f40474c.f40453a.mo28878a(this.f40472a, this.f40473b);
        }
    }
}
