package com.p683ss.android.ugc.aweme.p1807im.sdk.widget;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.widget.g */
public final class C35401g extends C1331h {

    /* renamed from: a */
    private int f90989a = 4;

    /* renamed from: b */
    private int f90990b;

    /* renamed from: c */
    private boolean f90991c;

    public C35401g(int i, int i2, boolean z) {
        this.f90990b = i2;
        this.f90991c = false;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int f = RecyclerView.m4275f(view);
        int i = f % this.f90989a;
        if (this.f90991c) {
            int i2 = this.f90990b;
            rect.left = i2 - ((i * i2) / this.f90989a);
            rect.right = ((i + 1) * this.f90990b) / this.f90989a;
            if (f < this.f90989a) {
                rect.top = this.f90990b;
            }
            rect.bottom = this.f90990b;
            return;
        }
        rect.left = (this.f90990b * i) / this.f90989a;
        rect.right = this.f90990b - (((i + 1) * this.f90990b) / this.f90989a);
        if (f >= this.f90989a) {
            rect.top = this.f90990b;
        }
    }
}
