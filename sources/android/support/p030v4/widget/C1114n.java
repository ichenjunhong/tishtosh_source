package android.support.p030v4.widget;

import android.content.Context;
import android.view.animation.Interpolator;
import android.widget.OverScroller;

/* renamed from: android.support.v4.widget.n */
public final class C1114n {

    /* renamed from: a */
    public OverScroller f3550a;

    /* renamed from: a */
    public final void mo3563a() {
        this.f3550a.abortAnimation();
    }

    public C1114n(Context context, Interpolator interpolator) {
        OverScroller overScroller;
        if (interpolator != null) {
            overScroller = new OverScroller(context, interpolator);
        } else {
            overScroller = new OverScroller(context);
        }
        this.f3550a = overScroller;
    }
}
