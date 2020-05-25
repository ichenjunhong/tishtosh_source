package com.p683ss.android.ugc.aweme.discover.jedi.p1653a;

import android.graphics.Rect;
import android.support.p043v7.widget.GridLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.widget.C23751c;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.a.b */
public final class C28243b extends C1331h {

    /* renamed from: a */
    private int f74116a = 2;

    /* renamed from: b */
    private int f74117b;

    /* renamed from: c */
    private boolean f74118c;

    public C28243b(int i, int i2, boolean z) {
        this.f74117b = i2;
        this.f74118c = false;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int f = RecyclerView.m4275f(view);
        C1322a adapter = recyclerView.getAdapter();
        if ((adapter instanceof C23751c) && ((C23751c) adapter).f63324c != null) {
            if (f != 0) {
                f++;
            } else {
                return;
            }
        }
        int a = ((GridLayoutManager) recyclerView.getLayoutManager()).f4526g.mo4691a(f, this.f74116a);
        if (this.f74118c) {
            int i = this.f74117b;
            rect.left = i - ((a * i) / this.f74116a);
            rect.right = ((a + 1) * this.f74117b) / this.f74116a;
            if (f < this.f74116a) {
                rect.top = this.f74117b;
            }
            rect.bottom = this.f74117b;
            return;
        }
        rect.left = (this.f74117b * a) / this.f74116a;
        rect.right = this.f74117b - (((a + 1) * this.f74117b) / this.f74116a);
        if (f >= this.f74116a) {
            rect.top = this.f74117b;
        }
    }
}
