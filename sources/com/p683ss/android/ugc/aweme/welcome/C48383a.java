package com.p683ss.android.ugc.aweme.welcome;

import android.view.SurfaceHolder;
import android.view.SurfaceHolder.Callback;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.account.p1297m.p1298a.p1299a.C22052a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30178a;
import com.p683ss.android.ugc.aweme.video.C48009d;
import com.p683ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.trill.R;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.welcome.a */
public final class C48383a {

    /* renamed from: j */
    public static final C48384a f121699j = new C48384a(null);

    /* renamed from: a */
    VideoViewComponent f121700a = new VideoViewComponent(true);

    /* renamed from: b */
    RemoteImageView f121701b;

    /* renamed from: c */
    C22052a f121702c;

    /* renamed from: d */
    final C30178a f121703d = new C30178a();

    /* renamed from: e */
    public boolean f121704e;

    /* renamed from: f */
    public Aweme f121705f;

    /* renamed from: g */
    boolean f121706g;

    /* renamed from: h */
    public View f121707h;

    /* renamed from: i */
    public C48385b f121708i;

    /* renamed from: k */
    private C48389f f121709k = new C48389f(this);

    /* renamed from: com.ss.android.ugc.aweme.welcome.a$a */
    public static final class C48384a {
        private C48384a() {
        }

        public /* synthetic */ C48384a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.a$b */
    public interface C48385b {
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.a$c */
    public static final class C48386c implements C50161j {
        C48386c() {
        }

        /* renamed from: a */
        public final void mo54503a(int i, int i2) {
        }

        public final void aD_() {
        }

        /* renamed from: b */
        public final void mo54505b(int i, int i2) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.a$d */
    public static final class C48387d implements Callback {
        C48387d() {
        }

        public final void surfaceChanged(SurfaceHolder surfaceHolder, int i, int i2, int i3) {
        }

        public final void surfaceCreated(SurfaceHolder surfaceHolder) {
        }

        public final void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.a$e */
    public static final class C48388e implements C50161j {

        /* renamed from: a */
        final /* synthetic */ C48383a f121710a;

        public final void aD_() {
        }

        /* renamed from: b */
        public final void mo54505b(int i, int i2) {
        }

        C48388e(C48383a aVar) {
            this.f121710a = aVar;
        }

        /* renamed from: a */
        public final void mo54503a(int i, int i2) {
            if (this.f121710a.f121704e) {
                this.f121710a.f121704e = false;
                this.f121710a.mo95838c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.welcome.a$f */
    public static final class C48389f extends C48009d {

        /* renamed from: a */
        final /* synthetic */ C48383a f121711a;

        /* renamed from: a */
        public final void mo53526a(C50118g gVar) {
            super.mo53526a(gVar);
        }

        /* renamed from: c */
        public final void mo53533c(String str) {
            super.mo53533c(str);
        }

        C48389f(C48383a aVar) {
            this.f121711a = aVar;
        }

        /* renamed from: a */
        public final void mo53524a(C50112d dVar) {
            super.mo53524a(dVar);
            this.f121711a.mo95836a();
        }

        /* renamed from: a */
        public final void mo53525a(C50117f fVar) {
            super.mo53525a(fVar);
            this.f121711a.mo95837b();
        }

        /* renamed from: a */
        public final void mo53527a(String str) {
            super.mo53527a(str);
            this.f121711a.mo95837b();
        }
    }

    /* renamed from: a */
    public final void mo95836a() {
        RemoteImageView remoteImageView = this.f121701b;
        if (remoteImageView == null) {
            C52711k.m112237a("mCoverView");
        }
        remoteImageView.setVisibility(0);
    }

    /* renamed from: b */
    public final void mo95837b() {
        RemoteImageView remoteImageView = this.f121701b;
        if (remoteImageView == null) {
            C52711k.m112237a("mCoverView");
        }
        remoteImageView.setVisibility(8);
    }

    /* renamed from: d */
    public final void mo95839d() {
        this.f121704e = false;
        int i = this.f121703d.f78757a;
        if (i == 0) {
            mo95838c();
        } else if (i == 3) {
            C22052a aVar = this.f121702c;
            if (aVar == null) {
                C52711k.m112237a("mPlayVideoHelper");
            }
            aVar.mo46145b();
            this.f121703d.f78757a = 4;
        }
    }

    /* renamed from: c */
    public final void mo95838c() {
        VideoViewComponent videoViewComponent = this.f121700a;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        C50160i iVar = videoViewComponent.f125619b;
        C52711k.m112236a((Object) iVar, "mVideoView.surfaceHolder");
        if (!iVar.mo97954c()) {
            this.f121704e = true;
            return;
        }
        int i = this.f121703d.f78757a;
        if (i == 0) {
            C22052a aVar = this.f121702c;
            if (aVar == null) {
                C52711k.m112237a("mPlayVideoHelper");
            }
            if (aVar.mo46146c()) {
                aVar.f59549b.mo60207a(aVar.f59550c);
                VideoViewComponent videoViewComponent2 = aVar.f59549b;
                Aweme aweme = aVar.f59548a;
                if (aweme == null) {
                    C52711k.m112234a();
                }
                videoViewComponent2.mo60205a(aweme.getVideo(), true, C10181b.m20511a().mo18168a(Get265DecodeTypeExperiment.class, true, "decoder_type", 31744, 0));
            }
            this.f121704e = false;
            this.f121703d.f78757a = 2;
        } else if (i == 3) {
            mo95839d();
        }
    }

    public C48383a(View view, C48385b bVar) {
        C52711k.m112240b(view, "mRootView");
        C52711k.m112240b(bVar, "mPlayCompleteListener");
        this.f121707h = view;
        this.f121708i = bVar;
        VideoViewComponent videoViewComponent = this.f121700a;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        View view2 = this.f121707h;
        if (view2 != null) {
            videoViewComponent.mo97916a((ViewGroup) view2);
            VideoViewComponent videoViewComponent2 = this.f121700a;
            if (videoViewComponent2 == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent2.mo97918a((C50161j) new C48388e(this));
            VideoViewComponent videoViewComponent3 = this.f121700a;
            if (videoViewComponent3 == null) {
                C52711k.m112237a("mVideoView");
            }
            this.f121702c = new C22052a(videoViewComponent3, this.f121709k);
            View findViewById = this.f121707h.findViewById(R.id.a22);
            C52711k.m112236a((Object) findViewById, "mRootView.findViewById(R.id.cover)");
            this.f121701b = (RemoteImageView) findViewById;
            this.f121707h.setTag(this);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup");
    }
}
