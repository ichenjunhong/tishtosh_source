package android.support.p043v7.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p030v4.view.C1056u;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.widget.LinearLayout;
import android.widget.LinearLayout.LayoutParams;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.ButtonBarLayout */
public class ButtonBarLayout extends LinearLayout {

    /* renamed from: a */
    private boolean f4496a;

    /* renamed from: b */
    private int f4497b = -1;

    /* renamed from: c */
    private int f4498c;

    /* renamed from: a */
    private boolean m4073a() {
        if (getOrientation() == 1) {
            return true;
        }
        return false;
    }

    public int getMinimumHeight() {
        return Math.max(this.f4498c, super.getMinimumHeight());
    }

    /* renamed from: a */
    private int m4072a(int i) {
        int childCount = getChildCount();
        while (i < childCount) {
            if (getChildAt(i).getVisibility() == 0) {
                return i;
            }
            i++;
        }
        return -1;
    }

    public void setAllowStacking(boolean z) {
        if (this.f4496a != z) {
            this.f4496a = z;
            if (!this.f4496a && getOrientation() == 1) {
                setStacked(false);
            }
            requestLayout();
        }
    }

    private void setStacked(boolean z) {
        int i;
        int i2;
        setOrientation(z ? 1 : 0);
        if (z) {
            i = 5;
        } else {
            i = 80;
        }
        setGravity(i);
        View findViewById = findViewById(R.id.cqf);
        if (findViewById != null) {
            if (z) {
                i2 = 8;
            } else {
                i2 = 4;
            }
            findViewById.setVisibility(i2);
        }
        for (int childCount = getChildCount() - 2; childCount >= 0; childCount--) {
            bringChildToFront(getChildAt(childCount));
        }
    }

    public ButtonBarLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.ap});
        this.f4496a = obtainStyledAttributes.getBoolean(0, true);
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        boolean z;
        int i3;
        boolean z2;
        int size = MeasureSpec.getSize(i);
        int i4 = 0;
        if (this.f4496a) {
            if (size > this.f4497b && m4073a()) {
                setStacked(false);
            }
            this.f4497b = size;
        }
        if (m4073a() || MeasureSpec.getMode(i) != 1073741824) {
            i3 = i;
            z = false;
        } else {
            i3 = MeasureSpec.makeMeasureSpec(size, DynamicTabYellowPointVersion.DEFAULT);
            z = true;
        }
        super.onMeasure(i3, i2);
        if (this.f4496a && !m4073a()) {
            if ((getMeasuredWidthAndState() & -16777216) == 16777216) {
                z2 = true;
            } else {
                z2 = false;
            }
            if (z2) {
                setStacked(true);
                z = true;
            }
        }
        if (z) {
            super.onMeasure(i, i2);
        }
        int a = m4072a(0);
        if (a >= 0) {
            View childAt = getChildAt(a);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int paddingTop = getPaddingTop() + childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin + 0;
            if (m4073a()) {
                int a2 = m4072a(a + 1);
                if (a2 >= 0) {
                    paddingTop += getChildAt(a2).getPaddingTop() + ((int) (getResources().getDisplayMetrics().density * 16.0f));
                }
                i4 = paddingTop;
            } else {
                i4 = paddingTop + getPaddingBottom();
            }
        }
        if (C1056u.m3066l(this) != i4) {
            setMinimumHeight(i4);
        }
    }
}
