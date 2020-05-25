package com.google.android.gms.internal.ads;

import android.os.Bundle;
import android.view.View;
import com.google.android.gms.ads.formats.C14916b.C14918b;
import com.google.android.gms.ads.mediation.C15066h;
import com.google.android.gms.p1027a.C14882b;
import com.google.android.gms.p1027a.C14886d;
import java.util.ArrayList;
import java.util.List;

@C16299uq
/* renamed from: com.google.android.gms.internal.ads.ps */
public final class C16166ps extends C16152pe {

    /* renamed from: a */
    private final C15066h f45415a;

    public C16166ps(C15066h hVar) {
        this.f45415a = hVar;
    }

    /* renamed from: g */
    public final void mo31299g() {
    }

    /* renamed from: m */
    public final C15861ek mo31305m() {
        return null;
    }

    /* renamed from: o */
    public final C14882b mo31307o() {
        return null;
    }

    /* renamed from: a */
    public final String mo31289a() {
        return this.f45415a.f38901h;
    }

    /* renamed from: b */
    public final List mo31292b() {
        List<C14918b> list = this.f45415a.f38902i;
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
    public final String mo31294c() {
        return this.f45415a.f38903j;
    }

    /* renamed from: d */
    public final C15865eo mo31296d() {
        C14918b bVar = this.f45415a.f38904k;
        if (bVar == null) {
            return null;
        }
        C15827de deVar = new C15827de(bVar.mo27347a(), bVar.mo27348b(), bVar.mo27349c(), bVar.mo27350d(), bVar.mo27351e());
        return deVar;
    }

    /* renamed from: e */
    public final String mo31297e() {
        return this.f45415a.f38905l;
    }

    /* renamed from: f */
    public final String mo31298f() {
        return this.f45415a.f38906m;
    }

    /* renamed from: a */
    public final void mo31290a(C14882b bVar) {
        C14886d.m30545a(bVar);
    }

    /* renamed from: b */
    public final void mo31293b(C14882b bVar) {
        this.f45415a.mo27193a((View) C14886d.m30545a(bVar));
    }

    /* renamed from: a */
    public final void mo31291a(C14882b bVar, C14882b bVar2, C14882b bVar3) {
        C14886d.m30545a(bVar2);
        C14886d.m30545a(bVar3);
        C14886d.m30545a(bVar);
    }

    /* renamed from: c */
    public final void mo31295c(C14882b bVar) {
        C14886d.m30545a(bVar);
    }

    /* renamed from: h */
    public final boolean mo31300h() {
        return this.f45415a.f38886a;
    }

    /* renamed from: i */
    public final boolean mo31301i() {
        return this.f45415a.f38887b;
    }

    /* renamed from: j */
    public final Bundle mo31302j() {
        return this.f45415a.f38888c;
    }

    /* renamed from: k */
    public final C14882b mo31303k() {
        View view = this.f45415a.f38889d;
        if (view == null) {
            return null;
        }
        return C14886d.m30544a(view);
    }

    /* renamed from: l */
    public final C15583ak mo31304l() {
        if (this.f45415a.f38891f != null) {
            return this.f45415a.f38891f.mo27430a();
        }
        return null;
    }

    /* renamed from: n */
    public final C14882b mo31306n() {
        View view = this.f45415a.f38890e;
        if (view == null) {
            return null;
        }
        return C14886d.m30544a(view);
    }
}
