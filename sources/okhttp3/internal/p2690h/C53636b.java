package okhttp3.internal.p2690h;

import java.security.cert.X509Certificate;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import javax.security.auth.x500.X500Principal;

/* renamed from: okhttp3.internal.h.b */
public final class C53636b implements C53639e {

    /* renamed from: a */
    private final Map<X500Principal, Set<X509Certificate>> f133007a = new LinkedHashMap();

    public final int hashCode() {
        return this.f133007a.hashCode();
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C53636b) || !((C53636b) obj).f133007a.equals(this.f133007a)) {
            return false;
        }
        return true;
    }

    public C53636b(X509Certificate... x509CertificateArr) {
        for (X509Certificate x509Certificate : x509CertificateArr) {
            X500Principal subjectX500Principal = x509Certificate.getSubjectX500Principal();
            Set set = (Set) this.f133007a.get(subjectX500Principal);
            if (set == null) {
                set = new LinkedHashSet(1);
                this.f133007a.put(subjectX500Principal, set);
            }
            set.add(x509Certificate);
        }
    }

    /* renamed from: a */
    public final X509Certificate mo111513a(X509Certificate x509Certificate) {
        Set<X509Certificate> set = (Set) this.f133007a.get(x509Certificate.getIssuerX500Principal());
        if (set == null) {
            return null;
        }
        for (X509Certificate x509Certificate2 : set) {
            try {
                x509Certificate.verify(x509Certificate2.getPublicKey());
                return x509Certificate2;
            } catch (Exception unused) {
            }
        }
        return null;
    }
}
