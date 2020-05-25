package android.support.design.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.design.widget.CoordinatorLayout.C0505d;
import android.support.p030v4.p033b.C0703a;
import android.support.p030v4.view.C1018ac;
import android.support.p030v4.view.C1039e;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import java.util.List;

abstract class HeaderScrollingViewBehavior extends ViewOffsetBehavior<View> {

    /* renamed from: a */
    final Rect f1743a = new Rect();

    /* renamed from: b */
    final Rect f1744b = new Rect();

    /* renamed from: c */
    public int f1745c = 0;

    /* renamed from: d */
    public int f1746d;

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public float mo1224a(View view) {
        return 1.0f;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public abstract View mo1225a(List<View> list);

    public HeaderScrollingViewBehavior() {
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: b */
    public int mo1227b(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: c */
    public final int mo1457c(View view) {
        if (this.f1746d == 0) {
            return 0;
        }
        return C0703a.m2034a((int) (mo1224a(view) * ((float) this.f1746d)), 0, this.f1746d);
    }

    public HeaderScrollingViewBehavior(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public final void mo1456b(CoordinatorLayout coordinatorLayout, View view, int i) {
        int i2;
        View a = mo1225a(coordinatorLayout.mo1331b(view));
        if (a != null) {
            C0505d dVar = (C0505d) view.getLayoutParams();
            Rect rect = this.f1743a;
            rect.set(coordinatorLayout.getPaddingLeft() + dVar.leftMargin, a.getBottom() + dVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - dVar.rightMargin, ((coordinatorLayout.getHeight() + a.getBottom()) - coordinatorLayout.getPaddingBottom()) - dVar.bottomMargin);
            C1018ac lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C1056u.m3073s(coordinatorLayout) && !C1056u.m3073s(view)) {
                rect.left += lastWindowInsets.mo3184a();
                rect.right -= lastWindowInsets.mo3187c();
            }
            Rect rect2 = this.f1744b;
            int i3 = dVar.f1695c;
            if (i3 == 0) {
                i2 = 8388659;
            } else {
                i2 = i3;
            }
            C1039e.m2969a(i2, view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int c = mo1457c(a);
            view.layout(rect2.left, rect2.top - c, rect2.right, rect2.bottom - c);
            this.f1745c = rect2.top - a.getBottom();
            return;
        }
        super.mo1456b(coordinatorLayout, view, i);
        this.f1745c = 0;
    }

    /* renamed from: a */
    public boolean mo1213a(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = view.getLayoutParams().height;
        if (i6 == -1 || i6 == -2) {
            View a = mo1225a(coordinatorLayout.mo1331b(view));
            if (a != null) {
                if (!C1056u.m3073s(a) || C1056u.m3073s(view)) {
                    View view2 = view;
                } else {
                    View view3 = view;
                    C1056u.m3045b(view, true);
                    if (C1056u.m3073s(view)) {
                        view.requestLayout();
                        return true;
                    }
                }
                int size = MeasureSpec.getSize(i3);
                if (size == 0) {
                    size = coordinatorLayout.getHeight();
                }
                int measuredHeight = (size - a.getMeasuredHeight()) + mo1227b(a);
                if (i6 == -1) {
                    i5 = 1073741824;
                } else {
                    i5 = DynamicTabYellowPointVersion.DEFAULT;
                }
                coordinatorLayout.mo1326a(view, i, i2, MeasureSpec.makeMeasureSpec(measuredHeight, i5), i4);
                return true;
            }
        }
        return false;
    }
}
