package com.google.p1057b.p1062e;

import com.google.p1057b.p1058a.C17421k;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

/* renamed from: com.google.b.e.b */
public abstract class C17730b {
    protected C17730b() {
    }

    /* renamed from: a */
    public abstract InputStream mo34509a() throws IOException;

    /* renamed from: a */
    public final long mo34508a(C17729a aVar) throws IOException {
        C17421k.m42653a(aVar);
        C17732d dVar = new C17732d(C17732d.f49464a);
        try {
            InputStream inputStream = (InputStream) dVar.mo34510a(mo34509a());
            OutputStream outputStream = (OutputStream) dVar.mo34510a(aVar.mo34507a());
            C17421k.m42653a(inputStream);
            C17421k.m42653a(outputStream);
            byte[] bArr = new byte[VideoCacheReadBuffersizeExperiment.DEFAULT];
            long j = 0;
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    outputStream.write(bArr, 0, read);
                    j += (long) read;
                } else {
                    dVar.close();
                    return j;
                }
            }
        } catch (Throwable th) {
            dVar.close();
            throw th;
        }
    }
}
