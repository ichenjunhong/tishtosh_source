package com.bytedance.ies.geckoclient.p682d;

import android.accounts.NetworkErrorException;
import android.util.Pair;
import com.bytedance.ies.geckoclient.C10880d;
import com.taobao.android.dexposed.ClassUtils;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53506ae;
import okhttp3.C53668q.C53669a;
import okhttp3.C53678w;
import okhttp3.C53682y;
import okhttp3.C53682y.C53684a;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;

/* renamed from: com.bytedance.ies.geckoclient.d.d */
public final class C10884d implements C10882b {

    /* renamed from: a */
    public static C53684a f29202a = new C53684a();

    /* renamed from: b */
    public static C53684a f29203b = new C53684a();

    /* renamed from: c */
    private static C53682y f29204c;

    /* renamed from: d */
    private static C53682y f29205d;

    public C10884d() {
        f29204c = f29202a.mo111667a();
        f29205d = f29203b.mo111667a();
    }

    /* renamed from: a */
    private static void m22067a(BufferedSink bufferedSink) {
        if (bufferedSink != null) {
            try {
                bufferedSink.flush();
                bufferedSink.close();
            } catch (IOException unused) {
            }
        }
    }

    /* renamed from: a */
    public final String mo19647a(String str, String str2) throws Exception {
        C53504ad b = f29204c.mo111325a(new C53499a().mo111262a(str).mo111265a(C53500ac.create(C53678w.m114225a("application/json; charset=utf-8"), str2)).mo111272c()).mo111247b();
        if (b.f132400c == 200) {
            return b.f132404g.string();
        }
        StringBuilder sb = new StringBuilder("net work post failed,status code = ");
        sb.append(b.f132400c);
        throw new NetworkErrorException(sb.toString());
    }

    /* renamed from: a */
    public final String mo19648a(String str, List<Pair<String, String>> list) throws Exception {
        C53669a aVar = new C53669a();
        if (list.size() > 0) {
            for (Pair pair : list) {
                aVar.mo111586a((String) pair.first, (String) pair.second);
            }
        }
        C53504ad b = f29204c.mo111325a(new C53499a().mo111262a(str).mo111265a((C53500ac) aVar.mo111587a()).mo111272c()).mo111247b();
        if (b.f132400c == 200) {
            return b.f132404g.string();
        }
        StringBuilder sb = new StringBuilder("net work post failed,status code = ");
        sb.append(b.f132400c);
        throw new NetworkErrorException(sb.toString());
    }

    /* renamed from: b */
    public final boolean mo19649b(String str, String str2) throws Exception {
        C53499a aVar = new C53499a();
        aVar.mo111260a().mo111262a(str);
        C53504ad b = f29205d.mo111325a(aVar.mo111272c()).mo111247b();
        C53506ae aeVar = b.f132404g;
        BufferedSource source = aeVar.source();
        long contentLength = aeVar.contentLength();
        new StringBuilder("contentLength:").append(contentLength);
        File file = new File(str2);
        if (file.isDirectory()) {
            C10880d.m22054a(file);
        }
        try {
            BufferedSink buffer = Okio.buffer(Okio.sink(file));
            long j = 0;
            long j2 = -1;
            long j3 = -1;
            while (true) {
                try {
                    long read = source.read(buffer.buffer(), 2048);
                    if (read != j2) {
                        j += read;
                        long j4 = (long) ((int) ((1000 * j) / contentLength));
                        if (j4 - j3 >= 1) {
                            StringBuilder sb = new StringBuilder("download progress:");
                            sb.append(j4 / 10);
                            sb.append(ClassUtils.PACKAGE_SEPARATOR);
                            sb.append(j4 % 10);
                            j3 = j4;
                        }
                        j2 = -1;
                    } else {
                        try {
                            break;
                        } catch (Exception e) {
                            Exception exc = e;
                            m22067a(buffer);
                            throw exc;
                        }
                    }
                } catch (IOException e2) {
                    m22067a(buffer);
                    throw e2;
                }
            }
            buffer.writeAll(source);
            m22067a(buffer);
            if (b.f132400c == 200) {
                return true;
            }
            StringBuilder sb2 = new StringBuilder("downloadFile failed,status code: ");
            sb2.append(b.f132400c);
            throw new NetworkErrorException(sb2.toString());
        } catch (FileNotFoundException e3) {
            m22067a(null);
            throw e3;
        }
    }
}
