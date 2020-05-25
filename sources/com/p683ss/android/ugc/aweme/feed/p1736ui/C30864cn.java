package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.arch.lifecycle.C0199s;
import android.content.Context;
import android.os.Build.VERSION;
import android.os.Looper;
import android.os.Vibrator;
import android.text.TextUtils;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.View.OnTouchListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.FrameLayout;
import butterknife.ButterKnife;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.ies.dmt.p664ui.widget.DmtTextView;
import com.bytedance.ies.dmt.p664ui.widget.util.C10751d;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20854a;
import com.p683ss.android.ugc.aweme.app.C22835a.C22858c;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23274a;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.feed.C25908e;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26503d;
import com.p683ss.android.ugc.aweme.common.p1593e.C26869c;
import com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.model.VideoItemParams;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.p683ss.android.ugc.aweme.feed.utils.C31217y;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.aweme.i18n.language.p1805a.C33098b;
import com.p683ss.android.ugc.aweme.lego.C35857a;
import com.p683ss.android.ugc.aweme.legoImp.inflate.X2CItemFeed;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.profile.model.FollowStatus;
import com.p683ss.android.ugc.aweme.profile.model.User;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import com.ss.android.ugc.trill.R;
import org.greenrobot.eventbus.C53771m;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.cn */
public final class C30864cn extends C31009h implements C0199s<C23274a> {

    /* renamed from: a */
    public ViewGroup f80821a;

    /* renamed from: b */
    public DmtTextView f80822b;

    /* renamed from: c */
    public DmtTextView f80823c;

    /* renamed from: d */
    public final int f80824d = ((int) C9432q.m18687b(this.f81198r, 14.0f));

    /* renamed from: e */
    public final int f80825e = ((int) C9432q.m18687b(this.f81198r, 8.0f));

    /* renamed from: f */
    public boolean f80826f;

    /* renamed from: g */
    public boolean f80827g;

    /* renamed from: h */
    private C30767ar f80828h;

    /* renamed from: i */
    private C31112q f80829i;

    /* renamed from: j */
    private final OnTouchListener f80830j;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.cn$a */
    public static final class C30865a extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C30864cn f80831a;

        C30865a(C30864cn cnVar) {
            this.f80831a = cnVar;
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f80831a.f80827g = true;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f80831a.f80827g = false;
            ViewGroup viewGroup = this.f80831a.f80821a;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                viewGroup.setAlpha(1.0f);
            }
            DmtTextView dmtTextView = this.f80831a.f80823c;
            if (dmtTextView != null) {
                dmtTextView.setVisibility(8);
                dmtTextView.setText("");
                dmtTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                dmtTextView.setAlpha(0.0f);
            }
            DmtTextView dmtTextView2 = this.f80831a.f80822b;
            if (dmtTextView2 != null) {
                dmtTextView2.setVisibility(8);
                dmtTextView2.setAlpha(1.0f);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.cn$b */
    public static final class C30866b extends C26869c {

        /* renamed from: a */
        final /* synthetic */ C30864cn f80832a;

        C30866b(C30864cn cnVar) {
            this.f80832a = cnVar;
        }

        /* renamed from: b */
        public final Animator mo51960b(View view) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f80832a.f80822b, "alpha", new float[]{0.75f});
            C52711k.m112236a((Object) ofFloat, "ObjectAnimator.ofFloat(m…llowView, \"alpha\", 0.75f)");
            return ofFloat;
        }

        /* renamed from: c */
        public final Animator mo51961c(View view) {
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f80832a.f80822b, "alpha", new float[]{0.75f});
            C52711k.m112236a((Object) ofFloat, "ObjectAnimator.ofFloat(m…llowView, \"alpha\", 0.75f)");
            return ofFloat;
        }

        /* renamed from: a */
        public final void mo51959a(View view, MotionEvent motionEvent) {
            this.f80832a.mo63600b(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.cn$c */
    static final class C30867c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C30864cn f80833a;

        C30867c(C30864cn cnVar) {
            this.f80833a = cnVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            this.f80833a.mo63600b(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.cn$d */
    static final class C30868d implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C30864cn f80834a;

        /* renamed from: b */
        final /* synthetic */ FollowStatus f80835b;

        C30868d(C30864cn cnVar, FollowStatus followStatus) {
            this.f80834a = cnVar;
            this.f80835b = followStatus;
        }

        public final void run() {
            if (!TextUtils.isEmpty(this.f80835b.userId) && TextUtils.equals(C23198ae.m56846a(this.f80834a.f81192l), this.f80835b.userId)) {
                Aweme aweme = this.f80834a.f81192l;
                C52711k.m112236a((Object) aweme, "mAweme");
                if (aweme.getAuthor() != null) {
                    Aweme aweme2 = this.f80834a.f81192l;
                    C52711k.m112236a((Object) aweme2, "mAweme");
                    User author = aweme2.getAuthor();
                    C52711k.m112236a((Object) author, "mAweme.author");
                    author.setFollowStatus(this.f80835b.followStatus);
                    Aweme aweme3 = this.f80834a.f81192l;
                    C52711k.m112236a((Object) aweme3, "mAweme");
                    User author2 = aweme3.getAuthor();
                    C52711k.m112236a((Object) author2, "mAweme.author");
                    author2.setFollowerStatus(this.f80835b.followerStatus);
                }
                this.f80834a.mo63599a(this.f80835b.followStatus);
                this.f80834a.f80826f = false;
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.cn$e */
    static final class C30869e implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C30864cn f80836a;

        /* renamed from: b */
        final /* synthetic */ float f80837b;

        /* renamed from: c */
        final /* synthetic */ float f80838c;

        /* renamed from: d */
        final /* synthetic */ boolean f80839d;

        /* renamed from: e */
        final /* synthetic */ String f80840e;

        C30869e(C30864cn cnVar, float f, float f2, boolean z, String str) {
            this.f80836a = cnVar;
            this.f80837b = f;
            this.f80838c = f2;
            this.f80839d = z;
            this.f80840e = str;
        }

        public final void run() {
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f80836a.f80822b, "alpha", new float[]{0.0f}).setDuration(160);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f80836a.f80823c, "alpha", new float[]{1.0f}).setDuration(160);
            C52711k.m112236a((Object) duration2, "fadeInAnim");
            duration2.setStartDelay(40);
            if (this.f80837b < this.f80838c && this.f80838c != 0.0f) {
                animatorSet.playTogether(new Animator[]{duration, duration2, ObjectAnimator.ofFloat(this.f80836a.f80821a, "scaleX", new float[]{this.f80837b / this.f80838c}).setDuration(200)});
            } else if (this.f80837b <= this.f80838c || this.f80837b == 0.0f) {
                animatorSet.playTogether(new Animator[]{duration, duration2});
            } else {
                animatorSet.playTogether(new Animator[]{duration, duration2, ObjectAnimator.ofFloat(this.f80836a.f80821a, "scaleX", new float[]{1.0f}).setDuration(200)});
            }
            animatorSet.addListener(new AnimatorListenerAdapter(this) {

                /* renamed from: a */
                final /* synthetic */ C30869e f80841a;

                /* renamed from: com.ss.android.ugc.aweme.feed.ui.cn$e$1$a */
                static final class C30871a implements Runnable {

                    /* renamed from: a */
                    final /* synthetic */ C308701 f80842a;

                    C30871a(C308701 r1) {
                        this.f80842a = r1;
                    }

                    public final void run() {
                        Object systemService = this.f80842a.f80841a.f80836a.f81198r.getSystemService("vibrator");
                        if (systemService instanceof Vibrator) {
                            ((Vibrator) systemService).vibrate(15);
                        }
                    }
                }

                {
                    this.f80841a = r1;
                }

                public final void onAnimationStart(Animator animator) {
                    super.onAnimationStart(animator);
                    this.f80841a.f80836a.f80827g = true;
                    ViewGroup viewGroup = this.f80841a.f80836a.f80821a;
                    if (viewGroup != null) {
                        viewGroup.postDelayed(new C30871a(this), 185);
                    }
                }

                public final void onAnimationEnd(Animator animator) {
                    String str;
                    int i;
                    this.f80841a.f80836a.f80827g = false;
                    DmtTextView dmtTextView = this.f80841a.f80836a.f80822b;
                    if (dmtTextView != null) {
                        dmtTextView.setVisibility(0);
                        if (this.f80841a.f80839d) {
                            str = "";
                        } else {
                            str = this.f80841a.f80840e;
                        }
                        dmtTextView.setText(str);
                        if (this.f80841a.f80839d) {
                            i = R.drawable.csd;
                        } else {
                            i = 0;
                        }
                        dmtTextView.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
                        LayoutParams layoutParams = dmtTextView.getLayoutParams();
                        if (layoutParams != null) {
                            FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                            if (this.f80841a.f80839d) {
                                dmtTextView.setPadding(this.f80841a.f80836a.f80824d, 0, this.f80841a.f80836a.f80824d, 0);
                            } else {
                                dmtTextView.setPadding(this.f80841a.f80836a.f80825e, 0, this.f80841a.f80836a.f80825e, 0);
                            }
                            dmtTextView.setLayoutParams(layoutParams2);
                            dmtTextView.setAlpha(1.0f);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    }
                    DmtTextView dmtTextView2 = this.f80841a.f80836a.f80823c;
                    if (dmtTextView2 != null) {
                        dmtTextView2.setVisibility(8);
                        dmtTextView2.setText("");
                        dmtTextView2.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                        LayoutParams layoutParams3 = dmtTextView2.getLayoutParams();
                        if (layoutParams3 != null) {
                            FrameLayout.LayoutParams layoutParams4 = (FrameLayout.LayoutParams) layoutParams3;
                            dmtTextView2.setPadding(this.f80841a.f80836a.f80825e, 0, this.f80841a.f80836a.f80825e, 0);
                            dmtTextView2.setLayoutParams(layoutParams4);
                            dmtTextView2.setAlpha(0.0f);
                        } else {
                            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
                        }
                    }
                    ViewGroup viewGroup = this.f80841a.f80836a.f80821a;
                    if (viewGroup != null) {
                        viewGroup.setScaleX(1.0f);
                    }
                }
            });
            animatorSet.start();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.cn$f */
    public static final class C30872f extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C30864cn f80843a;

        /* renamed from: b */
        final /* synthetic */ float f80844b;

        /* renamed from: c */
        final /* synthetic */ String f80845c;

        /* renamed from: com.ss.android.ugc.aweme.feed.ui.cn$f$a */
        static final class C30873a implements Runnable {

            /* renamed from: a */
            final /* synthetic */ C30872f f80846a;

            C30873a(C30872f fVar) {
                this.f80846a = fVar;
            }

            public final void run() {
                Object systemService = this.f80846a.f80843a.f81198r.getSystemService("vibrator");
                if (systemService instanceof Vibrator) {
                    ((Vibrator) systemService).vibrate(15);
                }
            }
        }

        public final void onAnimationStart(Animator animator) {
            super.onAnimationStart(animator);
            this.f80843a.f80827g = true;
            ViewGroup viewGroup = this.f80843a.f80821a;
            if (viewGroup != null) {
                viewGroup.postDelayed(new C30873a(this), 285);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            this.f80843a.f80827g = false;
            ViewGroup viewGroup = this.f80843a.f80821a;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                viewGroup.setAlpha(1.0f);
            }
            DmtTextView dmtTextView = this.f80843a.f80823c;
            if (dmtTextView != null) {
                dmtTextView.setText("");
                dmtTextView.setAlpha(0.0f);
                dmtTextView.setVisibility(8);
            }
            DmtTextView dmtTextView2 = this.f80843a.f80822b;
            if (dmtTextView2 != null) {
                dmtTextView2.setAlpha(this.f80844b);
                dmtTextView2.setText(this.f80845c);
                dmtTextView2.setVisibility(0);
            }
        }

        C30872f(C30864cn cnVar, float f, String str) {
            this.f80843a = cnVar;
            this.f80844b = f;
            this.f80845c = str;
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49783a(View view) {
        View view2 = ((X2CItemFeed) C35857a.m81002b(X2CItemFeed.class)).getView(this.f81198r, PlayerRedesignExperiment.m70953a() == 4 ? R.layout.b6n : R.layout.b6m);
        if (view instanceof FrameLayout) {
            ((FrameLayout) view).addView(view2);
        }
        ButterKnife.bind((Object) this, view2);
        C52711k.m112236a((Object) view2, "contentView");
        this.f80829i = new C31112q(view2);
        OnTouchListener onTouchListener = this.f80830j;
        Context context = this.f81198r;
        C52711k.m112236a((Object) context, "mContext");
        this.f80828h = new C30767ar(view, onTouchListener, context);
        DmtTextView dmtTextView = null;
        this.f80821a = view != null ? (ViewGroup) view.findViewById(R.id.ai3) : null;
        this.f80822b = view != null ? (DmtTextView) view.findViewById(R.id.ai0) : null;
        DmtTextView dmtTextView2 = this.f80822b;
        if (dmtTextView2 != null) {
            dmtTextView2.setFontType(C10751d.f28903b);
        }
        if (view != null) {
            dmtTextView = (DmtTextView) view.findViewById(R.id.e9o);
        }
        this.f80823c = dmtTextView;
        DmtTextView dmtTextView3 = this.f80823c;
        if (dmtTextView3 != null) {
            dmtTextView3.setFontType(C10751d.f28903b);
        }
        C33098b a = C33098b.m76080a();
        C52711k.m112236a((Object) a, "I18nManager.get()");
        if (TextUtils.equals(a.mo70128a(C11010c.m22280a()).mo70122b(), "my")) {
            DmtTextView dmtTextView4 = this.f80822b;
            if (dmtTextView4 != null) {
                dmtTextView4.setTextSize(1, 12.0f);
            }
            DmtTextView dmtTextView5 = this.f80823c;
            if (dmtTextView5 != null) {
                dmtTextView5.setTextSize(1, 12.0f);
            }
        }
        if (PlayerRedesignExperiment.m70953a() != 4 || VERSION.SDK_INT < 21) {
            ViewGroup viewGroup = this.f80821a;
            if (viewGroup != null) {
                viewGroup.setOnClickListener(new C30867c(this));
            }
        } else {
            ViewGroup viewGroup2 = this.f80821a;
            if (viewGroup2 != null) {
                viewGroup2.setOnTouchListener(new C30866b(this));
            }
        }
    }

    /* renamed from: a */
    public final void mo49781a() {
        C31112q qVar = this.f80829i;
        if (qVar != null) {
            qVar.mo63898a();
        }
        C47718bf.m103291d(this);
    }

    /* renamed from: h */
    public final void mo63316h() {
        C31112q qVar = this.f80829i;
        if (qVar != null) {
            qVar.mo63902b();
        }
    }

    /* renamed from: d */
    private final boolean m72288d() {
        if (this.f80829i != null) {
            C31112q qVar = this.f80829i;
            if (qVar == null) {
                C52711k.m112234a();
            }
            if (qVar.f81423d != null) {
                C31112q qVar2 = this.f80829i;
                if (qVar2 == null) {
                    C52711k.m112234a();
                }
                C25908e eVar = qVar2.f81423d;
                if (eVar == null) {
                    C52711k.m112234a();
                }
                if (eVar.mo53248d()) {
                    return true;
                }
            }
        }
        return false;
    }

    /* renamed from: a */
    public final void mo58323a(VideoItemParams videoItemParams) {
        super.mo58323a(videoItemParams);
        C30767ar arVar = this.f80828h;
        if (arVar != null) {
            arVar.mo63472a(videoItemParams);
        }
        C31112q qVar = this.f80829i;
        if (qVar != null) {
            qVar.mo63900a(videoItemParams);
        }
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo49784a(DataCenter dataCenter) {
        C31112q qVar = this.f80829i;
        if (qVar != null) {
            qVar.mo63899a(dataCenter);
        }
        C30767ar arVar = this.f80828h;
        if (arVar != null) {
            arVar.mo63471a(dataCenter);
        }
        if (dataCenter != null) {
            C0199s sVar = this;
            DataCenter a = dataCenter.mo48226a("update_ad_user_follow_ui", sVar);
            if (a != null) {
                a.mo48226a("bind_follow_view", sVar);
            }
        }
    }

    @C53771m
    public final void onFollowEvent(FollowStatus followStatus) {
        C52711k.m112240b(followStatus, "followStatus");
        Runnable dVar = new C30868d(this, followStatus);
        if (C52711k.m112239a((Object) Looper.getMainLooper(), (Object) Looper.myLooper())) {
            dVar.run();
        } else if (this.f80822b != null) {
            DmtTextView dmtTextView = this.f80822b;
            if (dmtTextView == null) {
                C52711k.m112234a();
            }
            dmtTextView.post(dVar);
        } else {
            C32458a.m75144a("onFollowEvent mFollowView is null!");
        }
    }

    public final /* synthetic */ void onChanged(Object obj) {
        String str;
        C23274a aVar = (C23274a) obj;
        if (aVar != null) {
            str = aVar.f62242a;
        } else {
            str = null;
        }
        if (str != null) {
            int hashCode = str.hashCode();
            if (hashCode != -1860252652) {
                if (hashCode == -1486328463 && str.equals("bind_follow_view")) {
                    Object a = aVar.mo48246a();
                    C52711k.m112236a(a, "t.getData()");
                    mo63599a(((Number) a).intValue());
                }
            } else if (str.equals("update_ad_user_follow_ui")) {
                if (m72288d()) {
                    Aweme aweme = this.f81192l;
                    C52711k.m112236a((Object) aweme, "mAweme");
                    if (aweme.getAuthor() != null) {
                        Aweme aweme2 = this.f81192l;
                        C52711k.m112236a((Object) aweme2, "mAweme");
                        User author = aweme2.getAuthor();
                        C52711k.m112236a((Object) author, "mAweme.author");
                        mo63599a(author.getFollowStatus());
                    }
                } else {
                    ViewGroup viewGroup = this.f80821a;
                    if (viewGroup != null) {
                        viewGroup.setVisibility(8);
                    }
                }
            }
        }
    }

    /* renamed from: b */
    public final void mo63600b(View view) {
        if (view != null && view.getVisibility() == 0 && !C26503d.m64057a(this.f81192l) && !this.f80827g && !mo63785c() && this.f81192l != null) {
            Aweme aweme = this.f81192l;
            C52711k.m112236a((Object) aweme, "mAweme");
            if (!aweme.isDelete()) {
                Aweme aweme2 = this.f81192l;
                C52711k.m112236a((Object) aweme2, "mAweme");
                User author = aweme2.getAuthor();
                if (author != null) {
                    if (author.getFollowStatus() != 0) {
                        C31217y.m72906a(this.f81192l, "head_icon");
                        C23718g b = C23718g.m58207b();
                        C52711k.m112236a((Object) b, "NetworkStateManager.getInstance()");
                        if (!b.mo49153d()) {
                            C10691a.m21542b(view.getContext(), (int) R.string.cg1).mo19066a();
                            return;
                        }
                        if (this.f81197q != null) {
                            this.f80826f = true;
                            C30332aw awVar = new C30332aw(38, this.f81192l);
                            awVar.f79231d = "head_icon";
                            this.f81197q.mo48228a("feed_internal_event", (Object) awVar);
                        }
                        return;
                    }
                    CharSequence uid = author.getUid();
                    IAccountUserService g = C20854a.m53167g();
                    C52711k.m112236a((Object) g, "AccountProxyService.userService()");
                    if (!TextUtils.equals(uid, g.getCurUserId())) {
                        if (this.f80829i != null) {
                            C31112q qVar = this.f80829i;
                            if (qVar == null) {
                                C52711k.m112234a();
                            }
                            if (qVar.f81423d != null) {
                                C31112q qVar2 = this.f80829i;
                                if (qVar2 == null) {
                                    C52711k.m112234a();
                                }
                                C25908e eVar = qVar2.f81423d;
                                if (eVar == null) {
                                    C52711k.m112234a();
                                }
                                if (eVar.mo53244a() && !C26503d.m64065h(this.f81192l)) {
                                    C25945k.m62911b().mo53118a(view.getContext(), this.f81192l);
                                }
                            }
                        }
                        if (C26503d.m64067j(this.f81192l) || C26503d.m64065h(this.f81192l)) {
                            C25945k.m62911b().mo53121a(this.f81198r, this.f81192l, "plus_sign");
                        }
                        C23718g b2 = C23718g.m58207b();
                        C52711k.m112236a((Object) b2, "NetworkStateManager.getInstance()");
                        if (!b2.mo49153d()) {
                            C10691a.m21542b(this.f81198r, (int) R.string.cg1).mo19066a();
                        } else if (this.f81197q != null) {
                            this.f80826f = true;
                            C30332aw awVar2 = new C30332aw(12, this.f81192l);
                            awVar2.f79231d = C22858c.f61207c;
                            this.f81197q.mo48228a("feed_internal_event", (Object) awVar2);
                        }
                    }
                }
            }
        }
    }

    /* JADX WARNING: Removed duplicated region for block: B:111:0x022f A[Catch:{ Exception -> 0x0259 }] */
    /* JADX WARNING: Removed duplicated region for block: B:112:0x0236 A[Catch:{ Exception -> 0x0259 }] */
    /* JADX WARNING: Removed duplicated region for block: B:114:0x023e A[Catch:{ Exception -> 0x0259 }] */
    /* JADX WARNING: Removed duplicated region for block: B:115:0x0247 A[Catch:{ Exception -> 0x0259 }] */
    /* JADX WARNING: Removed duplicated region for block: B:94:0x01e4 A[Catch:{ Exception -> 0x0259 }] */
    /* renamed from: a */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void mo63599a(int r12) {
        /*
            r11 = this;
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f81192l
            r1 = 4
            if (r0 != 0) goto L_0x0019
            java.lang.String r0 = "FeedAvatarView"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "aweme is null. FollowStatus is :"
            r2.<init>(r3)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75151c(r1, r0, r12)
            return
        L_0x0019:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f81192l
            java.lang.String r2 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            if (r0 != 0) goto L_0x004d
            java.lang.String r0 = "FeedAvatarView"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "author is null. AwemeId is :"
            r2.<init>(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f81192l
            java.lang.String r4 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r3 = r3.getAid()
            r2.append(r3)
            java.lang.String r3 = ", FollowStatus is :"
            r2.append(r3)
            r2.append(r12)
            java.lang.String r12 = r2.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75151c(r1, r0, r12)
            return
        L_0x004d:
            java.lang.String r0 = "FeedAvatarView"
            java.lang.StringBuilder r2 = new java.lang.StringBuilder
            java.lang.String r3 = "AuthorUid is: "
            r2.<init>(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f81192l
            java.lang.String r4 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r3 = r3.getAuthorUid()
            r2.append(r3)
            java.lang.String r3 = ", AwemeId is :"
            r2.append(r3)
            com.ss.android.ugc.aweme.feed.model.Aweme r3 = r11.f81192l
            java.lang.String r4 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r3, r4)
            java.lang.String r3 = r3.getAid()
            r2.append(r3)
            java.lang.String r3 = ", FollowStatus is :"
            r2.append(r3)
            r2.append(r12)
            java.lang.String r2 = r2.toString()
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75151c(r1, r0, r2)
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f81192l
            java.lang.String r2 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            com.ss.android.ugc.aweme.profile.model.User r0 = r0.getAuthor()
            boolean r2 = com.p683ss.android.ugc.aweme.utils.C47915gg.m103651b()
            r3 = 8
            if (r2 != 0) goto L_0x025a
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f81192l
            r4 = 3
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26469cc.m63997a(r2, r4)
            if (r2 != 0) goto L_0x025a
            com.ss.android.ugc.aweme.feed.model.Aweme r2 = r11.f81192l
            boolean r2 = com.p683ss.android.ugc.aweme.commercialize.utils.C26503d.m64062e(r2)
            if (r2 != 0) goto L_0x025a
            java.lang.String r2 = "author"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            java.lang.String r0 = r0.getUid()
            com.ss.android.ugc.aweme.IAccountUserService r2 = com.p683ss.android.ugc.aweme.account.C20854a.m53167g()
            java.lang.String r4 = "AccountProxyService.userService()"
            p2628d.p2639f.p2641b.C52711k.m112236a(r2, r4)
            java.lang.String r2 = r2.getCurUserId()
            boolean r0 = com.bytedance.common.utility.C9431p.m18665a(r0, r2)
            if (r0 != 0) goto L_0x025a
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f81192l
            java.lang.String r2 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            boolean r0 = r0.isCanPlay()
            if (r0 != 0) goto L_0x00d5
            goto L_0x025a
        L_0x00d5:
            com.ss.android.ugc.aweme.feed.model.Aweme r0 = r11.f81192l
            java.lang.String r2 = "mAweme"
            p2628d.p2639f.p2641b.C52711k.m112236a(r0, r2)
            boolean r0 = r0.isDelete()
            if (r0 == 0) goto L_0x00f1
            android.view.ViewGroup r12 = r11.f80821a
            if (r12 == 0) goto L_0x00e9
            r12.setVisibility(r3)
        L_0x00e9:
            java.lang.String r12 = "FeedAvatarView"
            java.lang.String r0 = "aweme is delete!updateFollowView!"
            com.p683ss.android.ugc.aweme.framework.p1780a.C32458a.m75151c(r1, r12, r0)
            return
        L_0x00f1:
            boolean r0 = r11.f80827g
            if (r0 == 0) goto L_0x00f6
            return
        L_0x00f6:
            boolean r0 = r11.m72288d()     // Catch:{ Exception -> 0x0259 }
            if (r0 == 0) goto L_0x0250
            boolean r0 = r11.f80826f     // Catch:{ Exception -> 0x0259 }
            r2 = 1
            r0 = r0 ^ r2
            int r4 = com.p683ss.android.ugc.aweme.feed.experiment.PlayerRedesignExperiment.m70953a()     // Catch:{ Exception -> 0x0259 }
            r5 = 2132544886(0x7f1c0d76, float:2.0742946E38)
            r6 = 2132544788(0x7f1c0d14, float:2.0742747E38)
            r7 = 2132544747(0x7f1c0ceb, float:2.0742664E38)
            r8 = 1065353216(0x3f800000, float:1.0)
            r9 = 0
            if (r4 != r1) goto L_0x01d3
            if (r12 == r1) goto L_0x019e
            switch(r12) {
                case 0: goto L_0x0151;
                case 1: goto L_0x0131;
                case 2: goto L_0x019e;
                default: goto L_0x0117;
            }     // Catch:{ Exception -> 0x0259 }
        L_0x0117:
            android.view.ViewGroup r12 = r11.f80821a     // Catch:{ Exception -> 0x0259 }
            if (r12 == 0) goto L_0x011e
            r12.setVisibility(r3)     // Catch:{ Exception -> 0x0259 }
        L_0x011e:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.f80822b     // Catch:{ Exception -> 0x0259 }
            if (r12 == 0) goto L_0x0128
            r12.setAlpha(r8)     // Catch:{ Exception -> 0x0259 }
            r12.setVisibility(r3)     // Catch:{ Exception -> 0x0259 }
        L_0x0128:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.f80823c     // Catch:{ Exception -> 0x0259 }
            if (r12 == 0) goto L_0x0259
            r12.setVisibility(r3)     // Catch:{ Exception -> 0x0259 }
            goto L_0x0200
        L_0x0131:
            if (r0 == 0) goto L_0x014a
            android.view.ViewGroup r12 = r11.f80821a     // Catch:{ Exception -> 0x0259 }
            if (r12 == 0) goto L_0x013a
            r12.setVisibility(r3)     // Catch:{ Exception -> 0x0259 }
        L_0x013a:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.f80822b     // Catch:{ Exception -> 0x0259 }
            if (r12 == 0) goto L_0x0141
            r12.setVisibility(r3)     // Catch:{ Exception -> 0x0259 }
        L_0x0141:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.f80823c     // Catch:{ Exception -> 0x0259 }
            if (r12 == 0) goto L_0x0200
            r12.setVisibility(r3)     // Catch:{ Exception -> 0x0259 }
            goto L_0x0200
        L_0x014a:
            java.lang.String r12 = ""
            r11.m72286a(r2, r12)     // Catch:{ Exception -> 0x0259 }
            goto L_0x0200
        L_0x0151:
            android.content.Context r12 = r11.f81198r     // Catch:{ Exception -> 0x0259 }
            java.lang.String r12 = r12.getString(r7)     // Catch:{ Exception -> 0x0259 }
            if (r0 == 0) goto L_0x0195
            android.view.ViewGroup r0 = r11.f80821a     // Catch:{ Exception -> 0x0259 }
            if (r0 == 0) goto L_0x0160
            r0.setVisibility(r9)     // Catch:{ Exception -> 0x0259 }
        L_0x0160:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f80822b     // Catch:{ Exception -> 0x0259 }
            if (r0 == 0) goto L_0x018c
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x0259 }
            r0.setText(r12)     // Catch:{ Exception -> 0x0259 }
            r0.setCompoundDrawablesWithIntrinsicBounds(r9, r9, r9, r9)     // Catch:{ Exception -> 0x0259 }
            android.view.ViewGroup$LayoutParams r12 = r0.getLayoutParams()     // Catch:{ Exception -> 0x0259 }
            if (r12 == 0) goto L_0x0184
            android.widget.FrameLayout$LayoutParams r12 = (android.widget.FrameLayout.LayoutParams) r12     // Catch:{ Exception -> 0x0259 }
            int r1 = r11.f80825e     // Catch:{ Exception -> 0x0259 }
            int r2 = r11.f80825e     // Catch:{ Exception -> 0x0259 }
            r0.setPadding(r1, r9, r2, r9)     // Catch:{ Exception -> 0x0259 }
            android.view.ViewGroup$LayoutParams r12 = (android.view.ViewGroup.LayoutParams) r12     // Catch:{ Exception -> 0x0259 }
            r0.setLayoutParams(r12)     // Catch:{ Exception -> 0x0259 }
            r0.setVisibility(r9)     // Catch:{ Exception -> 0x0259 }
            goto L_0x018c
        L_0x0184:
            d.u r12 = new d.u     // Catch:{ Exception -> 0x0259 }
            java.lang.String r0 = "null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams"
            r12.<init>(r0)     // Catch:{ Exception -> 0x0259 }
            throw r12     // Catch:{ Exception -> 0x0259 }
        L_0x018c:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.f80823c     // Catch:{ Exception -> 0x0259 }
            if (r12 == 0) goto L_0x0200
            r12.setVisibility(r3)     // Catch:{ Exception -> 0x0259 }
            goto L_0x0200
        L_0x0195:
            java.lang.String r0 = "toText"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r0)     // Catch:{ Exception -> 0x0259 }
            r11.m72286a(r9, r12)     // Catch:{ Exception -> 0x0259 }
            goto L_0x0200
        L_0x019e:
            if (r12 != r1) goto L_0x01a7
            android.content.Context r12 = r11.f81198r     // Catch:{ Exception -> 0x0259 }
            java.lang.String r12 = r12.getString(r6)     // Catch:{ Exception -> 0x0259 }
            goto L_0x01ad
        L_0x01a7:
            android.content.Context r12 = r11.f81198r     // Catch:{ Exception -> 0x0259 }
            java.lang.String r12 = r12.getString(r5)     // Catch:{ Exception -> 0x0259 }
        L_0x01ad:
            if (r0 == 0) goto L_0x01ca
            android.view.ViewGroup r0 = r11.f80821a     // Catch:{ Exception -> 0x0259 }
            if (r0 == 0) goto L_0x01b6
            r0.setVisibility(r3)     // Catch:{ Exception -> 0x0259 }
        L_0x01b6:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r0 = r11.f80822b     // Catch:{ Exception -> 0x0259 }
            if (r0 == 0) goto L_0x01c2
            java.lang.CharSequence r12 = (java.lang.CharSequence) r12     // Catch:{ Exception -> 0x0259 }
            r0.setText(r12)     // Catch:{ Exception -> 0x0259 }
            r0.setVisibility(r3)     // Catch:{ Exception -> 0x0259 }
        L_0x01c2:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.f80823c     // Catch:{ Exception -> 0x0259 }
            if (r12 == 0) goto L_0x0200
            r12.setVisibility(r3)     // Catch:{ Exception -> 0x0259 }
            goto L_0x0200
        L_0x01ca:
            java.lang.String r0 = "toText"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r0)     // Catch:{ Exception -> 0x0259 }
            r11.m72286a(r9, r12)     // Catch:{ Exception -> 0x0259 }
            goto L_0x0200
        L_0x01d3:
            r10 = 5
            if (r4 == r10) goto L_0x01dd
            switch(r4) {
                case 1: goto L_0x01dd;
                case 2: goto L_0x01d9;
                case 3: goto L_0x01db;
                default: goto L_0x01d9;
            }     // Catch:{ Exception -> 0x0259 }
        L_0x01d9:
            r4 = 0
            goto L_0x01e0
        L_0x01db:
            r4 = 1
            goto L_0x01e0
        L_0x01dd:
            if (r0 != 0) goto L_0x01d9
            goto L_0x01db
        L_0x01e0:
            r10 = 1056964608(0x3f000000, float:0.5)
            if (r12 == r1) goto L_0x022d
            switch(r12) {
                case 0: goto L_0x021e;
                case 1: goto L_0x0201;
                case 2: goto L_0x022d;
                default: goto L_0x01e7;
            }     // Catch:{ Exception -> 0x0259 }
        L_0x01e7:
            android.view.ViewGroup r12 = r11.f80821a     // Catch:{ Exception -> 0x0259 }
            if (r12 == 0) goto L_0x01ee
            r12.setVisibility(r3)     // Catch:{ Exception -> 0x0259 }
        L_0x01ee:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.f80822b     // Catch:{ Exception -> 0x0259 }
            if (r12 == 0) goto L_0x01f8
            r12.setAlpha(r8)     // Catch:{ Exception -> 0x0259 }
            r12.setVisibility(r3)     // Catch:{ Exception -> 0x0259 }
        L_0x01f8:
            com.bytedance.ies.dmt.ui.widget.DmtTextView r12 = r11.f80823c     // Catch:{ Exception -> 0x0259 }
            if (r12 == 0) goto L_0x0200
            r12.setVisibility(r3)     // Catch:{ Exception -> 0x0259 }
            goto L_0x0259
        L_0x0200:
            return
        L_0x0201:
            android.content.Context r12 = r11.f81198r     // Catch:{ Exception -> 0x0259 }
            r1 = 2132544804(0x7f1c0d24, float:2.074278E38)
            java.lang.String r12 = r12.getString(r1)     // Catch:{ Exception -> 0x0259 }
            if (r4 == 0) goto L_0x0215
            java.lang.String r1 = "toText"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r1)     // Catch:{ Exception -> 0x0259 }
            r11.m72285a(r12, r10, r0)     // Catch:{ Exception -> 0x0259 }
            goto L_0x0259
        L_0x0215:
            java.lang.String r1 = "toText"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r1)     // Catch:{ Exception -> 0x0259 }
            r11.m72287a(r0, r12, r2)     // Catch:{ Exception -> 0x0259 }
            goto L_0x0259
        L_0x021e:
            android.content.Context r12 = r11.f81198r     // Catch:{ Exception -> 0x0259 }
            java.lang.String r12 = r12.getString(r7)     // Catch:{ Exception -> 0x0259 }
            java.lang.String r1 = "toText"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r1)     // Catch:{ Exception -> 0x0259 }
            r11.m72285a(r12, r8, r0)     // Catch:{ Exception -> 0x0259 }
            goto L_0x0259
        L_0x022d:
            if (r12 != r1) goto L_0x0236
            android.content.Context r12 = r11.f81198r     // Catch:{ Exception -> 0x0259 }
            java.lang.String r12 = r12.getString(r6)     // Catch:{ Exception -> 0x0259 }
            goto L_0x023c
        L_0x0236:
            android.content.Context r12 = r11.f81198r     // Catch:{ Exception -> 0x0259 }
            java.lang.String r12 = r12.getString(r5)     // Catch:{ Exception -> 0x0259 }
        L_0x023c:
            if (r4 == 0) goto L_0x0247
            java.lang.String r1 = "toText"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r1)     // Catch:{ Exception -> 0x0259 }
            r11.m72285a(r12, r10, r0)     // Catch:{ Exception -> 0x0259 }
            goto L_0x0259
        L_0x0247:
            java.lang.String r1 = "toText"
            p2628d.p2639f.p2641b.C52711k.m112236a(r12, r1)     // Catch:{ Exception -> 0x0259 }
            r11.m72287a(r0, r12, r9)     // Catch:{ Exception -> 0x0259 }
            goto L_0x0259
        L_0x0250:
            android.view.ViewGroup r12 = r11.f80821a     // Catch:{ Exception -> 0x0259 }
            if (r12 == 0) goto L_0x0258
            r12.setVisibility(r3)     // Catch:{ Exception -> 0x0259 }
            goto L_0x0259
        L_0x0258:
            return
        L_0x0259:
            return
        L_0x025a:
            android.view.ViewGroup r12 = r11.f80821a
            if (r12 == 0) goto L_0x0262
            r12.setVisibility(r3)
            return
        L_0x0262:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.p1736ui.C30864cn.mo63599a(int):void");
    }

    public C30864cn(View view, OnTouchListener onTouchListener) {
        super(view);
        this.f80830j = onTouchListener;
        C47718bf.m103290c(this);
    }

    /* renamed from: a */
    private final void m72286a(boolean z, String str) {
        float f;
        float f2;
        int i;
        int i2;
        CharSequence charSequence;
        int i3;
        DmtTextView dmtTextView = this.f80823c;
        float f3 = 0.0f;
        if (dmtTextView != null) {
            dmtTextView.setVisibility(0);
            if (z) {
                charSequence = "";
            } else {
                charSequence = str;
            }
            dmtTextView.setText(charSequence);
            if (z) {
                i3 = R.drawable.csd;
            } else {
                i3 = 0;
            }
            dmtTextView.setCompoundDrawablesWithIntrinsicBounds(i3, 0, 0, 0);
            LayoutParams layoutParams = dmtTextView.getLayoutParams();
            if (layoutParams != null) {
                FrameLayout.LayoutParams layoutParams2 = (FrameLayout.LayoutParams) layoutParams;
                if (z) {
                    dmtTextView.setPadding(this.f80824d, 0, this.f80824d, 0);
                } else {
                    dmtTextView.setPadding(this.f80825e, 0, this.f80825e, 0);
                }
                dmtTextView.setLayoutParams(layoutParams2);
                dmtTextView.setAlpha(0.0f);
            } else {
                throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout.LayoutParams");
            }
        }
        DmtTextView dmtTextView2 = this.f80822b;
        if (dmtTextView2 != null) {
            dmtTextView2.setVisibility(0);
        }
        DmtTextView dmtTextView3 = this.f80822b;
        if (dmtTextView3 != null) {
            ViewGroup viewGroup = this.f80821a;
            if (viewGroup != null) {
                LayoutParams layoutParams3 = viewGroup.getLayoutParams();
                if (layoutParams3 != null) {
                    i2 = layoutParams3.height;
                    dmtTextView3.measure(0, i2);
                }
            }
            i2 = 0;
            dmtTextView3.measure(0, i2);
        }
        DmtTextView dmtTextView4 = this.f80823c;
        if (dmtTextView4 != null) {
            ViewGroup viewGroup2 = this.f80821a;
            if (viewGroup2 != null) {
                LayoutParams layoutParams4 = viewGroup2.getLayoutParams();
                if (layoutParams4 != null) {
                    i = layoutParams4.height;
                    dmtTextView4.measure(0, i);
                }
            }
            i = 0;
            dmtTextView4.measure(0, i);
        }
        DmtTextView dmtTextView5 = this.f80822b;
        if (dmtTextView5 != null) {
            f = (float) dmtTextView5.getMeasuredWidth();
        } else {
            f = 0.0f;
        }
        DmtTextView dmtTextView6 = this.f80823c;
        if (dmtTextView6 != null) {
            f2 = (float) dmtTextView6.getMeasuredWidth();
        } else {
            f2 = 0.0f;
        }
        ViewGroup viewGroup3 = this.f80821a;
        if (viewGroup3 != null) {
            if (f2 > f && f2 != 0.0f) {
                viewGroup3.setScaleX(f / f2);
            }
            if (VERSION.SDK_INT >= 17) {
                if (viewGroup3.getLayoutDirection() == 1) {
                    f3 = (float) viewGroup3.getMeasuredWidth();
                }
                viewGroup3.setPivotX(f3);
            } else {
                viewGroup3.setPivotX(0.0f);
            }
            viewGroup3.setPivotY((float) (viewGroup3.getMeasuredHeight() / 2));
        }
        ViewGroup viewGroup4 = this.f80821a;
        if (viewGroup4 != null) {
            C30869e eVar = new C30869e(this, f2, f, z, str);
            viewGroup4.post(eVar);
        }
    }

    /* renamed from: a */
    private final void m72285a(String str, float f, boolean z) {
        if (z) {
            ViewGroup viewGroup = this.f80821a;
            if (viewGroup != null) {
                viewGroup.setVisibility(0);
                viewGroup.setAlpha(1.0f);
            }
            DmtTextView dmtTextView = this.f80823c;
            if (dmtTextView != null) {
                dmtTextView.setText("");
                dmtTextView.setAlpha(0.0f);
                dmtTextView.setVisibility(8);
            }
            DmtTextView dmtTextView2 = this.f80822b;
            if (dmtTextView2 != null) {
                dmtTextView2.setAlpha(f);
                dmtTextView2.setText(str);
                dmtTextView2.setVisibility(0);
            }
        } else {
            ViewGroup viewGroup2 = this.f80821a;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
            }
            DmtTextView dmtTextView3 = this.f80822b;
            if (dmtTextView3 != null) {
                dmtTextView3.setVisibility(0);
            }
            DmtTextView dmtTextView4 = this.f80823c;
            if (dmtTextView4 != null) {
                dmtTextView4.setVisibility(0);
                dmtTextView4.setText(str);
                dmtTextView4.setAlpha(0.0f);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f80822b, "alpha", new float[]{1.0f, 0.3f}).setDuration(100);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f80822b, "alpha", new float[]{0.3f, 0.0f}).setDuration(30);
            C52711k.m112236a((Object) duration2, "goneAnim");
            duration2.setStartDelay(100);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.f80823c, "alpha", new float[]{0.0f, f}).setDuration(200);
            C52711k.m112236a((Object) duration3, "fadeInAnim");
            duration3.setStartDelay(100);
            animatorSet.playTogether(new Animator[]{duration, duration2, duration3});
            animatorSet.addListener(new C30872f(this, f, str));
            animatorSet.start();
        }
    }

    /* renamed from: a */
    private final void m72287a(boolean z, String str, boolean z2) {
        int i;
        if (z) {
            ViewGroup viewGroup = this.f80821a;
            if (viewGroup != null) {
                viewGroup.setVisibility(8);
                viewGroup.setAlpha(1.0f);
            }
            DmtTextView dmtTextView = this.f80823c;
            if (dmtTextView != null) {
                dmtTextView.setVisibility(8);
                dmtTextView.setText("");
                dmtTextView.setCompoundDrawablesWithIntrinsicBounds(0, 0, 0, 0);
                dmtTextView.setAlpha(0.0f);
            }
            DmtTextView dmtTextView2 = this.f80822b;
            if (dmtTextView2 != null) {
                dmtTextView2.setVisibility(8);
                dmtTextView2.setAlpha(1.0f);
            }
        } else {
            ViewGroup viewGroup2 = this.f80821a;
            if (viewGroup2 != null) {
                viewGroup2.setVisibility(0);
                viewGroup2.setAlpha(1.0f);
            }
            DmtTextView dmtTextView3 = this.f80823c;
            if (dmtTextView3 != null) {
                dmtTextView3.setVisibility(0);
                if (z2) {
                    str = "";
                }
                dmtTextView3.setText(str);
                if (z2) {
                    i = R.drawable.csd;
                } else {
                    i = 0;
                }
                dmtTextView3.setCompoundDrawablesWithIntrinsicBounds(i, 0, 0, 0);
                dmtTextView3.setAlpha(0.0f);
            }
            DmtTextView dmtTextView4 = this.f80822b;
            if (dmtTextView4 != null) {
                dmtTextView4.setVisibility(0);
            }
            AnimatorSet animatorSet = new AnimatorSet();
            ObjectAnimator duration = ObjectAnimator.ofFloat(this.f80822b, "alpha", new float[]{0.0f}).setDuration(150);
            ObjectAnimator duration2 = ObjectAnimator.ofFloat(this.f80823c, "alpha", new float[]{0.0f, 1.0f}).setDuration(150);
            C52711k.m112236a((Object) duration2, "fadeInAnim");
            duration2.setStartDelay(50);
            ObjectAnimator duration3 = ObjectAnimator.ofFloat(this.f80821a, "alpha", new float[]{0.0f}).setDuration(400);
            C52711k.m112236a((Object) duration3, "fadeOutAnim");
            duration3.setStartDelay(500);
            animatorSet.playTogether(new Animator[]{duration, duration2, duration3});
            animatorSet.addListener(new C30865a(this));
            animatorSet.start();
        }
    }
}
