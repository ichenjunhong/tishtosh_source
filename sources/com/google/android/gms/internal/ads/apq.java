package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.atn.C15649b;
import com.google.android.gms.internal.ads.atp.C15651a;
import com.google.android.gms.internal.ads.atp.C15652b;

public final class apq {

    /* renamed from: a */
    public atn f41199a;

    apq(atn atn) {
        this.f41199a = atn;
    }

    public final String toString() {
        atn atn = this.f41199a;
        C15651a a = atp.m34130a().mo29536a(atn.zzfmu);
        for (C15649b bVar : atn.zzfmv) {
            a.mo29537a((C15652b) ((axz) C15652b.m34134a().mo29541a(bVar.mo29533a().zzflw).mo29539a(bVar.mo29534b()).mo29540a(bVar.mo29535c()).mo29538a(bVar.zzfmz).mo29832e()));
        }
        return ((atp) ((axz) a.mo29832e())).toString();
    }
}
