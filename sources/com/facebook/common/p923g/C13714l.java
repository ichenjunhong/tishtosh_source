package com.facebook.common.p923g;

import com.facebook.common.p920d.C13689i;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.facebook.common.g.l */
public final class C13714l {

    /* renamed from: a */
    private final int f35689a;

    /* renamed from: b */
    private final C13702a f35690b;

    public C13714l(C13702a aVar) {
        this(aVar, 16384);
    }

    private C13714l(C13702a aVar, int i) {
        C13689i.m27655a(true);
        this.f35689a = 16384;
        this.f35690b = aVar;
    }

    /* renamed from: a */
    public final long mo25629a(InputStream inputStream, OutputStream outputStream) throws IOException {
        byte[] bArr = (byte[]) this.f35690b.mo25599a(this.f35689a);
        long j = 0;
        while (true) {
            try {
                int read = inputStream.read(bArr, 0, this.f35689a);
                if (read == -1) {
                    return j;
                }
                outputStream.write(bArr, 0, read);
                j += (long) read;
            } finally {
                this.f35690b.mo25600a(bArr);
            }
        }
    }
}
