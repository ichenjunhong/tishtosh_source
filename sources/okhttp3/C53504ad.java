package okhttp3;

import java.io.Closeable;
import java.util.List;
import okhttp3.C53671s.C53672a;

/* renamed from: okhttp3.ad */
public final class C53504ad implements Closeable {

    /* renamed from: a */
    public final C53498ab f132398a;

    /* renamed from: b */
    public final C53685z f132399b;

    /* renamed from: c */
    public final int f132400c;

    /* renamed from: d */
    public final String f132401d;

    /* renamed from: e */
    public final C53670r f132402e;

    /* renamed from: f */
    public final C53671s f132403f;

    /* renamed from: g */
    public final C53506ae f132404g;

    /* renamed from: h */
    public final C53504ad f132405h;

    /* renamed from: i */
    public final C53504ad f132406i;

    /* renamed from: j */
    public final C53504ad f132407j;

    /* renamed from: k */
    public final long f132408k;

    /* renamed from: l */
    public final long f132409l;

    /* renamed from: m */
    private volatile C53522d f132410m;

    /* renamed from: okhttp3.ad$a */
    public static class C53505a {

        /* renamed from: a */
        C53498ab f132411a;

        /* renamed from: b */
        C53685z f132412b;

        /* renamed from: c */
        int f132413c;

        /* renamed from: d */
        String f132414d;

        /* renamed from: e */
        C53670r f132415e;

        /* renamed from: f */
        public C53672a f132416f;

        /* renamed from: g */
        C53506ae f132417g;

        /* renamed from: h */
        C53504ad f132418h;

        /* renamed from: i */
        C53504ad f132419i;

        /* renamed from: j */
        public C53504ad f132420j;

        /* renamed from: k */
        long f132421k;

        /* renamed from: l */
        long f132422l;

        /* renamed from: a */
        public final C53505a mo111290a(C53685z zVar) {
            this.f132412b = zVar;
            return this;
        }

        /* renamed from: a */
        public final C53504ad mo111291a() {
            if (this.f132411a == null) {
                throw new IllegalStateException("request == null");
            } else if (this.f132412b == null) {
                throw new IllegalStateException("protocol == null");
            } else if (this.f132413c < 0) {
                StringBuilder sb = new StringBuilder("code < 0: ");
                sb.append(this.f132413c);
                throw new IllegalStateException(sb.toString());
            } else if (this.f132414d != null) {
                return new C53504ad(this);
            } else {
                throw new IllegalStateException("message == null");
            }
        }

        public C53505a() {
            this.f132413c = -1;
            this.f132416f = new C53672a();
        }

        /* renamed from: a */
        public final C53505a mo111281a(int i) {
            this.f132413c = i;
            return this;
        }

        /* renamed from: b */
        public final C53505a mo111292b(long j) {
            this.f132422l = j;
            return this;
        }

        /* renamed from: a */
        public final C53505a mo111282a(long j) {
            this.f132421k = j;
            return this;
        }

        /* renamed from: a */
        public final C53505a mo111283a(String str) {
            this.f132414d = str;
            return this;
        }

        /* renamed from: b */
        public final C53505a mo111293b(C53504ad adVar) {
            if (adVar != null) {
                m113632a("cacheResponse", adVar);
            }
            this.f132419i = adVar;
            return this;
        }

        C53505a(C53504ad adVar) {
            this.f132413c = -1;
            this.f132411a = adVar.f132398a;
            this.f132412b = adVar.f132399b;
            this.f132413c = adVar.f132400c;
            this.f132414d = adVar.f132401d;
            this.f132415e = adVar.f132402e;
            this.f132416f = adVar.f132403f.mo111598d();
            this.f132417g = adVar.f132404g;
            this.f132418h = adVar.f132405h;
            this.f132419i = adVar.f132406i;
            this.f132420j = adVar.f132407j;
            this.f132421k = adVar.f132408k;
            this.f132422l = adVar.f132409l;
        }

        /* renamed from: a */
        public final C53505a mo111285a(C53498ab abVar) {
            this.f132411a = abVar;
            return this;
        }

        /* renamed from: a */
        public final C53505a mo111286a(C53504ad adVar) {
            if (adVar != null) {
                m113632a("networkResponse", adVar);
            }
            this.f132418h = adVar;
            return this;
        }

        /* renamed from: a */
        public final C53505a mo111287a(C53506ae aeVar) {
            this.f132417g = aeVar;
            return this;
        }

        /* renamed from: a */
        public final C53505a mo111288a(C53670r rVar) {
            this.f132415e = rVar;
            return this;
        }

        /* renamed from: a */
        public final C53505a mo111289a(C53671s sVar) {
            this.f132416f = sVar.mo111598d();
            return this;
        }

        /* renamed from: a */
        public final C53505a mo111284a(String str, String str2) {
            this.f132416f.mo111604a(str, str2);
            return this;
        }

        /* renamed from: a */
        private static void m113632a(String str, C53504ad adVar) {
            if (adVar.f132404g != null) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(".body != null");
                throw new IllegalArgumentException(sb.toString());
            } else if (adVar.f132405h != null) {
                StringBuilder sb2 = new StringBuilder();
                sb2.append(str);
                sb2.append(".networkResponse != null");
                throw new IllegalArgumentException(sb2.toString());
            } else if (adVar.f132406i != null) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(str);
                sb3.append(".cacheResponse != null");
                throw new IllegalArgumentException(sb3.toString());
            } else if (adVar.f132407j != null) {
                StringBuilder sb4 = new StringBuilder();
                sb4.append(str);
                sb4.append(".priorResponse != null");
                throw new IllegalArgumentException(sb4.toString());
            }
        }
    }

    /* renamed from: b */
    public final C53505a mo111277b() {
        return new C53505a(this);
    }

    /* renamed from: c */
    public final C53522d mo111278c() {
        C53522d dVar = this.f132410m;
        if (dVar != null) {
            return dVar;
        }
        C53522d a = C53522d.m113673a(this.f132403f);
        this.f132410m = a;
        return a;
    }

    /* renamed from: a */
    public final boolean mo111275a() {
        if (this.f132400c < 200 || this.f132400c >= 300) {
            return false;
        }
        return true;
    }

    public final void close() {
        if (this.f132404g != null) {
            this.f132404g.close();
            return;
        }
        throw new IllegalStateException("response is not eligible for a body and must not be closed");
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Response{protocol=");
        sb.append(this.f132399b);
        sb.append(", code=");
        sb.append(this.f132400c);
        sb.append(", message=");
        sb.append(this.f132401d);
        sb.append(", url=");
        sb.append(this.f132398a.f132378a);
        sb.append('}');
        return sb.toString();
    }

    /* renamed from: a */
    public final List<String> mo111274a(String str) {
        return this.f132403f.mo111595b(str);
    }

    /* renamed from: b */
    public final String mo111276b(String str) {
        return mo111273a(str, null);
    }

    C53504ad(C53505a aVar) {
        this.f132398a = aVar.f132411a;
        this.f132399b = aVar.f132412b;
        this.f132400c = aVar.f132413c;
        this.f132401d = aVar.f132414d;
        this.f132402e = aVar.f132415e;
        this.f132403f = aVar.f132416f.mo111605a();
        this.f132404g = aVar.f132417g;
        this.f132405h = aVar.f132418h;
        this.f132406i = aVar.f132419i;
        this.f132407j = aVar.f132420j;
        this.f132408k = aVar.f132421k;
        this.f132409l = aVar.f132422l;
    }

    /* renamed from: a */
    public final String mo111273a(String str, String str2) {
        String a = this.f132403f.mo111593a(str);
        if (a != null) {
            return a;
        }
        return str2;
    }
}
