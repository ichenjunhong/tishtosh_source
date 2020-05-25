package okhttp3;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.security.cert.Certificate;
import java.security.cert.CertificateEncodingException;
import java.security.cert.CertificateException;
import java.security.cert.CertificateFactory;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad.C53505a;
import okhttp3.C53671s.C53672a;
import okhttp3.internal.C53559c;
import okhttp3.internal.p2683a.C53536b;
import okhttp3.internal.p2683a.C53537c;
import okhttp3.internal.p2683a.C53539d;
import okhttp3.internal.p2683a.C53539d.C53542a;
import okhttp3.internal.p2683a.C53539d.C53545c;
import okhttp3.internal.p2683a.C53547f;
import okhttp3.internal.p2685c.C53568e;
import okhttp3.internal.p2685c.C53569f;
import okhttp3.internal.p2685c.C53574k;
import okhttp3.internal.p2688f.C53623a;
import okhttp3.internal.p2689g.C53634f;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ByteString;
import okio.ForwardingSink;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.c */
public final class C53515c implements Closeable, Flushable {

    /* renamed from: a */
    final C53547f f132436a;

    /* renamed from: b */
    final C53539d f132437b;

    /* renamed from: c */
    int f132438c;

    /* renamed from: d */
    int f132439d;

    /* renamed from: e */
    private int f132440e;

    /* renamed from: f */
    private int f132441f;

    /* renamed from: g */
    private int f132442g;

    /* renamed from: okhttp3.c$a */
    final class C53517a implements C53536b {

        /* renamed from: a */
        boolean f132444a;

        /* renamed from: c */
        private final C53542a f132446c;

        /* renamed from: d */
        private Sink f132447d;

        /* renamed from: e */
        private Sink f132448e;

        /* renamed from: b */
        public final Sink mo111319b() {
            return this.f132448e;
        }

        /* renamed from: a */
        public final void mo111318a() {
            synchronized (C53515c.this) {
                if (!this.f132444a) {
                    this.f132444a = true;
                    C53515c.this.f132439d++;
                    C53559c.m113805a((Closeable) this.f132447d);
                    try {
                        this.f132446c.mo111366c();
                    } catch (IOException unused) {
                    }
                }
            }
        }

        C53517a(final C53542a aVar) {
            this.f132446c = aVar;
            this.f132447d = aVar.mo111363a(1);
            this.f132448e = new ForwardingSink(this.f132447d, C53515c.this) {
                public final void close() throws IOException {
                    synchronized (C53515c.this) {
                        if (!C53517a.this.f132444a) {
                            C53517a.this.f132444a = true;
                            C53515c.this.f132438c++;
                            super.close();
                            aVar.mo111365b();
                        }
                    }
                }
            };
        }
    }

    /* renamed from: okhttp3.c$b */
    static class C53519b extends C53506ae {

        /* renamed from: a */
        final C53545c f132452a;

        /* renamed from: b */
        private final BufferedSource f132453b;

        /* renamed from: c */
        private final String f132454c;

        /* renamed from: d */
        private final String f132455d;

        public final BufferedSource source() {
            return this.f132453b;
        }

        public final long contentLength() {
            try {
                if (this.f132455d != null) {
                    return Long.parseLong(this.f132455d);
                }
                return -1;
            } catch (NumberFormatException unused) {
                return -1;
            }
        }

        public final C53678w contentType() {
            if (this.f132454c != null) {
                return C53678w.m114225a(this.f132454c);
            }
            return null;
        }

        C53519b(final C53545c cVar, String str, String str2) {
            this.f132452a = cVar;
            this.f132454c = str;
            this.f132455d = str2;
            this.f132453b = Okio.buffer((Source) new ForwardingSource(cVar.mo111370a(1)) {
                public final void close() throws IOException {
                    cVar.close();
                    super.close();
                }
            });
        }
    }

    /* renamed from: okhttp3.c$c */
    static final class C53521c {

        /* renamed from: k */
        private static final String f132458k;

        /* renamed from: l */
        private static final String f132459l;

        /* renamed from: a */
        final String f132460a;

        /* renamed from: b */
        final C53671s f132461b;

        /* renamed from: c */
        final String f132462c;

        /* renamed from: d */
        final C53685z f132463d;

        /* renamed from: e */
        final int f132464e;

        /* renamed from: f */
        final String f132465f;

        /* renamed from: g */
        final C53671s f132466g;

        /* renamed from: h */
        final C53670r f132467h;

        /* renamed from: i */
        final long f132468i;

        /* renamed from: j */
        final long f132469j;

        /* renamed from: a */
        private boolean m113671a() {
            return this.f132460a.startsWith("https://");
        }

        static {
            StringBuilder sb = new StringBuilder();
            sb.append(C53634f.m114049d());
            sb.append("-Sent-Millis");
            f132458k = sb.toString();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(C53634f.m114049d());
            sb2.append("-Received-Millis");
            f132459l = sb2.toString();
        }

        C53521c(C53504ad adVar) {
            this.f132460a = adVar.f132398a.f132378a.toString();
            this.f132461b = C53568e.m113833a(adVar.f132405h.f132398a.f132380c, adVar.f132403f);
            this.f132462c = adVar.f132398a.f132379b;
            this.f132463d = adVar.f132399b;
            this.f132464e = adVar.f132400c;
            this.f132465f = adVar.f132401d;
            this.f132466g = adVar.f132403f;
            this.f132467h = adVar.f132402e;
            this.f132468i = adVar.f132408k;
            this.f132469j = adVar.f132409l;
        }

        /* renamed from: a */
        private static List<Certificate> m113669a(BufferedSource bufferedSource) throws IOException {
            int a = C53515c.m113653a(bufferedSource);
            if (a == -1) {
                return Collections.emptyList();
            }
            try {
                CertificateFactory instance = CertificateFactory.getInstance("X.509");
                ArrayList arrayList = new ArrayList(a);
                for (int i = 0; i < a; i++) {
                    String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
                    Buffer buffer = new Buffer();
                    buffer.write(ByteString.decodeBase64(readUtf8LineStrict));
                    arrayList.add(instance.generateCertificate(buffer.inputStream()));
                }
                return arrayList;
            } catch (CertificateException e) {
                throw new IOException(e.getMessage());
            }
        }

        C53521c(Source source) throws IOException {
            long j;
            C53510ag agVar;
            try {
                BufferedSource buffer = Okio.buffer(source);
                this.f132460a = buffer.readUtf8LineStrict();
                this.f132462c = buffer.readUtf8LineStrict();
                C53672a aVar = new C53672a();
                int a = C53515c.m113653a(buffer);
                for (int i = 0; i < a; i++) {
                    aVar.mo111603a(buffer.readUtf8LineStrict());
                }
                this.f132461b = aVar.mo111605a();
                C53574k a2 = C53574k.m113855a(buffer.readUtf8LineStrict());
                this.f132463d = a2.f132780a;
                this.f132464e = a2.f132781b;
                this.f132465f = a2.f132782c;
                C53672a aVar2 = new C53672a();
                int a3 = C53515c.m113653a(buffer);
                for (int i2 = 0; i2 < a3; i2++) {
                    aVar2.mo111603a(buffer.readUtf8LineStrict());
                }
                String c = aVar2.mo111608c(f132458k);
                String c2 = aVar2.mo111608c(f132459l);
                aVar2.mo111606b(f132458k);
                aVar2.mo111606b(f132459l);
                long j2 = 0;
                if (c != null) {
                    j = Long.parseLong(c);
                } else {
                    j = 0;
                }
                this.f132468i = j;
                if (c2 != null) {
                    j2 = Long.parseLong(c2);
                }
                this.f132469j = j2;
                this.f132466g = aVar2.mo111605a();
                if (m113671a()) {
                    String readUtf8LineStrict = buffer.readUtf8LineStrict();
                    if (readUtf8LineStrict.length() <= 0) {
                        C53530h a4 = C53530h.m113689a(buffer.readUtf8LineStrict());
                        List a5 = m113669a(buffer);
                        List a6 = m113669a(buffer);
                        if (!buffer.exhausted()) {
                            agVar = C53510ag.forJavaName(buffer.readUtf8LineStrict());
                        } else {
                            agVar = C53510ag.SSL_3_0;
                        }
                        if (agVar == null) {
                            throw new NullPointerException("tlsVersion == null");
                        } else if (a4 != null) {
                            this.f132467h = new C53670r(agVar, a4, C53559c.m113801a(a5), C53559c.m113801a(a6));
                        } else {
                            throw new NullPointerException("cipherSuite == null");
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("expected \"\" but was \"");
                        sb.append(readUtf8LineStrict);
                        sb.append("\"");
                        throw new IOException(sb.toString());
                    }
                } else {
                    this.f132467h = null;
                }
            } finally {
                source.close();
            }
        }

        /* renamed from: a */
        public final void mo111320a(C53542a aVar) throws IOException {
            BufferedSink buffer = Okio.buffer(aVar.mo111363a(0));
            buffer.writeUtf8(this.f132460a).writeByte(10);
            buffer.writeUtf8(this.f132462c).writeByte(10);
            buffer.writeDecimalLong((long) this.f132461b.mo111591a()).writeByte(10);
            int a = this.f132461b.mo111591a();
            for (int i = 0; i < a; i++) {
                buffer.writeUtf8(this.f132461b.mo111592a(i)).writeUtf8(": ").writeUtf8(this.f132461b.mo111594b(i)).writeByte(10);
            }
            buffer.writeUtf8(new C53574k(this.f132463d, this.f132464e, this.f132465f).toString()).writeByte(10);
            buffer.writeDecimalLong((long) (this.f132466g.mo111591a() + 2)).writeByte(10);
            int a2 = this.f132466g.mo111591a();
            for (int i2 = 0; i2 < a2; i2++) {
                buffer.writeUtf8(this.f132466g.mo111592a(i2)).writeUtf8(": ").writeUtf8(this.f132466g.mo111594b(i2)).writeByte(10);
            }
            buffer.writeUtf8(f132458k).writeUtf8(": ").writeDecimalLong(this.f132468i).writeByte(10);
            buffer.writeUtf8(f132459l).writeUtf8(": ").writeDecimalLong(this.f132469j).writeByte(10);
            if (m113671a()) {
                buffer.writeByte(10);
                buffer.writeUtf8(this.f132467h.f133134b.f132615bj).writeByte(10);
                m113670a(buffer, this.f132467h.f133135c);
                m113670a(buffer, this.f132467h.f133136d);
                buffer.writeUtf8(this.f132467h.f133133a.javaName()).writeByte(10);
            }
            buffer.close();
        }

        /* renamed from: a */
        private static void m113670a(BufferedSink bufferedSink, List<Certificate> list) throws IOException {
            try {
                bufferedSink.writeDecimalLong((long) list.size()).writeByte(10);
                int size = list.size();
                for (int i = 0; i < size; i++) {
                    bufferedSink.writeUtf8(ByteString.m114277of(((Certificate) list.get(i)).getEncoded()).base64()).writeByte(10);
                }
            } catch (CertificateEncodingException e) {
                throw new IOException(e.getMessage());
            }
        }
    }

    public final void close() throws IOException {
        this.f132437b.close();
    }

    public final void flush() throws IOException {
        this.f132437b.flush();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo111307a() {
        this.f132441f++;
    }

    /* renamed from: a */
    static void m113655a(C53542a aVar) {
        if (aVar != null) {
            try {
                aVar.mo111366c();
            } catch (IOException unused) {
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final void mo111309b(C53498ab abVar) throws IOException {
        this.f132437b.mo111358c(m113654a(abVar.f132378a));
    }

    /* renamed from: a */
    private static String m113654a(C53673t tVar) {
        return ByteString.encodeUtf8(tVar.toString()).md5().hex();
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final synchronized void mo111308a(okhttp3.internal.p2683a.C53537c r2) {
        /*
            r1 = this;
            monitor-enter(r1)
            int r0 = r1.f132442g     // Catch:{ all -> 0x001f }
            int r0 = r0 + 1
            r1.f132442g = r0     // Catch:{ all -> 0x001f }
            okhttp3.ab r0 = r2.f132623a     // Catch:{ all -> 0x001f }
            if (r0 == 0) goto L_0x0013
            int r2 = r1.f132440e     // Catch:{ all -> 0x001f }
            int r2 = r2 + 1
            r1.f132440e = r2     // Catch:{ all -> 0x001f }
            monitor-exit(r1)
            return
        L_0x0013:
            okhttp3.ad r2 = r2.f132624b     // Catch:{ all -> 0x001f }
            if (r2 == 0) goto L_0x001d
            int r2 = r1.f132441f     // Catch:{ all -> 0x001f }
            int r2 = r2 + 1
            r1.f132441f = r2     // Catch:{ all -> 0x001f }
        L_0x001d:
            monitor-exit(r1)
            return
        L_0x001f:
            r2 = move-exception
            monitor-exit(r1)
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.C53515c.mo111308a(okhttp3.internal.a.c):void");
    }

    /* renamed from: a */
    static int m113653a(BufferedSource bufferedSource) throws IOException {
        try {
            long readDecimalLong = bufferedSource.readDecimalLong();
            String readUtf8LineStrict = bufferedSource.readUtf8LineStrict();
            if (readDecimalLong >= 0 && readDecimalLong <= 2147483647L && readUtf8LineStrict.isEmpty()) {
                return (int) readDecimalLong;
            }
            StringBuilder sb = new StringBuilder("expected an int but was \"");
            sb.append(readDecimalLong);
            sb.append(readUtf8LineStrict);
            sb.append("\"");
            throw new IOException(sb.toString());
        } catch (NumberFormatException e) {
            throw new IOException(e.getMessage());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C53504ad mo111305a(C53498ab abVar) {
        boolean z;
        try {
            C53545c a = this.f132437b.mo111351a(m113654a(abVar.f132378a));
            if (a == null) {
                return null;
            }
            try {
                boolean z2 = false;
                C53521c cVar = new C53521c(a.mo111370a(0));
                String a2 = cVar.f132466g.mo111593a("Content-Type");
                String a3 = cVar.f132466g.mo111593a("Content-Length");
                C53504ad a4 = new C53505a().mo111285a(new C53499a().mo111262a(cVar.f132460a).mo111264a(cVar.f132462c, (C53500ac) null).mo111267a(cVar.f132461b).mo111272c()).mo111290a(cVar.f132463d).mo111281a(cVar.f132464e).mo111283a(cVar.f132465f).mo111289a(cVar.f132466g).mo111287a((C53506ae) new C53519b(a, a2, a3)).mo111288a(cVar.f132467h).mo111282a(cVar.f132468i).mo111292b(cVar.f132469j).mo111291a();
                if (cVar.f132460a.equals(abVar.f132378a.toString()) && cVar.f132462c.equals(abVar.f132379b)) {
                    C53671s sVar = cVar.f132461b;
                    Iterator it = C53568e.m113832a(a4.f132403f).iterator();
                    while (true) {
                        if (!it.hasNext()) {
                            z = true;
                            break;
                        }
                        String str = (String) it.next();
                        if (!C53559c.m113808a((Object) sVar.mo111595b(str), (Object) abVar.f132380c.mo111595b(str))) {
                            z = false;
                            break;
                        }
                    }
                    if (z) {
                        z2 = true;
                    }
                }
                if (z2) {
                    return a4;
                }
                C53559c.m113805a((Closeable) a4.f132404g);
                return null;
            } catch (IOException unused) {
                C53559c.m113805a((Closeable) a);
                return null;
            }
        } catch (IOException unused2) {
            return null;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C53536b mo111306a(C53504ad adVar) {
        C53542a aVar;
        String str = adVar.f132398a.f132379b;
        if (C53569f.m113837a(adVar.f132398a.f132379b)) {
            try {
                mo111309b(adVar.f132398a);
            } catch (IOException unused) {
            }
            return null;
        } else if (!str.equals("GET") || C53568e.m113832a(adVar.f132403f).contains("*")) {
            return null;
        } else {
            C53521c cVar = new C53521c(adVar);
            try {
                aVar = this.f132437b.mo111355b(m113654a(adVar.f132398a.f132378a));
                if (aVar == null) {
                    return null;
                }
                try {
                    cVar.mo111320a(aVar);
                    return new C53517a(aVar);
                } catch (IOException unused2) {
                    m113655a(aVar);
                    return null;
                }
            } catch (IOException unused3) {
                aVar = null;
                m113655a(aVar);
                return null;
            }
        }
    }

    public C53515c(File file, long j) {
        this(file, 1048576, C53623a.f132977a);
    }

    private C53515c(File file, long j, C53623a aVar) {
        this.f132436a = new C53547f() {
            /* renamed from: a */
            public final void mo111314a() {
                C53515c.this.mo111307a();
            }

            /* renamed from: a */
            public final C53504ad mo111312a(C53498ab abVar) throws IOException {
                return C53515c.this.mo111305a(abVar);
            }

            /* renamed from: b */
            public final void mo111317b(C53498ab abVar) throws IOException {
                C53515c.this.mo111309b(abVar);
            }

            /* renamed from: a */
            public final C53536b mo111313a(C53504ad adVar) throws IOException {
                return C53515c.this.mo111306a(adVar);
            }

            /* renamed from: a */
            public final void mo111316a(C53537c cVar) {
                C53515c.this.mo111308a(cVar);
            }

            /* renamed from: a */
            public final void mo111315a(C53504ad adVar, C53504ad adVar2) {
                C53542a aVar;
                C53515c cVar = C53515c.this;
                C53521c cVar2 = new C53521c(adVar2);
                C53545c cVar3 = ((C53519b) adVar.f132404g).f132452a;
                try {
                    aVar = C53539d.this.mo111350a(cVar3.f132675a, cVar3.f132676b);
                    if (aVar != null) {
                        try {
                            cVar2.mo111320a(aVar);
                            aVar.mo111365b();
                        } catch (IOException unused) {
                            C53515c.m113655a(aVar);
                        }
                    }
                } catch (IOException unused2) {
                    aVar = null;
                    C53515c.m113655a(aVar);
                }
            }
        };
        this.f132437b = C53539d.m113712a(aVar, file, 201105, 2, j);
    }
}
