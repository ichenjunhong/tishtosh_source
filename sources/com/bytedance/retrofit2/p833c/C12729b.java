package com.bytedance.retrofit2.p833c;

import android.os.SystemClock;
import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12796s;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.CallServerInterceptor;
import com.bytedance.retrofit2.p830a.C12686c;
import com.bytedance.retrofit2.p833c.C12727a.C12728a;
import com.p683ss.android.ugc.aweme.feed.C31253x;
import com.p683ss.android.ugc.aweme.feed.api.C30146d;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1386ar.C23259b;
import com.p683ss.android.ugc.aweme.p1386ar.C23260c;
import java.util.List;

/* renamed from: com.bytedance.retrofit2.c.b */
public final class C12729b implements C12728a {

    /* renamed from: a */
    public final int f33352a;

    /* renamed from: b */
    public C12796s f33353b;

    /* renamed from: c */
    private final List<C12727a> f33354c;

    /* renamed from: d */
    private final C12686c f33355d;

    /* renamed from: e */
    private final C12690b f33356e;

    /* renamed from: f */
    private int f33357f;

    /* renamed from: a */
    public final C12686c mo23899a() {
        return this.f33355d;
    }

    /* renamed from: b */
    public final C12796s mo23901b() {
        return this.f33353b;
    }

    /* renamed from: a */
    public final C12799u mo23900a(C12686c cVar) throws Exception {
        C12796s sVar;
        String str;
        C12686c cVar2 = cVar;
        C12796s sVar2 = this.f33353b;
        if (!(sVar2 instanceof C23259b)) {
            C23259b bVar = new C23259b(sVar2.f33470c, sVar2.f33471d);
            this.f33353b = bVar;
            sVar = bVar;
        } else {
            sVar = sVar2;
        }
        if (this.f33352a < this.f33354c.size()) {
            this.f33357f++;
            if (this.f33357f > 1) {
                for (C12727a aVar : this.f33354c) {
                    if (aVar instanceof CallServerInterceptor) {
                        ((CallServerInterceptor) aVar).mo23819b();
                    }
                }
            }
            C12729b bVar2 = new C12729b(this.f33354c, this.f33352a + 1, cVar, this.f33356e, this.f33353b);
            C12727a aVar2 = (C12727a) this.f33354c.get(this.f33352a);
            StringBuilder sb = new StringBuilder("interceptor = ");
            if (aVar2 != null) {
                str = aVar2.toString();
            } else {
                str = "";
            }
            sb.append(str);
            sb.append(" url = ");
            sb.append(cVar2.f33321b);
            C12799u a = aVar2.mo9544a(bVar2);
            if (a == null) {
                StringBuilder sb2 = new StringBuilder("interceptor ");
                sb2.append(aVar2);
                sb2.append(" returned null");
                throw new NullPointerException(sb2.toString());
            } else if (a.f33551a != null) {
                if (Integer.valueOf(this.f33352a).intValue() == 0 && a.f33551a != null && (a.f33551a.f33351f instanceof C9831a)) {
                    C9831a aVar3 = (C9831a) a.f33551a.f33351f;
                    if (aVar3.f26758h > 0 && (sVar instanceof C23259b)) {
                        C23259b bVar3 = (C23259b) sVar;
                        bVar3.f62198J = System.currentTimeMillis();
                        bVar3.f62199K = SystemClock.uptimeMillis() - bVar3.f62200L;
                        C23260c.m57203a(cVar2.f33321b, aVar3, bVar3);
                        C31253x.m72966a();
                        if (!(cVar2 == null || aVar3 == null || bVar3 == null || !C22574a.m55738f().f60703d || !C30146d.m70748a(cVar))) {
                            long j = aVar3.f26754d - aVar3.f26753c;
                            long j2 = aVar3.f26755e - aVar3.f26754d;
                            long j3 = aVar3.f26756f - aVar3.f26755e;
                            long j4 = aVar3.f26758h - aVar3.f26756f;
                            long j5 = bVar3.f62199K;
                            long j6 = j4;
                            long j7 = bVar3.f62198J - bVar3.f33470c;
                            C22574a.m55738f().mo46920b("feed_api_to_net_api", aVar3.f26753c, false);
                            C22574a.m55738f().mo46924c("feed_net_api_to_interceptors", j, false);
                            C22574a.m55738f().mo46924c("feed_interceptors_pre_duration", j2, false);
                            C22574a.m55738f().mo46924c("feed_network_to_response", j3, false);
                            C22574a.m55738f().mo46924c("feed_read_response_duration", j6, false);
                            C22574a.m55738f().mo46924c("feed_interceptors_post_duration", j5, false);
                            C22574a.m55738f().mo46924c("feed_net_api_total", j7, false);
                            C31253x.m72967a(bVar3);
                            if (aVar3.f26772v == 0) {
                                if (aVar3.f26760j > 0) {
                                    C22574a.m55738f().mo46924c("feed_cronet_dns_duration", aVar3.f26760j, false);
                                }
                                if (aVar3.f26761k > 0) {
                                    C22574a.m55738f().mo46924c("feed_cronet_connect_duration", aVar3.f26761k, false);
                                }
                                if (aVar3.f26762l > 0) {
                                    C22574a.m55738f().mo46924c("feed_cronet_ssl_duration", aVar3.f26762l, false);
                                }
                                if (aVar3.f26763m > 0) {
                                    C22574a.m55738f().mo46924c("feed_cronet_send_duration", aVar3.f26763m, false);
                                }
                                if (aVar3.f26767q > 0) {
                                    C22574a.m55738f().mo46924c("feed_cronet_timing_waiting", aVar3.f26767q, false);
                                }
                                if (aVar3.f26765o > 0) {
                                    C22574a.m55738f().mo46924c("feed_cronet_receive_duration", aVar3.f26765o, false);
                                }
                                if (aVar3.f26768r > 0) {
                                    C22574a.m55738f().mo46924c("feed_cronet_total", aVar3.f26768r, false);
                                }
                            }
                        }
                    }
                }
                return a;
            } else {
                StringBuilder sb3 = new StringBuilder("interceptor ");
                sb3.append(aVar2);
                sb3.append(" returned a ssResponse with no body");
                throw new IllegalStateException(sb3.toString());
            }
        } else {
            throw new AssertionError();
        }
    }

    public C12729b(List<C12727a> list, int i, C12686c cVar, C12690b bVar, C12796s sVar) {
        this.f33354c = list;
        this.f33352a = i;
        this.f33355d = cVar;
        this.f33356e = bVar;
        this.f33353b = sVar;
    }
}
