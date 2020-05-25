package com.p683ss.android.ugc.aweme.bullet.reactpackage;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.p038f.C0794k;
import android.text.TextUtils;
import com.bytedance.ies.bullet.kit.p644rn.core.BulletMethod;
import com.bytedance.ies.bullet.kit.p644rn.core.C10461a;
import com.bytedance.ies.bullet.kit.p644rn.core.C10462b;
import com.bytedance.ies.bullet.kit.p644rn.p647d.C10468a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.retrofit2.p830a.C12685b;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.newmedia.C19555f;
import com.p683ss.android.sdk.webview.C19767n;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.app.AwemeAppData;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.bullet.C24098a;
import com.p683ss.android.ugc.aweme.bullet.utils.C24348b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.language.I18nManagerService;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.net.CommonApi;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22493b;
import com.p683ss.android.ugc.aweme.p1706fe.method.ShareMethod;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.router.C41302w;
import com.p683ss.android.ugc.aweme.utils.C47789cu;
import com.p683ss.android.ugc.aweme.utils.C47892fm;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.Callable;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52722v.C52727e;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule */
public final class RNCommonModule implements C10462b {
    private static final String APP_LANGUAGE = "app_language";
    private static final String APP_NAME = "appName";
    private static final String APP_VERSION = "appVersion";
    private static final String CHANNEL = "channel";
    private static final int CODE_FAIL = -1;
    private static final int CODE_SUCCESS = 1;
    public static final C24339a Companion = new C24339a(null);
    private static final String DEFAULT_CONTENT_TYPE = "application/x-www-form-urlencoded";
    private static final String DELETE = "DELETE";
    private static final String FIELD_METHOD = "method";
    private static final String FIELD_PARAMS = "params";
    private static final String GECKO_PATH = "assetSource";
    private static final String GET = "GET";
    private static final String IS_FULL_SCREEN = "isFullScreen";
    private static final String LANGUAGE = "language";
    private static final String POST = "POST";
    private static final String PUT = "PUT";
    private static final String REGION = "region";
    private final CommonApi sApi = ((CommonApi) RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().create(Api.f61282b).mo19930a(CommonApi.class));

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$a */
    public static final class C24339a {
        private C24339a() {
        }

        public /* synthetic */ C24339a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$b */
    static final class C24340b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f64630a;

        /* renamed from: b */
        final /* synthetic */ C10461a f64631b;

        C24340b(String str, C10461a aVar) {
            this.f64630a = str;
            this.f64631b = aVar;
        }

        public final void run() {
            Activity activityById = C24098a.m58973a().getActivityById(this.f64630a);
            if (activityById == null) {
                C10461a aVar = this.f64631b;
                if (aVar != null) {
                    aVar.mo18526a("illegal state to finish page.", null);
                }
            } else {
                activityById.finish();
                C10461a aVar2 = this.f64631b;
                if (aVar2 != null) {
                    aVar2.mo18526a(null, null);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$c */
    static final class C24341c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RNCommonModule f64632a;

        /* renamed from: b */
        final /* synthetic */ String f64633b;

        /* renamed from: c */
        final /* synthetic */ String f64634c;

        /* renamed from: d */
        final /* synthetic */ C10461a f64635d;

        C24341c(RNCommonModule rNCommonModule, String str, String str2, C10461a aVar) {
            this.f64632a = rNCommonModule;
            this.f64633b = str;
            this.f64634c = str2;
            this.f64635d = aVar;
        }

        public final void run() {
            boolean z;
            Activity activityById = C24098a.m58973a().getActivityById(this.f64633b);
            CharSequence charSequence = this.f64634c;
            int i = 1;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z || activityById == null) {
                RNCommonModule.reportCallback$default(this.f64632a, this.f64635d, Integer.valueOf(-1), "schema is not legal", null, 8, null);
            } else if (C52830p.m112411b(this.f64634c, "aweme://live/", false, 2, null)) {
                Uri parse = Uri.parse(this.f64634c);
                String queryParameter = parse.getQueryParameter("room_id");
                String queryParameter2 = parse.getQueryParameter("user_id");
                if (!TextUtils.isEmpty(queryParameter) || !TextUtils.isEmpty(queryParameter2)) {
                    C23060d.f61431e.mo47789a((Context) activityById, C52830p.m112401a(this.f64634c, "aweme", C23057c.f61423a, false, 4, (Object) null), (String) null);
                    RNCommonModule.reportCallback$default(this.f64632a, this.f64635d, Integer.valueOf(1), null, null, 12, null);
                    return;
                }
                RNCommonModule.reportCallback$default(this.f64632a, this.f64635d, Integer.valueOf(-1), null, null, 12, null);
            } else {
                boolean a = C41302w.m91042a().mo83858a(activityById, C24348b.m59717b(this.f64634c));
                RNCommonModule rNCommonModule = this.f64632a;
                C10461a aVar = this.f64635d;
                if (!a) {
                    i = -1;
                }
                RNCommonModule.reportCallback$default(rNCommonModule, aVar, Integer.valueOf(i), null, null, 12, null);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$d */
    static final class C24342d<V> implements Callable<TResult> {

        /* renamed from: a */
        final /* synthetic */ RNCommonModule f64636a;

        /* renamed from: b */
        final /* synthetic */ String f64637b;

        /* renamed from: c */
        final /* synthetic */ Map f64638c;

        /* renamed from: d */
        final /* synthetic */ HashMap f64639d;

        /* renamed from: e */
        final /* synthetic */ C52727e f64640e;

        /* renamed from: f */
        final /* synthetic */ List f64641f;

        C24342d(RNCommonModule rNCommonModule, String str, Map map, HashMap hashMap, C52727e eVar, List list) {
            this.f64636a = rNCommonModule;
            this.f64637b = str;
            this.f64638c = map;
            this.f64639d = hashMap;
            this.f64640e = eVar;
            this.f64641f = list;
        }

        public final /* synthetic */ Object call() {
            return this.f64636a.callInBackground(this.f64637b, this.f64638c, this.f64639d, (String) this.f64640e.element, this.f64641f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$e */
    static final class C24343e<TTaskResult, TContinuationResult> implements C0011g<C0794k<String, C22493b>, C52860x> {

        /* renamed from: a */
        final /* synthetic */ RNCommonModule f64642a;

        /* renamed from: b */
        final /* synthetic */ C10461a f64643b;

        C24343e(RNCommonModule rNCommonModule, C10461a aVar) {
            this.f64642a = rNCommonModule;
            this.f64643b = aVar;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            RNCommonModule rNCommonModule = this.f64642a;
            C52711k.m112236a((Object) iVar, "task");
            rNCommonModule.continueWith(iVar, this.f64643b);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$f */
    static final class C24344f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ RNCommonModule f64644a;

        /* renamed from: b */
        final /* synthetic */ Map f64645b;

        /* renamed from: c */
        final /* synthetic */ C10461a f64646c;

        C24344f(RNCommonModule rNCommonModule, Map map, C10461a aVar) {
            this.f64644a = rNCommonModule;
            this.f64645b = map;
            this.f64646c = aVar;
        }

        public final void run() {
            boolean z;
            int i = 1;
            try {
                z = new ShareMethod(null, 1, null).mo60070a(new WeakReference<>(C11016e.m22312g()), new JSONObject(this.f64645b));
            } catch (Exception unused) {
                z = false;
            }
            RNCommonModule rNCommonModule = this.f64644a;
            C10461a aVar = this.f64646c;
            if (!z) {
                i = -1;
            }
            RNCommonModule.reportCallback$default(rNCommonModule, aVar, Integer.valueOf(i), null, null, 12, null);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule$g */
    static final class C24345g implements Runnable {

        /* renamed from: a */
        final /* synthetic */ String f64647a;

        C24345g(String str) {
            this.f64647a = str;
        }

        public final void run() {
            C10691a.m21551c((Context) C11016e.m22312g(), this.f64647a).mo19066a();
        }
    }

    public final String getName() {
        return "brn";
    }

    public final boolean hasConstants() {
        return false;
    }

    public final void initialize() {
    }

    public final void onCatalystInstanceDestroy() {
    }

    private final Map<String, Object> getAppInfo() {
        Map<String, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(APP_NAME, C11010c.m22283d());
        linkedHashMap.put("aid", Integer.valueOf(C11010c.m22289j()));
        linkedHashMap.put(APP_VERSION, C11010c.m22288i());
        linkedHashMap.put("versionCode", Integer.valueOf((int) C11010c.m22287h()));
        String networkAccessType = NetworkUtils.getNetworkAccessType(C11010c.m22280a());
        C52711k.m112236a((Object) networkAccessType, "NetworkUtils.getNetworkA….getApplicationContext())");
        linkedHashMap.put("netType", networkAccessType);
        linkedHashMap.put("device_id", C47892fm.m103594a());
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        String curUserId = g.getCurUserId();
        C52711k.m112236a((Object) curUserId, "AccountProxyService.userService().curUserId");
        linkedHashMap.put("user_id", curUserId);
        linkedHashMap.put(CHANNEL, C11010c.m22295p());
        C36983a b = C36983a.m83185b();
        C52711k.m112236a((Object) b, "MiniAppServiceProxy.inst()");
        linkedHashMap.put("ironManSupported", Boolean.valueOf(b.mo76294a().checkMiniAppEnable(C11010c.m22280a())));
        return linkedHashMap;
    }

    public final Map<String, Object> getConstants() {
        Map<String, Object> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put(APP_NAME, C11010c.m22283d());
        linkedHashMap.put(APP_VERSION, C11010c.m22288i());
        String str = LANGUAGE;
        String locale = C47789cu.m103419b().toString();
        C52711k.m112236a((Object) locale, "LocaleUtils.getCurrentLocale().toString()");
        linkedHashMap.put(str, locale);
        String str2 = APP_LANGUAGE;
        I18nManagerService createI18nManagerServicebyMonsterPlugin = I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin();
        C52711k.m112236a((Object) createI18nManagerServicebyMonsterPlugin, "ServiceManager.get()\n   …nagerService::class.java)");
        String appLanguage = createI18nManagerServicebyMonsterPlugin.getAppLanguage();
        C52711k.m112236a((Object) appLanguage, "ServiceManager.get()\n   …::class.java).appLanguage");
        linkedHashMap.put(str2, appLanguage);
        String str3 = REGION;
        String e = C35837h.m80980e();
        C52711k.m112236a((Object) e, "RegionHelper.getRegion()");
        linkedHashMap.put(str3, e);
        linkedHashMap.put(CHANNEL, C11010c.m22295p());
        linkedHashMap.put(IS_FULL_SCREEN, Boolean.valueOf(C22453b.m55505a().f60473k));
        AwemeAppData a = C19555f.m47851a();
        C52711k.m112236a((Object) a, "BaseAppData.inst()");
        C19767n f = a.mo40808f();
        if (f != null) {
            String str4 = GECKO_PATH;
            String b = f.mo41208b();
            C52711k.m112236a((Object) b, "config.offlineRootDir()");
            linkedHashMap.put(str4, b);
        }
        return linkedHashMap;
    }

    @BulletMethod
    public final void showToast(String str) {
        new Handler(Looper.getMainLooper()).post(new C24345g(str));
    }

    @BulletMethod
    public final void getAppInfo(C10461a aVar) {
        if (aVar != null) {
            try {
                aVar.mo18526a(null, getAppInfo());
            } catch (Exception e) {
                if (aVar != null) {
                    aVar.mo18526a(e.getMessage(), null);
                }
            }
        }
    }

    @BulletMethod
    public final void getUserInfo(C10461a aVar) {
        try {
            JSONObject jSONObject = new JSONObject();
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            if (a.isLogin()) {
                IAccountUserService a2 = C20902b.m53242a();
                C52711k.m112236a((Object) a2, "AccountUserProxyService.get()");
                User curUser = a2.getCurUser();
                jSONObject.put("login", true);
                C52711k.m112236a((Object) curUser, "curUser");
                jSONObject.put("openid", curUser.getUid());
                jSONObject.put("bindPhone", curUser.getBindPhone());
                if (aVar != null) {
                    aVar.mo18526a(null, jSONObject.toString());
                }
            } else {
                jSONObject.put("login", false);
                if (aVar != null) {
                    aVar.mo18526a(null, jSONObject.toString());
                }
            }
        } catch (Exception unused) {
            if (aVar != null) {
                aVar.mo18526a("service get error", null);
            }
        }
    }

    @BulletMethod
    public final void close(String str, C10461a aVar) {
        if (str != null) {
            new Handler(Looper.getMainLooper()).post(new C24340b(str, aVar));
        }
    }

    @BulletMethod
    public final void share(Map<String, ? extends Object> map, C10461a aVar) {
        if (map != null) {
            new Handler(Looper.getMainLooper()).post(new C24344f(this, map, aVar));
        }
    }

    @BulletMethod
    public final void logEventV3(String str, Map<String, ? extends Object> map) {
        if (str != null && map != null) {
            Map linkedHashMap = new LinkedHashMap();
            for (Entry entry : map.entrySet()) {
                linkedHashMap.put(entry.getKey(), String.valueOf(entry.getValue()));
            }
            if (C11016e.m22312g() != null) {
                try {
                    C26890h.m65011a(str, linkedHashMap);
                } catch (Exception unused) {
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:23:0x0092, code lost:
        if (r10.optInt("code") != 0) goto L_0x0094;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void continueWith(p001a.C0013i<android.support.p030v4.p038f.C0794k<java.lang.String, com.p683ss.android.ugc.aweme.p1328af.p1329a.C22493b>> r9, com.bytedance.ies.bullet.kit.p644rn.core.C10461a r10) {
        /*
            r8 = this;
            boolean r0 = r9.mo33d()
            r1 = 2
            r2 = 0
            r3 = 0
            r4 = 1
            if (r0 == 0) goto L_0x0053
            java.lang.Exception r0 = r9.mo35f()
            boolean r5 = r0 instanceof com.p683ss.android.http.p1169a.p1170a.C19174b
            if (r5 == 0) goto L_0x001a
            r5 = r0
            com.ss.android.http.a.a.b r5 = (com.p683ss.android.http.p1169a.p1170a.C19174b) r5
            int r5 = r5.getStatusCode()
            goto L_0x001b
        L_0x001a:
            r5 = 1
        L_0x001b:
            java.util.LinkedHashMap r6 = new java.util.LinkedHashMap
            r6.<init>()
            java.util.Map r6 = (java.util.Map) r6
            java.lang.String r7 = "statusCode"
            java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
            r6.put(r7, r5)
            java.lang.String r5 = "statusMessage"
            java.lang.String r7 = r0.getMessage()
            if (r7 != 0) goto L_0x0035
            java.lang.String r7 = ""
        L_0x0035:
            r6.put(r5, r7)
            if (r10 == 0) goto L_0x0043
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r6
            r1[r4] = r2
            r10.mo18526a(r1)
        L_0x0043:
            com.ss.android.ugc.aweme.af.a.c r10 = new com.ss.android.ugc.aweme.af.a.c
            java.lang.String r1 = "network_error"
            java.lang.String r3 = "exception"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r3)
            java.lang.Throwable r0 = (java.lang.Throwable) r0
            r10.<init>(r1, r0)
            goto L_0x00d9
        L_0x0053:
            java.lang.Object r0 = r9.mo34e()
            android.support.v4.f.k r0 = (android.support.p030v4.p038f.C0794k) r0
            F r0 = r0.f2711a
            java.lang.String r0 = (java.lang.String) r0
            if (r10 == 0) goto L_0x0068
            java.lang.Object[] r1 = new java.lang.Object[r1]
            r1[r3] = r2
            r1[r4] = r0
            r10.mo18526a(r1)
        L_0x0068:
            org.json.JSONObject r10 = new org.json.JSONObject     // Catch:{ JSONException -> 0x00d8 }
            r10.<init>(r0)     // Catch:{ JSONException -> 0x00d8 }
            java.lang.String r1 = "message"
            boolean r1 = r10.has(r1)     // Catch:{ JSONException -> 0x00d8 }
            if (r1 == 0) goto L_0x0084
            java.lang.String r1 = "success"
            java.lang.String r3 = "message"
            java.lang.String r10 = r10.optString(r3)     // Catch:{ JSONException -> 0x00d8 }
            boolean r10 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r10)     // Catch:{ JSONException -> 0x00d8 }
            r3 = r10 ^ 1
            goto L_0x00b8
        L_0x0084:
            java.lang.String r1 = "code"
            boolean r1 = r10.has(r1)     // Catch:{ JSONException -> 0x00d8 }
            if (r1 == 0) goto L_0x0096
            java.lang.String r1 = "code"
            int r10 = r10.optInt(r1)     // Catch:{ JSONException -> 0x00d8 }
            if (r10 == 0) goto L_0x00b8
        L_0x0094:
            r3 = 1
            goto L_0x00b8
        L_0x0096:
            java.lang.String r1 = "status_code"
            boolean r1 = r10.has(r1)     // Catch:{ JSONException -> 0x00d8 }
            if (r1 == 0) goto L_0x00a7
            java.lang.String r1 = "status_code"
            int r10 = r10.optInt(r1)     // Catch:{ JSONException -> 0x00d8 }
            if (r10 == 0) goto L_0x00b8
            goto L_0x0094
        L_0x00a7:
            java.lang.String r1 = "statusCode"
            boolean r1 = r10.has(r1)     // Catch:{ JSONException -> 0x00d8 }
            if (r1 == 0) goto L_0x00b8
            java.lang.String r1 = "statusCode"
            int r10 = r10.optInt(r1)     // Catch:{ JSONException -> 0x00d8 }
            if (r10 == 0) goto L_0x00b8
            goto L_0x0094
        L_0x00b8:
            java.lang.Boolean r10 = java.lang.Boolean.valueOf(r3)     // Catch:{ JSONException -> 0x00d8 }
            boolean r1 = r10.booleanValue()     // Catch:{ JSONException -> 0x00d8 }
            if (r1 == 0) goto L_0x00c3
            goto L_0x00c4
        L_0x00c3:
            r10 = r2
        L_0x00c4:
            if (r10 == 0) goto L_0x00d8
            r10.booleanValue()     // Catch:{ JSONException -> 0x00d8 }
            com.ss.android.ugc.aweme.af.a.c r10 = new com.ss.android.ugc.aweme.af.a.c     // Catch:{ JSONException -> 0x00d8 }
            java.lang.String r1 = "api_error"
            java.lang.Exception r3 = new java.lang.Exception     // Catch:{ JSONException -> 0x00d8 }
            r3.<init>(r0)     // Catch:{ JSONException -> 0x00d8 }
            java.lang.Throwable r3 = (java.lang.Throwable) r3     // Catch:{ JSONException -> 0x00d8 }
            r10.<init>(r1, r3)     // Catch:{ JSONException -> 0x00d8 }
            goto L_0x00d9
        L_0x00d8:
            r10 = r2
        L_0x00d9:
            java.lang.Object r9 = r9.mo34e()
            android.support.v4.f.k r9 = (android.support.p030v4.p038f.C0794k) r9
            S r9 = r9.f2712b
            com.ss.android.ugc.aweme.af.a.b r9 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22493b) r9
            if (r9 == 0) goto L_0x0111
            com.ss.android.ugc.aweme.crossplatform.b.c r0 = com.p683ss.android.ugc.aweme.crossplatform.p1613b.C27131c.C27132a.m65458a()
            java.lang.String r1 = r0.f71579c
            if (r1 == 0) goto L_0x00fb
            java.lang.String r2 = "sessionId"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.af.a.l> r0 = r0.f71580d
            java.lang.Object r0 = r0.get(r1)
            r2 = r0
            com.ss.android.ugc.aweme.af.a.l r2 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l) r2
        L_0x00fb:
            if (r2 == 0) goto L_0x0110
            java.lang.Class<com.ss.android.ugc.aweme.af.a.r> r0 = com.p683ss.android.ugc.aweme.p1328af.p1329a.C22528r.class
            com.ss.android.ugc.aweme.af.a.t r0 = r2.mo46870a(r0)
            com.ss.android.ugc.aweme.af.a.r r0 = (com.p683ss.android.ugc.aweme.p1328af.p1329a.C22528r) r0
            if (r0 == 0) goto L_0x0110
            java.lang.String r1 = "apiRequest"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r1)
            r0.mo46855a(r9, r10)
            goto L_0x0111
        L_0x0110:
            return
        L_0x0111:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule.continueWith(a.i, com.bytedance.ies.bullet.kit.rn.core.a):void");
    }

    @BulletMethod
    public final void openSchema(String str, String str2, C10461a aVar) {
        if (str != null) {
            new Handler(Looper.getMainLooper()).post(new C24341c(this, str, str2, aVar));
        }
    }

    @BulletMethod
    public final void request(String str, Map<String, ? extends Object> map, C10461a aVar) {
        boolean z;
        boolean z2;
        boolean z3;
        CharSequence charSequence = str;
        if (charSequence == null || charSequence.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z && map != null && map.get(FIELD_METHOD) != null) {
            HashMap hashMap = new HashMap();
            List arrayList = new ArrayList();
            C52727e eVar = new C52727e();
            eVar.element = null;
            Object obj = map.get("header");
            if (!(obj instanceof HashMap)) {
                obj = null;
            }
            HashMap hashMap2 = (HashMap) obj;
            if (hashMap2 != null) {
                for (Entry entry : hashMap2.entrySet()) {
                    Object value = entry.getValue();
                    if (value != null) {
                        T a = C10468a.f27870a.mo18536a(value);
                        if (((CharSequence) a).length() > 0) {
                            z3 = true;
                        } else {
                            z3 = false;
                        }
                        if (!z3) {
                            a = null;
                        }
                        if (a != null) {
                            arrayList.add(new C12685b((String) entry.getKey(), a));
                            if (C52830p.m112406a("content-type", (String) entry.getKey(), true)) {
                                eVar.element = a;
                            }
                        }
                    }
                }
            }
            Object obj2 = map.get(FIELD_PARAMS);
            if (!(obj2 instanceof HashMap)) {
                obj2 = null;
            }
            HashMap hashMap3 = (HashMap) obj2;
            if (hashMap3 != null) {
                for (Entry entry2 : hashMap3.entrySet()) {
                    Object value2 = entry2.getValue();
                    if (value2 != null) {
                        String a2 = C10468a.f27870a.mo18536a(value2);
                        if (a2.length() > 0) {
                            z2 = true;
                        } else {
                            z2 = false;
                        }
                        if (!z2) {
                            a2 = null;
                        }
                        if (a2 != null) {
                            hashMap.put(entry2.getKey(), a2);
                        }
                    }
                }
            }
            C24342d dVar = new C24342d(this, str, map, hashMap, eVar, arrayList);
            C0013i.m16a((Callable<TResult>) dVar).mo20a((C0011g<TResult, TContinuationResult>) new C24343e<TResult,TContinuationResult>(this, aVar), C0013i.f25b);
        }
    }

    private final C52860x reportCallback(C10461a aVar, Integer num, String str, Map<String, ? extends Object> map) {
        if (aVar == null) {
            return null;
        }
        Map linkedHashMap = new LinkedHashMap();
        linkedHashMap.put("code", num);
        linkedHashMap.put("message", str);
        linkedHashMap.put("data", map);
        aVar.mo18526a(linkedHashMap);
        return C52860x.f131107a;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:74:0x01ca, code lost:
        if (r11 == null) goto L_0x01cc;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final android.support.p030v4.p038f.C0794k<java.lang.String, com.p683ss.android.ugc.aweme.p1328af.p1329a.C22493b> callInBackground(java.lang.String r8, java.util.Map<java.lang.String, ? extends java.lang.Object> r9, java.util.HashMap<java.lang.String, java.lang.Object> r10, java.lang.String r11, java.util.List<com.bytedance.retrofit2.p830a.C12685b> r12) {
        /*
            r7 = this;
            com.ss.android.common.util.i r0 = new com.ss.android.common.util.i
            r0.<init>(r8)
            java.util.List<com.ss.android.http.a.b.e> r8 = r0.f52131a
            java.util.Iterator r8 = r8.iterator()
        L_0x000b:
            boolean r1 = r8.hasNext()
            r2 = 1
            r3 = 0
            if (r1 == 0) goto L_0x002c
            java.lang.Object r1 = r8.next()
            com.ss.android.http.a.b.e r1 = (com.p683ss.android.http.p1169a.p1172b.C19180e) r1
            java.lang.String r4 = "request_tag_from"
            java.lang.String r5 = "pair"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r5)
            java.lang.String r1 = r1.mo39131a()
            boolean r1 = p2628d.p2650m.C52830p.m112406a(r4, r1, r2)
            if (r1 == 0) goto L_0x000b
            r8 = 1
            goto L_0x002d
        L_0x002c:
            r8 = 0
        L_0x002d:
            if (r8 != 0) goto L_0x0036
            java.lang.String r8 = "request_tag_from"
            java.lang.String r1 = "rn"
            r0.mo38778a(r8, r1)
        L_0x0036:
            java.lang.String r8 = "method"
            java.lang.Object r8 = r9.get(r8)
            if (r8 == 0) goto L_0x0204
            java.lang.String r8 = (java.lang.String) r8
            if (r8 == 0) goto L_0x01fc
            java.lang.String r8 = r8.toUpperCase()
            java.lang.String r9 = "(this as java.lang.String).toUpperCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            java.lang.String r9 = ""
            r1 = 0
            int r4 = r8.hashCode()
            r5 = 70454(0x11336, float:9.8727E-41)
            if (r4 == r5) goto L_0x0163
            r5 = 79599(0x136ef, float:1.11542E-40)
            if (r4 == r5) goto L_0x013f
            r5 = 2461856(0x2590a0, float:3.449795E-39)
            if (r4 == r5) goto L_0x00dc
            r9 = 2012838315(0x77f979ab, float:1.0119919E34)
            if (r4 != r9) goto L_0x01f2
            java.lang.String r9 = "DELETE"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x01f2
            java.util.ArrayList r9 = new java.util.ArrayList
            r9.<init>()
            java.util.List r9 = (java.util.List) r9
            if (r10 == 0) goto L_0x00c0
            java.util.Iterator r11 = r12.iterator()
        L_0x007b:
            boolean r12 = r11.hasNext()
            if (r12 == 0) goto L_0x0094
            java.lang.Object r12 = r11.next()
            com.bytedance.retrofit2.a.b r12 = (com.bytedance.retrofit2.p830a.C12685b) r12
            com.bytedance.retrofit2.a.b r4 = new com.bytedance.retrofit2.a.b
            java.lang.String r5 = r12.f33318a
            java.lang.String r12 = r12.f33319b
            r4.<init>(r5, r12)
            r9.add(r4)
            goto L_0x007b
        L_0x0094:
            java.util.Map r10 = (java.util.Map) r10
            java.util.Set r10 = r10.entrySet()
            java.util.Iterator r10 = r10.iterator()
        L_0x009e:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x00c0
            java.lang.Object r11 = r10.next()
            java.util.Map$Entry r11 = (java.util.Map.Entry) r11
            java.lang.Object r12 = r11.getValue()
            if (r12 == 0) goto L_0x009e
            java.lang.Object r11 = r11.getKey()
            java.lang.String r11 = (java.lang.String) r11
            com.bytedance.ies.bullet.kit.rn.d.a r4 = com.bytedance.ies.bullet.kit.p644rn.p647d.C10468a.f27870a
            java.lang.String r12 = r4.mo18536a(r12)
            r0.mo38778a(r11, r12)
            goto L_0x009e
        L_0x00c0:
            java.lang.String r10 = r0.toString()
            java.lang.String r11 = "urlBuilder.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            com.ss.android.ugc.aweme.net.CommonApi r11 = r7.sApi
            com.bytedance.retrofit2.b r9 = r11.doDelete(r10, r3, r9)
            com.bytedance.retrofit2.u r9 = r9.execute()
            T r9 = r9.f33552b
            java.lang.String r9 = (java.lang.String) r9
        L_0x00d7:
            r6 = r10
            r10 = r9
            r9 = r6
            goto L_0x01b0
        L_0x00dc:
            java.lang.String r4 = "POST"
            boolean r4 = r8.equals(r4)
            if (r4 == 0) goto L_0x01f2
            if (r10 == 0) goto L_0x00ec
            java.util.Map r10 = (java.util.Map) r10
            org.json.JSONObject r1 = com.bytedance.ies.bullet.kit.p644rn.p647d.C10468a.m21018a(r10)
        L_0x00ec:
            if (r11 == 0) goto L_0x00f6
            com.ss.android.ugc.aweme.utils.dg r10 = com.p683ss.android.ugc.aweme.utils.C47809dg.f120359a
            java.lang.String r10 = r10.mo95052b(r9, r1, r11, r12)
            goto L_0x01b0
        L_0x00f6:
            java.util.HashMap r9 = new java.util.HashMap
            r9.<init>()
            if (r1 == 0) goto L_0x0122
            java.util.Iterator r10 = r1.keys()
        L_0x0101:
            boolean r11 = r10.hasNext()
            if (r11 == 0) goto L_0x0122
            java.lang.Object r11 = r10.next()
            java.lang.String r11 = (java.lang.String) r11
            r12 = r9
            java.util.Map r12 = (java.util.Map) r12
            java.lang.String r4 = "key"
            p2628d.p2639f.p2641b.C52711k.m112236a(r11, r4)
            java.lang.String r4 = r1.optString(r11)
            java.lang.String r5 = "json.optString(key)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r4, r5)
            r12.put(r11, r4)
            goto L_0x0101
        L_0x0122:
            java.lang.String r10 = r0.toString()
            java.lang.String r11 = "urlBuilder.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r10, r11)
            java.util.Map r9 = (java.util.Map) r9
            com.p683ss.android.common.applog.NetUtil.putCommonParams(r9, r2)
            com.ss.android.ugc.aweme.net.CommonApi r11 = r7.sApi
            com.bytedance.retrofit2.b r9 = r11.doPost(r10, r3, r9)
            com.bytedance.retrofit2.u r9 = r9.execute()
            T r9 = r9.f33552b
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x00d7
        L_0x013f:
            java.lang.String r9 = "PUT"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x01f2
            if (r10 == 0) goto L_0x014f
            java.util.Map r10 = (java.util.Map) r10
            org.json.JSONObject r1 = com.bytedance.ies.bullet.kit.p644rn.p647d.C10468a.m21018a(r10)
        L_0x014f:
            java.lang.String r9 = r0.toString()
            java.lang.String r10 = "urlBuilder.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            com.ss.android.ugc.aweme.utils.dg r10 = com.p683ss.android.ugc.aweme.utils.C47809dg.f120359a
            if (r11 != 0) goto L_0x015e
            java.lang.String r11 = "application/x-www-form-urlencoded"
        L_0x015e:
            java.lang.String r10 = r10.mo95051a(r9, r1, r11, r12)
            goto L_0x01b0
        L_0x0163:
            java.lang.String r9 = "GET"
            boolean r9 = r8.equals(r9)
            if (r9 == 0) goto L_0x01f2
            if (r10 == 0) goto L_0x0199
            java.util.Map r10 = (java.util.Map) r10
            java.util.Set r9 = r10.entrySet()
            java.util.Iterator r9 = r9.iterator()
        L_0x0177:
            boolean r10 = r9.hasNext()
            if (r10 == 0) goto L_0x0199
            java.lang.Object r10 = r9.next()
            java.util.Map$Entry r10 = (java.util.Map.Entry) r10
            java.lang.Object r11 = r10.getValue()
            if (r11 == 0) goto L_0x0177
            java.lang.Object r10 = r10.getKey()
            java.lang.String r10 = (java.lang.String) r10
            com.bytedance.ies.bullet.kit.rn.d.a r12 = com.bytedance.ies.bullet.kit.p644rn.p647d.C10468a.f27870a
            java.lang.String r11 = r12.mo18536a(r11)
            r0.mo38778a(r10, r11)
            goto L_0x0177
        L_0x0199:
            java.lang.String r9 = r0.toString()
            java.lang.String r10 = "urlBuilder.toString()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r9, r10)
            com.ss.android.ugc.aweme.net.CommonApi r10 = r7.sApi
            com.bytedance.retrofit2.b r10 = r10.doGet(r9, r3)
            com.bytedance.retrofit2.u r10 = r10.execute()
            T r10 = r10.f33552b
            java.lang.String r10 = (java.lang.String) r10
        L_0x01b0:
            java.lang.String r11 = ""
            boolean r11 = p2628d.p2639f.p2641b.C52711k.m112239a(r9, r11)
            r11 = r11 ^ r2
            if (r11 == 0) goto L_0x01e1
            if (r8 == 0) goto L_0x01d9
            java.lang.String r8 = r8.toLowerCase()
            java.lang.String r11 = "(this as java.lang.String).toLowerCase()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r11)
            if (r1 == 0) goto L_0x01cc
            java.lang.String r11 = r1.toString()
            if (r11 != 0) goto L_0x01ce
        L_0x01cc:
            java.lang.String r11 = ""
        L_0x01ce:
            com.ss.android.ugc.aweme.af.a.b r12 = new com.ss.android.ugc.aweme.af.a.b
            r12.<init>(r9, r8, r11)
            android.support.v4.f.k r8 = new android.support.v4.f.k
            r8.<init>(r10, r12)
            return r8
        L_0x01d9:
            d.u r8 = new d.u
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.String"
            r8.<init>(r9)
            throw r8
        L_0x01e1:
            android.support.v4.f.k r8 = new android.support.v4.f.k
            com.ss.android.ugc.aweme.af.a.b r9 = new com.ss.android.ugc.aweme.af.a.b
            java.lang.String r11 = ""
            java.lang.String r12 = ""
            java.lang.String r0 = ""
            r9.<init>(r11, r12, r0)
            r8.<init>(r10, r9)
            return r8
        L_0x01f2:
            java.lang.Exception r8 = new java.lang.Exception
            java.lang.String r9 = "method should be in [GET, POST, PUT, DELETE]"
            r8.<init>(r9)
            java.lang.Throwable r8 = (java.lang.Throwable) r8
            throw r8
        L_0x01fc:
            d.u r8 = new d.u
            java.lang.String r9 = "null cannot be cast to non-null type java.lang.String"
            r8.<init>(r9)
            throw r8
        L_0x0204:
            d.u r8 = new d.u
            java.lang.String r9 = "null cannot be cast to non-null type kotlin.String"
            r8.<init>(r9)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule.callInBackground(java.lang.String, java.util.Map, java.util.HashMap, java.lang.String, java.util.List):android.support.v4.f.k");
    }

    static /* synthetic */ C52860x reportCallback$default(RNCommonModule rNCommonModule, C10461a aVar, Integer num, String str, Map map, int i, Object obj) {
        if ((i & 4) != 0) {
            str = null;
        }
        if ((i & 8) != 0) {
            map = null;
        }
        return rNCommonModule.reportCallback(aVar, num, str, map);
    }
}
