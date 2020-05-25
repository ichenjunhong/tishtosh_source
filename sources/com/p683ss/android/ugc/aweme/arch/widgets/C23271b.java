package com.p683ss.android.ugc.aweme.arch.widgets;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.arch.widgets.base.C23279d;
import com.p683ss.android.ugc.aweme.arch.widgets.base.DataCenter;
import com.p683ss.android.ugc.aweme.arch.widgets.base.Widget;
import com.p683ss.android.ugc.aweme.common.p1589a.C26840g;
import java.util.ArrayList;

/* renamed from: com.ss.android.ugc.aweme.arch.widgets.b */
public abstract class C23271b extends C26840g {

    /* renamed from: a */
    protected C23279d f62220a;

    /* renamed from: b */
    protected DataCenter f62221b;

    /* renamed from: c */
    protected RecyclerView f62222c;

    /* renamed from: d */
    private ArrayList<ListItemWidget> f62223d = new ArrayList<>();

    /* renamed from: a */
    public C1352v mo48221a(ViewGroup viewGroup, int i) {
        return null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b */
    public abstract ListItemWidget mo48223b(int i);

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f62222c = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f62222c = null;
    }

    /* access modifiers changed from: protected */
    /* renamed from: b_ */
    public final ListItemWidget mo48224b_(int i) {
        if (i < this.f62223d.size()) {
            return (ListItemWidget) this.f62223d.get(i);
        }
        ListItemWidget b = mo48223b(i);
        this.f62220a.mo48253a((Widget) b);
        this.f62223d.add(b);
        return b;
    }

    public C23271b(C23279d dVar, DataCenter dataCenter) {
        this.f62220a = dVar;
        this.f62221b = dataCenter;
    }

    /* renamed from: a */
    public final void mo48222a(C1352v vVar, int i) {
        if (vVar instanceof C23270a) {
            C23270a aVar = (C23270a) vVar;
            ListItemWidget listItemWidget = aVar.f62219a;
            if (listItemWidget != null) {
                listItemWidget.f62218a = null;
            }
            aVar.f62219a = mo48224b_(i);
            aVar.f62219a.mo48220a(aVar);
        }
    }
}
