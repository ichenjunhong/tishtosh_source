package com.google.android.gms.internal.ads;

import com.C2240a;
import java.security.GeneralSecurityException;

final class apz implements aph<apg> {
    /* renamed from: a */
    public final apo<apg> mo29442a(String str, String str2, int i) throws GeneralSecurityException {
        apo<apg> apo;
        String lowerCase = str2.toLowerCase();
        char c = 65535;
        if (((lowerCase.hashCode() == 2989895 && lowerCase.equals("aead")) ? (char) 0 : 65535) == 0) {
            switch (str.hashCode()) {
                case 245054116:
                    if (str.equals("type.googleapis.com/google.crypto.tink.XChaCha20Poly1305Key")) {
                        c = 6;
                        break;
                    }
                    break;
                case 360753376:
                    if (str.equals("type.googleapis.com/google.crypto.tink.ChaCha20Poly1305Key")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1215885937:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesCtrHmacAeadKey")) {
                        c = 0;
                        break;
                    }
                    break;
                case 1469984853:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsAeadKey")) {
                        c = 4;
                        break;
                    }
                    break;
                case 1797113348:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesEaxKey")) {
                        c = 1;
                        break;
                    }
                    break;
                case 1855890991:
                    if (str.equals("type.googleapis.com/google.crypto.tink.AesGcmKey")) {
                        c = 2;
                        break;
                    }
                    break;
                case 2079211877:
                    if (str.equals("type.googleapis.com/google.crypto.tink.KmsEnvelopeAeadKey")) {
                        c = 5;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    apo = new aqd<>();
                    break;
                case 1:
                    apo = new aqg<>();
                    break;
                case 2:
                    apo = new aqh<>();
                    break;
                case 3:
                    apo = new aqi<>();
                    break;
                case 4:
                    apo = new aqj<>();
                    break;
                case 5:
                    apo = new aql<>();
                    break;
                case 6:
                    apo = new aqm<>();
                    break;
                default:
                    throw new GeneralSecurityException(C2240a.m6772a("No support for primitive 'Aead' with key type '%s'.", new Object[]{str}));
            }
            if (i <= 0) {
                return apo;
            }
            throw new GeneralSecurityException(C2240a.m6772a("No key manager for key type '%s' with version at least %d.", new Object[]{str, Integer.valueOf(i)}));
        }
        throw new GeneralSecurityException(C2240a.m6772a("No support for primitive '%s'.", new Object[]{str2}));
    }

    /* renamed from: a */
    public final apx<apg> mo29443a() {
        return new aqb();
    }
}
