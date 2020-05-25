package com.p683ss.android.ugc.aweme.shortvideo;

import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bn */
public final class C42469bn {

    /* renamed from: a */
    protected static char[] f107405a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m93320a(String str) {
        if (str == null) {
            return null;
        }
        return m93321a(str.getBytes());
    }

    /* renamed from: a */
    public static String m93319a(File file) {
        if (!file.isFile()) {
            return "";
        }
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
                if (read != -1) {
                    instance.update(bArr, 0, read);
                } else {
                    bufferedInputStream.close();
                    return m93322b(instance.digest());
                }
            }
        } catch (Exception unused) {
            return "";
        }
    }

    /* renamed from: a */
    public static String m93321a(byte[] bArr) {
        try {
            byte[] digest = MessageDigest.getInstance("MD5").digest(bArr);
            StringBuffer stringBuffer = new StringBuffer();
            for (byte b : digest) {
                stringBuffer.append(f107405a[(b & 240) >> 4]);
                stringBuffer.append(f107405a[b & 15]);
            }
            return stringBuffer.toString();
        } catch (NoSuchAlgorithmException unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m93322b(byte[] bArr) {
        if (bArr == null || bArr.length <= 0) {
            return "";
        }
        char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
        char[] cArr2 = new char[(bArr.length * 2)];
        int i = 0;
        for (byte b : bArr) {
            int i2 = i + 1;
            cArr2[i] = cArr[(b >>> 4) & 15];
            i = i2 + 1;
            cArr2[i2] = cArr[b & 15];
        }
        return new String(cArr2);
    }
}
