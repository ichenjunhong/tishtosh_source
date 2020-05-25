package com.p683ss.android.ugc.aweme.profile.adapter;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;

/* renamed from: com.ss.android.ugc.aweme.profile.adapter.w */
public final class C39785w extends C1331h {

    /* renamed from: a */
    private int f101539a;

    /* renamed from: b */
    private int f101540b;

    /* renamed from: c */
    private int f101541c;

    /* renamed from: d */
    private int f101542d;

    /* renamed from: e */
    private int f101543e;

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int f = RecyclerView.m4275f(view);
        if (f == 0) {
            rect.set(this.f101539a, this.f101541c, this.f101540b, this.f101543e / 2);
        } else if (f == recyclerView.getAdapter().getItemCount() - 1) {
            rect.set(this.f101539a, this.f101543e / 2, this.f101540b, this.f101542d);
        } else {
            rect.set(this.f101539a, this.f101543e / 2, this.f101540b, this.f101543e / 2);
        }
    }

    public C39785w(int i, int i2, int i3, int i4, int i5) {
        this.f101539a = i;
        this.f101541c = i2;
        this.f101540b = i3;
        this.f101542d = i4;
        this.f101543e = i5;
    }
}
