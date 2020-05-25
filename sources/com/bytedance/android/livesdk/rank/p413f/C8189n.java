package com.bytedance.android.livesdk.rank.p413f;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import com.ss.android.ugc.trill.R;
import p2628d.p2639f.p2641b.C52711k;
import p2663f.p2664a.p2665a.C53035c;

/* renamed from: com.bytedance.android.livesdk.rank.f.n */
public final class C8189n extends C53035c<String, C8190a> {

    /* renamed from: com.bytedance.android.livesdk.rank.f.n$a */
    public static final class C8190a extends C1352v {
        public C8190a(View view) {
            C52711k.m112240b(view, "itemView");
            super(view);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo14349a(LayoutInflater layoutInflater, ViewGroup viewGroup) {
        C52711k.m112240b(layoutInflater, "inflater");
        C52711k.m112240b(viewGroup, "parent");
        View inflate = layoutInflater.inflate(R.layout.ap_, viewGroup, false);
        C52711k.m112236a((Object) inflate, "inflater.inflate(R.layou…ime_count, parent, false)");
        return new C8190a(inflate);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo14350a(C1352v vVar, Object obj) {
        C8190a aVar = (C8190a) vVar;
        String str = (String) obj;
        C52711k.m112240b(aVar, "holder");
        C52711k.m112240b(str, "item");
        C52711k.m112240b(str, "description");
        View view = aVar.itemView;
        C52711k.m112236a((Object) view, "itemView");
        TextView textView = (TextView) view.findViewById(R.id.a4m);
        C52711k.m112236a((Object) textView, "itemView.description");
        textView.setText(str);
    }
}
