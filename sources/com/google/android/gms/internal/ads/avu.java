package com.google.android.gms.internal.ads;

import com.C2240a;
import java.security.GeneralSecurityException;
import java.security.InvalidAlgorithmParameterException;
import java.util.regex.Pattern;

public final class avu {

    /* renamed from: a */
    private static final Pattern f41445a = Pattern.compile(C2240a.m6772a("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s$", new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"}), 2);

    /* renamed from: b */
    private static final Pattern f41446b = Pattern.compile(C2240a.m6772a("^projects/%s/locations/%s/keyRings/%s/cryptoKeys/%s/cryptoKeyVersions/%s$", new Object[]{"([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+", "([0-9a-zA-Z\\-\\.\\_~])+"}), 2);

    /* renamed from: a */
    public static void m34236a(int i) throws InvalidAlgorithmParameterException {
        if (i != 16 && i != 32) {
            throw new InvalidAlgorithmParameterException("invalid key size; only 128-bit and 256-bit AES keys are supported");
        }
    }

    /* renamed from: a */
    public static void m34237a(int i, int i2) throws GeneralSecurityException {
        if (i < 0 || i > 0) {
            throw new GeneralSecurityException(C2240a.m6772a("key has version %d; only keys with version in range [0..%d] are supported", new Object[]{Integer.valueOf(i), Integer.valueOf(0)}));
        }
    }
}
