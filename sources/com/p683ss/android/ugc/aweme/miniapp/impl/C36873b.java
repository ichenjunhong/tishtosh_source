package com.p683ss.android.ugc.aweme.miniapp.impl;

import android.app.Activity;
import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap.Config;
import android.graphics.Color;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import android.webkit.CookieManager;
import com.bytedance.android.livesdk.chatroom.p325ui.C6162et;
import com.bytedance.apm.C8936b;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.p465a.C8919d;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p526f.C9409b;
import com.bytedance.crash.C9544a;
import com.bytedance.crash.C9571d;
import com.bytedance.crash.C9588g;
import com.bytedance.crash.C9610j;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.lighten.loader.C12250q;
import com.bytedance.lighten.p766a.C12194h;
import com.facebook.common.p917a.C13658b;
import com.facebook.common.p917a.C13659c;
import com.facebook.common.p920d.C13691k;
import com.facebook.common.p921e.C13697a;
import com.facebook.common.p921e.C13699c;
import com.facebook.common.p923g.C13705d;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.imagepipeline.p956a.p957a.C13909c;
import com.facebook.imagepipeline.p956a.p957a.C13910d;
import com.facebook.imagepipeline.p956a.p958b.C13916b;
import com.facebook.imagepipeline.p961b.p962a.C13935a;
import com.facebook.imagepipeline.p964d.C13987q;
import com.facebook.imagepipeline.p965e.C14008i;
import com.facebook.p914c.p916b.C13636c;
import com.p2615tt.appbrandimpl.C51921a;
import com.p2615tt.appbrandimpl.C51921a.C51923a;
import com.p2615tt.appbrandimpl.C51921a.C51924b;
import com.p2615tt.appbrandimpl.C51925b;
import com.p2615tt.appbrandimpl.C51929e;
import com.p2615tt.appbrandimpl.C51929e.C51930a;
import com.p2615tt.appbrandimpl.MicroAppApi;
import com.p683ss.android.agilelogger.C18778a;
import com.p683ss.android.agilelogger.C18783b;
import com.p683ss.android.agilelogger.C18783b.C18785a;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.p1140c.C18844a;
import com.p683ss.android.ugc.aweme.AccountService;
import com.p683ss.android.ugc.aweme.C22551ak;
import com.p683ss.android.ugc.aweme.IAccountService;
import com.p683ss.android.ugc.aweme.IAccountService.C20837d;
import com.p683ss.android.ugc.aweme.IAccountService.C20840g;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.util.C22265g;
import com.p683ss.android.ugc.aweme.app.C22933ai;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.C23566n.C23568a;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.dfbase.C27532a;
import com.p683ss.android.ugc.aweme.dfbase.C27558m;
import com.p683ss.android.ugc.aweme.dfbase.C27559n;
import com.p683ss.android.ugc.aweme.dfbase.p1631c.C27548d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.i18n.C33091a;
import com.p683ss.android.ugc.aweme.i18n.language.C33106b;
import com.p683ss.android.ugc.aweme.image.C35488d;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.miniapp.C36909l;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36950a;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36964c;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36965d;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36970i;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36971j;
import com.p683ss.android.ugc.aweme.miniapp_api.model.p1961a.C36952a.C36953a;
import com.p683ss.android.ugc.aweme.miniapp_api.p1957a.C36920b;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.C36935a;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.C36939b;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.C36942d;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.C36944f;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.p1959a.C36936a;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.p1959a.C36937b;
import com.p683ss.android.ugc.aweme.miniapp_api.p1958b.p1959a.C36938c;
import com.p683ss.android.ugc.aweme.net.C37809s;
import com.p683ss.android.ugc.aweme.net.C37815x;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.AsyncAVService;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.services.IExternalService.AsyncServiceLoader;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.EditConfig.Builder;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.MiniAppConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.RecordConfig;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.VideoMedia;
import com.p683ss.android.ugc.aweme.shortvideo.edit.C43758o;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.aweme.utils.C47957v;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.util.Collection;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53755c;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b */
public final class C36873b implements C36920b {

    /* renamed from: a */
    private final String f94246a;

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$a */
    static final class C36874a implements C20840g {

        /* renamed from: a */
        final /* synthetic */ C36939b f94247a;

        C36874a(C36939b bVar) {
            this.f94247a = bVar;
        }

        public final void onResult(int i, int i2, Object obj) {
            if (this.f94247a != null) {
                this.f94247a.mo76188a(i, i2, obj);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$b */
    public static final class C36875b implements C36944f {

        /* renamed from: a */
        final /* synthetic */ C36873b f94248a;

        /* renamed from: b */
        final /* synthetic */ IIMService f94249b;

        /* renamed from: c */
        final /* synthetic */ Context f94250c;

        /* renamed from: d */
        final /* synthetic */ Bundle f94251d;

        /* renamed from: e */
        final /* synthetic */ C36942d f94252e;

        /* renamed from: a */
        public final void mo76113a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo76112a() {
            this.f94249b.enterChooseContact(this.f94250c, this.f94251d, new C23371a<Boolean>(this) {

                /* renamed from: a */
                final /* synthetic */ C36875b f94253a;

                {
                    this.f94253a = r1;
                }

                public final /* synthetic */ void run(Object obj) {
                    Boolean bool = (Boolean) obj;
                    C36942d dVar = this.f94253a.f94252e;
                    C36953a aVar = new C36953a();
                    if (bool == null) {
                        C52711k.m112234a();
                    }
                    dVar.mo76190a(aVar.mo76203a(bool.booleanValue()).mo76204a());
                }
            });
        }

        C36875b(C36873b bVar, IIMService iIMService, Context context, Bundle bundle, C36942d dVar) {
            this.f94248a = bVar;
            this.f94249b = iIMService;
            this.f94250c = context;
            this.f94251d = bundle;
            this.f94252e = dVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$c */
    static final class C36877c<T> implements C23371a<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C36942d f94254a;

        C36877c(C36942d dVar) {
            this.f94254a = dVar;
        }

        public final /* synthetic */ void run(Object obj) {
            Boolean bool = (Boolean) obj;
            C36942d dVar = this.f94254a;
            C36953a aVar = new C36953a();
            if (bool == null) {
                C52711k.m112234a();
            }
            dVar.mo76190a(aVar.mo76203a(bool.booleanValue()).mo76204a());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$d */
    public static final class C36878d implements C23505g {

        /* renamed from: a */
        final /* synthetic */ C36944f f94255a;

        /* renamed from: a */
        public final void mo46279a() {
            this.f94255a.mo76112a();
        }

        C36878d(C36944f fVar) {
            this.f94255a = fVar;
        }

        /* renamed from: a */
        public final void mo46280a(Bundle bundle) {
            this.f94255a.mo76113a(null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$e */
    static final class C36879e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C51921a f94256a;

        /* renamed from: b */
        final /* synthetic */ OnClickListener f94257b;

        C36879e(C51921a aVar, OnClickListener onClickListener) {
            this.f94256a = aVar;
            this.f94257b = onClickListener;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f94256a.dismiss();
            this.f94257b.onClick(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$f */
    static final class C36880f implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ OnClickListener f94258a;

        /* renamed from: b */
        final /* synthetic */ C51921a f94259b;

        C36880f(OnClickListener onClickListener, C51921a aVar) {
            this.f94258a = onClickListener;
            this.f94259b = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f94258a.onClick(view);
            this.f94259b.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$g */
    static final class C36881g implements C8919d {

        /* renamed from: a */
        public static final C36881g f94260a = new C36881g();

        C36881g() {
        }

        /* renamed from: a */
        public final void mo15952a() {
            try {
                C18778a.m45849c();
                C18778a.m45851d();
                Thread.sleep(1000);
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$h */
    public static final class C36882h implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ Activity f94261a;

        /* renamed from: b */
        final /* synthetic */ Builder f94262b;

        C36882h(Activity activity, Builder builder) {
            this.f94261a = activity;
            this.f94262b = builder;
        }

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            asyncAVService.uiService().editService().startEdit(this.f94261a, this.f94262b.build());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$i */
    public static final class C36883i implements C36944f {

        /* renamed from: a */
        final /* synthetic */ C36873b f94263a;

        /* renamed from: b */
        final /* synthetic */ Activity f94264b;

        /* renamed from: c */
        final /* synthetic */ Intent f94265c;

        /* renamed from: a */
        public final void mo76113a(Bundle bundle) {
        }

        /* renamed from: a */
        public final void mo76112a() {
            C36873b.m82951b(this.f94264b, this.f94265c);
        }

        C36883i(C36873b bVar, Activity activity, Intent intent) {
            this.f94263a = bVar;
            this.f94264b = activity;
            this.f94265c = intent;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.miniapp.impl.b$j */
    public static final class C36884j implements AsyncServiceLoader {

        /* renamed from: a */
        final /* synthetic */ Activity f94266a;

        /* renamed from: b */
        final /* synthetic */ RecordConfig.Builder f94267b;

        C36884j(Activity activity, RecordConfig.Builder builder) {
            this.f94266a = activity;
            this.f94267b = builder;
        }

        public final void onLoad(AsyncAVService asyncAVService, long j) {
            C52711k.m112240b(asyncAVService, "service");
            asyncAVService.uiService().recordService().startRecord((Context) this.f94266a, this.f94267b.build());
        }
    }

    /* renamed from: a */
    public final String mo76074a() {
        return "scan_code_result";
    }

    /* renamed from: b */
    public final String mo76098b() {
        return "scan_code_type";
    }

    /* renamed from: j */
    public final String mo76110j() {
        return "";
    }

    /* renamed from: a */
    public final void mo76086a(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "string");
        C10691a.m21545b(context, str).mo19066a();
    }

    /* renamed from: a */
    public final void mo76083a(Application application) {
        C52711k.m112240b(application, "application");
        Context context = application;
        C12194h.m24639a(context);
        if (!C13771c.f35832a) {
            C13697a.m27671a((C13699c) C35488d.m80206a());
            C13916b.m28350a(1);
            Object systemService = application.getSystemService("activity");
            if (systemService != null) {
                ActivityManager activityManager = (ActivityManager) systemService;
                C13636c a = C13636c.m27531a(context).mo25501a(C48016e.m103945c()).mo25502a("fresco_cache").mo25500a((C13658b) C13659c.m27611a()).mo25503a();
                C37809s a2 = C37809s.m84409a();
                C52711k.m112236a((Object) a2, "OkHttpManager.getSingleton()");
                C14008i a3 = C13935a.m28397a(context, a2.mo77269c()).mo26201a((C13691k<C13987q>) new C22933ai<C13987q>(activityManager)).mo26202a((C13705d) C12250q.m24726a()).mo26200a(a).mo26199a(Config.RGB_565).mo26205a(true).mo26206a();
                C13910d a4 = C13909c.m28333a();
                a4.f36298c = 0;
                a4.f36297b = true;
                a4.f36296a = false;
                C13909c.f36291a = a4.mo26082a();
                C13771c.m27872a(context, a3);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.app.ActivityManager");
        }
    }

    /* renamed from: a */
    public final void mo76089a(Runnable runnable) {
        C52711k.m112240b(runnable, "runnable");
        C24076h.m58903d().execute(runnable);
    }

    /* renamed from: a */
    public final void mo76088a(Exception exc) {
        C52711k.m112240b(exc, "exception");
        C32458a.m75143a(exc);
    }

    /* renamed from: a */
    public final void mo76093a(String str, String str2, String str3, Throwable th) {
        C52711k.m112240b(str, "type");
        C52711k.m112240b(str2, "tag");
        if ("v".equals(str)) {
            C18778a.m45843a(str2, str3);
        } else if ("i".equals(str)) {
            C18778a.m45850c(str2, str3);
        } else if ("d".equals(str)) {
            C18778a.m45848b(str2, str3);
        } else if ("w".equals(str)) {
            C18778a.m45852d(str2, str3);
        } else if ("e".equals(str)) {
            C18778a.m45854e(str2, str3);
        } else if (C6162et.f16534a.equals(str)) {
            C18778a.m45844a(str2, str3, th);
        } else {
            if ("f".equals(str)) {
                C18778a.m45849c();
                C18778a.m45851d();
            }
        }
    }

    /* renamed from: a */
    public final void mo76091a(String str, C36935a aVar) {
        C52711k.m112240b(str, "type");
        C52711k.m112240b(aVar, "callback");
        C36894g a = C36894g.m83007a();
        a.f94274a.put(str, aVar);
        if (!C53755c.m114319a().mo112958b((Object) a)) {
            C53755c.m114319a().mo112955a((Object) a);
        }
    }

    /* renamed from: a */
    public final void mo76090a(String str) {
        C52711k.m112240b(str, "type");
        C36894g a = C36894g.m83007a();
        if (a.f94274a.containsKey(str)) {
            a.f94274a.remove(str);
        }
        C53755c.m114319a().mo112959c((Object) a);
    }

    /* renamed from: a */
    public final void mo76085a(Context context, Bundle bundle, C36942d dVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(bundle, "bundle");
        C52711k.m112240b(dVar, "callback");
        IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        C52711k.m112236a((Object) baseUserService_Monster, "ServiceManager.get().get…IUserService::class.java)");
        if (!baseUserService_Monster.isLogin()) {
            C36875b bVar = new C36875b(this, provideIMService_Monster, context, bundle, dVar);
            mo76082a((Activity) context, "", "", (C36944f) bVar);
            return;
        }
        provideIMService_Monster.enterChooseContact(context, bundle, new C36877c(dVar));
    }

    /* renamed from: a */
    public final void mo76082a(Activity activity, String str, String str2, C36944f fVar) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "enterMethod");
        C52711k.m112240b(fVar, "callback");
        C27965f.m66721a(activity, str, "click_mp", (Bundle) null, (C23505g) new C36878d(fVar));
    }

    /* renamed from: a */
    public final void mo76087a(Context context, String str, JSONObject jSONObject) {
        C52711k.m112240b(context, "context");
        AppLog.recordMiscLog(context, str, jSONObject);
    }

    /* renamed from: a */
    public final void mo76084a(Application application, int i, int i2, Map<String, String> map) {
        C52711k.m112240b(application, "application");
        C52711k.m112240b(map, "codemap");
        C9610j.m19137b().mo17478b("https://api2.musical.ly/monitor/collect/c/native_bin_crash");
        C9610j.m19137b().mo17479c("https://api2.musical.ly/monitor/collect/c/crash");
        C9610j.m19137b().mo17475a("https://api2.musical.ly/monitor/collect/c/exception");
        C9610j.m19127a((Context) application, (C9588g) new C36909l(application));
        C9610j.m19135a(map);
        C9610j.m19132a((C9544a) new C9544a(map) {

            /* renamed from: a */
            final /* synthetic */ Map f94268a;

            /* renamed from: a */
            public final Map<String, String> mo17347a(C9571d dVar) {
                return this.f94268a;
            }

            {
                this.f94268a = r1;
            }
        }, C9571d.ALL);
        C33091a.m76063a();
    }

    /* renamed from: a */
    public final void mo76094a(Map<String, String> map) {
        C52711k.m112240b(map, "codemap");
        C9610j.m19135a(map);
    }

    /* renamed from: a */
    public final void mo76092a(String str, String str2, String str3, int i, C36942d dVar) {
        C52711k.m112240b(str, "type");
        C52711k.m112240b(str2, "microAppId");
        C52711k.m112240b(str3, "hashTagName");
        C52711k.m112240b(dVar, "callback");
        C51929e eVar = C51930a.f129614a;
        if (TextUtils.equals("fetch_video", str)) {
            if (!TextUtils.equals(eVar.f129612d, str2)) {
                eVar.f129610b = null;
                eVar.f129611c = null;
                eVar.f129612d = str2;
            }
            if (!TextUtils.equals(eVar.f129613e, str3)) {
                eVar.f129610b = null;
                eVar.f129611c = null;
                eVar.f129613e = str3;
            }
            if (eVar.f129610b == null) {
                eVar.f129610b = new C51925b();
            }
            if (eVar.f129611c == null) {
                eVar.f129611c = new C26876b();
            }
            eVar.f129611c.mo54799a(eVar.f129610b);
            FeedItemList feedItemList = (FeedItemList) eVar.f129610b.getData();
            long j = feedItemList != null ? feedItemList.cursor : 0;
            if (eVar.f129610b.isHasMore() || j == 0) {
                eVar.f129611c.mo44934a_(Integer.valueOf(4), str2, str3, Long.valueOf(j), Integer.valueOf(10));
            }
            return;
        }
        if (TextUtils.equals("open_video", str)) {
            List items = eVar.f129610b.getItems();
            if (i >= 0 && i < items.size() && !C9376b.m18558a((Collection<T>) items)) {
                dVar.mo76190a(new C36953a().mo76205b(((Aweme) items.get(i)).getAid()).mo76204a());
                C31213v.m72896a((C26875a) eVar.f129610b);
            }
        }
    }

    /* renamed from: e */
    public final String mo76105e() {
        String c = C22265g.m55114c();
        C52711k.m112236a((Object) c, "CookieUtils.getSessionId()");
        return c;
    }

    /* renamed from: f */
    public final String mo76106f() {
        String cookie = CookieManager.getInstance().getCookie(this.f94246a);
        C52711k.m112236a((Object) cookie, "CookieManager.getInstanc…).getCookie(apiUrlPrefix)");
        return cookie;
    }

    /* renamed from: g */
    public final String mo76107g() {
        String b = C22265g.m55113b();
        C52711k.m112236a((Object) b, "CookieUtils.getCookie()");
        return b;
    }

    public C36873b() {
        StringBuilder sb = new StringBuilder("http://");
        sb.append(C18844a.f52028c);
        this.f94246a = sb.toString();
    }

    /* renamed from: d */
    public final void mo76104d() {
        C23566n.m57766a().mo48751a(new C23568a().mo48753a(C24076h.m58902c()));
    }

    /* renamed from: i */
    public final C36964c mo76109i() {
        C36964c cVar = new C36964c();
        IAccountUserService userService = AccountService.createIAccountServicebyMonsterPlugin().userService();
        if (userService != null) {
            cVar.f94384a = userService.isLogin();
            cVar.f94385b = userService.getAvatarUrl();
        }
        return cVar;
    }

    /* renamed from: k */
    public final boolean mo76111k() {
        if (C27558m.m66226b().mo33621b().contains("df_miniapp_so")) {
            return true;
        }
        C27532a aVar = new C27532a("df_miniapp_so");
        if (C27532a.m66172c()) {
            aVar.mo55967a(new C27559n() {
                /* renamed from: b */
                public final void mo50034b(boolean z) {
                }

                /* renamed from: a */
                public final void mo50033a(boolean z) {
                    C27548d.m66217a(C11010c.m22280a());
                    if (!z && C36931b.m83141a() != null) {
                        C36931b.m83141a().mo76184a();
                    }
                }
            });
            aVar.mo55969b();
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo76103c() {
        if (AVExternalServiceImpl.getAVServiceImpl_Monster().configService().shortVideoConfig().isRecording() || AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishing()) {
            return true;
        }
        return false;
    }

    /* renamed from: h */
    public final C36971j mo76108h() {
        String str;
        String str2;
        String str3;
        String str4;
        IAccountUserService userService = AccountService.createIAccountServicebyMonsterPlugin().userService();
        C36971j jVar = new C36971j();
        C52711k.m112236a((Object) userService, "accountUserService");
        User curUser = userService.getCurUser();
        if (curUser != null) {
            str = curUser.getNickname();
        } else {
            str = "";
        }
        jVar.f94398a = str;
        if (curUser != null) {
            str2 = String.valueOf(curUser.getGender());
        } else {
            str2 = "";
        }
        jVar.f94401d = str2;
        if (curUser != null) {
            str3 = curUser.getUid();
        } else {
            str3 = "";
        }
        jVar.f94399b = str3;
        if (curUser != null) {
            str4 = curUser.getSecUid();
        } else {
            str4 = "";
        }
        jVar.f94400c = str4;
        C52711k.m112236a((Object) jVar, "MpUser().getMpUserFromUs…countUserService.curUser)");
        return jVar;
    }

    /* renamed from: a */
    public final void mo76095a(boolean z) {
        C37815x.m84417a();
    }

    /* renamed from: b */
    public final C36950a mo76096b(String str) {
        C52711k.m112240b(str, "aliasId");
        C36950a a = MicroAppApi.m111316a(str);
        C52711k.m112236a((Object) a, "MicroAppApi.getVideoGid(aliasId)");
        return a;
    }

    /* renamed from: a */
    public final Locale mo76075a(Context context) {
        C52711k.m112240b(context, "context");
        return C33106b.m76104a(context);
    }

    /* renamed from: b */
    public final void mo76099b(Application application) {
        C52711k.m112240b(application, "application");
        Class cls = Class.forName("com.bytedance.leakdetector.LeakDetectorInstaller");
        Class[] clsArr = {Application.class};
        Object[] objArr = {application};
        C9409b.m18609a(C9409b.m18608a(cls).mo17051a("INSTANCE", (Class<?>[]) new Class[]{cls}).f25654a).mo17052a("install", (Class<?>[]) clsArr, objArr);
    }

    /* renamed from: a */
    public final void mo76078a(Activity activity) {
        C52711k.m112240b(activity, "activity");
        IAccountService createIAccountServicebyMonsterPlugin = AccountService.createIAccountServicebyMonsterPlugin();
        if (createIAccountServicebyMonsterPlugin != null) {
            createIAccountServicebyMonsterPlugin.login(new C20837d().mo44381a(activity).mo44380a());
        }
    }

    /* renamed from: b */
    public final void mo76101b(Runnable runnable) {
        C52711k.m112240b(runnable, "task");
        C47957v.m103771b(runnable);
    }

    /* renamed from: a */
    public final C36965d mo76073a(String str, long j) {
        C52711k.m112240b(str, "fromToken");
        C36965d a = MicroAppApi.m111317a(str, j);
        C52711k.m112236a((Object) a, "MicroAppApi.getFollowRelation(fromToken, toUid)");
        return a;
    }

    /* renamed from: b */
    public final C36970i mo76097b(long j, long j2) {
        C36970i a = MicroAppApi.m111319a(j, j2);
        C52711k.m112236a((Object) a, "MicroAppApi.mutualFollowUser(fromUid, toUid)");
        return a;
    }

    /* renamed from: a */
    public final void mo76076a(long j, long j2) {
        C18783b bVar = C18778a.f51915b;
        C52711k.m112236a((Object) bVar, "ALog.sConfig");
        C8936b.m17653a(bVar.f51932d, j, j2, "feedback", (C8919d) C36881g.f94260a);
    }

    /* renamed from: c */
    public final void mo76102c(Activity activity, Intent intent) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(intent, "inputIntent");
        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
        C52711k.m112236a((Object) baseUserService_Monster, "ServiceManager.get().get…IUserService::class.java)");
        if (!baseUserService_Monster.isLogin()) {
            mo76082a(activity, "", "", (C36944f) new C36883i(this, activity, intent));
        } else {
            m82951b(activity, intent);
        }
    }

    /* renamed from: b */
    public static void m82951b(Activity activity, Intent intent) {
        C43758o oVar = (C43758o) C47760cd.m103384a(intent.getStringExtra("micro_app_info"), C43758o.class);
        MiniAppConfig miniAppConfig = new MiniAppConfig();
        miniAppConfig.setAppClass(intent.getSerializableExtra("micro_app_class"));
        miniAppConfig.setAppInfo(oVar);
        miniAppConfig.setStickerId(intent.getStringExtra("sticker_id"));
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C36884j(activity, new RecordConfig.Builder().creationId(intent.getStringExtra("creation_id")).translationType(3).miniAppConfig(miniAppConfig).shootWay("mp_record")));
    }

    /* renamed from: b */
    public final void mo76100b(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "extra");
        C18783b a = new C18785a(context).mo38392a(20971520).mo38394b(2097152).mo38393a();
        C18778a.m45842a(C36873b.class.getCanonicalName());
        C18778a.m45846a(a);
    }

    /* renamed from: a */
    public final void mo76079a(Activity activity, Intent intent) {
        String str;
        Serializable serializable;
        String str2;
        C52711k.m112240b(activity, "activity");
        String str3 = null;
        if (intent != null) {
            str = intent.getStringExtra("micro_app_info");
        } else {
            str = null;
        }
        C43758o oVar = (C43758o) C47760cd.m103384a(str, C43758o.class);
        Bundle bundle = new Bundle();
        String str4 = "micro_app_class";
        if (intent != null) {
            serializable = intent.getSerializableExtra("micro_app_class");
        } else {
            serializable = null;
        }
        bundle.putSerializable(str4, serializable);
        bundle.putSerializable("micro_app_info", oVar);
        bundle.putBoolean("extra_cross_process", true);
        String str5 = "extra_cross_process_boolean_extra";
        boolean z = false;
        if (intent != null) {
            z = intent.getBooleanExtra("extra_cross_process_boolean_extra", false);
        }
        bundle.putBoolean(str5, z);
        Builder builder = new Builder();
        if (intent != null) {
            str2 = intent.getStringExtra("creation_id");
        } else {
            str2 = null;
        }
        Builder clear = builder.creationId(str2).shootWay("record_screen").launchFlag(268435456).clear(true);
        if (intent != null) {
            str3 = intent.getStringExtra("file_path");
        }
        if (str3 == null) {
            C52711k.m112234a();
        }
        VideoMedia videoMedia = new VideoMedia(str3);
        videoMedia.setExtraBundle(bundle);
        AVExternalServiceImpl.getAVServiceImpl_Monster().asyncService(new C36882h(activity, clear.mediaInfo(videoMedia).requestCode(1)));
    }

    /* renamed from: a */
    public final void mo76077a(long j, C36936a aVar, C36937b bVar, boolean z) {
        C52711k.m112240b(aVar, "callInBackgroundCallback");
        C52711k.m112240b(bVar, "continueCallback");
        if (z) {
            C0013i.m12a(j);
            C0013i.m16a((Callable<TResult>) new Callable<Object>(aVar) {

                /* renamed from: a */
                final /* synthetic */ C36936a f94270a;

                public final Object call() throws Exception {
                    return this.f94270a.mo76186a(new C36938c());
                }

                {
                    this.f94270a = r1;
                }
            }).mo20a((C0011g<TResult, TContinuationResult>) new C0011g<Object, Object>(bVar) {

                /* renamed from: a */
                final /* synthetic */ C36937b f94269a;

                {
                    this.f94269a = r1;
                }

                public final Object then(C0013i<Object> iVar) throws Exception {
                    C36938c cVar = new C36938c();
                    cVar.f94307a = iVar.mo33d();
                    cVar.f94308b = iVar.mo34e();
                    this.f94269a.mo76187a(cVar);
                    return null;
                }
            }, C0013i.f25b);
            return;
        }
        C0013i.m12a(j);
        C0013i.m16a((Callable<TResult>) new Callable<Object>(aVar) {

            /* renamed from: a */
            final /* synthetic */ C36936a f94272a;

            public final Object call() throws Exception {
                return this.f94272a.mo76186a(new C36938c());
            }

            {
                this.f94272a = r1;
            }
        }).mo19a((C0011g<TResult, TContinuationResult>) new C0011g<Object, Object>(bVar) {

            /* renamed from: a */
            final /* synthetic */ C36937b f94271a;

            {
                this.f94271a = r1;
            }

            public final Object then(C0013i<Object> iVar) throws Exception {
                C36938c cVar = new C36938c();
                cVar.f94307a = iVar.mo33d();
                cVar.f94308b = iVar.mo34e();
                this.f94271a.mo76187a(cVar);
                return null;
            }
        });
    }

    /* renamed from: a */
    public final void mo76081a(Activity activity, String str, Bundle bundle, C36939b bVar) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(str, "var2");
        C52711k.m112240b(bVar, "listener");
        IAccountService createIAccountServicebyMonsterPlugin = AccountService.createIAccountServicebyMonsterPlugin();
        if (createIAccountServicebyMonsterPlugin != null) {
            C22551ak bindService = createIAccountServicebyMonsterPlugin.bindService();
            if (bindService != null) {
                bindService.bindMobile(activity, str, null, new C36874a(bVar));
            }
        }
    }

    /* renamed from: a */
    public final void mo76080a(Activity activity, C36965d dVar, long j, OnClickListener onClickListener, OnClickListener onClickListener2) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(dVar, "relation");
        C52711k.m112240b(onClickListener, "leftButtonListener");
        C52711k.m112240b(onClickListener2, "rightButtonListener");
        C51924b bVar = new C51924b(true, -1, -1);
        C51924b bVar2 = new C51924b(false, -1, Color.parseColor("#c0161823"));
        C51923a aVar = new C51923a();
        aVar.f129576a = activity.getString(R.string.b4d);
        aVar.f129584i = bVar;
        aVar.f129578c = activity.getString(R.string.r6);
        aVar.f129586k = bVar2;
        String string = activity.getString(R.string.wf);
        C51924b bVar3 = C51924b.f129593d;
        aVar.f129581f = string;
        aVar.f129587l = bVar3;
        aVar.f129582g = activity.getString(R.string.duk);
        aVar.f129588m = bVar;
        aVar.f129589n = false;
        C51921a aVar2 = new C51921a(activity);
        aVar2.f129565a = aVar;
        OnClickListener eVar = new C36879e(aVar2, onClickListener);
        if (aVar2.f129565a != null) {
            aVar2.f129565a.f129591p = eVar;
            OnClickListener fVar = new C36880f(onClickListener2, aVar2);
            if (aVar2.f129565a != null) {
                aVar2.f129565a.f129592q = fVar;
                aVar2.setCancelable(false);
                aVar2.show();
                return;
            }
            throw new IllegalStateException("You must init Builder first !");
        }
        throw new IllegalStateException("You must init Builder first !");
    }
}
