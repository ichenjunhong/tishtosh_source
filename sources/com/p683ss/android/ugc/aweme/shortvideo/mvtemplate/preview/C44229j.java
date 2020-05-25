package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

import android.app.Activity;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.SurfaceTexture;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Surface;
import android.view.TextureView;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.scene.C12924i;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44190b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44199d;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44203h;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p2214a.C44187a;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.SlidePreviewLayout.C44206a;
import com.p683ss.android.ugc.aweme.shortvideo.widget.p2262a.C45593a;
import com.p683ss.ttvideoengine.TTVideoEngine;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j */
public final class C44229j extends C12924i implements C44209c {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f112001i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44229j.class), "textureView", "getTextureView()Landroid/view/TextureView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44229j.class), "gestureLayout", "getGestureLayout()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/gesturelayout/GestureLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44229j.class), "thumbnail", "getThumbnail()Lcom/facebook/drawee/view/SimpleDraweeView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44229j.class), "deletedIcon", "getDeletedIcon()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44229j.class), "slideLayout", "getSlideLayout()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/preview/SlidePreviewLayout;"))};

    /* renamed from: m */
    public static final C44230a f112002m = new C44230a(null);

    /* renamed from: j */
    public TTVideoEngine f112003j;

    /* renamed from: k */
    public boolean f112004k;

    /* renamed from: l */
    public final C44208b f112005l;

    /* renamed from: n */
    private final C52668f f112006n = C52732g.m112285a(new C44241l(this));

    /* renamed from: o */
    private final C52668f f112007o = C52732g.m112285a(new C44234e(this));

    /* renamed from: p */
    private final C52668f f112008p = C52732g.m112285a(new C44242m(this));

    /* renamed from: q */
    private final C52668f f112009q = C52732g.m112285a(new C44231b(this));

    /* renamed from: r */
    private final C52668f f112010r = C52732g.m112285a(new C44240k(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$a */
    public static final class C44230a {
        private C44230a() {
        }

        public /* synthetic */ C44230a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$b */
    static final class C44231b extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C44229j f112011a;

        C44231b(C44229j jVar) {
            this.f112011a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f112011a.mo24467j_(R.id.a46);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$c */
    static final class C44232c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44229j f112012a;

        C44232c(C44229j jVar) {
            this.f112012a = jVar;
        }

        public final void run() {
            C44208b bVar = this.f112012a.f112005l;
            if (bVar != null) {
                bVar.mo90126a();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$d */
    public static final class C44233d extends C44203h {

        /* renamed from: b */
        final /* synthetic */ View f112013b;

        /* renamed from: c */
        public final View mo90115c(Object obj) {
            return this.f112013b;
        }

        C44233d(View view) {
            this.f112013b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$e */
    static final class C44234e extends C52712l implements C52670a<GestureLayout> {

        /* renamed from: a */
        final /* synthetic */ C44229j f112014a;

        C44234e(C44229j jVar) {
            this.f112014a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (GestureLayout) this.f112014a.mo24467j_(R.id.e_c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$f */
    public static final class C44235f extends C44207a {

        /* renamed from: a */
        final /* synthetic */ C44229j f112015a;

        C44235f(C44229j jVar) {
            this.f112015a = jVar;
        }

        public final void onPrepared(TTVideoEngine tTVideoEngine) {
            this.f112015a.f112004k = true;
            if (!this.f112015a.mo24445C()) {
                C44229j.m96892a(this.f112015a).pause();
            }
            C44229j jVar = this.f112015a;
            int videoWidth = C44229j.m96892a(this.f112015a).getVideoWidth();
            int videoHeight = C44229j.m96892a(this.f112015a).getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                int b = C9432q.m18688b(jVar.mo24477v());
                int a = C9432q.m18670a((Context) jVar.mo24477v());
                float f = (float) videoHeight;
                float f2 = (float) videoWidth;
                float a2 = (((float) C9432q.m18670a((Context) jVar.mo24477v())) * f) / f2;
                float f3 = (float) b;
                if (a2 >= f3) {
                    a = (int) ((f3 * f2) / f);
                } else {
                    b = (int) a2;
                }
                C9432q.m18679a((View) jVar.mo90144c(), a, b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$g */
    public static final class C44236g implements SurfaceTextureListener {

        /* renamed from: a */
        final /* synthetic */ C44229j f112016a;

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        C44236g(C44229j jVar) {
            this.f112016a = jVar;
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            C44229j.m96892a(this.f112016a).setSurface(new Surface(surfaceTexture));
            C44229j.m96892a(this.f112016a).play();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$h */
    public static final class C44237h implements C44206a {

        /* renamed from: a */
        final /* synthetic */ C44229j f112017a;

        C44237h(C44229j jVar) {
            this.f112017a = jVar;
        }

        /* renamed from: a */
        public final void mo90125a(boolean z) {
            this.f112017a.mo90143a(true);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$i */
    public static final class C44238i implements C44199d {

        /* renamed from: a */
        final /* synthetic */ C44229j f112018a;

        /* renamed from: a */
        public final void mo90108a() {
            this.f112018a.mo90143a(true);
        }

        /* renamed from: b */
        public final void mo90110b() {
            this.f112018a.mo90143a(true);
        }

        C44238i(C44229j jVar) {
            this.f112018a = jVar;
        }

        /* renamed from: a */
        public final void mo90109a(float f) {
            C44208b bVar = this.f112018a.f112005l;
            if (bVar != null) {
                bVar.mo90127a(f);
            }
            if (this.f112018a.f112003j != null) {
                if (f < 1.0f) {
                    C44229j.m96892a(this.f112018a).pause();
                } else if (f == 1.0f) {
                    C44229j.m96892a(this.f112018a).play();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$j */
    public static final class C44239j extends C44203h {

        /* renamed from: b */
        final /* synthetic */ View f112019b;

        /* renamed from: c */
        public final View mo90115c(Object obj) {
            return this.f112019b;
        }

        C44239j(View view) {
            this.f112019b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$k */
    static final class C44240k extends C52712l implements C52670a<SlidePreviewLayout> {

        /* renamed from: a */
        final /* synthetic */ C44229j f112020a;

        C44240k(C44229j jVar) {
            this.f112020a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SlidePreviewLayout) this.f112020a.mo24467j_(R.id.cp_);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$l */
    static final class C44241l extends C52712l implements C52670a<TextureView> {

        /* renamed from: a */
        final /* synthetic */ C44229j f112021a;

        C44241l(C44229j jVar) {
            this.f112021a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextureView) this.f112021a.mo24467j_(R.id.ezv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$m */
    static final class C44242m extends C52712l implements C52670a<SimpleDraweeView> {

        /* renamed from: a */
        final /* synthetic */ C44229j f112022a;

        C44242m(C44229j jVar) {
            this.f112022a = jVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SimpleDraweeView) this.f112022a.mo24467j_(R.id.b4w);
        }
    }

    /* renamed from: d */
    private final GestureLayout m96893d() {
        return (GestureLayout) this.f112007o.getValue();
    }

    /* renamed from: f */
    private final SimpleDraweeView m96894f() {
        return (SimpleDraweeView) this.f112008p.getValue();
    }

    /* renamed from: h */
    private final ImageView m96895h() {
        return (ImageView) this.f112009q.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final TextureView mo90144c() {
        return (TextureView) this.f112006n.getValue();
    }

    /* renamed from: a */
    public final void mo90130a() {
        mo90143a(true);
    }

    /* renamed from: A */
    public final void mo24457A() {
        super.mo24457A();
        if (this.f112004k) {
            TTVideoEngine tTVideoEngine = this.f112003j;
            if (tTVideoEngine == null) {
                C52711k.m112237a("videoEngine");
            }
            tTVideoEngine.pause();
        }
    }

    /* renamed from: p */
    public final void mo24469p() {
        super.mo24469p();
        if (this.f112003j != null) {
            TTVideoEngine tTVideoEngine = this.f112003j;
            if (tTVideoEngine == null) {
                C52711k.m112237a("videoEngine");
            }
            tTVideoEngine.release();
        }
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        if (this.f112004k) {
            TTVideoEngine tTVideoEngine = this.f112003j;
            if (tTVideoEngine == null) {
                C52711k.m112237a("videoEngine");
            }
            tTVideoEngine.play();
        }
    }

    /* renamed from: i */
    private static C44187a m96896i() {
        C44187a aVar = new C44187a();
        aVar.f111948f = 220;
        aVar.f111949g = 220;
        aVar.f111950h = 220;
        aVar.f111951i = 220;
        aVar.mo90097a(new C45593a((PointF) C44263o.m96945a().getFirst(), (PointF) C44263o.m96945a().getSecond()));
        aVar.mo90098b(new C45593a((PointF) C44263o.m96945a().getFirst(), (PointF) C44263o.m96945a().getSecond()));
        aVar.mo90099c(new C45593a((PointF) C44263o.m96945a().getFirst(), (PointF) C44263o.m96945a().getSecond()));
        aVar.mo90100d(new C45593a((PointF) C44263o.m96945a().getFirst(), (PointF) C44263o.m96945a().getSecond()));
        return aVar;
    }

    /* renamed from: a */
    public static final /* synthetic */ TTVideoEngine m96892a(C44229j jVar) {
        TTVideoEngine tTVideoEngine = jVar.f112003j;
        if (tTVideoEngine == null) {
            C52711k.m112237a("videoEngine");
        }
        return tTVideoEngine;
    }

    public C44229j(C44208b bVar) {
        this.f112005l = bVar;
    }

    /* renamed from: a */
    public final void mo90143a(boolean z) {
        C44208b bVar = this.f112005l;
        if (bVar != null) {
            View c = bVar.mo90128c();
            if (!(c == null || c == null)) {
                C44233d dVar = new C44233d(c);
                m96893d().mo90047a(dVar.mo90113a(null), null, dVar.mo90114b(null), 0.0f, new C44190b(), m96896i(), new C44232c(this));
                return;
            }
        }
        C44208b bVar2 = this.f112005l;
        if (bVar2 != null) {
            bVar2.mo90126a();
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARNING: Removed duplicated region for block: B:44:0x0110  */
    /* JADX WARNING: Removed duplicated region for block: B:50:0x011e  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x013b  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24448e(android.os.Bundle r10) {
        /*
            r9 = this;
            super.mo24448e(r10)
            android.view.TextureView r10 = r9.mo90144c()
            r0 = 8
            r10.setVisibility(r0)
            com.facebook.drawee.view.SimpleDraweeView r10 = r9.m96894f()
            r10.setVisibility(r0)
            android.widget.ImageView r10 = r9.m96895h()
            r10.setVisibility(r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b r10 = r9.f112005l
            r0 = 0
            if (r10 == 0) goto L_0x0024
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r10 = r10.cf_()
            goto L_0x0025
        L_0x0024:
            r10 = r0
        L_0x0025:
            r1 = 0
            if (r10 == 0) goto L_0x00ef
            java.lang.String r2 = r10.f95383b
            if (r2 == 0) goto L_0x00ef
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = r2.length()
            r3 = 1
            if (r2 <= 0) goto L_0x0037
            r2 = 1
            goto L_0x0038
        L_0x0037:
            r2 = 0
        L_0x0038:
            if (r2 != r3) goto L_0x00ef
            java.io.File r2 = new java.io.File
            java.lang.String r4 = r10.f95383b
            r2.<init>(r4)
            boolean r2 = r2.exists()
            if (r2 != 0) goto L_0x0049
            goto L_0x00ef
        L_0x0049:
            com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel r10 = (com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel) r10
            boolean r10 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44263o.m96946a(r10)
            if (r10 == 0) goto L_0x007d
            com.facebook.drawee.view.SimpleDraweeView r10 = r9.m96894f()
            r10.setVisibility(r1)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b r10 = r9.f112005l
            if (r10 == 0) goto L_0x00f6
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r10 = r10.cf_()
            if (r10 != 0) goto L_0x0064
            goto L_0x00f6
        L_0x0064:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "file://"
            r2.<init>(r3)
            java.lang.String r10 = r10.f95383b
            r2.append(r10)
            java.lang.String r10 = r2.toString()
            com.facebook.drawee.view.SimpleDraweeView r2 = r9.m96894f()
            com.p683ss.android.ugc.tools.p2504a.C50181a.m108292a(r2, r10)
            goto L_0x00f6
        L_0x007d:
            android.view.TextureView r10 = r9.mo90144c()
            r10.setVisibility(r1)
            com.ss.ttvideoengine.TTVideoEngine r10 = new com.ss.ttvideoengine.TTVideoEngine
            android.app.Activity r2 = r9.mo24477v()
            java.lang.String r4 = "requireActivity()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            android.content.Context r2 = r2.getApplicationContext()
            r4 = 2
            r10.<init>(r2, r4)
            r9.f112003j = r10
            com.ss.ttvideoengine.TTVideoEngine r10 = r9.f112003j
            if (r10 != 0) goto L_0x00a2
            java.lang.String r2 = "videoEngine"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00a2:
            java.lang.String r2 = "or_preview"
            r10.setSubTag(r2)
            com.ss.ttvideoengine.TTVideoEngine r10 = r9.f112003j
            if (r10 != 0) goto L_0x00b0
            java.lang.String r2 = "videoEngine"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00b0:
            r10.setLooping(r3)
            com.ss.ttvideoengine.TTVideoEngine r10 = r9.f112003j
            if (r10 != 0) goto L_0x00bc
            java.lang.String r2 = "videoEngine"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00bc:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b r2 = r9.f112005l
            if (r2 == 0) goto L_0x00c9
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r2 = r2.cf_()
            if (r2 == 0) goto L_0x00c9
            java.lang.String r2 = r2.f95383b
            goto L_0x00ca
        L_0x00c9:
            r2 = r0
        L_0x00ca:
            r10.setLocalURL(r2)
            com.ss.ttvideoengine.TTVideoEngine r10 = r9.f112003j
            if (r10 != 0) goto L_0x00d6
            java.lang.String r2 = "videoEngine"
            p2628d.p2639f.p2641b.C52711k.m112237a(r2)
        L_0x00d6:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$f r2 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$f
            r2.<init>(r9)
            com.ss.ttvideoengine.VideoEngineListener r2 = (com.p683ss.ttvideoengine.VideoEngineListener) r2
            r10.setListener(r2)
            android.view.TextureView r10 = r9.mo90144c()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$g r2 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$g
            r2.<init>(r9)
            android.view.TextureView$SurfaceTextureListener r2 = (android.view.TextureView.SurfaceTextureListener) r2
            r10.setSurfaceTextureListener(r2)
            goto L_0x00f6
        L_0x00ef:
            android.widget.ImageView r10 = r9.m96895h()
            r10.setVisibility(r1)
        L_0x00f6:
            d.f r10 = r9.f112010r
            java.lang.Object r10 = r10.getValue()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.SlidePreviewLayout r10 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.SlidePreviewLayout) r10
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$h r2 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$h
            r2.<init>(r9)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.SlidePreviewLayout$a r2 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.SlidePreviewLayout.C44206a) r2
            r10.setCallback(r2)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout r10 = r9.m96893d()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b r2 = r9.f112005l
            if (r2 == 0) goto L_0x0119
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r2 = r2.cf_()
            if (r2 == 0) goto L_0x0119
            int r2 = r2.f95390i
            goto L_0x011a
        L_0x0119:
            r2 = 0
        L_0x011a:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b r3 = r9.f112005l
            if (r3 == 0) goto L_0x0126
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r3 = r3.cf_()
            if (r3 == 0) goto L_0x0126
            int r1 = r3.f95391j
        L_0x0126:
            r10.mo90045a(r2, r1)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout r10 = r9.m96893d()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$i r1 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$i
            r1.<init>(r9)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.d r1 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44199d) r1
            r10.setCallback(r1)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.b r10 = r9.f112005l
            if (r10 == 0) goto L_0x0164
            android.view.View r10 = r10.mo90128c()
            if (r10 == 0) goto L_0x0164
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$j r1 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.j$j
            r1.<init>(r10)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout r2 = r9.m96893d()
            android.graphics.Rect r3 = r1.mo90113a(r0)
            r4 = 0
            android.graphics.Rect r5 = r1.mo90114b(r0)
            r6 = 0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b r10 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b
            r10.<init>()
            r7 = r10
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.f r7 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44201f) r7
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a r8 = m96896i()
            r2.mo90046a(r3, r4, r5, r6, r7, r8)
            return
        L_0x0164:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44229j.mo24448e(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        Activity v = mo24477v();
        C52711k.m112236a((Object) v, "requireActivity()");
        View inflate = v.getLayoutInflater().inflate(R.layout.bma, viewGroup, false);
        C52711k.m112236a((Object) inflate, "requireActivity().layout…_scene, container, false)");
        return inflate;
    }
}
