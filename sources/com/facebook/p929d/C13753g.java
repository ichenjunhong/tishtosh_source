package com.facebook.p929d;

import com.facebook.common.p918b.C13660a;
import com.facebook.common.p920d.C13685h;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13691k;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: com.facebook.d.g */
public final class C13753g<T> implements C13691k<C13745c<T>> {

    /* renamed from: a */
    public final List<C13691k<C13745c<T>>> f35757a;

    /* renamed from: b */
    public final boolean f35758b;

    /* renamed from: com.facebook.d.g$a */
    class C13754a extends C13740a<T> {

        /* renamed from: b */
        private ArrayList<C13745c<T>> f35760b;

        /* renamed from: c */
        private int f35761c;

        /* renamed from: d */
        private int f35762d;

        /* renamed from: e */
        private AtomicInteger f35763e;

        /* renamed from: f */
        private Throwable f35764f;

        /* renamed from: com.facebook.d.g$a$a */
        class C13755a implements C13748e<T> {

            /* renamed from: b */
            private int f35766b;

            public final void onCancellation(C13745c<T> cVar) {
            }

            public final void onFailure(C13745c<T> cVar) {
                C13754a.this.mo25690b(this.f35766b, cVar);
            }

            public final void onProgressUpdate(C13745c<T> cVar) {
                if (this.f35766b == 0) {
                    C13754a.this.mo25669a(cVar.mo25676f());
                }
            }

            public final void onNewResult(C13745c<T> cVar) {
                if (cVar.mo25673c()) {
                    C13754a.this.mo25689a(this.f35766b, cVar);
                    return;
                }
                if (cVar.mo25672b()) {
                    C13754a.this.mo25690b(this.f35766b, cVar);
                }
            }

            public C13755a(int i) {
                this.f35766b = i;
            }
        }

        /* renamed from: i */
        private synchronized C13745c<T> m27841i() {
            return m27836a(this.f35761c);
        }

        /* renamed from: j */
        private void m27842j() {
            if (this.f35763e.incrementAndGet() == this.f35762d && this.f35764f != null) {
                mo25671a(this.f35764f);
            }
        }

        /* renamed from: d */
        public final synchronized T mo25674d() {
            if (C13753g.this.f35758b) {
                m27840h();
            }
            C13745c i = m27841i();
            if (i == null) {
                return null;
            }
            return i.mo25674d();
        }

        /* renamed from: c */
        public final synchronized boolean mo25673c() {
            boolean z;
            if (C13753g.this.f35758b) {
                m27840h();
            }
            C13745c i = m27841i();
            if (i == null || !i.mo25673c()) {
                z = false;
            } else {
                z = true;
            }
            return z;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x0019, code lost:
            if (r0 == null) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:13:0x001f, code lost:
            if (r1 >= r0.size()) goto L_0x002d;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:14:0x0021, code lost:
            m27837a((com.facebook.p929d.C13745c) r0.get(r1));
            r1 = r1 + 1;
         */
        /* JADX WARNING: Code restructure failed: missing block: B:16:0x002e, code lost:
            return true;
         */
        /* renamed from: g */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean mo25677g() {
            /*
                r3 = this;
                com.facebook.d.g r0 = com.facebook.p929d.C13753g.this
                boolean r0 = r0.f35758b
                if (r0 == 0) goto L_0x0009
                r3.m27840h()
            L_0x0009:
                monitor-enter(r3)
                boolean r0 = super.mo25677g()     // Catch:{ all -> 0x002f }
                r1 = 0
                if (r0 != 0) goto L_0x0013
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                return r1
            L_0x0013:
                java.util.ArrayList<com.facebook.d.c<T>> r0 = r3.f35760b     // Catch:{ all -> 0x002f }
                r2 = 0
                r3.f35760b = r2     // Catch:{ all -> 0x002f }
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                if (r0 == 0) goto L_0x002d
            L_0x001b:
                int r2 = r0.size()
                if (r1 >= r2) goto L_0x002d
                java.lang.Object r2 = r0.get(r1)
                com.facebook.d.c r2 = (com.facebook.p929d.C13745c) r2
                m27837a(r2)
                int r1 = r1 + 1
                goto L_0x001b
            L_0x002d:
                r0 = 1
                return r0
            L_0x002f:
                r0 = move-exception
                monitor-exit(r3)     // Catch:{ all -> 0x002f }
                throw r0
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p929d.C13753g.C13754a.mo25677g():boolean");
        }

        /* renamed from: h */
        private void m27840h() {
            if (this.f35763e == null) {
                synchronized (this) {
                    if (this.f35763e == null) {
                        this.f35763e = new AtomicInteger(0);
                        int size = C13753g.this.f35757a.size();
                        this.f35762d = size;
                        this.f35761c = size;
                        this.f35760b = new ArrayList<>(size);
                        for (int i = 0; i < size; i++) {
                            C13745c cVar = (C13745c) ((C13691k) C13753g.this.f35757a.get(i)).mo23157b();
                            this.f35760b.add(cVar);
                            cVar.mo25666a(new C13755a(i), C13660a.m27612a());
                            if (cVar.mo25673c()) {
                                break;
                            }
                        }
                    }
                }
            }
        }

        /* renamed from: a */
        private static void m27837a(C13745c<T> cVar) {
            if (cVar != null) {
                cVar.mo25677g();
            }
        }

        public C13754a() {
            if (!C13753g.this.f35758b) {
                m27840h();
            }
        }

        /* renamed from: a */
        private synchronized C13745c<T> m27836a(int i) {
            if (this.f35760b == null || i >= this.f35760b.size()) {
                return null;
            }
            return (C13745c) this.f35760b.get(i);
        }

        /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
            return null;
         */
        /* renamed from: b */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        private synchronized com.facebook.p929d.C13745c<T> m27838b(int r3) {
            /*
                r2 = this;
                monitor-enter(r2)
                java.util.ArrayList<com.facebook.d.c<T>> r0 = r2.f35760b     // Catch:{ all -> 0x001a }
                r1 = 0
                if (r0 == 0) goto L_0x0018
                java.util.ArrayList<com.facebook.d.c<T>> r0 = r2.f35760b     // Catch:{ all -> 0x001a }
                int r0 = r0.size()     // Catch:{ all -> 0x001a }
                if (r3 >= r0) goto L_0x0018
                java.util.ArrayList<com.facebook.d.c<T>> r0 = r2.f35760b     // Catch:{ all -> 0x001a }
                java.lang.Object r3 = r0.set(r3, r1)     // Catch:{ all -> 0x001a }
                com.facebook.d.c r3 = (com.facebook.p929d.C13745c) r3     // Catch:{ all -> 0x001a }
                monitor-exit(r2)
                return r3
            L_0x0018:
                monitor-exit(r2)
                return r1
            L_0x001a:
                r3 = move-exception
                monitor-exit(r2)
                throw r3
            */
            throw new UnsupportedOperationException("Method not decompiled: com.facebook.p929d.C13753g.C13754a.m27838b(int):com.facebook.d.c");
        }

        /* renamed from: c */
        private synchronized C13745c<T> m27839c(int i, C13745c<T> cVar) {
            if (cVar == m27841i()) {
                return null;
            }
            if (cVar != m27836a(i)) {
                return cVar;
            }
            return m27838b(i);
        }

        /* renamed from: b */
        public final void mo25690b(int i, C13745c<T> cVar) {
            m27837a(m27839c(i, cVar));
            if (i == 0) {
                this.f35764f = cVar.mo25675e();
            }
            m27842j();
        }

        /* renamed from: a */
        public final void mo25689a(int i, C13745c<T> cVar) {
            boolean z;
            boolean b = cVar.mo25672b();
            synchronized (this) {
                int i2 = this.f35761c;
                if (cVar == m27836a(i)) {
                    if (i != this.f35761c) {
                        if (m27841i() == null || (b && i < this.f35761c)) {
                            this.f35761c = i;
                            i2 = i;
                        }
                        for (int i3 = this.f35761c; i3 > i2; i3--) {
                            m27837a(m27838b(i3));
                        }
                    }
                }
            }
            if (cVar == m27841i()) {
                if (i != 0 || !cVar.mo25672b()) {
                    z = false;
                } else {
                    z = true;
                }
                mo25670a(null, z);
            }
            m27842j();
        }
    }

    /* renamed from: b */
    public final /* synthetic */ Object mo23157b() {
        return new C13754a();
    }

    public final int hashCode() {
        return this.f35757a.hashCode();
    }

    public final String toString() {
        return C13685h.m27644a(this).mo25581a("list", (Object) this.f35757a).toString();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13753g)) {
            return false;
        }
        return C13685h.m27645a(this.f35757a, ((C13753g) obj).f35757a);
    }

    public C13753g(List<C13691k<C13745c<T>>> list, boolean z) {
        C13689i.m27656a(!list.isEmpty(), (Object) "List of suppliers is empty!");
        this.f35757a = list;
        this.f35758b = z;
    }
}
