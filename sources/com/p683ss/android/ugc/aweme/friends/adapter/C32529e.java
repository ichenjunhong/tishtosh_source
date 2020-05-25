package com.p683ss.android.ugc.aweme.friends.adapter;

import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1332i;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.friends.adapter.e */
public class C32529e extends C1331h {

    /* renamed from: a */
    private static final int[] f84680a = {16843284};

    /* renamed from: b */
    private Drawable f84681b;

    /* renamed from: c */
    private int f84682c;

    /* renamed from: d */
    private int f84683d;

    /* renamed from: e */
    private int f84684e;

    /* renamed from: f */
    private int f84685f;

    /* renamed from: g */
    private int f84686g;

    /* renamed from: h */
    private final Rect f84687h = new Rect();

    public void onDraw(Canvas canvas, RecyclerView recyclerView, C1349s sVar) {
        int i;
        int i2;
        int i3;
        int i4;
        if (recyclerView.getLayoutManager() != null && this.f84681b != null) {
            int i5 = 0;
            if (this.f84686g == 1) {
                canvas.save();
                if (recyclerView.getClipToPadding()) {
                    i3 = recyclerView.getPaddingLeft();
                    i4 = recyclerView.getWidth() - recyclerView.getPaddingRight();
                    canvas.clipRect(i3, recyclerView.getPaddingTop(), i4, recyclerView.getHeight() - recyclerView.getPaddingBottom());
                } else {
                    i4 = recyclerView.getWidth();
                    i3 = 0;
                }
                int childCount = recyclerView.getChildCount();
                while (i5 < childCount) {
                    View childAt = recyclerView.getChildAt(i5);
                    RecyclerView.m4264a(childAt, this.f84687h);
                    int round = this.f84687h.bottom + Math.round(childAt.getTranslationY());
                    this.f84681b.setBounds(this.f84682c + i3, round - this.f84685f, i4 - this.f84683d, round);
                    this.f84681b.draw(canvas);
                    i5++;
                }
                canvas.restore();
                return;
            }
            canvas.save();
            if (recyclerView.getClipToPadding()) {
                i = recyclerView.getPaddingTop();
                i2 = recyclerView.getHeight() - recyclerView.getPaddingBottom();
                canvas.clipRect(recyclerView.getPaddingLeft(), i, recyclerView.getWidth() - recyclerView.getPaddingRight(), i2);
            } else {
                i2 = recyclerView.getHeight();
                i = 0;
            }
            int childCount2 = recyclerView.getChildCount();
            while (i5 < childCount2) {
                View childAt2 = recyclerView.getChildAt(i5);
                recyclerView.getLayoutManager();
                C1332i.m4413a(childAt2, this.f84687h);
                int round2 = this.f84687h.right + Math.round(childAt2.getTranslationX());
                this.f84681b.setBounds(round2 - this.f84681b.getIntrinsicWidth(), i, round2, i2);
                this.f84681b.draw(canvas);
                i5++;
            }
            canvas.restore();
        }
    }

    public C32529e(int i, int i2, int i3, int i4) {
        this.f84681b = new ColorDrawable(i);
        this.f84686g = 1;
        this.f84682c = i2;
        this.f84683d = i3;
        this.f84684e = i4;
        this.f84685f = i4;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        if (this.f84681b == null) {
            rect.set(0, 0, 0, 0);
            return;
        }
        RecyclerView.m4275f(view);
        if (this.f84686g == 1) {
            rect.set(0, 0, 0, this.f84684e);
        } else {
            rect.set(0, 0, this.f84685f, 0);
        }
    }
}
