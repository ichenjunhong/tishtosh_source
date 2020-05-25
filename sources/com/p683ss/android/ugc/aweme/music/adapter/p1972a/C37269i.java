package com.p683ss.android.ugc.aweme.music.adapter.p1972a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewGroup.LayoutParams;
import com.bytedance.common.utility.C9432q;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37280g;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37281h;
import com.p683ss.android.ugc.aweme.music.adapter.p1973b.C37283j;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.adapter.a.i */
public final class C37269i extends C26835b<List<C37283j>> {

    /* renamed from: a */
    private final float f95158a = 16.0f;

    public C37269i(float f) {
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View view = new View(viewGroup.getContext());
        view.setLayoutParams(new LayoutParams(-1, (int) C9432q.m18687b(viewGroup.getContext(), this.f95158a)));
        return new C37281h(view);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        List list = (List) obj;
        C52711k.m112240b(list, "items");
        int size = list.size();
        if (i >= 0 && size > i) {
            return list.get(i) instanceof C37280g;
        }
        return false;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        C52711k.m112240b((List) obj, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
    }
}
