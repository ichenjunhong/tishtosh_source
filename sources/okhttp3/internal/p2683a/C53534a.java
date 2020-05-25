package okhttp3.internal.p2683a;

import okhttp3.C53504ad;
import okhttp3.C53506ae;
import okhttp3.C53671s;
import okhttp3.C53671s.C53672a;
import okhttp3.C53676u;
import okhttp3.internal.C53533a;

/* renamed from: okhttp3.internal.a.a */
public final class C53534a implements C53676u {

    /* renamed from: a */
    final C53547f f132617a;

    public C53534a(C53547f fVar) {
        this.f132617a = fVar;
    }

    /* renamed from: a */
    private static C53504ad m113705a(C53504ad adVar) {
        if (adVar == null || adVar.f132404g == null) {
            return adVar;
        }
        return adVar.mo111277b().mo111287a((C53506ae) null).mo111291a();
    }

    /* renamed from: b */
    private static boolean m113708b(String str) {
        if ("Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str)) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    private static boolean m113707a(String str) {
        if ("Connection".equalsIgnoreCase(str) || "Keep-Alive".equalsIgnoreCase(str) || "Proxy-Authenticate".equalsIgnoreCase(str) || "Proxy-Authorization".equalsIgnoreCase(str) || "TE".equalsIgnoreCase(str) || "Trailers".equalsIgnoreCase(str) || "Transfer-Encoding".equalsIgnoreCase(str) || "Upgrade".equalsIgnoreCase(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: type inference failed for: r3v1, types: [okhttp3.ad, okhttp3.ab] */
    /* JADX WARNING: type inference failed for: r3v29 */
    /* JADX WARNING: type inference failed for: r3v34 */
    /* JADX WARNING: type inference failed for: r3v35 */
    /* JADX WARNING: type inference failed for: r3v40 */
    /* JADX WARNING: type inference failed for: r3v46 */
    /* JADX WARNING: type inference failed for: r3v50 */
    /* JADX WARNING: type inference failed for: r3v51 */
    /* JADX WARNING: Code restructure failed: missing block: B:45:0x00f3, code lost:
        if (r2 > 0) goto L_0x0133;
     */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r3v1, types: [okhttp3.ad, okhttp3.ab]
      assigns: []
      uses: [okhttp3.ab, okhttp3.ad]
      mth insns count: 328
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Removed duplicated region for block: B:110:0x021f  */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0226 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:116:0x0234 A[ADDED_TO_REGION] */
    /* JADX WARNING: Removed duplicated region for block: B:120:0x0270  */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0281  */
    /* JADX WARNING: Unknown variable types count: 3 */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final okhttp3.C53504ad intercept(okhttp3.C53676u.C53677a r19) throws java.io.IOException {
        /*
            r18 = this;
            r1 = r18
            okhttp3.internal.a.f r0 = r1.f132617a
            r2 = 0
            if (r0 == 0) goto L_0x0013
            okhttp3.internal.a.f r0 = r1.f132617a
            okhttp3.ab r3 = r19.mo111416a()
            okhttp3.ad r0 = r0.mo111312a(r3)
            r3 = r0
            goto L_0x0014
        L_0x0013:
            r3 = r2
        L_0x0014:
            long r4 = java.lang.System.currentTimeMillis()
            okhttp3.internal.a.c$a r0 = new okhttp3.internal.a.c$a
            okhttp3.ab r6 = r19.mo111416a()
            r0.<init>(r4, r6, r3)
            okhttp3.ad r4 = r0.f132627c
            if (r4 != 0) goto L_0x0031
            okhttp3.internal.a.c r4 = new okhttp3.internal.a.c
            okhttp3.ab r5 = r0.f132626b
            r4.<init>(r5, r2)
        L_0x002c:
            r17 = r3
            r3 = r2
            goto L_0x0204
        L_0x0031:
            okhttp3.ab r4 = r0.f132626b
            boolean r4 = r4.mo111258c()
            if (r4 == 0) goto L_0x0047
            okhttp3.ad r4 = r0.f132627c
            okhttp3.r r4 = r4.f132402e
            if (r4 != 0) goto L_0x0047
            okhttp3.internal.a.c r4 = new okhttp3.internal.a.c
            okhttp3.ab r5 = r0.f132626b
            r4.<init>(r5, r2)
            goto L_0x002c
        L_0x0047:
            okhttp3.ad r4 = r0.f132627c
            okhttp3.ab r5 = r0.f132626b
            boolean r4 = okhttp3.internal.p2683a.C53537c.m113711a(r4, r5)
            if (r4 != 0) goto L_0x0059
            okhttp3.internal.a.c r4 = new okhttp3.internal.a.c
            okhttp3.ab r5 = r0.f132626b
            r4.<init>(r5, r2)
            goto L_0x002c
        L_0x0059:
            okhttp3.ab r4 = r0.f132626b
            okhttp3.d r4 = r4.mo111257b()
            boolean r5 = r4.f132472c
            if (r5 != 0) goto L_0x01fa
            okhttp3.ab r5 = r0.f132626b
            java.lang.String r6 = "If-Modified-Since"
            java.lang.String r6 = r5.mo111255a(r6)
            if (r6 != 0) goto L_0x0078
            java.lang.String r6 = "If-None-Match"
            java.lang.String r5 = r5.mo111255a(r6)
            if (r5 == 0) goto L_0x0076
            goto L_0x0078
        L_0x0076:
            r5 = 0
            goto L_0x0079
        L_0x0078:
            r5 = 1
        L_0x0079:
            if (r5 == 0) goto L_0x007d
            goto L_0x01fa
        L_0x007d:
            okhttp3.ad r5 = r0.f132627c
            okhttp3.d r5 = r5.mo111278c()
            boolean r6 = r5.f132483n
            if (r6 == 0) goto L_0x008f
            okhttp3.internal.a.c r4 = new okhttp3.internal.a.c
            okhttp3.ad r5 = r0.f132627c
            r4.<init>(r2, r5)
            goto L_0x002c
        L_0x008f:
            java.util.Date r6 = r0.f132628d
            r9 = 0
            if (r6 == 0) goto L_0x00a3
            long r11 = r0.f132634j
            java.util.Date r6 = r0.f132628d
            long r13 = r6.getTime()
            long r11 = r11 - r13
            long r11 = java.lang.Math.max(r9, r11)
            goto L_0x00a4
        L_0x00a3:
            r11 = r9
        L_0x00a4:
            int r6 = r0.f132636l
            r13 = -1
            if (r6 == r13) goto L_0x00b6
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            int r14 = r0.f132636l
            long r14 = (long) r14
            long r14 = r6.toMillis(r14)
            long r11 = java.lang.Math.max(r11, r14)
        L_0x00b6:
            long r14 = r0.f132634j
            long r7 = r0.f132633i
            long r14 = r14 - r7
            long r6 = r0.f132625a
            r17 = r3
            long r2 = r0.f132634j
            long r6 = r6 - r2
            long r11 = r11 + r14
            long r11 = r11 + r6
            okhttp3.ad r2 = r0.f132627c
            okhttp3.d r2 = r2.mo111278c()
            int r3 = r2.f132474e
            if (r3 == r13) goto L_0x00d8
            java.util.concurrent.TimeUnit r3 = java.util.concurrent.TimeUnit.SECONDS
            int r2 = r2.f132474e
            long r6 = (long) r2
            long r2 = r3.toMillis(r6)
            goto L_0x0133
        L_0x00d8:
            java.util.Date r2 = r0.f132632h
            if (r2 == 0) goto L_0x00f6
            java.util.Date r2 = r0.f132628d
            if (r2 == 0) goto L_0x00e7
            java.util.Date r2 = r0.f132628d
            long r2 = r2.getTime()
            goto L_0x00e9
        L_0x00e7:
            long r2 = r0.f132634j
        L_0x00e9:
            java.util.Date r6 = r0.f132632h
            long r6 = r6.getTime()
            long r2 = r6 - r2
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0132
            goto L_0x0133
        L_0x00f6:
            java.util.Date r2 = r0.f132630f
            if (r2 == 0) goto L_0x0132
            okhttp3.ad r2 = r0.f132627c
            okhttp3.ab r2 = r2.f132398a
            okhttp3.t r2 = r2.f132378a
            java.util.List<java.lang.String> r3 = r2.f133146g
            if (r3 != 0) goto L_0x0106
            r2 = 0
            goto L_0x0114
        L_0x0106:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.util.List<java.lang.String> r2 = r2.f133146g
            okhttp3.C53673t.m114179b(r3, r2)
            java.lang.String r2 = r3.toString()
        L_0x0114:
            if (r2 != 0) goto L_0x0132
            java.util.Date r2 = r0.f132628d
            if (r2 == 0) goto L_0x0121
            java.util.Date r2 = r0.f132628d
            long r2 = r2.getTime()
            goto L_0x0123
        L_0x0121:
            long r2 = r0.f132633i
        L_0x0123:
            java.util.Date r6 = r0.f132630f
            long r6 = r6.getTime()
            long r2 = r2 - r6
            int r6 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r6 <= 0) goto L_0x0132
            r6 = 10
            long r2 = r2 / r6
            goto L_0x0133
        L_0x0132:
            r2 = r9
        L_0x0133:
            int r6 = r4.f132474e
            if (r6 == r13) goto L_0x0144
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            int r7 = r4.f132474e
            long r7 = (long) r7
            long r6 = r6.toMillis(r7)
            long r2 = java.lang.Math.min(r2, r6)
        L_0x0144:
            int r6 = r4.f132480k
            if (r6 == r13) goto L_0x0152
            java.util.concurrent.TimeUnit r6 = java.util.concurrent.TimeUnit.SECONDS
            int r7 = r4.f132480k
            long r7 = (long) r7
            long r6 = r6.toMillis(r7)
            goto L_0x0153
        L_0x0152:
            r6 = r9
        L_0x0153:
            boolean r8 = r5.f132478i
            if (r8 != 0) goto L_0x0164
            int r8 = r4.f132479j
            if (r8 == r13) goto L_0x0164
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.SECONDS
            int r4 = r4.f132479j
            long r9 = (long) r4
            long r9 = r8.toMillis(r9)
        L_0x0164:
            boolean r4 = r5.f132472c
            if (r4 != 0) goto L_0x01af
            long r6 = r6 + r11
            long r9 = r9 + r2
            int r4 = (r6 > r9 ? 1 : (r6 == r9 ? 0 : -1))
            if (r4 >= 0) goto L_0x01af
            okhttp3.ad r4 = r0.f132627c
            okhttp3.ad$a r4 = r4.mo111277b()
            int r5 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r5 < 0) goto L_0x017f
            java.lang.String r2 = "Warning"
            java.lang.String r3 = "110 HttpURLConnection \"Response is stale\""
            r4.mo111284a(r2, r3)
        L_0x017f:
            r2 = 86400000(0x5265c00, double:4.2687272E-316)
            int r5 = (r11 > r2 ? 1 : (r11 == r2 ? 0 : -1))
            if (r5 <= 0) goto L_0x01a2
            okhttp3.ad r2 = r0.f132627c
            okhttp3.d r2 = r2.mo111278c()
            int r2 = r2.f132474e
            if (r2 != r13) goto L_0x0197
            java.util.Date r2 = r0.f132632h
            if (r2 != 0) goto L_0x0197
            r16 = 1
            goto L_0x0199
        L_0x0197:
            r16 = 0
        L_0x0199:
            if (r16 == 0) goto L_0x01a2
            java.lang.String r2 = "Warning"
            java.lang.String r3 = "113 HttpURLConnection \"Heuristic expiration\""
            r4.mo111284a(r2, r3)
        L_0x01a2:
            okhttp3.internal.a.c r2 = new okhttp3.internal.a.c
            okhttp3.ad r3 = r4.mo111291a()
            r4 = 0
            r2.<init>(r4, r3)
            r3 = r4
            r4 = r2
            goto L_0x0204
        L_0x01af:
            java.lang.String r2 = r0.f132635k
            if (r2 == 0) goto L_0x01b8
            java.lang.String r2 = "If-None-Match"
            java.lang.String r3 = r0.f132635k
            goto L_0x01c9
        L_0x01b8:
            java.util.Date r2 = r0.f132630f
            if (r2 == 0) goto L_0x01c1
            java.lang.String r2 = "If-Modified-Since"
            java.lang.String r3 = r0.f132631g
            goto L_0x01c9
        L_0x01c1:
            java.util.Date r2 = r0.f132628d
            if (r2 == 0) goto L_0x01f1
            java.lang.String r2 = "If-Modified-Since"
            java.lang.String r3 = r0.f132629e
        L_0x01c9:
            okhttp3.ab r4 = r0.f132626b
            okhttp3.s r4 = r4.f132380c
            okhttp3.s$a r4 = r4.mo111598d()
            okhttp3.internal.a r5 = okhttp3.internal.C53533a.f132616a
            r5.mo111346a(r4, r2, r3)
            okhttp3.ab r2 = r0.f132626b
            okhttp3.ab$a r2 = r2.mo111256a()
            okhttp3.s r3 = r4.mo111605a()
            okhttp3.ab$a r2 = r2.mo111267a(r3)
            okhttp3.ab r2 = r2.mo111272c()
            okhttp3.internal.a.c r4 = new okhttp3.internal.a.c
            okhttp3.ad r3 = r0.f132627c
            r4.<init>(r2, r3)
            r3 = 0
            goto L_0x0204
        L_0x01f1:
            okhttp3.internal.a.c r4 = new okhttp3.internal.a.c
            okhttp3.ab r2 = r0.f132626b
            r3 = 0
            r4.<init>(r2, r3)
            goto L_0x0204
        L_0x01fa:
            r17 = r3
            r3 = r2
            okhttp3.internal.a.c r4 = new okhttp3.internal.a.c
            okhttp3.ab r2 = r0.f132626b
            r4.<init>(r2, r3)
        L_0x0204:
            okhttp3.ab r2 = r4.f132623a
            if (r2 == 0) goto L_0x0217
            okhttp3.ab r0 = r0.f132626b
            okhttp3.d r0 = r0.mo111257b()
            boolean r0 = r0.f132481l
            if (r0 == 0) goto L_0x0217
            okhttp3.internal.a.c r4 = new okhttp3.internal.a.c
            r4.<init>(r3, r3)
        L_0x0217:
            okhttp3.ab r0 = r4.f132623a
            okhttp3.ad r2 = r4.f132624b
            okhttp3.internal.a.f r3 = r1.f132617a
            if (r3 == 0) goto L_0x0224
            okhttp3.internal.a.f r3 = r1.f132617a
            r3.mo111316a(r4)
        L_0x0224:
            if (r17 == 0) goto L_0x0230
            if (r2 != 0) goto L_0x0230
            r3 = r17
            okhttp3.ae r4 = r3.f132404g
            okhttp3.internal.C53559c.m113805a(r4)
            goto L_0x0232
        L_0x0230:
            r3 = r17
        L_0x0232:
            if (r0 != 0) goto L_0x026e
            if (r2 != 0) goto L_0x026e
            okhttp3.ad$a r0 = new okhttp3.ad$a
            r0.<init>()
            okhttp3.ab r2 = r19.mo111416a()
            okhttp3.ad$a r0 = r0.mo111285a(r2)
            okhttp3.z r2 = okhttp3.C53685z.HTTP_1_1
            okhttp3.ad$a r0 = r0.mo111290a(r2)
            r2 = 504(0x1f8, float:7.06E-43)
            okhttp3.ad$a r0 = r0.mo111281a(r2)
            java.lang.String r2 = "Unsatisfiable Request (only-if-cached)"
            okhttp3.ad$a r0 = r0.mo111283a(r2)
            okhttp3.ae r2 = okhttp3.internal.C53559c.f132735c
            okhttp3.ad$a r0 = r0.mo111287a(r2)
            r2 = -1
            okhttp3.ad$a r0 = r0.mo111282a(r2)
            long r2 = java.lang.System.currentTimeMillis()
            okhttp3.ad$a r0 = r0.mo111292b(r2)
            okhttp3.ad r0 = r0.mo111291a()
            return r0
        L_0x026e:
            if (r0 != 0) goto L_0x0281
            okhttp3.ad$a r0 = r2.mo111277b()
            okhttp3.ad r2 = m113705a(r2)
            okhttp3.ad$a r0 = r0.mo111293b(r2)
            okhttp3.ad r0 = r0.mo111291a()
            return r0
        L_0x0281:
            r4 = r19
            okhttp3.ad r4 = r4.mo111417a(r0)     // Catch:{ all -> 0x0354 }
            if (r4 != 0) goto L_0x0290
            if (r3 == 0) goto L_0x0290
            okhttp3.ae r3 = r3.f132404g
            okhttp3.internal.C53559c.m113805a(r3)
        L_0x0290:
            if (r2 == 0) goto L_0x02dd
            int r3 = r4.f132400c
            r5 = 304(0x130, float:4.26E-43)
            if (r3 != r5) goto L_0x02d8
            okhttp3.ad$a r0 = r2.mo111277b()
            okhttp3.s r3 = r2.f132403f
            okhttp3.s r5 = r4.f132403f
            okhttp3.s r3 = m113706a(r3, r5)
            okhttp3.ad$a r0 = r0.mo111289a(r3)
            long r5 = r4.f132408k
            okhttp3.ad$a r0 = r0.mo111282a(r5)
            long r5 = r4.f132409l
            okhttp3.ad$a r0 = r0.mo111292b(r5)
            okhttp3.ad r3 = m113705a(r2)
            okhttp3.ad$a r0 = r0.mo111293b(r3)
            okhttp3.ad r3 = m113705a(r4)
            okhttp3.ad$a r0 = r0.mo111286a(r3)
            okhttp3.ad r0 = r0.mo111291a()
            okhttp3.ae r3 = r4.f132404g
            r3.close()
            okhttp3.internal.a.f r3 = r1.f132617a
            r3.mo111314a()
            okhttp3.internal.a.f r3 = r1.f132617a
            r3.mo111315a(r2, r0)
            return r0
        L_0x02d8:
            okhttp3.ae r3 = r2.f132404g
            okhttp3.internal.C53559c.m113805a(r3)
        L_0x02dd:
            okhttp3.ad$a r3 = r4.mo111277b()
            okhttp3.ad r2 = m113705a(r2)
            okhttp3.ad$a r2 = r3.mo111293b(r2)
            okhttp3.ad r3 = m113705a(r4)
            okhttp3.ad$a r2 = r2.mo111286a(r3)
            okhttp3.ad r2 = r2.mo111291a()
            okhttp3.internal.a.f r3 = r1.f132617a
            if (r3 == 0) goto L_0x0353
            boolean r3 = okhttp3.internal.p2685c.C53568e.m113836b(r2)
            if (r3 == 0) goto L_0x0346
            boolean r3 = okhttp3.internal.p2683a.C53537c.m113711a(r2, r0)
            if (r3 == 0) goto L_0x0346
            okhttp3.internal.a.f r0 = r1.f132617a
            okhttp3.internal.a.b r0 = r0.mo111313a(r2)
            if (r0 != 0) goto L_0x030e
            return r2
        L_0x030e:
            okio.Sink r3 = r0.mo111319b()
            if (r3 != 0) goto L_0x0315
            return r2
        L_0x0315:
            okhttp3.ae r4 = r2.f132404g
            okio.BufferedSource r4 = r4.source()
            okio.BufferedSink r3 = okio.Okio.buffer(r3)
            okhttp3.internal.a.a$1 r5 = new okhttp3.internal.a.a$1
            r5.<init>(r4, r0, r3)
            java.lang.String r0 = "Content-Type"
            java.lang.String r0 = r2.mo111276b(r0)
            okhttp3.ae r3 = r2.f132404g
            long r3 = r3.contentLength()
            okhttp3.ad$a r2 = r2.mo111277b()
            okhttp3.internal.c.h r6 = new okhttp3.internal.c.h
            okio.BufferedSource r5 = okio.Okio.buffer(r5)
            r6.<init>(r0, r3, r5)
            okhttp3.ad$a r0 = r2.mo111287a(r6)
            okhttp3.ad r0 = r0.mo111291a()
            return r0
        L_0x0346:
            java.lang.String r3 = r0.f132379b
            boolean r3 = okhttp3.internal.p2685c.C53569f.m113837a(r3)
            if (r3 == 0) goto L_0x0353
            okhttp3.internal.a.f r3 = r1.f132617a     // Catch:{ IOException -> 0x0353 }
            r3.mo111317b(r0)     // Catch:{ IOException -> 0x0353 }
        L_0x0353:
            return r2
        L_0x0354:
            r0 = move-exception
            r2 = r0
            if (r3 == 0) goto L_0x035d
            okhttp3.ae r0 = r3.f132404g
            okhttp3.internal.C53559c.m113805a(r0)
        L_0x035d:
            throw r2
        */
        throw new UnsupportedOperationException("Method not decompiled: okhttp3.internal.p2683a.C53534a.intercept(okhttp3.u$a):okhttp3.ad");
    }

    /* renamed from: a */
    private static C53671s m113706a(C53671s sVar, C53671s sVar2) {
        C53672a aVar = new C53672a();
        int a = sVar.mo111591a();
        for (int i = 0; i < a; i++) {
            String a2 = sVar.mo111592a(i);
            String b = sVar.mo111594b(i);
            if ((!"Warning".equalsIgnoreCase(a2) || !b.startsWith("1")) && (m113708b(a2) || !m113707a(a2) || sVar2.mo111593a(a2) == null)) {
                C53533a.f132616a.mo111346a(aVar, a2, b);
            }
        }
        int a3 = sVar2.mo111591a();
        for (int i2 = 0; i2 < a3; i2++) {
            String a4 = sVar2.mo111592a(i2);
            if (!m113708b(a4) && m113707a(a4)) {
                C53533a.f132616a.mo111346a(aVar, a4, sVar2.mo111594b(i2));
            }
        }
        return aVar.mo111605a();
    }
}
