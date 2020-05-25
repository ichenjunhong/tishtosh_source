package com.p683ss.android.ugc.aweme.bridgeservice;

import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.view.View;
import android.widget.LinearLayout;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.p683ss.android.sdk.webview.C19750e;
import com.p683ss.android.ugc.aweme.account.util.C22254a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22863g;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27721d;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.festival.christmas.p1740a.C31360b;
import com.p683ss.android.ugc.aweme.global.config.settings.C32808a;
import com.p683ss.android.ugc.aweme.main.TabChangeManager;
import com.p683ss.android.ugc.aweme.newfollow.C37836a;
import com.p683ss.android.ugc.aweme.openauthorize.C38478c;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.profile.C39876i;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40266bq;
import com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileEditFragment;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.EditConfig.Builder;
import com.p683ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p683ss.android.ugc.aweme.setting.p2148ui.SettingNewVersionActivity;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43891e;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44371e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44624d;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44626f;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48342d;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.bridgeservice.IBridgeService */
public interface IBridgeService {

    /* renamed from: com.ss.android.ugc.aweme.bridgeservice.IBridgeService$a */
    public interface C23974a {
        /* renamed from: a */
        void mo49719a();

        /* renamed from: a */
        void mo49720a(ArrayList<String> arrayList);

        /* renamed from: b */
        void mo49721b(ArrayList<String> arrayList);
    }

    void afterLogIn();

    void afterLogOut();

    void afterSwitchAccount();

    void changeStatusBarMainTab(Activity activity, String str);

    void checkContentDialogNeedShow(Context context);

    void checkForUpdate(Activity activity, boolean z, String str);

    void checkOnLineTimer();

    C26916m checkShareContextWhenPublish(Object obj);

    void checkToCleanNoneUsedFiles();

    void checkToTransformMusDraft();

    C40266bq createAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2);

    C44624d createCommentStickerView(Context context, C46063m mVar, InteractStickerStruct interactStickerStruct, View view, C44626f fVar);

    C44624d createDonationStickerView(Context context, C46063m mVar, InteractStickerStruct interactStickerStruct, View view, C44626f fVar);

    LinearLayout createFollowFeedEmptyHeadView(Activity activity, String str, C39876i iVar);

    C23526a createMyProfileFragment();

    Fragment createPublishDialogFragment();

    C37836a createRecommendListPresenter();

    C39876i createThirdPartyAddFriendView(Activity activity);

    ProfileEditFragment createUserProfileEditFragment();

    C23526a createUserProfileFragment();

    void enterChildrenModeSetting(Activity activity);

    void enterMyFavorites(Activity activity, Bundle bundle);

    void enterProfileCropActivity(FragmentActivity fragmentActivity, Aweme aweme);

    void festivalShareFromH5(Context context, String str, C29789a aVar);

    boolean festivalShareVideoAfterPublish(Context context, C31360b bVar, Aweme aweme);

    Intent getAddFriendsActivityIntent(Context context, int i, int i2, String str, String str2);

    String getAdvertisingIdOb();

    List<C22254a> getAfterLoginActions(Bundle bundle);

    List<C22254a> getAfterSwitchAccountActions(Bundle bundle);

    String getAndroidId();

    SQLiteDatabase getAppOpenReadDB();

    List<C22863g> getDeeplinkCommands();

    C27721d getDiscoverFragment();

    boolean getEnableParamsOverrideDeeplinkhandleractivity();

    Intent getInviteUserListActivityIntent(Activity activity, int i);

    String getLocalLanguage(Context context);

    Class<?> getMyProfileFragmentClass();

    Fragment getNearbyFragment();

    C10762d getPolarisMethod(C19750e eVar, Activity activity);

    List<String> getPolarisMethodNames(C10762d dVar);

    Class<? extends Activity> getPrivacySettingActivity();

    Class<? extends Activity> getSettingActivityClass();

    C32808a getSettingsWatcher();

    int getShareIconResource();

    Fragment getSpecialTopicFragment();

    Class<? extends AmeBaseActivity> getSubmitFeedbackActivity();

    Intent getWebUriIntent(Context context, Uri uri);

    void goToPrivacyActivity(Context context);

    void handleOpenSdk(Intent intent, C23974a aVar);

    String handleUnlogin(TabChangeManager tabChangeManager, String str);

    void handleUnloginForSetting(SettingNewVersionActivity settingNewVersionActivity, HashSet<View> hashSet);

    boolean havePGCShow();

    void hideUploadRecover();

    void increaseViewedCount(boolean z);

    void initMiniAppInDeeplink(Context context, Uri uri);

    void initRouterConfig();

    boolean isClientKeyValid(C26916m mVar);

    boolean isFocusOnVideoTime();

    boolean isFromOpenSdk(Intent intent);

    boolean isHaveLatestTab();

    boolean isNeedContactsFriends(boolean z);

    boolean isNeedReplacePushPath();

    boolean isStartJourneyActivity(Activity activity);

    boolean isUploadContactsNoticeDialogShowing();

    boolean isUserMaterialDialogDealing();

    boolean judgeIsPolarisUrl(String str);

    void jumpToH5(String str, Context context);

    void jumpToH5(String str, Context context, Intent intent);

    boolean needCallbackOnActivityResumed(Activity activity);

    boolean needCheckCopyright();

    boolean needLiveInRecord();

    boolean needShowSafeInfoNotice();

    void onBackToOpenPlatform(Object obj);

    void onFeedStartForContentLanguageGuide(Context context, Aweme aweme);

    void onFeedStartForInitialChooseLanguage(Context context);

    void onFeedStop();

    void onFissionPendantViewClicked(Context context, String str);

    void onMainTabChanged(TabChangeManager tabChangeManager, String str);

    void onRecommendFeedStopForLanguage();

    void onReturnThirdPlatformFailed(Activity activity, C26916m mVar, String str, int i);

    void openLanguageTestDialog(Context context);

    void openSettingFragment(Context context);

    void openWallet(Activity activity);

    List<Class> preloadProfileClass();

    void readTaskPlayerCycle(int i, boolean z);

    void recordGuideBundle(Bundle bundle);

    void registerComponentAndStatus(EventActivityComponent eventActivityComponent, C43891e eVar);

    Dialog requestContactsPermissionAfterBindMobile(Context context, String str);

    void requestLocationPermissions(Activity activity, C47939a aVar);

    void setCurrentVideoPublicState(boolean z);

    void setCustomStatusBarInLayout(Activity activity);

    void setStatusBar(Activity activity, View view);

    void shareChallenge(Builder builder, String str);

    void showPublishDialogFragment(Object obj, C0654k kVar, C44371e eVar);

    void startAuthHalfDialog(FragmentActivity fragmentActivity, Bundle bundle, C38478c cVar);

    void startAuthNativeActivity(Context context, Bundle bundle, C48342d dVar);

    void startThirdSocialActivity(Context context, User user, int i);

    void switchToBioUrl(Activity activity, String str);

    void switchToSignature(Activity activity);

    void trackAppsFlyerEvent(String str, String str2);

    boolean tryOpenPolarisPage(Context context, String str);

    void tryRefreshLocation(Context context);

    void trySetJumpToFissionH5(String str);

    void tryShowMoneyGrowthDialog(Context context);

    void tryShowNotificationGuideDialog(Context context);

    void tryToShowPromoteProgram(Activity activity);

    void updateTTAbTest(AbTestModel abTestModel);

    void zlinkCallUri(Uri uri, boolean z, boolean z2, boolean z3);
}
