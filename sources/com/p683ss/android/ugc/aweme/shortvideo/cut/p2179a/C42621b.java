package com.p683ss.android.ugc.aweme.shortvideo.cut.p2179a;

import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Handler;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.asve.p1239c.C20347c;
import com.p683ss.android.ugc.aweme.scene.C18998a;
import com.p683ss.android.ugc.aweme.services.cutvideo.CutVideoView;
import com.p683ss.android.ugc.aweme.services.cutvideo.ICutVideo;
import com.p683ss.android.ugc.aweme.services.cutvideo.IDisplayVideo;
import com.p683ss.android.ugc.aweme.services.cutvideo.IDisplayVideoInternal;
import com.p683ss.android.ugc.aweme.shortvideo.WorkSpace.Workspace;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42655m;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.VECutVideoPresenter;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.C43168a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.viewmodel.VEVideoCutterViewModel;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.b */
public final class C42621b implements OnClickListener, IDisplayVideo, IDisplayVideoInternal, C42655m {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f107811a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C42621b.class), "presenter", "getPresenter()Lcom/ss/android/ugc/aweme/shortvideo/cut/VECutVideoPresenter;"))};

    /* renamed from: b */
    public C42608a f107812b;

    /* renamed from: c */
    public ImageView f107813c;

    /* renamed from: d */
    public final Handler f107814d = new Handler();

    /* renamed from: e */
    public final C42624c f107815e = new C42624c(this);

    /* renamed from: f */
    private Context f107816f;

    /* renamed from: g */
    private SurfaceView f107817g;

    /* renamed from: h */
    private int f107818h;

    /* renamed from: i */
    private final C52668f f107819i = C52732g.m112285a(new C42623b(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.b$a */
    static final class C42622a<T> implements C0199s<C43168a> {

        /* renamed from: a */
        final /* synthetic */ C42621b f107820a;

        C42622a(C42621b bVar) {
            this.f107820a = bVar;
        }

        public final /* synthetic */ void onChanged(Object obj) {
            Integer num;
            C43168a aVar = (C43168a) obj;
            if (aVar != null) {
                num = Integer.valueOf(aVar.f109120c);
            } else {
                num = null;
            }
            if (num != null && num.intValue() == 1) {
                if (this.f107820a.mo86858c().mo86820c()) {
                    C42621b.m93534a(this.f107820a).setVisibility(8);
                    this.f107820a.f107814d.post(this.f107820a.f107815e);
                }
            } else if (num != null && num.intValue() == 2) {
                if (aVar.f109121d) {
                    C42621b.m93534a(this.f107820a).setVisibility(0);
                }
                this.f107820a.f107814d.removeCallbacks(this.f107820a.f107815e);
            } else if (num != null && num.intValue() == 3) {
                this.f107820a.f107814d.removeCallbacks(this.f107820a.f107815e);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.b$b */
    static final class C42623b extends C52712l implements C52670a<VECutVideoPresenter> {

        /* renamed from: a */
        final /* synthetic */ C42621b f107821a;

        C42623b(C42621b bVar) {
            this.f107821a = bVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            String b = Workspace.m93095b();
            C52711k.m112236a((Object) b, "Workspace.getImportDir()");
            VECutVideoPresenter vECutVideoPresenter = new VECutVideoPresenter(b, this.f107821a, false, 4, null);
            return vECutVideoPresenter;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.a.b$c */
    public static final class C42624c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C42621b f107822a;

        public final void run() {
            long b = this.f107822a.mo86858c().mo86819b();
            if (b > 0) {
                CutMultiVideoViewModel cutMultiVideoViewModel = C42621b.m93535b(this.f107822a).f107784b;
                if (cutMultiVideoViewModel == null) {
                    C52711k.m112237a("cutMultiVideoViewModel");
                }
                cutMultiVideoViewModel.mo86798a(b, C42621b.m93535b(this.f107822a).mo86844c().mo87633k(), C42621b.m93535b(this.f107822a).mo86844c().mo87635m());
            }
            this.f107822a.f107814d.postDelayed(this, 30);
        }

        C42624c(C42621b bVar) {
            this.f107822a = bVar;
        }
    }

    /* renamed from: a */
    public final void mo86848a(C20347c cVar) {
    }

    public final void bS_() {
    }

    public final int bT_() {
        return this.f107818h;
    }

    public final void bV_() {
    }

    public final void bW_() {
    }

    /* renamed from: c */
    public final VECutVideoPresenter mo86858c() {
        return (VECutVideoPresenter) this.f107819i.getValue();
    }

    public final IDisplayVideo getProxy() {
        return this;
    }

    public final void setProxy(IDisplayVideo iDisplayVideo) {
        C52711k.m112240b(iDisplayVideo, "proxy");
    }

    /* renamed from: d */
    public final VECutVideoPresenter mo86859d() {
        return mo86858c();
    }

    public final SurfaceView bU_() {
        SurfaceView surfaceView = this.f107817g;
        if (surfaceView == null) {
            C52711k.m112237a("surfaceView");
        }
        return surfaceView;
    }

    /* renamed from: a */
    public final Context mo86847a() {
        Context context = this.f107816f;
        if (context == null) {
            C52711k.m112237a("context");
        }
        return context;
    }

    public final C0184k bP_() {
        Context context = this.f107816f;
        if (context == null) {
            C52711k.m112237a("context");
        }
        Activity a = C18998a.m46169a(context);
        if (a != null) {
            return (FragmentActivity) a;
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }

    public final long bQ_() {
        C42608a aVar = this.f107812b;
        if (aVar == null) {
            C52711k.m112237a("cutVideoView");
        }
        return aVar.mo86842a().getMaxCutDuration();
    }

    public final C0794k<Long, Long> bR_() {
        C42608a aVar = this.f107812b;
        if (aVar == null) {
            C52711k.m112237a("cutVideoView");
        }
        C0794k<Long, Long> playBoundary = aVar.mo86842a().getPlayBoundary();
        C52711k.m112236a((Object) playBoundary, "cutVideoView.getVideoEditView().playBoundary");
        return playBoundary;
    }

    public final void bX_() {
        C42608a aVar = this.f107812b;
        if (aVar == null) {
            C52711k.m112237a("cutVideoView");
        }
        aVar.mo86842a().mo87554b();
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m93534a(C42621b bVar) {
        ImageView imageView = bVar.f107813c;
        if (imageView == null) {
            C52711k.m112237a("ivPlay");
        }
        return imageView;
    }

    /* renamed from: b */
    public static final /* synthetic */ C42608a m93535b(C42621b bVar) {
        C42608a aVar = bVar.f107812b;
        if (aVar == null) {
            C52711k.m112237a("cutVideoView");
        }
        return aVar;
    }

    public final void setCutVideoView(CutVideoView cutVideoView) {
        C52711k.m112240b(cutVideoView, "cutVideoView");
        ICutVideo proxy = cutVideoView.getProxy();
        if (proxy != null) {
            this.f107812b = (C42608a) proxy;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.shortvideo.cut.cover.CutVideoViewProxy");
    }

    public final void onClick(View view) {
        Integer num;
        C43168a aVar;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.dov) {
            C42608a aVar2 = this.f107812b;
            if (aVar2 == null) {
                C52711k.m112237a("cutVideoView");
            }
            VEVideoCutterViewModel b = aVar2.mo86843b();
            if (mo86858c().mo86820c()) {
                aVar = new C43168a(2, false, 2, null);
            } else {
                aVar = new C43168a(1, false, 2, null);
            }
            b.mo87731a(aVar);
        }
    }

    public final void init(ViewGroup viewGroup) {
        if (viewGroup == null) {
            C52711k.m112234a();
        }
        Context context = viewGroup.getContext();
        C52711k.m112236a((Object) context, "parent!!.context");
        this.f107816f = context;
        Context context2 = this.f107816f;
        if (context2 == null) {
            C52711k.m112237a("context");
        }
        View inflate = LayoutInflater.from(context2).inflate(R.layout.byp, null, true);
        View findViewById = inflate.findViewById(R.id.dov);
        C52711k.m112236a((Object) findViewById, "contentView.findViewById(R.id.videoSurface)");
        this.f107817g = (SurfaceView) findViewById;
        View findViewById2 = inflate.findViewById(R.id.axn);
        C52711k.m112236a((Object) findViewById2, "contentView.findViewById(R.id.ivPlay)");
        this.f107813c = (ImageView) findViewById2;
        SurfaceView surfaceView = this.f107817g;
        if (surfaceView == null) {
            C52711k.m112237a("surfaceView");
        }
        surfaceView.setOnClickListener(this);
        viewGroup.addView(inflate);
        VECutVideoPresenter c = mo86858c();
        Context context3 = viewGroup.getContext();
        C52711k.m112236a((Object) context3, "parent.context");
        Activity a = C18998a.m46169a(context3);
        if (a != null) {
            c.mo86812a((FragmentActivity) a);
            C42608a aVar = this.f107812b;
            if (aVar == null) {
                C52711k.m112237a("cutVideoView");
            }
            C0198r a2 = aVar.mo86843b().mo87730a();
            Context context4 = this.f107816f;
            if (context4 == null) {
                C52711k.m112237a("context");
            }
            Activity a3 = C18998a.m46169a(context4);
            if (a3 != null) {
                a2.observe((FragmentActivity) a3, new C42622a(this));
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v4.app.FragmentActivity");
    }
}
