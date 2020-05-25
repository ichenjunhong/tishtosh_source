package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C14916b.C14918b;
import com.google.android.gms.ads.mediation.C15069k;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.qa */
public final class C16175qa extends C16155ph {

    /* renamed from: a */
    private final C15069k f45437a;

    public C16175qa(C15069k kVar) {
        this.f45437a = kVar;
    }

    /* renamed from: k */
    public final C15861ek mo31321k() {
        return null;
    }

    /* renamed from: r */
    public final void mo31328r() {
    }

    /* renamed from: a */
    public final String mo31308a() {
        return this.f45437a.f38907a;
    }

    /* renamed from: b */
    public final List mo31311b() {
        List<C14918b> list = this.f45437a.f38908b;
        ArrayList arrayList = new ArrayList();
        if (list != null) {
            for (C14918b bVar : list) {
                C15827de deVar = new C15827de(bVar.mo27347a(), bVar.mo27348b(), bVar.mo27349c(), bVar.mo27350d(), bVar.mo27351e());
                arrayList.add(deVar);
            }
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String mo31313c() {
        return this.f45437a.f38909c;
    }

    /* renamed from: d */
    public final C15865eo mo31314d() {
        C14918b bVar = this.f45437a.f38910d;
        if (bVar == null) {
            return null;
        }
        C15827de deVar = new C15827de(bVar.mo27347a(), bVar.mo27348b(), bVar.mo27349c(), bVar.mo27350d(), bVar.mo27351e());
        return deVar;
    }

    /* renamed from: e */
    public final String mo31315e() {
        return this.f45437a.f38911e;
    }

    /* renamed from: f */
    public final String mo31316f() {
        return this.f45437a.f38912f;
    }

    /* renamed from: g */
    public final double mo31317g() {
        if (this.f45437a.f38913g != null) {
            return this.f45437a.f38913g.doubleValue();
        }
        return -1.0d;
    }

    /* renamed from: h */
    public final String mo31318h() {
        return this.f45437a.f38914h;
    }

    /* renamed from: i */
    public final String mo31319i() {
        return this.f45437a.f38915i;
    }

    /* renamed from: j */
    public final C15583ak mo31320j() {
        if (this.f45437a.f38916j != null) {
            return this.f45437a.f38916j.mo27430a();
        }
        return null;
    }

    /* renamed from: l */
    public final C14882b mo31322l() {
        View view = this.f45437a.f38918l;
        if (view == null) {
            return null;
        }
        return C14886d.m30544a(view);
    }

    /* renamed from: m */
    public final C14882b mo31323m() {
        View view = this.f45437a.f38919m;
        if (view == null) {
            return null;
        }
        return C14886d.m30544a(view);
    }

    /* renamed from: n */
    public final C14882b mo31324n() {
        Object obj = this.f45437a.f38920n;
        if (obj == null) {
            return null;
        }
        return C14886d.m30544a(obj);
    }

    /* renamed from: o */
    public final Bundle mo31325o() {
        return this.f45437a.f38921o;
    }

    /* renamed from: p */
    public final boolean mo31326p() {
        return this.f45437a.f38922p;
    }

    /* renamed from: q */
    public final boolean mo31327q() {
        return this.f45437a.f38923q;
    }

    /* renamed from: a */
    public final void mo31309a(C14882b bVar) {
        C14886d.m30545a(bVar);
    }

    /* renamed from: a */
    public final void mo31310a(C14882b bVar, C14882b bVar2, C14882b bVar3) {
        this.f45437a.mo27194a((View) C14886d.m30545a(bVar), (HashMap) C14886d.m30545a(bVar2), (HashMap) C14886d.m30545a(bVar3));
    }

    /* renamed from: b */
    public final void mo31312b(C14882b bVar) {
        C14886d.m30545a(bVar);
    }
}
