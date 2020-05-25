package com.p683ss.android.ugc.aweme.commercialize.loft.p1576c;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.graphics.drawable.Animatable;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup.LayoutParams;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtLoadingLayout;
import com.facebook.drawee.p936c.C13790c;
import com.facebook.imagepipeline.p970j.C14045f;
import com.p683ss.android.ugc.aweme.base.p1420ui.RemoteImageView;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1574a.C26003b;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1574a.C26004c;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26006a;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26012e;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.c.a */
public final class C26015a implements C26003b, C26004c {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f68686a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "rootView", "getRootView()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "ivClose", "getIvClose()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "background", "getBackground()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "ivGoodsBackground", "getIvGoodsBackground()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "ivGoods", "getIvGoods()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "llDesc", "getLlDesc()Landroid/widget/LinearLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "ivLogo", "getIvLogo()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "ivTitle", "getIvTitle()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "tvTime", "getTvTime()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "ivTopLeft", "getIvTopLeft()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "ivTopRight", "getIvTopRight()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "ivBottomLeft", "getIvBottomLeft()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "ivBottomRight", "getIvBottomRight()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "llLoadDesc", "getLlLoadDesc()Landroid/widget/LinearLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "ivLoadLogo", "getIvLoadLogo()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "ivLoadTitle", "getIvLoadTitle()Lcom/ss/android/ugc/aweme/base/ui/RemoteImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "tvLoadTime", "getTvLoadTime()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "llLoadState", "getLlLoadState()Landroid/widget/LinearLayout;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "ivLoadBlue", "getIvLoadBlue()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "ivLoadRed", "getIvLoadRed()Landroid/widget/ImageView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "tvLoadState", "getTvLoadState()Landroid/widget/TextView;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C26015a.class), "normalLoading", "getNormalLoading()Lcom/bytedance/ies/dmt/ui/widget/DmtLoadingLayout;"))};

    /* renamed from: l */
    public static final C26016a f68687l = new C26016a(null);

    /* renamed from: A */
    private final C52668f f68688A;

    /* renamed from: B */
    private final C52668f f68689B;

    /* renamed from: C */
    private final C52668f f68690C;

    /* renamed from: D */
    private final C52668f f68691D;

    /* renamed from: E */
    private final C52668f f68692E;

    /* renamed from: F */
    private final C52668f f68693F;

    /* renamed from: G */
    private final C52668f f68694G;

    /* renamed from: H */
    private final C52668f f68695H;

    /* renamed from: I */
    private C26006a f68696I;

    /* renamed from: J */
    private C26018c f68697J;

    /* renamed from: K */
    private ObjectAnimator f68698K;

    /* renamed from: L */
    private ObjectAnimator f68699L;

    /* renamed from: M */
    private ObjectAnimator f68700M;

    /* renamed from: N */
    private boolean f68701N;

    /* renamed from: O */
    private AnimatorSet f68702O;

    /* renamed from: P */
    private ObjectAnimator f68703P;

    /* renamed from: Q */
    private ObjectAnimator f68704Q;

    /* renamed from: R */
    private ObjectAnimator f68705R;

    /* renamed from: S */
    private ObjectAnimator f68706S;

    /* renamed from: T */
    private boolean f68707T;

    /* renamed from: U */
    private AnimatorSet f68708U;

    /* renamed from: V */
    private ObjectAnimator f68709V;

    /* renamed from: W */
    private ObjectAnimator f68710W;

    /* renamed from: X */
    private ObjectAnimator f68711X;

    /* renamed from: Y */
    private ObjectAnimator f68712Y;

    /* renamed from: Z */
    private final boolean f68713Z;

    /* renamed from: aa */
    private final boolean f68714aa;

    /* renamed from: b */
    public OnClickListener f68715b;

    /* renamed from: c */
    public float f68716c;

    /* renamed from: d */
    public float f68717d;

    /* renamed from: e */
    public C26006a f68718e;

    /* renamed from: f */
    public float f68719f;

    /* renamed from: g */
    public int f68720g;

    /* renamed from: h */
    public int f68721h;

    /* renamed from: i */
    public C26017b f68722i;

    /* renamed from: j */
    public AnimatorSet f68723j;

    /* renamed from: k */
    public final Context f68724k;

    /* renamed from: m */
    private final C52668f f68725m;

    /* renamed from: n */
    private final C52668f f68726n;

    /* renamed from: o */
    private final C52668f f68727o;

    /* renamed from: p */
    private final C52668f f68728p;

    /* renamed from: q */
    private final C52668f f68729q;

    /* renamed from: r */
    private final C52668f f68730r;

    /* renamed from: s */
    private final C52668f f68731s;

    /* renamed from: t */
    private final C52668f f68732t;

    /* renamed from: u */
    private final C52668f f68733u;

    /* renamed from: v */
    private final C52668f f68734v;

    /* renamed from: w */
    private final C52668f f68735w;

    /* renamed from: x */
    private final C52668f f68736x;

    /* renamed from: y */
    private final C52668f f68737y;

    /* renamed from: z */
    private final C52668f f68738z;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.c.a$a */
    public static final class C26016a {
        private C26016a() {
        }

        public /* synthetic */ C26016a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.c.a$b */
    public enum C26017b {
        CLOSE,
        PULL_DOWN_FIRST,
        PULL_DOWN_SECOND,
        PULL_DOWN_THIRD,
        TO_REFRESH,
        REFRESHING,
        REFRESH_BACK,
        BACKING,
        EXPENDING,
        EXPENDED
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.c.a$c */
    public enum C26018c {
        SECOND_LOFT,
        DIRECT_OPEN,
        VIDEO_PLACEHOLDER
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.c.a$d */
    public static final class C26019d implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C26015a f68741a;

        /* renamed from: b */
        final /* synthetic */ int f68742b;

        /* renamed from: c */
        final /* synthetic */ ObjectAnimator f68743c;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
            this.f68741a.mo53474q().setTag(Integer.valueOf(this.f68742b));
            this.f68741a.mo53474q().setText(this.f68741a.mo53462a(this.f68742b));
            this.f68741a.f68723j = new AnimatorSet();
            AnimatorSet animatorSet = this.f68741a.f68723j;
            if (animatorSet != null) {
                Builder play = animatorSet.play(this.f68743c);
                if (play != null) {
                    play.after(50);
                }
            }
            AnimatorSet animatorSet2 = this.f68741a.f68723j;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(100);
            }
            AnimatorSet animatorSet3 = this.f68741a.f68723j;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
        }

        C26019d(C26015a aVar, int i, ObjectAnimator objectAnimator) {
            this.f68741a = aVar;
            this.f68742b = i;
            this.f68743c = objectAnimator;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.c.a$e */
    public static final class C26020e extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ C26015a f68744a;

        /* renamed from: b */
        final /* synthetic */ C26006a f68745b;

        /* renamed from: c */
        final /* synthetic */ C26018c f68746c;

        /* renamed from: d */
        final /* synthetic */ OnClickListener f68747d;

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            if (fVar != null) {
                C26015a.m63049a(this.f68744a.mo53467j(), fVar);
            }
        }

        C26020e(C26015a aVar, C26006a aVar2, C26018c cVar, OnClickListener onClickListener) {
            this.f68744a = aVar;
            this.f68745b = aVar2;
            this.f68746c = cVar;
            this.f68747d = onClickListener;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.c.a$f */
    public static final class C26021f extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ C26015a f68748a;

        /* renamed from: b */
        final /* synthetic */ C26006a f68749b;

        /* renamed from: c */
        final /* synthetic */ C26018c f68750c;

        /* renamed from: d */
        final /* synthetic */ OnClickListener f68751d;

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            if (fVar != null) {
                C26015a.m63049a(this.f68748a.mo53468k(), fVar);
            }
        }

        C26021f(C26015a aVar, C26006a aVar2, C26018c cVar, OnClickListener onClickListener) {
            this.f68748a = aVar;
            this.f68749b = aVar2;
            this.f68750c = cVar;
            this.f68751d = onClickListener;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.c.a$g */
    public static final class C26022g extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ C26015a f68752a;

        /* renamed from: b */
        final /* synthetic */ C26006a f68753b;

        /* renamed from: c */
        final /* synthetic */ C26018c f68754c;

        /* renamed from: d */
        final /* synthetic */ OnClickListener f68755d;

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            if (fVar != null) {
                C26015a.m63049a(this.f68752a.mo53469l(), fVar);
            }
        }

        C26022g(C26015a aVar, C26006a aVar2, C26018c cVar, OnClickListener onClickListener) {
            this.f68752a = aVar;
            this.f68753b = aVar2;
            this.f68754c = cVar;
            this.f68755d = onClickListener;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.c.a$h */
    public static final class C26023h extends C13790c<C14045f> {

        /* renamed from: a */
        final /* synthetic */ C26015a f68756a;

        /* renamed from: b */
        final /* synthetic */ C26006a f68757b;

        /* renamed from: c */
        final /* synthetic */ C26018c f68758c;

        /* renamed from: d */
        final /* synthetic */ OnClickListener f68759d;

        public final /* synthetic */ void onFinalImageSet(String str, Object obj, Animatable animatable) {
            C14045f fVar = (C14045f) obj;
            if (fVar != null) {
                C26015a.m63049a(this.f68756a.mo53470m(), fVar);
            }
        }

        C26023h(C26015a aVar, C26006a aVar2, C26018c cVar, OnClickListener onClickListener) {
            this.f68756a = aVar;
            this.f68757b = aVar2;
            this.f68758c = cVar;
            this.f68759d = onClickListener;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.c.a$i */
    static final class C26024i implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C26015a f68760a;

        /* renamed from: b */
        final /* synthetic */ C26006a f68761b;

        /* renamed from: c */
        final /* synthetic */ C26018c f68762c;

        /* renamed from: d */
        final /* synthetic */ OnClickListener f68763d;

        C26024i(C26015a aVar, C26006a aVar2, C26018c cVar, OnClickListener onClickListener) {
            this.f68760a = aVar;
            this.f68761b = aVar2;
            this.f68762c = cVar;
            this.f68763d = onClickListener;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f68760a.mo53475r();
            this.f68760a.mo53476s();
            OnClickListener onClickListener = this.f68763d;
            if (onClickListener != null) {
                onClickListener.onClick(view);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.commercialize.loft.c.a$j */
    public static final class C26025j implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C26015a f68764a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationEnd(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C26025j(C26015a aVar) {
            this.f68764a = aVar;
        }
    }

    /* renamed from: A */
    private final RemoteImageView m63044A() {
        return (RemoteImageView) this.f68737y.getValue();
    }

    /* renamed from: B */
    private final LinearLayout m63045B() {
        return (LinearLayout) this.f68738z.getValue();
    }

    /* renamed from: C */
    private final TextView m63046C() {
        return (TextView) this.f68690C.getValue();
    }

    /* renamed from: D */
    private final DmtLoadingLayout m63047D() {
        return (DmtLoadingLayout) this.f68695H.getValue();
    }

    /* renamed from: u */
    private final ImageView m63054u() {
        return (ImageView) this.f68726n.getValue();
    }

    /* renamed from: v */
    private final RemoteImageView m63055v() {
        return (RemoteImageView) this.f68727o.getValue();
    }

    /* renamed from: w */
    private final TextView m63056w() {
        return (TextView) this.f68733u.getValue();
    }

    /* renamed from: x */
    private final RemoteImageView m63057x() {
        return (RemoteImageView) this.f68734v.getValue();
    }

    /* renamed from: y */
    private final RemoteImageView m63058y() {
        return (RemoteImageView) this.f68735w.getValue();
    }

    /* renamed from: z */
    private final RemoteImageView m63059z() {
        return (RemoteImageView) this.f68736x.getValue();
    }

    /* renamed from: d */
    public final void mo53406d() {
    }

    /* renamed from: g */
    public final View mo53464g() {
        return (View) this.f68725m.getValue();
    }

    /* renamed from: h */
    public final RemoteImageView mo53465h() {
        return (RemoteImageView) this.f68728p.getValue();
    }

    /* renamed from: i */
    public final RemoteImageView mo53466i() {
        return (RemoteImageView) this.f68729q.getValue();
    }

    /* renamed from: j */
    public final RemoteImageView mo53467j() {
        return (RemoteImageView) this.f68731s.getValue();
    }

    /* renamed from: k */
    public final RemoteImageView mo53468k() {
        return (RemoteImageView) this.f68732t.getValue();
    }

    /* renamed from: l */
    public final RemoteImageView mo53469l() {
        return (RemoteImageView) this.f68688A.getValue();
    }

    /* renamed from: m */
    public final RemoteImageView mo53470m() {
        return (RemoteImageView) this.f68689B.getValue();
    }

    /* renamed from: n */
    public final LinearLayout mo53471n() {
        return (LinearLayout) this.f68691D.getValue();
    }

    /* renamed from: o */
    public final ImageView mo53472o() {
        return (ImageView) this.f68692E.getValue();
    }

    /* renamed from: p */
    public final ImageView mo53473p() {
        return (ImageView) this.f68693F.getValue();
    }

    /* renamed from: q */
    public final TextView mo53474q() {
        return (TextView) this.f68694G.getValue();
    }

    /* renamed from: a */
    public final void mo53403a() {
        mo53463a(C26017b.EXPENDING);
    }

    /* renamed from: b */
    public final void mo53404b() {
        mo53463a(C26017b.EXPENDED);
    }

    /* renamed from: f */
    public final void mo53408f() {
        if (this.f68722i == C26017b.TO_REFRESH) {
            mo53463a(C26017b.REFRESHING);
        }
    }

    /* renamed from: c */
    public final void mo53405c() {
        if (this.f68722i == C26017b.REFRESHING) {
            mo53463a(C26017b.REFRESH_BACK);
            return;
        }
        if (!(this.f68722i == C26017b.BACKING || this.f68722i == C26017b.REFRESH_BACK)) {
            mo53463a(C26017b.BACKING);
        }
    }

    /* renamed from: e */
    public final void mo53407e() {
        if (this.f68722i != C26017b.REFRESHING && this.f68722i != C26017b.REFRESH_BACK && this.f68722i != C26017b.TO_REFRESH) {
            mo53463a(C26017b.TO_REFRESH);
            this.f68721h = this.f68720g;
        }
    }

    /* renamed from: r */
    public final void mo53475r() {
        if (!this.f68707T) {
            AnimatorSet animatorSet = this.f68708U;
            if (animatorSet != null) {
                this.f68707T = true;
                animatorSet.cancel();
                this.f68708U = null;
            }
        }
    }

    /* renamed from: s */
    public final void mo53476s() {
        if (!this.f68701N) {
            AnimatorSet animatorSet = this.f68702O;
            if (animatorSet != null) {
                this.f68701N = true;
                animatorSet.removeAllListeners();
                animatorSet.cancel();
                this.f68702O = null;
            }
        }
    }

    /* renamed from: t */
    public final void mo53477t() {
        this.f68719f = mo53473p().getX() - mo53472o().getX();
    }

    /* renamed from: a */
    public final int mo53462a(int i) {
        if (this.f68714aa) {
            switch (i) {
                case 1:
                    C26006a aVar = this.f68696I;
                    if (aVar == null || aVar.getStatus() != C26012e.f68676b) {
                        return R.string.c1l;
                    }
                    return R.string.c1e;
                case 2:
                    C26006a aVar2 = this.f68696I;
                    if (aVar2 == null || aVar2.getStatus() != C26012e.f68676b) {
                        return R.string.c1l;
                    }
                    return R.string.c1e;
                case 3:
                    C26006a aVar3 = this.f68696I;
                    if (aVar3 == null || aVar3.getStatus() != C26012e.f68676b) {
                        return R.string.c1d;
                    }
                    return R.string.c1e;
                default:
                    return R.string.c1g;
            }
        } else {
            switch (i) {
                case 1:
                    return R.string.c1g;
                case 2:
                    return R.string.c1f;
                case 3:
                    return R.string.c1d;
                default:
                    return R.string.c1g;
            }
        }
    }

    /* renamed from: a */
    private final void m63050a(C26006a aVar) {
        if (aVar != null && aVar.getStatus() == C26012e.f68677c) {
            mo53476s();
            mo53475r();
            this.f68708U = new AnimatorSet();
            this.f68707T = false;
            if (this.f68709V == null) {
                this.f68709V = m63048a(m63057x(), -80.0f, -100.0f);
            }
            if (this.f68710W == null) {
                this.f68710W = m63048a(m63058y(), -110.0f, -125.0f);
            }
            if (this.f68711X == null) {
                this.f68711X = m63048a(m63059z(), 68.0f, 53.0f);
            }
            if (this.f68712Y == null) {
                this.f68712Y = m63048a(m63044A(), 21.0f, 1.0f);
            }
            AnimatorSet animatorSet = this.f68708U;
            if (animatorSet != null) {
                animatorSet.playTogether(new Animator[]{this.f68709V, this.f68710W, this.f68711X, this.f68712Y});
            }
            AnimatorSet animatorSet2 = this.f68708U;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(2000);
            }
            AnimatorSet animatorSet3 = this.f68708U;
            if (animatorSet3 != null) {
                animatorSet3.start();
            }
        }
    }

    /* renamed from: b */
    private final void m63052b(int i) {
        int i2;
        if (mo53474q().getTag() instanceof Integer) {
            Object tag = mo53474q().getTag();
            if (tag != null) {
                i2 = ((Integer) tag).intValue();
            } else {
                throw new C52857u("null cannot be cast to non-null type kotlin.Int");
            }
        } else {
            i2 = 0;
        }
        if ((i2 == 2 && i == 3) || (i2 == 3 && i == 2)) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(mo53474q(), "alpha", new float[]{1.0f, 0.0f});
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(mo53474q(), "alpha", new float[]{0.0f, 1.0f});
            AnimatorSet animatorSet = this.f68723j;
            if (animatorSet != null) {
                animatorSet.cancel();
                this.f68723j = null;
            }
            this.f68723j = new AnimatorSet();
            AnimatorSet animatorSet2 = this.f68723j;
            if (animatorSet2 != null) {
                animatorSet2.play(ofFloat);
            }
            AnimatorSet animatorSet3 = this.f68723j;
            if (animatorSet3 != null) {
                animatorSet3.setDuration(100);
            }
            AnimatorSet animatorSet4 = this.f68723j;
            if (animatorSet4 != null) {
                animatorSet4.addListener(new C26019d(this, i, ofFloat2));
            }
            AnimatorSet animatorSet5 = this.f68723j;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
        } else {
            AnimatorSet animatorSet6 = this.f68723j;
            if (animatorSet6 != null) {
                animatorSet6.cancel();
                this.f68723j = null;
            }
            mo53474q().setTag(Integer.valueOf(i));
            mo53474q().setAlpha(1.0f);
            mo53474q().setText(mo53462a(i));
        }
    }

    /* renamed from: b */
    private final void m63053b(C26006a aVar) {
        if (aVar != null && aVar.getStatus() == C26012e.f68677c) {
            mo53476s();
            mo53475r();
            this.f68702O = new AnimatorSet();
            this.f68701N = false;
            if (this.f68703P == null) {
                this.f68703P = m63051b(m63057x(), -87.0f, -80.0f);
            }
            if (this.f68704Q == null) {
                this.f68704Q = m63051b(m63058y(), -115.25f, -110.0f);
            }
            if (this.f68705R == null) {
                this.f68705R = m63051b(m63059z(), 62.75f, 68.0f);
            }
            if (this.f68706S == null) {
                this.f68706S = m63051b(m63044A(), 14.0f, 21.0f);
            }
            AnimatorSet animatorSet = this.f68702O;
            if (animatorSet != null) {
                animatorSet.playTogether(new Animator[]{this.f68703P, this.f68704Q, this.f68705R, this.f68706S});
            }
            AnimatorSet animatorSet2 = this.f68702O;
            if (animatorSet2 != null) {
                animatorSet2.setDuration(700);
            }
            AnimatorSet animatorSet3 = this.f68702O;
            if (animatorSet3 != null) {
                animatorSet3.addListener(new C26025j(this));
            }
            AnimatorSet animatorSet4 = this.f68702O;
            if (animatorSet4 != null) {
                animatorSet4.start();
            }
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:38:0x011a, code lost:
        if ((!p2628d.p2639f.p2641b.C52711k.m112239a(r8, r10)) == false) goto L_0x0285;
     */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo53463a(com.p683ss.android.ugc.aweme.commercialize.loft.p1576c.C26015a.C26017b r15) {
        /*
            r14 = this;
            r14.f68722i = r15
            int[] r0 = com.p683ss.android.ugc.aweme.commercialize.loft.p1576c.C26026b.f68765a
            int r15 = r15.ordinal()
            r15 = r0[r15]
            r0 = 0
            r1 = 2
            r2 = 1
            r3 = 4
            r4 = 0
            switch(r15) {
                case 1: goto L_0x03d0;
                case 2: goto L_0x03cc;
                case 3: goto L_0x03b4;
                case 4: goto L_0x03a5;
                case 5: goto L_0x00a8;
                case 6: goto L_0x0079;
                case 7: goto L_0x0014;
                default: goto L_0x0012;
            }
        L_0x0012:
            goto L_0x03dd
        L_0x0014:
            android.widget.LinearLayout r15 = r14.m63045B()
            r15.setVisibility(r3)
            android.widget.TextView r15 = r14.m63046C()
            r15.setVisibility(r3)
            android.widget.LinearLayout r15 = r14.mo53471n()
            r15.setVisibility(r3)
            float r15 = r14.f68716c
            float r3 = r14.f68717d
            android.animation.ObjectAnimator r5 = r14.f68699L
            if (r5 != 0) goto L_0x0043
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r5 = r14.mo53466i()
            java.lang.String r6 = "translationY"
            float[] r7 = new float[r1]
            r7[r4] = r15
            r7[r2] = r0
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r5, r6, r7)
            r14.f68699L = r15
        L_0x0043:
            android.animation.ObjectAnimator r15 = r14.f68700M
            if (r15 != 0) goto L_0x0059
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r15 = r14.mo53465h()
            java.lang.String r5 = "translationY"
            float[] r6 = new float[r1]
            r6[r4] = r3
            r6[r2] = r0
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r15, r5, r6)
            r14.f68700M = r15
        L_0x0059:
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            android.animation.Animator[] r0 = new android.animation.Animator[r1]
            android.animation.ObjectAnimator r1 = r14.f68699L
            android.animation.Animator r1 = (android.animation.Animator) r1
            r0[r4] = r1
            android.animation.ObjectAnimator r1 = r14.f68700M
            android.animation.Animator r1 = (android.animation.Animator) r1
            r0[r2] = r1
            r15.playTogether(r0)
            r0 = 500(0x1f4, double:2.47E-321)
            r15.setDuration(r0)
            r15.start()
            goto L_0x03dd
        L_0x0079:
            android.animation.ObjectAnimator r15 = r14.f68698K
            if (r15 != 0) goto L_0x008e
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r15 = r14.m63055v()
            java.lang.String r0 = "alpha"
            float[] r1 = new float[r1]
            r1 = {0, 1065353216} // fill-array
            android.animation.ObjectAnimator r15 = android.animation.ObjectAnimator.ofFloat(r15, r0, r1)
            r14.f68698K = r15
        L_0x008e:
            android.animation.AnimatorSet r15 = new android.animation.AnimatorSet
            r15.<init>()
            android.animation.ObjectAnimator r0 = r14.f68698K
            android.animation.Animator r0 = (android.animation.Animator) r0
            r15.play(r0)
            r0 = 200(0xc8, double:9.9E-322)
            r15.setDuration(r0)
            r15.start()
            com.ss.android.ugc.aweme.commercialize.loft.b.a r15 = r14.f68696I
            r14.m63053b(r15)
            return
        L_0x00a8:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r15 = r14.m63055v()
            r15.setAlpha(r0)
            android.widget.LinearLayout r15 = r14.m63045B()
            r15.setVisibility(r4)
            android.widget.TextView r15 = r14.m63046C()
            r15.setVisibility(r4)
            android.widget.LinearLayout r15 = r14.mo53471n()
            r15.setVisibility(r4)
            com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout r15 = r14.m63047D()
            r15.setVisibility(r3)
            com.ss.android.ugc.aweme.commercialize.loft.b.a r15 = r14.f68718e
            if (r15 == 0) goto L_0x03a1
            com.ss.android.ugc.aweme.commercialize.loft.c.a$c r5 = r14.f68697J
            if (r5 != 0) goto L_0x00d8
            java.lang.String r6 = "viewType"
            p2628d.p2639f.p2641b.C52711k.m112237a(r6)
        L_0x00d8:
            android.view.View$OnClickListener r6 = r14.f68715b
            java.lang.String r7 = "type"
            p2628d.p2639f.p2641b.C52711k.m112240b(r5, r7)
            r7 = 0
            if (r15 == 0) goto L_0x039f
            java.lang.String r8 = r15.getId()
            com.ss.android.ugc.aweme.commercialize.loft.b.a r9 = r14.f68696I
            if (r9 == 0) goto L_0x00ef
            java.lang.String r9 = r9.getId()
            goto L_0x00f0
        L_0x00ef:
            r9 = r7
        L_0x00f0:
            boolean r8 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r9)
            r8 = r8 ^ r2
            r9 = 1065353216(0x3f800000, float:1.0)
            if (r8 != 0) goto L_0x011c
            com.ss.android.ugc.aweme.commercialize.loft.b.b r8 = r15.getAnimationRes()
            if (r8 == 0) goto L_0x0104
            java.lang.String r8 = r8.getDownloadUrl()
            goto L_0x0105
        L_0x0104:
            r8 = r7
        L_0x0105:
            com.ss.android.ugc.aweme.commercialize.loft.b.a r10 = r14.f68696I
            if (r10 == 0) goto L_0x0114
            com.ss.android.ugc.aweme.commercialize.loft.b.b r10 = r10.getAnimationRes()
            if (r10 == 0) goto L_0x0114
            java.lang.String r10 = r10.getDownloadUrl()
            goto L_0x0115
        L_0x0114:
            r10 = r7
        L_0x0115:
            boolean r8 = p2628d.p2639f.p2641b.C52711k.m112239a(r8, r10)
            r8 = r8 ^ r2
            if (r8 == 0) goto L_0x0285
        L_0x011c:
            com.ss.android.ugc.aweme.commercialize.loft.b.b r8 = r15.getAnimationRes()
            if (r8 == 0) goto L_0x0285
            java.lang.String r10 = r8.getStartColor()
            java.lang.String r11 = r8.getEndColor()
            java.lang.String r12 = "startColor"
            p2628d.p2639f.p2641b.C52711k.m112240b(r10, r12)
            java.lang.String r12 = "endColor"
            p2628d.p2639f.p2641b.C52711k.m112240b(r11, r12)
            android.graphics.drawable.GradientDrawable r12 = new android.graphics.drawable.GradientDrawable
            android.graphics.drawable.GradientDrawable$Orientation r13 = android.graphics.drawable.GradientDrawable.Orientation.TOP_BOTTOM
            int[] r1 = new int[r1]
            int r10 = android.graphics.Color.parseColor(r10)
            r1[r4] = r10
            int r10 = android.graphics.Color.parseColor(r11)
            r1[r2] = r10
            r12.<init>(r13, r1)
            android.view.View r1 = r14.mo53464g()
            android.graphics.drawable.Drawable r12 = (android.graphics.drawable.Drawable) r12
            r1.setBackground(r12)
            int r1 = r15.getStatus()
            int r10 = com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26012e.f68677c
            if (r1 != r10) goto L_0x0165
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r14.m63055v()
            java.lang.String r10 = r8.getBackgroundUri()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r1, r10)
        L_0x0165:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r14.m63055v()
            r1.setVisibility(r4)
            com.ss.android.ugc.aweme.commercialize.loft.c.a$c r1 = com.p683ss.android.ugc.aweme.commercialize.loft.p1576c.C26015a.C26018c.SECOND_LOFT
            if (r5 != r1) goto L_0x0178
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r1 = r14.m63055v()
            r1.setAlpha(r0)
            goto L_0x017f
        L_0x0178:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63055v()
            r0.setAlpha(r9)
        L_0x017f:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.mo53465h()
            java.lang.String r1 = r8.getGoodsBackgroundUri()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r0, r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.mo53465h()
            r0.setVisibility(r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.mo53466i()
            java.lang.String r1 = r8.getGoodsUri()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r0, r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.mo53466i()
            r0.setVisibility(r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.mo53467j()
            java.lang.String r1 = r8.getLogoLeftUri()
            com.ss.android.ugc.aweme.commercialize.loft.c.a$e r10 = new com.ss.android.ugc.aweme.commercialize.loft.c.a$e
            r10.<init>(r14, r15, r5, r6)
            com.facebook.drawee.c.d r10 = (com.facebook.drawee.p936c.C13791d) r10
            com.p683ss.android.ugc.aweme.commercialize.utils.C26515i.m64157a(r0, r1, r10)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.mo53468k()
            java.lang.String r1 = r8.getLogoRightUri()
            com.ss.android.ugc.aweme.commercialize.loft.c.a$f r10 = new com.ss.android.ugc.aweme.commercialize.loft.c.a$f
            r10.<init>(r14, r15, r5, r6)
            com.facebook.drawee.c.d r10 = (com.facebook.drawee.p936c.C13791d) r10
            com.p683ss.android.ugc.aweme.commercialize.utils.C26515i.m64157a(r0, r1, r10)
            d.f r0 = r14.f68730r
            java.lang.Object r0 = r0.getValue()
            android.widget.LinearLayout r0 = (android.widget.LinearLayout) r0
            r0.setVisibility(r4)
            android.widget.TextView r0 = r14.m63056w()
            java.lang.String r1 = r8.getTimeDesc()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.widget.TextView r0 = r14.m63056w()
            r0.setVisibility(r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63057x()
            java.lang.String r1 = r8.getFloatLeftTopUri()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r0, r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63057x()
            r0.setVisibility(r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63058y()
            java.lang.String r1 = r8.getFloatRightTopUri()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r0, r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63058y()
            r0.setVisibility(r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63059z()
            java.lang.String r1 = r8.getFloatLeftBottomUri()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r0, r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63059z()
            r0.setVisibility(r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63044A()
            java.lang.String r1 = r8.getFloatRightBottomUri()
            com.p683ss.android.ugc.aweme.base.C23515d.m57677a(r0, r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63044A()
            r0.setVisibility(r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.mo53469l()
            java.lang.String r1 = r8.getLogoLeftUri()
            com.ss.android.ugc.aweme.commercialize.loft.c.a$g r10 = new com.ss.android.ugc.aweme.commercialize.loft.c.a$g
            r10.<init>(r14, r15, r5, r6)
            com.facebook.drawee.c.d r10 = (com.facebook.drawee.p936c.C13791d) r10
            com.p683ss.android.ugc.aweme.commercialize.utils.C26515i.m64157a(r0, r1, r10)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.mo53470m()
            java.lang.String r1 = r8.getLogoRightUri()
            com.ss.android.ugc.aweme.commercialize.loft.c.a$h r10 = new com.ss.android.ugc.aweme.commercialize.loft.c.a$h
            r10.<init>(r14, r15, r5, r6)
            com.facebook.drawee.c.d r10 = (com.facebook.drawee.p936c.C13791d) r10
            com.p683ss.android.ugc.aweme.commercialize.utils.C26515i.m64157a(r0, r1, r10)
            android.widget.LinearLayout r0 = r14.m63045B()
            r0.setVisibility(r4)
            android.widget.TextView r0 = r14.m63046C()
            java.lang.String r1 = r8.getTimeDesc()
            java.lang.CharSequence r1 = (java.lang.CharSequence) r1
            r0.setText(r1)
            android.widget.TextView r0 = r14.m63046C()
            r0.setVisibility(r4)
            r14.m63052b(r2)
            android.widget.LinearLayout r0 = r14.mo53471n()
            r0.setVisibility(r4)
            android.widget.ImageView r0 = r14.m63054u()
            com.ss.android.ugc.aweme.commercialize.loft.c.a$i r1 = new com.ss.android.ugc.aweme.commercialize.loft.c.a$i
            r1.<init>(r14, r15, r5, r6)
            android.view.View$OnClickListener r1 = (android.view.View.OnClickListener) r1
            r0.setOnClickListener(r1)
        L_0x0285:
            int r0 = r15.getStatus()
            com.ss.android.ugc.aweme.commercialize.loft.b.a r1 = r14.f68696I
            if (r1 == 0) goto L_0x0293
            int r1 = r1.getStatus()
            if (r0 == r1) goto L_0x02f0
        L_0x0293:
            int r0 = r15.getStatus()
            int r1 = com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26012e.f68677c
            if (r0 != r1) goto L_0x02c6
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.mo53465h()
            r0.setVisibility(r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.mo53466i()
            r0.setVisibility(r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63057x()
            r0.setVisibility(r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63058y()
            r0.setVisibility(r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63059z()
            r0.setVisibility(r4)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63044A()
            r0.setVisibility(r4)
            goto L_0x02f0
        L_0x02c6:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.mo53465h()
            r0.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.mo53466i()
            r0.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63057x()
            r0.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63058y()
            r0.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63059z()
            r0.setVisibility(r3)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63044A()
            r0.setVisibility(r3)
        L_0x02f0:
            boolean r0 = r14.f68713Z
            if (r0 != 0) goto L_0x0340
            android.widget.ImageView r0 = r14.m63054u()
            r1 = 2131955250(0x7f130e32, float:1.9547022E38)
            r0.setImageResource(r1)
            android.widget.LinearLayout r0 = r14.m63045B()
            r1 = 8
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.mo53469l()
            r0.setVisibility(r1)
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.mo53470m()
            r0.setVisibility(r1)
            android.widget.TextView r0 = r14.m63046C()
            r0.setVisibility(r1)
            android.widget.LinearLayout r0 = r14.mo53471n()
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r14.mo53472o()
            r0.setVisibility(r1)
            android.widget.ImageView r0 = r14.mo53473p()
            r0.setVisibility(r1)
            android.widget.TextView r0 = r14.mo53474q()
            r0.setVisibility(r1)
            com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout r0 = r14.m63047D()
            r0.setVisibility(r1)
            goto L_0x034a
        L_0x0340:
            android.widget.ImageView r0 = r14.m63054u()
            r1 = 2131955251(0x7f130e33, float:1.9547024E38)
            r0.setImageResource(r1)
        L_0x034a:
            int[] r0 = com.p683ss.android.ugc.aweme.commercialize.loft.p1576c.C26026b.f68766b
            int r1 = r5.ordinal()
            r0 = r0[r1]
            switch(r0) {
                case 1: goto L_0x0396;
                case 2: goto L_0x0376;
                case 3: goto L_0x0356;
                default: goto L_0x0355;
            }
        L_0x0355:
            goto L_0x0399
        L_0x0356:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63055v()
            r0.setAlpha(r9)
            android.widget.LinearLayout r0 = r14.m63045B()
            r0.setVisibility(r3)
            android.widget.TextView r0 = r14.m63046C()
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r14.mo53471n()
            r0.setVisibility(r3)
            r14.m63050a(r15)
            goto L_0x0399
        L_0x0376:
            com.ss.android.ugc.aweme.base.ui.RemoteImageView r0 = r14.m63055v()
            r0.setAlpha(r9)
            android.widget.LinearLayout r0 = r14.m63045B()
            r0.setVisibility(r3)
            android.widget.TextView r0 = r14.m63046C()
            r0.setVisibility(r3)
            android.widget.LinearLayout r0 = r14.mo53471n()
            r0.setVisibility(r3)
            r14.m63053b(r15)
            goto L_0x0399
        L_0x0396:
            r14.m63050a(r15)
        L_0x0399:
            r14.f68696I = r15
            r14.f68697J = r5
            r14.f68715b = r6
        L_0x039f:
            r14.f68718e = r7
        L_0x03a1:
            r14.mo53475r()
            return
        L_0x03a5:
            com.bytedance.ies.dmt.ui.widget.DmtLoadingLayout r15 = r14.m63047D()
            r15.setVisibility(r4)
            android.widget.LinearLayout r15 = r14.mo53471n()
            r15.setVisibility(r3)
            return
        L_0x03b4:
            com.ss.android.ugc.aweme.commercialize.loft.b.a r15 = r14.f68696I
            if (r15 == 0) goto L_0x03c8
            int r15 = r15.getStatus()
            int r0 = com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26012e.f68677c
            if (r15 != r0) goto L_0x03c5
            r15 = 3
            r14.m63052b(r15)
            goto L_0x03c8
        L_0x03c5:
            r14.m63052b(r1)
        L_0x03c8:
            r14.mo53477t()
            return
        L_0x03cc:
            r14.m63052b(r1)
            return
        L_0x03d0:
            r14.m63052b(r2)
            android.animation.AnimatorSet r15 = r14.f68708U
            if (r15 != 0) goto L_0x03dc
            com.ss.android.ugc.aweme.commercialize.loft.b.a r15 = r14.f68696I
            r14.m63050a(r15)
        L_0x03dc:
            return
        L_0x03dd:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.loft.p1576c.C26015a.mo53463a(com.ss.android.ugc.aweme.commercialize.loft.c.a$b):void");
    }

    /* renamed from: a */
    public static void m63049a(RemoteImageView remoteImageView, C14045f fVar) {
        LayoutParams layoutParams = remoteImageView.getLayoutParams();
        layoutParams.width = (layoutParams.height * fVar.getWidth()) / fVar.getHeight();
        remoteImageView.setLayoutParams(layoutParams);
    }

    /* renamed from: a */
    private final ObjectAnimator m63048a(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{C9432q.m18687b(this.f68724k, f), C9432q.m18687b(this.f68724k, f2)});
        C52711k.m112236a((Object) ofFloat, "animator");
        ofFloat.setRepeatMode(2);
        ofFloat.setRepeatCount(-1);
        return ofFloat;
    }

    /* renamed from: b */
    private final ObjectAnimator m63051b(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "translationY", new float[]{C9432q.m18687b(this.f68724k, f), C9432q.m18687b(this.f68724k, f2)});
        C52711k.m112236a((Object) ofFloat, "ObjectAnimator.ofFloat(v…lationY\", startDb, endDb)");
        return ofFloat;
    }
}
