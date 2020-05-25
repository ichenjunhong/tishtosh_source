package android.support.design.transformation;

import android.content.Context;
import android.support.design.p025c.C0421b;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.Behavior;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewTreeObserver.OnPreDrawListener;
import java.util.List;

public abstract class ExpandableBehavior extends Behavior<View> {

    /* renamed from: a */
    public int f1529a;

    public ExpandableBehavior() {
    }

    /* renamed from: a */
    public abstract boolean mo1157a(CoordinatorLayout coordinatorLayout, View view, View view2);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract boolean mo1158a(View view, View view2, boolean z, boolean z2);

    /* renamed from: a */
    private boolean m1117a(boolean z) {
        if (z) {
            if (this.f1529a == 0 || this.f1529a == 2) {
                return true;
            }
            return false;
        } else if (this.f1529a == 1) {
            return true;
        } else {
            return false;
        }
    }

    public ExpandableBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* renamed from: b */
    public final boolean mo1159b(CoordinatorLayout coordinatorLayout, View view, View view2) {
        int i;
        C0421b bVar = (C0421b) view2;
        if (!m1117a(bVar.mo1020a())) {
            return false;
        }
        if (bVar.mo1020a()) {
            i = 1;
        } else {
            i = 2;
        }
        this.f1529a = i;
        return mo1158a((View) bVar, view, bVar.mo1020a(), true);
    }

    /* renamed from: a */
    public final boolean mo934a(CoordinatorLayout coordinatorLayout, final View view, int i) {
        final C0421b bVar;
        int i2;
        if (!C1056u.m3079y(view)) {
            List b = coordinatorLayout.mo1331b(view);
            int size = b.size();
            int i3 = 0;
            while (true) {
                if (i3 >= size) {
                    bVar = null;
                    break;
                }
                View view2 = (View) b.get(i3);
                if (mo1157a(coordinatorLayout, view, view2)) {
                    bVar = (C0421b) view2;
                    break;
                }
                i3++;
            }
            if (bVar != null && m1117a(bVar.mo1020a())) {
                if (bVar.mo1020a()) {
                    i2 = 1;
                } else {
                    i2 = 2;
                }
                this.f1529a = i2;
                final int i4 = this.f1529a;
                view.getViewTreeObserver().addOnPreDrawListener(new OnPreDrawListener() {
                    public final boolean onPreDraw() {
                        view.getViewTreeObserver().removeOnPreDrawListener(this);
                        if (ExpandableBehavior.this.f1529a == i4) {
                            ExpandableBehavior.this.mo1158a((View) bVar, view, bVar.mo1020a(), false);
                        }
                        return false;
                    }
                });
            }
        }
        return false;
    }
}
