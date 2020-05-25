package com.p683ss.android.ugc.aweme.discover.adapter;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import com.bytedance.common.utility.C9432q;
import com.bytedance.ies.abmock.C10181b;
import com.bytedance.ies.abmock.C10193n;
import com.p683ss.android.ugc.aweme.base.widget.C23751c;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchLoadMoreRemains;
import com.p683ss.android.ugc.aweme.search.p2122b.C41406a;
import com.p683ss.android.ugc.aweme.search.p2122b.C41407b;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.an */
public abstract class C27818an<T> extends C23751c<T> {

    /* renamed from: e */
    public C27797ad f73082e;

    /* renamed from: f */
    public String f73083f;

    /* renamed from: g */
    protected C41407b f73084g;

    C27818an() {
    }

    /* renamed from: a */
    public final int mo51179a(View view) {
        return (int) C9432q.m18687b(view.getContext(), 45.0f);
    }

    /* renamed from: a */
    public void mo48222a(C1352v vVar, int i) {
        super.mo48222a(vVar, i);
    }

    private C27818an(C27797ad adVar, String str) {
        this.f73082e = adVar;
        this.f73083f = str;
    }

    public C27818an(C27797ad adVar, String str, C41406a aVar) {
        this(adVar, str);
        this.f73084g = new C41407b(C10193n.m20607a().mo18200a(SearchLoadMoreRemains.class, "common_search_load_more_remains", C10181b.m20511a().mo18175c().getCommonSearchLoadMoreRemains(), 0), aVar);
    }
}
