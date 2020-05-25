package com.p683ss.android.ugc.aweme.share;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.text.TextUtils;
import com.p683ss.android.common.applog.NetUtil;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.model.C22055c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.experiment.GreenScreenModeExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.LongVideo;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.panel.C30648q;
import com.p683ss.android.ugc.aweme.initializer.C35698k;
import com.p683ss.android.ugc.aweme.longvideo.C36380h;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36351a;
import com.p683ss.android.ugc.aweme.longvideo.p1934b.C36353b;
import com.p683ss.android.ugc.aweme.longvideonew.C36433i;
import com.p683ss.android.ugc.aweme.p1632di.C27650cj;
import com.p683ss.android.ugc.aweme.p1797h.C32938a;
import com.p683ss.android.ugc.aweme.p1797h.C32948d;
import com.p683ss.android.ugc.aweme.poi.C39067g;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.model.PoiStruct;
import com.p683ss.android.ugc.aweme.profile.api.AwemeApi;
import com.p683ss.android.ugc.aweme.profile.model.CommercePermissionStruct;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.qrcode.C40952c;
import com.p683ss.android.ugc.aweme.qrcode.p2107v2.QRCodeActivityV2;
import com.p683ss.android.ugc.aweme.share.improve.C42131b;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42055ac;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42064aj;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42067ak;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42068al;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42075an;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42083e;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42114o;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42117q;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42124w;
import com.p683ss.android.ugc.aweme.share.improve.p2162b.C42138d;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42359h;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.ai */
public abstract class C41965ai implements ShareDependService {
    /* renamed from: a */
    public static ShareDependService m91933a() {
        if (C27991b.f73508d == null) {
            synchronized (ShareDependService.class) {
                if (C27991b.f73508d == null) {
                    C27991b.f73508d = C27650cj.m66324c();
                }
            }
        }
        return (ShareDependService) C27991b.f73508d;
    }

    public boolean consumeLastCheckForceToPrivate() {
        C32938a.f85600a = false;
        return false;
    }

    public C42357g getAdIntraAction(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        return null;
    }

    public String getLastTabIdI18n() {
        return "";
    }

    public C42357g getStitchAction(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        return null;
    }

    public void startPrivacySetting(Context context, Aweme aweme, String str, String str2, String str3) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "tabName");
        C52711k.m112240b(str2, "enterFrom");
        C52711k.m112240b(str3, "imprId");
    }

    public boolean enableGreenScreenMode() {
        return GreenScreenModeExperiment.m69597a();
    }

    public void isShareDownloading(boolean z) {
        C30648q.f80089d = z;
    }

    public C22055c getAVUserImpl(User user) {
        C52711k.m112240b(user, "user");
        return new C35698k(user);
    }

    public C42357g getEnterpriseTopAction(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        return new C42114o(aweme);
    }

    public LongVideo getLongVideo(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        return C36380h.m82107a(aweme);
    }

    public boolean shouldForbiddenWaterMark(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        return C32938a.m75836a(aweme);
    }

    public boolean isCanDownloadLongVideo(Aweme aweme) {
        Video video;
        if (aweme != null) {
            LongVideo a = C36380h.m82107a(aweme);
            if (a != null) {
                video = a.getVideo();
            } else {
                video = null;
            }
            if (video != null) {
                Video video2 = a.getVideo();
                C52711k.m112236a((Object) video2, "longVideo.video");
                if (video2.getDownloadAddr() != null) {
                    return true;
                }
            }
        }
        return false;
    }

    public int shouldStickVideoTop(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        User author = aweme.getAuthor();
        if (author != null && C20854a.m53167g().isMe(author.getUid())) {
            CommercePermissionStruct commercePermission = C20902b.m53242a().getCurUser().getCommercePermission();
            if (commercePermission != null && commercePermission.topItem == 1) {
                return 1;
            }
        }
        return 0;
    }

    public boolean isEnterpriseUserVideo(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        if (aweme == null || aweme.getAuthor() == null || !TextUtils.equals(aweme.getAuthorUid(), C20902b.m53242a().getCurUserId())) {
            return false;
        }
        if (C20902b.m53242a().getCurUser().getCommerceUserLevel() == 0 && aweme.getAuthor() != null && aweme.getAuthor().getCommerceUserLevel() == 0) {
            return false;
        }
        return true;
    }

    public String dislikeAweme(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        if (aweme == null) {
            return "";
        }
        HashMap hashMap = new HashMap();
        String aid = aweme.getAid();
        String str = "";
        String str2 = "";
        String str3 = "";
        String str4 = "";
        String str5 = "";
        if (aweme.isAd()) {
            str = String.valueOf(aweme.getAwemeRawAd().getAdId());
            str2 = String.valueOf(aweme.getAwemeRawAd().getCreativeId());
            str4 = aweme.getAwemeRawAd().getLogExtra();
        }
        if (!TextUtils.isEmpty(str)) {
            hashMap.put("ad_id", str);
        }
        if (!TextUtils.isEmpty(str2)) {
            hashMap.put("creative_id", str2);
        }
        if (!TextUtils.isEmpty(str3)) {
            hashMap.put("ad_category", str3);
        }
        if (!TextUtils.isEmpty(str4)) {
            hashMap.put("log_extra", str4);
        }
        if (!TextUtils.isEmpty(str5)) {
            hashMap.put("dislike_source", str5);
        }
        NetUtil.putCommonParams(hashMap, true);
        AwemeApi.f101549e.disLikeAweme(aid, hashMap).execute();
        return aid;
    }

    public void startQrCodeActivityV2(Context context, C40952c cVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(cVar, "params");
        QRCodeActivityV2.m90640a(context, cVar);
    }

    public void toBindActivity(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "enterFrom");
        C32948d.m75854a(context, str);
    }

    public C42357g getBlackListAction(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        return new C42083e(aweme, str);
    }

    public C42357g getGreenScreenAction(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        return new C42117q(aweme, str);
    }

    public C42357g getLiveWallPaperAction(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        return new C42124w(aweme, str);
    }

    public C42357g getReactAction(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        return new C42055ac(aweme, str);
    }

    public C42357g getRestrictAction(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        return new C42064aj(aweme, str);
    }

    public C42357g getReuseMvThemeAction(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        return new C42067ak(aweme, str);
    }

    public C42357g getReuseStickerAction(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        C42068al alVar = new C42068al(aweme, str, false, 4, null);
        return alVar;
    }

    public C42357g getStatusAction(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        return new C42075an(aweme, str);
    }

    public Intent getWebUriIntent(Context context, Uri uri) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(uri, "url");
        Intent webUriIntent = I18nBridgeService.getBridgeService_Monster().getWebUriIntent(context, uri);
        C52711k.m112236a((Object) webUriIntent, "ServiceManager.get().get…ebUriIntent(context, url)");
        return webUriIntent;
    }

    public String poiDisplayCount(Context context, PoiStruct poiStruct) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(poiStruct, "poiStruct");
        return PoiServiceImpl.createIPoiServicebyMonsterPlugin().getDisplayCount(context, poiStruct);
    }

    public Video aweme2Video(Aweme aweme, Context context) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(context, "context");
        if (!C36353b.f93061a.mo75269b(aweme) || !C36351a.f93060a.mo75268b(context)) {
            return aweme.getVideo();
        }
        return C36433i.f93328b.mo75372a(aweme);
    }

    public C42307b getImChannel(SharePackage sharePackage, String str, int i) {
        C52711k.m112240b(sharePackage, "awemePackage");
        C52711k.m112240b(str, "enterFrom");
        return new C42138d(sharePackage, str, i);
    }

    public void onEventV3IncludingPoiParams(Aweme aweme, String str, C23089d dVar) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(dVar, "builder");
        PoiServiceImpl.createIPoiServicebyMonsterPlugin().onEventV3IncludingPoiParams(aweme, str, dVar);
    }

    public C42359h scoopShareDialogWithImModule(Activity activity, C42348d dVar, int i) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(dVar, "config");
        return new C42131b(activity, dVar, i);
    }

    public void onEventV3IncludingPoiParams(C39067g gVar, String str, C23089d dVar) {
        C52711k.m112240b(gVar, "poiSimpleBundle");
        C52711k.m112240b(str, "eventName");
        C52711k.m112240b(dVar, "builder");
        PoiServiceImpl.createIPoiServicebyMonsterPlugin().onEventV3IncludingPoiParams(gVar, str, dVar);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0057, code lost:
        if (android.text.TextUtils.equals(r4, "chat_merge") == false) goto L_0x0059;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void logForAdShare(android.content.Context r2, com.p683ss.android.ugc.aweme.feed.model.Aweme r3, com.p683ss.android.ugc.aweme.sharer.C42307b r4, java.lang.String r5) {
        /*
            r1 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r0)
            java.lang.String r0 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            java.lang.String r0 = "enterFrom"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r0)
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64061d(r3)
            if (r0 == 0) goto L_0x006f
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            java.lang.String r0 = "general_search"
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            boolean r5 = android.text.TextUtils.equals(r5, r0)
            if (r5 == 0) goto L_0x0039
            com.ss.android.ugc.aweme.commercialize.log.e$b r4 = com.p683ss.android.ugc.aweme.commercialize.log.C26077e.m63190a()
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = r4.mo53590b(r3)
            java.lang.String r4 = "result_ad"
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = r3.mo53582a(r4)
            java.lang.String r4 = "share"
            com.ss.android.ugc.aweme.commercialize.log.e$b r3 = r3.mo53593b(r4)
            r3.mo53586a(r2)
            return
        L_0x0039:
            boolean r5 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64060c(r3)
            if (r5 == 0) goto L_0x0059
            boolean r5 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64060c(r3)
            if (r5 == 0) goto L_0x006f
            if (r4 == 0) goto L_0x004c
            java.lang.String r4 = r4.mo86136b()
            goto L_0x004d
        L_0x004c:
            r4 = 0
        L_0x004d:
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            java.lang.String r5 = "chat_merge"
            java.lang.CharSequence r5 = (java.lang.CharSequence) r5
            boolean r4 = android.text.TextUtils.equals(r4, r5)
            if (r4 != 0) goto L_0x006f
        L_0x0059:
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63381r(r2, r3)
            com.ss.android.ugc.aweme.longvideo.b.a$a r4 = com.p683ss.android.ugc.aweme.longvideo.p1934b.C36351a.f93060a
            boolean r4 = r4.mo75268b(r2)
            if (r4 == 0) goto L_0x006f
            java.lang.String r4 = "share_complete"
            java.lang.String r5 = "long video raw ad share"
            org.json.JSONObject r5 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r2, r3, r5)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63322b(r2, r4, r3, r5)
        L_0x006f:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.share.C41965ai.logForAdShare(android.content.Context, com.ss.android.ugc.aweme.feed.model.Aweme, com.ss.android.ugc.aweme.sharer.b, java.lang.String):void");
    }
}
