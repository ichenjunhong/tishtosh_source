package android.support.design.transformation;

import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.AnimatorSet;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;

public abstract class ExpandableTransformationBehavior extends ExpandableBehavior {

    /* renamed from: b */
    public AnimatorSet f1534b;

    public ExpandableTransformationBehavior() {
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract AnimatorSet mo1161b(View view, View view2, boolean z, boolean z2);

    public ExpandableTransformationBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public boolean mo1158a(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        if (this.f1534b != null) {
            z3 = true;
        } else {
            z3 = false;
        }
        if (z3) {
            this.f1534b.cancel();
        }
        this.f1534b = mo1161b(view, view2, z, z3);
        this.f1534b.addListener(new AnimatorListenerAdapter() {
            public final void onAnimationEnd(Animator animator) {
                ExpandableTransformationBehavior.this.f1534b = null;
            }
        });
        this.f1534b.start();
        if (!z2) {
            this.f1534b.end();
        }
        return true;
    }
}
