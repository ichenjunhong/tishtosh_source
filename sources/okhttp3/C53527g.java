package okhttp3;

import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import javax.net.ssl.SSLPeerUnverifiedException;
import okhttp3.internal.C53559c;
import okhttp3.internal.p2690h.C53637c;
import okio.ByteString;

/* renamed from: okhttp3.g */
public final class C53527g {

    /* renamed from: a */
    public static final C53527g f132493a = new C53528a().mo111330a();

    /* renamed from: b */
    final Set<C53529b> f132494b;

    /* renamed from: c */
    final C53637c f132495c;

    /* renamed from: okhttp3.g$a */
    public static final class C53528a {

        /* renamed from: a */
        private final List<C53529b> f132496a = new ArrayList();

        /* renamed from: a */
        public final C53527g mo111330a() {
            return new C53527g(new LinkedHashSet(this.f132496a), null);
        }

        /* renamed from: a */
        public final C53528a mo111329a(String str, String... strArr) {
            for (int i = 0; i <= 0; i++) {
                this.f132496a.add(new C53529b(str, strArr[0]));
            }
            return this;
        }
    }

    /* renamed from: okhttp3.g$b */
    static final class C53529b {

        /* renamed from: a */
        final String f132497a;

        /* renamed from: b */
        final String f132498b;

        /* renamed from: c */
        final String f132499c;

        /* renamed from: d */
        final ByteString f132500d;

        public final int hashCode() {
            return ((((this.f132497a.hashCode() + 527) * 31) + this.f132499c.hashCode()) * 31) + this.f132500d.hashCode();
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f132499c);
            sb.append(this.f132500d.base64());
            return sb.toString();
        }

        public final boolean equals(Object obj) {
            if (obj instanceof C53529b) {
                C53529b bVar = (C53529b) obj;
                if (this.f132497a.equals(bVar.f132497a) && this.f132499c.equals(bVar.f132499c) && this.f132500d.equals(bVar.f132500d)) {
                    return true;
                }
            }
            return false;
        }

        C53529b(String str, String str2) {
            String str3;
            this.f132497a = str;
            if (str.startsWith("*.")) {
                StringBuilder sb = new StringBuilder("http://");
                sb.append(str.substring(2));
                str3 = C53673t.m114180f(sb.toString()).f133143d;
            } else {
                StringBuilder sb2 = new StringBuilder("http://");
                sb2.append(str);
                str3 = C53673t.m114180f(sb2.toString()).f133143d;
            }
            this.f132498b = str3;
            if (str2.startsWith("sha1/")) {
                this.f132499c = "sha1/";
                this.f132500d = ByteString.decodeBase64(str2.substring(5));
            } else if (str2.startsWith("sha256/")) {
                this.f132499c = "sha256/";
                this.f132500d = ByteString.decodeBase64(str2.substring(7));
            } else {
                StringBuilder sb3 = new StringBuilder("pins must start with 'sha256/' or 'sha1/': ");
                sb3.append(str2);
                throw new IllegalArgumentException(sb3.toString());
            }
            if (this.f132500d == null) {
                StringBuilder sb4 = new StringBuilder("pins must be base64: ");
                sb4.append(str2);
                throw new IllegalArgumentException(sb4.toString());
            }
        }
    }

    public final int hashCode() {
        int i;
        if (this.f132495c != null) {
            i = this.f132495c.hashCode();
        } else {
            i = 0;
        }
        return (i * 31) + this.f132494b.hashCode();
    }

    /* renamed from: a */
    private static ByteString m113685a(X509Certificate x509Certificate) {
        return ByteString.m114277of(x509Certificate.getPublicKey().getEncoded()).sha256();
    }

    /* renamed from: a */
    public static String m113684a(Certificate certificate) {
        if (certificate instanceof X509Certificate) {
            StringBuilder sb = new StringBuilder("sha256/");
            sb.append(m113685a((X509Certificate) certificate).base64());
            return sb.toString();
        }
        throw new IllegalArgumentException("Certificate pinning requires X509 certificates");
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C53527g) {
            C53527g gVar = (C53527g) obj;
            if (C53559c.m113808a((Object) this.f132495c, (Object) gVar.f132495c) && this.f132494b.equals(gVar.f132494b)) {
                return true;
            }
        }
        return false;
    }

    C53527g(Set<C53529b> set, C53637c cVar) {
        this.f132494b = set;
        this.f132495c = cVar;
    }

    /* renamed from: a */
    public final void mo111326a(String str, List<Certificate> list) throws SSLPeerUnverifiedException {
        int i;
        List<Certificate> list2;
        String str2 = str;
        List emptyList = Collections.emptyList();
        Iterator it = this.f132494b.iterator();
        List list3 = emptyList;
        while (true) {
            i = 0;
            if (!it.hasNext()) {
                break;
            }
            C53529b bVar = (C53529b) it.next();
            if (bVar.f132497a.startsWith("*.")) {
                int indexOf = str2.indexOf(46);
                if ((str.length() - indexOf) - 1 == bVar.f132498b.length()) {
                    if (str.regionMatches(false, indexOf + 1, bVar.f132498b, 0, bVar.f132498b.length())) {
                        i = 1;
                    }
                }
            } else {
                i = str2.equals(bVar.f132498b);
            }
            if (i != 0) {
                if (list3.isEmpty()) {
                    list3 = new ArrayList();
                }
                list3.add(bVar);
            }
        }
        if (!list3.isEmpty()) {
            if (this.f132495c != null) {
                list2 = this.f132495c.mo111510a(list, str2);
            } else {
                list2 = list;
            }
            int size = list2.size();
            for (int i2 = 0; i2 < size; i2++) {
                X509Certificate x509Certificate = (X509Certificate) list2.get(i2);
                int size2 = list3.size();
                ByteString byteString = null;
                ByteString byteString2 = null;
                for (int i3 = 0; i3 < size2; i3++) {
                    C53529b bVar2 = (C53529b) list3.get(i3);
                    if (bVar2.f132499c.equals("sha256/")) {
                        if (byteString == null) {
                            byteString = m113685a(x509Certificate);
                        }
                        if (bVar2.f132500d.equals(byteString)) {
                            return;
                        }
                    } else if (bVar2.f132499c.equals("sha1/")) {
                        if (byteString2 == null) {
                            byteString2 = ByteString.m114277of(x509Certificate.getPublicKey().getEncoded()).sha1();
                        }
                        if (bVar2.f132500d.equals(byteString2)) {
                            return;
                        }
                    } else {
                        StringBuilder sb = new StringBuilder("unsupported hashAlgorithm: ");
                        sb.append(bVar2.f132499c);
                        throw new AssertionError(sb.toString());
                    }
                }
            }
            StringBuilder sb2 = new StringBuilder("Certificate pinning failure!");
            sb2.append("\n  Peer certificate chain:");
            int size3 = list2.size();
            for (int i4 = 0; i4 < size3; i4++) {
                X509Certificate x509Certificate2 = (X509Certificate) list2.get(i4);
                sb2.append("\n    ");
                sb2.append(m113684a((Certificate) x509Certificate2));
                sb2.append(": ");
                sb2.append(x509Certificate2.getSubjectDN().getName());
            }
            sb2.append("\n  Pinned certificates for ");
            sb2.append(str2);
            sb2.append(":");
            int size4 = list3.size();
            while (i < size4) {
                C53529b bVar3 = (C53529b) list3.get(i);
                sb2.append("\n    ");
                sb2.append(bVar3);
                i++;
            }
            throw new SSLPeerUnverifiedException(sb2.toString());
        }
    }
}
