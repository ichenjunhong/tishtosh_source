package com.bytedance.frameworks.baselib.network.http.p570c.p571a;

import com.bytedance.frameworks.baselib.network.http.C9894e;
import com.bytedance.frameworks.baselib.network.http.C9894e.C9897c;
import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.TimeUnit;
import okhttp3.C53653j;
import okhttp3.C53659m;
import okhttp3.C53662o;
import okhttp3.C53676u;
import okhttp3.C53682y;
import okhttp3.C53682y.C53684a;
import okhttp3.C53685z;

/* renamed from: com.bytedance.frameworks.baselib.network.http.c.a.b */
public final class C9860b {

    /* renamed from: b */
    private static int f26837b;

    /* renamed from: a */
    private C53682y f26838a;

    /* renamed from: a */
    public final C53682y mo17710a() {
        C9894e.m19834h();
        synchronized (C9894e.class) {
            if (this.f26838a != null) {
                C53682y yVar = this.f26838a;
                if (f26837b > 0 && f26837b < 4 && yVar != null) {
                    C53684a b = yVar.mo111653b();
                    m19724a(b);
                    b.mo111667a();
                }
                C53682y yVar2 = this.f26838a;
                return yVar2;
            }
            C53684a aVar = new C53684a();
            if (f26837b > 0 && f26837b < 4) {
                m19724a(aVar);
            }
            aVar.mo111659a(new C53653j(15, 180000, TimeUnit.MILLISECONDS));
            aVar.mo111654a(15000, TimeUnit.MILLISECONDS);
            aVar.mo111668b(15000, TimeUnit.MILLISECONDS);
            aVar.mo111672c(15000, TimeUnit.MILLISECONDS);
            aVar.mo111670b((C53676u) new C53676u() {
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
                        java.lang.String r2 = "x-net-info.remoteaddr"
                        java.net.InetAddress r1 = r1.getAddress()     // Catch:{ Throwable -> 0x0032 }
                        java.lang.String r1 = r1.getHostAddress()     // Catch:{ Throwable -> 0x0032 }
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
                    throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.p570c.p571a.C9860b.C98611.intercept(okhttp3.u$a):okhttp3.ad");
                }
            });
            aVar.mo111662a((C53662o) new C53662o() {
                public final List<InetAddress> lookup(String str) throws UnknownHostException {
                    boolean z;
                    if (C9894e.f26962g != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (!z) {
                        return C53662o.f133125b.lookup(str);
                    }
                    List<InetAddress> list = null;
                    try {
                        C9897c cVar = C9894e.f26963h;
                        if (cVar != null) {
                            list = cVar.mo17823a(str);
                        }
                    } catch (Exception unused) {
                    }
                    if (list == null || list.isEmpty()) {
                        return C53662o.f133125b.lookup(str);
                    }
                    return list;
                }
            });
            aVar.mo111660a(C53659m.f133117a);
            aVar.mo111665a((C53676u) new C9863c());
            aVar.mo111665a((C53676u) new C9864d());
            this.f26838a = aVar.mo111667a();
            return this.f26838a;
        }
    }

    /* renamed from: a */
    public static void m19723a(int i) {
        if (i > 0 && f26837b == 0) {
            f26837b = i;
        }
    }

    /* renamed from: a */
    private static void m19724a(C53684a aVar) {
        if (aVar != null) {
            ArrayList arrayList = new ArrayList();
            switch (f26837b) {
                case 1:
                    arrayList.add(C53685z.HTTP_2);
                    break;
                case 2:
                    arrayList.add(C53685z.SPDY_3);
                    break;
                case 3:
                    break;
                default:
                    arrayList.add(C53685z.HTTP_2);
                    arrayList.add(C53685z.SPDY_3);
                    break;
            }
            f26837b = 4;
            arrayList.add(C53685z.HTTP_1_1);
            aVar.mo111655a(Collections.unmodifiableList(arrayList));
        }
    }
}
