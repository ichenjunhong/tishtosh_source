package com.p683ss.android.ugc.aweme.challenge.p1500ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.challenge.ui.o */
public final class C24754o extends C1331h {

    /* renamed from: a */
    int f65534a = 0;

    /* renamed from: b */
    int f65535b = 0;

    /* renamed from: c */
    private Drawable f65536c;

    public C24754o(Context context, int i) {
        this.f65536c = context.getResources().getDrawable(R.drawable.u1);
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        int paddingLeft = recyclerView.getPaddingLeft();
        int width = recyclerView.getWidth() - recyclerView.getPaddingRight();
        int childCount = recyclerView.getChildCount();
        for (int i = 0; i < childCount - 1; i++) {
            View childAt = recyclerView.getChildAt(i);
            int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
            this.f65536c.setBounds(this.f65534a + paddingLeft, bottom, width - this.f65535b, this.f65536c.getIntrinsicHeight() + bottom);
            this.f65536c.draw(canvas);
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int f = RecyclerView.m4275f(view);
        int intrinsicHeight = this.f65536c.getIntrinsicHeight();
        if (f == 0) {
            intrinsicHeight = 0;
        }
        rect.set(0, intrinsicHeight, 0, 0);
    }
}
