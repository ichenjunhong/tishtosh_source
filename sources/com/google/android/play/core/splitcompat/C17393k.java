package com.google.android.play.core.splitcompat;

import com.google.android.play.core.p1051c.C17261ak;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.Set;
import java.util.zip.ZipFile;

/* renamed from: com.google.android.play.core.splitcompat.k */
final class C17393k implements C17395m {

    /* renamed from: a */
    private final /* synthetic */ Set f48927a;

    /* renamed from: b */
    private final /* synthetic */ C17400r f48928b;

    /* renamed from: c */
    private final /* synthetic */ ZipFile f48929c;

    C17393k(Set set, C17400r rVar, ZipFile zipFile) {
        this.f48927a = set;
        this.f48928b = rVar;
        this.f48929c = zipFile;
    }

    /* renamed from: a */
    public final void mo33711a(C17394l lVar, File file, boolean z) throws IOException {
        FileOutputStream fileOutputStream;
        this.f48927a.add(file);
        if (!z) {
            byte[] bArr = new byte[4096];
            InputStream inputStream = this.f48929c.getInputStream(lVar.f48931b);
            try {
                fileOutputStream = new FileOutputStream(file);
                while (true) {
                    int read = inputStream.read(bArr);
                    if (read <= 0) {
                        break;
                    }
                    fileOutputStream.write(bArr, 0, read);
                }
                fileOutputStream.close();
                if (inputStream != null) {
                    inputStream.close();
                    return;
                }
            } catch (Throwable th) {
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    } catch (Throwable th2) {
                        C17261ak.m42289a(th, th2);
                    }
                }
                throw th;
            }
        }
        return;
        throw th;
    }
}
