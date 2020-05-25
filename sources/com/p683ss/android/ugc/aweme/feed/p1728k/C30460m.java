package com.p683ss.android.ugc.aweme.feed.p1728k;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1340m;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.feed.adapter.C30009a;

/* renamed from: com.ss.android.ugc.aweme.feed.k.m */
public final class C30460m extends C1340m {

    /* renamed from: a */
    private int f79592a;

    /* renamed from: b */
    private int f79593b;

    public C30460m() {
        Context a = C11010c.m22280a();
        this.f79592a = C9432q.m18695e(a) + ((int) C9432q.m18687b(a, 80.0f));
        this.f79593b = C9432q.m18695e(a) + ((int) C9432q.m18687b(a, 141.0f));
    }

    public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
        super.onScrollStateChanged(recyclerView, i);
    }

    public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
        super.onScrolled(recyclerView, i, i2);
        int childCount = recyclerView.getChildCount();
        if (childCount > 0) {
            for (int i3 = 0; i3 < childCount; i3++) {
                View childAt = recyclerView.getChildAt(i3);
                C1352v b = recyclerView.mo4812b(childAt);
                if (b != null && b.mItemViewType == 0) {
                    ((C30009a) b).mo58496a((((float) childAt.getBottom()) - ((float) this.f79592a)) / ((float) (this.f79593b - this.f79592a)));
                }
            }
        }
    }
}
