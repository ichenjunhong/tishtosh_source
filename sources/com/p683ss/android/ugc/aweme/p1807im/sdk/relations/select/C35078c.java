package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1339l;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextPaint;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.p1414e.C23526a;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C34790a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C35049k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.IndexView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.IndexView.C34783a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.SearchHeadListView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.SearchHeadListView.C34789b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34799b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34854a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35200an;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ImTextTitleBar.C35356a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.ss.android.ugc.trill.R;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c */
public abstract class C35078c<VM extends BaseMemberListViewModel<?>> extends C23526a implements C35098g {

    /* renamed from: k */
    static final /* synthetic */ C52767h[] f90244k = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35078c.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/BaseSelectListAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35078c.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;"))};

    /* renamed from: p */
    public static final C35079a f90245p = new C35079a(null);

    /* renamed from: a */
    private View f90246a;

    /* renamed from: b */
    private final C35049k f90247b = new C35049k();

    /* renamed from: c */
    private final C52668f f90248c = C52732g.m112285a(new C35091m(this));

    /* renamed from: d */
    private final C35096e f90249d = new C35096e();

    /* renamed from: e */
    private final C52668f f90250e = C52732g.m112285a(new C35093o(this));

    /* renamed from: j */
    private HashMap f90251j;

    /* renamed from: l */
    public View f90252l;

    /* renamed from: m */
    public C34790a f90253m;

    /* renamed from: n */
    public int f90254n;

    /* renamed from: o */
    final C35092n f90255o = new C35092n(this);

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$a */
    public static final class C35079a {
        private C35079a() {
        }

        public /* synthetic */ C35079a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$b */
    static final class C35080b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35078c f90256a;

        C35080b(C35078c cVar) {
            this.f90256a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C34004b a = C34004b.m77717a();
            C52711k.m112236a((Object) a, "AwemeImManager.instance()");
            a.mo71949f().enterAddFriendsActivity(this.f90256a.getContext());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$c */
    static final class C35081c<T> implements C0199s<List<? extends IMContact>> {

        /* renamed from: a */
        final /* synthetic */ C35078c f90257a;

        C35081c(C35078c cVar) {
            this.f90257a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f90257a.mo72215b((List) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$d */
    static final class C35082d<T> implements C0199s<List<? extends IMContact>> {

        /* renamed from: a */
        final /* synthetic */ C35078c f90258a;

        C35082d(C35078c cVar) {
            this.f90258a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f90258a.mo72192a((List) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$e */
    static final class C35083e<T> implements C0199s<List<? extends IMContact>> {

        /* renamed from: a */
        final /* synthetic */ C35078c f90259a;

        C35083e(C35078c cVar) {
            this.f90259a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f90259a.mo72244c((List) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$f */
    static final class C35084f<T> implements C0199s<C52847n<? extends List<? extends String>, ? extends List<? extends Integer>>> {

        /* renamed from: a */
        final /* synthetic */ C35078c f90260a;

        C35084f(C35078c cVar) {
            this.f90260a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C52847n nVar = (C52847n) obj;
            if (nVar != null) {
                Collection collection = (Collection) nVar.getFirst();
                boolean z2 = true;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Collection collection2 = (Collection) nVar.getSecond();
                    if (collection2 != null && !collection2.isEmpty()) {
                        z2 = false;
                    }
                    if (!z2) {
                        ((IndexView) this.f90260a.mo72190a((int) R.id.ati)).mo72884a((List) nVar.getFirst(), (List) nVar.getSecond());
                        if (this.f90260a.mo73209r().mo70605j() == 0) {
                            ((IndexView) this.f90260a.mo72190a((int) R.id.ati)).setCurrentIndex(0);
                        }
                        C34790a aVar = this.f90260a.f90253m;
                        if (aVar != null) {
                            ((RecyclerView) this.f90260a.mo72190a((int) R.id.bl1)).mo4815b((C1331h) aVar);
                        }
                        C35078c cVar = this.f90260a;
                        C34790a aVar2 = new C34790a(this.f90260a.getContext(), (List) nVar.getFirst(), (List) nVar.getSecond());
                        aVar2.f89612b = this.f90260a.f90254n;
                        aVar2.f89611a = this.f90260a.mo73209r().mo70605j();
                        ((RecyclerView) this.f90260a.mo72190a((int) R.id.bl1)).mo4798a((C1331h) aVar2);
                        cVar.f90253m = aVar2;
                        return;
                    }
                }
            }
            IndexView indexView = (IndexView) this.f90260a.mo72190a((int) R.id.ati);
            C52711k.m112236a((Object) indexView, "index_view");
            indexView.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$g */
    static final class C35085g<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C35078c f90261a;

        C35085g(C35078c cVar) {
            this.f90261a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null) {
                if (num != null && num.intValue() == 0) {
                    IndexView indexView = (IndexView) this.f90261a.mo72190a((int) R.id.ati);
                    C52711k.m112236a((Object) indexView, "index_view");
                    indexView.setVisibility(0);
                } else {
                    IndexView indexView2 = (IndexView) this.f90261a.mo72190a((int) R.id.ati);
                    C52711k.m112236a((Object) indexView2, "index_view");
                    indexView2.setVisibility(8);
                    C34790a aVar = this.f90261a.f90253m;
                    if (aVar != null) {
                        ((RecyclerView) this.f90261a.mo72190a((int) R.id.bl1)).mo4815b((C1331h) aVar);
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$h */
    static final class C35086h<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C35078c f90262a;

        C35086h(C35078c cVar) {
            this.f90262a = cVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            if (num != null) {
                this.f90262a.mo72212l();
                C35078c cVar = this.f90262a;
                if (num != null && num.intValue() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    RecyclerView recyclerView = (RecyclerView) cVar.mo72190a((int) R.id.bl1);
                    C52711k.m112236a((Object) recyclerView, "member_list");
                    C1332i layoutManager = recyclerView.getLayoutManager();
                    if (layoutManager != null) {
                        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
                        int s = linearLayoutManager.mo5062s();
                        Builder builder = null;
                        for (int i = 0; i < s; i++) {
                            View g = linearLayoutManager.mo5050g(i);
                            if (g != null) {
                                C52711k.m112236a((Object) g, "linearLayoutManager.getChildAt(i) ?: continue");
                                C1352v b = ((RecyclerView) cVar.mo72190a((int) R.id.bl1)).mo4812b(g);
                                if (!(b instanceof C34854a)) {
                                    b = null;
                                }
                                C34854a aVar = (C34854a) b;
                                if (aVar != null) {
                                    if (builder == null) {
                                        builder = animatorSet.play(aVar.mo72971c());
                                    } else {
                                        builder.with(aVar.mo72971c());
                                    }
                                }
                            }
                        }
                        animatorSet.setDuration(300);
                        animatorSet.addListener(cVar.f90255o);
                        animatorSet.start();
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                    }
                } else {
                    cVar.mo73213v();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$i */
    public static final class C35087i extends C32461a {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f90263a;

        /* renamed from: b */
        final /* synthetic */ C35078c f90264b;

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            C1332i layoutManager = recyclerView.getLayoutManager();
            if (layoutManager != null) {
                int j = ((LinearLayoutManager) layoutManager).mo4749j();
                if (j >= this.f90264b.mo73209r().mo70605j()) {
                    ((IndexView) this.f90264b.mo72190a((int) R.id.ati)).setRecycleViewPos(j - this.f90264b.mo73209r().mo70605j());
                } else {
                    ((IndexView) this.f90264b.mo72190a((int) R.id.ati)).setCurrentIndex(-1);
                }
                ((SearchHeadListView) this.f90264b.mo72190a((int) R.id.cjb)).mo72899b();
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
        }

        C35087i(RecyclerView recyclerView, Context context, C35078c cVar) {
            this.f90263a = recyclerView;
            this.f90264b = cVar;
            super(context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$j */
    public static final class C35088j implements C1339l {

        /* renamed from: a */
        final /* synthetic */ C35078c f90265a;

        /* renamed from: a */
        public final void mo5079a(boolean z) {
        }

        /* renamed from: b */
        public final void mo5081b(RecyclerView recyclerView, MotionEvent motionEvent) {
            C52711k.m112240b(recyclerView, "recyclerView");
            C52711k.m112240b(motionEvent, "motionEvent");
        }

        C35088j(C35078c cVar) {
            this.f90265a = cVar;
        }

        /* renamed from: a */
        public final boolean mo5080a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C52711k.m112240b(recyclerView, "recyclerView");
            C52711k.m112240b(motionEvent, "motionEvent");
            C34790a aVar = this.f90265a.f90253m;
            if (aVar == null || !aVar.f89613c) {
                return false;
            }
            if (motionEvent.getY() < C9432q.m18687b(recyclerView.getContext(), 32.0f)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$k */
    public static final class C35089k implements C35356a {

        /* renamed from: a */
        final /* synthetic */ C35078c f90266a;

        /* renamed from: c */
        public final void mo70671c() {
        }

        /* renamed from: a */
        public final void mo70669a() {
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) this.f90266a.mo72190a((int) R.id.d10);
            C52711k.m112236a((Object) imTextTitleBar, "title_bar");
            if (!C35200an.m79575a(imTextTitleBar.getLeftView(), 500)) {
                this.f90266a.mo72245q();
            }
        }

        /* renamed from: b */
        public final void mo70670b() {
            ImTextTitleBar imTextTitleBar = (ImTextTitleBar) this.f90266a.mo72190a((int) R.id.d10);
            C52711k.m112236a((Object) imTextTitleBar, "title_bar");
            if (!C35200an.m79575a(imTextTitleBar.getRightView(), 1000)) {
                this.f90266a.mo72213m();
            }
        }

        C35089k(C35078c cVar) {
            this.f90266a = cVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$l */
    static final class C35090l implements C34783a {

        /* renamed from: a */
        final /* synthetic */ C35078c f90267a;

        C35090l(C35078c cVar) {
            this.f90267a = cVar;
        }

        /* renamed from: a */
        public final void mo72895a(String str, int i) {
            int i2;
            if (!C52711k.m112239a((Object) str, (Object) "search")) {
                i2 = ((IndexView) this.f90267a.mo72190a((int) R.id.ati)).mo72883a(i) + this.f90267a.mo73209r().mo70605j();
            } else {
                i2 = 0;
            }
            RecyclerView recyclerView = (RecyclerView) this.f90267a.mo72190a((int) R.id.bl1);
            C52711k.m112236a((Object) recyclerView, "member_list");
            if (recyclerView.getLayoutManager() instanceof LinearLayoutManager) {
                RecyclerView recyclerView2 = (RecyclerView) this.f90267a.mo72190a((int) R.id.bl1);
                C52711k.m112236a((Object) recyclerView2, "member_list");
                C1332i layoutManager = recyclerView2.getLayoutManager();
                if (layoutManager != null) {
                    ((LinearLayoutManager) layoutManager).mo4721a(i2, 0);
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$m */
    static final class C35091m extends C52712l implements C52670a<C34799b<IMContact>> {

        /* renamed from: a */
        final /* synthetic */ C35078c f90268a;

        C35091m(C35078c cVar) {
            this.f90268a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            FragmentActivity activity = this.f90268a.getActivity();
            if (activity != null) {
                return C35049k.m79233a(activity, this.f90268a.f90254n);
            }
            throw new C52857u("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$n */
    public static final class C35092n implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C35078c f90269a;

        public final void onAnimationCancel(Animator animator) {
            C52711k.m112240b(animator, "animation");
        }

        public final void onAnimationRepeat(Animator animator) {
            C52711k.m112240b(animator, "animation");
        }

        public final void onAnimationStart(Animator animator) {
            C52711k.m112240b(animator, "animation");
        }

        C35092n(C35078c cVar) {
            this.f90269a = cVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            this.f90269a.mo73209r().notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.c$o */
    static final class C35093o extends C52712l implements C52670a<VM> {

        /* renamed from: a */
        final /* synthetic */ C35078c f90270a;

        C35093o(C35078c cVar) {
            this.f90270a = cVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C35078c cVar = this.f90270a;
            FragmentActivity activity = this.f90270a.getActivity();
            if (activity != null) {
                return cVar.mo72191a((C0184k) activity);
            }
            throw new C52857u("null cannot be cast to non-null type android.arch.lifecycle.LifecycleOwner");
        }
    }

    /* renamed from: a */
    public int mo72189a(boolean z) {
        return z ? R.drawable.az4 : R.drawable.c_p;
    }

    /* renamed from: a */
    public View mo72190a(int i) {
        if (this.f90251j == null) {
            this.f90251j = new HashMap();
        }
        View view = (View) this.f90251j.get(Integer.valueOf(i));
        if (view == null) {
            View view2 = getView();
            if (view2 == null) {
                return null;
            }
            view = view2.findViewById(i);
            this.f90251j.put(Integer.valueOf(i), view);
        }
        return view;
    }

    /* renamed from: a */
    public abstract VM mo72191a(C0184k kVar);

    /* renamed from: f */
    public boolean mo72195f() {
        return true;
    }

    /* renamed from: g */
    public abstract String mo72196g();

    /* renamed from: h */
    public void mo72197h() {
        if (this.f90251j != null) {
            this.f90251j.clear();
        }
    }

    /* renamed from: j */
    public int mo72210j() {
        return R.layout.bcq;
    }

    /* renamed from: k */
    public boolean mo72211k() {
        return true;
    }

    public /* synthetic */ void onDestroyView() {
        super.onDestroyView();
        mo72197h();
    }

    /* renamed from: r */
    public final C34799b<IMContact> mo73209r() {
        return (C34799b) this.f90248c.getValue();
    }

    /* renamed from: s */
    public final VM mo73210s() {
        return (BaseMemberListViewModel) this.f90250e.getValue();
    }

    /* renamed from: a */
    public final C35096e mo72311a() {
        return this.f90249d;
    }

    public void onDestroy() {
        super.onDestroy();
        C35200an.m79574a();
        mo73210s().onCleared();
    }

    public void onResume() {
        super.onResume();
        mo73210s().mo72357a();
    }

    public void bk_() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            this.f90254n = arguments.getInt("key_member_list_type");
            if (arguments != null) {
                return;
            }
        }
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.finish();
        }
    }

    /* renamed from: m */
    public void mo72213m() {
        if (!mo73210s().mo73181m() && mo72195f()) {
            mo73210s().mo73178a(3);
        }
    }

    /* renamed from: u */
    public final void mo73212u() {
        DmtStatusView dmtStatusView = (DmtStatusView) mo72190a((int) R.id.csv);
        if (dmtStatusView != null) {
            dmtStatusView.mo19209d();
            dmtStatusView.setVisibility(8);
        }
    }

    public boolean bl_() {
        if (!mo73210s().mo73181m() || !mo72211k()) {
            ((SearchHeadListView) mo72190a((int) R.id.cjb)).mo72899b();
            return false;
        }
        mo73210s().mo73187s();
        mo73210s().mo73178a(2);
        return true;
    }

    /* renamed from: n */
    public View mo72216n() {
        DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
        dmtDefaultView.setStatus(new C10723a(getContext()).mo19280b((int) R.string.bhf).mo19282c(R.string.bhe).mo19278a(C10720a.SOLID, R.string.bha, new C35080b(this)).f28711a);
        return dmtDefaultView;
    }

    /* renamed from: q */
    public void mo72245q() {
        if (!mo73210s().mo73181m() || !mo72211k()) {
            ((SearchHeadListView) mo72190a((int) R.id.cjb)).mo72899b();
            FragmentActivity activity = getActivity();
            if (activity != null) {
                activity.finish();
                return;
            }
            return;
        }
        mo73210s().mo73187s();
        mo73210s().mo73178a(2);
    }

    /* renamed from: t */
    public final void mo73211t() {
        DmtStatusView dmtStatusView = (DmtStatusView) mo72190a((int) R.id.csv);
        if (dmtStatusView != null) {
            dmtStatusView.setBuilder(C10719a.m21676a(dmtStatusView.getContext()).mo19223a());
            dmtStatusView.mo19209d();
            dmtStatusView.mo19212f();
            dmtStatusView.setVisibility(0);
        }
    }

    /* renamed from: e */
    public void mo72194e() {
        C0184k kVar = this;
        mo73210s().f90194k.observe(kVar, new C35081c(this));
        mo73210s().f90199p.observe(kVar, new C35082d(this));
        mo73210s().f90195l.observe(kVar, new C35083e(this));
        mo73210s().f90196m.observe(kVar, new C35084f(this));
        mo73210s().f90198o.observe(kVar, new C35085g(this));
        mo73210s().f90197n.observe(kVar, new C35086h(this));
        mo73210s().mo73178a(2);
        mo73210s().mo73180b(0);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final void mo73213v() {
        AnimatorSet animatorSet = new AnimatorSet();
        RecyclerView recyclerView = (RecyclerView) mo72190a((int) R.id.bl1);
        C52711k.m112236a((Object) recyclerView, "member_list");
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager != null) {
            LinearLayoutManager linearLayoutManager = (LinearLayoutManager) layoutManager;
            int s = linearLayoutManager.mo5062s();
            Builder builder = null;
            for (int i = 0; i < s; i++) {
                View g = linearLayoutManager.mo5050g(i);
                if (g != null) {
                    C52711k.m112236a((Object) g, "linearLayoutManager.getChildAt(i) ?: continue");
                    C1352v b = ((RecyclerView) mo72190a((int) R.id.bl1)).mo4812b(g);
                    if (!(b instanceof C34854a)) {
                        b = null;
                    }
                    C34854a aVar = (C34854a) b;
                    if (aVar != null) {
                        if (builder == null) {
                            builder = animatorSet.play(aVar.mo72972d());
                        } else {
                            builder.with(aVar.mo72972d());
                        }
                    }
                }
            }
            animatorSet.setDuration(300);
            animatorSet.addListener(this.f90255o);
            animatorSet.start();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }

    /* renamed from: i */
    public void mo72209i() {
        ((ImTextTitleBar) mo72190a((int) R.id.d10)).setOnTitlebarClickListener(new C35089k(this));
        SearchHeadListView searchHeadListView = (SearchHeadListView) mo72190a((int) R.id.cjb);
        C52711k.m112236a((Object) searchHeadListView, "search_head_list");
        searchHeadListView.setVisibility(0);
        ((SearchHeadListView) mo72190a((int) R.id.cjb)).setListViewModel(mo73210s());
        RecyclerView recyclerView = (RecyclerView) mo72190a((int) R.id.bl1);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(mo73209r());
        recyclerView.mo4801a((C1340m) new C35087i(recyclerView, recyclerView.getContext(), this));
        recyclerView.mo4800a((C1339l) new C35088j(this));
        ((IndexView) mo72190a((int) R.id.ati)).setOnLetterTouchListener(new C35090l(this));
        ((IndexView) mo72190a((int) R.id.ati)).setIndexLetterTv((TextView) mo72190a((int) R.id.atg));
    }

    /* renamed from: o */
    public void mo72217o() {
        if (mo73210s().mo73182n()) {
            DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
            dmtDefaultView.setStatus(new C10723a(getContext()).mo19280b((int) R.string.bmw).mo19282c(R.string.bmv).mo19277a((int) R.drawable.b0t).f28711a);
            ((DmtStatusView) mo72190a((int) R.id.csv)).setBuilder(new C10719a(getContext()).mo19231b((View) dmtDefaultView));
        } else {
            ((DmtStatusView) mo72190a((int) R.id.csv)).setBuilder(new C10719a(getContext()).mo19231b(mo72216n()));
        }
        ((DmtStatusView) mo72190a((int) R.id.csv)).mo19209d();
        ((DmtStatusView) mo72190a((int) R.id.csv)).mo19213g();
        DmtStatusView dmtStatusView = (DmtStatusView) mo72190a((int) R.id.csv);
        C52711k.m112236a((Object) dmtStatusView, "status_view");
        dmtStatusView.setVisibility(0);
    }

    /* renamed from: l */
    public void mo72212l() {
        ((ImTextTitleBar) mo72190a((int) R.id.d10)).setTitle(mo72196g());
        if (!mo73210s().mo73181m()) {
            ((ImTextTitleBar) mo72190a((int) R.id.d10)).setLeftIcon(mo72189a(false));
            if (mo72195f()) {
                ((ImTextTitleBar) mo72190a((int) R.id.d10)).setRightText((int) R.string.bn1);
                ((ImTextTitleBar) mo72190a((int) R.id.d10)).setRightTextColor(C11010c.m22280a().getResources().getColor(R.color.a1l));
                ImTextTitleBar imTextTitleBar = (ImTextTitleBar) mo72190a((int) R.id.d10);
                C52711k.m112236a((Object) imTextTitleBar, "title_bar");
                DmtTextView rightTexView = imTextTitleBar.getRightTexView();
                C52711k.m112236a((Object) rightTexView, "title_bar.rightTexView");
                TextPaint paint = rightTexView.getPaint();
                C52711k.m112236a((Object) paint, "title_bar.rightTexView.paint");
                paint.setFakeBoldText(false);
                ImTextTitleBar imTextTitleBar2 = (ImTextTitleBar) mo72190a((int) R.id.d10);
                C52711k.m112236a((Object) imTextTitleBar2, "title_bar");
                View rightView = imTextTitleBar2.getRightView();
                C52711k.m112236a((Object) rightView, "title_bar.rightView");
                rightView.setEnabled(true);
                return;
            }
            ImTextTitleBar imTextTitleBar3 = (ImTextTitleBar) mo72190a((int) R.id.d10);
            C52711k.m112236a((Object) imTextTitleBar3, "title_bar");
            View rightView2 = imTextTitleBar3.getRightView();
            C52711k.m112236a((Object) rightView2, "title_bar.rightView");
            rightView2.setVisibility(8);
            return;
        }
        int p = mo73210s().mo73184p();
        ((ImTextTitleBar) mo72190a((int) R.id.d10)).setLeftIcon(mo72189a(true));
        if (p != 0) {
            ImTextTitleBar imTextTitleBar4 = (ImTextTitleBar) mo72190a((int) R.id.d10);
            StringBuilder sb = new StringBuilder();
            sb.append(C11010c.m22280a().getResources().getString(R.string.bhc));
            sb.append("(");
            sb.append(p);
            sb.append(")");
            imTextTitleBar4.setRightText(sb.toString());
            ImTextTitleBar imTextTitleBar5 = (ImTextTitleBar) mo72190a((int) R.id.d10);
            C52711k.m112236a((Object) imTextTitleBar5, "title_bar");
            View rightView3 = imTextTitleBar5.getRightView();
            C52711k.m112236a((Object) rightView3, "title_bar.rightView");
            rightView3.setEnabled(true);
            ImTextTitleBar imTextTitleBar6 = (ImTextTitleBar) mo72190a((int) R.id.d10);
            C52711k.m112236a((Object) imTextTitleBar6, "title_bar");
            DmtTextView rightTexView2 = imTextTitleBar6.getRightTexView();
            C52711k.m112236a((Object) rightTexView2, "title_bar.rightTexView");
            TextPaint paint2 = rightTexView2.getPaint();
            C52711k.m112236a((Object) paint2, "title_bar.rightTexView.paint");
            paint2.setFakeBoldText(true);
            ((ImTextTitleBar) mo72190a((int) R.id.d10)).setRightTextColor(C11010c.m22280a().getResources().getColor(R.color.a3c));
            return;
        }
        ((ImTextTitleBar) mo72190a((int) R.id.d10)).setRightText((int) R.string.bhc);
        ImTextTitleBar imTextTitleBar7 = (ImTextTitleBar) mo72190a((int) R.id.d10);
        C52711k.m112236a((Object) imTextTitleBar7, "title_bar");
        View rightView4 = imTextTitleBar7.getRightView();
        C52711k.m112236a((Object) rightView4, "title_bar.rightView");
        rightView4.setEnabled(false);
        ImTextTitleBar imTextTitleBar8 = (ImTextTitleBar) mo72190a((int) R.id.d10);
        C52711k.m112236a((Object) imTextTitleBar8, "title_bar");
        DmtTextView rightTexView3 = imTextTitleBar8.getRightTexView();
        C52711k.m112236a((Object) rightTexView3, "title_bar.rightTexView");
        TextPaint paint3 = rightTexView3.getPaint();
        C52711k.m112236a((Object) paint3, "title_bar.rightTexView.paint");
        paint3.setFakeBoldText(false);
        ((ImTextTitleBar) mo72190a((int) R.id.d10)).setRightTextColor(C11010c.m22280a().getResources().getColor(R.color.a3e));
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo73208a(View view) {
        C52711k.m112240b(view, "headerView");
        this.f90252l = view;
        mo73209r().mo72932c(view);
    }

    /* renamed from: c */
    public void mo72244c(List<? extends IMContact> list) {
        boolean z;
        if (this.f90252l != null) {
            mo73209r().mo72933n();
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo72217o();
        } else {
            DmtStatusView dmtStatusView = (DmtStatusView) mo72190a((int) R.id.csv);
            C52711k.m112236a((Object) dmtStatusView, "status_view");
            dmtStatusView.setVisibility(8);
        }
        mo73209r().mo70603e(list);
    }

    /* renamed from: a */
    public void mo72192a(List<? extends IMContact> list) {
        List list2;
        boolean z;
        SearchHeadListView searchHeadListView = (SearchHeadListView) mo72190a((int) R.id.cjb);
        if (list != null) {
            list2 = C52575l.m112132c((Iterable<? extends T>) list);
        } else {
            list2 = null;
        }
        Collection collection = list2;
        boolean z2 = false;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            searchHeadListView.f89598b.setVisibility(0);
            searchHeadListView.f89597a.setVisibility(8);
            searchHeadListView.mo72899b();
        } else {
            searchHeadListView.f89598b.setVisibility(8);
            searchHeadListView.f89597a.setVisibility(0);
            BaseMemberListViewModel<?> baseMemberListViewModel = searchHeadListView.f89601e;
            if (baseMemberListViewModel != null) {
                z2 = baseMemberListViewModel.mo73182n();
            }
            if (z2 && list2.size() > searchHeadListView.f89600d.getItemCount()) {
                searchHeadListView.mo72898a();
            }
        }
        searchHeadListView.f89600d.mo70601a(list2, new C34789b(searchHeadListView));
        mo73209r().notifyDataSetChanged();
        mo72212l();
    }

    /* renamed from: b */
    public void mo72215b(List<? extends IMContact> list) {
        boolean z;
        View view = this.f90252l;
        if (view != null) {
            mo73209r().mo72932c(view);
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo72217o();
            SearchHeadListView searchHeadListView = (SearchHeadListView) mo72190a((int) R.id.cjb);
            C52711k.m112236a((Object) searchHeadListView, "search_head_list");
            searchHeadListView.setVisibility(8);
            return;
        }
        SearchHeadListView searchHeadListView2 = (SearchHeadListView) mo72190a((int) R.id.cjb);
        C52711k.m112236a((Object) searchHeadListView2, "search_head_list");
        searchHeadListView2.setVisibility(0);
        DmtStatusView dmtStatusView = (DmtStatusView) mo72190a((int) R.id.csv);
        C52711k.m112236a((Object) dmtStatusView, "status_view");
        dmtStatusView.setVisibility(8);
        mo73209r().mo70603e(list);
    }

    public void onViewCreated(View view, Bundle bundle) {
        C52711k.m112240b(view, "view");
        super.onViewCreated(view, bundle);
        bk_();
        mo72209i();
        mo72194e();
    }

    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        View inflate = layoutInflater.inflate(mo72210j(), viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(getLayo…esId(), container, false)");
        this.f90246a = inflate;
        View view = this.f90246a;
        if (view == null) {
            C52711k.m112237a("mRootView");
        }
        return view;
    }
}
