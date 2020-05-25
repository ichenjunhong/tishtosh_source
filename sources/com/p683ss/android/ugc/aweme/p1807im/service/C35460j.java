package com.p683ss.android.ugc.aweme.p1807im.service;

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
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35468e;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35422a;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35424c;
import com.p683ss.android.ugc.aweme.p1807im.service.p1899a.C35426d;
import com.p683ss.android.ugc.aweme.p1807im.service.p1902d.C35434a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import java.util.HashMap;
import java.util.Map;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52682m;

/* renamed from: com.ss.android.ugc.aweme.im.service.j */
public interface C35460j {
    void addImpressionId(int i, String str);

    void bindRecommendContactItemView(C1352v vVar, RecommendContact recommendContact, int i);

    void bindRecommendViewHolder(C1352v vVar, User user, int i, boolean z, int i2);

    boolean canShowInnerNotification();

    void cancelDownload(Activity activity, int i);

    boolean checkIMInsertRecommendContact();

    void checkPluginAndLoadLibrary(Context context, boolean z, String str, C35422a aVar);

    boolean checkShowPushNotificationGuide(Context context);

    C35434a createGroupFollowMemberViewHolder(ViewGroup viewGroup);

    C1352v createRecommendContactItemView(ViewGroup viewGroup, C52682m<RecommendContact, Integer, C52860x> mVar);

    C1352v createRecommendViewHolder(Context context, HashMap<String, Boolean> hashMap, C35424c<User> cVar);

    void downloadPdf(Context context, String str, String str2);

    boolean enableIM();

    boolean enableSendPic();

    void enterAddFriendsActivity(Context context);

    void enterDetailActivity(Context context, String str, String str2, String str3, int i, int i2, String str4, View view, Bundle bundle);

    void feedbackIm(String str, String str2);

    Intent getAddFriendsActivityIntent(Context context, int i, int i2, String str, String str2);

    DownloadInfo getAppDownloadInfo(Context context, String str);

    String getAppLanguage();

    int getAssociativeEmoji();

    Activity getCurrentActivity();

    ViewGroup getCurrentDecorView(Activity activity);

    C35453h getFamiliarProxy();

    C26875a<User, C31995c> getFollowerFetchModel(String str, String str2);

    String getFriendToFamiliarStr(int i, int i2, int i3);

    C35468e getIMSetting();

    String getInnerPushEnterFrom();

    boolean getIsHotSearchBillboardEnable();

    C35458i getLiveProxy();

    C35461k getPlayerProxy();

    int getRecommendContactPosition();

    String getToReportId();

    C35463m getUnder16Proxy();

    String getWsUrl();

    int getXPlanStyle();

    C35462l getXrtcProxy();

    void handleXDownload(Activity activity, String str, C35430c cVar, boolean z, boolean z2);

    boolean isCheckPlugin();

    boolean isEnableShowTeenageTip();

    boolean isFFSDKBind();

    boolean isInMainFeed();

    boolean isInPublishPage();

    boolean isMainPage();

    boolean isNeedToContinuePlayInAct();

    boolean isXPlanRedPacketOpen();

    void jumpToDeepLink(Context context, String str);

    void jumpToLivePage(Context context, String str, String str2, String str3, Bundle bundle);

    void jumpToMiniApp(Context context, String str, String str2, boolean z, String str3, String str4);

    void logIMShareHeadShow();

    void logIMShareHeadShow(Map<String, String> map);

    void makePhoneCall(Activity activity, String str, String str2, String str3, String str4);

    void monitorMsgSendStatus(Map<String, String> map);

    boolean needFollowToFollowBack();

    void openFFSdkSchema(String str);

    void openLiveUrl(Context context, String str);

    void openNotificationSetting(Context context, String str);

    void openPrivacyReminder(Context context);

    void openUrl(Context context, Uri uri, boolean z);

    void pauseDownload(Activity activity, int i);

    void popCaptcha(Activity activity, int i, C35426d dVar);

    void putSecUidToMap(String str, String str2);

    void recordLastShareTypeIsIm();

    void registerAppStateCallback(C27979p pVar);

    void saveLogPb(String str, String str2);

    void saveShareCommandToSp(String str);

    void setIMAwemeProvider(C35440f fVar);

    void setNeedToContinueToPlay(boolean z);

    void setSharePlayer(Object... objArr);

    void shareToTargetChannel(Context context, String str);

    boolean showNewStyle();

    void showNotification(String str, String str2);

    void showPushNotification(String str);

    void updateApk(Context context);
}
