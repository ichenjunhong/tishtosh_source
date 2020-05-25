package com.p683ss.android.ugc.aweme.comment.p1528ui;

import android.app.Activity;
import android.arch.lifecycle.C0176h.C0177a;
import android.arch.lifecycle.C0200t;
import android.graphics.drawable.ColorDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.PopupWindow;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.ui.bb */
public final class C25360bb extends PopupWindow {

    /* renamed from: e */
    public static final C25361a f67044e = new C25361a(null);

    /* renamed from: a */
    final Runnable f67045a = new C25362b(this);

    /* renamed from: b */
    final Activity f67046b;

    /* renamed from: c */
    final int f67047c;

    /* renamed from: d */
    final int f67048d;

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.bb$a */
    public static final class C25361a {
        private C25361a() {
        }

        public /* synthetic */ C25361a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.comment.ui.bb$b */
    static final class C25362b implements Runnable {

        /* renamed from: a */
        final /* synthetic */ C25360bb f67049a;

        C25362b(C25360bb bbVar) {
            this.f67049a = bbVar;
        }

        public final void run() {
            this.f67049a.dismiss();
        }
    }

    @C0200t(mo345a = C0177a.ON_DESTROY)
    public final void onHostDestroy() {
        dismiss();
        getContentView().removeCallbacks(this.f67045a);
    }

    public final void dismiss() {
        if (isShowing() && this.f67046b != null && !this.f67046b.isFinishing()) {
            try {
                super.dismiss();
            } catch (Exception unused) {
            }
        }
    }

    public C25360bb(Activity activity) {
        C52711k.m112240b(activity, "context");
        super(activity);
        this.f67046b = activity;
        setContentView(LayoutInflater.from(this.f67046b).inflate(R.layout.b21, null));
        setWidth(-2);
        setHeight(-2);
        setBackgroundDrawable(new ColorDrawable(0));
        setOutsideTouchable(true);
        setAnimationStyle(R.style.a4_);
        getContentView().measure(0, 0);
        View contentView = getContentView();
        C52711k.m112236a((Object) contentView, "contentView");
        this.f67047c = contentView.getMeasuredWidth();
        View contentView2 = getContentView();
        C52711k.m112236a((Object) contentView2, "contentView");
        this.f67048d = contentView2.getMeasuredHeight();
        update();
    }
}
