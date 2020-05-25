package com.p683ss.android.ugc.aweme.shortvideo.lyric;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.arch.lifecycle.C0198r;
import android.arch.lifecycle.C0209x;
import android.arch.lifecycle.C0214z;
import android.content.Context;
import android.os.Bundle;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.app.AppCompatActivity;
import android.support.p043v7.widget.LinearLayoutManager;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.view.ViewParent;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView;
import com.bytedance.ies.dmt.p664ui.widget.DmtStatusView.C10719a;
import com.bytedance.jedi.arch.JediViewModel;
import com.bytedance.scene.C12924i;
import com.p683ss.android.ugc.aweme.base.activity.C23422a;
import com.p683ss.android.ugc.aweme.base.activity.C23441t;
import com.p683ss.android.ugc.aweme.effect.p1671b.C29126a;
import com.p683ss.android.ugc.aweme.effect.p1671b.p1672a.C29137b;
import com.p683ss.android.ugc.aweme.filter.C31384a;
import com.p683ss.android.ugc.aweme.mvp.p1986b.C37721a;
import com.p683ss.android.ugc.aweme.p1484bx.C24453c;
import com.p683ss.android.ugc.aweme.p1484bx.C24454d;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h;
import com.p683ss.android.ugc.aweme.p1484bx.C24458h.C24459a;
import com.p683ss.android.ugc.aweme.shortvideo.C42482c;
import com.p683ss.android.ugc.aweme.shortvideo.C43214dh;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.lyric.C43955b.C43957b;
import com.p683ss.android.ugc.aweme.shortvideo.lyric.C43969d.C43972c;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.ColorSelectLayout;
import com.p683ss.android.ugc.aweme.story.shootvideo.textsticker.view.ColorSelectLayout.C46726a;
import com.p683ss.android.ugc.aweme.themechange.base.AVDmtPanelRecyleView;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.gamora.editor.C49393cv;
import com.p683ss.android.ugc.gamora.editor.EditLyricStickerState;
import com.p683ss.android.ugc.gamora.editor.EditLyricStickerViewModel;
import com.p683ss.android.ugc.gamora.editor.EditLyricStickerViewModel.C48957c;
import com.p683ss.android.ugc.gamora.editor.EditViewModel;
import com.p683ss.android.ugc.gamora.p2458b.C48927d;
import com.p683ss.android.ugc.tools.view.p2510c.C50220c;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f */
public class C43976f extends C12924i implements OnClickListener {

    /* renamed from: i */
    static final /* synthetic */ C52767h[] f111361i = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C43976f.class), "lyricEffectView", "getLyricEffectView()Lcom/ss/android/ugc/aweme/shortvideo/lyric/LyricEffectView;"))};

    /* renamed from: A */
    private ValueAnimator f111362A;

    /* renamed from: B */
    private ValueAnimator f111363B;

    /* renamed from: C */
    private AppCompatActivity f111364C;

    /* renamed from: D */
    private C23441t f111365D;

    /* renamed from: E */
    private FrameLayout f111366E;

    /* renamed from: F */
    private FrameLayout f111367F;

    /* renamed from: G */
    private C31384a f111368G;

    /* renamed from: H */
    private final C52668f f111369H = C52732g.m112285a(C43981e.f111393a);

    /* renamed from: I */
    private EditViewModel f111370I;

    /* renamed from: J */
    private final C23422a f111371J = new C43982f(this);

    /* renamed from: j */
    public boolean f111372j;

    /* renamed from: k */
    public boolean f111373k;

    /* renamed from: l */
    public View f111374l;

    /* renamed from: m */
    public LinearLayout f111375m;

    /* renamed from: n */
    public TextView f111376n;

    /* renamed from: o */
    public ImageView f111377o;

    /* renamed from: p */
    public ImageView f111378p;

    /* renamed from: q */
    public ColorSelectLayout f111379q;

    /* renamed from: r */
    public View f111380r;

    /* renamed from: s */
    public boolean f111381s;

    /* renamed from: t */
    public C24458h f111382t;

    /* renamed from: u */
    public float f111383u;

    /* renamed from: v */
    public float f111384v;

    /* renamed from: w */
    public EditLyricStickerViewModel f111385w;

    /* renamed from: x */
    public C49393cv f111386x;

    /* renamed from: y */
    public int f111387y;

    /* renamed from: z */
    private ValueAnimator f111388z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$a */
    public static final class C43977a extends C24459a {

        /* renamed from: a */
        final /* synthetic */ C43976f f111389a;

        /* renamed from: a */
        public final void mo50217a() {
            this.f111389a.f111381s = true;
            C24458h hVar = this.f111389a.f111382t;
            if (hVar != null) {
                hVar.mo50217a();
            }
        }

        /* renamed from: b */
        public final void mo50221b() {
            C24458h hVar = this.f111389a.f111382t;
            if (hVar != null) {
                hVar.mo50221b();
            }
            this.f111389a.f111381s = false;
        }

        /* renamed from: c */
        public final void mo50224c() {
            this.f111389a.f111381s = true;
            C24458h hVar = this.f111389a.f111382t;
            if (hVar != null) {
                hVar.mo50224c();
            }
        }

        /* renamed from: d */
        public final void mo50225d() {
            C24458h hVar = this.f111389a.f111382t;
            if (hVar != null) {
                hVar.mo50225d();
            }
            this.f111389a.f111381s = false;
        }

        C43977a(C43976f fVar) {
            this.f111389a = fVar;
        }

        /* renamed from: a */
        public final void mo50218a(float f, int i, int i2) {
            C24458h hVar = this.f111389a.f111382t;
            if (hVar != null) {
                hVar.mo50218a(f, i, i2);
            }
        }

        /* renamed from: b */
        public final void mo50222b(float f, int i, int i2) {
            C24458h hVar = this.f111389a.f111382t;
            if (hVar != null) {
                hVar.mo50222b(f, i, i2);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$b */
    static final class C43978b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43976f f111390a;

        C43978b(C43976f fVar) {
            this.f111390a = fVar;
        }

        public final void run() {
            float f;
            C43976f fVar = this.f111390a;
            ImageView imageView = this.f111390a.f111377o;
            if (imageView != null) {
                f = imageView.getX();
            } else {
                f = 0.0f;
            }
            fVar.f111383u = f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$c */
    static final class C43979c implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C43976f f111391a;

        C43979c(C43976f fVar) {
            this.f111391a = fVar;
        }

        public final void run() {
            float f;
            C43976f fVar = this.f111391a;
            ImageView imageView = this.f111391a.f111378p;
            if (imageView != null) {
                f = imageView.getX();
            } else {
                f = 0.0f;
            }
            fVar.f111384v = f;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$d */
    static final class C43980d implements C46726a {

        /* renamed from: a */
        final /* synthetic */ C43976f f111392a;

        C43980d(C43976f fVar) {
            this.f111392a = fVar;
        }

        /* renamed from: a */
        public final void mo89546a(int i) {
            EditLyricStickerViewModel editLyricStickerViewModel = this.f111392a.f111385w;
            if (editLyricStickerViewModel == null) {
                C52711k.m112237a("editLyricViewModel");
            }
            editLyricStickerViewModel.mo96876a(Integer.valueOf(i));
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$e */
    static final class C43981e extends C52712l implements C52670a<C43969d> {

        /* renamed from: a */
        public static final C43981e f111393a = new C43981e();

        C43981e() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C43969d();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$f */
    static final class C43982f implements C23422a {

        /* renamed from: a */
        final /* synthetic */ C43976f f111394a;

        C43982f(C43976f fVar) {
            this.f111394a = fVar;
        }

        public final boolean onKeyDown(int i, KeyEvent keyEvent) {
            if (i != 4) {
                return false;
            }
            this.f111394a.mo89535G();
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$g */
    public static final class C43983g implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C43976f f111395a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        C43983g(C43976f fVar) {
            this.f111395a = fVar;
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f111395a.f111387y == 0) {
                View view = this.f111395a.f111380r;
                if (view != null) {
                    view.setVisibility(0);
                }
                return;
            }
            View view2 = this.f111395a.f111380r;
            if (view2 != null) {
                view2.setVisibility(4);
            }
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f111395a.f111387y == 0) {
                TextView textView = this.f111395a.f111376n;
                if (textView == null) {
                    C52711k.m112234a();
                }
                textView.setVisibility(8);
                LinearLayout linearLayout = this.f111395a.f111375m;
                if (linearLayout == null) {
                    C52711k.m112234a();
                }
                View findViewById = linearLayout.findViewById(R.id.bas);
                C52711k.m112236a((Object) findViewById, "mBottomSheetLayout!!.findViewById<View>(R.id.line)");
                findViewById.setVisibility(0);
                return;
            }
            TextView textView2 = this.f111395a.f111376n;
            if (textView2 == null) {
                C52711k.m112234a();
            }
            textView2.setVisibility(0);
            LinearLayout linearLayout2 = this.f111395a.f111375m;
            if (linearLayout2 == null) {
                C52711k.m112234a();
            }
            View findViewById2 = linearLayout2.findViewById(R.id.bas);
            C52711k.m112236a((Object) findViewById2, "mBottomSheetLayout!!.findViewById<View>(R.id.line)");
            findViewById2.setVisibility(4);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$h */
    static final class C43984h implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C43976f f111396a;

        C43984h(C43976f fVar) {
            this.f111396a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ColorSelectLayout colorSelectLayout = this.f111396a.f111379q;
            if (colorSelectLayout == null) {
                C52711k.m112234a();
            }
            ViewParent parent = colorSelectLayout.getParent();
            if (parent != null) {
                LayoutParams layoutParams = ((View) parent).getLayoutParams();
                C52711k.m112236a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    layoutParams.width = ((Integer) animatedValue).intValue();
                    ColorSelectLayout colorSelectLayout2 = this.f111396a.f111379q;
                    if (colorSelectLayout2 == null) {
                        C52711k.m112234a();
                    }
                    ViewParent parent2 = colorSelectLayout2.getParent();
                    if (parent2 != null) {
                        ((View) parent2).getParent().requestLayout();
                        return;
                    }
                    throw new C52857u("null cannot be cast to non-null type android.view.View");
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Int");
            }
            throw new C52857u("null cannot be cast to non-null type android.view.View");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$i */
    static final class C43985i implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C43976f f111397a;

        C43985i(C43976f fVar) {
            this.f111397a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = this.f111397a.f111377o;
            if (imageView != null) {
                C52711k.m112236a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    imageView.setX(((Float) animatedValue).floatValue());
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                }
            }
            ImageView imageView2 = this.f111397a.f111377o;
            if (imageView2 != null) {
                imageView2.requestLayout();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$j */
    static final class C43986j implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C43976f f111398a;

        C43986j(C43976f fVar) {
            this.f111398a = fVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            ImageView imageView = this.f111398a.f111378p;
            if (imageView != null) {
                C52711k.m112236a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    imageView.setAlpha(((Float) animatedValue).floatValue());
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                }
            }
            ImageView imageView2 = this.f111398a.f111378p;
            if (imageView2 != null) {
                imageView2.requestLayout();
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$k */
    public static final class C43987k implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ C43976f f111399a;

        public final void onAnimationCancel(Animator animator) {
        }

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationStart(Animator animator) {
        }

        C43987k(C43976f fVar) {
            this.f111399a = fVar;
        }

        public final void onAnimationEnd(Animator animator) {
            if (this.f111399a.f111387y == 0) {
                ImageView imageView = this.f111399a.f111378p;
                if (imageView != null) {
                    imageView.setVisibility(4);
                }
                return;
            }
            ImageView imageView2 = this.f111399a.f111378p;
            if (imageView2 != null) {
                imageView2.setVisibility(0);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.lyric.f$l */
    public static final class C43988l extends C24453c {

        /* renamed from: a */
        final /* synthetic */ C43976f f111400a;

        /* renamed from: a */
        public final void mo50217a() {
            View view = this.f111400a.f111374l;
            if (view != null) {
                view.setVisibility(0);
            }
            super.mo50217a();
        }

        C43988l(C43976f fVar) {
            this.f111400a = fVar;
        }
    }

    /* renamed from: c */
    private final C43969d mo22553c() {
        return (C43969d) this.f111369H.getValue();
    }

    /* renamed from: H */
    public final Effect mo89536H() {
        C43961c cVar = mo22553c().f111347h;
        Effect effect = null;
        if (cVar != null) {
            if (cVar.f111325b.size() <= 0) {
                return null;
            }
            effect = (Effect) cVar.f111325b.get(0);
        }
        return effect;
    }

    /* renamed from: G */
    public final void mo89535G() {
        if (!this.f111381s) {
            EditLyricStickerViewModel editLyricStickerViewModel = this.f111385w;
            if (editLyricStickerViewModel == null) {
                C52711k.m112237a("editLyricViewModel");
            }
            editLyricStickerViewModel.mo96879f().setValue(Boolean.valueOf(false));
            C31384a aVar = this.f111368G;
            if (aVar != null) {
                aVar.mo50223b(new C24453c());
            }
            C23441t tVar = this.f111365D;
            if (tVar != null) {
                tVar.mo48606b(this.f111371J);
            }
        }
    }

    /* renamed from: F */
    public final void mo89534F() {
        View view;
        int i;
        if (!this.f111381s) {
            FrameLayout frameLayout = this.f111366E;
            if (frameLayout != null) {
                frameLayout.removeAllViews();
                AppCompatActivity appCompatActivity = this.f111364C;
                if (appCompatActivity == null) {
                    C52711k.m112237a("mActivity");
                }
                if (this.f111374l == null) {
                    this.f111374l = LayoutInflater.from(appCompatActivity).inflate(R.layout.axz, frameLayout, false);
                    AppCompatActivity appCompatActivity2 = this.f111364C;
                    if (appCompatActivity2 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    JediViewModel a = C48927d.m105736a(appCompatActivity2).mo96760a(EditLyricStickerViewModel.class);
                    C52711k.m112236a((Object) a, "JediViewModelProviders.o…kerViewModel::class.java)");
                    this.f111385w = (EditLyricStickerViewModel) a;
                    AppCompatActivity appCompatActivity3 = this.f111364C;
                    if (appCompatActivity3 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    JediViewModel a2 = C48927d.m105736a(appCompatActivity3).mo96760a(EditViewModel.class);
                    C52711k.m112236a((Object) a2, "JediViewModelProviders.o…ditViewModel::class.java)");
                    this.f111370I = (EditViewModel) a2;
                    View view2 = this.f111374l;
                    if (view2 != null) {
                        view = view2.findViewById(R.id.bas);
                    } else {
                        view = null;
                    }
                    this.f111380r = view;
                    View view3 = this.f111374l;
                    if (view3 == null) {
                        C52711k.m112234a();
                    }
                    this.f111375m = (LinearLayout) view3.findViewById(R.id.el0);
                    View view4 = this.f111374l;
                    if (view4 == null) {
                        C52711k.m112234a();
                    }
                    this.f111376n = (TextView) view4.findViewById(R.id.el5);
                    TextView textView = this.f111376n;
                    if (textView != null) {
                        textView.setOnClickListener(this);
                    }
                    TextView textView2 = this.f111376n;
                    if (textView2 != null) {
                        textView2.setVisibility(8);
                    }
                    View view5 = this.f111374l;
                    if (view5 == null) {
                        C52711k.m112234a();
                    }
                    this.f111377o = (ImageView) view5.findViewById(R.id.eec);
                    ImageView imageView = this.f111377o;
                    if (imageView != null) {
                        imageView.setOnClickListener(this);
                    }
                    ImageView imageView2 = this.f111377o;
                    if (imageView2 != null) {
                        imageView2.post(new C43978b(this));
                    }
                    View view6 = this.f111374l;
                    if (view6 == null) {
                        C52711k.m112234a();
                    }
                    this.f111378p = (ImageView) view6.findViewById(R.id.eeo);
                    ImageView imageView3 = this.f111378p;
                    if (imageView3 != null) {
                        imageView3.setOnClickListener(this);
                    }
                    ImageView imageView4 = this.f111378p;
                    if (imageView4 != null) {
                        imageView4.post(new C43979c(this));
                    }
                    View view7 = this.f111374l;
                    if (view7 == null) {
                        C52711k.m112234a();
                    }
                    this.f111367F = (FrameLayout) view7.findViewById(R.id.el2);
                    C43969d c = mo22553c();
                    AppCompatActivity appCompatActivity4 = this.f111364C;
                    if (appCompatActivity4 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    FrameLayout frameLayout2 = this.f111367F;
                    C52711k.m112240b(appCompatActivity4, "activity");
                    c.f111342c = appCompatActivity4;
                    AppCompatActivity appCompatActivity5 = c.f111342c;
                    if (appCompatActivity5 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    C0209x a3 = C0214z.m440a((FragmentActivity) appCompatActivity5).mo359a(LyricEffectViewModel.class);
                    C52711k.m112236a((Object) a3, "ViewModelProviders.of(mA…ectViewModel::class.java]");
                    c.f111348i = (LyricEffectViewModel) a3;
                    AppCompatActivity appCompatActivity6 = c.f111342c;
                    if (appCompatActivity6 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    JediViewModel a4 = C48927d.m105736a(appCompatActivity6).mo96760a(EditLyricStickerViewModel.class);
                    C52711k.m112236a((Object) a4, "JediViewModelProviders.o…kerViewModel::class.java]");
                    c.f111349j = (EditLyricStickerViewModel) a4;
                    if (c.f111341b == null) {
                        c.f111341b = LayoutInflater.from(appCompatActivity4).inflate(R.layout.ay0, frameLayout2, true);
                        View view8 = c.f111341b;
                        if (view8 == null) {
                            C52711k.m112234a();
                        }
                        View findViewById = view8.findViewById(R.id.el1);
                        C52711k.m112236a((Object) findViewById, "mView!!.findViewById(R.id.lyric_effect_container)");
                        c.f111343d = (AVDmtPanelRecyleView) findViewById;
                        AVDmtPanelRecyleView aVDmtPanelRecyleView = c.f111343d;
                        if (aVDmtPanelRecyleView == null) {
                            C52711k.m112237a("mLyricEffectRecyclerView");
                        }
                        AppCompatActivity appCompatActivity7 = c.f111342c;
                        if (appCompatActivity7 == null) {
                            C52711k.m112237a("mActivity");
                        }
                        aVDmtPanelRecyleView.setLayoutManager(new LinearLayoutManager(appCompatActivity7, 0, false));
                        AVDmtPanelRecyleView aVDmtPanelRecyleView2 = c.f111343d;
                        if (aVDmtPanelRecyleView2 == null) {
                            C52711k.m112237a("mLyricEffectRecyclerView");
                        }
                        c.f111344e = new C43955b(aVDmtPanelRecyleView2, c.mo89530a());
                        AVDmtPanelRecyleView aVDmtPanelRecyleView3 = c.f111343d;
                        if (aVDmtPanelRecyleView3 == null) {
                            C52711k.m112237a("mLyricEffectRecyclerView");
                        }
                        aVDmtPanelRecyleView3.setAdapter(c.f111344e);
                        C43955b bVar = c.f111344e;
                        if (bVar == null) {
                            C52711k.m112234a();
                        }
                        bVar.mo58935a(c.f111346g);
                        C43955b bVar2 = c.f111344e;
                        if (bVar2 == null) {
                            C52711k.m112234a();
                        }
                        bVar2.mo89521a(c.f111350k);
                        C43955b bVar3 = c.f111344e;
                        if (bVar3 == null) {
                            C52711k.m112234a();
                        }
                        C43957b cVar = new C43972c(c);
                        C52711k.m112240b(cVar, "onItemClickListener");
                        bVar3.f111311a = cVar;
                        View view9 = c.f111341b;
                        if (view9 == null) {
                            C52711k.m112234a();
                        }
                        View findViewById2 = view9.findViewById(R.id.bhp);
                        C52711k.m112236a((Object) findViewById2, "mView!!.findViewById(R.id.loading_status)");
                        c.f111345f = (DmtStatusView) findViewById2;
                        DmtStatusView dmtStatusView = c.f111345f;
                        if (dmtStatusView == null) {
                            C52711k.m112237a("mStatusView");
                        }
                        AppCompatActivity appCompatActivity8 = c.f111342c;
                        if (appCompatActivity8 == null) {
                            C52711k.m112237a("mActivity");
                        }
                        dmtStatusView.setBuilder(C10719a.m21676a((Context) appCompatActivity8).mo19233c(1));
                        LyricEffectViewModel lyricEffectViewModel = c.f111348i;
                        if (lyricEffectViewModel == null) {
                            C52711k.m112237a("lyricViewModel");
                        }
                        C0198r<C37721a<List<Effect>>> rVar = lyricEffectViewModel.f111300a;
                        AppCompatActivity appCompatActivity9 = c.f111342c;
                        if (appCompatActivity9 == null) {
                            C52711k.m112237a("mActivity");
                        }
                        rVar.observe(appCompatActivity9, new C43970a(c));
                        LyricEffectViewModel lyricEffectViewModel2 = c.f111348i;
                        if (lyricEffectViewModel2 == null) {
                            C52711k.m112237a("lyricViewModel");
                        }
                        C0198r<C37721a<List<Effect>>> rVar2 = lyricEffectViewModel2.f111301b;
                        AppCompatActivity appCompatActivity10 = c.f111342c;
                        if (appCompatActivity10 == null) {
                            C52711k.m112237a("mActivity");
                        }
                        rVar2.observe(appCompatActivity10, new C43971b(c));
                        C29126a a5 = c.mo89530a();
                        if (a5 != null) {
                            a5.mo58996a((C29137b) c);
                        }
                    }
                    View view10 = this.f111374l;
                    if (view10 == null) {
                        C52711k.m112234a();
                    }
                    this.f111379q = (ColorSelectLayout) view10.findViewById(R.id.v7);
                    ColorSelectLayout colorSelectLayout = this.f111379q;
                    if (colorSelectLayout != null) {
                        colorSelectLayout.setColorChangeListener(new C43980d(this));
                    }
                    EditLyricStickerViewModel editLyricStickerViewModel = this.f111385w;
                    if (editLyricStickerViewModel == null) {
                        C52711k.m112237a("editLyricViewModel");
                    }
                    AppCompatActivity appCompatActivity11 = this.f111364C;
                    if (appCompatActivity11 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    Integer defaultColor = ((EditLyricStickerState) editLyricStickerViewModel.mo97464a(appCompatActivity11)).getDefaultColor();
                    if (defaultColor != null) {
                        i = defaultColor.intValue();
                    } else {
                        i = -1;
                    }
                    mo89542d(i);
                    this.f111387y = 1;
                    View view11 = this.f111374l;
                    if (view11 == null) {
                        C52711k.m112234a();
                    }
                    LinearLayout linearLayout = this.f111375m;
                    if (linearLayout == null) {
                        C52711k.m112234a();
                    }
                    this.f111368G = new C31384a(frameLayout, view11, linearLayout);
                    C31384a aVar = this.f111368G;
                    if (aVar == null) {
                        C52711k.m112234a();
                    }
                    aVar.mo50220a((C24458h) new C43977a(this));
                }
                EditViewModel editViewModel = this.f111370I;
                if (editViewModel == null) {
                    C52711k.m112237a("editViewModel");
                }
                if (editViewModel.mo97029K()) {
                    ImageView imageView5 = this.f111378p;
                    if (imageView5 != null) {
                        imageView5.setAlpha(0.5f);
                    }
                } else {
                    ImageView imageView6 = this.f111378p;
                    if (imageView6 != null) {
                        imageView6.setAlpha(1.0f);
                    }
                }
                C42482c b = C43214dh.m94817a().mo50201b();
                if (b != null) {
                    if (this.f111387y == 0) {
                        TextView textView3 = this.f111376n;
                        if (textView3 != null) {
                            textView3.setVisibility(8);
                        }
                    } else {
                        TextView textView4 = this.f111376n;
                        if (textView4 != null) {
                            textView4.setVisibility(0);
                        }
                    }
                    TextView textView5 = this.f111376n;
                    if (textView5 != null) {
                        StringBuilder sb = new StringBuilder();
                        sb.append(b.musicName);
                        sb.append(" - ");
                        sb.append(b.authorName);
                        textView5.setText(sb.toString());
                    }
                }
                C43969d c2 = mo22553c();
                c2.mo89532a(true);
                if (c2.f111347h == null) {
                    AppCompatActivity appCompatActivity12 = c2.f111342c;
                    if (appCompatActivity12 == null) {
                        C52711k.m112237a("mActivity");
                    }
                    c2.f111347h = new C43961c(appCompatActivity12);
                }
                C43961c cVar2 = c2.f111347h;
                if (cVar2 == null) {
                    C52711k.m112234a();
                }
                cVar2.mo89528b();
                View view12 = this.f111374l;
                if (view12 != null) {
                    view12.setVisibility(4);
                }
                C31384a aVar2 = this.f111368G;
                if (aVar2 != null) {
                    aVar2.mo50219a((C24454d) new C43988l(this));
                }
                C23441t tVar = this.f111365D;
                if (tVar != null) {
                    tVar.mo48605a(this.f111371J);
                }
                EditLyricStickerViewModel editLyricStickerViewModel2 = this.f111385w;
                if (editLyricStickerViewModel2 == null) {
                    C52711k.m112237a("editLyricViewModel");
                }
                editLyricStickerViewModel2.mo96879f().setValue(Boolean.valueOf(true));
            }
            TextView textView6 = this.f111376n;
            if (textView6 == null) {
                C52711k.m112234a();
            }
            textView6.setVisibility(0);
            ImageView imageView7 = this.f111377o;
            if (imageView7 != null) {
                imageView7.setX(this.f111383u);
            }
            ImageView imageView8 = this.f111377o;
            if (imageView8 != null) {
                imageView8.requestLayout();
            }
            ImageView imageView9 = this.f111378p;
            if (imageView9 != null) {
                imageView9.setAlpha(1.0f);
            }
            ImageView imageView10 = this.f111378p;
            if (imageView10 != null) {
                imageView10.setVisibility(0);
            }
            ImageView imageView11 = this.f111378p;
            if (imageView11 != null) {
                imageView11.requestLayout();
            }
            ColorSelectLayout colorSelectLayout2 = this.f111379q;
            if (colorSelectLayout2 == null) {
                C52711k.m112234a();
            }
            ViewParent parent = colorSelectLayout2.getParent();
            if (parent != null) {
                ((View) parent).getLayoutParams().width = 0;
                ColorSelectLayout colorSelectLayout3 = this.f111379q;
                if (colorSelectLayout3 == null) {
                    C52711k.m112234a();
                }
                ViewParent parent2 = colorSelectLayout3.getParent();
                if (parent2 != null) {
                    ((View) parent2).getParent().requestLayout();
                    this.f111387y = 1;
                    View view13 = this.f111380r;
                    if (view13 != null) {
                        view13.setVisibility(4);
                        return;
                    }
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type android.view.View");
            }
            throw new C52857u("null cannot be cast to non-null type android.view.View");
        }
    }

    /* renamed from: a */
    public final void mo89539a(C24458h hVar) {
        C52711k.m112240b(hVar, "transitionListener");
        this.f111382t = hVar;
    }

    /* renamed from: a */
    public final Effect mo89537a(Effect effect) {
        C52711k.m112240b(effect, "lyricEffect");
        return mo22553c().mo89533b(effect);
    }

    /* renamed from: d */
    public final void mo89542d(int i) {
        ColorSelectLayout colorSelectLayout = this.f111379q;
        if (colorSelectLayout != null) {
            colorSelectLayout.setDefault(i);
        }
        ColorSelectLayout colorSelectLayout2 = this.f111379q;
        if (colorSelectLayout2 != null) {
            colorSelectLayout2.mo93805a(i);
        }
    }

    /* renamed from: a */
    public final void mo89538a(FragmentActivity fragmentActivity) {
        C52711k.m112240b(fragmentActivity, "context");
        mo22553c().mo89531a(fragmentActivity);
    }

    /* renamed from: a */
    public final void mo89541a(String str) {
        C43969d c = mo22553c();
        c.f111350k = str;
        C43955b bVar = c.f111344e;
        if (bVar != null) {
            bVar.mo89521a(c.f111350k);
        }
    }

    public void onClick(View view) {
        Integer num;
        int i;
        int i2;
        ValueAnimator valueAnimator;
        ValueAnimator valueAnimator2;
        ClickInstrumentation.onClick(view);
        if (view != null) {
            num = Integer.valueOf(view.getId());
        } else {
            num = null;
        }
        if (num != null && num.intValue() == R.id.eeo) {
            EditViewModel editViewModel = this.f111370I;
            if (editViewModel == null) {
                C52711k.m112237a("editViewModel");
            }
            if (!editViewModel.mo97029K()) {
                this.f111372j = true;
                mo89535G();
                EditLyricStickerViewModel editLyricStickerViewModel = this.f111385w;
                if (editLyricStickerViewModel == null) {
                    C52711k.m112237a("editLyricViewModel");
                }
                editLyricStickerViewModel.mo22530c(C48957c.INSTANCE);
                return;
            }
            return;
        }
        if (num != null && num.intValue() == R.id.eec) {
            if (this.f111387y != 0) {
                i = 1;
            } else {
                i = 0;
            }
            this.f111387y = i ^ 1;
            ColorSelectLayout colorSelectLayout = this.f111379q;
            if (colorSelectLayout == null) {
                C52711k.m112234a();
            }
            ViewParent parent = colorSelectLayout.getParent();
            if (parent != null) {
                LayoutParams layoutParams = ((View) parent).getLayoutParams();
                if (layoutParams != null) {
                    int i3 = ((MarginLayoutParams) layoutParams).width;
                    if (this.f111387y == 0) {
                        AppCompatActivity appCompatActivity = this.f111364C;
                        if (appCompatActivity == null) {
                            C52711k.m112237a("mActivity");
                        }
                        int b = C43303dy.m94971b(appCompatActivity);
                        AppCompatActivity appCompatActivity2 = this.f111364C;
                        if (appCompatActivity2 == null) {
                            C52711k.m112237a("mActivity");
                        }
                        i2 = b - ((int) C9432q.m18687b((Context) appCompatActivity2, 64.0f));
                    } else {
                        i2 = 0;
                    }
                    if (this.f111387y == 0) {
                        valueAnimator = ValueAnimator.ofFloat(new float[]{this.f111383u, this.f111384v});
                    } else {
                        valueAnimator = ValueAnimator.ofFloat(new float[]{this.f111384v, this.f111383u});
                    }
                    this.f111363B = valueAnimator;
                    if (this.f111387y == 0) {
                        valueAnimator2 = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                    } else {
                        valueAnimator2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                    }
                    this.f111388z = valueAnimator2;
                    C50220c cVar = new C50220c(0.75f, 0.0f, 0.65f, 1.0f);
                    this.f111362A = ValueAnimator.ofInt(new int[]{i3, i2}).setDuration(250);
                    ValueAnimator valueAnimator3 = this.f111362A;
                    if (valueAnimator3 != null) {
                        valueAnimator3.addListener(new C43983g(this));
                    }
                    ValueAnimator valueAnimator4 = this.f111362A;
                    if (valueAnimator4 != null) {
                        valueAnimator4.setInterpolator(cVar);
                    }
                    ValueAnimator valueAnimator5 = this.f111362A;
                    if (valueAnimator5 != null) {
                        valueAnimator5.addUpdateListener(new C43984h(this));
                    }
                    ValueAnimator valueAnimator6 = this.f111362A;
                    if (valueAnimator6 != null) {
                        valueAnimator6.start();
                    }
                    ValueAnimator valueAnimator7 = this.f111363B;
                    if (valueAnimator7 != null) {
                        valueAnimator7.setInterpolator(cVar);
                    }
                    ValueAnimator valueAnimator8 = this.f111363B;
                    if (valueAnimator8 != null) {
                        valueAnimator8.setDuration(250);
                    }
                    ValueAnimator valueAnimator9 = this.f111363B;
                    if (valueAnimator9 != null) {
                        valueAnimator9.addUpdateListener(new C43985i(this));
                    }
                    ValueAnimator valueAnimator10 = this.f111363B;
                    if (valueAnimator10 != null) {
                        valueAnimator10.start();
                    }
                    ValueAnimator valueAnimator11 = this.f111388z;
                    if (valueAnimator11 != null) {
                        valueAnimator11.setInterpolator(cVar);
                    }
                    ValueAnimator valueAnimator12 = this.f111388z;
                    if (valueAnimator12 != null) {
                        valueAnimator12.setDuration(250);
                    }
                    ValueAnimator valueAnimator13 = this.f111388z;
                    if (valueAnimator13 != null) {
                        valueAnimator13.addUpdateListener(new C43986j(this));
                    }
                    ValueAnimator valueAnimator14 = this.f111388z;
                    if (valueAnimator14 != null) {
                        valueAnimator14.addListener(new C43987k(this));
                    }
                    ValueAnimator valueAnimator15 = this.f111388z;
                    if (valueAnimator15 != null) {
                        valueAnimator15.start();
                    }
                } else {
                    throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                }
            } else {
                throw new C52857u("null cannot be cast to non-null type android.view.View");
            }
        } else if (num != null && num.intValue() == R.id.el5) {
            this.f111373k = true;
            mo89535G();
            EditLyricStickerViewModel editLyricStickerViewModel2 = this.f111385w;
            if (editLyricStickerViewModel2 == null) {
                C52711k.m112237a("editLyricViewModel");
            }
            editLyricStickerViewModel2.mo96878e().setValue(this.f111386x);
        }
    }

    /* renamed from: a */
    public final void mo89540a(Effect effect, String str) {
        this.f111386x = new C49393cv(effect, str, false);
    }

    /* renamed from: a */
    public final View mo24387a(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "container");
        Activity activity = this.f33840g_;
        if (activity != null) {
            this.f111364C = (AppCompatActivity) activity;
            Activity activity2 = this.f33840g_;
            if (!(activity2 instanceof C23441t)) {
                activity2 = null;
            }
            this.f111365D = (C23441t) activity2;
            View inflate = layoutInflater.inflate(R.layout.br8, viewGroup, false);
            if (inflate != null) {
                this.f111366E = (FrameLayout) inflate;
                FrameLayout frameLayout = this.f111366E;
                if (frameLayout == null) {
                    C52711k.m112234a();
                }
                return frameLayout;
            }
            throw new C52857u("null cannot be cast to non-null type android.widget.FrameLayout");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.app.AppCompatActivity");
    }
}
