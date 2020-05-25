package com.bytedance.android.live.uikit.layout;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabYellowPointVersion;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Iterator;

public class WrapLineFlowLayout extends ViewGroup {

    /* renamed from: a */
    protected int f11536a;

    /* renamed from: b */
    protected int f11537b;

    /* renamed from: c */
    protected final boolean f11538c;

    /* renamed from: d */
    final ArrayList<LayoutParams> f11539d;

    public static class LayoutParams extends android.view.ViewGroup.LayoutParams {

        /* renamed from: a */
        public int f11540a;

        /* renamed from: b */
        public int f11541b;

        public LayoutParams(int i, int i2) {
            super(i, i2);
        }

        public LayoutParams(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new LayoutParams(-2, -2);
    }

    /* access modifiers changed from: protected */
    public boolean checkLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof LayoutParams;
    }

    public WrapLineFlowLayout(Context context) {
        this(context, null, 0);
    }

    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new LayoutParams(getContext(), attributeSet);
    }

    /* access modifiers changed from: protected */
    public /* synthetic */ android.view.ViewGroup.LayoutParams generateLayoutParams(android.view.ViewGroup.LayoutParams layoutParams) {
        return new LayoutParams(layoutParams.width, layoutParams.height);
    }

    public WrapLineFlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int size = MeasureSpec.getSize(i);
        int mode = MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode2 = MeasureSpec.getMode(i2);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int i7 = 0;
        if (mode == 0) {
            size = 0;
        }
        int paddingLeft2 = (size - getPaddingLeft()) - getPaddingRight();
        int childCount = getChildCount();
        this.f11539d.clear();
        int i8 = paddingLeft2;
        int i9 = paddingTop;
        int i10 = paddingLeft;
        int i11 = 0;
        int i12 = 0;
        while (i11 < childCount) {
            View childAt = getChildAt(i11);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            if (paddingLeft2 <= 0) {
                i4 = paddingLeft;
                childAt.measure(MeasureSpec.makeMeasureSpec(i7, 1073741824), MeasureSpec.makeMeasureSpec(i7, 1073741824));
                layoutParams.f11540a = i10;
                layoutParams.f11541b = i9;
                i3 = paddingLeft2;
            } else {
                i4 = paddingLeft;
                if (layoutParams.width == -2) {
                    i5 = MeasureSpec.makeMeasureSpec(paddingLeft2, DynamicTabYellowPointVersion.DEFAULT);
                } else if (layoutParams.width == -1) {
                    i5 = MeasureSpec.makeMeasureSpec(i8, 1073741824);
                } else {
                    i5 = MeasureSpec.makeMeasureSpec(layoutParams.width, 1073741824);
                }
                if (layoutParams.height == -2) {
                    i6 = MeasureSpec.makeMeasureSpec(0, 0);
                    i3 = paddingLeft2;
                } else {
                    i3 = paddingLeft2;
                    if (layoutParams.height == -1) {
                        i6 = MeasureSpec.makeMeasureSpec(0, 1073741824);
                    } else {
                        i6 = MeasureSpec.makeMeasureSpec(layoutParams.height, 1073741824);
                    }
                }
                childAt.measure(i5, i6);
                if (childAt.getMeasuredWidth() > i8) {
                    if (i12 > 0) {
                        i9 += i12 + this.f11537b;
                    }
                    if (this.f11538c && i8 > 1 && !this.f11539d.isEmpty()) {
                        int i13 = i8 / 2;
                        Iterator it = this.f11539d.iterator();
                        while (it.hasNext()) {
                            LayoutParams layoutParams2 = (LayoutParams) it.next();
                            layoutParams2.f11540a += i13;
                        }
                    }
                    this.f11539d.clear();
                    i10 = i4;
                    i8 = i3;
                    i12 = 0;
                }
                layoutParams.f11540a = i10;
                layoutParams.f11541b = i9;
                if (this.f11538c) {
                    this.f11539d.add(layoutParams);
                }
                int measuredWidth = childAt.getMeasuredWidth() + this.f11536a;
                i10 += measuredWidth;
                i8 -= measuredWidth;
                if (childAt.getMeasuredHeight() > i12) {
                    i12 = childAt.getMeasuredHeight();
                }
            }
            i11++;
            paddingLeft = i4;
            paddingLeft2 = i3;
            i7 = 0;
        }
        if (this.f11538c && i8 > 1 && !this.f11539d.isEmpty()) {
            int i14 = i8 / 2;
            Iterator it2 = this.f11539d.iterator();
            while (it2.hasNext()) {
                LayoutParams layoutParams3 = (LayoutParams) it2.next();
                layoutParams3.f11540a += i14;
            }
        }
        if (i12 > 0) {
            i9 += i12;
        }
        if (mode2 == 0) {
            size2 = i9 + getPaddingBottom();
        } else if (mode2 == Integer.MIN_VALUE) {
            size2 = Math.min(size2, i9 + getPaddingBottom());
        }
        setMeasuredDimension(size, size2);
    }

    public WrapLineFlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f11539d = new ArrayList<>();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.an, R.attr.mu, R.attr.a_f}, i, 0);
        this.f11536a = obtainStyledAttributes.getDimensionPixelOffset(1, 0);
        this.f11537b = obtainStyledAttributes.getDimensionPixelOffset(2, 0);
        this.f11538c = obtainStyledAttributes.getBoolean(0, false);
        obtainStyledAttributes.recycle();
        if (this.f11536a < 0) {
            this.f11536a = 0;
        }
        if (this.f11537b < 0) {
            this.f11537b = 0;
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int childCount = getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = getChildAt(i5);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            childAt.layout(layoutParams.f11540a, layoutParams.f11541b, layoutParams.f11540a + childAt.getMeasuredWidth(), layoutParams.f11541b + childAt.getMeasuredHeight());
        }
    }
}
