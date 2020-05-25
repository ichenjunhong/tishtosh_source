package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ate.C15645b;
import java.security.GeneralSecurityException;

final class aqh extends C15615app<apg, arw, ary> {
    public aqh() {
        super(apg.class, arw.class, ary.class, "type.googleapis.com/google.crypto.tink.AesGcmKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C15645b mo29452c() {
        return C15645b.SYMMETRIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ azj mo29456e(awo awo) throws ayi {
        return ary.m34039a(awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ azj mo29454d(awo awo) throws ayi {
        return arw.m34035a(awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ azj mo29455d(azj azj) throws GeneralSecurityException {
        ary ary = (ary) azj;
        avu.m34236a(ary.zzfir);
        return (arw) ((axz) arw.m34034a().mo29488a(awo.zzy(avr.m34234a(ary.zzfir))).mo29487a(0).mo29832e());
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final /* synthetic */ Object mo29453c(azj azj) throws GeneralSecurityException {
        arw arw = (arw) azj;
        avu.m34237a(arw.zzfih, 0);
        avu.m34236a(arw.zzfip.size());
        return new auj(arw.zzfip.toByteArray());
    }
}
