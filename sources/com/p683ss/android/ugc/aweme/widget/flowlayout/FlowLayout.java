package com.p683ss.android.ugc.aweme.widget.flowlayout;

import android.content.Context;
import android.content.res.TypedArray;
import android.support.p030v4.p037e.C0776f;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* renamed from: com.ss.android.ugc.aweme.widget.flowlayout.FlowLayout */
public class FlowLayout extends ViewGroup {

    /* renamed from: a */
    private int f121712a;

    /* renamed from: b */
    private List<View> f121713b;

    /* renamed from: c */
    private int f121714c;

    /* renamed from: d */
    protected List<List<View>> f121715d;

    /* renamed from: e */
    protected List<Integer> f121716e;

    /* renamed from: f */
    protected List<Integer> f121717f;

    /* renamed from: g */
    protected int f121718g;

    /* renamed from: h */
    private int f121719h;

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo60847a(int i, int i2) {
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public void mo60849a(View view) {
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateDefaultLayoutParams() {
        return new MarginLayoutParams(-2, -2);
    }

    public int getVisibleViewCount() {
        int i = 0;
        for (List size : this.f121715d) {
            i += size.size();
        }
        return i;
    }

    public void setMaxLine(int i) {
        this.f121718g = i;
    }

    public FlowLayout(Context context) {
        this(context, null);
    }

    /* access modifiers changed from: protected */
    public LayoutParams generateLayoutParams(LayoutParams layoutParams) {
        return new MarginLayoutParams(layoutParams);
    }

    public LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new MarginLayoutParams(getContext(), attributeSet);
    }

    public FlowLayout(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int size = MeasureSpec.getSize(i);
        MeasureSpec.getMode(i);
        int size2 = MeasureSpec.getSize(i2);
        int mode = MeasureSpec.getMode(i2);
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 0;
        int i7 = 0;
        int i8 = 0;
        int i9 = 0;
        int i10 = 1;
        while (true) {
            if (i5 >= childCount) {
                i3 = i9;
                break;
            }
            View childAt = getChildAt(i5);
            if (childAt.getVisibility() == 8) {
                if (i5 == childCount - 1) {
                    i7 = Math.max(i6, i7);
                    i8 += i9;
                }
                int i11 = i;
                int i12 = i2;
            } else {
                measureChild(childAt, i, i2);
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                i3 = childAt.getMeasuredHeight() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin;
                if (i6 + measuredWidth > (size - getPaddingLeft()) - getPaddingRight()) {
                    i7 = Math.max(i7, i6);
                    i4 = measuredWidth + this.f121719h;
                    i8 += i9;
                    i10++;
                    if (this.f121718g > 0 && i10 > this.f121718g) {
                        break;
                    }
                } else {
                    i4 = i6 + measuredWidth + this.f121719h;
                    i3 = Math.max(i9, i3);
                }
                int i13 = i3;
                int i14 = i4;
                if (i5 == childCount - 1) {
                    i7 = Math.max(i14, i7);
                    i8 += i13;
                }
                i9 = i13;
                i6 = i14;
            }
            i5++;
        }
        if (i3 > 0) {
            i8 += ((i8 / i3) - 1) * this.f121714c;
        }
        if (mode != 1073741824) {
            size2 = getPaddingBottom() + i8 + getPaddingTop();
        }
        setMeasuredDimension(size, size2);
    }

    public FlowLayout(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.f121715d = new ArrayList();
        this.f121716e = new ArrayList();
        this.f121717f = new ArrayList();
        this.f121713b = new ArrayList();
        this.f121714c = 0;
        this.f121719h = 0;
        this.f121718g = 0;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, new int[]{R.attr.u0, R.attr.a5e, R.attr.a5f, R.attr.a5g, R.attr.a5h});
        this.f121712a = obtainStyledAttributes.getInt(1, -1);
        this.f121719h = obtainStyledAttributes.getDimensionPixelSize(3, 0);
        this.f121714c = obtainStyledAttributes.getDimensionPixelSize(4, 0);
        this.f121718g = obtainStyledAttributes.getInteger(2, 0);
        if (C0776f.m2189a(Locale.getDefault()) == 1) {
            if (this.f121712a == -1) {
                this.f121712a = 1;
            } else {
                this.f121712a = -1;
            }
        }
        obtainStyledAttributes.recycle();
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        this.f121715d.clear();
        this.f121716e.clear();
        this.f121717f.clear();
        this.f121713b.clear();
        int width = getWidth();
        int childCount = getChildCount();
        int i5 = 0;
        int i6 = 1;
        int i7 = 0;
        for (int i8 = 0; i8 < childCount; i8++) {
            View childAt = getChildAt(i8);
            if (childAt.getVisibility() != 8) {
                MarginLayoutParams marginLayoutParams = (MarginLayoutParams) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                int measuredHeight = marginLayoutParams.bottomMargin + childAt.getMeasuredHeight() + marginLayoutParams.topMargin;
                if (measuredWidth + i5 > (width - getPaddingLeft()) - getPaddingRight()) {
                    mo60847a(i8, i6);
                    i6++;
                    if (this.f121718g > 0 && i6 > this.f121718g) {
                        break;
                    }
                    this.f121716e.add(Integer.valueOf(i7));
                    this.f121715d.add(this.f121713b);
                    this.f121717f.add(Integer.valueOf(i5));
                    this.f121713b = new ArrayList();
                    i7 = measuredHeight;
                    i5 = 0;
                }
                i5 += measuredWidth + this.f121719h;
                i7 = Math.max(i7, measuredHeight);
                mo60849a(childAt);
                this.f121713b.add(childAt);
            }
        }
        this.f121716e.add(Integer.valueOf(i7));
        this.f121717f.add(Integer.valueOf(i5));
        this.f121715d.add(this.f121713b);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int size = this.f121715d.size();
        int i9 = paddingTop;
        int i10 = paddingLeft;
        int i11 = 0;
        while (i11 < size) {
            this.f121713b = (List) this.f121715d.get(i11);
            int size2 = this.f121713b.size();
            int intValue = ((Integer) this.f121716e.get(i11)).intValue() + this.f121714c;
            int intValue2 = ((Integer) this.f121717f.get(i11)).intValue();
            switch (this.f121712a) {
                case -1:
                    i10 = getPaddingLeft();
                    break;
                case 0:
                    i10 = ((width - intValue2) / 2) + getPaddingLeft();
                    break;
                case 1:
                    i10 = (width - (intValue2 + getPaddingLeft())) - getPaddingRight();
                    Collections.reverse(this.f121713b);
                    break;
            }
            int i12 = i10;
            for (int i13 = 0; i13 < size2; i13++) {
                View view = (View) this.f121713b.get(i13);
                if (view.getVisibility() != 8) {
                    MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) view.getLayoutParams();
                    int i14 = marginLayoutParams2.leftMargin + i12;
                    int i15 = marginLayoutParams2.topMargin + i9;
                    view.layout(i14, i15, view.getMeasuredWidth() + i14, i15 + view.getMeasuredHeight());
                    i12 += view.getMeasuredWidth() + marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin + this.f121719h;
                }
            }
            i9 += intValue;
            i11++;
            i10 = i12;
        }
    }
}
