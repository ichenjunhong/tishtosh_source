package com.p683ss.android.ugc.aweme.feed.p1736ui.masklayer;

import android.graphics.Rect;
import android.support.p043v7.widget.LinearLayoutManager;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import com.p683ss.android.ugc.aweme.base.utils.C23728o;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.masklayer.c */
public final class C31042c extends C1331h {

    /* renamed from: a */
    private final int f81280a;

    /* renamed from: b */
    private final int f81281b;

    public C31042c(int i, int i2) {
        this.f81280a = i;
        this.f81281b = i2;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        int i;
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        LinearLayoutManager linearLayoutManager = (LinearLayoutManager) recyclerView.getLayoutManager();
        if (linearLayoutManager != null) {
            if (RecyclerView.m4275f(view) == linearLayoutManager.mo5013A() - 1) {
                i = 0;
            } else {
                i = C23728o.m58241a((double) this.f81281b);
            }
            switch (this.f81280a) {
                case 0:
                    rect.right = i;
                    break;
                case 1:
                    rect.bottom = i;
                    return;
            }
        }
    }
}
