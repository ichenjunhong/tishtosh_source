package com.p683ss.android.ugc.aweme.emoji.emojiPageV2;

import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.emoji.emojiPageV2.b */
public final class C29320b extends C1331h {

    /* renamed from: a */
    public final int f76727a = 1;

    /* renamed from: b */
    public final int f76728b;

    /* renamed from: c */
    public int f76729c;

    /* renamed from: d */
    public int f76730d;

    public C29320b(int i, int i2, int i3, int i4) {
        this.f76728b = i2;
        this.f76729c = i3;
        this.f76730d = i4;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        int f = RecyclerView.m4275f(view);
        int i = this.f76728b;
        if (f >= 0 && i > f) {
            rect.top = (int) C9432q.m18687b(view.getContext(), 16.0f);
        }
        if (f >= this.f76728b) {
            rect.top = this.f76730d;
        }
        int i2 = f % this.f76728b;
        rect.left = (this.f76729c * i2) / this.f76728b;
        rect.right = this.f76729c - (((i2 + 1) * this.f76729c) / this.f76728b);
        C1322a adapter = recyclerView.getAdapter();
        if (adapter != null) {
            C52711k.m112236a((Object) adapter, "it");
            int itemCount = adapter.getItemCount() % this.f76728b;
            if (itemCount == 0) {
                if (f >= (adapter.getItemCount() - 1) - this.f76728b) {
                    rect.bottom = (int) C9432q.m18687b(view.getContext(), 10.0f);
                }
            } else if (f >= adapter.getItemCount() - itemCount) {
                rect.bottom = (int) C9432q.m18687b(view.getContext(), 10.0f);
            }
        }
    }
}
