package okhttp3.internal.p2684b;

import java.io.IOException;
import java.lang.ref.Reference;
import java.net.ConnectException;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.C53495a;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53509af;
import okhttp3.C53524e;
import okhttp3.C53532i;
import okhttp3.C53653j;
import okhttp3.C53664p;
import okhttp3.C53670r;
import okhttp3.C53673t;
import okhttp3.C53685z;
import okhttp3.internal.C53533a;
import okhttp3.internal.C53559c;
import okhttp3.internal.C53576d;
import okhttp3.internal.p2685c.C53568e;
import okhttp3.internal.p2686d.C53577a;
import okhttp3.internal.p2687e.C53586b;
import okhttp3.internal.p2687e.C53594g;
import okhttp3.internal.p2687e.C53594g.C53602b;
import okhttp3.internal.p2687e.C53612i;
import okhttp3.internal.p2689g.C53634f;
import okhttp3.internal.p2690h.C53638d;
import okhttp3.internal.p2691i.C53640a.C53647e;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.Okio;
import okio.Source;

/* renamed from: okhttp3.internal.b.c */
public final class C53551c extends C53602b implements C53532i {

    /* renamed from: a */
    Socket f132687a;

    /* renamed from: b */
    C53594g f132688b;

    /* renamed from: c */
    BufferedSource f132689c;

    /* renamed from: d */
    BufferedSink f132690d;

    /* renamed from: e */
    public boolean f132691e;

    /* renamed from: f */
    public int f132692f;

    /* renamed from: g */
    public int f132693g = 1;

    /* renamed from: h */
    public final List<Reference<C53557g>> f132694h = new ArrayList();

    /* renamed from: i */
    public long f132695i = Long.MAX_VALUE;

    /* renamed from: k */
    private final C53653j f132696k;

    /* renamed from: l */
    private final C53509af f132697l;

    /* renamed from: m */
    private Socket f132698m;

    /* renamed from: n */
    private C53670r f132699n;

    /* renamed from: o */
    private C53685z f132700o;

    /* renamed from: a */
    public final C53509af mo111336a() {
        return this.f132697l;
    }

    /* renamed from: b */
    public final Socket mo111337b() {
        return this.f132687a;
    }

    /* renamed from: d */
    public final C53670r mo111382d() {
        return this.f132699n;
    }

    /* renamed from: a */
    public final boolean mo111378a(C53495a aVar, C53509af afVar) {
        if (this.f132694h.size() >= this.f132693g || this.f132691e || !C53533a.f132616a.mo111347a(this.f132697l.f132430a, aVar)) {
            return false;
        }
        if (aVar.f132359a.f133143d.equals(mo111336a().f132430a.f132359a.f133143d)) {
            return true;
        }
        if (this.f132688b == null || afVar == null || afVar.f132431b.type() != Type.DIRECT || this.f132697l.f132431b.type() != Type.DIRECT || !this.f132697l.f132432c.equals(afVar.f132432c) || afVar.f132430a.f132368j != C53638d.f133008a || !mo111379a(aVar.f132359a)) {
            return false;
        }
        try {
            aVar.f132369k.mo111326a(aVar.f132359a.f133143d, mo111382d().f133135c);
            return true;
        } catch (SSLPeerUnverifiedException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final boolean mo111380a(boolean z) {
        int soTimeout;
        if (this.f132687a.isClosed() || this.f132687a.isInputShutdown() || this.f132687a.isOutputShutdown()) {
            return false;
        }
        if (this.f132688b == null) {
            if (z) {
                try {
                    soTimeout = this.f132687a.getSoTimeout();
                    this.f132687a.setSoTimeout(1);
                    if (this.f132689c.exhausted()) {
                        this.f132687a.setSoTimeout(soTimeout);
                        return false;
                    }
                    this.f132687a.setSoTimeout(soTimeout);
                    return true;
                } catch (SocketTimeoutException unused) {
                } catch (IOException unused2) {
                    return false;
                } catch (Throwable th) {
                    this.f132687a.setSoTimeout(soTimeout);
                    throw th;
                }
            }
            return true;
        } else if (!this.f132688b.mo111449d()) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: c */
    public final void mo111381c() {
        C53559c.m113806a(this.f132698m);
    }

    /* renamed from: e */
    public final boolean mo111383e() {
        if (this.f132688b != null) {
            return true;
        }
        return false;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Connection{");
        sb.append(this.f132697l.f132430a.f132359a.f133143d);
        sb.append(":");
        sb.append(this.f132697l.f132430a.f132359a.f133144e);
        sb.append(", proxy=");
        sb.append(this.f132697l.f132431b);
        sb.append(" hostAddress=");
        sb.append(this.f132697l.f132432c);
        sb.append(" cipherSuite=");
        if (this.f132699n != null) {
            obj = this.f132699n.f133134b;
        } else {
            obj = "none";
        }
        sb.append(obj);
        sb.append(" protocol=");
        sb.append(this.f132700o);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final void mo111377a(C53612i iVar) throws IOException {
        iVar.mo111461a(C53586b.REFUSED_STREAM);
    }

    /* renamed from: a */
    public final C53647e mo111374a(C53557g gVar) {
        C535521 r0 = new C53647e(true, this.f132689c, this.f132690d, gVar) {

            /* renamed from: a */
            final /* synthetic */ C53557g f132701a;

            public final void close() throws IOException {
                this.f132701a.mo111399a(true, this.f132701a.mo111395a(), -1, null);
            }

            {
                this.f132701a = r5;
            }
        };
        return r0;
    }

    /* renamed from: a */
    private static boolean m113753a(SSLSession sSLSession) {
        if ("NONE".equals(sSLSession.getProtocol()) || "SSL_NULL_WITH_NULL_NULL".equals(sSLSession.getCipherSuite())) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo111376a(C53594g gVar) {
        synchronized (this.f132696k) {
            this.f132693g = gVar.mo111437a();
        }
    }

    /* renamed from: a */
    public final boolean mo111379a(C53673t tVar) {
        if (tVar.f133144e != this.f132697l.f132430a.f132359a.f133144e) {
            return false;
        }
        if (tVar.f133143d.equals(this.f132697l.f132430a.f132359a.f133143d)) {
            return true;
        }
        if (this.f132699n == null || !C53638d.f133008a.mo111529a(tVar.f133143d, (X509Certificate) this.f132699n.f133135c.get(0))) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r1v1, types: [java.net.Socket, javax.net.ssl.SSLSocket] */
    /* JADX WARNING: type inference failed for: r2v1 */
    /* JADX WARNING: type inference failed for: r1v2 */
    /* JADX WARNING: type inference failed for: r2v2 */
    /* JADX WARNING: type inference failed for: r2v7 */
    /* JADX WARNING: type inference failed for: r1v5 */
    /* JADX WARNING: Multi-variable type inference failed */
    /* JADX WARNING: Removed duplicated region for block: B:35:0x00f2 A[Catch:{ all -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:37:0x00f8 A[Catch:{ all -> 0x00e8 }] */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00fb  */
    /* JADX WARNING: Unknown variable types count: 2 */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m113752a(okhttp3.internal.p2684b.C53550b r8) throws java.io.IOException {
        /*
            r7 = this;
            okhttp3.af r0 = r7.f132697l
            okhttp3.a r0 = r0.f132430a
            javax.net.ssl.SSLSocketFactory r1 = r0.f132367i
            r2 = 0
            java.net.Socket r3 = r7.f132698m     // Catch:{ AssertionError -> 0x00eb }
            okhttp3.t r4 = r0.f132359a     // Catch:{ AssertionError -> 0x00eb }
            java.lang.String r4 = r4.f133143d     // Catch:{ AssertionError -> 0x00eb }
            okhttp3.t r5 = r0.f132359a     // Catch:{ AssertionError -> 0x00eb }
            int r5 = r5.f133144e     // Catch:{ AssertionError -> 0x00eb }
            r6 = 1
            java.net.Socket r1 = r1.createSocket(r3, r4, r5, r6)     // Catch:{ AssertionError -> 0x00eb }
            javax.net.ssl.SSLSocket r1 = (javax.net.ssl.SSLSocket) r1     // Catch:{ AssertionError -> 0x00eb }
            okhttp3.k r8 = r8.mo111373a(r1)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            boolean r3 = r8.f133088e     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            if (r3 == 0) goto L_0x002d
            okhttp3.internal.g.f r3 = okhttp3.internal.p2689g.C53634f.m114048c()     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okhttp3.t r4 = r0.f132359a     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r4 = r4.f133143d     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.util.List<okhttp3.z> r5 = r0.f132363e     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r3.mo111507a(r1, r4, r5)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
        L_0x002d:
            r1.startHandshake()     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            javax.net.ssl.SSLSession r3 = r1.getSession()     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            boolean r4 = m113753a(r3)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            if (r4 == 0) goto L_0x00db
            okhttp3.r r4 = okhttp3.C53670r.m114147a(r3)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            javax.net.ssl.HostnameVerifier r5 = r0.f132368j     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okhttp3.t r6 = r0.f132359a     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r6 = r6.f133143d     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            boolean r3 = r5.verify(r6, r3)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            if (r3 == 0) goto L_0x0092
            okhttp3.g r3 = r0.f132369k     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okhttp3.t r0 = r0.f132359a     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = r0.f133143d     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.util.List<java.security.cert.Certificate> r5 = r4.f133135c     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r3.mo111326a(r0, r5)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            boolean r8 = r8.f133088e     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            if (r8 == 0) goto L_0x0061
            okhttp3.internal.g.f r8 = okhttp3.internal.p2689g.C53634f.m114048c()     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r2 = r8.mo111501a(r1)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
        L_0x0061:
            r7.f132687a = r1     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.net.Socket r8 = r7.f132687a     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okio.Source r8 = okio.Okio.source(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okio.BufferedSource r8 = okio.Okio.buffer(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r7.f132689c = r8     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.net.Socket r8 = r7.f132687a     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okio.Sink r8 = okio.Okio.sink(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okio.BufferedSink r8 = okio.Okio.buffer(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r7.f132690d = r8     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r7.f132699n = r4     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            if (r2 == 0) goto L_0x0084
            okhttp3.z r8 = okhttp3.C53685z.get(r2)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            goto L_0x0086
        L_0x0084:
            okhttp3.z r8 = okhttp3.C53685z.HTTP_1_1     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
        L_0x0086:
            r7.f132700o = r8     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            if (r1 == 0) goto L_0x0091
            okhttp3.internal.g.f r8 = okhttp3.internal.p2689g.C53634f.m114048c()
            r8.mo111519b(r1)
        L_0x0091:
            return
        L_0x0092:
            java.util.List<java.security.cert.Certificate> r8 = r4.f133135c     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r2 = 0
            java.lang.Object r8 = r8.get(r2)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.security.cert.X509Certificate r8 = (java.security.cert.X509Certificate) r8     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            javax.net.ssl.SSLPeerUnverifiedException r2 = new javax.net.ssl.SSLPeerUnverifiedException     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r4 = "Hostname "
            r3.<init>(r4)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            okhttp3.t r0 = r0.f132359a     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = r0.f133143d     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = " not verified:\n    certificate: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = okhttp3.C53527g.m113684a(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = "\n    DN: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.security.Principal r0 = r8.getSubjectDN()     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = r0.getName()     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r3.append(r0)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = "\n    subjectAltNames: "
            r3.append(r0)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.util.List r8 = okhttp3.internal.p2690h.C53638d.m114066a(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r3.append(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r8 = r3.toString()     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            r2.<init>(r8)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            throw r2     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
        L_0x00db:
            java.io.IOException r8 = new java.io.IOException     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            java.lang.String r0 = "a valid ssl session was not established"
            r8.<init>(r0)     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
            throw r8     // Catch:{ AssertionError -> 0x00e5, all -> 0x00e3 }
        L_0x00e3:
            r8 = move-exception
            goto L_0x00f9
        L_0x00e5:
            r8 = move-exception
            r2 = r1
            goto L_0x00ec
        L_0x00e8:
            r8 = move-exception
            r1 = r2
            goto L_0x00f9
        L_0x00eb:
            r8 = move-exception
        L_0x00ec:
            boolean r0 = okhttp3.internal.C53559c.m113807a(r8)     // Catch:{ all -> 0x00e8 }
            if (r0 == 0) goto L_0x00f8
            java.io.IOException r0 = new java.io.IOException     // Catch:{ all -> 0x00e8 }
            r0.<init>(r8)     // Catch:{ all -> 0x00e8 }
            throw r0     // Catch:{ all -> 0x00e8 }
        L_0x00f8:
            throw r8     // Catch:{ all -> 0x00e8 }
        L_0x00f9:
            if (r1 == 0) goto L_0x0102
            okhttp3.internal.g.f r0 = okhttp3.internal.p2689g.C53634f.m114048c()
            r0.mo111519b(r1)
        L_0x0102:
            okhttp3.internal.C53559c.m113806a(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2684b.C53551c.m113752a(okhttp3.internal.b.b):void");
    }

    public C53551c(C53653j jVar, C53509af afVar) {
        this.f132696k = jVar;
        this.f132697l = afVar;
    }

    /* renamed from: a */
    private void m113751a(int i, int i2, C53524e eVar, C53664p pVar) throws IOException {
        Socket socket;
        try {
            Proxy proxy = this.f132697l.f132431b;
            C53495a aVar = this.f132697l.f132430a;
            if (proxy.type() != Type.DIRECT) {
                if (proxy.type() != Type.HTTP) {
                    socket = new Socket(proxy);
                    this.f132698m = socket;
                    pVar.connectStart(eVar, this.f132697l.f132432c, proxy);
                    this.f132698m.setSoTimeout(i2);
                    C53634f.m114048c().mo111506a(this.f132698m, this.f132697l.f132432c, i);
                    this.f132689c = Okio.buffer(Okio.source(this.f132698m));
                    this.f132690d = Okio.buffer(Okio.sink(this.f132698m));
                }
            }
            socket = aVar.f132361c.createSocket();
            this.f132698m = socket;
            pVar.connectStart(eVar, this.f132697l.f132432c, proxy);
            this.f132698m.setSoTimeout(i2);
            C53634f.m114048c().mo111506a(this.f132698m, this.f132697l.f132432c, i);
            this.f132689c = Okio.buffer(Okio.source(this.f132698m));
            this.f132690d = Okio.buffer(Okio.sink(this.f132698m));
        } catch (ConnectException e) {
            StringBuilder sb = new StringBuilder("Failed to connect to ");
            sb.append(this.f132697l.f132432c);
            ConnectException connectException = new ConnectException(sb.toString());
            connectException.initCause(e);
            throw connectException;
        } catch (NullPointerException e2) {
            if ("throw with null exception".equals(e2.getMessage())) {
                throw new IOException(e2);
            }
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }

    /* renamed from: a */
    private void m113750a(int i, int i2, int i3, C53524e eVar, C53664p pVar) throws IOException {
        int i4 = i2;
        C53524e eVar2 = eVar;
        C53664p pVar2 = pVar;
        boolean z = true;
        C53498ab c = new C53499a().mo111268a(this.f132697l.f132430a.f132359a).mo111263a("Host", C53559c.m113799a(this.f132697l.f132430a.f132359a, true)).mo111263a("Proxy-Connection", "Keep-Alive").mo111263a("User-Agent", C53576d.m113856a()).mo111272c();
        C53673t tVar = c.f132378a;
        C53498ab abVar = c;
        int i5 = 0;
        while (i5 < 21) {
            m113751a(i, i4, eVar2, pVar2);
            StringBuilder sb = new StringBuilder("CONNECT ");
            sb.append(C53559c.m113799a(tVar, z));
            sb.append(" HTTP/1.1");
            String sb2 = sb.toString();
            while (true) {
                C53577a aVar = new C53577a(null, null, this.f132689c, this.f132690d);
                this.f132689c.timeout().timeout((long) i4, TimeUnit.MILLISECONDS);
                this.f132690d.timeout().timeout((long) i3, TimeUnit.MILLISECONDS);
                aVar.mo111427a(abVar.f132380c, sb2);
                aVar.mo111413b();
                C53504ad a = aVar.mo111408a(false).mo111285a(abVar).mo111291a();
                long a2 = C53568e.m113831a(a);
                if (a2 == -1) {
                    a2 = 0;
                }
                Source a3 = aVar.mo111426a(a2);
                C53559c.m113814b(a3, Integer.MAX_VALUE, TimeUnit.MILLISECONDS);
                a3.close();
                int i6 = a.f132400c;
                if (i6 != 200) {
                    if (i6 == 407) {
                        abVar = this.f132697l.f132430a.f132362d.mo108806a(this.f132697l, a);
                        if (abVar == null) {
                            throw new IOException("Failed to authenticate with proxy");
                        } else if ("close".equalsIgnoreCase(a.mo111276b("Connection"))) {
                            break;
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder("Unexpected response code for CONNECT: ");
                        sb3.append(a.f132400c);
                        throw new IOException(sb3.toString());
                    }
                } else if (!this.f132689c.buffer().exhausted() || !this.f132690d.buffer().exhausted()) {
                    throw new IOException("TLS tunnel buffered too many bytes!");
                } else {
                    abVar = null;
                }
            }
            if (abVar != null) {
                C53559c.m113806a(this.f132698m);
                this.f132698m = null;
                this.f132690d = null;
                this.f132689c = null;
                pVar2.connectEnd(eVar2, this.f132697l.f132432c, this.f132697l.f132431b, null);
                i5++;
                z = true;
            } else {
                return;
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01b1, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01b1, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01b1, code lost:
        continue;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01b1, code lost:
        continue;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x0120  */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x0136  */
    /* JADX WARNING: Removed duplicated region for block: B:54:0x0146 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x0180  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0187  */
    /* JADX WARNING: Removed duplicated region for block: B:65:0x018c  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01b5 A[EDGE_INSN: B:86:0x01b5->B:82:0x01b5 ?: BREAK  , SYNTHETIC] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo111375a(int r18, int r19, int r20, int r21, boolean r22, okhttp3.C53524e r23, okhttp3.C53664p r24) {
        /*
            r17 = this;
            r7 = r17
            r8 = r23
            r9 = r24
            okhttp3.z r0 = r7.f132700o
            if (r0 != 0) goto L_0x01b6
            okhttp3.af r0 = r7.f132697l
            okhttp3.a r0 = r0.f132430a
            java.util.List<okhttp3.k> r0 = r0.f132364f
            okhttp3.internal.b.b r10 = new okhttp3.internal.b.b
            r10.<init>(r0)
            okhttp3.af r1 = r7.f132697l
            okhttp3.a r1 = r1.f132430a
            javax.net.ssl.SSLSocketFactory r1 = r1.f132367i
            if (r1 != 0) goto L_0x0063
            okhttp3.k r1 = okhttp3.C53655k.f133085c
            boolean r0 = r0.contains(r1)
            if (r0 == 0) goto L_0x0056
            okhttp3.af r0 = r7.f132697l
            okhttp3.a r0 = r0.f132430a
            okhttp3.t r0 = r0.f132359a
            java.lang.String r0 = r0.f133143d
            okhttp3.internal.g.f r1 = okhttp3.internal.p2689g.C53634f.m114048c()
            boolean r1 = r1.mo111509b(r0)
            if (r1 == 0) goto L_0x0038
            goto L_0x0063
        L_0x0038:
            okhttp3.internal.b.e r1 = new okhttp3.internal.b.e
            java.net.UnknownServiceException r2 = new java.net.UnknownServiceException
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "CLEARTEXT communication to "
            r3.<init>(r4)
            r3.append(r0)
            java.lang.String r0 = " not permitted by network security policy"
            r3.append(r0)
            java.lang.String r0 = r3.toString()
            r2.<init>(r0)
            r1.<init>(r2)
            throw r1
        L_0x0056:
            okhttp3.internal.b.e r0 = new okhttp3.internal.b.e
            java.net.UnknownServiceException r1 = new java.net.UnknownServiceException
            java.lang.String r2 = "CLEARTEXT communication not enabled for client"
            r1.<init>(r2)
            r0.<init>(r1)
            throw r0
        L_0x0063:
            r11 = 0
            r12 = r11
        L_0x0065:
            r13 = 0
            r14 = 1
            okhttp3.af r0 = r7.f132697l     // Catch:{ IOException -> 0x014b }
            boolean r0 = r0.mo111300a()     // Catch:{ IOException -> 0x014b }
            if (r0 == 0) goto L_0x0089
            r1 = r17
            r2 = r18
            r3 = r19
            r4 = r20
            r5 = r23
            r6 = r24
            r1.m113750a(r2, r3, r4, r5, r6)     // Catch:{ IOException -> 0x014b }
            java.net.Socket r0 = r7.f132698m     // Catch:{ IOException -> 0x014b }
            if (r0 != 0) goto L_0x0084
            goto L_0x0118
        L_0x0084:
            r15 = r18
            r6 = r19
            goto L_0x0090
        L_0x0089:
            r15 = r18
            r6 = r19
            r7.m113751a(r15, r6, r8, r9)     // Catch:{ IOException -> 0x0149 }
        L_0x0090:
            okhttp3.af r0 = r7.f132697l     // Catch:{ IOException -> 0x0149 }
            okhttp3.a r0 = r0.f132430a     // Catch:{ IOException -> 0x0149 }
            javax.net.ssl.SSLSocketFactory r0 = r0.f132367i     // Catch:{ IOException -> 0x0149 }
            if (r0 != 0) goto L_0x00a3
            okhttp3.z r0 = okhttp3.C53685z.HTTP_1_1     // Catch:{ IOException -> 0x0149 }
            r7.f132700o = r0     // Catch:{ IOException -> 0x0149 }
            java.net.Socket r0 = r7.f132698m     // Catch:{ IOException -> 0x0149 }
            r7.f132687a = r0     // Catch:{ IOException -> 0x0149 }
        L_0x00a0:
            r5 = r21
            goto L_0x010b
        L_0x00a3:
            r9.secureConnectStart(r8)     // Catch:{ IOException -> 0x0149 }
            r7.m113752a(r10)     // Catch:{ IOException -> 0x0149 }
            okhttp3.r r0 = r7.f132699n     // Catch:{ IOException -> 0x0149 }
            r9.secureConnectEnd(r8, r0)     // Catch:{ IOException -> 0x0149 }
            okhttp3.z r0 = r7.f132700o     // Catch:{ IOException -> 0x0149 }
            okhttp3.z r1 = okhttp3.C53685z.HTTP_2     // Catch:{ IOException -> 0x0149 }
            if (r0 != r1) goto L_0x00a0
            java.net.Socket r0 = r7.f132687a     // Catch:{ IOException -> 0x0149 }
            r0.setSoTimeout(r13)     // Catch:{ IOException -> 0x0149 }
            okhttp3.internal.e.g$a r0 = new okhttp3.internal.e.g$a     // Catch:{ IOException -> 0x0149 }
            r0.<init>(r14)     // Catch:{ IOException -> 0x0149 }
            java.net.Socket r1 = r7.f132687a     // Catch:{ IOException -> 0x0149 }
            okhttp3.af r2 = r7.f132697l     // Catch:{ IOException -> 0x0149 }
            okhttp3.a r2 = r2.f132430a     // Catch:{ IOException -> 0x0149 }
            okhttp3.t r2 = r2.f132359a     // Catch:{ IOException -> 0x0149 }
            java.lang.String r2 = r2.f133143d     // Catch:{ IOException -> 0x0149 }
            okio.BufferedSource r3 = r7.f132689c     // Catch:{ IOException -> 0x0149 }
            okio.BufferedSink r4 = r7.f132690d     // Catch:{ IOException -> 0x0149 }
            r0.f132903a = r1     // Catch:{ IOException -> 0x0149 }
            r0.f132904b = r2     // Catch:{ IOException -> 0x0149 }
            r0.f132905c = r3     // Catch:{ IOException -> 0x0149 }
            r0.f132906d = r4     // Catch:{ IOException -> 0x0149 }
            r0.f132907e = r7     // Catch:{ IOException -> 0x0149 }
            r5 = r21
            r0.f132910h = r5     // Catch:{ IOException -> 0x0147 }
            okhttp3.internal.e.g r1 = new okhttp3.internal.e.g     // Catch:{ IOException -> 0x0147 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0147 }
            r7.f132688b = r1     // Catch:{ IOException -> 0x0147 }
            okhttp3.internal.e.g r0 = r7.f132688b     // Catch:{ IOException -> 0x0147 }
            okhttp3.internal.e.j r1 = r0.f132879s     // Catch:{ IOException -> 0x0147 }
            r1.mo111474a()     // Catch:{ IOException -> 0x0147 }
            okhttp3.internal.e.j r1 = r0.f132879s     // Catch:{ IOException -> 0x0147 }
            okhttp3.internal.e.m r2 = r0.f132875o     // Catch:{ IOException -> 0x0147 }
            r1.mo111483b(r2)     // Catch:{ IOException -> 0x0147 }
            okhttp3.internal.e.m r1 = r0.f132875o     // Catch:{ IOException -> 0x0147 }
            int r1 = r1.mo111490b()     // Catch:{ IOException -> 0x0147 }
            r2 = 65535(0xffff, float:9.1834E-41)
            if (r1 == r2) goto L_0x0101
            okhttp3.internal.e.j r3 = r0.f132879s     // Catch:{ IOException -> 0x0147 }
            int r1 = r1 - r2
            long r1 = (long) r1     // Catch:{ IOException -> 0x0147 }
            r3.mo111475a(r13, r1)     // Catch:{ IOException -> 0x0147 }
        L_0x0101:
            java.lang.Thread r1 = new java.lang.Thread     // Catch:{ IOException -> 0x0147 }
            okhttp3.internal.e.g$d r0 = r0.f132880t     // Catch:{ IOException -> 0x0147 }
            r1.<init>(r0)     // Catch:{ IOException -> 0x0147 }
            r1.start()     // Catch:{ IOException -> 0x0147 }
        L_0x010b:
            okhttp3.af r0 = r7.f132697l     // Catch:{ IOException -> 0x0147 }
            java.net.InetSocketAddress r0 = r0.f132432c     // Catch:{ IOException -> 0x0147 }
            okhttp3.af r1 = r7.f132697l     // Catch:{ IOException -> 0x0147 }
            java.net.Proxy r1 = r1.f132431b     // Catch:{ IOException -> 0x0147 }
            okhttp3.z r2 = r7.f132700o     // Catch:{ IOException -> 0x0147 }
            r9.connectEnd(r8, r0, r1, r2)     // Catch:{ IOException -> 0x0147 }
        L_0x0118:
            okhttp3.af r0 = r7.f132697l
            boolean r0 = r0.mo111300a()
            if (r0 == 0) goto L_0x0132
            java.net.Socket r0 = r7.f132698m
            if (r0 == 0) goto L_0x0125
            goto L_0x0132
        L_0x0125:
            java.net.ProtocolException r0 = new java.net.ProtocolException
            java.lang.String r1 = "Too many tunnel connections attempted: 21"
            r0.<init>(r1)
            okhttp3.internal.b.e r1 = new okhttp3.internal.b.e
            r1.<init>(r0)
            throw r1
        L_0x0132:
            okhttp3.internal.e.g r0 = r7.f132688b
            if (r0 == 0) goto L_0x0146
            okhttp3.j r1 = r7.f132696k
            monitor-enter(r1)
            okhttp3.internal.e.g r0 = r7.f132688b     // Catch:{ all -> 0x0143 }
            int r0 = r0.mo111437a()     // Catch:{ all -> 0x0143 }
            r7.f132693g = r0     // Catch:{ all -> 0x0143 }
            monitor-exit(r1)     // Catch:{ all -> 0x0143 }
            return
        L_0x0143:
            r0 = move-exception
            monitor-exit(r1)     // Catch:{ all -> 0x0143 }
            throw r0
        L_0x0146:
            return
        L_0x0147:
            r0 = move-exception
            goto L_0x0152
        L_0x0149:
            r0 = move-exception
            goto L_0x0150
        L_0x014b:
            r0 = move-exception
            r15 = r18
            r6 = r19
        L_0x0150:
            r5 = r21
        L_0x0152:
            java.net.Socket r1 = r7.f132687a
            okhttp3.internal.C53559c.m113806a(r1)
            java.net.Socket r1 = r7.f132698m
            okhttp3.internal.C53559c.m113806a(r1)
            r7.f132687a = r11
            r7.f132698m = r11
            r7.f132689c = r11
            r7.f132690d = r11
            r7.f132699n = r11
            r7.f132700o = r11
            r7.f132688b = r11
            okhttp3.af r1 = r7.f132697l
            java.net.InetSocketAddress r3 = r1.f132432c
            okhttp3.af r1 = r7.f132697l
            java.net.Proxy r4 = r1.f132431b
            r16 = 0
            r1 = r24
            r2 = r23
            r5 = r16
            r6 = r0
            r1.connectFailed(r2, r3, r4, r5, r6)
            if (r12 != 0) goto L_0x0187
            okhttp3.internal.b.e r1 = new okhttp3.internal.b.e
            r1.<init>(r0)
            r12 = r1
            goto L_0x018a
        L_0x0187:
            r12.addConnectException(r0)
        L_0x018a:
            if (r22 == 0) goto L_0x01b5
            r10.f132684b = r14
            boolean r2 = r10.f132683a
            if (r2 == 0) goto L_0x01b1
            boolean r2 = r0 instanceof java.net.ProtocolException
            if (r2 != 0) goto L_0x01b1
            boolean r2 = r0 instanceof java.io.InterruptedIOException
            if (r2 != 0) goto L_0x01b1
            boolean r2 = r0 instanceof javax.net.ssl.SSLHandshakeException
            if (r2 == 0) goto L_0x01a6
            java.lang.Throwable r3 = r0.getCause()
            boolean r3 = r3 instanceof java.security.cert.CertificateException
            if (r3 != 0) goto L_0x01b1
        L_0x01a6:
            boolean r3 = r0 instanceof javax.net.ssl.SSLPeerUnverifiedException
            if (r3 != 0) goto L_0x01b1
            if (r2 != 0) goto L_0x01b0
            boolean r0 = r0 instanceof javax.net.ssl.SSLProtocolException
            if (r0 == 0) goto L_0x01b1
        L_0x01b0:
            r13 = 1
        L_0x01b1:
            if (r13 == 0) goto L_0x01b5
            goto L_0x0065
        L_0x01b5:
            throw r12
        L_0x01b6:
            java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
            java.lang.String r1 = "already connected"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2684b.C53551c.mo111375a(int, int, int, int, boolean, okhttp3.e, okhttp3.p):void");
    }
}
