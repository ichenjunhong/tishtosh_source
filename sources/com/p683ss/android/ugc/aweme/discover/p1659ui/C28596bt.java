package com.p683ss.android.ugc.aweme.discover.p1659ui;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.bt */
public class C28596bt<T> extends C1322a<C1352v> {

    /* renamed from: a */
    protected List<T> f75114a = Collections.emptyList();

    /* renamed from: b */
    public C28597a<T> f75115b;

    /* renamed from: com.ss.android.ugc.aweme.discover.ui.bt$a */
    public interface C28597a<T> {
        /* renamed from: a */
        C1352v mo58280a(ViewGroup viewGroup, int i, T t);

        /* renamed from: a */
        void mo58281a(C1352v vVar, T t);
    }

    public int getItemCount() {
        return this.f75114a.size();
    }

    /* renamed from: a */
    public final void mo58288a(List<T> list) {
        this.f75114a = list;
        notifyDataSetChanged();
    }

    public C28596bt(C28597a<T> aVar) {
        this.f75115b = aVar;
    }

    public void onBindViewHolder(C1352v vVar, int i) {
        this.f75115b.mo58281a(vVar, this.f75114a.get(i));
    }

    public C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        return this.f75115b.mo58280a(viewGroup, i, this.f75114a.get(i));
    }
}
