package com.p683ss.android.ugc.aweme.filter.repository.internal.downloader;

import com.p683ss.android.ugc.aweme.filter.repository.internal.C31596l;
import com.p683ss.android.ugc.aweme.filter.repository.internal.C31600p;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31486b;
import java.io.InputStream;
import java.util.concurrent.TimeUnit;
import okhttp3.C53506ae;
import okhttp3.C53682y;
import okhttp3.C53682y.C53684a;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p093k.C2168a;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;
import p2666g.C53068c.C53069a;
import p2666g.C53134n;
import p2666g.C53134n.C53136a;
import p2666g.p2667a.p2668a.C53060h;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.downloader.d */
public final class C31558d implements C31596l {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f82539a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31558d.class), "httpClient", "getHttpClient()Lokhttp3/OkHttpClient;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C31558d.class), "retrofit", "getRetrofit()Lretrofit2/Retrofit;"))};

    /* renamed from: b */
    final C52668f f82540b = C52732g.m112285a(C31562d.f82550a);

    /* renamed from: c */
    private final C52668f f82541c = C52732g.m112285a(new C31563e(this));

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.downloader.d$a */
    static final class C31559a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        final /* synthetic */ String f82542a;

        /* renamed from: b */
        final /* synthetic */ String f82543b;

        C31559a(String str, String str2) {
            this.f82542a = str;
            this.f82543b = str2;
        }

        public final /* synthetic */ Object apply(Object obj) {
            C53506ae aeVar = (C53506ae) obj;
            C52711k.m112240b(aeVar, "it");
            InputStream byteStream = aeVar.byteStream();
            C52711k.m112236a((Object) byteStream, "it.byteStream()");
            StringBuilder sb = new StringBuilder();
            sb.append(C31486b.m73322a(this.f82542a));
            sb.append(this.f82543b);
            C31564e.m73424a(byteStream, sb.toString());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.downloader.d$b */
    static final class C31560b<T> implements C1710e<C52860x> {

        /* renamed from: a */
        final /* synthetic */ C31600p f82544a;

        /* renamed from: b */
        final /* synthetic */ String f82545b;

        /* renamed from: c */
        final /* synthetic */ long f82546c;

        C31560b(C31600p pVar, String str, long j) {
            this.f82544a = pVar;
            this.f82545b = str;
            this.f82546c = j;
        }

        public final /* synthetic */ void accept(Object obj) {
            C52860x xVar = (C52860x) obj;
            C31600p pVar = this.f82544a;
            if (pVar != null) {
                pVar.mo64461a(this.f82545b, System.currentTimeMillis() - this.f82546c);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.downloader.d$c */
    static final class C31561c<T> implements C1710e<Throwable> {

        /* renamed from: a */
        final /* synthetic */ C31600p f82547a;

        /* renamed from: b */
        final /* synthetic */ String f82548b;

        /* renamed from: c */
        final /* synthetic */ long f82549c;

        C31561c(C31600p pVar, String str, long j) {
            this.f82547a = pVar;
            this.f82548b = str;
            this.f82549c = j;
        }

        public final /* synthetic */ void accept(Object obj) {
            Throwable th = (Throwable) obj;
            C31600p pVar = this.f82547a;
            if (pVar != null) {
                String str = this.f82548b;
                long currentTimeMillis = System.currentTimeMillis() - this.f82549c;
                if (!(th instanceof Exception)) {
                    th = null;
                }
                pVar.mo64462a(str, currentTimeMillis, (Exception) th, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.downloader.d$d */
    static final class C31562d extends C52712l implements C52670a<C53682y> {

        /* renamed from: a */
        public static final C31562d f82550a = new C31562d();

        C31562d() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C53684a().mo111671b(true).mo111654a(15, TimeUnit.SECONDS).mo111667a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.downloader.d$e */
    static final class C31563e extends C52712l implements C52670a<C53134n> {

        /* renamed from: a */
        final /* synthetic */ C31558d f82551a;

        C31563e(C31558d dVar) {
            this.f82551a = dVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C53136a().mo110655a("http://example.com").mo110656a((C53682y) this.f82551a.f82540b.getValue()).mo110653a((C53069a) C53060h.m112820a()).mo110657a();
        }
    }

    /* renamed from: a */
    public final void mo64465a(String str, String str2, String str3, C31600p pVar) {
        C52711k.m112240b(str, "downloadUrl");
        C52711k.m112240b(str2, "fileName");
        C52711k.m112240b(str3, "dir");
        long currentTimeMillis = System.currentTimeMillis();
        ((DownloadService) ((C53134n) this.f82541c.getValue()).mo110651a(DownloadService.class)).download(str).mo6529b(C2168a.m6521b()).mo6541d((C1711f<? super T, ? extends R>) new C31559a<Object,Object>(str3, str2)).mo6505a((C1710e<? super T>) new C31560b<Object>(pVar, str, currentTimeMillis), (C1710e<? super Throwable>) new C31561c<Object>(pVar, str, currentTimeMillis));
    }
}
