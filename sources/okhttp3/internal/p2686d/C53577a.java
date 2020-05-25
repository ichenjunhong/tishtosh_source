package okhttp3.internal.p2686d;

import java.io.EOFException;
import java.io.IOException;
import java.net.ProtocolException;
import java.net.Proxy.Type;
import java.util.concurrent.TimeUnit;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53504ad.C53505a;
import okhttp3.C53506ae;
import okhttp3.C53671s;
import okhttp3.C53671s.C53672a;
import okhttp3.C53673t;
import okhttp3.C53682y;
import okhttp3.internal.C53533a;
import okhttp3.internal.C53559c;
import okhttp3.internal.p2684b.C53551c;
import okhttp3.internal.p2684b.C53557g;
import okhttp3.internal.p2685c.C53565c;
import okhttp3.internal.p2685c.C53568e;
import okhttp3.internal.p2685c.C53571h;
import okhttp3.internal.p2685c.C53572i;
import okhttp3.internal.p2685c.C53574k;
import okio.Buffer;
import okio.BufferedSink;
import okio.BufferedSource;
import okio.ForwardingTimeout;
import okio.Okio;
import okio.Sink;
import okio.Source;
import okio.Timeout;

/* renamed from: okhttp3.internal.d.a */
public final class C53577a implements C53565c {

    /* renamed from: a */
    final C53682y f132783a;

    /* renamed from: b */
    final C53557g f132784b;

    /* renamed from: c */
    final BufferedSource f132785c;

    /* renamed from: d */
    final BufferedSink f132786d;

    /* renamed from: e */
    int f132787e;

    /* renamed from: f */
    private long f132788f = 262144;

    /* renamed from: okhttp3.internal.d.a$a */
    abstract class C53579a implements Source {

        /* renamed from: a */
        protected final ForwardingTimeout f132789a;

        /* renamed from: b */
        protected boolean f132790b;

        /* renamed from: c */
        protected long f132791c;

        public Timeout timeout() {
            return this.f132789a;
        }

        private C53579a() {
            this.f132789a = new ForwardingTimeout(C53577a.this.f132785c.timeout());
            this.f132791c = 0;
        }

        public long read(Buffer buffer, long j) throws IOException {
            try {
                long read = C53577a.this.f132785c.read(buffer, j);
                if (read > 0) {
                    this.f132791c += read;
                }
                return read;
            } catch (IOException e) {
                mo111429a(false, e);
                throw e;
            }
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final void mo111429a(boolean z, IOException iOException) throws IOException {
            if (C53577a.this.f132787e != 6) {
                if (C53577a.this.f132787e == 5) {
                    C53577a.m113857a(this.f132789a);
                    C53577a.this.f132787e = 6;
                    if (C53577a.this.f132784b != null) {
                        C53577a.this.f132784b.mo111399a(!z, C53577a.this, this.f132791c, iOException);
                    }
                    return;
                }
                StringBuilder sb = new StringBuilder("state: ");
                sb.append(C53577a.this.f132787e);
                throw new IllegalStateException(sb.toString());
            }
        }
    }

    /* renamed from: okhttp3.internal.d.a$b */
    final class C53580b implements Sink {

        /* renamed from: b */
        private final ForwardingTimeout f132794b = new ForwardingTimeout(C53577a.this.f132786d.timeout());

        /* renamed from: c */
        private boolean f132795c;

        public final Timeout timeout() {
            return this.f132794b;
        }

        public final synchronized void flush() throws IOException {
            if (!this.f132795c) {
                C53577a.this.f132786d.flush();
            }
        }

        public final synchronized void close() throws IOException {
            if (!this.f132795c) {
                this.f132795c = true;
                C53577a.this.f132786d.writeUtf8("0\r\n\r\n");
                C53577a.m113857a(this.f132794b);
                C53577a.this.f132787e = 3;
            }
        }

        C53580b() {
        }

        public final void write(Buffer buffer, long j) throws IOException {
            if (this.f132795c) {
                throw new IllegalStateException("closed");
            } else if (j != 0) {
                C53577a.this.f132786d.writeHexadecimalUnsignedLong(j);
                C53577a.this.f132786d.writeUtf8("\r\n");
                C53577a.this.f132786d.write(buffer, j);
                C53577a.this.f132786d.writeUtf8("\r\n");
            }
        }
    }

    /* renamed from: okhttp3.internal.d.a$c */
    class C53581c extends C53579a {

        /* renamed from: f */
        private final C53673t f132797f;

        /* renamed from: g */
        private long f132798g = -1;

        /* renamed from: h */
        private boolean f132799h = true;

        public final void close() throws IOException {
            if (!this.f132790b) {
                if (this.f132799h && !C53559c.m113809a((Source) this, 100, TimeUnit.MILLISECONDS)) {
                    mo111429a(false, null);
                }
                this.f132790b = true;
            }
        }

        C53581c(C53673t tVar) {
            super();
            this.f132797f = tVar;
        }

        public final long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f132790b) {
                throw new IllegalStateException("closed");
            } else if (!this.f132799h) {
                return -1;
            } else {
                if (this.f132798g == 0 || this.f132798g == -1) {
                    if (this.f132798g != -1) {
                        C53577a.this.f132785c.readUtf8LineStrict();
                    }
                    try {
                        this.f132798g = C53577a.this.f132785c.readHexadecimalUnsignedLong();
                        String trim = C53577a.this.f132785c.readUtf8LineStrict().trim();
                        if (this.f132798g < 0 || (!trim.isEmpty() && !trim.startsWith(";"))) {
                            StringBuilder sb2 = new StringBuilder("expected chunk size and optional extensions but was \"");
                            sb2.append(this.f132798g);
                            sb2.append(trim);
                            sb2.append("\"");
                            throw new ProtocolException(sb2.toString());
                        }
                        if (this.f132798g == 0) {
                            this.f132799h = false;
                            C53568e.m113834a(C53577a.this.f132783a.f133200k, this.f132797f, C53577a.this.mo111428d());
                            mo111429a(true, null);
                        }
                        if (!this.f132799h) {
                            return -1;
                        }
                    } catch (NumberFormatException e) {
                        throw new ProtocolException(e.getMessage());
                    }
                }
                long read = super.read(buffer, Math.min(j, this.f132798g));
                if (read != -1) {
                    this.f132798g -= read;
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo111429a(false, protocolException);
                throw protocolException;
            }
        }
    }

    /* renamed from: okhttp3.internal.d.a$d */
    final class C53582d implements Sink {

        /* renamed from: b */
        private final ForwardingTimeout f132801b = new ForwardingTimeout(C53577a.this.f132786d.timeout());

        /* renamed from: c */
        private boolean f132802c;

        /* renamed from: d */
        private long f132803d;

        public final Timeout timeout() {
            return this.f132801b;
        }

        public final void flush() throws IOException {
            if (!this.f132802c) {
                C53577a.this.f132786d.flush();
            }
        }

        public final void close() throws IOException {
            if (!this.f132802c) {
                this.f132802c = true;
                if (this.f132803d <= 0) {
                    C53577a.m113857a(this.f132801b);
                    C53577a.this.f132787e = 3;
                    return;
                }
                throw new ProtocolException("unexpected end of stream");
            }
        }

        C53582d(long j) {
            this.f132803d = j;
        }

        public final void write(Buffer buffer, long j) throws IOException {
            if (!this.f132802c) {
                C53559c.m113804a(buffer.size(), 0, j);
                if (j <= this.f132803d) {
                    C53577a.this.f132786d.write(buffer, j);
                    this.f132803d -= j;
                    return;
                }
                StringBuilder sb = new StringBuilder("expected ");
                sb.append(this.f132803d);
                sb.append(" bytes but received ");
                sb.append(j);
                throw new ProtocolException(sb.toString());
            }
            throw new IllegalStateException("closed");
        }
    }

    /* renamed from: okhttp3.internal.d.a$e */
    class C53583e extends C53579a {

        /* renamed from: f */
        private long f132805f;

        public final void close() throws IOException {
            if (!this.f132790b) {
                if (this.f132805f != 0 && !C53559c.m113809a((Source) this, 100, TimeUnit.MILLISECONDS)) {
                    mo111429a(false, null);
                }
                this.f132790b = true;
            }
        }

        C53583e(long j) throws IOException {
            super();
            this.f132805f = j;
            if (this.f132805f == 0) {
                mo111429a(true, null);
            }
        }

        public final long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f132790b) {
                throw new IllegalStateException("closed");
            } else if (this.f132805f == 0) {
                return -1;
            } else {
                long read = super.read(buffer, Math.min(this.f132805f, j));
                if (read != -1) {
                    this.f132805f -= read;
                    if (this.f132805f == 0) {
                        mo111429a(true, null);
                    }
                    return read;
                }
                ProtocolException protocolException = new ProtocolException("unexpected end of stream");
                mo111429a(false, protocolException);
                throw protocolException;
            }
        }
    }

    /* renamed from: okhttp3.internal.d.a$f */
    class C53584f extends C53579a {

        /* renamed from: f */
        private boolean f132807f;

        public final void close() throws IOException {
            if (!this.f132790b) {
                if (!this.f132807f) {
                    mo111429a(false, null);
                }
                this.f132790b = true;
            }
        }

        C53584f() {
            super();
        }

        public final long read(Buffer buffer, long j) throws IOException {
            if (j < 0) {
                StringBuilder sb = new StringBuilder("byteCount < 0: ");
                sb.append(j);
                throw new IllegalArgumentException(sb.toString());
            } else if (this.f132790b) {
                throw new IllegalStateException("closed");
            } else if (this.f132807f) {
                return -1;
            } else {
                long read = super.read(buffer, j);
                if (read != -1) {
                    return read;
                }
                this.f132807f = true;
                mo111429a(true, null);
                return -1;
            }
        }
    }

    /* renamed from: a */
    public final void mo111411a() throws IOException {
        this.f132786d.flush();
    }

    /* renamed from: b */
    public final void mo111413b() throws IOException {
        this.f132786d.flush();
    }

    /* renamed from: c */
    public final void mo111414c() {
        C53551c b = this.f132784b.mo111400b();
        if (b != null) {
            b.mo111381c();
        }
    }

    /* renamed from: e */
    private String m113858e() throws IOException {
        String readUtf8LineStrict = this.f132785c.readUtf8LineStrict(this.f132788f);
        this.f132788f -= (long) readUtf8LineStrict.length();
        return readUtf8LineStrict;
    }

    /* renamed from: d */
    public final C53671s mo111428d() throws IOException {
        C53672a aVar = new C53672a();
        while (true) {
            String e = m113858e();
            if (e.length() == 0) {
                return aVar.mo111605a();
            }
            C53533a.f132616a.mo111345a(aVar, e);
        }
    }

    /* renamed from: a */
    static void m113857a(ForwardingTimeout forwardingTimeout) {
        Timeout delegate = forwardingTimeout.delegate();
        forwardingTimeout.setDelegate(Timeout.NONE);
        delegate.clearDeadline();
        delegate.clearTimeout();
    }

    /* renamed from: a */
    public final Source mo111426a(long j) throws IOException {
        if (this.f132787e == 4) {
            this.f132787e = 5;
            return new C53583e(j);
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.f132787e);
        throw new IllegalStateException(sb.toString());
    }

    /* renamed from: a */
    public final C53505a mo111408a(boolean z) throws IOException {
        if (this.f132787e == 1 || this.f132787e == 3) {
            try {
                C53574k a = C53574k.m113855a(m113858e());
                C53505a a2 = new C53505a().mo111290a(a.f132780a).mo111281a(a.f132781b).mo111283a(a.f132782c).mo111289a(mo111428d());
                if (z && a.f132781b == 100) {
                    return null;
                }
                if (a.f132781b == 100) {
                    this.f132787e = 3;
                    return a2;
                }
                this.f132787e = 4;
                return a2;
            } catch (EOFException e) {
                StringBuilder sb = new StringBuilder("unexpected end of stream on ");
                sb.append(this.f132784b);
                IOException iOException = new IOException(sb.toString());
                iOException.initCause(e);
                throw iOException;
            }
        } else {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.f132787e);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final C53506ae mo111409a(C53504ad adVar) throws IOException {
        this.f132784b.f132721e.responseBodyStart(this.f132784b.f132720d);
        String b = adVar.mo111276b("Content-Type");
        if (!C53568e.m113836b(adVar)) {
            return new C53571h(b, 0, Okio.buffer(mo111426a(0)));
        }
        if ("chunked".equalsIgnoreCase(adVar.mo111276b("Transfer-Encoding"))) {
            C53673t tVar = adVar.f132398a.f132378a;
            if (this.f132787e == 4) {
                this.f132787e = 5;
                return new C53571h(b, -1, Okio.buffer((Source) new C53581c(tVar)));
            }
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.f132787e);
            throw new IllegalStateException(sb.toString());
        }
        long a = C53568e.m113831a(adVar);
        if (a != -1) {
            return new C53571h(b, a, Okio.buffer(mo111426a(a)));
        }
        if (this.f132787e != 4) {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.f132787e);
            throw new IllegalStateException(sb2.toString());
        } else if (this.f132784b != null) {
            this.f132787e = 5;
            this.f132784b.mo111402d();
            return new C53571h(b, -1, Okio.buffer((Source) new C53584f()));
        } else {
            throw new IllegalStateException("streamAllocation == null");
        }
    }

    /* renamed from: a */
    public final void mo111412a(C53498ab abVar) throws IOException {
        boolean z;
        Type type = this.f132784b.mo111400b().mo111336a().f132431b.type();
        StringBuilder sb = new StringBuilder();
        sb.append(abVar.f132379b);
        sb.append(' ');
        if (abVar.mo111258c() || type != Type.HTTP) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            sb.append(abVar.f132378a);
        } else {
            sb.append(C53572i.m113848a(abVar.f132378a));
        }
        sb.append(" HTTP/1.1");
        mo111427a(abVar.f132380c, sb.toString());
    }

    /* renamed from: a */
    public final Sink mo111410a(C53498ab abVar, long j) {
        if ("chunked".equalsIgnoreCase(abVar.mo111255a("Transfer-Encoding"))) {
            if (this.f132787e == 1) {
                this.f132787e = 2;
                return new C53580b();
            }
            StringBuilder sb = new StringBuilder("state: ");
            sb.append(this.f132787e);
            throw new IllegalStateException(sb.toString());
        } else if (j == -1) {
            throw new IllegalStateException("Cannot stream a request body without chunked encoding or a known content length!");
        } else if (this.f132787e == 1) {
            this.f132787e = 2;
            return new C53582d(j);
        } else {
            StringBuilder sb2 = new StringBuilder("state: ");
            sb2.append(this.f132787e);
            throw new IllegalStateException(sb2.toString());
        }
    }

    /* renamed from: a */
    public final void mo111427a(C53671s sVar, String str) throws IOException {
        if (this.f132787e == 0) {
            this.f132786d.writeUtf8(str).writeUtf8("\r\n");
            int a = sVar.mo111591a();
            for (int i = 0; i < a; i++) {
                this.f132786d.writeUtf8(sVar.mo111592a(i)).writeUtf8(": ").writeUtf8(sVar.mo111594b(i)).writeUtf8("\r\n");
            }
            this.f132786d.writeUtf8("\r\n");
            this.f132787e = 1;
            return;
        }
        StringBuilder sb = new StringBuilder("state: ");
        sb.append(this.f132787e);
        throw new IllegalStateException(sb.toString());
    }

    public C53577a(C53682y yVar, C53557g gVar, BufferedSource bufferedSource, BufferedSink bufferedSink) {
        this.f132783a = yVar;
        this.f132784b = gVar;
        this.f132785c = bufferedSource;
        this.f132786d = bufferedSink;
    }
}
