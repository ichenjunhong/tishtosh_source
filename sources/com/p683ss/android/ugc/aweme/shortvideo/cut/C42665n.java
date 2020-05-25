package com.p683ss.android.ugc.aweme.shortvideo.cut;

import android.content.Context;
import android.text.TextUtils;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.aweme.shortvideo.C42469bn;
import com.p683ss.android.ugc.effectmanager.p2431b.C48570a;
import com.p683ss.android.ugc.effectmanager.p2431b.C48570a.C48576c;
import com.p683ss.android.ugc.tools.utils.C50200d;
import java.io.File;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.n */
public final class C42665n<T> {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f107954a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42665n.class), "diskCache", "getDiskCache()Lcom/ss/android/ugc/effectmanager/disklrucache/DiskLruCache;"))};

    /* renamed from: d */
    public static final C42666a f107955d = new C42666a(null);

    /* renamed from: b */
    public final long f107956b;

    /* renamed from: c */
    public final String f107957c;

    /* renamed from: e */
    private final C52668f f107958e;

    /* renamed from: f */
    private final C42625b<T> f107959f;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.n$a */
    public static final class C42666a {
        private C42666a() {
        }

        public /* synthetic */ C42666a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.n$b */
    static final class C42667b extends C52712l implements C52670a<C48570a> {

        /* renamed from: a */
        final /* synthetic */ C42665n f107960a;

        C42667b(C42665n nVar) {
            this.f107960a = nVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C48570a.m105071a(new File(this.f107960a.f107957c), 1, 1, this.f107960a.f107956b);
        }
    }

    /* renamed from: b */
    private final C48570a m93625b() {
        return (C48570a) this.f107958e.getValue();
    }

    /* renamed from: a */
    public final void mo86987a() {
        try {
            m93625b().mo96112e();
            C48570a b = m93625b();
            C52711k.m112236a((Object) b, "diskCache");
            b.f122087b.delete();
        } catch (Exception unused) {
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x003c  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.shortvideo.cut.C42675s<T> mo86986a(java.lang.String r3) {
        /*
            r2 = this;
            java.lang.String r0 = "key"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            r0 = r3
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0010
            return r1
        L_0x0010:
            com.ss.android.ugc.effectmanager.b.a r0 = r2.m93625b()     // Catch:{ all -> 0x0038 }
            java.lang.String r3 = com.p683ss.android.ugc.aweme.shortvideo.C42469bn.m93320a(r3)     // Catch:{ all -> 0x0038 }
            com.ss.android.ugc.effectmanager.b.a$c r3 = r0.mo96103a(r3)     // Catch:{ all -> 0x0038 }
            if (r3 == 0) goto L_0x0037
            r0 = 0
            java.io.InputStream r0 = r3.mo96128a(r0)     // Catch:{ all -> 0x0035 }
            java.lang.String r1 = "snapshot.getInputStream(0)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)     // Catch:{ all -> 0x0035 }
            com.ss.android.ugc.aweme.shortvideo.cut.b<T> r1 = r2.f107959f     // Catch:{ all -> 0x0035 }
            com.ss.android.ugc.aweme.shortvideo.cut.s r1 = r1.mo86840a(r0)     // Catch:{ all -> 0x0035 }
            r0.close()     // Catch:{ all -> 0x0035 }
            r3.close()
            return r1
        L_0x0035:
            r0 = move-exception
            goto L_0x003a
        L_0x0037:
            return r1
        L_0x0038:
            r0 = move-exception
            r3 = r1
        L_0x003a:
            if (r3 == 0) goto L_0x003f
            r3.close()
        L_0x003f:
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.C42665n.mo86986a(java.lang.String):com.ss.android.ugc.aweme.shortvideo.cut.s");
    }

    /* renamed from: b */
    public final boolean mo86989b(String str) {
        C52711k.m112240b(str, "key");
        if (TextUtils.isEmpty(str)) {
            return false;
        }
        C48576c a = m93625b().mo96103a(C42469bn.m93320a(str));
        if (a == null) {
            return false;
        }
        a.close();
        return true;
    }

    public C42665n(String str, C42625b<T> bVar) {
        C52711k.m112240b(str, "cacheDir");
        C52711k.m112240b(bVar, "cacheWriterAndReader");
        this.f107957c = str;
        this.f107959f = bVar;
        long a = C50200d.m108338a((Context) C39629l.m88233b());
        long j = 13107200;
        if (a > 52428800) {
            j = 52428800;
        } else if (a > 26214400) {
            j = 26214400;
        } else if (a <= 13107200) {
            j = 10485760;
        }
        this.f107956b = j;
        this.f107958e = C52732g.m112285a(new C42667b(this));
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0058 A[SYNTHETIC, Splitter:B:17:0x0058] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo86988a(java.lang.String r4, com.p683ss.android.ugc.aweme.shortvideo.cut.C42675s<T> r5, p2628d.p2639f.p2640a.C52671b<? super java.lang.Boolean, p2628d.C52860x> r6) {
        /*
            r3 = this;
            java.lang.String r0 = "key"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.String r0 = "videoFrameData"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            java.lang.String r0 = "onInsertFinish"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r0)
            r0 = r4
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            r1 = 0
            if (r0 == 0) goto L_0x0021
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r6.invoke(r4)
            return
        L_0x0021:
            r0 = 0
            com.ss.android.ugc.effectmanager.b.a r2 = r3.m93625b()     // Catch:{ Exception -> 0x0055 }
            java.lang.String r4 = com.p683ss.android.ugc.aweme.shortvideo.C42469bn.m93320a(r4)     // Catch:{ Exception -> 0x0055 }
            com.ss.android.ugc.effectmanager.b.a$a r4 = r2.mo96106b(r4)     // Catch:{ Exception -> 0x0055 }
            if (r4 == 0) goto L_0x0054
            java.io.OutputStream r0 = r4.mo96116a(r1)     // Catch:{ Exception -> 0x0056 }
            if (r0 == 0) goto L_0x0054
            com.ss.android.ugc.aweme.shortvideo.cut.b<T> r2 = r3.f107959f     // Catch:{ Exception -> 0x0056 }
            r2.mo86841a(r0, r5)     // Catch:{ Exception -> 0x0056 }
            r0.flush()     // Catch:{ Exception -> 0x0056 }
            r0.close()     // Catch:{ Exception -> 0x0056 }
            r4.mo96117a()     // Catch:{ Exception -> 0x0056 }
            r5 = 1
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)     // Catch:{ Exception -> 0x0056 }
            r6.invoke(r5)     // Catch:{ Exception -> 0x0056 }
            com.ss.android.ugc.effectmanager.b.a r5 = r3.m93625b()     // Catch:{ Exception -> 0x0056 }
            r5.mo96108c()     // Catch:{ Exception -> 0x0056 }
            goto L_0x006f
        L_0x0054:
            return
        L_0x0055:
            r4 = r0
        L_0x0056:
            if (r4 == 0) goto L_0x0068
            r4.mo96118b()     // Catch:{ Exception -> 0x005c }
            goto L_0x0068
        L_0x005c:
            r4 = move-exception
            com.ss.android.ugc.aweme.port.in.u r5 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            com.ss.android.ugc.aweme.port.in.as r5 = r5.mo58567E()
            r5.mo49424a(r4)
        L_0x0068:
            java.lang.Boolean r4 = java.lang.Boolean.valueOf(r1)
            r6.invoke(r4)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.cut.C42665n.mo86988a(java.lang.String, com.ss.android.ugc.aweme.shortvideo.cut.s, d.f.a.b):void");
    }
}
