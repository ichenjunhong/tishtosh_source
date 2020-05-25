package com.p683ss.android.ugc.aweme.mix;

import android.content.Context;
import android.graphics.Rect;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1331h;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.support.p043v7.widget.StaggeredGridLayoutManager;
import android.view.View;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.mix.t */
public final class C37089t extends C1331h {

    /* renamed from: a */
    public final int f94728a = ((int) C9432q.m18687b(this.f94732e, 16.0f));

    /* renamed from: b */
    public final int f94729b = ((int) C9432q.m18687b(this.f94732e, 20.0f));

    /* renamed from: c */
    public final int f94730c = ((int) C9432q.m18687b(this.f94732e, 8.0f));

    /* renamed from: d */
    public final int f94731d = ((int) C9432q.m18687b(this.f94732e, 4.5f));

    /* renamed from: e */
    public final Context f94732e;

    public C37089t(Context context) {
        C52711k.m112240b(context, "context");
        this.f94732e = context;
    }

    public final void getItemOffsets(Rect rect, View view, RecyclerView recyclerView, C1349s sVar) {
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(view, "view");
        C52711k.m112240b(recyclerView, "parent");
        C52711k.m112240b(sVar, "state");
        LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams != null) {
            int d = ((StaggeredGridLayoutManager.LayoutParams) layoutParams).mo5247d();
            LayoutParams layoutParams2 = view.getLayoutParams();
            if (layoutParams2 != null) {
                if (((StaggeredGridLayoutManager.LayoutParams) layoutParams2).f4918b) {
                    C1352v b = recyclerView.mo4812b(view);
                    C52711k.m112236a((Object) b, "parent.getChildViewHolder(view)");
                    if (b.getAdapterPosition() != 0) {
                        rect.top = this.f94729b;
                        rect.bottom = this.f94728a;
                        return;
                    }
                } else {
                    rect.top = this.f94730c;
                    if (d == 0) {
                        rect.left = this.f94728a;
                        rect.right = this.f94731d;
                        return;
                    }
                    rect.left = this.f94731d;
                    rect.right = this.f94728a;
                }
                return;
            }
            throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams");
        }
        throw new C52857u("null cannot be cast to non-null type android.support.v7.widget.StaggeredGridLayoutManager.LayoutParams");
    }
}
