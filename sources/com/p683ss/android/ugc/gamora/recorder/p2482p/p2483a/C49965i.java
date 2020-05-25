package com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a;

import android.app.Activity;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import com.bytedance.als.C2762f;
import com.bytedance.als.C2767k;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.shortvideo.C42431au;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.gamora.recorder.p2482p.C49971b;
import com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a.C49942b.C49943a;
import com.p683ss.android.ugc.tools.utils.C50203g;
import com.ss.android.ugc.trill.R;
import java.util.List;
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

/* renamed from: com.ss.android.ugc.gamora.recorder.p.a.i */
public final class C49965i extends C12924i {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f125176i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49965i.class), "toolbarManagerCallback", "getToolbarManagerCallback()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/IToolbarManager$Callback;"))};

    /* renamed from: l */
    public static final C49966a f125177l = new C49966a(null);

    /* renamed from: j */
    public C49944c f125178j;

    /* renamed from: k */
    public final int f125179k = C23728o.m58241a(32.0d);

    /* renamed from: m */
    private RecyclerView f125180m;

    /* renamed from: n */
    private final C52668f f125181n = C52732g.m112285a(new C49968c(this));

    /* renamed from: o */
    private final C49942b f125182o;

    /* renamed from: p */
    private final C2762f<Boolean> f125183p;

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.a.i$a */
    public static final class C49966a {
        private C49966a() {
        }

        public /* synthetic */ C49966a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.a.i$b */
    static final class C49967b<T> implements C2767k<Boolean> {

        /* renamed from: a */
        final /* synthetic */ C49965i f125184a;

        C49967b(C49965i iVar) {
            this.f125184a = iVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            if (((Boolean) obj) != null) {
                View view = this.f125184a.f33834b;
                C52711k.m112236a((Object) view, "view");
                LayoutParams layoutParams = view.getLayoutParams();
                if (layoutParams != null) {
                    FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                    int i = this.f125184a.f125179k;
                    Activity activity = this.f125184a.f33840g_;
                    if (activity == null) {
                        C52711k.m112234a();
                    }
                    layoutParams2.topMargin = i + C43303dy.m94972c(activity);
                    View view2 = this.f125184a.f33834b;
                    C52711k.m112236a((Object) view2, "view");
                    view2.setLayoutParams(layoutParams2);
                    StringBuilder sb = new StringBuilder("receive topMarginUpdate in RecordToolbarScene,now margin is:");
                    sb.append(layoutParams2.topMargin);
                    sb.append(",top is:");
                    View view3 = this.f125184a.f33834b;
                    C52711k.m112236a((Object) view3, "view");
                    sb.append(view3.getTop());
                    C50203g.m108358a(sb.toString());
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.a.i$c */
    static final class C49968c extends C52712l implements C52670a<C49941a> {

        /* renamed from: a */
        final /* synthetic */ C49965i f125185a;

        C49968c(C49965i iVar) {
            this.f125185a = iVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C49941a(new C52670a<C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C49968c f125186a;

                {
                    this.f125186a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    C49944c cVar = this.f125186a.f125185a.f125178j;
                    if (cVar == null) {
                        C52711k.m112237a("toolbarAdapter");
                    }
                    cVar.mo97753a(this.f125186a.f125185a.mo97764c());
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: d */
    private final C49943a m107815d() {
        return (C49943a) this.f125181n.getValue();
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        this.f125182o.mo97750b(m107815d());
    }

    /* renamed from: c */
    public final List<C49971b> mo97764c() {
        return C49970j.m107822a(this.f125182o.mo97744a(), this.f125182o.mo97752c(), this.f125182o.mo97749b());
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        View j_ = mo24467j_(R.id.cad);
        C52711k.m112236a((Object) j_, "requireViewById(R.id.recycler_toolbar)");
        this.f125180m = (RecyclerView) j_;
        RecyclerView recyclerView = this.f125180m;
        if (recyclerView == null) {
            C52711k.m112237a("toolbarRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(mo24477v(), 1, false));
        this.f125178j = new C49944c(mo97764c());
        RecyclerView recyclerView2 = this.f125180m;
        if (recyclerView2 == null) {
            C52711k.m112237a("toolbarRecyclerView");
        }
        C49944c cVar = this.f125178j;
        if (cVar == null) {
            C52711k.m112237a("toolbarAdapter");
        }
        recyclerView2.setAdapter(cVar);
        C42431au auVar = new C42431au(mo24477v(), 1);
        Drawable a = C0726c.m2091a((Context) mo24477v(), (int) R.drawable.fs);
        if (a == null) {
            C52711k.m112234a();
        }
        auVar.mo5866a(a);
        RecyclerView recyclerView3 = this.f125180m;
        if (recyclerView3 == null) {
            C52711k.m112237a("toolbarRecyclerView");
        }
        recyclerView3.mo4798a((C1331h) auVar);
        this.f125183p.mo7349a(this, new C49967b(this));
        this.f125182o.mo97746a(m107815d());
    }

    public C49965i(C49942b bVar, C2762f<Boolean> fVar) {
        C52711k.m112240b(bVar, "toolbarManager");
        C52711k.m112240b(fVar, "topMargin");
        this.f125182o = bVar;
        this.f125183p = fVar;
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.byh, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…scene2, container, false)");
        return inflate;
    }
}
