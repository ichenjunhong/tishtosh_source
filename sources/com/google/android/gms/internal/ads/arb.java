package com.google.android.gms.internal.ads;

import com.C2240a;
import java.security.GeneralSecurityException;

final class arb implements aph<apt> {
    /* renamed from: a */
    public final apo<apt> mo29442a(String str, String str2, int i) throws GeneralSecurityException {
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 107855 && lowerCase.equals("mac")) ? (char) 0 : 65535) == 0) {
            if (str.hashCode() == 836622442 && str.equals("type.googleapis.com/google.crypto.tink.HmacKey")) {
                c = 0;
            }
            if (c == 0) {
                aqy aqy = new aqy();
                if (i <= 0) {
                    return aqy;
                }
                throw new GeneralSecurityException(C2240a.m6772a("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
            }
            throw new GeneralSecurityException(C2240a.m6772a("No support for primitive 'Mac' with key type '%s'.", new Object[]{str}));
        }
        throw new GeneralSecurityException(C2240a.m6772a("No support for primitive '%s'.", new Object[]{str2}));
    }

    /* renamed from: a */
    public final apx<apt> mo29443a() {
        return new ard();
    }
}
