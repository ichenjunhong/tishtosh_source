package com.p683ss.android.ugc.aweme.app.application;

import android.app.Application;
import android.os.Build.VERSION;
import android.text.TextUtils;
import com.bytedance.ies.ugc.aweme.ttsetting.FetchTTSettingTask;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.application.p1369b.C23019a;
import com.p683ss.android.ugc.aweme.app.launch.AppConfigInitTask;
import com.p683ss.android.ugc.aweme.device.DeviceInfoReportTask;
import com.p683ss.android.ugc.aweme.feed.preload.PreloadMediaCodecListTask;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.inflate.PreDrawableInflate;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.inflate.X2CActivityMain;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.inflate.X2CFragmentMain;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.inflate.X2CFragmentMainPage;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35866e;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35866e.C35867a;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35868f;
import com.p683ss.android.ugc.aweme.lego.C35883b;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoInflate;
import com.p683ss.android.ugc.aweme.lego.LegoService;
import com.p683ss.android.ugc.aweme.lego.inflate.SwipUpGuideInflate;
import com.p683ss.android.ugc.aweme.lego.p1914b.C35887c;
import com.p683ss.android.ugc.aweme.legoImp.inflate.DmtStatusViewInflate;
import com.p683ss.android.ugc.aweme.legoImp.inflate.SplashBgInflate;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CFragmentFeed;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.legoImp.service.AOTOptimizeService;
import com.p683ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p683ss.android.ugc.aweme.legoImp.task.AdjustMusicVolume;
import com.p683ss.android.ugc.aweme.legoImp.task.AlertDialogInitTask;
import com.p683ss.android.ugc.aweme.legoImp.task.AnalysisHprofTask;
import com.p683ss.android.ugc.aweme.legoImp.task.AnrTask;
import com.p683ss.android.ugc.aweme.legoImp.task.AppFlyerCustomerIdTask;
import com.p683ss.android.ugc.aweme.legoImp.task.AppLinkDataTask;
import com.p683ss.android.ugc.aweme.legoImp.task.AssistantTask;
import com.p683ss.android.ugc.aweme.legoImp.task.C35999r;
import com.p683ss.android.ugc.aweme.legoImp.task.CheckNoticeTask;
import com.p683ss.android.ugc.aweme.legoImp.task.CookieWatchTask;
import com.p683ss.android.ugc.aweme.legoImp.task.DataUsageTask;
import com.p683ss.android.ugc.aweme.legoImp.task.DelayedBaceSpeedMethodTestTask;
import com.p683ss.android.ugc.aweme.legoImp.task.EnterMusicGuideColdStartTask;
import com.p683ss.android.ugc.aweme.legoImp.task.FixFocusedViewLeak;
import com.p683ss.android.ugc.aweme.legoImp.task.GetGoogleAIdTask;
import com.p683ss.android.ugc.aweme.legoImp.task.HackActivityThreadH;
import com.p683ss.android.ugc.aweme.legoImp.task.InitAVModule;
import com.p683ss.android.ugc.aweme.legoImp.task.InitAppsFlyer;
import com.p683ss.android.ugc.aweme.legoImp.task.InitDebugBox;
import com.p683ss.android.ugc.aweme.legoImp.task.InitDownloader;
import com.p683ss.android.ugc.aweme.legoImp.task.InitFramework;
import com.p683ss.android.ugc.aweme.legoImp.task.InitI18nConfig;
import com.p683ss.android.ugc.aweme.legoImp.task.InitLinkSelector;
import com.p683ss.android.ugc.aweme.legoImp.task.InitMobShare;
import com.p683ss.android.ugc.aweme.legoImp.task.InitMusicManager;
import com.p683ss.android.ugc.aweme.legoImp.task.InitMusicServiceTask;
import com.p683ss.android.ugc.aweme.legoImp.task.InitReportSignature;
import com.p683ss.android.ugc.aweme.legoImp.task.InitTaskManager;
import com.p683ss.android.ugc.aweme.legoImp.task.JacocoTask;
import com.p683ss.android.ugc.aweme.legoImp.task.LeakReporterInjectTask;
import com.p683ss.android.ugc.aweme.legoImp.task.LegacyTask;
import com.p683ss.android.ugc.aweme.legoImp.task.LinkSelectorMonitorTask;
import com.p683ss.android.ugc.aweme.legoImp.task.LoginProxyTask;
import com.p683ss.android.ugc.aweme.legoImp.task.MemoryExperimentTask;
import com.p683ss.android.ugc.aweme.legoImp.task.MobMainAppEndTask;
import com.p683ss.android.ugc.aweme.legoImp.task.MobMainAppStartTask;
import com.p683ss.android.ugc.aweme.legoImp.task.ObserveDeviceRegister;
import com.p683ss.android.ugc.aweme.legoImp.task.PerformanceHelperTask;
import com.p683ss.android.ugc.aweme.legoImp.task.PlayerInitTask;
import com.p683ss.android.ugc.aweme.legoImp.task.PlayerKitInitTask;
import com.p683ss.android.ugc.aweme.legoImp.task.PreloadDmtSecSoTask;
import com.p683ss.android.ugc.aweme.legoImp.task.PreloadEmojiTask;
import com.p683ss.android.ugc.aweme.legoImp.task.PreloadI18nManagerTask;
import com.p683ss.android.ugc.aweme.legoImp.task.PreloadInstanceOnAttachTask;
import com.p683ss.android.ugc.aweme.legoImp.task.PreloadResCleanerTask;
import com.p683ss.android.ugc.aweme.legoImp.task.PreloadWireFieldNoEnumClassTask;
import com.p683ss.android.ugc.aweme.legoImp.task.RegisterScreenBroadcastReceiverTask;
import com.p683ss.android.ugc.aweme.legoImp.task.RegisterSessionReceiver;
import com.p683ss.android.ugc.aweme.legoImp.task.SetAppTrackTask;
import com.p683ss.android.ugc.aweme.legoImp.task.SetupDebugLevel;
import com.p683ss.android.ugc.aweme.legoImp.task.SetupMainServiceForJsb;
import com.p683ss.android.ugc.aweme.legoImp.task.SharePreferencePreloadTask;
import com.p683ss.android.ugc.aweme.legoImp.task.StoragePreCleanTask;
import com.p683ss.android.ugc.aweme.legoImp.task.StorageTask;
import com.p683ss.android.ugc.aweme.legoImp.task.UpdateLocale;
import com.p683ss.android.ugc.aweme.legoImp.task.UploadTeenStatusTask;
import com.p683ss.android.ugc.aweme.legoImp.task.VideoCachePreloaderInitTask;
import com.p683ss.android.ugc.aweme.legoImp.task.WebSocketTask;
import com.p683ss.android.ugc.aweme.legoImp.task.WorkManagerDelayInit;
import com.p683ss.android.ugc.aweme.legoImpl.task.LobbyInitTask;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p2377ug.referral.C47490d;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.app.application.c */
public final class C23020c implements C23019a {
    /* renamed from: a */
    public final void mo47757a(Application application) {
        C35857a.m81001b().mo74526a(new PreloadInstanceOnAttachTask()).mo74526a(new PreloadI18nManagerTask()).mo74526a(new PreloadDmtSecSoTask()).mo74526a(new PreloadWireFieldNoEnumClassTask()).mo74526a(new SharePreferencePreloadTask()).mo74527a();
    }

    /* renamed from: b */
    public final void mo47758b(Application application) {
        boolean z;
        C35898h[] values;
        C35857a.f92065j.mo74511a(X2CActivityMain.class, (LegoInflate) new X2CActivityMain()).mo74511a(X2CFragmentMainPage.class, (LegoInflate) new X2CFragmentMainPage()).mo74511a(X2CFragmentMain.class, (LegoInflate) new X2CFragmentMain()).mo74511a(X2CFragmentFeed.class, (LegoInflate) new X2CFragmentFeed()).mo74511a(X2CItemFeed.class, (LegoInflate) new X2CItemFeed()).mo74512a(MainLooperOptService.class, (LegoService) new MainLooperOptService()).mo74512a(AOTOptimizeService.class, (LegoService) new AOTOptimizeService()).mo74511a(SplashBgInflate.class, (LegoInflate) new SplashBgInflate()).mo74511a(PreDrawableInflate.class, (LegoInflate) new PreDrawableInflate()).mo74511a(SwipUpGuideInflate.class, (LegoInflate) new SwipUpGuideInflate()).mo74511a(DmtStatusViewInflate.class, (LegoInflate) new DmtStatusViewInflate());
        C35866e a = new C35866e().mo74524a(AOTOptimizeService.class).mo74524a(MainLooperOptService.class);
        if (!a.f92074a.isEmpty()) {
            for (C35898h hVar : C35898h.values()) {
                C35887c a2 = C35857a.f92059d;
                Object obj = a.f92074a.get(hVar);
                if (obj == null) {
                    C52711k.m112234a();
                }
                a2.mo74556a(hVar, (List) obj);
            }
            for (Class a3 : C35857a.f92059d.mo74561c(C35898h.MAIN)) {
                C35857a.f92059d.mo74554a(a3);
            }
            for (Class aVar : C35857a.f92059d.mo74561c(C35898h.BACKGROUND)) {
                C35883b.m81028a().execute(new C35867a(aVar));
            }
            if (C35857a.f92059d.mo74558a(C35898h.SPARSE) && !C35857a.m81000b(C35857a.f92065j).hasMessages(1202)) {
                C35857a.m81000b(C35857a.f92065j).mo74516a(1202);
            }
            if (C35857a.f92059d.mo74558a(C35898h.IDLE)) {
                C35857a.m81000b(C35857a.f92065j).mo74516a(1200);
            }
            a.f92074a.clear();
        }
        C35857a.m81003c().mo74513a(SplashBgInflate.class).mo74513a(PreDrawableInflate.class).mo74513a(DmtStatusViewInflate.class).mo74514a();
        C35883b.m81030b().post(new Runnable() {
            public final void run() {
                boolean z;
                if (C35837h.m80977b() || C20854a.m53167g().isLogin() || C47490d.f119778a) {
                    z = false;
                } else {
                    z = true;
                }
                if (z) {
                    C11010c.m22280a().getSystemService("clipboard");
                }
            }
        });
        C35857a.m81001b().mo74526a(new LegacyTask()).mo74526a(new MobMainAppStartTask()).mo74526a(new PlayerKitInitTask()).mo74526a(new InitI18nConfig()).mo74526a(C23794bh.m58412z().mo47739w()).mo74526a(new UpdateLocale()).mo74526a(new InitLinkSelector()).mo74526a(new InitFramework()).mo74526a(new StoragePreCleanTask()).mo74526a(new AdjustMusicVolume()).mo74526a(new InitAVModule()).mo74526a(new InitReportSignature()).mo74526a(new InitTaskManager()).mo74526a(new LoginProxyTask()).mo74526a(new RegisterSessionReceiver()).mo74526a(new InitDownloader()).mo74526a(new InitMusicManager()).mo74526a(new FixFocusedViewLeak()).mo74526a(new InitAppsFlyer()).mo74526a(C23794bh.m58412z().mo47737u()).mo74526a(new ObserveDeviceRegister()).mo74526a(new InitMobShare()).mo74526a(new MobMainAppEndTask()).mo74526a(new SetupMainServiceForJsb()).mo74526a(new InitDebugBox()).mo74526a(C23794bh.m58412z().mo47738v()).mo74526a(new LobbyInitTask()).mo74526a(new AlertDialogInitTask()).mo74527a();
        C35868f a4 = C35857a.m81001b().mo74526a(new RegisterScreenBroadcastReceiverTask()).mo74526a(new GetGoogleAIdTask()).mo74526a(new AnrTask()).mo74526a(new PlayerInitTask()).mo74526a(C23794bh.m58412z().mo47721f()).mo74526a(new VideoCachePreloaderInitTask()).mo74526a(new AssistantTask()).mo74526a(new PreloadMediaCodecListTask()).mo74526a(new PreloadEmojiTask());
        if (TextUtils.equals(C11010c.m22295p(), "lark_inhouse") || TextUtils.equals(C11010c.m22295p(), "local_test")) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            a4.mo74526a(new CookieWatchTask());
        }
        a4.mo74527a();
        C35868f a5 = C35857a.m81001b().mo74526a(new AppConfigInitTask()).mo74526a(new HackActivityThreadH()).mo74526a(new SetupDebugLevel()).mo74526a(new SetAppTrackTask()).mo74526a(new AppFlyerCustomerIdTask()).mo74526a(AVExternalServiceImpl.getAVServiceImpl_Monster().initService().initTask(1)).mo74526a(C23794bh.m58412z().mo47719e()).mo74526a(new WebSocketTask()).mo74526a(new PerformanceHelperTask()).mo74526a(new AppLinkDataTask()).mo74526a(new LinkSelectorMonitorTask()).mo74526a(new DeviceInfoReportTask()).mo74526a(new DataUsageTask()).mo74526a(new StorageTask()).mo74526a(C23794bh.m58412z().mo47734r()).mo74526a(C23794bh.m58412z().mo47741y()).mo74526a(new JacocoTask()).mo74526a(new WorkManagerDelayInit()).mo74526a(C23794bh.m58412z().mo47731o());
        if (TextUtils.equals(C11010c.m22295p(), "local_test")) {
            a5.mo74526a(new LeakReporterInjectTask());
        } else {
            a5.mo74526a(new AnalysisHprofTask());
        }
        a5.mo74526a(new MemoryExperimentTask());
        if (VERSION.SDK_INT < 28) {
            a5.mo74526a(new PreloadResCleanerTask());
        }
        a5.mo74527a();
        C35857a.m81001b().mo74526a(new CheckNoticeTask()).mo74526a(new DelayedBaceSpeedMethodTestTask()).mo74526a(new EnterMusicGuideColdStartTask()).mo74526a(new UploadTeenStatusTask()).mo74526a(new InitMusicServiceTask()).mo74526a(new FetchTTSettingTask(C18845b.f52040e)).mo74527a();
        C22574a.m55738f().mo46917a("method_fresco_ensure_duration", false);
        C35857a.m80999a(C35999r.m81183c());
        C22574a.m55738f().mo46917a("method_business_tools_ensure_duration", false);
        C35857a.m80999a(C35999r.m81181a(application));
        C22574a.m55738f().mo46921b("method_fresco_ensure_duration", false);
        C22574a.m55738f().mo46917a("method_absdk_ensure_duration", false);
        C35857a.m80999a(C35999r.m81184d());
        C22574a.m55738f().mo46921b("method_absdk_ensure_duration", false);
        C35857a.m80999a(C35999r.m81180a());
    }
}
