package com.google.android.gms.internal.ads;

import com.google.android.gms.common.internal.C15464q;

/* renamed from: com.google.android.gms.internal.ads.ms */
public final class C16085ms extends agr<C16053ln> {

    /* renamed from: a */
    C15567adm<C16053ln> f45230a;

    /* renamed from: b */
    private final Object f45231b = new Object();

    /* renamed from: c */
    private boolean f45232c;

    /* renamed from: d */
    private int f45233d;

    public C16085ms(C15567adm<C16053ln> adm) {
        this.f45230a = adm;
        this.f45232c = false;
        this.f45233d = 0;
    }

    /* renamed from: a */
    public final C16081mo mo31183a() {
        C16081mo moVar = new C16081mo(this);
        synchronized (this.f45231b) {
            mo28829a(new C16086mt(this, moVar), new C16087mu(this, moVar));
            C15464q.m32129a(this.f45233d >= 0);
            this.f45233d++;
        }
        return moVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo31184b() {
        synchronized (this.f45231b) {
            C15464q.m32129a(this.f45233d > 0);
            abv.m32494a("Releasing 1 reference for JS Engine");
            this.f45233d--;
            m38068f();
        }
    }

    /* renamed from: c */
    public final void mo31185c() {
        synchronized (this.f45231b) {
            C15464q.m32129a(this.f45233d >= 0);
            abv.m32494a("Releasing root reference. JS Engine will be destroyed once other references are released.");
            this.f45232c = true;
            m38068f();
        }
    }

    /* renamed from: f */
    private final void m38068f() {
        synchronized (this.f45231b) {
            C15464q.m32129a(this.f45233d >= 0);
            if (!this.f45232c || this.f45233d != 0) {
                abv.m32494a("There are still references to the engine. Not destroying.");
            } else {
                abv.m32494a("No reference is left (including root). Cleaning up engine.");
                mo28829a(new C16088mv(this), new agp());
            }
        }
    }
}
