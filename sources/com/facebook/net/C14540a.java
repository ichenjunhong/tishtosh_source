package com.facebook.net;

import com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9863c;
import okhttp3.C53676u;
import okhttp3.C53682y;
import okhttp3.C53682y.C53684a;

/* renamed from: com.facebook.net.a */
public class C14540a {

    /* renamed from: a */
    private static C53682y f37776a;

    /* renamed from: a */
    public static C53682y m29786a() {
        synchronized (C14540a.class) {
            if (f37776a != null) {
                C53682y yVar = f37776a;
                return yVar;
            }
            C53684a aVar = new C53684a();
            aVar.mo111665a((C53676u) new C9863c());
            aVar.f133222f.add(new C53676u() {
                /* JADX WARNING: Can't wrap try/catch for region: R(9:0|1|2|(1:4)(1:5)|(2:7|8)|9|10|(4:12|13|14|25)(1:27)|(1:(1:23))) */
                /* JADX WARNING: Code restructure failed: missing block: B:16:0x0033, code lost:
                    r4 = move-exception;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:17:0x0034, code lost:
                    if (r1 != null) goto L_0x0036;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:19:?, code lost:
                    r0 = r4.getMessage();
                    r2 = new java.lang.StringBuilder();
                    r2.append(r1.getAddress().getHostAddress());
                    r2.append("|");
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:20:0x004f, code lost:
                    if (r0 == null) goto L_0x0051;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:21:0x0051, code lost:
                    r0 = com.p683ss.android.ttve.nativePort.TEVideoRecorder.FACE_BEAUTY_NULL;
                 */
                /* JADX WARNING: Code restructure failed: missing block: B:22:0x0053, code lost:
                    r2.append(r0);
                    com.bytedance.common.utility.p526f.C9409b.m18609a((java.lang.Object) r4).mo17050a("detailMessage", (java.lang.Object) r2.toString());
                 */
                /* JADX WARNING: Failed to process nested try/catch */
                /* JADX WARNING: Missing exception handler attribute for start block: B:9:0x0016 */
                /* JADX WARNING: Removed duplicated region for block: B:12:0x001c A[SYNTHETIC, Splitter:B:12:0x001c] */
                /* JADX WARNING: Removed duplicated region for block: B:27:? A[RETURN, SYNTHETIC] */
                /* Code decompiled incorrectly, please refer to instructions dump. */
                public final okhttp3.C53504ad intercept(okhttp3.C53676u.C53677a r4) throws java.io.IOException {
                    /*
                        r3 = this;
                        okhttp3.ab r0 = r4.mo111416a()
                        r1 = 0
                        okhttp3.i r2 = r4.mo111419b()     // Catch:{ Throwable -> 0x0016 }
                        if (r2 == 0) goto L_0x0010
                        okhttp3.af r2 = r2.mo111336a()     // Catch:{ Throwable -> 0x0016 }
                        goto L_0x0011
                    L_0x0010:
                        r2 = r1
                    L_0x0011:
                        if (r2 == 0) goto L_0x0016
                        java.net.InetSocketAddress r2 = r2.f132432c     // Catch:{ Throwable -> 0x0016 }
                        r1 = r2
                    L_0x0016:
                        okhttp3.ad r4 = r4.mo111417a(r0)     // Catch:{ IOException -> 0x0033 }
                        if (r1 == 0) goto L_0x0032
                        okhttp3.ad$a r0 = r4.mo111277b()     // Catch:{ Throwable -> 0x0032 }
                        java.net.InetAddress r1 = r1.getAddress()     // Catch:{ Throwable -> 0x0032 }
                        java.lang.String r1 = r1.getHostAddress()     // Catch:{ Throwable -> 0x0032 }
                        java.lang.String r2 = "x-snssdk.remoteaddr"
                        r0.mo111284a(r2, r1)     // Catch:{ Throwable -> 0x0032 }
                        okhttp3.ad r0 = r0.mo111291a()     // Catch:{ Throwable -> 0x0032 }
                        r4 = r0
                    L_0x0032:
                        return r4
                    L_0x0033:
                        r4 = move-exception
                        if (r1 == 0) goto L_0x0063
                        java.lang.String r0 = r4.getMessage()     // Catch:{ Throwable -> 0x0063 }
                        java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0063 }
                        r2.<init>()     // Catch:{ Throwable -> 0x0063 }
                        java.net.InetAddress r1 = r1.getAddress()     // Catch:{ Throwable -> 0x0063 }
                        java.lang.String r1 = r1.getHostAddress()     // Catch:{ Throwable -> 0x0063 }
                        r2.append(r1)     // Catch:{ Throwable -> 0x0063 }
                        java.lang.String r1 = "|"
                        r2.append(r1)     // Catch:{ Throwable -> 0x0063 }
                        if (r0 != 0) goto L_0x0053
                        java.lang.String r0 = "null"
                    L_0x0053:
                        r2.append(r0)     // Catch:{ Throwable -> 0x0063 }
                        com.bytedance.common.utility.f.b r0 = com.bytedance.common.utility.p526f.C9409b.m18609a(r4)     // Catch:{ Throwable -> 0x0063 }
                        java.lang.String r1 = "detailMessage"
                        java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0063 }
                        r0.mo17050a(r1, r2)     // Catch:{ Throwable -> 0x0063 }
                    L_0x0063:
                        throw r4
                    */
                    throw new UnsupportedOperationException("Method not decompiled: com.facebook.net.C14540a.C145411.intercept(okhttp3.u$a):okhttp3.ad");
                }
            });
            f37776a = aVar.mo111667a();
            return f37776a;
        }
    }
}
