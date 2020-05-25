package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import com.squareup.okhttp.MediaType;
import com.squareup.okhttp.RequestBody;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import okio.BufferedSink;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bd */
public final class C35226bd extends RequestBody {

    /* renamed from: a */
    public C35227a f90525a;

    /* renamed from: b */
    private File f90526b;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.bd$a */
    public interface C35227a {
        /* renamed from: a */
        void mo70782a();

        /* renamed from: a */
        void mo70783a(double d);

        /* renamed from: a */
        void mo70784a(String str);

        /* renamed from: a */
        void mo70785a(Throwable th);
    }

    public final long contentLength() throws IOException {
        return this.f90526b.length();
    }

    public final MediaType contentType() {
        return MediaType.parse("multipart/form-data");
    }

    public final void writeTo(BufferedSink bufferedSink) throws IOException {
        double length = (double) this.f90526b.length();
        byte[] bArr = new byte[4096];
        FileInputStream fileInputStream = new FileInputStream(this.f90526b);
        long j = 0;
        while (true) {
            try {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                if (this.f90525a != null) {
                    C35227a aVar = this.f90525a;
                    double d = (double) j;
                    Double.isNaN(d);
                    Double.isNaN(length);
                    aVar.mo70783a(d / length);
                }
                j += (long) read;
                bufferedSink.write(bArr, 0, read);
            } catch (Exception e) {
                if (this.f90525a != null) {
                    this.f90525a.mo70785a((Throwable) e);
                }
                return;
            } finally {
                fileInputStream.close();
            }
        }
        if (this.f90525a != null) {
            this.f90525a.mo70782a();
        }
    }

    public C35226bd(File file, C35227a aVar) {
        this.f90526b = file;
        this.f90525a = aVar;
    }
}
