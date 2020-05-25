package com.bytedance.common.utility;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;

/* renamed from: com.bytedance.common.utility.d */
public final class C9395d {

    /* renamed from: a */
    static final char[] f25642a = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};

    /* renamed from: a */
    public static String m18572a(byte[] bArr) {
        if (bArr != null) {
            return m18573a(bArr, 0, bArr.length);
        }
        throw new NullPointerException("bytes is null");
    }

    /* renamed from: b */
    public static String m18574b(byte[] bArr) {
        if (bArr != null) {
            try {
                if (bArr.length != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(bArr);
                    return m18572a(instance.digest());
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m18570a(File file) {
        try {
            MessageDigest instance = MessageDigest.getInstance("MD5");
            if (instance == null) {
                return null;
            }
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
            while (true) {
                int read = fileInputStream.read(bArr, 0, VideoCacheReadBuffersizeExperiment.DEFAULT);
                if (read > 0) {
                    instance.update(bArr, 0, read);
                } else {
                    fileInputStream.close();
                    return m18572a(instance.digest());
                }
            }
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static String m18571a(String str) {
        if (str != null) {
            try {
                if (str.length() != 0) {
                    MessageDigest instance = MessageDigest.getInstance("MD5");
                    instance.update(str.getBytes("UTF-8"));
                    return m18572a(instance.digest());
                }
            } catch (Exception unused) {
                return null;
            }
        }
        return null;
    }

    /* renamed from: a */
    public static String m18573a(byte[] bArr, int i, int i2) {
        if (bArr == null) {
            throw new NullPointerException("bytes is null");
        } else if (i2 + 0 <= bArr.length) {
            int i3 = i2 * 2;
            char[] cArr = new char[i3];
            int i4 = 0;
            for (int i5 = 0; i5 < i2; i5++) {
                byte b = bArr[i5 + 0] & 255;
                int i6 = i4 + 1;
                cArr[i4] = f25642a[b >> 4];
                i4 = i6 + 1;
                cArr[i6] = f25642a[b & 15];
            }
            return new String(cArr, 0, i3);
        } else {
            throw new IndexOutOfBoundsException();
        }
    }
}
