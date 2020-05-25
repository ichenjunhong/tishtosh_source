package com.facebook.p929d;

import com.facebook.common.p918b.C13660a;
import com.facebook.common.p920d.C13685h;
import com.facebook.common.p920d.C13689i;
import com.facebook.common.p920d.C13691k;
import java.util.List;

/* renamed from: com.facebook.d.f */
public final class C13749f<T> implements C13691k<C13745c<T>> {

    /* renamed from: a */
    public final List<C13691k<C13745c<T>>> f35751a;

    /* renamed from: com.facebook.d.f$a */
    class C13751a extends C13740a<T> {

        /* renamed from: b */
        private int f35753b;

        /* renamed from: c */
        private C13745c<T> f35754c;

        /* renamed from: d */
        private C13745c<T> f35755d;

        /* renamed from: com.facebook.d.f$a$a */
        class C13752a implements C13748e<T> {
            public final void onCancellation(C13745c<T> cVar) {
            }

            private C13752a() {
            }

            public final void onFailure(C13745c<T> cVar) {
                C13751a.this.mo25684a(cVar);
            }

            public final void onNewResult(C13745c<T> cVar) {
                if (cVar.mo25673c()) {
                    C13751a.this.mo25685b(cVar);
                    return;
                }
                if (cVar.mo25672b()) {
                    C13751a.this.mo25684a(cVar);
                }
            }

            public final void onProgressUpdate(C13745c<T> cVar) {
                C13751a.this.mo25669a(Math.max(C13751a.this.mo25676f(), cVar.mo25676f()));
            }
        }

        /* renamed from: j */
        private synchronized C13745c<T> m27829j() {
            return this.f35755d;
        }

        /* renamed from: g */
        public final boolean mo25677g() {
            synchronized (this) {
                if (!super.mo25677g()) {
                    return false;
                }
                C13745c<T> cVar = this.f35754c;
                this.f35754c = null;
                C13745c<T> cVar2 = this.f35755d;
                this.f35755d = null;
                m27826e(cVar2);
                m27826e(cVar);
                return true;
            }
        }

        /* renamed from: h */
        private boolean m27827h() {
            C13745c cVar;
            C13691k i = m27828i();
            if (i != null) {
                cVar = (C13745c) i.mo23157b();
            } else {
                cVar = null;
            }
            if (!m27824c(cVar) || cVar == null) {
                m27826e(cVar);
                return false;
            }
            cVar.mo25666a(new C13752a(), C13660a.m27612a());
            return true;
        }

        /* renamed from: i */
        private synchronized C13691k<C13745c<T>> m27828i() {
            if (mo25668a() || this.f35753b >= C13749f.this.f35751a.size()) {
                return null;
            }
            List<C13691k<C13745c<T>>> list = C13749f.this.f35751a;
            int i = this.f35753b;
            this.f35753b = i + 1;
            return (C13691k) list.get(i);
        }

        /* renamed from: c */
        public final synchronized boolean mo25673c() {
            boolean z;
            C13745c j = m27829j();
            if (j == null || !j.mo25673c()) {
                z = false;
            } else {
                z = true;
            }
            return z;
        }

        /* renamed from: d */
        public final synchronized T mo25674d() {
            C13745c j = m27829j();
            if (j == null) {
                return null;
            }
            return j.mo25674d();
        }

        /* renamed from: e */
        private static void m27826e(C13745c<T> cVar) {
            if (cVar != null) {
                cVar.mo25677g();
            }
        }

        public C13751a() {
            if (!m27827h()) {
                mo25671a((Throwable) new RuntimeException("No data source supplier or supplier returned null."));
            }
        }

        /* renamed from: c */
        private synchronized boolean m27824c(C13745c<T> cVar) {
            if (mo25668a()) {
                return false;
            }
            this.f35754c = cVar;
            return true;
        }

        /* renamed from: d */
        private synchronized boolean m27825d(C13745c<T> cVar) {
            if (!mo25668a()) {
                if (cVar == this.f35754c) {
                    this.f35754c = null;
                    return true;
                }
            }
            return false;
        }

        /* renamed from: a */
        public final void mo25684a(C13745c<T> cVar) {
            if (m27825d(cVar)) {
                if (cVar != m27829j()) {
                    m27826e(cVar);
                }
                if (!m27827h()) {
                    mo25671a(cVar.mo25675e());
                }
            }
        }

        /* renamed from: b */
        public final void mo25685b(C13745c<T> cVar) {
            C13745c cVar2;
            boolean b = cVar.mo25672b();
            synchronized (this) {
                if (cVar == this.f35754c) {
                    if (cVar != this.f35755d) {
                        if (this.f35755d != null) {
                            if (!b) {
                                cVar2 = null;
                                m27826e(cVar2);
                            }
                        }
                        cVar2 = this.f35755d;
                        this.f35755d = cVar;
                        m27826e(cVar2);
                    }
                }
            }
            if (cVar == m27829j()) {
                mo25670a(null, cVar.mo25672b());
            }
        }
    }

    public final int hashCode() {
        return this.f35751a.hashCode();
    }

    /* renamed from: a */
    public final C13745c<T> mo23157b() {
        return new C13751a();
    }

    public final String toString() {
        return C13685h.m27644a(this).mo25581a("list", (Object) this.f35751a).toString();
    }

    /* renamed from: a */
    public static <T> C13749f<T> m27821a(List<C13691k<C13745c<T>>> list) {
        return new C13749f<>(list);
    }

    private C13749f(List<C13691k<C13745c<T>>> list) {
        C13689i.m27656a(!list.isEmpty(), (Object) "List of suppliers is empty!");
        this.f35751a = list;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13749f)) {
            return false;
        }
        return C13685h.m27645a(this.f35751a, ((C13749f) obj).f35751a);
    }
}
