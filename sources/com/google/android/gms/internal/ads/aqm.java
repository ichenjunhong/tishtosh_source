package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ate.C15645b;
import java.security.GeneralSecurityException;

final class aqm extends C15615app<apg, aue, ast> {
    public aqm() {
        super(apg.class, aue.class, ast.class, "type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key");
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final C15645b mo29452c() {
        return C15645b.SYMMETRIC;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public final /* synthetic */ azj mo29456e(awo awo) throws ayi {
        return ast.m34078a(awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ azj mo29454d(awo awo) throws ayi {
        return aue.m34164a(awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ azj mo29455d(azj azj) throws GeneralSecurityException {
        return (aue) ((axz) aue.m34163a().mo29549a(0).mo29550a(awo.zzy(avr.m34234a(32))).mo29832e());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo29453c(azj azj) throws GeneralSecurityException {
        aue aue = (aue) azj;
        avu.m34237a(aue.zzfih, 0);
        if (aue.zzfip.size() == 32) {
            return new avw(aue.zzfip.toByteArray());
        }
        throw new GeneralSecurityException("invalid XChaCha20Poly1305Key: incorrect key length");
    }
}
