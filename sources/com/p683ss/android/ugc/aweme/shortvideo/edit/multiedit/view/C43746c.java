package com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.view;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.graphics.Rect;
import android.support.p030v4.app.FragmentActivity;
import android.support.p030v4.p038f.C0794k;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.C1506w;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.p052a.C1385a;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;
import com.bytedance.apm.p501q.C9190h;
import com.p683ss.android.ugc.aweme.imported.C35524e;
import com.p683ss.android.ugc.aweme.shortvideo.C43303dy;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42654l;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C43099t.C43101b;
import com.p683ss.android.ugc.aweme.shortvideo.cut.CutMultiVideoViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.cut.model.VideoSegment;
import com.p683ss.android.ugc.aweme.shortvideo.cut.videoedit.VideoEditViewModel;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2197a.C43675a;
import com.p683ss.android.ugc.aweme.shortvideo.edit.multiedit.p2199c.C43690b;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c */
public final class C43746c extends C43745b {

    /* renamed from: h */
    public View f110759h;

    /* renamed from: i */
    public View f110760i;

    /* renamed from: j */
    public RecyclerView f110761j;

    /* renamed from: k */
    public int f110762k;

    /* renamed from: l */
    public int f110763l;

    /* renamed from: m */
    public ValueAnimator f110764m;

    /* renamed from: n */
    public float f110765n = 1.0f;

    /* renamed from: o */
    public float f110766o;

    /* renamed from: p */
    public float f110767p;

    /* renamed from: q */
    public C0794k<Integer, Integer> f110768q;

    /* renamed from: r */
    public AnimatorSet f110769r;

    /* renamed from: s */
    public View f110770s;

    /* renamed from: t */
    public C43675a f110771t;

    /* renamed from: u */
    private View f110772u;

    /* renamed from: v */
    private View f110773v;

    /* renamed from: w */
    private View f110774w;

    /* renamed from: x */
    private View f110775x;

    /* renamed from: y */
    private View f110776y;

    /* renamed from: z */
    private View f110777z;

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$a */
    static final class C43747a implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C43746c f110778a;

        C43747a(C43746c cVar) {
            this.f110778a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View view;
            float f;
            int a = C43746c.m96139a(this.f110778a).mo87380a(C43746c.m96140b(this.f110778a), this.f110778a.f110762k);
            int a2 = C43746c.m96139a(this.f110778a).mo87380a(C43746c.m96140b(this.f110778a), this.f110778a.f110763l);
            if (a == -1 && a2 == -1) {
                C43746c.m96141c(this.f110778a).setTranslationX(0.0f);
                C43746c.m96141c(this.f110778a).setVisibility(4);
                return;
            }
            if (a < 0 || a2 < 0) {
                C43746c.m96141c(this.f110778a).setVisibility(0);
                view = C43746c.m96141c(this.f110778a);
                if (a2 == -1) {
                    f = (float) a;
                } else {
                    f = (float) a2;
                }
            } else {
                C43746c.m96141c(this.f110778a).setVisibility(0);
                C52711k.m112236a((Object) valueAnimator, "animation");
                Object animatedValue = valueAnimator.getAnimatedValue();
                if (animatedValue != null) {
                    float floatValue = (((Float) animatedValue).floatValue() * ((float) (a2 - a))) + ((float) a);
                    f = floatValue;
                    view = C43746c.m96141c(this.f110778a);
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Float");
                }
            }
            view.setX(f);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$b */
    static final class C43748b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C43746c f110779a;

        C43748b(C43746c cVar) {
            this.f110779a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View c = C43746c.m96141c(this.f110779a);
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                c.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$c */
    static final class C43749c implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ C43746c f110780a;

        C43749c(C43746c cVar) {
            this.f110780a = cVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            View c = C43746c.m96141c(this.f110780a);
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                c.setAlpha(((Float) animatedValue).floatValue());
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$d */
    static final class C43750d implements C43101b {

        /* renamed from: a */
        final /* synthetic */ C43746c f110781a;

        C43750d(C43746c cVar) {
            this.f110781a = cVar;
        }

        /* renamed from: a */
        public final void mo87356a(View view, int i, String str) {
            C43690b bVar = this.f110781a.f110756g;
            if (bVar != null) {
                bVar.mo89119a(i);
            }
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$e */
    static final class C43751e implements OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C43746c f110782a;

        C43751e(C43746c cVar) {
            this.f110782a = cVar;
        }

        public final boolean onPreDraw() {
            ValueAnimator valueAnimator = this.f110782a.f110764m;
            if (valueAnimator == null || !valueAnimator.isRunning()) {
                int a = C43746c.m96139a(this.f110782a).mo87380a(C43746c.m96140b(this.f110782a), C43746c.m96139a(this.f110782a).f108807b);
                if (a == -1) {
                    C43746c.m96141c(this.f110782a).setVisibility(8);
                } else {
                    if (C43746c.m96141c(this.f110782a).getVisibility() == 8) {
                        C43746c.m96141c(this.f110782a).setVisibility(0);
                    }
                    C43746c.m96141c(this.f110782a).setX((float) a);
                }
            }
            return true;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$f */
    public static final class C43752f implements OnPreDrawListener {

        /* renamed from: a */
        public final int f110783a;

        /* renamed from: b */
        final /* synthetic */ C43746c f110784b;

        /* renamed from: c */
        final /* synthetic */ int f110785c;

        /* renamed from: d */
        final /* synthetic */ boolean f110786d;

        /* renamed from: e */
        final /* synthetic */ FragmentActivity f110787e;

        /* renamed from: f */
        final /* synthetic */ AnimatorListenerAdapter f110788f;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$f$a */
        public static final class C43753a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C43752f f110789a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f110790b;

            public final void onAnimationEnd(Animator animator) {
                C52711k.m112240b(animator, "animation");
                super.onAnimationEnd(animator);
                if (this.f110789a.f110787e != null && !this.f110789a.f110787e.isFinishing()) {
                    AnimatorListenerAdapter animatorListenerAdapter = this.f110789a.f110788f;
                    if (animatorListenerAdapter != null) {
                        animatorListenerAdapter.onAnimationEnd(animator);
                    }
                }
            }

            C43753a(C43752f fVar, ArrayList arrayList) {
                this.f110789a = fVar;
                this.f110790b = arrayList;
            }
        }

        public final boolean onPreDraw() {
            float f;
            float f2;
            Integer num;
            View view;
            View rootView = C43746c.m96143e(this.f110784b).getRootView();
            C52711k.m112236a((Object) rootView, "flEditVideo.rootView");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            C1352v f3 = C43746c.m96140b(this.f110784b).mo4847f(this.f110785c);
            RecyclerView b = C43746c.m96140b(this.f110784b);
            int i = this.f110785c;
            C0794k a = C35524e.m80267a(b);
            F f4 = a.f2711a;
            if (f4 == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) f4, "ret.first!!");
            Rect rect = null;
            int i2 = 2;
            if (C52711k.m112230a(i, ((Number) f4).intValue()) >= 0) {
                S s = a.f2712b;
                if (s == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) s, "ret.second!!");
                if (C52711k.m112230a(i, ((Number) s).intValue()) <= 0) {
                    C1322a adapter = b.getAdapter();
                    if (adapter != null) {
                        num = Integer.valueOf(adapter.getItemCount());
                    } else {
                        num = null;
                    }
                    if (num == null) {
                        C52711k.m112234a();
                    }
                    if (i < num.intValue() && i >= 0) {
                        C1352v f5 = b.mo4847f(i);
                        if (f5 != null) {
                            view = f5.itemView;
                        } else {
                            view = null;
                        }
                        if (view != null) {
                            int[] iArr = new int[2];
                            f5.itemView.getLocationInWindow(iArr);
                            int i3 = iArr[0];
                            int i4 = iArr[1];
                            int i5 = iArr[0];
                            View view2 = f5.itemView;
                            C52711k.m112236a((Object) view2, "viewHolder.itemView");
                            int width = i5 + view2.getWidth();
                            int i6 = iArr[1];
                            View view3 = f5.itemView;
                            C52711k.m112236a((Object) view3, "viewHolder.itemView");
                            rect = new Rect(i3, i4, width, i6 + view3.getHeight());
                        }
                    }
                }
            }
            if (rect == null || f3 == null) {
                return false;
            }
            C43746c cVar = this.f110784b;
            View view4 = f3.itemView;
            C52711k.m112236a((Object) view4, "viewHolder.itemView");
            cVar.f110770s = view4;
            this.f110784b.f110768q = C35524e.m80267a(C43746c.m96140b(this.f110784b));
            View d = C43746c.m96142d(this.f110784b);
            ArrayList arrayList = new ArrayList();
            C0794k<Integer, Integer> kVar = this.f110784b.f110768q;
            if (kVar != null) {
                F f6 = kVar.f2711a;
                if (f6 == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) f6, "range.first!!");
                int intValue = ((Number) f6).intValue();
                int i7 = this.f110785c;
                while (intValue < i7) {
                    AnimatorSet animatorSet = new AnimatorSet();
                    C1352v f7 = C43746c.m96140b(this.f110784b).mo4847f(intValue);
                    if (f7 != null) {
                        C52711k.m112236a((Object) f7, "videoRecyclerView.findVi…              ?: continue");
                        if (this.f110786d) {
                            View view5 = f7.itemView;
                            C52711k.m112236a((Object) view5, "viewHolder.itemView");
                            f2 = view5.getTranslationX() + ((float) (this.f110783a - rect.right));
                        } else {
                            View view6 = f7.itemView;
                            C52711k.m112236a((Object) view6, "viewHolder.itemView");
                            f2 = view6.getTranslationX() - ((float) rect.left);
                        }
                        float[] fArr = new float[i2];
                        View view7 = f7.itemView;
                        C52711k.m112236a((Object) view7, "viewHolder.itemView");
                        fArr[0] = view7.getTranslationX();
                        fArr[1] = f2;
                        animatorSet.play(ObjectAnimator.ofFloat(f7.itemView, "translationX", fArr));
                        animatorSet.setDuration(300);
                        arrayList.add(animatorSet);
                    }
                    intValue++;
                    i2 = 2;
                }
                int i8 = this.f110785c + 1;
                S s2 = kVar.f2712b;
                if (s2 == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) s2, "range.second!!");
                int intValue2 = ((Number) s2).intValue();
                if (i8 <= intValue2) {
                    while (true) {
                        AnimatorSet animatorSet2 = new AnimatorSet();
                        C1352v f8 = C43746c.m96140b(this.f110784b).mo4847f(i8);
                        if (f8 != null) {
                            C52711k.m112236a((Object) f8, "videoRecyclerView.findVi…              ?: continue");
                            if (this.f110786d) {
                                View view8 = f8.itemView;
                                C52711k.m112236a((Object) view8, "viewHolder.itemView");
                                f = view8.getTranslationX() - ((float) rect.left);
                            } else {
                                View view9 = f8.itemView;
                                C52711k.m112236a((Object) view9, "viewHolder.itemView");
                                f = view9.getTranslationX() + ((float) (this.f110783a - rect.right));
                            }
                            View view10 = f8.itemView;
                            C52711k.m112236a((Object) view10, "viewHolder.itemView");
                            animatorSet2.play(ObjectAnimator.ofFloat(f8.itemView, "translationX", new float[]{view10.getTranslationX(), f}));
                            animatorSet2.setDuration(300);
                            arrayList.add(animatorSet2);
                        }
                        if (i8 == intValue2) {
                            break;
                        }
                        i8++;
                    }
                }
            }
            int width2 = C43746c.m96143e(this.f110784b).getWidth();
            int width3 = rect.width();
            int[] iArr2 = new int[2];
            C43746c.m96143e(this.f110784b).getLocationInWindow(iArr2);
            this.f110784b.f110765n = (((float) width2) * 1.0f) / ((float) width3);
            float width4 = (float) (iArr2[0] + (C43746c.m96143e(this.f110784b).getWidth() / 2));
            float height = (float) (iArr2[1] + (C43746c.m96143e(this.f110784b).getHeight() / 2));
            this.f110784b.f110766o = width4 - ((float) rect.centerX());
            this.f110784b.f110767p = height - ((float) rect.centerY());
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.setDuration(300);
            animatorSet3.play(ObjectAnimator.ofFloat(d, "translationX", new float[]{0.0f, this.f110784b.f110766o})).with(ObjectAnimator.ofFloat(d, "translationY", new float[]{0.0f, this.f110784b.f110767p})).with(ObjectAnimator.ofFloat(d, "scaleX", new float[]{1.0f, this.f110784b.f110765n})).with(ObjectAnimator.ofFloat(d, "scaleY", new float[]{1.0f, this.f110784b.f110765n}));
            arrayList.add(animatorSet3);
            C43746c cVar2 = this.f110784b;
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(arrayList);
            animatorSet4.addListener(new C43753a(this, arrayList));
            cVar2.f110769r = animatorSet4;
            AnimatorSet animatorSet5 = this.f110784b.f110769r;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
            return false;
        }

        C43752f(C43746c cVar, int i, boolean z, FragmentActivity fragmentActivity, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f110784b = cVar;
            this.f110785c = i;
            this.f110786d = z;
            this.f110787e = fragmentActivity;
            this.f110788f = animatorListenerAdapter;
            this.f110783a = C43303dy.m94971b(fragmentActivity);
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$g */
    public static final class C43754g implements OnPreDrawListener {

        /* renamed from: a */
        final /* synthetic */ C43746c f110791a;

        /* renamed from: b */
        final /* synthetic */ int f110792b;

        /* renamed from: c */
        final /* synthetic */ FragmentActivity f110793c;

        /* renamed from: d */
        final /* synthetic */ AnimatorListenerAdapter f110794d;

        /* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.multiedit.view.c$g$a */
        public static final class C43755a extends AnimatorListenerAdapter {

            /* renamed from: a */
            final /* synthetic */ C43754g f110795a;

            /* renamed from: b */
            final /* synthetic */ ArrayList f110796b;

            public final void onAnimationEnd(Animator animator) {
                C52711k.m112240b(animator, "animation");
                super.onAnimationEnd(animator);
                if (this.f110795a.f110793c != null && !this.f110795a.f110793c.isFinishing()) {
                    AnimatorListenerAdapter animatorListenerAdapter = this.f110795a.f110794d;
                    if (animatorListenerAdapter != null) {
                        animatorListenerAdapter.onAnimationEnd(animator);
                    }
                }
            }

            C43755a(C43754g gVar, ArrayList arrayList) {
                this.f110795a = gVar;
                this.f110796b = arrayList;
            }
        }

        public final boolean onPreDraw() {
            int i;
            View rootView = C43746c.m96140b(this.f110791a).getRootView();
            C52711k.m112236a((Object) rootView, "videoRecyclerView.rootView");
            rootView.getViewTreeObserver().removeOnPreDrawListener(this);
            if (this.f110791a.f110768q == null) {
                return false;
            }
            View d = C43746c.m96142d(this.f110791a);
            ArrayList arrayList = new ArrayList();
            C0794k<Integer, Integer> kVar = this.f110791a.f110768q;
            if (kVar == null) {
                C52711k.m112234a();
            }
            F f = kVar.f2711a;
            if (f == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) f, "visibleRage!!.first!!");
            int intValue = ((Number) f).intValue();
            int i2 = this.f110792b;
            while (true) {
                i = 2;
                if (intValue >= i2) {
                    break;
                }
                AnimatorSet animatorSet = new AnimatorSet();
                C1352v f2 = C43746c.m96140b(this.f110791a).mo4847f(intValue);
                if (f2 != null) {
                    C52711k.m112236a((Object) f2, "videoRecyclerView.findVi…              ?: continue");
                    View view = f2.itemView;
                    C52711k.m112236a((Object) view, "viewHolder.itemView");
                    animatorSet.play(ObjectAnimator.ofFloat(f2.itemView, "translationX", new float[]{view.getTranslationX(), 0.0f}));
                    animatorSet.setDuration(300);
                    arrayList.add(animatorSet);
                }
                intValue++;
            }
            int i3 = this.f110792b + 1;
            C0794k<Integer, Integer> kVar2 = this.f110791a.f110768q;
            if (kVar2 == null) {
                C52711k.m112234a();
            }
            S s = kVar2.f2712b;
            if (s == null) {
                C52711k.m112234a();
            }
            C52711k.m112236a((Object) s, "visibleRage!!.second!!");
            int intValue2 = ((Number) s).intValue();
            if (i3 <= intValue2) {
                while (true) {
                    AnimatorSet animatorSet2 = new AnimatorSet();
                    C1352v f3 = C43746c.m96140b(this.f110791a).mo4847f(i3);
                    if (f3 != null) {
                        C52711k.m112236a((Object) f3, "videoRecyclerView.findVi…              ?: continue");
                        float[] fArr = new float[i];
                        View view2 = f3.itemView;
                        C52711k.m112236a((Object) view2, "viewHolder.itemView");
                        fArr[0] = view2.getTranslationX();
                        fArr[1] = 0.0f;
                        animatorSet2.play(ObjectAnimator.ofFloat(f3.itemView, "translationX", fArr));
                        animatorSet2.setDuration(300);
                        arrayList.add(animatorSet2);
                    }
                    if (i3 == intValue2) {
                        break;
                    }
                    i3++;
                    i = 2;
                }
            }
            AnimatorSet animatorSet3 = new AnimatorSet();
            animatorSet3.setDuration(300);
            animatorSet3.play(ObjectAnimator.ofFloat(d, "translationX", new float[]{d.getTranslationX(), 0.0f})).with(ObjectAnimator.ofFloat(d, "translationY", new float[]{d.getTranslationY(), 0.0f})).with(ObjectAnimator.ofFloat(d, "scaleX", new float[]{d.getScaleX(), 1.0f})).with(ObjectAnimator.ofFloat(d, "scaleY", new float[]{d.getScaleY(), 1.0f}));
            arrayList.add(animatorSet3);
            C43746c cVar = this.f110791a;
            AnimatorSet animatorSet4 = new AnimatorSet();
            animatorSet4.playTogether(arrayList);
            animatorSet4.addListener(new C43755a(this, arrayList));
            cVar.f110769r = animatorSet4;
            AnimatorSet animatorSet5 = this.f110791a.f110769r;
            if (animatorSet5 != null) {
                animatorSet5.start();
            }
            C43746c.m96139a(this.f110791a).f108807b = this.f110792b;
            return false;
        }

        C43754g(C43746c cVar, int i, FragmentActivity fragmentActivity, AnimatorListenerAdapter animatorListenerAdapter) {
            this.f110791a = cVar;
            this.f110792b = i;
            this.f110793c = fragmentActivity;
            this.f110794d = animatorListenerAdapter;
        }
    }

    /* renamed from: a */
    public final void mo89219a(boolean z, int i) {
        ValueAnimator valueAnimator = this.f110764m;
        if (valueAnimator != null) {
            valueAnimator.cancel();
        }
        if (!z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{1.0f, 0.0f});
            ofFloat.setDuration(100);
            ofFloat.addUpdateListener(new C43748b(this));
            this.f110764m = ofFloat;
        } else {
            C43675a aVar = this.f110771t;
            if (aVar == null) {
                C52711k.m112237a("videoSegmentAdapter");
            }
            RecyclerView recyclerView = this.f110761j;
            if (recyclerView == null) {
                C52711k.m112237a("videoRecyclerView");
            }
            int a = aVar.mo87380a(recyclerView, i);
            View view = this.f110759h;
            if (view == null) {
                C52711k.m112237a("animTabDot");
            }
            view.setX((float) a);
            ValueAnimator ofFloat2 = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
            ofFloat2.setDuration(100);
            ofFloat2.addUpdateListener(new C43749c(this));
            this.f110764m = ofFloat2;
            C43675a aVar2 = this.f110771t;
            if (aVar2 == null) {
                C52711k.m112237a("videoSegmentAdapter");
            }
            aVar2.f108807b = i;
        }
        ValueAnimator valueAnimator2 = this.f110764m;
        if (valueAnimator2 != null) {
            valueAnimator2.start();
        }
    }

    /* renamed from: a */
    public final void mo89217a(List<? extends VideoSegment> list) {
        C43675a aVar = this.f110771t;
        if (aVar == null) {
            C52711k.m112237a("videoSegmentAdapter");
        }
        if (!C9190h.m18253a(list)) {
            aVar.mo87496a(list);
            aVar.notifyDataSetChanged();
        }
    }

    /* renamed from: f */
    public final void mo89227f() {
        mo89234m().mo87556c();
    }

    /* renamed from: k */
    public final View mo89232k() {
        View view = this.f110776y;
        if (view == null) {
            C52711k.m112237a("ivEditVideo");
        }
        return view;
    }

    /* renamed from: l */
    public final void mo89233l() {
        C43675a aVar = this.f110771t;
        if (aVar == null) {
            C52711k.m112237a("videoSegmentAdapter");
        }
        aVar.f110599i.mo89131a();
    }

    /* renamed from: h */
    public final void mo89229h() {
        C43675a aVar = this.f110771t;
        if (aVar == null) {
            C52711k.m112237a("videoSegmentAdapter");
        }
        aVar.f108809d = true;
        View view = this.f110760i;
        if (view == null) {
            C52711k.m112237a("flEditVideo");
        }
        view.setVisibility(8);
        mo89224c();
    }

    /* renamed from: i */
    public final void mo89230i() {
        View view = this.f110759h;
        if (view == null) {
            C52711k.m112237a("animTabDot");
        }
        view.setVisibility(0);
        mo89235n().setVisibility(0);
        mo89236o().setVisibility(0);
        View view2 = this.f110772u;
        if (view2 == null) {
            C52711k.m112237a("ivDelete");
        }
        view2.setVisibility(8);
        View view3 = this.f110773v;
        if (view3 == null) {
            C52711k.m112237a("tvVideoSegmentDes");
        }
        view3.setVisibility(0);
        mo89238q().setVisibility(8);
    }

    /* renamed from: g */
    public final void mo89228g() {
        RecyclerView recyclerView = this.f110761j;
        if (recyclerView == null) {
            C52711k.m112237a("videoRecyclerView");
        }
        recyclerView.setVisibility(8);
        View view = this.f110774w;
        if (view == null) {
            C52711k.m112237a("ivSave");
        }
        view.setVisibility(0);
        View view2 = this.f110775x;
        if (view2 == null) {
            C52711k.m112237a("ivCancel");
        }
        view2.setVisibility(0);
        View view3 = this.f110760i;
        if (view3 == null) {
            C52711k.m112237a("flEditVideo");
        }
        view3.setVisibility(0);
        C43675a aVar = this.f110771t;
        if (aVar == null) {
            C52711k.m112237a("videoSegmentAdapter");
        }
        aVar.f108809d = false;
        View view4 = this.f110777z;
        if (view4 == null) {
            C52711k.m112237a("singleEditLayout");
        }
        view4.setVisibility(0);
        mo89224c();
    }

    /* renamed from: j */
    public final void mo89231j() {
        View view = this.f110759h;
        if (view == null) {
            C52711k.m112237a("animTabDot");
        }
        view.setVisibility(4);
        mo89235n().setVisibility(4);
        mo89236o().setVisibility(4);
        C43675a aVar = this.f110771t;
        if (aVar == null) {
            C52711k.m112237a("videoSegmentAdapter");
        }
        if (aVar.mo87493a() == 1) {
            View view2 = this.f110772u;
            if (view2 == null) {
                C52711k.m112237a("ivDelete");
            }
            view2.setAlpha(0.5f);
        } else {
            View view3 = this.f110772u;
            if (view3 == null) {
                C52711k.m112237a("ivDelete");
            }
            view3.setAlpha(1.0f);
        }
        View view4 = this.f110772u;
        if (view4 == null) {
            C52711k.m112237a("ivDelete");
        }
        view4.setVisibility(0);
        mo89238q().setVisibility(0);
        View view5 = this.f110773v;
        if (view5 == null) {
            C52711k.m112237a("tvVideoSegmentDes");
        }
        view5.setVisibility(4);
    }

    /* renamed from: a */
    public static final /* synthetic */ C43675a m96139a(C43746c cVar) {
        C43675a aVar = cVar.f110771t;
        if (aVar == null) {
            C52711k.m112237a("videoSegmentAdapter");
        }
        return aVar;
    }

    /* renamed from: b */
    public static final /* synthetic */ RecyclerView m96140b(C43746c cVar) {
        RecyclerView recyclerView = cVar.f110761j;
        if (recyclerView == null) {
            C52711k.m112237a("videoRecyclerView");
        }
        return recyclerView;
    }

    /* renamed from: c */
    public static final /* synthetic */ View m96141c(C43746c cVar) {
        View view = cVar.f110759h;
        if (view == null) {
            C52711k.m112237a("animTabDot");
        }
        return view;
    }

    /* renamed from: d */
    public static final /* synthetic */ View m96142d(C43746c cVar) {
        View view = cVar.f110770s;
        if (view == null) {
            C52711k.m112237a("curItemView");
        }
        return view;
    }

    /* renamed from: e */
    public static final /* synthetic */ View m96143e(C43746c cVar) {
        View view = cVar.f110760i;
        if (view == null) {
            C52711k.m112237a("flEditVideo");
        }
        return view;
    }

    /* renamed from: a */
    public final void mo89213a(C0794k<Float, Float> kVar) {
        C52711k.m112240b(kVar, "pair");
        mo89234m().mo87546a(false, kVar);
    }

    /* renamed from: b */
    public final void mo89220b(C0794k<Float, Float> kVar) {
        C52711k.m112240b(kVar, "pair");
        mo89234m().mo87543a(kVar, true);
    }

    /* renamed from: a */
    public final void mo89214a(OnClickListener onClickListener) {
        super.mo89214a(onClickListener);
        View view = this.f110772u;
        if (view == null) {
            C52711k.m112237a("ivDelete");
        }
        view.setOnClickListener(onClickListener);
        View view2 = this.f110774w;
        if (view2 == null) {
            C52711k.m112237a("ivSave");
        }
        view2.setOnClickListener(onClickListener);
        View view3 = this.f110775x;
        if (view3 == null) {
            C52711k.m112237a("ivCancel");
        }
        view3.setOnClickListener(onClickListener);
    }

    /* renamed from: b */
    public final void mo89221b(VideoSegment videoSegment) {
        C43675a aVar = this.f110771t;
        if (aVar == null) {
            C52711k.m112237a("videoSegmentAdapter");
        }
        aVar.mo87499b(videoSegment);
    }

    /* renamed from: a */
    public final void mo89215a(VideoSegment videoSegment) {
        C43675a aVar = this.f110771t;
        if (aVar == null) {
            C52711k.m112237a("videoSegmentAdapter");
        }
        aVar.mo87495a(videoSegment);
    }

    /* renamed from: a */
    public final void mo89207a(int i, int i2) {
        if (i != i2) {
            RecyclerView recyclerView = this.f110761j;
            if (recyclerView == null) {
                C52711k.m112237a("videoRecyclerView");
            }
            recyclerView.mo4833d(i2);
            C43675a aVar = this.f110771t;
            if (aVar == null) {
                C52711k.m112237a("videoSegmentAdapter");
            }
            if (i == aVar.f108807b) {
                this.f110762k = i;
                this.f110763l = i2;
                ValueAnimator valueAnimator = this.f110764m;
                if (valueAnimator != null) {
                    valueAnimator.cancel();
                }
                ValueAnimator ofFloat = ValueAnimator.ofFloat(new float[]{0.0f, 1.0f});
                ofFloat.setDuration(500);
                ofFloat.addUpdateListener(new C43747a(this));
                this.f110764m = ofFloat;
                ValueAnimator valueAnimator2 = this.f110764m;
                if (valueAnimator2 != null) {
                    valueAnimator2.start();
                }
            } else {
                return;
            }
        }
        C43675a aVar2 = this.f110771t;
        if (aVar2 == null) {
            C52711k.m112237a("videoSegmentAdapter");
        }
        aVar2.f108807b = i2;
    }

    /* renamed from: a */
    public final void mo89210a(FragmentActivity fragmentActivity, View view) {
        if (fragmentActivity != null && view != null) {
            super.mo89210a(fragmentActivity, view);
            View findViewById = view.findViewById(R.id.axl);
            C52711k.m112236a((Object) findViewById, "rootView.findViewById(R.id.ivDelete)");
            this.f110772u = findViewById;
            View findViewById2 = view.findViewById(R.id.d6i);
            C52711k.m112236a((Object) findViewById2, "rootView.findViewById(R.id.tvVideoSegmentDes)");
            this.f110773v = findViewById2;
            View findViewById3 = view.findViewById(R.id.ff);
            C52711k.m112236a((Object) findViewById3, "rootView.findViewById(R.id.animTabDot)");
            this.f110759h = findViewById3;
            View findViewById4 = view.findViewById(R.id.dou);
            C52711k.m112236a((Object) findViewById4, "rootView.findViewById(R.id.videoRecyclerView)");
            this.f110761j = (RecyclerView) findViewById4;
            View findViewById5 = view.findViewById(R.id.agl);
            C52711k.m112236a((Object) findViewById5, "rootView.findViewById(R.id.flEditVideo)");
            this.f110760i = findViewById5;
            View findViewById6 = view.findViewById(R.id.f133596com);
            C52711k.m112236a((Object) findViewById6, "rootView.findViewById(R.id.singleEditLayout)");
            this.f110777z = findViewById6;
            View findViewById7 = view.findViewById(R.id.axm);
            C52711k.m112236a((Object) findViewById7, "rootView.findViewById(R.id.ivEditVideo)");
            this.f110776y = findViewById7;
            View findViewById8 = view.findViewById(R.id.axp);
            C52711k.m112236a((Object) findViewById8, "rootView.findViewById(R.id.ivSave)");
            this.f110774w = findViewById8;
            View findViewById9 = view.findViewById(R.id.axk);
            C52711k.m112236a((Object) findViewById9, "rootView.findViewById(R.id.ivCancel)");
            this.f110775x = findViewById9;
            View findViewById10 = view.findViewById(R.id.dou);
            C52711k.m112236a((Object) findViewById10, "rootView.findViewById(R.id.videoRecyclerView)");
            this.f110761j = (RecyclerView) findViewById10;
        }
    }

    /* renamed from: a */
    public final void mo89208a(FragmentActivity fragmentActivity, int i, AnimatorListenerAdapter animatorListenerAdapter) {
        boolean z;
        this.f110765n = 1.0f;
        this.f110766o = 0.0f;
        this.f110767p = 0.0f;
        RecyclerView recyclerView = this.f110761j;
        if (recyclerView == null) {
            C52711k.m112237a("videoRecyclerView");
        }
        recyclerView.mo4814b(i);
        RecyclerView recyclerView2 = this.f110761j;
        if (recyclerView2 == null) {
            C52711k.m112237a("videoRecyclerView");
        }
        if (C1056u.m3055f(recyclerView2) == 1) {
            z = true;
        } else {
            z = false;
        }
        View view = this.f110777z;
        if (view == null) {
            C52711k.m112237a("singleEditLayout");
        }
        view.setVisibility(0);
        View view2 = this.f110774w;
        if (view2 == null) {
            C52711k.m112237a("ivSave");
        }
        view2.setVisibility(8);
        View view3 = this.f110775x;
        if (view3 == null) {
            C52711k.m112237a("ivCancel");
        }
        view3.setVisibility(8);
        View view4 = this.f110760i;
        if (view4 == null) {
            C52711k.m112237a("flEditVideo");
        }
        view4.setVisibility(4);
        View view5 = this.f110760i;
        if (view5 == null) {
            C52711k.m112237a("flEditVideo");
        }
        View rootView = view5.getRootView();
        C52711k.m112236a((Object) rootView, "flEditVideo.rootView");
        ViewTreeObserver viewTreeObserver = rootView.getViewTreeObserver();
        C43752f fVar = new C43752f(this, i, z, fragmentActivity, animatorListenerAdapter);
        viewTreeObserver.addOnPreDrawListener(fVar);
    }

    /* renamed from: a */
    public final void mo89212a(FragmentActivity fragmentActivity, VideoEditViewModel videoEditViewModel, CutMultiVideoViewModel cutMultiVideoViewModel, List<? extends VideoSegment> list) {
        if (videoEditViewModel == null) {
            C52711k.m112234a();
        }
        if (cutMultiVideoViewModel == null) {
            C52711k.m112234a();
        }
        if (list == null) {
            C52711k.m112234a();
        }
        this.f110771t = new C43675a(videoEditViewModel, cutMultiVideoViewModel, list);
        C43675a aVar = this.f110771t;
        if (aVar == null) {
            C52711k.m112237a("videoSegmentAdapter");
        }
        C1385a aVar2 = new C1385a(new C42654l(aVar));
        RecyclerView recyclerView = this.f110761j;
        if (recyclerView == null) {
            C52711k.m112237a("videoRecyclerView");
        }
        aVar2.mo5444a(recyclerView);
        RecyclerView recyclerView2 = this.f110761j;
        if (recyclerView2 == null) {
            C52711k.m112237a("videoRecyclerView");
        }
        recyclerView2.setLayoutManager(new MultiEditRecyleViewLayoutManager(fragmentActivity));
        RecyclerView recyclerView3 = this.f110761j;
        if (recyclerView3 == null) {
            C52711k.m112237a("videoRecyclerView");
        }
        C43675a aVar3 = this.f110771t;
        if (aVar3 == null) {
            C52711k.m112237a("videoSegmentAdapter");
        }
        recyclerView3.setAdapter(aVar3);
        C43675a aVar4 = this.f110771t;
        if (aVar4 == null) {
            C52711k.m112237a("videoSegmentAdapter");
        }
        aVar4.f108808c = new C43750d(this);
        RecyclerView recyclerView4 = this.f110761j;
        if (recyclerView4 == null) {
            C52711k.m112237a("videoRecyclerView");
        }
        C1506w wVar = new C1506w();
        wVar.f4729j = 300;
        wVar.f4731l = 300;
        wVar.f4730k = 300;
        wVar.f4728i = 300;
        recyclerView4.setItemAnimator(wVar);
        RecyclerView recyclerView5 = this.f110761j;
        if (recyclerView5 == null) {
            C52711k.m112237a("videoRecyclerView");
        }
        recyclerView5.getViewTreeObserver().addOnPreDrawListener(new C43751e(this));
        RecyclerView recyclerView6 = this.f110761j;
        if (recyclerView6 == null) {
            C52711k.m112237a("videoRecyclerView");
        }
        C43675a aVar5 = this.f110771t;
        if (aVar5 == null) {
            C52711k.m112237a("videoSegmentAdapter");
        }
        recyclerView6.setAdapter(aVar5);
        C43675a aVar6 = this.f110771t;
        if (aVar6 == null) {
            C52711k.m112237a("videoSegmentAdapter");
        }
        aVar6.notifyDataSetChanged();
    }

    /* renamed from: a */
    public final void mo89209a(FragmentActivity fragmentActivity, int i, boolean z, boolean z2, AnimatorListenerAdapter animatorListenerAdapter) {
        View view = this.f110774w;
        if (view == null) {
            C52711k.m112237a("ivSave");
        }
        view.setVisibility(8);
        View view2 = this.f110775x;
        if (view2 == null) {
            C52711k.m112237a("ivCancel");
        }
        view2.setVisibility(8);
        View view3 = this.f110777z;
        if (view3 == null) {
            C52711k.m112237a("singleEditLayout");
        }
        view3.setVisibility(8);
        RecyclerView recyclerView = this.f110761j;
        if (recyclerView == null) {
            C52711k.m112237a("videoRecyclerView");
        }
        recyclerView.setVisibility(0);
        View view4 = this.f110760i;
        if (view4 == null) {
            C52711k.m112237a("flEditVideo");
        }
        view4.setVisibility(4);
        if (this.f110768q == null) {
            animatorListenerAdapter.onAnimationEnd(null);
            return;
        }
        RecyclerView recyclerView2 = this.f110761j;
        if (recyclerView2 == null) {
            C52711k.m112237a("videoRecyclerView");
        }
        View rootView = recyclerView2.getRootView();
        C52711k.m112236a((Object) rootView, "videoRecyclerView.rootView");
        rootView.getViewTreeObserver().addOnPreDrawListener(new C43754g(this, i, fragmentActivity, animatorListenerAdapter));
    }
}
