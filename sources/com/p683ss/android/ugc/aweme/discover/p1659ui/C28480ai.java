package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ai */
public final class C28480ai extends C1331h {

    /* renamed from: a */
    private Drawable f74886a;

    /* renamed from: b */
    private Drawable f74887b;

    /* renamed from: a */
    private static int m67592a(RecyclerView recyclerView) {
        C1332i layoutManager = recyclerView.getLayoutManager();
        if (layoutManager instanceof GridLayoutManager) {
            return ((GridLayoutManager) layoutManager).f4521b;
        }
        if (layoutManager instanceof StaggeredGridLayoutManager) {
            return ((StaggeredGridLayoutManager) layoutManager).f4896a;
        }
        return -1;
    }

    public C28480ai(Drawable drawable, Drawable drawable2) {
        this.f74886a = drawable;
        this.f74887b = drawable2;
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        int i;
        int i2;
        int a = m67592a(recyclerView);
        int childCount = recyclerView.getChildCount();
        int i3 = childCount / a;
        int i4 = childCount % a;
        for (int i5 = 1; i5 < a; i5++) {
            if (i5 < i4) {
                i2 = i3 * a;
            } else {
                i2 = (i3 - 1) * a;
            }
            int i6 = i2 + i5;
            View childAt = recyclerView.getChildAt(i5);
            View childAt2 = recyclerView.getChildAt(i6);
            int top = childAt.getTop();
            int left = childAt.getLeft();
            this.f74886a.setBounds(left - this.f74886a.getIntrinsicWidth(), top, left, childAt2.getBottom());
            this.f74886a.draw(canvas);
        }
        int a2 = m67592a(recyclerView);
        int childCount2 = recyclerView.getChildCount() / a2;
        for (int i7 = 1; i7 < childCount2; i7++) {
            if (i7 == childCount2) {
                i = recyclerView.getChildCount();
            } else {
                i = (i7 * a2) + a2;
            }
            int i8 = i - 1;
            View childAt3 = recyclerView.getChildAt(i7 * a2);
            View childAt4 = recyclerView.getChildAt(i8);
            int left2 = childAt3.getLeft();
            int top2 = childAt3.getTop();
            this.f74887b.setBounds(left2, top2 - this.f74887b.getIntrinsicHeight(), childAt4.getRight(), top2);
            this.f74887b.draw(canvas);
        }
    }

    /* JADX WARNING: Code restructure failed: missing block: B:7:0x002b, code lost:
        if (r0 == ((r6 / r8) + 1)) goto L_0x0045;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final void getItemOffsets(android.graphics.Rect r5, android.view.View r6, android.support.p043v7.widget.RecyclerView r7, android.support.p043v7.widget.RecyclerView.C1349s r8) {
        /*
            r4 = this;
            android.view.ViewGroup$LayoutParams r6 = r6.getLayoutParams()
            android.support.v7.widget.RecyclerView$LayoutParams r6 = (android.support.p043v7.widget.RecyclerView.LayoutParams) r6
            int r6 = r6.bw_()
            int r8 = m67592a(r7)
            android.support.v7.widget.RecyclerView$a r0 = r7.getAdapter()
            int r0 = r0.getItemCount()
            android.support.v7.widget.RecyclerView$i r7 = r7.getLayoutManager()
            boolean r1 = r7 instanceof android.support.p043v7.widget.GridLayoutManager
            r2 = 0
            r3 = 1
            if (r1 == 0) goto L_0x002e
            int r7 = r0 % r8
            if (r7 != 0) goto L_0x0026
            int r0 = r0 / r8
            goto L_0x0028
        L_0x0026:
            int r0 = r0 / r8
            int r0 = r0 + r3
        L_0x0028:
            int r7 = r6 / r8
            int r7 = r7 + r3
            if (r0 != r7) goto L_0x0044
            goto L_0x0045
        L_0x002e:
            boolean r1 = r7 instanceof android.support.p043v7.widget.StaggeredGridLayoutManager
            if (r1 == 0) goto L_0x0044
            android.support.v7.widget.StaggeredGridLayoutManager r7 = (android.support.p043v7.widget.StaggeredGridLayoutManager) r7
            int r7 = r7.f4900e
            if (r7 != r3) goto L_0x003e
            int r7 = r0 % r8
            int r0 = r0 - r7
            if (r6 < r0) goto L_0x0044
            goto L_0x0045
        L_0x003e:
            int r7 = r6 + 1
            int r7 = r7 % r8
            if (r7 != 0) goto L_0x0044
            goto L_0x0045
        L_0x0044:
            r3 = 0
        L_0x0045:
            int r7 = r8 + -1
            android.graphics.drawable.Drawable r0 = r4.f74886a
            int r0 = r0.getIntrinsicWidth()
            int r7 = r7 * r0
            int r7 = r7 / r8
            android.graphics.drawable.Drawable r0 = r4.f74886a
            int r0 = r0.getIntrinsicWidth()
            int r0 = r0 - r7
            int r6 = r6 % r8
            int r6 = r6 * r0
            int r7 = r7 - r6
            android.graphics.drawable.Drawable r8 = r4.f74887b
            int r8 = r8.getIntrinsicHeight()
            if (r3 == 0) goto L_0x0064
            r8 = 0
        L_0x0064:
            r5.set(r6, r2, r7, r8)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.p1659ui.C28480ai.getItemOffsets(android.graphics.Rect, android.view.View, android.support.v7.widget.RecyclerView, android.support.v7.widget.RecyclerView$s):void");
    }
}
