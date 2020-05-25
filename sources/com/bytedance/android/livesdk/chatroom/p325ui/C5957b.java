package com.bytedance.android.livesdk.chatroom.p325ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.app.Dialog;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnDismissListener;
import android.content.DialogInterface.OnKeyListener;
import android.content.Intent;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.p030v4.app.C0649f;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.widget.DrawerLayout;
import android.text.TextUtils;
import android.util.DisplayMetrics;
import android.view.GestureDetector;
import android.view.GestureDetector.SimpleOnGestureListener;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.Window;
import android.view.inputmethod.InputMethodManager;
import android.widget.Chronometer;
import android.widget.FrameLayout;
import android.widget.LinearLayout;
import android.widget.RelativeLayout.LayoutParams;
import android.widget.TextView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.base.model.user.C3012k;
import com.bytedance.android.live.base.model.user.User;
import com.bytedance.android.live.broadcast.api.dummy.BroadcastServiceDummy;
import com.bytedance.android.live.broadcast.api.model.DutyGiftInfo;
import com.bytedance.android.live.broadcast.api.p194a.C3034a;
import com.bytedance.android.live.broadcast.api.p194a.C3034a.C3035a;
import com.bytedance.android.live.broadcast.api.p197d.C3050a;
import com.bytedance.android.live.broadcast.api.p197d.C3054d;
import com.bytedance.android.live.browser.C3805a;
import com.bytedance.android.live.core.p223b.C3829a;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p225d.C3833a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p230g.C3889d;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.core.performance.C3974b;
import com.bytedance.android.live.core.performance.C3982g;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.bytedance.android.live.core.rxutils.autodispose.C4002ac;
import com.bytedance.android.live.core.rxutils.autodispose.C4021e;
import com.bytedance.android.live.core.widget.C4104a;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.gift.p248b.C4122a;
import com.bytedance.android.live.gift.p248b.C4123b;
import com.bytedance.android.live.gift.p248b.C4124c;
import com.bytedance.android.live.p180b.p181a.p183b.C2949a;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4184d;
import com.bytedance.android.live.room.C4184d.C4185a;
import com.bytedance.android.live.room.C4194m;
import com.bytedance.android.live.uikit.p257c.C4204a;
import com.bytedance.android.live.uikit.p257c.C4206c;
import com.bytedance.android.live.wallet.C4383d;
import com.bytedance.android.live.wallet.IWalletService;
import com.bytedance.android.live.wallet.IWalletService.C4283a;
import com.bytedance.android.live.wallet.model.FirstChargeCheck;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.banner.InRoomBannerManager;
import com.bytedance.android.livesdk.browser.jsbridge.newmethods.C4889bp;
import com.bytedance.android.livesdk.browser.jsbridge.p296a.C4765c;
import com.bytedance.android.livesdk.browser.jsbridge.p296a.C4766d;
import com.bytedance.android.livesdk.browser.p289c.C4704c;
import com.bytedance.android.livesdk.browser.p290d.C4715c;
import com.bytedance.android.livesdk.browser.p290d.C4742w;
import com.bytedance.android.livesdk.chatroom.detail.C5070h;
import com.bytedance.android.livesdk.chatroom.event.C5156ab;
import com.bytedance.android.livesdk.chatroom.event.C5158ad;
import com.bytedance.android.livesdk.chatroom.event.C5160af;
import com.bytedance.android.livesdk.chatroom.event.C5161ag;
import com.bytedance.android.livesdk.chatroom.event.C5170ap;
import com.bytedance.android.livesdk.chatroom.event.C5171aq;
import com.bytedance.android.livesdk.chatroom.event.C5173as;
import com.bytedance.android.livesdk.chatroom.event.C5176av;
import com.bytedance.android.livesdk.chatroom.event.C5181b;
import com.bytedance.android.livesdk.chatroom.event.C5185e;
import com.bytedance.android.livesdk.chatroom.event.C5186f;
import com.bytedance.android.livesdk.chatroom.event.C5190j;
import com.bytedance.android.livesdk.chatroom.event.C5194n;
import com.bytedance.android.livesdk.chatroom.event.C5204w;
import com.bytedance.android.livesdk.chatroom.event.C5205x;
import com.bytedance.android.livesdk.chatroom.event.C5206y;
import com.bytedance.android.livesdk.chatroom.event.UserProfileEvent;
import com.bytedance.android.livesdk.chatroom.interact.C5284aq;
import com.bytedance.android.livesdk.chatroom.model.C5745d;
import com.bytedance.android.livesdk.chatroom.model.EnterRoomExtra;
import com.bytedance.android.livesdk.chatroom.model.ShareReportResult;
import com.bytedance.android.livesdk.chatroom.p305b.C4997a;
import com.bytedance.android.livesdk.chatroom.p306bl.C5006c;
import com.bytedance.android.livesdk.chatroom.p306bl.C5007d;
import com.bytedance.android.livesdk.chatroom.p306bl.C5007d.C5009a;
import com.bytedance.android.livesdk.chatroom.p310f.C5234s;
import com.bytedance.android.livesdk.chatroom.presenter.C5838bs;
import com.bytedance.android.livesdk.chatroom.presenter.C5859ce;
import com.bytedance.android.livesdk.chatroom.presenter.C5875i;
import com.bytedance.android.livesdk.chatroom.view.C6235a;
import com.bytedance.android.livesdk.chatroom.view.C6236b;
import com.bytedance.android.livesdk.chatroom.viewmodule.BarrageWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentPromotionWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommonGuideWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.CommonToastWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget.C6275a;
import com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.EnterAnimWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.FirstRechargeWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.GameQuizWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.PromotionStatusWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.RadioWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.RechargeWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.RoomPushWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.TextMessageWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.UserPermissionCheckWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6597a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6600d.C6601a;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.DutyGiftToolbarWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.LiveToolbarWidget;
import com.bytedance.android.livesdk.chatroom.widget.AnimationLayer;
import com.bytedance.android.livesdk.chatroom.widget.C6672d;
import com.bytedance.android.livesdk.chatroom.widget.CountDownView;
import com.bytedance.android.livesdk.chatroom.widget.DebugInfoView;
import com.bytedance.android.livesdk.chatroom.widget.LiveRoomTopBelowWidget;
import com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.chatroom.widget.LiveRoomWatchUserWidget;
import com.bytedance.android.livesdk.config.C6718b;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.drawerfeed.C6749b;
import com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView;
import com.bytedance.android.livesdk.gift.model.C7505d;
import com.bytedance.android.livesdk.gift.model.C7514m;
import com.bytedance.android.livesdk.gift.p378h.C7459a;
import com.bytedance.android.livesdk.kickout.p389a.C7721b;
import com.bytedance.android.livesdk.message.model.C7818aw;
import com.bytedance.android.livesdk.message.model.C7862cc;
import com.bytedance.android.livesdk.message.model.C8009t;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p271ac.C4519a;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4565af;
import com.bytedance.android.livesdk.p279af.C4570aj;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p279af.p280a.C4551a;
import com.bytedance.android.livesdk.p282ag.p283a.C4627a;
import com.bytedance.android.livesdk.p329e.C6751a;
import com.bytedance.android.livesdk.p330f.C6773h;
import com.bytedance.android.livesdk.p388k.C7713e;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.C8065e.C8066a;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p401b.C8042k;
import com.bytedance.android.livesdk.p399o.p401b.C8045n;
import com.bytedance.android.livesdk.p399o.p402c.C8052c;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.p399o.p402c.C8060k;
import com.bytedance.android.livesdk.p403p.C8071a;
import com.bytedance.android.livesdk.p421v.C8374c;
import com.bytedance.android.livesdk.user.C8325b.C8326a;
import com.bytedance.android.livesdk.user.C8325b.C8327b;
import com.bytedance.android.livesdk.user.C8333e;
import com.bytedance.android.livesdk.user.C8334f;
import com.bytedance.android.livesdk.user.C8335g;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdk.widget.GestureDetectLayout;
import com.bytedance.android.livesdkapi.C8606b;
import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.p443b.C8686a;
import com.bytedance.android.livesdkapi.depend.p433a.C8614a;
import com.bytedance.android.livesdkapi.depend.p434b.C8617c;
import com.bytedance.android.livesdkapi.depend.p437e.C8629a;
import com.bytedance.android.livesdkapi.depend.p439g.C8632a;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b;
import com.bytedance.android.livesdkapi.depend.p439g.C8633b.C8635a;
import com.bytedance.android.livesdkapi.host.C8777a;
import com.bytedance.android.livesdkapi.p430b.C8607a;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.android.livesdkapi.p445e.C8735e;
import com.bytedance.android.livesdkapi.p449g.C8745a;
import com.bytedance.android.livesdkapi.p455i.C8818h;
import com.bytedance.android.livesdkapi.p458l.p459a.C8839e;
import com.bytedance.android.livesdkapi.service.C8862e;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.p619a.C10175a;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.bytedance.ies.sdk.widgets.LiveWidget;
import com.bytedance.ies.sdk.widgets.NextLiveData;
import com.bytedance.ies.sdk.widgets.RecyclableWidgetManager;
import com.bytedance.ies.sdk.widgets.Widget;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.ttm.player.MediaPlayer;
import com.p683ss.ugc.live.sdk.message.interfaces.IMessageManager;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1674ab;
import p064c.p065a.C1683ag;
import p064c.p065a.C2203w;
import p064c.p065a.p066a.p068b.C1667a;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p069b.C1690c;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p093k.C2168a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.b */
public abstract class C5957b extends C0649f implements C0199s<KVData>, C3035a, C4124c, C4184d, C5009a, C6235a, C6236b, C6275a, C8614a, C9382a, C10175a {

    /* renamed from: N */
    public static String f15689N = "hide_share_lead";

    /* renamed from: A */
    protected RecyclableWidgetManager f15690A;

    /* renamed from: B */
    public TextMessageWidget f15691B;

    /* renamed from: C */
    DecorationWrapperWidget f15692C;

    /* renamed from: D */
    LiveToolbarWidget f15693D;

    /* renamed from: E */
    public CommentWidget f15694E;

    /* renamed from: F */
    LiveRoomUserInfoWidget f15695F;

    /* renamed from: G */
    protected LiveRoomTopBelowWidget f15696G;

    /* renamed from: H */
    public BarrageWidget f15697H;

    /* renamed from: I */
    public C8333e f15698I;

    /* renamed from: J */
    public LinearLayout f15699J;

    /* renamed from: K */
    public boolean f15700K = false;

    /* renamed from: L */
    long f15701L = 0;

    /* renamed from: M */
    public TextView f15702M;

    /* renamed from: O */
    C5284aq f15703O;

    /* renamed from: P */
    C4123b f15704P = new C4123b() {
        /* renamed from: b */
        public final void mo9494b() {
            C4575an.m10981a((int) R.string.eh4);
        }

        /* renamed from: a */
        public final void mo9491a() {
            C4575an.m10981a((int) R.string.f0x);
            C5957b.this.f15815x.lambda$put$1$DataCenter("cmd_show_recharge_dialog", new C5173as(0, "live_detail"));
        }

        /* renamed from: a */
        public final void mo9493a(String str) {
            C4575an.m10987a(str);
        }

        /* renamed from: a */
        public final void mo9492a(C7514m mVar) {
            C5957b.this.mo9495b();
            if (C4565af.m10958a() != null && C5957b.this.mo11919i()) {
                C4565af.m10958a().insertMessage(((IGiftService) C4116c.m10249a(IGiftService.class)).getGiftMessage(C5957b.this.f15715a.getId(), mVar, C5957b.this.f15811t));
            }
            C5957b.this.f15815x.get("log_enter_live_source");
            String str = (String) C5957b.this.f15815x.get("log_action_type");
            C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
            String str2 = "";
            String str3 = "";
            if (a.mo14192a().containsKey("source")) {
                str3 = (String) a.mo14192a().get("source");
            }
            if (a.mo14192a().containsKey("enter_from")) {
                str2 = (String) a.mo14192a().get("enter_from");
            }
            HashMap hashMap = new HashMap();
            hashMap.put("event_type", "core");
            hashMap.put("event_belong", "live_interact");
            hashMap.put("event_page", "live_detail");
            hashMap.put("room_id", String.valueOf(C5957b.this.f15715a.getId()));
            hashMap.put("enter_from", str2);
            hashMap.put("anchor_id", String.valueOf(C5957b.this.f15715a.getOwner().getId()));
            hashMap.put("gift_id", String.valueOf(mVar.f20613e));
            hashMap.put("live_type", "video_live");
            hashMap.put("gift_type", "convenient_gift");
            hashMap.put("source", str3);
            hashMap.put("request_page", "shortcut");
            hashMap.put("event_type", "other");
            hashMap.put("event_module", "bottom_tab");
            hashMap.put("money", "1");
            hashMap.put("gift_cnt", "1");
            hashMap.put("action_type", str);
            HashMap hashMap2 = new HashMap();
            hashMap2.put(Long.valueOf(mVar.f20613e), Integer.valueOf(1));
            hashMap.put("gift_info", C7459a.m15414a(hashMap2));
            hashMap.put("is_first_consume", String.valueOf(C4627a.m11090a(TTLiveSDKContext.getHostService().mo10315h().mo14521a())));
            hashMap.put("growth_deepevent", "1");
            C8049c.m15979a().mo14202a("send_gift", hashMap, new Object[0]);
        }
    };

    /* renamed from: Q */
    public final Handler f15705Q = new Handler(Looper.getMainLooper());

    /* renamed from: R */
    public Runnable f15706R = new Runnable() {
        public final void run() {
            if (!BroadcastServiceDummy.hasShown) {
                if (((Boolean) C5957b.this.f15815x.get(C5957b.f15689N, Boolean.valueOf(false))).booleanValue()) {
                    C5957b.this.f15705Q.postDelayed(C5957b.this.f15706R, 5000);
                    return;
                }
                C5957b.this.mo11944s();
            }
        }
    };

    /* renamed from: S */
    private C5972a f15707S = C5972a.NORMAL;

    /* renamed from: T */
    private C5972a f15708T = this.f15707S;

    /* renamed from: U */
    private String f15709U;

    /* renamed from: V */
    private EnterRoomExtra f15710V;

    /* renamed from: W */
    private boolean f15711W;

    /* renamed from: X */
    private volatile boolean f15712X;

    /* renamed from: Y */
    private CountDownView f15713Y;

    /* renamed from: Z */
    private AnimationLayer f15714Z;

    /* renamed from: a */
    protected Room f15715a;

    /* renamed from: aA */
    private LiveRoomNotifyWidget f15716aA;

    /* renamed from: aB */
    private DutyGiftToolbarWidget f15717aB;

    /* renamed from: aC */
    private LiveRoomWatchUserWidget f15718aC;

    /* renamed from: aD */
    private PromotionStatusWidget f15719aD;

    /* renamed from: aE */
    private RadioWidget f15720aE;

    /* renamed from: aF */
    private CommentPromotionWidget f15721aF;

    /* renamed from: aG */
    private RoomPushWidget f15722aG;

    /* renamed from: aH */
    private BottomRightBannerWidget f15723aH;

    /* renamed from: aI */
    private BottomRightBannerContainerWidget f15724aI;

    /* renamed from: aJ */
    private RechargeWidget f15725aJ;

    /* renamed from: aK */
    private LiveShareWidget f15726aK;

    /* renamed from: aL */
    private C3050a f15727aL;

    /* renamed from: aM */
    private FirstRechargeWidget f15728aM;

    /* renamed from: aN */
    private CommonToastWidget f15729aN;

    /* renamed from: aO */
    private FollowGuideWidget f15730aO;

    /* renamed from: aP */
    private UserPermissionCheckWidget f15731aP;

    /* renamed from: aQ */
    private EndWidget f15732aQ;

    /* renamed from: aR */
    private PopularCardWidget f15733aR;

    /* renamed from: aS */
    private CommonGuideWidget f15734aS;

    /* renamed from: aT */
    private View f15735aT;

    /* renamed from: aU */
    private int f15736aU;

    /* renamed from: aV */
    private FrameLayout f15737aV;

    /* renamed from: aW */
    private boolean f15738aW;

    /* renamed from: aX */
    private TextView f15739aX;

    /* renamed from: aY */
    private TextView f15740aY;

    /* renamed from: aZ */
    private LottieAnimationView f15741aZ;

    /* renamed from: aa */
    private Chronometer f15742aa;

    /* renamed from: ab */
    private TextView f15743ab;

    /* renamed from: ac */
    private View f15744ac;

    /* renamed from: ad */
    private View f15745ad;

    /* renamed from: ae */
    private View f15746ae;

    /* renamed from: af */
    private View f15747af;

    /* renamed from: ag */
    private LayoutParams f15748ag;

    /* renamed from: ah */
    private LayoutParams f15749ah;

    /* renamed from: ai */
    private C0649f f15750ai;

    /* renamed from: aj */
    private boolean f15751aj;

    /* renamed from: ak */
    private GestureDetectLayout f15752ak;

    /* renamed from: al */
    private FrameLayout f15753al;

    /* renamed from: am */
    private View f15754am;

    /* renamed from: an */
    private C5875i f15755an;

    /* renamed from: ao */
    private C5838bs f15756ao;

    /* renamed from: ap */
    private C5859ce f15757ap;

    /* renamed from: aq */
    private C8071a f15758aq;

    /* renamed from: ar */
    private boolean f15759ar = false;

    /* renamed from: as */
    private InRoomBannerManager f15760as;

    /* renamed from: at */
    private C6072db f15761at;

    /* renamed from: au */
    private C6090di f15762au;

    /* renamed from: av */
    private C6162et f15763av;

    /* renamed from: aw */
    private Dialog f15764aw;

    /* renamed from: ax */
    private Widget f15765ax;

    /* renamed from: ay */
    private EnterAnimWidget f15766ay;

    /* renamed from: az */
    private GameQuizWidget f15767az;

    /* renamed from: b */
    public boolean f15768b;

    /* renamed from: ba */
    private C3034a f15769ba;

    /* renamed from: bb */
    private C3054d f15770bb;

    /* renamed from: bc */
    private int f15771bc;

    /* renamed from: bd */
    private DebugInfoView f15772bd;

    /* renamed from: be */
    private View f15773be;

    /* renamed from: bf */
    private C8374c f15774bf;

    /* renamed from: bg */
    private C8735e f15775bg;

    /* renamed from: bh */
    private OnKeyListener f15776bh = new OnKeyListener() {

        /* renamed from: b */
        private boolean f15819b;

        public final boolean onKey(DialogInterface dialogInterface, int i, KeyEvent keyEvent) {
            if (keyEvent.getAction() == 0) {
                this.f15819b = true;
                return false;
            } else if (4 != i || !this.f15819b) {
                return false;
            } else {
                C5957b.this.mo8466a();
                this.f15819b = false;
                return true;
            }
        }
    };

    /* renamed from: bi */
    private C1683ag<C3009i> f15777bi = new C1683ag<C3009i>() {
        public final void onError(Throwable th) {
            C5957b.this.mo11908a(th);
        }

        public final void onSubscribe(C1690c cVar) {
            C5957b.this.f15807p.mo6181a(cVar);
        }

        public final /* synthetic */ void onSuccess(Object obj) {
            boolean z;
            C3009i iVar = (C3009i) obj;
            if (C5957b.this.mo11941p() && iVar != null) {
                C5957b.this.f15811t = (User) iVar;
                C5957b.this.f15815x.lambda$put$1$DataCenter("data_user_in_room", C5957b.this.f15811t);
                C4525b.f12330Z.mo10346a(Boolean.valueOf(C5957b.this.f15811t.getRoomAutoGiftThanks()));
                C3012k userAttr = C5957b.this.f15811t.getUserAttr();
                if (!(userAttr == null || C5957b.this.f15694E == null)) {
                    C5957b.this.f15694E.mo12318b(userAttr.f8850a);
                }
                if (userAttr == null || !userAttr.f8850a) {
                    z = false;
                } else {
                    z = true;
                }
                C4889bp.f13165a = z;
            }
        }
    };

    /* renamed from: bj */
    private Dialog f15778bj = null;

    /* renamed from: bk */
    private C4122a f15779bk;

    /* renamed from: bl */
    private boolean f15780bl = true;

    /* renamed from: bm */
    private int f15781bm;

    /* renamed from: bn */
    private int f15782bn;

    /* renamed from: bo */
    private int f15783bo;

    /* renamed from: bp */
    private int f15784bp;

    /* renamed from: bq */
    private boolean f15785bq = false;

    /* renamed from: br */
    private OnClickListener f15786br = new C6020c(this);

    /* renamed from: bs */
    private Runnable f15787bs;

    /* renamed from: bt */
    private long f15788bt;

    /* renamed from: bu */
    private Runnable f15789bu = new Runnable() {
        public final void run() {
            if (C5957b.this.f15768b && TTLiveSDKContext.getHostService().mo10315h().mo14532c() && !C5957b.this.f15794c) {
                if (!C5957b.this.f15715a.getOwner().isFollowing()) {
                    C5957b.this.mo11913b(true);
                    C5957b.this.f15795d = true;
                }
                C5957b.this.mo11900a(120000);
            }
        }
    };

    /* renamed from: bv */
    private Runnable f15790bv = new C6070d(this);

    /* renamed from: bw */
    private boolean f15791bw = false;

    /* renamed from: bx */
    private OnTouchListener f15792bx = new OnTouchListener() {
        /* JADX WARNING: Removed duplicated region for block: B:19:0x0057  */
        /* JADX WARNING: Removed duplicated region for block: B:20:0x0059  */
        /* JADX WARNING: Removed duplicated region for block: B:33:0x008f  */
        /* Code decompiled incorrectly, please refer to instructions dump. */
        public final boolean onTouch(android.view.View r6, android.view.MotionEvent r7) {
            /*
                r5 = this;
                int r6 = r7.getActionMasked()
                r0 = 1
                if (r0 != r6) goto L_0x0014
                com.bytedance.android.livesdk.chatroom.ui.b r6 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this
                boolean r6 = r6.mo11891j()
                if (r6 != 0) goto L_0x0014
                com.bytedance.android.livesdk.chatroom.ui.b r6 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this
                r6.mo11903a(r7)
            L_0x0014:
                com.bytedance.android.livesdk.chatroom.ui.b r6 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this
                com.bytedance.android.livesdk.chatroom.ui.z r6 = r6.f15810s
                java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r1 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
                com.bytedance.android.live.base.b r1 = com.bytedance.android.live.p245d.C4116c.m10249a(r1)
                com.bytedance.android.live.broadcast.api.IBroadcastService r1 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r1
                com.bytedance.android.live.broadcast.api.b.c r1 = r1.composerManager()
                r2 = 0
                if (r1 == 0) goto L_0x0054
                java.lang.String r3 = com.bytedance.android.live.broadcast.api.C3037b.f8914b
                java.util.List r1 = r1.mo8260a(r3)
                int r3 = r1.size()
                if (r3 <= 0) goto L_0x0054
                java.util.Iterator r1 = r1.iterator()
            L_0x0037:
                boolean r3 = r1.hasNext()
                if (r3 == 0) goto L_0x0054
                java.lang.Object r3 = r1.next()
                com.bytedance.android.livesdkapi.depend.model.c r3 = (com.bytedance.android.livesdkapi.depend.model.C8688c) r3
                java.util.List<java.lang.String> r3 = r3.f23746g
                if (r3 == 0) goto L_0x0037
                int r4 = r3.size()
                if (r4 <= 0) goto L_0x0037
                java.lang.String r1 = "TouchGes"
                boolean r1 = r3.contains(r1)
                goto L_0x0055
            L_0x0054:
                r1 = 0
            L_0x0055:
                if (r1 != 0) goto L_0x0059
                r0 = 0
                goto L_0x008d
            L_0x0059:
                int r1 = r7.getAction()
                r1 = r1 & 255(0xff, float:3.57E-43)
                android.view.ScaleGestureDetector r3 = r6.f16719b
                r3.onTouchEvent(r7)
                if (r1 != 0) goto L_0x0068
                r6.f16720c = r2
            L_0x0068:
                int r3 = r7.getPointerCount()
                if (r3 <= r0) goto L_0x0070
                r6.f16720c = r0
            L_0x0070:
                boolean r3 = r6.f16720c
                if (r3 != 0) goto L_0x0079
                android.support.v4.view.d r3 = r6.f16718a
                r3.mo3213a(r7)
            L_0x0079:
                switch(r1) {
                    case 0: goto L_0x0089;
                    case 1: goto L_0x007d;
                    default: goto L_0x007c;
                }
            L_0x007c:
                goto L_0x008d
            L_0x007d:
                r6.f16721d = r2
                r1 = 202(0xca, float:2.83E-43)
                com.bytedance.android.livesdk.chatroom.event.aa$a r6 = r6.mo12265a(r7, r0)
                com.bytedance.android.livesdk.chatroom.p325ui.C6230z.m13403a(r1, r6)
                goto L_0x008d
            L_0x0089:
                r6.f16721d = r0
                r6.f16722e = r7
            L_0x008d:
                if (r0 != 0) goto L_0x0096
                com.bytedance.android.livesdk.chatroom.ui.b r6 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this
                android.view.GestureDetector r6 = r6.f15809r
                r6.onTouchEvent(r7)
            L_0x0096:
                return r2
            */
            throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C59675.onTouch(android.view.View, android.view.MotionEvent):boolean");
        }
    };

    /* renamed from: by */
    private C4185a f15793by;

    /* renamed from: c */
    protected boolean f15794c;

    /* renamed from: d */
    public boolean f15795d;

    /* renamed from: e */
    protected boolean f15796e;

    /* renamed from: f */
    public boolean f15797f;

    /* renamed from: g */
    protected int f15798g;

    /* renamed from: h */
    View f15799h;

    /* renamed from: i */
    protected View f15800i;

    /* renamed from: j */
    protected View f15801j;

    /* renamed from: k */
    protected View f15802k;

    /* renamed from: l */
    protected View f15803l;

    /* renamed from: m */
    protected FrameLayout f15804m;

    /* renamed from: n */
    View f15805n;

    /* renamed from: o */
    protected View f15806o;

    /* renamed from: p */
    public final C1689b f15807p = new C1689b();

    /* renamed from: q */
    protected C9381g f15808q = new C9381g(this);

    /* renamed from: r */
    public GestureDetector f15809r;

    /* renamed from: s */
    public C6230z f15810s;

    /* renamed from: t */
    public User f15811t;

    /* renamed from: u */
    public C8710m f15812u;

    /* renamed from: v */
    public List<C6751a> f15813v = new ArrayList();

    /* renamed from: w */
    public C5070h f15814w;

    /* renamed from: x */
    protected DataCenter f15815x;

    /* renamed from: y */
    public C6773h f15816y;

    /* renamed from: z */
    public C4104a f15817z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.b$a */
    enum C5972a {
        NORMAL,
        RADIO,
        RADIO_INTERACT,
        PK
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.b$b */
    final class C5973b extends SimpleOnGestureListener {
        private C5973b() {
        }

        public final boolean onDown(MotionEvent motionEvent) {
            C5957b bVar = C5957b.this;
            if (bVar.mo11941p()) {
                try {
                    ((InputMethodManager) bVar.getActivity().getSystemService("input_method")).hideSoftInputFromWindow(bVar.f15799h.getWindowToken(), 0);
                } catch (Exception unused) {
                }
            }
            return true;
        }

        public final void onLongPress(MotionEvent motionEvent) {
            super.onLongPress(motionEvent);
            if (C5957b.this.f15715a != null) {
                C4495a.m10823a().mo10301a((Object) new C5204w(26, C5957b.this.f15715a));
            }
        }

        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            if (!C5957b.this.f15794c && !((Boolean) C4638d.m11114a().f12651b).booleanValue() && C5957b.this.f15697H != null && C5957b.this.f15697H.mo12305a(false)) {
                return true;
            }
            return false;
        }

        public final boolean onFling(MotionEvent motionEvent, MotionEvent motionEvent2, float f, float f2) {
            if ((C5957b.this.f15812u.isStreamingBackground && C5957b.this.f15794c) || motionEvent == null || motionEvent2 == null) {
                return false;
            }
            if (!C5957b.this.f15794c) {
                C4116c.m10249a(C8777a.class);
            }
            float x = motionEvent2.getX() - motionEvent.getX();
            if (Math.abs(x) <= 200.0f || Math.abs(f) <= 100.0f) {
                return false;
            }
            if (C5957b.this.f15794c) {
                C5957b.this.mo11911b(x);
            } else {
                C5957b.this.mo11915c(x);
            }
            return true;
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.b$c */
    public interface C5974c {
        /* renamed from: a */
        void mo11962a(long j, long j2);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.b$d */
    class C5975d implements C6601a {
        /* renamed from: a */
        public final void mo8419a(View view, DataCenter dataCenter) {
        }

        /* renamed from: a */
        public final void mo8420a(C6597a aVar) {
        }

        /* renamed from: b */
        public final void mo8421b(View view, DataCenter dataCenter) {
        }

        private C5975d() {
        }

        public final void onClick(View view) {
            String str;
            String str2;
            BroadcastServiceDummy.hasShown = true;
            if (C4570aj.m10971a()) {
                String str3 = (String) C5957b.this.f15815x.get("log_action_type");
                HashMap hashMap = new HashMap();
                hashMap.put("position", "detail_bottom_bar");
                C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
                if (a != null) {
                    hashMap.putAll(a.mo14192a());
                }
                C8038g a2 = C8049c.m15979a().mo14201a(Room.class);
                if (a2 != null) {
                    hashMap.putAll(a2.mo14192a());
                }
                if (C5957b.this.getActivity() != null) {
                    C8635a a3 = C8633b.m17040a(C5957b.this.f15715a);
                    if (C5957b.this.f15794c) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(C5957b.this.f15715a.getShareUrl());
                        sb.append("&anchor_id=");
                        sb.append(C5957b.this.f15715a.getOwnerUserId());
                        a3.mo15119d(sb.toString());
                    }
                    a3.mo15111a(C5957b.this.f15698I.mo14529b());
                    a3.f23673v = C5957b.this.f15715a.getId();
                    a3.f23674w = C5957b.this.f15715a.getOwnerUserId();
                    if (!(a3.f23671t != null || C8049c.m15979a().mo14201a(Room.class) == null || C8049c.m15979a().mo14201a(Room.class).mo14192a() == null || C8049c.m15979a().mo14201a(Room.class).mo14192a().get("request_id") == null)) {
                        a3.f23671t = (String) C8049c.m15979a().mo14201a(Room.class).mo14192a().get("request_id");
                    }
                    if (C5957b.this.f15715a == null || C5957b.this.f15715a.getOwner() == null || C5957b.this.f15715a.getOwner().getSecret() != 1) {
                        if (C5957b.this.mo11942q()) {
                            HashMap hashMap2 = new HashMap();
                            hashMap2.putAll(hashMap);
                            hashMap2.put("room_id", String.valueOf(C5957b.this.f15715a.getId()));
                            hashMap2.put("request_page", "live_room");
                            String str4 = "live_type";
                            C5957b bVar = C5957b.this;
                            if (bVar.f15812u == null || bVar.f15812u.equals(C8710m.VIDEO)) {
                                str2 = "video_live";
                            } else if (bVar.f15812u.equals(C8710m.THIRD_PARTY)) {
                                str2 = "third_party";
                            } else {
                                str2 = "video_live";
                            }
                            hashMap2.put(str4, str2);
                            C8049c.m15979a().mo14202a("anchor_share_click", hashMap2, new C8059j(), Room.class);
                        }
                        C4519a e = TTLiveSDKContext.getHostService().mo10312e();
                        FragmentActivity activity = C5957b.this.getActivity();
                        if (C5957b.this.f15794c) {
                            str = C5957b.this.f15715a.getAnchorShareText();
                        } else {
                            str = C5957b.this.f15715a.getUserShareText();
                        }
                        e.mo10343a(activity, a3.mo15117b(str).mo15115a(C5957b.this.f15794c).mo15114a((Map<String, String>) hashMap).mo15112a(C4600j.m11037a(C5957b.this.f15815x)).mo15120e(str3).mo15116a(), new C8632a() {
                            /* renamed from: a */
                            public final void mo8971a(Throwable th) {
                            }

                            /* JADX WARNING: Removed duplicated region for block: B:27:0x007d  */
                            /* JADX WARNING: Removed duplicated region for block: B:28:0x007f  */
                            /* JADX WARNING: Removed duplicated region for block: B:29:0x0081  */
                            /* JADX WARNING: Removed duplicated region for block: B:30:0x0083  */
                            /* JADX WARNING: Removed duplicated region for block: B:31:0x0085  */
                            /* JADX WARNING: Removed duplicated region for block: B:34:0x00f1  */
                            /* JADX WARNING: Removed duplicated region for block: B:35:0x00f4  */
                            /* JADX WARNING: Removed duplicated region for block: B:49:0x018b  */
                            /* JADX WARNING: Removed duplicated region for block: B:59:? A[ADDED_TO_REGION, RETURN, SYNTHETIC] */
                            /* renamed from: a */
                            /* Code decompiled incorrectly, please refer to instructions dump. */
                            public final void mo8970a(java.lang.String r18, java.lang.String r19) {
                                /*
                                    r17 = this;
                                    r0 = r17
                                    r1 = r18
                                    r2 = r19
                                    com.bytedance.android.livesdk.chatroom.ui.b$d r3 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.this
                                    com.bytedance.android.livesdk.chatroom.ui.b$d r4 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.this
                                    com.bytedance.android.livesdk.chatroom.ui.b r4 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this
                                    com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r4.f15715a
                                    long r4 = r4.getId()
                                    com.bytedance.android.livesdk.chatroom.ui.b$d r6 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.this
                                    com.bytedance.android.livesdk.chatroom.ui.b r6 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this
                                    com.bytedance.android.livesdkapi.depend.model.live.Room r6 = r6.f15715a
                                    java.lang.String r6 = r6.getLabels()
                                    com.bytedance.android.livesdk.af.o r7 = new com.bytedance.android.livesdk.af.o
                                    r7.<init>()
                                    java.lang.String r8 = "target_id"
                                    int r9 = r19.hashCode()
                                    r10 = -791575966(0xffffffffd0d18262, float:-2.81198633E10)
                                    r11 = 0
                                    r12 = 4
                                    r13 = 3
                                    r14 = -1
                                    r15 = 2
                                    r16 = 1
                                    if (r9 == r10) goto L_0x006f
                                    r10 = 3616(0xe20, float:5.067E-42)
                                    if (r9 == r10) goto L_0x0065
                                    r10 = 108102557(0x671839d, float:4.5423756E-35)
                                    if (r9 == r10) goto L_0x005b
                                    r10 = 113011944(0x6bc6ce8, float:7.0877763E-35)
                                    if (r9 == r10) goto L_0x0051
                                    r10 = 1355475581(0x50caea7d, float:2.72349204E10)
                                    if (r9 == r10) goto L_0x0047
                                    goto L_0x0079
                                L_0x0047:
                                    java.lang.String r9 = "weixin_moment"
                                    boolean r9 = r2.equals(r9)
                                    if (r9 == 0) goto L_0x0079
                                    r9 = 3
                                    goto L_0x007a
                                L_0x0051:
                                    java.lang.String r9 = "weibo"
                                    boolean r9 = r2.equals(r9)
                                    if (r9 == 0) goto L_0x0079
                                    r9 = 4
                                    goto L_0x007a
                                L_0x005b:
                                    java.lang.String r9 = "qzone"
                                    boolean r9 = r2.equals(r9)
                                    if (r9 == 0) goto L_0x0079
                                    r9 = 1
                                    goto L_0x007a
                                L_0x0065:
                                    java.lang.String r9 = "qq"
                                    boolean r9 = r2.equals(r9)
                                    if (r9 == 0) goto L_0x0079
                                    r9 = 0
                                    goto L_0x007a
                                L_0x006f:
                                    java.lang.String r9 = "weixin"
                                    boolean r9 = r2.equals(r9)
                                    if (r9 == 0) goto L_0x0079
                                    r9 = 2
                                    goto L_0x007a
                                L_0x0079:
                                    r9 = -1
                                L_0x007a:
                                    switch(r9) {
                                        case 0: goto L_0x0085;
                                        case 1: goto L_0x0083;
                                        case 2: goto L_0x0081;
                                        case 3: goto L_0x0086;
                                        case 4: goto L_0x007f;
                                        default: goto L_0x007d;
                                    }
                                L_0x007d:
                                    r12 = -1
                                    goto L_0x0086
                                L_0x007f:
                                    r12 = 5
                                    goto L_0x0086
                                L_0x0081:
                                    r12 = 3
                                    goto L_0x0086
                                L_0x0083:
                                    r12 = 2
                                    goto L_0x0086
                                L_0x0085:
                                    r12 = 1
                                L_0x0086:
                                    java.lang.String r9 = java.lang.String.valueOf(r12)
                                    com.bytedance.android.livesdk.af.o r7 = r7.mo10399a(r8, r9)
                                    java.lang.String r8 = "share_type"
                                    java.lang.String r9 = "1"
                                    com.bytedance.android.livesdk.af.o r7 = r7.mo10399a(r8, r9)
                                    java.lang.String r8 = "common_label_list"
                                    java.lang.String r6 = java.lang.String.valueOf(r6)
                                    com.bytedance.android.livesdk.af.o r6 = r7.mo10399a(r8, r6)
                                    java.util.HashMap<java.lang.String, java.lang.String> r6 = r6.f12568a
                                    com.bytedance.android.livesdk.ab.f r7 = com.bytedance.android.livesdk.p270ab.C4514j.m10883j()
                                    com.bytedance.android.live.network.e r7 = r7.mo10321b()
                                    java.lang.Class<com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi> r8 = com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi.class
                                    java.lang.Object r7 = r7.mo9550a(r8)
                                    com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi r7 = (com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi) r7
                                    c.a.v r4 = r7.sendShare(r4, r6)
                                    com.bytedance.android.live.core.rxutils.g r5 = com.bytedance.android.live.core.rxutils.C4064k.m10182a()
                                    c.a.v r4 = r4.mo6513a(r5)
                                    com.bytedance.android.livesdk.chatroom.ui.u r5 = new com.bytedance.android.livesdk.chatroom.ui.u
                                    r5.<init>(r3)
                                    c.a.d.e r3 = com.bytedance.android.live.core.rxutils.C4064k.m10187b()
                                    r4.mo6505a(r5, r3)
                                    com.bytedance.android.livesdk.chatroom.ui.b$d r3 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.this
                                    java.util.HashMap r4 = new java.util.HashMap
                                    r4.<init>()
                                    java.lang.String r5 = "share_platform"
                                    r4.put(r5, r1)
                                    java.lang.String r5 = "is_pyramid_sale"
                                    java.lang.String r6 = "0"
                                    r4.put(r5, r6)
                                    java.lang.String r5 = "type"
                                    r4.put(r5, r2)
                                    java.lang.String r5 = "share_type"
                                    r4.put(r5, r2)
                                    java.lang.String r2 = "user_type"
                                    com.bytedance.android.livesdk.chatroom.ui.b r3 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this
                                    boolean r3 = r3.mo11942q()
                                    if (r3 == 0) goto L_0x00f4
                                    java.lang.String r3 = "anchor"
                                    goto L_0x00f6
                                L_0x00f4:
                                    java.lang.String r3 = "user"
                                L_0x00f6:
                                    r4.put(r2, r3)
                                    java.lang.String r2 = "request_page"
                                    java.lang.String r3 = "live_room"
                                    r4.put(r2, r3)
                                    com.bytedance.android.livesdk.o.c r2 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
                                    java.lang.String r3 = "share"
                                    java.lang.Object[] r5 = new java.lang.Object[r15]
                                    com.bytedance.android.livesdk.o.c.j r6 = new com.bytedance.android.livesdk.o.c.j
                                    r6.<init>()
                                    r5[r11] = r6
                                    java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r6 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
                                    r5[r16] = r6
                                    r2.mo14202a(r3, r4, r5)
                                    com.bytedance.android.livesdk.chatroom.ui.b$d r2 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.this
                                    com.bytedance.android.livesdk.chatroom.ui.b r2 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this
                                    com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.f15815x
                                    boolean r2 = com.bytedance.android.livesdk.p279af.C4600j.m11040b(r2)
                                    if (r2 == 0) goto L_0x017f
                                    com.bytedance.android.livesdk.chatroom.ui.b$d r2 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.this
                                    com.bytedance.android.livesdk.chatroom.ui.b r2 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this
                                    com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r2.f15715a
                                    com.bytedance.android.live.base.model.user.i r2 = r2.author()
                                    if (r2 == 0) goto L_0x017f
                                    java.lang.String r2 = "chat_merge"
                                    boolean r2 = android.text.TextUtils.equals(r1, r2)
                                    if (r2 != 0) goto L_0x017f
                                    org.json.JSONObject r2 = new org.json.JSONObject
                                    r2.<init>()
                                    java.lang.String r3 = "anchor_id"
                                    com.bytedance.android.livesdk.chatroom.ui.b$d r4 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.this     // Catch:{ JSONException -> 0x0165 }
                                    com.bytedance.android.livesdk.chatroom.ui.b r4 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this     // Catch:{ JSONException -> 0x0165 }
                                    com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r4.f15715a     // Catch:{ JSONException -> 0x0165 }
                                    com.bytedance.android.live.base.model.user.i r4 = r4.author()     // Catch:{ JSONException -> 0x0165 }
                                    long r4 = r4.getId()     // Catch:{ JSONException -> 0x0165 }
                                    java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x0165 }
                                    r2.put(r3, r4)     // Catch:{ JSONException -> 0x0165 }
                                    java.lang.String r3 = "room_id"
                                    com.bytedance.android.livesdk.chatroom.ui.b$d r4 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.this     // Catch:{ JSONException -> 0x0165 }
                                    com.bytedance.android.livesdk.chatroom.ui.b r4 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this     // Catch:{ JSONException -> 0x0165 }
                                    com.bytedance.android.livesdkapi.depend.model.live.Room r4 = r4.f15715a     // Catch:{ JSONException -> 0x0165 }
                                    long r4 = r4.getId()     // Catch:{ JSONException -> 0x0165 }
                                    java.lang.String r4 = java.lang.String.valueOf(r4)     // Catch:{ JSONException -> 0x0165 }
                                    r2.put(r3, r4)     // Catch:{ JSONException -> 0x0165 }
                                L_0x0165:
                                    java.lang.Class<com.bytedance.android.livesdkapi.d.a> r3 = com.bytedance.android.livesdkapi.p432d.C8612a.class
                                    com.bytedance.android.live.p245d.C4116c.m10249a(r3)
                                    com.bytedance.android.livesdk.o.e$a r3 = com.bytedance.android.livesdk.p399o.C8065e.C8066a.m16007a()
                                    com.bytedance.android.livesdk.o.e$a r2 = r3.mo14223a(r2)
                                    com.bytedance.android.livesdk.chatroom.ui.b$d r3 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.this
                                    com.bytedance.android.livesdk.chatroom.ui.b r3 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this
                                    com.bytedance.ies.sdk.widgets.DataCenter r3 = r3.f15815x
                                    java.util.Map r3 = com.bytedance.android.livesdk.p279af.C4600j.m11041c(r3)
                                    r2.mo14222a(r3)
                                L_0x017f:
                                    com.bytedance.android.livesdk.chatroom.ui.b$d r2 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.this
                                    com.bytedance.android.livesdk.chatroom.ui.b r2 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this
                                    com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.f15815x
                                    boolean r2 = com.bytedance.android.livesdk.p279af.C4600j.m11043d(r2)
                                    if (r2 == 0) goto L_0x01e8
                                    com.bytedance.android.livesdk.chatroom.ui.b$d r2 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.this
                                    com.bytedance.android.livesdk.chatroom.ui.b r2 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this
                                    com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r2.f15715a
                                    com.bytedance.android.live.base.model.user.i r2 = r2.author()
                                    if (r2 == 0) goto L_0x01e8
                                    java.lang.String r2 = "chat_merge"
                                    boolean r1 = android.text.TextUtils.equals(r1, r2)
                                    if (r1 != 0) goto L_0x01e8
                                    org.json.JSONObject r1 = new org.json.JSONObject
                                    r1.<init>()
                                    java.lang.String r2 = "anchor_id"
                                    com.bytedance.android.livesdk.chatroom.ui.b$d r3 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.this     // Catch:{ JSONException -> 0x01ce }
                                    com.bytedance.android.livesdk.chatroom.ui.b r3 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this     // Catch:{ JSONException -> 0x01ce }
                                    com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r3.f15715a     // Catch:{ JSONException -> 0x01ce }
                                    com.bytedance.android.live.base.model.user.i r3 = r3.author()     // Catch:{ JSONException -> 0x01ce }
                                    long r3 = r3.getId()     // Catch:{ JSONException -> 0x01ce }
                                    java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x01ce }
                                    r1.put(r2, r3)     // Catch:{ JSONException -> 0x01ce }
                                    java.lang.String r2 = "room_id"
                                    com.bytedance.android.livesdk.chatroom.ui.b$d r3 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.this     // Catch:{ JSONException -> 0x01ce }
                                    com.bytedance.android.livesdk.chatroom.ui.b r3 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this     // Catch:{ JSONException -> 0x01ce }
                                    com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r3.f15715a     // Catch:{ JSONException -> 0x01ce }
                                    long r3 = r3.getId()     // Catch:{ JSONException -> 0x01ce }
                                    java.lang.String r3 = java.lang.String.valueOf(r3)     // Catch:{ JSONException -> 0x01ce }
                                    r1.put(r2, r3)     // Catch:{ JSONException -> 0x01ce }
                                L_0x01ce:
                                    java.lang.Class<com.bytedance.android.livesdkapi.d.a> r2 = com.bytedance.android.livesdkapi.p432d.C8612a.class
                                    com.bytedance.android.live.p245d.C4116c.m10249a(r2)
                                    com.bytedance.android.livesdk.o.e$a r2 = com.bytedance.android.livesdk.p399o.C8065e.C8066a.m16007a()
                                    com.bytedance.android.livesdk.o.e$a r1 = r2.mo14223a(r1)
                                    com.bytedance.android.livesdk.chatroom.ui.b$d r2 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.this
                                    com.bytedance.android.livesdk.chatroom.ui.b r2 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.this
                                    com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.f15815x
                                    java.util.Map r2 = com.bytedance.android.livesdk.p279af.C4600j.m11044e(r2)
                                    r1.mo14222a(r2)
                                L_0x01e8:
                                    return
                                */
                                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5975d.C59761.mo8970a(java.lang.String, java.lang.String):void");
                            }
                        });
                        return;
                    }
                    C8862e liveService = TTLiveSDKContext.getLiveService();
                    Context context = C5957b.this.getContext();
                    C8818h hVar = new C8818h(C5957b.this.f15715a.getId(), C5957b.this.f15715a.getOwnerUserId(), C5957b.this.f15715a.getOwnerUserId(), C5957b.this.f15715a.getOwner().getSecUid(), "anchor_profile");
                    liveService.mo15040a(context, hVar);
                }
            }
        }
    }

    /* renamed from: y */
    private void mo12179y() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo11888a(View view, Bundle bundle);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo11911b(float f) {
    }

    /* renamed from: g */
    public abstract boolean mo11890g();

    /* renamed from: h */
    public View mo11918h() {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public boolean mo11891j() {
        return false;
    }

    /* renamed from: o */
    public final Room mo11923o() {
        return this.f15715a;
    }

    public void onStop() {
        super.onStop();
    }

    /* renamed from: p */
    public final boolean mo11941p() {
        return this.f15768b;
    }

    /* renamed from: q */
    public final boolean mo11942q() {
        return this.f15794c;
    }

    /* renamed from: r */
    public final C8710m mo11943r() {
        return this.f15812u;
    }

    /* renamed from: a */
    public final void mo9585a(DataCenter dataCenter, boolean z, C4185a aVar, EnterRoomExtra enterRoomExtra) {
        this.f15815x = dataCenter;
        this.f15715a = (Room) dataCenter.get("data_room");
        this.f15710V = enterRoomExtra;
        mo11895x();
        if (this.f15709U == null) {
            this.f15709U = "";
        }
        this.f15794c = z;
        this.f15793by = aVar;
    }

    /* renamed from: a */
    public final void mo9584a(C8710m mVar) {
        this.f15812u = mVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11909a(boolean z, int i) {
        this.f15796e = z;
        this.f15798g = i;
        if (this.f15735aT != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) this.f15735aT.getLayoutParams();
            if (this.f15798g > 0) {
                marginLayoutParams.topMargin = this.f15798g - C3922z.m9899a(36.0f);
            } else {
                marginLayoutParams.topMargin = C3922z.m9908b() / 2;
            }
            this.f15735aT.setLayoutParams(marginLayoutParams);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:59:0x028f  */
    /* JADX WARNING: Removed duplicated region for block: B:62:0x02a2  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x02c1  */
    /* JADX WARNING: Removed duplicated region for block: B:77:0x02fc  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public void onActivityCreated(android.os.Bundle r14) {
        /*
            r13 = this;
            super.onActivityCreated(r14)
            android.view.View r0 = r13.getView()
            r1 = 0
            if (r0 == 0) goto L_0x0884
            android.content.Context r2 = r13.getContext()
            android.view.ViewConfiguration r2 = android.view.ViewConfiguration.get(r2)
            int r2 = r2.getScaledTouchSlop()
            int r2 = r2 * 3
            r13.f15771bc = r2
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r13.f15815x
            if (r2 == 0) goto L_0x0884
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r13.f15815x
            java.lang.String r3 = "cmd_show_user_profile"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observe(r3, r13)
            java.lang.String r3 = "data_user_in_room"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observeForever(r3, r13)
            java.lang.String r3 = "data_screen_record_is_open"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observeForever(r3, r13)
            java.lang.String r3 = "data_is_followed"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observeForever(r3, r13)
            java.lang.String r3 = "cmd_interact_audio"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observe(r3, r13)
            java.lang.String r3 = "cmd_live_radio"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observe(r3, r13)
            java.lang.String r3 = "cmd_widget_loaded"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observeForever(r3, r13)
            java.lang.String r3 = "cmd_video_orientation_changed"
            r4 = 1
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observe(r3, r13, r4)
            java.lang.String r3 = "cmd_pk_state_change"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observeForever(r3, r13)
            java.lang.String r3 = "cmd_normal_gift_widget_layout_change"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observe(r3, r13, r4)
            java.lang.String r3 = "cmd_enter_widget_layout_change"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observe(r3, r13, r4)
            java.lang.String r3 = "cmd_refresh_user_in_room"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observeForever(r3, r13)
            java.lang.String r3 = "cmd_sticker_is_selected"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observe(r3, r13)
            java.lang.String r3 = "data_login_event"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observeForever(r3, r13)
            java.lang.String r3 = "cmd_interact_player_view_change"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observe(r3, r13)
            java.lang.String r3 = "cmd_show_fans_club_setting"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observe(r3, r13)
            java.lang.String r3 = "cmd_adjust_video_interact_stream_bottom"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observe(r3, r13)
            java.lang.String r3 = "cmd_duty_gift_changed"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observeForever(r3, r13)
            java.lang.String r3 = "cmd_close_h5_dialog"
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r2.observe(r3, r13)
            java.lang.String r3 = "cmd_official_hide"
            r2.observe(r3, r13)
            java.lang.String r2 = ""
            com.bytedance.android.livesdk.p399o.C8064d.m16005b()
            java.lang.String r3 = "ttlive_room"
            java.lang.String r5 = "prepare load widget"
            com.bytedance.android.livesdk.p399o.C8064d.m9720b(r3, r5)
            com.bytedance.android.livesdk.o.c r3 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.Class<com.bytedance.android.livesdk.o.b.k> r5 = com.bytedance.android.livesdk.p399o.p401b.C8042k.class
            com.bytedance.android.livesdk.o.b.g r3 = r3.mo14201a(r5)
            if (r3 == 0) goto L_0x00c6
            java.util.Map r3 = r3.mo14192a()
            if (r3 == 0) goto L_0x00c6
            java.lang.String r5 = "source"
            boolean r5 = r3.containsKey(r5)
            if (r5 == 0) goto L_0x00c6
            java.lang.String r2 = "source"
            java.lang.Object r2 = r3.get(r2)
            java.lang.String r2 = (java.lang.String) r2
        L_0x00c6:
            android.support.v4.app.k r3 = r13.getChildFragmentManager()
            android.content.Context r5 = r13.getContext()
            com.bytedance.android.livesdk.f.h r6 = new com.bytedance.android.livesdk.f.h
            r6.<init>()
            r6.f18548b = r5
            r6.f18549c = r0
            r6.f18550d = r14
            android.support.v4.app.r r3 = r3.mo2225a()
            java.lang.String r5 = com.bytedance.android.livesdk.p330f.C6773h.f18547a
            android.support.v4.app.r r3 = r3.mo2178a(r6, r5)
            r3.mo2200e()
            r13.f15816y = r6
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = com.bytedance.ies.sdk.widgets.RecyclableWidgetManager.m22271of(r13, r0)
            r13.f15690A = r3
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            com.bytedance.android.livesdk.y r5 = com.bytedance.android.livesdk.C8580y.m16962a()
            r3.setWidgetProvider(r5)
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            com.bytedance.ies.sdk.widgets.DataCenter r5 = r13.f15815x
            r3.setDataCenter(r5)
            com.bytedance.android.livesdk.banner.InRoomBannerManager r3 = new com.bytedance.android.livesdk.banner.InRoomBannerManager
            r3.<init>(r13)
            r13.f15760as = r3
            boolean r3 = r13.f15794c
            if (r3 == 0) goto L_0x010f
            com.bytedance.android.livesdkapi.depend.model.live.m r3 = r13.f15812u
            boolean r3 = r3.isStreamingBackground
            if (r3 == 0) goto L_0x011c
        L_0x010f:
            com.bytedance.android.livesdk.banner.InRoomBannerManager r3 = r13.f15760as
            com.bytedance.android.livesdkapi.depend.model.live.Room r5 = r13.f15715a
            long r5 = r5.getId()
            boolean r7 = r13.f15794c
            r3.mo10434a(r5, r7)
        L_0x011c:
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r13.f15815x
            java.lang.String r5 = "data_room"
            com.bytedance.android.livesdkapi.depend.model.live.Room r6 = r13.f15715a
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r3.lambda$put$1$DataCenter(r5, r6)
            java.lang.String r5 = "data_room_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r6 = r13.f15715a
            long r6 = r6.getId()
            java.lang.Long r6 = java.lang.Long.valueOf(r6)
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r3.lambda$put$1$DataCenter(r5, r6)
            java.lang.String r5 = "data_is_anchor"
            boolean r6 = r13.f15794c
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r3.lambda$put$1$DataCenter(r5, r6)
            java.lang.String r5 = "data_is_portrait"
            boolean r6 = r13.mo11890g()
            java.lang.Boolean r6 = java.lang.Boolean.valueOf(r6)
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r3.lambda$put$1$DataCenter(r5, r6)
            java.lang.String r5 = "data_live_mode"
            com.bytedance.android.livesdkapi.depend.model.live.m r6 = r13.f15812u
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r3.lambda$put$1$DataCenter(r5, r6)
            java.lang.String r5 = "data_user_center"
            com.bytedance.android.livesdk.user.e r6 = r13.f15698I
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r3.lambda$put$1$DataCenter(r5, r6)
            java.lang.String r5 = "data_in_room_banner_manager"
            com.bytedance.android.livesdk.banner.InRoomBannerManager r6 = r13.f15760as
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r3.lambda$put$1$DataCenter(r5, r6)
            java.lang.String r5 = "data_enter_source"
            r3.lambda$put$1$DataCenter(r5, r2)
            boolean r2 = r13.m12968B()
            if (r2 != 0) goto L_0x0184
            boolean r2 = r13.mo11891j()
            if (r2 != 0) goto L_0x0184
            com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget
            r2.<init>()
            r13.f15692C = r2
            com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget r2 = r13.f15692C
            r2.f16942j = r13
        L_0x0184:
            com.bytedance.android.livesdk.chatroom.viewmodule.RechargeWidget r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.RechargeWidget
            r2.<init>()
            r13.f15725aJ = r2
            boolean r2 = com.bytedance.android.livesdkapi.p430b.C8607a.f23572a
            if (r2 == 0) goto L_0x0196
            com.bytedance.android.livesdk.chatroom.viewmodule.FirstRechargeWidget r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.FirstRechargeWidget
            r2.<init>()
            r13.f15728aM = r2
        L_0x0196:
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r13.f15815x
            java.lang.String r3 = "data_xt_broadcast_type"
            r5 = -1
            java.lang.Integer r6 = java.lang.Integer.valueOf(r5)
            java.lang.Object r2 = r2.get(r3, r6)
            java.lang.Integer r2 = (java.lang.Integer) r2
            r2.intValue()
            com.bytedance.ies.sdk.widgets.DataCenter r9 = r13.f15815x
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r13.mo11923o()
            if (r2 == 0) goto L_0x0355
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r13.mo11923o()
            com.bytedance.android.live.base.model.user.User r2 = r2.getOwner()
            if (r2 == 0) goto L_0x0355
            com.bytedance.android.livesdk.ab.e r2 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdkapi.e.d r2 = r2.mo10317j()
            if (r2 == 0) goto L_0x0355
            com.bytedance.android.livesdk.chatroom.ui.s r2 = new com.bytedance.android.livesdk.chatroom.ui.s
            r2.<init>(r13, r9)
            r13.f15775bg = r2
            java.lang.String r2 = "data_is_anchor"
            java.lang.Object r2 = r9.get(r2)
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r7 = r2.booleanValue()
            com.bytedance.android.livesdkapi.depend.model.live.Room r10 = r13.mo11923o()
            if (r10 == 0) goto L_0x0355
            com.bytedance.android.livesdk.commerce.a r11 = new com.bytedance.android.livesdk.commerce.a
            r11.<init>(r10)
            com.bytedance.android.livesdk.o.c r2 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.Class<com.bytedance.android.livesdk.o.c.j> r3 = com.bytedance.android.livesdk.p399o.p402c.C8059j.class
            com.bytedance.android.livesdk.o.b.g r2 = r2.mo14201a(r3)
            boolean r3 = r2 instanceof com.bytedance.android.livesdk.p399o.p401b.C8042k
            if (r3 == 0) goto L_0x0229
            com.bytedance.android.livesdk.o.b.k r2 = (com.bytedance.android.livesdk.p399o.p401b.C8042k) r2
            java.util.Map r3 = r2.mo14192a()
            java.lang.String r6 = "enter_from"
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x0207
            java.util.Map r3 = r2.mo14192a()
            java.lang.String r6 = "enter_from"
            r3.get(r6)
        L_0x0207:
            java.util.Map r3 = r2.mo14192a()
            java.lang.String r6 = "source"
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x021c
            java.util.Map r3 = r2.mo14192a()
            java.lang.String r6 = "source"
            r3.get(r6)
        L_0x021c:
            java.util.Map r2 = r2.mo14192a()
            java.lang.String r3 = "enter_from_merge"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x022b
        L_0x0229:
            java.lang.String r2 = ""
        L_0x022b:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0238
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r11.f18281a
            java.lang.String r6 = "enter_from_merge"
            r3.put(r6, r2)
        L_0x0238:
            java.lang.String r2 = "enter_method"
            java.lang.String r2 = com.bytedance.android.livesdk.chatroom.p310f.C5216e.m11829a(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x024b
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r11.f18281a
            java.lang.String r6 = "enter_method"
            r3.put(r6, r2)
        L_0x024b:
            java.lang.String r2 = "action_type"
            java.lang.String r2 = com.bytedance.android.livesdk.chatroom.p310f.C5216e.m11829a(r2)
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x025e
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r11.f18281a
            java.lang.String r6 = "action_type"
            r3.put(r6, r2)
        L_0x025e:
            com.bytedance.android.livesdk.o.c r2 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.Class<com.bytedance.android.livesdk.o.c.j> r3 = com.bytedance.android.livesdk.p399o.p402c.C8059j.class
            com.bytedance.android.livesdk.o.b.g r2 = r2.mo14201a(r3)
            boolean r3 = r2 instanceof com.bytedance.android.livesdk.p399o.p401b.C8042k
            if (r3 == 0) goto L_0x0287
            com.bytedance.android.livesdk.o.b.k r2 = (com.bytedance.android.livesdk.p399o.p401b.C8042k) r2
            java.util.Map r3 = r2.mo14192a()
            java.lang.String r6 = "video_id"
            boolean r3 = r3.containsKey(r6)
            if (r3 == 0) goto L_0x0287
            java.util.Map r2 = r2.mo14192a()
            java.lang.String r3 = "video_id"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            goto L_0x0289
        L_0x0287:
            java.lang.String r2 = ""
        L_0x0289:
            boolean r3 = android.text.TextUtils.isEmpty(r2)
            if (r3 != 0) goto L_0x0296
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r11.f18281a
            java.lang.String r6 = "group_id"
            r3.put(r6, r2)
        L_0x0296:
            com.bytedance.android.livesdk.o.c r2 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r3 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
            com.bytedance.android.livesdk.o.b.g r2 = r2.mo14201a(r3)
            if (r2 == 0) goto L_0x02bb
            java.util.Map r2 = r2.mo14192a()
            if (r2 == 0) goto L_0x02bb
            java.lang.String r3 = "request_id"
            java.lang.Object r2 = r2.get(r3)
            java.lang.String r2 = (java.lang.String) r2
            boolean r6 = android.text.TextUtils.isEmpty(r2)
            if (r6 != 0) goto L_0x02bb
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r11.f18281a
            r6.put(r3, r2)
        L_0x02bb:
            boolean r2 = com.bytedance.android.livesdk.p279af.C4600j.m11040b(r9)
            if (r2 == 0) goto L_0x02f6
            java.util.Map r2 = com.bytedance.android.livesdk.p279af.C4600j.m11041c(r9)
            if (r2 == 0) goto L_0x02f6
            java.lang.String r3 = "value"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r6 = "log_extra"
            java.lang.Object r2 = r2.get(r6)
            if (r3 == 0) goto L_0x02f6
            if (r2 == 0) goto L_0x02f6
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r11.f18281a
            java.lang.String r8 = "aweme_ad_type"
            java.lang.String r12 = "dou_plus"
            r6.put(r8, r12)
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r11.f18281a
            java.lang.String r8 = "creative_id"
            java.lang.String r3 = r3.toString()
            r6.put(r8, r3)
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r11.f18281a
            java.lang.String r6 = "log_extra"
            java.lang.String r2 = r2.toString()
            r3.put(r6, r2)
        L_0x02f6:
            boolean r2 = com.bytedance.android.livesdk.p279af.C4600j.m11043d(r9)
            if (r2 == 0) goto L_0x0331
            java.util.Map r2 = com.bytedance.android.livesdk.p279af.C4600j.m11044e(r9)
            if (r2 == 0) goto L_0x0331
            java.lang.String r3 = "value"
            java.lang.Object r3 = r2.get(r3)
            java.lang.String r6 = "log_extra"
            java.lang.Object r2 = r2.get(r6)
            if (r3 == 0) goto L_0x0331
            if (r2 == 0) goto L_0x0331
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r11.f18281a
            java.lang.String r8 = "aweme_ad_type"
            java.lang.String r12 = "effect_ad"
            r6.put(r8, r12)
            java.util.HashMap<java.lang.String, java.lang.String> r6 = r11.f18281a
            java.lang.String r8 = "creative_id"
            java.lang.String r3 = r3.toString()
            r6.put(r8, r3)
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r11.f18281a
            java.lang.String r6 = "log_extra"
            java.lang.String r2 = r2.toString()
            r3.put(r6, r2)
        L_0x0331:
            com.bytedance.android.live.base.model.user.User r2 = r10.getOwner()
            long r2 = r2.getId()
            java.lang.String.valueOf(r2)
            long r2 = r10.getId()
            java.lang.String.valueOf(r2)
            com.bytedance.android.livesdk.commerce.b r6 = new com.bytedance.android.livesdk.commerce.b
            boolean r8 = r13.mo11890g()
            com.bytedance.android.livesdkapi.e.e r2 = r13.f15775bg
            java.lang.Object r2 = com.bytedance.android.livesdkapi.p458l.C8841c.m17358a(r2)
            r12 = r2
            com.bytedance.android.livesdkapi.e.e r12 = (com.bytedance.android.livesdkapi.p445e.C8735e) r12
            r6.<init>(r7, r8, r9, r10, r11, r12)
        L_0x0355:
            com.bytedance.android.livesdk.chatroom.viewmodule.CommonToastWidget r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.CommonToastWidget
            r2.<init>()
            r13.f15729aN = r2
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r13.f15715a
            boolean r2 = r2.isThirdParty
            if (r2 != 0) goto L_0x0368
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r13.f15715a
            boolean r2 = r2.isScreenshot
            if (r2 == 0) goto L_0x037d
        L_0x0368:
            com.bytedance.android.live.core.setting.p<java.lang.Boolean> r2 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_SHOW_GAME_QUIZ
            java.lang.Object r2 = r2.mo9431a()
            java.lang.Boolean r2 = (java.lang.Boolean) r2
            boolean r2 = r2.booleanValue()
            if (r2 == 0) goto L_0x037d
            com.bytedance.android.livesdk.chatroom.viewmodule.GameQuizWidget r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.GameQuizWidget
            r2.<init>()
            r13.f15767az = r2
        L_0x037d:
            com.bytedance.android.livesdk.ab.e r2 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdkapi.host.IHostContext r2 = r2.mo10308a()
            java.lang.String r2 = r2.getChannel()
            com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget r3 = new com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget
            r3.<init>()
            r13.f15732aQ = r3
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r6 = 2132023451(0x7f14189b, float:1.968535E38)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.LiveToolbarWidget> r7 = com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.LiveToolbarWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r3 = r3.load(r6, r7, r1)
            com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.LiveToolbarWidget r3 = (com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.LiveToolbarWidget) r3
            r13.f15693D = r3
            boolean r3 = r13.mo11891j()
            if (r3 != 0) goto L_0x03d7
            boolean r3 = r13.mo11942q()
            if (r3 == 0) goto L_0x03bf
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus r3 = r3.getRoomAuthStatus()
            if (r3 == 0) goto L_0x03bf
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus r3 = r3.getRoomAuthStatus()
            boolean r3 = r3.isAnchorGiftEnable()
            if (r3 == 0) goto L_0x03d7
        L_0x03bf:
            java.lang.Class<com.bytedance.android.live.gift.IGiftService> r3 = com.bytedance.android.live.gift.IGiftService.class
            com.bytedance.android.live.base.b r3 = com.bytedance.android.live.p245d.C4116c.m10249a(r3)
            com.bytedance.android.live.gift.IGiftService r3 = (com.bytedance.android.live.gift.IGiftService) r3
            com.bytedance.ies.sdk.widgets.Widget r3 = r3.getGiftWidget()
            r13.f15765ax = r3
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r6 = 2132024470(0x7f141c96, float:1.9687417E38)
            com.bytedance.ies.sdk.widgets.Widget r7 = r13.f15765ax
            r3.load(r6, r7, r1)
        L_0x03d7:
            boolean r3 = r13.mo11891j()
            if (r3 != 0) goto L_0x0400
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus r3 = r3.getRoomAuthStatus()
            if (r3 == 0) goto L_0x03f1
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus r3 = r3.getRoomAuthStatus()
            boolean r3 = r3.isMessageEnable()
            if (r3 == 0) goto L_0x0400
        L_0x03f1:
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r6 = 2132021035(0x7f140f2b, float:1.968045E38)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.TextMessageWidget> r7 = com.bytedance.android.livesdk.chatroom.viewmodule.TextMessageWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r3 = r3.load(r6, r7)
            com.bytedance.android.livesdk.chatroom.viewmodule.TextMessageWidget r3 = (com.bytedance.android.livesdk.chatroom.viewmodule.TextMessageWidget) r3
            r13.f15691B = r3
        L_0x0400:
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            boolean r3 = r3.isOfficial()
            if (r3 == 0) goto L_0x040e
            boolean r3 = r13.mo11890g()
            if (r3 == 0) goto L_0x0452
        L_0x040e:
            com.bytedance.android.live.core.setting.p<java.lang.Integer> r3 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_ENABLE_PACKUP_BANNER
            java.lang.Object r3 = r3.mo9431a()
            java.lang.Integer r3 = (java.lang.Integer) r3
            int r3 = r3.intValue()
            r6 = 2132017728(0x7f140240, float:1.9673743E38)
            if (r3 != r4) goto L_0x042c
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget> r7 = com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r3 = r3.load(r6, r7, r1)
            com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget r3 = (com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget) r3
            r13.f15724aI = r3
            goto L_0x0452
        L_0x042c:
            boolean r3 = r13.mo11891j()
            if (r3 != 0) goto L_0x0452
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus r3 = r3.getRoomAuthStatus()
            if (r3 == 0) goto L_0x0446
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus r3 = r3.getRoomAuthStatus()
            boolean r3 = r3.isBannerEnable()
            if (r3 == 0) goto L_0x0452
        L_0x0446:
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget> r7 = com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r3 = r3.load(r6, r7, r1)
            com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget r3 = (com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget) r3
            r13.f15723aH = r3
        L_0x0452:
            boolean r3 = r13.mo11891j()
            if (r3 != 0) goto L_0x0476
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus r3 = r3.getRoomAuthStatus()
            if (r3 == 0) goto L_0x046c
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus r3 = r3.getRoomAuthStatus()
            boolean r3 = r3.isBannerEnable()
            if (r3 == 0) goto L_0x0476
        L_0x046c:
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r6 = 2132023503(0x7f1418cf, float:1.9685456E38)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget> r7 = com.bytedance.android.livesdk.chatroom.viewmodule.TopRightBannerWidget.class
            r3.load(r6, r7)
        L_0x0476:
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r6 = 2132019363(0x7f1408a3, float:1.9677059E38)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget> r7 = com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r3 = r3.load(r6, r7)
            com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget r3 = (com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget) r3
            r13.f15716aA = r3
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r6 = 2132022389(0x7f141475, float:1.9683196E38)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.RoomPushWidget> r7 = com.bytedance.android.livesdk.chatroom.viewmodule.RoomPushWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r3 = r3.load(r6, r7)
            com.bytedance.android.livesdk.chatroom.viewmodule.RoomPushWidget r3 = (com.bytedance.android.livesdk.chatroom.viewmodule.RoomPushWidget) r3
            r13.f15722aG = r3
            boolean r3 = r13.f15794c
            if (r3 == 0) goto L_0x04ac
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r6 = 2132019283(0x7f140853, float:1.9676897E38)
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r7 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            com.bytedance.android.live.base.b r7 = com.bytedance.android.live.p245d.C4116c.m10249a(r7)
            com.bytedance.android.live.broadcast.api.IBroadcastService r7 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r7
            java.lang.Class r7 = r7.getWidgetClass(r4)
            r3.load(r6, r7)
        L_0x04ac:
            com.bytedance.android.livesdk.chatroom.viewmodule.BarrageWidget r3 = new com.bytedance.android.livesdk.chatroom.viewmodule.BarrageWidget
            r3.<init>()
            r13.f15697H = r3
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            if (r3 == 0) goto L_0x04cf
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            boolean r3 = r3.isOfficial()
            if (r3 != 0) goto L_0x04cf
            boolean r3 = r13.mo11891j()
            if (r3 != 0) goto L_0x04cf
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r6 = 2132017589(0x7f1401b5, float:1.967346E38)
            com.bytedance.android.livesdk.chatroom.viewmodule.BarrageWidget r7 = r13.f15697H
            r3.load(r6, r7)
        L_0x04cf:
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r6 = 2132018839(0x7f140697, float:1.9675996E38)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.EnterAnimWidget> r7 = com.bytedance.android.livesdk.chatroom.viewmodule.EnterAnimWidget.class
            java.lang.Object[] r8 = new java.lang.Object[r4]
            int r9 = r13.f15736aU
            java.lang.Integer r9 = java.lang.Integer.valueOf(r9)
            r8[r1] = r9
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r3 = r3.load(r6, r7, r4, r8)
            com.bytedance.android.livesdk.chatroom.viewmodule.EnterAnimWidget r3 = (com.bytedance.android.livesdk.chatroom.viewmodule.EnterAnimWidget) r3
            r13.f15766ay = r3
            boolean r3 = r13.mo11891j()
            if (r3 != 0) goto L_0x051c
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus r3 = r3.getRoomAuthStatus()
            if (r3 == 0) goto L_0x0502
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus r3 = r3.getRoomAuthStatus()
            boolean r3 = r3.isEnableChat()
            if (r3 == 0) goto L_0x051c
        L_0x0502:
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r6 = 2132018178(0x7f140402, float:1.9674655E38)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget> r7 = com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r3 = r3.load(r6, r7)
            com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget r3 = (com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget) r3
            r13.f15694E = r3
            com.bytedance.android.livesdk.p399o.C8064d.m16005b()
            java.lang.String r3 = "ttlive_comment"
            java.lang.String r6 = "CommentWidget is load."
            com.bytedance.android.livesdk.p399o.C8064d.m9720b(r3, r6)
            goto L_0x0526
        L_0x051c:
            com.bytedance.android.livesdk.p399o.C8064d.m16005b()
            java.lang.String r3 = "ttlive_comment"
            java.lang.String r6 = "CommentWidget is not load, chat is disabled."
            com.bytedance.android.livesdk.p399o.C8064d.m9720b(r3, r6)
        L_0x0526:
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            r6 = 8
            if (r3 == 0) goto L_0x0562
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            boolean r3 = r3.isOfficial()
            if (r3 != 0) goto L_0x0562
            boolean r3 = r13.mo11891j()
            if (r3 != 0) goto L_0x0562
            android.view.View r3 = r13.f15803l
            com.bytedance.common.utility.C9432q.m18691b(r3, r6)
            android.view.View r3 = r13.f15800i
            com.bytedance.common.utility.C9432q.m18691b(r3, r1)
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r7 = 2132023504(0x7f1418d0, float:1.9685458E38)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.widget.LiveRoomWatchUserWidget> r8 = com.bytedance.android.livesdk.chatroom.widget.LiveRoomWatchUserWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r3 = r3.load(r7, r8)
            com.bytedance.android.livesdk.chatroom.widget.LiveRoomWatchUserWidget r3 = (com.bytedance.android.livesdk.chatroom.widget.LiveRoomWatchUserWidget) r3
            r13.f15718aC = r3
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r7 = 2132024397(0x7f141c4d, float:1.9687269E38)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget> r8 = com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r3 = r3.load(r7, r8)
            com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget r3 = (com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget) r3
            r13.f15695F = r3
        L_0x0562:
            boolean r3 = com.bytedance.android.livesdkapi.p430b.C8607a.f23572a
            if (r3 != 0) goto L_0x0575
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r7 = 2132021981(0x7f1412dd, float:1.9682369E38)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.PromotionStatusWidget> r8 = com.bytedance.android.livesdk.chatroom.viewmodule.PromotionStatusWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r3 = r3.load(r7, r8)
            com.bytedance.android.livesdk.chatroom.viewmodule.PromotionStatusWidget r3 = (com.bytedance.android.livesdk.chatroom.viewmodule.PromotionStatusWidget) r3
            r13.f15719aD = r3
        L_0x0575:
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            android.view.View r3 = r3.contentView
            r7 = 2132021600(0x7f141160, float:1.9681596E38)
            android.view.View r3 = r3.findViewById(r7)
            if (r3 == 0) goto L_0x0585
            r3.setVisibility(r6)
        L_0x0585:
            boolean r3 = r13.f15794c
            if (r3 == 0) goto L_0x05c8
            boolean r3 = r13.mo11890g()
            if (r3 == 0) goto L_0x05c8
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            boolean r3 = r3.isStar()
            if (r3 != 0) goto L_0x05c8
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r6 = 2132021853(0x7f14125d, float:1.968211E38)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget> r7 = com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r3 = r3.load(r6, r7)
            com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget r3 = (com.bytedance.android.livesdk.chatroom.viewmodule.PopularCardWidget) r3
            r13.f15733aR = r3
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r3 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            com.bytedance.android.live.base.b r3 = com.bytedance.android.live.p245d.C4116c.m10249a(r3)
            com.bytedance.android.live.broadcast.api.IBroadcastService r3 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r3
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r6 = r13.f15690A
            if (r6 == 0) goto L_0x05c8
            if (r3 == 0) goto L_0x05c8
            r6 = 2132017429(0x7f140115, float:1.9673136E38)
            android.view.View r7 = r0.findViewById(r6)
            com.bytedance.common.utility.C9432q.m18691b(r7, r1)
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r7 = r13.f15690A
            r8 = 2
            java.lang.Class r3 = r3.getWidgetClass(r8)
            r7.load(r6, r3)
        L_0x05c8:
            boolean r3 = r13.f15794c
            if (r3 != 0) goto L_0x05f3
            boolean r3 = com.bytedance.android.livesdkapi.p430b.C8607a.f23572a
            if (r3 != 0) goto L_0x05f3
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus r3 = r3.getRoomAuthStatus()
            if (r3 == 0) goto L_0x05e4
            com.bytedance.android.livesdkapi.depend.model.live.Room r3 = r13.f15715a
            com.bytedance.android.livesdkapi.depend.model.live.RoomAuthStatus r3 = r3.getRoomAuthStatus()
            boolean r3 = r3.isEnableChat()
            if (r3 == 0) goto L_0x05f3
        L_0x05e4:
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r6 = 2132018185(0x7f140409, float:1.967467E38)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.CommentPromotionWidget> r7 = com.bytedance.android.livesdk.chatroom.viewmodule.CommentPromotionWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r3 = r3.load(r6, r7)
            com.bytedance.android.livesdk.chatroom.viewmodule.CommentPromotionWidget r3 = (com.bytedance.android.livesdk.chatroom.viewmodule.CommentPromotionWidget) r3
            r13.f15721aF = r3
        L_0x05f3:
            boolean r3 = r13.m12968B()
            if (r3 == 0) goto L_0x0608
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r3 = r13.f15690A
            r6 = 2132022039(0x7f141317, float:1.9682486E38)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.RadioWidget> r7 = com.bytedance.android.livesdk.chatroom.viewmodule.RadioWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r3 = r3.load(r6, r7)
            com.bytedance.android.livesdk.chatroom.viewmodule.RadioWidget r3 = (com.bytedance.android.livesdk.chatroom.viewmodule.RadioWidget) r3
            r13.f15720aE = r3
        L_0x0608:
            r3 = 0
            if (r2 != 0) goto L_0x060d
            r2 = r3
            goto L_0x0611
        L_0x060d:
            java.lang.String r2 = r2.toLowerCase()
        L_0x0611:
            java.lang.String r6 = "local_test"
            boolean r2 = android.text.TextUtils.equals(r2, r6)
            if (r2 == 0) goto L_0x0633
            boolean r2 = r13.f15794c
            if (r2 != 0) goto L_0x0633
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r13.f15715a
            java.lang.String r2 = r2.getPrivateInfo()
            boolean r2 = com.bytedance.common.utility.C9431p.m18664a(r2)
            if (r2 != 0) goto L_0x0633
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r2 = r13.f15690A
            r6 = 2132021922(0x7f1412a2, float:1.968225E38)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.PrivateDebugInfoWidget> r7 = com.bytedance.android.livesdk.chatroom.viewmodule.PrivateDebugInfoWidget.class
            r2.load(r6, r7)
        L_0x0633:
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r13.f15815x
            android.os.Bundle r6 = r13.getArguments()
            boolean r2 = com.bytedance.android.livesdk.rank.C8123a.m16196a(r2, r6)
            if (r2 == 0) goto L_0x0649
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r2 = r13.f15690A
            r6 = 2132017570(0x7f1401a2, float:1.9673422E38)
            java.lang.Class<com.bytedance.android.livesdk.rank.BackToPreRoomWidget> r7 = com.bytedance.android.livesdk.rank.BackToPreRoomWidget.class
            r2.load(r6, r7)
        L_0x0649:
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r2 = r13.f15690A
            java.lang.Class<com.bytedance.android.livesdk.chatroom.viewmodule.UserPermissionCheckWidget> r6 = com.bytedance.android.livesdk.chatroom.viewmodule.UserPermissionCheckWidget.class
            com.bytedance.ies.sdk.widgets.LiveRecyclableWidget r2 = r2.load(r6)
            com.bytedance.android.livesdk.chatroom.viewmodule.UserPermissionCheckWidget r2 = (com.bytedance.android.livesdk.chatroom.viewmodule.UserPermissionCheckWidget) r2
            r13.f15731aP = r2
            com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget
            r2.<init>()
            r13.f15726aK = r2
            com.bytedance.android.livesdk.chatroom.viewmodule.CommonGuideWidget r2 = new com.bytedance.android.livesdk.chatroom.viewmodule.CommonGuideWidget
            r2.<init>()
            r13.f15734aS = r2
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r2 = r13.f15690A
            com.bytedance.android.livesdk.chatroom.viewmodule.RechargeWidget r6 = r13.f15725aJ
            com.bytedance.ies.sdk.widgets.WidgetManager r2 = r2.load(r6)
            com.bytedance.android.livesdk.chatroom.viewmodule.FirstRechargeWidget r6 = r13.f15728aM
            com.bytedance.ies.sdk.widgets.WidgetManager r2 = r2.load(r6)
            r6 = 2132020665(0x7f140db9, float:1.96797E38)
            com.bytedance.android.livesdk.chatroom.viewmodule.DecorationWrapperWidget r7 = r13.f15692C
            com.bytedance.ies.sdk.widgets.WidgetManager r2 = r2.load(r6, r7)
            com.bytedance.android.livesdk.chatroom.viewmodule.CommonToastWidget r6 = r13.f15729aN
            com.bytedance.ies.sdk.widgets.WidgetManager r2 = r2.load(r6)
            r6 = 2132018242(0x7f140442, float:1.9674785E38)
            com.bytedance.android.livesdk.chatroom.viewmodule.CommonGuideWidget r7 = r13.f15734aS
            r2.load(r6, r7)
            boolean r2 = r13.mo11891j()
            if (r2 != 0) goto L_0x0695
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r2 = r13.f15690A
            com.bytedance.android.livesdk.chatroom.viewmodule.LiveShareWidget r6 = r13.f15726aK
            r2.load(r6)
        L_0x0695:
            r13.mo11888a(r0, r14)
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r14 = r13.f15690A
            r2 = 2132018832(0x7f140690, float:1.9675982E38)
            com.bytedance.android.livesdk.chatroom.viewmodule.EndWidget r6 = r13.f15732aQ
            r14.load(r2, r6)
            com.bytedance.android.livesdk.chatroom.viewmodule.RadioWidget r14 = r13.f15720aE
            r13.f15703O = r14
            r13.m12989f(r1)
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r14 = r13.f15690A
            java.lang.Class<com.bytedance.android.livesdk.commonpop.CommonPopupMessageWidget> r2 = com.bytedance.android.livesdk.commonpop.CommonPopupMessageWidget.class
            r14.load(r2)
            com.bytedance.android.live.core.setting.p<java.lang.Boolean> r14 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_SHARE_LEAD_INNER
            java.lang.Object r14 = r14.mo9431a()
            java.lang.Boolean r14 = (java.lang.Boolean) r14
            boolean r14 = r14.booleanValue()
            if (r14 == 0) goto L_0x06fc
            boolean r14 = r13.mo11942q()
            if (r14 == 0) goto L_0x06fc
            com.bytedance.android.livesdkapi.depend.model.live.Room r14 = r13.f15715a
            if (r14 == 0) goto L_0x06fc
            com.bytedance.android.livesdkapi.depend.model.live.Room r14 = r13.f15715a
            com.bytedance.android.live.base.model.user.User r14 = r14.getOwner()
            if (r14 == 0) goto L_0x06fc
            com.bytedance.android.livesdkapi.depend.model.live.Room r14 = r13.f15715a
            com.bytedance.android.live.base.model.user.User r14 = r14.getOwner()
            int r14 = r14.getSecret()
            if (r14 == r4) goto L_0x06fc
            android.os.Handler r14 = r13.f15705Q
            java.lang.Runnable r2 = r13.f15706R
            com.bytedance.android.live.core.setting.p<java.lang.Integer> r6 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_SHARE_LEAD_SHOW
            java.lang.Object r6 = r6.mo9431a()
            java.lang.Integer r6 = (java.lang.Integer) r6
            int r6 = r6.intValue()
            long r6 = (long) r6
            r14.postDelayed(r2, r6)
            android.os.Handler r14 = r13.f15705Q
            com.bytedance.android.livesdk.chatroom.ui.l r2 = new com.bytedance.android.livesdk.chatroom.ui.l
            r2.<init>(r13)
            r6 = 1000(0x3e8, double:4.94E-321)
            r14.postDelayed(r2, r6)
        L_0x06fc:
            boolean r14 = r13.m12968B()
            r2 = 2131886902(0x7f120336, float:1.9408396E38)
            if (r14 == 0) goto L_0x0784
            com.bytedance.android.livesdkapi.depend.model.live.Room r14 = r13.f15715a
            boolean r14 = r14.isWithLinkMic()
            if (r14 != 0) goto L_0x0784
            com.bytedance.android.livesdk.message.model.aw r14 = new com.bytedance.android.livesdk.message.model.aw
            r14.<init>()
            android.content.Context r5 = r13.getContext()
            android.content.res.Resources r5 = r5.getResources()
            float r5 = r5.getDimension(r2)
            android.content.Context r6 = r13.getContext()
            android.content.res.Resources r6 = r6.getResources()
            r7 = 2131886885(0x7f120325, float:1.9408361E38)
            float r6 = r6.getDimension(r7)
            float r5 = r5 + r6
            int r5 = (int) r5
            r14.f21524a = r5
            com.bytedance.ies.sdk.widgets.DataCenter r5 = r13.f15815x
            java.lang.String r6 = "cmd_normal_gift_layout_bottom_margin_update"
            int r14 = r14.f21524a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r5.lambda$put$1$DataCenter(r6, r14)
            com.bytedance.android.livesdk.message.model.aw r14 = new com.bytedance.android.livesdk.message.model.aw
            r14.<init>()
            android.content.Context r5 = r13.getContext()
            android.content.res.Resources r5 = r5.getResources()
            float r2 = r5.getDimension(r2)
            android.content.Context r5 = r13.getContext()
            android.content.res.Resources r5 = r5.getResources()
            float r5 = r5.getDimension(r7)
            float r2 = r2 + r5
            int r2 = (int) r2
            r14.f21524a = r2
            r13.m12975a(r14)
            android.content.Context r14 = r13.getContext()
            android.content.res.Resources r14 = r14.getResources()
            r2 = 2131886886(0x7f120326, float:1.9408364E38)
            float r14 = r14.getDimension(r2)
            int r14 = (int) r14
            android.content.Context r2 = r13.getContext()
            android.content.res.Resources r2 = r2.getResources()
            float r2 = r2.getDimension(r7)
            int r2 = (int) r2
            r13.m12971a(r14, r2)
            goto L_0x0808
        L_0x0784:
            boolean r14 = r13.m12968B()
            if (r14 == 0) goto L_0x07f8
            com.bytedance.android.livesdkapi.depend.model.live.Room r14 = r13.f15715a
            boolean r14 = r14.isWithLinkMic()
            if (r14 == 0) goto L_0x07f8
            com.bytedance.android.livesdk.message.model.aw r14 = new com.bytedance.android.livesdk.message.model.aw
            r14.<init>()
            android.content.Context r6 = r13.getContext()
            android.content.res.Resources r6 = r6.getResources()
            float r6 = r6.getDimension(r2)
            android.content.Context r7 = r13.getContext()
            android.content.res.Resources r7 = r7.getResources()
            r8 = 2131886884(0x7f120324, float:1.940836E38)
            float r7 = r7.getDimension(r8)
            float r6 = r6 + r7
            int r6 = (int) r6
            r14.f21524a = r6
            com.bytedance.ies.sdk.widgets.DataCenter r6 = r13.f15815x
            java.lang.String r7 = "cmd_normal_gift_layout_bottom_margin_update"
            int r14 = r14.f21524a
            java.lang.Integer r14 = java.lang.Integer.valueOf(r14)
            r6.lambda$put$1$DataCenter(r7, r14)
            com.bytedance.android.livesdk.message.model.aw r14 = new com.bytedance.android.livesdk.message.model.aw
            r14.<init>()
            android.content.Context r6 = r13.getContext()
            android.content.res.Resources r6 = r6.getResources()
            float r2 = r6.getDimension(r2)
            android.content.Context r6 = r13.getContext()
            android.content.res.Resources r6 = r6.getResources()
            float r6 = r6.getDimension(r8)
            float r2 = r2 + r6
            int r2 = (int) r2
            r14.f21524a = r2
            r13.m12975a(r14)
            android.content.Context r14 = r13.getContext()
            android.content.res.Resources r14 = r14.getResources()
            float r14 = r14.getDimension(r8)
            int r14 = (int) r14
            r13.m12971a(r5, r14)
            goto L_0x0808
        L_0x07f8:
            com.bytedance.android.livesdk.chatroom.viewmodule.TextMessageWidget r14 = r13.f15691B
            if (r14 == 0) goto L_0x0808
            com.bytedance.android.livesdk.chatroom.viewmodule.TextMessageWidget r14 = r13.f15691B
            android.view.ViewGroup r14 = r14.containerView
            com.bytedance.android.livesdk.chatroom.ui.b$14 r2 = new com.bytedance.android.livesdk.chatroom.ui.b$14
            r2.<init>()
            r14.post(r2)
        L_0x0808:
            android.app.Dialog r14 = r13.getDialog()
            if (r14 == 0) goto L_0x082e
            android.app.Dialog r14 = r13.getDialog()
            android.view.Window r14 = r14.getWindow()
            if (r14 == 0) goto L_0x0825
            android.graphics.drawable.ColorDrawable r2 = new android.graphics.drawable.ColorDrawable
            r2.<init>(r1)
            r14.setBackgroundDrawable(r2)
            r2 = 50
            r14.setSoftInputMode(r2)
        L_0x0825:
            android.app.Dialog r14 = r13.getDialog()
            android.content.DialogInterface$OnKeyListener r2 = r13.f15776bh
            r14.setOnKeyListener(r2)
        L_0x082e:
            boolean r14 = com.bytedance.android.livesdk.chatroom.p305b.C4997a.m11487a()
            if (r14 == 0) goto L_0x0845
            r14 = 2132018458(0x7f14051a, float:1.9675223E38)
            android.view.View r14 = r0.findViewById(r14)
            android.view.ViewStub r14 = (android.view.ViewStub) r14
            android.view.View r14 = r14.inflate()
            com.bytedance.android.livesdk.chatroom.widget.DebugInfoView r14 = (com.bytedance.android.livesdk.chatroom.widget.DebugInfoView) r14
            r13.f15772bd = r14
        L_0x0845:
            java.lang.Runnable r14 = r13.f15787bs
            if (r14 == 0) goto L_0x0850
            java.lang.Runnable r14 = r13.f15787bs
            r0.post(r14)
            r13.f15787bs = r3
        L_0x0850:
            r13.mo11920l()
            boolean r14 = r13.mo11891j()
            if (r14 != 0) goto L_0x0867
            com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.d r14 = com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6610k.m13987c()
            com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.h r0 = com.bytedance.android.livesdk.chatroom.viewmodule.toolbar.C6605h.SHARE
            com.bytedance.android.livesdk.chatroom.ui.b$d r2 = new com.bytedance.android.livesdk.chatroom.ui.b$d
            r2.<init>()
            r14.mo12668a(r0, r2)
        L_0x0867:
            android.widget.LinearLayout r14 = r13.f15699J
            com.bytedance.android.livesdk.chatroom.ui.b$10 r0 = new com.bytedance.android.livesdk.chatroom.ui.b$10
            r0.<init>()
            r14.setOnClickListener(r0)
            com.airbnb.lottie.LottieAnimationView r14 = r13.f15741aZ
            java.lang.String r0 = "images/"
            r14.setImageAssetsFolder(r0)
            com.airbnb.lottie.LottieAnimationView r14 = r13.f15741aZ
            java.lang.String r0 = "illegal_live_shadow_loading.json"
            r14.setAnimation(r0)
            com.airbnb.lottie.LottieAnimationView r14 = r13.f15741aZ
            r14.mo6658c(r4)
        L_0x0884:
            boolean r14 = r13.f15794c
            if (r14 == 0) goto L_0x08ad
            com.bytedance.android.livesdkapi.depend.model.live.m r14 = r13.f15812u
            boolean r14 = r14.isStreamingBackground
            if (r14 != 0) goto L_0x08ad
            com.bytedance.android.livesdk.chatroom.widget.CountDownView r14 = r13.f15713Y
            r14.setVisibility(r1)
            com.bytedance.android.livesdk.chatroom.widget.CountDownView r14 = r13.f15713Y
            com.bytedance.android.livesdk.chatroom.ui.r r0 = new com.bytedance.android.livesdk.chatroom.ui.r
            r0.<init>(r13)
            r14.setCountDownListener(r0)
            com.bytedance.android.livesdk.chatroom.widget.CountDownView r2 = r13.f15713Y
            com.bytedance.android.livesdk.chatroom.widget.CountDownView$1 r14 = new com.bytedance.android.livesdk.chatroom.widget.CountDownView$1
            int r0 = r2.f17991d
            long r3 = (long) r0
            r5 = 1000(0x3e8, double:4.94E-321)
            r1 = r14
            r1.<init>(r3, r5)
            r14.start()
        L_0x08ad:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C5957b.onActivityCreated(android.os.Bundle):void");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo11904a(View view) {
        this.f15752ak = (GestureDetectLayout) view;
        this.f15799h = view.findViewById(R.id.aum);
        this.f15754am = view.findViewById(R.id.jw);
        this.f15742aa = (Chronometer) view.findViewById(R.id.bc9);
        this.f15713Y = (CountDownView) view.findViewById(R.id.a19);
        this.f15714Z = (AnimationLayer) view.findViewById(R.id.dxv);
        this.f15803l = view.findViewById(R.id.ij);
        if (this.f15803l != null) {
            this.f15803l.setOnClickListener(this.f15786br);
        }
        this.f15800i = view.findViewById(R.id.ue);
        this.f15802k = view.findViewById(R.id.a7p);
        this.f15743ab = (TextView) view.findViewById(R.id.bdp);
        this.f15800i.setOnClickListener(this.f15786br);
        this.f15805n = view.findViewById(R.id.aup);
        this.f15753al = (FrameLayout) view.findViewById(R.id.bw_);
        this.f15804m = (FrameLayout) view.findViewById(R.id.m7);
        this.f15749ah = (LayoutParams) this.f15804m.getLayoutParams();
        this.f15744ac = view.findViewById(R.id.d3e);
        this.f15745ad = view.findViewById(R.id.cao);
        this.f15746ae = view.findViewById(R.id.f0n);
        this.f15747af = view.findViewById(R.id.f0m);
        this.f15735aT = view.findViewById(R.id.be5);
        this.f15737aV = (FrameLayout) view.findViewById(R.id.csy);
        this.f15741aZ = (LottieAnimationView) view.findViewById(R.id.ar3);
        this.f15699J = (LinearLayout) view.findViewById(R.id.cph);
        this.f15739aX = (TextView) view.findViewById(R.id.cpi);
        this.f15740aY = (TextView) view.findViewById(R.id.cpg);
        if (this.f15715a != null && this.f15715a.getMosaicStatus() == 1) {
            this.f15743ab.setVisibility(0);
        }
        this.f15801j = view.findViewById(R.id.cmd);
        this.f15773be = view.findViewById(R.id.ea6);
        if (this.f15715a != null && this.f15715a.isOfficial()) {
            C9432q.m18691b(this.f15800i, 8);
            C9432q.m18691b(this.f15803l, 8);
            if (getActivity() != null && (getActivity() instanceof C8606b)) {
                DrawerLayout a = ((C8606b) getActivity()).mo15098a();
                if (a != null) {
                    a.setDrawerLockMode(1);
                }
            }
        }
        this.f15702M = (TextView) view.findViewById(R.id.evg);
        this.f15702M.setOnClickListener(this.f15786br);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11901a(long j, long j2, String str, Runnable runnable, DialogInterface dialogInterface, int i) {
        TTLiveSDKContext.getHostService().mo10315h().mo14517a(((C8327b) ((C8327b) ((C8327b) ((C8327b) ((C8327b) ((C8326a) C8334f.m16517a().mo14503a(j)).mo14504a(this.f15715a.getRequestId())).mo14507b("live_detail")).mo14508c(CustomActionPushReceiver.f104061f)).mo14506b(j2)).mo14509d(str)).mo14510c()).mo6314a((C1674ab<? super T>) new C8335g<C8686a>() {
            public final void onSubscribe(C1690c cVar) {
                super.onSubscribe(cVar);
                C5957b.this.f15807p.mo6181a(cVar);
            }
        });
        if (C4600j.m11040b(this.f15815x) && this.f15715a.author() != null) {
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("anchor_id", String.valueOf(this.f15715a.author().getId()));
                jSONObject.put("room_id", String.valueOf(this.f15715a.getId()));
            } catch (JSONException unused) {
            }
            C4116c.m10249a(C8612a.class);
            C8066a.m16007a().mo14223a(jSONObject).mo14222a(C4600j.m11041c(this.f15815x));
        }
        if (C4600j.m11043d(this.f15815x) && this.f15715a.author() != null) {
            JSONObject jSONObject2 = new JSONObject();
            try {
                jSONObject2.put("anchor_id", String.valueOf(this.f15715a.author().getId()));
                jSONObject2.put("room_id", String.valueOf(this.f15715a.getId()));
            } catch (JSONException unused2) {
            }
            C4116c.m10249a(C8612a.class);
            C8066a.m16007a().mo14223a(jSONObject2).mo14222a(C4600j.m11044e(this.f15815x));
        }
        dialogInterface.dismiss();
        runnable.run();
        C5070h hVar = this.f15814w;
        HashMap hashMap = new HashMap();
        hashMap.put("growth_deepevent", "1");
        C8049c.m15979a().mo14202a("follow", hashMap, new C8052c("live_exit_popup", hVar.f13573A), new C8059j().mo14214b("live_interact").mo14213a("live_detail"), Room.class);
        mo12179y();
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x0019, code lost:
        r4 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5972a.f15835c;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:11:0x001c, code lost:
        r4 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5972a.f15834b;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:12:0x001e, code lost:
        r3.f15707S = r4;
        r4 = (android.widget.RelativeLayout.LayoutParams) r3.f15804m.getLayoutParams();
     */
    /* JADX WARNING: Code restructure failed: missing block: B:13:0x0028, code lost:
        if (r5 == false) goto L_0x0032;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:14:0x002a, code lost:
        r5 = com.bytedance.android.live.core.p230g.C3922z.m9913d(com.ss.android.ugc.trill.R.dimen.nm);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:15:0x0032, code lost:
        r5 = com.bytedance.android.live.core.p230g.C3922z.m9913d(com.ss.android.ugc.trill.R.dimen.s8);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:16:0x0039, code lost:
        r4.bottomMargin = r5;
        r4.rightMargin = com.bytedance.android.live.core.p230g.C3922z.m9913d(com.ss.android.ugc.trill.R.dimen.nn);
        r3.f15804m.setLayoutParams(r4);
        m12967A();
        r3.f15744ac.setVisibility(4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:17:0x0052, code lost:
        return;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0013, code lost:
        r3.f15708T = r3.f15707S;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:9:0x0017, code lost:
        if (r5 == false) goto L_0x001c;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private void m12981a(boolean r4, boolean r5) {
        /*
            r3 = this;
            r0 = 0
        L_0x0001:
            if (r4 == 0) goto L_0x0053
            if (r5 == 0) goto L_0x000b
            com.bytedance.android.livesdk.chatroom.ui.b$a r1 = r3.f15707S
            com.bytedance.android.livesdk.chatroom.ui.b$a r2 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5972a.RADIO_INTERACT
            if (r1 == r2) goto L_0x0053
        L_0x000b:
            if (r5 != 0) goto L_0x0013
            com.bytedance.android.livesdk.chatroom.ui.b$a r1 = r3.f15707S
            com.bytedance.android.livesdk.chatroom.ui.b$a r2 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5972a.RADIO
            if (r1 == r2) goto L_0x0053
        L_0x0013:
            com.bytedance.android.livesdk.chatroom.ui.b$a r4 = r3.f15707S
            r3.f15708T = r4
            if (r5 == 0) goto L_0x001c
            com.bytedance.android.livesdk.chatroom.ui.b$a r4 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5972a.RADIO_INTERACT
            goto L_0x001e
        L_0x001c:
            com.bytedance.android.livesdk.chatroom.ui.b$a r4 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5972a.RADIO
        L_0x001e:
            r3.f15707S = r4
            android.widget.FrameLayout r4 = r3.f15804m
            android.view.ViewGroup$LayoutParams r4 = r4.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r4 = (android.widget.RelativeLayout.LayoutParams) r4
            if (r5 == 0) goto L_0x0032
            r5 = 2131886729(0x7f120289, float:1.9408045E38)
            int r5 = com.bytedance.android.live.core.p230g.C3922z.m9913d(r5)
            goto L_0x0039
        L_0x0032:
            r5 = 2131886906(0x7f12033a, float:1.9408404E38)
            int r5 = com.bytedance.android.live.core.p230g.C3922z.m9913d(r5)
        L_0x0039:
            r4.bottomMargin = r5
            r5 = 2131886730(0x7f12028a, float:1.9408047E38)
            int r5 = com.bytedance.android.live.core.p230g.C3922z.m9913d(r5)
            r4.rightMargin = r5
            android.widget.FrameLayout r5 = r3.f15804m
            r5.setLayoutParams(r4)
            r3.m12967A()
            android.view.View r4 = r3.f15744ac
            r5 = 4
            r4.setVisibility(r5)
            return
        L_0x0053:
            if (r4 != 0) goto L_0x0083
            com.bytedance.android.livesdk.chatroom.ui.b$a r4 = r3.f15707S
            com.bytedance.android.livesdk.chatroom.ui.b$a r5 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5972a.NORMAL
            if (r4 == r5) goto L_0x0083
            com.bytedance.android.livesdk.chatroom.ui.b$a r4 = r3.f15708T
            r3.f15707S = r4
            com.bytedance.android.livesdk.chatroom.ui.b$a r4 = r3.f15707S
            com.bytedance.android.livesdk.chatroom.ui.b$a r5 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5972a.NORMAL
            if (r4 != r5) goto L_0x0075
            android.widget.FrameLayout r4 = r3.f15804m
            android.widget.RelativeLayout$LayoutParams r5 = r3.f15749ah
            r4.setLayoutParams(r5)
            r3.m12967A()
            android.view.View r4 = r3.f15744ac
            r4.setVisibility(r0)
            return
        L_0x0075:
            com.bytedance.android.livesdk.chatroom.ui.b$a r4 = r3.f15707S
            com.bytedance.android.livesdk.chatroom.ui.b$a r5 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5972a.RADIO
            if (r4 != r5) goto L_0x0083
            com.bytedance.android.livesdk.chatroom.ui.b$a r4 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5972a.NORMAL
            r3.f15707S = r4
            r4 = 1
            r5 = 0
            goto L_0x0001
        L_0x0083:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C5957b.m12981a(boolean, boolean):void");
    }

    /* renamed from: a */
    private void m12980a(boolean z, int i, int i2, boolean z2) {
        if (!z) {
            if (this.f15748ag != null) {
                this.f15745ad.setLayoutParams(this.f15748ag);
                this.f15748ag = null;
            }
        } else if (this.f15748ag == null) {
            this.f15748ag = (LayoutParams) this.f15745ad.getLayoutParams();
            LayoutParams layoutParams = new LayoutParams(this.f15748ag.width, this.f15748ag.height);
            if (VERSION.SDK_INT < 17 || !C4206c.m10426a(getContext())) {
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = i2;
                layoutParams.rightMargin = i;
            } else {
                layoutParams.addRule(11);
                layoutParams.addRule(12);
                layoutParams.bottomMargin = i2;
                if (z2) {
                    layoutParams.addRule(21);
                    layoutParams.setMarginEnd(i);
                } else {
                    layoutParams.rightMargin = i;
                }
            }
            this.f15745ad.setLayoutParams(layoutParams);
        }
    }

    /* renamed from: a */
    public final void mo9586a(Runnable runnable) {
        if (this.f15816y != null) {
            this.f15787bs = null;
            runnable.run();
            return;
        }
        this.f15787bs = runnable;
    }

    /* renamed from: a */
    public final void mo11900a(long j) {
        C4495a.m10823a().mo10301a((Object) new C5170ap(false, 2));
        if (this.f15808q.hasMessages(200)) {
            this.f15808q.removeMessages(200);
        }
        this.f15808q.sendEmptyMessageDelayed(200, j);
    }

    /* renamed from: a */
    public final void mo11908a(Throwable th) {
        if (th instanceof C2949a) {
            int errorCode = ((C2949a) th).getErrorCode();
            if (30003 == errorCode) {
                mo11887a(7);
            } else if (50001 == errorCode) {
                if (this.f15694E != null) {
                    this.f15694E.mo12318b(true);
                }
            } else if (50002 == errorCode) {
                mo11887a(10);
            } else if (30005 == errorCode) {
                if (this.f15768b) {
                    new C8552a(getActivity(), 0).mo15012d((int) R.string.eu1).mo15008c((int) R.string.eer).mo15003b(0, (int) R.string.eip, C6211i.f16681a).mo15005b((OnDismissListener) new C6212j(this)).mo15011d();
                }
            } else if (30006 == errorCode && !this.f15794c) {
                C4495a.m10823a().mo10301a((Object) new C5204w(20));
            }
        }
    }

    /* renamed from: a */
    public final void mo11905a(ShareReportResult shareReportResult) {
        if (shareReportResult != null && shareReportResult.getDeltaIntimacy() > 0 && this.f15715a != null) {
            IMessageManager iMessageManager = (IMessageManager) this.f15815x.get("data_message_manager");
            if (iMessageManager != null) {
                iMessageManager.insertMessage(C5006c.m11497a(this.f15715a.getId(), shareReportResult.getDisplayText(), this.f15811t), true);
            }
        }
    }

    /* renamed from: a */
    public final void mo11907a(C8009t tVar) {
        if (this.f15768b) {
            int i = tVar.f21914a;
            if (3 == i) {
                mo11887a(7);
            } else if (4 == i) {
                C5204w wVar = new C5204w(7);
                wVar.f13926c = tVar;
                m12974a(wVar);
                if (!C9431p.m18664a(tVar.f21915b)) {
                    C4575an.m10988a(tVar.f21915b, 1);
                }
                JSONObject jSONObject = new JSONObject();
                C3833a.m9730a(jSONObject, "error_code", 0);
                C3833a.m9731a(jSONObject, "error_msg", tVar.f21915b);
                C3837e.m9744a("ttlive_anchor_close_room", 0, jSONObject);
            } else if (1 != i) {
                if (2 == i) {
                    this.f15738aW = false;
                    if (this.f15793by != null) {
                        this.f15793by.mo9597a(2);
                    }
                    if (this.f15715a.getMosaicStatus() == 0) {
                        this.f15743ab.setVisibility(8);
                        if (!mo11942q()) {
                            C4204a.m10421a((Context) getActivity(), (int) R.string.es1);
                            C4495a.m10823a().mo10301a((Object) new C5204w(31));
                        }
                    }
                }
            } else if (!this.f15794c && !this.f15715a.isThirdParty && !this.f15715a.isScreenshot) {
                this.f15738aW = true;
                if (this.f15793by != null) {
                    this.f15793by.mo9597a(3);
                }
                if (this.f15743ab.getVisibility() == 8) {
                    if (!mo11942q() && !((Boolean) this.f15815x.get("data_link_cross_load", Boolean.valueOf(false))).booleanValue()) {
                        C4495a.m10823a().mo10301a((Object) new C5204w(30));
                    }
                    this.f15743ab.setVisibility(0);
                }
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:45:0x0132, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo11906a(com.bytedance.android.livesdk.message.model.C7859c r8) {
        /*
            r7 = this;
            boolean r0 = r7.f15768b
            if (r0 == 0) goto L_0x022c
            if (r8 != 0) goto L_0x0008
            goto L_0x022c
        L_0x0008:
            com.bytedance.android.livesdkapi.depend.e.a r0 = r8.getMessageType()
            int[] r1 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C596213.f15823a
            int r0 = r0.ordinal()
            r0 = r1[r0]
            r1 = 1
            r2 = 0
            switch(r0) {
                case 1: goto L_0x0171;
                case 2: goto L_0x015f;
                case 3: goto L_0x015f;
                case 4: goto L_0x015f;
                case 5: goto L_0x015f;
                case 6: goto L_0x0133;
                case 7: goto L_0x003b;
                case 8: goto L_0x0033;
                case 9: goto L_0x002b;
                case 10: goto L_0x001b;
                case 11: goto L_0x0022;
                default: goto L_0x0019;
            }
        L_0x0019:
            goto L_0x022b
        L_0x001b:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.f15815x
            java.lang.String r1 = "data_hs_fraternity_bubble"
            r0.lambda$put$1$DataCenter(r1, r8)
        L_0x0022:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.f15815x
            java.lang.String r1 = "data_d_live_message"
            r0.lambda$put$1$DataCenter(r1, r8)
            goto L_0x022b
        L_0x002b:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.f15815x
            java.lang.String r1 = "data_live_ecom_message"
            r0.lambda$put$1$DataCenter(r1, r8)
            return
        L_0x0033:
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.f15815x
            java.lang.String r1 = "data_dou_plus_promote_message"
            r0.lambda$put$1$DataCenter(r1, r8)
            return
        L_0x003b:
            com.bytedance.android.livesdk.message.model.cb r8 = (com.bytedance.android.livesdk.message.model.C7861cb) r8
            boolean r0 = r7.f15768b
            if (r0 == 0) goto L_0x022b
            if (r8 != 0) goto L_0x0045
            goto L_0x022b
        L_0x0045:
            int r0 = r8.f21739b
            switch(r0) {
                case 1: goto L_0x022b;
                case 2: goto L_0x0103;
                case 3: goto L_0x00de;
                case 4: goto L_0x0067;
                case 5: goto L_0x004c;
                default: goto L_0x004a;
            }
        L_0x004a:
            goto L_0x0132
        L_0x004c:
            com.bytedance.android.live.broadcast.api.d.d r0 = r7.f15770bb
            if (r0 != 0) goto L_0x0060
            java.lang.Class<com.bytedance.android.live.broadcast.api.IBroadcastService> r0 = com.bytedance.android.live.broadcast.api.IBroadcastService.class
            com.bytedance.android.live.base.b r0 = com.bytedance.android.live.p245d.C4116c.m10249a(r0)
            com.bytedance.android.live.broadcast.api.IBroadcastService r0 = (com.bytedance.android.live.broadcast.api.IBroadcastService) r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r7.f15715a
            com.bytedance.android.live.broadcast.api.d.d r0 = r0.createCoverController(r7, r1)
            r7.f15770bb = r0
        L_0x0060:
            com.bytedance.android.live.broadcast.api.d.d r0 = r7.f15770bb
            r0.mo8322a(r8)
            goto L_0x0132
        L_0x0067:
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.f13664a
            boolean r1 = r8.supportDisplayText()
            if (r1 == 0) goto L_0x0079
            com.bytedance.android.livesdkapi.message.b r0 = r8.baseMessage
            com.bytedance.android.livesdkapi.message.g r0 = r0.f24139j
            java.lang.String r1 = ""
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11756a(r0, r1)
        L_0x0079:
            android.text.Spannable r1 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.f13664a
            if (r0 != r1) goto L_0x008c
            java.lang.String r1 = r8.f21738a
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x008c
            android.text.SpannableString r0 = new android.text.SpannableString
            java.lang.String r1 = r8.f21738a
            r0.<init>(r1)
        L_0x008c:
            com.bytedance.android.livesdkapi.message.g r1 = r8.f21741d
            java.lang.String r3 = ""
            com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11756a(r1, r3)
            com.bytedance.android.livesdkapi.message.g r1 = r8.f21742e
            java.lang.String r3 = ""
            com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11756a(r1, r3)
            com.bytedance.android.livesdkapi.message.g r1 = r8.f21743f
            java.lang.String r3 = ""
            com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11756a(r1, r3)
            com.bytedance.android.livesdkapi.message.g r8 = r8.f21744g
            java.lang.String r1 = ""
            com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11756a(r8, r1)
            boolean r8 = android.text.TextUtils.isEmpty(r0)
            if (r8 != 0) goto L_0x0132
            com.bytedance.android.livesdk.widget.h$a r8 = new com.bytedance.android.livesdk.widget.h$a
            android.support.v4.app.FragmentActivity r1 = r7.getActivity()
            r8.<init>(r1, r2)
            com.bytedance.android.livesdk.widget.h$a r8 = r8.mo14996a(r2)
            r1 = 2132550428(0x7f1c231c, float:2.0754187E38)
            com.bytedance.android.livesdk.widget.h$a r8 = r8.mo15012d(r1)
            com.bytedance.android.livesdk.widget.h$a r8 = r8.mo15009c(r0)
            r0 = 2132550655(0x7f1c23ff, float:2.0754647E38)
            com.bytedance.android.livesdk.chatroom.ui.h r1 = new com.bytedance.android.livesdk.chatroom.ui.h
            r1.<init>(r7)
            com.bytedance.android.livesdk.widget.h$a r8 = r8.mo15003b(r2, r0, r1)
            r8.mo15011d()
            android.support.v4.app.FragmentActivity r8 = r7.getActivity()
            com.bytedance.android.livesdk.p399o.C8068g.m16014a(r8)
            goto L_0x022b
        L_0x00de:
            boolean r0 = r7.f15738aW
            r1 = 8
            if (r0 != 0) goto L_0x00e9
            android.widget.TextView r0 = r7.f15743ab
            r0.setVisibility(r1)
        L_0x00e9:
            com.airbnb.lottie.LottieAnimationView r0 = r7.f15741aZ
            r0.setVisibility(r1)
            com.airbnb.lottie.LottieAnimationView r0 = r7.f15741aZ
            r0.mo6661f()
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f15715a
            r0.setMosaicStatus(r2)
            com.bytedance.android.live.room.d$a r0 = r7.f15793by
            if (r0 == 0) goto L_0x0132
            com.bytedance.android.live.room.d$a r0 = r7.f15793by
            r0.mo8464a(r8)
            goto L_0x022b
        L_0x0103:
            boolean r0 = r7.f15794c
            if (r0 != 0) goto L_0x010d
            android.widget.TextView r0 = r7.f15743ab
            r0.setVisibility(r2)
            goto L_0x0117
        L_0x010d:
            com.airbnb.lottie.LottieAnimationView r0 = r7.f15741aZ
            r0.setVisibility(r2)
            com.airbnb.lottie.LottieAnimationView r0 = r7.f15741aZ
            r0.mo6654b()
        L_0x0117:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f15715a
            r0.setMosaicStatus(r1)
            com.bytedance.android.live.room.d$a r0 = r7.f15793by
            if (r0 == 0) goto L_0x0125
            com.bytedance.android.live.room.d$a r0 = r7.f15793by
            r0.mo8464a(r8)
        L_0x0125:
            com.bytedance.ies.sdk.widgets.DataCenter r8 = r7.f15815x
            java.lang.String r0 = "cmd_force_close_linkin"
            java.lang.Boolean r1 = java.lang.Boolean.valueOf(r1)
            r8.lambda$put$1$DataCenter(r0, r1)
            goto L_0x022b
        L_0x0132:
            return
        L_0x0133:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f15715a
            if (r0 == 0) goto L_0x013f
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f15715a
            boolean r0 = r0.isOfficial()
            if (r0 != 0) goto L_0x022b
        L_0x013f:
            com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget r0 = r7.f15730aO
            if (r0 != 0) goto L_0x0155
            com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget r0 = new com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget
            boolean r1 = r7.mo11890g()
            r0.<init>(r1)
            r7.f15730aO = r0
            com.bytedance.ies.sdk.widgets.RecyclableWidgetManager r0 = r7.f15690A
            com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget r1 = r7.f15730aO
            r0.load(r1)
        L_0x0155:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.p306bl.C5007d.INSTANCE
            com.bytedance.android.livesdkapi.depend.model.live.Room r1 = r7.mo11923o()
            r0.addFollowGuideMessage(r1, r8)
            return
        L_0x015f:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f15715a
            if (r0 == 0) goto L_0x016b
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f15715a
            boolean r0 = r0.isOfficial()
            if (r0 != 0) goto L_0x022b
        L_0x016b:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.p306bl.C5007d.INSTANCE
            r0.add(r8)
            return
        L_0x0171:
            com.bytedance.android.livesdkapi.depend.model.live.Room r0 = r7.f15715a
            long r3 = r0.getId()
            boolean r0 = r8.isCurrentRoom(r3)
            if (r0 == 0) goto L_0x022b
            com.bytedance.android.livesdk.message.model.bj r8 = (com.bytedance.android.livesdk.message.model.C7835bj) r8
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r7.f15815x
            java.lang.String r3 = "data_member_message"
            r0.lambda$put$1$DataCenter(r3, r8)
            com.bytedance.android.live.base.model.user.User r0 = r8.f21634b
            if (r0 == 0) goto L_0x022b
            long r3 = r0.getId()
            com.bytedance.android.livesdk.ab.e r0 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r0 = r0.mo10315h()
            long r5 = r0.mo14529b()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x022b
            r3 = 3
            long r5 = r8.mo14147a()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x021e
            r3 = 9
            long r5 = r8.mo14147a()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x01b3
            goto L_0x021e
        L_0x01b3:
            r3 = 4
            long r5 = r8.mo14147a()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 == 0) goto L_0x0211
            r3 = 10
            long r5 = r8.mo14147a()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x01c8
            goto L_0x0211
        L_0x01c8:
            r3 = 5
            long r5 = r8.mo14147a()
            int r0 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r0 != 0) goto L_0x01d6
            r7.mo8245a(r1)
            return
        L_0x01d6:
            r0 = 6
            long r3 = r8.mo14147a()
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 != 0) goto L_0x01e4
            r7.mo8245a(r2)
            return
        L_0x01e4:
            r0 = 7
            long r2 = r8.mo14147a()
            int r4 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r4 != 0) goto L_0x01f4
            r8 = 11
            r7.mo11887a(r8)
            return
        L_0x01f4:
            r0 = 11
            long r2 = r8.mo14147a()
            int r8 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r8 != 0) goto L_0x022b
            boolean r8 = r7.f15794c
            if (r8 != 0) goto L_0x022b
            com.bytedance.android.livesdk.aa.a r8 = com.bytedance.android.livesdk.p269aa.C4495a.m10823a()
            com.bytedance.android.livesdk.chatroom.event.w r0 = new com.bytedance.android.livesdk.chatroom.event.w
            r1 = 20
            r0.<init>(r1)
            r8.mo10301a(r0)
            return
        L_0x0211:
            com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget r8 = r7.f15694E
            if (r8 == 0) goto L_0x021a
            com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget r8 = r7.f15694E
            r8.mo12318b(r2)
        L_0x021a:
            r7.m12988e(r2)
            return
        L_0x021e:
            com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget r8 = r7.f15694E
            if (r8 == 0) goto L_0x0227
            com.bytedance.android.livesdk.chatroom.viewmodule.CommentWidget r8 = r7.f15694E
            r8.mo12318b(r1)
        L_0x0227:
            r7.m12988e(r1)
            return
        L_0x022b:
            return
        L_0x022c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C5957b.mo11906a(com.bytedance.android.livesdk.message.model.c):void");
    }

    /* JADX WARNING: Removed duplicated region for block: B:45:0x0115  */
    /* JADX WARNING: Removed duplicated region for block: B:46:0x011d  */
    /* JADX WARNING: Removed duplicated region for block: B:49:0x0135  */
    /* JADX WARNING: Removed duplicated region for block: B:55:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:63:0x0191  */
    /* JADX WARNING: Removed duplicated region for block: B:66:0x01a0  */
    /* JADX WARNING: Removed duplicated region for block: B:69:0x01ac  */
    /* JADX WARNING: Removed duplicated region for block: B:72:0x01e6  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo10886a(com.bytedance.android.livesdkapi.message.C8844a r19) {
        /*
            r18 = this;
            r1 = r18
            r0 = r19
            if (r0 != 0) goto L_0x000c
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.p306bl.C5007d.INSTANCE
            r0.onMessageFinish()
            return
        L_0x000c:
            boolean r2 = r0 instanceof com.bytedance.android.livesdk.message.model.C7865cf
            r3 = 0
            if (r2 == 0) goto L_0x0070
            com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget r2 = r1.f15716aA
            com.bytedance.android.livesdk.message.model.cf r0 = (com.bytedance.android.livesdk.message.model.C7865cf) r0
            boolean r4 = r2.isViewValid()
            if (r4 == 0) goto L_0x0069
            if (r0 != 0) goto L_0x001e
            goto L_0x0069
        L_0x001e:
            android.view.View r4 = r2.f17267a
            r4.setVisibility(r3)
            android.view.View r4 = r2.f17267a
            int r5 = r2.f17271e
            float r5 = (float) r5
            r4.setTranslationX(r5)
            android.widget.TextView r4 = r2.f17269c
            r4.setScrollX(r3)
            com.bytedance.android.livesdk.message.model.RoomNotifyMessageExtra r4 = r0.f21765e
            if (r4 == 0) goto L_0x0064
            com.bytedance.android.livesdk.message.model.RoomNotifyMessageExtra r4 = r0.f21765e
            com.bytedance.android.livesdk.message.model.RoomNotifyMessageExtra$Background r4 = r4.f21423b
            if (r4 == 0) goto L_0x0064
            com.bytedance.android.livesdk.message.model.RoomNotifyMessageExtra r4 = r0.f21765e
            com.bytedance.android.livesdk.message.model.RoomNotifyMessageExtra$Background r4 = r4.f21423b
            java.util.List r4 = r4.getUrls()
            boolean r4 = com.bytedance.common.utility.C9414h.m18630a(r4)
            if (r4 == 0) goto L_0x0049
            goto L_0x0064
        L_0x0049:
            com.bytedance.android.live.uikit.rtl.AutoRTLImageView r4 = r2.f17268b
            r4.setBackgroundResource(r3)
            com.bytedance.android.live.uikit.rtl.AutoRTLImageView r3 = r2.f17268b
            java.lang.String r4 = "2132017572"
            com.bytedance.android.live.core.p230g.p231a.C3859i.m9790a(r3, r4, r0)
            com.bytedance.android.live.uikit.rtl.AutoRTLImageView r3 = r2.f17268b
            com.bytedance.android.livesdk.message.model.RoomNotifyMessageExtra r0 = r0.f21765e
            com.bytedance.android.livesdk.message.model.RoomNotifyMessageExtra$Background r0 = r0.f21423b
            com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget$3 r4 = new com.bytedance.android.livesdk.chatroom.viewmodule.LiveRoomNotifyWidget$3
            r4.<init>()
            com.bytedance.android.livesdk.chatroom.p310f.C5213c.m11819a(r3, r0, r4)
            return
        L_0x0064:
            r2.mo12445a(r0)
            goto L_0x038c
        L_0x0069:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.p306bl.C5007d.INSTANCE
            r0.onMessageFinish()
            goto L_0x038c
        L_0x0070:
            boolean r2 = r0 instanceof com.bytedance.android.livesdk.message.model.C8007r
            r4 = 8
            r5 = 1
            r6 = 2
            if (r2 == 0) goto L_0x0210
            com.bytedance.android.livesdk.chatroom.viewmodule.CommonToastWidget r2 = r1.f15729aN
            r7 = r0
            com.bytedance.android.livesdk.message.model.r r7 = (com.bytedance.android.livesdk.message.model.C8007r) r7
            com.bytedance.android.livesdkapi.message.b r0 = r7.baseMessage
            com.bytedance.android.livesdkapi.message.g r8 = r0.f24139j
            if (r8 != 0) goto L_0x008a
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.p306bl.C5007d.INSTANCE
            r0.onMessageFinish()
            goto L_0x038c
        L_0x008a:
            java.lang.String r0 = r7.f21902d
            if (r0 != 0) goto L_0x0092
            java.lang.String r0 = "#ff9d5c"
            r7.f21902d = r0
        L_0x0092:
            java.lang.String r0 = r7.f21903e
            if (r0 != 0) goto L_0x009a
            java.lang.String r0 = "#ff5c67"
            r7.f21903e = r0
        L_0x009a:
            java.lang.String r0 = r7.f21904f
            if (r0 != 0) goto L_0x00a2
            java.lang.String r0 = "#ffffff"
            r7.f21904f = r0
        L_0x00a2:
            android.content.Context r0 = r2.context
            android.view.LayoutInflater r0 = android.view.LayoutInflater.from(r0)
            r9 = 2132216294(0x7f1709e6, float:2.0076482E38)
            r10 = 0
            android.view.View r0 = r0.inflate(r9, r10)
            r9 = r0
            com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout r9 = (com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout) r9
            com.bytedance.android.livesdk.chatroom.widget.CommonToastLayout$a r0 = r2.f16861a
            r9.setOnDetachListener(r0)
            r0 = 2132018259(0x7f140453, float:1.967482E38)
            android.view.View r0 = r9.findViewById(r0)
            r10 = r0
            android.widget.LinearLayout r10 = (android.widget.LinearLayout) r10
            r0 = 2132023727(0x7f1419af, float:1.968591E38)
            android.view.View r0 = r9.findViewById(r0)
            r11 = r0
            android.widget.TextView r11 = (android.widget.TextView) r11
            r0 = 2132020248(0x7f140c18, float:1.9678854E38)
            android.view.View r0 = r9.findViewById(r0)
            r12 = r0
            com.bytedance.android.live.core.widget.HSImageView r12 = (com.bytedance.android.live.core.widget.HSImageView) r12
            java.lang.String r0 = "#ff9d5c"
            int r13 = android.graphics.Color.parseColor(r0)
            java.lang.String r0 = "#ff5c67"
            int r14 = android.graphics.Color.parseColor(r0)
            java.lang.String r0 = r7.f21902d     // Catch:{ Exception -> 0x00fa }
            java.lang.String r0 = com.bytedance.android.livesdk.chatroom.viewmodule.CommonToastWidget.m13449a(r0)     // Catch:{ Exception -> 0x00fa }
            java.lang.String r15 = r7.f21903e     // Catch:{ Exception -> 0x00fa }
            java.lang.String r15 = com.bytedance.android.livesdk.chatroom.viewmodule.CommonToastWidget.m13449a(r15)     // Catch:{ Exception -> 0x00fa }
            int r16 = android.graphics.Color.parseColor(r0)     // Catch:{ Exception -> 0x00fa }
            int r0 = android.graphics.Color.parseColor(r15)     // Catch:{ Exception -> 0x00f8 }
            r14 = r0
            goto L_0x0107
        L_0x00f8:
            r0 = move-exception
            goto L_0x00fd
        L_0x00fa:
            r0 = move-exception
            r16 = r13
        L_0x00fd:
            r13 = 6
            java.lang.String r15 = "CommonToastWidget"
            java.lang.StackTraceElement[] r0 = r0.getStackTrace()
            com.bytedance.android.live.core.p224c.C3831a.m9706a(r13, r15, r0)
        L_0x0107:
            int[] r0 = new int[r6]
            r0[r3] = r16
            r0[r5] = r14
            android.content.Context r5 = r2.context
            boolean r5 = com.bytedance.android.live.uikit.p257c.C4206c.m10426a(r5)
            if (r5 == 0) goto L_0x011d
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r13 = android.graphics.drawable.GradientDrawable.Orientation.RIGHT_LEFT
            r5.<init>(r13, r0)
            goto L_0x0124
        L_0x011d:
            android.graphics.drawable.GradientDrawable r5 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r13 = android.graphics.drawable.GradientDrawable.Orientation.LEFT_RIGHT
            r5.<init>(r13, r0)
        L_0x0124:
            r0 = 1090519040(0x41000000, float:8.0)
            int r0 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r0)
            float r0 = (float) r0
            r5.setCornerRadius(r0)
            r10.setBackgroundDrawable(r5)
            com.bytedance.android.live.base.model.ImageModel r0 = r7.f21906h
            if (r0 == 0) goto L_0x0163
            r12.setVisibility(r3)
            int r0 = r7.f21907i
            if (r0 <= 0) goto L_0x015d
            int r0 = r7.f21908j
            if (r0 <= 0) goto L_0x015d
            android.view.ViewGroup$LayoutParams r0 = r12.getLayoutParams()
            int r4 = r7.f21907i
            r0.width = r4
            int r4 = r7.f21908j
            r0.height = r4
            r12.requestLayout()
            com.bytedance.android.live.base.model.ImageModel r0 = r7.f21906h
            int r4 = r12.getWidth()
            int r5 = r12.getHeight()
            com.bytedance.android.livesdk.chatroom.p310f.C5213c.m11816a(r12, r0, r4, r5)
            goto L_0x0166
        L_0x015d:
            com.bytedance.android.live.base.model.ImageModel r0 = r7.f21906h
            com.bytedance.android.livesdk.chatroom.p310f.C5213c.m11814a(r12, r0)
            goto L_0x0166
        L_0x0163:
            r12.setVisibility(r4)
        L_0x0166:
            java.lang.String r0 = r8.f24156b
            java.lang.String r4 = r8.f24155a
            boolean r4 = android.text.TextUtils.isEmpty(r4)
            if (r4 != 0) goto L_0x0186
            com.bytedance.android.livesdk.i18n.b r4 = com.bytedance.android.livesdk.i18n.C7676b.m15696a()
            java.lang.String r5 = r8.f24155a
            java.lang.String r4 = r4.mo14036a(r5)
            if (r4 == 0) goto L_0x0186
            com.bytedance.android.livesdk.i18n.b r0 = com.bytedance.android.livesdk.i18n.C7676b.m15696a()
            java.lang.String r4 = r8.f24155a
            java.lang.String r0 = r0.mo14036a(r4)
        L_0x0186:
            android.text.Spannable r0 = com.bytedance.android.livesdk.chatroom.p309e.C5115z.m11758a(r0, r8)
            r11.setText(r0)
            int r0 = r7.f21905g
            if (r0 == 0) goto L_0x01a0
            if (r0 == r6) goto L_0x0197
            r0 = 17
            r4 = 0
            goto L_0x01a8
        L_0x0197:
            r0 = 80
            r4 = 1115684864(0x42800000, float:64.0)
            int r4 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r4)
            goto L_0x01a8
        L_0x01a0:
            r0 = 48
            r4 = 1116733440(0x42900000, float:72.0)
            int r4 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r4)
        L_0x01a8:
            boolean r5 = r7.f21909k
            if (r5 == 0) goto L_0x01e6
            com.bytedance.android.livesdk.widget.h$a r0 = new com.bytedance.android.livesdk.widget.h$a
            android.content.Context r3 = r2.context
            r0.<init>(r3)
            com.bytedance.android.livesdk.widget.h$c r3 = r0.f23458a
            r3.f23468g = r9
            com.bytedance.android.livesdk.widget.h r0 = r0.mo15011d()
            int r3 = r7.f21901c
            if (r3 <= 0) goto L_0x038c
            int r3 = r7.f21901c
            long r3 = (long) r3
            java.util.concurrent.TimeUnit r5 = java.util.concurrent.TimeUnit.SECONDS
            c.a.ad r3 = p064c.p065a.C1680ad.m5956a(r3, r5)
            c.a.ac r4 = p064c.p065a.p066a.p068b.C1667a.m5940a()
            c.a.ad r3 = r3.mo6148a(r4)
            com.bytedance.android.live.core.rxutils.autodispose.m r2 = r2.autoDispose()
            java.lang.Object r2 = r3.mo6153a(r2)
            com.bytedance.android.live.core.rxutils.autodispose.af r2 = (com.bytedance.android.live.core.rxutils.autodispose.C4005af) r2
            com.bytedance.android.livesdk.chatroom.viewmodule.u r3 = new com.bytedance.android.livesdk.chatroom.viewmodule.u
            r3.<init>(r0)
            c.a.d.e r0 = com.bytedance.android.livesdk.chatroom.viewmodule.C6616v.f17974a
            r2.mo9410a(r3, r0)
            goto L_0x038c
        L_0x01e6:
            android.widget.Toast r5 = new android.widget.Toast
            android.content.Context r2 = r2.context
            android.content.Context r2 = r2.getApplicationContext()
            r5.<init>(r2)
            r5.setView(r9)
            r5.setGravity(r0, r3, r4)
            int r0 = r7.f21901c
            if (r0 <= 0) goto L_0x01fd
            int r3 = r7.f21901c
        L_0x01fd:
            r5.setDuration(r3)
            int r0 = android.os.Build.VERSION.SDK_INT
            r2 = 25
            if (r0 != r2) goto L_0x020c
            r0 = r5
            android.widget.Toast r0 = (android.widget.Toast) r0
            com.p683ss.android.ugc.aweme.utils.C47905fy.m103630a(r0)
        L_0x020c:
            r5.show()
            return
        L_0x0210:
            boolean r2 = r0 instanceof com.bytedance.android.livesdk.message.model.C7802ah
            r7 = 2
            r9 = 1
            if (r2 == 0) goto L_0x0328
            com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget r2 = r1.f15730aO
            com.bytedance.android.livesdkapi.depend.model.live.Room r11 = r1.f15715a
            com.bytedance.android.livesdk.message.model.ah r0 = (com.bytedance.android.livesdk.message.model.C7802ah) r0
            if (r11 == 0) goto L_0x038c
            boolean r12 = r2.isViewValid()
            if (r12 != 0) goto L_0x0228
            goto L_0x038c
        L_0x0228:
            r2.f16974a = r11
            java.lang.String r12 = r0.f21459b
            com.bytedance.android.live.base.model.user.User r13 = r11.getOwner()
            com.bytedance.android.live.base.model.user.FollowInfo r13 = r13.getFollowInfo()
            long r13 = r13.getFollowStatus()
            boolean r12 = android.text.TextUtils.isEmpty(r12)
            if (r12 != 0) goto L_0x0322
            int r12 = (r13 > r9 ? 1 : (r13 == r9 ? 0 : -1))
            if (r12 == 0) goto L_0x0322
            int r9 = (r13 > r7 ? 1 : (r13 == r7 ? 0 : -1))
            if (r9 != 0) goto L_0x0248
            goto L_0x0322
        L_0x0248:
            boolean r7 = r11.isOfficial()
            if (r7 == 0) goto L_0x0255
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.p306bl.C5007d.INSTANCE
            r0.onMessageFinish()
            goto L_0x038c
        L_0x0255:
            com.bytedance.android.live.core.widget.HSImageView r12 = r2.f16980g
            com.bytedance.android.live.base.model.ImageModel r7 = r0.f21460c
            if (r7 != 0) goto L_0x0265
            com.bytedance.android.live.base.model.user.User r7 = r11.getOwner()
            com.bytedance.android.live.base.model.ImageModel r7 = r7.getAvatarThumb()
        L_0x0263:
            r13 = r7
            goto L_0x0268
        L_0x0265:
            com.bytedance.android.live.base.model.ImageModel r7 = r0.f21460c
            goto L_0x0263
        L_0x0268:
            r14 = 2131956352(0x7f131280, float:1.9549257E38)
            r7 = 2131821007(0x7f1101cf, float:1.9274745E38)
            int r15 = com.bytedance.android.live.core.p230g.C3922z.m9909b(r7)
            android.content.Context r7 = r2.context
            r8 = 1073741824(0x40000000, float:2.0)
            float r16 = com.bytedance.android.livesdk.p279af.C4577ap.m10990a(r7, r8)
            r17 = 0
            com.bytedance.android.livesdk.chatroom.p310f.C5213c.m11817a(r12, r13, r14, r15, r16, r17)
            android.widget.TextView r7 = r2.f16977d
            com.bytedance.android.live.base.model.user.i r8 = r11.author()
            java.lang.String r8 = r8.getNickName()
            r7.setText(r8)
            java.lang.String r7 = r0.f21462e
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 == 0) goto L_0x029a
            android.widget.TextView r7 = r2.f16978e
            r7.setVisibility(r4)
            goto L_0x02a6
        L_0x029a:
            android.widget.TextView r4 = r2.f16978e
            java.lang.String r7 = r0.f21462e
            r4.setText(r7)
            android.widget.TextView r4 = r2.f16978e
            r4.setVisibility(r3)
        L_0x02a6:
            android.widget.TextView r4 = r2.f16979f
            java.lang.String r7 = r0.f21459b
            r4.setText(r7)
            com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget$a r4 = r2.f16975b
            r4.show()
            com.bytedance.android.livesdk.b r4 = com.bytedance.android.livesdk.C4642b.m11130a()
            r4.mo10428b()
            com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget$a r4 = r2.f16975b
            com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget$2 r7 = new com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget$2
            r7.<init>()
            r4.setOnDismissListener(r7)
            long r7 = r0.f21458a
            r9 = 0
            int r4 = (r7 > r9 ? 1 : (r7 == r9 ? 0 : -1))
            if (r4 <= 0) goto L_0x02d7
            android.view.View r4 = r2.f16976c
            com.bytedance.android.livesdk.chatroom.viewmodule.al r7 = new com.bytedance.android.livesdk.chatroom.viewmodule.al
            r7.<init>(r2)
            long r8 = r0.f21458a
            r4.postDelayed(r7, r8)
        L_0x02d7:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r4 = "room_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r7 = r2.f16974a
            long r7 = r7.getId()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.put(r4, r7)
            java.lang.String r4 = "anchor_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r7 = r2.f16974a
            com.bytedance.android.live.base.model.user.i r7 = r7.author()
            long r7 = r7.getId()
            java.lang.String r7 = java.lang.String.valueOf(r7)
            r0.put(r4, r7)
            java.lang.String r4 = "request_id"
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r2.f16974a
            java.lang.String r2 = r2.getRequestId()
            r0.put(r4, r2)
            java.lang.String[] r2 = new java.lang.String[r6]
            java.lang.String r4 = "enter_from_merge"
            r2[r3] = r4
            java.lang.String r4 = "enter_method"
            r2[r5] = r4
            com.bytedance.android.livesdk.chatroom.viewmodule.FollowGuideWidget.m13510a(r0, r2)
            com.bytedance.android.livesdk.o.c r2 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r4 = "livesdk_follow_card_show"
            java.lang.Object[] r3 = new java.lang.Object[r3]
            r2.mo14202a(r4, r0, r3)
            return
        L_0x0322:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.p306bl.C5007d.INSTANCE
            r0.onMessageFinish()
            goto L_0x038c
        L_0x0328:
            boolean r2 = r0 instanceof com.bytedance.android.livesdk.message.model.C7814as
            if (r2 == 0) goto L_0x0366
            com.bytedance.android.livesdk.message.model.as r0 = (com.bytedance.android.livesdk.message.model.C7814as) r0
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r1.f15715a
            if (r2 == 0) goto L_0x033a
            com.bytedance.android.livesdkapi.depend.model.live.Room r2 = r1.f15715a
            boolean r2 = r2.isOfficial()
            if (r2 != 0) goto L_0x035f
        L_0x033a:
            long r2 = r0.f21516a
            int r4 = (r2 > r9 ? 1 : (r2 == r9 ? 0 : -1))
            if (r4 == 0) goto L_0x0360
            long r2 = r0.f21516a
            r4 = 3
            int r6 = (r2 > r4 ? 1 : (r2 == r4 ? 0 : -1))
            if (r6 != 0) goto L_0x0349
            goto L_0x0360
        L_0x0349:
            long r2 = r0.f21516a
            int r4 = (r2 > r7 ? 1 : (r2 == r7 ? 0 : -1))
            if (r4 != 0) goto L_0x035f
            long r2 = r0.f21519d
            r1.f15788bt = r2
            com.bytedance.common.utility.b.g r0 = r1.f15808q
            java.lang.Runnable r2 = r1.f15789bu
            r0.post(r2)
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.p306bl.C5007d.INSTANCE
            r0.onMessageFinish()
        L_0x035f:
            return
        L_0x0360:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.p306bl.C5007d.INSTANCE
            r0.onMessageFinish()
            goto L_0x038c
        L_0x0366:
            boolean r2 = r0 instanceof com.bytedance.android.livesdk.message.model.C8004p
            if (r2 == 0) goto L_0x0387
            com.bytedance.android.livesdk.chatroom.viewmodule.CommonGuideWidget r2 = r1.f15734aS
            com.bytedance.android.livesdk.message.model.p r0 = (com.bytedance.android.livesdk.message.model.C8004p) r0
            java.lang.String r3 = "message"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
            r2.f16855b = r0
            com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel r2 = r2.f16854a
            if (r2 == 0) goto L_0x0386
            com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$f r2 = r2.f22828a
            com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$c r3 = new com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$c
            r3.<init>(r0)
            com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel$h r3 = (com.bytedance.android.livesdk.viewmodel.CommonGuideViewModel.C8398h) r3
            r2.mo14606a(r3)
            goto L_0x038c
        L_0x0386:
            return
        L_0x0387:
            com.bytedance.android.livesdk.chatroom.bl.d r0 = com.bytedance.android.livesdk.chatroom.p306bl.C5007d.INSTANCE
            r0.onMessageFinish()
        L_0x038c:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C5957b.mo10886a(com.bytedance.android.livesdkapi.message.a):void");
    }

    public void onEvent(C7713e eVar) {
        int i = eVar.f21218b;
        User user = (User) this.f15815x.get("data_user_in_room");
        if (user != null) {
            user.setPayScores(user.getPayScores() + ((long) i));
            user.setNeverRecharge(false);
        }
        this.f15815x.lambda$put$1$DataCenter("data_first_charge_in_room", new FirstChargeCheck());
        this.f15815x.lambda$put$1$DataCenter("data_user_in_room", user);
    }

    public void onEvent(C5205x xVar) {
        float f;
        if (getView() != null) {
            if (xVar.f13928b) {
                this.f15805n.setVisibility(0);
                this.f15805n.setOnClickListener(new C6128e(this));
                View view = this.f15799h;
                if (mo11890g()) {
                    f = (float) (-xVar.f13927a);
                } else {
                    f = (float) (-(xVar.f13927a + C3922z.m9899a(48.0f)));
                }
                view.setTranslationY(f);
                this.f15808q.post(new C6191f(this));
            } else {
                this.f15805n.setVisibility(8);
                this.f15799h.setTranslationY(0.0f);
                this.f15808q.post(new C6209g(this));
            }
            String str = xVar.f13928b ? "input_event" : "input_close";
            StringBuilder sb = new StringBuilder("translateY:");
            sb.append(String.valueOf(xVar.f13927a));
            m12978a(str, sb.toString());
        }
    }

    /* renamed from: a */
    private void mo8245a(boolean z) {
        TTLiveSDKContext.getHostService().mo10315h().mo14523a(z ? 1 : 0);
        if (this.f15811t == null) {
            m12992z();
            return;
        }
        if (this.f15811t.getUserAttr() == null) {
            this.f15811t.setUserAttr(new C3012k());
        }
        this.f15811t.getUserAttr().f8851b = z;
        C4575an.m10981a(z ? R.string.hse : R.string.hsd);
    }

    public void onEvent(C7721b bVar) {
        if (bVar.f21233a && bVar.f21234b > 0 && bVar.f21234b >= 0) {
            if (this.f15718aC != null) {
                this.f15718aC.mo12745a(bVar.f21234b);
            }
            if (this.f15696G != null) {
                LiveRoomTopBelowWidget liveRoomTopBelowWidget = this.f15696G;
                long j = bVar.f21234b;
                if (liveRoomTopBelowWidget.f18030f != null) {
                    liveRoomTopBelowWidget.f18030f.mo12745a(j);
                }
            }
        }
    }

    public void onEvent(C8617c cVar) {
        if (!this.f15768b) {
            boolean z = false;
            boolean z2 = 1 == cVar.f23585a;
            if (cVar.f23585a == 0) {
                z = true;
            }
            if (!z2 && z) {
                C4204a.m10421a((Context) getActivity(), (int) R.string.eno);
            }
        }
    }

    public void onEvent(C5185e eVar) {
        if (this.f15768b) {
            C7862cc ccVar = eVar.f13888a;
            if (ccVar != null) {
                try {
                    new JSONObject().put("trace_id", ccVar.f21748c);
                    C3009i a = TTLiveSDKContext.getHostService().mo10315h().mo14521a();
                    C8068g.m16014a((Context) getActivity());
                    if (a != null) {
                        a.getId();
                    }
                    this.f15715a.getId();
                } catch (JSONException unused) {
                }
                if (this.f15722aG != null) {
                    this.f15722aG.mo12528a(ccVar.f21751f, ccVar.f21750e);
                }
            }
        }
    }

    public void onEvent(C8745a aVar) {
        if (this.f15768b && aVar.f24023b == 3 && !mo11890g()) {
            this.f15815x.lambda$put$1$DataCenter("cmd_clear_gift_message", new C5745d());
        }
    }

    /* renamed from: a */
    protected static void m12978a(String str, String str2) {
        HashMap hashMap = new HashMap();
        hashMap.put("event_name", "on_adjust_text_message_widget");
        if (str != null) {
            hashMap.put("adjust_reason", str);
        }
        if (str2 != null) {
            hashMap.put("adjust_param", str2);
        }
        C8064d.m16005b().mo9197a("ttlive_room", (Map<String, ?>) hashMap);
    }

    /* renamed from: a */
    public final void mo11903a(MotionEvent motionEvent) {
        TextureView textureView = null;
        C6025ce ceVar = getParentFragment() instanceof C6025ce ? (C6025ce) getParentFragment() : null;
        if (ceVar != null) {
            textureView = ceVar.f16076x;
        }
        if (textureView != null) {
            int[] iArr = new int[2];
            textureView.getLocationOnScreen(iArr);
            if (motionEvent.getRawX() >= ((float) iArr[0]) && motionEvent.getRawX() <= ((float) (iArr[0] + textureView.getWidth())) && motionEvent.getRawY() >= ((float) iArr[1]) && motionEvent.getRawY() <= ((float) (iArr[1] + textureView.getHeight()))) {
                this.f15815x.lambda$put$1$DataCenter("cmd_touch_video", Boolean.valueOf(true));
                return;
            }
        }
        this.f15815x.lambda$put$1$DataCenter("cmd_touch_video", Boolean.valueOf(false));
    }

    /* renamed from: a */
    public final boolean mo11910a(Runnable runnable, boolean z) {
        for (C6751a a : this.f15813v) {
            if (a.mo12259a(runnable, z)) {
                return true;
            }
        }
        return false;
    }

    public void onEvent(C5186f fVar) {
        if (fVar.f13889a) {
            C6749b.m14141a(C3889d.m9831a(getContext()), this.f15715a, true);
        } else {
            C6749b.m14141a(C3889d.m9831a(getContext()), this.f15715a, false);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final /* synthetic */ void mo11902a(DialogInterface dialogInterface) {
        mo11887a(8);
    }

    /* renamed from: a */
    public final void mo9581a(float f) {
        if (this.f15727aL != null) {
            this.f15727aL.mo8316a(f);
        }
        if (C4997a.m11487a()) {
            DebugInfoView debugInfoView = this.f15772bd;
            debugInfoView.f17999e.getHandler().post(new C6672d(debugInfoView, f));
        }
    }

    public void onEvent(C5194n nVar) {
        boolean z = nVar.f13906a;
        if (!(this instanceof C5949ax)) {
            this.f15797f = z;
            boolean a = C4206c.m10426a(getContext());
            int width = this.f15799h.getWidth();
            if (a) {
                width = -width;
            }
            this.f15799h.setVisibility(8);
            if (z) {
                this.f15799h.setX((float) width);
                this.f15815x.lambda$put$1$DataCenter("cmd_show_screen", Boolean.valueOf(false));
                C4495a.m10823a().mo10301a((Object) new C5181b(true));
                return;
            }
            this.f15799h.setX(0.0f);
            this.f15799h.setVisibility(0);
            this.f15815x.lambda$put$1$DataCenter("cmd_show_screen", Boolean.valueOf(true));
            C4495a.m10823a().mo10301a((Object) new C5181b(false));
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:21:0x0045, code lost:
        if (r0 == false) goto L_0x0047;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:25:0x004f, code lost:
        if (r2.f15723aH.f16806f != false) goto L_0x0051;
     */
    /* JADX WARNING: Code restructure failed: missing block: B:26:0x0051, code lost:
        r3 = (android.widget.RelativeLayout.LayoutParams) r2.f15804m.getLayoutParams();
        r4 = new android.widget.RelativeLayout.LayoutParams(r3.width, r3.height);
        r4.addRule(11);
        r4.rightMargin = com.bytedance.android.live.core.p230g.C3922z.m9913d(com.ss.android.ugc.trill.R.dimen.s_);
        r4.addRule(2, r2.f15699J.getId());
        r4.bottomMargin = com.bytedance.android.live.core.p230g.C3922z.m9899a(8.0f);
        r2.f15804m.setLayoutParams(r4);
     */
    /* JADX WARNING: Code restructure failed: missing block: B:27:0x0087, code lost:
        return;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo9587a(boolean r3, java.lang.CharSequence r4, java.lang.CharSequence r5) {
        /*
            r2 = this;
            r0 = 1
            if (r3 == 0) goto L_0x0088
            android.widget.LinearLayout r3 = r2.f15699J
            r1 = 0
            r3.setVisibility(r1)
            android.widget.TextView r3 = r2.f15739aX
            r3.setText(r4)
            android.widget.TextView r3 = r2.f15740aY
            r3.setText(r5)
            com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget r3 = r2.f15724aI
            if (r3 == 0) goto L_0x0047
            com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerContainerWidget r3 = r2.f15724aI
            com.bytedance.android.livesdk.chatroom.viewmodule.f r4 = r3.f16792a
            if (r4 != 0) goto L_0x0022
            java.lang.String r5 = "bottomRightBannerHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r5)
        L_0x0022:
            T r4 = r4.f17696b
            com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget r4 = (com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget) r4
            if (r4 == 0) goto L_0x002b
            boolean r4 = r4.f16806f
            goto L_0x002c
        L_0x002b:
            r4 = 0
        L_0x002c:
            if (r4 != 0) goto L_0x0045
            com.bytedance.android.livesdk.chatroom.viewmodule.eg r3 = r3.f16793b
            if (r3 != 0) goto L_0x0037
            java.lang.String r4 = "pkTaskBannerHolder"
            p2628d.p2639f.p2641b.C52711k.m112237a(r4)
        L_0x0037:
            T r3 = r3.f17696b
            com.bytedance.android.livesdk.chatroom.viewmodule.LinkPkTaskWidget r3 = (com.bytedance.android.livesdk.chatroom.viewmodule.LinkPkTaskWidget) r3
            if (r3 == 0) goto L_0x0040
            boolean r3 = r3.f17247d
            goto L_0x0041
        L_0x0040:
            r3 = 0
        L_0x0041:
            if (r3 == 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r0 = 0
        L_0x0045:
            if (r0 != 0) goto L_0x0051
        L_0x0047:
            com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget r3 = r2.f15723aH
            if (r3 == 0) goto L_0x0092
            com.bytedance.android.livesdk.chatroom.viewmodule.BottomRightBannerWidget r3 = r2.f15723aH
            boolean r3 = r3.f16806f
            if (r3 == 0) goto L_0x0092
        L_0x0051:
            android.widget.FrameLayout r3 = r2.f15804m
            android.view.ViewGroup$LayoutParams r3 = r3.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r3 = (android.widget.RelativeLayout.LayoutParams) r3
            android.widget.RelativeLayout$LayoutParams r4 = new android.widget.RelativeLayout$LayoutParams
            int r5 = r3.width
            int r3 = r3.height
            r4.<init>(r5, r3)
            r3 = 11
            r4.addRule(r3)
            r3 = 2131886908(0x7f12033c, float:1.9408408E38)
            int r3 = com.bytedance.android.live.core.p230g.C3922z.m9913d(r3)
            r4.rightMargin = r3
            r3 = 2
            android.widget.LinearLayout r5 = r2.f15699J
            int r5 = r5.getId()
            r4.addRule(r3, r5)
            r3 = 1090519040(0x41000000, float:8.0)
            int r3 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r3)
            r4.bottomMargin = r3
            android.widget.FrameLayout r3 = r2.f15804m
            r3.setLayoutParams(r4)
            return
        L_0x0088:
            r2.mo11916c(r0)
            android.widget.LinearLayout r3 = r2.f15699J
            r4 = 8
            r3.setVisibility(r4)
        L_0x0092:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C5957b.mo9587a(boolean, java.lang.CharSequence, java.lang.CharSequence):void");
    }

    /* renamed from: a */
    public final void mo8248a(DutyGiftInfo dutyGiftInfo) {
        if (dutyGiftInfo == null) {
            return;
        }
        if (dutyGiftInfo.isStarted() || dutyGiftInfo.isPlaying()) {
            C7505d findGiftById = ((IGiftService) C4116c.m10249a(IGiftService.class)).findGiftById(dutyGiftInfo.getGiftId());
            if (findGiftById != null) {
                C4495a.m10823a().mo10301a((Object) new C5190j(findGiftById, 2, true));
            }
        }
    }

    /* renamed from: a */
    public final boolean mo8466a() {
        boolean z;
        C4194m mVar = (C4194m) C4514j.m10883j().mo10326g().mo10305a(C4194m.class);
        if (mVar == null || !mVar.mo9644b()) {
            z = false;
        } else {
            mVar.mo9642a();
            z = true;
        }
        if (z) {
            return true;
        }
        mo11887a(8);
        return true;
    }

    /* renamed from: e */
    public final FrameLayout mo9590e() {
        return this.f15737aV;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: v */
    public final /* synthetic */ void mo11947v() {
        mo11913b(false);
    }

    /* renamed from: B */
    private boolean m12968B() {
        if (this.f15812u == C8710m.AUDIO) {
            return true;
        }
        return false;
    }

    /* renamed from: i */
    public final boolean mo11919i() {
        if (!mo11891j()) {
            return true;
        }
        return false;
    }

    /* renamed from: l */
    public void mo11920l() {
        this.f15813v.add(new C6222t(this));
    }

    public void onPause() {
        super.onPause();
        if (this.f15758aq != null) {
            this.f15758aq.mo14232b();
        }
        this.f15712X = true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: t */
    public final /* synthetic */ void mo11945t() {
        this.f15815x.lambda$put$1$DataCenter("data_keyboard_status", Boolean.valueOf(false));
        m12986d(0);
    }

    /* renamed from: b */
    public final void mo9495b() {
        if (this.f15778bj != null && this.f15778bj.isShowing()) {
            this.f15778bj.dismiss();
            this.f15778bj = null;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: m */
    public final void mo11921m() {
        if (getContext() != null && this.f15707S != C5972a.PK) {
            this.f15708T = this.f15707S;
            this.f15707S = C5972a.PK;
            this.f15744ac.setVisibility(4);
        }
    }

    /* renamed from: n */
    public final void mo11922n() {
        if (this.f15768b && this.f15690A != null) {
            this.f15815x.lambda$put$1$DataCenter("cmd_stop_special_gift", Boolean.valueOf(true));
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: u */
    public final /* synthetic */ void mo11946u() {
        this.f15815x.lambda$put$1$DataCenter("data_keyboard_status", Boolean.valueOf(true));
        m12986d(8);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: w */
    public final /* synthetic */ void mo11948w() {
        if (!this.f15712X) {
            mo11887a(3);
        } else {
            this.f15711W = true;
        }
        if (this.f15760as != null) {
            this.f15760as.mo10434a(this.f15715a.getId(), this.f15794c);
        }
    }

    /* renamed from: x */
    private void mo11895x() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            Bundle bundle = arguments.getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            if (bundle != null) {
                this.f15701L = bundle.getLong("live.intent.extra.ENTER_LIVE_TIME", 0);
            }
            this.f15709U = arguments.getString("live.intent.extra.ENTER_LIVE_SOURCE", "");
        }
    }

    /* renamed from: c */
    public final void mo9588c() {
        if (this.f15758aq != null) {
            this.f15758aq.f22050a = true;
            this.f15758aq.mo14232b();
        }
    }

    /* renamed from: A */
    private void m12967A() {
        if (getView() != null && mo11941p() && getContext() != null) {
            LayoutParams layoutParams = (LayoutParams) this.f15804m.getLayoutParams();
            layoutParams.width = C3922z.m9913d(R.dimen.sc);
            layoutParams.height = C3922z.m9913d(R.dimen.sb);
            this.f15804m.setLayoutParams(layoutParams);
            if (this.f15780bl) {
                FrameLayout frameLayout = (FrameLayout) getView().findViewById(R.id.blh);
                LayoutParams layoutParams2 = (LayoutParams) frameLayout.getLayoutParams();
                m12973a(layoutParams2);
                frameLayout.setLayoutParams(layoutParams2);
                m12978a("adjust_right_bottom_banner", (String) null);
            }
        }
    }

    /* renamed from: d */
    public final void mo9589d() {
        if (this.f15694E != null) {
            this.f15694E.mo12319c();
        }
        if (this.f15750ai != null) {
            this.f15750ai.dismissAllowingStateLoss();
        }
        if (this.f15770bb != null) {
            this.f15770bb.mo8320a();
        }
        if (getActivity() != null) {
            Fragment a = getActivity().getSupportFragmentManager().mo2224a(C4742w.class.getCanonicalName());
            if (a instanceof C0649f) {
                ((C0649f) a).dismissAllowingStateLoss();
            }
            Fragment a2 = getActivity().getSupportFragmentManager().mo2224a(C4715c.class.getCanonicalName());
            if (a2 instanceof C0649f) {
                ((C0649f) a2).dismissAllowingStateLoss();
            }
        }
    }

    public void onDestroy() {
        this.f15759ar = false;
        if (this.f15742aa != null) {
            this.f15742aa.stop();
        }
        mo9588c();
        this.f15793by = null;
        if (this.f15761at != null && this.f15761at.mo12851g()) {
            this.f15761at.dismiss();
        }
        if (this.f15762au != null && this.f15762au.mo12851g()) {
            this.f15762au.dismiss();
        }
        mo11913b(false);
        if (this.f15755an != null) {
            C5875i iVar = this.f15755an;
            if (iVar.f15383c != null) {
                iVar.f15383c.removeMessageListener(iVar);
            }
            iVar.f15381a = null;
        }
        this.f15808q.removeCallbacksAndMessages(null);
        super.onDestroy();
    }

    public void onDestroyView() {
        if (C4565af.m10958a() != null && mo11919i()) {
            C4565af.m10958a().stopMessage(true);
        }
        C5007d.INSTANCE.stop();
        this.f15807p.mo6180a();
        if (this.f15815x != null) {
            this.f15815x.removeObserver(this);
        }
        this.f15768b = false;
        if (this.f15779bk != null) {
            this.f15779bk.mo8247a();
        }
        if (this.f15756ao != null) {
            C5838bs bsVar = this.f15756ao;
            if (C4565af.m10958a() != null) {
                C4565af.m10958a().removeMessageListener(bsVar);
            }
            bsVar.f15302a = null;
        }
        if (this.f15757ap != null) {
            this.f15757ap.mo8247a();
        }
        if (this.f15769ba != null) {
            this.f15769ba.mo8247a();
        }
        this.f15808q.removeMessages(100);
        super.onDestroyView();
        this.f15787bs = null;
        if (this.f15774bf != null) {
            this.f15774bf.dismiss();
            this.f15774bf = null;
        }
    }

    public void onResume() {
        super.onResume();
        if (this.f15758aq != null) {
            this.f15758aq.mo14231a();
        }
        if (this.f15711W) {
            mo11887a(3);
            this.f15711W = false;
        }
        this.f15712X = false;
        if (mo11942q() && getDialog() != null) {
            Window window = getDialog().getWindow();
            if (!(window == null || VERSION.SDK_INT < 21 || window.getStatusBarColor() == -16777216)) {
                window.setStatusBarColor(-16777216);
            }
        }
    }

    /* renamed from: s */
    public final void mo11944s() {
        this.f15702M.setVisibility(0);
        if (this.f15815x != null) {
            this.f15815x.lambda$put$1$DataCenter(f15689N, Boolean.valueOf(false));
        }
        this.f15705Q.postDelayed(new Runnable() {
            public final void run() {
                C5957b.this.f15702M.setVisibility(8);
            }
        }, 5000);
        HashMap hashMap = new HashMap();
        hashMap.put("room_id", String.valueOf(this.f15715a.getId()));
        C8049c.m15979a().mo14202a("anchor_share_guide", hashMap, new C8059j(), Room.class);
    }

    /* renamed from: z */
    private void m12992z() {
        HashMap hashMap = new HashMap();
        hashMap.put("target_uid", String.valueOf(TTLiveSDKContext.getHostService().mo10315h().mo14529b()));
        hashMap.put("sec_target_uid", TTLiveSDKContext.getHostService().mo10315h().mo14521a().getSecUid());
        hashMap.put("packed_level", "2");
        hashMap.put("request_from", "admin");
        hashMap.put("current_room_id", String.valueOf(this.f15715a.getId()));
        hashMap.put("anchor_id", String.valueOf(this.f15715a.getOwner().getId()));
        hashMap.put("sec_anchor_id", TTLiveSDKContext.getHostService().mo10315h().mo14522a(this.f15715a.getOwner().getId()));
        TTLiveSDKContext.getHostService().mo10315h().mo14515a(hashMap).mo6155b(C2168a.m6521b()).mo6148a(C1667a.m5940a()).mo6159b(this.f15777bi);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo11892k() {
        if (this.f15787bs != null) {
            this.f15800i.post(this.f15787bs);
            this.f15787bs = null;
        }
        mo11920l();
        IMessageManager a = C4565af.m10958a();
        if (a != null && mo11919i()) {
            a.startMessage();
        }
        if (this.f15715a.getOwner() != null && !this.f15751aj) {
            this.f15751aj = true;
        }
        long j = 0;
        if (this.f15794c) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            long longValue = ((Long) C4525b.f12449w.mo10345a()).longValue();
            if (this.f15715a.getId() <= 0 || this.f15715a.getId() != ((Long) C4525b.f12448v.mo10345a()).longValue() || longValue <= 0 || longValue >= elapsedRealtime) {
                C4525b.f12448v.mo10346a(Long.valueOf(this.f15715a.getId()));
                C4525b.f12449w.mo10346a(Long.valueOf(elapsedRealtime));
                j = elapsedRealtime;
            } else {
                j = longValue;
            }
        }
        if (!this.f15794c) {
            this.f15742aa.stop();
            m12984c(8);
        } else if (C8607a.f23572a) {
            View view = getView();
            if (view != null) {
                View findViewById = view.findViewById(R.id.bc6);
                if (findViewById != null) {
                    findViewById.setVisibility(0);
                }
            }
        } else {
            this.f15742aa.setBase(j);
            m12984c(0);
            this.f15742aa.start();
        }
        this.f15810s = new C6230z(getContext());
        this.f15809r = new GestureDetector(getContext(), new C5973b());
        this.f15752ak.mo14708a(this.f15792bx);
        this.f15755an = new C5875i(this.f15815x);
        C5875i iVar = this.f15755an;
        iVar.f15381a = this;
        iVar.f15383c = (IMessageManager) iVar.f15382b.get("data_message_manager");
        if (iVar.f15383c != null) {
            iVar.f15383c.addMessageListener(C8629a.CONTROL.getIntType(), iVar);
        }
        this.f15756ao = new C5838bs();
        C5838bs bsVar = this.f15756ao;
        bsVar.f15302a = this;
        IMessageManager a2 = C4565af.m10958a();
        if (a2 != null) {
            a2.addMessageListener(C8629a.MEMBER.getIntType(), bsVar);
            a2.addMessageListener(C8629a.ROOM_NOTIFY.getIntType(), bsVar);
            a2.addMessageListener(C8629a.REMIND.getIntType(), bsVar);
            a2.addMessageListener(C8629a.COMMON_TOAST.getIntType(), bsVar);
            a2.addMessageListener(C8629a.FOLLOW_GUIDE.getIntType(), bsVar);
            a2.addMessageListener(C8629a.GUIDE_MESSAGE.getIntType(), bsVar);
            a2.addMessageListener(C8629a.COMMON_GUIDE.getIntType(), bsVar);
            a2.addMessageListener(C8629a.CEREMONY_MESSAGE.getIntType(), bsVar);
        }
        this.f15757ap = new C5859ce(this.f15815x);
        this.f15757ap.mo8520a(this);
        this.f15779bk = ((IGiftService) C4116c.m10249a(IGiftService.class)).getGiftGuidePresenter(this.f15815x);
        this.f15779bk.mo8520a(this);
        C5007d.INSTANCE.start(this);
        if (!(this.f15715a == null || this.f15715a.getOwner() == null || this.f15751aj)) {
            this.f15751aj = true;
        }
        if (TTLiveSDKContext.getHostService().mo10315h().mo14532c()) {
            m12992z();
        }
        ((Boolean) LiveSettingKeys.VIGO_FLAME_DIAMOND_GUIDE_SWITCH.mo9431a()).booleanValue();
        if (this.f15715a != null && this.f15715a.getStatus() == 3 && !this.f15794c) {
            C8009t a3 = C5006c.m11498a(this.f15715a.getId(), false);
            if (C4565af.m10958a() != null && mo11919i()) {
                C4565af.m10958a().insertMessage(a3, true);
            }
        }
        C3982g.m10092c(C3983a.ShowBInteractionFirstWidget);
        C3974b.m10061a().mo9374a(C3983a.ShowBInteractionFirstWidget.name());
        C3982g.m10092c(C3983a.ShowCInteractionFirstWidget);
        C3974b.m10061a().mo9374a(C3983a.ShowCInteractionFirstWidget.name());
        mo11900a(((long) ((Integer) C6718b.f18306C.mo9431a()).intValue()) * 1000);
    }

    /* renamed from: e */
    private void m12987e(int i) {
        getView();
    }

    /* renamed from: a */
    private static void m12974a(C5204w wVar) {
        C4495a.m10823a().mo10301a((Object) wVar);
    }

    public void onEvent(C5206y yVar) {
        this.f15815x.lambda$put$1$DataCenter("data_login_event", yVar);
    }

    /* renamed from: a */
    private void mo11887a(int i) {
        m12974a(new C5204w(i));
    }

    /* renamed from: b */
    private void m12982b(int i) {
        this.f15815x.lambda$put$1$DataCenter("cmd_update_sticker_position", new C5176av(i));
    }

    /* renamed from: c */
    private void m12984c(int i) {
        if (i == 0) {
            this.f15742aa.setVisibility(0);
        } else {
            this.f15742aa.setVisibility(i);
        }
    }

    public void onEvent(C5158ad adVar) {
        if (adVar != null && adVar.f13825a != null) {
            mo11905a(adVar.f13825a);
        }
    }

    /* renamed from: a */
    private HashMap<String, String> m12969a(HashMap<String, String> hashMap) {
        long j;
        if (this.f15715a != null) {
            j = this.f15715a.getId();
        } else {
            j = 0;
        }
        hashMap.put("room_id", String.valueOf(j));
        return hashMap;
    }

    /* renamed from: d */
    private void m12986d(int i) {
        if (this.f15715a == null || !this.f15715a.isOfficial()) {
            C9432q.m18691b(this.f15800i, i);
        }
    }

    public void onEvent(C5171aq aqVar) {
        if (aqVar == null || !aqVar.f13857a) {
            this.f15773be.setVisibility(8);
        } else {
            this.f15773be.setVisibility(0);
        }
    }

    /* renamed from: a */
    private void m12973a(LayoutParams layoutParams) {
        if (this.f15780bl && mo11890g()) {
            layoutParams.width = -1;
            layoutParams.rightMargin = C3922z.m9913d(R.dimen.s2);
        }
    }

    /* renamed from: e */
    private void m12988e(boolean z) {
        C4889bp.f13165a = z;
        if (this.f15811t == null) {
            m12992z();
            return;
        }
        if (this.f15811t.getUserAttr() == null) {
            this.f15811t.setUserAttr(new C3012k());
        }
        this.f15811t.getUserAttr().f8850a = z;
    }

    /* renamed from: f */
    private void m12989f(boolean z) {
        int i;
        int i2;
        LiveToolbarWidget liveToolbarWidget = this.f15693D;
        int i3 = 0;
        if (z) {
            i = 8;
        } else {
            i = 0;
        }
        m12976a((LiveWidget) liveToolbarWidget, i);
        CommentWidget commentWidget = this.f15694E;
        if (z) {
            i2 = 8;
        } else {
            i2 = 0;
        }
        m12976a((LiveWidget) commentWidget, i2);
        DutyGiftToolbarWidget dutyGiftToolbarWidget = this.f15717aB;
        if (!z) {
            i3 = 8;
        }
        m12976a((LiveWidget) dutyGiftToolbarWidget, i3);
        C8064d.m16005b();
        StringBuilder sb = new StringBuilder("CommentWidget status Changed, isShow:");
        sb.append(!z);
        C8064d.m9720b("ttlive_comment", sb.toString());
    }

    /* renamed from: d */
    public final void mo11917d(boolean z) {
        int i;
        if (z) {
            i = 4;
        } else {
            i = 0;
        }
        m12985c(R.id.d3u, i);
        m12985c(R.id.c57, i);
        m12985c(R.id.c6m, i);
        m12985c(R.id.a32, i);
        m12985c(R.id.by4, i);
        m12985c(R.id.adj, i);
        m12985c(R.id.apn, i);
        this.f15742aa.setVisibility(8);
        m12986d(i);
    }

    public void onEvent(C5170ap apVar) {
        if (this.f15814w != null && (apVar.f13856b == 2 || SystemClock.elapsedRealtime() - this.f15814w.f13612n <= ((long) ((Integer) C6718b.f18306C.mo9431a()).intValue()) * 1000)) {
            if (this.f15715a.isOfficial()) {
                this.f15759ar = false;
            } else {
                this.f15759ar = apVar.f13855a;
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo11912b(View view) {
        int id = view.getId();
        if (id == R.id.ue || id == R.id.ij) {
            mo11887a(6);
            if (this.f15815x != null) {
                this.f15815x.lambda$put$1$DataCenter("hide_share_lead", Boolean.valueOf(true));
                this.f15815x.lambda$put$1$DataCenter("hide_share_lead", Boolean.valueOf(false));
            }
        } else if (id == R.id.evg) {
            this.f15702M.setVisibility(8);
        }
    }

    /* renamed from: c */
    public final void mo11916c(boolean z) {
        LayoutParams layoutParams = (LayoutParams) this.f15804m.getLayoutParams();
        LayoutParams layoutParams2 = new LayoutParams(layoutParams.width, layoutParams.height);
        if (z) {
            layoutParams2.addRule(12);
            layoutParams2.bottomMargin = C3922z.m9913d(R.dimen.s8);
            layoutParams2.addRule(11);
            layoutParams2.rightMargin = C3922z.m9913d(R.dimen.s_);
        } else {
            layoutParams2.addRule(10);
            layoutParams2.topMargin = C3922z.m9913d(R.dimen.sa);
            layoutParams2.addRule(9);
            layoutParams2.leftMargin = C3922z.m9913d(R.dimen.s9);
        }
        this.f15804m.setLayoutParams(layoutParams2);
    }

    public void handleMsg(Message message) {
        if (this.f15768b) {
            if (message.obj instanceof C2949a) {
                mo11908a((Throwable) (Exception) message.obj);
            } else if (message.obj instanceof Exception) {
                Object obj = message.obj;
            } else if (message.what == 100) {
                C8688c cVar = (C8688c) message.obj;
                HashMap hashMap = new HashMap();
                hashMap.put("sticker_id", String.valueOf(cVar.f23744e));
                C8049c.m15979a().mo14202a("live_take_sticker_effective_use", m12969a(hashMap), new C8059j().mo14214b("live_take").mo14218f("click").mo14213a("live_take_detail"));
                this.f15815x.lambda$put$1$DataCenter("data_has_sticker_effective", Boolean.valueOf(true));
            } else {
                if (message.what == 200) {
                    C4495a.m10823a().mo10301a((Object) new C5170ap(true, 2));
                }
            }
        }
    }

    public void onEvent(C4765c cVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (!TextUtils.isEmpty(cVar.f12970a)) {
            DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
            int i5 = (int) (((float) displayMetrics.widthPixels) / displayMetrics.density);
            int i6 = (int) (((float) displayMetrics.heightPixels) / displayMetrics.density);
            if (mo11890g()) {
                if (cVar.f12971b > 0) {
                    i4 = cVar.f12971b;
                } else {
                    i4 = i6 / 2;
                }
                i = i4;
                i2 = i5;
            } else {
                i2 = i6;
                i = i2;
            }
            String str = cVar.f12970a;
            String str2 = "";
            if (mo11890g()) {
                i3 = 80;
            } else {
                i3 = 8388613;
            }
            C5161ag agVar = new C5161ag(str, str2, i3, i2, i, 0);
            onEvent(agVar);
        }
    }

    /* renamed from: b */
    public final void mo8249b(DutyGiftInfo dutyGiftInfo) {
        if (dutyGiftInfo != null) {
            if (dutyGiftInfo.isStarted()) {
                C7505d findGiftById = ((IGiftService) C4116c.m10249a(IGiftService.class)).findGiftById(dutyGiftInfo.getGiftId());
                if (findGiftById != null) {
                    C4495a.m10823a().mo10301a((Object) new C5190j(findGiftById, 2, true));
                }
            } else if (dutyGiftInfo.isFinished()) {
                C7505d fastGift = ((IGiftService) C4116c.m10249a(IGiftService.class)).getFastGift();
                if (fastGift != null) {
                    C4495a.m10823a().mo10301a((Object) new C5190j(fastGift, 2));
                }
            }
        }
    }

    public void onEvent(C4766d dVar) {
        if (this.f15764aw == null || !this.f15764aw.isShowing()) {
            JSONObject jSONObject = dVar.f12973b;
            try {
                jSONObject.put("anchor_id", this.f15715a.getOwner().getId());
            } catch (Exception e) {
                C3831a.m9714b("AbsInteractionFragment", (Throwable) e);
            }
            Bundle bundle = new Bundle();
            bundle.putString(IWalletService.KEY_BUNDLE_REQUEST_PAGE, "live_detail");
            this.f15764aw = ((IWalletService) C4116c.m10249a(IWalletService.class)).getConsumeDialog(getActivity(), bundle, jSONObject, new C4283a() {
                /* renamed from: a */
                public final void mo10028a(Dialog dialog, C4383d dVar) {
                    if (dVar != null) {
                        switch (dVar.mo10211b()) {
                            case 10001:
                                C4575an.m10981a((int) R.string.exn);
                                if (C5957b.this.f15817z != null) {
                                    C5957b.this.f15817z.dismissAllowingStateLoss();
                                }
                                if (C5957b.this.f15815x != null) {
                                    C5957b.this.f15815x.lambda$put$1$DataCenter("cmd_purchase_success", "");
                                    return;
                                }
                                break;
                            case 10002:
                                JSONObject jSONObject = new JSONObject();
                                try {
                                    jSONObject.put("status", "success");
                                    jSONObject.put("code", "1");
                                } catch (Exception e) {
                                    C3831a.m9714b("AbsInteractionFragment", (Throwable) e);
                                }
                                C4514j.m10883j().mo10322c().mo10498a("H5_payStatus", jSONObject);
                                break;
                        }
                    }
                }
            }, dVar.f12972a);
            this.f15764aw.show();
        }
    }

    /* renamed from: a */
    private void m12975a(C7818aw awVar) {
        if (getView() != null && mo11941p() && getContext() != null) {
            this.f15736aU = awVar.f21524a;
            View findViewById = ((ViewGroup) getView().findViewById(R.id.aas)).findViewById(R.id.aao);
            if (findViewById instanceof EnterAnimationView) {
                ((EnterAnimationView) findViewById).setChildMarginBottom(awVar.f21524a);
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo11913b(boolean z) {
        if (!z) {
            if (this.f15763av != null && this.f15763av.isShowing()) {
                this.f15763av.dismiss();
            }
            this.f15763av = null;
        } else if (mo11941p() && ((this.f15763av == null || !this.f15763av.isShowing()) && !getActivity().isFinishing())) {
            if (this.f15763av == null) {
                this.f15763av = new C6162et(getActivity(), mo11890g(), this.f15715a, this.f15709U);
            }
            this.f15763av.f16538e = this.f15815x;
            this.f15763av.show();
            if (this.f15788bt > 0) {
                this.f15808q.removeCallbacks(this.f15790bv);
                this.f15808q.postDelayed(this.f15790bv, this.f15788bt);
                this.f15788bt = 0;
            }
            C8049c.m15979a().mo14203a("follow_popup_show", C8059j.class, Room.class);
        }
    }

    public void onCreate(Bundle bundle) {
        int i;
        String str;
        super.onCreate(null);
        setStyle(1, R.style.yt);
        setCancelable(false);
        m12977a(C5185e.class);
        m12977a(C8745a.class);
        m12977a(C5205x.class);
        m12977a(C5206y.class);
        m12977a(C8617c.class);
        m12977a(C5160af.class);
        m12977a(C4766d.class);
        m12977a(C5161ag.class);
        m12977a(C7713e.class);
        m12977a(C5170ap.class);
        m12977a(C7721b.class);
        m12977a(UserProfileEvent.class);
        m12977a(C4765c.class);
        m12977a(C5158ad.class);
        m12977a(C5194n.class);
        m12977a(C5171aq.class);
        m12977a(C5186f.class);
        C4639e.m11122a().mo10414a(Integer.valueOf(0));
        if (this.f15812u == null) {
            this.f15812u = C8710m.VIDEO;
        }
        if (TTLiveSDKContext.getHostService() != null) {
            this.f15698I = TTLiveSDKContext.getHostService().mo10315h();
        }
        mo11895x();
        this.f15781bm = getContext().getResources().getDimensionPixelSize(R.dimen.qq);
        this.f15782bn = getContext().getResources().getDimensionPixelSize(R.dimen.qr);
        this.f15783bo = (int) getContext().getResources().getDimension(R.dimen.rg);
        this.f15784bp = (int) getContext().getResources().getDimension(R.dimen.rf);
        if (mo11890g()) {
            i = C3922z.m9913d(R.dimen.r3);
        } else {
            i = 0;
        }
        this.f15736aU = i;
        if (this.f15815x != null) {
            this.f15815x.lambda$put$1$DataCenter("log_enter_live_source", this.f15709U);
            if (C35807d.m80935a(getActivity(), "feed_live_span", 0).getInt("span_count", 0) > 1) {
                str = "live_small_picture";
            } else {
                str = "live_big_picture";
            }
            this.f15815x.lambda$put$1$DataCenter("log_live_feed_layout", str);
            this.f15815x.lambda$put$1$DataCenter("log_streaming_type", this.f15812u.logStreamingType);
        }
        Context context = getContext();
        if (C4551a.f12502a == null) {
            synchronized (C4551a.class) {
                if (C4551a.f12502a == null) {
                    C4551a.f12502a = new C4551a(context);
                }
            }
        }
        new NextLiveData().setValue(Boolean.valueOf(true));
        if (this.f15815x != null) {
            this.f15815x.lambda$put$1$DataCenter(f15689N, Boolean.valueOf(false));
            this.f15815x.observe(f15689N, new C6213k(this));
        }
    }

    public void onEvent(UserProfileEvent userProfileEvent) {
        long j;
        boolean z;
        boolean z2;
        String str;
        if (this.f15768b && ((this.f15761at == null || !this.f15761at.mo12851g()) && getActivity() != null)) {
            if (this.f15715a == null || !this.f15715a.isOfficial()) {
                if (userProfileEvent.user != null) {
                    j = userProfileEvent.user.getId();
                    this.f15761at = C6072db.m13227a(getActivity(), mo11890g(), userProfileEvent.user.getId(), this.f15715a, this.f15811t, userProfileEvent.mSource);
                } else {
                    j = userProfileEvent.userId;
                    this.f15761at = C6072db.m13227a(getActivity(), mo11890g(), userProfileEvent.userId, this.f15715a, this.f15811t, userProfileEvent.mSource);
                }
                C6072db dbVar = this.f15761at;
                long j2 = userProfileEvent.msgId;
                String str2 = userProfileEvent.content;
                dbVar.f16264r = j2;
                dbVar.f16265s = str2;
                C6072db dbVar2 = this.f15761at;
                String str3 = userProfileEvent.interactLogLabel;
                if (dbVar2.f16236G != null) {
                    dbVar2.f16236G.f16197v = str3;
                }
                C6072db dbVar3 = this.f15761at;
                String str4 = this.f15709U;
                dbVar3.f16262p = str4;
                if (dbVar3.f16236G != null) {
                    dbVar3.f16236G.f16198w = str4;
                }
                this.f15761at.f16235F = this.f15815x;
                this.f15815x.lambda$put$1$DataCenter(f15689N, Boolean.valueOf(true));
                this.f15761at.show(getFragmentManager(), C6072db.f16229a);
                if (Room.isValid(this.f15715a)) {
                    User user = (User) this.f15815x.get("data_user_in_room");
                    long id = this.f15715a.getOwner().getId();
                    if (user == null || user.getId() == 0 || user.getId() != id) {
                        z = false;
                    } else {
                        z = true;
                    }
                    if (j == 0 || j != id) {
                        z2 = false;
                    } else {
                        z2 = true;
                    }
                    if (z) {
                        if (z2) {
                            str = "anchor_c_anchor";
                        } else {
                            str = "anchor_c_audience";
                        }
                    } else if (z2) {
                        str = "audience_c_anchor";
                    } else {
                        str = "audience_c_audience";
                    }
                    HashMap hashMap = new HashMap();
                    hashMap.put("click_type", str);
                    hashMap.put("request_page", str);
                    hashMap.put("to_user_id", String.valueOf(j));
                    if (!TextUtils.isEmpty(userProfileEvent.mEventModule)) {
                        hashMap.put("event_module", userProfileEvent.mEventModule);
                    }
                    if (!TextUtils.isEmpty(userProfileEvent.mClickUserPosition)) {
                        hashMap.put("click_user_position", userProfileEvent.mClickUserPosition);
                    }
                    C8049c.m15979a().mo14202a("livesdk_live_click_user", hashMap, Room.class, new C8059j().mo14213a("live_detail").mo14214b("live_interact"), new C8060k());
                }
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: c */
    public final void mo11915c(float f) {
        boolean z;
        boolean z2;
        if (!(this instanceof C5949ax)) {
            boolean a = C4206c.m10426a(getContext());
            boolean z3 = false;
            if ((!a || f >= 0.0f) && (a || f <= 0.0f)) {
                z = false;
            } else {
                z = true;
            }
            int width = this.f15799h.getWidth();
            if (a) {
                width = -width;
            }
            if (z) {
                HashMap hashMap = new HashMap();
                hashMap.put("scene_id", "1001");
                C8038g a2 = C8049c.m15979a().mo14201a(C8059j.class);
                if (!(a2 == null || a2.mo14192a() == null || !a2.mo14192a().containsKey("enter_from_merge"))) {
                    hashMap.put("enter_from_merge", (String) a2.mo14192a().get("enter_from_merge"));
                }
                if (!(a2 == null || a2.mo14192a() == null || !a2.mo14192a().containsKey("enter_method"))) {
                    hashMap.put("enter_method", (String) a2.mo14192a().get("enter_method"));
                }
                if (!(a2 == null || a2.mo14192a() == null || !a2.mo14192a().containsKey("video_id"))) {
                    hashMap.put("video_id", (String) a2.mo14192a().get("video_id"));
                }
                String str = (String) this.f15815x.get("log_action_type");
                if (str != null) {
                    hashMap.put("action_type", str);
                }
                if (!(this.f15715a == null || this.f15715a.author() == null)) {
                    hashMap.put("anchor_id", String.valueOf(this.f15715a.author().getId()));
                    hashMap.put("room_id", String.valueOf(this.f15715a.getId()));
                }
                C8038g a3 = C8049c.m15979a().mo14201a(Room.class);
                if (!(a3 == null || a3.mo14192a() == null || !a3.mo14192a().containsKey("request_id"))) {
                    hashMap.put("request_id", (String) a3.mo14192a().get("request_id"));
                }
                if (!(a3 == null || a3.mo14192a() == null || !a3.mo14192a().containsKey("log_pb"))) {
                    hashMap.put("log_pb", (String) a3.mo14192a().get("log_pb"));
                }
                hashMap.put("clear_type", "draw");
                C8049c.m15979a().mo14202a("livesdk_screen_clear", hashMap, new C8059j().mo14214b(CustomActionPushReceiver.f104061f).mo14213a("live_take_detail"));
                C8068g.m16014a((Context) getActivity());
                this.f15715a.getId();
                this.f15799h.animate().x((float) width).setListener(new AnimatorListenerAdapter() {
                    public final void onAnimationEnd(Animator animator) {
                        C4495a.m10823a().mo10301a((Object) new C5181b(true));
                    }
                }).start();
                m12987e(0);
                return;
            }
            C8068g.m16014a((Context) getActivity());
            this.f15715a.getId();
            this.f15799h.animate().x(0.0f).setListener(new AnimatorListenerAdapter() {
                public final void onAnimationStart(Animator animator) {
                    C4495a.m10823a().mo10301a((Object) new C5181b(false));
                }
            }).start();
            m12987e(8);
            if (!C5234s.m11850a(this.f15815x) || !((Boolean) LiveSettingKeys.LIVE_MT_FEED_DRAWER_SHOW_MORE_LIVE.mo9431a()).booleanValue()) {
                z2 = false;
            } else {
                z2 = true;
            }
            if (C5234s.m11852b(this.f15815x) && ((Boolean) LiveSettingKeys.LIVE_MT_FORYOU_ENTRANCE_SHOW_MORE_LIVE.mo9431a()).booleanValue()) {
                z3 = true;
            }
            if ((z2 || z3) && TTLiveSDKContext.getHostService().mo10315h().mo14532c() && !this.f15715a.isOfficial() && this.f15799h.getTranslationX() == 0.0f) {
                Bundle bundle = new Bundle();
                bundle.putString("pull_type", "draw");
                C4495a.m10823a().mo10301a((Object) new C5156ab("draw"));
                C6749b.m14143a(getActivity(), Boolean.valueOf(true), bundle, "drawer");
            }
        }
    }

    public void onEvent(C5160af afVar) {
        if (!TextUtils.isEmpty(afVar.f13830a)) {
            int e = (int) C3922z.m9914e((int) (((float) C3922z.m9910c()) * 0.8f));
            this.f15817z = ((C3805a) C4116c.m10249a(C3805a.class)).webViewManager().mo10487a(C4704c.m11226a(afVar.f13830a).mo10510a(e).mo10514b((e * 4) / 3).mo10518d(5).mo10520e(17).mo10513a(true));
            if (getFragmentManager() != null) {
                this.f15817z.show(getFragmentManager(), "PackagePurchase");
            }
        }
    }

    /* renamed from: a */
    private <T> void m12977a(Class<T> cls) {
        ((C4002ac) C4495a.m10823a().mo10300a(cls).mo6514a(C1667a.m5940a()).mo6525a((C2203w<T, ? extends R>) C4021e.m10137a((Fragment) this))).mo9405a((C1710e<? super T>) new C6219q<Object>(this));
    }

    /* Code decompiled incorrectly, please refer to instructions dump. */
    public /* synthetic */ void onChanged(java.lang.Object r11) {
        /*
            r10 = this;
            com.bytedance.ies.sdk.widgets.KVData r11 = (com.bytedance.ies.sdk.widgets.KVData) r11
            boolean r0 = r10.mo11941p()
            if (r0 == 0) goto L_0x04a9
            if (r11 == 0) goto L_0x04a9
            java.lang.String r0 = r11.getKey()
            boolean r0 = android.text.TextUtils.isEmpty(r0)
            if (r0 != 0) goto L_0x04a9
            java.lang.Object r0 = r11.getData()
            if (r0 != 0) goto L_0x001c
            goto L_0x04a9
        L_0x001c:
            java.lang.String r0 = r11.getKey()
            int r1 = r0.hashCode()
            r2 = 11
            r3 = 4
            r4 = 12
            r5 = 8
            r6 = -1
            r7 = 0
            r8 = 1
            switch(r1) {
                case -1989081898: goto L_0x00e2;
                case -1836833765: goto L_0x00d8;
                case -1540323875: goto L_0x00ce;
                case -1130046128: goto L_0x00c4;
                case -993227351: goto L_0x00b9;
                case -797556114: goto L_0x00ae;
                case -479478831: goto L_0x00a3;
                case -424351287: goto L_0x0098;
                case -271145422: goto L_0x008e;
                case -81738768: goto L_0x0083;
                case 506917167: goto L_0x0077;
                case 1008814090: goto L_0x006b;
                case 1631824572: goto L_0x0060;
                case 1722450802: goto L_0x0055;
                case 1896837901: goto L_0x004a;
                case 1939188655: goto L_0x003f;
                case 2002249609: goto L_0x0033;
                default: goto L_0x0031;
            }
        L_0x0031:
            goto L_0x00ed
        L_0x0033:
            java.lang.String r1 = "cmd_sticker_is_selected"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 11
            goto L_0x00ee
        L_0x003f:
            java.lang.String r1 = "data_screen_record_is_open"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 0
            goto L_0x00ee
        L_0x004a:
            java.lang.String r1 = "cmd_live_radio"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 4
            goto L_0x00ee
        L_0x0055:
            java.lang.String r1 = "cmd_show_user_profile"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 1
            goto L_0x00ee
        L_0x0060:
            java.lang.String r1 = "cmd_video_orientation_changed"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 7
            goto L_0x00ee
        L_0x006b:
            java.lang.String r1 = "cmd_refresh_user_in_room"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 9
            goto L_0x00ee
        L_0x0077:
            java.lang.String r1 = "data_login_event"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 10
            goto L_0x00ee
        L_0x0083:
            java.lang.String r1 = "cmd_adjust_video_interact_stream_bottom"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 13
            goto L_0x00ee
        L_0x008e:
            java.lang.String r1 = "cmd_interact_audio"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 2
            goto L_0x00ee
        L_0x0098:
            java.lang.String r1 = "cmd_show_fans_club_setting"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 12
            goto L_0x00ee
        L_0x00a3:
            java.lang.String r1 = "cmd_official_hide"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 16
            goto L_0x00ee
        L_0x00ae:
            java.lang.String r1 = "cmd_close_h5_dialog"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 14
            goto L_0x00ee
        L_0x00b9:
            java.lang.String r1 = "cmd_duty_gift_changed"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 15
            goto L_0x00ee
        L_0x00c4:
            java.lang.String r1 = "cmd_interact_player_view_change"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 3
            goto L_0x00ee
        L_0x00ce:
            java.lang.String r1 = "cmd_pk_state_change"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 5
            goto L_0x00ee
        L_0x00d8:
            java.lang.String r1 = "cmd_widget_loaded"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 6
            goto L_0x00ee
        L_0x00e2:
            java.lang.String r1 = "cmd_enter_widget_layout_change"
            boolean r0 = r0.equals(r1)
            if (r0 == 0) goto L_0x00ed
            r0 = 8
            goto L_0x00ee
        L_0x00ed:
            r0 = -1
        L_0x00ee:
            r1 = 1090519040(0x41000000, float:8.0)
            switch(r0) {
                case 0: goto L_0x047f;
                case 1: goto L_0x0467;
                case 2: goto L_0x042d;
                case 3: goto L_0x0406;
                case 4: goto L_0x03cc;
                case 5: goto L_0x0276;
                case 6: goto L_0x0272;
                case 7: goto L_0x0243;
                case 8: goto L_0x0239;
                case 9: goto L_0x0227;
                case 10: goto L_0x0219;
                case 11: goto L_0x0199;
                case 12: goto L_0x015b;
                case 13: goto L_0x0125;
                case 14: goto L_0x011b;
                case 15: goto L_0x010d;
                case 16: goto L_0x00f5;
                default: goto L_0x00f3;
            }
        L_0x00f3:
            goto L_0x04a8
        L_0x00f5:
            boolean r11 = r10 instanceof com.bytedance.android.livesdk.chatroom.p325ui.C5949ax
            if (r11 == 0) goto L_0x04a8
            com.bytedance.android.livesdkapi.depend.model.live.Room r11 = r10.f15715a
            if (r11 == 0) goto L_0x04a8
            com.bytedance.android.livesdkapi.depend.model.live.Room r11 = r10.f15715a
            boolean r11 = r11.isOfficial()
            if (r11 == 0) goto L_0x04a8
            r11 = r10
            com.bytedance.android.livesdk.chatroom.ui.ax r11 = (com.bytedance.android.livesdk.chatroom.p325ui.C5949ax) r11
            r11.mo11887a(r5)
            goto L_0x04a8
        L_0x010d:
            java.lang.Object r11 = r11.getData()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            r10.m12989f(r11)
            return
        L_0x011b:
            android.support.v4.app.f r11 = r10.f15750ai
            if (r11 == 0) goto L_0x04a8
            android.support.v4.app.f r11 = r10.f15750ai
            r11.dismissAllowingStateLoss()
            return
        L_0x0125:
            java.lang.Object r11 = r11.getData()
            java.lang.Integer r11 = (java.lang.Integer) r11
            int r11 = r11.intValue()
            android.view.View r0 = r10.f15754am
            if (r0 == 0) goto L_0x015a
            android.view.View r0 = r10.f15754am
            android.view.ViewGroup$LayoutParams r0 = r0.getLayoutParams()
            android.widget.FrameLayout$LayoutParams r0 = (android.widget.FrameLayout.LayoutParams) r0
            r0.topMargin = r11
            int r11 = com.bytedance.android.live.core.p230g.C3922z.m9910c()
            boolean r1 = com.bytedance.android.live.core.p230g.p232b.C3882b.m9818b()
            if (r1 == 0) goto L_0x014e
            int r1 = com.bytedance.android.live.core.p230g.p232b.C3882b.m9816a()
            if (r1 != 0) goto L_0x014e
            r11 = 0
        L_0x014e:
            r0.width = r11
            int r11 = r0.gravity
            r11 = r11 | r8
            r0.gravity = r11
            android.view.View r11 = r10.f15754am
            r11.setLayoutParams(r0)
        L_0x015a:
            return
        L_0x015b:
            java.lang.Object r11 = r11.getData()
            com.bytedance.android.livesdk.chatroom.event.i r11 = (com.bytedance.android.livesdk.chatroom.event.C5189i) r11
            com.bytedance.android.livesdk.chatroom.ui.di r0 = r10.f15762au
            if (r0 != 0) goto L_0x0183
            com.bytedance.android.live.base.model.user.User r0 = r10.f15811t
            boolean r1 = r10.mo11890g()
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r10.f15815x
            java.util.List<com.bytedance.android.live.base.model.d> r3 = r11.f13897b
            com.bytedance.android.live.base.model.user.FansClubData r11 = r11.f13896a
            com.bytedance.android.livesdk.chatroom.ui.di r4 = new com.bytedance.android.livesdk.chatroom.ui.di
            r4.<init>()
            r4.f16319c = r0
            r4.f16325i = r1
            r4.f16321e = r3
            r4.f16322f = r11
            r4.f16320d = r2
            r10.f15762au = r4
            goto L_0x018d
        L_0x0183:
            com.bytedance.android.livesdk.chatroom.ui.di r0 = r10.f15762au
            java.util.List<com.bytedance.android.live.base.model.d> r1 = r11.f13897b
            com.bytedance.android.live.base.model.user.FansClubData r11 = r11.f13896a
            r0.f16321e = r1
            r0.f16322f = r11
        L_0x018d:
            com.bytedance.android.livesdk.chatroom.ui.di r11 = r10.f15762au
            android.support.v4.app.k r0 = r10.getChildFragmentManager()
            java.lang.String r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6090di.f16317a
            r11.show(r0, r1)
            return
        L_0x0199:
            java.lang.Object r11 = r11.getData()
            com.bytedance.android.live.broadcast.api.model.e r11 = (com.bytedance.android.live.broadcast.api.model.C3059e) r11
            boolean r0 = r10.mo11941p()
            if (r0 == 0) goto L_0x0218
            com.bytedance.common.utility.b.g r0 = r10.f15808q
            r1 = 100
            r0.removeMessages(r1)
            com.bytedance.android.livesdkapi.depend.model.c r0 = r11.f8936a
            if (r0 == 0) goto L_0x04a8
            java.lang.String r0 = ""
            com.bytedance.android.livesdkapi.depend.model.c r2 = r11.f8936a
            java.lang.String r2 = r2.f23756q
            boolean r0 = android.text.TextUtils.equals(r0, r2)
            if (r0 == 0) goto L_0x01be
            goto L_0x04a8
        L_0x01be:
            java.util.HashMap r0 = new java.util.HashMap
            r0.<init>()
            java.lang.String r2 = "sticker_id"
            com.bytedance.android.livesdkapi.depend.model.c r3 = r11.f8936a
            long r3 = r3.f23744e
            java.lang.String r3 = java.lang.String.valueOf(r3)
            r0.put(r2, r3)
            com.bytedance.android.livesdk.o.c r2 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
            java.lang.String r3 = "live_take_sticker_select"
            java.util.HashMap r0 = r10.m12969a(r0)
            java.lang.Object[] r4 = new java.lang.Object[r8]
            com.bytedance.android.livesdk.o.c.j r5 = new com.bytedance.android.livesdk.o.c.j
            r5.<init>()
            java.lang.String r6 = "live_take"
            com.bytedance.android.livesdk.o.c.j r5 = r5.mo14214b(r6)
            java.lang.String r6 = "click"
            com.bytedance.android.livesdk.o.c.j r5 = r5.mo14218f(r6)
            java.lang.String r6 = "live_take_detail"
            com.bytedance.android.livesdk.o.c.j r5 = r5.mo14213a(r6)
            r4[r7] = r5
            r2.mo14202a(r3, r0, r4)
            android.os.Message r0 = new android.os.Message
            r0.<init>()
            com.bytedance.android.livesdkapi.depend.model.c r11 = r11.f8936a
            r0.obj = r11
            r0.what = r1
            com.bytedance.common.utility.b.g r11 = r10.f15808q
            com.bytedance.android.live.core.setting.p<java.lang.Long> r1 = com.bytedance.android.livesdk.config.LiveSettingKeys.LIVE_FACE_STICKER_EFFECTIVELY_USE_TIME
            java.lang.Object r1 = r1.mo9431a()
            java.lang.Long r1 = (java.lang.Long) r1
            long r1 = r1.longValue()
            r3 = 1000(0x3e8, double:4.94E-321)
            long r1 = r1 * r3
            r11.sendMessageDelayed(r0, r1)
        L_0x0218:
            return
        L_0x0219:
            java.lang.Object r11 = r11.getData()
            com.bytedance.android.livesdk.chatroom.event.y r11 = (com.bytedance.android.livesdk.chatroom.event.C5206y) r11
            boolean r11 = r11.f13929a
            if (r11 == 0) goto L_0x04a8
            r10.m12992z()
            return
        L_0x0227:
            com.bytedance.android.livesdk.ab.e r11 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdk.user.e r11 = r11.mo10315h()
            boolean r11 = r11.mo14532c()
            if (r11 == 0) goto L_0x04a8
            r10.m12992z()
            return
        L_0x0239:
            java.lang.Object r11 = r11.getData()
            com.bytedance.android.livesdk.message.model.aw r11 = (com.bytedance.android.livesdk.message.model.C7818aw) r11
            r10.m12975a(r11)
            return
        L_0x0243:
            java.lang.Object r11 = r11.getData()
            com.bytedance.android.livesdk.chatroom.event.aw r11 = (com.bytedance.android.livesdk.chatroom.event.C5177aw) r11
            boolean r0 = r11.f13869a
            int r2 = r11.f13870b
            r10.mo11909a(r0, r2)
            boolean r11 = r11.f13869a
            if (r11 == 0) goto L_0x04a8
            android.support.v4.app.FragmentActivity r11 = r10.getActivity()
            if (r11 == 0) goto L_0x04a8
            android.support.v4.app.FragmentActivity r11 = r10.getActivity()
            int r11 = r11.getRequestedOrientation()
            if (r11 != r8) goto L_0x04a8
            int r11 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r1)
            r0 = 1125515264(0x43160000, float:150.0)
            int r0 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r0)
            r10.m12980a(r8, r11, r0, r7)
            return
        L_0x0272:
            r10.mo11892k()
            return
        L_0x0276:
            java.lang.Object r0 = r11.getData()
            com.bytedance.android.livesdk.chatroom.event.s r0 = (com.bytedance.android.livesdk.chatroom.event.C5200s) r0
            android.view.View r1 = r10.getView()
            if (r1 == 0) goto L_0x0388
            boolean r1 = r10.mo11941p()
            if (r1 == 0) goto L_0x0388
            android.content.Context r1 = r10.getContext()
            if (r1 != 0) goto L_0x0290
            goto L_0x0388
        L_0x0290:
            android.view.View r1 = r10.getView()
            r2 = 2132021035(0x7f140f2b, float:1.968045E38)
            android.view.View r1 = r1.findViewById(r2)
            android.view.ViewGroup r1 = (android.view.ViewGroup) r1
            android.view.ViewGroup$LayoutParams r2 = r1.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r2 = (android.widget.RelativeLayout.LayoutParams) r2
            int r3 = r0.f13914a
            if (r3 != 0) goto L_0x0336
            java.lang.Object r3 = r0.f13915b
            boolean r3 = r3 instanceof java.lang.Integer
            if (r3 == 0) goto L_0x035c
            java.lang.Object r0 = r0.f13915b
            java.lang.Integer r0 = (java.lang.Integer) r0
            int r0 = r0.intValue()
            android.content.Context r3 = r10.getContext()
            r4 = 1092616192(0x41200000, float:10.0)
            float r3 = com.bytedance.common.utility.C9432q.m18687b(r3, r4)
            int r3 = (int) r3
            int r0 = r0 + r3
            android.view.View r3 = r10.getView()
            int r3 = r3.getHeight()
            if (r3 > 0) goto L_0x02da
            android.content.Context r3 = r10.getContext()
            int r3 = com.bytedance.common.utility.C9432q.m18688b(r3)
            java.lang.String r4 = "AbsInteractionFragment.adjustTextMessage"
            java.lang.String r6 = "failed to obtain iaHeight"
            com.bytedance.android.live.core.p224c.C3831a.m9715c(r4, r6)
        L_0x02da:
            int r4 = r3 - r0
            int r6 = r2.bottomMargin
            int r4 = r4 - r6
            java.lang.StringBuilder r6 = new java.lang.StringBuilder
            java.lang.String r9 = "iaHeight:"
            r6.<init>(r9)
            r6.append(r3)
            java.lang.String r3 = " height:"
            r6.append(r3)
            r6.append(r4)
            java.lang.String r3 = " topMargin:"
            r6.append(r3)
            r6.append(r0)
            java.lang.String r0 = " bottomMargin:"
            r6.append(r0)
            int r0 = r2.bottomMargin
            r6.append(r0)
            java.lang.String r0 = r6.toString()
            r3 = 200(0xc8, float:2.8E-43)
            if (r4 >= r3) goto L_0x032e
            android.content.Context r4 = r10.getContext()
            r6 = 1126170624(0x43200000, float:160.0)
            float r4 = com.bytedance.common.utility.C9432q.m18687b(r4, r6)
            int r4 = (int) r4
            int r4 = java.lang.Math.max(r4, r3)
            java.lang.StringBuilder r3 = new java.lang.StringBuilder
            r3.<init>()
            r3.append(r0)
            java.lang.String r0 = " fallback_height: "
            r3.append(r0)
            r3.append(r4)
            java.lang.String r0 = r3.toString()
        L_0x032e:
            r2.height = r4
            java.lang.String r3 = "pk_on"
            m12978a(r3, r0)
            goto L_0x035c
        L_0x0336:
            int r0 = r0.f13914a
            if (r0 != r8) goto L_0x035c
            android.content.Context r0 = r10.getContext()
            r3 = 1126760448(0x43290000, float:169.0)
            float r0 = com.bytedance.common.utility.C9432q.m18687b(r0, r3)
            int r0 = (int) r0
            r2.height = r0
            java.lang.StringBuilder r0 = new java.lang.StringBuilder
            java.lang.String r3 = "height:"
            r0.<init>(r3)
            int r3 = r2.height
            r0.append(r3)
            java.lang.String r0 = r0.toString()
            java.lang.String r3 = "pk_off"
            m12978a(r3, r0)
        L_0x035c:
            r10.m12973a(r2)
            r1.setLayoutParams(r2)
            int r0 = r2.height
            int r1 = r2.bottomMargin
            r10.m12983b(r0, r1)
            com.bytedance.android.livesdk.chatroom.viewmodule.EnterAnimWidget r0 = r10.f15766ay
            if (r0 == 0) goto L_0x0380
            com.bytedance.android.livesdk.chatroom.viewmodule.EnterAnimWidget r0 = r10.f15766ay
            com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView r1 = r0.f16969a
            if (r1 == 0) goto L_0x0380
            com.bytedance.android.livesdk.gift.effect.entry.view.EnterAnimationView r0 = r0.f16969a
            com.bytedance.android.livesdk.gift.effect.entry.c.a r1 = r0.f20227a
            if (r1 == 0) goto L_0x0380
            com.bytedance.android.livesdk.gift.effect.entry.c.a r0 = r0.f20227a
            r0.f20146g = r8
            r0.mo13650a()
        L_0x0380:
            int r0 = r2.height
            int r1 = r2.bottomMargin
            int r0 = r0 + r1
            r10.m12982b(r0)
        L_0x0388:
            java.lang.Object r11 = r11.getData()
            com.bytedance.android.livesdk.chatroom.event.s r11 = (com.bytedance.android.livesdk.chatroom.event.C5200s) r11
            boolean r0 = r10.f15768b
            if (r0 == 0) goto L_0x03cb
            int r0 = r11.f13914a
            if (r0 != 0) goto L_0x03af
            r10.mo11921m()
            boolean r11 = r10.f15794c
            if (r11 != 0) goto L_0x03cb
            android.view.View r11 = r10.f15754am
            java.lang.String r0 = "#303342"
            int r0 = android.graphics.Color.parseColor(r0)
            r11.setBackgroundColor(r0)
            android.view.View r11 = r10.f15754am
            com.bytedance.common.utility.C9432q.m18691b(r11, r7)
            goto L_0x04a8
        L_0x03af:
            int r11 = r11.f13914a
            if (r11 != r8) goto L_0x03cb
            com.bytedance.android.livesdk.chatroom.ui.b$a r11 = r10.f15707S
            com.bytedance.android.livesdk.chatroom.ui.b$a r0 = com.bytedance.android.livesdk.chatroom.p325ui.C5957b.C5972a.NORMAL
            if (r11 == r0) goto L_0x03c2
            com.bytedance.android.livesdk.chatroom.ui.b$a r11 = r10.f15708T
            r10.f15707S = r11
            android.view.View r11 = r10.f15744ac
            r11.setVisibility(r7)
        L_0x03c2:
            boolean r11 = r10.f15794c
            if (r11 != 0) goto L_0x03cb
            android.view.View r11 = r10.f15754am
            com.bytedance.common.utility.C9432q.m18691b(r11, r5)
        L_0x03cb:
            return
        L_0x03cc:
            java.lang.Object r11 = r11.getData()
            com.bytedance.android.livesdk.chatroom.event.v r11 = (com.bytedance.android.livesdk.chatroom.event.C5203v) r11
            boolean r0 = r11.f13923a
            r10.m12981a(r0, r7)
            boolean r11 = r11.f13923a
            if (r11 == 0) goto L_0x04a8
            android.view.View r11 = r10.f15745ad
            android.view.ViewGroup$LayoutParams r11 = r11.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r11 = (android.widget.RelativeLayout.LayoutParams) r11
            android.widget.RelativeLayout$LayoutParams r0 = new android.widget.RelativeLayout$LayoutParams
            int r3 = r11.width
            int r11 = r11.height
            r0.<init>(r3, r11)
            r0.addRule(r4)
            r0.addRule(r2)
            r11 = 1124859904(0x430c0000, float:140.0)
            int r11 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r11)
            r0.bottomMargin = r11
            int r11 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r1)
            r0.rightMargin = r11
            android.view.View r11 = r10.f15745ad
            r11.setLayoutParams(r0)
            return
        L_0x0406:
            java.lang.Object r11 = r11.getData()
            com.bytedance.android.livesdk.chatroom.interact.ak r11 = (com.bytedance.android.livesdk.chatroom.interact.C5277ak) r11
            boolean r0 = r11.f14122a
            r0 = r0 ^ r8
            r10.f15780bl = r0
            boolean r0 = r11.f14122a
            if (r0 == 0) goto L_0x0418
            java.lang.String r0 = "video_interact_on"
            goto L_0x041a
        L_0x0418:
            java.lang.String r0 = "video_interact_off"
        L_0x041a:
            boolean r1 = r11.f14122a
            if (r1 == 0) goto L_0x0421
            int r1 = r10.f15782bn
            goto L_0x0423
        L_0x0421:
            int r1 = r10.f15781bm
        L_0x0423:
            r10.m12972a(r6, r1, r0)
            boolean r11 = r11.f14122a
            r11 = r11 ^ r8
            r10.mo11916c(r11)
            return
        L_0x042d:
            java.lang.Object r11 = r11.getData()
            com.bytedance.android.livesdk.chatroom.event.v r11 = (com.bytedance.android.livesdk.chatroom.event.C5203v) r11
            boolean r0 = r11.f13923a
            r10.m12981a(r0, r8)
            boolean r0 = r11.f13923a
            if (r0 == 0) goto L_0x043f
            java.lang.String r0 = "audio_interact_on"
            goto L_0x0441
        L_0x043f:
            java.lang.String r0 = "audio_interact_off"
        L_0x0441:
            boolean r1 = r11.f13923a
            if (r1 == 0) goto L_0x0448
            int r1 = r10.f15784bp
            goto L_0x044a
        L_0x0448:
            int r1 = r10.f15783bo
        L_0x044a:
            r10.m12972a(r1, r6, r0)
            boolean r11 = r11.f13923a
            if (r11 == 0) goto L_0x0463
            r11 = 2131886889(0x7f120329, float:1.940837E38)
            int r11 = com.bytedance.android.live.core.p230g.C3922z.m9913d(r11)
            r0 = 2131886888(0x7f120328, float:1.9408368E38)
            int r0 = com.bytedance.android.live.core.p230g.C3922z.m9913d(r0)
            r10.m12980a(r8, r11, r0, r7)
            return
        L_0x0463:
            r10.m12980a(r7, r7, r7, r8)
            return
        L_0x0467:
            java.lang.Object r11 = r11.getData()
            com.bytedance.android.livesdk.chatroom.event.UserProfileEvent r11 = (com.bytedance.android.livesdk.chatroom.event.UserProfileEvent) r11
            if (r11 == 0) goto L_0x047e
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r10.f15815x
            java.lang.String r1 = "Log_interact_lable"
            java.lang.Object r0 = r0.get(r1)
            java.lang.String r0 = (java.lang.String) r0
            r11.interactLogLabel = r0
            r10.onEvent(r11)
        L_0x047e:
            return
        L_0x047f:
            java.lang.Object r11 = r11.getData()
            java.lang.Boolean r11 = (java.lang.Boolean) r11
            boolean r11 = r11.booleanValue()
            boolean r0 = r10.f15768b
            if (r0 == 0) goto L_0x04a8
            com.bytedance.ies.sdk.widgets.DataCenter r0 = r10.f15815x
            java.lang.String r1 = "data_keyboard_status"
            java.lang.Object r0 = r0.get(r1)
            java.lang.Boolean r0 = (java.lang.Boolean) r0
            boolean r0 = r0.booleanValue()
            if (r11 != 0) goto L_0x04a0
            if (r0 != 0) goto L_0x04a0
            goto L_0x04a1
        L_0x04a0:
            r8 = 0
        L_0x04a1:
            if (r8 == 0) goto L_0x04a4
            r3 = 0
        L_0x04a4:
            r10.m12986d(r3)
            return
        L_0x04a8:
            return
        L_0x04a9:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C5957b.onChanged(java.lang.Object):void");
    }

    public void onEvent(C5161ag agVar) {
        String str;
        if (agVar != null && !TextUtils.isEmpty(agVar.f13831a)) {
            int i = agVar.f13834d;
            if (i <= 0) {
                if (mo11890g()) {
                    i = 300;
                } else {
                    i = 240;
                }
            }
            int i2 = agVar.f13835e;
            if (i2 <= 0) {
                if (mo11890g()) {
                    i2 = MediaPlayer.MEDIA_PLAYER_OPTION_USE_CODEC_POOL;
                } else {
                    i2 = 320;
                }
            }
            String str2 = "";
            String str3 = "";
            String str4 = "";
            String str5 = "";
            String str6 = "";
            C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
            if (a != null && (a instanceof C8042k)) {
                C8042k kVar = (C8042k) a;
                if (kVar.mo14192a().containsKey("enter_from")) {
                    str2 = (String) kVar.mo14192a().get("enter_from");
                }
                if (kVar.mo14192a().containsKey("source")) {
                    str3 = (String) kVar.mo14192a().get("source");
                }
            }
            C8038g a2 = C8049c.m15979a().mo14201a(Room.class);
            if (a2 != null && (a2 instanceof C8045n)) {
                C8045n nVar = (C8045n) a2;
                if (nVar.mo14192a().containsKey("anchor_id")) {
                    str4 = (String) nVar.mo14192a().get("anchor_id");
                }
                if (nVar.mo14192a().containsKey("log_pb")) {
                    str5 = (String) nVar.mo14192a().get("log_pb");
                }
                if (nVar.mo14192a().containsKey("request_id")) {
                    str6 = (String) nVar.mo14192a().get("request_id");
                }
            }
            Locale a3 = C3829a.m9702a(C3922z.m9915e());
            if (a3 == null) {
                a3 = Locale.getDefault();
            } else if (TextUtils.isEmpty(a3.getCountry())) {
                a3 = new Locale(a3.getLanguage(), Locale.getDefault().getCountry(), a3.getVariant());
            }
            String language = a3.getLanguage();
            C8839e eVar = new C8839e(agVar.f13831a);
            eVar.mo15827a("language", language);
            eVar.mo15827a("enter_from", str2);
            eVar.mo15827a("source_v3", str3);
            eVar.mo15827a("anchor_id", str4);
            eVar.mo15827a("log_pb", str5);
            eVar.mo15827a("request_id", str6);
            String str7 = "event_page";
            if (this.f15794c) {
                str = "live_take_detail";
            } else {
                str = "live_detail";
            }
            eVar.mo15827a(str7, str);
            eVar.mo15827a("event_belong", "live_interact");
            this.f15750ai = C4514j.m10883j().mo10322c().mo10487a(C4704c.m11226a(eVar.mo15824a()).mo10510a(i).mo10514b(i2).mo10518d(agVar.f13836f).mo10516c(agVar.f13837g).mo10520e(agVar.f13833c).mo10521f(agVar.f13839i).mo10512a(agVar.f13832b).mo10517c(agVar.f13840j).mo10513a(agVar.f13838h));
            C4104a.m10232a(getActivity(), this.f15750ai);
        }
    }

    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f15768b = true;
        view.setFitsSystemWindows(true);
        mo11904a(view);
    }

    /* renamed from: c */
    private void m12985c(int i, int i2) {
        if (this.f15799h != null) {
            View findViewById = this.f15799h.findViewById(i);
            if (findViewById != null) {
                findViewById.setVisibility(i2);
            }
        }
    }

    /* renamed from: b */
    private void m12983b(int i, int i2) {
        C7818aw awVar = new C7818aw();
        int i3 = i + i2;
        awVar.f21524a = ((int) getContext().getResources().getDimension(R.dimen.pb)) + i3;
        this.f15815x.lambda$put$1$DataCenter("cmd_normal_gift_layout_bottom_margin_update", Integer.valueOf(awVar.f21524a));
        C7818aw awVar2 = new C7818aw();
        awVar2.f21524a = i3;
        m12975a(awVar2);
    }

    /* renamed from: a */
    private void m12971a(int i, int i2) {
        if (getView() != null && mo11941p() && getContext() != null) {
            ViewGroup viewGroup = (ViewGroup) getView().findViewById(R.id.blh);
            LayoutParams layoutParams = (LayoutParams) viewGroup.getLayoutParams();
            layoutParams.width = i;
            layoutParams.height = i2;
            m12973a(layoutParams);
            viewGroup.setLayoutParams(layoutParams);
            m12983b(layoutParams.height, layoutParams.bottomMargin);
            m12982b(layoutParams.height + layoutParams.bottomMargin);
            StringBuilder sb = new StringBuilder("width:");
            sb.append(i);
            sb.append(" height:");
            sb.append(i2);
            m12978a("audio_live_mode", sb.toString());
        }
    }

    /* renamed from: a */
    private static void m12976a(LiveWidget liveWidget, int i) {
        if (liveWidget != null && liveWidget.contentView != null) {
            liveWidget.contentView.setVisibility(i);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ boolean mo11914b(Runnable runnable, boolean z) {
        if (z) {
            return false;
        }
        if (this.f15795d || !this.f15759ar || !TTLiveSDKContext.getHostService().mo10315h().mo14532c() || this.f15715a.getOwner().isFollowing() || SystemClock.elapsedRealtime() - this.f15814w.f13612n <= 30000) {
            mo12179y();
            return false;
        }
        long id = this.f15715a.getId();
        long id2 = this.f15715a.getOwner().getId();
        String labels = this.f15715a.getLabels();
        C8552a b = new C8552a(getContext()).mo14996a(true).mo15012d((int) R.string.eii).mo15008c((int) R.string.eoh);
        C6215m mVar = new C6215m(this, id2, id, labels, runnable);
        b.mo15003b(0, (int) R.string.eog, (DialogInterface.OnClickListener) mVar).mo15003b(1, (int) R.string.eoe, (DialogInterface.OnClickListener) new C6216n(runnable)).mo15005b(C6217o.f16691a).mo15006b(C6218p.f16692a).mo15001b().show();
        return true;
    }

    public void onActivityResult(int i, int i2, Intent intent) {
        if (this.f15720aE != null) {
            this.f15720aE.onActivityResult(i, i2, intent);
        }
        if (this.f15770bb != null) {
            this.f15770bb.mo8321a(i, i2, intent);
        }
    }

    /* renamed from: a */
    private void m12972a(int i, int i2, String str) {
        if (getView() != null && mo11941p() && getContext() != null) {
            ViewGroup viewGroup = (ViewGroup) getView().findViewById(R.id.blh);
            LayoutParams layoutParams = (LayoutParams) viewGroup.getLayoutParams();
            if (i >= 0) {
                layoutParams.height = i;
            }
            if (i2 >= 0) {
                layoutParams.rightMargin = i2;
            }
            m12973a(layoutParams);
            viewGroup.setLayoutParams(layoutParams);
            m12983b(layoutParams.height, layoutParams.bottomMargin);
            m12982b(layoutParams.height + layoutParams.bottomMargin);
            StringBuilder sb = new StringBuilder("height:");
            sb.append(i);
            sb.append(", rightMargin:");
            sb.append(i2);
            m12978a(str, sb.toString());
        }
    }
}
