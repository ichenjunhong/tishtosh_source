package okhttp3;

import java.security.cert.Certificate;
import java.util.Collections;
import java.util.List;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSession;
import okhttp3.internal.C53559c;

/* renamed from: okhttp3.r */
public final class C53670r {

    /* renamed from: a */
    public final C53510ag f133133a;

    /* renamed from: b */
    public final C53530h f133134b;

    /* renamed from: c */
    public final List<Certificate> f133135c;

    /* renamed from: d */
    public final List<Certificate> f133136d;

    public final int hashCode() {
        return ((((((this.f133133a.hashCode() + 527) * 31) + this.f133134b.hashCode()) * 31) + this.f133135c.hashCode()) * 31) + this.f133136d.hashCode();
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof C53670r)) {
            return false;
        }
        C53670r rVar = (C53670r) obj;
        if (!this.f133133a.equals(rVar.f133133a) || !this.f133134b.equals(rVar.f133134b) || !this.f133135c.equals(rVar.f133135c) || !this.f133136d.equals(rVar.f133136d)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public static C53670r m114147a(SSLSession sSLSession) {
        Certificate[] certificateArr;
        List list;
        List list2;
        String cipherSuite = sSLSession.getCipherSuite();
        if (cipherSuite != null) {
            C53530h a = C53530h.m113689a(cipherSuite);
            String protocol = sSLSession.getProtocol();
            if (protocol != null) {
                C53510ag forJavaName = C53510ag.forJavaName(protocol);
                try {
                    certificateArr = sSLSession.getPeerCertificates();
                } catch (SSLPeerUnverifiedException unused) {
                    certificateArr = null;
                }
                if (certificateArr != null) {
                    list = C53559c.m113802a((T[]) certificateArr);
                } else {
                    list = Collections.emptyList();
                }
                Certificate[] localCertificates = sSLSession.getLocalCertificates();
                if (localCertificates != null) {
                    list2 = C53559c.m113802a((T[]) localCertificates);
                } else {
                    list2 = Collections.emptyList();
                }
                return new C53670r(forJavaName, a, list, list2);
            }
            throw new IllegalStateException("tlsVersion == null");
        }
        throw new IllegalStateException("cipherSuite == null");
    }

    C53670r(C53510ag agVar, C53530h hVar, List<Certificate> list, List<Certificate> list2) {
        this.f133133a = agVar;
        this.f133134b = hVar;
        this.f133135c = list;
        this.f133136d = list2;
    }
}
