package com.p683ss.android.ugc.aweme.base.widget;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import com.p683ss.android.ugc.aweme.shortvideo.widget.p2263b.C45595a;

/* renamed from: com.ss.android.ugc.aweme.base.widget.a */
public class C23745a extends C1331h {

    /* renamed from: a */
    private int f63305a;

    /* renamed from: b */
    private int f63306b;

    /* renamed from: c */
    private boolean f63307c = false;

    public C23745a(int i, int i2, boolean z) {
        this.f63305a = i;
        this.f63306b = i2;
    }

    public void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int f = RecyclerView.m4275f(view);
        C1322a adapter = recyclerView.getAdapter();
        if (adapter instanceof C23751c) {
            if (((C23751c) adapter).f63324c != null) {
                if (f != 0) {
                    f++;
                } else {
                    return;
                }
            }
        } else if (adapter instanceof C45595a) {
            int c = ((C45595a) adapter).f115333a.mo2596c();
            if (f >= c) {
                f += c;
            } else {
                return;
            }
        }
        int i = f % this.f63305a;
        if (this.f63307c) {
            int i2 = this.f63306b;
            rect.left = i2 - ((i * i2) / this.f63305a);
            rect.right = ((i + 1) * this.f63306b) / this.f63305a;
            if (f < this.f63305a) {
                rect.top = this.f63306b;
            }
            rect.bottom = this.f63306b;
            return;
        }
        rect.left = (this.f63306b * i) / this.f63305a;
        rect.right = this.f63306b - (((i + 1) * this.f63306b) / this.f63305a);
        if (f >= this.f63305a) {
            rect.top = this.f63306b;
        }
    }
}
