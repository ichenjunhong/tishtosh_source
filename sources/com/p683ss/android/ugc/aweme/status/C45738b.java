package com.p683ss.android.ugc.aweme.status;

import android.content.Context;
import android.graphics.Rect;
import android.support.p030v4.app.FragmentActivity;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1331h;
import com.bytedance.common.utility.C9432q;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.status.b */
public final class C45738b extends C1331h {

    /* renamed from: a */
    public final int f115610a = ((int) C9432q.m18687b((Context) this.f115614e, 5.0f));

    /* renamed from: b */
    public final int f115611b = ((int) C9432q.m18687b((Context) this.f115614e, 16.0f));

    /* renamed from: c */
    public final int f115612c = ((int) C9432q.m18687b((Context) this.f115614e, 25.0f));

    /* renamed from: d */
    public C45790i f115613d;

    /* renamed from: e */
    public FragmentActivity f115614e;

    /* renamed from: f */
    public RecyclerView f115615f;

    public C45738b(FragmentActivity fragmentActivity, RecyclerView recyclerView) {
        C52711k.m112240b(fragmentActivity, "activity");
        C52711k.m112240b(recyclerView, "recyclerview");
        this.f115614e = fragmentActivity;
        this.f115615f = recyclerView;
        C1322a adapter = this.f115615f.getAdapter();
        if (adapter != null) {
            this.f115613d = (C45790i) adapter;
            return;
        }
        throw new C52857u("null cannot be cast to non-null type com.ss.android.ugc.aweme.status.StatusRecyclerViewAdapter");
    }

    public final void getItemOffsets(Rect rect, int i, RecyclerView recyclerView) {
        C52711k.m112240b(rect, "outRect");
        C52711k.m112240b(recyclerView, "parent");
        super.getItemOffsets(rect, i, recyclerView);
        int size = this.f115613d.f115723b.size();
        if (i <= 1) {
            rect.set(this.f115610a, this.f115611b, this.f115610a, this.f115610a);
            return;
        }
        if (i < size - 2) {
            rect.set(this.f115610a, this.f115610a, this.f115610a, this.f115610a);
        } else if (size % 2 == 0) {
            rect.set(this.f115610a, this.f115610a, this.f115610a, this.f115612c);
        } else if (i == size - 1) {
            rect.set(this.f115610a, this.f115610a, this.f115610a, this.f115612c);
        } else {
            rect.set(this.f115610a, this.f115610a, this.f115610a, this.f115610a);
        }
    }
}
