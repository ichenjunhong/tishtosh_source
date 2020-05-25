package com.toutiao.proxyserver;

import java.io.IOException;
import java.net.Proxy;
import java.net.ProxySelector;
import java.net.SocketAddress;
import java.net.URI;
import java.util.Collections;
import java.util.List;

/* renamed from: com.toutiao.proxyserver.y */
final class C51919y extends ProxySelector {

    /* renamed from: a */
    private static final List<Proxy> f129559a = Collections.singletonList(Proxy.NO_PROXY);

    /* renamed from: b */
    private final ProxySelector f129560b = ProxySelector.getDefault();

    /* renamed from: c */
    private final String f129561c;

    /* renamed from: d */
    private final int f129562d;

    public final List<Proxy> select(URI uri) {
        if (uri == null) {
            throw new IllegalArgumentException("URI can't be null");
        } else if (!this.f129561c.equalsIgnoreCase(uri.getHost()) || this.f129562d != uri.getPort()) {
            return this.f129560b.select(uri);
        } else {
            return f129559a;
        }
    }

    C51919y(String str, int i) {
        this.f129561c = str;
        this.f129562d = i;
    }

    public final void connectFailed(URI uri, SocketAddress socketAddress, IOException iOException) {
        this.f129560b.connectFailed(uri, socketAddress, iOException);
    }
}
