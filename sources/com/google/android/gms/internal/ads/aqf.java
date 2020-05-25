package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ate.C15645b;
import java.security.GeneralSecurityException;

final class aqf extends C15615app<avn, arj, arl> {
    public aqf() {
        super(avn.class, arj.class, arl.class, "type.googleapis.com/google.crypto.tink.AesCtrKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C15645b mo29452c() {
        return C15645b.SYMMETRIC;
    }

    /* renamed from: a */
    private static void m33919a(arn arn) throws GeneralSecurityException {
        if (arn.zzfjb < 12 || arn.zzfjb > 16) {
            throw new GeneralSecurityException("invalid IV size");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ azj mo29456e(awo awo) throws ayi {
        return arl.m34016a(awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ azj mo29454d(awo awo) throws ayi {
        return arj.m34008a(awo);
    }

    /* renamed from: d */
    public final /* synthetic */ azj mo29455d(azj azj) throws GeneralSecurityException {
        arl arl = (arl) azj;
        avu.m34236a(arl.zzfir);
        m33919a(arl.mo29481a());
        return (arj) ((axz) arj.m34009b().mo29479a(arl.mo29481a()).mo29480a(awo.zzy(avr.m34234a(arl.zzfir))).mo29478a(0).mo29832e());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo29453c(azj azj) throws GeneralSecurityException {
        arj arj = (arj) azj;
        avu.m34237a(arj.zzfih, 0);
        avu.m34236a(arj.zzfip.size());
        m33919a(arj.mo29477a());
        return new auh(arj.zzfip.toByteArray(), arj.mo29477a().zzfjb);
    }
}
