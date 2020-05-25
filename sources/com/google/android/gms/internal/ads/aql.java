package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ate.C15645b;
import java.security.GeneralSecurityException;

final class aql extends C15615app<apg, atv, atx> {
    public aql() {
        super(apg.class, atv.class, atx.class, "type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C15645b mo29452c() {
        return C15645b.REMOTE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ azj mo29456e(awo awo) throws ayi {
        return atx.m34154a(awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ azj mo29454d(awo awo) throws ayi {
        return atv.m34147a(awo);
    }

    /* renamed from: d */
    public final /* synthetic */ azj mo29455d(azj azj) throws GeneralSecurityException {
        return (atv) ((axz) atv.m34148b().mo29546a((atx) azj).mo29545a(0).mo29832e());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo29453c(azj azj) throws GeneralSecurityException {
        atv atv = (atv) azj;
        avu.m34237a(atv.zzfih, 0);
        String str = atv.mo29544a().zzfnk;
        apg b = aps.m33891a(str).mo29459b(str);
        atx a = atv.mo29544a();
        return new aqk(a.zzfnl == null ? atj.m34115a() : a.zzfnl, b);
    }
}
