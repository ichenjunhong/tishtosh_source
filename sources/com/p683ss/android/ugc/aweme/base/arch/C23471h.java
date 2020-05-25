package com.p683ss.android.ugc.aweme.base.arch;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.ViewGroup;
import com.bytedance.jedi.ext.adapter.p747b.C11946b;
import com.bytedance.jedi.ext.adapter.p747b.C11949e;
import com.bytedance.jedi.ext.adapter.p747b.C11954g;
import com.bytedance.jedi.ext.adapter.p747b.C11959h;
import com.p683ss.android.ugc.aweme.common.p1589a.C26844j;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.base.arch.h */
public abstract class C23471h<VH extends C11949e<?>, M extends C11954g<VH>> extends C26844j implements C11946b<VH, M> {

    /* renamed from: b */
    public static final C23472a f62540b = new C23472a(null);

    /* renamed from: a */
    private View f62541a;

    /* renamed from: com.ss.android.ugc.aweme.base.arch.h$a */
    public static final class C23472a {
        private C23472a() {
        }

        public /* synthetic */ C23472a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public abstract void mo48639a(C11959h<VH> hVar);

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract Object mo48635b(int i, boolean z);

    /* renamed from: e */
    public int mo48643e() {
        if (this.f62541a == null) {
            return 0;
        }
        return 1;
    }

    /* renamed from: a */
    public int mo48641a(int i) {
        if (i < mo48643e()) {
            return Integer.MAX_VALUE;
        }
        return 0;
    }

    /* renamed from: b_ */
    public void mo48642b_(View view) {
        if (view != null) {
            this.f62541a = view;
            notifyItemInserted(0);
        }
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onAttachedToRecyclerView(recyclerView);
        mo22686b().mo22699a(recyclerView);
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        C52711k.m112240b(recyclerView, "recyclerView");
        super.onDetachedFromRecyclerView(recyclerView);
        mo22686b().mo22702b(recyclerView);
    }

    /* renamed from: a */
    public final /* synthetic */ C1352v mo48221a(ViewGroup viewGroup, int i) {
        C11949e eVar;
        C52711k.m112240b(viewGroup, "parent");
        if (i == Integer.MAX_VALUE) {
            View view = this.f62541a;
            if (view == null) {
                C52711k.m112234a();
            }
            eVar = new C23469f(view);
        } else {
            eVar = mo22686b().mo22695a(viewGroup, i);
        }
        return eVar;
    }

    public void onBindViewHolder(C1352v vVar, int i, List<Object> list) {
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        if (getItemViewType(i) == Integer.MIN_VALUE) {
            super.onBindViewHolder(vVar, i, list);
            return;
        }
        if (getItemViewType(i) != Integer.MAX_VALUE) {
            C11954g.m24330a((C11949e) vVar, mo48635b(i, true), i - mo48643e(), list);
        }
    }
}
