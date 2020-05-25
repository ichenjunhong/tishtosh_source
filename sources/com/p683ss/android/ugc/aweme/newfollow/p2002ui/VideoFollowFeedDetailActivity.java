package com.p683ss.android.ugc.aweme.newfollow.p2002ui;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.drawable.GradientDrawable;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.animation.LinearInterpolator;
import android.view.animation.RotateAnimation;
import android.widget.ImageView;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ActivityInstrumentation;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.C25732e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26533q.C26534a;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.widget.DragView;
import com.p683ss.android.ugc.aweme.common.widget.DragView.C26940b;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.widget.MarqueeView;
import com.p683ss.android.ugc.aweme.flowfeed.p1755d.C31762b;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31837a;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31842e;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31843f;
import com.p683ss.android.ugc.aweme.music.model.Music;
import com.p683ss.android.ugc.aweme.newfollow.C37847b.C37848a;
import com.p683ss.android.ugc.aweme.newfollow.p1999f.C37876j;
import com.p683ss.android.ugc.aweme.newfollow.util.C37938f;
import com.p683ss.android.ugc.aweme.p1382aq.C23213as;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43893g;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44576a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44586b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44588c;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2234b.C44587a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44626f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.InteractStickerWidget;
import com.p683ss.android.ugc.aweme.sticker.C46062l;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45881a;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45882b;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45885d;
import com.p683ss.android.ugc.aweme.util.C47615c;
import com.p683ss.android.ugc.aweme.util.C47625i;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47863eu;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity */
public class VideoFollowFeedDetailActivity extends AbsFollowFeedDetailActivity<FollowFeedVideoContent> implements OnClickListener, C37848a, C44586b, C44626f {

    /* renamed from: l */
    public C37876j f96524l;

    /* renamed from: m */
    public boolean f96525m;
    ViewGroup mAdDownloadButton;
    ImageView mAdDownloadButtonDetail;
    TextView mAdDownloadButtonPercent;
    TextView mAdDownloadButtonSize;
    ViewGroup mInteractStickers;
    ImageView mIvMusicIcon;
    ImageView mIvPause;
    ImageView mIvPlay;
    ImageView mLoadingView;
    ViewGroup mMusicLayout;
    ViewGroup mMusicTitleLayout;
    MarqueeView mMusicTitleView;
    ViewGroup mPlayStatusLayout;
    TextView mTvMusicOriginal;

    /* renamed from: n */
    public boolean f96526n;

    /* renamed from: o */
    public boolean f96527o;

    /* renamed from: p */
    private long f96528p = -1;

    /* renamed from: q */
    private C37913d f96529q = new C37913d();

    /* renamed from: r */
    private C37911c f96530r = new C37911c();

    /* renamed from: s */
    private C44576a f96531s = new C44576a(this);

    /* renamed from: t */
    private RotateAnimation f96532t;

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity$a */
    class C37909a implements C26940b {
        private C37909a() {
        }

        /* renamed from: a */
        public final void mo54930a(float f, float f2, float f3, float f4) {
            LayoutParams layoutParams = (LayoutParams) VideoFollowFeedDetailActivity.this.mInteractStickers.getLayoutParams();
            int i = (int) f;
            layoutParams.width = i;
            int i2 = (int) f2;
            layoutParams.height = i2;
            layoutParams.setMargins((int) f3, (int) f4, 0, 0);
            VideoFollowFeedDetailActivity.this.mInteractStickers.setLayoutParams(layoutParams);
            VideoFollowFeedDetailActivity.this.mo77366b(i, i2);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity$b */
    class C37910b implements C45881a {
        /* renamed from: a */
        public final void mo60269a() {
            VideoFollowFeedDetailActivity.this.f96524l.mo77319c();
        }

        private C37910b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity$c */
    class C37911c implements C45882b {
        private C37911c() {
        }

        /* renamed from: a */
        public final void mo60271a(int i, MotionEvent motionEvent) {
            VideoFollowFeedDetailActivity.this.f96527o = true;
            VideoFollowFeedDetailActivity.this.f96525m = true;
        }

        /* renamed from: a */
        public final void mo60273a(int i, final boolean z) {
            VideoFollowFeedDetailActivity.this.f96493f.postDelayed(new Runnable() {
                public final void run() {
                    VideoFollowFeedDetailActivity.this.f96526n = z;
                }
            }, (long) ViewConfiguration.getDoubleTapTimeout());
        }

        /* renamed from: a */
        public final void mo60272a(int i, View view, float f, float f2, InteractStickerStruct interactStickerStruct, boolean z) {
            if (z) {
                VideoFollowFeedDetailActivity.this.f96524l.mo77320d();
            } else {
                VideoFollowFeedDetailActivity.this.f96524l.mo77319c();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity$d */
    class C37913d implements C45885d {

        /* renamed from: b */
        private boolean f96539b;

        /* renamed from: a */
        public final void mo60274a() {
            if (VideoFollowFeedDetailActivity.this.f96524l != null && VideoFollowFeedDetailActivity.this.f96524l.f96423e != null && 3 == VideoFollowFeedDetailActivity.this.f96524l.f96423e.f78757a) {
                VideoFollowFeedDetailActivity.this.f96524l.mo77323g();
            }
        }

        /* renamed from: b */
        public final void mo60276b() {
            if (VideoFollowFeedDetailActivity.this.f96524l != null && VideoFollowFeedDetailActivity.this.f96524l.f96423e != null && 3 != VideoFollowFeedDetailActivity.this.f96524l.f96423e.f78757a) {
                this.f96539b = true;
                VideoFollowFeedDetailActivity.this.f96524l.mo77323g();
            }
        }

        /* renamed from: c */
        public final void mo60277c() {
            if (VideoFollowFeedDetailActivity.this.f96524l != null && VideoFollowFeedDetailActivity.this.f96524l.f96423e != null && 3 == VideoFollowFeedDetailActivity.this.f96524l.f96423e.f78757a && this.f96539b) {
                VideoFollowFeedDetailActivity.this.f96524l.mo77323g();
            }
        }

        private C37913d() {
        }

        /* renamed from: a */
        public final void mo60275a(boolean z) {
            if (!z) {
                VideoFollowFeedDetailActivity.this.f96525m = true;
            }
        }
    }

    /* renamed from: d */
    public final Activity mo77293d() {
        return this;
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final int mo77340f() {
        return R.layout.bb;
    }

    public void onWindowFocusChanged(boolean z) {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onWindowFocusChanged", true);
        super.onWindowFocusChanged(z);
    }

    /* renamed from: e */
    public final boolean mo77294e() {
        return isFinishing();
    }

    /* renamed from: a */
    public final C50160i mo77285a() {
        return ((FollowFeedVideoContent) this.f96488a).getVideoSurfaceHolder();
    }

    /* renamed from: b */
    public final void mo77291b() {
        if (this.mMusicTitleView != null) {
            this.mMusicTitleView.mo64085a();
        }
    }

    /* renamed from: c */
    public final void mo77292c() {
        if (this.mMusicTitleView != null) {
            this.mMusicTitleView.mo64087b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final /* synthetic */ View mo77344j() {
        FollowFeedVideoContent followFeedVideoContent = new FollowFeedVideoContent(this);
        followFeedVideoContent.setListener(new C37909a());
        return followFeedVideoContent;
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo77346l() {
        super.mo77346l();
        this.f96524l.mo77319c();
    }

    /* renamed from: ac */
    public final AbsInteractStickerWidget mo60212ac() {
        InteractStickerWidget interactStickerWidget = new InteractStickerWidget();
        interactStickerWidget.mo90664a((C44626f) this);
        this.f96497j.mo48250a((int) R.id.auf, (Widget) interactStickerWidget);
        return interactStickerWidget;
    }

    /* renamed from: ak */
    public final long mo60220ak() {
        if (this.f96524l == null) {
            return 0;
        }
        C37876j jVar = this.f96524l;
        if (jVar.f96419a != null) {
            return jVar.f96419a.mo77407d();
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo77341g() {
        super.mo77341g();
        Aweme c = C44588c.m97545c(this.f96489b);
        if (c != null && this.f96531s != null) {
            this.f96531s.mo90508a(c);
            this.f96531s.f112782b = this.f96496i;
            this.f96531s.mo90512b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo77343i() {
        if (!TextUtils.isEmpty(this.f96491d) && this.f96524l != null) {
            C31843f a = C31843f.m74206a();
            String str = this.f96491d;
            int i = this.f96524l.f96423e.f78757a;
            C31842e c = a.mo64954c(str);
            if (c != null) {
                c.f83201b = i;
            }
        }
        if (this.mMusicTitleView != null) {
            this.mMusicTitleView.mo64088c();
        }
        super.mo77343i();
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo77345k() {
        if (this.f96527o || !this.f96526n || this.f96531s == null) {
            if (!this.f96525m) {
                C31837a.m74196a(this.mPlayStatusLayout);
                mo77347m();
            }
            this.f96525m = false;
            this.f96527o = false;
            return;
        }
        this.f96531s.mo90517g();
        this.f96524l.mo77319c();
        this.f96526n = false;
        this.f96527o = false;
    }

    public void onResume() {
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onResume", true);
        super.onResume();
        if (!C47863eu.m103535a()) {
            this.f96524l.mo77319c();
        }
        if (this.f96528p == -1) {
            this.f96528p = System.currentTimeMillis();
        }
        hashCode();
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onResume", false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo77342h() {
        super.mo77342h();
        if (this.f96498k) {
            this.mPlayStatusLayout.setVisibility(8);
            this.mMusicLayout.setVisibility(8);
            if (this.mAdDownloadButton != null) {
                this.mAdDownloadButton.setVisibility(8);
            }
        } else {
            this.mPlayStatusLayout.setVisibility(0);
            if (this.mMusicLayout != null) {
                this.mMusicLayout.setVisibility(0);
                ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.mMusicLayout, "alpha", new float[]{0.0f, 1.0f});
                ofFloat.setDuration(150);
                ofFloat.start();
            }
            if (this.mAdDownloadButton != null) {
                this.mAdDownloadButton.setVisibility(0);
                ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(this.mAdDownloadButton, "alpha", new float[]{0.0f, 1.0f});
                ofFloat2.setDuration(150);
                ofFloat2.start();
            }
        }
        if (this.f96531s != null) {
            this.f96526n = false;
            this.f96531s.mo90517g();
        }
    }

    public void onDestroy() {
        super.onDestroy();
        if (this.f96524l != null) {
            C37876j jVar = this.f96524l;
            C31842e b = jVar.mo77318b();
            if (jVar.f96419a != null && (b == null || b.f83209j)) {
                if (jVar.f96419a.f96594a != null) {
                    jVar.f96419a.f96594a.mo95292y();
                }
                C37938f.m84829a().mo77413a(jVar.f96419a.f96594a);
            }
            if (jVar.f96420b != null) {
                jVar.f96420b.mo60468b();
            }
            if (jVar.f96419a != null) {
                jVar.f96419a.mo77401a();
            }
        }
    }

    public void onPause() {
        super.onPause();
        this.f96524l.mo77320d();
        if (this.f96531s != null) {
            this.f96531s.mo90517g();
        }
        this.f96526n = false;
        if (this.f96528p != -1) {
            long currentTimeMillis = System.currentTimeMillis() - this.f96528p;
            if (currentTimeMillis > 0) {
                if ("poi_page".equalsIgnoreCase(this.f96490c)) {
                    C26890h.m65004a((Context) this, "stay_time", this.f96490c, currentTimeMillis, 0);
                    new C23213as().mo47954f(this.f96489b).mo48005a(String.valueOf(currentTimeMillis)).mo48006b(this.f96490c).mo48008d("video_full_screen").mo48007c(this.f96490c).mo48076e();
                }
            }
            this.f96528p = -1;
        }
        if (this.mAdDownloadButton != null) {
            C26512f.m64114P(this.f96489b);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo77367b(boolean z) {
        String str;
        C26080b a = C26077e.m63190a().mo53590b(this.f96489b).mo53582a("draw_ad");
        if (z) {
            str = "deeplink_success";
        } else {
            str = "deeplink_failed";
        }
        a.mo53593b(str).mo53586a((Context) this);
    }

    /* renamed from: c */
    private void m84740c(boolean z) {
        if (z) {
            if (this.mLoadingView.getVisibility() != 0) {
                this.mLoadingView.startAnimation(this.f96532t);
                this.mLoadingView.setVisibility(0);
            }
        } else if (this.mLoadingView.getVisibility() != 8) {
            this.mLoadingView.clearAnimation();
            this.mLoadingView.setVisibility(8);
        }
    }

    /* renamed from: a */
    public final void mo77290a(boolean z) {
        RemoteImageView remoteImageView = ((FollowFeedVideoContent) this.f96488a).mCover;
        Aweme n = mo77348n();
        if (!z || n == null || n.getVideo() == null) {
            remoteImageView.setVisibility(8);
            return;
        }
        remoteImageView.setVisibility(0);
        C23515d.m57670a(remoteImageView, n.getVideo().getOriginCover(), remoteImageView.getWidth(), remoteImageView.getHeight());
    }

    public void onClick(View view) {
        ClickInstrumentation.onClick(view);
        int id = view.getId();
        if (id == R.id.b2x || id == R.id.b37) {
            this.f96525m = true;
            this.f96524l.mo77323g();
        } else if (id == R.id.b8h) {
            this.f96525m = true;
            this.f96524l.mo77322f();
        } else {
            if (id == R.id.boc) {
                this.f96525m = true;
                C37876j jVar = this.f96524l;
                C52711k.m112240b(jVar, "presenter");
                jVar.mo77322f();
            }
        }
    }

    /* renamed from: a */
    public final void mo77286a(int i) {
        if (C37929l.m84792a(this)) {
            switch (i) {
                case 0:
                    this.mIvPlay.setVisibility(8);
                    m84740c(false);
                    this.mIvPause.setVisibility(0);
                    break;
                case 1:
                    m84740c(false);
                    this.mIvPause.setVisibility(8);
                    this.mIvPlay.setVisibility(0);
                    break;
                case 2:
                    this.mIvPlay.setVisibility(8);
                    this.mIvPause.setVisibility(8);
                    m84740c(true);
                    break;
                case 3:
                    this.mIvPlay.setVisibility(8);
                    m84740c(false);
                    this.mIvPause.setVisibility(8);
                    break;
            }
            C31762b bVar = new C31762b(1, this.f96489b);
            bVar.f82959c = i;
            C47718bf.m103288a(bVar);
        }
    }

    public void onCreate(Bundle bundle) {
        String str;
        Object obj;
        int i;
        Resources resources;
        Object[] objArr;
        MarqueeView marqueeView;
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onCreate", true);
        super.onCreate(bundle);
        C37876j jVar = new C37876j(this.f96489b, this, this.f96490c, this.f96491d);
        jVar.f96425g = this.f96492e;
        this.f96524l = jVar;
        this.f96524l.f96422d = this.f96494g;
        this.f96524l.f96424f = getIntent().getIntExtra("play_action_type", 0);
        this.f96524l.f96421c = getIntent().getBooleanExtra("pause_on_close", false);
        ((FollowFeedVideoContent) this.f96488a).setOnClickListener(this);
        ViewGroup.LayoutParams layoutParams = this.mMusicLayout.getLayoutParams();
        layoutParams.width = (int) (((float) C9432q.m18670a((Context) this)) * 0.6f);
        this.mMusicLayout.setLayoutParams(layoutParams);
        RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 359.0f, 1, 0.5f, 1, 0.5f);
        this.f96532t = rotateAnimation;
        this.f96532t.setRepeatCount(-1);
        this.f96532t.setInterpolator(new LinearInterpolator());
        this.f96532t.setDuration(500);
        Aweme aweme = this.f96489b;
        String str2 = this.f96491d;
        if (aweme != null) {
            if (aweme.getAwemeType() == 13) {
                if (aweme.getForwardItem() == null) {
                    C47625i.m103103a("aweme.getForwardItem()为空");
                } else {
                    aweme = aweme.getForwardItem();
                }
            }
            if (aweme.getMusic() == null || !aweme.getMusic().isOriginMusic()) {
                this.mTvMusicOriginal.setVisibility(8);
                this.mIvMusicIcon.setImageResource(R.drawable.a5k);
            } else {
                this.mTvMusicOriginal.setVisibility(0);
                this.mIvMusicIcon.setImageResource(R.drawable.dgf);
            }
            Music music = aweme.getMusic();
            if (music != null) {
                MarqueeView marqueeView2 = this.mMusicTitleView;
                resources = getResources();
                i = R.string.cer;
                objArr = new Object[2];
                objArr[0] = music.getMusicName();
                Object authorName = music.getAuthorName();
                marqueeView = marqueeView2;
                obj = authorName;
            } else {
                marqueeView = this.mMusicTitleView;
                resources = getResources();
                i = R.string.cep;
                objArr = new Object[2];
                objArr[0] = getResources().getString(R.string.ce5);
                if (aweme.getAuthor() == null) {
                    obj = "";
                } else {
                    obj = aweme.getAuthor().getNickname();
                }
            }
            objArr[1] = obj;
            marqueeView.setText(resources.getString(i, objArr));
        }
        Aweme aweme2 = this.f96489b;
        if (this.mAdDownloadButton != null) {
            if (!C26512f.m64061d(aweme2)) {
                ViewGroup viewGroup = this.mAdDownloadButton;
                if (viewGroup != null) {
                    ViewGroup.LayoutParams layoutParams2 = viewGroup.getLayoutParams();
                    if (!(layoutParams2 == null || layoutParams2.height == 0)) {
                        layoutParams2.height = 0;
                        viewGroup.setLayoutParams(layoutParams2);
                    }
                }
            } else {
                if (!(this.mDragView == null || this.f96488a == null || ((FollowFeedVideoContent) this.f96488a).mProgressbar == null)) {
                    DragView dragView = this.mDragView;
                    ((FollowFeedVideoContent) this.f96488a).addOnLayoutChangeListener(new C37926i(((FollowFeedVideoContent) this.f96488a).mProgressbar, dragView));
                }
                GradientDrawable gradientDrawable = new GradientDrawable();
                gradientDrawable.setCornerRadius(C9432q.m18687b((Context) this, 4.0f));
                gradientDrawable.setColor(Color.parseColor(C26512f.m64078u(this.f96489b)));
                this.mAdDownloadButton.setBackground(gradientDrawable);
                if (this.mAdDownloadButtonPercent != null) {
                    this.mAdDownloadButtonPercent.setTextColor(getResources().getColor(R.color.aso));
                    TextView textView = this.mAdDownloadButtonPercent;
                    if (aweme2 == null) {
                        str = "";
                    } else {
                        str = aweme2.getAwemeRawAd().getButtonText();
                    }
                    textView.setText(str);
                }
                if (this.mAdDownloadButtonSize != null) {
                    this.mAdDownloadButtonSize.setVisibility(8);
                }
                if (this.mAdDownloadButtonDetail != null) {
                    this.mAdDownloadButtonDetail.setVisibility(8);
                }
                this.mAdDownloadButton.setOnClickListener(new C37927j(this));
            }
        }
        this.mIvPlay.setOnClickListener(this);
        this.mIvPause.setOnClickListener(this);
        this.mTvMusicOriginal.setOnClickListener(this);
        this.mMusicTitleLayout.setOnClickListener(this);
        ActivityInstrumentation.onTrace("com.ss.android.ugc.aweme.newfollow.ui.VideoFollowFeedDetailActivity", "onCreate", false);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo77365a(View view) {
        this.f96525m = true;
        C26512f.m64114P(this.f96489b);
        String openUrl = this.f96489b.getAwemeRawAd().getOpenUrl();
        if (!C26540w.m64242c(openUrl) || !C26540w.m64221a((Context) this, this.f96489b.getAwemeRawAd().getOpenUrl(), this.f96489b, false, false)) {
            if (C26540w.m64217a((Context) this, this.f96489b, C26512f.m64105G(this.f96489b), C26512f.m64106H(this.f96489b), C47615c.m103090a(this.f96489b.getAwemeRawAd()), false, 5)) {
                C26077e.m63190a().mo53590b(this.f96489b).mo53582a("draw_ad").mo53593b("open_url_h5").mo53586a((Context) this);
            }
        } else {
            if (C26512f.m64141b(openUrl)) {
                C25732e.m62287a().f68051a = this.f96489b;
            }
            C26077e.m63190a().mo53590b(this.f96489b).mo53582a("draw_ad").mo53593b("open_url_app").mo53586a((Context) this);
            C26540w.m64208a((C26534a) new C37928k(this));
        }
        C26077e.m63190a().mo53590b(this.f96489b).mo53582a("draw_ad").mo53593b("click").mo53602g("more_button").mo53586a((Context) this);
    }

    /* renamed from: a */
    public final void mo77289a(C43893g gVar) {
        ((FollowFeedVideoContent) this.f96488a).mProgressbar.mo91146a(gVar, (int) gVar.f111160a);
        if (C26512f.m64061d(this.f96489b) && gVar.f111162c == 7) {
            C26077e.m63190a().mo53590b(this.f96489b).mo53582a("draw_ad").mo53593b("play_over").mo53602g("video").mo53588b((long) this.f96489b.getVideo().getVideoLength()).mo53586a((Context) this);
            C26077e.m63190a().mo53590b(this.f96489b).mo53582a("draw_ad").mo53593b("play").mo53586a((Context) this);
        }
    }

    /* renamed from: b */
    public final void mo77366b(int i, int i2) {
        float[] fArr = new float[9];
        Matrix matrix = new Matrix();
        ((TextureView) mo77285a().mo97949a()).getTransform(matrix);
        matrix.getValues(fArr);
        m84739a((int) (((float) i) * fArr[0]), (int) (((float) i2) * fArr[4]), (int) fArr[2], (int) fArr[5]);
    }

    /* renamed from: a */
    public final void mo77287a(int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) this.mInteractStickers.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.mInteractStickers.setLayoutParams(layoutParams);
        mo77366b(i, i2);
        this.f96531s.mo90508a(this.f96489b);
        this.f96531s.f112782b = this.f96496i;
        this.f96531s.mo90507a(getApplicationContext());
        Aweme c = C44588c.m97545c(this.f96489b);
        if (c != null) {
            this.f96531s.mo90508a(c);
            this.f96531s.f112782b = this.f96496i;
            this.f96531s.f112786f = this.f96524l.mo77321e();
            this.f96531s.mo90513c();
        }
    }

    /* renamed from: a */
    public final void mo77288a(int i, int i2, float f) {
        LayoutParams layoutParams = (LayoutParams) this.mInteractStickers.getLayoutParams();
        layoutParams.width = i;
        layoutParams.height = i2;
        this.mInteractStickers.setLayoutParams(layoutParams);
        mo77366b(i, i2);
    }

    /* renamed from: a */
    private void m84739a(int i, int i2, int i3, int i4) {
        Aweme c = C44588c.m97545c(this.f96489b);
        if (c != null) {
            C46062l lVar = new C46062l();
            lVar.mo92607b(c.getAuthorUid()).mo92606a(this.f96490c).mo92608c(c.getAid()).mo92609d(C29981aa.m70153a().mo60161a(c.getRequestId()));
            this.f96531s.mo90508a(c);
            this.f96531s.f112782b = this.f96496i;
            this.f96531s.f112783c = this.f96530r;
            this.f96531s.f112784d = new C44587a(i, i2, i3, i4);
            this.f96531s.f112785e = lVar;
            this.f96531s.f112786f = this.f96524l.mo77321e();
            this.f96531s.f112788h = this.f96529q;
            this.f96531s.f112792l = new C37910b();
            this.f96531s.mo90506a();
        }
    }
}
