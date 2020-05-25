package okhttp3.internal.p2687e;

import java.io.IOException;
import java.net.ProtocolException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.concurrent.TimeUnit;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53504ad.C53505a;
import okhttp3.C53506ae;
import okhttp3.C53671s;
import okhttp3.C53671s.C53672a;
import okhttp3.C53676u.C53677a;
import okhttp3.C53682y;
import okhttp3.C53685z;
import okhttp3.internal.C53533a;
import okhttp3.internal.C53559c;
import okhttp3.internal.p2684b.C53557g;
import okhttp3.internal.p2685c.C53565c;
import okhttp3.internal.p2685c.C53568e;
import okhttp3.internal.p2685c.C53571h;
import okhttp3.internal.p2685c.C53572i;
import okhttp3.internal.p2685c.C53574k;
import okio.Buffer;
import okio.ByteString;
import okio.ForwardingSource;
import okio.Okio;
import okio.Sink;
import okio.Source;

/* renamed from: okhttp3.internal.e.f */
public final class C53592f implements C53565c {

    /* renamed from: b */
    private static final ByteString f132842b = ByteString.encodeUtf8("connection");

    /* renamed from: c */
    private static final ByteString f132843c = ByteString.encodeUtf8("host");

    /* renamed from: d */
    private static final ByteString f132844d = ByteString.encodeUtf8("keep-alive");

    /* renamed from: e */
    private static final ByteString f132845e = ByteString.encodeUtf8("proxy-connection");

    /* renamed from: f */
    private static final ByteString f132846f = ByteString.encodeUtf8("transfer-encoding");

    /* renamed from: g */
    private static final ByteString f132847g = ByteString.encodeUtf8("te");

    /* renamed from: h */
    private static final ByteString f132848h = ByteString.encodeUtf8("encoding");

    /* renamed from: i */
    private static final ByteString f132849i = ByteString.encodeUtf8("upgrade");

    /* renamed from: j */
    private static final List<ByteString> f132850j = C53559c.m113802a((T[]) new ByteString[]{f132842b, f132843c, f132844d, f132845e, f132847g, f132846f, f132848h, f132849i, C53587c.f132811c, C53587c.f132812d, C53587c.f132813e, C53587c.f132814f});

    /* renamed from: k */
    private static final List<ByteString> f132851k = C53559c.m113802a((T[]) new ByteString[]{f132842b, f132843c, f132844d, f132845e, f132847g, f132846f, f132848h, f132849i});

    /* renamed from: a */
    final C53557g f132852a;

    /* renamed from: l */
    private final C53682y f132853l;

    /* renamed from: m */
    private final C53677a f132854m;

    /* renamed from: n */
    private final C53594g f132855n;

    /* renamed from: o */
    private C53612i f132856o;

    /* renamed from: okhttp3.internal.e.f$a */
    class C53593a extends ForwardingSource {

        /* renamed from: a */
        boolean f132857a;

        /* renamed from: b */
        long f132858b;

        public final void close() throws IOException {
            super.close();
            m113900a(null);
        }

        /* renamed from: a */
        private void m113900a(IOException iOException) {
            if (!this.f132857a) {
                this.f132857a = true;
                C53592f.this.f132852a.mo111399a(false, C53592f.this, this.f132858b, iOException);
            }
        }

        C53593a(Source source) {
            super(source);
        }

        public final long read(Buffer buffer, long j) throws IOException {
            try {
                long read = delegate().read(buffer, j);
                if (read > 0) {
                    this.f132858b += read;
                }
                return read;
            } catch (IOException e) {
                m113900a(e);
                throw e;
            }
        }
    }

    /* renamed from: a */
    public final void mo111411a() throws IOException {
        this.f132855n.mo111445b();
    }

    /* renamed from: b */
    public final void mo111413b() throws IOException {
        this.f132856o.mo111467d().close();
    }

    /* renamed from: c */
    public final void mo111414c() {
        if (this.f132856o != null) {
            this.f132856o.mo111463b(C53586b.CANCEL);
        }
    }

    /* renamed from: a */
    public final C53506ae mo111409a(C53504ad adVar) throws IOException {
        this.f132852a.f132721e.responseBodyStart(this.f132852a.f132720d);
        return new C53571h(adVar.mo111276b("Content-Type"), C53568e.m113831a(adVar), Okio.buffer((Source) new C53593a(this.f132856o.f132942h)));
    }

    /* renamed from: a */
    public final C53505a mo111408a(boolean z) throws IOException {
        List c = this.f132856o.mo111465c();
        C53672a aVar = new C53672a();
        int size = c.size();
        C53672a aVar2 = aVar;
        C53574k kVar = null;
        for (int i = 0; i < size; i++) {
            C53587c cVar = (C53587c) c.get(i);
            if (cVar != null) {
                ByteString byteString = cVar.f132815g;
                String utf8 = cVar.f132816h.utf8();
                if (byteString.equals(C53587c.f132810b)) {
                    StringBuilder sb = new StringBuilder("HTTP/1.1 ");
                    sb.append(utf8);
                    kVar = C53574k.m113855a(sb.toString());
                } else if (!f132851k.contains(byteString)) {
                    C53533a.f132616a.mo111346a(aVar2, byteString.utf8(), utf8);
                }
            } else if (kVar != null && kVar.f132781b == 100) {
                aVar2 = new C53672a();
                kVar = null;
            }
        }
        if (kVar != null) {
            C53505a a = new C53505a().mo111290a(C53685z.HTTP_2).mo111281a(kVar.f132781b).mo111283a(kVar.f132782c).mo111289a(aVar2.mo111605a());
            if (!z || C53533a.f132616a.mo111338a(a) != 100) {
                return a;
            }
            return null;
        }
        throw new ProtocolException("Expected ':status' header not present");
    }

    /* renamed from: a */
    public final void mo111412a(C53498ab abVar) throws IOException {
        boolean z;
        if (this.f132856o == null) {
            if (abVar.f132381d != null) {
                z = true;
            } else {
                z = false;
            }
            C53671s sVar = abVar.f132380c;
            ArrayList arrayList = new ArrayList(sVar.mo111591a() + 4);
            arrayList.add(new C53587c(C53587c.f132811c, abVar.f132379b));
            arrayList.add(new C53587c(C53587c.f132812d, C53572i.m113848a(abVar.f132378a)));
            String a = abVar.mo111255a("Host");
            if (a != null) {
                arrayList.add(new C53587c(C53587c.f132814f, a));
            }
            arrayList.add(new C53587c(C53587c.f132813e, abVar.f132378a.f133140a));
            int a2 = sVar.mo111591a();
            for (int i = 0; i < a2; i++) {
                ByteString encodeUtf8 = ByteString.encodeUtf8(sVar.mo111592a(i).toLowerCase(Locale.US));
                if (!f132850j.contains(encodeUtf8)) {
                    arrayList.add(new C53587c(encodeUtf8, sVar.mo111594b(i)));
                }
            }
            this.f132856o = this.f132855n.mo111439a(0, arrayList, z);
            this.f132856o.f132944j.timeout((long) this.f132854m.mo111421d(), TimeUnit.MILLISECONDS);
            this.f132856o.f132945k.timeout((long) this.f132854m.mo111422e(), TimeUnit.MILLISECONDS);
        }
    }

    /* renamed from: a */
    public final Sink mo111410a(C53498ab abVar, long j) {
        return this.f132856o.mo111467d();
    }

    public C53592f(C53682y yVar, C53677a aVar, C53557g gVar, C53594g gVar2) {
        this.f132853l = yVar;
        this.f132854m = aVar;
        this.f132852a = gVar;
        this.f132855n = gVar2;
    }
}
