package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.ByteArrayOutputStream;
import java.io.Closeable;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.f */
public final class C35266f {
    /* renamed from: a */
    public static FileInputStream m79736a(File file) {
        try {
            return new FileInputStream(file);
        } catch (FileNotFoundException unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m79737a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
                return true;
            } catch (IOException unused) {
            }
        }
        return false;
    }

    /* renamed from: a */
    public static byte[] m79738a(InputStream inputStream) {
        Closeable closeable;
        Closeable closeable2;
        ByteArrayOutputStream byteArrayOutputStream;
        OutputStream outputStream;
        if (inputStream != null) {
            try {
                byteArrayOutputStream = new ByteArrayOutputStream(524288);
            } catch (IOException unused) {
                closeable = 0;
                m79737a(closeable);
                return null;
            } catch (Throwable th) {
                th = th;
                closeable2 = 0;
                m79737a(closeable2);
                throw th;
            }
            try {
                byte[] bArr = new byte[524288];
                if (!(inputStream instanceof BufferedInputStream)) {
                    inputStream = new BufferedInputStream(inputStream, 524288);
                }
                if (byteArrayOutputStream instanceof BufferedOutputStream) {
                    outputStream = byteArrayOutputStream;
                } else {
                    outputStream = new BufferedOutputStream(byteArrayOutputStream, 524288);
                }
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    outputStream.flush();
                }
                m79737a((Closeable) inputStream);
                byte[] byteArray = byteArrayOutputStream.toByteArray();
                m79737a((Closeable) byteArrayOutputStream);
                return byteArray;
            } catch (IOException e) {
                throw e;
            } catch (IOException unused2) {
                closeable = byteArrayOutputStream;
                m79737a(closeable);
                return null;
            } catch (Throwable th2) {
                th = th2;
                closeable2 = byteArrayOutputStream;
                m79737a(closeable2);
                throw th;
            }
        }
        return null;
    }
}
