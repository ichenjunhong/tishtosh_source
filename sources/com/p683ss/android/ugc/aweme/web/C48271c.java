package com.p683ss.android.ugc.aweme.web;

import android.content.Context;
import android.text.TextUtils;
import com.bytedance.ies.p675g.p676a.C10757a;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.p683ss.android.sdk.webview.C19749d;
import com.p683ss.android.sdk.webview.C19750e;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService;
import com.p683ss.android.ugc.aweme.commerce.wxnimipay.WXMiniPayMethod;
import com.p683ss.android.ugc.aweme.commercialize.link.LinkAuthBridgeGet;
import com.p683ss.android.ugc.aweme.commercialize.link.LinkAuthBridgeSet;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26384ak;
import com.p683ss.android.ugc.aweme.discover.p1659ui.DeleteSearchHistory;
import com.p683ss.android.ugc.aweme.discover.p1659ui.GetABTest;
import com.p683ss.android.ugc.aweme.discover.p1659ui.GetSearchHistory;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.C28695c;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.DisableInterceptMethod;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.OpenConfirmAlertMethod;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.PerformanceMonitorMethod;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.SearchKeywordChangeMethod;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.ShowEasterEggMethod;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.SuicidePreventMethod;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.OnLoadMoreRequestMethod;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.jsbridge.detail.OpenDetailVideoListMethod;
import com.p683ss.android.ugc.aweme.live.jsb.LiveMethod;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22493b;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22505c;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22521l;
import com.p683ss.android.ugc.aweme.p1328af.p1329a.C22524n;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.AppInfoMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.BroadcastMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29859c;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29879d;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29881e;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29910p;
import com.p683ss.android.ugc.aweme.p1706fe.method.ChooseArticleInfoMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.CloseMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.ComponentDidMountMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.DarkModeMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.DisableGestureClose;
import com.p683ss.android.ugc.aweme.p1706fe.method.DownloadFileMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.EnterUserPostFeedsMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.FestivalShareMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.GetMicroAppInfoMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.GetNativeItemMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.GetSettingsMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.GetWebViewInfo;
import com.p683ss.android.ugc.aweme.p1706fe.method.JsAppDownloadMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.JumpToLiveMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.LaunchChatMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.LoadFeedsFlowMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.LoadFeedsMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.LoginMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.MakeCallMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.MiniAppPreloadMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.NoticePermissionMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.OnBackPressedMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.OpenAwemeDetailMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.OpenBrowserMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.OpenConversationMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.OpenFeedsFlowMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.OpenMapMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.OpenMediumChallengeDetailMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.OpenSchemaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.OpenShortVideoMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.PayMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.PreparePayMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.ReportCustomEventMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.RequestAddressBookPermission;
import com.p683ss.android.ugc.aweme.p1706fe.method.RequestPermissionMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.RoutePopMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.RoutePushMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.SendLogMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.SendLogV3Method;
import com.p683ss.android.ugc.aweme.p1706fe.method.SetNativeItemMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.ShareMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.ShareRankMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.ShowDmtToastMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.ShowPoiSpuAwemeMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.ShowToastMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.TokenShareMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.UpdateAppVersionMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.UploadContactsMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.UserInfoMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.cjpay.CJModalViewMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.cjpay.CJOpenH5Method;
import com.p683ss.android.ugc.aweme.p1706fe.method.cjpay.CJPrefetchMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.commerce.FetchFeedsAwemeDataMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.commerce.GetGoodsInfoMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.commerce.JumpToTaobaoBindMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.commerce.JumpToTaobaoCouponMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.commerce.OpenECommerceLegalModalMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.commerce.OpenGoodDetailMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.commerce.OpenTaobaoGoodMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.commerce.RefreshNavTitleMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.commerce.TaoCommandMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.commerce.VideoPublishMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.douplus.DouplusShowResultMethod;
import com.p683ss.android.ugc.aweme.p1706fe.method.p1711im.ShareWebToChatMethod;
import com.p683ss.android.ugc.aweme.sdk.IWalletService;
import com.p683ss.android.ugc.aweme.sdk.Wallet.DEFAULT;
import com.p683ss.android.ugc.aweme.web.jsbridge.AdCommonJsMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.AdThirdTrackMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.AsyncGoodsEditInfoMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48299a;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48325aa;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48328ab;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48329ac;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48330ad;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48331ae;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48333af;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48335ah;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48337ai;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48338aj;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48339b;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48341c;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48343e;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48346f;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48348h;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48352k;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48353l;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48354m;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48355n;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48359q;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48360r;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48363u;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48365v;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48366w;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48368x;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48369y;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48370z;
import com.p683ss.android.ugc.aweme.web.jsbridge.CheckSmsAppMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.CloseJuStickerWindowMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.CloseWebViewLoadingMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.CopyMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.DidLoadFinishMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.FeedbackUploadALog;
import com.p683ss.android.ugc.aweme.web.jsbridge.GalleryPreviewMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.IsAppInstalledMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.MonitorLogMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.OpenLongVideoMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.OpenPhoneAreaMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.OpenPorAccountMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.OpenThirdLoginVerifyMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.ShowPoiOrderRateDialogMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.UpdateNavBarMethod;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48307b;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48308c;
import com.p683ss.android.ugc.aweme.web.jsbridge.p2401a.C48305a.C48309d;
import com.p683ss.android.ugc.aweme.web.p2397a.C48265a;
import com.p683ss.android.ugc.aweme.web.p2397a.C48266b;
import java.lang.ref.WeakReference;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.web.c */
public final class C48271c extends C48373l implements C48279i {

    /* renamed from: s */
    public C22521l f121478s;

    /* renamed from: t */
    private IAmeJsMessageHandlerService f121479t = AmeJsMessageHandlerServiceImpl.createIAmeJsMessageHandlerServicebyMonsterPlugin();

    /* renamed from: u */
    private C48280j f121480u;

    /* renamed from: v */
    private final C48308c f121481v = new C48308c() {
        /* renamed from: a */
        public final void mo49921a(C48307b bVar, C48309d dVar) {
            C22493b bVar2;
            int i;
            String str;
            String str2;
            String str3;
            if (bVar == null) {
                bVar2 = new C22493b("", "", "");
            } else {
                if (bVar.f121541b == null) {
                    str = "";
                } else {
                    str = bVar.f121541b;
                }
                if (bVar.f121540a == null) {
                    str2 = "";
                } else {
                    str2 = bVar.f121540a;
                }
                if (bVar.f121542c == null) {
                    str3 = "";
                } else {
                    str3 = bVar.f121542c.toString();
                }
                bVar2 = new C22493b(str, str2, str3);
            }
            C22505c cVar = null;
            if (dVar != null) {
                if (dVar.f121544b != null) {
                    cVar = new C22505c("network_error", dVar.f121544b);
                } else if (dVar.f121543a != null) {
                    boolean z = true;
                    if (!dVar.f121543a.has("message") || "success".equals(dVar.f121543a.optString("message"))) {
                        if (dVar.f121543a.has("code")) {
                            i = dVar.f121543a.optInt("code");
                        } else if (dVar.f121543a.has("status_code")) {
                            i = dVar.f121543a.optInt("status_code");
                        } else if (dVar.f121543a.has("statusCode")) {
                            i = dVar.f121543a.optInt("statusCode");
                        } else {
                            i = 0;
                        }
                        if (i == 0) {
                            z = false;
                        }
                    }
                    if (z) {
                        cVar = new C22505c("api_error", new Exception(dVar.f121543a.toString()));
                    }
                }
            }
            if (C48271c.this.f121478s != null && C48271c.this.f121478s.f60539c) {
                C22524n nVar = (C22524n) C48271c.this.f121478s.mo46870a(C22524n.class);
                if (nVar != null) {
                    nVar.mo46855a(bVar2, cVar);
                }
            }
        }
    };

    /* renamed from: c */
    public final List<String> mo41160c() {
        this.f54379f = C48372k.f121668a;
        return this.f54379f;
    }

    /* renamed from: b */
    public final List<String> mo41157b() {
        super.mo41157b();
        this.f54377d.add("sendLog");
        this.f54377d.add("openSchoolEdit");
        this.f54377d.add("formDialogClose");
        this.f54377d.add("openSchoolEdit");
        this.f54377d.add("orderResult");
        return this.f54377d;
    }

    /* renamed from: a */
    public final void mo41201a(C22521l lVar) {
        this.f121478s = lVar;
    }

    /* renamed from: a */
    public final void mo95778a(C48280j jVar) {
        this.f121480u = jVar;
    }

    /* renamed from: c */
    public final void mo95779c(String str) {
        if (this.f121480u != null) {
            this.f121480u.mo54144a(str);
        }
    }

    public C48271c(Context context) {
        super(context);
    }

    /* renamed from: a */
    public final void mo41155a(JSONObject jSONObject) throws Exception {
        super.mo41155a(jSONObject);
        if (!TextUtils.equals(this.f54388o, "1") || TextUtils.isEmpty(this.f54389p)) {
            C26384ak.f69607d.mo54105a(this.f54380g, this.f54383j);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:11:0x002e A[Catch:{ Exception -> 0x003d }, RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:12:0x002f A[Catch:{ Exception -> 0x003d }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo41156a(java.lang.String r4) {
        /*
            r3 = this;
            boolean r0 = com.p683ss.android.newmedia.C19547d.m47842a(r4)
            r1 = 0
            if (r0 != 0) goto L_0x0008
            return r1
        L_0x0008:
            int r0 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x003d }
            r2 = 27
            if (r0 >= r2) goto L_0x0024
            r0 = 92
            int r0 = r4.indexOf(r0)     // Catch:{ Exception -> 0x003d }
            r2 = -1
            if (r0 == r2) goto L_0x0024
            java.lang.String r0 = r4.substring(r1, r0)     // Catch:{ Exception -> 0x003d }
            android.net.Uri r0 = android.net.Uri.parse(r0)     // Catch:{ Exception -> 0x003d }
            java.lang.String r0 = r0.getHost()     // Catch:{ Exception -> 0x003d }
            goto L_0x002c
        L_0x0024:
            android.net.Uri r0 = android.net.Uri.parse(r4)     // Catch:{ Exception -> 0x003d }
            java.lang.String r0 = r0.getHost()     // Catch:{ Exception -> 0x003d }
        L_0x002c:
            if (r0 != 0) goto L_0x002f
            return r1
        L_0x002f:
            com.ss.android.ugc.aweme.web.IAmeJsMessageHandlerService r1 = r3.f121479t     // Catch:{ Exception -> 0x003d }
            if (r1 == 0) goto L_0x003d
            com.ss.android.ugc.aweme.web.IAmeJsMessageHandlerService r1 = r3.f121479t     // Catch:{ Exception -> 0x003d }
            boolean r0 = r1.isSafeDomain(r0)     // Catch:{ Exception -> 0x003d }
            if (r0 == 0) goto L_0x003d
            r4 = 1
            return r4
        L_0x003d:
            boolean r4 = super.mo41156a(r4)
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.web.C48271c.mo41156a(java.lang.String):boolean");
    }

    /* renamed from: b */
    public final void mo41158b(C19750e eVar, C19749d dVar) {
        IBridgeService bridgeService_Monster = I18nBridgeService.getBridgeService_Monster();
        if (bridgeService_Monster != null) {
            C10762d polarisMethod = bridgeService_Monster.getPolarisMethod(eVar, mo41161d());
            if (polarisMethod != null) {
                List<String> polarisMethodNames = bridgeService_Monster.getPolarisMethodNames(polarisMethod);
                if (polarisMethodNames != null) {
                    for (String str : polarisMethodNames) {
                        if (!TextUtils.isEmpty(str)) {
                            eVar.mo41185a(str, polarisMethod);
                        }
                    }
                }
            }
        }
        if (this.f121479t != null) {
            this.f121479t.registerJavaMethod(eVar, this.f54376c, mo41161d());
        }
        C10757a aVar = eVar.f54416b;
        eVar.mo41185a("close", (C10762d) new CloseMethod(aVar).mo60035a(this.f54376c)).mo41185a("userInfo", (C10762d) new UserInfoMethod(aVar).mo60035a(this.f54376c)).mo41185a("darkMode", (C10762d) new DarkModeMethod(aVar).mo60035a(this.f54376c)).mo41185a("updateAppVersion", (C10762d) new UpdateAppVersionMethod(aVar).mo60035a(this.f54376c)).mo41185a("sendLog", (C10762d) new SendLogMethod(aVar).mo60035a(this.f54376c)).mo41185a("sendLogV3", (C10762d) new SendLogV3Method(aVar).mo60035a(this.f54376c)).mo41185a("openSchema", (C10762d) new OpenSchemaMethod(aVar).mo60035a(this.f54376c)).mo41185a("share", (C10762d) new ShareMethod(aVar).mo60035a(this.f54376c)).mo41185a("showToast", (C10762d) new ShowToastMethod(aVar).mo60035a(this.f54376c)).mo41185a("openBrowser", (C10762d) new OpenBrowserMethod(aVar).mo60035a(this.f54376c)).mo41185a("CJPrefetch", (C10762d) new CJPrefetchMethod(aVar).mo60035a(this.f54376c)).mo41185a("CJModalView", (C10762d) new CJModalViewMethod(aVar).mo60035a(this.f54376c)).mo41185a("CJOpen", (C10762d) new CJOpenH5Method(aVar).mo60035a(this.f54376c)).mo41185a("appInfo", (C10762d) new AppInfoMethod(aVar).mo60035a(this.f54376c)).mo41185a("componentDidMount", (C10762d) new ComponentDidMountMethod(aVar).mo60035a(this.f54376c)).mo41185a("componentDidMount", (C10762d) new ComponentDidMountMethod(aVar).mo60035a(this.f54376c)).mo41185a("routePush", (C10762d) new RoutePushMethod(aVar).mo60034a(dVar)).mo41185a("open_short_video", (C10762d) new OpenShortVideoMethod(aVar).mo60035a(this.f54376c)).mo41185a("open_long_video", (C10762d) new OpenLongVideoMethod(aVar).mo60035a(this.f54376c)).mo41185a("openFeedsFlow", (C10762d) new OpenFeedsFlowMethod(aVar).mo60035a(this.f54376c)).mo41185a("openAwemeDetail", (C10762d) new OpenAwemeDetailMethod(aVar).mo60035a(this.f54376c)).mo41185a("loadFeeds", (C10762d) new LoadFeedsMethod(aVar).mo60035a(this.f54376c)).mo41185a("loadFeedsFlow", (C10762d) new LoadFeedsFlowMethod(aVar).mo60035a(this.f54376c)).mo41185a("downloadMedia", (C10762d) new DownloadFileMethod(aVar).mo60035a(this.f54376c)).mo41185a("publishMedia", (C10762d) new VideoPublishMethod(aVar).mo60035a(this.f54376c)).mo41185a("routePop", (C10762d) new RoutePopMethod(aVar).mo60034a(dVar)).mo41185a("reportCustomEvent", (C10762d) new ReportCustomEventMethod(aVar).mo60034a(dVar));
        new C48266b();
        new C48265a(aVar, eVar, this.f54376c);
        C10757a aVar2 = eVar.f54416b;
        BaseCommonJavaMethod a = new JsAppDownloadMethod(aVar2).mo60035a(this.f54376c);
        eVar.mo41185a("login", (C10762d) new LoginMethod(aVar2, false).mo60035a(this.f54376c)).mo41185a("loginWithPlatform", (C10762d) new LoginMethod(aVar2, true).mo60035a(this.f54376c)).mo41185a("apiParam", (C10762d) new C48341c()).mo41185a("openAweme", (C10762d) new C48343e(this.f54376c, aVar2)).mo41185a("openRecord", (C10762d) new C48331ae(this.f54376c, aVar2)).mo41185a("publishVideo", (C10762d) new C48329ac(this.f54376c, aVar2)).mo41185a("bindPhone", (C10762d) new C48346f(aVar2, this.f54376c)).mo41185a("enterUserFeed", (C10762d) new EnterUserPostFeedsMethod(aVar2).mo60035a(this.f54376c)).mo41185a("noticePermission", (C10762d) new NoticePermissionMethod(aVar2).mo60035a(this.f54376c)).mo41185a("fetch", (C10762d) new C48359q(aVar2, this.f121481v)).mo41185a("selectLocation", (C10762d) new C48333af(aVar2, this.f54376c)).mo41185a("openSysDialog", (C10762d) new C48325aa(this.f54376c, aVar2)).mo41185a("uploadFile", (C10762d) new C29881e(this.f54376c, aVar2)).mo41185a("uploadBusinessLicense", (C10762d) new C29910p(this.f54376c, aVar2)).mo41185a("downloadApp", (C10762d) new C48355n(this.f54376c)).mo41185a("stickGame", (C10762d) new C48337ai()).mo41185a("formDialogClose", (C10762d) new C48353l()).mo41185a("dpDisableGestureClose", (C10762d) new DisableGestureClose(aVar2)).mo41185a("subscribe_app_ad", (C10762d) a).mo41185a("unsubscribe_app_ad", (C10762d) a).mo41185a("download_app_ad", (C10762d) a).mo41185a("cancel_download_app_ad", (C10762d) a).mo41185a("get_download_pause_task", (C10762d) a).mo41185a("get_downloading_task", (C10762d) a).mo41185a("get_install_status", (C10762d) a).mo41185a("getLinkedEmailResult", (C10762d) new C48363u()).mo41185a("openSms", (C10762d) new C48370z(this.f54376c)).mo41185a("isSmsAvailable", (C10762d) new CheckSmsAppMethod(this.f54376c, aVar2)).mo41185a("show_poi_rate", (C10762d) new ShowPoiOrderRateDialogMethod(this.f54376c)).mo41185a("show_poi_spu_rate_aweme", (C10762d) new ShowPoiSpuAwemeMethod(this.f54376c)).mo41185a("accountLogout", (C10762d) new C48365v()).mo41185a("jumpOpenAuthPage", (C10762d) new C48366w(this.f54376c, aVar2)).mo41185a("showOpenAuth", (C10762d) new C48335ah(this.f54376c, aVar2)).mo41185a("getCurrentLocation", (C10762d) new C48360r(this.f54376c, aVar2)).mo41185a("launchChat", (C10762d) new LaunchChatMethod().mo60035a(this.f54376c)).mo41185a("enterHashtagFeed", (C10762d) new OpenMediumChallengeDetailMethod().mo60035a(this.f54376c)).mo41185a("showDmtToast", (C10762d) new ShowDmtToastMethod().mo60035a(this.f54376c)).mo41185a("receiveCoupon", (C10762d) new C48330ad()).mo41185a("getThirdLoginToken", (C10762d) new OpenThirdLoginVerifyMethod(aVar2).mo60035a(this.f54376c)).mo41185a("scan", (C10762d) new C48368x(this.f54376c)).mo41185a("copy", (C10762d) new CopyMethod(this.f54374a.f54416b, this.f54376c)).mo41185a("gallery", (C10762d) new GalleryPreviewMethod(aVar2).mo60035a(this.f54376c)).mo41185a("openSchoolEdit", (C10762d) new C48369y(this.f54376c)).mo41185a("broadcast", (C10762d) new BroadcastMethod()).mo41185a("openLiveRoom", (C10762d) new LiveMethod(this.f54376c, aVar2)).mo41185a("setNativeItem", (C10762d) new SetNativeItemMethod(aVar2)).mo41185a("getNativeItem", (C10762d) new GetNativeItemMethod(aVar2)).mo41185a("deleteSearchHistory", (C10762d) new DeleteSearchHistory(aVar2)).mo41185a("getSearchHistory", (C10762d) new GetSearchHistory(aVar2)).mo41185a("getABTestParams", (C10762d) new GetABTest(aVar2)).mo41185a("getSettings", (C10762d) new GetSettingsMethod(aVar2)).mo41185a("getLinkData", (C10762d) new LinkAuthBridgeGet(aVar2)).mo41185a("setLinkData", (C10762d) new LinkAuthBridgeSet(aVar2)).mo41185a("captureWebView", (C10762d) new C48348h(this.f54376c, aVar2)).mo41185a("orderResult", (C10762d) new C48328ab()).mo41185a("isAppInstall", (C10762d) new IsAppInstalledMethod(aVar2)).mo41185a("shareRank", (C10762d) new ShareRankMethod(aVar2).mo60035a(this.f54376c)).mo41185a("appSetting", (C10762d) new C48338aj(this.f54376c, aVar2)).mo41185a("closeKrCopyright", (C10762d) new C48354m()).mo41185a("miniGamePayResult", (C10762d) new C48352k(this.f54376c)).mo41185a("uploadALog", (C10762d) new FeedbackUploadALog(aVar2)).mo41185a("monitorLog", (C10762d) new MonitorLogMethod()).mo41185a("mpinfo", (C10762d) new GetMicroAppInfoMethod(aVar2)).mo41185a("setTitle", (C10762d) new RefreshNavTitleMethod(this).mo60035a(this.f54376c)).mo41185a("jumpToLive", (C10762d) new JumpToLiveMethod()).mo41185a("chooseArticleWithInfo", (C10762d) new ChooseArticleInfoMethod(aVar2).mo60035a(this.f54376c)).mo41185a("updateNavBar", (C10762d) new UpdateNavBarMethod()).mo41185a("fileSelection", (C10762d) new C29859c(mo41161d(), aVar2)).mo41185a("internationalRegionalSelection", (C10762d) new C29879d(mo41161d(), aVar2)).mo41185a("preloadMiniApp", (C10762d) new MiniAppPreloadMethod().mo60035a(this.f54376c)).mo41185a("tokenShare", (C10762d) new TokenShareMethod().mo60035a(this.f54376c)).mo41185a("donationShare", (C10762d) new FestivalShareMethod(aVar2).mo60035a(this.f54376c)).mo41185a("onBackPressed", (C10762d) new OnBackPressedMethod(aVar2).mo60035a(this.f54376c)).mo41185a("requestPermission", (C10762d) new RequestPermissionMethod(aVar2).mo60035a(this.f54376c)).mo41185a("preparePay", (C10762d) new PreparePayMethod(aVar2).mo60035a(this.f54376c)).mo41185a("open_poi_map", (C10762d) new OpenMapMethod(aVar2).mo60035a(this.f54376c)).mo41185a("uploadAddressBook", (C10762d) new UploadContactsMethod(mo41161d(), aVar2).mo60035a(this.f54376c)).mo41185a("requestAddressBookPermission", (C10762d) new RequestAddressBookPermission(aVar2).mo60035a(this.f54376c)).mo41185a("choosePhoneArea", (C10762d) new OpenPhoneAreaMethod(aVar2).mo60035a(this.f54376c)).mo41185a("shareWebToChat", (C10762d) new ShareWebToChatMethod(aVar2)).mo41185a("switchToProAccount", (C10762d) new OpenPorAccountMethod(aVar2).mo60035a(this.f54376c));
        eVar.mo41185a("openConversation", (C10762d) new OpenConversationMethod(eVar.f54416b).mo60035a(this.f54376c));
        C10757a aVar3 = eVar.f54416b;
        eVar.mo41185a("makeCall", (C10762d) new MakeCallMethod().mo60035a(this.f54376c)).mo41185a("launchWXMiniPro", (C10762d) new WXMiniPayMethod(aVar3).mo60035a(this.f54376c)).mo41185a("pay", (C10762d) new PayMethod(aVar3).mo60035a(this.f54376c)).mo41185a("asyncGoodsEditInfo", (C10762d) new AsyncGoodsEditInfoMethod().mo60035a(this.f54376c)).mo41185a("getGoodsInfo", (C10762d) new GetGoodsInfoMethod(aVar3).mo60035a(this.f54376c)).mo41185a("jumpTaobaoForBind", (C10762d) new JumpToTaobaoBindMethod(aVar3).mo60035a(this.f54376c)).mo41185a("jumpTaobaoForCoupon", (C10762d) new JumpToTaobaoCouponMethod().mo60035a(this.f54376c)).mo41185a("openTaobaoGood", (C10762d) new OpenTaobaoGoodMethod().mo60035a(this.f54376c)).mo41185a("fetchTaoCommand", (C10762d) new TaoCommandMethod(aVar3).mo60035a(this.f54376c)).mo41185a("purchasePlatformGoods", (C10762d) new OpenGoodDetailMethod().mo60035a(this.f54376c)).mo41185a("openECommerceLegalModal", (C10762d) new OpenECommerceLegalModalMethod().mo60035a(this.f54376c)).mo41185a("fetchFeedsAwemeData", (C10762d) new FetchFeedsAwemeDataMethod().mo60035a(this.f54376c));
        if (eVar != null) {
            C48299a aVar4 = new C48299a(this.f54376c);
            C52711k.m112240b(eVar, "dmtJsBridge");
            C10762d dVar2 = aVar4;
            eVar.mo41185a("getPageData", dVar2).mo41185a("cardClick", dVar2).mo41185a("cardStatus", dVar2).mo41185a("closeCardDialog", dVar2).mo41185a("openHalfScreenForm", dVar2).mo41185a("callNativePhone", dVar2).mo41185a("download_click", dVar2).mo41185a("setCard", dVar2).mo41185a("closeAdModal", dVar2).mo41185a("modalInteractionURL", dVar2).mo41185a("showModalPage", dVar2).mo41185a("setModalSize", dVar2).mo41185a("cardInteriorShow", dVar2);
            aVar4.f121534a = eVar.f54420f.hashCode();
            eVar.mo41185a("closeLoading", (C10762d) new CloseWebViewLoadingMethod(eVar.f54416b)).mo41185a("closeJuStickerWindow", (C10762d) new CloseJuStickerWindowMethod(eVar.f54416b)).mo41185a("didFinishLoad", (C10762d) new DidLoadFinishMethod(eVar.f54416b)).mo41185a("sendThirdTrack", (C10762d) new AdThirdTrackMethod(eVar.f54416b)).mo41185a("getWebViewInfo", (C10762d) new GetWebViewInfo(eVar.f54416b));
            C48339b bVar = new C48339b(eVar.f54416b);
            C10757a aVar5 = bVar.f121623a;
            if (aVar5 != null) {
                C10762d dVar3 = bVar;
                aVar5.mo19450a("openPanel", dVar3);
                aVar5.mo19450a("openLightLandingPage", dVar3);
                aVar5.mo19450a("closeLightLandingPage", dVar3);
            }
            if (!(this.f54376c == null || eVar == null)) {
                WeakReference weakReference = this.f54376c;
                C10757a aVar6 = eVar.f54416b;
                C52711k.m112240b(weakReference, "contextRef");
                C52711k.m112240b(aVar6, "iesJsBridge");
                new AdCommonJsMethod(weakReference, aVar6, null);
            }
        }
        IWalletService provideWalletService_Monster = DEFAULT.provideWalletService_Monster();
        if (provideWalletService_Monster != null) {
            Map buildJavaMethods = provideWalletService_Monster.buildJavaMethods(this.f54376c, eVar.f54416b);
            if (buildJavaMethods != null) {
                for (Entry entry : buildJavaMethods.entrySet()) {
                    eVar.mo41185a((String) entry.getKey(), (C10762d) entry.getValue());
                }
            }
        }
        eVar.mo41185a("dpShowResult", (C10762d) new DouplusShowResultMethod().mo60035a(this.f54376c));
        Map javaMethods = C20854a.m53168h().getJavaMethods(this.f54376c, eVar.f54416b);
        if (javaMethods != null) {
            for (Entry entry2 : javaMethods.entrySet()) {
                eVar.mo41185a((String) entry2.getKey(), (C10762d) entry2.getValue());
            }
        }
        eVar.mo41185a("componentDidMount", (C10762d) new ComponentDidMountMethod(eVar.f54416b));
        WeakReference weakReference2 = this.f54376c;
        C52711k.m112240b(eVar, "dmtJsBridge");
        C52711k.m112240b(weakReference2, "contextRef");
        C10757a aVar7 = eVar.f54416b;
        if (aVar7 != null) {
            eVar.mo41185a(C28695c.f75308a, (C10762d) new OpenDetailVideoListMethod(weakReference2, aVar7));
            eVar.mo41185a(C28695c.f75310c, (C10762d) new OnLoadMoreRequestMethod(aVar7));
            eVar.mo41185a(C28695c.f75312e, (C10762d) new SearchKeywordChangeMethod(aVar7));
            eVar.mo41185a(C28695c.f75313f, (C10762d) new ShowEasterEggMethod(weakReference2, aVar7));
            eVar.mo41185a(C28695c.f75314g, (C10762d) new PerformanceMonitorMethod(weakReference2, aVar7));
            eVar.mo41185a(C28695c.f75315h, (C10762d) new SuicidePreventMethod(weakReference2, aVar7));
            eVar.mo41185a(C28695c.f75316i, (C10762d) new DisableInterceptMethod(weakReference2, aVar7));
            eVar.mo41185a("openConfirmAlert", (C10762d) new OpenConfirmAlertMethod(weakReference2, aVar7));
        }
    }
}
