package com.bytedance.ttnet.p887e;

import com.C2240a;
import com.bytedance.common.utility.C9415i;
import com.bytedance.ttnet.hostmonitor.C13351f;
import java.security.InvalidKeyException;
import java.security.NoSuchAlgorithmException;
import javax.crypto.Cipher;
import javax.crypto.Mac;
import javax.crypto.SecretKeyFactory;
import javax.crypto.spec.IvParameterSpec;
import javax.crypto.spec.PBEKeySpec;
import javax.crypto.spec.SecretKeySpec;

/* renamed from: com.bytedance.ttnet.e.c */
public final class C13328c {

    /* renamed from: a */
    private static final char[] f34782a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F'};

    /* renamed from: a */
    public static byte[] m26839a(byte[] bArr, byte[] bArr2) {
        return m26840a(bArr, bArr2, "HmacSHA256");
    }

    /* renamed from: a */
    public static byte[] m26838a(int i, String str) {
        byte[] bArr = {72, 75, 50, 65, 33, 53, 60, 42, 44, 46, 35, 50, 42, 63, 55, 48};
        try {
            byte[] encoded = SecretKeyFactory.getInstance("PBKDF2WithHmacSHA1").generateSecret(new PBEKeySpec("TtTokenConfig".toCharArray(), "[B@3d4eac69".getBytes(), i, 128)).getEncoded();
            SecretKeySpec secretKeySpec = new SecretKeySpec(encoded, str);
            byte[] bArr2 = new byte[encoded.length];
            try {
                for (byte valueOf : secretKeySpec.getEncoded()) {
                    int abs = (Math.abs(Integer.parseInt(C2240a.m6772a("%d", new Object[]{Byte.valueOf(valueOf)}))) % 54) + 40;
                    if (abs == 47) {
                        abs = 33;
                    } else if (abs == 61 || abs == 92) {
                        abs = 35;
                    }
                    bArr2[0] = (byte) abs;
                }
                if (!C9415i.m18635b()) {
                    return bArr2;
                }
                StringBuilder sb = new StringBuilder("generateSecretKey for ");
                sb.append(str);
                sb.append(" key = ");
                sb.append(bArr2);
                C13351f.m26926b("TtTokenEncrypt", sb.toString());
                return bArr2;
            } catch (Throwable unused) {
                return bArr2;
            }
        } catch (Throwable unused2) {
            return bArr;
        }
    }

    /* renamed from: a */
    private static byte[] m26840a(byte[] bArr, byte[] bArr2, String str) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
            Mac instance = Mac.getInstance(str);
            instance.init(secretKeySpec);
            return instance.doFinal(bArr);
        } catch (InvalidKeyException | NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static byte[] m26842a(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return m26841a(bArr, bArr2, "AES", str, bArr3, true);
    }

    /* renamed from: b */
    public static byte[] m26843b(byte[] bArr, byte[] bArr2, String str, byte[] bArr3) {
        return m26841a(bArr, bArr2, "AES", str, bArr3, false);
    }

    /* renamed from: a */
    private static byte[] m26841a(byte[] bArr, byte[] bArr2, String str, String str2, byte[] bArr3, boolean z) {
        if (bArr == null || bArr.length == 0 || bArr2 == null || bArr2.length == 0) {
            return null;
        }
        try {
            SecretKeySpec secretKeySpec = new SecretKeySpec(bArr2, str);
            Cipher instance = Cipher.getInstance(str2);
            int i = 2;
            if (bArr3 != null) {
                if (bArr3.length != 0) {
                    IvParameterSpec ivParameterSpec = new IvParameterSpec(bArr3);
                    if (z) {
                        i = 1;
                    }
                    instance.init(i, secretKeySpec, ivParameterSpec);
                    return instance.doFinal(bArr);
                }
            }
            if (z) {
                i = 1;
            }
            instance.init(i, secretKeySpec);
            return instance.doFinal(bArr);
        } catch (Throwable unused) {
            return null;
        }
    }
}
