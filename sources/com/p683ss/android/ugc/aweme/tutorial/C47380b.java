package com.p683ss.android.ugc.aweme.tutorial;

import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.os.Bundle;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.widget.SwipeRefreshLayout;
import android.support.p030v4.widget.SwipeRefreshLayout.C1091b;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.apm.agent.instrumentation.FragmentInstrumentation;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.p683ss.android.ugc.aweme.base.widget.C23745a;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a;
import com.p683ss.android.ugc.aweme.tutorial.net.C47393a;
import com.p683ss.android.ugc.aweme.tutorial.p2374a.C47373a;
import com.p683ss.android.ugc.aweme.tutorial.p2374a.C47378e;
import com.p683ss.android.ugc.aweme.views.WrapGridLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tutorial.b */
public final class C47380b extends Fragment {

    /* renamed from: a */
    RecyclerView f119569a;

    /* renamed from: b */
    SwipeRefreshLayout f119570b;

    /* renamed from: c */
    DmtStatusView f119571c;

    /* renamed from: d */
    String f119572d;

    /* renamed from: e */
    int f119573e;

    /* renamed from: f */
    int f119574f;

    /* renamed from: g */
    int f119575g;

    /* renamed from: h */
    C47388e f119576h;

    /* renamed from: i */
    boolean f119577i;

    /* renamed from: j */
    boolean f119578j = true;

    /* renamed from: k */
    private final int f119579k = 10;

    /* renamed from: l */
    private final C47393a f119580l = new C47393a();

    /* renamed from: m */
    private HashMap f119581m;

    /* renamed from: com.ss.android.ugc.aweme.tutorial.b$a */
    static final class C47381a implements C1091b {

        /* renamed from: a */
        final /* synthetic */ C47380b f119582a;

        C47381a(C47380b bVar) {
            this.f119582a = bVar;
        }

        public final void onRefresh() {
            this.f119582a.mo94680b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.b$b */
    static final class C47382b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C47380b f119583a;

        C47382b(C47380b bVar) {
            this.f119583a = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f119583a.mo94678a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.b$c */
    static final class C47383c implements C26846a {

        /* renamed from: a */
        final /* synthetic */ C47380b f119584a;

        C47383c(C47380b bVar) {
            this.f119584a = bVar;
        }

        public final void ar_() {
            this.f119584a.mo94678a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.b$d */
    static final class C47384d<T> implements C0199s<C37721a<C47378e>> {

        /* renamed from: a */
        final /* synthetic */ C47380b f119585a;

        C47384d(C47380b bVar) {
            this.f119585a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            ArrayList<C47373a> arrayList;
            C37721a aVar = (C37721a) obj;
            C47380b bVar = this.f119585a;
            if (aVar != null) {
                C47378e eVar = (C47378e) aVar.f96125a;
                boolean z2 = false;
                if (eVar != null) {
                    if (eVar.f119566e < bVar.f119575g) {
                        z = true;
                    } else {
                        z = false;
                    }
                    if (eVar.f119566e == 0) {
                        z2 = true;
                    }
                } else {
                    z = false;
                }
                if (!bVar.f119577i || z2) {
                    if (aVar.f96126b == C37722a.LOADING) {
                        DmtStatusView dmtStatusView = bVar.f119571c;
                        if (dmtStatusView == null) {
                            C52711k.m112237a("statusView");
                        }
                        dmtStatusView.mo19212f();
                    } else if (aVar.f96126b == C37722a.ERROR) {
                        DmtStatusView dmtStatusView2 = bVar.f119571c;
                        if (dmtStatusView2 == null) {
                            C52711k.m112237a("statusView");
                        }
                        dmtStatusView2.mo19214h();
                    } else if (aVar.f96126b == C37722a.SUCCESS) {
                        C47378e eVar2 = (C47378e) aVar.f96125a;
                        if (eVar2 == null || eVar2.f119564c != 0) {
                            DmtStatusView dmtStatusView3 = bVar.f119571c;
                            if (dmtStatusView3 == null) {
                                C52711k.m112237a("statusView");
                            }
                            dmtStatusView3.mo19214h();
                            return;
                        }
                        C47378e eVar3 = (C47378e) aVar.f96125a;
                        if (eVar3 != null) {
                            if (C9414h.m18630a(eVar3.f119565d)) {
                                DmtStatusView dmtStatusView4 = bVar.f119571c;
                                if (dmtStatusView4 == null) {
                                    C52711k.m112237a("statusView");
                                }
                                dmtStatusView4.mo19213g();
                            } else {
                                DmtStatusView dmtStatusView5 = bVar.f119571c;
                                if (dmtStatusView5 == null) {
                                    C52711k.m112237a("statusView");
                                }
                                dmtStatusView5.mo19209d();
                                bVar.f119577i = true;
                            }
                            bVar.mo94679a(eVar3, z, eVar3.f119566e);
                        }
                    }
                } else if (aVar != null) {
                    if (aVar.f96126b == C37722a.LOADING) {
                        C47388e eVar4 = bVar.f119576h;
                        if (eVar4 == null) {
                            C52711k.m112237a("tutorialListAdapter");
                        }
                        eVar4.am_();
                    } else {
                        if (aVar.f96126b != C37722a.ERROR) {
                            C47378e eVar5 = (C47378e) aVar.f96125a;
                            if (eVar5 != null && eVar5.f119564c == 0) {
                                if (aVar.f96126b == C37722a.SUCCESS) {
                                    C47378e eVar6 = (C47378e) aVar.f96125a;
                                    if (eVar6 != null) {
                                        arrayList = eVar6.f119565d;
                                    } else {
                                        arrayList = null;
                                    }
                                    if (C9414h.m18630a(arrayList)) {
                                        C47388e eVar7 = bVar.f119576h;
                                        if (eVar7 == null) {
                                            C52711k.m112237a("tutorialListAdapter");
                                        }
                                        eVar7.ao_();
                                    } else {
                                        C47388e eVar8 = bVar.f119576h;
                                        if (eVar8 == null) {
                                            C52711k.m112237a("tutorialListAdapter");
                                        }
                                        eVar8.ao_();
                                        M m = aVar.f96125a;
                                        if (m == null) {
                                            C52711k.m112234a();
                                        }
                                        C52711k.m112236a((Object) m, "liveDataWrapper.response!!");
                                        C47378e eVar9 = (C47378e) m;
                                        M m2 = aVar.f96125a;
                                        if (m2 == null) {
                                            C52711k.m112234a();
                                        }
                                        bVar.mo94679a(eVar9, z, ((C47378e) m2).f119566e);
                                    }
                                }
                                return;
                            }
                        }
                        C47388e eVar10 = bVar.f119576h;
                        if (eVar10 == null) {
                            C52711k.m112237a("tutorialListAdapter");
                        }
                        eVar10.co_();
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.tutorial.b$e */
    static final class C47385e<T> implements C0199s<C37721a<C47378e>> {

        /* renamed from: a */
        final /* synthetic */ C47380b f119586a;

        C47385e(C47380b bVar) {
            this.f119586a = bVar;
        }

        /* JADX WARNING: Code restructure failed: missing block: B:11:0x001d, code lost:
            if (((com.p683ss.android.ugc.aweme.tutorial.p2374a.C47378e) r1).f119564c != 0) goto L_0x00a7;
         */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final /* synthetic */ void onChanged(java.lang.Object r5) {
            /*
                r4 = this;
                com.ss.android.ugc.aweme.mvp.b.a r5 = (com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a) r5
                com.ss.android.ugc.aweme.tutorial.b r0 = r4.f119586a
                if (r5 != 0) goto L_0x0007
                return
            L_0x0007:
                com.ss.android.ugc.aweme.mvp.b.a$a r1 = r5.f96126b
                com.ss.android.ugc.aweme.mvp.b.a$a r2 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a.ERROR
                r3 = 0
                if (r1 == r2) goto L_0x00a7
                M r1 = r5.f96125a
                if (r1 == 0) goto L_0x0021
                M r1 = r5.f96125a
                if (r1 != 0) goto L_0x0019
                p2628d.p2639f.p2641b.C52711k.m112234a()
            L_0x0019:
                com.ss.android.ugc.aweme.tutorial.a.e r1 = (com.p683ss.android.ugc.aweme.tutorial.p2374a.C47378e) r1
                int r1 = r1.f119564c
                if (r1 == 0) goto L_0x0021
                goto L_0x00a7
            L_0x0021:
                com.ss.android.ugc.aweme.mvp.b.a$a r1 = r5.f96126b
                com.ss.android.ugc.aweme.mvp.b.a$a r2 = com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a.C37722a.SUCCESS
                if (r1 != r2) goto L_0x00a6
                android.support.v4.widget.SwipeRefreshLayout r1 = r0.f119570b
                if (r1 != 0) goto L_0x0030
                java.lang.String r2 = "refreshView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x0030:
                r1.setRefreshing(r3)
                M r5 = r5.f96125a
                com.ss.android.ugc.aweme.tutorial.a.e r5 = (com.p683ss.android.ugc.aweme.tutorial.p2374a.C47378e) r5
                if (r5 != 0) goto L_0x003a
                return
            L_0x003a:
                com.ss.android.ugc.aweme.tutorial.e r1 = r0.f119576h
                if (r1 != 0) goto L_0x0043
                java.lang.String r2 = "tutorialListAdapter"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x0043:
                r1.ao_()
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r1 = r0.f119571c
                if (r1 != 0) goto L_0x004f
                java.lang.String r2 = "statusView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x004f:
                r1.mo19209d()
                long r1 = r5.f119562a
                int r1 = (int) r1
                r0.f119574f = r1
                boolean r1 = r5.f119563b
                r0.f119578j = r1
                com.ss.android.ugc.aweme.tutorial.e r1 = r0.f119576h
                if (r1 != 0) goto L_0x0064
                java.lang.String r2 = "tutorialListAdapter"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x0064:
                r1.mo54785f()
                com.ss.android.ugc.aweme.tutorial.e r1 = r0.f119576h
                if (r1 != 0) goto L_0x0070
                java.lang.String r2 = "tutorialListAdapter"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x0070:
                java.util.ArrayList<com.ss.android.ugc.aweme.tutorial.a.a> r2 = r5.f119565d
                java.util.List r2 = (java.util.List) r2
                r1.mo94683e(r2)
                com.ss.android.ugc.aweme.tutorial.e r1 = r0.f119576h
                if (r1 != 0) goto L_0x0080
                java.lang.String r2 = "tutorialListAdapter"
                p2628d.p2639f.p2641b.C52711k.m112237a(r2)
            L_0x0080:
                r1.notifyDataSetChanged()
                java.util.ArrayList<com.ss.android.ugc.aweme.tutorial.a.a> r5 = r5.f119565d
                java.util.List r5 = (java.util.List) r5
                boolean r5 = com.bytedance.common.utility.C9414h.m18630a(r5)
                if (r5 == 0) goto L_0x009a
                com.bytedance.ies.dmt.ui.widget.DmtStatusView r5 = r0.f119571c
                if (r5 != 0) goto L_0x0096
                java.lang.String r0 = "statusView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x0096:
                r5.mo19213g()
                return
            L_0x009a:
                android.support.v7.widget.RecyclerView r5 = r0.f119569a
                if (r5 != 0) goto L_0x00a3
                java.lang.String r0 = "tutorialRecyclerView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r0)
            L_0x00a3:
                r5.mo4814b(r3)
            L_0x00a6:
                return
            L_0x00a7:
                android.support.v4.widget.SwipeRefreshLayout r5 = r0.f119570b
                if (r5 != 0) goto L_0x00b0
                java.lang.String r1 = "refreshView"
                p2628d.p2639f.p2641b.C52711k.m112237a(r1)
            L_0x00b0:
                r5.setRefreshing(r3)
                android.support.v4.app.FragmentActivity r5 = r0.getActivity()
                android.content.Context r5 = (android.content.Context) r5
                r0 = 2132551587(0x7f1c27a3, float:2.0756537E38)
                com.bytedance.ies.dmt.ui.d.a r5 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21543b(r5, r0, r3)
                r5.mo19066a()
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.tutorial.C47380b.C47385e.onChanged(java.lang.Object):void");
        }
    }

    public final void onHiddenChanged(boolean z) {
        super.onHiddenChanged(z);
        FragmentInstrumentation.onHiddenChanged(this, z);
    }

    public final void onPause() {
        super.onPause();
        FragmentInstrumentation.onPause(this);
    }

    public final void onResume() {
        super.onResume();
        FragmentInstrumentation.onResume(this);
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        FragmentInstrumentation.setUserVisibleHint(this, z);
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        if (this.f119581m != null) {
            this.f119581m.clear();
        }
    }

    /* renamed from: a */
    public final void mo94678a() {
        if (!this.f119578j) {
            C47388e eVar = this.f119576h;
            if (eVar == null) {
                C52711k.m112237a("tutorialListAdapter");
            }
            eVar.ao_();
            return;
        }
        C0198r a = this.f119580l.mo94685a(this.f119573e, this.f119574f, this.f119579k, this.f119575g);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        a.observe(activity, new C47384d(this));
    }

    /* renamed from: b */
    public final void mo94680b() {
        SwipeRefreshLayout swipeRefreshLayout = this.f119570b;
        if (swipeRefreshLayout == null) {
            C52711k.m112237a("refreshView");
        }
        swipeRefreshLayout.setRefreshing(true);
        C0198r a = C47393a.m102772a(this.f119573e, 0, this.f119579k);
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        a.observe(activity, new C47385e(this));
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        if (getActivity() != null) {
            mo94678a();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo94679a(C47378e eVar, boolean z, int i) {
        int i2;
        if (z) {
            C47388e eVar2 = this.f119576h;
            if (eVar2 == null) {
                C52711k.m112237a("tutorialListAdapter");
            }
            i2 = eVar2.mo94682a(i, (List<C47373a>) eVar.f119565d);
        } else {
            C47388e eVar3 = this.f119576h;
            if (eVar3 == null) {
                C52711k.m112237a("tutorialListAdapter");
            }
            eVar3.mo94683e(eVar.f119565d);
            i2 = eVar.f119565d.size();
            this.f119575g++;
        }
        this.f119574f = (int) eVar.f119562a;
        this.f119578j = eVar.f119563b;
        if (i2 == eVar.f119565d.size()) {
            C47388e eVar4 = this.f119576h;
            if (eVar4 == null) {
                C52711k.m112237a("tutorialListAdapter");
            }
            eVar4.notifyItemRangeChanged((int) (eVar.f119562a - ((long) eVar.f119565d.size())), i2);
            return;
        }
        C47388e eVar5 = this.f119576h;
        if (eVar5 == null) {
            C52711k.m112237a("tutorialListAdapter");
        }
        eVar5.notifyDataSetChanged();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(R.layout.b7v, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        View findViewById = inflate.findViewById(R.id.e44);
        C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.…ial_category_load_status)");
        this.f119571c = (DmtStatusView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.e45);
        C52711k.m112236a((Object) findViewById2, "rootView.findViewById(R.…l_category_recycler_view)");
        this.f119569a = (RecyclerView) findViewById2;
        View findViewById3 = inflate.findViewById(R.id.e48);
        C52711k.m112236a((Object) findViewById3, "rootView.findViewById(R.…reation_tutorial_refresh)");
        this.f119570b = (SwipeRefreshLayout) findViewById3;
        SwipeRefreshLayout swipeRefreshLayout = this.f119570b;
        if (swipeRefreshLayout == null) {
            C52711k.m112237a("refreshView");
        }
        swipeRefreshLayout.setOnRefreshListener(new C47381a(this));
        WrapGridLayoutManager wrapGridLayoutManager = new WrapGridLayoutManager(getContext(), 2, 1, false);
        RecyclerView recyclerView = this.f119569a;
        if (recyclerView == null) {
            C52711k.m112237a("tutorialRecyclerView");
        }
        recyclerView.setItemViewCacheSize(2);
        RecyclerView recyclerView2 = this.f119569a;
        if (recyclerView2 == null) {
            C52711k.m112237a("tutorialRecyclerView");
        }
        recyclerView2.setLayoutManager(wrapGridLayoutManager);
        RecyclerView recyclerView3 = this.f119569a;
        if (recyclerView3 == null) {
            C52711k.m112237a("tutorialRecyclerView");
        }
        recyclerView3.mo4798a((C1331h) new C23745a(2, (int) C9432q.m18687b(getContext(), 1.0f), false));
        FragmentActivity activity = getActivity();
        if (activity == null) {
            C52711k.m112234a();
        }
        C52711k.m112236a((Object) activity, "activity!!");
        this.f119576h = new C47388e(activity);
        C47388e eVar = this.f119576h;
        if (eVar == null) {
            C52711k.m112237a("tutorialListAdapter");
        }
        eVar.mo54798c(true);
        RecyclerView recyclerView4 = this.f119569a;
        if (recyclerView4 == null) {
            C52711k.m112237a("tutorialRecyclerView");
        }
        C47388e eVar2 = this.f119576h;
        if (eVar2 == null) {
            C52711k.m112237a("tutorialListAdapter");
        }
        recyclerView4.setAdapter(eVar2);
        DmtStatusView dmtStatusView = this.f119571c;
        if (dmtStatusView == null) {
            C52711k.m112237a("statusView");
        }
        dmtStatusView.setBuilder(C10719a.m21676a(getContext()).mo19227a(R.string.f5o, R.string.f5k, R.string.f5u, new C47382b(this)).mo19224a((int) R.string.bx4).mo19233c(1));
        C47388e eVar3 = this.f119576h;
        if (eVar3 == null) {
            C52711k.m112237a("tutorialListAdapter");
        }
        eVar3.mo54788a((C26846a) new C47383c(this));
        return inflate;
    }
}
