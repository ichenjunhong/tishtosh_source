package okhttp3.internal.p2685c;

import com.p683ss.android.ugc.aweme.lancet.p1153c.C18976b;
import java.io.IOException;
import java.net.ProtocolException;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53504ad.C53505a;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;
import okhttp3.internal.C53559c;
import okhttp3.internal.p2684b.C53551c;
import okhttp3.internal.p2684b.C53557g;
import okio.Buffer;
import okio.BufferedSink;
import okio.ForwardingSink;
import okio.Okio;
import okio.Sink;

/* renamed from: okhttp3.internal.c.b */
public final class C53563b implements C53676u {

    /* renamed from: a */
    private final boolean f132754a;

    /* renamed from: okhttp3.internal.c.b$a */
    static final class C53564a extends ForwardingSink {

        /* renamed from: a */
        long f132755a;

        C53564a(Sink sink) {
            super(sink);
        }

        public final void write(Buffer buffer, long j) throws IOException {
            super.write(buffer, j);
            this.f132755a += j;
        }
    }

    public C53563b(boolean z) {
        this.f132754a = z;
    }

    public final C53504ad intercept(C53677a aVar) throws IOException {
        C53504ad adVar;
        C53570g gVar = (C53570g) aVar;
        C53565c cVar = gVar.f132761b;
        C53557g gVar2 = gVar.f132760a;
        C53551c cVar2 = (C53551c) gVar.mo111419b();
        C53498ab a = gVar.mo111416a();
        long currentTimeMillis = System.currentTimeMillis();
        gVar.f132762c.requestHeadersStart(gVar.mo111423f());
        cVar.mo111412a(a);
        gVar.f132762c.requestHeadersEnd(gVar.mo111423f(), a);
        C53505a aVar2 = null;
        if (C53569f.m113839c(a.f132379b) && a.f132381d != null) {
            if ("100-continue".equalsIgnoreCase(a.mo111255a("Expect"))) {
                cVar.mo111411a();
                gVar.f132762c.responseHeadersStart(gVar.mo111423f());
                aVar2 = cVar.mo111408a(true);
            }
            if (aVar2 == null) {
                gVar.f132762c.requestBodyStart(gVar.mo111423f());
                C53564a aVar3 = new C53564a(cVar.mo111410a(a, a.f132381d.contentLength()));
                BufferedSink buffer = Okio.buffer((Sink) aVar3);
                a.f132381d.writeTo(buffer);
                buffer.close();
                gVar.f132762c.requestBodyEnd(gVar.mo111423f(), aVar3.f132755a);
            } else if (!cVar2.mo111383e()) {
                gVar2.mo111402d();
            }
        }
        cVar.mo111413b();
        if (aVar2 == null) {
            gVar.f132762c.responseHeadersStart(gVar.mo111423f());
            aVar2 = cVar.mo111408a(false);
        }
        C53504ad a2 = aVar2.mo111285a(a).mo111288a(gVar2.mo111400b().mo111382d()).mo111282a(currentTimeMillis).mo111292b(System.currentTimeMillis()).mo111291a();
        int i = a2.f132400c;
        if (i == 100) {
            a2 = cVar.mo111408a(false).mo111285a(a).mo111288a(gVar2.mo111400b().mo111382d()).mo111282a(currentTimeMillis).mo111292b(System.currentTimeMillis()).mo111291a();
            i = a2.f132400c;
        }
        gVar.f132762c.responseHeadersEnd(gVar.mo111423f(), a2);
        if (!this.f132754a || i != 101) {
            adVar = a2.mo111277b().mo111287a(cVar.mo111409a(a2)).mo111291a();
        } else {
            adVar = a2.mo111277b().mo111287a(C53559c.f132735c).mo111291a();
        }
        if ("close".equalsIgnoreCase(adVar.f132398a.mo111255a("Connection")) || "close".equalsIgnoreCase(adVar.mo111276b("Connection"))) {
            gVar2.mo111402d();
        }
        if ((i == 204 || i == 205) && adVar.f132404g.contentLength() > 0) {
            StringBuilder sb = new StringBuilder("HTTP ");
            sb.append(i);
            sb.append(" had non-zero Content-Length: ");
            sb.append(adVar.f132404g.contentLength());
            throw new ProtocolException(sb.toString());
        }
        if (adVar != null) {
            C18976b.m46152a(adVar);
        }
        return adVar;
    }
}
