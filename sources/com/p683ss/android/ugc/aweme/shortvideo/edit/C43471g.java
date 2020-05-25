package com.p683ss.android.ugc.aweme.shortvideo.edit;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.widget.LinearLayout;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.common.utility.C9432q;
import com.ss.android.ugc.trill.R;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.g */
public final class C43471g {

    /* renamed from: a */
    public C43469f f109873a;

    /* renamed from: b */
    public View f109874b;

    /* renamed from: c */
    public boolean f109875c = true;

    /* renamed from: d */
    public final Activity f109876d;

    /* renamed from: e */
    private View f109877e;

    /* renamed from: f */
    private LinearLayout f109878f;

    /* renamed from: g */
    private final long f109879g = 250;

    /* renamed from: h */
    private int f109880h;

    /* renamed from: i */
    private final ViewGroup f109881i;

    /* renamed from: j */
    private final List<View> f109882j;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.g$a */
    static final class C43472a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f109883a;

        C43472a(View view) {
            this.f109883a = view;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                LayoutParams layoutParams = this.f109883a.getLayoutParams();
                layoutParams.height = intValue;
                this.f109883a.setLayoutParams(layoutParams);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.g$b */
    public static final class C43473b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f109884a;

        /* renamed from: b */
        final /* synthetic */ C43471g f109885b;

        public final void onAnimationCancel(Animator animator) {
            this.f109885b.f109875c = false;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f109884a.setVisibility(8);
            this.f109885b.f109875c = true;
        }

        C43473b(LinearLayout linearLayout, C43471g gVar) {
            this.f109884a = linearLayout;
            this.f109885b = gVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.g$c */
    static final class C43474c implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43471g f109886a;

        C43474c(C43471g gVar) {
            this.f109886a = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            C43471g gVar = this.f109886a;
            C52711k.m112236a((Object) view, "it");
            gVar.mo88422a(view);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.g$d */
    static final class C43475d implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ C43471g f109887a;

        C43475d(C43471g gVar) {
            this.f109887a = gVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            if (this.f109887a.f109875c) {
                C43471g gVar = this.f109887a;
                C52711k.m112236a((Object) view, "it");
                gVar.mo88422a(view);
                return;
            }
            this.f109887a.mo88423b();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.g$e */
    public static final class C43476e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ LinearLayout f109888a;

        /* renamed from: b */
        final /* synthetic */ C43471g f109889b;

        public final void onAnimationCancel(Animator animator) {
            this.f109889b.f109875c = true;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f109889b.f109875c = false;
        }

        public final void onAnimationStart(Animator animator) {
            LayoutParams layoutParams = this.f109888a.getLayoutParams();
            layoutParams.height = 0;
            this.f109888a.setLayoutParams(layoutParams);
            this.f109888a.setVisibility(0);
        }

        C43476e(LinearLayout linearLayout, C43471g gVar) {
            this.f109888a = linearLayout;
            this.f109889b = gVar;
        }
    }

    /* renamed from: d */
    private final void m95277d() {
        if (this.f109875c) {
            View view = this.f109874b;
            if (view != null) {
                view.setRotation(180.0f);
            }
            return;
        }
        View view2 = this.f109874b;
        if (view2 != null) {
            view2.setRotation(0.0f);
        }
    }

    /* renamed from: b */
    public final void mo88423b() {
        if (!this.f109875c) {
            LinearLayout linearLayout = this.f109878f;
            if (linearLayout != null) {
                m95277d();
                View view = linearLayout;
                ValueAnimator a = m95274a(view, this.f109880h, 0);
                a.addListener(new C43473b(linearLayout, this));
                ObjectAnimator a2 = m95273a(view, 1.0f, 0.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{a, a2});
                animatorSet.start();
            }
        }
    }

    /* renamed from: c */
    private final void m95276c() {
        View view = this.f109877e;
        if (view == null) {
            C52711k.m112237a("toolbarRootView");
        }
        this.f109878f = (LinearLayout) view.findViewById(R.id.ahp);
        int i = 0;
        for (View view2 : this.f109882j.subList(3, this.f109882j.size())) {
            LinearLayout linearLayout = this.f109878f;
            if (linearLayout != null) {
                linearLayout.addView(view2);
            }
            if (i != 0) {
                m95275b(view2);
            }
            i++;
        }
    }

    /* renamed from: a */
    public final void mo88421a() {
        boolean z = true;
        if (!this.f109882j.isEmpty()) {
            View inflate = LayoutInflater.from(this.f109876d).inflate(R.layout.l_, this.f109881i, false);
            C52711k.m112236a((Object) inflate, "LayoutInflater.from(cont… toolBarContainer, false)");
            this.f109877e = inflate;
            View view = this.f109877e;
            if (view == null) {
                C52711k.m112237a("toolbarRootView");
            }
            LinearLayout linearLayout = (LinearLayout) view.findViewById(R.id.age);
            int min = Math.min(2, this.f109882j.size() - 1);
            if (min >= 0) {
                int i = 0;
                while (true) {
                    View view2 = (View) this.f109882j.get(i);
                    linearLayout.addView(view2);
                    if (i > 0) {
                        m95275b(view2);
                    }
                    if (i == min) {
                        break;
                    }
                    i++;
                }
            }
            if (this.f109882j.size() == 4) {
                linearLayout.addView((View) this.f109882j.get(3));
                m95275b((View) this.f109882j.get(3));
            } else if (this.f109882j.size() > 4) {
                View view3 = this.f109877e;
                if (view3 == null) {
                    C52711k.m112237a("toolbarRootView");
                }
                this.f109874b = view3.findViewById(R.id.d26);
                View view4 = this.f109874b;
                if (view4 != null) {
                    view4.setVisibility(0);
                }
                View view5 = this.f109874b;
                if (view5 != null) {
                    view5.setOnClickListener(new C43474c(this));
                }
            }
            LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
            layoutParams.gravity = 8388613;
            ViewGroup viewGroup = this.f109881i;
            View view6 = this.f109877e;
            if (view6 == null) {
                C52711k.m112237a("toolbarRootView");
            }
            viewGroup.addView(view6, layoutParams);
            View view7 = this.f109874b;
            if (view7 != null) {
                view7.setOnClickListener(new C43475d(this));
            }
        }
        if (this.f109882j.size() <= 4) {
            z = false;
        }
        if (z) {
            m95276c();
        }
    }

    /* renamed from: b */
    private final void m95275b(View view) {
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            ((LinearLayout.LayoutParams) layoutParams).topMargin = (int) C9432q.m18687b((Context) this.f109876d, 12.0f);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
    }

    /* renamed from: a */
    public final void mo88422a(View view) {
        C43469f fVar = this.f109873a;
        if (fVar != null) {
            fVar.mo88401a();
        }
        if (this.f109875c) {
            LinearLayout linearLayout = this.f109878f;
            if (linearLayout != null) {
                m95277d();
                linearLayout.measure(0, 0);
                this.f109880h = linearLayout.getMeasuredHeight();
                View view2 = linearLayout;
                ValueAnimator a = m95274a(view2, 0, this.f109880h);
                a.addListener(new C43476e(linearLayout, this));
                ObjectAnimator a2 = m95273a(view2, 0.0f, 1.0f);
                AnimatorSet animatorSet = new AnimatorSet();
                animatorSet.playTogether(new Animator[]{a, a2});
                animatorSet.start();
            }
        }
    }

    public C43471g(ViewGroup viewGroup, List<? extends View> list, Activity activity) {
        C52711k.m112240b(viewGroup, "toolBarContainer");
        C52711k.m112240b(list, "editToolbarList");
        C52711k.m112240b(activity, "context");
        this.f109881i = viewGroup;
        this.f109882j = list;
        this.f109876d = activity;
    }

    /* renamed from: a */
    private final ObjectAnimator m95273a(View view, float f, float f2) {
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(view, "alpha", new float[]{f, f2});
        C52711k.m112236a((Object) ofFloat, "alphaAnimator");
        ofFloat.setDuration(this.f109879g);
        return ofFloat;
    }

    /* renamed from: a */
    private final ValueAnimator m95274a(View view, int i, int i2) {
        ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{i, i2});
        C52711k.m112236a((Object) ofInt, "heightAnimator");
        ofInt.setDuration(this.f109879g);
        ofInt.addUpdateListener(new C43472a(view));
        return ofInt;
    }
}
