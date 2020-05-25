package com.p683ss.android.p1167g;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import java.io.IOException;
import java.io.RandomAccessFile;

/* renamed from: com.ss.android.g.a */
public final class C19161a {
    /* JADX INFO: finally extract failed */
    /* renamed from: a */
    public static String m46711a(String str) throws IOException {
        RandomAccessFile randomAccessFile = new RandomAccessFile(str, "r");
        try {
            long length = randomAccessFile.length() - 2;
            randomAccessFile.seek(length);
            int read = (randomAccessFile.read() & NormalGiftView.ALPHA_255) | ((randomAccessFile.read() & NormalGiftView.ALPHA_255) << 8);
            if (read == 0) {
                randomAccessFile.close();
                return null;
            }
            randomAccessFile.seek(length - ((long) read));
            byte[] bArr = new byte[read];
            randomAccessFile.read(bArr);
            String str2 = new String(bArr);
            randomAccessFile.close();
            return str2;
        } catch (Throwable th) {
            randomAccessFile.close();
            throw th;
        }
    }
}
