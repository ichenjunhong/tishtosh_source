package com.google.android.gms.internal.ads;

import com.C2240a;
import com.google.android.gms.internal.ads.atl.C15647a;
import java.security.GeneralSecurityException;

/* renamed from: com.google.android.gms.internal.ads.api */
public final class C15613api {
    /* renamed from: a */
    public static atl m33865a(String str, String str2, String str3, int i, boolean z) {
        C15647a a = atl.m34117a().mo29529a(str2);
        String str4 = "type.googleapis.com/google.crypto.tink.";
        String valueOf = String.valueOf(str3);
        return (atl) ((axz) a.mo29531b(valueOf.length() != 0 ? str4.concat(valueOf) : new String(str4)).mo29528a(0).mo29530a(true).mo29532c(str).mo29832e());
    }

    /* renamed from: a */
    public static void m33866a(auc auc) throws GeneralSecurityException {
        for (atl atl : auc.zzfnv) {
            if (atl.zzflw.isEmpty()) {
                throw new GeneralSecurityException("Missing type_url.");
            } else if (atl.zzfmp.isEmpty()) {
                throw new GeneralSecurityException("Missing primitive_name.");
            } else if (!atl.zzfms.isEmpty()) {
                String str = atl.zzfms;
                if (str != null) {
                    aph aph = (aph) apy.f41209a.get(str.toLowerCase());
                    if (aph == null) {
                        String a = C2240a.m6772a("no catalogue found for %s. ", new Object[]{str});
                        if (str.toLowerCase().startsWith("tinkaead")) {
                            a = String.valueOf(a).concat("Maybe call AeadConfig.register().");
                        }
                        if (str.toLowerCase().startsWith("tinkdeterministicaead")) {
                            a = String.valueOf(a).concat("Maybe call DeterministicAeadConfig.register().");
                        } else if (str.toLowerCase().startsWith("tinkstreamingaead")) {
                            a = String.valueOf(a).concat("Maybe call StreamingAeadConfig.register().");
                        } else if (str.toLowerCase().startsWith("tinkhybriddecrypt") || str.toLowerCase().startsWith("tinkhybridencrypt")) {
                            a = String.valueOf(a).concat("Maybe call HybridConfig.register().");
                        } else if (str.toLowerCase().startsWith("tinkmac")) {
                            a = String.valueOf(a).concat("Maybe call MacConfig.register().");
                        } else if (str.toLowerCase().startsWith("tinkpublickeysign") || str.toLowerCase().startsWith("tinkpublickeyverify")) {
                            a = String.valueOf(a).concat("Maybe call SignatureConfig.register().");
                        } else if (str.toLowerCase().startsWith("tink")) {
                            a = String.valueOf(a).concat("Maybe call TinkConfig.register().");
                        }
                        throw new GeneralSecurityException(a);
                    }
                    apy.m33905a(aph.mo29443a());
                    apy.m33904a(aph.mo29442a(atl.zzflw, atl.zzfmp, atl.zzfmq), atl.zzfmr);
                } else {
                    throw new IllegalArgumentException("catalogueName must be non-null.");
                }
            } else {
                throw new GeneralSecurityException("Missing catalogue_name.");
            }
        }
    }
}
