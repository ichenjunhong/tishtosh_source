package com.p683ss.android.ugc.aweme.p1807im.sdk.providedservices;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.socialbase.downloader.model.DownloadInfo;
import com.p683ss.android.ugc.aweme.C27979p;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.following.p1768a.C31995c;
import com.p683ss.android.ugc.aweme.friends.model.RecommendContact;
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
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35427e;
import com.p683ss.android.ugc.aweme.p1807im.service.p1902d.C35434a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Locale;
import java.util.Map;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.providedservices.DefaultMainProxy */
public class DefaultMainProxy implements C35460j {
    public void addImpressionId(int i, String str) {
    }

    public void bindRecommendContactItemView(C1352v vVar, RecommendContact recommendContact, int i) {
    }

    public void bindRecommendViewHolder(C1352v vVar, User user, int i, boolean z, int i2) {
    }

    public boolean canShowInnerNotification() {
        return false;
    }

    public void cancelDownload(Activity activity, int i) {
    }

    public boolean checkIMInsertRecommendContact() {
        return false;
    }

    public void checkPluginAndLoadLibrary(Context context, boolean z, String str, C35422a aVar) {
    }

    public boolean checkShowPushNotificationGuide(Context context) {
        return false;
    }

    public C35434a createGroupFollowMemberViewHolder(ViewGroup viewGroup) {
        return null;
    }

    public C1352v createRecommendContactItemView(ViewGroup viewGroup, C52682m<RecommendContact, Integer, C52860x> mVar) {
        return null;
    }

    public C1352v createRecommendViewHolder(Context context, HashMap<String, Boolean> hashMap, C35424c<User> cVar) {
        return null;
    }

    public void downloadPdf(Context context, String str, String str2) {
    }

    public boolean enableIM() {
        return true;
    }

    public boolean enableSendPic() {
        return false;
    }

    public void enterAddFriendsActivity(Context context) {
    }

    public void enterDetailActivity(Context context, String str, String str2, String str3, int i, int i2, String str4, View view, Bundle bundle) {
    }

    public void enterNotificationDetail(Context context, int i, int i2, String str) {
    }

    public void feedbackIm(String str, String str2) {
    }

    public Intent getAddFriendsActivityIntent(Context context, int i, int i2, String str, String str2) {
        return null;
    }

    public DownloadInfo getAppDownloadInfo(Context context, String str) {
        return null;
    }

    public String getAppLanguage() {
        return null;
    }

    public int getAssociativeEmoji() {
        return 0;
    }

    public Locale getCountryLocale() {
        return null;
    }

    public Activity getCurrentActivity() {
        return null;
    }

    public ViewGroup getCurrentDecorView(Activity activity) {
        return null;
    }

    public C35453h getFamiliarProxy() {
        return null;
    }

    public C26875a<User, C31995c> getFollowerFetchModel(String str, String str2) {
        return null;
    }

    public int getFriendToFamiliarId(int i, int i2, int i3) {
        return 0;
    }

    public String getFriendToFamiliarStr(int i, int i2, int i3) {
        return "";
    }

    public String getInnerPushEnterFrom() {
        return "";
    }

    public boolean getIsHotSearchBillboardEnable() {
        return true;
    }

    public C35458i getLiveProxy() {
        return null;
    }

    public C35461k getNewPlayerProxy() {
        return null;
    }

    public C35461k getPlayerProxy() {
        return null;
    }

    public int getRecommendContactPosition() {
        return -1;
    }

    public String getSessionId() {
        return "";
    }

    public String getToReportId() {
        return null;
    }

    public C35463m getUnder16Proxy() {
        return null;
    }

    public String getWsUrl() {
        return null;
    }

    public int getXPlanStyle() {
        return 0;
    }

    public C35462l getXrtcProxy() {
        return null;
    }

    public void handleXDownload(Activity activity, String str, C35430c cVar, boolean z, boolean z2) {
    }

    public boolean isCheckPlugin() {
        return false;
    }

    public boolean isEnableShowTeenageTip() {
        return false;
    }

    public boolean isFFSDKBind() {
        return false;
    }

    public boolean isInMainFeed() {
        return false;
    }

    public boolean isInPublishPage() {
        return false;
    }

    public boolean isMainPage() {
        return false;
    }

    public boolean isNeedToContinuePlayInAct() {
        return false;
    }

    public boolean isXPlanRedPacketOpen() {
        return false;
    }

    public void jumpToDeepLink(Context context, String str) {
    }

    public void jumpToLivePage(Context context, String str, String str2, String str3, Bundle bundle) {
    }

    public void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4) {
    }

    public void logIMShareHeadShow() {
    }

    public void logIMShareHeadShow(Map<String, String> map) {
    }

    public void makePhoneCall(Activity activity, String str, String str2, String str3, String str4) {
    }

    public void monitorMsgSendStatus(Map<String, String> map) {
    }

    public boolean needFollowToFollowBack() {
        return false;
    }

    public void openFFSdkSchema(String str) {
    }

    public void openLiveUrl(Context context, String str) {
    }

    public void openNotificationSetting(Context context, String str) {
    }

    public void openPrivacyReminder(Context context) {
    }

    public void openUrl(Context context, Uri uri, boolean z) {
    }

    public void pauseDownload(Activity activity, int i) {
    }

    public void popCaptcha(Activity activity, int i, C35426d dVar) {
    }

    public void postNotificationIndicator(int i, int i2) {
    }

    public void putSecUidToMap(String str, String str2) {
    }

    public void recordLastShareTypeIsIm() {
    }

    public void registerAppStateCallback(C27979p pVar) {
    }

    public void resumeDownload(Activity activity, int i) {
    }

    public void saveLogPb(String str, String str2) {
    }

    public void saveShareCommandToSp(String str) {
    }

    public void setCurrentLocaleLanguage(String str) {
    }

    public void setIMAwemeProvider(C35440f fVar) {
    }

    public void setNeedToContinueToPlay(boolean z) {
    }

    public void setSharePlayer(Object... objArr) {
    }

    public void shareToTargetChannel(Context context, String str) {
    }

    public boolean showNewStyle() {
        return false;
    }

    public void showNotification(String str, String str2) {
    }

    public void showPushNotification(String str) {
    }

    public void unSubscribeSession(int i, C35427e eVar) {
    }

    public void updateApk(Context context) {
    }

    public String getCurrentLocaleLanguage() {
        return Locale.CHINESE.getLanguage();
    }

    public C35468e getIMSetting() {
        return C35468e.m80176a();
    }
}
