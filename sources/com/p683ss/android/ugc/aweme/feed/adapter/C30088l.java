package com.p683ss.android.ugc.aweme.feed.adapter;

import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Message;
import android.text.TextUtils;
import android.view.TextureView;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.airbnb.lottie.LottieAnimationView;
import com.bytedance.android.live.base.event.RoomStatusEvent;
import com.bytedance.android.livesdkapi.depend.live.C8643b;
import com.bytedance.android.livesdkapi.depend.live.C8645d;
import com.bytedance.android.livesdkapi.depend.live.C8649h.C8652b;
import com.bytedance.android.livesdkapi.service.C8859b;
import com.bytedance.android.livesdkapi.view.TextureRenderView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.facebook.imagepipeline.p975o.C14234d;
import com.p683ss.android.ugc.aweme.adaptation.C22453b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarBorderView;
import com.p683ss.android.ugc.aweme.base.utils.C23724k;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.experiment.FollowLiveDisplayInteractionExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.live.LiveRoomStruct;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30322am;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30323an;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30335d;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30351t;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30769as;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LongPressLayout;
import com.p683ss.android.ugc.aweme.follow.p1766e.C31874a;
import com.p683ss.android.ugc.aweme.live.C36006a;
import com.p683ss.android.ugc.aweme.live.C36173w;
import com.p683ss.android.ugc.aweme.live.ILiveOuterService;
import com.p683ss.android.ugc.aweme.live.p1916a.C36008b;
import com.p683ss.android.ugc.aweme.live.p1921d.C36067b;
import com.p683ss.android.ugc.aweme.live.p1921d.C36068c;
import com.p683ss.android.ugc.aweme.newfollow.live.C37899a;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.profile.p2090ui.UserProfileActivity;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.l */
public final class C30088l extends C30075c {

    /* renamed from: A */
    private final FrameLayout f78535A;

    /* renamed from: B */
    private final FrameLayout f78536B;

    /* renamed from: C */
    private final LongPressLayout f78537C;

    /* renamed from: D */
    private final View f78538D;

    /* renamed from: E */
    private final View f78539E;

    /* renamed from: F */
    private final View f78540F;

    /* renamed from: G */
    private final View f78541G;

    /* renamed from: H */
    private final DmtTextView f78542H;

    /* renamed from: I */
    private final DmtTextView f78543I;

    /* renamed from: J */
    private final DmtTextView f78544J;

    /* renamed from: K */
    private final FrameLayout f78545K;

    /* renamed from: L */
    private final LottieAnimationView f78546L;

    /* renamed from: M */
    private final View f78547M;

    /* renamed from: N */
    private final View f78548N;

    /* renamed from: O */
    private final SmartAvatarBorderView f78549O;

    /* renamed from: P */
    private final View f78550P;

    /* renamed from: Q */
    private final String f78551Q;

    /* renamed from: R */
    private int f78552R;

    /* renamed from: S */
    private final C36008b f78553S;

    /* renamed from: T */
    private boolean f78554T;

    /* renamed from: U */
    private C30769as f78555U;

    /* renamed from: V */
    private final boolean f78556V;

    /* renamed from: W */
    private long f78557W;

    /* renamed from: X */
    private final C30095g f78558X;

    /* renamed from: i */
    public boolean f78559i = true;

    /* renamed from: j */
    public long f78560j;

    /* renamed from: k */
    public boolean f78561k = true;

    /* renamed from: l */
    public final RemoteImageView f78562l;

    /* renamed from: m */
    final FrameLayout f78563m;

    /* renamed from: n */
    public C8643b f78564n;

    /* renamed from: o */
    public C8645d f78565o;

    /* renamed from: p */
    boolean f78566p;

    /* renamed from: q */
    public final C36068c f78567q;

    /* renamed from: r */
    private long f78568r;

    /* renamed from: s */
    private final View f78569s;

    /* renamed from: t */
    private final DmtTextView f78570t;

    /* renamed from: u */
    private final DmtTextView f78571u;

    /* renamed from: v */
    private final FrameLayout f78572v;

    /* renamed from: w */
    private final View f78573w;

    /* renamed from: x */
    private final DmtTextView f78574x;

    /* renamed from: y */
    private final DmtTextView f78575y;

    /* renamed from: z */
    private final LottieAnimationView f78576z;

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$a */
    public static final class C30089a implements C30018ai {

        /* renamed from: a */
        final /* synthetic */ C30088l f78577a;

        /* renamed from: a */
        public final void mo60292a() {
            if (!this.f78577a.f78512g) {
                this.f78577a.f78567q.mo74823b();
            }
            C8643b bVar = this.f78577a.f78564n;
            if (bVar != null) {
                bVar.mo14944b();
            }
            this.f78577a.mo60353R();
        }

        C30089a(C30088l lVar) {
            this.f78577a = lVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$b */
    static final class C30090b implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ LiveRoomStruct f78578a;

        /* renamed from: b */
        final /* synthetic */ C30088l f78579b;

        C30090b(LiveRoomStruct liveRoomStruct, C30088l lVar) {
            this.f78578a = liveRoomStruct;
            this.f78579b = lVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C52711k.m112236a((Object) view, "view");
            UserProfileActivity.m89402a(view.getContext(), this.f78578a.owner, this.f78579b.mo60354S());
            User user = this.f78578a.owner;
            C52711k.m112236a((Object) user, "it.owner");
            User user2 = this.f78578a.owner;
            C52711k.m112236a((Object) user2, "it.owner");
            C26890h.m65011a("enter_personal_detail", C23089d.m56640a().mo47829a("to_user_id", user.getUid()).mo47829a("enter_from", this.f78579b.mo60354S()).mo47827a("room_id", this.f78578a.f79734id).mo47829a("anchor_id", user2.getUid()).mo47829a("enter_method", "click_name").mo47829a("scene_id", "1045").f61491a);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$c */
    static final class C30091c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ UrlModel f78580a;

        /* renamed from: b */
        final /* synthetic */ C30088l f78581b;

        C30091c(UrlModel urlModel, C30088l lVar) {
            this.f78580a = urlModel;
            this.f78581b = lVar;
        }

        public final void run() {
            C23515d.m57671a(this.f78581b.f78562l, this.f78580a, this.f78581b.f78562l.getWidth(), this.f78581b.f78562l.getHeight(), (C14234d) new C37899a(5, (((float) this.f78580a.getWidth()) * 1.0f) / ((float) this.f78581b.f78562l.getWidth()), null));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$d */
    public static final class C30092d implements C8859b {

        /* renamed from: a */
        final /* synthetic */ C30088l f78582a;

        C30092d(C30088l lVar) {
            this.f78582a = lVar;
        }

        /* renamed from: a */
        public final void mo15858a(boolean z) {
            if (z != this.f78582a.f78559i) {
                this.f78582a.f78559i = z;
                this.f78582a.mo60342k();
            }
            if (!z) {
                this.f78582a.f78567q.mo74820a();
                this.f78582a.f78562l.setVisibility(0);
                this.f78582a.mo60350O();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$e */
    static final class C30093e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C30088l f78583a;

        C30093e(C30088l lVar) {
            this.f78583a = lVar;
        }

        public final void run() {
            Integer num;
            if (this.f78583a.f78561k) {
                this.f78583a.f78561k = false;
                this.f78583a.f78560j = System.currentTimeMillis();
                C30088l lVar = this.f78583a;
                LiveRoomStruct liveRoomStruct = lVar.f78508c;
                if (liveRoomStruct != null) {
                    String str = "livesdk_live_window_show";
                    User user = liveRoomStruct.owner;
                    C52711k.m112236a((Object) user, "it.owner");
                    C23089d a = C23089d.m56640a().mo47829a("scene_id", "1007").mo47829a("enter_from_merge", lVar.mo60354S()).mo47829a("action_type", "click").mo47829a("anchor_id", user.getUid()).mo47827a("room_id", liveRoomStruct.f79734id);
                    String str2 = "request_id";
                    Aweme aweme = lVar.f78507b;
                    if (aweme == null) {
                        C52711k.m112234a();
                    }
                    C23089d a2 = a.mo47829a(str2, aweme.getRequestId());
                    String str3 = "order";
                    Aweme e = lVar.mo53999e();
                    if (e != null) {
                        num = Integer.valueOf(e.getAwemePosition());
                    } else {
                        num = null;
                    }
                    C26890h.m65011a(str, a2.mo47828a(str3, (Object) num).mo47829a("enter_method", "live_cell").f61491a);
                }
                C30088l lVar2 = this.f78583a;
                if (lVar2.f78566p) {
                    lVar2.f78563m.setVisibility(0);
                    lVar2.f78567q.mo74821a(false);
                } else {
                    lVar2.f78563m.setVisibility(8);
                    lVar2.f78567q.mo74821a(true);
                }
                C8643b bVar = this.f78583a.f78564n;
                if (bVar != null) {
                    bVar.mo14943a();
                }
                C8645d dVar = this.f78583a.f78565o;
                if (dVar != null) {
                    dVar.mo14949a(C10181b.m20511a().mo18168a(FollowLiveDisplayInteractionExperiment.class, true, "follow_live_interaction_style", 31744, 0));
                }
            }
            this.f78583a.f78562l.setVisibility(8);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$f */
    public static final class C30094f implements C36067b {

        /* renamed from: a */
        final /* synthetic */ C30088l f78584a;

        C30094f(C30088l lVar) {
            this.f78584a = lVar;
        }

        /* renamed from: a */
        public final void mo60361a(C8652b bVar, Object obj) {
            C52711k.m112240b(bVar, "message");
            switch (C30101m.f78593a[bVar.ordinal()]) {
                case 1:
                case 2:
                    this.f78584a.mo60352Q();
                    return;
                default:
                    return;
            }
        }

        /* renamed from: a */
        public final void mo60360a(TextureView textureView, int i, int i2) {
            C30088l lVar = this.f78584a;
            LayoutParams layoutParams = lVar.f78563m.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                if (i > i2) {
                    float f = ((float) i2) / ((float) i);
                    marginLayoutParams.width = C23724k.m58224b(lVar.f78506a);
                    marginLayoutParams.height = (int) (((float) marginLayoutParams.width) * f);
                    marginLayoutParams.topMargin = (int) C9432q.m18687b(lVar.f78506a, 136.0f);
                } else {
                    marginLayoutParams.width = C23724k.m58224b(lVar.f78506a);
                    marginLayoutParams.height = C23724k.m58221a(lVar.f78506a);
                    marginLayoutParams.topMargin = 0;
                }
                lVar.f78563m.setLayoutParams(marginLayoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$g */
    public static final class C30095g extends Handler {

        /* renamed from: a */
        final /* synthetic */ C30088l f78585a;

        public final void handleMessage(Message message) {
            if (message != null && message.what == 100) {
                this.f78585a.mo60351P();
            }
        }

        C30095g(C30088l lVar, Looper looper) {
            this.f78585a = lVar;
            super(looper);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$h */
    static final class C30096h implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30088l f78586a;

        /* renamed from: b */
        final /* synthetic */ LiveRoomStruct f78587b;

        C30096h(C30088l lVar, LiveRoomStruct liveRoomStruct) {
            this.f78586a = lVar;
            this.f78587b = liveRoomStruct;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f78586a.mo60355a(this.f78587b);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$i */
    static final class C30097i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30088l f78588a;

        C30097i(C30088l lVar) {
            this.f78588a = lVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f78588a.mo60349N();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$j */
    static final class C30098j implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30088l f78589a;

        C30098j(C30088l lVar) {
            this.f78589a = lVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f78589a.mo60349N();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$k */
    static final class C30099k implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30088l f78590a;

        C30099k(C30088l lVar) {
            this.f78590a = lVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f78590a.mo60351P();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.adapter.l$l */
    static final class C30100l implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30088l f78591a;

        /* renamed from: b */
        final /* synthetic */ LiveRoomStruct f78592b;

        C30100l(C30088l lVar, LiveRoomStruct liveRoomStruct) {
            this.f78591a = lVar;
            this.f78592b = liveRoomStruct;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f78591a.mo60355a(this.f78592b);
        }
    }

    /* renamed from: a */
    public final void mo46747a() {
        m70624V();
    }

    /* renamed from: R */
    public final void mo60353R() {
        C8645d dVar = this.f78565o;
        if (dVar != null) {
            dVar.mo14948a();
            this.f78565o = null;
        }
    }

    /* renamed from: g */
    public final void mo54001g() {
        super.mo54001g();
        this.f78559i = true;
        C47718bf.m103291d(this);
    }

    /* renamed from: C */
    public final void mo60284C() {
        super.mo60284C();
        this.f78566p = true;
        this.f78563m.setVisibility(0);
        this.f78567q.mo74821a(false);
        this.f78568r = System.currentTimeMillis();
        m70623U();
        this.f78554T = false;
    }

    /* renamed from: N */
    public final void mo60349N() {
        this.f78558X.removeMessages(100);
        C30033au.m70442a(new C30322am(this.f78551Q, true), new C30323an(this.f78506a.hashCode(), 1), this.f78551Q);
    }

    /* renamed from: P */
    public final void mo60351P() {
        if (this.f78566p) {
            this.f78557W = 0;
            this.f78558X.removeMessages(100);
            C47718bf.m103288a(new C30351t());
        }
    }

    /* renamed from: S */
    public final String mo60354S() {
        if (TextUtils.equals(this.f78551Q, "homepage_hot")) {
            return "homepage_hot";
        }
        return "homepage_follow";
    }

    public final void aw_() {
        super.aw_();
        this.f78567q.mo74824c();
        C8643b bVar = this.f78564n;
        if (bVar != null) {
            bVar.mo14945c();
        }
        mo60353R();
        C47718bf.m103291d(this);
    }

    /* renamed from: f */
    public final void mo54000f() {
        super.mo54000f();
        if (this.f78556V) {
            this.f78546L.mo6662g();
        } else {
            this.f78576z.mo6662g();
        }
        this.f78553S.mo74743a();
        this.f78558X.removeMessages(100);
    }

    /* renamed from: h */
    public final void mo54002h() {
        super.mo54002h();
        if (!this.f78559i) {
            mo60350O();
        } else if (this.f78556V) {
            this.f78546L.mo6657c();
        } else {
            this.f78576z.mo6657c();
        }
    }

    /* renamed from: i */
    public final void mo54003i() {
        this.f78554T = false;
        this.f78566p = false;
        m70622T();
        mo60353R();
        this.f78567q.mo74820a();
        this.f78553S.mo74743a();
        this.f78558X.removeMessages(100);
    }

    /* renamed from: O */
    public final void mo60350O() {
        this.f78558X.removeMessages(100);
        if (this.f78557W <= 0 || System.currentTimeMillis() - this.f78557W < 5000) {
            this.f78558X.sendEmptyMessageDelayed(100, 5000);
            this.f78557W = System.currentTimeMillis();
            return;
        }
        this.f78558X.sendEmptyMessageDelayed(100, 0);
    }

    /* renamed from: Q */
    public final void mo60352Q() {
        LiveRoomStruct liveRoomStruct = this.f78508c;
        if (liveRoomStruct != null) {
            ILiveOuterService a = C36173w.m81665a();
            C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
            a.getLive().mo15036a(liveRoomStruct.f79734id, (C8859b) new C30092d(this));
        }
    }

    /* renamed from: V */
    private final void m70624V() {
        int i;
        if (C22453b.m55505a().f60473k) {
            i = 0;
        } else {
            i = this.f78506a.getResources().getDimensionPixelSize(R.dimen.mu);
        }
        LayoutParams layoutParams = this.f78572v.getLayoutParams();
        if (layoutParams != null) {
            MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
            marginLayoutParams.bottomMargin = i;
            this.f78572v.setLayoutParams(marginLayoutParams);
            C47718bf.m103288a(new C30335d(!C22453b.m55505a().f60473k));
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: l */
    public final void mo60343l() {
        FrameLayout frameLayout;
        super.mo60343l();
        LiveRoomStruct liveRoomStruct = this.f78508c;
        boolean z = true;
        if (liveRoomStruct != null) {
            if (this.f78559i) {
                this.f78567q.mo74822a(true, liveRoomStruct, this.f78563m);
                TextureRenderView d = this.f78567q.mo74825d();
                if (d != null) {
                    d.setScaleType(2);
                }
            } else {
                return;
            }
        }
        LiveRoomStruct liveRoomStruct2 = this.f78508c;
        if (liveRoomStruct2 != null) {
            if (this.f78552R == 0 && this.f78552R == 5) {
                z = false;
            }
            if (z && this.f78559i) {
                if (this.f78556V) {
                    frameLayout = this.f78545K;
                } else {
                    frameLayout = this.f78536B;
                }
                if (this.f78565o == null) {
                    ILiveOuterService a = C36173w.m81665a();
                    C52711k.m112236a((Object) a, "ServiceManager.get().get…OuterService::class.java)");
                    this.f78565o = a.getLive().mo15028a(this.f78506a, (ViewGroup) frameLayout, liveRoomStruct2.f79734id);
                }
            }
        }
        this.f78553S.mo74744b();
    }

    /* renamed from: U */
    private final void m70623U() {
        Integer num;
        LiveRoomStruct liveRoomStruct = this.f78508c;
        if (liveRoomStruct != null) {
            this.f78511f = true;
            String str = "livesdk_live_show";
            User user = liveRoomStruct.owner;
            C52711k.m112236a((Object) user, "it.owner");
            C23089d a = C23089d.m56640a().mo47829a("scene_id", "1007").mo47829a("enter_from_merge", mo60354S()).mo47829a("action_type", "click").mo47829a("anchor_id", user.getUid()).mo47827a("room_id", liveRoomStruct.f79734id);
            String str2 = "request_id";
            Aweme aweme = this.f78507b;
            if (aweme == null) {
                C52711k.m112234a();
            }
            C23089d a2 = a.mo47829a(str2, aweme.getRequestId());
            String str3 = "order";
            Aweme e = mo53999e();
            if (e != null) {
                num = Integer.valueOf(e.getAwemePosition());
            } else {
                num = null;
            }
            C26890h.m65011a(str, a2.mo47828a(str3, (Object) num).mo47829a("enter_method", "live_cell").mo47829a("notice_type", C31874a.m74294a()).mo47829a("show_cnt", String.valueOf(C31874a.m74295b())).mo47829a("yellow_dot_logid", C31874a.m74296c()).f61491a);
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:67:0x019f  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x01af  */
    /* renamed from: T */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private final void m70622T() {
        /*
            r10 = this;
            long r0 = r10.f78568r
            r2 = 0
            r3 = 0
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x00a0
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f78507b
            if (r0 == 0) goto L_0x00a0
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r10.f78508c
            if (r0 == 0) goto L_0x00a0
            boolean r0 = r10.f78511f
            if (r0 == 0) goto L_0x00a0
            r0 = 0
            r10.f78511f = r0
            java.lang.String r0 = "livesdk_live_window_duration"
            com.ss.android.ugc.aweme.app.f.d r1 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "scene_id"
            java.lang.String r6 = "1003"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r5, r6)
            java.lang.String r5 = "duration"
            long r6 = java.lang.System.currentTimeMillis()
            long r8 = r10.f78568r
            long r6 = r6 - r8
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47827a(r5, r6)
            java.lang.String r5 = "enter_from_merge"
            java.lang.String r6 = r10.mo60354S()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r5, r6)
            java.lang.String r5 = "action_type"
            java.lang.String r6 = "click"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r5, r6)
            java.lang.String r5 = "anchor_id"
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r6 = r10.f78508c
            if (r6 != 0) goto L_0x004e
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x004e:
            com.ss.android.ugc.aweme.profile.model.User r6 = r6.owner
            java.lang.String r7 = "mRoomStruct!!.owner"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.String r6 = r6.getUid()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r5, r6)
            java.lang.String r5 = "room_id"
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r6 = r10.f78508c
            if (r6 != 0) goto L_0x0066
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0066:
            long r6 = r6.f79734id
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47827a(r5, r6)
            java.lang.String r5 = "request_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r10.f78507b
            if (r6 != 0) goto L_0x0075
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0075:
            java.lang.String r6 = r6.getRequestId()
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r5, r6)
            java.lang.String r5 = "enter_method"
            java.lang.String r6 = "live_cell"
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47829a(r5, r6)
            java.lang.String r5 = "order"
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r10.mo53999e()
            if (r6 == 0) goto L_0x0096
            int r6 = r6.getAwemePosition()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x0097
        L_0x0096:
            r6 = r2
        L_0x0097:
            com.ss.android.ugc.aweme.app.f.d r1 = r1.mo47828a(r5, r6)
            java.util.Map<java.lang.String, java.lang.String> r1 = r1.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r0, r1)
        L_0x00a0:
            long r0 = r10.f78560j
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0147
            long r0 = r10.f78568r
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x0147
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f78507b
            if (r0 == 0) goto L_0x0147
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r10.f78508c
            if (r0 == 0) goto L_0x0147
            long r0 = r10.f78560j
            long r5 = r10.f78568r
            int r7 = (r0 > r5 ? 1 : (r0 == r5 ? 0 : -1))
            if (r7 >= 0) goto L_0x00bf
            long r0 = r10.f78568r
            goto L_0x00c1
        L_0x00bf:
            long r0 = r10.f78560j
        L_0x00c1:
            java.lang.String r5 = "livesdk_live_window_duration_v2"
            com.ss.android.ugc.aweme.app.f.d r6 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r7 = "scene_id"
            java.lang.String r8 = "1003"
            com.ss.android.ugc.aweme.app.f.d r6 = r6.mo47829a(r7, r8)
            java.lang.String r7 = "duration"
            long r8 = java.lang.System.currentTimeMillis()
            long r8 = r8 - r0
            com.ss.android.ugc.aweme.app.f.d r0 = r6.mo47827a(r7, r8)
            java.lang.String r1 = "enter_from_merge"
            java.lang.String r6 = r10.mo60354S()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r6)
            java.lang.String r1 = "action_type"
            java.lang.String r6 = "click"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r6)
            java.lang.String r1 = "anchor_id"
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r6 = r10.f78508c
            if (r6 != 0) goto L_0x00f5
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x00f5:
            com.ss.android.ugc.aweme.profile.model.User r6 = r6.owner
            java.lang.String r7 = "mRoomStruct!!.owner"
            p2628d.p2639f.p2641b.C52711k.m112236a(r6, r7)
            java.lang.String r6 = r6.getUid()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r6)
            java.lang.String r1 = "room_id"
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r6 = r10.f78508c
            if (r6 != 0) goto L_0x010d
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x010d:
            long r6 = r6.f79734id
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47827a(r1, r6)
            java.lang.String r1 = "request_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r10.f78507b
            if (r6 != 0) goto L_0x011c
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x011c:
            java.lang.String r6 = r6.getRequestId()
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r6)
            java.lang.String r1 = "enter_method"
            java.lang.String r6 = "live_cell"
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47829a(r1, r6)
            java.lang.String r1 = "order"
            com.ss.android.ugc.aweme.feed.model.Aweme r6 = r10.mo53999e()
            if (r6 == 0) goto L_0x013d
            int r6 = r6.getAwemePosition()
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            goto L_0x013e
        L_0x013d:
            r6 = r2
        L_0x013e:
            com.ss.android.ugc.aweme.app.f.d r0 = r0.mo47828a(r1, r6)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r5, r0)
        L_0x0147:
            long r0 = r10.f78568r
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ef
            long r0 = r10.f78560j
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 <= 0) goto L_0x01ef
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r10.f78507b
            if (r0 == 0) goto L_0x01ef
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r10.f78508c
            if (r0 == 0) goto L_0x01ef
            long r0 = r10.f78560j
            long r5 = r10.f78568r
            long r0 = r0 - r5
            int r5 = (r0 > r3 ? 1 : (r0 == r3 ? 0 : -1))
            if (r5 >= 0) goto L_0x0165
            r0 = r3
        L_0x0165:
            java.lang.String r3 = "livesdk_enter_window_from_draw_duration"
            com.ss.android.ugc.aweme.app.f.d r4 = com.p683ss.android.ugc.aweme.app.p1376f.C23089d.m56640a()
            java.lang.String r5 = "scene_id"
            java.lang.String r6 = "1007"
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "enter_from_merge"
            java.lang.String r6 = r10.mo60354S()
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "action_type"
            java.lang.String r6 = "click"
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "anchor_id"
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r6 = r10.f78508c
            if (r6 == 0) goto L_0x0194
            com.ss.android.ugc.aweme.profile.model.User r6 = r6.owner
            if (r6 == 0) goto L_0x0194
            java.lang.String r6 = r6.getUid()
            goto L_0x0195
        L_0x0194:
            r6 = r2
        L_0x0195:
            com.ss.android.ugc.aweme.app.f.d r4 = r4.mo47829a(r5, r6)
            java.lang.String r5 = "room_id"
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r6 = r10.f78508c
            if (r6 == 0) goto L_0x01a5
            long r6 = r6.f79734id
            java.lang.Long r2 = java.lang.Long.valueOf(r6)
        L_0x01a5:
            com.ss.android.ugc.aweme.app.f.d r2 = r4.mo47828a(r5, r2)
            java.lang.String r4 = "request_id"
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r10.f78507b
            if (r5 != 0) goto L_0x01b2
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x01b2:
            java.lang.String r5 = r5.getRequestId()
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r4, r5)
            java.lang.String r4 = "enter_method"
            java.lang.String r5 = "live_cell"
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r4, r5)
            java.lang.String r4 = "notice_type"
            java.lang.String r5 = com.p683ss.android.ugc.aweme.follow.p1766e.C31874a.m74294a()
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r4, r5)
            java.lang.String r4 = "show_cnt"
            int r5 = com.p683ss.android.ugc.aweme.follow.p1766e.C31874a.m74295b()
            java.lang.String r5 = java.lang.String.valueOf(r5)
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r4, r5)
            java.lang.String r4 = "yellow_dot_logid"
            java.lang.String r5 = com.p683ss.android.ugc.aweme.follow.p1766e.C31874a.m74296c()
            com.ss.android.ugc.aweme.app.f.d r2 = r2.mo47829a(r4, r5)
            java.lang.String r4 = "duration"
            com.ss.android.ugc.aweme.app.f.d r0 = r2.mo47827a(r4, r0)
            java.util.Map<java.lang.String, java.lang.String> r0 = r0.f61491a
            com.p683ss.android.ugc.aweme.common.C26890h.m65011a(r3, r0)
        L_0x01ef:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.adapter.C30088l.m70622T():void");
    }

    /* JADX WARNING: Code restructure failed: missing block: B:111:0x0252, code lost:
        if ((((java.lang.Integer) r4.mo15033a("live_dislike_type", java.lang.Integer.valueOf(0))).intValue() & 4) != 0) goto L_0x0256;
     */
    /* JADX WARNING: Removed duplicated region for block: B:122:0x0276  */
    /* JADX WARNING: Removed duplicated region for block: B:137:0x0330  */
    /* JADX WARNING: Removed duplicated region for block: B:70:0x0163  */
    /* JADX WARNING: Removed duplicated region for block: B:73:0x0176  */
    /* JADX WARNING: Removed duplicated region for block: B:85:0x019a  */
    /* JADX WARNING: Removed duplicated region for block: B:86:0x01a5  */
    /* JADX WARNING: Removed duplicated region for block: B:90:0x01ac  */
    /* renamed from: k */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo60342k() {
        /*
            r14 = this;
            com.ss.android.ugc.aweme.feed.model.live.LiveRoomStruct r0 = r14.f78508c
            if (r0 == 0) goto L_0x0342
            com.ss.android.ugc.aweme.live.a.b r1 = r14.f78553S
            boolean r2 = r14.f78559i
            java.lang.String r3 = "room"
            p2628d.p2639f.p2641b.C52711k.m112240b(r0, r3)
            r1.f92294g = r0
            r1.f92295h = r2
            boolean r2 = r1.mo74745c()
            r3 = 1
            r4 = 8
            r5 = 0
            r6 = 0
            if (r2 != 0) goto L_0x0028
            android.view.ViewGroup r2 = r1.f92288a
            if (r2 == 0) goto L_0x0023
            r2.setVisibility(r4)
        L_0x0023:
            r1.mo74743a()
            goto L_0x00c5
        L_0x0028:
            android.view.ViewGroup r2 = r1.f92288a
            if (r2 == 0) goto L_0x002f
            r2.setVisibility(r5)
        L_0x002f:
            com.bytedance.lighten.loader.SmartImageView r2 = r1.f92289b
            if (r2 == 0) goto L_0x0056
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.owner
            if (r2 == 0) goto L_0x003c
            com.ss.android.ugc.aweme.base.model.UrlModel r2 = r2.getAvatarLarger()
            goto L_0x003d
        L_0x003c:
            r2 = r6
        L_0x003d:
            com.ss.android.ugc.aweme.base.k r2 = com.p683ss.android.ugc.aweme.base.C23608p.m57874a(r2)
            com.bytedance.lighten.a.t r2 = com.bytedance.lighten.p766a.C12203q.m24645a(r2)
            java.lang.String r7 = "AudioLivePreviewManager"
            com.bytedance.lighten.a.t r2 = r2.mo23118a(r7)
            com.bytedance.lighten.loader.SmartImageView r7 = r1.f92289b
            com.bytedance.lighten.a.k r7 = (com.bytedance.lighten.p766a.C12197k) r7
            com.bytedance.lighten.a.t r2 = r2.mo23116a(r7)
            r2.mo23121a()
        L_0x0056:
            com.bytedance.lighten.loader.SmartImageView r2 = r1.f92291d
            if (r2 == 0) goto L_0x0085
            java.lang.String r2 = r1.f92292e
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 != 0) goto L_0x0085
            java.lang.String r2 = r1.f92292e
            com.bytedance.lighten.a.t r2 = com.bytedance.lighten.p766a.C12203q.m24646a(r2)
            java.lang.String r7 = "AudioLivePreviewManager"
            com.bytedance.lighten.a.t r2 = r2.mo23118a(r7)
            com.bytedance.lighten.a.t r2 = r2.mo23119a(r3)
            android.graphics.Bitmap$Config r7 = android.graphics.Bitmap.Config.ARGB_8888
            com.bytedance.lighten.a.t r2 = r2.mo23113a(r7)
            com.bytedance.lighten.loader.SmartImageView r7 = r1.f92291d
            com.bytedance.lighten.a.k r7 = (com.bytedance.lighten.p766a.C12197k) r7
            com.bytedance.lighten.a.t r2 = r2.mo23116a(r7)
            r2.mo23121a()
        L_0x0085:
            java.util.List<java.lang.String> r2 = r1.f92293f
            com.ss.android.ugc.aweme.profile.model.User r7 = r0.owner
            if (r7 == 0) goto L_0x0090
            java.lang.String r7 = r7.getUid()
            goto L_0x0091
        L_0x0090:
            r7 = r6
        L_0x0091:
            java.lang.String r2 = com.p683ss.android.ugc.aweme.feed.adapter.C30036ax.C30037a.m70444a(r2, r7)
            if (r2 == 0) goto L_0x00c2
            r7 = r2
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            int r7 = r7.length()
            if (r7 <= 0) goto L_0x00a2
            r7 = 1
            goto L_0x00a3
        L_0x00a2:
            r7 = 0
        L_0x00a3:
            if (r7 == 0) goto L_0x00a6
            goto L_0x00a7
        L_0x00a6:
            r2 = r6
        L_0x00a7:
            if (r2 == 0) goto L_0x00c2
            com.bytedance.lighten.loader.SmartImageView r7 = r1.f92290c
            if (r7 == 0) goto L_0x00c2
            com.bytedance.lighten.a.t r2 = com.bytedance.lighten.p766a.C12203q.m24646a(r2)
            java.lang.String r7 = "AudioLivePreviewManager"
            com.bytedance.lighten.a.t r2 = r2.mo23118a(r7)
            com.bytedance.lighten.loader.SmartImageView r7 = r1.f92290c
            com.bytedance.lighten.a.k r7 = (com.bytedance.lighten.p766a.C12197k) r7
            com.bytedance.lighten.a.t r2 = r2.mo23116a(r7)
            r2.mo23121a()
        L_0x00c2:
            r1.mo74744b()
        L_0x00c5:
            boolean r1 = r14.f78556V
            if (r1 == 0) goto L_0x00cc
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r14.f78544J
            goto L_0x00ce
        L_0x00cc:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r14.f78571u
        L_0x00ce:
            java.lang.String r2 = r0.title
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x00dc
            r1.setVisibility(r4)
            goto L_0x00e6
        L_0x00dc:
            java.lang.String r2 = r0.title
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            r1.setVisibility(r5)
        L_0x00e6:
            android.widget.FrameLayout r1 = r14.f78572v
            r1.setVisibility(r5)
            boolean r1 = r14.f78556V
            if (r1 == 0) goto L_0x00f2
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r14.f78542H
            goto L_0x00f4
        L_0x00f2:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r14.f78570t
        L_0x00f4:
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.owner
            if (r2 == 0) goto L_0x0126
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.owner
            java.lang.String r7 = "it.owner"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r7)
            java.lang.String r2 = r2.getUniqueId()
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            boolean r2 = android.text.TextUtils.isEmpty(r2)
            if (r2 == 0) goto L_0x010c
            goto L_0x0126
        L_0x010c:
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r7 = "@"
            r2.<init>(r7)
            com.ss.android.ugc.aweme.profile.model.User r7 = r0.owner
            java.lang.String r8 = "it.owner"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r8)
            java.lang.String r7 = r7.getUniqueId()
            r2.append(r7)
            java.lang.String r2 = r2.toString()
            goto L_0x015a
        L_0x0126:
            com.ss.android.ugc.aweme.profile.model.User r2 = r0.owner
            if (r2 != 0) goto L_0x012d
            java.lang.String r2 = ""
            goto L_0x015a
        L_0x012d:
            java.lang.String r7 = r2.getRemarkName()
            boolean r7 = android.text.TextUtils.isEmpty(r7)
            if (r7 != 0) goto L_0x013c
            java.lang.String r2 = r2.getRemarkName()
            goto L_0x0140
        L_0x013c:
            java.lang.String r2 = r2.getNickname()
        L_0x0140:
            java.lang.String r7 = "@"
            boolean r8 = android.text.TextUtils.isEmpty(r2)
            if (r8 == 0) goto L_0x014b
            java.lang.String r2 = ""
            goto L_0x015a
        L_0x014b:
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            r8.<init>()
            r8.append(r7)
            r8.append(r2)
            java.lang.String r2 = r8.toString()
        L_0x015a:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            boolean r7 = r14.f78556V
            if (r7 == 0) goto L_0x0168
            com.bytedance.ies.dmt.ui.widget.DmtTextView r7 = r14.f78543I
            r7.setText(r2)
        L_0x0168:
            com.ss.android.ugc.aweme.feed.adapter.l$b r2 = new com.ss.android.ugc.aweme.feed.adapter.l$b
            r2.<init>(r0, r14)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            com.ss.android.ugc.aweme.profile.model.User r1 = r0.owner
            if (r1 == 0) goto L_0x017a
            long r7 = r0.f79734id
            r1.roomId = r7
        L_0x017a:
            int r1 = r14.f78552R
            r2 = 5
            if (r1 == r2) goto L_0x0187
            int r1 = r14.f78552R
            r2 = 3
            if (r1 != r2) goto L_0x0185
            goto L_0x0187
        L_0x0185:
            r1 = 0
            goto L_0x0188
        L_0x0187:
            r1 = 1
        L_0x0188:
            if (r1 == 0) goto L_0x01a8
            boolean r1 = r14.f78559i
            if (r1 == 0) goto L_0x01a8
            com.ss.android.ugc.aweme.live.ILiveOuterService r1 = com.p683ss.android.ugc.aweme.live.C36173w.m81665a()
            com.ss.android.ugc.aweme.live.ILiveOuterService r1 = (com.p683ss.android.ugc.aweme.live.ILiveOuterService) r1
            com.ss.android.ugc.aweme.live.d r1 = r1.getLive()
            if (r1 == 0) goto L_0x01a5
            android.content.Context r2 = r14.f78506a
            android.widget.FrameLayout r7 = r14.f78535A
            android.view.ViewGroup r7 = (android.view.ViewGroup) r7
            com.bytedance.android.livesdkapi.depend.live.b r1 = r1.mo15027a(r2, r7)
            goto L_0x01a6
        L_0x01a5:
            r1 = r6
        L_0x01a6:
            r14.f78564n = r1
        L_0x01a8:
            boolean r1 = r14.f78559i
            if (r1 == 0) goto L_0x0276
            boolean r1 = r14.f78556V
            if (r1 == 0) goto L_0x01cc
            android.view.View r1 = r14.f78541G
            r1.setVisibility(r4)
            android.view.View r1 = r14.f78539E
            r1.setVisibility(r5)
            com.airbnb.lottie.LottieAnimationView r1 = r14.f78546L
            r1.setVisibility(r5)
            android.view.View r1 = r14.f78548N
            com.ss.android.ugc.aweme.feed.adapter.l$l r2 = new com.ss.android.ugc.aweme.feed.adapter.l$l
            r2.<init>(r14, r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            goto L_0x020b
        L_0x01cc:
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r14.f78507b
            if (r1 == 0) goto L_0x01d5
            java.lang.String r1 = r1.getVideoFeedTag()
            goto L_0x01d6
        L_0x01d5:
            r1 = r6
        L_0x01d6:
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            boolean r1 = android.text.TextUtils.isEmpty(r1)
            if (r1 != 0) goto L_0x01ef
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r14.f78574x
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r14.f78507b
            if (r2 == 0) goto L_0x01e9
            java.lang.String r2 = r2.getVideoFeedTag()
            goto L_0x01ea
        L_0x01e9:
            r2 = r6
        L_0x01ea:
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
        L_0x01ef:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r14.f78574x
            r1.setVisibility(r5)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r14.f78575y
            android.content.Context r2 = r14.mo60344n()
            r4 = 2132547427(0x7f1c1763, float:2.07481E38)
            java.lang.String r2 = r2.getString(r4)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            com.airbnb.lottie.LottieAnimationView r1 = r14.f78576z
            r1.setVisibility(r5)
        L_0x020b:
            com.ss.android.ugc.aweme.feed.ui.LongPressLayout r1 = r14.f78537C
            com.ss.android.ugc.aweme.feed.adapter.l$h r2 = new com.ss.android.ugc.aweme.feed.adapter.l$h
            r2.<init>(r14, r0)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r1 = r14.f78549O
            r1.setOnClickListener(r6)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r14.f78543I
            r1.setOnClickListener(r6)
            android.view.View r1 = r14.f78550P
            r1.setOnClickListener(r6)
            com.ss.android.ugc.aweme.feed.ui.LongPressLayout r1 = r14.f78537C
            android.content.Context r2 = r14.mo60344n()
            java.lang.String r4 = "context"
            p2628d.p2639f.p2641b.C52711k.m112240b(r2, r4)
            com.bytedance.android.livesdkapi.service.e r4 = com.bytedance.android.livesdkapi.C8830k.m17330d()
            if (r4 == 0) goto L_0x0255
            com.bytedance.android.livesdkapi.service.e r4 = com.bytedance.android.livesdkapi.C8830k.m17330d()
            if (r4 != 0) goto L_0x0240
            p2628d.p2639f.p2641b.C52711k.m112234a()
        L_0x0240:
            java.lang.String r7 = "live_dislike_type"
            java.lang.Integer r8 = java.lang.Integer.valueOf(r5)
            java.lang.Object r4 = r4.mo15033a(r7, r8)
            java.lang.Integer r4 = (java.lang.Integer) r4
            int r4 = r4.intValue()
            r4 = r4 & 4
            if (r4 == 0) goto L_0x0255
            goto L_0x0256
        L_0x0255:
            r3 = 0
        L_0x0256:
            if (r3 != 0) goto L_0x025a
            r2 = r6
            goto L_0x0262
        L_0x025a:
            com.ss.android.ugc.aweme.feed.adapter.c$a r3 = new com.ss.android.ugc.aweme.feed.adapter.c$a
            r3.<init>(r2)
            r2 = r3
            com.ss.android.ugc.aweme.feed.ui.LongPressLayout$a r2 = (com.p683ss.android.ugc.aweme.feed.p1736ui.LongPressLayout.C30722a) r2
        L_0x0262:
            r1.setListener(r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r0.roomCover
            if (r1 != 0) goto L_0x0273
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.owner
            if (r0 == 0) goto L_0x032e
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r0.getAvatarLarger()
            goto L_0x032e
        L_0x0273:
            r6 = r1
            goto L_0x032e
        L_0x0276:
            boolean r1 = r14.f78556V
            if (r1 == 0) goto L_0x02de
            android.view.View r1 = r14.f78539E
            r1.setVisibility(r4)
            r1 = 4636596553866280960(0x4058800000000000, double:98.0)
            int r11 = com.p683ss.android.ugc.aweme.base.utils.C23728o.m58241a(r1)
            com.ss.android.ugc.aweme.feed.model.Aweme r1 = r14.f78507b
            if (r1 == 0) goto L_0x02a8
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r7 = r14.f78549O
            com.ss.android.ugc.aweme.profile.model.User r1 = r1.getAuthor()
            java.lang.String r2 = "it.author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r1, r2)
            com.ss.android.ugc.aweme.base.model.UrlModel r8 = r1.getAvatarThumb()
            r1 = 101(0x65, float:1.42E-43)
            int[] r9 = com.p683ss.android.ugc.aweme.utils.C47788ct.m103417a(r1)
            java.lang.String r12 = "FeedLiveViewHolder"
            r13 = 1
            r10 = r11
            r7.mo49062a(r8, r9, r10, r11, r12, r13)
        L_0x02a8:
            android.view.View r1 = r14.f78541G
            r1.setVisibility(r5)
            android.view.View r1 = r14.f78547M
            android.view.ViewGroup$LayoutParams r1 = r1.getLayoutParams()
            if (r1 == 0) goto L_0x02d6
            android.view.ViewGroup$MarginLayoutParams r1 = (android.view.ViewGroup.MarginLayoutParams) r1
            android.content.Context r2 = r14.mo60344n()
            android.content.res.Resources r2 = r2.getResources()
            java.lang.String r3 = "context.resources"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r3)
            android.util.DisplayMetrics r2 = r2.getDisplayMetrics()
            int r2 = r2.heightPixels
            double r2 = (double) r2
            r4 = 4598175219545276416(0x3fd0000000000000, double:0.25)
            java.lang.Double.isNaN(r2)
            double r2 = r2 * r4
            int r2 = (int) r2
            r1.topMargin = r2
            goto L_0x02fa
        L_0x02d6:
            d.u r0 = new d.u
            java.lang.String r1 = "null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams"
            r0.<init>(r1)
            throw r0
        L_0x02de:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r14.f78574x
            r1.setVisibility(r4)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r14.f78575y
            android.content.Context r2 = r14.mo60344n()
            r3 = 2132547422(0x7f1c175e, float:2.074809E38)
            java.lang.String r2 = r2.getString(r3)
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            r1.setText(r2)
            com.airbnb.lottie.LottieAnimationView r1 = r14.f78576z
            r1.setVisibility(r4)
        L_0x02fa:
            com.ss.android.ugc.aweme.feed.ui.LongPressLayout r1 = r14.f78537C
            r1.setOnClickListener(r6)
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r1 = r14.f78549O
            com.ss.android.ugc.aweme.feed.adapter.l$i r2 = new com.ss.android.ugc.aweme.feed.adapter.l$i
            r2.<init>(r14)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r1 = r14.f78543I
            com.ss.android.ugc.aweme.feed.adapter.l$j r2 = new com.ss.android.ugc.aweme.feed.adapter.l$j
            r2.<init>(r14)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            android.view.View r1 = r14.f78550P
            com.ss.android.ugc.aweme.feed.adapter.l$k r2 = new com.ss.android.ugc.aweme.feed.adapter.l$k
            r2.<init>(r14)
            android.view.View$OnClickListener r2 = (android.view.View.OnClickListener) r2
            r1.setOnClickListener(r2)
            r14.mo60350O()
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.owner
            if (r0 == 0) goto L_0x032e
            com.ss.android.ugc.aweme.base.model.UrlModel r6 = r0.getAvatarLarger()
        L_0x032e:
            if (r6 == 0) goto L_0x033c
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.f78562l
            com.ss.android.ugc.aweme.feed.adapter.l$c r1 = new com.ss.android.ugc.aweme.feed.adapter.l$c
            r1.<init>(r6, r14)
            java.lang.Runnable r1 = (java.lang.Runnable) r1
            r0.post(r1)
        L_0x033c:
            r14.m70624V()
            r14.mo60352Q()
        L_0x0342:
            com.ss.android.ugc.aweme.feed.ui.LongPressLayout r0 = r14.f78537C
            com.bytedance.ies.abmock.b r1 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.DOptionsDialogPressTimeExperiment> r2 = com.p683ss.android.ugc.aweme.feed.experiment.DOptionsDialogPressTimeExperiment.class
            r3 = 1
            java.lang.String r4 = "long_press_time"
            r5 = 31744(0x7c00, float:4.4483E-41)
            r6 = 500(0x1f4, float:7.0E-43)
            int r1 = r1.mo18168a(r2, r3, r4, r5, r6)
            if (r1 <= 0) goto L_0x0358
            goto L_0x035a
        L_0x0358:
            r1 = 500(0x1f4, float:7.0E-43)
        L_0x035a:
            r0.setTimeInterval(r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.adapter.C30088l.mo60342k():void");
    }

    /* renamed from: c */
    public final void mo60227c(int i) {
        super.mo60227c(i);
        if (!this.f78559i) {
            mo60350O();
        }
    }

    /* renamed from: b */
    public final void mo60223b(int i) {
        m70622T();
        this.f78554T = true;
        this.f78553S.mo74743a();
        this.f78558X.removeMessages(100);
    }

    /* renamed from: a */
    public final void mo53995a(int i) {
        super.mo53995a(i);
        this.f78566p = true;
        this.f78557W = 0;
        this.f78568r = System.currentTimeMillis();
        FrameLayout frameLayout = this.f78572v;
        if (frameLayout != null) {
            frameLayout.setVisibility(0);
        }
        mo60352Q();
        this.f78563m.setVisibility(0);
        this.f78567q.mo74821a(false);
        this.f78554T = false;
    }

    /* renamed from: b */
    public final void mo60224b(Aweme aweme) {
        super.mo60224b(aweme);
        if (!this.f78566p) {
            this.f78563m.setVisibility(8);
        }
        this.f78561k = true;
        this.f78568r = System.currentTimeMillis();
        this.f78560j = 0;
        mo60343l();
        if (this.f78554T) {
            m70623U();
            this.f78554T = false;
        }
    }

    @C53771m
    public final void onFollowLiveStatusChange(RoomStatusEvent roomStatusEvent) {
        C52711k.m112240b(roomStatusEvent, "event");
        LiveRoomStruct liveRoomStruct = this.f78508c;
        if (liveRoomStruct != null && liveRoomStruct.f79734id == roomStatusEvent.f8660a && roomStatusEvent.f8662c) {
            this.f78559i = false;
            mo60342k();
            this.f78567q.mo74823b();
        }
    }

    /* renamed from: a */
    public final void mo53996a(Aweme aweme) {
        User user;
        super.mo53996a(aweme);
        int i = 0;
        this.f78566p = false;
        this.f78509d = new C30089a(this);
        if (this.f78556V && aweme != null) {
            if (this.f78555U == null) {
                this.f78555U = new C30769as(this.f78538D);
            }
            C30769as asVar = this.f78555U;
            if (asVar != null) {
                String str = this.f78551Q;
                C52711k.m112240b(aweme, "aweme");
                C52711k.m112240b(str, "eventType");
                asVar.f80629a = aweme;
                asVar.f80630b = str;
                if (C26469cc.m63997a(asVar.f80629a, 3)) {
                    ImageView imageView = asVar.f80631c;
                    if (imageView != null) {
                        imageView.setVisibility(8);
                    }
                } else {
                    ImageView imageView2 = asVar.f80631c;
                    if (imageView2 != null) {
                        if (!C26503d.m64062e(asVar.f80629a)) {
                            i = 8;
                        }
                        imageView2.setVisibility(i);
                    }
                }
                Aweme aweme2 = asVar.f80629a;
                if (aweme2 != null) {
                    user = aweme2.getAuthor();
                } else {
                    user = null;
                }
                asVar.mo63474a(user);
            }
        }
        this.f78569s.setBackgroundColor(this.f78506a.getResources().getColor(R.color.ip));
        C47718bf.m103290c(this);
    }

    /* renamed from: e */
    public final void mo60234e(boolean z) {
        if (z) {
            this.f78573w.animate().alpha(0.0f).setDuration(200).start();
            this.f78572v.animate().alpha(0.0f).setDuration(200).start();
            return;
        }
        this.f78573w.animate().alpha(1.0f).setDuration(200).start();
        this.f78572v.animate().alpha(1.0f).setDuration(200).start();
    }

    /* renamed from: a */
    public final void mo60355a(LiveRoomStruct liveRoomStruct) {
        int i;
        String str;
        Bundle bundle = new Bundle();
        Aweme e = mo53999e();
        if (e != null) {
            i = e.getAwemePosition();
        } else {
            i = -1;
        }
        bundle.putInt("order", i);
        C36006a b = new C36006a(this.f78513h.getContext(), liveRoomStruct.owner).mo74739b(mo60354S());
        Aweme aweme = this.f78507b;
        if (aweme != null) {
            str = aweme.getRequestId();
        } else {
            str = null;
        }
        C36006a a = b.mo74741d(str).mo74740c("live_cell").mo74736a(bundle);
        ILiveOuterService a2 = C36173w.m81665a();
        C52711k.m112236a((Object) a2, "ServiceManager.get().get…OuterService::class.java)");
        a2.getLiveWatcherUtils().mo70097a(a);
        C26890h.m65011a("live_play_page_notice", C23089d.m56640a().mo47829a("enter_from", "homepage_follow").mo47829a("notice_type", C31874a.m74294a()).mo47829a("show_cnt", String.valueOf(C31874a.m74295b())).mo47829a("yellow_dot_logid", C31874a.m74296c()).f61491a);
    }

    /* JADX WARNING: Removed duplicated region for block: B:10:0x022e  */
    /* JADX WARNING: Removed duplicated region for block: B:13:0x023d  */
    /* JADX WARNING: Removed duplicated region for block: B:15:0x0248  */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public C30088l(android.view.View r7, com.p683ss.android.ugc.aweme.feed.p1723h.C30313ae<com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw> r8, java.lang.String r9) {
        /*
            r6 = this;
            java.lang.String r0 = "view"
            p2628d.p2639f.p2641b.C52711k.m112240b(r7, r0)
            java.lang.String r0 = "eventType"
            p2628d.p2639f.p2641b.C52711k.m112240b(r9, r0)
            r6.<init>(r7, r8)
            r8 = 1
            r6.f78559i = r8
            r6.f78561k = r8
            r8 = 2132024595(0x7f141d13, float:1.968767E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.view_rootview)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            r6.f78569s = r8
            r8 = 2132022291(0x7f141413, float:1.9682997E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.riv_cover)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r8 = (com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView) r8
            r6.f78562l = r8
            r8 = 2132023896(0x7f141a58, float:1.9686253E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.tv_live_nickname)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r8
            r6.f78570t = r8
            r8 = 2132023903(0x7f141a5f, float:1.9686267E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.tv_live_title)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r8
            r6.f78571u = r8
            r8 = 2132019127(0x7f1407b7, float:1.967658E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.fl_live_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            r6.f78563m = r8
            r8 = 2132019099(0x7f14079b, float:1.9676523E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.fl_bottom_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            android.widget.FrameLayout r8 = (android.widget.FrameLayout) r8
            r6.f78572v = r8
            r8 = 2132019372(0x7f1408ac, float:1.9677077E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.gradual_bottom)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            r6.f78573w = r8
            r8 = 2132023894(0x7f141a56, float:1.9686249E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.tv_live_icon)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r8
            r6.f78574x = r8
            r8 = 2132023901(0x7f141a5d, float:1.9686263E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.tv_live_tips)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r8 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r8
            r6.f78575y = r8
            r8 = 2132020371(0x7f140c93, float:1.9679103E38)
            android.view.View r0 = r7.findViewById(r8)
            java.lang.String r1 = "view.findViewById(R.id.lav_live_playing)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.airbnb.lottie.LottieAnimationView r0 = (com.airbnb.lottie.LottieAnimationView) r0
            r6.f78576z = r0
            r0 = 2132019096(0x7f140798, float:1.9676517E38)
            android.view.View r0 = r7.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.fl_barrage_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r6.f78535A = r0
            r0 = 2132019123(0x7f1407b3, float:1.9676572E38)
            android.view.View r0 = r7.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.fl_information_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r6.f78536B = r0
            r0 = 2132020951(0x7f140ed7, float:1.968028E38)
            android.view.View r0 = r7.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.long_press_layout)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.ss.android.ugc.aweme.feed.ui.LongPressLayout r0 = (com.p683ss.android.ugc.aweme.feed.p1736ui.LongPressLayout) r0
            r6.f78537C = r0
            r0 = 2132020646(0x7f140da6, float:1.967966E38)
            android.view.View r0 = r7.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.live_avatar_s1)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r6.f78538D = r0
            r0 = 2132020802(0x7f140e42, float:1.9679977E38)
            android.view.View r0 = r7.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.ll_live_container_style_1)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r6.f78539E = r0
            r0 = 2132020770(0x7f140e22, float:1.9679913E38)
            android.view.View r0 = r7.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.ll_content_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r6.f78540F = r0
            r0 = 2132019128(0x7f1407b8, float:1.9676582E38)
            android.view.View r0 = r7.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.fl_live_end_wrapper_s1)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            r6.f78541G = r0
            r0 = 2132023898(0x7f141a5a, float:1.9686257E38)
            android.view.View r0 = r7.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.tv_live_nickname_s1)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            r6.f78542H = r0
            r0 = 2132023897(0x7f141a59, float:1.9686255E38)
            android.view.View r0 = r7.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.t…ive_nickname_live_end_s1)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            r6.f78543I = r0
            r0 = 2132023904(0x7f141a60, float:1.968627E38)
            android.view.View r0 = r7.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.tv_live_title_s1)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = (com.bytedance.ies.dmt.p664ui.widget.DmtTextView) r0
            r6.f78544J = r0
            r0 = 2132019124(0x7f1407b4, float:1.9676574E38)
            android.view.View r0 = r7.findViewById(r0)
            java.lang.String r1 = "view.findViewById(R.id.f…information_container_s1)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r1)
            android.widget.FrameLayout r0 = (android.widget.FrameLayout) r0
            r6.f78545K = r0
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.lav_live_playing)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            com.airbnb.lottie.LottieAnimationView r8 = (com.airbnb.lottie.LottieAnimationView) r8
            r6.f78546L = r8
            r8 = 2132020803(0x7f140e43, float:1.967998E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.l…ive_end_avatar_container)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            r6.f78547M = r8
            r8 = 2132020805(0x7f140e45, float:1.9679984E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.ll_live_entrance_s1)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            r6.f78548N = r8
            r8 = 2132020690(0x7f140dd2, float:1.967975E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.live_end_user_avatar)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            com.ss.android.ugc.aweme.base.ui.SmartAvatarBorderView r8 = (com.p683ss.android.ugc.aweme.base.p1420ui.SmartAvatarBorderView) r8
            r6.f78549O = r8
            r8 = 2132020804(0x7f140e44, float:1.9679981E38)
            android.view.View r8 = r7.findViewById(r8)
            java.lang.String r0 = "view.findViewById(R.id.l…ve_end_more_container_s1)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r8, r0)
            r6.f78550P = r8
            r6.f78551Q = r9
            com.ss.android.ugc.aweme.live.a.b r8 = new com.ss.android.ugc.aweme.live.a.b
            r8.<init>(r7)
            r6.f78553S = r8
            java.lang.String r7 = r6.f78551Q
            java.lang.CharSequence r7 = (java.lang.CharSequence) r7
            java.lang.String r8 = "homepage_hot"
            java.lang.CharSequence r8 = (java.lang.CharSequence) r8
            boolean r7 = android.text.TextUtils.equals(r7, r8)
            r8 = 0
            if (r7 == 0) goto L_0x01b7
        L_0x01b5:
            r7 = 0
            goto L_0x01da
        L_0x01b7:
            com.ss.android.ugc.aweme.live.ILiveOuterService r7 = com.p683ss.android.ugc.aweme.live.C36173w.m81665a()
            java.lang.String r9 = "ServiceManager.get().get…OuterService::class.java)"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r9)
            com.ss.android.ugc.aweme.live.ILiveOuterService r7 = (com.p683ss.android.ugc.aweme.live.ILiveOuterService) r7
            com.ss.android.ugc.aweme.live.d r7 = r7.getLive()
            if (r7 == 0) goto L_0x01b5
            java.lang.String r9 = "live_style"
            java.lang.Boolean r0 = java.lang.Boolean.valueOf(r8)
            java.lang.Object r7 = r7.mo15033a(r9, r0)
            java.lang.Boolean r7 = (java.lang.Boolean) r7
            if (r7 == 0) goto L_0x01b5
            boolean r7 = r7.booleanValue()
        L_0x01da:
            r6.f78556V = r7
            com.ss.android.ugc.aweme.feed.adapter.l$g r7 = new com.ss.android.ugc.aweme.feed.adapter.l$g
            android.os.Looper r9 = android.os.Looper.getMainLooper()
            r7.<init>(r6, r9)
            r6.f78558X = r7
            com.ss.android.ugc.aweme.live.ILiveOuterService r7 = com.p683ss.android.ugc.aweme.live.C36173w.m81665a()
            com.ss.android.ugc.aweme.live.ILiveOuterService r7 = (com.p683ss.android.ugc.aweme.live.ILiveOuterService) r7
            com.ss.android.ugc.aweme.feed.adapter.l$e r9 = new com.ss.android.ugc.aweme.feed.adapter.l$e
            r9.<init>(r6)
            java.lang.Runnable r9 = (java.lang.Runnable) r9
            com.ss.android.ugc.aweme.feed.adapter.l$f r0 = new com.ss.android.ugc.aweme.feed.adapter.l$f
            r0.<init>(r6)
            com.ss.android.ugc.aweme.live.d.b r0 = (com.p683ss.android.ugc.aweme.live.p1921d.C36067b) r0
            com.ss.android.ugc.aweme.live.d.c r7 = r7.generateLivePlayHelper(r9, r0)
            java.lang.String r9 = "ServiceManager.get().get…       }\n        }\n    })"
            p2628d.p2639f.p2641b.C52711k.m112236a(r7, r9)
            r6.f78567q = r7
            android.view.View r7 = r6.f78573w
            android.view.ViewGroup$LayoutParams r7 = r7.getLayoutParams()
            android.content.Context r9 = r6.f78506a
            int r9 = com.bytedance.common.utility.C9432q.m18688b(r9)
            int r9 = r9 * 3
            int r9 = r9 / 4
            r7.height = r9
            com.bytedance.ies.abmock.b r0 = com.bytedance.ies.abmock.C10181b.m20511a()
            java.lang.Class<com.ss.android.ugc.aweme.feed.experiment.FollowLiveDisplayInteractionExperiment> r1 = com.p683ss.android.ugc.aweme.feed.experiment.FollowLiveDisplayInteractionExperiment.class
            r2 = 1
            java.lang.String r3 = "follow_live_interaction_style"
            r4 = 31744(0x7c00, float:4.4483E-41)
            r5 = 0
            int r7 = r0.mo18168a(r1, r2, r3, r4, r5)
            r6.f78552R = r7
            boolean r7 = r6.f78556V
            if (r7 == 0) goto L_0x0237
            com.ss.android.ugc.aweme.feed.ui.as r7 = new com.ss.android.ugc.aweme.feed.ui.as
            android.view.View r9 = r6.f78538D
            r7.<init>(r9)
            r6.f78555U = r7
        L_0x0237:
            boolean r7 = r6.f78556V
            r9 = 8
            if (r7 == 0) goto L_0x0248
            android.view.View r7 = r6.f78539E
            r7.setVisibility(r8)
            android.view.View r7 = r6.f78540F
            r7.setVisibility(r9)
            return
        L_0x0248:
            android.view.View r7 = r6.f78539E
            r7.setVisibility(r9)
            android.view.View r7 = r6.f78540F
            r7.setVisibility(r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.adapter.C30088l.<init>(android.view.View, com.ss.android.ugc.aweme.feed.h.ae, java.lang.String):void");
    }
}
