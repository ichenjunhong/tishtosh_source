package okhttp3;

import okhttp3.C53671s.C53672a;
import okhttp3.internal.p2685c.C53569f;

/* renamed from: okhttp3.ab */
public final class C53498ab {

    /* renamed from: a */
    public final C53673t f132378a;

    /* renamed from: b */
    public final String f132379b;

    /* renamed from: c */
    public final C53671s f132380c;

    /* renamed from: d */
    public final C53500ac f132381d;

    /* renamed from: e */
    public final Object f132382e;

    /* renamed from: f */
    public String f132383f;

    /* renamed from: g */
    private volatile C53522d f132384g;

    /* renamed from: okhttp3.ab$a */
    public static class C53499a {

        /* renamed from: a */
        C53673t f132385a;

        /* renamed from: b */
        String f132386b;

        /* renamed from: c */
        C53672a f132387c;

        /* renamed from: d */
        C53500ac f132388d;

        /* renamed from: e */
        Object f132389e;

        /* renamed from: a */
        public final C53499a mo111260a() {
            return mo111264a("GET", (C53500ac) null);
        }

        /* renamed from: b */
        public final C53499a mo111269b() {
            return mo111264a("HEAD", (C53500ac) null);
        }

        public C53499a() {
            this.f132386b = "GET";
            this.f132387c = new C53672a();
        }

        /* renamed from: c */
        public final C53498ab mo111272c() {
            if (this.f132385a != null) {
                return new C53498ab(this);
            }
            throw new IllegalStateException("url == null");
        }

        /* renamed from: a */
        public final C53499a mo111261a(Object obj) {
            this.f132389e = obj;
            return this;
        }

        /* renamed from: b */
        public final C53499a mo111270b(String str) {
            this.f132387c.mo111606b(str);
            return this;
        }

        C53499a(C53498ab abVar) {
            this.f132385a = abVar.f132378a;
            this.f132386b = abVar.f132379b;
            this.f132388d = abVar.f132381d;
            this.f132389e = abVar.f132382e;
            this.f132387c = abVar.f132380c.mo111598d();
        }

        /* renamed from: a */
        public final C53499a mo111265a(C53500ac acVar) {
            return mo111264a("POST", acVar);
        }

        /* renamed from: a */
        public final C53499a mo111266a(C53522d dVar) {
            String dVar2 = dVar.toString();
            if (dVar2.isEmpty()) {
                return mo111270b("Cache-Control");
            }
            return mo111263a("Cache-Control", dVar2);
        }

        /* renamed from: a */
        public final C53499a mo111262a(String str) {
            if (str != null) {
                if (str.regionMatches(true, 0, "ws:", 0, 3)) {
                    StringBuilder sb = new StringBuilder("http:");
                    sb.append(str.substring(3));
                    str = sb.toString();
                } else {
                    if (str.regionMatches(true, 0, "wss:", 0, 4)) {
                        StringBuilder sb2 = new StringBuilder("https:");
                        sb2.append(str.substring(4));
                        str = sb2.toString();
                    }
                }
                C53673t f = C53673t.m114180f(str);
                if (f != null) {
                    return mo111268a(f);
                }
                StringBuilder sb3 = new StringBuilder("unexpected url: ");
                sb3.append(str);
                throw new IllegalArgumentException(sb3.toString());
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: a */
        public final C53499a mo111267a(C53671s sVar) {
            this.f132387c = sVar.mo111598d();
            return this;
        }

        /* renamed from: a */
        public final C53499a mo111268a(C53673t tVar) {
            if (tVar != null) {
                this.f132385a = tVar;
                return this;
            }
            throw new NullPointerException("url == null");
        }

        /* renamed from: a */
        public final C53499a mo111263a(String str, String str2) {
            this.f132387c.mo111609c(str, str2);
            return this;
        }

        /* renamed from: b */
        public final C53499a mo111271b(String str, String str2) {
            this.f132387c.mo111604a(str, str2);
            return this;
        }

        /* renamed from: a */
        public final C53499a mo111264a(String str, C53500ac acVar) {
            if (str == null) {
                throw new NullPointerException("method == null");
            } else if (str.length() == 0) {
                throw new IllegalArgumentException("method.length() == 0");
            } else if (acVar != null && !C53569f.m113839c(str)) {
                StringBuilder sb = new StringBuilder("method ");
                sb.append(str);
                sb.append(" must not have a request body.");
                throw new IllegalArgumentException(sb.toString());
            } else if (acVar != null || !C53569f.m113838b(str)) {
                this.f132386b = str;
                this.f132388d = acVar;
                return this;
            } else {
                StringBuilder sb2 = new StringBuilder("method ");
                sb2.append(str);
                sb2.append(" must have a request body.");
                throw new IllegalArgumentException(sb2.toString());
            }
        }
    }

    /* renamed from: c */
    public final boolean mo111258c() {
        return this.f132378a.mo111613c();
    }

    /* renamed from: a */
    public final C53499a mo111256a() {
        return new C53499a(this);
    }

    /* renamed from: b */
    public final C53522d mo111257b() {
        C53522d dVar = this.f132384g;
        if (dVar != null) {
            return dVar;
        }
        C53522d a = C53522d.m113673a(this.f132380c);
        this.f132384g = a;
        return a;
    }

    public final String toString() {
        Object obj;
        StringBuilder sb = new StringBuilder("Request{method=");
        sb.append(this.f132379b);
        sb.append(", url=");
        sb.append(this.f132378a);
        sb.append(", tag=");
        if (this.f132382e != this) {
            obj = this.f132382e;
        } else {
            obj = null;
        }
        sb.append(obj);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final String mo111255a(String str) {
        return this.f132380c.mo111593a(str);
    }

    C53498ab(C53499a aVar) {
        Object obj;
        this.f132378a = aVar.f132385a;
        this.f132379b = aVar.f132386b;
        this.f132380c = aVar.f132387c.mo111605a();
        this.f132381d = aVar.f132388d;
        if (aVar.f132389e != null) {
            obj = aVar.f132389e;
        } else {
            obj = this;
        }
        this.f132382e = obj;
    }
}
