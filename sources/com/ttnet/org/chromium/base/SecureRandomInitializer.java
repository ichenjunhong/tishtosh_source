package com.ttnet.org.chromium.base;

import com.google.p1067c.p1068a.p1069a.p1070a.p1071a.C17840a;
import java.io.FileInputStream;
import java.io.IOException;
import java.security.SecureRandom;

public class SecureRandomInitializer {
    public static void initialize(SecureRandom secureRandom) throws IOException {
        Throwable th;
        FileInputStream fileInputStream = new FileInputStream("/dev/urandom");
        try {
            byte[] bArr = new byte[16];
            if (fileInputStream.read(bArr) == 16) {
                secureRandom.setSeed(bArr);
                fileInputStream.close();
                return;
            }
            throw new IOException("Failed to get enough random data.");
        } catch (Throwable th2) {
            C17840a.m43752a(th, th2);
        }
        throw th;
    }
}
