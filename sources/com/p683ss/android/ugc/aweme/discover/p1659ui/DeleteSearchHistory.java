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

/* renamed from: com.ss.android.ugc.aweme.discover.ui.DeleteSearchHistory */
public final class DeleteSearchHistory extends BaseCommonJavaMethod {
    public DeleteSearchHistory() {
    }

    public DeleteSearchHistory(C10757a aVar) {
        C52711k.m112240b(aVar, "bridge");
        super(aVar);
    }

    /* renamed from: a */
    private static JSONObject m67478a(SearchHistoryManager searchHistoryManager) {
        C52711k.m112240b(searchHistoryManager, "model");
        List<SearchHistory> searchHistory = searchHistoryManager.getSearchHistory();
        C52711k.m112236a((Object) searchHistory, "model.searchHistory");
        JSONArray jSONArray = new JSONArray();
        for (SearchHistory searchHistory2 : searchHistory) {
            C52711k.m112236a((Object) searchHistory2, "v");
            jSONArray.put(searchHistory2.keyword);
        }
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("history_array", jSONArray);
        return jSONObject;
    }

    /* renamed from: a */
    public final void mo49914a(JSONObject jSONObject, C29789a aVar) {
        if (jSONObject == null) {
            try {
                C52711k.m112234a();
            } catch (Exception e) {
                C28668d.m67931a(e, "DeleteSearchHistory");
                aVar.mo60038a(-1, e.getMessage());
                return;
            }
        }
        String string = jSONObject.getString("type");
        SearchHistoryManager inst = SearchHistoryManager.inst();
        if (C52711k.m112239a((Object) string, (Object) "0")) {
            inst.clearSearchHistory();
            C52711k.m112236a((Object) inst, "model");
            aVar.mo60039a((Object) m67478a(inst));
            return;
        }
        inst.deleteSearchHistory(new SearchHistory(jSONObject.getString("keyword"), 0));
        C52711k.m112236a((Object) inst, "model");
        aVar.mo60039a((Object) m67478a(inst));
    }
}
