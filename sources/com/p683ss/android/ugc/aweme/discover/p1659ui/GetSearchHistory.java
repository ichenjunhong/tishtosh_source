package com.p683ss.android.ugc.aweme.discover.p1659ui;

import com.bytedance.ies.p675g.p676a.C10757a;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistoryManager;
import com.p683ss.android.ugc.aweme.discover.p1659ui.search.C28668d;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod;
import com.p683ss.android.ugc.aweme.p1706fe.base.BaseCommonJavaMethod.C29789a;
import java.util.List;
import org.json.JSONArray;
import org.json.JSONObject;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.GetSearchHistory */
public final class GetSearchHistory extends BaseCommonJavaMethod {
    public GetSearchHistory() {
    }

    public GetSearchHistory(C10757a aVar) {
        C52711k.m112240b(aVar, "bridge");
        super(aVar);
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        try {
            SearchHistoryManager inst = SearchHistoryManager.inst();
            C52711k.m112236a((Object) inst, "model");
            List<SearchHistory> searchHistory = inst.getSearchHistory();
            C52711k.m112236a((Object) searchHistory, "model.searchHistory");
            JSONArray jSONArray = new JSONArray();
            for (SearchHistory searchHistory2 : searchHistory) {
                C52711k.m112236a((Object) searchHistory2, "v");
                jSONArray.put(searchHistory2.keyword);
            }
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("history_array", jSONArray);
            aVar.mo60039a((Object) jSONObject2);
        } catch (Exception e) {
            C28668d.m67931a(e, "GetSearchHistory");
            aVar.mo60038a(0, e.getMessage());
        }
    }
}
