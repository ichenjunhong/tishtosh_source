package com.p683ss.android.ugc.aweme.miniapp.anchor.p1950a;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.miniapp.anchor.a.a */
public abstract class C36795a<E, T extends C1352v> extends C1322a<T> {

    /* renamed from: a */
    List<E> f94052a = new ArrayList();

    /* renamed from: b */
    public C36810f<E> f94053b;

    public int getItemCount() {
        if (this.f94052a == null) {
            return 0;
        }
        return this.f94052a.size();
    }

    /* renamed from: a */
    public final void mo75988a(List<E> list) {
        this.f94052a.clear();
        this.f94052a.addAll(list);
        notifyDataSetChanged();
    }

    public void onBindViewHolder(T t, int i) {
        t.itemView.setOnClickListener(new C36796b(this, i));
    }
}
