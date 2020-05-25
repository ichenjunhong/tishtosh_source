package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.discover.p1659ui.C28608ca;

/* renamed from: com.ss.android.ugc.aweme.discover.model.SearchHistory */
public class SearchHistory {
    @C17952c(mo34828a = "keyword")
    public String keyword;
    @C17952c(mo34828a = "int")
    public int type;

    public SearchHistory() {
    }

    public int hashCode() {
        if (this.keyword != null) {
            return this.keyword.hashCode();
        }
        return 0;
    }

    public SearchHistory(String str) {
        this.keyword = str;
        this.type = 1;
    }

    public static int toHistoryType(int i) {
        if (i == C28608ca.f75136d) {
            return 16;
        }
        if (i == C28608ca.f75138f) {
            return 17;
        }
        if (i == C28608ca.f75139g) {
            return 18;
        }
        if (i == C28608ca.f75135c) {
            return 19;
        }
        if (i == C28608ca.f75134b) {
            return 20;
        }
        return 0;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        SearchHistory searchHistory = (SearchHistory) obj;
        if (this.keyword != null) {
            return this.keyword.equals(searchHistory.keyword);
        }
        if (searchHistory.keyword == null) {
            return true;
        }
        return false;
    }

    public SearchHistory(String str, int i) {
        this.keyword = str;
        this.type = i;
    }
}
