package com.p683ss.android.ugc.aweme.search;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.C27991b;
import com.p683ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28482ak;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.search.SearchLegacyServiceImpl */
public class SearchLegacyServiceImpl implements ISearchLegacyService {
    public static ISearchLegacyService createISearchLegacyServicebyMonsterPlugin() {
        Object a = C27991b.m66756a(ISearchLegacyService.class);
        if (a != null) {
            return (ISearchLegacyService) a;
        }
        return new SearchLegacyServiceImpl();
    }

    public boolean isHotSearchImageViewHolder(C1352v vVar) {
        return vVar instanceof HotSearchImageViewHolder;
    }

    public void bindHotSearchImageViewHolder(C1352v vVar, List<HotSearchItem> list) {
        if (vVar instanceof HotSearchImageViewHolder) {
            ((HotSearchImageViewHolder) vVar).mo56184a(list);
        }
    }

    public C1352v createHotSearchImageViewHolder(ViewGroup viewGroup, String str, C28482ak akVar, C0184k kVar) {
        return HotSearchImageViewHolder.m66432a(viewGroup, str, akVar, kVar);
    }
}
