package com.p683ss.android.ugc.aweme.p1807im.sdk.chat;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1322a;
import com.bytedance.common.utility.p522b.C9376b;
import com.bytedance.p702im.core.p706c.C11207p;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.C33351aa.C33352a;
import com.p683ss.android.ugc.aweme.p1807im.sdk.chat.viewholder.C33805c;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.a */
public abstract class C33349a extends C1322a<C33805c> implements C33352a {

    /* renamed from: a */
    protected RecyclerView f86482a;

    /* renamed from: b */
    public List<C11207p> f86483b;

    /* renamed from: c */
    private Set<C33683o> f86484c = new HashSet();

    C33349a() {
    }

    /* renamed from: a */
    public void mo70692a() {
        for (C33683o a : this.f86484c) {
            a.mo70684a(this.f86483b);
        }
    }

    /* renamed from: a */
    public void mo70693a(C33683o oVar) {
        this.f86484c.add(oVar);
    }

    /* renamed from: b */
    public void onViewDetachedFromWindow(C33805c cVar) {
        super.onViewDetachedFromWindow(cVar);
        cVar.mo71850e();
    }

    public void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f86482a = recyclerView;
    }

    public void onDetachedFromRecyclerView(RecyclerView recyclerView) {
        super.onDetachedFromRecyclerView(recyclerView);
        this.f86482a = null;
    }

    /* renamed from: a */
    public void onViewAttachedToWindow(C33805c cVar) {
        super.onViewAttachedToWindow(cVar);
        cVar.mo71849d();
        C11207p pVar = cVar.f87712n;
        if (pVar != null && !C9376b.m18558a((Collection<T>) this.f86483b) && pVar.equals(this.f86483b.get(0))) {
            for (C33683o a : this.f86484c) {
                a.mo70683a();
            }
        }
    }

    /* renamed from: a */
    public void mo70695a(Object obj, int i) {
        for (C33683o a : this.f86484c) {
            a.mo70684a(this.f86483b);
        }
    }
}
