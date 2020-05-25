package com.p683ss.android.ugc.aweme.bridgeservice;

import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.content.Intent;
import android.database.sqlite.SQLiteDatabase;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.SpannableStringBuilder;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.p675g.p676a.C10762d;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.p558e.C9741d;
import com.bytedance.p558e.p559a.C9735a;
import com.bytedance.p558e.p559a.C9736b;
import com.bytedance.router.SmartRouter;
import com.kakao.auth.KakaoSDK;
import com.kakao.auth.Session;
import com.p683ss.android.common.util.C18922i;
import com.p683ss.android.sdk.webview.C19750e;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.C20939c;
import com.p683ss.android.ugc.aweme.account.C20945d;
import com.p683ss.android.ugc.aweme.account.C20964e;
import com.p683ss.android.ugc.aweme.account.C21013l;
import com.p683ss.android.ugc.aweme.account.login.bean.OneLoginPhoneBean;
import com.p683ss.android.ugc.aweme.account.security.C22149d;
import com.p683ss.android.ugc.aweme.account.util.C22254a;
import com.p683ss.android.ugc.aweme.account.util.C22267i;
import com.p683ss.android.ugc.aweme.account.views.C22313c;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.C22835a.C22836a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22837aa;
import com.p683ss.android.ugc.aweme.app.C22835a.C22838ab;
import com.p683ss.android.ugc.aweme.app.C22835a.C22839ac;
import com.p683ss.android.ugc.aweme.app.C22835a.C22840ad;
import com.p683ss.android.ugc.aweme.app.C22835a.C22841ae;
import com.p683ss.android.ugc.aweme.app.C22835a.C22842af;
import com.p683ss.android.ugc.aweme.app.C22835a.C22843ag;
import com.p683ss.android.ugc.aweme.app.C22835a.C22845ah;
import com.p683ss.android.ugc.aweme.app.C22835a.C22846ai;
import com.p683ss.android.ugc.aweme.app.C22835a.C22847aj;
import com.p683ss.android.ugc.aweme.app.C22835a.C22848ak;
import com.p683ss.android.ugc.aweme.app.C22835a.C22850al;
import com.p683ss.android.ugc.aweme.app.C22835a.C22851am;
import com.p683ss.android.ugc.aweme.app.C22835a.C22852an;
import com.p683ss.android.ugc.aweme.app.C22835a.C22853ao;
import com.p683ss.android.ugc.aweme.app.C22835a.C22854ap;
import com.p683ss.android.ugc.aweme.app.C22835a.C22855aq;
import com.p683ss.android.ugc.aweme.app.C22835a.C22856ar;
import com.p683ss.android.ugc.aweme.app.C22835a.C22857b;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.C22835a.C22860d;
import com.p683ss.android.ugc.aweme.app.C22835a.C22861e;
import com.p683ss.android.ugc.aweme.app.C22835a.C22862f;
import com.p683ss.android.ugc.aweme.app.C22835a.C22863g;
import com.p683ss.android.ugc.aweme.app.C22835a.C22865i;
import com.p683ss.android.ugc.aweme.app.C22835a.C22866j;
import com.p683ss.android.ugc.aweme.app.C22835a.C22867k;
import com.p683ss.android.ugc.aweme.app.C22835a.C22868l;
import com.p683ss.android.ugc.aweme.app.C22835a.C22869m;
import com.p683ss.android.ugc.aweme.app.C22835a.C22870n;
import com.p683ss.android.ugc.aweme.app.C22835a.C22871o;
import com.p683ss.android.ugc.aweme.app.C22835a.C22872p;
import com.p683ss.android.ugc.aweme.app.C22835a.C22873q;
import com.p683ss.android.ugc.aweme.app.C22835a.C22874r;
import com.p683ss.android.ugc.aweme.app.C22835a.C22875s;
import com.p683ss.android.ugc.aweme.app.C22835a.C22876t;
import com.p683ss.android.ugc.aweme.app.C22835a.C22877u;
import com.p683ss.android.ugc.aweme.app.C22835a.C22878v;
import com.p683ss.android.ugc.aweme.app.C22835a.C22879w;
import com.p683ss.android.ugc.aweme.app.C22835a.C22880x;
import com.p683ss.android.ugc.aweme.app.C22835a.C22881y;
import com.p683ss.android.ugc.aweme.app.C22835a.C22882z;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22935a;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22937c;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22938d;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22939e;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22940f;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22941g;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22942h;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22943i;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22944j;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22946k;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22947l;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22948m;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22949n;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22950o;
import com.p683ss.android.ugc.aweme.app.C22934aj.C22951p;
import com.p683ss.android.ugc.aweme.app.C23057c;
import com.p683ss.android.ugc.aweme.app.C23131p;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.p1363a.p1364a.C22884a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.activity.AmeBaseActivity;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.component.EventActivityComponent;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService.C23974a;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.C24631ae;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.common.C26855c;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26916m;
import com.p683ss.android.ugc.aweme.common.p1596h.C26894c;
import com.p683ss.android.ugc.aweme.compliance.business.api.services.C27021a;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27721d;
import com.p683ss.android.ugc.aweme.discover.p1659ui.DiscoverFragment;
import com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28812a;
import com.p683ss.android.ugc.aweme.discover.p1665v4.p1667ui.C28824b;
import com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.aweme.favorites.p1705ui.UserFavoritesActivity;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30321al;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30800bj.C30801a;
import com.p683ss.android.ugc.aweme.festival.christmas.p1740a.C31360b;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.friends.p1792ui.IAddFriendsActivity;
import com.p683ss.android.ugc.aweme.friends.p1792ui.InviteUserListActivity;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32808a;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgChannelPopup;
import com.p683ss.android.ugc.aweme.i18n.BridgeService;
import com.p683ss.android.ugc.aweme.i18n.language.I18nManagerServiceImpl;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33102c;
import com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33115h;
import com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33119j;
import com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33120k;
import com.p683ss.android.ugc.aweme.i18n.language.p1806b.C33121l;
import com.p683ss.android.ugc.aweme.journey.C35781s;
import com.p683ss.android.ugc.aweme.journey.NewUserJourneyActivity;
import com.p683ss.android.ugc.aweme.journey.NewUserJourneyActivity.C35715a;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.location.C36255b.C36256a;
import com.p683ss.android.ugc.aweme.location.C36272l;
import com.p683ss.android.ugc.aweme.login.p1932ui.C36329b;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.main.TabChangeManager;
import com.p683ss.android.ugc.aweme.money.growth.C37154b;
import com.p683ss.android.ugc.aweme.money.growth.C37154b.C37159a;
import com.p683ss.android.ugc.aweme.money.growth.C37154b.C37159a.C37160a;
import com.p683ss.android.ugc.aweme.money.growth.C37164d;
import com.p683ss.android.ugc.aweme.money.growth.C37164d.C37165a;
import com.p683ss.android.ugc.aweme.money.growth.C37170f;
import com.p683ss.android.ugc.aweme.money.growth.C37170f.C37171a;
import com.p683ss.android.ugc.aweme.newfollow.C37836a;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38032a;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTTutorialVideoExperiment;
import com.p683ss.android.ugc.aweme.notification.util.C38443j;
import com.p683ss.android.ugc.aweme.openauthorize.BaseI18nAuthorizedActivity;
import com.p683ss.android.ugc.aweme.openauthorize.C38478c;
import com.p683ss.android.ugc.aweme.opensdk.share.C38525e;
import com.p683ss.android.ugc.aweme.opensdk.share.p2041a.C38516a;
import com.p683ss.android.ugc.aweme.opensdk.share.p2041a.C38516a.C38519a;
import com.p683ss.android.ugc.aweme.opensdk.share.share.C38526a;
import com.p683ss.android.ugc.aweme.opensdk.share.share.Share.Response;
import com.p683ss.android.ugc.aweme.p1336ak.C22553a;
import com.p683ss.android.ugc.aweme.p1336ak.C22564b;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1468bu.C24085m;
import com.p683ss.android.ugc.aweme.p1468bu.C24093p;
import com.p683ss.android.ugc.aweme.p1485by.C24469e.C24470a;
import com.p683ss.android.ugc.aweme.p1485by.C24469e.C24471b;
import com.p683ss.android.ugc.aweme.p1485by.C24469e.C24472c;
import com.p683ss.android.ugc.aweme.p1632di.C27613b;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import com.p683ss.android.ugc.aweme.p2377ug.poloris.C47479b;
import com.p683ss.android.ugc.aweme.p2377ug.poloris.C47485d;
import com.p683ss.android.ugc.aweme.profile.C39876i;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.BindAccountView;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40266bq;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40272bt;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40273bu;
import com.p683ss.android.ugc.aweme.profile.p2090ui.MusProfileEditFragment;
import com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileEditActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileEditBioUrlActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.ProfileEditFragment;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40242a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40246b;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.protection.p2093a.C40837a;
import com.p683ss.android.ugc.aweme.requesttask.idle.C41259i;
import com.p683ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.services.external.p2130ui.EditConfig.Builder;
import com.p683ss.android.ugc.aweme.setting.C41521ab;
import com.p683ss.android.ugc.aweme.setting.C41528ai;
import com.p683ss.android.ugc.aweme.setting.C41549aq;
import com.p683ss.android.ugc.aweme.setting.C41715t;
import com.p683ss.android.ugc.aweme.setting.experiment.C41601c;
import com.p683ss.android.ugc.aweme.setting.model.AbTestModel;
import com.p683ss.android.ugc.aweme.setting.p2148ui.I18nSettingNewVersionActivity;
import com.p683ss.android.ugc.aweme.setting.p2148ui.I18nSubmitFeedbackActivity;
import com.p683ss.android.ugc.aweme.setting.p2148ui.PrivacyActivity;
import com.p683ss.android.ugc.aweme.setting.p2148ui.SettingNewVersionActivity;
import com.p683ss.android.ugc.aweme.setting.serverpush.C41687b;
import com.p683ss.android.ugc.aweme.share.C41975an;
import com.p683ss.android.ugc.aweme.shortvideo.AVChallenge;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43890d;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43891e;
import com.p683ss.android.ugc.aweme.shortvideo.p2242ui.C44971ai;
import com.p683ss.android.ugc.aweme.shortvideo.publish.C44371e;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44624d;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44626f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2228c.C44546a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.p2229d.C44556a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45460w;
import com.p683ss.android.ugc.aweme.sticker.C46063m;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45883c.C45884a;
import com.p683ss.android.ugc.aweme.user.C47549c;
import com.p683ss.android.ugc.aweme.util.C47611a;
import com.p683ss.android.ugc.aweme.util.C47643v;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a.C47939a;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.android.ugc.aweme.wallet.C48223a;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48342d;
import com.p683ss.android.ugc.trill.abtest.C50295b;
import com.p683ss.android.ugc.trill.language.C50346h;
import com.p683ss.android.ugc.trill.language.C50350i;
import com.p683ss.android.ugc.trill.language.C50350i.C50351a;
import com.p683ss.android.ugc.trill.language.C50350i.C50355d;
import com.p683ss.android.ugc.trill.language.ChooseLanguageActivity;
import com.p683ss.android.ugc.trill.language.api.LanguageApi;
import com.p683ss.android.ugc.trill.p2514a.C50293a;
import com.p683ss.android.ugc.trill.p2516b.p2517a.C50310a;
import com.p683ss.android.ugc.trill.p2518c.C50312a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.lang.ref.SoftReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p064c.p065a.C1674ab;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bridgeservice.I18nBridgeService */
public class I18nBridgeService implements IBridgeService {
    private ExecutorService mExecutorService;

    public static IBridgeService getBridgeService_Monster() {
        if (C27991b.f73437U == null) {
            synchronized (IBridgeService.class) {
                if (C27991b.f73437U == null) {
                    C27991b.f73437U = C27613b.m66288a();
                }
            }
        }
        return (IBridgeService) C27991b.f73437U;
    }

    public void addAggregatedData(List<C38032a> list, Context context) {
    }

    public void addOneCard(int i) {
    }

    public void addSupportLanguageItems() {
    }

    public void checkOnLineTimer() {
    }

    public void checkToCleanNoneUsedFiles() {
    }

    public void checkToTransformMusDraft() {
    }

    public Fragment createAddFriendsFragment() {
        return null;
    }

    public C23526a createCollectPoiFragment() {
        return null;
    }

    public LinearLayout createFamiliarFeedEmptyHeadView(Activity activity, LinearLayout linearLayout, C39876i iVar) {
        return null;
    }

    public LinearLayout createFollowFeedEmptyHeadView(Activity activity, String str, C39876i iVar) {
        return null;
    }

    public Fragment createOneLoginStartFragment(OneLoginPhoneBean oneLoginPhoneBean, long j) {
        return null;
    }

    public C37836a createRecommendListPresenter() {
        return null;
    }

    public C39876i createThirdPartyAddFriendView(Activity activity) {
        return null;
    }

    public void endOneLogin() {
    }

    public void enterProfileCropActivity(FragmentActivity fragmentActivity, Aweme aweme) {
    }

    public void festivalShareFromH5(Context context, String str, C29789a aVar) {
    }

    public void festivalShareVideo(Context context, Dialog dialog, Aweme aweme, String str) {
    }

    public boolean festivalShareVideoAfterPublish(Context context, C31360b bVar, Aweme aweme) {
        return false;
    }

    public Class<? extends Activity> fillProfileActivityV2() {
        return null;
    }

    public String getChannelI18nName() {
        return "";
    }

    public Class<? extends AmeSSActivity> getChooseLanguageActivityClass() {
        return ChooseLanguageActivity.class;
    }

    public int getLayoutId(int i) {
        return 0;
    }

    public Class<? extends Activity> getMainActivity() {
        return null;
    }

    public Class<?> getMyProfileFragmentClass() {
        return C40242a.class;
    }

    public Class<? extends Activity> getPrivacySettingActivity() {
        return PrivacyActivity.class;
    }

    public String getReportUrl() {
        return "https://www.tiktokv.com/aweme/in_app/report/";
    }

    public Fragment getSpecialTopicFragment() {
        return null;
    }

    public Class<? extends AmeBaseActivity> getSubmitFeedbackActivity() {
        return I18nSubmitFeedbackActivity.class;
    }

    public Class getVerifyActivity() {
        return null;
    }

    public Intent getWebUriIntent(Context context, Uri uri) {
        return null;
    }

    public boolean havePGCShow() {
        return false;
    }

    public View inflateFamiliarFullFeedImageView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public View inflateFamiliarFullFeedVideoView(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        return null;
    }

    public void initMiniAppInDeeplink(Context context, Uri uri) {
    }

    public void initOneLogin(Context context, String str, C36329b<OneLoginPhoneBean> bVar) {
    }

    public boolean isChannelSubTabNearby() {
        return false;
    }

    public boolean isFocusOnVideoTime() {
        return false;
    }

    public boolean isForceEnableColorFilter() {
        return false;
    }

    public boolean isHaveLatestTab() {
        return false;
    }

    public boolean isNeedContactsFriends(boolean z) {
        return !z ? true : true;
    }

    public boolean isNeedLightStatusBar() {
        return true;
    }

    public boolean isNeedReplacePushPath() {
        return false;
    }

    public boolean isUploadContactsNoticeDialogShowing() {
        return false;
    }

    public boolean isUserMaterialDialogDealing() {
        return false;
    }

    public boolean isVideoCoverFrameDarkColor() {
        return false;
    }

    public boolean needCallbackOnActivityResumed(Activity activity) {
        return false;
    }

    public boolean needCheckCopyright() {
        return false;
    }

    public boolean needCompatWithMusAudio() {
        return false;
    }

    public boolean needForceDirectShoot() {
        return false;
    }

    public void observeActivityRpInfo(C0184k kVar, C40272bt btVar) {
    }

    public void onPageSelected() {
    }

    public void openDouPlus(Context context) {
    }

    public void registerComponentAndStatus(EventActivityComponent eventActivityComponent, C43891e eVar) {
    }

    public Dialog requestContactsPermissionAfterBindMobile(Context context, String str) {
        return null;
    }

    public Class<? extends Activity> selectCountryActivity() {
        return null;
    }

    public void sendEnterChannelEvent(String str, String str2) {
    }

    public void sendEnterSubChannelEvent(String str, String str2) {
    }

    public void sendHomepageFreshEvent(String str, String str2) {
    }

    public void setCurrentVideoPublicState(boolean z) {
    }

    public void setHasActive() {
    }

    public void setHasShowToutiaoLink(BindAccountView bindAccountView) {
    }

    public void setHasShowedUserAntiAddictionViewToday() {
    }

    public boolean shouldShowVSButton(Aweme aweme) {
        return false;
    }

    public Dialog showMobileProtocolDialog(Activity activity, boolean z) {
        return null;
    }

    public Dialog showPrivacyDialog(Activity activity) {
        return null;
    }

    public Dialog showProtocolDialog(Activity activity) {
        return null;
    }

    public void startAuthHalfDialog(FragmentActivity fragmentActivity, Bundle bundle, C38478c cVar) {
    }

    public void startMicroAppGroupActivity(Activity activity, Bundle bundle) {
    }

    public void tryShowUserMaterialAuthDialog(Context context) {
    }

    public void tryToShowPromoteProgram(Activity activity) {
    }

    public void zlinkCallUri(Uri uri, boolean z, boolean z2, boolean z3) {
    }

    private void syncPushSetting() {
        C41687b.f105513b.mo85532a(null, false);
    }

    public C23526a createMyProfileFragment() {
        return new C40242a();
    }

    public Fragment createPublishDialogFragment() {
        return new C44971ai();
    }

    public ProfileEditFragment createUserProfileEditFragment() {
        return new MusProfileEditFragment();
    }

    public C23526a createUserProfileFragment() {
        return new C40246b();
    }

    public String getAndroidId() {
        return C50312a.m108585b();
    }

    public SQLiteDatabase getAppOpenReadDB() {
        return C50293a.m108558a().f126179b;
    }

    public SQLiteDatabase getAppOpenWriteDB() {
        return C50293a.m108558a().f126178a;
    }

    public C22564b getDouLabService() {
        return new C22553a();
    }

    public Fragment getNearbyFragment() {
        return new C30753ai();
    }

    public C41549aq getSettingManager() {
        return new C41715t();
    }

    public C32808a getSettingsWatcher() {
        return new C41521ab();
    }

    public int getShareIconResource() {
        return C41975an.m91942a();
    }

    public void getUserSettings() {
        C40869c.f104035d.mo83204d();
    }

    public boolean needShowSafeInfoNotice() {
        return C22149d.f59720h.mo46229a();
    }

    public void onFeedStop() {
        C33115h.m76117a().mo70144b();
    }

    public List preloadProfileClass() {
        return new ArrayList();
    }

    public boolean getEnableParamsOverrideDeeplinkhandleractivity() {
        try {
            return C32816h.m75716b().getEnableParamsOverrideDeeplinkhandleractivity().booleanValue();
        } catch (Exception unused) {
            return false;
        }
    }

    public Class<? extends Activity> getSettingActivityClass() {
        if (C47915gg.m103651b()) {
            return C27021a.f71325a.provideChildrenModeSettingActivityClass();
        }
        return I18nSettingNewVersionActivity.class;
    }

    public void hideUploadRecover() {
        C47718bf.m103288a(new C43890d(true));
    }

    public void afterLogOut() {
        if (!(KakaoSDK.getAdapter() == null || Session.getCurrentSession() == null)) {
            Session.getCurrentSession().close();
        }
        C50310a.m108583d();
        C40869c.m90389t();
    }

    public String getAdvertisingIdOb() {
        if (C50312a.f126199b == null) {
            if (C50312a.m108588e()) {
                return C50312a.f126200c.getString("key_gaid", "");
            }
            C50312a.m108589f();
        }
        return C50312a.f126199b;
    }

    public void initRouterConfig() {
        SmartRouter.configRouter("snssdk1180").withOtherSchemes(new String[]{"aweme", C23057c.f61423a});
    }

    public void onRecommendFeedStopForLanguage() {
        C33115h.m76117a().mo70144b();
        C50346h hVar = C50351a.m108630a().f126267d;
        if (hVar != null) {
            hVar.mo98247a();
        }
    }

    public void afterSwitchAccount() {
        if (!(KakaoSDK.getAdapter() == null || Session.getCurrentSession() == null)) {
            Session.getCurrentSession().close();
        }
        C50310a.m108583d();
        C40869c.m90389t();
        if (C40869c.m90371a().mo83165b() != 0) {
            C23131p.m56692a("not_clear_old_settings", "", null);
        }
        syncPushSetting();
    }

    public C27721d getDiscoverFragment() {
        if (!C47915gg.m103651b() && (NewDiscoverV4Experiment.m69623g() == 1 || NewDiscoverV4Experiment.m69623g() == 2)) {
            return new C28812a();
        }
        if (!C47915gg.m103651b() && NewDiscoverV4Experiment.m69620d()) {
            return new C28824b();
        }
        DiscoverFragment discoverFragment = new DiscoverFragment();
        discoverFragment.setArguments(new Bundle(1));
        return discoverFragment;
    }

    public boolean needLiveInRecord() {
        if (!C36173w.m81665a().getLiveServiceAdapter().mo74827a() || !C20902b.m53242a().isLogin() || C45460w.m99064a()) {
            return false;
        }
        return true;
    }

    public void afterLogIn() {
        boolean z;
        C50350i a = C50351a.m108630a();
        String c = a.f126264a.mo75727c();
        C40837a a2 = C40869c.m90371a();
        JSONObject jSONObject = new JSONObject();
        if (!TextUtils.isEmpty(c)) {
            jSONObject.put("content_language_not_login", c);
        }
        if (a2.mo83165b() != 0) {
            jSONObject.put("vpa_content_choice_not_login", a2.mo83165b());
        }
        if (jSONObject.length() > 0) {
            ((LanguageApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(LanguageApi.class)).setUnloginContentPreference("settings_not_login", jSONObject.toString()).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a()).mo6314a((C1674ab<? super T>) new C50355d<Object>());
            z = true;
        } else {
            z = false;
        }
        a.f126264a.mo75724a(false);
        a.f126264a.mo75723a("");
        a.f126265b = false;
        a.mo98253a();
        if (!z) {
            syncPushSetting();
        }
        if (!C47915gg.m103651b() && C10181b.m20511a().mo18172a(MTTutorialVideoExperiment.class, true, "mt_tutorial_video", 31744, false)) {
            C35857a.m81005d().mo74519a(new C41259i()).mo74520a();
        }
        C47718bf.m103288a(new C30321al());
    }

    public int getSwipeUpGuideType() {
        new C41601c();
        Integer valueOf = Integer.valueOf(0);
        C9735a aVar = new C9735a("com.ss.android.ugc.aweme.setting.experiment.ClientSwipeUpGuideExperiment", ProfileUiInitOptimizeEnterThreshold.DEFAULT, "abtest", new String[]{"app_skin_white", "back_refresh_strategy", "client_boolean_empty_experiment", "client_empty_experiment", "client_enum_forcelogin_experiment", "client_string_empty_experiment", "douyin_privacy_show", "new_user_journey", "new_user_journey_collect_gender", "new_user_strategy", "support_facebook_deeplink", "swipe_up_type", "video_sound_guide_new_user"}, new C9736b("1137317", 0.34d, Integer.valueOf(0)), new C9736b("1137318", 0.33d, Integer.valueOf(1)), new C9736b("1137319", 0.33d, Integer.valueOf(2)));
        return ((Integer) C9741d.m19511a("swipe_up_type", Integer.class, valueOf, false, true, aVar)).intValue();
    }

    public List<C22863g> getDeeplinkCommands() {
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(new C22951p());
        arrayList2.add(new C22944j());
        arrayList2.add(new C22941g());
        arrayList2.add(new C22950o());
        arrayList2.add(new C22949n());
        arrayList2.add(new C22937c());
        arrayList2.add(new C22946k());
        arrayList2.add(new C22938d());
        arrayList2.add(new C22948m());
        arrayList2.add(new C22947l());
        arrayList2.add(new C22940f());
        arrayList2.add(new C22935a());
        arrayList2.add(new C22942h());
        arrayList2.add(new C22939e());
        arrayList2.add(new C22943i());
        arrayList.addAll(arrayList2);
        ArrayList arrayList3 = new ArrayList();
        arrayList3.add(new C22837aa());
        arrayList3.add(new C22872p());
        arrayList3.add(new C22869m());
        arrayList3.add(new C22881y());
        arrayList3.add(new C22865i());
        arrayList3.add(new C22882z());
        arrayList3.add(new C22850al());
        arrayList3.add(new C22851am());
        arrayList3.add(new C22853ao());
        arrayList3.add(new C22836a());
        arrayList3.add(new C22858c());
        arrayList3.add(new C22875s());
        arrayList3.add(new C22879w());
        arrayList3.add(new C22876t());
        arrayList3.add(new C22841ae());
        arrayList3.add(new C22861e());
        arrayList3.add(new C22878v());
        arrayList3.add(new C22847aj());
        arrayList3.add(new C22842af());
        arrayList3.add(new C22870n());
        arrayList3.add(new C22871o());
        arrayList3.add(new C22846ai());
        arrayList3.add(new C22877u());
        arrayList3.add(new C22866j());
        arrayList3.add(new C22868l());
        arrayList3.add(new C22840ad());
        arrayList3.add(new C22880x());
        arrayList3.add(new C22856ar());
        arrayList3.add(new C22867k());
        arrayList3.add(new C22860d());
        arrayList3.add(new C22862f());
        arrayList3.add(new C22852an());
        arrayList3.add(new C22845ah());
        arrayList3.add(new C22848ak());
        arrayList3.add(new C22843ag());
        arrayList3.add(new C22873q());
        arrayList3.add(new C22855aq());
        arrayList3.add(new C22838ab());
        arrayList3.add(new C22839ac());
        arrayList3.add(new C22854ap());
        arrayList3.add(new C22874r());
        arrayList3.add(new C22857b());
        arrayList.addAll(arrayList3);
        return arrayList;
    }

    public void checkContentDialogNeedShow(Context context) {
        C50351a.m108630a().mo98255b(context);
    }

    public C26916m checkShareContextWhenPublish(Object obj) {
        return C38526a.m85863a(obj);
    }

    public C26916m createShareContext(Intent intent) {
        return C38526a.m85862a(intent);
    }

    public void increaseViewedCount(boolean z) {
        C0013i.m18a(C47643v.f120115a, (Executor) C0013i.f24a);
    }

    public boolean isClientKeyValid(C26916m mVar) {
        return C38526a.m85866a((C26855c) mVar);
    }

    public boolean judgeIsPolarisUrl(String str) {
        return C47485d.m102883a(str);
    }

    public void openWallet(Activity activity) {
        C48223a.m104473a(activity, IWalletMainProxy.KEY_PAGE_INDEX);
    }

    public void recordGuideBundle(Bundle bundle) {
        C38443j.m85761a(bundle, 0);
    }

    public void setCustomStatusBarInLayout(Activity activity) {
        C23729p.m58263b(activity);
        C23729p.m58269c(activity);
    }

    public void setStatusBar(Activity activity) {
        C23729p.m58263b(activity);
        C23729p.m58269c(activity);
    }

    public void switchToSignature(Activity activity) {
        ProfileEditActivity.m89261a(activity, null);
    }

    public void tryRefreshLocation(Context context) {
        C36272l.m81897a(context).mo75074b();
    }

    public void goToPrivacyActivity(Context context) {
        context.startActivity(new Intent(context, PrivacyActivity.class));
    }

    public boolean isFromOpenSdk(Intent intent) {
        if (!TextUtils.isEmpty(intent.getStringExtra("_aweme_open_sdk_params_client_key"))) {
            return true;
        }
        return false;
    }

    public boolean isInMyProfilePage(Context context) {
        if (context instanceof MainActivity) {
            return ((MainActivity) context).getCurFragment() instanceof C40242a;
        }
        return false;
    }

    public void trySetJumpToFissionH5(String str) {
        if (C47485d.m102883a(str)) {
            C30801a.m72195a(true);
        }
    }

    public void enterChildrenModeSetting(Activity activity) {
        if (activity != null && !activity.isFinishing()) {
            SmartRouter.buildRoute((Context) activity, "//childrenmode/setting").open();
        }
    }

    public List<C22254a> getAfterSwitchAccountActions(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        C20939c.m53282a(bundle, arrayList);
        C20939c.m53283b(bundle, arrayList);
        C20939c.m53285d(bundle, arrayList);
        C20939c.m53284c(bundle, arrayList);
        return arrayList;
    }

    public List<String> getPolarisMethodNames(C10762d dVar) {
        if (!(dVar instanceof C47479b)) {
            return null;
        }
        C47479b bVar = (C47479b) dVar;
        if (bVar.f119750a != null) {
            return bVar.f119750a.mo23711a();
        }
        return null;
    }

    public void onFeedStartForInitialChooseLanguage(Context context) {
        C33115h a = C33115h.m76117a();
        a.f85950b = true;
        if (a.f85951c == null || a.f85951c.get() == null) {
            a.f85951c = new SoftReference<>(context);
        }
        a.mo70143a(context);
    }

    public void openSettingFragment(Context context) {
        if (context != null) {
            Intent intent = new Intent(context, I18nSettingNewVersionActivity.class);
            intent.setFlags(67108864);
            intent.putExtra("from_pro_account", true);
            context.startActivity(intent);
        }
    }

    public void updateTTAbTest(AbTestModel abTestModel) {
        try {
            try {
                C50295b.m108561a().f126181a = new JSONObject(com.alibaba.fastjson.JSONObject.toJSONString(abTestModel));
            } catch (JSONException unused) {
            }
        } catch (Exception unused2) {
        }
    }

    public String getLocalLanguage(Context context) {
        String language = C33102c.m76088a(context).getLanguage();
        if (TextUtils.equals(language, "in")) {
            language = "id";
        }
        if (TextUtils.equals(language, "pt")) {
            language = "pt_BR";
        }
        if (TextUtils.equals(language, "zh")) {
            language = "zh_Hant";
        }
        if (TextUtils.equals(language, "km")) {
            return "en";
        }
        return language;
    }

    public boolean isStartJourneyActivity(Activity activity) {
        C35715a aVar = NewUserJourneyActivity.f91681g;
        C52711k.m112240b(activity, "activity");
        if (activity.getIntent().getBooleanExtra("new_user_journey", false) || !C35781s.f91909n.mo74441e() || C35781s.f91897b) {
            return false;
        }
        C35715a.m80706a(activity, false);
        return true;
    }

    public void onBackToOpenPlatform(Object obj) {
        String str;
        final C26916m a = C38526a.m85863a(obj);
        if (C38526a.m85866a((C26855c) a)) {
            final Activity b = AwemeApplication.m56200b();
            if (b != null) {
                if (TextUtils.isEmpty(a.mAppName)) {
                    str = b.getString(R.string.dxa);
                } else {
                    str = a.mAppName;
                }
                new C38516a(b, str, "share success", new C38519a() {
                    /* renamed from: b */
                    public final void mo49718b() {
                        Intent intent = new Intent();
                        intent.setAction("com.aweme.opensdk.action.stay.in.dy");
                        b.sendBroadcast(intent);
                    }

                    /* renamed from: a */
                    public final void mo49717a() {
                        C38525e eVar = new C38525e(b, a);
                        if (eVar.f98005a != null) {
                            Response response = new Response();
                            response.errorCode = 0;
                            response.state = eVar.f98005a.mState;
                            response.subErrorCode = 0;
                            eVar.mo78434b(eVar.f98005a, response);
                        }
                        C26890h.m65011a("return_to_origin_app", C23089d.m56640a().mo47829a("launch_from", a.mClientKey).f61491a);
                    }
                }).show();
            }
        }
    }

    public void addExtraPlayCommonParam(C18922i iVar) {
        iVar.mo38778a("app_language", I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getAppLanguage());
        iVar.mo38778a("language", I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getSysLanguage());
        iVar.mo38778a("region", I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getRegion());
        iVar.mo38778a("sys_region", I18nManagerServiceImpl.createI18nManagerServicebyMonsterPlugin().getSysRegion());
        iVar.mo38778a("carrier_region", C35837h.m80981f());
        String accountRegion = C20902b.m53242a().getCurUser().getAccountRegion();
        if (accountRegion != null && !accountRegion.isEmpty()) {
            iVar.mo38778a("account_region", accountRegion);
        }
    }

    public List<C22254a> getAfterLoginActions(Bundle bundle) {
        ArrayList arrayList = new ArrayList();
        arrayList.add(new C23977b(bundle));
        if (bundle.getBoolean("new_user_need_set_pass_word", false)) {
            arrayList.add(new C20945d(bundle));
        }
        if (bundle.getBoolean("new_user_need_set_username", false)) {
            arrayList.add(new C20964e(bundle));
        }
        C20939c.m53282a(bundle, arrayList);
        C20939c.m53283b(bundle, arrayList);
        arrayList.add(new C21013l(bundle));
        if (bundle.getBoolean("is_show_thirdparty_friends", false)) {
            arrayList.add(new C23978c(bundle));
        }
        C20939c.m53285d(bundle, arrayList);
        C20939c.m53284c(bundle, arrayList);
        return arrayList;
    }

    public void tryShowMoneyGrowthDialog(Context context) {
        C37159a aVar = C37154b.f94832g;
        C52711k.m112240b(context, "context");
        if (C37154b.f94828c) {
            C37154b.f94828c = false;
            return;
        }
        UgChannelPopup c = C37165a.m83405b().mo76490c();
        if (c != null) {
            if (!C52711k.m112239a((Object) Looper.getMainLooper(), (Object) Looper.myLooper())) {
                new Handler(Looper.getMainLooper()).post(new C37160a(context, c));
                return;
            }
            aVar.mo76479a(context, c);
        }
    }

    public void openLanguageTestDialog(Context context) {
        String str;
        C1161a aVar = new C1161a(context);
        StringBuilder sb = new StringBuilder("原生开屏:");
        sb.append(C25945k.m62915f().mo53878b());
        sb.append("\n系统语言:");
        sb.append(C23723j.m58217a().getConfiguration().locale.getLanguage());
        sb.append("\n国家:");
        sb.append(C35837h.m80980e());
        sb.append("\n是否展示过:");
        switch (C33121l.m76123a(0)) {
            case 0:
                str = "noSet";
                break;
            case 1:
                str = "待展示";
                break;
            case 2:
                str = "有条件未满足，永不展示";
                break;
            case 3:
                str = "已展示过";
                break;
            default:
                str = "未知";
                break;
        }
        sb.append(str);
        sb.append("\nFirstLaunch:");
        sb.append(C30578o.m71565a());
        aVar.mo3770b((CharSequence) sb.toString());
        aVar.mo3771b((CharSequence) "重置弹窗展示标记", C33119j.f85960a);
        aVar.mo3765a((CharSequence) "ok", C33120k.f85961a);
        aVar.mo3775c();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:36:0x00d2, code lost:
        if (r2 != 45) goto L_0x00d4;
     */
    /* JADX WARNING: Removed duplicated region for block: B:39:0x00e8 A[Catch:{ Exception -> 0x010e }] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void tryShowNotificationGuideDialog(android.content.Context r13) {
        /*
            r12 = this;
            java.lang.String r0 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r0)
            com.ss.android.ugc.aweme.antiaddic.lock.b r0 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()
            java.lang.String r1 = "LegacyServiceUtils.getTimeLockRulerService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r0 = r0.mo47103a()
            r1 = 0
            if (r0 != 0) goto L_0x0112
            com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.NotificationGuideExperiment> r3 = com.p683ss.android.ugc.aweme.experiment.NotificationGuideExperiment.class
            r4 = 1
            java.lang.String r5 = "show_notification_guide_dialog"
            r6 = 31744(0x7c00, float:4.4483E-41)
            r7 = 0
            boolean r0 = r2.mo18172a(r3, r4, r5, r6, r7)
            if (r0 != 0) goto L_0x0029
            goto L_0x0112
        L_0x0029:
            android.os.Bundle r0 = com.p683ss.android.ugc.aweme.notification.util.C38443j.f97842a
            if (r0 == 0) goto L_0x0111
            boolean r2 = com.p683ss.android.ugc.aweme.p2108r.p2110b.C41051a.m90720a(r13)
            if (r2 != 0) goto L_0x010e
            com.ss.android.ugc.aweme.notification.util.j r2 = com.p683ss.android.ugc.aweme.notification.util.C38443j.f97847f
            com.ss.android.ugc.aweme.bl.b r2 = com.p683ss.android.ugc.aweme.p1439bl.C23859b.m58575b()
            java.lang.String r3 = "key_cross_push_notification_guide"
            long r2 = r2.mo49473c(r13, r3)
            long r4 = com.p683ss.android.ugc.aweme.notification.util.C38443j.m85758a(r13)
            long r6 = java.lang.System.currentTimeMillis()
            long r6 = r6 - r2
            int r2 = com.p683ss.android.ugc.aweme.notification.util.C38443j.f97844c
            long r2 = (long) r2
            r8 = 86400000(0x5265c00, double:4.2687272E-316)
            long r2 = r2 * r8
            r8 = 0
            int r9 = (r6 > r2 ? 1 : (r6 == r2 ? 0 : -1))
            if (r9 <= 0) goto L_0x0062
            int r2 = com.p683ss.android.ugc.aweme.notification.util.C38443j.f97843b
            long r2 = (long) r2
            int r6 = (r4 > r2 ? 1 : (r4 == r2 ? 0 : -1))
            if (r6 >= 0) goto L_0x0062
            boolean r2 = com.p683ss.android.ugc.aweme.notification.util.C38443j.f97846e
            if (r2 == 0) goto L_0x0062
            r2 = 1
            goto L_0x0063
        L_0x0062:
            r2 = 0
        L_0x0063:
            if (r2 == 0) goto L_0x010e
            java.lang.String r2 = "from_where"
            r3 = -1
            int r2 = r0.getInt(r2, r3)
            r4 = r13
            android.app.Activity r4 = (android.app.Activity) r4     // Catch:{ Exception -> 0x010e }
            com.ss.android.ugc.aweme.notification.util.j$a r5 = new com.ss.android.ugc.aweme.notification.util.j$a     // Catch:{ Exception -> 0x010e }
            r5.<init>(r2, r13)     // Catch:{ Exception -> 0x010e }
            android.content.DialogInterface$OnClickListener r5 = (android.content.DialogInterface.OnClickListener) r5     // Catch:{ Exception -> 0x010e }
            com.ss.android.ugc.aweme.notification.util.j$b r6 = new com.ss.android.ugc.aweme.notification.util.j$b     // Catch:{ Exception -> 0x010e }
            r6.<init>(r2, r13)     // Catch:{ Exception -> 0x010e }
            android.content.DialogInterface$OnClickListener r6 = (android.content.DialogInterface.OnClickListener) r6     // Catch:{ Exception -> 0x010e }
            com.bytedance.ies.dmt.ui.b.a$a r7 = new com.bytedance.ies.dmt.ui.b.a$a     // Catch:{ Exception -> 0x010e }
            r9 = r4
            android.content.Context r9 = (android.content.Context) r9     // Catch:{ Exception -> 0x010e }
            r7.<init>(r9)     // Catch:{ Exception -> 0x010e }
            r9 = 2132544812(0x7f1c0d2c, float:2.0742796E38)
            com.bytedance.ies.dmt.ui.b.a$a r5 = r7.mo18886a(r9, r5)     // Catch:{ Exception -> 0x010e }
            r7 = 2132549069(0x7f1c1dcd, float:2.075143E38)
            com.bytedance.ies.dmt.ui.b.a$a r5 = r5.mo18900b(r7, r6)     // Catch:{ Exception -> 0x010e }
            r6 = 2132548128(0x7f1c1a20, float:2.0749522E38)
            com.bytedance.ies.dmt.ui.b.a$a r5 = r5.mo18885a(r6)     // Catch:{ Exception -> 0x010e }
            boolean r6 = com.p683ss.android.ugc.aweme.language.C35837h.m80977b()     // Catch:{ Exception -> 0x010e }
            r7 = 2132548124(0x7f1c1a1c, float:2.0749513E38)
            r9 = 2132548127(0x7f1c1a1f, float:2.074952E38)
            r10 = 2132548126(0x7f1c1a1e, float:2.0749518E38)
            r11 = 2132548125(0x7f1c1a1d, float:2.0749516E38)
            if (r6 == 0) goto L_0x00c0
            switch(r2) {
                case 0: goto L_0x00bc;
                case 1: goto L_0x00b8;
                case 2: goto L_0x00b4;
                case 3: goto L_0x00b0;
                default: goto L_0x00af;
            }     // Catch:{ Exception -> 0x010e }
        L_0x00af:
            goto L_0x00d4
        L_0x00b0:
            r3 = 2132548124(0x7f1c1a1c, float:2.0749513E38)
            goto L_0x00d4
        L_0x00b4:
            r3 = 2132548127(0x7f1c1a1f, float:2.074952E38)
            goto L_0x00d4
        L_0x00b8:
            r3 = 2132548126(0x7f1c1a1e, float:2.0749518E38)
            goto L_0x00d4
        L_0x00bc:
            r3 = 2132548125(0x7f1c1a1d, float:2.0749516E38)
            goto L_0x00d4
        L_0x00c0:
            r6 = 21
            if (r2 == r6) goto L_0x00b4
            r6 = 31
            if (r2 == r6) goto L_0x00b0
            r6 = 33
            if (r2 == r6) goto L_0x00bc
            r6 = 41
            if (r2 == r6) goto L_0x00b8
            r6 = 45
            if (r2 == r6) goto L_0x00b4
        L_0x00d4:
            com.bytedance.ies.dmt.ui.b.a$a r3 = r5.mo18899b(r3)     // Catch:{ Exception -> 0x010e }
            android.view.View r13 = com.p683ss.android.ugc.aweme.notification.util.C38443j.m85759a(r13, r0)     // Catch:{ Exception -> 0x010e }
            r3.f28290u = r13     // Catch:{ Exception -> 0x010e }
            com.bytedance.ies.dmt.ui.b.a r13 = r3.mo18897a()     // Catch:{ Exception -> 0x010e }
            boolean r0 = r4.isFinishing()     // Catch:{ Exception -> 0x010e }
            if (r0 != 0) goto L_0x0111
            android.app.Dialog r13 = r13.mo18883c()     // Catch:{ Exception -> 0x010e }
            r13.setCancelable(r8)     // Catch:{ Exception -> 0x010e }
            com.ss.android.ugc.aweme.notification.util.j r13 = com.p683ss.android.ugc.aweme.notification.util.C38443j.f97847f     // Catch:{ Exception -> 0x010e }
            com.ss.android.ugc.aweme.app.f.d r13 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()     // Catch:{ Exception -> 0x010e }
            java.lang.String r0 = "scene_id"
            java.lang.String r3 = "1001"
            com.ss.android.ugc.aweme.app.f.d r13 = r13.mo47829a(r0, r3)     // Catch:{ Exception -> 0x010e }
            java.lang.String r0 = "trigger_method"
            java.lang.String r2 = com.p683ss.android.ugc.aweme.notification.util.C38443j.m85760a(r2)     // Catch:{ Exception -> 0x010e }
            com.ss.android.ugc.aweme.app.f.d r13 = r13.mo47829a(r0, r2)     // Catch:{ Exception -> 0x010e }
            java.util.Map<java.lang.String, java.lang.String> r13 = r13.f61491a     // Catch:{ Exception -> 0x010e }
            java.lang.String r0 = "push_pre_permission_show"
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r13)     // Catch:{ Exception -> 0x010e }
        L_0x010e:
            com.p683ss.android.ugc.aweme.notification.util.C38443j.f97842a = r1
            return
        L_0x0111:
            return
        L_0x0112:
            com.p683ss.android.ugc.aweme.notification.util.C38443j.f97842a = r1
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.tryShowNotificationGuideDialog(android.content.Context):void");
    }

    public void jumpToH5(String str, Context context) {
        C37164d.m83387a(str, context);
    }

    public void onFissionPendantViewClicked(Context context, String str) {
        C30801a.m72195a(true);
        C37164d.m83387a(str, context);
    }

    public boolean tryOpenPolarisPage(Context context, String str) {
        return C47485d.m102882a(context, str, "ads");
    }

    static final /* synthetic */ void lambda$getAfterLoginActions$0$I18nBridgeService(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            bundle = bundle2;
        }
        if (!C22267i.m55118a("enter_from_login_ui_routine")) {
            C22884a.m56353a(bundle);
        }
    }

    public void enterMyFavorites(Activity activity, Bundle bundle) {
        Intent intent = new Intent(activity, UserFavoritesActivity.class);
        intent.putExtras(bundle);
        activity.startActivity(intent);
    }

    public Intent getInviteUserListActivityIntent(Activity activity, int i) {
        Intent intent = new Intent(activity, InviteUserListActivity.class);
        intent.putExtra("type", i);
        return intent;
    }

    public C10762d getPolarisMethod(C19750e eVar, Activity activity) {
        if (eVar == null || activity == null) {
            return null;
        }
        return new C47479b(eVar, activity);
    }

    public void setStatusBar(Activity activity, View view) {
        if (activity != null && view != null) {
            C26894c.m65022a(view);
            C23729p.m58269c(activity);
        }
    }

    public void onMainTabChanged(TabChangeManager tabChangeManager, String str) {
        if (!TextUtils.isEmpty(str) && str.equals("USER")) {
            Fragment a = tabChangeManager.mo75609a();
            if (a != null && (a instanceof C40242a)) {
                ((C40242a) a).mo82152E();
            }
        }
    }

    public void requestLocationPermissions(Activity activity, C47939a aVar) {
        C36272l a = C36272l.m81897a(activity);
        if (!C36272l.m81859d()) {
            C36256a.m81865a(activity, new C47939a(aVar) {

                /* renamed from: a */
                final /* synthetic */ C47939a f92849a;

                /* renamed from: a */
                public final void mo60068a() {
                    if (this.f92849a != null) {
                        this.f92849a.mo60068a();
                    }
                }

                /* renamed from: b */
                public final void mo60069b() {
                    if (this.f92849a != null) {
                        this.f92849a.mo60069b();
                    }
                }

                {
                    this.f92849a = r2;
                }
            });
            return;
        }
        if (aVar != null) {
            aVar.mo60068a();
        }
    }

    public void shareChallenge(Builder builder, String str) {
        AVChallenge aVChallenge = new AVChallenge();
        ArrayList arrayList = new ArrayList();
        aVChallenge.challengeName = str;
        arrayList.add(aVChallenge);
        builder.challenges(arrayList);
    }

    public void switchToBioUrl(Activity activity, String str) {
        C52711k.m112240b(activity, "context");
        C52711k.m112240b(str, "bioUrl");
        Intent intent = new Intent(activity, ProfileEditBioUrlActivity.class);
        intent.putExtra("bio_url", str);
        activity.startActivity(intent);
    }

    static final /* synthetic */ void lambda$getAfterLoginActions$2$I18nBridgeService(Bundle bundle, Bundle bundle2) {
        if (bundle2 != null) {
            bundle = bundle2;
        }
        Activity b = AwemeApplication.m56200b();
        if (b == null || C32616c.f84865a.thirdPartyFriendsService() == null) {
            C22884a.m56353a(bundle);
        } else {
            C32616c.f84865a.thirdPartyFriendsService().mo66141a(b, bundle, new C23979d(bundle));
        }
    }

    public void handleOpenSdk(Intent intent, C23974a aVar) {
        Bundle extras = intent.getExtras();
        if (extras != null) {
            ArrayList stringArrayList = extras.getStringArrayList("AWEME_EXTRA_IMAGE_MESSAGE_PATH");
            ArrayList stringArrayList2 = extras.getStringArrayList("AWEME_EXTRA_VIDEO_MESSAGE_PATH");
            if (!C9376b.m18558a((Collection<T>) stringArrayList)) {
                aVar.mo49721b(stringArrayList);
            } else if (!C9376b.m18558a((Collection<T>) stringArrayList2)) {
                aVar.mo49720a(stringArrayList2);
            } else {
                aVar.mo49719a();
            }
        }
    }

    public void trackAppsFlyerEvent(final String str, final String str2) {
        if (this.mExecutorService == null) {
            synchronized (BridgeService.class) {
                if (this.mExecutorService == null) {
                    this.mExecutorService = C24076h.m58898a(C24085m.m58928a(C24093p.SERIAL).mo49845a("AppsFlyer").mo49847a());
                }
            }
        }
        C0013i.m18a((Callable<TResult>) new Callable<Object>() {
            public final Object call() throws Exception {
                C47611a.m103065a(str, str2);
                return null;
            }
        }, (Executor) this.mExecutorService);
    }

    public void changeStatusBarMainTab(Activity activity, String str) {
        if (activity != null) {
            char c = 65535;
            int hashCode = str.hashCode();
            if (hashCode != -1382453013) {
                if (hashCode != 2223327) {
                    if (hashCode != 2614219) {
                        if (hashCode == 1055811561 && str.equals("DISCOVER")) {
                            c = 1;
                        }
                    } else if (str.equals("USER")) {
                        c = 3;
                    }
                } else if (str.equals("HOME")) {
                    c = 0;
                }
            } else if (str.equals("NOTIFICATION")) {
                c = 2;
            }
            switch (c) {
                case 0:
                    C23729p.m58263b(activity);
                    if (VERSION.SDK_INT >= 23) {
                        activity.getWindow().getDecorView().setSystemUiVisibility(PreloadTask.BYTE_UNIT_NUMBER);
                    }
                    return;
                case 1:
                case 2:
                case 3:
                    C23729p.m58263b(activity);
                    C23729p.m58269c(activity);
                    break;
            }
        }
    }

    public void handleUnloginForSetting(SettingNewVersionActivity settingNewVersionActivity, HashSet<View> hashSet) {
        C52711k.m112240b(settingNewVersionActivity, "activity");
        C52711k.m112240b(hashSet, "unloginGoneView");
        C52670a cVar = new C24472c(settingNewVersionActivity, hashSet);
        View findViewById = settingNewVersionActivity.findViewById(R.id.dry);
        View findViewById2 = settingNewVersionActivity.findViewById(R.id.p9);
        C52711k.m112236a((Object) findViewById, "viewSignin");
        findViewById.setVisibility(0);
        findViewById.setOnClickListener(new C24470a(cVar));
        findViewById2.setOnClickListener(new C24471b(cVar));
        View[] d = settingNewVersionActivity.mo85632d();
        C52711k.m112236a((Object) d, "views");
        for (int i = 0; i < 10; i++) {
            View view = d[i];
            C52711k.m112236a((Object) view, "view");
            if (view.getVisibility() != 8) {
                hashSet.add(view);
                view.setVisibility(8);
            }
        }
    }

    public void onFeedStartForContentLanguageGuide(Context context, Aweme aweme) {
        C50350i a = C50351a.m108630a();
        C52711k.m112240b(context, "context");
        if (a.f126267d != null) {
            C50346h hVar = a.f126267d;
            if (hVar != null && hVar.isShowing()) {
                if (C50350i.m108624a(aweme)) {
                    C50346h hVar2 = a.f126267d;
                    if (hVar2 != null) {
                        hVar2.f126259e = System.currentTimeMillis();
                    } else {
                        return;
                    }
                } else {
                    try {
                        C50346h hVar3 = a.f126267d;
                        if (hVar3 != null) {
                            hVar3.dismiss();
                        }
                        a.f126265b = true;
                        C52711k.m112236a((Object) C47549c.m102974a(), "UserManager.inst()");
                        if (C47549c.m102978c()) {
                            IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
                            C52711k.m112236a((Object) baseUserService_Monster, "ServiceManager.get().get…IUserService::class.java)");
                            User currentUser = baseUserService_Monster.getCurrentUser();
                            C52711k.m112236a((Object) currentUser, "ServiceManager.get().get…             .currentUser");
                            currentUser.setContentLanguageDialogShown(false);
                        } else {
                            a.f126264a.mo75724a(false);
                            a.f126264a.mo75723a("");
                        }
                    } catch (IllegalArgumentException unused) {
                        return;
                    }
                }
            }
        }
        a.mo98255b(context);
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x005d  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public java.lang.String handleUnlogin(com.p683ss.android.ugc.aweme.main.TabChangeManager r3, java.lang.String r4) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.by.e r0 = com.p683ss.android.ugc.aweme.p1485by.C24469e.f64850a
            java.lang.String r0 = "tabChangeManager"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r0)
            java.lang.String r0 = "tag"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            java.lang.String r0 = "name"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r0)
            int r0 = r4.hashCode()
            r1 = -1672998758(0xffffffff9c48109a, float:-6.6195906E-22)
            if (r0 == r1) goto L_0x004b
            r1 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r0 == r1) goto L_0x0040
            r1 = 2614219(0x27e3cb, float:3.663301E-39)
            if (r0 == r1) goto L_0x0035
            r1 = 53655674(0x332b87a, float:5.2521267E-37)
            if (r0 == r1) goto L_0x002a
            goto L_0x0056
        L_0x002a:
            java.lang.String r0 = "UNLOGIN_NOTIFICATION"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "NOTIFICATION"
            goto L_0x0057
        L_0x0035:
            java.lang.String r0 = "USER"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "UNLOGIN_PROFILE"
            goto L_0x0057
        L_0x0040:
            java.lang.String r0 = "NOTIFICATION"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "UNLOGIN_NOTIFICATION"
            goto L_0x0057
        L_0x004b:
            java.lang.String r0 = "UNLOGIN_PROFILE"
            boolean r0 = r4.equals(r0)
            if (r0 == 0) goto L_0x0056
            java.lang.String r0 = "USER"
            goto L_0x0057
        L_0x0056:
            r0 = r4
        L_0x0057:
            android.support.v4.app.Fragment r1 = r3.mo75619c(r0)
            if (r1 != 0) goto L_0x0087
            java.lang.String r1 = "USER"
            boolean r4 = p2628d.p2639f.p2641b.C52711k.m112239a(r1, r4)
            if (r4 == 0) goto L_0x0078
            com.ss.android.ugc.aweme.experiment.UnloginDiggShowInProfileExperiment r4 = com.p683ss.android.ugc.aweme.experiment.UnloginDiggShowInProfileExperiment.INSTANCE
            boolean r4 = r4.mo59615a()
            if (r4 == 0) goto L_0x0078
            java.lang.Class<com.ss.android.ugc.aweme.profile.unlogin.e> r4 = com.p683ss.android.ugc.aweme.profile.unlogin.C40487e.class
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            r3.mo75613a(r4, r0, r1)
            goto L_0x0087
        L_0x0078:
            android.os.Bundle r4 = new android.os.Bundle
            r4.<init>()
            java.lang.String r1 = "tab"
            r4.putString(r1, r0)
            java.lang.Class<com.ss.android.ugc.aweme.by.d> r1 = com.p683ss.android.ugc.aweme.p1485by.C24465d.class
            r3.mo75613a(r1, r0, r4)
        L_0x0087:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.handleUnlogin(com.ss.android.ugc.aweme.main.TabChangeManager, java.lang.String):java.lang.String");
    }

    public void readTaskPlayerCycle(int i, boolean z) {
        C37170f a = C37171a.m83416a();
        if (i == 7) {
            StringBuilder sb = new StringBuilder("onPlayCompleted, videoIsPlay:");
            sb.append(a.f94869b);
            C37170f.m83410a(sb.toString());
            if (a.f94869b) {
                long a2 = C37170f.m83409a();
                a.mo76493a(a2 - a.f94870c);
                a.f94869b = true;
                a.f94870c = a2;
            }
        } else if (i != 9) {
            switch (i) {
                case 3:
                    if (z) {
                        C37170f.m83410a("Ad onResumePlay");
                        a.f94871d = true;
                        a.f94872e = C37170f.m83409a();
                        break;
                    } else {
                        C37170f.m83410a("onResumePlay");
                        a.f94869b = true;
                        a.f94870c = C37170f.m83409a();
                        return;
                    }
                case 4:
                    if (!z) {
                        StringBuilder sb2 = new StringBuilder("onPausePlay, videoIsPlay:");
                        sb2.append(a.f94869b);
                        C37170f.m83410a(sb2.toString());
                        if (a.f94869b) {
                            long a3 = C37170f.m83409a();
                            a.mo76493a(a3 - a.f94870c);
                            a.f94869b = false;
                            a.f94870c = a3;
                            break;
                        }
                    } else {
                        StringBuilder sb3 = new StringBuilder("Ad onPausePlay, videoIsPlay:");
                        sb3.append(a.f94871d);
                        C37170f.m83410a(sb3.toString());
                        if (a.f94871d) {
                            long a4 = C37170f.m83409a();
                            a.mo76493a(a4 - a.f94872e);
                            a.f94871d = false;
                            a.f94872e = a4;
                            return;
                        }
                    }
                    break;
            }
        } else {
            C37170f.m83410a("onRenderFirstFrame");
            a.f94869b = true;
            a.f94870c = C37170f.m83409a();
        }
    }

    public void checkForUpdate(Activity activity, boolean z, String str) {
        C41528ai.f105215g.mo85312a(activity, z, str);
    }

    public void jumpToH5(String str, Context context, Intent intent) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(intent, "intent");
        if (!C23794bh.m58408v().mo49242a(context, str, "client")) {
            context.startActivity(intent);
        }
    }

    public void startAuthNativeActivity(Context context, Bundle bundle, C48342d dVar) {
        Intent intent = new Intent();
        intent.setClass(context, BaseI18nAuthorizedActivity.class);
        intent.putExtras(bundle);
        context.startActivity(intent);
        BaseI18nAuthorizedActivity.mAuthCallbackForWeb = dVar;
    }

    public void showPublishDialogFragment(Object obj, C0654k kVar, C44371e eVar) {
        C44971ai aiVar = (C44971ai) getBridgeService_Monster().createPublishDialogFragment();
        Bundle bundle = new Bundle();
        if (obj != null) {
            if (obj instanceof Serializable) {
                bundle.putSerializable("args", (Serializable) obj);
            } else if (obj instanceof Parcelable) {
                bundle.putParcelable("args", (Parcelable) obj);
            }
        }
        aiVar.f109279c = eVar;
        aiVar.setArguments(bundle);
        kVar.mo2225a().mo2176a(R.id.cu7, aiVar, "publish").mo2173a((int) R.anim.bp, (int) R.anim.bt).mo2195c();
    }

    public void startThirdSocialActivity(Context context, User user, int i) {
        Intent intent;
        Intent intent2;
        Intent intent3;
        switch (i) {
            case 1:
                String insId = user.getInsId();
                C52711k.m112240b(context, "context");
                C52711k.m112240b(insId, "instagramId");
                StringBuilder sb = new StringBuilder("https://instagram.com/_u/");
                sb.append(insId);
                String sb2 = sb.toString();
                try {
                    context.getPackageManager().getPackageInfo("com.instagram.android", 0);
                    intent = new Intent("android.intent.action.VIEW", Uri.parse(sb2));
                    intent.setPackage("com.instagram.android");
                } catch (Exception unused) {
                    intent = new Intent(context, CrossPlatformActivity.class);
                    intent.putExtra("title", context.getString(R.string.bs9));
                    intent.setData(Uri.parse(sb2));
                }
                try {
                    context.startActivity(intent);
                    break;
                } catch (Exception unused2) {
                    return;
                }
            case 2:
                String youtubeChannelId = user.getYoutubeChannelId();
                C52711k.m112240b(context, "context");
                C52711k.m112240b(youtubeChannelId, "youtubeChannelId");
                StringBuilder sb3 = new StringBuilder("https://www.youtube.com/channel/");
                sb3.append(youtubeChannelId);
                String sb4 = sb3.toString();
                try {
                    context.getPackageManager().getPackageInfo("com.google.android.youtube", 0);
                    intent2 = new Intent("android.intent.action.VIEW", Uri.parse(sb4));
                    intent2.setPackage("com.google.android.youtube");
                } catch (Exception unused3) {
                    intent2 = new Intent(context, CrossPlatformActivity.class);
                    intent2.putExtra("title", context.getString(R.string.fg9));
                    intent2.setData(Uri.parse(sb4));
                }
                try {
                    context.startActivity(intent2);
                    return;
                } catch (Exception unused4) {
                    break;
                }
            case 3:
                String twitterId = user.getTwitterId();
                C52711k.m112240b(context, "context");
                C52711k.m112240b(twitterId, "twitterId");
                StringBuilder sb5 = new StringBuilder("https://twitter.com/intent/user?user_id=");
                sb5.append(twitterId);
                String sb6 = sb5.toString();
                try {
                    context.getPackageManager().getPackageInfo("com.twitter.android", 0);
                    StringBuilder sb7 = new StringBuilder("twitter://user?id=");
                    sb7.append(twitterId);
                    intent3 = new Intent("android.intent.action.VIEW", Uri.parse(sb7.toString()));
                    intent3.setPackage("com.twitter.android");
                } catch (Exception unused5) {
                    intent3 = new Intent(context, CrossPlatformActivity.class);
                    intent3.putExtra("title", context.getString(R.string.f54));
                    intent3.setData(Uri.parse(sb6));
                }
                try {
                    context.startActivity(intent3);
                    break;
                } catch (Exception unused6) {
                    return;
                }
        }
    }

    public void onReturnThirdPlatformFailed(Activity activity, C26916m mVar, String str, int i) {
        if (activity == null) {
            activity = C11016e.m22312g();
        }
        new C38525e(activity, mVar).mo78433a(str, i);
    }

    public Intent getAddFriendsActivityIntent(Context context, int i, int i2, String str, String str2) {
        return IAddFriendsActivity.m75443a(context, i, i2, str);
    }

    public C44624d createCommentStickerView(Context context, C46063m mVar, InteractStickerStruct interactStickerStruct, View view, C44626f fVar) {
        C45884a a = mVar.f116227l.mo60449a();
        mVar.mo92610a((float) a.f115899a);
        mVar.mo92621b((float) a.f115900b);
        C44546a aVar = new C44546a(interactStickerStruct.getType(), context, view, interactStickerStruct, mVar, fVar);
        return aVar;
    }

    public C44624d createDonationStickerView(Context context, C46063m mVar, InteractStickerStruct interactStickerStruct, View view, C44626f fVar) {
        C45884a a = mVar.f116227l.mo60449a();
        mVar.mo92610a((float) a.f115899a);
        mVar.mo92621b((float) a.f115900b);
        C44556a aVar = new C44556a(interactStickerStruct.getType(), context, view, interactStickerStruct, mVar, fVar);
        return aVar;
    }

    public void bindUserTermsOfPrivacy(Context context, TextView textView, final OnClickListener onClickListener, final OnClickListener onClickListener2, boolean z) {
        if (!z) {
            textView.setPadding((int) C9432q.m18687b(context, 22.0f), 0, (int) C9432q.m18687b(context, 22.0f), 0);
        }
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder();
        StringBuilder sb = new StringBuilder();
        sb.append(C23723j.m58219b(R.string.cbn));
        sb.append(" ");
        String sb2 = sb.toString();
        String b = C23723j.m58219b(R.string.cbo);
        StringBuilder sb3 = new StringBuilder(" ");
        sb3.append(C23723j.m58219b(R.string.cbp));
        sb3.append(" ");
        String sb4 = sb3.toString();
        String b2 = C23723j.m58219b(R.string.cbq);
        spannableStringBuilder.append(sb2).append(b).append(sb4).append(b2);
        int color = context.getResources().getColor(R.color.a0z);
        int color2 = context.getResources().getColor(R.color.a8k);
        C239701 r5 = new C22313c(color, color2) {
            public final void onClick(View view) {
                if (onClickListener != null) {
                    onClickListener.onClick(view);
                }
            }
        };
        C239712 r9 = new C22313c(color, color2) {
            public final void onClick(View view) {
                if (onClickListener2 != null) {
                    onClickListener2.onClick(view);
                }
            }
        };
        spannableStringBuilder.setSpan(r5, sb2.length(), sb2.length() + b.length(), 34);
        spannableStringBuilder.setSpan(r9, sb2.length() + b.length() + sb4.length(), sb2.length() + b.length() + sb4.length() + b2.length(), 34);
        textView.setHighlightColor(C23723j.m58216a(17170445));
        textView.setText(spannableStringBuilder);
        textView.setMovementMethod(C24631ae.m60124a());
    }

    public C40266bq createAwemeListFragment(int i, int i2, String str, String str2, boolean z, boolean z2) {
        return C40273bu.m89554a(i, i2, str, str2, z, new Bundle());
    }
}
