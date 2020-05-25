package org.apache.http.conn.routing;

import java.net.InetAddress;
import org.apache.http.HttpHost;
import org.apache.http.conn.routing.RouteInfo.LayerType;
import org.apache.http.conn.routing.RouteInfo.TunnelType;

public final class HttpRoute implements Cloneable, RouteInfo {
    private static final HttpHost[] EMPTY_HTTP_HOST_ARRAY = new HttpHost[0];
    private final LayerType layered;
    private final InetAddress localAddress;
    private final HttpHost[] proxyChain;
    private final boolean secure;
    private final HttpHost targetHost;
    private final TunnelType tunnelled;

    public final Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    public final int getHopCount() {
        return this.proxyChain.length + 1;
    }

    public final int hashCode() {
        int hashCode = this.targetHost.hashCode();
        if (this.localAddress != null) {
            hashCode ^= this.localAddress.hashCode();
        }
        int length = hashCode ^ this.proxyChain.length;
        for (HttpHost hashCode2 : this.proxyChain) {
            length ^= hashCode2.hashCode();
        }
        if (this.secure) {
            length ^= 286331153;
        }
        return (length ^ this.tunnelled.hashCode()) ^ this.layered.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder((getHopCount() * 30) + 50);
        sb.append("HttpRoute[");
        if (this.localAddress != null) {
            sb.append(this.localAddress);
            sb.append("->");
        }
        sb.append('{');
        if (this.tunnelled == TunnelType.TUNNELLED) {
            sb.append('t');
        }
        if (this.layered == LayerType.LAYERED) {
            sb.append('l');
        }
        if (this.secure) {
            sb.append('s');
        }
        sb.append("}->");
        for (HttpHost append : this.proxyChain) {
            sb.append(append);
            sb.append("->");
        }
        sb.append(this.targetHost);
        sb.append(']');
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        boolean z;
        boolean z2;
        boolean z3 = true;
        if (obj == this) {
            return true;
        }
        int i = 0;
        if (!(obj instanceof HttpRoute)) {
            return false;
        }
        HttpRoute httpRoute = (HttpRoute) obj;
        boolean equals = this.targetHost.equals(httpRoute.targetHost);
        if (this.localAddress == httpRoute.localAddress || (this.localAddress != null && this.localAddress.equals(httpRoute.localAddress))) {
            z = true;
        } else {
            z = false;
        }
        boolean z4 = equals & z;
        if (this.proxyChain == httpRoute.proxyChain || this.proxyChain.length == httpRoute.proxyChain.length) {
            z2 = true;
        } else {
            z2 = false;
        }
        boolean z5 = z4 & z2;
        if (!(this.secure == httpRoute.secure && this.tunnelled == httpRoute.tunnelled && this.layered == httpRoute.layered)) {
            z3 = false;
        }
        boolean z6 = z3 & z5;
        if (z6 && this.proxyChain != null) {
            while (z6 && i < this.proxyChain.length) {
                z6 = this.proxyChain[i].equals(httpRoute.proxyChain[i]);
                i++;
            }
        }
        return z6;
    }
}
