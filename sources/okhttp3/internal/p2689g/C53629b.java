package okhttp3.internal.p2689g;

import java.security.NoSuchAlgorithmException;
import java.util.List;
import javax.net.ssl.SSLContext;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.C53685z;
import org.conscrypt.Conscrypt;
import org.conscrypt.OpenSSLProvider;

/* renamed from: okhttp3.internal.g.b */
public final class C53629b extends C53634f {
    private C53629b() {
    }

    /* renamed from: b */
    public static C53634f m114027b() {
        try {
            Class.forName("org.conscrypt.ConscryptEngineSocket");
            if (!Conscrypt.isAvailable()) {
                return null;
            }
            Conscrypt.setUseEngineSocketByDefault(true);
            return new C53629b();
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public final SSLContext cE_() {
        try {
            return SSLContext.getInstance("TLS", new OpenSSLProvider());
        } catch (NoSuchAlgorithmException e) {
            throw new IllegalStateException("No TLS provider", e);
        }
    }

    /* renamed from: a */
    public final String mo111501a(SSLSocket sSLSocket) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            return Conscrypt.getApplicationProtocol(sSLSocket);
        }
        return super.mo111501a(sSLSocket);
    }

    /* renamed from: a */
    public final X509TrustManager mo111502a(SSLSocketFactory sSLSocketFactory) {
        if (!Conscrypt.isConscrypt(sSLSocketFactory)) {
            return super.mo111502a(sSLSocketFactory);
        }
        try {
            Object a = m114046a((Object) sSLSocketFactory, Object.class, "sslParameters");
            if (a != null) {
                return (X509TrustManager) m114046a(a, X509TrustManager.class, "x509TrustManager");
            }
            return null;
        } catch (Exception e) {
            throw new UnsupportedOperationException("clientBuilder.sslSocketFactory(SSLSocketFactory) not supported on Conscrypt", e);
        }
    }

    /* renamed from: a */
    public final void mo111507a(SSLSocket sSLSocket, String str, List<C53685z> list) {
        if (Conscrypt.isConscrypt(sSLSocket)) {
            if (str != null) {
                Conscrypt.setUseSessionTickets(sSLSocket, true);
                Conscrypt.setHostname(sSLSocket, str);
            }
            Conscrypt.setApplicationProtocols(sSLSocket, (String[]) C53634f.m114047a(list).toArray(new String[0]));
            return;
        }
        super.mo111507a(sSLSocket, str, list);
    }
}
