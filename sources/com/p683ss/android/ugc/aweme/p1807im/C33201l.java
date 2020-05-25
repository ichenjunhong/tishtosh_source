package com.p683ss.android.ugc.aweme.p1807im;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.common.util.C18920g;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.antiaddic.C22688a;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.experiment.FollowToFollowBackExperiment;
import com.p683ss.android.ugc.aweme.feed.helper.C30367g;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.feedback.runtime.behavior.C31300c.C31301a;
import com.p683ss.android.ugc.aweme.following.p1768a.C31993b;
import com.p683ss.android.ugc.aweme.following.p1768a.C31995c;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IAddFriendsActivity;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32808a;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33098b;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.notice.api.p2009ws.C38064h;
import com.p683ss.android.ugc.aweme.p1807im.service.C35430c;
import com.p683ss.android.ugc.aweme.p1807im.service.C35440f;
import com.p683ss.android.ugc.aweme.p1807im.service.C35453h;
import com.p683ss.android.ugc.aweme.p1807im.service.C35458i;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.C35461k;
import com.p683ss.android.ugc.aweme.p1807im.service.C35462l;
import com.p683ss.android.ugc.aweme.p1807im.service.C35463m;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35468e;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35422a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35424c;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35426d;
import com.p683ss.android.ugc.aweme.p1807im.service.p1902d.C35434a;
import com.p683ss.android.ugc.aweme.p2377ug.poloris.C47485d;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.sec.SecApiImpl;
import com.p683ss.android.ugc.aweme.secapi.C41483a;
import com.p683ss.android.ugc.aweme.utils.C47865ew;
import com.p683ss.android.ugc.aweme.video.C48021h;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONObject;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;

/* renamed from: com.ss.android.ugc.aweme.im.l */
public final class C33201l implements C35460j {

    /* renamed from: a */
    private C35461k f86192a;

    /* renamed from: b */
    private boolean f86193b;

    public final void addImpressionId(int i, String str) {
    }

    public final void bindRecommendContactItemView(C1352v vVar, RecommendContact recommendContact, int i) {
    }

    public final void bindRecommendViewHolder(C1352v vVar, User user, int i, boolean z, int i2) {
    }

    public final boolean canShowInnerNotification() {
        return false;
    }

    public final void cancelDownload(Activity activity, int i) {
    }

    public final boolean checkIMInsertRecommendContact() {
        return false;
    }

    public final void checkPluginAndLoadLibrary(Context context, boolean z, String str, C35422a aVar) {
    }

    public final boolean checkShowPushNotificationGuide(Context context) {
        return false;
    }

    public final C35434a createGroupFollowMemberViewHolder(ViewGroup viewGroup) {
        return null;
    }

    public final C1352v createRecommendContactItemView(ViewGroup viewGroup, C52682m<RecommendContact, Integer, C52860x> mVar) {
        return null;
    }

    public final C1352v createRecommendViewHolder(Context context, HashMap<String, Boolean> hashMap, C35424c<User> cVar) {
        return null;
    }

    public final void downloadPdf(Context context, String str, String str2) {
    }

    public final DownloadInfo getAppDownloadInfo(Context context, String str) {
        return null;
    }

    public final int getAssociativeEmoji() {
        return 0;
    }

    public final Activity getCurrentActivity() {
        return null;
    }

    public final ViewGroup getCurrentDecorView(Activity activity) {
        return null;
    }

    public final C35453h getFamiliarProxy() {
        return null;
    }

    public final String getFriendToFamiliarStr(int i, int i2, int i3) {
        return "";
    }

    public final String getInnerPushEnterFrom() {
        return "";
    }

    public final boolean getIsHotSearchBillboardEnable() {
        return true;
    }

    public final C35458i getLiveProxy() {
        return null;
    }

    public final int getRecommendContactPosition() {
        return -1;
    }

    public final String getToReportId() {
        return null;
    }

    public final int getXPlanStyle() {
        return 0;
    }

    public final C35462l getXrtcProxy() {
        return null;
    }

    public final void handleXDownload(Activity activity, String str, C35430c cVar, boolean z, boolean z2) {
    }

    public final boolean isCheckPlugin() {
        return false;
    }

    public final boolean isEnableShowTeenageTip() {
        return false;
    }

    public final boolean isFFSDKBind() {
        return false;
    }

    public final boolean isInMainFeed() {
        return false;
    }

    public final boolean isInPublishPage() {
        return false;
    }

    public final boolean isMainPage() {
        return false;
    }

    public final boolean isNeedToContinuePlayInAct() {
        return this.f86193b;
    }

    public final boolean isXPlanRedPacketOpen() {
        return false;
    }

    public final void jumpToLivePage(Context context, String str, String str2, String str3, Bundle bundle) {
    }

    public final void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4) {
    }

    public final void makePhoneCall(Activity activity, String str, String str2, String str3, String str4) {
    }

    public final void openFFSdkSchema(String str) {
    }

    public final void openLiveUrl(Context context, String str) {
    }

    public final void openNotificationSetting(Context context, String str) {
    }

    public final void openPrivacyReminder(Context context) {
    }

    public final void pauseDownload(Activity activity, int i) {
    }

    public final void recordLastShareTypeIsIm() {
    }

    public final void saveLogPb(String str, String str2) {
    }

    public final void saveShareCommandToSp(String str) {
    }

    public final void shareToTargetChannel(Context context, String str) {
    }

    public final boolean showNewStyle() {
        return true;
    }

    public final void showNotification(String str, String str2) {
    }

    public final void showPushNotification(String str) {
    }

    public final boolean enableIM() {
        return C33194e.m76264a();
    }

    public final C35463m getUnder16Proxy() {
        return new C33204n();
    }

    public final boolean needFollowToFollowBack() {
        return FollowToFollowBackExperiment.m69596a();
    }

    public final String getAppLanguage() {
        String b = C33098b.m76080a().mo70131b();
        if (b == null) {
            return "";
        }
        return b;
    }

    public final C35461k getPlayerProxy() {
        if (this.f86192a == null) {
            this.f86192a = new C33181d();
        }
        return this.f86192a;
    }

    public final String getWsUrl() {
        return C38064h.m85136d().mo77610e();
    }

    public final boolean enableSendPic() {
        if (((Integer) SharePrefCache.inst().getCanImSendPic().mo47782d()).intValue() == 1) {
            return true;
        }
        return false;
    }

    public final C35468e getIMSetting() {
        C32808a a = C32808a.m75701a();
        if (a.f85411a != null) {
            return a.f85411a;
        }
        C35468e a2 = C35468e.m80176a();
        a2.f91143a = SharePrefCache.inst().getOpenImLink();
        a2.f91144b = SharePrefCache.inst().getImUrlTemplate();
        a2.f91145c = SharePrefCache.inst().getMultiSelectLimit();
        return a2;
    }

    public final void logIMShareHeadShow() {
        String b = C18920g.m46051b(C11010c.m22280a());
        if (TextUtils.isEmpty(b) || !b.contains(":miniapp")) {
            C26890h.onEventV3("im_share_head_show");
        } else {
            C36983a.m83185b().mo76294a().remoteMobV3("im_share_head_show", null);
        }
    }

    public final void setIMAwemeProvider(C35440f fVar) {
        C31213v.f81659c = fVar;
    }

    public final void setNeedToContinueToPlay(boolean z) {
        this.f86193b = z;
    }

    public final void logIMShareHeadShow(Map<String, String> map) {
        C26890h.m65011a("share_head_show", map);
    }

    public final void registerAppStateCallback(C27979p pVar) {
        C22688a.m55899d().mo47071a(pVar);
    }

    public final void enterAddFriendsActivity(Context context) {
        context.startActivity(C32616c.f84865a.getFindFriendsIntent(context, 0, 4, "message"));
    }

    public final void updateApk(Context context) {
        Intent intent = new Intent(context, CrossPlatformActivity.class);
        intent.setData(Uri.parse("https://go.onelink.me/BAuo/410a1973"));
        context.startActivity(intent);
    }

    public final void monitorMsgSendStatus(Map<String, String> map) {
        try {
            int parseInt = Integer.parseInt((String) map.get("success_cnt"));
            while (true) {
                int i = parseInt - 1;
                if (parseInt <= 0) {
                    break;
                }
                C23131p.m57776a("aweme_im_message_error_rate", 0, (JSONObject) null);
                parseInt = i;
            }
            int parseInt2 = Integer.parseInt((String) map.get("fail_cnt"));
            while (true) {
                int i2 = parseInt2 - 1;
                if (parseInt2 > 0) {
                    C23131p.m57776a("aweme_im_message_error_rate", 1, (JSONObject) null);
                    parseInt2 = i2;
                } else {
                    return;
                }
            }
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }

    public final void setSharePlayer(Object... objArr) {
        if (objArr != null && objArr.length != 0) {
            if (objArr[0] != null && (objArr[0] instanceof C33181d)) {
                C30367g.m71282a().f79372a = (C48021h) objArr[0].mo70347a();
            }
            if (objArr[1] != null && (objArr[1] instanceof Long) && objArr[1].longValue() > 0) {
                C30367g.m71282a().f79374c = 0;
            }
        }
    }

    public final void feedbackIm(String str, String str2) {
        C31301a.m73024a().mo64183a(str, str2);
    }

    public final C26875a<User, C31995c> getFollowerFetchModel(String str, String str2) {
        return new C31993b(str, str2);
    }

    public final void jumpToDeepLink(Context context, String str) {
        C23060d.f61431e.mo47789a(context, str, (String) null);
    }

    public final void putSecUidToMap(String str, String str2) {
        C47865ew.m103536a().mo95077a(str, str2);
    }

    public final void popCaptcha(Activity activity, int i, final C35426d dVar) {
        SecApiImpl.createISecApibyMonsterPlugin().popCaptcha(activity, i, new C41483a() {
            /* renamed from: a */
            public final void mo70445a() {
                if (dVar != null) {
                    dVar.mo72396a(0);
                }
            }

            /* renamed from: a */
            public final void mo70446a(boolean z, int i) {
                if (dVar != null) {
                    dVar.mo72397a(z, "");
                }
            }
        });
    }

    public final void openUrl(Context context, Uri uri, boolean z) {
        if (!C47485d.m102882a(context, uri.toString(), "IM")) {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            intent.setData(uri);
            if (z) {
                intent.putExtra("safeTemplate", true);
            }
            intent.putExtra("enter_from", "chat");
            intent.putExtra("hide_more", false);
            intent.putExtra("use_webview_title", true);
            context.startActivity(intent);
        }
    }

    public final Intent getAddFriendsActivityIntent(Context context, int i, int i2, String str, String str2) {
        return IAddFriendsActivity.m75443a(context, i, i2, str);
    }

    public final void enterDetailActivity(Context context, String str, String str2, String str3, int i, int i2, String str4, View view, Bundle bundle) {
        Intent intent = new Intent(context, DetailActivity.class);
        intent.putExtra("id", str);
        intent.putExtra("refer", str2);
        intent.putExtra("video_from", str3);
        intent.putExtra("profile_enterprise_type", i);
        intent.putExtra("page_type", i2);
        if (str4 != null) {
            intent.putExtra("userid", str4);
        }
        if (bundle != null) {
            intent.putExtra("key_from_chat_room_playing", bundle.getBoolean("key_from_chat_room_playing"));
            intent.putExtra("key_from_chat_room_real_aid", bundle.getString("key_from_chat_room_real_aid"));
        }
        DetailActivity.m66078a(context, intent, view);
        C26890h.m65011a("feed_enter", C23089d.m56640a().mo47829a("enter_from", "chat").mo47829a("group_id", str).f61491a);
    }
}
