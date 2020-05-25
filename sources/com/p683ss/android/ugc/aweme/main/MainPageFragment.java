package com.p683ss.android.ugc.aweme.main;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.Intent;
import android.content.res.Resources;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver.OnGlobalLayoutListener;
import android.widget.TabWidget;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.p669e.C10703a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost;
import com.bytedance.ies.uikit.tabhost.FragmentTabHost.C11156b;
import com.bytedance.keva.Keva;
import com.google.gson.C17971f;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.account.security.C22146a;
import com.p683ss.android.ugc.aweme.account.security.C22148c;
import com.p683ss.android.ugc.aweme.account.security.C22149d;
import com.p683ss.android.ugc.aweme.account.security.SafeInfoNoticeApi.C22145a;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.app.p1380j.C23110b;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23393g;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23689d;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23694h;
import com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26216b;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26224g;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.compliance.business.api.p1601a.C27018a;
import com.p683ss.android.ugc.aweme.discover.mob.C28397c;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28096d;
import com.p683ss.android.ugc.aweme.experiment.PhoneChangeExperiment;
import com.p683ss.android.ugc.aweme.familiar.C29633a;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.guide.C30289j;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1720f.C30230b;
import com.p683ss.android.ugc.aweme.feed.p1720f.C30230b.C30234c;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30310ab;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30314af;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30315ag;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30319aj;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30337f;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30340i;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30342k;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30750af;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30778av;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30800bj;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30800bj.C30801a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30800bj.C30804d;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31143x;
import com.p683ss.android.ugc.aweme.feed.p1736ui.DisLikeAwemeLayout;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31076b;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31083i;
import com.p683ss.android.ugc.aweme.festival.christmas.C31357a;
import com.p683ss.android.ugc.aweme.festival.christmas.C31361b;
import com.p683ss.android.ugc.aweme.festival.p1739a.C31347a;
import com.p683ss.android.ugc.aweme.festival.p1739a.C31348b;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31763c;
import com.p683ss.android.ugc.aweme.follow.experiment.RecNumExperiment;
import com.p683ss.android.ugc.aweme.follow.p1763b.C31869f;
import com.p683ss.android.ugc.aweme.follow.p1767ui.C31979a;
import com.p683ss.android.ugc.aweme.follow.presenter.C31884f;
import com.p683ss.android.ugc.aweme.follow.presenter.C31885g;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.friends.p1787a.C32504a;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.friends.utils.C32783c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p683ss.android.ugc.aweme.homepage.C32981c;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p683ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.C32971a;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C32969a;
import com.p683ss.android.ugc.aweme.homepage.api.p1800ui.HomePageUIFrameService;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C32996b.C32997a;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C33008f;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C33008f.C33009a;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C33008f.C33010b;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C33008f.C33011c;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C33008f.C33012d;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.inflate.X2CFragmentMainPage;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33055ar;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33071k;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.view.MainBottomTabView;
import com.p683ss.android.ugc.aweme.journey.C35781s;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.legoImp.service.MainLooperOptService;
import com.p683ss.android.ugc.aweme.legoImp.service.MainLooperOptService.C35922a;
import com.p683ss.android.ugc.aweme.legoImp.task.LocationStatusReportTask;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.location.LocationTask;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.main.experiment.ShowTabWithTextExperiment;
import com.p683ss.android.ugc.aweme.main.p1938b.C36514b;
import com.p683ss.android.ugc.aweme.main.p1944g.C36654a;
import com.p683ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p683ss.android.ugc.aweme.message.MessagesFragment;
import com.p683ss.android.ugc.aweme.money.growth.C37164d.C37165a;
import com.p683ss.android.ugc.aweme.newfollow.p2002ui.FriendTabFragment;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment;
import com.p683ss.android.ugc.aweme.notification.newstyle.C38297c;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23229c;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1382aq.C23251u;
import com.p683ss.android.ugc.aweme.p1436bi.C23827a.C23828a;
import com.p683ss.android.ugc.aweme.p1462bq.C23957c.C23958a;
import com.p683ss.android.ugc.aweme.p1462bq.C23962d;
import com.p683ss.android.ugc.aweme.p1462bq.C23962d.C23963a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p1807im.disableim.ImUnder16Manger;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47473m;
import com.p683ss.android.ugc.aweme.policy.notice.p2079a.C39504b;
import com.p683ss.android.ugc.aweme.policy.notice.p2081ui.PolicyNoticeToast;
import com.p683ss.android.ugc.aweme.port.C39525a;
import com.p683ss.android.ugc.aweme.profile.C39717ac;
import com.p683ss.android.ugc.aweme.profile.C39806c;
import com.p683ss.android.ugc.aweme.profile.C40733z;
import com.p683ss.android.ugc.aweme.profile.api.ActivityLinkManager;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2091a.C40205b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40242a;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.recommend.C41125m;
import com.p683ss.android.ugc.aweme.recommend.C41126n;
import com.p683ss.android.ugc.aweme.recommend.RecommendUserDialogShowStrategy;
import com.p683ss.android.ugc.aweme.setting.AsyncSettingsExperiment;
import com.p683ss.android.ugc.aweme.setting.p2136e.C41598d;
import com.p683ss.android.ugc.aweme.settings.SafeInfoNoticeFrequencySettings;
import com.p683ss.android.ugc.aweme.share.model.C42207a;
import com.p683ss.android.ugc.aweme.share.model.C42208b;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a.C42247b;
import com.p683ss.android.ugc.aweme.share.viewmodel.FeedPanelStateViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.festival.C43816e;
import com.p683ss.android.ugc.aweme.shortvideo.festival.C43818f;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45427bj;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47897fr;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.permission.C47937a;
import com.p683ss.android.ugc.aweme.utils.permission.C47946e;
import com.p683ss.android.ugc.aweme.video.C48039k;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p064c.p065a.C1683ag;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p093k.C2168a;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment */
public class MainPageFragment extends C23689d implements C11156b, C23694h, C31979a, C36671o {

    /* renamed from: A */
    public boolean f93465A;

    /* renamed from: B */
    FeedPanelStateViewModel f93466B;

    /* renamed from: C */
    ViewStub f93467C;

    /* renamed from: D */
    boolean f93468D;

    /* renamed from: E */
    boolean f93469E;

    /* renamed from: F */
    private View f93470F;

    /* renamed from: G */
    private String f93471G;

    /* renamed from: H */
    private PolicyNoticeToast f93472H;

    /* renamed from: I */
    private boolean f93473I = true;

    /* renamed from: J */
    private C31884f f93474J;

    /* renamed from: K */
    private MainPageDataViewModel f93475K;

    /* renamed from: L */
    private int f93476L;

    /* renamed from: M */
    private MainAnimViewModel f93477M;

    /* renamed from: O */
    private boolean f93478O;

    /* renamed from: P */
    private C42245a f93479P;

    /* renamed from: Q */
    private Handler f93480Q;

    /* renamed from: R */
    private int f93481R;

    /* renamed from: S */
    private boolean f93482S = Keva.getRepo("ab_repo_cold_boot").getBoolean("clear_red_point_cost", false);

    /* renamed from: T */
    private String f93483T = "";

    /* renamed from: U */
    private boolean f93484U;

    /* renamed from: V */
    private C32981c f93485V = new C32981c();

    /* renamed from: W */
    private Runnable f93486W;

    /* renamed from: X */
    private C22149d f93487X;

    /* renamed from: Y */
    private boolean f93488Y = true;

    /* renamed from: Z */
    private C30800bj f93489Z = null;

    /* renamed from: a */
    View f93490a;

    /* renamed from: aa */
    private boolean f93491aa = false;

    /* renamed from: ab */
    private int f93492ab = 0;

    /* renamed from: ac */
    private boolean f93493ac = false;

    /* renamed from: ad */
    private int f93494ad = -1;

    /* renamed from: ae */
    private boolean f93495ae = false;

    /* renamed from: af */
    private boolean f93496af = false;

    /* renamed from: b */
    protected MainBottomTabView f93497b;

    /* renamed from: c */
    ViewStub f93498c;

    /* renamed from: d */
    ViewStub f93499d;

    /* renamed from: e */
    public View f93500e;

    /* renamed from: j */
    DisLikeAwemeLayout f93501j;

    /* renamed from: k */
    C36514b f93502k;

    /* renamed from: l */
    protected TabChangeManager f93503l;

    /* renamed from: m */
    public C36483a f93504m;

    /* renamed from: n */
    public boolean f93505n;

    /* renamed from: o */
    public boolean f93506o;

    /* renamed from: p */
    public boolean f93507p;

    /* renamed from: q */
    public ScrollSwitchStateManager f93508q;

    /* renamed from: r */
    HomePageDataViewModel f93509r;

    /* renamed from: s */
    public DataCenter f93510s;

    /* renamed from: t */
    C36606dx f93511t;

    /* renamed from: u */
    public boolean f93512u;

    /* renamed from: v */
    View f93513v;

    /* renamed from: w */
    boolean f93514w;

    /* renamed from: x */
    boolean f93515x;

    /* renamed from: y */
    public boolean f93516y;

    /* renamed from: z */
    public UgAwemeActivitySetting f93517z;

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$DownloadFestivalTask */
    class DownloadFestivalTask implements LegoTask {
        public C35896f process() {
            return C35894d.m81063a(this);
        }

        public C35898h type() {
            return C35898h.BOOT_FINISH;
        }

        private DownloadFestivalTask() {
        }

        public void run(Context context) {
            MainPageFragment.this.mo75552f();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$InitBubbleGuideTask */
    class InitBubbleGuideTask implements LegoTask {
        public C35896f process() {
            return C35894d.m81063a(this);
        }

        public C35898h type() {
            return C35898h.BOOT_FINISH;
        }

        private InitBubbleGuideTask() {
        }

        public void run(Context context) {
            C18842a.m45934b(new C36601dt(MainPageFragment.this));
        }

        static final /* synthetic */ void lambda$run$0$MainPageFragment$InitBubbleGuideTask(MainPageFragment mainPageFragment) {
            C39525a bubbleGuideShown = AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().bubbleGuideShown();
            if (!C20902b.m53242a().isLogin() || !C20902b.m53242a().getCurUser().isShowImageBubble() || !AVExternalServiceImpl.getAVServiceImpl_Monster().configService().avsettingsConfig().enablePhotoMovie() || ((Boolean) bubbleGuideShown.get()).booleanValue()) {
                if (C20902b.m53242a().isLogin() && mainPageFragment.f93511t != null) {
                    mainPageFragment.f93511t.mo48523e(true);
                }
                return;
            }
            mainPageFragment.f93502k = new C36514b(mainPageFragment.f93498c);
            if (mainPageFragment.f93514w) {
                mainPageFragment.f93515x = true;
            } else {
                mainPageFragment.f93502k.mo75643a();
            }
            bubbleGuideShown.set(Boolean.valueOf(true));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainPageFragment$QueryFollowingTask */
    class QueryFollowingTask implements LegoTask {
        public C35896f process() {
            return C35894d.m81063a(this);
        }

        public C35898h type() {
            return C35898h.BOOT_FINISH;
        }

        private QueryFollowingTask() {
        }

        public void run(Context context) {
            MainPageFragment mainPageFragment = MainPageFragment.this;
            C10181b.m20511a().mo18168a(RecNumExperiment.class, true, "rec_num", 31744, 0);
        }
    }

    /* renamed from: H */
    private String m82319H() {
        return this.f93471G;
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo49118a(String str, String str2, boolean z, boolean z2) {
        if (z) {
            MainBottomTabView mainBottomTabView = this.f93497b;
            for (String str3 : mainBottomTabView.f85748e.keySet()) {
                C33071k kVar = (C33071k) mainBottomTabView.f85748e.get(str3);
                if (!(str3 == null || kVar == null)) {
                    if (str3.equals(str)) {
                        kVar.mo70061b(false);
                    } else {
                        kVar.mo70065p();
                    }
                }
            }
            if (TextUtils.equals(str, "HOME")) {
                mainBottomTabView.f85744a.setActivated(false);
                mainBottomTabView.f85746c.setActivated(false);
                mainBottomTabView.f85747d.setActivated(false);
            } else {
                mainBottomTabView.f85744a.setActivated(true);
                mainBottomTabView.f85746c.setActivated(true);
                mainBottomTabView.f85747d.setActivated(true);
            }
            mainBottomTabView.mo69947d(str);
        } else {
            C18842a.m45934b(new Runnable(str, str2, z2) {

                /* renamed from: a */
                final /* synthetic */ String f85753a;

                /* renamed from: b */
                final /* synthetic */ String f85754b;

                /* renamed from: c */
                final /* synthetic */ boolean f85755c;

                public final void run() {
                    MainBottomTabView mainBottomTabView = MainBottomTabView.this;
                    String str = this.f85753a;
                    String str2 = this.f85754b;
                    boolean z = this.f85755c;
                    if (str2 == null) {
                        str2 = "HOME";
                    }
                    if (!TextUtils.equals(str, str2) && !TextUtils.equals(str, "PUBLISH")) {
                        if (((C33071k) mainBottomTabView.f85748e.get(str)) != null) {
                            ((C33071k) mainBottomTabView.f85748e.get(str)).mo70061b(z);
                        }
                        C33071k kVar = (C33071k) mainBottomTabView.f85748e.get(str2);
                        if (TextUtils.equals(str, "HOME")) {
                            mainBottomTabView.f85744a.setActivated(false);
                            mainBottomTabView.f85746c.setActivated(false);
                            mainBottomTabView.f85747d.setActivated(false);
                            mainBottomTabView.f85745b.setActivated(false);
                        } else {
                            mainBottomTabView.f85744a.setActivated(true);
                            mainBottomTabView.f85746c.setActivated(true);
                            mainBottomTabView.f85747d.setActivated(true);
                            mainBottomTabView.f85745b.setActivated(true);
                        }
                        if (kVar != null) {
                            ((C33071k) mainBottomTabView.f85748e.get(str2)).mo70065p();
                        }
                        mainBottomTabView.mo69947d(str);
                    }
                }

                {
                    this.f85753a = r2;
                    this.f85754b = r3;
                    this.f85755c = r4;
                }
            });
        }
        if (!TextUtils.equals(str, "HOME")) {
            C10703a.m21575a(false);
        } else {
            C10703a.m21575a(true);
        }
        if (TextUtils.isEmpty(str2) || str2.equals("HOME") || TextUtils.isEmpty(str) || !str.equals("HOME")) {
            I18nBridgeService.getBridgeService_Monster().onMainTabChanged(this.f93503l, str);
        }
        if ("USER".equals(str)) {
            mo75556i();
        }
        C47718bf.m103288a(new C47473m(str2, str));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo75540a(Integer num) {
        String a = this.f93508q.mo69853a(num.intValue());
        C40733z.f103767a.preloadProfile(getActivity(), a);
        C47718bf.m103288a(new C42208b(this.f93508q.mo69868b("page_feed")));
        if (num.intValue() == 1) {
            C47718bf.m103288a(new C42207a());
        }
        int i = this.f93481R;
        this.f93481R = num.intValue();
        if (TextUtils.isEmpty(C23828a.f63481e)) {
            C23828a.f63478b = a;
        }
        if (!TextUtils.equals(a, "page_feed")) {
            C22574a.m55738f().mo46914a();
            C22574a.m55738f().mo46919b();
        }
        if (!TextUtils.equals(a, "page_feed")) {
            if (!C48121w.m104087I()) {
                C48121w.m104249M().mo95293z();
            } else {
                C50130a.m108170a().mo60215af();
            }
            C48039k.m104036a().mo95304b();
        }
        String a2 = this.f93508q.mo69853a(i);
        C30016ag I = m82320I();
        char c = 65535;
        int hashCode = a.hashCode();
        if (hashCode != -1571965031) {
            if (hashCode != 185242617) {
                if (hashCode == 883457358 && a.equals("page_feed")) {
                    c = 1;
                }
            } else if (a.equals("page_profile")) {
                c = 2;
            }
        } else if (a.equals("page_discover")) {
            c = 0;
        }
        switch (c) {
            case 0:
                C47718bf.m103288a(new C30342k());
                if (!C48121w.m104087I()) {
                    C48121w.m104249M().mo95293z();
                } else {
                    C50130a.m108170a().mo60215af();
                }
                m82343c(a);
                m82317F();
                if (I != null) {
                    I.mo60223b(1);
                }
                if (!TextUtils.equals(a2, "page_discover")) {
                    String str = this.f93509r.f85650d ? "click_discovery_button" : "slide_right";
                    this.f93509r.f85650d = false;
                    C0013i.m18a((Callable<TResult>) new C28397c<TResult>(this.f93509r.mo69848a(), str), (Executor) C26890h.m65003a());
                    C30578o.m71566a(C29988ad.DISCOVER);
                    return;
                }
                break;
            case 1:
                m82343c(a);
                C10703a.m21575a(true);
                m82356z();
                if (I != null) {
                    I.mo60227c(1);
                    return;
                }
                break;
            case 2:
                C47718bf.m103288a(new C30342k());
                m82343c(a);
                C10703a.m21575a(false);
                m82317F();
                if (I != null) {
                    I.mo60223b(1);
                }
                Fragment a3 = this.f93503l.mo75609a();
                if ((a3 instanceof MainFragment) && (((MainFragment) a3).mo75499c() instanceof C30753ai)) {
                    Aweme g = mo75554g();
                    if (g != null) {
                        C30230b a4 = C30230b.m70993a();
                        String aid = g.getAid();
                        if (C30230b.m70994c()) {
                            C30234c cVar = (C30234c) a4.f78968g.mo60571a(aid);
                            if (cVar == null) {
                                cVar = new C30234c();
                                a4.f78968g.mo60572a(aid, cVar);
                            }
                            a4.f78965d++;
                            cVar.f78976a = 1;
                            C23963a a5 = C23962d.m58765a().mo49547a(aid, C23958a.PROFILE);
                            if (a5 != null) {
                                a5.f63631a.mo49552a();
                            }
                        }
                    }
                }
                if (mo75554g() != null) {
                    C26898j jVar = new C26898j();
                    jVar.mo54849a("enter_from", this.f93509r.mo69848a());
                    if (!this.f93509r.f85657k) {
                        C26890h.m65008a(getContext(), "slide_left", "left", m82319H(), mo75554g() == null ? "" : mo75554g().getAid(), jVar.mo54850a());
                        ((C23249s) ((C23249s) new C23249s().mo48137c(this.f93509r.mo69848a()).mo47941a("slide_left")).mo48140e(C36672p.m82599b(this)).mo48141f(C36672p.m82600c(this)).mo48138d(C36672p.m82598a(this)).mo48136c(mo75554g(), 0).mo48144s(m82319H()).mo48145t(this.f93509r.f85655i).mo47940a(getContext())).mo48076e();
                        if (TextUtils.equals(TabChangeManager.m82396a(getActivity()).f93538c, "FAMILIAR")) {
                            C47718bf.m103288a(new C29633a());
                        }
                    }
                    jVar.mo54849a("group_id", mo75554g() == null ? "" : mo75554g().getAid());
                    jVar.mo54849a("enter_method", "slide_left");
                    jVar.mo54849a("request_id", this.f93509r.f85655i);
                    jVar.mo54849a("enter_type", "normal_way");
                    if (!TextUtils.isEmpty(C23198ae.m56861e(mo75554g()))) {
                        jVar.mo54849a("poi_id", C23198ae.m56861e(mo75554g()));
                    }
                    if (C23198ae.m56858c(this.f93509r.mo69848a())) {
                        jVar.mo54849a("city_info", C23198ae.m56845a());
                        jVar.mo54849a("distance_info", C23198ae.m56869i(mo75554g()));
                        jVar.mo54849a("poi_type", C23198ae.m56867h(mo75554g()));
                        jVar.mo54849a("poi_channel", C23198ae.m56852b());
                    }
                    C26890h.onEvent(MobClick.obtain().setEventName("enter_detail").setLabelName("personal_homepage").setValue(mo75554g() == null ? "" : mo75554g().getAuthor().getUid()).setJsonObject(jVar.mo54850a()));
                }
                C30578o.m71566a(C29988ad.PROFILE);
                this.f93509r.f85657k = false;
                break;
        }
    }

    /* renamed from: a */
    public final void mo20095a(String str, Fragment fragment, Fragment fragment2) {
        if ((fragment2 instanceof FriendTabFragment) || (fragment2 instanceof C40205b)) {
            fragment2.setUserVisibleHint(false);
        }
        if (fragment instanceof FriendTabFragment) {
            fragment.setUserVisibleHint(true);
        }
        if ((fragment instanceof C40242a) && ((Boolean) SharePrefCache.inst().getEnableProfileActivityLink().mo47782d()).booleanValue()) {
            m82330S();
            C36606dx dxVar = (C36606dx) C23393g.m57474a(getContext(), C36606dx.class);
            if (dxVar != null) {
                dxVar.mo48520d("true");
            }
        }
        if (C20854a.m53167g().isLogin()) {
            Keva repo = Keva.getRepo("account_security_keva_name");
            StringBuilder sb = new StringBuilder("prior_to_safe_info_");
            sb.append(C20854a.m53167g().getCurUserId());
            if (repo.getBoolean(sb.toString(), false) || (fragment instanceof MainFragment)) {
                m82315D();
            } else {
                Keva repo2 = Keva.getRepo("account_security_keva_name");
                StringBuilder sb2 = new StringBuilder("last_time_fetch_safe_info_");
                sb2.append(C20854a.m53167g().getCurUserId());
                long j = repo2.getLong(sb2.toString(), 0);
                if (j == 0 || j < System.currentTimeMillis()) {
                    C22145a.m54941a().safeInfoNoticeMsg(C20854a.m53167g().isChildrenMode()).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6159b((C1683ag<? super T>) new C1683ag<C22148c>() {
                        public final void onError(Throwable th) {
                        }

                        public final void onSubscribe(C1690c cVar) {
                        }

                        public final /* synthetic */ void onSuccess(Object obj) {
                            C22148c cVar = (C22148c) obj;
                            Keva repo = Keva.getRepo("account_security_keva_name");
                            StringBuilder sb = new StringBuilder("last_time_fetch_safe_info_");
                            sb.append(C20854a.m53167g().getCurUserId());
                            repo.storeLong(sb.toString(), System.currentTimeMillis() + (C10193n.m20607a().mo18201a(SafeInfoNoticeFrequencySettings.class, "safe_info_notice_frequency", C10181b.m20511a().mo18175c().getSafeInfoNoticeFrequency(), 86400) * 1000));
                            C22146a aVar = cVar.f59719a;
                            StringBuilder sb2 = new StringBuilder("safe_info_");
                            sb2.append(C20854a.m53167g().getCurUserId());
                            repo.getString(sb2.toString(), "");
                            if (aVar != null && !TextUtils.isEmpty(aVar.f59711b)) {
                                C17971f fVar = new C17971f();
                                StringBuilder sb3 = new StringBuilder("safe_info_");
                                sb3.append(C20854a.m53167g().getCurUserId());
                                repo.storeString(sb3.toString(), fVar.mo34889b(aVar));
                                StringBuilder sb4 = new StringBuilder("safe_info_need_show_");
                                sb4.append(C20854a.m53167g().getCurUserId());
                                repo.storeBoolean(sb4.toString(), true);
                            }
                            MainPageFragment.this.mo75542a(true);
                        }
                    });
                } else {
                    mo75542a(false);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo75542a(boolean z) {
        if (this.f93465A && m82314C()) {
            if (this.f93487X == null || z) {
                if (this.f93487X != null) {
                    this.f93487X.mo46228b();
                    this.f93487X = null;
                }
                this.f93487X = new C22149d(getContext(), this.f93497b);
                this.f93487X.setTouchable(true);
                this.f93487X.setAnimationStyle(R.anim.ew);
            }
            if (getActivity() != null && !getActivity().isFinishing() && isViewValid()) {
                this.f93487X.mo46226a();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo75541a(String str) {
        this.f93497b.mo69941a(str);
    }

    /* renamed from: a */
    public final void mo65170a(C31885g gVar) {
        if (gVar != null && gVar.f83323a > 0) {
            int i = gVar.f83323a;
            if (isViewValid()) {
                this.f93497b.mo69942a("DISCOVER", i);
                this.f93495ae = true;
                this.f93494ad = i;
                if (C10181b.m20511a().mo18168a(RecNumExperiment.class, true, "rec_num", 31744, 0) == 1) {
                    m82339a("follow_notice_show", (long) this.f93494ad, "number_dot");
                }
                this.f93469E = true;
                if (this.f93493ac) {
                    m82331T();
                }
            }
        }
    }

    /* renamed from: J */
    private void m82321J() {
        C36654a.m82565b(getActivity());
    }

    /* renamed from: h */
    static Context m82348h() {
        return AwemeApplication.m56199a();
    }

    /* renamed from: g */
    public final Aweme mo75554g() {
        return this.f93509r.f85656j;
    }

    /* renamed from: L */
    private boolean m82323L() {
        return TextUtils.equals("NOTIFICATION", this.f93503l.f93538c);
    }

    /* renamed from: R */
    private void m82329R() {
        if (isViewValid()) {
            this.f93497b.mo69943a(true, "USER");
        }
    }

    /* renamed from: S */
    private void m82330S() {
        if (isViewValid()) {
            this.f93497b.mo69943a(false, "USER");
        }
    }

    /* renamed from: U */
    private String m82332U() {
        return ((MainActivity) getActivity()).getEnterFrom();
    }

    /* access modifiers changed from: private */
    /* renamed from: V */
    public void mo75582v() {
        if (this.f93467C != null) {
            this.f93467C.setVisibility(8);
        }
    }

    /* renamed from: y */
    private Fragment m82355y() {
        if (this.f93503l == null) {
            return null;
        }
        return this.f93503l.mo75609a();
    }

    /* renamed from: i */
    public final void mo75556i() {
        if (this.f93489Z != null) {
            this.f93489Z.dismiss();
        }
    }

    public void onPause() {
        super.onPause();
        C10703a.m21575a(false);
        this.f93465A = false;
        mo75556i();
    }

    /* renamed from: D */
    private void m82315D() {
        if (this.f93487X != null && this.f93487X.isShowing()) {
            this.f93487X.mo46228b();
        }
    }

    /* renamed from: F */
    private void m82317F() {
        Fragment a = this.f93503l.mo75609a();
        if (a != null && (a instanceof MainFragment)) {
            MainFragment mainFragment = (MainFragment) a;
            if (mainFragment.f93436k != null) {
                C30750af afVar = (C30750af) mainFragment.f93436k.mo69929a();
                if (afVar != null) {
                    afVar.mo63440u();
                }
            }
        }
    }

    /* renamed from: I */
    private C30016ag m82320I() {
        C30750af afVar;
        Fragment y = m82355y();
        if (y instanceof MainFragment) {
            afVar = ((MainFragment) y).mo75499c();
        } else {
            afVar = null;
        }
        if (afVar instanceof C30778av) {
            return ((C30778av) afVar).mo63456o();
        }
        return null;
    }

    /* renamed from: O */
    private void m82326O() {
        if (isViewValid()) {
            if (C38046d.m85102b(12)) {
                C38046d.m85103c(12);
            }
        }
    }

    /* renamed from: P */
    private void m82327P() {
        if (isViewValid()) {
            if (C38046d.m85102b(1000)) {
                C38046d.m85103c(1000);
            }
        }
    }

    /* renamed from: Q */
    private void m82328Q() {
        if (isViewValid()) {
            this.f93473I = false;
            this.f93497b.mo69943a(false, "NOTIFICATION");
        }
    }

    /* renamed from: x */
    private static boolean m82354x() {
        if (C10181b.m20511a().mo18168a(PhoneChangeExperiment.class, true, "get_cross_user_access", 31744, 0) > 0) {
            return true;
        }
        return false;
    }

    /* renamed from: A */
    private void m82313A() {
        Fragment a = this.f93503l.mo75609a();
        if (a != null && (a instanceof MainFragment)) {
            ((MainFragment) a).mo75503d(true);
            if (this.f93477M != null) {
                this.f93477M.f93425e.setValue(Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: C */
    private boolean m82314C() {
        Keva repo = Keva.getRepo("account_security_keva_name");
        StringBuilder sb = new StringBuilder("prior_to_safe_info_");
        sb.append(C20854a.m53167g().getCurUserId());
        if (!repo.getBoolean(sb.toString(), false) && (this.f93472H == null || this.f93472H.getVisibility() != 0)) {
            return C22149d.f59720h.mo46229a();
        }
        m82315D();
        return false;
    }

    /* renamed from: E */
    private void m82316E() {
        boolean z;
        boolean e = C47897fr.m103606e();
        if (!((Boolean) SharePrefCache.inst().getEnableProfileActivityLink().mo47782d()).booleanValue() || ActivityLinkManager.m88490a(getContext())) {
            z = false;
        } else {
            z = true;
        }
        if (e || z) {
            m82329R();
        } else {
            m82330S();
        }
    }

    /* renamed from: G */
    private void m82318G() {
        if (getActivity() != null) {
            Aweme g = mo75554g();
            if (g == null || (!C26512f.m64070m(g) && !C26235d.m63570a(g))) {
                if (RecommendUserDialogShowStrategy.m90745b() && RecommendUserDialogShowStrategy.m90742a(g)) {
                    m82344c("", "HOME");
                }
                C41125m.f104508b = true;
                return;
            }
            this.f93484U = true;
        }
    }

    /* renamed from: K */
    private void m82322K() {
        this.f93503l.mo75614a("HOME");
        mo75547c(false);
        try {
            MainFragment mainFragment = (MainFragment) this.f93503l.mo75609a();
            if (mainFragment != null) {
                mainFragment.mo75500c(0);
                if (mainFragment.mo75512l()) {
                    m82356z();
                }
                C0013i.m18a((Callable<TResult>) new C36581dd<TResult>(this, mainFragment.mo75508h()), (Executor) C26890h.m65003a());
            }
        } catch (ClassCastException e) {
            C32458a.m75143a((Exception) e);
        }
        this.f93508q.mo69863a(true);
    }

    /* renamed from: N */
    private void m82325N() {
        if (isViewValid()) {
            this.f93497b.mo69943a(false, "NOTIFICATION");
            if (C38046d.m85102b(0)) {
                C38046d.m85103c(0);
            }
            m82326O();
            m82327P();
        }
    }

    /* renamed from: T */
    private void m82331T() {
        if (isViewValid()) {
            this.f93497b.mo69943a(false, "DISCOVER");
            this.f93493ac = false;
            if (C38046d.m85102b(5)) {
                C38046d.m85103c(5);
            }
        }
    }

    /* renamed from: z */
    private void m82356z() {
        Fragment a = this.f93503l.mo75609a();
        if (a != null && (a instanceof MainFragment)) {
            ((MainFragment) a).mo75502c(true);
            if (this.f93477M != null) {
                this.f93477M.f93425e.setValue(Boolean.valueOf(true));
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public void mo75550e() {
        if (!C23110b.m56678c()) {
            if (this.f93486W != null) {
                this.f93486W = null;
            }
            if (C47946e.m103738d(getActivity()) != 0 && m82354x() && !this.f93511t.mo48513a()) {
                this.f93486W = new C36556cg(this);
                this.f93511t.mo48512a(true);
                requestPermissions(new String[]{"android.permission.READ_PHONE_STATE"}, 1);
            }
        }
    }

    /* renamed from: j */
    public final void mo75557j() {
        long j;
        C36583df dfVar = new C36583df(this);
        View view = this.f93500e;
        long j2 = 4000;
        if (C30801a.m72196a()) {
            j = 0;
        } else {
            j = 4000;
        }
        view.postDelayed(dfVar, j);
        View view2 = this.f93500e;
        C36584dg dgVar = new C36584dg(this);
        if (!C39806c.m88518a().mo80881b()) {
            j2 = 0;
        }
        view2.postDelayed(dgVar, j2);
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f93474J != null) {
            this.f93474J.mo46991S_();
        }
        if (this.f93502k != null) {
            this.f93502k.mo75644b();
        }
        if (this.f93504m != null && this.f93504m.isShowing()) {
            this.f93504m.mo69995a();
        }
        C31348b a = C31348b.m73074a();
        if (a.f82114d != null) {
            a.f82114d = null;
        }
        this.f93511t = null;
        if (this.f93487X != null) {
            this.f93487X.mo46228b();
            this.f93487X = null;
        }
    }

    /* renamed from: M */
    private void m82324M() {
        int i;
        boolean z;
        if (MTNotificationTabMergeExperiment.m85064d()) {
            i = C36616dz.m82514g();
        } else if (MTNotificationTabMergeExperiment.m85063c()) {
            i = C36616dz.m82508c();
        } else {
            i = C36616dz.m82503a();
        }
        if (i > this.f93492ab) {
            this.f93491aa = false;
        }
        if (!this.f93491aa) {
            if (MTNotificationTabMergeExperiment.m85064d()) {
                z = C36616dz.m82513f();
            } else {
                z = C36616dz.m82510d();
            }
            if (i > 0 || z) {
                C0013i.m18a((Callable<TResult>) new C36585dh<TResult>(i, this.f93492ab), (Executor) C26890h.m65003a());
                this.f93491aa = true;
                this.f93492ab = i;
            }
        }
    }

    /* renamed from: k */
    public final void mo75558k() {
        if (!"NOTIFICATION".equals(this.f93503l.f93538c)) {
            m82313A();
            this.f93503l.mo75614a("NOTIFICATION");
            C48121w.m104249M().mo95293z();
            C48039k.m104036a().mo95304b();
            m82321J();
            this.f93508q.mo69863a(false);
            mo75547c(true);
            C30578o.m71566a(C29988ad.NOTICE);
        }
        m82328Q();
        if (this.f93504m != null && this.f93504m.isShowing()) {
            this.f93504m.mo69995a();
        }
    }

    /* renamed from: l */
    public final void mo75559l() {
        if (isViewValid() && !C47915gg.m103651b() && !ImUnder16Manger.m76250c() && !ImUnder16Manger.m76252e()) {
            if (!C20902b.m53242a().isLogin()) {
                m82325N();
            } else if (C36616dz.m82514g() > 0) {
                m82325N();
            } else if (MTNotificationTabMergeExperiment.m85063c()) {
                m82325N();
            } else {
                m82324M();
                this.f93497b.mo69943a(true, "NOTIFICATION");
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final /* synthetic */ Object mo75580t() throws Exception {
        String str;
        String str2 = "click_trans_layer";
        C23089d a = new C23089d().mo47829a("group_id", mo75554g().getAid());
        String str3 = "author_id";
        if (mo75554g().getAuthor() != null) {
            str = mo75554g().getAuthor().getUid();
        } else {
            str = "";
        }
        C26890h.m65011a(str2, a.mo47829a(str3, str).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(mo75554g()))).mo47829a("enter_from", this.f93475K.f85662b).f61491a);
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final /* synthetic */ void mo75581u() {
        boolean z;
        C33071k c = this.f93497b.mo69946c("PUBLISH");
        if (c != null) {
            boolean z2 = false;
            if (!C31357a.m73095a()) {
                z = false;
            } else {
                z = C31357a.m73096a(C31361b.f82138a.mo48495b(), System.currentTimeMillis());
            }
            if (z) {
                c.mo70019k();
                C31361b.f82138a.mo48496b(System.currentTimeMillis());
            } else {
                c.mo70018j();
            }
            Fragment y = m82355y();
            if (y instanceof MainFragment) {
                ((MainFragment) y).mo75514o();
            }
            C30016ag I = m82320I();
            Fragment y2 = m82355y();
            if (y2 instanceof MainFragment) {
                z2 = ((MainFragment) y2).mo75499c() instanceof C30753ai;
            }
            if (!(!z2 || I == null || I.mo60251u() == null)) {
                I.mo60251u().mo60194V();
            }
        }
    }

    /* renamed from: m */
    public final void mo75560m() {
        if (isViewValid()) {
            if (!C20902b.m53242a().isLogin() || C47915gg.m103651b()) {
                m82325N();
            } else if (ImUnder16Manger.m76250c() || ImUnder16Manger.m76252e()) {
                m82325N();
            } else {
                m82324M();
                int c = C36616dz.m82508c();
                StringBuilder sb = new StringBuilder("UnReadCountMonitor MainPageFragment showMusNewNotificationCount: [all,");
                sb.append(c);
                sb.append("][99");
                sb.append(",");
                sb.append(C38046d.m85098a(99));
                sb.append("][7");
                sb.append(",");
                sb.append(C38046d.m85098a(7));
                sb.append("][3");
                sb.append(",");
                sb.append(C38046d.m85098a(3));
                sb.append("][6");
                sb.append(",");
                sb.append(C38046d.m85098a(6));
                sb.append("][2");
                sb.append(",");
                sb.append(C38046d.m85098a(2));
                sb.append("]");
                C32458a.m75144a(sb.toString());
                this.f93497b.mo69942a("NOTIFICATION", c);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo75561n() {
        C30800bj bjVar;
        if (this.f93489Z == null && this.f93516y && getActivity() != null && this.f93508q.mo69868b("page_feed")) {
            Boolean bool = (Boolean) this.f93466B.f106794c.getValue();
            Boolean bool2 = (Boolean) this.f93466B.f106795d.getValue();
            if (bool == null || !bool.booleanValue()) {
                if ((bool2 == null || !bool2.booleanValue()) && !this.f93506o && !TextUtils.equals("USER", this.f93503l.f93538c)) {
                    C30801a aVar = C30800bj.f80688m;
                    UgAwemeActivitySetting ugAwemeActivitySetting = this.f93517z;
                    FragmentActivity activity = getActivity();
                    C33071k c = this.f93497b.mo69946c("USER");
                    C52711k.m112240b(c, "view");
                    if (activity == null || !aVar.mo63515a(ugAwemeActivitySetting) || C30801a.m72197b() == null) {
                        bjVar = null;
                    } else {
                        Context context = activity;
                        String b = C30801a.m72197b();
                        if (b != null) {
                            bjVar = new C30800bj(context, c, b);
                            if (bjVar.f80689a != null) {
                                if (VERSION.SDK_INT >= 19) {
                                    bjVar.showAsDropDown(bjVar.f80689a, bjVar.f80695g, -(bjVar.f80689a.getHeight() + bjVar.f80692d + bjVar.f80694f), 51);
                                } else {
                                    bjVar.showAsDropDown(bjVar.f80689a, bjVar.f80695g, -(bjVar.f80689a.getHeight() + bjVar.f80692d + bjVar.f80694f));
                                }
                                bjVar.f80693e.post(new C30804d(bjVar));
                                long j = (long) C30800bj.f80686k;
                                bjVar.getContentView().removeCallbacks(bjVar.f80691c);
                                bjVar.getContentView().postDelayed(bjVar.f80691c, j);
                            }
                            C37165a.m83405b().f94855c.mo76484a(true);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type kotlin.String");
                        }
                    }
                    this.f93489Z = bjVar;
                }
            }
        }
    }

    public void onResume() {
        super.onResume();
        if (m82355y() != null) {
            if (TextUtils.equals(m82355y().getTag(), "HOME")) {
                C10703a.m21575a(true);
            } else {
                C10703a.m21575a(false);
            }
        }
        this.f93465A = true;
        m82316E();
        if (C20902b.m53242a().isLogin()) {
            if (MTNotificationTabMergeExperiment.m85064d()) {
                if (!C36616dz.m82513f() || !this.f93473I) {
                    m82325N();
                } else {
                    mo75559l();
                }
            } else if (!C36616dz.m82510d()) {
                m82325N();
            } else if (this.f93473I) {
                mo75559l();
            }
        }
        C20902b.m53242a().isLogin();
        if (C36654a.m82564a() && !"HOME".equals(this.f93503l.f93538c)) {
            C36654a.m82565b(getActivity());
        }
        if (C20902b.m53242a().isLogin()) {
            Keva repo = Keva.getRepo("account_security_keva_name");
            StringBuilder sb = new StringBuilder("prior_to_safe_info_");
            sb.append(C20854a.m53167g().getCurUserId());
            if (repo.getBoolean(sb.toString(), false) || (this.f93503l != null && "HOME".equals(this.f93503l.f93538c))) {
                m82315D();
            }
        }
        if (C37165a.m83404a()) {
            this.f93517z = C37165a.m83405b().f94853a;
            if (this.f93517z != null) {
                mo75557j();
            }
        } else if (!this.f93478O) {
            this.f93478O = true;
            C37165a.m83405b().f94854b.add(new C52671b<UgAwemeActivitySetting, C52860x>() {
                public final /* synthetic */ Object invoke(Object obj) {
                    UgAwemeActivitySetting ugAwemeActivitySetting = (UgAwemeActivitySetting) obj;
                    MainPageFragment.this.f93517z = ugAwemeActivitySetting;
                    if (ugAwemeActivitySetting != null && MainPageFragment.this.f93465A) {
                        MainPageFragment.this.mo75557j();
                    }
                    C37165a.m83405b().f94854b.remove(this);
                    return null;
                }
            });
        }
        if (!TextUtils.isEmpty(this.f93483T)) {
            C32783c.m75665a("facebook_friend_list", C32783c.m75667a() ? 1 : 0);
            this.f93483T = "";
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final /* synthetic */ void mo75583w() {
        boolean z;
        if (!this.f93496af) {
            this.f93496af = true;
            if (this.f93516y && getActivity() != null && this.f93508q.mo69868b("page_feed")) {
                Boolean bool = (Boolean) this.f93466B.f106794c.getValue();
                Boolean bool2 = (Boolean) this.f93466B.f106795d.getValue();
                if ((bool == null || !bool.booleanValue()) && ((bool2 == null || !bool2.booleanValue()) && !this.f93506o && !TextUtils.equals("USER", this.f93503l.f93538c))) {
                    try {
                        UgAwemeActivitySetting awemeActivitySetting = C32816h.m75716b().getAwemeActivitySetting();
                        z = C39806c.m88518a().mo80879a(awemeActivitySetting.getActivityId(), awemeActivitySetting.getProfileActivityButton().getTimeLimit().intValue());
                    } catch (C10174a unused) {
                        z = false;
                    }
                    if (C39806c.m88518a().mo80881b() && z) {
                        C39806c.m88518a().mo80878a(true);
                        try {
                            String tabBubbleText = C32816h.m75716b().getAwemeActivitySetting().getProfileActivityButton().getTabBubbleText();
                            if (tabBubbleText != null && !TextUtils.equals(tabBubbleText, "")) {
                                ((DmtTextView) this.f93467C.inflate().findViewById(R.id.a1l)).setText(tabBubbleText);
                                this.f93467C.setVisibility(0);
                                C26890h.m65011a("bubble_show", new C23089d().mo47829a("bubble_type", "coupon_fission").mo47829a("show_position", "personal_homepage").f61491a);
                                this.f93480Q = new Handler(Looper.getMainLooper());
                                this.f93480Q.postDelayed(new C36592dk(this), 5000);
                            }
                        } catch (C10174a unused2) {
                        } catch (Exception unused3) {
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:19:0x0097  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x00d0  */
    /* renamed from: f */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo75552f() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.festival.a.b r0 = com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.m73074a()
            com.ss.android.ugc.aweme.main.cr r1 = new com.ss.android.ugc.aweme.main.cr
            r1.<init>(r6)
            boolean r2 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73095a()
            if (r2 != 0) goto L_0x0015
            java.lang.String r0 = com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.f82110a
            com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.m73075a(r0)
            return
        L_0x0015:
            r0.f82114d = r1
            java.io.File r1 = new java.io.File
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r3 = com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.f82110a
            r2.append(r3)
            java.lang.String r3 = java.io.File.separator
            r2.append(r3)
            java.lang.String r3 = com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.m73077b()
            java.lang.String r3 = com.bytedance.common.utility.C9395d.m18571a(r3)
            r2.append(r3)
            java.lang.String r3 = ".zip"
            r2.append(r3)
            java.lang.String r2 = r2.toString()
            r1.<init>(r2)
            boolean r2 = r1.exists()
            r3 = 0
            if (r2 != 0) goto L_0x0048
        L_0x0046:
            r1 = 0
            goto L_0x0095
        L_0x0048:
            java.io.File r2 = new java.io.File
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            r4.<init>()
            java.lang.String r5 = com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.f82110a
            r4.append(r5)
            java.lang.String r5 = java.io.File.separator
            r4.append(r5)
            java.lang.String r5 = com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.m73077b()
            java.lang.String r5 = com.bytedance.common.utility.C9395d.m18571a(r5)
            r4.append(r5)
            java.lang.String r4 = r4.toString()
            r2.<init>(r4)
            boolean r4 = r2.exists()
            if (r4 == 0) goto L_0x0046
            boolean r4 = r2.isDirectory()
            if (r4 != 0) goto L_0x0078
            goto L_0x0046
        L_0x0078:
            java.io.File[] r2 = r2.listFiles()
            if (r2 == 0) goto L_0x0046
            int r2 = r2.length
            if (r2 != 0) goto L_0x0082
            goto L_0x0046
        L_0x0082:
            boolean r2 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73105f()
            if (r2 == 0) goto L_0x0089
            goto L_0x0046
        L_0x0089:
            com.ss.android.ugc.aweme.l.c r2 = com.p683ss.android.ugc.aweme.festival.christmas.C31357a.m73104e()
            com.ss.android.ugc.aweme.l.d r2 = r2.f29304e
            java.lang.String r2 = r2.f29326a
            boolean r1 = com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.m73076a(r1, r2)
        L_0x0095:
            if (r1 == 0) goto L_0x00c1
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            r1.<init>()
            java.lang.String r2 = com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.f82110a
            r1.append(r2)
            java.lang.String r2 = java.io.File.separator
            r1.append(r2)
            java.lang.String r2 = com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.m73077b()
            java.lang.String r2 = com.bytedance.common.utility.C9395d.m18571a(r2)
            r1.append(r2)
            java.lang.String r1 = r1.toString()
            r0.f82112b = r1
            com.ss.android.ugc.aweme.festival.a.b$a r1 = r0.f82114d
            if (r1 == 0) goto L_0x00c1
            com.ss.android.ugc.aweme.festival.a.b$a r0 = r0.f82114d
            r0.mo64227a()
            return
        L_0x00c1:
            java.lang.String r1 = com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.f82110a
            com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.m73075a(r1)
            java.lang.String r1 = com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.m73077b()
            boolean r2 = android.text.TextUtils.isEmpty(r1)
            if (r2 != 0) goto L_0x0132
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.f82110a
            r2.append(r4)
            java.lang.String r4 = java.io.File.separator
            r2.append(r4)
            java.lang.String r4 = com.bytedance.common.utility.C9395d.m18571a(r1)
            r2.append(r4)
            java.lang.String r2 = r2.toString()
            r0.f82113c = r2
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            r2.<init>()
            java.lang.String r4 = r0.f82113c
            r2.append(r4)
            java.lang.String r4 = ".zip"
            r2.append(r4)
            java.lang.String r2 = com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.f82110a
            com.p683ss.android.ugc.aweme.utils.C47723bk.m103306a(r2, r3)
            android.content.Context r2 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = com.p683ss.android.socialbase.downloader.downloader.Downloader.with(r2)
            com.ss.android.socialbase.downloader.model.DownloadTask r2 = r2.url(r1)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            java.lang.String r1 = com.bytedance.common.utility.C9395d.m18571a(r1)
            r3.append(r1)
            java.lang.String r1 = ".zip"
            r3.append(r1)
            java.lang.String r1 = r3.toString()
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r2.name(r1)
            java.lang.String r2 = com.p683ss.android.ugc.aweme.festival.p1739a.C31348b.f82110a
            com.ss.android.socialbase.downloader.model.DownloadTask r1 = r1.savePath(r2)
            com.ss.android.socialbase.downloader.model.DownloadTask r0 = r1.subThreadListener(r0)
            r0.download()
        L_0x0132:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.MainPageFragment.mo75552f():void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo75551e(C23274a aVar) {
        m82322K();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo75553f(C23274a aVar) {
        m82356z();
    }

    @C53771m
    public void onScrolledToProfileTab(C42207a aVar) {
        mo75556i();
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onBackFromSettingEvent(C32504a aVar) {
        this.f93483T = aVar.f84605a;
    }

    @C53771m
    public void onCommentDialogEvent(C30337f fVar) {
        this.f93476L = fVar.f79244a;
    }

    /* renamed from: a */
    private static void m82338a(int i) {
        C0013i.m18a((Callable<TResult>) new C36591dj<TResult>(i), (Executor) C0013i.f24a);
    }

    /* renamed from: c */
    private void m82343c(String str) {
        if (this.f93477M != null) {
            this.f93477M.f93424d.setValue(str);
        }
    }

    @C53771m
    public void onComplianceDialogCheckEvent(C27018a aVar) {
        if (aVar != null) {
            if (aVar.f71324a) {
                m82318G();
            }
            C32616c.f84865a.hasShownComplianceDialog();
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onDiscoverSearchEvent(C28096d dVar) {
        if (dVar != null) {
            if (dVar.f73786a) {
                m82315D();
                return;
            }
            mo75542a(false);
        }
    }

    @C53771m
    public void onMobEnterFromEvent(C30310ab abVar) {
        MainPageDataViewModel mainPageDataViewModel = this.f93475K;
        String str = abVar.f79198a;
        C52711k.m112240b(str, "<set-?>");
        mainPageDataViewModel.f85662b = str;
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onSafeInfoNoticeEvent(C39717ac acVar) {
        if (acVar != null) {
            if (acVar.f101355a) {
                m82315D();
                return;
            }
            mo75542a(false);
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        TabAlphaController.m82394a().mo75604a(z);
    }

    /* renamed from: e */
    private static void m82346e(String str) {
        int checkFriendslistPermissionPopUp = C32616c.f84865a.checkFriendslistPermissionPopUp(str);
        if (checkFriendslistPermissionPopUp != 0) {
            if (TextUtils.equals(str, "personal_homepage")) {
                C40733z.f103767a.updateProfilePermission(true);
            }
            C32616c.f84865a.showFriendslistPermissionPopUp(checkFriendslistPermissionPopUp, str);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo75543b(C23274a aVar) {
        C33071k c = this.f93497b.mo69946c((String) aVar.mo48246a());
        if (c != null) {
            c.performClick();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo75546c(C23274a aVar) {
        this.f93497b.post(new C36582de(this, (String) aVar.mo48246a()));
    }

    @C53771m
    public void onFestivalDataEvent(C31347a aVar) {
        mo75552f();
        C43818f.f110972a = new C43816e(null, 1, null);
        if (getContext() instanceof MainActivity) {
            ((MainActivity) getContext()).initWaterMark();
        }
    }

    @C53771m
    public void onMaintabVisibleChange(C30314af afVar) {
        int i = afVar.f79202a;
        if (i != this.f93497b.getVisibility()) {
            this.f93490a.setVisibility(i);
            this.f93497b.setVisibility(i);
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onShowPolicyNoticeToastEvent(C39504b bVar) {
        if (bVar.f101055b != null) {
            this.f93472H.setNext(bVar.f101055b);
        }
        this.f93472H.setValues(bVar.f101054a);
        m82315D();
    }

    /* renamed from: d */
    public final void mo75549d(boolean z) {
        if (isViewValid()) {
            if (!C20902b.m53242a().isLogin() || C47915gg.m103651b()) {
                m82325N();
                return;
            }
            m82324M();
            int g = C36616dz.m82514g();
            m82338a(g);
            this.f93497b.mo69942a("NOTIFICATION", g);
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onEvent(C31763c cVar) {
        if (cVar.f82960a == 0) {
            if (this.f93493ac) {
                m82331T();
                m82339a("follow_notice_dis", -1, "yellow_dot");
            }
            if (this.f93469E) {
                m82339a("follow_notice_dis", (long) this.f93494ad, "number_dot");
                if (isViewValid()) {
                    this.f93497b.mo69942a("DISCOVER", -1);
                    this.f93494ad = -1;
                    this.f93469E = false;
                }
            }
        }
    }

    @C53771m
    public void onRefreshEndEvent(C30319aj ajVar) {
        String str;
        if (isViewValid()) {
            MainBottomTabView mainBottomTabView = this.f93497b;
            if (!TextUtils.isEmpty(ajVar.f79213a)) {
                str = ajVar.f79213a;
            } else {
                str = "HOME";
            }
            if (mainBottomTabView.f85748e.containsKey(str)) {
                C33071k kVar = (C33071k) mainBottomTabView.f85748e.get(str);
                if (kVar.f85889e) {
                    kVar.f85889e = false;
                    kVar.mo70012e();
                }
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onSettingSyncDone(C41598d dVar) {
        m82316E();
        if (C10181b.m20511a().mo18172a(AsyncSettingsExperiment.class, true, "is_async_setting", 31744, true)) {
            C0013i.m18a((Callable<TResult>) new C36561cl<TResult>(this), (Executor) C24076h.m58902c());
        } else {
            ActivityLinkManager.m88491b(getContext());
        }
    }

    @C53771m
    public void onVideoPageChangeEvent(C30315ag agVar) {
        if (agVar.f79203a != null) {
            this.f93509r.f85656j = agVar.f79203a;
            if (agVar.f79203a.getAuthor() != null) {
                this.f93471G = agVar.f79203a.getAuthor().getUid();
            } else {
                this.f93471G = "";
            }
            if (this.f93484U && getActivity() != null) {
                this.f93484U = false;
                m82318G();
            }
        }
    }

    /* renamed from: f */
    private String m82347f(String str) {
        if (str == null) {
            return "";
        }
        if (TextUtils.equals(str, "HOME")) {
            Fragment c = this.f93508q.mo69870c();
            if (c instanceof MainFragment) {
                C30750af k = ((MainFragment) c).mo75499c();
                if (k != null) {
                    if (k instanceof C31143x) {
                        return "homepage_follow";
                    }
                    if (k instanceof C30753ai) {
                        return "homepage_hot";
                    }
                }
            }
        } else if (TextUtils.equals(str, "DISCOVER")) {
            return "discovery";
        } else {
            if (TextUtils.equals(str, "NOTIFICATION")) {
                return "notification_page";
            }
            if (TextUtils.equals(str, "USER")) {
                Fragment c2 = this.f93508q.mo69870c();
                if (c2 instanceof C23251u) {
                    return ((C23251u) c2).mo48157a();
                }
                return "personal_homepage";
            }
        }
        return "homepage_hot";
    }

    /* renamed from: c */
    public final void mo75547c(boolean z) {
        int i;
        View view = this.f93490a;
        Resources resources = getResources();
        if (!z) {
            i = R.color.vr;
        } else {
            i = R.color.a0s;
        }
        view.setBackgroundColor(resources.getColor(i));
        ((MainActivity) getActivity()).refreshSlideSwitchCanScrollRight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo75555g(C23274a aVar) {
        if (((Boolean) aVar.mo48246a()).booleanValue()) {
            if (this.f93503l.mo75609a() instanceof MainFragment) {
                C30750af k = ((MainFragment) this.f93503l.mo75609a()).mo75499c();
                if (k instanceof C30753ai) {
                    ((C30753ai) k).mo63450f();
                }
            }
            C45427bj.m98998a(this.f93497b, this.f93497b.getAlpha(), 0.0f);
            C45427bj.m98998a(this.f93490a, this.f93490a.getAlpha(), 0.0f);
            return;
        }
        C45427bj.m98998a(this.f93497b, this.f93497b.getAlpha(), 1.0f);
        C45427bj.m98998a(this.f93490a, this.f93490a.getAlpha(), 1.0f);
    }

    @C53771m
    public void onAwesomeSplashEvent(C26216b bVar) {
        boolean z;
        if (bVar.f69221a != 4) {
            z = true;
        } else {
            z = false;
        }
        this.f93514w = z;
        if (this.f93514w) {
            if (this.f93502k != null) {
                this.f93515x = false;
                this.f93502k.mo75644b();
            }
            if (this.f93504m != null) {
                this.f93504m.dismiss();
            }
        } else if (this.f93515x) {
            this.f93515x = false;
            if (this.f93502k != null) {
                this.f93502k.mo75643a();
            }
        }
        C26224g.m63535a(bVar.f69221a, this.f93490a, this.f93497b);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onSkylightShow(C31869f fVar) {
        if (fVar != null) {
            if (fVar.f83251a) {
                if (C22453b.m55505a().f60473k) {
                    this.f93497b.setBackgroundColor(C0726c.m2098c(getContext(), R.color.aug));
                } else {
                    this.f93497b.setBackgroundColor(C0726c.m2098c(getContext(), R.color.arz));
                }
                this.f93497b.mo69940a();
                return;
            }
            this.f93497b.setBackgroundColor(C0726c.m2098c(getContext(), R.color.aug));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo75548d(C23274a aVar) {
        Intent intent = (Intent) aVar.mo48246a();
        try {
            if (intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUBLISH", false)) {
                m82322K();
            } else if (intent.getBooleanExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_DRAFT", false)) {
                this.f93503l.mo75614a("HOME");
                mo75547c(false);
                MainFragment mainFragment = (MainFragment) this.f93503l.mo75609a();
                if (mainFragment != null) {
                    mainFragment.mo75500c(1);
                }
                this.f93508q.mo69863a(true);
            } else {
                String stringExtra = intent.getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB");
                if (!TextUtils.isEmpty(stringExtra)) {
                    if ("USER".equals(stringExtra)) {
                        mo75544b("USER");
                        return;
                    }
                    this.f93503l.mo75614a(stringExtra);
                    if ("HOME".equals(stringExtra)) {
                        int intExtra = intent.getIntExtra("tab", 1);
                        MainFragment mainFragment2 = (MainFragment) this.f93503l.mo75609a();
                        if (mainFragment2 != null) {
                            mainFragment2.mo75500c(intExtra);
                        }
                        return;
                    }
                    if ("NOTIFICATION".equals(stringExtra)) {
                        if (!C20902b.m53242a().isLogin()) {
                            C27965f.m66723a((Fragment) this, m82332U(), "click_message");
                            return;
                        } else if (this.f93503l.mo75609a() instanceof MessagesFragment) {
                            this.f93508q.mo69863a(false);
                        }
                    }
                    m82325N();
                }
            }
        } catch (Exception e) {
            C47625i.m103103a(e.getMessage());
        }
    }

    @C53771m
    public void onDislikeAwemeEvent(C30340i iVar) {
        if (iVar.f79251b == 1 && iVar.f79250a) {
            float f = iVar.f79252c;
            float f2 = iVar.f79253d;
            if (this.f93501j != null) {
                if (this.f93503l.mo75609a() instanceof MainFragment) {
                    C30750af k = ((MainFragment) this.f93503l.mo75609a()).mo75499c();
                    if (k instanceof C30753ai) {
                        ((C30753ai) k).mo63450f();
                    }
                }
                C0013i.m18a((Callable<TResult>) new C36562cm<TResult>(this), (Executor) C26890h.m65003a());
                C45427bj.m98998a(this.f93497b, this.f93497b.getAlpha(), 0.0f);
                C45427bj.m98998a(this.f93490a, this.f93490a.getAlpha(), 0.0f);
                if (C31076b.m72677b()) {
                    C31083i iVar2 = new C31083i(getContext(), mo75554g(), m82332U());
                    iVar2.setOnDismissListener(new OnDismissListener() {
                        public final void onDismiss(DialogInterface dialogInterface) {
                            MainPageFragment.this.f93510s.mo48228a("ENTER_DISLIKE_MODE", (Object) Boolean.valueOf(false));
                            C47718bf.m103288a(new C30340i(false, 1, MainPageFragment.this.getActivity().hashCode()));
                        }
                    });
                    iVar2.show();
                    return;
                }
                this.f93501j.mo63290a(f, f2, this.f93475K.f85662b, mo75554g());
                this.f93501j.setInDislikeMode(true);
                if (this.f93501j.getAdapter() != null) {
                    this.f93501j.getAdapter().notifyDataSetChanged();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo75545b(boolean z) {
        String str;
        int i;
        int i2;
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("notice_type", "bubble");
            if (MTNotificationTabMergeExperiment.m85064d()) {
                i2 = C36616dz.m82515h();
            } else if (MTNotificationTabMergeExperiment.m85062b()) {
                i2 = C36616dz.m82506b();
            } else {
                i2 = C36616dz.m82508c();
            }
            hashMap.put("show_cnt", String.valueOf(i2));
        } else if (!MTNotificationTabMergeExperiment.m85064d() ? !C36616dz.m82510d() : !C36616dz.m82513f()) {
            if (MTNotificationTabMergeExperiment.m85064d()) {
                i = C36616dz.m82514g();
            } else if (MTNotificationTabMergeExperiment.m85063c()) {
                i = C36616dz.m82508c();
            } else {
                i = C36616dz.m82503a();
            }
            if (i > 0) {
                hashMap.put("notice_type", "number_dot");
                hashMap.put("show_cnt", String.valueOf(i));
            }
        } else {
            hashMap.put("notice_type", "yellow_dot");
        }
        if (MTNotificationTabMergeExperiment.m85061a()) {
            Fragment fragment = null;
            if (this.f93503l != null) {
                fragment = this.f93503l.mo75617b("NOTIFICATION");
            }
            if (fragment instanceof C38297c) {
                str = ((C38297c) fragment).mo78259j();
            } else {
                str = "all";
            }
            hashMap.put("tab_name", str);
        }
        C0013i.m18a((Callable<TResult>) new C36580dc<TResult>(hashMap), (Executor) C26890h.m65003a());
    }

    /* JADX WARNING: Code restructure failed: missing block: B:33:0x005e, code lost:
        if (isViewValid() == false) goto L_0x0067;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:34:0x0060, code lost:
        r11.f93497b.mo69942a("NOTIFICATION", -1);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0067, code lost:
        r11.f93507p = true;
     */
    @org.greenrobot.eventbus.C53771m(mo112975a = org.greenrobot.eventbus.ThreadMode.MAIN, mo112976b = true)
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onNotificationIndicatorEvent(com.p683ss.android.ugc.aweme.notice.api.bean.C38041h r12) {
        /*
            r11 = this;
            if (r12 != 0) goto L_0x0003
            return
        L_0x0003:
            r0 = -2
            boolean r0 = r12.mo77566b(r0)
            r1 = 0
            if (r0 == 0) goto L_0x000d
            r11.f93488Y = r1
        L_0x000d:
            r0 = -3
            boolean r0 = r12.mo77566b(r0)
            r2 = 1
            if (r0 == 0) goto L_0x0017
            r11.f93488Y = r2
        L_0x0017:
            boolean r0 = r11.f93488Y
            r3 = -1
            if (r0 == 0) goto L_0x0071
            boolean r0 = r11.f93505n
            if (r0 != 0) goto L_0x0071
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r0 != 0) goto L_0x0071
            boolean r0 = com.p683ss.android.ugc.aweme.p1807im.disableim.ImUnder16Manger.m76250c()
            if (r0 != 0) goto L_0x0071
            boolean r0 = com.p683ss.android.ugc.aweme.p1807im.disableim.ImUnder16Manger.m76252e()
            if (r0 == 0) goto L_0x0033
            goto L_0x0071
        L_0x0033:
            int r0 = r11.f93476L
            if (r0 == r2) goto L_0x0071
            boolean r0 = r11.f93514w
            if (r0 != 0) goto L_0x0071
            boolean r0 = r11.m82323L()
            if (r0 != 0) goto L_0x0071
            boolean r0 = com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment.m85061a()
            if (r0 == 0) goto L_0x0054
            boolean r0 = com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment.m85064d()
            if (r0 == 0) goto L_0x0054
            int r0 = com.p683ss.android.ugc.aweme.main.C36616dz.m82515h()
            if (r0 <= 0) goto L_0x0069
            goto L_0x005a
        L_0x0054:
            int r0 = com.p683ss.android.ugc.aweme.main.C36616dz.m82508c()
            if (r0 <= 0) goto L_0x0069
        L_0x005a:
            boolean r0 = r11.isViewValid()
            if (r0 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.homepage.ui.view.MainBottomTabView r0 = r11.f93497b
            java.lang.String r4 = "NOTIFICATION"
            r0.mo69942a(r4, r3)
        L_0x0067:
            r11.f93507p = r2
        L_0x0069:
            com.ss.android.ugc.aweme.main.MainPageFragment$7 r0 = new com.ss.android.ugc.aweme.main.MainPageFragment$7
            r0.<init>()
            com.p683ss.android.p1137b.p1138a.p1139a.C18842a.m45934b(r0)
        L_0x0071:
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r0 = r12.f96817c
            r4 = 99
            r5 = 1000(0x3e8, float:1.401E-42)
            if (r0 == 0) goto L_0x0196
            boolean r0 = r11.f93482S
            if (r0 == 0) goto L_0x0196
            boolean r0 = com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment.m85064d()
            java.util.HashMap<java.lang.Integer, java.lang.Integer> r6 = r12.f96817c
            java.util.Set r6 = r6.keySet()
            java.util.Iterator r6 = r6.iterator()
        L_0x008b:
            boolean r7 = r6.hasNext()
            if (r7 == 0) goto L_0x0195
            java.lang.Object r7 = r6.next()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            int r8 = r12.mo77565a(r7)
            if (r0 == 0) goto L_0x00e1
            if (r8 != r3) goto L_0x00b3
            int[] r9 = new int[r2]
            r9[r1] = r7
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85103c(r9)
            boolean r9 = com.p683ss.android.ugc.aweme.main.C36616dz.m82509c(r7)
            if (r9 != 0) goto L_0x0182
            r11.m82325N()
        L_0x00b3:
            boolean r9 = com.p683ss.android.ugc.aweme.main.C36616dz.m82509c(r7)
            if (r9 == 0) goto L_0x00d4
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85099a(r7, r8)
            if (r8 <= 0) goto L_0x00cf
            java.lang.String r8 = "NOTIFICATION"
            com.ss.android.ugc.aweme.main.TabChangeManager r9 = r11.f93503l
            java.lang.String r9 = r9.f93538c
            boolean r8 = android.text.TextUtils.equals(r8, r9)
            if (r8 != 0) goto L_0x00cf
            r11.mo75559l()
            goto L_0x0177
        L_0x00cf:
            r11.m82325N()
            goto L_0x0177
        L_0x00d4:
            boolean r9 = com.p683ss.android.ugc.aweme.main.C36616dz.m82511d(r7)
            if (r9 == 0) goto L_0x0177
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85099a(r7, r8)
            boolean r8 = r11.f93507p
            goto L_0x0177
        L_0x00e1:
            boolean r9 = com.p683ss.android.ugc.aweme.main.C36616dz.m82512e()
            if (r9 == 0) goto L_0x00f8
            java.lang.String r8 = "NOTIFICATION"
            com.ss.android.ugc.aweme.main.TabChangeManager r9 = r11.f93503l
            java.lang.String r9 = r9.f93538c
            boolean r8 = android.text.TextUtils.equals(r8, r9)
            if (r8 != 0) goto L_0x0177
            r11.mo75559l()
            goto L_0x0177
        L_0x00f8:
            boolean r9 = com.p683ss.android.ugc.aweme.main.C36616dz.m82507b(r7)
            if (r9 == 0) goto L_0x0144
            if (r8 != r3) goto L_0x0113
            int[] r8 = new int[r2]
            r8[r1] = r7
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85103c(r8)
            boolean r8 = com.p683ss.android.ugc.aweme.main.C36616dz.m82510d()
            if (r8 == 0) goto L_0x010f
            goto L_0x0182
        L_0x010f:
            r11.m82325N()
            goto L_0x0177
        L_0x0113:
            boolean r9 = com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment.m85063c()
            if (r9 == 0) goto L_0x0132
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85099a(r7, r8)
            if (r8 <= 0) goto L_0x012e
            java.lang.String r8 = "NOTIFICATION"
            com.ss.android.ugc.aweme.main.TabChangeManager r9 = r11.f93503l
            java.lang.String r9 = r9.f93538c
            boolean r8 = android.text.TextUtils.equals(r8, r9)
            if (r8 != 0) goto L_0x012e
            r11.mo75559l()
            goto L_0x0177
        L_0x012e:
            r11.m82325N()
            goto L_0x0177
        L_0x0132:
            if (r8 <= 0) goto L_0x0177
            java.lang.String r8 = "NOTIFICATION"
            com.ss.android.ugc.aweme.main.TabChangeManager r9 = r11.f93503l
            java.lang.String r9 = r9.f93538c
            boolean r8 = android.text.TextUtils.equals(r8, r9)
            if (r8 != 0) goto L_0x0177
            r11.mo75559l()
            goto L_0x0177
        L_0x0144:
            boolean r9 = com.p683ss.android.ugc.aweme.main.C36616dz.m82504a(r7)
            if (r9 == 0) goto L_0x0177
            if (r7 != r4) goto L_0x015d
            java.lang.StringBuilder r9 = new java.lang.StringBuilder
            java.lang.String r10 = "UnReadCountMonitor MainPageFragment receive IM: "
            r9.<init>(r10)
            r9.append(r8)
            java.lang.String r9 = r9.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r9)
        L_0x015d:
            boolean r9 = com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment.m85063c()
            if (r9 == 0) goto L_0x0174
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85099a(r7, r8)
            boolean r9 = r11.f93507p
            if (r9 != 0) goto L_0x0177
            boolean r9 = r11.m82323L()
            if (r9 != 0) goto L_0x0174
            r11.mo75560m()
            goto L_0x0177
        L_0x0174:
            r11.m82341b(r7, r8)
        L_0x0177:
            if (r7 != r5) goto L_0x0182
            org.greenrobot.eventbus.c r7 = org.greenrobot.eventbus.C53755c.m114319a()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.bean.h> r8 = com.p683ss.android.ugc.aweme.notice.api.bean.C38041h.class
            r7.mo112957b(r8)
        L_0x0182:
            int r7 = r12.f96815a
            boolean r7 = com.p683ss.android.ugc.aweme.main.C36616dz.m82511d(r7)
            if (r7 == 0) goto L_0x008b
            if (r0 == 0) goto L_0x008b
            boolean r7 = r11.f93507p
            if (r7 != 0) goto L_0x008b
            r11.mo75549d(r2)
            goto L_0x008b
        L_0x0195:
            return
        L_0x0196:
            boolean r0 = com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment.m85064d()
            if (r0 == 0) goto L_0x01f5
            int r0 = r12.f96816b
            if (r0 != r3) goto L_0x01b4
            int[] r0 = new int[r2]
            int r2 = r12.f96815a
            r0[r1] = r2
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85103c(r0)
            int r0 = r12.f96815a
            boolean r0 = com.p683ss.android.ugc.aweme.main.C36616dz.m82509c(r0)
            if (r0 != 0) goto L_0x02b4
            r11.m82325N()
        L_0x01b4:
            int r0 = r12.f96815a
            boolean r0 = com.p683ss.android.ugc.aweme.main.C36616dz.m82509c(r0)
            if (r0 == 0) goto L_0x01dd
            int r0 = r12.f96815a
            int r1 = r12.f96816b
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85099a(r0, r1)
            int r0 = r12.f96816b
            if (r0 <= 0) goto L_0x01d8
            java.lang.String r0 = "NOTIFICATION"
            com.ss.android.ugc.aweme.main.TabChangeManager r1 = r11.f93503l
            java.lang.String r1 = r1.f93538c
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x01d8
            r11.mo75559l()
            goto L_0x02a7
        L_0x01d8:
            r11.m82325N()
            goto L_0x02a7
        L_0x01dd:
            int r0 = r12.f96815a
            boolean r0 = com.p683ss.android.ugc.aweme.main.C36616dz.m82511d(r0)
            if (r0 == 0) goto L_0x02a7
            int r0 = r12.f96815a
            int r2 = r12.f96816b
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85099a(r0, r2)
            boolean r0 = r11.f93507p
            if (r0 != 0) goto L_0x02a7
            r11.mo75549d(r1)
            goto L_0x02a7
        L_0x01f5:
            boolean r0 = com.p683ss.android.ugc.aweme.main.C36616dz.m82512e()
            if (r0 == 0) goto L_0x020c
            java.lang.String r0 = "NOTIFICATION"
            com.ss.android.ugc.aweme.main.TabChangeManager r1 = r11.f93503l
            java.lang.String r1 = r1.f93538c
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x02a7
            r11.mo75559l()
            goto L_0x02a7
        L_0x020c:
            int r0 = r12.f96815a
            boolean r0 = com.p683ss.android.ugc.aweme.main.C36616dz.m82507b(r0)
            if (r0 == 0) goto L_0x0266
            int r0 = r12.f96816b
            if (r0 != r3) goto L_0x022d
            int[] r0 = new int[r2]
            int r2 = r12.f96815a
            r0[r1] = r2
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85103c(r0)
            boolean r0 = com.p683ss.android.ugc.aweme.main.C36616dz.m82510d()
            if (r0 == 0) goto L_0x0228
            return
        L_0x0228:
            r11.m82325N()
            goto L_0x02a7
        L_0x022d:
            boolean r0 = com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment.m85063c()
            if (r0 == 0) goto L_0x0252
            int r0 = r12.f96815a
            int r1 = r12.f96816b
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85099a(r0, r1)
            int r0 = r12.f96816b
            if (r0 <= 0) goto L_0x024e
            java.lang.String r0 = "NOTIFICATION"
            com.ss.android.ugc.aweme.main.TabChangeManager r1 = r11.f93503l
            java.lang.String r1 = r1.f93538c
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x024e
            r11.mo75559l()
            goto L_0x02a7
        L_0x024e:
            r11.m82325N()
            goto L_0x02a7
        L_0x0252:
            int r0 = r12.f96816b
            if (r0 <= 0) goto L_0x02a7
            java.lang.String r0 = "NOTIFICATION"
            com.ss.android.ugc.aweme.main.TabChangeManager r1 = r11.f93503l
            java.lang.String r1 = r1.f93538c
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 != 0) goto L_0x02a7
            r11.mo75559l()
            goto L_0x02a7
        L_0x0266:
            int r0 = r12.f96815a
            boolean r0 = com.p683ss.android.ugc.aweme.main.C36616dz.m82504a(r0)
            if (r0 == 0) goto L_0x02a7
            int r0 = r12.f96815a
            if (r0 != r4) goto L_0x0285
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r1 = "UnReadCountMonitor MainPageFragment receive IM: "
            r0.<init>(r1)
            int r1 = r12.f96816b
            r0.append(r1)
            java.lang.String r0 = r0.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75144a(r0)
        L_0x0285:
            boolean r0 = com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment.m85063c()
            if (r0 == 0) goto L_0x02a0
            int r0 = r12.f96815a
            int r1 = r12.f96816b
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85099a(r0, r1)
            boolean r0 = r11.f93507p
            if (r0 != 0) goto L_0x02a7
            boolean r0 = r11.m82323L()
            if (r0 != 0) goto L_0x02a0
            r11.mo75560m()
            goto L_0x02a7
        L_0x02a0:
            int r0 = r12.f96815a
            int r1 = r12.f96816b
            r11.m82341b(r0, r1)
        L_0x02a7:
            int r12 = r12.f96815a
            if (r12 != r5) goto L_0x02b4
            org.greenrobot.eventbus.c r12 = org.greenrobot.eventbus.C53755c.m114319a()
            java.lang.Class<com.ss.android.ugc.aweme.notice.api.bean.h> r0 = com.p683ss.android.ugc.aweme.notice.api.bean.C38041h.class
            r12.mo112957b(r0)
        L_0x02b4:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.MainPageFragment.onNotificationIndicatorEvent(com.ss.android.ugc.aweme.notice.api.bean.h):void");
    }

    /* JADX WARNING: type inference failed for: r5v1 */
    /* JADX WARNING: type inference failed for: r5v3, types: [com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment] */
    /* JADX WARNING: type inference failed for: r5v5, types: [com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment] */
    /* JADX WARNING: type inference failed for: r5v6, types: [com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment] */
    /* JADX WARNING: type inference failed for: r5v8, types: [com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment] */
    /* JADX WARNING: type inference failed for: r5v9 */
    /* JADX WARNING: type inference failed for: r5v11, types: [android.support.v4.app.Fragment] */
    /* JADX WARNING: type inference failed for: r5v22 */
    /* JADX WARNING: type inference failed for: r5v23 */
    /* JADX WARNING: type inference failed for: r5v24 */
    /* access modifiers changed from: private */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r5v1
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment, android.support.v4.app.Fragment]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment, ?[OBJECT, ARRAY]]
      mth insns count: 374
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 4 */
    /* renamed from: d */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo75544b(java.lang.String r10) {
        /*
            r9 = this;
            com.ss.android.ugc.aweme.share.viewmodel.a r0 = r9.f93479P
            boolean r0 = r0.mo86222f()
            if (r0 == 0) goto L_0x0009
            return
        L_0x0009:
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r9.f93503l
            java.lang.String r0 = r0.f93538c
            com.ss.android.ugc.aweme.share.g r1 = new com.ss.android.ugc.aweme.share.g
            com.ss.android.ugc.aweme.main.TabChangeManager r2 = r9.f93503l
            java.lang.String r2 = r2.f93538c
            r1.<init>(r10, r2)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r1)
            java.lang.String r1 = "NOTIFICATION"
            boolean r1 = r1.equals(r10)
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x0030
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85100a(r3)
            int[] r1 = new int[r3]
            r4 = 998(0x3e6, float:1.398E-42)
            r1[r2] = r4
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85103c(r1)
            goto L_0x0033
        L_0x0030:
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85100a(r2)
        L_0x0033:
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r1 = r9.f93508q
            java.lang.String r4 = "page_setting"
            boolean r1 = r1.mo69868b(r4)
            if (r1 == 0) goto L_0x003e
            return
        L_0x003e:
            com.p683ss.android.ugc.aweme.p1436bi.C23827a.C23828a.f63478b = r10
            java.lang.String r1 = "HOME"
            boolean r1 = android.text.TextUtils.equals(r10, r1)
            if (r1 != 0) goto L_0x0056
            com.ss.android.ugc.aweme.an.a r1 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            r1.mo46914a()
            com.ss.android.ugc.aweme.an.a r1 = com.p683ss.android.ugc.aweme.p1341an.C22574a.m55738f()
            r1.mo46919b()
        L_0x0056:
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r1 = r9.f93508q
            java.lang.String r1 = r1.f85674g
            r4 = -1
            int r5 = r10.hashCode()
            r6 = 3
            r7 = 4
            switch(r5) {
                case -1382453013: goto L_0x008d;
                case 2223327: goto L_0x0083;
                case 2614219: goto L_0x0079;
                case 482617583: goto L_0x006f;
                case 1055811561: goto L_0x0065;
                default: goto L_0x0064;
            }
        L_0x0064:
            goto L_0x0096
        L_0x0065:
            java.lang.String r5 = "DISCOVER"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0096
            r4 = 1
            goto L_0x0096
        L_0x006f:
            java.lang.String r5 = "PUBLISH"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0096
            r4 = 2
            goto L_0x0096
        L_0x0079:
            java.lang.String r5 = "USER"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0096
            r4 = 4
            goto L_0x0096
        L_0x0083:
            java.lang.String r5 = "HOME"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0096
            r4 = 0
            goto L_0x0096
        L_0x008d:
            java.lang.String r5 = "NOTIFICATION"
            boolean r5 = r10.equals(r5)
            if (r5 == 0) goto L_0x0096
            r4 = 3
        L_0x0096:
            r5 = 0
            switch(r4) {
                case 0: goto L_0x0337;
                case 1: goto L_0x01fa;
                case 2: goto L_0x01ef;
                case 3: goto L_0x0145;
                case 4: goto L_0x009c;
                default: goto L_0x009a;
            }
        L_0x009a:
            goto L_0x03f5
        L_0x009c:
            com.ss.android.ugc.aweme.main.b.b r0 = r9.f93502k
            if (r0 == 0) goto L_0x00a5
            com.ss.android.ugc.aweme.main.b.b r0 = r9.f93502k
            r0.mo75644b()
        L_0x00a5:
            java.lang.String r0 = "USER"
            com.ss.android.ugc.aweme.main.TabChangeManager r4 = r9.f93503l
            java.lang.String r4 = r4.f93538c
            boolean r0 = r0.equals(r4)
            if (r0 != 0) goto L_0x00ef
            java.util.concurrent.Callable r0 = com.p683ss.android.ugc.aweme.main.C36572cw.f93662a
            java.util.concurrent.ExecutorService r4 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r0, r4)
            r9.m82313A()
            r9.m82342b(r1, r10)
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r9.f93503l
            java.lang.String r1 = "USER"
            r0.mo75614a(r1)
            r9.m82321J()
            com.ss.android.ugc.aweme.video.h r0 = com.p683ss.android.ugc.aweme.video.C48121w.m104249M()
            r0.mo95293z()
            com.ss.android.ugc.aweme.video.k r0 = com.p683ss.android.ugc.aweme.video.C48039k.m104036a()
            r0.mo95304b()
            r9.mo75547c(r3)
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r0 = r9.f93508q
            r0.mo69863a(r2)
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r9.f93503l
            android.support.v4.app.Fragment r0 = r0.mo75609a()
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40242a
            if (r1 == 0) goto L_0x00ef
            com.ss.android.ugc.aweme.profile.ui.b.a r0 = (com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40242a) r0
            r0.mo82154G()
        L_0x00ef:
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r9.f93503l
            android.support.v4.app.Fragment r0 = r0.mo75609a()
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.profile.p2090ui.p2091a.C40205b
            if (r1 == 0) goto L_0x00fc
            r0.setUserVisibleHint(r3)
        L_0x00fc:
            int[] r0 = new int[r3]
            r0[r2] = r7
            boolean r0 = com.p683ss.android.ugc.aweme.notice.api.C38046d.m85102b(r0)
            if (r0 == 0) goto L_0x010d
            int[] r0 = new int[r3]
            r0[r2] = r7
            com.p683ss.android.ugc.aweme.notice.api.C38046d.m85103c(r0)
        L_0x010d:
            com.ss.android.ugc.aweme.main.cx r0 = new com.ss.android.ugc.aweme.main.cx
            r0.<init>(r9)
            java.util.concurrent.ExecutorService r1 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r0, r1)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.getBridgeService_Monster()
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            android.support.v4.app.FragmentActivity r1 = r9.getActivity()
            java.lang.String r2 = "USER"
            r0.changeStatusBarMainTab(r1, r2)
            com.ss.android.ugc.aweme.feed.ad r0 = com.p683ss.android.ugc.aweme.feed.C29988ad.PROFILE
            com.p683ss.android.ugc.aweme.feed.C30578o.m71566a(r0)
            android.os.Handler r0 = r9.f93480Q
            if (r0 == 0) goto L_0x013e
            android.os.Handler r0 = r9.f93480Q
            com.ss.android.ugc.aweme.main.cy r1 = new com.ss.android.ugc.aweme.main.cy
            r1.<init>(r9)
            r0.removeCallbacks(r1)
            r9.mo75582v()
        L_0x013e:
            java.lang.String r0 = "personal_homepage"
            m82346e(r0)
            goto L_0x03f5
        L_0x0145:
            com.ss.android.ugc.aweme.main.b.b r0 = r9.f93502k
            if (r0 == 0) goto L_0x014e
            com.ss.android.ugc.aweme.main.b.b r0 = r9.f93502k
            r0.mo75644b()
        L_0x014e:
            boolean r0 = com.p683ss.android.ugc.aweme.notice.api.p2005ab.MTNotificationTabMergeExperiment.m85062b()
            if (r0 == 0) goto L_0x01b1
            java.lang.String r0 = "NOTIFICATION"
            com.ss.android.ugc.aweme.main.TabChangeManager r4 = r9.f93503l
            java.lang.String r4 = r4.f93538c
            boolean r0 = android.text.TextUtils.equals(r0, r4)
            if (r0 == 0) goto L_0x01b1
            com.ss.android.ugc.aweme.homepage.ui.view.MainBottomTabView r0 = r9.f93497b
            java.lang.String r4 = "NOTIFICATION"
            com.ss.android.ugc.aweme.homepage.ui.view.k r0 = r0.mo69946c(r4)
            r7 = 500(0x1f4, double:2.47E-321)
            boolean r0 = com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a.m75680a(r0, r7)
            if (r0 == 0) goto L_0x01b1
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r9.f93503l
            android.support.v4.app.Fragment r0 = r0.mo75609a()
            boolean r4 = r0 instanceof com.p683ss.android.ugc.aweme.message.MessagesFragment
            if (r4 == 0) goto L_0x01b1
            com.ss.android.ugc.aweme.message.MessagesFragment r0 = (com.p683ss.android.ugc.aweme.message.MessagesFragment) r0
            com.ss.android.ugc.aweme.message.a.a r4 = r0.f93972a
            if (r4 == 0) goto L_0x01a5
            com.ss.android.ugc.aweme.message.a.a r0 = r0.f93972a
            r4 = 0
        L_0x0183:
            java.util.List<android.support.v4.app.Fragment> r7 = r0.f93991a
            int r7 = r7.size()
            if (r4 >= r7) goto L_0x01a5
            java.util.List<android.support.v4.app.Fragment> r7 = r0.f93991a
            java.lang.Object r7 = r7.get(r4)
            boolean r7 = r7 instanceof com.p683ss.android.ugc.aweme.notice.api.p2007c.C38044a
            if (r7 == 0) goto L_0x01a2
            java.util.List<android.support.v4.app.Fragment> r0 = r0.f93991a
            java.lang.Object r0 = r0.get(r4)
            com.ss.android.ugc.aweme.notice.api.c.a r0 = (com.p683ss.android.ugc.aweme.notice.api.p2007c.C38044a) r0
            android.support.v4.app.Fragment r5 = r0.mo77567a()
            goto L_0x01a5
        L_0x01a2:
            int r4 = r4 + 1
            goto L_0x0183
        L_0x01a5:
            boolean r0 = r5 instanceof com.p683ss.android.ugc.aweme.notice.api.p2007c.C38044a
            if (r0 == 0) goto L_0x01b1
            com.ss.android.ugc.aweme.notice.api.c.a r5 = (com.p683ss.android.ugc.aweme.notice.api.p2007c.C38044a) r5
            r5.mo77568b()
            com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a.m75678a()
        L_0x01b1:
            r9.mo75545b(r2)
            r9.m82342b(r1, r10)
            r9.mo75558k()
            android.content.Context r0 = m82348h()
            java.lang.String r1 = "message"
            java.lang.String r2 = "click"
            com.p683ss.android.common.p1146d.C18898c.m46009a(r0, r1, r2)
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r9.f93503l
            android.support.v4.app.Fragment r0 = r0.mo75609a()
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.message.MessagesFragment
            if (r1 == 0) goto L_0x01d2
            r0.setUserVisibleHint(r3)
        L_0x01d2:
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.getBridgeService_Monster()
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            android.support.v4.app.FragmentActivity r1 = r9.getActivity()
            java.lang.String r2 = "NOTIFICATION"
            r0.changeStatusBarMainTab(r1, r2)
            com.benchmark.bl.a r0 = com.benchmark.p124bl.C2633a.m7625b()
            r0.mo7188a(r6)
            java.lang.String r0 = "notification_page"
            m82346e(r0)
            goto L_0x03f5
        L_0x01ef:
            com.ss.android.ugc.aweme.main.b.b r0 = r9.f93502k
            if (r0 == 0) goto L_0x03f5
            com.ss.android.ugc.aweme.main.b.b r0 = r9.f93502k
            r0.mo75644b()
            goto L_0x03f5
        L_0x01fa:
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r9.f93503l
            java.lang.String r0 = r0.f93538c
            com.ss.android.ugc.aweme.main.b.b r1 = r9.f93502k
            if (r1 == 0) goto L_0x0207
            com.ss.android.ugc.aweme.main.b.b r1 = r9.f93502k
            r1.mo75644b()
        L_0x0207:
            java.lang.String r1 = "DISCOVER"
            com.ss.android.ugc.aweme.main.TabChangeManager r4 = r9.f93503l
            java.lang.String r4 = r4.f93538c
            boolean r1 = r1.equals(r4)
            if (r1 != 0) goto L_0x02c4
            r9.m82313A()
            com.ss.android.ugc.aweme.main.TabChangeManager r1 = r9.f93503l
            java.lang.String r4 = "DISCOVER"
            r1.mo75614a(r4)
            com.ss.android.ugc.aweme.main.TabChangeManager r1 = r9.f93503l
            android.support.v4.app.Fragment r1 = r1.mo75609a()
            boolean r4 = r1 instanceof com.p683ss.android.ugc.aweme.newfollow.p2002ui.FriendTabFragment
            if (r4 == 0) goto L_0x022a
            r5 = r1
            com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment r5 = (com.p683ss.android.ugc.aweme.newfollow.p2002ui.FriendTabFragment) r5
        L_0x022a:
            com.ss.android.ugc.aweme.video.h r4 = com.p683ss.android.ugc.aweme.video.C48121w.m104249M()
            r4.mo95293z()
            com.ss.android.ugc.aweme.video.k r4 = com.p683ss.android.ugc.aweme.video.C48039k.m104036a()
            r4.mo95304b()
            r9.m82321J()
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r4 = r9.f93508q
            r4.mo69863a(r2)
            r9.mo75547c(r3)
            if (r5 == 0) goto L_0x031a
            com.ss.android.ugc.aweme.discover.a.d r2 = r5.mo77355e()
            if (r2 == 0) goto L_0x0263
            r5.mo77355e()
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r1 = com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.getBridgeService_Monster()
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r1 = (com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService) r1
            android.support.v4.app.FragmentActivity r2 = r9.getActivity()
            r1.tryToShowPromoteProgram(r2)
            if (r0 == 0) goto L_0x02ad
            java.lang.String r1 = "enter_discovery_page"
            r9.m82340a(r0, r1)
            goto L_0x02ad
        L_0x0263:
            if (r5 == 0) goto L_0x0276
            com.ss.android.ugc.aweme.discover.ui.HotSearchAndDiscoveryFragment2 r2 = r5.mo77356f()
            if (r2 == 0) goto L_0x0276
            if (r0 == 0) goto L_0x0272
            java.lang.String r1 = "enter_discovery_page"
            r9.m82340a(r0, r1)
        L_0x0272:
            com.p683ss.android.ugc.aweme.discover.mob.C28396b.m67402a()
            goto L_0x02ad
        L_0x0276:
            com.ss.android.ugc.aweme.newfollow.ui.b r2 = r5.mo77354a()
            if (r2 == 0) goto L_0x02a0
            com.ss.android.ugc.aweme.newfollow.ui.b r2 = r5.mo77354a()
            long r6 = java.lang.System.currentTimeMillis()
            com.ss.android.ugc.aweme.follow.presenter.a r4 = r2.f96547b
            if (r4 == 0) goto L_0x028c
            com.ss.android.ugc.aweme.follow.presenter.a r2 = r2.f96547b
            r2.f83271e = r6
        L_0x028c:
            if (r0 == 0) goto L_0x0293
            java.lang.String r2 = "enter_homepage_follow"
            r9.m82340a(r0, r2)
        L_0x0293:
            r1.setUserVisibleHint(r3)
            java.util.concurrent.Callable r0 = com.p683ss.android.ugc.aweme.main.C36569ct.f93659a
            java.util.concurrent.ExecutorService r1 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r0, r1)
            goto L_0x02ad
        L_0x02a0:
            boolean r1 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r1 != 0) goto L_0x02ad
            if (r0 == 0) goto L_0x02ad
            java.lang.String r1 = "enter_discovery_page"
            r9.m82340a(r0, r1)
        L_0x02ad:
            boolean r0 = r9.f93493ac
            if (r0 == 0) goto L_0x031a
            com.ss.android.ugc.aweme.newfollow.ui.b r0 = r5.mo77354a()
            if (r0 != 0) goto L_0x031a
            r9.m82331T()
            java.lang.String r0 = "follow_notice_dis"
            r1 = -1
            java.lang.String r3 = "yellow_dot"
            m82339a(r0, r1, r3)
            goto L_0x031a
        L_0x02c4:
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r9.f93503l
            android.support.v4.app.Fragment r0 = r0.mo75609a()
            boolean r1 = r0 instanceof com.p683ss.android.ugc.aweme.newfollow.p2002ui.FriendTabFragment
            if (r1 == 0) goto L_0x02d1
            r5 = r0
            com.ss.android.ugc.aweme.newfollow.ui.FriendTabFragment r5 = (com.p683ss.android.ugc.aweme.newfollow.p2002ui.FriendTabFragment) r5
        L_0x02d1:
            if (r5 == 0) goto L_0x02fb
            com.ss.android.ugc.aweme.newfollow.ui.b r0 = r5.mo77354a()
            if (r0 == 0) goto L_0x02fb
            com.ss.android.ugc.aweme.homepage.ui.view.MainBottomTabView r0 = r9.f93497b
            java.lang.String r1 = "DISCOVER"
            r0.mo69945b(r1)
            com.ss.android.ugc.aweme.newfollow.ui.b r0 = r5.mo77354a()
            boolean r0 = r0.isViewValid()
            if (r0 == 0) goto L_0x02f1
            com.ss.android.ugc.aweme.newfollow.ui.b r0 = r5.mo77354a()
            r0.mo59855d_(r3)
        L_0x02f1:
            java.util.concurrent.Callable r0 = com.p683ss.android.ugc.aweme.main.C36570cu.f93660a
            java.util.concurrent.ExecutorService r1 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r0, r1)
            goto L_0x031a
        L_0x02fb:
            if (r5 == 0) goto L_0x030b
            com.ss.android.ugc.aweme.discover.a.d r0 = r5.mo77355e()
            if (r0 == 0) goto L_0x030b
            com.ss.android.ugc.aweme.discover.a.d r0 = r5.mo77355e()
            r0.aL_()
            goto L_0x031a
        L_0x030b:
            if (r5 == 0) goto L_0x031a
            com.ss.android.ugc.aweme.discover.ui.HotSearchAndDiscoveryFragment2 r0 = r5.mo77356f()
            if (r0 == 0) goto L_0x031a
            com.ss.android.ugc.aweme.discover.ui.HotSearchAndDiscoveryFragment2 r0 = r5.mo77356f()
            r0.mo58067s()
        L_0x031a:
            com.ss.android.ugc.aweme.main.cv r0 = new com.ss.android.ugc.aweme.main.cv
            r0.<init>(r9)
            java.util.concurrent.ExecutorService r1 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r0, r1)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.getBridgeService_Monster()
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            android.support.v4.app.FragmentActivity r1 = r9.getActivity()
            java.lang.String r2 = "DISCOVER"
            r0.changeStatusBarMainTab(r1, r2)
            goto L_0x03f5
        L_0x0337:
            java.lang.String r1 = "HOME"
            com.ss.android.ugc.aweme.main.TabChangeManager r4 = r9.f93503l
            java.lang.String r4 = r4.f93538c
            boolean r1 = android.text.TextUtils.equals(r1, r4)
            if (r1 == 0) goto L_0x036a
            com.ss.android.ugc.aweme.homepage.ui.view.MainBottomTabView r0 = r9.f93497b
            java.lang.String r1 = "HOME"
            r0.mo69945b(r1)
            com.ss.android.ugc.aweme.main.TabChangeManager r0 = r9.f93503l
            java.lang.String r1 = "HOME"
            android.support.v4.app.Fragment r0 = r0.mo75619c(r1)
            com.ss.android.ugc.aweme.main.MainFragment r0 = (com.p683ss.android.ugc.aweme.main.MainFragment) r0
            java.lang.String r1 = "homepage_refresh"
            r0.mo75495a(r3, r1)
            com.ss.android.ugc.aweme.ug.guide.c r0 = new com.ss.android.ugc.aweme.ug.guide.c
            r0.<init>(r3)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r0)
            com.ss.android.ugc.aweme.commercialize.d.c r0 = new com.ss.android.ugc.aweme.commercialize.d.c
            r0.<init>()
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r0)
            goto L_0x03da
        L_0x036a:
            com.ss.android.ugc.aweme.main.TabChangeManager r1 = r9.f93503l
            java.lang.String r4 = "HOME"
            r1.mo75614a(r4)
            r9.m82356z()
            com.ss.android.ugc.aweme.main.TabChangeManager r1 = r9.f93503l
            android.support.v4.app.Fragment r1 = r1.mo75609a()
            com.ss.android.ugc.aweme.main.cn r4 = new com.ss.android.ugc.aweme.main.cn
            r4.<init>(r9)
            java.util.concurrent.ExecutorService r5 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r4, r5)
            boolean r4 = r1 instanceof com.p683ss.android.ugc.aweme.main.MainFragment
            if (r4 == 0) goto L_0x03da
            com.ss.android.ugc.aweme.main.MainFragment r1 = (com.p683ss.android.ugc.aweme.main.MainFragment) r1
            com.ss.android.ugc.aweme.homepage.ui.g r4 = r1.f93436k
            if (r4 == 0) goto L_0x039d
            com.ss.android.ugc.aweme.base.ui.FlippableViewPager r4 = r1.mViewPager
            if (r4 == 0) goto L_0x039d
            com.ss.android.ugc.aweme.base.ui.FlippableViewPager r4 = r1.mViewPager
            int r4 = r4.getCurrentItemCompat()
            if (r4 == 0) goto L_0x039d
            goto L_0x039e
        L_0x039d:
            r2 = 1
        L_0x039e:
            if (r2 == 0) goto L_0x03a7
            android.support.v4.app.FragmentActivity r2 = r9.getActivity()
            com.p683ss.android.ugc.aweme.main.p1944g.C36654a.m82563a(r2)
        L_0x03a7:
            java.lang.String r2 = r1.mo75508h()
            com.ss.android.ugc.aweme.main.co r3 = new com.ss.android.ugc.aweme.main.co
            r3.<init>(r9, r0, r2)
            java.util.concurrent.ExecutorService r0 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r3, r0)
            com.ss.android.ugc.aweme.feed.ui.af r0 = r1.mo75499c()
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.feed.p1736ui.FeedTimeLineFragment
            if (r0 == 0) goto L_0x03c9
            java.util.concurrent.Callable r0 = com.p683ss.android.ugc.aweme.main.C36565cp.f93655a
            java.util.concurrent.ExecutorService r1 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r0, r1)
            goto L_0x03da
        L_0x03c9:
            com.ss.android.ugc.aweme.feed.ui.af r0 = r1.mo75499c()
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai
            if (r0 == 0) goto L_0x03da
            java.util.concurrent.Callable r0 = com.p683ss.android.ugc.aweme.main.C36566cq.f93656a
            java.util.concurrent.ExecutorService r1 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r0, r1)
        L_0x03da:
            com.ss.android.ugc.aweme.main.cs r0 = new com.ss.android.ugc.aweme.main.cs
            r0.<init>(r9)
            java.util.concurrent.ExecutorService r1 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
            p001a.C0013i.m18a(r0, r1)
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = com.p683ss.android.ugc.aweme.bridgeservice.I18nBridgeService.getBridgeService_Monster()
            com.ss.android.ugc.aweme.bridgeservice.IBridgeService r0 = (com.p683ss.android.ugc.aweme.bridgeservice.IBridgeService) r0
            android.support.v4.app.FragmentActivity r1 = r9.getActivity()
            java.lang.String r2 = "HOME"
            r0.changeStatusBarMainTab(r1, r2)
        L_0x03f5:
            java.lang.String r0 = "HOME"
            boolean r10 = com.bytedance.common.utility.C9431p.m18665a(r10, r0)
            if (r10 != 0) goto L_0x0405
            com.ss.android.ugc.aweme.feed.h.k r10 = new com.ss.android.ugc.aweme.feed.h.k
            r10.<init>()
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r10)
        L_0x0405:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.MainPageFragment.mo75544b(java.lang.String):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo75539a(C23274a aVar) {
        if (this.f93512u) {
            this.f93497b.f85745b.setEnabled(true);
            C30289j.m71209c(false);
            this.f93470F.setVisibility(8);
            m82356z();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m82334a(int i, int i2) throws Exception {
        HashMap hashMap = new HashMap();
        if (i > 0) {
            hashMap.put("notice_type", "number_dot");
            hashMap.put("show_cnt", String.valueOf(i));
            hashMap.put("previous_show_cnt", String.valueOf(i2));
        } else {
            hashMap.put("notice_type", "yellow_dot");
        }
        C26890h.m65011a("message_notice_show", (Map<String, String>) hashMap);
        return null;
    }

    /* renamed from: b */
    private void m82342b(String str, String str2) {
        if (RecommendUserDialogShowStrategy.m90744a(str, str2) && RecommendUserDialogShowStrategy.m90743a(str2)) {
            C41125m.m90813a(new C41126n(new WeakReference(getActivity()), m82347f(str2), m82347f(str)));
        }
    }

    /* renamed from: c */
    private void m82344c(String str, String str2) {
        if ((TextUtils.equals(str, "HOME") || TextUtils.equals(str2, "HOME")) && TextUtils.equals(m82332U(), "homepage_hot")) {
            C41125m.m90813a(new C41126n(new WeakReference(getActivity()), m82347f(str2), m82347f(str)));
        }
    }

    /* renamed from: b */
    private void m82341b(int i, int i2) {
        if (isViewValid()) {
            if (!C20902b.m53242a().isLogin() || C47915gg.m103651b()) {
                m82325N();
            } else if (ImUnder16Manger.m76250c() || ImUnder16Manger.m76252e()) {
                m82325N();
            } else {
                if (C36616dz.m82503a() > 0) {
                    m82325N();
                }
                m82324M();
                C38046d.m85099a(i, i2);
                int a = C36616dz.m82503a();
                StringBuilder sb = new StringBuilder("UnReadCountMonitor MainPageFragment showNotificationCount(");
                sb.append(i);
                sb.append(", ");
                sb.append(i2);
                sb.append("):[all,");
                sb.append(a);
                sb.append("][99");
                sb.append(",");
                sb.append(C38046d.m85098a(99));
                sb.append("]");
                C32458a.m75144a(sb.toString());
                this.f93497b.mo69942a("NOTIFICATION", a);
            }
        }
    }

    /* renamed from: a */
    private void m82340a(String str, String str2) {
        String str3;
        if (TextUtils.equals("enter_discovery_page", str2)) {
            str3 = "click_discovery_tab";
        } else {
            str3 = "click_follow_tab";
        }
        if (!TextUtils.equals(str, "HOME") || !TextUtils.equals(this.f93475K.f85662b, "homepage_hot")) {
            C0013i.m18a((Callable<TResult>) new C36579db<TResult>(this, str, str2, str3), (Executor) C26890h.m65003a());
        } else {
            C0013i.m18a((Callable<TResult>) new C36575cz<TResult>(str2, str3, C23229c.m57040a(), C23229c.m57041b()), (Executor) C26890h.m65003a());
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        boolean z;
        MainBottomTabView mainBottomTabView;
        View view2;
        super.onViewCreated(view, bundle);
        C35781s.m80912a("MainPageFragment onViewCreated");
        this.f93477M = (MainAnimViewModel) C0214z.m440a(getActivity()).mo359a(MainAnimViewModel.class);
        this.f93500e = view;
        this.f93490a = this.f93500e.findViewById(R.id.mb);
        this.f93497b = (MainBottomTabView) this.f93500e.findViewById(R.id.bjs);
        this.f93498c = (ViewStub) this.f93500e.findViewById(R.id.pm);
        this.f93472H = (PolicyNoticeToast) this.f93500e.findViewById(R.id.c3j);
        this.f93513v = this.f93500e.findViewById(R.id.dtd);
        MainPageDataViewModel.m75871a(this).f85661a = this.f93513v;
        this.f93479P = C42245a.m92680a((Context) getActivity());
        this.f93479P.mo86219e(new C42247b() {
            /* renamed from: a */
            public final void mo75532a() {
                if (MainPageFragment.this.f93497b != null) {
                    MainPageFragment.this.f93497b.setAlpha(1.0f);
                }
                if (MainPageFragment.this.f93508q != null) {
                    MainPageFragment.this.f93508q.mo69863a(true);
                }
            }

            /* renamed from: b */
            public final void mo75533b() {
                if (MainPageFragment.this.f93497b != null) {
                    MainPageFragment.this.f93497b.setAlpha(0.5f);
                }
                if (MainPageFragment.this.f93508q != null) {
                    MainPageFragment.this.f93508q.mo69863a(false);
                }
            }
        });
        this.f93475K = MainPageDataViewModel.m75871a(this);
        this.f93503l = TabChangeManager.m82396a(getActivity());
        this.f93509r = HomePageDataViewModel.m75866a(getActivity());
        this.f93508q = ScrollSwitchStateManager.m75876a(getActivity());
        this.f93508q.mo69876e(getActivity(), new C36558ci(this));
        this.f93508q.mo69872c(getActivity(), new C36559cj(this));
        this.f93508q.mo69875d(getActivity(), new C36560ck(this));
        this.f93490a = this.f93500e.findViewById(R.id.mb);
        this.f93498c = (ViewStub) this.f93500e.findViewById(R.id.pm);
        this.f93499d = (ViewStub) this.f93500e.findViewById(R.id.pl);
        this.f93467C = (ViewStub) this.f93500e.findViewById(R.id.a1k);
        if (getContext() instanceof MainActivity) {
            this.f93501j = (DisLikeAwemeLayout) ((MainActivity) getContext()).findViewById(R.id.a6b);
        }
        if (C10181b.m20511a().mo18168a(ShowTabWithTextExperiment.class, true, "main_tab_style", 31744, 1) == 1) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            this.f93497b.setMode(C33055ar.MODE_MATERIAL);
            if (C22453b.m55505a().f60473k) {
                this.f93497b.setBackgroundColor(C0726c.m2098c(getContext(), R.color.aug));
                this.f93497b.mo69940a();
            }
        } else {
            this.f93497b.setMode(C33055ar.MODE_ICON);
        }
        TabAlphaController a = TabAlphaController.m82394a();
        MainBottomTabView mainBottomTabView2 = this.f93497b;
        if (mainBottomTabView2 != null) {
            a.f93533a = mainBottomTabView2;
        }
        C32981c cVar = this.f93485V;
        C52711k.m112240b(this, "fragment");
        C33008f fVar = cVar.f85698a;
        C52711k.m112240b(this, "fragment");
        getLifecycle().mo324a(TabAlphaController.m82394a());
        FragmentTabHost fragmentTabHost = fVar.f85728a;
        if (fragmentTabHost != null) {
            fragmentTabHost.mo20455a(getActivity(), getChildFragmentManager(), R.id.cwo);
        }
        FragmentTabHost fragmentTabHost2 = fVar.f85728a;
        if (fragmentTabHost2 != null) {
            TabWidget tabWidget = fragmentTabHost2.getTabWidget();
            if (tabWidget != null) {
                tabWidget.setVisibility(8);
            }
        }
        if (this instanceof C11156b) {
            FragmentTabHost fragmentTabHost3 = fVar.f85728a;
            if (fragmentTabHost3 != null) {
                fragmentTabHost3.setOnTabSwitchListener(this);
            }
        }
        fVar.f85729b = TabChangeManager.m82396a(getActivity()).mo75611a(fVar.f85728a).mo75610a(getChildFragmentManager());
        ScrollSwitchStateManager scrollSwitchStateManager = fVar.f85730c;
        if (scrollSwitchStateManager != null) {
            C0198r<Fragment> aVar = new C33009a<>(fVar);
            C52711k.m112240b(aVar, "dataStream");
            scrollSwitchStateManager.f85673f = aVar;
        }
        TabChangeManager tabChangeManager = fVar.f85729b;
        if (tabChangeManager != null) {
            tabChangeManager.f93540e = new C33010b(fVar);
        }
        ScrollSwitchStateManager scrollSwitchStateManager2 = fVar.f85730c;
        if (scrollSwitchStateManager2 != null) {
            C32971a cVar2 = new C33011c(fVar);
            C52711k.m112240b(cVar2, "dataStream");
            scrollSwitchStateManager2.f85675h = cVar2;
        }
        if (this instanceof C23694h) {
            TabChangeManager tabChangeManager2 = fVar.f85729b;
            if (tabChangeManager2 != null) {
                tabChangeManager2.mo75612a((C23694h) this);
            }
        }
        C22574a.m55738f().mo46917a("method_main_page_add_tab_duration", false);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity, "fragment.activity!!");
        Intent intent = activity.getIntent();
        HomePageUIFrameService createHomePageUIFrameServicebyMonsterPlugin = HomePageUIFrameServiceImpl.createHomePageUIFrameServicebyMonsterPlugin();
        TabChangeManager tabChangeManager3 = fVar.f85729b;
        if (tabChangeManager3 == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) intent, "intent");
        createHomePageUIFrameServicebyMonsterPlugin.addTabToMainPageFragment(tabChangeManager3, intent);
        C22574a.m55738f().mo46921b("method_main_page_add_tab_duration", false);
        FragmentTabHost fragmentTabHost4 = fVar.f85728a;
        if (fragmentTabHost4 != null) {
            fragmentTabHost4.post(new C33012d(this));
        }
        C52711k.m112240b(this, "fragment");
        FragmentActivity activity2 = getActivity();
        if (activity2 == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity2, "fragment.activity!!");
        if (TextUtils.equals(activity2.getIntent().getStringExtra("com.ss.android.ugc.aweme.intent.extra.EXTRA_AWEME_PUSH_TAB"), "NOTIFICATION")) {
            FragmentActivity activity3 = getActivity();
            if (activity3 == null) {
                C52711k.m112234a();
            }
            TabChangeManager.m82396a(activity3).mo75614a("NOTIFICATION");
        }
        if (view != null) {
            mainBottomTabView = (MainBottomTabView) view.findViewById(R.id.bjs);
        } else {
            mainBottomTabView = null;
        }
        if (view != null) {
            view2 = view.findViewById(R.id.mb);
        } else {
            view2 = null;
        }
        if (isViewValid()) {
            C22453b.m55505a().mo46744a(1, mainBottomTabView, view2, null, new C32997a(mainBottomTabView));
        }
        FragmentActivity activity4 = getActivity();
        if (activity4 == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity4, "fragment.activity!!");
        C52711k.m112240b(activity4, "activity");
        this.f93508q.mo69878f(this, new C36555cf(this));
        this.f93510s = DataCenter.m57235a(C0214z.m440a(getActivity()), (C0184k) this);
        this.f93510s.mo48226a("ENTER_DISLIKE_MODE", (C0199s<C23274a>) new C36578da<C23274a>(this)).mo48226a("handlePageResume", (C0199s<C23274a>) new C36593dl<C23274a>(this)).mo48226a("setTabBackground", (C0199s<C23274a>) new C36595dn<C23274a>(this)).mo48226a("changeTabToFollowAfterPublish", (C0199s<C23274a>) new C36596do<C23274a>(this)).mo48227a("onNewIntent", new C36597dp(this), true).mo48227a("proformToTab", new C36598dq(this), true).mo48227a("performClickTab", new C36599dr(this), true).mo48226a("exitGuideView", (C0199s<C23274a>) new C36557ch<C23274a>(this));
        this.f93511t = (C36606dx) C23393g.m57474a(getActivity().getApplicationContext(), C36606dx.class);
        C35857a.m81001b().mo74526a(new DownloadFestivalTask()).mo74526a(new QueryFollowingTask()).mo74526a(new InitBubbleGuideTask()).mo74526a(new LocationStatusReportTask()).mo74526a(new LocationTask()).mo74527a();
        mo75550e();
        boolean booleanValue = ((Boolean) this.f93510s.mo48230b("start_from_logout_or_switch", Boolean.valueOf(false))).booleanValue();
        if ((!C20902b.m53242a().isLogin() || TimeLockRuler.isInTeenagerModeNewVersion()) && C40869c.m90381k() && !booleanValue) {
            m82313A();
            this.f93503l.mo75614a("DISCOVER");
        }
        C36173w.m81665a().tryShowTakeLiveBubble(this, this.f93500e, TimeLockRuler.isInTeenagerModeNewVersion());
        this.f93500e.getViewTreeObserver().addOnGlobalLayoutListener(new OnGlobalLayoutListener() {
            public final void onGlobalLayout() {
                MainPageFragment.this.f93500e.getViewTreeObserver().removeOnGlobalLayoutListener(this);
                MainPageFragment.this.f93516y = true;
            }
        });
        this.f93466B = (FeedPanelStateViewModel) C0214z.m440a(getActivity()).mo359a(FeedPanelStateViewModel.class);
        this.f93466B.f106794c.observe(this, new C0199s<Boolean>() {
            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool != null && bool.booleanValue()) {
                    MainPageFragment.this.mo75556i();
                }
            }
        });
        this.f93466B.f106793b.observe(this, new C0199s<Boolean>() {
            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool != null && bool.booleanValue()) {
                    MainPageFragment.this.mo75556i();
                }
            }
        });
        this.f93466B.f106795d.observe(this, new C0199s<Boolean>() {
            public final /* synthetic */ void onChanged(Object obj) {
                Boolean bool = (Boolean) obj;
                if (bool != null && bool.booleanValue()) {
                    MainPageFragment.this.mo75556i();
                }
            }
        });
    }

    /* renamed from: a */
    private static void m82339a(String str, long j, String str2) {
        C0013i.m18a((Callable<TResult>) new C36586di<TResult>(str2, str, j), (Executor) C26890h.m65003a());
    }

    public void onRequestPermissionsResult(int i, String[] strArr, int[] iArr) {
        C47937a.m103720a((Activity) getActivity(), i, strArr, iArr);
        super.onRequestPermissionsResult(i, strArr, iArr);
        if (this.f93486W != null) {
            this.f93486W.run();
        }
    }

    /* renamed from: a */
    static final /* synthetic */ Object m82335a(String str, String str2, long j) throws Exception {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notice_type", str);
        } catch (JSONException unused) {
        }
        MobClick jsonObject = MobClick.obtain().setEventName(str2).setLabelName("follow_bottom_tab").setJsonObject(jSONObject);
        if (j > 0) {
            jsonObject.setValue(String.valueOf(j));
        }
        C26890h.onEvent(jsonObject);
        return null;
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        MainLooperOptService mainLooperOptService = (MainLooperOptService) C35857a.m80997a(MainLooperOptService.class);
        mainLooperOptService.updateRootView(viewGroup);
        mainLooperOptService.updateState(C35922a.WATCH_WINDOW_FOCUS_CHANGE);
        C32981c cVar = this.f93485V;
        C52711k.m112240b(this, "fragment");
        C52711k.m112240b(layoutInflater, "inflater");
        C33008f fVar = cVar.f85698a;
        C52711k.m112240b(this, "fragment");
        View view = ((X2CFragmentMainPage) C35857a.m81002b(X2CFragmentMainPage.class)).getView(getContext(), R.layout.bbq);
        fVar.f85728a = (FragmentTabHost) view.findViewById(R.id.bjx);
        FragmentTabHost fragmentTabHost = fVar.f85728a;
        if (fragmentTabHost != null) {
            fragmentTabHost.setHideWhenTabChanged(true);
        }
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity, "fragment.activity!!");
        fVar.f85730c = C32969a.m75907a(activity);
        C52711k.m112236a((Object) view, "view");
        return view;
    }

    /* access modifiers changed from: 0000 */
    /* JADX WARNING: Removed duplicated region for block: B:17:0x0039  */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x003c  */
    /* JADX WARNING: Removed duplicated region for block: B:19:0x003f  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final /* synthetic */ java.lang.Object mo75538a(java.lang.String r4, java.lang.String r5, java.lang.String r6) throws java.lang.Exception {
        /*
            r3 = this;
            java.lang.String r0 = ""
            int r1 = r4.hashCode()
            r2 = -1382453013(0xffffffffad9970eb, float:-1.7444232E-11)
            if (r1 == r2) goto L_0x002a
            r2 = 2223327(0x21ecdf, float:3.115545E-39)
            if (r1 == r2) goto L_0x0020
            r2 = 2614219(0x27e3cb, float:3.663301E-39)
            if (r1 == r2) goto L_0x0016
            goto L_0x0034
        L_0x0016:
            java.lang.String r1 = "USER"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0034
            r4 = 2
            goto L_0x0035
        L_0x0020:
            java.lang.String r1 = "HOME"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0034
            r4 = 0
            goto L_0x0035
        L_0x002a:
            java.lang.String r1 = "NOTIFICATION"
            boolean r4 = r4.equals(r1)
            if (r4 == 0) goto L_0x0034
            r4 = 1
            goto L_0x0035
        L_0x0034:
            r4 = -1
        L_0x0035:
            switch(r4) {
                case 0: goto L_0x003f;
                case 1: goto L_0x003c;
                case 2: goto L_0x0039;
                default: goto L_0x0038;
            }
        L_0x0038:
            goto L_0x0043
        L_0x0039:
            java.lang.String r0 = "personal_homepage"
            goto L_0x0043
        L_0x003c:
            java.lang.String r0 = "message"
            goto L_0x0043
        L_0x003f:
            com.ss.android.ugc.aweme.homepage.api.data.MainPageDataViewModel r4 = r3.f93475K
            java.lang.String r0 = r4.f85662b
        L_0x0043:
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r1 = "previous_page"
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r1, r0)
            java.lang.String r0 = "enter_method"
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r0, r6)
            java.util.Map<java.lang.String, java.lang.String> r4 = r4.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r4)
            r4 = 0
            return r4
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.main.MainPageFragment.mo75538a(java.lang.String, java.lang.String, java.lang.String):java.lang.Object");
    }
}
