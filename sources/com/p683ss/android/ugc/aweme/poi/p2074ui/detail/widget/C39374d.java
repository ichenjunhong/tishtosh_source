package com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget;

import android.content.Context;
import android.graphics.Rect;
import android.support.p030v4.p033b.C0703a;
import android.support.p030v4.view.C1018ac;
import android.support.p030v4.view.C1039e;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.p683ss.android.ugc.aweme.poi.p2074ui.detail.widget.CoordinatorLayout.C39367d;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.poi.ui.detail.widget.d */
abstract class C39374d extends C39376f<View> {
    public int mOverlayTop;
    final Rect mTempRect1 = new Rect();
    final Rect mTempRect2 = new Rect();
    public int mVerticalLayoutGap = 0;

    private static int resolveGravity(int i) {
        if (i == 0) {
            return 8388659;
        }
        return i;
    }

    /* access modifiers changed from: 0000 */
    public abstract View findFirstDependency(List<View> list);

    /* access modifiers changed from: 0000 */
    public float getOverlapRatioForOffset(View view) {
        return 1.0f;
    }

    C39374d() {
    }

    /* access modifiers changed from: 0000 */
    public int getScrollRange(View view) {
        return view.getMeasuredHeight();
    }

    /* access modifiers changed from: 0000 */
    public final int getOverlapPixelsForOffset(View view) {
        if (this.mOverlayTop == 0) {
            return 0;
        }
        return C0703a.m2034a((int) (getOverlapRatioForOffset(view) * ((float) this.mOverlayTop)), 0, this.mOverlayTop);
    }

    C39374d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void layoutChild(CoordinatorLayout coordinatorLayout, View view, int i) {
        View findFirstDependency = findFirstDependency(coordinatorLayout.mo80264b(view));
        if (findFirstDependency != null) {
            C39367d dVar = (C39367d) view.getLayoutParams();
            Rect rect = this.mTempRect1;
            rect.set(coordinatorLayout.getPaddingLeft() + dVar.leftMargin, findFirstDependency.getBottom() + dVar.topMargin, (coordinatorLayout.getWidth() - coordinatorLayout.getPaddingRight()) - dVar.rightMargin, ((coordinatorLayout.getHeight() + findFirstDependency.getBottom()) - coordinatorLayout.getPaddingBottom()) - dVar.bottomMargin);
            C1018ac lastWindowInsets = coordinatorLayout.getLastWindowInsets();
            if (lastWindowInsets != null && C1056u.m3073s(coordinatorLayout) && !C1056u.m3073s(view)) {
                rect.left += lastWindowInsets.mo3184a();
                rect.right -= lastWindowInsets.mo3187c();
            }
            Rect rect2 = this.mTempRect2;
            C1039e.m2969a(resolveGravity(dVar.f100672c), view.getMeasuredWidth(), view.getMeasuredHeight(), rect, rect2, i);
            int overlapPixelsForOffset = getOverlapPixelsForOffset(findFirstDependency);
            view.layout(rect2.left, rect2.top - overlapPixelsForOffset, rect2.right, rect2.bottom - overlapPixelsForOffset);
            this.mVerticalLayoutGap = rect2.top - findFirstDependency.getBottom();
            return;
        }
        super.layoutChild(coordinatorLayout, view, i);
        this.mVerticalLayoutGap = 0;
    }

    public boolean onMeasureChild(CoordinatorLayout coordinatorLayout, View view, int i, int i2, int i3, int i4) {
        int i5;
        int i6 = view.getLayoutParams().height;
        if (i6 == -1 || i6 == -2) {
            View findFirstDependency = findFirstDependency(coordinatorLayout.mo80264b(view));
            if (findFirstDependency != null) {
                if (!C1056u.m3073s(findFirstDependency) || C1056u.m3073s(view)) {
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
                int measuredHeight = (size - findFirstDependency.getMeasuredHeight()) + getScrollRange(findFirstDependency);
                if (i6 == -1) {
                    i5 = 1073741824;
                } else {
                    i5 = DynamicTabYellowPointVersion.DEFAULT;
                }
                coordinatorLayout.mo80262a(view, i, i2, MeasureSpec.makeMeasureSpec(measuredHeight, i5), i4);
                return true;
            }
        }
        return false;
    }
}
