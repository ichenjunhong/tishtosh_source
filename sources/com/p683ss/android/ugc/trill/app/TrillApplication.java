package com.p683ss.android.ugc.trill.app;

import android.app.Application;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.os.AsyncTask;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.SystemClock;
import android.text.TextUtils;
import android.webkit.RenderProcessGoneDetail;
import android.webkit.WebView;
import com.bytedance.apm.C8908a;
import com.bytedance.apm.C8908a.C8910a;
import com.bytedance.apm.internal.ApmDelegate;
import com.bytedance.apm.p478d.C8998a;
import com.bytedance.apm.p478d.C8998a.C9000a;
import com.bytedance.apm.p478d.C9001b;
import com.bytedance.apm.p478d.C9001b.C9003a;
import com.bytedance.apm.p489l.p490a.C9093b;
import com.bytedance.apm.p498p.C9176d;
import com.bytedance.boost_multidex.BoostMultiDex;
import com.bytedance.boost_multidex.Monitor;
import com.bytedance.common.utility.C9431p;
import com.bytedance.ies.ugc.p694a.C11006a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11010c.C11013c;
import com.bytedance.ies.ugc.p694a.C11014d;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.ies.ugc.p694a.C11016e.C11020d;
import com.bytedance.ies.ugc.p694a.C11022g;
import com.bytedance.p723j.C11511a;
import com.example.p906a.C13480a;
import com.example.p906a.C13482c;
import com.p683ss.android.common.config.AppConfig;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.legoimpl.NewUserTask;
import com.p683ss.android.p1140c.C18844a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.C22924ad;
import com.p683ss.android.ugc.aweme.app.C23036aw;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.application.p1369b.C23019a;
import com.p683ss.android.ugc.aweme.app.launch.C23113a.C23114a;
import com.p683ss.android.ugc.aweme.app.launch.C23113a.C23115b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1380j.C23110b;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27548d;
import com.p683ss.android.ugc.aweme.dynamicfeature.DynamicFeatureInitTask;
import com.p683ss.android.ugc.aweme.feed.C29978a;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.keva.C35804a;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35861c;
import com.p683ss.android.ugc.aweme.lego.C35857a.C35879o;
import com.p683ss.android.ugc.aweme.lego.C35895e;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.p1914b.C35884a;
import com.p683ss.android.ugc.aweme.lego.p1914b.C35884a.C35885a;
import com.p683ss.android.ugc.aweme.lego.p1914b.C35888d;
import com.p683ss.android.ugc.aweme.lego.p1915c.C35890a;
import com.p683ss.android.ugc.aweme.legoImp.task.ABTask;
import com.p683ss.android.ugc.aweme.legoImp.task.AppFlyerLoadPropertiesTask;
import com.p683ss.android.ugc.aweme.legoImp.task.C35999r;
import com.p683ss.android.ugc.aweme.legoImp.task.CrashSdkInitTask;
import com.p683ss.android.ugc.aweme.legoImp.task.DvmLinearAllocOptTask;
import com.p683ss.android.ugc.aweme.legoImp.task.FontTask;
import com.p683ss.android.ugc.aweme.legoImp.task.InitStorageManagerTask;
import com.p683ss.android.ugc.aweme.legoImp.task.InitTTNetTask;
import com.p683ss.android.ugc.aweme.legoImp.task.InitWebOfflineHostTask;
import com.p683ss.android.ugc.aweme.legoImp.task.NpthTask;
import com.p683ss.android.ugc.aweme.legoImp.task.ResetTTNetworkStateIndexTask;
import com.p683ss.android.ugc.aweme.legoImp.task.SamangCrashHandleTask;
import com.p683ss.android.ugc.aweme.legoImp.task.TrimMemoryTask;
import com.p683ss.android.ugc.aweme.legoImp.task.UpdateSafeModeSettingsTask;
import com.p683ss.android.ugc.aweme.miniapp.utils.MiniAppInitTask;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.miniapp_api.services.IMiniAppService;
import com.p683ss.android.ugc.aweme.net.p1989b.C37748a;
import com.p683ss.android.ugc.aweme.net.p1991d.C37767h;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1468bu.C24081j;
import com.p683ss.android.ugc.aweme.p1468bu.p1469a.C24058a;
import com.p683ss.android.ugc.aweme.push.downgrade.NotifyPushStatusTask;
import com.p683ss.android.ugc.aweme.setting.TiktokSkinHelper;
import com.p683ss.android.ugc.aweme.utils.C47895fp;
import com.p683ss.android.ugc.trill.p2521f.C50322a;
import com.p683ss.android.ugc.trill.p2522g.C50326a;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import java.util.concurrent.ThreadPoolExecutor;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.trill.app.TrillApplication */
public abstract class TrillApplication extends AwemeApplication {

    /* renamed from: e */
    private long f126188e = -1;

    /* renamed from: f */
    private boolean f126189f;

    /* renamed from: g */
    C23019a f126190g;

    /* access modifiers changed from: protected */
    public void attachBaseContextAfterMultiDex() {
        C50309b.attachBaseContextAfterMultiDex(this);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public abstract void mo47845d();

    public Resources getResources() {
        Resources resources = super.getResources();
        TiktokSkinHelper.m91332a(resources);
        return resources;
    }

    /* renamed from: f */
    public final boolean mo98216f() {
        if (this.f126188e == -1) {
            this.f126188e = C23036aw.m56553a((Context) this);
        }
        if (this.f126188e == Thread.currentThread().getId()) {
            return true;
        }
        return false;
    }

    public TrillApplication() {
        String str = "disabled";
        C52711k.m112240b(str, "rheaMode");
        C23110b.f61533a = str;
        String str2 = "api.tiktokv.com";
        String str3 = "ichannel.musical.ly";
        String str4 = "api.tiktokv.com";
        try {
            C52711k.m112240b(str2, "hostI");
            C52711k.m112240b(str3, "hostChannel");
            C52711k.m112240b(str4, "hostDomestic");
            C11006a aVar = C11010c.f29563l;
            aVar.f29547a = str2;
            aVar.f29549c = str3;
            aVar.f29548b = str4;
            String str5 = C11010c.m22282b().f29547a;
            String str6 = C11010c.m22282b().f29548b;
            String str7 = C11010c.m22282b().f29549c;
            C18844a.f52026a = str5;
            C18844a.f52027b = str5;
            C18844a.f52028c = C18844a.f52026a;
            C18844a.f52029d = C18844a.f52026a;
            C18844a.f52030e = C18844a.f52026a;
            C18844a.f52031f = C18844a.f52026a;
            C18844a.f52032g = C18844a.f52026a;
            C18844a.f52033h = str7;
            C18844a.f52034i = str6;
            C18844a.f52035j = "trill";
            AppConfig.setDomainConfigUrl("/ies/network/aweme/");
            C37748a.f96188a = C37748a.f96189b;
            AppConfig.setConfigServers(C37748a.f96188a);
            NetworkUtils.setShareCookieHost(".tiktokv.com");
        } catch (Throwable unused) {
        }
    }

    public void onCreate() {
        Class cls;
        Object obj;
        if (!this.f126189f) {
            if (this.f61140c) {
                C22574a.m55738f().mo46921b("cold_boot_application_attach_to_create", true);
                C22574a.m55738f().mo46917a("cold_boot_application_create_duration", true);
            } else {
                C35857a.m81001b().mo74526a(new NotifyPushStatusTask()).mo74527a();
            }
            C35857a.m81001b().mo74526a(new SamangCrashHandleTask()).mo74527a();
            new ABTask().run(this);
            C22574a.m55738f().mo46917a("method_init_ttnet_duration", false);
            C35857a.m81001b().mo74526a(new ResetTTNetworkStateIndexTask()).mo74526a(new InitTTNetTask()).mo74527a();
            C22574a.m55738f().mo46921b("method_init_ttnet_duration", false);
            if (this.f61140c) {
                C35857a.m81001b().mo74526a(new InitStorageManagerTask()).mo74526a(C35999r.m81183c()).mo74526a(C35999r.m81181a(m56199a())).mo74526a(C23794bh.m58412z().mo47730n()).mo74526a(new FontTask()).mo74527a();
            }
            C23794bh.m58412z().mo47720e(this);
            C35857a.m81001b().mo74526a(new NpthTask()).mo74526a(new CrashSdkInitTask()).mo74526a(new UpdateSafeModeSettingsTask()).mo74526a(C23794bh.m58412z().mo47727k()).mo74526a(new DvmLinearAllocOptTask()).mo74526a(new InitWebOfflineHostTask()).mo74527a();
            if (this.f61140c) {
                C35857a.m81001b().mo74526a(new AppFlyerLoadPropertiesTask()).mo74526a(C35999r.m81185e()).mo74526a(C23794bh.m58412z().mo47724h()).mo74526a(C23794bh.m58412z().mo47725i()).mo74526a(C23794bh.m58412z().mo47726j()).mo74526a(C35999r.m81180a()).mo74526a(C23794bh.m58412z().mo47742z()).mo74526a(C23794bh.m58412z().mo47728l()).mo74526a(new NewUserTask()).mo74527a();
            }
            C22574a.m55738f().mo46917a("method_thread_pool_inject_duration", false);
            C24081j.m58919a(false);
            C22574a.m55738f().mo46921b("method_thread_pool_inject_duration", false);
            if (VERSION.SDK_INT >= 28) {
                C32458a.m75150b("WatchDogKiller", "stopWatchDog, do not support after Android P, just return");
            } else if (C47895fp.f120489a) {
                C32458a.m75150b("WatchDogKiller", "stopWatchDog, already stopped, just return");
            } else {
                C47895fp.f120489a = true;
                C32458a.m75150b("WatchDogKiller", "stopWatchDog, try to stop watchdog");
                try {
                    cls = Class.forName("java.lang.Daemons$FinalizerWatchdogDaemon");
                    Field declaredField = cls.getDeclaredField("INSTANCE");
                    declaredField.setAccessible(true);
                    obj = declaredField.get(null);
                    Field declaredField2 = cls.getSuperclass().getDeclaredField("thread");
                    declaredField2.setAccessible(true);
                    declaredField2.set(obj, null);
                } catch (Throwable th) {
                    String str = "WatchDogKiller";
                    StringBuilder sb = new StringBuilder("stopWatchDog, stop occur error:");
                    sb.append(th);
                    C32458a.m75150b(str, sb.toString());
                    C32458a.m75148a(th);
                }
            }
            C23131p.m57778a("aweme_app_performance", "multidex_time", (float) this.f61141d);
            C37767h.f96229a = new Callable<Boolean>() {
                public final /* synthetic */ Object call() throws Exception {
                    return Boolean.valueOf(C50322a.m108601a(C11010c.m22280a()));
                }
            };
            super.onCreate();
            this.f126190g.mo47758b(this);
            C9176d a = new C9176d().mo16549a(true).mo16548a(50000);
            a.f25138d = false;
            a.f25137c = 700;
            C22574a.m55738f().mo46917a("method_init_apm_duration", false);
            C9176d a2 = new C9176d().mo16549a(true).mo16548a(50000);
            C9003a a3 = C9001b.m17803a();
            C9000a aVar = new C9000a();
            aVar.f24485a = false;
            aVar.f24487c = true;
            aVar.f24486b = 60000;
            aVar.f24488d = true;
            aVar.f24489e = new C9093b() {
            };
            a3.f24514m = new C8998a(aVar);
            C8908a aVar2 = C8910a.f24278a;
            ApmDelegate a4 = ApmDelegate.m17947a();
            if (a2 != null) {
                a4.f24742b = a2;
            }
            ApmDelegate.m17947a().mo16428a((Context) this, a3.mo16329a());
            C22574a.m55738f().mo46921b("method_init_apm_duration", false);
            if (this.f61140c) {
                C35857a.m81001b().mo74526a(new DynamicFeatureInitTask()).mo74527a();
            }
            String b = C18920g.m46051b(getApplicationContext());
            if (this.f61140c || (b != null && b.contains("miniapp"))) {
                C35857a.m81001b().mo74526a(new MiniAppInitTask(this.f61140c, this)).mo74527a();
                C22574a.m55738f().mo46917a("method_mini_app_duration", false);
                MiniAppInitTask.injectInitParamsInAdvance(this);
                if (!C18920g.m46048a(this)) {
                    IMiniAppService a5 = C36983a.m83185b().mo76294a();
                    if (a5 != null) {
                        a5.initMiniApp();
                    }
                }
                C22574a.m55738f().mo46921b("method_mini_app_duration", false);
            }
            if (this.f61140c) {
                C22574a.m55738f().mo46921b("cold_boot_application_create_duration", true);
                C22574a.m55738f().mo46917a("cold_boot_application_to_main", true);
                C22574a.m55738f().f60708i = System.currentTimeMillis();
            }
            if (this.f61140c) {
                C23794bh.m58412z().mo47711a((Application) this);
            }
            C23794bh.m58412z().mo47714b(this);
            C13482c.f35160a = new C13480a() {
                /* renamed from: a */
                public final boolean mo25266a(WebView webView, RenderProcessGoneDetail renderProcessGoneDetail) {
                    String str;
                    C23088c a = C23088c.m56631a();
                    String str2 = "exit_type";
                    if (renderProcessGoneDetail.didCrash()) {
                        str = "crash";
                    } else {
                        str = "system kill";
                    }
                    a.mo47824a(str2, str);
                    a.mo47822a("renderer_priority", Integer.valueOf(renderProcessGoneDetail.rendererPriorityAtExit()));
                    a.mo47824a("WebView", webView.getClass().getCanonicalName());
                    boolean didCrash = renderProcessGoneDetail.didCrash();
                    C23569o.m57776a("aweme_webview_render_exception", didCrash ? 1 : 0, a.mo47825b());
                    return true;
                }
            };
            C24058a aVar3 = C24058a.f63856d;
            String str2 = "app_create_end";
            C52711k.m112240b(str2, "scene");
            C24058a.m58880a(str2);
        }
    }

    public void onConfigurationChanged(Configuration configuration) {
        if (!this.f126189f) {
            super.onConfigurationChanged(configuration);
            C23794bh.m58412z().mo47740x();
        }
    }

    public void onTrimMemory(int i) {
        if (!this.f126189f) {
            super.onTrimMemory(i);
            if (mo98216f()) {
                C35857a.m81001b().mo74526a(new TrimMemoryTask(i)).mo74527a();
            }
        }
    }

    public void attachBaseContext(Context context) {
        C35896f fVar;
        C35898h[] values;
        boolean z;
        boolean z2;
        super.attachBaseContext(context);
        this.f61140c = C18920g.m46048a(this);
        boolean z3 = this.f61140c;
        if (VERSION.SDK_INT >= 28) {
            if (z3) {
                C50326a.m108609b(this);
            } else {
                C50326a.m108606a((Context) this);
            }
        }
        C52711k.m112240b(this, "app");
        C35857a aVar = C35857a.f92065j;
        C35895e aVar2 = new C23114a();
        C52711k.m112240b(this, "context");
        Context context2 = this;
        C35857a.f92061f = context2;
        C35857a.f92064i = aVar2;
        if (C35890a.m81058a(context2)) {
            fVar = C35896f.MAIN;
        } else {
            fVar = C35896f.SUB;
        }
        C35857a.f92056a = fVar;
        C35861c cVar = new C35861c();
        C35857a.f92062g = cVar;
        cVar.mo74517a(1205, 15000);
        C35888d dVar = C35857a.f92057b;
        C52711k.m112240b(context2, "context");
        dVar.f92108a = context2;
        boolean z4 = false;
        for (C35898h hVar : C35898h.values()) {
            dVar.f92109b.put(hVar, new ArrayList());
            dVar.f92110c.put(hVar, new ArrayList());
        }
        C35857a.f92058c.mo74550a(context2);
        C35857a.f92059d.mo74555a(context2);
        C35884a aVar3 = C35857a.f92060e;
        C52711k.m112240b(context2, "context");
        aVar3.f92097a = context2;
        ((Application) context2).registerActivityLifecycleCallbacks(new C35885a());
        Looper.myQueue().addIdleHandler(C35879o.f92087a);
        C52671b bVar = C23115b.INSTANCE;
        C52711k.m112240b(this, "context");
        C52711k.m112240b(bVar, "init");
        C11014d dVar2 = new C11014d(this, bVar);
        C11010c cVar2 = C11010c.f29572u;
        C52711k.m112240b(dVar2, "builder");
        C11010c.f29554c = dVar2.mo19903a();
        C11010c.f29553b = dVar2.f29583b;
        C11010c.f29556e = dVar2.f29586e;
        C11010c.f29555d = dVar2.f29585d;
        String str = dVar2.f29587f;
        if (str == null) {
            C52711k.m112237a("appName");
        }
        C11010c.f29557f = str;
        String str2 = dVar2.f29589h;
        if (str2 == null) {
            C52711k.m112237a("flavor");
        }
        C11010c.f29559h = str2;
        long j = dVar2.f29590i;
        String str3 = dVar2.f29588g;
        if (str3 == null) {
            C52711k.m112237a("versionName");
        }
        C11010c.f29558g = new C11013c(j, str3);
        String str4 = dVar2.f29591j;
        if (str4 == null) {
            C52711k.m112237a("feedbackAppKey");
        }
        C11010c.f29561j = str4;
        C11010c.f29564m = dVar2.f29593l;
        C11010c.f29565n = dVar2.f29592k;
        C11013c cVar3 = C11010c.f29558g;
        if (cVar3 == null) {
            C52711k.m112237a("versionInfo");
        }
        if (TextUtils.isEmpty(cVar3.f29580b) || cVar3.f29579a == 0 || cVar3.f29579a == -1) {
            z = false;
        } else {
            z = true;
        }
        if (!z) {
            Application application = C11010c.f29554c;
            if (application == null) {
                C52711k.m112237a("context");
            }
            C11010c.f29558g = C11022g.m22321a(application);
        }
        Application application2 = C11010c.f29554c;
        if (application2 == null) {
            C52711k.m112237a("context");
        }
        C11010c.f29560i = C11022g.m22323b(application2);
        Application application3 = C11010c.f29554c;
        if (application3 == null) {
            C52711k.m112237a("context");
        }
        String a = C11022g.m22322a(application3, "meta_umeng_channel");
        if (a != null) {
            if (a.length() > 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                a = null;
            }
            if (a != null) {
                C11010c.f29570s = a;
                C11010c.f29571t = a;
            }
        }
        Application application4 = C11010c.f29554c;
        if (application4 == null) {
            C52711k.m112237a("context");
        }
        String a2 = C11022g.m22322a(application4, "GIT_BRANCH");
        if (a2 != null) {
            C11010c.f29566o = a2;
        }
        Application application5 = C11010c.f29554c;
        if (application5 == null) {
            C52711k.m112237a("context");
        }
        String a3 = C11022g.m22322a(application5, "GIT_SHA");
        if (a3 != null) {
            C11010c.f29567p = a3;
        }
        Application application6 = C11010c.f29554c;
        if (application6 == null) {
            C52711k.m112237a("context");
        }
        String a4 = C11022g.m22322a(application6, "GIT_USERNAME");
        if (a4 != null) {
            C11010c.f29568q = a4;
        }
        Application application7 = C11010c.f29554c;
        if (application7 == null) {
            C52711k.m112237a("context");
        }
        String a5 = C11022g.m22322a(application7, "GIT_USER_EMAIL");
        if (a5 != null) {
            C11010c.f29569r = a5;
        }
        Application application8 = C11010c.f29554c;
        if (application8 == null) {
            C52711k.m112237a("context");
        }
        String a6 = C11022g.m22322a(application8, "release_build");
        if (a6 != null) {
            C11010c.f29562k = a6;
        }
        Application a7 = dVar2.mo19903a();
        C52711k.m112240b(a7, "app");
        a7.registerActivityLifecycleCallbacks(new C11020d(a7));
        C11016e.f29603j = dVar2.f29584c;
        C22574a.m55738f().mo46917a("cold_boot_application_attach_before_base_duration", false);
        C11511a.m23577a(context, "16.0.41", null);
        C35804a.m80934a(context);
        C29978a.f78231b = SystemClock.elapsedRealtime();
        if (C29978a.f78230a < 0) {
            C29978a.f78230a = SystemClock.elapsedRealtime();
        }
        C29978a.f78232c = System.currentTimeMillis();
        C22574a.m55738f().mo46921b("cold_boot_application_attach_before_base_duration", false);
        if (this.f61140c) {
            long currentTimeMillis = System.currentTimeMillis();
            C22574a.m55738f().mo46917a("feed_boot_to_feed_request", true);
            C22574a.m55738f().mo46917a("cold_boot_application_attach_duration", true);
            C22574a.m55738f().mo46917a("feed_cover_total", false);
            C22574a.m55738f().mo46917a("feed_total", true);
            C22574a.m55738f().mo46917a("app_start_to_main_focus", true);
            C22574a.m55738f().mo46917a("cold_boot_start_to_feed_ui", false);
            C22574a.m55738f().f60707h = currentTimeMillis;
        }
        f61138a = this;
        C27548d.m66217a(this);
        if (VERSION.SDK_INT <= 28) {
            ((ThreadPoolExecutor) AsyncTask.THREAD_POOL_EXECUTOR).setRejectedExecutionHandler(new C22924ad());
        }
        if (VERSION.SDK_INT <= 19) {
            String b = C18920g.m46051b(this);
            if (BoostMultiDex.isOptimizeProcess(b)) {
                z4 = true;
            } else {
                BoostMultiDex.install(this, new Monitor() {
                    public final void loadLibrary(String str) {
                        C11511a.m23578a(str);
                    }
                }.setProcessName(b));
            }
        }
        this.f126189f = z4;
        if (!this.f126189f) {
            this.f61141d = System.currentTimeMillis() - C22574a.m55738f().f60707h;
            attachBaseContextAfterMultiDex();
        }
    }

    public SQLiteDatabase openOrCreateDatabase(String str, int i, CursorFactory cursorFactory) {
        String b = C18920g.m46051b(this);
        if (!C9431p.m18664a(b) && !C9431p.m18664a(str) && b.endsWith(":ad") && VERSION.SDK_INT < 19) {
            StringBuilder sb = new StringBuilder("ad_");
            sb.append(str);
            str = sb.toString();
        }
        return super.openOrCreateDatabase(str, i, cursorFactory);
    }
}
