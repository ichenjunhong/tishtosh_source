package com.toutiao.proxyserver.net;

import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12799u;
import com.toutiao.proxyserver.p2612d.C51820c;
import java.io.IOException;
import okhttp3.C53504ad;
import okhttp3.C53524e;

/* renamed from: com.toutiao.proxyserver.net.a */
public final class C51867a {

    /* renamed from: a */
    public final C12690b<?> f129393a;

    /* renamed from: b */
    public final C51874d f129394b;

    /* renamed from: c */
    public C51877e f129395c;

    /* renamed from: d */
    public long f129396d;

    /* renamed from: e */
    public long f129397e;

    /* renamed from: f */
    public boolean f129398f;

    /* renamed from: g */
    private final C53524e f129399g;

    /* renamed from: b */
    public final void mo107371b() {
        if (this.f129393a != null) {
            this.f129393a.cancel();
            return;
        }
        if (this.f129399g != null) {
            this.f129399g.mo111248c();
        }
    }

    /* renamed from: a */
    public final C51877e mo107370a() throws IOException {
        if (this.f129393a != null) {
            this.f129396d = System.currentTimeMillis();
            try {
                C12799u execute = this.f129393a.execute();
                this.f129397e = System.currentTimeMillis();
                C51877e eVar = new C51877e(execute, this.f129394b);
                this.f129395c = eVar;
                return eVar;
            } catch (IOException e) {
                throw e;
            } catch (Exception e2) {
                throw new RuntimeException(e2);
            }
        } else if (this.f129399g == null) {
            return null;
        } else {
            try {
                this.f129396d = System.currentTimeMillis();
                C53504ad b = this.f129399g.mo111247b();
                this.f129397e = System.currentTimeMillis();
                C51877e eVar2 = new C51877e(b, this.f129394b);
                this.f129395c = eVar2;
                return eVar2;
            } catch (Exception e3) {
                if (!"Canceled".equalsIgnoreCase(e3.getMessage())) {
                    long currentTimeMillis = System.currentTimeMillis();
                    C51878f fVar = new C51878f();
                    fVar.f26755e = this.f129396d;
                    fVar.f26758h = currentTimeMillis;
                    C9894e.m19819a(currentTimeMillis - this.f129396d, this.f129396d, this.f129394b.f129407a, "", fVar, e3);
                    StringBuilder sb = new StringBuilder("api_error, from okhttp connect: , netInfo: ");
                    sb.append(fVar);
                    sb.append(", url: ");
                    sb.append(this.f129394b.f129407a);
                    sb.append(", error: ");
                    sb.append(e3.getMessage());
                    C51820c.m111145d("HttpCall", sb.toString());
                }
                throw e3;
            }
        }
    }

    public C51867a(C12690b<?> bVar, C51874d dVar) {
        this.f129393a = bVar;
        this.f129394b = dVar;
    }

    public C51867a(C53524e eVar, C51874d dVar) {
        this.f129399g = eVar;
        this.f129394b = dVar;
    }
}
