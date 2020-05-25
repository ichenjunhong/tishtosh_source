package com.p683ss.android.ugc.aweme.anchor;

import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.anchor.C22583a.C22584a;
import com.p683ss.android.ugc.aweme.anchor.p1342a.C22589e;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.SwipeRefreshLayout.C23596b;
import com.p683ss.android.ugc.aweme.discover.adapter.C27788aa;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30462o;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30463p;
import com.p683ss.android.ugc.aweme.views.DoubleBallSwipeRefreshLayout;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;
import p2663f.p2664a.p2665a.C53037e;

/* renamed from: com.ss.android.ugc.aweme.anchor.f */
public final class C22670f extends C22583a implements C22677h, C30462o {

    /* renamed from: d */
    public C22599b f60849d;

    /* renamed from: e */
    private C22674g f60850e;

    /* renamed from: f */
    private C53037e f60851f;

    /* renamed from: g */
    private C27788aa<C1352v> f60852g;

    /* renamed from: h */
    private HashMap f60853h;

    /* renamed from: com.ss.android.ugc.aweme.anchor.f$a */
    static final class C22671a implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22670f f60854a;

        C22671a(C22670f fVar) {
            this.f60854a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            FragmentActivity activity = this.f60854a.getActivity();
            if (activity != null) {
                activity.onBackPressed();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.f$b */
    static final class C22672b implements C23596b {

        /* renamed from: a */
        final /* synthetic */ C22670f f60855a;

        C22672b(C22670f fVar) {
            this.f60855a = fVar;
        }

        /* renamed from: a */
        public final void mo47048a() {
            C22599b bVar = this.f60855a.f60849d;
            if (bVar != null) {
                bVar.mo44934a_(Integer.valueOf(1));
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.anchor.f$c */
    static final class C22673c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C22670f f60856a;

        C22673c(C22670f fVar) {
            this.f60856a = fVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C22678i iVar = this.f60856a.f60726a;
            if (iVar != null) {
                iVar.mo46968c();
            }
        }
    }

    /* renamed from: R_ */
    public final void mo47017R_() {
    }

    /* renamed from: a */
    public final View mo46973a(int i) {
        if (this.f60853h == null) {
            this.f60853h = new HashMap();
        }
        View view = (View) this.f60853h.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f60853h.put(Integer.valueOf(i), view);
        }
        return view;
    }

    public final void aS_() {
    }

    /* renamed from: a_ */
    public final void mo47024a_(Exception exc) {
    }

    /* renamed from: b */
    public final void mo46974b() {
        if (this.f60853h != null) {
            this.f60853h.clear();
        }
    }

    /* renamed from: c */
    public final void mo47029c(List<?> list, boolean z) {
    }

    public final /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo46974b();
    }

    public final boolean aW_() {
        C27788aa<C1352v> aaVar = this.f60852g;
        if (aaVar == null || aaVar.f73026a != 0) {
            return true;
        }
        return false;
    }

    /* renamed from: e */
    public final void mo47031e() {
        C27788aa<C1352v> aaVar = this.f60852g;
        if (aaVar != null) {
            aaVar.mo56230a(1);
        }
    }

    public final void onDestroy() {
        C22599b bVar = this.f60849d;
        if (bVar != null) {
            bVar.mo46991S_();
            bVar.aq_();
        }
        super.onDestroy();
    }

    public final void aU_() {
        C22599b bVar = this.f60849d;
        if (bVar != null) {
            bVar.mo44934a_(Integer.valueOf(4));
        }
    }

    /* renamed from: c */
    public final void mo47045c() {
        RelativeLayout relativeLayout = (RelativeLayout) mo46973a((int) R.id.rb);
        C52711k.m112236a((Object) relativeLayout, "cell_search");
        relativeLayout.setVisibility(8);
    }

    /* renamed from: d */
    public final void mo47046d() {
        RelativeLayout relativeLayout = (RelativeLayout) mo46973a((int) R.id.rb);
        C52711k.m112236a((Object) relativeLayout, "cell_search");
        relativeLayout.setVisibility(0);
    }

    public final void aJ_() {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo46973a((int) R.id.ekj);
        C52711k.m112236a((Object) dmtLoadingLayout, "loading_center");
        dmtLoadingLayout.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) mo46973a((int) R.id.b7k);
        C52711k.m112236a((Object) linearLayout, "layout_empty");
        linearLayout.setVisibility(0);
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) mo46973a((int) R.id.eko);
        C52711k.m112236a((Object) doubleBallSwipeRefreshLayout, "loading_refresh");
        doubleBallSwipeRefreshLayout.setRefreshing(false);
        C27788aa<C1352v> aaVar = this.f60852g;
        if (aaVar != null) {
            aaVar.mo56230a(0);
        }
    }

    /* renamed from: a */
    public final void mo47019a(boolean z) {
        C27788aa<C1352v> aaVar = this.f60852g;
        if (aaVar != null) {
            aaVar.mo56230a(z ? 1 : 0);
        }
    }

    /* renamed from: c */
    public final void mo47028c(Exception exc) {
        C27788aa<C1352v> aaVar = this.f60852g;
        if (aaVar != null) {
            aaVar.mo56230a(2);
        }
    }

    /* renamed from: b */
    public final void mo47044b(int i) {
        int i2;
        C53037e eVar = this.f60851f;
        if (eVar != null) {
            i2 = eVar.getItemCount();
        } else {
            i2 = 0;
        }
        C53037e eVar2 = this.f60851f;
        if (eVar2 != null) {
            eVar2.notifyItemRangeChanged(i, i2);
        }
    }

    /* renamed from: b */
    public final void mo47025b(Exception exc) {
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo46973a((int) R.id.ekj);
        C52711k.m112236a((Object) dmtLoadingLayout, "loading_center");
        dmtLoadingLayout.setVisibility(8);
        LinearLayout linearLayout = (LinearLayout) mo46973a((int) R.id.b7k);
        C52711k.m112236a((Object) linearLayout, "layout_empty");
        linearLayout.setVisibility(0);
        DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) mo46973a((int) R.id.eko);
        C52711k.m112236a((Object) doubleBallSwipeRefreshLayout, "loading_refresh");
        doubleBallSwipeRefreshLayout.setRefreshing(false);
        C27788aa<C1352v> aaVar = this.f60852g;
        if (aaVar != null) {
            aaVar.mo56230a(0);
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        CharSequence charSequence;
        C53037e eVar;
        CharSequence charSequence2;
        super.onActivityCreated(bundle);
        this.f60850e = new C22674g(C22584a.m55780a().getTYPE());
        this.f60849d = new C22599b();
        C22599b bVar = this.f60849d;
        if (bVar != null) {
            bVar.mo54800a(this);
        }
        C22599b bVar2 = this.f60849d;
        if (bVar2 != null) {
            bVar2.mo54799a(this.f60850e);
        }
        DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo46973a((int) R.id.ekj);
        C52711k.m112236a((Object) dmtLoadingLayout, "loading_center");
        dmtLoadingLayout.setVisibility(0);
        ((DoubleBallSwipeRefreshLayout) mo46973a((int) R.id.eko)).setOnRefreshListener(new C22672b(this));
        ViewStub viewStub = (ViewStub) getView().findViewById(R.id.eyo);
        C52711k.m112236a((Object) viewStub, "stub_title_bar");
        viewStub.setLayoutResource(C22584a.m55780a().anchorInfo().mo47016c());
        View inflate = ((ViewStub) getView().findViewById(R.id.eyo)).inflate();
        DmtTextView dmtTextView = (DmtTextView) inflate.findViewById(R.id.dl0);
        if (dmtTextView != null) {
            Context context = inflate.getContext();
            if (context != null) {
                charSequence2 = context.getString(C22584a.m55780a().anchorInfo().mo47014a());
            } else {
                charSequence2 = null;
            }
            dmtTextView.setText(charSequence2);
        }
        ImageView imageView = (ImageView) inflate.findViewById(R.id.aru);
        if (imageView != null) {
            imageView.setOnClickListener(new C22671a(this));
        }
        DmtTextView dmtTextView2 = (DmtTextView) mo46973a((int) R.id.f5c);
        C52711k.m112236a((Object) dmtTextView2, "txt_element_search_hint");
        Context context2 = getContext();
        if (context2 != null) {
            charSequence = context2.getString(C22584a.m55780a().anchorInfo().mo47015b());
        } else {
            charSequence = null;
        }
        dmtTextView2.setText(charSequence);
        ((RelativeLayout) mo46973a((int) R.id.rb)).setOnClickListener(new C22673c(this));
        FragmentActivity activity = getActivity();
        if (!(activity instanceof C22678i)) {
            activity = null;
        }
        C22589e adapterFactory = C22584a.m55780a().adapterFactory((C22678i) activity);
        if (adapterFactory != null) {
            eVar = adapterFactory.mo46976a();
        } else {
            eVar = null;
        }
        this.f60851f = eVar;
        this.f60852g = C27788aa.m66530a((C1322a<VH>) this.f60851f);
        RecyclerView recyclerView = (RecyclerView) mo46973a((int) R.id.caf);
        C52711k.m112236a((Object) recyclerView, "recycler_view");
        recyclerView.setAdapter(this.f60852g);
        RecyclerView recyclerView2 = (RecyclerView) mo46973a((int) R.id.caf);
        C52711k.m112236a((Object) recyclerView2, "recycler_view");
        recyclerView2.setLayoutManager(new LinearLayoutManager(getContext()));
        RecyclerView recyclerView3 = (RecyclerView) mo46973a((int) R.id.caf);
        C52711k.m112236a((Object) recyclerView3, "recycler_view");
        recyclerView3.setItemAnimator(null);
        RecyclerView recyclerView4 = (RecyclerView) mo46973a((int) R.id.caf);
        C52711k.m112236a((Object) recyclerView4, "recycler_view");
        recyclerView4.setOnFlingListener(new C30463p((RecyclerView) mo46973a((int) R.id.caf), this));
        C22599b bVar3 = this.f60849d;
        if (bVar3 != null) {
            bVar3.mo44934a_(Integer.valueOf(1));
        }
    }

    /* renamed from: a */
    public final void mo47018a(List<Object> list, boolean z) {
        boolean z2;
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z2 = true;
        } else {
            z2 = false;
        }
        if (!z2) {
            RecyclerView recyclerView = (RecyclerView) mo46973a((int) R.id.caf);
            C52711k.m112236a((Object) recyclerView, "recycler_view");
            recyclerView.setVisibility(0);
            DmtLoadingLayout dmtLoadingLayout = (DmtLoadingLayout) mo46973a((int) R.id.ekj);
            C52711k.m112236a((Object) dmtLoadingLayout, "loading_center");
            dmtLoadingLayout.setVisibility(8);
            DoubleBallSwipeRefreshLayout doubleBallSwipeRefreshLayout = (DoubleBallSwipeRefreshLayout) mo46973a((int) R.id.eko);
            C52711k.m112236a((Object) doubleBallSwipeRefreshLayout, "loading_refresh");
            doubleBallSwipeRefreshLayout.setRefreshing(false);
            LinearLayout linearLayout = (LinearLayout) mo46973a((int) R.id.b7k);
            C52711k.m112236a((Object) linearLayout, "layout_empty");
            linearLayout.setVisibility(8);
            C53037e eVar = this.f60851f;
            if (eVar != null) {
                eVar.mo10432a(list);
            }
            C27788aa<C1352v> aaVar = this.f60852g;
            if (aaVar != null) {
                aaVar.mo56230a(z ? 1 : 0);
            }
            C53037e eVar2 = this.f60851f;
            if (eVar2 != null) {
                eVar2.notifyDataSetChanged();
            }
            C22584a.m55780a().anchorMob().mo47041a(list, z);
        }
    }

    /* renamed from: b */
    public final void mo47026b(List<Object> list, boolean z) {
        boolean z2;
        if (list != null) {
            Collection collection = list;
            if (collection == null || collection.isEmpty()) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (!z2) {
                C53037e eVar = this.f60851f;
                if (eVar != null) {
                    eVar.mo10432a(list);
                }
            }
        }
        C27788aa<C1352v> aaVar = this.f60852g;
        if (aaVar != null) {
            aaVar.mo56230a(z ? 1 : 0);
        }
        C53037e eVar2 = this.f60851f;
        if (eVar2 != null) {
            eVar2.notifyDataSetChanged();
        }
        C22584a.m55780a().anchorMob();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        return layoutInflater.inflate(R.layout.ax1, viewGroup, false);
    }
}
