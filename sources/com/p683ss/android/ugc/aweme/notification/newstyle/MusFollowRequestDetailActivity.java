package com.p683ss.android.ugc.aweme.notification.newstyle;

import android.app.Activity;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.support.p030v4.widget.SwipeRefreshLayout;
import android.support.p030v4.widget.SwipeRefreshLayout.C1091b;
import android.support.p043v7.widget.C1440au;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1327f;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.titlebar.TextTitleBar;
import com.bytedance.ies.dmt.p664ui.titlebar.p670a.C10713a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.gyf.barlibrary.ImmersionBar;
import com.p683ss.android.ugc.aweme.base.activity.AmeSSActivity;
import com.p683ss.android.ugc.aweme.base.p1420ui.C23697k;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j.C26846a;
import com.p683ss.android.ugc.aweme.framework.p1781b.C32461a;
import com.p683ss.android.ugc.aweme.notice.api.C38046d;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2021a.C38256d;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2023c.C38317a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2023c.p2024a.C38318a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2023c.p2025b.C38321a;
import com.p683ss.android.ugc.aweme.notification.newstyle.p2023c.p2025b.C38322b;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity */
public final class MusFollowRequestDetailActivity extends AmeSSActivity implements C1091b, C26846a, C38317a, C38322b {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f97326a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MusFollowRequestDetailActivity.class), "mPresenter", "getMPresenter()Lcom/ss/android/ugc/aweme/notification/newstyle/followrequest/presenter/FollowRequestPresenter;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(MusFollowRequestDetailActivity.class), "mUnreadCount", "getMUnreadCount()I"))};

    /* renamed from: b */
    public static final C38238a f97327b = new C38238a(null);

    /* renamed from: c */
    private ImmersionBar f97328c;

    /* renamed from: d */
    private C38256d f97329d;

    /* renamed from: e */
    private final C52668f f97330e = C52732g.m112285a(new C38241d(this));

    /* renamed from: f */
    private final C52668f f97331f = C52732g.m112285a(new C38242e(this));

    /* renamed from: g */
    private HashMap f97332g;

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity$a */
    public static final class C38238a {
        private C38238a() {
        }

        public /* synthetic */ C38238a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity$b */
    public static final class C38239b implements C10713a {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f97333a;

        /* renamed from: b */
        public final void mo19167b(View view) {
            C52711k.m112240b(view, "view");
        }

        C38239b(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f97333a = musFollowRequestDetailActivity;
        }

        /* renamed from: a */
        public final void mo19166a(View view) {
            C52711k.m112240b(view, "view");
            this.f97333a.finish();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity$c */
    static final class C38240c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f97334a;

        C38240c(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f97334a = musFollowRequestDetailActivity;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f97334a.onRefresh();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity$d */
    static final class C38241d extends C52712l implements C52670a<C38321a> {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f97335a;

        C38241d(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f97335a = musFollowRequestDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            C38321a aVar = new C38321a();
            aVar.mo54799a(new C38318a());
            aVar.mo54800a(this.f97335a);
            return aVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity$e */
    static final class C38242e extends C52712l implements C52670a<Integer> {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f97336a;

        C38242e(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f97336a = musFollowRequestDetailActivity;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return Integer.valueOf(this.f97336a.getIntent().getIntExtra("unread_count", 0));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity$f */
    static final class C38243f<TTaskResult, TContinuationResult> implements C0011g<Void, C52860x> {

        /* renamed from: a */
        final /* synthetic */ MusFollowRequestDetailActivity f97337a;

        C38243f(MusFollowRequestDetailActivity musFollowRequestDetailActivity) {
            this.f97337a = musFollowRequestDetailActivity;
        }

        public final /* synthetic */ Object then(C0013i iVar) {
            if (this.f97337a.isViewValid()) {
                ((DmtStatusView) this.f97337a.mo78217a((int) R.id.csv)).mo19214h();
                C10691a.m21542b((Context) this.f97337a, (int) R.string.cg1).mo19066a();
            }
            return C52860x.f131107a;
        }
    }

    /* renamed from: c */
    private final C38321a m85415c() {
        return (C38321a) this.f97330e.getValue();
    }

    /* renamed from: a */
    public final View mo78217a(int i) {
        if (this.f97332g == null) {
            this.f97332g = new HashMap();
        }
        View view = (View) this.f97332g.get(Integer.valueOf(i));
        if (view != null) {
            return view;
        }
        View findViewById = findViewById(i);
        this.f97332g.put(Integer.valueOf(i), findViewById);
        return findViewById;
    }

    /* renamed from: a */
    public final void mo78219a(List<User> list, int i) {
        C52711k.m112240b(list, "list");
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity", "onResume", false);
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void ar_() {
        m85415c().mo78276g();
    }

    /* renamed from: d */
    private final void m85416d() {
        C38256d dVar = this.f97329d;
        if (dVar == null) {
            C52711k.m112237a("mAdapter");
        }
        dVar.an_();
        C38256d dVar2 = this.f97329d;
        if (dVar2 == null) {
            C52711k.m112237a("mAdapter");
        }
        dVar2.mo54798c(false);
    }

    public final void onDestroy() {
        super.onDestroy();
        m85415c().mo46991S_();
        ImmersionBar immersionBar = this.f97328c;
        if (immersionBar != null) {
            immersionBar.destroy();
        }
    }

    public final void setStatusBarColor() {
        this.f97328c = ImmersionBar.with((Activity) this).statusBarDarkFont(true).statusBarColor((int) R.color.wo);
        ImmersionBar immersionBar = this.f97328c;
        if (immersionBar != null) {
            immersionBar.init();
        }
    }

    /* renamed from: b */
    public final void mo78222b() {
        C38256d dVar = this.f97329d;
        if (dVar == null) {
            C52711k.m112237a("mAdapter");
        }
        if (dVar.f70699x) {
            C38256d dVar2 = this.f97329d;
            if (dVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar2.mo54798c(false);
            C38256d dVar3 = this.f97329d;
            if (dVar3 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar3.notifyDataSetChanged();
            m85416d();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78217a((int) R.id.ez1);
        C52711k.m112236a((Object) swipeRefreshLayout, "swipe_refresh_layout");
        swipeRefreshLayout.setRefreshing(false);
        C38256d dVar4 = this.f97329d;
        if (dVar4 == null) {
            C52711k.m112237a("mAdapter");
        }
        if (dVar4.getItemCount() == 0) {
            ((DmtStatusView) mo78217a((int) R.id.csv)).mo19213g();
        }
    }

    public final void onRefresh() {
        if (C38270b.m85500a(this)) {
            C38256d dVar = this.f97329d;
            if (dVar == null) {
                C52711k.m112237a("mAdapter");
            }
            if (dVar.getItemCount() == 0) {
                ((DmtStatusView) mo78217a((int) R.id.csv)).mo19212f();
            }
            m85415c().mo78275f();
            return;
        }
        C38256d dVar2 = this.f97329d;
        if (dVar2 == null) {
            C52711k.m112237a("mAdapter");
        }
        if (dVar2.getItemCount() == 0) {
            C0013i.m12a(100).mo20a((C0011g<TResult, TContinuationResult>) new C38243f<TResult,TContinuationResult>(this), C0013i.f25b);
        }
    }

    /* renamed from: a */
    public final void mo78221a(boolean z) {
        if (z) {
            C38256d dVar = this.f97329d;
            if (dVar == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar.am_();
        }
    }

    public final void onCreate(Bundle bundle) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        setContentView((int) R.layout.b23);
        RecyclerView recyclerView = (RecyclerView) mo78217a((int) R.id.caf);
        C52711k.m112236a((Object) recyclerView, "recycler_view");
        C1327f itemAnimator = recyclerView.getItemAnimator();
        if (itemAnimator != null) {
            ((C1440au) itemAnimator).f5184m = false;
            RecyclerView recyclerView2 = (RecyclerView) mo78217a((int) R.id.caf);
            C52711k.m112236a((Object) recyclerView2, "recycler_view");
            Context context = this;
            recyclerView2.setLayoutManager(new WrapLinearLayoutManager(context));
            ((RecyclerView) mo78217a((int) R.id.caf)).mo4798a((C1331h) new C23697k(1, (int) C9432q.m18687b(context, 1.0f), 0));
            ((RecyclerView) mo78217a((int) R.id.caf)).mo4801a((C1340m) new C32461a(context));
            ((DmtStatusView) mo78217a((int) R.id.csv)).setBuilder(C10719a.m21676a(context).mo19223a().mo19225a(R.string.cxn, R.string.cxm).mo19226a(R.drawable.dgk, R.string.f5o, R.string.f5k, R.string.f5u, new C38240c(this)));
            if (VERSION.SDK_INT >= 19) {
                View a = mo78217a((int) R.id.csm);
                C52711k.m112236a((Object) a, "status_bar");
                a.getLayoutParams().height = C11065a.m22390a(context);
            }
            C38422i.m85735a((RecyclerView) mo78217a((int) R.id.caf), (SwipeRefreshLayout) mo78217a((int) R.id.ez1));
            ((SwipeRefreshLayout) mo78217a((int) R.id.ez1)).setOnRefreshListener(this);
            ((TextTitleBar) mo78217a((int) R.id.d10)).setTitle((int) R.string.b4z);
            ((TextTitleBar) mo78217a((int) R.id.d10)).setOnTitleBarClickListener(new C38239b(this));
            this.f97329d = new C38256d(this);
            C38256d dVar = this.f97329d;
            if (dVar == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar.f97374a = ((Number) this.f97331f.getValue()).intValue();
            C38256d dVar2 = this.f97329d;
            if (dVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar2.mo54788a((C26846a) this);
            C38256d dVar3 = this.f97329d;
            if (dVar3 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar3.mo54798c(true);
            C38256d dVar4 = this.f97329d;
            if (dVar4 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar4.an_();
            RecyclerView recyclerView3 = (RecyclerView) mo78217a((int) R.id.caf);
            C52711k.m112236a((Object) recyclerView3, "recycler_view");
            C38256d dVar5 = this.f97329d;
            if (dVar5 == null) {
                C52711k.m112237a("mAdapter");
            }
            recyclerView3.setAdapter(dVar5);
            ((DmtStatusView) mo78217a((int) R.id.csv)).mo19212f();
            onRefresh();
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.notification.newstyle.MusFollowRequestDetailActivity", "onCreate", false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.SimpleItemAnimator");
    }

    /* renamed from: a */
    public final void mo78218a(Exception exc, boolean z) {
        if (z) {
            C38256d dVar = this.f97329d;
            if (dVar == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar.mo54793i();
            return;
        }
        C38256d dVar2 = this.f97329d;
        if (dVar2 == null) {
            C52711k.m112237a("mAdapter");
        }
        if (dVar2.f70699x) {
            C38256d dVar3 = this.f97329d;
            if (dVar3 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar3.mo54798c(false);
            C38256d dVar4 = this.f97329d;
            if (dVar4 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar4.notifyDataSetChanged();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78217a((int) R.id.ez1);
        C52711k.m112236a((Object) swipeRefreshLayout, "swipe_refresh_layout");
        swipeRefreshLayout.setRefreshing(false);
        C38256d dVar5 = this.f97329d;
        if (dVar5 == null) {
            C52711k.m112237a("mAdapter");
        }
        if (dVar5.getItemCount() == 0) {
            ((DmtStatusView) mo78217a((int) R.id.csv)).mo19214h();
        }
    }

    /* renamed from: a */
    public final void mo78220a(List<User> list, boolean z, boolean z2) {
        C52711k.m112240b(list, "list");
        if (z) {
            if (list.isEmpty()) {
                z2 = false;
            }
            if (!z2) {
                m85416d();
            } else {
                C38256d dVar = this.f97329d;
                if (dVar == null) {
                    C52711k.m112237a("mAdapter");
                }
                dVar.ao_();
            }
            C38256d dVar2 = this.f97329d;
            if (dVar2 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar2.mo50304b(list);
            return;
        }
        C38256d dVar3 = this.f97329d;
        if (dVar3 == null) {
            C52711k.m112237a("mAdapter");
        }
        dVar3.mo54798c(true);
        if (!z2) {
            m85416d();
        } else {
            C38256d dVar4 = this.f97329d;
            if (dVar4 == null) {
                C52711k.m112237a("mAdapter");
            }
            dVar4.ao_();
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) mo78217a((int) R.id.ez1);
        C52711k.m112236a((Object) swipeRefreshLayout, "swipe_refresh_layout");
        swipeRefreshLayout.setRefreshing(false);
        C38256d dVar5 = this.f97329d;
        if (dVar5 == null) {
            C52711k.m112237a("mAdapter");
        }
        dVar5.f97374a = C38046d.m85098a(12);
        C38256d dVar6 = this.f97329d;
        if (dVar6 == null) {
            C52711k.m112237a("mAdapter");
        }
        dVar6.mo50303a(list);
        ((DmtStatusView) mo78217a((int) R.id.csv)).mo19209d();
    }
}
