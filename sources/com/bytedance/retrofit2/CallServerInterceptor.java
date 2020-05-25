package com.bytedance.retrofit2;

import android.os.SystemClock;
import com.bytedance.retrofit2.mime.TypedInput;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p830a.C12688d;
import com.bytedance.retrofit2.p830a.C12689e;
import com.bytedance.retrofit2.p833c.C12727a;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.lancet.p1153c.C18981f;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;
import java.io.IOException;

public class CallServerInterceptor<T> implements C12727a, C12758l, C12759m {

    /* renamed from: a */
    volatile C12689e f33270a;

    /* renamed from: b */
    public C12686c f33271b;

    /* renamed from: c */
    public volatile boolean f33272c;

    /* renamed from: d */
    private final C12797t<T> f33273d;

    /* renamed from: e */
    private Throwable f33274e;

    /* renamed from: f */
    private volatile boolean f33275f;

    /* renamed from: a */
    public final synchronized boolean mo23817a() {
        return this.f33275f;
    }

    /* renamed from: b */
    public final synchronized void mo23819b() {
        this.f33275f = false;
    }

    public void doCollect() {
        if (this.f33270a instanceof C12758l) {
            ((C12758l) this.f33270a).doCollect();
        }
    }

    public Object getRequestInfo() {
        if (this.f33270a instanceof C12759m) {
            ((C12759m) this.f33270a).getRequestInfo();
        }
        return null;
    }

    public CallServerInterceptor(C12797t<T> tVar) {
        this.f33273d = tVar;
    }

    /* renamed from: a */
    public final C12799u mo9544a(C12728a aVar) throws Exception {
        if (!(aVar.mo23901b() instanceof C23259b)) {
            return mo23818b(aVar);
        }
        C23259b bVar = (C23259b) aVar.mo23901b();
        if (bVar.f62194F > 0) {
            long uptimeMillis = SystemClock.uptimeMillis() - bVar.f62194F;
            bVar.mo48196a(bVar.f62196H, uptimeMillis);
            bVar.mo48197b(bVar.f62196H, uptimeMillis);
        }
        bVar.mo48195a(getClass().getSimpleName());
        bVar.f62194F = SystemClock.uptimeMillis();
        C12799u b = mo23818b(aVar);
        if (bVar.f62195G > 0) {
            long uptimeMillis2 = SystemClock.uptimeMillis() - bVar.f62195G;
            String simpleName = getClass().getSimpleName();
            bVar.mo48196a(simpleName, uptimeMillis2);
            bVar.mo48198c(simpleName, uptimeMillis2);
        }
        bVar.f62195G = SystemClock.uptimeMillis();
        return b;
    }

    /* renamed from: b */
    public final C12799u mo23818b(C12728a aVar) throws Exception {
        C12796s b = aVar.mo23901b();
        if (b != null) {
            b.f33472e = System.currentTimeMillis();
        }
        Long valueOf = Long.valueOf(SystemClock.uptimeMillis());
        this.f33271b = aVar.mo23899a();
        synchronized (this) {
            if (!this.f33275f) {
                this.f33275f = true;
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f33274e == null) {
            try {
                this.f33271b.f33332m = b;
                C12686c cVar = this.f33271b;
                long currentTimeMillis = System.currentTimeMillis();
                C12689e a = this.f33273d.f33496c.mo9562a().mo9561a(cVar);
                if (C22574a.m55738f().f60703d && C18981f.m46159a(cVar) != -1) {
                    C22574a.m55738f().mo46924c("feed_create_sslcall", System.currentTimeMillis() - currentTimeMillis, false);
                }
                this.f33270a = a;
                if (this.f33272c) {
                    this.f33270a.mo9560b();
                }
                if (b != null) {
                    b.f33485r.put("CallServerInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf.longValue()));
                }
                C12688d a2 = C12730d.m25569a(this, this.f33270a, b);
                Long valueOf2 = Long.valueOf(SystemClock.uptimeMillis());
                C12799u a3 = C12730d.m25570a(this, a2, b);
                if (b != null) {
                    b.f33486s.put("CallServerInterceptor", Long.valueOf(SystemClock.uptimeMillis() - valueOf2.longValue()));
                }
                return a3;
            } catch (IOException | RuntimeException e) {
                this.f33274e = e;
                throw e;
            } catch (Throwable th) {
                this.f33274e = th;
                if (th instanceof Exception) {
                    throw ((Exception) th);
                }
                throw new Exception(th);
            }
        } else if (this.f33274e instanceof IOException) {
            throw ((IOException) this.f33274e);
        } else {
            throw new Exception(this.f33274e);
        }
    }

    /* renamed from: a */
    public final C12799u<T> mo23816a(C12688d dVar, C12796s sVar) throws IOException {
        if (dVar != null) {
            TypedInput typedInput = dVar.f33350e;
            int i = dVar.f33347b;
            if (i < 200 || i >= 300) {
                return C12799u.m25686a(typedInput, dVar);
            }
            if (i == 204 || i == 205) {
                return C12799u.m25687a(null, dVar);
            }
            if (sVar != null) {
                try {
                    sVar.f33483p = SystemClock.uptimeMillis();
                } catch (RuntimeException e) {
                    throw e;
                }
            }
            Object a = this.f33273d.mo23950a(typedInput);
            if (sVar != null) {
                sVar.f33484q = SystemClock.uptimeMillis();
            }
            return C12799u.m25687a(a, dVar);
        }
        throw new IOException("SsResponse is null");
    }
}
