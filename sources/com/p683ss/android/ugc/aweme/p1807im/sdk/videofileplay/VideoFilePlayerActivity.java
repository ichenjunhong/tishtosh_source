package com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay;

import android.animation.ValueAnimator;
import android.content.Context;
import android.content.Intent;
import android.graphics.SurfaceTexture;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView.SurfaceTextureListener;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.view.Window;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.ies.uikit.p697a.C11065a;
import com.p683ss.android.ugc.aweme.base.AmeActivity;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.EncryptedVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.model.StoryVideoContent;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.p1821f.C33455c;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.C35324c.C35326b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.p1895a.C35320a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.p1895a.C35321b;
import com.p683ss.android.ugc.aweme.p1807im.sdk.videofileplay.widget.KeepSurfaceTextureView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.DragView;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.DragView.C35353a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.widget.DragView.IViewInfo;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import p001a.C0011g;
import p001a.C0013i;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity */
public final class VideoFilePlayerActivity extends AmeActivity implements SurfaceTextureListener, OnClickListener {

    /* renamed from: h */
    public static final C35313a f90655h = new C35313a(null);

    /* renamed from: a */
    public FrameLayout f90656a;

    /* renamed from: b */
    public ImageView f90657b;

    /* renamed from: c */
    public DmtStatusView f90658c;

    /* renamed from: d */
    public RemoteImageView f90659d;

    /* renamed from: e */
    public C35324c f90660e;

    /* renamed from: f */
    String f90661f;

    /* renamed from: g */
    public int f90662g = -1;

    /* renamed from: i */
    private DragView f90663i;

    /* renamed from: j */
    private View f90664j;

    /* renamed from: k */
    private KeepSurfaceTextureView f90665k;

    /* renamed from: l */
    private FrameLayout f90666l;

    /* renamed from: m */
    private IViewInfo f90667m;

    /* renamed from: n */
    private EncryptedVideoContent f90668n;

    /* renamed from: o */
    private String f90669o;

    /* renamed from: p */
    private UrlModel f90670p;

    /* renamed from: q */
    private int f90671q;

    /* renamed from: r */
    private int f90672r;

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity$a */
    public static final class C35313a {
        private C35313a() {
        }

        public /* synthetic */ C35313a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity$b */
    static final class C35314b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ VideoFilePlayerActivity f90673a;

        C35314b(VideoFilePlayerActivity videoFilePlayerActivity) {
            this.f90673a = videoFilePlayerActivity;
        }

        public final void run() {
            VideoFilePlayerActivity.m79901d(this.f90673a).setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity$c */
    public static final class C35315c implements C35353a {

        /* renamed from: a */
        final /* synthetic */ VideoFilePlayerActivity f90674a;

        /* renamed from: d */
        public final void mo71095d() {
        }

        /* renamed from: g */
        public final boolean mo71098g() {
            return false;
        }

        /* renamed from: h */
        public final boolean mo71099h() {
            return false;
        }

        /* renamed from: b */
        public final void mo71093b() {
            VideoFilePlayerActivity.m79894a(this.f90674a).setVisibility(8);
        }

        /* renamed from: f */
        public final void mo71097f() {
            this.f90674a.f90662g = 0;
            this.f90674a.finish();
        }

        /* renamed from: a */
        public final void mo71091a() {
            VideoFilePlayerActivity.m79894a(this.f90674a).setVisibility(8);
            this.f90674a.f90662g = -1;
        }

        /* renamed from: e */
        public final void mo71096e() {
            VideoFilePlayerActivity.m79901d(this.f90674a).setVisibility(8);
            VideoFilePlayerActivity.m79894a(this.f90674a).setVisibility(8);
            this.f90674a.f90662g = 1;
        }

        /* renamed from: c */
        public final void mo71094c() {
            if (VideoFilePlayerActivity.m79899c(this.f90674a).getVisibility() != 0) {
                C35324c cVar = this.f90674a.f90660e;
                if (cVar == null) {
                    C52711k.m112237a("mTTVideoPlayer");
                }
                if (!cVar.mo73502d()) {
                    VideoFilePlayerActivity.m79901d(this.f90674a).setVisibility(0);
                    VideoFilePlayerActivity.m79901d(this.f90674a).setAlpha(1.0f);
                }
            }
            VideoFilePlayerActivity.m79894a(this.f90674a).setVisibility(0);
            this.f90674a.f90662g = 0;
        }

        C35315c(VideoFilePlayerActivity videoFilePlayerActivity) {
            this.f90674a = videoFilePlayerActivity;
        }

        /* renamed from: a */
        public final void mo71092a(ValueAnimator valueAnimator) {
            Object obj;
            if (valueAnimator != null) {
                obj = valueAnimator.getAnimatedValue();
            } else {
                obj = null;
            }
            if (obj != null) {
                VideoFilePlayerActivity.m79896b(this.f90674a).setAlpha(1.0f - ((Float) obj).floatValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity$d */
    public static final class C35316d implements C35326b {

        /* renamed from: a */
        final /* synthetic */ VideoFilePlayerActivity f90675a;

        /* renamed from: k */
        public final void mo72546k() {
            VideoFilePlayerActivity.m79899c(this.f90675a).setVisibility(8);
        }

        C35316d(VideoFilePlayerActivity videoFilePlayerActivity) {
            this.f90675a = videoFilePlayerActivity;
        }

        /* renamed from: a */
        public final void mo72541a(String str) {
            VideoFilePlayerActivity videoFilePlayerActivity = this.f90675a;
            String string = this.f90675a.getString(R.string.bpc);
            C52711k.m112236a((Object) string, "getString(R.string.im_video_file_play_error)");
            videoFilePlayerActivity.mo73463a(string);
        }

        /* renamed from: a */
        public final void mo72542a(boolean z) {
            if (z) {
                this.f90675a.mo73465b();
                VideoFilePlayerActivity.m79896b(this.f90675a).setAlpha(0.0f);
                return;
            }
            this.f90675a.mo73462a();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity$e */
    public static final class C35317e implements C0011g<C35321b, Void> {

        /* renamed from: a */
        final /* synthetic */ VideoFilePlayerActivity f90676a;

        /* renamed from: b */
        final /* synthetic */ String f90677b;

        public final /* synthetic */ Object then(C0013i iVar) {
            String str;
            String str2;
            if (iVar == null || (iVar.mo33d() && iVar.mo34e() == null)) {
                VideoFilePlayerActivity videoFilePlayerActivity = this.f90676a;
                String string = this.f90676a.getString(R.string.bl6);
                C52711k.m112236a((Object) string, "getString(R.string.im_network_error)");
                videoFilePlayerActivity.mo73463a(string);
            } else {
                VideoFilePlayerActivity videoFilePlayerActivity2 = this.f90676a;
                Object e = iVar.mo34e();
                C52711k.m112236a(e, "task.result");
                C35321b bVar = (C35321b) e;
                String str3 = this.f90677b;
                C35320a aVar = bVar.f90686d;
                if (aVar != null) {
                    str = aVar.f90681a;
                } else {
                    str = null;
                }
                if (str != null) {
                    videoFilePlayerActivity2.f90661f = aVar.f90681a;
                    videoFilePlayerActivity2.mo73464a(aVar.f90681a, str3);
                } else {
                    if (aVar != null) {
                        str2 = aVar.f90682b;
                    } else {
                        str2 = null;
                    }
                    if (str2 != null) {
                        videoFilePlayerActivity2.f90661f = aVar.f90682b;
                        videoFilePlayerActivity2.mo73464a(aVar.f90682b, str3);
                    } else {
                        String string2 = videoFilePlayerActivity2.getString(R.string.bpc);
                        C52711k.m112236a((Object) string2, "getString(R.string.im_video_file_play_error)");
                        videoFilePlayerActivity2.mo73463a(string2);
                    }
                }
            }
            return null;
        }

        C35317e(VideoFilePlayerActivity videoFilePlayerActivity, String str) {
            this.f90676a = videoFilePlayerActivity;
            this.f90677b = str;
        }
    }

    public final void onBackPressed() {
        m79900c();
    }

    public final void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onResume", true);
        super.onResume();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onResume", false);
    }

    public final boolean onSurfaceTextureDestroyed(SurfaceTexture surfaceTexture) {
        return true;
    }

    public final void onSurfaceTextureSizeChanged(SurfaceTexture surfaceTexture, int i, int i2) {
    }

    public final void onSurfaceTextureUpdated(SurfaceTexture surfaceTexture) {
    }

    public final void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    public final void finish() {
        super.finish();
        overridePendingTransition(0, 0);
    }

    public final void onDestroy() {
        super.onDestroy();
        C35324c cVar = this.f90660e;
        if (cVar == null) {
            C52711k.m112237a("mTTVideoPlayer");
        }
        cVar.mo73499c();
    }

    public final void onPause() {
        super.onPause();
        C35324c cVar = this.f90660e;
        if (cVar == null) {
            C52711k.m112237a("mTTVideoPlayer");
        }
        cVar.mo73497b();
    }

    /* renamed from: c */
    private final void m79900c() {
        DragView dragView = this.f90663i;
        if (dragView == null) {
            C52711k.m112237a("mDragView");
        }
        dragView.mo73534a();
    }

    /* renamed from: b */
    public final void mo73465b() {
        ImageView imageView = this.f90657b;
        if (imageView == null) {
            C52711k.m112237a("mCenterPlayBtn");
        }
        if (imageView.getVisibility() == 0) {
            ImageView imageView2 = this.f90657b;
            if (imageView2 == null) {
                C52711k.m112237a("mCenterPlayBtn");
            }
            imageView2.animate().alpha(0.0f).setDuration(100).withEndAction(new C35314b(this)).start();
        }
    }

    /* renamed from: a */
    public final void mo73462a() {
        if (!(this.f90662g == -1 || this.f90662g == 1)) {
            C35324c cVar = this.f90660e;
            if (cVar == null) {
                C52711k.m112237a("mTTVideoPlayer");
            }
            if (!cVar.mo73502d()) {
                DmtStatusView dmtStatusView = this.f90658c;
                if (dmtStatusView == null) {
                    C52711k.m112237a("mLoadingStatusView");
                }
                if (dmtStatusView.getVisibility() != 0) {
                    ImageView imageView = this.f90657b;
                    if (imageView == null) {
                        C52711k.m112237a("mCenterPlayBtn");
                    }
                    imageView.setScaleX(2.5f);
                    ImageView imageView2 = this.f90657b;
                    if (imageView2 == null) {
                        C52711k.m112237a("mCenterPlayBtn");
                    }
                    imageView2.setScaleY(2.5f);
                    ImageView imageView3 = this.f90657b;
                    if (imageView3 == null) {
                        C52711k.m112237a("mCenterPlayBtn");
                    }
                    imageView3.setVisibility(0);
                    ImageView imageView4 = this.f90657b;
                    if (imageView4 == null) {
                        C52711k.m112237a("mCenterPlayBtn");
                    }
                    imageView4.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
                }
            }
        }
    }

    /* renamed from: a */
    public static final /* synthetic */ FrameLayout m79894a(VideoFilePlayerActivity videoFilePlayerActivity) {
        FrameLayout frameLayout = videoFilePlayerActivity.f90656a;
        if (frameLayout == null) {
            C52711k.m112237a("mBackBtn");
        }
        return frameLayout;
    }

    /* renamed from: b */
    public static final /* synthetic */ RemoteImageView m79896b(VideoFilePlayerActivity videoFilePlayerActivity) {
        RemoteImageView remoteImageView = videoFilePlayerActivity.f90659d;
        if (remoteImageView == null) {
            C52711k.m112237a("mVideoCoverImage");
        }
        return remoteImageView;
    }

    /* renamed from: c */
    public static final /* synthetic */ DmtStatusView m79899c(VideoFilePlayerActivity videoFilePlayerActivity) {
        DmtStatusView dmtStatusView = videoFilePlayerActivity.f90658c;
        if (dmtStatusView == null) {
            C52711k.m112237a("mLoadingStatusView");
        }
        return dmtStatusView;
    }

    /* renamed from: d */
    public static final /* synthetic */ ImageView m79901d(VideoFilePlayerActivity videoFilePlayerActivity) {
        ImageView imageView = videoFilePlayerActivity.f90657b;
        if (imageView == null) {
            C52711k.m112237a("mCenterPlayBtn");
        }
        return imageView;
    }

    /* renamed from: b */
    private final void m79897b(String str) {
        C35324c cVar = this.f90660e;
        if (cVar == null) {
            C52711k.m112237a("mTTVideoPlayer");
        }
        cVar.mo73501d(str);
        C35324c cVar2 = this.f90660e;
        if (cVar2 == null) {
            C52711k.m112237a("mTTVideoPlayer");
        }
        cVar2.mo73493a();
    }

    /* renamed from: a */
    public final void mo73463a(String str) {
        C10691a.m21546b((Context) this, str, 0).mo19066a();
        DmtStatusView dmtStatusView = this.f90658c;
        if (dmtStatusView == null) {
            C52711k.m112237a("mLoadingStatusView");
        }
        dmtStatusView.setVisibility(8);
        mo73462a();
    }

    /* renamed from: a */
    private final void m79895a(EncryptedVideoContent encryptedVideoContent) {
        String str;
        if (encryptedVideoContent != null) {
            str = encryptedVideoContent.getTosKey();
        } else {
            str = null;
        }
        if (str != null && encryptedVideoContent.getSecretKey() != null) {
            String tosKey = encryptedVideoContent.getTosKey();
            if (tosKey == null) {
                C52711k.m112234a();
            }
            String secretKey = encryptedVideoContent.getSecretKey();
            if (secretKey == null) {
                C52711k.m112234a();
            }
            m79898b(tosKey, secretKey);
        } else if (!TextUtils.isEmpty(this.f90661f)) {
            String str2 = this.f90661f;
            if (str2 == null) {
                C52711k.m112234a();
            }
            m79897b(str2);
        } else {
            String string = getString(R.string.bpc);
            C52711k.m112236a((Object) string, "getString(R.string.im_video_file_play_error)");
            mo73463a(string);
        }
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        if (view == null || view.getId() != R.id.b8y) {
            DmtStatusView dmtStatusView = this.f90658c;
            if (dmtStatusView == null) {
                C52711k.m112237a("mLoadingStatusView");
            }
            if (dmtStatusView.getVisibility() == 8) {
                C35324c cVar = this.f90660e;
                if (cVar == null) {
                    C52711k.m112237a("mTTVideoPlayer");
                }
                if (cVar.mo73502d()) {
                    C35324c cVar2 = this.f90660e;
                    if (cVar2 == null) {
                        C52711k.m112237a("mTTVideoPlayer");
                    }
                    cVar2.mo73497b();
                    return;
                } else if (this.f90661f != null) {
                    C35324c cVar3 = this.f90660e;
                    if (cVar3 == null) {
                        C52711k.m112237a("mTTVideoPlayer");
                    }
                    cVar3.mo73493a();
                    return;
                } else {
                    mo73465b();
                    DmtStatusView dmtStatusView2 = this.f90658c;
                    if (dmtStatusView2 == null) {
                        C52711k.m112237a("mLoadingStatusView");
                    }
                    dmtStatusView2.setVisibility(0);
                    m79895a(this.f90668n);
                }
            }
            return;
        }
        m79900c();
    }

    public final void onCreate(Bundle bundle) {
        Serializable serializable;
        IViewInfo iViewInfo;
        String str;
        String str2;
        UrlModel urlModel;
        int i;
        int i2;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onCreate", true);
        overridePendingTransition(0, 0);
        super.onCreate(bundle);
        if (VERSION.SDK_INT >= 19) {
            Window window = getWindow();
            if (window != null) {
                window.addFlags(67108864);
            }
        }
        setContentView((int) R.layout.bc9);
        Context context = this;
        EncryptedVideoContent encryptedVideoContent = null;
        this.f90660e = new C35324c(context, false, 2, null);
        Intent intent = getIntent();
        if (intent != null) {
            serializable = intent.getSerializableExtra("videoContent");
        } else {
            serializable = null;
        }
        StoryVideoContent storyVideoContent = (StoryVideoContent) serializable;
        Intent intent2 = getIntent();
        if (intent2 != null) {
            iViewInfo = (IViewInfo) intent2.getParcelableExtra("dragViewInfo");
        } else {
            iViewInfo = null;
        }
        this.f90667m = iViewInfo;
        Intent intent3 = getIntent();
        if (intent3 != null) {
            str = intent3.getStringExtra("localPoster");
        } else {
            str = null;
        }
        this.f90669o = str;
        Intent intent4 = getIntent();
        if (intent4 != null) {
            str2 = intent4.getStringExtra("localVideo");
        } else {
            str2 = null;
        }
        this.f90661f = str2;
        if (storyVideoContent != null) {
            urlModel = storyVideoContent.getDisplayPoster();
        } else {
            urlModel = null;
        }
        this.f90670p = urlModel;
        if (storyVideoContent != null) {
            i = storyVideoContent.getHeight();
        } else {
            i = 0;
        }
        this.f90671q = i;
        if (storyVideoContent != null) {
            i2 = storyVideoContent.getWidth();
        } else {
            i2 = 0;
        }
        this.f90672r = i2;
        if (storyVideoContent != null) {
            encryptedVideoContent = storyVideoContent.getVideo();
        }
        this.f90668n = encryptedVideoContent;
        View findViewById = findViewById(R.id.b_j);
        C52711k.m112236a((Object) findViewById, "findViewById(R.id.layout_video_drag_container)");
        this.f90663i = (DragView) findViewById;
        if (VERSION.SDK_INT >= 19) {
            DragView dragView = this.f90663i;
            if (dragView == null) {
                C52711k.m112237a("mDragView");
            }
            dragView.setFullScreenWindow(true);
        }
        View findViewById2 = findViewById(R.id.b90);
        C52711k.m112236a((Object) findViewById2, "findViewById(R.id.layout_play_video)");
        this.f90666l = (FrameLayout) findViewById2;
        View findViewById3 = findViewById(R.id.b8y);
        C52711k.m112236a((Object) findViewById3, "findViewById(R.id.layout_play_back)");
        this.f90656a = (FrameLayout) findViewById3;
        FrameLayout frameLayout = this.f90656a;
        if (frameLayout == null) {
            C52711k.m112237a("mBackBtn");
        }
        LayoutParams layoutParams = frameLayout.getLayoutParams();
        if (layoutParams != null) {
            ((FrameLayout.LayoutParams) layoutParams).topMargin = C11065a.m22390a(context);
            LayoutInflater from = LayoutInflater.from(context);
            DragView dragView2 = this.f90663i;
            if (dragView2 == null) {
                C52711k.m112237a("mDragView");
            }
            View inflate = from.inflate(R.layout.bd_, dragView2, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(this…detail, mDragView, false)");
            this.f90664j = inflate;
            View view = this.f90664j;
            if (view == null) {
                C52711k.m112237a("mDragContentView");
            }
            View findViewById4 = view.findViewById(R.id.a8v);
            C52711k.m112236a((Object) findViewById4, "mDragContentView.findVie…Id(R.id.dsv_play_loading)");
            this.f90658c = (DmtStatusView) findViewById4;
            View view2 = this.f90664j;
            if (view2 == null) {
                C52711k.m112237a("mDragContentView");
            }
            View findViewById5 = view2.findViewById(R.id.cul);
            C52711k.m112236a((Object) findViewById5, "mDragContentView.findViewById(R.id.stv_play_video)");
            this.f90665k = (KeepSurfaceTextureView) findViewById5;
            View view3 = this.f90664j;
            if (view3 == null) {
                C52711k.m112237a("mDragContentView");
            }
            View findViewById6 = view3.findViewById(R.id.cd2);
            C52711k.m112236a((Object) findViewById6, "mDragContentView.findVie…yId(R.id.riv_video_cover)");
            this.f90659d = (RemoteImageView) findViewById6;
            View view4 = this.f90664j;
            if (view4 == null) {
                C52711k.m112237a("mDragContentView");
            }
            View findViewById7 = view4.findViewById(R.id.b38);
            C52711k.m112236a((Object) findViewById7, "mDragContentView.findViewById(R.id.iv_play_center)");
            this.f90657b = (ImageView) findViewById7;
            if (this.f90667m != null) {
                View view5 = this.f90664j;
                if (view5 == null) {
                    C52711k.m112237a("mDragContentView");
                }
                View findViewById8 = view5.findViewById(R.id.b90);
                C52711k.m112236a((Object) findViewById8, "mDragContentView.findVie…d(R.id.layout_play_video)");
                DragView dragView3 = this.f90663i;
                if (dragView3 == null) {
                    C52711k.m112237a("mDragView");
                }
                View view6 = this.f90664j;
                if (view6 == null) {
                    C52711k.m112237a("mDragContentView");
                }
                dragView3.mo73536a(view6, findViewById8, this.f90667m);
            }
            UrlModel a = C33455c.m76688a(this.f90670p, this.f90669o);
            RemoteImageView remoteImageView = this.f90659d;
            if (remoteImageView == null) {
                C52711k.m112237a("mVideoCoverImage");
            }
            C23515d.m57669a(remoteImageView, a);
            DmtStatusView dmtStatusView = this.f90658c;
            if (dmtStatusView == null) {
                C52711k.m112237a("mLoadingStatusView");
            }
            dmtStatusView.setBuilder(C10719a.m21676a(context));
            DmtStatusView dmtStatusView2 = this.f90658c;
            if (dmtStatusView2 == null) {
                C52711k.m112237a("mLoadingStatusView");
            }
            dmtStatusView2.mo19212f();
            KeepSurfaceTextureView keepSurfaceTextureView = this.f90665k;
            if (keepSurfaceTextureView == null) {
                C52711k.m112237a("mVideoTextureView");
            }
            keepSurfaceTextureView.setSurfaceTextureListener(this);
            View view7 = this.f90664j;
            if (view7 == null) {
                C52711k.m112237a("mDragContentView");
            }
            OnClickListener onClickListener = this;
            view7.setOnClickListener(onClickListener);
            FrameLayout frameLayout2 = this.f90666l;
            if (frameLayout2 == null) {
                C52711k.m112237a("mPlayVideoLayout");
            }
            frameLayout2.setOnClickListener(onClickListener);
            FrameLayout frameLayout3 = this.f90656a;
            if (frameLayout3 == null) {
                C52711k.m112237a("mBackBtn");
            }
            frameLayout3.setOnClickListener(onClickListener);
            C35324c cVar = this.f90660e;
            if (cVar == null) {
                C52711k.m112237a("mTTVideoPlayer");
            }
            cVar.mo73495a((C35326b) new C35316d(this));
            DragView dragView4 = this.f90663i;
            if (dragView4 == null) {
                C52711k.m112237a("mDragView");
            }
            dragView4.setDragStateListener(new C35315c(this));
            ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.im.sdk.videofileplay.VideoFilePlayerActivity", "onCreate", false);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
    }

    /* renamed from: b */
    private final void m79898b(String str, String str2) {
        C35318a.m79918a(str).mo20a((C0011g<TResult, TContinuationResult>) new C35317e<TResult,TContinuationResult>(this, str2), C0013i.f25b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final void mo73464a(String str, String str2) {
        C35324c cVar = this.f90660e;
        if (cVar == null) {
            C52711k.m112237a("mTTVideoPlayer");
        }
        cVar.mo73498b(str2);
        C35324c cVar2 = this.f90660e;
        if (cVar2 == null) {
            C52711k.m112237a("mTTVideoPlayer");
        }
        cVar2.mo73500c(str);
        C35324c cVar3 = this.f90660e;
        if (cVar3 == null) {
            C52711k.m112237a("mTTVideoPlayer");
        }
        cVar3.mo73493a();
    }

    public final void onSurfaceTextureAvailable(SurfaceTexture surfaceTexture, int i, int i2) {
        KeepSurfaceTextureView keepSurfaceTextureView = this.f90665k;
        if (keepSurfaceTextureView == null) {
            C52711k.m112237a("mVideoTextureView");
        }
        if (keepSurfaceTextureView.f90727c) {
            C35324c cVar = this.f90660e;
            if (cVar == null) {
                C52711k.m112237a("mTTVideoPlayer");
            }
            KeepSurfaceTextureView keepSurfaceTextureView2 = this.f90665k;
            if (keepSurfaceTextureView2 == null) {
                C52711k.m112237a("mVideoTextureView");
            }
            cVar.mo73494a(keepSurfaceTextureView2.getSurface());
            m79895a(this.f90668n);
            return;
        }
        String string = getString(R.string.bpc);
        C52711k.m112236a((Object) string, "getString(R.string.im_video_file_play_error)");
        mo73463a(string);
    }
}
