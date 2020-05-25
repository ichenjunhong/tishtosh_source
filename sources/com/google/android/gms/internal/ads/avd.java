package com.google.android.gms.internal.ads;

import com.C2240a;
import com.google.android.gms.internal.ads.ave;
import java.security.GeneralSecurityException;
import java.security.KeyFactory;
import java.security.KeyPairGenerator;
import java.security.MessageDigest;
import java.security.Provider;
import java.security.Security;
import java.security.Signature;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.Cipher;
import javax.crypto.KeyAgreement;
import javax.crypto.Mac;

public final class avd<T_WRAPPER extends ave<T_ENGINE>, T_ENGINE> {

    /* renamed from: a */
    public static final avd<avf, Cipher> f41420a = new avd<>(new avf());

    /* renamed from: b */
    public static final avd<avj, Mac> f41421b = new avd<>(new avj());

    /* renamed from: c */
    public static final avd<avl, Signature> f41422c = new avd<>(new avl());

    /* renamed from: d */
    public static final avd<avk, MessageDigest> f41423d = new avd<>(new avk());

    /* renamed from: e */
    public static final avd<avg, KeyAgreement> f41424e = new avd<>(new avg());

    /* renamed from: f */
    public static final avd<avi, KeyPairGenerator> f41425f = new avd<>(new avi());

    /* renamed from: g */
    public static final avd<avh, KeyFactory> f41426g = new avd<>(new avh());

    /* renamed from: h */
    private static final Logger f41427h = Logger.getLogger(avd.class.getName());

    /* renamed from: i */
    private static final List<Provider> f41428i;

    /* renamed from: j */
    private T_WRAPPER f41429j;

    /* renamed from: k */
    private List<Provider> f41430k = f41428i;

    /* renamed from: l */
    private boolean f41431l = true;

    private avd(T_WRAPPER t_wrapper) {
        this.f41429j = t_wrapper;
    }

    /* renamed from: a */
    public final T_ENGINE mo29568a(String str) throws GeneralSecurityException {
        for (Provider provider : this.f41430k) {
            if (m34216a(str, provider)) {
                return this.f41429j.mo29569a(str, provider);
            }
        }
        if (this.f41431l) {
            return this.f41429j.mo29569a(str, null);
        }
        throw new GeneralSecurityException("No good Provider found.");
    }

    /* renamed from: a */
    private final boolean m34216a(String str, Provider provider) {
        try {
            this.f41429j.mo29569a(str, provider);
            return true;
        } catch (Exception e) {
            avx.f41447a.mo29572a(e);
            return false;
        }
    }

    static {
        if (avt.m34235a()) {
            String[] strArr = {"GmsCore_OpenSSL", "AndroidOpenSSL"};
            ArrayList arrayList = new ArrayList();
            for (int i = 0; i < 2; i++) {
                String str = strArr[i];
                Provider provider = Security.getProvider(str);
                if (provider != null) {
                    arrayList.add(provider);
                } else {
                    f41427h.logp(Level.INFO, "com.google.crypto.tink.subtle.EngineFactory", "toProviderList", C2240a.m6772a("Provider %s not available", new Object[]{str}));
                }
            }
            f41428i = arrayList;
        } else {
            f41428i = new ArrayList();
        }
    }
}
