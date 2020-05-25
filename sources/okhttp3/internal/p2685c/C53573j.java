package okhttp3.internal.p2685c;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;
import java.security.cert.CertificateException;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLHandshakeException;
import javax.net.ssl.SSLPeerUnverifiedException;
import javax.net.ssl.SSLSocketFactory;
import okhttp3.C53495a;
import okhttp3.C53498ab;
import okhttp3.C53504ad;
import okhttp3.C53527g;
import okhttp3.C53673t;
import okhttp3.C53676u;
import okhttp3.C53682y;
import okhttp3.internal.p2684b.C53557g;

/* renamed from: okhttp3.internal.c.j */
public final class C53573j implements C53676u {

    /* renamed from: a */
    public volatile C53557g f132775a;

    /* renamed from: b */
    public Object f132776b;

    /* renamed from: c */
    public volatile boolean f132777c;

    /* renamed from: d */
    private final C53682y f132778d;

    /* renamed from: e */
    private final boolean f132779e;

    /* renamed from: a */
    public final void mo111424a() {
        this.f132777c = true;
        C53557g gVar = this.f132775a;
        if (gVar != null) {
            gVar.mo111403e();
        }
    }

    /* renamed from: a */
    private C53495a m113850a(C53673t tVar) {
        C53527g gVar;
        HostnameVerifier hostnameVerifier;
        SSLSocketFactory sSLSocketFactory;
        C53673t tVar2 = tVar;
        if (tVar.mo111613c()) {
            SSLSocketFactory sSLSocketFactory2 = this.f132778d.f133204o;
            hostnameVerifier = this.f132778d.f133206q;
            sSLSocketFactory = sSLSocketFactory2;
            gVar = this.f132778d.f133207r;
        } else {
            sSLSocketFactory = null;
            hostnameVerifier = null;
            gVar = null;
        }
        C53495a aVar = new C53495a(tVar2.f133143d, tVar2.f133144e, this.f132778d.f133211v, this.f132778d.f133203n, sSLSocketFactory, hostnameVerifier, gVar, this.f132778d.f133208s, this.f132778d.f133193d, this.f132778d.f133194e, this.f132778d.f133195f, this.f132778d.f133199j);
        return aVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:46:0x00cc, code lost:
        r12 = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00dd, code lost:
        if (r5.equals("HEAD") == false) goto L_0x015d;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:76:0x015d, code lost:
        r12 = null;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:77:0x015e, code lost:
        if (r12 != null) goto L_0x0168;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:79:0x0162, code lost:
        if (r14.f132779e != false) goto L_0x0167;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x0164, code lost:
        r9.mo111401c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:81:0x0167, code lost:
        return r0;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:82:0x0168, code lost:
        okhttp3.internal.C53559c.m113805a((java.io.Closeable) r0.f132404g);
        r13 = r2 + 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:83:0x0171, code lost:
        if (r13 > 20) goto L_0x01cc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:85:0x0177, code lost:
        if ((r12.f132381d instanceof okhttp3.internal.p2685c.C53575l) != false) goto L_0x01bf;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:87:0x017f, code lost:
        if (m113853a(r0, r12.f132378a) != false) goto L_0x019b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:88:0x0181, code lost:
        r9.mo111401c();
        r1 = new okhttp3.internal.p2684b.C53557g(r14.f132778d.f133210u, m113850a(r12.f132378a), r7, r8, r14.f132776b);
        r14.f132775a = r1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:90:0x019f, code lost:
        if (r9.mo111395a() != null) goto L_0x01a6;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:91:0x01a1, code lost:
        r1 = r0;
        r0 = r12;
        r2 = r13;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:92:0x01a6, code lost:
        r1 = new java.lang.StringBuilder("Closing the body of ");
        r1.append(r0);
        r1.append(" didn't close its backing stream. Bad interceptor?");
     */
    /* JADX WARNING: Code restructure failed: missing block: B:93:0x01be, code lost:
        throw new java.lang.IllegalStateException(r1.toString());
     */
    /* JADX WARNING: Code restructure failed: missing block: B:94:0x01bf, code lost:
        r9.mo111401c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:95:0x01cb, code lost:
        throw new java.net.HttpRetryException("Cannot retry streamed HTTP body", r0.f132400c);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:96:0x01cc, code lost:
        r9.mo111401c();
        r0 = new java.lang.StringBuilder("Too many follow-up requests: ");
        r0.append(r13);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:97:0x01e2, code lost:
        throw new java.net.ProtocolException(r0.toString());
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.C53504ad intercept(okhttp3.C53676u.C53677a r15) throws java.io.IOException {
        /*
            r14 = this;
            okhttp3.ab r0 = r15.mo111416a()
            okhttp3.internal.c.g r15 = (okhttp3.internal.p2685c.C53570g) r15
            okhttp3.e r7 = r15.mo111423f()
            okhttp3.p r8 = r15.f132762c
            okhttp3.internal.b.g r9 = new okhttp3.internal.b.g
            okhttp3.y r1 = r14.f132778d
            okhttp3.j r2 = r1.f133210u
            okhttp3.t r1 = r0.f132378a
            okhttp3.a r3 = r14.m113850a(r1)
            java.lang.Object r6 = r14.f132776b
            r1 = r9
            r4 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r14.f132775a = r9
            r10 = 0
            r11 = 0
            r1 = r11
            r2 = 0
        L_0x0026:
            boolean r3 = r14.f132777c
            if (r3 != 0) goto L_0x0214
            r3 = 1
            okhttp3.ad r4 = r15.mo111418a(r0, r9, r11, r11)     // Catch:{ e -> 0x01fb, IOException -> 0x01eb }
            if (r1 == 0) goto L_0x0057
            okhttp3.ad$a r0 = r4.mo111277b()
            okhttp3.ad$a r1 = r1.mo111277b()
            okhttp3.ad$a r1 = r1.mo111287a(r11)
            okhttp3.ad r1 = r1.mo111291a()
            if (r1 == 0) goto L_0x0050
            okhttp3.ae r4 = r1.f132404g
            if (r4 != 0) goto L_0x0048
            goto L_0x0050
        L_0x0048:
            java.lang.IllegalArgumentException r15 = new java.lang.IllegalArgumentException
            java.lang.String r0 = "priorResponse.body != null"
            r15.<init>(r0)
            throw r15
        L_0x0050:
            r0.f132420j = r1
            okhttp3.ad r0 = r0.mo111291a()
            goto L_0x0058
        L_0x0057:
            r0 = r4
        L_0x0058:
            okhttp3.af r1 = r9.f132718b
            if (r0 == 0) goto L_0x01e3
            int r4 = r0.f132400c
            okhttp3.ab r5 = r0.f132398a
            java.lang.String r5 = r5.f132379b
            switch(r4) {
                case 300: goto L_0x00df;
                case 301: goto L_0x00df;
                case 302: goto L_0x00df;
                case 303: goto L_0x00df;
                case 307: goto L_0x00cf;
                case 308: goto L_0x00cf;
                case 401: goto L_0x00c4;
                case 407: goto L_0x00a2;
                case 408: goto L_0x007f;
                case 503: goto L_0x0067;
                default: goto L_0x0065;
            }
        L_0x0065:
            goto L_0x015d
        L_0x0067:
            okhttp3.ad r1 = r0.f132407j
            if (r1 == 0) goto L_0x0073
            okhttp3.ad r1 = r0.f132407j
            int r1 = r1.f132400c
            r3 = 503(0x1f7, float:7.05E-43)
            if (r1 == r3) goto L_0x015d
        L_0x0073:
            r1 = 2147483647(0x7fffffff, float:NaN)
            int r1 = m113849a(r0, r1)
            if (r1 != 0) goto L_0x015d
            okhttp3.ab r1 = r0.f132398a
            goto L_0x00cc
        L_0x007f:
            okhttp3.y r1 = r14.f132778d
            boolean r1 = r1.f133214y
            if (r1 == 0) goto L_0x015d
            okhttp3.ab r1 = r0.f132398a
            okhttp3.ac r1 = r1.f132381d
            boolean r1 = r1 instanceof okhttp3.internal.p2685c.C53575l
            if (r1 != 0) goto L_0x015d
            okhttp3.ad r1 = r0.f132407j
            if (r1 == 0) goto L_0x0099
            okhttp3.ad r1 = r0.f132407j
            int r1 = r1.f132400c
            r3 = 408(0x198, float:5.72E-43)
            if (r1 == r3) goto L_0x015d
        L_0x0099:
            int r1 = m113849a(r0, r10)
            if (r1 > 0) goto L_0x015d
            okhttp3.ab r1 = r0.f132398a
            goto L_0x00cc
        L_0x00a2:
            if (r1 == 0) goto L_0x00a7
            java.net.Proxy r3 = r1.f132431b
            goto L_0x00ab
        L_0x00a7:
            okhttp3.y r3 = r14.f132778d
            java.net.Proxy r3 = r3.f133193d
        L_0x00ab:
            java.net.Proxy$Type r3 = r3.type()
            java.net.Proxy$Type r4 = java.net.Proxy.Type.HTTP
            if (r3 != r4) goto L_0x00bc
            okhttp3.y r3 = r14.f132778d
            okhttp3.b r3 = r3.f133208s
            okhttp3.ab r1 = r3.mo108806a(r1, r0)
            goto L_0x00cc
        L_0x00bc:
            java.net.ProtocolException r15 = new java.net.ProtocolException
            java.lang.String r0 = "Received HTTP_PROXY_AUTH (407) code while not using proxy"
            r15.<init>(r0)
            throw r15
        L_0x00c4:
            okhttp3.y r3 = r14.f132778d
            okhttp3.b r3 = r3.f133209t
            okhttp3.ab r1 = r3.mo108806a(r1, r0)
        L_0x00cc:
            r12 = r1
            goto L_0x015e
        L_0x00cf:
            java.lang.String r1 = "GET"
            boolean r1 = r5.equals(r1)
            if (r1 != 0) goto L_0x00df
            java.lang.String r1 = "HEAD"
            boolean r1 = r5.equals(r1)
            if (r1 == 0) goto L_0x015d
        L_0x00df:
            okhttp3.y r1 = r14.f132778d
            boolean r1 = r1.f133213x
            if (r1 == 0) goto L_0x015d
            java.lang.String r1 = "Location"
            java.lang.String r1 = r0.mo111276b(r1)
            if (r1 == 0) goto L_0x015d
            okhttp3.ab r4 = r0.f132398a
            okhttp3.t r4 = r4.f132378a
            okhttp3.t r1 = r4.mo111615d(r1)
            if (r1 == 0) goto L_0x015d
            java.lang.String r4 = r1.f133140a
            okhttp3.ab r6 = r0.f132398a
            okhttp3.t r6 = r6.f132378a
            java.lang.String r6 = r6.f133140a
            boolean r4 = r4.equals(r6)
            if (r4 != 0) goto L_0x010b
            okhttp3.y r4 = r14.f132778d
            boolean r4 = r4.f133212w
            if (r4 == 0) goto L_0x015d
        L_0x010b:
            okhttp3.ab r4 = r0.f132398a
            okhttp3.ab$a r4 = r4.mo111256a()
            boolean r6 = okhttp3.internal.p2685c.C53569f.m113839c(r5)
            if (r6 == 0) goto L_0x0148
            java.lang.String r6 = "PROPFIND"
            boolean r6 = r5.equals(r6)
            java.lang.String r12 = "PROPFIND"
            boolean r12 = r5.equals(r12)
            r3 = r3 ^ r12
            if (r3 == 0) goto L_0x012c
            java.lang.String r3 = "GET"
            r4.mo111264a(r3, r11)
            goto L_0x0137
        L_0x012c:
            if (r6 == 0) goto L_0x0133
            okhttp3.ab r3 = r0.f132398a
            okhttp3.ac r3 = r3.f132381d
            goto L_0x0134
        L_0x0133:
            r3 = r11
        L_0x0134:
            r4.mo111264a(r5, r3)
        L_0x0137:
            if (r6 != 0) goto L_0x0148
            java.lang.String r3 = "Transfer-Encoding"
            r4.mo111270b(r3)
            java.lang.String r3 = "Content-Length"
            r4.mo111270b(r3)
            java.lang.String r3 = "Content-Type"
            r4.mo111270b(r3)
        L_0x0148:
            boolean r3 = m113853a(r0, r1)
            if (r3 != 0) goto L_0x0153
            java.lang.String r3 = "Authorization"
            r4.mo111270b(r3)
        L_0x0153:
            okhttp3.ab$a r1 = r4.mo111268a(r1)
            okhttp3.ab r1 = r1.mo111272c()
            goto L_0x00cc
        L_0x015d:
            r12 = r11
        L_0x015e:
            if (r12 != 0) goto L_0x0168
            boolean r15 = r14.f132779e
            if (r15 != 0) goto L_0x0167
            r9.mo111401c()
        L_0x0167:
            return r0
        L_0x0168:
            okhttp3.ae r1 = r0.f132404g
            okhttp3.internal.C53559c.m113805a(r1)
            int r13 = r2 + 1
            r1 = 20
            if (r13 > r1) goto L_0x01cc
            okhttp3.ac r1 = r12.f132381d
            boolean r1 = r1 instanceof okhttp3.internal.p2685c.C53575l
            if (r1 != 0) goto L_0x01bf
            okhttp3.t r1 = r12.f132378a
            boolean r1 = m113853a(r0, r1)
            if (r1 != 0) goto L_0x019b
            r9.mo111401c()
            okhttp3.internal.b.g r9 = new okhttp3.internal.b.g
            okhttp3.y r1 = r14.f132778d
            okhttp3.j r2 = r1.f133210u
            okhttp3.t r1 = r12.f132378a
            okhttp3.a r3 = r14.m113850a(r1)
            java.lang.Object r6 = r14.f132776b
            r1 = r9
            r4 = r7
            r5 = r8
            r1.<init>(r2, r3, r4, r5, r6)
            r14.f132775a = r9
            goto L_0x01a1
        L_0x019b:
            okhttp3.internal.c.c r1 = r9.mo111395a()
            if (r1 != 0) goto L_0x01a6
        L_0x01a1:
            r1 = r0
            r0 = r12
            r2 = r13
            goto L_0x0026
        L_0x01a6:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Closing the body of "
            r1.<init>(r2)
            r1.append(r0)
            java.lang.String r0 = " didn't close its backing stream. Bad interceptor?"
            r1.append(r0)
            java.lang.String r0 = r1.toString()
            r15.<init>(r0)
            throw r15
        L_0x01bf:
            r9.mo111401c()
            java.net.HttpRetryException r15 = new java.net.HttpRetryException
            int r0 = r0.f132400c
            java.lang.String r1 = "Cannot retry streamed HTTP body"
            r15.<init>(r1, r0)
            throw r15
        L_0x01cc:
            r9.mo111401c()
            java.net.ProtocolException r15 = new java.net.ProtocolException
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "Too many follow-up requests: "
            r0.<init>(r1)
            r0.append(r13)
            java.lang.String r0 = r0.toString()
            r15.<init>(r0)
            throw r15
        L_0x01e3:
            java.lang.IllegalStateException r15 = new java.lang.IllegalStateException
            r15.<init>()
            throw r15
        L_0x01e9:
            r15 = move-exception
            goto L_0x020d
        L_0x01eb:
            r4 = move-exception
            boolean r5 = r4 instanceof okhttp3.internal.p2687e.C53585a     // Catch:{ all -> 0x01e9 }
            if (r5 != 0) goto L_0x01f1
            goto L_0x01f2
        L_0x01f1:
            r3 = 0
        L_0x01f2:
            boolean r3 = r14.m113851a(r4, r9, r3, r0)     // Catch:{ all -> 0x01e9 }
            if (r3 == 0) goto L_0x01fa
            goto L_0x0026
        L_0x01fa:
            throw r4     // Catch:{ all -> 0x01e9 }
        L_0x01fb:
            r3 = move-exception
            java.io.IOException r4 = r3.getLastConnectException()     // Catch:{ all -> 0x01e9 }
            boolean r4 = r14.m113851a(r4, r9, r10, r0)     // Catch:{ all -> 0x01e9 }
            if (r4 == 0) goto L_0x0208
            goto L_0x0026
        L_0x0208:
            java.io.IOException r15 = r3.getLastConnectException()     // Catch:{ all -> 0x01e9 }
            throw r15     // Catch:{ all -> 0x01e9 }
        L_0x020d:
            r9.mo111397a(r11)
            r9.mo111401c()
            throw r15
        L_0x0214:
            r9.mo111401c()
            java.io.IOException r15 = new java.io.IOException
            java.lang.String r0 = "Canceled"
            r15.<init>(r0)
            throw r15
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2685c.C53573j.intercept(okhttp3.u$a):okhttp3.ad");
    }

    public C53573j(C53682y yVar, boolean z) {
        this.f132778d = yVar;
        this.f132779e = z;
    }

    /* renamed from: a */
    private static int m113849a(C53504ad adVar, int i) {
        String b = adVar.mo111276b("Retry-After");
        if (b == null) {
            return i;
        }
        if (b.matches("\\d+")) {
            return Integer.valueOf(b).intValue();
        }
        return Integer.MAX_VALUE;
    }

    /* renamed from: a */
    private static boolean m113852a(IOException iOException, boolean z) {
        if (iOException instanceof ProtocolException) {
            return false;
        }
        if (iOException instanceof InterruptedIOException) {
            if (!(iOException instanceof SocketTimeoutException) || z) {
                return false;
            }
            return true;
        } else if ((!(iOException instanceof SSLHandshakeException) || !(iOException.getCause() instanceof CertificateException)) && !(iOException instanceof SSLPeerUnverifiedException)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: a */
    private static boolean m113853a(C53504ad adVar, C53673t tVar) {
        C53673t tVar2 = adVar.f132398a.f132378a;
        if (!tVar2.f133143d.equals(tVar.f133143d) || tVar2.f133144e != tVar.f133144e || !tVar2.f133140a.equals(tVar.f133140a)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private boolean m113851a(IOException iOException, C53557g gVar, boolean z, C53498ab abVar) {
        gVar.mo111397a(iOException);
        if (!this.f132778d.f133214y) {
            return false;
        }
        if ((!z || !(abVar.f132381d instanceof C53575l)) && m113852a(iOException, z) && gVar.mo111404f()) {
            return true;
        }
        return false;
    }
}
