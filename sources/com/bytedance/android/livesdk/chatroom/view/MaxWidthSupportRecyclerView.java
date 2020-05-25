package com.bytedance.android.livesdk.chatroom.view;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.View.MeasureSpec;
import android.view.ViewGroup.LayoutParams;
import android.view.ViewGroup.MarginLayoutParams;

public class MaxWidthSupportRecyclerView extends RecyclerView {

    /* renamed from: N */
    private float f16738N = 3.0f;

    /* renamed from: O */
    private boolean f16739O;

    public void setEnable(boolean z) {
        this.f16739O = z;
    }

    public void setMaxItem(float f) {
        this.f16738N = f;
    }

    public MaxWidthSupportRecyclerView(Context context) {
        super(context);
    }

    public boolean dispatchTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction();
        if (action != 3) {
            switch (action) {
                case 0:
                    Boolean.valueOf(true);
                    break;
                case 1:
                    break;
            }
        }
        Boolean.valueOf(false);
        return super.dispatchTouchEvent(motionEvent);
    }

    public MaxWidthSupportRecyclerView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    public void onMeasure(int i, int i2) {
        super.onMeasure(i, i2);
        int i3 = (int) this.f16738N;
        float f = this.f16738N % ((float) i3);
        if (this.f16739O && getAdapter() != null && getAdapter().getItemCount() >= i3 && getChildCount() >= i3) {
            int i4 = 0;
            for (int i5 = 0; i5 < i3; i5++) {
                View childAt = getChildAt(i5);
                if (childAt != null) {
                    i4 += childAt.getMeasuredWidth();
                    LayoutParams layoutParams = childAt.getLayoutParams();
                    if (layoutParams instanceof MarginLayoutParams) {
                        MarginLayoutParams marginLayoutParams = (MarginLayoutParams) layoutParams;
                        i4 += marginLayoutParams.leftMargin + marginLayoutParams.rightMargin;
                    }
                }
            }
            if (getAdapter().getItemCount() > i3 && f > 0.0f) {
                View childAt2 = getChildAt(i3);
                i4 += childAt2.getMeasuredWidth() / 2;
                LayoutParams layoutParams2 = childAt2.getLayoutParams();
                if (layoutParams2 instanceof MarginLayoutParams) {
                    MarginLayoutParams marginLayoutParams2 = (MarginLayoutParams) layoutParams2;
                    i4 += (marginLayoutParams2.leftMargin + marginLayoutParams2.rightMargin) / 2;
                }
            }
            setMeasuredDimension(i4, MeasureSpec.getSize(i2));
        }
    }

    public MaxWidthSupportRecyclerView(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
    }
}
