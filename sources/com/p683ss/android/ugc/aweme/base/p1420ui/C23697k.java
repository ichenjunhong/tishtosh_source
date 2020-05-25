package com.p683ss.android.ugc.aweme.base.p1420ui;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.LayoutParams;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.base.ui.k */
public class C23697k extends C1331h {

    /* renamed from: a */
    private static final String f63204a = "k";

    /* renamed from: b */
    private final int f63205b;

    /* renamed from: c */
    private final int f63206c;

    /* renamed from: d */
    private final int f63207d;

    /* renamed from: e */
    private final Paint f63208e = new Paint();

    /* renamed from: f */
    private int f63209f;

    /* renamed from: g */
    private int f63210g;

    /* renamed from: a */
    public static C23697k m58150a(Context context) {
        C23697k kVar = new C23697k(1, 1, context.getResources().getColor(R.color.aus));
        kVar.mo49122a(C23728o.m58241a(16.0d), C23728o.m58241a(16.0d));
        return kVar;
    }

    /* renamed from: a */
    public final void mo49122a(int i, int i2) {
        this.f63209f = i;
        this.f63210g = i2;
    }

    public C23697k(int i, int i2, int i3) {
        this.f63208e.setAntiAlias(true);
        this.f63208e.setColor(i3);
        this.f63205b = i;
        this.f63206c = i2;
        this.f63207d = i2;
    }

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        super.onDraw(canvas, recyclerView, sVar);
        int i = 0;
        if (this.f63205b == 1) {
            int childCount = recyclerView.getChildCount();
            int paddingLeft = recyclerView.getPaddingLeft() + this.f63209f;
            int width = (recyclerView.getWidth() - recyclerView.getPaddingRight()) - this.f63210g;
            while (i < childCount) {
                View childAt = recyclerView.getChildAt(i);
                if (childAt == null) {
                    break;
                }
                int bottom = childAt.getBottom() + ((LayoutParams) childAt.getLayoutParams()).bottomMargin;
                canvas.drawRect((float) paddingLeft, (float) bottom, (float) width, (float) (this.f63207d + bottom), this.f63208e);
                i++;
            }
            return;
        }
        int childCount2 = recyclerView.getChildCount();
        int paddingTop = recyclerView.getPaddingTop();
        while (i < childCount2) {
            View childAt2 = recyclerView.getChildAt(i);
            if (childAt2 == null) {
                break;
            }
            int height = childAt2.getHeight() - recyclerView.getPaddingBottom();
            int right = childAt2.getRight() + ((LayoutParams) childAt2.getLayoutParams()).rightMargin;
            canvas.drawRect((float) right, (float) paddingTop, (float) (this.f63207d + right), (float) height, this.f63208e);
            i++;
        }
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        super.getItemOffsets(rect, view, recyclerView, sVar);
        C1332i layoutManager = recyclerView.getLayoutManager();
        int a = sVar.mo5115a();
        int g = RecyclerView.m4276g(view);
        if (g != -1 && (layoutManager instanceof LinearLayoutManager) && !(layoutManager instanceof GridLayoutManager)) {
            if (this.f63205b == 1) {
                if (g == a) {
                    rect.set(0, 0, 0, 0);
                } else {
                    rect.set(0, 0, 0, this.f63206c);
                }
            } else if (g == a) {
                rect.set(0, 0, 0, 0);
            } else {
                rect.set(0, 0, this.f63206c, 0);
            }
        }
    }
}
