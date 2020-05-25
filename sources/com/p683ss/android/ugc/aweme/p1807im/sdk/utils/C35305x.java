package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import com.bytedance.retrofit2.mime.TypedFile;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35226bd.C35227a;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.OutputStream;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.x */
public final class C35305x extends TypedFile {

    /* renamed from: a */
    private File f90646a;

    /* renamed from: b */
    private C35227a f90647b;

    /* renamed from: c */
    private long f90648c;

    public final void writeTo(OutputStream outputStream) throws IOException {
        byte[] bArr = new byte[4096];
        long length = this.f90646a.length();
        FileInputStream fileInputStream = new FileInputStream(this.f90646a);
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    this.f90648c += (long) read;
                    if (this.f90647b != null) {
                        this.f90647b.mo70783a((double) ((int) ((this.f90648c * 100) / length)));
                    }
                } else {
                    return;
                }
            } finally {
                fileInputStream.close();
            }
        }
    }

    public C35305x(String str, File file, C35227a aVar) {
        super(null, file);
        this.f90647b = aVar;
        this.f90646a = file;
    }
}
