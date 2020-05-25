package com.bytedance.frameworks.baselib.network.http.p570c.p571a;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;

/* renamed from: com.bytedance.frameworks.baselib.network.http.c.a.h */
public final class C9871h extends SSLSocketFactory {

    /* renamed from: b */
    private static final String[] f26863b = {"TLSv1.2"};

    /* renamed from: a */
    final SSLSocketFactory f26864a;

    public final String[] getDefaultCipherSuites() {
        return this.f26864a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f26864a.getSupportedCipherSuites();
    }

    public C9871h(SSLSocketFactory sSLSocketFactory) {
        this.f26864a = sSLSocketFactory;
    }

    /* renamed from: a */
    private static Socket m19753a(Socket socket) {
        if (socket instanceof SSLSocket) {
            ((SSLSocket) socket).setEnabledProtocols(f26863b);
        }
        return socket;
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return m19753a(this.f26864a.createSocket(str, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m19753a(this.f26864a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m19753a(this.f26864a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m19753a(this.f26864a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m19753a(this.f26864a.createSocket(socket, str, i, z));
    }
}
