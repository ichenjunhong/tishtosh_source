package okhttp3.internal.p2685c;

import java.io.IOException;
import java.util.List;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53500ac;
import okhttp3.C53504ad;
import okhttp3.C53504ad.C53505a;
import okhttp3.C53506ae;
import okhttp3.C53657l;
import okhttp3.C53659m;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;
import okhttp3.C53678w;
import okhttp3.internal.C53559c;
import okhttp3.internal.C53576d;
import okio.GzipSource;
import okio.Okio;
import okio.Source;

/* renamed from: okhttp3.internal.c.a */
public final class C53562a implements C53676u {

    /* renamed from: a */
    private final C53659m f132753a;

    public C53562a(C53659m mVar) {
        this.f132753a = mVar;
    }

    public final C53504ad intercept(C53677a aVar) throws IOException {
        boolean z;
        C53498ab a = aVar.mo111416a();
        C53499a a2 = a.mo111256a();
        C53500ac acVar = a.f132381d;
        if (acVar != null) {
            C53678w contentType = acVar.contentType();
            if (contentType != null) {
                a2.mo111263a("Content-Type", contentType.toString());
            }
            long contentLength = acVar.contentLength();
            if (contentLength != -1) {
                a2.mo111263a("Content-Length", Long.toString(contentLength));
                a2.mo111270b("Transfer-Encoding");
            } else {
                a2.mo111263a("Transfer-Encoding", "chunked");
                a2.mo111270b("Content-Length");
            }
        }
        if (a.mo111255a("Host") == null) {
            a2.mo111263a("Host", C53559c.m113799a(a.f132378a, false));
        }
        if (a.mo111255a("Connection") == null) {
            a2.mo111263a("Connection", "Keep-Alive");
        }
        if (a.mo111255a("Accept-Encoding") == null && a.mo111255a("Range") == null) {
            a2.mo111263a("Accept-Encoding", "gzip");
            z = true;
        } else {
            z = false;
        }
        List loadForRequest = this.f132753a.loadForRequest(a.f132378a);
        if (!loadForRequest.isEmpty()) {
            String str = "Cookie";
            StringBuilder sb = new StringBuilder();
            int size = loadForRequest.size();
            for (int i = 0; i < size; i++) {
                if (i > 0) {
                    sb.append("; ");
                }
                C53657l lVar = (C53657l) loadForRequest.get(i);
                sb.append(lVar.f133099a);
                sb.append('=');
                sb.append(lVar.f133100b);
            }
            a2.mo111263a(str, sb.toString());
        }
        if (a.mo111255a("User-Agent") == null) {
            a2.mo111263a("User-Agent", C53576d.m113856a());
        }
        C53504ad a3 = aVar.mo111417a(a2.mo111272c());
        C53568e.m113834a(this.f132753a, a.f132378a, a3.f132403f);
        C53505a a4 = a3.mo111277b().mo111285a(a);
        if (z && "gzip".equalsIgnoreCase(a3.mo111276b("Content-Encoding")) && C53568e.m113836b(a3)) {
            GzipSource gzipSource = new GzipSource(a3.f132404g.source());
            a4.mo111289a(a3.f132403f.mo111598d().mo111606b("Content-Encoding").mo111606b("Content-Length").mo111605a());
            a4.mo111287a((C53506ae) new C53571h(a3.mo111276b("Content-Type"), -1, Okio.buffer((Source) gzipSource)));
        }
        return a4.mo111291a();
    }
}
