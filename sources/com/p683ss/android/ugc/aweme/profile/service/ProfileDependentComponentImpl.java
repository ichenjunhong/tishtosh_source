package com.p683ss.android.ugc.aweme.profile.service;

import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Parcelable;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.text.SpannableStringBuilder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.webkit.CookieManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.sdk.account.p849b.p853d.C13032a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.facebook.drawee.p930a.p931a.C13773e;
import com.facebook.drawee.p936c.C13783a;
import com.facebook.drawee.p936c.C13791d;
import com.facebook.drawee.p942h.C13842a;
import com.facebook.imagepipeline.p975o.C14229b;
import com.facebook.imagepipeline.p975o.C14232c;
import com.p683ss.android.http.p1169a.p1172b.C19181f;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.p1147d.C18941d.C18942a;
import com.p683ss.android.sdk.p1207a.C19718b;
import com.p683ss.android.ttplatformsdk.p1224c.C20061b;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.C22711b;
import com.p683ss.android.ugc.aweme.app.C23060d;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23715d;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.captcha.p1491c.C24501b;
import com.p683ss.android.ugc.aweme.challenge.p1500ui.ChallengeAvatarModifyActivity;
import com.p683ss.android.ugc.aweme.commercialize.api.CommerceSettingsApi;
import com.p683ss.android.ugc.aweme.commercialize.model.C26121f;
import com.p683ss.android.ugc.aweme.commercialize.model.C26131l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.crossplatform.activity.CrossPlatformActivity;
import com.p683ss.android.ugc.aweme.detail.p1628ui.DetailActivity;
import com.p683ss.android.ugc.aweme.discover.model.Challenge;
import com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView;
import com.p683ss.android.ugc.aweme.experiment.FtcBindExperiment;
import com.p683ss.android.ugc.aweme.experiment.p1695a.C29499a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.StoryUnreadUtils;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.festival.christmas.C31361b;
import com.p683ss.android.ugc.aweme.following.p1770ui.C32123b;
import com.p683ss.android.ugc.aweme.following.p1770ui.FollowingFollowerActivity;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.friends.utils.C32782b;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.live.C36006a;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.p683ss.android.ugc.aweme.live.p1921d.C36067b;
import com.p683ss.android.ugc.aweme.live.p1921d.C36068c;
import com.p683ss.android.ugc.aweme.main.MainAnimViewModel;
import com.p683ss.android.ugc.aweme.main.experiment.ProfileFontStyleExperiment;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.newfollow.live.C37899a;
import com.p683ss.android.ugc.aweme.newfollow.live.C37899a.C37900a;
import com.p683ss.android.ugc.aweme.p1323ae.p1326c.C22473b;
import com.p683ss.android.ugc.aweme.p1323ae.p1327d.C22474a;
import com.p683ss.android.ugc.aweme.p1445bp.C23891e;
import com.p683ss.android.ugc.aweme.p1797h.C32947c;
import com.p683ss.android.ugc.aweme.p1797h.p1798a.C32939a;
import com.p683ss.android.ugc.aweme.p1797h.p1798a.C32943c;
import com.p683ss.android.ugc.aweme.p1803i.C33089c.C33090a;
import com.p683ss.android.ugc.aweme.p1807im.C33194e;
import com.p683ss.android.ugc.aweme.p1807im.C33206p;
import com.p683ss.android.ugc.aweme.p1807im.C33206p.C33207a;
import com.p683ss.android.ugc.aweme.pendant.C38588b;
import com.p683ss.android.ugc.aweme.pendant.C38588b.C38589a;
import com.p683ss.android.ugc.aweme.profile.model.ActivityLinkResponse.LinkInfo;
import com.p683ss.android.ugc.aweme.profile.model.BlueVBrandInfo;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2083a.C39714a;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39803g;
import com.p683ss.android.ugc.aweme.profile.p2085c.C39826d;
import com.p683ss.android.ugc.aweme.profile.p2088f.C39870a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40346dr;
import com.p683ss.android.ugc.aweme.profile.p2090ui.CropActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.CropActivity.C40055a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.HeaderDetailActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40424c;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40426d;
import com.p683ss.android.ugc.aweme.profile.presenter.C39979m;
import com.p683ss.android.ugc.aweme.profile.util.C40515a;
import com.p683ss.android.ugc.aweme.profile.util.C40515a.C40517b;
import com.p683ss.android.ugc.aweme.profile.util.C40515a.C40518c;
import com.p683ss.android.ugc.aweme.protection.gradientpunish.C40878a;
import com.p683ss.android.ugc.aweme.protection.gradientpunish.GradientPunishWarning;
import com.p683ss.android.ugc.aweme.qrcode.C40952c;
import com.p683ss.android.ugc.aweme.qrcode.p2107v2.QRCodeActivityV2;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.setting.C41589c;
import com.p683ss.android.ugc.aweme.setting.model.MigrateABTestModel;
import com.p683ss.android.ugc.aweme.setting.model.VerifyActionManager;
import com.p683ss.android.ugc.aweme.setting.p2148ui.DiskManagerActivity;
import com.p683ss.android.ugc.aweme.setting.p2148ui.DiskManagerActivity.C41736a;
import com.p683ss.android.ugc.aweme.setting.p2148ui.DownloadControlSettingActivity;
import com.p683ss.android.ugc.aweme.setting.serverpush.api.PushSettingsApiManager;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47663ad;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47843ee;
import com.p683ss.android.ugc.aweme.utils.C47856en;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.ZoomAnimationUtils;
import java.io.Serializable;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C1682af;
import p064c.p065a.C1684ah;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p093k.C2168a;
import p2628d.C52856t;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52550ab;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2640a.C52688s;
import p2628d.p2639f.p2641b.C52710j;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52762e;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl */
public final class ProfileDependentComponentImpl implements IProfileDependentComponentService {

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$a */
    public static final class C39998a implements C40019l {
        C39998a() {
        }

        /* renamed from: a */
        public final boolean mo82004a(User user) {
            return false;
        }

        /* renamed from: b */
        public final boolean mo82006b(User user) {
            return false;
        }

        /* renamed from: a */
        public final boolean mo82005a(boolean z, boolean z2, User user) {
            if (!((Boolean) C23183v.m56778a().mo47891B().mo47782d()).booleanValue() || !C47915gg.m103664m(user)) {
                return z2;
            }
            return z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$b */
    public static final class C39999b implements C39870a {

        /* renamed from: a */
        public final MainAnimViewModel f101936a;

        /* renamed from: b */
        final /* synthetic */ FragmentActivity f101937b;

        /* renamed from: a */
        public final C0198r<Boolean> mo80964a() {
            return this.f101936a.f93423c;
        }

        C39999b(FragmentActivity fragmentActivity) {
            this.f101937b = fragmentActivity;
            C0209x a = C0214z.m440a(fragmentActivity).mo359a(MainAnimViewModel.class);
            C52711k.m112236a((Object) a, "ViewModelProviders.of(ac…nimViewModel::class.java)");
            this.f101936a = (MainAnimViewModel) a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$c */
    static final class C40000c<T> implements C2205y<Boolean> {

        /* renamed from: a */
        public static final C40000c f101938a = new C40000c();

        C40000c() {
        }

        public final void subscribe(C2204x<Boolean> xVar) {
            C52711k.m112240b(xVar, "it");
            try {
                C41736a aVar = DiskManagerActivity.f105656b;
                C23891e eVar = C23891e.f63559a;
                boolean z = false;
                if (!C23891e.m58604a().getBoolean("has_show_disk_manager_guide", false) && C41736a.m91666c() >= C41736a.m91664a()) {
                    z = true;
                }
                xVar.mo6282a(Boolean.valueOf(z));
                xVar.mo6273a();
            } catch (Exception e) {
                xVar.mo6274a((Throwable) e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$d */
    static final class C40001d implements C37900a {

        /* renamed from: a */
        final /* synthetic */ C18942a f101939a;

        C40001d(C18942a aVar) {
            this.f101939a = aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$e */
    public static final class C40002e implements C36068c {

        /* renamed from: a */
        public final C36068c f101940a;

        /* renamed from: b */
        final /* synthetic */ Runnable f101941b;

        /* renamed from: c */
        final /* synthetic */ C36067b f101942c;

        /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$e$a */
        public static final class C40003a implements C36067b {

            /* renamed from: a */
            final /* synthetic */ C40002e f101943a;

            C40003a(C40002e eVar) {
                this.f101943a = eVar;
            }

            /* renamed from: a */
            public final void mo60361a(C8652b bVar, Object obj) {
                C52711k.m112240b(bVar, "message");
                this.f101943a.f101942c.mo60361a(bVar, obj);
            }

            /* renamed from: a */
            public final void mo60360a(TextureView textureView, int i, int i2) {
                this.f101943a.f101942c.mo60360a(textureView, i, i2);
            }
        }

        /* renamed from: b */
        public final void mo74823b() {
        }

        /* renamed from: c */
        public final void mo74824c() {
        }

        /* renamed from: d */
        public final TextureRenderView mo74825d() {
            return null;
        }

        /* renamed from: a */
        public final void mo74820a() {
            this.f101940a.mo74820a();
        }

        /* renamed from: a */
        public final void mo74821a(boolean z) {
            this.f101940a.mo74821a(z);
        }

        C40002e(Runnable runnable, C36067b bVar) {
            this.f101941b = runnable;
            this.f101942c = bVar;
            this.f101940a = C36173w.m81665a().generateLivePlayHelper(runnable, new C40003a(this));
        }

        /* renamed from: a */
        public final void mo74822a(boolean z, LiveRoomStruct liveRoomStruct, FrameLayout frameLayout) {
            C52711k.m112240b(liveRoomStruct, "room");
            this.f101940a.mo74822a(z, liveRoomStruct, frameLayout);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$f */
    static final /* synthetic */ class C40004f extends C52710j implements C52671b<Boolean, C52860x> {
        C40004f(C33206p pVar) {
            super(1, pVar);
        }

        public final String getName() {
            return "handleSystemCamera";
        }

        public final C52761d getOwner() {
            return C52728w.m112245a(C33206p.class);
        }

        public final String getSignature() {
            return "handleSystemCamera(Z)V";
        }

        public final /* synthetic */ Object invoke(Object obj) {
            ((C33206p) this.receiver).mo70459a(((Boolean) obj).booleanValue());
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$g */
    static final class C40005g<T> implements C1684ah<T> {

        /* renamed from: a */
        final /* synthetic */ String f101944a;

        /* renamed from: b */
        final /* synthetic */ int f101945b;

        C40005g(String str, int i) {
            this.f101944a = str;
            this.f101945b = i;
        }

        /* renamed from: a */
        public final void mo6171a(C1682af<BaseResponse> afVar) {
            C52711k.m112240b(afVar, "it");
            afVar.mo6164a(PushSettingsApiManager.m91545b(this.f101944a, this.f101945b));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$h */
    static final /* synthetic */ class C40006h extends C52710j implements C52688s<Activity, Fragment, Integer, String, String, C52860x> {

        /* renamed from: a */
        public static final C40006h f101946a = new C40006h();

        C40006h() {
            super(5);
        }

        public final String getName() {
            return "startCameraActivity";
        }

        public final C52761d getOwner() {
            return C52728w.m112246a(C47663ad.class, "main_tiktokI18nRelease");
        }

        public final String getSignature() {
            return "startCameraActivity(Landroid/app/Activity;Landroid/support/v4/app/Fragment;ILjava/lang/String;Ljava/lang/String;)V";
        }

        /* renamed from: a */
        public final /* synthetic */ Object mo58987a(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
            Activity activity = (Activity) obj;
            Fragment fragment = (Fragment) obj2;
            int intValue = ((Number) obj3).intValue();
            String str = (String) obj4;
            String str2 = (String) obj5;
            C52711k.m112240b(activity, "p1");
            C52711k.m112240b(str, "p4");
            C52711k.m112240b(str2, "p5");
            C47663ad.m103171a(activity, fragment, intValue, str, str2);
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl$i */
    public static final class C40007i implements C33090a {

        /* renamed from: a */
        final /* synthetic */ C39979m f101947a;

        C40007i(C39979m mVar) {
            this.f101947a = mVar;
        }
    }

    public final String typeVerificationEnterprise() {
        return "commerce_user";
    }

    public final C40016i adUtilsService() {
        return new C40009b();
    }

    public final C40011d bridgeService() {
        return new C40011d();
    }

    public final boolean canIM() {
        return C33194e.m76264a();
    }

    public final C40018k contactUtilService() {
        return C32782b.f85367a;
    }

    public final Fragment createConnectedRelationFragment() {
        return new C32123b();
    }

    public final Fragment createRecommendUserFragment() {
        return new C40346dr();
    }

    public final C40019l enterpriseUtilsService() {
        return new C39998a();
    }

    public final C40015h favoritesMobUtilsService() {
        return new C40015h();
    }

    public final C52688s<Activity, Fragment, Integer, String, String, C52860x> getStartCameraActivity() {
        return C40006h.f101946a;
    }

    public final C39714a getTTDownloaderDepend() {
        return new ProfileDownloadDependImpl();
    }

    public final boolean isEnableSettingDiskManager() {
        return C29499a.m69636a();
    }

    public final boolean needShowProfileGuideToFillAvatarAndNickname() {
        return C39826d.m88568a();
    }

    public final int getCloseWeiboEntry() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return 0;
    }

    public final String getGradientPunishWarningSettingsBubbleText() {
        GradientPunishWarning b = C40878a.m90443b();
        if (b != null) {
            String bubbleText = b.getBubbleText();
            if (bubbleText != null) {
                return bubbleText;
            }
        }
        return "";
    }

    public final C52762e<C52860x> getNotificationManagerHandleSystemCamera() {
        return new C40004f(C33207a.m76310a());
    }

    public final void logShowProfileDiskManagerGuideView() {
        C23891e eVar = C23891e.f63559a;
        C23891e.m58604a().storeBoolean("has_show_disk_manager_guide", true);
    }

    public final boolean platformInfoManagerHasPlatformBinded() {
        return C19718b.m48210a().mo41124b();
    }

    public final boolean shouldUseRecyclerPartialUpdate() {
        return MigrateABTestModel.getInstance().shouldUseRecyclerPartialUpdate();
    }

    public static IProfileDependentComponentService createIProfileDependentComponentServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(IProfileDependentComponentService.class);
        if (a != null) {
            return (IProfileDependentComponentService) a;
        }
        return new ProfileDependentComponentImpl();
    }

    public final boolean bindHintWindowsRulerShouldShowCompletePhone() {
        C32939a a = C32939a.m75837a();
        C52711k.m112236a((Object) a, "BindHintWindowsRuler.inst()");
        if (!a.f85602a) {
            return true;
        }
        return false;
    }

    public final int getBindFGGuideTextIndex() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return MigrateABTestModel.getInstance().getBindFGGuideTextIndex();
    }

    public final boolean isBigBriefIntroduce() {
        return C10181b.m20511a().mo18172a(ProfileFontStyleExperiment.class, true, "profile_intro_new_style", 31744, false);
    }

    public final boolean isFtcBindEnable() {
        return C10181b.m20511a().mo18172a(FtcBindExperiment.class, true, "ftc_bind_enable", 31744, false);
    }

    public final boolean isStarAtlasCooperationEntryOpen() {
        C52711k.m112236a((Object) C41589c.m91432a(), "AbTestManager.getInstance()");
        return MigrateABTestModel.getInstance().isStarAtlasCooperationEntryOpen();
    }

    public final C2201v<Boolean> needShowDiskManagerGuideView() {
        C2201v<Boolean> a = C2201v.m6601a((C2205y<T>) C40000c.f101938a).mo6529b(C2168a.m6521b()).mo6514a(C1667a.m5940a());
        C52711k.m112236a((Object) a, "Observable.create(Observ…dSchedulers.mainThread())");
        return a;
    }

    public final void onPunishWarningShow() {
        C26890h.m65011a("violation_bubble_show", C23089d.m56640a().mo47829a("enter_from", "personal_homepage").f61491a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:16:0x0058  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean shouldShowGradientPunishWarningBubble() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r1 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            boolean r0 = r0.isLogin()
            r1 = 0
            if (r0 == 0) goto L_0x0086
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r2 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r0 = r0.getCurUserId()
            java.lang.String r2 = "AccountProxyService.userService().curUserId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r2 = "uid"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            com.ss.android.ugc.aweme.protection.gradientpunish.GradientPunishWarning r2 = com.p683ss.android.ugc.aweme.protection.gradientpunish.C40878a.m90443b()
            r3 = 1
            if (r2 == 0) goto L_0x0052
            int r4 = r2.getWarnType()
            if (r4 != 0) goto L_0x0035
            goto L_0x0052
        L_0x0035:
            int r0 = r2.getWarnType()
            r4 = 2
            if (r0 < r4) goto L_0x0055
            java.lang.String r0 = r2.getBubbleText()
            boolean r0 = com.bytedance.p879t.p882c.C13248c.m26638a(r0)
            if (r0 != 0) goto L_0x0055
            java.lang.String r0 = r2.getDetailUrl()
            boolean r0 = com.bytedance.p879t.p882c.C13248c.m26638a(r0)
            if (r0 != 0) goto L_0x0055
            r0 = 1
            goto L_0x0056
        L_0x0052:
            com.p683ss.android.ugc.aweme.protection.gradientpunish.C40878a.m90444b(r0, r1)
        L_0x0055:
            r0 = 0
        L_0x0056:
            if (r0 == 0) goto L_0x0086
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r2 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r0 = r0.getCurUserId()
            java.lang.String r2 = "AccountProxyService.userService().curUserId"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r2 = "userId"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            com.ss.android.ugc.aweme.base.h.g r2 = com.p683ss.android.ugc.aweme.protection.gradientpunish.C40878a.f104052b
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r5 = "has_click_warning_bubble_"
            r4.<init>(r5)
            r4.append(r0)
            java.lang.String r0 = r4.toString()
            boolean r0 = r2.mo48705a(r0, r1)
            if (r0 != 0) goto L_0x0086
            return r3
        L_0x0086:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl.shouldShowGradientPunishWarningBubble():boolean");
    }

    public final boolean isDetailActivity(Activity activity) {
        return activity instanceof DetailActivity;
    }

    public final boolean isUserProfileActivity(Activity activity) {
        return activity instanceof UserProfileActivity;
    }

    public final C40021n getMainTabPreference(Context context) {
        return new C40024q();
    }

    public final boolean shouldDoCaptcha(Exception exc) {
        return C24501b.m59896a(exc);
    }

    public final boolean bindHintWindowsRulerCanShowBindDialog(boolean z) {
        return C32939a.m75837a().mo69831a(z);
    }

    public final String hexDigest(String str) {
        C52711k.m112240b(str, "string");
        return C13032a.m26205a(str);
    }

    public final C39870a mainAnimViewModel(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "activity");
        return new C39999b(fragmentActivity);
    }

    public final void resetRecommendCountForFollowingFollowerActivity(Activity activity) {
        if (activity instanceof FollowingFollowerActivity) {
            ((FollowingFollowerActivity) activity).mo65244a();
        }
    }

    public final void startDiskManagerActivity(Context context) {
        C52711k.m112240b(context, "context");
        context.startActivity(new Intent(context, DiskManagerActivity.class));
    }

    public final void clearNinePatchBubbleState(Context context) {
        if (context != null) {
            C38588b a = C38589a.m85915a();
            C52711k.m112240b(context, "context");
            a.mo78522a().storeBoolean(C38588b.f98136j, false);
        }
    }

    public final void preloadMiniApp(String str) {
        C36983a b = C36983a.m83185b();
        C52711k.m112236a((Object) b, "MiniAppServiceProxy.inst()");
        b.mo76294a().preloadMiniApp(str);
    }

    public final C22474a rankingTagSpan(BlueVBrandInfo blueVBrandInfo) {
        C52711k.m112240b(blueVBrandInfo, "info");
        return new C22474a(blueVBrandInfo.getRank(), blueVBrandInfo.getTagName(), 7);
    }

    public final boolean onAntiCrawlerEvent(String str) {
        boolean z = false;
        if (str != null) {
            CharSequence charSequence = str;
            if (!C52830p.m112456b(charSequence, (CharSequence) "/aweme/v1/aweme/post/?", false, 2, (Object) null) && !C52830p.m112456b(charSequence, (CharSequence) "/aweme/v1/aweme/favorite/?", false, 2, (Object) null) && !C52830p.m112456b(charSequence, (CharSequence) "/aweme/v1/aweme/listcollection/?", false, 2, (Object) null)) {
                return false;
            }
            z = true;
        }
        return z;
    }

    public final void onPunishWarningClick(Context context) {
        C52711k.m112240b(context, "context");
        C40878a.m90439a(context);
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        String curUserId = g.getCurUserId();
        C52711k.m112236a((Object) curUserId, "curUid");
        C40878a.m90444b(curUserId, true);
        C26890h.m65011a("enter_violation_record", C23089d.m56640a().mo47829a("enter_method", "bubble").mo47829a("enter_from", "personal_homepage").f61491a);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0072, code lost:
        if ((java.lang.System.currentTimeMillis() - com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r0.f103202b, "perfect_user_info", 0).getLong("last_guide_close_time", 0)) > java.util.concurrent.TimeUnit.DAYS.toMillis(7)) goto L_0x0041;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final java.lang.Object showCompletePhone(com.p683ss.android.ugc.aweme.discover.p1659ui.NoticeView r8) {
        /*
            r7 = this;
            java.lang.String r0 = "noticeBar"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r0)
            com.ss.android.ugc.aweme.profile.ui.widget.b r0 = new com.ss.android.ugc.aweme.profile.ui.widget.b
            r0.<init>(r8)
            com.ss.android.ugc.aweme.IAccountUserService r8 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            com.ss.android.ugc.aweme.profile.model.User r8 = r8.getCurUser()
            r1 = 1
            r2 = 0
            if (r8 == 0) goto L_0x0075
            com.ss.android.ugc.aweme.IAccountUserService r3 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            boolean r3 = r3.isLogin()
            if (r3 != 0) goto L_0x0021
            goto L_0x0075
        L_0x0021:
            java.lang.String r3 = r8.getBindPhone()
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.app.SharePrefCache r8 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r8 = r8.getHasEnterBindPhone()
            java.lang.Object r8 = r8.mo47782d()
            java.lang.Boolean r8 = (java.lang.Boolean) r8
            boolean r8 = r8.booleanValue()
            if (r8 != 0) goto L_0x0075
            r0.f103203c = r1
        L_0x0041:
            r2 = 1
            goto L_0x0075
        L_0x0043:
            int r3 = r8.getGender()
            if (r3 == 0) goto L_0x0053
            java.lang.String r8 = r8.getBirthday()
            boolean r8 = android.text.TextUtils.isEmpty(r8)
            if (r8 == 0) goto L_0x0075
        L_0x0053:
            android.content.Context r8 = r0.f103202b
            java.lang.String r3 = "perfect_user_info"
            android.content.SharedPreferences r8 = com.p683ss.android.ugc.aweme.keva.C35807d.m80935a(r8, r3, r2)
            java.lang.String r3 = "last_guide_close_time"
            r4 = 0
            long r3 = r8.getLong(r3, r4)
            long r5 = java.lang.System.currentTimeMillis()
            long r5 = r5 - r3
            java.util.concurrent.TimeUnit r8 = java.util.concurrent.TimeUnit.DAYS
            r3 = 7
            long r3 = r8.toMillis(r3)
            int r8 = (r5 > r3 ? 1 : (r5 == r3 ? 0 : -1))
            if (r8 <= 0) goto L_0x0075
            goto L_0x0041
        L_0x0075:
            if (r2 == 0) goto L_0x0079
            boolean r8 = r0.f103203c
        L_0x0079:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.service.ProfileDependentComponentImpl.showCompletePhone(com.ss.android.ugc.aweme.discover.ui.NoticeView):java.lang.Object");
    }

    public final void showProfileGuideToFillAvatarAndNickname(C0654k kVar, Bundle bundle) {
        C39826d.m88570a(kVar, bundle);
    }

    public final void startQRCodeActivityV2(Context context, C40952c cVar) {
        QRCodeActivityV2.m90640a(context, cVar);
    }

    public final boolean hasUnreadStoryWithCheck(User user, User user2) {
        return StoryUnreadUtils.hasUnreadStoryWithCheck(user, user2);
    }

    public final void openFestivalPageWithSchema(Context context, String str) {
        C52711k.m112240b(str, "linkUrl");
        C31361b.m73110a(context, str);
    }

    public final void startHeaderDetailActivity(Activity activity, Bundle bundle) {
        if (bundle == null) {
            C52711k.m112234a();
        }
        HeaderDetailActivity.m89055a(activity, bundle);
    }

    public final RecyclerView buildBaseRecyclerView(RecyclerView recyclerView, C30462o oVar) {
        C52711k.m112240b(recyclerView, "recyclerView");
        C52711k.m112240b(oVar, "onHasMoreListener");
        return C47843ee.m103487a(recyclerView, oVar, 10);
    }

    public final void launchProfileCoverCropActivity(FragmentActivity fragmentActivity, Aweme aweme) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(aweme, "aweme");
        I18nBridgeService.getBridgeService_Monster().enterProfileCropActivity(fragmentActivity, aweme);
    }

    public final C36068c newLivePlayHelper(Runnable runnable, C36067b bVar) {
        C52711k.m112240b(runnable, "onStreamPlay");
        C52711k.m112240b(bVar, "callback");
        return new C40002e(runnable, bVar);
    }

    public final void startAdsAppActivity(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "schema");
        C23060d.f61431e.mo47789a(context, str, "");
    }

    public final void startDownloadControlSettingActivity(Activity activity, int i) {
        C52711k.m112240b(activity, "activity");
        Intent intent = new Intent(activity, DownloadControlSettingActivity.class);
        intent.putExtra("currentSettingsValue", i);
        activity.startActivity(intent);
    }

    public final C1680ad<BaseResponse> setPrivateSettingItem(String str, int i) {
        C52711k.m112240b(str, "field");
        C1680ad<BaseResponse> a = C1680ad.m5958a((C1684ah<T>) new C40005g<T>(str, i)).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a());
        C52711k.m112236a((Object) a, "Single.create<BaseRespon…dSchedulers.mainThread())");
        return a;
    }

    public final Object showBindPhoneDialog(NoticeView noticeView, Context context) {
        C52711k.m112240b(noticeView, "noticeBar");
        C52711k.m112240b(context, "context");
        C40424c cVar = new C40424c(noticeView, context);
        if (!C40424c.f103204a) {
            C32939a a = C32939a.m75837a();
            if (a.f85603b != null) {
                a.f85603b.mo69835a(System.currentTimeMillis());
            }
            C40424c.f103204a = true;
        }
        C32947c.m75850a("personal_home");
        return cVar;
    }

    public final void startChallengeAvatarModifyActivity(Activity activity, Challenge challenge) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(challenge, "challenge");
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(challenge, "challenge");
        Intent intent = new Intent(activity, ChallengeAvatarModifyActivity.class);
        intent.putExtra("challenge_info", challenge);
        activity.startActivity(intent);
    }

    public final void startCrossPlatformActivity(Context context, String str) {
        C52711k.m112240b(context, "context");
        try {
            Intent intent = new Intent(context, CrossPlatformActivity.class);
            IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
            C52711k.m112236a((Object) baseUserService_Monster, "ServiceManager.get().get…IUserService::class.java)");
            Builder appendQueryParameter = Uri.parse(C32816h.m75716b().getStarAtlasProfileLink()).buildUpon().appendQueryParameter("scene", "promotion").appendQueryParameter("source_user_id", baseUserService_Monster.getCurrentUserID());
            String str2 = "author_id";
            if (str == null) {
                str = "";
            }
            intent.setData(appendQueryParameter.appendQueryParameter(str2, str).build());
            context.startActivity(intent);
        } catch (C10174a e) {
            C32458a.m75143a((Exception) e);
        }
    }

    public final void showCaptchaDialog(C0654k kVar, C23459a aVar, C24493b bVar) {
        C24501b.m59895a(kVar, aVar, bVar);
    }

    public final C37899a newLiveBlurProcessor(int i, float f, C18942a aVar) {
        return new C37899a(i, f, new C40001d(aVar));
    }

    public final boolean bindHintWindowsRulerGetShowCompleteProfileDialog(List<String> list, int i, int i2) {
        C52711k.m112240b(list, "urlList");
        C32943c a = C32939a.m75837a().mo69830a(list, i, i2);
        C52711k.m112236a((Object) a, "BindHintWindowsRuler.ins…g(urlList, height, width)");
        return a.f85614a;
    }

    public final void activeTT(Context context, String str, String str2) {
        String str3;
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "targetPackage");
        C52711k.m112240b(str2, "userId");
        if (C20902b.m53242a().isLogin()) {
            String str4 = C18845b.f52036a;
            String str5 = "";
            CookieManager instance = CookieManager.getInstance();
            if (instance == null) {
                str3 = "";
            } else {
                str3 = instance.getCookie(str4);
            }
            if (!TextUtils.isEmpty(str3)) {
                String[] split = str3.split(";");
                int length = split.length;
                int i = 0;
                while (true) {
                    if (i >= length) {
                        break;
                    }
                    String str6 = split[i];
                    if (!TextUtils.isEmpty(str6)) {
                        String[] split2 = str6.split("=");
                        if (split2.length >= 2 && split2[0].trim().equals("sessionid")) {
                            str5 = split2[1];
                            break;
                        }
                    }
                    i++;
                }
            }
            try {
                C20061b.m49546a(context).mo42110a(str, Long.parseLong(str2), str5, null);
            } catch (Exception unused) {
            }
        }
    }

    public final void openAvatarSettingPage(Context context, User user, String str) {
        String str2;
        boolean z;
        String str3;
        boolean z2;
        if (context != null && user != null) {
            C26131l a = CommerceSettingsApi.m62160a();
            if (a != null) {
                str2 = a.f69011f;
            } else {
                str2 = null;
            }
            CharSequence charSequence = str2;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                str2 = null;
            }
            if (str2 == null) {
                str2 = "https://sf3-ttcdn-tos.pstatp.com/obj/ttfe/aweme/fe/avatar/index.html?hide_nav_bar=1";
            }
            Builder appendQueryParameter = Uri.parse(str2).buildUpon().appendQueryParameter("from", str);
            Long b = C26121f.f68971d.mo53637b(user);
            if (b != null) {
                str3 = String.valueOf(b.longValue());
            } else {
                str3 = null;
            }
            CharSequence charSequence2 = str3;
            if (charSequence2 == null || charSequence2.length() == 0) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                appendQueryParameter.appendQueryParameter("dec_id", str3);
            }
            appendQueryParameter.appendQueryParameter("author_id", user.getUid());
            C26540w.m64223a(context, appendQueryParameter.toString(), (String) null, true, null);
            C47718bf.m103288a(new C39803g());
            C26890h.m65011a("click_setting_decoration", C52550ab.m112050a(C52856t.m112465a("enter_from", str), C52856t.m112465a("author_id", user.getUid())));
        }
    }

    public final void onI18nVerificationViewClick(Context context, User user, String str, String str2) {
        C52711k.m112240b(user, "user");
        C52711k.m112240b(str, "type");
        VerifyActionManager.INSTANCE.onI18nVerificationViewClick(context, user, str, str2);
    }

    public final void watchFromProfile(Context context, User user, boolean z, C39979m mVar) {
        ILiveOuterService a = C36173w.m81665a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
        a.getLiveWatcherUtils().mo70096a(context, user, z, new C40007i(mVar));
    }

    public final void watchLiveMob(Context context, User user, String str, String str2) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(user, "user");
        C52711k.m112240b(str, "enterFrom");
        C52711k.m112240b(str2, "enterMethod");
        ILiveOuterService a = C36173w.m81665a();
        C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
        a.getLiveWatcherUtils().mo70097a(new C36006a(context, user).mo74739b(str).mo74740c(str2));
    }

    public final void startHeaderDetailActivity(Activity activity, View view, String str, User user) {
        String[] strArr;
        C52711k.m112240b(view, "preView");
        C52711k.m112240b(user, "user");
        C47661ab a = C47661ab.m103163a().mo94970a("extra_zoom_info", (Parcelable) ZoomAnimationUtils.m103150a(view)).mo94973a("enable_edit_img", false);
        String str2 = "uri";
        if (TextUtils.isEmpty(str)) {
            strArr = C47915gg.m103648a(C47915gg.m103659h(user));
        } else {
            strArr = new String[]{str};
        }
        HeaderDetailActivity.m89055a(activity, a.mo94974a(str2, strArr).mo94973a("enable_download_img", true).mo94971a("share_info", (Serializable) user).f120139a);
    }

    public final <T> T apiExecuteGetJSONObject(String str, Class<T> cls, String str2, boolean z, String str3) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(cls, "cls");
        return Api.m56465a(0, str, cls, str2, (C19181f) null);
    }

    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, int i) {
        boolean z2;
        C52711k.m112240b(user, "user");
        if (user != null) {
            user.setXmasUnlockCount(i);
        }
        UrlModel f = C47915gg.m103657f(user);
        if (f != null && C23715d.m58204b(f.getUrlList())) {
            int size = f.getUrlList().size();
            String[] strArr = new String[size];
            for (int i2 = 0; i2 < size; i2++) {
                strArr[i2] = (String) f.getUrlList().get(i2);
            }
            if (user == null || f == null || user.getAvatarVideoUri() != f) {
                z2 = false;
            } else {
                z2 = true;
            }
            HeaderDetailActivity.m89056a(activity, view, 1.0f, user, z, z2, null, strArr);
        }
    }

    public final void startHeaderDetailActivity(Activity activity, View view, User user, boolean z, boolean z2) {
        C52711k.m112240b(user, "user");
        UrlModel f = C47915gg.m103657f(user);
        if (f != null && C23715d.m58204b(f.getUrlList())) {
            int size = f.getUrlList().size();
            String[] strArr = new String[size];
            for (int i = 0; i < size; i++) {
                strArr[i] = (String) f.getUrlList().get(i);
            }
            Bundle bundle = new Bundle();
            bundle.putParcelable("extra_zoom_info", ZoomAnimationUtils.m103150a(view));
            bundle.putStringArray("uri", strArr);
            bundle.putBoolean("enable_edit_img", z2);
            bundle.putFloat("wh_ratio", 1.0f);
            bundle.putBoolean("enable_download_img", z);
            bundle.putBoolean("handle_with_video_avatar", false);
            if (user != null) {
                bundle.putSerializable("share_info", user);
            }
            HeaderDetailActivity.m89055a(activity, bundle);
        }
    }

    public final SpannableStringBuilder ellipsizeText2ExceptWidth(SpannableStringBuilder spannableStringBuilder, TextPaint textPaint, int i, int i2, int i3, int i4) {
        C52711k.m112240b(spannableStringBuilder, "spannable");
        C52711k.m112240b(textPaint, "paint");
        SpannableStringBuilder a = C22473b.m55522a(spannableStringBuilder, textPaint, i, i2, i3, i4);
        C52711k.m112236a((Object) a, "TagUtil.ellipsizeText2Ex…e, keepOffset, keepWidth)");
        return a;
    }

    public final C40426d showProfileCompleteView(NoticeView noticeView, Context context, OnClickListener onClickListener, OnClickListener onClickListener2, float f, boolean z) {
        int i;
        C52711k.m112240b(noticeView, "noticeBar");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(onClickListener, "onClick");
        C52711k.m112240b(onClickListener2, "onCloseClick");
        float f2 = f * 100.0f;
        if (z) {
            i = 1;
        } else {
            i = 2;
        }
        C40426d dVar = new C40426d(noticeView, context, new C32943c(true, f2, i), onClickListener, onClickListener2);
        return dVar;
    }

    public final C40426d showProfileCompleteView(NoticeView noticeView, Context context, OnClickListener onClickListener, List<String> list, int i, int i2) {
        C52711k.m112240b(noticeView, "noticeBar");
        C52711k.m112240b(context, "context");
        C52711k.m112240b(onClickListener, "onClick");
        C52711k.m112240b(list, "urlList");
        return new C40426d(noticeView, context, C32939a.m75837a().mo69830a(list, i, i2), onClickListener);
    }

    public final <T> T apiExecuteGetJSONObject(int i, String str, Class<T> cls, String str2, C19181f fVar, boolean z, String str3) {
        C52711k.m112240b(str, "url");
        C52711k.m112240b(cls, "cls");
        C52711k.m112240b(fVar, "headerGroup");
        return Api.m56465a(i, str, cls, str2, fVar);
    }

    public final void gotoCropActivity(Activity activity, String str, boolean z, float f, int i, int i2, int i3, int i4) {
        C52711k.m112240b(activity, "activity");
        C52711k.m112240b(str, "originalUrl");
        C40055a.m89042a(activity, str, z, f, i, i2, i3, i4);
    }

    public final void gotoCropActivity(Fragment fragment, String str, boolean z, float f, int i, int i2, int i3, int i4) {
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(str, "originalUrl");
        C52711k.m112240b(fragment, "fragment");
        C52711k.m112240b(str, "originalUrl");
        Intent intent = new Intent(fragment.getContext(), CropActivity.class);
        intent.putExtra("original_url", str);
        intent.putExtra("is_oval", z);
        intent.putExtra("rect_ratio", f);
        intent.putExtra("rect_margin", i);
        intent.putExtra("extra_min_width", i3);
        intent.putExtra("extra_min_height", i4);
        fragment.startActivityForResult(intent, i2);
    }

    public final void displayActivityLink(Context context, FrameLayout frameLayout, RemoteImageView remoteImageView, DmtTextView dmtTextView, ImageView imageView, ImageView imageView2, String str, String str2, LinkInfo linkInfo) {
        String str3;
        boolean z;
        LayoutParams layoutParams;
        LinkInfo linkInfo2 = linkInfo;
        Context context2 = context;
        C52711k.m112240b(context, "context");
        C40515a aVar = new C40515a(context2, frameLayout, remoteImageView, dmtTextView, imageView, imageView2);
        if (str == null) {
            str3 = "";
        } else {
            str3 = str;
        }
        C52711k.m112240b(str3, "<set-?>");
        aVar.f103403e = str3;
        if (linkInfo2 != null) {
            C22711b d = C23794bh.m58390d();
            C52711k.m112236a((Object) d, "LegacyServiceUtils.getTimeLockRulerService()");
            if (!d.mo47103a() || (linkInfo2 != null && linkInfo2.teenagerModeEnable)) {
                z = false;
            } else {
                z = true;
            }
            if (!z && !C40515a.f103397l) {
                FrameLayout frameLayout2 = aVar.f103405g;
                if (frameLayout2 == null || frameLayout2.getVisibility() != 0) {
                    FrameLayout frameLayout3 = aVar.f103405g;
                    if (frameLayout3 != null) {
                        frameLayout3.setVisibility(0);
                    }
                    if (aVar.f103400b && C52711k.m112239a((Object) aVar.f103402d, (Object) "others_homepage")) {
                        C23089d a = C23089d.m56640a();
                        a.mo47829a("enter_from", aVar.f103402d);
                        a.mo47829a("gen", C31357a.m73100c());
                        a.mo47829a("to_user_id", aVar.f103403e);
                        C26890h.m65011a("xmas_banner_show", a.f61491a);
                    }
                    if (!C52711k.m112239a((Object) aVar.f103402d, (Object) "others_homepage")) {
                        C23089d a2 = C23089d.m56640a();
                        a2.mo47829a("enter_from", "personal_homepage");
                        if (aVar.f103400b) {
                            a2.mo47829a("gen", C31357a.m73100c());
                        }
                        C26890h.m65011a("h5_show_detail", a2.f61491a);
                    }
                    DmtTextView dmtTextView2 = aVar.f103407i;
                    C13842a aVar2 = null;
                    if (dmtTextView2 != null) {
                        layoutParams = dmtTextView2.getLayoutParams();
                    } else {
                        layoutParams = null;
                    }
                    if (layoutParams != null) {
                        FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                        if (VERSION.SDK_INT >= 21) {
                            RemoteImageView remoteImageView2 = aVar.f103406h;
                            if (remoteImageView2 != null) {
                                remoteImageView2.setOutlineProvider(new C47856en(C23728o.m58241a(2.0d)));
                            }
                            RemoteImageView remoteImageView3 = aVar.f103406h;
                            if (remoteImageView3 != null) {
                                remoteImageView3.setClipToOutline(true);
                            }
                        }
                        C14229b a3 = C14232c.m29169a(Uri.parse(linkInfo2.backgroundUrl)).mo26449a();
                        C13773e a4 = C13771c.m27870a();
                        RemoteImageView remoteImageView4 = aVar.f103406h;
                        if (remoteImageView4 != null) {
                            aVar2 = remoteImageView4.getController();
                        }
                        C13783a c = ((C13773e) ((C13773e) ((C13773e) ((C13773e) a4.mo25759b(aVar2)).mo25762c(true)).mo25751a((C13791d<? super INFO>) new C40518c<Object>(aVar, layoutParams2, linkInfo2))).mo25757b(a3)).mo25763d();
                        RemoteImageView remoteImageView5 = aVar.f103406h;
                        if (remoteImageView5 != null) {
                            remoteImageView5.setController(c);
                        }
                        DmtTextView dmtTextView3 = aVar.f103407i;
                        if (dmtTextView3 != null) {
                            dmtTextView3.setText(linkInfo2.text);
                        }
                        FrameLayout frameLayout4 = aVar.f103405g;
                        if (frameLayout4 != null) {
                            frameLayout4.setOnClickListener(new C40517b(aVar, linkInfo2));
                        } else {
                            return;
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                    }
                }
            }
        }
        FrameLayout frameLayout5 = aVar.f103405g;
        if (frameLayout5 != null) {
            frameLayout5.setVisibility(8);
        }
    }
}
