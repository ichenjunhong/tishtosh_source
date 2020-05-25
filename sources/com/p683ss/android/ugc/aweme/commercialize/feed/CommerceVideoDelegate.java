package com.p683ss.android.ugc.aweme.commercialize.feed;

import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.graphics.PointF;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Build.VERSION;
import android.os.Handler;
import android.os.Looper;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.content.C0726c;
import android.text.TextUtils;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewStub;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.ButterKnife;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.crash.C9610j;
import com.bytedance.falconx.statistic.StatisticData;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.p558e.C9741d;
import com.bytedance.p879t.p881b.C13235c;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.drawee.p939e.C13816q.C13818b;
import com.facebook.drawee.p940f.C13833a;
import com.p683ss.android.ugc.aweme.antiaddic.lock.TimeLockRuler;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.C23556a;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.TagLayout;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.commerce.p1530b.C25493a;
import com.p683ss.android.ugc.aweme.commercialize.abtest.DouPlusShowV3Debug;
import com.p683ss.android.ugc.aweme.commercialize.abtest.UseNewMaskExperiment;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25770d;
import com.p683ss.android.ugc.aweme.commercialize.egg.C25823j;
import com.p683ss.android.ugc.aweme.commercialize.egg.CommerceEggLayout;
import com.p683ss.android.ugc.aweme.commercialize.egg.impl.service.CommerceEggServiceImpl;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1556a.C25746b;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1560e.C25778d;
import com.p683ss.android.ugc.aweme.commercialize.egg.p1561f.C25780a;
import com.p683ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1567a.C25865a;
import com.p683ss.android.ugc.aweme.commercialize.feed.p1568b.C25887a;
import com.p683ss.android.ugc.aweme.commercialize.indicationlink.AdIndicationLinkWidget;
import com.p683ss.android.ugc.aweme.commercialize.indicationlink.C25942a;
import com.p683ss.android.ugc.aweme.commercialize.link.C25973h;
import com.p683ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout;
import com.p683ss.android.ugc.aweme.commercialize.link.nationaltask.NationalTaskTagLayout;
import com.p683ss.android.ugc.aweme.commercialize.link.p1573a.C25948a.C25949a;
import com.p683ss.android.ugc.aweme.commercialize.link.staratlas.StarAtlasTagLayout;
import com.p683ss.android.ugc.aweme.commercialize.link.video.C25982a;
import com.p683ss.android.ugc.aweme.commercialize.link.video.C25993l;
import com.p683ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout;
import com.p683ss.android.ugc.aweme.commercialize.link.video.DouPlusLinkContent;
import com.p683ss.android.ugc.aweme.commercialize.link.video.DouPlusTagLayout;
import com.p683ss.android.ugc.aweme.commercialize.log.C26039af;
import com.p683ss.android.ugc.aweme.commercialize.log.C26053at;
import com.p683ss.android.ugc.aweme.commercialize.log.C26057av;
import com.p683ss.android.ugc.aweme.commercialize.log.C26060ay;
import com.p683ss.android.ugc.aweme.commercialize.log.C26072c;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26077e.C26080b;
import com.p683ss.android.ugc.aweme.commercialize.log.C26081f;
import com.p683ss.android.ugc.aweme.commercialize.log.C26087k;
import com.p683ss.android.ugc.aweme.commercialize.log.C26088l;
import com.p683ss.android.ugc.aweme.commercialize.model.C26105a;
import com.p683ss.android.ugc.aweme.commercialize.model.C26108ac;
import com.p683ss.android.ugc.aweme.commercialize.model.C26133n;
import com.p683ss.android.ugc.aweme.commercialize.model.C26138s;
import com.p683ss.android.ugc.aweme.commercialize.model.C26141u;
import com.p683ss.android.ugc.aweme.commercialize.p1544a.C25590b;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.AdRatingView;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.AdTagGroup;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25592b;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.DescTextView;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25713d;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25720j;
import com.p683ss.android.ugc.aweme.commercialize.p1555e.C25735b;
import com.p683ss.android.ugc.aweme.commercialize.playfun.AdPlayFunView;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26172e;
import com.p683ss.android.ugc.aweme.commercialize.playfun.C26173f;
import com.p683ss.android.ugc.aweme.commercialize.similaradvert.AdSimilarAdvertWidget;
import com.p683ss.android.ugc.aweme.commercialize.symphony.C26316g;
import com.p683ss.android.ugc.aweme.commercialize.symphony.C26317h;
import com.p683ss.android.ugc.aweme.commercialize.symphony.SymphonyAdManager;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26369ac;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26386al;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26408az;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26428bm;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26461ca;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26512f;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26515i;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26525l;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26540w;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1584d.C26504a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1584d.C26506c.C26507a;
import com.p683ss.android.ugc.aweme.commercialize.utils.p1584d.C26508d;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer;
import com.p683ss.android.ugc.aweme.commercialize.views.AdHalfWebPageMaskLayer;
import com.p683ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView;
import com.p683ss.android.ugc.aweme.commercialize.views.CircleWaveLayout;
import com.p683ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.AbsHalfWebPageAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.C26691e;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.C26691e.C26699a;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.C26709o;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.C26718p.C26719a;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.C26720q;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.CouponAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.DownloadAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.FormAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.GeneralAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.ImageAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.InteractAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.LandingPageAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.PoiAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.PollAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.SelectAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.ShopAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.SurveyAdCardAction;
import com.p683ss.android.ugc.aweme.commercialize.views.form.C26737b;
import com.p683ss.android.ugc.aweme.commercialize.widget.AdLightWebPageWidget;
import com.p683ss.android.ugc.aweme.commercialize.widget.AdPlayFunWidget;
import com.p683ss.android.ugc.aweme.commercialize.widget.AdPopUpWebPageWidget;
import com.p683ss.android.ugc.aweme.commercialize.widget.C26816b.C26817a;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.p1585a.C26822c;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.p1586b.C26825c;
import com.p683ss.android.ugc.aweme.commercialize_ad_api.service.ICommercializeAdService;
import com.p683ss.android.ugc.aweme.commercialize_x.service.CommercializeAdServiceImpl;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.experiment.C29500b;
import com.p683ss.android.ugc.aweme.feed.C31257z;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.adapter.C30020ak;
import com.p683ss.android.ugc.aweme.feed.adapter.C30030ar;
import com.p683ss.android.ugc.aweme.feed.experiment.CommonVideoOptimizeExperiment;
import com.p683ss.android.ugc.aweme.feed.helper.C30367g;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.AwemeTextLabelModel;
import com.p683ss.android.ugc.aweme.feed.model.CardStruct;
import com.p683ss.android.ugc.aweme.feed.model.CommentEggDataManager;
import com.p683ss.android.ugc.aweme.feed.model.NationalTaskLink;
import com.p683ss.android.ugc.aweme.feed.model.SpecialSticker;
import com.p683ss.android.ugc.aweme.feed.model.StarAtlasLink;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.feed.utils.C31186b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.main.C36512b;
import com.p683ss.android.ugc.aweme.main.MainActivity;
import com.p683ss.android.ugc.aweme.miniapp.card.C36867a;
import com.p683ss.android.ugc.aweme.miniapp.card.MicroAppVideoCardView;
import com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a;
import com.p683ss.android.ugc.aweme.p1257ab.p1258a.C20850b;
import com.p683ss.android.ugc.aweme.p1308ad.AdServiceImpl;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.p1311a.C22325a;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.p1311a.C22326b;
import com.p683ss.android.ugc.aweme.p1308ad.p1310b.p1311a.C22327c;
import com.p683ss.android.ugc.aweme.p1308ad.p1314e.p1317c.C22400a;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22448b;
import com.p683ss.android.ugc.aweme.p1308ad.view.C22449c;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.services.IFoundationAVService;
import com.p683ss.android.ugc.aweme.setting.experiment.C41599a;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45427bj;
import com.p683ss.android.ugc.aweme.shortvideo.util.C45431bm;
import com.p683ss.android.ugc.aweme.utils.C47719bg;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48299a;
import com.p683ss.android.ugc.aweme.web.jsbridge.C48299a.C48301b;
import com.p683ss.android.ugc.playerkit.videoview.C50130a;
import com.p683ss.android.ugc.playerkit.videoview.C50158g;
import com.p888c.p889a.p890a.p891a.p893b.p894a.C13391a;
import com.p888c.p889a.p890a.p891a.p897e.C13426e;
import com.ss.android.ugc.trill.R;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import org.json.JSONObject;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate */
public class CommerceVideoDelegate extends C25590b implements C0199s<C23274a>, C25880al {

    /* renamed from: B */
    private static final int f68283B = 2132017258;

    /* renamed from: a */
    public static final String f68284a = "CommerceVideoDelegate";

    /* renamed from: A */
    private ICommerceEggService f68285A;

    /* renamed from: C */
    private C23279d f68286C;

    /* renamed from: D */
    private C30313ae<C30332aw> f68287D;

    /* renamed from: E */
    private JSONObject f68288E;

    /* renamed from: F */
    private final C25845a f68289F = new C25845a();

    /* renamed from: G */
    private C25846b f68290G = null;

    /* renamed from: H */
    private C25887a f68291H;

    /* renamed from: I */
    private String f68292I;

    /* renamed from: J */
    private String f68293J;

    /* renamed from: K */
    private String f68294K;

    /* renamed from: L */
    private C25746b f68295L;

    /* renamed from: M */
    private C22448b f68296M;

    /* renamed from: N */
    private ArrayList<String> f68297N = new ArrayList<>();

    /* renamed from: O */
    private Boolean f68298O = null;

    /* renamed from: P */
    private C26691e f68299P;
    DmtTextView adAppUseNumber;
    CircleWaveLayout adCircleWaveLayout;
    LinearLayout adFeeDeductionLayout;
    DescTextView adGuideDesc;
    RemoteImageView adGuideIcon;
    RemoteImageView adGuideImage;
    DmtTextView adGuideLabel;
    DmtTextView adGuideName;
    DmtTextView adGuidePrice;
    DmtTextView adGuideService;
    DmtTextView adGuideTitle;
    RemoteImageView adGuideWebImage;
    AdHalfWebPageContainer adHalfWebPageContainer;
    View adLikeDivide;
    LinearLayout adLikeLayout;
    RemoteImageView adPendantIv;
    LinearLayout adPriceLayout;
    AdRatingView adRatingView;
    RemoteImageView adRedPacketIv;
    AdTagGroup adTagGroup;

    /* renamed from: b */
    public int f68300b;
    AdHalfWebPageMaskLayer blackMaskLayer;

    /* renamed from: c */
    public Aweme f68301c;

    /* renamed from: d */
    StarAtlasTagLayout f68302d;
    CommerceLikeLayout diggLayout;

    /* renamed from: e */
    NationalTaskTagLayout f68303e;
    CommerceEggLayout eggLayout;
    ViewStub eggViewStub;

    /* renamed from: f */
    public RelativeLayout f68304f;
    TextView feeDeductionHint;
    TextView feedAdDownloadBtn;
    LinearLayout feedAdLayout;
    View feedAdReplay;
    LinearLayout feedStarAtlasCheckLL;
    FrameLayout flAdGuideRoot;

    /* renamed from: g */
    public final C30016ag f68305g;

    /* renamed from: h */
    public DataCenter f68306h;

    /* renamed from: i */
    public String f68307i;
    LinearLayout introContainer;

    /* renamed from: j */
    public Context f68308j;

    /* renamed from: k */
    C26508d f68309k = new C26508d();

    /* renamed from: l */
    public C25908e f68310l = new C25908e();

    /* renamed from: m */
    Fragment f68311m;
    FrameLayout mBottomView;
    DmtTextView mCleanModeAdTag;
    View mCleanModeAdTagContainer;
    DouPlusTagLayout mDouPlusLinkTag;
    AnimationImageView mIvRelieveTag;
    CommerceTagLayout mLinkTag;
    CommerceMicroTagLayout mMicroTag;
    ViewStub mNationalTaskLinkViewStub;
    ButtonAdBottomLabelView mNativeAdBottomLabelView;
    ViewStub mStarAtlasLinkViewStub;

    /* renamed from: n */
    public boolean f68312n = false;

    /* renamed from: o */
    AdPlayFunWidget f68313o;

    /* renamed from: p */
    boolean f68314p = false;

    /* renamed from: q */
    public C25735b f68315q = new C25735b() {
    };

    /* renamed from: r */
    private int f68316r;

    /* renamed from: s */
    private boolean f68317s;
    DmtTextView starAtlasCheckHintTv;

    /* renamed from: t */
    private boolean f68318t;

    /* renamed from: u */
    private C25865a f68319u;

    /* renamed from: v */
    private FrameLayout f68320v;
    ViewGroup vastAdTag;
    RemoteImageView vastAdTagAdChoice;
    DmtTextView vastAdTagText;

    /* renamed from: w */
    private TagLayout f68321w;

    /* renamed from: x */
    private MicroAppVideoCardView f68322x;

    /* renamed from: y */
    private C26825c f68323y;

    /* renamed from: z */
    private C25780a f68324z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$a */
    class C25845a implements C26316g {

        /* renamed from: a */
        boolean f68344a;

        /* renamed from: c */
        private boolean m62587c() {
            return C31186b.m72812a(CommerceVideoDelegate.this.f68301c);
        }

        /* renamed from: a */
        public final void mo53101a() {
            if (!this.f68344a) {
                this.f68344a = true;
                if (!CommerceVideoDelegate.this.f68312n && m62587c()) {
                    C25493a a = C25493a.m62004a();
                    Aweme aweme = CommerceVideoDelegate.this.f68301c;
                    Context context = CommerceVideoDelegate.this.f68308j;
                    View x = CommerceVideoDelegate.this.f68305g.mo54004j().mo60254x();
                    int i = CommerceVideoDelegate.this.f68300b;
                    if (!C25493a.m62007b()) {
                        C32458a.m75144a("AdOM onPlayResume ");
                        if (i == 0) {
                            C13391a a2 = a.mo52097a(context, aweme, x);
                            if (a2 != null) {
                                C13426e.m27073b(a2.f34901a);
                                a2.f34901a.mo25100c().mo25129a("resume");
                            }
                        }
                        C26471cd.m64014a("resume", aweme);
                        C26088l.m63322b(context, "resume", aweme, C26088l.m63264a(context, aweme, "raw feed resume", false, C26088l.m63260a(a.f67429e + 1)));
                    }
                }
            }
        }

        /* renamed from: b */
        public final void mo53102b() {
            if (this.f68344a) {
                this.f68344a = false;
                if (!CommerceVideoDelegate.this.f68312n && m62587c()) {
                    C25493a a = C25493a.m62004a();
                    Aweme aweme = CommerceVideoDelegate.this.f68301c;
                    Context context = CommerceVideoDelegate.this.f68308j;
                    View x = CommerceVideoDelegate.this.f68305g.mo54004j().mo60254x();
                    int i = CommerceVideoDelegate.this.f68300b;
                    if (!C25493a.m62007b()) {
                        C32458a.m75144a("AdOM onPlayPause ");
                        if (i == 0) {
                            C13391a a2 = a.mo52097a(context, aweme, x);
                            if (a2 != null) {
                                C13426e.m27073b(a2.f34901a);
                                a2.f34901a.mo25100c().mo25129a("pause");
                            }
                        }
                        C26471cd.m64015a("pause", aweme, "play_pause");
                        C26088l.m63322b(context, "pause", aweme, C26088l.m63264a(context, aweme, "raw feed pause", false, C26088l.m63260a(a.f67429e + 1)));
                    }
                }
            }
        }

        private C25845a() {
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$b */
    static class C25846b implements Runnable {

        /* renamed from: a */
        final Handler f68346a = new Handler(Looper.getMainLooper());

        /* renamed from: b */
        private final WeakReference<CommerceVideoDelegate> f68347b;

        /* renamed from: a */
        public final void mo53103a() {
            this.f68346a.removeCallbacks(this);
            this.f68346a.postDelayed(this, 200);
        }

        public final void run() {
            CommerceVideoDelegate commerceVideoDelegate = (CommerceVideoDelegate) this.f68347b.get();
            if (commerceVideoDelegate != null) {
                Aweme aweme = commerceVideoDelegate.f68301c;
                long n = C48121w.m104249M().mo95256n();
                if (aweme != null && C26461ca.m63988e(aweme) && n >= C26461ca.m63989f(aweme) && !C26461ca.f69747b.mo54180c(aweme)) {
                    C26088l.m63282a(C11010c.m22280a(), aweme, "play");
                    C26461ca.f69747b.mo54179a(aweme, true);
                }
                mo53103a();
            }
        }

        C25846b(CommerceVideoDelegate commerceVideoDelegate) {
            this.f68347b = new WeakReference<>(commerceVideoDelegate);
        }
    }

    /* renamed from: b */
    public final boolean mo53063b() {
        return this.f68312n;
    }

    /* renamed from: c */
    public final C25908e mo53064c() {
        return this.f68310l;
    }

    /* renamed from: f */
    public final C25735b mo53071f() {
        return this.f68315q;
    }

    /* renamed from: k */
    public final C26720q mo53077k() {
        return this.f68299P;
    }

    /* renamed from: a */
    public final void mo53052a(Aweme aweme) {
        if (aweme != null) {
            aweme.setActivityId(this.f68292I);
            aweme.setNewSourceType(this.f68293J);
            aweme.setNewSourceId(this.f68294K);
            this.f68301c = aweme;
            this.f68310l.mo53241a(this.f68308j, aweme, this.f68307i);
            m62500I();
            m62496E();
            m62497F();
            if (aweme != null) {
                if (!this.f68317s) {
                    this.f68317s = true;
                    this.f68318t = C10181b.m20511a().mo18172a(DouPlusShowV3Debug.class, true, "douplus_show_v3_enable", 31744, false);
                }
                if (this.f68318t) {
                    C26890h.m65011a("show_dou_plus_video", C23089d.m56640a().mo47829a("group_id", aweme.getAid()).mo47829a("author_id", aweme.getAwemeRawAd() != null ? String.valueOf(aweme.getAwemeRawAd().getCreativeId()) : aweme.getAuthorUid()).f61491a);
                }
            }
            if (!(this.f68305g == null || this.f68305g.mo54004j() == null || this.f68305g.mo54004j().mo60254x() == null)) {
                C25493a.m62004a().mo52098a(this.f68301c, this.f68308j, true);
            }
        }
    }

    /* renamed from: a */
    public final void mo53048a(DataCenter dataCenter) {
        this.f68306h = dataCenter;
        if (this.f68306h != null) {
            this.f68306h.mo48226a("on_ad_light_web_page_show", (C0199s<C23274a>) this);
            this.f68306h.mo48226a("on_ad_light_web_page_hide", (C0199s<C23274a>) this);
            this.f68306h.mo48226a("AD_ACTION_MOVE_IN_DESC", (C0199s<C23274a>) this);
            this.f68306h.mo48226a("AD_ACTION_MOVE_OUT_DESC", (C0199s<C23274a>) this);
            this.f68306h.mo48226a("AD_ACTION_RESET_INTRO_CONTAINER_LOCATION", (C0199s<C23274a>) this);
            this.f68306h.mo48226a("on_ad_pop_up_web_page_show", (C0199s<C23274a>) this);
            this.f68306h.mo48226a("on_ad_pop_up_web_page_hide", (C0199s<C23274a>) this);
            this.f68306h.mo48226a("new_clean_mode", (C0199s<C23274a>) this);
            this.f68306h.mo48226a("ON_SIMILAR_ADVERT_SHOW", (C0199s<C23274a>) this);
            this.f68306h.mo48226a("ON_SIMILAR_ADVERT_HIDE", (C0199s<C23274a>) this);
            this.f68306h.mo48226a("AD_ACTION_REPLAY_VIDEO", (C0199s<C23274a>) this);
            this.f68306h.mo48226a("ON_INDICATION_LINK_DATA_RECEIVE", (C0199s<C23274a>) this);
        }
    }

    /* renamed from: a */
    public final void mo53049a(C23279d dVar) {
        this.f68286C = dVar;
        if (this.f68286C != null) {
            this.f68286C.mo48251a((View) null, (Widget) new AdLightWebPageWidget());
            this.f68286C.mo48251a((View) null, (Widget) new AdPopUpWebPageWidget());
            this.f68313o = new AdPlayFunWidget();
            this.f68286C.mo48255b(R.id.dx9, this.f68313o);
            this.f68286C.mo48255b(R.id.dxe, new AdSimilarAdvertWidget());
            this.f68286C.mo48255b(R.id.dwv, new AdIndicationLinkWidget());
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:37:0x0079  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x008f  */
    /* JADX WARNING: Removed duplicated region for block: B:48:0x0094  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean mo53058a(android.support.p030v4.app.C0654k r5, com.p683ss.android.ugc.playerkit.videoview.C50158g r6) {
        /*
            r4 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f68301c
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64061d(r0)
            r1 = 0
            if (r0 == 0) goto L_0x00da
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f68301c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            java.lang.String r0 = r0.getWebUrl()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x001b
            goto L_0x00da
        L_0x001b:
            java.util.ArrayList<java.lang.String> r0 = r4.f68297N
            boolean r0 = r0.isEmpty()
            if (r0 != 0) goto L_0x0024
            return r1
        L_0x0024:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f68301c
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26525l.m64174c(r0)
            r3 = 1
            if (r2 != 0) goto L_0x0036
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26525l.m64175d(r0)
            if (r0 == 0) goto L_0x0034
            goto L_0x0036
        L_0x0034:
            r0 = 0
            goto L_0x0037
        L_0x0036:
            r0 = 1
        L_0x0037:
            if (r0 == 0) goto L_0x0099
            com.ss.android.ugc.aweme.commercialize.views.AdHalfWebPageContainer r0 = r4.adHalfWebPageContainer
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r4.f68301c
            if (r0 == 0) goto L_0x0059
            boolean r0 = r0.mo54260a()
            if (r0 != r3) goto L_0x0059
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26525l.m64174c(r2)
            if (r0 == 0) goto L_0x0051
            int r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26525l.m64176e(r2)
            if (r0 == 0) goto L_0x0057
        L_0x0051:
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26525l.m64175d(r2)
            if (r0 == 0) goto L_0x0059
        L_0x0057:
            r0 = 1
            goto L_0x005a
        L_0x0059:
            r0 = 0
        L_0x005a:
            if (r0 == 0) goto L_0x005d
            return r1
        L_0x005d:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f68301c
            if (r0 == 0) goto L_0x0076
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r0 = r0.getAwemeRawAd()
            if (r0 == 0) goto L_0x0076
            java.util.Map r0 = r0.getCardInfos()
            if (r0 == 0) goto L_0x0076
            java.lang.String r2 = "5"
            java.lang.Object r0 = r0.get(r2)
            com.ss.android.ugc.aweme.feed.model.CardStruct r0 = (com.p683ss.android.ugc.aweme.feed.model.CardStruct) r0
            goto L_0x0077
        L_0x0076:
            r0 = 0
        L_0x0077:
            if (r0 == 0) goto L_0x008d
            java.lang.String r0 = r0.getCardUrl()
            if (r0 == 0) goto L_0x008d
            java.lang.CharSequence r0 = (java.lang.CharSequence) r0
            int r0 = r0.length()
            if (r0 <= 0) goto L_0x0089
            r0 = 1
            goto L_0x008a
        L_0x0089:
            r0 = 0
        L_0x008a:
            if (r0 != r3) goto L_0x008d
            r1 = 1
        L_0x008d:
            if (r1 == 0) goto L_0x0094
            boolean r5 = r4.m62506b(r5, r6)
            return r5
        L_0x0094:
            boolean r5 = r4.mo53059a(r6)
            return r5
        L_0x0099:
            android.content.Context r0 = r4.f68308j
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.feed.C25866aa.m62598a(r0)
            if (r0 != 0) goto L_0x00a6
            boolean r5 = r4.mo53059a(r6)
            return r5
        L_0x00a6:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f68301c
            java.lang.String r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64104F(r0)
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x00b7
            boolean r5 = r4.mo53059a(r6)
            return r5
        L_0x00b7:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f68301c
            java.lang.String r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64104F(r0)
            boolean r0 = com.p683ss.android.newmedia.C19547d.m47842a(r0)
            if (r0 != 0) goto L_0x00c8
            boolean r5 = r4.mo53059a(r6)
            return r5
        L_0x00c8:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r4.f68301c
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26369ac.m63812a(r0)
            if (r0 == 0) goto L_0x00d5
            boolean r5 = r4.m62506b(r5, r6)
            return r5
        L_0x00d5:
            boolean r5 = r4.mo53059a(r6)
            return r5
        L_0x00da:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.mo53058a(android.support.v4.app.k, com.ss.android.ugc.playerkit.videoview.g):boolean");
    }

    /* renamed from: a */
    public final boolean mo53059a(C50158g gVar) {
        if (mo53090w() || mo53088u() || this.f68310l.mo53250f()) {
            return false;
        }
        this.f68312n = true;
        if (m62494C()) {
            this.f68313o.mo54706a(true);
        }
        this.adHalfWebPageContainer.setInCleanMode(true);
        if (m62492A()) {
            this.f68296M.mo46619a((C22327c) new C25923t(gVar));
        } else {
            m62507b(gVar);
        }
        this.f68306h.mo48228a("ON_AD_COMMON_MASK_SHOW", (Object) null);
        return true;
    }

    /* renamed from: a */
    public final void mo53056a(boolean z) {
        mo53057a(z, true);
    }

    /* renamed from: a */
    public final void mo53057a(boolean z, final boolean z2) {
        if (m62492A()) {
            if (!this.f68296M.mo46620b()) {
                return;
            }
        } else if (this.feedAdLayout.getVisibility() == 8) {
            return;
        }
        if (m62494C()) {
            this.f68313o.mo54706a(false);
        }
        this.adHalfWebPageContainer.setInCleanMode(false);
        C30367g.m71282a().f79376e = false;
        this.f68312n = false;
        if (m62492A()) {
            this.f68296M.mo46618a(z, new C22326b() {
                /* renamed from: b */
                public final boolean mo46464b() {
                    if (!(CommerceVideoDelegate.this.f68308j instanceof MainActivity) || !C36512b.m82421a().f93584a) {
                        return false;
                    }
                    CommerceVideoDelegate.this.f68304f.setVisibility(4);
                    return true;
                }

                /* renamed from: a */
                public final void mo46463a() {
                    if (!C48121w.m104087I()) {
                        C48121w.m104249M().mo95291x();
                    } else {
                        C50158g a = CommerceVideoDelegate.m62502a(CommerceVideoDelegate.this.f68305g);
                        if (a != null) {
                            a.mo60214ae();
                        }
                    }
                    if (CommerceVideoDelegate.this.f68310l != null && z2) {
                        CommerceVideoDelegate.this.f68310l.mo53239a(2, CommerceVideoDelegate.this.f68300b + 1);
                    }
                }
            });
        } else {
            m62505b(z, z2);
        }
        this.f68306h.mo48228a("ON_AD_COMMON_MASK_HIDE", (Object) null);
    }

    /* renamed from: a */
    public final void mo53047a(C0654k kVar, boolean z, C50158g gVar) {
        if (this.f68312n) {
            this.f68312n = false;
            C26386al.m63840a(kVar, this.flAdGuideRoot, f68283B, z);
            if (C48121w.m104087I() && gVar != null && z) {
                gVar.mo60214ae();
            }
            this.f68306h.mo48228a("ON_AD_FORM_MASK_HIDE", (Object) null);
        }
    }

    /* renamed from: a */
    public final void mo53054a(String str) {
        this.f68309k.mo54202c();
    }

    /* renamed from: a */
    public final void mo53055a(JSONObject jSONObject) {
        this.f68288E = jSONObject;
    }

    /* renamed from: a */
    public final void mo53053a(C30669b bVar) {
        this.f68292I = bVar.getActivityId();
        this.f68293J = bVar.getNewSourceType();
        this.f68294K = bVar.getNewSourceId();
    }

    /* renamed from: a */
    public final void mo53051a(C25720j jVar) {
        this.f68306h.mo48228a("ad_on_receive_js_bridge_event", (Object) jVar);
    }

    /* renamed from: B */
    private void m62493B() {
        this.f68291H.mo53209b();
    }

    /* renamed from: m */
    public final void mo53079m() {
        this.mNativeAdBottomLabelView.mo54381i();
    }

    /* renamed from: p */
    public final void mo53083p() {
        this.mNativeAdBottomLabelView.mo54381i();
    }

    /* renamed from: t */
    public final void mo53087t() {
        this.mNativeAdBottomLabelView.mo54374g();
    }

    /* renamed from: C */
    private boolean m62494C() {
        if (!C26512f.m64109K(this.f68301c) || this.f68313o == null) {
            return false;
        }
        return true;
    }

    /* renamed from: I */
    private void m62500I() {
        if (this.f68301c != null) {
            m62498G();
            m62499H();
        }
    }

    /* renamed from: e */
    public final void mo53069e() {
        C25908e eVar = this.f68310l;
        if (eVar.f68448c != null) {
            eVar.f68448c.mo53172a(eVar.f68447b, eVar.f68446a);
        }
    }

    /* renamed from: o */
    public final void mo53081o() {
        if (this.f68299P != null) {
            C26691e eVar = this.f68299P;
            if (!eVar.f70354o) {
                eVar.mo54543e();
            }
        }
    }

    /* renamed from: x */
    public final void mo53091x() {
        this.f68306h.mo48228a("video_stop_dou_plus_guide_animation", (Object) null);
    }

    /* renamed from: i */
    public final void mo53075i() {
        if (this.f68304f != null) {
            C26525l.m64172a(this.f68308j, this.f68301c, this.adHalfWebPageContainer);
            this.f68291H.mo53208a();
        }
    }

    /* renamed from: l */
    public final void mo53078l() {
        if (this.f68299P != null) {
            this.f68299P.mo54539b();
        }
        this.f68299P = null;
        this.adHalfWebPageContainer.mo54265f();
    }

    /* renamed from: n */
    public final void mo53080n() {
        if (this.f68301c != null && this.f68301c.isAppAd()) {
            this.mNativeAdBottomLabelView.mo54373f();
        }
        if (this.f68299P != null) {
            C26691e eVar = this.f68299P;
            if (!eVar.f70354o) {
                eVar.mo54542d();
            }
        }
    }

    /* renamed from: u */
    public final boolean mo53088u() {
        Fragment fragment = this.f68311m;
        if (fragment == null || !(fragment instanceof C30020ak)) {
            return false;
        }
        return ((C30020ak) fragment).mo55943i();
    }

    /* renamed from: w */
    public final boolean mo53090w() {
        if (!(this.f68308j instanceof FragmentActivity) || !C26369ac.m63811a(((FragmentActivity) this.f68308j).getSupportFragmentManager())) {
            return false;
        }
        return true;
    }

    /* renamed from: A */
    private boolean m62492A() {
        if (this.f68298O == null) {
            this.f68298O = Boolean.valueOf(C10181b.m20511a().mo18172a(UseNewMaskExperiment.class, true, "use_new_mask", 31744, false));
        }
        return this.f68298O.booleanValue();
    }

    /* renamed from: D */
    private void m62495D() {
        if (this.f68320v != null && this.f68320v.findViewById(R.id.title) != null) {
            this.introContainer.setTranslationX(0.0f);
            this.introContainer.setTranslationY(0.0f);
            this.introContainer.setAlpha(1.0f);
            this.introContainer.setVisibility(0);
        }
    }

    /* renamed from: F */
    private void m62497F() {
        if (this.f68301c != null) {
            C26512f.m64144c();
            if (m62509d(this.f68301c)) {
                final NationalTaskLink nationalTaskLink = this.f68301c.getAwemeNationalTask().getNationalTaskLink();
                this.f68303e.mo53347a(nationalTaskLink, new C25982a() {
                    /* renamed from: c */
                    public final void mo53094c() {
                    }

                    /* renamed from: a */
                    public final void mo53092a() {
                        C26087k.m63252a(nationalTaskLink, CommerceVideoDelegate.this.f68301c, "show", false, CommerceVideoDelegate.this.f68307i);
                    }

                    /* renamed from: b */
                    public final void mo53093b() {
                        C26087k.m63252a(nationalTaskLink, CommerceVideoDelegate.this.f68301c, "click", false, CommerceVideoDelegate.this.f68307i);
                        C26540w.m64204a(CommerceVideoDelegate.this.f68308j, nationalTaskLink, CommerceVideoDelegate.this.f68301c, false);
                    }
                });
                this.f68303e.setVisibility(0);
                return;
            }
            if (this.f68303e != null) {
                this.f68303e.mo53346a();
                this.f68303e.setVisibility(8);
            }
        }
    }

    /* renamed from: J */
    private boolean m62501J() {
        if (!C29500b.m69638a(this.f68301c)) {
            return false;
        }
        if (this.f68301c.getFeedRelationLabel() != null || (this.f68301c.getRelationLabel() != null && this.f68301c.getRelationLabel().getType() == 5)) {
            return true;
        }
        return false;
    }

    /* renamed from: j */
    public final void mo53076j() {
        if (this.f68301c != null) {
            if (C25823j.f68267a && this.f68324z != null) {
                this.f68324z.mo52993a(new C25778d("like"));
            } else if (C25770d.f68145d) {
                this.eggLayout.mo52924a(C25770d.f68142a, this.f68295L);
            } else {
                this.diggLayout.mo54399a(this.f68307i, this.f68301c.getAid());
            }
        }
    }

    /* renamed from: s */
    public final void mo53086s() {
        this.f68306h.mo48228a("ad_video_on_pause_play", (Object) null);
        C25593c cVar = C25593c.f67757i;
        if (C25593c.m62131a(this.f68307i) && C25593c.f67755g != 0) {
            C25593c.f67756h += System.currentTimeMillis() - C25593c.f67755g;
            C25593c.f67755g = 0;
        }
    }

    /* renamed from: E */
    private void m62496E() {
        if (this.f68301c != null) {
            C26512f.m64144c();
            if (!m62508c(this.f68301c) || this.f68301c.getStarAtlasInfo() == null) {
                if (this.f68302d != null) {
                    this.f68302d.mo53351a();
                    this.f68302d.setVisibility(8);
                }
                return;
            }
            final StarAtlasLink starAtlasLink = this.f68301c.getStarAtlasInfo().getStarAtlasLink();
            this.f68302d.mo53352a(starAtlasLink, new C25982a() {
                /* renamed from: c */
                public final void mo53094c() {
                }

                /* renamed from: a */
                public final void mo53092a() {
                    C26087k.m63253a(starAtlasLink, CommerceVideoDelegate.this.f68301c, "show", false, CommerceVideoDelegate.this.f68307i);
                }

                /* renamed from: b */
                public final void mo53093b() {
                    C26087k.m63253a(starAtlasLink, CommerceVideoDelegate.this.f68301c, "click", false, CommerceVideoDelegate.this.f68307i);
                    C26540w.m64205a(CommerceVideoDelegate.this.f68308j, starAtlasLink, CommerceVideoDelegate.this.f68301c, false);
                    if (C26512f.m64066i(CommerceVideoDelegate.this.f68301c)) {
                        C26088l.m63348e(CommerceVideoDelegate.this.f68308j, CommerceVideoDelegate.this.f68301c, "common_link");
                    }
                }
            });
            this.f68302d.setVisibility(0);
        }
    }

    /* renamed from: G */
    private void m62498G() {
        if (!(this.f68301c == null || this.mLinkTag == null)) {
            if (m62504a(this.mLinkTag, this.f68301c)) {
                final C26138s a = C26428bm.m63902a(this.f68301c);
                if (a != null) {
                    C36983a.m83185b().mo76294a().preloadMiniApp(a.mpUrl);
                }
                this.mLinkTag.mo53354a(a, new C25993l() {

                    /* renamed from: a */
                    long f68340a;

                    /* renamed from: d */
                    private Runnable f68343d = new C25929z(this);

                    /* access modifiers changed from: 0000 */
                    /* renamed from: e */
                    public C25949a mo53100e() {
                        return new C25949a().mo53294a(a).mo53295a(CommerceVideoDelegate.this.f68301c).mo53297a(false);
                    }

                    /* renamed from: d */
                    public final void mo53099d() {
                        if (this.f68340a != 0) {
                            C26088l.m63274a(CommerceVideoDelegate.this.f68308j, mo53100e().mo53296a("show_over").mo53292a(0).mo53293a(System.currentTimeMillis() - this.f68340a).mo53298a());
                            this.f68340a = 0;
                            if (CommerceVideoDelegate.this.mLinkTag != null) {
                                CommerceVideoDelegate.this.mLinkTag.removeCallbacks(this.f68343d);
                            }
                        }
                    }

                    /* renamed from: a */
                    public final void mo53092a() {
                        C26088l.m63274a(CommerceVideoDelegate.this.f68308j, mo53100e().mo53296a("show").mo53292a(100).mo53298a());
                        C26087k.m63251a(a, CommerceVideoDelegate.this.f68301c, "show", false, CommerceVideoDelegate.this.f68307i);
                        this.f68340a = System.currentTimeMillis();
                        if (CommerceVideoDelegate.this.mLinkTag != null) {
                            CommerceVideoDelegate.this.mLinkTag.postDelayed(this.f68343d, 1000);
                        }
                        C26072c cVar = C26072c.f68845b;
                        Aweme aweme = CommerceVideoDelegate.this.f68301c;
                        C26138s sVar = a;
                        if (aweme != null && sVar != null) {
                            cVar.mo53560a("link", "show_result", sVar.creativeId, sVar.logExtra, aweme.getAid(), 0);
                        }
                    }

                    /* renamed from: b */
                    public final void mo53093b() {
                        C26088l.m63274a(CommerceVideoDelegate.this.f68308j, mo53100e().mo53296a("click").mo53292a(100).mo53298a());
                        C26087k.m63251a(a, CommerceVideoDelegate.this.f68301c, "click", false, CommerceVideoDelegate.this.f68307i);
                        C26540w.m64202a(CommerceVideoDelegate.this.f68308j, a, CommerceVideoDelegate.this.f68301c, false);
                        if (C26512f.m64064g(CommerceVideoDelegate.this.f68301c)) {
                            C26088l.m63275a(CommerceVideoDelegate.this.f68308j, a, CommerceVideoDelegate.this.f68301c, false);
                        }
                        if (C26512f.m64066i(CommerceVideoDelegate.this.f68301c)) {
                            C26088l.m63348e(CommerceVideoDelegate.this.f68308j, CommerceVideoDelegate.this.f68301c, "common_link");
                        }
                    }

                    /* renamed from: c */
                    public final void mo53094c() {
                        C26088l.m63274a(CommerceVideoDelegate.this.f68308j, mo53100e().mo53296a("close").mo53292a(0).mo53298a());
                        C26087k.m63251a(a, CommerceVideoDelegate.this.f68301c, "close", false, CommerceVideoDelegate.this.f68307i);
                        if (C26512f.m64064g(CommerceVideoDelegate.this.f68301c)) {
                            C26088l.m63275a(CommerceVideoDelegate.this.f68308j, a, CommerceVideoDelegate.this.f68301c, false);
                        }
                        mo53099d();
                    }
                });
                this.mLinkTag.setVisibility(0);
                return;
            }
            this.mLinkTag.mo53353a();
            this.mLinkTag.setVisibility(8);
        }
    }

    /* renamed from: r */
    public final void mo53085r() {
        this.f68306h.mo48228a("ad_video_on_resume_play", (Object) null);
        if (this.f68299P != null) {
            C26691e eVar = this.f68299P;
            if (!eVar.f70354o) {
                if (eVar.f70343d != null && eVar.f70343d.f69955a) {
                    eVar.f70343d.mo54293c();
                }
                if (eVar.f70348i != null && eVar.f70348i.f69955a) {
                    eVar.f70348i.mo54293c();
                }
            }
        }
        mo53047a(this.f68311m.getChildFragmentManager(), false, m62502a(this.f68305g));
        this.feedAdLayout.setAlpha(1.0f);
        this.feedAdLayout.animate().alpha(0.0f).setDuration(150).withEndAction(new C25928y(this)).start();
        C25593c cVar = C25593c.f67757i;
        if (C25593c.m62131a(this.f68307i)) {
            C25593c.f67755g = System.currentTimeMillis();
        }
    }

    /* renamed from: H */
    private void m62499H() {
        if (!(this.f68301c == null || this.mDouPlusLinkTag == null)) {
            if (C25973h.m62970a("dou+", this.f68301c, false, 0)) {
                final C26133n O = C26512f.m64113O(this.f68301c);
                DouPlusTagLayout douPlusTagLayout = this.mDouPlusLinkTag;
                C258372 r4 = new C25982a() {
                    /* renamed from: a */
                    public final void mo53092a() {
                    }

                    /* renamed from: c */
                    public final void mo53094c() {
                    }

                    /* renamed from: b */
                    public final void mo53093b() {
                        C26540w.m64253a(CommerceVideoDelegate.this.f68308j, CommerceVideoDelegate.this.f68301c, CommerceVideoDelegate.this.f68310l, 18, CommerceVideoDelegate.this.f68315q);
                        Context context = CommerceVideoDelegate.this.f68308j;
                        String str = "click";
                        C26133n nVar = O;
                        Aweme aweme = CommerceVideoDelegate.this.f68301c;
                        if (!(context == null || nVar == null || aweme == null || aweme.getAwemeRawAd() == null)) {
                            C26088l.m63300a(context, "draw_ad", str, C26088l.m63345e(context, aweme, "douplus link", "link"), C26088l.m63309b(aweme.getAwemeRawAd()), C26088l.m63258a(aweme));
                            if (C26503d.m64061d(aweme)) {
                                AwemeRawAd awemeRawAd = aweme.getAwemeRawAd();
                                C26060ay.f68819a.mo53545a("click", awemeRawAd.getClickTrackUrlList(), awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), (C52682m<? super C26080b, ? super Boolean, ? extends C26080b>) new C26039af<Object,Object,Object>(aweme));
                            }
                        }
                        C48301b.m104632a(CommerceVideoDelegate.this.f68301c);
                    }
                };
                C52711k.m112240b(O, "douPlusLinkData");
                C52711k.m112240b(r4, "commerceTagCallBack");
                DouPlusLinkContent douPlusLinkContent = new DouPlusLinkContent(douPlusTagLayout.getContext(), null, 0, 6, null);
                douPlusTagLayout.f68588a = douPlusLinkContent;
                DouPlusLinkContent douPlusLinkContent2 = douPlusTagLayout.f68588a;
                if (douPlusLinkContent2 == null) {
                    C52711k.m112234a();
                }
                C52711k.m112240b(r4, "commerceTagCallBack");
                douPlusLinkContent2.f68587d = r4;
                if (O == null) {
                    douPlusLinkContent2.f68584a.setImageResource(17170445);
                    douPlusLinkContent2.f68585b.setText("");
                } else {
                    ((C13833a) douPlusLinkContent2.f68584a.getHierarchy()).mo25907c((int) R.color.a2q);
                    UrlModel urlModel = O.avatarIcon;
                    if (urlModel == null || C9376b.m18558a((Collection<T>) urlModel.getUrlList())) {
                        douPlusLinkContent2.f68584a.setImageResource(17170445);
                    } else {
                        C23515d.m57669a(douPlusLinkContent2.f68584a, O.avatarIcon);
                    }
                    douPlusLinkContent2.f68586c.setVisibility(8);
                    douPlusLinkContent2.f68585b.setText(O.title);
                }
                douPlusTagLayout.removeAllViews();
                DouPlusLinkContent douPlusLinkContent3 = douPlusTagLayout.f68588a;
                if (douPlusLinkContent3 == null) {
                    C52711k.m112234a();
                }
                douPlusTagLayout.addView(douPlusLinkContent3);
                this.mDouPlusLinkTag.setVisibility(0);
                return;
            }
            DouPlusTagLayout douPlusTagLayout2 = this.mDouPlusLinkTag;
            douPlusTagLayout2.removeAllViews();
            douPlusTagLayout2.f68588a = null;
            this.mDouPlusLinkTag.setVisibility(8);
        }
    }

    /* renamed from: d */
    public final boolean mo53068d() {
        boolean z;
        boolean a = C26512f.m64057a(this.f68301c);
        if (C26512f.m64061d(this.f68301c) || !a) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            C10691a.m21542b(this.f68308j, (int) R.string.dm).mo19066a();
        }
        return z;
    }

    /* renamed from: h */
    public final void mo53074h() {
        this.f68306h.mo48228a("ad_feed_on_page_unselected", (Object) null);
        int hashCode = hashCode();
        if (C26408az.f69657a.containsKey(Integer.valueOf(hashCode))) {
            C26408az.f69657a.remove(Integer.valueOf(hashCode));
        }
        if (this.f68301c != null) {
            this.f68301c.setAdDescMaxLines(4);
            this.f68301c.setAdDescHandle(true);
        }
        if (C26317h.m63700c() == this.f68289F) {
            C26317h.m63699a(null);
        }
        mo53078l();
        m62493B();
        mo53047a(this.f68311m.getChildFragmentManager(), false, m62502a(this.f68305g));
        if (!CommonVideoOptimizeExperiment.m70942a() || this.f68301c.isAd()) {
            mo53056a(false);
        }
        if (!C25823j.f68267a || this.f68285A == null) {
            if (C25770d.f68145d) {
                C25770d.f68145d = false;
                this.eggLayout.mo52923a();
                C25770d.f68142a = null;
                this.f68295L = null;
            } else {
                this.diggLayout.mo54398a();
            }
            if (C25770d.f68146e) {
                C25770d.f68146e = false;
                this.eggLayout.mo52923a();
                C25770d.f68143b = null;
                C25770d.f68144c = null;
            } else {
                CommentEggDataManager.deleteCommentEggGroup(this.f68301c.getAid());
            }
        } else {
            this.f68285A.clearCommentData();
            if (this.f68324z != null) {
                this.f68324z.mo52992a();
            }
        }
        if (this.f68290G != null) {
            C25846b bVar = this.f68290G;
            bVar.f68346a.removeCallbacks(bVar);
        }
        if (m62504a(this.mLinkTag, this.f68301c)) {
            CommerceTagLayout commerceTagLayout = this.mLinkTag;
            if (commerceTagLayout.f68583a != null) {
                commerceTagLayout.f68583a.mo53359b();
            }
        }
        this.f68309k.mo54197a();
    }

    /* renamed from: q */
    public final void mo53084q() {
        this.f68306h.mo48228a("ad_on_fragment_resume", (Object) null);
        if (this.f68301c != null && this.f68301c.isAppAd()) {
            this.mNativeAdBottomLabelView.mo54373f();
        }
        if (m62494C()) {
            AdPlayFunView adPlayFunView = this.f68313o.f70631a;
            if (adPlayFunView != null) {
                C26173f fVar = adPlayFunView.f69057c;
                if (fVar == null) {
                    C52711k.m112237a("stateContext");
                }
                if (!C52711k.m112239a((Object) fVar.f69113b, (Object) "IdleState") && !C52711k.m112239a((Object) fVar.f69113b, (Object) "WidgetShowState") && !C52711k.m112239a((Object) fVar.f69113b, (Object) "FinishState")) {
                    C26172e eVar = (C26172e) fVar.f69120i.get(fVar.f69113b);
                    if (eVar != null) {
                        eVar.mo53782d();
                    }
                    fVar.f69113b = "WidgetShowState";
                    PointF c = fVar.mo53803c();
                    fVar.f69116e.setPivotX(((float) fVar.f69122k.f69106a) / 2.0f);
                    fVar.f69116e.setPivotY(((float) fVar.f69122k.f69106a) / 2.0f);
                    fVar.f69116e.setTranslationX(c.x);
                    fVar.f69116e.setTranslationY(c.y);
                    fVar.f69116e.setScaleX(fVar.f69122k.f69109d);
                    fVar.f69116e.setScaleY(fVar.f69122k.f69109d);
                    fVar.f69116e.setRotation(0.0f);
                    fVar.f69117f.setAlpha(0.0f);
                    fVar.f69115d.setAlpha(0.0f);
                    C26172e eVar2 = (C26172e) fVar.f69120i.get(fVar.f69113b);
                    if (eVar2 != null) {
                        eVar2.mo53778a();
                    }
                }
            }
        }
        C52711k.m112240b(this.f68308j, "context");
    }

    /* renamed from: v */
    public final void mo53089v() {
        boolean z;
        this.f68306h.mo48228a("ad_video_on_render_ready", (Object) null);
        C26053at.m63107c();
        if (this.f68301c != null && this.f68301c.isAd()) {
            long a = C26504a.m64084a(this.f68301c, m62502a(this.f68305g));
            if (a >= 6000) {
                this.f68309k.mo54200a(new C26507a().mo54193a(a).mo54192a(6000).mo54194a((Runnable) new C25917n(this)).mo54195a(true).mo54196a());
            }
            if (a >= 15000) {
                this.f68309k.mo54200a(new C26507a().mo54193a(a).mo54192a((int) IFoundationAVService.MUSIC_LENGTH_FOR_COPYRIGHT).mo54194a((Runnable) new C25918o(this)).mo54195a(true).mo54196a());
            }
            Aweme aweme = this.f68301c;
            if (aweme == null || !aweme.isAd() || C9376b.m18558a((Collection<T>) aweme.getAwemeRawAd().getPlaybackSecondsTrackList())) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                for (C26108ac acVar : this.f68301c.getAwemeRawAd().getPlaybackSecondsTrackList()) {
                    this.f68309k.mo54200a(new C26507a().mo54193a(a).mo54192a((int) Math.min((long) (acVar.f68917a * 1000), a)).mo54194a((Runnable) new C25919p(this, acVar)).mo54195a(true).mo54196a());
                }
            }
            this.f68309k.mo54201b();
        }
        C25593c cVar = C25593c.f67757i;
        if (C25593c.m62131a(this.f68307i)) {
            C25593c.f67755g = System.currentTimeMillis();
        }
    }

    /* renamed from: z */
    private void m62513z() {
        String[] appCategory;
        String str;
        String str2;
        this.adGuideImage.setVisibility(8);
        this.adGuideTitle.setVisibility(8);
        this.adGuideLabel.setVisibility(8);
        this.adPriceLayout.setVisibility(8);
        if (!TextUtils.isEmpty(this.f68301c.getDesc())) {
            this.adGuideDesc.setText(this.f68301c.getDesc());
            if (this.f68301c.getAwemeRawAd() != null && !TextUtils.isEmpty(this.f68301c.getAwemeRawAd().getAdMoreTextual())) {
                this.adGuideDesc.setMoreString(this.f68301c.getAwemeRawAd().getAdMoreTextual());
            }
            this.adGuideDesc.setViewLineHeight((int) C9432q.m18687b(this.f68308j, 20.0f));
            this.adGuideDesc.setImageSpanXAxisAdjust((int) C9432q.m18687b(this.f68308j, 4.0f));
        } else {
            this.adGuideDesc.setVisibility(8);
        }
        if (this.f68301c.getAuthor() == null || this.f68301c.getAuthor().getAvatarMedium() == null) {
            C23515d.m57676a(this.adGuideIcon, C23556a.m57755a(2131953301));
        } else {
            C23515d.m57669a(this.adGuideIcon, this.f68301c.getAuthor().getAvatarMedium());
        }
        if (this.f68301c.getAwemeRawAd() != null) {
            if (C26469cc.m63997a(this.f68301c, 3)) {
                DmtTextView dmtTextView = this.adGuideName;
                if (this.f68301c.getAwemeRawAd().getOmVast().vast.adTitle == null) {
                    str2 = "";
                } else {
                    str2 = this.f68301c.getAwemeRawAd().getOmVast().vast.adTitle;
                }
                dmtTextView.setText(str2);
            } else {
                DmtTextView dmtTextView2 = this.adGuideName;
                if (this.f68301c.getAuthor() == null) {
                    str = "";
                } else {
                    str = this.f68301c.getAuthor().getNickname();
                }
                dmtTextView2.setText(str);
            }
            if (TextUtils.isEmpty(this.f68301c.getAwemeRawAd().getAppInstall()) && this.f68301c.getAwemeRawAd().getAppLike() < 4.0f) {
                this.adLikeLayout.setVisibility(8);
            }
            if (TextUtils.isEmpty(this.f68301c.getAwemeRawAd().getAppInstall())) {
                this.adAppUseNumber.setVisibility(8);
                this.adLikeDivide.setVisibility(8);
            } else {
                this.adAppUseNumber.setText(this.f68301c.getAwemeRawAd().getAppInstall());
            }
            this.adRatingView.setRatingProgress(this.f68301c.getAwemeRawAd().getAppLike());
            if (this.f68301c.getAwemeRawAd().getAppLike() < 4.0f) {
                this.adRatingView.setVisibility(8);
                this.adLikeDivide.setVisibility(8);
            }
            if (this.f68301c.getAwemeRawAd().getAppCategory() == null || this.f68301c.getAwemeRawAd().getAppCategory().length == 0) {
                this.adTagGroup.setVisibility(8);
                return;
            }
            ArrayList arrayList = new ArrayList();
            for (String str3 : this.f68301c.getAwemeRawAd().getAppCategory()) {
                if (str3.length() <= 6) {
                    arrayList.add(str3);
                }
            }
            this.adTagGroup.setTagList((String[]) arrayList.toArray(new String[0]));
        }
    }

    /* renamed from: a */
    public final void mo53041a() {
        if (this.f68301c != null) {
            C47795d.m103430a((View) this.feedAdDownloadBtn, 0.75f);
            C47795d.m103429a(this.feedAdReplay);
            C47795d.m103429a(this.mBottomView);
            C47795d.m103430a((View) this.adGuideDesc, 0.75f);
            C47795d.m103430a((View) this.adGuideIcon, 0.75f);
            C47795d.m103430a((View) this.adLikeLayout, 0.75f);
            C47795d.m103430a((View) this.adGuideName, 0.75f);
            C47795d.m103430a((View) this.adTagGroup, 0.75f);
            if (this.f68310l.mo53244a() && this.f68306h != null) {
                this.f68306h.mo48228a("update_ad_user_follow_ui", (Object) Boolean.valueOf(true));
            }
        }
        if (C26512f.m64061d(this.f68301c)) {
            this.feedAdDownloadBtn.setText(C26369ac.m63810a(this.f68308j, this.f68301c, true));
            Drawable bVar = new C25592b((float) C23728o.m58241a(2.0d), this.f68308j.getResources().getColor(R.color.ss));
            if (C26512f.m64079v(this.f68301c)) {
                bVar = C47795d.m103428a(bVar.mutate(), C0726c.m2098c(this.f68308j, R.color.a1x));
            }
            this.feedAdDownloadBtn.setBackground(bVar);
        }
        this.mNativeAdBottomLabelView.mo54366a(this.f68301c, this.f68310l, this.f68306h);
        this.adHalfWebPageContainer.mo54265f();
        this.blackMaskLayer.setVisibility(8);
        m62510g(false);
        m62511h(false);
        if (C26469cc.m63997a(this.f68301c, 3)) {
            C26471cd.m64024e(this.f68301c);
        }
        this.f68322x.setVisibility(8);
        this.f68306h.mo48228a("ad_feed_video_params", (Object) new C26817a().mo54142a(new C25914k(this)).f69675a);
        C52711k.m112240b(this.f68301c, "aweme");
        Aweme aweme = this.f68301c;
        if (m62492A()) {
            C22448b bVar2 = this.f68296M;
            C22400a aVar = new C22400a();
            Context context = this.f68308j;
            C25908e eVar = this.f68310l;
            RelativeLayout relativeLayout = this.f68304f;
            String str = this.f68307i;
            C258383 r7 = new C22325a() {
                /* renamed from: a */
                public final void mo46460a() {
                    C25493a.m62004a();
                    C25493a.m62005a(CommerceVideoDelegate.this.f68308j, CommerceVideoDelegate.this.f68301c);
                }

                /* renamed from: a */
                public final void mo46461a(int i) {
                    C26540w.m64253a(CommerceVideoDelegate.this.f68308j, CommerceVideoDelegate.this.f68301c, CommerceVideoDelegate.this.f68310l, i, CommerceVideoDelegate.this.f68315q);
                }

                /* renamed from: a */
                public final void mo46462a(boolean z, boolean z2) {
                    CommerceVideoDelegate.this.mo53057a(z, z2);
                }
            };
            C52711k.m112240b(context, "context");
            C52711k.m112240b(aweme, "aweme");
            C52711k.m112240b(eVar, "adViewController");
            C52711k.m112240b(relativeLayout, "widgetContainer");
            C52711k.m112240b(str, "eventType");
            C52711k.m112240b(r7, "adMaskCallback");
            aVar.f60331a = context;
            aVar.f60332b = aweme;
            aVar.f60333c = eVar;
            aVar.f60335e = str;
            aVar.f60334d = r7;
            aVar.f60336f = relativeLayout;
            bVar2.mo46617a(aVar);
        }
    }

    /* renamed from: y */
    private void m62512y() {
        int i;
        String[] appCategory;
        String str;
        String str2;
        int i2;
        if (SymphonyAdManager.m63648a().mo53953a(this.f68308j, this.f68301c) || SymphonyAdManager.m63648a().mo53956b(this.f68308j, this.f68301c)) {
            this.feedAdLayout.setVisibility(8);
            if (!C26512f.m64070m(this.f68301c)) {
                this.f68304f.animate().cancel();
                this.f68304f.setAlpha(1.0f);
                if (this.f68308j instanceof MainActivity) {
                    RelativeLayout relativeLayout = this.f68304f;
                    if (C36512b.m82421a().f93584a) {
                        i2 = 4;
                    } else {
                        i2 = 0;
                    }
                    relativeLayout.setVisibility(i2);
                } else {
                    this.f68304f.setVisibility(0);
                }
            }
            if (!m62492A()) {
                if (this.f68301c.getAwemeRawAd() != null) {
                    i = this.f68301c.getAwemeRawAd().getNativeCardType();
                } else {
                    i = 0;
                }
                switch (i) {
                    case 0:
                        this.adGuideImage.setVisibility(8);
                        this.adGuideTitle.setVisibility(8);
                        this.adGuideLabel.setVisibility(8);
                        this.adPriceLayout.setVisibility(8);
                        this.adGuideIcon.setVisibility(8);
                        this.adGuideName.setVisibility(8);
                        this.adLikeLayout.setVisibility(8);
                        this.adGuideDesc.setVisibility(8);
                        if (this.f68301c.getAwemeRawAd() != null && this.f68301c.getAwemeRawAd().getAppCategory() != null && this.f68301c.getAwemeRawAd().getAppCategory().length != 0) {
                            ArrayList arrayList = new ArrayList();
                            for (String str3 : this.f68301c.getAwemeRawAd().getAppCategory()) {
                                if (str3.length() <= 6) {
                                    arrayList.add(str3);
                                }
                            }
                            this.adTagGroup.setTagList((String[]) arrayList.toArray(new String[0]));
                            break;
                        } else {
                            this.adTagGroup.setVisibility(8);
                            return;
                        }
                    case 1:
                        m62513z();
                        return;
                    case 2:
                        this.adGuideImage.setVisibility(8);
                        this.adGuideTitle.setVisibility(8);
                        this.adGuideLabel.setVisibility(8);
                        this.adPriceLayout.setVisibility(8);
                        this.adLikeLayout.setVisibility(8);
                        this.adTagGroup.setVisibility(8);
                        if (!TextUtils.isEmpty(this.f68301c.getDesc())) {
                            this.adGuideDesc.setText(this.f68301c.getDesc());
                            if (this.f68301c.getAwemeRawAd() != null && !TextUtils.isEmpty(this.f68301c.getAwemeRawAd().getAdMoreTextual())) {
                                this.adGuideDesc.setMoreString(this.f68301c.getAwemeRawAd().getAdMoreTextual());
                            }
                            this.adGuideDesc.setViewLineHeight((int) C9432q.m18687b(this.f68308j, 20.0f));
                            this.adGuideDesc.setImageSpanXAxisAdjust((int) C9432q.m18687b(this.f68308j, 4.0f));
                        } else {
                            this.adGuideDesc.setVisibility(8);
                        }
                        if (this.f68301c.getAuthor() == null || this.f68301c.getAuthor().getAvatarMedium() == null) {
                            C23515d.m57676a(this.adGuideIcon, C23556a.m57755a(2131953301));
                        } else {
                            C23515d.m57669a(this.adGuideIcon, this.f68301c.getAuthor().getAvatarMedium());
                        }
                        if (this.f68301c.getAwemeRawAd() != null) {
                            if (C26469cc.m63997a(this.f68301c, 3)) {
                                DmtTextView dmtTextView = this.adGuideName;
                                if (this.f68301c.getAwemeRawAd().getOmVast().vast.adTitle == null) {
                                    str2 = "";
                                } else {
                                    str2 = this.f68301c.getAwemeRawAd().getOmVast().vast.adTitle;
                                }
                                dmtTextView.setText(str2);
                                break;
                            } else {
                                DmtTextView dmtTextView2 = this.adGuideName;
                                if (this.f68301c.getAuthor() == null) {
                                    str = "";
                                } else {
                                    str = this.f68301c.getAuthor().getNickname();
                                }
                                dmtTextView2.setText(str);
                            }
                        }
                        return;
                    case 3:
                        this.adGuideIcon.setVisibility(8);
                        this.adGuideName.setVisibility(8);
                        this.adGuideDesc.setVisibility(8);
                        this.adTagGroup.setVisibility(8);
                        if (!(this.f68301c.getAwemeRawAd() == null || this.f68301c.getAwemeRawAd().getNativeCardInfo() == null)) {
                            C26141u nativeCardInfo = this.f68301c.getAwemeRawAd().getNativeCardInfo();
                            if (TextUtils.isEmpty(nativeCardInfo.imageUrl)) {
                                ((C13833a) this.adGuideImage.getHierarchy()).mo25898a(C13818b.f36065e);
                                C23515d.m57676a(this.adGuideImage, C23556a.m57755a(R.drawable.adz));
                            } else {
                                ((C13833a) this.adGuideImage.getHierarchy()).mo25898a(C13818b.f36061a);
                                C23515d.m57677a(this.adGuideImage, nativeCardInfo.imageUrl);
                            }
                            if (TextUtils.isEmpty(nativeCardInfo.title)) {
                                this.adGuideTitle.setVisibility(8);
                            } else {
                                this.adGuideTitle.setText(nativeCardInfo.title);
                            }
                            if (TextUtils.isEmpty(nativeCardInfo.featureLabel)) {
                                this.adGuideLabel.setVisibility(8);
                            } else {
                                this.adGuideLabel.setText(nativeCardInfo.featureLabel);
                            }
                            if (nativeCardInfo.feedbackRate < 80) {
                                this.adLikeLayout.setVisibility(8);
                            } else if (nativeCardInfo.feedbackRate < 90) {
                                this.adRatingView.setRatingProgress(4.0f);
                                DmtTextView dmtTextView3 = this.adAppUseNumber;
                                StringBuilder sb = new StringBuilder();
                                sb.append(nativeCardInfo.feedbackRate);
                                sb.append(this.f68308j.getString(R.string.b9l));
                                dmtTextView3.setText(sb.toString());
                            } else if (nativeCardInfo.feedbackRate <= 100) {
                                this.adRatingView.setRatingProgress(5.0f);
                                DmtTextView dmtTextView4 = this.adAppUseNumber;
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(nativeCardInfo.feedbackRate);
                                sb2.append(this.f68308j.getString(R.string.b9l));
                                dmtTextView4.setText(sb2.toString());
                            } else {
                                this.adRatingView.setRatingProgress(5.0f);
                                DmtTextView dmtTextView5 = this.adAppUseNumber;
                                StringBuilder sb3 = new StringBuilder(StatisticData.ERROR_CODE_NOT_FOUND);
                                sb3.append(this.f68308j.getString(R.string.b9l));
                                dmtTextView5.setText(sb3.toString());
                            }
                            this.adGuidePrice.setText(nativeCardInfo.originPrice);
                            this.adGuideService.setText(nativeCardInfo.service);
                            return;
                        }
                    case 4:
                        this.adGuideTitle.setVisibility(8);
                        this.adGuideLabel.setVisibility(8);
                        this.adPriceLayout.setVisibility(8);
                        this.adGuideIcon.setVisibility(8);
                        this.adGuideName.setVisibility(8);
                        this.adLikeLayout.setVisibility(8);
                        this.adGuideDesc.setVisibility(8);
                        this.adGuideImage.setVisibility(8);
                        if (!(this.f68301c.getAwemeRawAd() == null || this.f68301c.getAwemeRawAd().getNativeCardInfo() == null)) {
                            C26141u nativeCardInfo2 = this.f68301c.getAwemeRawAd().getNativeCardInfo();
                            this.adGuideWebImage.setVisibility(0);
                            C23515d.m57669a(this.adGuideWebImage, nativeCardInfo2.image);
                            return;
                        }
                    default:
                        m62513z();
                        break;
                }
            } else {
                this.f68296M.mo46616a();
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:170:0x03d5  */
    /* JADX WARNING: Removed duplicated region for block: B:171:0x03da  */
    /* JADX WARNING: Removed duplicated region for block: B:234:0x012a A[SYNTHETIC] */
    /* JADX WARNING: Removed duplicated region for block: B:60:0x01a1  */
    /* renamed from: g */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53073g() {
        /*
            r14 = this;
            com.ss.android.ugc.aweme.arch.widgets.base.DataCenter r0 = r14.f68306h
            java.lang.String r1 = "ad_feed_on_page_selected"
            r2 = 0
            r0.mo48228a(r1, r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r14.f68301c
            if (r0 == 0) goto L_0x0037
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r14.f68301c
            boolean r0 = r0.isAd()
            if (r0 == 0) goto L_0x0037
            int r0 = r14.hashCode()
            com.ss.android.ugc.aweme.commercialize.model.c$a r1 = new com.ss.android.ugc.aweme.commercialize.model.c$a
            r1.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            com.ss.android.ugc.aweme.commercialize.model.c$a r1 = r1.mo53633a(r3)
            T r1 = r1.f69675a
            com.ss.android.ugc.aweme.commercialize.model.c r1 = (com.p683ss.android.ugc.aweme.commercialize.model.C26116c) r1
            java.lang.String r3 = "adInfo"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r3)
            java.util.LinkedHashMap<java.lang.Integer, com.ss.android.ugc.aweme.commercialize.model.c> r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26408az.f69657a
            java.util.Map r3 = (java.util.Map) r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
            r3.put(r0, r1)
        L_0x0037:
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$a r0 = r14.f68289F
            r1 = 1
            r0.f68344a = r1
            r0 = 0
            r14.f68312n = r0
            r14.f68314p = r0
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$a r3 = r14.f68289F
            com.p683ss.android.ugc.aweme.commercialize.symphony.C26317h.m63699a(r3)
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.egg.C25823j.f68267a
            if (r3 == 0) goto L_0x00bb
            com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService r3 = r14.f68285A
            if (r3 == 0) goto L_0x00bb
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            com.ss.android.ugc.aweme.feed.model.ItemLikeEggData r3 = r3.getCommerceAdLikeDigg()
            if (r3 == 0) goto L_0x0096
            com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService r3 = r14.f68285A
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r4 = new com.ss.android.ugc.aweme.commercialize.egg.e.a$a
            r4.<init>()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r14.f68301c
            com.ss.android.ugc.aweme.feed.model.ItemLikeEggData r5 = r5.getCommerceAdLikeDigg()
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r4 = r4.mo52975a(r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r14.f68301c
            java.lang.String r5 = r5.getAid()
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r4 = r4.mo52976a(r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r14.f68301c
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getAuthor()
            java.lang.String r5 = r5.getUid()
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r4 = r4.mo52978b(r5)
            java.lang.String r5 = r14.f68307i
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r4 = r4.mo52979c(r5)
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r14.f68301c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r5.getAwemeRawAd()
            com.ss.android.ugc.aweme.commercialize.egg.e.a$a r4 = r4.mo52974a(r5)
            com.ss.android.ugc.aweme.commercialize.egg.e.a r4 = r4.mo52977a()
            r3.addCommerceEggData(r4)
        L_0x0096:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            com.ss.android.ugc.aweme.feed.model.ItemCommentEggGroup r3 = r3.getCommentEggGroup()
            if (r3 == 0) goto L_0x01ce
            com.ss.android.ugc.aweme.commercialize.egg.service.ICommerceEggService r3 = r14.f68285A
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.f68301c
            java.lang.String r4 = r4.getAid()
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r14.f68301c
            com.ss.android.ugc.aweme.profile.model.User r5 = r5.getAuthor()
            java.lang.String r5 = r5.getUid()
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r14.f68301c
            com.ss.android.ugc.aweme.feed.model.ItemCommentEggGroup r6 = r6.getCommentEggGroup()
            r3.preloadCommentData(r4, r5, r6, r1)
            goto L_0x01ce
        L_0x00bb:
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.egg.C25788h.m62410a()
            com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.f68145d = r3
            if (r3 == 0) goto L_0x00d8
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            com.ss.android.ugc.aweme.commercialize.egg.b r3 = com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.m62387a(r3, r1)
            com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.f68142a = r3
            if (r3 == 0) goto L_0x00df
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            java.lang.String r4 = r14.f68307i
            com.ss.android.ugc.aweme.commercialize.egg.a.b r3 = com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.m62386a(r3, r4)
            r14.f68295L = r3
            goto L_0x00df
        L_0x00d8:
            com.ss.android.ugc.aweme.commercialize.views.CommerceLikeLayout r3 = r14.diggLayout
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.f68301c
            r3.setCommerceDigg(r4)
        L_0x00df:
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.egg.C25788h.m62411b()
            com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.f68146e = r3
            if (r3 == 0) goto L_0x01bf
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            if (r3 == 0) goto L_0x01ac
            com.ss.android.ugc.aweme.feed.model.ItemCommentEggGroup r4 = r3.getCommentEggGroup()
            if (r4 == 0) goto L_0x01ac
            java.util.List r4 = r4.getCommentEggData()
            if (r4 == 0) goto L_0x01ac
            com.ss.android.ugc.aweme.commercialize.egg.e r13 = new com.ss.android.ugc.aweme.commercialize.egg.e
            java.lang.String r6 = "comment"
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r3.getAwemeRawAd()
            if (r5 == 0) goto L_0x0107
            java.lang.String r5 = r5.getCreativeIdStr()
            r7 = r5
            goto L_0x0108
        L_0x0107:
            r7 = r2
        L_0x0108:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r3.getAwemeRawAd()
            if (r5 == 0) goto L_0x0114
            java.lang.String r5 = r5.getLogExtra()
            r8 = r5
            goto L_0x0115
        L_0x0114:
            r8 = r2
        L_0x0115:
            java.lang.String r9 = r3.getAid()
            r10 = 0
            r11 = 16
            r12 = 0
            r5 = r13
            r5.<init>(r6, r7, r8, r9, r10, r11, r12)
            java.util.ArrayList r3 = new java.util.ArrayList
            r3.<init>()
            java.util.Iterator r4 = r4.iterator()
        L_0x012a:
            boolean r5 = r4.hasNext()
            if (r5 == 0) goto L_0x01a8
            java.lang.Object r5 = r4.next()
            com.ss.android.ugc.aweme.feed.model.ItemCommentEggData r5 = (com.p683ss.android.ugc.aweme.feed.model.ItemCommentEggData) r5
            boolean r6 = com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.m62389a(r5)
            if (r6 == 0) goto L_0x012a
            if (r5 == 0) goto L_0x019e
            java.lang.String r6 = r5.getMaterialUrl()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x014f
            int r6 = r6.length()
            if (r6 != 0) goto L_0x014d
            goto L_0x014f
        L_0x014d:
            r6 = 0
            goto L_0x0150
        L_0x014f:
            r6 = 1
        L_0x0150:
            if (r6 != 0) goto L_0x019e
            java.lang.String r6 = r5.getFileType()
            java.lang.CharSequence r6 = (java.lang.CharSequence) r6
            if (r6 == 0) goto L_0x0163
            int r6 = r6.length()
            if (r6 != 0) goto L_0x0161
            goto L_0x0163
        L_0x0161:
            r6 = 0
            goto L_0x0164
        L_0x0163:
            r6 = 1
        L_0x0164:
            if (r6 == 0) goto L_0x0167
            goto L_0x019e
        L_0x0167:
            com.ss.android.ugc.aweme.commercialize.egg.c r6 = new com.ss.android.ugc.aweme.commercialize.egg.c
            java.lang.String r7 = r5.getMaterialUrl()
            java.lang.String r8 = "rawData.materialUrl"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            java.lang.String r8 = r5.getFileType()
            java.lang.String r9 = "rawData.fileType"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            r6.<init>(r7, r8)
            com.ss.android.ugc.aweme.commercialize.egg.a r7 = new com.ss.android.ugc.aweme.commercialize.egg.a
            java.lang.String r8 = r5.getEggId()
            java.lang.String r9 = r5.getRegex()
            java.lang.String r10 = r5.getWebUrl()
            java.lang.String r5 = r5.getOpenUrl()
            r7.<init>(r8, r9, r10, r5)
            r6.f68128b = r7
            r6.f68127a = r1
            r6.f68129c = r13
            com.ss.android.ugc.aweme.commercialize.egg.b r5 = r6.mo52961a()
            goto L_0x019f
        L_0x019e:
            r5 = r2
        L_0x019f:
            if (r5 == 0) goto L_0x012a
            r3.add(r5)
            com.p683ss.android.ugc.aweme.commercialize.egg.C25782g.m62404a(r5)
            goto L_0x012a
        L_0x01a8:
            java.util.List r3 = (java.util.List) r3
            com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.f68143b = r3
        L_0x01ac:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            if (r3 == 0) goto L_0x01bb
            com.ss.android.ugc.aweme.feed.model.ItemCommentEggGroup r3 = r3.getCommentEggGroup()
            if (r3 == 0) goto L_0x01bb
            java.util.List r3 = r3.getEditintist()
            goto L_0x01bc
        L_0x01bb:
            r3 = r2
        L_0x01bc:
            com.p683ss.android.ugc.aweme.commercialize.egg.C25770d.f68144c = r3
            goto L_0x01ce
        L_0x01bf:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            java.lang.String r3 = r3.getAid()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.f68301c
            com.ss.android.ugc.aweme.feed.model.ItemCommentEggGroup r4 = r4.getCommentEggGroup()
            com.p683ss.android.ugc.aweme.feed.model.CommentEggDataManager.putCommentEggGroup(r3, r4)
        L_0x01ce:
            boolean r3 = com.p683ss.android.ugc.aweme.feed.experiment.CommonVideoOptimizeExperiment.m70942a()
            if (r3 == 0) goto L_0x01d8
            r14.m62498G()
            goto L_0x01db
        L_0x01d8:
            r14.m62500I()
        L_0x01db:
            r14.m62496E()
            r14.m62497F()
            com.ss.android.ugc.aweme.feed.adapter.ag r3 = r14.f68305g
            if (r3 == 0) goto L_0x0222
            com.ss.android.ugc.aweme.feed.adapter.ag r3 = r14.f68305g
            com.ss.android.ugc.aweme.feed.adapter.ae r3 = r3.mo54004j()
            if (r3 == 0) goto L_0x0222
            com.ss.android.ugc.aweme.feed.adapter.ag r3 = r14.f68305g
            com.ss.android.ugc.aweme.feed.adapter.ae r3 = r3.mo54004j()
            android.view.View r3 = r3.mo60254x()
            if (r3 == 0) goto L_0x0222
            com.ss.android.ugc.aweme.commerce.b.a r3 = com.p683ss.android.ugc.aweme.commerce.p1530b.C25493a.m62004a()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.f68301c
            android.content.Context r5 = r14.f68308j
            com.ss.android.ugc.aweme.feed.adapter.ag r6 = r14.f68305g
            com.ss.android.ugc.aweme.feed.adapter.ae r6 = r6.mo54004j()
            android.view.View r6 = r6.mo60254x()
            com.ss.android.ugc.aweme.app.SharePrefCache r7 = com.p683ss.android.ugc.aweme.app.SharePrefCache.inst()
            com.ss.android.ugc.aweme.app.bf r7 = r7.getEnableBindItemCallOMSDK()
            java.lang.Object r7 = r7.mo47782d()
            java.lang.Integer r7 = (java.lang.Integer) r7
            int r7 = r7.intValue()
            if (r7 == 0) goto L_0x0222
            r3.mo52097a(r5, r4, r6)
        L_0x0222:
            boolean r3 = com.p683ss.android.ugc.aweme.feed.experiment.CommonVideoOptimizeExperiment.m70942a()
            if (r3 == 0) goto L_0x024b
            com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout r3 = r14.mLinkTag
            if (r3 == 0) goto L_0x0239
            com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout r3 = r14.mLinkTag
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0239
            com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout r3 = r14.mLinkTag
            r3.mo53355b()
        L_0x0239:
            com.ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout r3 = r14.mMicroTag
            if (r3 == 0) goto L_0x026c
            com.ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout r3 = r14.mMicroTag
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x026c
            com.ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout r3 = r14.mMicroTag
            r3.mo53340a()
            goto L_0x026c
        L_0x024b:
            com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout r3 = r14.mLinkTag
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.f68301c
            boolean r3 = r14.m62504a(r3, r4)
            if (r3 == 0) goto L_0x025a
            com.ss.android.ugc.aweme.commercialize.link.video.CommerceTagLayout r3 = r14.mLinkTag
            r3.mo53355b()
        L_0x025a:
            com.ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout r3 = r14.mMicroTag
            if (r3 == 0) goto L_0x026c
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            r4 = 6
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.link.C25973h.m62976c(r3, r0, r0, r4, r2)
            if (r3 == 0) goto L_0x026c
            com.ss.android.ugc.aweme.commercialize.link.micro.CommerceMicroTagLayout r3 = r14.mMicroTag
            r3.mo53340a()
        L_0x026c:
            com.ss.android.ugc.aweme.commercialize.link.staratlas.StarAtlasTagLayout r3 = r14.f68302d
            if (r3 == 0) goto L_0x0285
            com.ss.android.ugc.aweme.commercialize.link.staratlas.StarAtlasTagLayout r3 = r14.f68302d
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x0285
            com.ss.android.ugc.aweme.commercialize.link.staratlas.StarAtlasTagLayout r3 = r14.f68302d
            com.ss.android.ugc.aweme.commercialize.link.staratlas.StarAtlasLinkContent r3 = r3.f68582a
            if (r3 == 0) goto L_0x0285
            com.ss.android.ugc.aweme.commercialize.link.video.a r3 = r3.f68579a
            if (r3 == 0) goto L_0x0285
            r3.mo53092a()
        L_0x0285:
            com.ss.android.ugc.aweme.commercialize.link.nationaltask.NationalTaskTagLayout r3 = r14.f68303e
            if (r3 == 0) goto L_0x029e
            com.ss.android.ugc.aweme.commercialize.link.nationaltask.NationalTaskTagLayout r3 = r14.f68303e
            int r3 = r3.getVisibility()
            if (r3 != 0) goto L_0x029e
            com.ss.android.ugc.aweme.commercialize.link.nationaltask.NationalTaskTagLayout r3 = r14.f68303e
            com.ss.android.ugc.aweme.commercialize.link.nationaltask.NationalTaskLinkContent r3 = r3.f68578a
            if (r3 == 0) goto L_0x029e
            com.ss.android.ugc.aweme.commercialize.link.video.a r3 = r3.f68575a
            if (r3 == 0) goto L_0x029e
            r3.mo53092a()
        L_0x029e:
            com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView r3 = r14.mNativeAdBottomLabelView
            r3.mo54390m()
            r14.m62495D()
            r14.mo53078l()
            r14.m62493B()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            if (r3 == 0) goto L_0x0306
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            boolean r3 = r3.isAd()
            if (r3 == 0) goto L_0x0306
            com.ss.android.ugc.aweme.common.MobClick r3 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r4 = "ad_show"
            com.ss.android.ugc.aweme.common.MobClick r3 = r3.setEventName(r4)
            com.ss.android.ugc.aweme.app.f.c r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23088c.m56631a()
            java.lang.String r5 = "request_id"
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r6 = com.p683ss.android.ugc.aweme.awemeservice.C23325e.m57379a()
            com.ss.android.ugc.aweme.awemeservice.api.IRequestIdService r6 = (com.p683ss.android.ugc.aweme.awemeservice.api.IRequestIdService) r6
            com.ss.android.ugc.aweme.feed.model.Aweme r7 = r14.f68301c
            int r8 = r14.f68316r
            java.lang.String r6 = r6.getRequestId(r7, r8)
            com.ss.android.ugc.aweme.app.f.c r4 = r4.mo47824a(r5, r6)
            org.json.JSONObject r4 = r4.mo47825b()
            com.ss.android.ugc.aweme.common.MobClick r3 = r3.setJsonObject(r4)
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.f68301c
            java.lang.String r4 = r4.getAid()
            com.ss.android.ugc.aweme.common.MobClick r3 = r3.setExtValueString(r4)
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            boolean r3 = com.p683ss.android.ugc.aweme.longvideo.p1934b.C36353b.m82038a(r3)
            if (r3 == 0) goto L_0x0306
            android.content.Context r3 = r14.f68308j
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.f68301c
            java.lang.String r5 = "show_complete"
            java.lang.String r6 = "long video raw ad label show"
            org.json.JSONObject r6 = com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63373m(r3, r4, r6)
            com.p683ss.android.ugc.aweme.commercialize.log.C26088l.m63322b(r3, r5, r4, r6)
        L_0x0306:
            r14.m62511h(r1)
            boolean r3 = com.p683ss.android.ugc.aweme.feed.experiment.CommonVideoOptimizeExperiment.m70942a()
            if (r3 == 0) goto L_0x0317
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            boolean r3 = r3.isAd()
            if (r3 == 0) goto L_0x031a
        L_0x0317:
            r14.m62512y()
        L_0x031a:
            com.ss.android.ugc.aweme.commercialize.views.CircleWaveLayout r3 = r14.adCircleWaveLayout
            boolean r4 = r3.f70086e
            if (r4 == 0) goto L_0x0331
            boolean r4 = r3.f70087f
            if (r4 == 0) goto L_0x0331
            com.ss.android.ugc.aweme.commercialize.feed.an r4 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r5 = r3.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.f70085d
            r4.mo53145i(r5, r3)
        L_0x0331:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            if (r3 == 0) goto L_0x0353
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            boolean r3 = r3.isAppAd()
            if (r3 == 0) goto L_0x0353
            com.ss.android.ugc.aweme.commercialize.views.ButtonAdBottomLabelView r3 = r14.mNativeAdBottomLabelView
            r3.mo54373f()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            if (r3 == 0) goto L_0x0353
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r3 = r3.getAwemeRawAd()
            r3.setCardOnceClick(r0)
        L_0x0353:
            r14.m62510g(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26461ca.m63988e(r3)
            if (r3 == 0) goto L_0x036e
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$b r3 = r14.f68290G
            if (r3 != 0) goto L_0x0369
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$b r3 = new com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$b
            r3.<init>(r14)
            r14.f68290G = r3
        L_0x0369:
            com.ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate$b r3 = r14.f68290G
            r3.mo53103a()
        L_0x036e:
            com.ss.android.ugc.aweme.commercialize.utils.d.d r3 = r14.f68309k
            r3.mo54197a()
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26512f.m64123Y(r3)
            if (r3 == 0) goto L_0x03e9
            com.ss.android.ugc.aweme.miniapp_api.services.a r3 = com.p683ss.android.ugc.aweme.miniapp_api.services.C36983a.m83185b()
            com.ss.android.ugc.aweme.miniapp_api.services.IMiniAppService r3 = r3.mo76294a()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.f68301c
            if (r4 == 0) goto L_0x03b3
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r4.getAwemeRawAd()
            if (r5 == 0) goto L_0x03b3
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r4.getAwemeRawAd()
            java.lang.String r5 = r5.getOpenUrl()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r4 = r4.getAwemeRawAd()
            java.lang.String r4 = r4.getMicroAppUrl()
            boolean r6 = com.p683ss.android.ugc.aweme.miniapp_api.C36949e.m83168d(r5)
            if (r6 == 0) goto L_0x03a8
            java.lang.String r4 = com.p683ss.android.ugc.aweme.miniapp_api.C36949e.m83164a(r5)
            goto L_0x03b5
        L_0x03a8:
            boolean r5 = com.p683ss.android.ugc.aweme.miniapp_api.C36949e.m83168d(r4)
            if (r5 == 0) goto L_0x03b3
            java.lang.String r4 = com.p683ss.android.ugc.aweme.miniapp_api.C36949e.m83164a(r4)
            goto L_0x03b5
        L_0x03b3:
            java.lang.String r4 = ""
        L_0x03b5:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r14.f68301c
            if (r5 == 0) goto L_0x03e5
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6 = r5.getAwemeRawAd()
            if (r6 == 0) goto L_0x03e5
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r6 = r5.getAwemeRawAd()
            java.lang.String r6 = r6.getOpenUrl()
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r5.getAwemeRawAd()
            java.lang.String r5 = r5.getMicroAppUrl()
            boolean r7 = com.p683ss.android.ugc.aweme.miniapp_api.C36949e.m83168d(r6)
            if (r7 == 0) goto L_0x03da
            int r5 = com.p683ss.android.ugc.aweme.miniapp.utils.C36917d.m83052a(r6)
            goto L_0x03e6
        L_0x03da:
            boolean r6 = com.p683ss.android.ugc.aweme.miniapp_api.C36949e.m83168d(r5)
            if (r6 == 0) goto L_0x03e5
            int r5 = com.p683ss.android.ugc.aweme.miniapp.utils.C36917d.m83052a(r5)
            goto L_0x03e6
        L_0x03e5:
            r5 = 0
        L_0x03e6:
            r3.preloadMiniApp(r4, r5)
        L_0x03e9:
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            r4 = 2
            boolean r3 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63997a(r3, r4)
            if (r3 == 0) goto L_0x03f7
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r14.f68301c
            com.p683ss.android.ugc.aweme.commercialize.utils.C26471cd.m64024e(r3)
        L_0x03f7:
            com.ss.android.ugc.aweme.commercialize.ad.c r3 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67757i
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r14.f68301c
            java.lang.String r5 = r14.f68307i
            java.lang.String r6 = "aweme"
            p2628d.p2639f.p2641b.C52711k.m112240b(r4, r6)
            java.lang.String r6 = "homepage_hot"
            boolean r5 = p2628d.p2639f.p2641b.C52711k.m112239a(r6, r5)
            r5 = r5 ^ r1
            if (r5 != 0) goto L_0x0536
            boolean r5 = com.p683ss.android.ugc.aweme.commercialize.settings.AdGapInteractiveDuration.isEnable()
            if (r5 != 0) goto L_0x0413
            goto L_0x0536
        L_0x0413:
            boolean r5 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67754f
            r6 = 0
            if (r5 != 0) goto L_0x0442
            long r8 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67755g
            int r5 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
            if (r5 == 0) goto L_0x042b
            long r8 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67756h
            long r10 = java.lang.System.currentTimeMillis()
            long r12 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67755g
            long r10 = r10 - r12
            long r8 = r8 + r10
            com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67756h = r8
        L_0x042b:
            long r8 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67756h
            int r5 = com.p683ss.android.ugc.aweme.commercialize.settings.AdGapInteractiveDuration.getDuration()
            long r10 = (long) r5
            r12 = 1000(0x3e8, double:4.94E-321)
            long r10 = r10 * r12
            int r5 = (r8 > r10 ? 1 : (r8 == r10 ? 0 : -1))
            if (r5 < 0) goto L_0x043f
            r5 = 128(0x80, float:1.794E-43)
            com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.m62130a(r5)
        L_0x043f:
            com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.m62132e()
        L_0x0442:
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r5 = r4.getAwemeRawAd()
            if (r5 == 0) goto L_0x044d
            boolean r5 = r5.isHardAd()
            goto L_0x044e
        L_0x044d:
            r5 = 0
        L_0x044e:
            if (r5 != 0) goto L_0x0488
            boolean r5 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63570a(r4)
            if (r5 != 0) goto L_0x0488
            boolean r5 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64070m(r4)
            if (r5 == 0) goto L_0x045d
            goto L_0x0488
        L_0x045d:
            com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67754f = r0
            long r3 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67751c
            java.lang.Long r3 = java.lang.Long.valueOf(r3)
            r4 = r3
            java.lang.Number r4 = (java.lang.Number) r4
            long r4 = r4.longValue()
            int r8 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
            if (r8 == 0) goto L_0x0471
            r0 = 1
        L_0x0471:
            if (r0 == 0) goto L_0x0474
            r2 = r3
        L_0x0474:
            if (r2 == 0) goto L_0x047b
            long r2 = r2.longValue()
            goto L_0x047f
        L_0x047b:
            long r2 = java.lang.System.currentTimeMillis()
        L_0x047f:
            com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67751c = r2
            int r0 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67750b
            int r0 = r0 + r1
            com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67750b = r0
            goto L_0x0535
        L_0x0488:
            com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67754f = r1
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64070m(r4)
            if (r2 != 0) goto L_0x0496
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63570a(r4)
            if (r2 == 0) goto L_0x04aa
        L_0x0496:
            int r2 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67750b
            if (r2 == 0) goto L_0x052f
            java.lang.String r2 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67752d
            java.lang.String r5 = "no_ad"
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r5)
            if (r2 == 0) goto L_0x04aa
            int r2 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67750b
            if (r2 != r1) goto L_0x04aa
            goto L_0x052f
        L_0x04aa:
            int r2 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67750b
            if (r2 != 0) goto L_0x04b4
            java.lang.String r0 = "feedad"
            com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67752d = r0
            goto L_0x0535
        L_0x04b4:
            java.lang.String r2 = r4.getAid()
            java.lang.String r4 = "aweme.aid"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            java.util.HashMap<java.lang.String, java.lang.Integer> r4 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67749a
            java.util.Map r4 = (java.util.Map) r4
            java.lang.Object r4 = r4.get(r2)
            if (r4 != 0) goto L_0x04cb
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
        L_0x04cb:
            java.lang.Number r4 = (java.lang.Number) r4
            int r0 = r4.intValue()
            int r0 = r0 + r1
            java.util.HashMap<java.lang.String, java.lang.Integer> r1 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67749a
            java.util.Map r1 = (java.util.Map) r1
            java.lang.Integer r4 = java.lang.Integer.valueOf(r0)
            r1.put(r2, r4)
            long r4 = java.lang.System.currentTimeMillis()
            long r6 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67751c
            long r4 = r4 - r6
            double r4 = (double) r4
            r6 = 4652007308841189376(0x408f400000000000, double:1000.0)
            java.lang.Double.isNaN(r4)
            double r4 = r4 / r6
            java.lang.String r1 = "if_adgap_interactive"
            com.ss.android.ugc.aweme.app.f.d r6 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r7 = "group_id"
            com.ss.android.ugc.aweme.app.f.d r2 = r6.mo47829a(r7, r2)
            java.lang.String r6 = "interactive_mask"
            int r7 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67753e
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47826a(r6, r7)
            java.lang.String r6 = "last_ad"
            java.lang.String r7 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67752d
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r6, r7)
            java.lang.String r6 = "duration"
            java.lang.String r4 = java.lang.String.valueOf(r4)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r6, r4)
            java.lang.String r4 = "gapnum"
            int r5 = com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67750b
            java.lang.String r5 = java.lang.String.valueOf(r5)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r4, r5)
            java.lang.String r4 = "track_count"
            com.ss.android.ugc.aweme.app.f.d r0 = r2.mo47826a(r4, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26883g.m64995a(r1, r0)
            r3.mo52755d()
            return
        L_0x052f:
            com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67750b = r0
            java.lang.String r0 = "topview"
            com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25593c.f67752d = r0
        L_0x0535:
            return
        L_0x0536:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.mo53073g():void");
    }

    /* renamed from: a */
    public final void mo53042a(int i) {
        this.f68300b = i;
    }

    /* renamed from: a */
    public final void mo53050a(C25713d dVar) {
        this.f68306h.mo48228a("ON_RECEIVE_AD_WEB_PAGE_EVENT", (Object) dVar);
    }

    /* renamed from: b */
    public final void mo53061b(String str) {
        this.f68306h.mo48228a("AD_ON_PROFILE_WEB_PAGE_SHOW", (Object) str);
    }

    /* renamed from: c */
    public final void mo53065c(String str) {
        this.f68306h.mo48228a("AD_ON_PROFILE_WEB_PAGE_HIDE", (Object) str);
    }

    /* renamed from: a */
    public static C50158g m62502a(C30016ag agVar) {
        if (agVar == null) {
            return null;
        }
        return agVar.mo60242m();
    }

    /* renamed from: e */
    public final void mo53070e(boolean z) {
        this.f68306h.mo48228a("ad_comment_dialog_visible", (Object) Boolean.valueOf(z));
        if (z) {
            this.f68297N.add("comment_block");
        } else {
            this.f68297N.remove("comment_block");
        }
    }

    /* renamed from: f */
    public final void mo53072f(boolean z) {
        this.f68306h.mo48228a("ad_share_dialog_visible", (Object) Boolean.valueOf(z));
        if (z) {
            this.f68297N.add("share_block");
        } else {
            this.f68297N.remove("share_block");
        }
    }

    /* renamed from: c */
    private boolean m62508c(Aweme aweme) {
        if (this.mStarAtlasLinkViewStub == null) {
            return false;
        }
        if (this.f68302d == null) {
            this.f68302d = (StarAtlasTagLayout) this.mStarAtlasLinkViewStub.inflate();
        }
        if (this.f68302d == null || !C25973h.m62966a(aweme) || m62501J()) {
            return false;
        }
        return true;
    }

    /* renamed from: d */
    private boolean m62509d(Aweme aweme) {
        if (this.mNationalTaskLinkViewStub == null) {
            return false;
        }
        if (this.f68303e == null) {
            this.f68303e = (NationalTaskTagLayout) this.mNationalTaskLinkViewStub.inflate();
        }
        if (this.f68303e == null || !C25973h.m62971b(aweme) || m62501J()) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    public final void mo53044a(long j) {
        if (!C26512f.m64135ac(this.f68301c)) {
            this.mNativeAdBottomLabelView.mo54380h();
            C25927x xVar = new C25927x(this);
            C52711k.m112240b(xVar, "callBack");
            xVar.invoke(Long.valueOf(j));
        }
    }

    /* renamed from: c */
    public final void mo53066c(boolean z) {
        if (z) {
            C45427bj.m98998a(this.mBottomView, this.mBottomView.getAlpha(), 0.0f);
        } else {
            C45427bj.m98998a(this.mBottomView, this.mBottomView.getAlpha(), 1.0f);
        }
        this.adHalfWebPageContainer.setInCleanMode(z);
        this.f68322x.mo76062a(z, this.f68301c);
        if (m62494C()) {
            this.f68313o.mo54706a(z);
        }
        this.f68306h.mo48228a("ON_DISLIKE_MODE_CHANGE", (Object) Boolean.valueOf(z));
    }

    /* renamed from: d */
    public final void mo53067d(boolean z) {
        if (z && this.f68301c != null) {
            if (C25823j.f68267a && this.f68324z != null) {
                this.f68324z.mo52993a(new C25778d("like"));
            } else if (C25770d.f68145d) {
                this.eggLayout.mo52924a(C25770d.f68142a, this.f68295L);
            } else {
                this.diggLayout.mo54399a(this.f68307i, this.f68301c.getAid());
            }
        }
        C25908e eVar = this.f68310l;
        if (eVar.f68448c != null) {
            eVar.f68448c.mo53177a(eVar.f68447b, eVar.f68446a, z);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:17:0x0073 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:18:0x0074  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m62503a(com.p683ss.android.ugc.aweme.commercialize.indicationlink.C25942a r17) {
        /*
            r16 = this;
            r6 = r16
            r0 = r17
            if (r0 != 0) goto L_0x0007
            return
        L_0x0007:
            com.ss.android.ugc.aweme.feed.adapter.ag r1 = r6.f68305g
            com.ss.android.ugc.playerkit.videoview.g r1 = m62502a(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f68301c
            long r7 = com.p683ss.android.ugc.aweme.commercialize.utils.p1584d.C26504a.m64084a(r2, r1)
            com.ss.android.ugc.aweme.feed.model.BoxData r1 = r0.f68501b
            int r9 = r1.getTimestampMS()
            com.ss.android.ugc.aweme.feed.model.BoxData r1 = r0.f68501b
            java.util.List<com.ss.android.ugc.aweme.feed.model.BoxData> r0 = r0.f68500a
            java.lang.String r2 = "startPoint"
            p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)
            java.lang.String r2 = "boxs"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r2)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = p2628d.p2629a.C52575l.m112128b(r0)
            java.lang.Iterable r0 = (java.lang.Iterable) r0
            java.util.List r0 = p2628d.p2629a.C52575l.m112132c(r0)
            r2 = 0
            java.util.Iterator r0 = r0.iterator()
        L_0x0038:
            boolean r3 = r0.hasNext()
            if (r3 == 0) goto L_0x004b
            java.lang.Object r3 = r0.next()
            com.ss.android.ugc.aweme.feed.model.BoxData r3 = (com.p683ss.android.ugc.aweme.feed.model.BoxData) r3
            int r4 = r3.getTimestampMS()
            if (r4 == 0) goto L_0x0038
            r2 = r3
        L_0x004b:
            r0 = 3000(0xbb8, float:4.204E-42)
            if (r2 != 0) goto L_0x0050
            goto L_0x005d
        L_0x0050:
            int r2 = r2.getTimestampMS()
            int r1 = r1.getTimestampMS()
            int r2 = r2 - r1
            if (r2 <= r0) goto L_0x005d
            r10 = r2
            goto L_0x005f
        L_0x005d:
            r10 = 3000(0xbb8, float:4.204E-42)
        L_0x005f:
            int r11 = r10 / 40
            com.ss.android.ugc.aweme.commercialize.utils.d.d r0 = r6.f68309k
            r1 = 40
            r0.mo54198a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.d.d r0 = r6.f68309k
            long r0 = r0.mo54203d()
            long r2 = (long) r9
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 <= 0) goto L_0x0074
            return
        L_0x0074:
            r13 = 0
        L_0x0075:
            if (r13 > r11) goto L_0x00a9
            com.ss.android.ugc.aweme.commercialize.utils.d.d r14 = r6.f68309k
            com.ss.android.ugc.aweme.commercialize.utils.d.c$a r0 = new com.ss.android.ugc.aweme.commercialize.utils.d.c$a
            r0.<init>()
            com.ss.android.ugc.aweme.commercialize.utils.d.c$a r0 = r0.mo54193a(r7)
            int r1 = r13 * 40
            int r1 = r1 + r9
            com.ss.android.ugc.aweme.commercialize.utils.d.c$a r15 = r0.mo54192a(r1)
            com.ss.android.ugc.aweme.commercialize.feed.q r5 = new com.ss.android.ugc.aweme.commercialize.feed.q
            r0 = r5
            r1 = r16
            r2 = r9
            r3 = r10
            r4 = r13
            r12 = r5
            r5 = r11
            r0.<init>(r1, r2, r3, r4, r5)
            com.ss.android.ugc.aweme.commercialize.utils.d.c$a r0 = r15.mo54194a(r12)
            r1 = 0
            com.ss.android.ugc.aweme.commercialize.utils.d.c$a r0 = r0.mo54195a(r1)
            com.ss.android.ugc.aweme.commercialize.utils.d.c r0 = r0.mo54196a()
            r14.mo54200a(r0)
            int r13 = r13 + 1
            goto L_0x0075
        L_0x00a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.feed.CommerceVideoDelegate.m62503a(com.ss.android.ugc.aweme.commercialize.indicationlink.a):void");
    }

    /* renamed from: b */
    private boolean m62507b(C50158g gVar) {
        C26512f.m64058a(this.f68307i);
        if (!(this.f68301c == null || this.f68301c.getAwemeRawAd() == null)) {
            HashMap hashMap = new HashMap();
            hashMap.put("background_type", String.valueOf(this.f68301c.getAwemeRawAd().getNativeCardType()));
            C26088l.m63287a(this.f68308j, this.f68301c, (Map<String, String>) hashMap);
        }
        C26088l.m63374m(this.f68308j, this.f68301c);
        this.feedAdLayout.setAlpha(0.0f);
        this.f68304f.setAlpha(1.0f);
        this.f68304f.animate().alpha(0.0f).setDuration(150).withEndAction(new C25924u(this, gVar)).start();
        return true;
    }

    /* renamed from: g */
    private void m62510g(boolean z) {
        AwemeTextLabelModel awemeTextLabelModel;
        if (C26469cc.m63996a(this.f68301c)) {
            boolean z2 = false;
            C23729p.m58257a((View) this.vastAdTag, 0);
            C13235c c = C26469cc.m64002c(this.f68301c);
            if (c != null && !C9376b.m18558a((Collection<T>) c.staticResource)) {
                Iterator it = c.staticResource.iterator();
                while (true) {
                    if (!it.hasNext()) {
                        break;
                    }
                    String str = (String) it.next();
                    if (!TextUtils.isEmpty(str)) {
                        C23729p.m58257a((View) this.vastAdTagAdChoice, 0);
                        C23515d.m57677a(this.vastAdTagAdChoice, str);
                        if (this.vastAdTag != null) {
                            this.vastAdTag.setClickable(true);
                        }
                        z2 = true;
                    }
                }
            } else {
                C23729p.m58257a((View) this.vastAdTagAdChoice, 8);
                if (this.vastAdTag != null) {
                    this.vastAdTag.setClickable(false);
                }
            }
            if (z && z2 && !C9376b.m18558a((Collection<T>) c.viewTracking) && C26471cd.m64022c(this.f68301c)) {
                C26471cd.m64018b(c);
                C26077e.m63190a().mo53582a("draw_ad").mo53593b("ad_choice_view").mo53602g("video").mo53590b(this.f68301c).mo53586a(this.f68308j);
            }
            if (this.vastAdTagText != null) {
                if (this.f68301c.getAwemeRawAd() != null) {
                    awemeTextLabelModel = this.f68301c.getAwemeRawAd().getLabel();
                } else {
                    awemeTextLabelModel = null;
                }
                if (awemeTextLabelModel == null || TextUtils.isEmpty(this.f68301c.getAwemeRawAd().getLabel().getLabelName())) {
                    this.vastAdTagText.setText(R.string.dx);
                } else {
                    this.vastAdTagText.setText(this.f68301c.getAwemeRawAd().getLabel().getLabelName());
                }
            }
            C23729p.m58257a((View) this.f68321w, 8);
            return;
        }
        C23729p.m58257a((View) this.vastAdTag, 8);
    }

    /* renamed from: h */
    private void m62511h(final boolean z) {
        String str;
        String str2;
        String str3;
        if (this.f68301c != null) {
            if (!m62494C()) {
                if (C26512f.m64108J(this.f68301c)) {
                    if (!C25823j.f68267a) {
                        this.adRedPacketIv.setVisibility(0);
                        this.adPendantIv.setVisibility(8);
                        AwemeRawAd awemeRawAd = this.f68301c.getAwemeRawAd();
                        UrlModel urlModel = null;
                        if (awemeRawAd != null) {
                            urlModel = awemeRawAd.getRedImageUrl();
                        }
                        C26515i.m64156a(this.adRedPacketIv, urlModel, false, new C13790c() {
                            public final void onFailure(String str, Throwable th) {
                                if (!z) {
                                    C26072c.m63179c(CommerceVideoDelegate.this.f68301c, 1);
                                }
                            }

                            public final void onSubmit(String str, Object obj) {
                                if (!z) {
                                    C26072c.m63170a(CommerceVideoDelegate.this.f68301c);
                                }
                            }

                            public final void onFinalImageSet(String str, Object obj, Animatable animatable) {
                                if (!z) {
                                    C26072c.m63179c(CommerceVideoDelegate.this.f68301c, 0);
                                }
                            }
                        });
                        if (z) {
                            C26072c.m63175b(this.f68301c);
                            C26088l.m63283a(this.f68308j, this.f68301c, "othershow", "redpacket");
                        }
                        return;
                    }
                    this.adRedPacketIv.setVisibility(8);
                    this.f68323y.mo54717a(z, this.f68301c, this.f68307i);
                    return;
                } else if (C26512f.m64059b(this.f68301c)) {
                    if (!C25823j.f68267a) {
                        this.adRedPacketIv.setVisibility(0);
                        this.adPendantIv.setVisibility(8);
                        C26515i.m64153a(this.adRedPacketIv, this.f68301c.getActivityPendant().getImage());
                        User author = this.f68301c.getAuthor();
                        if (z) {
                            String str4 = "show_brand_sticker";
                            C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f68307i).mo47829a("group_id", this.f68301c.getAid());
                            String str5 = "author_id";
                            if (author != null) {
                                str3 = author.getUid();
                            } else {
                                str3 = "";
                            }
                            C26890h.m65011a(str4, a.mo47829a(str5, str3).f61491a);
                            C26081f.m63236a((C26057av) new C25922s(this), this.f68301c.getActivityPendant().getTrackUrlList(), true);
                        }
                        return;
                    }
                    this.adRedPacketIv.setVisibility(8);
                    this.f68323y.mo54717a(z, this.f68301c, this.f68307i);
                    return;
                } else if (C26512f.m64110L(this.f68301c)) {
                    if (!C25823j.f68267a) {
                        this.adRedPacketIv.setVisibility(0);
                        this.adPendantIv.setVisibility(8);
                        SpecialSticker specialSticker = this.f68301c.getSpecialSticker();
                        if (specialSticker != null) {
                            C26515i.m64153a(this.adRedPacketIv, specialSticker.getIconUrl());
                        }
                        User author2 = this.f68301c.getAuthor();
                        if (z) {
                            String str6 = "show_brand_sticker";
                            C23089d a2 = C23089d.m56640a().mo47829a("enter_from", this.f68307i).mo47829a("group_id", this.f68301c.getAid());
                            String str7 = "author_id";
                            if (author2 != null) {
                                str2 = author2.getUid();
                            } else {
                                str2 = "";
                            }
                            C26890h.m65011a(str6, a2.mo47829a(str7, str2).mo47829a("sticker_id", this.f68301c.getSpecialSticker().getStickerId()).f61491a);
                        }
                        return;
                    }
                    this.adRedPacketIv.setVisibility(8);
                    this.f68323y.mo54717a(z, this.f68301c, this.f68307i);
                    return;
                } else if (C20850b.m53159b(this.f68301c)) {
                    this.adRedPacketIv.setVisibility(0);
                    C26515i.m64153a(this.adRedPacketIv, C20850b.m53160c(this.f68301c));
                    User author3 = this.f68301c.getAuthor();
                    if (z) {
                        String str8 = "show_mission_icon";
                        C23089d a3 = C23089d.m56640a().mo47829a("enter_from", this.f68307i).mo47829a("group_id", this.f68301c.getAid());
                        String str9 = "author_id";
                        if (author3 != null) {
                            str = author3.getUid();
                        } else {
                            str = "";
                        }
                        C26890h.m65011a(str8, a3.mo47829a(str9, str).mo47829a("entrance_location", "redpacket").f61491a);
                    }
                    this.adPendantIv.setVisibility(8);
                }
            }
            this.adRedPacketIv.setVisibility(8);
            this.adPendantIv.setVisibility(8);
        }
    }

    /* renamed from: b */
    public final void mo53060b(Aweme aweme) {
        if (aweme == null || aweme.getAwemeRawAd() == null || aweme.getAwemeRawAd().getAdHintData() == null) {
            this.adFeeDeductionLayout.setVisibility(8);
            return;
        }
        this.adFeeDeductionLayout.setVisibility(0);
        this.feeDeductionHint.setText(aweme.getAwemeRawAd().getAdHintData().getHintText());
    }

    /* renamed from: b */
    public final void mo53062b(boolean z) {
        int i;
        if (!C31257z.m72971b(this.f68307i)) {
            FrameLayout frameLayout = this.mBottomView;
            if (z) {
                i = 4;
            } else {
                i = 0;
            }
            frameLayout.setVisibility(i);
            if (!z) {
                frameLayout.setAlpha(1.0f);
            }
        }
        this.adHalfWebPageContainer.setInCleanMode(z);
        this.f68322x.mo76062a(z, this.f68301c);
        if (m62494C()) {
            this.f68313o.mo54706a(z);
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        float f;
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            String str = aVar.f62242a;
            char c = 65535;
            boolean z = false;
            switch (str.hashCode()) {
                case -1842619453:
                    if (str.equals("AD_ACTION_RESET_INTRO_CONTAINER_LOCATION")) {
                        c = 4;
                        break;
                    }
                    break;
                case -1023452510:
                    if (str.equals("on_ad_light_web_page_hide")) {
                        c = 1;
                        break;
                    }
                    break;
                case -1023125411:
                    if (str.equals("on_ad_light_web_page_show")) {
                        c = 0;
                        break;
                    }
                    break;
                case -924046888:
                    if (str.equals("new_clean_mode")) {
                        c = 7;
                        break;
                    }
                    break;
                case -545926768:
                    if (str.equals("ON_INDICATION_LINK_DATA_RECEIVE")) {
                        c = 11;
                        break;
                    }
                    break;
                case -481195123:
                    if (str.equals("on_ad_pop_up_web_page_hide")) {
                        c = 6;
                        break;
                    }
                    break;
                case -480868024:
                    if (str.equals("on_ad_pop_up_web_page_show")) {
                        c = 5;
                        break;
                    }
                    break;
                case -293484551:
                    if (str.equals("ON_SIMILAR_ADVERT_HIDE")) {
                        c = 8;
                        break;
                    }
                    break;
                case -293157452:
                    if (str.equals("ON_SIMILAR_ADVERT_SHOW")) {
                        c = 9;
                        break;
                    }
                    break;
                case 1481889616:
                    if (str.equals("AD_ACTION_REPLAY_VIDEO")) {
                        c = 10;
                        break;
                    }
                    break;
                case 1676264963:
                    if (str.equals("AD_ACTION_MOVE_OUT_DESC")) {
                        c = 3;
                        break;
                    }
                    break;
                case 1881011274:
                    if (str.equals("AD_ACTION_MOVE_IN_DESC")) {
                        c = 2;
                        break;
                    }
                    break;
            }
            switch (c) {
                case 0:
                    mo53056a(true);
                    this.f68297N.add("lightpage_block");
                    return;
                case 1:
                    this.f68297N.remove("lightpage_block");
                    return;
                case 2:
                    if (aVar.mo48246a() != null) {
                        z = ((Boolean) aVar.mo48246a()).booleanValue();
                    }
                    if (!(this.introContainer == null || (this.introContainer.getVisibility() == 0 && this.introContainer.getAlpha() == 1.0f))) {
                        if (z) {
                            this.introContainer.setTranslationY((float) C23728o.m58241a(17.0d));
                            this.introContainer.animate().alpha(1.0f).translationY(0.0f).setInterpolator(new LinearInterpolator()).setDuration(280).start();
                            break;
                        } else {
                            C45427bj.m98998a(this.introContainer, this.introContainer.getAlpha(), 1.0f);
                            C45431bm.m99003a(this.introContainer, this.introContainer.getTranslationX(), 0.0f, 200);
                        }
                    }
                    return;
                case 3:
                    if (aVar.mo48246a() != null) {
                        z = ((Boolean) aVar.mo48246a()).booleanValue();
                    }
                    if (this.introContainer != null) {
                        if (z) {
                            C45427bj.m98999a(this.introContainer, this.introContainer.getAlpha(), 0.0f, 200);
                            break;
                        } else {
                            if (C47918gj.m103682a(this.f68308j)) {
                                f = (float) (-C45431bm.m99002a(this.f68308j, this.introContainer));
                            } else {
                                f = (float) C45431bm.m99002a(this.f68308j, this.introContainer);
                            }
                            C45427bj.m98999a(this.introContainer, this.introContainer.getAlpha(), 0.0f, 200);
                            C45431bm.m99003a(this.introContainer, this.introContainer.getTranslationX(), f, 200);
                        }
                    }
                    return;
                case 4:
                    m62495D();
                    return;
                case 5:
                    this.f68297N.add("popup_page_block");
                    mo53056a(false);
                    return;
                case 6:
                    this.f68297N.remove("popup_page_block");
                    return;
                case 7:
                    C30030ar.m70441a(this.adRedPacketIv, this.introContainer, this.f68301c);
                    C30030ar.m70441a(this.adPendantIv, this.introContainer, this.f68301c);
                    MicroAppVideoCardView microAppVideoCardView = this.f68322x;
                    ((Integer) aVar.mo48246a()).intValue();
                    microAppVideoCardView.mo76062a(false, this.f68301c);
                    if (C26503d.m64061d(this.f68301c) && !C26503d.m64064g(this.f68301c) && !C26503d.m64051C(this.f68301c)) {
                        ((Integer) aVar.mo48246a()).intValue();
                        return;
                    }
                case 8:
                    if (this.introContainer != null) {
                        this.introContainer.setVisibility(0);
                        this.introContainer.animate().setStartDelay(250).setDuration(250).translationY(0.0f).alpha(1.0f).withEndAction(new C25915l(this)).start();
                    }
                    return;
                case 9:
                    if (this.introContainer != null) {
                        this.introContainer.animate().setStartDelay(60).setDuration(150).alpha(0.0f).withEndAction(new C25916m(this)).start();
                    }
                    return;
                case 10:
                    if (!C48121w.m104087I()) {
                        C48121w.m104249M().mo95291x();
                        return;
                    } else {
                        C50130a.m108170a().mo60214ae();
                        return;
                    }
                case 11:
                    m62503a((C25942a) aVar.mo48246a());
                    break;
            }
        }
    }

    public void onClick(View view) {
        String str;
        String str2;
        String str3;
        int id = view.getId();
        if (id == R.id.emo) {
            if (!mo53068d()) {
                C26540w.m64253a(this.f68308j, this.f68301c, this.f68310l, 2, this.f68315q);
            }
        } else if (id == R.id.aec) {
            if (!mo53068d()) {
                C26512f.m64058a(this.f68307i);
                C26540w.m64253a(this.f68308j, this.f68301c, this.f68310l, 3, this.f68315q);
                C26512f.m64114P(this.f68301c);
                mo53056a(false);
            }
        } else if (id == R.id.by) {
            if (!mo53068d()) {
                C26512f.m64058a(this.f68307i);
                C26540w.m64253a(this.f68308j, this.f68301c, this.f68310l, 11, this.f68315q);
            }
        } else if (id == R.id.c9) {
            if (!mo53068d()) {
                C26512f.m64058a(this.f68307i);
                C26540w.m64253a(this.f68308j, this.f68301c, this.f68310l, 14, this.f68315q);
            }
        } else if (id == R.id.bi) {
            if (!mo53068d()) {
                C26512f.m64058a(this.f68307i);
                C26540w.m64253a(this.f68308j, this.f68301c, this.f68310l, 12, this.f68315q);
            }
        } else if (id == R.id.c6) {
            if (!mo53068d()) {
                C26512f.m64058a(this.f68307i);
                C26540w.m64253a(this.f68308j, this.f68301c, this.f68310l, 13, this.f68315q);
            }
        } else if (id == R.id.d0) {
            if (!mo53068d()) {
                C26512f.m64058a(this.f68307i);
                C26540w.m64253a(this.f68308j, this.f68301c, this.f68310l, 15, this.f68315q);
            }
        } else if (id == R.id.c0 || id == R.id.d7) {
            if (!mo53068d()) {
                C26540w.m64253a(this.f68308j, this.f68301c, this.f68310l, 19, this.f68315q);
            }
        } else if (id == R.id.d2) {
            if (!mo53068d()) {
                C26512f.m64058a(this.f68307i);
                C26540w.m64253a(this.f68308j, this.f68301c, this.f68310l, 20, this.f68315q);
            }
        } else if (id == R.id.ch) {
            if (!mo53068d()) {
                C26540w.m64253a(this.f68308j, this.f68301c, this.f68310l, 21, this.f68315q);
            }
        } else if (id != R.id.aed && id != R.id.aee) {
            if (id == R.id.cj) {
                User author = this.f68301c.getAuthor();
                if (C26512f.m64108J(this.f68301c)) {
                    C26540w.m64253a(this.f68308j, this.f68301c, this.f68310l, 9, this.f68315q);
                } else if (C26512f.m64059b(this.f68301c)) {
                    C26540w.m64249f(this.f68308j, this.f68301c);
                    String str4 = "click_brand_sticker";
                    C23089d a = C23089d.m56640a().mo47829a("enter_from", this.f68307i).mo47829a("group_id", this.f68301c.getAid());
                    String str5 = "author_id";
                    if (author != null) {
                        str3 = author.getUid();
                    } else {
                        str3 = "";
                    }
                    C26890h.m65011a(str4, a.mo47829a(str5, str3).f61491a);
                    C26081f.m63236a((C26057av) new C25926w(this), this.f68301c.getActivityPendant().getClickTrackUrlList(), true);
                } else if (C26512f.m64110L(this.f68301c)) {
                    if (C26540w.m64246e(this.f68308j, this.f68301c)) {
                        String str6 = "click_brand_sticker";
                        C23089d a2 = C23089d.m56640a().mo47829a("enter_from", this.f68307i).mo47829a("group_id", this.f68301c.getAid());
                        String str7 = "author_id";
                        if (author != null) {
                            str2 = author.getUid();
                        } else {
                            str2 = "";
                        }
                        C26890h.m65011a(str6, a2.mo47829a(str7, str2).mo47829a("sticker_id", this.f68301c.getSpecialSticker().getStickerId()).f61491a);
                    }
                } else if (C20850b.m53159b(this.f68301c)) {
                    C20850b.m53157a(this.f68308j, this.f68301c);
                    String str8 = "click_mission_icon";
                    C23089d a3 = C23089d.m56640a().mo47829a("enter_from", this.f68307i).mo47829a("group_id", this.f68301c.getAid());
                    String str9 = "author_id";
                    if (author != null) {
                        str = author.getUid();
                    } else {
                        str = "";
                    }
                    C26890h.m65011a(str8, a3.mo47829a(str9, str).mo47829a("entrance_location", "redpacket").f61491a);
                }
            }
        } else if (!mo53068d()) {
            if (this.f68310l.mo53244a()) {
                C26512f.m64058a(this.f68307i);
                C26088l.m63375n(this.f68308j, this.f68301c);
                C25493a.m62004a();
                C25493a.m62005a(this.f68308j, this.f68301c);
            }
            mo53057a(true, false);
        }
    }

    /* renamed from: a */
    public final void mo53046a(C0654k kVar) {
        boolean z;
        Integer num;
        AbsHalfWebPageAction absHalfWebPageAction;
        int i;
        boolean z2;
        String str;
        if (C26512f.m64083z(this.f68301c) && this.f68299P == null) {
            C26699a aVar = new C26699a();
            aVar.f70371a.f70340a = this.f68308j;
            aVar.f70371a.f70341b = this.f68301c;
            AdHalfWebPageContainer adHalfWebPageContainer2 = this.adHalfWebPageContainer;
            if (C47719bg.f120231b) {
                z = C47719bg.f120230a;
            } else {
                if (VERSION.SDK_INT < 21 || !((Boolean) C9741d.m19510a("adhalf_webpage_show_experiment", Boolean.class, new C41599a().mo17563a(), false, true)).booleanValue()) {
                    z2 = false;
                } else {
                    z2 = true;
                }
                C47719bg.f120230a = z2;
                HashMap hashMap = new HashMap();
                String str2 = "webview_use_zorder";
                if (C47719bg.f120230a) {
                    str = "true";
                } else {
                    str = "false";
                }
                hashMap.put(str2, str);
                C9610j.m19135a((Map<? extends String, ? extends String>) hashMap);
                C47719bg.f120231b = true;
                z = C47719bg.f120230a;
            }
            adHalfWebPageContainer2.setUseZOrder(z);
            aVar.f70371a.f70342c = adHalfWebPageContainer2;
            aVar.f70371a.f70343d = this.blackMaskLayer;
            aVar.f70371a.f70344e = kVar;
            aVar.f70371a.f70349j = this.f68306h;
            aVar.f70371a.f70353n = this.f68305g;
            this.f68299P = aVar.f70371a;
            C26691e eVar = this.f68299P;
            if (!eVar.f70354o) {
                LayoutParams layoutParams = eVar.f70342c.getLayoutParams();
                CardStruct s = C26512f.m64076s(eVar.f70341b);
                int b = (int) C9432q.m18687b(eVar.f70340a, 138.0f);
                if (s != null) {
                    switch (s.getCardStyle()) {
                        case 0:
                            if (s.getCardType() == 2) {
                                b = (int) C9432q.m18687b(eVar.f70340a, 147.0f);
                                break;
                            }
                            break;
                        case 1:
                            b = (int) C9432q.m18687b(eVar.f70340a, 130.0f);
                            break;
                        case 2:
                            layoutParams.width = (int) C9432q.m18687b(eVar.f70340a, 260.0f);
                            break;
                    }
                }
                layoutParams.height = b;
                eVar.f70342c.setLayoutParams(layoutParams);
                eVar.f70342c.setInCleanMode(false);
                eVar.f70342c.mo54265f();
                eVar.f70342c.mo54263d();
                eVar.f70343d.mo54292b();
                if (C26512f.m64082y(eVar.f70341b)) {
                    C48301b.m104633a(C26512f.m64076s(eVar.f70341b));
                    C48299a.f121530d = C26512f.m64049A(eVar.f70341b);
                    C48301b.m104631a(1);
                    C48301b.m104632a(eVar.f70341b);
                }
                C26709o a = C26709o.m64582a(C26512f.m64116R(eVar.f70341b));
                if (a != null) {
                    Context context = eVar.f70340a;
                    Aweme aweme = eVar.f70341b;
                    C52711k.m112240b(a, "adHalfWebPage");
                    CardStruct a2 = C26525l.m64171a(aweme);
                    View view = null;
                    if (a2 != null) {
                        num = Integer.valueOf(a2.getCardType());
                    } else {
                        num = null;
                    }
                    if (num != null && num.intValue() == 2) {
                        absHalfWebPageAction = new DownloadAdCardAction(context, aweme, a);
                    } else if (num != null && num.intValue() == 3) {
                        absHalfWebPageAction = new ShopAdCardAction(context, aweme, a);
                    } else if (num != null && num.intValue() == 1) {
                        absHalfWebPageAction = new FormAdCardAction(context, aweme, a);
                    } else if (num != null && num.intValue() == 4) {
                        absHalfWebPageAction = new ImageAdCardAction(context, aweme, a);
                    } else if (num != null && num.intValue() == 5) {
                        absHalfWebPageAction = new InteractAdCardAction(context, aweme, a);
                    } else if (num != null && num.intValue() == 6) {
                        absHalfWebPageAction = new PollAdCardAction(context, aweme, a);
                    } else if (num != null && num.intValue() == 7) {
                        absHalfWebPageAction = new SurveyAdCardAction(context, aweme, a);
                    } else if ((num != null && num.intValue() == 8) || (num != null && num.intValue() == 9)) {
                        absHalfWebPageAction = new CouponAdCardAction(context, aweme, a);
                    } else if (num != null && num.intValue() == 10) {
                        absHalfWebPageAction = new PoiAdCardAction(context, aweme, a);
                    } else if (num != null && num.intValue() == 11) {
                        absHalfWebPageAction = new SelectAdCardAction(context, aweme, a);
                    } else if (num != null && num.intValue() == 12) {
                        absHalfWebPageAction = new GeneralAdCardAction(context, aweme, a);
                    } else {
                        absHalfWebPageAction = new LandingPageAdCardAction(context, aweme, a);
                    }
                    eVar.f70345f = absHalfWebPageAction;
                    eVar.f70345f.mo54512a(eVar.f70349j);
                    a.mo54557a((C26719a) new C26719a() {
                        /* renamed from: a */
                        public final void mo54545a() {
                            C26691e.this.f70349j.mo48228a("ON_AD_HALF_WEB_PAGE_CLICK_COVER", (Object) null);
                        }

                        /* renamed from: b */
                        public final void mo54546b() {
                            if (C26691e.this.f70345f == null || !C26691e.this.f70345f.f70318g) {
                                C26691e.this.f70349j.mo48228a("ACTION_HALF_WEB_PAGE_HIDE", (Object) null);
                            } else {
                                C26691e.this.f70349j.mo48228a("ACTION_HALF_WEB_PAGE_COLLAPSE", (Object) Boolean.valueOf(true));
                            }
                        }
                    });
                    AdHalfWebPageContainer adHalfWebPageContainer3 = eVar.f70342c;
                    if (adHalfWebPageContainer3 != null) {
                        View childAt = adHalfWebPageContainer3.getChildAt(0);
                        if (childAt == null) {
                            if (VERSION.SDK_INT >= 17) {
                                i = View.generateViewId();
                            } else {
                                i = R.id.bv;
                            }
                            View frameLayout = new FrameLayout(adHalfWebPageContainer3.getContext());
                            ((FrameLayout) frameLayout).setId(i);
                            adHalfWebPageContainer3.addView(frameLayout, new FrameLayout.LayoutParams(-1, -1));
                            view = frameLayout;
                        } else {
                            view = childAt;
                        }
                    }
                    if (view != null) {
                        C0679r a3 = eVar.f70344e.mo2225a();
                        a3.mo2192b(view.getId(), a.mo54563e(), "card_default");
                        a3.mo2195c();
                    }
                }
                eVar.mo54534a();
                eVar.f70349j.mo48226a("ACTION_HALF_WEB_PAGE_SHOW", (C0199s<C23274a>) eVar);
                eVar.f70349j.mo48226a("ACTION_HALF_WEB_PAGE_HIDE", (C0199s<C23274a>) eVar);
                eVar.f70349j.mo48226a("ACTION_HALF_WEB_PAGE_COLLAPSE", (C0199s<C23274a>) eVar);
                eVar.f70349j.mo48226a("ACTION_HALF_WEB_PAGE_MOVE_OUT_OF_SCREEN", (C0199s<C23274a>) eVar);
                eVar.f70349j.mo48226a("ACTION_TOP_WEB_PAGE_HIDE", (C0199s<C23274a>) eVar);
                eVar.f70349j.mo48226a("ad_comment_dialog_visible", (C0199s<C23274a>) eVar);
                eVar.f70349j.mo48226a("ad_share_dialog_visible", (C0199s<C23274a>) eVar);
                eVar.f70349j.mo48226a("on_ad_light_web_page_show", (C0199s<C23274a>) eVar);
                eVar.f70349j.mo48226a("on_ad_light_web_page_hide", (C0199s<C23274a>) eVar);
                eVar.f70349j.mo48226a("ON_AD_COMMON_MASK_SHOW", (C0199s<C23274a>) eVar);
                eVar.f70349j.mo48226a("ON_AD_COMMON_MASK_HIDE", (C0199s<C23274a>) eVar);
                eVar.f70349j.mo48226a("ON_AD_FORM_MASK_SHOW", (C0199s<C23274a>) eVar);
                eVar.f70349j.mo48226a("ON_AD_FORM_MASK_HIDE", (C0199s<C23274a>) eVar);
                eVar.f70349j.mo48226a("ON_SIMILAR_ADVERT_DATA_RECEIVE", (C0199s<C23274a>) eVar);
                eVar.f70349j.mo48226a("ON_SIMILAR_ADVERT_HIDE", (C0199s<C23274a>) eVar);
            }
            Aweme aweme2 = this.f68301c;
            if (aweme2 != null) {
                AwemeRawAd awemeRawAd = aweme2.getAwemeRawAd();
                if (awemeRawAd != null) {
                    C26072c.f68845b.m63172a("card", "preload_start", awemeRawAd.getCreativeId(), awemeRawAd.getLogExtra(), aweme2.getAid(), -1);
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo53043a(int i, String str) {
        this.f68306h.mo48228a("ACTION_HALF_WEB_PAGE_SHOW", (Object) new C26105a(i, str));
    }

    /* renamed from: a */
    private boolean m62504a(CommerceTagLayout commerceTagLayout, Aweme aweme) {
        if (commerceTagLayout == null || C26512f.m64071n(aweme) || m62501J()) {
            return false;
        }
        if (C25973h.m62972b(aweme, false, 0)) {
            C26512f.m64144c();
            return true;
        } else if (C25973h.m62967a(aweme, false, 0)) {
            return true;
        } else {
            return false;
        }
    }

    /* renamed from: b */
    private boolean m62506b(final C0654k kVar, final C50158g gVar) {
        if (mo53090w() || mo53088u()) {
            return false;
        }
        this.f68312n = true;
        this.flAdGuideRoot.setAlpha(0.0f);
        CardStruct M = C26512f.m64111M(this.f68301c);
        if (M != null) {
            C48301b.m104633a(M);
            C48301b.m104632a(this.f68301c);
            C48301b.m104631a(2);
        }
        C26386al.m63841a(this.f68301c, (C26737b) new C26737b() {
            /* renamed from: c */
            public final void mo53098c() {
                CommerceVideoDelegate.this.mo53047a(kVar, true, gVar);
                CommerceVideoDelegate.this.f68305g.mo60231d(false);
            }

            /* renamed from: b */
            public final void mo53097b() {
                CommerceVideoDelegate.this.mo53047a(kVar, false, gVar);
                CommerceVideoDelegate.this.mo53059a(gVar);
                C26088l.m63254A(CommerceVideoDelegate.this.f68308j, CommerceVideoDelegate.this.f68301c);
                CommerceVideoDelegate.this.flAdGuideRoot.setAlpha(1.0f);
            }

            /* renamed from: a */
            public final void mo53095a() {
                CommerceVideoDelegate.this.flAdGuideRoot.animate().alpha(1.0f).setDuration(200).start();
                CommerceVideoDelegate.this.f68305g.mo60231d(true);
                HashMap hashMap = new HashMap();
                hashMap.put("background_type", "-1");
                C26088l.m63287a(CommerceVideoDelegate.this.f68308j, CommerceVideoDelegate.this.f68301c, (Map<String, String>) hashMap);
                CommerceVideoDelegate.this.f68306h.mo48228a("ON_AD_FORM_MASK_SHOW", (Object) null);
            }

            /* renamed from: a */
            public final void mo53096a(boolean z) {
                if (!z) {
                    C26088l.m63389z(CommerceVideoDelegate.this.f68308j, CommerceVideoDelegate.this.f68301c);
                }
            }
        }, kVar, (ViewGroup) this.flAdGuideRoot, f68283B);
        return true;
    }

    /* renamed from: b */
    private void m62505b(boolean z, boolean z2) {
        int i;
        this.feedAdLayout.setAlpha(1.0f);
        this.feedAdLayout.animate().alpha(0.0f).setDuration(150).withEndAction(new C25925v(this, z, z2)).start();
        if (!(this.f68308j instanceof MainActivity) || !C36512b.m82421a().f93584a) {
            this.f68304f.setAlpha(0.0f);
            RelativeLayout relativeLayout = this.f68304f;
            if (!TimeLockRuler.isTeenModeON()) {
                i = 0;
            } else {
                i = 8;
            }
            relativeLayout.setVisibility(i);
            this.f68304f.animate().alpha(1.0f).setDuration(150).start();
            return;
        }
        this.f68304f.setVisibility(4);
    }

    /* renamed from: a */
    public final void mo53045a(Context context, Aweme aweme) {
        if (!mo53068d() && aweme != null && this.f68310l != null) {
            if (this.f68310l.mo53244a()) {
                C25493a.m62004a();
                C25493a.m62005a(context, aweme);
            }
            mo53057a(true, false);
        }
    }

    public CommerceVideoDelegate(C30016ag agVar, View view, int i, String str, C30313ae<C30332aw> aeVar, Fragment fragment) {
        this.f68305g = agVar;
        this.f68316r = i;
        this.f68307i = str;
        this.f68308j = view.getContext();
        this.f68287D = aeVar;
        this.f68311m = fragment;
        this.f68291H = new C36867a(view, str);
        ButterKnife.bind((Object) this, view);
        this.f68304f = (RelativeLayout) view.findViewById(R.id.dv6);
        this.f68320v = (FrameLayout) view.findViewById(R.id.ehz);
        this.mIvRelieveTag = (AnimationImageView) view.findViewById(R.id.dq1);
        this.f68321w = (TagLayout) view.findViewById(R.id.dq_);
        this.f68322x = (MicroAppVideoCardView) view.findViewById(R.id.blt);
        this.f68319u = new C25865a(this.f68308j, view, this.f68310l, this.f68315q);
        if (m62492A()) {
            ViewStub viewStub = (ViewStub) view.findViewById(R.id.f7g);
            C22400a aVar = new C22400a();
            aVar.f60337g = viewStub;
            C22449c viewForType = AdServiceImpl.createIAdServicebyMonsterPlugin().getViewForType(this.f68308j, aVar);
            if (viewForType instanceof C22448b) {
                this.f68296M = (C22448b) viewForType;
            }
        }
        ICommercializeAdService createICommercializeAdServicebyMonsterPlugin = CommercializeAdServiceImpl.createICommercializeAdServicebyMonsterPlugin();
        if (createICommercializeAdServicebyMonsterPlugin != null) {
            this.f68323y = (C26825c) createICommercializeAdServicebyMonsterPlugin.getView(this.f68308j, new C26822c(this.adPendantIv));
        }
        this.f68285A = CommerceEggServiceImpl.createICommerceEggServicebyMonsterPlugin();
        if (this.f68285A != null) {
            this.f68324z = this.f68285A.getCommerceEggView(this.eggViewStub);
        }
        if (this.vastAdTag != null) {
            this.vastAdTag.setOnClickListener(new C25913j(this));
        }
    }
}
