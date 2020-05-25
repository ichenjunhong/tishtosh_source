package com.p683ss.android.ugc.aweme.welcome;

import android.content.Context;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.SurfaceView;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.account.p1297m.p1298a.p1299a.C22052a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.p685s.C10917a;
import com.p683ss.android.ugc.aweme.utils.C47721bi;
import com.p683ss.android.ugc.aweme.utils.C47723bk;
import com.p683ss.android.ugc.aweme.video.p2393b.C47993b;
import com.p683ss.android.ugc.aweme.welcome.C48383a.C48385b;
import com.p683ss.android.ugc.aweme.welcome.C48383a.C48386c;
import com.p683ss.android.ugc.aweme.welcome.C48383a.C48387d;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.trill.R;
import java.io.File;
import kotlinx.coroutines.C53199ae;
import kotlinx.coroutines.C53256be;
import p2628d.C52848o;
import p2628d.C52857u;
import p2628d.C52860x;
import p2628d.p2631c.C52625c;
import p2628d.p2631c.C52635g;
import p2628d.p2631c.p2632a.C52601b;
import p2628d.p2631c.p2633b.p2634a.C52614b;
import p2628d.p2631c.p2633b.p2634a.C52618f;
import p2628d.p2631c.p2633b.p2634a.C52620h;
import p2628d.p2631c.p2633b.p2634a.C52624k;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeVideoWidget */
public final class WelcomeVideoWidget extends Widget implements C48385b {

    /* renamed from: a */
    public final int f121682a = 10;

    /* renamed from: h */
    RemoteImageView f121683h;

    /* renamed from: i */
    View f121684i;

    /* renamed from: j */
    C48383a f121685j;

    /* renamed from: k */
    public String f121686k = "welcome_screen_video4.mp4";

    /* renamed from: l */
    public String f121687l;

    /* renamed from: m */
    public boolean f121688m;

    /* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeVideoWidget$a */
    static final class C48381a extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        int f121689a;

        /* renamed from: b */
        final /* synthetic */ C52625c f121690b;

        /* renamed from: c */
        final /* synthetic */ WelcomeVideoWidget f121691c;

        /* renamed from: d */
        private C53199ae f121692d;

        C48381a(C52625c cVar, C52625c cVar2, WelcomeVideoWidget welcomeVideoWidget) {
            this.f121690b = cVar;
            this.f121691c = welcomeVideoWidget;
            super(2, cVar2);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C48381a aVar = new C48381a(this.f121690b, cVar, this.f121691c);
            aVar.f121692d = (C53199ae) obj;
            return aVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C48381a) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            if (this.f121689a == 0) {
                Context context = this.f121691c.f62235b;
                String str = this.f121691c.f121686k;
                File externalCacheDir = C11010c.m22280a().getExternalCacheDir();
                C52711k.m112236a((Object) externalCacheDir, "AppContextManager.getApp…ontext().externalCacheDir");
                C47721bi.m103300a(context, str, externalCacheDir.getAbsolutePath());
                this.f121690b.resumeWith(C52848o.m114620constructorimpl(C52614b.m112161a(true)));
                return C52860x.f131107a;
            }
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
    }

    @C52618f(mo110254b = "WelcomeVideoWidget.kt", mo110255c = {52}, mo110256d = "invokeSuspend", mo110257e = "com.ss.android.ugc.aweme.welcome.WelcomeVideoWidget$onBindView$1")
    /* renamed from: com.ss.android.ugc.aweme.welcome.WelcomeVideoWidget$b */
    static final class C48382b extends C52624k implements C52682m<C53199ae, C52625c<? super C52860x>, Object> {

        /* renamed from: a */
        Object f121693a;

        /* renamed from: b */
        Object f121694b;

        /* renamed from: c */
        int f121695c;

        /* renamed from: d */
        final /* synthetic */ WelcomeVideoWidget f121696d;

        /* renamed from: e */
        final /* synthetic */ View f121697e;

        /* renamed from: f */
        private C53199ae f121698f;

        C48382b(WelcomeVideoWidget welcomeVideoWidget, View view, C52625c cVar) {
            this.f121696d = welcomeVideoWidget;
            this.f121697e = view;
            super(2, cVar);
        }

        public final C52625c<C52860x> create(Object obj, C52625c<?> cVar) {
            C52711k.m112240b(cVar, "completion");
            C48382b bVar = new C48382b(this.f121696d, this.f121697e, cVar);
            bVar.f121698f = (C53199ae) obj;
            return bVar;
        }

        public final Object invoke(Object obj, Object obj2) {
            return ((C48382b) create(obj, (C52625c) obj2)).invokeSuspend(C52860x.f131107a);
        }

        public final Object invokeSuspend(Object obj) {
            WelcomeVideoWidget welcomeVideoWidget;
            Video video;
            boolean z;
            Object a = C52601b.m112157a();
            UrlModel urlModel = null;
            switch (this.f121695c) {
                case 0:
                    C53199ae aeVar = this.f121698f;
                    WelcomeVideoWidget welcomeVideoWidget2 = this.f121696d;
                    WelcomeVideoWidget welcomeVideoWidget3 = this.f121696d;
                    this.f121693a = aeVar;
                    this.f121694b = welcomeVideoWidget2;
                    this.f121695c = 1;
                    C52635g gVar = new C52635g(C52601b.m112154a(this));
                    C52625c cVar = gVar;
                    if (TextUtils.isEmpty(welcomeVideoWidget3.f121687l)) {
                        cVar.resumeWith(C52848o.m114620constructorimpl(C52614b.m112161a(false)));
                    } else if (C47723bk.m103311a(welcomeVideoWidget3.f121687l)) {
                        cVar.resumeWith(C52848o.m114620constructorimpl(C52614b.m112161a(true)));
                    } else {
                        if (C47723bk.m103305a() > ((long) welcomeVideoWidget3.f121682a)) {
                            z = true;
                        } else {
                            z = false;
                        }
                        if (!z) {
                            cVar.resumeWith(C52848o.m114620constructorimpl(C52614b.m112161a(false)));
                        } else {
                            C53301g.m113291a(C53256be.f131885a, null, null, new C48381a(cVar, null, welcomeVideoWidget3), 3, null);
                        }
                    }
                    obj = gVar.mo110263a();
                    if (obj == C52601b.m112157a()) {
                        C52620h.m112171b(this);
                    }
                    if (obj != a) {
                        welcomeVideoWidget = welcomeVideoWidget2;
                        break;
                    } else {
                        return a;
                    }
                case 1:
                    welcomeVideoWidget = (WelcomeVideoWidget) this.f121694b;
                    break;
                default:
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            welcomeVideoWidget.f121688m = ((Boolean) obj).booleanValue();
            if (this.f121696d.f121688m) {
                WelcomeVideoWidget welcomeVideoWidget4 = this.f121696d;
                View findViewById = this.f121697e.findViewById(R.id.doz);
                C52711k.m112236a((Object) findViewById, "view.findViewById(R.id.video_container)");
                welcomeVideoWidget4.f121684i = findViewById;
                View view = welcomeVideoWidget4.f121684i;
                if (view == null) {
                    C52711k.m112237a("mVideoContainer");
                }
                welcomeVideoWidget4.f121685j = new C48383a(view, welcomeVideoWidget4);
                C48383a aVar = welcomeVideoWidget4.f121685j;
                if (aVar == null) {
                    C52711k.m112237a("mWelcomeVideoHolder");
                }
                Aweme a2 = C47993b.f120631a.mo95152a(welcomeVideoWidget4.f121687l);
                C52711k.m112240b(a2, "aweme");
                aVar.f121706g = true;
                aVar.f121705f = a2;
                if (aVar.f121703d.f78757a == 2) {
                    C22052a aVar2 = aVar.f121702c;
                    if (aVar2 == null) {
                        C52711k.m112237a("mPlayVideoHelper");
                    }
                    aVar2.mo46144a();
                }
                aVar.f121703d.f78757a = 0;
                C22052a aVar3 = aVar.f121702c;
                if (aVar3 == null) {
                    C52711k.m112237a("mPlayVideoHelper");
                }
                C52711k.m112240b(a2, "aweme");
                aVar3.f59548a = a2;
                Aweme aweme = aVar.f121705f;
                if (aweme != null) {
                    video = aweme.getVideo();
                } else {
                    video = null;
                }
                if (video != null) {
                    VideoViewComponent videoViewComponent = aVar.f121700a;
                    if (videoViewComponent == null) {
                        C52711k.m112237a("mVideoView");
                    }
                    C50160i iVar = videoViewComponent.f125619b;
                    C52711k.m112236a((Object) iVar, "mVideoView.surfaceHolder");
                    if (iVar.mo97949a() instanceof TextureView) {
                        VideoViewComponent videoViewComponent2 = aVar.f121700a;
                        if (videoViewComponent2 == null) {
                            C52711k.m112237a("mVideoView");
                        }
                        videoViewComponent2.f125619b.mo97950a((C50161j) new C48386c());
                    }
                    VideoViewComponent videoViewComponent3 = aVar.f121700a;
                    if (videoViewComponent3 == null) {
                        C52711k.m112237a("mVideoView");
                    }
                    C50160i iVar2 = videoViewComponent3.f125619b;
                    C52711k.m112236a((Object) iVar2, "mVideoView.surfaceHolder");
                    if (iVar2.mo97949a() instanceof SurfaceView) {
                        VideoViewComponent videoViewComponent4 = aVar.f121700a;
                        if (videoViewComponent4 == null) {
                            C52711k.m112237a("mVideoView");
                        }
                        C50160i iVar3 = videoViewComponent4.f125619b;
                        C52711k.m112236a((Object) iVar3, "mVideoView.surfaceHolder");
                        View a3 = iVar3.mo97949a();
                        if (a3 != null) {
                            ((SurfaceView) a3).getHolder().addCallback(new C48387d());
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.view.SurfaceView");
                        }
                    }
                }
                if (aVar.f121706g) {
                    RemoteImageView remoteImageView = aVar.f121701b;
                    if (remoteImageView == null) {
                        C52711k.m112237a("mCoverView");
                    }
                    C23515d.m57668a(remoteImageView, (int) R.drawable.e47);
                } else {
                    RemoteImageView remoteImageView2 = aVar.f121701b;
                    if (remoteImageView2 == null) {
                        C52711k.m112237a("mCoverView");
                    }
                    Aweme aweme2 = aVar.f121705f;
                    if (aweme2 != null) {
                        Video video2 = aweme2.getVideo();
                        if (video2 != null) {
                            urlModel = video2.getOriginCover();
                        }
                    }
                    C23515d.m57669a(remoteImageView2, urlModel);
                }
                aVar.mo95836a();
                C48383a aVar4 = welcomeVideoWidget4.f121685j;
                if (aVar4 == null) {
                    C52711k.m112237a("mWelcomeVideoHolder");
                }
                aVar4.mo95838c();
            } else {
                WelcomeVideoWidget welcomeVideoWidget5 = this.f121696d;
                View findViewById2 = ((ViewGroup) this.f121697e).findViewById(R.id.ewz);
                C52711k.m112236a((Object) findViewById2, "view.findViewById(R.id.static_cover)");
                welcomeVideoWidget5.f121683h = (RemoteImageView) findViewById2;
                RemoteImageView remoteImageView3 = welcomeVideoWidget5.f121683h;
                if (remoteImageView3 == null) {
                    C52711k.m112237a("mStaticCover");
                }
                remoteImageView3.setVisibility(0);
                RemoteImageView remoteImageView4 = welcomeVideoWidget5.f121683h;
                if (remoteImageView4 == null) {
                    C52711k.m112237a("mStaticCover");
                }
                C23515d.m57668a(remoteImageView4, (int) R.drawable.e47);
            }
            return C52860x.f131107a;
        }
    }

    public final void onResume() {
        super.onResume();
        if (this.f121688m) {
            C48383a aVar = this.f121685j;
            if (aVar == null) {
                C52711k.m112237a("mWelcomeVideoHolder");
            }
            if (aVar != null) {
                aVar.mo95839d();
            }
        }
    }

    public WelcomeVideoWidget() {
        String str;
        Context a = C11010c.m22280a();
        if (a.getExternalCacheDir() == null) {
            str = "";
        } else {
            StringBuilder sb = new StringBuilder();
            File externalCacheDir = a.getExternalCacheDir();
            C52711k.m112236a((Object) externalCacheDir, "externalCacheDir");
            sb.append(externalCacheDir.getAbsolutePath());
            sb.append(File.separator);
            sb.append(this.f121686k);
            str = sb.toString();
        }
        this.f121687l = str;
    }

    public final void onPause() {
        super.onPause();
        if (this.f121688m) {
            C48383a aVar = this.f121685j;
            if (aVar == null) {
                C52711k.m112237a("mWelcomeVideoHolder");
            }
            if (aVar != null) {
                aVar.f121704e = false;
                int i = aVar.f121703d.f78757a;
                if (i != 4) {
                    switch (i) {
                        case 1:
                        case 2:
                            break;
                    }
                }
                C22052a aVar2 = aVar.f121702c;
                if (aVar2 == null) {
                    C52711k.m112237a("mPlayVideoHelper");
                }
                aVar2.mo46144a();
                aVar.f121703d.f78757a = 3;
            }
        }
    }

    public final void onDestroy() {
        super.onDestroy();
        if (this.f121688m) {
            C48383a aVar = this.f121685j;
            if (aVar == null) {
                C52711k.m112237a("mWelcomeVideoHolder");
            }
            if (aVar != null) {
                aVar.f121704e = false;
                int i = aVar.f121703d.f78757a;
                if (i != 4) {
                    switch (i) {
                        case 1:
                        case 2:
                            break;
                    }
                }
                C22052a aVar2 = aVar.f121702c;
                if (aVar2 == null) {
                    C52711k.m112237a("mPlayVideoHelper");
                }
                aVar2.f59549b.mo60226b(aVar2.f59550c);
                aVar2.f59549b.mo60216ag();
                aVar2.f59549b.mo97919b();
                aVar.f121703d.f78757a = 0;
                aVar.mo95836a();
            }
        }
    }

    /* renamed from: a */
    public final void mo48241a(View view) {
        super.mo48241a(view);
        LayoutInflater from = LayoutInflater.from(this.f62235b);
        if (view != null) {
            from.inflate(R.layout.bz0, (ViewGroup) view);
            C53301g.m113291a(C53256be.f131885a, C10917a.m22170a(), null, new C48382b(this, view, null), 2, null);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
