package com.p683ss.android.ugc.aweme.discover.p1635a;

import android.support.p043v7.widget.RecyclerView.C1322a;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26836c;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.a.f */
public class C27728f<T> extends C1322a<C1352v> {

    /* renamed from: a */
    private final C26836c<List<T>> f72771a = new C26836c<>();

    /* renamed from: k */
    public final List<T> f72772k = new ArrayList();

    public int getItemCount() {
        return this.f72772k.size();
    }

    public int getItemViewType(int i) {
        return this.f72771a.mo54760a(this.f72772k, i);
    }

    public boolean onFailedToRecycleView(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        return this.f72771a.mo54769b(vVar);
    }

    public void onViewAttachedToWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        this.f72771a.mo54770c(vVar);
    }

    public void onViewDetachedFromWindow(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        this.f72771a.mo54771d(vVar);
    }

    public void onViewRecycled(C1352v vVar) {
        C52711k.m112240b(vVar, "holder");
        this.f72771a.mo54764a(vVar);
    }

    /* renamed from: a */
    public final C27728f<?> mo56159a(C26835b<List<T>> bVar) {
        C52711k.m112240b(bVar, "delegate");
        this.f72771a.mo54763a(bVar);
        return this;
    }

    /* renamed from: a */
    public final C27728f<?> mo56158a(int i, C26835b<List<T>> bVar) {
        C52711k.m112240b(bVar, "delegate");
        this.f72771a.mo54762a(i, false, bVar);
        return this;
    }

    public void onBindViewHolder(C1352v vVar, int i) {
        C52711k.m112240b(vVar, "holder");
        this.f72771a.mo54766a(this.f72772k, i, vVar);
    }

    public C1352v onCreateViewHolder(ViewGroup viewGroup, int i) {
        C52711k.m112240b(viewGroup, "parent");
        C1352v a = this.f72771a.mo54761a(viewGroup, i);
        C52711k.m112236a((Object) a, "mDelegateManager.onCreat…wHolder(parent, viewType)");
        return a;
    }

    public void onBindViewHolder(C1352v vVar, int i, List<Object> list) {
        C52711k.m112240b(vVar, "holder");
        C52711k.m112240b(list, "payloads");
        this.f72771a.mo54767a(this.f72772k, i, vVar, list);
    }
}
