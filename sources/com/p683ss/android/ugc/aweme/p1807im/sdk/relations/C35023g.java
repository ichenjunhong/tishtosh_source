package com.p683ss.android.ugc.aweme.p1807im.sdk.relations;

import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.C33212a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34957e;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34960f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C34992h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.C35003i;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1881b.C34920d;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.core.p1884e.C34958a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.g */
public final class C35023g extends C33212a<C35028j> implements C34920d<IMContact>, C34957e {

    /* renamed from: b */
    public C35003i f90104b;

    /* renamed from: a */
    public final void mo73129a() {
        if (this.f86208a != null) {
            ((C35028j) this.f86208a).mo73153m();
        }
        List d = this.f90104b.mo72989d();
        if (!d.isEmpty()) {
            mo72984a(d, this.f90104b.mo72990e());
        } else {
            this.f90104b.mo72991f();
        }
    }

    /* renamed from: a */
    public final void mo72983a(Throwable th) {
        C32458a.m75148a(th);
    }

    /* renamed from: b */
    public final void mo72986b(Throwable th) {
        C32458a.m75148a(th);
    }

    /* renamed from: c */
    public final void mo73057c(Throwable th) {
        C32458a.m75148a(th);
    }

    /* renamed from: a */
    public final void mo73056a(List<IMContact> list, String str) {
        ((C35028j) this.f86208a).mo72968a(list, (CharSequence) str);
    }

    /* renamed from: a */
    public final void mo72984a(List<IMContact> list, boolean z) {
        ((C35028j) this.f86208a).mo72967a(list);
    }

    /* renamed from: b */
    public final void mo72987b(List<IMContact> list, boolean z) {
        ((C35028j) this.f86208a).mo72967a(this.f90104b.mo72989d());
    }

    public C35023g(C35028j jVar, boolean z, boolean z2, boolean z3) {
        int i;
        super(jVar);
        if (z2) {
            i = 2;
        } else {
            i = 0;
        }
        C34958a aVar = new C34958a(i, z3);
        if (z2) {
            aVar.f89967c = true;
        }
        if (z) {
            this.f90104b = new C34992h(aVar);
        } else {
            this.f90104b = new C34960f(aVar);
        }
        this.f90104b.mo72981a((C34920d<IMContact>) this);
        this.f90104b.mo73112a((C34957e) this);
    }
}
