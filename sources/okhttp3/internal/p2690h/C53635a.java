package okhttp3.internal.p2690h;

import java.security.GeneralSecurityException;
import java.security.cert.Certificate;
import java.security.cert.X509Certificate;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;

/* renamed from: okhttp3.internal.h.a */
public final class C53635a extends C53637c {

    /* renamed from: a */
    private final C53639e f133006a;

    public final int hashCode() {
        return this.f133006a.hashCode();
    }

    public C53635a(C53639e eVar) {
        this.f133006a = eVar;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C53635a) || !((C53635a) obj).f133006a.equals(this.f133006a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private static boolean m114062a(X509Certificate x509Certificate, X509Certificate x509Certificate2) {
        if (!x509Certificate.getIssuerDN().equals(x509Certificate2.getSubjectDN())) {
            return false;
        }
        try {
            x509Certificate.verify(x509Certificate2.getPublicKey());
            return true;
        } catch (GeneralSecurityException unused) {
            return false;
        }
    }

    /* renamed from: a */
    public final List<Certificate> mo111510a(List<Certificate> list, String str) throws SSLPeerUnverifiedException {
        ArrayDeque arrayDeque = new ArrayDeque(list);
        ArrayList arrayList = new ArrayList();
        arrayList.add(arrayDeque.removeFirst());
        boolean z = false;
        for (int i = 0; i < 9; i++) {
            X509Certificate x509Certificate = (X509Certificate) arrayList.get(arrayList.size() - 1);
            X509Certificate a = this.f133006a.mo111513a(x509Certificate);
            if (a != null) {
                if (arrayList.size() > 1 || !x509Certificate.equals(a)) {
                    arrayList.add(a);
                }
                if (m114062a(a, a)) {
                    return arrayList;
                }
                z = true;
            } else {
                Iterator it = arrayDeque.iterator();
                while (it.hasNext()) {
                    X509Certificate x509Certificate2 = (X509Certificate) it.next();
                    if (m114062a(x509Certificate, x509Certificate2)) {
                        it.remove();
                        arrayList.add(x509Certificate2);
                    }
                }
                if (z) {
                    return arrayList;
                }
                StringBuilder sb = new StringBuilder("Failed to find a trusted cert that signed ");
                sb.append(x509Certificate);
                throw new SSLPeerUnverifiedException(sb.toString());
            }
        }
        StringBuilder sb2 = new StringBuilder("Certificate chain too long: ");
        sb2.append(arrayList);
        throw new SSLPeerUnverifiedException(sb2.toString());
    }
}
