package com.google.android.gms.internal.ads;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;
import java.net.SocketException;
import javax.net.ssl.SSLSocketFactory;

final class ajv extends SSLSocketFactory {

    /* renamed from: a */
    private SSLSocketFactory f40726a = ((SSLSocketFactory) SSLSocketFactory.getDefault());

    /* renamed from: b */
    private final /* synthetic */ ajt f40727b;

    ajv(ajt ajt) {
        this.f40727b = ajt;
    }

    public final String[] getDefaultCipherSuites() {
        return this.f40726a.getDefaultCipherSuites();
    }

    public final String[] getSupportedCipherSuites() {
        return this.f40726a.getSupportedCipherSuites();
    }

    public final Socket createSocket(Socket socket, String str, int i, boolean z) throws IOException {
        return m33103a(this.f40726a.createSocket(socket, str, i, z));
    }

    public final Socket createSocket(String str, int i) throws IOException {
        return m33103a(this.f40726a.createSocket(str, i));
    }

    public final Socket createSocket(String str, int i, InetAddress inetAddress, int i2) throws IOException {
        return m33103a(this.f40726a.createSocket(str, i, inetAddress, i2));
    }

    public final Socket createSocket(InetAddress inetAddress, int i) throws IOException {
        return m33103a(this.f40726a.createSocket(inetAddress, i));
    }

    public final Socket createSocket(InetAddress inetAddress, int i, InetAddress inetAddress2, int i2) throws IOException {
        return m33103a(this.f40726a.createSocket(inetAddress, i, inetAddress2, i2));
    }

    /* renamed from: a */
    private final Socket m33103a(Socket socket) throws SocketException {
        if (this.f40727b.f40724q > 0) {
            socket.setReceiveBufferSize(this.f40727b.f40724q);
        }
        this.f40727b.f40725r.add(socket);
        return socket;
    }
}
