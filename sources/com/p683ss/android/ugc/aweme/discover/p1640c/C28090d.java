package com.p683ss.android.ugc.aweme.discover.p1640c;

import android.arch.lifecycle.C0184k;
import android.content.Context;
import android.support.p043v7.widget.RecyclerView.C1352v;
import android.text.TextUtils;
import android.view.ViewGroup;
import com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26013f;
import com.p683ss.android.ugc.aweme.common.p1589a.C26835b;
import com.p683ss.android.ugc.aweme.discover.adapter.HotSearchImageViewHolder;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverItemData;
import com.p683ss.android.ugc.aweme.discover.model.HotSearchItem;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28482ak;
import com.p683ss.android.ugc.aweme.search.C41431k;
import com.p683ss.android.ugc.aweme.search.model.C41437b;
import com.p683ss.android.ugc.aweme.search.model.C41440e;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.c.d */
public final class C28090d extends C26835b<List<DiscoverItemData>> implements C28482ak {

    /* renamed from: a */
    private Context f73775a;

    /* renamed from: b */
    private C0184k f73776b;

    public C28090d(C0184k kVar) {
        this.f73776b = kVar;
    }

    /* renamed from: a */
    public final C1352v mo51021a(ViewGroup viewGroup) {
        this.f73775a = viewGroup.getContext();
        return HotSearchImageViewHolder.m66432a(viewGroup, "hot_search_section_discovery", this, this.f73776b);
    }

    /* renamed from: a */
    public final /* synthetic */ boolean mo51023a(Object obj, int i) {
        if (((DiscoverItemData) ((List) obj).get(i)).getType() == 1) {
            return true;
        }
        return false;
    }

    /* renamed from: a */
    public final void mo56499a(HotSearchItem hotSearchItem, int i, String str) {
        String str2;
        if (this.f73775a != null && !TextUtils.isEmpty(hotSearchItem.getWord())) {
            C41440e wordType = new C41440e().setKeyword(hotSearchItem.getWord()).setWordType(hotSearchItem.getHotSpotWordType());
            if (hotSearchItem.getAdData() != null) {
                str2 = hotSearchItem.getAdData().getItemIdList();
            } else {
                str2 = "";
            }
            C41440e openNewSearchContainer = wordType.setItemIdList(str2).setRealSearchWord(hotSearchItem.getRealSearchWord()).setSearchFrom(2).setEnterFrom(str).setAd(hotSearchItem.isAd()).setSource("hot_search_section").setOpenNewSearchContainer(false);
            C41431k kVar = C41431k.f105004a;
            C41437b bVar = new C41437b(this.f73775a, openNewSearchContainer, null, null, null, null);
            kVar.launchSearchPage(bVar);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo51022a(Object obj, int i, C1352v vVar, List list) {
        List list2 = ((DiscoverItemData) ((List) obj).get(i)).getHotSearchResponse().getData().getList();
        if (vVar instanceof HotSearchImageViewHolder) {
            if (list.size() <= 0 || !(list.get(0) instanceof C26013f)) {
                ((HotSearchImageViewHolder) vVar).mo56184a(list2);
            } else {
                ((HotSearchImageViewHolder) vVar).mo56186c();
            }
        }
    }
}
