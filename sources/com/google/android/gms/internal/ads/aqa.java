package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.auc.C15659a;
import java.security.GeneralSecurityException;

public final class aqa {

    /* renamed from: a */
    public static final auc f41214a = ((auc) ((axz) ((C15659a) auc.m34159a().mo29582a(arc.f41257a)).mo29547a(C15613api.m33865a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).mo29547a(C15613api.m33865a("TinkAead", "Aead", "AesEaxKey", 0, true)).mo29547a(C15613api.m33865a("TinkAead", "Aead", "AesGcmKey", 0, true)).mo29547a(C15613api.m33865a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).mo29547a(C15613api.m33865a("TinkAead", "Aead", "KmsAeadKey", 0, true)).mo29547a(C15613api.m33865a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).mo29548a("TINK_AEAD_1_0_0").mo29832e()));

    /* renamed from: b */
    public static final auc f41215b = ((auc) ((axz) ((C15659a) auc.m34159a().mo29582a(arc.f41258b)).mo29547a(C15613api.m33865a("TinkAead", "Aead", "AesCtrHmacAeadKey", 0, true)).mo29547a(C15613api.m33865a("TinkAead", "Aead", "AesEaxKey", 0, true)).mo29547a(C15613api.m33865a("TinkAead", "Aead", "AesGcmKey", 0, true)).mo29547a(C15613api.m33865a("TinkAead", "Aead", "ChaCha20Poly1305Key", 0, true)).mo29547a(C15613api.m33865a("TinkAead", "Aead", "KmsAeadKey", 0, true)).mo29547a(C15613api.m33865a("TinkAead", "Aead", "KmsEnvelopeAeadKey", 0, true)).mo29547a(C15613api.m33865a("TinkAead", "Aead", "XChaCha20Poly1305Key", 0, true)).mo29548a("TINK_AEAD").mo29832e()));

    /* renamed from: c */
    private static final auc f41216c = ((auc) ((axz) ((C15659a) auc.m34159a().mo29582a(f41214a)).mo29548a("TINK_AEAD_1_1_0").mo29832e()));

    /* renamed from: a */
    public static void m33910a() throws GeneralSecurityException {
        arc.m33992a();
        apy.m33906a("TinkAead", (aph<?>) new apz<Object>());
        C15613api.m33866a(f41215b);
    }

    static {
        try {
            m33910a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
