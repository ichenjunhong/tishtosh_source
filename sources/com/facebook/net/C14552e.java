package com.facebook.net;

import android.net.Uri;
import com.bytedance.common.utility.C9425l.C9426a;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ttnet.p883a.C13272d;
import java.util.concurrent.ConcurrentHashMap;
import org.json.JSONObject;

/* renamed from: com.facebook.net.e */
public final class C14552e {

    /* renamed from: a */
    private static volatile C14552e f37803a;

    /* renamed from: b */
    private static final Object f37804b = new Object();

    /* renamed from: c */
    private final ConcurrentHashMap<String, Long> f37805c = new ConcurrentHashMap<>();

    /* renamed from: d */
    private final ConcurrentHashMap<String, C14553a> f37806d = new ConcurrentHashMap<>();

    /* renamed from: e */
    private final ConcurrentHashMap<String, C14554b> f37807e = new ConcurrentHashMap<>();

    /* renamed from: com.facebook.net.e$a */
    class C14553a {

        /* renamed from: a */
        int f37808a;

        /* renamed from: b */
        int f37809b = 1;

        /* renamed from: c */
        boolean f37810c = false;

        /* renamed from: d */
        long f37811d = 0;

        /* renamed from: e */
        int f37812e;

        public C14553a(int i, int i2, boolean z, long j, int i3) {
            this.f37808a = i;
            this.f37812e = i3;
        }
    }

    /* renamed from: com.facebook.net.e$b */
    class C14554b {

        /* renamed from: a */
        int f37814a;

        /* renamed from: b */
        int f37815b;

        /* renamed from: c */
        long f37816c;

        /* renamed from: d */
        long f37817d = System.currentTimeMillis();

        public C14554b(int i, int i2, long j) {
            this.f37814a = i;
            this.f37815b = i2;
            this.f37816c = j;
        }
    }

    private C14552e() {
    }

    /* renamed from: a */
    public static C14552e m29802a() {
        if (f37803a == null) {
            synchronized (f37804b) {
                if (f37803a == null) {
                    f37803a = new C14552e();
                }
            }
        }
        return f37803a;
    }

    /* renamed from: c */
    private static boolean m29805c() {
        if (C13272d.m26709a() == null || C13272d.m26709a().mo24871c() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static int m29806d() {
        if (C13272d.m26709a() == null || C13272d.m26709a().mo24872d() <= 0) {
            return 5;
        }
        return C13272d.m26709a().mo24872d();
    }

    /* renamed from: e */
    private static int m29807e() {
        if (C13272d.m26709a() == null || C13272d.m26709a().mo24873e() <= 0) {
            return 50;
        }
        return C13272d.m26709a().mo24873e();
    }

    /* renamed from: b */
    private static boolean m29804b() {
        int i;
        if (C13272d.m26709a() != null) {
            i = C13272d.m26709a().mo24874f().getValue();
        } else {
            i = 0;
        }
        if (i == C9426a.WIFI.getValue() || i == C9426a.MOBILE_4G.getValue() || i == C9426a.MOBILE_3G.getValue()) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    private void m29803b(String str, boolean z, long j, boolean z2) {
        long j2;
        try {
            if ((C13272d.m26709a() != null && C13272d.m26709a().mo24871c() == 2) || !z2) {
                return;
            }
            if (this.f37807e.containsKey("p.pstap.com")) {
                C14554b bVar = (C14554b) this.f37807e.get("p.pstap.com");
                if (!z || j <= 0) {
                    bVar.f37815b++;
                } else {
                    bVar.f37814a++;
                    bVar.f37816c += j;
                }
                long currentTimeMillis = System.currentTimeMillis();
                if (currentTimeMillis - bVar.f37817d > 300000) {
                    if (bVar.f37814a > 0) {
                        j2 = bVar.f37816c / ((long) bVar.f37814a);
                    } else {
                        j2 = 0;
                    }
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.put("error", bVar.f37815b);
                    jSONObject.put("success", bVar.f37814a);
                    jSONObject.put("average_duration", j2);
                    if (m29805c()) {
                        jSONObject.put("has_opt", 1);
                    }
                    bVar.f37815b = 0;
                    bVar.f37814a = 0;
                    bVar.f37816c = 0;
                    bVar.f37817d = currentTimeMillis;
                }
                return;
            }
            boolean z3 = z;
            long j3 = j;
            C14554b bVar2 = new C14554b(z3 ? 1 : 0, z ^ true ? 1 : 0, j3);
            this.f37807e.put("p.pstap.com", bVar2);
        } catch (Throwable unused) {
        }
    }

    /* renamed from: a */
    public final void mo26792a(String str, boolean z, long j, boolean z2) {
        if (!C9431p.m18664a(str) && m29804b()) {
            m29803b(str, z, j, z2);
            if (m29805c()) {
                try {
                    String host = Uri.parse(str).getHost();
                    if (this.f37806d.containsKey(host)) {
                        C14553a aVar = (C14553a) this.f37806d.get(host);
                        if (aVar != null && !aVar.f37810c) {
                            if (!z) {
                                aVar.f37808a++;
                            }
                            aVar.f37809b++;
                            if (aVar.f37808a < m29806d() || (aVar.f37808a * 100) / aVar.f37809b < 10) {
                                if (aVar.f37809b > aVar.f37812e) {
                                    aVar.f37809b = 0;
                                    aVar.f37808a = 0;
                                    aVar.f37810c = false;
                                }
                                return;
                            }
                            aVar.f37810c = true;
                            aVar.f37809b = 0;
                            aVar.f37808a = 0;
                            this.f37805c.put(host, Long.valueOf(System.currentTimeMillis()));
                            return;
                        }
                        return;
                    }
                    boolean z3 = !z;
                    C14553a aVar2 = new C14553a(z3 ? 1 : 0, 1, false, 0, m29807e());
                    this.f37806d.put(host, aVar2);
                } catch (Throwable unused) {
                }
            }
        }
    }
}
