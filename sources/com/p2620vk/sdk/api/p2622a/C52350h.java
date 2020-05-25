package com.p2620vk.sdk.api.p2622a;

import android.webkit.MimeTypeMap;
import com.C2240a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.util.Locale;

/* renamed from: com.vk.sdk.api.a.h */
public final class C52350h {

    /* renamed from: a */
    final String f130344a;

    /* renamed from: b */
    private final File[] f130345b;

    /* renamed from: c */
    private String f130346c;

    /* renamed from: b */
    private String m111831b() {
        return C2240a.m6772a("\r\n--%s--\r\n", new Object[]{this.f130344a});
    }

    /* renamed from: a */
    public final long mo109159a() {
        long j = 0;
        for (int i = 0; i < this.f130345b.length; i++) {
            File file = this.f130345b[i];
            j = j + file.length() + ((long) m111829a(file, i).length());
        }
        return j + ((long) m111831b().length());
    }

    /* renamed from: a */
    private static String m111830a(String str) {
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(str);
        if (fileExtensionFromUrl != null) {
            return MimeTypeMap.getSingleton().getMimeTypeFromExtension(fileExtensionFromUrl);
        }
        return null;
    }

    /* renamed from: a */
    public final void mo109160a(OutputStream outputStream) throws IOException {
        for (int i = 0; i < this.f130345b.length; i++) {
            File file = this.f130345b[i];
            outputStream.write(m111829a(file, i).getBytes("UTF-8"));
            FileInputStream fileInputStream = new FileInputStream(file);
            byte[] bArr = new byte[2048];
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                outputStream.write(bArr, 0, read);
            }
            fileInputStream.close();
        }
        outputStream.write(m111831b().getBytes("UTF-8"));
    }

    /* renamed from: a */
    private String m111829a(File file, int i) {
        String str;
        if (this.f130346c == null || !this.f130346c.equals("doc")) {
            str = C2240a.m6773a(Locale.US, "file%d", new Object[]{Integer.valueOf(i + 1)});
        } else {
            str = "file";
        }
        String fileExtensionFromUrl = MimeTypeMap.getFileExtensionFromUrl(file.getAbsolutePath());
        StringBuilder sb = new StringBuilder();
        sb.append(C2240a.m6772a("\r\n--%s\r\n", new Object[]{this.f130344a}));
        sb.append(C2240a.m6772a("Content-Disposition: form-data; name=\"%s\"; filename=\"%s.%s\"\r\n", new Object[]{str, str, fileExtensionFromUrl}));
        sb.append(C2240a.m6772a("Content-Type: %s\r\n\r\n", new Object[]{m111830a(file.getAbsolutePath())}));
        return sb.toString();
    }
}
