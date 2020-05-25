package com.p683ss.android.ugc.aweme.profile.p2090ui;

import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.app.Dialog;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.res.Resources;
import android.content.res.Resources.NotFoundException;
import android.graphics.Color;
import android.net.Uri.Builder;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.View;
import android.view.animation.RotateAnimation;
import android.widget.Button;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout.LayoutParams;
import android.widget.RelativeLayout;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.OnClick;
import com.C2240a;
import com.bytedance.android.live.base.event.RoomStatusEvent;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.ies.ugc.p694a.C11016e.C11018b;
import com.google.gson.C18085o;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.analysis.Analysis;
import com.p683ss.android.ugc.aweme.app.C23051bf;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1411c.C23481a;
import com.p683ss.android.ugc.aweme.base.p1411c.C23484c;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.base.utils.C23729p;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.p1545ad.C25592b;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.C26898j;
import com.p683ss.android.ugc.aweme.common.MobClick;
import com.p683ss.android.ugc.aweme.common.p1593e.C26872d;
import com.p683ss.android.ugc.aweme.common.p1596h.C26891a;
import com.p683ss.android.ugc.aweme.compliance.api.C27013a;
import com.p683ss.android.ugc.aweme.discover.mob.C28423z;
import com.p683ss.android.ugc.aweme.experiment.FollowToFollowBackExperiment;
import com.p683ss.android.ugc.aweme.experiment.NewUserDetailShareIconExperiemnt;
import com.p683ss.android.ugc.aweme.experiment.ProfileNavbarShareExperiment;
import com.p683ss.android.ugc.aweme.experiment.StopAnimWhenInvisibleExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30311ac;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30805bk;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30828c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView;
import com.p683ss.android.ugc.aweme.following.p1770ui.FollowRelationTabActivity;
import com.p683ss.android.ugc.aweme.friends.experiment.AccountSuggestionExperiment;
import com.p683ss.android.ugc.aweme.friends.model.RecommendList;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32772s;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.main.MainAnimViewModel;
import com.p683ss.android.ugc.aweme.music.OriginMusicListFragment;
import com.p683ss.android.ugc.aweme.newfollow.util.C37940g;
import com.p683ss.android.ugc.aweme.notice.api.helper.IMainServiceHelper;
import com.p683ss.android.ugc.aweme.notification.util.C38446k;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23201ah;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.p1807im.C33200k;
import com.p683ss.android.ugc.aweme.p1807im.C33205o;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35464a;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.p1807im.service.model.IMUser;
import com.p683ss.android.ugc.aweme.profile.C39939l;
import com.p683ss.android.ugc.aweme.profile.api.BlockApi;
import com.p683ss.android.ugc.aweme.profile.edit.C39847g;
import com.p683ss.android.ugc.aweme.profile.experiment.HideProfileMessageButton;
import com.p683ss.android.ugc.aweme.profile.model.BlockStruct;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.GeneralPermission;
import com.p683ss.android.ugc.aweme.profile.model.RecommendCommonUserModel;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2084b.C39797a;
import com.p683ss.android.ugc.aweme.profile.p2090ui.C40266bq.C40268b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.RecommendCommonUserViewMus.C40190b;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2091a.C40206c;
import com.p683ss.android.ugc.aweme.profile.p2090ui.p2092b.C40247c;
import com.p683ss.android.ugc.aweme.profile.p2090ui.widget.C40444k.C40446b;
import com.p683ss.android.ugc.aweme.profile.presenter.C39955ae;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39979m;
import com.p683ss.android.ugc.aweme.profile.presenter.C39980n;
import com.p683ss.android.ugc.aweme.profile.presenter.C39981o;
import com.p683ss.android.ugc.aweme.profile.presenter.C39993z;
import com.p683ss.android.ugc.aweme.profile.service.C40026s;
import com.p683ss.android.ugc.aweme.profile.tab.MusProfileTabImageView;
import com.p683ss.android.ugc.aweme.profile.util.C40519aa;
import com.p683ss.android.ugc.aweme.profile.util.C40572w;
import com.p683ss.android.ugc.aweme.profile.util.C40573x;
import com.p683ss.android.ugc.aweme.profile.viewmodel.FollowViewModel;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.services.MainServiceHelperImpl;
import com.p683ss.android.ugc.aweme.services.function.FunctionSupportService;
import com.p683ss.android.ugc.aweme.services.function.IFunctionKey;
import com.p683ss.android.ugc.aweme.share.C41979aq;
import com.p683ss.android.ugc.aweme.story.C46635b;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import com.p683ss.android.ugc.aweme.utils.C47795d;
import com.p683ss.android.ugc.aweme.utils.C47881fd;
import com.p683ss.android.ugc.aweme.utils.C47896fq;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47933n;
import com.p683ss.android.ugc.aweme.utils.permission.C47945d;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.android.ugc.aweme.web.C48278h;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutionException;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.I18nBaseUserProfileFragment */
public class I18nBaseUserProfileFragment extends C40212af implements C0199s<Boolean>, C9382a, C30313ae, C39979m, C39980n, C39981o, C40190b, C40206c, C40268b {

    /* renamed from: aA */
    public String f102178aA;

    /* renamed from: aB */
    public String f102179aB;

    /* renamed from: aC */
    public String f102180aC;

    /* renamed from: aD */
    public String f102181aD;

    /* renamed from: aE */
    List<String> f102182aE;

    /* renamed from: aF */
    C26872d<C40338do> f102183aF = new C26872d<C40338do>() {
        /* renamed from: a */
        public final /* synthetic */ void mo50455a(C1352v vVar) {
            C40338do doVar = (C40338do) vVar;
            if (doVar != null && I18nBaseUserProfileFragment.this.f102206al != null) {
                User user = doVar.f102976c;
                if (user == null) {
                    C52711k.m112237a("mUser");
                }
                if (user != null) {
                    String requestId = user.getRequestId();
                    int j = I18nBaseUserProfileFragment.this.mo82208j(user);
                    String uid = user.getUid();
                    C26890h.m65011a("follow_card", C23089d.m56640a().mo47829a("enter_from", "others_homepage").mo47829a("event_type", "impression").mo47829a("req_id", requestId).mo47826a("impr_order", j).mo47829a("rec_type", user.getRecType()).mo47829a("rec_uid", uid).mo47829a("from_user_id", I18nBaseUserProfileFragment.this.f102207am).f61491a);
                    if (I18nBaseUserProfileFragment.this.f102182aE == null) {
                        I18nBaseUserProfileFragment.this.f102182aE = new ArrayList();
                    }
                    if (!I18nBaseUserProfileFragment.this.f102182aE.contains(user.getUid())) {
                        C37940g.m84832a().mo77415a(1, user.getUid());
                        I18nBaseUserProfileFragment.this.f102182aE.add(user.getUid());
                    }
                }
            }
        }
    };

    /* renamed from: aG */
    private ImageView f102184aG;

    /* renamed from: aH */
    private String f102185aH;

    /* renamed from: aI */
    private String f102186aI;

    /* renamed from: aJ */
    private String f102187aJ;

    /* renamed from: aK */
    private boolean f102188aK;

    /* renamed from: aL */
    private C40273bu f102189aL;

    /* renamed from: aM */
    private OriginMusicListFragment f102190aM;

    /* renamed from: aN */
    private ImageView f102191aN;

    /* renamed from: aO */
    private boolean f102192aO;

    /* renamed from: aP */
    private boolean f102193aP;

    /* renamed from: aQ */
    private String f102194aQ;

    /* renamed from: aR */
    private String f102195aR;

    /* renamed from: aS */
    private MainAnimViewModel f102196aS;

    /* renamed from: aT */
    private C25908e f102197aT = new C25908e();

    /* renamed from: aU */
    private View f102198aU;

    /* renamed from: aV */
    private boolean f102199aV = false;

    /* renamed from: aW */
    private boolean f102200aW = false;

    /* renamed from: aX */
    private String f102201aX;

    /* renamed from: aY */
    private String f102202aY;

    /* renamed from: aZ */
    private String f102203aZ;
    @BindView(2131492923)
    TextView adBottomMoreBtn;

    /* renamed from: aj */
    C39955ae f102204aj;

    /* renamed from: ak */
    public C32772s f102205ak;

    /* renamed from: al */
    public C39993z f102206al;

    /* renamed from: am */
    public String f102207am;

    /* renamed from: an */
    public int f102208an;

    /* renamed from: ao */
    public String f102209ao;

    /* renamed from: ap */
    public C40273bu f102210ap;

    /* renamed from: aq */
    protected Aweme f102211aq;

    /* renamed from: ar */
    public String f102212ar;

    /* renamed from: as */
    float f102213as;

    /* renamed from: at */
    LiveCircleView f102214at;

    /* renamed from: au */
    TextView f102215au;

    /* renamed from: av */
    protected String f102216av = "follow_button";

    /* renamed from: aw */
    public C9381g f102217aw;

    /* renamed from: ax */
    public String f102218ax = "";

    /* renamed from: ay */
    FollowViewModel f102219ay;

    /* renamed from: az */
    public String f102220az;

    /* renamed from: ba */
    private String f102221ba;

    /* renamed from: bb */
    private boolean f102222bb = true;

    /* renamed from: bc */
    private String f102223bc;

    /* renamed from: bd */
    private String f102224bd;

    /* renamed from: be */
    private boolean f102225be;

    /* renamed from: bf */
    private int f102226bf;

    /* renamed from: bg */
    private String f102227bg;

    /* renamed from: bh */
    private C30828c f102228bh;

    /* renamed from: bi */
    private String f102229bi;

    /* renamed from: bj */
    private String f102230bj;

    /* renamed from: bk */
    private String f102231bk;

    /* renamed from: bl */
    private boolean f102232bl = false;

    /* renamed from: bm */
    private boolean f102233bm;

    /* renamed from: bn */
    private long f102234bn = 0;

    /* renamed from: bo */
    private List<String> f102235bo = new ArrayList();

    /* renamed from: bp */
    private C30805bk f102236bp;
    @BindView(2131494407)
    TextView followBn;
    @BindView(2131493635)
    View followIv;
    @BindView(2131493636)
    View followIv16;
    @BindView(2131493610)
    FrameLayout mFlHead;
    @BindView(2131493925)
    View mIvMutual;
    @BindView(2131492998)
    AnimationImageView mLiveStatusView;
    @BindView(2131494460)
    protected RecommendCommonUserViewMus mRecommendCommonUserView;
    @BindView(2131494934)
    protected RelativeLayout mTitleBar;
    @BindView(2131495068)
    TextView mTvFollow;
    @BindView(2131494465)
    ImageView recommededUsersIv;
    @BindView(2131494490)
    TextView requestedBtn;
    @BindView(2131494628)
    Button sendMsgBtn;
    @BindView(2131495206)
    TextView txtAdBottomDes;
    @BindView(2131495264)
    View viewUserInfo;

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public final boolean mo82183A() {
        return true;
    }

    /* renamed from: Y_ */
    public final boolean mo45396Y_() {
        return true;
    }

    /* renamed from: a */
    public final void mo60714a(Object obj) {
    }

    /* renamed from: b */
    public final void mo60638b(RecommendList recommendList) {
    }

    /* renamed from: b */
    public final void mo81894b(User user) {
    }

    /* renamed from: d */
    public final String mo81901d() {
        return this.f102207am;
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final int mo82167i() {
        return R.layout.bp5;
    }

    /* renamed from: a */
    public final void mo82197a(boolean z) {
        this.f102193aP = z;
        setUserVisibleHint(z);
        if (z) {
            m89143n(this.f102208an);
        }
        if (getActivity() != null) {
            C23729p.m58263b((Activity) getActivity());
            if (z) {
                C23729p.m58269c((Activity) getActivity());
                if (this.f103081w != null && !TextUtils.isEmpty(this.f103081w.getBioEmail())) {
                    C40247c.m89519a("others_homepage", "email", this.f103081w);
                }
                if (this.f103081w != null && !TextUtils.isEmpty(this.f103081w.getBioUrl())) {
                    C40247c.m89519a("others_homepage", "weblink", this.f103081w);
                }
            } else {
                FragmentActivity activity = getActivity();
                if (VERSION.SDK_INT >= 23) {
                    activity.getWindow().getDecorView().setSystemUiVisibility(PreloadTask.BYTE_UNIT_NUMBER);
                }
            }
        }
        if (this.f102196aS != null) {
            this.f102196aS.f93423c.setValue(Boolean.valueOf(z));
        }
        if (z) {
            mo82445C();
            this.f102199aV = false;
            m89141i(true);
            if (this.f103081w != null && this.f103081w.isLive()) {
                C46641d.m101215a(this.f103081w.getUid(), this.f103081w.roomId, "others_homepage", "others_photo", this.f103081w.getRequestId(), -1, "");
            }
            mo81889a(C47933n.m103706a(this.f103081w));
        } else {
            mo82446D();
        }
        if (this.f102726aa != null) {
            this.f102726aa.mo48653b(z);
        }
    }

    /* renamed from: a */
    public final void mo82193a(Aweme aweme) {
        if (isViewValid()) {
            this.f102211aq = aweme;
            if (this.f102211aq == null) {
                this.f102197aT.mo53254j();
                return;
            }
            this.f102212ar = this.f102211aq.getAid();
            this.f102197aT.mo53240a(getContext(), this.f102211aq);
            if (C25945k.m62916g().mo54096a(aweme, false)) {
                C47795d.m103429a(this.adBottomMoreBtn);
                this.adBottomMoreBtn.setBackground(new C25592b((float) C23728o.m58241a(2.0d), Color.parseColor(C26503d.m64078u(aweme))));
                this.adBottomMoreBtn.setText(C25945k.m62916g().mo54094a(getContext(), aweme, false));
            } else {
                m89145p(0);
            }
            if (aweme.getAwemeRawAd() != null && !TextUtils.isEmpty(C25945k.m62928s().mo54130a(aweme.getAwemeRawAd()))) {
                this.txtAdBottomDes.setText(C25945k.m62928s().mo54130a(aweme.getAwemeRawAd()));
            }
            if (!(this.f102211aq == null || this.f102211aq.getAuthor() == null)) {
                User author = this.f102211aq.getAuthor();
                this.f103082x = C47915gg.m103652b(author, C47915gg.m103664m(author));
            }
        }
    }

    /* renamed from: a */
    public final void mo82196a(String str, String str2) {
        this.f102207am = str;
        this.f102185aH = str2;
        if (this.f102190aM != null) {
            this.f102190aM.mo53807a(str, str2);
            this.f102190aM.f95004k = TextUtils.isEmpty(this.f103081w.getUniqueId()) ? this.f103081w.getShortId() : this.f103081w.getUniqueId();
        }
        if (this.f102189aL != null) {
            this.f102189aL.mo53807a(str, str2);
        }
        if (this.f102210ap != null) {
            this.f102210ap.mo53807a(str, str2);
        }
    }

    /* renamed from: a */
    public final void mo50432a(String str) {
        this.f102194aQ = str;
    }

    /* renamed from: a */
    public final void mo81892a(boolean z, boolean z2, boolean z3) {
        if (this.mLiveStatusView != null) {
            if (!z || !C46635b.m101190a() || C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w))) {
                this.f102706F.setBorderColor(R.color.bs);
                this.f102706F.setBorderWidth(1);
                this.f102706F.mo82245d();
                if (this.f102215au != null && this.f102215au.getVisibility() == 0) {
                    this.f102215au.setVisibility(8);
                }
                if (this.f102214at != null && this.f102214at.getVisibility() == 0) {
                    this.f102214at.setVisibility(8);
                }
                if (this.f102228bh != null) {
                    this.f102228bh.mo63567d();
                }
                this.mLiveStatusView.mo6661f();
                this.mLiveStatusView.setVisibility(8);
            } else {
                if (this.f102193aP && this.f103081w != null) {
                    C46641d.m101209a(getContext(), false, 0, this.f103081w.getRequestId(), this.f102207am, this.f103081w.roomId);
                }
                if (!this.f102222bb && this.f103081w != null) {
                    C46641d.m101215a(this.f103081w.getUid(), this.f103081w.roomId, "others_homepage", "others_photo", this.f103081w.getRequestId(), -1, "");
                }
                if (!m89122N() || this.f102214at == null || this.f102215au == null) {
                    this.f102706F.setBorderColor(R.color.a3c);
                    this.f102706F.setBorderWidth(2);
                    this.f102706F.mo82245d();
                    this.mLiveStatusView.setVisibility(0);
                    this.mLiveStatusView.setAnimation("tag_profile_live.json");
                    this.mLiveStatusView.mo6654b();
                    if (this.f102215au != null && this.f102215au.getVisibility() == 0) {
                        this.f102215au.setVisibility(8);
                    }
                    if (this.f102214at != null && this.f102214at.getVisibility() == 0) {
                        this.f102214at.setVisibility(8);
                    }
                    if (this.f102228bh != null) {
                        this.f102228bh.mo63567d();
                    }
                } else {
                    this.f102706F.setBorderWidth(0);
                    this.f102706F.mo82245d();
                    this.mLiveStatusView.mo6661f();
                    this.mLiveStatusView.setVisibility(8);
                    this.f102215au.setText(m89121M());
                    if (this.f102215au.getVisibility() == 8) {
                        this.f102215au.setVisibility(0);
                    }
                    if (this.f102214at.getVisibility() == 8) {
                        this.f102214at.setVisibility(0);
                    }
                    if (this.f102228bh == null) {
                        this.f102228bh = new C30828c(true, this.f102706F, this.f102706F, this.f102214at);
                        this.f102228bh.mo63563a(null, getClass(), null);
                    }
                    this.f102228bh.mo63566c();
                    try {
                        HashMap hashMap = new HashMap();
                        hashMap.put("enter_from_merge", "others_homepage");
                        hashMap.put("is_english", "LIVE".equals(m89121M()) ? "1" : "0");
                        C36173w.m81665a().getLive().mo15061n().mo15023a("livesdk_live_show_language", hashMap, new Object[0]);
                    } catch (Exception unused) {
                    }
                }
            }
        }
    }

    /* renamed from: a */
    public final void mo81890a(User user) {
        if (isViewValid()) {
            super.mo81890a(user);
            this.f102232bl = true;
            this.f103081w = user;
            mo82196a(user.getUid(), user.getSecUid());
            if (this.f102189aL != null) {
                this.f102189aL.mo82532a(this.f103081w);
            }
            mo82623g(this.f103081w);
            this.f102710J.mo82081a(this.f102709I, this.f103068j.contains(Integer.valueOf(3)), false, this);
            mo82464y();
            this.f102722W.notifyDataSetChanged();
            m89139g(C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w)));
            m89140h(this.f103081w != null && this.f103081w.isBlock());
            mo82184E();
            if (C47915gg.m103664m(this.f103081w)) {
                this.f102191aN.setVisibility(8);
                this.recommededUsersIv.setVisibility(8);
            } else {
                this.f102191aN.setVisibility(0);
                this.f102718S.setVisibility(8);
            }
            if (!C47915gg.m103664m(this.f103081w) && m89129U()) {
                this.recommededUsersIv.setVisibility(0);
            }
            if (!TextUtils.equals(user.getUid(), this.f102207am)) {
                this.f102204aj.mo44934a_(this.f102207am, this.f102185aH);
                return;
            }
            mo82451h(this.f103081w);
            if (C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w))) {
                this.f102710J.setScrollable(false);
                this.f102709I.setScrollable(false);
            }
            m89127S();
            mo82205e(!user.isShowFavoriteList());
        }
    }

    /* renamed from: a */
    public final void mo82194a(C30805bk bkVar) {
        this.f102236bp = bkVar;
    }

    /* renamed from: a */
    public final void mo82195a(User user, int i) {
        if (isViewValid()) {
            if (user != null) {
                this.f103058A.mo82943a(user);
                if (this.f102204aj == null) {
                    this.f102204aj = new C39955ae();
                    this.f102204aj.mo54800a(this);
                    this.f102204aj.f101854e = this.f102194aQ;
                    this.f102204aj.f101855h = this.f102226bf;
                }
                this.f102204aj.mo81912a(user, false);
            }
            mo82624n();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82192a(BaseResponse baseResponse) throws Exception {
        this.f103081w.setFollowerStatus(0);
        if (this.f103081w.getFollowStatus() == 2) {
            this.f103081w.setFollowStatus(1);
        }
        mo81886a(this.f103081w.getFollowStatus(), this.f103081w.getFollowerStatus());
    }

    /* renamed from: a */
    public final void mo60635a(Exception exc) {
        C22971a.m56493a((Context) getActivity(), (Throwable) exc);
        m89144o(0);
    }

    /* renamed from: a */
    public final void mo60634a(final RecommendList recommendList) {
        if (this.f102183aF != null && this.mRecommendCommonUserView != null) {
            this.mRecommendCommonUserView.setOnViewAttachedToWindowListener(this.f102183aF);
            this.mRecommendCommonUserView.mo82363a(recommendList.getUserList(), recommendList.getRid());
            this.mRecommendCommonUserView.setOnItemOperationListener(new C40446b() {
                /* renamed from: b */
                public final void mo82231b(User user, int i) {
                    I18nBaseUserProfileFragment.this.mo82201c(false);
                }

                /* renamed from: a */
                public final void mo82230a(User user, int i) {
                    if (user != null) {
                        C32616c.f84865a.dislikeRecommendUser(user.getUid(), user.getSecUid());
                        String uid = user.getUid();
                        int j = I18nBaseUserProfileFragment.this.mo82208j(user);
                        String requestId = user.getRequestId();
                        C26890h.m65011a("follow_card", C23089d.m56640a().mo47829a("rec_uid", uid).mo47829a("enter_from", "others_homepage").mo47829a("event_type", "delete").mo47826a("impr_order", j).mo47829a("rec_type", user.getRecType()).mo47829a("req_id", requestId).mo47829a("from_user_id", I18nBaseUserProfileFragment.this.f102207am).f61491a);
                        I18nBaseUserProfileFragment.this.f102206al.mo81921a(user);
                    }
                }

                /* renamed from: d */
                public final void mo82233d(User user, int i) {
                    if (user != null) {
                        String requestId = user.getRequestId();
                        String uid = user.getUid();
                        C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("enter_method", "click_card").mo47829a("enter_from", "others_homepage").mo47829a("to_user_id", uid).mo47829a("req_id", requestId).mo47826a("impr_order", I18nBaseUserProfileFragment.this.mo82208j(user)).mo47829a("impr_id", requestId).mo47829a("rec_type", user.getRecType()).mo47829a("from_user_id", I18nBaseUserProfileFragment.this.f102207am).f61491a);
                    }
                }

                /* renamed from: c */
                public final void mo82232c(User user, int i) {
                    if (user != null) {
                        if (user.getFollowStatus() == 0) {
                            String str = "single";
                            if (user.getFollowerStatus() == 1) {
                                str = "mutual";
                            }
                            String rid = recommendList.getRid();
                            String uid = user.getUid();
                            String str2 = I18nBaseUserProfileFragment.this.f102218ax;
                            C26890h.m65011a("follow_card", C23089d.m56640a().mo47829a("enter_method", "follow_card_button").mo47829a("enter_from", "others_homepage").mo47829a("previous_page", str2).mo47829a("event_type", "follow").mo47829a("req_id", rid).mo47829a("rec_type", user.getRecType()).mo47829a("to_user_id", uid).mo47829a("rec_uid", uid).mo47829a("from_user_id", I18nBaseUserProfileFragment.this.f102207am).f61491a);
                            String imprId = recommendList.getLogPb().getImprId();
                            String rid2 = recommendList.getRid();
                            String uid2 = user.getUid();
                            String str3 = I18nBaseUserProfileFragment.this.f102218ax;
                            C26890h.m65011a("follow", C23089d.m56640a().mo47829a("enter_method", "follow_card_button").mo47829a("enter_from", "others_homepage").mo47829a("previous_page", str3).mo47829a("event_type", "card").mo47829a("impr_id", imprId).mo47829a("req_id", rid2).mo47826a("impr_order", I18nBaseUserProfileFragment.this.mo82208j(user)).mo47829a("rec_type", user.getRecType()).mo47829a("to_user_id", uid2).mo47829a("from_user_id", I18nBaseUserProfileFragment.this.f102207am).mo47829a("follow_type", str).f61491a);
                            return;
                        }
                        String rid3 = recommendList.getRid();
                        String uid3 = user.getUid();
                        String str4 = I18nBaseUserProfileFragment.this.f102218ax;
                        C26890h.m65011a("follow_card", C23089d.m56640a().mo47829a("enter_method", "follow_card_button").mo47829a("enter_from", "others_homepage").mo47829a("previous_page", str4).mo47829a("event_type", "follow_cancel").mo47829a("req_id", rid3).mo47829a("rec_type", user.getRecType()).mo47829a("to_user_id", uid3).mo47829a("rec_uid", uid3).mo47829a("from_user_id", I18nBaseUserProfileFragment.this.f102207am).f61491a);
                        String imprId2 = recommendList.getLogPb().getImprId();
                        String rid4 = recommendList.getRid();
                        String uid4 = user.getUid();
                        String str5 = I18nBaseUserProfileFragment.this.f102218ax;
                        C26890h.m65011a("follow_cancel", C23089d.m56640a().mo47829a("enter_method", "follow_card_button").mo47829a("enter_from", "others_homepage").mo47829a("previous_page", str5).mo47829a("event_type", "card").mo47829a("impr_id", imprId2).mo47829a("req_id", rid4).mo47829a("rec_type", user.getRecType()).mo47829a("to_user_id", uid4).mo47829a("from_user_id", I18nBaseUserProfileFragment.this.f102207am).f61491a);
                    }
                }
            });
            if (recommendList != null && !C9376b.m18558a((Collection<T>) recommendList.getUserList())) {
                mo82201c(true);
            } else if (!this.f102233bm) {
                this.f102225be = true;
                this.mRecommendCommonUserView.mo82364a(true);
                String str = "";
                if (this.f103081w != null) {
                    str = this.f103081w.getRecType();
                }
                C40573x.m90012a(this.f102207am, str);
                m89131a(true, this.mRecommendCommonUserView, this.viewUserInfo, this.f102213as);
                m89144o(2);
            } else {
                m89144o(0);
            }
        }
    }

    /* renamed from: a */
    public final void mo82189a() {
        m89133b(this.f102207am, this.f102185aH);
    }

    public final boolean ap_() {
        m89132a(true, true);
        this.f102200aW = false;
        return false;
    }

    /* renamed from: E */
    public final void mo82184E() {
        if (getActivity() != null && isAdded()) {
            m89120L();
        }
    }

    public Analysis getAnalysis() {
        return new Analysis().setLabelName("others_homepage");
    }

    public void onStop() {
        super.onStop();
        C37940g.m84832a().mo77418d();
    }

    /* renamed from: M */
    private String m89121M() {
        try {
            return C36173w.m81665a().getLive().mo15061n().mo15022a(getActivity());
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: N */
    private static boolean m89122N() {
        try {
            return C36173w.m81665a().getLive().mo15062o().mo15065a();
        } catch (Exception unused) {
            return false;
        }
    }

    /* renamed from: P */
    private String m89124P() {
        String str = "";
        if (!TextUtils.isEmpty(this.f102195aR)) {
            return this.f102195aR;
        }
        if (this.f102211aq != null) {
            return this.f102211aq.getRequestId();
        }
        return str;
    }

    /* renamed from: U */
    private static boolean m89129U() {
        if (AccountSuggestionExperiment.m75372c()) {
            return C39939l.m88682a();
        }
        if (AccountSuggestionExperiment.m75371b() || AccountSuggestionExperiment.m75370a()) {
            return true;
        }
        return false;
    }

    /* renamed from: J */
    public final void mo82188J() {
        if (getActivity() != null) {
            FollowRelationTabActivity.m74407a(getActivity(), this.f103081w, "suggest_user");
        }
    }

    public void onPause() {
        super.onPause();
        if (this.f102193aP) {
            mo82446D();
        }
        if (this.f102196aS != null) {
            this.f102196aS.f93423c.setValue(Boolean.valueOf(false));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final boolean mo82222p() {
        boolean z;
        Bundle arguments = getArguments();
        if (arguments != null) {
            z = TextUtils.equals(arguments.getString("profile_from", ""), "feed_detail");
        } else {
            z = false;
        }
        if (!z) {
            return true;
        }
        return false;
    }

    /* renamed from: Q */
    private int m89125Q() {
        int i = this.f102208an;
        if (i == 4) {
            return 0;
        }
        switch (i) {
            case 0:
                if (this.f103081w.isSecret()) {
                    return 4;
                }
                if (this.f103081w.getFollowerStatus() == 1) {
                    return 2;
                }
                return 1;
            default:
                return 0;
        }
    }

    /* renamed from: H */
    public final void mo82155H() {
        if (this.f102709I != null && this.f102709I.getCurrentItem() != mo82460s() && mo82460s() != -1) {
            this.f102709I.setCurrentItem(mo82460s(), false);
        }
    }

    /* renamed from: c */
    public final void mo81898c() {
        super.mo81898c();
        mo82450f(this.f103081w);
        if (m89129U() && this.viewUserInfo != null) {
            this.viewUserInfo.post(new C40250ba(this));
            LayoutParams layoutParams = (LayoutParams) this.viewUserInfo.getLayoutParams();
            layoutParams.height = -2;
            this.viewUserInfo.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: h */
    public final boolean mo82166h() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            if ((activity instanceof C11018b) || C40026s.f101964a.isDetailActivity(activity)) {
                if (!ScrollSwitchStateManager.m75876a(activity).mo69868b("page_feed")) {
                    return true;
                }
                return false;
            } else if (C40026s.f101964a.isUserProfileActivity(activity)) {
                return true;
            }
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo82168k() {
        if (isViewValid()) {
            C26890h.onEvent(MobClick.obtain().setEventName("click_follow_count").setLabelName("others_homepage"));
            C26890h.m65011a("click_follow_count", new C23089d().mo47829a("enter_from", "others_homepage").f61491a);
            FollowRelationTabActivity.m74407a(getActivity(), this.f103081w, "following_relation");
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: l */
    public final void mo82169l() {
        if (isViewValid()) {
            C26890h.onEvent(MobClick.obtain().setEventName("click_fans_count").setLabelName("others_homepage"));
            C26890h.m65011a("click_fans_count", new C23089d().mo47829a("enter_from", "others_homepage").f61491a);
            if (this.f103081w != null) {
                FollowRelationTabActivity.m74407a(getActivity(), this.f103081w, "follower_relation");
            }
        }
    }

    public void onDestroyView() {
        super.onDestroyView();
        if (this.f102204aj != null) {
            this.f102204aj.mo46991S_();
            this.f102204aj = null;
        }
        if (this.f102205ak != null) {
            this.f102205ak.mo66347S_();
            this.f102205ak = null;
        }
        if (this.f102206al != null) {
            this.f102206al.mo77195c();
        }
    }

    /* renamed from: t */
    public final void mo82224t() {
        super.mo82224t();
        this.f102206al = null;
        mo82201c(false);
        if (this.mRecommendCommonUserView != null) {
            this.mRecommendCommonUserView.mo82362a();
        }
        m89144o(0);
        this.f102232bl = false;
        if (this.f102189aL != null) {
            this.f102189aL.mo82523D();
        }
        if (this.f102210ap != null) {
            this.f102210ap.mo82523D();
        }
        this.f103082x = false;
    }

    /* renamed from: S */
    private void m89127S() {
        if (this.f103081w != null && this.f103081w.getGeneralPermission() != null && !TextUtils.isEmpty(this.f103081w.getGeneralPermission().getProfileToast())) {
            C10691a.m21545b(getContext(), this.f103081w.getGeneralPermission().getProfileToast()).mo19066a();
            C26890h.m65011a("show_punish_toast", new C23089d().mo47829a("enter_from", "others_homepage").mo47829a("show_type", C40519aa.m89927a(this.f103081w)).f61491a);
        }
    }

    /* renamed from: T */
    private void m89128T() {
        if (this.f102204aj != null) {
            this.f102204aj.mo44934a_(this.f102207am, this.f102185aH);
        }
        boolean b = C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w));
        if (b) {
            m89139g(b);
            if (this.f102210ap != null) {
                this.f102210ap.mo82538n();
            }
            if (this.f102189aL != null) {
                this.f102189aL.mo82538n();
            }
        } else {
            if (this.f102210ap != null) {
                this.f102210ap.mo82510w();
            }
            if (this.f102189aL != null) {
                this.f102189aL.mo82510w();
            }
        }
    }

    /* renamed from: F */
    public final void mo82185F() {
        if (this.f103081w != null) {
            C26890h.m65011a("report_user", C23089d.m56640a().mo47829a("others_homepage", "others_homepage").mo47829a("to_user_id", this.f103081w.getUid()).f61491a);
            String str = "";
            try {
                C18085o oVar = new C18085o();
                oVar.mo35020a("unique_id", C47915gg.m103656e(this.f103081w));
                oVar.mo35018a("is_blocked", Boolean.valueOf(this.f103081w.isBlock()));
                str = C47760cd.m103385a(oVar);
            } catch (Exception unused) {
            }
            C27013a.m65227a().report(getActivity(), new Builder().appendQueryParameter("owner_id", this.f103081w.getUid()).appendQueryParameter("object_id", this.f103081w.getUid()).appendQueryParameter("report_type", "user").appendQueryParameter("extra", str));
        }
    }

    /* renamed from: G */
    public final void mo82186G() {
        User user = this.f103081w;
        if (user == null) {
            user = new User();
            user.setUid(this.f102207am);
            user.setSecUid(this.f102185aH);
        }
        if (C26503d.m64061d(this.f102211aq)) {
            C33200k.m76279d().startChatWithAdLog(getContext(), m89142k(this.f103081w), new C35464a(this.f102211aq.getAwemeRawAd().getLogExtra(), String.valueOf(this.f102211aq.getAwemeRawAd().getCreativeId())));
        } else {
            C33200k.m76279d().startChat(getContext(), m89142k(user));
        }
        C33205o.m76295a(this.f102207am);
        C33205o.m76298a(this.f102207am, this.f102212ar, this.f102194aQ, this.f102195aR, "click_stranger_chat_button");
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public final void mo82163g() {
        super.mo82163g();
        C38446k.m85764a(this.followIv);
        C38446k.m85764a(this.sendMsgBtn);
        C38446k.m85764a(this.requestedBtn);
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo82170m() {
        if (isViewValid() && this.f103081w != null) {
            if (!this.f103081w.isLive() || C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w))) {
                C26890h.m65011a("click_profile_icon", C23089d.m56640a().mo47829a("author_id", this.f103081w.getUid()).mo47829a("enter_from", "others_homepage").mo47829a("enter_method", "click_head").f61491a);
                new C39847g(getActivity(), this.f102706F, null, this.f103081w).mo80952a();
                return;
            }
            C40026s.f101964a.watchFromProfile(getContext(), this.f103081w, false, new C39979m() {
                public final void onFollowFail(Exception exc) {
                    I18nBaseUserProfileFragment.this.onFollowFail(exc);
                }

                public final void onFollowSuccess(FollowStatus followStatus) {
                    I18nBaseUserProfileFragment.this.onFollowSuccess(followStatus);
                    I18nBaseUserProfileFragment.this.f103081w.setFollowStatus(followStatus.followStatus);
                    C40026s.f101964a.watchFromProfile(I18nBaseUserProfileFragment.this.getContext(), I18nBaseUserProfileFragment.this.f103081w, false, null);
                }
            });
        }
    }

    public void onResume() {
        boolean z;
        super.onResume();
        if (this.f102204aj != null && this.f103081w != null && this.f103081w.isLive()) {
            mo82189a();
        } else if (!(this.f102204aj == null || this.f103081w == null || this.f103081w.isLive())) {
            this.f102204aj.mo81911a(this.f103081w);
        }
        if (this.f102196aS != null) {
            MainAnimViewModel mainAnimViewModel = this.f102196aS;
            if (mainAnimViewModel.f93425e.getValue() == null) {
                z = true;
            } else {
                z = ((Boolean) mainAnimViewModel.f93425e.getValue()).booleanValue();
            }
            if (z && TextUtils.equals((CharSequence) this.f102196aS.f93424d.getValue(), "page_profile")) {
                this.f102196aS.f93423c.setValue(Boolean.valueOf(true));
            }
        }
    }

    /* renamed from: u */
    public final void mo82225u() {
        super.mo82225u();
        this.f102213as = C9432q.m18687b(getContext(), 20.0f);
        this.viewUserInfo.post(new C40239ay(this));
        LayoutParams layoutParams = (LayoutParams) this.viewUserInfo.getLayoutParams();
        layoutParams.height = -2;
        this.viewUserInfo.setLayoutParams(layoutParams);
        this.f102206al = null;
        mo82201c(false);
        if (this.mRecommendCommonUserView != null) {
            this.mRecommendCommonUserView.mo82362a();
        }
        m89144o(0);
        this.f102232bl = false;
        if (this.f102189aL != null) {
            this.f102189aL.mo82523D();
        }
        if (this.f102210ap != null) {
            this.f102210ap.mo82523D();
        }
    }

    /* renamed from: L */
    private void m89120L() {
        boolean z;
        boolean z2;
        boolean z3;
        boolean z4;
        boolean z5 = true;
        if (this.f103078t == this.f102722W.mo82579e(1) && this.f102189aL != null && this.f102189aL.aT_()) {
            C40273bu buVar = this.f102189aL;
            if (this.f103081w == null) {
                z3 = this.f103082x;
            } else {
                z3 = C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w));
            }
            buVar.mo76536c_(z3);
            C40273bu buVar2 = this.f102189aL;
            if (this.f103081w == null || !this.f103081w.isBlocked()) {
                z4 = false;
            } else {
                z4 = true;
            }
            buVar2.mo77335c(z4);
            this.f102189aL.aV_();
        }
        if (this.f103078t == this.f102722W.mo82579e(0) && this.f102210ap != null && this.f102210ap.aT_()) {
            C40273bu buVar3 = this.f102210ap;
            if (this.f103081w == null) {
                z = this.f103082x;
            } else {
                z = C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w));
            }
            buVar3.mo76536c_(z);
            C40273bu buVar4 = this.f102210ap;
            if (this.f103081w == null || !this.f103081w.isBlocked()) {
                z2 = false;
            } else {
                z2 = true;
            }
            buVar4.mo77335c(z2);
            this.f102210ap.aV_();
        }
        if (this.f103078t == this.f102722W.mo82579e(3) && this.f102190aM != null && this.f102190aM.aT_()) {
            GeneralPermission generalPermission = this.f103081w.getGeneralPermission();
            if (generalPermission == null || generalPermission.getOriginalList() != 1) {
                this.f102190aM.mo76536c_(C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w)));
                OriginMusicListFragment originMusicListFragment = this.f102190aM;
                if (this.f103081w == null || !this.f103081w.isBlocked()) {
                    z5 = false;
                }
                originMusicListFragment.mo77335c(z5);
                this.f102190aM.aV_();
            } else {
                this.f102190aM.aJ_();
            }
        }
    }

    /* renamed from: I */
    public final void mo82187I() {
        if (this.f103081w != null) {
            C26890h.m65011a("click_block", C23089d.m56640a().mo47829a("others_homepage", "others_homepage").mo47829a("to_user_id", this.f103081w.getUid()).f61491a);
            if (this.f103081w.isBlock()) {
                BlockApi.m88497a((Handler) this.f102217aw, this.f103081w.getUid(), this.f103081w.getSecUid(), 0);
                C33205o.m76296a("others_homepage", this.f103081w.getUid());
                return;
            }
            C400895 r0 = new OnClickListener() {
                public final void onClick(DialogInterface dialogInterface, int i) {
                    if (i == -2 || i != -1) {
                        C33205o.m76297a("cancel", I18nBaseUserProfileFragment.this.f103081w.getUid(), "others_homepage");
                        dialogInterface.dismiss();
                    } else {
                        dialogInterface.dismiss();
                        BlockApi.m88497a((Handler) I18nBaseUserProfileFragment.this.f102217aw, I18nBaseUserProfileFragment.this.f103081w.getUid(), I18nBaseUserProfileFragment.this.f103081w.getSecUid(), 1);
                        C33205o.m76297a("success", I18nBaseUserProfileFragment.this.f103081w.getUid(), "others_homepage");
                        if (TextUtils.equals(I18nBaseUserProfileFragment.this.f102209ao, "chat")) {
                            C33205o.m76299b(I18nBaseUserProfileFragment.this.f103081w.getUid());
                        }
                        if (I18nBaseUserProfileFragment.this.f102208an != 0) {
                            I18nBaseUserProfileFragment.this.f102208an = 0;
                            I18nBaseUserProfileFragment.this.mo82164g(I18nBaseUserProfileFragment.this.f102208an);
                        }
                    }
                }
            };
            new C10643a(getContext()).mo18899b((int) R.string.tj).mo18900b((int) R.string.wf, (OnClickListener) r0).mo18886a((int) R.string.ah2, (OnClickListener) r0).mo18897a().mo18882b();
            C33205o.m76297a("others_homepage", this.f103081w.getUid(), "");
        }
    }

    /* renamed from: R */
    private String[] m89126R() {
        Resources resources;
        int i;
        ArrayList arrayList = new ArrayList();
        if (TextUtils.isEmpty(this.f102220az)) {
            this.f102220az = getResources().getString(R.string.d75);
        }
        if (TextUtils.isEmpty(this.f102180aC)) {
            this.f102180aC = getResources().getString(R.string.dda);
        }
        arrayList.add(this.f102220az);
        this.f102235bo.add("report_user");
        if (this.f103081w != null && C20854a.m53167g().isLogin()) {
            if (this.f103081w.isBlock()) {
                resources = getResources();
                i = R.string.f69;
            } else {
                resources = getResources();
                i = R.string.t7;
            }
            this.f102178aA = resources.getString(i);
            arrayList.add(this.f102178aA);
            if (this.f103081w.isBlock()) {
                this.f102235bo.add("unblock");
            } else {
                this.f102235bo.add("block");
            }
            if (((Boolean) SharePrefCache.inst().getRemoveFollowerSwitch().mo47782d()).booleanValue() && this.f103081w != null && this.f103081w.getFollowerStatus() == 1) {
                this.f102235bo.add("remove_follower");
                this.f102179aB = getString(R.string.d6q);
                arrayList.add(this.f102179aB);
            }
            if (C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w))) {
                if (C47915gg.m103645a(this.f103081w.getFollowStatus())) {
                    if (this.f103081w.getWatchwStatus() == 0) {
                        this.f102235bo.add("turnon_post_notification");
                    } else {
                        this.f102235bo.add("turnoff_post_notification");
                    }
                }
            } else if (!this.f103081w.isBlock()) {
                if (this.f103081w.getWatchwStatus() == 0) {
                    this.f102235bo.add("turnon_post_notification");
                } else {
                    this.f102235bo.add("turnoff_post_notification");
                }
            }
            if (!this.f103081w.isBlock() && C40026s.f101964a.canIM() && !C47915gg.m103651b()) {
                arrayList.add(this.f102180aC);
                this.f102235bo.add("message");
            }
        }
        if (TextUtils.isEmpty(this.f102181aD)) {
            this.f102181aD = getResources().getString(R.string.dib);
        }
        if (this.f103081w != null && ((C20854a.m53167g().isMe(this.f103081w.getUid()) || !this.f103081w.isSecret()) && !FunctionSupportService.INSTANCE.notSupport(IFunctionKey.SHARE_PROFILE))) {
            arrayList.add(0, this.f102181aD);
        }
        String[] strArr = new String[arrayList.size()];
        arrayList.toArray(strArr);
        return strArr;
    }

    /* renamed from: O */
    private void m89123O() {
        String str;
        String str2;
        String str3;
        String str4;
        boolean a = C47915gg.m103645a(this.f102208an);
        int Q = m89125Q();
        if (Q == 4) {
            m89130a((Activity) getActivity());
        }
        int i = 0;
        if (this.f102208an != 4 && !a) {
            i = 1;
        }
        C47718bf.m103288a(new C24530d(Q, this.f103081w));
        if (C20854a.m53167g().isLogin()) {
            if (!TextUtils.isEmpty(this.f102209ao)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("enter_from", this.f102194aQ);
                    jSONObject.put("request_id", this.f102195aR);
                    if (!TextUtils.isEmpty(this.f102223bc)) {
                        jSONObject.put("poi_id", this.f102223bc);
                    }
                } catch (JSONException unused) {
                }
                if (C9431p.m18664a(this.f102202aY) || a) {
                    if (!a && this.f102197aT.mo53244a()) {
                        C25945k.m62911b().mo53133b(getContext(), this.f102211aq, (FollowStatus) null);
                    }
                    MobClick obtain = MobClick.obtain();
                    if (a) {
                        str3 = "follow_cancel";
                    } else {
                        str3 = "follow";
                    }
                    C26890h.onEvent(obtain.setEventName(str3).setLabelName("others_homepage").setValue(this.f102207am).setExtValueString(this.f102212ar).setJsonObject(jSONObject));
                    if (a) {
                        C26890h.m65011a("follow_cancel", C23089d.m56640a().mo47829a("to_user_id", this.f102207am).mo47829a("enter_from", "others_homepage").mo47829a("previous_page", this.f102218ax).mo47829a("scene_id", "1007").f61491a);
                    }
                    if (TextUtils.equals(this.f102218ax, "search_result") || TextUtils.equals(this.f102218ax, "search_for_you_list")) {
                        C28423z y = C23794bh.m58411y();
                        if (a) {
                            str4 = "search_follow_cancel";
                        } else {
                            str4 = "search_follow";
                        }
                        y.mo56824a(str4, this.f102207am, "others_homepage", true, "");
                    }
                } else {
                    C46641d.m101217a("others_homepage", CustomActionPushReceiver.f104061f, this.f102203aZ, this.f102202aY, Boolean.valueOf(C20854a.m53167g().getCurUserId().equals(this.f102203aZ)), this.f102207am, this.f102201aX);
                    C26890h.onEvent(MobClick.obtain().setEventName("follow").setLabelName("others_homepage").setValue(this.f102203aZ).setExtValueString(this.f102202aY).setJsonObject(new C26898j().mo54849a("enter_from", "live_aud").mo54849a("request_id", this.f102201aX).mo54849a("user_id", this.f102207am).mo54849a("user_type", this.f102221ba).mo54850a()));
                }
                if (!a && C9431p.m18664a(this.f102202aY)) {
                    String str5 = "single";
                    if (this.f103081w != null && this.f103081w.getFollowerStatus() == 1) {
                        str5 = "mutual";
                    }
                    C23253w d = new C23253w().mo48161b("others_homepage").mo48165e(this.f102231bk).mo48164d(this.f102218ax);
                    if (this.f103081w != null) {
                        str = this.f103081w.getRequestId();
                    } else {
                        str = "";
                    }
                    C23253w f = d.mo48169s(str).mo48163c(this.f102216av).mo48166f(this.f102207am);
                    if (this.f102211aq == null) {
                        str2 = "";
                    } else {
                        str2 = this.f102211aq.getAid();
                    }
                    f.mo48168h(str2).mo48169s(m89124P()).mo48167g(str5).mo48076e();
                }
            }
            mo82164g(Q);
            if (this.f102205ak != null) {
                int i2 = -1;
                if (this.f103081w != null) {
                    i2 = this.f103081w.getFollowerStatus();
                }
                this.f102205ak.mo66349a(new C39970a().mo81871a(this.f102207am).mo81874b(this.f102185aH).mo81869a(i).mo81876c("others_homepage").mo81877d(i2).mo81872a());
            }
        } else {
            C26890h.m65005a((Context) getActivity(), "follow", "personal_homepage", this.f102207am, 0);
            C27965f.m66725a((Fragment) this, this.f102194aQ, "click_follow", C47661ab.m103163a().mo94972a("group_id", this.f102212ar).mo94972a("log_pb", C23198ae.m56874k(this.f102212ar)).f120139a, (C23505g) new C40263bn(this, Q, i));
        }
    }

    /* renamed from: e */
    public final void mo82204e(String str) {
        this.f102231bk = str;
    }

    /* renamed from: d */
    public final void mo82202d(String str) {
        this.f102218ax = str;
    }

    @C53771m
    public void onMobRequestIdEvent(C30311ac acVar) {
        this.f102195aR = acVar.f79199a;
    }

    public void onPageSelected(int i) {
        super.onPageSelected(i);
        m89120L();
    }

    /* renamed from: k */
    private static IMUser m89142k(User user) {
        if (user == null) {
            return null;
        }
        return IMUser.fromUser(user);
    }

    /* renamed from: o */
    private void m89144o(int i) {
        if (m89129U()) {
            mo82209m(i);
        }
    }

    /* renamed from: d */
    public void mo81903d(User user) {
        super.mo81903d(user);
        this.f102715P.mo82123a(this.f103081w, (Aweme) null);
    }

    @OnClick({2131493636})
    public void onFriendButtonClick(View view) {
        if (this.f103081w != null) {
            m89135e(view);
        }
    }

    /* renamed from: g */
    private void m89138g(String str) {
        if (this.f103081w != null) {
            C36173w.m81665a().getLiveStateManager().mo74801a(I18nBaseUserProfileFragment.class, this.f103081w, (C1710e<Map<Long, Long>>) new C40253bd<Map<Long, Long>>(this, str));
        }
    }

    /* renamed from: h */
    private void m89140h(boolean z) {
        if (this.f102189aL != null) {
            this.f102189aL.mo77334b(z);
        }
        if (this.f102210ap != null) {
            this.f102210ap.mo77334b(z);
        }
    }

    /* renamed from: a */
    public final void mo81889a(UrlModel urlModel) {
        super.mo81889a(urlModel);
    }

    /* renamed from: b */
    public final void mo81895b(Exception exc) {
        super.mo81895b(exc);
        this.f102192aO = true;
    }

    /* renamed from: d */
    public final void mo82203d(boolean z) {
        m89132a(z, false);
    }

    /* renamed from: f */
    public final void mo82206f(String str) {
        if (this.f102189aL != null) {
            this.f102189aL.mo82536d(str);
        }
        if (this.f102210ap != null) {
            this.f102210ap.mo82536d(str);
        }
    }

    /* renamed from: j */
    public final int mo82208j(User user) {
        if (user == null || this.f102206al == null) {
            return 0;
        }
        return this.f102206al.mo81913a(user.getUid());
    }

    @OnClick({2131493056})
    public void onBack(View view) {
        if (!TextUtils.equals(this.f102209ao, "feed_detail")) {
            getActivity().finish();
        } else if (this.f102236bp != null) {
            this.f102236bp.mo63519a();
        }
    }

    @C53771m
    public void onEvent(C35471h hVar) {
        if (TextUtils.equals("user", hVar.itemType)) {
            C47881fd.m103578a(getActivity(), this.f102184aG, hVar);
        }
    }

    public void onSaveInstanceState(Bundle bundle) {
        if (bundle != null) {
            bundle.putString("uid", this.f102207am);
            bundle.putString("sec_user_id", this.f102185aH);
        }
        super.onSaveInstanceState(bundle);
    }

    @C53771m
    public void onUpdateUserEvent(C23484c cVar) {
        if (TextUtils.equals(cVar.f62556a.getUid(), this.f102207am) && this.f102204aj != null) {
            this.f102204aj.mo81911a(cVar.f62556a);
        }
    }

    /* access modifiers changed from: private */
    /* renamed from: f */
    public void mo82205e(boolean z) {
        int i;
        if (this.f102710J.getTabCount() >= 2 && (this.f102710J.mo82079a(this.f103068j.indexOf(Integer.valueOf(1))) instanceof MusProfileTabImageView)) {
            MusProfileTabImageView musProfileTabImageView = (MusProfileTabImageView) this.f102710J.mo82079a(this.f103068j.indexOf(Integer.valueOf(1)));
            if (z) {
                i = R.drawable.dp4;
            } else {
                i = R.drawable.dp5;
            }
            musProfileTabImageView.setImageResource(i);
        }
    }

    /* renamed from: g */
    private void m89139g(boolean z) {
        if (this.f102189aL != null) {
            this.f102189aL.mo76536c_(z);
        }
        if (this.f102210ap != null) {
            this.f102210ap.mo76536c_(z);
        }
        if (this.f102190aM != null) {
            this.f102190aM.mo76536c_(z);
        }
    }

    /* renamed from: p */
    private void m89145p(int i) {
        if (isViewValid()) {
            int i2 = ((RelativeLayout.LayoutParams) this.f102198aU.getLayoutParams()).bottomMargin;
            if (i2 >= 0) {
                C47795d.m103427a(this.f102198aU, i2, (this.f102198aU.getMeasuredHeight() + 1) * -1, i).start();
            }
        }
    }

    /* renamed from: b */
    public final void mo81897b(boolean z) {
        int i;
        ImageView imageView = this.f102191aN;
        if (z) {
            i = 0;
        } else {
            i = 8;
        }
        imageView.setVisibility(i);
    }

    @C53771m
    public void onAntiCrawlerEvent(C23481a aVar) {
        String str = aVar.f62554a;
        if (str == null) {
            return;
        }
        if (str.contains("/aweme/v1/user/profile/other/?") || str.contains("/aweme/v1/aweme/post/?") || str.contains("/aweme/v1/aweme/favorite/?")) {
            C47718bf.m103293f(aVar);
            m89128T();
        }
    }

    public /* synthetic */ void onChanged(Object obj) {
        Boolean bool = (Boolean) obj;
        if (C10181b.m20511a().mo18172a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", 31744, false)) {
            if (this.f102210ap != null) {
                this.f102210ap.mo82508f(bool.booleanValue());
            }
            if (this.f102189aL != null) {
                this.f102189aL.mo82508f(bool.booleanValue());
            }
            mo82203d(bool.booleanValue());
        }
    }

    public void onCreate(Bundle bundle) {
        if (bundle != null) {
            this.f102207am = bundle.getString("uid");
            this.f102185aH = bundle.getString("sec_user_id");
        }
        super.onCreate(bundle);
        this.f102196aS = (MainAnimViewModel) C0214z.m440a(getActivity()).mo359a(MainAnimViewModel.class);
        this.f102196aS.f93423c.observe(this, this);
    }

    public void onFollowFail(final Exception exc) {
        if (isViewValid()) {
            if (C40026s.f101964a.shouldDoCaptcha(exc)) {
                C40026s.f101964a.showCaptchaDialog(getChildFragmentManager(), (C23459a) exc, new C24493b() {
                    /* renamed from: a */
                    public final void mo45353a() {
                        I18nBaseUserProfileFragment.this.f102205ak.mo66351c();
                    }

                    /* renamed from: b */
                    public final void mo45354b() {
                        C22971a.m56494a(I18nBaseUserProfileFragment.this.getActivity(), exc, R.string.b47);
                    }
                });
            } else {
                C22971a.m56494a(getActivity(), exc, R.string.b47);
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onJsBroadCastEvent(C29906l lVar) {
        if (this.f102193aP) {
            try {
                if (TextUtils.equals("userBlockSuccess", lVar.f78045b.getString("eventName"))) {
                    BlockStruct blockStruct = new BlockStruct();
                    blockStruct.blockStatus = 1;
                    Message message = new Message();
                    message.what = 30;
                    message.obj = blockStruct;
                    this.f102217aw.sendMessage(message);
                }
            } catch (JSONException unused) {
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onLiveStatusEvent(RoomStatusEvent roomStatusEvent) {
        long j;
        if (this.f103081w != null) {
            try {
                j = Long.parseLong(this.f103081w.getUid());
            } catch (Throwable unused) {
                j = 0;
            }
            if (j == roomStatusEvent.f8661b && roomStatusEvent.f8662c) {
                this.f103081w.roomId = 0;
                mo81900c(this.f103081w);
            }
        }
    }

    @OnClick({2131494465})
    public void recommendUsersClick(View view) {
        if (m89129U() && !TextUtils.isEmpty(this.f102185aH) && System.currentTimeMillis() - this.f102234bn >= 500) {
            this.f102234bn = System.currentTimeMillis();
            if (m89129U()) {
                if (!this.f102225be) {
                    this.f102233bm = false;
                }
                mo82201c(!this.f102225be);
            }
        }
    }

    /* renamed from: a */
    private static void m89130a(Activity activity) {
        C23051bf privacyAccountFollowCount = SharePrefCache.inst().getPrivacyAccountFollowCount();
        int intValue = ((Integer) privacyAccountFollowCount.mo47782d()).intValue();
        if (intValue == 0) {
            new C10643a(activity).mo18899b((int) R.string.cxb).mo18886a((int) R.string.bdf, (OnClickListener) null).mo18897a().mo18882b();
        } else if (intValue > 0 && intValue < 4) {
            C10691a.m21548c((Context) activity, (int) R.string.cxc).mo19066a();
        }
        privacyAccountFollowCount.mo47776a(Integer.valueOf(intValue + 1));
    }

    /* renamed from: i */
    private void m89141i(boolean z) {
        if (!isViewValid() || this.f102199aV) {
            return;
        }
        if ((this.f102197aT.mo53246b() || this.f102197aT.mo53250f()) && this.f102197aT.mo53248d()) {
            int i = ((RelativeLayout.LayoutParams) this.f102198aU.getLayoutParams()).bottomMargin;
            if (i < 0) {
                C47795d.m103427a(this.f102198aU, i, 0, 300).start();
            }
            if (z) {
                C25945k.m62911b().mo53159w(getContext(), this.f102211aq);
            }
        }
    }

    /* renamed from: n */
    private void m89143n(int i) {
        if (this.f103081w != null && !TextUtils.equals(this.f102207am, C20854a.m53167g().getCurUserId())) {
            if (i == 1 || i == 2) {
                IMainServiceHelper provideIMainServiceHelper_Monster = MainServiceHelperImpl.provideIMainServiceHelper_Monster();
                if ((provideIMainServiceHelper_Monster == null || !provideIMainServiceHelper_Monster.isChatFunOfflineUnder16()) && (!C10181b.m20511a().mo18172a(HideProfileMessageButton.class, true, "hide_profile_message_button", 31744, false) || this.f103081w.isShowMessageButton())) {
                    C26890h.m65011a("show_message_button", new C23089d().mo47829a("enter_from", "others_homepage").mo47829a("user_id", this.f103081w.getUid()).f61491a);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo82160b(View view) {
        super.mo82160b(view);
        this.f102191aN = (ImageView) view.findViewById(R.id.c5f);
        if (C10181b.m20511a().mo18168a(NewUserDetailShareIconExperiemnt.class, true, "enable_new_user_detail_share_icon", 31744, 0) == 1) {
            this.f102191aN.setImageResource(R.drawable.dpd);
        }
        this.f102706F.setBorderColor(R.color.v0);
        if (TextUtils.equals(this.f102207am, C20854a.m53167g().getCurUserId())) {
            this.f102712L.setVisibility(0);
        }
    }

    @C53771m
    public void onFollowStatusUpdate(FollowStatus followStatus) {
        if (TextUtils.equals(followStatus.userId, this.f102207am)) {
            mo82164g(followStatus.followStatus);
            if (this.f103081w != null && followStatus.followStatus != this.f103081w.getFollowStatus()) {
                if (followStatus.followStatus == 0) {
                    if (this.f103081w != null && !C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w))) {
                        int followerCount = this.f103081w.getFollowerCount() - 1;
                        this.f103081w.setFollowerCount(followerCount);
                        mo81885a(followerCount);
                        this.f103081w.setFollowStatus(followStatus.followStatus);
                    }
                } else if (followStatus.followStatus == 1 && this.f103081w != null && !C47915gg.m103652b(this.f103081w, C47915gg.m103664m(this.f103081w))) {
                    int followerCount2 = this.f103081w.getFollowerCount() + 1;
                    this.f103081w.setFollowerCount(followerCount2);
                    mo81885a(followerCount2);
                    this.f103081w.setFollowStatus(followStatus.followStatus);
                }
            }
        }
    }

    /* renamed from: e */
    private void m89135e(View view) {
        if (isViewValid() && isAdded() && this.f103081w != null && !C32800a.m75680a(view, 300)) {
            if (C47915gg.m103651b()) {
                C10691a.m21548c(C11010c.m22280a(), (int) R.string.a2a).mo19066a();
            } else if (!C40264bo.m89526a(getActivity())) {
                C9432q.m18672a((Context) getActivity(), (int) R.string.cg1);
            } else {
                if (!TextUtils.isEmpty(this.f102229bi)) {
                    mo50432a(this.f102229bi);
                }
                if (this.f102208an == 4) {
                    C26891a aVar = new C26891a(getActivity());
                    aVar.mo54844a((CharSequence[]) new String[]{getActivity().getResources().getString(R.string.ws), getActivity().getResources().getString(R.string.wf)}, (OnClickListener) new C40262bm(this));
                    aVar.mo54845b();
                    return;
                }
                m89123O();
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo82201c(boolean z) {
        if (this.f102225be != z) {
            if (z) {
                if (this.f102182aE == null) {
                    this.f102182aE = new ArrayList();
                } else {
                    this.f102182aE.clear();
                }
                m89144o(1);
                if (this.f102206al == null) {
                    this.f102206al = new C39993z(new RecommendCommonUserModel(), this);
                } else {
                    this.f102206al.mo81914a();
                    RecommendList d = this.f102206al.mo81924d();
                    if (d != null && !C9376b.m18558a((Collection<T>) d.getUserList())) {
                        if (!this.f102233bm || d.getUserList().size() >= 3) {
                            String str = "";
                            if (this.f103081w != null) {
                                str = this.f103081w.getRecType();
                            }
                            C40573x.m90012a(this.f102207am, str);
                            this.mRecommendCommonUserView.setPageType(0);
                            this.mRecommendCommonUserView.mo82363a(d.getUserList(), d.getRid());
                            m89131a(true, this.mRecommendCommonUserView, this.viewUserInfo, this.f102213as);
                            this.f102225be = true;
                            m89144o(2);
                            return;
                        }
                        m89144o(0);
                        return;
                    }
                }
                this.f102206al.mo81919a(30, this.f102185aH, 1, C47945d.m103731a(), (String) null, C47945d.m103733b());
                return;
            }
            if (this.f102206al != null) {
                this.f102206al.mo81922a(this.mRecommendCommonUserView.getData());
            }
            m89131a(false, this.mRecommendCommonUserView, this.viewUserInfo, this.f102213as);
            this.f102225be = false;
            m89144o(0);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public void mo82209m(int i) {
        if (this.recommededUsersIv != null) {
            switch (i) {
                case 0:
                    this.recommededUsersIv.setContentDescription(getResources().getString(R.string.cyq));
                    this.recommededUsersIv.clearAnimation();
                    this.recommededUsersIv.setImageResource(R.drawable.dr2);
                    this.recommededUsersIv.setRotation(-180.0f);
                    this.recommededUsersIv.animate().rotation(0.0f).start();
                    return;
                case 1:
                    this.recommededUsersIv.clearAnimation();
                    this.recommededUsersIv.setImageResource(R.drawable.dnw);
                    RotateAnimation rotateAnimation = new RotateAnimation(0.0f, 360.0f, 1, 0.5f, 1, 0.5f);
                    rotateAnimation.setRepeatCount(-1);
                    rotateAnimation.setRepeatMode(1);
                    rotateAnimation.setDuration(600);
                    this.recommededUsersIv.startAnimation(rotateAnimation);
                    return;
                case 2:
                    this.recommededUsersIv.setContentDescription(getResources().getString(R.string.cyq));
                    this.recommededUsersIv.clearAnimation();
                    this.recommededUsersIv.setImageResource(R.drawable.dr1);
                    this.recommededUsersIv.setRotation(-180.0f);
                    this.recommededUsersIv.animate().rotation(0.0f).start();
                    break;
            }
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        if (this.f103081w != null && (followStatus.followStatus == 1 || followStatus.followStatus == 2)) {
            this.f103081w.setBlock(false);
        }
        User user = this.f103081w;
        if (user == null) {
            user = new User();
            user.setUid(this.f102207am);
            user.setSecUid(this.f102185aH);
            user.setFollowStatus(followStatus.followStatus);
        }
        C33200k.m76279d().updateIMUser(m89142k(user));
        mo82164g(followStatus.followStatus);
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("code", 1);
            jSONObject.put("follow_status", followStatus.followStatus);
        } catch (JSONException unused) {
        }
        if ((followStatus.followStatus == 1 || followStatus.followStatus == 4) && user.isBlock()) {
            user.setBlock(false);
            m89128T();
        }
        int i = followStatus.followStatus;
        if (!C47915gg.m103652b(this.f103081w, false) && m89129U() && !TextUtils.isEmpty(this.f102185aH)) {
            if (m89129U() && i != 0) {
                this.f102233bm = true;
                mo82201c(true);
            } else if (m89129U() && i == 0) {
                mo82201c(false);
            }
        }
        C47718bf.m103288a(new C48278h("userFollowStatusChange", jSONObject));
    }

    @OnClick({2131494628, 2131493635, 2131494490, 2131493636})
    public void onImClick(View view) {
        if (this.f103081w != null) {
            if (view.equals(this.sendMsgBtn)) {
                IMainServiceHelper provideIMainServiceHelper_Monster = MainServiceHelperImpl.provideIMainServiceHelper_Monster();
                if (provideIMainServiceHelper_Monster == null || !provideIMainServiceHelper_Monster.shouldRedictToTipsPage() || provideIMainServiceHelper_Monster.isChatFunOfflineUnder16()) {
                    IIMService a = C33200k.m76277a(false);
                    if (!C40026s.f101964a.canIM() || a == null) {
                        follow(this.followIv);
                        return;
                    }
                    if (C26503d.m64061d(this.f102211aq)) {
                        C33200k.m76279d().startChatWithAdLog(getContext(), m89142k(this.f103081w), new C35464a(this.f102211aq.getAwemeRawAd().getLogExtra(), String.valueOf(this.f102211aq.getAwemeRawAd().getCreativeId())));
                    } else {
                        a.startChat(getContext(), m89142k(this.f103081w));
                    }
                    C33205o.m76295a(this.f103081w.getUid());
                    C33205o.m76298a(this.f102207am, this.f102212ar, this.f102194aQ, this.f102195aR, "click_message");
                } else {
                    provideIMainServiceHelper_Monster.goToTipsPage();
                }
            } else if (view.equals(this.followIv) || view.equals(this.requestedBtn) || view.equals(this.followIv16)) {
                follow(view);
            }
        }
    }

    @OnClick({2131494408})
    public void onReport(View view) {
        if (this.f103081w != null && !C32800a.m75679a(view)) {
            C26890h.m65011a("click_more_action", C23089d.m56640a().mo47829a("others_homepage", "others_homepage").f61491a);
            if (C10181b.m20511a().mo18168a(ProfileNavbarShareExperiment.class, true, "enable_profile_navbar_share", 31744, 0) != 1 || FunctionSupportService.INSTANCE.notSupport(IFunctionKey.SHARE_PROFILE)) {
                C23201ah ahVar = new C23201ah();
                ahVar.f61704b = "more_action_list";
                ahVar.f61703a = "personal_detail";
                ahVar.mo48076e();
                C26891a aVar = new C26891a(getActivity());
                final String[] R = m89126R();
                aVar.mo54844a((CharSequence[]) R, (OnClickListener) new OnClickListener() {
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        if (TextUtils.equals(R[i], I18nBaseUserProfileFragment.this.f102220az)) {
                            I18nBaseUserProfileFragment.this.mo82185F();
                        } else if (TextUtils.equals(R[i], I18nBaseUserProfileFragment.this.f102178aA)) {
                            I18nBaseUserProfileFragment.this.mo82187I();
                        } else if (TextUtils.equals(R[i], I18nBaseUserProfileFragment.this.f102179aB)) {
                            I18nBaseUserProfileFragment.this.f102217aw.sendEmptyMessage(56);
                        } else if (TextUtils.equals(R[i], I18nBaseUserProfileFragment.this.f102180aC)) {
                            I18nBaseUserProfileFragment.this.mo82186G();
                        } else if (TextUtils.equals(R[i], I18nBaseUserProfileFragment.this.f102181aD)) {
                            C40572w.m90011a(I18nBaseUserProfileFragment.this.getActivity(), I18nBaseUserProfileFragment.this.f103081w, I18nBaseUserProfileFragment.this.f102210ap.mo82498E());
                        }
                        dialogInterface.dismiss();
                    }
                });
                aVar.f70743a.mo3761a(C40240az.f102772a);
                try {
                    aVar.mo54845b();
                } catch (NotFoundException unused) {
                }
            } else if (this.f103081w != null) {
                this.f102235bo.clear();
                m89126R();
                this.f102235bo.toArray(new String[this.f102235bo.size()]);
                C9381g gVar = this.f102217aw;
                FragmentActivity activity = getActivity();
                User user = this.f103081w;
                ArrayList E = this.f102210ap.mo82498E();
                if (!(user == null || user.getShareInfo() == null)) {
                    C41979aq.m91946a().shareProfile(gVar, activity, user, E, false);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00fb, code lost:
        if (r0 == 0) goto L_0x0091;
     */
    /* JADX WARNING: Removed duplicated region for block: B:14:0x0055 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0056  */
    /* JADX WARNING: Removed duplicated region for block: B:42:0x0150 A[RETURN] */
    /* JADX WARNING: Removed duplicated region for block: B:43:0x0151  */
    @butterknife.OnClick({2131494407})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void follow(android.view.View r11) {
        /*
            r10 = this;
            android.widget.TextView r0 = r10.followBn
            if (r11 != r0) goto L_0x0008
            java.lang.String r0 = "follow_button"
            r10.f102216av = r0
        L_0x0008:
            com.ss.android.ugc.aweme.profile.model.User r0 = r10.f103081w
            r1 = 0
            r2 = 2132542529(0x7f1c0441, float:2.0738165E38)
            r3 = 2132544747(0x7f1c0ceb, float:2.0742664E38)
            r4 = 0
            r5 = 1
            if (r0 == 0) goto L_0x0052
            com.ss.android.ugc.aweme.profile.model.User r0 = r10.f103081w
            boolean r0 = r0.isBlock
            if (r0 == 0) goto L_0x0052
            int r0 = r10.f102208an
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103645a(r0)
            if (r0 != 0) goto L_0x0052
            android.content.Context r0 = r10.getContext()
            if (r0 == 0) goto L_0x0052
            com.bytedance.ies.dmt.ui.b.a$a r6 = new com.bytedance.ies.dmt.ui.b.a$a
            r6.<init>(r0)
            r0 = 2132551630(0x7f1c27ce, float:2.0756625E38)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r6.mo18885a(r0)
            r6 = 2132551629(0x7f1c27cd, float:2.0756622E38)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.mo18899b(r6)
            com.ss.android.ugc.aweme.profile.ui.bl r6 = new com.ss.android.ugc.aweme.profile.ui.bl
            r6.<init>(r10, r11)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.mo18886a(r3, r6)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.mo18900b(r2, r1)
            com.bytedance.ies.dmt.ui.b.a r0 = r0.mo18897a()
            r0.mo18882b()
            r0 = 1
            goto L_0x0053
        L_0x0052:
            r0 = 0
        L_0x0053:
            if (r0 == 0) goto L_0x0056
            return
        L_0x0056:
            com.ss.android.ugc.aweme.profile.model.User r0 = r10.f103081w
            r6 = 2
            if (r0 == 0) goto L_0x014d
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L_0x008d
            java.lang.String r0 = r10.f102194aQ
            java.lang.String r2 = "click_follow"
            com.ss.android.ugc.aweme.utils.ab r3 = com.p683ss.android.ugc.aweme.utils.C47661ab.m103163a()
            java.lang.String r7 = "group_id"
            java.lang.String r8 = r10.f102212ar
            com.ss.android.ugc.aweme.utils.ab r3 = r3.mo94972a(r7, r8)
            java.lang.String r7 = "log_pb"
            java.lang.String r8 = r10.f102212ar
            java.lang.String r8 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56874k(r8)
            com.ss.android.ugc.aweme.utils.ab r3 = r3.mo94972a(r7, r8)
            android.os.Bundle r3 = r3.f120139a
            com.ss.android.ugc.aweme.profile.ui.bh r7 = new com.ss.android.ugc.aweme.profile.ui.bh
            r7.<init>(r10, r11)
            com.p683ss.android.ugc.aweme.login.C27965f.m66725a(r10, r0, r2, r3, r7)
            goto L_0x014d
        L_0x008d:
            int r0 = r10.f102208an
            if (r0 == 0) goto L_0x0094
        L_0x0091:
            r0 = 1
            goto L_0x014e
        L_0x0094:
            com.ss.android.ugc.aweme.profile.model.User r0 = r10.f103081w
            com.ss.android.ugc.aweme.profile.model.GeneralPermission r0 = r0.getGeneralPermission()
            if (r0 == 0) goto L_0x00a7
            com.ss.android.ugc.aweme.profile.model.User r0 = r10.f103081w
            com.ss.android.ugc.aweme.profile.model.GeneralPermission r0 = r0.getGeneralPermission()
            int r0 = r0.getFollowToastType()
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            if (r0 != r5) goto L_0x00f2
            com.bytedance.ies.dmt.ui.b.a$a r0 = new com.bytedance.ies.dmt.ui.b.a$a
            android.content.Context r2 = r11.getContext()
            r0.<init>(r2)
            r2 = 2132541815(0x7f1c0177, float:2.0736717E38)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.mo18885a(r2)
            r2 = 2132541816(0x7f1c0178, float:2.073672E38)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.mo18899b(r2)
            r2 = 2132543815(0x7f1c0947, float:2.0740774E38)
            android.content.DialogInterface$OnClickListener r3 = com.p683ss.android.ugc.aweme.profile.p2090ui.C40258bi.f102800a
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.mo18886a(r2, r3)
            com.bytedance.ies.dmt.ui.b.a r0 = r0.mo18897a()
            r0.mo18883c()
            java.lang.String r0 = "show_punish_pop"
            com.ss.android.ugc.aweme.app.f.d r2 = new com.ss.android.ugc.aweme.app.f.d
            r2.<init>()
            java.lang.String r3 = "enter_from"
            java.lang.String r7 = "others_homepage"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r7)
            java.lang.String r3 = "show_type"
            com.ss.android.ugc.aweme.profile.model.User r7 = r10.f103081w
            java.lang.String r7 = com.p683ss.android.ugc.aweme.profile.util.C40519aa.m89927a(r7)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r7)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r2)
            goto L_0x014d
        L_0x00f2:
            r7 = 4
            if (r0 == r6) goto L_0x00fe
            r8 = 3
            if (r0 == r8) goto L_0x00fe
            if (r0 != r7) goto L_0x00fb
            goto L_0x00fe
        L_0x00fb:
            if (r0 != 0) goto L_0x014d
            goto L_0x0091
        L_0x00fe:
            com.bytedance.ies.dmt.ui.b.a$a r8 = new com.bytedance.ies.dmt.ui.b.a$a
            android.content.Context r9 = r11.getContext()
            r8.<init>(r9)
            if (r0 != r7) goto L_0x010d
            r0 = 2132541834(0x7f1c018a, float:2.0736756E38)
            goto L_0x0110
        L_0x010d:
            r0 = 2132541831(0x7f1c0187, float:2.073675E38)
        L_0x0110:
            com.bytedance.ies.dmt.ui.b.a$a r0 = r8.mo18899b(r0)
            com.ss.android.ugc.aweme.profile.ui.I18nBaseUserProfileFragment$2 r7 = new com.ss.android.ugc.aweme.profile.ui.I18nBaseUserProfileFragment$2
            r7.<init>()
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.mo18900b(r2, r7)
            com.ss.android.ugc.aweme.profile.ui.bj r2 = new com.ss.android.ugc.aweme.profile.ui.bj
            r2.<init>(r10, r11)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.mo18886a(r3, r2)
            com.bytedance.ies.dmt.ui.b.a r0 = r0.mo18897a()
            r0.mo18883c()
            java.lang.String r0 = "show_punish_pop"
            com.ss.android.ugc.aweme.app.f.d r2 = new com.ss.android.ugc.aweme.app.f.d
            r2.<init>()
            java.lang.String r3 = "enter_from"
            java.lang.String r7 = "others_homepage"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r7)
            java.lang.String r3 = "show_type"
            com.ss.android.ugc.aweme.profile.model.User r7 = r10.f103081w
            java.lang.String r7 = com.p683ss.android.ugc.aweme.profile.util.C40519aa.m89927a(r7)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r3, r7)
            java.util.Map<java.lang.String, java.lang.String> r2 = r2.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r2)
        L_0x014d:
            r0 = 0
        L_0x014e:
            if (r0 != 0) goto L_0x0151
            return
        L_0x0151:
            int r0 = r10.f102208an
            if (r0 != r6) goto L_0x01b4
            android.content.Context r0 = r10.getContext()
            if (r0 == 0) goto L_0x01b4
            com.bytedance.ies.dmt.ui.b.a$a r2 = new com.bytedance.ies.dmt.ui.b.a$a
            r2.<init>(r0)
            r0 = 2132551612(0x7f1c27bc, float:2.0756588E38)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r2.mo18885a(r0)
            r2 = 2132542245(0x7f1c0325, float:2.073759E38)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.mo18900b(r2, r1)
            r1 = 2132551723(0x7f1c282b, float:2.0756813E38)
            com.ss.android.ugc.aweme.profile.ui.bk r2 = new com.ss.android.ugc.aweme.profile.ui.bk
            r2.<init>(r10, r11)
            com.bytedance.ies.dmt.ui.b.a$a r0 = r0.mo18886a(r1, r2)
            com.bytedance.ies.dmt.ui.b.a r0 = r0.mo18897a()
            android.app.Dialog r0 = r0.mo18883c()
            r1 = 2132024053(0x7f141af5, float:1.9686571E38)
            android.view.View r2 = r0.findViewById(r1)
            boolean r2 = r2 instanceof android.widget.TextView
            if (r2 == 0) goto L_0x01a1
            android.view.View r1 = r0.findViewById(r1)
            android.widget.TextView r1 = (android.widget.TextView) r1
            android.content.res.Resources r2 = r10.getResources()
            r3 = 2131821031(0x7f1101e7, float:1.9274794E38)
            int r2 = r2.getColor(r3)
            r1.setTextColor(r2)
        L_0x01a1:
            r1 = 2132023727(0x7f1419af, float:1.968591E38)
            android.view.View r2 = r0.findViewById(r1)
            if (r2 == 0) goto L_0x01b3
            android.view.View r0 = r0.findViewById(r1)
            r1 = 8
            r0.setVisibility(r1)
        L_0x01b3:
            r4 = 1
        L_0x01b4:
            if (r4 == 0) goto L_0x01b7
            return
        L_0x01b7:
            r10.m89135e(r11)
            int r11 = r10.f102208an
            r10.m89143n(r11)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.I18nBaseUserProfileFragment.follow(android.view.View):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo82165h(int i) {
        String str;
        OriginMusicListFragment originMusicListFragment;
        boolean z = false;
        if (i == 3) {
            if (this.f102190aM == null) {
                C0654k childFragmentManager = getChildFragmentManager();
                StringBuilder sb = new StringBuilder();
                sb.append(f103057a);
                sb.append(0);
                Fragment a = childFragmentManager.mo2224a(sb.toString());
                if (a instanceof OriginMusicListFragment) {
                    originMusicListFragment = (OriginMusicListFragment) a;
                } else {
                    originMusicListFragment = OriginMusicListFragment.m83454a(this.f102207am, this.f102185aH, false);
                }
                this.f102190aM = originMusicListFragment;
                this.f102190aM.mo82581e(C47896fq.m103601a(3));
            }
            this.f102190aM.f94998a = this;
            OriginMusicListFragment originMusicListFragment2 = this.f102190aM;
            if (TextUtils.isEmpty(this.f103081w.getUniqueId())) {
                str = this.f103081w.getShortId();
            } else {
                str = this.f103081w.getUniqueId();
            }
            originMusicListFragment2.f95004k = str;
            this.f102190aM.mo53807a(this.f102207am, this.f102185aH);
            mo82620a((C40321dd) this.f102190aM, Integer.valueOf(3));
            return;
        }
        boolean z2 = true;
        if (i == 0) {
            if (this.f102210ap == null) {
                this.f102210ap = m89134d(0, 1);
                this.f102210ap.mo82500a(this.f102731af);
                C40273bu buVar = this.f102210ap;
                if (this.f103078t != mo82463x()) {
                    z2 = false;
                }
                buVar.mo82505d(z2);
                this.f102210ap.mo82581e(C47896fq.m103601a(0));
                this.f102210ap.mo82501a(this.f102218ax);
            }
            this.f102210ap.mo53807a(this.f102207am, this.f102185aH);
            mo82620a((C40321dd) this.f102210ap, Integer.valueOf(0));
            return;
        }
        int i2 = 2;
        if (i == 2) {
            if (this.f102189aL == null) {
                this.f102189aL = m89134d(1, 2);
                this.f102189aL.mo82500a(this.f102731af);
                C40273bu buVar2 = this.f102189aL;
                int i3 = this.f103078t;
                if (!mo82463x()) {
                    i2 = 1;
                }
                if (i3 == i2) {
                    z = true;
                }
                buVar2.mo82505d(z);
                this.f102189aL.mo82581e(C47896fq.m103601a(1));
                this.f102189aL.mo82501a(this.f102218ax);
            }
            this.f102189aL.mo53807a(this.f102207am, this.f102185aH);
            this.f102189aL.f102827F = new C40256bg(this);
            mo82620a((C40321dd) this.f102189aL, Integer.valueOf(1));
        }
    }

    public void handleMsg(Message message) {
        boolean z;
        int i;
        if (isViewValid()) {
            int i2 = message.what;
            Object obj = message.obj;
            if (i2 == 30) {
                if (obj instanceof ExecutionException) {
                    obj = ((ExecutionException) obj).getCause();
                }
                if (obj instanceof C23459a) {
                    C23459a aVar = (C23459a) obj;
                    int errorCode = aVar.getErrorCode();
                    if (!(errorCode == 3070 || errorCode == 3071 || errorCode == 3072)) {
                        C9432q.m18676a(C11010c.m22280a(), aVar.getErrorMsg());
                    }
                } else if (obj instanceof Exception) {
                    C9432q.m18672a(C11010c.m22280a(), (int) R.string.cfw);
                } else if (obj instanceof BlockStruct) {
                    int i3 = ((BlockStruct) obj).blockStatus;
                    User user = this.f103081w;
                    if (i3 == 1) {
                        z = true;
                    } else {
                        z = false;
                    }
                    user.setBlock(z);
                    Context a = C11010c.m22280a();
                    Resources resources = getResources();
                    if (i3 == 1) {
                        i = R.string.hn;
                    } else {
                        i = R.string.f69;
                    }
                    C9432q.m18676a(a, resources.getString(i));
                    if (i3 == 1) {
                        this.f103081w.setFollowStatus(0);
                        mo82225u();
                        m89140h(true);
                        if (this.f102210ap != null) {
                            this.f102210ap.aJ_();
                        }
                        if (this.f102189aL != null) {
                            this.f102189aL.aJ_();
                        }
                        if (this.f102190aM != null) {
                            this.f102190aM.aJ_();
                        }
                        C39797a aVar2 = new C39797a();
                        aVar2.f101571a = this.f103081w;
                        C47718bf.m103288a(aVar2);
                    } else {
                        m89128T();
                    }
                    C33200k.m76279d().updateIMUser(m89142k(this.f103081w));
                }
            } else if (i2 == 50) {
                mo82185F();
            } else if (i2 == 53) {
                mo82186G();
            } else if (i2 == 54 || i2 == 55) {
                mo82187I();
            } else if (i2 == 56) {
                C26890h.m65011a("click_remove_fans", C23089d.m56640a().mo47829a("enter_from", "others_homepage").f61491a);
                Dialog c = new C10643a(getContext()).mo18885a((int) R.string.d6q).mo18902b(C2240a.m6772a(getResources().getString(R.string.d6p), new Object[]{C47915gg.m103656e(this.f103081w)})).mo18900b((int) R.string.wf, (OnClickListener) null).mo18886a((int) R.string.d6o, (OnClickListener) new C40251bb(this)).mo18897a().mo18883c();
                if (c.findViewById(R.id.dez) instanceof TextView) {
                    ((TextView) c.findViewById(R.id.dez)).setTextColor(getResources().getColor(R.color.j7));
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:29:0x0072, code lost:
        if (r9.equals("web") != false) goto L_0x0080;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x017b, code lost:
        com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b().mo53160x(getContext(), r8.f102211aq);
        com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b().mo53161y(getContext(), r8.f102211aq);
        com.p683ss.android.ugc.aweme.commercialize.C25945k.m62914e().mo53191a(getActivity(), r8.f102211aq, null, 8, null);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x01a6, code lost:
        return;
     */
    @butterknife.OnClick({2131492920, 2131492922})
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onAdBottomClick(android.view.View r9) {
        /*
            r8 = this;
            int r9 = r9.getId()
            r0 = 1
            r1 = 2132017238(0x7f140056, float:1.9672749E38)
            if (r9 != r1) goto L_0x0012
            r8.f102199aV = r0
            r9 = 300(0x12c, float:4.2E-43)
            r8.m89145p(r9)
            return
        L_0x0012:
            r1 = 2132017240(0x7f140058, float:1.9672753E38)
            if (r9 != r1) goto L_0x01a7
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r8.f102211aq
            if (r9 == 0) goto L_0x01a7
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r8.f102211aq
            boolean r9 = r9.isAd()
            if (r9 == 0) goto L_0x01a7
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r8.f102211aq
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r9 = r9.getAwemeRawAd()
            if (r9 == 0) goto L_0x01a7
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = r8.f102211aq
            com.ss.android.ugc.aweme.feed.model.AwemeRawAd r9 = r9.getAwemeRawAd()
            java.lang.String r9 = r9.getType()
            boolean r1 = android.text.TextUtils.isEmpty(r9)
            if (r1 != 0) goto L_0x01a7
            r1 = -1
            int r2 = r9.hashCode()
            switch(r2) {
                case 96801: goto L_0x0075;
                case 117588: goto L_0x006c;
                case 3083120: goto L_0x0062;
                case 3148996: goto L_0x0058;
                case 957829685: goto L_0x004e;
                case 1893962841: goto L_0x0044;
                default: goto L_0x0043;
            }
        L_0x0043:
            goto L_0x007f
        L_0x0044:
            java.lang.String r0 = "redpacket"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x007f
            r0 = 5
            goto L_0x0080
        L_0x004e:
            java.lang.String r0 = "counsel"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x007f
            r0 = 0
            goto L_0x0080
        L_0x0058:
            java.lang.String r0 = "form"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x007f
            r0 = 4
            goto L_0x0080
        L_0x0062:
            java.lang.String r0 = "dial"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x007f
            r0 = 3
            goto L_0x0080
        L_0x006c:
            java.lang.String r2 = "web"
            boolean r9 = r9.equals(r2)
            if (r9 == 0) goto L_0x007f
            goto L_0x0080
        L_0x0075:
            java.lang.String r0 = "app"
            boolean r9 = r9.equals(r0)
            if (r9 == 0) goto L_0x007f
            r0 = 2
            goto L_0x0080
        L_0x007f:
            r0 = -1
        L_0x0080:
            switch(r0) {
                case 0: goto L_0x0150;
                case 1: goto L_0x017b;
                case 2: goto L_0x0109;
                case 3: goto L_0x00e1;
                case 4: goto L_0x00b3;
                case 5: goto L_0x0085;
                default: goto L_0x0083;
            }
        L_0x0083:
            goto L_0x01a7
        L_0x0085:
            com.ss.android.ugc.aweme.commercialize.feed.an r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53161y(r0, r1)
            com.ss.android.ugc.aweme.commercialize.feed.an r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53112C(r0, r1)
            com.ss.android.ugc.aweme.commercialize.feed.ah r2 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62914e()
            android.support.v4.app.FragmentActivity r3 = r8.getActivity()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r8.f102211aq
            r5 = 0
            r6 = 8
            com.ss.android.ugc.aweme.commercialize.e.b r7 = com.p683ss.android.ugc.aweme.profile.p2090ui.C40252bc.f102792a
            r2.mo53191a(r3, r4, r5, r6, r7)
            goto L_0x01a7
        L_0x00b3:
            com.ss.android.ugc.aweme.commercialize.feed.an r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53111B(r0, r1)
            com.ss.android.ugc.aweme.commercialize.feed.an r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53161y(r0, r1)
            com.ss.android.ugc.aweme.commercialize.feed.ah r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62914e()
            android.support.v4.app.FragmentActivity r0 = r8.getActivity()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            android.support.v4.app.k r2 = r8.getChildFragmentManager()
            r3 = 8
            r9.mo53190a(r0, r1, r2, r3)
            return
        L_0x00e1:
            com.ss.android.ugc.aweme.commercialize.feed.an r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53110A(r0, r1)
            com.ss.android.ugc.aweme.commercialize.feed.an r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53161y(r0, r1)
            com.ss.android.ugc.aweme.commercialize.feed.ah r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62914e()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53200d(r0, r1)
            return
        L_0x0109:
            com.ss.android.ugc.aweme.commercialize.feed.e r9 = r8.f102197aT
            boolean r9 = r9.mo53250f()
            if (r9 == 0) goto L_0x0139
            com.ss.android.ugc.aweme.commercialize.feed.ah r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62914e()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53199c(r0, r1)
            com.ss.android.ugc.aweme.commercialize.feed.an r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53161y(r0, r1)
            com.ss.android.ugc.aweme.commercialize.feed.an r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53162z(r0, r1)
            return
        L_0x0139:
            com.ss.android.ugc.aweme.commercialize.feed.e r9 = r8.f102197aT
            boolean r9 = r9.mo53247c()
            if (r9 == 0) goto L_0x014f
            com.ss.android.ugc.aweme.commercialize.feed.ah r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62914e()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53196b(r0, r1)
            return
        L_0x014f:
            return
        L_0x0150:
            com.ss.android.ugc.aweme.commercialize.feed.an r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53160x(r0, r1)
            com.ss.android.ugc.aweme.commercialize.feed.an r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53161y(r0, r1)
            com.ss.android.ugc.aweme.commercialize.feed.ah r2 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62914e()
            android.support.v4.app.FragmentActivity r3 = r8.getActivity()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r8.f102211aq
            r5 = 0
            r6 = 8
            r7 = 0
            r2.mo53191a(r3, r4, r5, r6, r7)
        L_0x017b:
            com.ss.android.ugc.aweme.commercialize.feed.an r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53160x(r0, r1)
            com.ss.android.ugc.aweme.commercialize.feed.an r9 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62911b()
            android.content.Context r0 = r8.getContext()
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r8.f102211aq
            r9.mo53161y(r0, r1)
            com.ss.android.ugc.aweme.commercialize.feed.ah r2 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62914e()
            android.support.v4.app.FragmentActivity r3 = r8.getActivity()
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r8.f102211aq
            r5 = 0
            r6 = 8
            r7 = 0
            r2.mo53191a(r3, r4, r5, r6, r7)
            return
        L_0x01a7:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.profile.p2090ui.I18nBaseUserProfileFragment.onAdBottomClick(android.view.View):void");
    }

    /* renamed from: g */
    public final void mo82164g(int i) {
        if (isViewValid()) {
            this.f102208an = i;
            if (TextUtils.equals(this.f102207am, C20854a.m53167g().getCurUserId())) {
                this.followBn.setVisibility(8);
                this.requestedBtn.setVisibility(8);
                this.sendMsgBtn.setVisibility(8);
                this.followIv.setVisibility(8);
                this.f102719T.setVisibility(0);
                return;
            }
            this.f102719T.setVisibility(8);
            this.followBn.setVisibility(0);
            if (i == 0) {
                this.requestedBtn.setVisibility(8);
                this.sendMsgBtn.setVisibility(8);
                this.followIv.setVisibility(8);
                if (this.followIv16 != null) {
                    this.followIv16.setVisibility(8);
                }
                this.followBn.setVisibility(0);
            } else if (i == 1 || i == 2) {
                this.requestedBtn.setVisibility(8);
                this.followBn.setVisibility(8);
                IMainServiceHelper provideIMainServiceHelper_Monster = MainServiceHelperImpl.provideIMainServiceHelper_Monster();
                if (provideIMainServiceHelper_Monster != null && provideIMainServiceHelper_Monster.isChatFunOfflineUnder16()) {
                    if (this.sendMsgBtn != null) {
                        this.sendMsgBtn.setVisibility(8);
                    }
                    if (this.followIv != null) {
                        this.followIv.setVisibility(8);
                    }
                    if (this.followIv16 != null) {
                        this.followIv16.setVisibility(0);
                    }
                    if (!(this.mTvFollow == null || this.mIvMutual == null)) {
                        if (i == 1) {
                            this.mTvFollow.setText(R.string.f9m);
                            this.mIvMutual.setVisibility(8);
                        } else {
                            this.mTvFollow.setText(R.string.as8);
                            this.mIvMutual.setVisibility(0);
                        }
                    }
                } else if (!C10181b.m20511a().mo18172a(HideProfileMessageButton.class, true, "hide_profile_message_button", 31744, false) || this.f103081w.isShowMessageButton()) {
                    this.sendMsgBtn.setVisibility(0);
                    if (this.followIv instanceof ImageView) {
                        if (i == 1) {
                            ((ImageView) this.followIv).setImageResource(R.drawable.dpo);
                        } else {
                            ((ImageView) this.followIv).setImageResource(R.drawable.dpn);
                        }
                    }
                    this.followIv.setVisibility(0);
                } else {
                    this.followIv.setVisibility(8);
                    this.sendMsgBtn.setVisibility(8);
                    if (this.followIv16 != null) {
                        this.followIv16.setVisibility(0);
                    }
                    if (!(this.mTvFollow == null || this.mIvMutual == null)) {
                        if (i == 1) {
                            this.mTvFollow.setText(R.string.f9m);
                            this.mIvMutual.setVisibility(8);
                        } else {
                            this.mTvFollow.setText(R.string.as8);
                            this.mIvMutual.setVisibility(0);
                        }
                    }
                }
            } else if (i == 4) {
                this.requestedBtn.setVisibility(0);
                this.followBn.setVisibility(8);
                this.sendMsgBtn.setVisibility(8);
                this.followIv.setVisibility(8);
            }
            if (!C10181b.m20511a().mo18172a(HideProfileMessageButton.class, true, "hide_profile_message_button", 31744, false) || this.f103081w.isShowMessageButton()) {
                if (C40026s.f101964a.canIM() || !(i == 1 || i == 2)) {
                    this.followBn.setBackgroundResource(R.drawable.drt);
                    if (this.f103081w == null || !m89136e(i, this.f103081w.getFollowerStatus())) {
                        this.followBn.setText(R.string.c_6);
                    } else {
                        this.followBn.setText(getResources().getText(R.string.gfm));
                    }
                    this.followBn.setTextColor(getResources().getColor(R.color.a2j));
                } else {
                    this.sendMsgBtn.setVisibility(8);
                    this.followBn.setVisibility(0);
                    this.followIv.setVisibility(8);
                    this.followBn.setBackgroundResource(R.drawable.dor);
                    this.followBn.setTextColor(getResources().getColor(R.color.a1k));
                    if (this.f103081w == null || !m89136e(i, this.f103081w.getFollowerStatus())) {
                        this.followBn.setText(R.string.b5d);
                    } else {
                        this.followBn.setText(getResources().getText(R.string.gfm));
                    }
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo82156a(View view) {
        super.mo82156a(view);
        this.f102214at = (LiveCircleView) view.findViewById(R.id.avw);
        this.f102215au = (TextView) view.findViewById(R.id.f1l);
        this.f102184aG = (ImageView) view.findViewById(R.id.ik);
        C38446k.m85764a(view.findViewById(R.id.c5f));
        C38446k.m85764a(this.f102184aG);
        if (m89129U()) {
            this.recommededUsersIv.setVisibility(0);
        } else {
            this.recommededUsersIv.setVisibility(8);
        }
        this.f102184aG.setVisibility(0);
        this.f102198aU = view.findViewById(R.id.ba);
        Bundle arguments = getArguments();
        if (arguments != null) {
            String string = arguments.getString("uid", "");
            this.f102186aI = arguments.getString("unique_id", "");
            String string2 = arguments.getString("sec_user_id", "");
            this.f102209ao = arguments.getString("profile_from", "");
            this.f102224bd = arguments.getString("enter_from");
            this.f102223bc = arguments.getString("poi_id");
            this.f102187aJ = arguments.getString("video_id", "");
            this.f102188aK = TextUtils.equals(this.f102209ao, "feed_detail");
            this.f102227bg = arguments.getString("type", "");
            this.f102229bi = arguments.getString("enter_from", "");
            this.f102230bj = arguments.getString("from_discover", "");
            this.f102201aX = arguments.getString("request_id", "");
            this.f102202aY = arguments.getString("room_id", "");
            this.f102203aZ = arguments.getString("room_owner_id", "");
            this.f102221ba = arguments.getString("user_type", "");
            this.f102224bd = arguments.getString("enter_from");
            this.f102223bc = arguments.getString("poi_id");
            this.f102226bf = arguments.getInt("general_search_card_type", 0);
            this.f102222bb = arguments.getBoolean("isFromFeed", true);
            if (!C9431p.m18664a(this.f102230bj)) {
                mo82202d(this.f102230bj);
            }
            if (!TextUtils.isEmpty(this.f102224bd)) {
                mo50432a(this.f102224bd);
            }
            if (TextUtils.equals(this.f102224bd, "discovery_tab")) {
                mo82202d("discovery_tab");
            }
            this.f102231bk = arguments.getString("extra_previous_page_position", "other_places");
            m89133b(string, string2);
            if (this.f102726aa != null) {
                this.f102726aa.f62564b = new C40238ax(this);
            }
        }
        this.f102217aw = new C9381g(this);
        if (this.followIv16 != null) {
            this.followIv16.setVisibility(8);
        }
        this.mRecommendCommonUserView.setSeeAllListener(this);
    }

    /* renamed from: e */
    private static boolean m89136e(int i, int i2) {
        if (i == 0 && i2 == 1 && FollowToFollowBackExperiment.m69596a()) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82190a(DialogInterface dialogInterface, int i) {
        if (i == 0) {
            m89123O();
        }
        dialogInterface.dismiss();
    }

    /* renamed from: d */
    private C40273bu m89134d(int i, int i2) {
        C0654k childFragmentManager = getChildFragmentManager();
        StringBuilder sb = new StringBuilder();
        sb.append(f103057a);
        sb.append(i2);
        C40273bu buVar = (C40273bu) childFragmentManager.mo2224a(sb.toString());
        if (buVar != null) {
            return buVar;
        }
        return C40273bu.m89554a(-1, i, this.f102207am, this.f102185aH, false, new Bundle());
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo82199c(int i, int i2) {
        if (this.f102205ak != null && this.f102205ak.av_()) {
            int i3 = -1;
            if (this.f103081w != null) {
                i3 = this.f103081w.getFollowerStatus();
            }
            mo82164g(i);
            this.f102205ak.mo66349a(new C39970a().mo81871a(this.f102207am).mo81874b(this.f102185aH).mo81869a(i2).mo81877d(i3).mo81872a());
        }
    }

    /* renamed from: a */
    private void m89132a(boolean z, boolean z2) {
        C40266bq bqVar;
        if (this.f103067e != null && this.f103078t < this.f103067e.size()) {
            if (this.f103067e.get(this.f103078t) instanceof C40266bq) {
                bqVar = (C40266bq) this.f103067e.get(this.f103078t);
            } else {
                bqVar = null;
            }
            if (bqVar != null) {
                if (z) {
                    if (C10181b.m20511a().mo18172a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", 31744, false)) {
                        bqVar.mo82496A();
                    }
                    bqVar.mo82502a(false, z2);
                    return;
                }
                if (C10181b.m20511a().mo18172a(StopAnimWhenInvisibleExperiment.class, true, "stop_main_anim_when_invisible", 31744, false)) {
                    bqVar.mo82497C();
                }
                bqVar.mo82511z();
            }
        }
    }

    /* renamed from: b */
    private void m89133b(String str, String str2) {
        if (this.f102232bl) {
            m89138g(str);
            m89127S();
            return;
        }
        if (!TextUtils.isEmpty(str) || !TextUtils.isEmpty(this.f102186aI)) {
            this.f102207am = str;
            this.f102185aH = str2;
            if (!C40264bo.m89526a(C11010c.m22280a())) {
                if (!this.f102192aO) {
                    C9432q.m18672a(C11010c.m22280a(), (int) R.string.cg1);
                }
                this.f102192aO = true;
                return;
            }
            if (this.f102204aj == null) {
                this.f102204aj = new C39955ae();
                this.f102204aj.mo54800a(this);
                this.f102204aj.f101854e = this.f102194aQ;
                this.f102204aj.f101855h = this.f102226bf;
            }
            if (this.f102205ak == null) {
                this.f102205ak = C32616c.f84865a.getFollowPresenter();
                this.f102205ak.mo66348a((C39979m) this);
            }
            this.f102204aj.mo44934a_(this.f102207am, this.f102185aH, this.f102186aI);
            this.f102192aO = false;
            this.f102725Z = -1;
        }
        this.f102199aV = false;
    }

    /* renamed from: a */
    public final void mo50607a(float f, float f2) {
        super.mo50607a(f, f2);
        if (f2 > 5.0f) {
            if (!this.f102200aW) {
                m89145p(300);
            }
            this.f102200aW = true;
            return;
        }
        if (f2 < -5.0f) {
            if (!this.f102200aW) {
                m89141i(false);
            }
            this.f102200aW = true;
        }
    }

    /* renamed from: a */
    public final void mo81886a(int i, int i2) {
        mo82164g(i);
        if (i != 0 || i2 != 1 || !FollowToFollowBackExperiment.m69596a()) {
            this.followBn.setText(getResources().getText(R.string.c_6));
        } else if (this.followBn != null) {
            this.followBn.setText(getResources().getText(R.string.gfm));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo82191a(View view, DialogInterface dialogInterface, int i) {
        m89135e(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo82198b(View view, DialogInterface dialogInterface, int i) {
        m89135e(view);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo82200c(View view, DialogInterface dialogInterface, int i) {
        C26890h.m65011a("choose_punish_pop", new C23089d().mo47826a("is_follow", 1).f61491a);
        m89135e(view);
    }

    /* renamed from: a */
    private void m89131a(boolean z, final View view, final View view2, final float f) {
        ValueAnimator valueAnimator;
        if (view != null && view2 != null) {
            if (z) {
                valueAnimator = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            } else {
                valueAnimator = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            }
            valueAnimator.setDuration(300);
            valueAnimator.addUpdateListener(new AnimatorUpdateListener() {
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    float floatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
                    View view = view;
                    View view2 = view2;
                    float f = f;
                    LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
                    layoutParams.height = (int) (C9432q.m18687b(C11010c.m22280a(), 248.0f) * floatValue);
                    view.setLayoutParams(layoutParams);
                    float f2 = 1.0f - floatValue;
                    view2.setAlpha(f2);
                    LayoutParams layoutParams2 = (LayoutParams) view2.getLayoutParams();
                    layoutParams2.height = (int) (f2 * f);
                    view2.setLayoutParams(layoutParams2);
                }
            });
            valueAnimator.start();
        }
    }
}
