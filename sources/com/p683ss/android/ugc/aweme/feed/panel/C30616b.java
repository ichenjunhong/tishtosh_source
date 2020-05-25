package com.p683ss.android.ugc.aweme.feed.panel;

import android.app.Activity;
import android.content.Context;
import android.net.Uri;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.C0679r;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.view.ViewPager.C0997e;
import android.text.TextUtils;
import android.util.Log;
import android.view.GestureDetector;
import android.view.GestureDetector.OnGestureListener;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnGenericMotionListener;
import android.view.View.OnLayoutChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.widget.FrameLayout.LayoutParams;
import android.widget.ImageView;
import android.widget.PopupWindow.OnDismissListener;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.common.utility.p526f.C9412d;
import com.bytedance.ies.C10174a;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10661a;
import com.bytedance.ies.dmt.p664ui.bubbleview.C10660a.C10665e;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.C27989z;
import com.p683ss.android.ugc.aweme.IAccountService.C20834a;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.adaptation.C22453b.C22458d;
import com.p683ss.android.ugc.aweme.adaptation.C22459c;
import com.p683ss.android.ugc.aweme.adaptation.C22460d;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.app.SharePrefCache;
import com.p683ss.android.ugc.aweme.app.api.p1366b.C22971a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23088c;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.awemeservice.C23324d;
import com.p683ss.android.ugc.aweme.base.api.p1406a.p1408b.C23459a;
import com.p683ss.android.ugc.aweme.base.opensourcemodified.android.support.p1419v4.widget.C23600b;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.captcha.C24493b;
import com.p683ss.android.ugc.aweme.challenge.p1494a.C24530d;
import com.p683ss.android.ugc.aweme.comment.abtest.C25069a;
import com.p683ss.android.ugc.aweme.comment.p1516a.C25066c;
import com.p683ss.android.ugc.aweme.comment.p1521f.C25164b.C25165a;
import com.p683ss.android.ugc.aweme.commercialize.C25707d;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25880al;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.log.C26057av;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25712c;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25713d;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25717g;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25718h;
import com.p683ss.android.ugc.aweme.commercialize.p1553d.C25720j;
import com.p683ss.android.ugc.aweme.commercialize.splash.C26216b;
import com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26432bq;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26467cb;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26511e;
import com.p683ss.android.ugc.aweme.commercialize.utils.ReportFeedAdAction;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.C26689c;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.C26690d;
import com.p683ss.android.ugc.aweme.commercialize.views.cards.C26721r;
import com.p683ss.android.ugc.aweme.common.C26851b;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.net.C26918a;
import com.p683ss.android.ugc.aweme.common.p1594f.C26878d;
import com.p683ss.android.ugc.aweme.common.p1594f.C26880f;
import com.p683ss.android.ugc.aweme.common.p1594f.C26881g;
import com.p683ss.android.ugc.aweme.common.p1594f.C26882h;
import com.p683ss.android.ugc.aweme.common.widget.DiggLayout;
import com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager;
import com.p683ss.android.ugc.aweme.common.widget.VerticalViewPager.C26960e;
import com.p683ss.android.ugc.aweme.detail.p1628ui.C27488ae;
import com.p683ss.android.ugc.aweme.detail.p1628ui.C27489af;
import com.p683ss.android.ugc.aweme.experiment.EnableFollowHintGuideExperiment;
import com.p683ss.android.ugc.aweme.feed.C29984ac;
import com.p683ss.android.ugc.aweme.feed.C30133aj;
import com.p683ss.android.ugc.aweme.feed.C30180e;
import com.p683ss.android.ugc.aweme.feed.C31257z;
import com.p683ss.android.ugc.aweme.feed.adapter.C30013ad;
import com.p683ss.android.ugc.aweme.feed.adapter.C30015af;
import com.p683ss.android.ugc.aweme.feed.adapter.C30016ag;
import com.p683ss.android.ugc.aweme.feed.adapter.C30056b;
import com.p683ss.android.ugc.aweme.feed.adapter.VideoViewHolder;
import com.p683ss.android.ugc.aweme.feed.experiment.C30224d;
import com.p683ss.android.ugc.aweme.feed.experiment.C30227g;
import com.p683ss.android.ugc.aweme.feed.experiment.FeedPlayerCleanOptimize;
import com.p683ss.android.ugc.aweme.feed.experiment.NearbyDetailLiveOptAb;
import com.p683ss.android.ugc.aweme.feed.experiment.PauseVideoWhenCommentingExperiment;
import com.p683ss.android.ugc.aweme.feed.guide.C30289j;
import com.p683ss.android.ugc.aweme.feed.guide.p1722a.C30276a;
import com.p683ss.android.ugc.aweme.feed.helper.C30366f;
import com.p683ss.android.ugc.aweme.feed.helper.C30367g;
import com.p683ss.android.ugc.aweme.feed.helper.C30368h;
import com.p683ss.android.ugc.aweme.feed.helper.C30398t;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.model.BaseFeedPageParams;
import com.p683ss.android.ugc.aweme.feed.model.CardStruct;
import com.p683ss.android.ugc.aweme.feed.model.RelationLabelHelper;
import com.p683ss.android.ugc.aweme.feed.model.VideoMaskInfo;
import com.p683ss.android.ugc.aweme.feed.p1718d.C30178a;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30181a;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30187b;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30198m;
import com.p683ss.android.ugc.aweme.feed.p1719e.C30200o;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30311ac;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30312ad;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30315ag;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30316ah;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30317ai;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30320ak;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30330au;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30338g;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30339h;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30340i;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30342k;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30347p;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30349r;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30351t;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30352u;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30352u.C30353a;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30357y;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30445b;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30446c;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30447d;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30448e;
import com.p683ss.android.ugc.aweme.feed.p1728k.C30452h;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30502u;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30505x;
import com.p683ss.android.ugc.aweme.feed.p1730m.C30507y;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30840cg;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30986f;
import com.p683ss.android.ugc.aweme.feed.p1736ui.landscape.C31030a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.landscape.C31033c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.landscape.C31033c.C31035b;
import com.p683ss.android.ugc.aweme.feed.param.C30669b;
import com.p683ss.android.ugc.aweme.feed.preload.C30675a;
import com.p683ss.android.ugc.aweme.feed.service.C30687a;
import com.p683ss.android.ugc.aweme.feed.utils.C31175aa;
import com.p683ss.android.ugc.aweme.feed.utils.C31186b;
import com.p683ss.android.ugc.aweme.feed.utils.C31188d;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.feed.utils.C31191g;
import com.p683ss.android.ugc.aweme.feed.utils.C31195k.C31198a;
import com.p683ss.android.ugc.aweme.feed.utils.C31208r;
import com.p683ss.android.ugc.aweme.feed.utils.C31212u;
import com.p683ss.android.ugc.aweme.feed.widget.FeedSwipeRefreshLayout;
import com.p683ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout;
import com.p683ss.android.ugc.aweme.feed.widget.LoadMoreFrameLayout.C31238b;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.friends.p1792ui.C32772s;
import com.p683ss.android.ugc.aweme.friends.service.C32616c;
import com.p683ss.android.ugc.aweme.global.config.settings.C32816h;
import com.p683ss.android.ugc.aweme.homepage.api.data.HomePageDataViewModel;
import com.p683ss.android.ugc.aweme.homepage.api.interaction.ScrollSwitchStateManager;
import com.p683ss.android.ugc.aweme.login.p1637a.C27956c;
import com.p683ss.android.ugc.aweme.login.p1637a.C27957d;
import com.p683ss.android.ugc.aweme.main.C36512b;
import com.p683ss.android.ugc.aweme.main.C36546c;
import com.p683ss.android.ugc.aweme.main.C36605dw;
import com.p683ss.android.ugc.aweme.main.C36663h;
import com.p683ss.android.ugc.aweme.main.experiment.EarPhoneUnplugExperiment;
import com.p683ss.android.ugc.aweme.main.p1938b.C36513a;
import com.p683ss.android.ugc.aweme.main.p1939c.C36548a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1382aq.C23253w;
import com.p683ss.android.ugc.aweme.p1382aq.C23254x;
import com.p683ss.android.ugc.aweme.p1706fe.method.C29906l;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47445a;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47446b;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47452d;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47460f;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47463i;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47468l;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47468l.C47470b;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47468l.C47471c;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47468l.C47472d;
import com.p683ss.android.ugc.aweme.p2377ug.guide.C47473m;
import com.p683ss.android.ugc.aweme.player.sdk.p2054a.C38871j;
import com.p683ss.android.ugc.aweme.poi.C39050c;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.presenter.C39969h.C39970a;
import com.p683ss.android.ugc.aweme.profile.presenter.C39979m;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.report.model.C41209a;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import com.p683ss.android.ugc.aweme.services.BusinessComponentServiceUtils;
import com.p683ss.android.ugc.aweme.setting.C41522ac;
import com.p683ss.android.ugc.aweme.setting.p2136e.C41597c;
import com.p683ss.android.ugc.aweme.share.C41976ao.C41977a;
import com.p683ss.android.ugc.aweme.share.C42013g;
import com.p683ss.android.ugc.aweme.share.model.C42207a;
import com.p683ss.android.ugc.aweme.share.model.C42208b;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a;
import com.p683ss.android.ugc.aweme.share.viewmodel.C42245a.C42247b;
import com.p683ss.android.ugc.aweme.shortvideo.p2205i.C43893g;
import com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.p2235c.C44593a;
import com.p683ss.android.ugc.aweme.sticker.data.InteractStickerStruct;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct;
import com.p683ss.android.ugc.aweme.sticker.data.VoteStruct.OptionsBean;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.p683ss.android.ugc.aweme.utils.C47725bm;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47918gj;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.p683ss.android.ugc.aweme.video.C48021h;
import com.p683ss.android.ugc.aweme.video.C48039k;
import com.p683ss.android.ugc.aweme.video.C48069o;
import com.p683ss.android.ugc.aweme.video.C48114q;
import com.p683ss.android.ugc.aweme.video.C48121w;
import com.p683ss.android.ugc.playerkit.videoview.C50158g;
import com.ss.android.ugc.trill.R;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Callable;
import org.greenrobot.eventbus.C53771m;
import org.greenrobot.eventbus.ThreadMode;
import org.json.JSONException;
import org.json.JSONObject;
import p001a.C0013i;
import p064c.p065a.p071d.C1710e;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.panel.b */
public abstract class C30616b extends C30647p implements C9382a, C22458d, C26878d<Aweme>, C30198m, C30313ae<C30332aw>, C30447d, C30502u, C30597ae, C39979m, C41522ac {

    /* renamed from: m */
    private static boolean f79939m = false;

    /* renamed from: u */
    protected static final String f79940u = "b";

    /* renamed from: A */
    protected View f79941A;

    /* renamed from: B */
    protected View f79942B;

    /* renamed from: C */
    protected FeedSwipeRefreshLayout f79943C;

    /* renamed from: D */
    protected DiggLayout f79944D;

    /* renamed from: E */
    public C30056b f79945E;

    /* renamed from: F */
    public int f79946F;

    /* renamed from: G */
    protected C9381g f79947G;

    /* renamed from: H */
    public boolean f79948H;

    /* renamed from: I */
    public boolean f79949I;

    /* renamed from: J */
    public boolean f79950J;

    /* renamed from: K */
    public Set<String> f79951K;

    /* renamed from: L */
    protected boolean f79952L;

    /* renamed from: M */
    View f79953M;

    /* renamed from: N */
    View f79954N;

    /* renamed from: O */
    ViewGroup f79955O;

    /* renamed from: P */
    ViewGroup f79956P;

    /* renamed from: Q */
    protected C30445b f79957Q;

    /* renamed from: R */
    public C30446c f79958R;

    /* renamed from: S */
    public C30448e f79959S;

    /* renamed from: T */
    ImageView f79960T;

    /* renamed from: U */
    protected C32772s f79961U;

    /* renamed from: V */
    protected C10660a f79962V;

    /* renamed from: W */
    protected boolean f79963W;

    /* renamed from: X */
    public boolean f79964X;

    /* renamed from: Y */
    protected boolean f79965Y;

    /* renamed from: Z */
    public boolean f79966Z;

    /* renamed from: a */
    private final float f79967a;

    /* renamed from: aA */
    public boolean f79968aA;

    /* renamed from: aB */
    int f79969aB;

    /* renamed from: aC */
    public boolean f79970aC;

    /* renamed from: aD */
    public int f79971aD;

    /* renamed from: aE */
    public C26960e f79972aE;

    /* renamed from: aF */
    public String f79973aF;

    /* renamed from: aG */
    public long f79974aG;

    /* renamed from: aH */
    public boolean f79975aH;

    /* renamed from: aI */
    protected C47452d f79976aI;

    /* renamed from: aJ */
    protected C47468l f79977aJ;

    /* renamed from: aL */
    private Aweme f79978aL;

    /* renamed from: aM */
    private C30675a f79979aM;

    /* renamed from: aN */
    private final List<Callable> f79980aN;

    /* renamed from: aO */
    private String f79981aO;

    /* renamed from: aP */
    private C47446b f79982aP;

    /* renamed from: aa */
    protected String f79983aa;

    /* renamed from: ab */
    protected C23600b f79984ab;

    /* renamed from: ac */
    public boolean f79985ac;

    /* renamed from: ad */
    protected final C30180e f79986ad;

    /* renamed from: ae */
    public C30669b f79987ae;

    /* renamed from: af */
    protected C30200o f79988af;

    /* renamed from: ag */
    protected final C30187b f79989ag;

    /* renamed from: ah */
    public boolean f79990ah;

    /* renamed from: ai */
    public int f79991ai;

    /* renamed from: aj */
    protected C30276a f79992aj;

    /* renamed from: ak */
    protected boolean f79993ak;

    /* renamed from: al */
    protected boolean f79994al;

    /* renamed from: am */
    protected boolean f79995am;

    /* renamed from: an */
    protected boolean f79996an;

    /* renamed from: ao */
    protected boolean f79997ao;

    /* renamed from: ap */
    protected boolean f79998ap;

    /* renamed from: aq */
    public boolean f79999aq;

    /* renamed from: ar */
    protected C42245a f80000ar;

    /* renamed from: as */
    protected boolean f80001as;

    /* renamed from: at */
    public String f80002at;

    /* renamed from: au */
    protected int f80003au;

    /* renamed from: av */
    protected boolean f80004av;

    /* renamed from: aw */
    public boolean f80005aw;

    /* renamed from: ax */
    public boolean f80006ax;

    /* renamed from: ay */
    public Object f80007ay;

    /* renamed from: az */
    public boolean f80008az;

    /* renamed from: b */
    private C30507y f80009b;

    /* renamed from: c */
    private C26851b f80010c;

    /* renamed from: d */
    private C30178a f80011d;

    /* renamed from: e */
    private Runnable f80012e;

    /* renamed from: f */
    private final C25707d f80013f;

    /* renamed from: g */
    private boolean f80014g;

    /* renamed from: h */
    private C30016ag f80015h;

    /* renamed from: i */
    private boolean f80016i;

    /* renamed from: j */
    private C30840cg f80017j;

    /* renamed from: k */
    private C31033c f80018k;

    /* renamed from: l */
    private boolean f80019l;

    /* renamed from: n */
    private int f80020n;

    /* renamed from: o */
    private boolean f80021o;

    /* renamed from: p */
    private C30600ah f80022p;

    /* renamed from: q */
    private C48021h f80023q;

    /* renamed from: r */
    private String f80024r;

    /* renamed from: s */
    private long f80025s;

    /* renamed from: t */
    private C20834a f80026t;

    /* renamed from: v */
    public long f80027v;

    /* renamed from: w */
    protected boolean f80028w;

    /* renamed from: x */
    public LoadMoreFrameLayout f80029x;

    /* renamed from: y */
    public VerticalViewPager f80030y;

    /* renamed from: z */
    protected C30611ap f80031z;

    /* renamed from: A */
    public String mo55772A() {
        return this.f79983aa;
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public ViewGroup mo55773B() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public void mo55775D() {
        m71664g();
    }

    /* renamed from: H */
    public String mo58357H() {
        return "";
    }

    /* renamed from: I */
    public String mo58358I() {
        return "";
    }

    /* renamed from: J */
    public String mo58359J() {
        return "";
    }

    /* renamed from: V */
    public final C30013ad mo60500V() {
        return this.f79945E;
    }

    /* renamed from: W */
    public final C30669b mo60501W() {
        return this.f79987ae;
    }

    /* renamed from: a */
    public abstract C30056b mo55779a(Context context, LayoutInflater layoutInflater, C30313ae<C30332aw> aeVar, Fragment fragment, OnTouchListener onTouchListener, BaseFeedPageParams baseFeedPageParams, C30198m mVar);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo55785a(C25165a aVar, Aweme aweme) {
    }

    /* renamed from: a */
    public final boolean mo62825a(Aweme aweme, boolean z) {
        return true;
    }

    public final void aA_() {
    }

    /* renamed from: aB */
    public final void mo62827aB() {
        mo62863bc();
    }

    /* renamed from: ae */
    public final void mo60513ae() {
        mo62869bi();
    }

    /* renamed from: ah */
    public void mo60516ah() {
    }

    /* renamed from: ai */
    public void mo60517ai() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: au */
    public void mo62853au() {
    }

    /* renamed from: av */
    public final VerticalViewPager mo62782av() {
        return this.f80030y;
    }

    /* renamed from: ba */
    public final boolean mo62861ba() {
        return this.f79966Z;
    }

    /* access modifiers changed from: protected */
    /* renamed from: bi */
    public void mo62869bi() {
    }

    /* renamed from: br */
    public final boolean mo62791br() {
        return this.f79985ac;
    }

    /* renamed from: bs */
    public final boolean mo62792bs() {
        return this.f79950J;
    }

    /* renamed from: bv */
    public boolean mo62784bv() {
        return false;
    }

    /* renamed from: d */
    public void mo55804d(Exception exc) {
    }

    /* renamed from: h */
    public final boolean mo58030h() {
        return true;
    }

    /* renamed from: i */
    public void mo55809i() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo55810j() {
    }

    /* renamed from: k */
    public void mo55811k() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public void mo55814n() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public void mo55815o() {
    }

    @C53771m
    public void onBottomTabClicked(C42013g gVar) {
    }

    public void onChanged() {
        f79939m = true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public boolean mo55831s() {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public void mo55832t() {
    }

    /* renamed from: v */
    public abstract boolean mo55834v();

    /* renamed from: a */
    public final C30616b mo62810a(C30669b bVar) {
        this.f79987ae = bVar;
        C30187b bVar2 = this.f79989ag;
        String from = bVar.getFrom();
        for (C30181a b_ : bVar2.f78780a) {
            b_.mo60469b_(from);
        }
        this.f79988af.f78850s = bVar.getReactSessionId();
        C30187b bVar3 = this.f79989ag;
        String eventType = bVar.getEventType();
        for (C30181a aVar : bVar3.f78780a) {
            aVar.f78760e = eventType;
        }
        C30187b bVar4 = this.f79989ag;
        int pageType = bVar.getPageType();
        for (C30181a aVar2 : bVar4.f78780a) {
            aVar2.f78761f = pageType;
        }
        bVar.getObjectId();
        bVar.getCardType();
        this.f79986ad.mo60466a(bVar.getCreationId());
        return this;
    }

    /* renamed from: a */
    public void mo55788a(C30445b bVar) {
        this.f79957Q = bVar;
    }

    /* renamed from: a */
    public final void mo62816a(C0997e eVar) {
        if (this.f80030y != null) {
            this.f80030y.mo54890a(eVar);
        }
    }

    /* renamed from: a */
    public final void mo62820a(C48021h hVar) {
        this.f80023q = hVar;
        this.f79988af.f78798A = hVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62823a(boolean z, boolean z2) {
        if (!z2 || C31212u.m72893a(ay_())) {
            C30016ag aj = mo60518aj();
            if (aj != null) {
                aj.mo60234e(z);
            }
            SharePrefCache.inst().getHasLongPressDislike().mo47776a(Boolean.valueOf(true));
            boolean z3 = !z;
            this.f79943C.setCanTouch(z3);
            this.f80030y.setCanTouch(z3);
        }
    }

    /* renamed from: a */
    public final void mo62815a(Activity activity, Fragment fragment) {
        super.mo62815a(activity, fragment);
        for (C30181a a : this.f79989ag.f78780a) {
            a.mo52903a(activity, fragment);
        }
        try {
            for (Callable call : this.f79980aN) {
                call.call();
            }
            this.f79980aN.clear();
        } catch (Exception e) {
            C32458a.m75143a(e);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo62822a(String str, boolean z) {
        this.f79988af.mo60539a(str, true, (C30016ag) null);
    }

    /* renamed from: a */
    public void mo55784a(View view, Bundle bundle) {
        GestureDetector gestureDetector;
        super.mo55784a(view, bundle);
        if (EarPhoneUnplugExperiment.m82548a()) {
            Activity g = C11016e.m22312g();
            if (g instanceof FragmentActivity) {
                FragmentActivity fragmentActivity = (FragmentActivity) g;
                HomePageDataViewModel.m75866a(fragmentActivity).f85654h.observe(fragmentActivity, new C30633c(this));
            }
        }
        this.f80029x = (LoadMoreFrameLayout) view.findViewById(R.id.bhz);
        this.f80030y = (VerticalViewPager) view.findViewById(R.id.ds2);
        this.f79941A = view.findViewById(R.id.d3i);
        this.f79942B = view.findViewById(R.id.ma);
        this.f79943C = (FeedSwipeRefreshLayout) view.findViewById(R.id.caw);
        this.f79944D = (DiggLayout) view.findViewById(R.id.a5q);
        this.f79953M = view.findViewById(R.id.d2w);
        this.f79954N = view.findViewById(R.id.lv);
        this.f79955O = (ViewGroup) view.findViewById(R.id.d2x);
        this.f79956P = (ViewGroup) view.findViewById(R.id.lw);
        this.f80028w = true;
        C47718bf.m103290c(this);
        try {
            C0654k by = mo62964by();
            Fragment a = by.mo2224a("comment");
            if (a != null) {
                C0679r a2 = by.mo2225a();
                a2.mo2177a(a);
                a2.mo2189b();
            }
        } catch (Exception unused) {
        }
        this.f79943C.setViewPager(this.f80030y);
        this.f79947G = new C9381g(this);
        Activity activity = this.f121964aK;
        C9381g gVar = this.f79947G;
        boolean isShowVideoRank = this.f79987ae.isShowVideoRank();
        C306329 r3 = new C31198a() {
            /* renamed from: a */
            public final void mo62952a(boolean z) {
                C39050c.m86874a(C30616b.this.mo96010bw(), C30616b.this.mo60519ak(), 3, C30616b.this.f79987ae, C30616b.this.mo62787aq());
            }

            /* renamed from: a */
            public final void mo62951a(View view, MotionEvent motionEvent) {
                C30616b.this.mo62817a(motionEvent);
            }
        };
        if (!isShowVideoRank) {
            gestureDetector = null;
        } else {
            gestureDetector = new GestureDetector(activity, new OnGestureListener(r3) {

                /* renamed from: a */
                final /* synthetic */ C31198a f81641a;

                public final boolean onDown(MotionEvent motionEvent) {
                    return false;
                }

                public final void onLongPress(MotionEvent motionEvent) {
                }

                public final boolean onScroll(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    return false;
                }

                public final void onShowPress(MotionEvent motionEvent) {
                }

                public final boolean onSingleTapUp(MotionEvent motionEvent) {
                    return false;
                }

                {
                    this.f81641a = r1;
                }

                public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
                    if (motionEvent.getX() - motionEvent2.getX() > 20.0f && Math.abs(motionEvent2.getX() - motionEvent.getX()) > Math.abs(motionEvent2.getY() - motionEvent.getY()) && Math.abs(f) > 200.0f && this.f81641a != null) {
                        this.f81641a.mo62952a(true);
                    }
                    return false;
                }
            });
        }
        this.f79945E = mo55779a(this.f121964aK, LayoutInflater.from(this.f121964aK), this, aC_(), new OnTouchListener(activity, gestureDetector, r3, gVar) {

            /* renamed from: a */
            float f81626a;

            /* renamed from: b */
            float f81627b;

            /* renamed from: c */
            int f81628c = ViewConfiguration.get(this.f81637l).getScaledDoubleTapSlop();

            /* renamed from: d */
            int f81629d = (ViewConfiguration.get(this.f81637l).getScaledTouchSlop() * 3);

            /* renamed from: e */
            int f81630e = (this.f81629d * this.f81629d);

            /* renamed from: f */
            int f81631f = (this.f81628c * this.f81628c);

            /* renamed from: g */
            boolean f81632g;

            /* renamed from: h */
            boolean f81633h;

            /* renamed from: i */
            boolean f81634i;

            /* renamed from: j */
            MotionEvent f81635j;

            /* renamed from: k */
            MotionEvent f81636k;

            /* renamed from: l */
            final /* synthetic */ Activity f81637l;

            /* renamed from: m */
            final /* synthetic */ GestureDetector f81638m;

            /* renamed from: n */
            final /* synthetic */ C31198a f81639n;

            /* renamed from: o */
            final /* synthetic */ Handler f81640o;

            /* JADX WARNING: Removed duplicated region for block: B:46:0x00f2  */
            /* JADX WARNING: Removed duplicated region for block: B:49:0x00ff  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final boolean onTouch(android.view.View r9, android.view.MotionEvent r10) {
                /*
                    r8 = this;
                    android.view.GestureDetector r0 = r8.f81638m
                    if (r0 == 0) goto L_0x0009
                    android.view.GestureDetector r0 = r8.f81638m
                    r0.onTouchEvent(r10)
                L_0x0009:
                    int r0 = r10.getAction()
                    r1 = 0
                    switch(r0) {
                        case 0: goto L_0x0096;
                        case 1: goto L_0x0043;
                        case 2: goto L_0x0013;
                        default: goto L_0x0011;
                    }
                L_0x0011:
                    goto L_0x011a
                L_0x0013:
                    float r9 = r10.getX()
                    float r0 = r8.f81626a
                    float r9 = r9 - r0
                    int r9 = (int) r9
                    float r10 = r10.getY()
                    float r0 = r8.f81627b
                    float r10 = r10 - r0
                    int r10 = (int) r10
                    int r0 = r9 * r9
                    int r10 = r10 * r10
                    int r0 = r0 + r10
                    int r10 = r8.f81630e
                    if (r0 > r10) goto L_0x0034
                    int r9 = java.lang.Math.abs(r9)
                    int r10 = r8.f81629d
                    if (r9 < r10) goto L_0x003b
                L_0x0034:
                    r8.f81633h = r1
                    android.os.Handler r9 = r8.f81640o
                    r9.removeMessages(r1)
                L_0x003b:
                    int r9 = r8.f81631f
                    if (r0 <= r9) goto L_0x011a
                    r8.f81632g = r1
                    goto L_0x011a
                L_0x0043:
                    boolean r9 = r8.f81633h
                    if (r9 == 0) goto L_0x011a
                    boolean r9 = r8.f81634i
                    if (r9 != 0) goto L_0x0085
                    android.view.MotionEvent r9 = r8.f81635j
                    if (r9 == 0) goto L_0x0055
                    if (r10 != 0) goto L_0x0052
                    goto L_0x0055
                L_0x0052:
                    boolean r9 = r8.f81633h
                    goto L_0x0056
                L_0x0055:
                    r9 = 0
                L_0x0056:
                    if (r9 == 0) goto L_0x0085
                    android.os.Handler r9 = r8.f81640o
                    android.os.Handler r0 = r8.f81640o
                    android.support.v4.f.k r2 = new android.support.v4.f.k
                    float r3 = r8.f81626a
                    java.lang.Float r3 = java.lang.Float.valueOf(r3)
                    float r4 = r8.f81627b
                    java.lang.Float r4 = java.lang.Float.valueOf(r4)
                    r2.<init>(r3, r4)
                    android.os.Message r0 = r0.obtainMessage(r1, r2)
                    int r2 = android.view.ViewConfiguration.getDoubleTapTimeout()
                    long r2 = (long) r2
                    long r4 = r10.getEventTime()
                    long r2 = r2 - r4
                    android.view.MotionEvent r4 = r8.f81635j
                    long r4 = r4.getEventTime()
                    long r2 = r2 + r4
                    r9.sendMessageDelayed(r0, r2)
                L_0x0085:
                    android.view.MotionEvent r9 = r8.f81636k
                    if (r9 == 0) goto L_0x008e
                    android.view.MotionEvent r9 = r8.f81636k
                    r9.recycle()
                L_0x008e:
                    android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r10)
                    r8.f81636k = r9
                    goto L_0x011a
                L_0x0096:
                    android.os.Handler r0 = r8.f81640o
                    boolean r0 = r0.hasMessages(r1)
                    if (r0 == 0) goto L_0x00a3
                    android.os.Handler r0 = r8.f81640o
                    r0.removeMessages(r1)
                L_0x00a3:
                    r8.f81634i = r1
                    android.view.MotionEvent r0 = r8.f81635j
                    android.view.MotionEvent r2 = r8.f81636k
                    r3 = 1
                    if (r0 == 0) goto L_0x00ef
                    if (r2 == 0) goto L_0x00ef
                    if (r10 != 0) goto L_0x00b1
                    goto L_0x00ef
                L_0x00b1:
                    boolean r4 = r8.f81632g
                    if (r4 == 0) goto L_0x00ef
                    long r4 = r10.getEventTime()
                    long r6 = r2.getEventTime()
                    long r4 = r4 - r6
                    int r2 = android.view.ViewConfiguration.getDoubleTapTimeout()
                    long r6 = (long) r2
                    int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r2 > 0) goto L_0x00ef
                    r6 = 40
                    int r2 = (r4 > r6 ? 1 : (r4 == r6 ? 0 : -1))
                    if (r2 >= 0) goto L_0x00ce
                    goto L_0x00ef
                L_0x00ce:
                    float r2 = r0.getX()
                    int r2 = (int) r2
                    float r4 = r10.getX()
                    int r4 = (int) r4
                    int r2 = r2 - r4
                    float r0 = r0.getY()
                    int r0 = (int) r0
                    float r4 = r10.getY()
                    int r4 = (int) r4
                    int r0 = r0 - r4
                    int r2 = r2 * r2
                    int r0 = r0 * r0
                    int r2 = r2 + r0
                    int r0 = r8.f81631f
                    if (r2 >= r0) goto L_0x00ef
                    r0 = 1
                    goto L_0x00f0
                L_0x00ef:
                    r0 = 0
                L_0x00f0:
                    if (r0 == 0) goto L_0x00fb
                    r8.f81634i = r3
                    com.ss.android.ugc.aweme.feed.utils.k$a r0 = r8.f81639n
                    android.view.MotionEvent r2 = r8.f81635j
                    r0.mo62951a(r9, r2)
                L_0x00fb:
                    android.view.MotionEvent r9 = r8.f81635j
                    if (r9 == 0) goto L_0x0104
                    android.view.MotionEvent r9 = r8.f81635j
                    r9.recycle()
                L_0x0104:
                    android.view.MotionEvent r9 = android.view.MotionEvent.obtain(r10)
                    r8.f81635j = r9
                    r8.f81633h = r3
                    r8.f81632g = r3
                    float r9 = r10.getX()
                    r8.f81626a = r9
                    float r9 = r10.getY()
                    r8.f81627b = r9
                L_0x011a:
                    return r1
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.utils.C31195k.C311961.onTouch(android.view.View, android.view.MotionEvent):boolean");
            }

            {
                this.f81637l = r1;
                this.f81638m = r2;
                this.f81639n = r3;
                this.f81640o = r4;
            }
        }, BaseFeedPageParams.newBuilder().setAwemeFromPage(mo55829q()).setEventType(ay_()).setParam(this.f79987ae).setMyProfile(TextUtils.equals("from_profile_self", mo62871bk())).setFromPostList(this.f79987ae.isFromPostList()).setPageType(mo60502X()).setShowVote(this.f79987ae.isShowVote()).setCid(this.f79987ae.getCid()), this);
        this.f79945E.f78456g = m71642a();
        this.f80030y.setAdapter(this.f79945E);
        if (mo55803d()) {
            this.f80030y.setOnGenericMotionListener(new OnGenericMotionListener() {
                public final boolean onGenericMotion(View view, MotionEvent motionEvent) {
                    if ((motionEvent.getSource() & 2) == 0 || motionEvent.getAction() != 8 || C30616b.this.f80030y == null || C30616b.this.f80030y.getScrollState() != 0 || C30616b.this.f79994al) {
                        return false;
                    }
                    C32458a.m75141a(3, C30616b.f79940u, "onGenericMotionEvent action scroll");
                    if (motionEvent.getAxisValue(9) < 0.0f) {
                        if (C30616b.this.f80030y.canScrollVertically(1)) {
                            C30616b.this.f80030y.setCurrentItem(C30616b.this.f80030y.getCurrentItem() + 1);
                            return true;
                        }
                    } else if (C30616b.this.f80030y.canScrollVertically(-1)) {
                        C30616b.this.f80030y.setCurrentItem(C30616b.this.f80030y.getCurrentItem() - 1);
                        return true;
                    }
                    return false;
                }
            });
        }
        C47718bf.m103290c(this);
        Activity activity2 = this.f121964aK;
        if (activity2 != null && (activity2 instanceof C36663h)) {
            this.f79964X = ((C36663h) activity2).hasRegistedResumeAction();
        }
        this.f80030y.mo54890a((C0997e) new C0997e() {

            /* renamed from: a */
            int f80033a = -1;

            /* renamed from: b */
            int f80034b = -1;

            /* renamed from: c */
            int f80035c = -1;

            /* renamed from: d */
            boolean f80036d;

            /* renamed from: e */
            float f80037e;

            /* renamed from: f */
            boolean f80038f;

            /* renamed from: g */
            boolean f80039g;

            /* renamed from: h */
            int f80040h = -1;

            public final void onPageScrollStateChanged(int i) {
                this.f80040h = i;
                if (i == 1) {
                    C30616b.this.mo62866bf();
                    C30016ag aK = C30616b.this.mo62836aK();
                    if (aK != null) {
                        aK.mo60182G();
                    }
                    return;
                }
                if (i == 0 && !this.f80038f) {
                    this.f80039g = false;
                    C30016ag aK2 = C30616b.this.mo62836aK();
                    if (aK2 != null) {
                        aK2.mo60183H();
                        if (C30227g.m70973a(C30616b.this.f79987ae.getEventType()) && !C30616b.m71651a(aK2)) {
                            C48039k.m104036a().mo95304b();
                        }
                    }
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:163:0x0386  */
            /* JADX WARNING: Removed duplicated region for block: B:172:0x03b7  */
            /* JADX WARNING: Removed duplicated region for block: B:173:0x03bc  */
            /* JADX WARNING: Removed duplicated region for block: B:176:0x03c5  */
            /* JADX WARNING: Removed duplicated region for block: B:183:0x03dd  */
            /* JADX WARNING: Removed duplicated region for block: B:196:0x0432  */
            /* JADX WARNING: Removed duplicated region for block: B:197:0x0444  */
            /* JADX WARNING: Removed duplicated region for block: B:228:0x04ce  */
            /* JADX WARNING: Removed duplicated region for block: B:231:0x04e1  */
            /* JADX WARNING: Removed duplicated region for block: B:238:0x0537  */
            /* JADX WARNING: Removed duplicated region for block: B:246:0x058b  */
            /* JADX WARNING: Removed duplicated region for block: B:249:0x05b0  */
            /* JADX WARNING: Removed duplicated region for block: B:257:0x05d0  */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void onPageSelected(int r14) {
                /*
                    r13 = this;
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.panel.ap r0 = r0.f80031z
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.common.widget.VerticalViewPager r1 = r1.f80030y
                    if (r1 != 0) goto L_0x000b
                    goto L_0x002b
                L_0x000b:
                    com.ss.android.ugc.aweme.feed.panel.DmtFixFullVideoBlackIssueSetting r2 = com.p683ss.android.ugc.aweme.feed.panel.DmtFixFullVideoBlackIssueSetting.INSTANCE
                    boolean r2 = r2.disable()
                    if (r2 != 0) goto L_0x002b
                    long r2 = r0.f79935a
                    r4 = 0
                    int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
                    if (r6 != 0) goto L_0x001f
                    r0.mo62807a(r1)
                    goto L_0x002b
                L_0x001f:
                    com.ss.android.ugc.aweme.feed.panel.ap$c r2 = new com.ss.android.ugc.aweme.feed.panel.ap$c
                    r2.<init>(r0, r1)
                    java.lang.Runnable r2 = (java.lang.Runnable) r2
                    long r3 = r0.f79935a
                    r1.postDelayed(r2, r3)
                L_0x002b:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r0 = r0.f79965Y
                    if (r0 == 0) goto L_0x0032
                    return
                L_0x0032:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    int r0 = r0.mo60502X()
                    if (r0 != 0) goto L_0x004b
                    int r0 = r13.f80034b
                    if (r14 <= r0) goto L_0x004b
                    com.ss.android.ugc.aweme.bd r0 = com.p683ss.android.ugc.aweme.C23794bh.m58408v()
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    android.content.Context r1 = r1.mo96010bw()
                    r0.mo49236a(r1)
                L_0x004b:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r0 = r0.f79990ah
                    if (r0 == 0) goto L_0x0055
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    r0.f79991ai = r14
                L_0x0055:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r0 = r0.f79990ah
                    r1 = 1
                    r2 = 0
                    if (r0 != 0) goto L_0x00aa
                    boolean r0 = com.p683ss.android.ugc.aweme.app.p1377g.C23097c.m56658a()
                    if (r0 == 0) goto L_0x00aa
                    com.ss.android.ugc.aweme.app.g.c r0 = com.p683ss.android.ugc.aweme.app.p1377g.C23097c.m56659b()
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    java.lang.Class r3 = r3.getClass()
                    java.lang.String r3 = r3.getName()
                    boolean r4 = android.text.TextUtils.isEmpty(r3)
                    if (r4 != 0) goto L_0x00aa
                    com.ss.android.ugc.aweme.app.g.a r4 = new com.ss.android.ugc.aweme.app.g.a
                    long r5 = java.lang.System.currentTimeMillis()
                    r4.<init>(r3, r5)
                    java.util.ArrayList<java.lang.String> r3 = r0.f61505b
                    java.lang.String r5 = r4.f61499a
                    boolean r3 = r3.contains(r5)
                    if (r3 == 0) goto L_0x008c
                    r3 = 1
                    goto L_0x008d
                L_0x008c:
                    r3 = 0
                L_0x008d:
                    if (r3 != 0) goto L_0x00aa
                    r0.f61506c = r4
                    com.ss.android.ugc.aweme.app.g.b r0 = r0.f61504a
                    android.os.Handler r3 = r0.f61501a
                    if (r3 != 0) goto L_0x0098
                    goto L_0x00aa
                L_0x0098:
                    android.os.Handler r3 = r0.f61501a
                    android.os.Message r3 = r3.obtainMessage(r2)
                    r3.obj = r4
                    android.os.Handler r4 = r0.f61501a
                    r3.setTarget(r4)
                    android.os.Handler r0 = r0.f61501a
                    r0.sendMessage(r3)
                L_0x00aa:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r0 = r0.f79990ah
                    if (r0 != 0) goto L_0x00d7
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.ug.guide.d r0 = r0.f79976aI
                    if (r0 == 0) goto L_0x00d7
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.ug.guide.d r0 = r0.f79976aI
                    android.view.View r0 = r0.f119706e
                    if (r0 == 0) goto L_0x00c6
                    int r0 = r0.getVisibility()
                    if (r0 != 0) goto L_0x00c6
                    r0 = 1
                    goto L_0x00c7
                L_0x00c6:
                    r0 = 0
                L_0x00c7:
                    if (r0 == 0) goto L_0x00d7
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.ug.guide.d r0 = r0.f79976aI
                    r0.dismiss()
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.common.widget.VerticalViewPager$e r0 = r0.f79972aE
                    r0.mo55068a()
                L_0x00d7:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    r0.mo60517ai()
                    com.ss.android.ugc.aweme.bd r0 = com.p683ss.android.ugc.aweme.C23794bh.m58408v()
                    r0.mo49232a()
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.b r0 = r0.f79945E
                    if (r0 == 0) goto L_0x00f2
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.b r0 = r0.f79945E
                    boolean r3 = r13.f80036d
                    r0.mo60329a(r14, r3)
                L_0x00f2:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.ug.guide.l r0 = r0.f79977aJ
                    if (r0 == 0) goto L_0x00ff
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.ug.guide.l r0 = r0.f79977aJ
                    r0.mo94749c()
                L_0x00ff:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    int r3 = r0.f79946F
                    if (r14 < r3) goto L_0x0107
                    r3 = 1
                    goto L_0x0108
                L_0x0107:
                    r3 = 0
                L_0x0108:
                    r0.f79949I = r3
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r0 = r0.f80001as
                    if (r0 != 0) goto L_0x0156
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r3 = r3.f79949I
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.b r4 = r4.f79945E
                    com.ss.android.ugc.aweme.feed.panel.b r5 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    int r5 = r5.f79946F
                    com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.mo60285c(r5)
                    com.ss.android.ugc.aweme.feed.panel.b r5 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.b r5 = r5.f79945E
                    com.ss.android.ugc.aweme.feed.model.Aweme r5 = r5.mo60285c(r14)
                    if (r4 == 0) goto L_0x0156
                    if (r5 != 0) goto L_0x012f
                    goto L_0x0156
                L_0x012f:
                    com.ss.android.ugc.aweme.feed.param.b r12 = r0.f79987ae
                    r7 = r3 ^ 1
                    boolean r3 = r0.mo62873bm()
                    java.lang.String r8 = r0.mo62847aV()
                    if (r3 == 0) goto L_0x0156
                    java.lang.String r9 = r4.getAuthorUid()
                    java.lang.String r10 = r4.getAid()
                    java.lang.String r11 = r5.getAid()
                    com.ss.android.ugc.aweme.feed.utils.j r0 = new com.ss.android.ugc.aweme.feed.utils.j
                    r6 = r0
                    r6.<init>(r7, r8, r9, r10, r11, r12)
                    java.util.concurrent.ExecutorService r3 = com.p683ss.android.ugc.aweme.common.C26890h.m65003a()
                    p001a.C0013i.m18a(r0, r3)
                L_0x0156:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r0 = r0.f79948H
                    r3 = 6
                    if (r0 == 0) goto L_0x016b
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    int r0 = r0.f79946F
                    if (r14 == r0) goto L_0x016b
                    java.lang.String r14 = "BaseListFragmentPanel"
                    java.lang.String r0 = "onPageSelected-> mSetItem && position != mCurIndex return!"
                    com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r3, r14, r0)
                    return
                L_0x016b:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    int r0 = r0.f79946F
                    if (r14 != r0) goto L_0x0175
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    r0.f79948H = r2
                L_0x0175:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    r0.mo62878d(r14)
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.ag r0 = r0.mo62836aK()
                    boolean r4 = r13.f80036d
                    r5 = 101(0x65, float:1.42E-43)
                    if (r4 == 0) goto L_0x01a4
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    java.lang.String r6 = "slide"
                    com.ss.android.ugc.aweme.feed.param.b r4 = r4.f79987ae
                    r4.setEnterMethodValue(r6)
                    if (r0 == 0) goto L_0x01b5
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    java.lang.String r4 = r4.mo62872bl()
                    r0.mo60236f(r4)
                    int r4 = r0.mo53997c()
                    if (r4 == r5) goto L_0x01b5
                    r0.mo60244o()
                    goto L_0x01b5
                L_0x01a4:
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r4 = r4.f79990ah
                    if (r4 == 0) goto L_0x01b5
                    if (r0 == 0) goto L_0x01b5
                    int r4 = r0.mo53997c()
                    if (r4 == r5) goto L_0x01b5
                    r0.mo60244o()
                L_0x01b5:
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.common.widget.VerticalViewPager r4 = r4.f80030y
                    if (r4 == 0) goto L_0x01c9
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.common.widget.VerticalViewPager r4 = r4.f80030y
                    int r4 = r4.getChildCount()
                    if (r4 <= 0) goto L_0x01c9
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    r4.f79990ah = r2
                L_0x01c9:
                    boolean r4 = r0 instanceof com.p683ss.android.ugc.aweme.feed.adapter.C30012ac
                    if (r4 == 0) goto L_0x01d9
                    int r4 = r0.mo53997c()
                    if (r4 != r5) goto L_0x01d9
                    r4 = r0
                    com.ss.android.ugc.aweme.feed.adapter.ac r4 = (com.p683ss.android.ugc.aweme.feed.adapter.C30012ac) r4
                    r4.mo60284C()
                L_0x01d9:
                    r13.f80033a = r14
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    android.content.Context r4 = r4.mo96010bw()
                    int r5 = r13.f80033a
                    boolean r4 = r4 instanceof com.p683ss.android.ugc.aweme.main.C36663h
                    if (r4 == 0) goto L_0x01e9
                    com.p683ss.android.ugc.aweme.feed.panel.C30644n.f80079a = r5
                L_0x01e9:
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.b r4 = r4.f79945E
                    com.ss.android.ugc.aweme.feed.model.Aweme r4 = r4.mo60285c(r14)
                    com.ss.android.ugc.aweme.feed.ui.seekbar.a r5 = new com.ss.android.ugc.aweme.feed.ui.seekbar.a
                    com.ss.android.ugc.aweme.feed.panel.b r6 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.param.b r6 = r6.f79987ae
                    java.lang.String r6 = r6.getEventType()
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.param.b r7 = r7.f79987ae
                    int r7 = r7.getPageType()
                    com.ss.android.ugc.aweme.feed.panel.b r8 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    r5.<init>(r4, r6, r7, r8)
                    com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r5)
                    r13.f80034b = r14
                    com.ss.android.ugc.aweme.feed.panel.b r5 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r5 = r5.f79963W
                    if (r5 == 0) goto L_0x021b
                    java.lang.String r14 = "BaseListFragmentPanel"
                    java.lang.String r0 = "onPageSelected-> mWillPageChangeByPreLoad return!"
                    com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r3, r14, r0)
                    return
                L_0x021b:
                    boolean r5 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.m71658bo()
                    if (r5 == 0) goto L_0x0241
                    com.ss.android.ugc.aweme.feed.panel.b r5 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    android.app.Activity r5 = r5.f121964aK
                    boolean r5 = r5 instanceof com.p683ss.android.ugc.aweme.feed.panel.C30603ak
                    if (r5 == 0) goto L_0x0234
                    com.ss.android.ugc.aweme.feed.panel.b r5 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    android.app.Activity r5 = r5.f121964aK
                    com.ss.android.ugc.aweme.feed.panel.ak r5 = (com.p683ss.android.ugc.aweme.feed.panel.C30603ak) r5
                    boolean r5 = r5.isPaused()
                    goto L_0x0242
                L_0x0234:
                    com.ss.android.ugc.aweme.feed.panel.b r5 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    android.app.Activity r5 = r5.f121964aK
                    int r5 = com.p683ss.android.ugc.aweme.C22464ae.m55519a(r5)
                    r6 = 2
                    if (r5 != r6) goto L_0x0241
                    r5 = 1
                    goto L_0x0242
                L_0x0241:
                    r5 = 0
                L_0x0242:
                    com.ss.android.ugc.aweme.main.k r6 = com.p683ss.android.ugc.aweme.C23794bh.m58388b()
                    boolean r6 = r6.mo75672c()
                    if (r6 == 0) goto L_0x0256
                    com.ss.android.ugc.aweme.feed.panel.b r6 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r6 = r6.mo62963bx()
                    if (r6 != 0) goto L_0x0256
                    r6 = 1
                    goto L_0x0257
                L_0x0256:
                    r6 = 0
                L_0x0257:
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.panel.b r8 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r8 = r8.f79949I
                    com.ss.android.ugc.aweme.feed.adapter.ag r7 = r7.mo62890j(r8)
                    r8 = 4
                    if (r5 != 0) goto L_0x0367
                    if (r6 != 0) goto L_0x0367
                    boolean r9 = com.p683ss.android.ugc.aweme.video.C48069o.f120792a
                    if (r9 == 0) goto L_0x0288
                    boolean r9 = com.p683ss.android.ugc.aweme.video.C48069o.m104087I()
                    if (r9 != 0) goto L_0x0277
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    r7.mo62844aS()
                    goto L_0x0382
                L_0x0277:
                    if (r7 == 0) goto L_0x0382
                    com.ss.android.ugc.playerkit.videoview.g r9 = r7.mo60242m()
                    if (r9 == 0) goto L_0x0382
                    com.ss.android.ugc.playerkit.videoview.g r7 = r7.mo60242m()
                    r7.mo60215af()
                    goto L_0x0382
                L_0x0288:
                    com.ss.android.ugc.aweme.im.service.IIMService r9 = com.p683ss.android.ugc.aweme.p1807im.DefaultIMService.provideIMService_Monster()
                    com.ss.android.ugc.aweme.im.service.IIMService r9 = (com.p683ss.android.ugc.aweme.p1807im.service.IIMService) r9
                    com.ss.android.ugc.aweme.feed.panel.b r10 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    android.app.Activity r10 = r10.f121964aK
                    boolean r10 = com.p683ss.android.ugc.aweme.feed.helper.C30398t.m71322b(r10)
                    if (r10 == 0) goto L_0x02dd
                    com.ss.android.ugc.aweme.feed.panel.b r10 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r10 = r10.f79990ah
                    if (r10 != 0) goto L_0x02bc
                    com.ss.android.ugc.aweme.feed.panel.b r10 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r10 = r10.f79970aC
                    if (r10 == 0) goto L_0x02bc
                    com.ss.android.ugc.aweme.feed.panel.b r10 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.param.b r10 = r10.f79987ae
                    java.lang.String r10 = r10.getFrom()
                    java.lang.String r11 = "from_chat"
                    boolean r10 = android.text.TextUtils.equals(r10, r11)
                    if (r10 == 0) goto L_0x02dd
                    if (r9 == 0) goto L_0x02dd
                    boolean r9 = r9.isNeedToContinuePlayInAct()
                    if (r9 == 0) goto L_0x02dd
                L_0x02bc:
                    java.lang.String r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.f79940u
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    java.lang.String r10 = "do not call stopPlay in onPageSelected for first video, position is "
                    r9.<init>(r10)
                    r9.append(r14)
                    java.lang.String r10 = ", isFirst is "
                    r9.append(r10)
                    com.ss.android.ugc.aweme.feed.panel.b r10 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r10 = r10.f79990ah
                    r9.append(r10)
                    java.lang.String r9 = r9.toString()
                    com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75146a(r7, r9)
                    goto L_0x0382
                L_0x02dd:
                    boolean r9 = com.p683ss.android.ugc.aweme.video.C48069o.m104087I()
                    if (r9 != 0) goto L_0x0357
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.b r7 = r7.f79945E
                    int r9 = r13.f80035c
                    com.ss.android.ugc.aweme.feed.model.Aweme r7 = r7.mo60285c(r9)
                    java.lang.String r7 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72838f(r7)
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    java.lang.String r10 = "stop in "
                    r9.<init>(r10)
                    r9.append(r7)
                    java.lang.String r7 = r9.toString()
                    com.p683ss.android.ugc.aweme.feed.utils.C31203o.m72861b(r7)
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.video.h r7 = r7.mo62781ar()
                    r7.mo95292y()
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r7 = r7.f79964X
                    if (r7 == 0) goto L_0x0382
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.e.o r7 = r7.f79988af
                    long r9 = r7.mo60542g()
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    int r7 = r7.f79971aD
                    if (r14 <= r7) goto L_0x0352
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    long r11 = r7.f79974aG
                    int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r7 <= 0) goto L_0x0352
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.video.h r7 = r7.mo62781ar()
                    long r9 = r7.mo95256n()
                    r11 = 1000(0x3e8, double:4.94E-321)
                    int r7 = (r9 > r11 ? 1 : (r9 == r11 ? 0 : -1))
                    if (r7 <= 0) goto L_0x033a
                    r11 = 300(0x12c, double:1.48E-321)
                    long r9 = r9 - r11
                L_0x033a:
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    java.lang.String r7 = r7.f79973aF
                    boolean r7 = android.text.TextUtils.isEmpty(r7)
                    if (r7 != 0) goto L_0x0352
                    com.ss.android.ugc.aweme.feed.h.u r7 = new com.ss.android.ugc.aweme.feed.h.u
                    com.ss.android.ugc.aweme.feed.h.u$a r11 = com.p683ss.android.ugc.aweme.feed.p1723h.C30352u.C30353a.PUT_VIDEO_POSITION
                    com.ss.android.ugc.aweme.feed.panel.b r12 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    java.lang.String r12 = r12.f79973aF
                    r7.<init>(r11, r12, r9)
                    com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r7)
                L_0x0352:
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    r7.f79971aD = r14
                    goto L_0x0382
                L_0x0357:
                    if (r7 == 0) goto L_0x0382
                    com.ss.android.ugc.playerkit.videoview.g r9 = r7.mo60242m()
                    if (r9 == 0) goto L_0x0382
                    com.ss.android.ugc.playerkit.videoview.g r7 = r7.mo60242m()
                    r7.mo60216ag()
                    goto L_0x0382
                L_0x0367:
                    java.lang.String r7 = "BaseListFragmentPanel"
                    java.lang.StringBuilder r9 = new java.lang.StringBuilder
                    java.lang.String r10 = "onPageSelected-> not pause lastHolder cause activityBackground:"
                    r9.<init>(r10)
                    r9.append(r5)
                    java.lang.String r10 = ",fragmentInvisible:"
                    r9.append(r10)
                    r9.append(r6)
                    java.lang.String r9 = r9.toString()
                    com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r8, r7, r9)
                L_0x0382:
                    r13.f80035c = r14
                    if (r4 == 0) goto L_0x03b1
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.param.b r7 = r7.f79987ae
                    java.lang.String r7 = r7.getEventType()
                    boolean r7 = com.p683ss.android.ugc.aweme.feed.experiment.C30227g.m70973a(r7)
                    if (r7 == 0) goto L_0x03aa
                    boolean r7 = r4.isLive()
                    if (r7 == 0) goto L_0x03a2
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.e.o r7 = r7.f79988af
                    r7.mo60545m()
                    goto L_0x03b1
                L_0x03a2:
                    com.ss.android.ugc.aweme.video.k r7 = com.p683ss.android.ugc.aweme.video.C48039k.m104036a()
                    r7.mo95304b()
                    goto L_0x03b1
                L_0x03aa:
                    com.ss.android.ugc.aweme.video.k r7 = com.p683ss.android.ugc.aweme.video.C48039k.m104036a()
                    r7.mo95304b()
                L_0x03b1:
                    com.ss.android.ugc.aweme.feed.panel.b r7 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.e.o r7 = r7.f79988af
                    if (r0 != 0) goto L_0x03bc
                    com.ss.android.ugc.aweme.feed.adapter.ag r9 = r7.mo60527a()
                    goto L_0x03bd
                L_0x03bc:
                    r9 = r0
                L_0x03bd:
                    java.lang.String r10 = ""
                    r7.f78855x = r10
                    boolean r10 = r7.f78840b
                    if (r10 == 0) goto L_0x03d5
                    com.ss.android.ugc.aweme.feed.model.Aweme r10 = r7.f78846o
                    if (r10 != 0) goto L_0x03cc
                    java.lang.String r10 = ""
                    goto L_0x03d2
                L_0x03cc:
                    com.ss.android.ugc.aweme.feed.model.Aweme r10 = r7.f78846o
                    java.lang.String r10 = r10.getAid()
                L_0x03d2:
                    r7.mo60539a(r10, r2, r9)
                L_0x03d5:
                    r7.f78845n = r2
                    boolean r10 = com.p683ss.android.ugc.aweme.feed.utils.C31186b.m72817e(r9)
                    if (r10 == 0) goto L_0x03e6
                    com.ss.android.ugc.aweme.commercialize.feed.al r9 = r9.mo60248r()
                    int r10 = r7.f78845n
                    r9.mo53042a(r10)
                L_0x03e6:
                    r7.f78840b = r2
                    if (r4 == 0) goto L_0x0424
                    boolean r7 = r4.isLive()
                    if (r7 != 0) goto L_0x0424
                    boolean r7 = r4.isCanPlay()
                    if (r7 != 0) goto L_0x0424
                    java.lang.String r0 = "BaseListFragmentPanel"
                    java.lang.String r1 = "onPageSelected-> aweme can't play!"
                    com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r3, r0, r1)
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.b r1 = r1.f79945E
                    com.ss.android.ugc.aweme.feed.model.Aweme r1 = r1.mo60285c(r14)
                    r0.mo62885h(r1)
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r0 = r0.mo62963bx()
                    if (r0 == 0) goto L_0x0423
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    android.app.Activity r0 = r0.f121964aK
                    android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.b r1 = r1.f79945E
                    com.ss.android.ugc.aweme.feed.model.Aweme r14 = r1.mo60285c(r14)
                    com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack.m82603a(r0, r14)
                L_0x0423:
                    return
                L_0x0424:
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.b r3 = r3.f79945E
                    com.ss.android.ugc.aweme.feed.model.Aweme r3 = r3.mo60285c(r14)
                    boolean r3 = com.p683ss.android.ugc.aweme.utils.C47950q.m103752a(r3)
                    if (r3 == 0) goto L_0x0444
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    android.content.Context r0 = r0.mo96010bw()
                    r2 = 2132552026(0x7f1c295a, float:2.0757428E38)
                    com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r0, r2)
                    r0.mo19066a()
                    goto L_0x052f
                L_0x0444:
                    if (r5 != 0) goto L_0x0506
                    if (r6 != 0) goto L_0x0506
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r3 = r3.mo62861ba()
                    if (r3 != 0) goto L_0x0506
                    java.lang.String r3 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72838f(r4)
                    java.lang.String r5 = "onPageSelected"
                    com.p683ss.android.ugc.aweme.feed.utils.C31203o.m72862b(r3, r5)
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.param.b r3 = r3.f79987ae
                    java.lang.String r3 = r3.getEventType()
                    boolean r3 = com.p683ss.android.ugc.aweme.feed.experiment.C30227g.m70973a(r3)
                    if (r3 == 0) goto L_0x0478
                    boolean r3 = r4.isLive()
                    if (r3 == 0) goto L_0x0471
                    boolean r3 = r13.f80039g
                    if (r3 != 0) goto L_0x0483
                L_0x0471:
                    com.ss.android.ugc.aweme.video.k r3 = com.p683ss.android.ugc.aweme.video.C48039k.m104036a()
                    r3.mo95304b()
                L_0x0478:
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    java.lang.String r3 = r3.mo62812a(r4, r2, r0)
                    java.lang.String r5 = "tryPlay"
                    com.p683ss.android.ugc.aweme.feed.utils.C31203o.m72863c(r5, r3)
                L_0x0483:
                    r13.f80039g = r2
                    boolean r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.m71659bp()
                    if (r3 == 0) goto L_0x049c
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.ag r3 = r3.mo62836aK()
                    if (r3 == 0) goto L_0x049c
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.ag r3 = r3.mo62836aK()
                    r3.mo60178A()
                L_0x049c:
                    r3 = 1065353216(0x3f800000, float:1.0)
                    float r5 = r13.f80037e
                    float r3 = r3 - r5
                    r5 = 786163455(0x2edbe6ff, float:1.0E-10)
                    int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r3 < 0) goto L_0x04ae
                    float r3 = r13.f80037e
                    int r3 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
                    if (r3 >= 0) goto L_0x052f
                L_0x04ae:
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r2 = r3.mo62825a(r4, r2)
                    if (r2 == 0) goto L_0x052f
                    boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31186b.m72817e(r0)
                    if (r0 == 0) goto L_0x052f
                    boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72837e(r4)
                    if (r0 != 0) goto L_0x052f
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r0 = r0.f79975aH
                    if (r0 == 0) goto L_0x052f
                    boolean r0 = com.p683ss.android.ugc.aweme.video.C48069o.m104087I()
                    if (r0 == 0) goto L_0x04e1
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.playerkit.videoview.g r0 = r0.mo62839aN()
                    if (r0 == 0) goto L_0x052f
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.e.o r2 = r2.f79988af
                    r0.mo60207a(r2)
                    r0.mo60213ad()
                    goto L_0x052f
                L_0x04e1:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.b r0 = r0.f79945E
                    com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.mo60285c(r14)
                    boolean r0 = r0.isLive()
                    if (r0 == 0) goto L_0x04f3
                    com.p683ss.android.ugc.aweme.video.C48039k.m104036a()
                    goto L_0x052f
                L_0x04f3:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.video.h r0 = r0.mo62781ar()
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.e.o r2 = r2.f79988af
                    r0.mo95284a(r2)
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    r0.mo62832aG()
                    goto L_0x052f
                L_0x0506:
                    java.lang.String r0 = "BaseListFragmentPanel"
                    java.lang.StringBuilder r2 = new java.lang.StringBuilder
                    java.lang.String r3 = "onPageSelected-> not pause activityBackground:"
                    r2.<init>(r3)
                    r2.append(r5)
                    java.lang.String r3 = ",fragmentInvisible:"
                    r2.append(r3)
                    r2.append(r6)
                    java.lang.String r3 = ",mHidden:"
                    r2.append(r3)
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r3 = r3.mo62861ba()
                    r2.append(r3)
                    java.lang.String r2 = r2.toString()
                    com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r8, r0, r2)
                L_0x052f:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r0 = r0.mo62963bx()
                    if (r0 == 0) goto L_0x0548
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    android.app.Activity r0 = r0.f121964aK
                    android.support.v4.app.FragmentActivity r0 = (android.support.p030v4.app.FragmentActivity) r0
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.b r2 = r2.f79945E
                    com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.mo60285c(r14)
                    com.p683ss.android.ugc.aweme.main.page.AwemeChangeCallBack.m82603a(r0, r2)
                L_0x0548:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.b r2 = r2.f79945E
                    com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.mo60285c(r14)
                    r0.mo62885h(r2)
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    r0.mo60496R()
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    r0.mo55836x()
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    int r2 = r14 + 1
                    r0.mo62880e(r2)
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    r0.mo62880e(r14)
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    int r2 = r14 + -1
                    r0.mo62880e(r2)
                    boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64070m(r4)
                    if (r0 != 0) goto L_0x057e
                    boolean r0 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63570a(r4)
                    if (r0 == 0) goto L_0x0583
                L_0x057e:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    r0.mo62856ay()
                L_0x0583:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r0 = r0.mo62852ap()
                    if (r0 == 0) goto L_0x05a2
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    java.lang.String r0 = r0.f80002at
                    com.ss.android.ugc.aweme.newfollow.util.d r0 = com.p683ss.android.ugc.aweme.newfollow.util.C37934d.m84797a(r0)
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.adapter.b r2 = r2.f79945E
                    com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.mo60285c(r14)
                    java.lang.String r2 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72838f(r2)
                    r0.mo77396b(r2)
                L_0x05a2:
                    java.lang.String r0 = "from_tutorial_detail"
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    java.lang.String r2 = r2.mo62871bk()
                    boolean r0 = r0.equals(r2)
                    if (r0 == 0) goto L_0x05c7
                    if (r4 != 0) goto L_0x05b5
                    java.lang.String r0 = ""
                    goto L_0x05b9
                L_0x05b5:
                    java.lang.String r0 = r4.getAid()
                L_0x05b9:
                    com.p683ss.android.ugc.aweme.shortvideo.C42423an.m93188b(r0)
                    if (r14 <= 0) goto L_0x05c7
                    com.bytedance.keva.Keva r0 = com.p683ss.android.ugc.aweme.detail.C27327d.m65857a()
                    java.lang.String r2 = "hasSwipeUp"
                    r0.storeBoolean(r2, r1)
                L_0x05c7:
                    com.ss.android.ugc.aweme.feed.experiment.a r0 = com.p683ss.android.ugc.aweme.feed.experiment.C30220a.f78947a
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.common.widget.VerticalViewPager r1 = r1.f80030y
                    if (r1 != 0) goto L_0x05d0
                    goto L_0x05da
                L_0x05d0:
                    com.ss.android.ugc.aweme.feed.experiment.a$a r2 = new com.ss.android.ugc.aweme.feed.experiment.a$a
                    r2.<init>(r1)
                    d.f.a.a r2 = (p2628d.p2639f.p2640a.C52670a) r2
                    r0.mo60569b(r2)
                L_0x05da:
                    com.ss.android.ugc.aweme.feed.panel.b r0 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    r0.f79946F = r14
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.panel.C30616b.C3061810.onPageSelected(int):void");
            }

            public final void onPageScrolled(int i, float f, int i2) {
                boolean z;
                C30016ag agVar;
                boolean z2;
                if (i != C30616b.this.f79946F) {
                    z = true;
                } else {
                    z = false;
                }
                this.f80038f = z;
                boolean z3 = C30616b.this.f79990ah;
                if (C30616b.this.f79990ah && f == 0.0f && i2 == 0) {
                    onPageSelected(i);
                    C30616b.this.f79990ah = false;
                }
                if (((float) i2) != 0.0f) {
                    this.f80036d = true;
                }
                if (C30616b.this.f79963W) {
                    C30616b.this.f79963W = false;
                    return;
                }
                this.f80037e = f;
                if (i == this.f80033a && f < 1.0E-10f) {
                    C30616b.this.f79946F = i;
                    this.f80033a = -1;
                    C30616b.this.mo55814n();
                    C30616b.this.mo55815o();
                    C30616b.this.mo62853au();
                    View m = C30616b.this.mo62893m(false);
                    if (m != null) {
                        m.setAlpha(0.0f);
                    }
                    if (!z3) {
                        C30616b.this.f79950J = true;
                    }
                    Aweme c = C30616b.this.f79945E.mo60285c(i);
                    if (c == null || c.isLive() || c.isCanPlay()) {
                        if (!C23794bh.m58388b().mo75672c() || C30616b.this.mo62963bx()) {
                            z2 = false;
                        } else {
                            z2 = true;
                        }
                        if (C30616b.this.mo62825a(c, false) && C30616b.this.mo62842aQ() && !C31190f.m72837e(C30616b.this.f79945E.mo60285c(C30616b.this.f79946F)) && C30616b.this.f79975aH && !z2) {
                            if (C47950q.m103752a(C30616b.this.f79945E.mo60285c(C30616b.this.f79946F))) {
                                C10691a.m21542b(C30616b.this.mo96010bw(), (int) R.string.ffs).mo19066a();
                            } else if (C48069o.m104087I()) {
                                C30016ag aK = C30616b.this.mo62836aK();
                                if (aK != null) {
                                    if (C30616b.this.f79945E.mo60285c(C30616b.this.f79946F).isLive()) {
                                        C48039k.m104036a();
                                    } else if (aK.mo60242m() != null) {
                                        aK.mo60242m().mo60207a((C38871j) C30616b.this.f79988af);
                                        aK.mo60242m().mo60213ad();
                                    }
                                }
                            } else if (C30616b.this.f79945E.mo60285c(C30616b.this.f79946F).isLive()) {
                                C48039k.m104036a();
                                if (C30616b.m71659bp() && C30616b.this.mo62836aK() != null) {
                                    C30616b.this.mo62836aK().mo60246p();
                                }
                            } else {
                                C30616b.this.mo62781ar().mo95284a((C38871j) C30616b.this.f79988af);
                                if (C30616b.m71659bp() && C30616b.this.mo62836aK() != null) {
                                    C30616b.this.mo62836aK().mo60179B();
                                    C30616b.this.mo62781ar().mo95290w();
                                }
                                C30616b.this.mo62832aG();
                            }
                        }
                        C30616b.this.mo62850aY();
                    } else {
                        return;
                    }
                }
                if (i == C30616b.this.f79946F) {
                    float f2 = (float) (-i2);
                    C30616b.this.mo62893m(true).setTranslationY(f2);
                    C30616b.this.f79944D.setTranslationY(f2);
                    if (C30616b.this.f79962V != null && ((Boolean) SharePrefCache.inst().getFollowGuideShown().mo47782d()).booleanValue()) {
                        C30616b.this.mo62863bc();
                    }
                } else {
                    int measuredHeight = C30616b.this.f80029x.getMeasuredHeight();
                    if (measuredHeight == 0) {
                        measuredHeight = C9432q.m18688b(C30616b.this.mo96010bw());
                    }
                    if (C22453b.m55505a().f60473k) {
                        measuredHeight = C22453b.m55505a().f60470f;
                    }
                    float f3 = (float) (measuredHeight - i2);
                    C30616b.this.mo62893m(true).setTranslationY(f3);
                    C30616b.this.f79944D.setTranslationY(f3);
                    if (C30616b.this.f79962V != null && ((Boolean) SharePrefCache.inst().getFollowGuideShown().mo47782d()).booleanValue()) {
                        C30616b.this.mo62863bc();
                    }
                }
                Aweme c2 = C30616b.this.f79945E.mo60285c(C30616b.this.f79946F);
                if (C30227g.m70973a(C30616b.this.f79987ae.getEventType()) && c2 != null && !c2.isLive() && !this.f80039g && this.f80040h == 1) {
                    if (f > 0.5f) {
                        Aweme c3 = C30616b.this.f79945E.mo60285c(i);
                        if (c3 != null && c3.isLive()) {
                            C30616b bVar = C30616b.this;
                            if (bVar.f80030y != null && bVar.f80030y.getCurrentItem() > 0) {
                                int childCount = bVar.f80030y.getChildCount() - 1;
                                while (true) {
                                    if (childCount < 0) {
                                        break;
                                    }
                                    agVar = (C30016ag) bVar.f80030y.getChildAt(childCount).getTag(R.id.aeh);
                                    if (bVar.mo62824a(bVar.f80030y.getCurrentItem() - 1, agVar)) {
                                        break;
                                    }
                                    childCount--;
                                }
                            }
                            agVar = null;
                            C30616b.this.mo62812a(c3, false, agVar);
                            this.f80039g = true;
                        }
                    } else {
                        Aweme c4 = C30616b.this.f79945E.mo60285c(i + 1);
                        if (c4 != null && c4.isLive()) {
                            C30616b.this.mo62812a(c4, false, C30616b.this.mo62837aL());
                            this.f80039g = true;
                        }
                    }
                }
                C30616b.this.f79970aC = true;
                if (C30616b.this.mo62837aL() != null) {
                    C30616b.this.mo62837aL();
                }
            }
        });
        this.f80030y.setOnUserSwipeUpListener(this.f79972aE);
        this.f80009b = new C30507y();
        this.f80009b.mo54799a(new C30505x());
        this.f80009b.mo54800a(this);
        this.f80010c = new C26851b();
        this.f80010c.mo54799a(new C41209a());
        this.f79961U = C32616c.f84865a.getFollowPresenter();
        this.f79961U.mo66348a((C39979m) this);
        this.f79986ad.mo60465a();
        this.f80029x.setOnScrolledListener(new C31238b() {
            /* renamed from: a */
            public final void mo62939a(int i) {
                View m = C30616b.this.mo62893m(true);
                if (m != null) {
                    m.setTranslationY((float) i);
                }
                if (C30616b.this.f79944D != null) {
                    C30616b.this.f79944D.setTranslationY((float) i);
                }
                C30616b.this.mo62863bc();
            }
        });
        this.f79949I = true;
        this.f80011d = new C30178a();
        this.f79988af.f78844m = this.f80011d;
        if (!((Boolean) SharePrefCache.inst().getFollowGuideShown().mo47782d()).booleanValue()) {
            C10661a a3 = new C10661a(this.f121964aK).mo19015b((int) R.string.b4e).mo19017c(false).mo19013a(false).mo19010a(5000);
            C306285 r0 = new C10665e() {
                /* renamed from: a */
                public final void mo19020a() {
                    SharePrefCache.inst().getFollowGuideShown().mo47776a(Boolean.valueOf(true));
                    C36605dw.m82471a().edit().putBoolean("hasFollowGuideShown", true).apply();
                }
            };
            C52711k.m112240b(r0, "listener");
            a3.f28419x = r0;
            this.f79962V = a3.mo19014a();
        }
        mo58362a(view);
        this.f79984ab = this.f79943C;
        this.f80030y.addOnLayoutChangeListener(new OnLayoutChangeListener() {
            public final void onLayoutChange(View view, int i, int i2, int i3, int i4, int i5, int i6, int i7, int i8) {
                if (i != i5 || i2 != i6 || i4 != i8 || i3 != i7) {
                    C30616b.this.mo62856ay();
                }
            }
        });
        if (VERSION.SDK_INT >= 28) {
            this.f80030y.postDelayed(new Runnable() {
                public final void run() {
                    if (C30616b.this.f80030y != null) {
                        WindowInsets rootWindowInsets = C30616b.this.f80030y.getRootWindowInsets();
                        if (rootWindowInsets != null) {
                            boolean z = true;
                            Object a = C9412d.m18627a(WindowInsets.class, "getDisplayCutout", rootWindowInsets);
                            C22453b a2 = C22453b.m55505a();
                            if (a == null) {
                                z = false;
                            }
                            a2.f60474l = z;
                        }
                    }
                }
            }, 200);
        }
        if (C31030a.m72630a()) {
            this.f80018k = new C31033c(this.f121964aK, new C31035b() {
                /* renamed from: a */
                public final C30016ag mo62942a() {
                    return C30616b.this.mo62836aK();
                }

                /* renamed from: b */
                public final Aweme mo62943b() {
                    return C30616b.this.mo60519ak();
                }

                /* renamed from: c */
                public final String mo62944c() {
                    return C30616b.this.ay_();
                }
            });
        }
        this.f80000ar = C42245a.m92680a((Context) this.f121964aK);
        this.f79977aJ = new C47468l(this, this.f80000ar);
        if (this.f79977aJ != null) {
            C47468l lVar = this.f79977aJ;
            C42245a aVar = lVar.f119731b;
            C42247b bVar = new C47470b(lVar);
            C52711k.m112240b(bVar, "listener");
            aVar.mo86205a("comment_panel", bVar);
            C47468l lVar2 = this.f79977aJ;
            C42245a aVar2 = lVar2.f119731b;
            C42247b cVar = new C47471c(lVar2);
            C52711k.m112240b(cVar, "listener");
            aVar2.mo86205a("login_panel", cVar);
            C47468l lVar3 = this.f79977aJ;
            C42245a aVar3 = lVar3.f119731b;
            C42247b dVar = new C47472d(lVar3);
            C52711k.m112240b(dVar, "listener");
            aVar3.mo86205a("share_panel", dVar);
        }
    }

    /* renamed from: a */
    private static boolean mo49942a(Aweme aweme) {
        if (aweme == null) {
            return false;
        }
        return (aweme.getAwemeType() == 101) || (aweme.getAwemeType() == 4000);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo62813a(int i, Aweme aweme) {
        this.f79945E.mo60338f(i);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo58362a(View view) {
        if (mo62873bm()) {
        }
    }

    /* renamed from: a */
    public final void mo62817a(MotionEvent motionEvent) {
        C30016ag aO = mo62840aO();
        if (aO != null) {
            mo55783a(motionEvent, aO, aO.mo53999e());
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public boolean mo62824a(int i, C30016ag agVar) {
        return agVar != null && this.f79945E.mo60335d(i) == agVar.mo60289E();
    }

    /* renamed from: a */
    public static boolean m71651a(C30016ag agVar) {
        return agVar.mo53997c() == 101;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final String mo62812a(Aweme aweme, boolean z, C30016ag agVar) {
        if (this.f79964X && aweme != null) {
            this.f79973aF = aweme.getAid();
            C47718bf.m103288a(new C30352u(C30353a.TRY_SHOW_TOAST, mo96010bw(), aweme));
        }
        return this.f79988af.mo60535a(aweme, z, agVar);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:35:0x0091, code lost:
        if (r14.f79986ad.mo60470c().isFinishing() == false) goto L_0x0093;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo60714a(com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw r15) {
        /*
            r14 = this;
            int r0 = r15.f79228a
            r1 = 2132542864(0x7f1c0590, float:2.0738845E38)
            r2 = 2132546921(0x7f1c1569, float:2.0747074E38)
            r3 = 0
            r4 = 2
            r5 = 0
            r6 = 1
            switch(r0) {
                case 0: goto L_0x04ad;
                case 1: goto L_0x0480;
                case 2: goto L_0x044c;
                case 3: goto L_0x0434;
                case 4: goto L_0x0433;
                case 5: goto L_0x03f5;
                case 6: goto L_0x000f;
                case 7: goto L_0x03cb;
                case 8: goto L_0x000f;
                case 9: goto L_0x000f;
                case 10: goto L_0x000f;
                case 11: goto L_0x000f;
                case 12: goto L_0x02c1;
                case 13: goto L_0x000f;
                case 14: goto L_0x000f;
                case 15: goto L_0x000f;
                case 16: goto L_0x02ba;
                case 17: goto L_0x000f;
                case 18: goto L_0x02ad;
                case 19: goto L_0x02a0;
                case 20: goto L_0x000f;
                case 21: goto L_0x000f;
                case 22: goto L_0x000f;
                case 23: goto L_0x000f;
                case 24: goto L_0x0292;
                case 25: goto L_0x0217;
                case 26: goto L_0x019c;
                case 27: goto L_0x019b;
                case 28: goto L_0x0146;
                case 29: goto L_0x000f;
                case 30: goto L_0x0138;
                case 31: goto L_0x000f;
                case 32: goto L_0x000f;
                case 33: goto L_0x0134;
                case 34: goto L_0x0134;
                case 35: goto L_0x0134;
                case 36: goto L_0x000f;
                case 37: goto L_0x011e;
                case 38: goto L_0x0114;
                case 39: goto L_0x000f;
                case 40: goto L_0x0104;
                case 41: goto L_0x00fa;
                case 42: goto L_0x000f;
                case 43: goto L_0x0035;
                case 44: goto L_0x000f;
                case 45: goto L_0x0031;
                case 46: goto L_0x002c;
                case 47: goto L_0x0031;
                case 48: goto L_0x002c;
                case 49: goto L_0x0011;
                default: goto L_0x000f;
            }
        L_0x000f:
            goto L_0x04c8
        L_0x0011:
            r14.f79998ap = r5
            r14.mo55799b(r6)
            java.lang.Object r15 = r15.f79229b
            com.ss.android.ugc.aweme.feed.model.Aweme r15 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r15
            if (r15 != 0) goto L_0x001d
            return
        L_0x001d:
            boolean r0 = r14.mo62868bh()
            if (r0 == 0) goto L_0x04c8
            com.ss.android.ugc.aweme.feed.panel.b$3 r0 = new com.ss.android.ugc.aweme.feed.panel.b$3
            r0.<init>(r15)
            com.p683ss.android.p1137b.p1138a.p1139a.C18842a.m45934b(r0)
            return
        L_0x002c:
            r14.mo62892l(r5)
            goto L_0x04c8
        L_0x0031:
            r14.mo62843aR()
            return
        L_0x0035:
            java.lang.Object r15 = r15.f79229b
            java.lang.Object[] r15 = (java.lang.Object[]) r15
            if (r15 == 0) goto L_0x00f9
            int r0 = r15.length
            if (r0 >= r4) goto L_0x0040
            goto L_0x00f9
        L_0x0040:
            r14.f79993ak = r6
            r0 = r15[r5]
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r0
            r1 = r15[r6]
            com.ss.android.ugc.aweme.comment.model.Comment r1 = (com.p683ss.android.ugc.aweme.comment.model.Comment) r1
            int r2 = r15.length
            r6 = 3
            if (r2 != r6) goto L_0x005b
            r2 = r15[r4]
            if (r2 == 0) goto L_0x005b
            r2 = r15[r4]
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            goto L_0x005c
        L_0x005b:
            r2 = 0
        L_0x005c:
            int r4 = r15.length
            r7 = 4
            if (r4 != r7) goto L_0x006d
            r4 = r15[r6]
            if (r4 == 0) goto L_0x006d
            r15 = r15[r6]
            java.lang.Boolean r15 = (java.lang.Boolean) r15
            boolean r15 = r15.booleanValue()
            goto L_0x006e
        L_0x006d:
            r15 = 0
        L_0x006e:
            java.lang.String r4 = "click_danmu"
            if (r1 != 0) goto L_0x0079
            java.lang.String r15 = "Comment == NULL"
            com.p683ss.android.ugc.aweme.comment.abtest.C25069a.m60928b(r15)
            goto L_0x04c8
        L_0x0079:
            com.ss.android.ugc.aweme.feed.e r6 = r14.f79986ad
            android.app.Activity r6 = r6.mo60470c()
            if (r6 != 0) goto L_0x0087
            java.lang.String r6 = "ACTIVITY == NULL"
            com.p683ss.android.ugc.aweme.comment.abtest.C25069a.m60928b(r6)
            goto L_0x0093
        L_0x0087:
            com.ss.android.ugc.aweme.feed.e r6 = r14.f79986ad
            android.app.Activity r6 = r6.mo60470c()
            boolean r6 = r6.isFinishing()
            if (r6 != 0) goto L_0x00f8
        L_0x0093:
            com.ss.android.ugc.aweme.feed.adapter.ag r6 = r14.mo60518aj()
            if (r6 == 0) goto L_0x009d
            com.ss.android.ugc.aweme.feed.ac r3 = r6.mo60184I()
        L_0x009d:
            com.ss.android.ugc.aweme.comment.f.b$a r6 = new com.ss.android.ugc.aweme.comment.f.b$a
            r6.<init>(r0)
            java.lang.String r1 = r1.getCid()
            com.ss.android.ugc.aweme.comment.f.b$a r1 = r6.mo51330a(r1)
            com.ss.android.ugc.aweme.comment.f.b$a r1 = r1.mo51329a(r3)
            java.lang.String r3 = r14.mo60499U()
            com.ss.android.ugc.aweme.comment.f.b$a r1 = r1.mo51334b(r3)
            com.ss.android.ugc.aweme.feed.param.b r3 = r14.f79987ae
            java.lang.String r3 = r3.getObjectId()
            com.ss.android.ugc.aweme.comment.f.b$a r1 = r1.mo51341e(r3)
            com.ss.android.ugc.aweme.feed.param.b r3 = r14.f79987ae
            java.lang.String r3 = r3.getCardType()
            com.ss.android.ugc.aweme.comment.f.b$a r1 = r1.mo51343f(r3)
            r1.f66658b = r15
            boolean r15 = r14.f80014g
            com.ss.android.ugc.aweme.comment.f.b$a r15 = r1.mo51338c(r15)
            java.lang.String r1 = r14.mo60491M()
            com.ss.android.ugc.aweme.comment.f.b$a r15 = r15.mo51339d(r1)
            r15.f66657a = r2
            com.ss.android.ugc.aweme.feed.param.b r1 = r14.f79987ae
            boolean r1 = r1.isFromPostList()
            com.ss.android.ugc.aweme.comment.f.b$a r15 = r15.mo51344f(r1)
            com.ss.android.ugc.aweme.comment.f.b$a r15 = r15.mo51337c(r4)
            r14.mo55785a(r15, r0)
            com.ss.android.ugc.aweme.feed.e r0 = r14.f79986ad
            com.ss.android.ugc.aweme.comment.f.b r15 = r15.mo51333a()
            r0.mo51536a(r15)
            r14.f80014g = r5
        L_0x00f8:
            return
        L_0x00f9:
            return
        L_0x00fa:
            com.ss.android.ugc.aweme.commercialize.d r0 = r14.f80013f
            java.lang.String r1 = r14.mo60874g(r6)
            r0.mo52904a(r15, r1)
            return
        L_0x0104:
            java.lang.Object r15 = r15.f79229b
            com.ss.android.ugc.aweme.feed.model.Aweme r15 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r15
            if (r15 == 0) goto L_0x04c8
            java.lang.String r15 = r15.getAid()
            r14.f80024r = r15
            r14.mo62843aR()
            return
        L_0x0114:
            java.lang.Object r15 = r15.f79229b
            com.ss.android.ugc.aweme.feed.model.Aweme r15 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r15
            java.lang.String r0 = "head_icon"
            r14.mo62860b(r15, r0)
            return
        L_0x011e:
            r14.f79998ap = r6
            r14.mo55799b(r6)
            java.lang.Object r15 = r15.f79229b
            com.ss.android.ugc.aweme.feed.model.Aweme r15 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r15
            if (r15 != 0) goto L_0x012a
            return
        L_0x012a:
            boolean r0 = r14.mo62868bh()
            if (r0 == 0) goto L_0x04c8
            r14.m71660c(r15, r3)
            return
        L_0x0134:
            r14.m71664g()
            return
        L_0x0138:
            com.ss.android.ugc.aweme.commercialize.d r0 = r14.f80013f
            java.lang.String r1 = "click_video_tag"
            java.lang.String r2 = "video_cart_tag"
            java.lang.String r3 = r14.ay_()
            r0.mo52905a(r15, r1, r2, r3)
            return
        L_0x0146:
            r14.mo55799b(r5)
            com.ss.android.ugc.aweme.feed.adapter.ag r0 = r14.mo62836aK()
            java.lang.Object r15 = r15.f79229b
            com.ss.android.ugc.aweme.feed.model.Aweme r15 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r15
            if (r0 == 0) goto L_0x04c8
            if (r15 == 0) goto L_0x04c8
            boolean r1 = com.p683ss.android.ugc.aweme.utils.C47934o.m103707a(r15)
            if (r1 == 0) goto L_0x017f
            com.ss.android.ugc.aweme.commercialize.feed.ak r1 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62913d()
            boolean r1 = r1.isShowCommerceAfterInteraction()
            if (r1 == 0) goto L_0x017f
            com.ss.android.ugc.aweme.commercialize.feed.al r1 = r0.mo60248r()
            if (r1 == 0) goto L_0x017f
            com.ss.android.ugc.aweme.commercialize.feed.al r15 = r0.mo60248r()
            com.ss.android.ugc.aweme.commercialize.feed.ak r0 = com.p683ss.android.ugc.aweme.commercialize.C25945k.m62913d()
            int r0 = r0.getDelayTimeAfterInteraction()
            int r0 = r0 * 1000
            java.lang.String r1 = "passive_show"
            r15.mo53043a(r0, r1)
            return
        L_0x017f:
            boolean r1 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64073p(r15)
            if (r1 == 0) goto L_0x04c8
            com.ss.android.ugc.aweme.commercialize.feed.al r1 = r0.mo60248r()
            if (r1 == 0) goto L_0x04c8
            com.ss.android.ugc.aweme.commercialize.feed.al r0 = r0.mo60248r()
            int r15 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64074q(r15)
            int r15 = r15 * 1000
            java.lang.String r1 = "passive_show"
            r0.mo53043a(r15, r1)
            return
        L_0x019b:
            return
        L_0x019c:
            java.lang.Object r15 = r15.f79229b
            com.ss.android.ugc.aweme.feed.model.Aweme r15 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r15
            if (r15 != 0) goto L_0x01a3
            return
        L_0x01a3:
            com.ss.android.ugc.aweme.common.b r0 = r14.f80010c
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = r15.getAid()
            r2[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r4)
            r2[r6] = r3
            r0.mo44934a_(r2)
            android.content.Context r0 = r14.mo96010bw()
            android.content.Context r2 = r14.mo96010bw()
            java.lang.String r1 = r2.getString(r1)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            android.content.Context r3 = r14.mo96010bw()
            r4 = 2132543851(0x7f1c096b, float:2.0740847E38)
            java.lang.String r3 = r3.getString(r4)
            r2[r5] = r3
            java.lang.String r1 = com.C2240a.m6772a(r1, r2)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r0, r1)
            r0.mo19066a()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r14.f80030y
            int r1 = r14.f79946F
            int r1 = r1 + r6
            r14.f79946F = r1
            r0.setCurrentItem(r1)
            com.ss.android.ugc.aweme.common.MobClick r0 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r1 = "click_review_notpass"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
            java.lang.String r1 = "homepage_hot"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
            java.lang.String r15 = r15.getAid()
            com.ss.android.ugc.aweme.common.MobClick r15 = r0.setValue(r15)
            com.ss.android.ugc.aweme.app.f.c r0 = new com.ss.android.ugc.aweme.app.f.c
            r0.<init>()
            java.lang.String r1 = "is_user_review"
            java.lang.String r2 = "0"
            com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47824a(r1, r2)
            org.json.JSONObject r0 = r0.mo47825b()
            com.ss.android.ugc.aweme.common.MobClick r15 = r15.setJsonObject(r0)
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r15)
            return
        L_0x0217:
            java.lang.Object r15 = r15.f79229b
            com.ss.android.ugc.aweme.feed.model.Aweme r15 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r15
            if (r15 != 0) goto L_0x021e
            return
        L_0x021e:
            com.ss.android.ugc.aweme.common.b r0 = r14.f80010c
            java.lang.Object[] r2 = new java.lang.Object[r4]
            java.lang.String r3 = r15.getAid()
            r2[r5] = r3
            java.lang.Integer r3 = java.lang.Integer.valueOf(r6)
            r2[r6] = r3
            r0.mo44934a_(r2)
            android.content.Context r0 = r14.mo96010bw()
            android.content.Context r2 = r14.mo96010bw()
            java.lang.String r1 = r2.getString(r1)
            java.lang.Object[] r2 = new java.lang.Object[r6]
            android.content.Context r3 = r14.mo96010bw()
            r4 = 2132541858(0x7f1c01a2, float:2.0736805E38)
            java.lang.String r3 = r3.getString(r4)
            r2[r5] = r3
            java.lang.String r1 = com.C2240a.m6772a(r1, r2)
            com.bytedance.ies.dmt.ui.d.a r0 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21551c(r0, r1)
            r0.mo19066a()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r0 = r14.f80030y
            int r1 = r14.f79946F
            int r1 = r1 + r6
            r14.f79946F = r1
            r0.setCurrentItem(r1)
            com.ss.android.ugc.aweme.common.MobClick r0 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r1 = "click_review_pass"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setEventName(r1)
            java.lang.String r1 = "homepage_hot"
            com.ss.android.ugc.aweme.common.MobClick r0 = r0.setLabelName(r1)
            java.lang.String r15 = r15.getAid()
            com.ss.android.ugc.aweme.common.MobClick r15 = r0.setValue(r15)
            com.ss.android.ugc.aweme.app.f.c r0 = new com.ss.android.ugc.aweme.app.f.c
            r0.<init>()
            java.lang.String r1 = "is_user_review"
            java.lang.String r2 = "1"
            com.ss.android.ugc.aweme.app.f.c r0 = r0.mo47824a(r1, r2)
            org.json.JSONObject r0 = r0.mo47825b()
            com.ss.android.ugc.aweme.common.MobClick r15 = r15.setJsonObject(r0)
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r15)
            return
        L_0x0292:
            com.ss.android.ugc.aweme.commercialize.d r0 = r14.f80013f
            java.lang.String r1 = "click_shopping_cart"
            java.lang.String r2 = "shopping_cart"
            java.lang.String r3 = r14.ay_()
            r0.mo52905a(r15, r1, r2, r3)
            return
        L_0x02a0:
            r14.mo55775D()
            com.ss.android.ugc.aweme.feed.param.b r0 = r14.f79987ae
            java.lang.String r1 = r14.mo62847aV()
            com.p683ss.android.ugc.aweme.feed.utils.C31191g.m72852a(r15, r0, r1)
            return
        L_0x02ad:
            r14.m71664g()
            com.ss.android.ugc.aweme.feed.param.b r0 = r14.f79987ae
            java.lang.String r1 = r14.mo62847aV()
            com.p683ss.android.ugc.aweme.feed.utils.C31191g.m72852a(r15, r0, r1)
            return
        L_0x02ba:
            r14.mo60510ab()
            r14.mo62843aR()
            return
        L_0x02c1:
            r14.mo55828p()
            java.lang.Object r0 = r15.f79229b
            r9 = r0
            com.ss.android.ugc.aweme.feed.model.Aweme r9 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r9
            if (r9 == 0) goto L_0x03ca
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.getAuthor()
            if (r0 != 0) goto L_0x02d3
            goto L_0x03ca
        L_0x02d3:
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.getAuthor()
            java.lang.String r10 = r0.getUid()
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.getAuthor()
            java.lang.String r11 = r0.getSecUid()
            com.ss.android.ugc.aweme.profile.model.User r0 = r9.getAuthor()
            int r13 = r0.getFollowerStatus()
            com.ss.android.ugc.aweme.IAccountUserService r0 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            boolean r0 = r0.isLogin()
            if (r0 != 0) goto L_0x0339
            r14.m71647a(r9, r10, r5)
            android.app.Activity r0 = r14.f121964aK
            r1 = 2132544749(0x7f1c0ced, float:2.0742668E38)
            java.lang.String r0 = r0.getString(r1)
            android.app.Activity r1 = r14.f121964aK
            java.lang.String r2 = r14.ay_()
            java.lang.String r3 = "click_follow"
            com.ss.android.ugc.aweme.utils.ab r4 = com.p683ss.android.ugc.aweme.utils.C47661ab.m103163a()
            java.lang.String r5 = "login_title"
            com.ss.android.ugc.aweme.utils.ab r0 = r4.mo94972a(r5, r0)
            java.lang.String r4 = "group_id"
            java.lang.String r5 = r9.getAid()
            com.ss.android.ugc.aweme.utils.ab r0 = r0.mo94972a(r4, r5)
            java.lang.String r4 = "log_pb"
            java.lang.String r5 = r9.getAid()
            java.lang.String r5 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56874k(r5)
            com.ss.android.ugc.aweme.utils.ab r0 = r0.mo94972a(r4, r5)
            android.os.Bundle r0 = r0.f120139a
            com.ss.android.ugc.aweme.feed.panel.f r4 = new com.ss.android.ugc.aweme.feed.panel.f
            r7 = r4
            r8 = r14
            r12 = r15
            r7.<init>(r8, r9, r10, r11, r12, r13)
            com.p683ss.android.ugc.aweme.login.C27965f.m66721a(r1, r2, r3, r0, r4)
            return
        L_0x0339:
            r14.m71647a(r9, r10, r6)
            com.ss.android.ugc.aweme.friends.ui.s r0 = r14.f79961U
            com.ss.android.ugc.aweme.profile.presenter.h$a r1 = new com.ss.android.ugc.aweme.profile.presenter.h$a
            r1.<init>()
            com.ss.android.ugc.aweme.profile.presenter.h$a r1 = r1.mo81871a(r10)
            com.ss.android.ugc.aweme.profile.presenter.h$a r1 = r1.mo81874b(r11)
            com.ss.android.ugc.aweme.profile.presenter.h$a r1 = r1.mo81869a(r6)
            java.lang.String r2 = r14.ay_()
            com.ss.android.ugc.aweme.profile.presenter.h$a r1 = r1.mo81876c(r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.mo60519ak()
            java.lang.String r2 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72838f(r2)
            com.ss.android.ugc.aweme.profile.presenter.h$a r1 = r1.mo81878d(r2)
            com.ss.android.ugc.aweme.profile.presenter.h$a r1 = r1.mo81870a(r9)
            java.lang.String r15 = r15.f79231d
            com.ss.android.ugc.aweme.profile.presenter.h$a r15 = r1.mo81879e(r15)
            java.lang.String r1 = r14.ay_()
            java.lang.String r2 = "homepage_hot"
            boolean r1 = android.text.TextUtils.equals(r1, r2)
            if (r1 == 0) goto L_0x037b
            r1 = -1
            goto L_0x0385
        L_0x037b:
            com.ss.android.ugc.aweme.feed.param.b r1 = r14.f79987ae
            java.lang.String r1 = r1.getEventType()
            int r1 = com.p683ss.android.ugc.aweme.utils.C47725bm.m103320a(r1)
        L_0x0385:
            com.ss.android.ugc.aweme.profile.presenter.h$a r15 = r15.mo81875c(r1)
            com.ss.android.ugc.aweme.feed.param.b r1 = r14.f79987ae
            java.lang.String r1 = r1.getEventType()
            com.ss.android.ugc.aweme.feed.model.RelationDynamicLabel r2 = r9.getRelationLabel()
            int r1 = com.p683ss.android.ugc.aweme.utils.C47725bm.m103321a(r1, r2)
            com.ss.android.ugc.aweme.profile.presenter.h$a r15 = r15.mo81873b(r1)
            com.ss.android.ugc.aweme.profile.presenter.h$a r15 = r15.mo81877d(r13)
            com.ss.android.ugc.aweme.profile.presenter.h r15 = r15.mo81872a()
            r0.mo66349a(r15)
            com.ss.android.ugc.aweme.profile.model.User r15 = r9.getAuthor()
            java.lang.String r0 = r14.ay_()
            java.lang.String r1 = "homepage_hot"
            boolean r0 = android.text.TextUtils.equals(r0, r1)
            if (r0 == 0) goto L_0x03c9
            com.ss.android.ugc.aweme.main.guide.c r0 = com.p683ss.android.ugc.aweme.C23794bh.m58376B()
            r0.mo75771a(r15)
            com.ss.android.ugc.aweme.feed.h.w r15 = new com.ss.android.ugc.aweme.feed.h.w
            java.lang.String r0 = r14.ay_()
            r15.<init>(r0)
            com.p683ss.android.ugc.aweme.utils.C47718bf.m103288a(r15)
        L_0x03c9:
            return
        L_0x03ca:
            return
        L_0x03cb:
            java.lang.Object r0 = r15.f79229b
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.feed.model.Aweme
            if (r0 == 0) goto L_0x03dd
            java.lang.Object r15 = r15.f79229b
            com.ss.android.ugc.aweme.feed.model.Aweme r15 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r15
            boolean r0 = r14.f80014g
            java.lang.String r1 = "click_comment_icon"
            r14.m71648a(r15, r3, r0, r1)
            return
        L_0x03dd:
            java.lang.Object r0 = r15.f79229b
            boolean r0 = r0 instanceof com.p683ss.android.ugc.aweme.feed.model.AwemeForHotComment
            if (r0 == 0) goto L_0x04c8
            java.lang.Object r0 = r15.f79229b
            com.ss.android.ugc.aweme.feed.model.AwemeForHotComment r0 = (com.p683ss.android.ugc.aweme.feed.model.AwemeForHotComment) r0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r0.mAweme
            java.lang.Object r15 = r15.f79229b
            com.ss.android.ugc.aweme.feed.model.AwemeForHotComment r15 = (com.p683ss.android.ugc.aweme.feed.model.AwemeForHotComment) r15
            java.lang.String r15 = r15.mHotCommentTargetId
            java.lang.String r1 = ""
            r14.m71648a(r0, r15, r6, r1)
            return
        L_0x03f5:
            int r15 = com.p683ss.android.ugc.aweme.feed.experiment.C30223c.m70960a()
            if (r15 == 0) goto L_0x0432
            com.ss.android.ugc.aweme.IAccountUserService r15 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            boolean r15 = r15.isLogin()
            if (r15 != 0) goto L_0x0432
            android.content.SharedPreferences r15 = com.p683ss.android.ugc.aweme.feed.C30133aj.m70706a()
            java.lang.String r0 = "hasShowUnloginDiggToast"
            boolean r15 = r15.getBoolean(r0, r5)
            if (r15 != 0) goto L_0x0432
            boolean r15 = r14.mo62875bq()
            if (r15 != 0) goto L_0x0432
            com.ss.android.ugc.aweme.feed.ui.cg r15 = r14.f80017j
            if (r15 != 0) goto L_0x0426
            com.ss.android.ugc.aweme.feed.ui.cg r15 = new com.ss.android.ugc.aweme.feed.ui.cg
            android.content.Context r0 = r14.mo96010bw()
            r15.<init>(r0)
            r14.f80017j = r15
        L_0x0426:
            com.ss.android.ugc.aweme.common.widget.DiggLayout r15 = r14.f79944D
            com.ss.android.ugc.aweme.feed.panel.k r0 = new com.ss.android.ugc.aweme.feed.panel.k
            r0.<init>(r14)
            r1 = 800(0x320, double:3.953E-321)
            r15.postDelayed(r0, r1)
        L_0x0432:
            return
        L_0x0433:
            return
        L_0x0434:
            r14.f79998ap = r5
            r14.mo55799b(r6)
            java.lang.Object r0 = r15.f79229b
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r0
            if (r0 != 0) goto L_0x0440
            return
        L_0x0440:
            boolean r1 = r14.mo62868bh()
            if (r1 == 0) goto L_0x04c8
            java.lang.String r15 = r15.f79236i
            r14.m71660c(r0, r15)
            return
        L_0x044c:
            com.ss.android.ugc.aweme.base.utils.g r0 = com.p683ss.android.ugc.aweme.base.utils.C23718g.m58207b()
            boolean r0 = r0.mo49153d()
            if (r0 != 0) goto L_0x0460
            android.app.Activity r15 = r14.f121964aK
            com.bytedance.ies.dmt.ui.d.a r15 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r15, r2)
            r15.mo19066a()
            return
        L_0x0460:
            java.lang.Object r15 = r15.f79229b
            com.ss.android.ugc.aweme.feed.model.Aweme r15 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r15
            if (r15 == 0) goto L_0x047f
            java.lang.String r0 = r15.getAid()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 == 0) goto L_0x0471
            goto L_0x047f
        L_0x0471:
            com.ss.android.ugc.aweme.feed.m.y r0 = r14.f80009b
            java.lang.Object[] r1 = new java.lang.Object[r6]
            java.lang.String r15 = r15.getAid()
            r1[r5] = r15
            r0.mo44934a_(r1)
            return
        L_0x047f:
            return
        L_0x0480:
            com.ss.android.ugc.aweme.base.utils.g r0 = com.p683ss.android.ugc.aweme.base.utils.C23718g.m58207b()
            boolean r0 = r0.mo49153d()
            if (r0 != 0) goto L_0x0494
            android.app.Activity r15 = r14.f121964aK
            com.bytedance.ies.dmt.ui.d.a r15 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21542b(r15, r2)
            r15.mo19066a()
            return
        L_0x0494:
            java.lang.Object r15 = r15.f79229b
            com.ss.android.ugc.aweme.feed.model.Aweme r15 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r15
            if (r15 != 0) goto L_0x049b
            return
        L_0x049b:
            com.ss.android.ugc.aweme.share.ShareDependService r0 = com.p683ss.android.ugc.aweme.share.ShareDependService.C41922a.m91868a()
            com.ss.android.ugc.aweme.feed.e r1 = r14.f79986ad
            java.lang.String r1 = r1.mo60476k()
            android.app.Activity r2 = r14.f121964aK
            java.lang.String r3 = ""
            r0.showReportDialog(r15, r1, r2, r3)
            return
        L_0x04ad:
            java.lang.Object r15 = r15.f79229b
            com.ss.android.ugc.aweme.feed.model.Aweme r15 = (com.p683ss.android.ugc.aweme.feed.model.Aweme) r15
            if (r15 != 0) goto L_0x04b4
            return
        L_0x04b4:
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47950q.m103752a(r15)
            if (r0 == 0) goto L_0x04bb
            return
        L_0x04bb:
            com.ss.android.ugc.aweme.feed.e.o r0 = r14.f79988af
            com.ss.android.ugc.aweme.feed.param.b r1 = r14.f79987ae
            long r1 = r1.getVideoCurrentPosition()
            int r1 = (int) r1
            r0.mo60540b(r15, r1)
            return
        L_0x04c8:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.panel.C30616b.mo60714a(com.ss.android.ugc.aweme.feed.h.aw):void");
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo62818a(Aweme aweme, String str, String str2, C30332aw awVar, int i) {
        if (this.f79961U != null && this.f79961U.av_()) {
            m71647a(aweme, str, true);
            this.f79961U.mo66349a(new C39970a().mo81871a(str).mo81874b(str2).mo81869a(1).mo81876c(ay_()).mo81878d(C31190f.m72838f(mo60519ak())).mo81870a(aweme).mo81879e(awVar.f79231d).mo81875c(C47725bm.m103320a(this.f79987ae.getEventType())).mo81873b(C47725bm.m103321a(this.f79987ae.getEventType(), aweme.getRelationLabel())).mo81877d(i).mo81872a());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo58363a(Aweme aweme, String str) {
        String str2;
        C23253w d = new C23253w().mo48161b(mo60874g(true)).mo48164d(TextUtils.isEmpty(mo60491M()) ? ay_() : mo60491M());
        if (TextUtils.isEmpty(mo60491M())) {
            str2 = "follow_button";
        } else {
            str2 = mo62870bj();
        }
        d.mo48165e(str2).mo48163c("follow_button").mo48166f(str).mo48162c(aweme, mo60502X()).mo48076e();
    }

    /* renamed from: a */
    public final void mo62819a(Aweme aweme, String str, boolean z, boolean z2, Map<String, String> map) {
        if (aweme == null) {
            C25069a.m60928b("AWEME == NULL");
            return;
        }
        if (this.f79986ad.mo60470c() == null) {
            C25069a.m60928b("ACTIVITY == NULL");
        } else if (this.f79986ad.mo60470c().isFinishing()) {
            return;
        }
        C30016ag aj = mo60518aj();
        C25165a f = new C25165a(aweme).mo51330a(str).mo51332a(true).mo51338c(false).mo51336b(z).mo51329a(aj != null ? aj.mo60184I() : null).mo51344f(this.f79987ae.isFromPostList());
        f.f66661e = false;
        f.f66662f = null;
        C25165a d = f.mo51339d(mo60491M());
        mo55785a(d, aweme);
        this.f79986ad.mo51536a(d.mo51333a());
    }

    /* renamed from: a */
    public final void mo60524a(Aweme aweme, boolean z, boolean z2) {
        if (C47950q.m103752a(aweme)) {
            C10691a.m21542b(mo96010bw(), (int) R.string.ffs).mo19066a();
        } else if (!this.f79975aH || !mo62868bh()) {
            StringBuilder sb = new StringBuilder("try to handlePlay,but can't meet the conditions,pageResume:");
            sb.append(this.f79975aH);
            sb.append(",isViewValid:");
            sb.append(mo62868bh());
            C32458a.m75141a(4, "BaseListFragmentPanel", sb.toString());
            StringBuilder sb2 = new StringBuilder("the stacktrace:");
            sb2.append(Log.getStackTraceString(new Throwable()));
            C32458a.m75141a(4, "BaseListFragmentPanel", sb2.toString());
        } else {
            this.f79988af.mo60537a(aweme, z, z2);
        }
    }

    /* renamed from: a */
    public void mo50461a(List<Aweme> list, int i) {
        StringBuilder sb = new StringBuilder("insert called,but not response for position:");
        sb.append(i);
        sb.append(",eventType:");
        sb.append(ay_());
        C32458a.m75141a(5, "BaseListFragmentPanel", sb.toString());
    }

    /* renamed from: a */
    public final boolean mo50463a(C26882h<Aweme> hVar) {
        List<T> list = hVar.f70739e;
        int i = hVar.f70736b;
        boolean z = hVar.f70738d;
        int i2 = hVar.f70737c;
        if (list != null && list.size() >= i) {
            if (this.f79945E.getCount() == 0) {
                this.f79945E.mo60331a(list);
            } else if (z) {
                this.f79945E.mo60332a(list, i, i2);
                this.f79945E.notifyDataSetChanged();
            }
        }
        return true;
    }

    /* renamed from: a */
    public final boolean mo60508a(Runnable runnable, long j) {
        if (this.f80030y != null) {
            return this.f80030y.postDelayed(runnable, j);
        }
        return false;
    }

    /* renamed from: a */
    public final void mo62821a(String str, long j, long j2) {
        if (this.f79979aM == null) {
            this.f79979aM = new C30675a();
        }
        this.f79979aM.mo63250a(false, str, j, j2, this.f79945E, mo60520al(), this.f79949I);
    }

    /* renamed from: b */
    public final void mo62783b(String str, boolean z) {
        if (z) {
            if (this.f79979aM == null) {
                this.f79979aM = new C30675a();
            }
            this.f79979aM.mo63250a(z, str, 0, 0, this.f79945E, mo60520al(), this.f79949I);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ Object mo62811a(C1710e eVar) throws Exception {
        m71654b(eVar);
        return null;
    }

    /* renamed from: a */
    public final void mo62814a(int i, boolean z) {
        this.f80030y.mo55004a(i, false);
    }

    /* access modifiers changed from: protected */
    /* JADX WARNING: Code restructure failed: missing block: B:29:0x006f, code lost:
        if ((r12 != null && r12.getUserDigg() == 0 && r12.isCanPlay()) == false) goto L_0x0071;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:47:0x00a8, code lost:
        if ((r12 != null && r12.getUserDigg() == 0 && r12.isCanPlay() && r12.getStatus() != null && !r12.getStatus().isDelete() && r12.getStatus().getPrivateStatus() != 1 && !com.p683ss.android.ugc.aweme.utils.C47950q.m103752a(r12)) != false) goto L_0x00aa;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:48:0x00aa, code lost:
        r0 = com.p683ss.android.ugc.aweme.feed.experiment.C30223c.m70960a();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:49:0x00ae, code lost:
        if (r0 != 0) goto L_0x00ba;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00b0, code lost:
        r3 = !com.p683ss.android.ugc.aweme.account.C20854a.m53167g().isLogin();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:51:0x00ba, code lost:
        if (r0 <= 0) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:53:0x00c4, code lost:
        if (com.p683ss.android.ugc.aweme.account.C20854a.m53167g().isLogin() != false) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:55:0x00ca, code lost:
        if (com.p683ss.android.ugc.aweme.feed.C30133aj.m70708b() < r0) goto L_0x00ce;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:56:0x00cc, code lost:
        r3 = true;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:57:0x00ce, code lost:
        r3 = false;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:58:0x00cf, code lost:
        if (r3 == false) goto L_0x015f;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:59:0x00d1, code lost:
        if (r0 == 0) goto L_0x011b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:61:0x00dd, code lost:
        if (android.text.TextUtils.equals(ay_(), "homepage_hot") == false) goto L_0x00e3;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:62:0x00df, code lost:
        r11 = com.ss.android.ugc.trill.R.string.c31;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:63:0x00e3, code lost:
        r11 = com.ss.android.ugc.trill.R.string.bwi;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:64:0x00e6, code lost:
        com.p683ss.android.ugc.aweme.login.C27965f.m66720a(r9.f121964aK, ay_(), "click_double_like", com.p683ss.android.ugc.aweme.utils.C47661ab.m103163a().mo94972a("login_title", r9.f121964aK.getString(r11)).mo94972a("group_id", r12.getAid()).mo94972a("log_pb", com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56874k(r12.getAid())).f120139a);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:65:0x011b, code lost:
        r11 = new com.p683ss.android.ugc.aweme.p1382aq.C23193aa().mo47947a(ay_()).mo47946a(mo60502X()).mo47950b(r12.getAid()).mo47954f(r12).mo47952c("click_double_like").mo47949b(com.p683ss.android.ugc.aweme.feed.C30133aj.m70710d() ^ true ? 1 : 0);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:66:0x014b, code lost:
        if (r0 == 0) goto L_0x014e;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:67:0x014d, code lost:
        r1 = 1;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:68:0x014e, code lost:
        r11.mo47951c(r1).mo48076e();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:69:0x0159, code lost:
        if (com.p683ss.android.ugc.aweme.feed.C30133aj.m70710d() != false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:70:0x015b, code lost:
        com.p683ss.android.ugc.aweme.feed.C30133aj.m70709c();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:72:0x0167, code lost:
        if (com.p683ss.android.ugc.aweme.base.utils.C23718g.m58207b().mo49153d() == false) goto L_0x01bc;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:73:0x0169, code lost:
        r11.mo60228c(r12);
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo55783a(android.view.MotionEvent r10, com.p683ss.android.ugc.aweme.feed.adapter.C30016ag r11, com.p683ss.android.ugc.aweme.feed.model.Aweme r12) {
        /*
            r9 = this;
            if (r12 == 0) goto L_0x003b
            int r0 = r12.getUserDigg()
            if (r0 != 0) goto L_0x003b
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r12)
            if (r0 == 0) goto L_0x001f
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47950q.m103755d(r12)
            if (r0 == 0) goto L_0x001f
            android.content.Context r0 = r9.mo96010bw()
            r1 = 2132547847(0x7f1c1907, float:2.0748952E38)
            com.bytedance.common.utility.C9432q.m18672a(r0, r1)
            goto L_0x003b
        L_0x001f:
            boolean r0 = com.p683ss.android.ugc.aweme.feed.utils.C31190f.m72831a(r12)
            if (r0 != 0) goto L_0x003b
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47950q.m103754c(r12)
            if (r0 == 0) goto L_0x003b
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47950q.m103756e(r12)
            if (r0 != 0) goto L_0x003b
            android.content.Context r0 = r9.mo96010bw()
            r1 = 2132544885(0x7f1c0d75, float:2.0742944E38)
            com.bytedance.common.utility.C9432q.m18672a(r0, r1)
        L_0x003b:
            if (r12 == 0) goto L_0x0056
            boolean r0 = com.p683ss.android.ugc.aweme.login.utils.C36330a.m81964a(r12)
            if (r0 == 0) goto L_0x0056
            android.content.Context r10 = r9.mo96010bw()
            r11 = 2132551886(0x7f1c28ce, float:2.0757144E38)
            java.lang.String r11 = com.p683ss.android.ugc.aweme.login.utils.C36330a.m81963a(r12, r11)
            com.bytedance.ies.dmt.ui.d.a r10 = com.bytedance.ies.dmt.p664ui.p668d.C10691a.m21545b(r10, r11)
            r10.mo19066a()
            return
        L_0x0056:
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64060c(r12)
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L_0x0071
            if (r12 == 0) goto L_0x006e
            int r0 = r12.getUserDigg()
            if (r0 != 0) goto L_0x006e
            boolean r0 = r12.isCanPlay()
            if (r0 == 0) goto L_0x006e
            r0 = 1
            goto L_0x006f
        L_0x006e:
            r0 = 0
        L_0x006f:
            if (r0 != 0) goto L_0x00aa
        L_0x0071:
            boolean r0 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64060c(r12)
            if (r0 != 0) goto L_0x016d
            if (r12 == 0) goto L_0x00a7
            int r0 = r12.getUserDigg()
            if (r0 != 0) goto L_0x00a7
            boolean r0 = r12.isCanPlay()
            if (r0 == 0) goto L_0x00a7
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r12.getStatus()
            if (r0 == 0) goto L_0x00a7
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r12.getStatus()
            boolean r0 = r0.isDelete()
            if (r0 != 0) goto L_0x00a7
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r12.getStatus()
            int r0 = r0.getPrivateStatus()
            if (r0 == r2) goto L_0x00a7
            boolean r0 = com.p683ss.android.ugc.aweme.utils.C47950q.m103752a(r12)
            if (r0 != 0) goto L_0x00a7
            r0 = 1
            goto L_0x00a8
        L_0x00a7:
            r0 = 0
        L_0x00a8:
            if (r0 == 0) goto L_0x016d
        L_0x00aa:
            int r0 = com.p683ss.android.ugc.aweme.feed.experiment.C30223c.m70960a()
            if (r0 != 0) goto L_0x00ba
            com.ss.android.ugc.aweme.IAccountUserService r3 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            boolean r3 = r3.isLogin()
            r3 = r3 ^ r2
            goto L_0x00cf
        L_0x00ba:
            if (r0 <= 0) goto L_0x00ce
            com.ss.android.ugc.aweme.IAccountUserService r3 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            boolean r3 = r3.isLogin()
            if (r3 != 0) goto L_0x00ce
            int r3 = com.p683ss.android.ugc.aweme.feed.C30133aj.m70708b()
            if (r3 < r0) goto L_0x00ce
            r3 = 1
            goto L_0x00cf
        L_0x00ce:
            r3 = 0
        L_0x00cf:
            if (r3 == 0) goto L_0x015f
            if (r0 == 0) goto L_0x011b
            java.lang.String r11 = r9.ay_()
            java.lang.String r3 = "homepage_hot"
            boolean r11 = android.text.TextUtils.equals(r11, r3)
            if (r11 == 0) goto L_0x00e3
            r11 = 2132546371(0x7f1c1343, float:2.0745958E38)
            goto L_0x00e6
        L_0x00e3:
            r11 = 2132546068(0x7f1c1214, float:2.0745343E38)
        L_0x00e6:
            android.app.Activity r3 = r9.f121964aK
            java.lang.String r4 = r9.ay_()
            java.lang.String r5 = "click_double_like"
            com.ss.android.ugc.aweme.utils.ab r6 = com.p683ss.android.ugc.aweme.utils.C47661ab.m103163a()
            java.lang.String r7 = "login_title"
            android.app.Activity r8 = r9.f121964aK
            java.lang.String r11 = r8.getString(r11)
            com.ss.android.ugc.aweme.utils.ab r11 = r6.mo94972a(r7, r11)
            java.lang.String r6 = "group_id"
            java.lang.String r7 = r12.getAid()
            com.ss.android.ugc.aweme.utils.ab r11 = r11.mo94972a(r6, r7)
            java.lang.String r6 = "log_pb"
            java.lang.String r7 = r12.getAid()
            java.lang.String r7 = com.p683ss.android.ugc.aweme.p1382aq.C23198ae.m56874k(r7)
            com.ss.android.ugc.aweme.utils.ab r11 = r11.mo94972a(r6, r7)
            android.os.Bundle r11 = r11.f120139a
            com.p683ss.android.ugc.aweme.login.C27965f.m66720a(r3, r4, r5, r11)
        L_0x011b:
            com.ss.android.ugc.aweme.aq.aa r11 = new com.ss.android.ugc.aweme.aq.aa
            r11.<init>()
            java.lang.String r3 = r9.ay_()
            com.ss.android.ugc.aweme.aq.aa r11 = r11.mo47947a(r3)
            int r3 = r9.mo60502X()
            com.ss.android.ugc.aweme.aq.aa r11 = r11.mo47946a(r3)
            java.lang.String r3 = r12.getAid()
            com.ss.android.ugc.aweme.aq.aa r11 = r11.mo47950b(r3)
            com.ss.android.ugc.aweme.aq.aa r11 = r11.mo47954f(r12)
            java.lang.String r3 = "click_double_like"
            com.ss.android.ugc.aweme.aq.aa r11 = r11.mo47952c(r3)
            boolean r3 = com.p683ss.android.ugc.aweme.feed.C30133aj.m70710d()
            r3 = r3 ^ r2
            com.ss.android.ugc.aweme.aq.aa r11 = r11.mo47949b(r3)
            if (r0 == 0) goto L_0x014e
            r1 = 1
        L_0x014e:
            com.ss.android.ugc.aweme.aq.aa r11 = r11.mo47951c(r1)
            r11.mo48076e()
            boolean r11 = com.p683ss.android.ugc.aweme.feed.C30133aj.m70710d()
            if (r11 != 0) goto L_0x01bc
            com.p683ss.android.ugc.aweme.feed.C30133aj.m70709c()
            goto L_0x01bc
        L_0x015f:
            com.ss.android.ugc.aweme.base.utils.g r0 = com.p683ss.android.ugc.aweme.base.utils.C23718g.m58207b()
            boolean r0 = r0.mo49153d()
            if (r0 == 0) goto L_0x01bc
            r11.mo60228c(r12)
            goto L_0x01bc
        L_0x016d:
            int r11 = com.p683ss.android.ugc.aweme.feed.experiment.C30223c.m70960a()
            if (r11 == 0) goto L_0x01bc
            if (r12 == 0) goto L_0x01bc
            int r11 = r12.getUserDigg()
            if (r11 == 0) goto L_0x01bc
            com.ss.android.ugc.aweme.IAccountUserService r11 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            boolean r11 = r11.isLogin()
            if (r11 != 0) goto L_0x01bc
            com.ss.android.ugc.aweme.aq.aa r11 = new com.ss.android.ugc.aweme.aq.aa
            r11.<init>()
            java.lang.String r0 = r9.ay_()
            com.ss.android.ugc.aweme.aq.aa r11 = r11.mo47947a(r0)
            int r0 = r9.mo60502X()
            com.ss.android.ugc.aweme.aq.aa r11 = r11.mo47946a(r0)
            java.lang.String r0 = r12.getAid()
            com.ss.android.ugc.aweme.aq.aa r11 = r11.mo47950b(r0)
            com.ss.android.ugc.aweme.aq.aa r11 = r11.mo47954f(r12)
            java.lang.String r0 = "click_double_like"
            com.ss.android.ugc.aweme.aq.aa r11 = r11.mo47952c(r0)
            boolean r0 = com.p683ss.android.ugc.aweme.feed.C30133aj.m70710d()
            r0 = r0 ^ r2
            com.ss.android.ugc.aweme.aq.aa r11 = r11.mo47949b(r0)
            com.ss.android.ugc.aweme.aq.aa r11 = r11.mo47951c(r1)
            r11.mo48076e()
        L_0x01bc:
            com.ss.android.ugc.aweme.antiaddic.lock.b r11 = com.p683ss.android.ugc.aweme.C23794bh.m58390d()
            boolean r11 = r11.mo47103a()
            if (r11 == 0) goto L_0x01c7
            return
        L_0x01c7:
            boolean r11 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64060c(r12)
            if (r11 == 0) goto L_0x01d3
            boolean r11 = r12.isCanPlay()
            if (r11 != 0) goto L_0x01f1
        L_0x01d3:
            boolean r11 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64060c(r12)
            if (r11 != 0) goto L_0x0211
            if (r12 == 0) goto L_0x0211
            boolean r11 = r12.isCanPlay()
            if (r11 == 0) goto L_0x0211
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r11 = r12.getStatus()
            if (r11 == 0) goto L_0x0211
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r11 = r12.getStatus()
            int r11 = r11.getPrivateStatus()
            if (r11 == r2) goto L_0x0211
        L_0x01f1:
            com.ss.android.ugc.aweme.common.widget.DiggLayout r11 = r9.f79944D
            float r12 = r10.getX()
            float r10 = r10.getY()
            r11.mo54895a(r12, r10)
            com.ss.android.ugc.aweme.feed.adapter.ag r10 = r9.mo62836aK()
            if (r10 == 0) goto L_0x0211
            com.ss.android.ugc.aweme.commercialize.feed.al r11 = r10.mo60248r()
            if (r11 == 0) goto L_0x0211
            com.ss.android.ugc.aweme.commercialize.feed.al r10 = r10.mo60248r()
            r10.mo53076j()
        L_0x0211:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.panel.C30616b.mo55783a(android.view.MotionEvent, com.ss.android.ugc.aweme.feed.adapter.ag, com.ss.android.ugc.aweme.feed.model.Aweme):void");
    }

    /* renamed from: bp */
    protected static boolean m71659bp() {
        return C48114q.m104226b();
    }

    /* renamed from: g */
    private void m71664g() {
        this.f79988af.mo60547o();
    }

    /* renamed from: C */
    public String mo55774C() {
        return this.f79987ae.getTracker();
    }

    /* renamed from: L */
    public final String mo60490L() {
        return this.f79987ae.getEnterFromRequestId();
    }

    /* renamed from: M */
    public final String mo60491M() {
        return this.f79987ae.getPreviousPage();
    }

    /* renamed from: N */
    public final String mo60492N() {
        return this.f79987ae.getSearchKeyword();
    }

    /* renamed from: O */
    public final String mo60493O() {
        return this.f79987ae.getContentSource();
    }

    /* renamed from: P */
    public final String mo60494P() {
        return this.f79987ae.getLikeEnterMethod();
    }

    /* renamed from: U */
    public final String mo60499U() {
        return this.f79987ae.getPoiId();
    }

    /* renamed from: X */
    public final int mo60502X() {
        return this.f79987ae.getPageType();
    }

    /* renamed from: aF */
    public final long mo62831aF() {
        return this.f79988af.mo60546n();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aS */
    public final void mo62844aS() {
        mo62781ar().mo95293z();
    }

    /* renamed from: aj */
    public final C30016ag mo60518aj() {
        return mo62836aK();
    }

    /* renamed from: ao */
    public final View mo60526ao() {
        return mo62893m(true);
    }

    /* renamed from: as */
    public final boolean mo62788as() {
        return super.mo62788as();
    }

    public final String ay_() {
        return this.f79987ae.getEventType();
    }

    /* renamed from: bh */
    public final boolean mo62868bh() {
        return super.mo62868bh();
    }

    /* renamed from: bj */
    public final String mo62870bj() {
        return this.f79987ae.getPreviousPagePosition();
    }

    /* renamed from: bk */
    public final String mo62871bk() {
        return this.f79987ae.getFrom();
    }

    /* renamed from: bl */
    public final String mo62872bl() {
        return this.f79987ae.getEnterMethodValue();
    }

    /* renamed from: bo */
    public static boolean m71658bo() {
        try {
            return C32816h.m75716b().getEnableOnPageSelectPauseCheck().booleanValue();
        } catch (C10174a unused) {
            return true;
        }
    }

    /* renamed from: d */
    private static boolean mo55803d() {
        try {
            return C32816h.m75716b().getFeedHandleGenericMotion().booleanValue();
        } catch (C10174a unused) {
            return true;
        }
    }

    /* renamed from: f */
    private void m71663f() {
        mo62781ar().mo95288c(this.f79988af);
    }

    /* renamed from: Q */
    public final String mo60495Q() throws JSONException {
        return mo60497S().optString("request_id");
    }

    /* renamed from: Y */
    public final void mo60506Y() {
        C30016ag aK = mo62836aK();
        if (aK != null) {
            aK.mo60239g(false);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aH */
    public final void mo62833aH() {
        if (this.f80015h != null) {
            this.f80015h.mo54003i();
            this.f80015h = null;
        }
    }

    /* renamed from: aJ */
    public final boolean mo62835aJ() {
        return TextUtils.equals(ay_(), "homepage_hot");
    }

    /* access modifiers changed from: protected */
    /* renamed from: aM */
    public final C30015af mo62838aM() {
        C30016ag aK = mo62836aK();
        if (aK == null) {
            return null;
        }
        return aK.mo60251u();
    }

    /* access modifiers changed from: protected */
    /* renamed from: aN */
    public final C50158g mo62839aN() {
        C30016ag aK = mo62836aK();
        if (aK == null) {
            return null;
        }
        return aK.mo60242m();
    }

    /* renamed from: aO */
    public final C30016ag mo62840aO() {
        C30016ag aK = mo62836aK();
        if (aK != null && !m71651a(aK)) {
            return aK;
        }
        return null;
    }

    /* renamed from: aR */
    public final void mo62843aR() {
        m71663f();
        C48039k.m104036a().mo95304b();
    }

    /* renamed from: aT */
    public final boolean mo62845aT() {
        if (this.f79986ad == null || !this.f79986ad.mo60710g()) {
            return false;
        }
        return true;
    }

    /* renamed from: aU */
    public final void mo62846aU() {
        if (mo62845aT()) {
            this.f79986ad.mo60711h();
        }
    }

    /* renamed from: aZ */
    public void mo62851aZ() {
        mo60507Z();
        this.f79975aH = true;
        mo62874bn();
    }

    /* renamed from: aa */
    public final void mo60509aa() {
        C30016ag aK = mo62836aK();
        if (aK != null) {
            aK.mo60239g(true);
        }
    }

    /* renamed from: ac */
    public final boolean mo60511ac() {
        View m = mo62893m(false);
        if (m == null || m.getVisibility() != 0) {
            return false;
        }
        return true;
    }

    /* renamed from: af */
    public final void mo60514af() {
        if (this.f79977aJ != null) {
            this.f79977aJ.mo94750d();
        }
    }

    /* renamed from: ak */
    public final Aweme mo60519ak() {
        return C31186b.m72813b(mo62836aK());
    }

    /* renamed from: al */
    public final int mo60520al() {
        if (this.f80030y == null) {
            return this.f79946F;
        }
        return this.f80030y.getCurrentItem();
    }

    /* renamed from: am */
    public final int mo60521am() {
        if (this.f79945E == null) {
            return 0;
        }
        return this.f79945E.getCount();
    }

    /* access modifiers changed from: protected */
    /* renamed from: ap */
    public final boolean mo62852ap() {
        if (!TextUtils.isEmpty(this.f80002at)) {
            return true;
        }
        return false;
    }

    /* renamed from: ar */
    public final C48021h mo62781ar() {
        if (this.f80023q == null) {
            this.f80023q = C48121w.m104249M();
        }
        return this.f80023q;
    }

    /* renamed from: at */
    public final boolean mo62789at() {
        if (this.f79991ai == this.f79946F) {
            return true;
        }
        return false;
    }

    /* renamed from: ax */
    public final void mo62855ax() {
        super.mo62855ax();
        C20854a.m53161a().addLoginOrLogoutListener(this.f80026t);
    }

    public final void az_() {
        super.az_();
        C20854a.m53161a().removeLoginOrLogoutListener(this.f80026t);
    }

    /* access modifiers changed from: protected */
    /* renamed from: bd */
    public final boolean mo62864bd() {
        if (mo55829q() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: bf */
    public final void mo62866bf() {
        C30015af aM = mo62838aM();
        if (aM != null) {
            aM.mo60192T();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: bm */
    public boolean mo62873bm() {
        return C31257z.m72970a(ay_());
    }

    /* renamed from: bn */
    public final void mo62874bn() {
        m71654b((C1710e<ScrollSwitchStateManager>) new C30638h<ScrollSwitchStateManager>(this));
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: bq */
    public boolean mo62875bq() {
        if (this.f79962V == null || !this.f79962V.isShowing()) {
            return false;
        }
        return true;
    }

    /* renamed from: u */
    public void mo55833u() {
        mo62879d(this.f79945E.mo60285c(this.f80030y.getCurrentItem()));
    }

    /* renamed from: a */
    private long m71642a() {
        if (this.f80025s == 0) {
            this.f80025s = System.currentTimeMillis();
        }
        return this.f80025s;
    }

    /* renamed from: p */
    private void mo55828p() {
        if (this.f79962V != null && ((Boolean) SharePrefCache.inst().getFollowGuideShown().mo47782d()).booleanValue()) {
            mo62863bc();
        }
    }

    /* renamed from: q */
    private int mo55829q() {
        Activity activity = this.f121964aK;
        if (activity != null) {
            if (activity instanceof C36663h) {
                return 1;
            }
            if (activity instanceof C27488ae) {
                return 2;
            }
        }
        return -1;
    }

    /* renamed from: r */
    private void mo55830r() {
        if (this.f79982aP == null) {
            this.f79982aP = new C47446b(this.f80030y, this.f80029x);
        }
        this.f79982aP.mo94727a();
    }

    /* renamed from: R */
    public final void mo60496R() {
        JSONObject S = mo60497S();
        if (S != null) {
            try {
                C47718bf.m103288a(new C30311ac(S.getString("request_id")));
            } catch (Exception unused) {
            }
        }
    }

    /* renamed from: S */
    public final JSONObject mo60497S() {
        return C31188d.m72825a(this.f79945E.mo60285c(this.f80030y.getCurrentItem()), mo60502X(), mo62872bl(), ay_());
    }

    /* access modifiers changed from: protected */
    /* renamed from: aA */
    public void mo62826aA() {
        if (this.f79969aB != 4) {
            this.f79941A.setVisibility(8);
            this.f79942B.setVisibility(8);
            return;
        }
        this.f79941A.setVisibility(0);
        this.f79942B.setVisibility(0);
    }

    /* renamed from: aC */
    public final void mo62828aC() {
        super.mo62828aC();
        for (C30181a b : this.f79989ag.f78780a) {
            b.mo60468b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aD */
    public final void mo62829aD() {
        if (!C48069o.m104087I()) {
            mo62781ar().mo95292y();
        } else {
            C50158g aN = mo62839aN();
            if (aN != null) {
                aN.mo60216ag();
            }
        }
        C48039k.m104036a().mo95304b();
    }

    /* renamed from: aG */
    public final void mo62832aG() {
        if (!C30398t.m71322b(this.f121964aK) || this.f79970aC) {
            mo62781ar().mo95290w();
        }
    }

    /* renamed from: aP */
    public void mo62841aP() {
        mo62812a(this.f79945E.mo60285c(this.f80030y.getCurrentItem()), true, (C30016ag) null);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: aV */
    public String mo62847aV() {
        return C23198ae.m56847a(this.f79945E.mo60285c(this.f80030y.getCurrentItem()), mo60502X());
    }

    /* access modifiers changed from: protected */
    /* renamed from: aY */
    public final void mo62850aY() {
        if (this.f79962V != null && ((Boolean) SharePrefCache.inst().getFollowGuideShown().mo47782d()).booleanValue()) {
            mo62863bc();
        }
    }

    /* renamed from: an */
    public final String mo60525an() {
        return C31190f.m72838f(this.f79945E.mo60285c(this.f80030y.getCurrentItem()));
    }

    /* renamed from: aq */
    public final int mo62787aq() {
        Aweme ak = mo60519ak();
        if (ak == null || ak.getSimplePoiInfoStruct() == null) {
            return -1;
        }
        return ak.getSimplePoiInfoStruct().getIndex();
    }

    /* renamed from: bb */
    public final void mo62862bb() {
        if (this.f79962V != null) {
            mo62863bc();
            if (this.f80030y != null) {
                this.f80030y.removeCallbacks(this.f80012e);
            }
        }
    }

    /* renamed from: bc */
    public final void mo62863bc() {
        if (this.f79962V != null) {
            this.f79962V.mo19006f();
            this.f79999aq = false;
            this.f80000ar.mo86214c(this.f79999aq);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: be */
    public final boolean mo62865be() {
        if ("from_nearby".equals(mo62871bk()) || "from_poi_categorized".equals(mo62871bk())) {
            return true;
        }
        return false;
    }

    /* renamed from: bg */
    public final int mo62867bg() {
        if (this.f79945E != null) {
            return this.f79945E.getCount() - (this.f79946F + 1);
        }
        return 0;
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo55836x() {
        if ((this.f79942B != null && this.f79942B.getVisibility() == 8) || (mo55835w() && !this.f80021o)) {
            mo62856ay();
        }
    }

    /* renamed from: e */
    private C30016ag mo47031e() {
        if (this.f80030y == null) {
            return null;
        }
        int childCount = this.f80030y.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C30016ag agVar = (C30016ag) this.f80030y.getChildAt(i).getTag(R.id.aeh);
            if (agVar != null && this.f79945E.mo60285c(this.f80030y.getCurrentItem()) == agVar.mo53999e() && agVar.mo53998d() == 3) {
                return agVar;
            }
        }
        return null;
    }

    /* renamed from: w */
    private boolean mo55835w() {
        if ((TextUtils.equals(ay_(), "homepage_fresh") || TextUtils.equals(ay_(), "trending_page") || TextUtils.equals(ay_(), "general_search") || TextUtils.equals(ay_(), "search_result")) && NearbyDetailLiveOptAb.m70952a()) {
            return true;
        }
        return false;
    }

    /* renamed from: T */
    public final void mo60498T() {
        if (mo62963bx()) {
            C30016ag aK = mo62836aK();
            if (C31186b.m72817e(aK)) {
                Aweme e = aK.mo53999e();
                if (e != null && e != this.f79978aL) {
                    this.f79978aL = e;
                    C31191g.m72851a(mo96010bw(), e, mo60497S(), this.f79987ae, mo60874g(true));
                }
            }
        }
    }

    /* renamed from: Z */
    public final void mo60507Z() {
        final View m = mo62893m(false);
        if (m != null) {
            m.setVisibility(0);
            m.animate().alpha(0.0f).setDuration(100).withEndAction(new Runnable() {
                public final void run() {
                    if (m != null) {
                        m.setVisibility(8);
                    }
                }
            }).start();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aI */
    public final void mo62834aI() {
        if (this.f79945E != null) {
            int i = this.f80003au;
            if (i >= 0) {
                int i2 = i - 1;
                if (C26503d.m64061d(this.f79945E.mo60285c(i2)) && !C26503d.m64050B(this.f79945E.mo60285c(i2))) {
                    mo55796b(i2);
                }
                if (i == 0 && this.f79945E.mo60285c(1) != null) {
                    mo55796b(i);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aL */
    public final C30016ag mo62837aL() {
        if (this.f80030y == null) {
            return null;
        }
        for (int childCount = this.f80030y.getChildCount() - 1; childCount >= 0; childCount--) {
            C30016ag agVar = (C30016ag) this.f80030y.getChildAt(childCount).getTag(R.id.aeh);
            if (mo62824a(this.f80030y.getCurrentItem() + 1, agVar)) {
                return agVar;
            }
        }
        return null;
    }

    /* renamed from: aQ */
    public final boolean mo62842aQ() {
        boolean z;
        C30016ag aK = mo62836aK();
        if (!C31186b.m72817e(aK)) {
            if (aK == null || aK.mo54004j() == null || aK.mo54004j().mo60247q() != 2) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                return true;
            }
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: aW */
    public final void mo62848aW() {
        if (this.f79945E.getCount() == 0) {
            DmtStatusView o = mo62895o(true);
            if (o != null) {
                o.setVisibility(0);
                o.mo19213g();
            }
            mo62843aR();
            if (mo62864bd()) {
                C47718bf.m103288a(new C30315ag(null));
            }
        }
    }

    /* renamed from: ab */
    public final void mo60510ab() {
        View m = mo62893m(true);
        if (m != null) {
            m.setVisibility(0);
            m.setScaleX(2.5f);
            m.setScaleY(2.5f);
            m.animate().alpha(1.0f).scaleX(1.0f).scaleY(1.0f).setDuration(100).start();
            m.setSelected(false);
        }
    }

    /* renamed from: aw */
    public final void mo62854aw() {
        super.mo62854aw();
        if (this.f79947G != null) {
            this.f79947G.removeCallbacksAndMessages(null);
        }
        this.f79988af = null;
        if (this.f80018k != null) {
            this.f80018k.mo63824a();
        }
        C47718bf.m103291d(this);
        if (this.f80022p != null) {
            this.f80022p.mo62798d();
        }
        if (this.f80000ar != null && this.f80000ar.mo86222f()) {
            this.f80000ar.mo86217d(false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: bt */
    public final /* synthetic */ void mo62876bt() {
        if (this.f121964aK != null && !this.f121964aK.isFinishing() && mo62868bh()) {
            try {
                this.f80017j.showAtLocation(this.f79944D, 17, 0, 0);
                C30133aj.m70706a().edit().putBoolean("hasShowUnloginDiggToast", true).apply();
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: aK */
    public final C30016ag mo62836aK() {
        if (this.f80030y == null) {
            return null;
        }
        if (mo62824a(this.f80030y.getCurrentItem(), this.f80015h)) {
            return this.f80015h;
        }
        for (int childCount = this.f80030y.getChildCount() - 1; childCount >= 0; childCount--) {
            C30016ag agVar = (C30016ag) this.f80030y.getChildAt(childCount).getTag(R.id.aeh);
            if (mo62824a(this.f80030y.getCurrentItem(), agVar)) {
                return agVar;
            }
        }
        return null;
    }

    /* renamed from: ad */
    public final void mo60512ad() {
        boolean z;
        if (!C36605dw.m82471a().getBoolean("hasFollowGuideShown", false) && !this.f79996an && !this.f79994al && !this.f79999aq) {
            C30016ag aK = mo62836aK();
            if (aK == null || aK.mo53999e() == null || !aK.mo53999e().isAd()) {
                z = false;
            } else {
                z = true;
            }
            if (!z) {
                IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
                if (baseUserService_Monster != null) {
                    User currentUser = baseUserService_Monster.getCurrentUser();
                    if (currentUser != null && currentUser.getFollowingCount() > 0) {
                        return;
                    }
                }
                if (!this.f80000ar.mo86209a("gif_download_dialog") && !this.f80000ar.mo86222f() && !C47915gg.m103651b() && this.f79962V != null && C30289j.m71208b(true)) {
                    C30289j.m71207a(false);
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: ay */
    public final void mo62856ay() {
        boolean z;
        if (!mo55835w() || (!this.f79952L && !mo49942a(this.f79945E.mo60285c(this.f79946F)))) {
            z = true;
        } else {
            z = false;
        }
        if (z || !this.f80021o) {
            if (mo62836aK() != null && !C26503d.m64070m(C31186b.m72813b(mo62890j(true)))) {
                C26235d.m63570a(C31186b.m72813b(mo62890j(true)));
            }
            mo62826aA();
            VerticalViewPager verticalViewPager = this.f80030y;
            View view = this.f79941A;
            View view2 = this.f79942B;
            Activity activity = this.f121964aK;
            C30634d dVar = new C30634d(this);
            if (C22453b.m55510c()) {
                C22460d dVar2 = new C22460d(activity, 58, verticalViewPager, view2, view, dVar);
                C18842a.m45932a(dVar2);
                return;
            }
            C22459c cVar = new C22459c(activity, verticalViewPager, view2, 47, dVar);
            C18842a.m45932a(cVar);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: az */
    public final void mo62857az() {
        boolean z;
        if (mo55835w()) {
            Aweme c = this.f79945E.mo60285c(this.f79946F);
            int e = C22453b.m55513e();
            int d = C22453b.m55511d();
            int c2 = C23724k.m58225c();
            boolean z2 = true;
            if (e == 0) {
                z = false;
            } else {
                z = true;
            }
            if (d != 0) {
                z2 = false;
            }
            if (mo49942a(c)) {
                if (z) {
                    this.f79942B.getLayoutParams().height = 0;
                    this.f79942B.requestLayout();
                }
                if (z2) {
                    this.f79941A.getLayoutParams().height = c2;
                    this.f79941A.requestLayout();
                }
            } else {
                if (this.f79942B.getHeight() != C22453b.m55513e() && z) {
                    this.f79942B.getLayoutParams().height = C22453b.m55513e();
                    this.f79942B.requestLayout();
                }
                if (z2) {
                    this.f79941A.getLayoutParams().height = d;
                    this.f79941A.requestLayout();
                }
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: bu */
    public final /* synthetic */ void mo62877bu() {
        aA_();
        this.f80021o = true;
        mo60508a((Runnable) new C30642l(this), 0);
        if (this.f79969aB != 4) {
            if (C22453b.m55511d() > 0) {
                m71645a(this.f79953M, C22453b.m55511d());
                m71645a((View) this.f79955O, -2);
            } else {
                m71645a((View) this.f79955O, 0);
            }
            if (C22453b.m55513e() > 0) {
                m71645a(this.f79954N, C22453b.m55513e());
                m71645a((View) this.f79956P, -2);
            } else {
                m71645a((View) this.f79956P, 0);
            }
        } else {
            m71645a((View) this.f79955O, 0);
            m71645a((View) this.f79956P, 0);
        }
        mo55810j();
    }

    /* renamed from: m */
    public void mo55813m() {
        C30200o oVar = this.f79988af;
        oVar.f78852u = false;
        if (oVar.f78857z) {
            oVar.f78857z = false;
            C30016ag a = oVar.mo60527a();
            if (C31186b.m72817e(a) && !TextUtils.equals(oVar.mo60476k(), "general_search")) {
                Aweme e = a.mo53999e();
                C25908e a2 = C30200o.m70859a(a);
                if (!(e == null || a2 == null || oVar.f78851t)) {
                    oVar.mo60544l();
                    long n = oVar.mo60546n();
                    String aid = e.getAid();
                    int i = oVar.f78845n + 1;
                    if (a2.f68448c != null) {
                        a2.f68448c.mo53176a(a2.f68447b, a2.f68446a, aid, n, i);
                    }
                }
                C47718bf.m103288a(new C30339h());
            }
        }
        C30016ag aK = mo62836aK();
        if (aK != null) {
            aK.aw_();
        }
        if (this.f80030y != null) {
            VerticalViewPager verticalViewPager = this.f80030y;
            if (verticalViewPager.f71012e != null) {
                verticalViewPager.f71012e.clear();
            }
        }
        super.mo55813m();
        if (this.f80009b != null) {
            this.f80009b.mo46991S_();
        }
        if (this.f79961U != null) {
            this.f79961U.mo66347S_();
        }
        if (mo62781ar().mo95287b((C38871j) this.f79988af)) {
            mo62781ar().mo95284a((C38871j) null);
        }
        C48039k.m104036a();
        if (this.f80017j != null) {
            this.f80017j.mo63576a();
            this.f80017j = null;
        }
        C26432bq a3 = C26432bq.m63915a();
        a3.f69689e = null;
        a3.f69686b = null;
        a3.f69685a.removeCallbacks(a3.f69690f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:34:0x00c0, code lost:
        if (r1 == false) goto L_0x00c2;
     */
    /* renamed from: aE */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo62830aE() {
        /*
            r11 = this;
            super.mo62830aE()
            r0 = 1
            r11.f80006ax = r0
            com.ss.android.ugc.aweme.feed.e.o r1 = r11.f79988af
            r2 = 0
            r1.f78824a = r2
            long r3 = android.os.SystemClock.elapsedRealtime()
            r1.f78843l = r3
            long r3 = java.lang.System.currentTimeMillis()
            r1.f78842k = r3
            com.bytedance.ies.abmock.b r5 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.video.experiment.GatherModeExperiment> r6 = com.p683ss.android.ugc.aweme.video.experiment.GatherModeExperiment.class
            java.lang.String r8 = "gather_mode"
            r7 = 1
            r9 = 31744(0x7c00, float:4.4483E-41)
            r10 = 0
            int r1 = r5.mo18168a(r6, r7, r8, r9, r10)
            if (r1 == 0) goto L_0x003c
            android.content.Context r1 = r11.mo96010bw()
            com.ss.android.ugc.aweme.video.m r1 = com.p683ss.android.ugc.aweme.video.C48065m.m104081a(r1)
            android.telephony.TelephonyManager r3 = r1.f120788b
            if (r3 == 0) goto L_0x003c
            android.telephony.TelephonyManager r3 = r1.f120788b
            android.telephony.PhoneStateListener r1 = r1.f120789c
            r3.listen(r1, r2)
        L_0x003c:
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.CellInfoEnableExperiment> r5 = com.p683ss.android.ugc.aweme.experiment.CellInfoEnableExperiment.class
            r6 = 1
            java.lang.String r7 = "enable_cellinfo_report"
            r8 = 31744(0x7c00, float:4.4483E-41)
            r9 = 0
            boolean r1 = r4.mo18172a(r5, r6, r7, r8, r9)
            if (r1 == 0) goto L_0x0074
            android.content.Context r1 = r11.mo96010bw()
            com.ss.android.ugc.aweme.video.l r1 = com.p683ss.android.ugc.aweme.video.C48040l.m104041a(r1)
            android.telephony.TelephonyManager r3 = r1.f120728d
            if (r3 == 0) goto L_0x0068
            com.ss.android.ugc.aweme.video.l r4 = com.p683ss.android.ugc.aweme.video.C48040l.f120723g
            android.telephony.PhoneStateListener r4 = (android.telephony.PhoneStateListener) r4
            r3.listen(r4, r2)
            com.ss.android.ugc.aweme.video.l$b r4 = r1.f120729e
            android.telephony.PhoneStateListener r4 = (android.telephony.PhoneStateListener) r4
            r3.listen(r4, r2)
        L_0x0068:
            android.telephony.TelephonyManager r3 = r1.f120727c
            if (r3 == 0) goto L_0x0072
            r4 = r1
            android.telephony.PhoneStateListener r4 = (android.telephony.PhoneStateListener) r4
            r3.listen(r4, r2)
        L_0x0072:
            r1.f120726b = r2
        L_0x0074:
            com.ss.android.ugc.aweme.feed.adapter.b r1 = r11.f79945E
            if (r1 == 0) goto L_0x00c2
            java.lang.String r1 = r11.ay_()
            com.ss.android.ugc.aweme.main.k r3 = com.p683ss.android.ugc.aweme.C23794bh.m58388b()
            boolean r3 = r3.mo75669a()
            if (r3 != 0) goto L_0x008e
            java.lang.String r3 = "homepage_follow"
            boolean r3 = r3.equalsIgnoreCase(r1)
            if (r3 != 0) goto L_0x00bf
        L_0x008e:
            boolean r3 = com.p683ss.android.ugc.aweme.feed.utils.C31202n.m72858a()
            if (r3 == 0) goto L_0x009c
            java.lang.String r3 = "homepage_fresh"
            boolean r3 = r3.equalsIgnoreCase(r1)
            if (r3 != 0) goto L_0x00bf
        L_0x009c:
            java.lang.String r3 = "poi_page"
            boolean r3 = r3.equalsIgnoreCase(r1)
            if (r3 != 0) goto L_0x00bf
            java.lang.String r3 = "trending_page"
            boolean r3 = r3.equalsIgnoreCase(r1)
            if (r3 != 0) goto L_0x00bf
            java.lang.String r3 = "search_result"
            boolean r3 = r3.equalsIgnoreCase(r1)
            if (r3 != 0) goto L_0x00bf
            java.lang.String r3 = "general_search"
            boolean r1 = r3.equalsIgnoreCase(r1)
            if (r1 == 0) goto L_0x00bd
            goto L_0x00bf
        L_0x00bd:
            r1 = 0
            goto L_0x00c0
        L_0x00bf:
            r1 = 1
        L_0x00c0:
            if (r1 != 0) goto L_0x00cb
        L_0x00c2:
            com.ss.android.ugc.aweme.video.k r1 = com.p683ss.android.ugc.aweme.video.C48039k.m104036a()
            com.ss.android.ugc.aweme.feed.e.o r3 = r11.f79988af
            r1.mo95303a(r3)
        L_0x00cb:
            com.ss.android.ugc.aweme.feed.adapter.ag r1 = r11.mo62836aK()
            if (r1 != 0) goto L_0x00f1
            r3 = 6
            java.lang.String r4 = f79940u
            java.lang.StringBuilder r5 = new java.lang.StringBuilder
            java.lang.String r6 = "onPause called->viewHolder is null,itemCount:"
            r5.<init>(r6)
            int r6 = r11.mo60521am()
            r5.append(r6)
            java.lang.String r6 = ".maybe cause bug:"
            r5.append(r6)
            r5.append(r11)
            java.lang.String r5 = r5.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75141a(r3, r4, r5)
        L_0x00f1:
            boolean r3 = com.p683ss.android.ugc.aweme.feed.utils.C31186b.m72817e(r1)
            if (r3 == 0) goto L_0x011e
            java.lang.String r3 = "onPause"
            com.p683ss.android.ugc.aweme.feed.utils.C31203o.m72859a(r3)
            r11.m71663f()
            boolean r3 = r11.mo62963bx()
            if (r3 == 0) goto L_0x011e
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.video.experiment.EnableTextureKeepExperiment> r5 = com.p683ss.android.ugc.aweme.video.experiment.EnableTextureKeepExperiment.class
            r6 = 1
            java.lang.String r7 = "player_surfacetexture_keep"
            r8 = 31744(0x7c00, float:4.4483E-41)
            r9 = 1
            int r3 = r4.mo18168a(r5, r6, r7, r8, r9)
            if (r3 != r0) goto L_0x011e
            com.ss.android.ugc.aweme.feed.adapter.ae r3 = r1.mo54004j()
            r3.mo60240h(r0)
        L_0x011e:
            if (r1 == 0) goto L_0x012d
            r1.mo54000f()
            boolean r0 = r11.mo62963bx()
            if (r0 == 0) goto L_0x012d
            r0 = 2
            r1.mo60223b(r0)
        L_0x012d:
            boolean r0 = r11.mo62963bx()
            if (r0 == 0) goto L_0x013a
            com.ss.android.ugc.aweme.video.preload.j r0 = com.p683ss.android.ugc.aweme.video.preload.C48107j.m104193f()
            r0.mo95348b()
        L_0x013a:
            r0 = 0
            r11.mo62884f(r0)
            r11.mo55828p()
            long r0 = r11.f80027v
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 == 0) goto L_0x017a
            long r0 = android.os.SystemClock.elapsedRealtime()
            long r3 = r11.f80027v
            long r0 = r0 - r3
            com.ss.android.ugc.aweme.common.MobClick r3 = com.p683ss.android.ugc.aweme.common.MobClick.obtain()
            java.lang.String r4 = "video_request_leave"
            com.ss.android.ugc.aweme.common.MobClick r3 = r3.setEventName(r4)
            java.lang.String r4 = "perf_monitor"
            com.ss.android.ugc.aweme.common.MobClick r3 = r3.setLabelName(r4)
            com.ss.android.ugc.aweme.common.j r4 = new com.ss.android.ugc.aweme.common.j
            r4.<init>()
            java.lang.String r5 = "duration"
            java.lang.String r0 = java.lang.String.valueOf(r0)
            com.ss.android.ugc.aweme.common.j r0 = r4.mo54849a(r5, r0)
            org.json.JSONObject r0 = r0.mo54850a()
            com.ss.android.ugc.aweme.common.MobClick r0 = r3.setJsonObject(r0)
            com.p683ss.android.ugc.aweme.common.C26890h.onEvent(r0)
        L_0x017a:
            boolean r0 = r11.mo62852ap()
            if (r0 == 0) goto L_0x0189
            java.lang.String r0 = r11.f80002at
            com.ss.android.ugc.aweme.newfollow.util.d r0 = com.p683ss.android.ugc.aweme.newfollow.util.C37934d.m84797a(r0)
            r0.mo77400e()
        L_0x0189:
            com.ss.android.ugc.aweme.feed.ui.landscape.c r0 = r11.f80018k
            if (r0 == 0) goto L_0x0192
            com.ss.android.ugc.aweme.feed.ui.landscape.c r0 = r11.f80018k
            r0.mo63824a()
        L_0x0192:
            com.ss.android.ugc.aweme.ug.guide.l r0 = r11.f79977aJ
            if (r0 == 0) goto L_0x019b
            com.ss.android.ugc.aweme.ug.guide.l r0 = r11.f79977aJ
            r0.mo94749c()
        L_0x019b:
            com.p683ss.android.ugc.aweme.feed.helper.C30368h.m71290a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.panel.C30616b.mo62830aE():void");
    }

    /* renamed from: aX */
    public final void mo62849aX() {
        int[] iArr;
        if (mo62868bh() && !C23794bh.m58390d().mo47103a() && this.f80004av && mo62835aJ() && !this.f80000ar.mo86209a("download_dialog")) {
            if ((mo60519ak() == null || !mo60519ak().isLive()) && C10181b.m20511a().mo18168a(EnableFollowHintGuideExperiment.class, true, "enable_follow_hint_guid", 31744, 1) == 1) {
                BusinessComponentServiceUtils.getBusinessBridgeService().mo49724b();
                if (this.f79962V != null && !((Boolean) SharePrefCache.inst().getFollowGuideShown().mo47782d()).booleanValue()) {
                    C30016ag aK = mo62836aK();
                    if ((aK == null || !C26235d.m63571b(aK.mo53999e())) && aK != null && !C31190f.m72831a(aK.mo53999e())) {
                        C30015af aM = mo62838aM();
                        if (aM == null) {
                            iArr = null;
                        } else {
                            iArr = aM.mo60191S();
                        }
                        if (iArr != null) {
                            if (C47918gj.m103682a(mo96010bw())) {
                                this.f79962V.mo18998a(this.f79944D, 5, iArr[0] + ((int) C9432q.m18687b(mo96010bw(), 40.0f)), iArr[1] - ((int) C9432q.m18687b(mo96010bw(), 45.0f)), (float) ((this.f79962V.mo19002c() / 2) + ((int) C9432q.m18687b(mo96010bw(), 4.0f))));
                            } else {
                                this.f79962V.mo18998a(this.f79944D, 3, (iArr[0] - this.f79962V.mo19003d()) - ((int) C9432q.m18687b(mo96010bw(), 10.0f)), (iArr[1] - (this.f79962V.mo19002c() / 2)) - ((int) C9432q.m18687b(mo96010bw(), 12.0f)), (float) ((this.f79962V.mo19002c() / 2) + ((int) C9432q.m18687b(mo96010bw(), 4.0f))));
                            }
                            this.f79962V.setOnDismissListener(new OnDismissListener() {
                                public final void onDismiss() {
                                    C30616b.this.f79999aq = false;
                                    C30616b.this.f80000ar.mo86214c(C30616b.this.f79999aq);
                                }
                            });
                            this.f79999aq = true;
                            this.f80000ar.mo86214c(this.f79999aq);
                            C26890h.m65011a("follow_hint_guide_show ", C23089d.m56640a().f61491a);
                            C26890h.m65011a("new_user_guide_show", C23089d.m56640a().mo47829a("guide_type", "follow").f61491a);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Can't wrap try/catch for region: R(5:17|18|19|20|(3:22|(1:24)|45)(2:25|26)) */
    /* JADX WARNING: Missing exception handler attribute for start block: B:19:0x0086 */
    /* JADX WARNING: Removed duplicated region for block: B:22:0x0090 A[Catch:{ Exception -> 0x00fd }] */
    /* JADX WARNING: Removed duplicated region for block: B:25:0x009f A[Catch:{ Exception -> 0x00fd }] */
    /* renamed from: l */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void mo55812l() {
        /*
            r10 = this;
            super.mo55812l()
            long r0 = r10.m71642a()
            com.p683ss.android.ugc.aweme.video.C48039k.m104037a(r0)
            com.ss.android.ugc.aweme.feed.e.o r0 = r10.f79988af
            r1 = 1
            r0.f78824a = r1
            com.bytedance.ies.abmock.b r2 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.video.experiment.GatherModeExperiment> r3 = com.p683ss.android.ugc.aweme.video.experiment.GatherModeExperiment.class
            java.lang.String r5 = "gather_mode"
            r4 = 1
            r6 = 31744(0x7c00, float:4.4483E-41)
            r7 = 0
            int r0 = r2.mo18168a(r3, r4, r5, r6, r7)
            r2 = 256(0x100, float:3.59E-43)
            if (r0 == 0) goto L_0x0041
            android.content.Context r0 = r10.mo96010bw()
            com.ss.android.ugc.aweme.video.m r0 = com.p683ss.android.ugc.aweme.video.C48065m.m104081a(r0)
            android.telephony.TelephonyManager r3 = r0.f120788b
            if (r3 == 0) goto L_0x0041
            android.telephony.PhoneStateListener r3 = r0.f120789c
            if (r3 != 0) goto L_0x003a
            com.ss.android.ugc.aweme.video.m$1 r3 = new com.ss.android.ugc.aweme.video.m$1
            r3.<init>()
            r0.f120789c = r3
        L_0x003a:
            android.telephony.TelephonyManager r3 = r0.f120788b
            android.telephony.PhoneStateListener r0 = r0.f120789c
            r3.listen(r0, r2)
        L_0x0041:
            com.bytedance.ies.abmock.b r4 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.CellInfoEnableExperiment> r5 = com.p683ss.android.ugc.aweme.experiment.CellInfoEnableExperiment.class
            r6 = 1
            java.lang.String r7 = "enable_cellinfo_report"
            r8 = 31744(0x7c00, float:4.4483E-41)
            r9 = 0
            boolean r0 = r4.mo18172a(r5, r6, r7, r8, r9)
            if (r0 == 0) goto L_0x00ff
            android.content.Context r0 = r10.mo96010bw()
            com.ss.android.ugc.aweme.video.l r0 = com.p683ss.android.ugc.aweme.video.C48040l.m104041a(r0)
            boolean r3 = r0.f120726b
            if (r3 != 0) goto L_0x00ff
            com.ss.android.ugc.aweme.player.b.a r3 = new com.ss.android.ugc.aweme.player.b.a     // Catch:{ Exception -> 0x00fd }
            r3.<init>()     // Catch:{ Exception -> 0x00fd }
            r0.f120730f = r3     // Catch:{ Exception -> 0x00fd }
            com.ss.android.ugc.aweme.utils.dz r3 = com.p683ss.android.ugc.aweme.utils.C47837dz.f120398b     // Catch:{ Exception -> 0x00fd }
            android.content.Context r4 = r0.f120725a     // Catch:{ Exception -> 0x00fd }
            int r3 = r3.mo95067b(r4)     // Catch:{ Exception -> 0x00fd }
            android.content.Context r4 = r0.f120725a     // Catch:{ Exception -> 0x00fd }
            boolean r4 = com.p683ss.android.ugc.aweme.utils.C47837dz.m103477a(r4)     // Catch:{ Exception -> 0x00fd }
            r5 = 21
            if (r4 == 0) goto L_0x00a7
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00fd }
            if (r4 >= r5) goto L_0x00a7
            com.ss.android.ugc.aweme.video.l$d r4 = new com.ss.android.ugc.aweme.video.l$d     // Catch:{ Throwable -> 0x0086 }
            r4.<init>(r0)     // Catch:{ Throwable -> 0x0086 }
            r4.mo95311a(r0, r3)     // Catch:{ Throwable -> 0x0086 }
            goto L_0x00fd
        L_0x0086:
            android.content.Context r3 = r0.f120725a     // Catch:{ Exception -> 0x00fd }
            java.lang.String r4 = "phone"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x00fd }
            if (r3 == 0) goto L_0x009f
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Exception -> 0x00fd }
            r0.f120727c = r3     // Catch:{ Exception -> 0x00fd }
            android.telephony.TelephonyManager r3 = r0.f120727c     // Catch:{ Exception -> 0x00fd }
            if (r3 == 0) goto L_0x00fd
            r4 = r0
            android.telephony.PhoneStateListener r4 = (android.telephony.PhoneStateListener) r4     // Catch:{ Exception -> 0x00fd }
            r3.listen(r4, r2)     // Catch:{ Exception -> 0x00fd }
            goto L_0x00fd
        L_0x009f:
            d.u r2 = new d.u     // Catch:{ Exception -> 0x00fd }
            java.lang.String r3 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r2.<init>(r3)     // Catch:{ Exception -> 0x00fd }
            throw r2     // Catch:{ Exception -> 0x00fd }
        L_0x00a7:
            android.content.Context r4 = r0.f120725a     // Catch:{ Exception -> 0x00fd }
            boolean r4 = com.p683ss.android.ugc.aweme.utils.C47837dz.m103477a(r4)     // Catch:{ Exception -> 0x00fd }
            if (r4 == 0) goto L_0x00dc
            int r4 = android.os.Build.VERSION.SDK_INT     // Catch:{ Exception -> 0x00fd }
            if (r4 < r5) goto L_0x00dc
            com.ss.android.ugc.aweme.video.l$b r4 = new com.ss.android.ugc.aweme.video.l$b     // Catch:{ Exception -> 0x00fd }
            r4.<init>(r3)     // Catch:{ Exception -> 0x00fd }
            r0.f120729e = r4     // Catch:{ Exception -> 0x00fd }
            android.content.Context r3 = r0.f120725a     // Catch:{ Exception -> 0x00fd }
            java.lang.String r4 = "phone"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x00fd }
            if (r3 == 0) goto L_0x00d4
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Exception -> 0x00fd }
            r0.f120728d = r3     // Catch:{ Exception -> 0x00fd }
            android.telephony.TelephonyManager r3 = r0.f120728d     // Catch:{ Exception -> 0x00fd }
            if (r3 == 0) goto L_0x00fd
            com.ss.android.ugc.aweme.video.l$b r4 = r0.f120729e     // Catch:{ Exception -> 0x00fd }
            android.telephony.PhoneStateListener r4 = (android.telephony.PhoneStateListener) r4     // Catch:{ Exception -> 0x00fd }
            r3.listen(r4, r2)     // Catch:{ Exception -> 0x00fd }
            goto L_0x00fd
        L_0x00d4:
            d.u r2 = new d.u     // Catch:{ Exception -> 0x00fd }
            java.lang.String r3 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r2.<init>(r3)     // Catch:{ Exception -> 0x00fd }
            throw r2     // Catch:{ Exception -> 0x00fd }
        L_0x00dc:
            android.content.Context r3 = r0.f120725a     // Catch:{ Exception -> 0x00fd }
            java.lang.String r4 = "phone"
            java.lang.Object r3 = r3.getSystemService(r4)     // Catch:{ Exception -> 0x00fd }
            if (r3 == 0) goto L_0x00f5
            android.telephony.TelephonyManager r3 = (android.telephony.TelephonyManager) r3     // Catch:{ Exception -> 0x00fd }
            r0.f120727c = r3     // Catch:{ Exception -> 0x00fd }
            android.telephony.TelephonyManager r3 = r0.f120727c     // Catch:{ Exception -> 0x00fd }
            if (r3 == 0) goto L_0x00fd
            r4 = r0
            android.telephony.PhoneStateListener r4 = (android.telephony.PhoneStateListener) r4     // Catch:{ Exception -> 0x00fd }
            r3.listen(r4, r2)     // Catch:{ Exception -> 0x00fd }
            goto L_0x00fd
        L_0x00f5:
            d.u r2 = new d.u     // Catch:{ Exception -> 0x00fd }
            java.lang.String r3 = "null cannot be cast to non-null type android.telephony.TelephonyManager"
            r2.<init>(r3)     // Catch:{ Exception -> 0x00fd }
            throw r2     // Catch:{ Exception -> 0x00fd }
        L_0x00fd:
            r0.f120726b = r1
        L_0x00ff:
            r0 = 0
            android.view.View r2 = r10.mo62893m(r0)
            if (r2 == 0) goto L_0x010a
            r3 = 0
            r2.setAlpha(r3)
        L_0x010a:
            com.ss.android.ugc.aweme.feed.adapter.ag r2 = r10.mo62836aK()
            if (r2 == 0) goto L_0x0117
            r2.mo54002h()
            r3 = 2
            r2.mo60227c(r3)
        L_0x0117:
            com.ss.android.ugc.aweme.feed.ui.landscape.c r2 = r10.f80018k
            if (r2 == 0) goto L_0x0151
            com.ss.android.ugc.aweme.feed.ui.landscape.c r2 = r10.f80018k
            com.ss.android.ugc.aweme.feed.ui.landscape.c$c r3 = r2.f81263c
            if (r3 == 0) goto L_0x0151
            android.hardware.Sensor r3 = r2.f81267g
            if (r3 != 0) goto L_0x0129
            android.hardware.Sensor r3 = r2.f81266f
            if (r3 == 0) goto L_0x0151
        L_0x0129:
            boolean r3 = r2.f81264d
            if (r3 != 0) goto L_0x0151
            r2.f81264d = r1
            r2.f81268h = r0
            android.hardware.Sensor r3 = r2.f81266f
            if (r3 == 0) goto L_0x0143
            android.hardware.SensorManager r3 = r2.f81261a
            if (r3 == 0) goto L_0x0143
            com.ss.android.ugc.aweme.feed.ui.landscape.c$c r4 = r2.f81263c
            android.hardware.SensorEventListener r4 = (android.hardware.SensorEventListener) r4
            android.hardware.Sensor r5 = r2.f81266f
            r6 = 3
            r3.registerListener(r4, r5, r6)
        L_0x0143:
            android.os.Handler r3 = r2.f81269i
            com.ss.android.ugc.aweme.feed.ui.landscape.c$d r4 = new com.ss.android.ugc.aweme.feed.ui.landscape.c$d
            r4.<init>(r2)
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            r5 = 1000(0x3e8, double:4.94E-321)
            r3.postDelayed(r4, r5)
        L_0x0151:
            com.ss.android.ugc.aweme.ug.guide.l r2 = r10.f79977aJ
            if (r2 == 0) goto L_0x016e
            int r2 = r10.f80020n
            int r3 = r2 + 1
            r10.f80020n = r3
            if (r2 == 0) goto L_0x016e
            boolean r2 = r10.f80004av
            if (r2 == 0) goto L_0x016e
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r2 = r10.f80030y
            int r2 = r2.getChildCount()
            if (r2 == 0) goto L_0x016e
            com.ss.android.ugc.aweme.ug.guide.l r2 = r10.f79977aJ
            r2.mo94750d()
        L_0x016e:
            r10.f80006ax = r0
            com.p683ss.android.ugc.aweme.feed.helper.C30368h.m71290a(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.panel.C30616b.mo55812l():void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:39:0x00d9  */
    /* renamed from: ag */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60515ag() {
        /*
            r19 = this;
            r0 = r19
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r1 = r0.f80030y
            if (r1 == 0) goto L_0x0277
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r1 = r0.f80030y
            int r1 = r1.getChildCount()
            if (r1 == 0) goto L_0x0277
            com.ss.android.ugc.aweme.ug.guide.d r1 = r0.f79976aI
            r2 = 1
            r3 = 0
            if (r1 != 0) goto L_0x004b
            android.view.ViewGroup r1 = r19.mo55773B()
            if (r1 == 0) goto L_0x004b
            com.ss.android.ugc.aweme.ug.guide.d r1 = new com.ss.android.ugc.aweme.ug.guide.d
            android.view.ViewGroup r5 = r19.mo55773B()
            com.ss.android.ugc.aweme.common.widget.VerticalViewPager r6 = r0.f80030y
            java.lang.String r7 = r0.f79981aO
            java.lang.String r4 = "from_tutorial_detail"
            java.lang.String r8 = r19.mo62871bk()
            boolean r4 = r4.equals(r8)
            if (r4 != 0) goto L_0x003a
            com.ss.android.ugc.aweme.ug.guide.j$a r4 = com.p683ss.android.ugc.aweme.p2377ug.guide.C47464j.f119726b
            boolean r4 = r4.mo94744b()
            if (r4 == 0) goto L_0x003a
            r8 = 1
            goto L_0x003b
        L_0x003a:
            r8 = 0
        L_0x003b:
            java.lang.String r4 = r19.ay_()
            java.lang.String r9 = "homepage_hot"
            boolean r9 = android.text.TextUtils.equals(r4, r9)
            r4 = r1
            r4.<init>(r5, r6, r7, r8, r9)
            r0.f79976aI = r1
        L_0x004b:
            com.ss.android.ugc.aweme.ug.guide.d r1 = r0.f79976aI
            if (r1 == 0) goto L_0x0277
            com.ss.android.ugc.aweme.ug.guide.d r1 = r0.f79976aI
            android.view.View r4 = r1.f119706e
            r5 = 1101004800(0x41a00000, float:20.0)
            r6 = 2132024135(0x7f141b47, float:1.9686738E38)
            r7 = 0
            if (r4 != 0) goto L_0x00ff
            boolean r4 = r1.f119704b
            r8 = 2132214349(0x7f17024d, float:2.0072537E38)
            if (r4 == 0) goto L_0x0077
            java.lang.Class<com.ss.android.ugc.aweme.lego.inflate.SwipUpGuideInflate> r4 = com.p683ss.android.ugc.aweme.lego.inflate.SwipUpGuideInflate.class
            java.lang.Object r4 = com.p683ss.android.ugc.aweme.lego.C35857a.m81002b(r4)
            com.ss.android.ugc.aweme.lego.inflate.SwipUpGuideInflate r4 = (com.p683ss.android.ugc.aweme.lego.inflate.SwipUpGuideInflate) r4
            android.view.View r9 = r1.f93669c
            android.content.Context r9 = r9.getContext()
            android.view.View r4 = r4.getView(r9, r8)
            r1.f119706e = r4
            goto L_0x0089
        L_0x0077:
            android.view.View r4 = r1.f93669c
            android.content.Context r4 = r4.getContext()
            android.view.LayoutInflater r4 = android.view.LayoutInflater.from(r4)
            android.view.ViewGroup r9 = r1.f119709h
            android.view.View r4 = r4.inflate(r8, r9, r3)
            r1.f119706e = r4
        L_0x0089:
            android.view.View r4 = r1.f119706e
            if (r4 == 0) goto L_0x00f7
            com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout r4 = (com.p683ss.android.ugc.aweme.p2377ug.guide.SwipeUpGuideStrengthenLayout) r4
            r1.f119708g = r4
            com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout r4 = r1.f119708g
            if (r4 == 0) goto L_0x00a6
            com.ss.android.ugc.aweme.common.widget.a r8 = r1.f119710i
            r4.setViewPager(r8)
            java.lang.StringBuilder r4 = new java.lang.StringBuilder
            java.lang.String r8 = "viewPager "
            r4.<init>(r8)
            com.ss.android.ugc.aweme.common.widget.a r8 = r1.f119710i
            r4.append(r8)
        L_0x00a6:
            android.view.View r4 = r1.f119706e
            if (r4 == 0) goto L_0x00b1
            android.view.View r4 = r4.findViewById(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
            goto L_0x00b2
        L_0x00b1:
            r4 = r7
        L_0x00b2:
            r8 = r4
            android.widget.TextView r8 = (android.widget.TextView) r8
            android.view.View r8 = r1.f93669c
            android.content.Context r8 = r8.getContext()
            java.lang.String r9 = "container.context"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r9)
            java.lang.String r9 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r8, r9)
            if (r4 == 0) goto L_0x00d6
            java.lang.CharSequence r8 = r4.getText()
            if (r8 == 0) goto L_0x00d6
            int r8 = r8.length()
            java.lang.Integer r8 = java.lang.Integer.valueOf(r8)
            goto L_0x00d7
        L_0x00d6:
            r8 = r7
        L_0x00d7:
            if (r8 == 0) goto L_0x00ff
            java.lang.Number r8 = (java.lang.Number) r8
            int r8 = r8.intValue()
            r9 = 20
            if (r8 > 0) goto L_0x00e4
            goto L_0x00e6
        L_0x00e4:
            if (r9 >= r8) goto L_0x00ff
        L_0x00e6:
            r10 = 40
            if (r9 <= r8) goto L_0x00eb
            goto L_0x00f3
        L_0x00eb:
            if (r10 < r8) goto L_0x00f3
            r8 = 1103626240(0x41c80000, float:25.0)
            r4.setTextSize(r8)
            goto L_0x00ff
        L_0x00f3:
            r4.setTextSize(r5)
            goto L_0x00ff
        L_0x00f7:
            d.u r1 = new d.u
            java.lang.String r2 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.ug.guide.SwipeUpGuideStrengthenLayout"
            r1.<init>(r2)
            throw r1
        L_0x00ff:
            android.view.View r4 = r1.f119706e
            if (r4 == 0) goto L_0x0108
            android.view.ViewParent r4 = r4.getParent()
            goto L_0x0109
        L_0x0108:
            r4 = r7
        L_0x0109:
            if (r4 != 0) goto L_0x0112
            android.view.ViewGroup r4 = r1.f119709h
            android.view.View r8 = r1.f119706e
            r4.addView(r8)
        L_0x0112:
            android.view.View r4 = r1.f119706e
            if (r4 == 0) goto L_0x011d
            android.view.View r4 = r4.findViewById(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r4 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r4
            goto L_0x011e
        L_0x011d:
            r4 = r7
        L_0x011e:
            android.view.View r6 = r1.f119706e
            if (r6 == 0) goto L_0x012c
            r7 = 2132024137(0x7f141b49, float:1.9686742E38)
            android.view.View r6 = r6.findViewById(r7)
            r7 = r6
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r7
        L_0x012c:
            boolean r6 = r1.f119713l
            com.bytedance.ies.abmock.b r8 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.FeedSwipeGuideType> r9 = com.p683ss.android.ugc.aweme.experiment.FeedSwipeGuideType.class
            r10 = 1
            java.lang.String r11 = "feed_swipe_up_type"
            r12 = 31744(0x7c00, float:4.4483E-41)
            r13 = 0
            int r8 = r8.mo18168a(r9, r10, r11, r12, r13)
            if (r8 != 0) goto L_0x0142
            r8 = 1
            goto L_0x0143
        L_0x0142:
            r8 = 0
        L_0x0143:
            r10 = 300(0x12c, double:1.48E-321)
            r12 = 0
            if (r8 != 0) goto L_0x022d
            if (r6 == 0) goto L_0x022d
            if (r4 == 0) goto L_0x022d
            if (r7 != 0) goto L_0x0150
            goto L_0x022d
        L_0x0150:
            r6 = 2132545045(0x7f1c0e15, float:2.0743269E38)
            r4.setText(r6)
            com.bytedance.ies.abmock.b r13 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.experiment.FeedSwipeGuideType> r14 = com.p683ss.android.ugc.aweme.experiment.FeedSwipeGuideType.class
            r15 = 1
            java.lang.String r16 = "feed_swipe_up_type"
            r17 = 31744(0x7c00, float:4.4483E-41)
            r18 = 0
            int r6 = r13.mo18168a(r14, r15, r16, r17, r18)
            if (r6 != r2) goto L_0x016b
            r6 = 1
            goto L_0x016c
        L_0x016b:
            r6 = 0
        L_0x016c:
            if (r6 == 0) goto L_0x0172
            r6 = 2132545033(0x7f1c0e09, float:2.0743244E38)
            goto L_0x0175
        L_0x0172:
            r6 = 2132545046(0x7f1c0e16, float:2.074327E38)
        L_0x0175:
            r7.setText(r6)
            android.content.Context r6 = r4.getContext()
            r4.setAlpha(r12)
            r4.setTranslationY(r12)
            r7.setTranslationY(r12)
            r7.setAlpha(r12)
            r7.setVisibility(r3)
            android.util.Property r8 = android.view.View.ALPHA
            r13 = 2
            float[] r14 = new float[r13]
            r14 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r4, r8, r14)
            r8.setDuration(r10)
            r8.start()
            android.util.Property r8 = android.view.View.TRANSLATION_Y
            float[] r14 = new float[r13]
            r14[r3] = r12
            r15 = -1046478848(0xffffffffc1a00000, float:-20.0)
            float r15 = com.p683ss.android.ttve.utils.C20141b.m49696a(r6, r15)
            r14[r2] = r15
            android.animation.ObjectAnimator r8 = android.animation.ObjectAnimator.ofFloat(r4, r8, r14)
            r14 = 1800(0x708, double:8.893E-321)
            r8.setStartDelay(r14)
            r8.setDuration(r10)
            android.util.Property r9 = android.view.View.ALPHA
            float[] r2 = new float[r13]
            r2 = {1065353216, 0} // fill-array
            android.animation.ObjectAnimator r2 = android.animation.ObjectAnimator.ofFloat(r4, r9, r2)
            r2.setStartDelay(r14)
            r2.setDuration(r10)
            android.util.Property r4 = android.view.View.TRANSLATION_Y
            float[] r9 = new float[r13]
            float r5 = com.p683ss.android.ttve.utils.C20141b.m49696a(r6, r5)
            r9[r3] = r5
            r5 = 1
            r9[r5] = r12
            android.animation.ObjectAnimator r4 = android.animation.ObjectAnimator.ofFloat(r7, r4, r9)
            r5 = 2050(0x802, double:1.013E-320)
            r4.setStartDelay(r5)
            r4.setDuration(r10)
            android.util.Property r9 = android.view.View.ALPHA
            float[] r14 = new float[r13]
            r14 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r7 = android.animation.ObjectAnimator.ofFloat(r7, r9, r14)
            r7.setStartDelay(r5)
            r7.setDuration(r10)
            android.animation.AnimatorSet r5 = new android.animation.AnimatorSet
            r5.<init>()
            r6 = 4
            android.animation.Animator[] r6 = new android.animation.Animator[r6]
            android.animation.Animator r8 = (android.animation.Animator) r8
            r6[r3] = r8
            android.animation.Animator r2 = (android.animation.Animator) r2
            r8 = 1
            r6[r8] = r2
            android.animation.Animator r4 = (android.animation.Animator) r4
            r6[r13] = r4
            r2 = 3
            android.animation.Animator r7 = (android.animation.Animator) r7
            r6[r2] = r7
            r5.playTogether(r6)
            com.ss.android.ugc.aweme.shortvideo.am r2 = new com.ss.android.ugc.aweme.shortvideo.am
            r4 = 1036831949(0x3dcccccd, float:0.1)
            r6 = 1048576000(0x3e800000, float:0.25)
            r7 = 1065353216(0x3f800000, float:1.0)
            r2.<init>(r6, r4, r6, r7)
            android.animation.TimeInterpolator r2 = (android.animation.TimeInterpolator) r2
            r5.setInterpolator(r2)
            r5.start()
            com.ss.android.ugc.aweme.ug.guide.e$a r2 = new com.ss.android.ugc.aweme.ug.guide.e$a
            r2.<init>()
            android.animation.Animator$AnimatorListener r2 = (android.animation.Animator.AnimatorListener) r2
            r5.addListener(r2)
        L_0x022d:
            android.view.View r2 = r1.f119706e
            if (r2 == 0) goto L_0x0277
            r2.setVisibility(r3)
            r2.setAlpha(r12)
            android.view.ViewPropertyAnimator r3 = r2.animate()
            r4 = 1065353216(0x3f800000, float:1.0)
            android.view.ViewPropertyAnimator r3 = r3.alpha(r4)
            android.view.ViewPropertyAnimator r3 = r3.setDuration(r10)
            com.ss.android.ugc.aweme.ug.guide.d$c r4 = new com.ss.android.ugc.aweme.ug.guide.d$c
            r4.<init>(r2, r1)
            java.lang.Runnable r4 = (java.lang.Runnable) r4
            android.view.ViewPropertyAnimator r2 = r3.withEndAction(r4)
            r2.start()
            java.lang.String r2 = r1.f119711j
            java.lang.String r3 = "home_swipe_up_lottie_android.json"
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r2, r3)
            if (r2 == 0) goto L_0x0270
            java.lang.String r2 = "new_user_guide_show"
            com.ss.android.ugc.aweme.app.f.d r3 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r4 = "guide_type"
            java.lang.String r5 = "slide"
            com.ss.android.ugc.aweme.app.f.d r3 = r3.mo47829a(r4, r5)
            java.util.Map<java.lang.String, java.lang.String> r3 = r3.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r2, r3)
        L_0x0270:
            com.ss.android.ugc.aweme.share.viewmodel.a r1 = r1.f119703a
            r2 = 1
            r1.mo86217d(r2)
            return
        L_0x0277:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.panel.C30616b.mo60515ag():void");
    }

    /* renamed from: b */
    public final void mo62790b(long j) {
        this.f80027v = j;
    }

    @C53771m
    public void onDismissEnterMusicGuideEvent(C30342k kVar) {
        mo62866bf();
    }

    @C53771m
    public void onEveningEvent(C30347p pVar) {
        mo62838aM();
    }

    @C53771m
    public void onFakeSwipeEvent(C47445a aVar) {
        mo55830r();
    }

    /* renamed from: q */
    public final void mo62797q(boolean z) {
        this.f79975aH = true;
    }

    public C30616b(String str) {
        this(str, 0);
    }

    /* renamed from: a */
    private static ScrollSwitchStateManager m71643a(FragmentActivity fragmentActivity) {
        return ScrollSwitchStateManager.m75876a(fragmentActivity);
    }

    /* renamed from: c */
    public final Aweme mo60522c(int i) {
        return this.f79945E.mo60285c(i);
    }

    /* renamed from: d */
    public void mo62879d(Aweme aweme) {
        m71665i(aweme);
        mo60498T();
    }

    /* renamed from: e */
    public final void mo62881e(Aweme aweme) {
        m71660c(aweme, null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final void mo62884f(String str) {
        this.f79988af.mo60541f((String) null);
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public final void mo62888i(boolean z) {
        if (z) {
            mo55828p();
        }
    }

    @C53771m
    public void onDismissEnterMusicGuideEvent(C36513a aVar) {
        mo62866bf();
    }

    @C53771m
    public void onLoginPageCloseEvent(C27956c cVar) {
        mo51276a(false);
    }

    @C53771m
    public void onLoginPageShowEvent(C27957d dVar) {
        mo51276a(dVar.f73387a);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public String mo55795b(Aweme aweme) {
        return mo62812a(aweme, true, (C30016ag) null);
    }

    /* renamed from: g */
    public final String mo60874g(boolean z) {
        return C30366f.m71279a(mo60502X(), ay_(), z);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo62885h(Aweme aweme) {
        if (aweme != null && aweme.isAd()) {
            this.f79985ac = false;
        }
        this.f80014g = false;
    }

    @C53771m
    public void onEvent(C35471h hVar) {
        C30016ag aK = mo62836aK();
        if (aK != null) {
            aK.mo60206a(hVar);
        }
    }

    @C53771m
    public void onFakeLabelEvent(C25066c cVar) {
        C30016ag aK = mo62836aK();
        if (aK != null) {
            aK.mo60208a(cVar.f66398a, cVar.f66399b);
        }
    }

    @C53771m
    public void onPopUpShowEvent(C47463i iVar) {
        C23794bh.m58408v().mo49236a(mo96010bw());
    }

    @C53771m
    public void onPrivateModelEvent(C30316ah ahVar) {
        C30016ag aK = mo62836aK();
        if (aK != null) {
            aK.mo60202a(ahVar);
        }
    }

    @C53771m
    public void onPushNotificationDialogShowed(C47460f fVar) {
        if (!fVar.f119721a && this.f79977aJ != null) {
            this.f79977aJ.mo94747a(0);
        }
    }

    @C53771m
    public void onRestrictEvent(C41597c cVar) {
        C30015af aM = mo62838aM();
        if (aM != null) {
            aM.mo60190R();
        }
    }

    @C53771m
    public void tryResumePlayEvent(C30330au auVar) {
        if (auVar.f79227a == null) {
            mo55833u();
        } else {
            mo62879d(auVar.f79227a);
        }
    }

    /* renamed from: b */
    private void mo55799b(boolean z) {
        this.f79995am = z;
        this.f80000ar.mo86206a("share_panel", z);
        C30016ag aK = mo62836aK();
        if (aK != null && aK.mo60248r() != null) {
            aK.mo60248r().mo53072f(z);
        }
    }

    /* renamed from: c_ */
    public final void mo50466c_(int i) {
        mo62833aH();
        this.f79945E.mo60338f(i);
        mo62848aW();
        mo62878d(this.f80030y.getCurrentItem());
    }

    /* renamed from: d */
    public void mo55805d(String str) {
        C47718bf.m103288a(new C30332aw(2, str));
        if (mo60511ac()) {
            mo60507Z();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public final C30016ag mo62882f(int i) {
        return (C30016ag) this.f80030y.getChildAt(i).getTag(R.id.aeh);
    }

    /* renamed from: g */
    public final void mo62795g(Aweme aweme) {
        m71656b(aweme, false);
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public final void mo62887h(boolean z) {
        this.f79994al = z;
        this.f80000ar.mo86206a("comment_panel", z);
        C30016ag aK = mo62836aK();
        if (aK != null && aK.mo60248r() != null) {
            aK.mo60248r().mo53070e(z);
        }
    }

    /* renamed from: l */
    public void mo62892l(boolean z) {
        Aweme c = this.f79945E.mo60285c(this.f80030y.getCurrentItem());
        if (z) {
            mo60498T();
        }
        m71665i(c);
    }

    /* renamed from: n */
    public void mo62894n(boolean z) {
        int i;
        this.f79975aH = false;
        C30016ag aK = mo62836aK();
        if (aK != null) {
            if (z) {
                i = 4;
            } else {
                i = 5;
            }
            aK.mo60223b(i);
        }
    }

    @C53771m
    public void onAdFeedRefreshEvent(C25712c cVar) {
        C30016ag aK = mo62836aK();
        if (C31186b.m72817e(aK)) {
            Aweme e = aK.mo53999e();
            if (e != null && e.isAd()) {
                this.f79985ac = true;
            }
        }
    }

    @C53771m
    public void onCleanModeChangedEvent(C36548a aVar) {
        boolean z = C36512b.m82421a().f93584a;
        for (int i = 0; i < this.f80030y.getChildCount(); i++) {
            C30016ag f = mo62882f(i);
            if (f != null) {
                f.mo60231d(z);
            }
        }
    }

    @C53771m
    public void onDeleteAwemeEventOnBase(C30338g gVar) {
        if (C30224d.m70966a()) {
            C32458a.m75141a(4, "BaseListFragmentPanel", "BaseListFragmentPanel onDeleteAweme");
        }
        this.f80030y.post(new C30635e(this));
    }

    @C53771m
    public void onEvent(C25720j jVar) {
        if (jVar != null) {
            C30016ag aK = mo62836aK();
            if (!(aK == null || aK.mo60248r() == null)) {
                aK.mo60248r().mo53051a(jVar);
            }
        }
    }

    @C53771m
    public void onJump2PoiDetailEvent(C30357y yVar) {
        if (!this.f80006ax) {
            C39050c.m86874a(mo96010bw(), mo60519ak(), yVar.f79271a, this.f79987ae, mo62787aq());
        }
    }

    @C53771m
    public void onReceiveDislikeAwemeEvent(C30340i iVar) {
        this.f80019l = iVar.f79250a;
        if (iVar.f79255f == 2 && iVar.f79250a) {
            mo60507Z();
        }
    }

    @C53771m
    public void onScrolledToProfileTab(C42207a aVar) {
        this.f80004av = false;
        mo55828p();
        mo60517ai();
        C36605dw.m82471a().edit().putBoolean("hasVisitedProfilePage", true).apply();
    }

    @C53771m
    public void onTabSwitched(C42208b bVar) {
        this.f80004av = bVar.f106723a;
        if (!this.f80004av && this.f79977aJ != null) {
            this.f79977aJ.mo94749c();
        }
        if (this.f80004av && this.f79977aJ != null) {
            this.f79977aJ.mo94750d();
        }
    }

    /* renamed from: b */
    private void m71654b(C1710e<ScrollSwitchStateManager> eVar) {
        Activity activity = this.f121964aK;
        if (activity == null) {
            this.f79980aN.add(new C30639i(this, eVar));
            return;
        }
        if (activity instanceof FragmentActivity) {
            try {
                eVar.accept(m71643a((FragmentActivity) activity));
            } catch (Exception e) {
                C32458a.m75143a(e);
            }
        }
    }

    /* renamed from: i */
    private void m71665i(Aweme aweme) {
        if (!C47950q.m103752a(aweme) && !C30687a.m71967a(this.f121964aK).booleanValue() && mo96010bw() != null) {
            C30016ag e = mo47031e();
            if (e != null) {
                e.mo54002h();
            }
            C30016ag aK = mo62836aK();
            if (m71659bp() && aK != null) {
                aK.mo60227c(1);
            }
            this.f79988af.mo60536a(aweme);
        }
    }

    /* renamed from: f */
    public final void mo62883f(Aweme aweme) {
        m71655b(aweme, null, this.f80014g, "");
    }

    /* renamed from: g */
    public final void mo62796g(final String str) {
        if (this.f79947G != null) {
            Message obtain = Message.obtain(this.f79947G, new Runnable() {
                public final void run() {
                    if (C30616b.this.f79947G != null) {
                        C30616b.this.f79947G.removeMessages(10);
                    }
                    C30016ag aj = C30616b.this.mo60518aj();
                    if (aj != null && aj.mo53999e() != null && TextUtils.equals(aj.mo53999e().getAid(), str) && aj.mo53999e().isLive() && C30616b.this.mo62868bh()) {
                        Aweme e = aj.mo53999e();
                        C46641d.m101205a(C30616b.this.mo96010bw(), 1, e.getAuthor().getUid(), e.getAuthor().roomId, C46641d.m101204a("homepage_follow", CustomActionPushReceiver.f104061f, C30616b.this.mo60497S().optString("request_id")));
                    }
                }
            });
            obtain.what = 10;
            this.f79947G.sendMessageDelayed(obtain, 60000);
        }
    }

    @C53771m
    public void initTopPageEvent(CardStruct cardStruct) {
        C30016ag aK = mo62836aK();
        if (aK != null && aK.mo60248r() != null && aK.mo60248r().mo53077k() != null) {
            aK.mo60248r().mo53077k().mo54534a();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public final C30016ag mo62890j(boolean z) {
        int i;
        if (this.f80030y == null) {
            return null;
        }
        int childCount = this.f80030y.getChildCount();
        for (int i2 = 0; i2 < childCount; i2++) {
            C30016ag f = mo62882f(i2);
            if (z) {
                i = this.f80030y.getCurrentItem() - 1;
            } else {
                i = this.f80030y.getCurrentItem() + 1;
            }
            if (i < 0) {
                return null;
            }
            if (mo62824a(i, f)) {
                return f;
            }
        }
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public final void mo62891k(boolean z) {
        boolean z2;
        if (C10181b.m20511a().mo18172a(PauseVideoWhenCommentingExperiment.class, true, "dmt_pause_video_when_commenting", 31744, false) && this.f79993ak) {
            if (z) {
                if (this.f79988af.f78844m.f78757a == 3) {
                    z2 = true;
                } else {
                    z2 = false;
                }
                this.f80016i = z2;
                mo62843aR();
            } else if (!this.f80016i) {
                C32458a.m75151c(4, f79940u, "resume play by comment dialog dismiss");
                mo55833u();
            }
        }
        if (!z) {
            this.f79993ak = false;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: o */
    public final DmtStatusView mo62895o(boolean z) {
        if (aC_() != null) {
            Fragment aC_ = aC_();
            if (aC_ instanceof C30986f) {
                return ((C30986f) aC_).mo63766b(z);
            }
            if (aC_ instanceof C27489af) {
                return ((C27489af) aC_).mo55901j();
            }
        }
        return null;
    }

    @C53771m
    public void onEvent(C25713d dVar) {
        if (dVar != null) {
            C30016ag aK = mo62836aK();
            if (aK != null && TextUtils.equals(dVar.f68024c, aK.mo53999e().getAid())) {
                C25880al r = aK.mo60248r();
                if (r != null) {
                    r.mo53050a(dVar);
                }
            }
        }
    }

    @C53771m
    public void onFeedDislikeEventEvent(C30349r rVar) {
        Aweme ak = mo60519ak();
        if (mo62835aJ() && ak != null && !this.f79968aA && !ak.isAd() && C30368h.m71292a(ak.getAid(), ak.getAuthorUid(), ak.isWithSurvey(), this.f79951K.size())) {
            C30368h.f79392m = true;
        }
    }

    public void onFollowFail(final Exception exc) {
        if (mo62868bh()) {
            if (C23794bh.m58389c().mo50264a(exc)) {
                C23794bh.m58389c().mo50263a(mo62964by(), (C23459a) exc, new C24493b() {
                    /* renamed from: a */
                    public final void mo45353a() {
                        C30616b.this.f79961U.mo66351c();
                    }

                    /* renamed from: b */
                    public final void mo45354b() {
                        C22971a.m56494a(C30616b.this.mo96010bw(), exc, R.string.b47);
                    }
                });
            } else {
                C22971a.m56494a(mo96010bw(), exc, R.string.b47);
            }
        }
    }

    public void onFollowSuccess(FollowStatus followStatus) {
        Aweme ak = mo60519ak();
        if (ak != null) {
            User author = ak.getAuthor();
            if (author != null && author.getUid() != null) {
                if (author.getUid().equals(followStatus.userId)) {
                    author.setFollowStatus(followStatus.followStatus);
                }
                C47718bf.m103288a(new C24530d(followStatus.followStatus, author));
            }
        }
    }

    @C53771m
    public void onNetStateChangeEvent(C26918a aVar) {
        if (C23718g.m58207b().mo49153d()) {
            C32458a.m75151c(3, f79940u, "onNetStateChangeEvent, Network available");
            if (this.f80011d == null || this.f80011d.f78757a != 3) {
                C32458a.m75151c(3, f79940u, "tryResumePlay from onNetStateChangeEvent");
                mo55833u();
            } else {
                C32458a.m75151c(3, f79940u, "do not resumePlay when paused");
            }
        }
    }

    @C53771m
    public void onReplayEvent(C26721r rVar) {
        Aweme ak = mo60519ak();
        if (rVar.f70402a && TextUtils.equals(rVar.f70403b, ak.getAid())) {
            C30016ag aK = mo62836aK();
            if (aK != null && aK.mo60248r() != null) {
                aK.mo60248r().mo53045a(mo96010bw(), ak);
            }
        }
    }

    @C53771m
    public void onResumePlayByUserEvent(C30320ak akVar) {
        try {
            if (this.f79973aF.equals(akVar.f79214a.getAid()) && VERSION.SDK_INT >= 24) {
                this.f79988af.mo60534a(akVar.f79214a, Math.toIntExact(akVar.f79215b));
            }
        } catch (ArithmeticException unused) {
        }
    }

    @C53771m
    public void onTabChangeEvent(C47473m mVar) {
        if (mVar.f119739b.equals("HOME")) {
            if (!(this.f80030y == null || this.f80030y.getChildCount() == 0)) {
                this.f79977aJ.mo94750d();
            }
        } else if (this.f79977aJ != null) {
            this.f79977aJ.mo94749c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: p */
    public final void mo62936p(boolean z) {
        C30016ag aj = mo60518aj();
        if (aj instanceof VideoViewHolder) {
            DataCenter dataCenter = ((VideoViewHolder) aj).f78516h;
            if (dataCenter != null) {
                if (z) {
                    dataCenter.mo48228a("video_share_click", (Object) Boolean.valueOf(true));
                }
                mo60517ai();
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo62858b(View view) {
        C30015af aM = mo62838aM();
        if (aM != null) {
            aM.mo60195W();
        }
        m71656b(this.f79945E.mo60285c(this.f80030y.getCurrentItem()), true);
    }

    /* renamed from: e */
    public final C30016ag mo60523e(String str) {
        if (this.f80030y == null) {
            return null;
        }
        int childCount = this.f80030y.getChildCount();
        for (int i = 0; i < childCount; i++) {
            C30016ag agVar = (C30016ag) this.f80030y.getChildAt(i).getTag(R.id.aeh);
            if (agVar != null && agVar.mo60289E() != null && C9431p.m18665a(agVar.mo60289E().getAid(), str)) {
                return agVar;
            }
        }
        return null;
    }

    /* renamed from: f */
    public void mo55808f(boolean z) {
        super.mo55808f(z);
        if (z) {
            mo62874bn();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo62886h(String str) {
        if ("on_ear_phone_unplug".equals(str)) {
            if (mo62781ar().mo95257o()) {
                C30016ag aK = mo62836aK();
                if (!FeedPlayerCleanOptimize.m70946a() || aK == null || !aK.aE_()) {
                    mo60510ab();
                    mo62843aR();
                } else {
                    C32458a.m75141a(4, f79940u, "pause on earphone unplug for new clean mode");
                }
                C36546c.m82443a("play", ay_(), mo60519ak());
                return;
            }
            C36546c.m82443a("pause", ay_(), mo60519ak());
        }
    }

    /* renamed from: m */
    public final View mo62893m(boolean z) {
        int i;
        if (this.f79960T == null && z && this.f80028w) {
            this.f79960T = new ImageView(mo96010bw());
            ImageView imageView = this.f79960T;
            if (FeedPlayerCleanOptimize.m70947b() == 1) {
                i = R.drawable.csg;
            } else {
                i = R.drawable.dfm;
            }
            imageView.setImageResource(i);
            LayoutParams layoutParams = new LayoutParams(-2, -2);
            layoutParams.gravity = 17;
            this.f80029x.addView(this.f79960T, layoutParams);
            this.f79960T.setScaleX(2.5f);
            this.f79960T.setScaleY(2.5f);
            this.f79960T.setVisibility(8);
            this.f79960T.setAlpha(0.0f);
            if (FeedPlayerCleanOptimize.m70947b() != 1) {
                this.f79960T.setOnClickListener(new C30637g(this));
            }
        }
        return this.f79960T;
    }

    @C53771m
    public void onAwesomeSplashEvent(C26216b bVar) {
        this.f79969aB = bVar.f69221a;
        if (this.f79969aB == 2) {
            C30016ag aK = mo62836aK();
            if (aK != null) {
                C30015af u = aK.mo60251u();
                if (u != null) {
                    Aweme e = aK.mo53999e();
                    if (e != null) {
                        C0013i.m16a((Callable<TResult>) new C30640j<TResult>(e, u));
                    }
                }
            }
        }
        if (this.f79969aB < 4) {
            DmtStatusView o = mo62895o(false);
            if (o != null && o.mo19215i()) {
                o.mo19209d();
            }
        }
        C25945k.m62915f().mo53876a(bVar.f69221a, this.f79955O, this.f79956P);
    }

    @C53771m
    public void onEvent(C26689c cVar) {
        if (cVar != null) {
            C30016ag aK = mo62836aK();
            if (!(aK == null || aK.mo60248r() == null || aK.mo60248r().mo53077k() == null)) {
                switch (cVar.f70333c) {
                    case 1:
                        aK.mo60248r().mo53077k().mo54536a(cVar.f70332b, cVar.f70331a);
                        return;
                    case 2:
                        aK.mo60248r().mo53077k().mo54540b(cVar.f70332b, cVar.f70331a);
                        break;
                }
            }
        }
    }

    @C53771m
    public void onFeedAdClickCouponEvent(C25717g gVar) {
        Aweme aweme = gVar.f68025a;
        int i = gVar.f68026b;
        if (C26503d.m64049A(aweme) != null) {
            if (Arrays.asList(new Integer[]{Integer.valueOf(2), Integer.valueOf(6), Integer.valueOf(3), Integer.valueOf(17), Integer.valueOf(25), Integer.valueOf(8)}).contains(Integer.valueOf(i))) {
                C30016ag aK = mo62836aK();
                if (!(aK == null || aK.mo60248r() == null || aK.mo60248r().mo53077k() == null)) {
                    aK.mo60248r().mo53077k().mo54535a(i);
                }
            }
        }
    }

    @C53771m
    public void onFeedAdClickFormEvent(C25718h hVar) {
        Aweme aweme = hVar.f68027a;
        int i = hVar.f68028b;
        CardStruct s = C26503d.m64076s(aweme);
        if (s == null || s.getCardType() != 1) {
            C25945k.m62914e().mo53190a(this.f121964aK, aweme, mo62964by(), i);
        } else if (i == 2) {
            C30016ag aK = mo62836aK();
            if (!(aK == null || aK.mo60248r() == null || aK.mo60248r().mo53077k() == null)) {
                aK.mo60248r().mo53077k().mo54541c();
            }
        }
    }

    @C53771m
    public void onVideoPlayerEvent(C43893g gVar) {
        int i = gVar.f111162c;
        if (i != 2) {
            if (i == 4 && !TextUtils.isEmpty(this.f80024r)) {
                String str = this.f80024r;
                this.f80024r = "";
                C30016ag aj = mo60518aj();
                if (aj != null && aj.mo53999e() != null && TextUtils.equals(aj.mo53999e().getAid(), str)) {
                    mo60507Z();
                    mo62827aB();
                    aj.mo60199a(mo62781ar().mo95256n());
                } else {
                    return;
                }
            }
            return;
        }
        this.f79992aj.mo58360K();
    }

    /* renamed from: b */
    private void mo55796b(int i) {
        String str;
        String str2;
        String str3;
        String str4;
        if (this.f79945E != null) {
            Aweme c = this.f79945E.mo60285c(i);
            if (C26503d.m64061d(c) && c.getAwemeRawAd().getContextTrack() != null && !C9376b.m18558a((Collection<T>) c.getAwemeRawAd().getContextTrack().getUrlList())) {
                c.getAwemeRawAd().setContextTrackSent(true);
                Aweme c2 = this.f79945E.mo60285c(i - 1);
                Aweme c3 = this.f79945E.mo60285c(i + 1);
                if (c2 == null) {
                    str = "";
                } else {
                    str = c2.getShareUrl();
                }
                if (c3 == null) {
                    str2 = "";
                } else {
                    str2 = c3.getShareUrl();
                }
                if (TextUtils.isEmpty(str)) {
                    str3 = "";
                } else {
                    str3 = URLEncoder.encode(str);
                }
                if (TextUtils.isEmpty(str2)) {
                    str4 = "";
                } else {
                    str4 = URLEncoder.encode(str2);
                }
                LinkedList linkedList = new LinkedList();
                for (String str5 : c.getAwemeRawAd().getContextTrack().getUrlList()) {
                    if (!TextUtils.isEmpty(str5)) {
                        String replace = str5.replace("__PCONTENT__", str3).replace("__NCONTENT__", str4);
                        String str6 = "";
                        try {
                            str6 = mo60495Q();
                        } catch (JSONException unused) {
                        }
                        linkedList.add(Uri.parse(replace).buildUpon().appendQueryParameter("platform", "android").appendQueryParameter("req_id", str6).toString());
                    }
                }
                C25945k.m62911b().mo53128a((C26057av) null, (Collection<String>) linkedList, false);
            }
        }
    }

    /* renamed from: c */
    public final C23088c mo60504c(Aweme aweme) {
        int i;
        if (this.f80030y == null) {
            i = 0;
        } else {
            i = this.f80030y.getCurrentItem();
        }
        C30669b bVar = this.f79987ae;
        C23088c a = new C23088c().mo47824a("author_id", C23198ae.m56846a(aweme)).mo47824a("request_id", C23198ae.m56847a(aweme, bVar.getPageType())).mo47822a(C22858c.f61208d, Integer.valueOf(mo55834v() ? 1 : 0)).mo47822a("order", Integer.valueOf(i)).mo47824a("is_photo", C23198ae.m56878n(aweme)).mo47824a("enter_method", bVar.getEnterMethodValue()).mo47824a("enter_from", bVar.getEventType());
        if (!TextUtils.isEmpty(C23198ae.m56861e(aweme))) {
            a.mo47824a("poi_id", C23198ae.m56861e(aweme));
        }
        if (C23198ae.m56858c(bVar.getEventType())) {
            a.mo47824a("poi_type", C23198ae.m56867h(aweme)).mo47824a("poi_channel", C23198ae.m56852b()).mo47824a("city_info", C23198ae.m56845a()).mo47824a("distance_info", C23198ae.m56869i(aweme));
        }
        if (!TextUtils.isEmpty(bVar.getShareUserId())) {
            a.mo47824a("share_mode", "token").mo47824a("uid", bVar.getShareUserId());
        }
        return a;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public void mo62878d(int i) {
        C30016ag agVar = null;
        if (this.f80030y != null) {
            int childCount = this.f80030y.getChildCount();
            C30016ag agVar2 = null;
            for (int i2 = 0; i2 < childCount; i2++) {
                C30016ag agVar3 = (C30016ag) this.f80030y.getChildAt(i2).getTag(R.id.aeh);
                if (mo62824a(i, agVar3)) {
                    agVar2 = agVar3;
                }
            }
            agVar = agVar2;
        }
        if (agVar != null) {
            Aweme e = agVar.mo53999e();
            if (!(e == null || e.getAid() == null)) {
                AwemeRawAd awemeRawAd = e.getAwemeRawAd();
                if (awemeRawAd != null && awemeRawAd.isHardAd()) {
                    C26511e.f69834c = System.currentTimeMillis();
                }
                C26511e.f69832a.remove(e.getAid());
                if (e.isAd()) {
                    try {
                        AwemeRawAd awemeRawAd2 = e.getAwemeRawAd();
                        if (awemeRawAd2 != null) {
                            Long creativeId = awemeRawAd2.getCreativeId();
                            if (creativeId != null) {
                                C26511e.f69833b.remove(Long.valueOf(creativeId.longValue()));
                            }
                        }
                    } catch (Exception unused) {
                    }
                    C26467cb.f69755b.mo54181a(C26511e.f69833b);
                }
            }
        }
        if (agVar != this.f80015h) {
            if (this.f80015h != null) {
                this.f80015h.mo55903c(this.f79949I);
            }
            mo62833aH();
            if (agVar != null) {
                agVar.mo53995a(i);
            }
            this.f80015h = agVar;
            if (this.f79945E != null) {
                Aweme c = this.f79945E.mo60285c(i);
                if (C26503d.m64061d(c)) {
                    c.getAwemeRawAd().setContextTrackSent(false);
                }
            }
        }
        this.f80003au = i;
        mo62834aI();
    }

    /* renamed from: e */
    public final void mo62880e(int i) {
        Aweme c = this.f79945E.mo60285c(i);
        if (!m71650a(mo96010bw(), c, C26503d.m64056a(c, this.f79945E.mo60286c(), i))) {
            mo62813a(i, c);
            C25945k.m62923n().mo54140c(c);
        }
    }

    public void handleMsg(Message message) {
        if (message.what == 0) {
            C32458a.m75141a(3, "BaseListFragmentPanel", "try resume play or try pause play for tap");
            if (this.f79945E == null || this.f80030y == null) {
                C32458a.m75143a((Exception) new IllegalStateException("adapter or viewpager is null,maybe is bug,please contact liuyiming.777"));
            } else {
                Aweme c = this.f79945E.mo60285c(this.f80030y.getCurrentItem());
                if (C31190f.m72836d(c)) {
                    C32458a.m75141a(3, "BaseListFragmentPanel", "tap for image aweme!");
                    mo55831s();
                } else if (C26235d.m63571b(c)) {
                    C32458a.m75141a(3, "BaseListFragmentPanel", "tap for live aweme!");
                    C30016ag aj = mo60518aj();
                    if (aj instanceof VideoViewHolder) {
                        DataCenter dataCenter = ((VideoViewHolder) aj).f78516h;
                        if (dataCenter != null) {
                            dataCenter.mo48228a("live_video_click", (Object) Boolean.valueOf(true));
                        }
                    } else {
                        C31175aa.m72803a(c);
                        C32458a.m75141a(6, "BaseListFragmentPanel", "not rsp because isn't vvh,maybe it's bug!");
                    }
                    C31208r.m72878a(mo96010bw(), c);
                } else {
                    C32458a.m75141a(3, "BaseListFragmentPanel", "tap for video aweme!");
                    if (c == null || TextUtils.isEmpty(c.getAid())) {
                        C31175aa.m72803a(c);
                        C32458a.m75143a((Exception) new IllegalStateException("aid is empty,maybe is bug,please contact liuyiming.777"));
                    } else {
                        C26890h.m65005a(mo96010bw(), "click", "video", c.getAid(), 0);
                        C30016ag aK = mo62836aK();
                        if (aK == null || !aK.aE_()) {
                            m71656b(c, true);
                        } else if (aK.aF_()) {
                            mo55828p();
                        }
                    }
                }
                C30015af aM = mo62838aM();
                if (aM != null) {
                    aM.mo60195W();
                }
            }
        }
    }

    @C53771m
    public void onEvent(C26690d dVar) {
        int i;
        if (dVar != null) {
            Context bw = mo96010bw();
            if (bw != null && dVar.f70338e == bw.hashCode()) {
                C48021h hVar = this.f80023q;
                if (hVar != null) {
                    Aweme ak = mo60519ak();
                    if (C26503d.m64082y(ak)) {
                        i = C26503d.m64076s(ak).getShowSeconds();
                    } else if (C26503d.m64081x(ak)) {
                        i = ak.getAwemeRawAd().getShowButtonSeconds();
                    } else {
                        i = 0;
                    }
                    if (C30367g.m71282a().f79379h && dVar.f70334a == 1 && (hVar.mo95251i() * ((long) C30367g.m71282a().f79377f)) + hVar.mo95256n() >= ((long) (i * 1000))) {
                        C30016ag aK = mo62836aK();
                        if (!(aK == null || aK.mo60248r() == null)) {
                            aK.mo60248r().mo53043a(0, "active_show");
                        }
                    }
                }
            }
        }
    }

    @C53771m(mo112975a = ThreadMode.MAIN)
    public void onJsBroadCastEvent(C29906l lVar) {
        try {
            if (TextUtils.equals("videoReportSuccess", lVar.f78045b.getString("eventName"))) {
                String string = lVar.f78045b.getJSONObject("data").getString("object_id");
                Aweme ak = mo60519ak();
                if (ak != null && !ak.isAd() && TextUtils.equals(ak.getAid(), string)) {
                    VideoMaskInfo videoMaskInfo = new VideoMaskInfo(Boolean.valueOf(true), Integer.valueOf(1), Integer.valueOf(1), mo96010bw().getString(R.string.hb7), mo96010bw().getString(R.string.hb5), mo96010bw().getString(R.string.hb6));
                    ak.setVideoMaskInfo(videoMaskInfo);
                    C23324d.m57378a().updateAweme(ak);
                    if (this.f79945E.getCount() > this.f79946F + 1) {
                        mo55830r();
                    }
                }
            }
        } catch (JSONException unused) {
        }
    }

    @C53771m
    public void onVideoEvent(C30332aw awVar) {
        boolean z;
        if (mo62868bh() && awVar != null) {
            if (awVar.f79228a == 36) {
                m71664g();
            } else if (awVar.f79228a == 14 || awVar.f79228a == 13 || awVar.f79228a == 2) {
                String str = (String) awVar.f79229b;
                if (awVar.f79228a == 2 && this.f79958R != null) {
                    this.f79958R.mo55935a(str);
                }
                int childCount = this.f80030y.getChildCount();
                for (int i = 0; i < childCount; i++) {
                    C30016ag agVar = (C30016ag) this.f80030y.getChildAt(i).getTag(R.id.aeh);
                    if (agVar != null && !m71651a(agVar) && agVar.mo53999e() != null && C9431p.m18665a(agVar.mo53999e().getAid(), str) && awVar.f79228a == 13) {
                        Aweme awemeById = C23324d.m57378a().getAwemeById(str);
                        if (awemeById != null) {
                            if (awemeById.getUserDigg() != 0) {
                                z = true;
                            } else {
                                z = false;
                            }
                            if (awemeById.isAd() && awemeById.getActivityPendant() == null) {
                                ReportFeedAdAction.m63707a(awemeById, this.f79987ae.getEventType());
                                Aweme aweme = new Aweme();
                                aweme.update(awemeById);
                                aweme.setAd(false);
                                C23324d.m57378a().updateAweme(aweme);
                            }
                            C47718bf.m103288a(new C30312ad(z, awemeById.getAid()));
                            if (agVar.mo60248r() != null) {
                                agVar.mo60248r().mo53067d(z);
                            }
                        }
                    }
                }
            }
        }
    }

    @C53771m
    public void onVoteEvent(C44593a aVar) {
        if (this.f79945E != null && !C9376b.m18558a((Collection<T>) this.f79945E.mo60286c())) {
            C30016ag aK = mo62836aK();
            if (!(aK == null || aK.mo53999e() == null || !TextUtils.equals(aK.mo53999e().getAid(), aVar.f112807a) || aK.mo53999e().getInteractStickerStructs() == null)) {
                for (InteractStickerStruct voteStruct : aK.mo53999e().getInteractStickerStructs()) {
                    VoteStruct voteStruct2 = voteStruct.getVoteStruct();
                    if (!(voteStruct2 == null || voteStruct2.getOptions() == null)) {
                        for (OptionsBean optionId : voteStruct2.getOptions()) {
                            if (optionId.getOptionId() == aVar.f112808b) {
                                voteStruct2.setSelectOptionId(aVar.f112808b);
                            }
                        }
                    }
                }
            }
        }
    }

    @C53771m
    public void onEvent(C30317ai aiVar) {
        int i;
        if (aiVar != null) {
            Activity activity = this.f121964aK;
            int i2 = aiVar.f79209a;
            if (activity != null) {
                i = activity.hashCode();
            } else {
                i = 0;
            }
            if (i2 == i) {
                C30016ag aK = mo62836aK();
                if (aK != null && aiVar.f79211c == aK.mo53999e()) {
                    C25880al r = aK.mo60248r();
                    if (r != null) {
                        switch (aiVar.f79210b) {
                            case 1:
                                r.mo53061b(aiVar.f79212d);
                                return;
                            case 2:
                                r.mo53065c(aiVar.f79212d);
                                break;
                        }
                    }
                }
            }
        }
    }

    /* renamed from: a */
    private void mo51276a(boolean z) {
        this.f79996an = z;
        this.f80000ar.mo86206a("login_panel", z);
        if (z) {
            mo55828p();
        }
    }

    @C53771m
    public void onEvent(C30351t tVar) {
        int currentItem = this.f80030y.getCurrentItem() + 1;
        if (currentItem < this.f79945E.getCount()) {
            this.f80030y.setCurrentItemWithDefaultVelocity(currentItem);
        }
    }

    @C53771m
    public void onEvent(FollowStatus followStatus) {
        String str;
        if (mo62868bh()) {
            C30056b bVar = this.f79945E;
            C52711k.m112240b(followStatus, "followStatus");
            if (bVar.getCount() != 0) {
                Iterable c = bVar.mo60286c();
                Collection arrayList = new ArrayList();
                for (Object next : c) {
                    User author = ((Aweme) next).getAuthor();
                    if (author != null) {
                        str = author.getUid();
                    } else {
                        str = null;
                    }
                    if (C9431p.m18665a(str, followStatus.userId)) {
                        arrayList.add(next);
                    }
                }
                for (Aweme author2 : (List) arrayList) {
                    User author3 = author2.getAuthor();
                    C52711k.m112236a((Object) author3, "it.author");
                    author3.setFollowStatus(followStatus.followStatus);
                }
            }
        }
    }

    /* renamed from: b */
    private void m71656b(Aweme aweme, boolean z) {
        mo60524a(aweme, true, z);
    }

    /* renamed from: c */
    private void m71660c(final Aweme aweme, final String str) {
        C18842a.m45934b(new Runnable() {
            public final void run() {
                if (C30616b.this.f121964aK != null && !C30616b.this.f121964aK.isFinishing()) {
                    C30616b.this.f79986ad.mo60707a(C30616b.this.f121964aK, aweme, new C41977a().mo86066a(C30616b.this.f79987ae.getTabName()).mo86067b(C30616b.this.f79987ae.getmImprId()).f106247a);
                }
            }
        });
    }

    /* renamed from: a */
    static final /* synthetic */ Object m71644a(Aweme aweme, C30015af afVar) throws Exception {
        try {
            Aweme a = C27989z.f73414b.mo56386a().mo44457a(aweme.getAid(), "");
            if (a == null) {
                return null;
            }
            afVar.mo60233e(a);
            return null;
        } catch (Exception unused) {
        }
    }

    /* renamed from: a */
    private static void m71645a(View view, int i) {
        if (view != null) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams != null && layoutParams.height != i) {
                layoutParams.height = i;
                view.setLayoutParams(layoutParams);
            }
        }
    }

    /* renamed from: a */
    private void mo55789a(Aweme aweme, int i) throws C26880f {
        C32458a.m75143a((Exception) new RuntimeException("insertItemList fall to 降级逻辑"));
        this.f79945E.mo60330a(aweme, i);
        this.f79945E.notifyDataSetChanged();
    }

    public C30616b(String str, int i) {
        this.f80031z = new C30611ap();
        this.f79948H = false;
        this.f79967a = 1.0E-10f;
        this.f79951K = new HashSet();
        this.f79952L = false;
        this.f79963W = false;
        this.f79964X = false;
        this.f79965Y = false;
        this.f79966Z = false;
        this.f79983aa = "";
        this.f80012e = new Runnable() {
            public final void run() {
                C30616b.this.mo62849aX();
            }
        };
        this.f79985ac = false;
        this.f79987ae = new C30669b();
        this.f79990ah = true;
        this.f79992aj = C30276a.f79114a;
        this.f79993ak = false;
        this.f79994al = false;
        this.f79995am = false;
        this.f79996an = false;
        this.f79997ao = false;
        this.f79998ap = false;
        this.f79999aq = false;
        this.f80001as = false;
        this.f80002at = null;
        this.f80015h = null;
        this.f80003au = -1;
        this.f80016i = false;
        this.f80019l = false;
        this.f80004av = true;
        this.f80020n = 0;
        this.f80005aw = false;
        this.f80006ax = false;
        this.f80021o = false;
        this.f80008az = false;
        this.f79968aA = false;
        this.f79969aB = 4;
        this.f79970aC = false;
        this.f80024r = "";
        this.f80025s = 0;
        this.f80026t = new C30452h();
        this.f79971aD = 0;
        this.f79972aE = new C26960e() {
            /* renamed from: a */
            public final void mo55068a() {
                C36605dw.m82471a().edit().putBoolean("hasSwipedUp", true).apply();
                C30289j.m71209c(false);
            }

            /* JADX WARNING: Removed duplicated region for block: B:45:0x00dd A[Catch:{ Exception -> 0x031b }] */
            /* JADX WARNING: Removed duplicated region for block: B:46:0x00de A[Catch:{ Exception -> 0x031b }] */
            /* JADX WARNING: Removed duplicated region for block: B:64:0x0102 A[Catch:{ Exception -> 0x031d }] */
            /* JADX WARNING: Removed duplicated region for block: B:65:0x0107  */
            /* JADX WARNING: Removed duplicated region for block: B:67:0x010a A[SYNTHETIC, Splitter:B:67:0x010a] */
            /* renamed from: a */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final int mo55067a(int r20, int r21, int r22, int r23) {
                /*
                    r19 = this;
                    r0 = r19
                    r7 = r20
                    r8 = r22
                    r9 = r23
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r1 = r1.mo62835aJ()
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.model.Aweme r2 = r2.mo60519ak()
                    r10 = 1
                    r11 = 0
                    if (r1 == 0) goto L_0x009a
                    if (r2 == 0) goto L_0x009a
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r4 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64061d(r2)
                    if (r4 != 0) goto L_0x0031
                    boolean r4 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64070m(r2)
                    if (r4 != 0) goto L_0x0031
                    boolean r4 = com.p683ss.android.ugc.aweme.commercialize.splash.livesplash.C26235d.m63570a(r2)
                    if (r4 == 0) goto L_0x002f
                    goto L_0x0031
                L_0x002f:
                    r4 = 0
                    goto L_0x0032
                L_0x0031:
                    r4 = 1
                L_0x0032:
                    r3.f79968aA = r4
                    int r3 = r2.getAwemeType()
                    r4 = 101(0x65, float:1.42E-43)
                    if (r3 == r4) goto L_0x0067
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r3 = r3.f79968aA
                    if (r3 != 0) goto L_0x0067
                    int r3 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79385f
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    java.util.Set<java.lang.String> r4 = r4.f79951K
                    int r4 = r4.size()
                    if (r3 <= r4) goto L_0x0067
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    java.util.Set<java.lang.String> r3 = r3.f79951K
                    java.lang.String r4 = r2.getAid()
                    boolean r3 = r3.contains(r4)
                    if (r3 != 0) goto L_0x0067
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    java.util.Set<java.lang.String> r3 = r3.f79951K
                    java.lang.String r4 = r2.getAid()
                    r3.add(r4)
                L_0x0067:
                    if (r1 == 0) goto L_0x0091
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r1 = r1.f80008az
                    if (r1 != 0) goto L_0x0091
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r1 = r1.f79968aA
                    if (r1 != 0) goto L_0x0091
                    java.lang.String r1 = r2.getAid()
                    java.lang.String r3 = r2.getAuthorUid()
                    boolean r2 = r2.isWithSurvey()
                    com.ss.android.ugc.aweme.feed.panel.b r4 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    java.util.Set<java.lang.String> r4 = r4.f79951K
                    int r4 = r4.size()
                    boolean r1 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.m71292a(r1, r3, r2, r4)
                    if (r1 == 0) goto L_0x0091
                    r1 = 1
                    goto L_0x0092
                L_0x0091:
                    r1 = 0
                L_0x0092:
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    boolean r3 = r3.f79968aA
                    r2.f80008az = r3
                L_0x009a:
                    if (r1 == 0) goto L_0x031d
                    long r1 = java.lang.System.currentTimeMillis()
                    com.ss.android.ugc.aweme.feed.panel.b r3 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this
                    com.ss.android.ugc.aweme.feed.e.o r3 = r3.f79988af
                    long r3 = r3.f78841j
                    long r1 = r1 - r3
                    r3 = 1000(0x3e8, double:4.94E-321)
                    long r1 = r1 / r3
                    float r1 = (float) r1
                    r2 = 1065353216(0x3f800000, float:1.0)
                    int r1 = (r1 > r2 ? 1 : (r1 == r2 ? 0 : -1))
                    if (r1 <= 0) goto L_0x031d
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this     // Catch:{ Exception -> 0x031d }
                    android.content.Context r1 = r1.mo96010bw()     // Catch:{ Exception -> 0x031d }
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this     // Catch:{ Exception -> 0x031d }
                    com.ss.android.ugc.aweme.common.widget.VerticalViewPager r12 = r2.f80030y     // Catch:{ Exception -> 0x031d }
                    com.ss.android.ugc.aweme.feed.panel.b r2 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this     // Catch:{ Exception -> 0x031d }
                    com.ss.android.ugc.aweme.feed.e.o r2 = r2.f79988af     // Catch:{ Exception -> 0x031d }
                    long r13 = r2.f78841j     // Catch:{ Exception -> 0x031d }
                    java.lang.String r2 = "context"
                    p2628d.p2639f.p2641b.C52711k.m112240b(r1, r2)     // Catch:{ Exception -> 0x031d }
                    int r2 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79384e     // Catch:{ Exception -> 0x031d }
                    switch(r2) {
                        case 1: goto L_0x00d2;
                        case 2: goto L_0x00cf;
                        default: goto L_0x00cb;
                    }     // Catch:{ Exception -> 0x031d }
                L_0x00cb:
                    r17 = 0
                    goto L_0x030d
                L_0x00cf:
                    com.ss.android.ugc.aweme.feed.helper.FeedSurvey r2 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79382c     // Catch:{ Exception -> 0x031d }
                    goto L_0x00d4
                L_0x00d2:
                    com.ss.android.ugc.aweme.feed.helper.FeedSurvey r2 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79381b     // Catch:{ Exception -> 0x031b }
                L_0x00d4:
                    r15 = r2
                    if (r12 == 0) goto L_0x00cb
                    com.ss.android.ugc.aweme.feed.helper.FeedSurveyConfig r2 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79380a     // Catch:{ Exception -> 0x031b }
                    if (r2 == 0) goto L_0x00cb
                    if (r15 != 0) goto L_0x00de
                    goto L_0x00cb
                L_0x00de:
                    com.ss.android.ugc.aweme.feed.helper.Question[] r2 = r15.getQuestions()     // Catch:{ Exception -> 0x031b }
                    if (r2 == 0) goto L_0x00e6
                    int r3 = r2.length     // Catch:{ Exception -> 0x031d }
                    goto L_0x00e7
                L_0x00e6:
                    r3 = 0
                L_0x00e7:
                    if (r3 <= 0) goto L_0x00cb
                    if (r2 != 0) goto L_0x00ee
                    p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x031d }
                L_0x00ee:
                    r2 = r2[r11]     // Catch:{ Exception -> 0x031b }
                    r3 = 0
                    if (r2 == 0) goto L_0x00ff
                    com.ss.android.ugc.aweme.feed.helper.Option[] r4 = r2.getOptions()     // Catch:{ Exception -> 0x031d }
                    if (r4 == 0) goto L_0x00ff
                    java.util.List r4 = p2628d.p2629a.C52568f.m112084e(r4)     // Catch:{ Exception -> 0x031d }
                    r6 = r4
                    goto L_0x0100
                L_0x00ff:
                    r6 = r3
                L_0x0100:
                    if (r6 == 0) goto L_0x0107
                    int r4 = r6.size()     // Catch:{ Exception -> 0x031d }
                    goto L_0x0108
                L_0x0107:
                    r4 = 0
                L_0x0108:
                    if (r4 <= 0) goto L_0x00cb
                    int r4 = r2.getType()     // Catch:{ Exception -> 0x031b }
                    com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79391l = r4     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.h$b r5 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.C30370b.BINARY     // Catch:{ Exception -> 0x031b }
                    int r5 = r5.getType()     // Catch:{ Exception -> 0x031b }
                    if (r4 != r5) goto L_0x011b
                L_0x0118:
                    r5 = r3
                    goto L_0x01c0
                L_0x011b:
                    com.ss.android.ugc.aweme.feed.helper.h$b r5 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.C30370b.FIVE_LEVEL     // Catch:{ Exception -> 0x031b }
                    int r5 = r5.getType()     // Catch:{ Exception -> 0x031b }
                    if (r4 != r5) goto L_0x018e
                    if (r6 != 0) goto L_0x0128
                    p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x031d }
                L_0x0128:
                    if (r1 != 0) goto L_0x012b
                    goto L_0x0118
                L_0x012b:
                    com.ss.android.ugc.aweme.feed.ui.RatingBar r3 = new com.ss.android.ugc.aweme.feed.ui.RatingBar     // Catch:{ Exception -> 0x031d }
                    r3.<init>(r1)     // Catch:{ Exception -> 0x031d }
                    r4 = 17
                    r3.setGravity(r4)     // Catch:{ Exception -> 0x031d }
                    r3.setClickable(r10)     // Catch:{ Exception -> 0x031d }
                    android.content.res.Resources r4 = r1.getResources()     // Catch:{ Exception -> 0x031d }
                    r5 = 2131953494(0x7f130756, float:1.954346E38)
                    android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)     // Catch:{ Exception -> 0x031d }
                    r3.setStarEmptyDrawable(r4)     // Catch:{ Exception -> 0x031d }
                    android.content.res.Resources r4 = r1.getResources()     // Catch:{ Exception -> 0x031d }
                    r5 = 2131953495(0x7f130757, float:1.9543463E38)
                    android.graphics.drawable.Drawable r4 = r4.getDrawable(r5)     // Catch:{ Exception -> 0x031d }
                    r3.setStarFillDrawable(r4)     // Catch:{ Exception -> 0x031d }
                    r4 = 0
                    r3.setStarStep(r4)     // Catch:{ Exception -> 0x031d }
                    r3.setStepSize(r10)     // Catch:{ Exception -> 0x031d }
                    int r4 = r6.size()     // Catch:{ Exception -> 0x031d }
                    r3.setStarCount(r4)     // Catch:{ Exception -> 0x031d }
                    r4 = 1109393408(0x42200000, float:40.0)
                    float r4 = com.bytedance.common.utility.C9432q.m18687b(r1, r4)     // Catch:{ Exception -> 0x031d }
                    r3.setStarImageSize(r4)     // Catch:{ Exception -> 0x031d }
                    r4 = 1092616192(0x41200000, float:10.0)
                    float r4 = com.bytedance.common.utility.C9432q.m18687b(r1, r4)     // Catch:{ Exception -> 0x031d }
                    r3.setStarPadding(r4)     // Catch:{ Exception -> 0x031d }
                    com.ss.android.ugc.aweme.feed.helper.h$e r4 = new com.ss.android.ugc.aweme.feed.helper.h$e     // Catch:{ Exception -> 0x031d }
                    r4.<init>(r3, r6)     // Catch:{ Exception -> 0x031d }
                    com.ss.android.ugc.aweme.feed.ui.RatingBar$a r4 = (com.p683ss.android.ugc.aweme.feed.p1736ui.RatingBar.C30723a) r4     // Catch:{ Exception -> 0x031d }
                    r3.setOnRatingChangeListener(r4)     // Catch:{ Exception -> 0x031d }
                    r3.mo63355a()     // Catch:{ Exception -> 0x031d }
                    r4 = 1101004800(0x41a00000, float:20.0)
                    float r4 = com.bytedance.common.utility.C9432q.m18687b(r1, r4)     // Catch:{ Exception -> 0x031d }
                    int r4 = (int) r4     // Catch:{ Exception -> 0x031d }
                    r3.setPadding(r11, r4, r11, r11)     // Catch:{ Exception -> 0x031d }
                    android.view.View r3 = (android.view.View) r3     // Catch:{ Exception -> 0x031d }
                    goto L_0x0118
                L_0x018e:
                    com.ss.android.ugc.aweme.feed.helper.h$b r3 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.C30370b.SINGLE_CHOICE     // Catch:{ Exception -> 0x031b }
                    int r3 = r3.getType()     // Catch:{ Exception -> 0x031b }
                    if (r4 != r3) goto L_0x01a7
                    com.ss.android.ugc.aweme.feed.helper.h$b r3 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.C30370b.SINGLE_CHOICE     // Catch:{ Exception -> 0x031d }
                    int r3 = r3.getType()     // Catch:{ Exception -> 0x031d }
                    if (r6 != 0) goto L_0x01a1
                    p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x031d }
                L_0x01a1:
                    android.view.View r3 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.m71283a(r1, r3, r6)     // Catch:{ Exception -> 0x031d }
                    goto L_0x0118
                L_0x01a7:
                    com.ss.android.ugc.aweme.feed.helper.h$b r3 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.C30370b.MULTIPLE_CHOICE     // Catch:{ Exception -> 0x031b }
                    int r3 = r3.getType()     // Catch:{ Exception -> 0x031b }
                    if (r4 != r3) goto L_0x00cb
                    com.ss.android.ugc.aweme.feed.helper.h$b r3 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.C30370b.MULTIPLE_CHOICE     // Catch:{ Exception -> 0x031b }
                    int r3 = r3.getType()     // Catch:{ Exception -> 0x031b }
                    if (r6 != 0) goto L_0x01ba
                    p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x031d }
                L_0x01ba:
                    android.view.View r3 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.m71283a(r1, r3, r6)     // Catch:{ Exception -> 0x031b }
                    goto L_0x0118
                L_0x01c0:
                    com.bytedance.ies.dmt.ui.b.a$a r3 = new com.bytedance.ies.dmt.ui.b.a$a     // Catch:{ Exception -> 0x031b }
                    r3.<init>(r1)     // Catch:{ Exception -> 0x031b }
                    com.bytedance.ies.dmt.ui.b.a$a r1 = r3.mo18906c()     // Catch:{ Exception -> 0x031b }
                    java.lang.String r2 = r2.getTitle()     // Catch:{ Exception -> 0x031b }
                    com.bytedance.ies.dmt.ui.b.a$a r1 = r1.mo18892a(r2)     // Catch:{ Exception -> 0x031b }
                    r1.f28292w = r5     // Catch:{ Exception -> 0x031b }
                    com.bytedance.ies.dmt.ui.b.a$a r1 = r1.mo18898b()     // Catch:{ Exception -> 0x031b }
                    com.bytedance.ies.dmt.ui.b.a$a r1 = r1.mo18905b(r11)     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.h$o r2 = new com.ss.android.ugc.aweme.feed.helper.h$o     // Catch:{ Exception -> 0x031b }
                    r2.<init>()     // Catch:{ Exception -> 0x031b }
                    com.bytedance.ies.dmt.ui.b.o$a r2 = (com.bytedance.ies.dmt.p664ui.p666b.C10657o.C10658a) r2     // Catch:{ Exception -> 0x031b }
                    com.bytedance.ies.dmt.ui.b.a$a r1 = r1.mo18890a(r2)     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.h$p r2 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.C30384p.f79437a     // Catch:{ Exception -> 0x031b }
                    android.content.DialogInterface$OnDismissListener r2 = (android.content.DialogInterface.OnDismissListener) r2     // Catch:{ Exception -> 0x031b }
                    com.bytedance.ies.dmt.ui.b.a$a r4 = r1.mo18888a(r2)     // Catch:{ Exception -> 0x031b }
                    java.lang.String r1 = r15.getId()     // Catch:{ Exception -> 0x031b }
                    com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79390k = r1     // Catch:{ Exception -> 0x031b }
                    int r1 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79391l     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.h$b r2 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.C30370b.BINARY     // Catch:{ Exception -> 0x031b }
                    int r2 = r2.getType()     // Catch:{ Exception -> 0x031b }
                    if (r1 != r2) goto L_0x0266
                    if (r6 != 0) goto L_0x0203
                    p2628d.p2639f.p2641b.C52711k.m112234a()     // Catch:{ Exception -> 0x031d }
                L_0x0203:
                    int r1 = r6.size()     // Catch:{ Exception -> 0x031b }
                    r2 = 2
                    if (r1 < r2) goto L_0x00cb
                    java.lang.Object r1 = r6.get(r11)     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.Option r1 = (com.p683ss.android.ugc.aweme.feed.helper.Option) r1     // Catch:{ Exception -> 0x031b }
                    java.lang.String r3 = r1.getName()     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.h$i r16 = new com.ss.android.ugc.aweme.feed.helper.h$i     // Catch:{ Exception -> 0x031b }
                    r1 = r16
                    r2 = r6
                    r11 = r3
                    r3 = r12
                    r10 = r4
                    r4 = r20
                    r18 = r5
                    r5 = r22
                    r0 = r6
                    r6 = r23
                    r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x031b }
                    r1 = r16
                    android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1     // Catch:{ Exception -> 0x031b }
                    com.bytedance.ies.dmt.ui.b.a$a r11 = r10.mo18893a(r11, r1)     // Catch:{ Exception -> 0x031b }
                    r1 = 1
                    java.lang.Object r2 = r0.get(r1)     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.Option r2 = (com.p683ss.android.ugc.aweme.feed.helper.Option) r2     // Catch:{ Exception -> 0x031b }
                    java.lang.String r6 = r2.getName()     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.h$j r16 = new com.ss.android.ugc.aweme.feed.helper.h$j     // Catch:{ Exception -> 0x031b }
                    r1 = r16
                    r2 = r0
                    r3 = r12
                    r4 = r20
                    r5 = r22
                    r0 = r6
                    r6 = r23
                    r1.<init>(r2, r3, r4, r5, r6)     // Catch:{ Exception -> 0x031b }
                    r1 = r16
                    android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1     // Catch:{ Exception -> 0x031b }
                    com.bytedance.ies.dmt.ui.b.a$a r0 = r11.mo18903b(r0, r1)     // Catch:{ Exception -> 0x031b }
                    java.lang.String r1 = r15.getCancelText()     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.h$k r2 = new com.ss.android.ugc.aweme.feed.helper.h$k     // Catch:{ Exception -> 0x031b }
                    r2.<init>(r12, r7, r8, r9)     // Catch:{ Exception -> 0x031b }
                    android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2     // Catch:{ Exception -> 0x031b }
                    com.bytedance.ies.dmt.ui.b.a$a r0 = r0.mo18908c(r1, r2)     // Catch:{ Exception -> 0x031b }
                    r1 = 1
                    r0.f28262G = r1     // Catch:{ Exception -> 0x031b }
                    goto L_0x028a
                L_0x0266:
                    r10 = r4
                    r18 = r5
                    java.lang.String r0 = r15.getSubmitText()     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.h$l r1 = new com.ss.android.ugc.aweme.feed.helper.h$l     // Catch:{ Exception -> 0x031b }
                    r1.<init>(r12, r7, r8, r9)     // Catch:{ Exception -> 0x031b }
                    android.content.DialogInterface$OnClickListener r1 = (android.content.DialogInterface.OnClickListener) r1     // Catch:{ Exception -> 0x031b }
                    com.bytedance.ies.dmt.ui.b.a$a r0 = r10.mo18893a(r0, r1)     // Catch:{ Exception -> 0x031b }
                    java.lang.String r1 = r15.getCancelText()     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.h$m r2 = new com.ss.android.ugc.aweme.feed.helper.h$m     // Catch:{ Exception -> 0x031b }
                    r2.<init>(r12, r7, r8, r9)     // Catch:{ Exception -> 0x031b }
                    android.content.DialogInterface$OnClickListener r2 = (android.content.DialogInterface.OnClickListener) r2     // Catch:{ Exception -> 0x031b }
                    com.bytedance.ies.dmt.ui.b.a$a r0 = r0.mo18903b(r1, r2)     // Catch:{ Exception -> 0x031b }
                    r1 = 0
                    r0.f28268M = r1     // Catch:{ Exception -> 0x031b }
                L_0x028a:
                    com.bytedance.ies.dmt.ui.b.a r0 = r10.mo18897a()     // Catch:{ Exception -> 0x031b }
                    int r1 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79391l     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.h$b r2 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.C30370b.BINARY     // Catch:{ Exception -> 0x031b }
                    int r2 = r2.getType()     // Catch:{ Exception -> 0x031b }
                    if (r1 == r2) goto L_0x02b1
                    if (r18 == 0) goto L_0x02a9
                    r5 = r18
                    com.ss.android.ugc.aweme.feed.helper.l r5 = (com.p683ss.android.ugc.aweme.feed.helper.C30388l) r5     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.h$n r1 = new com.ss.android.ugc.aweme.feed.helper.h$n     // Catch:{ Exception -> 0x031b }
                    r1.<init>(r0)     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.n r1 = (com.p683ss.android.ugc.aweme.feed.helper.C30390n) r1     // Catch:{ Exception -> 0x031b }
                    r5.setOptionListener(r1)     // Catch:{ Exception -> 0x031b }
                    goto L_0x02b1
                L_0x02a9:
                    d.u r0 = new d.u     // Catch:{ Exception -> 0x031b }
                    java.lang.String r1 = "null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.helper.MTFeedSurvey"
                    r0.<init>(r1)     // Catch:{ Exception -> 0x031b }
                    throw r0     // Catch:{ Exception -> 0x031b }
                L_0x02b1:
                    r0.mo18883c()     // Catch:{ Exception -> 0x031b }
                    r1 = 1
                    com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79393n = r1     // Catch:{ Exception -> 0x031b }
                    r17 = 0
                    com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79383d = r17     // Catch:{ Exception -> 0x031b }
                    com.p683ss.android.ugc.aweme.feed.helper.C30368h.m71293b()     // Catch:{ Exception -> 0x031b }
                    com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79386g = r13     // Catch:{ Exception -> 0x031b }
                    java.lang.String r0 = r15.getId()     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.feed.helper.h$b[] r2 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.C30370b.values()     // Catch:{ Exception -> 0x031b }
                    int r3 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79391l     // Catch:{ Exception -> 0x031b }
                    r2 = r2[r3]     // Catch:{ Exception -> 0x031b }
                    java.lang.String r2 = r2.name()     // Catch:{ Exception -> 0x031b }
                    if (r2 == 0) goto L_0x0305
                    java.lang.String r2 = r2.toLowerCase()     // Catch:{ Exception -> 0x031b }
                    java.lang.String r3 = "(this as java.lang.String).toLowerCase()"
                    p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)     // Catch:{ Exception -> 0x031b }
                    java.lang.String r3 = "survey_notify"
                    com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()     // Catch:{ Exception -> 0x031b }
                    java.lang.String r5 = "group_id"
                    java.lang.String r6 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79388i     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)     // Catch:{ Exception -> 0x031b }
                    java.lang.String r5 = "survey_id"
                    com.ss.android.ugc.aweme.app.f.d r0 = r4.mo47829a(r5, r0)     // Catch:{ Exception -> 0x031b }
                    java.lang.String r4 = "author_id"
                    java.lang.String r5 = com.p683ss.android.ugc.aweme.feed.helper.C30368h.f79389j     // Catch:{ Exception -> 0x031b }
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r5)     // Catch:{ Exception -> 0x031b }
                    java.lang.String r4 = "type"
                    com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r4, r2)     // Catch:{ Exception -> 0x031b }
                    java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a     // Catch:{ Exception -> 0x031b }
                    com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r0)     // Catch:{ Exception -> 0x031b }
                    r17 = 1
                    goto L_0x030d
                L_0x0305:
                    d.u r0 = new d.u     // Catch:{ Exception -> 0x031b }
                    java.lang.String r1 = "null cannot be cast to non-null type java.lang.String"
                    r0.<init>(r1)     // Catch:{ Exception -> 0x031b }
                    throw r0     // Catch:{ Exception -> 0x031b }
                L_0x030d:
                    if (r17 == 0) goto L_0x031b
                    r0 = r19
                    com.ss.android.ugc.aweme.feed.panel.b r1 = com.p683ss.android.ugc.aweme.feed.panel.C30616b.this     // Catch:{ Exception -> 0x031d }
                    java.util.Set<java.lang.String> r1 = r1.f79951K     // Catch:{ Exception -> 0x031d }
                    r1.clear()     // Catch:{ Exception -> 0x031d }
                    r7 = r21
                    goto L_0x031d
                L_0x031b:
                    r0 = r19
                L_0x031d:
                    return r7
                */
                throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.panel.C30616b.C3062315.mo55067a(int, int, int, int):int");
            }
        };
        this.f79974aG = 29000;
        this.f79975aH = true;
        this.f79979aM = null;
        this.f79980aN = new ArrayList();
        this.f79981aO = "home_swipe_up_lottie_android.json";
        this.f79976aI = null;
        this.f79987ae.setEventType(str);
        this.f79987ae.setPageType(i);
        this.f79986ad = C30687a.m71966a().newDialogController(str, i, this, this);
        this.f80013f = new C25707d(str, i);
        this.f79988af = new C30200o(str, i, this);
        this.f79989ag = new C30187b();
        this.f79989ag.mo60481a(this.f79986ad);
        this.f79989ag.mo60481a(this.f80013f);
        this.f79989ag.mo60481a(this.f79988af);
        C48039k.m104037a(m71642a());
        C23794bh.m58401o().mo85304a((C41522ac) this);
        try {
            int intValue = C32816h.m75716b().getBackgroundPausePlayerSetting().intValue();
            if (intValue != 0) {
                this.f80022p = new C30604al(this, intValue);
            }
        } catch (Throwable th) {
            C32458a.m75148a(th);
        }
    }

    /* renamed from: b */
    public final void mo62859b(Aweme aweme, int i) throws C26880f {
        try {
            if (this.f79959S != null) {
                this.f79959S.mo60875a(C26881g.m64989a(aweme, i));
            } else {
                mo55789a(aweme, i);
            }
        } catch (C26880f e) {
            C32458a.m75143a((Exception) e);
            mo55789a(aweme, i);
        }
    }

    /* renamed from: b */
    public final void mo62860b(Aweme aweme, String str) {
        if (!C23718g.m58207b().mo49153d()) {
            C10691a.m21542b((Context) this.f121964aK, (int) R.string.cg1).mo19066a();
        } else if (aweme != null && aweme.getAuthor() != null) {
            String uid = aweme.getAuthor().getUid();
            String secUid = aweme.getAuthor().getSecUid();
            this.f79961U.mo66349a(new C39970a().mo81871a(uid).mo81874b(secUid).mo81869a(0).mo81876c(ay_()).mo81878d(C31190f.m72838f(mo60519ak())).mo81870a(aweme).mo81879e(str).mo81877d(aweme.getAuthor().getFollowerStatus()).mo81872a());
        }
    }

    /* renamed from: a */
    private void m71647a(Aweme aweme, String str, boolean z) {
        String str2;
        String str3;
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("author_id", aweme.getAuthorUid());
            jSONObject.put("group_id", aweme.getAid());
            jSONObject.put("enter_from", ay_());
            jSONObject.put("impr_type", C23198ae.m56883s(aweme));
            jSONObject.put("compilation_id", aweme.getMixId());
            jSONObject.put("request_id", mo60497S().optString("request_id"));
            jSONObject.put("enter_type", "normal_way");
            if (!"homepage_hot".equals(ay_())) {
                jSONObject.put("previous_page", mo62872bl());
            }
            jSONObject.put("request_id", C23198ae.m56847a(aweme, mo60502X()));
            if (!TextUtils.isEmpty(C23198ae.m56861e(aweme))) {
                jSONObject.put("poi_id", C23198ae.m56861e(aweme));
            }
            if (C23198ae.m56858c(ay_())) {
                jSONObject.put("poi_type", C23198ae.m56867h(aweme));
                jSONObject.put("poi_channel", C23198ae.m56852b());
                jSONObject.put("city_info", C23198ae.m56845a());
                jSONObject.put("distance_info", C23198ae.m56869i(aweme));
            }
            jSONObject.put("is_photo", C23198ae.m56878n(aweme));
        } catch (JSONException unused) {
        }
        C26890h.m65008a(mo96010bw(), "follow", ay_(), str, C23198ae.m56877m(aweme), jSONObject);
        if (z) {
            mo58363a(aweme, str);
        } else {
            C23254x a = new C23254x().mo48171a(mo60874g(true));
            if (TextUtils.isEmpty(mo60491M())) {
                str2 = ay_();
            } else {
                str2 = mo60491M();
            }
            C23254x c = a.mo48174c(str2);
            if (TextUtils.isEmpty(mo60491M())) {
                str3 = "follow_button";
            } else {
                str3 = mo62870bj();
            }
            c.mo48175d(str3).mo48172b("follow_button").mo48176e(str).mo48173c(aweme, mo60502X()).mo48076e();
        }
        if (z && TextUtils.equals(ay_(), "search_result")) {
            C23794bh.m58411y().mo56824a("search_follow", str, "search_video", true, "");
        }
    }

    /* renamed from: a */
    public static boolean m71650a(Context context, Aweme aweme, String str) {
        if (aweme == null || C25945k.m62920k().mo53954a(context, aweme, str) || C26469cc.m64000b(aweme)) {
            return false;
        }
        return true;
    }

    /* renamed from: a */
    private void m71648a(Aweme aweme, String str, boolean z, String str2) {
        if (aweme != null) {
            this.f79993ak = true;
            m71655b(aweme, str, z, str2);
        }
    }

    /* renamed from: b */
    private void m71655b(Aweme aweme, String str, boolean z, String str2) {
        if (aweme == null) {
            C25069a.m60928b("AWEME == NULL");
            return;
        }
        if (this.f79986ad.mo60470c() == null) {
            C25069a.m60928b("ACTIVITY == NULL");
        } else if (this.f79986ad.mo60470c().isFinishing()) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        if (!RelationLabelHelper.hasDuoShanLabel(aweme) && RelationLabelHelper.hasCommentId(aweme)) {
            arrayList.add(aweme.getFeedRelationLabel().getExtra().getCid());
        } else if (aweme.getOriginCommentIds() != null) {
            arrayList.addAll(aweme.getOriginCommentIds());
        }
        if (!TextUtils.isEmpty(str)) {
            arrayList.add(str);
        }
        C30016ag aj = mo60518aj();
        C29984ac acVar = null;
        if (aj != null) {
            acVar = aj.mo60184I();
        }
        C25165a d = new C25165a(C31190f.m72835c(aweme)).mo51331a((List<String>) arrayList).mo51329a(acVar).mo51334b(mo60499U()).mo51341e(this.f79987ae.getObjectId()).mo51343f(this.f79987ae.getCardType()).mo51345g(this.f79987ae.getCreationId()).mo51338c(z).mo51344f(this.f79987ae.isFromPostList()).mo51337c(str2).mo51339d(mo60491M());
        mo55785a(d, aweme);
        this.f79986ad.mo51536a(d.mo51333a());
        this.f80014g = false;
        if (!(aweme == null || aweme.getAid() == null || mo62836aK() == null || mo62836aK().mo60188M() == null)) {
            mo62836aK();
            aweme.getAid();
        }
    }
}
