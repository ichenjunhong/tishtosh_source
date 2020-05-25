package com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.support.p030v4.content.C0726c;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.scene.C12924i;
import com.bytedance.scene.navigation.C12942d;
import com.p683ss.android.ugc.aweme.shortvideo.C42431au;
import com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a.C49942b.C49943a;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.gamora.recorder.p.a.h */
public final class C49960h extends C12924i {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f125166i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C49960h.class), "toolbarManagerCallback", "getToolbarManagerCallback()Lcom/ss/android/ugc/gamora/recorder/toolbar/refactory/IToolbarManager$Callback;"))};

    /* renamed from: l */
    public static final C49961a f125167l = new C49961a(null);

    /* renamed from: j */
    C49944c f125168j;

    /* renamed from: k */
    final C49942b f125169k;

    /* renamed from: m */
    private RecyclerView f125170m;

    /* renamed from: n */
    private final C52668f f125171n = C52732g.m112285a(new C49963c(this));

    /* renamed from: o */
    private final C52670a<C52860x> f125172o;

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.a.h$a */
    public static final class C49961a {
        private C49961a() {
        }

        public /* synthetic */ C49961a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.a.h$b */
    static final class C49962b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C49960h f125173a;

        C49962b(C49960h hVar) {
            this.f125173a = hVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C12942d dVar = this.f125173a.f33837e;
            if (dVar == null) {
                C52711k.m112234a();
            }
            dVar.mo24531d();
        }
    }

    /* renamed from: com.ss.android.ugc.gamora.recorder.p.a.h$c */
    static final class C49963c extends C52712l implements C52670a<C49941a> {

        /* renamed from: a */
        final /* synthetic */ C49960h f125174a;

        C49963c(C49960h hVar) {
            this.f125174a = hVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C49941a(new C52670a<C52860x>(this) {

                /* renamed from: a */
                final /* synthetic */ C49963c f125175a;

                {
                    this.f125175a = r1;
                }

                public final /* synthetic */ Object invoke() {
                    C49960h hVar = this.f125175a.f125174a;
                    C49944c cVar = hVar.f125168j;
                    if (cVar == null) {
                        C52711k.m112237a("adapter");
                    }
                    cVar.mo97753a(C49970j.m107820a(hVar.f125169k));
                    return C52860x.f131107a;
                }
            });
        }
    }

    /* renamed from: c */
    private final C49943a m107811c() {
        return (C49943a) this.f125171n.getValue();
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        this.f125169k.mo97750b(m107811c());
        this.f125172o.invoke();
    }

    /* renamed from: e */
    public final void mo24448e(Bundle bundle) {
        super.mo24448e(bundle);
        View j_ = mo24467j_(R.id.bn6);
        C52711k.m112236a((Object) j_, "requireViewById<View>(R.id.more_commands_view)");
        View findViewById = j_.findViewById(R.id.cae);
        C52711k.m112236a((Object) findViewById, "moreCommands.findViewByI….recycler_toolbar_hidden)");
        this.f125170m = (RecyclerView) findViewById;
        RecyclerView recyclerView = this.f125170m;
        if (recyclerView == null) {
            C52711k.m112237a("toolbarHiddenRecyclerView");
        }
        recyclerView.setLayoutManager(new LinearLayoutManager(mo24477v(), 1, false));
        this.f125168j = new C49944c(C49970j.m107820a(this.f125169k));
        RecyclerView recyclerView2 = this.f125170m;
        if (recyclerView2 == null) {
            C52711k.m112237a("toolbarHiddenRecyclerView");
        }
        C49944c cVar = this.f125168j;
        if (cVar == null) {
            C52711k.m112237a("adapter");
        }
        recyclerView2.setAdapter(cVar);
        C42431au auVar = new C42431au(mo24477v(), 1);
        Drawable a = C0726c.m2091a((Context) mo24477v(), (int) R.drawable.fs);
        if (a == null) {
            C52711k.m112234a();
        }
        auVar.mo5866a(a);
        RecyclerView recyclerView3 = this.f125170m;
        if (recyclerView3 == null) {
            C52711k.m112237a("toolbarHiddenRecyclerView");
        }
        recyclerView3.mo4798a((C1331h) auVar);
        j_.setOnClickListener(new C49962b(this));
        this.f125169k.mo97746a(m107811c());
    }

    public C49960h(C49942b bVar, C52670a<C52860x> aVar) {
        C52711k.m112240b(bVar, "toolbarManager");
        C52711k.m112240b(aVar, "onHide");
        this.f125169k = bVar;
        this.f125172o = aVar;
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.aty, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…_scene, container, false)");
        return inflate;
    }
}
