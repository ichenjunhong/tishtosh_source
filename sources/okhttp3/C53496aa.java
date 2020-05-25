package okhttp3;

import java.io.IOException;
import java.util.ArrayList;
import okhttp3.internal.C53548b;
import okhttp3.internal.p2683a.C53534a;
import okhttp3.internal.p2684b.C53549a;
import okhttp3.internal.p2684b.C53557g;
import okhttp3.internal.p2685c.C53562a;
import okhttp3.internal.p2685c.C53563b;
import okhttp3.internal.p2685c.C53570g;
import okhttp3.internal.p2685c.C53573j;
import okhttp3.internal.p2689g.C53634f;

/* renamed from: okhttp3.aa */
final class C53496aa implements C53524e {

    /* renamed from: a */
    final C53682y f132370a;

    /* renamed from: b */
    final C53573j f132371b;

    /* renamed from: c */
    public C53664p f132372c;

    /* renamed from: d */
    final C53498ab f132373d;

    /* renamed from: e */
    final boolean f132374e;

    /* renamed from: f */
    private boolean f132375f;

    /* renamed from: okhttp3.aa$a */
    final class C53497a extends C53548b {

        /* renamed from: b */
        private final C53526f f132377b;

        /* access modifiers changed from: 0000 */
        /* renamed from: b */
        public final String mo111254b() {
            return C53496aa.this.f132373d.f132378a.f133143d;
        }

        /* JADX WARNING: Removed duplicated region for block: B:17:0x003c A[Catch:{ all -> 0x0032 }] */
        /* JADX WARNING: Removed duplicated region for block: B:18:0x003f A[Catch:{ all -> 0x0032 }] */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0047 A[Catch:{ all -> 0x0032 }] */
        /* JADX WARNING: Removed duplicated region for block: B:29:0x008f A[Catch:{ all -> 0x0032 }] */
        /* renamed from: a */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final void mo99503a() {
            /*
                r7 = this;
                r0 = 1
                r1 = 0
                okhttp3.aa r2 = okhttp3.C53496aa.this     // Catch:{ Throwable -> 0x0035 }
                okhttp3.ad r2 = r2.mo111253g()     // Catch:{ Throwable -> 0x0035 }
                okhttp3.aa r3 = okhttp3.C53496aa.this     // Catch:{ Throwable -> 0x0035 }
                okhttp3.internal.c.j r3 = r3.f132371b     // Catch:{ Throwable -> 0x0035 }
                boolean r3 = r3.f132777c     // Catch:{ Throwable -> 0x0035 }
                if (r3 == 0) goto L_0x0021
                okhttp3.f r1 = r7.f132377b     // Catch:{ Throwable -> 0x001f }
                okhttp3.aa r2 = okhttp3.C53496aa.this     // Catch:{ Throwable -> 0x001f }
                java.io.IOException r3 = new java.io.IOException     // Catch:{ Throwable -> 0x001f }
                java.lang.String r4 = "Canceled"
                r3.<init>(r4)     // Catch:{ Throwable -> 0x001f }
                r1.onFailure(r2, r3)     // Catch:{ Throwable -> 0x001f }
                goto L_0x0028
            L_0x001f:
                r1 = move-exception
                goto L_0x0038
            L_0x0021:
                okhttp3.f r1 = r7.f132377b     // Catch:{ Throwable -> 0x001f }
                okhttp3.aa r3 = okhttp3.C53496aa.this     // Catch:{ Throwable -> 0x001f }
                r1.onResponse(r3, r2)     // Catch:{ Throwable -> 0x001f }
            L_0x0028:
                okhttp3.aa r0 = okhttp3.C53496aa.this
                okhttp3.y r0 = r0.f132370a
                okhttp3.n r0 = r0.f133192c
                r0.mo111578b(r7)
                return
            L_0x0032:
                r0 = move-exception
                goto L_0x00a0
            L_0x0035:
                r0 = move-exception
                r1 = r0
                r0 = 0
            L_0x0038:
                boolean r2 = r1 instanceof java.io.IOException     // Catch:{ all -> 0x0032 }
                if (r2 == 0) goto L_0x003f
                java.io.IOException r1 = (java.io.IOException) r1     // Catch:{ all -> 0x0032 }
                goto L_0x0045
            L_0x003f:
                java.io.IOException r2 = new java.io.IOException     // Catch:{ all -> 0x0032 }
                r2.<init>(r1)     // Catch:{ all -> 0x0032 }
                r1 = r2
            L_0x0045:
                if (r0 == 0) goto L_0x008f
                okhttp3.internal.g.f r0 = okhttp3.internal.p2689g.C53634f.m114048c()     // Catch:{ all -> 0x0032 }
                r2 = 4
                java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
                java.lang.String r4 = "Callback failure for "
                r3.<init>(r4)     // Catch:{ all -> 0x0032 }
                okhttp3.aa r4 = okhttp3.C53496aa.this     // Catch:{ all -> 0x0032 }
                java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch:{ all -> 0x0032 }
                r5.<init>()     // Catch:{ all -> 0x0032 }
                boolean r6 = r4.mo111250d()     // Catch:{ all -> 0x0032 }
                if (r6 == 0) goto L_0x0063
                java.lang.String r6 = "canceled "
                goto L_0x0065
            L_0x0063:
                java.lang.String r6 = ""
            L_0x0065:
                r5.append(r6)     // Catch:{ all -> 0x0032 }
                boolean r6 = r4.f132374e     // Catch:{ all -> 0x0032 }
                if (r6 == 0) goto L_0x006f
                java.lang.String r6 = "web socket"
                goto L_0x0071
            L_0x006f:
                java.lang.String r6 = "call"
            L_0x0071:
                r5.append(r6)     // Catch:{ all -> 0x0032 }
                java.lang.String r6 = " to "
                r5.append(r6)     // Catch:{ all -> 0x0032 }
                java.lang.String r4 = r4.mo111252f()     // Catch:{ all -> 0x0032 }
                r5.append(r4)     // Catch:{ all -> 0x0032 }
                java.lang.String r4 = r5.toString()     // Catch:{ all -> 0x0032 }
                r3.append(r4)     // Catch:{ all -> 0x0032 }
                java.lang.String r3 = r3.toString()     // Catch:{ all -> 0x0032 }
                r0.mo111504a(r2, r3, r1)     // Catch:{ all -> 0x0032 }
                goto L_0x0028
            L_0x008f:
                okhttp3.aa r0 = okhttp3.C53496aa.this     // Catch:{ all -> 0x0032 }
                okhttp3.p r0 = r0.f132372c     // Catch:{ all -> 0x0032 }
                okhttp3.aa r2 = okhttp3.C53496aa.this     // Catch:{ all -> 0x0032 }
                r0.callFailed(r2, r1)     // Catch:{ all -> 0x0032 }
                okhttp3.f r0 = r7.f132377b     // Catch:{ all -> 0x0032 }
                okhttp3.aa r2 = okhttp3.C53496aa.this     // Catch:{ all -> 0x0032 }
                r0.onFailure(r2, r1)     // Catch:{ all -> 0x0032 }
                goto L_0x0028
            L_0x00a0:
                okhttp3.aa r1 = okhttp3.C53496aa.this
                okhttp3.y r1 = r1.f132370a
                okhttp3.n r1 = r1.f133192c
                r1.mo111578b(r7)
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: okhttp3.C53496aa.C53497a.mo99503a():void");
        }

        C53497a(C53526f fVar) {
            super("OkHttp %s", C53496aa.this.mo111252f());
            this.f132377b = fVar;
        }
    }

    /* renamed from: a */
    public final C53498ab mo111245a() {
        return this.f132373d;
    }

    /* renamed from: c */
    public final void mo111248c() {
        this.f132371b.mo111424a();
    }

    /* renamed from: d */
    public final boolean mo111250d() {
        return this.f132371b.f132777c;
    }

    /* renamed from: e */
    public final C53557g mo111251e() {
        return this.f132371b.f132775a;
    }

    /* renamed from: h */
    private void m113598h() {
        this.f132371b.f132776b = C53634f.m114048c().mo111500a("response.body().close()");
    }

    public final /* synthetic */ Object clone() throws CloneNotSupportedException {
        return m113597a(this.f132370a, this.f132373d, this.f132374e);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final String mo111252f() {
        return this.f132373d.f132378a.mo111623i();
    }

    /* renamed from: b */
    public final C53504ad mo111247b() throws IOException {
        synchronized (this) {
            if (!this.f132375f) {
                this.f132375f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        m113598h();
        this.f132372c.callStart(this);
        try {
            this.f132370a.f133192c.mo111576a(this);
            C53504ad g = mo111253g();
            if (g != null) {
                this.f132370a.f133192c.mo111579b(this);
                return g;
            }
            throw new IOException("Canceled");
        } catch (IOException e) {
            this.f132372c.callFailed(this, e);
            throw e;
        } catch (Throwable th) {
            this.f132370a.f133192c.mo111579b(this);
            throw th;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final C53504ad mo111253g() throws IOException {
        ArrayList arrayList = new ArrayList();
        arrayList.addAll(this.f132370a.f133196g);
        arrayList.add(this.f132371b);
        arrayList.add(new C53562a(this.f132370a.f133200k));
        arrayList.add(new C53534a(this.f132370a.mo111652a()));
        arrayList.add(new C53549a(this.f132370a));
        if (!this.f132374e) {
            arrayList.addAll(this.f132370a.f133197h);
        }
        arrayList.add(new C53563b(this.f132374e));
        C53570g gVar = new C53570g(arrayList, null, null, null, 0, this.f132373d, this, this.f132372c, this.f132370a.f133215z, this.f132370a.f133189A, this.f132370a.f133190B);
        return gVar.mo111417a(this.f132373d);
    }

    /* renamed from: a */
    public final void mo111246a(C53526f fVar) {
        synchronized (this) {
            if (!this.f132375f) {
                this.f132375f = true;
            } else {
                throw new IllegalStateException("Already Executed");
            }
        }
        m113598h();
        this.f132372c.callStart(this);
        this.f132370a.f133192c.mo111575a(new C53497a(fVar));
    }

    /* renamed from: a */
    static C53496aa m113597a(C53682y yVar, C53498ab abVar, boolean z) {
        C53496aa aaVar = new C53496aa(yVar, abVar, z);
        aaVar.f132372c = yVar.f133198i.create(aaVar);
        return aaVar;
    }

    private C53496aa(C53682y yVar, C53498ab abVar, boolean z) {
        this.f132370a = yVar;
        this.f132373d = abVar;
        this.f132374e = z;
        this.f132371b = new C53573j(yVar, z);
    }
}
