package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.os.SystemClock;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.p683ss.android.common.applog.TeaAgent;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.C23474b.C23475a;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25880al;
import com.p683ss.android.ugc.aweme.common.C26874f;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1594f.C26876b;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26879e;
import com.p683ss.android.ugc.aweme.common.p1594f.C26880f;
import com.p683ss.android.ugc.aweme.common.p1594f.C26881g;
import com.p683ss.android.ugc.aweme.common.p1594f.C26882h;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.C30585p;
import com.p683ss.android.ugc.aweme.feed.C30585p.C30587a;
import com.p683ss.android.ugc.aweme.feed.C30689t;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.adapter.C30019aj;
import com.p683ss.android.ugc.aweme.feed.adapter.C30020ak;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.FeedItemList;
import com.p683ss.android.ugc.aweme.feed.netdetector.C30539a;
import com.p683ss.android.ugc.aweme.feed.netdetector.C30550b;
import com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30569g;
import com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.C30574a;
import com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.noticebar.C30575b;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30319aj;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30350s;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30445b;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30448e;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30480d;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30487j;
import com.p683ss.android.ugc.aweme.feed.panel.C30648q;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.homepage.api.data.C32968a;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p683ss.android.ugc.aweme.journey.C35781s;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.DmtStatusViewInflate;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CFragmentFeed;
import com.p683ss.android.ugc.aweme.main.C36617e;
import com.p683ss.android.ugc.aweme.main.C36663h;
import com.p683ss.android.ugc.aweme.main.C36664i;
import com.p683ss.android.ugc.aweme.p1341an.C22574a;
import com.p683ss.android.ugc.aweme.p1382aq.C23247q;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47450c;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47835dx;
import com.p683ss.android.ugc.common.component.p2417a.C48521c;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.ai */
public final class C30753ai extends C30986f<C30487j> implements C30019aj, C30020ak, C30448e<Aweme>, C36617e {

    /* renamed from: l */
    public int f80589l;

    /* renamed from: m */
    public C30648q f80590m = new C30648q("homepage_hot", 0);

    /* renamed from: n */
    public C30689t f80591n;

    /* renamed from: o */
    C30574a f80592o = null;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.ai$a */
    public static class C30756a {

        /* renamed from: a */
        boolean f80596a;

        public C30756a(boolean z) {
            this.f80596a = z;
        }
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: s */
    public final String mo63459s() {
        return "FeedRecommendFragment";
    }

    /* renamed from: g */
    public final boolean mo55941g() {
        mo63451h();
        return super.mo55941g();
    }

    /* renamed from: i */
    public final boolean mo55943i() {
        return this.f80590m.mo62845aT();
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final /* synthetic */ C26876b mo63452j() {
        return new C30487j(this);
    }

    /* renamed from: n */
    public final void mo63455n() {
        this.f80590m.mo62874bn();
    }

    /* renamed from: o */
    public final C30016ag mo63456o() {
        return this.f80590m.mo60518aj();
    }

    /* renamed from: k */
    private int m72106k() {
        if (this.f80590m != null) {
            return this.f80590m.mo62867bg();
        }
        return 0;
    }

    /* renamed from: B */
    public final SparseArray<C48521c> mo48685B() {
        SparseArray<C48521c> B = super.mo48685B();
        B.append(C23475a.f62544c, this.f80590m);
        return B;
    }

    public final void bD_() {
        this.f81143c.setRefreshing(true);
        mo59855d_(false);
    }

    /* renamed from: f */
    public final void mo63450f() {
        if (this.f80590m != null) {
            this.f80590m.mo62827aB();
        }
    }

    /* renamed from: h */
    public final void mo63451h() {
        if (this.f81147j != null) {
            ((C30487j) this.f81147j).f79687d = m72106k();
        }
    }

    public final void onStop() {
        super.onStop();
        C23794bh.m58408v().mo49246c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final boolean mo63454m() {
        boolean z;
        if (super.mo63454m()) {
            C30487j jVar = (C30487j) this.f81147j;
            if (jVar.f70700f == null || ((C30480d) jVar.f70700f).f79650f) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                return true;
            }
        }
        return false;
    }

    public final void aG_() {
        C32458a.m75141a(4, "FeedFetchModel", "feedRecommendFragment called onLoadMore()");
        mo63451h();
        ((C30487j) this.f81147j).mo44934a_(Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(2));
        if (C30550b.m71531b()) {
            C30539a.m71515b();
        }
    }

    /* renamed from: e */
    public final boolean mo63449e() {
        if (((C30487j) this.f81147j).mo54803n() == null || ((C30480d) ((C30487j) this.f81147j).mo54803n()).getData() == null || !((FeedItemList) ((C30480d) ((C30487j) this.f81147j).mo54803n()).getData()).isRefreshClear()) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final boolean mo63453l() {
        ((C30487j) this.f81147j).f79686b = true;
        return ((C30487j) this.f81147j).mo44934a_(Integer.valueOf(4), Integer.valueOf(this.f80581r), Integer.valueOf(2));
    }

    public final void onDestroyView() {
        super.onDestroyView();
        this.f80590m.mo55813m();
        if (this.f81147j != null) {
            ((C30487j) this.f81147j).mo46991S_();
        }
        if (this.f80592o != null) {
            this.f80592o.mo62760a();
        }
        C30585p.f79876a = 0;
    }

    public final void onStart() {
        super.onStart();
        FragmentActivity activity = getActivity();
        if (activity instanceof C36663h) {
            Fragment curFragment = ((C36663h) activity).getCurFragment();
            if ((curFragment instanceof C36664i) && (((C36664i) curFragment).mo75499c() instanceof C30753ai)) {
                C23794bh.m58408v().mo49247c(getActivity());
            }
        }
    }

    public final void onResume() {
        super.onResume();
        if (getUserVisibleHint() && isResumed() && this.f80582s != null && !this.f80582s.isHidden() && C47835dx.m103473a()) {
            C0013i.m18a((Callable<TResult>) new C30757aj<TResult>(this), (Executor) C26890h.m65003a());
            C30578o.m71566a(C29988ad.FEED);
        }
        C23794bh.m58408v().mo49237a((Context) getActivity(), this.f80590m.mo60519ak());
    }

    /* renamed from: c */
    public final void mo63448c(boolean z) {
        super.mo63448c(z);
        this.f80590m.f79966Z = z;
    }

    @C53771m
    public final void onFeedFetchEvent(C30350s sVar) {
        if (TextUtils.equals(sVar.f79262a, "from_full_recommend")) {
            mo63453l();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final DmtStatusView mo63446a(Context context) {
        return ((DmtStatusViewInflate) C35857a.m81002b(DmtStatusViewInflate.class)).getDmtStatusView(context, new C30758ak(this));
    }

    /* renamed from: f */
    public final void mo63329f(boolean z) {
        super.mo63329f(z);
        this.f80590m.mo62894n(z);
        C23794bh.m58408v().mo49248d();
        C30569g.m71558a(Boolean.valueOf(false));
    }

    /* renamed from: b */
    public final void mo63447b(String str) {
        C26890h.m65011a("homepage_hot_click", C23089d.m56640a().mo47829a("click_method", "refresh").mo47829a("refresh_mode", str).mo47826a("last_play_cnt", this.f80591n.f80316a).f61491a);
    }

    /* renamed from: a */
    public final void mo60875a(C26881g<Aweme> gVar) throws C26880f {
        C30487j jVar = (C30487j) this.f81147j;
        if (jVar.f70700f != null) {
            C30480d dVar = (C30480d) jVar.f70700f;
            List items = dVar.getItems();
            int i = gVar.f70736b;
            List<T> list = gVar.f70735a;
            if (C9376b.m18558a((Collection<T>) items)) {
                items = new ArrayList();
            }
            if (i < 0 || i > items.size()) {
                throw new C26880f(i, items.size());
            }
            items.addAll(i, list);
            if (items.size() == 1) {
                dVar.setItems(items);
            }
            C26882h a = C26882h.m64990a(gVar, items);
            if (dVar.mNotifyListeners != null && dVar.mNotifyListeners.size() != 0) {
                for (C26874f fVar : dVar.mNotifyListeners) {
                    if (fVar instanceof C26879e) {
                        C26879e eVar = (C26879e) fVar;
                        if (!eVar.mo46994a(a)) {
                            eVar.mo46993a(a.f70739e, a.f70736b);
                        }
                    }
                }
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public final void onEvent(C30756a aVar) {
        mo63451h();
        if (aVar.f80596a) {
            ((C30487j) this.f81147j).f79686b = true;
            ((C30487j) this.f81147j).mo44934a_(Integer.valueOf(4), Integer.valueOf(0), Integer.valueOf(2));
            return;
        }
        ((C30487j) this.f81147j).mo44934a_(Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Boolean.valueOf(false));
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        this.f80590m.mo55808f(z);
        if (getUserVisibleHint() && isResumed() && this.f80582s != null && !this.f80582s.isHidden()) {
            new C23247q().mo48131a("homepage_hot").mo48076e();
            C30578o.m71566a(C29988ad.FEED);
        }
        if (!z && isResumed()) {
            C22574a.m55738f().mo46914a();
            C22574a.m55738f().mo46919b();
        }
    }

    /* renamed from: d_ */
    public final boolean mo59855d_(boolean z) {
        if (!isViewValid() || this.f81147j == null) {
            return false;
        }
        boolean z2 = ((C30487j) this.f81147j).f79686b;
        if (!super.mo59855d_(z) && !z2) {
            return false;
        }
        ((C30487j) this.f81147j).mo60911a(z);
        if (z2) {
            this.f81148k.setRefreshing(false);
            C47718bf.m103288a(new C30319aj());
            return true;
        }
        mo63451h();
        if (mo63449e()) {
            if (z) {
                mo63447b("click");
            } else if (!TextUtils.isEmpty(this.f80584u)) {
                mo63447b(this.f80584u);
                if ("press_back".equals(this.f80584u)) {
                    return ((C30487j) this.f81147j).mo60912a(5, Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Boolean.valueOf(this.f80591n.mo63269a()));
                }
            }
            return ((C30487j) this.f81147j).mo44934a_(Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Boolean.valueOf(this.f80591n.mo63269a()));
        }
        return ((C30487j) this.f81147j).mo44934a_(Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(3));
    }

    /* renamed from: e */
    public final void mo63328e(boolean z) {
        FragmentActivity activity = getActivity();
        if (activity instanceof C36663h) {
            Fragment curFragment = ((C36663h) activity).getCurFragment();
            if ((curFragment instanceof C36664i) && (((C36664i) curFragment).mo75499c() instanceof C30753ai)) {
                C23794bh.m58408v().mo49247c(getActivity());
                C23794bh.m58408v().mo49237a((Context) getActivity(), this.f80590m.mo60519ak());
            }
        }
        C30569g.m71558a(Boolean.valueOf(true));
        if (getUserVisibleHint() && isViewValid()) {
            super.mo63328e(z);
            if (!z) {
                this.f80590m.mo62851aZ();
            } else if (getActivity() != null) {
                DataCenter a = DataCenter.m57235a(C0214z.m440a(getActivity()), (C0184k) this);
                a.mo48228a("tryShowGuideView", (Object) null);
                if (!((Boolean) a.mo48230b("lastTryShowGuideViewResult", Boolean.valueOf(false))).booleanValue()) {
                    this.f80590m.mo55833u();
                }
            }
            mo63438g(false);
            C30016ag o = mo63456o();
            if (o != null) {
                C25880al r = o.mo60248r();
                if (r != null) {
                    r.mo53056a(false);
                }
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        Object obj;
        Object obj2;
        Object obj3;
        Object obj4;
        super.onViewCreated(view, bundle);
        this.f80590m.mo55784a(view, bundle);
        C35781s.m80912a("onViewCreated");
        this.f80590m.mo62966a((C30019aj) this);
        this.f80590m.mo55788a((C30445b) this);
        this.f80590m.f79958R = this;
        this.f80590m.f79959S = this;
        this.f81143c.setOnRefreshListener(new C23596b() {
            /* renamed from: a */
            public final void mo47048a() {
                if (!(C30753ai.this.getActivity() == null || C30753ai.this.getActivity().getWindow() == null)) {
                    C30753ai.this.getActivity().getWindow().getDecorView().setBackgroundColor(-1);
                }
                if (!C30759al.m72128a(C30753ai.this.getActivity())) {
                    C10691a.m21542b((Context) C30753ai.this.getActivity(), (int) R.string.cg1).mo19066a();
                    C30753ai.this.f81148k.setRefreshing(false);
                    return;
                }
                C30753ai.this.mo63451h();
                if (C30753ai.this.mo63449e()) {
                    C30753ai.this.mo63447b("slide_down");
                    ((C30487j) C30753ai.this.f81147j).mo44934a_(Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(1), Boolean.valueOf(C30753ai.this.f80591n.mo63269a()));
                } else {
                    ((C30487j) C30753ai.this.f81147j).mo44934a_(Integer.valueOf(2), Integer.valueOf(0), Integer.valueOf(3));
                }
                if (C30550b.m71531b()) {
                    C30539a.m71515b();
                }
                C47718bf.m103288a(new C47450c(0));
            }
        });
        this.f80590m.mo62816a((C0997e) new C0997e() {

            /* renamed from: a */
            int f80594a = -1;

            public final void onPageScrollStateChanged(int i) {
            }

            /* JADX WARNING: Code restructure failed: missing block: B:11:0x0036, code lost:
                if (r5 == (r4.f80595b.f80590m.mo60500V().getCount() - 1)) goto L_0x0038;
             */
            /* JADX WARNING: Removed duplicated region for block: B:15:0x0043 A[Catch:{ Exception -> 0x004d }] */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onPageSelected(int r5) {
                /*
                    r4 = this;
                    com.ss.android.ugc.aweme.feed.ui.ai r0 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai.this
                    r0.f80589l = r5
                    r4.f80594a = r5
                    r0 = 0
                    r1 = 1
                    if (r5 != r1) goto L_0x001f
                    com.ss.android.ugc.aweme.feed.ui.ai r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai.this
                    android.support.v4.app.FragmentActivity r2 = r2.getActivity()
                    if (r2 == 0) goto L_0x001f
                    com.ss.android.ugc.aweme.bd r2 = com.p683ss.android.ugc.aweme.C23794bh.m58408v()
                    com.ss.android.ugc.aweme.feed.ui.ai r3 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai.this
                    android.support.v4.app.FragmentActivity r3 = r3.getActivity()
                    r2.mo49235a(r3, r0)
                L_0x001f:
                    boolean r2 = com.p683ss.android.ugc.aweme.feed.netdetector.C30550b.m71531b()
                    if (r2 == 0) goto L_0x004d
                    if (r5 == 0) goto L_0x0038
                    if (r5 <= 0) goto L_0x0039
                    com.ss.android.ugc.aweme.feed.ui.ai r2 = com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai.this     // Catch:{ Exception -> 0x004d }
                    com.ss.android.ugc.aweme.feed.panel.q r2 = r2.f80590m     // Catch:{ Exception -> 0x004d }
                    com.ss.android.ugc.aweme.feed.adapter.ad r2 = r2.mo60500V()     // Catch:{ Exception -> 0x004d }
                    int r2 = r2.getCount()     // Catch:{ Exception -> 0x004d }
                    int r2 = r2 - r1
                    if (r5 != r2) goto L_0x0039
                L_0x0038:
                    r0 = 1
                L_0x0039:
                    java.lang.Boolean r5 = java.lang.Boolean.valueOf(r0)     // Catch:{ Exception -> 0x004d }
                    boolean r0 = com.p683ss.android.ugc.aweme.feed.netdetector.C30550b.m71531b()     // Catch:{ Exception -> 0x004d }
                    if (r0 == 0) goto L_0x004c
                    java.util.concurrent.atomic.AtomicBoolean r0 = com.p683ss.android.ugc.aweme.feed.netdetector.fetchfeed.C30569g.f79852b     // Catch:{ Exception -> 0x004d }
                    boolean r5 = r5.booleanValue()     // Catch:{ Exception -> 0x004d }
                    r0.set(r5)     // Catch:{ Exception -> 0x004d }
                L_0x004c:
                    return
                L_0x004d:
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30753ai.C307552.onPageSelected(int):void");
            }

            public final void onPageScrolled(int i, float f, int i2) {
                int i3;
                Aweme aweme;
                if (i == this.f80594a && f < 1.0E-10f) {
                    this.f80594a = -1;
                }
                if (C30753ai.this.f80591n != null && f > 0.0f) {
                    int needHomepageShowPermissionPopUp = C32616c.f84865a.needHomepageShowPermissionPopUp();
                    int i4 = i + 1;
                    if (i4 > C30753ai.this.f80591n.f80316a && !C30753ai.this.f80591n.f80317b && needHomepageShowPermissionPopUp <= C30753ai.this.f80591n.f80316a) {
                        if (needHomepageShowPermissionPopUp == C30753ai.this.f80591n.f80316a) {
                            C32616c.f84865a.setShownFriendslistPermissionPopUp(true);
                        }
                        Aweme ak = C30753ai.this.f80590m.mo60519ak();
                        C30648q qVar = C30753ai.this.f80590m;
                        if (qVar.f80030y == null) {
                            i3 = qVar.f79946F;
                        } else {
                            i3 = qVar.f80030y.getCurrentItem();
                        }
                        if (qVar.f79945E != null) {
                            aweme = qVar.f79945E.mo60285c(i3);
                            if (aweme == ak) {
                                aweme = qVar.f79945E.mo60285c(i3 + 1);
                            }
                        } else {
                            aweme = null;
                        }
                        if (needHomepageShowPermissionPopUp < C30753ai.this.f80591n.f80316a && aweme != null && !aweme.isAd()) {
                            C32616c.f84865a.showFriendslistPermissionPopUp(C32616c.f84865a.checkFriendslistPermissionPopUp("homepage_hot"), "homepage_hot");
                            C30753ai.this.f80591n.f80317b = true;
                        }
                    }
                    C30689t tVar = C30753ai.this.f80591n;
                    if (i4 > tVar.f80316a) {
                        tVar.f80316a = i4;
                    }
                }
            }
        });
        ((C30487j) this.f81147j).mo54800a(this.f80590m);
        ((C30487j) this.f81147j).f79685a = this.f80590m;
        ((C30487j) this.f81147j).mo54799a(new C30480d(6, 0));
        ((C30487j) this.f81147j).mo54838a((C26878d) this.f80590m);
        this.f80591n = new C30689t(this.f81147j);
        mo63451h();
        if (getActivity() instanceof C36663h) {
            HomePageDataViewModel a = HomePageDataViewModel.m75866a(getActivity());
            C32968a aVar = a.f85648b;
            obj3 = aVar.mo69850a();
            obj2 = aVar.mo69851b();
            obj4 = aVar.mo69852c();
            obj = a.f85649c;
        } else {
            obj = null;
            obj4 = null;
            obj3 = null;
            obj2 = null;
        }
        mo63451h();
        ((C30487j) this.f81147j).mo44934a_(Integer.valueOf(1), Integer.valueOf(0), Integer.valueOf(0), obj3, obj2, obj4, obj);
        mo63438g(false);
        if (getActivity() instanceof C36663h) {
            ((C36663h) getActivity()).onFeedRecommendFragmentReady();
        }
        if (this.f80592o == null && C30550b.m71531b()) {
            this.f80592o = C30575b.m71562a(getActivity(), this.f81142b);
        }
        C30569g.m71558a(Boolean.valueOf(true));
        if (!C30585p.f79877b) {
            C30585p.f79877b = true;
            TeaAgent.addSessionHook(new C30587a());
        }
        C30585p.f79876a = SystemClock.uptimeMillis();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C35781s.m80912a("onCreateView");
        return ((X2CFragmentFeed) C35857a.m81002b(X2CFragmentFeed.class)).getView(getContext(), R.layout.b5q);
    }
}
