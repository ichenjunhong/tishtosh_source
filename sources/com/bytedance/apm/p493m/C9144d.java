package com.bytedance.apm.p493m;

import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;
import java.util.zip.GZIPOutputStream;

/* renamed from: com.bytedance.apm.m.d */
final class C9144d {

    /* renamed from: a */
    String f25051a;

    /* renamed from: b */
    byte[] f25052b;

    /* renamed from: c */
    final Map<String, String> f25053c = new HashMap();

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo16516a() throws IOException {
        if (this.f25052b.length > 128) {
            ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(VideoCacheReadBuffersizeExperiment.DEFAULT);
            GZIPOutputStream gZIPOutputStream = new GZIPOutputStream(byteArrayOutputStream);
            try {
                gZIPOutputStream.write(this.f25052b);
                gZIPOutputStream.close();
                this.f25052b = byteArrayOutputStream.toByteArray();
                this.f25053c.put("Content-Encoding", "gzip");
            } catch (IOException e) {
                throw e;
            } catch (Throwable th) {
                gZIPOutputStream.close();
                throw th;
            }
        }
    }

    C9144d(String str, byte[] bArr) {
        this.f25051a = str;
        this.f25052b = bArr;
    }
}
