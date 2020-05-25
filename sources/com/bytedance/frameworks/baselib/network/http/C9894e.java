package com.bytedance.frameworks.baselib.network.http;

import android.util.Pair;
import android.webkit.CookieManager;
import com.bytedance.common.utility.C9431p;
import com.bytedance.frameworks.baselib.network.http.p569b.C9842a;
import com.bytedance.frameworks.baselib.network.p566a.C9812c;
import com.bytedance.frameworks.baselib.network.p566a.C9814d;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheTTnetPreloadTimeoutExperiment;
import java.io.IOException;
import java.net.InetAddress;
import java.net.URI;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.atomic.AtomicBoolean;

/* renamed from: com.bytedance.frameworks.baselib.network.http.e */
public class C9894e {

    /* renamed from: a */
    public static List<C9904j> f26956a = new LinkedList();

    /* renamed from: b */
    public static C9901g f26957b;

    /* renamed from: c */
    public static C9899e f26958c;

    /* renamed from: d */
    public static C9900f f26959d;

    /* renamed from: e */
    public static C9896b f26960e;

    /* renamed from: f */
    public static C9905k f26961f;

    /* renamed from: g */
    public static volatile int f26962g = -1;

    /* renamed from: h */
    public static C9897c f26963h;

    /* renamed from: i */
    public static C9898d f26964i;

    /* renamed from: j */
    public static C9895a f26965j;

    /* renamed from: k */
    private static C9903i f26966k;

    /* renamed from: l */
    private static boolean f26967l = true;

    /* renamed from: m */
    private static String f26968m = null;

    /* renamed from: n */
    private static volatile AtomicBoolean f26969n = new AtomicBoolean(false);

    /* renamed from: o */
    private static final Object f26970o = new Object();

    /* renamed from: p */
    private static CountDownLatch f26971p = new CountDownLatch(1);

    /* renamed from: q */
    private static C9902h f26972q;

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$a */
    public interface C9895a {
        /* renamed from: a */
        Map<String, String> mo17818a(String str, Map<String, List<String>> map);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$b */
    public interface C9896b<T extends C9831a> {
        /* renamed from: a */
        String mo17819a(String str, boolean z);

        /* renamed from: a */
        String mo17820a(String str, boolean z, Object... objArr);

        /* renamed from: a */
        void mo17821a();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$c */
    public interface C9897c<T extends C9841b> {
        /* renamed from: a */
        String mo17822a(String str, T t);

        /* renamed from: a */
        List<InetAddress> mo17823a(String str);

        /* renamed from: a */
        void mo17824a(String str, String str2, boolean z) throws IOException;
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$d */
    public interface C9898d {
        /* renamed from: a */
        Map<String, List<String>> mo17825a(URI uri, Map<String, List<String>> map);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$e */
    public interface C9899e {
        /* renamed from: b */
        boolean mo17826b(String str);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$f */
    public interface C9900f {
        /* renamed from: a */
        String mo17827a();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$g */
    public interface C9901g {
        /* renamed from: c */
        boolean mo17828c(String str);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$h */
    public interface C9902h {
        /* renamed from: a */
        List<String> mo17829a(CookieManager cookieManager, C9842a aVar, URI uri);

        /* renamed from: d */
        List<String> mo17830d(String str);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$i */
    public interface C9903i {
        /* renamed from: a */
        Pair<Boolean, String> mo17831a(String str);

        /* renamed from: a */
        Pair<Boolean, byte[]> mo17832a(byte[] bArr);

        /* renamed from: a */
        Map<String, ?> mo17833a();

        /* renamed from: a */
        boolean mo17834a(URI uri);

        /* renamed from: b */
        Pair<Boolean, byte[]> mo17835b(byte[] bArr);

        /* renamed from: b */
        void mo17836b();
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$j */
    public interface C9904j {
        /* renamed from: a */
        void mo17789a(Map<String, ?> map);
    }

    /* renamed from: com.bytedance.frameworks.baselib.network.http.e$k */
    public interface C9905k<T extends C9831a> {
        /* renamed from: a */
        void mo17837a(long j, long j2, String str, String str2, T t);

        /* renamed from: a */
        void mo17838a(long j, long j2, String str, String str2, T t, Throwable th);
    }

    /* renamed from: a */
    public static C9903i m19812a() {
        return f26966k;
    }

    /* renamed from: b */
    public static C9901g m19827b() {
        return f26957b;
    }

    /* renamed from: c */
    public static C9899e m19829c() {
        return f26958c;
    }

    /* renamed from: f */
    public static String m19832f() {
        return f26968m;
    }

    /* renamed from: g */
    public static C9900f m19833g() {
        return f26959d;
    }

    /* renamed from: i */
    public static C9902h m19835i() {
        return f26972q;
    }

    /* renamed from: a */
    public static void m19822a(C9904j jVar) {
        f26956a.add(jVar);
    }

    /* renamed from: a */
    public static void m19826a(boolean z) {
        f26967l = z;
    }

    /* renamed from: a */
    public static void m19825a(String str, Throwable th, long j, C9831a aVar) {
        if (!C9431p.m18664a(str) && th != null) {
        }
    }

    /* renamed from: a */
    public static void m19823a(String str, long j, C9831a aVar) {
        C9431p.m18664a(str);
    }

    /* renamed from: a */
    public static void m19824a(String str, String str2, boolean z) throws IOException {
        if (!C9431p.m18664a(str) && !C9431p.m18664a(str2) && f26963h != null) {
            f26963h.mo17824a(str, str2, z);
        }
    }

    /* renamed from: d */
    public static int m19830d() {
        if (!f26967l) {
            return IFoundationAVService.MUSIC_LENGTH_FOR_COPYRIGHT;
        }
        try {
            C9814d c = C9812c.m19639b().mo17652c();
            if (C9814d.POOR == c) {
                return 45000;
            }
            if (C9814d.MODERATE == c) {
                return VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
            }
            return (C9814d.GOOD == c || C9814d.EXCELLENT == c || C9814d.UNKNOWN == c) ? IFoundationAVService.MUSIC_LENGTH_FOR_COPYRIGHT : IFoundationAVService.MUSIC_LENGTH_FOR_COPYRIGHT;
        } catch (Throwable unused) {
        }
    }

    /* renamed from: e */
    public static int m19831e() {
        if (!f26967l) {
            return IFoundationAVService.MUSIC_LENGTH_FOR_COPYRIGHT;
        }
        try {
            C9814d c = C9812c.m19639b().mo17652c();
            if (C9814d.POOR == c) {
                return 45000;
            }
            if (C9814d.MODERATE == c) {
                return VideoCacheTTnetPreloadTimeoutExperiment.DEFAULT;
            }
            return (C9814d.GOOD == c || C9814d.EXCELLENT == c || C9814d.UNKNOWN == c) ? IFoundationAVService.MUSIC_LENGTH_FOR_COPYRIGHT : IFoundationAVService.MUSIC_LENGTH_FOR_COPYRIGHT;
        } catch (Throwable unused) {
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:6|7|(2:9|(1:11))|12|13) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:12:0x002a */
    /* renamed from: h */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static android.webkit.CookieManager m19834h() {
        /*
            java.lang.Object r0 = f26970o
            monitor-enter(r0)
            java.util.concurrent.atomic.AtomicBoolean r1 = f26969n     // Catch:{ all -> 0x0048 }
            boolean r1 = r1.get()     // Catch:{ all -> 0x0048 }
            r2 = 1
            if (r1 != 0) goto L_0x002f
            java.util.concurrent.CountDownLatch r1 = f26971p     // Catch:{ Exception -> 0x002a }
            if (r1 == 0) goto L_0x002a
            java.util.concurrent.CountDownLatch r1 = f26971p     // Catch:{ Exception -> 0x002a }
            r3 = 10000(0x2710, double:4.9407E-320)
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.MILLISECONDS     // Catch:{ Exception -> 0x002a }
            r1.await(r3, r5)     // Catch:{ Exception -> 0x002a }
            java.util.concurrent.CountDownLatch r1 = f26971p     // Catch:{ Exception -> 0x002a }
            long r3 = r1.getCount()     // Catch:{ Exception -> 0x002a }
            r5 = 1
            int r1 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r1 != 0) goto L_0x002a
            java.util.concurrent.CountDownLatch r1 = f26971p     // Catch:{ Exception -> 0x002a }
            r1.countDown()     // Catch:{ Exception -> 0x002a }
        L_0x002a:
            java.util.concurrent.atomic.AtomicBoolean r1 = f26969n     // Catch:{ all -> 0x0048 }
            r1.getAndSet(r2)     // Catch:{ all -> 0x0048 }
        L_0x002f:
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            com.bytedance.frameworks.baselib.network.http.e$b r0 = f26960e
            if (r0 == 0) goto L_0x0037
            r0.mo17821a()
        L_0x0037:
            r0 = 0
            android.webkit.CookieManager r1 = android.webkit.CookieManager.getInstance()     // Catch:{ Throwable -> 0x0046 }
            boolean r0 = r1.acceptCookie()     // Catch:{ Throwable -> 0x0047 }
            if (r0 != 0) goto L_0x0047
            r1.setAcceptCookie(r2)     // Catch:{ Throwable -> 0x0047 }
            goto L_0x0047
        L_0x0046:
            r1 = r0
        L_0x0047:
            return r1
        L_0x0048:
            r1 = move-exception
            monitor-exit(r0)     // Catch:{ all -> 0x0048 }
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.frameworks.baselib.network.http.C9894e.m19834h():android.webkit.CookieManager");
    }

    /* renamed from: a */
    public static String m19813a(String str) {
        return m19814a(str, (C9841b) null);
    }

    /* renamed from: b */
    public static void m19828b(boolean z) {
        if (f26969n.get() != z) {
            f26969n.getAndSet(z);
            if (f26971p != null && f26971p.getCount() > 0) {
                f26971p.countDown();
            }
            if (!z) {
                f26971p = new CountDownLatch(1);
            }
        }
        if (z) {
            C22574a.m55738f().mo46921b("feed_network_init_cookie_duration", false);
        }
    }

    /* renamed from: a */
    public static void m19817a(int i) {
        f26962g = i;
    }

    /* renamed from: a */
    public static void m19820a(C9902h hVar) {
        f26972q = hVar;
    }

    /* renamed from: a */
    public static void m19821a(C9903i iVar) {
        f26966k = iVar;
    }

    /* renamed from: a */
    public static String m19814a(String str, C9841b bVar) {
        if (C9431p.m18664a(str)) {
            return str;
        }
        C9897c cVar = f26963h;
        if (cVar != null) {
            str = cVar.mo17822a(str, bVar);
        }
        return str;
    }

    /* renamed from: a */
    public static String m19815a(String str, boolean z) {
        C9896b bVar = f26960e;
        if (bVar != null) {
            return bVar.mo17819a(str, true);
        }
        return str;
    }

    /* renamed from: a */
    public static Map<String, String> m19816a(String str, Map<String, List<String>> map) {
        C9895a aVar = f26965j;
        if (aVar != null) {
            return aVar.mo17818a(str, map);
        }
        return null;
    }

    /* renamed from: a */
    public static void m19818a(long j, long j2, String str, String str2, C9831a aVar) {
        C9905k kVar = f26961f;
        if (!C9431p.m18664a(str) && j > 0 && kVar != null) {
            kVar.mo17837a(j, j2, str, str2, aVar);
        }
    }

    /* renamed from: a */
    public static void m19819a(long j, long j2, String str, String str2, C9831a aVar, Throwable th) {
        if (!C9431p.m18664a(str) && th != null) {
            C9905k kVar = f26961f;
            if (kVar != null) {
                kVar.mo17838a(j, j2, str, str2, aVar, th);
            }
        }
    }
}
