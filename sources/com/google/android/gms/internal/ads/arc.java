package com.google.android.gms.internal.ads;

import com.google.android.gms.internal.ads.auc.C15659a;
import java.security.GeneralSecurityException;

public final class arc {

    /* renamed from: a */
    public static final auc f41257a = ((auc) ((axz) auc.m34159a().mo29548a("TINK_MAC_1_0_0").mo29547a(C15613api.m33865a("TinkMac", "Mac", "HmacKey", 0, true)).mo29832e()));

    /* renamed from: b */
    public static final auc f41258b = ((auc) ((axz) ((C15659a) auc.m34159a().mo29582a(f41257a)).mo29548a("TINK_MAC").mo29832e()));

    /* renamed from: c */
    private static final auc f41259c = ((auc) ((axz) ((C15659a) auc.m34159a().mo29582a(f41257a)).mo29548a("TINK_MAC_1_1_0").mo29832e()));

    /* renamed from: a */
    public static void m33992a() throws GeneralSecurityException {
        apy.m33906a("TinkMac", (aph<?>) new arb<Object>());
        C15613api.m33866a(f41258b);
    }

    static {
        try {
            m33992a();
        } catch (GeneralSecurityException e) {
            throw new ExceptionInInitializerError(e);
        }
    }
}
