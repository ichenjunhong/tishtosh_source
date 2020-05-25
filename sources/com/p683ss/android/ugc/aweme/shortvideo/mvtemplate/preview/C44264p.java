package com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview;

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
import com.bytedance.scene.group.C12919g;
import com.facebook.drawee.view.SimpleDraweeView;
import com.p683ss.android.ugc.aweme.base.C23569o;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter.MyMediaModel;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44190b;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44199d;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44203h;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout;
import com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.p2214a.C44187a;
import com.p683ss.android.ugc.aweme.shortvideo.widget.p2262a.C45593a;
import com.p683ss.android.ugc.tools.p2504a.C50181a;
import com.p683ss.android.ugc.tools.view.widget.AVLoadingLayout;
import com.p683ss.ttvideoengine.TTVideoEngine;
import com.p683ss.ttvideoengine.utils.Error;
import com.ss.android.ugc.trill.R;
import org.json.JSONObject;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p */
public final class C44264p extends C12919g implements C44212f {

    /* renamed from: o */
    static final /* synthetic */ C52767h[] f112064o = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44264p.class), "textureView", "getTextureView()Landroid/view/TextureView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44264p.class), "gestureLayout", "getGestureLayout()Lcom/ss/android/ugc/aweme/shortvideo/mvtemplate/gesturelayout/GestureLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44264p.class), "thumbnail", "getThumbnail()Lcom/facebook/drawee/view/SimpleDraweeView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44264p.class), "deletedIcon", "getDeletedIcon()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C44264p.class), "loadingView", "getLoadingView()Lcom/ss/android/ugc/tools/view/widget/AVLoadingLayout;"))};

    /* renamed from: w */
    public static final C44265a f112065w = new C44265a(null);

    /* renamed from: A */
    private final C52668f f112066A = C52732g.m112285a(new C44270f(this));

    /* renamed from: B */
    private final C52668f f112067B = C52732g.m112285a(new C44277m(this));

    /* renamed from: C */
    private final C52668f f112068C = C52732g.m112285a(new C44267c(this));

    /* renamed from: D */
    private final C52668f f112069D = C52732g.m112285a(new C44273i(this));

    /* renamed from: p */
    public C44266b f112070p = C44266b.NONE;

    /* renamed from: q */
    public C44211e f112071q;

    /* renamed from: r */
    public TTVideoEngine f112072r;

    /* renamed from: s */
    public boolean f112073s;

    /* renamed from: t */
    public boolean f112074t;

    /* renamed from: u */
    public boolean f112075u;

    /* renamed from: v */
    public Surface f112076v;

    /* renamed from: x */
    private MyMediaModel f112077x;

    /* renamed from: y */
    private int f112078y;

    /* renamed from: z */
    private final C52668f f112079z = C52732g.m112285a(new C44276l(this));

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$a */
    public static final class C44265a {
        private C44265a() {
        }

        public /* synthetic */ C44265a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$b */
    public enum C44266b {
        NONE,
        FILE_DELETED,
        DISABLE_4K,
        NORMAL_VIDEO_PLAY
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$c */
    static final class C44267c extends C52712l implements C52670a<ImageView> {

        /* renamed from: a */
        final /* synthetic */ C44264p f112081a;

        C44267c(C44264p pVar) {
            this.f112081a = pVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (ImageView) this.f112081a.mo24467j_(R.id.a46);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$d */
    static final class C44268d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C44264p f112082a;

        C44268d(C44264p pVar) {
            this.f112082a = pVar;
        }

        public final void run() {
            C44211e eVar = this.f112082a.f112071q;
            if (eVar != null) {
                eVar.mo90134c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$e */
    public static final class C44269e extends C44203h {

        /* renamed from: b */
        final /* synthetic */ View f112083b;

        /* renamed from: c */
        public final View mo90115c(Object obj) {
            return this.f112083b;
        }

        C44269e(View view) {
            this.f112083b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$f */
    static final class C44270f extends C52712l implements C52670a<GestureLayout> {

        /* renamed from: a */
        final /* synthetic */ C44264p f112084a;

        C44270f(C44264p pVar) {
            this.f112084a = pVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (GestureLayout) this.f112084a.mo24467j_(R.id.e_c);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$g */
    public static final class C44271g extends C44207a {

        /* renamed from: a */
        final /* synthetic */ C44264p f112085a;

        C44271g(C44264p pVar) {
            this.f112085a = pVar;
        }

        public final void onError(Error error) {
            super.onError(error);
            this.f112085a.f112075u = true;
        }

        public final void onRenderStart(TTVideoEngine tTVideoEngine) {
            super.onRenderStart(tTVideoEngine);
            this.f112085a.mo90161f().setVisibility(8);
            this.f112085a.mo90162h().setVisibility(8);
        }

        public final void onPrepared(TTVideoEngine tTVideoEngine) {
            this.f112085a.f112073s = true;
            if (!this.f112085a.f33818l) {
                C44264p.m96952a(this.f112085a).pause();
            }
            C44264p pVar = this.f112085a;
            int videoWidth = C44264p.m96952a(this.f112085a).getVideoWidth();
            int videoHeight = C44264p.m96952a(this.f112085a).getVideoHeight();
            if (videoWidth > 0 && videoHeight > 0) {
                int b = C9432q.m18688b(pVar.mo24477v());
                int a = C9432q.m18670a((Context) pVar.mo24477v());
                float f = (float) videoHeight;
                float f2 = (float) videoWidth;
                float a2 = (((float) C9432q.m18670a((Context) pVar.mo24477v())) * f) / f2;
                float f3 = (float) b;
                if (a2 >= f3) {
                    a = (int) ((f3 * f2) / f);
                } else {
                    b = (int) a2;
                }
                C9432q.m18679a((View) pVar.mo90160d(), a, b);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$h */
    public static final class C44272h implements SurfaceTextureListener {

        /* renamed from: a */
        final /* synthetic */ C44264p f112086a;

        public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
            return true;
        }

        public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
        }

        public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
        }

        C44272h(C44264p pVar) {
            this.f112086a = pVar;
        }

        public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
            if (this.f112086a.f112072r != null && this.f112086a.f112076v == null) {
                this.f112086a.f112076v = new Surface(surfaceTexture);
                C44264p.m96952a(this.f112086a).setSurface(this.f112086a.f112076v);
                if (this.f112086a.f33818l) {
                    this.f112086a.f112074t = true;
                    C44264p.m96952a(this.f112086a).play();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$i */
    static final class C44273i extends C52712l implements C52670a<AVLoadingLayout> {

        /* renamed from: a */
        final /* synthetic */ C44264p f112087a;

        C44273i(C44264p pVar) {
            this.f112087a = pVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (AVLoadingLayout) this.f112087a.mo24467j_(R.id.bhy);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$j */
    public static final class C44274j implements C44199d {

        /* renamed from: a */
        final /* synthetic */ C44264p f112088a;

        /* renamed from: a */
        public final void mo90108a() {
            this.f112088a.mo90159b(true);
        }

        /* renamed from: b */
        public final void mo90110b() {
            this.f112088a.mo90159b(true);
        }

        C44274j(C44264p pVar) {
            this.f112088a = pVar;
        }

        /* renamed from: a */
        public final void mo90109a(float f) {
            C44211e eVar = this.f112088a.f112071q;
            if (eVar != null) {
                eVar.mo90131a(f);
            }
            if (this.f112088a.f112072r != null) {
                if (f < 1.0f) {
                    C44264p.m96952a(this.f112088a).pause();
                } else if (f == 1.0f) {
                    C44264p.m96952a(this.f112088a).play();
                }
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$k */
    public static final class C44275k extends C44203h {

        /* renamed from: b */
        final /* synthetic */ View f112089b;

        /* renamed from: c */
        public final View mo90115c(Object obj) {
            return this.f112089b;
        }

        C44275k(View view) {
            this.f112089b = view;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$l */
    static final class C44276l extends C52712l implements C52670a<TextureView> {

        /* renamed from: a */
        final /* synthetic */ C44264p f112090a;

        C44276l(C44264p pVar) {
            this.f112090a = pVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (TextureView) this.f112090a.mo24467j_(R.id.ezv);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$m */
    static final class C44277m extends C52712l implements C52670a<SimpleDraweeView> {

        /* renamed from: a */
        final /* synthetic */ C44264p f112091a;

        C44277m(C44264p pVar) {
            this.f112091a = pVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return (SimpleDraweeView) this.f112091a.mo24467j_(R.id.b4w);
        }
    }

    /* renamed from: J */
    private final ImageView m96949J() {
        return (ImageView) this.f112068C.getValue();
    }

    /* renamed from: i */
    private final GestureLayout m96953i() {
        return (GestureLayout) this.f112066A.getValue();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final TextureView mo90160d() {
        return (TextureView) this.f112079z.getValue();
    }

    /* renamed from: f */
    public final SimpleDraweeView mo90161f() {
        return (SimpleDraweeView) this.f112067B.getValue();
    }

    /* renamed from: h */
    public final AVLoadingLayout mo90162h() {
        return (AVLoadingLayout) this.f112069D.getValue();
    }

    /* renamed from: c */
    public final void mo86790c() {
        mo90159b(true);
    }

    /* renamed from: K */
    private final void m96950K() {
        MyMediaModel myMediaModel = this.f112077x;
        if (myMediaModel != null) {
            StringBuilder sb = new StringBuilder("file://");
            sb.append(myMediaModel.f95383b);
            C50181a.m108292a(mo90161f(), sb.toString());
        }
    }

    /* renamed from: A */
    public final void mo24457A() {
        super.mo24457A();
        if (this.f33818l && this.f112073s) {
            TTVideoEngine tTVideoEngine = this.f112072r;
            if (tTVideoEngine == null) {
                C52711k.m112237a("videoEngine");
            }
            tTVideoEngine.pause();
        }
    }

    /* renamed from: z */
    public final void mo24481z() {
        super.mo24481z();
        if (this.f33818l && this.f112073s) {
            TTVideoEngine tTVideoEngine = this.f112072r;
            if (tTVideoEngine == null) {
                C52711k.m112237a("videoEngine");
            }
            tTVideoEngine.play();
        }
    }

    /* renamed from: a */
    public final void mo90136a() {
        if (this.f112072r != null) {
            TTVideoEngine tTVideoEngine = this.f112072r;
            if (tTVideoEngine == null) {
                C52711k.m112237a("videoEngine");
            }
            if (tTVideoEngine.getPlaybackState() == 2) {
                TTVideoEngine tTVideoEngine2 = this.f112072r;
                if (tTVideoEngine2 == null) {
                    C52711k.m112237a("videoEngine");
                }
                tTVideoEngine2.play();
            }
        }
    }

    public final void cg_() {
        if (this.f112072r != null) {
            TTVideoEngine tTVideoEngine = this.f112072r;
            if (tTVideoEngine == null) {
                C52711k.m112237a("videoEngine");
            }
            if (tTVideoEngine.getPlaybackState() == 1) {
                TTVideoEngine tTVideoEngine2 = this.f112072r;
                if (tTVideoEngine2 == null) {
                    C52711k.m112237a("videoEngine");
                }
                tTVideoEngine2.pause();
            }
        }
    }

    /* renamed from: p */
    public final void mo24469p() {
        int i;
        super.mo24469p();
        if (this.f112072r != null) {
            TTVideoEngine tTVideoEngine = this.f112072r;
            if (tTVideoEngine == null) {
                C52711k.m112237a("videoEngine");
            }
            tTVideoEngine.release();
            Surface surface = this.f112076v;
            if (surface != null) {
                surface.release();
            }
            if (this.f112073s) {
                String str = "tool_performance_preview_video_play_status";
                boolean z = this.f112075u;
                JSONObject jSONObject = new JSONObject();
                String str2 = "is_4k";
                if (this.f112070p == C44266b.DISABLE_4K) {
                    i = 1;
                } else {
                    i = 0;
                }
                jSONObject.put(str2, i);
                String str3 = "video_watched_duration";
                TTVideoEngine tTVideoEngine2 = this.f112072r;
                if (tTVideoEngine2 == null) {
                    C52711k.m112237a("videoEngine");
                }
                jSONObject.put(str3, Float.valueOf(((float) tTVideoEngine2.getWatchedDuration()) / 1000.0f));
                C23569o.m57776a(str, z ? 1 : 0, jSONObject);
            }
        }
    }

    /* renamed from: L */
    private static C44187a m96951L() {
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
    public final void mo90138a(MyMediaModel myMediaModel) {
        this.f112077x = myMediaModel;
    }

    /* renamed from: a */
    public static final /* synthetic */ TTVideoEngine m96952a(C44264p pVar) {
        TTVideoEngine tTVideoEngine = pVar.f112072r;
        if (tTVideoEngine == null) {
            C52711k.m112237a("videoEngine");
        }
        return tTVideoEngine;
    }

    /* renamed from: a */
    public final void mo24447a(boolean z) {
        super.mo24447a(z);
        if (this.f112072r != null) {
            if (this.f112073s) {
                if (z) {
                    TTVideoEngine tTVideoEngine = this.f112072r;
                    if (tTVideoEngine == null) {
                        C52711k.m112237a("videoEngine");
                    }
                    tTVideoEngine.play();
                    return;
                }
                TTVideoEngine tTVideoEngine2 = this.f112072r;
                if (tTVideoEngine2 == null) {
                    C52711k.m112237a("videoEngine");
                }
                tTVideoEngine2.pause();
                TTVideoEngine tTVideoEngine3 = this.f112072r;
                if (tTVideoEngine3 == null) {
                    C52711k.m112237a("videoEngine");
                }
                tTVideoEngine3.seekTo(0, null);
            } else if (!this.f112074t && this.f112076v != null && z) {
                TTVideoEngine tTVideoEngine4 = this.f112072r;
                if (tTVideoEngine4 == null) {
                    C52711k.m112237a("videoEngine");
                }
                tTVideoEngine4.play();
            }
        }
    }

    /* renamed from: b */
    public final void mo90159b(boolean z) {
        C44211e eVar = this.f112071q;
        if (eVar != null) {
            View ch_ = eVar.ch_();
            if (!(ch_ == null || ch_ == null)) {
                C44269e eVar2 = new C44269e(ch_);
                m96953i().mo90047a(eVar2.mo90113a(null), null, eVar2.mo90114b(null), 0.0f, new C44190b(), m96951L(), new C44268d(this));
                return;
            }
        }
        C44211e eVar3 = this.f112071q;
        if (eVar3 != null) {
            eVar3.mo90134c();
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (r10 <= 0) goto L_0x0030;
     */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0132  */
    /* JADX WARNING: Removed duplicated region for block: B:64:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:67:0x013a  */
    /* JADX WARNING: Removed duplicated region for block: B:68:0x013d  */
    /* JADX WARNING: Removed duplicated region for block: B:71:0x0153  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x0158  */
    /* JADX WARNING: Removed duplicated region for block: B:74:0x015b  */
    /* renamed from: e */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo24448e(android.os.Bundle r10) {
        /*
            r9 = this;
            super.mo24448e(r10)
            android.view.TextureView r10 = r9.mo90160d()
            r0 = 8
            r10.setVisibility(r0)
            com.facebook.drawee.view.SimpleDraweeView r10 = r9.mo90161f()
            r10.setVisibility(r0)
            android.widget.ImageView r10 = r9.m96949J()
            r10.setVisibility(r0)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r10 = r9.f112077x
            r0 = 0
            if (r10 == 0) goto L_0x0022
            int r10 = r10.f95390i
            goto L_0x0023
        L_0x0022:
            r10 = 0
        L_0x0023:
            r1 = 0
            if (r10 <= 0) goto L_0x0030
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r10 = r9.f112077x
            if (r10 == 0) goto L_0x002d
            int r10 = r10.f95391j
            goto L_0x002e
        L_0x002d:
            r10 = 0
        L_0x002e:
            if (r10 > 0) goto L_0x0059
        L_0x0030:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r10 = r9.f112077x
            if (r10 == 0) goto L_0x0037
            java.lang.String r10 = r10.f95383b
            goto L_0x0038
        L_0x0037:
            r10 = r1
        L_0x0038:
            if (r10 != 0) goto L_0x003c
            r10 = r1
            goto L_0x0047
        L_0x003c:
            com.ss.android.ugc.aweme.port.in.u r2 = com.p683ss.android.ugc.aweme.port.p2082in.C39629l.m88232a()
            r2.mo58586q()
            com.ss.android.vesdk.VEUtils$e r10 = com.p683ss.android.vesdk.VEUtils.getVideoFileInfo(r10)
        L_0x0047:
            if (r10 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r2 = r9.f112077x
            if (r2 == 0) goto L_0x0051
            int r3 = r10.f126801a
            r2.f95390i = r3
        L_0x0051:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r2 = r9.f112077x
            if (r2 == 0) goto L_0x0059
            int r10 = r10.f126802b
            r2.f95391j = r10
        L_0x0059:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r10 = r9.f112077x
            r2 = 1
            if (r10 == 0) goto L_0x011f
            java.lang.String r10 = r10.f95383b
            if (r10 == 0) goto L_0x011f
            java.lang.CharSequence r10 = (java.lang.CharSequence) r10
            int r10 = r10.length()
            if (r10 <= 0) goto L_0x006c
            r10 = 1
            goto L_0x006d
        L_0x006c:
            r10 = 0
        L_0x006d:
            if (r10 != r2) goto L_0x011f
            java.io.File r10 = new java.io.File
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r3 = r9.f112077x
            if (r3 == 0) goto L_0x0078
            java.lang.String r3 = r3.f95383b
            goto L_0x0079
        L_0x0078:
            r3 = r1
        L_0x0079:
            r10.<init>(r3)
            boolean r10 = r10.exists()
            if (r10 != 0) goto L_0x0084
            goto L_0x011f
        L_0x0084:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r10 = r9.f112077x
            com.ss.android.ugc.aweme.music.mediachoose.helper.MediaModel r10 = (com.p683ss.android.ugc.aweme.music.mediachoose.helper.MediaModel) r10
            boolean r10 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44263o.m96946a(r10)
            if (r10 == 0) goto L_0x009e
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$b r10 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44264p.C44266b.DISABLE_4K
            r9.f112070p = r10
            com.facebook.drawee.view.SimpleDraweeView r10 = r9.mo90161f()
            r10.setVisibility(r0)
            r9.m96950K()
            goto L_0x012a
        L_0x009e:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$b r10 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44264p.C44266b.NORMAL_VIDEO_PLAY
            r9.f112070p = r10
            com.facebook.drawee.view.SimpleDraweeView r10 = r9.mo90161f()
            r10.setVisibility(r0)
            r9.m96950K()
            android.view.TextureView r10 = r9.mo90160d()
            r10.setVisibility(r0)
            com.ss.android.ugc.tools.view.widget.AVLoadingLayout r10 = r9.mo90162h()
            r10.setVisibility(r0)
            com.ss.ttvideoengine.TTVideoEngine r10 = new com.ss.ttvideoengine.TTVideoEngine
            android.app.Activity r3 = r9.mo24477v()
            java.lang.String r4 = "requireActivity()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            android.content.Context r3 = r3.getApplicationContext()
            r4 = 2
            r10.<init>(r3, r4)
            r9.f112072r = r10
            com.ss.ttvideoengine.TTVideoEngine r10 = r9.f112072r
            if (r10 != 0) goto L_0x00d8
            java.lang.String r3 = "videoEngine"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00d8:
            java.lang.String r3 = "preview"
            r10.setSubTag(r3)
            com.ss.ttvideoengine.TTVideoEngine r10 = r9.f112072r
            if (r10 != 0) goto L_0x00e6
            java.lang.String r3 = "videoEngine"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00e6:
            r10.setLooping(r2)
            com.ss.ttvideoengine.TTVideoEngine r10 = r9.f112072r
            if (r10 != 0) goto L_0x00f2
            java.lang.String r3 = "videoEngine"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x00f2:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r3 = r9.f112077x
            if (r3 == 0) goto L_0x00f9
            java.lang.String r3 = r3.f95383b
            goto L_0x00fa
        L_0x00f9:
            r3 = r1
        L_0x00fa:
            r10.setLocalURL(r3)
            com.ss.ttvideoengine.TTVideoEngine r10 = r9.f112072r
            if (r10 != 0) goto L_0x0106
            java.lang.String r3 = "videoEngine"
            p2628d.p2639f.p2641b.C52711k.m112237a(r3)
        L_0x0106:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$g r3 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$g
            r3.<init>(r9)
            com.ss.ttvideoengine.VideoEngineListener r3 = (com.p683ss.ttvideoengine.VideoEngineListener) r3
            r10.setListener(r3)
            android.view.TextureView r10 = r9.mo90160d()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$h r3 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$h
            r3.<init>(r9)
            android.view.TextureView$SurfaceTextureListener r3 = (android.view.TextureView.SurfaceTextureListener) r3
            r10.setSurfaceTextureListener(r3)
            goto L_0x012a
        L_0x011f:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$b r10 = com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44264p.C44266b.FILE_DELETED
            r9.f112070p = r10
            android.widget.ImageView r10 = r9.m96949J()
            r10.setVisibility(r0)
        L_0x012a:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout r10 = r9.m96953i()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r3 = r9.f112077x
            if (r3 == 0) goto L_0x0135
            int r3 = r3.f95390i
            goto L_0x0136
        L_0x0135:
            r3 = 0
        L_0x0136:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.choosemedia.MvImageChooseAdapter$MyMediaModel r4 = r9.f112077x
            if (r4 == 0) goto L_0x013d
            int r4 = r4.f95391j
            goto L_0x013e
        L_0x013d:
            r4 = 0
        L_0x013e:
            r10.mo90045a(r3, r4)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout r10 = r9.m96953i()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$j r3 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$j
            r3.<init>(r9)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.d r3 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44199d) r3
            r10.setCallback(r3)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.e r10 = r9.f112071q
            if (r10 == 0) goto L_0x0158
            android.view.View r10 = r10.ch_()
            goto L_0x0159
        L_0x0158:
            r10 = r1
        L_0x0159:
            if (r10 == 0) goto L_0x018e
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.e r3 = r9.f112071q
            if (r3 == 0) goto L_0x018e
            boolean r3 = r3.mo90133a()
            if (r3 != r2) goto L_0x018e
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.e r2 = r9.f112071q
            if (r2 == 0) goto L_0x016c
            r2.mo90132a(r0)
        L_0x016c:
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$k r0 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.p$k
            r0.<init>(r10)
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.GestureLayout r2 = r9.m96953i()
            android.graphics.Rect r3 = r0.mo90113a(r1)
            r4 = 0
            android.graphics.Rect r5 = r0.mo90114b(r1)
            r6 = 0
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b r10 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.b
            r10.<init>()
            r7 = r10
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.f r7 = (com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.C44201f) r7
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.gesturelayout.a.a r8 = m96951L()
            r2.mo90046a(r3, r4, r5, r6, r7, r8)
        L_0x018e:
            android.arch.lifecycle.h r10 = r9.mo24446I()
            com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene$onActivityCreated$3 r0 = new com.ss.android.ugc.aweme.shortvideo.mvtemplate.preview.PreviewVideoScene$onActivityCreated$3
            r0.<init>(r9)
            android.arch.lifecycle.j r0 = (android.arch.lifecycle.C0183j) r0
            r10.mo324a(r0)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.shortvideo.mvtemplate.preview.C44264p.mo24448e(android.os.Bundle):void");
    }

    /* renamed from: a */
    public final void mo90137a(int i, C44211e eVar) {
        C52711k.m112240b(eVar, "controller");
        this.f112078y = i;
        this.f112071q = eVar;
    }

    /* renamed from: b */
    public final ViewGroup mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        View inflate = layoutInflater.inflate(R.layout.bre, viewGroup, false);
        if (inflate != null) {
            return (ViewGroup) inflate;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
