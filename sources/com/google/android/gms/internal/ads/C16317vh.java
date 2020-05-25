package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14963ax;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.vh */
public abstract class C16317vh implements acz<Void>, C16315vf {

    /* renamed from: a */
    private final agn<zzaxe> f45717a;

    /* renamed from: b */
    private final C16315vf f45718b;

    /* renamed from: c */
    private final Object f45719c = new Object();

    public C16317vh(agn<zzaxe> agn, C16315vf vfVar) {
        this.f45717a = agn;
        this.f45718b = vfVar;
    }

    /* renamed from: a */
    public abstract void mo31433a();

    /* renamed from: d */
    public abstract C16329vt mo31435d();

    /* renamed from: a */
    public final void mo31428a(zzaxi zzaxi) {
        synchronized (this.f45719c) {
            this.f45718b.mo31428a(zzaxi);
            mo31433a();
        }
    }

    /* renamed from: b */
    public final void mo28617b() {
        mo31433a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo31434a(C16329vt vtVar, zzaxe zzaxe) {
        try {
            vtVar.mo31445a(zzaxe, (C16332vw) new C16326vq(this));
            return true;
        } catch (Throwable th) {
            abv.m32795c("Could not fetch ad response from ad request service due to an Exception.", th);
            C14963ax.m30834d().mo28588a(th, "AdRequestClientTask.getAdResponseFromService");
            this.f45718b.mo31428a(new zzaxi(0));
            return false;
        }
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo28618c() {
        C16329vt d = mo31435d();
        if (d == null) {
            this.f45718b.mo31428a(new zzaxi(0));
            mo31433a();
            return null;
        }
        this.f45717a.mo28829a(new C16318vi(this, d), new C16320vk(this));
        return null;
    }
}
