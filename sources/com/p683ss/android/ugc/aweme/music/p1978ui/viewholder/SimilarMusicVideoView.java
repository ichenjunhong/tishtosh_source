package com.p683ss.android.ugc.aweme.music.p1978ui.viewholder;

import android.content.Context;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.FrameLayout;
import android.widget.RelativeLayout;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12203q;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30178a;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1979a.C37491c.C37492a;
import com.p683ss.android.ugc.aweme.music.p1978ui.p1984f.C37610a.C37611a;
import com.p683ss.android.ugc.aweme.newfollow.util.C37942h;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.video.C48009d;
import com.p683ss.android.ugc.aweme.video.experiment.Get265DecodeTypeExperiment;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.p683ss.android.ugc.playerkit.videoview.KeepSurfaceTextureView;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicVideoView */
public final class SimilarMusicVideoView extends RelativeLayout {

    /* renamed from: d */
    public static final C37667a f96048d = new C37667a(null);

    /* renamed from: a */
    public boolean f96049a;

    /* renamed from: b */
    public boolean f96050b;

    /* renamed from: c */
    public int f96051c;

    /* renamed from: e */
    private final View f96052e;

    /* renamed from: f */
    private final View f96053f;

    /* renamed from: g */
    private final SmartImageView f96054g;

    /* renamed from: h */
    private final KeepSurfaceTextureView f96055h;

    /* renamed from: i */
    private final LottieAnimationView f96056i;

    /* renamed from: j */
    private final FrameLayout f96057j;

    /* renamed from: k */
    private VideoViewComponent f96058k;

    /* renamed from: l */
    private final C30178a f96059l;

    /* renamed from: m */
    private long f96060m;

    /* renamed from: n */
    private Aweme f96061n;

    /* renamed from: o */
    private C37492a f96062o;

    /* renamed from: p */
    private C48009d f96063p;

    /* renamed from: q */
    private int f96064q;

    /* renamed from: r */
    private HashMap<Integer, Integer> f96065r;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicVideoView$a */
    public static final class C37667a {
        private C37667a() {
        }

        public /* synthetic */ C37667a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.music.ui.viewholder.SimilarMusicVideoView$b */
    public static final class C37668b implements C50161j {

        /* renamed from: a */
        final /* synthetic */ SimilarMusicVideoView f96066a;

        public final void aD_() {
        }

        /* renamed from: b */
        public final void mo54505b(int i, int i2) {
        }

        C37668b(SimilarMusicVideoView similarMusicVideoView) {
            this.f96066a = similarMusicVideoView;
        }

        /* renamed from: a */
        public final void mo54503a(int i, int i2) {
            if (this.f96066a.f96049a) {
                this.f96066a.f96049a = false;
                this.f96066a.mo77164c();
            }
        }
    }

    public SimilarMusicVideoView(Context context) {
        this(context, null, 0, 6, null);
    }

    public SimilarMusicVideoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    /* renamed from: f */
    public final void mo77167f() {
        SmartImageView smartImageView = this.f96054g;
        C52711k.m112236a((Object) smartImageView, "mIvCover");
        smartImageView.setVisibility(0);
    }

    /* renamed from: g */
    public final void mo77168g() {
        SmartImageView smartImageView = this.f96054g;
        C52711k.m112236a((Object) smartImageView, "mIvCover");
        smartImageView.setVisibility(8);
    }

    public final VideoViewComponent getVideoView() {
        VideoViewComponent videoViewComponent = this.f96058k;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        return videoViewComponent;
    }

    /* renamed from: h */
    private boolean m84168h() {
        VideoViewComponent videoViewComponent = this.f96058k;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        if (!videoViewComponent.mo97922d()) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo77160a() {
        Video video;
        Aweme aweme = this.f96061n;
        if (aweme != null) {
            video = aweme.getVideo();
        } else {
            video = null;
        }
        if (video != null) {
            float width = (float) video.getWidth();
            float height = (float) video.getHeight();
            if (width / height > 0.75f) {
                KeepSurfaceTextureView keepSurfaceTextureView = this.f96055h;
                C52711k.m112236a((Object) keepSurfaceTextureView, "mSurfaceView");
                int width2 = keepSurfaceTextureView.getWidth();
                KeepSurfaceTextureView keepSurfaceTextureView2 = this.f96055h;
                C52711k.m112236a((Object) keepSurfaceTextureView2, "mSurfaceView");
                int i = (int) width;
                int i2 = (int) height;
                C37942h.m84843a(width2, keepSurfaceTextureView2.getHeight(), (View) this.f96055h, i, i2);
                KeepSurfaceTextureView keepSurfaceTextureView3 = this.f96055h;
                C52711k.m112236a((Object) keepSurfaceTextureView3, "mSurfaceView");
                int width3 = keepSurfaceTextureView3.getWidth();
                KeepSurfaceTextureView keepSurfaceTextureView4 = this.f96055h;
                C52711k.m112236a((Object) keepSurfaceTextureView4, "mSurfaceView");
                C37942h.m84843a(width3, keepSurfaceTextureView4.getHeight(), (View) this.f96054g, i, i2);
                return;
            }
            KeepSurfaceTextureView keepSurfaceTextureView5 = this.f96055h;
            C52711k.m112236a((Object) keepSurfaceTextureView5, "mSurfaceView");
            int width4 = keepSurfaceTextureView5.getWidth();
            KeepSurfaceTextureView keepSurfaceTextureView6 = this.f96055h;
            C52711k.m112236a((Object) keepSurfaceTextureView6, "mSurfaceView");
            C37942h.m84841a(width4, keepSurfaceTextureView6.getHeight(), this.f96055h, height / width);
        }
    }

    /* renamed from: b */
    public final void mo77163b() {
        Video video;
        C37492a aVar = this.f96062o;
        if (aVar != null) {
            aVar.mo77036a(false);
        }
        this.f96049a = false;
        HashMap<Integer, Integer> hashMap = this.f96065r;
        if (hashMap == null) {
            C52711k.m112237a("mLastplayingPosMap");
        }
        hashMap.put(Integer.valueOf(this.f96051c), Integer.valueOf(this.f96064q));
        C37492a aVar2 = this.f96062o;
        if (aVar2 != null) {
            aVar2.mo77034a(this.f96061n, this.f96051c, this.f96064q);
        }
        int i = this.f96059l.f78757a;
        if (i == 0) {
            mo77164c();
        } else if (i == 3) {
            VideoViewComponent videoViewComponent = this.f96058k;
            if (videoViewComponent == null) {
                C52711k.m112237a("mVideoView");
            }
            Aweme aweme = this.f96061n;
            String str = null;
            if (aweme != null) {
                video = aweme.getVideo();
            } else {
                video = null;
            }
            videoViewComponent.mo60204a(video);
            this.f96059l.f78757a = 4;
            LottieAnimationView lottieAnimationView = this.f96056i;
            C52711k.m112236a((Object) lottieAnimationView, "mIvPlaying");
            lottieAnimationView.setVisibility(0);
            this.f96060m = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("resumeVideo resume : ");
            Aweme aweme2 = this.f96061n;
            if (aweme2 != null) {
                str = aweme2.getAid();
            }
            sb.append(str);
        }
    }

    /* renamed from: d */
    public final void mo77165d() {
        String str;
        LottieAnimationView lottieAnimationView = this.f96056i;
        C52711k.m112236a((Object) lottieAnimationView, "mIvPlaying");
        lottieAnimationView.setVisibility(8);
        VideoViewComponent videoViewComponent = this.f96058k;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        if (videoViewComponent.mo97922d()) {
            VideoViewComponent videoViewComponent2 = this.f96058k;
            if (videoViewComponent2 == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent2.mo60215af();
            if (this.f96060m > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.f96060m;
                this.f96060m = -1;
                Aweme aweme = this.f96061n;
                String str2 = null;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                Aweme aweme2 = this.f96061n;
                if (aweme2 != null) {
                    str2 = aweme2.getAuthorUid();
                }
                C37611a.m84058a(str, str2, Long.valueOf(currentTimeMillis));
            }
            this.f96059l.f78757a = 3;
        }
    }

    /* renamed from: e */
    public final void mo77166e() {
        String str;
        this.f96049a = false;
        LottieAnimationView lottieAnimationView = this.f96056i;
        C52711k.m112236a((Object) lottieAnimationView, "mIvPlaying");
        lottieAnimationView.setVisibility(8);
        if (this.f96059l.f78757a != 0) {
            VideoViewComponent videoViewComponent = this.f96058k;
            if (videoViewComponent == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent.mo60216ag();
            VideoViewComponent videoViewComponent2 = this.f96058k;
            if (videoViewComponent2 == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent2.mo97919b();
            VideoViewComponent videoViewComponent3 = this.f96058k;
            if (videoViewComponent3 == null) {
                C52711k.m112237a("mVideoView");
            }
            videoViewComponent3.mo60226b((C38871j) this.f96063p);
            this.f96059l.f78757a = 0;
            if (this.f96060m > 0) {
                long currentTimeMillis = System.currentTimeMillis() - this.f96060m;
                this.f96060m = -1;
                Aweme aweme = this.f96061n;
                String str2 = null;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                Aweme aweme2 = this.f96061n;
                if (aweme2 != null) {
                    str2 = aweme2.getAuthorUid();
                }
                C37611a.m84058a(str, str2, Long.valueOf(currentTimeMillis));
            }
            mo77167f();
        }
    }

    /* renamed from: c */
    public final void mo77164c() {
        Boolean bool;
        Boolean bool2;
        if (m84168h()) {
            C37492a aVar = this.f96062o;
            if (aVar != null) {
                aVar.mo77036a(false);
            }
            KeepSurfaceTextureView keepSurfaceTextureView = this.f96055h;
            C52711k.m112236a((Object) keepSurfaceTextureView, "mSurfaceView");
            keepSurfaceTextureView.setVisibility(0);
            LottieAnimationView lottieAnimationView = this.f96056i;
            C52711k.m112236a((Object) lottieAnimationView, "mIvPlaying");
            lottieAnimationView.setVisibility(0);
            VideoViewComponent videoViewComponent = this.f96058k;
            if (videoViewComponent == null) {
                C52711k.m112237a("mVideoView");
            }
            C50160i iVar = videoViewComponent.f125619b;
            Video video = null;
            if (iVar != null) {
                bool = Boolean.valueOf(iVar.mo97954c());
            } else {
                bool = null;
            }
            if (bool != null) {
                VideoViewComponent videoViewComponent2 = this.f96058k;
                if (videoViewComponent2 == null) {
                    C52711k.m112237a("mVideoView");
                }
                C50160i iVar2 = videoViewComponent2.f125619b;
                if (iVar2 != null) {
                    bool2 = Boolean.valueOf(iVar2.mo97954c());
                } else {
                    bool2 = null;
                }
                if (bool2 == null) {
                    C52711k.m112234a();
                }
                if (!bool2.booleanValue()) {
                    this.f96049a = true;
                    return;
                }
            }
            C37492a aVar2 = this.f96062o;
            if (aVar2 != null) {
                aVar2.mo77034a(this.f96061n, this.f96051c, this.f96064q);
            }
            HashMap<Integer, Integer> hashMap = this.f96065r;
            if (hashMap == null) {
                C52711k.m112237a("mLastplayingPosMap");
            }
            hashMap.put(Integer.valueOf(this.f96051c), Integer.valueOf(this.f96064q));
            int i = this.f96059l.f78757a;
            if (i == 0) {
                VideoViewComponent videoViewComponent3 = this.f96058k;
                if (videoViewComponent3 == null) {
                    C52711k.m112237a("mVideoView");
                }
                videoViewComponent3.mo60207a((C38871j) this.f96063p);
                VideoViewComponent videoViewComponent4 = this.f96058k;
                if (videoViewComponent4 == null) {
                    C52711k.m112237a("mVideoView");
                }
                Aweme aweme = this.f96061n;
                if (aweme != null) {
                    video = aweme.getVideo();
                }
                videoViewComponent4.mo60205a(video, true, C10181b.m20511a().mo18168a(Get265DecodeTypeExperiment.class, true, "decoder_type", 31744, 0));
                this.f96049a = false;
                this.f96059l.f78757a = 2;
                this.f96060m = System.currentTimeMillis();
            } else if (i == 3) {
                mo77163b();
                return;
            }
            return;
        }
        KeepSurfaceTextureView keepSurfaceTextureView2 = this.f96055h;
        C52711k.m112236a((Object) keepSurfaceTextureView2, "mSurfaceView");
        keepSurfaceTextureView2.setVisibility(8);
    }

    public final void setIsNeedPlay(boolean z) {
        this.f96050b = z;
    }

    public final void setStartPlayTime(long j) {
        this.f96060m = j;
    }

    public final void setIvPlayingVisibility(boolean z) {
        if (z) {
            LottieAnimationView lottieAnimationView = this.f96056i;
            C52711k.m112236a((Object) lottieAnimationView, "mIvPlaying");
            lottieAnimationView.setVisibility(0);
            return;
        }
        LottieAnimationView lottieAnimationView2 = this.f96056i;
        C52711k.m112236a((Object) lottieAnimationView2, "mIvPlaying");
        lottieAnimationView2.setVisibility(8);
    }

    /* renamed from: a */
    public final void mo77161a(int i) {
        SmartImageView smartImageView = this.f96054g;
        C52711k.m112236a((Object) smartImageView, "mIvCover");
        smartImageView.getLayoutParams().height = i;
        KeepSurfaceTextureView keepSurfaceTextureView = this.f96055h;
        C52711k.m112236a((Object) keepSurfaceTextureView, "mSurfaceView");
        keepSurfaceTextureView.getLayoutParams().height = i;
        FrameLayout frameLayout = this.f96057j;
        C52711k.m112236a((Object) frameLayout, "mFrameLayout");
        frameLayout.getLayoutParams().height = i;
        View view = this.f96053f;
        C52711k.m112236a((Object) view, "mIvBlackBg");
        view.getLayoutParams().height = i;
        this.f96058k = new VideoViewComponent(true);
        VideoViewComponent videoViewComponent = this.f96058k;
        if (videoViewComponent == null) {
            C52711k.m112237a("mVideoView");
        }
        videoViewComponent.mo97917a(this.f96055h);
        VideoViewComponent videoViewComponent2 = this.f96058k;
        if (videoViewComponent2 == null) {
            C52711k.m112237a("mVideoView");
        }
        videoViewComponent2.mo97918a((C50161j) new C37668b(this));
    }

    public SimilarMusicVideoView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f96052e = LayoutInflater.from(context).inflate(R.layout.bln, this, true);
        this.f96053f = this.f96052e.findViewById(R.id.dz7);
        this.f96054g = (SmartImageView) this.f96052e.findViewById(R.id.azj);
        this.f96055h = (KeepSurfaceTextureView) this.f96052e.findViewById(R.id.czh);
        this.f96056i = (LottieAnimationView) this.f96052e.findViewById(R.id.efg);
        this.f96057j = (FrameLayout) this.f96052e.findViewById(R.id.agt);
        this.f96059l = new C30178a();
        this.f96050b = true;
        this.f96060m = -1;
    }

    public /* synthetic */ SimilarMusicVideoView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    /* renamed from: a */
    public final void mo77162a(Aweme aweme, int i, C48009d dVar, C37492a aVar, HashMap<Integer, Integer> hashMap, int i2) {
        UrlModel urlModel;
        C52711k.m112240b(hashMap, "posMap");
        this.f96061n = aweme;
        this.f96051c = i;
        this.f96063p = dVar;
        this.f96062o = aVar;
        this.f96065r = hashMap;
        this.f96064q = i2;
        Aweme aweme2 = this.f96061n;
        if (aweme2 != null) {
            Video video = aweme2.getVideo();
            if (video != null) {
                urlModel = video.getOriginCover();
                C12203q.m24645a((Object) C23608p.m57874a(urlModel)).mo23118a("SimilarMusicVideoView").mo23116a((C12197k) this.f96054g).mo23121a();
            }
        }
        urlModel = null;
        C12203q.m24645a((Object) C23608p.m57874a(urlModel)).mo23118a("SimilarMusicVideoView").mo23116a((C12197k) this.f96054g).mo23121a();
    }
}
