package com.p683ss.android.ugc.aweme.detail.p1628ui;

import android.app.Dialog;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.C23474b.C23475a;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23689d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.detail.experiment.DetailEnterAnimationTimeExperiment;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27420a;
import com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27421b;
import com.p683ss.android.ugc.aweme.detail.p1626h.C27339a;
import com.p683ss.android.ugc.aweme.detail.p1626h.C27339a.C27355a;
import com.p683ss.android.ugc.aweme.discover.C27937c;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.adapter.C30019aj;
import com.p683ss.android.ugc.aweme.feed.adapter.C30020ak;
import com.p683ss.android.ugc.aweme.feed.helper.C30386j;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30310ab;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30311ac;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30322am;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30340i;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30350s;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30358z;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30444a;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30445b;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30446c;
import com.p683ss.android.ugc.aweme.feed.p1735o.C30580a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.DisLikeAwemeLayout;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31076b;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;
import com.p683ss.android.ugc.aweme.main.C36670n;
import com.p683ss.android.ugc.aweme.main.C36671o;
import com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1402b.C23344b;
import com.p683ss.android.ugc.aweme.poi.PoiServiceImpl;
import com.p683ss.android.ugc.aweme.poi.service.IPoiService;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39797a;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.search.model.C41434a;
import com.p683ss.android.ugc.aweme.search.model.C41434a.C41435a;
import com.p683ss.android.ugc.aweme.search.model.C41437b;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45427bj;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.video.C48069o;
import com.p683ss.android.ugc.common.component.p2417a.C48521c;
import com.ss.android.ugc.trill.R;
import java.util.LinkedHashMap;
import org.greenrobot.eventbus.C53771m;

/* renamed from: com.ss.android.ugc.aweme.detail.ui.r */
public class C27514r extends C23689d implements C0199s<C23274a>, C27355a, C27489af, C30019aj, C30020ak, C30444a, C30445b, C30446c, C36671o {

    /* renamed from: a */
    protected DmtStatusView f72330a;

    /* renamed from: b */
    C30580a f72331b;

    /* renamed from: c */
    protected View f72332c;

    /* renamed from: d */
    protected FeedSwipeRefreshLayout f72333d;

    /* renamed from: e */
    protected C30669b f72334e = new C30669b();

    /* renamed from: j */
    public C27339a f72335j;

    /* renamed from: k */
    protected boolean f72336k = false;

    /* renamed from: l */
    boolean f72337l = true;

    /* renamed from: m */
    boolean f72338m;

    /* renamed from: n */
    int f72339n = 0;

    /* renamed from: o */
    protected C27419al f72340o = null;

    /* renamed from: p */
    private DisLikeAwemeLayout f72341p;

    /* renamed from: q */
    private View f72342q;

    /* renamed from: r */
    private ViewStub f72343r;

    /* renamed from: s */
    private View f72344s;

    /* renamed from: t */
    private LoadMoreFrameLayout f72345t;

    /* renamed from: u */
    private ViewStub f72346u;

    /* renamed from: v */
    private ImageView f72347v;

    /* renamed from: w */
    private ImageView f72348w;

    /* renamed from: x */
    private boolean f72349x = false;

    /* renamed from: y */
    private C36670n f72350y;

    /* renamed from: z */
    private DataCenter f72351z;

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: j */
    public final DmtStatusView mo55901j() {
        return this.f72330a;
    }

    public void onResume() {
        super.onResume();
    }

    /* renamed from: o */
    private C0184k m66140o() {
        return getActivity();
    }

    /* renamed from: p */
    private String m66141p() {
        return this.f72334e.getFrom();
    }

    /* renamed from: t */
    private int m66145t() {
        return this.f72334e.getVideoType();
    }

    /* renamed from: u */
    private String m66146u() {
        return this.f72334e.getQueryAwemeMode();
    }

    /* renamed from: v */
    private String m66147v() {
        return this.f72334e.getAid();
    }

    public final void aG_() {
        m66138a(4);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: n */
    public final /* synthetic */ void mo55947n() {
        m66137a(true);
    }

    /* renamed from: q */
    private void m66142q() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: B */
    public final SparseArray<C48521c> mo48685B() {
        SparseArray<C48521c> B = super.mo48685B();
        m66148w();
        B.append(C23475a.f62544c, this.f72335j);
        return B;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public C27339a mo55939e() {
        this.f72334e.getEventType();
        getArguments();
        return new C27339a();
    }

    /* renamed from: i */
    public final boolean mo55943i() {
        if (this.f72335j == null || !this.f72335j.mo62845aT()) {
            return false;
        }
        return true;
    }

    /* renamed from: k */
    public final Aweme mo55944k() {
        return AwemeChangeCallBack.m82601a(getActivity());
    }

    /* renamed from: l */
    public final String mo55945l() {
        return C23198ae.m56882r(AwemeChangeCallBack.m82601a(getActivity()));
    }

    /* renamed from: w */
    private void m66148w() {
        if (this.f72335j == null) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                m66136a(arguments);
            } else {
                this.f72334e.setEventType("");
            }
            this.f72335j = mo55939e();
        }
    }

    /* renamed from: c */
    public final void mo55850c() {
        BusinessComponentServiceUtils.getBusinessBridgeService();
        this.f72346u.setLayoutResource(R.layout.a9h);
        this.f72346u.inflate();
        ScrollSwitchStateManager.m75876a(getActivity()).mo69863a(false);
    }

    /* renamed from: f */
    public final void mo55940f() {
        if (this.f72341p != null) {
            this.f72341p.mo63291a(false);
            this.f72341p.setInDislikeMode(false);
            m66137a(true);
            this.f72347v.setVisibility(0);
        }
    }

    /* renamed from: g */
    public final boolean mo55941g() {
        if (this.f72340o == null || this.f72340o.isLoading() || this.f72340o.cannotLoadMore()) {
            return false;
        }
        if (this.f72340o instanceof C27421b) {
            ((C27421b) this.f72340o).setPreLoad(true);
        } else {
            this.f72335j.mo55806d(true);
        }
        return m66138a(4);
    }

    /* renamed from: h */
    public final boolean mo55942h() {
        if (this.f72340o == null || this.f72340o.isLoading() || this.f72340o.cannotLoadLatest() || !(this.f72340o instanceof C27420a)) {
            return false;
        }
        if (this.f72340o instanceof C27421b) {
            ((C27421b) this.f72340o).setPreLoad(true);
        } else {
            this.f72335j.mo55806d(true);
        }
        return m66138a(2);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: m */
    public final /* synthetic */ void mo55946m() {
        if (!C27487ad.m66093a(getActivity())) {
            C10691a.m21542b((Context) getActivity(), (int) R.string.cg1).mo19066a();
            this.f72333d.setRefreshing(false);
            return;
        }
        this.f72340o.request(2, this.f72334e, m66145t(), this.f72349x);
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f72334e.isfollowSkyLight().booleanValue()) {
            C30386j.f79442a = new LinkedHashMap();
            C30386j.f79443b = new LinkedHashMap();
        }
    }

    /* renamed from: r */
    private void m66143r() {
        int poiClassCode = this.f72334e.getPoiClassCode();
        String cityCode = this.f72334e.getCityCode();
        String districtCode = this.f72334e.getDistrictCode();
        String backendType = this.f72334e.getBackendType();
        IPoiService createIPoiServicebyMonsterPlugin = PoiServiceImpl.createIPoiServicebyMonsterPlugin();
        if (createIPoiServicebyMonsterPlugin != null) {
            Bundle bundle = new Bundle();
            bundle.putSerializable("poi_class_code", Integer.valueOf(poiClassCode));
            bundle.putString("backend_type_code", backendType);
            bundle.putString("sub_class", this.f72334e.getSubClass());
            bundle.putString("city_code", cityCode);
            bundle.putString("district_code", districtCode);
            bundle.putString("enter_from", "poi_video_leaderboard");
            bundle.putString("enter_method", "click_leaderboard_bar");
            createIPoiServicebyMonsterPlugin.openPoiRankActivity(getContext(), bundle);
            getActivity().overridePendingTransition(R.anim.f7, 0);
        }
    }

    /* renamed from: s */
    private void m66144s() {
        if (!this.f72336k) {
            if (this.f72341p.f80368m) {
                mo55940f();
            } else if (this.f72331b == null || !this.f72331b.mo62763a(new C27520u(this))) {
                m66142q();
                if (this.f72334e != null && this.f72334e.isFromAdsActivity()) {
                    int a = C10181b.m20511a().mo18168a(DetailEnterAnimationTimeExperiment.class, true, "detail_animation_time", 31744, 0);
                    if (a == 1) {
                        getActivity().overridePendingTransition(R.anim.f5, R.anim.f5);
                    } else if (a == 2) {
                        getActivity().overridePendingTransition(R.anim.f5, R.anim.f5);
                    } else {
                        getActivity().overridePendingTransition(R.anim.f6, R.anim.f6);
                    }
                }
            }
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        this.f72335j.mo55813m();
        if (this.f72340o != null) {
            this.f72340o.unInit();
        }
        C48069o.m104092a(false);
        if (C48069o.m104090L()) {
            this.f72335j.mo62781ar().mo95264A();
        }
        Aweme r = this.f72335j.mo55830r();
        String p = m66141p();
        if (r != null && p != null) {
            if (C27937c.f73358a.getMixSearchRNWebViewRefHolder().mo56350a()) {
                C27937c.f73358a.getMixSearchRNWebViewRefHolder().mo56349a(r, "exit", p);
            }
            if (BusinessComponentServiceUtils.getMediumWebViewRefHolder().mo60018a()) {
                BusinessComponentServiceUtils.getMediumWebViewRefHolder().mo60017a(r, "exit", p);
            }
            if (C27937c.f73358a.getItemListChangeViewRefHolder().mo56348a()) {
                C27937c.f73358a.getItemListChangeViewRefHolder().mo56347a(r, "exit", p);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo55938d(View view) {
        m66138a(1);
    }

    @C53771m
    public void onBlockUserEvent(C39797a aVar) {
        m66138a(1);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo55932a(View view) {
        m66143r();
        m66139b("mode_change");
    }

    @C53771m
    public void onFeedFetchEvent(C30350s sVar) {
        if (TextUtils.equals(sVar.f79262a, "from_cell_recommend")) {
            m66138a(4);
        }
    }

    /* renamed from: a */
    private void m66136a(Bundle bundle) {
        this.f72334e = (C30669b) bundle.getSerializable("feed_param");
        this.f72349x = bundle.getBoolean("extra_challenge_is_hashtag", false);
    }

    @C53771m
    public void onJump2RankList(C30358z zVar) {
        if (this.f72335j != null && !this.f72335j.f80006ax) {
            m66143r();
            m66139b("click_leaderboard_label");
        }
    }

    @C53771m
    public void onMobEnterFromEvent(C30310ab abVar) {
        if (abVar != null && this.f72350y != null && getActivity() != null) {
            HomePageDataViewModel.m75866a(getActivity()).mo69849a(abVar.f79198a);
        }
    }

    @C53771m
    public void onMobRequestIdEvent(C30311ac acVar) {
        if (acVar != null && this.f72350y != null && getActivity() != null) {
            HomePageDataViewModel.m75866a(getActivity()).f85655i = acVar.f79199a;
        }
    }

    @C53771m
    public void onScrollToDetailEvent(C30322am amVar) {
        if (amVar != null && this.f72350y != null && getActivity() != null) {
            HomePageDataViewModel.m75866a(getActivity()).mo69849a(amVar.f79216a);
        }
    }

    /* renamed from: a */
    private void m66137a(boolean z) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            C45427bj.m98998a(this.f72332c, this.f72332c.getAlpha(), 1.0f);
            C47718bf.m103288a(new C30340i(false, 2, 1, activity.hashCode()));
        }
    }

    public void setUserVisibleHint(boolean z) {
        m66148w();
        super.setUserVisibleHint(z);
        this.f72335j.mo55808f(z);
        if (z) {
            this.f72335j.mo55802c(true);
            this.f72335j.f72104j = true;
            this.f72335j.mo55833u();
            return;
        }
        this.f72335j.mo55802c(false);
        this.f72335j.f72104j = false;
    }

    /* renamed from: a */
    private boolean m66138a(int i) {
        if (this.f72340o == null || this.f72340o.isLoading()) {
            return false;
        }
        if (this.f72334e.isFromChatRoomPlaying()) {
            this.f72334e.setIsFromChatRoomPlaying(false);
            if (this.f72333d != null) {
                this.f72333d.postDelayed(new Runnable() {
                    public final void run() {
                        C27514r.this.mo55941g();
                    }
                }, 200);
            }
        }
        if (TextUtils.equals("from_local", m66146u())) {
            Aweme awemeById = C23324d.m57378a().getAwemeById(m66147v());
            if (!(awemeById == null || this.f72335j == null)) {
                this.f72335j.mo49942a(awemeById);
                return true;
            }
        }
        this.f72340o.request(i, this.f72334e, m66145t(), this.f72349x);
        return true;
    }

    /* renamed from: b */
    private void m66139b(String str) {
        C26890h.m65011a("enter_poi_leaderboard", C23089d.m56640a().mo47829a("city_info", this.f72334e.getCityCode()).mo47829a("enter_method", str).mo47829a("poi_channel", this.f72334e.getBackendType()).mo47829a("enter_from", "poi_video_leaderboard").mo47829a("previous_page", this.f72334e.getPreviousPage()).mo47829a("sub_class", this.f72334e.getSubClass()).mo47829a("district_code", this.f72334e.getDistrictCode()).f61491a);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo55937c(View view) {
        C41440e searchFrom = new C41440e().setSearchFrom(18);
        Aweme a = AwemeChangeCallBack.m82601a(getActivity());
        String str = "";
        String str2 = "";
        if (a != null) {
            str = a.getAid();
            str2 = a.getAuthorUid();
        }
        C41431k kVar = C41431k.f105004a;
        FragmentActivity activity = getActivity();
        C41435a c = C41434a.newBuilder().mo84113a("video_detail").mo84112a(2).mo84115b(str).mo84116c(str2);
        c.f105014a = this.f72334e.getEventType();
        kVar.launchSearchPage(new C41437b(activity, searchFrom, c.mo84114a()));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo55931a(float f) {
        int i;
        if (this.f72342q != null) {
            this.f72342q.setAlpha(f);
            View view = this.f72342q;
            if (f > 0.0f) {
                i = 0;
            } else {
                i = 8;
            }
            view.setVisibility(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo55936b(View view) {
        String str;
        String str2;
        this.f72335j.mo55835w();
        m66144s();
        if (this.f72334e.isShowVideoRank()) {
            C26890h.m65011a("back", C23089d.m56640a().mo47829a("enter_from", "poi_video_leaderboard").mo47829a("previous_page", this.f72334e.getEventType()).f61491a);
        }
        if (this.f72334e.isfollowSkyLight().booleanValue()) {
            String str3 = "close_following_window";
            C23089d a = C23089d.m56640a();
            String str4 = "group_id";
            if (mo55944k() == null) {
                str = "";
            } else {
                str = mo55944k().getAid();
            }
            C23089d a2 = a.mo47829a(str4, str);
            String str5 = "author_id";
            if (mo55944k() == null) {
                str2 = "";
            } else {
                str2 = mo55944k().getAuthorUid();
            }
            C26890h.m65011a(str3, a2.mo47829a(str5, str2).mo47826a("video_cnt", this.f72335j.f72106l.size()).mo47826a("author_cnt", this.f72335j.f72107m.size()).f61491a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:14:0x0030  */
    /* JADX WARNING: Removed duplicated region for block: B:29:0x0075  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(java.lang.Object r6) {
        /*
            r5 = this;
            com.ss.android.ugc.aweme.arch.widgets.base.a r6 = (com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a) r6
            if (r6 == 0) goto L_0x0079
            java.lang.String r0 = r6.f62242a
            int r1 = r0.hashCode()
            r2 = -1013481626(0xffffffffc3977f66, float:-302.9953)
            r3 = 0
            r4 = -1
            if (r1 == r2) goto L_0x0021
            r2 = 22405807(0x155e2af, float:3.928456E-38)
            if (r1 == r2) goto L_0x0017
            goto L_0x002b
        L_0x0017:
            java.lang.String r1 = "action_remove_recommend_user_card"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002b
            r0 = 1
            goto L_0x002c
        L_0x0021:
            java.lang.String r1 = "onBack"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x002b
            r0 = 0
            goto L_0x002c
        L_0x002b:
            r0 = -1
        L_0x002c:
            switch(r0) {
                case 0: goto L_0x0075;
                case 1: goto L_0x0030;
                default: goto L_0x002f;
            }
        L_0x002f:
            goto L_0x0079
        L_0x0030:
            java.lang.Object r0 = r6.mo48246a()
            if (r0 == 0) goto L_0x0079
            java.lang.Object r6 = r6.mo48246a()
            java.lang.String r6 = (java.lang.String) r6
            com.ss.android.ugc.aweme.detail.h.a r0 = r5.f72335j
            com.ss.android.ugc.aweme.feed.adapter.ad r0 = r0.mo60500V()
            java.util.List r0 = r0.mo60286c()
            if (r0 == 0) goto L_0x006e
            int r1 = r0.size()
            if (r1 <= 0) goto L_0x006e
        L_0x004e:
            int r1 = r0.size()
            if (r3 >= r1) goto L_0x006e
            java.lang.Object r1 = r0.get(r3)
            if (r1 == 0) goto L_0x006b
            java.lang.Object r1 = r0.get(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r1
            java.lang.String r1 = r1.getAid()
            boolean r1 = android.text.TextUtils.equals(r1, r6)
            if (r1 == 0) goto L_0x006b
            goto L_0x006f
        L_0x006b:
            int r3 = r3 + 1
            goto L_0x004e
        L_0x006e:
            r3 = -1
        L_0x006f:
            com.ss.android.ugc.aweme.detail.h.a r6 = r5.f72335j
            r6.mo50466c_(r3)
            goto L_0x0079
        L_0x0075:
            r5.m66144s()
            return
        L_0x0079:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.detail.p1628ui.C27514r.onChanged(java.lang.Object):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo55933a(Boolean bool) {
        this.f72333d.setEnabled(bool.booleanValue());
    }

    @C53771m
    public void onDislikeAwemeEvent(C30340i iVar) {
        String str;
        if (getActivity() != null && iVar.f79254e == getActivity().hashCode() && !C36330a.m81964a(mo55944k()) && iVar.f79251b == 2) {
            boolean z = iVar.f79250a;
            ScrollSwitchStateManager.m75876a(getActivity()).mo69863a(!z);
            if (z) {
                C45427bj.m98998a(this.f72332c, this.f72332c.getAlpha(), 0.0f);
                this.f72347v.setVisibility(8);
                if (iVar.mo60717a()) {
                    float f = iVar.f79252c;
                    float f2 = iVar.f79253d;
                    if (this.f72341p != null && mo55944k() != null) {
                        String str2 = "click_trans_layer";
                        C23089d a = new C23089d().mo47829a("group_id", mo55944k().getAid());
                        String str3 = "author_id";
                        if (mo55944k().getAuthor() != null) {
                            str = mo55944k().getAuthor().getUid();
                        } else {
                            str = "";
                        }
                        C26890h.m65011a(str2, a.mo47829a(str3, str).mo47829a("content_type", C23198ae.m56879o(mo55944k())).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(mo55944k()))).mo47829a("enter_from", this.f72335j.ay_()).mo47829a("enter_method", C22858c.f61208d).f61491a);
                        if (C31076b.m72677b()) {
                            Dialog newOptionsDialog = BusinessComponentServiceUtils.newOptionsDialog(getContext(), mo55944k(), this.f72335j.ay_());
                            newOptionsDialog.setOnDismissListener(new OnDismissListener() {
                                public final void onDismiss(DialogInterface dialogInterface) {
                                    C27514r.this.mo55940f();
                                }
                            });
                            newOptionsDialog.show();
                            return;
                        }
                        this.f72341p.mo63290a(f, f2, this.f72335j.ay_(), mo55944k());
                        this.f72341p.setInDislikeMode(true);
                        if (this.f72341p.getAdapter() != null) {
                            this.f72341p.getAdapter().notifyDataSetChanged();
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final boolean mo55934a(Aweme aweme) {
        return mo55935a(aweme.getAid());
    }

    /* renamed from: a */
    public final boolean mo55935a(String str) {
        if (this.f72340o == null || !this.f72340o.deleteItem(str)) {
            return false;
        }
        return true;
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:38:0x029c  */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x02b5  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x02cf  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x02dd  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onViewCreated(android.view.View r13, android.os.Bundle r14) {
        /*
            r12 = this;
            super.onViewCreated(r13, r14)
            r0 = 2132018580(0x7f140594, float:1.967547E38)
            android.view.View r0 = r13.findViewById(r0)
            com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout r0 = (com.p683ss.android.ugc.aweme.feed.p1736ui.DisLikeAwemeLayout) r0
            r12.f72341p = r0
            r0 = 2132019232(0x7f140820, float:1.9676793E38)
            android.view.View r0 = r13.findViewById(r0)
            r12.f72342q = r0
            r0 = 2132019231(0x7f14081f, float:1.9676791E38)
            android.view.View r0 = r13.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r12.f72343r = r0
            r0 = 2132017557(0x7f140195, float:1.9673396E38)
            android.view.View r0 = r13.findViewById(r0)
            r12.f72332c = r0
            android.view.View r0 = r12.f72332c
            com.ss.android.ugc.aweme.detail.ui.y r1 = new com.ss.android.ugc.aweme.detail.ui.y
            r1.<init>(r12)
            r0.setOnClickListener(r1)
            r0 = 2132020899(0x7f140ea3, float:1.9680174E38)
            android.view.View r0 = r13.findViewById(r0)
            com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout r0 = (com.p683ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout) r0
            r12.f72345t = r0
            r0 = 2132022192(0x7f1413b0, float:1.9682797E38)
            android.view.View r0 = r13.findViewById(r0)
            com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout r0 = (com.p683ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout) r0
            r12.f72333d = r0
            r0 = 2132023117(0x7f14174d, float:1.9684673E38)
            android.view.View r0 = r13.findViewById(r0)
            android.view.ViewStub r0 = (android.view.ViewStub) r0
            r12.f72346u = r0
            r0 = 2132020194(0x7f140be2, float:1.9678744E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r12.f72347v = r0
            r0 = 2132020162(0x7f140bc2, float:1.967868E38)
            android.view.View r0 = r13.findViewById(r0)
            android.widget.ImageView r0 = (android.widget.ImageView) r0
            r12.f72348w = r0
            android.widget.ImageView r0 = r12.f72348w
            com.ss.android.ugc.aweme.detail.ui.z r1 = new com.ss.android.ugc.aweme.detail.ui.z
            r1.<init>(r12)
            r0.setOnClickListener(r1)
            r0 = 2132018521(0x7f140559, float:1.967535E38)
            r13.findViewById(r0)
            r0 = 1
            com.bytedance.ies.dmt.p664ui.p669e.C10703a.m21575a(r0)
            android.support.v4.app.FragmentActivity r1 = r12.getActivity()
            com.ss.android.ugc.aweme.main.n r1 = com.p683ss.android.ugc.aweme.main.p1937a.C36484a.m82417a(r1)
            r12.f72350y = r1
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = new com.bytedance.ies.dmt.ui.widget.DmtStatusView
            android.content.Context r2 = r12.getContext()
            r1.<init>(r2)
            r12.f72330a = r1
            android.widget.FrameLayout$LayoutParams r1 = new android.widget.FrameLayout$LayoutParams
            r2 = -1
            r1.<init>(r2, r2)
            com.ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout r2 = r12.f72345t
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r3 = r12.f72330a
            r2.addView(r3, r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r12.f72330a
            r2 = 8
            r1.setVisibility(r2)
            com.ss.android.ugc.aweme.feed.param.b r1 = r12.f72334e
            java.lang.String r1 = r1.getDetailTitleText()
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x00f5
            android.view.ViewStub r1 = r12.f72343r
            android.view.View r1 = r1.inflate()
            r12.f72344s = r1
            android.view.View r1 = r12.f72344s
            r3 = 2132019230(0x7f14081e, float:1.967679E38)
            android.view.View r1 = r1.findViewById(r3)
            android.widget.TextView r1 = (android.widget.TextView) r1
            boolean r3 = com.p683ss.android.ugc.aweme.experiment.NewDiscoverV4Experiment.m69617a()
            if (r3 == 0) goto L_0x00de
            boolean r3 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            if (r3 != 0) goto L_0x00de
            com.ss.android.ugc.aweme.feed.param.b r3 = r12.f72334e
            java.lang.String r3 = r3.getDetailTitleText()
            r1.setText(r3)
            goto L_0x00f5
        L_0x00de:
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            java.lang.String r4 = "#"
            r3.<init>(r4)
            com.ss.android.ugc.aweme.feed.param.b r4 = r12.f72334e
            java.lang.String r4 = r4.getDetailTitleText()
            r3.append(r4)
            java.lang.String r3 = r3.toString()
            r1.setText(r3)
        L_0x00f5:
            com.ss.android.ugc.aweme.feed.param.b r1 = r12.f72334e
            boolean r1 = r1.isShowVideoRank()
            r3 = 0
            if (r1 == 0) goto L_0x017a
            android.widget.ImageView r1 = r12.f72348w
            r1.setVisibility(r3)
            com.ss.android.ugc.aweme.detail.ui.s r1 = new com.ss.android.ugc.aweme.detail.ui.s
            r1.<init>(r12)
            com.bytedance.ies.dmt.ui.widget.c$a r4 = new com.bytedance.ies.dmt.ui.widget.c$a
            android.support.v4.app.FragmentActivity r5 = r12.getActivity()
            r4.<init>(r5)
            r5 = 2131954570(0x7f130b8a, float:1.9545643E38)
            com.bytedance.ies.dmt.ui.widget.c$a r4 = r4.mo19277a(r5)
            r5 = 2132551587(0x7f1c27a3, float:2.0756537E38)
            com.bytedance.ies.dmt.ui.widget.c$a r4 = r4.mo19280b(r5)
            r5 = 2132551584(0x7f1c27a0, float:2.0756531E38)
            com.bytedance.ies.dmt.ui.widget.c$a r4 = r4.mo19282c(r5)
            com.bytedance.ies.dmt.ui.widget.a r5 = com.bytedance.ies.dmt.p664ui.widget.C10720a.BORDER
            r6 = 2132551593(0x7f1c27a9, float:2.075655E38)
            com.bytedance.ies.dmt.ui.widget.c$a r4 = r4.mo19278a(r5, r6, r1)
            com.bytedance.ies.dmt.ui.widget.c r4 = r4.f28711a
            com.bytedance.ies.dmt.ui.widget.c$a r5 = new com.bytedance.ies.dmt.ui.widget.c$a
            android.support.v4.app.FragmentActivity r7 = r12.getActivity()
            r5.<init>(r7)
            r7 = 2132546096(0x7f1c1230, float:2.07454E38)
            com.bytedance.ies.dmt.ui.widget.c$a r5 = r5.mo19280b(r7)
            r7 = 2132546269(0x7f1c12dd, float:2.0745751E38)
            com.bytedance.ies.dmt.ui.widget.c$a r5 = r5.mo19282c(r7)
            com.bytedance.ies.dmt.ui.widget.a r7 = com.bytedance.ies.dmt.p664ui.widget.C10720a.BORDER
            com.bytedance.ies.dmt.ui.widget.c$a r1 = r5.mo19278a(r7, r6, r1)
            com.bytedance.ies.dmt.ui.widget.c r1 = r1.f28711a
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r5 = r12.f72330a
            android.content.Context r6 = r12.getContext()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r6 = com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a.m21676a(r6)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r4 = r6.mo19232b(r4)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r1 = r4.mo19229a(r1)
            r5.setBuilder(r1)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r12.f72330a
            android.content.Context r4 = r12.getContext()
            android.content.res.Resources r4 = r4.getResources()
            r5 = 2131821043(0x7f1101f3, float:1.9274818E38)
            int r4 = r4.getColor(r5)
            r1.setBackgroundColor(r4)
            goto L_0x018c
        L_0x017a:
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r12.f72330a
            android.support.v4.app.FragmentActivity r4 = r12.getActivity()
            com.bytedance.ies.dmt.ui.widget.DmtStatusView$a r4 = com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a.m21676a(r4)
            r1.setBuilder(r4)
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r12.f72330a
            r1.setBackgroundColor(r3)
        L_0x018c:
            android.view.View r1 = r12.f72342q
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            android.content.Context r4 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r4 = r4.getResources()
            java.lang.String r5 = "status_bar_height"
            java.lang.String r6 = "dimen"
            java.lang.String r7 = "android"
            int r4 = r4.getIdentifier(r5, r6, r7)
            if (r4 <= 0) goto L_0x01b5
            android.content.Context r5 = com.bytedance.ies.ugc.p694a.C11010c.m22280a()
            android.content.res.Resources r5 = r5.getResources()
            int r4 = r5.getDimensionPixelSize(r4)
            goto L_0x01b6
        L_0x01b5:
            r4 = 0
        L_0x01b6:
            r1.topMargin = r4
            com.ss.android.ugc.aweme.detail.h.a r1 = r12.f72335j
            r4 = 2
            if (r1 == 0) goto L_0x0215
            android.content.Context r1 = r12.getContext()
            r5 = 1097859072(0x41700000, float:15.0)
            float r1 = com.bytedance.common.utility.C9432q.m18687b(r1, r5)
            int r1 = (int) r1
            android.support.v4.app.FragmentActivity r5 = r12.getActivity()
            com.ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager r5 = com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager.m75876a(r5)
            android.support.v4.app.FragmentActivity r6 = r12.getActivity()
            com.ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel r6 = com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel.m75866a(r6)
            android.arch.lifecycle.k r7 = r12.m66140o()
            com.ss.android.ugc.aweme.detail.ui.t r8 = new com.ss.android.ugc.aweme.detail.ui.t
            r8.<init>(r12, r5, r1)
            r5.mo69876e(r7, r8)
            android.arch.lifecycle.k r1 = r12.m66140o()
            com.ss.android.ugc.aweme.detail.ui.v r7 = new com.ss.android.ugc.aweme.detail.ui.v
            r7.<init>(r12, r5, r6)
            r5.mo69872c(r1, r7)
            android.arch.lifecycle.k r1 = r12.m66140o()
            com.ss.android.ugc.aweme.detail.ui.w r6 = new com.ss.android.ugc.aweme.detail.ui.w
            r6.<init>(r12)
            r5.mo69875d(r1, r6)
            android.content.Context r1 = r12.getContext()
            boolean r1 = com.p683ss.android.ugc.aweme.detail.p1628ui.C27487ad.m66093a(r1)
            if (r1 != 0) goto L_0x0215
            android.support.v4.app.FragmentActivity r1 = r12.getActivity()
            r2 = 2132546921(0x7f1c1569, float:2.0747074E38)
            com.bytedance.ies.dmt.ui.d.a r1 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r1, r2)
            r1.mo19066a()
            goto L_0x026e
        L_0x0215:
            com.ss.android.ugc.aweme.feed.ui.DisLikeAwemeLayout r1 = r12.f72341p
            com.ss.android.ugc.aweme.detail.ui.r$1 r5 = new com.ss.android.ugc.aweme.detail.ui.r$1
            r5.<init>()
            r1.setListener(r5)
            com.bytedance.ies.abmock.b r6 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.discover.abtest.SearchInDetailModeExperiment> r7 = com.p683ss.android.ugc.aweme.discover.abtest.SearchInDetailModeExperiment.class
            r8 = 1
            java.lang.String r9 = "search_in_detail_mode"
            r10 = 31744(0x7c00, float:4.4483E-41)
            r11 = 0
            int r1 = r6.mo18168a(r7, r8, r9, r10, r11)
            if (r1 == r4) goto L_0x0246
            com.bytedance.ies.abmock.b r5 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.discover.abtest.DetailSearchEntranceExperiment> r6 = com.p683ss.android.ugc.aweme.discover.abtest.DetailSearchEntranceExperiment.class
            r7 = 1
            java.lang.String r8 = "show_detail_search_entrance"
            r9 = 31744(0x7c00, float:4.4483E-41)
            r10 = 0
            int r1 = r5.mo18168a(r6, r7, r8, r9, r10)
            if (r1 != r0) goto L_0x0244
            goto L_0x0246
        L_0x0244:
            r1 = 0
            goto L_0x0247
        L_0x0246:
            r1 = 1
        L_0x0247:
            if (r1 == 0) goto L_0x025f
            com.ss.android.ugc.aweme.feed.param.b r1 = r12.f72334e
            boolean r1 = r1.isHotSpot()
            if (r1 != 0) goto L_0x025f
            com.ss.android.ugc.aweme.feed.param.b r1 = r12.f72334e
            boolean r1 = r1.isShowVideoRank()
            if (r1 != 0) goto L_0x025f
            android.widget.ImageView r1 = r12.f72347v
            r1.setVisibility(r3)
            goto L_0x0264
        L_0x025f:
            android.widget.ImageView r1 = r12.f72347v
            r1.setVisibility(r2)
        L_0x0264:
            android.widget.ImageView r1 = r12.f72347v
            com.ss.android.ugc.aweme.detail.ui.x r2 = new com.ss.android.ugc.aweme.detail.ui.x
            r2.<init>(r12)
            r1.setOnClickListener(r2)
        L_0x026e:
            android.support.v4.app.FragmentActivity r1 = r12.getActivity()
            android.arch.lifecycle.y r1 = android.arch.lifecycle.C0214z.m440a(r1)
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter.m57235a(r1, r12)
            java.lang.String r2 = "action_remove_recommend_user_card"
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r1.mo48226a(r2, r12)
            java.lang.String r2 = "onBack"
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r1.mo48226a(r2, r12)
            r12.f72351z = r1
            android.content.Context r1 = r12.getContext()
            r2 = 0
            if (r1 == 0) goto L_0x029c
            com.ss.android.ugc.aweme.bridgeservice.f r1 = com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils.getBusinessBridgeService()
            r1.mo49724b()
            r12.getContext()
            r12.f72331b = r2
            goto L_0x02a4
        L_0x029c:
            r1 = 6
            java.lang.String r5 = "vs"
            java.lang.String r6 = "DetailFragment get Activity is null!!!"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r1, r5, r6)
        L_0x02a4:
            com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout r1 = r12.f72333d
            r1.setEnabled(r3)
            com.ss.android.ugc.aweme.common.f.a r1 = com.p683ss.android.ugc.aweme.feed.utils.C31213v.m72894a()
            com.ss.android.ugc.aweme.feed.param.b r5 = r12.f72334e
            com.bytedance.jedi.arch.JediViewModel r6 = com.p683ss.android.ugc.aweme.feed.utils.C31213v.f81658b
            com.bytedance.jedi.arch.JediViewModel r7 = com.p683ss.android.ugc.aweme.feed.utils.C31213v.f81658b
            if (r7 != r6) goto L_0x02b7
            com.p683ss.android.ugc.aweme.feed.utils.C31213v.f81658b = r2
        L_0x02b7:
            com.ss.android.ugc.aweme.detail.operators.al r5 = com.p683ss.android.ugc.aweme.detail.operators.C27470u.m66074a(r5, r1, r6)
            r12.f72340o = r5
            com.ss.android.ugc.aweme.detail.operators.al r5 = r12.f72340o
            int r6 = r12.m66145t()
            int r5 = r5.getPageType(r6)
            com.ss.android.ugc.aweme.detail.operators.al r6 = r12.f72340o
            boolean r6 = r6.init(r12)
            if (r6 != 0) goto L_0x02dd
            android.support.v4.app.FragmentActivity r13 = r12.getActivity()
            if (r13 == 0) goto L_0x02dc
            android.support.v4.app.FragmentActivity r13 = r12.getActivity()
            r13.finish()
        L_0x02dc:
            return
        L_0x02dd:
            com.ss.android.ugc.aweme.detail.operators.al r6 = r12.f72340o
            boolean r6 = r6 instanceof com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27421b
            if (r6 == 0) goto L_0x02ec
            com.ss.android.ugc.aweme.detail.operators.al r6 = r12.f72340o
            com.ss.android.ugc.aweme.detail.operators.al$b r6 = (com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27421b) r6
            com.ss.android.ugc.aweme.detail.h.a r7 = r12.f72335j
            r6.bindPreLoadView(r7)
        L_0x02ec:
            com.ss.android.ugc.aweme.detail.operators.al r6 = r12.f72340o
            boolean r6 = r6 instanceof com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27420a
            if (r6 == 0) goto L_0x0331
            com.ss.android.ugc.aweme.detail.operators.al r6 = r12.f72340o
            com.ss.android.ugc.aweme.detail.operators.al$a r6 = (com.p683ss.android.ugc.aweme.detail.operators.C27419al.C27420a) r6
            boolean r6 = r6.mo55879a()
            if (r6 == 0) goto L_0x0331
            com.ss.android.ugc.aweme.feed.param.b r6 = r12.f72334e
            java.lang.Boolean r6 = r6.isfollowSkyLight()
            boolean r6 = r6.booleanValue()
            if (r6 == 0) goto L_0x0310
            com.ss.android.ugc.aweme.feed.param.b r6 = r12.f72334e
            boolean r6 = r6.isHasLatestFollowingUser()
            if (r6 == 0) goto L_0x0331
        L_0x0310:
            com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout r6 = r12.f72333d
            r6.setEnabled(r0)
            android.support.v4.app.FragmentActivity r6 = r12.getActivity()
            com.ss.android.ugc.aweme.detail.ui.DetailLoadStateManager r6 = com.p683ss.android.ugc.aweme.detail.p1628ui.DetailLoadStateManager.C27479a.m66087a(r6)
            android.arch.lifecycle.r<java.lang.Boolean> r6 = r6.f72276a
            com.ss.android.ugc.aweme.detail.ui.aa r7 = new com.ss.android.ugc.aweme.detail.ui.aa
            r7.<init>(r12)
            r6.observe(r12, r7)
            com.ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout r6 = r12.f72333d
            com.ss.android.ugc.aweme.detail.ui.ab r7 = new com.ss.android.ugc.aweme.detail.ui.ab
            r7.<init>(r12)
            r6.setOnRefreshListener(r7)
        L_0x0331:
            com.ss.android.ugc.aweme.feed.param.b r6 = r12.f72334e
            r6.setPageType(r5)
            com.ss.android.ugc.aweme.feed.helper.g r5 = com.p683ss.android.ugc.aweme.feed.helper.C30367g.m71282a()
            com.ss.android.ugc.aweme.video.h r5 = r5.f79372a
            com.ss.android.ugc.aweme.feed.helper.g r6 = com.p683ss.android.ugc.aweme.feed.helper.C30367g.m71282a()
            r6.f79372a = r2
            com.ss.android.ugc.aweme.feed.param.b r6 = r12.f72334e
            java.lang.String r6 = r6.getEventType()
            java.lang.String r7 = "similar_ads"
            boolean r6 = android.text.TextUtils.equals(r6, r7)
            com.p683ss.android.ugc.aweme.video.C48069o.m104092a(r6)
            if (r5 == 0) goto L_0x039b
            com.ss.android.ugc.aweme.feed.helper.g r6 = com.p683ss.android.ugc.aweme.feed.helper.C30367g.m71282a()
            com.ss.android.ugc.aweme.feed.param.b r7 = r12.f72334e
            java.lang.String r7 = r7.getAid()
            r6.f79373b = r7
            java.lang.String r6 = "DetailPageFragment"
            java.lang.StringBuilder r7 = new java.lang.StringBuilder
            java.lang.String r8 = "use share player manager, from "
            r7.<init>(r8)
            com.ss.android.ugc.aweme.feed.param.b r8 = r12.f72334e
            java.lang.String r8 = r8.getFrom()
            r7.append(r8)
            java.lang.String r7 = r7.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75150b(r6, r7)
            android.support.v4.app.FragmentActivity r6 = r12.getActivity()
            com.ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel r6 = com.p683ss.android.ugc.aweme.feed.model.FeedSharePlayerViewModel.getViewModel(r6)
            r6.player = r5
            com.ss.android.ugc.aweme.detail.h.a r6 = r12.f72335j
            r6.mo62820a(r5)
            com.ss.android.ugc.aweme.detail.h.a r5 = r12.f72335j
            com.ss.android.ugc.aweme.feed.helper.g r6 = com.p683ss.android.ugc.aweme.feed.helper.C30367g.m71282a()
            long r6 = r6.f79374c
            r5.mo55782a(r6)
            com.ss.android.ugc.aweme.feed.helper.g r5 = com.p683ss.android.ugc.aweme.feed.helper.C30367g.m71282a()
            r6 = -1
            r5.f79374c = r6
            goto L_0x03c1
        L_0x039b:
            boolean r5 = com.p683ss.android.ugc.aweme.video.C48069o.m104090L()
            if (r5 == 0) goto L_0x03c1
            com.ss.android.ugc.aweme.video.w r5 = new com.ss.android.ugc.aweme.video.w
            r5.<init>(r3, r3)
            android.support.v4.app.FragmentActivity r6 = r12.getActivity()
            com.ss.android.ugc.aweme.video.FeedPlayerManagerViewModel$a r7 = com.p683ss.android.ugc.aweme.video.FeedPlayerManagerViewModel.f120595b
            java.lang.String r7 = "activity"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r7)
            java.lang.String r7 = "playerManager"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r7)
            com.ss.android.ugc.aweme.video.FeedPlayerManagerViewModel r6 = com.p683ss.android.ugc.aweme.video.FeedPlayerManagerViewModel.C47974a.m103798a(r6)
            r6.f120596a = r5
            com.ss.android.ugc.aweme.detail.h.a r6 = r12.f72335j
            r6.mo62820a(r5)
        L_0x03c1:
            com.ss.android.ugc.aweme.detail.h.a r5 = r12.f72335j
            com.ss.android.ugc.aweme.detail.ui.ac r6 = new com.ss.android.ugc.aweme.detail.ui.ac
            r6.<init>(r12)
            r5.f72105k = r6
            com.ss.android.ugc.aweme.detail.h.a r5 = r12.f72335j
            com.ss.android.ugc.aweme.feed.param.b r6 = r12.f72334e
            r5.mo62810a(r6)
            com.ss.android.ugc.aweme.detail.operators.al r5 = r12.f72340o
            r5.getViewModel()
            com.ss.android.ugc.aweme.detail.h.a r5 = r12.f72335j
            com.ss.android.ugc.aweme.detail.operators.al r6 = r12.f72340o
            java.lang.Object r6 = r6.getViewModel()
            r5.f80007ay = r6
            com.ss.android.ugc.aweme.detail.h.a r5 = r12.f72335j
            android.os.Bundle r6 = r12.getArguments()
            if (r6 != 0) goto L_0x03ea
            r6 = 0
            goto L_0x03f6
        L_0x03ea:
            java.lang.String r7 = "trigger_by"
            java.lang.String r6 = r6.getString(r7)
            java.lang.String r7 = "splash"
            boolean r6 = android.text.TextUtils.equals(r6, r7)
        L_0x03f6:
            r5.mo55799b(r6)
            com.ss.android.ugc.aweme.detail.h.a r5 = r12.f72335j
            java.lang.String r6 = "from_profile_self"
            java.lang.String r7 = r12.m66141p()
            boolean r6 = r6.equals(r7)
            r5.mo55807e(r6)
            com.ss.android.ugc.aweme.detail.h.a r5 = r12.f72335j
            r5.mo55784a(r13, r14)
            com.ss.android.ugc.aweme.detail.h.a r13 = r12.f72335j
            r13.f72112r = r12
            com.ss.android.ugc.aweme.detail.h.a r13 = r12.f72335j
            r13.f72103i = r12
            com.ss.android.ugc.aweme.detail.h.a r13 = r12.f72335j
            r13.mo55788a(r12)
            com.ss.android.ugc.aweme.detail.h.a r13 = r12.f72335j
            r13.f72102h = r12
            com.ss.android.ugc.aweme.detail.h.a r13 = r12.f72335j
            r13.f79958R = r12
            java.lang.String r13 = r12.m66141p()
            java.lang.String r14 = "from_follow_page"
            boolean r13 = android.text.TextUtils.equals(r13, r14)
            if (r13 == 0) goto L_0x0434
            com.ss.android.ugc.aweme.detail.h.a r13 = r12.f72335j
            java.lang.String r14 = "feed"
            r13.f80002at = r14
        L_0x0434:
            com.ss.android.ugc.aweme.feed.param.b r13 = r12.f72334e
            java.lang.Boolean r13 = r13.isfollowSkyLight()
            boolean r13 = r13.booleanValue()
            if (r13 == 0) goto L_0x0477
            com.ss.android.ugc.aweme.detail.h.a r13 = r12.f72335j
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r14 = r13.f80030y
            com.ss.android.ugc.aweme.detail.h.j r5 = new com.ss.android.ugc.aweme.detail.h.j
            com.ss.android.ugc.aweme.detail.h.a$13 r6 = new com.ss.android.ugc.aweme.detail.h.a$13
            r6.<init>()
            r5.<init>(r6)
            int r13 = android.os.Build.VERSION.SDK_INT
            r6 = 11
            if (r13 < r6) goto L_0x046c
            android.support.v4.view.ViewPager$f r13 = r14.f71013f
            if (r13 == 0) goto L_0x045a
            r13 = 1
            goto L_0x045b
        L_0x045a:
            r13 = 0
        L_0x045b:
            if (r0 == r13) goto L_0x045f
            r13 = 1
            goto L_0x0460
        L_0x045f:
            r13 = 0
        L_0x0460:
            r14.f71013f = r5
            r14.setChildrenDrawingOrderEnabledCompat(r0)
            r14.f71014g = r4
            if (r13 == 0) goto L_0x046c
            r14.mo55021f()
        L_0x046c:
            com.ss.android.ugc.aweme.detail.h.a r13 = r12.f72335j
            com.ss.android.ugc.aweme.feed.param.b r14 = r12.f72334e
            java.lang.String r14 = r14.getAuthorName()
            r13.mo55797b(r14)
        L_0x0477:
            com.ss.android.ugc.aweme.detail.operators.al r13 = r12.f72340o
            if (r13 != 0) goto L_0x047d
            r13 = 1
            goto L_0x0489
        L_0x047d:
            boolean r14 = r13 instanceof com.p683ss.android.ugc.aweme.detail.operators.C27403a
            if (r14 == 0) goto L_0x0488
            com.ss.android.ugc.aweme.detail.operators.a r13 = (com.p683ss.android.ugc.aweme.detail.operators.C27403a) r13
            boolean r13 = r13.checkSelfInvalid()
            goto L_0x0489
        L_0x0488:
            r13 = 0
        L_0x0489:
            if (r13 == 0) goto L_0x04ce
            com.ss.android.ugc.aweme.feed.param.b r13 = r12.f72334e     // Catch:{ Throwable -> 0x0492 }
            java.lang.String r13 = r13.toString()     // Catch:{ Throwable -> 0x0492 }
            goto L_0x04a5
        L_0x0492:
            r13 = move-exception
            java.lang.StringBuilder r14 = new java.lang.StringBuilder
            java.lang.String r0 = "innerError"
            r14.<init>(r0)
            java.lang.String r13 = r13.toString()
            r14.append(r13)
            java.lang.String r13 = r14.toString()
        L_0x04a5:
            org.json.JSONObject r14 = new org.json.JSONObject     // Catch:{ Throwable -> 0x04bc }
            r14.<init>()     // Catch:{ Throwable -> 0x04bc }
            java.lang.String r0 = "error_stack"
            r14.put(r0, r13)     // Catch:{ Throwable -> 0x04bc }
            java.lang.String r13 = "errorType"
            java.lang.String r0 = "detail_page_npe"
            r14.put(r13, r0)     // Catch:{ Throwable -> 0x04bc }
            java.lang.String r13 = "aweme_error_find_bug"
            com.p683ss.android.ugc.aweme.base.C23569o.m57779a(r13, r14)     // Catch:{ Throwable -> 0x04bc }
            goto L_0x04c0
        L_0x04bc:
            r13 = move-exception
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r13)
        L_0x04c0:
            android.support.v4.app.FragmentActivity r13 = r12.getActivity()
            if (r13 == 0) goto L_0x04cd
            android.support.v4.app.FragmentActivity r13 = r12.getActivity()
            r13.finish()
        L_0x04cd:
            return
        L_0x04ce:
            com.ss.android.ugc.aweme.detail.operators.al r13 = r12.f72340o
            com.ss.android.ugc.aweme.detail.h.a r14 = r12.f72335j
            r13.bindView(r14)
            com.ss.android.ugc.aweme.detail.operators.al r13 = r12.f72340o
            boolean r13 = r13.isDataEmpty()
            if (r13 == 0) goto L_0x04e0
            r12.m66138a(r0)
        L_0x04e0:
            com.ss.android.ugc.aweme.detail.h.a r13 = r12.f72335j
            r13.mo55811k()
            com.ss.android.ugc.aweme.detail.h.a r13 = r12.f72335j
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r13 = r13.mo62782av()
            if (r13 == 0) goto L_0x04fc
            boolean r14 = r12.f72337l
            r14 = r14 ^ r0
            r13.setDisableScroll(r14)
            java.lang.String r14 = "detail_page"
            com.ss.android.ugc.aweme.utils.bo r14 = com.p683ss.android.ugc.aweme.utils.C47729bp.m103326a(r14)
            r14.mo95021a(r13)
        L_0x04fc:
            com.ss.android.ugc.aweme.common.f.a r13 = com.p683ss.android.ugc.aweme.feed.utils.C31213v.f81657a
            if (r13 != r1) goto L_0x0502
            com.p683ss.android.ugc.aweme.feed.utils.C31213v.f81657a = r2
        L_0x0502:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.detail.p1628ui.C27514r.onViewCreated(android.view.View, android.os.Bundle):void");
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return C23344b.f62351a.mo48400a(getActivity(), R.layout.b8s, layoutInflater, viewGroup);
    }
}
