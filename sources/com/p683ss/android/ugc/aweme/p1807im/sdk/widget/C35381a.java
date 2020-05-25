package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.a */
public final class C35381a extends C1331h {

    /* renamed from: a */
    private static final int[] f90912a = {16843284};

    /* renamed from: b */
    private Drawable f90913b;

    public C35381a(Context context) {
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(f90912a);
        this.f90913b = obtainStyledAttributes.getDrawable(0);
        obtainStyledAttributes.recycle();
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = recyclerView.getChildAt(i);
            LayoutParams layoutParams = (LayoutParams) childAt.getLayoutParams();
            int left = childAt.getLeft() - layoutParams.leftMargin;
            int right = childAt.getRight() + layoutParams.rightMargin + this.f90913b.getIntrinsicWidth();
            int bottom = childAt.getBottom() + layoutParams.bottomMargin;
            this.f90913b.setBounds(left, bottom, right, this.f90913b.getIntrinsicHeight() + bottom);
            this.f90913b.draw(canvas);
        }
        int childCount2 = recyclerView.getChildCount();
        for (int i2 = 0; i2 < childCount2; i2++) {
            View childAt2 = recyclerView.getChildAt(i2);
            LayoutParams layoutParams2 = (LayoutParams) childAt2.getLayoutParams();
            int top = childAt2.getTop() - layoutParams2.topMargin;
            int bottom2 = childAt2.getBottom() + layoutParams2.bottomMargin;
            int right2 = childAt2.getRight() + layoutParams2.rightMargin;
            this.f90913b.setBounds(right2, top, this.f90913b.getIntrinsicWidth() + right2, bottom2);
            this.f90913b.draw(canvas);
        }
    }

    public final void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
        int i2;
        boolean z;
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            i2 = ((GridLayoutManager) layoutManager).f4521b;
        } else if (layoutManager instanceof StaggeredGridLayoutManager) {
            i2 = ((StaggeredGridLayoutManager) layoutManager).f4896a;
        } else {
            i2 = -1;
        }
        int itemCount = recyclerView.getAdapter().getItemCount();
        C1332i layoutManager2 = recyclerView.getLayoutManager();
        boolean z2 = true;
        if (!(layoutManager2 instanceof GridLayoutManager) ? !(layoutManager2 instanceof StaggeredGridLayoutManager) || (((StaggeredGridLayoutManager) layoutManager2).f4900e != 1 ? (i + 1) % i2 != 0 : i < itemCount - (itemCount % i2)) : i < itemCount - (itemCount % i2)) {
            z = false;
        } else {
            z = true;
        }
        if (z) {
            rect.set(0, 0, this.f90913b.getIntrinsicWidth(), 0);
            return;
        }
        C1332i layoutManager3 = recyclerView.getLayoutManager();
        if (!(layoutManager3 instanceof GridLayoutManager) ? !(layoutManager3 instanceof StaggeredGridLayoutManager) || (((StaggeredGridLayoutManager) layoutManager3).f4900e != 1 ? i < itemCount - (itemCount % i2) : (i + 1) % i2 != 0) : (i + 1) % i2 != 0) {
            z2 = false;
        }
        if (z2) {
            rect.set(0, 0, 0, this.f90913b.getIntrinsicHeight());
        } else {
            rect.set(0, 0, this.f90913b.getIntrinsicWidth(), this.f90913b.getIntrinsicHeight());
        }
    }
}
