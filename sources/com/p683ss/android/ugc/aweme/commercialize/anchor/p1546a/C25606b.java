package com.p683ss.android.ugc.aweme.commercialize.anchor.p1546a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.feed.model.WikipediaInfo;
import com.p683ss.android.ugc.aweme.utils.C47842ed;
import com.ss.android.ugc.trill.R;
import java.util.List;
import java.util.Map;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.a.b */
public final class C25606b extends C26835b<List<? extends WikipediaInfo>> {

    /* renamed from: a */
    public final C52671b<WikipediaInfo, C52860x> f67784a;

    /* renamed from: b */
    private final Map<String, String> f67785b;

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        C52711k.m112240b(viewGroup, "parent");
        View inflate = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.bjg, viewGroup, false);
        C52711k.m112236a((Object) inflate, "view");
        return new C25608d(inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        C52711k.m112240b((List) obj, "items");
        return true;
    }

    public C25606b(Map<String, String> map, C52671b<? super WikipediaInfo, C52860x> bVar) {
        C52711k.m112240b(map, "params");
        C52711k.m112240b(bVar, "clickItemAction");
        this.f67785b = map;
        this.f67784a = bVar;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        List list2 = (List) obj;
        C52711k.m112240b(list2, "items");
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        if (vVar instanceof C25608d) {
            C25608d dVar = (C25608d) vVar;
            WikipediaInfo wikipediaInfo = (WikipediaInfo) list2.get(i);
            Map<String, String> map = this.f67785b;
            C52671b<WikipediaInfo, C52860x> bVar = this.f67784a;
            C52711k.m112240b(wikipediaInfo, "info");
            C52711k.m112240b(map, "params");
            C52711k.m112240b(bVar, "clickItemAction");
            dVar.itemView.setOnClickListener(new C25609a(dVar, bVar, wikipediaInfo, map));
            View view = dVar.itemView;
            C52711k.m112236a((Object) view, "itemView");
            if (C47842ed.m103485a(view.getContext())) {
                dVar.f67789b.setRotationY(180.0f);
            }
            dVar.f67788a.setText(wikipediaInfo.getKeyword());
        }
    }
}
