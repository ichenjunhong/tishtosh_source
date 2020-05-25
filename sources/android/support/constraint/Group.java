package android.support.constraint;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.constraint.ConstraintLayout.LayoutParams;
import android.util.AttributeSet;
import android.view.View;

public class Group extends ConstraintHelper {
    public Group(Context context) {
        super(context);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final void mo639a(AttributeSet attributeSet) {
        super.mo639a(attributeSet);
        this.f796e = false;
    }

    /* renamed from: b */
    public final void mo640b(ConstraintLayout constraintLayout) {
        LayoutParams layoutParams = (LayoutParams) getLayoutParams();
        layoutParams.f856al.mo717b(0);
        layoutParams.f856al.mo720c(0);
    }

    /* renamed from: a */
    public final void mo638a(ConstraintLayout constraintLayout) {
        float f;
        int visibility = getVisibility();
        if (VERSION.SDK_INT >= 21) {
            f = getElevation();
        } else {
            f = 0.0f;
        }
        for (int i = 0; i < this.f793b; i++) {
            View view = (View) constraintLayout.f798a.get(this.f792a[i]);
            if (view != null) {
                view.setVisibility(visibility);
                if (f > 0.0f && VERSION.SDK_INT >= 21) {
                    view.setElevation(f);
                }
            }
        }
    }

    public Group(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public Group(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
