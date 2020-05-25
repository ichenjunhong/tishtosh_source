package com.p683ss.android.ugc.aweme.discover.adapter;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28376d;
import com.p683ss.android.ugc.aweme.discover.mob.p1658a.C28379g;
import com.p683ss.android.ugc.aweme.discover.model.SearchSugEntity;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28106n;
import com.p683ss.android.ugc.aweme.utils.C47718bf;

/* renamed from: com.ss.android.ugc.aweme.discover.adapter.bk */
final /* synthetic */ class C27878bk implements OnClickListener {

    /* renamed from: a */
    private final SearchSugViewHolder f73242a;

    C27878bk(SearchSugViewHolder searchSugViewHolder) {
        this.f73242a = searchSugViewHolder;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        SearchSugViewHolder searchSugViewHolder = this.f73242a;
        if (searchSugViewHolder.f72980c != null) {
            if (searchSugViewHolder.f72982e != null) {
                searchSugViewHolder.f72982e.mo56834a("sug", Integer.valueOf(searchSugViewHolder.f72981d), "complete", searchSugViewHolder.f72980c);
            }
            C47718bf.m103288a(new C28106n(searchSugViewHolder.f72980c.content));
            int i = searchSugViewHolder.f72981d;
            SearchSugEntity searchSugEntity = searchSugViewHolder.f72980c;
            ((C28379g) new C28376d().mo56802a(searchSugEntity.mWord).mo56804a("sug").mo56803a(Integer.valueOf(i)).mo56805b(searchSugEntity.content).mo56809f("normal_sug").mo48070a(searchSugEntity.extraParam)).mo48076e();
        }
    }
}
