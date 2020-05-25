package okhttp3.internal.p2684b;

import java.io.IOException;
import java.net.UnknownServiceException;
import java.util.Arrays;
import java.util.List;
import javax.net.ssl.SSLSocket;
import okhttp3.C53655k;
import okhttp3.internal.C53533a;

/* renamed from: okhttp3.internal.b.b */
public final class C53550b {

    /* renamed from: a */
    boolean f132683a;

    /* renamed from: b */
    boolean f132684b;

    /* renamed from: c */
    private final List<C53655k> f132685c;

    /* renamed from: d */
    private int f132686d;

    public C53550b(List<C53655k> list) {
        this.f132685c = list;
    }

    /* renamed from: b */
    private boolean m113748b(SSLSocket sSLSocket) {
        for (int i = this.f132686d; i < this.f132685c.size(); i++) {
            if (((C53655k) this.f132685c.get(i)).mo111555a(sSLSocket)) {
                return true;
            }
        }
        return false;
    }

    /* renamed from: a */
    public final C53655k mo111373a(SSLSocket sSLSocket) throws IOException {
        C53655k kVar;
        int i = this.f132686d;
        int size = this.f132685c.size();
        while (true) {
            if (i >= size) {
                kVar = null;
                break;
            }
            kVar = (C53655k) this.f132685c.get(i);
            if (kVar.mo111555a(sSLSocket)) {
                this.f132686d = i + 1;
                break;
            }
            i++;
        }
        if (kVar != null) {
            this.f132683a = m113748b(sSLSocket);
            C53533a.f132616a.mo111344a(kVar, sSLSocket, this.f132684b);
            return kVar;
        }
        StringBuilder sb = new StringBuilder("Unable to find acceptable protocols. isFallback=");
        sb.append(this.f132684b);
        sb.append(", modes=");
        sb.append(this.f132685c);
        sb.append(", supported protocols=");
        sb.append(Arrays.toString(sSLSocket.getEnabledProtocols()));
        throw new UnknownServiceException(sb.toString());
    }
}
