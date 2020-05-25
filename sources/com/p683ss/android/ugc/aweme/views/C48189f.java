package com.p683ss.android.ugc.aweme.views;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Paint.Style;
import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.views.f */
public final class C48189f extends C1331h {

    /* renamed from: a */
    int f121244a;

    /* renamed from: b */
    int f121245b;

    /* renamed from: c */
    private boolean f121246c;

    /* renamed from: d */
    private Paint f121247d;

    /* renamed from: e */
    private int f121248e;

    /* renamed from: f */
    private int f121249f;

    /* renamed from: g */
    private int f121250g;

    /* renamed from: h */
    private float f121251h;

    /* renamed from: i */
    private float f121252i;

    public final void onDrawOver(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        RecyclerView recyclerView2 = recyclerView;
        int i = 0;
        if (this.f121250g == 1) {
            int measuredWidth = recyclerView.getMeasuredWidth();
            int childCount = recyclerView.getChildCount();
            while (i < childCount) {
                View childAt = recyclerView2.getChildAt(i);
                int top = childAt.getTop() + ((LayoutParams) childAt.getLayoutParams()).topMargin;
                int i2 = top - this.f121249f;
                if (this.f121246c) {
                    canvas.drawRect(this.f121251h + 0.0f, (float) i2, ((float) measuredWidth) - this.f121252i, (float) top, this.f121247d);
                } else {
                    float f = (float) i2;
                    float f2 = (float) top;
                    canvas.drawRect(0.0f, f, this.f121251h, f2, this.f121247d);
                    float f3 = (float) measuredWidth;
                    canvas.drawRect(f3 - this.f121252i, f, f3, f2, this.f121247d);
                }
                i++;
            }
            return;
        }
        int measuredHeight = recyclerView.getMeasuredHeight();
        int childCount2 = recyclerView.getChildCount();
        while (i < childCount2) {
            View childAt2 = recyclerView2.getChildAt(i);
            int left = childAt2.getLeft() + ((LayoutParams) childAt2.getLayoutParams()).leftMargin;
            int i3 = left - this.f121249f;
            if (this.f121246c) {
                canvas.drawRect((float) i3, this.f121251h + 0.0f, (float) left, ((float) measuredHeight) - this.f121252i, this.f121247d);
            } else {
                float f4 = (float) i3;
                float f5 = (float) left;
                Canvas canvas2 = canvas;
                float f6 = f4;
                float f7 = f5;
                canvas2.drawRect(f6, this.f121251h + 0.0f, f7, this.f121251h, this.f121247d);
                float f8 = (float) measuredHeight;
                canvas2.drawRect(f6, f8 - this.f121252i, f7, f8, this.f121247d);
            }
            i++;
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int i;
        int i2;
        int f = RecyclerView.m4275f(view);
        if (this.f121250g == 1) {
            if (f == this.f121244a) {
                i2 = this.f121245b;
            } else {
                i2 = this.f121249f;
            }
            rect.set(0, 0, 0, i2);
            return;
        }
        if (f == this.f121244a) {
            i = this.f121245b;
        } else {
            i = this.f121249f;
        }
        rect.set(0, 0, i, 0);
    }

    public C48189f(int i, int i2, int i3, float f, float f2) {
        this(i, i2, 1, f, f2, true);
    }

    public C48189f(int i, int i2, int i3, float f, float f2, boolean z) {
        this.f121244a = -1;
        this.f121248e = i;
        this.f121249f = i2;
        this.f121250g = i3;
        this.f121247d = new Paint(1);
        this.f121247d.setColor(this.f121248e);
        this.f121247d.setStyle(Style.FILL);
        this.f121251h = f;
        this.f121252i = f2;
        this.f121246c = z;
    }
}
