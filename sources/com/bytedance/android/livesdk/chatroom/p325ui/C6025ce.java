package com.bytedance.android.livesdk.chatroom.p325ui;

import android.arch.lifecycle.C0184k;
import android.arch.lifecycle.C0199s;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.content.DialogInterface;
import android.content.DialogInterface.OnClickListener;
import android.content.Intent;
import android.content.res.Configuration;
import android.os.Build.VERSION;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.os.SystemClock;
import android.support.p030v4.app.C0654k;
import android.support.p030v4.app.Fragment;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.widget.DrawerLayout;
import android.support.p030v4.widget.DrawerLayout.C1072c;
import android.text.TextUtils;
import android.view.LayoutInflater;
import android.view.TextureView;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.TextView;
import android.widget.Toast;
import com.bytedance.android.live.C2942b;
import com.bytedance.android.live.base.event.RoomStatusEvent;
import com.bytedance.android.live.base.model.ImageModel;
import com.bytedance.android.live.base.model.user.C3009i;
import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.live.core.p229f.C3846a;
import com.bytedance.android.live.core.p230g.C3894h;
import com.bytedance.android.live.core.performance.C3974b;
import com.bytedance.android.live.core.performance.C3982g;
import com.bytedance.android.live.core.performance.C3982g.C3983a;
import com.bytedance.android.live.core.rxutils.C4064k;
import com.bytedance.android.live.core.rxutils.autodispose.C4001ab;
import com.bytedance.android.live.core.widget.HSImageView;
import com.bytedance.android.live.gift.IGiftService;
import com.bytedance.android.live.livepullstream.p249a.C4139d;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.room.C4184d.C4185a;
import com.bytedance.android.live.room.C4193l;
import com.bytedance.android.livesdk.C6752f;
import com.bytedance.android.livesdk.TTLiveSDKContext;
import com.bytedance.android.livesdk.app.dataholder.C4638d;
import com.bytedance.android.livesdk.app.dataholder.C4639e;
import com.bytedance.android.livesdk.app.dataholder.LinkCrossRoomDataHolder;
import com.bytedance.android.livesdk.chatroom.api.RoomRetrofitApi;
import com.bytedance.android.livesdk.chatroom.detail.C5060b.C5061a;
import com.bytedance.android.livesdk.chatroom.detail.C5064e;
import com.bytedance.android.livesdk.chatroom.detail.C5064e.C5066a;
import com.bytedance.android.livesdk.chatroom.detail.C5067f;
import com.bytedance.android.livesdk.chatroom.detail.C5068g;
import com.bytedance.android.livesdk.chatroom.detail.C5068g.C5069a;
import com.bytedance.android.livesdk.chatroom.detail.C5070h;
import com.bytedance.android.livesdk.chatroom.detail.C5072i;
import com.bytedance.android.livesdk.chatroom.detail.C5079m;
import com.bytedance.android.livesdk.chatroom.detail.C5080n;
import com.bytedance.android.livesdk.chatroom.end.C5125a;
import com.bytedance.android.livesdk.chatroom.event.C5156ab;
import com.bytedance.android.livesdk.chatroom.event.C5177aw;
import com.bytedance.android.livesdk.chatroom.event.C5197p;
import com.bytedance.android.livesdk.chatroom.event.C5200s;
import com.bytedance.android.livesdk.chatroom.event.C5202u;
import com.bytedance.android.livesdk.chatroom.event.C5204w;
import com.bytedance.android.livesdk.chatroom.event.C5205x;
import com.bytedance.android.livesdk.chatroom.event.C5207z;
import com.bytedance.android.livesdk.chatroom.interact.LinkInRoomVideoGuestWidget;
import com.bytedance.android.livesdk.chatroom.interact.p322k.C5647a;
import com.bytedance.android.livesdk.chatroom.interact.p322k.C5657g;
import com.bytedance.android.livesdk.chatroom.model.C5748f;
import com.bytedance.android.livesdk.chatroom.p306bl.C5014i;
import com.bytedance.android.livesdk.chatroom.p306bl.C5032x;
import com.bytedance.android.livesdk.chatroom.p306bl.C5033y;
import com.bytedance.android.livesdk.chatroom.p307c.C5037c;
import com.bytedance.android.livesdk.chatroom.p308d.C5048a;
import com.bytedance.android.livesdk.chatroom.p308d.C5048a.C5050a;
import com.bytedance.android.livesdk.chatroom.p310f.C5213c;
import com.bytedance.android.livesdk.chatroom.p310f.C5234s;
import com.bytedance.android.livesdk.chatroom.p310f.C5244x;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6475bj;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6485bt;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6486bu;
import com.bytedance.android.livesdk.chatroom.viewmodule.C6487bv;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkControlWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkCrossRoomWidget;
import com.bytedance.android.livesdk.chatroom.viewmodule.LinkInRoomAudioWidget;
import com.bytedance.android.livesdk.chatroom.widget.LiveRoomUserInfoWidget;
import com.bytedance.android.livesdk.config.LiveConfigSettingKeys;
import com.bytedance.android.livesdk.config.LiveSettingKeys;
import com.bytedance.android.livesdk.drawerfeed.C6749b;
import com.bytedance.android.livesdk.message.model.C7861cb;
import com.bytedance.android.livesdk.p269aa.C4495a;
import com.bytedance.android.livesdk.p270ab.C4514j;
import com.bytedance.android.livesdk.p272ad.C4525b;
import com.bytedance.android.livesdk.p279af.C4565af;
import com.bytedance.android.livesdk.p279af.C4575an;
import com.bytedance.android.livesdk.p279af.C4600j;
import com.bytedance.android.livesdk.p279af.C4620v;
import com.bytedance.android.livesdk.p279af.C4624y;
import com.bytedance.android.livesdk.p352g.C7186a;
import com.bytedance.android.livesdk.p399o.C8049c;
import com.bytedance.android.livesdk.p399o.C8064d;
import com.bytedance.android.livesdk.p399o.C8065e.C8066a;
import com.bytedance.android.livesdk.p399o.C8068g;
import com.bytedance.android.livesdk.p399o.p401b.C8038g;
import com.bytedance.android.livesdk.p399o.p401b.C8045n;
import com.bytedance.android.livesdk.p399o.p402c.C8059j;
import com.bytedance.android.livesdk.player.C8108r;
import com.bytedance.android.livesdk.player.C8110t;
import com.bytedance.android.livesdk.rank.C8123a;
import com.bytedance.android.livesdk.widget.C8548h;
import com.bytedance.android.livesdk.widget.C8548h.C8552a;
import com.bytedance.android.livesdkapi.depend.live.C8657i;
import com.bytedance.android.livesdkapi.depend.live.C8657i.C8658a;
import com.bytedance.android.livesdkapi.depend.live.C8659j;
import com.bytedance.android.livesdkapi.depend.live.C8659j.C8660a;
import com.bytedance.android.livesdkapi.depend.live.C8666p;
import com.bytedance.android.livesdkapi.depend.live.C8671u;
import com.bytedance.android.livesdkapi.depend.model.live.C8710m;
import com.bytedance.android.livesdkapi.depend.model.live.C8725y.C8726a;
import com.bytedance.android.livesdkapi.depend.model.live.LiveCoreSDKData.Quality;
import com.bytedance.android.livesdkapi.depend.model.live.Room;
import com.bytedance.android.livesdkapi.depend.model.live.StreamUrl;
import com.bytedance.android.livesdkapi.depend.p433a.C8614a;
import com.bytedance.android.livesdkapi.p432d.C8612a;
import com.bytedance.android.livesdkapi.p449g.C8745a;
import com.bytedance.android.livesdkapi.view.C8866c;
import com.bytedance.android.p160b.C2831a;
import com.bytedance.android.p160b.C2831a.C2832a;
import com.bytedance.common.utility.C9414h;
import com.bytedance.common.utility.C9431p;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.ies.p672e.C10753b;
import com.bytedance.ies.sdk.widgets.DataCenter;
import com.bytedance.ies.sdk.widgets.KVData;
import com.facebook.imagepipeline.p975o.C14234d;
import com.github.rahatarmanahmed.cpv.CircularProgressView;
import com.google.gson.p1077b.C17956a;
import com.p683ss.android.medialib.FaceBeautyInvoker.OnRunningErrorCallback;
import com.p683ss.android.ugc.aweme.keva.C35807d;
import com.p683ss.android.ugc.aweme.push.CustomActionPushReceiver;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import com.p683ss.p2544b.p2545a.C51151a;
import com.ss.android.ugc.trill.R;
import java.io.Serializable;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.C1673aa;
import p064c.p065a.C1680ad;
import p064c.p065a.C2193n;
import p064c.p065a.C2194o;
import p064c.p065a.p069b.C1689b;
import p064c.p065a.p071d.C1710e;
import p064c.p065a.p071d.C1711f;
import p064c.p065a.p071d.C1715j;
import p064c.p065a.p072e.p074b.C1745b;
import p064c.p065a.p072e.p077e.p080c.C1868e;
import p064c.p065a.p090h.C2150a;

/* renamed from: com.bytedance.android.livesdk.chatroom.ui.ce */
public final class C6025ce extends C3846a implements C0199s<KVData>, C8614a, C8659j {

    /* renamed from: S */
    private static final Boolean f15992S = Boolean.valueOf(false);

    /* renamed from: A */
    public C5125a f15993A;

    /* renamed from: B */
    public String f15994B;

    /* renamed from: F */
    public String f15995F;

    /* renamed from: G */
    public String f15996G = "other";

    /* renamed from: H */
    public boolean f15997H;

    /* renamed from: I */
    public HashMap<String, String> f15998I;

    /* renamed from: J */
    public long f15999J;

    /* renamed from: K */
    public C8108r f16000K;

    /* renamed from: L */
    public C5037c f16001L;

    /* renamed from: M */
    public C5072i f16002M;

    /* renamed from: N */
    public boolean f16003N;

    /* renamed from: O */
    public boolean f16004O;

    /* renamed from: P */
    public boolean f16005P;

    /* renamed from: Q */
    public boolean f16006Q;

    /* renamed from: R */
    public C2832a f16007R;

    /* renamed from: T */
    private List<String> f16008T;

    /* renamed from: U */
    private String f16009U;

    /* renamed from: V */
    private String f16010V;

    /* renamed from: W */
    private String f16011W;

    /* renamed from: X */
    private C8726a f16012X;

    /* renamed from: Y */
    private boolean f16013Y;

    /* renamed from: Z */
    private boolean f16014Z;

    /* renamed from: a */
    public long f16015a;

    /* renamed from: aA */
    private String f16016aA;

    /* renamed from: aB */
    private long f16017aB;

    /* renamed from: aC */
    private long f16018aC;

    /* renamed from: aD */
    private String f16019aD;

    /* renamed from: aE */
    private final Handler f16020aE;

    /* renamed from: aF */
    private View f16021aF;

    /* renamed from: aG */
    private boolean f16022aG;

    /* renamed from: aH */
    private boolean f16023aH;

    /* renamed from: aI */
    private List<C5202u> f16024aI;

    /* renamed from: aJ */
    private String f16025aJ;

    /* renamed from: aK */
    private C1689b f16026aK;

    /* renamed from: aL */
    private C8660a f16027aL;

    /* renamed from: aa */
    private boolean f16028aa;

    /* renamed from: ab */
    private C5068g f16029ab;

    /* renamed from: ac */
    private C5080n f16030ac;

    /* renamed from: ad */
    private C5067f f16031ad = new C5067f();

    /* renamed from: ae */
    private C5244x f16032ae;

    /* renamed from: af */
    private boolean f16033af = false;

    /* renamed from: ag */
    private boolean f16034ag = false;

    /* renamed from: ah */
    private boolean f16035ah = false;

    /* renamed from: ai */
    private HSImageView f16036ai;

    /* renamed from: aj */
    private HSImageView f16037aj;

    /* renamed from: ak */
    private ViewGroup f16038ak;

    /* renamed from: al */
    private CircularProgressView f16039al;

    /* renamed from: am */
    private LoadingAnimView f16040am;

    /* renamed from: an */
    private TextView f16041an;

    /* renamed from: ao */
    private HSImageView f16042ao;

    /* renamed from: ap */
    private View f16043ap;

    /* renamed from: aq */
    private ViewStub f16044aq;

    /* renamed from: ar */
    private boolean f16045ar = false;

    /* renamed from: as */
    private C1072c f16046as;

    /* renamed from: at */
    private DrawerLayout f16047at;

    /* renamed from: au */
    private long f16048au;

    /* renamed from: av */
    private String f16049av;

    /* renamed from: aw */
    private boolean f16050aw = ((Boolean) LiveSettingKeys.SHOW_BACKGROUND_BELOW_VIDEO.mo9431a()).booleanValue();

    /* renamed from: ax */
    private boolean f16051ax;

    /* renamed from: ay */
    private boolean f16052ay;

    /* renamed from: az */
    private int f16053az;

    /* renamed from: b */
    long f16054b;

    /* renamed from: c */
    public String f16055c;

    /* renamed from: d */
    public C8710m f16056d;

    /* renamed from: e */
    boolean f16057e;

    /* renamed from: f */
    String f16058f;

    /* renamed from: g */
    boolean f16059g;

    /* renamed from: h */
    public boolean f16060h;

    /* renamed from: i */
    public boolean f16061i;

    /* renamed from: j */
    public String f16062j;

    /* renamed from: k */
    public String f16063k;

    /* renamed from: l */
    public int f16064l = 1;

    /* renamed from: m */
    public DataCenter f16065m;

    /* renamed from: n */
    public int f16066n;

    /* renamed from: o */
    public C8671u f16067o = C8671u.IDLE;

    /* renamed from: p */
    public C5070h f16068p;

    /* renamed from: q */
    public C5064e f16069q;

    /* renamed from: r */
    public C2831a f16070r;

    /* renamed from: s */
    public C5079m f16071s;

    /* renamed from: t */
    public boolean f16072t = false;

    /* renamed from: u */
    public boolean f16073u = false;

    /* renamed from: v */
    public boolean f16074v = false;

    /* renamed from: w */
    public boolean f16075w = false;

    /* renamed from: x */
    public TextureView f16076x;

    /* renamed from: y */
    public C5957b f16077y;

    /* renamed from: z */
    public C8548h f16078z;

    /* renamed from: com.bytedance.android.livesdk.chatroom.ui.ce$a */
    enum C6042a {
        ENTER_FAILED,
        FETCH_FAILED,
        ROOM_FETCH_FINISHED,
        EMPTY_URL,
        ROOM_PLAY_FINISHED,
        PING_KICK_OUT,
        USER_CLOSE,
        USER_KICK_OUT,
        WATCHER_KIT_OUT,
        JUMP_TO_OTHER,
        PLAYER_ERROR,
        ENTER_LIVE_END
    }

    /* renamed from: d */
    public final void mo12044d() {
        mo12046f();
    }

    /* renamed from: i */
    public final Fragment mo12049i() {
        return this;
    }

    /* renamed from: u */
    public final C8660a mo12066u() {
        return this.f16027aL;
    }

    /* renamed from: a */
    public final void mo12032a(Bundle bundle) {
        m13136a(this.f15995F, this.f15994B, bundle != null ? bundle.getBundle("live.intent.extra.ENTER_LIVE_EXTRA") : null);
    }

    /* renamed from: a */
    public final boolean mo12040a(Room room, boolean z) {
        C5070h hVar = this.f16068p;
        room.setUserFrom(hVar.f13606h);
        room.setRequestId(hVar.f13604f);
        room.setLog_pb(hVar.f13605g);
        room.setLabels(hVar.f13607i);
        room.setSourceType(hVar.f13574B);
        if (!TextUtils.isEmpty(hVar.f13609k)) {
            room.setPrivateInfo(hVar.f13609k);
        }
        C8038g a = C8049c.m15979a().mo14201a(Room.class);
        boolean z2 = false;
        if (a instanceof C8045n) {
            C8045n nVar = (C8045n) a;
            nVar.mo14197a(room);
            if (getArguments() != null) {
                nVar.f21979a.put("is_video_head", getArguments().getBoolean("live.intent.extra.IS_VIDEO_HEAD", false) ? "1" : "0");
                nVar.mo14192a().putAll(nVar.f21979a);
            }
        }
        LinkCrossRoomDataHolder a2 = LinkCrossRoomDataHolder.m11104a(room.getId(), C0214z.m438a((Fragment) this), this);
        if (room.getLinkMicInfo() != null) {
            a2.mo10410a(room.getLinkMicInfo(), room);
        }
        this.f16015a = room.getId();
        if (room.getOwner() != null) {
            this.f16054b = room.getOwner().getId();
            if (room.getOwner().getAvatarThumb() != null && !C9414h.m18630a(room.getOwner().getAvatarThumb().getUrls())) {
                this.f16008T = room.getOwner().getAvatarThumb().getUrls();
            }
            TTLiveSDKContext.getHostService().mo10315h().mo14524a((C3009i) room.getOwner());
            C5050a aVar = new C5050a(room.getId(), room.getOwner().getId(), System.currentTimeMillis());
            C5048a.m11552a().f13518a = aVar;
        }
        if (getActivity() != null) {
            getActivity().getIntent().putExtra("live.intent.extra.USER_ID", this.f16054b);
            getActivity().getIntent().putExtra("current_room_id", this.f16015a);
        }
        this.f16055c = room.buildPullUrl();
        this.f16009U = room.getSdkParams();
        this.f16010V = room.getMultiStreamData();
        this.f16011W = room.getMultiStreamDefaultQualitySdkKey();
        this.f16056d = room.getStreamType();
        this.f16012X = room.getStreamSrConfig();
        this.f16068p.mo10951a(this.f16015a, room.isLiveTypeAudio(), room.isThirdParty, this.f16054b, room.getLinkMicInfo());
        if (!(this.f16056d != C8710m.OFFICIAL_ACTIVITY || room.background == null || this.f16021aF == null)) {
            HSImageView hSImageView = (HSImageView) this.f16021aF.findViewById(R.id.dox);
            if (VERSION.SDK_INT >= 23) {
                hSImageView.setForeground(null);
            }
            C5213c.m11820a(hSImageView, room.background);
        }
        if (!(!room.isOfficial() || getArguments() == null || this.f16065m == null)) {
            this.f16065m.lambda$put$1$DataCenter("data_live_new_feed_style", Boolean.valueOf(false));
            this.f16065m.lambda$put$1$DataCenter("data_live_new_feed_style_from", "");
            Bundle bundle = getArguments().getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
            if (bundle != null) {
                bundle.putBoolean("live.intent.extra.FROM_NEW_STYLE", false);
                bundle.putString("live.intent.extra.FROM_NEW_STYLE_SOURCE", "");
            }
            getArguments().putBoolean("live.intent.extra.FROM_NEW_STYLE", false);
            getArguments().putString("live.intent.extra.FROM_NEW_STYLE_SOURCE", "");
        }
        if (this.f16015a != 0) {
            getArguments().putLong("live.intent.extra.ROOM_ID", this.f16015a);
        }
        if (this.f16054b != 0) {
            getArguments().putLong("live.intent.extra.USER_ID", this.f16054b);
        }
        if (room.getStatus() == 4) {
            C8049c.m15979a().mo14203a("rd_enter_room_live_end", C8059j.class, Room.class);
            mo12031a(107, "room finish", this.f16015a);
            mo12033a(z ? C6042a.ROOM_FETCH_FINISHED : C6042a.FETCH_FAILED);
            return false;
        } else if (!room.isPullUrlValid()) {
            mo12031a(108, "fetch failed because the pull_url isn't valid", this.f16015a);
            mo12033a(C6042a.FETCH_FAILED);
            return false;
        } else {
            if (room.getMultiStreamData() != null) {
                if (room.getStreamUrl().qualityList.size() > 1) {
                    z2 = true;
                }
                this.f16060h = z2;
                this.f16062j = room.getStreamUrl().mo15385e();
                StreamUrl streamUrl = room.getStreamUrl();
                this.f16063k = streamUrl.f23793u == null ? "" : streamUrl.f23793u.name;
            } else {
                if (room.getStreamUrl().mo15384d().size() > 1) {
                    z2 = true;
                }
                this.f16060h = z2;
                this.f16062j = room.getStreamUrl().f23790r;
                this.f16063k = room.getStreamUrl().f23791s;
            }
            return true;
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:65:0x0132  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12030a(int r8, int r9, int r10) {
        /*
            r7 = this;
            if (r8 == 0) goto L_0x0151
            if (r9 != 0) goto L_0x0006
            goto L_0x0151
        L_0x0006:
            r10 = 2
            int[] r0 = new int[r10]
            com.bytedance.android.b.a r1 = r7.f16070r
            if (r1 == 0) goto L_0x0012
            com.bytedance.android.b.a r1 = r7.f16070r
            r1.getVideoSize(r0)
        L_0x0012:
            android.view.TextureView r1 = r7.f16076x
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            r2 = 2132024471(0x7f141c97, float:1.968742E38)
            r3 = 1
            r4 = 0
            if (r8 <= r9) goto L_0x0051
            int r5 = r7.f16064l
            if (r5 != r3) goto L_0x0051
            r5 = 1119879168(0x42c00000, float:96.0)
            int r5 = com.bytedance.android.live.core.p230g.C3922z.m9899a(r5)
            r1.topMargin = r5
            int r5 = com.bytedance.android.live.core.p230g.C3922z.m9910c()
            int r5 = r5 * r9
            int r5 = r5 / r8
            int r6 = r1.topMargin
            int r5 = r5 + r6
            r7.f16066n = r5
            r7.m13131a(r2, r4)
            com.bytedance.android.livesdk.chatroom.ui.b r2 = r7.f16077y
            if (r2 == 0) goto L_0x004e
            com.bytedance.android.livesdk.chatroom.ui.b r2 = r7.f16077y
            boolean r2 = r2 instanceof com.bytedance.android.livesdk.chatroom.p325ui.C6156eq
            if (r2 == 0) goto L_0x006c
            com.bytedance.android.livesdk.chatroom.ui.b r2 = r7.f16077y
            com.bytedance.android.livesdk.chatroom.ui.eq r2 = (com.bytedance.android.livesdk.chatroom.p325ui.C6156eq) r2
            r2.mo12179y()
            goto L_0x006c
        L_0x004e:
            r7.f16022aG = r4
            goto L_0x006c
        L_0x0051:
            r1.topMargin = r4
            r5 = 8
            r7.m13131a(r2, r5)
            com.bytedance.android.livesdk.chatroom.ui.b r2 = r7.f16077y
            if (r2 == 0) goto L_0x006a
            com.bytedance.android.livesdk.chatroom.ui.b r2 = r7.f16077y
            boolean r2 = r2 instanceof com.bytedance.android.livesdk.chatroom.p325ui.C6156eq
            if (r2 == 0) goto L_0x006c
            com.bytedance.android.livesdk.chatroom.ui.b r2 = r7.f16077y
            com.bytedance.android.livesdk.chatroom.ui.eq r2 = (com.bytedance.android.livesdk.chatroom.p325ui.C6156eq) r2
            r2.mo11895x()
            goto L_0x006c
        L_0x006a:
            r7.f16022aG = r3
        L_0x006c:
            android.view.TextureView r2 = r7.f16076x
            r2.setLayoutParams(r1)
            android.view.TextureView r1 = r7.f16076x
            boolean r1 = r1 instanceof com.bytedance.android.livesdkapi.view.C8866c
            if (r1 == 0) goto L_0x0150
            r1 = 0
            android.view.TextureView r2 = r7.f16076x
            android.view.ViewParent r2 = r2.getParent()
            if (r2 == 0) goto L_0x0092
            android.view.TextureView r2 = r7.f16076x
            android.view.ViewParent r2 = r2.getParent()
            boolean r2 = r2 instanceof android.widget.RelativeLayout
            if (r2 == 0) goto L_0x0092
            android.view.TextureView r1 = r7.f16076x
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            android.widget.RelativeLayout$LayoutParams r1 = (android.widget.RelativeLayout.LayoutParams) r1
        L_0x0092:
            int r2 = r7.f16064l
            r5 = 13
            if (r2 != r3) goto L_0x0118
            if (r8 <= r9) goto L_0x00a9
            android.view.TextureView r8 = r7.f16076x
            com.bytedance.android.livesdkapi.view.c r8 = (com.bytedance.android.livesdkapi.view.C8866c) r8
            r8.setScaleType(r4)
            if (r1 == 0) goto L_0x00a6
            r1.addRule(r5, r4)
        L_0x00a6:
            r8 = 1
            goto L_0x0125
        L_0x00a9:
            boolean r2 = com.bytedance.android.live.core.p230g.p232b.C3882b.m9818b()
            if (r2 == 0) goto L_0x00c2
            int r2 = com.bytedance.android.live.core.p230g.p232b.C3882b.m9816a()
            if (r2 != 0) goto L_0x00c2
            android.view.TextureView r8 = r7.f16076x
            com.bytedance.android.livesdkapi.view.c r8 = (com.bytedance.android.livesdkapi.view.C8866c) r8
            r8.setScaleType(r4)
            if (r1 == 0) goto L_0x0124
            r1.addRule(r5)
            goto L_0x0124
        L_0x00c2:
            boolean r2 = r7.f16028aa
            if (r2 == 0) goto L_0x010b
            android.view.View r2 = r7.getView()
            if (r2 == 0) goto L_0x00fd
            android.view.View r2 = r7.getView()
            int r2 = r2.getWidth()
            if (r2 <= 0) goto L_0x00fd
            android.view.View r2 = r7.getView()
            int r2 = r2.getHeight()
            if (r2 <= 0) goto L_0x00fd
            android.view.View r2 = r7.getView()
            int r2 = r2.getHeight()
            int r2 = r2 * r8
            android.view.View r8 = r7.getView()
            int r8 = r8.getWidth()
            int r2 = r2 / r8
            if (r2 >= r9) goto L_0x00fd
            android.view.TextureView r8 = r7.f16076x
            com.bytedance.android.livesdkapi.view.c r8 = (com.bytedance.android.livesdkapi.view.C8866c) r8
            r8.setScaleType(r10)
            goto L_0x0105
        L_0x00fd:
            android.view.TextureView r8 = r7.f16076x
            com.bytedance.android.livesdkapi.view.c r8 = (com.bytedance.android.livesdkapi.view.C8866c) r8
            r9 = 3
            r8.setScaleType(r9)
        L_0x0105:
            if (r1 == 0) goto L_0x00a6
            r1.addRule(r5, r4)
            goto L_0x00a6
        L_0x010b:
            android.view.TextureView r8 = r7.f16076x
            com.bytedance.android.livesdkapi.view.c r8 = (com.bytedance.android.livesdkapi.view.C8866c) r8
            r8.setScaleType(r10)
            if (r1 == 0) goto L_0x0124
            r1.addRule(r5)
            goto L_0x0124
        L_0x0118:
            android.view.TextureView r8 = r7.f16076x
            com.bytedance.android.livesdkapi.view.c r8 = (com.bytedance.android.livesdkapi.view.C8866c) r8
            r8.setScaleType(r4)
            if (r1 == 0) goto L_0x0124
            r1.addRule(r5)
        L_0x0124:
            r8 = 0
        L_0x0125:
            android.view.TextureView r9 = r7.f16076x
            com.bytedance.android.livesdkapi.view.c r9 = (com.bytedance.android.livesdkapi.view.C8866c) r9
            r10 = r0[r4]
            r0 = r0[r3]
            r9.mo15861a(r10, r0)
            if (r1 == 0) goto L_0x0150
            if (r8 == 0) goto L_0x014b
            com.bytedance.ies.sdk.widgets.DataCenter r8 = r7.f16065m
            java.lang.String r9 = "interaction_layer_margin_top"
            java.lang.Integer r10 = java.lang.Integer.valueOf(r4)
            java.lang.Object r8 = r8.get(r9, r10)
            java.lang.Integer r8 = (java.lang.Integer) r8
            int r8 = r8.intValue()
            int r9 = r1.topMargin
            int r9 = r9 + r8
            r1.topMargin = r9
        L_0x014b:
            android.view.TextureView r8 = r7.f16076x
            r8.setLayoutParams(r1)
        L_0x0150:
            return
        L_0x0151:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.mo12030a(int, int, int):void");
    }

    /* renamed from: a */
    public final void mo12038a(boolean z) {
        if (this.f16070r == null) {
            if (this.f16025aJ != null) {
                ((C4139d) C4116c.m10249a(C4139d.class)).recycleRoomPlayer(this.f16025aJ);
            }
            return;
        }
        if (this.f16070r.getDecodeStatus() == 2) {
            this.f16068p.mo10952a(false, 104, this.f16070r.getMediaErrorMessage());
            mo12031a(104, this.f16070r.getMediaErrorMessage(), this.f16015a);
        } else if (this.f16070r.getDecodeStatus() == 1) {
            this.f16068p.mo10952a(true, 0, null);
            this.f16068p.mo10956d();
        } else {
            this.f16000K.mo14298a(this.f16015a);
            mo12031a(113, "room cancel", this.f16015a);
            this.f16068p.mo10956d();
        }
        long currentTimeMillis = System.currentTimeMillis();
        this.f16070r.stop(z);
        this.f16070r.recycle();
        this.f16070r = null;
        this.f16025aJ = null;
        long currentTimeMillis2 = System.currentTimeMillis() - currentTimeMillis;
        String str = "";
        if (getArguments() != null) {
            str = getArguments().getString("live.intent.extra.EXTRA_ENTER_ROOM_STOP_KEY_TYPE", "");
        }
        C5037c.m11527b(str, currentTimeMillis2);
        mo12054o();
        if (!this.f16051ax) {
            m13142c("reset player");
            this.f16076x.setVisibility(8);
        }
        this.f16075w = false;
        f15992S.booleanValue();
    }

    /* renamed from: a */
    public final void mo12036a(Room room) {
        C3982g.m10091b(C3983a.ShowCInteractionFirstWidget);
        C3974b.m10061a().mo9377a(C3983a.ShowCInteractionFirstWidget.name(), (C0184k) this, getContext());
        C3974b.m10061a().mo9384b(C3983a.ShowCInteractionFirstWidget.name(), (C0184k) this, getContext());
        this.f15996G = ((C4193l) C4116c.m10249a(C4193l.class)).getLiveType(room);
        if (this.f16067o == C8671u.PREPARED) {
            this.f16067o = C8671u.LIVE_STARTED;
            this.f16072t = false;
            this.f16020aE.removeMessages(28);
            ((C4193l) C4116c.m10249a(C4193l.class)).setCurrentRoom(room);
            C4638d.m11114a().mo10419b();
            C4639e.m11122a().mo10425c();
            C5068g gVar = new C5068g(room.getId(), room.getStreamId(), room.getLabels(), false, new C5069a() {
                /* renamed from: b */
                public final void mo10948b() {
                    C6025ce.this.mo12033a(C6042a.ROOM_PLAY_FINISHED);
                }

                /* renamed from: c */
                public final void mo10949c() {
                    C6025ce.this.mo12061p();
                }

                /* renamed from: a */
                public final boolean mo10947a() {
                    if (C6025ce.this.f16070r == null) {
                        return true;
                    }
                    StringBuilder sb = new StringBuilder("send play ping room. id:");
                    sb.append(C6025ce.this.f16015a);
                    sb.append(",mActivityPause:");
                    sb.append(!C6025ce.this.isResumed());
                    sb.append(",mAudioLostFocusTime:");
                    sb.append(C6025ce.this.f16070r.getAudioLostFocusTime());
                    if (C6025ce.this.isResumed() || C6025ce.this.f16070r.getAudioLostFocusTime() == -1 || System.currentTimeMillis() - C6025ce.this.f16070r.getAudioLostFocusTime() <= 10000) {
                        return true;
                    }
                    C6025ce.this.mo12051k();
                    C6025ce.this.mo12031a(120, "isn't resumed and lost audio", C6025ce.this.f16015a);
                    C6025ce.this.mo12038a(true);
                    C6025ce.this.f16073u = true;
                    return false;
                }

                /* renamed from: a */
                public final void mo10946a(int i) {
                    if (30004 == i) {
                        C6025ce.this.mo12033a(C6042a.PING_KICK_OUT);
                    } else {
                        C6025ce.this.mo12033a(C6042a.ROOM_PLAY_FINISHED);
                    }
                }
            });
            this.f16029ab = gVar;
            C5068g gVar2 = this.f16029ab;
            if (!gVar2.f13563a) {
                gVar2.f13563a = true;
                gVar2.mo10945b();
            }
            m13139b(room);
            if (room.isLiveTypeAudio()) {
                this.f16042ao.setVisibility(0);
                this.f16043ap.setVisibility(0);
                C5213c.m11821a(this.f16042ao, room.getOwner().getAvatarLarge(), (C14234d) new C4620v(5, (float) (C9432q.m18670a(getContext()) / C9432q.m18688b(getContext())), null));
            }
            if (room.getMosaicStatus() != 0) {
                C7861cb cbVar = new C7861cb();
                cbVar.f21739b = 2;
                String mosaicTip = room.getMosaicTip();
                if (TextUtils.isEmpty(mosaicTip)) {
                    mosaicTip = getString(R.string.eo2);
                }
                cbVar.f21738a = mosaicTip;
                mo12034a(cbVar);
            }
            if (mo12066u() != null) {
                mo12066u().mo12881m();
            }
            f15992S.booleanValue();
        }
    }

    /* renamed from: a */
    public final void mo12037a(String str) {
        if (this.f16036ai.getVisibility() != 8) {
            this.f16036ai.setVisibility(8);
        }
        if (this.f16037aj.getVisibility() != 8) {
            this.f16037aj.setVisibility(8);
        }
        new StringBuilder("hide Background, reason: ").append(str);
        mo12039a(false, str);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo12039a(boolean z, String str) {
        if (mo12049i().getUserVisibleHint() || !mo12049i().isHidden()) {
            HashMap hashMap = new HashMap();
            hashMap.put("event_name", "liveplay_background_status");
            hashMap.put("view_status", z ? "show" : "hide");
            hashMap.put("view_bg_reason", str);
            C8064d.m16005b().mo9199b("ttlive_room", (Map<String, ?>) hashMap);
        }
        HashMap hashMap2 = new HashMap();
        hashMap2.put("bg_status", z ? "show" : "hide");
        hashMap2.put("bg_reason", str);
        hashMap2.put("bg_illegal", String.valueOf(this.f16074v));
        C8049c.m15979a().mo14202a("liveplay_background_monitor", hashMap2, new Object[0]);
    }

    /* renamed from: a */
    public final void mo12034a(C7861cb cbVar) {
        if (isAdded()) {
            boolean z = cbVar.f21739b == 2;
            if (z != this.f16074v) {
                this.f16074v = z;
                if (this.f16074v) {
                    m13142c("illegal Status");
                    m13145d(cbVar.f21738a);
                    return;
                }
                if (this.f16070r != null && this.f16070r.getDecodeStatus() == 1) {
                    mo12037a("recover from illegal status");
                }
                m13129G();
            }
        }
    }

    /* renamed from: a */
    public final boolean mo8466a() {
        List<Fragment> f = getChildFragmentManager().mo2238f();
        if (f != null) {
            for (Fragment fragment : f) {
                if ((fragment instanceof C8614a) && ((C8614a) fragment).mo8466a()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo12033a(C6042a aVar) {
        boolean z = true;
        switch (aVar) {
            case PLAYER_ERROR:
                C6048ck.m13211a(Toast.makeText(getContext(), R.string.ega, 0));
                mo12067v();
                return;
            case ENTER_FAILED:
                if (this.f16004O) {
                    C6048ck.m13211a(Toast.makeText(getContext(), R.string.ega, 0));
                }
                this.f16004O = true;
                mo12067v();
                return;
            case FETCH_FAILED:
                if (getArguments() == null || !getArguments().getBoolean("from_notification", false)) {
                    C6048ck.m13211a(Toast.makeText(getContext(), R.string.eg4, 0));
                    m13147e(true);
                    mo12067v();
                    return;
                }
                C6048ck.m13211a(Toast.makeText(getContext(), R.string.eg3, 0));
                m13147e(true);
                if (mo12066u() != null) {
                    mo12066u().mo12860a(this.f16054b);
                    return;
                } else {
                    mo12067v();
                    return;
                }
            case EMPTY_URL:
                mo12031a(109, "empty url", this.f16015a);
                C6048ck.m13211a(Toast.makeText(getContext(), R.string.ega, 0));
                mo12067v();
                return;
            case ENTER_LIVE_END:
                mo12031a(121, "enter live end", this.f16015a);
                C6048ck.m13211a(Toast.makeText(getContext(), R.string.eg4, 0));
                m13147e(true);
                mo12067v();
                return;
            case ROOM_FETCH_FINISHED:
                mo12031a(116, "fetch finished", this.f16015a);
                mo12063r();
                m13147e(true);
                m13148y();
                this.f16067o = C8671u.LIVE_FINISHED;
                return;
            case ROOM_PLAY_FINISHED:
                mo12031a(117, "fetch finished", this.f16015a);
                mo12063r();
                m13147e(true);
                m13148y();
                this.f16067o = C8671u.LIVE_FINISHED;
                return;
            case PING_KICK_OUT:
                C6048ck.m13211a(Toast.makeText(getContext(), R.string.ene, 1));
                mo12031a(118, "fetch finished", this.f16015a);
                mo12063r();
                m13148y();
                return;
            case USER_CLOSE:
                mo12031a(114, "user close", this.f16015a);
                m13128F();
                if (this.f16067o != C8671u.LIVE_FINISHED) {
                    z = false;
                }
                m13147e(z);
                if (this.f16068p != null) {
                    this.f16068p.mo10955c();
                }
                m13127E();
                mo12067v();
                return;
            case USER_KICK_OUT:
                mo12031a((int) OnRunningErrorCallback.EXT_SHOT_SCREEN_FRAME_CAPTURED, "this user is kicked out by other device", this.f16015a);
                C6048ck.m13211a(Toast.makeText(getContext(), R.string.euj, 1));
                m13148y();
                mo12067v();
                return;
            case WATCHER_KIT_OUT:
                final C5934al alVar = new C5934al(getContext());
                if (isAdded() && !alVar.isShowing()) {
                    alVar.show();
                }
                this.f16020aE.postDelayed(new Runnable() {
                    public final void run() {
                        if (alVar.isShowing()) {
                            alVar.dismiss();
                        }
                        C6025ce.this.mo12031a(111, "watcher kit out", C6025ce.this.f16015a);
                        C6025ce.this.mo12067v();
                    }
                }, 2500);
                return;
            case JUMP_TO_OTHER:
                m13148y();
                m13140b(false);
                mo12031a(112, "jump to other room", this.f16015a);
                return;
            default:
                mo12031a(119, "jump to other room", this.f16015a);
                m13148y();
                return;
        }
    }

    /* renamed from: y */
    private void m13148y() {
        m13140b(true);
    }

    /* renamed from: C */
    private static boolean m13125C() {
        if (VERSION.SDK_INT > 19) {
            return true;
        }
        return false;
    }

    /* renamed from: E */
    private void m13127E() {
        if (getContext() != null) {
            C10753b.m21793a(getContext());
        }
    }

    /* renamed from: g */
    public final C8671u mo12047g() {
        if (this.f16005P) {
            return C8671u.DETACHED;
        }
        return this.f16067o;
    }

    public final void onStart() {
        f15992S.booleanValue();
        super.onStart();
    }

    public final void onStop() {
        f15992S.booleanValue();
        super.onStop();
    }

    /* renamed from: s */
    public final void mo12064s() {
        long currentTimeMillis = System.currentTimeMillis();
        this.f16018aC = currentTimeMillis;
        this.f16017aB = currentTimeMillis;
    }

    /* renamed from: t */
    public final void mo12065t() {
        if (this.f16077y != null) {
            this.f16077y.mo11922n();
        }
    }

    /* renamed from: x */
    public final void mo12069x() {
        if (this.f16002M != null) {
            this.f16002M.mo10964b();
        }
    }

    /* renamed from: A */
    private void m13123A() {
        if (this.f16030ac != null) {
            this.f16030ac.mo10934b();
            this.f16030ac = null;
            f15992S.booleanValue();
        }
    }

    /* renamed from: B */
    private void m13124B() {
        if (this.f16071s != null) {
            this.f16071s.mo10934b();
            this.f16071s = null;
            f15992S.booleanValue();
        }
    }

    /* renamed from: G */
    private void m13129G() {
        if (mo8452l() && this.f16070r != null) {
            this.f16070r.setMute(false);
        }
    }

    /* renamed from: z */
    private void m13149z() {
        if (this.f16069q != null) {
            this.f16069q.mo10939b();
            this.f16069q = null;
            f15992S.booleanValue();
        }
    }

    /* renamed from: e */
    public final void mo12045e() {
        if (this.f16051ax) {
            m13142c("reset player");
            this.f16076x.setVisibility(8);
        }
        mo12046f();
    }

    /* renamed from: j */
    public final void mo12050j() {
        if (this.f16078z != null && this.f16078z.isShowing()) {
            this.f16078z.dismiss();
        }
    }

    /* renamed from: v */
    public final void mo12067v() {
        if (mo12068w().mo12873d() != null) {
            mo12068w().mo12873d().mo12891a();
        }
    }

    /* renamed from: w */
    public final C8657i mo12068w() {
        Fragment parentFragment = getParentFragment();
        if (parentFragment instanceof C6752f) {
            return (C8657i) parentFragment;
        }
        return new C8658a();
    }

    /* renamed from: D */
    private void m13126D() {
        if (this.f16077y != null) {
            this.f16077y.mo9589d();
            if (!this.f10829E) {
                getChildFragmentManager().mo2225a().mo2177a((Fragment) this.f16077y).mo2200e();
            }
            this.f16077y = null;
        }
    }

    /* renamed from: f */
    public final void mo12046f() {
        f15992S.booleanValue();
        this.f16020aE.removeCallbacksAndMessages(null);
        mo12031a(115, "change page", this.f16015a);
        if (this.f16002M != null) {
            this.f16002M.mo10964b();
        }
        m13140b(false);
        C4638d.m11114a().mo10419b();
        C4639e.m11122a().mo10425c();
        this.f16031ad.mo10943a(false);
    }

    /* renamed from: n */
    public final void mo12053n() {
        if (this.f16038ak.getVisibility() != 0) {
            this.f16038ak.setVisibility(0);
        }
        if (m13125C()) {
            if (this.f16040am.getVisibility() != 0) {
                this.f16040am.setVisibility(0);
                this.f16040am.mo11841b();
            }
        } else if (this.f16039al.getVisibility() != 0) {
            this.f16039al.setVisibility(0);
        }
    }

    /* renamed from: o */
    public final void mo12054o() {
        this.f16020aE.removeMessages(37);
        if (m13125C()) {
            if (this.f16040am.getVisibility() != 4) {
                this.f16040am.setVisibility(4);
                this.f16040am.mo11842c();
            }
        } else if (this.f16039al.getVisibility() != 4) {
            this.f16039al.setVisibility(4);
        }
        if (this.f16038ak.getVisibility() != 8) {
            this.f16038ak.setVisibility(8);
        }
    }

    public final void onPause() {
        f15992S.booleanValue();
        if (this.f16070r != null) {
            this.f16070r.onBackground();
        }
        C5070h hVar = this.f16068p;
        hVar.f13611m = true;
        if (hVar.f13612n != -1) {
            hVar.f13615q = SystemClock.elapsedRealtime();
            hVar.f13602d.removeCallbacksAndMessages(null);
            hVar.f13598a = true;
        }
        C5244x xVar = this.f16032ae;
        if (xVar.f13974d) {
            xVar.f13975e = true;
            xVar.f13973c.removeCallbacksAndMessages(null);
            xVar.mo11062c();
        }
        super.onPause();
    }

    /* renamed from: p */
    public final void mo12061p() {
        if (TTLiveSDKContext.getHostService().mo10315h().mo14532c() && this.f16015a != 0) {
            m13149z();
            m13138b(this.f16015a);
        }
    }

    /* renamed from: F */
    private void m13128F() {
        if (TTLiveSDKContext.getHostService().mo10315h().mo14532c() && this.f16069q != null && this.f16069q.f13548d != null && this.f16069q.f13548d.f15110a != null && this.f16069q.f13548d.f15110a.getOwner() != null && this.f16069q.f13548d.f15110a.getOwner().isFollowing()) {
            C4495a.m10823a().mo10301a((Object) new C7186a());
        }
    }

    /* renamed from: k */
    public final void mo12051k() {
        if (this.f16067o == C8671u.LIVE_STARTED) {
            this.f16020aE.removeMessages(28);
            m13126D();
            m13129G();
            if (this.f16029ab != null) {
                this.f16029ab.mo10944a();
                this.f16029ab = null;
            }
            ((C4193l) C4116c.m10249a(C4193l.class)).setCurrentRoom(null);
            C5014i.m11513b(null, this.f16015a);
            this.f16068p.mo10955c();
            this.f16072t = false;
            this.f16074v = false;
            this.f16067o = C8671u.PREPARED;
            f15992S.booleanValue();
        }
    }

    /* renamed from: m */
    public final void mo12052m() {
        boolean z;
        if (!this.f16035ah) {
            boolean z2 = false;
            if (this.f16069q == null || this.f16069q.f13548d == null) {
                z = false;
            } else {
                z = true;
            }
            if (this.f16070r != null && this.f16070r.getDecodeStatus() == 1) {
                z2 = true;
            }
            if (z && (z2 || !((Boolean) LiveSettingKeys.IS_LOAD_GIFT_RESOURCE_AFTER_FIRST_FRAME.mo9431a()).booleanValue())) {
                this.f16035ah = true;
                ((IGiftService) C4116c.m10249a(IGiftService.class)).syncGiftList(null, this.f16015a, 2, false);
            }
        }
    }

    /* renamed from: q */
    public final void mo12062q() {
        if (!(this.f16074v || ((C4193l) C4116c.m10249a(C4193l.class)).getCurrentRoom() == null || TTLiveSDKContext.getHostService().mo10317j() == null)) {
            getActivity();
        }
        if (this.f16067o != C8671u.LIVE_STARTED || this.f16074v) {
            if (this.f16068p != null && this.f16067o == C8671u.LIVE_STARTED) {
                this.f16068p.mo10955c();
            }
            mo12033a(C6042a.USER_CLOSE);
        } else if (mo12066u() == null || !mo12066u().mo12878i()) {
            C6045ch chVar = new C6045ch(this);
            if (!this.f16077y.mo11910a((Runnable) chVar, false)) {
                chVar.run();
            }
        }
    }

    public C6025ce() {
        boolean z;
        if (!((Boolean) LiveSettingKeys.ENABLE_SLIDE_ENTER_ROOM_OPT.mo9431a()).booleanValue() || !((Boolean) LiveSettingKeys.ENABLE_SLIDE_VIDEO_LAST_FRAME.mo9431a()).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        this.f16051ax = z;
        this.f16052ay = ((Boolean) LiveSettingKeys.ENABLE_SLIDE_ENTER_ROOM_OPT.mo9431a()).booleanValue();
        this.f16053az = ((Integer) LiveSettingKeys.LIVE_ENTER_DELAY_SHOW_LOADING_TIME.mo9431a()).intValue();
        this.f16016aA = null;
        this.f16017aB = 0;
        this.f16020aE = new Handler(Looper.getMainLooper()) {
            public final void handleMessage(Message message) {
                super.handleMessage(message);
                int i = message.what;
                if (i != 28) {
                    if (i == 37) {
                        C6025ce.this.mo12053n();
                    }
                    return;
                }
                C6025ce.this.mo12036a((Room) message.obj);
            }
        };
        this.f16022aG = false;
        this.f16023aH = false;
        this.f16003N = false;
        this.f16004O = true;
        this.f16024aI = new ArrayList();
        this.f16006Q = true;
        this.f16026aK = new C1689b();
        this.f16007R = new C2832a() {

            /* renamed from: b */
            private Queue<Long> f16083b = new LinkedList();

            /* renamed from: l */
            public final void mo7457l() {
                m13188a();
            }

            /* renamed from: m */
            public final void mo7458m() {
                m13188a();
            }

            /* renamed from: a */
            private boolean m13188a() {
                if (C6025ce.this.f16060h) {
                    TextUtils.equals(C6025ce.this.f16063k, C6025ce.this.f16062j);
                }
                return false;
            }

            /* renamed from: n */
            public final void mo7459n() {
                HashMap hashMap = new HashMap();
                hashMap.put("event_name", "liveplay_player_detached");
                C8064d.m16005b().mo9199b("ttlive_pullstream", (Map<String, ?>) hashMap);
                C6025ce.this.mo12046f();
                C6025ce.this.f16005P = true;
            }

            /* renamed from: j */
            public final void mo7455j() {
                if (!C6025ce.this.f16072t && C6025ce.this.f16076x.getVisibility() == 0) {
                    C6025ce.this.mo12053n();
                    C5072i iVar = C6025ce.this.f16002M;
                    if (iVar.f13628c != null) {
                        iVar.f13628c.start();
                    }
                }
            }

            /* JADX WARNING: Removed duplicated region for block: B:22:0x0102  */
            /* JADX WARNING: Removed duplicated region for block: B:32:0x0161  */
            /* JADX WARNING: Removed duplicated region for block: B:39:0x01cf  */
            /* JADX WARNING: Removed duplicated region for block: B:40:0x01d6  */
            /* renamed from: k */
            /* Code decompiled incorrectly, please refer to instructions dump. */
            public final void mo7456k() {
                /*
                    r23 = this;
                    r0 = r23
                    com.bytedance.android.livesdk.chatroom.c.f r1 = com.bytedance.android.livesdk.chatroom.p307c.C5045f.m11544a()
                    boolean r2 = r1.f13507a
                    if (r2 == 0) goto L_0x0062
                    c.a.b.c r2 = r1.f13510d
                    if (r2 == 0) goto L_0x000f
                    goto L_0x0062
                L_0x000f:
                    int r2 = r1.f13512f
                    switch(r2) {
                        case 0: goto L_0x003c;
                        case 1: goto L_0x0015;
                        default: goto L_0x0014;
                    }
                L_0x0014:
                    goto L_0x0062
                L_0x0015:
                    com.bytedance.android.live.core.setting.p<java.lang.Integer> r2 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.TOPLIVE_ENTER_FULLSCREEN_SLIDE_UP_PLAY_TIMES
                    java.lang.Object r2 = r2.mo9431a()
                    java.lang.Integer r2 = (java.lang.Integer) r2
                    int r2 = r2.intValue()
                    long r2 = (long) r2
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    c.a.v r2 = p064c.p065a.C2201v.m6592a(r2, r4)
                    c.a.ac r3 = p064c.p065a.p066a.p068b.C1667a.m5940a()
                    c.a.v r2 = r2.mo6514a(r3)
                    com.bytedance.android.livesdk.chatroom.c.h r3 = new com.bytedance.android.livesdk.chatroom.c.h
                    r3.<init>(r1)
                    c.a.b.c r2 = r2.mo6545f(r3)
                    r1.f13510d = r2
                    goto L_0x0062
                L_0x003c:
                    com.bytedance.android.live.core.setting.p<java.lang.Integer> r2 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_MT_FORYOU_SLIDE_UP_PLAY_TIMES
                    java.lang.Object r2 = r2.mo9431a()
                    java.lang.Integer r2 = (java.lang.Integer) r2
                    int r2 = r2.intValue()
                    long r2 = (long) r2
                    java.util.concurrent.TimeUnit r4 = java.util.concurrent.TimeUnit.SECONDS
                    c.a.v r2 = p064c.p065a.C2201v.m6592a(r2, r4)
                    c.a.ac r3 = p064c.p065a.p066a.p068b.C1667a.m5940a()
                    c.a.v r2 = r2.mo6514a(r3)
                    com.bytedance.android.livesdk.chatroom.c.g r3 = new com.bytedance.android.livesdk.chatroom.c.g
                    r3.<init>(r1)
                    c.a.b.c r2 = r2.mo6545f(r3)
                    r1.f13510d = r2
                L_0x0062:
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.c.c r1 = r1.f16001L
                    java.lang.String r2 = "n_time_player_start_pulling"
                    com.bytedance.android.livesdk.chatroom.ui.ce r3 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.b.a r3 = r3.f16070r
                    long r3 = r3.getPlayerStartTime()
                    r1.mo10894a(r2, r3)
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.c.c r1 = r1.f16001L
                    java.lang.String r2 = "n_time_player_first_frame"
                    com.bytedance.android.livesdk.chatroom.ui.ce r3 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.b.a r3 = r3.f16070r
                    long r3 = r3.getPlayerFirstFrameTime()
                    r1.mo10894a(r2, r3)
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.c.c r1 = r1.f16001L
                    java.lang.String r2 = "n_time_fragment_first_frame"
                    r1.mo10893a(r2)
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.c.c r1 = r1.f16001L
                    com.bytedance.android.livesdk.chatroom.ui.ce r2 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.b.a$a r2 = r2.f16007R
                    java.lang.String r2 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11522a(r2)
                    r1.f13488s = r2
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.c.c r1 = r1.f16001L
                    java.lang.String r2 = "pullDuration"
                    r1.mo10897c(r2)
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.c.c r1 = r1.f16001L
                    java.lang.String r2 = "duration"
                    r1.mo10897c(r2)
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.c.c r1 = r1.f16001L
                    java.lang.String r2 = "innerDuration"
                    r1.mo10897c(r2)
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.c.c r1 = r1.f16001L
                    boolean r2 = r1.f13483k
                    r4 = 0
                    r6 = 0
                    if (r2 != 0) goto L_0x02ca
                    java.lang.String r2 = r1.f13488s
                    boolean r2 = android.text.TextUtils.isEmpty(r2)
                    if (r2 == 0) goto L_0x00cb
                L_0x00c9:
                    r8 = r6
                    goto L_0x00fa
                L_0x00cb:
                    java.util.Map<java.lang.String, java.lang.String> r2 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.f13472r
                    java.lang.String r8 = r1.f13488s
                    java.lang.Object r2 = r2.get(r8)
                    java.lang.String r2 = (java.lang.String) r2
                    java.lang.String r8 = r1.f13488s
                    boolean r8 = android.text.TextUtils.isEmpty(r8)
                    if (r8 == 0) goto L_0x00de
                    goto L_0x00c9
                L_0x00de:
                    java.util.Map<java.lang.String, java.lang.Long> r8 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.f13471q
                    java.lang.Object r2 = r8.get(r2)
                    java.lang.Long r2 = (java.lang.Long) r2
                    if (r2 == 0) goto L_0x00c9
                    long r8 = r2.longValue()
                    int r10 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                    if (r10 >= 0) goto L_0x00f1
                    goto L_0x00c9
                L_0x00f1:
                    long r8 = java.lang.System.currentTimeMillis()
                    long r10 = r2.longValue()
                    long r8 = r8 - r10
                L_0x00fa:
                    java.lang.String r2 = r1.f13488s
                    boolean r2 = android.text.TextUtils.isEmpty(r2)
                    if (r2 != 0) goto L_0x0152
                    java.util.Map<java.lang.String, java.lang.String> r2 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.f13472r
                    java.lang.String r10 = r1.f13488s
                    java.lang.Object r2 = r2.get(r10)
                    java.lang.String r2 = (java.lang.String) r2
                    java.util.Map<java.lang.String, java.lang.String> r10 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.f13472r
                    java.lang.String r11 = r1.f13488s
                    r10.remove(r11)
                    boolean r10 = android.text.TextUtils.isEmpty(r2)
                    if (r10 != 0) goto L_0x0152
                    java.util.Map<java.lang.String, java.lang.Long> r10 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.f13471q
                    java.lang.Object r10 = r10.get(r2)
                    java.lang.Long r10 = (java.lang.Long) r10
                    java.util.Map<java.lang.String, java.lang.Long> r11 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.f13471q
                    r11.remove(r2)
                    if (r10 == 0) goto L_0x0152
                    long r11 = r10.longValue()
                    int r2 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                    if (r2 >= 0) goto L_0x0131
                    goto L_0x0152
                L_0x0131:
                    java.util.Map<java.lang.String, java.lang.Long> r2 = r1.f13475c
                    java.lang.String r11 = "pullDuration"
                    java.lang.String r11 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11529g(r11)
                    r2.put(r11, r10)
                    java.util.Map<java.lang.String, java.lang.Long> r2 = r1.f13475c
                    java.lang.String r11 = "duration"
                    java.lang.String r11 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11529g(r11)
                    r2.put(r11, r10)
                    java.util.Map<java.lang.String, java.lang.Long> r2 = r1.f13475c
                    java.lang.String r11 = "innerDuration"
                    java.lang.String r11 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11529g(r11)
                    r2.put(r11, r10)
                L_0x0152:
                    org.json.JSONObject r2 = new org.json.JSONObject
                    r2.<init>()
                    java.util.Map<java.lang.String, java.lang.Long> r10 = r1.f13475c
                    boolean r10 = r10.isEmpty()
                    if (r10 == 0) goto L_0x0161
                L_0x015f:
                    r2 = 0
                    goto L_0x01cd
                L_0x0161:
                    java.lang.String r10 = "duration"
                    long r12 = r1.mo10899e(r10)
                    java.lang.String r10 = "innerDuration"
                    long r14 = r1.mo10899e(r10)
                    java.lang.String r10 = "apiDuration"
                    long r16 = r1.mo10899e(r10)
                    java.lang.String r10 = "pullDuration"
                    long r18 = r1.mo10899e(r10)
                    java.lang.String r10 = "duration"
                    java.lang.String r20 = "apiDuration"
                    java.util.Map<java.lang.String, java.lang.Long> r11 = r1.f13475c
                    java.lang.String r10 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11528f(r10)
                    long r10 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11521a(r11, r10)
                    java.util.Map<java.lang.String, java.lang.Long> r3 = r1.f13475c
                    java.lang.String r5 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11528f(r20)
                    long r21 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11521a(r3, r5)
                    long r10 = r21 - r10
                    int r3 = (r10 > r6 ? 1 : (r10 == r6 ? 0 : -1))
                    if (r3 > 0) goto L_0x0198
                    r10 = r6
                L_0x0198:
                    r3 = 0
                    long r21 = r16 + r18
                    int r3 = (r12 > r21 ? 1 : (r12 == r21 ? 0 : -1))
                    if (r3 >= 0) goto L_0x01a0
                    goto L_0x015f
                L_0x01a0:
                    java.lang.String r3 = "duration"
                    java.lang.Long r5 = java.lang.Long.valueOf(r12)
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11525a(r2, r3, r5)
                    java.lang.String r3 = "innerDuration"
                    java.lang.Long r5 = java.lang.Long.valueOf(r14)
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11525a(r2, r3, r5)
                    java.lang.String r3 = "apiDuration"
                    java.lang.Long r5 = java.lang.Long.valueOf(r16)
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11525a(r2, r3, r5)
                    java.lang.String r3 = "pullDuration"
                    java.lang.Long r5 = java.lang.Long.valueOf(r18)
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11525a(r2, r3, r5)
                    java.lang.String r3 = "beginToApiReDuration"
                    java.lang.Long r5 = java.lang.Long.valueOf(r10)
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11525a(r2, r3, r5)
                L_0x01cd:
                    if (r2 != 0) goto L_0x01d6
                    java.util.Map<java.lang.String, java.lang.Long> r1 = r1.f13475c
                    r1.clear()
                    goto L_0x02ca
                L_0x01d6:
                    java.lang.String r3 = "room_id"
                    long r10 = r1.f13482j
                    java.lang.Long r5 = java.lang.Long.valueOf(r10)
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11525a(r2, r3, r5)
                    java.lang.String r3 = "enter_room_type"
                    java.lang.String r5 = r1.f13477e
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11526a(r2, r3, r5)
                    java.lang.String r3 = "enter_room_merge_type"
                    java.lang.String r5 = r1.f13478f
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11526a(r2, r3, r5)
                    java.lang.String r3 = "enter_room_method_type"
                    java.lang.String r5 = r1.f13479g
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11526a(r2, r3, r5)
                    java.lang.String r3 = "enterRoomStage"
                    int r5 = r1.f13476d
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11524a(r2, r3, r5)
                    java.lang.String r3 = "playerStatus"
                    int r5 = r1.f13481i
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11524a(r2, r3, r5)
                    java.lang.String r3 = "is_first"
                    boolean r5 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.f13469b
                    if (r5 == 0) goto L_0x0214
                    r5 = 1
                    goto L_0x0215
                L_0x0214:
                    r5 = 2
                L_0x0215:
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11524a(r2, r3, r5)
                    java.lang.String r3 = "monitor_version"
                    java.lang.String r5 = "2.0"
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11526a(r2, r3, r5)
                    java.lang.String r3 = "stopDuration"
                    long r10 = r1.f13484m
                    java.lang.Long r5 = java.lang.Long.valueOf(r10)
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11525a(r2, r3, r5)
                    java.lang.String r3 = "monitor_version"
                    java.lang.String r5 = "2.0"
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11526a(r2, r3, r5)
                    java.lang.String r3 = "enter_room_sub_type"
                    java.lang.String r5 = r1.f13480h
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11526a(r2, r3, r5)
                    java.lang.String r3 = "callback_duration"
                    java.lang.Long r5 = java.lang.Long.valueOf(r8)
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11525a(r2, r3, r5)
                    java.lang.String r3 = "looper_enable"
                    com.bytedance.android.live.core.setting.p<java.lang.Boolean> r5 = com.bytedance.android.livesdk.config.LiveSettingKeys.ENABLE_SINGLE_LOOPER_PLAYER_PULL_STREAM
                    java.lang.Object r5 = r5.mo9431a()
                    java.lang.Boolean r5 = (java.lang.Boolean) r5
                    boolean r5 = r5.booleanValue()
                    if (r5 == 0) goto L_0x0257
                    r5 = 1
                    goto L_0x0258
                L_0x0257:
                    r5 = 2
                L_0x0258:
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11524a(r2, r3, r5)
                    java.lang.String r3 = "has_warmed_up"
                    boolean r5 = r1.f13487p
                    java.lang.Integer r5 = java.lang.Integer.valueOf(r5)
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11524a(r2, r3, r5)
                    java.lang.String r3 = "duration"
                    long r8 = r2.optLong(r3, r6)
                    java.lang.Long r3 = java.lang.Long.valueOf(r8)
                    long r8 = r3.longValue()
                    r1.mo10895a(r2)
                    java.lang.String r3 = r1.f13477e
                    java.lang.String r5 = "slide"
                    boolean r3 = com.bytedance.common.utility.C9431p.m18665a(r3, r5)
                    if (r3 == 0) goto L_0x02bb
                    java.util.HashMap r3 = new java.util.HashMap
                    r3.<init>()
                    java.lang.String r5 = "enter_method"
                    java.lang.String r10 = "slide"
                    r3.put(r5, r10)
                    java.lang.String r5 = "enter_from_merge"
                    java.lang.String r10 = r1.f13478f
                    r3.put(r5, r10)
                    java.lang.String r5 = "n_time_fragment_first_frame"
                    long r10 = r1.mo10898d(r5)
                    java.lang.String r5 = "n_time_slide_selected"
                    long r12 = r1.mo10898d(r5)
                    long r10 = r10 - r12
                    java.lang.String r5 = "duration"
                    java.lang.String r10 = java.lang.String.valueOf(r10)
                    r3.put(r5, r10)
                    java.lang.Class<com.bytedance.android.livesdkapi.host.e> r5 = com.bytedance.android.livesdkapi.host.C8801e.class
                    com.bytedance.android.live.base.b r5 = com.bytedance.android.live.p245d.C4116c.m10249a(r5)
                    com.bytedance.android.livesdkapi.host.e r5 = (com.bytedance.android.livesdkapi.host.C8801e) r5
                    java.lang.String r10 = "livesdk_slide_loading_time"
                    r5.mo15567a(r10, r3)
                L_0x02bb:
                    java.lang.String r3 = "ttlive_audience_enter_room_full_new_all"
                    com.bytedance.android.live.core.p225d.C3837e.m9742a(r3, r4, r8, r2)
                    java.util.Map<java.lang.String, java.lang.Long> r2 = r1.f13475c
                    r2.clear()
                    r2 = 1
                    r1.f13483k = r2
                    com.bytedance.android.livesdk.chatroom.p307c.C5037c.f13469b = r4
                L_0x02ca:
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    java.util.HashMap<java.lang.String, java.lang.String> r1 = r1.f15998I
                    java.lang.String r2 = "time"
                    long r8 = java.lang.System.currentTimeMillis()
                    com.bytedance.android.livesdk.chatroom.ui.ce r3 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    long r10 = r3.f15999J
                    long r8 = r8 - r10
                    java.lang.String r3 = java.lang.String.valueOf(r8)
                    r1.put(r2, r3)
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    java.util.HashMap<java.lang.String, java.lang.String> r1 = r1.f15998I
                    java.lang.String r2 = "location"
                    java.lang.String r3 = " after onPlayDisplayed"
                    r1.put(r2, r3)
                    com.bytedance.android.livesdk.ab.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
                    com.bytedance.android.livesdkapi.host.e r1 = r1.mo10311d()
                    java.lang.String r2 = "feed_enter_room"
                    com.bytedance.android.livesdk.chatroom.ui.ce r3 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    java.util.HashMap<java.lang.String, java.lang.String> r3 = r3.f15998I
                    r1.mo15567a(r2, r3)
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.detail.h r1 = r1.f16068p
                    boolean r2 = r1.f13610l
                    if (r2 != 0) goto L_0x031d
                    r2 = 1
                    r1.f13610l = r2
                    com.bytedance.android.livesdk.live.a.a r2 = r1.f13613o
                    if (r2 == 0) goto L_0x0314
                    com.bytedance.android.livesdk.live.a.a r2 = r1.f13613o
                    long r2 = r2.mo14093a()
                    r1.f13614p = r2
                    goto L_0x031d
                L_0x0314:
                    long r2 = android.os.SystemClock.elapsedRealtime()
                    long r8 = r1.f13612n
                    long r2 = r2 - r8
                    r1.f13614p = r2
                L_0x031d:
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.detail.h r1 = r1.f16068p
                    r1.mo10959g()
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.detail.h r1 = r1.f16068p
                    r2 = 1
                    r1.mo10953a(r2, r4)
                    r1 = 2
                    int[] r2 = new int[r1]
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.b.a r1 = r1.f16070r
                    if (r1 == 0) goto L_0x033c
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.b.a r1 = r1.f16070r
                    r1.getVideoSize(r2)
                L_0x033c:
                    r1 = r2[r4]
                    if (r1 == 0) goto L_0x0374
                    r1 = 1
                    r3 = r2[r1]
                    if (r3 == 0) goto L_0x0374
                    com.bytedance.android.livesdk.chatroom.ui.ce r3 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    r5 = r2[r4]
                    r2 = r2[r1]
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    android.content.Context r1 = r1.getContext()
                    int r1 = com.bytedance.common.utility.C9432q.m18670a(r1)
                    r3.mo12030a(r5, r2, r1)
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.ui.b r1 = r1.f16077y
                    if (r1 == 0) goto L_0x0374
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.ies.sdk.widgets.DataCenter r1 = r1.f16065m
                    java.lang.String r2 = "cmd_video_orientation_changed"
                    com.bytedance.android.livesdk.chatroom.event.aw r3 = new com.bytedance.android.livesdk.chatroom.event.aw
                    com.bytedance.android.livesdk.chatroom.ui.ce r5 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    boolean r5 = r5.f16061i
                    com.bytedance.android.livesdk.chatroom.ui.ce r8 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    int r8 = r8.f16066n
                    r3.<init>(r5, r8)
                    r1.lambda$put$1$DataCenter(r2, r3)
                L_0x0374:
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    r1.mo12054o()
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.detail.i r1 = r1.f16002M
                    r1.mo10964b()
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    r1.mo12052m()
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    boolean r1 = r1.f16074v
                    if (r1 != 0) goto L_0x0422
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdkapi.depend.model.live.m r1 = r1.f16056d
                    com.bytedance.android.livesdkapi.depend.model.live.m r2 = com.bytedance.android.livesdkapi.depend.model.live.C8710m.AUDIO
                    if (r1 == r2) goto L_0x039a
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    java.lang.String r2 = "first frame"
                    r1.mo12037a(r2)
                L_0x039a:
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.detail.h r1 = r1.f16068p
                    if (r1 == 0) goto L_0x0437
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdk.chatroom.detail.h r1 = r1.f16068p
                    java.util.HashMap r2 = new java.util.HashMap
                    r2.<init>()
                    android.os.Bundle r3 = r1.f13608j
                    if (r3 == 0) goto L_0x0437
                    android.os.Bundle r3 = r1.f13608j
                    java.lang.String r5 = "live.intent.extra.LOAD_DURATION"
                    long r8 = r3.getLong(r5, r6)
                    int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                    if (r3 <= 0) goto L_0x0437
                    android.os.Bundle r3 = r1.f13608j
                    java.lang.String r5 = "live.intent.extra.LOAD_DURATION"
                    r3.remove(r5)
                    long r10 = android.os.SystemClock.elapsedRealtime()
                    long r10 = r10 - r8
                    java.lang.String r3 = "duration"
                    java.lang.String r5 = java.lang.String.valueOf(r10)
                    r2.put(r3, r5)
                    java.lang.String r3 = "request_page"
                    com.bytedance.android.livesdk.chatroom.b r5 = com.bytedance.android.livesdk.chatroom.C4995b.m11478a()
                    java.lang.String r5 = r5.mo10874f()
                    r2.put(r3, r5)
                    com.bytedance.android.livesdk.o.c r3 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
                    java.lang.String r5 = "livesdk_live_stream_load_duration"
                    r8 = 2
                    java.lang.Object[] r9 = new java.lang.Object[r8]
                    com.bytedance.android.livesdk.o.c.j r8 = new com.bytedance.android.livesdk.o.c.j
                    r8.<init>()
                    r9[r4] = r8
                    java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r8 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
                    r10 = 1
                    r9[r10] = r8
                    r3.mo14202a(r5, r2, r9)
                    long r8 = r1.f13580H
                    int r3 = (r8 > r6 ? 1 : (r8 == r6 ? 0 : -1))
                    if (r3 <= 0) goto L_0x0437
                    java.lang.String r3 = "duration"
                    long r5 = android.os.SystemClock.elapsedRealtime()
                    long r7 = r1.f13580H
                    long r5 = r5 - r7
                    java.lang.String r1 = java.lang.String.valueOf(r5)
                    r2.put(r3, r1)
                    com.bytedance.android.livesdk.o.c r1 = com.bytedance.android.livesdk.p399o.C8049c.m15979a()
                    java.lang.String r3 = "livesdk_new_style_pull_stream_duration"
                    r5 = 2
                    java.lang.Object[] r5 = new java.lang.Object[r5]
                    com.bytedance.android.livesdk.o.c.j r6 = new com.bytedance.android.livesdk.o.c.j
                    r6.<init>()
                    r5[r4] = r6
                    java.lang.Class<com.bytedance.android.livesdkapi.depend.model.live.Room> r6 = com.bytedance.android.livesdkapi.depend.model.live.Room.class
                    r7 = 1
                    r5[r7] = r6
                    r1.mo14202a(r3, r2, r5)
                    goto L_0x0437
                L_0x0422:
                    r7 = 1
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    java.lang.String r2 = "first frame but in illegal status"
                    r1.mo12039a(r7, r2)
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.b.a r1 = r1.f16070r
                    if (r1 == 0) goto L_0x0437
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.b.a r1 = r1.f16070r
                    r1.setMute(r7)
                L_0x0437:
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    r1.mo12048h()
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    boolean r1 = r1.f16075w
                    if (r1 == 0) goto L_0x0452
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    r1.f16075w = r4
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    r2 = 2132551056(0x7f1c2590, float:2.075546E38)
                    java.lang.String r1 = r1.getString(r2)
                    com.bytedance.android.livesdk.p279af.C4575an.m10987a(r1)
                L_0x0452:
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    com.bytedance.android.livesdkapi.depend.live.i r1 = r1.mo12068w()
                    com.bytedance.android.livesdkapi.depend.live.p r1 = r1.mo12874e()
                    if (r1 == 0) goto L_0x0463
                    com.bytedance.android.livesdk.chatroom.ui.ce r1 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    r1.mo12068w()
                L_0x0463:
                    com.bytedance.android.live.core.performance.g$a r1 = com.bytedance.android.live.core.performance.C3982g.C3983a.StartLivePlay
                    java.lang.String r2 = "hasDefaultUrl"
                    com.bytedance.android.livesdk.chatroom.ui.ce r3 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    boolean r3 = r3.f16003N
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    java.util.HashMap r2 = com.bytedance.android.live.core.performance.C3982g.m10083a(r2, r3)
                    com.bytedance.android.live.core.performance.C3982g.m10085a(r1, r2)
                    com.bytedance.android.live.core.performance.g$a r1 = com.bytedance.android.live.core.performance.C3982g.C3983a.ScrollWatchLivePlay
                    java.lang.String r2 = "hasDefaultUrl"
                    com.bytedance.android.livesdk.chatroom.ui.ce r3 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    boolean r3 = r3.f16003N
                    java.lang.String r3 = java.lang.String.valueOf(r3)
                    java.util.HashMap r2 = com.bytedance.android.live.core.performance.C3982g.m10083a(r2, r3)
                    com.bytedance.android.live.core.performance.C3982g.m10085a(r1, r2)
                    com.bytedance.android.live.core.performance.b r1 = com.bytedance.android.live.core.performance.C3974b.m10061a()
                    com.bytedance.android.live.core.performance.g$a r2 = com.bytedance.android.live.core.performance.C3982g.C3983a.StartLivePlay
                    java.lang.String r2 = r2.name()
                    java.lang.String r3 = "hasDefaultUrl"
                    com.bytedance.android.livesdk.chatroom.ui.ce r4 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    boolean r4 = r4.f16003N
                    java.lang.String r4 = java.lang.String.valueOf(r4)
                    java.util.HashMap r3 = com.bytedance.android.live.core.performance.C3982g.m10083a(r3, r4)
                    r1.mo9379a(r2, r3)
                    com.bytedance.android.live.core.performance.b r1 = com.bytedance.android.live.core.performance.C3974b.m10061a()
                    com.bytedance.android.live.core.performance.g$a r2 = com.bytedance.android.live.core.performance.C3982g.C3983a.ScrollWatchLivePlay
                    java.lang.String r2 = r2.name()
                    java.lang.String r3 = "hasDefaultUrl"
                    com.bytedance.android.livesdk.chatroom.ui.ce r4 = com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.this
                    boolean r4 = r4.f16003N
                    java.lang.String r4 = java.lang.String.valueOf(r4)
                    java.util.HashMap r3 = com.bytedance.android.live.core.performance.C3982g.m10083a(r3, r4)
                    r1.mo9379a(r2, r3)
                    return
                */
                throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.C602811.mo7456k():void");
            }

            /* renamed from: a */
            public final void mo7453a(Exception exc) {
                C6025ce.this.f16068p.mo10952a(false, 105, "ttplayer init failed");
                C6025ce.this.f16000K.mo14297a(105, "ttplayer init failed", C6025ce.this.f16015a, C6025ce.this.f15996G, C6025ce.this.f16055c);
                C6025ce.this.mo12031a(105, "ttplayer init failed", C6025ce.this.f16015a);
                C6025ce.this.mo12042b("pull_stream_error");
                C6025ce.this.mo12033a(C6042a.PLAYER_ERROR);
                C3982g.m10085a(C3983a.StartLivePlay, C3982g.m10083a("error", "ttplayer init failed"));
                C3982g.m10085a(C3983a.ScrollWatchLivePlay, C3982g.m10083a("error", "ttplayer init failed"));
                C3974b.m10061a().mo9381b(C3983a.StartLivePlay.name());
                C3974b.m10061a().mo9381b(C3983a.ScrollWatchLivePlay.name());
            }

            /* renamed from: a */
            public final void mo7454a(Object obj) {
                boolean z;
                if (C6025ce.this.f16077y != null && (C6025ce.this.f16077y instanceof C6156eq) && (obj instanceof String)) {
                    if (!((Boolean) C4638d.m11114a().f12651b).booleanValue() || 2 == ((Integer) C4639e.m11122a().f12651b).intValue()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    boolean z2 = LinkCrossRoomDataHolder.m11103a().f12611b;
                    if (z || z2) {
                        C6156eq eqVar = (C6156eq) C6025ce.this.f16077y;
                        String str = (String) obj;
                        if (eqVar.f16513T != null) {
                            LinkControlWidget linkControlWidget = eqVar.f16513T;
                            if (!linkControlWidget.f17095h) {
                                if (linkControlWidget.f17096i == 1) {
                                    if (linkControlWidget.f17089b != null) {
                                        LinkInRoomVideoGuestWidget linkInRoomVideoGuestWidget = linkControlWidget.f17089b;
                                        if (linkInRoomVideoGuestWidget.f14007d != null) {
                                            C5657g gVar = linkInRoomVideoGuestWidget.f14007d;
                                            if (gVar.f14826k && gVar.f14824i) {
                                                gVar.f14822g.mo11055a(str);
                                            }
                                        }
                                    }
                                } else if (linkControlWidget.f17096i == 2) {
                                    if (linkControlWidget.f17090c != null) {
                                        LinkCrossRoomWidget linkCrossRoomWidget = linkControlWidget.f17090c;
                                        if (!linkCrossRoomWidget.f17129b && linkCrossRoomWidget.f17133f != null) {
                                            linkCrossRoomWidget.f17133f.updateSei(str);
                                            if (linkCrossRoomWidget.f17135h && ((Boolean) LiveConfigSettingKeys.LIVE_PK_SEI_UPDATE.mo9431a()).booleanValue()) {
                                                C1680ad b = C1680ad.m5961a(str).mo6157b((C1711f<? super T, ? extends R>) new C6485bt<Object,Object>(str));
                                                C1715j jVar = C6486bu.f17786a;
                                                C1745b.m6050a(jVar, "predicate is null");
                                                ((C4001ab) ((C2194o) C1745b.m6050a(linkCrossRoomWidget.autoDisposeWithTransformer(), "converter is null")).mo6497a(C2150a.m6484a((C2193n<T>) new C1868e<T>(b, jVar)))).mo9403a(new C6487bv(linkCrossRoomWidget), C6475bj.f17775a);
                                            }
                                        }
                                    }
                                } else if (linkControlWidget.f17096i == 3) {
                                    LinkInRoomAudioWidget linkInRoomAudioWidget = linkControlWidget.f17091d;
                                    if (!linkInRoomAudioWidget.f17164j && linkInRoomAudioWidget.f17159e != null) {
                                        C5647a aVar = linkInRoomAudioWidget.f17159e;
                                        if (aVar.f14795l) {
                                            aVar.f14794k.updateSei(str);
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

            /* renamed from: a */
            public final void mo7451a(int i, int i2) {
                boolean z;
                C6025ce ceVar = C6025ce.this;
                if (i > i2) {
                    z = true;
                } else {
                    z = false;
                }
                ceVar.f16061i = z;
                if (C6025ce.this.f16061i || C6025ce.this.f16064l != 0) {
                    if (!(i == 0 || i2 == 0)) {
                        C6025ce.this.mo12030a(i, i2, C9432q.m18670a(C6025ce.this.getContext()));
                    }
                    if (C6025ce.this.f16077y != null) {
                        C6025ce.this.f16065m.lambda$put$1$DataCenter("cmd_video_orientation_changed", new C5177aw(C6025ce.this.f16061i, C6025ce.this.f16066n));
                    }
                } else if (C6025ce.this.f16077y != null) {
                    C6025ce.this.onEvent(new C8745a(1));
                } else {
                    C6025ce.this.getActivity().setRequestedOrientation(1);
                    C6025ce.this.f16064l = 1;
                    C6025ce.this.f16070r.setScreenOrientation(true);
                }
            }

            /* renamed from: a */
            public final void mo7452a(int i, String str) {
                Map map = (Map) C2942b.m8370b().mo34885a(str, new C17956a<Map<String, String>>() {
                }.f49843c);
                if (map.containsKey("error_code")) {
                    String str2 = (String) map.get("error_code");
                    if (str2 != null) {
                        C8108r rVar = C6025ce.this.f16000K;
                        int intValue = Integer.valueOf(str2).intValue();
                        long j = C6025ce.this.f16015a;
                        String str3 = C6025ce.this.f15996G;
                        String str4 = C6025ce.this.f16055c;
                        if (rVar.f22138d != 1) {
                            if (rVar.f22138d == 2) {
                                rVar.mo14297a(intValue, str, j, str3, str4);
                            } else if (rVar.f22139e == null) {
                                C8110t tVar = new C8110t(intValue, str, j, str3, str4);
                                rVar.f22139e = tVar;
                            }
                        }
                    }
                }
            }
        };
    }

    /* renamed from: H */
    private void m13130H() {
        if (!(this.f16068p == null || getArguments() == null)) {
            if (getArguments().getBoolean("enter_from_dou_plus", false)) {
                JSONObject jSONObject = new JSONObject();
                try {
                    jSONObject.put("duration", String.valueOf(this.f16068p.mo10954b()));
                    jSONObject.put("room_id", String.valueOf(this.f16015a));
                    jSONObject.put("anchor_id", String.valueOf(this.f16054b));
                } catch (JSONException unused) {
                }
                Serializable serializable = getArguments().getSerializable("live_douplus_log_extra");
                if (serializable instanceof HashMap) {
                    HashMap hashMap = (HashMap) serializable;
                    C4116c.m10249a(C8612a.class);
                    C8066a.m16007a().mo14223a(jSONObject).mo14222a((Map<String, String>) hashMap);
                }
            }
            if (getArguments().getBoolean("enter_from_effect_ad", false)) {
                JSONObject jSONObject2 = new JSONObject();
                try {
                    jSONObject2.put("duration", String.valueOf(this.f16068p.mo10954b()));
                    jSONObject2.put("room_id", String.valueOf(this.f16015a));
                    jSONObject2.put("anchor_id", String.valueOf(this.f16054b));
                } catch (JSONException unused2) {
                }
                Serializable serializable2 = getArguments().getSerializable("live_effect_ad_log_extra_map");
                if (serializable2 instanceof HashMap) {
                    HashMap hashMap2 = (HashMap) serializable2;
                    C4116c.m10249a(C8612a.class);
                    C8066a.m16007a().mo14223a(jSONObject2).mo14222a((Map<String, String>) hashMap2);
                }
            }
        }
        C4600j.m11042c(this.f16065m, getArguments());
    }

    /* renamed from: c */
    public final void mo12043c() {
        f15992S.booleanValue();
        this.f16026aK.mo6180a();
        this.f16034ag = false;
        this.f16065m.removeObserver(this);
        this.f16020aE.removeCallbacksAndMessages(null);
        m13148y();
        C4638d.m11114a().mo10419b();
        C4639e.m11122a().mo10425c();
        C4565af.m10961a(this.f16015a);
        LinkCrossRoomDataHolder.m11105a(this.f16015a);
        this.f16031ad.mo10943a(false);
    }

    /* renamed from: h */
    public final void mo12048h() {
        boolean z;
        boolean z2 = false;
        if (this.f16069q == null || this.f16069q.f13548d == null) {
            z = false;
        } else {
            z = true;
        }
        if (this.f16070r != null && this.f16070r.getDecodeStatus() == 1) {
            z2 = true;
        }
        f15992S.booleanValue();
        if (z) {
            if (z2) {
                this.f16020aE.removeMessages(28);
                this.f16020aE.sendMessage(Message.obtain(this.f16020aE, 28, this.f16069q.f13548d.f15110a));
                return;
            } else if (!this.f16020aE.hasMessages(28)) {
                this.f16020aE.sendMessageDelayed(Message.obtain(this.f16020aE, 28, this.f16069q.f13548d.f15110a), Math.min(0, (2000 - SystemClock.elapsedRealtime()) + this.f16068p.f13612n));
            }
        }
        if (this.f16015a != 0) {
            m13132a(this.f16015a);
        } else {
            try {
                if (this.f16054b <= 0 && this.f16000K != null) {
                    this.f16000K.mo14297a(106, "roomId is 0L", this.f16015a, this.f15996G, this.f16055c);
                    mo12031a(106, "roomId is 0L", this.f16015a);
                }
            } catch (Exception unused) {
            }
            m13141c(this.f16054b);
        }
        if (!TextUtils.isEmpty(this.f16010V)) {
            m13137a(this.f16010V, this.f16011W, this.f16056d, this.f16012X);
            return;
        }
        if (!TextUtils.isEmpty(this.f16055c)) {
            m13135a(this.f16055c, this.f16056d, this.f16012X, this.f16009U);
        }
    }

    public final void onDestroy() {
        f15992S.booleanValue();
        super.onDestroy();
        TTLiveSDKContext.getHostService().mo10317j();
        mo12043c();
        C4514j.m10883j().mo10322c().mo10501b();
        if (this.f16068p != null) {
            this.f16068p.mo10950a();
        }
        if (this.f16047at != null) {
            this.f16047at.removeDrawerListener(this.f16046as);
            this.f16047at = null;
        }
        C6749b.m14143a(getActivity(), Boolean.valueOf(false), null, null);
        C1072c cVar = this.f16046as;
        if (!(cVar == null || C6749b.f18442a == null)) {
            C6749b.f18442a.remove(cVar);
        }
        C6749b.f18442a = null;
        this.f16046as = null;
        if (this.f16002M != null) {
            C5072i iVar = this.f16002M;
            iVar.mo10964b();
            iVar.f13626a = null;
            iVar.f13627b = null;
            iVar.f13628c = null;
            this.f16002M = null;
        }
        if (this.f16032ae != null) {
            this.f16032ae.mo11061b();
            this.f16032ae = null;
        }
        this.f16015a = 0;
        this.f16054b = 0;
        this.f16008T = null;
        this.f16055c = null;
        this.f16009U = null;
        this.f16010V = null;
        this.f16011W = null;
        this.f16056d = C8710m.VIDEO;
        this.f16012X = null;
        this.f16067o = C8671u.IDLE;
        this.f16068p = null;
        this.f16060h = false;
        this.f16062j = null;
        this.f16063k = null;
        this.f16073u = false;
        this.f16057e = false;
        this.f16059g = false;
        this.f16034ag = false;
    }

    public final void onResume() {
        super.onResume();
        C5070h hVar = this.f16068p;
        hVar.f13611m = false;
        if (hVar.f13615q != -1) {
            hVar.f13616r += SystemClock.elapsedRealtime() - hVar.f13615q;
            hVar.f13615q = -1;
            hVar.f13602d.post(hVar.f13601c);
            hVar.mo10960h();
        }
        C5244x xVar = this.f16032ae;
        if (xVar.f13974d && xVar.f13975e) {
            xVar.f13975e = false;
            xVar.f13972b = SystemClock.elapsedRealtime();
            xVar.f13973c.sendEmptyMessageDelayed(100, C5244x.f13971a);
        }
        if (this.f16005P) {
            C3831a.m9712b("LivePlayFragment.onResume", "restarting detached live room");
            mo12068w().mo12862a("");
        }
        if (this.f16070r != null) {
            if (!this.f16074v) {
                this.f16070r.onForeground();
            }
            this.f16070r.tryResumePlay();
            if (!this.f16024aI.isEmpty()) {
                for (C5202u a : this.f16024aI) {
                    m13133a(a);
                }
                this.f16024aI.clear();
            }
        }
        f15992S.booleanValue();
        if (this.f16073u) {
            this.f16073u = false;
            if (this.f16067o == C8671u.PREPARED) {
                if (!TextUtils.isEmpty(this.f16010V)) {
                    m13137a(this.f16010V, this.f16011W, this.f16056d, this.f16012X);
                    return;
                }
                m13135a(this.f16055c, this.f16056d, this.f16012X, this.f16009U);
            }
        }
    }

    /* renamed from: r */
    public final void mo12063r() {
        if (isAdded() && mo8452l()) {
            if (this.f16077y != null) {
                this.f16077y.mo9589d();
            }
            if (mo12066u() != null) {
                mo12066u().mo12882n();
            }
            TTLiveSDKContext.getHostService().mo10317j();
            if (this.f16064l == 0) {
                this.f16064l = 1;
                getActivity().setRequestedOrientation(1);
            }
            if (this.f15993A == null) {
                C0654k childFragmentManager = getChildFragmentManager();
                Fragment a = childFragmentManager.mo2224a("LiveEndFragment");
                if (a == null) {
                    Room room = null;
                    if (this.f16069q != null && this.f16069q.f13548d != null && this.f16069q.f13548d.f15110a != null) {
                        room = this.f16069q.f13548d.f15110a;
                    } else if (!(this.f16071s == null || this.f16071s.f13541c == null)) {
                        room = this.f16071s.f13541c;
                    }
                    if (room != null) {
                        this.f15993A = new C5125a();
                        this.f15993A.mo11016a(getActivity(), room, new C8614a() {
                            /* renamed from: a */
                            public final boolean mo8466a() {
                                C8068g.m16014a((Context) C6025ce.this.getActivity());
                                C6025ce.this.mo12062q();
                                return true;
                            }
                        }, this.f16068p.f13620v);
                        childFragmentManager.mo2225a().mo2176a(R.id.ajf, this.f15993A, "LiveEndFragment").mo2195c();
                        this.f15993A.getLifecycle().mo324a(new LivePlayFragment$13(this));
                    } else if (this.f16071s == null || !this.f16071s.f13540b) {
                        if (this.f16067o != C8671u.LIVE_FINISHED) {
                            mo12033a(C6042a.ENTER_LIVE_END);
                        }
                        return;
                    } else {
                        this.f15997H = true;
                        return;
                    }
                } else {
                    this.f15993A = (C5125a) a;
                }
                this.f15993A.mo11017a(this.f16065m, getArguments());
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:78:0x01c9  */
    /* JADX WARNING: Removed duplicated region for block: B:81:0x01d3  */
    /* JADX WARNING: Removed duplicated region for block: B:84:0x0269  */
    /* JADX WARNING: Removed duplicated region for block: B:87:0x028c  */
    /* renamed from: b */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo12041b() {
        /*
            r19 = this;
            r0 = r19
            java.lang.Boolean r1 = f15992S
            r1.booleanValue()
            boolean r1 = r0.f16034ag
            r2 = 1
            if (r1 != 0) goto L_0x002c
            java.lang.Class<com.bytedance.android.livesdkapi.g.a> r1 = com.bytedance.android.livesdkapi.p449g.C8745a.class
            r0.m13134a(r1)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.w> r1 = com.bytedance.android.livesdk.chatroom.event.C5204w.class
            r0.m13134a(r1)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.x> r1 = com.bytedance.android.livesdk.chatroom.event.C5205x.class
            r0.m13134a(r1)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.p> r1 = com.bytedance.android.livesdk.chatroom.event.C5197p.class
            r0.m13134a(r1)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.z> r1 = com.bytedance.android.livesdk.chatroom.event.C5207z.class
            r0.m13134a(r1)
            java.lang.Class<com.bytedance.android.livesdk.chatroom.event.ab> r1 = com.bytedance.android.livesdk.chatroom.event.C5156ab.class
            r0.m13134a(r1)
            r0.f16034ag = r2
        L_0x002c:
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r0.f16065m
            java.lang.String r3 = "cmd_interact_state_change"
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r1.observeForever(r3, r0)
            java.lang.String r3 = "cmd_pk_state_change"
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r1.observeForever(r3, r0)
            java.lang.String r3 = "cmd_pk_state_change"
            r1.observeForever(r3, r0)
            com.bytedance.android.livesdkapi.depend.live.u r1 = r0.f16067o
            com.bytedance.android.livesdkapi.depend.live.u r3 = com.bytedance.android.livesdkapi.depend.live.C8671u.INITIALIZED
            r4 = 0
            if (r1 == r3) goto L_0x0052
            com.bytedance.android.livesdk.ab.f r1 = com.bytedance.android.livesdk.p270ab.C4514j.m10883j()
            com.bytedance.android.livesdk.live.provider.a r1 = r1.mo10324e()
            r1.f21348a = r4
            goto L_0x02ab
        L_0x0052:
            com.bytedance.android.livesdk.chatroom.detail.h r1 = r0.f16068p
            com.bytedance.android.livesdk.ab.f r3 = com.bytedance.android.livesdk.p270ab.C4514j.m10883j()
            com.bytedance.android.livesdk.live.provider.a r3 = r3.mo10324e()
            com.bytedance.android.livesdk.live.a.a r3 = r3.mo14109a(r2)
            r1.f13613o = r3
            java.lang.ref.WeakReference<android.content.Context> r3 = r1.f13603e
            if (r3 == 0) goto L_0x0077
            java.lang.ref.WeakReference<android.content.Context> r3 = r1.f13603e
            java.lang.Object r3 = r3.get()
            if (r3 == 0) goto L_0x0077
            java.lang.ref.WeakReference<android.content.Context> r1 = r1.f13603e
            java.lang.Object r1 = r1.get()
            android.content.Context r1 = (android.content.Context) r1
            goto L_0x0078
        L_0x0077:
            r1 = r4
        L_0x0078:
            com.bytedance.android.livesdk.p399o.C8068g.m16014a(r1)
            com.bytedance.android.livesdk.player.r r1 = r0.f16000K
            com.bytedance.android.livesdk.chatroom.detail.h r3 = r0.f16068p
            com.bytedance.android.livesdk.live.a.a r3 = r3.f13613o
            if (r3 == 0) goto L_0x0086
            r1.f22135a = r3
            goto L_0x008c
        L_0x0086:
            long r5 = android.os.SystemClock.uptimeMillis()
            r1.f22136b = r5
        L_0x008c:
            com.bytedance.android.live.core.p225d.C3834b.m9732a()
            com.bytedance.android.livesdkapi.depend.live.u r1 = r0.f16067o
            com.bytedance.android.livesdkapi.depend.live.u r3 = com.bytedance.android.livesdkapi.depend.live.C8671u.LIVE_FINISHED
            if (r1 != r3) goto L_0x00af
            com.bytedance.android.livesdk.chatroom.end.a r1 = r0.f15993A
            if (r1 != 0) goto L_0x00a7
            android.support.v4.app.k r1 = r19.getChildFragmentManager()
            java.lang.String r3 = "LiveEndFragment"
            android.support.v4.app.Fragment r1 = r1.mo2224a(r3)
            com.bytedance.android.livesdk.chatroom.end.a r1 = (com.bytedance.android.livesdk.chatroom.end.C5125a) r1
            r0.f15993A = r1
        L_0x00a7:
            com.bytedance.android.livesdk.chatroom.end.a r1 = r0.f15993A
            if (r1 != 0) goto L_0x02ab
            com.bytedance.android.livesdkapi.depend.live.u r1 = com.bytedance.android.livesdkapi.depend.live.C8671u.INITIALIZED
            r0.f16067o = r1
        L_0x00af:
            com.bytedance.android.livesdk.chatroom.end.a r1 = r0.f15993A
            if (r1 == 0) goto L_0x00ca
            boolean r1 = r0.f10829E
            if (r1 != 0) goto L_0x00c8
            android.support.v4.app.k r1 = r19.getChildFragmentManager()
            android.support.v4.app.r r1 = r1.mo2225a()
            com.bytedance.android.livesdk.chatroom.end.a r3 = r0.f15993A
            android.support.v4.app.r r1 = r1.mo2177a(r3)
            r1.mo2195c()
        L_0x00c8:
            r0.f15993A = r4
        L_0x00ca:
            com.bytedance.ies.sdk.widgets.DataCenter r1 = r0.f16065m
            r19.getArguments()
            com.bytedance.android.livesdkapi.depend.live.u r1 = com.bytedance.android.livesdkapi.depend.live.C8671u.PREPARING
            r0.f16067o = r1
            android.os.Bundle r1 = r19.getArguments()
            if (r1 != 0) goto L_0x00df
            android.os.Bundle r1 = new android.os.Bundle
            r1.<init>()
            goto L_0x00e3
        L_0x00df:
            android.os.Bundle r1 = r19.getArguments()
        L_0x00e3:
            java.lang.String r3 = "live.intent.extra.WARM_UP_PLAYER_TAG"
            java.lang.String r3 = r1.getString(r3)
            if (r3 == 0) goto L_0x00ed
            r0.f16025aJ = r3
        L_0x00ed:
            java.lang.String r3 = "live.intent.extra.EXTRA_ENTER_ROOM_STAR_INNER_TIME"
            r5 = 0
            long r7 = r1.getLong(r3, r5)
            java.lang.String r3 = "live.intent.extra.EXTRA_ENTER_ROOM_STAR_TYPE"
            java.lang.String r3 = r1.getString(r3, r4)
            r0.f16016aA = r3
            java.lang.String r9 = "slide"
            java.lang.String r10 = r0.f16016aA
            boolean r9 = com.bytedance.common.utility.C9431p.m18665a(r9, r10)
            if (r9 != 0) goto L_0x010f
            java.lang.String r9 = "live.intent.extra.EXTRA_ENTER_ROOM_STAR_TIME"
            long r9 = r1.getLong(r9, r5)
            r0.f16017aB = r9
        L_0x010f:
            java.lang.String r9 = "enter_from_merge"
            java.lang.String r9 = r1.getString(r9, r4)
            java.lang.String r10 = "enter_method"
            java.lang.String r10 = r1.getString(r10, r4)
            com.bytedance.android.livesdk.chatroom.detail.h r11 = r0.f16068p
            com.bytedance.android.livesdk.live.a.a r11 = r11.f13613o
            if (r11 == 0) goto L_0x0128
            com.bytedance.android.livesdk.chatroom.detail.h r11 = r0.f16068p
            com.bytedance.android.livesdk.live.a.a r11 = r11.f13613o
            java.lang.String r11 = r11.f21289a
            goto L_0x012a
        L_0x0128:
            java.lang.String r11 = ""
        L_0x012a:
            java.lang.String r12 = "previous_page"
            java.lang.String r4 = r1.getString(r12, r4)
            java.lang.String r12 = "previous_page"
            r1.remove(r12)
            com.bytedance.android.livesdk.chatroom.c.c r12 = r0.f16001L
            java.lang.String r13 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11522a(r19)
            long r14 = r0.f16017aB
            long r5 = r0.f16015a
            java.lang.String r2 = r0.f16055c
            r18 = r4
            java.lang.String r4 = r0.f16010V
            r12.f13482j = r5
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x0155
            boolean r2 = android.text.TextUtils.isEmpty(r4)
            if (r2 == 0) goto L_0x0155
            r2 = 3
            goto L_0x0156
        L_0x0155:
            r2 = 1
        L_0x0156:
            r12.f13476d = r2
            java.lang.Class<com.bytedance.android.live.livepullstream.a.d> r2 = com.bytedance.android.live.livepullstream.p249a.C4139d.class
            com.bytedance.android.live.base.b r2 = com.bytedance.android.live.p245d.C4116c.m10249a(r2)
            com.bytedance.android.live.livepullstream.a.d r2 = (com.bytedance.android.live.livepullstream.p249a.C4139d) r2
            com.bytedance.android.live.room.h r2 = r2.getLivePlayController()
            r4 = 0
            if (r2 != 0) goto L_0x0169
            r2 = 0
            goto L_0x0172
        L_0x0169:
            boolean r2 = r2.mo14281i()
            if (r2 == 0) goto L_0x0171
            r2 = 2
            goto L_0x0172
        L_0x0171:
            r2 = 1
        L_0x0172:
            r12.f13481i = r2
            boolean r2 = android.text.TextUtils.isEmpty(r3)
            if (r2 != 0) goto L_0x017b
            goto L_0x017d
        L_0x017b:
            java.lang.String r3 = "other"
        L_0x017d:
            r12.f13477e = r3
            boolean r2 = android.text.TextUtils.isEmpty(r9)
            if (r2 != 0) goto L_0x0186
            goto L_0x0188
        L_0x0186:
            java.lang.String r9 = "other"
        L_0x0188:
            r12.f13478f = r9
            boolean r2 = android.text.TextUtils.isEmpty(r10)
            if (r2 != 0) goto L_0x0191
            goto L_0x0193
        L_0x0191:
            java.lang.String r10 = "other"
        L_0x0193:
            r12.f13479g = r10
            boolean r2 = android.text.TextUtils.isEmpty(r11)
            if (r2 != 0) goto L_0x019c
            goto L_0x019e
        L_0x019c:
            java.lang.String r11 = "other"
        L_0x019e:
            r12.f13480h = r11
            java.util.Map<java.lang.String, java.lang.Long> r2 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.f13470l
            java.lang.Object r2 = r2.get(r13)
            java.lang.Long r2 = (java.lang.Long) r2
            java.util.Map<java.lang.String, java.lang.Long> r3 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.f13470l
            r3.remove(r13)
            if (r2 == 0) goto L_0x01bf
            long r5 = r2.longValue()
            r16 = 0
            int r3 = (r5 > r16 ? 1 : (r5 == r16 ? 0 : -1))
            if (r3 >= 0) goto L_0x01ba
            goto L_0x01c1
        L_0x01ba:
            long r5 = r2.longValue()
            goto L_0x01c3
        L_0x01bf:
            r16 = 0
        L_0x01c1:
            r5 = r16
        L_0x01c3:
            r12.f13484m = r5
            int r2 = (r14 > r16 ? 1 : (r14 == r16 ? 0 : -1))
            if (r2 > 0) goto L_0x01cd
            long r14 = java.lang.System.currentTimeMillis()
        L_0x01cd:
            r12.f13485n = r14
            int r2 = (r7 > r16 ? 1 : (r7 == r16 ? 0 : -1))
            if (r2 > 0) goto L_0x01d7
            long r7 = java.lang.System.currentTimeMillis()
        L_0x01d7:
            r12.f13486o = r7
            r12.f13483k = r4
            java.util.Map<java.lang.String, java.lang.Long> r2 = r12.f13475c
            r2.clear()
            java.util.Map<java.lang.String, java.lang.Long> r2 = r12.f13475c
            java.lang.String r3 = "duration"
            java.lang.String r3 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11528f(r3)
            long r4 = r12.f13485n
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.Long> r2 = r12.f13475c
            java.lang.String r3 = "innerDuration"
            java.lang.String r3 = com.bytedance.android.livesdk.chatroom.p307c.C5037c.m11528f(r3)
            long r4 = r12.f13486o
            java.lang.Long r4 = java.lang.Long.valueOf(r4)
            r2.put(r3, r4)
            java.util.Map<java.lang.String, java.lang.Long> r2 = r12.f13474a
            r2.clear()
            java.lang.String r2 = "n_time_begin"
            long r3 = r12.f13485n
            r12.mo10894a(r2, r3)
            java.lang.String r2 = "n_time_start_room"
            r12.mo10893a(r2)
            com.bytedance.android.livesdk.chatroom.c.c r2 = r0.f16001L
            java.lang.String r3 = "n_time_slide_selected"
            long r4 = r0.f16018aC
            r2.mo10894a(r3, r4)
            r2 = 0
            r0.f16018aC = r2
            java.lang.String r2 = "live.intent.extra.ENTER_TYPE"
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r3 = "live.intent.extra.ENTER_TYPE"
            r1.remove(r3)
            java.lang.String r3 = "live.intent.extra.PAGE_DELAY_TYPE"
            java.lang.String r3 = r1.getString(r3)
            java.lang.String r4 = "live.intent.extra.PAGE_DELAY_TYPE"
            r1.remove(r4)
            java.lang.String r4 = "live.intent.extra.EXTRA_ENTER_FEED_STYLE"
            java.lang.String r4 = r1.getString(r4)
            com.bytedance.ies.sdk.widgets.DataCenter r5 = r0.f16065m
            java.lang.String r6 = "log_action_type"
            r5.lambda$put$1$DataCenter(r6, r2)
            com.bytedance.android.livesdk.chatroom.detail.h r5 = r0.f16068p
            r5.f13617s = r2
            r5.f13618t = r3
            r5.f13619u = r4
            com.bytedance.android.livesdk.chatroom.detail.h r2 = r0.f16068p
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r0.f16065m
            r2.f13575C = r3
            com.bytedance.android.livesdk.chatroom.detail.h r2 = r0.f16068p
            r3 = r18
            r2.f13581I = r3
            com.bytedance.android.livesdk.chatroom.detail.h r2 = r0.f16068p
            long r3 = android.os.SystemClock.elapsedRealtime()
            r2.f13612n = r3
            long r3 = android.os.SystemClock.elapsedRealtime()
            r2.f13576D = r3
            boolean r3 = r2.f13611m
            if (r3 == 0) goto L_0x026d
            long r3 = r2.f13612n
            r2.f13615q = r3
        L_0x026d:
            r3 = 1
            r2.f13600b = r3
            android.os.Handler r3 = r2.f13602d
            java.lang.Runnable r4 = r2.f13601c
            r3.post(r4)
            r2.mo10960h()
            java.lang.String r2 = "enter_from_merge_recommend"
            java.lang.String r3 = ""
            java.lang.String r1 = r1.getString(r2, r3)
            com.bytedance.android.livesdk.chatroom.detail.h r2 = r0.f16068p
            r2.f13579G = r1
            com.bytedance.android.livesdk.chatroom.f.x r1 = r0.f16032ae
            boolean r2 = r1.f13974d
            if (r2 != 0) goto L_0x029e
            r2 = 1
            r1.f13974d = r2
            long r2 = android.os.SystemClock.elapsedRealtime()
            r1.f13972b = r2
            com.bytedance.android.livesdkapi.depend.c.a r1 = r1.f13973c
            r2 = 100
            long r3 = com.bytedance.android.livesdk.chatroom.p310f.C5244x.f13971a
            r1.sendEmptyMessageDelayed(r2, r3)
        L_0x029e:
            com.bytedance.android.livesdk.fans.a r1 = com.bytedance.android.livesdk.fans.C6774a.m14202a()
            long r2 = android.os.SystemClock.elapsedRealtime()
            r1.f18555a = r2
            r19.mo12048h()
        L_0x02ab:
            com.bytedance.android.livesdk.chatroom.detail.f r1 = r0.f16031ad
            r2 = 1
            r1.mo10943a(r2)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.mo12041b():void");
    }

    /* renamed from: a */
    public final void mo12035a(C8660a aVar) {
        this.f16027aL = aVar;
    }

    /* renamed from: a */
    private void m13132a(long j) {
        m13138b(j);
        m13144d(j);
    }

    public final void onEvent(C5156ab abVar) {
        if (abVar != null) {
            this.f16019aD = abVar.f13824a;
        }
    }

    public final void onEvent(C5205x xVar) {
        if (mo12066u() != null) {
            mo12066u().mo12866a(xVar.f13928b);
        }
    }

    public final void setUserVisibleHint(boolean z) {
        super.setUserVisibleHint(z);
        if (this.f15993A != null) {
            this.f15993A.setUserVisibleHint(z);
        }
    }

    /* renamed from: c */
    private void m13141c(long j) {
        if (this.f16030ac == null) {
            this.f16030ac = new C5080n(new C5061a() {
                /* renamed from: a */
                public final void mo10937a(Room room) {
                    if (room == null) {
                        C8049c.m15979a().mo14203a("rd_enter_room_live_end", C8059j.class, Room.class);
                        C6025ce.this.mo12033a(C6042a.ENTER_LIVE_END);
                        return;
                    }
                    if (C6025ce.this.mo12040a(room, false)) {
                        C6025ce.this.mo12048h();
                    }
                }

                /* renamed from: a */
                public final void mo10936a(int i, String str) {
                    int i2;
                    if (!(i == 30003 || i == 30001)) {
                        if (i != 0) {
                            i2 = i;
                        } else {
                            i2 = 103;
                        }
                        C6025ce.this.f16068p.mo10952a(false, i2, str);
                        C6025ce.this.f16000K.mo14297a(i2, str, C6025ce.this.f16015a, C6025ce.this.f15996G, C6025ce.this.f16055c);
                        C6025ce.this.mo12031a(i2, str, C6025ce.this.f16015a);
                    }
                    C6025ce.this.mo12033a(C6042a.FETCH_FAILED);
                    if (i != 30003) {
                        C8049c.m15979a().mo14203a("rd_info_by_user_failed", C8059j.class, Room.class);
                        return;
                    }
                    C8049c.m15979a().mo14203a("rd_enter_room_live_end", C8059j.class, Room.class);
                }
            }, j);
            this.f16030ac.mo10932a();
            f15992S.booleanValue();
        }
    }

    /* renamed from: d */
    private void m13144d(final long j) {
        if (this.f16071s == null) {
            this.f16071s = new C5079m(new C5061a() {
                /* renamed from: a */
                public final void mo10937a(Room room) {
                    C6025ce.this.mo12040a(room, true);
                }

                /* renamed from: a */
                public final void mo10936a(int i, String str) {
                    if (C6025ce.this.f16069q == null) {
                        C6025ce.this.mo12033a(C6042a.FETCH_FAILED);
                        C6025ce.this.mo12031a(i, str, j);
                    } else if (C6025ce.this.f16069q.f13548d != null && C6025ce.this.f16069q.f13548d.f15110a != null) {
                    } else {
                        if (!C6025ce.this.f16069q.f13547c) {
                            if (C6025ce.this.f15997H) {
                                C6025ce.this.mo12033a(C6042a.ROOM_PLAY_FINISHED);
                            }
                        } else if (!C6025ce.this.f16071s.f13637d) {
                            C5079m mVar = C6025ce.this.f16071s;
                            mVar.f13637d = true;
                            mVar.mo10932a();
                        }
                    }
                }
            }, j);
            this.f16071s.mo10932a();
            f15992S.booleanValue();
        }
    }

    /* renamed from: a */
    private <T> void m13134a(Class<T> cls) {
        this.f16026aK.mo6181a(C4495a.m10823a().mo10300a(cls).mo6545f((C1710e<? super T>) new C1710e<T>() {
            public final void accept(T t) throws Exception {
                if (t instanceof C8745a) {
                    C6025ce.this.onEvent((C8745a) t);
                } else if (t instanceof C5204w) {
                    C6025ce.this.onEvent((C5204w) t);
                } else if (t instanceof C5205x) {
                    C6025ce.this.onEvent((C5205x) t);
                } else if (t instanceof C5197p) {
                    C6025ce.this.onEvent((C5197p) t);
                } else if (t instanceof C5207z) {
                    C6025ce.this.onEvent((C5207z) t);
                } else {
                    if (t instanceof C5156ab) {
                        C6025ce.this.onEvent((C5156ab) t);
                    }
                }
            }
        }));
    }

    /* renamed from: c */
    private void m13142c(String str) {
        if (this.f16036ai.getVisibility() != 0) {
            this.f16036ai.setVisibility(0);
        }
        new StringBuilder("show Background, reason: ").append(str);
        mo12039a(true, str);
    }

    /* renamed from: d */
    private void m13145d(String str) {
        if (mo8452l() && this.f16070r != null) {
            this.f16070r.setMute(true);
        }
    }

    /* renamed from: a */
    private void m13133a(C5202u uVar) {
        if (!isResumed()) {
            this.f16024aI.add(uVar);
        } else if (this.f16067o == C8671u.LIVE_STARTED) {
            if (3 == uVar.f13919a) {
                if (this.f16070r != null) {
                    this.f16070r.stopWhenJoinInteract(getContext());
                }
                this.f16076x.setVisibility(4);
                mo12054o();
                return;
            }
            if (4 == uVar.f13919a) {
                this.f16076x.setVisibility(0);
                if (this.f16070r != null) {
                    this.f16070r.tryResumePlay();
                    if (this.f16074v) {
                        this.f16070r.setMute(true);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    private void m13140b(boolean z) {
        if (this.f16067o != C8671u.IDLE && this.f16067o != C8671u.INITIALIZED) {
            if (this.f16076x != null && (this.f16076x instanceof C8866c)) {
                ((C8866c) this.f16076x).mo15860a();
            }
            if (this.f16068p != null) {
                this.f16068p.mo10957e();
                this.f16068p.mo10958f();
            }
            if (this.f16032ae != null) {
                this.f16032ae.mo11059a();
                this.f16032ae.mo11061b();
            }
            C5048a.m11552a().mo10913a(this.f16015a);
            if (this.f16067o != C8671u.LIVE_FINISHED) {
                if (this.f16067o == C8671u.LIVE_STARTED) {
                    mo12051k();
                }
                if (this.f16067o == C8671u.PREPARED || this.f16067o == C8671u.PREPARING) {
                    m13143c(z);
                }
                if (this.f16068p != null) {
                    this.f16068p.mo10950a();
                }
                m13130H();
            }
        }
    }

    /* renamed from: c */
    private void m13143c(boolean z) {
        if (this.f16067o == C8671u.PREPARING || this.f16067o == C8671u.PREPARED) {
            m13123A();
            m13124B();
            m13149z();
            mo12038a(z);
            this.f16068p.mo10950a();
            this.f16067o = C8671u.INITIALIZED;
            this.f15996G = "other";
            f15992S.booleanValue();
        }
    }

    /* renamed from: d */
    private void m13146d(boolean z) {
        if (this.f16065m != null) {
            ((Long) this.f16065m.get("data_room_id", Long.valueOf(-1))).longValue();
        }
        if (!z) {
            if (this.f16070r != null) {
                this.f16070r.setMute(true);
                this.f16070r.stopWhenPlayingOther(getContext());
                this.f16045ar = true;
            }
            this.f16020aE.post(new Runnable() {
                public final void run() {
                    C4495a.m10823a().mo10301a((Object) new C5204w(34));
                }
            });
        } else if (this.f16070r != null) {
            this.f16070r.tryResumePlay();
            this.f16045ar = false;
            C4624y.m11088a(this);
        }
    }

    /* renamed from: e */
    private void m13147e(boolean z) {
        Object obj;
        if (this.f16065m != null) {
            obj = this.f16065m.get("data_member_count");
        } else {
            obj = null;
        }
        int i = 0;
        if (obj instanceof Integer) {
            i = ((Integer) obj).intValue();
        }
        RoomStatusEvent roomStatusEvent = new RoomStatusEvent();
        roomStatusEvent.f8662c = z;
        roomStatusEvent.f8663d = i;
        roomStatusEvent.f8661b = this.f16054b;
        roomStatusEvent.f8660a = this.f16015a;
        if (getActivity() != null) {
            Intent intent = getActivity().getIntent();
            if (intent != null) {
                intent.putExtra("host_room_status_event", roomStatusEvent);
            }
        }
    }

    public final void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        try {
            if (this.f16064l != getActivity().getRequestedOrientation()) {
                getActivity().setRequestedOrientation(this.f16064l);
            }
        } catch (Exception unused) {
            C3831a.m9712b("ttlive_room", "setRequestedOrientation wrong");
        }
        C0654k childFragmentManager = getChildFragmentManager();
        Fragment a = childFragmentManager.mo2224a("AbsInteractionFragment");
        if (a != null) {
            childFragmentManager.mo2225a().mo2177a(a).mo2195c();
        }
        ((C4139d) C4116c.m10249a(C4139d.class)).getGpuInfoFetcher().mo9526a(getActivity(), this.f16021aF, C6043cf.f16112a);
    }

    public final void onEvent(C5207z zVar) {
        if (this.f16067o == C8671u.LIVE_STARTED) {
            if (zVar.f13934d != null) {
                Quality quality = zVar.f13934d;
                if (this.f16067o == C8671u.LIVE_STARTED) {
                    this.f16062j = quality.name;
                    this.f16075w = true;
                    this.f16070r.switchResolution(quality.sdkKey);
                    C4575an.m10987a(getString(R.string.eto));
                }
                return;
            }
            String str = zVar.f13932b;
            String str2 = zVar.f13933c;
            String str3 = zVar.f13931a;
            if (!TextUtils.isEmpty(str)) {
                this.f16062j = str3;
                this.f16075w = true;
                this.f16070r.stop(false);
                this.f16070r.recycle();
                this.f16070r = null;
                m13135a(str, this.f16056d, this.f16012X, str2);
                C4575an.m10987a(getString(R.string.eto));
            }
        }
    }

    /* renamed from: b */
    private void m13138b(final long j) {
        if (this.f16069q == null) {
            String str = "";
            if (!TextUtils.isEmpty(this.f16068p.f13579G)) {
                str = this.f16068p.f13579G;
            } else if (!TextUtils.isEmpty(this.f16068p.f13621w)) {
                if (TextUtils.isEmpty(this.f16068p.f13622x)) {
                    str = this.f16068p.f13621w;
                } else {
                    StringBuilder sb = new StringBuilder();
                    sb.append(this.f16068p.f13621w);
                    sb.append("-");
                    sb.append(this.f16068p.f13622x);
                    str = sb.toString();
                }
            }
            C5064e eVar = new C5064e(new C5066a() {
                /* renamed from: a */
                public final void mo10941a(C5748f fVar) {
                    String str;
                    String str2;
                    C8108r rVar = C6025ce.this.f16000K;
                    rVar.f22138d = 2;
                    if (rVar.f22139e != null) {
                        rVar.mo14297a(rVar.f22139e.f22141a, rVar.f22139e.f22142b, rVar.f22139e.f22143c, rVar.f22139e.f22144d, rVar.f22139e.f22145e);
                        rVar.f22139e = null;
                    }
                    C6025ce.this.f16001L.mo10897c("apiDuration");
                    C6025ce.this.f16001L.mo10893a("n_time_api_finish");
                    C5037c cVar = C6025ce.this.f16001L;
                    JSONObject jSONObject = new JSONObject();
                    cVar.mo10895a(jSONObject);
                    long d = cVar.mo10898d("n_time_api_finish") - cVar.mo10898d("n_time_api_start");
                    if (d < 0) {
                        d = 0;
                    }
                    C3837e.m9742a("ttlive_audience_enter_room_full_new_api_all", 0, d, jSONObject);
                    C6025ce.this.mo12050j();
                    Room room = fVar.f15110a;
                    if (room != null) {
                        C8108r rVar2 = C6025ce.this.f16000K;
                        long j = j;
                        String buildPullUrl = room.buildPullUrl();
                        if (!rVar2.f22137c) {
                            rVar2.f22137c = true;
                            if (rVar2.f22135a != null) {
                                str2 = rVar2.f22135a.f21289a;
                            } else {
                                str2 = "other";
                            }
                            long a = rVar2.mo14294a();
                            JSONObject jSONObject2 = new JSONObject();
                            C8108r.m9731a(jSONObject2, "enter_room_type", str2);
                            C8108r.m9730a(jSONObject2, "room_id", j);
                            C8108r.m9731a(jSONObject2, "pull_url", buildPullUrl);
                            C3837e.m9742a("ttlive_audience_enter_room_all", 0, a, jSONObject2);
                        }
                        C6025ce.this.f16006Q = room.isOfficial();
                        C6025ce.this.mo12052m();
                    }
                    boolean a2 = C6025ce.this.mo12040a(room, true);
                    C8038g a3 = C8049c.m15979a().mo14201a(Room.class);
                    if (a3 != null) {
                        room.setLog_pb(String.valueOf(a3.mo14192a().get("log_pb")));
                        room.setRequestId(String.valueOf(a3.mo14192a().get("request_id")));
                        a3.mo14192a().put("orientation", String.valueOf(room.getOrientation()));
                        String string = C6025ce.this.getArguments().getString("is_preview");
                        Map a4 = a3.mo14192a();
                        String str3 = "is_preview";
                        if (TextUtils.isEmpty(string)) {
                            string = "0";
                        }
                        a4.put(str3, string);
                        a3.mo14192a().put("starlight_rank", C6025ce.this.getArguments().getString("starlight_rank"));
                        Map a5 = a3.mo14192a();
                        String str4 = "is_sale";
                        if (room.hasCommerceGoods) {
                            str = "1";
                        } else {
                            str = "0";
                        }
                        a5.put(str4, str);
                        a3.mo14192a().put("is_live_recall", "0");
                        Bundle bundle = C6025ce.this.getArguments().getBundle("live.intent.extra.ENTER_LIVE_EXTRA");
                        if (bundle != null) {
                            a3.mo14192a().put("starlight_rank", bundle.getString("starlight_rank"));
                        }
                    }
                    C6025ce.this.f16068p.mo10953a(false, true);
                    if (a2) {
                        if (C6025ce.this.f16067o == C8671u.PREPARING) {
                            C6025ce.this.f16067o = C8671u.PREPARED;
                        }
                        C6025ce.this.f16065m.lambda$put$1$DataCenter("data_message_manager", C4565af.m10959a(room.getId(), false, C6025ce.this.getContext()));
                        C6025ce.this.mo12048h();
                    }
                }

                /* renamed from: a */
                public final void mo10940a(int i, String str, String str2) {
                    int i2;
                    C6025ce.this.f16000K.f22138d = 1;
                    C6025ce.this.mo12050j();
                    C6025ce.this.mo12042b("fetch_room_error");
                    if ((TextUtils.isEmpty(str) || !str.contains("30003")) && i != 30003) {
                        C8049c.m15979a().mo14203a("rd_enter_room_failed", C8059j.class, Room.class);
                        if (i != 0) {
                            i2 = i;
                        } else {
                            i2 = 103;
                        }
                        C6025ce.this.f16068p.mo10952a(false, i2, str);
                        C6025ce.this.f16000K.mo14297a(i2, str, j, C6025ce.this.f15996G, C6025ce.this.f16055c);
                        if (TextUtils.isEmpty(str2) || i == 0) {
                            C6047cj.m13210a(Toast.makeText(C6025ce.this.getContext(), R.string.ega, 0));
                            C6025ce.this.mo12033a(C6042a.ENTER_FAILED);
                        } else if ((TextUtils.isEmpty(str) || !str.contains("30005")) && i != 30005) {
                            C6047cj.m13210a(Toast.makeText(C6025ce.this.getContext(), str2, 0));
                            C6025ce.this.f16004O = false;
                            C6025ce.this.mo12033a(C6042a.ENTER_FAILED);
                        } else if (C6025ce.this.f16078z == null || !C6025ce.this.f16078z.isShowing()) {
                            C5070h hVar = C6025ce.this.f16068p;
                            HashMap hashMap = new HashMap();
                            hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
                            hashMap.put("event_type", "show");
                            hashMap.put("event_page", "live_detail");
                            hashMap.put("event_module", "popup");
                            hashMap.put("live_type", hVar.f13623y);
                            hashMap.put("request_id", hVar.f13604f);
                            hashMap.put("log_pb", hVar.f13605g);
                            C8049c.m15979a().mo14202a("crash_popup_show", hashMap, new Object[0]);
                            C6025ce.this.f16078z = new C8552a(C6025ce.this.getContext()).mo14996a(false).mo15008c((int) R.string.eoj).mo15003b(0, (int) R.string.eoi, (OnClickListener) new OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    if (C6025ce.this.f16069q != null) {
                                        C9381g gVar = C6025ce.this.f16069q.f13545a;
                                        ((RoomRetrofitApi) C4514j.m10883j().mo10321b().mo9550a(RoomRetrofitApi.class)).finishRoomAbnormal().mo6513a((C1673aa<? super T, ? extends R>) C4064k.m10182a()).mo6505a((C1710e<? super T>) new C5032x<Object>(gVar), (C1710e<? super Throwable>) new C5033y<Object>(gVar));
                                    }
                                    if (C6025ce.this.f16068p != null) {
                                        C5070h hVar = C6025ce.this.f16068p;
                                        HashMap hashMap = new HashMap();
                                        hashMap.put("event_belong", CustomActionPushReceiver.f104061f);
                                        hashMap.put("event_type", "click");
                                        hashMap.put("event_page", "live_detail");
                                        hashMap.put("event_module", "popup");
                                        hashMap.put("live_type", hVar.f13623y);
                                        hashMap.put("request_id", hVar.f13604f);
                                        hashMap.put("log_pb", hVar.f13605g);
                                        C8049c.m15979a().mo14202a("crash_popup_click_over", hashMap, new Object[0]);
                                    }
                                }
                            }).mo15003b(1, (int) R.string.f26, (OnClickListener) new OnClickListener() {
                                public final void onClick(DialogInterface dialogInterface, int i) {
                                    dialogInterface.dismiss();
                                    C6025ce.this.mo12033a(C6042a.ENTER_FAILED);
                                }
                            }).mo15001b();
                            C6025ce.this.f16078z.show();
                        }
                    } else {
                        C8049c.m15979a().mo14203a("rd_enter_room_live_end", C8059j.class, Room.class);
                        C6025ce.this.mo12063r();
                        C6025ce.this.mo12069x();
                    }
                }
            }, j, this.f15994B, this.f16068p.f13617s, this.f16068p.f13607i, this.f16068p.f13620v, str);
            this.f16069q = eVar;
            this.f16069q.mo10938a();
            this.f16001L.mo10896b("apiDuration");
            this.f16001L.mo10893a("n_time_api_start");
            f15992S.booleanValue();
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        KVData kVData = (KVData) obj;
        if (mo8452l() && kVData != null && kVData.getKey() != null && kVData.getData() != null) {
            String key = kVData.getKey();
            char c = 65535;
            int hashCode = key.hashCode();
            if (hashCode != -1540323875) {
                if (hashCode == -1180299966 && key.equals("cmd_interact_state_change")) {
                    c = 0;
                }
            } else if (key.equals("cmd_pk_state_change")) {
                c = 1;
            }
            switch (c) {
                case 0:
                    m13133a((C5202u) kVData.getData());
                    return;
                case 1:
                    C5200s sVar = (C5200s) kVData.getData();
                    if (mo8452l() && this.f16070r != null) {
                        if (sVar.f13914a == 0) {
                            this.f16070r.setAnchorInteractMode(true);
                            this.f16028aa = true;
                        } else if (sVar.f13914a == 1) {
                            this.f16070r.setAnchorInteractMode(false);
                            this.f16028aa = false;
                        }
                        int[] iArr = new int[2];
                        this.f16070r.getVideoSize(iArr);
                        if (!(iArr[0] == 0 || iArr[1] == 0)) {
                            mo12030a(iArr[0], iArr[1], C9432q.m18670a(getContext()));
                            break;
                        }
                    } else {
                        return;
                    }
                    break;
            }
        }
    }

    public final void onConfigurationChanged(Configuration configuration) {
        boolean z;
        boolean z2;
        super.onConfigurationChanged(configuration);
        int requestedOrientation = getActivity().getRequestedOrientation();
        if ((requestedOrientation == 0 || requestedOrientation == 1) && requestedOrientation != this.f16064l) {
            z = true;
        } else {
            z = false;
        }
        if (z && this.f16033af) {
            this.f16064l = requestedOrientation;
        }
        int[] iArr = new int[2];
        if (this.f16070r != null) {
            C2831a aVar = this.f16070r;
            if (requestedOrientation == 1) {
                z2 = true;
            } else {
                z2 = false;
            }
            aVar.setScreenOrientation(z2);
            this.f16070r.getVideoSize(iArr);
        }
        if (iArr[0] > 0 && iArr[1] > 0) {
            mo12030a(iArr[0], iArr[1], (int) C9432q.m18687b(getContext(), (float) configuration.screenWidthDp));
        }
        this.f16065m.lambda$put$1$DataCenter("cmd_video_orientation_changed", new C5177aw(this.f16061i, this.f16066n));
        if (this.f16033af) {
            if (z) {
                this.f16033af = false;
                if (this.f16071s != null) {
                    m13139b(this.f16069q.f13548d.f15110a);
                }
                C5067f fVar = this.f16031ad;
                fVar.f13562d = this.f16064l;
                fVar.mo10942a();
            }
            super.onConfigurationChanged(configuration);
        }
    }

    public final void onEvent(C5197p pVar) {
        C8064d.m16005b();
        C8064d.m9719a("ttlive_room", "received JumpToOtherRoomEvent");
        if (pVar.f13908a != this.f16015a) {
            long j = pVar.f13910c.getLong("live.intent.extra.FROM_PORTAL_ID");
            if (j > 0) {
                C8064d.m16005b();
                StringBuilder sb = new StringBuilder("preparing jump bundle, portalId=");
                sb.append(j);
                sb.append(" originatingRoomId=");
                sb.append(this.f16015a);
                C8064d.m9719a("ttlive_portal", sb.toString());
                pVar.f13910c.putInt("back_source", 4);
                C8123a.m16197b(this.f16065m, pVar.f13910c);
                pVar.f13910c.putLong("live.intent.extra.ORIGINATING_ROOM_ID", this.f16015a);
            }
            if (this.f16067o == C8671u.LIVE_STARTED) {
                C6046ci ciVar = new C6046ci(this, pVar);
                if (!this.f16077y.mo11910a((Runnable) ciVar, true)) {
                    ciVar.run();
                }
                return;
            }
            mo12033a(C6042a.JUMP_TO_OTHER);
            if (mo12066u() != null) {
                mo12066u().mo12861a(pVar.f13908a, pVar.f13909b, pVar.f13910c, pVar.f13911d);
            }
        }
    }

    public final void onSaveInstanceState(Bundle bundle) {
        boolean z;
        Serializable serializable;
        bundle.putAll(getArguments());
        bundle.putInt("live.SCREEN_ORIENTATION", this.f16064l);
        String str = "enter_from_dou_plus";
        boolean z2 = true;
        if (this.f16065m == null || !((Boolean) this.f16065m.get("enter_from_dou_plus", Boolean.valueOf(false))).booleanValue()) {
            z = false;
        } else {
            z = true;
        }
        bundle.putBoolean(str, z);
        String str2 = "live_douplus_log_extra";
        Serializable serializable2 = null;
        if (this.f16065m == null) {
            serializable = null;
        } else {
            serializable = (Serializable) this.f16065m.get("live_douplus_log_extra", new HashMap());
        }
        bundle.putSerializable(str2, serializable);
        String str3 = "enter_from_effect_ad";
        if (this.f16065m == null || !((Boolean) this.f16065m.get("enter_from_effect_ad", Boolean.valueOf(false))).booleanValue()) {
            z2 = false;
        }
        bundle.putBoolean(str3, z2);
        String str4 = "live_effect_ad_log_extra_map";
        if (this.f16065m != null) {
            serializable2 = (Serializable) this.f16065m.get("live_effect_ad_log_extra_map", new HashMap());
        }
        bundle.putSerializable(str4, serializable2);
        super.onSaveInstanceState(bundle);
    }

    /* renamed from: b */
    private void m13139b(Room room) {
        C5957b bVar;
        room.setRequestId(this.f15994B);
        room.setLog_pb(this.f15995F);
        room.setUserFrom(this.f16048au);
        if (this.f16077y == null) {
            C0654k childFragmentManager = getChildFragmentManager();
            boolean z = true;
            if (this.f16064l == 1) {
                bVar = new C6156eq();
            } else {
                bVar = new C5949ax();
            }
            this.f16077y = bVar;
            this.f16077y.setArguments(getArguments());
            this.f16065m.lambda$put$1$DataCenter("data_room", room);
            this.f16065m.lambda$put$1$DataCenter("data_room_logger", this.f16068p);
            this.f16077y.mo9585a(this.f16065m, false, (C4185a) new C4185a() {
                /* renamed from: a */
                public final void mo9597a(int i) {
                    if (C6025ce.this.f16067o == C8671u.LIVE_STARTED) {
                        if (i == 3) {
                            C6025ce.this.f16072t = true;
                            return;
                        }
                        if (i == 2) {
                            C6025ce.this.f16072t = false;
                        }
                    }
                }

                /* renamed from: a */
                public final void mo8464a(C7861cb cbVar) {
                    if (cbVar != null && C6025ce.this.f16067o == C8671u.LIVE_STARTED) {
                        C6025ce.this.mo12034a(cbVar);
                    }
                }
            }, this.f16069q.f13548d.f15111b);
            this.f16077y.f15814w = this.f16068p;
            this.f16077y.mo9584a(this.f16056d);
            if (this.f16077y instanceof C6156eq) {
                ((C6156eq) this.f16077y).f16516W = this.f16022aG;
            }
            if (this.f16070r == null || !this.f16070r.isVideoHorizontal()) {
                z = false;
            }
            this.f16061i = z;
            this.f16065m.lambda$put$1$DataCenter("cmd_video_orientation_changed", new C5177aw(this.f16061i, this.f16066n));
            childFragmentManager.mo2225a().mo2176a(R.id.ajf, this.f16077y, "AbsInteractionFragment").mo2195c();
            this.f16077y.getLifecycle().mo324a(new LivePlayFragment$9(this));
            this.f16077y.mo9586a((Runnable) new C6044cg(this, room));
        }
    }

    public final void onEvent(C5204w wVar) {
        int i = wVar.f13924a;
        if (i == 7) {
            mo12033a(C6042a.ROOM_PLAY_FINISHED);
        } else if (i == 11) {
            mo12033a(C6042a.USER_KICK_OUT);
        } else if (i == 20) {
            mo12033a(C6042a.WATCHER_KIT_OUT);
        } else if (i == 32) {
            m13146d(false);
        } else if (i == 35) {
            mo12033a(C6042a.ENTER_FAILED);
        }
        if (isResumed()) {
            int i2 = wVar.f13924a;
            if (!(i2 == 8 || i2 == 17)) {
                switch (i2) {
                    case 5:
                    case 6:
                        break;
                }
            }
            if (getUserVisibleHint()) {
                if (this.f16064l == 1) {
                    mo12062q();
                } else {
                    onEvent(new C8745a(1));
                }
                if (this.f16067o == C8671u.LIVE_STARTED) {
                    int i3 = wVar.f13924a;
                    if (i3 == 10 || i3 == 24) {
                        mo12061p();
                        return;
                    }
                    if (i3 != 26) {
                        if (i3 != 33) {
                            switch (i3) {
                                case 30:
                                    float a = ((float) C9432q.m18670a(getContext())) / ((float) C9432q.m18688b(getContext()));
                                    if (C9414h.m18631b(this.f16008T)) {
                                        C5213c.m11821a(this.f16036ai, new ImageModel(null, this.f16008T), (C14234d) new C4620v(5, a, null));
                                    } else {
                                        StringBuilder sb = new StringBuilder("res://");
                                        sb.append(getContext().getPackageName());
                                        sb.append("/2131956147");
                                        C5213c.m11823a(this.f16036ai, sb.toString(), (C14234d) new C4620v(5, a, null));
                                    }
                                    m13142c("anchor leave");
                                    return;
                                case 31:
                                    mo12037a("anchor back");
                                    return;
                            }
                        } else {
                            m13146d(true);
                        }
                    } else if (!(mo12066u() == null || !mo12066u().mo12868a(wVar.f13925b) || getView() == null)) {
                        getView().getParent().requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        }
    }

    public final void onEvent(C8745a aVar) {
        View view;
        if (this.f16077y != null) {
            if (aVar.f24023b != 2) {
                if (aVar.f24023b == 1) {
                    FragmentActivity activity = getActivity();
                    if (!(activity == null || activity.getWindow() == null || !C3894h.m9842a(activity))) {
                        activity.getWindow().clearFlags(PreloadTask.BYTE_UNIT_NUMBER);
                    }
                    if (aVar.f24022a.equals("login")) {
                        C4525b.f12360ac.mo10346a("");
                    }
                    if (mo8452l() && this.f16064l != 1) {
                        m13126D();
                        if (activity != null) {
                            activity.setRequestedOrientation(1);
                        }
                        this.f16033af = true;
                    }
                }
            } else if (mo8452l() && this.f16064l != 0) {
                FragmentActivity activity2 = getActivity();
                if (!(this.f16077y == null || activity2 == null || activity2.getWindow() == null || mo12068w().mo12874e() == null)) {
                    C8666p e = mo12068w().mo12874e();
                    View view2 = this.f16077y.getView();
                    View view3 = this.f16077y.f15800i;
                    if (this.f16077y == null) {
                        view = null;
                    } else {
                        view = this.f16077y.f15801j;
                    }
                    e.mo12893a(false, view2, view3, view, this.f16077y.mo11918h());
                }
                m13126D();
                if (activity2 != null) {
                    activity2.setRequestedOrientation(0);
                }
                this.f16033af = true;
            }
        }
    }

    /* renamed from: a */
    public final void mo12029a(int i) {
        if (this.f16077y != null) {
            C5957b bVar = this.f16077y;
            if (bVar.f15695F != null) {
                LiveRoomUserInfoWidget liveRoomUserInfoWidget = bVar.f15695F;
                if (liveRoomUserInfoWidget.f18088l != null && !liveRoomUserInfoWidget.f18088l.isFinishing() && liveRoomUserInfoWidget.f18095s != null && liveRoomUserInfoWidget.f18095s.mo14577e()) {
                    liveRoomUserInfoWidget.f18095s.dismiss();
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo12042b(String str) {
        C8038g a = C8049c.m15979a().mo14201a(C8059j.class);
        if (a != null && a.mo14192a() != null && a.mo14192a().get("enter_method") != null && TextUtils.equals(a.mo14192a().get("enter_method").toString(), "push")) {
            Fragment parentFragment = getParentFragment();
            String str2 = "";
            if (!(parentFragment == null || parentFragment.getArguments() == null)) {
                str2 = parentFragment.getArguments().getString("livesdk_live_push_status", "");
            }
            C8049c.m15979a().mo14202a("livesdk_push_error", C8066a.m16007a().mo14221a("anchor_id", String.valueOf(this.f16054b)).mo14221a("anchor_status", str).mo14221a("room_id", String.valueOf(this.f16015a)).mo14221a("push_lookup_status", str2).f22045a, new Object[0]);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:108:0x0401, code lost:
        if (com.bytedance.common.utility.C9431p.m18664a(r9) != false) goto L_0x040f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void onCreate(android.os.Bundle r28) {
        /*
            r27 = this;
            r0 = r27
            r1 = r28
            java.util.HashMap r2 = new java.util.HashMap
            r2.<init>()
            r0.f15998I = r2
            long r2 = java.lang.System.currentTimeMillis()
            r0.f15999J = r2
            super.onCreate(r28)
            android.arch.lifecycle.y r2 = android.arch.lifecycle.C0214z.m438a(r27)
            com.bytedance.ies.sdk.widgets.DataCenter r2 = com.bytedance.ies.sdk.widgets.DataCenter.create(r2, r0)
            r0.f16065m = r2
            android.os.Bundle r2 = r27.getArguments()
            if (r2 != 0) goto L_0x0029
            android.os.Bundle r2 = new android.os.Bundle
            r2.<init>()
        L_0x0029:
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r0.f16065m
            java.lang.String r4 = "is_embedded_live_room"
            java.lang.String r5 = "live.intent.extra.EXTRA_IS_EMBEDDED_LIVE_ROOM"
            boolean r5 = r2.getBoolean(r5)
            java.lang.Boolean r5 = java.lang.Boolean.valueOf(r5)
            r3.lambda$put$1$DataCenter(r4, r5)
            java.lang.String r3 = "live.intent.extra.FROM_PORTAL_ID"
            long r3 = r2.getLong(r3)
            r5 = 0
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0067
            com.bytedance.ies.sdk.widgets.DataCenter r7 = r0.f16065m
            java.lang.String r8 = "data_from_portal_id"
            java.lang.Long r9 = java.lang.Long.valueOf(r3)
            r7.lambda$put$1$DataCenter(r8, r9)
            com.bytedance.android.livesdk.p399o.C8064d.m16005b()
            java.lang.String r7 = "ttlive_portal"
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r9 = "entering target room, portalId="
            r8.<init>(r9)
            r8.append(r3)
            java.lang.String r3 = r8.toString()
            com.bytedance.android.livesdk.p399o.C8064d.m9719a(r7, r3)
        L_0x0067:
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r0.f16065m
            java.lang.String r4 = "interaction_layer_margin_top"
            java.lang.String r7 = "live.intent.extra.EXTRA_INTERACTION_LAYER_MARGIN_TOP"
            r8 = 0
            int r7 = r2.getInt(r7, r8)
            java.lang.Integer r7 = java.lang.Integer.valueOf(r7)
            r3.lambda$put$1$DataCenter(r4, r7)
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r0.f16065m
            com.bytedance.android.livesdk.p279af.C4600j.m11038a(r3, r2)
            com.bytedance.ies.sdk.widgets.DataCenter r3 = r0.f16065m
            com.bytedance.android.livesdk.p279af.C4600j.m11039b(r3, r2)
            java.lang.String r3 = "live.intent.extra.ROOM_ID"
            long r3 = r2.getLong(r3, r5)
            int r7 = (r3 > r5 ? 1 : (r3 == r5 ? 0 : -1))
            if (r7 <= 0) goto L_0x0096
            java.lang.String r3 = "live.intent.extra.ROOM_ID"
            long r3 = r2.getLong(r3)
            r0.f16015a = r3
            goto L_0x00b2
        L_0x0096:
            java.lang.String r3 = "live.intent.extra.ROOM_ID"
            java.lang.String r4 = ""
            java.lang.String r3 = r2.getString(r3, r4)
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x00b2
            java.lang.String r3 = "live.intent.extra.ROOM_ID"
            java.lang.String r3 = r2.getString(r3)     // Catch:{ Exception -> 0x00b1 }
            long r3 = java.lang.Long.parseLong(r3)     // Catch:{ Exception -> 0x00b1 }
            r0.f16015a = r3     // Catch:{ Exception -> 0x00b1 }
            goto L_0x00b2
        L_0x00b1:
        L_0x00b2:
            java.lang.String r3 = "live.intent.extra.USER_ID"
            long r3 = r2.getLong(r3, r5)
            r0.f16054b = r3
            java.lang.String r3 = "live.intent.extra.SCREEN_ORIENTATION"
            r4 = 1
            int r3 = r2.getInt(r3, r4)
            r0.f16064l = r3
            long r9 = r0.f16015a
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x010f
            long r9 = r0.f16054b
            int r3 = (r9 > r5 ? 1 : (r9 == r5 ? 0 : -1))
            if (r3 > 0) goto L_0x010f
            if (r1 == 0) goto L_0x010f
            java.lang.String r2 = "live.intent.extra.ROOM_ID"
            boolean r2 = r1.containsKey(r2)
            if (r2 == 0) goto L_0x00eb
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r0.f16065m
            com.bytedance.android.livesdk.p279af.C4600j.m11038a(r2, r1)
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r0.f16065m
            com.bytedance.android.livesdk.p279af.C4600j.m11039b(r2, r1)
            java.lang.String r2 = "live.intent.extra.ROOM_ID"
            long r2 = r1.getLong(r2, r5)
            r0.f16015a = r2
        L_0x00eb:
            java.lang.String r2 = "live.intent.extra.USER_ID"
            boolean r2 = r1.containsKey(r2)
            if (r2 == 0) goto L_0x00fb
            java.lang.String r2 = "live.intent.extra.USER_ID"
            long r2 = r1.getLong(r2, r5)
            r0.f16054b = r2
        L_0x00fb:
            java.lang.String r2 = "live.SCREEN_ORIENTATION"
            boolean r2 = r1.containsKey(r2)
            if (r2 == 0) goto L_0x010b
            java.lang.String r2 = "live.SCREEN_ORIENTATION"
            int r2 = r1.getInt(r2)
            r0.f16064l = r2
        L_0x010b:
            r27.setArguments(r28)
            goto L_0x0110
        L_0x010f:
            r1 = r2
        L_0x0110:
            java.lang.String r2 = "live.intent.extra.BG_URLS"
            java.util.ArrayList r2 = r1.getStringArrayList(r2)
            r0.f16008T = r2
            java.lang.String r2 = "live.intent.extra.PULL_STREAM_URL"
            java.lang.String r2 = r1.getString(r2)
            r0.f16055c = r2
            java.lang.String r2 = "live.intent.extra.PULL_SDK_PARAMS"
            java.lang.String r2 = r1.getString(r2)
            r0.f16009U = r2
            java.lang.String r2 = "live.intent.extra.PULL_STREAM_DATA"
            java.lang.String r2 = r1.getString(r2)
            r0.f16010V = r2
            java.lang.String r2 = "live.intent.extra.PULL_DEFAULT_RESOLUTION"
            java.lang.String r2 = r1.getString(r2)
            r0.f16011W = r2
            java.lang.String r2 = "live.intent.extra.STREAM_TYPE"
            int r2 = r1.getInt(r2, r8)
            com.bytedance.android.livesdkapi.depend.model.live.m r2 = com.bytedance.android.livesdkapi.depend.model.live.C8710m.valueOf(r2)
            r0.f16056d = r2
            java.lang.String r2 = "live.intent.extra.EXTRA_STREAM_SR_ENABLED"
            boolean r2 = r1.getBoolean(r2, r8)
            java.lang.String r3 = "live.intent.extra.EXTRA_STREAM_SR_ANTI_ALIAS"
            boolean r3 = r1.getBoolean(r3, r8)
            java.lang.String r7 = "live.intent.extra.EXTRA_STREAM_SR_STRENGTH"
            int r7 = r1.getInt(r7, r8)
            com.bytedance.android.livesdkapi.depend.model.live.y$a r9 = new com.bytedance.android.livesdkapi.depend.model.live.y$a
            r9.<init>(r2, r3, r7)
            r0.f16012X = r9
            java.lang.String r2 = "live.intent.extra.IS_THIRD_PARTY"
            boolean r13 = r1.getBoolean(r2, r8)
            java.lang.String r2 = "from_notification"
            boolean r2 = r1.getBoolean(r2, r8)
            if (r2 == 0) goto L_0x0173
            long r2 = r0.f16054b
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0173
            r0.f16015a = r5
        L_0x0173:
            long r2 = r0.f16015a
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 != 0) goto L_0x017f
            long r2 = r0.f16054b
            int r7 = (r2 > r5 ? 1 : (r2 == r5 ? 0 : -1))
            if (r7 == 0) goto L_0x0183
        L_0x017f:
            com.bytedance.android.livesdkapi.depend.live.u r2 = com.bytedance.android.livesdkapi.depend.live.C8671u.INITIALIZED
            r0.f16067o = r2
        L_0x0183:
            r0.f16005P = r8
            java.lang.String r2 = r0.f16055c
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r2 = r2 ^ r4
            r0.f16023aH = r2
            java.lang.String r2 = r0.f16010V
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            r2 = r2 ^ r4
            r0.f16003N = r2
            java.lang.String r2 = "live.intent.extra.REQUEST_ID"
            r3 = 0
            java.lang.String r2 = r1.getString(r2, r3)
            r0.f15994B = r2
            java.lang.String r2 = "live.intent.extra.LOG_PB"
            java.lang.String r2 = r1.getString(r2, r3)
            r0.f15995F = r2
            java.lang.String r2 = "live.intent.extra.USER_FROM"
            long r9 = r1.getLong(r2, r5)
            r0.f16048au = r9
            java.lang.String r2 = "live.intent.extra.SOURCE_EXTRA"
            java.lang.String r2 = r1.getString(r2)
            r0.f16049av = r2
            java.lang.String r2 = "scene_id"
            java.lang.String r2 = r1.getString(r2)
            java.lang.String r7 = "enter_from_merge"
            java.lang.String r7 = r1.getString(r7)
            java.lang.String r9 = "enter_method"
            java.lang.String r26 = r1.getString(r9)
            java.lang.String r9 = "top_message_type"
            java.lang.String r10 = ""
            r1.getString(r9, r10)
            java.lang.String r9 = "live.intent.extra.ROOM_LABELS"
            java.lang.String r20 = r1.getString(r9, r3)
            java.lang.String r3 = "live.intent.extra.ENTER_LIVE_SOURCE"
            java.lang.String r9 = ""
            java.lang.String r21 = r1.getString(r3, r9)
            java.lang.String r3 = "live.intent.extra.ENTER_LIVE_EXTRA"
            android.os.Bundle r3 = r1.getBundle(r3)
            java.lang.String r9 = "live.intent.extra.PRIVATE_INFO"
            java.lang.String r24 = r1.getString(r9)
            java.lang.String r9 = "enter_from_merge_recommend"
            java.lang.String r9 = r1.getString(r9)
            if (r3 == 0) goto L_0x0288
            java.lang.String r10 = "live.intent.extra.OPEN_GIFT_PANEL"
            boolean r10 = r3.getBoolean(r10)
            r0.f16057e = r10
            java.lang.String r10 = "live.intent.extra.OPEN_GIFT_PANEL"
            r3.remove(r10)
            java.lang.String r10 = "live.intent.extra.OPEN_PROP_PANEL"
            boolean r10 = r3.getBoolean(r10)
            r0.f16059g = r10
            java.lang.String r10 = "live.intent.extra.OPEN_PROP_PANEL"
            r3.remove(r10)
            java.lang.String r10 = "pop_type"
            java.lang.String r10 = r3.getString(r10)
            r0.f16058f = r10
            java.lang.String r10 = "pop_type"
            r3.remove(r10)
            java.lang.String r10 = "live.intent.extra.OPEN_PICK_PROFILE_PANEL"
            boolean r10 = r3.getBoolean(r10)
            r0.f16013Y = r10
            java.lang.String r10 = "live.intent.extra.OPEN_PICK_TOP"
            boolean r10 = r3.getBoolean(r10)
            r0.f16014Z = r10
            java.lang.String r10 = "live.intent.extra.OPEN_PICK_PROFILE_PANEL"
            r3.remove(r10)
            java.lang.String r10 = "live.intent.extra.OPEN_PICK_TOP"
            r3.remove(r10)
            java.lang.String r10 = r0.f15994B
            if (r10 != 0) goto L_0x024a
            java.lang.String r10 = "live.intent.extra.REQUEST_ID"
            boolean r10 = r3.containsKey(r10)
            if (r10 == 0) goto L_0x024a
            java.lang.String r10 = "live.intent.extra.REQUEST_ID"
            java.lang.String r11 = ""
            java.lang.String r10 = r3.getString(r10, r11)
            r0.f15994B = r10
        L_0x024a:
            java.lang.String r10 = r0.f15995F
            if (r10 != 0) goto L_0x0260
            java.lang.String r10 = "live.intent.extra.LOG_PB"
            boolean r10 = r3.containsKey(r10)
            if (r10 == 0) goto L_0x0260
            java.lang.String r10 = "live.intent.extra.LOG_PB"
            java.lang.String r11 = ""
            java.lang.String r10 = r3.getString(r10, r11)
            r0.f15995F = r10
        L_0x0260:
            long r10 = r0.f16048au
            int r12 = (r10 > r5 ? 1 : (r10 == r5 ? 0 : -1))
            if (r12 != 0) goto L_0x0276
            java.lang.String r10 = "live.intent.extra.USER_FROM"
            boolean r10 = r3.containsKey(r10)
            if (r10 == 0) goto L_0x0276
            java.lang.String r10 = "live.intent.extra.USER_FROM"
            long r5 = r3.getLong(r10, r5)
            r0.f16048au = r5
        L_0x0276:
            if (r9 != 0) goto L_0x0288
            java.lang.String r5 = "enter_from_merge_recommend"
            boolean r5 = r3.containsKey(r5)
            if (r5 == 0) goto L_0x0288
            java.lang.String r5 = "enter_from_merge_recommend"
            java.lang.String r6 = ""
            java.lang.String r9 = r3.getString(r5, r6)
        L_0x0288:
            r5 = r9
            java.lang.String r6 = r0.f15995F
            java.lang.String r9 = r0.f15994B
            r0.m13136a(r6, r9, r3)
            java.lang.String r6 = "live.intent.extra.BACK_PRE_ROOM_EXTRA"
            android.os.Bundle r23 = r1.getBundle(r6)
            com.bytedance.android.livesdk.chatroom.detail.h r1 = new com.bytedance.android.livesdk.chatroom.detail.h
            android.content.Context r15 = r27.getContext()
            java.lang.String r6 = r0.f15994B
            java.lang.String r9 = r0.f15995F
            long r10 = r0.f16048au
            r14 = r1
            r16 = r6
            r17 = r9
            r18 = r10
            r22 = r3
            r25 = r7
            r14.<init>(r15, r16, r17, r18, r20, r21, r22, r23, r24, r25, r26)
            r0.f16068p = r1
            com.bytedance.android.livesdk.chatroom.detail.h r9 = r0.f16068p
            long r10 = r0.f16015a
            com.bytedance.android.livesdkapi.depend.model.live.m r1 = r0.f16056d
            com.bytedance.android.livesdkapi.depend.model.live.m r3 = com.bytedance.android.livesdkapi.depend.model.live.C8710m.AUDIO
            if (r1 != r3) goto L_0x02be
            r12 = 1
            goto L_0x02bf
        L_0x02be:
            r12 = 0
        L_0x02bf:
            long r14 = r0.f16054b
            r16 = 0
            r9.mo10951a(r10, r12, r13, r14, r16)
            com.bytedance.android.livesdk.chatroom.detail.h r1 = r0.f16068p
            java.lang.String r3 = r0.f16049av
            r1.f13574B = r3
            com.bytedance.android.livesdk.chatroom.detail.h r1 = r0.f16068p
            r1.f13577E = r2
            com.bytedance.android.livesdk.chatroom.detail.h r1 = r0.f16068p
            r1.f13579G = r5
            com.bytedance.android.livesdk.player.r r1 = new com.bytedance.android.livesdk.player.r
            r1.<init>()
            r0.f16000K = r1
            com.bytedance.android.livesdk.chatroom.c.c r1 = new com.bytedance.android.livesdk.chatroom.c.c
            r1.<init>()
            r0.f16001L = r1
            com.bytedance.android.livesdk.chatroom.detail.i r1 = new com.bytedance.android.livesdk.chatroom.detail.i
            r1.<init>()
            r0.f16002M = r1
            com.bytedance.android.livesdk.chatroom.f.x r1 = new com.bytedance.android.livesdk.chatroom.f.x
            r1.<init>()
            r0.f16032ae = r1
            java.lang.Boolean r1 = f15992S
            r1.booleanValue()
            com.bytedance.android.livesdk.ad.c<java.lang.String> r1 = com.bytedance.android.livesdk.p272ad.C4525b.f12360ac
            java.lang.String r2 = ""
            r1.mo10346a(r2)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f15998I
            java.lang.String r2 = "time"
            long r5 = java.lang.System.currentTimeMillis()
            long r9 = r0.f15999J
            long r5 = r5 - r9
            java.lang.String r3 = java.lang.String.valueOf(r5)
            r1.put(r2, r3)
            java.util.HashMap<java.lang.String, java.lang.String> r1 = r0.f15998I
            java.lang.String r2 = "location"
            java.lang.String r3 = "finish live play oncreate"
            r1.put(r2, r3)
            com.bytedance.android.livesdk.ab.e r1 = com.bytedance.android.livesdk.TTLiveSDKContext.getHostService()
            com.bytedance.android.livesdkapi.host.e r1 = r1.mo10311d()
            java.lang.String r2 = "feed_enter_room"
            java.util.HashMap<java.lang.String, java.lang.String> r3 = r0.f15998I
            r1.mo15567a(r2, r3)
            android.os.Bundle r1 = r27.getArguments()
            com.bytedance.ies.sdk.widgets.DataCenter r2 = r0.f16065m
            if (r1 == 0) goto L_0x0427
            if (r2 != 0) goto L_0x0332
            goto L_0x0427
        L_0x0332:
            java.lang.String r3 = "live.intent.extra.ENTER_LIVE_EXTRA"
            android.os.Bundle r3 = r1.getBundle(r3)
            java.lang.String r5 = "live.intent.extra.FROM_NEW_STYLE"
            boolean r5 = r1.getBoolean(r5, r8)
            if (r5 != 0) goto L_0x034c
            if (r3 == 0) goto L_0x034b
            java.lang.String r5 = "live.intent.extra.FROM_NEW_STYLE"
            boolean r5 = r3.getBoolean(r5, r8)
            if (r5 == 0) goto L_0x034b
            goto L_0x034c
        L_0x034b:
            r4 = 0
        L_0x034c:
            java.lang.String r5 = "enter_from_live_source"
            java.lang.String r5 = r1.getString(r5)
            if (r4 == 0) goto L_0x0427
            java.lang.String r6 = "data_room"
            java.lang.Object r6 = r2.get(r6)
            com.bytedance.android.livesdkapi.depend.model.live.Room r6 = (com.bytedance.android.livesdkapi.depend.model.live.Room) r6
            if (r6 == 0) goto L_0x0365
            boolean r6 = r6.isOfficial()
            if (r6 == 0) goto L_0x0365
            r4 = 0
        L_0x0365:
            java.lang.String r6 = com.bytedance.android.livesdk.chatroom.p310f.C5234s.m11851b(r1)
            java.lang.String r8 = "live.intent.extra.FROM_NEW_STYLE_SOURCE"
            r1.putString(r8, r6)
            java.lang.String r8 = "live.intent.extra.FROM_NEW_STYLE"
            r1.putBoolean(r8, r4)
            java.lang.String r8 = "enter_from_live_source"
            r1.putString(r8, r5)
            if (r3 == 0) goto L_0x0389
            java.lang.String r8 = "live.intent.extra.FROM_NEW_STYLE"
            r3.putBoolean(r8, r4)
            java.lang.String r8 = "live.intent.extra.FROM_NEW_STYLE_SOURCE"
            r3.putString(r8, r6)
            java.lang.String r8 = "enter_from_live_source"
            r3.putString(r8, r5)
        L_0x0389:
            java.lang.String r8 = "live.intent.extra.FEED_URL"
            java.lang.String r9 = ""
            java.lang.String r8 = r1.getString(r8, r9)
            boolean r9 = com.bytedance.common.utility.C9431p.m18664a(r8)
            if (r9 == 0) goto L_0x0403
            if (r3 == 0) goto L_0x03a2
            java.lang.String r8 = "live.intent.extra.FEED_URL"
            java.lang.String r9 = ""
            java.lang.String r8 = r3.getString(r8, r9)
            goto L_0x03a4
        L_0x03a2:
            java.lang.String r8 = ""
        L_0x03a4:
            boolean r9 = com.bytedance.common.utility.C9431p.m18664a(r8)
            if (r9 == 0) goto L_0x0403
            if (r1 == 0) goto L_0x03fb
            java.lang.String r9 = "push"
            java.lang.String r10 = "enter_from_merge"
            java.lang.String r10 = r1.getString(r10)
            boolean r9 = r9.equals(r10)
            if (r9 != 0) goto L_0x03c8
            java.lang.String r9 = "push"
            java.lang.String r10 = "enter_method"
            java.lang.String r10 = r1.getString(r10)
            boolean r9 = r9.equals(r10)
            if (r9 == 0) goto L_0x03fb
        L_0x03c8:
            com.bytedance.android.livesdkapi.service.d r9 = com.bytedance.android.livesdkapi.C8830k.m17331e()
            if (r9 == 0) goto L_0x03fb
            com.bytedance.android.livesdkapi.service.d r9 = com.bytedance.android.livesdkapi.C8830k.m17331e()
            com.bytedance.android.livesdkapi.host.b r9 = r9.mo13055q()
            if (r9 == 0) goto L_0x03fb
            com.bytedance.android.livesdkapi.service.d r9 = com.bytedance.android.livesdkapi.C8830k.m17331e()
            com.bytedance.android.livesdkapi.host.b r9 = r9.mo13055q()
            r10 = -1
            java.util.Map r9 = r9.mo13238a(r10)
            if (r9 == 0) goto L_0x03fb
            java.lang.String r10 = "feed_url"
            java.lang.Object r10 = r9.get(r10)
            boolean r10 = r10 instanceof java.lang.String
            if (r10 == 0) goto L_0x03fb
            java.lang.String r10 = "feed_url"
            java.lang.Object r9 = r9.get(r10)
            java.lang.String r9 = (java.lang.String) r9
            goto L_0x03fd
        L_0x03fb:
            java.lang.String r9 = ""
        L_0x03fd:
            boolean r9 = com.bytedance.common.utility.C9431p.m18664a(r9)
            if (r9 != 0) goto L_0x040f
        L_0x0403:
            java.lang.String r9 = "live.intent.extra.FEED_URL"
            r1.putString(r9, r8)
            if (r3 == 0) goto L_0x040f
            java.lang.String r1 = "live.intent.extra.FEED_URL"
            r3.putString(r1, r8)
        L_0x040f:
            java.lang.String r1 = "data_live_new_feed_style"
            java.lang.Boolean r3 = java.lang.Boolean.valueOf(r4)
            r2.lambda$put$1$DataCenter(r1, r3)
            java.lang.String r1 = "data_live_first_enter_source"
            r2.lambda$put$1$DataCenter(r1, r5)
            java.lang.String r1 = "data_live_new_feed_url"
            r2.lambda$put$1$DataCenter(r1, r8)
            java.lang.String r1 = "data_live_new_feed_style_from"
            r2.lambda$put$1$DataCenter(r1, r6)
        L_0x0427:
            android.os.Bundle r1 = r27.getArguments()
            boolean r1 = com.bytedance.android.livesdk.chatroom.p310f.C5234s.m11849a(r1)
            if (r1 == 0) goto L_0x044c
            com.bytedance.android.livesdk.chatroom.ui.ce$5 r1 = new com.bytedance.android.livesdk.chatroom.ui.ce$5
            r1.<init>()
            r0.f16046as = r1
            android.support.v4.widget.DrawerLayout$c r1 = r0.f16046as
            if (r1 == 0) goto L_0x044c
            java.util.List<android.support.v4.widget.DrawerLayout$c> r2 = com.bytedance.android.livesdk.drawerfeed.C6749b.f18442a
            if (r2 != 0) goto L_0x0447
            java.util.ArrayList r2 = new java.util.ArrayList
            r2.<init>()
            com.bytedance.android.livesdk.drawerfeed.C6749b.f18442a = r2
        L_0x0447:
            java.util.List<android.support.v4.widget.DrawerLayout$c> r2 = com.bytedance.android.livesdk.drawerfeed.C6749b.f18442a
            r2.add(r1)
        L_0x044c:
            com.bytedance.android.live.core.setting.p<java.lang.Boolean> r1 = com.bytedance.android.livesdk.config.LiveConfigSettingKeys.LIVE_TEST_ENABLE_ROOM_STREAM_TOAST
            java.lang.Object r1 = r1.mo9431a()
            java.lang.Boolean r1 = (java.lang.Boolean) r1
            if (r1 == 0) goto L_0x047d
            boolean r1 = r1.booleanValue()
            if (r1 == 0) goto L_0x047d
            java.lang.String r1 = r0.f16010V
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 == 0) goto L_0x046c
            java.lang.String r1 = r0.f16055c
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x047d
        L_0x046c:
            java.lang.StringBuilder r1 = new java.lang.StringBuilder
            java.lang.String r2 = "Stream FOUND. "
            r1.<init>(r2)
            r1.append(r7)
            java.lang.String r1 = r1.toString()
            com.bytedance.android.livesdk.p279af.C4575an.m10987a(r1)
        L_0x047d:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bytedance.android.livesdk.chatroom.p325ui.C6025ce.onCreate(android.os.Bundle):void");
    }

    /* renamed from: a */
    private void m13131a(int i, int i2) {
        if (this.f16021aF != null) {
            View findViewById = this.f16021aF.findViewById(R.id.dox);
            if (findViewById != null && findViewById.getVisibility() != i2) {
                findViewById.setVisibility(i2);
            }
        }
    }

    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.f16021aF = view;
        this.f16076x = (TextureView) view.findViewById(R.id.dqi);
        if (this.f16076x instanceof C8866c) {
            ((C8866c) this.f16076x).setScaleType(2);
        }
        this.f16036ai = (HSImageView) view.findViewById(R.id.bc5);
        this.f16037aj = (HSImageView) view.findViewById(R.id.ej9);
        this.f16038ak = (ViewGroup) view.findViewById(R.id.bdk);
        this.f16039al = (CircularProgressView) view.findViewById(R.id.bdi);
        this.f16040am = (LoadingAnimView) view.findViewById(R.id.bdl);
        this.f16040am.setColor(-1);
        this.f16041an = (TextView) view.findViewById(R.id.bdj);
        this.f16044aq = (ViewStub) view.findViewById(R.id.rk);
        this.f16042ao = (HSImageView) view.findViewById(R.id.c7v);
        this.f16043ap = view.findViewById(R.id.c7w);
        C8710m mVar = this.f16056d;
        List<String> list = this.f16008T;
        if (mVar == C8710m.AUDIO) {
            this.f16036ai.setBackgroundResource(R.drawable.bj5);
        } else if (C9414h.m18631b(this.f16008T)) {
            C5213c.m11821a(this.f16036ai, new ImageModel(null, list), (C14234d) new C4620v(5, ((float) C9432q.m18670a(getContext())) / ((float) C9432q.m18688b(getContext())), null));
        } else {
            float a = ((float) C9432q.m18670a(getContext())) / ((float) C9432q.m18688b(getContext()));
            StringBuilder sb = new StringBuilder("res://");
            sb.append(getContext().getPackageName());
            sb.append("/2131956147");
            C5213c.m11823a(this.f16036ai, sb.toString(), (C14234d) new C4620v(5, a, null));
        }
        if (this.f16050aw) {
            if (mVar == C8710m.AUDIO) {
                this.f16037aj.setBackgroundResource(R.drawable.bj5);
            } else if (C9414h.m18631b(this.f16008T)) {
                C5213c.m11821a(this.f16037aj, new ImageModel(null, list), (C14234d) new C4620v(5, ((float) C9432q.m18670a(getContext())) / ((float) C9432q.m18688b(getContext())), null));
            } else {
                float a2 = ((float) C9432q.m18670a(getContext())) / ((float) C9432q.m18688b(getContext()));
                StringBuilder sb2 = new StringBuilder("res://");
                sb2.append(getContext().getPackageName());
                sb2.append("/2131956147");
                C5213c.m11823a(this.f16037aj, sb2.toString(), (C14234d) new C4620v(5, a2, null));
            }
        }
        if (this.f16050aw) {
            String str = "init";
            if (this.f16037aj.getVisibility() != 0) {
                this.f16037aj.setVisibility(0);
            }
            new StringBuilder("show Below Background, reason: ").append(str);
            mo12039a(true, str);
        } else {
            m13142c("init");
        }
        this.f16076x.setVisibility(8);
        if (m13125C()) {
            this.f16039al.setVisibility(8);
            this.f16041an.setVisibility(8);
        } else {
            this.f16040am.setVisibility(8);
        }
        int intValue = ((Integer) this.f16065m.get("interaction_layer_margin_top", Integer.valueOf(0))).intValue();
        if (intValue > 0) {
            View findViewById = view.findViewById(R.id.aul);
            C5067f fVar = this.f16031ad;
            fVar.f13559a.clear();
            fVar.f13559a = new WeakReference<>(findViewById);
            fVar.mo10942a();
            C5067f fVar2 = this.f16031ad;
            fVar2.f13560b = intValue;
            fVar2.mo10942a();
        }
    }

    /* renamed from: a */
    public final void mo12031a(int i, String str, long j) {
        if (this.f16000K != null) {
            this.f16000K.mo14296a(i, str, j);
        }
        mo12069x();
    }

    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return LayoutInflater.from(getContext()).inflate(R.layout.akn, viewGroup, false);
    }

    /* renamed from: a */
    private void m13136a(String str, String str2, Bundle bundle) {
        String str3;
        if (bundle != null) {
            C8038g a = C8049c.m15979a().mo14201a(Room.class);
            if (a != null) {
                a.mo14193a("request_id");
                if (!C5234s.m11849a(bundle)) {
                    a.mo14193a("live_window_mode");
                }
                a.mo14193a("log_pb");
                a.mo14193a("starlight_rank");
                if (TextUtils.isEmpty(str)) {
                    str = bundle.getString("log_pb");
                }
                a.mo14194a("log_pb", str);
                if (TextUtils.isEmpty(str2)) {
                    str2 = bundle.getString("request_id");
                }
                a.mo14194a("request_id", str2);
                if (TextUtils.isEmpty(str2)) {
                    str2 = ((C8045n) a).mo14200c(String.valueOf(this.f16015a));
                }
                if (TextUtils.isEmpty(str)) {
                    str = ((C8045n) a).mo14199b(String.valueOf(this.f16015a));
                }
                if (a instanceof C8045n) {
                    ((C8045n) a).mo14198a(String.valueOf(this.f16015a), str, str2);
                }
                int i = C35807d.m80935a(getActivity(), "feed_live_span", 0).getInt("span_count", 0);
                if (i > 0) {
                    String str4 = "live_window_mode";
                    if (i > 1) {
                        str3 = "live_small_picture";
                    } else {
                        str3 = "live_big_picture";
                    }
                    a.mo14194a(str4, str3);
                }
                a.mo14194a("gd_label", bundle.getString("gd_label", ""));
                a.mo14193a("card_id");
                a.mo14193a("card_position");
                String string = bundle.getString("card_id");
                if (!TextUtils.isEmpty(string)) {
                    a.mo14194a("card_id", string);
                }
                String string2 = bundle.getString("card_position");
                if (!TextUtils.isEmpty(string2)) {
                    a.mo14194a("card_position", string2);
                }
            }
        }
    }

    /* renamed from: a */
    private void m13135a(String str, C8710m mVar, C8726a aVar, String str2) {
        if (this.f16070r == null) {
            if (this.f16076x == null) {
                C51151a.m110023e("LivePlayFragment", "startPlayer  mVideoView is null");
                return;
            }
            f15992S.booleanValue();
            boolean z = false;
            this.f16076x.setVisibility(0);
            if (!this.f16075w && !this.f16050aw) {
                m13142c("start player");
            }
            this.f16001L.mo10893a("n_time_fragment_start_pulling");
            this.f16001L.mo10896b("pullDuration");
            this.f16070r = ((C4139d) C4116c.m10249a(C4139d.class)).ensureRoomPlayer(this.f16015a, str, mVar, aVar, this.f16076x, this.f16007R, getContext(), str2, this.f16025aJ);
            this.f16070r.start();
            this.f16001L.f13487p = this.f16070r.hasWarmedUp();
            this.f16001L.mo10894a("n_time_start_pulling", this.f16070r.getStartTime());
            this.f16070r.setAnchorInteractMode(this.f16028aa);
            C2831a aVar2 = this.f16070r;
            if (this.f16064l == 1) {
                z = true;
            }
            aVar2.setScreenOrientation(z);
            if (!m13125C()) {
                mo12054o();
            } else if (!this.f16052ay || !C9431p.m18665a("slide", this.f16016aA)) {
                mo12053n();
            } else {
                this.f16020aE.sendMessageDelayed(Message.obtain(this.f16020aE, 37), (long) this.f16053az);
            }
            this.f16002M.mo10963a();
        }
    }

    /* renamed from: a */
    private void m13137a(String str, String str2, C8710m mVar, C8726a aVar) {
        if (this.f16070r == null) {
            if (this.f16076x == null) {
                C51151a.m110023e("LivePlayFragment", "startPlayer  mVideoView is null");
                return;
            }
            f15992S.booleanValue();
            boolean z = false;
            this.f16076x.setVisibility(0);
            if (!this.f16075w && !this.f16050aw) {
                m13142c("start player");
            }
            this.f16001L.mo10893a("n_time_fragment_start_pulling");
            this.f16001L.mo10896b("pullDuration");
            this.f16070r = ((C4139d) C4116c.m10249a(C4139d.class)).ensureRoomPlayer(this.f16015a, str, str2, mVar, aVar, this.f16076x, this.f16007R, getContext(), this.f16025aJ);
            if (this.f16068p != null) {
                this.f16068p.mo10961i();
            }
            this.f16070r.start();
            this.f16001L.f13487p = this.f16070r.hasWarmedUp();
            this.f16001L.mo10894a("n_time_start_pulling", this.f16070r.getStartTime());
            this.f16070r.setAnchorInteractMode(this.f16028aa);
            C2831a aVar2 = this.f16070r;
            if (this.f16064l == 1) {
                z = true;
            }
            aVar2.setScreenOrientation(z);
            if (!m13125C()) {
                mo12054o();
            } else if (!this.f16052ay || !C9431p.m18665a("slide", this.f16016aA)) {
                mo12053n();
            } else {
                this.f16020aE.sendMessageDelayed(Message.obtain(this.f16020aE, 37), (long) this.f16053az);
            }
            this.f16002M.mo10963a();
        }
    }
}
