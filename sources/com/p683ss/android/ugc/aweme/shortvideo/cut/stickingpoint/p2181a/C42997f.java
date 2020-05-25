package com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2181a;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42651j;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C42654l;
import com.p683ss.android.ugc.aweme.shortvideo.cut.C43099t.C43100a;
import com.p683ss.android.ugc.aweme.shortvideo.cut.stickingpoint.p2181a.C42992e.C42993a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.cut.stickingpoint.a.f */
public final class C42997f extends C42654l {
    public C42997f(C42651j jVar) {
        C52711k.m112240b(jVar, "adapter");
        super(jVar);
    }

    /* renamed from: a */
    public final int mo5451a(RecyclerView recyclerView, C1352v vVar) {
        C52711k.m112240b(recyclerView, "recyclerView");
        C52711k.m112240b(vVar, "viewHolder");
        if (!(vVar instanceof C43100a) && !(vVar instanceof C42993a)) {
            return super.mo5451a(recyclerView, vVar);
        }
        return 0;
    }

    /* renamed from: a */
    public final boolean mo5454a(RecyclerView recyclerView, C1352v vVar, C1352v vVar2) {
        C52711k.m112240b(recyclerView, "recyclerView");
        C52711k.m112240b(vVar, "source");
        C52711k.m112240b(vVar2, "target");
        if (!(vVar2 instanceof C43100a) && !(vVar2 instanceof C42993a)) {
            return super.mo5454a(recyclerView, vVar, vVar2);
        }
        return false;
    }
}
