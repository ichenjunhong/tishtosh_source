package okhttp3;

import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;

/* renamed from: okhttp3.af */
public final class C53509af {

    /* renamed from: a */
    public final C53495a f132430a;

    /* renamed from: b */
    public final Proxy f132431b;

    /* renamed from: c */
    public final InetSocketAddress f132432c;

    /* renamed from: a */
    public final boolean mo111300a() {
        if (this.f132430a.f132367i == null || this.f132431b.type() != Type.HTTP) {
            return false;
        }
        return true;
    }

    public final int hashCode() {
        return ((((this.f132430a.hashCode() + 527) * 31) + this.f132431b.hashCode()) * 31) + this.f132432c.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Route{");
        sb.append(this.f132432c);
        sb.append("}");
        return sb.toString();
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C53509af) {
            C53509af afVar = (C53509af) obj;
            if (afVar.f132430a.equals(this.f132430a) && afVar.f132431b.equals(this.f132431b) && afVar.f132432c.equals(this.f132432c)) {
                return true;
            }
        }
        return false;
    }

    public C53509af(C53495a aVar, Proxy proxy, InetSocketAddress inetSocketAddress) {
        if (aVar == null) {
            throw new NullPointerException("address == null");
        } else if (proxy == null) {
            throw new NullPointerException("proxy == null");
        } else if (inetSocketAddress != null) {
            this.f132430a = aVar;
            this.f132431b = proxy;
            this.f132432c = inetSocketAddress;
        } else {
            throw new NullPointerException("inetSocketAddress == null");
        }
    }
}
