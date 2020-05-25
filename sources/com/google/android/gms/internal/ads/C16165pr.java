package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C14916b.C14918b;
import com.google.android.gms.ads.mediation.C15065g;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.ArrayList;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.pr */
public final class C16165pr extends C16149pb {

    /* renamed from: a */
    private final C15065g f45414a;

    public C16165pr(C15065g gVar) {
        this.f45414a = gVar;
    }

    /* renamed from: i */
    public final void mo31280i() {
    }

    /* renamed from: o */
    public final C15861ek mo31286o() {
        return null;
    }

    /* renamed from: q */
    public final C14882b mo31288q() {
        return null;
    }

    /* renamed from: a */
    public final String mo31268a() {
        return this.f45414a.f38893h;
    }

    /* renamed from: b */
    public final List mo31271b() {
        List<C14918b> list = this.f45414a.f38894i;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        for (C14918b bVar : list) {
            C15827de deVar = new C15827de(bVar.mo27347a(), bVar.mo27348b(), bVar.mo27349c(), bVar.mo27350d(), bVar.mo27351e());
            arrayList.add(deVar);
        }
        return arrayList;
    }

    /* renamed from: c */
    public final String mo31273c() {
        return this.f45414a.f38895j;
    }

    /* renamed from: d */
    public final C15865eo mo31275d() {
        C14918b bVar = this.f45414a.f38896k;
        if (bVar == null) {
            return null;
        }
        C15827de deVar = new C15827de(bVar.mo27347a(), bVar.mo27348b(), bVar.mo27349c(), bVar.mo27350d(), bVar.mo27351e());
        return deVar;
    }

    /* renamed from: e */
    public final String mo31276e() {
        return this.f45414a.f38897l;
    }

    /* renamed from: f */
    public final double mo31277f() {
        return this.f45414a.f38898m;
    }

    /* renamed from: g */
    public final String mo31278g() {
        return this.f45414a.f38899n;
    }

    /* renamed from: h */
    public final String mo31279h() {
        return this.f45414a.f38900o;
    }

    /* renamed from: a */
    public final void mo31269a(C14882b bVar) {
        C14886d.m30545a(bVar);
    }

    /* renamed from: b */
    public final void mo31272b(C14882b bVar) {
        this.f45414a.mo27193a((View) C14886d.m30545a(bVar));
    }

    /* renamed from: a */
    public final void mo31270a(C14882b bVar, C14882b bVar2, C14882b bVar3) {
        C14886d.m30545a(bVar2);
        C14886d.m30545a(bVar3);
        C14886d.m30545a(bVar);
    }

    /* renamed from: c */
    public final void mo31274c(C14882b bVar) {
        C14886d.m30545a(bVar);
    }

    /* renamed from: j */
    public final boolean mo31281j() {
        return this.f45414a.f38886a;
    }

    /* renamed from: k */
    public final boolean mo31282k() {
        return this.f45414a.f38887b;
    }

    /* renamed from: l */
    public final Bundle mo31283l() {
        return this.f45414a.f38888c;
    }

    /* renamed from: m */
    public final C15583ak mo31284m() {
        if (this.f45414a.f38891f != null) {
            return this.f45414a.f38891f.mo27430a();
        }
        return null;
    }

    /* renamed from: n */
    public final C14882b mo31285n() {
        View view = this.f45414a.f38889d;
        if (view == null) {
            return null;
        }
        return C14886d.m30544a(view);
    }

    /* renamed from: p */
    public final C14882b mo31287p() {
        View view = this.f45414a.f38890e;
        if (view == null) {
            return null;
        }
        return C14886d.m30544a(view);
    }
}
