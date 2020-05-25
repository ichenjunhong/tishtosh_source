package com.p683ss.android.ugc.aweme.share;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.net.Uri.Builder;
import android.support.p030v4.app.Fragment;
import android.text.TextUtils;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23371a;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.compliance.api.services.report.IReportService;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.experiment.UseLiveWallpaperExperiment;
import com.p683ss.android.ugc.aweme.feed.helper.C30399u;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.utils.C31187c;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.forward.view.FeedDetailActivity;
import com.p683ss.android.ugc.aweme.livewallpaper.p1928c.C36212f;
import com.p683ss.android.ugc.aweme.miniapp_api.model.C36954b.C36957c;
import com.p683ss.android.ugc.aweme.newfollow.p2001h.C37896n;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.C37915b;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment;
import com.p683ss.android.ugc.aweme.p1807im.service.share.C35478b;
import com.p683ss.android.ugc.aweme.p2108r.p2109a.C41049a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.report.C41201a;
import com.p683ss.android.ugc.aweme.setting.p2148ui.PrivacySettingActivity;
import com.p683ss.android.ugc.aweme.share.gif.C42018b;
import com.p683ss.android.ugc.aweme.share.gif.C42025h;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42047a;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42076ao;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42077b;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42113n;
import com.p683ss.android.ugc.aweme.share.improve.p2160a.C42120s;
import com.p683ss.android.ugc.aweme.share.improve.p2163c.C42149b;
import com.p683ss.android.ugc.aweme.sharer.C42307b;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42348d;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.C42357g;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.SharePackage;
import com.p683ss.android.ugc.aweme.sharer.p2173ui.bar.ShareChannelBar;
import com.p683ss.android.ugc.aweme.utils.permission.C47940b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.share.aj */
public final class C41966aj extends C41965ai {
    public final C42357g getCommentAction(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        return null;
    }

    public final C42357g getDouShareAction(Activity activity, Aweme aweme, String str) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "enterFrom");
        return null;
    }

    public final String getHotSpot(Context context) {
        C52711k.m112240b(context, "context");
        return "";
    }

    public final void handleRocketShare(Context context, SharePackage sharePackage, C23371a<Boolean> aVar) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(sharePackage, "sharePackage");
        C52711k.m112240b(aVar, "finishCallback");
    }

    public final SharePackage parseMicroAppSharePackage(C36957c cVar, Context context) {
        C52711k.m112240b(cVar, "shareContent");
        C52711k.m112240b(context, "context");
        return null;
    }

    public final void startPrivacySettingActivity(Aweme aweme, Context context) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(context, "context");
    }

    public final C42025h getGifShareStrategy() {
        return new C42018b();
    }

    public final boolean enhanceVideoShareAction() {
        RefineShareInSiteExperiment refineShareInSiteExperiment = RefineShareInSiteExperiment.INSTANCE;
        if (RefineShareInSiteExperiment.m80104a() == 1 || RefineShareInSiteExperiment.m80104a() == 2) {
            return true;
        }
        return false;
    }

    public final C42357g getInsightAction(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        return new C42120s(aweme);
    }

    public final boolean isShowLiveWallpaper(Aweme aweme) {
        C52711k.m112240b(aweme, "aweme");
        if (!C36212f.m81742a(aweme)) {
            return true;
        }
        return false;
    }

    public final void saveShareChannel(C42307b bVar) {
        C52711k.m112240b(bVar, "channel");
        C30399u uVar = C30399u.f79466b;
        C52711k.m112240b(bVar, "shareChannel");
        uVar.mo60816a().storeLong(bVar.mo86136b(), System.currentTimeMillis());
    }

    public final C42357g getAdSettingAction(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        return new C42047a(aweme, str);
    }

    public final C42357g getAdminOpsAction(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        return new C42077b(aweme, str);
    }

    public final C42357g getDuetAction(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        return new C42113n(aweme, str);
    }

    public final C42357g getStitchAction(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        return new C42076ao(aweme, str);
    }

    public final boolean whetherShowForwardView(Aweme aweme, Fragment fragment) {
        if (aweme == null || !C31190f.m72840h(aweme) || fragment == null || (fragment instanceof C37915b) || (fragment instanceof C37896n) || (C11016e.m22312g() instanceof FeedDetailActivity)) {
            return false;
        }
        return true;
    }

    public final void eventForLiveWallPaper(Aweme aweme, String str) {
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        if (C36212f.m81742a(aweme)) {
            String str2 = "";
            if (aweme != null) {
                StringBuilder sb = new StringBuilder("type ");
                sb.append(aweme.getAwemeType());
                str2 = sb.toString();
                Video video = aweme.getVideo();
                if (video != null) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(str2);
                    sb2.append(" width ");
                    sb2.append(video.getWidth());
                    sb2.append(" height ");
                    sb2.append(video.getHeight());
                    str2 = sb2.toString();
                }
            }
            C23131p.m56692a("livewall_not_show", "", C23088c.m56631a().mo47822a("abvalue", Integer.valueOf(C10181b.m20511a().mo18168a(UseLiveWallpaperExperiment.class, true, "use_live_wallpaper", 31744, 0))).mo47822a("setting", (Integer) SharePrefCache.inst().getUseLiveWallpaper().mo47782d()).mo47819a("isInValidValueAweme", Boolean.valueOf(C36212f.m81746b(aweme))).mo47824a("message", str2).mo47825b());
            return;
        }
        if (aweme != null) {
            C26890h.m65011a("wall_paper_show", C23089d.m56640a().mo47829a("group_id", aweme.getAid()).mo47829a("request_id", aweme.getRequestId()).mo47829a("enter_from", str).f61491a);
        }
    }

    public final void showNoPermissionDialog(int i, int i2, Activity activity) {
        C52711k.m112240b(activity, "contenxt");
        C47940b.m103728a(i, i2, activity);
    }

    public final void logForAdShare(Context context, Aweme aweme, C42307b bVar, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "enterFrom");
        if (aweme.isAd()) {
            C26088l.m63381r(context, aweme);
        }
    }

    public final Dialog scoopShareDialogWithNewSharePanel(Activity activity, ShareChannelBar shareChannelBar, C42348d dVar, int i) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(dVar, "config");
        return C41049a.f104381a.mo83571a().getShareService().mo72375a(activity, dVar, new C35478b(shareChannelBar, 0, 1), i);
    }

    public final void showReportDialog(Aweme aweme, String str, Context context, String str2) {
        String str3;
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "eventType");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str2, "enterMethod");
        if (aweme.isAd() && aweme.getAwemeRawAd() != null) {
            AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
            if (awemeRawAd == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) awemeRawAd, "aweme.awemeRawAd!!");
            if (awemeRawAd.isReportEnable()) {
                C27013a.m65227a().reportAd(C42149b.m92512a(context), C41201a.m90895a(aweme, "creative", C29094ad.f76264a));
                return;
            }
        }
        if (aweme.getAwemeType() == 13) {
            str3 = "forward";
        } else {
            str3 = "video";
        }
        User author = aweme.getAuthor();
        C52711k.m112236a((Object) author, "aweme.author");
        C27013a.m65227a().report(C42149b.m92512a(context), new Builder().appendQueryParameter("report_type", str3).appendQueryParameter("object_id", aweme.getAid()).appendQueryParameter("owner_id", author.getUid()));
        IReportService a = C27013a.m65227a();
        String awemeReportType = C27013a.m65227a().getAwemeReportType(aweme);
        String m = C23198ae.m56877m(aweme);
        String m2 = C23198ae.m56877m(aweme);
        String a2 = C23198ae.m56848a(aweme.getAuthor());
        String str4 = "";
        if (TextUtils.isEmpty(str2)) {
            str2 = C27013a.m65227a().getReportEnterMethod(str);
        }
        a.sendReportEvent(str, awemeReportType, m, m2, a2, str4, str2);
    }

    public final void startPrivacySetting(Context context, Aweme aweme, String str, String str2, String str3) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(aweme, "aweme");
        C52711k.m112240b(str, "tabName");
        C52711k.m112240b(str2, "enterFrom");
        C52711k.m112240b(str3, "imprId");
        Intent intent = new Intent(context, PrivacySettingActivity.class);
        C31187c.m72819a(aweme);
        intent.putExtra("tab_name", str);
        intent.putExtra("enter_from", str2);
        intent.putExtra("impr_id", str3);
        context.startActivity(intent);
    }
}
