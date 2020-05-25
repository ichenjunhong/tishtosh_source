package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.commercialize.model.C26110ae;
import com.p683ss.android.ugc.aweme.discover.model.SearchUser;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28485an;
import com.p683ss.android.ugc.aweme.following.p1770ui.adapter.C32112c;
import com.p683ss.android.ugc.aweme.search.p2122b.C41406a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.bm */
public final class C27881bm extends C27818an<SearchUser> implements C28485an {

    /* renamed from: h */
    public C26110ae f73246h;

    /* renamed from: i */
    private C32112c f73247i;

    /* renamed from: j */
    private C1352v f73248j;

    public C27881bm(C32112c cVar) {
        this.f73247i = cVar;
    }

    /* renamed from: a */
    public final void mo50303a(List<SearchUser> list) {
        if (this.f73084g != null) {
            this.f73084g.mo84080a();
        }
        super.mo50303a(list);
    }

    public final void onAttachedToRecyclerView(RecyclerView recyclerView) {
        super.onAttachedToRecyclerView(recyclerView);
        this.f73248j = mo49206b((ViewGroup) recyclerView, 0);
    }

    /* renamed from: b */
    public final C1352v mo49206b(ViewGroup viewGroup, int i) {
        if (this.f73248j != null) {
            SearchUserViewHolder searchUserViewHolder = (SearchUserViewHolder) this.f73248j;
            this.f73248j = null;
            return searchUserViewHolder;
        }
        SearchUserViewHolder a = SearchUserViewHolder.m66490a(viewGroup, this.f73247i);
        a.mo56270a(this.f73082e);
        a.f72991e = this.f73246h;
        return a;
    }

    /* renamed from: b */
    public final void mo49207b(C1352v vVar, int i) {
        SearchUserViewHolder searchUserViewHolder = (SearchUserViewHolder) vVar;
        searchUserViewHolder.f72991e = this.f73246h;
        searchUserViewHolder.mo56217a((SearchUser) this.f70670n.get(i));
        if (this.f73084g != null) {
            this.f73084g.mo84081a(i, mo48636c());
        }
    }

    public C27881bm(C27797ad adVar, String str, C32112c cVar, C41406a aVar) {
        super(adVar, str, aVar);
        this.f73247i = cVar;
    }
}
