package com.p683ss.android.ugc.aweme.app;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import com.bytedance.business.base.BusinessToolsConfig;
import com.bytedance.business.p512a.C9281a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.uikit.base.C11081c;
import com.bytedance.jirafast.p749b.C11999c;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.ugc.aweme.app.application.C23018b;
import com.p683ss.android.ugc.aweme.app.p1363a.C22883a;
import com.p683ss.android.ugc.aweme.base.activity.CustomErrorActivity;
import com.p683ss.android.ugc.aweme.commercialize.abtest.EggPendentComponentSwitch;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25823j;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.p683ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.p683ss.android.ugc.aweme.commercialize.p1550c.C25656a;
import com.p683ss.android.ugc.aweme.commercialize.p1550c.C25657b;
import com.p683ss.android.ugc.aweme.commercialize.p1550c.C25660e;
import com.p683ss.android.ugc.aweme.commercialize.p1550c.C25661f;
import com.p683ss.android.ugc.aweme.commercialize.p1550c.C25662g;
import com.p683ss.android.ugc.aweme.commercialize.p1550c.C25665h;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService;
import com.p683ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p683ss.android.ugc.aweme.framework.services.ServiceManager;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.legoImp.task.AwesomeSplashPreloadJsonTask;
import com.p683ss.android.ugc.aweme.legoImp.task.FetchCombineSettingsTask;
import com.p683ss.android.ugc.aweme.legoImp.task.GeckoTask;
import com.p683ss.android.ugc.aweme.legoImp.task.InitLiveServiceTask;
import com.p683ss.android.ugc.aweme.legoImp.task.InitRouter;
import com.p683ss.android.ugc.aweme.legoImp.task.LiveAwesomeSplashPreloadJsonTask;
import com.p683ss.android.ugc.aweme.legoImp.task.PreloadInstanceTask;
import com.p683ss.android.ugc.aweme.legoImp.task.SettingsReaderInitTask;
import com.p683ss.android.ugc.aweme.legoImp.task.SplashAdManagerPreloadTask;
import com.p683ss.android.ugc.aweme.miniapp.impl.C36873b;
import com.p683ss.android.ugc.aweme.miniapp.impl.C36899j;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.p1309a.C22317a;
import com.p683ss.android.ugc.aweme.p1308ad.services.IAdService;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.requesttask.idle.GeckoCheckInRequest;
import com.p683ss.android.ugc.aweme.requesttask.idle.GeckoHighPriorityCheckInRequest;
import com.p683ss.android.ugc.aweme.update.UpdateHelper;
import com.p683ss.android.ugc.aweme.util.C47621e;
import com.p683ss.android.ugc.aweme.util.C47622f;
import com.p683ss.android.ugc.aweme.util.C47626j;
import com.taobao.android.dexposed.ClassUtils;

/* renamed from: com.ss.android.ugc.aweme.app.s */
public abstract class C23139s implements C22956ao {
    /* renamed from: a */
    public final Class<? extends Activity> mo47710a() {
        return CustomErrorActivity.class;
    }

    /* renamed from: b */
    public final void mo47714b(Application application) {
    }

    /* renamed from: m */
    public final void mo47729m() {
        C23137q.m56698a();
    }

    /* renamed from: c */
    public final LegoTask mo47715c() {
        return new GeckoHighPriorityCheckInRequest();
    }

    /* renamed from: d */
    public final LegoTask mo47717d() {
        return new GeckoCheckInRequest();
    }

    /* renamed from: e */
    public final LegoTask mo47719e() {
        return new FetchCombineSettingsTask();
    }

    /* renamed from: f */
    public final LegoTask mo47721f() {
        return new GeckoTask();
    }

    /* renamed from: h */
    public final LegoTask mo47724h() {
        return new SplashAdManagerPreloadTask();
    }

    /* renamed from: i */
    public final LegoTask mo47725i() {
        return new AwesomeSplashPreloadJsonTask();
    }

    /* renamed from: j */
    public final LegoTask mo47726j() {
        return new LiveAwesomeSplashPreloadJsonTask();
    }

    /* renamed from: k */
    public final LegoTask mo47727k() {
        return new SettingsReaderInitTask();
    }

    /* renamed from: l */
    public final LegoTask mo47728l() {
        return new PreloadInstanceTask();
    }

    /* renamed from: n */
    public final LegoTask mo47730n() {
        return new InitRouter();
    }

    /* renamed from: o */
    public final LegoTask mo47731o() {
        return new InitLiveServiceTask();
    }

    /* renamed from: p */
    public final Object mo47732p() {
        return new C36873b();
    }

    /* renamed from: q */
    public final Object mo47733q() {
        return new C36899j();
    }

    /* renamed from: b */
    public final void mo47713b() {
        if (UpdateHelper.f119820c == null) {
            try {
                UpdateHelper.f119820c = new UpdateHelper();
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: g */
    public final void mo47723g() {
        C11081c.f29785a = AwemeAppData.m47851a();
        C11081c.f29786b = AwemeAppData.m47851a();
    }

    /* renamed from: c */
    public final void mo47716c(Application application) {
        C47626j.m103107a(application);
    }

    /* renamed from: e */
    public final void mo47720e(Application application) {
        C22883a.m56347a(application);
    }

    /* renamed from: a */
    public final void mo47712a(Context context) {
        C35857a.m81001b().mo74526a(new BaseInitAllService$2(this)).mo74527a();
    }

    /* renamed from: f */
    public final void mo47722f(Application application) {
        ServiceManager.get().bind(IIMService.class, new C23181t(application)).asSingleton();
    }

    /* renamed from: a */
    public final void mo47711a(Application application) {
        IAdService createIAdServicebyMonsterPlugin = AdServiceImpl.createIAdServicebyMonsterPlugin();
        if (createIAdServicebyMonsterPlugin != null) {
            createIAdServicebyMonsterPlugin.init(application);
            C22317a.m55223a().f60114a = new C25660e();
            C22317a.m55223a().f60115b = new C25656a();
            C22317a.m55223a().f60116c = new C25657b();
            C22317a.m55223a().f60117d = new C25665h();
        }
        if (C10193n.m20607a().mo18204a(EggPendentComponentSwitch.class, "enable_egg_and_pendent_componentize", C10181b.m20511a().mo18175c().getEnableEggAndPendentComponentize(), false)) {
            C25823j.f68267a = true;
            ICommercializeAdService createICommercializeAdServicebyMonsterPlugin = CommercializeAdServiceImpl.createICommercializeAdServicebyMonsterPlugin();
            if (createICommercializeAdServicebyMonsterPlugin != null) {
                createICommercializeAdServicebyMonsterPlugin.init(application, new C25662g());
            }
            ICommerceEggService createICommerceEggServicebyMonsterPlugin = CommerceEggServiceImpl.createICommerceEggServicebyMonsterPlugin();
            if (createICommerceEggServicebyMonsterPlugin != null) {
                createICommerceEggServicebyMonsterPlugin.init(new C25661f());
            }
        }
    }

    /* renamed from: d */
    public final void mo47718d(Application application) {
        if (C47621e.m103100c() && C18920g.m46048a(application) && C47621e.m103099b()) {
            C9281a aVar = new C9281a();
            StringBuilder sb = new StringBuilder("\nDeviceId:");
            sb.append(AppLog.getServerDeviceId());
            sb.append("\nVersion Name:16.0.41");
            sb.append("\nVersion Code:160041");
            C11999c cVar = new C11999c("https://jira.bytedance.com/rest/api/2", "AME", "feedback2", "feedback2", C23018b.f61359a, "tiktok", "16.0.41".substring(0, "16.0.41".lastIndexOf(ClassUtils.PACKAGE_SEPARATOR)), "[Android][T]", sb.toString(), C11010c.m22295p(), true, "http://api21-h2.tiktokv.com/aweme/v1/");
            aVar.f25382a = cVar;
            BusinessToolsConfig instance = BusinessToolsConfig.getInstance("16.0.41", 160041, C23018b.f61359a, false);
            instance.setBugReportConfig(aVar);
            C47621e.m103098a().initialize(application, instance);
            C47621e.m103098a().setOnGetMoreJIRAParamsListener(C47621e.f120088b);
            C47621e.m103098a().setGoToFeedbackPageListener(C47621e.f120089c);
            C11016e.m22309d().mo6545f(C47622f.f120090a);
        }
    }
}
