package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ate.C15645b;
import java.security.GeneralSecurityException;

final class aqj extends C15615app<apg, atr, att> {
    public aqj() {
        super(apg.class, atr.class, att.class, "type.googleapis.com/google.crypto.tink.KmsAeadKey");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C15645b mo29452c() {
        return C15645b.REMOTE;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ azj mo29456e(awo awo) throws ayi {
        return att.m34145a(awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ azj mo29454d(awo awo) throws ayi {
        return atr.m34141a(awo);
    }

    /* renamed from: d */
    public final /* synthetic */ azj mo29455d(azj azj) throws GeneralSecurityException {
        return (atr) ((axz) atr.m34140a().mo29543a((att) azj).mo29542a(0).mo29832e());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo29453c(azj azj) throws GeneralSecurityException {
        att att;
        atr atr = (atr) azj;
        avu.m34237a(atr.zzfih, 0);
        if (atr.zzfne == null) {
            att = att.zzfnh;
        } else {
            att = atr.zzfne;
        }
        String str = att.zzfng;
        return aps.m33891a(str).mo29459b(str);
    }
}
