package com.google.android.gms.internal.ads;

import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

final class bdk implements Runnable {
    private bdk() {
    }

    public final void run() {
        try {
            bbo.f41773a = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException unused) {
        } finally {
            bbo.f41774b.countDown();
        }
    }
}
