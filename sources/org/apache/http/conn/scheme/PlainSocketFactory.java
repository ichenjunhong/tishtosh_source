package org.apache.http.conn.scheme;

public final class PlainSocketFactory implements SocketFactory {
    private static final PlainSocketFactory DEFAULT_FACTORY = new PlainSocketFactory();
    private final HostNameResolver nameResolver;

    public static PlainSocketFactory getSocketFactory() {
        return DEFAULT_FACTORY;
    }

    public PlainSocketFactory() {
        this(null);
    }

    public PlainSocketFactory(HostNameResolver hostNameResolver) {
        this.nameResolver = hostNameResolver;
    }
}
