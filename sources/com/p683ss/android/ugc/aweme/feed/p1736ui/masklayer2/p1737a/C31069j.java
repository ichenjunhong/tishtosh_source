package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.p1737a;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.TextView;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ttve.utils.C20141b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.feed.C29981aa;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31051a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31078d;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31080f;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31082h;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.C31083i;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31094b;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31094b.C31095a;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31096c;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31101f;
import com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer2.layout.C31102g;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.p1382aq.C23198ae;
import com.p683ss.android.ugc.aweme.shortvideo.C42422am;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.j */
public final class C31069j extends C31068i {

    /* renamed from: d */
    public static final C31070a f81324d = new C31070a(null);

    /* renamed from: i */
    private static final int f81325i = ((int) C20141b.m49696a(C11010c.m22280a(), 8.0f));

    /* renamed from: j */
    private static final C42422am f81326j = new C42422am(0.25f, 0.1f, 0.25f, 1.0f);

    /* renamed from: a */
    public ViewGroup f81327a;

    /* renamed from: b */
    public ViewGroup f81328b;

    /* renamed from: c */
    public final C31051a f81329c;

    /* renamed from: g */
    private C31083i f81330g;

    /* renamed from: h */
    private AnimatorSet f81331h;

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.j$a */
    public static final class C31070a {
        private C31070a() {
        }

        public /* synthetic */ C31070a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.j$b */
    static final class C31071b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C31069j f81332a;

        C31071b(C31069j jVar) {
            this.f81332a = jVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                ViewGroup viewGroup = this.f81332a.f81327a;
                if (viewGroup != null) {
                    viewGroup.setAlpha(floatValue);
                }
                if (floatValue <= 0.0f) {
                    ViewGroup viewGroup2 = this.f81332a.f81327a;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(4);
                        return;
                    }
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.j$c */
    static final class C31072c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C31069j f81333a;

        C31072c(C31069j jVar) {
            this.f81333a = jVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                float floatValue = ((Float) animatedValue).floatValue();
                ViewGroup viewGroup = this.f81333a.f81328b;
                if (viewGroup != null) {
                    viewGroup.setAlpha(floatValue);
                }
                if (floatValue > 0.0f) {
                    ViewGroup viewGroup2 = this.f81333a.f81328b;
                    if (viewGroup2 != null) {
                        viewGroup2.setVisibility(0);
                        return;
                    }
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.j$d */
    static final class C31073d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C31069j f81334a;

        C31073d(C31069j jVar) {
            this.f81334a = jVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup viewGroup = this.f81334a.f81327a;
                if (viewGroup != null) {
                    viewGroup.setScrollX(intValue);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.j$e */
    static final class C31074e implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C31069j f81335a;

        C31074e(C31069j jVar) {
            this.f81335a = jVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup viewGroup = this.f81335a.f81328b;
                if (viewGroup != null) {
                    viewGroup.setScrollX(intValue);
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer2.a.j$f */
    static final class C31075f implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C31069j f81336a;

        C31075f(C31069j jVar) {
            this.f81336a = jVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                int intValue = ((Integer) animatedValue).intValue();
                ViewGroup viewGroup = this.f81336a.f81328b;
                if (viewGroup != null) {
                    LayoutParams layoutParams = viewGroup.getLayoutParams();
                    if (layoutParams != null) {
                        layoutParams.height = intValue;
                    }
                }
                ViewGroup viewGroup2 = this.f81336a.f81328b;
                if (viewGroup2 != null) {
                    viewGroup2.requestLayout();
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    /* renamed from: b */
    public final void mo63839b(View view) {
        C52711k.m112240b(view, "v");
        mo63838a(view);
    }

    public C31069j(C31051a aVar) {
        ViewGroup viewGroup;
        C52711k.m112240b(aVar, "actionsManager");
        super(aVar);
        this.f81329c = aVar;
        C31080f fVar = this.f81329c.f81297a;
        if (fVar != null) {
            this.f81330g = (C31083i) fVar;
            C31083i iVar = this.f81330g;
            ViewGroup viewGroup2 = null;
            if (iVar != null) {
                viewGroup = iVar.mo63859b();
            } else {
                viewGroup = null;
            }
            this.f81327a = viewGroup;
            C31083i iVar2 = this.f81330g;
            if (iVar2 != null) {
                viewGroup2 = iVar2.mo63858a();
            }
            this.f81328b = viewGroup2;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.masklayer2.OptionsDialog");
    }

    /* renamed from: a */
    public final void mo63838a(View view) {
        LayoutParams layoutParams;
        LayoutParams layoutParams2;
        String str;
        Context context;
        Context context2;
        C52711k.m112240b(view, "v");
        ViewGroup viewGroup = this.f81327a;
        String str2 = null;
        if (viewGroup != null) {
            layoutParams = viewGroup.getLayoutParams();
        } else {
            layoutParams = null;
        }
        if (layoutParams != null) {
            int i = ((MarginLayoutParams) layoutParams).topMargin;
            ViewGroup viewGroup2 = this.f81328b;
            if (viewGroup2 != null) {
                layoutParams2 = viewGroup2.getLayoutParams();
            } else {
                layoutParams2 = null;
            }
            if (layoutParams2 != null) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams2;
                marginLayoutParams.topMargin = i;
                ViewGroup viewGroup3 = this.f81328b;
                if (viewGroup3 != null) {
                    viewGroup3.setLayoutParams(marginLayoutParams);
                }
                ViewGroup viewGroup4 = this.f81328b;
                if (viewGroup4 != null && viewGroup4.getChildCount() == 0) {
                    C31083i iVar = this.f81330g;
                    if (iVar != null) {
                        context = iVar.getContext();
                    } else {
                        context = null;
                    }
                    C31102g gVar = new C31102g(context);
                    C31082h hVar = new C31082h(new C31101f(0, 0), new C31052a(this.f81329c));
                    C52711k.m112240b(hVar, "item");
                    C31068i iVar2 = hVar.f81347b;
                    if (iVar2 != null) {
                        gVar.f81389h = (C31052a) iVar2;
                        ViewGroup viewGroup5 = this.f81328b;
                        if (viewGroup5 != null) {
                            viewGroup5.addView(gVar);
                        }
                        for (C31078d dVar : this.f81329c.mo63836b()) {
                            C31083i iVar3 = this.f81330g;
                            if (iVar3 != null) {
                                context2 = iVar3.getContext();
                            } else {
                                context2 = null;
                            }
                            C31094b bVar = new C31094b(context2);
                            C31096c cVar = dVar.f81342a;
                            C31068i iVar4 = dVar.f81343b;
                            C52711k.m112240b(cVar, "vo");
                            TextView textView = bVar.f81376a;
                            if (textView != null) {
                                String str3 = cVar.f81380b;
                                if (str3 == null) {
                                    str3 = "";
                                }
                                textView.setText(str3);
                            }
                            bVar.setOnClickListener(new C31095a(iVar4, cVar));
                            ViewGroup viewGroup6 = this.f81328b;
                            if (viewGroup6 != null) {
                                viewGroup6.addView(bVar);
                            }
                        }
                    } else {
                        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.feed.ui.masklayer2.action.BackPrimaryAction");
                    }
                }
                ViewGroup viewGroup7 = this.f81328b;
                if (viewGroup7 != null) {
                    ViewGroup viewGroup8 = this.f81328b;
                    if (viewGroup8 == null) {
                        C52711k.m112234a();
                    }
                    viewGroup7.measure(MeasureSpec.makeMeasureSpec(viewGroup8.getWidth(), DynamicTabYellowPointVersion.DEFAULT), 0);
                }
                AnimatorSet animatorSet = this.f81331h;
                if (animatorSet != null) {
                    animatorSet.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
                C52711k.m112236a((Object) ofFloat, "ValueAnimator.ofFloat(1f, 0f)");
                ofFloat.setDuration(300);
                ofFloat.addUpdateListener(new C31071b(this));
                ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                C52711k.m112236a((Object) ofFloat2, "ValueAnimator.ofFloat(0f, 1f)");
                ofFloat2.setDuration(300);
                ofFloat2.addUpdateListener(new C31072c(this));
                ValueAnimator ofInt = ValueAnimator.ofInt(new int[]{0, f81325i});
                C52711k.m112236a((Object) ofInt, "ValueAnimator.ofInt(0, XOFFSET)");
                ofInt.setDuration(300);
                ofInt.addUpdateListener(new C31073d(this));
                ValueAnimator ofInt2 = ValueAnimator.ofInt(new int[]{-f81325i, 0});
                C52711k.m112236a((Object) ofInt2, "ValueAnimator.ofInt(-XOFFSET, 0)");
                ofInt2.setDuration(300);
                ofInt2.addUpdateListener(new C31074e(this));
                int[] iArr = new int[2];
                ViewGroup viewGroup9 = this.f81327a;
                if (viewGroup9 == null) {
                    C52711k.m112234a();
                }
                iArr[0] = viewGroup9.getMeasuredHeight();
                ViewGroup viewGroup10 = this.f81328b;
                if (viewGroup10 == null) {
                    C52711k.m112234a();
                }
                iArr[1] = viewGroup10.getMeasuredHeight();
                ValueAnimator ofInt3 = ValueAnimator.ofInt(iArr);
                C52711k.m112236a((Object) ofInt3, "ValueAnimator.ofInt(mOpt…yLayout!!.measuredHeight)");
                ofInt3.setDuration(300);
                ofInt3.addUpdateListener(new C31075f(this));
                this.f81331h = new AnimatorSet();
                AnimatorSet animatorSet2 = this.f81331h;
                if (animatorSet2 != null) {
                    animatorSet2.setInterpolator(f81326j);
                    animatorSet2.playTogether(new Animator[]{ofFloat, ofFloat2, ofInt, ofInt2, ofInt3});
                    animatorSet2.start();
                }
                String str4 = "click_block_videos";
                C23089d a = new C23089d().mo47829a("enter_from", this.f81329c.f81299c);
                String str5 = "group_id";
                Aweme aweme = this.f81329c.f81298b;
                if (aweme != null) {
                    str = aweme.getAid();
                } else {
                    str = null;
                }
                C23089d a2 = a.mo47829a(str5, str);
                String str6 = "author_id";
                Aweme aweme2 = this.f81329c.f81298b;
                if (aweme2 != null) {
                    str2 = aweme2.getAuthorUid();
                }
                C26890h.m65011a(str4, a2.mo47829a(str6, str2).mo47829a("log_pb", C29981aa.m70153a().mo60161a(C23198ae.m56857c(this.f81329c.f81298b))).mo47829a("enter_method", "long_press").f61491a);
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
        throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
    }
}
