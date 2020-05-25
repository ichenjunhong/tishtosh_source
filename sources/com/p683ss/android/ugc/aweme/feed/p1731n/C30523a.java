package com.p683ss.android.ugc.aweme.feed.p1731n;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.util.SparseArray;
import android.view.View;
import android.view.View.OnClickListener;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30325ap;
import com.p683ss.android.ugc.aweme.p1807im.DefaultIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.IIMService;
import com.p683ss.android.ugc.aweme.p1807im.service.model.C35471h;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.p2642a.C52695a;

/* renamed from: com.ss.android.ugc.aweme.feed.n.a */
public final class C30523a {

    /* renamed from: a */
    public static final C30523a f79773a = new C30523a();

    /* renamed from: com.ss.android.ugc.aweme.feed.n.a$a */
    public static final class C30524a implements C52695a, Iterable<View> {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f79774a;

        public final /* synthetic */ Iterator iterator() {
            return new Object(this) {

                /* renamed from: a */
                public int f79775a;

                /* renamed from: b */
                final /* synthetic */ C30524a f79776b;

                public final void remove() {
                    throw new UnsupportedOperationException("Operation is not supported for read-only collection");
                }

                public final boolean hasNext() {
                    if (this.f79775a < this.f79776b.f79774a.getChildCount()) {
                        return true;
                    }
                    return false;
                }

                public final /* synthetic */ Object next() {
                    ViewGroup viewGroup = this.f79776b.f79774a;
                    int i = this.f79775a;
                    this.f79775a = i + 1;
                    return viewGroup.getChildAt(i);
                }

                {
                    this.f79776b = r1;
                }
            };
        }

        public C30524a(ViewGroup viewGroup) {
            this.f79774a = viewGroup;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.n.a$b */
    public static final class C30526b implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f79777a;

        /* renamed from: b */
        final /* synthetic */ C30533b f79778b;

        public C30526b(View view, C30533b bVar) {
            this.f79777a = view;
            this.f79778b = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LayoutParams layoutParams = this.f79777a.getLayoutParams();
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.height = (int) ((Float) animatedValue).floatValue();
                this.f79777a.requestLayout();
                if (this.f79778b != null) {
                    int i = this.f79777a.getLayoutParams().height;
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.n.a$c */
    public static final class C30527c extends AnimatorListenerAdapter {

        /* renamed from: a */
        final /* synthetic */ ViewGroup f79779a;

        /* renamed from: b */
        final /* synthetic */ SparseArray f79780b;

        /* renamed from: c */
        final /* synthetic */ C30533b f79781c;

        public final void onAnimationEnd(Animator animator) {
            C52711k.m112240b(animator, "animation");
            super.onAnimationEnd(animator);
            C30523a.m71488a(this.f79779a, this.f79780b, this.f79781c);
        }

        public C30527c(ViewGroup viewGroup, SparseArray sparseArray, C30533b bVar) {
            this.f79779a = viewGroup;
            this.f79780b = sparseArray;
            this.f79781c = bVar;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.n.a$d */
    public static final class C30528d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ View f79782a;

        /* renamed from: b */
        final /* synthetic */ C30533b f79783b;

        public C30528d(View view, C30533b bVar) {
            this.f79782a = view;
            this.f79783b = bVar;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            LayoutParams layoutParams = this.f79782a.getLayoutParams();
            C52711k.m112236a((Object) valueAnimator, "animation");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                layoutParams.height = (int) ((Float) animatedValue).floatValue();
                this.f79782a.requestLayout();
                if (this.f79783b != null) {
                    int i = this.f79782a.getLayoutParams().height;
                    return;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Float");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.feed.n.a$e */
    public static final class C30529e implements OnClickListener {

        /* renamed from: a */
        final /* synthetic */ View f79784a;

        /* renamed from: b */
        final /* synthetic */ C35471h f79785b;

        /* renamed from: c */
        final /* synthetic */ ViewGroup f79786c;

        /* renamed from: d */
        final /* synthetic */ SparseArray f79787d;

        /* renamed from: e */
        final /* synthetic */ C30533b f79788e;

        public C30529e(View view, C35471h hVar, ViewGroup viewGroup, SparseArray sparseArray, C30533b bVar) {
            this.f79784a = view;
            this.f79785b = hVar;
            this.f79786c = viewGroup;
            this.f79787d = sparseArray;
            this.f79788e = bVar;
        }

        public final void onClick(View view) {
            ClickInstrumentation.onClick(view);
            IIMService provideIMService_Monster = DefaultIMService.provideIMService_Monster();
            if (provideIMService_Monster != null) {
                provideIMService_Monster.startChat(this.f79784a.getContext(), this.f79785b.contact);
            }
            C30523a.m71488a(this.f79786c, this.f79787d, this.f79788e);
        }
    }

    private C30523a() {
    }

    /* renamed from: a */
    public static void m71488a(ViewGroup viewGroup, SparseArray<Integer> sparseArray, C30533b bVar) {
        boolean z;
        C52711k.m112240b(viewGroup, "viewGroup");
        C52711k.m112240b(sparseArray, "viewStaus");
        Iterable aVar = new C30524a(viewGroup);
        Collection arrayList = new ArrayList();
        for (Object next : aVar) {
            View view = (View) next;
            if (bVar != null) {
                Object obj = sparseArray.get(view.getId());
                C52711k.m112236a(obj, "viewStaus.get(it.id)");
                z = bVar.mo62731a(view, ((Number) obj).intValue());
            } else {
                z = false;
            }
            if (!z) {
                arrayList.add(next);
            }
        }
        for (View view2 : (List) arrayList) {
            Object obj2 = sparseArray.get(view2.getId());
            C52711k.m112236a(obj2, "viewStaus.get(it.id)");
            view2.setVisibility(((Number) obj2).intValue());
        }
        C47718bf.m103288a(new C30325ap());
    }
}
