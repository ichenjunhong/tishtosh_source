package android.support.design.behavior;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.TimeInterpolator;
import android.content.Context;
import android.support.design.p022a.C0389a;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewPropertyAnimator;

public class HideBottomViewOnScrollBehavior<V extends View> extends Behavior<V> {

    /* renamed from: a */
    public ViewPropertyAnimator f1309a;

    /* renamed from: b */
    private int f1310b;

    /* renamed from: c */
    private int f1311c = 2;

    /* renamed from: a */
    public final boolean mo935a(CoordinatorLayout coordinatorLayout, V v, View view, View view2, int i) {
        return i == 2;
    }

    public HideBottomViewOnScrollBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public void mo936b(V v) {
        if (this.f1309a != null) {
            this.f1309a.cancel();
            v.clearAnimation();
        }
        this.f1311c = 1;
        m1008a(v, this.f1310b, 175, C0389a.f1269c);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo933a(V v) {
        if (this.f1309a != null) {
            this.f1309a.cancel();
            v.clearAnimation();
        }
        this.f1311c = 2;
        m1008a(v, 0, 225, C0389a.f1270d);
    }

    public HideBottomViewOnScrollBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: a */
    public boolean mo934a(CoordinatorLayout coordinatorLayout, V v, int i) {
        this.f1310b = v.getMeasuredHeight();
        return super.mo934a(coordinatorLayout, v, i);
    }

    /* renamed from: a */
    private void m1008a(V v, int i, long j, TimeInterpolator timeInterpolator) {
        this.f1309a = v.animate().translationY((float) i).setInterpolator(timeInterpolator).setDuration(j).setListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                HideBottomViewOnScrollBehavior.this.f1309a = null;
            }
        });
    }

    /* renamed from: a */
    public final void mo932a(CoordinatorLayout coordinatorLayout, V v, View view, int i, int i2, int i3, int i4) {
        if (this.f1311c == 1 || i2 <= 0) {
            if (this.f1311c != 2 && i2 < 0) {
                mo933a(v);
            }
            return;
        }
        mo936b(v);
    }
}
