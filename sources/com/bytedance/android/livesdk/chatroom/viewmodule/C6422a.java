package com.bytedance.android.livesdk.chatroom.viewmodule;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.support.p019b.C0259b;
import android.support.p019b.C0304o;
import android.support.p030v4.view.p042b.C1027f;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.chatroom.model.C5743c.C5744a;
import com.bytedance.ies.sdk.widgets.Widget;
import com.bytedance.ies.sdk.widgets.WidgetManager;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52857u;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a */
public abstract class C6422a<T extends Widget> implements C6462ax {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f17694a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(C6422a.class), "holderView", "getHolderView()Landroid/view/View;"))};

    /* renamed from: f */
    public static final C6427e f17695f = new C6427e(null);

    /* renamed from: b */
    public T f17696b;

    /* renamed from: c */
    public final View f17697c;

    /* renamed from: d */
    public boolean f17698d;

    /* renamed from: e */
    public final ViewGroup f17699e;

    /* renamed from: g */
    private final C52668f f17700g = C52732g.m112285a(new C6429g(this));

    /* renamed from: h */
    private WidgetManager f17701h;

    /* renamed from: i */
    private boolean f17702i;

    /* renamed from: j */
    private final ValueAnimator f17703j;

    /* renamed from: k */
    private final ValueAnimator f17704k;

    /* renamed from: l */
    private final ObjectAnimator f17705l;

    /* renamed from: m */
    private final int f17706m;

    /* renamed from: n */
    private final C6428f f17707n;

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a$a */
    static final class C6423a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C6422a f17708a;

        C6423a(C6422a aVar) {
            this.f17708a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LayoutParams layoutParams = this.f17708a.f17697c.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                C52711k.m112236a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    marginLayoutParams.bottomMargin = ((Integer) animatedValue).intValue();
                    this.f17708a.mo12567a().requestLayout();
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Int");
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a$b */
    public static final class C6424b extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C6422a f17709a;

        C6424b(C6422a aVar) {
            this.f17709a = aVar;
        }

        public final void onAnimationEnd(Animator animator) {
            this.f17709a.f17697c.setVisibility(8);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a$c */
    static final class C6425c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C6422a f17710a;

        C6425c(C6422a aVar) {
            this.f17710a = aVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LayoutParams layoutParams = this.f17710a.f17697c.getLayoutParams();
            if (layoutParams != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                C52711k.m112236a((Object) valueAnimator, "it");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    marginLayoutParams.bottomMargin = ((Integer) animatedValue).intValue();
                    this.f17710a.mo12567a().requestLayout();
                    return;
                }
                throw new C52857u("null cannot be cast to non-null type kotlin.Int");
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a$d */
    public static final class C6426d extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ C6422a f17711a;

        C6426d(C6422a aVar) {
            this.f17711a = aVar;
        }

        public final void onAnimationStart(Animator animator) {
            this.f17711a.f17697c.setVisibility(0);
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a$e */
    public static final class C6427e {
        private C6427e() {
        }

        public /* synthetic */ C6427e(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a$f */
    public interface C6428f {
        /* renamed from: a */
        void mo12310a(C6422a<? extends Widget> aVar, boolean z);
    }

    /* renamed from: com.bytedance.android.livesdk.chatroom.viewmodule.a$g */
    static final class C6429g extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ C6422a f17712a;

        C6429g(C6422a aVar) {
            this.f17712a = aVar;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return this.f17712a.mo12568a(this.f17712a.f17699e);
        }
    }

    /* renamed from: a */
    public final View mo12567a() {
        return (View) this.f17700g.getValue();
    }

    /* renamed from: a */
    public abstract View mo12568a(ViewGroup viewGroup);

    /* renamed from: b */
    public abstract void mo12572b();

    /* renamed from: c */
    public abstract void mo12573c();

    /* renamed from: d */
    public abstract void mo12574d();

    /* renamed from: e */
    public abstract void mo12575e();

    /* renamed from: i */
    public final void mo12579i() {
        mo12576f();
    }

    /* renamed from: l */
    private final void m13870l() {
        this.f17703j.cancel();
        this.f17705l.cancel();
    }

    /* renamed from: g */
    public final void mo12577g() {
        if (!this.f17702i) {
            C0304o.m646a(this.f17699e, new C0259b());
            this.f17699e.setVisibility(0);
            this.f17702i = true;
        }
    }

    /* renamed from: h */
    public final void mo12578h() {
        if (this.f17702i) {
            C0304o.m646a(this.f17699e, new C0259b());
            this.f17699e.setVisibility(8);
            this.f17702i = false;
        }
    }

    /* renamed from: f */
    public final void mo12576f() {
        if (this.f17696b != null) {
            mo12575e();
            WidgetManager widgetManager = this.f17701h;
            if (widgetManager != null) {
                widgetManager.unload(this.f17696b);
            }
            this.f17696b = null;
            this.f17699e.removeView(mo12567a());
            mo12578h();
        }
    }

    /* renamed from: k */
    public final void mo12581k() {
        if (!this.f17698d) {
            m13870l();
            mo12573c();
            mo12569a(this.f17703j);
            this.f17703j.start();
            this.f17705l.reverse();
            this.f17698d = true;
            this.f17707n.mo12310a(this, this.f17698d);
        }
    }

    /* renamed from: j */
    public final void mo12580j() {
        if (this.f17698d) {
            m13870l();
            mo12572b();
            ValueAnimator valueAnimator = this.f17704k;
            C52711k.m112240b(valueAnimator, "animator");
            int[] iArr = new int[2];
            LayoutParams layoutParams = this.f17697c.getLayoutParams();
            if (layoutParams != null) {
                iArr[0] = ((MarginLayoutParams) layoutParams).bottomMargin;
                iArr[1] = 0;
                valueAnimator.setIntValues(iArr);
                this.f17704k.start();
                this.f17705l.start();
                this.f17698d = false;
                this.f17707n.mo12310a(this, this.f17698d);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: a */
    public void mo12569a(ValueAnimator valueAnimator) {
        C52711k.m112240b(valueAnimator, "animator");
        int[] iArr = new int[2];
        LayoutParams layoutParams = this.f17697c.getLayoutParams();
        if (layoutParams != null) {
            iArr[0] = ((MarginLayoutParams) layoutParams).bottomMargin;
            iArr[1] = -this.f17697c.getHeight();
            valueAnimator.setIntValues(iArr);
            return;
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }

    /* renamed from: a */
    public void mo12570a(C5744a aVar) {
        C52711k.m112240b(aVar, "info");
        if (aVar.f15105e > 0) {
            int a = C3922z.m9899a((float) Math.min(aVar.f15105e, 120));
            View view = this.f17697c;
            view.getLayoutParams().height = a;
            view.requestLayout();
        }
    }

    /* renamed from: a */
    public final void mo12571a(T t, WidgetManager widgetManager) {
        C52711k.m112240b(t, "widget");
        C52711k.m112240b(widgetManager, "widgetManager");
        if (this.f17696b == null) {
            this.f17699e.addView(mo12567a());
            this.f17696b = t;
            widgetManager.load(this.f17706m, t);
            this.f17701h = widgetManager;
            mo12574d();
        }
    }

    public C6422a(ViewGroup viewGroup, int i, C6428f fVar) {
        C52711k.m112240b(viewGroup, "parentView");
        C52711k.m112240b(fVar, "stateChangeListener");
        this.f17699e = viewGroup;
        this.f17706m = i;
        this.f17707n = fVar;
        View findViewById = mo12567a().findViewById(this.f17706m);
        C52711k.m112236a((Object) findViewById, "holderView.findViewById<View>(widgetContainerId)");
        this.f17697c = findViewById;
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.addUpdateListener(new C6423a(this));
        valueAnimator.addListener(new C6424b(this));
        valueAnimator.setDuration(300);
        valueAnimator.setInterpolator(C1027f.m2954a(0.42f, 0.0f, 0.58f, 1.0f));
        this.f17703j = valueAnimator;
        ValueAnimator valueAnimator2 = new ValueAnimator();
        valueAnimator2.addUpdateListener(new C6425c(this));
        valueAnimator2.addListener(new C6426d(this));
        valueAnimator2.setDuration(300);
        valueAnimator2.setInterpolator(C1027f.m2954a(0.42f, 0.0f, 0.58f, 1.0f));
        this.f17704k = valueAnimator2;
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(this.f17697c, "alpha", new float[]{0.0f, 1.0f});
        ofFloat.setDuration(300);
        ofFloat.setInterpolator(C1027f.m2954a(0.42f, 0.0f, 0.58f, 1.0f));
        this.f17705l = ofFloat;
    }
}
