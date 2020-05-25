package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.o */
public final class C35413o extends C1331h {

    /* renamed from: a */
    private int f91048a;

    /* renamed from: b */
    private int f91049b;

    /* renamed from: c */
    private int f91050c;

    /* renamed from: d */
    private Paint f91051d;

    /* renamed from: e */
    private final Rect f91052e = new Rect();

    public C35413o(int i, int i2, int i3) {
        this.f91050c = i;
        this.f91051d = new Paint(1);
        this.f91051d.setColor(this.f91050c);
        this.f91048a = i2;
        this.f91049b = i3;
    }

    public final void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        int i;
        int i2;
        float f;
        if (recyclerView.getLayoutManager() != null) {
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i = recyclerView.getPaddingLeft();
                i2 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                canvas.clipRect(i, recyclerView.getPaddingTop(), i2, recyclerView.getHeight() - recyclerView.getPaddingBottom());
            } else {
                i2 = recyclerView.getWidth();
                i = 0;
            }
            int childCount = recyclerView.getChildCount();
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                RecyclerView.m4264a(childAt, this.f91052e);
                int round = this.f91052e.bottom + Math.round(childAt.getTranslationY());
                int i4 = round - this.f91048a;
                if (i3 == childCount - 1) {
                    f = (float) i;
                } else {
                    f = (float) (this.f91049b + i);
                }
                canvas.drawRect(f, (float) i4, (float) i2, (float) round, this.f91051d);
            }
            canvas.restore();
        }
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int i;
        recyclerView.getLayoutManager();
        if (C1332i.m4418c(view) == 0) {
            i = this.f91048a;
        } else {
            i = 0;
        }
        rect.set(0, i, 0, this.f91048a);
    }
}
