package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.ate.C15645b;
import com.google.android.gms.internal.ads.atn.C15649b;
import java.security.GeneralSecurityException;

public final class apu {
    /* renamed from: a */
    public static final apq m33893a(byte[] bArr) throws GeneralSecurityException {
        try {
            atn a = atn.m34124a(bArr);
            for (C15649b bVar : a.zzfmv) {
                if (bVar.mo29533a().mo29524a() == C15645b.UNKNOWN_KEYMATERIAL || bVar.mo29533a().mo29524a() == C15645b.SYMMETRIC || bVar.mo29533a().mo29524a() == C15645b.ASYMMETRIC_PRIVATE) {
                    throw new GeneralSecurityException("keyset contains secret key material");
                }
            }
            if (a != null && a.zzfmv.size() > 0) {
                return new apq(a);
            }
            throw new GeneralSecurityException("empty keyset");
        } catch (ayi unused) {
            throw new GeneralSecurityException("invalid keyset");
        }
    }
}
