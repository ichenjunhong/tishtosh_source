package com.bytedance.jedi.ext.adapter.p747b;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.p747b.C11949e;
import com.bytedance.jedi.ext.adapter.p747b.C11954g;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.jedi.ext.adapter.b.d */
public abstract class C11948d<VH extends C11949e<?>, M extends C11954g<VH>> extends C1322a<VH> implements C11946b<VH, M> {
    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract Object mo22687a(int i, boolean z);

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo22688a(C11959h<VH> hVar);

    public final int getItemViewType(int i) {
        return mo22686b().mo22701b(i);
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        mo22686b().mo22699a(recyclerView);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        mo22686b().mo22702b(recyclerView);
    }

    public /* synthetic */ void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b((C11949e) vVar, "holder");
    }

    public /* synthetic */ C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        return mo22686b().mo22695a(viewGroup, i);
    }

    public /* synthetic */ void onBindViewHolder(C1352v vVar, int i, List list) {
        C11949e eVar = (C11949e) vVar;
        C52711k.m112240b(eVar, "holder");
        C52711k.m112240b(list, "payloads");
        C11954g.m24330a(eVar, mo22687a(i, true), i, list);
    }
}
