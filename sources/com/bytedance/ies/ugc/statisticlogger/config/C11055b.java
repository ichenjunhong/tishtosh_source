package com.bytedance.ies.ugc.statisticlogger.config;

import com.bytedance.common.utility.C9423k;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.statisticlogger.C11049a;
import com.bytedance.ies.ugc.statisticlogger.C11063e;
import com.p683ss.android.common.applog.AliYunUUIDHandler;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.common.applog.AppLog.ConfigUpdateListener;
import com.p683ss.android.common.applog.AppLog.ILogEncryptConfig;
import com.p683ss.android.deviceregister.C19034d;
import com.p683ss.android.deviceregister.C19034d.C19035a;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import p064c.p065a.C2201v;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p094l.C2178a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.ugc.statisticlogger.config.b */
public final class C11055b {

    /* renamed from: a */
    public static final C11055b f29686a = new C11055b();
    /* access modifiers changed from: private */

    /* renamed from: b */
    public static final C2178a<C11059c> f29687b;

    /* renamed from: c */
    private static final C11058c f29688c = new C11058c();

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.config.b$a */
    public static final class C11056a implements ILogEncryptConfig {

        /* renamed from: a */
        final /* synthetic */ C11060d f29689a;

        public final boolean getEncryptSwitch() {
            return true;
        }

        public final boolean getEventV3Switch() {
            return true;
        }

        public final boolean getRecoverySwitch() {
            return this.f29689a.mo20044b();
        }

        C11056a(C11060d dVar) {
            this.f29689a = dVar;
        }
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.config.b$b */
    static final class C11057b<T> implements C1710e<C11059c> {

        /* renamed from: a */
        public static final C11057b f29690a = new C11057b();

        C11057b() {
        }

        public final /* bridge */ /* synthetic */ void accept(Object obj) {
        }
    }

    /* renamed from: com.bytedance.ies.ugc.statisticlogger.config.b$c */
    public static final class C11058c implements ConfigUpdateListener {
        C11058c() {
        }

        public final void onConfigUpdate() {
            C11049a.f29675f.mo20019e();
            C11055b.f29687b.onNext(C11059c.Local);
        }

        public final void onRemoteConfigUpdate(boolean z) {
            C11049a.f29675f.mo20019e();
            C11055b.f29687b.onNext(C11059c.Remote);
        }
    }

    private C11055b() {
    }

    /* renamed from: a */
    public static C2201v<C11059c> m22383a() {
        return f29687b;
    }

    static {
        C2178a<C11059c> l = C2178a.m6527l();
        C52711k.m112236a((Object) l, "BehaviorSubject.create<ConfigUpdateEvent>()");
        f29687b = l;
    }

    /* renamed from: a */
    public static void m22384a(C11060d dVar) {
        C52711k.m112240b(dVar, "configuration");
        AppLog.setReportCrash(false);
        AppLog.addAppCount();
        AppLog.setIsNotRequestSender(true);
        AppLog.setReleaseBuild(C11010c.m22284e());
        C11054a.f29683a = true;
        AppLog.setAppContext(C11054a.f29684b);
        AppLog.setUseGoogleAdId(true);
        C9423k.m18638a(dVar.mo20043a().mo20045a());
        AppLog.setLogEncryptConfig(new C11056a(dVar));
        switch (C11010c.m22292m()) {
            case 1:
            case 4:
                AppLog.setHostI("log.tiktokv.com");
                AppLog.setHostLog("log.tiktokv.com");
                AppLog.setHostMon("api.tiktokv.com");
                break;
            case 2:
            case 5:
                AppLog.setHostI("log2.musical.ly");
                AppLog.setHostLog("log2.musical.ly");
                AppLog.setHostMon("api2.musical.ly");
                break;
        }
        AppLog.setConfigUpdateListener((ConfigUpdateListener) f29688c);
        m22383a().mo6545f((C1710e<? super T>) C11057b.f29690a);
        C11049a.f29675f.mo20019e();
        C19034d.m46317a((C19035a) C11049a.f29674e);
        AppLog.addSessionHook(C11063e.f29697d);
        AppLog.setAliYunHanlder(AliYunUUIDHandler.inst());
        C35857a.m81001b().mo74526a(new LazyLoadLegoTask(dVar.f29692a)).mo74526a(new SetAppTrackTask()).mo74527a();
    }
}
