package com.p683ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.style.ReplacementSpan;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.http.p1169a.p1172b.C19181f;
import com.p683ss.android.p1147d.C18941d.C18942a;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.live.p1921d.C36067b;
import com.p683ss.android.ugc.aweme.live.p1921d.C36068c;
import com.p683ss.android.ugc.aweme.profile.model.ActivityLinkResponse.LinkInfo;
import com.p683ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2083a.C39714a;
import com.p683ss.android.ugc.aweme.profile.p2088f.C39870a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39979m;
import com.p683ss.android.ugc.aweme.qrcode.C40952c;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C2201v;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.service.s */
public final class C40026s implements IProfileDependentComponentService {

    /* renamed from: a */
    public static final C40026s f101964a = new C40026s();

    /* renamed from: b */
    private final /* synthetic */ IProfileDependentComponentService f101965b;

    public final void activeTT(Context context, String str, String str2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "targetPackage");
        C52711k.m112240b(str2, "userId");
        this.f101965b.activeTT(context, str, str2);
    }

    public final C40016i adUtilsService() {
        return this.f101965b.adUtilsService();
    }

    public final <T> T apiExecuteGetJSONObject(int i, String str, Class<T> cls, String str2, C19181f fVar, boolean z, String str3) {
        String str4 = str;
        C52711k.m112240b(str, "url");
        Class<T> cls2 = cls;
        C52711k.m112240b(cls, "cls");
        C19181f fVar2 = fVar;
        C52711k.m112240b(fVar, "headerGroup");
        return this.f101965b.apiExecuteGetJSONObject(i, str4, cls2, str2, fVar2, z, str3);
    }

    public final <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(cls, "cls");
        return this.f101965b.apiExecuteGetJSONObject(str, cls, str2, z, str3);
    }

    public final boolean bindHintWindowsRulerCanShowBindDialog(boolean z) {
        return this.f101965b.bindHintWindowsRulerCanShowBindDialog(z);
    }

    public final boolean bindHintWindowsRulerGetShowCompleteProfileDialog(List<String> list, int i, int i2) {
        C52711k.m112240b(list, "urlList");
        return this.f101965b.bindHintWindowsRulerGetShowCompleteProfileDialog(list, i, i2);
    }

    public final boolean bindHintWindowsRulerShouldShowCompletePhone() {
        return this.f101965b.bindHintWindowsRulerShouldShowCompletePhone();
    }

    public final C40017j bridgeService() {
        return this.f101965b.bridgeService();
    }

    public final RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, C30462o oVar) {
        C52711k.m112240b(recyclerView, "recyclerView");
        C52711k.m112240b(oVar, "onHasMoreListener");
        return this.f101965b.buildBaseRecyclerView(recyclerView, oVar);
    }

    public final boolean canIM() {
        return this.f101965b.canIM();
    }

    public final void clearNinePatchBubbleState(Context context) {
        this.f101965b.clearNinePatchBubbleState(context);
    }

    public final C40018k contactUtilService() {
        return this.f101965b.contactUtilService();
    }

    public final Fragment createConnectedRelationFragment() {
        return this.f101965b.createConnectedRelationFragment();
    }

    public final Fragment createRecommendUserFragment() {
        return this.f101965b.createRecommendUserFragment();
    }

    public final void displayActivityLink(Context context, FrameLayout frameLayout, RemoteImageView remoteImageView, DmtTextView dmtTextView, ImageView imageView, ImageView imageView2, String str, String str2, LinkInfo linkInfo) {
        Context context2 = context;
        C52711k.m112240b(context, "context");
        this.f101965b.displayActivityLink(context2, frameLayout, remoteImageView, dmtTextView, imageView, imageView2, str, str2, linkInfo);
    }

    public final SpannableStringBuilder ellipsizeText2ExceptWidth(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4) {
        C52711k.m112240b(spannableStringBuilder, "spannable");
        C52711k.m112240b(textPaint, "paint");
        return this.f101965b.ellipsizeText2ExceptWidth(spannableStringBuilder, textPaint, i, i2, i3, i4);
    }

    public final C40019l enterpriseUtilsService() {
        return this.f101965b.enterpriseUtilsService();
    }

    public final C40020m favoritesMobUtilsService() {
        return this.f101965b.favoritesMobUtilsService();
    }

    public final int getBindFGGuideTextIndex() {
        return this.f101965b.getBindFGGuideTextIndex();
    }

    public final int getCloseWeiboEntry() {
        return this.f101965b.getCloseWeiboEntry();
    }

    public final String getGradientPunishWarningSettingsBubbleText() {
        return this.f101965b.getGradientPunishWarningSettingsBubbleText();
    }

    public final C40021n getMainTabPreference(Context context) {
        return this.f101965b.getMainTabPreference(context);
    }

    public final C52671b<Boolean, C52860x> getNotificationManagerHandleSystemCamera() {
        return this.f101965b.getNotificationManagerHandleSystemCamera();
    }

    public final C52688s<Activity, Fragment, Integer, String, String, C52860x> getStartCameraActivity() {
        return this.f101965b.getStartCameraActivity();
    }

    public final C39714a getTTDownloaderDepend() {
        return this.f101965b.getTTDownloaderDepend();
    }

    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4) {
        Activity activity2 = activity;
        C52711k.m112240b(activity, "activity");
        String str2 = str;
        C52711k.m112240b(str, "originalUrl");
        this.f101965b.gotoCropActivity(activity2, str2, z, f, i, i2, i3, i4);
    }

    public final void gotoCropActivity(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4) {
        Fragment fragment2 = fragment;
        C52711k.m112240b(fragment, "fragment");
        String str2 = str;
        C52711k.m112240b(str, "originalUrl");
        this.f101965b.gotoCropActivity(fragment2, str2, z, f, i, i2, i3, i4);
    }

    public final boolean hasUnreadStoryWithCheck(User user, User user2) {
        return this.f101965b.hasUnreadStoryWithCheck(user, user2);
    }

    public final String hexDigest(String str) {
        C52711k.m112240b(str, "string");
        return this.f101965b.hexDigest(str);
    }

    public final boolean isBigBriefIntroduce() {
        return this.f101965b.isBigBriefIntroduce();
    }

    public final boolean isDetailActivity(Activity activity) {
        return this.f101965b.isDetailActivity(activity);
    }

    public final boolean isEnableSettingDiskManager() {
        return this.f101965b.isEnableSettingDiskManager();
    }

    public final boolean isFtcBindEnable() {
        return this.f101965b.isFtcBindEnable();
    }

    public final boolean isStarAtlasCooperationEntryOpen() {
        return this.f101965b.isStarAtlasCooperationEntryOpen();
    }

    public final boolean isUserProfileActivity(Activity activity) {
        return this.f101965b.isUserProfileActivity(activity);
    }

    public final void launchProfileCoverCropActivity(FragmentActivity fragmentActivity, Aweme aweme) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(aweme, "aweme");
        this.f101965b.launchProfileCoverCropActivity(fragmentActivity, aweme);
    }

    public final void logShowProfileDiskManagerGuideView() {
        this.f101965b.logShowProfileDiskManagerGuideView();
    }

    public final C39870a mainAnimViewModel(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        return this.f101965b.mainAnimViewModel(fragmentActivity);
    }

    public final C2201v<Boolean> needShowDiskManagerGuideView() {
        return this.f101965b.needShowDiskManagerGuideView();
    }

    public final boolean needShowProfileGuideToFillAvatarAndNickname() {
        return this.f101965b.needShowProfileGuideToFillAvatarAndNickname();
    }

    public final C14234d newLiveBlurProcessor(int i, float f, C18942a aVar) {
        return this.f101965b.newLiveBlurProcessor(i, f, aVar);
    }

    public final C36068c newLivePlayHelper(Runnable runnable, C36067b bVar) {
        C52711k.m112240b(runnable, "onStreamPlay");
        C52711k.m112240b(bVar, "callback");
        return this.f101965b.newLivePlayHelper(runnable, bVar);
    }

    public final boolean onAntiCrawlerEvent(String str) {
        return this.f101965b.onAntiCrawlerEvent(str);
    }

    public final void onI18nVerificationViewClick(Context context, User user, String str, String str2) {
        C52711k.m112240b(user, "user");
        C52711k.m112240b(str, "type");
        this.f101965b.onI18nVerificationViewClick(context, user, str, str2);
    }

    public final void onPunishWarningClick(Context context) {
        C52711k.m112240b(context, "context");
        this.f101965b.onPunishWarningClick(context);
    }

    public final void onPunishWarningShow() {
        this.f101965b.onPunishWarningShow();
    }

    public final void openAvatarSettingPage(Context context, User user, String str) {
        this.f101965b.openAvatarSettingPage(context, user, str);
    }

    public final void openFestivalPageWithSchema(Context context, String str) {
        C52711k.m112240b(str, "linkUrl");
        this.f101965b.openFestivalPageWithSchema(context, str);
    }

    public final boolean platformInfoManagerHasPlatformBinded() {
        return this.f101965b.platformInfoManagerHasPlatformBinded();
    }

    public final void preloadMiniApp(String str) {
        this.f101965b.preloadMiniApp(str);
    }

    public final ReplacementSpan rankingTagSpan(BlueVBrandInfo blueVBrandInfo) {
        C52711k.m112240b(blueVBrandInfo, "info");
        return this.f101965b.rankingTagSpan(blueVBrandInfo);
    }

    public final void resetRecommendCountForFollowingFollowerActivity(Activity activity) {
        this.f101965b.resetRecommendCountForFollowingFollowerActivity(activity);
    }

    public final C1680ad<BaseResponse> setPrivateSettingItem(String str, int i) {
        C52711k.m112240b(str, "field");
        return this.f101965b.setPrivateSettingItem(str, i);
    }

    public final boolean shouldDoCaptcha(Exception exc) {
        return this.f101965b.shouldDoCaptcha(exc);
    }

    public final boolean shouldShowGradientPunishWarningBubble() {
        return this.f101965b.shouldShowGradientPunishWarningBubble();
    }

    public final boolean shouldUseRecyclerPartialUpdate() {
        return this.f101965b.shouldUseRecyclerPartialUpdate();
    }

    public final Object showBindPhoneDialog(NoticeView noticeView, Context context) {
        C52711k.m112240b(noticeView, "noticeBar");
        C52711k.m112240b(context, "context");
        return this.f101965b.showBindPhoneDialog(noticeView, context);
    }

    public final void showCaptchaDialog(C0654k kVar, C23459a aVar, C24493b bVar) {
        this.f101965b.showCaptchaDialog(kVar, aVar, bVar);
    }

    public final Object showCompletePhone(NoticeView noticeView) {
        C52711k.m112240b(noticeView, "noticeBar");
        return this.f101965b.showCompletePhone(noticeView);
    }

    public final Object showProfileCompleteView(NoticeView noticeView, Context context, OnClickListener onClickListener, OnClickListener onClickListener2, float f, boolean z) {
        C52711k.m112240b(noticeView, "noticeBar");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(onClickListener, "onClick");
        C52711k.m112240b(onClickListener2, "onCloseClick");
        return this.f101965b.showProfileCompleteView(noticeView, context, onClickListener, onClickListener2, f, z);
    }

    public final Object showProfileCompleteView(NoticeView noticeView, Context context, OnClickListener onClickListener, List<String> list, int i, int i2) {
        C52711k.m112240b(noticeView, "noticeBar");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(onClickListener, "onClick");
        C52711k.m112240b(list, "urlList");
        return this.f101965b.showProfileCompleteView(noticeView, context, onClickListener, list, i, i2);
    }

    public final void showProfileGuideToFillAvatarAndNickname(C0654k kVar, Bundle bundle) {
        this.f101965b.showProfileGuideToFillAvatarAndNickname(kVar, bundle);
    }

    public final void startAdsAppActivity(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "schema");
        this.f101965b.startAdsAppActivity(context, str);
    }

    public final void startChallengeAvatarModifyActivity(Activity activity, Challenge challenge) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(challenge, "challenge");
        this.f101965b.startChallengeAvatarModifyActivity(activity, challenge);
    }

    public final void startCrossPlatformActivity(Context context, String str) {
        C52711k.m112240b(context, "context");
        this.f101965b.startCrossPlatformActivity(context, str);
    }

    public final void startDiskManagerActivity(Context context) {
        C52711k.m112240b(context, "context");
        this.f101965b.startDiskManagerActivity(context);
    }

    public final void startDownloadControlSettingActivity(Activity activity, int i) {
        C52711k.m112240b(activity, "activity");
        this.f101965b.startDownloadControlSettingActivity(activity, i);
    }

    public final void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        this.f101965b.startHeaderDetailActivity(activity, bundle);
    }

    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, int i) {
        C52711k.m112240b(user, "user");
        this.f101965b.startHeaderDetailActivity(activity, view, user, z, i);
    }

    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2) {
        C52711k.m112240b(user, "user");
        this.f101965b.startHeaderDetailActivity(activity, view, user, z, z2);
    }

    public final void startHeaderDetailActivity(Activity activity, View view, String str, User user) {
        C52711k.m112240b(view, "preView");
        C52711k.m112240b(user, "user");
        this.f101965b.startHeaderDetailActivity(activity, view, str, user);
    }

    public final void startQRCodeActivityV2(Context context, C40952c cVar) {
        this.f101965b.startQRCodeActivityV2(context, cVar);
    }

    public final String typeVerificationEnterprise() {
        return this.f101965b.typeVerificationEnterprise();
    }

    public final void watchFromProfile(Context context, User user, boolean z, C39979m mVar) {
        this.f101965b.watchFromProfile(context, user, z, mVar);
    }

    public final void watchLiveMob(Context context, User user, String str, String str2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "enterMethod");
        this.f101965b.watchLiveMob(context, user, str, str2);
    }

    private C40026s() {
        IProfileDependentComponentService createIProfileDependentComponentServicebyMonsterPlugin = ProfileDependentComponentImpl.createIProfileDependentComponentServicebyMonsterPlugin();
        C52711k.m112236a((Object) createIProfileDependentComponentServicebyMonsterPlugin, "ServiceManager.get().get…onentService::class.java)");
        this.f101965b = createIProfileDependentComponentServicebyMonsterPlugin;
    }
}
