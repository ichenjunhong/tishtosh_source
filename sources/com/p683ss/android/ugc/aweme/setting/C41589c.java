package com.p683ss.android.ugc.aweme.setting;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9379e;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.uikit.p699c.C11089b;
import com.bytedance.keva.Keva;
import com.bytedance.p558e.C9741d;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.p1159di.push.C19073a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.commercialize.abtest.AwesomeSplashPreloadJsonExperiment;
import com.p683ss.android.ugc.aweme.commercialize.abtest.LiveAwesomeSplashPreloadJsonExperiment;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26217c;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26220e;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26231b;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26237e;
import com.p683ss.android.ugc.aweme.experiment.EnableFriendsEnhanceFollowBackExperiment;
import com.p683ss.android.ugc.aweme.experiment.EnablePrivacyReminderExperiment;
import com.p683ss.android.ugc.aweme.experiment.FanFollowingListRecommendExperiemnt;
import com.p683ss.android.ugc.aweme.experiment.InterestSelectExperiment;
import com.p683ss.android.ugc.aweme.experiment.ShowRemarkIconStyleExperiemnt;
import com.p683ss.android.ugc.aweme.experiment.TTWebViewOptExperiment;
import com.p683ss.android.ugc.aweme.experiment.TiktokDiscoveryPageExperiment;
import com.p683ss.android.ugc.aweme.facebookOpt.FacebookCloseInitializationExperiment;
import com.p683ss.android.ugc.aweme.feed.guide.C30281e;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.p1942e.C36618a;
import com.p683ss.android.ugc.aweme.net.experiment.LinkSelectorTypeExperiment;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.p2375u.C47404a;
import com.p683ss.android.ugc.aweme.plugin.PluginV2EnableExperiment;
import com.p683ss.android.ugc.aweme.push.downgrade.C40893b;
import com.p683ss.android.ugc.aweme.push.downgrade.C40896e;
import com.p683ss.android.ugc.aweme.push.experiment.PushOptimizeExperiment;
import com.p683ss.android.ugc.aweme.setting.C41556av.C41557a;
import com.p683ss.android.ugc.aweme.setting.api.AbTestApi;
import com.p683ss.android.ugc.aweme.setting.experiment.ClearRedPointCostExperiment;
import com.p683ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p683ss.android.ugc.aweme.setting.model.LocalAbTestModel;
import com.p683ss.android.ugc.aweme.setting.model.MigrateABTestModel;
import com.p683ss.android.ugc.aweme.setting.p2135d.C41593a;
import com.p683ss.android.ugc.aweme.setting.p2148ui.C41890s;
import com.p683ss.android.ugc.aweme.setting.safeview.C41681a;
import com.p683ss.android.ugc.aweme.setting.safeview.C41681a.C41682a;
import com.p683ss.android.ugc.aweme.setting.safeview.SafeViewEnableExperiment;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.VideoBitRateABManager;
import com.p683ss.android.ugc.aweme.video.local.C48063g;
import java.util.ConcurrentModificationException;
import java.util.Iterator;

/* renamed from: com.ss.android.ugc.aweme.setting.c */
public class C41589c implements C41523ad, C41557a {

    /* renamed from: b */
    private static final AbTestModel f105319b = new AbTestModel();

    /* renamed from: c */
    private static volatile C41589c f105320c;

    /* renamed from: a */
    public C9379e<C41522ac> f105321a = new C9379e<>();

    /* renamed from: d */
    private volatile AbTestModel f105322d;

    /* renamed from: e */
    private LocalAbTestModel f105323e;

    /* renamed from: f */
    public static boolean m91434f() {
        return false;
    }

    /* renamed from: n */
    private static Context m91441n() {
        return C11010c.m22280a();
    }

    /* renamed from: b */
    public final void mo85342b() {
        m91433c();
        C9741d.m19513b();
    }

    /* renamed from: h */
    public static int m91436h() {
        return MigrateABTestModel.getInstance().getHotLiveEnterNewStyle();
    }

    public C41589c() {
        C41556av.m91389a().mo85339a(3, (C41557a) this);
    }

    /* renamed from: a */
    public static C41589c m91432a() {
        if (f105320c == null) {
            synchronized (C41589c.class) {
                if (f105320c == null) {
                    f105320c = new C41589c();
                }
            }
        }
        return f105320c;
    }

    /* renamed from: c */
    public static void m91433c() {
        boolean z;
        if (TextUtils.isEmpty(C19034d.m46323c()) || TextUtils.equals(C19034d.m46323c(), "0")) {
            z = false;
        } else {
            z = true;
        }
        AbTestApi.m91373a(z);
    }

    /* renamed from: g */
    public static boolean m91435g() {
        return C10181b.m20511a().mo18172a(EnableFriendsEnhanceFollowBackExperiment.class, true, "friends_enhance_followback", 31744, false);
    }

    /* renamed from: i */
    public static int m91437i() {
        return C10181b.m20511a().mo18168a(ShowRemarkIconStyleExperiemnt.class, true, "show_remark_icon_style", 31744, 0);
    }

    /* renamed from: j */
    public static boolean m91438j() {
        if (C10181b.m20511a().mo18168a(FanFollowingListRecommendExperiemnt.class, true, "fan_following_list_recommend", 31744, 0) == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: k */
    public static boolean m91439k() {
        return C10181b.m20511a().mo18172a(EnablePrivacyReminderExperiment.class, true, "enable_privacy_reminder", 31744, false);
    }

    /* renamed from: l */
    public static int m91440l() {
        return C10181b.m20511a().mo18168a(TiktokDiscoveryPageExperiment.class, true, "tiktok_discovery_page", 31744, 0);
    }

    /* renamed from: o */
    private static boolean m91442o() {
        if (!C47404a.m102782a() || !C41592d.m91454b().mo49472b(m91441n(), "ENABLED", false)) {
            return false;
        }
        return true;
    }

    /* renamed from: e */
    public final LocalAbTestModel mo85371e() {
        if (this.f105323e == null) {
            return (LocalAbTestModel) C41890s.m91839b().mo49459a(m91441n(), "local_ab_test_model", LocalAbTestModel.class);
        }
        return this.f105323e;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:25:0x0076, code lost:
        if (android.os.Looper.myLooper() != android.os.Looper.getMainLooper()) goto L_0x0085;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0078, code lost:
        com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f().mo46921b("method_ab_init_duration", false);
     */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final com.p683ss.android.ugc.aweme.setting.model.AbTestModel mo85306m() {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r5.f105322d
            if (r0 != 0) goto L_0x0085
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            r2 = 0
            if (r0 != r1) goto L_0x0018
            com.ss.android.ugc.aweme.an.a r0 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r1 = "method_ab_init_duration"
            r0.mo46917a(r1, r2)
        L_0x0018:
            monitor-enter(r5)
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r5.f105322d     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x006d
            r0 = 0
            boolean r1 = m91442o()     // Catch:{ all -> 0x0082 }
            if (r1 == 0) goto L_0x0036
            com.ss.android.ugc.aweme.setting.d r0 = com.p683ss.android.ugc.aweme.setting.C41592d.m91454b()     // Catch:{ all -> 0x0082 }
            android.content.Context r1 = m91441n()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "ab_test_model"
            java.lang.Class<com.ss.android.ugc.aweme.setting.model.AbTestModel> r4 = com.p683ss.android.ugc.aweme.setting.model.AbTestModel.class
            java.lang.Object r0 = r0.mo49459a(r1, r3, r4)     // Catch:{ all -> 0x0082 }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = (com.p683ss.android.ugc.aweme.setting.model.AbTestModel) r0     // Catch:{ all -> 0x0082 }
        L_0x0036:
            if (r0 != 0) goto L_0x004a
            com.ss.android.ugc.aweme.setting.e r0 = com.p683ss.android.ugc.aweme.setting.C41594e.m91457b()     // Catch:{ all -> 0x0082 }
            android.content.Context r1 = m91441n()     // Catch:{ all -> 0x0082 }
            java.lang.String r3 = "ab_test_model"
            java.lang.Class<com.ss.android.ugc.aweme.setting.model.AbTestModel> r4 = com.p683ss.android.ugc.aweme.setting.model.AbTestModel.class
            java.lang.Object r0 = r0.mo49459a(r1, r3, r4)     // Catch:{ all -> 0x0082 }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = (com.p683ss.android.ugc.aweme.setting.model.AbTestModel) r0     // Catch:{ all -> 0x0082 }
        L_0x004a:
            r5.f105322d = r0     // Catch:{ all -> 0x0082 }
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r5.f105322d     // Catch:{ all -> 0x0082 }
            if (r0 != 0) goto L_0x0054
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = f105319b     // Catch:{ all -> 0x0082 }
            r5.f105322d = r0     // Catch:{ all -> 0x0082 }
        L_0x0054:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r5.f105322d     // Catch:{ all -> 0x0082 }
            android.os.Looper r0 = android.os.Looper.myLooper()     // Catch:{ all -> 0x0082 }
            android.os.Looper r1 = android.os.Looper.getMainLooper()     // Catch:{ all -> 0x0082 }
            if (r0 != r1) goto L_0x0069
            com.ss.android.ugc.aweme.an.a r0 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()     // Catch:{ all -> 0x0082 }
            java.lang.String r1 = "method_ab_init_duration"
            r0.mo46921b(r1, r2)     // Catch:{ all -> 0x0082 }
        L_0x0069:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r5.f105322d     // Catch:{ all -> 0x0082 }
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            return r0
        L_0x006d:
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            android.os.Looper r0 = android.os.Looper.myLooper()
            android.os.Looper r1 = android.os.Looper.getMainLooper()
            if (r0 != r1) goto L_0x0085
            com.ss.android.ugc.aweme.an.a r0 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            java.lang.String r1 = "method_ab_init_duration"
            r0.mo46921b(r1, r2)
            goto L_0x0085
        L_0x0082:
            r0 = move-exception
            monitor-exit(r5)     // Catch:{ all -> 0x0082 }
            throw r0
        L_0x0085:
            com.ss.android.ugc.aweme.setting.model.AbTestModel r0 = r5.f105322d
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.setting.C41589c.mo85306m():com.ss.android.ugc.aweme.setting.model.AbTestModel");
    }

    /* renamed from: a */
    public final void mo85305a(LocalAbTestModel localAbTestModel) {
        this.f105323e = localAbTestModel;
    }

    /* renamed from: a */
    public final void mo85304a(C41522ac acVar) {
        this.f105321a.mo17005a(acVar);
    }

    /* renamed from: a */
    public final C41589c mo85368a(AbTestModel abTestModel) {
        C41594e.m91457b().mo49470b((Context) AwemeApplication.m56199a(), "ab_test_model", (Object) abTestModel);
        if (!m91442o()) {
            this.f105322d = abTestModel;
        }
        C48063g.f120781b.mo95335a().storeBoolean("useSurfaceView", this.f105322d.useSurfaceView);
        if (abTestModel != null) {
            if (this.f105322d == f105319b) {
                synchronized (this) {
                    if (this.f105322d == f105319b) {
                        this.f105322d = abTestModel;
                    }
                }
            }
            C23859b.m58575b().mo49465a((Context) AwemeApplication.m56199a(), "last_ab_setting_version", abTestModel.settingsVersion);
        }
        return this;
    }

    /* renamed from: a */
    public final void mo85369a(boolean z, boolean z2) {
        C41556av.m91389a().mo85340a(3, z);
        if (z) {
            if (z2) {
                C30281e.f79118a = true;
            }
            VideoBitRateABManager c = VideoBitRateABManager.m103801c();
            if (!C23794bh.m58406t().mo83705b()) {
                c.mo85342b();
            }
            C47718bf.m103288a(new C36618a());
            C32458a.m75141a(4, InterestSelectExperiment.TAG, "ab value refresh success,start to notify");
            Keva.getRepoSync("ab_repo_cold_boot", 0).storeBoolean("clear_red_point_cost", C10181b.m20511a().mo18172a(ClearRedPointCostExperiment.class, true, "clear_red_point_cost", 31744, true));
            Keva.getRepoSync("ab_repo_cold_boot", 0).storeInt("ttwebview_opt", C10181b.m20511a().mo18168a(TTWebViewOptExperiment.class, true, "ttwebview_opt", 31744, 1));
            Keva.getRepoSync("ab_repo_cold_boot", 0).storeBoolean("is_close_facebook_init_coldBoot", C10181b.m20511a().mo18172a(FacebookCloseInitializationExperiment.class, true, "is_close_facebook_init_coldBoot", 31744, false));
            try {
                Iterator it = this.f105321a.iterator();
                while (it.hasNext()) {
                    C41522ac acVar = (C41522ac) it.next();
                    if (acVar != null) {
                        acVar.onChanged();
                    }
                }
            } catch (ConcurrentModificationException e) {
                C32458a.m75148a((Throwable) e);
            }
            C19073a.m46451a().initNotificationChannel();
            if (!C11016e.m22313h()) {
                if (C40896e.m90465a(C11010c.m22280a())) {
                    C40893b.m90462a();
                } else {
                    C19073a.m46451a().initPushAccountService(C20854a.m53167g().isLogin());
                }
            }
            String a = C41593a.m91456a(PushOptimizeExperiment.class, "enable_push_initialize_optimize");
            String a2 = C41593a.m91456a(LinkSelectorTypeExperiment.class, "link_selector_type");
            String a3 = C41593a.m91456a(PluginV2EnableExperiment.class, "enable_plugin_v2");
            Boolean valueOf = Boolean.valueOf(C10181b.m20511a().mo18172a(PushOptimizeExperiment.class, true, "enable_push_initialize_optimize", 31744, false));
            int a4 = C10181b.m20511a().mo18168a(LinkSelectorTypeExperiment.class, true, "link_selector_type", 31744, 1);
            Boolean valueOf2 = Boolean.valueOf(C10181b.m20511a().mo18172a(PluginV2EnableExperiment.class, true, "enable_plugin_v2", 31744, true));
            Keva repo = Keva.getRepo("ab_repo_cold_boot");
            repo.storeBoolean(a, valueOf.booleanValue());
            repo.storeInt(a2, a4);
            repo.storeBoolean(a3, valueOf2.booleanValue());
            C26217c.m63502a();
            boolean a5 = C10181b.m20511a().mo18172a(AwesomeSplashPreloadJsonExperiment.class, true, "awesome_splash_preload_json_enabled", 31744, false);
            if (C26217c.f69224b != null) {
                C26220e eVar = C26217c.f69224b;
                if (eVar.f69249a != null) {
                    eVar.f69249a.edit().putBoolean("awesome_splash_preload_json", a5).apply();
                }
            }
            C26237e.m63579b();
            boolean a6 = C10181b.m20511a().mo18172a(LiveAwesomeSplashPreloadJsonExperiment.class, true, "live_awesome_splash_preload_json_enabled", 31744, false);
            if (C26237e.f69273b != null) {
                C26231b bVar = C26237e.f69273b;
                if (bVar.f69264a != null) {
                    bVar.f69264a.storeBoolean("live_awesome_splash_preload_json", a6);
                }
            }
            C41681a aVar = C41681a.f105451a;
            boolean a7 = C10193n.m20607a().mo18204a(SafeViewEnableExperiment.class, "enable_safe_view_checker", C10181b.m20511a().mo18175c().getEnableSafeViewChecker(), false);
            Keva.getRepo("setting_repo_safe_view").storeBoolean("setting_key_safe_view", a7);
            C11089b.f29789a = a7;
            C11089b.f29790b = C41682a.f105452a;
        }
    }
}
