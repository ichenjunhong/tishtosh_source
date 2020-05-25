package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.animation.Animator;
import android.animation.Animator.AnimatorListener;
import android.animation.ValueAnimator;
import android.animation.ValueAnimator.AnimatorUpdateListener;
import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import android.widget.FrameLayout;
import com.p683ss.android.ugc.aweme.p1334ai.C22546a;
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

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout */
public final class CommentAtSearchLayout extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f66884a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAtSearchLayout.class), "marginLayoutParams", "getMarginLayoutParams()Landroid/view/ViewGroup$MarginLayoutParams;"))};

    /* renamed from: e */
    public static final C25288a f66885e = new C25288a(null);

    /* renamed from: b */
    public boolean f66886b;

    /* renamed from: c */
    public boolean f66887c;

    /* renamed from: d */
    public boolean f66888d;

    /* renamed from: f */
    private ValueAnimator f66889f;

    /* renamed from: g */
    private final C52668f f66890g;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout$a */
    public static final class C25288a {
        private C25288a() {
        }

        public /* synthetic */ C25288a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout$b */
    static final class C25289b extends C52712l implements C52670a<MarginLayoutParams> {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLayout f66891a;

        C25289b(CommentAtSearchLayout commentAtSearchLayout) {
            this.f66891a = commentAtSearchLayout;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            LayoutParams layoutParams = this.f66891a.getLayoutParams();
            if (layoutParams != null) {
                return (MarginLayoutParams) layoutParams;
            }
            throw new C52857u("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout$c */
    public static final class C25290c implements AnimatorListener {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLayout f66892a;

        /* renamed from: b */
        final /* synthetic */ boolean f66893b;

        public final void onAnimationRepeat(Animator animator) {
        }

        public final void onAnimationCancel(Animator animator) {
            if (!this.f66893b) {
                this.f66892a.setVisibility(8);
            }
            this.f66892a.setClosing(false);
            this.f66892a.setAnimating(false);
        }

        public final void onAnimationEnd(Animator animator) {
            if (!this.f66893b) {
                this.f66892a.setVisibility(8);
            }
            this.f66892a.setClosing(false);
            this.f66892a.setAnimating(false);
        }

        public final void onAnimationStart(Animator animator) {
            if (this.f66893b) {
                this.f66892a.setVisibility(0);
            } else {
                this.f66892a.setClosing(true);
            }
            this.f66892a.setAnimating(true);
        }

        C25290c(CommentAtSearchLayout commentAtSearchLayout, boolean z) {
            this.f66892a = commentAtSearchLayout;
            this.f66893b = z;
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLayout$d */
    static final class C25291d implements AnimatorUpdateListener {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLayout f66894a;

        C25291d(CommentAtSearchLayout commentAtSearchLayout) {
            this.f66894a = commentAtSearchLayout;
        }

        public final void onAnimationUpdate(ValueAnimator valueAnimator) {
            MarginLayoutParams marginLayoutParams = this.f66894a.getMarginLayoutParams();
            C52711k.m112236a((Object) valueAnimator, "it");
            Object animatedValue = valueAnimator.getAnimatedValue();
            if (animatedValue != null) {
                marginLayoutParams.bottomMargin = ((Integer) animatedValue).intValue();
                this.f66894a.requestLayout();
                return;
            }
            throw new C52857u("null cannot be cast to non-null type kotlin.Int");
        }
    }

    public CommentAtSearchLayout(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentAtSearchLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    public final MarginLayoutParams getMarginLayoutParams() {
        return (MarginLayoutParams) this.f66890g.getValue();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f66889f.cancel();
    }

    /* renamed from: a */
    public final void mo51796a() {
        if (!this.f66886b) {
            this.f66886b = true;
            m61512a(getMarginLayoutParams().bottomMargin, 0);
        }
    }

    public final void dismiss() {
        if (this.f66886b) {
            this.f66886b = false;
            m61512a(getMarginLayoutParams().bottomMargin, -getHeight());
        }
    }

    public final void setAnimating(boolean z) {
        this.f66887c = z;
    }

    public final void setClosing(boolean z) {
        this.f66888d = z;
    }

    public final void setInitValue(int i) {
        getMarginLayoutParams().bottomMargin = -i;
        requestLayout();
    }

    /* renamed from: a */
    private final void m61512a(int i, int i2) {
        boolean z;
        if (i2 == 0) {
            z = true;
        } else {
            z = false;
        }
        this.f66889f.cancel();
        this.f66889f = new ValueAnimator();
        this.f66889f.setIntValues(new int[]{i, i2});
        this.f66889f.setInterpolator(new C22546a());
        this.f66889f.setDuration(350);
        this.f66889f.addListener(new C25290c(this, z));
        this.f66889f.addUpdateListener(new C25291d(this));
        this.f66889f.start();
    }

    public CommentAtSearchLayout(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f66889f = new ValueAnimator();
        this.f66890g = C52732g.m112285a(new C25289b(this));
    }

    public /* synthetic */ CommentAtSearchLayout(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
