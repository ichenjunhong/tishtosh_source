package p2666g;

import java.io.IOException;
import okhttp3.C53504ad;
import okhttp3.C53506ae;
import okhttp3.C53524e;
import okhttp3.C53526f;
import okhttp3.C53678w;
import okio.Buffer;
import okio.BufferedSource;
import okio.ForwardingSource;
import okio.Okio;
import okio.Source;

/* renamed from: g.i */
final class C53106i<T> implements C53061b<T> {

    /* renamed from: a */
    private final C53137o<T, ?> f131581a;

    /* renamed from: b */
    private final Object[] f131582b;

    /* renamed from: c */
    private volatile boolean f131583c;

    /* renamed from: d */
    private C53524e f131584d;

    /* renamed from: e */
    private Throwable f131585e;

    /* renamed from: f */
    private boolean f131586f;

    /* renamed from: g.i$a */
    static final class C53108a extends C53506ae {

        /* renamed from: a */
        IOException f131589a;

        /* renamed from: b */
        private final C53506ae f131590b;

        public final void close() {
            this.f131590b.close();
        }

        public final long contentLength() {
            return this.f131590b.contentLength();
        }

        public final C53678w contentType() {
            return this.f131590b.contentType();
        }

        public final BufferedSource source() {
            return Okio.buffer((Source) new ForwardingSource(this.f131590b.source()) {
                public final long read(Buffer buffer, long j) throws IOException {
                    try {
                        return super.read(buffer, j);
                    } catch (IOException e) {
                        C53108a.this.f131589a = e;
                        throw e;
                    }
                }
            });
        }

        C53108a(C53506ae aeVar) {
            this.f131590b = aeVar;
        }
    }

    /* renamed from: g.i$b */
    static final class C53110b extends C53506ae {

        /* renamed from: a */
        private final C53678w f131592a;

        /* renamed from: b */
        private final long f131593b;

        public final long contentLength() {
            return this.f131593b;
        }

        public final C53678w contentType() {
            return this.f131592a;
        }

        public final BufferedSource source() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }

        C53110b(C53678w wVar, long j) {
            this.f131592a = wVar;
            this.f131593b = j;
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: e */
    public C53106i<T> mo110598d() {
        return new C53106i<>(this.f131581a, this.f131582b);
    }

    /* renamed from: b */
    public final void mo110596b() {
        C53524e eVar;
        this.f131583c = true;
        synchronized (this) {
            eVar = this.f131584d;
        }
        if (eVar != null) {
            eVar.mo111248c();
        }
    }

    /* renamed from: f */
    private C53524e m112887f() throws IOException {
        C53524e a = this.f131581a.f131657c.mo111325a(this.f131581a.mo110658a(this.f131582b));
        if (a != null) {
            return a;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    /* renamed from: c */
    public final boolean mo110597c() {
        boolean z = true;
        if (this.f131583c) {
            return true;
        }
        synchronized (this) {
            if (this.f131584d == null || !this.f131584d.mo111250d()) {
                z = false;
            }
        }
        return z;
    }

    /* renamed from: a */
    public final C53133m<T> mo110594a() throws IOException {
        C53524e eVar;
        synchronized (this) {
            if (!this.f131586f) {
                this.f131586f = true;
                if (this.f131585e == null) {
                    eVar = this.f131584d;
                    if (eVar == null) {
                        try {
                            eVar = m112887f();
                            this.f131584d = eVar;
                        } catch (IOException | RuntimeException e) {
                            this.f131585e = e;
                            throw e;
                        }
                    }
                } else if (this.f131585e instanceof IOException) {
                    throw ((IOException) this.f131585e);
                } else {
                    throw ((RuntimeException) this.f131585e);
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (this.f131583c) {
            eVar.mo111248c();
        }
        return mo110629a(eVar.mo111247b());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final C53133m<T> mo110629a(C53504ad adVar) throws IOException {
        C53506ae aeVar = adVar.f132404g;
        C53504ad a = adVar.mo111277b().mo111287a((C53506ae) new C53110b(aeVar.contentType(), aeVar.contentLength())).mo111291a();
        int i = a.f132400c;
        if (i < 200 || i >= 300) {
            try {
                C53506ae a2 = C53139p.m112961a(aeVar);
                C53139p.m112957a(a2, "body == null");
                C53139p.m112957a(a, "rawResponse == null");
                if (!a.mo111275a()) {
                    return new C53133m<>(a, null, a2);
                }
                throw new IllegalArgumentException("rawResponse should not be successful response");
            } finally {
                aeVar.close();
            }
        } else if (i == 204 || i == 205) {
            aeVar.close();
            return C53133m.m112928a(null, a);
        } else {
            try {
                return C53133m.m112928a(this.f131581a.f131659e.mo110590a(new C53108a(aeVar)), a);
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }

    /* renamed from: a */
    public final void mo110595a(final C53094d<T> dVar) {
        C53524e eVar;
        Throwable th;
        C53139p.m112957a(dVar, "callback == null");
        synchronized (this) {
            if (!this.f131586f) {
                this.f131586f = true;
                eVar = this.f131584d;
                th = this.f131585e;
                if (eVar == null && th == null) {
                    try {
                        C53524e f = m112887f();
                        this.f131584d = f;
                        eVar = f;
                    } catch (Throwable th2) {
                        th = th2;
                        this.f131585e = th;
                    }
                }
            } else {
                throw new IllegalStateException("Already executed.");
            }
        }
        if (th != null) {
            dVar.mo36429a((C53061b<T>) this, th);
            return;
        }
        if (this.f131583c) {
            eVar.mo111248c();
        }
        eVar.mo111246a(new C53526f() {
            public final void onFailure(C53524e eVar, IOException iOException) {
                try {
                    dVar.mo36429a((C53061b<T>) C53106i.this, (Throwable) iOException);
                } catch (Throwable unused) {
                }
            }

            public final void onResponse(C53524e eVar, C53504ad adVar) throws IOException {
                try {
                    try {
                        dVar.mo36428a((C53061b<T>) C53106i.this, C53106i.this.mo110629a(adVar));
                    } catch (Throwable unused) {
                    }
                } catch (Throwable unused2) {
                }
            }
        });
    }

    C53106i(C53137o<T, ?> oVar, Object[] objArr) {
        this.f131581a = oVar;
        this.f131582b = objArr;
    }
}
