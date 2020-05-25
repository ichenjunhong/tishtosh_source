package com.google.android.gms.internal.ads;

import com.C2240a;
import java.security.GeneralSecurityException;

final class aqs implements aph<apn> {
    /* renamed from: a */
    public final apo<apn> mo29442a(String str, String str2, int i) throws GeneralSecurityException {
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 1420614889 && lowerCase.equals("hybridencrypt")) ? (char) 0 : 65535) == 0) {
            if (str.hashCode() == 396454335 && str.equals("type.googleapis.com/google.crypto.tink.EciesAeadHkdfPublicKey")) {
                c = 0;
            }
            if (c == 0) {
                aqo aqo = new aqo();
                if (i <= 0) {
                    return aqo;
                }
                throw new GeneralSecurityException(C2240a.m6772a("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
            throw new GeneralSecurityException(C2240a.m6772a("No support for primitive 'HybridEncrypt' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(C2240a.m6772a("No support for primitive '%s'.", new Object[]{str2}));
    }

    /* renamed from: a */
    public final apx<apn> mo29443a() {
        return new aqt();
    }
}
