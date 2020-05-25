package com.p683ss.android.ugc.aweme.shortvideo.p2265y;

import com.google.p1057b.p1058a.C17410f;
import com.p683ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.p683ss.android.ugc.aweme.common.LogPbBean;
import com.p683ss.android.ugc.aweme.shortvideo.model.AVSearchChallengeList;
import com.p683ss.android.ugc.aweme.shortvideo.model.RecommendWordMob;
import com.p683ss.android.ugc.aweme.shortvideo.p2265y.C45631g.C45632a;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.y.f */
public final class C45630f implements C17410f<SearchSugChallengeList, AVSearchChallengeList> {
    /* renamed from: a */
    public final /* bridge */ /* synthetic */ Object mo33734a(Object obj) {
        return m99368a((SearchSugChallengeList) obj);
    }

    /* renamed from: a */
    public static AVSearchChallengeList m99368a(SearchSugChallengeList searchSugChallengeList) {
        String str;
        String str2;
        String str3;
        String str4 = null;
        if (searchSugChallengeList == null) {
            return null;
        }
        AVSearchChallengeList aVSearchChallengeList = new AVSearchChallengeList();
        aVSearchChallengeList.items = C45632a.m99371a(searchSugChallengeList.items);
        aVSearchChallengeList.keyword = searchSugChallengeList.keyword;
        LogPbBean logPbBean = new LogPbBean();
        LogPbBean logPbBean2 = searchSugChallengeList.logPb;
        if (logPbBean2 != null) {
            str = logPbBean2.getImprId();
        } else {
            str = null;
        }
        logPbBean.setImprId(str);
        aVSearchChallengeList.logPb = logPbBean;
        aVSearchChallengeList.isMatch = searchSugChallengeList.isMatch;
        RecommendWordMob recommendWordMob = new RecommendWordMob();
        com.p683ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob2 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob2 != null) {
            str2 = recommendWordMob2.getInfo();
        } else {
            str2 = null;
        }
        recommendWordMob.setInfo(str2);
        com.p683ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob3 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob3 != null) {
            str3 = recommendWordMob3.getWordsSource();
        } else {
            str3 = null;
        }
        recommendWordMob.setWordsSource(str3);
        com.p683ss.android.ugc.aweme.discover.model.suggest.RecommendWordMob recommendWordMob4 = searchSugChallengeList.recommendWordMob;
        if (recommendWordMob4 != null) {
            str4 = recommendWordMob4.getQueryId();
        }
        recommendWordMob.setQueryId(str4);
        aVSearchChallengeList.recommendWordMob = recommendWordMob;
        return aVSearchChallengeList;
    }
}
