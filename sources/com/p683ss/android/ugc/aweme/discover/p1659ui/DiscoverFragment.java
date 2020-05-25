package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.SystemClock;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.facebook.drawee.p930a.p931a.C13771c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.app.C23183v;
import com.p683ss.android.ugc.aweme.arch.C23268b;
import com.p683ss.android.ugc.aweme.base.component.AnalysisStayTimeFragmentComponent;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.commercialize.loft.AbsLoftNestedRefreshLayout;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1574a.C26003b;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1574a.C26004c;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26006a;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26009d;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1576c.C26015a;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1576c.C26015a.C26017b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.p1598j.C26904c;
import com.p683ss.android.ugc.aweme.discover.adapter.C27903j;
import com.p683ss.android.ugc.aweme.discover.adapter.C27903j.C27904a;
import com.p683ss.android.ugc.aweme.discover.adapter.C27903j.C27905b;
import com.p683ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder;
import com.p683ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder;
import com.p683ss.android.ugc.aweme.discover.helper.C28194c;
import com.p683ss.android.ugc.aweme.discover.helper.C28199h;
import com.p683ss.android.ugc.aweme.discover.helper.C28199h.C28200a;
import com.p683ss.android.ugc.aweme.discover.mob.C28396b;
import com.p683ss.android.ugc.aweme.discover.model.SearchStateViewModel;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27721d;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27722e;
import com.p683ss.android.ugc.aweme.discover.p1640c.C28068a;
import com.p683ss.android.ugc.aweme.discover.viewmodel.DiscoverViewModel;
import com.p683ss.android.ugc.aweme.discover.widget.BannerSwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.discover.widget.DiscoveryRecyclerView;
import com.p683ss.android.ugc.aweme.friends.adapter.C32529e;
import com.p683ss.android.ugc.aweme.main.MainAnimViewModel;
import com.p683ss.android.ugc.aweme.main.TabChangeManager;
import com.p683ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p683ss.android.ugc.aweme.p1397az.C23337c;
import com.p683ss.android.ugc.aweme.utils.C47729bp;
import com.p683ss.android.ugc.aweme.utils.C47835dx;
import com.p683ss.android.ugc.aweme.views.C48190g;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.DiscoverFragment */
public class DiscoverFragment extends C23526a implements C0199s<Boolean>, C27721d, C27905b, C28200a {

    /* renamed from: a */
    protected SearchStateViewModel f74725a;

    /* renamed from: b */
    public C26015a f74726b;

    /* renamed from: c */
    DiscoverViewModel f74727c;

    /* renamed from: d */
    public int f74728d;

    /* renamed from: e */
    public AbsLoftNestedRefreshLayout f74729e;

    /* renamed from: j */
    private C1332i f74730j;

    /* renamed from: k */
    private AnalysisStayTimeFragmentComponent f74731k;

    /* renamed from: l */
    private int f74732l = 1;

    /* renamed from: m */
    private MainAnimViewModel f74733m;
    RelativeLayout mFlRootContainer;
    DiscoveryRecyclerView mListView;
    BannerSwipeRefreshLayout mRefreshLayout;
    View mStatusBar;
    DmtStatusView mStatusView;

    /* renamed from: n */
    private boolean f74734n;

    /* renamed from: o */
    private boolean f74735o;

    /* renamed from: p */
    private boolean f74736p;

    /* renamed from: q */
    private C28199h f74737q;

    /* renamed from: r */
    private C28194c f74738r;

    /* renamed from: s */
    private long f74739s = -1;

    /* renamed from: t */
    private Handler f74740t = new Handler(Looper.getMainLooper());

    /* renamed from: u */
    private boolean f74741u = true;

    /* renamed from: v */
    private long f74742v = SystemClock.elapsedRealtime();

    /* renamed from: w */
    private Bitmap f74743w;

    /* renamed from: k */
    private static boolean m67485k() {
        return false;
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return false;
    }

    public final void aL_() {
    }

    /* renamed from: f */
    public final void mo58047f() {
        m67484j();
        m67483i();
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("discovery");
    }

    /* renamed from: g */
    private boolean m67481g() {
        return "DISCOVER".equals(TabChangeManager.m82396a(getActivity()).f93538c);
    }

    /* renamed from: h */
    private void m67482h() {
        if (this.f74741u) {
            this.f74741u = false;
        } else if (this.mListView != null) {
            C1352v f = this.mListView.mo4847f(0);
            if (f instanceof HotSearchImageViewHolder) {
                ((HotSearchImageViewHolder) f).mo56187d();
            }
        }
    }

    public void onDestroy() {
        super.onDestroy();
        C26009d.f68671j.mo53461a(getContext());
        this.f74740t.removeCallbacksAndMessages(null);
    }

    public void onDestroyView() {
        C27903j jVar = (C27903j) ((C27722e) this.mListView.getAdapter()).f72753e;
        if (jVar != null) {
            jVar.mo56316a(true);
        }
        if (this.mListView != null) {
            this.mListView.setAdapter(null);
        }
        super.onDestroyView();
    }

    /* renamed from: i */
    private void m67483i() {
        if (((this.mRefreshLayout != null && this.mRefreshLayout.isEnabled()) || (this.f74729e != null && this.f74729e.isEnabled())) && this.mStatusView != null && this.mStatusView.mo19210d(true)) {
            if (this.mStatusView.f28645b) {
                this.f74727c.mo58509a(true);
                return;
            }
            this.f74727c.mo58510a(true, true);
        }
    }

    /* renamed from: j */
    private void m67484j() {
        if (((this.mRefreshLayout != null && this.mRefreshLayout.isEnabled()) || (this.f74729e != null && this.f74729e.isEnabled())) && this.mStatusView != null && this.mStatusView.mo19210d(true)) {
            mo58045b(true);
        }
    }

    /* renamed from: e */
    public final void mo58046e() {
        if (this.mRefreshLayout != null) {
            BannerSwipeRefreshLayout bannerSwipeRefreshLayout = this.mRefreshLayout;
            C26009d.f68671j.mo53461a(getContext());
            bannerSwipeRefreshLayout.setEnabled(true);
        }
        if (this.f74729e != null) {
            AbsLoftNestedRefreshLayout absLoftNestedRefreshLayout = this.f74729e;
            C26009d.f68671j.mo53461a(getContext());
            absLoftNestedRefreshLayout.setEnabled(false);
            AbsLoftNestedRefreshLayout absLoftNestedRefreshLayout2 = this.f74729e;
            C26009d.f68671j.mo53461a(getContext());
            absLoftNestedRefreshLayout2.setEnableExpand(false);
        }
        C26009d.f68671j.mo53461a(getContext());
        mo58043a((C26006a) null);
    }

    public void onPause() {
        super.onPause();
        C23183v.m56778a().mo47907c().mo47776a(Boolean.valueOf(false));
        if (this.f74732l == 1) {
            if (this.f74733m != null) {
                this.f74733m.f93421a.setValue(Boolean.valueOf(false));
            }
            if (this.f74731k != null) {
                this.f74731k.onPause();
            }
            if (!isHidden()) {
                ((C27903j) ((C27722e) this.mListView.getAdapter()).f72753e).mo56316a(true);
            }
        }
    }

    public void onResume() {
        boolean z;
        super.onResume();
        if (this.f74729e != null) {
            C26009d.f68671j.mo53461a(getContext());
            this.f74729e.setEnabled(false);
        }
        if (this.f74732l == 1) {
            if (this.f74731k != null) {
                this.f74731k.onResume();
            }
            if (m67481g()) {
                m67480c(true);
            }
            C27903j jVar = (C27903j) ((C27722e) this.mListView.getAdapter()).f72753e;
            if (HomePageUIFrameServiceImpl.createHomePageUIFrameServicebyMonsterPlugin().getHomePageInflateActivityClass().isInstance(getAnalysis())) {
                z = m67481g();
            } else {
                z = false;
            }
            if (!isHidden() && z) {
                jVar.mo56316a(false);
                if (this.f74737q != null && this.f74737q.mo56614a()) {
                    m67482h();
                }
                if (this.f74733m != null) {
                    this.f74733m.f93421a.setValue(Boolean.valueOf(true));
                }
            }
            if (!isHidden() && C47835dx.m103473a()) {
                C28396b.m67402a();
            }
            if (this.f74736p) {
                this.f74740t.removeCallbacksAndMessages(null);
                this.f74729e.setExpand(false);
                this.f74736p = false;
            }
            if (this.f74726b != null) {
                this.f74726b.mo53463a(C26017b.CLOSE);
            }
            if (this.f74734n || this.f74735o) {
                C26009d.f68671j.mo53461a(getContext());
                FragmentActivity activity = getActivity();
                this.f74735o = false;
                this.f74734n = false;
            }
        }
    }

    /* renamed from: a */
    public final void mo53409a(AbsLoftNestedRefreshLayout absLoftNestedRefreshLayout) {
        this.f74729e = absLoftNestedRefreshLayout;
    }

    /* renamed from: b */
    public final void mo56150b(int i) {
        this.f74732l = i;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58042a(C23268b bVar) {
        this.f74725a.hotSearchLiveData.setValue(bVar);
    }

    /* renamed from: a */
    public final void mo56317a(View view) {
        if (isViewValid()) {
            this.mRefreshLayout.setHeader(view);
        }
    }

    public void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        mo56148a(!z);
    }

    /* renamed from: a */
    public final void mo58043a(C26006a aVar) {
        C18842a.m45934b(new C28710t(this, aVar));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public void mo58045b(boolean z) {
        if (this.mRefreshLayout.isEnabled()) {
            this.mRefreshLayout.setSelected(z);
        }
        if (this.f74729e != null && this.f74729e.isEnabled()) {
            this.f74729e.setSelected(z);
        }
    }

    /* renamed from: c */
    private void m67480c(boolean z) {
        if (this.mListView != null) {
            if (this.f74737q != null) {
                C28199h.m67093a(this.mListView, z);
            }
            int childCount = this.mListView.getChildCount();
            for (int i = 0; i < childCount; i++) {
                C1352v b = this.mListView.mo4812b(this.mListView.getChildAt(i));
                if ((b instanceof HotVideoViewHolder) && b.mItemViewType == C27904a.m66654b()) {
                    ((HotVideoViewHolder) b).mo56189a(z);
                }
            }
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            if (this.mStatusView != null && this.mStatusView.mo19215i()) {
                this.mStatusView.setVisibility(0);
            }
        } else if (this.mStatusView != null && this.mStatusView.mo19215i()) {
            this.mStatusView.setVisibility(4);
        }
        m67480c(bool.booleanValue());
    }

    /* renamed from: a */
    public final void mo56148a(boolean z) {
        if (this.f74733m != null) {
            this.f74733m.f93421a.setValue(Boolean.valueOf(!z));
        }
        if (isViewValid() && this.mListView != null) {
            if (z || this.f74732l == 1) {
                C27903j jVar = (C27903j) ((C27722e) this.mListView.getAdapter()).f72753e;
                if (jVar != null) {
                    jVar.mo56316a(z);
                }
                if (m67485k()) {
                    if (!z) {
                        this.f74739s = System.currentTimeMillis();
                    } else if (this.f74739s != -1) {
                        long currentTimeMillis = System.currentTimeMillis() - this.f74739s;
                        if (currentTimeMillis > 0) {
                            C0013i.m18a((Callable<TResult>) new C28654l<TResult>(this, currentTimeMillis), (Executor) C26890h.m65003a());
                        }
                        this.f74739s = -1;
                    }
                }
                if (!z) {
                    C28396b.m67402a();
                }
            }
        }
    }

    public void onCreate(Bundle bundle) {
        FragmentInstrumentation.onCreate("com.ss.android.ugc.aweme.discover.ui.DiscoverFragment");
        super.onCreate(bundle);
        this.f74725a = (SearchStateViewModel) C0214z.m440a(getActivity()).mo359a(SearchStateViewModel.class);
        this.f74727c = (DiscoverViewModel) C0214z.m438a((Fragment) this).mo359a(DiscoverViewModel.class);
        this.f74727c.f75760d.observe(this, new C28652j(this));
        this.f74727c.f75757a.observe(this, new C28653k(this));
        this.f74727c.f75758b.observe(this, new C28655m(this));
        this.f74727c.f75759c.observe(this, new C28656n(this));
        this.f74727c.f75761e.observe(this, new C28659o(this));
    }

    public void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        if (this.f74729e != null) {
            if (z) {
                this.f74729e.setEnabled(false);
            } else {
                mo58046e();
            }
        }
        if (isViewValid()) {
            if (z || this.f74732l == 1) {
                if (this.f74731k != null) {
                    this.f74731k.mo48652a(z);
                }
                if (!z && this.f74737q != null && this.f74737q.mo56614a()) {
                    m67482h();
                }
                if (this.f74733m != null) {
                    this.f74733m.f93421a.setValue(Boolean.valueOf(!z));
                }
                if (this.mListView != null) {
                    C27903j jVar = (C27903j) ((C27722e) this.mListView.getAdapter()).f72753e;
                    if (jVar != null) {
                        jVar.mo56316a(z);
                    }
                    if (!z) {
                        C28396b.m67402a();
                    }
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo58044a(Float f) {
        if (this.f74726b != null) {
            C26015a aVar = this.f74726b;
            float floatValue = f.floatValue();
            aVar.f68720g = C9432q.m18692c(aVar.f68724k, floatValue);
            if (floatValue == 0.0f) {
                if (aVar.f68722i == C26017b.BACKING || aVar.f68722i == C26017b.REFRESH_BACK) {
                    aVar.mo53463a(C26017b.CLOSE);
                }
            } else if (aVar.f68720g < 60) {
                if (aVar.f68722i == C26017b.CLOSE || aVar.f68722i == C26017b.PULL_DOWN_SECOND || aVar.f68722i == C26017b.PULL_DOWN_THIRD) {
                    aVar.mo53463a(C26017b.PULL_DOWN_FIRST);
                }
            } else if (aVar.f68720g < 120) {
                if (aVar.f68722i == C26017b.CLOSE || aVar.f68722i == C26017b.PULL_DOWN_FIRST || aVar.f68722i == C26017b.PULL_DOWN_THIRD) {
                    aVar.mo53463a(C26017b.PULL_DOWN_SECOND);
                }
            } else if (aVar.f68722i == C26017b.CLOSE || aVar.f68722i == C26017b.PULL_DOWN_FIRST || aVar.f68722i == C26017b.PULL_DOWN_SECOND) {
                aVar.mo53463a(C26017b.PULL_DOWN_THIRD);
            }
            if (aVar.f68719f == 0.0f) {
                aVar.mo53477t();
            }
            if (aVar.f68722i == C26017b.PULL_DOWN_FIRST || aVar.f68722i == C26017b.PULL_DOWN_SECOND || aVar.f68722i == C26017b.PULL_DOWN_THIRD) {
                float measuredHeight = 1.0f - (floatValue / ((float) aVar.mo53464g().getMeasuredHeight()));
                aVar.f68716c = C9432q.m18687b(aVar.f68724k, -40.0f * measuredHeight);
                aVar.f68717d = C9432q.m18687b(aVar.f68724k, measuredHeight * -15.0f);
                aVar.mo53466i().setTranslationY(aVar.f68716c);
                aVar.mo53465h().setTranslationY(aVar.f68717d);
            }
            if ((aVar.f68722i == C26017b.BACKING || aVar.f68722i == C26017b.PULL_DOWN_FIRST) && aVar.f68720g < 60) {
                float f2 = ((aVar.f68719f / 2.0f) * ((float) (60 - aVar.f68720g))) / 60.0f;
                float f3 = ((float) aVar.f68720g) / 60.0f;
                aVar.mo53471n().setVisibility(0);
                aVar.mo53474q().setScaleX(f3);
                aVar.mo53474q().setScaleY(f3);
                aVar.mo53472o().setTranslationX(f2);
                aVar.mo53473p().setTranslationX(-f2);
            } else if (aVar.f68722i != C26017b.TO_REFRESH || aVar.f68720g < 60) {
                aVar.mo53474q().setScaleX(1.0f);
                aVar.mo53474q().setScaleY(1.0f);
                aVar.mo53472o().setTranslationX(0.0f);
                aVar.mo53473p().setTranslationX(0.0f);
            } else {
                float f4 = ((aVar.f68719f / 2.0f) * ((float) (aVar.f68721h - aVar.f68720g))) / ((float) (aVar.f68721h - 60));
                float f5 = ((float) (aVar.f68720g - 60)) / ((float) (aVar.f68721h - 60));
                aVar.mo53471n().setVisibility(0);
                aVar.mo53474q().setScaleX(f5);
                aVar.mo53474q().setScaleY(f5);
                aVar.mo53472o().setTranslationX(f4);
                aVar.mo53473p().setTranslationX(-f4);
            }
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        C10722c a = C48190g.m104428a(getActivity(), new C28660p(this));
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setSupportDelayVisible(true);
        dmtDefaultView.setStatus(a);
        if (this.mStatusView != null) {
            this.mStatusView.setBuilder(C10719a.m21676a((Context) getActivity()).mo19224a((int) R.string.bx4).mo19234c((View) dmtDefaultView));
            this.mStatusView.setUseScreenHeight(getContext().getResources().getDimensionPixelSize(R.dimen.a04));
        }
        this.f74730j = new WrapLinearLayoutManager(getContext(), 1, false);
        this.mListView.setLayoutManager(this.f74730j);
        this.mListView.getItemAnimator().f4731l = 0;
        this.mListView.setLabel("discover_list");
        C47729bp.m103326a("discover_list").mo95020a((RecyclerView) this.mListView);
        C27903j jVar = new C27903j(this);
        C28068a aVar = jVar.f73294b;
        if (aVar != null) {
            aVar.f73744b = this;
        }
        this.f74737q = new C28199h();
        this.f74737q.f74029a = this;
        this.mListView.mo4801a((C1340m) this.f74737q);
        this.f74738r = new C28194c();
        this.mListView.mo4801a((C1340m) this.f74738r);
        C27722e eVar = new C27722e(jVar);
        C28661q qVar = new C28661q(this);
        C52711k.m112240b(qVar, "listener");
        eVar.f72763g = qVar;
        this.mListView.setAdapter(eVar);
        if (C23337c.m57398a()) {
            this.mListView.mo4801a((C1340m) new C1340m() {
                public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                    super.onScrollStateChanged(recyclerView, i);
                    switch (i) {
                        case 0:
                            if (C13771c.m27875c().mo26195d()) {
                                C13771c.m27875c().mo26193c();
                                break;
                            }
                            break;
                        case 1:
                            if (DiscoverFragment.this.f74728d != 2) {
                                if (C13771c.m27875c().mo26195d()) {
                                    C13771c.m27875c().mo26193c();
                                    break;
                                }
                            } else {
                                C13771c.m27875c().mo26190b();
                                break;
                            }
                            break;
                        case 2:
                            C13771c.m27875c().mo26190b();
                            break;
                    }
                    DiscoverFragment.this.f74728d = i;
                }
            });
        }
        DiscoveryRecyclerView discoveryRecyclerView = this.mListView;
        C284352 r2 = new C32529e(getResources().getColor(R.color.a0x), (int) C9432q.m18687b(getContext(), 16.0f), (int) C9432q.m18687b(getContext(), 16.0f), 1, jVar) {

            /* renamed from: a */
            final /* synthetic */ C27903j f74745a;

            public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
                int f = RecyclerView.m4275f(view);
                if (f > 0 && f < this.f74745a.getItemCount() && this.f74745a.getItemViewType(f) == C27904a.m66653a()) {
                    super.getItemOffsets(rect, view, recyclerView, sVar);
                }
            }

            {
                this.f74745a = r6;
            }
        };
        discoveryRecyclerView.mo4798a((C1331h) r2);
        this.mRefreshLayout.mo48779a(false, (int) C9432q.m18687b((Context) getActivity(), 49.0f), (int) C9432q.m18687b((Context) getActivity(), 113.0f));
        this.mRefreshLayout.setOnRefreshListener(new C28662r(this));
        if (this.f74729e != null) {
            this.f74729e.setIRefresh(new C26004c() {
                /* renamed from: e */
                public final void mo53407e() {
                    if (DiscoverFragment.this.f74726b != null) {
                        DiscoverFragment.this.f74726b.mo53407e();
                    }
                }

                /* renamed from: f */
                public final void mo53408f() {
                    if (DiscoverFragment.this.isViewValid()) {
                        if (!C28711u.m67974a(DiscoverFragment.this.getContext())) {
                            C10691a.m21542b(DiscoverFragment.this.getContext(), (int) R.string.cg1).mo19066a();
                            DiscoverFragment.this.f74729e.setRefreshing(false);
                            return;
                        }
                        DiscoverFragment.this.mo58047f();
                        if (DiscoverFragment.this.f74726b != null) {
                            DiscoverFragment.this.f74726b.mo53408f();
                        }
                    }
                }
            });
            this.f74729e.mo53373a(new C26003b() {
                /* renamed from: d */
                public final void mo53406d() {
                    DiscoverFragment.this.mo58046e();
                }

                /* renamed from: c */
                public final void mo53405c() {
                    if (DiscoverFragment.this.f74726b != null) {
                        DiscoverFragment.this.f74726b.mo53405c();
                    }
                }

                /* renamed from: b */
                public final void mo53404b() {
                    if (DiscoverFragment.this.f74726b != null) {
                        DiscoverFragment.this.f74726b.mo53404b();
                    }
                    C26009d.f68671j.mo53461a(DiscoverFragment.this.getContext());
                }

                /* renamed from: a */
                public final void mo53403a() {
                    C23183v.m56778a().mo47907c().mo47776a(Boolean.valueOf(false));
                    DiscoverFragment discoverFragment = DiscoverFragment.this;
                    C26009d.f68671j.mo53461a(DiscoverFragment.this.getContext());
                    discoverFragment.mo58043a((C26006a) null);
                    if (DiscoverFragment.this.f74726b != null) {
                        DiscoverFragment.this.f74726b.mo53403a();
                    }
                }
            });
            this.f74729e.getTotalConsume().observe(this, new C28663s(this));
            mo58046e();
        }
        mo58047f();
        C26904c.m65029a(this.mListView, jVar);
        this.f74733m = (MainAnimViewModel) C0214z.m440a(getActivity()).mo359a(MainAnimViewModel.class);
        this.f74733m.f93421a.observe(this, this);
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.b9h, viewGroup, false);
        ButterKnife.bind((Object) this, inflate);
        if (!m67485k()) {
            this.f74731k = new AnalysisStayTimeFragmentComponent(this, true);
        }
        return inflate;
    }
}
