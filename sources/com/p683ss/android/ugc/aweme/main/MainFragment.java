package com.p683ss.android.ugc.aweme.main;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.Intent;
import android.graphics.Color;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.PagerAdapter;
import android.support.p030v4.view.ViewPager.C0997e;
import android.support.p043v7.app.C1160b.C1161a;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnLayoutChangeListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.ImageView.ScaleType;
import android.widget.LinearLayout;
import com.bytedance.apm.C8936b;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.common.p1146d.C18898c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import com.p683ss.android.ugc.aweme.base.p1404a.p1405a.C23393g;
import com.p683ss.android.ugc.aweme.base.p1411c.C23488g;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimatedImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.CustomInterceptTouchEventFrameLayout;
import com.p683ss.android.ugc.aweme.base.p1420ui.FlippableViewPager;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.captcha.C24483a;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26216b;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26224g;
import com.p683ss.android.ugc.aweme.commercialize.symphony.C26318i;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.effect.C29094ad;
import com.p683ss.android.ugc.aweme.experiment.RecommendSuperAccountExperiment;
import com.p683ss.android.ugc.aweme.experiment.ShowReportButtonExperiment;
import com.p683ss.android.ugc.aweme.feed.activity.GlobalAcViewModel;
import com.p683ss.android.ugc.aweme.feed.activity.GlobalAcViewModel.C29986b;
import com.p683ss.android.ugc.aweme.feed.experiment.C30220a;
import com.p683ss.android.ugc.aweme.feed.experiment.C30224d;
import com.p683ss.android.ugc.aweme.feed.experiment.C30225e;
import com.p683ss.android.ugc.aweme.feed.experiment.FollowLiveSkylightExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.MainFragmentHiddenChangedSettings;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30327ar;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30340i;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30346o;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30750af;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30986f;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C31143x;
import com.p683ss.android.ugc.aweme.feed.panel.C30598af;
import com.p683ss.android.ugc.aweme.feed.service.C30688b;
import com.p683ss.android.ugc.aweme.festival.christmas.C31361b;
import com.p683ss.android.ugc.aweme.festival.christmas.FestivalHomePageView;
import com.p683ss.android.ugc.aweme.festival.p1739a.C31351d;
import com.p683ss.android.ugc.aweme.follow.experiment.RecNumExperiment;
import com.p683ss.android.ugc.aweme.global.config.settings.pojo.UgAwemeActivitySetting;
import com.p683ss.android.ugc.aweme.homepage.api.data.C32968a;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.C32974c;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.C32975d;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.C32976e;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.C32969a;
import com.p683ss.android.ugc.aweme.homepage.experiment.HomePageSearchButtonExperiment;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C32998c;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C32999d.C33000a;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C33001e;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C33001e.C33002a;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C33001e.C33003b;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C33001e.C33004c;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C33001e.C33005d;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C33001e.C33006e;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C33001e.C33007f;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.C33013g;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.experiment.FollowTabNumberDotExperiment;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.experiment.SpecialTopicEntry;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.experiment.SpecialTopicEntrySettings;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.inflate.PreDrawableInflate;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.inflate.X2CFragmentMain;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.p1802a.C32993a;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.task.C33014a;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.view.C33041ag;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.view.MainTabStrip;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.view.MainTabStrip.C33028a;
import com.p683ss.android.ugc.aweme.homepage.p1801ui.view.MainTabStrip.C33029b;
import com.p683ss.android.ugc.aweme.journey.C35781s;
import com.p683ss.android.ugc.aweme.language.C35836g;
import com.p683ss.android.ugc.aweme.language.C35837h;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.lego.C35894d;
import com.p683ss.android.ugc.aweme.lego.C35896f;
import com.p683ss.android.ugc.aweme.lego.C35898h;
import com.p683ss.android.ugc.aweme.lego.LegoTask;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.login.p1637a.C27954a;
import com.p683ss.android.ugc.aweme.main.experiment.C36645a;
import com.p683ss.android.ugc.aweme.main.experiment.ForYouTranslationsExperiment;
import com.p683ss.android.ugc.aweme.main.experiment.MainTabStripSwipeSwitchExperiment;
import com.p683ss.android.ugc.aweme.main.guide.C36656b;
import com.p683ss.android.ugc.aweme.main.guide.C36659d;
import com.p683ss.android.ugc.aweme.main.p1942e.C36621d;
import com.p683ss.android.ugc.aweme.main.p1942e.C36622e;
import com.p683ss.android.ugc.aweme.main.p1944g.C36654a;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p683ss.android.ugc.aweme.message.p1949b.C36782d;
import com.p683ss.android.ugc.aweme.money.growth.C37164d.C37165a;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notice.api.bean.C38041h;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1436bi.C23827a.C23828a;
import com.p683ss.android.ugc.aweme.p1468bu.C24076h;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47450c;
import com.p683ss.android.ugc.aweme.pendant.C38592d;
import com.p683ss.android.ugc.aweme.protection.C40869c;
import com.p683ss.android.ugc.aweme.qrcode.C41000d;
import com.p683ss.android.ugc.aweme.report.C41201a;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import com.p683ss.android.ugc.aweme.search.model.C41437b;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a.C42247b;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43890d;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43891e;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45427bj;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.p683ss.android.ugc.aweme.utils.C47687av;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.trill.app.TrillApplication;
import com.ss.android.ugc.trill.R;
import java.io.File;
import java.lang.ref.WeakReference;
import java.util.Calendar;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.main.MainFragment */
public class MainFragment extends C23526a implements C33029b, C36664i {

    /* renamed from: A */
    private String f93427A;

    /* renamed from: B */
    private C24483a f93428B;

    /* renamed from: C */
    private boolean f93429C = false;

    /* renamed from: a */
    public int f93430a = 1;

    /* renamed from: b */
    AnimationImageView f93431b;

    /* renamed from: c */
    AnimatedImageView f93432c;

    /* renamed from: d */
    ImageView f93433d;

    /* renamed from: e */
    ImageView f93434e;

    /* renamed from: j */
    FestivalHomePageView f93435j;

    /* renamed from: k */
    C33013g f93436k;

    /* renamed from: l */
    public boolean f93437l = false;

    /* renamed from: m */
    C36469a f93438m = new C36469a(this);
    ViewGroup mFlContainerStoryPanel;
    CustomInterceptTouchEventFrameLayout mFlContentContainer;
    ViewGroup mFlRootContainer;
    FrameLayout mLiveSquareEntrance;
    ImageView mLiveSquareEntranceImg;
    MainTabStrip mPagerTabStrip;
    FrameLayout mRlTabContainer;
    View mStatusBarView;
    SwipeRefreshLayout mSwipeRefreshLayoutWhenStoryOpen;
    AnimatedImageView mTeenageSpecialTopicEnterView;
    View mTeenagerModeTitleBarStub;
    LinearLayout mTitleBarContainer;
    ImageView mTitleShadow;
    View mVTabBg;
    FlippableViewPager mViewPager;
    ViewStub mVolumeBtnStub;
    ViewStub mXmasTreeViewStub;

    /* renamed from: n */
    protected C42245a f93439n;

    /* renamed from: o */
    public C32968a f93440o;

    /* renamed from: p */
    public ScrollSwitchStateManager f93441p;

    /* renamed from: q */
    HomePageDataViewModel f93442q;

    /* renamed from: r */
    boolean f93443r = true;

    /* renamed from: s */
    boolean f93444s = false;

    /* renamed from: t */
    boolean f93445t = false;

    /* renamed from: u */
    C30753ai f93446u;

    /* renamed from: v */
    boolean f93447v = false;

    /* renamed from: w */
    public boolean f93448w = false;

    /* renamed from: x */
    boolean f93449x = false;

    /* renamed from: y */
    private C47687av f93450y = new C47687av(600) {
        /* renamed from: a */
        public final void mo59929a(View view) {
            MainFragment.this.mo75509i();
        }
    };

    /* renamed from: z */
    private C32998c f93451z = new C32998c();

    /* renamed from: com.ss.android.ugc.aweme.main.MainFragment$MobDotTask */
    class MobDotTask implements LegoTask {
        public C35896f process() {
            return C35894d.m81063a(this);
        }

        public C35898h type() {
            return C35898h.BOOT_FINISH;
        }

        private MobDotTask() {
        }

        public void run(Context context) {
            MainFragment.m82264a("follow_notice_show", "yellow_dot");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.main.MainFragment$a */
    static class C36469a extends C36644ej<MainFragment> {
        C36469a(MainFragment mainFragment) {
            super(mainFragment);
        }

        /* access modifiers changed from: protected */
        /* renamed from: a */
        public final /* bridge */ /* synthetic */ void mo75537a(Object obj) {
            MainFragment mainFragment = (MainFragment) obj;
            if (mainFragment != null) {
                C18842a.m45933a(mainFragment.f93438m, (int) 120000);
            }
        }
    }

    /* renamed from: t */
    private static String m82274t() {
        return "homepage_fresh";
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: f */
    public final C32968a mo75506f() {
        return this.f93440o;
    }

    /* renamed from: g */
    public final String mo75507g() {
        return this.f93427A;
    }

    public void onPause() {
        super.onPause();
    }

    public void onViewCreated(View view, Bundle bundle) {
        String[] strArr;
        int i;
        String str;
        String[] stringArray;
        View view2 = view;
        super.onViewCreated(view, bundle);
        C35781s.m80912a("MainFragment onViewCreated");
        this.f93441p = ScrollSwitchStateManager.m75876a(getActivity());
        this.f93442q = HomePageDataViewModel.m75866a(getActivity());
        this.mPagerTabStrip.setEnableAnimation(false);
        if (VERSION.SDK_INT >= 19) {
            Object value = ((PreDrawableInflate) C35857a.m81002b(PreDrawableInflate.class)).getValue("status_bar_height");
            if (value instanceof Integer) {
                this.mStatusBarView.getLayoutParams().height = ((Integer) value).intValue();
            } else {
                this.mStatusBarView.getLayoutParams().height = C11065a.m22390a((Context) getActivity());
            }
        }
        C32998c cVar = this.f93451z;
        C52711k.m112240b(this, "fragment");
        FragmentActivity fragmentActivity = null;
        cVar.f85719a = view2 != null ? (MainTabStrip) view2.findViewById(R.id.bvy) : null;
        MainTabStrip mainTabStrip = cVar.f85719a;
        C52711k.m112240b(this, "fragment");
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity, "fragment.activity!!");
        C33001e.f85726c = C32969a.m75907a(activity);
        Context context = getContext();
        C0654k childFragmentManager = getChildFragmentManager();
        C52711k.m112236a((Object) childFragmentManager, "fragment.childFragmentManager");
        C32993a fVar = new C33007f();
        C52711k.m112240b(this, "mainFragment");
        C52711k.m112240b(childFragmentManager, "fm");
        C33001e.f85724a = new C33013g(this, context, childFragmentManager, fVar);
        FlippableViewPager flippableViewPager = view2 != null ? (FlippableViewPager) view2.findViewById(R.id.ds2) : null;
        C33001e.f85725b = flippableViewPager;
        if (flippableViewPager != null) {
            flippableViewPager.setAdapter(C33001e.f85724a);
        }
        FlippableViewPager flippableViewPager2 = C33001e.f85725b;
        if (flippableViewPager2 != null) {
            flippableViewPager2.f62942g = true;
        }
        FlippableViewPager flippableViewPager3 = C33001e.f85725b;
        C52711k.m112240b(this, "mainFragment");
        if (mainTabStrip == null) {
            C52711k.m112234a();
        }
        Context context2 = getContext();
        if (context2 == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) context2, "mainFragment.context!!");
        C52711k.m112240b(context2, "context");
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf isShowNearBy = inst.getIsShowNearBy();
        C52711k.m112236a((Object) isShowNearBy, "SharePrefCache.inst().isShowNearBy");
        Object d = isShowNearBy.mo47782d();
        C52711k.m112236a(d, "SharePrefCache.inst().isShowNearBy.cache");
        if (((Boolean) d).booleanValue()) {
            strArr = context2.getResources().getStringArray(R.array.ac);
            C52711k.m112236a((Object) strArr, "context.resources.getStr…(R.array.top_tabs_nearby)");
        } else {
            strArr = context2.getResources().getStringArray(R.array.aa);
            C52711k.m112236a((Object) strArr, "context.resources.getStringArray(R.array.top_tabs)");
        }
        if (C10181b.m20511a().mo18172a(ForYouTranslationsExperiment.class, true, "for_you_new_translations", 31744, false)) {
            SharePrefCache inst2 = SharePrefCache.inst();
            C52711k.m112236a((Object) inst2, "SharePrefCache.inst()");
            C23051bf isShowNearBy2 = inst2.getIsShowNearBy();
            C52711k.m112236a((Object) isShowNearBy2, "SharePrefCache.inst().isShowNearBy");
            Object d2 = isShowNearBy2.mo47782d();
            C52711k.m112236a(d2, "SharePrefCache.inst().isShowNearBy.cache");
            if (((Boolean) d2).booleanValue()) {
                stringArray = context2.getResources().getStringArray(R.array.ad);
                C52711k.m112236a((Object) stringArray, "context.resources.getStr…y.top_tabs_nearby_4_i18n)");
            } else {
                stringArray = context2.getResources().getStringArray(R.array.ab);
                C52711k.m112236a((Object) stringArray, "context.resources.getStr…(R.array.top_tabs_4_i18n)");
            }
            strArr = stringArray;
        }
        mainTabStrip.setTitle(strArr);
        View findViewById = view2 != null ? view2.findViewById(R.id.el7) : null;
        if (flippableViewPager3 == null) {
            C52711k.m112234a();
        }
        mainTabStrip.mo69961a(flippableViewPager3, findViewById, MainTabStripSwipeSwitchExperiment.m82550a());
        PagerAdapter adapter = flippableViewPager3.getAdapter();
        mainTabStrip.setTabMode((adapter == null || adapter.getCount() != 2) ? 6 : 5);
        if (this instanceof C33029b) {
            mainTabStrip.setTabOnClickListener(this);
        }
        if (MainTabStripSwipeSwitchExperiment.m82550a()) {
            ViewTreeObserver viewTreeObserver = mainTabStrip.getViewTreeObserver();
            if (viewTreeObserver != null) {
                viewTreeObserver.addOnGlobalLayoutListener(new C33000a(viewTreeObserver, viewTreeObserver, mainTabStrip, findViewById));
            }
        }
        C52711k.m112240b(this, "fragment");
        FlippableViewPager flippableViewPager4 = C33001e.f85725b;
        if (flippableViewPager4 != null) {
            flippableViewPager4.mo2957a((C0997e) new C33002a());
        }
        ScrollSwitchStateManager scrollSwitchStateManager = C33001e.f85726c;
        if (scrollSwitchStateManager != null) {
            C32976e bVar = new C33003b();
            C52711k.m112240b(bVar, "dataStream");
            scrollSwitchStateManager.f85680m = bVar;
        }
        ScrollSwitchStateManager scrollSwitchStateManager2 = C33001e.f85726c;
        if (scrollSwitchStateManager2 != null) {
            FragmentActivity activity2 = getActivity();
            if (activity2 == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) activity2, "fragment.activity!!");
            C0184k kVar = activity2;
            C0199s sVar = C33004c.f85727a;
            C52711k.m112240b(kVar, "owner");
            C52711k.m112240b(sVar, "observer");
            scrollSwitchStateManager2.f85681n.observe(kVar, sVar);
        }
        ScrollSwitchStateManager scrollSwitchStateManager3 = C33001e.f85726c;
        if (scrollSwitchStateManager3 != null) {
            C32974c dVar = new C33005d();
            C52711k.m112240b(dVar, "dataStreamBridge");
            scrollSwitchStateManager3.f85682o.mo69886a(dVar);
        }
        ScrollSwitchStateManager scrollSwitchStateManager4 = C33001e.f85726c;
        if (scrollSwitchStateManager4 != null) {
            C32975d eVar = new C33006e();
            C52711k.m112240b(eVar, "dataStream");
            scrollSwitchStateManager4.f85683p = eVar;
        }
        this.mViewPager = C33001e.f85725b;
        this.mViewPager.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C30220a aVar = C30220a.f78947a;
                C36542bw bwVar = new C36542bw(i3, i, i2, i4, i5, i6, i7, i8);
                aVar.mo60570c(bwVar);
            }
        });
        this.f93436k = (C33013g) C33001e.f85724a;
        this.mPagerTabStrip = this.f93451z.f85719a;
        ScrollSwitchStateManager scrollSwitchStateManager5 = this.f93441p;
        FragmentActivity activity3 = getActivity();
        C36539bt btVar = new C36539bt(this);
        C52711k.m112240b(activity3, "owner");
        C52711k.m112240b(btVar, "observer");
        scrollSwitchStateManager5.f85679l.observe(activity3, btVar);
        ScrollSwitchStateManager scrollSwitchStateManager6 = this.f93441p;
        FragmentActivity activity4 = getActivity();
        C36540bu buVar = new C36540bu(this);
        C52711k.m112240b(activity4, "owner");
        C52711k.m112240b(buVar, "observer");
        scrollSwitchStateManager6.f85678k.observe(activity4, buVar);
        if (!((Boolean) SharePrefCache.inst().getIsChangeFollowTab().mo47782d()).booleanValue() || !C20902b.m53242a().isLogin()) {
            this.f93445t = true;
            i = 1;
        } else {
            i = 0;
        }
        this.f93441p.mo69855a(i, false);
        this.f93442q.f85658l = this.mViewPager.getCurrentItemCompat();
        this.mSwipeRefreshLayoutWhenStoryOpen.setOnRefreshListener(new C23596b() {
            /* renamed from: a */
            public final void mo47048a() {
                C30750af afVar = (C30750af) MainFragment.this.f93436k.mo69929a();
                if (afVar != null) {
                    afVar.mo59855d_(false);
                }
            }
        });
        this.mSwipeRefreshLayoutWhenStoryOpen.setEnabled(false);
        C36512b.m82421a().mo75641a(false);
        if (HomePageSearchButtonExperiment.m75921a()) {
            this.f93431b = new AnimationImageView(getContext());
            this.f93431b.setScaleType(ScaleType.CENTER_INSIDE);
            this.f93431b.setImageResource(R.drawable.cyx);
            LayoutParams layoutParams = new LayoutParams(-2, C23728o.m58241a(58.0d));
            layoutParams.gravity = 16;
            if (C10181b.m20511a().mo18168a(HomePageSearchButtonExperiment.class, true, "home_page_search_button", 31744, 0) == 1) {
                layoutParams.gravity |= 8388611;
                layoutParams.setMargins(C23728o.m58241a(16.0d), 0, 0, 0);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginStart(C23728o.m58241a(16.0d));
                }
            } else {
                layoutParams.gravity |= 8388613;
                layoutParams.setMargins(0, 0, C23728o.m58241a(16.0d), 0);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams.setMarginEnd(C23728o.m58241a(16.0d));
                }
            }
            this.f93431b.setLayoutParams(layoutParams);
            this.mRlTabContainer.addView(this.f93431b);
            this.f93431b.setOnClickListener(new C36526bg(this));
        } else if (C36645a.m82553a() == 2) {
            this.f93431b = new AnimationImageView(getContext());
            int a = C23728o.m58241a(9.0d);
            this.f93431b.setPadding(a, a, a, a);
            this.f93431b.setScaleType(ScaleType.CENTER_INSIDE);
            this.f93431b.setImageResource(R.drawable.cyw);
            LayoutParams layoutParams2 = new LayoutParams(C23728o.m58241a(55.0d), C23728o.m58241a(55.0d));
            layoutParams2.setMargins(0, 0, C23728o.m58241a(6.0d), 0);
            if (VERSION.SDK_INT >= 17) {
                layoutParams2.setMarginEnd(C23728o.m58241a(6.0d));
            }
            layoutParams2.gravity = 16;
            layoutParams2.gravity |= 8388613;
            this.f93431b.setLayoutParams(layoutParams2);
            this.mRlTabContainer.addView(this.f93431b);
            this.f93431b.setOnClickListener(new C36507av(this));
        }
        SpecialTopicEntry s = m82273s();
        if (s != null && s.getEnable() && !TextUtils.isEmpty(s.getLandingRoute()) && !TextUtils.isEmpty(s.getIconUrl()) && (!C47915gg.m103651b() || s.getChildViewable())) {
            this.f93432c = new AnimatedImageView(getContext());
            this.f93432c.setScaleType(ScaleType.CENTER_INSIDE);
            C23515d.m57677a((RemoteImageView) this.f93432c, s.getIconUrl());
            double d3 = (double) (C33041ag.f85834a ? 56 : 40);
            LayoutParams layoutParams3 = new LayoutParams(C23728o.m58241a(d3), C23728o.m58241a(d3));
            layoutParams3.gravity = 16;
            if (C10181b.m20511a().mo18168a(HomePageSearchButtonExperiment.class, true, "home_page_search_button", 31744, 0) == 2) {
                layoutParams3.gravity |= 8388611;
                layoutParams3.setMargins(C23728o.m58241a(8.0d), 0, 0, 0);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams3.setMarginStart(C23728o.m58241a(8.0d));
                }
            } else {
                layoutParams3.gravity = 8388613 | layoutParams3.gravity;
                layoutParams3.setMargins(0, 0, C23728o.m58241a(8.0d), 0);
                if (VERSION.SDK_INT >= 17) {
                    layoutParams3.setMarginEnd(C23728o.m58241a(8.0d));
                }
            }
            this.f93432c.setLayoutParams(layoutParams3);
            this.mRlTabContainer.addView(this.f93432c);
            C26890h.m65011a("topic_entrance_show", C23089d.m56640a().mo47829a("enter_from", (this.mViewPager == null || this.mViewPager.getCurrentItemCompat() != 0) ? "homepage_hot" : "homepage_follow").mo47829a("type", s.getEventName()).mo47829a("url", s.getLandingRoute()).f61491a);
            this.f93432c.setOnClickListener(new C36535bp(this, s));
        }
        if (C41000d.m90627a().mo83501b().booleanValue()) {
            this.f93433d = new ImageView(getContext());
            int a2 = C23728o.m58241a(12.0d);
            this.f93433d.setPadding(a2, a2, a2, a2);
            this.f93433d.setImageResource(R.drawable.afx);
            LayoutParams layoutParams4 = new LayoutParams(C23728o.m58241a(44.0d), C23728o.m58241a(44.0d));
            layoutParams4.gravity = 8388629;
            this.f93433d.setLayoutParams(layoutParams4);
            this.mRlTabContainer.addView(this.f93433d);
            this.f93433d.setOnClickListener(new C36537br(this));
        }
        this.f93444s = C10181b.m20511a().mo18168a(ShowReportButtonExperiment.class, true, "feedback_report_ui_display", 31744, 0) == ShowReportButtonExperiment.f77272ON;
        if (this.f93444s && this.f93445t) {
            this.f93434e = new ImageView(getContext());
            this.f93434e.setScaleType(ScaleType.CENTER_INSIDE);
            this.f93434e.setImageResource(R.drawable.a5n);
            LayoutParams layoutParams5 = new LayoutParams(C23728o.m58241a(44.0d), C23728o.m58241a(44.0d));
            layoutParams5.setMargins(0, 0, C23728o.m58241a(6.0d), 0);
            if (VERSION.SDK_INT >= 17) {
                layoutParams5.setMarginEnd(C23728o.m58241a(6.0d));
            }
            layoutParams5.gravity = 8388629;
            this.f93434e.setLayoutParams(layoutParams5);
            this.mRlTabContainer.addView(this.f93434e);
            this.f93434e.setOnClickListener(new OnClickListener() {
                public final void onClick(View view) {
                    ClickInstrumentation.onClick(view);
                    MainFragment mainFragment = MainFragment.this;
                    Aweme a = AwemeChangeCallBack.m82601a(mainFragment.getActivity());
                    if (!mainFragment.f93448w && mainFragment.f93445t && a != null) {
                        mainFragment.f93448w = true;
                        ObjectAnimator duration = ObjectAnimator.ofFloat(mainFragment.f93434e, View.SCALE_X, new float[]{1.0f, 1.2f}).setDuration(150);
                        ObjectAnimator duration2 = ObjectAnimator.ofFloat(mainFragment.f93434e, View.SCALE_Y, new float[]{1.0f, 1.2f}).setDuration(150);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.play(duration).with(duration2);
                        ObjectAnimator duration3 = ObjectAnimator.ofFloat(mainFragment.f93434e, View.SCALE_X, new float[]{1.2f, 1.0f}).setDuration(150);
                        ObjectAnimator duration4 = ObjectAnimator.ofFloat(mainFragment.f93434e, View.SCALE_Y, new float[]{1.2f, 1.0f}).setDuration(150);
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.play(duration3).with(duration4);
                        AnimatorSet animatorSet3 = new AnimatorSet();
                        animatorSet3.play(animatorSet).before(animatorSet2);
                        animatorSet3.addListener(new AnimatorListenerAdapter(a) {

                            /* renamed from: a */
                            final /* synthetic */ Aweme f93462a;

                            public final void onAnimationEnd(Animator animator) {
                                MainFragment.this.f93448w = false;
                                if (!this.f93462a.isAd() || this.f93462a.getAwemeRawAd() == null || !this.f93462a.getAwemeRawAd().isReportEnable()) {
                                    C27013a.m65227a().reportAweme((Activity) MainFragment.this.getContext(), this.f93462a, this.f93462a.getAid(), this.f93462a.getAuthorUid());
                                } else {
                                    C27013a.m65227a().reportAd(MainFragment.this.getActivity(), C41201a.m90895a(this.f93462a, "creative", C29094ad.f76264a));
                                }
                            }

                            {
                                this.f93462a = r2;
                            }
                        });
                        animatorSet3.start();
                    }
                }
            });
        }
        if (C47915gg.m103651b()) {
            MainTabStrip mainTabStrip2 = this.mPagerTabStrip;
            mainTabStrip2.setVisibility(8);
            C23729p.m58257a(mainTabStrip2.f85799w, 8);
            if (HomePageSearchButtonExperiment.m75921a()) {
                C23729p.m58261a(false, this.f93431b);
            }
        }
        m82271q();
        mo75514o();
        C0013i.m18a(C36506au.f93576a, (Executor) C24076h.m58902c());
        C23729p.m58265b(false, this.mLiveSquareEntrance);
        this.mLiveSquareEntrance.setOnClickListener(this.f93450y);
        LayoutParams layoutParams6 = (LayoutParams) this.mTitleShadow.getLayoutParams();
        layoutParams6.height = C11065a.m22390a(getContext()) + C23728o.m58241a(99.0d);
        this.mTitleShadow.setLayoutParams(layoutParams6);
        this.mTitleShadow.setVisibility(0);
        if (C20902b.m53242a().isLogin()) {
            if (C47915gg.m103651b() || TimeLockRuler.isInTeenagerModeNewVersion()) {
                this.mPagerTabStrip.mo69972e();
            } else if (C40869c.m90381k()) {
                this.mPagerTabStrip.mo69971d();
            } else {
                if (C20902b.m53242a().getCurUser().getFollowingCount() >= ((Integer) SharePrefCache.inst().getFollowUserThreshold().mo47782d()).intValue()) {
                    C33014a aVar = C33014a.f85743a;
                    int i2 = C33014a.m75944a().getInt("last_tab_id", 0);
                    if (i2 == 0) {
                        this.mPagerTabStrip.mo69972e();
                    } else if (i2 == 2) {
                        C22574a.m55738f().mo46914a();
                        C22574a.m55738f().mo46919b();
                        this.mPagerTabStrip.mo69971d();
                    } else if (i2 == 1) {
                        this.mPagerTabStrip.mo69972e();
                    }
                } else {
                    this.mPagerTabStrip.mo69972e();
                }
            }
        }
        int i3 = -1;
        if (C35836g.m80971a()) {
            FragmentActivity activity5 = getActivity();
            if (activity5 != null) {
                DmtTextView dmtTextView = new DmtTextView(activity5);
                StringBuilder sb = new StringBuilder();
                sb.append(C35837h.m80980e());
                sb.append(m82270n());
                dmtTextView.setText(sb.toString());
                dmtTextView.setTextSize(14.0f);
                dmtTextView.setTextColor(-1);
                dmtTextView.setAlpha(0.6f);
                dmtTextView.setPadding(10, 10, 10, 10);
                dmtTextView.setBackgroundColor(Color.parseColor("#9915FA2C"));
                LayoutParams layoutParams7 = new LayoutParams(-2, -2);
                if (C10181b.m20511a().mo18168a(HomePageSearchButtonExperiment.class, true, "home_page_search_button", 31744, 0) == 2) {
                    layoutParams7.gravity = 8388629;
                    layoutParams7.rightMargin = (int) C9432q.m18687b((Context) activity5, 20.0f);
                } else {
                    layoutParams7.gravity = 8388627;
                    layoutParams7.leftMargin = (int) C9432q.m18687b((Context) activity5, 20.0f);
                }
                this.mRlTabContainer.addView(dmtTextView, layoutParams7);
                dmtTextView.setOnClickListener(new C36509ax(this, dmtTextView));
                dmtTextView.setOnLongClickListener(new C36510ay(this));
            }
        }
        this.mPagerTabStrip.setEnableAnimation(true);
        if (getActivity() != null) {
            this.f93439n = C42245a.m92680a((Context) getActivity());
            this.f93439n.mo86219e(new C42247b() {
                /* renamed from: a */
                public final void mo75532a() {
                    if (MainFragment.this.mTitleBarContainer != null) {
                        MainFragment.this.mTitleBarContainer.setAlpha(1.0f);
                    }
                }

                /* renamed from: b */
                public final void mo75533b() {
                    if (MainFragment.this.mTitleBarContainer != null) {
                        MainFragment.this.mTitleBarContainer.setAlpha(0.5f);
                    }
                }
            });
            C36538bs bsVar = new C36538bs(this);
            C52711k.m112240b(bsVar, "r");
            if (C30224d.m70966a()) {
                bsVar.run();
            }
        }
        Bundle arguments = getArguments();
        if (arguments != null) {
            i3 = arguments.getInt("tab", -1);
        }
        if (i3 >= 0) {
            if (this.f93436k.mo69930b(i3) == 1) {
                mo75513m();
                C32968a aVar2 = new C32968a();
                if (getActivity() instanceof MainActivity) {
                    C32968a aVar3 = this.f93442q.f85648b;
                    aVar2.f85663a = aVar3.mo69850a();
                    aVar2.f85664b = aVar3.mo69851b();
                    aVar2.f85665c = aVar3.mo69852c();
                }
                this.f93440o = aVar2;
                if (!C20902b.m53242a().isLogin()) {
                    FragmentActivity activity6 = getActivity();
                    if (activity6 != null) {
                        Intent intent = activity6.getIntent();
                        if (intent != null) {
                            str = intent.getStringExtra("gd_label");
                            m82265a(str);
                        }
                    }
                    str = null;
                    m82265a(str);
                }
            }
            this.f93441p.mo69855a(i3, false);
        }
        GlobalAcViewModel a3 = GlobalAcViewModel.m70159a(requireActivity());
        FragmentActivity requireActivity = requireActivity();
        ViewGroup viewGroup = this.mFlRootContainer;
        C52711k.m112240b(this, "mainFragment");
        C52711k.m112240b(requireActivity, "activity");
        C52711k.m112240b(viewGroup, "rootLayout");
        a3.f78242a = new WeakReference<>(this);
        a3.f78243b = new WeakReference<>(viewGroup);
        a3.f78244c = new WeakReference<>(requireActivity);
        requireActivity.getLifecycle().mo324a(a3.f78248g);
        a3.f78245d.observe(requireActivity, new C29986b(a3));
        if (C37165a.m83404a()) {
            UgAwemeActivitySetting ugAwemeActivitySetting = C37165a.m83405b().f94853a;
            if (ugAwemeActivitySetting != null) {
                WeakReference<FragmentActivity> weakReference = a3.f78244c;
                if ((weakReference != null ? (FragmentActivity) weakReference.get() : null) != null) {
                    WeakReference<ViewGroup> weakReference2 = a3.f78243b;
                    if ((weakReference2 != null ? (ViewGroup) weakReference2.get() : null) != null) {
                        C30598af a4 = C30688b.m71970a();
                        WeakReference<ViewGroup> weakReference3 = a3.f78243b;
                        View view3 = weakReference3 != null ? (ViewGroup) weakReference3.get() : null;
                        if (view3 == null) {
                            C52711k.m112234a();
                        }
                        View view4 = view3;
                        WeakReference<FragmentActivity> weakReference4 = a3.f78244c;
                        FragmentActivity fragmentActivity2 = weakReference4 != null ? (FragmentActivity) weakReference4.get() : null;
                        if (fragmentActivity2 == null) {
                            C52711k.m112234a();
                        }
                        a3.f78246e = a4.mo62785a(view4, fragmentActivity2, ugAwemeActivitySetting);
                        if (a3.f78246e != null) {
                            Boolean bool = (Boolean) a3.f78245d.getValue();
                            if (bool == null) {
                                bool = Boolean.valueOf(true);
                            }
                            bool.booleanValue();
                        }
                        C38592d dVar2 = a3.f78246e;
                        if (dVar2 != null) {
                            WeakReference<FragmentActivity> weakReference5 = a3.f78244c;
                            if (weakReference5 != null) {
                                fragmentActivity = (FragmentActivity) weakReference5.get();
                            }
                            dVar2.mo78529a((Context) fragmentActivity);
                        }
                    }
                }
            }
        } else {
            C37165a.m83405b().f94854b.add(a3.f78247f);
        }
    }

    /* renamed from: a */
    public final boolean mo75495a(boolean z, String str) {
        if (!(this.f93436k == null || this.mViewPager == null)) {
            C30750af afVar = (C30750af) this.f93436k.mo69929a();
            if (afVar != null) {
                switch (this.mViewPager.getCurrentItemCompat()) {
                    case 0:
                        mo75513m();
                        C18898c.m46009a(getContext(), str, "homepage_follow");
                        break;
                    case 1:
                        C18898c.m46009a(getContext(), str, "homepage_hot");
                        break;
                    case 2:
                        C18898c.m46009a(getContext(), str, m82274t());
                        break;
                }
                return afVar.mo59855d_(z);
            }
        }
        return false;
    }

    /* renamed from: h */
    public final String mo75508h() {
        return this.mPagerTabStrip.getEnterFollowNoticeType();
    }

    /* renamed from: d */
    public final boolean mo75504d() {
        FlippableViewPager flippableViewPager = this.mViewPager;
        if (flippableViewPager == null || flippableViewPager.getCurrentItemCompat() != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final C30750af mo75499c() {
        if (this.f93436k == null) {
            return null;
        }
        return (C30750af) this.f93436k.mo69929a();
    }

    /* renamed from: l */
    public final boolean mo75512l() {
        C30750af k = mo75499c();
        if (k == null) {
            return false;
        }
        return k instanceof C31143x;
    }

    public void onDestroy() {
        super.onDestroy();
        C47718bf.m103291d(this);
        C52711k.m112240b(this, "fragment");
        C33001e.f85724a = null;
    }

    /* renamed from: n */
    static String m82270n() {
        String str = "";
        if (C11010c.m22292m() == 1) {
            return " (T)";
        }
        if (C11010c.m22292m() == 2) {
            return " (M)";
        }
        return str;
    }

    /* renamed from: q */
    private void m82271q() {
        if (TimeLockRuler.isRuleValid() && TimeLockRuler.isInTeenagerModeNewVersion()) {
            C23729p.m58261a(false, this.mRlTabContainer);
            this.mTeenagerModeTitleBarStub.setVisibility(0);
            m82272r();
        }
    }

    /* renamed from: s */
    private static SpecialTopicEntry m82273s() {
        try {
            return (SpecialTopicEntry) C10181b.m20511a().mo18170a(SpecialTopicEntrySettings.class, true, "special_event_entrypoint", 31744, SpecialTopicEntry.class);
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: v */
    private void m82276v() {
        if (this.f93435j != null) {
            File a = C31351d.m73083a();
            if (a != null) {
                this.f93435j.mo64235a(a);
                m82268e(true);
                return;
            }
            m82268e(false);
        }
    }

    /* renamed from: w */
    private boolean m82277w() {
        if (this.f93435j != null && this.f93435j.getVisibility() == 0) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public void mo75513m() {
        this.mPagerTabStrip.mo69957a();
        if (C38046d.m85102b(5)) {
            C38046d.m85103c(5);
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        C47718bf.m103291d(this);
        C37165a.m83405b().f94854b.remove(GlobalAcViewModel.m70159a(requireActivity()).f78247f);
    }

    /* renamed from: e */
    public final boolean mo75505e() {
        if (this.f93436k == null || this.mViewPager == null || this.f93436k.mo69930b(this.mViewPager.getCurrentItemCompat()) != 1) {
            return false;
        }
        return true;
    }

    /* renamed from: i */
    public final void mo75509i() {
        if (isViewValid() && getActivity() != null) {
            if (this.f93439n == null || !this.f93439n.mo86222f()) {
                Bundle bundle = new Bundle();
                bundle.putBoolean("live.intent.extra.FROM_NEW_STYLE", true);
                C46641d.m101210a("homepage_hot");
                C36173w.m81665a().getLiveWatcherUtils().mo70090a(getContext(), bundle, "homepage_hot");
            }
        }
    }

    /* renamed from: j */
    public final void mo75510j() {
        C30750af k = mo75499c();
        if (k != null && (k instanceof C30753ai)) {
            k.f80584u = "press_back";
            k.bD_();
            C26890h.m65004a(getContext(), "click_back_fresh", "homepage_hot", 0, 0);
        }
    }

    /* renamed from: o */
    public final void mo75514o() {
        if (C31361b.m73112a()) {
            if (this.f93435j != null || this.mXmasTreeViewStub == null) {
                if (!m82277w()) {
                    m82276v();
                }
                return;
            }
            this.f93435j = (FestivalHomePageView) this.mXmasTreeViewStub.inflate();
            this.mXmasTreeViewStub = null;
            m82276v();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: p */
    public final /* synthetic */ void mo75528p() {
        this.f93439n.mo86219e(C36656b.m82569a(C36524be.f93601a));
        this.f93439n.mo86216d((C42247b) C36656b.m82569a(C36525bf.f93602a));
        this.f93439n.mo86213c((C42247b) C36656b.m82569a(C36527bh.f93604a));
        this.f93439n.mo86210b((C42247b) C36656b.m82569a(C36528bi.f93605a));
        this.f93439n.mo86204a((C42247b) C36656b.m82569a(C36529bj.f93606a));
    }

    /* renamed from: u */
    private void m82275u() {
        if (C36645a.m82553a() != 2) {
            if (!C10181b.m20511a().mo18172a(FollowTabNumberDotExperiment.class, true, "i18n_following_badge_type_number", 31744, false) || !this.f93443r) {
                if (C38046d.m85102b(5)) {
                    m82269f(-1);
                    return;
                }
                mo75513m();
            } else {
                this.f93443r = false;
                int a = C38046d.m85098a(5);
                if (a > 0) {
                    m82269f(a);
                } else {
                    mo75513m();
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo75491a() {
        if (!this.f93449x && this.f93435j != null) {
            this.f93435j.mo64234a();
        }
    }

    public void onResume() {
        super.onResume();
        if ((C36645a.m82553a() == 0 || C36645a.m82553a() == 1) && !C10181b.m20511a().mo18172a(FollowTabNumberDotExperiment.class, true, "i18n_following_badge_type_number", 31744, false)) {
            if (C38046d.m85102b(5)) {
                m82269f(-1);
            } else {
                mo75513m();
            }
        }
        if (this.f93447v && this.f93428B != null) {
            this.f93428B.mo48682a(this);
            this.f93428B = null;
            this.f93447v = false;
        }
    }

    /* renamed from: r */
    private void m82272r() {
        String str;
        SpecialTopicEntry s = m82273s();
        if (s != null && s.getEnable() && !TextUtils.isEmpty(s.getLandingRoute()) && !TextUtils.isEmpty(s.getIconUrl()) && (!C47915gg.m103651b() || s.getChildViewable())) {
            C23729p.m58265b(true, this.mTeenageSpecialTopicEnterView);
            C23515d.m57677a((RemoteImageView) this.mTeenageSpecialTopicEnterView, s.getIconUrl());
            if (this.mViewPager == null || this.mViewPager.getCurrentItemCompat() != 0) {
                str = "homepage_hot";
            } else {
                str = "homepage_follow";
            }
            C26890h.m65011a("topic_entrance_show", C23089d.m56640a().mo47829a("enter_from", str).mo47829a("type", s.getEventName()).mo47829a("url", s.getLandingRoute()).f61491a);
            this.mTeenageSpecialTopicEnterView.setOnClickListener(new C36536bq(this, s));
        }
    }

    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @C53771m
    public void onAfterLoginEvent(C27954a aVar) {
        mo75500c(1);
        m82271q();
    }

    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        C47718bf.m103290c(this);
    }

    @C53771m
    public void onFollowBubbleShowEvent(C30327ar arVar) {
        this.f93427A = arVar.f79223a;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo75490a(C0013i iVar) throws Exception {
        this.mPagerTabStrip.mo69963a(false);
        m82275u();
        return null;
    }

    public void onAttach(final Activity activity) {
        super.onAttach(activity);
        C18842a.m45933a(new Runnable() {
            public final void run() {
                if (MainFragment.this.isViewValid()) {
                    if (!AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().isPublishServiceRunning(TrillApplication.m56199a()) && (activity instanceof MainActivity)) {
                        MainFragment.this.mo75498b(false);
                    }
                }
            }
        }, 3000);
    }

    @C53771m
    public void onSwipeRefreshInMainFragmentEvent(C36621d dVar) {
        if (this.mSwipeRefreshLayoutWhenStoryOpen != null) {
            dVar.mo48682a(this.mSwipeRefreshLayoutWhenStoryOpen);
        }
    }

    /* renamed from: e */
    private int m82267e(int i) {
        if (TimeLockRuler.isInTeenagerModeNewVersion() && i == 0 && this.mViewPager.getCurrentItemCompat() == 1) {
            return this.mViewPager.getCurrentItemCompat();
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public Fragment mo75496b(int i) {
        try {
            Object obj = this.f93436k.f85735c.get(i);
            C52711k.m112236a(obj, "mFragments.get(position)");
            return (Fragment) obj;
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: c */
    public final void mo75500c(int i) {
        int i2 = i * 2;
        if (this.mViewPager != null) {
            int e = m82267e(i2);
            if (this.mViewPager.getCurrentItemCompat() != e) {
                mo75503d(true);
                this.f93441p.mo69855a(e, false);
            }
        }
    }

    @C53771m
    public void onHideUploadRecoverEvent(C43890d dVar) {
        boolean z = dVar.f111146a;
        if (isViewValid()) {
            AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().hideUploadRecoverWindow(getContext(), z);
        }
    }

    @C53771m
    public void onUserLoginSuccessfully(C23488g gVar) {
        C23729p.m58265b(false, this.mLiveSquareEntrance);
        C36173w.m81665a().getLiveWatcherUtils().mo70087a();
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void toggleReportButton(C26318i iVar) {
        int i;
        if (this.f93434e != null) {
            ImageView imageView = this.f93434e;
            if (this.f93434e.getVisibility() == 0) {
                i = 8;
            } else {
                i = 0;
            }
            imageView.setVisibility(i);
        }
    }

    /* renamed from: a */
    private boolean m82265a(String str) {
        String str2;
        if (C20902b.m53242a().isLogin()) {
            return false;
        }
        if (this.mViewPager.getCurrentItemCompat() == 1) {
            str2 = "homepage_hot";
        } else if (this.mViewPager.getCurrentItemCompat() == 2) {
            str2 = "homepage_fresh";
        } else {
            str2 = "";
        }
        C27965f.m66725a((Fragment) this, str2, str, (Bundle) null, (C23505g) new C23505g() {
            /* renamed from: a */
            public final void mo46279a() {
                boolean z;
                if (MainFragment.this.mViewPager != null && MainFragment.this.isViewValid()) {
                    MainFragment mainFragment = MainFragment.this;
                    if (MainFragment.this.mViewPager.getCurrentItemCompat() != 0) {
                        z = true;
                    } else {
                        z = false;
                    }
                    mainFragment.f93437l = z;
                    if (MainFragment.this.f93437l) {
                        C30750af afVar = (C30750af) MainFragment.this.f93436k.mo69929a();
                        if (afVar != null) {
                            afVar.mo63329f(false);
                        }
                    }
                    MainFragment.this.f93441p.mo69855a(0, false);
                }
                MainFragment.this.f93440o = null;
            }

            /* renamed from: a */
            public final void mo46280a(Bundle bundle) {
                MainFragment.this.f93440o = null;
            }
        });
        return true;
    }

    /* renamed from: d */
    private void m82266d(int i) {
        if (i == 1) {
            C18898c.m46009a(getContext(), "homepage_hot", "click");
        } else if (i == 0) {
            C18898c.m46009a(getContext(), "homepage_follow", "click");
        } else {
            if (i == 2) {
                C18898c.m46009a(getContext(), m82274t(), "click");
            }
        }
    }

    /* renamed from: f */
    private void m82269f(int i) {
        if (!this.mPagerTabStrip.mo69973f() && C10181b.m20511a().mo18168a(RecNumExperiment.class, true, "rec_num", 31744, 0) == 0) {
            C35857a.m81001b().mo74526a(new MobDotTask()).mo74527a();
        }
        this.mPagerTabStrip.mo69958a(i);
    }

    /* renamed from: b */
    public final void mo75498b(boolean z) {
        AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().showUploadRecoverIfNeed(z, getActivity());
    }

    @C53771m
    public void onAwesomeSplashEvent(C26216b bVar) {
        C26224g.m63535a(bVar.f69221a, this.f93433d);
        C26224g.m63535a(bVar.f69221a, this.mTitleBarContainer, this.f93431b);
        if (bVar.f69221a == 4 && this.f93431b != null) {
            this.f93431b.setAlpha(1.0f);
        }
    }

    @C53771m
    public void onCaptchaConsumerEvent(C24483a aVar) {
        if (aVar != null) {
            Activity b = AwemeApplication.m56200b();
            if (b != null && (b instanceof MainActivity)) {
                Fragment curFragment = ((MainActivity) b).getCurFragment();
                if (curFragment != null && (curFragment instanceof MainFragment)) {
                    aVar.mo48682a(this);
                    this.f93428B = null;
                    return;
                }
            }
            this.f93447v = true;
            this.f93428B = aVar;
        }
    }

    public void onHiddenChanged(boolean z) {
        if (this.f93436k.mo69929a() != null && !z) {
            this.f93436k.mo69929a().setUserVisibleHint(true);
        }
        if (MainFragmentHiddenChangedSettings.INSTANCE.isEnable() && (this.f93436k.mo69929a() instanceof C30986f)) {
            ((C30986f) this.f93436k.mo69929a()).mo63448c(z);
        }
        AVExternalServiceImpl.getAVServiceImpl_Monster().publishService().uploadRecoverPopViewSetVisibility(!z);
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onLiveIconEntranceEnable(C30346o oVar) {
        boolean z;
        if (!oVar.f79260a || !BaseUserService.getBaseUserService_Monster().isLogin()) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C46641d.m101221b("homepage_hot");
        }
        C23729p.m58265b(z, this.mLiveSquareEntrance);
    }

    /* renamed from: e */
    private void m82268e(boolean z) {
        if (!z) {
            this.f93435j.mo64236b();
        } else if (!this.f93449x && !this.f93429C) {
            this.f93435j.mo64234a();
            this.f93429C = true;
            C26890h.m65011a("xmas_plugin_show", new C23089d().mo47829a("enter_from", C22858c.f61207c).f61491a);
            C31361b.m73114b();
            this.f93435j.mo64237c();
            this.f93435j.setOnClickListener(new C36511az(this));
            this.f93435j.setCloseClickListener(new C36520ba(this));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo75497b(View view) {
        String str;
        String str2;
        if (this.f93439n == null || !this.f93439n.mo86222f()) {
            Aweme a = AwemeChangeCallBack.m82601a(getActivity());
            if (a != null) {
                str = a.getAid();
            } else {
                str = "";
            }
            if (this.mViewPager == null || this.mViewPager.getCurrentItemCompat() != 0) {
                str2 = "homepage_hot";
            } else {
                str2 = "homepage_follow";
            }
            String str3 = str2;
            C41434a a2 = C41434a.newBuilder().mo84113a(str3).mo84112a(1).mo84115b(str).mo84114a();
            C41440e searchFrom = new C41440e().setSearchFrom(17);
            C41431k kVar = C41431k.f105004a;
            C41437b bVar = new C41437b(getActivity(), searchFrom, a2, str3, null, null);
            kVar.launchSearchPage(bVar);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo75501c(View view) {
        if (!this.f93439n.mo86222f()) {
            ((C36606dx) C23393g.m57474a(getContext(), C36606dx.class)).mo48516b(true);
            final AnimationImageView animationImageView = this.f93431b;
            if (animationImageView != null) {
                animationImageView.animate().scaleX(0.8f).scaleY(0.8f).setDuration(80).withEndAction(new Runnable() {
                    public final void run() {
                        animationImageView.animate().scaleX(1.0f).scaleY(1.0f).setDuration(80).start();
                    }
                }).start();
            }
            C26890h.m65008a(C11010c.m22280a(), "click", "discovery", "0", "0", (JSONObject) null);
        }
    }

    /* renamed from: d */
    public final void mo75503d(boolean z) {
        if (this.f93436k != null) {
            C30750af afVar = (C30750af) this.f93436k.mo69929a();
            if (afVar != null) {
                afVar.mo63329f(true);
            }
            if (this.mPagerTabStrip != null) {
                MainTabStrip mainTabStrip = this.mPagerTabStrip;
                if (C30225e.m70970b() && C30225e.m70971c() != 1) {
                    if (mainTabStrip.f85800x != null) {
                        mainTabStrip.f85800x.dismiss();
                        mainTabStrip.f85800x = null;
                    }
                    mainTabStrip.f85802z = false;
                }
            }
        }
    }

    @C53771m
    public void onDislikeAwemeEvent(C30340i iVar) {
        if (iVar.f79251b == 1) {
            float f = 1.0f;
            if (this.mPagerTabStrip != null) {
                MainTabStrip mainTabStrip = this.mPagerTabStrip;
                if (iVar.f79250a) {
                    C45427bj.m98998a(mainTabStrip, mainTabStrip.getAlpha(), 0.0f);
                    if (mainTabStrip.f85799w != null) {
                        C45427bj.m98998a(mainTabStrip.f85799w, mainTabStrip.f85799w.getAlpha(), 0.0f);
                    }
                } else {
                    C45427bj.m98998a(mainTabStrip, mainTabStrip.getAlpha(), 1.0f);
                    if (mainTabStrip.f85799w != null) {
                        C45427bj.m98998a(mainTabStrip.f85799w, mainTabStrip.f85799w.getAlpha(), 1.0f);
                    }
                }
            }
            if (HomePageSearchButtonExperiment.m75921a() && this.f93431b != null) {
                AnimationImageView animationImageView = this.f93431b;
                float alpha = this.f93431b.getAlpha();
                if (iVar.f79250a) {
                    f = 0.0f;
                }
                C45427bj.m98998a(animationImageView, alpha, f);
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onNotificationIndicatorEvent(C38041h hVar) {
        if (isViewValid()) {
            if (hVar.mo77566b(5)) {
                m82275u();
                return;
            }
            if (hVar.mo77566b(38) && C10181b.m20511a().mo18168a(FollowLiveSkylightExperiment.class, true, "i18n_following_live_skylight_type", 31744, 0) != 0) {
                this.mPagerTabStrip.mo69963a(true);
                this.mPagerTabStrip.mo69957a();
                C0013i.m12a(120000).mo20a((C0011g<TResult, TContinuationResult>) new C36508aw<TResult,TContinuationResult>(this), C0013i.f25b);
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onTimeLineTabEvent(C36622e eVar) {
        if (isViewValid()) {
            this.f93436k.f85736d = ((Boolean) SharePrefCache.inst().getShowTimeLineTab().mo47782d()).booleanValue();
            this.f93436k.notifyDataSetChanged();
            MainTabStrip mainTabStrip = this.mPagerTabStrip;
            if (mainTabStrip.f85777a != null) {
                if (mainTabStrip.f85777a.getAdapter().getCount() > 2) {
                    mainTabStrip.setTabMode(6);
                } else {
                    mainTabStrip.setTabMode(5);
                }
                switch (mainTabStrip.f85777a.getCurrentItemCompat()) {
                    case 0:
                        mainTabStrip.mo69967b((int) R.id.d_h);
                        return;
                    case 1:
                        mainTabStrip.mo69967b((int) R.id.daa);
                        return;
                    case 2:
                        mainTabStrip.mo69967b((int) R.id.d_s);
                        break;
                }
            }
        }
    }

    /* renamed from: c */
    public final void mo75502c(boolean z) {
        String str;
        if (this.f93436k != null) {
            if (this.mPagerTabStrip != null) {
                this.mPagerTabStrip.mo69970c();
            }
            C30750af afVar = (C30750af) this.f93436k.mo69929a();
            if (afVar != null) {
                afVar.setUserVisibleHint(true);
                afVar.mo63328e(true);
            }
            SpecialTopicEntry s = m82273s();
            if (this.f93432c != null && s != null && s.getEnable() && !TextUtils.isEmpty(s.getLandingRoute()) && !TextUtils.isEmpty(s.getIconUrl()) && (!C47915gg.m103651b() || s.getChildViewable())) {
                if (this.mViewPager == null || this.mViewPager.getCurrentItemCompat() != 0) {
                    str = "homepage_hot";
                } else {
                    str = "homepage_follow";
                }
                C26890h.m65011a("topic_entrance_show", C23089d.m56640a().mo47829a("enter_from", str).mo47829a("type", s.getEventName()).mo47829a("url", s.getLandingRoute()).f61491a);
            }
        }
    }

    @C53771m
    public void onPublishStatusUpdate(C43891e eVar) {
        if (isViewValid()) {
            if (eVar.f111148b == 9 && eVar.f111152f && !eVar.f111157k && !eVar.f111158l) {
                mo75498b(eVar.f111153g);
            }
            if (eVar.f111148b == 10 && (eVar.f111150d instanceof Aweme)) {
                try {
                    Aweme aweme = (Aweme) eVar.f111150d;
                    long createTime = aweme.getCreateTime() - (Calendar.getInstance().getTimeInMillis() / 1000);
                    if (createTime < -120 || createTime > 10) {
                        C8936b.m17655a("aweme_publish_upload_create_time_error", C23088c.m56631a().mo47824a("server_create_time", String.valueOf(aweme.getCreateTime())).mo47824a("client_insert_time", String.valueOf(Calendar.getInstance().getTimeInMillis() / 1000)).mo47824a("group_id", aweme.getAid()).mo47825b());
                    }
                } catch (Exception unused) {
                }
            }
        }
    }

    @C53771m
    public void onScrollToFeedFollowGuideEvent(C36659d dVar) {
        if (dVar.f93805a) {
            if (this.mPagerTabStrip != null) {
                MainTabStrip mainTabStrip = this.mPagerTabStrip;
                if (C23729p.m58262a(mainTabStrip.f85799w) && mainTabStrip.f85779c != null && !mainTabStrip.f85779c.isRunning()) {
                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.3f});
                    ofFloat.setDuration(400);
                    ofFloat.addUpdateListener(new C33028a());
                    ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.3f, 1.0f});
                    ofFloat2.setDuration(900);
                    ofFloat2.addUpdateListener(new C33028a());
                    mainTabStrip.f85779c.play(ofFloat).before(ofFloat2);
                    mainTabStrip.f85779c.start();
                    mainTabStrip.f85779c.addListener(new AnimatorListenerAdapter() {
                        public final void onAnimationEnd(Animator animator) {
                            if (MainTabStrip.this.f85797u) {
                                MainTabStrip.this.f85779c.start();
                            }
                        }
                    });
                }
            }
        } else if (this.mPagerTabStrip != null) {
            MainTabStrip mainTabStrip2 = this.mPagerTabStrip;
            mainTabStrip2.f85797u = false;
            if (mainTabStrip2.f85779c != null && mainTabStrip2.f85779c.isRunning()) {
                mainTabStrip2.f85779c.cancel();
                mainTabStrip2.mo69959a(0, 1.0f, mainTabStrip2.f85799w);
                mainTabStrip2.mo69960a(0, 0, 1.0f);
                mainTabStrip2.mo69960a(0, 1, 1.0f);
            }
        }
    }

    /* renamed from: a */
    public final void mo75493a(boolean z) {
        if (z) {
            this.f93449x = true;
        }
        if (m82277w()) {
            this.f93435j.mo64236b();
        }
    }

    /* renamed from: a */
    public final boolean mo69994a(int i) {
        C30750af afVar = (C30750af) this.f93436k.mo69929a();
        if (afVar == null) {
            return false;
        }
        if (!(getActivity() == null || getActivity().getWindow() == null)) {
            getActivity().getWindow().getDecorView().setBackgroundColor(-1);
        }
        this.f93430a = 1;
        if (this.f93439n != null && this.f93439n.mo86222f()) {
            return true;
        }
        if (this.mViewPager.getCurrentItemCompat() != i) {
            if (i == 0) {
                mo75492a(i, 1);
                if (!MainTabStripSwipeSwitchExperiment.m82550a() && !RecommendSuperAccountExperiment.m69625b() && m82265a("click_follow_tab")) {
                    return true;
                }
            }
            if (i == 1) {
                mo75492a(i, 1);
            }
            afVar.mo63329f(false);
            m82266d(i);
            if (i == 1) {
                C18898c.m46009a(getContext(), "homepage_hot", "show");
            } else if (i == 0) {
                C18898c.m46009a(getContext(), "homepage_follow", "show");
            } else if (i == 2) {
                C18898c.m46009a(getContext(), m82274t(), "show");
            }
            if (i == 2) {
                C23828a.f63478b = "toplist_homepage_fresh";
                C22574a.m55738f().mo46914a();
                C22574a.m55738f().mo46919b();
            } else if (i == 1) {
                C23828a.f63478b = "toplist_homepage_hot";
            } else {
                C22574a.m55738f().mo46914a();
                C22574a.m55738f().mo46919b();
                C23828a.f63478b = "toplist_homepage_hot";
            }
            MainActivity mainActivity = (MainActivity) getActivity();
            if (mainActivity != null && mainActivity.isViewValid()) {
                if (i != 0) {
                    C36654a.m82565b(getActivity());
                } else {
                    C36654a.m82563a(getActivity());
                }
            }
            return false;
        }
        m82266d(i);
        if ((this.f93436k.mo69929a() instanceof C30753ai) || (this.f93436k.mo69929a() instanceof C31143x)) {
            C47718bf.m103288a(new C47450c(2));
            mo75495a(false, "refresh");
        } else {
            mo75495a(false, "refresh");
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ boolean mo75494a(View view) {
        C36782d.m82775a().mo75941d(5);
        C1161a aVar = new C1161a(getContext());
        StringBuilder sb = new StringBuilder("现金裂变test：\n");
        try {
            StringBuilder sb2 = new StringBuilder("DeepLink-activityId:");
            sb2.append(C37165a.m83405b().f94856d);
            sb.append(sb2.toString());
            if (C37165a.m83405b().f94853a != null) {
                StringBuilder sb3 = new StringBuilder("\nsetting-activityId:");
                sb3.append(C37165a.m83405b().f94853a.getActivityId());
                sb.append(sb3.toString());
            } else {
                sb.append("\nsetting-activityId: null");
            }
            StringBuilder sb4 = new StringBuilder("\nfeed弹窗是否展示过:");
            sb4.append(C37165a.m83405b().f94855c.f94846a);
            sb.append(sb4.toString());
            StringBuilder sb5 = new StringBuilder("\n弹窗素材是否已准备好:");
            sb5.append(C37165a.m83405b().mo76487a(C37165a.m83405b().f94853a.getChannelPopup().getResourceUrl()));
            sb.append(sb5.toString());
        } catch (C10174a unused) {
        }
        aVar.mo3770b((CharSequence) sb.toString());
        aVar.mo3771b((CharSequence) "重置弹窗展示标记", C36521bb.f93597a);
        aVar.mo3765a((CharSequence) "ok", C36522bc.f93598a);
        aVar.mo3775c();
        return true;
    }

    /* renamed from: a */
    public static void m82264a(String str, String str2) {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("notice_type", str2);
        } catch (JSONException unused) {
        }
        C26890h.onEvent(MobClick.obtain().setEventName(str).setLabelName("follow_bottom_tab").setJsonObject(jSONObject));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo75492a(int i, int i2) {
        String str;
        String str2;
        String str3;
        String str4;
        if (i == 0) {
            str = "enter_homepage_follow";
        } else {
            str = "enter_homepage_hot";
        }
        String str5 = str;
        String str6 = "click_follow_tab";
        if (i == 0) {
            str2 = "homepage_hot";
        } else {
            str2 = "homepage_follow";
        }
        String str7 = str2;
        if (i2 == 2) {
            str4 = "slide";
        } else if (i2 != 1) {
            str3 = str6;
            C36541bv bvVar = new C36541bv(this, str5, str3, str7, this.mPagerTabStrip.getEnterFollowNoticeType());
            C0013i.m18a((Callable<TResult>) bvVar, (Executor) C26890h.m65003a());
        } else if (i == 0) {
            str4 = "click_follow_tab";
        } else {
            str4 = "click_hot_tab";
        }
        str3 = str4;
        C36541bv bvVar2 = new C36541bv(this, str5, str3, str7, this.mPagerTabStrip.getEnterFollowNoticeType());
        C0013i.m18a((Callable<TResult>) bvVar2, (Executor) C26890h.m65003a());
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(this, "fragment");
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(this, "fragment");
        View view = ((X2CFragmentMain) C35857a.m81002b(X2CFragmentMain.class)).getView(getContext(), R.layout.bbp);
        C52711k.m112236a((Object) view, "x2CFragmentMain.getView(…age_common_fragment_main)");
        return view;
    }
}
