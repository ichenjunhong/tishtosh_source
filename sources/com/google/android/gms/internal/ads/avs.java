package com.google.android.gms.internal.ads;

import java.security.SecureRandom;

final class avs extends ThreadLocal<SecureRandom> {
    avs() {
    }

    /* access modifiers changed from: protected */
    public final /* synthetic */ Object initialValue() {
        SecureRandom secureRandom = new SecureRandom();
        secureRandom.nextLong();
        return secureRandom;
    }
}
