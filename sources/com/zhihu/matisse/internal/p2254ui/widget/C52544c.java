package com.zhihu.matisse.internal.p2254ui.widget;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;

/* renamed from: com.zhihu.matisse.internal.ui.widget.c */
public final class C52544c extends C1331h {

    /* renamed from: a */
    private int f130846a;

    /* renamed from: b */
    private int f130847b;

    /* renamed from: c */
    private boolean f130848c = false;

    public C52544c(int i, int i2, boolean z) {
        this.f130846a = i;
        this.f130847b = i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int f = RecyclerView.m4275f(view);
        int i = f % this.f130846a;
        if (this.f130848c) {
            int i2 = this.f130847b;
            rect.left = i2 - ((i * i2) / this.f130846a);
            rect.right = ((i + 1) * this.f130847b) / this.f130846a;
            if (f < this.f130846a) {
                rect.top = this.f130847b;
            }
            rect.bottom = this.f130847b;
            return;
        }
        rect.left = (this.f130847b * i) / this.f130846a;
        rect.right = this.f130847b - (((i + 1) * this.f130847b) / this.f130846a);
        if (f >= this.f130846a) {
            rect.top = this.f130847b;
        }
    }
}
