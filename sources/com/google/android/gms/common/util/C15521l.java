package com.google.android.gms.common.util;

import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.android.gms.common.util.l */
public final class C15521l {
    /* renamed from: a */
    public static void m32290a(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public static long m32289a(InputStream inputStream, OutputStream outputStream, boolean z, int i) throws IOException {
        byte[] bArr = new byte[PreloadTask.BYTE_UNIT_NUMBER];
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, PreloadTask.BYTE_UNIT_NUMBER);
                if (read == -1) {
                    break;
                }
                j += (long) read;
                outputStream.write(bArr, 0, read);
            } finally {
                if (z) {
                    m32290a(inputStream);
                    m32290a(outputStream);
                }
            }
        }
        return j;
    }
}
