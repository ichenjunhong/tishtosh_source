package com.toutiao.proxyserver.net;

import android.os.SystemClock;
import android.text.TextUtils;
import android.util.Pair;
import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.ugc.aweme.player.p2050a.C38828b;
import com.p683ss.android.ugc.aweme.video.preload.C48083f;
import com.toutiao.proxyserver.C51861k;
import com.toutiao.proxyserver.C51895s;
import com.toutiao.proxyserver.p2609a.C51798c;
import com.toutiao.proxyserver.p2614f.C51836b;
import com.toutiao.proxyserver.p2614f.C51838d;
import java.io.IOException;
import java.net.ConnectException;
import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.net.SocketTimeoutException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import okhttp3.C53498ab;
import okhttp3.C53498ab.C53499a;
import okhttp3.C53504ad;
import okhttp3.C53509af;
import okhttp3.C53532i;
import okhttp3.C53662o;
import okhttp3.C53671s;
import okhttp3.C53671s.C53672a;
import okhttp3.C53676u;
import okhttp3.C53676u.C53677a;
import okhttp3.C53682y;
import okhttp3.C53682y.C53684a;
import okhttp3.C53685z;

/* renamed from: com.toutiao.proxyserver.net.b */
public final class C51868b {

    /* renamed from: a */
    public static final Map<Long, C51798c> f129400a = new ConcurrentHashMap();

    /* renamed from: b */
    public static final Map<Long, Pair<String, List<InetAddress>>> f129401b = new ConcurrentHashMap();

    /* renamed from: c */
    private static C53682y f129402c;

    /* renamed from: a */
    public static synchronized C53682y m111236a() {
        C53682y yVar;
        synchronized (C51868b.class) {
            if (f129402c == null) {
                C53684a aVar = new C53684a();
                if (!C51895s.f129484s) {
                    aVar.mo111655a(Collections.singletonList(C53685z.HTTP_1_1));
                }
                aVar.mo111654a(10000, TimeUnit.MILLISECONDS).mo111668b(10000, TimeUnit.MILLISECONDS).mo111672c(10000, TimeUnit.MILLISECONDS);
                aVar.mo111662a((C53662o) new C53662o() {
                    /* JADX WARNING: Removed duplicated region for block: B:13:0x0038  */
                    /* Code decompiled incorrectly, please refer to instructions dump. */
                    public final java.util.List<java.net.InetAddress> lookup(java.lang.String r6) throws java.net.UnknownHostException {
                        /*
                            r5 = this;
                            boolean r0 = com.toutiao.proxyserver.C51895s.f129488w
                            r1 = 0
                            if (r0 == 0) goto L_0x0035
                            java.util.List r0 = com.bytedance.ttnet.C13303d.m26789a(r6)     // Catch:{ Throwable -> 0x0027 }
                            java.lang.String r1 = "TAG_PROXY_DNS"
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder     // Catch:{ Throwable -> 0x0025 }
                            java.lang.String r3 = "ttnet dns lookup: hostname: "
                            r2.<init>(r3)     // Catch:{ Throwable -> 0x0025 }
                            r2.append(r6)     // Catch:{ Throwable -> 0x0025 }
                            java.lang.String r3 = ", adds: "
                            r2.append(r3)     // Catch:{ Throwable -> 0x0025 }
                            r2.append(r0)     // Catch:{ Throwable -> 0x0025 }
                            java.lang.String r2 = r2.toString()     // Catch:{ Throwable -> 0x0025 }
                            com.toutiao.proxyserver.p2612d.C51820c.m111141b(r1, r2)     // Catch:{ Throwable -> 0x0025 }
                            goto L_0x0036
                        L_0x0025:
                            r1 = move-exception
                            goto L_0x002b
                        L_0x0027:
                            r0 = move-exception
                            r4 = r1
                            r1 = r0
                            r0 = r4
                        L_0x002b:
                            java.lang.String r2 = "TAG_PROXY_DNS"
                            java.lang.String r1 = com.toutiao.proxyserver.p2612d.C51820c.m111138a(r1)
                            com.toutiao.proxyserver.p2612d.C51820c.m111145d(r2, r1)
                            goto L_0x0036
                        L_0x0035:
                            r0 = r1
                        L_0x0036:
                            if (r0 != 0) goto L_0x0059
                            okhttp3.o r0 = okhttp3.C53662o.f133125b
                            java.util.List r0 = r0.lookup(r6)
                            java.lang.String r1 = "TAG_PROXY_DNS"
                            java.lang.StringBuilder r2 = new java.lang.StringBuilder
                            java.lang.String r3 = "system dns lookup: hostname: "
                            r2.<init>(r3)
                            r2.append(r6)
                            java.lang.String r3 = ", adds: "
                            r2.append(r3)
                            r2.append(r0)
                            java.lang.String r2 = r2.toString()
                            com.toutiao.proxyserver.p2612d.C51820c.m111141b(r1, r2)
                        L_0x0059:
                            if (r6 == 0) goto L_0x006e
                            if (r0 == 0) goto L_0x006e
                            java.util.Map<java.lang.Long, android.util.Pair<java.lang.String, java.util.List<java.net.InetAddress>>> r1 = com.toutiao.proxyserver.net.C51868b.f129401b
                            long r2 = com.toutiao.proxyserver.C51895s.m111281d()
                            java.lang.Long r2 = java.lang.Long.valueOf(r2)
                            android.util.Pair r6 = android.util.Pair.create(r6, r0)
                            r1.put(r2, r6)
                        L_0x006e:
                            return r0
                        */
                        throw new UnsupportedOperationException("Method not decompiled: com.toutiao.proxyserver.net.C51868b.C518691.lookup(java.lang.String):java.util.List");
                    }
                });
                aVar.f133221e.add(new C53676u() {
                    public final C53504ad intercept(C53677a aVar) throws IOException {
                        C53498ab a = aVar.mo111416a();
                        C53499a a2 = a.mo111256a();
                        long c = C51895s.m111280c();
                        final C51798c cVar = new C51798c();
                        cVar.f129246a = a.mo111255a("Vpwp-Raw-Key");
                        cVar.f129249d = a.f132378a.toString();
                        try {
                            if (a.mo111255a("local_url_index") != null) {
                                cVar.f129258m = Integer.valueOf(a.mo111255a("local_url_index")).intValue();
                            }
                            if (a.mo111255a("local_url_count") != null) {
                                cVar.f129259n = Integer.valueOf(a.mo111255a("local_url_count")).intValue();
                            }
                        } catch (Exception unused) {
                        }
                        a2.mo111261a((Object) Long.valueOf(c));
                        if (!C51895s.f129490y) {
                            a2.mo111270b("Vpwp-Raw-Key");
                        }
                        a2.mo111270b("local_url_index");
                        a2.mo111270b("local_url_count");
                        C51868b.f129400a.put(Long.valueOf(c), cVar);
                        C53498ab c2 = a2.mo111272c();
                        try {
                            long elapsedRealtime = SystemClock.elapsedRealtime();
                            C53504ad a3 = aVar.mo111417a(c2);
                            cVar.f129254i = SystemClock.elapsedRealtime() - elapsedRealtime;
                            cVar.f129257l = a3.f132400c;
                            try {
                                cVar.f129255j = Integer.parseInt(a3.mo111273a("Content-Length", "0"));
                            } catch (Exception unused2) {
                                cVar.f129255j = 0;
                            }
                            try {
                                cVar.f129256k = new HashMap();
                                cVar.f129256k.put(C48083f.f120829q, a3.mo111276b(C48083f.f120829q));
                                cVar.f129256k.put(C48083f.f120830r, a3.mo111276b(C48083f.f120830r));
                                cVar.f129256k.put(C38828b.f98803u, a3.mo111276b(C38828b.f98803u));
                                cVar.f129256k.put(C38828b.f98804v, C51868b.m111234a(a3.f132403f));
                            } catch (Exception unused3) {
                                cVar.f129256k = null;
                            }
                            C51868b.f129400a.remove(c2.f132382e);
                            Pair pair = (Pair) C51868b.f129401b.remove(c2.f132382e);
                            if (pair != null) {
                                cVar.f129247b = (String) pair.first;
                                if (pair.second != null) {
                                    cVar.f129248c = ((List) pair.second).toString();
                                }
                            }
                            C51838d.m111186b((Runnable) new Runnable() {
                                public final void run() {
                                    if (C51895s.m111279b() != null) {
                                        C51895s.m111279b().mo95382a(cVar);
                                    }
                                }
                            });
                            return a3;
                        } catch (IOException e) {
                            if (!(e instanceof SocketTimeoutException)) {
                                if (!(e instanceof ConnectException)) {
                                    cVar.f129257l = -10000;
                                    throw e;
                                }
                            }
                            cVar.f129257l = -104;
                            throw e;
                        } catch (Throwable th) {
                            C51868b.f129400a.remove(c2.f132382e);
                            Pair pair2 = (Pair) C51868b.f129401b.remove(c2.f132382e);
                            if (pair2 != null) {
                                cVar.f129247b = (String) pair2.first;
                                if (pair2.second != null) {
                                    cVar.f129248c = ((List) pair2.second).toString();
                                }
                            }
                            C51838d.m111186b((Runnable) new Runnable() {
                                public final void run() {
                                    if (C51895s.m111279b() != null) {
                                        C51895s.m111279b().mo95382a(cVar);
                                    }
                                }
                            });
                            throw th;
                        }
                    }
                });
                aVar.f133222f.add(new C53676u() {
                    public final C53504ad intercept(C53677a aVar) throws IOException {
                        Socket socket;
                        String str;
                        String str2;
                        InetSocketAddress inetSocketAddress;
                        Socket socket2;
                        String str3;
                        String str4;
                        InetSocketAddress inetSocketAddress2;
                        C53498ab a = aVar.mo111416a();
                        String a2 = a.mo111255a("User-Agent");
                        InetAddress inetAddress = null;
                        try {
                            C53504ad a3 = aVar.mo111417a(a);
                            C51798c cVar = (C51798c) C51868b.f129400a.get(a.f132382e);
                            if (cVar != null) {
                                C53532i b = aVar.mo111419b();
                                if (b == null) {
                                    socket2 = null;
                                } else {
                                    socket2 = b.mo111337b();
                                }
                                if (socket2 != null) {
                                    InetAddress localAddress = socket2.getLocalAddress();
                                    if (localAddress == null || localAddress.isAnyLocalAddress()) {
                                        str3 = null;
                                    } else {
                                        str3 = localAddress.getHostAddress();
                                    }
                                    InetAddress inetAddress2 = socket2.getInetAddress();
                                    if (inetAddress2 != null) {
                                        str4 = inetAddress2.getHostAddress();
                                    } else {
                                        str4 = null;
                                    }
                                    if (TextUtils.isEmpty(str3)) {
                                        str3 = C51895s.f129470e;
                                        if (TextUtils.isEmpty(str3)) {
                                            str3 = C51836b.m111163a(C51895s.m111276a());
                                        }
                                    }
                                    if (!TextUtils.isEmpty(str3)) {
                                        C51895s.f129470e = str3;
                                    }
                                    if (TextUtils.isEmpty(str4)) {
                                        C53509af a4 = b.mo111336a();
                                        if (a4 == null) {
                                            inetSocketAddress2 = null;
                                        } else {
                                            inetSocketAddress2 = a4.f132432c;
                                        }
                                        if (inetSocketAddress2 != null) {
                                            inetAddress = inetSocketAddress2.getAddress();
                                        }
                                        if (inetAddress != null) {
                                            str4 = inetAddress.getHostAddress();
                                        }
                                    }
                                    cVar.f129251f = str3;
                                    cVar.f129252g = str4;
                                    C51861k.m111227a().mo107367a(cVar.f129249d, cVar);
                                    cVar.f129250e = a.f132378a.toString();
                                    cVar.f129253h = a2;
                                }
                            }
                            return a3;
                        } catch (IOException e) {
                            throw e;
                        } catch (Throwable th) {
                            C51798c cVar2 = (C51798c) C51868b.f129400a.get(a.f132382e);
                            if (cVar2 != null) {
                                C53532i b2 = aVar.mo111419b();
                                if (b2 == null) {
                                    socket = null;
                                } else {
                                    socket = b2.mo111337b();
                                }
                                if (socket != null) {
                                    InetAddress localAddress2 = socket.getLocalAddress();
                                    if (localAddress2 == null || localAddress2.isAnyLocalAddress()) {
                                        str = null;
                                    } else {
                                        str = localAddress2.getHostAddress();
                                    }
                                    InetAddress inetAddress3 = socket.getInetAddress();
                                    if (inetAddress3 != null) {
                                        str2 = inetAddress3.getHostAddress();
                                    } else {
                                        str2 = null;
                                    }
                                    if (TextUtils.isEmpty(str)) {
                                        str = C51895s.f129470e;
                                        if (TextUtils.isEmpty(str)) {
                                            str = C51836b.m111163a(C51895s.m111276a());
                                        }
                                    }
                                    if (!TextUtils.isEmpty(str)) {
                                        C51895s.f129470e = str;
                                    }
                                    if (TextUtils.isEmpty(str2)) {
                                        C53509af a5 = b2.mo111336a();
                                        if (a5 == null) {
                                            inetSocketAddress = null;
                                        } else {
                                            inetSocketAddress = a5.f132432c;
                                        }
                                        if (inetSocketAddress != null) {
                                            inetAddress = inetSocketAddress.getAddress();
                                        }
                                        if (inetAddress != null) {
                                            str2 = inetAddress.getHostAddress();
                                        }
                                    }
                                    cVar2.f129251f = str;
                                    cVar2.f129252g = str2;
                                    C51861k.m111227a().mo107367a(cVar2.f129249d, cVar2);
                                    cVar2.f129250e = a.f132378a.toString();
                                    cVar2.f129253h = a2;
                                }
                            }
                            throw th;
                        }
                    }
                });
                f129402c = aVar.mo111667a();
            }
            yVar = f129402c;
        }
        return yVar;
    }

    /* renamed from: a */
    public static String m111234a(C53671s sVar) {
        String str = C38828b.f98804v;
        String str2 = ",";
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < sVar.mo111591a(); i++) {
            if (str.equals(sVar.mo111592a(i))) {
                sb.append(sVar.mo111594b(i));
                sb.append(str2);
            }
        }
        String str3 = "";
        if (sb.length() > 0) {
            return sb.toString().substring(0, sb.length() - 1);
        }
        return str3;
    }

    /* renamed from: a */
    public static List<C12685b> m111235a(List<C51873c> list) {
        ArrayList arrayList = new ArrayList(list.size());
        for (C51873c cVar : list) {
            arrayList.add(new C12685b(cVar.f129405a, cVar.f129406b));
        }
        return arrayList;
    }

    /* renamed from: b */
    public static C53671s m111237b(List<C51873c> list) {
        String str;
        String str2;
        C53672a aVar = new C53672a();
        for (C51873c cVar : list) {
            if (C51895s.f129479n) {
                str = cVar.f129405a;
                int length = str.length();
                StringBuilder sb = null;
                for (int i = 0; i < length; i++) {
                    char charAt = str.charAt(i);
                    if (charAt <= ' ' || charAt >= 127) {
                        if (sb == null) {
                            sb = new StringBuilder(str.substring(0, i));
                        }
                    } else if (sb != null) {
                        sb.append(charAt);
                    }
                }
                if (sb != null) {
                    str = sb.toString();
                }
                str2 = C51838d.m111188c(cVar.f129406b);
            } else {
                str = cVar.f129405a;
                str2 = cVar.f129406b;
            }
            aVar.mo111604a(str, str2);
        }
        return aVar.mo111605a();
    }
}
