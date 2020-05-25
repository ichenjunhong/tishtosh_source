package com.p683ss.android.ugc.aweme.friends.adapter;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.d */
public final class C32528d extends C1331h {

    /* renamed from: a */
    int f84672a;

    /* renamed from: b */
    int f84673b;

    /* renamed from: c */
    private Paint f84674c;

    /* renamed from: d */
    private int f84675d;

    /* renamed from: e */
    private int f84676e;

    /* renamed from: f */
    private int f84677f;

    /* renamed from: g */
    private float f84678g;

    /* renamed from: h */
    private float f84679h;

    public C32528d(int i, int i2, int i3) {
        this(i, i2, 0, 0.0f, 0.0f);
    }

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        RecyclerView recyclerView2 = recyclerView;
        int i = 0;
        if (this.f84677f == 1) {
            int measuredWidth = recyclerView.getMeasuredWidth();
            int childCount = recyclerView.getChildCount();
            int itemCount = recyclerView.getAdapter().getItemCount();
            while (i < childCount) {
                View childAt = recyclerView2.getChildAt(i);
                int f = RecyclerView.m4275f(childAt);
                if (f > 0 && f < itemCount - 1 && f != this.f84672a + 1) {
                    int top = childAt.getTop() + ((LayoutParams) childAt.getLayoutParams()).topMargin;
                    int i2 = top + 1;
                    float f2 = (float) top;
                    float f3 = (float) i2;
                    canvas.drawRect(0.0f, f2, this.f84678g + 0.0f, f3, this.f84674c);
                    float f4 = (float) measuredWidth;
                    canvas.drawRect(f4 - this.f84679h, f2, f4, f3, this.f84674c);
                }
                i++;
            }
            return;
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        int childCount2 = recyclerView.getChildCount();
        while (i < childCount2) {
            View childAt2 = recyclerView2.getChildAt(i);
            int f5 = RecyclerView.m4275f(childAt2);
            if (f5 > 0 && f5 < childCount2 - 1 && f5 != this.f84672a + 1) {
                int left = childAt2.getLeft() + ((LayoutParams) childAt2.getLayoutParams()).leftMargin;
                float f6 = (float) (left - this.f84676e);
                canvas.drawRect(f6, 0.0f, f6, this.f84678g + 0.0f, this.f84674c);
                float f7 = (float) left;
                float f8 = (float) measuredHeight;
                canvas.drawRect(f7, f8 - this.f84679h, f7, f8, this.f84674c);
            }
            i++;
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int i;
        int i2;
        int f = RecyclerView.m4275f(view);
        if (this.f84677f == 1) {
            if (f == this.f84672a) {
                i2 = this.f84673b;
            } else {
                i2 = this.f84676e;
            }
            rect.set(0, 0, 0, i2);
            return;
        }
        if (f == this.f84672a) {
            i = this.f84673b;
        } else {
            i = this.f84676e;
        }
        rect.set(0, 0, i, 0);
    }

    public C32528d(int i, int i2, int i3, float f, float f2) {
        this.f84672a = -1;
        this.f84675d = i;
        this.f84676e = i2;
        this.f84677f = i3;
        this.f84674c = new Paint(1);
        this.f84674c.setColor(this.f84675d);
        this.f84674c.setStyle(Style.FILL);
        this.f84678g = f;
        this.f84679h = f2;
    }
}
