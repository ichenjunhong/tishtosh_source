package com.google.android.gms.internal.ads;

import com.google.android.gms.ads.internal.C14963ax;
import com.google.android.gms.ads.internal.C15002n;

/* renamed from: com.google.android.gms.internal.ads.kt */
final class C16032kt {

    /* renamed from: a */
    C15002n f45122a;

    /* renamed from: b */
    zzyv f45123b;

    /* renamed from: c */
    C15998jm f45124c;

    /* renamed from: d */
    long f45125d;

    /* renamed from: e */
    boolean f45126e;

    /* renamed from: f */
    boolean f45127f;

    /* renamed from: g */
    private final /* synthetic */ C16031ks f45128g;

    C16032kt(C16031ks ksVar, C15997jl jlVar) {
        this.f45128g = ksVar;
        C15002n nVar = new C15002n(jlVar.f45083a.getApplicationContext(), new zzyz(), ksVar.f45119c, jlVar.f45084b, jlVar.f45085c, jlVar.f45086d);
        this.f45122a = nVar;
        this.f45124c = new C15998jm();
        C15998jm jmVar = this.f45124c;
        C15002n nVar2 = this.f45122a;
        nVar2.mo27457a((cal) new C15999jn(jmVar));
        nVar2.mo27461a((C16147p) new C16007jv(jmVar));
        nVar2.mo27459a((C15813cr) new C16009jx(jmVar));
        nVar2.mo27456a((cai) new C16011jz(jmVar));
        nVar2.mo27466a((C16396yf) new C16014kb(jmVar));
    }

    C16032kt(C16031ks ksVar, C15997jl jlVar, zzyv zzyv) {
        this(ksVar, jlVar);
        this.f45123b = zzyv;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo31143a() {
        if (this.f45126e) {
            return false;
        }
        this.f45127f = this.f45122a.mo27482b(C16029kq.m37927b(this.f45123b != null ? this.f45123b : this.f45128g.f45118b));
        this.f45126e = true;
        this.f45125d = C14963ax.m30837g().mo28523a();
        return true;
    }
}
