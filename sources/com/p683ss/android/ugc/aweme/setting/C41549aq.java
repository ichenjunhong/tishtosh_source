package com.p683ss.android.ugc.aweme.setting;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.SharedPreferences.Editor;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p525e.C9402b;
import com.bytedance.ies.abmock.C10192m;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.abmock.C10194o;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.google.gson.C18082l;
import com.google.gson.C18085o;
import com.p683ss.android.common.util.NetworkUtils;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.util.C22282t;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.utils.C23726m;
import com.p683ss.android.ugc.aweme.discover.model.SearchNilInfo;
import com.p683ss.android.ugc.aweme.global.config.settings.C32818i;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.legoImp.inflate.C35916g;
import com.p683ss.android.ugc.aweme.legoImp.task.C35989p;
import com.p683ss.android.ugc.aweme.main.p1942e.C36622e;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.profile.model.UrlModelWrap;
import com.p683ss.android.ugc.aweme.sdk.IWalletMainProxy;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.services.video.IAVPublishService;
import com.p683ss.android.ugc.aweme.setting.api.SettingApi;
import com.p683ss.android.ugc.aweme.setting.model.AwemeSettings;
import com.p683ss.android.ugc.aweme.setting.model.AwemeSettings.GeckoConfig;
import com.p683ss.android.ugc.aweme.setting.model.AwemeSettings.GlobalTips;
import com.p683ss.android.ugc.aweme.setting.model.AwemeSettings.HotSearchDisplay;
import com.p683ss.android.ugc.aweme.setting.model.AwemeSettings.PushPrePermissionView;
import com.p683ss.android.ugc.aweme.setting.model.AwemeSettings.ShowCreatorLicense;
import com.p683ss.android.ugc.aweme.setting.model.AwemeSettings.UserCacheSetting;
import com.p683ss.android.ugc.aweme.setting.p2137f.C41604a;
import com.p683ss.android.ugc.aweme.setting.p2137f.C41604a.C41605a;
import com.p683ss.android.ugc.aweme.setting.p2137f.C41606b;
import com.p683ss.android.ugc.aweme.share.C41963ah;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.p2389c.C47745b;
import com.p683ss.android.ugc.aweme.utils.p2389c.C47745b.C47747b;
import com.p683ss.android.ugc.aweme.utils.p2389c.C47745b.C47748c;
import com.p683ss.android.ugc.aweme.utils.p2389c.C47745b.C47749d;
import com.p683ss.android.ugc.aweme.utils.p2389c.C47745b.C47750e;
import com.p683ss.android.ugc.aweme.video.C48018f.C48019a;
import com.p683ss.android.ugc.aweme.wallet.C48223a;
import com.p683ss.android.ugc.aweme.wallet.C48224b;
import com.p683ss.android.ugc.aweme.zhima.C48425b;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.ExecutionException;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.setting.aq */
public abstract class C41549aq implements C9382a, C41525af {

    /* renamed from: a */
    private static C41549aq f105247a = new C41715t();

    /* renamed from: b */
    protected SettingApi f105248b = ((SettingApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(SettingApi.class));

    /* renamed from: c */
    protected C9381g f105249c = new C9381g(Looper.getMainLooper(), this);

    /* renamed from: d */
    public GlobalTips f105250d;

    /* renamed from: e */
    public boolean f105251e;

    /* renamed from: f */
    public String f105252f = "{}";

    /* renamed from: g */
    protected List<C41551a> f105253g = new ArrayList();

    /* renamed from: com.ss.android.ugc.aweme.setting.aq$a */
    public interface C41551a {
        /* renamed from: a */
        void mo44361a(AwemeSettings awemeSettings);
    }

    /* renamed from: a */
    public static C41549aq m91378a() {
        return f105247a;
    }

    /* renamed from: a */
    public void mo85332a(final AwemeSettings awemeSettings) {
        if (awemeSettings != null) {
            if (awemeSettings.globalTips != null) {
                this.f105250d = awemeSettings.globalTips;
                C23542f.m57720e().mo48709b("place_holder", this.f105250d.search_tips);
            }
            C22282t.m55151f().edit().putBoolean("enable_twitter_new_key", awemeSettings.enableTwitterNewKeySecret).commit();
            C22282t.m55139a(awemeSettings.syncToTT);
            C22282t.m55151f().edit().putBoolean("enable_passport_service_switch", awemeSettings.enablePassportService).apply();
            C22282t.m55151f().edit().putBoolean("enable_email_login_switch", awemeSettings.enableEmailLogin).apply();
            Editor edit = SharePrefCache.inst().getSharePref().edit();
            mo85307a(edit, awemeSettings);
            SharePrefCache.inst().getDeviceMonitor().mo47779b(edit, Boolean.valueOf(awemeSettings.deviceMonitor));
            SharePrefCache.inst().getLiveSkylightShowAnimation().mo47779b(edit, Boolean.valueOf(awemeSettings.liveSkylightShowAnimation));
            SharePrefCache.inst().getIsUseTongdunSdk().mo47779b(edit, Boolean.valueOf(awemeSettings.isUseTongdunSdk));
            SharePrefCache.inst().getIsUseBackRefresh().mo47779b(edit, Boolean.valueOf(awemeSettings.isUseBackRefresh));
            SharePrefCache.inst().getShowTimeLineTab().mo47779b(edit, Boolean.valueOf(awemeSettings.isShowTimeLineTab()));
            SharePrefCache.inst().getHttpRetryCount().mo47779b(edit, Integer.valueOf(awemeSettings.httpRetryCount));
            if (awemeSettings.f105366sp != null && !TextUtils.isEmpty(awemeSettings.f105366sp.estr)) {
                SharePrefCache.inst().getEstr().mo47779b(edit, awemeSettings.f105366sp.estr);
            }
            SharePrefCache.inst().getTTRoute().mo47779b(edit, Boolean.valueOf(awemeSettings.ttRoute));
            SharePrefCache.inst().getTTRegion().mo47779b(edit, Boolean.valueOf(awemeSettings.ttRegion));
            SharePrefCache.inst().getVideoPreload().mo47779b(edit, Boolean.valueOf(awemeSettings.getNeedPreLoad()));
            SharePrefCache.inst().getAdDisplayTimemit().mo47779b(edit, Integer.valueOf(awemeSettings.adDisplayTime));
            SharePrefCache.inst().getHardEncode().mo47779b(edit, Integer.valueOf(awemeSettings.useHardcode));
            SharePrefCache.inst().getIsShowNearBy().mo47779b(edit, Boolean.valueOf(awemeSettings.isShowNearByTab));
            SharePrefCache.inst().getShiledMusicSDK().mo47779b(edit, Boolean.valueOf(awemeSettings.shieldMusicSDK));
            SharePrefCache.inst().getNewAnchorShowBubble().mo47779b(edit, Boolean.valueOf(awemeSettings.newAnchorShowBubble));
            SharePrefCache.inst().getUseSyntheticHardcode().mo47779b(edit, Integer.valueOf(awemeSettings.useSyntheticHardcode));
            SharePrefCache.inst().getIsChangeFollowTab().mo47779b(edit, Boolean.valueOf(awemeSettings.isChangeFollowTab()));
            SharePrefCache.inst().getLiveDefaultBitrate().mo47779b(edit, Integer.valueOf(awemeSettings.liveDefaultBitrate));
            SharePrefCache.inst().getLiveMaxBitrate().mo47779b(edit, Integer.valueOf(awemeSettings.liveMaxBitrate));
            SharePrefCache.inst().getLiveMinBitrate().mo47779b(edit, Integer.valueOf(awemeSettings.liveMinBitrate));
            C23183v a = C23183v.m56778a();
            boolean z = true;
            if (a.f61623e == null) {
                a.f61623e = new C23051bf<>("pic_qrcode_recognition_switch", Integer.valueOf(1));
            }
            a.f61623e.mo47779b(edit, Integer.valueOf(awemeSettings.picQrcodeRecognitionSwitch));
            C23183v.m56778a().mo47922r().mo47779b(edit, Boolean.valueOf(awemeSettings.selfSeeWaterMarkSwitch));
            C23183v a2 = C23183v.m56778a();
            if (a2.f61621c == null) {
                a2.f61621c = new C23051bf<>("enable_email_login_switch", Boolean.valueOf(false));
            }
            a2.f61621c.mo47779b(edit, Boolean.valueOf(awemeSettings.enableEmailLogin));
            C23183v a3 = C23183v.m56778a();
            if (a3.f61622d == null) {
                a3.f61622d = new C23051bf<>("enable_passport_service_switch", Boolean.valueOf(true));
            }
            a3.f61622d.mo47779b(edit, Boolean.valueOf(awemeSettings.enablePassportService));
            C23183v.m56778a().mo47903N().mo47776a(awemeSettings.selfProfileLandingTabs);
            C23183v.m56778a().mo47904O().mo47776a(awemeSettings.otherProfileLandingTabs);
            SharePrefCache.inst().getBeautyModelItem().mo47779b(edit, Integer.valueOf(awemeSettings.beautyModel));
            C23183v.m56778a().mo47890A().mo47779b(edit, Boolean.valueOf(awemeSettings.canDuet));
            SharePrefCache.inst().isOb().mo47779b(edit, Boolean.valueOf(awemeSettings.isOb));
            SharePrefCache.inst().isNpthEnable().mo47779b(edit, Boolean.valueOf(awemeSettings.isNpthEnable));
            Context a4 = C11010c.m22280a();
            C23859b.m58575b().mo49466a(a4, "enable_home_scan_qrcode", awemeSettings.enableHomeScanQrCode);
            C23859b.m58575b().mo49462a(a4, "awe_network_x_token_disabled", awemeSettings.aweNetworkXTokenDisabled);
            C23859b.m58575b().mo49462a(a4, "enable_fancy_qrcode", awemeSettings.enableFancyQrcode);
            C23859b.m58575b().mo49462a(a4, "enable_read_fancy_qrcode", awemeSettings.enableReadFancyQrcode);
            C23859b.m58575b().mo49462a(a4, "enable_share_qrcode_h5_as_image", awemeSettings.getSharePictureDirect());
            C23859b.m58575b().mo49466a(a4, C41963ah.f106216a, awemeSettings.disableIidInShareUrl);
            C23859b.m58575b().mo49466a(a4, C41963ah.f106217b, awemeSettings.disableUCodeInShareUrl);
            SharePrefCache.inst().getSearchTabIndex().mo47779b(edit, awemeSettings.getSearchTabIndex());
            C23859b.m58575b().mo49464a(a4, "i18n_third_login_strategy", (Object) awemeSettings.i18nThridLoginSetting);
            C23859b.m58575b().mo49466a(a4, "enable_twitter_new_key_secret", awemeSettings.enableTwitterNewKeySecret);
            if (awemeSettings.verifyExceed > 0) {
                SharePrefCache.inst().getVerifyExceed().mo47779b(edit, Integer.valueOf(awemeSettings.verifyExceed));
            }
            SharePrefCache.inst().getOriginalMusicianEntry().mo47779b(edit, Boolean.valueOf(awemeSettings.showOriginalMusicianEntry));
            SharePrefCache.inst().getMusicianShowType().mo47779b(edit, Integer.valueOf(awemeSettings.musicianShowType));
            SharePrefCache.inst().getAtFriendsShowType().mo47779b(edit, Integer.valueOf(awemeSettings.atFriendsShowType));
            SharePrefCache.inst().getOriginalMusiciaShareStyle().mo47779b(edit, Boolean.valueOf(awemeSettings.originalMusicianShare));
            SharePrefCache.inst().getOrginalMusicianUrl().mo47779b(edit, awemeSettings.orginalMusicianUrl);
            SharePrefCache.inst().getStickerArtlistUrl().mo47779b(edit, awemeSettings.stickerArtistUrl);
            SharePrefCache.inst().getStickerArtEntry().mo47779b(edit, Boolean.valueOf(awemeSettings.stickerArtistEntry));
            SharePrefCache.inst().getUseNewDouyinSaftyCenter().mo47779b(edit, Integer.valueOf(awemeSettings.useNewDouyinSaftyCenter));
            SharePrefCache.inst().getJsActlogUrl().mo47779b(edit, awemeSettings.jsActLogUrl);
            SharePrefCache.inst().getSyncTT().mo47779b(edit, Integer.valueOf(awemeSettings.syncToTT));
            SharePrefCache.inst().getSyncToTTUrl().mo47779b(edit, awemeSettings.syncToTTUrl);
            SharePrefCache.inst().getCanIm().mo47779b(edit, Integer.valueOf(awemeSettings.canIm));
            SharePrefCache.inst().getCanImSendPic().mo47779b(edit, Integer.valueOf(awemeSettings.canImSendPic));
            SharePrefCache.inst().getIsForceHttps().mo47779b(edit, Integer.valueOf(awemeSettings.isForceHttps));
            SharePrefCache.inst().getShowInteractionStickers().mo47779b(edit, Boolean.valueOf(awemeSettings.showInteractionStickers));
            SharePrefCache.inst().getRemoveFollowerSwitch().mo47779b(edit, Boolean.valueOf(awemeSettings.removeFollowerSwitch));
            if (awemeSettings.publishSyncDuoshanAllConfig != null) {
                if (awemeSettings.publishSyncDuoshanAllConfig.f117718a != null) {
                    SharePrefCache.inst().getStoryRegisterPublishSyncHintTitle().mo47779b(edit, awemeSettings.publishSyncDuoshanAllConfig.f117718a.f117720a);
                    SharePrefCache.inst().getStoryRegisterPublishSyncHintContent().mo47779b(edit, awemeSettings.publishSyncDuoshanAllConfig.f117718a.f117721b);
                    SharePrefCache.inst().getStoryRegisterPublishSyncHintH5Str().mo47779b(edit, awemeSettings.publishSyncDuoshanAllConfig.f117718a.f117722c);
                    SharePrefCache.inst().getStoryRegisterPublishSyncHintH5Url().mo47779b(edit, awemeSettings.publishSyncDuoshanAllConfig.f117718a.f117723d);
                }
                if (awemeSettings.publishSyncDuoshanAllConfig.f117719b != null) {
                    SharePrefCache.inst().getStoryUnRegisterPublishSyncHintTitle().mo47779b(edit, awemeSettings.publishSyncDuoshanAllConfig.f117719b.f117720a);
                    SharePrefCache.inst().getStoryUnRegisterPublishSyncHintContent().mo47779b(edit, awemeSettings.publishSyncDuoshanAllConfig.f117719b.f117721b);
                    SharePrefCache.inst().getStoryUnRegisterPublishSyncHintH5Str().mo47779b(edit, awemeSettings.publishSyncDuoshanAllConfig.f117719b.f117722c);
                    SharePrefCache.inst().getStoryUnRegisterPublishSyncHintH5Url().mo47779b(edit, awemeSettings.publishSyncDuoshanAllConfig.f117719b.f117723d);
                }
            }
            SharePrefCache.inst().getStoryInfoStickerMaxCount().mo47779b(edit, Integer.valueOf(awemeSettings.infoStickerMaxCount));
            SharePrefCache.inst().getStoryTextStickerMaxCount().mo47779b(edit, Integer.valueOf(awemeSettings.textStickerMaxCount));
            if (awemeSettings.shareUrlWhiteList != null) {
                C23183v a5 = C23183v.m56778a();
                if (a5.f61627i == null) {
                    a5.f61627i = new C23051bf<>("share_url_long_white_list", new HashSet());
                }
                a5.f61627i.mo47779b(edit, new HashSet(Arrays.asList(awemeSettings.shareUrlWhiteList.getLongWhiteList())));
                C23183v.m56778a().mo47914j().mo47779b(edit, new HashSet(Arrays.asList(awemeSettings.shareUrlWhiteList.getShortWhiteList())));
            }
            if (awemeSettings.ttplayerBufferDuration > 0) {
                C23183v a6 = C23183v.m56778a();
                if (a6.f61628j == null) {
                    a6.f61628j = new C23051bf<>("ttplayer_buffer_duration", Integer.valueOf(1000));
                }
                a6.f61628j.mo47779b(edit, Integer.valueOf(awemeSettings.ttplayerBufferDuration));
            }
            if (awemeSettings.share_h5_url_whitelist != null) {
                C23183v.m56778a().mo47915k().mo47779b(edit, new HashSet(awemeSettings.share_h5_url_whitelist));
            }
            C23183v a7 = C23183v.m56778a();
            if (a7.f61629k == null) {
                a7.f61629k = new C23051bf<>("enable_ijk_hardware", Integer.valueOf(0));
            }
            a7.f61629k.mo47779b(edit, Integer.valueOf(awemeSettings.enableIJKHardwarePlayer));
            NetworkUtils.setIsForceHttps(awemeSettings.isForceHttps);
            SharePrefCache.inst().getImCommentForwardEnabledItem().mo47779b(edit, Boolean.valueOf(awemeSettings.imCommentForwardEnabled));
            C18842a.m45932a(C41554at.f105260a);
            SharePrefCache.inst().getDownloadForbiddenToast().mo47779b(edit, awemeSettings.downloadForbiddenToast);
            C23183v.m56778a().mo47893D().mo47779b(edit, awemeSettings.downloadCheckStatus);
            ShowCreatorLicense showCreatorLicense = awemeSettings.showCreatorLicense;
            if (showCreatorLicense != null) {
                SharePrefCache.inst().getPromoteDialogShouldShow().mo47779b(edit, Boolean.valueOf(showCreatorLicense.show != 0));
                SharePrefCache.inst().getPromoteDialogPopupTimesLimit().mo47779b(edit, Integer.valueOf(showCreatorLicense.timeLimit));
                SharePrefCache.inst().getPromoteDialogPopupPopupTitle().mo47779b(edit, showCreatorLicense.title);
                SharePrefCache.inst().getPromoteDialogPopupPopupMsg().mo47779b(edit, showCreatorLicense.msg);
                SharePrefCache.inst().getPromoteDialogPopupPopupContent().mo47779b(edit, showCreatorLicense.content);
                SharePrefCache.inst().getPromoteDialogPopupPopupLinkText().mo47779b(edit, showCreatorLicense.linkText);
                SharePrefCache.inst().getPromoteDialogPopupPopupUrl().mo47779b(edit, showCreatorLicense.url);
                SharePrefCache.inst().getPromoteDialogPopupClickType().mo47779b(edit, Integer.valueOf(showCreatorLicense.clickType));
            }
            C23183v a8 = C23183v.m56778a();
            if (a8.f61632n == null) {
                a8.f61632n = new C23051bf<>("private_permission", Integer.valueOf(0));
            }
            a8.f61632n.mo47776a(Integer.valueOf(awemeSettings.privatePermission));
            SharePrefCache.inst().getPrivacyDownloadSetting().mo47779b(edit, Integer.valueOf(awemeSettings.enablePrivacyDownloadSetting));
            SharePrefCache.inst().getIsShowAllowDownloadTipSetting().mo47779b(edit, Boolean.valueOf(awemeSettings.showAllowDownloadTip));
            SharePrefCache.inst().getIsUseTTnet().mo47779b(edit, Boolean.valueOf(awemeSettings.isUseTTnet));
            SharePrefCache.inst().getShowHashTagBg().mo47779b(edit, Integer.valueOf(awemeSettings.showHashTagBg));
            SharePrefCache.inst().getCanCreateInsights().mo47779b(edit, Boolean.valueOf(awemeSettings.canInsights));
            C18842a.m45932a(new Runnable() {
                public final void run() {
                    C41549aq.m91380c(awemeSettings);
                }
            });
            GeckoConfig geckoConfig = awemeSettings.mGeckoConfig;
            if (geckoConfig != null && !C9376b.m18558a((Collection<T>) geckoConfig.mInitChannels)) {
                C47745b bVar = C47745b.f120260b;
                C47745b.m103373a(geckoConfig.mInitChannels, new C47749d(edit), C47750e.INSTANCE);
                SharePrefCache.inst().getUseNewPackageNow().mo47779b(edit, Boolean.valueOf(geckoConfig.useNewPackageNow));
                if (geckoConfig.rnContextCreateTimeOut > 0) {
                    SharePrefCache.inst().getRnContextCreateTimeout().mo47779b(edit, Integer.valueOf(geckoConfig.rnContextCreateTimeOut));
                }
                SharePrefCache.inst().getRnPreloadContextOn().mo47779b(edit, Boolean.valueOf(geckoConfig.rnPreloadContextOn));
                SharePrefCache.inst().getRnSnapshotOn().mo47779b(edit, Boolean.valueOf(geckoConfig.rnSnapShotOn));
                C47745b bVar2 = C47745b.f120260b;
                C47745b.m103373a(geckoConfig.initialHighPriorityChannels, new C47747b(edit), C47748c.INSTANCE);
            }
            for (C41551a aVar : new CopyOnWriteArrayList(this.f105253g)) {
                if (aVar != null) {
                    aVar.mo44361a(awemeSettings);
                }
            }
            this.f105253g.clear();
            C23183v.m56778a().mo47918n().mo47779b(edit, Boolean.valueOf(awemeSettings.splashImageCenter));
            C23183v.m56778a().mo47919o().mo47779b(edit, Boolean.valueOf(awemeSettings.splashVideoCenter));
            C23183v.m56778a().mo47920p().mo47779b(edit, Boolean.valueOf(awemeSettings.splashSupportTimeOut));
            SharePrefCache.inst().getDownloadMicroApp().mo47779b(edit, Integer.valueOf(awemeSettings.downloadMicroApp));
            SharePrefCache.inst().getFollowNoticeCloseTime().mo47779b(edit, Long.valueOf(awemeSettings.noticeCloseTime));
            SharePrefCache.inst().getMiniAppLabelTitle().mo47779b(edit, awemeSettings.labTitle);
            SharePrefCache.inst().getPrivacyReminderH5Url().mo47779b(edit, awemeSettings.privacyReminder);
            HotSearchDisplay hotSearchDisplay = awemeSettings.hotSearchDisplay;
            if (hotSearchDisplay != null) {
                SharePrefCache.inst().getNormalGuideDisplayTimes().mo47779b(edit, Integer.valueOf(hotSearchDisplay.normalGuideDisplayTimes));
                SharePrefCache.inst().getNormalGuideDisplayTimeIntervals().mo47779b(edit, Long.valueOf(hotSearchDisplay.normalGuideDisplayTimeIntervals * 1000));
                SharePrefCache.inst().getOperationGuideDisplayTimes().mo47779b(edit, Integer.valueOf(hotSearchDisplay.operationGuideDisplayTimes));
                SharePrefCache.inst().getOperationGuideDisplayTimeIntervals().mo47779b(edit, Long.valueOf(hotSearchDisplay.operationGuideDisplayTimeIntervals * 1000));
            }
            PushPrePermissionView pushPrePermissionView = awemeSettings.pushPrePermissionView;
            if (pushPrePermissionView != null) {
                SharePrefCache.inst().getRequestNotificationTitle().mo47779b(edit, pushPrePermissionView.toastTitle);
                SharePrefCache.inst().getRequestNotificationText().mo47779b(edit, pushPrePermissionView.toastText);
            }
            SharePrefCache.inst().getNoticeCountLatency().mo47779b(edit, Integer.valueOf(awemeSettings.noticeCountLatency));
            SharePrefCache.inst().getFriendTabAvatarDuation().mo47779b(edit, Integer.valueOf(awemeSettings.friendTabAvatarDuration));
            C48224b bVar3 = awemeSettings.walletConfig;
            if (bVar3 != null) {
                C48223a.f121356a = bVar3;
                Editor edit2 = SharePrefCache.inst().getSharePref().edit();
                edit2.putString(IWalletMainProxy.KEY_PAGE_CHARGE, bVar3.f121357a);
                edit2.putString(IWalletMainProxy.KEY_PAGE_INDEX, bVar3.f121358b);
            }
            C41606b bVar4 = awemeSettings.hateFulConfig;
            if (bVar4 != null) {
                C41604a.f105328a = bVar4;
                try {
                    if (!TextUtils.isEmpty(bVar4.f105331a)) {
                        if (!TextUtils.isEmpty(bVar4.f105332b)) {
                            C41605a.m91462a().storeString(SearchNilInfo.HIT_HEAT_SPEECH, bVar4.f105331a);
                            C41605a.m91462a().storeString("hate_link", bVar4.f105332b);
                        }
                    }
                } catch (Throwable th) {
                    StringBuilder sb = new StringBuilder("HateFulPreferences getSP failed ");
                    sb.append(th.getMessage());
                    C47625i.m103103a(sb.toString());
                }
            }
            String str = awemeSettings.hashTagRegex;
            if (TextUtils.isEmpty(str)) {
                String str2 = "";
                try {
                    str2 = C48019a.m103962a().getString("hash_tag_regex", "");
                } catch (Throwable th2) {
                    StringBuilder sb2 = new StringBuilder("HashTagPreferences getSP failed ");
                    sb2.append(th2.getMessage());
                    C47625i.m103103a(sb2.toString());
                }
                if (!TextUtils.isEmpty(str2)) {
                    AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().setHashTagRegex(str2);
                }
            } else {
                IAVPublishService publishService = AVExternalServiceImpl.getAVServiceImpl_Monster().publishService();
                StringBuilder sb3 = new StringBuilder("#(");
                sb3.append(str);
                sb3.append(")+");
                publishService.setHashTagRegex(sb3.toString());
                try {
                    StringBuilder sb4 = new StringBuilder("#(");
                    sb4.append(str);
                    sb4.append(")+");
                    C48019a.m103962a().storeString("hash_tag_regex", sb4.toString());
                } catch (Throwable th3) {
                    StringBuilder sb5 = new StringBuilder("HashTagPreferences getSP failed ");
                    sb5.append(th3.getMessage());
                    C47625i.m103103a(sb5.toString());
                }
            }
            SharePrefCache.inst().getEnableProfileActivityLink().mo47779b(edit, Boolean.valueOf(awemeSettings.enableProfileActivity));
            SharePrefCache.inst().getEnableFace2Face().mo47779b(edit, Boolean.valueOf(awemeSettings.enableFace2Face));
            SharePrefCache.inst().getEableUltraResolution().mo47779b(edit, Boolean.valueOf(awemeSettings.enableUltraResolution));
            SharePrefCache.inst().isInUltraResBlackList().mo47779b(edit, Boolean.valueOf(awemeSettings.inUltraResBlackList));
            SharePrefCache.inst().getEnableAntiAliasing().mo47779b(edit, Boolean.valueOf(awemeSettings.enableAntiAliasing));
            SharePrefCache.inst().getUltraResolutionLevel().mo47779b(edit, Integer.valueOf(awemeSettings.ultraResolutionLevel));
            int i = awemeSettings.x2cSwitch;
            C35916g.f92141b = i;
            C35916g.f92140a.edit().putInt("x2c_switch", i).commit();
            C23183v.m56778a().mo47899J().mo47779b(edit, awemeSettings.dmtJsBridgeWhiteList);
            UserCacheSetting userCacheSetting = awemeSettings.userCacheSetting;
            if (userCacheSetting != null) {
                SharePrefCache.inst().getIsEnableCacheUserList().mo47779b(edit, Boolean.valueOf(userCacheSetting.enableUserCache == 1));
                C23051bf isEnableCacheUserInsert = SharePrefCache.inst().getIsEnableCacheUserInsert();
                if (userCacheSetting.enableCacheUserInsert != 1) {
                    z = false;
                }
                isEnableCacheUserInsert.mo47779b(edit, Boolean.valueOf(z));
                SharePrefCache.inst().getFetchUserCacheIntervals().mo47779b(edit, Long.valueOf(userCacheSetting.fetchUserCacheIntervals));
            }
            C23859b.m58575b().mo49464a(C11010c.m22280a(), "aweme_gecko_offline_host_prefix", (Object) awemeSettings.geckoOfflineHostPrefix);
            C23859b.m58575b().mo49466a(C11010c.m22280a(), C41963ah.f106218c, awemeSettings.tencentSdkDisabled);
            edit.apply();
        }
    }

    /* renamed from: b */
    static void m91379b() {
        SharedPreferences a = C35807d.m80935a(C11010c.m22280a(), "publish_sync_sp", 0);
        if (a != null) {
            Editor edit = a.edit();
            if (edit != null) {
                edit.putBoolean("is_setting_synced", true);
                C9402b.m18594a(edit);
            }
        }
    }

    protected C41549aq() {
    }

    /* renamed from: a */
    public final void mo85328a(int i) {
        mo85329a(i, null);
    }

    public void handleMsg(Message message) {
        mo85333a(message.obj);
    }

    /* renamed from: a */
    public final void mo85331a(C41551a aVar) {
        this.f105253g.add(aVar);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo85327a(Context context) throws Exception {
        try {
            String b = C23859b.m58575b().mo49468b(C11010c.m22280a(), "last_setting_version", "");
            int i = 0;
            if (context != null) {
                i = C23726m.m58234a(context);
            }
            C18082l lVar = (C18082l) this.f105248b.queryRawSetting(C35989p.m81164a(), i, b).get();
            C0013i.m16a((Callable<TResult>) new C41555au<TResult>(this, lVar));
            return lVar;
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }

    /* renamed from: c */
    public static void m91380c(AwemeSettings awemeSettings) {
        if (!C9376b.m18558a((Collection<T>) awemeSettings.defaultCoverUrls)) {
            HashSet hashSet = new HashSet();
            int i = 0;
            try {
                for (UrlModel urlModelWrap : awemeSettings.defaultCoverUrls) {
                    int i2 = i + 1;
                    hashSet.add(new UrlModelWrap(i, urlModelWrap).toJsonString());
                    i = i2;
                }
            } catch (Exception unused) {
            }
            C23542f.m57717b().mo48701a().putStringSet("default_profile_cover_url", hashSet).apply();
        }
    }

    /* renamed from: a */
    public final void mo85330a(C18085o oVar) {
        this.f105252f = oVar.toString();
        C10193n a = C10193n.m20607a();
        C10192m.m20600a(oVar);
        new Handler(Looper.getMainLooper()).post(new C10194o(a));
    }

    /* renamed from: a */
    public void mo85333a(Object obj) {
        this.f105251e = true;
        if (!(obj instanceof Exception) && (obj instanceof AwemeSettings)) {
            AwemeSettings awemeSettings = (AwemeSettings) obj;
            mo85332a(awemeSettings);
            C47718bf.m103288a(new C36622e());
            C48425b a = C48425b.m104779a();
            a.f121789a = awemeSettings.liveUserZhima;
            a.f121790b = awemeSettings.commerceUserZhima;
        }
    }

    /* renamed from: a */
    public void mo85329a(int i, Context context) {
        C41581bc.m91416a();
        C32818i.m75717a().mo66398a(false);
        C23566n.m57766a().mo48750a(this.f105249c, new C41552ar(this, context), 0);
    }
}
