package android.support.p030v4.app;

import android.view.View;
import android.view.View.OnAttachStateChangeListener;
import android.view.ViewTreeObserver;
import android.view.ViewTreeObserver.OnPreDrawListener;

/* renamed from: android.support.v4.app.ae */
final class C0627ae implements OnAttachStateChangeListener, OnPreDrawListener {

    /* renamed from: a */
    private final View f2278a;

    /* renamed from: b */
    private ViewTreeObserver f2279b;

    /* renamed from: c */
    private final Runnable f2280c;

    public final boolean onPreDraw() {
        m1707a();
        this.f2280c.run();
        return true;
    }

    /* renamed from: a */
    private void m1707a() {
        if (this.f2279b.isAlive()) {
            this.f2279b.removeOnPreDrawListener(this);
        } else {
            this.f2278a.getViewTreeObserver().removeOnPreDrawListener(this);
        }
        this.f2278a.removeOnAttachStateChangeListener(this);
    }

    public final void onViewDetachedFromWindow(View view) {
        m1707a();
    }

    public final void onViewAttachedToWindow(View view) {
        this.f2279b = view.getViewTreeObserver();
    }

    private C0627ae(View view, Runnable runnable) {
        this.f2278a = view;
        this.f2279b = view.getViewTreeObserver();
        this.f2280c = runnable;
    }

    /* renamed from: a */
    public static C0627ae m1706a(View view, Runnable runnable) {
        C0627ae aeVar = new C0627ae(view, runnable);
        view.getViewTreeObserver().addOnPreDrawListener(aeVar);
        view.addOnAttachStateChangeListener(aeVar);
        return aeVar;
    }
}
