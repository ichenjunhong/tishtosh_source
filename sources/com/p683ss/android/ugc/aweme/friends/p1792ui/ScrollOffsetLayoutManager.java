package com.p683ss.android.ugc.aweme.friends.p1792ui;

import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1349s;
import android.util.AttributeSet;
import android.util.SparseIntArray;
import android.view.View;
import com.p683ss.android.ugc.aweme.views.WrapLinearLayoutManager;

/* renamed from: com.ss.android.ugc.aweme.friends.ui.ScrollOffsetLayoutManager */
public class ScrollOffsetLayoutManager extends WrapLinearLayoutManager {

    /* renamed from: a */
    private final SparseIntArray f85142a = new SparseIntArray();

    /* renamed from: a */
    public final void mo4677a(C1349s sVar) {
        super.mo4677a(sVar);
        int s = mo5062s();
        for (int i = 0; i < s; i++) {
            View g = mo5050g(i);
            if (g != null) {
                this.f85142a.put(i, g.getHeight());
            }
        }
    }

    /* renamed from: c */
    public final int mo4735c(C1349s sVar) {
        int i;
        if (mo5062s() == 0) {
            return 0;
        }
        try {
            int j = mo4749j();
            int i2 = -((int) mo4736c(j).getY());
            for (int i3 = 0; i3 < j; i3++) {
                if (this.f85142a.indexOfKey(i3) >= 0) {
                    i = 0;
                } else {
                    i = this.f85142a.get(i3);
                }
                i2 += i;
            }
            return i2;
        } catch (Exception unused) {
            return 0;
        }
    }

    public ScrollOffsetLayoutManager(Context context, AttributeSet attributeSet, int i, int i2) {
        super(context, attributeSet, i, i2);
    }
}
