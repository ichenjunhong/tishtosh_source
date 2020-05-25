package org.apache.http.conn.ssl;

import javax.net.ssl.HttpsURLConnection;
import org.apache.http.conn.scheme.HostNameResolver;
import org.apache.http.conn.scheme.LayeredSocketFactory;

public class SSLSocketFactory implements LayeredSocketFactory {
    public static final X509HostnameVerifier ALLOW_ALL_HOSTNAME_VERIFIER = new AllowAllHostnameVerifier();
    public static final X509HostnameVerifier BROWSER_COMPATIBLE_HOSTNAME_VERIFIER = new BrowserCompatHostnameVerifier();
    private static final SSLSocketFactory DEFAULT_FACTORY = new SSLSocketFactory();
    public static final X509HostnameVerifier STRICT_HOSTNAME_VERIFIER = new StrictHostnameVerifier();
    private volatile X509HostnameVerifier hostnameVerifier = BROWSER_COMPATIBLE_HOSTNAME_VERIFIER;
    private final HostNameResolver nameResolver = null;
    private final javax.net.ssl.SSLSocketFactory socketfactory = HttpsURLConnection.getDefaultSSLSocketFactory();

    public static SSLSocketFactory getSocketFactory() {
        return DEFAULT_FACTORY;
    }

    private SSLSocketFactory() {
    }
}
