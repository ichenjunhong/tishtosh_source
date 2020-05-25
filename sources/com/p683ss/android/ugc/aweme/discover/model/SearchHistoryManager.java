package com.p683ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.alibaba.fastjson.JSONArray;
import com.bytedance.ies.abmock.C10181b;
import com.p683ss.android.ugc.aweme.base.p1417h.C23542f;
import com.p683ss.android.ugc.aweme.base.p1417h.C23543g;
import com.p683ss.android.ugc.aweme.discover.abtest.SearchIntermediateStyleExperiment;
import com.p683ss.android.ugc.aweme.discover.p1642d.C28104l;
import com.p683ss.android.ugc.aweme.search.C41424g;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchHistoryManager */
public class SearchHistoryManager {
    private static SearchHistoryManager sManager;

    /* access modifiers changed from: protected */
    public String getKey() {
        return "recent_history";
    }

    public void clearForAccountChange() {
        if (C41424g.m91240a()) {
            clearSearchHistory();
        }
    }

    public void clearSearchHistory() {
        setSearchHistory(new ArrayList());
    }

    public List<SearchHistory> getSearchHistory() {
        return C23542f.m57720e().mo48706b(getKey(), SearchHistory.class);
    }

    public static SearchHistoryManager inst() {
        if (sManager == null) {
            synchronized (SearchHistoryManager.class) {
                if (sManager == null) {
                    sManager = new SearchHistoryManager();
                }
            }
        }
        return sManager;
    }

    SearchHistoryManager() {
        List searchHistory = getSearchHistory();
        if (!searchHistory.isEmpty()) {
            SearchHistory searchHistory2 = (SearchHistory) searchHistory.get(0);
            if (C41424g.m91240a()) {
                if (searchHistory2.type < 16) {
                    clearSearchHistory();
                }
            } else if (searchHistory2.type >= 16) {
                clearSearchHistory();
            }
        }
    }

    private void setSearchHistory(List<SearchHistory> list) {
        C23543g e = C23542f.m57720e();
        e.mo48701a().putString(getKey(), JSONArray.toJSONString(list)).apply();
        C47718bf.m103289b(new C28104l());
    }

    public void clearSearchHistory(int i) {
        List searchHistory = getSearchHistory();
        Iterator it = searchHistory.iterator();
        while (it.hasNext()) {
            if (((SearchHistory) it.next()).type == i) {
                it.remove();
            }
        }
        setSearchHistory(searchHistory);
    }

    public void deleteSearchHistory(SearchHistory searchHistory) {
        List searchHistory2 = getSearchHistory();
        Iterator it = searchHistory2.iterator();
        while (true) {
            if (!it.hasNext()) {
                break;
            }
            SearchHistory searchHistory3 = (SearchHistory) it.next();
            if (searchHistory3.type == searchHistory.type && TextUtils.equals(searchHistory3.keyword, searchHistory.keyword)) {
                it.remove();
                break;
            }
        }
        setSearchHistory(searchHistory2);
    }

    public List<SearchHistory> getSearchHistoryByType(int i) {
        ArrayList arrayList = new ArrayList();
        for (SearchHistory searchHistory : getSearchHistory()) {
            if (searchHistory.type == i) {
                arrayList.add(searchHistory);
            }
            if (i == 0 && !C41424g.m91241b() && C10181b.m20511a().mo18168a(SearchIntermediateStyleExperiment.class, true, "double_column_search_history_style", 31744, 0) == 0 && arrayList.size() == 10) {
                break;
            }
        }
        return arrayList;
    }

    public void recordSearchHistory(SearchHistory searchHistory) {
        List searchHistory2 = getSearchHistory();
        Iterator it = searchHistory2.iterator();
        HashMap hashMap = new HashMap();
        hashMap.put(Integer.valueOf(searchHistory.type), Integer.valueOf(1));
        while (it.hasNext()) {
            SearchHistory searchHistory3 = (SearchHistory) it.next();
            if (searchHistory3.type != searchHistory.type || !TextUtils.equals(searchHistory3.keyword, searchHistory.keyword)) {
                Integer num = (Integer) hashMap.get(Integer.valueOf(searchHistory3.type));
                if (num == null) {
                    hashMap.put(Integer.valueOf(searchHistory3.type), Integer.valueOf(1));
                } else if (searchHistory3.type == 0 && num.intValue() < 20) {
                    hashMap.put(Integer.valueOf(searchHistory3.type), Integer.valueOf(num.intValue() + 1));
                } else if (num.intValue() < 10) {
                    hashMap.put(Integer.valueOf(searchHistory3.type), Integer.valueOf(num.intValue() + 1));
                } else {
                    it.remove();
                }
            } else {
                it.remove();
            }
        }
        searchHistory2.add(0, searchHistory);
        setSearchHistory(searchHistory2);
    }
}
