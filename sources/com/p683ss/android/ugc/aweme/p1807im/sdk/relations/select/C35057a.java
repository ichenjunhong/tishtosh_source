package com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0176h;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0185l;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.ColorDrawable;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1339l;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.C10720a;
import com.bytedance.ies.dmt.p664ui.widget.C10722c.C10723a;
import com.bytedance.ies.dmt.p664ui.widget.DmtDefaultView;
import com.bytedance.ies.dmt.p664ui.widget.DmtEditText;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.KeyboardUtils;
import com.p683ss.android.ugc.aweme.common.keyboard.MeasureLinearLayout;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.p1807im.sdk.abtest.C33229c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33464h;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1830d.C34004b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C34831b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.C35049k;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1874a.C34799b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.p1876c.C34854a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.relations.select.BaseMemberListViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.utils.C35200an;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.C35412n;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.MTSearchHead;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.MTSearchHead.C35361a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.ShareNestedLayout;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1897b.C35386b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1898c.C35395a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.p1898c.C35396b;
import com.p683ss.android.ugc.aweme.p1807im.service.C35460j;
import com.p683ss.android.ugc.aweme.p1807im.service.experiment.RefineShareInSiteExperiment;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a */
public abstract class C35057a<VM extends BaseMemberListViewModel<?>> extends Dialog implements C0184k, C35098g, C35395a {

    /* renamed from: e */
    static final /* synthetic */ C52767h[] f90203e = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35057a.class), "mAdapter", "getMAdapter()Lcom/ss/android/ugc/aweme/im/sdk/relations/adapter/BaseSelectListAdapter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C35057a.class), "mMemberListViewModel", "getMMemberListViewModel()Lcom/ss/android/ugc/aweme/im/sdk/relations/select/BaseMemberListViewModel;"))};

    /* renamed from: t */
    public static final C35058a f90204t = new C35058a(null);

    /* renamed from: a */
    private final C0185l f90205a = new C0185l(this);

    /* renamed from: b */
    private final C35049k f90206b = new C35049k();

    /* renamed from: c */
    private final C52668f f90207c = C52732g.m112285a(new C35069l(this));

    /* renamed from: d */
    private final C35096e f90208d = new C35096e();

    /* renamed from: f */
    protected View f90209f;

    /* renamed from: g */
    public View f90210g;

    /* renamed from: h */
    public boolean f90211h;

    /* renamed from: i */
    public int f90212i;

    /* renamed from: j */
    public int f90213j;

    /* renamed from: k */
    public int f90214k;

    /* renamed from: l */
    public boolean f90215l = true;

    /* renamed from: m */
    public boolean f90216m;

    /* renamed from: n */
    public C34831b f90217n;

    /* renamed from: o */
    public C35412n f90218o;

    /* renamed from: p */
    public int f90219p = 1;

    /* renamed from: q */
    final C35070m f90220q = new C35070m(this);

    /* renamed from: r */
    public C35396b f90221r;

    /* renamed from: s */
    public final Activity f90222s;

    /* renamed from: u */
    private final C52668f f90223u = C52732g.m112285a(new C35071n(this));

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$a */
    public static final class C35058a {
        private C35058a() {
        }

        public /* synthetic */ C35058a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$b */
    static final class C35059b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35057a f90224a;

        C35059b(C35057a aVar) {
            this.f90224a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C34004b a = C34004b.m77717a();
            C52711k.m112236a((Object) a, "AwemeImManager.instance()");
            Intent addFriendsActivityIntent = a.mo71949f().getAddFriendsActivityIntent(this.f90224a.getContext(), 0, 22, "", "share_page");
            if (addFriendsActivityIntent != null) {
                this.f90224a.getContext().startActivity(addFriendsActivityIntent);
            }
            this.f90224a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$c */
    static final class C35060c extends C52712l implements C52671b<View, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35057a f90225a;

        C35060c(C35057a aVar) {
            this.f90225a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((View) obj, "it");
            this.f90225a.dismiss();
            ((DmtEditText) this.f90225a.findViewById(R.id.cj5)).requestFocus();
            KeyboardUtils.m58184c((DmtEditText) this.f90225a.findViewById(R.id.cj5));
            C34831b bVar = this.f90225a.f90217n;
            if (bVar != null) {
                C35386b bVar2 = bVar.f89743e;
                if (bVar2 != null) {
                    bVar2.mo73654b();
                }
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$d */
    public static final class C35061d implements C1339l {

        /* renamed from: a */
        final /* synthetic */ C35057a f90226a;

        /* renamed from: a */
        public final void mo5079a(boolean z) {
        }

        /* renamed from: b */
        public final void mo5081b(RecyclerView recyclerView, MotionEvent motionEvent) {
            C52711k.m112240b(recyclerView, "recyclerView");
            C52711k.m112240b(motionEvent, "motionEvent");
        }

        C35061d(C35057a aVar) {
            this.f90226a = aVar;
        }

        /* renamed from: a */
        public final boolean mo5080a(RecyclerView recyclerView, MotionEvent motionEvent) {
            C52711k.m112240b(recyclerView, "recyclerView");
            C52711k.m112240b(motionEvent, "motionEvent");
            C35412n nVar = this.f90226a.f90218o;
            if (nVar == null || !nVar.f91029c) {
                return false;
            }
            if (motionEvent.getY() < C9432q.m18687b(recyclerView.getContext(), 32.0f)) {
                return true;
            }
            return false;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$e */
    public static final class C35062e extends C32461a {

        /* renamed from: a */
        final /* synthetic */ RecyclerView f90227a;

        /* renamed from: b */
        final /* synthetic */ C35057a f90228b;

        public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
            C52711k.m112240b(recyclerView, "recyclerView");
            super.onScrollStateChanged(recyclerView, i);
            if (i == 1) {
                KeyboardUtils.m58184c((DmtEditText) this.f90228b.findViewById(R.id.cj5));
                ((DmtEditText) this.f90228b.findViewById(R.id.cj5)).clearFocus();
            }
        }

        C35062e(RecyclerView recyclerView, Context context, C35057a aVar) {
            this.f90227a = recyclerView;
            this.f90228b = aVar;
            super(context);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$f */
    static final class C35063f<T> implements C0199s<List<? extends IMContact>> {

        /* renamed from: a */
        final /* synthetic */ C35057a f90229a;

        C35063f(C35057a aVar) {
            this.f90229a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f90229a.mo73117a((List) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$g */
    static final class C35064g<T> implements C0199s<List<? extends IMContact>> {

        /* renamed from: a */
        final /* synthetic */ C35057a f90230a;

        C35064g(C35057a aVar) {
            this.f90230a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f90230a.mo73122c((List) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$h */
    static final class C35065h<T> implements C0199s<List<? extends IMContact>> {

        /* renamed from: a */
        final /* synthetic */ C35057a f90231a;

        C35065h(C35057a aVar) {
            this.f90231a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            this.f90231a.mo73120b((List) obj);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$i */
    static final class C35066i<T> implements C0199s<C52847n<? extends List<? extends String>, ? extends List<? extends Integer>>> {

        /* renamed from: a */
        final /* synthetic */ C35057a f90232a;

        C35066i(C35057a aVar) {
            this.f90232a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            C52847n nVar = (C52847n) obj;
            if (nVar != null) {
                Collection collection = (Collection) nVar.getFirst();
                boolean z2 = false;
                if (collection == null || collection.isEmpty()) {
                    z = true;
                } else {
                    z = false;
                }
                if (!z) {
                    Collection collection2 = (Collection) nVar.getSecond();
                    if (collection2 == null || collection2.isEmpty()) {
                        z2 = true;
                    }
                    if (!z2) {
                        C35412n nVar2 = this.f90232a.f90218o;
                        if (nVar2 != null) {
                            ((RecyclerView) this.f90232a.findViewById(R.id.bl1)).mo4815b((C1331h) nVar2);
                        }
                        C35057a aVar = this.f90232a;
                        C35412n nVar3 = new C35412n(this.f90232a.getContext(), (List) nVar.getFirst(), (List) nVar.getSecond());
                        nVar3.f91028b = this.f90232a.f90219p;
                        nVar3.f91027a = this.f90232a.mo73190i().mo70605j();
                        ((RecyclerView) this.f90232a.findViewById(R.id.bl1)).mo4798a((C1331h) nVar3);
                        aVar.f90218o = nVar3;
                    }
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$j */
    static final class C35067j<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C35057a f90233a;

        C35067j(C35057a aVar) {
            this.f90233a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num = (Integer) obj;
            if (num != null && (num == null || num.intValue() != 0 || !this.f90233a.mo73125f())) {
                C35412n nVar = this.f90233a.f90218o;
                if (nVar != null) {
                    ((RecyclerView) this.f90233a.findViewById(R.id.bl1)).mo4815b((C1331h) nVar);
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$k */
    static final class C35068k<T> implements C0199s<Integer> {

        /* renamed from: a */
        final /* synthetic */ C35057a f90234a;

        C35068k(C35057a aVar) {
            this.f90234a = aVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            boolean z;
            Integer num = (Integer) obj;
            if (num != null) {
                C35057a aVar = this.f90234a;
                if (num != null && num.intValue() == 3) {
                    z = true;
                } else {
                    z = false;
                }
                if (z) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    RecyclerView recyclerView = (RecyclerView) aVar.findViewById(R.id.bl1);
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
                                C1352v b = ((RecyclerView) aVar.findViewById(R.id.bl1)).mo4812b(g);
                                if (!(b instanceof C34854a)) {
                                    b = null;
                                }
                                C34854a aVar2 = (C34854a) b;
                                if (aVar2 != null) {
                                    if (builder == null) {
                                        builder = animatorSet.play(aVar2.mo72971c());
                                    } else {
                                        builder.with(aVar2.mo72971c());
                                    }
                                }
                            }
                        }
                        animatorSet.setDuration(300);
                        animatorSet.addListener(aVar.f90220q);
                        animatorSet.start();
                    } else {
                        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
                    }
                } else {
                    aVar.mo73193l();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$l */
    static final class C35069l extends C52712l implements C52670a<C34799b<IMContact>> {

        /* renamed from: a */
        final /* synthetic */ C35057a f90235a;

        C35069l(C35057a aVar) {
            this.f90235a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C35049k.m79233a(this.f90235a, this.f90235a.f90219p);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$m */
    public static final class C35070m implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C35057a f90236a;

        public final void onAnimationCancel(Animator animator) {
            C52711k.m112240b(animator, "animation");
        }

        public final void onAnimationRepeat(Animator animator) {
            C52711k.m112240b(animator, "animation");
        }

        public final void onAnimationStart(Animator animator) {
            C52711k.m112240b(animator, "animation");
        }

        C35070m(C35057a aVar) {
            this.f90236a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            this.f90236a.mo73190i().notifyDataSetChanged();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$n */
    static final class C35071n extends C52712l implements C52670a<VM> {

        /* renamed from: a */
        final /* synthetic */ C35057a f90237a;

        C35071n(C35057a aVar) {
            this.f90237a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f90237a.mo73116a((C0184k) this.f90237a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$o */
    static final class C35072o implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35057a f90238a;

        C35072o(C35057a aVar) {
            this.f90238a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C27965f.m66719a(this.f90238a.f90222s, "share_page", "share_page");
            this.f90238a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$p */
    static final class C35073p implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35057a f90239a;

        C35073p(C35057a aVar) {
            this.f90239a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f90239a.dismiss();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$q */
    static final class C35074q extends C52712l implements C52671b<Boolean, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C35057a f90240a;

        C35074q(C35057a aVar) {
            this.f90240a = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            if (!((Boolean) obj).booleanValue()) {
                this.f90240a.dismiss();
                KeyboardUtils.m58184c((DmtEditText) this.f90240a.findViewById(R.id.cj5));
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$r */
    static final class C35075r implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C35057a f90241a;

        C35075r(C35057a aVar) {
            this.f90241a = aVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C34004b a = C34004b.m77717a();
            C52711k.m112236a((Object) a, "AwemeImManager.instance()");
            Intent addFriendsActivityIntent = a.mo71949f().getAddFriendsActivityIntent(this.f90241a.getContext(), 0, 22, "", "share_page");
            if (addFriendsActivityIntent != null) {
                this.f90241a.getContext().startActivity(addFriendsActivityIntent);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.relations.select.a$s */
    static final class C35076s implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C35057a f90242a;

        C35076s(C35057a aVar) {
            this.f90242a = aVar;
        }

        public final void run() {
            C35396b bVar = this.f90242a.f90221r;
            if (bVar == null) {
                C52711k.m112234a();
            }
            bVar.mo73670a();
        }
    }

    /* renamed from: a */
    public abstract VM mo73116a(C0184k kVar);

    /* renamed from: b */
    public int mo73119b() {
        return R.layout.bcq;
    }

    /* renamed from: f */
    public boolean mo73125f() {
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final C34799b<IMContact> mo73190i() {
        return (C34799b) this.f90207c.getValue();
    }

    /* renamed from: j */
    public final VM mo73191j() {
        return (BaseMemberListViewModel) this.f90223u.getValue();
    }

    /* renamed from: a */
    public final C35096e mo72311a() {
        return this.f90208d;
    }

    public C0176h getLifecycle() {
        return this.f90205a;
    }

    /* renamed from: k */
    public final VM mo73192k() {
        return mo73191j();
    }

    /* renamed from: c */
    public void mo73121c() {
        getWindow().setSoftInputMode(48);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final View mo73189h() {
        View view = this.f90209f;
        if (view == null) {
            C52711k.m112237a("mRootView");
        }
        return view;
    }

    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        C35200an.m79574a();
        this.f90205a.mo332a(C0177a.ON_DESTROY);
        C35396b bVar = this.f90221r;
        if (bVar == null) {
            C52711k.m112234a();
        }
        bVar.mo73672b();
    }

    /* access modifiers changed from: protected */
    public void onStop() {
        this.f90205a.mo332a(C0177a.ON_STOP);
        super.onStop();
        C35396b bVar = this.f90221r;
        if (bVar == null) {
            C52711k.m112234a();
        }
        bVar.f90965a = null;
    }

    /* access modifiers changed from: protected */
    public void onStart() {
        super.onStart();
        this.f90221r = new C35396b(this.f90222s);
        C35396b bVar = this.f90221r;
        if (bVar == null) {
            C52711k.m112234a();
        }
        bVar.f90965a = this;
        C33464h.m76693a(new C35076s(this), 1000);
    }

    /* renamed from: d */
    public void mo73123d() {
        MTSearchHead mTSearchHead = (MTSearchHead) findViewById(R.id.cjb);
        C52711k.m112236a((Object) mTSearchHead, "search_head_list");
        mTSearchHead.setVisibility(0);
        ((MTSearchHead) findViewById(R.id.cjb)).setListViewModel(mo73191j());
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bl1);
        recyclerView.setLayoutManager(new LinearLayoutManager(recyclerView.getContext()));
        recyclerView.setAdapter(mo73190i());
        recyclerView.mo4800a((C1339l) new C35061d(this));
        recyclerView.mo4801a((C1340m) new C35062e(recyclerView, recyclerView.getContext(), this));
    }

    /* renamed from: e */
    public void mo73124e() {
        C0184k kVar = this;
        mo73191j().f90194k.observe(kVar, new C35063f(this));
        mo73191j().f90199p.observe(kVar, new C35064g(this));
        mo73191j().f90195l.observe(kVar, new C35065h(this));
        mo73191j().f90196m.observe(kVar, new C35066i(this));
        mo73191j().f90198o.observe(kVar, new C35067j(this));
        mo73191j().f90197n.observe(kVar, new C35068k(this));
        mo73191j().mo73178a(3);
        mo73191j().mo73180b(0);
        mo73191j().mo72357a();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: l */
    public final void mo73193l() {
        AnimatorSet animatorSet = new AnimatorSet();
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.bl1);
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
                    C1352v b = ((RecyclerView) findViewById(R.id.bl1)).mo4812b(g);
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
            animatorSet.addListener(this.f90220q);
            animatorSet.start();
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.LinearLayoutManager");
    }

    /* renamed from: g */
    public void mo73126g() {
        if (mo73191j().mo73182n()) {
            DmtDefaultView dmtDefaultView = new DmtDefaultView(getContext());
            dmtDefaultView.setStatus(new C10723a(getContext()).mo19280b((int) R.string.bmw).mo19282c(R.string.bmv).mo19277a((int) R.drawable.b0t).f28711a);
            ((DmtStatusView) findViewById(R.id.csv)).setBuilder(new C10719a(getContext()).mo19231b((View) dmtDefaultView));
        } else {
            DmtStatusView dmtStatusView = (DmtStatusView) findViewById(R.id.csv);
            C10719a aVar = new C10719a(getContext());
            DmtDefaultView dmtDefaultView2 = new DmtDefaultView(getContext());
            dmtDefaultView2.setStatus(new C10723a(getContext()).mo19280b((int) R.string.bmg).mo19282c(R.string.bmf).mo19278a(C10720a.SOLID, R.string.gja, new C35059b(this)).f28711a);
            dmtStatusView.setBuilder(aVar.mo19231b((View) dmtDefaultView2));
        }
        ((DmtStatusView) findViewById(R.id.csv)).mo19209d();
        ((DmtStatusView) findViewById(R.id.csv)).mo19213g();
        DmtStatusView dmtStatusView2 = (DmtStatusView) findViewById(R.id.csv);
        C52711k.m112236a((Object) dmtStatusView2, "status_view");
        dmtStatusView2.setVisibility(0);
    }

    /* renamed from: c */
    public void mo73122c(List<? extends IMContact> list) {
        findViewById(R.id.cjb);
        if (list != null) {
            C52575l.m112132c((Iterable<? extends T>) list);
        }
        mo73190i().notifyDataSetChanged();
    }

    /* renamed from: b */
    public void mo73120b(List<? extends IMContact> list) {
        boolean z;
        if (this.f90210g != null) {
            mo73190i().mo72933n();
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo73126g();
        } else {
            DmtStatusView dmtStatusView = (DmtStatusView) findViewById(R.id.csv);
            C52711k.m112236a((Object) dmtStatusView, "status_view");
            dmtStatusView.setVisibility(8);
        }
        mo73190i().mo70603e(list);
    }

    /* renamed from: a */
    public void mo73117a(List<? extends IMContact> list) {
        boolean z;
        Object obj;
        int i;
        boolean z2;
        boolean z3;
        View view = this.f90210g;
        if (view != null) {
            mo73190i().mo72932c(view);
        }
        Collection collection = list;
        if (collection == null || collection.isEmpty()) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            mo73126g();
            MTSearchHead mTSearchHead = (MTSearchHead) findViewById(R.id.cjb);
            C52711k.m112236a((Object) mTSearchHead, "search_head_list");
            mTSearchHead.setVisibility(8);
            return;
        }
        DmtStatusView dmtStatusView = (DmtStatusView) findViewById(R.id.csv);
        C52711k.m112236a((Object) dmtStatusView, "status_view");
        dmtStatusView.setVisibility(8);
        List arrayList = new ArrayList();
        arrayList.addAll(collection);
        Iterable iterable = arrayList;
        Collection arrayList2 = new ArrayList();
        for (Object next : iterable) {
            IMContact iMContact = (IMContact) next;
            if (!(iMContact instanceof IMUser) || ((IMUser) iMContact).getFollowStatus() != 2) {
                z3 = false;
            } else {
                z3 = true;
            }
            if (z3) {
                arrayList2.add(next);
            }
        }
        List g = C52575l.m112143g((Iterable<? extends T>) (List) arrayList2);
        Iterator it = g.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            IMContact iMContact2 = (IMContact) obj;
            if (!(iMContact2 instanceof IMUser) || !IMUser.isSelf(((IMUser) iMContact2).getUid())) {
                z2 = false;
                continue;
            } else {
                z2 = true;
                continue;
            }
            if (z2) {
                break;
            }
        }
        if (obj == null) {
            i = g.size();
        } else {
            i = g.size() - 1;
        }
        if (i <= 3) {
            RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.eky);
            C52711k.m112236a((Object) relativeLayout, "ly_find_friends");
            relativeLayout.setVisibility(0);
            ((RelativeLayout) findViewById(R.id.eky)).setOnClickListener(new C35075r(this));
        }
        mo73190i().mo70603e(list);
        MTSearchHead mTSearchHead2 = (MTSearchHead) findViewById(R.id.cjb);
        C52711k.m112236a((Object) mTSearchHead2, "search_head_list");
        mTSearchHead2.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    public void onCreate(Bundle bundle) {
        this.f90205a.mo332a(C0177a.ON_RESUME);
        super.onCreate(bundle);
        View view = null;
        View inflate = View.inflate(getContext(), mo73119b(), null);
        C52711k.m112236a((Object) inflate, "View.inflate(context, getLayoutResId(), null)");
        this.f90209f = inflate;
        View view2 = this.f90209f;
        if (view2 == null) {
            C52711k.m112237a("mRootView");
        }
        setContentView(view2);
        Window window = getWindow();
        if (window != null) {
            window.setBackgroundDrawable(new ColorDrawable(0));
        }
        Window window2 = getWindow();
        if (window2 != null) {
            window2.setDimAmount(0.0f);
        }
        if (VERSION.SDK_INT >= 21) {
            Window window3 = getWindow();
            if (window3 != null) {
                window3.setStatusBarColor(0);
            }
        }
        Window window4 = this.f90222s.getWindow();
        if (window4 != null) {
            view = window4.getDecorView();
        }
        if (view == null) {
            C52711k.m112234a();
        }
        view.getHeight();
        C23724k.m58225c();
        Window window5 = getWindow();
        if (window5 != null) {
            window5.setLayout(-1, -1);
        }
        mo73121c();
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        if (!g.isLogin()) {
            MeasureLinearLayout measureLinearLayout = (MeasureLinearLayout) findViewById(R.id.ek6);
            C52711k.m112236a((Object) measureLinearLayout, "ll_meausre_keyboard");
            measureLinearLayout.setVisibility(8);
            LinearLayout linearLayout = (LinearLayout) findViewById(R.id.ekz);
            C52711k.m112236a((Object) linearLayout, "ly_unlogin");
            linearLayout.setVisibility(0);
            ((TextView) findViewById(R.id.evw)).setOnClickListener(new C35072o(this));
            LinearLayout linearLayout2 = (LinearLayout) findViewById(R.id.e3n);
            C52711k.m112236a((Object) linearLayout2, "content_ly");
            linearLayout2.getLayoutParams().height = -2;
            ((LinearLayout) findViewById(R.id.e3n)).requestLayout();
        } else {
            C34004b a = C34004b.m77717a();
            C52711k.m112236a((Object) a, "AwemeImManager.instance()");
            C35460j f = a.mo71949f();
            C52711k.m112236a((Object) f, "AwemeImManager.instance().proxy");
            if (!f.getUnder16Proxy().mo70450d()) {
                C34004b a2 = C34004b.m77717a();
                C52711k.m112236a((Object) a2, "AwemeImManager.instance()");
                C35460j f2 = a2.mo71949f();
                C52711k.m112236a((Object) f2, "AwemeImManager.instance().proxy");
                if (!f2.getUnder16Proxy().mo70449c()) {
                    mo73123d();
                    mo73124e();
                }
            }
            MeasureLinearLayout measureLinearLayout2 = (MeasureLinearLayout) findViewById(R.id.ek6);
            C52711k.m112236a((Object) measureLinearLayout2, "ll_meausre_keyboard");
            measureLinearLayout2.setVisibility(8);
            DmtTextView dmtTextView = (DmtTextView) findViewById(R.id.q7);
            C52711k.m112236a((Object) dmtTextView, "cancel");
            dmtTextView.setVisibility(0);
            ((DmtTextView) findViewById(R.id.q7)).setOnClickListener(new C35073p(this));
            LinearLayout linearLayout3 = (LinearLayout) findViewById(R.id.e3n);
            C52711k.m112236a((Object) linearLayout3, "content_ly");
            linearLayout3.getLayoutParams().height = -2;
            ((LinearLayout) findViewById(R.id.e3n)).requestLayout();
        }
        if (RefineShareInSiteExperiment.m80104a() == 5) {
            DmtTextView dmtTextView2 = (DmtTextView) findViewById(R.id.title);
            C52711k.m112236a((Object) dmtTextView2, "title");
            DmtTextView dmtTextView3 = (DmtTextView) findViewById(R.id.title);
            C52711k.m112236a((Object) dmtTextView3, "title");
            dmtTextView2.setText(dmtTextView3.getResources().getText(R.string.ftw));
        }
        if (RefineShareInSiteExperiment.INSTANCE.mo73740e()) {
            ImageView imageView = (ImageView) findViewById(R.id.elm);
            C52711k.m112236a((Object) imageView, "more_dialog_close");
            imageView.setVisibility(8);
            DmtTextView dmtTextView4 = (DmtTextView) findViewById(R.id.eln);
            C52711k.m112236a((Object) dmtTextView4, "more_dialog_done");
            dmtTextView4.setVisibility(0);
        }
        C52671b cVar = new C35060c(this);
        ((DmtTextView) findViewById(R.id.eln)).setOnClickListener(new C35077b(cVar));
        ((ImageView) findViewById(R.id.elm)).setOnClickListener(new C35077b(cVar));
        ((ShareNestedLayout) findViewById(R.id.cnh)).setVisibleChangedListener(new C35074q(this));
        this.f90213j = 0;
        IAccountUserService g2 = C20854a.m53167g();
        C52711k.m112236a((Object) g2, "AccountProxyService.userService()");
        if (g2.isLogin()) {
            C34004b a3 = C34004b.m77717a();
            C52711k.m112236a((Object) a3, "AwemeImManager.instance()");
            C35460j f3 = a3.mo71949f();
            C52711k.m112236a((Object) f3, "AwemeImManager.instance().proxy");
            if (!f3.getUnder16Proxy().mo70450d()) {
                C34004b a4 = C34004b.m77717a();
                C52711k.m112236a((Object) a4, "AwemeImManager.instance()");
                C35460j f4 = a4.mo71949f();
                C52711k.m112236a((Object) f4, "AwemeImManager.instance().proxy");
                if (!f4.getUnder16Proxy().mo70449c()) {
                    if (RefineShareInSiteExperiment.m80104a() == 5 || C33229c.f86227e.mo70574g() == 1 || C33229c.f86227e.mo70574g() == 2) {
                        ((ShareNestedLayout) findViewById(R.id.cnh)).setCanDragUp(false);
                        LinearLayout linearLayout4 = (LinearLayout) findViewById(R.id.e3n);
                        C52711k.m112236a((Object) linearLayout4, "content_ly");
                        linearLayout4.getLayoutParams().height = -1;
                        ((LinearLayout) findViewById(R.id.e3n)).requestLayout();
                    } else {
                        ((ShareNestedLayout) findViewById(R.id.cnh)).setCanDragUp(true);
                        LinearLayout linearLayout5 = (LinearLayout) findViewById(R.id.e3n);
                        C52711k.m112236a((Object) linearLayout5, "content_ly");
                        LayoutParams layoutParams = linearLayout5.getLayoutParams();
                        double a5 = (double) C23724k.m58221a(this.f90222s);
                        Double.isNaN(a5);
                        layoutParams.height = (int) (a5 * 0.7d);
                        ((LinearLayout) findViewById(R.id.e3n)).requestLayout();
                    }
                    ((ShareNestedLayout) findViewById(R.id.cnh)).mo73613a(true, true);
                }
            }
        }
        ((ShareNestedLayout) findViewById(R.id.cnh)).setCanDragUp(false);
        ((ShareNestedLayout) findViewById(R.id.cnh)).mo73613a(true, true);
    }

    public C35057a(Activity activity, int i) {
        C52711k.m112240b(activity, "activity");
        super(activity, i);
        this.f90222s = activity;
    }

    /* renamed from: a */
    public final void mo73188a(boolean z, int i, int i2) {
        int i3;
        int i4;
        if (this.f90217n != null) {
            if (z) {
                this.f90211h = true;
                if (this.f90214k == 0 && i > 0) {
                    this.f90214k = i;
                    this.f90212i = this.f90214k;
                }
                C34831b bVar = this.f90217n;
                if (bVar == null) {
                    C52711k.m112234a();
                }
                if (bVar.mo72953a()) {
                    if (!MTSearchHead.f90819d) {
                        if (this.f90216m) {
                            i4 = 0;
                        } else {
                            i4 = -this.f90214k;
                        }
                        C34831b bVar2 = this.f90217n;
                        if (bVar2 == null) {
                            C52711k.m112234a();
                        }
                        bVar2.mo72949a(i4);
                    }
                    C35361a.m79985a(false);
                }
                RelativeLayout relativeLayout = (RelativeLayout) findViewById(R.id.ebn);
                C52711k.m112236a((Object) relativeLayout, "im_channel_container");
                relativeLayout.setVisibility(8);
                return;
            }
            this.f90211h = false;
            C34831b bVar3 = this.f90217n;
            if (bVar3 == null) {
                C52711k.m112234a();
            }
            if (bVar3.mo72953a()) {
                if (this.f90216m) {
                    i3 = this.f90214k;
                } else {
                    i3 = 0;
                }
                C34831b bVar4 = this.f90217n;
                if (bVar4 == null) {
                    C52711k.m112234a();
                }
                bVar4.mo72949a(i3);
            }
            RelativeLayout relativeLayout2 = (RelativeLayout) findViewById(R.id.ebn);
            C52711k.m112236a((Object) relativeLayout2, "im_channel_container");
            relativeLayout2.setVisibility(0);
        }
    }
}
