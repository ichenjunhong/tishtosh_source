package com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1860d;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.p1850b.C34409a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.p1859c.C34519a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.media.preview.viewmodel.MediaPreviewViewModel;
import com.p683ss.android.ugc.aweme.p1807im.sdk.p1809a.C33214b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.C35324c.C35326b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.widget.KeepSurfaceTextureView;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.d.d */
public final class C34530d extends C34524a implements C35326b {

    /* renamed from: d */
    static final /* synthetic */ C52767h[] f89017d = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C34530d.class), "mediaPlayHelper", "getMediaPlayHelper()Lcom/ss/android/ugc/aweme/im/sdk/media/preview/helper/MediaPlayHelper;"))};

    /* renamed from: k */
    public static final C34531a f89018k = new C34531a(null);

    /* renamed from: e */
    public View f89019e;

    /* renamed from: f */
    public RemoteImageView f89020f;

    /* renamed from: g */
    public KeepSurfaceTextureView f89021g;

    /* renamed from: h */
    public ImageView f89022h;

    /* renamed from: i */
    public boolean f89023i;

    /* renamed from: j */
    public boolean f89024j;

    /* renamed from: l */
    private DmtStatusView f89025l;

    /* renamed from: m */
    private final C52668f f89026m;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.d.d$a */
    public static final class C34531a {
        private C34531a() {
        }

        public /* synthetic */ C34531a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.d.d$b */
    public final class C34532b extends C33214b {
        public C34532b() {
        }

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            C34530d.this.mo72545j();
            C34409a aVar = C34530d.this.f89006b;
            if (aVar != null) {
                C34530d.this.mo72543h().mo72535c(aVar);
            }
            return true;
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (C34530d.this.f89023i) {
                KeepSurfaceTextureView keepSurfaceTextureView = C34530d.this.f89021g;
                if (keepSurfaceTextureView == null) {
                    C52711k.m112237a("surfaceView");
                }
                if (!keepSurfaceTextureView.f90727c) {
                    C34530d dVar = C34530d.this;
                    String string = C11010c.m22280a().getString(R.string.bpc);
                    C52711k.m112236a((Object) string, "AppContextManager.getApp…im_video_file_play_error)");
                    C10691a.m21546b(C11010c.m22280a(), string, 0).mo19066a();
                    dVar.mo72545j();
                } else if (C34530d.this.f89024j) {
                    C34530d.this.mo72544i();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.d.d$c */
    static final class C34533c extends C52712l implements C52671b<C34409a, C52860x> {

        /* renamed from: a */
        final /* synthetic */ C34530d f89028a;

        /* renamed from: b */
        final /* synthetic */ C34409a f89029b;

        C34533c(C34530d dVar, C34409a aVar) {
            this.f89028a = dVar;
            this.f89029b = aVar;
            super(1);
        }

        public final /* synthetic */ Object invoke(Object obj) {
            C52711k.m112240b((C34409a) obj, "it");
            C34530d.super.mo70626a(this.f89029b);
            C34530d dVar = this.f89028a;
            View view = this.f89028a.f89019e;
            if (view == null) {
                C52711k.m112237a("layout");
            }
            C52847n a = dVar.mo72536a(view);
            if (a == null) {
                a = C52856t.m112465a(Integer.valueOf(-1), Integer.valueOf(-1));
            }
            String thumbnail = this.f89029b.getThumbnail();
            if (thumbnail != null) {
                RemoteImageView remoteImageView = this.f89028a.f89020f;
                if (remoteImageView == null) {
                    C52711k.m112237a("ivCover");
                }
                StringBuilder sb = new StringBuilder("file://");
                sb.append(thumbnail);
                C23515d.m57686b(remoteImageView, sb.toString(), ((Number) a.getFirst()).intValue(), ((Number) a.getSecond()).intValue());
            }
            this.f89028a.mo72545j();
            return C52860x.f131107a;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.d.d$d */
    static final class C34534d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C34530d f89030a;

        C34534d(C34530d dVar) {
            this.f89030a = dVar;
        }

        public final void run() {
            ImageView imageView = this.f89030a.f89022h;
            if (imageView == null) {
                C52711k.m112237a("ivPlay");
            }
            imageView.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.d.d$e */
    static final class C34535e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34530d f89031a;

        C34535e(C34530d dVar) {
            this.f89031a = dVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89031a.mo72544i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.media.preview.d.d$f */
    static final class C34536f extends C52712l implements C52670a<C34519a> {

        /* renamed from: a */
        final /* synthetic */ MediaPreviewViewModel f89032a;

        C34536f(MediaPreviewViewModel mediaPreviewViewModel) {
            this.f89032a = mediaPreviewViewModel;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f89032a.mo72560p();
        }
    }

    /* renamed from: a */
    public final void mo72541a(String str) {
    }

    /* renamed from: h */
    public final C34519a mo72543h() {
        return (C34519a) this.f89026m.getValue();
    }

    /* renamed from: c */
    public final void mo70629c() {
        super.mo70629c();
        this.itemView.setOnClickListener(new C34535e(this));
    }

    /* renamed from: e */
    public final void mo72538e() {
        super.mo72538e();
        this.f89023i = true;
        mo72545j();
    }

    /* renamed from: g */
    public final void mo72540g() {
        this.f89023i = false;
        C34409a aVar = this.f89006b;
        if (aVar != null) {
            mo72543h().mo72534b(aVar);
        }
    }

    /* renamed from: k */
    public final void mo72546k() {
        DmtStatusView dmtStatusView = this.f89025l;
        if (dmtStatusView == null) {
            C52711k.m112237a("loadingView");
        }
        dmtStatusView.mo19209d();
    }

    /* renamed from: f */
    public final void mo72539f() {
        super.mo72539f();
        this.f89023i = false;
        C34409a aVar = this.f89006b;
        if (aVar != null) {
            mo72543h().mo72534b(aVar);
        }
    }

    /* renamed from: j */
    public final void mo72545j() {
        ImageView imageView = this.f89022h;
        if (imageView == null) {
            C52711k.m112237a("ivPlay");
        }
        imageView.setAlpha(1.0f);
        ImageView imageView2 = this.f89022h;
        if (imageView2 == null) {
            C52711k.m112237a("ivPlay");
        }
        imageView2.setVisibility(0);
        RemoteImageView remoteImageView = this.f89020f;
        if (remoteImageView == null) {
            C52711k.m112237a("ivCover");
        }
        remoteImageView.setVisibility(0);
        DmtStatusView dmtStatusView = this.f89025l;
        if (dmtStatusView == null) {
            C52711k.m112237a("loadingView");
        }
        dmtStatusView.mo19209d();
    }

    /* renamed from: b */
    public final void mo70628b() {
        Object a = mo70624a((int) R.id.b6q);
        C52711k.m112236a(a, "findViewById(R.id.layout)");
        this.f89019e = (View) a;
        Object a2 = mo70624a((int) R.id.azj);
        C52711k.m112236a(a2, "findViewById(R.id.iv_cover)");
        this.f89020f = (RemoteImageView) a2;
        Object a3 = mo70624a((int) R.id.cvd);
        C52711k.m112236a(a3, "findViewById(R.id.surface_view)");
        this.f89021g = (KeepSurfaceTextureView) a3;
        Object a4 = mo70624a((int) R.id.f7b);
        C52711k.m112236a(a4, "findViewById(R.id.view_loading)");
        this.f89025l = (DmtStatusView) a4;
        Object a5 = mo70624a((int) R.id.b37);
        C52711k.m112236a(a5, "findViewById(R.id.iv_play)");
        this.f89022h = (ImageView) a5;
        DmtStatusView dmtStatusView = this.f89025l;
        if (dmtStatusView == null) {
            C52711k.m112237a("loadingView");
        }
        View view = this.itemView;
        C52711k.m112236a((Object) view, "itemView");
        dmtStatusView.setBuilder(C10719a.m21676a(view.getContext()));
        KeepSurfaceTextureView keepSurfaceTextureView = this.f89021g;
        if (keepSurfaceTextureView == null) {
            C52711k.m112237a("surfaceView");
        }
        keepSurfaceTextureView.setSurfaceTextureListener(new C34532b());
    }

    /* renamed from: i */
    public final void mo72544i() {
        boolean z;
        C34409a aVar = this.f89006b;
        if (aVar != null) {
            C34519a h = mo72543h();
            C35326b bVar = this;
            C52711k.m112240b(bVar, "listener");
            h.mo72532a().mo73495a(bVar);
            C34519a h2 = mo72543h();
            C52711k.m112240b(aVar, "mediaModel");
            boolean z2 = false;
            if (h2.f88996b != aVar || !h2.mo72532a().mo73502d()) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                mo72543h().mo72534b(aVar);
                return;
            }
            C34519a h3 = mo72543h();
            C52711k.m112240b(aVar, "mediaModel");
            if (h3.f88996b == aVar) {
                z2 = true;
            }
            if (z2) {
                mo72543h().mo72533a(aVar);
                return;
            }
            KeepSurfaceTextureView keepSurfaceTextureView = this.f89021g;
            if (keepSurfaceTextureView == null) {
                C52711k.m112237a("surfaceView");
            }
            if (keepSurfaceTextureView.f90727c) {
                C34519a h4 = mo72543h();
                KeepSurfaceTextureView keepSurfaceTextureView2 = this.f89021g;
                if (keepSurfaceTextureView2 == null) {
                    C52711k.m112237a("surfaceView");
                }
                Surface surface = keepSurfaceTextureView2.getSurface();
                C52711k.m112236a((Object) surface, "surfaceView.surface");
                C52711k.m112240b(surface, "surface");
                h4.mo72532a().mo73494a(surface);
                mo72543h().mo72533a(aVar);
                return;
            }
            this.f89024j = true;
            DmtStatusView dmtStatusView = this.f89025l;
            if (dmtStatusView == null) {
                C52711k.m112237a("loadingView");
            }
            dmtStatusView.mo19212f();
        }
    }

    /* renamed from: a */
    public final void mo70626a(C34409a aVar) {
        C52711k.m112240b(aVar, "data");
        if (aVar != this.f89006b && aVar.isVideo()) {
            aVar.accurateSize(false, new C34533c(this, aVar));
        }
    }

    /* renamed from: a */
    public final void mo72542a(boolean z) {
        DmtStatusView dmtStatusView = this.f89025l;
        if (dmtStatusView == null) {
            C52711k.m112237a("loadingView");
        }
        dmtStatusView.mo19209d();
        RemoteImageView remoteImageView = this.f89020f;
        if (remoteImageView == null) {
            C52711k.m112237a("ivCover");
        }
        remoteImageView.setVisibility(8);
        if (z) {
            ImageView imageView = this.f89022h;
            if (imageView == null) {
                C52711k.m112237a("ivPlay");
            }
            if (imageView.getVisibility() == 0) {
                ImageView imageView2 = this.f89022h;
                if (imageView2 == null) {
                    C52711k.m112237a("ivPlay");
                }
                imageView2.animate().alpha(0.0f).setDuration(100).withEndAction(new C34534d(this)).start();
                return;
            }
        }
        if (!z) {
            ImageView imageView3 = this.f89022h;
            if (imageView3 == null) {
                C52711k.m112237a("ivPlay");
            }
            if (imageView3.getVisibility() == 8) {
                ImageView imageView4 = this.f89022h;
                if (imageView4 == null) {
                    C52711k.m112237a("ivPlay");
                }
                imageView4.setVisibility(0);
                ImageView imageView5 = this.f89022h;
                if (imageView5 == null) {
                    C52711k.m112237a("ivPlay");
                }
                imageView5.setScaleX(2.5f);
                ImageView imageView6 = this.f89022h;
                if (imageView6 == null) {
                    C52711k.m112237a("ivPlay");
                }
                imageView6.setScaleY(2.5f);
                ImageView imageView7 = this.f89022h;
                if (imageView7 == null) {
                    C52711k.m112237a("ivPlay");
                }
                imageView7.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
            }
        }
    }

    public C34530d(View view, MediaPreviewViewModel mediaPreviewViewModel) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(mediaPreviewViewModel, "viewModel");
        super(view, mediaPreviewViewModel);
        this.f89026m = C52732g.m112285a(new C34536f(mediaPreviewViewModel));
    }
}
