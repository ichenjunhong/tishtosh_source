package com.p683ss.android.ugc.aweme.poi;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.app.C0643c;
import android.text.TextUtils;
import android.view.View;
import com.bytedance.android.livesdkapi.service.C8862e;
import com.bytedance.ies.geckoclient.C10885e;
import com.bytedance.ies.geckoclient.model.C10957d;
import com.bytedance.ies.p688h.C10968a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.router.SmartRoute;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.common.applog.AppLog;
import com.p683ss.android.newmedia.C19555f;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commercialize.log.C26050aq;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.discover.adapter.PoiItemViewHolder;
import com.p683ss.android.ugc.aweme.discover.mob.C28381ab;
import com.p683ss.android.ugc.aweme.discover.mob.C28390aj;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.forward.p1777e.C32401a;
import com.p683ss.android.ugc.aweme.live.C36065d;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23239i;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.C33205o;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.poi.model.C39129m;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.poi.utils.IPoiProxy;
import com.p683ss.android.ugc.aweme.push.C40884a;
import com.p683ss.android.ugc.aweme.util.C47611a;
import com.p683ss.android.ugc.aweme.utils.C47731bq;
import com.p683ss.android.ugc.aweme.video.preload.C48106i;
import com.p683ss.android.ugc.aweme.web.C48380q;
import java.io.File;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.poi.PoiProxyImpl */
public final class PoiProxyImpl implements IPoiProxy {
    public final void tryLoadAwemeMapPlugin() {
    }

    public final C8862e liveService() {
        ILiveOuterService a = C36173w.m81665a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
        C36065d live = a.getLive();
        C52711k.m112236a((Object) live, "ServiceManager.get().get…Service::class.java).live");
        return live;
    }

    public static IPoiProxy createIPoiProxybyMonsterPlugin() {
        Object a = C27991b.m66756a(IPoiProxy.class);
        if (a != null) {
            return (IPoiProxy) a;
        }
        if (C27991b.f73450aG == null) {
            synchronized (IPoiProxy.class) {
                if (C27991b.f73450aG == null) {
                    C27991b.f73450aG = new PoiProxyImpl();
                }
            }
        }
        return (PoiProxyImpl) C27991b.f73450aG;
    }

    public final void disableStartActivityIfNeeded(Activity activity) {
        C52711k.m112240b(activity, "activity");
        TimeLockRuler.disableStartActivityIfNeeded(activity);
    }

    public final void handleCellClick(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        C48106i.m104189a(aweme);
    }

    public final void onDeepLinkFinished(Activity activity) {
        C52711k.m112240b(activity, "activity");
        C40884a.m90455a(activity);
    }

    public final String detectIsFromEditOrStory(Context context) {
        Object obj;
        C52711k.m112240b(context, "context");
        Map dataMapForEditActivity = AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().getDataMapForEditActivity(context);
        if (dataMapForEditActivity != null) {
            obj = dataMapForEditActivity.get("enter_from");
        } else {
            obj = null;
        }
        return (String) obj;
    }

    public final Map<Object, Object> getTrickyMapByActivity(Context context) {
        C52711k.m112240b(context, "context");
        return AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().getDataMapForEditActivity(context);
    }

    public final C39040b createPoiItemViewHolder(View view, C39054d dVar) {
        return new PoiItemViewHolder(view, dVar);
    }

    public final void trackAppsFlyerEvent(String str, String str2) {
        C52711k.m112240b(str, "event");
        C52711k.m112240b(str2, "arg");
        C47611a.m103065a(str, str2);
    }

    public final void poiCardJumpToDetail(Context context, Aweme aweme) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        C39129m k = new C39129m().mo79718a(aweme.getPoiStruct().poiId).mo79714a(aweme).mo79719a(C32401a.m74903b(aweme, "")).mo79717a(aweme.getPoiStruct()).mo79726h("homepage_hot").mo79729k("click_poi_ad");
        PoiStruct poiStruct = aweme.getPoiStruct();
        C52711k.m112236a((Object) poiStruct, "aweme.poiStruct");
        SmartRouter.buildRoute(context, "//poi/detail").withParam("poi_bundle", (Serializable) k.mo79735q(String.valueOf(poiStruct.getPoiSubTitleType())).mo79713a()).open();
    }

    public final String getGeckoRes(String str, String str2) {
        C52711k.m112240b(str, "channel");
        C52711k.m112240b(str2, "resName");
        int i = 0;
        if (C47731bq.m103352f()) {
            String d = C47731bq.m103346d(C48380q.m104672e().mo41210d(), "poi_resource");
            if (TextUtils.isEmpty(d)) {
                return null;
            }
            File file = new File(d);
            if (file.exists() && file.listFiles() != null) {
                File[] listFiles = file.listFiles();
                if (listFiles == null) {
                    C52711k.m112234a();
                }
                if (listFiles.length != 0) {
                    File[] listFiles2 = file.listFiles();
                    if (listFiles2 == null) {
                        C52711k.m112234a();
                    }
                    int length = listFiles2.length;
                    while (i < length) {
                        File file2 = listFiles2[i];
                        if (C52830p.m112406a(str2, file2.getName(), true)) {
                            String uri = Uri.fromFile(file2).toString();
                            C52711k.m112236a((Object) uri, "Uri.fromFile(file).toString()");
                            return uri;
                        }
                        i++;
                    }
                    return null;
                }
            }
            return null;
        }
        C10885e e = C47731bq.m103348e();
        if (e == null) {
            return null;
        }
        C10957d a = e.mo19651a("poi_resource");
        C10968a a2 = C10968a.m22224a(C11010c.m22280a(), C11010c.m22288i(), AppLog.getServerDeviceId(), C19555f.m47851a().mo40808f().mo41208b());
        StringBuilder sb = new StringBuilder();
        sb.append(a2.mo19784a());
        sb.append(File.separator);
        sb.append(a.f29404d);
        File file3 = new File(sb.toString());
        if (file3.exists() && file3.listFiles() != null) {
            File[] listFiles3 = file3.listFiles();
            if (listFiles3 == null) {
                C52711k.m112234a();
            }
            if (listFiles3.length != 0) {
                File[] listFiles4 = file3.listFiles();
                if (listFiles4 == null) {
                    C52711k.m112234a();
                }
                int length2 = listFiles4.length;
                while (i < length2) {
                    File file4 = listFiles4[i];
                    if (C52830p.m112406a(str2, file4.getName(), true)) {
                        String uri2 = Uri.fromFile(file4).toString();
                        C52711k.m112236a((Object) uri2, "Uri.fromFile(file).toString()");
                        return uri2;
                    }
                    i++;
                }
                return null;
            }
        }
        return null;
    }

    public final void logFeedRawPoiAdOpenUrlApp(Context context, AwemeRawAd awemeRawAd, String str) {
        C26088l.m63292a(context, awemeRawAd, "open_url_app", C26088l.m63329c(context, awemeRawAd, "raw ad open_url_app"), str);
    }

    public final void logFeedRawPoiAdOpenUrlH5(Context context, AwemeRawAd awemeRawAd, String str) {
        C26088l.m63292a(context, awemeRawAd, "open_url_h5", C26088l.m63329c(context, awemeRawAd, "raw ad open_url_h5"), str);
    }

    public final void logPoiAdClick(Context context, AwemeRawAd awemeRawAd, String str) {
        C26088l.m63292a(context, awemeRawAd, "click", C26088l.m63265a(context, awemeRawAd, "poi ad click", true), str);
    }

    public final void logPoiAdShow(Context context, AwemeRawAd awemeRawAd, String str) {
        C26088l.m63292a(context, awemeRawAd, "show", C26088l.m63329c(context, awemeRawAd, "poi ad show"), str);
    }

    public final boolean openAdOpenUrl(Context context, String str, boolean z) {
        C52711k.m112240b(str, "openUrl");
        return C26540w.m64226a(context, str, z);
    }

    public final boolean openAdWebUrl(Context context, String str, String str2) {
        C52711k.m112240b(str, "webUrl");
        C52711k.m112240b(str2, "title");
        return C26540w.m64222a(context, str, str2);
    }

    public final void enterLiveOrNot(Activity activity, Bundle bundle, View view) {
        if (activity != null && bundle != null) {
            SmartRoute withParam = SmartRouter.buildRoute((Context) activity, "//detail").withParam(bundle);
            if (view != null) {
                C0643c b = C0643c.m1729b(view, 0, 0, view.getWidth(), view.getHeight());
                C52711k.m112236a((Object) b, "ActivityOptionsCompat.ma…hor.width, anchor.height)");
                withParam.withBundleAnimation(b.mo2171a());
            }
            withParam.open();
        }
    }

    public final void logPoiAdCollect(Context context, Aweme aweme, String str) {
        if (C26088l.m63256C(context, aweme)) {
            C26088l.m63300a(context, "poi_ad", "collect", C26050aq.m63099a(C26088l.m63373m(context, aweme, "poi collect click"), str), aweme.getAwemeRawAdIdStr(), C26088l.m63258a(aweme));
        }
    }

    public final void logPoiAdCollectCancel(Context context, Aweme aweme, String str) {
        if (C26088l.m63256C(context, aweme)) {
            C26088l.m63300a(context, "poi_ad", "collect_cancel", C26050aq.m63099a(C26088l.m63373m(context, aweme, "poi collect cancel click"), str), aweme.getAwemeRawAdIdStr(), C26088l.m63258a(aweme));
        }
    }

    public final void logPoiAdCouponClick(Context context, Aweme aweme, String str) {
        if (C26088l.m63256C(context, aweme)) {
            C26088l.m63300a(context, "poi_ad", "coupon_click", C26050aq.m63099a(C26088l.m63373m(context, aweme, "poi coupon click"), str), aweme.getAwemeRawAdIdStr(), C26088l.m63258a(aweme));
        }
    }

    public final void logPoiAdPhoneClick(Context context, Aweme aweme, String str) {
        if (C26088l.m63256C(context, aweme)) {
            C26088l.m63300a(context, "poi_ad", "phone_click", C26050aq.m63099a(C26088l.m63373m(context, aweme, "poi phone click"), str), aweme.getAwemeRawAdIdStr(), C26088l.m63258a(aweme));
        }
    }

    public final void logPoiAdOtherClick(Context context, Aweme aweme, String str, String str2) {
        if (C26088l.m63256C(context, aweme)) {
            HashMap hashMap = new HashMap();
            hashMap.put("refer", str);
            C26088l.m63300a(context, "poi_ad", "otherclick", C26050aq.m63099a(C26088l.m63264a(context, aweme, "poi other click", false, (Map<String, String>) hashMap), str2), aweme.getAwemeRawAdIdStr(), C26088l.m63258a(aweme));
        }
    }

    public final void sendPoiFavouriteEvent(String str, String str2, String str3, boolean z) {
        String str4;
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(str2, "from");
        C52711k.m112240b(str3, "poiId");
        C28390aj ajVar = C28390aj.f74551a;
        C52711k.m112240b(str, "event");
        C52711k.m112240b(str2, "enterFrom");
        C52711k.m112240b(str3, "poiId");
        if (z) {
            str4 = C28381ab.m67359d().mo56813a(5);
        } else {
            str4 = C28381ab.m67359d().mo56813a(3);
        }
        Map<String, String> map = C23089d.m56640a().mo47829a("enter_from", str2).mo47829a("poi_id", str3).mo47829a("log_pb", C29981aa.m70153a().mo60161a(str4)).mo47829a("search_result_id", C28381ab.m67354b()).f61491a;
        C52711k.m112236a((Object) map, "EventMapBuilder.newBuild…               .builder()");
        C28390aj.m67374a(str, map);
    }

    public final void jumpToPoiDetail(Context context, Aweme aweme, String str, String str2, JSONObject jSONObject, View view) {
        String str3;
        String str4;
        String str5;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        String e = C23198ae.m56861e(aweme);
        String g = C23198ae.m56865g(aweme);
        String h = C23198ae.m56867h(aweme);
        String m = C23198ae.m56877m(aweme);
        SmartRouter.buildRoute(context, "//poi/detail").withParam("poi_bundle", (Serializable) new C39129m().mo79718a(e).mo79724f(g).mo79723e(h).mo79714a(aweme).mo79719a(C23794bh.m58391e().mo65590a(aweme, str2)).mo79717a(aweme.getPoiStruct()).mo79727i(str2).mo79726h(str).mo79713a()).open();
        try {
            MobClick value = MobClick.obtain().setEventName("poi_click").setLabelName(str).setValue(m);
            C23088c a = new C23088c().mo47824a("poi_id", e).mo47824a("poi_type", h);
            String str6 = "request_id";
            if (jSONObject == null) {
                str3 = "";
            } else {
                str3 = jSONObject.optString("request_id");
            }
            C26890h.onEvent(value.setJsonObject(a.mo47824a(str6, str3).mo47824a("group_id", m).mo47824a("content_type", C23198ae.m56879o(aweme)).mo47825b()));
            C23239i iVar = new C23239i();
            if (str == null) {
                str4 = "";
            } else {
                str4 = str;
            }
            C23239i e2 = iVar.mo48092a(str4).mo48096e(aweme);
            if (jSONObject == null) {
                str5 = "";
            } else {
                str5 = jSONObject.optString("request_id");
            }
            C23239i c = e2.mo48093b(str5).mo48094c(e);
            c.f62030a = str2;
            c.mo48095d(h).mo48076e();
            if (TextUtils.equals(str, "general_search") || TextUtils.equals(str, "search_result")) {
                C28381ab.m67350a(view, aweme.getAid(), -1);
            }
            if (TextUtils.equals(str, "general_search")) {
                C26088l.m63285a(context, aweme, C23198ae.m56861e(aweme), "result_ad", (String) null);
            }
        } catch (Exception unused) {
        }
    }

    public final void startChat(Context context, String str, String str2, String str3, UrlModel urlModel, String str4, String str5) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "id");
        C52711k.m112240b(str2, "secId");
        C52711k.m112240b(str3, "title");
        C52711k.m112240b(urlModel, "thumb");
        C52711k.m112240b(str4, "reason");
        C52711k.m112240b(str5, "sign");
        IIMService a = C33194e.m76277a(false);
        if (C33194e.m76264a() && a != null) {
            IMUser iMUser = new IMUser();
            iMUser.setUid(str);
            iMUser.setSecUid(str2);
            iMUser.setNickName(str3);
            iMUser.setAvatarThumb(urlModel);
            iMUser.setEnterpriseVerifyReason(str4);
            iMUser.setSignature(str5);
            iMUser.setCommerceUserLevel(1);
            a.startChat(context, iMUser);
            C33205o.m76295a(str);
        }
    }
}
