package com.toutiao.proxyserver;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.frameworks.baselib.network.http.C9831a;
import com.bytedance.frameworks.baselib.network.http.C9831a.C9833a;
import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.frameworks.baselib.network.http.cronet.p572a.C9872a;
import com.bytedance.frameworks.baselib.network.http.p574e.C9917l;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.C12758l;
import com.bytedance.retrofit2.C12759m;
import com.bytedance.ttnet.p885c.C13302e;
import com.bytedance.ttnet.p887e.C13333g;
import com.toutiao.proxyserver.net.C51867a;
import com.toutiao.proxyserver.net.C51868b;
import com.toutiao.proxyserver.net.C51873c;
import com.toutiao.proxyserver.net.C51874d;
import com.toutiao.proxyserver.net.C51874d.C51876a;
import com.toutiao.proxyserver.net.C51877e;
import com.toutiao.proxyserver.net.C51878f;
import com.toutiao.proxyserver.net.INetApi;
import com.toutiao.proxyserver.p2609a.C51797b;
import com.toutiao.proxyserver.p2609a.C51798c;
import com.toutiao.proxyserver.p2610b.C51808b;
import com.toutiao.proxyserver.p2610b.C51809c;
import com.toutiao.proxyserver.p2612d.C51820c;
import com.toutiao.proxyserver.p2614f.C51838d;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53682y;

/* renamed from: com.toutiao.proxyserver.a */
abstract class C51790a implements C51799aa {

    /* renamed from: a */
    protected volatile C51813c f129197a;

    /* renamed from: b */
    protected final C51809c f129198b;

    /* renamed from: c */
    protected final AtomicInteger f129199c = new AtomicInteger();

    /* renamed from: d */
    protected final AtomicLong f129200d = new AtomicLong();

    /* renamed from: e */
    protected volatile List<C51873c> f129201e;

    /* renamed from: f */
    protected volatile C51867a f129202f;

    /* renamed from: g */
    protected volatile String f129203g;

    /* renamed from: h */
    protected volatile String f129204h;

    /* renamed from: i */
    protected volatile C51914w f129205i;

    /* renamed from: j */
    protected volatile C51800ab f129206j;

    /* renamed from: k */
    protected volatile int f129207k;

    /* renamed from: l */
    protected AtomicLong f129208l = new AtomicLong(0);

    /* renamed from: m */
    private AtomicLong f129209m = new AtomicLong(0);

    /* renamed from: n */
    private final AtomicInteger f129210n = new AtomicInteger(0);

    /* renamed from: o */
    private int f129211o = -1;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C51877e mo107270a(String str, int i, int i2, String str2) throws IOException {
        return C51806b.m111115a(this, str, i, i2, str2);
    }

    /* renamed from: a */
    public void mo107271a() {
        if (this.f129210n.compareAndSet(0, 1)) {
            mo107278b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo107278b() {
        C51867a aVar = this.f129202f;
        this.f129202f = null;
        if (aVar != null) {
            aVar.mo107371b();
        }
    }

    /* renamed from: c */
    public final boolean mo107279c() {
        if (this.f129210n.get() == 1) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo107280d() {
        this.f129210n.compareAndSet(0, 2);
        this.f129202f = null;
    }

    /* renamed from: e */
    public final boolean mo107281e() {
        if (this.f129210n.get() == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo107282f() throws C51821e {
        if (mo107279c()) {
            throw new C51821e();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo107285i() {
        this.f129209m.set(SystemClock.elapsedRealtime());
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final void mo107286j() {
        this.f129208l.set(0);
        this.f129209m.set(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final int mo107283g() {
        if (this.f129205i != null) {
            return this.f129205i.f129548c.f129549a;
        }
        if (this.f129197a instanceof C51841g) {
            return 1;
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo107284h() {
        this.f129208l.getAndAdd(SystemClock.elapsedRealtime() - this.f129209m.get());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo107273a(final String str) {
        final C51880o oVar = C51895s.f129471f;
        if (oVar != null) {
            C51838d.m111186b((Runnable) new Runnable() {
                public final void run() {
                    oVar.mo95387a(C51808b.m111117a(C51790a.this.mo107283g()), str, C51790a.this.f129199c.get(), C51790a.this.f129208l.get(), 0);
                }
            });
        }
    }

    public C51790a(C51813c cVar, C51809c cVar2) {
        this.f129197a = cVar;
        this.f129198b = cVar2;
        this.f129207k = 0;
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:22:0x0038, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x003c, code lost:
        r4 = r8;
        r5 = r9;
        r0 = new com.toutiao.proxyserver.C51790a.C517911(r7);
        com.toutiao.proxyserver.p2614f.C51838d.m111186b((java.lang.Runnable) r0);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo107272a(int r8, int r9) {
        /*
            r7 = this;
            com.toutiao.proxyserver.o r2 = com.toutiao.proxyserver.C51895s.f129471f
            if (r2 == 0) goto L_0x004c
            if (r8 <= 0) goto L_0x004c
            if (r9 >= 0) goto L_0x0009
            goto L_0x004c
        L_0x0009:
            int r0 = com.toutiao.proxyserver.C51895s.f129486u
            int r3 = r7.mo107283g()
            r1 = 1
            if (r0 == r1) goto L_0x0017
            r4 = 2
            if (r0 != r4) goto L_0x0048
            if (r3 != r1) goto L_0x0048
        L_0x0017:
            float r0 = (float) r9
            float r1 = (float) r8
            float r0 = r0 / r1
            r1 = 1120403456(0x42c80000, float:100.0)
            float r0 = r0 * r1
            int r0 = (int) r0
            r1 = 100
            if (r0 <= r1) goto L_0x0025
            r0 = 100
        L_0x0025:
            monitor-enter(r7)
            int r4 = r7.f129211o     // Catch:{ all -> 0x0049 }
            int r5 = com.toutiao.proxyserver.C51895s.f129478m     // Catch:{ all -> 0x0049 }
            int r4 = r4 + r5
            if (r4 <= r1) goto L_0x002f
            r4 = 100
        L_0x002f:
            if (r0 > r4) goto L_0x0033
            if (r0 != r1) goto L_0x0037
        L_0x0033:
            int r4 = r7.f129211o     // Catch:{ all -> 0x0049 }
            if (r4 != r1) goto L_0x0039
        L_0x0037:
            monitor-exit(r7)     // Catch:{ all -> 0x0049 }
            return
        L_0x0039:
            r7.f129211o = r0     // Catch:{ all -> 0x0049 }
            monitor-exit(r7)     // Catch:{ all -> 0x0049 }
            com.toutiao.proxyserver.a$1 r6 = new com.toutiao.proxyserver.a$1
            r0 = r6
            r1 = r7
            r4 = r8
            r5 = r9
            r0.<init>(r2, r3, r4, r5)
            com.toutiao.proxyserver.p2614f.C51838d.m111186b(r6)
        L_0x0048:
            return
        L_0x0049:
            r8 = move-exception
            monitor-exit(r7)     // Catch:{ all -> 0x0049 }
            throw r8
        L_0x004c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.C51790a.mo107272a(int, int):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo107275a(Throwable th, String str, int i) {
        C51798c cVar;
        C51878f fVar;
        C51878f fVar2;
        Throwable th2 = th;
        String str2 = str;
        int i2 = i;
        C51867a aVar = this.f129202f;
        if (aVar != null && !aVar.f129398f) {
            aVar.f129398f = true;
            try {
                if (aVar.f129395c != null) {
                    if (aVar.f129395c.f129422d != null) {
                        long currentTimeMillis = System.currentTimeMillis();
                        if (aVar.f129393a instanceof C12758l) {
                            ((C12758l) aVar.f129393a).doCollect();
                        }
                        Object obj = aVar.f129395c.f129422d.f33551a.f33351f;
                        if (obj instanceof C51878f) {
                            fVar = (C51878f) obj;
                            fVar.f26755e = aVar.f129396d;
                            fVar.f26756f = aVar.f129397e;
                            fVar.f26758h = currentTimeMillis;
                            fVar.f129427G = i2;
                        } else {
                            fVar = null;
                        }
                        if (th2 == null) {
                            long j = currentTimeMillis - aVar.f129396d;
                            long j2 = aVar.f129396d;
                            C9894e.m19818a(j, j2, aVar.f129394b.f129407a, aVar.f129395c.mo107381a("X-TT-LOGID", ""), fVar);
                            StringBuilder sb = new StringBuilder("api_succeed, from: ");
                            sb.append(str2);
                            sb.append(", cost: ");
                            sb.append(currentTimeMillis - aVar.f129396d);
                            sb.append(", netInfo: ");
                            sb.append(fVar);
                            sb.append(", url: ");
                            sb.append(aVar.f129394b.f129407a);
                            C51820c.m111141b("HttpCall", sb.toString());
                        } else {
                            if (fVar == null && (aVar.f129393a instanceof C12759m)) {
                                Object requestInfo = ((C12759m) aVar.f129393a).getRequestInfo();
                                if (requestInfo instanceof C51878f) {
                                    C51878f fVar3 = (C51878f) requestInfo;
                                    fVar3.f26755e = aVar.f129396d;
                                    fVar3.f26756f = aVar.f129397e;
                                    fVar3.f26758h = currentTimeMillis;
                                    fVar3.f129427G = i2;
                                    fVar2 = fVar3;
                                    if (!(fVar2 == null || fVar2.f26775y == null)) {
                                        C51838d.m111181a(fVar2.f26775y, "ex", (Object) th.getMessage());
                                    }
                                    if (fVar2 != null && (th2 instanceof C9872a)) {
                                        fVar2.f26774x = ((C9872a) th2).getRequestLog();
                                    }
                                    C51878f fVar4 = fVar2;
                                    C9894e.m19819a(currentTimeMillis - aVar.f129396d, aVar.f129396d, aVar.f129394b.f129407a, aVar.f129395c.mo107381a("X-TT-LOGID", ""), fVar2, th);
                                    StringBuilder sb2 = new StringBuilder("api_error, from: ");
                                    sb2.append(str2);
                                    sb2.append(", cost: ");
                                    sb2.append(currentTimeMillis - aVar.f129396d);
                                    sb2.append(", netInfo: ");
                                    sb2.append(fVar4);
                                    sb2.append(", url: ");
                                    sb2.append(aVar.f129394b.f129407a);
                                    sb2.append(", error: ");
                                    sb2.append(th.getMessage());
                                    C51820c.m111145d("HttpCall", sb2.toString());
                                }
                            }
                            fVar2 = fVar;
                            C51838d.m111181a(fVar2.f26775y, "ex", (Object) th.getMessage());
                            fVar2.f26774x = ((C9872a) th2).getRequestLog();
                            C51878f fVar42 = fVar2;
                            C9894e.m19819a(currentTimeMillis - aVar.f129396d, aVar.f129396d, aVar.f129394b.f129407a, aVar.f129395c.mo107381a("X-TT-LOGID", ""), fVar2, th);
                            StringBuilder sb22 = new StringBuilder("api_error, from: ");
                            sb22.append(str2);
                            sb22.append(", cost: ");
                            sb22.append(currentTimeMillis - aVar.f129396d);
                            sb22.append(", netInfo: ");
                            sb22.append(fVar42);
                            sb22.append(", url: ");
                            sb22.append(aVar.f129394b.f129407a);
                            sb22.append(", error: ");
                            sb22.append(th.getMessage());
                            C51820c.m111145d("HttpCall", sb22.toString());
                        }
                    }
                    if (aVar.f129395c.f129423e != null) {
                        C51861k a = C51861k.m111227a();
                        String str3 = aVar.f129394b.f129407a;
                        if (str3 == null) {
                            cVar = null;
                        } else {
                            cVar = (C51798c) a.f129390a.get(str3);
                        }
                        long currentTimeMillis2 = System.currentTimeMillis();
                        C51878f fVar5 = new C51878f();
                        fVar5.f26755e = aVar.f129396d;
                        fVar5.f26756f = aVar.f129397e;
                        fVar5.f26758h = currentTimeMillis2;
                        fVar5.f129427G = i2;
                        if (cVar != null) {
                            fVar5.f26751a = cVar.f129252g;
                        }
                        if (th2 == null) {
                            C9894e.m19818a(currentTimeMillis2 - aVar.f129396d, aVar.f129396d, aVar.f129394b.f129407a, aVar.f129395c.mo107381a("X-TT-LOGID", ""), fVar5);
                        } else {
                            C9894e.m19819a(currentTimeMillis2 - aVar.f129396d, aVar.f129396d, aVar.f129394b.f129407a, aVar.f129395c.mo107381a("X-TT-LOGID", ""), fVar5, th);
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo107274a(String str, String str2, int i, long j) {
        final String str3 = str;
        final String str4 = str2;
        final int i2 = i;
        final long j2 = j;
        C517944 r0 = new Runnable() {
            public final void run() {
                if (C51895s.f129471f != null) {
                    try {
                        C51880o oVar = C51895s.f129471f;
                        String str = str3;
                        String str2 = str4;
                        int i = i2;
                        long j = j2;
                        C51797b bVar = new C51797b();
                        bVar.f129242a = str;
                        bVar.f129243b = str2;
                        bVar.f129244c = i;
                        bVar.f129245d = (int) j;
                        oVar.mo95381a(bVar);
                    } catch (Exception unused) {
                    }
                }
            }
        };
        C51838d.m111186b((Runnable) r0);
    }

    /* renamed from: b */
    public final C51877e mo107277b(String str, int i, int i2, String str2) throws IOException {
        String str3;
        String str4;
        String str5;
        boolean z;
        C51867a aVar;
        C12690b bVar;
        int i3;
        String str6;
        String str7;
        C51876a aVar2 = new C51876a();
        if (str2 != null) {
            String upperCase = str2.toUpperCase();
            if ("GET".equals(upperCase) || "HEAD".equals(upperCase)) {
                aVar2.f129414b = upperCase;
                List<C51873c> list = this.f129201e;
                if (list != null && !list.isEmpty()) {
                    for (C51873c cVar : list) {
                        if (!"Range".equalsIgnoreCase(cVar.f129405a) && !"Connection".equalsIgnoreCase(cVar.f129405a) && !"Proxy-Connection".equalsIgnoreCase(cVar.f129405a) && !"Host".equalsIgnoreCase(cVar.f129405a)) {
                            aVar2.mo107377a(cVar.f129405a, cVar.f129406b);
                        }
                    }
                }
                if (i >= 0 && i2 > 0) {
                    StringBuilder sb = new StringBuilder();
                    sb.append(i);
                    sb.append("-");
                    sb.append(i2);
                    str3 = sb.toString();
                } else if (i > 0) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(i);
                    sb2.append("-");
                    str3 = sb2.toString();
                } else if (i >= 0 || i2 <= 0) {
                    str3 = null;
                } else {
                    StringBuilder sb3 = new StringBuilder("-");
                    sb3.append(i2);
                    str3 = sb3.toString();
                }
                if (str3 == null) {
                    str4 = null;
                } else {
                    StringBuilder sb4 = new StringBuilder("bytes=");
                    sb4.append(str3);
                    str4 = sb4.toString();
                }
                if (str4 != null) {
                    aVar2.mo107377a("Range", str4);
                }
                aVar2.mo107377a("Vpwp-Raw-Key", this.f129203g);
                if (C51895s.f129490y) {
                    String str8 = "Vpwp-Type";
                    try {
                        if (this.f129205i == null) {
                            str6 = "preloader";
                        } else {
                            str6 = "proxy";
                        }
                        aVar2.mo107377a(str8, str6);
                        aVar2.mo107377a("Vpwp-Key", this.f129204h);
                        if (this.f129205i == null) {
                            str7 = "";
                        } else {
                            str7 = this.f129205i.f129548c.f129554f;
                            if (str7 == null) {
                                str7 = "";
                            }
                        }
                        if (!TextUtils.isEmpty(str7)) {
                            aVar2.mo107377a("Vpwp-Mp-Range", str7);
                        }
                        aVar2.mo107377a("Vpwp-Flag", String.valueOf(mo107283g()));
                    } catch (Throwable th) {
                        C51820c.m111145d("AbsTask", C51820c.m111138a(th));
                    }
                }
                String str9 = "X-ReqType";
                if (this.f129205i == null) {
                    str5 = "preload";
                } else {
                    str5 = "play";
                }
                aVar2.mo107377a(str9, str5);
                if (!C51895s.f129475j) {
                    aVar2.mo107377a("local_url_index", String.valueOf(this.f129207k));
                    String str10 = "local_url_count";
                    if (this.f129206j.f129260a != null) {
                        i3 = this.f129206j.f129260a.size();
                    } else {
                        i3 = -1;
                    }
                    aVar2.mo107377a(str10, String.valueOf(i3));
                }
                if (str == null) {
                    throw new IllegalArgumentException("url is null");
                } else if (str.startsWith("http://") || str.startsWith("https://")) {
                    aVar2.f129413a = str;
                    if (C51895s.f129485t) {
                        aVar2.mo107377a("Cache-Control", "no-cache");
                    }
                    if (this.f129205i == null) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        C51883r a = C51883r.m111260a();
                        aVar2.mo107376a(a.f129439h);
                        aVar2.mo107378b(a.f129440i);
                        aVar2.mo107379c(a.f129441j);
                    } else {
                        C51897t a2 = C51897t.m111286a();
                        aVar2.mo107376a(a2.f129501j);
                        aVar2.mo107378b(a2.f129502k);
                        aVar2.mo107379c(a2.f129503l);
                    }
                    if (aVar2.f129413a != null) {
                        if (aVar2.f129414b == null) {
                            aVar2.f129414b = "GET";
                        }
                        C51874d dVar = new C51874d(aVar2);
                        if (dVar.mo107374a("Accept-Encoding") == null) {
                            dVar.f129409c.add(new C51873c("Accept-Encoding", "identity"));
                        }
                        if (C51895s.f129475j) {
                            LinkedHashMap linkedHashMap = new LinkedHashMap();
                            Pair a3 = C9917l.m19876a(dVar.f129407a, (Map<String, String>) linkedHashMap);
                            String str11 = (String) a3.first;
                            String str12 = (String) a3.second;
                            INetApi iNetApi = (INetApi) C13333g.m26861a(str11, INetApi.class);
                            if (iNetApi != null) {
                                C13302e eVar = new C13302e();
                                eVar.f26780c = dVar.f129410d;
                                eVar.f26781d = dVar.f129411e;
                                eVar.f26782e = dVar.f129412f;
                                List a4 = C51868b.m111235a(dVar.f129409c);
                                if ("GET".equals(dVar.f129408b)) {
                                    bVar = iNetApi.get(str12, linkedHashMap, a4, eVar);
                                } else {
                                    bVar = iNetApi.head(str12, linkedHashMap, a4, eVar);
                                }
                                C51820c.m111141b("HttpExcutor", "use ttnet retrofit");
                                if (!C51878f.f129424H.getAndSet(true)) {
                                    C9831a.m19675a(new C9833a() {
                                    });
                                }
                                aVar = new C51867a(bVar, dVar);
                                this.f129202f = aVar;
                                return aVar.mo107370a();
                            }
                        }
                        C53499a aVar3 = new C53499a();
                        aVar3.mo111262a(dVar.f129407a);
                        aVar3.mo111264a(dVar.f129408b, (C53500ac) null);
                        aVar3.mo111267a(C51868b.m111237b(dVar.f129409c));
                        C53682y a5 = C51868b.m111236a();
                        if (!(dVar.f129410d == ((long) a5.f133215z) && dVar.f129411e == ((long) a5.f133189A) && dVar.f129412f == ((long) a5.f133190B))) {
                            a5 = a5.mo111653b().mo111654a(dVar.f129410d, TimeUnit.MILLISECONDS).mo111668b(dVar.f129411e, TimeUnit.MILLISECONDS).mo111672c(dVar.f129412f, TimeUnit.MILLISECONDS).mo111667a();
                        }
                        C51820c.m111141b("HttpExcutor", "use ttnet okhttp");
                        aVar = new C51867a(a5.mo111325a(aVar3.mo111272c()), dVar);
                        this.f129202f = aVar;
                        return aVar.mo107370a();
                    }
                    throw new IllegalStateException("url is null");
                } else {
                    StringBuilder sb5 = new StringBuilder("url should start with http:// or https://, url: ");
                    sb5.append(str);
                    throw new IllegalArgumentException(sb5.toString());
                }
            } else {
                throw new IllegalArgumentException("for now only GET and HEAD is support");
            }
        } else {
            throw new IllegalArgumentException("method is null");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo107276a(boolean z, String str, int i, int i2, String str2, String str3) {
        final C51880o oVar = C51895s.f129471f;
        if (oVar != null) {
            final boolean z2 = z;
            final String str4 = str;
            final int i3 = i;
            final int i4 = i2;
            final String str5 = str2;
            final String str6 = str3;
            C517922 r0 = new Runnable() {
                public final void run() {
                    oVar.mo95386a(z2, str4, i3, i4, str5, str6);
                }
            };
            C51838d.m111186b((Runnable) r0);
        }
    }
}
