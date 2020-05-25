package com.p683ss.android.ugc.aweme.feed.adapter;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.app.Activity;
import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.text.TextUtils;
import android.util.SparseArray;
import android.util.SparseBooleanArray;
import android.view.MotionEvent;
import android.view.Surface;
import android.view.SurfaceView;
import android.view.View;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.ViewStub;
import android.widget.FrameLayout;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.C2240a;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.apm.C8936b;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9379e;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.C10721b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.lighten.loader.SmartImageView;
import com.bytedance.lighten.p766a.C12197k;
import com.bytedance.lighten.p766a.C12202p;
import com.bytedance.lighten.p766a.C12203q;
import com.bytedance.lighten.p766a.C12208t;
import com.bytedance.lighten.p766a.p769c.C12175j;
import com.facebook.imagepipeline.common.C13951c;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23278c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.awemeservice.C23325e;
import com.p683ss.android.ugc.aweme.base.C23608p;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25065b;
import com.p683ss.android.ugc.aweme.comment.services.CommentService.C25280a;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25880al;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25881am;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26216b;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26373af;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.detail.experiment.CoverOptimizeExperiment;
import com.p683ss.android.ugc.aweme.discover.hotspot.feed.C28231a;
import com.p683ss.android.ugc.aweme.discover.hotspot.feed.C28231a.C28233a;
import com.p683ss.android.ugc.aweme.discover.hotspot.feed.C28231a.C28234b;
import com.p683ss.android.ugc.aweme.experiment.ShrinkVideoWhenCommentShowExperiment;
import com.p683ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p683ss.android.ugc.aweme.feed.C29984ac;
import com.p683ss.android.ugc.aweme.feed.C29988ad;
import com.p683ss.android.ugc.aweme.feed.C30578o;
import com.p683ss.android.ugc.aweme.feed.C31257z;
import com.p683ss.android.ugc.aweme.feed.api.C30153k;
import com.p683ss.android.ugc.aweme.feed.experiment.AwesomeSplashEventSendExperiment;
import com.p683ss.android.ugc.aweme.feed.experiment.C30220a;
import com.p683ss.android.ugc.aweme.feed.experiment.C30224d;
import com.p683ss.android.ugc.aweme.feed.experiment.FeedOptimizeEnableSetting;
import com.p683ss.android.ugc.aweme.feed.feedwidget.VPAInfoBarWidget;
import com.p683ss.android.ugc.aweme.feed.feedwidget.VPAOptedOutMaskWidget;
import com.p683ss.android.ugc.aweme.feed.feedwidget.VideoMaskWidget;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o;
import com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30256p;
import com.p683ss.android.ugc.aweme.feed.helper.C30360a;
import com.p683ss.android.ugc.aweme.feed.helper.C30365e;
import com.p683ss.android.ugc.aweme.feed.helper.C30391o;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeSplashInfo;
import com.p683ss.android.ugc.aweme.feed.model.AwemeStatisticsBackup;
import com.p683ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p683ss.android.ugc.aweme.feed.model.RelationLabelHelper;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.model.livesplash.LiveAwesomeSplashInfo;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30188c;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30193h;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30198m;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30315ag;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30322am;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30323an;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30335d;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30453i;
import com.p683ss.android.ugc.aweme.feed.p1731n.C30523a.C30526b;
import com.p683ss.android.ugc.aweme.feed.p1731n.C30523a.C30527c;
import com.p683ss.android.ugc.aweme.feed.p1731n.C30523a.C30528d;
import com.p683ss.android.ugc.aweme.feed.p1731n.C30523a.C30529e;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30787bb;
import com.p683ss.android.ugc.aweme.feed.p1736ui.DebugInfoView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LongPressLayout;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LongPressLayout.C30722a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.landscape.C31030a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.landscape.VideoViewLandscapeHelper;
import com.p683ss.android.ugc.aweme.feed.param.FeedParamProvider;
import com.p683ss.android.ugc.aweme.feed.service.C30687a;
import com.p683ss.android.ugc.aweme.feed.utils.C31178ac;
import com.p683ss.android.ugc.aweme.feed.utils.C31186b;
import com.p683ss.android.ugc.aweme.feed.utils.C31188d;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.feed.utils.C31203o;
import com.p683ss.android.ugc.aweme.feed.utils.C31205q;
import com.p683ss.android.ugc.aweme.feed.utils.C31205q.C31207a;
import com.p683ss.android.ugc.aweme.feed.utils.C31208r;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.lego.inflate.task.PosterSRProcessorInitTask;
import com.p683ss.android.ugc.aweme.legoImp.inflate.C35914e;
import com.p683ss.android.ugc.aweme.login.utils.C36330a;
import com.p683ss.android.ugc.aweme.main.C36512b;
import com.p683ss.android.ugc.aweme.main.CleanModeManager2;
import com.p683ss.android.ugc.aweme.main.experiment.ClearVideoBackgroundExperiment;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabSwitchExperiment;
import com.p683ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl;
import com.p683ss.android.ugc.aweme.p1382aq.C23248r;
import com.p683ss.android.ugc.aweme.p1382aq.C23249s;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMContact;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47462h;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38859e.C38866g;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.poi.widget.C39481c;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.protection.serviceimpl.AwemeProtectionServiceImpl;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.services.MainServiceImpl;
import com.p683ss.android.ugc.aweme.setting.p2148ui.RestrictTextView;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44576a;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.C44586b;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2238f.C44626f;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.widget.AbsInteractStickerWidget;
import com.p683ss.android.ugc.aweme.splash.C45690c;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45881a;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45882b;
import com.p683ss.android.ugc.aweme.sticker.p2282f.C45885d;
import com.p683ss.android.ugc.aweme.userservice.C47588a;
import com.p683ss.android.ugc.aweme.util.FollowPageFirstFrameViewModel;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47934o;
import com.p683ss.android.ugc.aweme.utils.C47935p;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48114q;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.video.p2395d.C48010a;
import com.p683ss.android.ugc.aweme.video.p2395d.C48012b;
import com.p683ss.android.ugc.playerkit.p2494c.C50112d;
import com.p683ss.android.ugc.playerkit.p2494c.C50117f;
import com.p683ss.android.ugc.playerkit.p2494c.C50118g;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.p683ss.android.ugc.playerkit.videoview.C50158g;
import com.p683ss.android.ugc.playerkit.videoview.C50159h;
import com.p683ss.android.ugc.playerkit.videoview.C50160i;
import com.p683ss.android.ugc.playerkit.videoview.C50161j;
import com.p683ss.android.ugc.playerkit.videoview.VideoViewComponent;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.Callable;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder */
public class VideoViewHolder extends C30077d implements C30014ae, C30015af, C30787bb, C44586b, C44626f, C50158g, C50161j {

    /* renamed from: A */
    static C22453b f78269A = C22453b.m55505a();

    /* renamed from: Y */
    private static int f78270Y = C10193n.m20607a().mo18200a(FeedOptimizeEnableSetting.class, "feed_optimize_enable_setting", C10181b.m20511a().mo18175c().getFeedOptimizeEnableSetting(), (int) FeedOptimizeEnableSetting.VERSION_100700);

    /* renamed from: aa */
    private static WeakHashMap<Context, C9379e<SurfaceView>> f78271aa = new WeakHashMap<>();

    /* renamed from: ab */
    private static WeakHashMap<Context, C9379e<VideoViewHolder>> f78272ab = new WeakHashMap<>();

    /* renamed from: z */
    public static boolean f78273z = C10181b.m20511a().mo18172a(ClearVideoBackgroundExperiment.class, true, "is_clear_video_background", 31744, true);

    /* renamed from: B */
    public boolean f78274B;

    /* renamed from: C */
    public C30198m f78275C;

    /* renamed from: D */
    protected C23279d f78276D;

    /* renamed from: E */
    public boolean f78277E;

    /* renamed from: F */
    protected final BaseFeedPageParams f78278F;

    /* renamed from: G */
    public final VideoItemParams f78279G;

    /* renamed from: H */
    C30032at f78280H;

    /* renamed from: I */
    boolean f78281I;

    /* renamed from: J */
    private boolean f78282J;

    /* renamed from: K */
    private C30365e f78283K;

    /* renamed from: L */
    private boolean f78284L;

    /* renamed from: M */
    private Runnable f78285M;

    /* renamed from: N */
    private boolean f78286N;

    /* renamed from: O */
    private final C25880al f78287O;

    /* renamed from: P */
    private final C25881am f78288P;

    /* renamed from: Q */
    private C48012b f78289Q;

    /* renamed from: R */
    private boolean f78290R;

    /* renamed from: S */
    private C30001a f78291S;

    /* renamed from: T */
    private int f78292T;

    /* renamed from: U */
    private C44576a f78293U;

    /* renamed from: V */
    private OnTouchListener f78294V;

    /* renamed from: W */
    private C30722a f78295W;

    /* renamed from: X */
    private int f78296X;

    /* renamed from: Z */
    private VideoViewLandscapeHelper f78297Z;

    /* renamed from: a */
    private boolean f78298a;

    /* renamed from: ac */
    private final int f78299ac;

    /* renamed from: ad */
    private C28231a f78300ad;
    LinearLayout adFeeDeductionLayout;

    /* renamed from: ae */
    private Widget f78301ae;

    /* renamed from: af */
    private Widget f78302af;

    /* renamed from: ag */
    private boolean f78303ag;

    /* renamed from: ah */
    private boolean f78304ah;

    /* renamed from: ai */
    private SparseBooleanArray f78305ai;

    /* renamed from: aj */
    private int f78306aj;

    /* renamed from: ak */
    private int f78307ak;

    /* renamed from: al */
    private boolean f78308al;

    /* renamed from: am */
    private int f78309am;

    /* renamed from: an */
    private boolean f78310an;

    /* renamed from: ao */
    private boolean f78311ao;

    /* renamed from: ap */
    private String f78312ap;

    /* renamed from: aq */
    private C0199s<FollowStatus> f78313aq;

    /* renamed from: b */
    private int f78314b;

    /* renamed from: c */
    private int f78315c;
    FrameLayout commerceGoodHalfCardContainer;

    /* renamed from: d */
    private int f78316d;

    /* renamed from: e */
    private VideoViewComponent f78317e;

    /* renamed from: f */
    private C39481c f78318f;
    LinearLayout feedReportVotell;
    ConstraintLayout feedReportWarnll;
    FrameLayout flInteractLayout;

    /* renamed from: g */
    private final C30313ae<C30332aw> f78319g;

    /* renamed from: k */
    int f78320k;

    /* renamed from: l */
    protected C50159h f78321l;
    ViewGroup llAwemeIntro;
    LinearLayout llRightMenu;

    /* renamed from: m */
    FrameLayout f78322m;
    DmtTextView mAllowDisplayBtn;
    View mAvatarLayout;
    FrameLayout mBottomView;
    ImageView mCornerBL;
    ImageView mCornerBR;
    ImageView mCornerTL;
    ImageView mCornerTR;
    SmartImageView mCoverView;
    DebugInfoView mDebugInfoView;
    DmtTextView mDisallowDisplayBtn;
    ViewStub mFullFeedStub;
    View mGradualBottomView;
    View mGradualTopView;
    AnimationImageView mIvRelieveTag;
    LongPressLayout mLongPressLayout;
    RestrictTextView mRestrictTextView;
    FrameLayout mRootView;
    ImageView mShareTipImageView;
    DmtTextView mTxtProhibited;
    ViewGroup mVideoTagContainer;
    DmtTextView mVoteStatusTextView;
    RelativeLayout mWidgetContainer;
    TextView mlandscapeTipTv;

    /* renamed from: n */
    protected long f78323n;

    /* renamed from: o */
    public final Context f78324o;

    /* renamed from: p */
    protected Aweme f78325p;

    /* renamed from: q */
    public JSONObject f78326q;

    /* renamed from: r */
    protected final Fragment f78327r;

    /* renamed from: s */
    protected int f78328s;
    View shareTipsRl;
    DmtTextView shareTipsTv;

    /* renamed from: t */
    public final C30188c f78329t;
    TagLayout tagLayout;

    /* renamed from: u */
    C30360a f78330u = new C30360a();

    /* renamed from: v */
    public SparseArray<Integer> f78331v;

    /* renamed from: w */
    public boolean f78332w;

    /* renamed from: x */
    public AnimatorSet f78333x;

    /* renamed from: y */
    protected boolean f78334y;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$a */
    class C30001a implements Runnable {

        /* renamed from: a */
        public boolean f78348a;

        /* renamed from: c */
        private final Aweme f78350c;

        public final void run() {
            if (C26235d.m63570a(this.f78350c)) {
                Aweme aweme = this.f78350c;
                if (C26235d.m63570a(aweme) && aweme != null) {
                    LiveAwesomeSplashInfo liveAwesomeSplashInfo = aweme.getLiveAwesomeSplashInfo();
                    if (liveAwesomeSplashInfo != null) {
                        liveAwesomeSplashInfo.setHasShown(true);
                    }
                }
            } else {
                AwemeSplashInfo l = C26503d.m64069l(this.f78350c);
                if (l != null) {
                    l.setShown(true);
                }
            }
            if (!this.f78348a && TextUtils.equals(this.f78350c.getAid(), VideoViewHolder.this.f78325p.getAid()) && VideoViewHolder.this.f78332w) {
                VideoViewHolder.this.mo60238g(3);
                VideoViewHolder.this.mo60231d(false);
                VideoViewHolder.this.mWidgetContainer.setAlpha(0.0f);
                VideoViewHolder.this.f78333x.start();
            }
        }

        C30001a(Aweme aweme) {
            this.f78350c = aweme;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$b */
    class C30002b implements C45881a {
        /* renamed from: a */
        public final void mo60269a() {
            if (VideoViewHolder.this.f78275C != null) {
                VideoViewHolder.this.f78275C.mo60524a(VideoViewHolder.this.f78325p, false, false);
            }
        }

        private C30002b() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$c */
    class C30003c implements Callable {

        /* renamed from: a */
        WeakReference<View> f78352a;

        /* renamed from: b */
        WeakReference<View> f78353b;

        /* renamed from: c */
        String f78354c;

        public final Object call() throws Exception {
            boolean z;
            System.currentTimeMillis();
            if (VideoViewHolder.this.f78325p.getAid() == null || !VideoViewHolder.this.f78325p.getAid().equals(this.f78354c)) {
                return null;
            }
            VideoViewHolder videoViewHolder = VideoViewHolder.this;
            VideoViewHolder videoViewHolder2 = VideoViewHolder.this;
            if (videoViewHolder2.f78330u.f79283d < VideoViewHolder.f78269A.f60470f || videoViewHolder2.f78330u.f79284e < videoViewHolder2.f78320k) {
                z = false;
            } else {
                z = true;
            }
            videoViewHolder.f78274B = z;
            if (VideoViewHolder.this.f78325p.isAd() || !VideoViewHolder.this.f78274B || !VideoViewHolder.f78273z) {
                VideoViewHolder.this.mo60232e(VideoViewHolder.this.f78324o.getResources().getColor(R.color.ip));
            } else {
                ((View) this.f78352a.get()).setBackground(null);
                ((View) this.f78353b.get()).setBackground(null);
                VideoViewHolder.this.mo60235f(0);
            }
            return null;
        }

        C30003c(View view, View view2, String str) {
            this.f78352a = new WeakReference<>(view);
            this.f78353b = new WeakReference<>(view2);
            this.f78354c = str;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$d */
    class C30004d implements C45882b {
        /* renamed from: a */
        public final void mo60271a(int i, MotionEvent motionEvent) {
        }

        /* renamed from: a */
        public final void mo60273a(int i, boolean z) {
        }

        private C30004d() {
        }

        /* renamed from: a */
        public final void mo60272a(int i, View view, float f, float f2, InteractStickerStruct interactStickerStruct, boolean z) {
            if ((!z || VideoViewHolder.m70201Y()) && VideoViewHolder.this.f78275C != null) {
                VideoViewHolder.this.f78275C.mo60524a(VideoViewHolder.this.f78325p, false, false);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$e */
    class C30005e implements C45885d {

        /* renamed from: b */
        private boolean f78358b;

        /* renamed from: a */
        public final void mo60275a(boolean z) {
        }

        /* renamed from: a */
        public final void mo60274a() {
            if (!VideoViewHolder.m70201Y() && VideoViewHolder.this.f78275C != null) {
                VideoViewHolder.this.f78275C.mo60524a(VideoViewHolder.this.f78325p, true, false);
            }
        }

        /* renamed from: b */
        public final void mo60276b() {
            this.f78358b = false;
            if (VideoViewHolder.m70201Y() && VideoViewHolder.this.f78275C != null) {
                this.f78358b = true;
                VideoViewHolder.this.f78275C.mo60524a(VideoViewHolder.this.f78325p, false, false);
            }
        }

        /* renamed from: c */
        public final void mo60277c() {
            if (this.f78358b && VideoViewHolder.this.f78275C != null) {
                VideoViewHolder.this.f78275C.mo60524a(VideoViewHolder.this.f78325p, false, false);
            }
        }

        private C30005e() {
        }
    }

    /* renamed from: D */
    public final C48012b mo60180D() {
        return this.f78289Q;
    }

    /* renamed from: F */
    public final boolean mo60181F() {
        return this.f78282J;
    }

    /* renamed from: J */
    public final C30365e mo60185J() {
        return this.f78283K;
    }

    /* renamed from: M */
    public final C30153k mo60188M() {
        return null;
    }

    /* renamed from: X */
    public final View mo60196X() {
        return this.mRootView;
    }

    /* renamed from: Z */
    public final Context mo60197Z() {
        return this.f78324o;
    }

    /* renamed from: a */
    public final void mo53523a(float f) {
    }

    /* renamed from: a */
    public final void mo53528a(String str, boolean z) {
    }

    /* renamed from: a */
    public final void mo53529a(boolean z) {
    }

    /* renamed from: b */
    public final void mo54505b(int i, int i2) {
    }

    /* renamed from: b */
    public final void mo53530b(C50112d dVar) {
    }

    /* renamed from: b */
    public final void mo53532b(boolean z) {
    }

    /* renamed from: d */
    public final int mo53998d() {
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo60230d(Aweme aweme) {
    }

    /* renamed from: d */
    public final void mo53534d(String str) {
    }

    /* renamed from: e */
    public final Aweme mo53999e() {
        return this.f78325p;
    }

    /* renamed from: j */
    public final C30014ae mo54004j() {
        return this;
    }

    /* renamed from: m */
    public final C50158g mo60242m() {
        return this;
    }

    /* renamed from: q */
    public final int mo60247q() {
        return 1;
    }

    /* renamed from: r */
    public final C25880al mo60248r() {
        return this.f78287O;
    }

    /* renamed from: s */
    public final C25881am mo60249s() {
        return this.f78288P;
    }

    /* renamed from: u */
    public final C30015af mo60251u() {
        return this;
    }

    /* renamed from: z */
    public final void mo60256z() {
        m70209am();
    }

    /* renamed from: a */
    public final void mo60198a(float f, float f2) {
        float f3 = ((float) this.f78309am) + f;
        float f4 = f2 + ((float) this.f78309am);
        if (f > 120.0f && !C36512b.m82421a().f93584a) {
            HomePageUIFrameServiceImpl.createHomePageUIFrameServicebyMonsterPlugin().setTitleTabVisibility(false);
            C36512b.m82421a().mo75641a(true);
        } else if (f <= 120.0f && C36512b.m82421a().f93584a) {
            HomePageUIFrameServiceImpl.createHomePageUIFrameServicebyMonsterPlugin().setTitleTabVisibility(true);
            C36512b.m82421a().mo75641a(false);
        }
        float f5 = 0.0f;
        if (f3 >= 0.0f) {
            f5 = f3;
        }
        if (this.mCoverView != null && this.mCoverView.getVisibility() == 0) {
            C31178ac.m72807a(this.mRootView.getContext(), this.mRootView, this.mCoverView, f5, f4, this.f78306aj, this.f78307ak);
        }
        C31178ac.m72807a(this.mRootView.getContext(), this.mRootView, this.f78321l.mo97949a(), f5, f4, this.f78306aj, this.f78307ak);
    }

    /* JADX WARNING: Removed duplicated region for block: B:20:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x0087 A[ADDED_TO_REGION] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo53996a(final com.p683ss.android.ugc.aweme.feed.model.Aweme r13) {
        /*
            r12 = this;
            if (r13 != 0) goto L_0x0003
            return
        L_0x0003:
            com.ss.android.ugc.aweme.video.d.b r0 = r12.f78289Q
            if (r0 == 0) goto L_0x000c
            com.ss.android.ugc.aweme.video.d.b r0 = r12.f78289Q
            r0.mo95213a()
        L_0x000c:
            com.ss.android.ugc.aweme.feed.helper.a r0 = r12.f78330u
            r1 = -1
            r0.f79284e = r1
            r0.f79283d = r1
            r0 = 0
            r12.f78284L = r0
            boolean r2 = r12.f78308al
            r3 = 1
            if (r2 == 0) goto L_0x0041
            com.ss.android.ugc.playerkit.videoview.h r2 = r12.f78321l
            android.view.View r2 = r2.mo97949a()
            com.p683ss.android.ugc.aweme.feed.utils.C31178ac.m72808a(r2)
            com.bytedance.lighten.loader.SmartImageView r2 = r12.mCoverView
            com.p683ss.android.ugc.aweme.feed.utils.C31178ac.m72808a(r2)
            com.ss.android.ugc.aweme.main.b r2 = com.p683ss.android.ugc.aweme.main.C36512b.m82421a()
            boolean r2 = r2.f93584a
            if (r2 == 0) goto L_0x0041
            com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService r2 = com.p683ss.android.ugc.aweme.main.uiApiImpl.HomePageUIFrameServiceImpl.createHomePageUIFrameServicebyMonsterPlugin()
            com.ss.android.ugc.aweme.homepage.api.ui.HomePageUIFrameService r2 = (com.p683ss.android.ugc.aweme.homepage.api.p1800ui.HomePageUIFrameService) r2
            r2.setTitleTabVisibility(r3)
            com.ss.android.ugc.aweme.main.b r2 = com.p683ss.android.ugc.aweme.main.C36512b.m82421a()
            r2.mo75641a(r0)
        L_0x0041:
            com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper r2 = r12.f78297Z
            r4 = 1065353216(0x3f800000, float:1.0)
            if (r2 == 0) goto L_0x00b5
            com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper r2 = r12.f78297Z
            r2.f81221c = r13
            r2.f81222d = r4
            r2.f81224f = r1
            r2.f81225g = r0
            r2.f81226h = r1
            r2.f81227i = r1
            r2.f81219a = r0
            r2.f81220b = r0
            r2.f81228j = r0
            r2.f81229k = r0
            r2.f81230l = r0
            r2.f81231m = r0
            r5 = 0
            r2.f81232n = r5
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r2.f81221c
            if (r5 == 0) goto L_0x0074
            com.ss.android.ugc.aweme.feed.model.Video r5 = r5.getVideo()
            if (r5 == 0) goto L_0x0074
            int r5 = r5.getWidth()
            goto L_0x0075
        L_0x0074:
            r5 = 0
        L_0x0075:
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r2.f81221c
            if (r6 == 0) goto L_0x0084
            com.ss.android.ugc.aweme.feed.model.Video r6 = r6.getVideo()
            if (r6 == 0) goto L_0x0084
            int r6 = r6.getHeight()
            goto L_0x0085
        L_0x0084:
            r6 = 0
        L_0x0085:
            if (r5 <= 0) goto L_0x008d
            if (r6 <= 0) goto L_0x008d
            if (r5 <= r6) goto L_0x008d
            r5 = 1
            goto L_0x008e
        L_0x008d:
            r5 = 0
        L_0x008e:
            r2.f81223e = r5
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r2.f81221c
            boolean r5 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64070m(r5)
            if (r5 != 0) goto L_0x00a0
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r2.f81221c
            boolean r5 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63570a(r5)
            if (r5 == 0) goto L_0x00a2
        L_0x00a0:
            r2.f81223e = r0
        L_0x00a2:
            r2.mo63799d()
            android.widget.FrameLayout r5 = r2.f81234p
            android.view.ViewTreeObserver r5 = r5.getViewTreeObserver()
            com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$b r6 = new com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper$b
            r6.<init>(r2)
            android.view.ViewTreeObserver$OnGlobalLayoutListener r6 = (android.view.ViewTreeObserver.OnGlobalLayoutListener) r6
            r5.addOnGlobalLayoutListener(r6)
        L_0x00b5:
            r2 = 3
            java.lang.String r5 = "VideoViewHolder"
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "VideoViewHolder.bind() called with: aweme id = "
            r6.<init>(r7)
            java.lang.String r7 = r13.getAid()
            r6.append(r7)
            java.lang.String r7 = ", position = "
            r6.append(r7)
            int r7 = r12.f78328s
            r6.append(r7)
            java.lang.String r7 = ", is ad = "
            r6.append(r7)
            boolean r7 = r13.isAd()
            r6.append(r7)
            java.lang.String r7 = ", adId = "
            r6.append(r7)
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r13.getAwemeRawAd()
            if (r7 == 0) goto L_0x00fe
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r13.getAwemeRawAd()
            java.lang.Long r7 = r7.getAdId()
            if (r7 == 0) goto L_0x00fe
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r7 = r13.getAwemeRawAd()
            java.lang.Long r7 = r7.getAdId()
            long r7 = r7.longValue()
            goto L_0x0100
        L_0x00fe:
            r7 = -1
        L_0x0100:
            r6.append(r7)
            java.lang.String r6 = r6.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75151c(r2, r5, r6)
            java.lang.String r2 = r13.getAid()
            int r5 = r12.f78328s
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r7 = "bindViewHolder "
            r6.<init>(r7)
            r6.append(r2)
            java.lang.String r2 = ", position "
            r6.append(r2)
            r6.append(r5)
            java.lang.String r2 = r6.toString()
            com.p683ss.android.ugc.aweme.feed.utils.C31203o.m72861b(r2)
            boolean r2 = r12.mo60375l()
            if (r2 != 0) goto L_0x0134
            com.ss.android.ugc.playerkit.videoview.h r2 = r12.f78321l
            r2.mo97950a(r12)
        L_0x0134:
            r12.f78325p = r13
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r2 = r12.f78279G
            r2.setAweme(r13)
            boolean r2 = r12.f78303ag
            if (r2 == 0) goto L_0x014f
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.o r2 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30255o.f79039a
            com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p r5 = new com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.p
            com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$3 r6 = new com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$3
            r6.<init>(r13)
            r5.<init>(r3, r6)
            r2.mo60617a(r5)
            goto L_0x0154
        L_0x014f:
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r2 = r12.f78279G
            r2.setwidgetAweme(r13)
        L_0x0154:
            r12.mo60372O()
            boolean r2 = r12.f78304ah
            if (r2 == 0) goto L_0x0161
            r12.m70219g(r13)
            r12.m70217f(r13)
        L_0x0161:
            boolean r2 = r12.f78310an
            if (r2 != 0) goto L_0x0171
            r12.f78310an = r3
            com.ss.android.ugc.aweme.feed.monitor.a r2 = com.p683ss.android.ugc.aweme.feed.monitor.C30514a.C30515a.m71483b()
            boolean r5 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.C30253m.m71085a(r13)
            r2.f79756d = r5
        L_0x0171:
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63571b(r13)
            if (r2 == 0) goto L_0x0188
            com.ss.android.ugc.aweme.arch.widgets.base.d r2 = r12.f78517i
            if (r2 == 0) goto L_0x0188
            com.ss.android.ugc.aweme.arch.widgets.base.d r2 = r12.f78517i
            r5 = 2132020732(0x7f140dfc, float:1.9679835E38)
            com.ss.android.ugc.aweme.feed.feedwidget.VideoLiveButtonWidget r6 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoLiveButtonWidget
            r6.<init>()
            r2.mo48255b(r5, r6)
        L_0x0188:
            com.ss.android.ugc.aweme.commercialize.feed.al r2 = r12.f78287O
            r2.mo53052a(r13)
            com.ss.android.ugc.aweme.feed.e.c r2 = r12.f78329t
            r5 = 8
            if (r13 == 0) goto L_0x0252
            r2.f78784d = r13
            android.view.ViewGroup r6 = r2.f78783c
            r7 = 0
            r6.setTranslationX(r7)
            android.view.ViewGroup r6 = r2.f78783c
            r6.setAlpha(r4)
            com.ss.android.ugc.aweme.feed.ui.VideoBottomButton r4 = r2.f78781a
            if (r4 == 0) goto L_0x01a9
            com.ss.android.ugc.aweme.feed.ui.VideoBottomButton r4 = r2.f78781a
            r4.setVisibility(r5)
        L_0x01a9:
            com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard r4 = r2.f78782b
            if (r4 == 0) goto L_0x01b7
            com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard r4 = r2.f78782b
            r4.setVisibility(r5)
            com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard r4 = r2.f78782b
            r4.setTranslationX(r7)
        L_0x01b7:
            com.ss.android.ugc.aweme.feed.model.FloatingCardInfo r4 = r13.getFloatingCardInfo()
            if (r4 == 0) goto L_0x0252
            boolean r6 = r13.isAd()
            if (r6 != 0) goto L_0x0252
            r2.mo60482a()
            com.ss.android.ugc.aweme.feed.ui.VideoBottomButton r6 = r2.f78781a
            r6.setVisibility(r0)
            com.ss.android.ugc.aweme.feed.ui.VideoBottomButton r6 = r2.f78781a
            java.lang.String r7 = r4.getButtonDesc()
            r6.setText(r7)
            com.ss.android.ugc.aweme.feed.ui.VideoBottomButton r6 = r2.f78781a
            com.ss.android.ugc.aweme.feed.e.d r7 = new com.ss.android.ugc.aweme.feed.e.d
            r7.<init>(r2, r4)
            r6.setOnClickListener(r7)
            com.ss.android.ugc.aweme.feed.ui.VideoBottomButton r6 = r2.f78781a
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r4.getButtonBackground()
            r6.setButtonBackground(r7)
            com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard r6 = r2.f78782b
            r7 = 4
            r6.setVisibility(r7)
            com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard r6 = r2.f78782b
            com.ss.android.ugc.aweme.feed.e.e r7 = new com.ss.android.ugc.aweme.feed.e.e
            r7.<init>(r2)
            r6.post(r7)
            java.util.List r6 = r4.getIcons()
            if (r6 == 0) goto L_0x0216
            java.util.List r6 = r4.getIcons()
            int r6 = r6.size()
            if (r6 <= 0) goto L_0x0216
            com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard r6 = r2.f78782b
            java.util.List r7 = r4.getIcons()
            java.lang.Object r7 = r7.get(r0)
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = (com.p683ss.android.ugc.aweme.base.model.UrlModel) r7
            r6.setIcon(r7)
        L_0x0216:
            com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard r6 = r2.f78782b
            java.lang.String r7 = r4.getTitle()
            r6.setTitle(r7)
            com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard r6 = r2.f78782b
            java.lang.String r7 = r4.getDescription()
            r6.setDesc(r7)
            com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard r6 = r2.f78782b
            java.lang.String r7 = r4.getSchemaDesc()
            r6.setButtonText(r7)
            com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard r6 = r2.f78782b
            com.ss.android.ugc.aweme.feed.e.f r7 = new com.ss.android.ugc.aweme.feed.e.f
            r7.<init>(r2, r4)
            r6.setOnClickListener(r7)
            com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard r6 = r2.f78782b
            com.ss.android.ugc.aweme.base.model.UrlModel r4 = r4.getButtonBackground()
            r6.setButtonBackground(r4)
            com.ss.android.ugc.aweme.feed.ui.VideoFloatingCard r4 = r2.f78782b
            android.widget.ImageView r4 = r4.getCloseView()
            com.ss.android.ugc.aweme.feed.e.g r6 = new com.ss.android.ugc.aweme.feed.e.g
            r6.<init>(r2)
            r4.setOnClickListener(r6)
        L_0x0252:
            com.ss.android.ugc.aweme.discover.hotspot.feed.a r2 = r12.f78300ad
            r4 = 0
            if (r2 == 0) goto L_0x02aa
            com.ss.android.ugc.aweme.discover.hotspot.feed.a r2 = r12.f78300ad
            if (r13 != 0) goto L_0x025c
            goto L_0x02aa
        L_0x025c:
            r2.f74099a = r13
            com.ss.android.ugc.aweme.discover.hotspot.feed.SpotCurSpotChangeCallBack r6 = r2.f74101c
            java.lang.String r7 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r13, r7)
            com.ss.android.ugc.aweme.arch.widgets.base.b<d.n<com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Boolean>> r7 = r6.f74095a
            java.lang.Object r7 = r7.getValue()
            d.n r7 = (p2628d.C52847n) r7
            if (r7 == 0) goto L_0x0276
            java.lang.Object r7 = r7.getFirst()
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r7
            goto L_0x0277
        L_0x0276:
            r7 = r4
        L_0x0277:
            boolean r7 = p2628d.p2639f.p2641b.C52711k.m112239a(r7, r13)
            if (r7 == 0) goto L_0x027f
            r6 = 1
            goto L_0x029a
        L_0x027f:
            com.ss.android.ugc.aweme.arch.widgets.base.b<d.n<com.ss.android.ugc.aweme.feed.model.Aweme, java.lang.Boolean>> r6 = r6.f74096b
            java.lang.Object r6 = r6.getValue()
            d.n r6 = (p2628d.C52847n) r6
            if (r6 == 0) goto L_0x0290
            java.lang.Object r6 = r6.getFirst()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r6
            goto L_0x0291
        L_0x0290:
            r6 = r4
        L_0x0291:
            boolean r6 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r13)
            if (r6 == 0) goto L_0x0299
            r6 = -1
            goto L_0x029a
        L_0x0299:
            r6 = 0
        L_0x029a:
            if (r6 == 0) goto L_0x02a5
            if (r6 != r1) goto L_0x02a0
            r1 = 1
            goto L_0x02a1
        L_0x02a0:
            r1 = 0
        L_0x02a1:
            r2.mo56655a(r1)
            goto L_0x02aa
        L_0x02a5:
            android.view.View r1 = r2.f74100b
            r1.setVisibility(r5)
        L_0x02aa:
            com.ss.android.ugc.aweme.sticker.l r1 = new com.ss.android.ugc.aweme.sticker.l
            r1.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r12.f78325p
            java.lang.String r2 = r2.getAuthorUid()
            com.ss.android.ugc.aweme.sticker.l r2 = r1.mo92607b(r2)
            java.lang.String r5 = r12.mo60210aa()
            com.ss.android.ugc.aweme.sticker.l r2 = r2.mo92606a(r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r12.f78325p
            java.lang.String r5 = r5.getAid()
            com.ss.android.ugc.aweme.sticker.l r2 = r2.mo92608c(r5)
            com.ss.android.ugc.aweme.feed.aa r5 = com.p683ss.android.ugc.aweme.feed.C29981aa.m70153a()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r12.f78325p
            java.lang.String r6 = r6.getRequestId()
            java.lang.String r5 = r5.mo60161a(r6)
            r2.mo92609d(r5)
            boolean r2 = com.p683ss.android.ugc.aweme.video.C48121w.m104087I()
            if (r2 != 0) goto L_0x02e8
            com.ss.android.ugc.aweme.video.h r2 = com.p683ss.android.ugc.aweme.video.C48121w.m104249M()
            r5 = r4
            goto L_0x02ea
        L_0x02e8:
            r5 = r12
            r2 = r4
        L_0x02ea:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a r6 = r12.f78293U
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r12.f78325p
            r6.mo90508a(r7)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a r6 = r12.f78293U
            com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$d r7 = new com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$d
            r7.<init>()
            r6.f112783c = r7
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a r6 = r12.f78293U
            com.ss.android.ugc.aweme.feed.b.a r7 = new com.ss.android.ugc.aweme.feed.b.a
            android.content.Context r8 = r12.f78324o
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r12.f78325p
            com.ss.android.ugc.aweme.feed.model.Video r9 = r9.getVideo()
            com.ss.android.ugc.aweme.feed.helper.a r10 = r12.f78330u
            com.ss.android.ugc.aweme.feed.model.Aweme r11 = r12.f78325p
            com.ss.android.ugc.aweme.feed.model.OcrLocation r11 = r11.getOcrLocation()
            r7.<init>(r8, r9, r10, r11)
            r6.f112784d = r7
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a r6 = r12.f78293U
            r6.f112785e = r1
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a r1 = r12.f78293U
            r1.f112786f = r2
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a r1 = r12.f78293U
            r1.f112787g = r5
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a r1 = r12.f78293U
            com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$e r2 = new com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$e
            r2.<init>()
            r1.f112788h = r2
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a r1 = r12.f78293U
            com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$b r2 = new com.ss.android.ugc.aweme.feed.adapter.VideoViewHolder$b
            r2.<init>()
            r1.f112792l = r2
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a r1 = r12.f78293U
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r2 = r12.f78278F
            boolean r2 = r2.showVote
            if (r2 == 0) goto L_0x034d
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r12.f78325p
            java.lang.String r2 = r2.getAid()
            com.ss.android.ugc.aweme.feed.e.m r4 = r12.f78275C
            java.lang.String r4 = r4.mo60525an()
            boolean r2 = android.text.TextUtils.equals(r2, r4)
            if (r2 == 0) goto L_0x034d
            r2 = 1
            goto L_0x034e
        L_0x034d:
            r2 = 0
        L_0x034e:
            r1.f112791k = r2
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a r1 = r12.f78293U
            r1.mo90506a()
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a r1 = r12.f78293U
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r12.f78325p
            r1.mo90508a(r2)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a r1 = r12.f78293U
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r12.f78325p
            r1.mo90508a(r2)
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a r1 = r12.f78293U
            r1.mo90512b()
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r1 = r12.f78278F
            com.ss.android.ugc.aweme.feed.param.b r1 = r1.param
            boolean r1 = r1.isHotSpot()
            if (r1 == 0) goto L_0x0391
            com.ss.android.ugc.aweme.discover.hotspot.a.a$a r1 = com.p683ss.android.ugc.aweme.discover.hotspot.p1649a.C28226a.f74093a
            com.ss.android.ugc.aweme.adaptation.b r1 = com.p683ss.android.ugc.aweme.adaptation.C22453b.m55505a()
            boolean r1 = r1.f60473k
            r1 = r1 ^ r3
            if (r1 == 0) goto L_0x0391
            android.widget.RelativeLayout r1 = r12.mWidgetContainer
            java.lang.String r2 = "$this$transForSpot"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            android.content.Context r2 = r1.getContext()
            r4 = -1051721728(0xffffffffc1500000, float:-13.0)
            float r2 = com.bytedance.common.utility.C9432q.m18687b(r2, r4)
            r1.setTranslationY(r2)
        L_0x0391:
            r12.mo60243n()
            com.ss.android.ugc.aweme.commercialize.feed.al r1 = r12.f78287O
            r1.mo53041a()
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64070m(r13)
            if (r1 == 0) goto L_0x03a5
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64072o(r13)
            if (r1 == 0) goto L_0x03d5
        L_0x03a5:
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63570a(r13)
            if (r1 == 0) goto L_0x03b1
            boolean r13 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63573d(r13)
            if (r13 == 0) goto L_0x03d5
        L_0x03b1:
            java.lang.String r13 = r12.mo60210aa()
            boolean r13 = com.p683ss.android.ugc.aweme.feed.C31257z.m72970a(r13)
            if (r13 == 0) goto L_0x03c3
            com.ss.android.ugc.aweme.main.b r13 = com.p683ss.android.ugc.aweme.main.C36512b.m82421a()
            boolean r13 = r13.f93584a
            if (r13 != 0) goto L_0x03d5
        L_0x03c3:
            java.lang.String r13 = r12.mo60210aa()
            boolean r13 = com.p683ss.android.ugc.aweme.feed.C31257z.m72971b(r13)
            if (r13 == 0) goto L_0x03d6
            com.ss.android.ugc.aweme.main.b r13 = com.p683ss.android.ugc.aweme.main.C36512b.m82421a()
            boolean r13 = r13.f93585b
            if (r13 == 0) goto L_0x03d6
        L_0x03d5:
            r0 = 1
        L_0x03d6:
            r12.mo60231d(r0)
            com.ss.android.ugc.aweme.userservice.api.b r13 = com.p683ss.android.ugc.aweme.userservice.C47588a.m103036c()
            com.ss.android.ugc.aweme.userservice.api.b r13 = (com.p683ss.android.ugc.aweme.userservice.api.C47590b) r13
            com.ss.android.ugc.aweme.arch.widgets.base.b r13 = r13.mo94911b()
            android.support.v4.app.Fragment r0 = r12.f78327r
            android.arch.lifecycle.s<com.ss.android.ugc.aweme.profile.model.FollowStatus> r1 = r12.f78313aq
            r13.observe(r0, r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = r12.f78325p
            if (r13 == 0) goto L_0x0404
            com.ss.android.ugc.aweme.feed.model.Aweme r13 = r12.f78325p
            boolean r13 = r13.shouldShowReviewStatus()
            if (r13 != 0) goto L_0x03f7
            goto L_0x0404
        L_0x03f7:
            com.ss.android.ugc.aweme.arch.widgets.base.d r13 = r12.f78517i
            android.widget.FrameLayout r0 = r12.mBottomView
            com.ss.android.ugc.aweme.feed.feedwidget.VideoReviewStatusWidget r1 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoReviewStatusWidget
            r1.<init>()
            r13.mo48251a(r0, r1)
            return
        L_0x0404:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.adapter.VideoViewHolder.mo53996a(com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:24:0x0096, code lost:
        if (r0 != null) goto L_0x0098;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60202a(com.p683ss.android.ugc.aweme.feed.p1723h.C30316ah r14) {
        /*
            r13 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f78325p
            java.lang.String r0 = r0.getAid()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r14.f79205b
            java.lang.String r1 = r1.getAid()
            boolean r0 = r0.equals(r1)
            if (r0 != 0) goto L_0x0013
            return
        L_0x0013:
            com.ss.android.ugc.aweme.feed.model.PrivateUrlModel r0 = r14.f79204a
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r0.labelPrivate
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f78325p
            r1.setLabelPrivate(r0)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f78325p
            com.ss.android.ugc.aweme.feed.model.PrivateUrlModel r14 = r14.f79204a
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel> r14 = r14.hybridLabels
            r1.setHybridLabels(r14)
            r14 = 0
            r1 = 1
            if (r0 == 0) goto L_0x0034
            com.ss.android.ugc.aweme.feed.model.AwemeLabelModel r14 = new com.ss.android.ugc.aweme.feed.model.AwemeLabelModel
            r14.<init>()
            r14.setLabelType(r1)
            r14.setUrlModels(r0)
        L_0x0034:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f78325p
            r3 = 0
            if (r2 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f78325p
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r2 = r2.videoLabels
            if (r2 == 0) goto L_0x0058
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f78325p
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r2 = r2.videoLabels
            int r2 = r2.size()
            if (r2 != 0) goto L_0x0051
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f78325p
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r2 = r2.videoLabels
            r2.add(r3, r14)
            goto L_0x0058
        L_0x0051:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f78325p
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r2 = r2.videoLabels
            r2.set(r3, r14)
        L_0x0058:
            com.ss.android.ugc.aweme.app.SharePrefCache r14 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r14 = r14.getIsPrivateAvailable()
            java.lang.Object r14 = r14.mo47782d()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x0088
            if (r0 == 0) goto L_0x0088
            java.util.List r14 = r0.getUrlList()
            boolean r14 = com.bytedance.common.utility.p522b.C9376b.m18558a(r14)
            if (r14 != 0) goto L_0x0088
            com.ss.android.ugc.aweme.base.ui.TagLayout r14 = r13.tagLayout
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f78325p
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f78325p
            java.util.List r1 = r1.getVideoLabels()
            com.ss.android.ugc.aweme.base.ui.TagLayout$a r2 = com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout.f63027e
            r14.mo49068b(r0, r1, r2)
            return
        L_0x0088:
            com.ss.android.ugc.aweme.base.ui.TagLayout r14 = r13.tagLayout
            android.view.View r0 = r14.mo49066a(r1)
            if (r0 != 0) goto L_0x0098
            r0 = 11
            android.view.View r0 = r14.mo49066a(r0)
            if (r0 == 0) goto L_0x0108
        L_0x0098:
            int r2 = r14.indexOfChild(r0)
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r5 = -1
            r6 = 0
            if (r2 == r5) goto L_0x00f2
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            java.util.ArrayList r7 = new java.util.ArrayList
            r7.<init>()
            r8 = 0
        L_0x00b0:
            int r9 = r14.getChildCount()
            if (r8 >= r9) goto L_0x00e7
            if (r8 <= r2) goto L_0x00e4
            android.view.View r9 = r14.getChildAt(r8)
            r4.add(r9)
            int r9 = r0.getWidth()
            int r9 = -r9
            float r9 = (float) r9
            android.content.Context r10 = r14.f63029a
            r11 = 1088421888(0x40e00000, float:7.0)
            float r10 = com.bytedance.common.utility.C9432q.m18687b(r10, r11)
            float r9 = r9 - r10
            int r9 = (int) r9
            android.view.View r10 = r14.getChildAt(r8)
            java.lang.String r11 = "translationX"
            r12 = 2
            float[] r12 = new float[r12]
            r12[r3] = r6
            float r9 = (float) r9
            r12[r1] = r9
            android.animation.ObjectAnimator r9 = android.animation.ObjectAnimator.ofFloat(r10, r11, r12)
            r7.add(r9)
        L_0x00e4:
            int r8 = r8 + 1
            goto L_0x00b0
        L_0x00e7:
            r1 = 200(0xc8, double:9.9E-322)
            r5.setDuration(r1)
            r5.playSequentially(r7)
            r5.start()
        L_0x00f2:
            android.view.ViewPropertyAnimator r1 = r0.animate()
            android.view.ViewPropertyAnimator r1 = r1.alpha(r6)
            r2 = 150(0x96, double:7.4E-322)
            android.view.ViewPropertyAnimator r1 = r1.setDuration(r2)
            com.ss.android.ugc.aweme.base.ui.TagLayout$1 r2 = new com.ss.android.ugc.aweme.base.ui.TagLayout$1
            r2.<init>(r0, r4)
            r1.withEndAction(r2)
        L_0x0108:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.adapter.VideoViewHolder.mo60202a(com.ss.android.ugc.aweme.feed.h.ah):void");
    }

    /* renamed from: a */
    public final void mo60208a(String str, String str2) {
        if (this.f78325p != null && TextUtils.equals(this.f78325p.getAid(), str2) && !TextUtils.isEmpty(str) && !TextUtils.isEmpty(str2)) {
            if ((C31257z.m72970a(mo60210aa()) || TextUtils.equals(mo60210aa(), "personal_homepage") || TextUtils.equals(mo60210aa(), "others_homepage") || TextUtils.equals(mo60210aa(), "challenge")) && this.tagLayout != null) {
                this.f78325p.setFeedRelationLabel(RelationLabelHelper.mockStarCommentLabel(this.f78325p.getAuthor()));
            }
        }
    }

    /* renamed from: a */
    public final void mo60206a(final C35471h hVar) {
        if (this.f78325p != null && TextUtils.equals(hVar.aid, this.f78325p.getAid()) && !C25280a.m61493a().isCommentListShowing(mo60197Z())) {
            if (mo60373P()) {
                C10691a.m21535a(C11010c.m22280a(), (int) R.string.bna, 1, 1).mo19066a();
            } else {
                C18842a.m45933a(new Runnable() {
                    public final void run() {
                        String str;
                        int childCount = VideoViewHolder.this.mBottomView.getChildCount();
                        VideoViewHolder.this.f78331v = new SparseArray<>();
                        for (int i = 0; i < childCount; i++) {
                            View childAt = VideoViewHolder.this.mBottomView.getChildAt(i);
                            VideoViewHolder.this.f78331v.put(childAt.getId(), Integer.valueOf(childAt.getVisibility()));
                            childAt.setVisibility(8);
                        }
                        C35471h hVar = hVar;
                        View view = VideoViewHolder.this.shareTipsRl;
                        DmtTextView dmtTextView = VideoViewHolder.this.shareTipsTv;
                        FrameLayout frameLayout = VideoViewHolder.this.mBottomView;
                        SparseArray<Integer> sparseArray = VideoViewHolder.this.f78331v;
                        C52711k.m112240b(hVar, "shareCompleteEvent");
                        C52711k.m112240b(view, "shareTipsRl");
                        C52711k.m112240b(dmtTextView, "shareTipsTv");
                        C52711k.m112240b(frameLayout, "mBottomView");
                        C52711k.m112240b(sparseArray, "viewStaus");
                        if (TextUtils.equals("aweme", hVar.itemType)) {
                            DefaultIMService.provideIMService_Monster().cacheRecentShareContact(hVar.contact);
                        }
                        float b = C9432q.m18687b(C11010c.m22280a(), 32.0f);
                        view.getLayoutParams().height = 0;
                        view.requestLayout();
                        view.setVisibility(0);
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, b});
                        ofFloat.addUpdateListener(new C30528d(view, null));
                        C52711k.m112236a((Object) ofFloat, "animator");
                        ofFloat.setDuration(300);
                        ofFloat.start();
                        if (hVar.isMulti) {
                            Context context = view.getContext();
                            C52711k.m112236a((Object) context, "shareTipsRl.context");
                            str = context.getResources().getString(R.string.bas);
                            C52711k.m112236a((Object) str, "shareTipsRl.context.reso…tring.have_sent_to_users)");
                        } else {
                            Context context2 = view.getContext();
                            C52711k.m112236a((Object) context2, "shareTipsRl.context");
                            str = context2.getResources().getString(R.string.bar);
                            C52711k.m112236a((Object) str, "shareTipsRl.context.reso…string.have_sent_to_user)");
                        }
                        IMContact iMContact = hVar.contact;
                        C52711k.m112236a((Object) iMContact, "shareCompleteEvent.contact");
                        String a = C2240a.m6772a(str, Arrays.copyOf(new Object[]{iMContact.getDisplayName()}, 1));
                        C52711k.m112236a((Object) a, "java.lang.String.format(format, *args)");
                        dmtTextView.setText(a);
                        if (MainServiceImpl.createIMainServicebyMonsterPlugin().shouldChangeToHandle("Message")) {
                            IMContact iMContact2 = hVar.contact;
                            if (iMContact2 instanceof IMUser) {
                                String a2 = C2240a.m6772a(str, Arrays.copyOf(new Object[]{((IMUser) iMContact2).getDisplayId()}, 1));
                                C52711k.m112236a((Object) a2, "java.lang.String.format(format, *args)");
                                dmtTextView.setText(a2);
                            }
                        }
                        C30529e eVar = new C30529e(view, hVar, frameLayout, sparseArray, null);
                        view.setOnClickListener(eVar);
                        C18842a.m45933a(new Runnable() {
                            public final void run() {
                                View view = VideoViewHolder.this.shareTipsRl;
                                FrameLayout frameLayout = VideoViewHolder.this.mBottomView;
                                SparseArray<Integer> sparseArray = VideoViewHolder.this.f78331v;
                                C52711k.m112240b(view, "shareTipsRl");
                                C52711k.m112240b(frameLayout, "mBottomView");
                                C52711k.m112240b(sparseArray, "viewStaus");
                                if (view.getVisibility() != 8) {
                                    ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{(float) view.getHeight(), 0.0f});
                                    ofFloat.addUpdateListener(new C30526b(view, null));
                                    ofFloat.addListener(new C30527c(frameLayout, sparseArray, null));
                                    C52711k.m112236a((Object) ofFloat, "animator");
                                    ofFloat.setDuration(300);
                                    ofFloat.start();
                                }
                            }
                        }, 5000);
                    }
                }, 500);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo60200a(View view, boolean z) {
        float f = 1.0f;
        if (!this.f78278F.param.isHotSpot() || !CleanModeManager2.m82254a(mo60197Z())) {
            view.setVisibility((C23794bh.m58390d().mo47103a() || z) ? 4 : 0);
            if (!z) {
                view.setAlpha(1.0f);
            }
            return;
        }
        C52711k.m112240b(view, "$this$fade");
        ViewPropertyAnimator animate = view.animate();
        if (z) {
            f = 0.0f;
        }
        animate.alpha(f).setDuration(400).start();
    }

    /* renamed from: a */
    public void mo53995a(int i) {
        String str;
        this.f78332w = true;
        if (C26235d.m63571b(this.f78325p)) {
            C31205q.m72869a(this.f78325p, (C31207a) new C31207a() {
                /* renamed from: a */
                public final void mo60265a() {
                }

                /* renamed from: a */
                public final void mo60266a(Room room) {
                }

                /* renamed from: b */
                public final void mo60267b() {
                }
            }, false);
            Aweme aweme = this.f78325p;
            if (C26235d.m63571b(aweme)) {
                HashMap hashMap = new HashMap();
                hashMap.put("enter_from_merge", "topview");
                hashMap.put("enter_method", "");
                hashMap.put("anchor_id", C31205q.m72867a(aweme));
                String str2 = "room_id";
                if (!C26235d.m63571b(aweme) || aweme == null) {
                    str = "";
                } else {
                    Room room = (Room) C31205q.f81647d.get(aweme.getAid());
                    str = room != null ? String.valueOf(room.getId()) : "";
                }
                hashMap.put(str2, str);
                hashMap.put("action_type", "click");
                C26890h.m65011a("livesdk_live_show", (Map<String, String>) hashMap);
            }
            if (C26235d.m63570a(this.f78325p) && !C26235d.m63573d(this.f78325p)) {
                C31208r.m72880a(this.f78325p, "livesdk_topview_show");
            }
            C31208r.m72884a("ttlive_cny_topview_info", (Object) this.f78325p != null ? this.f78325p.getLiveAwesomeSplashInfo() : null);
        }
        if ((!C26503d.m64070m(this.f78325p) || C26503d.m64072o(this.f78325p)) && (!C26235d.m63570a(this.f78325p) || C26235d.m63573d(this.f78325p))) {
            if (C31257z.m72969a(this.f78299ac) || CleanModeManager2.m82254a(mo60197Z())) {
                mo60200a((View) this.mWidgetContainer, m70211ao());
            }
            if (!C10181b.m20511a().mo18172a(AwesomeSplashEventSendExperiment.class, true, "awesome_splash_event_send", 31744, false)) {
                mo60238g(4);
            }
        } else {
            mo60231d(true);
            mo60238g(1);
        }
        m70221h("onViewHolderSelected");
        if (this.f78516h != null) {
            this.f78516h.mo48228a("on_page_selected", (Object) Boolean.valueOf(true));
        }
        if (this.tagLayout != null) {
            TagLayout tagLayout2 = this.tagLayout;
            if (TextUtils.equals(tagLayout2.f63030b, "homepage_hot") && tagLayout2.f63031c.getRelationRecommendInfo() != null) {
                C26890h.m65011a("show_label", C23089d.m56640a().mo47829a("enter_from", tagLayout2.f63030b).mo47829a("group_id", tagLayout2.f63031c.getAid()).mo47829a("author_id", tagLayout2.f63031c.getAuthorUid()).mo47827a("rec_type", tagLayout2.f63031c.getRelationRecommendInfo().getRecommendType()).mo47829a("label_text", tagLayout2.f63031c.getRelationRecommendInfo().getRelationTextKey()).f61491a);
            } else if (!(tagLayout2.f63031c == null || tagLayout2.f63031c.getRelationLabel() == null || !tagLayout2.f63031c.getRelationLabel().isValid() || tagLayout2.f63032d == null)) {
                C26890h.onEvent(MobClick.obtain().setEventName("show").setLabelName("like_banner").setValue(tagLayout2.f63031c.getAid()).setExtValueString(C20854a.m53167g().getCurUserId()));
            }
        }
        if (C31186b.m72812a(this.f78325p)) {
            C25945k.m62917h().mo52100a(mo60197Z(), this.f78325p, mo60254x(), true);
        }
        if (this.f78300ad != null) {
            C28231a aVar = this.f78300ad;
            if (aVar.f74100b.getVisibility() != 8) {
                ViewPropertyAnimator animate = aVar.f74100b.animate();
                animate.setDuration(200);
                animate.setStartDelay(1000);
                animate.alpha(0.0f);
                animate.start();
                animate.setListener(new C28233a(aVar)).setUpdateListener(C28234b.f74107a);
            }
        }
        if (C31257z.m72970a(mo60210aa())) {
            if (this.f78286N) {
                this.f78321l.mo97955d();
            }
            this.f78286N = false;
        }
        C25539a.m62079a().getECPlayerControllerService().mo52277a(this.f78325p);
        if (C31257z.m72969a(this.f78299ac)) {
            C47718bf.m103288a(new C30315ag(this.f78325p));
        }
        if (this.f78325p != null && this.f78325p.isAd()) {
            C26890h.onEvent(MobClick.obtain().setEventName("ad_show").setJsonObject(C23088c.m56631a().mo47824a("request_id", C23325e.m57379a().getRequestId(this.f78325p, this.f78278F.pageType)).mo47825b()).setExtValueString(this.f78325p.getAid()));
        }
        if (C31190f.m72841i(this.f78325p)) {
            C9432q.m18687b(this.f78324o, -83.0f);
        }
        if (C31190f.m72841i(this.f78325p)) {
            if (this.f78285M == null) {
                this.f78285M = new Runnable() {
                    public final void run() {
                    }
                };
            }
            this.feedReportVotell.postDelayed(this.f78285M, 100);
            C26890h.onEvent(MobClick.obtain().setEventName("show_review_ban").setLabelName("homepage_hot").setValue(this.f78325p.getAid()).setJsonObject(new C23088c().mo47824a("is_user_review", "1").mo47825b()));
        }
        this.f78287O.mo53073g();
        if (!C26469cc.m63996a(this.f78325p)) {
            C26373af.m63822a((ViewGroup) this.mWidgetContainer, (ViewGroup) this.tagLayout);
        }
        if (C26503d.m64070m(this.f78325p) || C26235d.m63570a(this.f78325p)) {
            m70212ap();
        }
        if (!this.f78298a) {
            if (TextUtils.isEmpty(this.f78325p.getExtra())) {
                this.mDebugInfoView.setVisibility(8);
            } else {
                this.mDebugInfoView.setVisibility(0);
                this.mDebugInfoView.setContent(this.f78325p.getExtra());
            }
        }
        if (C31257z.m72970a(mo60210aa())) {
            C25945k.m62922m().mo53897a(mo60197Z(), this.f78325p);
            C25945k.m62922m().mo53899b(mo60197Z(), this.f78325p);
        }
        if (!C23794bh.m58386a().getEventTypeHelper().mo47703a(mo60197Z(), mo60210aa())) {
            C47718bf.m103288a(new C30322am(mo60210aa(), C31257z.m72969a(this.f78299ac)));
        }
    }

    /* renamed from: a */
    public final void mo53525a(C50117f fVar) {
        if (C23729p.m58262a((View) this.mIvRelieveTag)) {
            AwemeProtectionServiceImpl.createIAwemeProtectionServicebyMonsterPlugin().getAntiAddictionService().mo83189a(this.f78325p);
        }
        this.f78516h.mo48228a("on_render_ready", (Object) null);
        this.f78287O.mo53089v();
        this.f78293U.mo90508a(this.f78325p);
        this.f78293U.mo90507a(mo60197Z());
        mo60370C();
    }

    /* renamed from: a */
    public final void mo53524a(C50112d dVar) {
        m70223i(3);
    }

    /* renamed from: a */
    public final void mo53527a(String str) {
        this.f78287O.mo53085r();
        if (this.f78299ac == 2 || this.f78284L || f78270Y < 980) {
            m70220g("onResumePlay");
        } else if (C30224d.m70967b()) {
            StringBuilder sb = new StringBuilder("onResumePlay without calling hideCover in ");
            sb.append(mo60210aa());
            sb.append(", sourceId is ");
            sb.append(str);
            C32458a.m75141a(4, "VideoViewHolder", sb.toString());
        }
        if (this.f78516h != null) {
            this.f78516h.mo48228a("in_video_view_holder", (Object) Boolean.valueOf(true));
        }
        if (!mo60371N()) {
            mo60232e(this.f78324o.getResources().getColor(R.color.ip));
        }
    }

    /* renamed from: a */
    public void mo53526a(C50118g gVar) {
        int i;
        this.f78323n = System.currentTimeMillis();
        BusinessComponentServiceUtils.getLabService();
        this.f78325p.getAid();
        m70220g("onRenderFirstFrame");
        this.f78284L = true;
        Aweme e = mo53999e();
        C52711k.m112240b(e, "aweme");
        IAccountUserService g = C20854a.m53167g();
        C52711k.m112236a((Object) g, "AccountProxyService.userService()");
        User curUser = g.getCurUser();
        SharePrefCache inst = SharePrefCache.inst();
        C52711k.m112236a((Object) inst, "SharePrefCache.inst()");
        C23051bf canCreateInsights = inst.getCanCreateInsights();
        C52711k.m112236a((Object) canCreateInsights, "SharePrefCache.inst().canCreateInsights");
        Object d = canCreateInsights.mo47782d();
        C52711k.m112236a(d, "SharePrefCache.inst().canCreateInsights.cache");
        boolean z = ((Boolean) d).booleanValue() && curUser != null && curUser.getIsCreater() && C47915gg.m103647a(e.getAuthorUid());
        int i2 = 3;
        if (z) {
            C23543g d2 = C23542f.m57719d();
            StringBuilder sb = new StringBuilder("enter_insights_");
            sb.append(C20854a.m53167g().getCurUserId());
            if (d2.mo48705a(sb.toString(), true) && ((!"message".equals(mo60210aa()) && !"chat".equals(mo60210aa()) && !"push".equals(mo60210aa())) || this.f78278F.cid == null)) {
                View findViewById = this.mRootView.findViewById(R.id.cmz);
                if (findViewById != null) {
                    StringBuilder sb2 = new StringBuilder("enter_insights_");
                    sb2.append(C20854a.m53167g().getCurUserId());
                    C23542f.m57719d().mo48710b(sb2.toString(), false);
                    if (this.f78318f == null) {
                        this.f78318f = new C39481c((Activity) this.f78324o);
                    }
                    this.f78318f.f100998m = true;
                    this.f78318f.mo80492a(false);
                    this.f78318f.f100999n = 4500;
                    this.f78318f.mo80486a((int) R.string.a1z);
                    this.f78318f.mo80491a(findViewById, 3, true, 0.0f);
                }
            }
        }
        mo60230d(this.f78325p);
        mo60374i(true);
        if (this.f78516h != null) {
            this.f78516h.mo48228a("in_video_view_holder", (Object) Boolean.valueOf(true));
        }
        if (this.f78327r.getActivity() != null && this.f78328s == 0 && C23794bh.m58388b().mo75669a() && TextUtils.equals(mo60210aa(), "homepage_follow")) {
            FollowPageFirstFrameViewModel.m103062a(this.f78327r.getActivity());
        }
        if (!(this.f78325p == null || this.f78325p.getVideo() == null)) {
            int l = C48121w.m104249M().mo95254l();
            int m = C48121w.m104249M().mo95255m();
            if (l <= 0 || m <= 0) {
                StringBuilder sb3 = new StringBuilder("video Player size is wrong, aid is ");
                sb3.append(C31190f.m72838f(this.f78325p));
                C32458a.m75141a(5, "VideoViewHolder", sb3.toString());
            } else {
                int width = this.f78325p.getVideo().getWidth();
                int height = this.f78325p.getVideo().getHeight();
                if (width <= 0 || height <= 0) {
                    i2 = 1;
                } else {
                    if ((width > height && l < m) || (width < height && l > m)) {
                        i2 = 2;
                    } else if (!C30074bl.m70502a(width, height, l, m)) {
                        i2 = 0;
                    }
                }
                if (i2 != 0) {
                    m70204a(i2, width, height, l, m);
                    if (C31257z.m72970a(mo60210aa())) {
                        i = C10193n.m20607a().mo18200a(FeedVideoViewResizeStrategySetting.class, "feed_video_view_resize_strategy", C10181b.m20511a().mo18175c().getFeedVideoViewResizeStrategy(), 1);
                    } else {
                        i = C10193n.m20607a().mo18200a(NonFeedVideoViewResizeStrategySetting.class, "non_feed_video_view_resize_strategy", C10181b.m20511a().mo18175c().getNonFeedVideoViewResizeStrategy(), 1);
                    }
                    if (i < i2) {
                        C32458a.m75141a(5, "VideoViewHolder", "video_view_size_mismatch, but current strategy does not handle it");
                    } else {
                        m70213c(l, m);
                    }
                }
            }
        }
        if (this.f78297Z != null) {
            VideoViewLandscapeHelper videoViewLandscapeHelper = this.f78297Z;
            videoViewLandscapeHelper.f81235q.removeCallbacks(videoViewLandscapeHelper.f81233o);
            if (videoViewLandscapeHelper.f81223e && !videoViewLandscapeHelper.mo63796a()) {
                videoViewLandscapeHelper.f81235q.postDelayed(videoViewLandscapeHelper.f81233o, 5000);
            }
        }
        C0013i.m18a((Callable<TResult>) new C30003c<TResult>(this.mRootView, this.mCoverView, this.f78325p.getAid()), C0013i.f25b);
        C0013i.m12a(200);
    }

    /* renamed from: a */
    public final void mo54503a(int i, int i2) {
        this.f78290R = true;
        if (!(mo60197Z() instanceof C45690c) || !((C45690c) mo60197Z()).isSplashShowing()) {
            m70226j(0);
            mo60370C();
        }
    }

    /* renamed from: a */
    public final void mo60205a(Video video, boolean z, int i) {
        if (this.f78317e != null) {
            this.f78317e.mo60205a(video, z, i);
        }
    }

    /* renamed from: a */
    public final void mo60204a(Video video) {
        if (this.f78317e != null) {
            this.f78317e.mo60204a(video);
        }
    }

    /* renamed from: a */
    public final void mo60207a(C38871j jVar) {
        if (this.f78317e != null) {
            this.f78317e.mo60207a(jVar);
        }
    }

    /* renamed from: a */
    public void onChanged(C23274a aVar) {
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            switch (str.hashCode()) {
                case -1618328215:
                    if (str.equals("video_digg")) {
                        c = 2;
                        break;
                    }
                    break;
                case -1616128562:
                    if (str.equals("to_vs_fragment")) {
                        c = 7;
                        break;
                    }
                    break;
                case -777668341:
                    if (str.equals("update_diig_view")) {
                        c = 1;
                        break;
                    }
                    break;
                case -717027742:
                    if (str.equals("video_more_click")) {
                        c = 6;
                        break;
                    }
                    break;
                case -492284990:
                    if (str.equals("video_comment_list")) {
                        c = 3;
                        break;
                    }
                    break;
                case -162745511:
                    if (str.equals("feed_internal_event")) {
                        c = 0;
                        break;
                    }
                    break;
                case -144973899:
                    if (str.equals("title_view_click")) {
                        c = 8;
                        break;
                    }
                    break;
                case 1181771620:
                    if (str.equals("video_share_click")) {
                        c = 5;
                        break;
                    }
                    break;
                case 1964086245:
                    if (str.equals("to_profile")) {
                        c = 4;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    if (this.f78319g != null) {
                        this.f78319g.mo60714a(aVar.mo48246a());
                        return;
                    }
                    break;
                case 1:
                    if (((Boolean) aVar.mo48246a()).booleanValue()) {
                        this.f78287O.mo53087t();
                        if (C47934o.m103707a(this.f78325p) && C25945k.m62913d().isShowCommerceAfterInteraction()) {
                            this.f78287O.mo53043a(C25945k.m62913d().getDelayTimeAfterInteraction() * 1000, "passive_show");
                            return;
                        } else if (C26503d.m64073p(this.f78325p)) {
                            this.f78287O.mo53043a(C26503d.m64074q(this.f78325p) * 1000, "passive_show");
                            return;
                        }
                    }
                    break;
                case 2:
                    m70226j(((Integer) aVar.mo48246a()).intValue());
                    return;
                case 3:
                    m70226j(((Integer) aVar.mo48246a()).intValue());
                    if (this.mRootView != null) {
                        this.mRootView.setBackgroundColor(this.f78324o.getResources().getColor(R.color.ip));
                        return;
                    }
                    break;
                case 4:
                    m70224i((String) aVar.mo48246a());
                    return;
                case 5:
                    if (!C47950q.m103752a(this.f78325p) || this.f78325p.isCollected()) {
                        C47462h hVar = C47462h.f119724a;
                        C47462h.m102819e().storeBoolean("key_user_shared", true);
                        m70226j(3);
                        return;
                    }
                    C10691a.m21542b(mo60197Z(), (int) R.string.ffs).mo19066a();
                    return;
                case 6:
                    if (!C47950q.m103752a(this.f78325p) || this.f78325p.isCollected()) {
                        m70226j(49);
                        return;
                    } else {
                        C10691a.m21542b(mo60197Z(), (int) R.string.ffs).mo19066a();
                        return;
                    }
                case 7:
                    mo60195W();
                    m70226j(40);
                    return;
                case 8:
                    if (!this.f78287O.mo53068d() && !C47915gg.m103651b() && !C36330a.m81964a(this.f78325p)) {
                        if (this.f78325p == null || (this.f78325p.isCanPlay() && !this.f78325p.isDelete())) {
                            if (this.f78325p.getAuthor() != null || C26469cc.m63997a(this.f78325p, 3)) {
                                m70226j(18);
                                this.f78287O.mo53069e();
                                ((C23249s) ((C23249s) ((C23249s) new C23249s().mo48136c(this.f78325p, this.f78278F.pageType).mo48137c(mo60210aa()).mo48143h(FeedParamProvider.m71941a(this.f78324o).getPreviousPage()).mo47941a("click_name")).mo48098a(Boolean.valueOf(C31190f.m72834b(this.f78325p)))).mo47940a(mo60197Z())).mo48076e();
                                C23248r rVar = new C23248r();
                                Aweme aweme = this.f78325p;
                                if (aweme != null) {
                                    rVar.f62084b = aweme.getAid();
                                    rVar.f62085c = aweme.getRequestId();
                                    rVar.f62083a = aweme.getAuthorUid();
                                }
                                rVar.mo48071a(aweme);
                                rVar.mo48134c(mo60210aa()).mo48133b(this.f78325p.getAuthorUid()).mo48076e();
                                C30578o.m71566a(C29988ad.PROFILE);
                                m70224i("");
                                break;
                            }
                        } else {
                            C10691a.m21542b(this.f78324o, (int) R.string.fc_).mo19066a();
                            return;
                        }
                    } else {
                        return;
                    }
                    break;
            }
        }
    }

    /* renamed from: a */
    public final void mo60209a(Map<String, AwemeStatisticsBackup> map, int i) {
        if (this.f78325p == null || map == null || map.size() == 0) {
            C32458a.m75148a((Throwable) new IllegalArgumentException("list is empty,should never happen!"));
            return;
        }
        for (int i2 = 0; i2 < map.size(); i2++) {
            String aid = this.f78325p.getAid();
            if (!(((AwemeStatisticsBackup) map.get(aid)) == null || this.f78516h == null)) {
                StringBuilder sb = new StringBuilder("aid:");
                sb.append(aid);
                sb.append(".start to update statistics!");
                C32458a.m75141a(4, "FeedBackupHelper", sb.toString());
                this.f78516h.mo48228a("awesome_update_backup_data", (Object) this.f78279G);
            }
        }
    }

    /* renamed from: a */
    public final void mo60199a(long j) {
        BusinessComponentServiceUtils.getBusinessBridgeService().mo49724b();
        mo60210aa();
    }

    /* renamed from: N */
    private boolean mo60371N() {
        if (this.f78296X == 0) {
            return true;
        }
        return false;
    }

    /* renamed from: ab */
    public final boolean mo60211ab() {
        return this.f78327r.getUserVisibleHint();
    }

    /* renamed from: p */
    public final void mo60246p() {
        mo60178A();
        mo60179B();
    }

    /* renamed from: v */
    public final boolean mo60252v() {
        return this.f78321l.mo97954c();
    }

    /* renamed from: w */
    public final Surface mo60253w() {
        return this.f78321l.mo97952b();
    }

    /* renamed from: x */
    public final View mo60254x() {
        return this.f78321l.mo97949a();
    }

    /* renamed from: P */
    private boolean mo60373P() {
        if (this.f78325p == null || !this.f78325p.isAd()) {
            return false;
        }
        return true;
    }

    /* renamed from: l */
    private boolean mo60375l() {
        if (this.f78321l.mo97958g() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: H */
    public final void mo60183H() {
        if (C48121w.m104249M().mo95257o()) {
            m70209am();
        }
    }

    /* renamed from: I */
    public final C29984ac mo60184I() {
        if (this.f78308al) {
            return new C30066be(this);
        }
        return null;
    }

    /* renamed from: K */
    public final void mo60186K() {
        this.f78516h.mo48228a("video_show_share_guide_animation", (Object) null);
    }

    /* renamed from: L */
    public final void mo60187L() {
        this.f78516h.mo48228a("video_show_share_panel_guide_animation", (Object) null);
    }

    /* renamed from: Q */
    public final void mo60189Q() {
        this.f78516h.mo48228a("video_hide_share_panel_guide_animation", (Object) null);
    }

    /* renamed from: R */
    public final void mo60190R() {
        if (this.f78325p != null) {
            this.mRestrictTextView.mo85685a(this.f78325p.getAid());
        }
    }

    /* renamed from: T */
    public final void mo60192T() {
        if (this.f78318f != null) {
            this.f78318f.dismiss();
            this.f78318f = null;
        }
        mo60195W();
    }

    /* renamed from: V */
    public final void mo60194V() {
        if (this.f78516h != null) {
            this.f78516h.mo48228a("show_festival_activity_icon", (Object) null);
        }
    }

    /* renamed from: W */
    public final void mo60195W() {
        if (this.f78293U != null) {
            this.f78293U.mo90517g();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aa */
    public final String mo60210aa() {
        if (this.f78278F.eventType == null) {
            return "";
        }
        return this.f78278F.eventType;
    }

    /* renamed from: ad */
    public final void mo60213ad() {
        if (this.f78317e != null) {
            this.f78317e.mo60213ad();
        }
    }

    /* renamed from: ae */
    public final void mo60214ae() {
        if (this.f78317e != null) {
            this.f78317e.mo60214ae();
        }
    }

    /* renamed from: af */
    public final void mo60215af() {
        if (this.f78317e != null) {
            this.f78317e.mo60215af();
        }
    }

    /* renamed from: ag */
    public final void mo60216ag() {
        if (this.f78317e != null) {
            this.f78317e.mo60216ag();
        }
    }

    /* renamed from: ah */
    public final long mo60217ah() {
        if (this.f78317e != null) {
            return this.f78317e.mo60217ah();
        }
        return 0;
    }

    /* renamed from: ai */
    public final void mo60218ai() {
        if (this.f78317e != null) {
            this.f78317e.mo60218ai();
        }
    }

    /* renamed from: aj */
    public final C38866g mo60219aj() {
        if (this.f78317e != null) {
            return this.f78317e.mo60219aj();
        }
        return null;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: al */
    public final /* synthetic */ Long mo60221al() {
        return Long.valueOf(System.currentTimeMillis() - this.f78323n);
    }

    /* renamed from: c */
    public final int mo53997c() {
        if (this.f78325p != null) {
            return this.f78325p.getAwemeType();
        }
        return 0;
    }

    /* renamed from: f */
    public void mo54000f() {
        mo60195W();
        this.f78516h.mo48228a("video_on_pause", (Object) null);
    }

    /* renamed from: h */
    public void mo54002h() {
        this.f78287O.mo53084q();
    }

    /* renamed from: y */
    public final void mo60255y() {
        m70209am();
        this.f78287O.mo53085r();
    }

    /* renamed from: C */
    private void mo60370C() {
        C48021h M = C48121w.m104249M();
        this.f78293U.mo90508a(this.f78325p);
        this.f78293U.f112786f = M;
        this.f78293U.f112787g = null;
        this.f78293U.mo90513c();
    }

    /* renamed from: Y */
    public static boolean m70201Y() {
        if (!C48121w.m104087I()) {
            return C48121w.m104249M().mo95257o();
        }
        return C50130a.m108170a().mo97926b();
    }

    /* renamed from: an */
    private void m70210an() {
        if (this.f78516h != null) {
            this.f78516h.mo48228a("stopPlayAnimation", (Object) Boolean.valueOf(true));
        }
        this.f78287O.mo53083p();
    }

    /* renamed from: A */
    public final void mo60178A() {
        if (mo60375l()) {
            View x = mo60254x();
            if (x.getVisibility() != 0) {
                C23729p.m58257a(x, 0);
            }
        }
    }

    /* renamed from: ac */
    public final AbsInteractStickerWidget mo60212ac() {
        AbsInteractStickerWidget a = C23794bh.m58404r().mo92586a();
        a.mo90664a((C44626f) this);
        this.f78276D.mo48250a((int) R.id.auf, (Widget) a);
        return a;
    }

    /* renamed from: ak */
    public final long mo60220ak() {
        if (!C48121w.m104087I()) {
            return C48121w.m104249M().mo95256n();
        }
        if (this.f78317e != null) {
            return this.f78317e.mo97921c();
        }
        return 0;
    }

    /* renamed from: o */
    public final void mo60244o() {
        if (this.f78304ah) {
            m70219g(this.f78325p);
            m70217f(this.f78325p);
        }
        if (this.f78516h != null) {
            this.f78516h.mo48228a("on_viewpager_page_selected", (Object) null);
        }
    }

    /* renamed from: t */
    public final void mo60250t() {
        if (mo60375l()) {
            this.f78321l.mo97949a().setVisibility(8);
        }
    }

    /* renamed from: O */
    private void mo60372O() {
        this.f78326q = m70203a(this.f78325p, this.f78278F, this.f78518j);
        this.f78287O.mo53055a(this.f78326q);
        if (this.f78303ag) {
            C30255o.f79039a.mo60617a(new C30256p(true, new Runnable() {
                public final void run() {
                    VideoViewHolder.this.f78279G.setRequestId(VideoViewHolder.this.f78326q);
                }
            }));
        } else {
            this.f78279G.setRequestId(this.f78326q);
        }
    }

    /* renamed from: ao */
    private boolean m70211ao() {
        if (C36512b.m82421a().f93584a || ((C31257z.m72971b(mo60210aa()) && C36512b.m82421a().f93585b) || (this.f78278F.param.isHotSpot() && CleanModeManager2.m82255b(mo60197Z())))) {
            return true;
        }
        return false;
    }

    /* renamed from: G */
    public final void mo60182G() {
        if (this.mRootView != null) {
            mo60232e(this.f78324o.getResources().getColor(R.color.ip));
        }
        if (C48121w.m104249M().mo95257o()) {
            m70210an();
        }
    }

    /* renamed from: S */
    public final int[] mo60191S() {
        if (this.f78325p == null || this.f78325p.getAuthor() == null || this.f78325p.getAuthor().getFollowStatus() != 0) {
            return null;
        }
        int[] iArr = new int[2];
        View findViewById = this.mAvatarLayout.findViewById(R.id.ai0);
        if (findViewById == null) {
            return null;
        }
        findViewById.getLocationOnScreen(iArr);
        return iArr;
    }

    public final void aD_() {
        if (this.f78290R) {
            this.f78290R = false;
            if (mo60375l() && this.f78281I && !C48121w.m104087I()) {
                C48121w.m104249M().mo95286b((Surface) null);
            }
        }
    }

    public void aw_() {
        super.aw_();
        C23794bh.m58402p().mo51278a(this.f78325p.getAid());
        if (C31186b.m72812a(this.f78325p)) {
            C25945k.m62917h().mo52101a(this.f78325p);
        }
        this.f78287O.mo53079m();
        if (this.f78293U != null) {
            AbsInteractStickerWidget absInteractStickerWidget = this.f78293U.f112793m;
            if (absInteractStickerWidget != null) {
                absInteractStickerWidget.mo90672f();
            }
        }
    }

    /* renamed from: ap */
    private void m70212ap() {
        int i;
        if (!this.f78277E) {
            if (!C22453b.m55505a().f60473k || (((C26503d.m64070m(this.f78325p) && !C26503d.m64072o(this.f78325p)) || (C26235d.m63570a(this.f78325p) && !C26235d.m63573d(this.f78325p))) && !C25945k.m62918i().mo53867g())) {
                i = 0;
            } else {
                i = -C22453b.m55505a().mo46745b();
            }
            this.f78309am = i;
            if (C22453b.m55510c()) {
                i += C22453b.f60461a;
            }
            C47718bf.m103288a(new C30335d(!C22453b.m55505a().f60473k));
            LayoutParams layoutParams = (LayoutParams) this.mWidgetContainer.getLayoutParams();
            layoutParams.bottomMargin = i;
            this.mWidgetContainer.setLayoutParams(layoutParams);
            m70207a(C22453b.m55505a().f60475m, C22453b.m55505a().f60476n);
        }
    }

    /* renamed from: B */
    public final void mo60179B() {
        if (mo60375l()) {
            View x = mo60254x();
            C9379e eVar = (C9379e) f78271aa.get(this.f78324o);
            if (eVar != null) {
                Iterator it = eVar.iterator();
                while (it.hasNext()) {
                    SurfaceView surfaceView = (SurfaceView) it.next();
                    if (surfaceView != x) {
                        C23729p.m58257a((View) surfaceView, 8);
                    }
                }
            }
            C9379e eVar2 = (C9379e) f78272ab.get(this.f78324o);
            if (eVar2 != null) {
                Iterator it2 = eVar2.iterator();
                while (it2.hasNext()) {
                    VideoViewHolder videoViewHolder = (VideoViewHolder) it2.next();
                    if (videoViewHolder != this && ((videoViewHolder.f78328s == this.f78328s - 1 || videoViewHolder.f78328s == this.f78328s + 1) && videoViewHolder.f78325p != null)) {
                        videoViewHolder.m70215d(videoViewHolder.f78325p.getVideo());
                    }
                }
            }
        }
    }

    /* renamed from: U */
    public final void mo60193U() {
        C30188c cVar = this.f78329t;
        if (cVar.f78784d != null && cVar.f78784d.getFloatingCardInfo() != null && !cVar.f78784d.isAd()) {
            cVar.mo60482a();
            if (cVar.f78782b.getVisibility() != 0) {
                cVar.f78782b.setVisibility(0);
            }
            cVar.f78783c.animate().translationX((float) (-C23729p.m58268c((View) cVar.f78783c).right)).alpha(0.0f).setDuration(200).withEndAction(new C30193h(cVar, 200)).start();
        }
    }

    /* renamed from: am */
    private void m70209am() {
        long j;
        if (this.f78516h != null) {
            this.f78516h.mo48228a("startPlayAnimation", (Object) Boolean.valueOf(true));
        }
        if ((C26503d.m64070m(this.f78325p) && !C26503d.m64072o(this.f78325p)) || (C26235d.m63570a(this.f78325p) && !C26235d.m63573d(this.f78325p))) {
            mo60238g(2);
            if (this.f78333x == null || !this.f78333x.isRunning()) {
                this.f78333x = new AnimatorSet();
                this.f78333x.play(ObjectAnimator.ofFloat(this.mGradualBottomView, "alpha", new float[]{0.0f, 1.0f})).with(ObjectAnimator.ofFloat(this.mGradualTopView, "alpha", new float[]{0.0f, 1.0f})).with(ObjectAnimator.ofFloat(this.mWidgetContainer, "alpha", new float[]{0.0f, 1.0f}));
                this.f78333x.setStartDelay(260);
                this.f78333x.setDuration(430);
                this.f78333x.addListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        if (VideoViewHolder.this.f78332w) {
                            VideoViewHolder.this.mo60238g(4);
                        }
                    }
                });
            }
            if (this.f78291S == null || this.f78291S.f78348a) {
                this.f78291S = new C30001a(this.f78325p);
                if (C26235d.m63570a(this.f78325p)) {
                    LiveAwesomeSplashInfo f = C26235d.m63575f(this.f78325p);
                    if (f != null) {
                        j = (long) (f.getFeedShowTime() * 1000);
                    } else {
                        j = 0;
                    }
                } else {
                    j = (long) C26503d.m64075r(this.f78325p);
                }
                this.mRootView.postDelayed(this.f78291S, j);
            }
        } else if (C31257z.m72969a(this.f78299ac) && !this.f78282J) {
            mo60200a((View) this.mWidgetContainer, m70211ao());
        }
    }

    /* renamed from: g */
    public void mo54001g() {
        if (this.f78516h != null) {
            this.f78516h.mo48228a("stopPlayAnimation", (Object) Boolean.valueOf(true));
        }
        mo60240h(false);
        this.f78293U.mo90508a(this.f78325p);
        this.f78293U.mo90514d();
        C47588a.m103036c().mo94911b().removeObserver(this.f78313aq);
    }

    /* renamed from: i */
    public void mo54003i() {
        this.f78332w = false;
        C25945k.m62918i().mo53860a(true);
        if (C26235d.m63571b(this.f78325p) && C31205q.f81645b && C31205q.f81646c != null) {
            C31205q.f81646c.cancel();
            C31205q.f81645b = false;
            for (C31207a aVar : C31205q.f81644a) {
                if (aVar != null) {
                    aVar.mo60267b();
                }
            }
            C31205q.f81644a.clear();
        }
        this.f78287O.mo53074h();
        this.f78516h.mo48228a("hide_commerce_second_info", (Object) null);
        C30188c cVar = this.f78329t;
        if (!(cVar.f78784d == null || cVar.f78784d.getFloatingCardInfo() == null)) {
            cVar.mo60483a(0);
        }
        if (C31186b.m72812a(this.f78325p)) {
            C25945k.m62917h().mo52100a(mo60197Z(), this.f78325p, mo60254x(), false);
        }
        this.f78516h.mo48228a("on_page_unselected", (Object) Boolean.valueOf(true));
        C47718bf.m103288a(new C25065b(this.f78325p.getAid()));
        mo60374i(false);
        if (C26503d.m64070m(this.f78325p) || C26235d.m63570a(this.f78325p)) {
            mo60238g(4);
        }
        if (this.f78291S != null) {
            this.f78291S.f78348a = true;
            this.f78291S = null;
        }
        if (this.f78333x != null) {
            this.f78333x.cancel();
            this.f78333x = null;
        }
        C26373af.m63821a(this.tagLayout);
        mo60218ai();
        C25945k.m62922m().mo53898a(false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:80:0x030e, code lost:
        if (r0.mo94739a(r4, java.lang.Long.parseLong((java.lang.String) r2)) != false) goto L_0x0310;
     */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo60241k() {
        /*
            r15 = this;
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r15.f78516h
            java.lang.String r1 = "feed_internal_event"
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r0.mo48226a(r1, r15)
            java.lang.String r1 = "to_profile"
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r0.mo48226a(r1, r15)
            java.lang.String r1 = "update_diig_view"
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r0.mo48226a(r1, r15)
            java.lang.String r1 = "video_comment_list"
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r0.mo48226a(r1, r15)
            java.lang.String r1 = "video_share_click"
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r0.mo48226a(r1, r15)
            java.lang.String r1 = "video_more_click"
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r0.mo48226a(r1, r15)
            java.lang.String r1 = "video_digg"
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r0.mo48226a(r1, r15)
            java.lang.String r1 = "title_view_click"
            r0.mo48226a(r1, r15)
            com.ss.android.ugc.aweme.feed.adapter.al r0 = com.p683ss.android.ugc.aweme.feed.service.C30687a.m71968b()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r0 = r0.mo60295b()
            if (r0 == 0) goto L_0x0043
            com.ss.android.ugc.aweme.arch.widgets.base.d r1 = r15.f78517i
            r2 = 2132024595(0x7f141d13, float:1.968767E38)
            r1.mo48255b(r2, r0)
        L_0x0043:
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r15.f78517i
            r1 = 2132024539(0x7f141cdb, float:1.9687557E38)
            com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB> r3 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB.class
            r4 = 1
            java.lang.String r5 = "widget_open"
            r6 = 31744(0x7c00, float:4.4483E-41)
            r7 = 0
            boolean r2 = r2.mo18172a(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x0062
            com.ss.android.ugc.aweme.feed.feedwidget.VideoDescWidget r2 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoDescWidget
            r2.<init>(r15)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r2
            goto L_0x0069
        L_0x0062:
            com.ss.android.ugc.aweme.common.widget.OriginVideoDescWidget r2 = new com.ss.android.ugc.aweme.common.widget.OriginVideoDescWidget
            r2.<init>(r15)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r2
        L_0x0069:
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r0.mo48255b(r1, r2)
            r1 = 2132019016(0x7f140748, float:1.9676355E38)
            com.ss.android.ugc.aweme.feed.adapter.al r2 = com.p683ss.android.ugc.aweme.feed.service.C30687a.m71968b()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = r2.mo60293a()
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r0.mo48255b(r1, r2)
            r1 = 2132018558(0x7f14057e, float:1.9675426E38)
            java.lang.String r3 = r15.mo60210aa()
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r2 = r15.f78278F
            java.lang.String r2 = r2.getPreviousPage()
            if (r2 != 0) goto L_0x008f
            java.lang.String r2 = ""
        L_0x008d:
            r4 = r2
            goto L_0x0096
        L_0x008f:
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r2 = r15.f78278F
            java.lang.String r2 = r2.getPreviousPage()
            goto L_0x008d
        L_0x0096:
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r2 = r15.f78278F
            com.ss.android.ugc.aweme.feed.param.b r2 = r2.param
            java.lang.String r2 = r2.getObjectId()
            if (r2 != 0) goto L_0x00a4
            java.lang.String r2 = ""
        L_0x00a2:
            r5 = r2
            goto L_0x00ad
        L_0x00a4:
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r2 = r15.f78278F
            com.ss.android.ugc.aweme.feed.param.b r2 = r2.param
            java.lang.String r2 = r2.getObjectId()
            goto L_0x00a2
        L_0x00ad:
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r2 = r15.f78278F
            com.ss.android.ugc.aweme.feed.param.b r2 = r2.param
            java.lang.String r2 = r2.getCardType()
            if (r2 != 0) goto L_0x00bb
            java.lang.String r2 = ""
        L_0x00b9:
            r6 = r2
            goto L_0x00c4
        L_0x00bb:
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r2 = r15.f78278F
            com.ss.android.ugc.aweme.feed.param.b r2 = r2.param
            java.lang.String r2 = r2.getCardType()
            goto L_0x00b9
        L_0x00c4:
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r2 = r15.f78278F
            com.ss.android.ugc.aweme.feed.param.b r2 = r2.param
            java.lang.String r2 = r2.getCreationId()
            if (r2 != 0) goto L_0x00d2
            java.lang.String r2 = ""
        L_0x00d0:
            r7 = r2
            goto L_0x00db
        L_0x00d2:
            com.ss.android.ugc.aweme.feed.model.BaseFeedPageParams r2 = r15.f78278F
            com.ss.android.ugc.aweme.feed.param.b r2 = r2.param
            java.lang.String r2 = r2.getCreationId()
            goto L_0x00d0
        L_0x00db:
            com.ss.android.ugc.aweme.feed.adapter.bd r2 = new com.ss.android.ugc.aweme.feed.adapter.bd
            r2.<init>(r15)
            java.lang.String r8 = "eventType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r3, r8)
            java.lang.String r8 = "poiobjectId"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r8)
            java.lang.String r8 = "poiRegionType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r6, r8)
            java.lang.String r8 = "creationId"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r8)
            java.lang.String r8 = "infoProvider"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r8)
            com.bytedance.ies.abmock.b r9 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB> r10 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB.class
            r11 = 1
            java.lang.String r12 = "widget_open"
            r13 = 31744(0x7c00, float:4.4483E-41)
            r14 = 0
            boolean r8 = r9.mo18172a(r10, r11, r12, r13, r14)
            if (r8 == 0) goto L_0x011b
            com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget r9 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget
            com.ss.android.ugc.aweme.feed.ui.b$a r8 = new com.ss.android.ugc.aweme.feed.ui.b$a
            r8.<init>(r2)
            com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget$a r8 = (com.p683ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidget.C30236a) r8
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r9 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r9
            goto L_0x012a
        L_0x011b:
            com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidgetV1 r9 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidgetV1
            com.ss.android.ugc.aweme.feed.ui.b$b r8 = new com.ss.android.ugc.aweme.feed.ui.b$b
            r8.<init>(r2)
            com.ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidgetV1$a r8 = (com.p683ss.android.ugc.aweme.feed.feedwidget.VideoDiggWidgetV1.C30237a) r8
            r2 = r9
            r2.<init>(r3, r4, r5, r6, r7, r8)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r9 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r9
        L_0x012a:
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r0.mo48255b(r1, r9)
            android.widget.FrameLayout r1 = r15.mBottomView
            com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB> r3 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB.class
            r4 = 1
            java.lang.String r5 = "widget_open"
            r6 = 31744(0x7c00, float:4.4483E-41)
            r7 = 0
            boolean r2 = r2.mo18172a(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x014a
            com.ss.android.ugc.aweme.feed.feedwidget.VideoProgressBarWidget r2 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoProgressBarWidget
            r2.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r2
            goto L_0x0151
        L_0x014a:
            com.ss.android.ugc.aweme.feed.feedwidget.VideoProgressBarWidgetV1 r2 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoProgressBarWidgetV1
            r2.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r2
        L_0x0151:
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r0.mo48251a(r1, r2)
            r1 = 2132018179(0x7f140403, float:1.9674657E38)
            com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB> r3 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB.class
            r4 = 1
            java.lang.String r5 = "widget_open"
            r6 = 31744(0x7c00, float:4.4483E-41)
            r7 = 0
            boolean r2 = r2.mo18172a(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x0172
            com.ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidget r2 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidget
            r2.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r2
            goto L_0x0179
        L_0x0172:
            com.ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidgetV1 r2 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoCommentWidgetV1
            r2.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r2
        L_0x0179:
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r0.mo48255b(r1, r2)
            r1 = 2132022755(0x7f1415e3, float:1.9683939E38)
            com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB> r3 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB.class
            r4 = 1
            java.lang.String r5 = "widget_open"
            r6 = 31744(0x7c00, float:4.4483E-41)
            r7 = 0
            boolean r2 = r2.mo18172a(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x019a
            com.ss.android.ugc.aweme.feed.feedwidget.VideoShareWidget r2 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoShareWidget
            r2.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r2
            goto L_0x01a1
        L_0x019a:
            com.ss.android.ugc.aweme.feed.feedwidget.VideoShareWidgetV1 r2 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoShareWidgetV1
            r2.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r2
        L_0x01a1:
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r0.mo48255b(r1, r2)
            r1 = 2132021111(0x7f140f77, float:1.9680604E38)
            com.ss.android.ugc.aweme.feed.feedwidget.VideoMoreWidget r2 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoMoreWidget
            r2.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r2
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r0.mo48255b(r1, r2)
            android.widget.FrameLayout r1 = r15.mBottomView
            com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB> r3 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB.class
            r4 = 1
            java.lang.String r5 = "widget_open"
            r6 = 31744(0x7c00, float:4.4483E-41)
            r7 = 0
            boolean r2 = r2.mo18172a(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x01cf
            com.ss.android.ugc.aweme.feed.feedwidget.VideoAntiAddictionWidget r2 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoAntiAddictionWidget
            r2.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r2
            goto L_0x01d6
        L_0x01cf:
            com.ss.android.ugc.aweme.feed.feedwidget.VideoAntiAddictionWidgetV1 r2 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoAntiAddictionWidgetV1
            r2.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r2
        L_0x01d6:
            r0.mo48251a(r1, r2)
            int r0 = com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment.m70953a()
            if (r0 != 0) goto L_0x0208
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r15.f78517i
            r1 = 2132017533(0x7f14017d, float:1.9673347E38)
            com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB> r3 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB.class
            r4 = 1
            java.lang.String r5 = "widget_open"
            r6 = 31744(0x7c00, float:4.4483E-41)
            r7 = 0
            boolean r2 = r2.mo18172a(r3, r4, r5, r6, r7)
            if (r2 == 0) goto L_0x01fe
            com.ss.android.ugc.aweme.feed.feedwidget.FeedAvatarWidget r2 = new com.ss.android.ugc.aweme.feed.feedwidget.FeedAvatarWidget
            r2.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r2
            goto L_0x0205
        L_0x01fe:
            com.ss.android.ugc.aweme.feed.feedwidget.FeedAvatarWidgetV1 r2 = new com.ss.android.ugc.aweme.feed.feedwidget.FeedAvatarWidgetV1
            r2.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r2
        L_0x0205:
            r0.mo48255b(r1, r2)
        L_0x0208:
            com.bytedance.ies.abmock.b r3 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB> r4 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB.class
            r5 = 1
            java.lang.String r6 = "widget_open"
            r7 = 31744(0x7c00, float:4.4483E-41)
            r8 = 0
            boolean r0 = r3.mo18172a(r4, r5, r6, r7, r8)
            r15.f78303ag = r0
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetInTimeAB> r2 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetInTimeAB.class
            r3 = 1
            java.lang.String r4 = "widget_in_time_open"
            r5 = 31744(0x7c00, float:4.4483E-41)
            r6 = 0
            boolean r0 = r1.mo18172a(r2, r3, r4, r5, r6)
            r15.f78304ah = r0
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r15.f78517i
            r1 = 2132020385(0x7f140ca1, float:1.9679132E38)
            android.view.View$OnTouchListener r2 = r15.f78294V
            com.bytedance.ies.abmock.b r3 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB> r4 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB.class
            r5 = 1
            java.lang.String r6 = "widget_open"
            boolean r3 = r3.mo18172a(r4, r5, r6, r7, r8)
            if (r3 == 0) goto L_0x0258
            int r3 = com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment.m70953a()
            if (r3 != 0) goto L_0x0250
            com.ss.android.ugc.aweme.feed.feedwidget.VideoAuthorInfoWidget r3 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoAuthorInfoWidget
            r3.<init>(r2)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r3 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r3
            goto L_0x025f
        L_0x0250:
            com.ss.android.ugc.aweme.feed.feedwidget.VideoAuthorInfoWidgetV1 r3 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoAuthorInfoWidgetV1
            r3.<init>(r2)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r3 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r3
            goto L_0x025f
        L_0x0258:
            com.ss.android.ugc.aweme.feed.feedwidget.VideoAuthorInfoWidgetV1 r3 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoAuthorInfoWidgetV1
            r3.<init>(r2)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r3 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r3
        L_0x025f:
            r0.mo48255b(r1, r3)
            com.ss.android.ugc.aweme.commercialize.feed.al r0 = r15.f78287O
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r1 = r15.f78516h
            r0.mo53048a(r1)
            com.ss.android.ugc.aweme.commercialize.feed.al r0 = r15.f78287O
            com.ss.android.ugc.aweme.arch.widgets.base.d r1 = r15.f78517i
            r0.mo53049a(r1)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r0 = r15.f78301ae
            if (r0 != 0) goto L_0x02a1
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB> r2 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB.class
            r3 = 1
            java.lang.String r4 = "widget_open"
            r5 = 31744(0x7c00, float:4.4483E-41)
            r6 = 0
            boolean r0 = r1.mo18172a(r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x028e
            com.ss.android.ugc.aweme.feed.feedwidget.VideoMusicTitleWidget r0 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoMusicTitleWidget
            r0.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r0 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r0
            goto L_0x0295
        L_0x028e:
            com.ss.android.ugc.aweme.feed.feedwidget.VideoMusicTitleWidgetV1 r0 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoMusicTitleWidgetV1
            r0.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r0 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r0
        L_0x0295:
            r15.f78301ae = r0
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r15.f78517i
            r1 = 2132024542(0x7f141cde, float:1.9687563E38)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = r15.f78301ae
            r0.mo48255b(r1, r2)
        L_0x02a1:
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r0 = r15.f78302af
            if (r0 != 0) goto L_0x02d2
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB> r2 = com.p683ss.android.ugc.aweme.feed.feedwidget.widgetcore.WidgetAsyncAB.class
            r3 = 1
            java.lang.String r4 = "widget_open"
            r5 = 31744(0x7c00, float:4.4483E-41)
            r6 = 0
            boolean r0 = r1.mo18172a(r2, r3, r4, r5, r6)
            if (r0 == 0) goto L_0x02bf
            com.ss.android.ugc.aweme.feed.feedwidget.VideoMusicCoverWidget r0 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoMusicCoverWidget
            r0.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r0 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r0
            goto L_0x02c6
        L_0x02bf:
            com.ss.android.ugc.aweme.feed.feedwidget.VideoMusicCoverWidgetV1 r0 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoMusicCoverWidgetV1
            r0.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r0 = (com.p683ss.android.ugc.aweme.arch.widgets.base.Widget) r0
        L_0x02c6:
            r15.f78302af = r0
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r15.f78517i
            r1 = 2132024541(0x7f141cdd, float:1.968756E38)
            com.ss.android.ugc.aweme.arch.widgets.base.Widget r2 = r15.f78302af
            r0.mo48255b(r1, r2)
        L_0x02d2:
            com.ss.android.ugc.aweme.ug.guide.h r0 = com.p683ss.android.ugc.aweme.p2377ug.guide.C47462h.f119724a
            com.bytedance.keva.Keva r1 = com.p683ss.android.ugc.aweme.p2377ug.guide.C47462h.m102819e()
            java.lang.String r2 = "key_user_active_record"
            r3 = 0
            java.lang.String[] r4 = new java.lang.String[r3]
            java.lang.String[] r1 = r1.getStringArray(r2, r4)
            java.lang.String r2 = "keva().getStringArray(KE…ACTIVE_RECORD, arrayOf())"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            java.util.List r1 = p2628d.p2629a.C52568f.m112085f(r1)
            int r2 = r1.size()
            r4 = 4
            if (r2 >= r4) goto L_0x0335
            long r4 = java.lang.System.currentTimeMillis()
            boolean r2 = r1.isEmpty()
            if (r2 != 0) goto L_0x0310
            java.lang.Object r2 = p2628d.p2629a.C52575l.m112142g(r1)
            java.lang.String r6 = "record.last()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r6)
            java.lang.String r2 = (java.lang.String) r2
            long r6 = java.lang.Long.parseLong(r2)
            boolean r0 = r0.mo94739a(r4, r6)
            if (r0 == 0) goto L_0x0335
        L_0x0310:
            java.lang.String r0 = java.lang.String.valueOf(r4)
            r1.add(r0)
            com.bytedance.keva.Keva r0 = com.p683ss.android.ugc.aweme.p2377ug.guide.C47462h.m102819e()
            java.lang.String r2 = "key_user_active_record"
            java.util.Collection r1 = (java.util.Collection) r1
            java.lang.String[] r3 = new java.lang.String[r3]
            java.lang.Object[] r1 = r1.toArray(r3)
            if (r1 == 0) goto L_0x032d
            java.lang.String[] r1 = (java.lang.String[]) r1
            r0.storeStringArray(r2, r1)
            goto L_0x0335
        L_0x032d:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type kotlin.Array<T>"
            r0.<init>(r1)
            throw r0
        L_0x0335:
            android.support.v4.app.Fragment r0 = r15.f78327r
            android.widget.FrameLayout r1 = r15.mRootView
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d.m57256a(r0, r1)
            r15.f78276D = r0
            boolean r0 = r15.f78304ah
            if (r0 != 0) goto L_0x0365
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r15.f78517i
            android.widget.FrameLayout r1 = r15.mBottomView
            com.ss.android.ugc.aweme.feed.feedwidget.VPAInfoBarWidget r2 = new com.ss.android.ugc.aweme.feed.feedwidget.VPAInfoBarWidget
            r2.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r0.mo48251a(r1, r2)
            android.widget.FrameLayout r1 = r15.mRootView
            com.ss.android.ugc.aweme.feed.feedwidget.VPAOptedOutMaskWidget r2 = new com.ss.android.ugc.aweme.feed.feedwidget.VPAOptedOutMaskWidget
            r2.<init>()
            com.ss.android.ugc.aweme.arch.widgets.base.d r0 = r0.mo48251a(r1, r2)
            android.widget.FrameLayout r1 = r15.mRootView
            com.ss.android.ugc.aweme.feed.feedwidget.VideoMaskWidget r2 = new com.ss.android.ugc.aweme.feed.feedwidget.VideoMaskWidget
            r2.<init>()
            r0.mo48251a(r1, r2)
        L_0x0365:
            com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a r0 = new com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.a
            r0.<init>(r15)
            r15.f78293U = r0
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.adapter.VideoViewHolder.mo60241k():void");
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Removed duplicated region for block: B:132:0x0326  */
    /* JADX WARNING: Removed duplicated region for block: B:135:0x032d  */
    /* JADX WARNING: Removed duplicated region for block: B:144:? A[RETURN, SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:41:0x00b1  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x00b8  */
    /* JADX WARNING: Removed duplicated region for block: B:76:0x0168  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x017f  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a6  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x01b7  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01c2  */
    /* JADX WARNING: Removed duplicated region for block: B:91:0x01d5  */
    /* renamed from: n */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo60243n() {
        /*
            r13 = this;
            android.view.ViewGroup r0 = r13.llAwemeIntro
            if (r0 == 0) goto L_0x000f
            android.view.ViewGroup r0 = r13.llAwemeIntro
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r13.f78325p
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63571b(r1)
            r0.setClipChildren(r1)
        L_0x000f:
            android.widget.ImageView r0 = r13.mShareTipImageView
            r1 = 8
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r13.f78325p
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            r13.m70212ap()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f78325p
            java.util.List r3 = r2.getVideoLabels()
            boolean r4 = com.bytedance.common.utility.p522b.C9376b.m18558a(r3)
            r5 = 1
            r6 = 0
            if (r4 != 0) goto L_0x005a
            r4 = 0
        L_0x002e:
            int r7 = r3.size()
            if (r4 >= r7) goto L_0x005a
            java.lang.Object r7 = r3.get(r4)
            com.ss.android.ugc.aweme.feed.model.AwemeLabelModel r7 = (com.p683ss.android.ugc.aweme.feed.model.AwemeLabelModel) r7
            if (r7 == 0) goto L_0x0057
            int r8 = r7.getLabelType()
            if (r8 != r5) goto L_0x0057
            boolean r8 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r2)
            if (r8 != 0) goto L_0x0057
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r8 = r2.getStatus()
            if (r8 == 0) goto L_0x0057
            boolean r8 = r2.isPrivate()
            if (r8 == 0) goto L_0x0057
            r3.remove(r7)
        L_0x0057:
            int r4 = r4 + 1
            goto L_0x002e
        L_0x005a:
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f78325p
            java.util.List r2 = r2.getVideoLabels()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            boolean r3 = r3.isAd()
            if (r3 == 0) goto L_0x008d
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            boolean r3 = r3.isRightStyle()
            if (r3 != 0) goto L_0x008d
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            com.ss.android.ugc.aweme.feed.model.AwemeTextLabelModel r3 = r3.getLabel()
            if (r3 == 0) goto L_0x008d
            java.util.ArrayList r4 = new java.util.ArrayList
            r4.<init>()
            r4.add(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            r3.setTextVideoLabels(r4)
        L_0x008d:
            boolean r3 = r13.mo60373P()
            if (r3 == 0) goto L_0x00ae
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            if (r3 == 0) goto L_0x00a9
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r3.getAwemeRawAd()
            if (r4 == 0) goto L_0x00a9
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            int r3 = r3.getAdTagPosition()
            if (r3 != r5) goto L_0x00a9
            r3 = 1
            goto L_0x00aa
        L_0x00a9:
            r3 = 0
        L_0x00aa:
            if (r3 == 0) goto L_0x00ae
            r3 = 1
            goto L_0x00af
        L_0x00ae:
            r3 = 0
        L_0x00af:
            if (r3 == 0) goto L_0x00b8
            com.ss.android.ugc.aweme.base.ui.TagLayout r2 = r13.tagLayout
            r2.setVisibility(r1)
            goto L_0x015b
        L_0x00b8:
            java.lang.String r3 = r13.mo60210aa()
            java.lang.String r4 = "homepage_hot"
            boolean r3 = com.bytedance.common.utility.C9431p.m18665a(r3, r4)
            if (r3 == 0) goto L_0x00ca
            boolean r3 = r13.mo60373P()
            if (r3 == 0) goto L_0x012c
        L_0x00ca:
            java.lang.String r3 = r13.mo60210aa()
            java.lang.String r4 = "homepage_familiar"
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x012c
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64064g(r3)
            if (r3 != 0) goto L_0x012c
            java.lang.String r3 = r13.mo60210aa()
            java.lang.String r4 = "challenge"
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 != 0) goto L_0x012c
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r3 = r3.getRelationLabel()
            if (r3 == 0) goto L_0x011e
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r3 = r3.getRelationLabel()
            int r3 = r3.getType()
            r4 = 5
            if (r3 != r4) goto L_0x011e
            com.bytedance.ies.abmock.b r7 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.RelationLabelClickEnterExperiment> r8 = com.p683ss.android.ugc.aweme.experiment.RelationLabelClickEnterExperiment.class
            r9 = 1
            java.lang.String r10 = "relation_label_click_enter"
            r11 = 31744(0x7c00, float:4.4483E-41)
            r12 = 0
            boolean r3 = r7.mo18172a(r8, r9, r10, r11, r12)
            if (r3 == 0) goto L_0x011e
            int r3 = r13.f78299ac
            r4 = 2
            if (r3 != r4) goto L_0x011e
            boolean r3 = r13.mo60373P()
            if (r3 != 0) goto L_0x011e
            r3 = 1
            goto L_0x011f
        L_0x011e:
            r3 = 0
        L_0x011f:
            if (r3 == 0) goto L_0x0122
            goto L_0x012c
        L_0x0122:
            com.ss.android.ugc.aweme.base.ui.TagLayout r3 = r13.tagLayout
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r13.f78325p
            com.ss.android.ugc.aweme.base.ui.TagLayout$a r7 = com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout.f63027e
            r3.mo49068b(r4, r2, r7)
            goto L_0x015b
        L_0x012c:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r3 = r3.getRelationLabel()
            if (r3 == 0) goto L_0x0152
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r3 = r3.getRelationLabel()
            int r3 = r3.getType()
            if (r3 != 0) goto L_0x0152
            java.lang.String r3 = r13.mo60210aa()
            java.lang.String r4 = "homepage_familiar"
            boolean r3 = android.text.TextUtils.equals(r3, r4)
            if (r3 == 0) goto L_0x0152
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            r4 = 0
            r3.setRelationLabel(r4)
        L_0x0152:
            com.ss.android.ugc.aweme.base.ui.TagLayout r3 = r13.tagLayout
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r13.f78325p
            com.ss.android.ugc.aweme.base.ui.TagLayout$a r7 = com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout.f63027e
            r3.mo49069c(r4, r2, r7)
        L_0x015b:
            com.ss.android.ugc.aweme.base.ui.TagLayout r2 = r13.tagLayout
            com.p683ss.android.ugc.aweme.commercialize.utils.C26373af.m63821a(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f78325p
            boolean r2 = r2.isRelieve()
            if (r2 == 0) goto L_0x017f
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r2 = r13.mIvRelieveTag
            java.lang.String r3 = "anti_addiction_tag.json"
            r2.setAnimation(r3)
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r2 = r13.mIvRelieveTag
            r2.mo6654b()
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r2 = r13.mIvRelieveTag
            r2.mo6658c(r5)
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r2 = r13.mIvRelieveTag
            r2.setVisibility(r6)
            goto L_0x0192
        L_0x017f:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r2 = r13.mIvRelieveTag
            if (r2 == 0) goto L_0x0192
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r2 = r13.mIvRelieveTag     // Catch:{ NullPointerException -> 0x0189 }
            r2.mo6661f()     // Catch:{ NullPointerException -> 0x0189 }
            goto L_0x018d
        L_0x0189:
            r2 = move-exception
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75148a(r2)
        L_0x018d:
            com.ss.android.ugc.aweme.base.ui.AnimationImageView r2 = r13.mIvRelieveTag
            r2.setVisibility(r1)
        L_0x0192:
            com.ss.android.ugc.aweme.app.SharePrefCache r2 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r2 = r2.isOb()
            java.lang.Object r2 = r2.mo47782d()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x01b7
            com.ss.android.ugc.aweme.setting.ui.RestrictTextView r2 = r13.mRestrictTextView
            r2.setVisibility(r6)
            com.ss.android.ugc.aweme.setting.ui.RestrictTextView r2 = r13.mRestrictTextView
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            java.lang.String r3 = r3.getAid()
            r2.mo85685a(r3)
            goto L_0x01bc
        L_0x01b7:
            com.ss.android.ugc.aweme.setting.ui.RestrictTextView r2 = r13.mRestrictTextView
            r2.setVisibility(r1)
        L_0x01bc:
            boolean r2 = r13.mo60373P()
            if (r2 == 0) goto L_0x01d5
            android.widget.LinearLayout r2 = r13.feedReportVotell
            r2.setVisibility(r1)
            android.support.constraint.ConstraintLayout r2 = r13.feedReportWarnll
            r2.setVisibility(r1)
            com.ss.android.ugc.aweme.commercialize.feed.al r2 = r13.f78287O
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            r2.mo53060b(r3)
            goto L_0x02cd
        L_0x01d5:
            android.widget.LinearLayout r2 = r13.adFeeDeductionLayout
            r2.setVisibility(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f78325p
            boolean r2 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72841i(r2)
            if (r2 == 0) goto L_0x0234
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f78325p
            boolean r2 = r2.isHotSearchAweme()
            if (r2 != 0) goto L_0x0234
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f78325p
            boolean r2 = com.p683ss.android.ugc.aweme.feed.utils.C31186b.m72814b(r2)
            if (r2 != 0) goto L_0x0234
            android.widget.LinearLayout r2 = r13.feedReportVotell
            r2.setVisibility(r6)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f78325p
            com.ss.android.ugc.aweme.feed.model.AwemeRiskModel r2 = r2.getAwemeRiskModel()
            int r2 = r2.getVoteStatus()
            if (r2 != r5) goto L_0x0211
            r2 = 2132551925(0x7f1c28f5, float:2.0757223E38)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r13.mAllowDisplayBtn
            r3.setSelected(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r13.mDisallowDisplayBtn
            r3.setSelected(r6)
            goto L_0x022e
        L_0x0211:
            if (r2 != 0) goto L_0x0221
            r2 = 2132551927(0x7f1c28f7, float:2.0757227E38)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r13.mDisallowDisplayBtn
            r3.setSelected(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r13.mAllowDisplayBtn
            r3.setSelected(r6)
            goto L_0x022e
        L_0x0221:
            r2 = 2132551926(0x7f1c28f6, float:2.0757225E38)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r13.mAllowDisplayBtn
            r3.setSelected(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r13.mDisallowDisplayBtn
            r3.setSelected(r6)
        L_0x022e:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r3 = r13.mVoteStatusTextView
            r3.setText(r2)
            goto L_0x0239
        L_0x0234:
            android.widget.LinearLayout r2 = r13.feedReportVotell
            r2.setVisibility(r1)
        L_0x0239:
            android.support.constraint.ConstraintLayout r2 = r13.feedReportWarnll
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            boolean r3 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72842j(r3)
            if (r3 == 0) goto L_0x0255
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            boolean r3 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72841i(r3)
            if (r3 != 0) goto L_0x0255
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            boolean r3 = com.p683ss.android.ugc.aweme.feed.utils.C31186b.m72814b(r3)
            if (r3 != 0) goto L_0x0255
            r3 = 0
            goto L_0x0257
        L_0x0255:
            r3 = 8
        L_0x0257:
            r2.setVisibility(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r13.f78325p
            android.support.constraint.ConstraintLayout r3 = r13.feedReportWarnll
            boolean r4 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72842j(r2)
            if (r4 == 0) goto L_0x02cd
            r4 = 2132024057(0x7f141af9, float:1.968658E38)
            android.view.View r4 = r3.findViewById(r4)
            android.widget.TextView r4 = (android.widget.TextView) r4
            r7 = 2132017452(0x7f14012c, float:1.9673183E38)
            android.view.View r7 = r3.findViewById(r7)
            android.widget.ImageView r7 = (android.widget.ImageView) r7
            com.ss.android.ugc.aweme.feed.model.AwemeRiskModel r8 = r2.getAwemeRiskModel()
            java.lang.String r8 = r8.getContent()
            r4.setText(r8)
            com.ss.android.ugc.aweme.feed.model.AwemeRiskModel r4 = r2.getAwemeRiskModel()
            java.lang.String r4 = r4.getUrl()
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x029b
            r7.setVisibility(r6)
            com.ss.android.ugc.aweme.report.b r4 = new com.ss.android.ugc.aweme.report.b
            r4.<init>(r2, r3)
            r3.setOnClickListener(r4)
            goto L_0x02a4
        L_0x029b:
            r7.setVisibility(r1)
            android.view.View$OnClickListener r4 = com.p683ss.android.ugc.aweme.report.C41208c.f104649a
            r3.setOnClickListener(r4)
            r5 = 0
        L_0x02a4:
            java.lang.String r3 = "info_bar_show"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r7 = "group_id"
            java.lang.String r8 = r2.getAid()
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r7, r8)
            java.lang.String r7 = "content"
            com.ss.android.ugc.aweme.feed.model.AwemeRiskModel r2 = r2.getAwemeRiskModel()
            java.lang.String r2 = r2.getContent()
            com.ss.android.ugc.aweme.app.f.d r2 = r4.mo47829a(r7, r2)
            java.lang.String r4 = "is_clickable"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47826a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r2)
        L_0x02cd:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r2 = r13.mTxtProhibited
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            boolean r3 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56880p(r3)
            if (r3 == 0) goto L_0x02e0
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r13.f78325p
            boolean r3 = r3.isProhibited()
            if (r3 == 0) goto L_0x02e0
            r1 = 0
        L_0x02e0:
            r2.setVisibility(r1)
            android.widget.FrameLayout r1 = r13.mRootView
            r2 = 2132019008(0x7f140740, float:1.9676339E38)
            java.lang.Object r1 = r1.getTag(r2)
            java.lang.Integer r1 = (java.lang.Integer) r1
            int r1 = r1.intValue()
            r13.f78296X = r1
            android.widget.FrameLayout r1 = r13.mRootView
            if (r1 == 0) goto L_0x031f
            boolean r1 = r13.mo60371N()
            if (r1 != 0) goto L_0x031f
            android.widget.FrameLayout r1 = r13.mRootView
            android.content.Context r2 = r13.f78324o
            android.content.res.Resources r2 = r2.getResources()
            r3 = 2131821013(0x7f1101d5, float:1.9274757E38)
            int r2 = r2.getColor(r3)
            r1.setBackgroundColor(r2)
            com.bytedance.lighten.loader.SmartImageView r1 = r13.mCoverView
            android.content.Context r2 = r13.f78324o
            android.content.res.Resources r2 = r2.getResources()
            int r2 = r2.getColor(r3)
            r1.setBackgroundColor(r2)
        L_0x031f:
            r13.m70215d(r0)
            boolean r1 = r13.f78308al
            if (r1 == 0) goto L_0x0329
            r13.mo60225b(r0)
        L_0x0329:
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r13.f78516h
            if (r0 == 0) goto L_0x0336
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r13.f78516h
            java.lang.String r1 = "video_params"
            com.ss.android.ugc.aweme.feed.model.VideoItemParams r2 = r13.f78279G
            r0.mo48228a(r1, r2)
        L_0x0336:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.adapter.VideoViewHolder.mo60243n():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0026, code lost:
        if (r2 == false) goto L_0x0028;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo46747a() {
        /*
            r9 = this;
            boolean r0 = r9.f78308al
            if (r0 == 0) goto L_0x000d
            com.ss.android.ugc.aweme.main.b r0 = com.p683ss.android.ugc.aweme.main.C36512b.m82421a()
            boolean r0 = r0.f93584a
            if (r0 == 0) goto L_0x000d
            return
        L_0x000d:
            android.widget.RelativeLayout r0 = r9.mWidgetContainer
            if (r0 == 0) goto L_0x0063
            r9.m70212ap()
            com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper r0 = r9.f78297Z
            if (r0 == 0) goto L_0x0028
            com.ss.android.ugc.aweme.feed.ui.landscape.VideoViewLandscapeHelper r0 = r9.f78297Z
            int r1 = r0.f81225g
            r2 = 1
            if (r1 == r2) goto L_0x0026
            int r0 = r0.f81225g
            r1 = 2
            if (r0 != r1) goto L_0x0025
            goto L_0x0026
        L_0x0025:
            r2 = 0
        L_0x0026:
            if (r2 != 0) goto L_0x0041
        L_0x0028:
            com.ss.android.ugc.aweme.feed.helper.a r3 = r9.f78330u
            android.content.Context r4 = r9.f78324o
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f78325p
            com.ss.android.ugc.aweme.feed.model.Video r5 = r0.getVideo()
            android.view.View r6 = r9.mo60254x()
            com.bytedance.lighten.loader.SmartImageView r7 = r9.mCoverView
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f78325p
            com.ss.android.ugc.aweme.feed.model.OcrLocation r8 = r0.getOcrLocation()
            r3.mo60787a(r4, r5, r6, r7, r8)
        L_0x0041:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r9.f78325p
            com.ss.android.ugc.aweme.feed.model.Video r0 = r0.getVideo()
            if (r0 == 0) goto L_0x005e
            com.ss.android.ugc.aweme.feed.helper.a r0 = r9.f78330u
            android.content.Context r1 = r9.f78324o
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r9.f78325p
            com.ss.android.ugc.aweme.feed.model.Video r2 = r2.getVideo()
            android.widget.FrameLayout r3 = r9.flInteractLayout
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r9.f78325p
            com.ss.android.ugc.aweme.feed.model.OcrLocation r4 = r4.getOcrLocation()
            r0.mo60788a(r1, r2, r3, r4)
        L_0x005e:
            com.ss.android.ugc.aweme.commercialize.feed.al r0 = r9.f78287O
            r0.mo53075i()
        L_0x0063:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.adapter.VideoViewHolder.mo46747a():void");
    }

    /* renamed from: h */
    private boolean m70222h(int i) {
        return this.f78305ai.get(i);
    }

    /* renamed from: c */
    public final void mo53533c(String str) {
        this.f78287O.mo53054a(str);
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public Aweme mo60229d(int i) {
        return this.f78325p;
    }

    /* renamed from: i */
    private void m70223i(int i) {
        if (this.f78516h != null) {
            this.f78516h.mo48228a("pausePlayAnimation", (Object) Integer.valueOf(i));
        }
    }

    /* renamed from: b */
    public final void mo60226b(C38871j jVar) {
        if (this.f78317e != null) {
            this.f78317e.mo60226b(jVar);
        }
    }

    /* renamed from: e */
    public final void mo53535e(String str) {
        m70221h("onPreparePlay");
        this.f78284L = false;
    }

    /* renamed from: g */
    public final void mo60239g(boolean z) {
        this.f78516h.mo48228a("load_progress_bar", (Object) Boolean.valueOf(z));
    }

    /* renamed from: h */
    private void m70221h(String str) {
        C31203o.m72860a(C31190f.m72838f(this.f78325p), str);
        if (this.mCoverView != null) {
            this.mCoverView.setVisibility(0);
        }
    }

    /* renamed from: i */
    private void mo60374i(boolean z) {
        if (this.f78289Q != null) {
            if (z) {
                this.f78322m.setVisibility(0);
            } else {
                this.f78322m.setVisibility(8);
            }
            this.f78289Q.mo95221a(z);
        }
    }

    /* renamed from: c */
    public final void mo60228c(Aweme aweme) {
        if (!(this.f78324o == null || aweme == null || this.f78516h == null)) {
            this.f78516h.mo48228a("handle_double_click", (Object) aweme);
        }
    }

    /* renamed from: e */
    public final void mo60232e(int i) {
        if (f78273z) {
            this.mRootView.setBackgroundColor(i);
            this.mCoverView.setBackgroundColor(i);
            mo60235f(i);
        }
    }

    /* renamed from: f */
    private void m70217f(Aweme aweme) {
        if (!m70222h(2) && C47935p.m103712e(this.f78325p)) {
            this.f78305ai.put(2, true);
            this.f78517i.mo48251a((View) this.mRootView, (Widget) new VideoMaskWidget());
        }
    }

    /* renamed from: g */
    private void m70220g(String str) {
        String f = C31190f.m72838f(this.f78325p);
        C52711k.m112240b(str, "source");
        StringBuilder sb = new StringBuilder("hideCover ");
        sb.append(f);
        sb.append(", source ");
        sb.append(str);
        C31203o.m72861b(sb.toString());
        if (this.mCoverView != null) {
            this.mCoverView.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo60224b(Aweme aweme) {
        if (this.f78516h != null) {
            this.f78516h.mo48228a("video_resume_play", (Object) aweme);
        }
        if (this.mRootView != null && !mo60371N()) {
            mo60232e(this.f78324o.getResources().getColor(R.color.ip));
        }
        if (this.mCoverView != null) {
            C30073bk.m70501a(this.mCoverView, R.drawable.csk);
        }
    }

    /* renamed from: h */
    public final void mo60240h(boolean z) {
        this.f78286N = z;
        if (this.f78286N) {
            this.f78321l.mo97956e();
        } else {
            this.f78321l.mo97957f();
        }
    }

    /* renamed from: e */
    private void m70216e(Video video) {
        if (video == null || !m70208a(video.getOriginCover())) {
            C30073bk.m70501a(this.mCoverView, R.drawable.csk);
            SmartImageView smartImageView = this.mCoverView;
            StringBuilder sb = new StringBuilder("res://");
            sb.append(this.f78324o.getPackageName());
            sb.append("/2131821851");
            smartImageView.setImageURI(Uri.parse(sb.toString()));
            return;
        }
        C12203q.m24645a((Object) C23608p.m57874a(video.getOriginCover())).mo23117a(C12202p.HIGH).mo23118a("VideoViewHolder").mo23116a((C12197k) this.mCoverView).mo23122a((C12175j) new C30453i(this, this.f78283K));
    }

    /* renamed from: f */
    private void m70218f(Video video) {
        boolean z;
        UrlModel originCover = video.getOriginCover();
        if (mo53999e().isAd() || !PosterSRProcessorInitTask.NEED_POSTER_PROCESS) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            C12203q.m24645a((Object) C23608p.m57874a(video.getOriginCover())).mo23117a(C12202p.HIGH).mo23118a("VideoViewHolder").mo23116a((C12197k) this.mCoverView).mo23122a((C12175j) new C30453i(this, this.f78283K));
            this.f78280H = null;
            return;
        }
        this.f78280H = new C30032at(new WeakReference(this.mCoverView), this.f78516h, this.f78283K);
        C30391o.m71310a(this.mCoverView, originCover, C13951c.MEDIUM, this.f78280H, this.f78516h);
    }

    /* renamed from: g */
    private void m70219g(Aweme aweme) {
        if (C31186b.m72814b(aweme)) {
            if (!m70222h(0)) {
                this.f78305ai.put(0, true);
                this.f78517i.mo48251a((View) this.mBottomView, (Widget) new VPAInfoBarWidget());
            }
            if (!m70222h(1) && C23794bh.m58381G().mo47241b() == 3) {
                this.f78305ai.put(1, true);
                this.f78517i.mo48251a((View) this.mRootView, (Widget) new VPAOptedOutMaskWidget());
            }
        }
    }

    /* renamed from: i */
    private void m70224i(String str) {
        C32458a.m75141a(4, "FeedAvatarView", "VideoViewHolder rev liveData!");
        if (this.f78516h != null) {
            this.f78516h.mo48228a("dismiss_dou_pop", (Object) Boolean.valueOf(true));
        }
        C30323an anVar = new C30323an(this.f78324o.hashCode(), this.f78299ac);
        if (!TextUtils.isEmpty(str)) {
            anVar.f79220c = str;
        }
        C30033au.m70442a(new C30322am(mo60210aa(), C31257z.m72969a(this.f78299ac)), anVar, mo60210aa());
    }

    /* renamed from: j */
    private void m70226j(int i) {
        if (this.f78326q != null) {
            String str = "";
            try {
                str = this.f78326q.getString("request_id");
            } catch (JSONException unused) {
            }
            if (!TextUtils.isEmpty(str)) {
                this.f78325p.setRequestId(str);
            }
        }
        IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
        if (provideIMService_Monster != null && provideIMService_Monster.isNeedToContinuePlayInAct()) {
            provideIMService_Monster.setNeedToContinuePlayInAct(false);
        }
        if (this.f78319g != null && this.f78325p != null) {
            this.f78319g.mo60714a(new C30332aw(i, mo60229d(i)));
        }
    }

    /* renamed from: b */
    public final void mo60223b(int i) {
        this.f78281I = true;
        if (mo60375l()) {
            View x = mo60254x();
            if (x.getVisibility() != 8) {
                C23729p.m58257a(x, 8);
            }
        }
        if (i == 1) {
            if (C10181b.m20511a().mo18172a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", 31744, false) && this.f78516h != null) {
                this.f78516h.mo48228a("pause_share_guide_animation", (Object) Boolean.valueOf(true));
            }
        } else if (i != 6) {
            if (i == 5) {
                m70210an();
            } else {
                m70223i(1);
            }
            if (!(i == 4 || i == 5)) {
                this.f78287O.mo53081o();
            }
            if (this.f78516h != null) {
                this.f78516h.mo48228a("holder_on_pause", (Object) Boolean.valueOf(true));
                this.f78516h.mo48228a("in_video_view_holder", (Object) Boolean.valueOf(false));
            }
        }
    }

    /* renamed from: d */
    public void mo60231d(boolean z) {
        if (this.f78278F.param.isHotSpot() && CleanModeManager2.m82255b(mo60197Z())) {
            z = true;
        }
        super.mo60231d(z);
        mo60200a((View) this.mWidgetContainer, z);
        this.f78287O.mo53062b(z);
        if (z && this.f78516h != null) {
            this.f78516h.mo48228a("dismiss_dou_pop", (Object) Boolean.valueOf(true));
        }
        if (C31257z.m72971b(mo60210aa())) {
            StringBuilder sb = new StringBuilder("openCleanMode in position ");
            sb.append(this.f78328s);
            sb.append(", clean is");
            sb.append(z);
            C32458a.m75141a(3, "VideoViewHolder", sb.toString());
        }
    }

    public void onClick(View view) {
        if (this.f78325p != null) {
            int id = view.getId();
            if (id == R.id.eo) {
                this.f78325p.getAwemeRiskModel().setVoteStatus(1);
                this.mAllowDisplayBtn.setSelected(true);
                this.mDisallowDisplayBtn.setSelected(false);
                this.mVoteStatusTextView.setText(R.string.fd9);
                m70226j(25);
                return;
            }
            if (id == R.id.a62) {
                this.f78325p.getAwemeRiskModel().setVoteStatus(0);
                this.mDisallowDisplayBtn.setSelected(true);
                this.mAllowDisplayBtn.setSelected(false);
                this.mVoteStatusTextView.setText(R.string.fda);
                m70226j(26);
            }
        }
    }

    /* renamed from: a */
    public static void m70205a(Context context) {
        C9379e eVar = (C9379e) f78271aa.get(context);
        if (eVar != null) {
            Iterator it = eVar.iterator();
            while (it.hasNext()) {
                C23729p.m58257a((View) (SurfaceView) it.next(), 8);
            }
        }
        C9379e eVar2 = (C9379e) f78272ab.get(context);
        if (eVar2 != null) {
            Iterator it2 = eVar2.iterator();
            while (it2.hasNext()) {
                VideoViewHolder videoViewHolder = (VideoViewHolder) it2.next();
                if (videoViewHolder.f78325p != null) {
                    videoViewHolder.m70215d(videoViewHolder.f78325p.getVideo());
                }
            }
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: c */
    public void mo60225b(Video video) {
        View a = this.f78321l.mo97949a();
        ViewGroup.LayoutParams layoutParams = a.getLayoutParams();
        if (layoutParams != null && layoutParams.width > 0 && layoutParams.height > 0) {
            this.f78306aj = layoutParams.width;
            this.f78307ak = layoutParams.height;
        } else if (video != null && video.getWidth() > 0 && video.getHeight() > 0) {
            this.f78306aj = video.getWidth();
            this.f78307ak = video.getHeight();
        } else if (a.getMeasuredWidth() <= 0 || a.getMeasuredHeight() <= 0) {
            a.post(new C30067bf(this, video));
        } else {
            this.f78306aj = a.getMeasuredWidth();
            this.f78307ak = a.getMeasuredHeight();
        }
    }

    /* renamed from: d */
    private void m70215d(Video video) {
        this.f78283K = new C30365e();
        Aweme aweme = this.f78325p;
        this.f78330u.mo60786a(this.f78324o, aweme, mo60254x(), (View) this.mCoverView);
        this.f78330u.mo60788a(this.f78324o, aweme.getVideo(), (View) this.flInteractLayout, aweme.getOcrLocation());
        m70221h("bindCoverImage");
        if (C26469cc.m63997a(this.f78325p, 3)) {
            m70216e(video);
        } else if (video == null || video.getPlayAddr() == null || C9376b.m18558a((Collection<T>) video.getPlayAddr().getUrlList()) || !m70208a(video.getOriginCover())) {
            C30073bk.m70500a(this.mCoverView, this.f78324o, R.drawable.dhm);
        } else {
            C30073bk.m70501a(this.mCoverView, R.drawable.csk);
            if (C31186b.m72816d(this)) {
                C12203q.m24645a((Object) C23608p.m57874a(video.getOriginCover())).mo23118a("VideoViewHolder").mo23116a((C12197k) this.mCoverView).mo23122a((C12175j) new C30453i(this, this.f78283K));
            } else {
                m70206a(aweme, video);
            }
        }
    }

    /* renamed from: b */
    public final void mo53531b(String str) {
        m70223i(2);
        this.f78287O.mo53086s();
    }

    /* renamed from: e */
    public final void mo60233e(Aweme aweme) {
        if (this.f78325p != null && aweme != null && TextUtils.equals(this.f78325p.getAid(), aweme.getAid()) && this.f78516h != null) {
            this.f78325p.setStatistics(aweme.getStatistics());
            Aweme aweme2 = this.f78325p;
            if (!(!C26235d.m63570a(aweme2) || aweme2 == null || aweme == null)) {
                aweme2.setUserDigg(aweme.getUserDigg());
                aweme2.setAuthor(aweme.getAuthor());
            }
            this.f78516h.mo48228a("awesome_update_data", (Object) this.f78279G);
        }
    }

    /* renamed from: f */
    public final void mo60235f(int i) {
        if (!C10181b.m20511a().mo18172a(DynamicTabSwitchExperiment.class, true, "virus_tab_global_switch", 31744, false)) {
            FragmentActivity activity = this.f78327r.getActivity();
            if (!(activity == null || activity.getWindow() == null)) {
                if (i != 0) {
                    activity.getWindow().getDecorView().setBackgroundColor(i);
                    return;
                }
                activity.getWindow().getDecorView().setBackground(null);
            }
        }
    }

    /* renamed from: c */
    public final void mo60227c(int i) {
        this.f78281I = false;
        mo60178A();
        if (this.f78516h != null) {
            this.f78516h.mo48228a("holder_on_resume", (Object) Integer.valueOf(i));
        }
        if (i == 2) {
            this.f78287O.mo53080n();
            return;
        }
        if (C10181b.m20511a().mo18172a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", 31744, false) && this.f78516h != null) {
            this.f78516h.mo48228a("recover_share_guide_animation", (Object) Boolean.valueOf(true));
        }
    }

    /* renamed from: e */
    public final void mo60234e(boolean z) {
        this.f78287O.mo53066c(z);
        if (z) {
            this.mGradualBottomView.animate().alpha(0.0f).setDuration(200).start();
            this.mGradualTopView.animate().alpha(0.0f).setDuration(200).start();
            this.mWidgetContainer.animate().alpha(0.0f).setDuration(200).start();
            this.f78282J = true;
            return;
        }
        this.mGradualBottomView.animate().alpha(1.0f).setDuration(200).start();
        this.mGradualTopView.animate().alpha(1.0f).setDuration(200).start();
        this.mWidgetContainer.animate().alpha(1.0f).setDuration(200).start();
        if (this.f78282J) {
            this.f78282J = false;
        }
    }

    /* renamed from: f */
    public final void mo60236f(final String str) {
        super.mo60236f(str);
        if (this.f78303ag) {
            C30255o.f79039a.mo60617a(new C30256p(true, new Runnable() {
                public final void run() {
                    VideoViewHolder.this.f78279G.setEnterMethodValue(str);
                }
            }));
        } else {
            this.f78279G.setEnterMethodValue(str);
        }
        mo60372O();
    }

    /* renamed from: g */
    public final void mo60238g(int i) {
        if (this.f78292T == 4 || this.f78292T <= i) {
            C26216b.m63501a(i, this.f78325p);
            C25945k.m62915f().mo53876a(i, this.mGradualBottomView, this.flInteractLayout);
            C25945k.m62915f().mo53876a(i, this.mGradualTopView, this.flInteractLayout);
        }
    }

    public VideoViewHolder(C30069bh bhVar) {
        C30069bh bhVar2 = bhVar;
        boolean z = false;
        this.f78290R = false;
        this.f78292T = 4;
        this.f78334y = true;
        this.f78296X = -1;
        this.f78277E = false;
        this.f78303ag = false;
        this.f78304ah = false;
        this.f78305ai = new SparseBooleanArray();
        this.f78308al = C10181b.m20511a().mo18172a(ShrinkVideoWhenCommentShowExperiment.class, true, "enable_comment_video_shrink", 31744, false);
        this.f78310an = false;
        this.f78281I = false;
        this.f78311ao = false;
        this.f78312ap = "";
        this.f78313aq = new C0199s<FollowStatus>() {
            public final /* bridge */ /* synthetic */ void onChanged(Object obj) {
            }
        };
        View view = bhVar2.f78493a;
        this.f78324o = view.getContext();
        C30313ae<C30332aw> aeVar = bhVar2.f78494b;
        OnTouchListener onTouchListener = bhVar2.f78496d;
        Fragment fragment = bhVar2.f78495c;
        BaseFeedPageParams baseFeedPageParams = bhVar2.f78497e;
        C30198m mVar = bhVar2.f78498f;
        C30360a aVar = bhVar2.f78499g;
        OnTouchListener onTouchListener2 = bhVar2.f78500h;
        if (onTouchListener2 != null) {
            this.f78294V = onTouchListener2;
        } else {
            this.f78294V = new C10721b(0.5f, 1.0f);
        }
        C30722a aVar2 = bhVar2.f78501i;
        if (aVar2 != null) {
            this.f78295W = aVar2;
        } else {
            this.f78295W = m70202a(this.f78324o, baseFeedPageParams);
        }
        this.f78278F = baseFeedPageParams;
        this.f78299ac = this.f78278F.awemeFromPage;
        this.f78275C = mVar;
        if (aVar == null) {
            this.f78330u = new C30360a();
            if (VERSION.SDK_INT >= 17) {
                C30360a.m71256a(this.f78324o);
            }
        }
        try {
            ButterKnife.bind((Object) this, view);
        } catch (IllegalStateException unused) {
            C35914e.m81075a(getClass().getName(), view, this.f78324o, 0);
        }
        if (this.mLongPressLayout != null) {
            this.mLongPressLayout.setListener(this.f78295W);
        }
        if (!C20854a.m53167g().isLogin() || !C9431p.m18665a(C11010c.m22295p(), "lark_inhouse")) {
            z = true;
        }
        this.f78298a = z;
        this.f78287O = C30687a.m71968b().mo60294a(this, view, this.f78278F.pageType, mo60210aa(), aeVar, fragment);
        this.f78288P = C25539a.m62079a().getECVideoViewHolder(this.f78324o, this.commerceGoodHalfCardContainer, this.f78278F.pageType, this.f78278F.param, mo60210aa());
        view.findViewById(R.id.aen);
        this.f78287O.mo53053a(this.f78278F.param);
        if (C48121w.m104087I()) {
            this.f78317e = new VideoViewComponent();
            this.f78317e.mo97916a((ViewGroup) this.mRootView);
            this.f78321l = this.f78317e.f125619b;
        } else {
            this.f78321l = C50160i.m108258a((ViewGroup) this.mRootView);
            if (C48114q.m104226b() && (this.f78321l.mo97949a() instanceof SurfaceView)) {
                C9379e eVar = (C9379e) f78271aa.get(this.f78324o);
                if (eVar == null) {
                    eVar = new C9379e();
                    f78271aa.put(this.f78324o, eVar);
                }
                this.f78321l.mo97949a().setVisibility(8);
                this.f78321l.mo97950a((C50161j) this);
                eVar.mo17005a((SurfaceView) this.f78321l.mo97949a());
            }
        }
        this.mGradualBottomView.getLayoutParams().height = (C9432q.m18670a(this.f78324o) * 3) / 4;
        this.mGradualTopView.getLayoutParams().height = (int) C9432q.m18687b(this.f78324o, 108.0f);
        this.f78327r = fragment;
        if (((Boolean) SharePrefCache.inst().getShowPlayerInfoUI().mo47782d()).booleanValue()) {
            if (this.f78322m == null) {
                LayoutParams layoutParams = new LayoutParams((int) C9432q.m18687b(this.f78324o, 300.0f), (int) C9432q.m18687b(this.f78324o, 500.0f));
                layoutParams.topMargin = (int) C9432q.m18687b(this.f78324o, 80.0f);
                this.f78322m = new FrameLayout(this.f78324o);
                int b = (int) C9432q.m18687b(this.f78324o, 8.0f);
                this.f78322m.setPadding(b, b, b, b);
                this.mRootView.addView(this.f78322m, layoutParams);
            }
            this.f78289Q = new C48010a(mo60197Z(), this.f78322m);
        }
        this.f78319g = aeVar;
        if (!f78273z) {
            this.mRootView.setBackgroundColor(this.f78324o.getResources().getColor(R.color.ip));
        }
        if (TextUtils.equals("upload", mo60210aa())) {
            this.f78278F.setEventType(null);
        }
        this.mLongPressLayout.setTapListener(onTouchListener);
        this.f78516h = DataCenter.m57235a(C23278c.m57254a(this.f78327r, this), (C0184k) this.f78327r);
        this.f78517i = C23279d.m57256a(this.f78327r, (View) this.mRootView);
        this.f78517i.mo48252a(this.f78516h);
        mo60241k();
        if (f78272ab.get(this.f78324o) == null) {
            f78272ab.put(this.f78324o, new C9379e());
        }
        ((C9379e) f78272ab.get(this.f78324o)).mo17005a(this);
        this.f78329t = new C30188c(view);
        if (this.f78278F.param.isHotSpot()) {
            View inflate = this.mFullFeedStub.inflate();
            if (inflate.findViewById(R.id.cr2) != null) {
                this.f78300ad = new C28231a(inflate, this.f78327r.getActivity());
            }
        }
        this.f78279G = VideoItemParams.newBuilder(baseFeedPageParams, this.f78287O, fragment, this.f78518j);
        if (C31030a.m72630a() && this.f78293U != null) {
            FrameLayout frameLayout = this.mRootView;
            View x = mo60254x();
            SmartImageView smartImageView = this.mCoverView;
            TextView textView = this.mlandscapeTipTv;
            View ao = this.f78275C.mo60526ao();
            DataCenter dataCenter = this.f78516h;
            VideoViewLandscapeHelper videoViewLandscapeHelper = new VideoViewLandscapeHelper(fragment, frameLayout, x, smartImageView, textView, ao, dataCenter, this.f78293U, mo60210aa(), this.f78278F.pageType);
            this.f78297Z = videoViewLandscapeHelper;
        }
        this.f78320k = C23724k.m58224b(C11010c.m22280a());
        this.f78314b = C23724k.m58229e(C11010c.m22280a());
        this.f78315c = C30360a.m71255a();
        this.f78316d = C30360a.f79280c;
        this.tagLayout.setEventType(mo60210aa());
        this.tagLayout.setFeedFromPage(this.f78299ac);
        this.mRootView.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                C30220a aVar = C30220a.f78947a;
                C30068bg bgVar = new C30068bg(i3, i, i2, i4, i5, i6, i7, i8);
                aVar.mo60570c(bgVar);
            }
        });
    }

    /* renamed from: a */
    private static boolean m70208a(UrlModel urlModel) {
        if (urlModel == null || urlModel.getUrlList() == null || urlModel.getUrlList().isEmpty()) {
            return false;
        }
        return true;
    }

    /* renamed from: f */
    public final void mo60237f(boolean z) {
        this.f78287O.mo53066c(z);
        if (z) {
            this.mWidgetContainer.animate().alpha(0.0f).setDuration(200).start();
            this.f78282J = true;
            return;
        }
        this.mWidgetContainer.animate().alpha(1.0f).setDuration(200).start();
        if (this.f78282J) {
            this.f78282J = false;
        }
    }

    /* renamed from: a */
    public final void mo60203a(Aweme aweme, int i) {
        this.f78328s = i;
        mo53996a(aweme);
    }

    /* renamed from: a */
    public static C30722a m70202a(Context context, BaseFeedPageParams baseFeedPageParams) {
        if (baseFeedPageParams == null) {
            return null;
        }
        return new C30064bc(baseFeedPageParams, context);
    }

    /* renamed from: a */
    private void m70207a(boolean z, boolean z2) {
        C23729p.m58265b(z, this.mCornerTL, this.mCornerTR);
        C23729p.m58265b(z2, this.mCornerBL, this.mCornerBR);
    }

    /* renamed from: c */
    private void m70213c(int i, int i2) {
        if (this.f78325p != null && this.f78325p.getVideo() != null) {
            this.f78325p.getVideo().setWidth(i);
            this.f78325p.getVideo().setHeight(i2);
            UrlModel originCover = this.f78325p.getVideo().getOriginCover();
            if (originCover != null) {
                originCover.setWidth(i);
                originCover.setHeight(i2);
            }
            try {
                this.f78330u.mo60787a(this.f78324o, this.f78325p.getVideo(), mo60254x(), (View) this.mCoverView, this.f78325p.getOcrLocation());
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
        }
    }

    /* renamed from: a */
    private void m70206a(Aweme aweme, Video video) {
        if (C31190f.m72839g(aweme)) {
            C30073bk.m70500a(this.mCoverView, this.f78324o, R.drawable.dhm);
        } else if (!C10181b.m20511a().mo18172a(CoverOptimizeExperiment.class, true, "enable_reuse_external_image", 31744, false) || this.f78278F.awemeFromPage != 2 || video.getCachedOuterCoverUrl() == null || video.getCachedOuterCoverUrl().getUrlList().isEmpty()) {
            m70218f(video);
        } else {
            C12208t a = C12203q.m24645a((Object) C23608p.m57874a(video.getCachedOuterCoverUrl()));
            if (video.getCachedOuterCoverSize() != null) {
                a.mo23125b(video.getCachedOuterCoverSize());
            }
            a.mo23118a("VideoViewHolder").mo23116a((C12197k) this.mCoverView).mo23119a(false).mo23122a((C12175j) new C30453i(this, this.f78283K));
        }
    }

    /* renamed from: a */
    private static JSONObject m70203a(Aweme aweme, BaseFeedPageParams baseFeedPageParams, String str) {
        return C31188d.m72825a(aweme, baseFeedPageParams.pageType, str, baseFeedPageParams.eventType);
    }

    /* renamed from: a */
    private void m70204a(int i, int i2, int i3, int i4, int i5) {
        String str;
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("aweme_id", C31190f.m72838f(this.f78325p));
            jSONObject.put("aweme_position", this.f78328s);
            jSONObject.put("video_server_width", i2);
            jSONObject.put("video_server_height", i3);
            jSONObject.put("video_player_width", i4);
            jSONObject.put("video_player_height", i5);
            jSONObject.put("event_type", mo60210aa());
            String str2 = "request_id";
            if (this.f78326q == null) {
                str = "";
            } else {
                str = this.f78326q.optString("request_id");
            }
            jSONObject.put(str2, str);
            StringBuilder sb = new StringBuilder("video_view_size_mismatch ");
            sb.append(jSONObject);
            C32458a.m75141a(4, "VideoViewHolder", sb.toString());
            C8936b.m17651a("video_view_size_mismatch", i, jSONObject);
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }
}
