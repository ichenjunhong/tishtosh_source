package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.auc.C15659a;
import java.security.GeneralSecurityException;

public final class aqp {

    /* renamed from: a */
    public static final auc f41222a = ((auc) ((axz) ((C15659a) auc.m34159a().mo29582a(aqa.f41214a)).mo29547a(C15613api.m33865a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).mo29547a(C15613api.m33865a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).mo29548a("TINK_HYBRID_1_0_0").mo29832e()));

    /* renamed from: b */
    public static final auc f41223b = ((auc) ((axz) ((C15659a) auc.m34159a().mo29582a(f41222a)).mo29548a("TINK_HYBRID_1_1_0").mo29832e()));

    /* renamed from: c */
    public static final auc f41224c = ((auc) ((axz) ((C15659a) auc.m34159a().mo29582a(aqa.f41215b)).mo29547a(C15613api.m33865a("TinkHybridDecrypt", "HybridDecrypt", "EciesAeadHkdfPrivateKey", 0, true)).mo29547a(C15613api.m33865a("TinkHybridEncrypt", "HybridEncrypt", "EciesAeadHkdfPublicKey", 0, true)).mo29548a("TINK_HYBRID").mo29832e()));

    static {
        try {
            aqa.m33910a();
            apy.m33906a("TinkHybridEncrypt", (aph<?>) new aqs<Object>());
            apy.m33906a("TinkHybridDecrypt", (aph<?>) new aqq<Object>());
            C15613api.m33866a(f41224c);
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
