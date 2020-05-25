package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.animation.ObjectAnimator;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.LinearInterpolator;
import android.widget.FrameLayout;
import android.widget.ImageView;
import com.ss.android.ugc.trill.R;
import p2628d.C52668f;
import p2628d.C52732g;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2639f.p2641b.C52712l;
import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52721u;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52767h;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView */
public final class CommentAtSearchLoadingView extends FrameLayout {

    /* renamed from: a */
    static final /* synthetic */ C52767h[] f66895a = {C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAtSearchLoadingView.class), "view", "getView()Landroid/view/View;")), C52728w.m112249a((C52720t) new C52721u(C52728w.m112245a(CommentAtSearchLoadingView.class), "loadingAnimator", "getLoadingAnimator()Landroid/animation/ObjectAnimator;"))};

    /* renamed from: b */
    public static final C25292a f66896b = new C25292a(null);

    /* renamed from: c */
    private final C52668f f66897c;

    /* renamed from: d */
    private final C52668f f66898d;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView$a */
    public static final class C25292a {
        private C25292a() {
        }

        public /* synthetic */ C25292a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView$b */
    static final class C25293b extends C52712l implements C52670a<ObjectAnimator> {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLoadingView f66899a;

        C25293b(CommentAtSearchLoadingView commentAtSearchLoadingView) {
            this.f66899a = commentAtSearchLoadingView;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            View view = this.f66899a.getView();
            C52711k.m112236a((Object) view, "view");
            return ObjectAnimator.ofFloat((ImageView) view.findViewById(R.id.b20), "rotation", new float[]{360.0f});
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.CommentAtSearchLoadingView$c */
    static final class C25294c extends C52712l implements C52670a<View> {

        /* renamed from: a */
        final /* synthetic */ CommentAtSearchLoadingView f66900a;

        /* renamed from: b */
        final /* synthetic */ Context f66901b;

        C25294c(CommentAtSearchLoadingView commentAtSearchLoadingView, Context context) {
            this.f66900a = commentAtSearchLoadingView;
            this.f66901b = context;
            super(0);
        }

        public final /* synthetic */ Object invoke() {
            return View.inflate(this.f66901b, R.layout.b22, this.f66900a);
        }
    }

    public CommentAtSearchLoadingView(Context context) {
        this(context, null, 0, 6, null);
    }

    public CommentAtSearchLoadingView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
    }

    private final ObjectAnimator getLoadingAnimator() {
        return (ObjectAnimator) this.f66898d.getValue();
    }

    public final View getView() {
        return (View) this.f66897c.getValue();
    }

    /* access modifiers changed from: protected */
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getLoadingAnimator().cancel();
    }

    /* renamed from: a */
    private final void m61514a() {
        getLoadingAnimator().setDuration(1000);
        getLoadingAnimator().setRepeatCount(-1);
        getLoadingAnimator().setInterpolator(new LinearInterpolator());
        getLoadingAnimator().start();
    }

    /* renamed from: a */
    public final void mo51808a(boolean z) {
        if (z != getLoadingAnimator().isRunning()) {
            if (z) {
                m61514a();
                return;
            }
            getLoadingAnimator().cancel();
        }
    }

    public CommentAtSearchLoadingView(Context context, AttributeSet attributeSet, int i) {
        C52711k.m112240b(context, "context");
        super(context, attributeSet, i);
        this.f66897c = C52732g.m112285a(new C25294c(this, context));
        this.f66898d = C52732g.m112285a(new C25293b(this));
    }

    public /* synthetic */ CommentAtSearchLoadingView(Context context, AttributeSet attributeSet, int i, int i2, C52707g gVar) {
        if ((i2 & 2) != 0) {
            attributeSet = null;
        }
        if ((i2 & 4) != 0) {
            i = 0;
        }
        this(context, attributeSet, i);
    }
}
