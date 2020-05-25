package android.support.design.transformation;

import android.content.Context;
import android.os.Build.VERSION;
import android.support.design.p022a.C0396h;
import android.support.design.p022a.C0398j;
import android.support.design.widget.CoordinatorLayout;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewParent;
import com.ss.android.ugc.trill.R;
import java.util.HashMap;
import java.util.Map;

public class FabTransformationSheetBehavior extends FabTransformationBehavior {

    /* renamed from: c */
    private Map<View, Integer> f1558c;

    public FabTransformationSheetBehavior() {
    }

    public FabTransformationSheetBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C0465a mo1163a(Context context, boolean z) {
        int i;
        if (z) {
            i = R.animator.j;
        } else {
            i = R.animator.i;
        }
        C0465a aVar = new C0465a();
        aVar.f1551a = C0396h.m967a(context, i);
        aVar.f1552b = new C0398j(17, 0.0f, 0.0f);
        return aVar;
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final boolean mo1158a(View view, View view2, boolean z, boolean z2) {
        boolean z3;
        ViewParent parent = view2.getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (VERSION.SDK_INT >= 16 && z) {
                this.f1558c = new HashMap(childCount);
            }
            for (int i = 0; i < childCount; i++) {
                View childAt = coordinatorLayout.getChildAt(i);
                if (!(childAt.getLayoutParams() instanceof C0505d) || !(((C0505d) childAt.getLayoutParams()).f1693a instanceof FabTransformationScrimBehavior)) {
                    z3 = false;
                } else {
                    z3 = true;
                }
                if (childAt != view2 && !z3) {
                    if (z) {
                        if (VERSION.SDK_INT >= 16) {
                            this.f1558c.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        }
                        C1056u.m3043b(childAt, 4);
                    } else if (this.f1558c != null && this.f1558c.containsKey(childAt)) {
                        C1056u.m3043b(childAt, ((Integer) this.f1558c.get(childAt)).intValue());
                    }
                }
            }
            if (!z) {
                this.f1558c = null;
            }
        }
        return super.mo1158a(view, view2, z, z2);
    }
}
