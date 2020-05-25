package com.p683ss.android.ugc.aweme.flowfeed.p1759h;

import android.app.Activity;
import android.content.Context;
import android.graphics.Rect;
import android.os.Looper;
import android.os.Message;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.SpannableString;
import android.text.TextPaint;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.View.OnTouchListener;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import android.widget.TextView;
import com.C2240a;
import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.bytedance.common.utility.C9432q;
import com.bytedance.common.utility.p522b.C9381g;
import com.bytedance.common.utility.p522b.C9381g.C9382a;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.google.gson.C17971f;
import com.p683ss.android.ugc.aweme.C23794bh;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.base.C23515d;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.base.p1420ui.AnimationImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.AvatarImageView;
import com.p683ss.android.ugc.aweme.base.p1420ui.HollowTextView;
import com.p683ss.android.ugc.aweme.base.p1420ui.HollowTextView.C23626a;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.base.utils.C23710a;
import com.p683ss.android.ugc.aweme.base.utils.C23723j;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.comment.model.Comment;
import com.p683ss.android.ugc.aweme.commerce.model.C25519e;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import com.p683ss.android.ugc.aweme.commerce.service.models.C25560e;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.common.widget.DiggLayout;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.AwemeLinkLabel;
import com.p683ss.android.ugc.aweme.feed.model.AwemeRawAd;
import com.p683ss.android.ugc.aweme.feed.p1736ui.C30828c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LiveCircleView;
import com.p683ss.android.ugc.aweme.feed.p1736ui.LongPressLayout;
import com.p683ss.android.ugc.aweme.feed.utils.C31190f;
import com.p683ss.android.ugc.aweme.feed.widget.C31244c;
import com.p683ss.android.ugc.aweme.feed.widget.C31246e;
import com.p683ss.android.ugc.aweme.feed.widget.C31247f;
import com.p683ss.android.ugc.aweme.flowfeed.p1753b.C31753a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31754a;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31755b;
import com.p683ss.android.ugc.aweme.flowfeed.p1754c.C31758e;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedCommentLayout;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedLayout;
import com.p683ss.android.ugc.aweme.flowfeed.p1761ui.FollowFeedTagLayout2;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31837a;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31840c;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31842e;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31843f;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31845g;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31848j;
import com.p683ss.android.ugc.aweme.flowfeed.utils.C31854k;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a;
import com.p683ss.android.ugc.aweme.follow.widet.C31980a.C31988e;
import com.p683ss.android.ugc.aweme.following.p1770ui.view.FollowUserBtn;
import com.p683ss.android.ugc.aweme.forward.p1778f.C32404a;
import com.p683ss.android.ugc.aweme.forward.p1778f.C32409b;
import com.p683ss.android.ugc.aweme.live.feedpage.C36083b;
import com.p683ss.android.ugc.aweme.login.C27965f;
import com.p683ss.android.ugc.aweme.newfollow.p1998e.C37859b;
import com.p683ss.android.ugc.aweme.opensdk.p2038a.C38484a;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.p1793g.p1794a.C32800a;
import com.p683ss.android.ugc.aweme.poi.widget.RatingBar;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.shortvideo.view.C45549f;
import com.p683ss.android.ugc.aweme.story.live.C46641d;
import com.p683ss.android.ugc.aweme.util.C47620d;
import com.p683ss.android.ugc.aweme.utils.C47661ab;
import com.p683ss.android.ugc.aweme.utils.C47903fw;
import com.p683ss.android.ugc.aweme.utils.C47915gg;
import com.p683ss.android.ugc.aweme.utils.C47950q;
import com.p683ss.android.ugc.aweme.views.MentionTextView;
import com.p683ss.android.ugc.aweme.views.MentionTextView.C48160d;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import leakcanary.internal.LeakCanaryFileProvider;
import org.json.JSONException;
import org.json.JSONObject;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.ss.android.ugc.aweme.flowfeed.h.a */
public class C31782a extends C1352v implements OnAttachStateChangeListener, C9382a, C31816x {

    /* renamed from: A */
    protected ImageView f82993A;

    /* renamed from: B */
    protected TextView f82994B;

    /* renamed from: C */
    DiggLayout f82995C;

    /* renamed from: D */
    protected TextView f82996D;

    /* renamed from: E */
    protected View f82997E;

    /* renamed from: F */
    protected TextView f82998F;

    /* renamed from: G */
    protected View f82999G;

    /* renamed from: H */
    protected TextView f83000H;

    /* renamed from: I */
    FollowUserBtn f83001I;

    /* renamed from: J */
    public int f83002J;

    /* renamed from: K */
    protected FollowFeedCommentLayout f83003K;

    /* renamed from: L */
    LongPressLayout f83004L;

    /* renamed from: M */
    ImageView f83005M;

    /* renamed from: N */
    protected TextView f83006N;

    /* renamed from: O */
    TextView f83007O;

    /* renamed from: P */
    protected ViewGroup f83008P;

    /* renamed from: Q */
    protected View f83009Q;

    /* renamed from: R */
    protected ImageView f83010R;

    /* renamed from: S */
    public String f83011S;

    /* renamed from: T */
    public int f83012T;

    /* renamed from: U */
    public String f83013U;

    /* renamed from: V */
    public String f83014V;

    /* renamed from: W */
    public String f83015W;

    /* renamed from: X */
    protected boolean f83016X;

    /* renamed from: Y */
    protected C31848j f83017Y;

    /* renamed from: Z */
    protected C9381g f83018Z;

    /* renamed from: a */
    protected Aweme f83019a;

    /* renamed from: aA */
    private C1710e<C36083b> f83020aA;

    /* renamed from: aa */
    Rect f83021aa = new Rect();

    /* renamed from: ab */
    int[] f83022ab = new int[2];

    /* renamed from: ac */
    protected C32404a f83023ac;

    /* renamed from: ad */
    protected C31755b f83024ad;

    /* renamed from: ae */
    public boolean f83025ae;

    /* renamed from: af */
    public boolean f83026af = true;

    /* renamed from: ag */
    public boolean f83027ag = true;

    /* renamed from: ah */
    public String f83028ah;

    /* renamed from: ai */
    public String f83029ai;

    /* renamed from: aj */
    protected boolean f83030aj = false;

    /* renamed from: ak */
    public String f83031ak;

    /* renamed from: al */
    protected C31980a f83032al;

    /* renamed from: am */
    protected C23279d f83033am;

    /* renamed from: an */
    protected boolean f83034an = false;

    /* renamed from: ao */
    public boolean f83035ao = false;

    /* renamed from: ap */
    protected C31854k f83036ap = new C31854k() {
        /* renamed from: d */
        public final void mo56770d() {
            C31782a.this.mo64742G();
        }

        /* renamed from: e */
        public final void mo56771e() {
            C31782a.this.mo64743H();
        }

        /* renamed from: n */
        public final void mo64812n() {
            C31782a.this.mo64740E();
        }

        /* renamed from: o */
        public final void mo64813o() {
            C31782a.this.mo64741F();
        }

        /* renamed from: p */
        public final void mo64814p() {
            C31782a.this.mo64750O();
        }

        /* renamed from: a */
        public final Rect mo56766a() {
            C31782a aVar = C31782a.this;
            aVar.itemView.getLocationOnScreen(aVar.f83022ab);
            aVar.f83021aa.set(aVar.f83022ab[0], aVar.f83022ab[1], aVar.f83022ab[0] + aVar.itemView.getWidth(), aVar.f83022ab[1] + aVar.itemView.getHeight());
            return aVar.f83021aa;
        }

        /* renamed from: a */
        public final void mo56767a(int i) {
            C31782a.this.mo64766b(i);
        }

        /* renamed from: b */
        public final void mo64811b(int i) {
            C31782a.this.mo64753a(i);
        }
    };

    /* renamed from: aq */
    protected Runnable f83037aq = new Runnable() {
        public final void run() {
            if (C31782a.this.f83026af && C31782a.this.f83003K != null) {
                C31782a.this.f83003K.mo64906a();
            }
        }
    };

    /* renamed from: ar */
    public boolean f83038ar = false;

    /* renamed from: as */
    public MotionEvent f83039as;

    /* renamed from: at */
    public MotionEvent f83040at;

    /* renamed from: au */
    protected OnTouchListener f83041au = new OnTouchListener() {
        public final boolean onTouch(View view, MotionEvent motionEvent) {
            switch (motionEvent.getAction()) {
                case 0:
                    if (C31782a.this.f83018Z.hasMessages(0)) {
                        C31782a.this.f83018Z.removeMessages(0);
                    }
                    if (C31845g.m74213a(C31782a.this.f83039as, C31782a.this.f83040at, motionEvent, C31782a.this.mo64749N())) {
                        C31782a.this.f83038ar = true;
                        C31782a.this.mo64774c(C31782a.this.f83048c);
                    } else {
                        C31782a.this.f83038ar = false;
                    }
                    if (C31782a.this.f83039as != null) {
                        C31782a.this.f83039as.recycle();
                    }
                    C31782a.this.f83039as = MotionEvent.obtain(motionEvent);
                    break;
                case 1:
                    if (!C31782a.this.f83038ar && C31782a.this.f83039as != null && !C31845g.m74212a(0, C31782a.this.f83039as, motionEvent, C31782a.this.mo64749N())) {
                        C31782a.this.f83018Z.sendMessageDelayed(C31782a.this.f83018Z.obtainMessage(0), (((long) ViewConfiguration.getDoubleTapTimeout()) - motionEvent.getEventTime()) + C31782a.this.f83039as.getEventTime());
                    }
                    if (C31782a.this.f83040at != null) {
                        C31782a.this.f83040at.recycle();
                    }
                    C31782a.this.f83040at = MotionEvent.obtain(motionEvent);
                    break;
                case 2:
                    if (C31845g.m74212a(0, C31782a.this.f83039as, motionEvent, C31782a.this.mo64749N())) {
                        C31782a.this.f83018Z.removeMessages(0);
                        break;
                    }
                    break;
            }
            return false;
        }
    };

    /* renamed from: av */
    private View f83042av;

    /* renamed from: aw */
    private View f83043aw;

    /* renamed from: ax */
    private View f83044ax;

    /* renamed from: ay */
    private View f83045ay;

    /* renamed from: az */
    private boolean f83046az;

    /* renamed from: b */
    public C37859b f83047b;

    /* renamed from: c */
    public Aweme f83048c;

    /* renamed from: d */
    protected List<Comment> f83049d;

    /* renamed from: e */
    protected List<User> f83050e;

    /* renamed from: f */
    public C30828c f83051f;

    /* renamed from: g */
    public C31758e f83052g;

    /* renamed from: h */
    protected RemoteImageView f83053h;

    /* renamed from: i */
    protected View f83054i;

    /* renamed from: j */
    protected FrameLayout f83055j;

    /* renamed from: k */
    public AvatarImageView f83056k;

    /* renamed from: l */
    protected AnimationImageView f83057l;

    /* renamed from: m */
    protected AvatarImageView f83058m;

    /* renamed from: n */
    protected LiveCircleView f83059n;

    /* renamed from: o */
    protected TextView f83060o;

    /* renamed from: p */
    public TextView f83061p;

    /* renamed from: q */
    protected TextView f83062q;

    /* renamed from: r */
    RatingBar f83063r;

    /* renamed from: s */
    LinearLayout f83064s;

    /* renamed from: t */
    HollowTextView f83065t;

    /* renamed from: u */
    protected FollowFeedTagLayout2 f83066u;

    /* renamed from: v */
    protected MentionTextView f83067v;

    /* renamed from: w */
    protected ImageView f83068w;

    /* renamed from: x */
    protected TextView f83069x;

    /* renamed from: y */
    ImageView f83070y;

    /* renamed from: z */
    TextView f83071z;

    /* access modifiers changed from: protected */
    /* renamed from: C */
    public void mo64738C() {
    }

    /* renamed from: F */
    public void mo64741F() {
    }

    /* renamed from: H */
    public void mo64743H() {
        mo64838W();
    }

    /* renamed from: K */
    public void mo64746K() {
    }

    /* renamed from: L */
    public void mo64747L() {
        this.f83016X = false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: M */
    public void mo64748M() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: O */
    public void mo64750O() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: P */
    public void mo64751P() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: Q */
    public void mo64752Q() {
    }

    /* renamed from: a */
    public void mo64753a(int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64755a(Context context, int i) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64756a(View view) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public boolean mo64769b() {
        return false;
    }

    /* renamed from: c */
    public String mo64771c() {
        return this.f83011S;
    }

    /* access modifiers changed from: protected */
    /* renamed from: e */
    public void mo64778e() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public void mo64781f() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: f */
    public boolean mo64783f(String str) {
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo64786g(String str) {
    }

    /* renamed from: o */
    public void mo64797o() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: z */
    public void mo64810z() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo64765a() {
        return this.f83025ae && this.f83024ad.mo64654a();
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64764a(FollowFeedLayout followFeedLayout) {
        this.f83053h = (RemoteImageView) followFeedLayout.findViewById(R.id.azj);
        this.f83054i = followFeedLayout.findViewById(R.id.b7t);
        this.f83055j = (FrameLayout) followFeedLayout.findViewById(R.id.b6z);
        this.f83056k = (AvatarImageView) followFeedLayout.findViewById(R.id.dm3);
        this.f83057l = (AnimationImageView) followFeedLayout.findViewById(R.id.i4);
        this.f83058m = (AvatarImageView) followFeedLayout.findViewById(R.id.dm9);
        this.f83059n = (LiveCircleView) followFeedLayout.findViewById(R.id.dn0);
        this.f83060o = (TextView) followFeedLayout.findViewById(R.id.d92);
        this.f83061p = (TextView) followFeedLayout.findViewById(R.id.dic);
        this.f83062q = (TextView) followFeedLayout.findViewById(R.id.deg);
        this.f83063r = (RatingBar) followFeedLayout.findViewById(R.id.c8n);
        this.f83064s = (LinearLayout) followFeedLayout.findViewById(R.id.a1m);
        this.f83066u = (FollowFeedTagLayout2) followFeedLayout.findViewById(R.id.ai5);
        this.f83067v = (MentionTextView) followFeedLayout.findViewById(R.id.d98);
        this.f83068w = (ImageView) followFeedLayout.findViewById(R.id.a5m);
        this.f83069x = (TextView) followFeedLayout.findViewById(R.id.d9h);
        this.f83070y = (ImageView) followFeedLayout.findViewById(R.id.azd);
        this.f83071z = (TextView) followFeedLayout.findViewById(R.id.d8_);
        this.f82993A = (ImageView) followFeedLayout.findViewById(R.id.cn8);
        this.f82994B = (TextView) followFeedLayout.findViewById(R.id.dfu);
        this.f82995C = (DiggLayout) followFeedLayout.findViewById(R.id.a5q);
        this.f82996D = (TextView) followFeedLayout.findViewById(R.id.dfy);
        this.f82997E = followFeedLayout.findViewById(R.id.bge);
        this.f82998F = (TextView) followFeedLayout.findViewById(R.id.cnz);
        this.f82999G = followFeedLayout.findViewById(R.id.co0);
        this.f83000H = (TextView) followFeedLayout.findViewById(R.id.dfx);
        this.f83001I = (FollowUserBtn) followFeedLayout.findViewById(R.id.ai0);
        this.f83003K = (FollowFeedCommentLayout) followFeedLayout.findViewById(R.id.b7o);
        this.f83004L = (LongPressLayout) followFeedLayout.findViewById(R.id.bji);
        this.f83005M = (ImageView) followFeedLayout.findViewById(R.id.b0u);
        this.f83006N = (TextView) followFeedLayout.findViewById(R.id.dh1);
        this.f83007O = (TextView) followFeedLayout.findViewById(R.id.d_p);
        this.f83008P = (ViewGroup) followFeedLayout.findViewById(R.id.b7s);
        this.f83009Q = followFeedLayout.findViewById(R.id.bay);
        this.f83042av = followFeedLayout.findViewById(R.id.b77);
        this.f83043aw = followFeedLayout.findViewById(R.id.b7f);
        this.f83044ax = followFeedLayout.findViewById(R.id.b9n);
        this.f83045ay = followFeedLayout.findViewById(R.id.b6v);
        this.f83010R = (ImageView) followFeedLayout.findViewById(R.id.b0g);
        this.f83002J = followFeedLayout.getContext().getResources().getDimensionPixelSize(R.dimen.zt);
        if (this.f83008P != null) {
            this.f83008P.setOnClickListener(new C31792c(this));
        }
        if (this.f83042av != null) {
            this.f83042av.setOnClickListener(new C31796g(this));
        }
        if (this.f83044ax != null) {
            this.f83044ax.setOnClickListener(new C31797h(this));
        }
        if (this.f83043aw != null) {
            this.f83043aw.setOnClickListener(new C31798i(this));
        }
        if (this.f82996D != null) {
            this.f82996D.setOnClickListener(new C31799j(this));
        }
        if (this.f82997E != null) {
            this.f82997E.setOnClickListener(new C31800k(this));
        }
        if (this.f83045ay != null) {
            this.f83045ay.setOnClickListener(new C31801l(this));
        }
        if (this.f83010R != null) {
            this.f83010R.setOnClickListener(new C31802m(this));
        }
    }

    /* renamed from: a */
    public void mo64762a(Aweme aweme, List<Comment> list, List<User> list2, C31758e eVar) {
        this.f83048c = aweme;
        this.f83034an = C26503d.m64061d(aweme);
        this.itemView.setTag(aweme);
        this.f83049d = list;
        this.f83052g = eVar;
        this.f83050e = list2;
        if (this.f83048c != null) {
            mo64778e();
            mo64784g();
        }
        mo64739D();
        this.f83046az = false;
    }

    /* JADX WARNING: Removed duplicated region for block: B:23:0x007a  */
    /* JADX WARNING: Removed duplicated region for block: B:24:0x0082  */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo64763a(com.p683ss.android.ugc.aweme.feed.model.AwemeStatus r4, com.p683ss.android.ugc.aweme.base.model.UrlModel r5) {
        /*
            r3 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f83048c
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r0.getStatus()
            if (r0 == 0) goto L_0x0015
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r3.f83048c
            com.ss.android.ugc.aweme.feed.model.AwemeStatus r0 = r0.getStatus()
            int r4 = r4.getPrivateStatus()
            r0.setPrivateStatus(r4)
        L_0x0015:
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r3.f83048c
            r4.setLabelPrivate(r5)
            r4 = 0
            r0 = 1
            if (r5 == 0) goto L_0x0029
            com.ss.android.ugc.aweme.feed.model.AwemeLabelModel r4 = new com.ss.android.ugc.aweme.feed.model.AwemeLabelModel
            r4.<init>()
            r4.setLabelType(r0)
            r4.setUrlModels(r5)
        L_0x0029:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.f83048c
            if (r5 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.f83048c
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r5 = r5.videoLabels
            if (r5 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.f83048c
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r5 = r5.videoLabels
            int r5 = r5.size()
            r1 = 0
            if (r5 != 0) goto L_0x0048
            if (r4 == 0) goto L_0x008a
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.f83048c
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r5 = r5.videoLabels
            r5.add(r1, r4)
            return
        L_0x0048:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.f83048c
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r5 = r5.videoLabels
            int r5 = r5.size()
            if (r1 >= r5) goto L_0x008a
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.f83048c
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r5 = r5.videoLabels
            java.lang.Object r5 = r5.get(r1)
            com.ss.android.ugc.aweme.feed.model.AwemeLabelModel r5 = (com.p683ss.android.ugc.aweme.feed.model.AwemeLabelModel) r5
            int r5 = r5.getLabelType()
            r2 = 11
            if (r5 == r2) goto L_0x0078
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.f83048c
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r5 = r5.videoLabels
            java.lang.Object r5 = r5.get(r1)
            com.ss.android.ugc.aweme.feed.model.AwemeLabelModel r5 = (com.p683ss.android.ugc.aweme.feed.model.AwemeLabelModel) r5
            int r5 = r5.getLabelType()
            if (r5 != r0) goto L_0x0075
            goto L_0x0078
        L_0x0075:
            int r1 = r1 + 1
            goto L_0x0048
        L_0x0078:
            if (r4 != 0) goto L_0x0082
            com.ss.android.ugc.aweme.feed.model.Aweme r4 = r3.f83048c
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r4 = r4.videoLabels
            r4.remove(r1)
            goto L_0x008a
        L_0x0082:
            com.ss.android.ugc.aweme.feed.model.Aweme r5 = r3.f83048c
            java.util.List<com.ss.android.ugc.aweme.feed.model.AwemeLabelModel> r5 = r5.videoLabels
            r5.set(r1, r4)
            return
        L_0x008a:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31782a.mo64763a(com.ss.android.ugc.aweme.feed.model.AwemeStatus, com.ss.android.ugc.aweme.base.model.UrlModel):void");
    }

    /* renamed from: G */
    public void mo64742G() {
        this.f83018Z.removeCallbacks(this.f83037aq);
    }

    /* renamed from: N */
    public final Context mo64749N() {
        return this.f83024ad.mo64656c();
    }

    /* access modifiers changed from: protected */
    /* renamed from: x */
    public void mo64808x() {
        this.f83053h.setVisibility(0);
    }

    /* access modifiers changed from: protected */
    /* renamed from: y */
    public final void mo64809y() {
        this.f83053h.setVisibility(8);
    }

    /* renamed from: U */
    private boolean mo64836U() {
        if (mo64835T() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: W */
    private void mo64838W() {
        C31842e D = mo64739D();
        if (D != null) {
            D.mo64944a(mo64771c());
        }
    }

    /* renamed from: X */
    private void mo64839X() {
        C31842e D = mo64739D();
        if (D != null) {
            D.mo64947b(mo64771c());
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: A */
    public void mo64736A() {
        if (this.f83051f != null) {
            this.f83051f.mo63566c();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: B */
    public void mo64737B() {
        if (this.f83051f != null) {
            this.f83051f.mo63567d();
        }
    }

    /* renamed from: E */
    public void mo64740E() {
        if (this.f83066u != null) {
            this.f83066u.mo64928c();
        }
    }

    /* renamed from: J */
    public void mo64745J() {
        this.f83016X = true;
        if (!mo64744I()) {
            mo64839X();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: j */
    public void mo64791j() {
        if (this.f83010R != null) {
            this.f83010R.setVisibility(8);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: n */
    public final void mo64796n() {
        this.f82995C.removeAllViews();
        this.f83023ac.mo65599a(this.f83048c);
    }

    /* renamed from: w */
    public void mo64807w() {
        List v = mo64806v();
        if (this.f83052g != null) {
            this.f83052g.mo64665a(this.f83048c, v);
        }
    }

    /* renamed from: V */
    private boolean mo64837V() {
        if (!C26503d.m64061d(this.f83048c) || !this.f83048c.getAwemeRawAd().disableShowLinkLabel) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: I */
    public final boolean mo64744I() {
        C31842e D = mo64739D();
        if (D == null || !D.f83202c.mo95019c(16777216)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: protected */
    /* renamed from: d */
    public final void mo64775d() {
        if (this.f83048c != null) {
            C31843f.m74206a().mo64952b(C31842e.m74200a(this.f83024ad.mo64657d(), this.f83048c.getAid()));
        }
    }

    /* renamed from: m */
    public void mo64795m() {
        mo64796n();
        if (!mo64769b()) {
            mo64800p();
            mo64802r();
        }
        mo64797o();
    }

    /* renamed from: q */
    public final void mo64801q() {
        if (mo64769b() && this.f83003K != null) {
            this.f83003K.mo64911c();
        }
        mo64796n();
    }

    /* renamed from: T */
    private int mo64835T() {
        if (!C26503d.m64061d(this.f83048c) || !TextUtils.equals(mo64771c(), "general_search")) {
            return -1;
        }
        AwemeRawAd awemeRawAd = this.f83048c.getAwemeRawAd();
        if (awemeRawAd.getLinkLabel() == null) {
            return -1;
        }
        return awemeRawAd.getLinkLabel().getStyleType();
    }

    /* access modifiers changed from: protected */
    /* renamed from: D */
    public final C31842e mo64739D() {
        C31842e eVar;
        if (this.f83048c != null) {
            eVar = C31843f.m74206a().mo64954c(C31842e.m74200a(this.f83024ad.mo64657d(), this.f83048c.getAid()));
        } else {
            eVar = null;
        }
        if (eVar == null) {
            return mo64833R();
        }
        return eVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: h */
    public void mo64787h() {
        if (C31753a.m73741b(this.f83048c)) {
            this.f82993A.setAlpha(0.5f);
            this.f82993A.setEnabled(false);
            return;
        }
        this.f82993A.setAlpha(1.0f);
        this.f82993A.setEnabled(true);
    }

    /* access modifiers changed from: protected */
    /* renamed from: k */
    public void mo64793k() {
        if (!this.f83026af || !this.f83027ag) {
            this.f83009Q.setVisibility(8);
        } else {
            this.f83009Q.setVisibility(0);
        }
        if ("poi_page".equalsIgnoreCase(mo64771c())) {
            if (this.f83027ag) {
                this.f83009Q.setVisibility(0);
                return;
            }
            this.f83009Q.setVisibility(8);
        }
    }

    /* renamed from: p */
    public final void mo64800p() {
        if (!mo64769b()) {
            String d = C31753a.m73744d(this.f83048c);
            if (!TextUtils.isEmpty(d)) {
                this.f83071z.setText(d);
            }
        } else if (this.f83003K != null) {
            this.f83003K.mo64909b();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: t */
    public final boolean mo64804t() {
        if (!C26503d.m64061d(this.f83048c)) {
            return false;
        }
        AwemeRawAd awemeRawAd = this.f83048c.getAwemeRawAd();
        if (awemeRawAd.getOutFlowButtonStyle() == 1 || awemeRawAd.getOutFlowButtonStyle() == 2) {
            return true;
        }
        return false;
    }

    /* access modifiers changed from: protected */
    /* renamed from: u */
    public void mo64805u() {
        if (this.f83056k != null) {
            this.f83056k.setOnClickListener(new C31793d(this));
        }
        if (this.f83058m != null) {
            this.f83058m.setOnClickListener(new C31794e(this));
        }
        if (this.f83061p != null) {
            this.f83061p.setOnClickListener(new C31795f(this));
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: v */
    public List<String> mo64806v() {
        ArrayList arrayList = new ArrayList();
        if (mo64769b()) {
            arrayList.add(mo64749N().getString(R.string.dhj));
        }
        if (!C31190f.m72831a(this.f83048c) && C47915gg.m103646a(this.f83048c)) {
            arrayList.add(mo64749N().getString(R.string.f9m));
        }
        return arrayList;
    }

    /* JADX WARNING: type inference failed for: r1v0 */
    /* JADX WARNING: type inference failed for: r1v1, types: [com.ss.android.ugc.aweme.flowfeed.utils.e] */
    /* JADX WARNING: type inference failed for: r1v2, types: [com.ss.android.ugc.aweme.flowfeed.utils.e] */
    /* JADX WARNING: type inference failed for: r2v4, types: [com.ss.android.ugc.aweme.flowfeed.utils.e] */
    /* JADX WARNING: type inference failed for: r1v3 */
    /* JADX WARNING: type inference failed for: r1v4, types: [com.ss.android.ugc.aweme.forward.f.c] */
    /* JADX WARNING: type inference failed for: r1v8, types: [com.ss.android.ugc.aweme.forward.f.c] */
    /* JADX WARNING: type inference failed for: r1v9, types: [com.ss.android.ugc.aweme.flowfeed.utils.e] */
    /* JADX WARNING: type inference failed for: r1v10 */
    /* JADX WARNING: type inference failed for: r1v11 */
    /* JADX WARNING: type inference failed for: r1v12 */
    /* JADX WARNING: Multi-variable type inference failed. Error: jadx.core.utils.exceptions.JadxRuntimeException: No candidate types for var: r1v0
      assigns: [?[int, float, boolean, short, byte, char, OBJECT, ARRAY], com.ss.android.ugc.aweme.forward.f.c]
      uses: [?[int, boolean, OBJECT, ARRAY, byte, short, char], com.ss.android.ugc.aweme.forward.f.c, com.ss.android.ugc.aweme.flowfeed.utils.e]
      mth insns count: 40
    	at jadx.core.dex.visitors.typeinference.TypeSearch.fillTypeCandidates(TypeSearch.java:237)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.typeinference.TypeSearch.run(TypeSearch.java:53)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.runMultiVariableSearch(TypeInferenceVisitor.java:99)
    	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:92)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:27)
    	at jadx.core.dex.visitors.DepthTraversal.lambda$visit$1(DepthTraversal.java:14)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.dex.visitors.DepthTraversal.visit(DepthTraversal.java:14)
    	at jadx.core.ProcessClass.process(ProcessClass.java:30)
    	at jadx.core.ProcessClass.lambda$processDependencies$0(ProcessClass.java:49)
    	at java.base/java.util.ArrayList.forEach(ArrayList.java:1540)
    	at jadx.core.ProcessClass.processDependencies(ProcessClass.java:49)
    	at jadx.core.ProcessClass.process(ProcessClass.java:35)
    	at jadx.api.JadxDecompiler.processClass(JadxDecompiler.java:311)
    	at jadx.api.JavaClass.decompile(JavaClass.java:62)
    	at jadx.api.JadxDecompiler.lambda$appendSourcesSave$0(JadxDecompiler.java:217)
     */
    /* JADX WARNING: Unknown variable types count: 5 */
    /* renamed from: R */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    private com.p683ss.android.ugc.aweme.flowfeed.utils.C31842e mo64833R() {
        /*
            r6 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r6.f83048c
            r1 = 0
            if (r0 == 0) goto L_0x0067
            com.ss.android.ugc.aweme.flowfeed.c.b r0 = r6.f83024ad
            java.lang.String r0 = r0.mo64657d()
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f83048c
            java.lang.String r2 = r2.getAid()
            java.lang.String r0 = com.p683ss.android.ugc.aweme.flowfeed.utils.C31842e.m74200a(r0, r2)
            boolean r2 = r6.f83026af
            if (r2 == 0) goto L_0x002b
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f83048c
            if (r2 == 0) goto L_0x0066
            com.ss.android.ugc.aweme.flowfeed.utils.e r1 = new com.ss.android.ugc.aweme.flowfeed.utils.e
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r6.f83048c
            com.ss.android.ugc.aweme.utils.bl r3 = new com.ss.android.ugc.aweme.utils.bl
            r4 = 1
            r3.<init>(r4)
            r1.<init>(r2, r3, r0)
            goto L_0x005f
        L_0x002b:
            com.ss.android.ugc.aweme.flowfeed.utils.e r2 = new com.ss.android.ugc.aweme.flowfeed.utils.e
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r6.f83048c
            com.ss.android.ugc.aweme.utils.bl r4 = new com.ss.android.ugc.aweme.utils.bl
            r5 = 256(0x100, float:3.59E-43)
            r4.<init>(r5)
            r2.<init>(r3, r4, r0)
            java.lang.String r3 = r6.f83028ah
            boolean r3 = android.text.TextUtils.isEmpty(r3)
            if (r3 != 0) goto L_0x005e
            com.ss.android.ugc.aweme.forward.f.d r3 = com.p683ss.android.ugc.aweme.forward.p1778f.C32411d.m74938a()
            java.lang.String r4 = r6.f83028ah
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.forward.f.c> r5 = r3.f84344a
            boolean r5 = r5.isEmpty()
            if (r5 == 0) goto L_0x0050
            goto L_0x0058
        L_0x0050:
            java.util.Map<java.lang.String, com.ss.android.ugc.aweme.forward.f.c> r1 = r3.f84344a
            java.lang.Object r1 = r1.get(r4)
            com.ss.android.ugc.aweme.forward.f.c r1 = (com.p683ss.android.ugc.aweme.forward.p1778f.C32410c) r1
        L_0x0058:
            if (r1 == 0) goto L_0x005e
            com.ss.android.ugc.aweme.video.h r1 = r1.f84343c
            r2.f83207h = r1
        L_0x005e:
            r1 = r2
        L_0x005f:
            com.ss.android.ugc.aweme.flowfeed.utils.f r2 = com.p683ss.android.ugc.aweme.flowfeed.utils.C31843f.m74206a()
            r2.mo64951a(r0, r1)
        L_0x0066:
            return r1
        L_0x0067:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.flowfeed.p1759h.C31782a.mo64833R():com.ss.android.ugc.aweme.flowfeed.utils.e");
    }

    /* renamed from: S */
    private HollowTextView mo64834S() {
        C23626a aVar = new C23626a();
        aVar.f62958b = C23728o.m58241a(12.0d);
        aVar.f62959c = C23723j.m58216a(R.color.iu);
        aVar.f62960d = C23728o.m58241a(4.0d);
        aVar.f62963g = true;
        aVar.f62962f = true;
        aVar.f62964h = true;
        aVar.f62961e = true;
        HollowTextView hollowTextView = new HollowTextView(mo64749N(), aVar);
        hollowTextView.setPadding(C23728o.m58241a(5.0d), C23728o.m58241a(3.5d), C23728o.m58241a(5.0d), C23728o.m58241a(3.5d));
        return hollowTextView;
    }

    /* access modifiers changed from: protected */
    /* renamed from: r */
    public void mo64802r() {
        switch (C31753a.m73747g(this.f83048c)) {
            case 2:
                this.f82994B.setVisibility(0);
                this.f82994B.setTextSize(1, 10.0f);
                this.f82994B.setText(R.string.fbv);
                return;
            case 3:
                this.f82994B.setVisibility(0);
                this.f82994B.setTextSize(1, 12.0f);
                this.f82994B.setText(C31753a.m73746f(this.f83048c));
                return;
            default:
                this.f82994B.setVisibility(8);
                return;
        }
    }

    public final void bc_() {
        if (this.f83065t == null) {
            this.f83065t = mo64834S();
        }
        this.f83064s.removeAllViews();
        this.f83064s.addView(this.f83065t);
        if (C31753a.m73743c(this.f83048c)) {
            if (C47950q.m103755d(this.f83048c)) {
                this.f83064s.setVisibility(0);
                this.f83065t.setVisibility(0);
                this.f83065t.setText(mo64749N().getString(R.string.dx2));
            } else if (C47950q.m103754c(this.f83048c)) {
                this.f83064s.setVisibility(0);
                this.f83065t.setVisibility(0);
                this.f83065t.setText(mo64749N().getString(R.string.b73));
            } else {
                this.f83064s.setVisibility(8);
                this.f83064s.removeAllViews();
            }
        } else if (C47950q.m103754c(this.f83048c)) {
            this.f83064s.setVisibility(0);
            this.f83065t.setVisibility(0);
            this.f83065t.setText(mo64749N().getString(R.string.b73));
        } else {
            this.f83065t.setVisibility(8);
            this.f83064s.removeAllViews();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: i */
    public void mo64789i() {
        UrlModel urlModel;
        UrlModel urlModel2;
        boolean z;
        mo64791j();
        if (!(this.f83001I.getVisibility() != 0 || this.f83048c == null || this.f83048c.getAuthor() == null)) {
            this.f83032al.mo65173a(this.f83048c.getAuthor());
        }
        String str = null;
        if (this.f83048c.getAuthor() != null) {
            if (this.f82993A != null) {
                if (C31753a.m73743c(this.f83048c)) {
                    this.f82993A.setImageResource(R.drawable.cxd);
                } else {
                    this.f82993A.setImageResource(R.drawable.cxh);
                }
            }
            if (this.f83026af) {
                this.f83054i.setVisibility(0);
                if (this.f83051f == null) {
                    if (this.f83048c.getAuthor() == null || !this.f83048c.getAuthor().isLive()) {
                        z = false;
                    } else {
                        z = true;
                    }
                    this.f83051f = new C30828c(z, this.f83058m, this.f83056k, this.f83059n);
                }
                if (this.f83020aA == null) {
                    this.f83020aA = new C1710e<C36083b>() {
                        public final /* synthetic */ void accept(Object obj) throws Exception {
                            C36083b bVar = (C36083b) obj;
                            if (TextUtils.equals(C31782a.this.f83048c.getAuthor().getUid(), String.valueOf(bVar.f92446a))) {
                                C31782a.this.f83048c.getAuthor().roomId = bVar.f92447b;
                                if (!C31782a.this.f83048c.getAuthor().isLive()) {
                                    C31782a.this.mo64789i();
                                }
                            }
                        }
                    };
                }
                if (C31753a.m73739a(this.f83048c)) {
                    AvatarImageView avatarImageView = this.f83058m;
                    if (this.f83048c.getAuthor() == null) {
                        urlModel2 = null;
                    } else {
                        urlModel2 = this.f83048c.getAuthor().getAvatarThumb();
                    }
                    C23515d.m57670a((RemoteImageView) avatarImageView, urlModel2, this.f83002J, this.f83002J);
                    C23794bh.m58392f().mo64985a(this.f83048c);
                } else {
                    AvatarImageView avatarImageView2 = this.f83056k;
                    if (this.f83048c.getAuthor() == null) {
                        urlModel = null;
                    } else {
                        urlModel = this.f83048c.getAuthor().getAvatarThumb();
                    }
                    C23515d.m57670a((RemoteImageView) avatarImageView2, urlModel, this.f83002J, this.f83002J);
                }
                this.f83051f.mo63563a(this.f83048c.getAuthor(), getClass(), this.f83020aA);
            } else {
                this.f83054i.setVisibility(8);
            }
        }
        if (this.f83048c.getAuthor() != null) {
            if (this.f83048c.getAuthor() != null) {
                str = this.f83048c.getAuthor().getRemarkName();
            }
            if (!TextUtils.isEmpty(str)) {
                this.f83061p.setText(this.f83048c.getAuthor().getRemarkName());
            } else {
                this.f83061p.setText(C23710a.m58189a(this.itemView.getContext(), this.f83048c.getAuthor().getNickname(), this.f83048c.getNicknamePosition()));
            }
        }
        if (this.f83063r != null) {
            if (TextUtils.isEmpty(this.f83048c.getRateScore()) || !"rate".equalsIgnoreCase(this.f83015W)) {
                this.f83063r.setVisibility(8);
            } else {
                this.f83063r.setVisibility(0);
                this.f83063r.setStar(Float.parseFloat(this.f83048c.getRateScore()));
            }
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: g */
    public void mo64784g() {
        boolean z;
        if (this.f83048c != null) {
            mo64781f();
            mo64789i();
            if (this.f83048c == null || this.f83048c.getAuthor() == null || TextUtils.isEmpty(this.f83048c.getAuthor().getRelationLabel())) {
                this.f83006N.setVisibility(8);
            } else {
                this.f83006N.setVisibility(0);
                this.f83006N.setText(this.f83048c.getAuthor().getRelationLabel());
            }
            mo64787h();
            JSONObject jSONObject = new JSONObject();
            try {
                jSONObject.put("request_id", this.f83048c.getRequestId());
            } catch (JSONException unused) {
            }
            this.f83066u.setVisibility(0);
            this.f83066u.setPageType(this.f83012T);
            this.f83066u.setFollowPageType(this.f83013U);
            this.f83066u.mo64926a(this.f83048c, (Activity) mo64749N(), this.f83011S, jSONObject);
            if ("poi_page".equalsIgnoreCase(this.f83011S)) {
                this.f83066u.mo64927b();
            }
            String b = C47903fw.m103625b(mo64749N(), this.f83048c.getCreateTime() * 1000);
            if (!(this.f83048c.getAnchorInfo() == null || this.f83048c.getAnchorInfo().getType() == null || this.f83048c.getAnchorInfo().getType().intValue() != 15)) {
                try {
                    C38484a aVar = (C38484a) new C17971f().mo34884a(this.f83048c.getAnchorInfo().getExtra(), C38484a.class);
                    if (!(aVar == null || aVar.getBaseInfo() == null || aVar.getBaseInfo().getAppName() == null)) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(b);
                        sb.append("  ");
                        sb.append(aVar.getBaseInfo().getAppName());
                        b = sb.toString();
                    }
                } catch (Exception unused2) {
                }
            }
            this.f83060o.setText(b);
            mo64803s();
            mo64795m();
            mo64805u();
            bc_();
            if (this.f83003K != null) {
                if (this.f83026af) {
                    this.f83003K.setVisibility(0);
                    this.f83003K.setPageType(this.f83012T);
                    this.f83003K.setEventType(this.f83011S);
                    this.f83003K.mo64908a(this.f83048c, this.f83049d, this.f83050e, this.f83052g);
                } else {
                    this.f83003K.setVisibility(8);
                }
                if (this.f83023ac != null) {
                    this.f83023ac.f84320b = this.f83003K.getLayoutLikes();
                }
            }
            if (this.f83048c.getStatus() == null || !this.f83048c.getStatus().isWithGoods() || this.f83048c.getPromotion() == null) {
                z = false;
            } else {
                z = true;
            }
            C47620d.m103097a(this.f83048c);
            if (z) {
                this.f82996D.setVisibility(0);
                this.f82997E.setVisibility(8);
                this.f82996D.setText(this.f83048c.getPromotion().getShortTitle());
                if (this.f83048c.getPromotion() != null) {
                    C25519e promotion = this.f83048c.getPromotion();
                    C25560e eVar = new C25560e();
                    eVar.f67571d = this.f83048c.getAuthorUid();
                    eVar.f67576i = "video_cart_tag";
                    eVar.f67573f = promotion.getPromotionId();
                    eVar.f67574g = Long.valueOf((long) promotion.getPromotionSource());
                    eVar.f67569b = this.f83011S;
                    eVar.f67570c = this.f83048c.getAid();
                    eVar.f67578k = Integer.valueOf(this.f83048c.getFollowStatus());
                    eVar.f67568a = C41431k.f105004a.getSearchStatisticsMap(mo64749N(), this.f83048c);
                    C25539a.m62079a().logCommerceEvents("product_entrance_show", eVar);
                    C25560e eVar2 = new C25560e();
                    eVar2.f67571d = this.f83048c.getAuthorUid();
                    eVar2.f67576i = "video_cart_tag";
                    eVar2.f67573f = promotion.getPromotionId();
                    eVar2.f67574g = Long.valueOf((long) promotion.getPromotionSource());
                    eVar2.f67569b = this.f83011S;
                    eVar2.f67570c = this.f83048c.getAid();
                    eVar2.f67577j = "video_play";
                    eVar2.f67575h = this.f83011S;
                    eVar2.f67578k = Integer.valueOf(this.f83048c.getFollowStatus());
                    eVar2.f67568a = C41431k.f105004a.getSearchStatisticsMap(mo64749N(), this.f83048c);
                    C25539a.m62079a().logCommerceEvents("show_product", eVar2);
                }
            } else {
                this.f82996D.setVisibility(8);
                this.f82997E.setVisibility(8);
            }
            mo64793k();
            mo64751P();
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: s */
    public void mo64803s() {
        boolean z;
        SpannableString spannableString;
        C31247f fVar;
        this.f83067v.setMaxSize(NormalGiftView.MASK_TRANSLATE_VALUE);
        String desc = this.f83048c.getDesc();
        if (!TextUtils.isEmpty(desc)) {
            int length = desc.length();
            if (!C26503d.m64061d(this.f83048c) || mo64804t() || mo64837V() || (!mo64836U() && TextUtils.isEmpty(this.f83048c.getAwemeRawAd().getButtonText()))) {
                z = false;
            } else {
                z = true;
            }
            if (z) {
                if (desc.length() > 150) {
                    String substring = desc.substring(0, 147);
                    StringBuilder sb = new StringBuilder();
                    sb.append(substring);
                    sb.append("...");
                    desc = sb.toString();
                }
                length = desc.length();
                if (mo64836U()) {
                    AwemeLinkLabel linkLabel = this.f83048c.getAwemeRawAd().getLinkLabel();
                    C31244c cVar = new C31244c(mo64749N(), linkLabel.getText(), linkLabel.getColorText(), R.drawable.cxo, linkLabel.getColorIcon());
                    fVar = cVar;
                } else {
                    C31247f fVar2 = new C31247f(mo64749N(), R.color.cg, this.f83048c.getAwemeRawAd().getButtonText(), R.drawable.dg7, 20);
                    fVar = fVar2;
                }
                Aweme aweme = this.f83048c;
                StringBuilder sb2 = new StringBuilder();
                sb2.append(desc);
                sb2.append(" [t]");
                spannableString = m73932a(aweme, sb2.toString());
                spannableString.setSpan(new ClickableSpan() {
                    public final void onClick(View view) {
                        if (!C32800a.m75679a(view)) {
                            C31782a.this.mo64752Q();
                        }
                    }
                }, desc.length() + 1, desc.length() + 4, 17);
                spannableString.setSpan(fVar, desc.length() + 1, desc.length() + 4, 17);
                this.f83067v.setMaxSize(spannableString.length());
            } else if (mo64804t() || mo64837V()) {
                if (desc.length() > 150) {
                    String substring2 = desc.substring(0, 147);
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(substring2);
                    sb3.append("...");
                    desc = sb3.toString();
                }
                length = desc.length();
                spannableString = m73932a(this.f83048c, desc);
                this.f83067v.setMaxSize(spannableString.length());
            } else if (C23794bh.m58393g().mo75754a(this.f83048c)) {
                if (desc.length() > 150) {
                    String substring3 = desc.substring(0, 147);
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(substring3);
                    sb4.append("...");
                    desc = sb4.toString();
                }
                length = desc.length();
                Aweme aweme2 = this.f83048c;
                StringBuilder sb5 = new StringBuilder();
                sb5.append(desc);
                sb5.append(" [r]");
                spannableString = m73932a(aweme2, sb5.toString());
                C31246e eVar = new C31246e(this.itemView.getContext(), R.color.cg, C2240a.m6772a(this.itemView.getContext().getString(R.string.b7s), new Object[]{C23794bh.m58393g().mo75756c(this.f83048c)}), R.drawable.cxp);
                spannableString.setSpan(new ClickableSpan() {
                    public final void onClick(View view) {
                        if (!C32800a.m75679a(view)) {
                            C23794bh.m58393g().mo75753a(C31782a.this.itemView.getContext(), C31782a.this.f83048c, C31782a.this.f83011S, C31782a.this.f83012T);
                        }
                    }
                }, desc.length() + 1, desc.length() + 4, 17);
                spannableString.setSpan(eVar, desc.length() + 1, desc.length() + 4, 17);
                this.f83067v.setMaxSize(spannableString.length());
                C26890h.m65011a("show_complete_video_entrance", C23089d.m56640a().mo47829a("log_pb", C29981aa.m70153a().mo60161a(this.f83048c.getAid())).mo47827a("local_time_ms", System.currentTimeMillis()).mo47829a("enter_from", this.f83011S).mo47829a("group_id", this.f83048c.getAid()).f61491a);
            } else {
                spannableString = m73932a(this.f83048c, desc);
            }
            if (C26503d.m64061d(this.f83048c) && length > 0 && !TextUtils.isEmpty(spannableString)) {
                if (length > spannableString.length()) {
                    length = spannableString.length();
                }
                if (this.f83048c.getAwemeRawAd().getEnableDescClick()) {
                    spannableString.setSpan(new ClickableSpan() {
                        public final void updateDrawState(TextPaint textPaint) {
                        }

                        public final void onClick(View view) {
                            if (!C32800a.m75679a(view)) {
                                C31782a.this.mo64786g("title");
                            }
                        }
                    }, 0, length, 17);
                }
            }
            this.f83067v.setText(spannableString);
            this.f83067v.setVisibility(0);
            this.f83067v.setSpanSize(C9432q.m18669a(mo64749N(), 15.0f));
            this.f83067v.setSpanStyle(1);
            this.f83067v.setOnSpanClickListener(new C31803n(this));
            this.f83067v.mo95551a(C31840c.m74198a(this.f83048c), (C48160d) new C45549f(true));
            this.f83067v.setMovementMethod(LinkMovementMethod.getInstance());
            this.f83067v.setHighlightColor(this.f83067v.getResources().getColor(R.color.a8w));
            if (spannableString != null) {
                this.f83067v.setMaxSize(spannableString.length() + C23794bh.m58395i().mo76334b(mo64749N(), this.f83048c, (TextView) this.f83067v));
            }
            C23794bh.m58395i().mo76331a(mo64749N(), this.f83048c, (TextView) this.f83067v);
            return;
        }
        this.f83067v.setText("");
        if (C23794bh.m58395i().mo76334b(mo64749N(), this.f83048c, (TextView) this.f83067v) > 0) {
            C23794bh.m58395i().mo76331a(mo64749N(), this.f83048c, (TextView) this.f83067v);
            this.f83067v.setVisibility(0);
            return;
        }
        this.f83067v.setVisibility(8);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64754a(long j) {
        this.f83018Z.postDelayed(this.f83037aq, j);
    }

    /* renamed from: b */
    public final void mo64768b(Aweme aweme) {
        this.f83023ac.mo65602b(aweme);
    }

    public void handleMsg(Message message) {
        if (message.what == 0) {
            mo64748M();
        }
    }

    /* renamed from: c */
    public final void mo64772c(int i) {
        if (this.f83003K != null) {
            this.f83003K.mo64907a(0);
            this.f83046az = true;
        }
    }

    /* renamed from: d */
    public final void mo64776d(int i) {
        if (this.f83003K != null) {
            this.f83003K.mo64910b(i);
            this.f83046az = true;
        }
    }

    /* renamed from: e */
    public final void mo64779e(int i) {
        if (this.f83003K != null) {
            this.f83003K.mo64912c(i);
            this.f83046az = true;
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: k */
    public final /* synthetic */ void mo64794k(View view) {
        this.f83018Z.sendMessage(this.f83018Z.obtainMessage(0));
    }

    public void onViewAttachedToWindow(View view) {
        this.f83025ae = true;
        this.f83017Y.mo64960a(this.f83036ap);
        mo64739D();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: e */
    public final /* synthetic */ void mo64780e(View view) {
        if (this.f83052g != null) {
            this.f83052g.mo64658a(mo64749N(), this.f83048c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: f */
    public final /* synthetic */ void mo64782f(View view) {
        C31837a.m74196a(this.f82996D);
        if (this.f83052g != null) {
            this.f83052g.mo64667b(view, this.itemView, this.f83048c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: h */
    public final /* synthetic */ void mo64788h(View view) {
        C31837a.m74196a(this.f82993A);
        if (this.f83052g != null) {
            this.f83052g.mo64659a(view, this.itemView, this.f83048c);
        }
        mo64755a(mo64749N(), 3);
    }

    public void onViewDetachedFromWindow(View view) {
        this.f83025ae = false;
        mo64839X();
        this.f83017Y.mo64962b(this.f83036ap);
        this.f83018Z.removeCallbacksAndMessages(null);
        if (this.f82995C != null) {
            this.f82995C.removeAllViews();
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public final /* synthetic */ void mo64767b(View view) {
        if (!C26503d.m64061d(this.f83048c) || !mo64783f(LeakCanaryFileProvider.f132049i)) {
            if (this.f83052g != null) {
                this.f83052g.mo64668b(view, this.itemView, this.f83048c, this.f83048c.getAuthor());
            }
            mo64755a(mo64749N(), 0);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final /* synthetic */ void mo64773c(View view) {
        if (!C32800a.m75679a(view)) {
            if (!C26503d.m64061d(this.f83048c) || !mo64783f("photo")) {
                if (this.f83052g != null) {
                    this.f83052g.mo64660a(view, this.itemView, this.f83048c, this.f83048c.getAuthor());
                }
                mo64755a(mo64749N(), 0);
            }
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: d */
    public final /* synthetic */ void mo64777d(View view) {
        if (this.f83052g != null) {
            if (C23794bh.m58390d().mo47103a()) {
                C10691a.m21551c(mo64749N(), mo64749N().getString(R.string.dvz)).mo19066a();
                return;
            }
            this.f83052g.mo64703a(this.itemView, this.f83048c);
        }
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: g */
    public final /* synthetic */ void mo64785g(View view) {
        if (!this.f83023ac.f84324f) {
            mo64755a(mo64749N(), 1);
        }
        this.f83023ac.mo65600a(mo64771c(), System.currentTimeMillis() - mo64739D().f83205f);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: i */
    public final /* synthetic */ void mo64790i(View view) {
        C31837a.m74196a(this.f83070y);
        if (this.f83052g != null) {
            this.f83052g.mo64704a(this.itemView, this.f83048c, this.f83050e, this.f83046az, "click_comment_icon");
        }
        mo64755a(mo64749N(), 2);
    }

    /* renamed from: b */
    public void mo64766b(int i) {
        if (!(this.f83048c == null || this.f83048c.getAuthor() == null || !this.f83048c.getAuthor().isLive())) {
            User author = this.f83048c.getAuthor();
            C46641d.m101220b(mo64749N(), 0, author.getRequestId(), author.getUid(), author.roomId, mo64771c());
            C46641d.m101215a(author.getUid(), author.roomId, mo64771c(), "video_head", author.getRequestId(), -1, this.f83048c.getAid());
        }
        mo64838W();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: j */
    public final /* synthetic */ void mo64792j(View view) {
        if (!C23794bh.m58390d().mo47104a((int) R.string.dw5)) {
            if (this.f83048c == null || !this.f83048c.getAwemeControl().canForward()) {
                C10691a.m21548c(mo64749N(), (int) R.string.aik).mo19066a();
            } else if (!C26503d.m64061d(this.f83048c) || C26503d.m64064g(this.f83048c)) {
                C31837a.m74196a(this.f83005M);
                if (this.f83052g != null) {
                    this.f83052g.mo64664a(this.f83048c);
                }
            } else {
                C10691a.m21548c(mo64749N(), (int) R.string.dm).mo19066a();
            }
        }
    }

    /* renamed from: c */
    public final void mo64774c(Aweme aweme) {
        String str;
        if (aweme != null && aweme.getStatus() != null) {
            if (!C20854a.m53167g().isLogin()) {
                if (this.f83048c != null) {
                    str = this.f83048c.getAid();
                } else {
                    str = "";
                }
                C27965f.m66720a(C11016e.m22312g(), this.f83011S, "click_like", C47661ab.m103163a().mo94972a("group_id", str).mo94972a("log_pb", C23198ae.m56874k(str)).f120139a);
                return;
            }
            C32404a aVar = this.f83023ac;
            long currentTimeMillis = System.currentTimeMillis() - mo64739D().f83205f;
            if (aweme != null && aweme.getStatus() != null && C32409b.m74937a(aVar.f84325g) && aweme.getUserDigg() == 0 && aweme.isCanPlay() && !aweme.getStatus().isDelete() && aweme.getStatus().getPrivateStatus() != 1 && !aVar.f84324f) {
                aVar.f84321c++;
                aVar.mo65601a(true);
                if (aVar.f84323e != null) {
                    aVar.f84323e.mo64652a(aVar.f84326h, 1, "click_double_like", currentTimeMillis);
                }
                aVar.mo65598a();
            }
            if (!this.f83023ac.f84324f) {
                mo64755a(mo64749N(), 1);
            }
            if (aweme.getStatus().getPrivateStatus() != 1) {
                this.f82995C.mo54895a(this.f83039as.getX(), this.f83039as.getY());
            }
        }
    }

    /* renamed from: a */
    public final void mo64761a(Aweme aweme) {
        this.f83019a = aweme;
        this.f83048c.setRepostFromGroupId(this.f83019a.getAid());
        this.f83048c.setRepostFromUserId(this.f83019a.getAuthorUid());
    }

    /* renamed from: a */
    private SpannableString m73932a(Aweme aweme, String str) {
        if (C26503d.m64061d(aweme)) {
            return C23710a.m58192a(this.itemView.getContext(), str, this.f83048c.getAwemeRawAd().highLightPosition, 0, this.f83048c.getAwemeRawAd().highLightColor);
        }
        return C23710a.m58189a(this.itemView.getContext(), str, this.f83048c.getPosition());
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64757a(View view, float f) {
        mo64758a(view, f, 0.0f);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64758a(View view, float f, float f2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = (int) C9432q.m18687b(mo64749N(), f);
        layoutParams.bottomMargin = (int) C9432q.m18687b(mo64749N(), f2);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo64760a(View view, int i, int i2) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        int[] iArr = new int[2];
        int a = C9432q.m18670a(mo64749N());
        int b = C9432q.m18688b(mo64749N());
        float b2 = C9432q.m18687b(mo64749N(), 16.0f);
        float f = ((float) i2) / ((float) i);
        if (i * 4 > i2 * 3) {
            iArr[0] = (int) (((float) a) - (b2 * 2.0f));
            iArr[1] = (int) (((float) iArr[0]) * f);
        } else {
            iArr[0] = (int) (((float) a) * 0.72f);
            iArr[1] = (int) (((float) iArr[0]) * f);
        }
        float f2 = ((float) b) * 0.72f;
        if (((float) iArr[1]) > f2) {
            iArr[1] = (int) f2;
            iArr[0] = (int) (((float) iArr[1]) / f);
        }
        layoutParams.width = iArr[0];
        layoutParams.height = iArr[1];
        view.setLayoutParams(layoutParams);
    }

    public C31782a(FollowFeedLayout followFeedLayout, C31755b bVar, C31848j jVar, C31754a aVar) {
        super(followFeedLayout);
        this.f83024ad = bVar;
        this.f83017Y = jVar;
        this.f83018Z = new C9381g(Looper.getMainLooper(), this);
        mo64756a((View) followFeedLayout);
        mo64764a(followFeedLayout);
        followFeedLayout.setOnAttachStateChangeListener(this);
        mo64810z();
        this.f83032al = new C31980a(this.f83001I, new C31988e() {
            /* renamed from: a */
            public final String mo56221a() {
                return C31782a.this.mo64771c();
            }

            /* renamed from: a */
            public final void mo49741a(int i, User user) {
                if (C31782a.this.f83052g != null) {
                    C31782a.this.f83052g.mo64669b(C31782a.this.f83048c);
                }
            }
        });
        if (this.f83004L != null) {
            this.f83004L.setTapListener(this.f83041au);
            this.f83004L.setDisabilityOnClickListener(new C31791b(this));
        }
        if (this.f83068w != null) {
            C32404a aVar2 = new C32404a(bVar.mo64656c(), this.f83068w, this.f83069x, aVar, mo64769b());
            this.f83023ac = aVar2;
        }
        this.f83033am = C23279d.m57258a((FragmentActivity) mo64749N(), this.itemView);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo64759a(View view, float f, float f2, float f3, float f4) {
        LayoutParams layoutParams = (LayoutParams) view.getLayoutParams();
        layoutParams.topMargin = (int) C9432q.m18687b(mo64749N(), f);
        layoutParams.bottomMargin = (int) C9432q.m18687b(mo64749N(), f2);
        layoutParams.leftMargin = (int) C9432q.m18687b(mo64749N(), f3);
        layoutParams.rightMargin = (int) C9432q.m18687b(mo64749N(), f4);
    }
}
