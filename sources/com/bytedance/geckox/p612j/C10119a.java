package com.bytedance.geckox.p612j;

import android.accounts.NetworkErrorException;
import com.bytedance.geckox.buffer.p597a.C10055b;
import com.bytedance.geckox.utils.C10152b;
import java.io.BufferedInputStream;
import java.io.Closeable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53671s;
import okhttp3.C53678w;
import okhttp3.C53682y;
import okhttp3.C53682y.C53684a;

/* renamed from: com.bytedance.geckox.j.a */
public final class C10119a implements C10120b {

    /* renamed from: a */
    protected C53682y f27416a = new C53684a().mo111654a(10, TimeUnit.SECONDS).mo111668b(10, TimeUnit.SECONDS).mo111672c(10, TimeUnit.SECONDS).mo111667a();

    /* renamed from: b */
    protected C53682y f27417b = new C53684a().mo111654a(10, TimeUnit.SECONDS).mo111668b(30, TimeUnit.SECONDS).mo111672c(30, TimeUnit.SECONDS).mo111667a();

    /* renamed from: a */
    private static Map<String, String> m20390a(C53671s sVar) {
        if (sVar == null) {
            return null;
        }
        HashMap hashMap = new HashMap();
        for (String str : sVar.mo111596b()) {
            hashMap.put(str, sVar.mo111593a(str));
        }
        return hashMap;
    }

    /* renamed from: a */
    public final C10121c mo18094a(String str, String str2) throws Exception {
        C53498ab c = new C53499a().mo111262a(str).mo111265a(C53500ac.create(C53678w.m114225a("application/json; charset=utf-8"), str2)).mo111272c();
        C53504ad b = this.f27416a.mo111325a(c).mo111247b();
        if (b.f132400c == 200) {
            return new C10121c(m20390a(c.f132380c), b.f132404g.string());
        }
        StringBuilder sb = new StringBuilder("net work post failed, code: ");
        sb.append(b.f132400c);
        sb.append(", url:");
        sb.append(str);
        throw new NetworkErrorException(sb.toString());
    }

    /* renamed from: a */
    public final void mo18095a(String str, long j, C10055b bVar) throws Exception {
        BufferedInputStream bufferedInputStream;
        int i = 0;
        BufferedInputStream bufferedInputStream2 = null;
        try {
            C53504ad b = this.f27417b.mo111325a(new C53499a().mo111260a().mo111262a(str).mo111272c()).mo111247b();
            int i2 = b.f132400c;
            try {
                bufferedInputStream = new BufferedInputStream(b.f132404g.byteStream());
            } catch (Exception e) {
                e = e;
                i = i2;
                try {
                    StringBuilder sb = new StringBuilder("downloadFile failed, code: ");
                    sb.append(i);
                    sb.append(", url:");
                    sb.append(str);
                    sb.append(", caused by:");
                    sb.append(e.getMessage());
                    throw new RuntimeException(sb.toString(), e);
                } catch (Throwable th) {
                    th = th;
                    C10152b.m20477a((Closeable) bufferedInputStream2);
                    throw th;
                }
            }
            try {
                byte[] bArr = new byte[2048];
                while (true) {
                    int read = bufferedInputStream.read(bArr, 0, 2048);
                    if (read != -1) {
                        bVar.write(bArr, 0, read);
                    } else {
                        C10152b.m20477a((Closeable) bufferedInputStream);
                        return;
                    }
                }
            } catch (Exception e2) {
                e = e2;
                i = i2;
                bufferedInputStream2 = bufferedInputStream;
                StringBuilder sb2 = new StringBuilder("downloadFile failed, code: ");
                sb2.append(i);
                sb2.append(", url:");
                sb2.append(str);
                sb2.append(", caused by:");
                sb2.append(e.getMessage());
                throw new RuntimeException(sb2.toString(), e);
            } catch (Throwable th2) {
                th = th2;
                bufferedInputStream2 = bufferedInputStream;
                C10152b.m20477a((Closeable) bufferedInputStream2);
                throw th;
            }
        } catch (Exception e3) {
            e = e3;
            StringBuilder sb22 = new StringBuilder("downloadFile failed, code: ");
            sb22.append(i);
            sb22.append(", url:");
            sb22.append(str);
            sb22.append(", caused by:");
            sb22.append(e.getMessage());
            throw new RuntimeException(sb22.toString(), e);
        }
    }
}
