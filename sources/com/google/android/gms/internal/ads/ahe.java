package com.google.android.gms.internal.ads;

final class ahe implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ int f40476a;

    /* renamed from: b */
    private final /* synthetic */ int f40477b;

    /* renamed from: c */
    private final /* synthetic */ agy f40478c;

    ahe(agy agy, int i, int i2) {
        this.f40478c = agy;
        this.f40476a = i;
        this.f40477b = i2;
    }

    public final void run() {
        if (this.f40478c.f40453a != null) {
            this.f40478c.f40453a.mo28877a(this.f40476a, this.f40477b);
        }
    }
}
