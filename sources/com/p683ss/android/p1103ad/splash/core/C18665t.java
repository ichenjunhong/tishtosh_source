package com.p683ss.android.p1103ad.splash.core;

import android.content.Context;
import android.net.Uri;
import com.p683ss.android.p1103ad.splash.C18731f;
import com.p683ss.android.p1103ad.splash.C18731f.C18732a;
import com.p683ss.android.p1103ad.splash.C18773t;
import com.p683ss.android.p1103ad.splash.C18776v;
import com.p683ss.android.p1103ad.splash.C18776v.C18777a;
import com.p683ss.android.p1103ad.splash.core.p1113b.C18586b;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18602b;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18608f;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18613k;
import com.p683ss.android.p1103ad.splash.core.p1114c.C18617n;
import com.p683ss.android.p1103ad.splash.p1110b.C18550a;
import com.p683ss.android.p1103ad.splash.p1122f.C18733a;
import com.p683ss.android.p1103ad.splash.p1123g.C18735a;
import com.p683ss.android.p1103ad.splash.p1123g.C18738d;
import com.p683ss.android.p1103ad.splash.p1123g.C18740f;
import com.p683ss.android.p1103ad.splash.p1123g.C18741g;
import com.p683ss.android.p1103ad.splash.p1123g.C18742h;
import com.p683ss.android.p1103ad.splash.p1123g.C18744j;
import com.p683ss.android.p1103ad.splash.p1123g.C18747l;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: com.ss.android.ad.splash.core.t */
final class C18665t {

    /* renamed from: d */
    private static volatile C18665t f51585d;

    /* renamed from: a */
    public volatile long f51586a;

    /* renamed from: b */
    public long f51587b = 20000;

    /* renamed from: c */
    public C18733a f51588c = new C18672a();

    /* renamed from: com.ss.android.ad.splash.core.t$a */
    class C18672a implements C18733a {
        C18672a() {
        }
    }

    /* renamed from: a */
    static void m45373a(List<C18613k> list) {
        JSONObject jSONObject = new JSONObject();
        JSONObject jSONObject2 = new JSONObject();
        try {
            JSONArray jSONArray = new JSONArray();
            if (!C18740f.m45691a(list)) {
                for (C18613k G : list) {
                    String G2 = G.mo37971G();
                    if (!C18747l.m45742a(G2)) {
                        jSONArray.put(G2);
                    }
                }
            }
            jSONObject2.put("splash_receive_key", jSONArray);
            jSONObject.put("ad_extra_data", jSONObject2);
            jSONObject.put("is_ad_event", "1");
            jSONObject.put("log_extra", C18654k.m45259a().f51563j);
            C18642g.m45201a(84378473382L, "splash_ad", "splash_receive", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m45371a(C18602b bVar, C18602b bVar2) {
        if (bVar != null) {
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.putOpt("log_extra", bVar.mo37864r()).putOpt("is_ad_event", "1");
                jSONObject.putOpt("ad_fetch_time", Long.valueOf(bVar.mo37862f()));
                if (bVar2 != null) {
                    JSONObject jSONObject2 = new JSONObject();
                    jSONObject2.putOpt("boarding_to", Long.valueOf(bVar2.mo37863p()));
                    jSONObject.putOpt("ad_extra_data", jSONObject2);
                }
                C18642g.m45201a(bVar.mo37863p(), "splash_ad", "boarding", jSONObject);
            } catch (Exception unused) {
                return;
            }
        }
        if (bVar2 != null) {
            JSONObject jSONObject3 = new JSONObject();
            jSONObject3.putOpt("log_extra", bVar2.mo37864r()).putOpt("is_ad_event", "1");
            jSONObject3.putOpt("ad_fetch_time", Long.valueOf(bVar2.mo37862f()));
            if (bVar != null) {
                JSONObject jSONObject4 = new JSONObject();
                jSONObject4.putOpt("covered_by", Long.valueOf(bVar.mo37863p()));
                jSONObject3.putOpt("ad_extra_data", jSONObject4);
            }
            C18642g.m45201a(bVar2.mo37863p(), "splash_ad", "covered", jSONObject3);
        }
    }

    /* renamed from: a */
    public final void mo38129a(C18602b bVar) {
        if (m45381f(bVar)) {
            C18673u.m45399a().mo38145a(bVar.f51317a);
        }
        m45375c(bVar);
    }

    /* renamed from: a */
    public static void m45372a(String str, long j) {
        JSONArray jSONArray;
        try {
            if (!C18747l.m45742a(str)) {
                if (j > 0) {
                    JSONObject jSONObject = new JSONObject();
                    jSONObject.putOpt("local_url", str).putOpt("local_data_expire_time", Long.valueOf(j));
                    synchronized (C18673u.class) {
                        String g = C18673u.m45399a().mo38162g();
                        if (C18747l.m45742a(g)) {
                            jSONArray = new JSONArray();
                        } else {
                            jSONArray = new JSONArray(g);
                        }
                        jSONArray.put(jSONObject);
                        C18673u.m45399a().mo38161g(jSONArray.toString()).mo38164h();
                    }
                }
            }
        } catch (Exception unused) {
        }
    }

    private C18665t() {
    }

    /* renamed from: a */
    public static C18665t m45364a() {
        if (f51585d == null) {
            synchronized (C18665t.class) {
                if (f51585d == null) {
                    f51585d = new C18665t();
                }
            }
        }
        return f51585d;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public boolean mo38134c() {
        if (System.currentTimeMillis() - this.f51586a > this.f51587b) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final void mo38130b() {
        int i;
        JSONObject jSONObject;
        long j;
        JSONObject jSONObject2;
        boolean z;
        C18602b bVar;
        C18602b bVar2;
        long currentTimeMillis = System.currentTimeMillis();
        this.f51586a = currentTimeMillis;
        Future submit = C18642g.m45247t().submit(new Callable<C18773t>() {
            public final /* synthetic */ Object call() throws Exception {
                return m45394a();
            }

            /* renamed from: a */
            private static C18773t m45394a() throws Exception {
                if (C18642g.m45250w() == null) {
                    return null;
                }
                String b = C18744j.m45723b();
                String c = C18744j.m45729c();
                if (C18747l.m45742a(b)) {
                    return null;
                }
                C18586b.m44982a();
                JSONObject jSONObject = new JSONObject();
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.putOpt("start_time", Long.valueOf(System.currentTimeMillis()));
                    jSONObject.putOpt("ad_extra_data", jSONObject2);
                    jSONObject.putOpt("log_extra", "");
                    jSONObject.putOpt("is_ad_event", "1");
                } catch (JSONException unused) {
                }
                C18642g.m45201a(84378473382L, "splash_ad", "request", jSONObject);
                C18735a.m45667b("发送预加载网络请求");
                return C18642g.m45250w().mo38379a(b, c);
            }
        });
        try {
            JSONObject jSONObject3 = new JSONObject();
            C18773t tVar = (C18773t) submit.get(30, TimeUnit.SECONDS);
            if (tVar == null || !tVar.f51910b || tVar.f51909a == null) {
                jSONObject = jSONObject3;
                C18586b.m44982a();
                i = 0;
                C18586b.m44994c(false);
                C18735a.m45667b("请求失败，或者请求成功了但是返回的数据为空");
            } else {
                C18586b.m44982a();
                C18586b.m44994c(true);
                long currentTimeMillis2 = System.currentTimeMillis();
                JSONObject optJSONObject = tVar.f51909a.optJSONObject("data");
                if (optJSONObject != null) {
                    long optLong = optJSONObject.optLong("leave_interval", 300) * 1000;
                    long j2 = currentTimeMillis2;
                    long optLong2 = optJSONObject.optLong("splash_interval", 1800) * 1000;
                    this.f51587b = optJSONObject.optLong("splash_load_interval", 20) * 1000;
                    String optString = optJSONObject.optString("log_extra", "{}");
                    boolean optBoolean = optJSONObject.optBoolean("is_need_ack", false);
                    int min = Math.min(optJSONObject.optInt("concurrent_downloads", 0), Runtime.getRuntime().availableProcessors());
                    new StringBuilder("concurrent_downloads : ").append(min);
                    long optLong3 = optJSONObject.optLong("server_time", 0);
                    m45368a(optLong3);
                    JSONArray optJSONArray = optJSONObject.optJSONArray("penalty_period");
                    if (optJSONArray == null || optJSONArray.length() != 2) {
                        j = currentTimeMillis;
                        jSONObject2 = jSONObject3;
                    } else {
                        jSONObject2 = jSONObject3;
                        long j3 = optJSONArray.getLong(1) * 1000;
                        j = currentTimeMillis;
                        C18654k.m45259a().mo38071a(optJSONArray.getLong(0) * 1000);
                        C18654k.m45259a().mo38072b(j3);
                    }
                    if (optJSONArray == null) {
                        optJSONArray = new JSONArray();
                    }
                    int optInt = optJSONObject.optInt("show_limit", 0);
                    long currentTimeMillis3 = System.currentTimeMillis();
                    if (C18642g.m45216af() && optLong3 != 0) {
                        currentTimeMillis3 = optLong3;
                    }
                    JSONArray optJSONArray2 = optJSONObject.optJSONArray("splash");
                    if (optJSONArray2 == null) {
                        optJSONArray2 = new JSONArray();
                    }
                    C18735a.m45667b("预加载数据解析成功");
                    C18654k a = C18654k.m45259a();
                    List<C18602b> a2 = C18744j.m45713a(optJSONArray2, currentTimeMillis3, false);
                    if (C18642g.m45229f() != null) {
                        C18642g.m45229f().mo37854a(a2);
                    }
                    C18586b.m44982a();
                    C18586b.m44991b(a2.isEmpty());
                    List<C18602b> list = a.f51554a;
                    if (C18642g.m45212ab()) {
                        List<C18602b> a3 = C18744j.m45710a(a.f51555b, a2);
                        JSONArray b = C18744j.m45727b(a3);
                        a.f51555b = a3;
                        C18673u.m45399a().mo38155d(b.toString()).mo38164h();
                        if (!C18673u.m45399a().mo38156d()) {
                            m45382g(list);
                            m45387k(null);
                        }
                    }
                    if (!C18740f.m45691a(a2)) {
                        bVar = (C18602b) a2.get(0);
                        z = false;
                    } else {
                        bVar = null;
                        z = true;
                    }
                    if (!C18740f.m45691a(list)) {
                        try {
                            bVar2 = (C18602b) list.get(0);
                        } catch (Exception e) {
                            e = e;
                            C18586b.m44982a();
                            C18586b.m44994c(false);
                            C18735a.m45662a(0, "请求数据失败，原因未知，可能出现了 Exception", e, null);
                            C18550a.m44899a().mo37842a(e, "key_exception_request");
                        }
                    } else {
                        bVar2 = null;
                    }
                    m45371a(bVar, bVar2);
                    a.f51554a = a2;
                    a.f51558e = optLong;
                    a.f51557d = optLong2;
                    a.f51563j = optString;
                    a.f51561h = optBoolean;
                    a.f51562i = min;
                    C18642g.m45246s();
                    C18673u.m45399a().mo38142a(optLong).mo38141a(optInt).mo38148b(optLong2).mo38143a(optJSONArray2.toString()).mo38163h(optJSONArray.toString()).mo38144a(z).mo38165i(optString).mo38154c(optBoolean).mo38164h();
                    C18642g.m45237j();
                    mo38132b(a2);
                    jSONObject = jSONObject2;
                    jSONObject.put("durarion_ad_request_total_times", j2 - j);
                    mo38133c(a2);
                    m45377d(a2);
                    if (C18642g.m45249v()) {
                        C18656m.m45265a().mo38075d();
                    }
                    i = 0;
                } else {
                    return;
                }
            }
            C18550a.m44899a().mo37846b("service_ad_request_status", i, jSONObject, null);
        } catch (Exception e2) {
            e = e2;
            C18586b.m44982a();
            C18586b.m44994c(false);
            C18735a.m45662a(0, "请求数据失败，原因未知，可能出现了 Exception", e, null);
            C18550a.m44899a().mo37842a(e, "key_exception_request");
        }
    }

    /* renamed from: c */
    private boolean m45375c(C18602b bVar) {
        boolean z = false;
        if (!C18740f.m45691a(bVar.f51337k)) {
            C18735a.m45661a(bVar.mo37863p(), "开始下载分时广告素材");
            for (C18602b bVar2 : bVar.f51337k) {
                if (bVar2 != null && bVar2.mo37977a() && m45381f(bVar2)) {
                    C18673u.m45399a().mo38145a(bVar2.f51317a);
                    z = true;
                }
            }
        }
        return z;
    }

    /* renamed from: d */
    private void m45376d(C18602b bVar) {
        if (!C18740f.m45691a(bVar.f51337k)) {
            for (C18602b bVar2 : bVar.f51337k) {
                if (bVar2 != null && bVar2.mo37977a()) {
                    m45385i(bVar2);
                }
            }
        }
    }

    /* renamed from: g */
    private void m45382g(List<C18602b> list) {
        if (!C18740f.m45691a(list)) {
            for (C18602b bVar : list) {
                if (bVar.f51341o == 1 && bVar.mo37968D()) {
                    m45387k(bVar);
                    return;
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo38131b(C18602b bVar) {
        if (m45379e(bVar)) {
            C18673u.m45399a().mo38146a(bVar.f51339m);
        }
        if (bVar.mo37865x() == 3 && m45381f(bVar)) {
            C18673u.m45399a().mo38145a(bVar.f51317a);
        }
    }

    /* renamed from: e */
    private void m45378e(List<C18602b> list) {
        boolean z;
        int c = C18742h.m45698c(C18642g.m45184L());
        if (c != 0) {
            for (C18602b bVar : list) {
                if (bVar != null && bVar.mo37977a()) {
                    if ((bVar.f51351y & c) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        switch (bVar.mo37865x()) {
                            case 0:
                            case 1:
                            case 4:
                                if (!C18744j.m45716a(bVar.mo37856B(), false)) {
                                    mo38129a(bVar);
                                    break;
                                } else {
                                    m45385i(bVar);
                                    m45376d(bVar);
                                    break;
                                }
                            case 2:
                            case 3:
                                if (!C18744j.m45716a(bVar.mo37856B(), true)) {
                                    mo38131b(bVar);
                                    break;
                                } else {
                                    m45386j(bVar);
                                    if (bVar.mo37865x() != 3) {
                                        break;
                                    } else {
                                        m45385i(bVar);
                                        break;
                                    }
                                }
                        }
                    }
                }
            }
        }
    }

    /* renamed from: g */
    private static boolean m45383g(C18602b bVar) {
        if (C18744j.m45720a(bVar.f51339m, C18673u.m45399a())) {
            C18735a.m45661a(bVar.mo37863p(), "视频广告资源已存在，不再下载");
            if (C18744j.m45718a(bVar)) {
                C18586b.m44982a();
                C18586b.m44986a(bVar, "topview_no_download");
            } else {
                C18586b.m44982a();
                C18586b.m44986a(bVar, "splash_no_download");
            }
            return false;
        }
        if (C18744j.m45718a(bVar)) {
            C18586b.m44982a();
            C18586b.m44986a(bVar, "topview_start_download");
        }
        return true;
    }

    /* renamed from: h */
    private static boolean m45384h(C18602b bVar) {
        if (C18744j.m45719a(bVar.f51317a, C18673u.m45399a())) {
            C18735a.m45661a(bVar.mo37863p(), "图片广告资源已存在，不再下载");
            if (bVar.mo37865x() != 3) {
                if (C18744j.m45718a(bVar)) {
                    C18586b.m44982a();
                    C18586b.m44986a(bVar, "topview_no_download");
                } else {
                    C18586b.m44982a();
                    C18586b.m44986a(bVar, "splash_no_download");
                }
            }
            return false;
        }
        if (C18744j.m45718a(bVar) && bVar.mo37865x() != 3) {
            C18586b.m44982a();
            C18586b.m44986a(bVar, "topview_start_download");
        }
        return true;
    }

    /* renamed from: i */
    private void m45385i(C18602b bVar) {
        if (!C18744j.m45718a(bVar) && bVar.mo37865x() != 3) {
            C18586b.m44982a();
            C18586b.m44986a(bVar, "splash_start_download");
        }
        C18608f fVar = bVar.f51317a;
        if (fVar != null) {
            String a = C18744j.m45705a(fVar);
            String b = C18744j.m45724b(fVar);
            if (!C18747l.m45742a(a) && !C18747l.m45742a(b) && m45384h(bVar)) {
                C18731f a2 = m45365a(bVar, false);
                final long currentTimeMillis = System.currentTimeMillis();
                if (C18642g.m45250w() != null) {
                    C18776v w = C18642g.m45250w();
                    final String str = b;
                    final C18602b bVar2 = bVar;
                    C186705 r2 = new C18777a() {
                        /* renamed from: b */
                        public final void mo38140b() {
                            C18665t.m45370a(bVar2, 1, true);
                        }

                        /* renamed from: a */
                        public final void mo38139a() {
                            C18665t.m45372a(str, bVar2.mo37982e());
                            C18665t.m45370a(bVar2, 0, true);
                            C18665t.m45367a(0, str);
                            C18665t.m45366a(1, System.currentTimeMillis() - currentTimeMillis);
                            C18673u.m45399a().mo38145a(bVar2.f51317a);
                        }
                    };
                    w.mo38380a(a, b, a2, (C18777a) r2);
                }
            }
        }
    }

    /* renamed from: j */
    private void m45386j(C18602b bVar) {
        if (!C18744j.m45718a(bVar)) {
            C18586b.m44982a();
            C18586b.m44986a(bVar, "splash_start_download");
        }
        C18617n nVar = bVar.f51339m;
        if (nVar != null && bVar.mo37977a()) {
            String a = C18744j.m45706a(nVar);
            String a2 = C18744j.m45707a(nVar, bVar.mo37993o());
            if (!C18747l.m45742a(a) && !C18747l.m45742a(a2) && m45383g(bVar)) {
                C18731f a3 = m45365a(bVar, true);
                final long currentTimeMillis = System.currentTimeMillis();
                if (C18642g.m45250w() != null) {
                    C18776v w = C18642g.m45250w();
                    final C18602b bVar2 = bVar;
                    final String str = a;
                    final String str2 = a2;
                    C186716 r2 = new C18777a() {
                        /* renamed from: b */
                        public final void mo38140b() {
                            long p = bVar2.mo37863p();
                            StringBuilder sb = new StringBuilder("视频广告资源 url：");
                            sb.append(str);
                            sb.append(", 异步下载失败");
                            C18735a.m45661a(p, sb.toString());
                            C18665t.m45370a(bVar2, 17, true);
                        }

                        /* renamed from: a */
                        public final void mo38139a() {
                            long p = bVar2.mo37863p();
                            StringBuilder sb = new StringBuilder("视频广告资源 url：");
                            sb.append(str);
                            sb.append(", 异步下载成功");
                            C18735a.m45661a(p, sb.toString());
                            C18665t.m45372a(str2, bVar2.mo37982e());
                            C18665t.m45370a(bVar2, 16, true);
                            C18665t.m45367a(1, str2);
                            C18665t.m45366a(2, System.currentTimeMillis() - currentTimeMillis);
                            C18673u.m45399a().mo38146a(bVar2.f51339m);
                        }
                    };
                    w.mo38380a(a, a2, a3, (C18777a) r2);
                }
            }
        }
    }

    /* renamed from: k */
    private static void m45387k(C18602b bVar) {
        long j;
        String str = C18654k.m45259a().f51563j;
        long currentTimeMillis = System.currentTimeMillis();
        if (bVar != null) {
            long p = bVar.mo37863p();
            long j2 = p;
            str = bVar.mo37864r();
            currentTimeMillis = bVar.mo37862f();
            j = j2;
        } else {
            j = 84378473382L;
        }
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("log_extra", str);
            jSONObject.put("is_ad_event", 1);
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(currentTimeMillis));
            C18642g.m45201a(j, "splash_ad", "launch_covered", jSONObject);
        } catch (Exception unused) {
        }
    }

    /* renamed from: d */
    static void m45377d(List<C18602b> list) {
        if (C18742h.m45697b(C18642g.m45184L()) && !C18740f.m45691a(list) && C18642g.m45250w() != null && C18642g.m45251x() != null && C18642g.m45251x().mo38373a()) {
            for (C18602b bVar : list) {
                if (bVar != null && bVar.mo37977a() && bVar.f51352z != 0 && C18744j.m45702a(bVar.f51330d) == 5 && C18742h.m45697b(C18642g.m45184L())) {
                    boolean z = true;
                    if (bVar.f51352z != 1) {
                        if (bVar.f51352z == 2) {
                            Context L = C18642g.m45184L();
                            if (!C18742h.m45697b(L) || C18742h.m45698c(L) != 1) {
                                z = false;
                            }
                            if (!z) {
                            }
                        }
                    }
                    C18642g.m45250w().mo38382a(bVar.f51330d, "microgame".equals(Uri.parse(bVar.f51330d).getHost()));
                    new StringBuilder("preload micro app success:").append(false);
                }
            }
        }
    }

    /* renamed from: e */
    private boolean m45379e(C18602b bVar) {
        if (!C18744j.m45718a(bVar)) {
            C18586b.m44982a();
            C18586b.m44986a(bVar, "splash_start_download");
        }
        C18617n nVar = bVar.f51339m;
        boolean z = false;
        if (nVar == null || !bVar.mo37977a()) {
            return false;
        }
        String a = C18744j.m45706a(nVar);
        String a2 = C18744j.m45707a(nVar, bVar.mo37993o());
        if (C18747l.m45742a(a) || C18747l.m45742a(a2) || !m45383g(bVar)) {
            return false;
        }
        C18731f a3 = m45365a(bVar, true);
        long currentTimeMillis = System.currentTimeMillis();
        if (C18642g.m45250w() != null) {
            try {
                z = C18642g.m45250w().mo38381a(a, a2, a3);
            } catch (Exception unused) {
                C18741g.m45694a("下载线程出错");
            }
        }
        long p = bVar.mo37863p();
        StringBuilder sb = new StringBuilder("是否下载成功：");
        sb.append(z);
        sb.append(", 视频广告资源 url：");
        sb.append(a);
        C18735a.m45661a(p, sb.toString());
        if (z) {
            m45372a(a2, bVar.mo37982e());
            m45374b(bVar, 16);
            m45367a(1, a2);
            m45366a(2, System.currentTimeMillis() - currentTimeMillis);
        } else {
            m45374b(bVar, 17);
        }
        return z;
    }

    /* renamed from: f */
    private void m45380f(List<C18602b> list) {
        boolean z;
        if (C18642g.m45248u() == null) {
            C18642g.f51509e = C24076h.m58898a(C24085m.m58928a(C24093p.FIXED).mo49844a(C18654k.m45259a().f51562i).mo49847a());
        }
        if (C18642g.f51512h == null) {
            C18642g.f51512h = new ConcurrentHashMap<>();
        }
        int c = C18742h.m45698c(C18642g.m45184L());
        if (c != 0) {
            for (final C18602b bVar : list) {
                if (bVar != null && bVar.mo37977a()) {
                    boolean z2 = true;
                    if ((bVar.f51351y & c) != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (z) {
                        long p = bVar.mo37863p();
                        if (C18642g.f51512h.containsKey(Long.valueOf(p))) {
                            z2 = false;
                        } else {
                            C18642g.f51512h.put(Long.valueOf(p), Integer.valueOf(0));
                        }
                        if (z2) {
                            switch (bVar.mo37865x()) {
                                case 0:
                                case 1:
                                case 4:
                                    C18642g.m45248u().execute(new Runnable() {
                                        public final void run() {
                                            Thread currentThread = Thread.currentThread();
                                            StringBuilder sb = new StringBuilder("SplashSDKDownloadThread_");
                                            sb.append(bVar.mo37863p());
                                            currentThread.setName(sb.toString());
                                            C18665t.this.mo38129a(bVar);
                                            C18642g.m45200a(bVar.mo37863p());
                                        }
                                    });
                                    break;
                                case 2:
                                case 3:
                                    C18642g.m45248u().execute(new Runnable() {
                                        public final void run() {
                                            Thread currentThread = Thread.currentThread();
                                            StringBuilder sb = new StringBuilder("SplashSDKDownloadThread_");
                                            sb.append(bVar.mo37863p());
                                            currentThread.setName(sb.toString());
                                            C18665t.this.mo38131b(bVar);
                                            C18642g.m45200a(bVar.mo37863p());
                                        }
                                    });
                                    break;
                            }
                        }
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public void mo38133c(List<C18602b> list) {
        if (C18742h.m45697b(C18642g.m45184L()) && !C18740f.m45691a(list) && C18642g.m45250w() != null) {
            try {
                if (C18742h.m45698c(C18642g.m45184L()) != 0) {
                    for (C18602b bVar : list) {
                        if (bVar != null && bVar.mo37977a()) {
                            switch (bVar.mo37865x()) {
                                case 0:
                                case 1:
                                case 4:
                                    m45369a(bVar, 1);
                                    if (C18740f.m45691a(bVar.f51337k)) {
                                        break;
                                    } else {
                                        for (C18602b bVar2 : bVar.f51337k) {
                                            if (bVar2 != null && bVar2.mo37977a()) {
                                                m45369a(bVar2, 1);
                                            }
                                        }
                                        break;
                                    }
                                case 2:
                                case 3:
                                    m45369a(bVar, 2);
                                    break;
                            }
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
    }

    /* renamed from: a */
    static void m45368a(long j) {
        if (j > 0) {
            StringBuilder sb = new StringBuilder("splash remote server time: ");
            sb.append(j);
            C18741g.m45694a(sb.toString());
            C18673u.m45399a().mo38152c(j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:24:0x0074  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x008a  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private boolean m45381f(com.p683ss.android.p1103ad.splash.core.p1114c.C18602b r11) {
        /*
            r10 = this;
            boolean r0 = com.p683ss.android.p1103ad.splash.p1123g.C18744j.m45718a(r11)
            if (r0 != 0) goto L_0x0015
            int r0 = r11.mo37865x()
            r1 = 3
            if (r0 == r1) goto L_0x0015
            com.p683ss.android.p1103ad.splash.core.p1113b.C18586b.m44982a()
            java.lang.String r0 = "splash_start_download"
            com.p683ss.android.p1103ad.splash.core.p1113b.C18586b.m44986a(r11, r0)
        L_0x0015:
            com.ss.android.ad.splash.core.c.f r0 = r11.f51317a
            r1 = 0
            if (r0 != 0) goto L_0x001b
            return r1
        L_0x001b:
            java.lang.String r2 = com.p683ss.android.p1103ad.splash.p1123g.C18744j.m45705a(r0)
            java.lang.String r0 = com.p683ss.android.p1103ad.splash.p1123g.C18744j.m45724b(r0)
            boolean r3 = com.p683ss.android.p1103ad.splash.p1123g.C18747l.m45742a(r2)
            if (r3 != 0) goto L_0x008e
            boolean r3 = com.p683ss.android.p1103ad.splash.p1123g.C18747l.m45742a(r0)
            if (r3 == 0) goto L_0x0030
            goto L_0x008e
        L_0x0030:
            boolean r3 = m45384h(r11)
            if (r3 != 0) goto L_0x0037
            return r1
        L_0x0037:
            com.ss.android.ad.splash.f r3 = m45365a(r11, r1)
            long r4 = java.lang.System.currentTimeMillis()
            com.ss.android.ad.splash.v r6 = com.p683ss.android.p1103ad.splash.core.C18642g.m45250w()
            if (r6 == 0) goto L_0x0053
            com.ss.android.ad.splash.v r6 = com.p683ss.android.p1103ad.splash.core.C18642g.m45250w()     // Catch:{ Exception -> 0x004e }
            boolean r3 = r6.mo38381a(r2, r0, r3)     // Catch:{ Exception -> 0x004e }
            goto L_0x0054
        L_0x004e:
            java.lang.String r3 = "下载线程出错"
            com.p683ss.android.p1103ad.splash.p1123g.C18741g.m45694a(r3)
        L_0x0053:
            r3 = 0
        L_0x0054:
            long r6 = r11.mo37863p()
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "是否下载成功："
            r8.<init>(r9)
            r8.append(r3)
            java.lang.String r9 = ", 图片广告资源 url："
            r8.append(r9)
            r8.append(r2)
            java.lang.String r2 = r8.toString()
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45661a(r6, r2)
            r2 = 1
            if (r3 == 0) goto L_0x008a
            long r6 = r11.mo37982e()
            m45372a(r0, r6)
            r10.m45374b(r11, r1)
            m45367a(r1, r0)
            long r0 = java.lang.System.currentTimeMillis()
            long r0 = r0 - r4
            m45366a(r2, r0)
            goto L_0x008d
        L_0x008a:
            r10.m45374b(r11, r2)
        L_0x008d:
            return r3
        L_0x008e:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1103ad.splash.core.C18665t.m45381f(com.ss.android.ad.splash.core.c.b):boolean");
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:102:0x0160 A[Catch:{ Throwable -> 0x016a }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0115 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:117:0x0163 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x00a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:124:0x00a9 A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:45:0x00af A[Catch:{ Throwable -> 0x016a }] */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x00fc A[Catch:{ Throwable -> 0x016a }] */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo38132b(java.util.List<com.p683ss.android.p1103ad.splash.core.p1114c.C18602b> r10) {
        /*
            r9 = this;
            android.content.Context r0 = com.p683ss.android.p1103ad.splash.core.C18642g.m45184L()
            boolean r0 = com.p683ss.android.p1103ad.splash.p1123g.C18742h.m45697b(r0)
            if (r0 != 0) goto L_0x000b
            return
        L_0x000b:
            boolean r0 = com.p683ss.android.p1103ad.splash.p1123g.C18740f.m45691a(r10)
            if (r0 == 0) goto L_0x0012
            return
        L_0x0012:
            java.lang.String r0 = "准备开始下载广告素材"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45667b(r0)
            com.ss.android.ad.splash.c.c r0 = com.p683ss.android.p1103ad.splash.core.C18642g.m45182J()
            if (r0 == 0) goto L_0x0051
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
            java.util.Iterator r1 = r10.iterator()
        L_0x0026:
            boolean r2 = r1.hasNext()
            if (r2 == 0) goto L_0x004a
            java.lang.Object r2 = r1.next()
            com.ss.android.ad.splash.core.c.b r2 = (com.p683ss.android.p1103ad.splash.core.p1114c.C18602b) r2
            boolean r3 = r2.mo37990l()
            if (r3 == 0) goto L_0x0026
            java.lang.String r3 = r2.mo37857C()
            boolean r3 = com.p683ss.android.p1103ad.splash.p1123g.C18747l.m45742a(r3)
            if (r3 != 0) goto L_0x0026
            java.lang.String r2 = r2.mo37857C()
            r0.add(r2)
            goto L_0x0026
        L_0x004a:
            com.ss.android.ad.splash.c.c r1 = com.p683ss.android.p1103ad.splash.core.C18642g.m45182J()
            r1.mo37868a(r0)
        L_0x0051:
            com.ss.android.ad.splash.core.k r0 = com.p683ss.android.p1103ad.splash.core.C18654k.m45259a()
            int r0 = r0.f51562i
            if (r0 <= 0) goto L_0x0074
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "命中并行下载实验，并行线程数量为 "
            r0.<init>(r1)
            com.ss.android.ad.splash.core.k r1 = com.p683ss.android.p1103ad.splash.core.C18654k.m45259a()
            int r1 = r1.f51562i
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45667b(r0)
            r9.m45380f(r10)
            return
        L_0x0074:
            boolean r0 = com.p683ss.android.p1103ad.splash.core.C18642g.f51473K
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = "命中下载策略，是否下载资源只受 predownload 字段控制"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45667b(r0)
            r9.m45378e(r10)
            return
        L_0x0081:
            android.content.Context r0 = com.p683ss.android.p1103ad.splash.core.C18642g.m45184L()     // Catch:{ Throwable -> 0x016a }
            int r0 = com.p683ss.android.p1103ad.splash.p1123g.C18742h.m45698c(r0)     // Catch:{ Throwable -> 0x016a }
            if (r0 != 0) goto L_0x008c
            return
        L_0x008c:
            r1 = 0
            r2 = 1
            if (r0 != r2) goto L_0x0092
            r3 = 1
            goto L_0x0093
        L_0x0092:
            r3 = 0
        L_0x0093:
            if (r3 != 0) goto L_0x00a4
            com.ss.android.ad.splash.o r3 = com.p683ss.android.p1103ad.splash.core.C18642g.f51529y     // Catch:{ Throwable -> 0x016a }
            if (r3 == 0) goto L_0x009e
            boolean r3 = r3.mo38372a()     // Catch:{ Throwable -> 0x016a }
            goto L_0x009f
        L_0x009e:
            r3 = 0
        L_0x009f:
            if (r3 == 0) goto L_0x00a2
            goto L_0x00a4
        L_0x00a2:
            r3 = 0
            goto L_0x00a5
        L_0x00a4:
            r3 = 1
        L_0x00a5:
            java.util.Iterator r10 = r10.iterator()     // Catch:{ Throwable -> 0x016a }
        L_0x00a9:
            boolean r4 = r10.hasNext()     // Catch:{ Throwable -> 0x016a }
            if (r4 == 0) goto L_0x0169
            java.lang.Object r4 = r10.next()     // Catch:{ Throwable -> 0x016a }
            com.ss.android.ad.splash.core.c.b r4 = (com.p683ss.android.p1103ad.splash.core.p1114c.C18602b) r4     // Catch:{ Throwable -> 0x016a }
            if (r4 == 0) goto L_0x00a9
            boolean r5 = r4.mo37977a()     // Catch:{ Throwable -> 0x016a }
            if (r5 == 0) goto L_0x00a9
            int r5 = r4.mo37865x()     // Catch:{ Throwable -> 0x016a }
            switch(r5) {
                case 0: goto L_0x011b;
                case 1: goto L_0x011b;
                case 2: goto L_0x00c5;
                case 3: goto L_0x00c5;
                case 4: goto L_0x011b;
                default: goto L_0x00c4;
            }     // Catch:{ Throwable -> 0x016a }
        L_0x00c4:
            goto L_0x00a9
        L_0x00c5:
            int r5 = r4.f51351y     // Catch:{ Throwable -> 0x016a }
            r5 = r5 & r0
            if (r5 == 0) goto L_0x00cc
            r5 = 1
            goto L_0x00cd
        L_0x00cc:
            r5 = 0
        L_0x00cd:
            if (r3 != 0) goto L_0x00d1
            if (r5 == 0) goto L_0x00a9
        L_0x00d1:
            int r5 = r4.mo37856B()     // Catch:{ Throwable -> 0x016a }
            boolean r5 = com.p683ss.android.p1103ad.splash.p1123g.C18744j.m45716a(r5, r2)     // Catch:{ Throwable -> 0x016a }
            if (r3 == 0) goto L_0x00e1
            if (r5 == 0) goto L_0x00e1
            r9.m45386j(r4)     // Catch:{ Throwable -> 0x016a }
            goto L_0x00f4
        L_0x00e1:
            boolean r6 = r9.m45379e(r4)     // Catch:{ Throwable -> 0x016a }
            if (r6 == 0) goto L_0x00f4
            com.ss.android.ad.splash.core.u r6 = com.p683ss.android.p1103ad.splash.core.C18673u.m45399a()     // Catch:{ Throwable -> 0x016a }
            com.ss.android.ad.splash.core.c.n r7 = r4.f51339m     // Catch:{ Throwable -> 0x016a }
            r6.mo38146a(r7)     // Catch:{ Throwable -> 0x016a }
            if (r3 != 0) goto L_0x00f4
            r6 = 1
            goto L_0x00f5
        L_0x00f4:
            r6 = 0
        L_0x00f5:
            int r7 = r4.mo37865x()     // Catch:{ Throwable -> 0x016a }
            r8 = 3
            if (r7 != r8) goto L_0x0113
            if (r3 == 0) goto L_0x0104
            if (r5 == 0) goto L_0x0104
            r9.m45385i(r4)     // Catch:{ Throwable -> 0x016a }
            goto L_0x0113
        L_0x0104:
            boolean r5 = r9.m45381f(r4)     // Catch:{ Throwable -> 0x016a }
            if (r5 == 0) goto L_0x0113
            com.ss.android.ad.splash.core.u r5 = com.p683ss.android.p1103ad.splash.core.C18673u.m45399a()     // Catch:{ Throwable -> 0x016a }
            com.ss.android.ad.splash.core.c.f r4 = r4.f51317a     // Catch:{ Throwable -> 0x016a }
            r5.mo38145a(r4)     // Catch:{ Throwable -> 0x016a }
        L_0x0113:
            if (r6 == 0) goto L_0x00a9
            java.lang.String r10 = "在非 wifi 环境下下载了一个视频，不再下载其他资源了"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45667b(r10)     // Catch:{ Throwable -> 0x016a }
            return
        L_0x011b:
            int r5 = r4.f51351y     // Catch:{ Throwable -> 0x016a }
            r5 = r5 & r0
            if (r5 == 0) goto L_0x0122
            r5 = 1
            goto L_0x0123
        L_0x0122:
            r5 = 0
        L_0x0123:
            int r6 = r4.mo38000w()     // Catch:{ Throwable -> 0x016a }
            if (r6 != r2) goto L_0x012d
            if (r3 != 0) goto L_0x012d
            if (r5 == 0) goto L_0x00a9
        L_0x012d:
            int r5 = r4.mo37856B()     // Catch:{ Throwable -> 0x016a }
            boolean r5 = com.p683ss.android.p1103ad.splash.p1123g.C18744j.m45716a(r5, r1)     // Catch:{ Throwable -> 0x016a }
            if (r3 == 0) goto L_0x013d
            if (r5 == 0) goto L_0x013d
            r9.m45385i(r4)     // Catch:{ Throwable -> 0x016a }
            goto L_0x0150
        L_0x013d:
            boolean r6 = r9.m45381f(r4)     // Catch:{ Throwable -> 0x016a }
            if (r6 == 0) goto L_0x0150
            com.ss.android.ad.splash.core.u r6 = com.p683ss.android.p1103ad.splash.core.C18673u.m45399a()     // Catch:{ Throwable -> 0x016a }
            com.ss.android.ad.splash.core.c.f r7 = r4.f51317a     // Catch:{ Throwable -> 0x016a }
            r6.mo38145a(r7)     // Catch:{ Throwable -> 0x016a }
            if (r3 != 0) goto L_0x0150
            r6 = 1
            goto L_0x0151
        L_0x0150:
            r6 = 0
        L_0x0151:
            if (r3 == 0) goto L_0x015a
            if (r5 == 0) goto L_0x015a
            r9.m45376d(r4)     // Catch:{ Throwable -> 0x016a }
            r4 = 0
            goto L_0x015e
        L_0x015a:
            boolean r4 = r9.m45375c(r4)     // Catch:{ Throwable -> 0x016a }
        L_0x015e:
            if (r3 != 0) goto L_0x0161
            r6 = r6 | r4
        L_0x0161:
            if (r6 == 0) goto L_0x00a9
            java.lang.String r10 = "非 wifi 环境下下载了一张图片，不再下载其他资源了"
            com.p683ss.android.p1103ad.splash.p1123g.C18735a.m45667b(r10)     // Catch:{ Throwable -> 0x016a }
            return
        L_0x0169:
            return
        L_0x016a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.p1103ad.splash.core.C18665t.mo38132b(java.util.List):void");
    }

    /* renamed from: b */
    private void m45374b(C18602b bVar, int i) {
        m45370a(bVar, i, false);
    }

    /* renamed from: a */
    private static C18731f m45365a(C18602b bVar, boolean z) {
        C18732a aVar = new C18732a();
        aVar.mo38342a(bVar.mo37863p()).mo38344a(bVar.mo37864r()).mo38343a(bVar.f51345s).mo38345a(C18744j.m45718a(bVar)).mo38347b(bVar.mo37973J());
        if (z) {
            aVar.mo38341a(2);
        } else {
            aVar.mo38341a(1);
        }
        C18731f a = aVar.mo38346a();
        a.f51810d = bVar.mo37990l();
        return a;
    }

    /* renamed from: a */
    public static void m45366a(int i, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("duration", Long.valueOf(j));
            jSONObject.putOpt("res_type", Integer.valueOf(i));
            C18550a.m44899a().mo37846b("service_ad_res_download_time", 0, jSONObject, null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    public static void m45367a(int i, String str) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.putOpt("key_ad_file_size", Long.valueOf(C18738d.m45685a(str)));
            C18550a.m44899a().mo37846b("sevice_ad_file_size", i, jSONObject, null);
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m45369a(C18602b bVar, int i) {
        new C18732a().mo38342a(bVar.mo37863p()).mo38344a(bVar.mo37864r()).mo38341a(i).mo38343a(bVar.f51345s).mo38347b(bVar.mo37973J()).mo38346a();
    }

    /* renamed from: a */
    public static void m45370a(C18602b bVar, int i, boolean z) {
        String str;
        JSONObject jSONObject = new JSONObject();
        String str2 = "";
        String str3 = "";
        try {
            JSONObject jSONObject2 = new JSONObject();
            switch (i) {
                case 0:
                    str2 = C18744j.m45705a(bVar.f51317a);
                    str3 = "download_image_succeed";
                    jSONObject2.putOpt("image_mode", Integer.valueOf(bVar.mo38000w()));
                    break;
                case 1:
                    str2 = C18744j.m45705a(bVar.f51317a);
                    str3 = "download_image_failed";
                    jSONObject2.putOpt("image_mode", Integer.valueOf(bVar.mo38000w()));
                    break;
                case 16:
                    str2 = C18744j.m45706a(bVar.f51339m);
                    str3 = "download_video_succeed";
                    break;
                case 17:
                    str2 = C18744j.m45706a(bVar.f51339m);
                    str3 = "download_video_failed";
                    break;
            }
            jSONObject.putOpt("log_extra", bVar.mo37864r());
            jSONObject.putOpt("is_ad_event", "1");
            jSONObject.putOpt("ad_fetch_time", Long.valueOf(bVar.mo37862f()));
            jSONObject2.putOpt("url", str2);
            String str4 = "is_async";
            if (z) {
                str = "1";
            } else {
                str = "0";
            }
            jSONObject2.putOpt(str4, str);
            jSONObject.putOpt("ad_extra_data", jSONObject2);
            C18642g.m45201a(bVar.mo37863p(), "splash_ad", str3, jSONObject);
        } catch (Exception unused) {
        }
    }
}
