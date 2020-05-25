package com.p683ss.android.ugc.aweme.shortvideo.cut;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.view.SurfaceView;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.vesdk.C50720o.C50743d;
import com.p683ss.android.vesdk.C50720o.C50747h;
import dmt.p2652av.video.VEEditorAutoStartStopArbiter;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.q */
public final class C42671q implements C42650i {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f107966a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42671q.class), "autoStartStopArbiter", "getAutoStartStopArbiter()Ldmt/av/video/VEEditorAutoStartStopArbiter;"))};

    /* renamed from: b */
    public final C20347c f107967b;

    /* renamed from: c */
    private final C52668f f107968c;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.q$a */
    static final class C42672a extends C52712l implements C52670a<VEEditorAutoStartStopArbiter> {

        /* renamed from: a */
        final /* synthetic */ C42671q f107969a;

        /* renamed from: b */
        final /* synthetic */ Context f107970b;

        /* renamed from: c */
        final /* synthetic */ C0184k f107971c;

        /* renamed from: d */
        final /* synthetic */ SurfaceView f107972d;

        /* renamed from: e */
        final /* synthetic */ boolean f107973e;

        C42672a(C42671q qVar, Context context, C0184k kVar, SurfaceView surfaceView, boolean z) {
            this.f107969a = qVar;
            this.f107970b = context;
            this.f107971c = kVar;
            this.f107972d = surfaceView;
            this.f107973e = z;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            VEEditorAutoStartStopArbiter vEEditorAutoStartStopArbiter = new VEEditorAutoStartStopArbiter(this.f107970b, this.f107971c, this.f107969a.f107967b, this.f107972d, this.f107973e);
            return vEEditorAutoStartStopArbiter;
        }
    }

    /* renamed from: e */
    private final VEEditorAutoStartStopArbiter m93645e() {
        return (VEEditorAutoStartStopArbiter) this.f107968c.getValue();
    }

    /* renamed from: a */
    public final long mo86919a() {
        return (long) this.f107967b.mo43073l();
    }

    /* renamed from: c */
    public final long mo86924c() {
        return (long) this.f107967b.mo43071k();
    }

    /* renamed from: b */
    public final boolean mo86922b() {
        if (this.f107967b.mo43063g() == C50747h.STARTED) {
            return true;
        }
        return false;
    }

    /* renamed from: d */
    public final boolean mo86927d() {
        return m93645e().f131122a;
    }

    /* renamed from: d */
    public final void mo86926d(boolean z) {
        m93645e().f131123b = z;
    }

    /* renamed from: c */
    public final void mo86925c(boolean z) {
        m93645e().f131122a = z;
    }

    /* renamed from: b */
    public final boolean mo86923b(boolean z) {
        if (z) {
            m93645e().mo110432a(true);
        } else {
            m93645e().mo110431a();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo86921a(boolean z) {
        if (z) {
            m93645e().mo110432a(false);
        } else {
            m93645e().mo110434b();
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo86920a(long j, C50743d dVar) {
        C52711k.m112240b(dVar, "seekMode");
        if (this.f107967b.mo42983a((int) j, dVar) == 0) {
            return true;
        }
        return false;
    }

    public C42671q(Context context, C20347c cVar, SurfaceView surfaceView, C0184k kVar, boolean z) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(cVar, "veEditor");
        C52711k.m112240b(surfaceView, "surfaceView");
        C52711k.m112240b(kVar, "lifecycleOwner");
        this.f107967b = cVar;
        C42672a aVar = new C42672a(this, context, kVar, surfaceView, z);
        this.f107968c = C52732g.m112285a(aVar);
    }
}
