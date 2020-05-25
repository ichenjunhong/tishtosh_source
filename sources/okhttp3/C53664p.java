package okhttp3;

import java.io.IOException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Proxy;
import java.util.List;

/* renamed from: okhttp3.p */
public abstract class C53664p {
    public static final C53664p NONE = new C53664p() {
    };

    /* renamed from: okhttp3.p$a */
    public interface C53667a {
        C53664p create(C53524e eVar);
    }

    public void callEnd(C53524e eVar) {
    }

    public void callFailed(C53524e eVar, IOException iOException) {
    }

    public void callStart(C53524e eVar) {
    }

    public void connectEnd(C53524e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, C53685z zVar) {
    }

    public void connectFailed(C53524e eVar, InetSocketAddress inetSocketAddress, Proxy proxy, C53685z zVar, IOException iOException) {
    }

    public void connectStart(C53524e eVar, InetSocketAddress inetSocketAddress, Proxy proxy) {
    }

    public void connectionAcquired(C53524e eVar, C53532i iVar) {
    }

    public void connectionReleased(C53524e eVar, C53532i iVar) {
    }

    public void dnsEnd(C53524e eVar, String str, List<InetAddress> list) {
    }

    public void dnsStart(C53524e eVar, String str) {
    }

    public void requestBodyEnd(C53524e eVar, long j) {
    }

    public void requestBodyStart(C53524e eVar) {
    }

    public void requestHeadersEnd(C53524e eVar, C53498ab abVar) {
    }

    public void requestHeadersStart(C53524e eVar) {
    }

    public void responseBodyEnd(C53524e eVar, long j) {
    }

    public void responseBodyStart(C53524e eVar) {
    }

    public void responseHeadersEnd(C53524e eVar, C53504ad adVar) {
    }

    public void responseHeadersStart(C53524e eVar) {
    }

    public void secureConnectEnd(C53524e eVar, C53670r rVar) {
    }

    public void secureConnectStart(C53524e eVar) {
    }

    static C53667a factory(C53664p pVar) {
        return new C53667a(pVar) {

            /* renamed from: a */
            final /* synthetic */ C53664p f133126a;

            public final C53664p create(C53524e eVar) {
                return this.f133126a;
            }

            {
                this.f133126a = r1;
            }
        };
    }
}
