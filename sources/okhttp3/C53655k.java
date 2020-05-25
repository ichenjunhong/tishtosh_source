package okhttp3;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.internal.C53559c;

/* renamed from: okhttp3.k */
public final class C53655k {

    /* renamed from: a */
    public static final C53655k f133083a;

    /* renamed from: b */
    public static final C53655k f133084b = new C53656a(f133083a).mo111561a(C53510ag.TLS_1_0).mo111559a(true).mo111562a();

    /* renamed from: c */
    public static final C53655k f133085c = new C53656a(false).mo111562a();

    /* renamed from: h */
    private static final C53530h[] f133086h = {C53530h.f132551aX, C53530h.f132582bb, C53530h.f132552aY, C53530h.f132583bc, C53530h.f132589bi, C53530h.f132588bh, C53530h.f132536aI, C53530h.f132537aJ, C53530h.f132560ag, C53530h.f132561ah, C53530h.f132505E, C53530h.f132509I, C53530h.f132597i};

    /* renamed from: d */
    public final boolean f133087d;

    /* renamed from: e */
    public final boolean f133088e;

    /* renamed from: f */
    final String[] f133089f;

    /* renamed from: g */
    final String[] f133090g;

    /* renamed from: okhttp3.k$a */
    public static final class C53656a {

        /* renamed from: a */
        boolean f133091a;

        /* renamed from: b */
        String[] f133092b;

        /* renamed from: c */
        String[] f133093c;

        /* renamed from: d */
        boolean f133094d;

        /* renamed from: a */
        public final C53655k mo111562a() {
            return new C53655k(this);
        }

        C53656a(boolean z) {
            this.f133091a = z;
        }

        /* renamed from: a */
        public final C53656a mo111559a(boolean z) {
            if (this.f133091a) {
                this.f133094d = true;
                return this;
            }
            throw new IllegalStateException("no TLS extensions for cleartext connections");
        }

        public C53656a(C53655k kVar) {
            this.f133091a = kVar.f133087d;
            this.f133092b = kVar.f133089f;
            this.f133093c = kVar.f133090g;
            this.f133094d = kVar.f133088e;
        }

        /* renamed from: a */
        public final C53656a mo111560a(String... strArr) {
            if (!this.f133091a) {
                throw new IllegalStateException("no cipher suites for cleartext connections");
            } else if (strArr.length != 0) {
                this.f133092b = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one cipher suite is required");
            }
        }

        /* renamed from: b */
        public final C53656a mo111563b(String... strArr) {
            if (!this.f133091a) {
                throw new IllegalStateException("no TLS versions for cleartext connections");
            } else if (strArr.length != 0) {
                this.f133093c = (String[]) strArr.clone();
                return this;
            } else {
                throw new IllegalArgumentException("At least one TLS version is required");
            }
        }

        /* renamed from: a */
        public final C53656a mo111561a(C53510ag... agVarArr) {
            if (this.f133091a) {
                String[] strArr = new String[agVarArr.length];
                for (int i = 0; i < agVarArr.length; i++) {
                    strArr[i] = agVarArr[i].f132434a;
                }
                return mo111563b(strArr);
            }
            throw new IllegalStateException("no TLS versions for cleartext connections");
        }
    }

    public final int hashCode() {
        if (this.f133087d) {
            return ((((Arrays.hashCode(this.f133089f) + 527) * 31) + Arrays.hashCode(this.f133090g)) * 31) + (this.f133088e ^ true ? 1 : 0);
        }
        return 17;
    }

    /* renamed from: a */
    private List<C53510ag> m114107a() {
        if (this.f133090g == null) {
            return null;
        }
        String[] strArr = this.f133090g;
        ArrayList arrayList = new ArrayList(strArr.length);
        for (String forJavaName : strArr) {
            arrayList.add(C53510ag.forJavaName(forJavaName));
        }
        return Collections.unmodifiableList(arrayList);
    }

    public final String toString() {
        String str;
        String str2;
        List list;
        if (!this.f133087d) {
            return "ConnectionSpec()";
        }
        if (this.f133089f != null) {
            if (this.f133089f != null) {
                String[] strArr = this.f133089f;
                ArrayList arrayList = new ArrayList(strArr.length);
                for (String a : strArr) {
                    arrayList.add(C53530h.m113689a(a));
                }
                list = Collections.unmodifiableList(arrayList);
            } else {
                list = null;
            }
            str = list.toString();
        } else {
            str = "[all enabled]";
        }
        if (this.f133090g != null) {
            str2 = m114107a().toString();
        } else {
            str2 = "[all enabled]";
        }
        StringBuilder sb = new StringBuilder("ConnectionSpec(cipherSuites=");
        sb.append(str);
        sb.append(", tlsVersions=");
        sb.append(str2);
        sb.append(", supportsTlsExtensions=");
        sb.append(this.f133088e);
        sb.append(")");
        return sb.toString();
    }

    static {
        C53656a aVar = new C53656a(true);
        C53530h[] hVarArr = f133086h;
        if (aVar.f133091a) {
            String[] strArr = new String[hVarArr.length];
            for (int i = 0; i < hVarArr.length; i++) {
                strArr[i] = hVarArr[i].f132615bj;
            }
            f133083a = aVar.mo111560a(strArr).mo111561a(C53510ag.TLS_1_3, C53510ag.TLS_1_2, C53510ag.TLS_1_1, C53510ag.TLS_1_0).mo111559a(true).mo111562a();
            return;
        }
        throw new IllegalStateException("no cipher suites for cleartext connections");
    }

    C53655k(C53656a aVar) {
        this.f133087d = aVar.f133091a;
        this.f133089f = aVar.f133092b;
        this.f133090g = aVar.f133093c;
        this.f133088e = aVar.f133094d;
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C53655k)) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        C53655k kVar = (C53655k) obj;
        if (this.f133087d != kVar.f133087d) {
            return false;
        }
        if (!this.f133087d || (Arrays.equals(this.f133089f, kVar.f133089f) && Arrays.equals(this.f133090g, kVar.f133090g) && this.f133088e == kVar.f133088e)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo111555a(SSLSocket sSLSocket) {
        if (!this.f133087d) {
            return false;
        }
        if (this.f133090g != null && !C53559c.m113813b(C53559c.f132740h, this.f133090g, sSLSocket.getEnabledProtocols())) {
            return false;
        }
        if (this.f133089f == null || C53559c.m113813b(C53530h.f132527a, this.f133089f, sSLSocket.getEnabledCipherSuites())) {
            return true;
        }
        return false;
    }
}
