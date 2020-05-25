package com.p683ss.android.ugc.aweme.utils;

import android.os.SystemClock;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.geckox.C10026a;
import com.bytedance.geckox.C10044b;
import com.bytedance.geckox.C10044b.C10047a;
import com.bytedance.geckox.model.CheckRequestBodyModel.GroupType;
import com.bytedance.geckox.p607f.C10105a;
import com.bytedance.geckox.p612j.C10120b;
import com.bytedance.geckox.utils.C10166m;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.geckoclient.C10885e;
import com.bytedance.ies.geckoclient.C10885e.C10895a;
import com.bytedance.ies.geckoclient.C10897g;
import com.bytedance.ies.geckoclient.model.C10957d;
import com.bytedance.ies.geckoclient.p679a.C10865a.C10867a;
import com.bytedance.ies.geckoclient.p679a.C10868b;
import com.bytedance.ies.geckoclient.p682d.C10882b;
import com.bytedance.ies.geckoclient.p686e.C10941f;
import com.bytedance.ies.geckoclient.p686e.C10941f.C10942a;
import com.bytedance.ies.geckoclient.p687f.C10945a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.sdk.webview.C19767n;
import com.p683ss.android.sdk.webview.GeckoXExperiment;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.crossplatform.abtest.DynamicChannelExperiment;
import com.p683ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p683ss.android.ugc.aweme.gecko.C32802a;
import com.p683ss.android.ugc.aweme.gecko.C32803b;
import com.p683ss.android.ugc.aweme.gecko.GeckoXNetImpl;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import com.p683ss.android.ugc.aweme.p1706fe.utils.C29976e;
import com.p683ss.android.ugc.aweme.utils.p2389c.C47744a;
import com.p683ss.android.ugc.aweme.utils.p2389c.C47751c;
import com.p683ss.android.ugc.aweme.web.C48274d;
import com.p683ss.android.ugc.aweme.web.C48275e;
import com.p683ss.android.ugc.aweme.web.C48276f;
import com.p683ss.android.ugc.aweme.web.C48277g;
import com.p683ss.android.ugc.aweme.web.C48380q;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import org.json.JSONObject;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.utils.bq */
public class C47731bq {

    /* renamed from: a */
    public static volatile long f120239a;

    /* renamed from: b */
    public static volatile boolean f120240b = false;

    /* renamed from: c */
    public static String f120241c;

    /* renamed from: d */
    static final /* synthetic */ boolean f120242d = (!C47731bq.class.desiredAssertionStatus());

    /* renamed from: e */
    private static volatile boolean f120243e;

    /* renamed from: f */
    private static AtomicBoolean f120244f = new AtomicBoolean(false);

    /* renamed from: a */
    public static Set<String> m103331a() {
        return C47751c.m103375a().f120269c.mo95026a();
    }

    /* renamed from: e */
    public static C10885e m103348e() {
        C48274d a = C48274d.m104575a();
        if (a != null) {
            return a.mo95780a(C48380q.m104672e().mo41210d());
        }
        return null;
    }

    /* renamed from: f */
    public static boolean m103352f() {
        return C10181b.m20511a().mo18172a(GeckoXExperiment.class, true, "enable_gecko_x", 31744, false);
    }

    /* renamed from: l */
    private static C10026a m103363l() {
        C48276f a = C48276f.m104588a();
        if (a != null) {
            return a.mo95784a(C48380q.m104672e().mo41210d());
        }
        return null;
    }

    /* renamed from: m */
    private static C10026a m103365m() {
        C48276f a = C48276f.m104588a();
        if (a != null) {
            return a.mo95786b(C48380q.m104672e().mo41210d());
        }
        return null;
    }

    /* renamed from: b */
    public static Map<String, String> m103338b() {
        HashMap hashMap = new HashMap();
        hashMap.put("channel", C11010c.m22295p());
        hashMap.put("iid", TeaAgent.getInstallId());
        return hashMap;
    }

    /* renamed from: c */
    public static synchronized void m103342c() {
        synchronized (C47731bq.class) {
            if (m103354g()) {
                C10026a k = m103361k();
                if (k != null) {
                    k.mo18000a(GroupType.NORMAL.getValue(), (C10105a) new C48277g());
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0027, code lost:
        return;
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static synchronized void m103347d() {
        /*
            java.lang.Class<com.ss.android.ugc.aweme.utils.bq> r0 = com.p683ss.android.ugc.aweme.utils.C47731bq.class
            monitor-enter(r0)
            boolean r1 = f120243e     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0009
            monitor-exit(r0)
            return
        L_0x0009:
            boolean r1 = m103354g()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0026
            com.bytedance.geckox.a r1 = m103361k()     // Catch:{ all -> 0x0028 }
            if (r1 == 0) goto L_0x0026
            r2 = 1
            f120243e = r2     // Catch:{ all -> 0x0028 }
            com.bytedance.geckox.model.CheckRequestBodyModel$GroupType r2 = com.bytedance.geckox.model.CheckRequestBodyModel.GroupType.HIGHPRIORITY     // Catch:{ all -> 0x0028 }
            java.lang.String r2 = r2.getValue()     // Catch:{ all -> 0x0028 }
            com.ss.android.ugc.aweme.web.g r3 = new com.ss.android.ugc.aweme.web.g     // Catch:{ all -> 0x0028 }
            r3.<init>()     // Catch:{ all -> 0x0028 }
            r1.mo18000a(r2, r3)     // Catch:{ all -> 0x0028 }
        L_0x0026:
            monitor-exit(r0)
            return
        L_0x0028:
            r1 = move-exception
            monitor-exit(r0)
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47731bq.m103347d():void");
    }

    /* renamed from: g */
    public static boolean m103354g() {
        if (!C10181b.m20511a().mo18172a(GeckoXExperiment.class, true, "enable_gecko_x", 31744, false) || !C10181b.m20511a().mo18172a(GeckoXChannelGroupExperiment.class, true, "enable_gecko_x_group", 31744, true)) {
            return false;
        }
        return true;
    }

    /* renamed from: j */
    private static Set<String> m103359j() {
        Set<String> a = C47751c.m103375a().f120268b.mo95026a();
        Set set = (Set) SharePrefCache.inst().getGeckoInitialHighPriorityChannels().mo47782d();
        if (!C9376b.m18558a((Collection<T>) set)) {
            a.addAll(set);
        }
        if (C9376b.m18558a((Collection<T>) a)) {
            return null;
        }
        a.add("rn_base_android");
        a.add("rn_snapshot");
        m103333a((Collection<String>) a);
        return a;
    }

    /* renamed from: h */
    static final /* synthetic */ C48276f m103356h() {
        C48276f fVar = new C48276f();
        String d = C48380q.m104672e().mo41210d();
        fVar.mo95785a(d, m103353g(d));
        IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
        if (!(createIAdServicebyMonsterPlugin == null || createIAdServicebyMonsterPlugin.getAdLandPagePreloadService() == null)) {
            String e = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46659e(C22858c.f61207c);
            String e2 = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46659e("splash");
            if (!TextUtils.isEmpty(e)) {
                if (f120242d || e != null) {
                    fVar.mo95785a(e, m103344d(e));
                } else {
                    throw new AssertionError();
                }
            }
            if (!TextUtils.isEmpty(e2)) {
                if (f120242d || e2 != null) {
                    fVar.mo95785a(e2, m103344d(e2));
                } else {
                    throw new AssertionError();
                }
            }
        }
        return fVar;
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(8:4|5|6|7|8|9|(1:12)|13) */
    /* JADX WARNING: Failed to process nested try/catch */
    /* JADX WARNING: Missing exception handler attribute for start block: B:7:0x003b */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x0071  */
    /* renamed from: i */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private static java.util.Set<java.lang.String> m103358i() {
        /*
            com.ss.android.ugc.aweme.utils.c.c r0 = com.p683ss.android.ugc.aweme.utils.p2389c.C47751c.m103375a()
            com.ss.android.ugc.aweme.utils.c.d<java.lang.String> r0 = r0.f120267a
            java.util.Set r0 = r0.mo95026a()
            com.ss.android.ugc.aweme.app.SharePrefCache r1 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r1 = r1.getGeckoChannels()
            java.lang.Object r1 = r1.mo47782d()
            java.util.Collection r1 = (java.util.Collection) r1
            r0.addAll(r1)
            boolean r1 = r0.isEmpty()
            if (r1 == 0) goto L_0x0027
            java.util.HashSet r0 = new java.util.HashSet
            r0.<init>()
            return r0
        L_0x0027:
            java.util.List<java.lang.String> r1 = com.bytedance.android.livesdkapi.p448f.C8742c.f24012c
            r0.addAll(r1)
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x003b }
            com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig r1 = r1.getAdLandingPageConfig()     // Catch:{ a -> 0x003b }
            java.util.List r1 = r1.getAdLandingPagePreloadCommonChannel()     // Catch:{ a -> 0x003b }
            r0.addAll(r1)     // Catch:{ a -> 0x003b }
        L_0x003b:
            com.ss.android.ugc.aweme.global.config.settings.pojo.IESSettingsProxy r1 = com.p683ss.android.ugc.aweme.global.config.settings.C32816h.m75716b()     // Catch:{ a -> 0x004a }
            com.ss.android.ugc.aweme.global.config.settings.pojo.AdLandingPageConfig r1 = r1.getAdLandingPageConfig()     // Catch:{ a -> 0x004a }
            java.util.List r1 = r1.getAdCardPreloadCommonChannel()     // Catch:{ a -> 0x004a }
            r0.addAll(r1)     // Catch:{ a -> 0x004a }
        L_0x004a:
            java.lang.String r1 = "rn_base_android"
            r0.add(r1)
            java.lang.String r1 = "rn_snapshot"
            r0.add(r1)
            java.lang.String r1 = "poi_resource"
            r0.add(r1)
            java.lang.String r1 = "gecko_hybrid_prefetch_zip"
            r0.add(r1)
            m103333a(r0)
            com.ss.android.ugc.aweme.utils.c.c r1 = com.p683ss.android.ugc.aweme.utils.p2389c.C47751c.m103375a()
            com.ss.android.ugc.aweme.utils.c.d<java.lang.String> r1 = r1.f120270d
            java.util.Set r1 = r1.mo95026a()
            boolean r2 = com.bytedance.common.utility.p522b.C9376b.m18558a(r1)
            if (r2 != 0) goto L_0x0074
            r0.removeAll(r1)
        L_0x0074:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.utils.C47731bq.m103358i():java.util.Set");
    }

    /* renamed from: k */
    private static C10026a m103361k() {
        String serverDeviceId = TeaAgent.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId)) {
            return null;
        }
        try {
            return C10026a.m20173a(new C10047a(C11010c.m22280a()).mo18031c(C48380q.m104676k()).mo18023a((long) C11010c.m22289j()).mo18026a(C11010c.m22294o()).mo18024a((C10120b) new GeckoXNetImpl(C11010c.m22280a())).mo18027a(C48380q.m104672e().mo41210d()).mo18030b(C48380q.m104672e().mo41210d()).mo18029b(serverDeviceId).mo18025a(C48380q.m104672e().mo95834j()).mo18028a());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: j */
    public static boolean m103360j(String str) {
        return m103343c(C48380q.m104672e().mo41210d(), str);
    }

    /* renamed from: b */
    public static C10885e m103335b(C19767n nVar) {
        C48274d a = C48274d.m104575a();
        if (nVar == null || a == null) {
            return null;
        }
        return a.mo95780a(nVar.mo41210d());
    }

    /* renamed from: a */
    public static void m103332a(String str) {
        if (!f120244f.get()) {
            f120241c = str;
            synchronized (C47731bq.class) {
                if (!f120244f.get()) {
                    ServiceManager.get().bind(C48276f.class, C47734br.f120248a).asSingleton();
                    f120244f.set(true);
                }
            }
        }
    }

    /* renamed from: e */
    public static void m103350e(String str) {
        if (m103352f()) {
            m103332a(str);
            if (!m103354g()) {
                C10026a l = m103363l();
                if (l != null) {
                    l.mo18003a((List<String>) new ArrayList<String>(m103358i()), (C10105a) new C48277g());
                }
            }
        } else {
            m103339b(str);
            C0013i.m16a(C47739bw.f120253a).mo20a(C47740bx.f120254a, (Executor) C0013i.f24a);
        }
    }

    /* renamed from: f */
    public static void m103351f(String str) {
        if (m103352f()) {
            Set j = m103359j();
            if (j != null && !j.isEmpty()) {
                m103332a(str);
                if (!m103354g()) {
                    C10026a m = m103365m();
                    if (m != null) {
                        m.mo18003a((List<String>) new ArrayList<String>(j), (C10105a) null);
                    }
                }
            }
            return;
        }
        m103339b(str);
        C0013i.m16a(C47741by.f120255a).mo20a(C47742bz.f120256a, (Executor) C0013i.f24a);
    }

    /* renamed from: h */
    public static C10885e m103355h(String str) {
        C48274d a = C48274d.m104575a();
        IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
        if (a == null || createIAdServicebyMonsterPlugin == null || createIAdServicebyMonsterPlugin.getAdLandPagePreloadService() == null) {
            return null;
        }
        String e = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46659e(str);
        if (TextUtils.isEmpty(e)) {
            return null;
        }
        return a.mo95780a(e);
    }

    /* renamed from: i */
    public static String m103357i(String str) {
        String d = C48380q.m104672e().mo41210d();
        if (C47744a.m103372a()) {
            return m103346d(d, str);
        }
        StringBuilder sb = new StringBuilder();
        sb.append(C48380q.m104674h());
        sb.append(File.separator);
        sb.append(C48380q.m104672e().mo95835l());
        sb.append(File.separator);
        sb.append(str);
        return sb.toString();
    }

    /* renamed from: l */
    private static void m103364l(String str) {
        boolean a = C10181b.m20511a().mo18172a(GeckoPerformanceExperiment.class, true, "gecko_performance", 31744, false);
        C10941f a2 = C10941f.m22204a();
        if (a) {
            a2.mo19729b();
        } else {
            a2.mo19731c();
        }
        a2.mo19728a(str, new C10942a() {

            /* renamed from: a */
            private long f120245a;

            /* renamed from: a */
            public final void mo19732a(String str) {
                this.f120245a = SystemClock.uptimeMillis();
            }

            /* renamed from: b */
            public final void mo19733b(String str) {
                boolean z = C10941f.m22204a().f29355a;
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", SystemClock.uptimeMillis() - this.f120245a);
                    jSONObject.put("accesskey", str);
                    jSONObject.put("enable", z);
                } catch (Exception unused) {
                }
                C23569o.m57783b("service_monitor", "gecko_io_performance", jSONObject);
            }
        });
    }

    /* renamed from: a */
    public static C10026a m103328a(C19767n nVar) {
        String serverDeviceId = TeaAgent.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId) || nVar == null || TextUtils.isEmpty(nVar.mo41210d())) {
            return null;
        }
        try {
            return C10026a.m20173a(new C10047a(C11010c.m22280a()).mo18031c(C48380q.m104676k()).mo18023a((long) C11010c.m22289j()).mo18026a(C11010c.m22294o()).mo18024a((C10120b) new GeckoXNetImpl(C11010c.m22280a())).mo18027a(nVar.mo41210d()).mo18030b(nVar.mo41210d()).mo18029b(serverDeviceId).mo18025a(C48380q.m104672e().mo95834j()).mo18028a());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    public static void m103339b(String str) {
        if (!f120244f.get()) {
            f120241c = str;
            synchronized (C47731bq.class) {
                if (!f120244f.get()) {
                    ServiceManager.get().bind(C48274d.class, new C47735bs(str)).asSingleton();
                    f120244f.set(true);
                }
            }
        }
    }

    /* renamed from: d */
    public static C10026a m103344d(String str) {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId) || TextUtils.isEmpty(str)) {
            return null;
        }
        try {
            return C10026a.m20173a(new C10047a(C11010c.m22280a()).mo18024a((C10120b) new GeckoXNetImpl(C11010c.m22280a())).mo18031c(C48380q.m104676k()).mo18023a((long) C11010c.m22289j()).mo18026a(C11010c.m22294o()).mo18030b(str).mo18029b(serverDeviceId).mo18025a(C48380q.m104672e().mo95834j()).mo18028a());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: g */
    public static C10026a m103353g(String str) {
        String serverDeviceId = TeaAgent.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId)) {
            return null;
        }
        File j = C48380q.m104672e().mo95834j();
        try {
            C10044b a = new C10047a(C11010c.m22280a()).mo18024a((C10120b) new GeckoXNetImpl(C11010c.m22280a())).mo18031c(C48380q.m104676k()).mo18026a(C11010c.m22294o()).mo18023a((long) C11010c.m22289j()).mo18030b(str).mo18029b(serverDeviceId).mo18025a(j).mo18028a();
            C10026a.m20173a(a);
            return C10026a.m20173a(a);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public static C10026a m103340c(String str) {
        String serverDeviceId = TeaAgent.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId) || TextUtils.isEmpty(str)) {
            return null;
        }
        File j = C48380q.m104672e().mo95834j();
        IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
        if (createIAdServicebyMonsterPlugin == null) {
            return null;
        }
        String e = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46659e(C22858c.f61207c);
        String e2 = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46659e("splash");
        if (TextUtils.isEmpty(e) || TextUtils.isEmpty(e2)) {
            return null;
        }
        try {
            return C10026a.m20173a(new C10047a(C11010c.m22280a()).mo18031c(C48380q.m104676k()).mo18023a((long) C11010c.m22289j()).mo18026a(C11010c.m22294o()).mo18024a((C10120b) new GeckoXNetImpl(C11010c.m22280a())).mo18027a(C48380q.m104672e().mo41210d(), e, e2).mo18030b(str).mo18029b(serverDeviceId).mo18025a(j).mo18028a());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: k */
    static final /* synthetic */ C48274d m103362k(String str) {
        C48274d dVar = new C48274d();
        String d = C48380q.m104672e().mo41210d();
        dVar.mo95781a(d, m103329a(str, d));
        IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
        if (!(createIAdServicebyMonsterPlugin == null || createIAdServicebyMonsterPlugin.getAdLandPagePreloadService() == null)) {
            String e = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46659e(C22858c.f61207c);
            String e2 = createIAdServicebyMonsterPlugin.getAdLandPagePreloadService().mo46659e("splash");
            if (!TextUtils.isEmpty(e)) {
                if (f120242d || e != null) {
                    dVar.mo95781a(e, m103330a(str, e, 10));
                } else {
                    throw new AssertionError();
                }
            }
            if (!TextUtils.isEmpty(e2)) {
                if (f120242d || e2 != null) {
                    dVar.mo95781a(e2, m103330a(str, e2, 10));
                } else {
                    throw new AssertionError();
                }
            }
        }
        return dVar;
    }

    /* renamed from: a */
    private static void m103333a(Collection<String> collection) {
        if (C10181b.m20511a().mo18168a(DynamicChannelExperiment.class, true, "bundle_dynamic_load", 31744, 0) == 1) {
            collection.removeAll(C47751c.m103375a().f120269c.mo95026a());
        }
    }

    /* renamed from: c */
    public static boolean m103343c(String str, String str2) {
        return m103334a(C48380q.m104675i(), str, str2);
    }

    /* renamed from: d */
    public static String m103346d(String str, String str2) {
        return m103341c(C48380q.m104675i(), str, str2);
    }

    /* renamed from: e */
    public static String m103349e(String str, String str2) {
        return m103337b(C48380q.m104675i(), str, str2);
    }

    /* renamed from: a */
    public static C10885e m103329a(String str, String str2) {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId)) {
            return null;
        }
        Set<String> i = m103358i();
        if (i.isEmpty()) {
            return null;
        }
        String g = C48380q.m104672e().mo95833g();
        try {
            m103364l(str2);
            C10895a a = C10885e.m22071a(C11010c.m22280a(), str2, str, serverDeviceId, g, "live_gecko", C11010c.m22289j()).mo19691a(C48380q.m104676k()).mo19689a((C10897g) new C48275e()).mo19687a((C10882b) new C32803b()).mo19688a((C10945a) new C32802a()).mo19694b(60, TimeUnit.SECONDS).mo19685a(60, TimeUnit.SECONDS).mo19692a(m103338b()).mo19686a(new C10867a().mo19639a(C10868b.f29174a).mo19640a());
            for (String dVar : i) {
                a.mo19690a(new C10957d(dVar));
            }
            return a.mo19693a();
        } catch (Exception e) {
            C29976e.f78229a.mo60156a("warning", e);
            return null;
        }
    }

    /* renamed from: b */
    public static C10885e m103336b(String str, String str2) {
        String serverDeviceId = AppLog.getServerDeviceId();
        String g = C48380q.m104672e().mo95833g();
        Set<String> a = C47751c.m103375a().f120268b.mo95026a();
        Set set = (Set) SharePrefCache.inst().getGeckoInitialHighPriorityChannels().mo47782d();
        if (!C9376b.m18558a((Collection<T>) set)) {
            a.addAll(set);
        }
        if (C9376b.m18558a((Collection<T>) a)) {
            return null;
        }
        try {
            m103364l(str2);
            C10895a a2 = C10885e.m22071a(C11010c.m22280a(), str2, str, serverDeviceId, g, "live_gecko", C11010c.m22289j()).mo19691a(C48380q.m104676k()).mo19689a((C10897g) new C48275e()).mo19687a((C10882b) new C32803b()).mo19688a((C10945a) new C32802a()).mo19694b(60, TimeUnit.SECONDS).mo19685a(60, TimeUnit.SECONDS).mo19692a(m103338b()).mo19686a(new C10867a().mo19639a(C10868b.f29174a).mo19640a());
            a.add("rn_base_android");
            a.add("rn_snapshot");
            m103333a((Collection<String>) a);
            for (String dVar : a) {
                a2.mo19690a(new C10957d(dVar));
            }
            C47751c.m103375a().f120270d.mo95028b(a);
            return a2.mo19693a();
        } catch (Exception e) {
            C29976e.f78229a.mo60156a("warning", e);
            return null;
        }
    }

    /* renamed from: a */
    private static boolean m103334a(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3) || m103345d(str, str2, str3) == null) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private static Long m103345d(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "gecko_offline_res_x";
        }
        try {
            File filesDir = C11010c.m22280a().getFilesDir();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            sb.append(str2);
            File file = new File(filesDir, sb.toString());
            if (!file.exists()) {
                return null;
            }
            File file2 = new File(file.getAbsolutePath(), str3);
            if (!file2.exists()) {
                return null;
            }
            return C10166m.m20492a(file2);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: a */
    private static C10885e m103330a(String str, String str2, int i) {
        String serverDeviceId = AppLog.getServerDeviceId();
        if (TextUtils.isEmpty(serverDeviceId)) {
            return null;
        }
        String g = C48380q.m104672e().mo95833g();
        try {
            m103364l(str2);
            C10895a a = C10885e.m22071a(C11010c.m22280a(), str2, str, serverDeviceId, g, "live_gecko", C11010c.m22289j()).mo19691a(C48380q.m104676k()).mo19689a((C10897g) new C48275e()).mo19687a((C10882b) new C32803b()).mo19688a((C10945a) new C32802a()).mo19694b(60, TimeUnit.SECONDS).mo19685a(60, TimeUnit.SECONDS).mo19692a(m103338b());
            C10867a aVar = new C10867a();
            aVar.f29171a = 10;
            C10867a a2 = aVar.mo19639a(C10868b.f29176c);
            a2.f29173c = C47736bt.f120250a;
            return a.mo19686a(a2.mo19640a()).mo19693a();
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: b */
    private static String m103337b(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "gecko_offline_res_x";
        }
        if (str3.indexOf("/") != 0) {
            return m103341c(str, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        String[] split = str3.split("/");
        if (split.length <= 1) {
            return null;
        }
        String str4 = split[1];
        for (int i = 2; i < split.length; i++) {
            sb.append(File.separator);
            sb.append(split[i]);
        }
        if (TextUtils.isEmpty(str4)) {
            return null;
        }
        try {
            File filesDir = C11010c.m22280a().getFilesDir();
            StringBuilder sb2 = new StringBuilder();
            sb2.append(str);
            sb2.append(File.separator);
            sb2.append(str2);
            File file = new File(filesDir, sb2.toString());
            if (!file.exists()) {
                return null;
            }
            String absolutePath = file.getAbsolutePath();
            File file2 = new File(absolutePath, str4);
            if (!file2.exists()) {
                return null;
            }
            Long a = C10166m.m20492a(file2);
            if (a == null) {
                return null;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(absolutePath);
            sb3.append(File.separator);
            sb3.append(str4);
            sb3.append(File.separator);
            sb3.append(a);
            sb3.append(File.separator);
            sb3.append("res");
            String sb4 = sb3.toString();
            if (sb.length() > 0) {
                StringBuilder sb5 = new StringBuilder();
                sb5.append(sb4);
                sb5.append(sb.toString());
                sb4 = sb5.toString();
            }
            return sb4;
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: c */
    private static String m103341c(String str, String str2, String str3) {
        if (TextUtils.isEmpty(str2) || TextUtils.isEmpty(str3)) {
            return null;
        }
        if (TextUtils.isEmpty(str)) {
            str = "gecko_offline_res_x";
        }
        if (str3.indexOf("/") == 0) {
            str3 = str3.substring(1);
        }
        if (str3.lastIndexOf("/") == str3.length() - 1) {
            str3 = str3.substring(0, str3.lastIndexOf("/"));
        }
        try {
            File filesDir = C11010c.m22280a().getFilesDir();
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(File.separator);
            sb.append(str2);
            File file = new File(filesDir, sb.toString());
            if (!file.exists()) {
                return null;
            }
            String absolutePath = file.getAbsolutePath();
            File file2 = new File(absolutePath, str3);
            if (!file2.exists()) {
                return null;
            }
            Long a = C10166m.m20492a(file2);
            if (a == null) {
                return null;
            }
            StringBuilder sb2 = new StringBuilder();
            sb2.append(absolutePath);
            sb2.append(File.separator);
            sb2.append(str3);
            sb2.append(File.separator);
            sb2.append(a);
            sb2.append(File.separator);
            sb2.append("res");
            return sb2.toString();
        } catch (Throwable unused) {
            return null;
        }
    }
}
