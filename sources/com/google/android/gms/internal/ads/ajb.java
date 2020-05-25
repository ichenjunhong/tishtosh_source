package com.google.android.gms.internal.ads;

final class ajb implements bhb {

    /* renamed from: a */
    private final /* synthetic */ ain f40655a;

    ajb(ain ain) {
        this.f40655a = ain;
    }

    /* renamed from: a */
    public final void mo28975a() {
    }

    /* renamed from: a */
    public final void mo28977a(boolean z, int i) {
        if (this.f40655a.f40609e != i) {
            this.f40655a.f40609e = i;
            switch (i) {
                case 4:
                    this.f40655a.mo28983f();
                    return;
                case 5:
                    ain.m33021a(this.f40655a);
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo28976a(bgy bgy) {
        this.f40655a.m33023a("PlayerError", bgy.getMessage());
    }
}
