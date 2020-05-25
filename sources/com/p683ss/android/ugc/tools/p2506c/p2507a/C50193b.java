package com.p683ss.android.ugc.tools.p2506c.p2507a;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1324c;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.tools.c.a.b */
public abstract class C50193b extends C1322a<C1352v> {

    /* renamed from: a */
    private final List<Integer> f125746a = new ArrayList();

    /* renamed from: b */
    public final C1322a<C1352v> f125747b;

    /* renamed from: c */
    private final Set<Integer> f125748c = new LinkedHashSet();

    /* renamed from: a */
    public abstract C1352v mo64581a(ViewGroup viewGroup);

    /* renamed from: a */
    public abstract void mo64582a(C1352v vVar);

    public int getItemCount() {
        return mo97978b(this.f125747b.getItemCount() - 1) + 1;
    }

    public int getItemViewType(int i) {
        if (this.f125748c.contains(Integer.valueOf(i))) {
            return -2147483647;
        }
        return this.f125747b.getItemViewType(mo97976a(i));
    }

    public C50193b(C1322a<C1352v> aVar) {
        C52711k.m112240b(aVar, "delegate");
        this.f125747b = aVar;
        this.f125747b.registerAdapterDataObserver(new C1324c(this) {

            /* renamed from: a */
            final /* synthetic */ C50193b f125749a;

            /* renamed from: a */
            public final void mo4984a() {
                this.f125749a.notifyDataSetChanged();
            }

            {
                this.f125749a = r1;
            }

            /* renamed from: b */
            public final void mo4988b(int i, int i2) {
                this.f125749a.notifyDataSetChanged();
            }

            /* renamed from: c */
            public final void mo4989c(int i, int i2) {
                this.f125749a.notifyDataSetChanged();
            }

            /* renamed from: a */
            public final void mo4985a(int i, int i2) {
                int b = this.f125749a.mo97978b(i);
                this.f125749a.notifyItemRangeChanged(b, this.f125749a.mo97978b(i + i2) - b);
            }

            /* renamed from: a */
            public final void mo4986a(int i, int i2, int i3) {
                this.f125749a.notifyDataSetChanged();
            }

            /* renamed from: a */
            public final void mo4987a(int i, int i2, Object obj) {
                int b = this.f125749a.mo97978b(i);
                this.f125749a.notifyItemRangeChanged(b, this.f125749a.mo97978b(i + i2) - b, obj);
            }
        });
    }

    /* renamed from: a */
    public final int mo97976a(int i) {
        boolean z;
        Iterable iterable = this.f125748c;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((Number) next).intValue() < i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return i - ((List) arrayList).size();
    }

    /* renamed from: b */
    public final int mo97978b(int i) {
        boolean z;
        Iterable iterable = this.f125746a;
        Collection arrayList = new ArrayList();
        for (Object next : iterable) {
            if (((Number) next).intValue() < i) {
                z = true;
            } else {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        return i + ((List) arrayList).size();
    }

    /* renamed from: a */
    public final void mo97977a(List<Integer> list) {
        C52711k.m112240b(list, "dividers");
        this.f125746a.clear();
        List<Integer> list2 = this.f125746a;
        Iterable iterable = list;
        Collection arrayList = new ArrayList();
        Iterator it = iterable.iterator();
        while (true) {
            boolean z = true;
            if (!it.hasNext()) {
                break;
            }
            Object next = it.next();
            if (((Number) next).intValue() < 0) {
                z = false;
            }
            if (z) {
                arrayList.add(next);
            }
        }
        list2.addAll(C52575l.m112143g((Iterable<? extends T>) (List) arrayList));
        C52575l.m112106c(this.f125746a);
        this.f125748c.clear();
        for (Number intValue : this.f125746a) {
            int intValue2 = intValue.intValue();
            Set<Integer> set = this.f125748c;
            set.add(Integer.valueOf(intValue2 + set.size() + 1));
        }
        notifyDataSetChanged();
    }

    public void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        if (getItemViewType(i) == -2147483647) {
            mo64582a(vVar);
        } else {
            this.f125747b.onBindViewHolder(vVar, mo97976a(i));
        }
    }

    public C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        if (-2147483647 == i) {
            return mo64581a(viewGroup);
        }
        C1352v onCreateViewHolder = this.f125747b.onCreateViewHolder(viewGroup, i);
        C52711k.m112236a((Object) onCreateViewHolder, "delegate.onCreateViewHolder(parent, viewType)");
        return onCreateViewHolder;
    }

    public void onBindViewHolder(C1352v vVar, int i, List<Object> list) {
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        if (getItemViewType(i) == -2147483647) {
            onBindViewHolder(vVar, i);
        } else {
            this.f125747b.onBindViewHolder(vVar, mo97976a(i), list);
        }
    }
}
