package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia;

import android.util.Pair;
import java.util.HashSet;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.af */
final /* synthetic */ class C44097af implements C0011g {

    /* renamed from: a */
    private final C44091ad f111719a;

    /* renamed from: b */
    private final int f111720b;

    /* renamed from: c */
    private final boolean f111721c;

    C44097af(C44091ad adVar, int i, boolean z) {
        this.f111719a = adVar;
        this.f111720b = i;
        this.f111721c = z;
    }

    public final Object then(C0013i iVar) {
        C44091ad adVar = this.f111719a;
        int i = this.f111720b;
        boolean z = this.f111721c;
        if (iVar.mo31c() || iVar.mo33d()) {
            return null;
        }
        adVar.f111700c |= 1 << i;
        adVar.f111698a.addAll((List) ((Pair) iVar.mo34e()).first);
        adVar.notifyDataSetChanged();
        if (adVar.f111701d != null) {
            if (!z || adVar.f111702e == null) {
                adVar.f111701d.mo89953a(adVar.mo90000a(), false, adVar.f111700c, true);
                adVar.f111702e = adVar.mo90000a();
            } else if (((HashSet) ((Pair) iVar.mo34e()).second).contains(adVar.f111702e) || adVar.f111702e == adVar.mo90000a()) {
                adVar.f111701d.mo89953a(adVar.f111702e, false, adVar.f111700c, false);
            }
        }
        if (adVar.f111703f != null) {
            adVar.f111703f.mo90004a(i);
        }
        return null;
    }
}
