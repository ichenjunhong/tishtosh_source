package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ate.C15645b;
import java.security.GeneralSecurityException;

final class aqi extends C15615app<apg, asa, ast> {
    public aqi() {
        super(apg.class, asa.class, ast.class, "type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key");
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
        return asa.m34043a(awo);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final /* synthetic */ azj mo29455d(azj azj) throws GeneralSecurityException {
        return (asa) ((axz) asa.m34042a().mo29490a(0).mo29491a(awo.zzy(avr.m34234a(32))).mo29832e());
    }

    /* renamed from: c */
    public final /* synthetic */ Object mo29453c(azj azj) throws GeneralSecurityException {
        asa asa = (asa) azj;
        avu.m34237a(asa.zzfih, 0);
        if (asa.zzfip.size() == 32) {
            return new auo(asa.zzfip.toByteArray());
        }
        throw new GeneralSecurityException("invalid ChaCha20Poly1305Key: incorrect key length");
    }
}
