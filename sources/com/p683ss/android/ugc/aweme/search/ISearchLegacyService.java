package com.p683ss.android.ugc.aweme.search;

import android.arch.lifecycle.C0184k;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28482ak;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.search.ISearchLegacyService */
public interface ISearchLegacyService {
    void bindHotSearchImageViewHolder(C1352v vVar, List<HotSearchItem> list);

    C1352v createHotSearchImageViewHolder(ViewGroup viewGroup, String str, C28482ak akVar, C0184k kVar);

    boolean isHotSearchImageViewHolder(C1352v vVar);
}
