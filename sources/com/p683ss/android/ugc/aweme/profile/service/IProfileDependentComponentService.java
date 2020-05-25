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

/* renamed from: com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService */
public interface IProfileDependentComponentService {

    /* renamed from: com.ss.android.ugc.aweme.profile.service.IProfileDependentComponentService$a */
    public static final class C39997a {
    }

    void activeTT(Context context, String str, String str2);

    C40016i adUtilsService();

    <T> T apiExecuteGetJSONObject(int i, String str, Class<T> cls, String str2, C19181f fVar, boolean z, String str3);

    <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3);

    boolean bindHintWindowsRulerCanShowBindDialog(boolean z);

    boolean bindHintWindowsRulerGetShowCompleteProfileDialog(List<String> list, int i, int i2);

    boolean bindHintWindowsRulerShouldShowCompletePhone();

    C40017j bridgeService();

    RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, C30462o oVar);

    boolean canIM();

    void clearNinePatchBubbleState(Context context);

    C40018k contactUtilService();

    Fragment createConnectedRelationFragment();

    Fragment createRecommendUserFragment();

    void displayActivityLink(Context context, FrameLayout frameLayout, RemoteImageView remoteImageView, DmtTextView dmtTextView, ImageView imageView, ImageView imageView2, String str, String str2, LinkInfo linkInfo);

    SpannableStringBuilder ellipsizeText2ExceptWidth(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4);

    C40019l enterpriseUtilsService();

    C40020m favoritesMobUtilsService();

    int getBindFGGuideTextIndex();

    int getCloseWeiboEntry();

    String getGradientPunishWarningSettingsBubbleText();

    C40021n getMainTabPreference(Context context);

    C52671b<Boolean, C52860x> getNotificationManagerHandleSystemCamera();

    C52688s<Activity, Fragment, Integer, String, String, C52860x> getStartCameraActivity();

    C39714a getTTDownloaderDepend();

    void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4);

    void gotoCropActivity(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4);

    boolean hasUnreadStoryWithCheck(User user, User user2);

    String hexDigest(String str);

    boolean isBigBriefIntroduce();

    boolean isDetailActivity(Activity activity);

    boolean isEnableSettingDiskManager();

    boolean isFtcBindEnable();

    boolean isStarAtlasCooperationEntryOpen();

    boolean isUserProfileActivity(Activity activity);

    void launchProfileCoverCropActivity(FragmentActivity fragmentActivity, Aweme aweme);

    void logShowProfileDiskManagerGuideView();

    C39870a mainAnimViewModel(FragmentActivity fragmentActivity);

    C2201v<Boolean> needShowDiskManagerGuideView();

    boolean needShowProfileGuideToFillAvatarAndNickname();

    C14234d newLiveBlurProcessor(int i, float f, C18942a aVar);

    C36068c newLivePlayHelper(Runnable runnable, C36067b bVar);

    boolean onAntiCrawlerEvent(String str);

    void onI18nVerificationViewClick(Context context, User user, String str, String str2);

    void onPunishWarningClick(Context context);

    void onPunishWarningShow();

    void openAvatarSettingPage(Context context, User user, String str);

    void openFestivalPageWithSchema(Context context, String str);

    boolean platformInfoManagerHasPlatformBinded();

    void preloadMiniApp(String str);

    ReplacementSpan rankingTagSpan(BlueVBrandInfo blueVBrandInfo);

    void resetRecommendCountForFollowingFollowerActivity(Activity activity);

    C1680ad<BaseResponse> setPrivateSettingItem(String str, int i);

    boolean shouldDoCaptcha(Exception exc);

    boolean shouldShowGradientPunishWarningBubble();

    boolean shouldUseRecyclerPartialUpdate();

    Object showBindPhoneDialog(NoticeView noticeView, Context context);

    void showCaptchaDialog(C0654k kVar, C23459a aVar, C24493b bVar);

    Object showCompletePhone(NoticeView noticeView);

    Object showProfileCompleteView(NoticeView noticeView, Context context, OnClickListener onClickListener, OnClickListener onClickListener2, float f, boolean z);

    Object showProfileCompleteView(NoticeView noticeView, Context context, OnClickListener onClickListener, List<String> list, int i, int i2);

    void showProfileGuideToFillAvatarAndNickname(C0654k kVar, Bundle bundle);

    void startAdsAppActivity(Context context, String str);

    void startChallengeAvatarModifyActivity(Activity activity, Challenge challenge);

    void startCrossPlatformActivity(Context context, String str);

    void startDiskManagerActivity(Context context);

    void startDownloadControlSettingActivity(Activity activity, int i);

    void startHeaderDetailActivity(Activity activity, Bundle bundle);

    void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, int i);

    void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2);

    void startHeaderDetailActivity(Activity activity, View view, String str, User user);

    void startQRCodeActivityV2(Context context, C40952c cVar);

    String typeVerificationEnterprise();

    void watchFromProfile(Context context, User user, boolean z, C39979m mVar);

    void watchLiveMob(Context context, User user, String str, String str2);
}
