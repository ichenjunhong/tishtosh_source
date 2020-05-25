package com.google.android.gms.measurement.internal;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.HttpsURLConnection;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.google.android.gms.measurement.internal.en */
final class C17103en extends SSLSocketFactory {

    /* renamed from: a */
    private final SSLSocketFactory f48282a;

    C17103en() {
        this(HttpsURLConnection.getDefaultSSLSocketFactory());
    }

    private C17103en(SSLSocketFactory sSLSocketFactory) {
        this.f48282a = sSLSocketFactory;
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m41712a((SSLSocket) this.f48282a.createSocket(socket, str, i, z));
    }

    public final String[] getDefaultCipherSuites() {
        return this.f48282a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f48282a.getSupportedCipherSuites();
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return m41712a((SSLSocket) this.f48282a.createSocket(str, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m41712a((SSLSocket) this.f48282a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m41712a((SSLSocket) this.f48282a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m41712a((SSLSocket) this.f48282a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket() throws IOException {
        return m41712a((SSLSocket) this.f48282a.createSocket());
    }

    /* renamed from: a */
    private final SSLSocket m41712a(SSLSocket sSLSocket) {
        return new C17105ep(this, sSLSocket);
    }
}
