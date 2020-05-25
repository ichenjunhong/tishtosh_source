package okhttp3.internal.p2684b;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.net.Proxy.Type;
import java.net.SocketAddress;
import java.net.SocketException;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.NoSuchElementException;
import okhttp3.C53495a;
import okhttp3.C53509af;
import okhttp3.C53524e;
import okhttp3.C53664p;
import okhttp3.C53673t;
import okhttp3.internal.C53559c;

/* renamed from: okhttp3.internal.b.f */
public final class C53555f {

    /* renamed from: a */
    final C53495a f132706a;

    /* renamed from: b */
    final C53553d f132707b;

    /* renamed from: c */
    private final C53524e f132708c;

    /* renamed from: d */
    private final C53664p f132709d;

    /* renamed from: e */
    private List<Proxy> f132710e = Collections.emptyList();

    /* renamed from: f */
    private int f132711f;

    /* renamed from: g */
    private List<InetSocketAddress> f132712g = Collections.emptyList();

    /* renamed from: h */
    private final List<C53509af> f132713h = new ArrayList();

    /* renamed from: okhttp3.internal.b.f$a */
    public static final class C53556a {

        /* renamed from: a */
        final List<C53509af> f132714a;

        /* renamed from: b */
        int f132715b;

        /* renamed from: a */
        public final boolean mo111393a() {
            if (this.f132715b < this.f132714a.size()) {
                return true;
            }
            return false;
        }

        C53556a(List<C53509af> list) {
            this.f132714a = list;
        }
    }

    /* renamed from: c */
    private boolean m113770c() {
        if (this.f132711f < this.f132710e.size()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final boolean mo111391a() {
        if (m113770c() || !this.f132713h.isEmpty()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final C53556a mo111392b() throws IOException {
        if (mo111391a()) {
            ArrayList arrayList = new ArrayList();
            while (m113770c()) {
                if (m113770c()) {
                    List<Proxy> list = this.f132710e;
                    int i = this.f132711f;
                    this.f132711f = i + 1;
                    Proxy proxy = (Proxy) list.get(i);
                    m113769a(proxy);
                    int size = this.f132712g.size();
                    for (int i2 = 0; i2 < size; i2++) {
                        C53509af afVar = new C53509af(this.f132706a, proxy, (InetSocketAddress) this.f132712g.get(i2));
                        if (this.f132707b.mo111388c(afVar)) {
                            this.f132713h.add(afVar);
                        } else {
                            arrayList.add(afVar);
                        }
                    }
                    if (!arrayList.isEmpty()) {
                        break;
                    }
                } else {
                    StringBuilder sb = new StringBuilder("No route to ");
                    sb.append(this.f132706a.f132359a.f133143d);
                    sb.append("; exhausted proxy configurations: ");
                    sb.append(this.f132710e);
                    throw new SocketException(sb.toString());
                }
            }
            if (arrayList.isEmpty()) {
                arrayList.addAll(this.f132713h);
                this.f132713h.clear();
            }
            return new C53556a(arrayList);
        }
        throw new NoSuchElementException();
    }

    /* renamed from: a */
    private void m113769a(Proxy proxy) throws IOException {
        String str;
        int i;
        this.f132712g = new ArrayList();
        if (proxy.type() == Type.DIRECT || proxy.type() == Type.SOCKS) {
            str = this.f132706a.f132359a.f133143d;
            i = this.f132706a.f132359a.f133144e;
        } else {
            SocketAddress address = proxy.address();
            if (address instanceof InetSocketAddress) {
                InetSocketAddress inetSocketAddress = (InetSocketAddress) address;
                InetAddress address2 = inetSocketAddress.getAddress();
                if (address2 == null) {
                    str = inetSocketAddress.getHostName();
                } else {
                    str = address2.getHostAddress();
                }
                i = inetSocketAddress.getPort();
            } else {
                StringBuilder sb = new StringBuilder("Proxy.address() is not an InetSocketAddress: ");
                sb.append(address.getClass());
                throw new IllegalArgumentException(sb.toString());
            }
        }
        if (i <= 0 || i > 65535) {
            StringBuilder sb2 = new StringBuilder("No route to ");
            sb2.append(str);
            sb2.append(":");
            sb2.append(i);
            sb2.append("; port is out of range");
            throw new SocketException(sb2.toString());
        } else if (proxy.type() == Type.SOCKS) {
            this.f132712g.add(InetSocketAddress.createUnresolved(str, i));
        } else {
            this.f132709d.dnsStart(this.f132708c, str);
            List lookup = this.f132706a.f132360b.lookup(str);
            if (!lookup.isEmpty()) {
                this.f132709d.dnsEnd(this.f132708c, str, lookup);
                int size = lookup.size();
                for (int i2 = 0; i2 < size; i2++) {
                    this.f132712g.add(new InetSocketAddress((InetAddress) lookup.get(i2), i));
                }
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f132706a.f132360b);
            sb3.append(" returned no addresses for ");
            sb3.append(str);
            throw new UnknownHostException(sb3.toString());
        }
    }

    public C53555f(C53495a aVar, C53553d dVar, C53524e eVar, C53664p pVar) {
        List<Proxy> list;
        this.f132706a = aVar;
        this.f132707b = dVar;
        this.f132708c = eVar;
        this.f132709d = pVar;
        C53673t tVar = aVar.f132359a;
        Proxy proxy = aVar.f132366h;
        if (proxy != null) {
            list = Collections.singletonList(proxy);
        } else {
            List select = this.f132706a.f132365g.select(tVar.mo111611b());
            if (select == null || select.isEmpty()) {
                list = C53559c.m113802a((T[]) new Proxy[]{Proxy.NO_PROXY});
            } else {
                list = C53559c.m113801a(select);
            }
        }
        this.f132710e = list;
        this.f132711f = 0;
    }
}
