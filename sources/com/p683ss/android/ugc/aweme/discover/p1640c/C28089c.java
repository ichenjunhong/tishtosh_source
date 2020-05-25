package com.p683ss.android.ugc.aweme.discover.p1640c;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import com.bytedance.common.utility.p522b.C9376b;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder;
import com.p683ss.android.ugc.aweme.discover.adapter.HotVideoViewHolder.C27757a;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p683ss.android.ugc.aweme.discover.model.HotVideoItem;
import com.ss.android.ugc.trill.R;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.c.c */
public final class C28089c extends C26835b<List<DiscoverItemData>> {
    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        return new HotVideoViewHolder(LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.b9p, viewGroup, false));
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        if (((DiscoverItemData) ((List) obj).get(i)).getType() == 3) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        HotVideoViewHolder hotVideoViewHolder = (HotVideoViewHolder) vVar;
        List<HotVideoItem> hotSearchVideos = ((DiscoverItemData) ((List) obj).get(i)).getHotSearchVideos();
        if (!C9376b.m18558a((Collection<T>) hotSearchVideos) && hotVideoViewHolder.f72872b != hotSearchVideos) {
            hotVideoViewHolder.mo56190b();
            hotVideoViewHolder.f72872b = hotSearchVideos;
            C27757a aVar = hotVideoViewHolder.f72871a;
            List<HotVideoItem> list2 = hotVideoViewHolder.f72872b;
            if (!C9376b.m18558a((Collection<T>) list2)) {
                if (aVar.f72879a == null) {
                    aVar.f72879a = new ArrayList();
                }
                aVar.f72879a.clear();
                aVar.f72879a.addAll(list2);
            }
            hotVideoViewHolder.f72871a.notifyDataSetChanged();
            hotVideoViewHolder.f72875e.clear();
            for (int i2 = 0; i2 < hotVideoViewHolder.f72872b.size(); i2++) {
                hotVideoViewHolder.f72875e.add(((HotVideoItem) hotVideoViewHolder.f72872b.get(i2)).getAweme());
            }
        }
    }
}
