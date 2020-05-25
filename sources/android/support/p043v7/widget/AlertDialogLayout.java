package android.support.p043v7.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.support.p030v4.view.C1039e;
import android.support.p030v4.view.C1056u;
import android.support.p043v7.widget.LinearLayoutCompat.LayoutParams;
import android.util.AttributeSet;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup;
import com.ss.android.ugc.trill.R;

/* renamed from: android.support.v7.widget.AlertDialogLayout */
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(Context context) {
        super(context);
    }

    /* renamed from: a */
    private static int m4063a(View view) {
        while (true) {
            int l = C1056u.m3066l(view);
            if (l <= 0) {
                if (!(view instanceof ViewGroup)) {
                    break;
                }
                ViewGroup viewGroup = (ViewGroup) view;
                if (viewGroup.getChildCount() != 1) {
                    break;
                }
                view = viewGroup.getChildAt(0);
            } else {
                return l;
            }
        }
        return 0;
    }

    public AlertDialogLayout(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    /* access modifiers changed from: protected */
    public void onMeasure(int i, int i2) {
        int i3;
        int i4;
        int i5;
        int i6;
        int i7;
        int i8 = i;
        int childCount = getChildCount();
        boolean z = false;
        View view = null;
        View view2 = null;
        View view3 = null;
        int i9 = 0;
        while (true) {
            if (i9 < childCount) {
                View childAt = getChildAt(i9);
                if (childAt.getVisibility() != 8) {
                    int id = childAt.getId();
                    if (id == R.id.d2d) {
                        view = childAt;
                    } else if (id == R.id.pw) {
                        view2 = childAt;
                    } else if ((id == R.id.zi || id == R.id.a2v) && view3 == null) {
                        view3 = childAt;
                    }
                }
                i9++;
            } else {
                int mode = MeasureSpec.getMode(i2);
                int size = MeasureSpec.getSize(i2);
                int mode2 = MeasureSpec.getMode(i);
                int paddingTop = getPaddingTop() + getPaddingBottom();
                if (view != null) {
                    view.measure(i8, 0);
                    paddingTop += view.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(0, view.getMeasuredState());
                } else {
                    i3 = 0;
                }
                if (view2 != null) {
                    view2.measure(i8, 0);
                    i5 = m4063a(view2);
                    i4 = view2.getMeasuredHeight() - i5;
                    paddingTop += i5;
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                } else {
                    i5 = 0;
                    i4 = 0;
                }
                if (view3 != null) {
                    if (mode == 0) {
                        i7 = 0;
                    } else {
                        i7 = MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode);
                    }
                    view3.measure(i8, i7);
                    i6 = view3.getMeasuredHeight();
                    paddingTop += i6;
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                } else {
                    i6 = 0;
                }
                int i10 = size - paddingTop;
                if (view2 != null) {
                    int i11 = paddingTop - i5;
                    int min = Math.min(i10, i4);
                    if (min > 0) {
                        i10 -= min;
                        i5 += min;
                    }
                    view2.measure(i8, MeasureSpec.makeMeasureSpec(i5, 1073741824));
                    paddingTop = i11 + view2.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view2.getMeasuredState());
                }
                if (view3 != null && i10 > 0) {
                    int i12 = paddingTop - i6;
                    view3.measure(i8, MeasureSpec.makeMeasureSpec(i6 + i10, mode));
                    paddingTop = i12 + view3.getMeasuredHeight();
                    i3 = View.combineMeasuredStates(i3, view3.getMeasuredState());
                }
                int i13 = 0;
                for (int i14 = 0; i14 < childCount; i14++) {
                    View childAt2 = getChildAt(i14);
                    if (childAt2.getVisibility() != 8) {
                        i13 = Math.max(i13, childAt2.getMeasuredWidth());
                    }
                }
                setMeasuredDimension(View.resolveSizeAndState(i13 + getPaddingLeft() + getPaddingRight(), i8, i3), View.resolveSizeAndState(paddingTop, i2, 0));
                if (mode2 != 1073741824) {
                    int makeMeasureSpec = MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
                    for (int i15 = 0; i15 < childCount; i15++) {
                        View childAt3 = getChildAt(i15);
                        if (childAt3.getVisibility() != 8) {
                            LayoutParams layoutParams = (LayoutParams) childAt3.getLayoutParams();
                            if (layoutParams.width == -1) {
                                int i16 = layoutParams.height;
                                layoutParams.height = childAt3.getMeasuredHeight();
                                measureChildWithMargins(childAt3, makeMeasureSpec, 0, i2, 0);
                                layoutParams.height = i16;
                            }
                        }
                    }
                }
                z = true;
            }
        }
        int i17 = i2;
        if (!z) {
            super.onMeasure(i, i2);
        }
    }

    /* access modifiers changed from: protected */
    public void onLayout(boolean z, int i, int i2, int i3, int i4) {
        int i5;
        int i6;
        int i7;
        int paddingLeft = getPaddingLeft();
        int i8 = i3 - i;
        int paddingRight = i8 - getPaddingRight();
        int paddingRight2 = (i8 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i9 = gravity & 112;
        int i10 = gravity & 8388615;
        if (i9 == 16) {
            i5 = getPaddingTop() + (((i4 - i2) - measuredHeight) / 2);
        } else if (i9 != 80) {
            i5 = getPaddingTop();
        } else {
            i5 = ((getPaddingTop() + i4) - i2) - measuredHeight;
        }
        Drawable dividerDrawable = getDividerDrawable();
        if (dividerDrawable == null) {
            i6 = 0;
        } else {
            i6 = dividerDrawable.getIntrinsicHeight();
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            if (!(childAt == null || childAt.getVisibility() == 8)) {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
                int i12 = layoutParams.f4548h;
                if (i12 < 0) {
                    i12 = i10;
                }
                int a = C1039e.m2968a(i12, C1056u.m3055f(this)) & 7;
                if (a == 1) {
                    i7 = ((((paddingRight2 - measuredWidth) / 2) + paddingLeft) + layoutParams.leftMargin) - layoutParams.rightMargin;
                } else if (a != 5) {
                    i7 = layoutParams.leftMargin + paddingLeft;
                } else {
                    i7 = (paddingRight - measuredWidth) - layoutParams.rightMargin;
                }
                if (mo4695a(i11)) {
                    i5 += i6;
                }
                int i13 = i5 + layoutParams.topMargin;
                childAt.layout(i7, i13, measuredWidth + i7, i13 + measuredHeight2);
                i5 = i13 + measuredHeight2 + layoutParams.bottomMargin;
            }
        }
    }
}
