package com.p683ss.android.ugc.aweme.feed.interest.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.AnimatorSet.Builder;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.graphics.drawable.C0809a;
import android.support.p030v4.view.p042b.C1027f;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.Interpolator;
import android.widget.FrameLayout;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.p683ss.android.ugc.aweme.feed.interest.p1725a.C30409a;
import com.p683ss.android.ugc.aweme.widget.flowlayout.C48396c;
import com.p683ss.android.ugc.aweme.widget.flowlayout.TagFlowLayout;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.C52847n;
import p2628d.C52856t;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestTagLayout */
public final class InterestTagLayout extends TagFlowLayout {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f79520a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(InterestTagLayout.class), "selectBigInterpolator", "getSelectBigInterpolator()Landroid/view/animation/Interpolator;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(InterestTagLayout.class), "selectSmallInterpolator", "getSelectSmallInterpolator()Lcom/ss/android/ugc/aweme/feed/interest/animation/SpringInterpolator;"))};

    /* renamed from: b */
    public static final float f79521b = ((float) C23728o.m58241a(5.0d));

    /* renamed from: c */
    public static final C30425a f79522c = new C30425a(null);

    /* renamed from: h */
    private final int f79523h;

    /* renamed from: i */
    private final List<C52847n<Integer, C30431b<Integer>>> f79524i;

    /* renamed from: j */
    private final List<View> f79525j;

    /* renamed from: k */
    private final C30431b<Integer> f79526k;

    /* renamed from: l */
    private final C52668f f79527l;

    /* renamed from: m */
    private final C52668f f79528m;

    /* renamed from: n */
    private final List<ObjectAnimator> f79529n;

    /* renamed from: o */
    private final List<ObjectAnimator> f79530o;

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestTagLayout$a */
    public static final class C30425a {
        private C30425a() {
        }

        public /* synthetic */ C30425a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestTagLayout$b */
    static final class C30426b extends C52712l implements C52670a<Interpolator> {

        /* renamed from: a */
        public static final C30426b f79531a = new C30426b();

        C30426b() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return C1027f.m2954a(0.25f, 0.1f, 0.25f, 1.0f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestTagLayout$c */
    static final class C30427c extends C52712l implements C52670a<C30409a> {

        /* renamed from: a */
        public static final C30427c f79532a = new C30427c();

        C30427c() {
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return new C30409a(0.61f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestTagLayout$d */
    static final class C30428d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ long f79533a = 200;

        /* renamed from: b */
        final /* synthetic */ int f79534b;

        /* renamed from: c */
        final /* synthetic */ Drawable f79535c;

        /* renamed from: d */
        final /* synthetic */ View f79536d;

        /* renamed from: e */
        final /* synthetic */ AnimatorSet f79537e;

        /* renamed from: f */
        final /* synthetic */ InterestTagLayout f79538f;

        /* renamed from: g */
        final /* synthetic */ int f79539g;

        C30428d(long j, int i, Drawable drawable, View view, AnimatorSet animatorSet, InterestTagLayout interestTagLayout, int i2) {
            this.f79534b = i;
            this.f79535c = drawable;
            this.f79536d = view;
            this.f79537e = animatorSet;
            this.f79538f = interestTagLayout;
            this.f79539g = i2;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "f");
            float animatedFraction = ((float) this.f79534b) * valueAnimator.getAnimatedFraction();
            Drawable drawable = this.f79535c;
            C52711k.m112236a((Object) drawable, "originBackground");
            drawable.setAlpha((int) animatedFraction);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.interest.view.InterestTagLayout$e */
    public static final class C30429e extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ long f79540a = 200;

        /* renamed from: b */
        final /* synthetic */ int f79541b;

        /* renamed from: c */
        final /* synthetic */ Drawable f79542c;

        /* renamed from: d */
        final /* synthetic */ View f79543d;

        /* renamed from: e */
        final /* synthetic */ AnimatorSet f79544e;

        /* renamed from: f */
        final /* synthetic */ InterestTagLayout f79545f;

        /* renamed from: g */
        final /* synthetic */ int f79546g;

        public final void onAnimationCancel(Animator animator) {
            C52711k.m112240b(animator, "animation");
        }

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            this.f79544e.start();
        }

        C30429e(long j, int i, Drawable drawable, View view, AnimatorSet animatorSet, InterestTagLayout interestTagLayout, int i2) {
            this.f79541b = i;
            this.f79542c = drawable;
            this.f79543d = view;
            this.f79544e = animatorSet;
            this.f79545f = interestTagLayout;
            this.f79546g = i2;
        }
    }

    public InterestTagLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public InterestTagLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final List<View> getAllViews() {
        return this.f79525j;
    }

    public final List<ObjectAnimator> getEndObjectAnimatorList() {
        return this.f79530o;
    }

    public final C30431b<Integer> getLayoutRange() {
        return this.f79526k;
    }

    public final List<C52847n<Integer, C30431b<Integer>>> getLineLayoutList() {
        return this.f79524i;
    }

    public final Interpolator getSelectBigInterpolator() {
        return (Interpolator) this.f79527l.getValue();
    }

    public final C30409a getSelectSmallInterpolator() {
        return (C30409a) this.f79528m.getValue();
    }

    public final List<ObjectAnimator> getStartObjectAnimatorList() {
        return this.f79529n;
    }

    /* renamed from: a */
    public final void mo60849a(View view) {
        C52711k.m112240b(view, "child");
        super.mo60849a(view);
        this.f79525j.add(view);
    }

    /* renamed from: b */
    public final void mo60850b(int i, C48396c cVar) {
        super.mo60850b(i, cVar);
    }

    /* renamed from: a */
    private static boolean m71344a(C30431b<Integer> bVar, View view) {
        if (bVar.mo60862a(Integer.valueOf(view.getLeft())) || bVar.mo60862a(Integer.valueOf(view.getRight())) || bVar.mo60862a(Integer.valueOf((view.getLeft() + view.getRight()) / 2))) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo60847a(int i, int i2) {
        super.mo60847a(i, i2);
        if (i2 == 1) {
            this.f79524i.add(C52856t.m112465a(Integer.valueOf(1), new C30431b(Integer.valueOf(0), Integer.valueOf(i - 1))));
            return;
        }
        this.f79524i.add(C52856t.m112465a(Integer.valueOf(i2), new C30431b(Integer.valueOf(((Number) ((C30431b) ((C52847n) this.f79524i.get(C52575l.m112093a((List) this.f79524i))).getSecond()).f79548b).intValue() + 1), Integer.valueOf(i - 1))));
    }

    /* renamed from: a */
    public final void mo60848a(int i, C48396c cVar) {
        int i2 = i;
        super.mo60848a(i, cVar);
        if (cVar != null) {
            for (C52847n nVar : this.f79524i) {
                C30431b bVar = (C30431b) nVar.getSecond();
                if (bVar.mo60862a(Integer.valueOf(i))) {
                    int intValue = ((Number) nVar.getFirst()).intValue();
                    if (i2 >= 0 && i2 < this.f79525j.size()) {
                        View view = (View) this.f79525j.get(i2);
                        int i3 = i2 - 1;
                        if (bVar.mo60862a(Integer.valueOf(i3))) {
                            this.f79529n.add(ObjectAnimator.ofFloat(this.f79525j.get(i3), View.TRANSLATION_X, new float[]{0.0f, -f79521b}));
                            this.f79530o.add(ObjectAnimator.ofFloat(this.f79525j.get(i3), View.TRANSLATION_X, new float[]{-f79521b, 0.0f}));
                        }
                        int i4 = i2 + 1;
                        if (bVar.mo60862a(Integer.valueOf(i4))) {
                            this.f79529n.add(ObjectAnimator.ofFloat(this.f79525j.get(i4), View.TRANSLATION_X, new float[]{0.0f, f79521b}));
                            this.f79530o.add(ObjectAnimator.ofFloat(this.f79525j.get(i4), View.TRANSLATION_X, new float[]{f79521b, 0.0f}));
                        }
                        int i5 = (intValue - 1) - 1;
                        C30431b bVar2 = new C30431b(Integer.valueOf(view.getLeft()), Integer.valueOf(view.getRight()));
                        if (i5 >= 0) {
                            Object obj = this.f121715d.get(i5);
                            C52711k.m112236a(obj, "mAllViews.get(topLine)");
                            for (View view2 : (Iterable) obj) {
                                C52711k.m112236a((Object) view2, "view");
                                if (m71344a(bVar2, view2)) {
                                    this.f79529n.add(ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{0.0f, -f79521b}));
                                    this.f79530o.add(ObjectAnimator.ofFloat(view2, View.TRANSLATION_Y, new float[]{-f79521b, 0.0f}));
                                }
                            }
                        }
                        int i6 = (intValue + 1) - 1;
                        if (i6 < this.f121715d.size()) {
                            Object obj2 = this.f121715d.get(i6);
                            C52711k.m112236a(obj2, "mAllViews.get(bottomLine)");
                            for (View view3 : (Iterable) obj2) {
                                C52711k.m112236a((Object) view3, "view");
                                if (m71344a(bVar2, view3)) {
                                    this.f79529n.add(ObjectAnimator.ofFloat(view3, View.TRANSLATION_Y, new float[]{0.0f, f79521b}));
                                    this.f79530o.add(ObjectAnimator.ofFloat(view3, View.TRANSLATION_Y, new float[]{f79521b, 0.0f}));
                                }
                            }
                        }
                        FrameLayout frameLayout = (FrameLayout) view.findViewById(R.id.edk);
                        C52711k.m112236a((Object) frameLayout, "currentView.item_interest_aweme_background");
                        Drawable background = frameLayout.getBackground();
                        int c = C0809a.m2334c(background);
                        AnimatorSet animatorSet = new AnimatorSet();
                        animatorSet.setDuration(300);
                        animatorSet.setInterpolator(getSelectSmallInterpolator());
                        Builder play = animatorSet.play(ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{1.1f, 1.0f}));
                        play.with(ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{1.1f, 1.0f}));
                        for (ObjectAnimator with : this.f79530o) {
                            play.with(with);
                        }
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        animatorSet2.setDuration(200);
                        animatorSet2.setInterpolator(getSelectBigInterpolator());
                        ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 1.1f});
                        AnimatorSet animatorSet3 = animatorSet2;
                        AnimatorSet animatorSet4 = animatorSet;
                        C30428d dVar = new C30428d(200, c, background, view, animatorSet, this, i);
                        ofFloat.addUpdateListener(dVar);
                        AnimatorSet animatorSet5 = animatorSet3;
                        Builder play2 = animatorSet5.play(ofFloat);
                        play2.with(ObjectAnimator.ofFloat(view, View.SCALE_X, new float[]{1.0f, 1.1f}));
                        play2.with(ObjectAnimator.ofFloat(view, View.SCALE_Y, new float[]{1.0f, 1.1f}));
                        for (ObjectAnimator with2 : this.f79529n) {
                            play2.with(with2);
                        }
                        C30429e eVar = new C30429e(200, c, background, view, animatorSet4, this, i);
                        animatorSet5.addListener(eVar);
                        animatorSet5.start();
                        this.f79529n.clear();
                        this.f79530o.clear();
                    }
                }
            }
        }
    }

    public InterestTagLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f79523h = (int) C9432q.m18687b(context, 8.0f);
        this.f79524i = new ArrayList();
        this.f79525j = new ArrayList();
        this.f121718g = 3;
        this.f79526k = new C30431b<>(Integer.valueOf(0), Integer.valueOf(1));
        this.f79527l = C52732g.m112285a(C30426b.f79531a);
        this.f79528m = C52732g.m112285a(C30427c.f79532a);
        this.f79529n = new ArrayList();
        this.f79530o = new ArrayList();
    }

    public /* synthetic */ InterestTagLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }

    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
        C52847n nVar;
        this.f79524i.clear();
        this.f79525j.clear();
        super.onLayout(z, i, i2, i3, i4);
        int childCount = getChildCount();
        int a = C52575l.m112093a((List) this.f79524i);
        if (a == -1) {
            nVar = C52856t.m112465a(Integer.valueOf(1), Integer.valueOf(0));
        } else {
            C52847n nVar2 = (C52847n) this.f79524i.get(a);
            nVar = C52856t.m112465a(Integer.valueOf(((Number) nVar2.getFirst()).intValue() + 1), Integer.valueOf(((Number) ((C30431b) nVar2.getSecond()).f79548b).intValue() + 1));
        }
        int intValue = ((Number) nVar.getSecond()).intValue();
        int intValue2 = ((Number) nVar.getFirst()).intValue();
        if (childCount > 0) {
            C30431b<Integer> bVar = this.f79526k;
            bVar.f79547a = Integer.valueOf(intValue);
            bVar.f79548b = Integer.valueOf(childCount - 1);
            this.f79524i.add(C52856t.m112465a(Integer.valueOf(intValue2), this.f79526k));
        }
    }
}
