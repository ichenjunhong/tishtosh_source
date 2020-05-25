package com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1872c;

import android.graphics.SurfaceTexture;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.Display;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.WindowManager;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.BaseContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EncryptedVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33455c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1871b.C34710a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.C34743a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.C35318a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.C35324c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.C35324c.C35326b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.p1895a.C35320a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.p1895a.C35321b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.widget.KeepSurfaceTextureView;
import com.p683ss.android.ugc.aweme.video.C48016e;
import com.ss.android.ugc.trill.R;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.c */
public final class C34727c extends C34711a implements SurfaceTextureListener, C35326b {

    /* renamed from: h */
    public static final C34728a f89439h = new C34728a(null);

    /* renamed from: g */
    public ImageView f89440g;

    /* renamed from: i */
    private FrameLayout f89441i;

    /* renamed from: j */
    private DmtStatusView f89442j;

    /* renamed from: k */
    private RemoteImageView f89443k;

    /* renamed from: l */
    private KeepSurfaceTextureView f89444l;

    /* renamed from: m */
    private ImageView f89445m;

    /* renamed from: n */
    private String f89446n;

    /* renamed from: o */
    private EncryptedVideoContent f89447o;

    /* renamed from: p */
    private C35324c f89448p;

    /* renamed from: q */
    private boolean f89449q = true;

    /* renamed from: r */
    private boolean f89450r;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.c$a */
    public static final class C34728a {
        private C34728a() {
        }

        public /* synthetic */ C34728a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.c$b */
    static final class C34729b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ ImageView f89451a;

        /* renamed from: b */
        final /* synthetic */ C34727c f89452b;

        C34729b(ImageView imageView, C34727c cVar) {
            this.f89451a = imageView;
            this.f89452b = cVar;
        }

        public final void run() {
            this.f89451a.setVisibility(8);
            C34727c.m78729a(this.f89452b).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.c$c */
    static final class C34730c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34727c f89453a;

        C34730c(C34727c cVar) {
            this.f89453a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89453a.mo72779i();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.c$d */
    static final class C34731d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C34727c f89454a;

        C34731d(C34727c cVar) {
            this.f89454a = cVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f89454a.mo72773c();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.c$e */
    public static final class C34732e implements C0011g<C35321b, Void> {

        /* renamed from: a */
        final /* synthetic */ C34727c f89455a;

        /* renamed from: b */
        final /* synthetic */ String f89456b;

        public final /* synthetic */ Object then(C0013i iVar) {
            if (iVar == null || (iVar.mo33d() && iVar.mo34e() == null)) {
                C34727c cVar = this.f89455a;
                String string = this.f89455a.mo72767a().getString(R.string.bl6);
                C52711k.m112236a((Object) string, "context.getString(R.string.im_network_error)");
                cVar.mo72790b(string);
            } else {
                C34727c cVar2 = this.f89455a;
                Object e = iVar.mo34e();
                C52711k.m112236a(e, "task.result");
                cVar2.mo72789a((C35321b) e, this.f89456b);
            }
            return null;
        }

        C34732e(C34727c cVar, String str) {
            this.f89455a = cVar;
            this.f89456b = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.msgdetail.c.c$f */
    static final class C34733f implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C34727c f89457a;

        C34733f(C34727c cVar) {
            this.f89457a = cVar;
        }

        public final void run() {
            C34727c.m78729a(this.f89457a).setVisibility(0);
        }
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    /* renamed from: a */
    public final void mo72542a(boolean z) {
        if (z) {
            DmtStatusView dmtStatusView = this.f89442j;
            if (dmtStatusView == null) {
                C52711k.m112237a("loadingStatusView");
            }
            dmtStatusView.mo19209d();
            RemoteImageView remoteImageView = this.f89443k;
            if (remoteImageView == null) {
                C52711k.m112237a("videoCoverIv");
            }
            remoteImageView.setAlpha(0.0f);
            this.f89450r = false;
            this.f89449q = false;
            m78735l();
            return;
        }
        DmtStatusView dmtStatusView2 = this.f89442j;
        if (dmtStatusView2 == null) {
            C52711k.m112237a("loadingStatusView");
        }
        dmtStatusView2.mo19209d();
        m78734j();
    }

    /* renamed from: f */
    public final void mo72776f() {
        super.mo72776f();
        C35324c cVar = this.f89448p;
        if (cVar != null) {
            cVar.mo73497b();
        }
    }

    /* renamed from: g */
    public final void mo72777g() {
        super.mo72777g();
        C35324c cVar = this.f89448p;
        if (cVar != null) {
            cVar.mo73497b();
        }
    }

    /* renamed from: h */
    public final void mo72778h() {
        super.mo72778h();
        C35324c cVar = this.f89448p;
        if (cVar != null) {
            cVar.mo73499c();
        }
    }

    /* renamed from: k */
    public final void mo72546k() {
        DmtStatusView dmtStatusView = this.f89442j;
        if (dmtStatusView == null) {
            C52711k.m112237a("loadingStatusView");
        }
        dmtStatusView.mo19209d();
    }

    /* renamed from: l */
    private final void m78735l() {
        boolean z;
        ImageView imageView = this.f89445m;
        if (imageView == null) {
            C52711k.m112237a("playControlButton");
        }
        ImageView imageView2 = this.f89445m;
        if (imageView2 == null) {
            C52711k.m112237a("playControlButton");
        }
        if (imageView2.getVisibility() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (!z) {
            imageView = null;
        }
        if (imageView != null) {
            imageView.animate().alpha(0.0f).setDuration(100).withEndAction(new C34729b(imageView, this)).start();
        }
    }

    /* renamed from: j */
    private final void m78734j() {
        ImageView imageView = this.f89445m;
        if (imageView == null) {
            C52711k.m112237a("playControlButton");
        }
        if (imageView.getVisibility() != 0) {
            if (this.f89448p != null) {
                C35324c cVar = this.f89448p;
                if (cVar == null) {
                    C52711k.m112234a();
                }
                if (cVar.mo73502d()) {
                    return;
                }
            }
            ImageView imageView2 = this.f89445m;
            if (imageView2 == null) {
                C52711k.m112237a("playControlButton");
            }
            imageView2.setScaleX(2.5f);
            imageView2.setScaleY(2.5f);
            imageView2.setVisibility(0);
            imageView2.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).withEndAction(new C34733f(this)).start();
        }
    }

    /* renamed from: i */
    public final void mo72779i() {
        ImageView imageView = this.f89445m;
        if (imageView == null) {
            C52711k.m112237a("playControlButton");
        }
        if (imageView.getVisibility() != 0) {
            C35324c cVar = this.f89448p;
            if (cVar != null) {
                cVar.mo73497b();
            }
            DmtStatusView dmtStatusView = this.f89442j;
            if (dmtStatusView == null) {
                C52711k.m112237a("loadingStatusView");
            }
            dmtStatusView.mo19209d();
            this.f89450r = false;
            m78734j();
        } else if (this.f89449q) {
            KeepSurfaceTextureView keepSurfaceTextureView = this.f89444l;
            if (keepSurfaceTextureView == null) {
                C52711k.m112237a("videoTextureView");
            }
            if (keepSurfaceTextureView.f90727c) {
                m78730a(this.f89447o);
            }
            this.f89450r = true;
            DmtStatusView dmtStatusView2 = this.f89442j;
            if (dmtStatusView2 == null) {
                C52711k.m112237a("loadingStatusView");
            }
            dmtStatusView2.mo19212f();
            m78735l();
        } else {
            C35324c cVar2 = this.f89448p;
            if (cVar2 != null) {
                cVar2.mo73493a();
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ ImageView m78729a(C34727c cVar) {
        ImageView imageView = cVar.f89440g;
        if (imageView == null) {
            C52711k.m112237a("ivClose");
        }
        return imageView;
    }

    /* renamed from: c */
    private final void m78733c(String str) {
        C35324c cVar = this.f89448p;
        if (cVar != null) {
            cVar.mo73501d(str);
        }
        C35324c cVar2 = this.f89448p;
        if (cVar2 != null) {
            cVar2.mo73493a();
        }
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        RemoteImageView remoteImageView = this.f89443k;
        if (remoteImageView == null) {
            C52711k.m112237a("videoCoverIv");
        }
        remoteImageView.setAlpha(1.0f);
        return true;
    }

    /* renamed from: a */
    public final void mo72771a(C34743a aVar) {
        C52711k.m112240b(aVar, "dragState");
        super.mo72771a(aVar);
        if (aVar.mo72805a()) {
            ImageView imageView = this.f89440g;
            if (imageView == null) {
                C52711k.m112237a("ivClose");
            }
            ImageView imageView2 = this.f89445m;
            if (imageView2 == null) {
                C52711k.m112237a("playControlButton");
            }
            imageView.setVisibility(imageView2.getVisibility());
            return;
        }
        ImageView imageView3 = this.f89440g;
        if (imageView3 == null) {
            C52711k.m112237a("ivClose");
        }
        imageView3.setVisibility(8);
    }

    /* renamed from: b */
    public final void mo72790b(String str) {
        C10691a.m21546b(mo72767a(), str, 0).mo19066a();
        DmtStatusView dmtStatusView = this.f89442j;
        if (dmtStatusView == null) {
            C52711k.m112237a("loadingStatusView");
        }
        dmtStatusView.setVisibility(8);
        m78734j();
    }

    /* renamed from: a */
    private final void m78730a(EncryptedVideoContent encryptedVideoContent) {
        String str;
        if (TextUtils.isEmpty(this.f89446n) || !C48016e.m103944b(this.f89446n)) {
            if (encryptedVideoContent != null) {
                str = encryptedVideoContent.getTosKey();
            } else {
                str = null;
            }
            if (str == null || encryptedVideoContent.getSecretKey() == null) {
                String string = mo72767a().getString(R.string.bpc);
                C52711k.m112236a((Object) string, "context.getString(R.stri…im_video_file_play_error)");
                mo72790b(string);
                return;
            }
            String tosKey = encryptedVideoContent.getTosKey();
            if (tosKey == null) {
                C52711k.m112234a();
            }
            String secretKey = encryptedVideoContent.getSecretKey();
            if (secretKey == null) {
                C52711k.m112234a();
            }
            m78731a(tosKey, secretKey);
            return;
        }
        String str2 = this.f89446n;
        if (str2 == null) {
            C52711k.m112234a();
        }
        m78733c(str2);
    }

    /* renamed from: a */
    public final void mo72769a(View view) {
        C52711k.m112240b(view, "itemView");
        super.mo72769a(view);
        this.f89441i = (FrameLayout) mo72768a((int) R.id.eik);
        this.f89442j = (DmtStatusView) mo72768a((int) R.id.a8v);
        this.f89443k = (RemoteImageView) mo72768a((int) R.id.cd2);
        this.f89444l = (KeepSurfaceTextureView) mo72768a((int) R.id.cul);
        this.f89445m = (ImageView) mo72768a((int) R.id.b38);
        this.f89440g = (ImageView) mo72768a((int) R.id.az9);
        ImageView imageView = this.f89445m;
        if (imageView == null) {
            C52711k.m112237a("playControlButton");
        }
        imageView.setVisibility(0);
        ImageView imageView2 = this.f89445m;
        if (imageView2 == null) {
            C52711k.m112237a("playControlButton");
        }
        imageView2.setAlpha(1.0f);
        KeepSurfaceTextureView keepSurfaceTextureView = this.f89444l;
        if (keepSurfaceTextureView == null) {
            C52711k.m112237a("videoTextureView");
        }
        keepSurfaceTextureView.setSurfaceTextureListener(this);
        FrameLayout frameLayout = this.f89441i;
        if (frameLayout == null) {
            C52711k.m112237a("playVideoLayout");
        }
        frameLayout.setOnClickListener(new C34730c(this));
        ImageView imageView3 = this.f89440g;
        if (imageView3 == null) {
            C52711k.m112237a("ivClose");
        }
        imageView3.setOnClickListener(new C34731d(this));
        DmtStatusView dmtStatusView = this.f89442j;
        if (dmtStatusView == null) {
            C52711k.m112237a("loadingStatusView");
        }
        dmtStatusView.setBuilder(C10719a.m21676a(mo72767a()));
        this.f89448p = new C35324c(C11010c.m22280a(), false, 2, null);
        C35324c cVar = this.f89448p;
        if (cVar == null) {
            C52711k.m112234a();
        }
        cVar.mo73495a((C35326b) this);
    }

    /* renamed from: a */
    public final void mo72770a(C34710a<BaseContent> aVar) {
        C52711k.m112240b(aVar, "data");
        if (this.f89418e != aVar) {
            super.mo72770a(aVar);
            T t = aVar.f89410a;
            if (!(t instanceof StoryVideoContent)) {
                t = null;
            }
            StoryVideoContent storyVideoContent = (StoryVideoContent) t;
            if (storyVideoContent != null) {
                StoryVideoContent.Companion.updateContentLocal(storyVideoContent, aVar.f89411b);
                int width = storyVideoContent.getWidth();
                int height = storyVideoContent.getHeight();
                if (width > 0 && height > 0) {
                    DisplayMetrics displayMetrics = new DisplayMetrics();
                    FragmentActivity b = mo72772b();
                    if (b != null) {
                        WindowManager windowManager = b.getWindowManager();
                        if (windowManager != null) {
                            Display defaultDisplay = windowManager.getDefaultDisplay();
                            if (defaultDisplay != null) {
                                defaultDisplay.getMetrics(displayMetrics);
                                float f = ((float) height) / ((float) width);
                                FrameLayout frameLayout = this.f89441i;
                                if (frameLayout == null) {
                                    C52711k.m112237a("playVideoLayout");
                                }
                                LayoutParams layoutParams = frameLayout.getLayoutParams();
                                layoutParams.height = (int) (((float) displayMetrics.widthPixels) * f);
                                FrameLayout frameLayout2 = this.f89441i;
                                if (frameLayout2 == null) {
                                    C52711k.m112237a("playVideoLayout");
                                }
                                frameLayout2.setLayoutParams(layoutParams);
                            }
                        }
                    }
                }
                this.f89449q = true;
                this.f89447o = storyVideoContent.getVideo();
                this.f89446n = storyVideoContent.getLocalVideo();
                RemoteImageView remoteImageView = this.f89443k;
                if (remoteImageView == null) {
                    C52711k.m112237a("videoCoverIv");
                }
                remoteImageView.setAlpha(1.0f);
                ImageView imageView = this.f89445m;
                if (imageView == null) {
                    C52711k.m112237a("playControlButton");
                }
                imageView.setVisibility(0);
                ImageView imageView2 = this.f89440g;
                if (imageView2 == null) {
                    C52711k.m112237a("ivClose");
                }
                imageView2.setVisibility(0);
                UrlModel a = C33455c.m76688a(storyVideoContent.getDisplayPoster(), storyVideoContent.getLocalPoster());
                RemoteImageView remoteImageView2 = this.f89443k;
                if (remoteImageView2 == null) {
                    C52711k.m112237a("videoCoverIv");
                }
                C23515d.m57669a(remoteImageView2, a);
            }
        }
    }

    /* renamed from: a */
    public final void mo72541a(String str) {
        String string = mo72767a().getString(R.string.bpc);
        C52711k.m112236a((Object) string, "context.getString(R.stri…im_video_file_play_error)");
        mo72790b(string);
    }

    public C34727c(View view, RecyclerView recyclerView) {
        C52711k.m112240b(view, "itemView");
        C52711k.m112240b(recyclerView, "_recyclerView");
        super(view, recyclerView);
    }

    /* renamed from: a */
    private final void m78731a(String str, String str2) {
        C35318a.m79918a(str).mo20a((C0011g<TResult, TContinuationResult>) new C34732e<TResult,TContinuationResult>(this, str2), C0013i.f25b);
    }

    /* renamed from: b */
    private final void m78732b(String str, String str2) {
        C35324c cVar = this.f89448p;
        if (cVar != null) {
            cVar.mo73498b(str2);
        }
        C35324c cVar2 = this.f89448p;
        if (cVar2 != null) {
            cVar2.mo73500c(str);
        }
        C35324c cVar3 = this.f89448p;
        if (cVar3 != null) {
            cVar3.mo73493a();
        }
    }

    /* renamed from: a */
    public final void mo72789a(C35321b bVar, String str) {
        String str2;
        C35320a aVar = bVar.f90686d;
        String str3 = null;
        if (aVar != null) {
            str2 = aVar.f90681a;
        } else {
            str2 = null;
        }
        if (str2 != null) {
            this.f89446n = aVar.f90681a;
            m78732b(aVar.f90681a, str);
            return;
        }
        if (aVar != null) {
            str3 = aVar.f90682b;
        }
        if (str3 != null) {
            this.f89446n = aVar.f90682b;
            m78732b(aVar.f90682b, str);
            return;
        }
        String string = mo72767a().getString(R.string.bpc);
        C52711k.m112236a((Object) string, "context.getString(R.stri…im_video_file_play_error)");
        mo72790b(string);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0054, code lost:
        if (r3 == r5.getIndex()) goto L_0x0056;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onSurfaceTextureAvailable(android.graphics.SurfaceTexture r3, int r4, int r5) {
        /*
            r2 = this;
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r3 = r2.f89443k
            if (r3 != 0) goto L_0x0009
            java.lang.String r4 = "videoCoverIv"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0009:
            r4 = 1065353216(0x3f800000, float:1.0)
            r3.setAlpha(r4)
            com.ss.android.ugc.aweme.im.sdk.videofileplay.widget.KeepSurfaceTextureView r3 = r2.f89444l
            if (r3 != 0) goto L_0x0017
            java.lang.String r4 = "videoTextureView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0017:
            boolean r3 = r3.f90727c
            if (r3 == 0) goto L_0x009c
            com.ss.android.ugc.aweme.im.sdk.videofileplay.c r3 = r2.f89448p
            if (r3 == 0) goto L_0x002f
            com.ss.android.ugc.aweme.im.sdk.videofileplay.widget.KeepSurfaceTextureView r4 = r2.f89444l
            if (r4 != 0) goto L_0x0028
            java.lang.String r5 = "videoTextureView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0028:
            android.view.Surface r4 = r4.getSurface()
            r3.mo73494a(r4)
        L_0x002f:
            boolean r3 = r2.f89416c
            if (r3 == 0) goto L_0x0037
            boolean r3 = r2.f89450r
            if (r3 != 0) goto L_0x0056
        L_0x0037:
            android.support.v4.app.FragmentActivity r3 = r2.mo72772b()
            if (r3 != 0) goto L_0x0040
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0040:
            com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.MediaBrowserViewModel.C34734a.m78773a(r3)
            long r3 = r3.f89460b
            com.ss.android.ugc.aweme.im.sdk.msgdetail.b.a<com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent> r5 = r2.f89418e
            if (r5 == 0) goto L_0x009b
            com.bytedance.im.core.c.p r5 = r5.f89411b
            if (r5 == 0) goto L_0x009b
            long r0 = r5.getIndex()
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x00af
        L_0x0056:
            android.support.v4.app.FragmentActivity r3 = r2.mo72772b()
            if (r3 != 0) goto L_0x005f
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x005f:
            com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.MediaBrowserViewModel.C34734a.m78773a(r3)
            long r3 = r3.f89460b
            com.ss.android.ugc.aweme.im.sdk.msgdetail.b.a<com.ss.android.ugc.aweme.im.sdk.chat.model.BaseContent> r5 = r2.f89418e
            if (r5 == 0) goto L_0x0095
            com.bytedance.im.core.c.p r5 = r5.f89411b
            if (r5 == 0) goto L_0x0095
            long r0 = r5.getIndex()
            int r5 = (r3 > r0 ? 1 : (r3 == r0 ? 0 : -1))
            if (r5 != 0) goto L_0x0095
            android.support.v4.app.FragmentActivity r3 = r2.mo72772b()
            if (r3 != 0) goto L_0x007e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x007e:
            com.ss.android.ugc.aweme.im.sdk.msgdetail.viewmodel.MediaBrowserViewModel r3 = com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.viewmodel.MediaBrowserViewModel.C34734a.m78773a(r3)
            r4 = -1
            r3.f89460b = r4
            com.bytedance.ies.dmt.ui.widget.DmtStatusView r3 = r2.f89442j
            if (r3 != 0) goto L_0x008f
            java.lang.String r4 = "loadingStatusView"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x008f:
            r3.mo19212f()
            r2.m78735l()
        L_0x0095:
            com.ss.android.ugc.aweme.im.sdk.chat.model.EncryptedVideoContent r3 = r2.f89447o
            r2.m78730a(r3)
            return
        L_0x009b:
            return
        L_0x009c:
            android.content.Context r3 = r2.mo72767a()
            r4 = 2132545615(0x7f1c104f, float:2.0744425E38)
            java.lang.String r3 = r3.getString(r4)
            java.lang.String r4 = "context.getString(R.stri…im_video_file_play_error)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            r2.mo72790b(r3)
        L_0x00af:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.p1807im.sdk.msgdetail.p1872c.C34727c.onSurfaceTextureAvailable(android.graphics.SurfaceTexture, int, int):void");
    }
}
