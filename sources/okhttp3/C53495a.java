package okhttp3;

import com.bytedance.ies.bullet.kit.web.WebKitApi;
import java.net.Proxy;
import java.net.ProxySelector;
import java.util.List;
import javax.net.SocketFactory;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C53673t.C53674a;
import okhttp3.internal.C53559c;

/* renamed from: okhttp3.a */
public final class C53495a {

    /* renamed from: a */
    public final C53673t f132359a;

    /* renamed from: b */
    public final C53662o f132360b;

    /* renamed from: c */
    public final SocketFactory f132361c;

    /* renamed from: d */
    public final C53513b f132362d;

    /* renamed from: e */
    public final List<C53685z> f132363e;

    /* renamed from: f */
    public final List<C53655k> f132364f;

    /* renamed from: g */
    public final ProxySelector f132365g;

    /* renamed from: h */
    public final Proxy f132366h;

    /* renamed from: i */
    public final SSLSocketFactory f132367i;

    /* renamed from: j */
    public final HostnameVerifier f132368j;

    /* renamed from: k */
    public final C53527g f132369k;

    public final String toString() {
        StringBuilder sb = new StringBuilder("Address{");
        sb.append(this.f132359a.f133143d);
        sb.append(":");
        sb.append(this.f132359a.f133144e);
        if (this.f132366h != null) {
            sb.append(", proxy=");
            sb.append(this.f132366h);
        } else {
            sb.append(", proxySelector=");
            sb.append(this.f132365g);
        }
        sb.append("}");
        return sb.toString();
    }

    public final int hashCode() {
        int i;
        int i2;
        int i3;
        int hashCode = (((((((((((this.f132359a.hashCode() + 527) * 31) + this.f132360b.hashCode()) * 31) + this.f132362d.hashCode()) * 31) + this.f132363e.hashCode()) * 31) + this.f132364f.hashCode()) * 31) + this.f132365g.hashCode()) * 31;
        int i4 = 0;
        if (this.f132366h != null) {
            i = this.f132366h.hashCode();
        } else {
            i = 0;
        }
        int i5 = (hashCode + i) * 31;
        if (this.f132367i != null) {
            i2 = this.f132367i.hashCode();
        } else {
            i2 = 0;
        }
        int i6 = (i5 + i2) * 31;
        if (this.f132368j != null) {
            i3 = this.f132368j.hashCode();
        } else {
            i3 = 0;
        }
        int i7 = (i6 + i3) * 31;
        if (this.f132369k != null) {
            i4 = this.f132369k.hashCode();
        }
        return i7 + i4;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C53495a) {
            C53495a aVar = (C53495a) obj;
            if (this.f132359a.equals(aVar.f132359a) && mo111241a(aVar)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final boolean mo111241a(C53495a aVar) {
        if (!this.f132360b.equals(aVar.f132360b) || !this.f132362d.equals(aVar.f132362d) || !this.f132363e.equals(aVar.f132363e) || !this.f132364f.equals(aVar.f132364f) || !this.f132365g.equals(aVar.f132365g) || !C53559c.m113808a((Object) this.f132366h, (Object) aVar.f132366h) || !C53559c.m113808a((Object) this.f132367i, (Object) aVar.f132367i) || !C53559c.m113808a((Object) this.f132368j, (Object) aVar.f132368j) || !C53559c.m113808a((Object) this.f132369k, (Object) aVar.f132369k) || this.f132359a.f133144e != aVar.f132359a.f133144e) {
            return false;
        }
        return true;
    }

    public C53495a(String str, int i, C53662o oVar, SocketFactory socketFactory, SSLSocketFactory sSLSocketFactory, HostnameVerifier hostnameVerifier, C53527g gVar, C53513b bVar, Proxy proxy, List<C53685z> list, List<C53655k> list2, ProxySelector proxySelector) {
        String str2;
        C53674a aVar = new C53674a();
        if (sSLSocketFactory != null) {
            str2 = WebKitApi.SCHEME_HTTPS;
        } else {
            str2 = WebKitApi.SCHEME_HTTP;
        }
        C53674a d = aVar.mo111628a(str2).mo111635d(str);
        if (i <= 0 || i > 65535) {
            StringBuilder sb = new StringBuilder("unexpected port: ");
            sb.append(i);
            throw new IllegalArgumentException(sb.toString());
        }
        d.f133153e = i;
        this.f132359a = d.mo111632b();
        if (oVar != null) {
            this.f132360b = oVar;
            if (socketFactory != null) {
                this.f132361c = socketFactory;
                if (bVar != null) {
                    this.f132362d = bVar;
                    if (list != null) {
                        this.f132363e = C53559c.m113801a(list);
                        if (list2 != null) {
                            this.f132364f = C53559c.m113801a(list2);
                            if (proxySelector != null) {
                                this.f132365g = proxySelector;
                                this.f132366h = proxy;
                                this.f132367i = sSLSocketFactory;
                                this.f132368j = hostnameVerifier;
                                this.f132369k = gVar;
                                return;
                            }
                            throw new NullPointerException("proxySelector == null");
                        }
                        throw new NullPointerException("connectionSpecs == null");
                    }
                    throw new NullPointerException("protocols == null");
                }
                throw new NullPointerException("proxyAuthenticator == null");
            }
            throw new NullPointerException("socketFactory == null");
        }
        throw new NullPointerException("dns == null");
    }
}
