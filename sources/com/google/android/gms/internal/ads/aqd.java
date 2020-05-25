package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ate.C15645b;
import java.security.GeneralSecurityException;

final class aqd extends C15615app<apg, arf, arh> {
    public aqd() throws GeneralSecurityException {
        super(apg.class, arf.class, arh.class, "type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey");
        apy.m33903a((apo<P>) new aqf<P>());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C15645b mo29452c() {
        return C15645b.SYMMETRIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ azj mo29456e(awo awo) throws ayi {
        return arh.m34004a(awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ azj mo29454d(awo awo) throws ayi {
        return arf.m33996a(awo);
    }

    /* renamed from: d */
    public final /* synthetic */ azj mo29455d(azj azj) throws GeneralSecurityException {
        arh arh = (arh) azj;
        arj arj = (arj) apy.m33899a("type.googleapis.com/google.crypto.tink.AesCtrKey", (azj) arh.mo29475a());
        return (arf) ((axz) arf.m33997c().mo29473a(arj).mo29474a((asx) apy.m33899a("type.googleapis.com/google.crypto.tink.HmacKey", (azj) arh.mo29476b())).mo29472a(0).mo29832e());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo29453c(azj azj) throws GeneralSecurityException {
        arf arf = (arf) azj;
        avu.m34237a(arf.zzfih, 0);
        return new avc((avn) apy.m33902a("type.googleapis.com/google.crypto.tink.AesCtrKey", (azj) arf.mo29470a(), avn.class), (apt) apy.m33902a("type.googleapis.com/google.crypto.tink.HmacKey", (azj) arf.mo29471b(), apt.class), arf.mo29471b().mo29508a().zzflu);
    }
}
