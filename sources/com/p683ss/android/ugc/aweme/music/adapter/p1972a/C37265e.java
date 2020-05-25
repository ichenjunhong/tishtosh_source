package com.p683ss.android.ugc.aweme.music.adapter.p1972a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.music.adapter.C37260a;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37282i;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37283j;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.e */
public final class C37265e extends C26835b<List<C37283j>> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        return new C37260a(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.xb, viewGroup, false));
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        return ((List) obj).get(i) instanceof C37282i;
    }
}
