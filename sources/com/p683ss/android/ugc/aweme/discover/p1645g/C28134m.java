package com.p683ss.android.ugc.aweme.discover.p1645g;

import android.content.Context;
import android.os.Bundle;
import android.support.design.widget.AppBarLayout;
import android.support.p030v4.app.C0643c;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.router.SmartRouter;
import com.p683ss.android.ugc.aweme.base.C23474b.C23475a;
import com.p683ss.android.ugc.aweme.challenge.C24579d;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26875a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26877c;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.discover.abtest.GuideSearchUIOptimization;
import com.p683ss.android.ugc.aweme.discover.adapter.C27819ao;
import com.p683ss.android.ugc.aweme.discover.mob.C28393ak;
import com.p683ss.android.ugc.aweme.discover.model.GuideSearchWord;
import com.p683ss.android.ugc.aweme.discover.model.QueryCorrectInfo;
import com.p683ss.android.ugc.aweme.discover.p1635a.C27718c;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28604by;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28719z;
import com.p683ss.android.ugc.aweme.discover.panel.C28428b;
import com.p683ss.android.ugc.aweme.discover.panel.C28431e;
import com.p683ss.android.ugc.aweme.discover.widget.GuideSearchHeadView;
import com.p683ss.android.ugc.aweme.feed.experiment.VideoShowTypeExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30179b;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30460m;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30464q;
import com.p683ss.android.ugc.aweme.feed.utils.C31213v;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import com.p683ss.android.ugc.aweme.search.p2124d.C41412a;
import com.p683ss.android.ugc.common.component.p2417a.C48521c;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.g.m */
public final class C28134m extends C28604by<Aweme> implements C24579d, C26846a, C26877c<Aweme>, C30462o, C30464q {

    /* renamed from: O */
    private HashMap f73876O;

    /* renamed from: a */
    public C28428b f73877a;

    /* renamed from: c */
    private C28123f f73878c;

    /* renamed from: d */
    private ViewGroup f73879d;

    /* renamed from: com.ss.android.ugc.aweme.discover.g.m$a */
    static final class C28135a implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C28134m f73880a;

        /* renamed from: b */
        final /* synthetic */ List f73881b;

        /* renamed from: c */
        final /* synthetic */ boolean f73882c;

        C28135a(C28134m mVar, List list, boolean z) {
            this.f73880a = mVar;
            this.f73881b = list;
            this.f73882c = z;
        }

        public final void run() {
            C28428b bVar = this.f73880a.f73877a;
            if (bVar == null) {
                C52711k.m112234a();
            }
            bVar.mo47018a(this.f73881b, this.f73882c);
            this.f73880a.mo58236I();
        }
    }

    /* renamed from: K */
    private static String m66972K() {
        return "search_result";
    }

    /* renamed from: a */
    public final View mo56545a(int i) {
        if (this.f73876O == null) {
            this.f73876O = new HashMap();
        }
        View view = (View) this.f73876O.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f73876O.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public final void mo56546a(String str) {
        C52711k.m112240b(str, "keyword");
    }

    public final void aU_() {
        ar_();
    }

    /* renamed from: b_ */
    public final boolean mo56547b_(boolean z) {
        return false;
    }

    /* renamed from: j */
    public final void mo56548j() {
        if (this.f73876O != null) {
            this.f73876O.clear();
        }
    }

    /* renamed from: k */
    public final void mo56557k() {
    }

    /* renamed from: l */
    public final String mo56549l() {
        return "video";
    }

    /* renamed from: q */
    public final void mo56559q() {
        super.mo56559q();
        mo58235H();
    }

    /* renamed from: L */
    private int m66973L() {
        if (m66975N()) {
            return 15;
        }
        return 9;
    }

    /* renamed from: p */
    public final boolean mo56558p() {
        if (m66975N()) {
            return true;
        }
        return false;
    }

    /* renamed from: M */
    private final void m66974M() {
        String str;
        C28123f fVar = this.f73878c;
        if (fVar != null) {
            if (this.f74963o == 9) {
                str = "guide_search";
            } else {
                str = "video_search";
            }
            fVar.f73848c = str;
        }
    }

    /* renamed from: N */
    private static boolean m66975N() {
        if (C10181b.m20511a().mo18168a(VideoShowTypeExperiment.class, true, "video_search_show_style", 31744, 0) == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: B */
    public final SparseArray<C48521c> mo48685B() {
        SparseArray<C48521c> B = super.mo48685B();
        C52711k.m112236a((Object) B, "super.registerComponents()");
        B.append(C23475a.f62543b, this.f73877a);
        return B;
    }

    public final boolean aW_() {
        C28127h hVar = (C28127h) mo58297J().mo54803n();
        if (hVar != null) {
            return hVar.isHasMore();
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
    }

    public final void onDestroyView() {
        super.onDestroyView();
        if (mo58297J() != null) {
            mo58297J().mo46991S_();
        }
        C28428b bVar = this.f73877a;
        if (bVar == null) {
            C52711k.m112234a();
        }
        bVar.mo55813m();
        mo56548j();
    }

    /* renamed from: o */
    public final void mo56551o() {
        C28428b bVar = this.f73877a;
        if (bVar == null) {
            C52711k.m112234a();
        }
        C27819ao d = bVar.mo58029d();
        C52711k.m112236a((Object) d, "mFragmentPanel!!.cellFeedAdapter");
        mo58239a((C26840g<D>) d);
        C28428b bVar2 = this.f73877a;
        if (bVar2 == null) {
            C52711k.m112234a();
        }
        C27718c cVar = bVar2.f74697e;
        C52711k.m112236a((Object) cVar, "mFragmentPanel!!.cellFeedAdapterWrapper");
        mo58240a(cVar);
    }

    public C28134m() {
        if (this.f73877a == null) {
            if (m66975N()) {
                this.f73877a = new C28431e(m66972K(), this, this, m66973L());
            } else {
                this.f73877a = new C28428b(m66972K(), this, this, m66973L());
            }
        }
        C28428b bVar = this.f73877a;
        if (bVar == null) {
            C52711k.m112234a();
        }
        this.f73877a = bVar;
        this.f74962n = C28608ca.f75135c;
    }

    /* renamed from: n */
    public final void mo56550n() {
        mo58298a((C28128i<?>) new C28126g<Object>());
        mo58297J().mo54800a((C26877c) this);
        mo58297J().f73866b = this;
        mo58297J().mo54838a((C26878d) this.f73877a);
        this.f73878c = new C28123f();
        C28128i J = mo58297J();
        if (J != null) {
            ((C28126g) J).mo54799a(this.f73878c);
            m66974M();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.discover.presenter.SearchAwemePresenter");
    }

    /* renamed from: a */
    public final void mo56554a(C41440e eVar) {
        C52711k.m112240b(eVar, "param");
        super.mo56554a(eVar);
        m66974M();
    }

    /* renamed from: b */
    public final void mo56556b(int i) {
        C41412a aVar;
        C28128i J = mo58297J();
        Object[] objArr = new Object[5];
        objArr[0] = Integer.valueOf(1);
        objArr[1] = this.f74960l;
        objArr[2] = Integer.valueOf(i);
        objArr[3] = Integer.valueOf(this.f74967s);
        C41440e eVar = this.f74957e;
        if (eVar != null) {
            aVar = eVar.getFilterOption();
        } else {
            aVar = null;
        }
        objArr[4] = aVar;
        J.mo44934a_(objArr);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        C28428b bVar = this.f73877a;
        if (bVar == null) {
            C52711k.m112234a();
        }
        bVar.mo55808f(z);
        if (!z) {
            C28428b bVar2 = this.f73877a;
            if (bVar2 == null) {
                C52711k.m112234a();
            }
            bVar2.mo58038n();
            return;
        }
        C28428b bVar3 = this.f73877a;
        if (bVar3 == null) {
            C52711k.m112234a();
        }
        bVar3.mo58037k();
    }

    /* renamed from: a */
    public final void mo56555a(List<GuideSearchWord> list) {
        if (isViewValid()) {
            if (C10193n.m20607a().mo18200a(GuideSearchUIOptimization.class, "search_new_gs_style", C10181b.m20511a().mo18175c().getSearchNewGsStyle(), 1) == 1) {
                QueryCorrectInfo queryCorrectInfo = null;
                if (mo58297J() instanceof C28126g) {
                    C28128i J = mo58297J();
                    if (J != null) {
                        C28127h hVar = (C28127h) J.mo54803n();
                        if (hVar != null) {
                            queryCorrectInfo = hVar.mo56538e();
                        }
                    }
                }
                if (queryCorrectInfo != null) {
                    C28719z zVar = this.f75028E;
                    if (zVar != null) {
                        zVar.mo58366a(list, this.f74960l, mo56549l());
                    }
                }
            }
            if (this.f74957e != null) {
                C41440e eVar = this.f74957e;
                if (eVar == null) {
                    C52711k.m112234a();
                }
                if (eVar.fromGuideSearch() && C10193n.m20607a().mo18200a(GuideSearchUIOptimization.class, "search_new_gs_style", C10181b.m20511a().mo18175c().getSearchNewGsStyle(), 1) == 1) {
                    return;
                }
            }
            if (C9376b.m18558a((Collection<T>) list)) {
                C28719z zVar2 = this.f75028E;
                if (zVar2 != null) {
                    zVar2.mo58366a(list, this.f74960l, mo56549l());
                }
            } else {
                if (this.f75028E == null) {
                    this.f75028E = new C28719z((GuideSearchHeadView) this.f75027D.getValue());
                }
                C28719z zVar3 = this.f75028E;
                if (zVar3 != null) {
                    zVar3.mo58366a(list, this.f74960l, mo56549l());
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo47019a(boolean z) {
        C28428b bVar = this.f73877a;
        if (bVar == null) {
            C52711k.m112234a();
        }
        bVar.mo58035a(z);
    }

    /* renamed from: a */
    public final void mo56552a(int i, C41412a aVar) {
        super.mo56552a(i, aVar);
        if (aVar == null) {
            mo58249w();
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<? extends Aweme> list, boolean z) {
        C28428b bVar = this.f73877a;
        if (bVar == null) {
            C52711k.m112234a();
        }
        bVar.mo47026b(list, z);
    }

    /* renamed from: c */
    public final void mo47029c(List<? extends Aweme> list, boolean z) {
        C52711k.m112240b(list, "list");
        C28428b bVar = this.f73877a;
        if (bVar == null) {
            C52711k.m112234a();
        }
        bVar.mo47026b(list, z);
    }

    /* renamed from: a */
    public final void mo47018a(List<? extends Aweme> list, boolean z) {
        C52711k.m112240b(list, "list");
        if (isViewValid()) {
            RecyclerView s = mo58245s();
            if (s != null) {
                s.post(new C28135a(this, list, z));
            }
            mo58246t().mo19209d();
            mo58235H();
            mo56664b(true);
        }
    }

    /* renamed from: a */
    public final void mo56553a(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        mo58230A();
        C28428b bVar = this.f73877a;
        if (bVar == null) {
            C52711k.m112234a();
        }
        bVar.mo55784a(view, bundle);
        mo56551o();
        mo58250x().f70682s = getResources().getColor(R.color.a1a);
        C28428b bVar2 = this.f73877a;
        if (bVar2 == null) {
            C52711k.m112234a();
        }
        bVar2.f74707k = m66973L();
        C28428b bVar3 = this.f73877a;
        if (bVar3 == null) {
            C52711k.m112234a();
        }
        C1340m mVar = new C30460m();
        if (bVar3.mListView != null) {
            bVar3.mListView.mo4801a(mVar);
        }
        C28428b bVar4 = this.f73877a;
        if (bVar4 == null) {
            C52711k.m112234a();
        }
        bVar4.mo58025a(this);
        C28428b bVar5 = this.f73877a;
        if (bVar5 == null) {
            C52711k.m112234a();
        }
        bVar5.f74704h = this;
        C28428b bVar6 = this.f73877a;
        if (bVar6 == null) {
            C52711k.m112234a();
        }
        bVar6.mo58034a("");
        if (mo56558p()) {
            mo58245s().setPadding(0, (int) C9432q.m18687b(mo58245s().getContext(), 8.0f), 0, 0);
            mo58245s().setClipToPadding(false);
        }
        AppBarLayout v = mo58248v();
        if (v != null) {
            v.setBackground(null);
        }
        this.f73879d = (ViewGroup) view.findViewById(R.id.eu_);
        ViewGroup viewGroup = this.f73879d;
        if (viewGroup != null) {
            viewGroup.setBackground(null);
        }
    }

    /* renamed from: a */
    public final void mo50347a(View view, Aweme aweme, String str) {
        String str2;
        C52711k.m112240b(view, "view");
        C52711k.m112240b(str, "label");
        if (!(C32800a.m75679a(view) || aweme == null || getActivity() == null)) {
            C28127h hVar = (C28127h) mo58297J().mo54803n();
            if (hVar != null) {
                C31213v.m72896a((C26875a) hVar);
                Bundle bundle = new Bundle();
                bundle.putString("id", aweme.getAid());
                bundle.putString("refer", str);
                bundle.putString("video_from", "from_search");
                bundle.putInt("profile_enterprise_type", aweme.getEnterpriseType());
                bundle.putInt("page_type", m66973L());
                bundle.putString("search_keyword", this.f74960l);
                C0643c b = C0643c.m1729b(view, 0, 0, view.getWidth(), view.getHeight());
                C52711k.m112236a((Object) b, "ActivityOptionsCompat.ma… view.width, view.height)");
                SmartRouter.buildRoute((Context) getActivity(), "//aweme/detail").withParam(bundle).withBundleAnimation(b.mo2171a()).open();
                C30179b.m70792a(aweme);
                String K = m66972K();
                C41440e eVar = this.f74957e;
                if (eVar != null) {
                    str2 = eVar.getCurrentSearchKeyword();
                } else {
                    str2 = null;
                }
                C28393ak.m67388a(view, K, aweme, str2);
            } else {
                throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.common.presenter.BaseListModel<*, *>");
            }
        }
    }
}
