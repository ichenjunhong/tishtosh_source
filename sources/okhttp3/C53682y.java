package okhttp3;

import java.net.Proxy;
import java.net.ProxySelector;
import java.net.Socket;
import java.security.GeneralSecurityException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import java.util.concurrent.TimeUnit;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.TrustManager;
import javax.net.ssl.TrustManagerFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C53504ad.C53505a;
import okhttp3.C53524e.C53525a;
import okhttp3.C53655k.C53656a;
import okhttp3.C53664p.C53667a;
import okhttp3.C53671s.C53672a;
import okhttp3.internal.C53533a;
import okhttp3.internal.C53559c;
import okhttp3.internal.p2683a.C53547f;
import okhttp3.internal.p2684b.C53551c;
import okhttp3.internal.p2684b.C53553d;
import okhttp3.internal.p2684b.C53557g;
import okhttp3.internal.p2689g.C53634f;
import okhttp3.internal.p2690h.C53637c;
import okhttp3.internal.p2690h.C53638d;
import okhttp3.internal.p2691i.C53640a;

/* renamed from: okhttp3.y */
public class C53682y implements Cloneable, C53525a {

    /* renamed from: a */
    static final List<C53685z> f133187a = C53559c.m113802a((T[]) new C53685z[]{C53685z.HTTP_2, C53685z.HTTP_1_1});

    /* renamed from: b */
    static final List<C53655k> f133188b = C53559c.m113802a((T[]) new C53655k[]{C53655k.f133083a, C53655k.f133085c});

    /* renamed from: A */
    public final int f133189A;

    /* renamed from: B */
    public final int f133190B;

    /* renamed from: C */
    public final int f133191C;

    /* renamed from: c */
    public final C53661n f133192c;

    /* renamed from: d */
    public final Proxy f133193d;

    /* renamed from: e */
    public final List<C53685z> f133194e;

    /* renamed from: f */
    public final List<C53655k> f133195f;

    /* renamed from: g */
    public final List<C53676u> f133196g;

    /* renamed from: h */
    public final List<C53676u> f133197h;

    /* renamed from: i */
    public final C53667a f133198i;

    /* renamed from: j */
    public final ProxySelector f133199j;

    /* renamed from: k */
    public final C53659m f133200k;

    /* renamed from: l */
    public final C53515c f133201l;

    /* renamed from: m */
    final C53547f f133202m;

    /* renamed from: n */
    public final SocketFactory f133203n;

    /* renamed from: o */
    public final SSLSocketFactory f133204o;

    /* renamed from: p */
    final C53637c f133205p;

    /* renamed from: q */
    public final HostnameVerifier f133206q;

    /* renamed from: r */
    public final C53527g f133207r;

    /* renamed from: s */
    public final C53513b f133208s;

    /* renamed from: t */
    public final C53513b f133209t;

    /* renamed from: u */
    public final C53653j f133210u;

    /* renamed from: v */
    public final C53662o f133211v;

    /* renamed from: w */
    public final boolean f133212w;

    /* renamed from: x */
    public final boolean f133213x;

    /* renamed from: y */
    public final boolean f133214y;

    /* renamed from: z */
    public final int f133215z;

    /* renamed from: okhttp3.y$a */
    public static final class C53684a {

        /* renamed from: A */
        int f133216A;

        /* renamed from: a */
        C53661n f133217a;

        /* renamed from: b */
        Proxy f133218b;

        /* renamed from: c */
        List<C53685z> f133219c;

        /* renamed from: d */
        List<C53655k> f133220d;

        /* renamed from: e */
        public final List<C53676u> f133221e;

        /* renamed from: f */
        public final List<C53676u> f133222f;

        /* renamed from: g */
        C53667a f133223g;

        /* renamed from: h */
        public ProxySelector f133224h;

        /* renamed from: i */
        C53659m f133225i;

        /* renamed from: j */
        C53515c f133226j;

        /* renamed from: k */
        C53547f f133227k;

        /* renamed from: l */
        public SocketFactory f133228l;

        /* renamed from: m */
        SSLSocketFactory f133229m;

        /* renamed from: n */
        C53637c f133230n;

        /* renamed from: o */
        HostnameVerifier f133231o;

        /* renamed from: p */
        C53527g f133232p;

        /* renamed from: q */
        C53513b f133233q;

        /* renamed from: r */
        public C53513b f133234r;

        /* renamed from: s */
        C53653j f133235s;

        /* renamed from: t */
        C53662o f133236t;

        /* renamed from: u */
        boolean f133237u;

        /* renamed from: v */
        boolean f133238v;

        /* renamed from: w */
        boolean f133239w;

        /* renamed from: x */
        int f133240x;

        /* renamed from: y */
        int f133241y;

        /* renamed from: z */
        int f133242z;

        /* renamed from: a */
        public final C53684a mo111666a(boolean z) {
            this.f133238v = true;
            return this;
        }

        /* renamed from: a */
        public final C53684a mo111665a(C53676u uVar) {
            if (uVar != null) {
                this.f133221e.add(uVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: a */
        public final C53684a mo111664a(C53664p pVar) {
            if (pVar != null) {
                this.f133223g = C53664p.factory(pVar);
                return this;
            }
            throw new NullPointerException("eventListener == null");
        }

        /* renamed from: a */
        public final C53682y mo111667a() {
            return new C53682y(this);
        }

        public C53684a() {
            this.f133221e = new ArrayList();
            this.f133222f = new ArrayList();
            this.f133217a = new C53661n();
            this.f133219c = C53682y.f133187a;
            this.f133220d = C53682y.f133188b;
            this.f133223g = C53664p.factory(C53664p.NONE);
            this.f133224h = ProxySelector.getDefault();
            this.f133225i = C53659m.f133117a;
            this.f133228l = SocketFactory.getDefault();
            this.f133231o = C53638d.f133008a;
            this.f133232p = C53527g.f132493a;
            this.f133233q = C53513b.f132435b;
            this.f133234r = C53513b.f132435b;
            this.f133235s = new C53653j();
            this.f133236t = C53662o.f133125b;
            this.f133237u = true;
            this.f133238v = true;
            this.f133239w = true;
            this.f133240x = 10000;
            this.f133241y = 10000;
            this.f133242z = 10000;
            this.f133216A = 0;
        }

        /* renamed from: a */
        public final C53684a mo111659a(C53653j jVar) {
            this.f133235s = jVar;
            return this;
        }

        /* renamed from: b */
        public final C53684a mo111671b(boolean z) {
            this.f133239w = true;
            return this;
        }

        /* renamed from: a */
        public final C53684a mo111657a(C53515c cVar) {
            this.f133226j = cVar;
            this.f133227k = null;
            return this;
        }

        /* renamed from: b */
        public final C53684a mo111669b(List<C53655k> list) {
            this.f133220d = C53559c.m113801a(list);
            return this;
        }

        /* renamed from: a */
        public final C53684a mo111656a(SSLSocketFactory sSLSocketFactory) {
            this.f133229m = sSLSocketFactory;
            this.f133230n = C53634f.m114048c().mo111524b(sSLSocketFactory);
            return this;
        }

        /* renamed from: b */
        public final C53684a mo111670b(C53676u uVar) {
            if (uVar != null) {
                this.f133222f.add(uVar);
                return this;
            }
            throw new IllegalArgumentException("interceptor == null");
        }

        /* renamed from: a */
        public final C53684a mo111658a(C53527g gVar) {
            if (gVar != null) {
                this.f133232p = gVar;
                return this;
            }
            throw new NullPointerException("certificatePinner == null");
        }

        /* renamed from: a */
        public final C53684a mo111655a(List<C53685z> list) {
            ArrayList arrayList = new ArrayList(list);
            if (!arrayList.contains(C53685z.HTTP_1_1)) {
                StringBuilder sb = new StringBuilder("protocols doesn't contain http/1.1: ");
                sb.append(arrayList);
                throw new IllegalArgumentException(sb.toString());
            } else if (arrayList.contains(C53685z.HTTP_1_0)) {
                StringBuilder sb2 = new StringBuilder("protocols must not contain http/1.0: ");
                sb2.append(arrayList);
                throw new IllegalArgumentException(sb2.toString());
            } else if (!arrayList.contains(null)) {
                arrayList.remove(C53685z.SPDY_3);
                this.f133219c = Collections.unmodifiableList(arrayList);
                return this;
            } else {
                throw new IllegalArgumentException("protocols must not contain null");
            }
        }

        C53684a(C53682y yVar) {
            this.f133221e = new ArrayList();
            this.f133222f = new ArrayList();
            this.f133217a = yVar.f133192c;
            this.f133218b = yVar.f133193d;
            this.f133219c = yVar.f133194e;
            this.f133220d = yVar.f133195f;
            this.f133221e.addAll(yVar.f133196g);
            this.f133222f.addAll(yVar.f133197h);
            this.f133223g = yVar.f133198i;
            this.f133224h = yVar.f133199j;
            this.f133225i = yVar.f133200k;
            this.f133227k = yVar.f133202m;
            this.f133226j = yVar.f133201l;
            this.f133228l = yVar.f133203n;
            this.f133229m = yVar.f133204o;
            this.f133230n = yVar.f133205p;
            this.f133231o = yVar.f133206q;
            this.f133232p = yVar.f133207r;
            this.f133233q = yVar.f133208s;
            this.f133234r = yVar.f133209t;
            this.f133235s = yVar.f133210u;
            this.f133236t = yVar.f133211v;
            this.f133237u = yVar.f133212w;
            this.f133238v = yVar.f133213x;
            this.f133239w = yVar.f133214y;
            this.f133240x = yVar.f133215z;
            this.f133241y = yVar.f133189A;
            this.f133242z = yVar.f133190B;
            this.f133216A = yVar.f133191C;
        }

        /* renamed from: a */
        public final C53684a mo111660a(C53659m mVar) {
            if (mVar != null) {
                this.f133225i = mVar;
                return this;
            }
            throw new NullPointerException("cookieJar == null");
        }

        /* renamed from: a */
        public final C53684a mo111661a(C53661n nVar) {
            if (nVar != null) {
                this.f133217a = nVar;
                return this;
            }
            throw new IllegalArgumentException("dispatcher == null");
        }

        /* renamed from: a */
        public final C53684a mo111662a(C53662o oVar) {
            if (oVar != null) {
                this.f133236t = oVar;
                return this;
            }
            throw new NullPointerException("dns == null");
        }

        /* renamed from: a */
        public final C53684a mo111663a(C53667a aVar) {
            this.f133223g = aVar;
            return this;
        }

        /* renamed from: a */
        public final C53684a mo111654a(long j, TimeUnit timeUnit) {
            this.f133240x = C53559c.m113795a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: b */
        public final C53684a mo111668b(long j, TimeUnit timeUnit) {
            this.f133241y = C53559c.m113795a("timeout", j, timeUnit);
            return this;
        }

        /* renamed from: c */
        public final C53684a mo111672c(long j, TimeUnit timeUnit) {
            this.f133242z = C53559c.m113795a("timeout", j, timeUnit);
            return this;
        }
    }

    /* renamed from: b */
    public final C53684a mo111653b() {
        return new C53684a(this);
    }

    public C53682y() {
        this(new C53684a());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C53547f mo111652a() {
        if (this.f133201l != null) {
            return this.f133201l.f132436a;
        }
        return this.f133202m;
    }

    static {
        C53533a.f132616a = new C53533a() {
            /* renamed from: a */
            public final boolean mo111348a(C53653j jVar, C53551c cVar) {
                if (!C53653j.f133075g && !Thread.holdsLock(jVar)) {
                    throw new AssertionError();
                } else if (cVar.f132691e || jVar.f133076b == 0) {
                    jVar.f133078d.remove(cVar);
                    return true;
                } else {
                    jVar.notifyAll();
                    return false;
                }
            }

            /* renamed from: a */
            public final int mo111338a(C53505a aVar) {
                return aVar.f132413c;
            }

            /* renamed from: a */
            public final C53553d mo111342a(C53653j jVar) {
                return jVar.f133079e;
            }

            /* renamed from: a */
            public final C53557g mo111343a(C53524e eVar) {
                return ((C53496aa) eVar).mo111251e();
            }

            /* renamed from: a */
            public final C53524e mo111340a(C53682y yVar, C53498ab abVar) {
                return C53496aa.m113597a(yVar, abVar, true);
            }

            /* renamed from: b */
            public final void mo111349b(C53653j jVar, C53551c cVar) {
                if (C53653j.f133075g || Thread.holdsLock(jVar)) {
                    if (!jVar.f133080f) {
                        jVar.f133080f = true;
                        C53653j.f133074a.execute(jVar.f133077c);
                    }
                    jVar.f133078d.add(cVar);
                    return;
                }
                throw new AssertionError();
            }

            /* renamed from: a */
            public final void mo111345a(C53672a aVar, String str) {
                aVar.mo111603a(str);
            }

            /* renamed from: a */
            public final boolean mo111347a(C53495a aVar, C53495a aVar2) {
                return aVar.mo111241a(aVar2);
            }

            /* renamed from: a */
            public final Socket mo111339a(C53653j jVar, C53495a aVar, C53557g gVar) {
                return jVar.mo111553a(aVar, gVar);
            }

            /* renamed from: a */
            public final void mo111344a(C53655k kVar, SSLSocket sSLSocket, boolean z) {
                String[] strArr;
                String[] strArr2;
                if (kVar.f133089f != null) {
                    strArr = C53559c.m113810a(C53530h.f132527a, sSLSocket.getEnabledCipherSuites(), kVar.f133089f);
                } else {
                    strArr = sSLSocket.getEnabledCipherSuites();
                }
                if (kVar.f133090g != null) {
                    strArr2 = C53559c.m113810a(C53559c.f132740h, sSLSocket.getEnabledProtocols(), kVar.f133090g);
                } else {
                    strArr2 = sSLSocket.getEnabledProtocols();
                }
                String[] supportedCipherSuites = sSLSocket.getSupportedCipherSuites();
                Comparator<String> comparator = C53530h.f132527a;
                String str = "TLS_FALLBACK_SCSV";
                int length = supportedCipherSuites.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        i = -1;
                        break;
                    } else if (comparator.compare(supportedCipherSuites[i], str) == 0) {
                        break;
                    } else {
                        i++;
                    }
                }
                if (z && i != -1) {
                    String str2 = supportedCipherSuites[i];
                    String[] strArr3 = new String[(strArr.length + 1)];
                    System.arraycopy(strArr, 0, strArr3, 0, strArr.length);
                    strArr3[strArr3.length - 1] = str2;
                    strArr = strArr3;
                }
                C53655k a = new C53656a(kVar).mo111560a(strArr).mo111563b(strArr2).mo111562a();
                if (a.f133090g != null) {
                    sSLSocket.setEnabledProtocols(a.f133090g);
                }
                if (a.f133089f != null) {
                    sSLSocket.setEnabledCipherSuites(a.f133089f);
                }
            }

            /* renamed from: a */
            public final void mo111346a(C53672a aVar, String str, String str2) {
                aVar.mo111607b(str, str2);
            }

            /* renamed from: a */
            public final C53551c mo111341a(C53653j jVar, C53495a aVar, C53557g gVar, C53509af afVar) {
                if (C53653j.f133075g || Thread.holdsLock(jVar)) {
                    for (C53551c cVar : jVar.f133078d) {
                        if (cVar.mo111378a(aVar, afVar)) {
                            gVar.mo111398a(cVar, true);
                            return cVar;
                        }
                    }
                    return null;
                }
                throw new AssertionError();
            }
        };
    }

    /* renamed from: c */
    private static X509TrustManager m114240c() {
        try {
            TrustManagerFactory instance = TrustManagerFactory.getInstance(TrustManagerFactory.getDefaultAlgorithm());
            instance.init(null);
            TrustManager[] trustManagers = instance.getTrustManagers();
            if (trustManagers.length == 1 && (trustManagers[0] instanceof X509TrustManager)) {
                return (X509TrustManager) trustManagers[0];
            }
            StringBuilder sb = new StringBuilder("Unexpected default trust managers:");
            sb.append(Arrays.toString(trustManagers));
            throw new IllegalStateException(sb.toString());
        } catch (GeneralSecurityException e) {
            throw C53559c.m113796a("No System TLS", (Exception) e);
        }
    }

    /* renamed from: a */
    public final C53524e mo111325a(C53498ab abVar) {
        return C53496aa.m113597a(this, abVar, false);
    }

    /* renamed from: a */
    private static SSLSocketFactory m114239a(X509TrustManager x509TrustManager) {
        try {
            SSLContext cE_ = C53634f.m114048c().cE_();
            cE_.init(null, new TrustManager[]{x509TrustManager}, null);
            return cE_.getSocketFactory();
        } catch (GeneralSecurityException e) {
            throw C53559c.m113796a("No System TLS", (Exception) e);
        }
    }

    C53682y(C53684a aVar) {
        boolean z;
        this.f133192c = aVar.f133217a;
        this.f133193d = aVar.f133218b;
        this.f133194e = aVar.f133219c;
        this.f133195f = aVar.f133220d;
        this.f133196g = C53559c.m113801a(aVar.f133221e);
        this.f133197h = C53559c.m113801a(aVar.f133222f);
        this.f133198i = aVar.f133223g;
        this.f133199j = aVar.f133224h;
        this.f133200k = aVar.f133225i;
        this.f133201l = aVar.f133226j;
        this.f133202m = aVar.f133227k;
        this.f133203n = aVar.f133228l;
        Iterator it = this.f133195f.iterator();
        loop0:
        while (true) {
            z = false;
            while (true) {
                if (!it.hasNext()) {
                    break loop0;
                }
                C53655k kVar = (C53655k) it.next();
                if (z || kVar.f133087d) {
                    z = true;
                }
            }
        }
        if (aVar.f133229m != null || !z) {
            this.f133204o = aVar.f133229m;
            this.f133205p = aVar.f133230n;
        } else {
            X509TrustManager c = m114240c();
            this.f133204o = m114239a(c);
            this.f133205p = C53634f.m114048c().mo111503a(c);
        }
        this.f133206q = aVar.f133231o;
        C53527g gVar = aVar.f133232p;
        C53637c cVar = this.f133205p;
        if (!C53559c.m113808a((Object) gVar.f132495c, (Object) cVar)) {
            gVar = new C53527g(gVar.f132494b, cVar);
        }
        this.f133207r = gVar;
        this.f133208s = aVar.f133233q;
        this.f133209t = aVar.f133234r;
        this.f133210u = aVar.f133235s;
        this.f133211v = aVar.f133236t;
        this.f133212w = aVar.f133237u;
        this.f133213x = aVar.f133238v;
        this.f133214y = aVar.f133239w;
        this.f133215z = aVar.f133240x;
        this.f133189A = aVar.f133241y;
        this.f133190B = aVar.f133242z;
        this.f133191C = aVar.f133216A;
        if (this.f133196g.contains(null)) {
            StringBuilder sb = new StringBuilder("Null interceptor: ");
            sb.append(this.f133196g);
            throw new IllegalStateException(sb.toString());
        } else if (this.f133197h.contains(null)) {
            StringBuilder sb2 = new StringBuilder("Null network interceptor: ");
            sb2.append(this.f133197h);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final C53511ah mo111651a(C53498ab abVar, C53512ai aiVar) {
        C53640a aVar = new C53640a(abVar, aiVar, new Random(), (long) this.f133191C);
        aVar.mo111535a(this);
        return aVar;
    }
}
