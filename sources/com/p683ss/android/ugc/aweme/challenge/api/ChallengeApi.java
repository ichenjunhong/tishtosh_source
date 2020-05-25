package com.p683ss.android.ugc.aweme.challenge.api;

import com.google.gson.p1077b.C17956a;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeAwemeList;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeCreateResponse;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeDetail;
import com.p683ss.android.ugc.aweme.challenge.model.ChallengeList;
import com.p683ss.android.ugc.aweme.challenge.model.LiveChallengeRecommendResponse;
import com.p683ss.android.ugc.aweme.challenge.model.SearchChallengeList;
import com.p683ss.android.ugc.aweme.challenge.model.SearchSugChallengeList;
import com.p683ss.android.ugc.aweme.commercialize.C25945k;
import com.p683ss.android.ugc.aweme.commercialize.utils.C26403au;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import com.p683ss.android.ugc.aweme.utils.C47759cc;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p001a.C0013i;
import p2666g.p2672c.C53073d;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;
import p2666g.p2672c.C53090u;
import p2666g.p2672c.C53093x;

/* renamed from: com.ss.android.ugc.aweme.challenge.api.ChallengeApi */
public final class ChallengeApi {

    /* renamed from: a */
    public static final String f64990a = Api.f61282b;

    /* renamed from: b */
    public static final RealApi f64991b = ((RealApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f64990a).create(RealApi.class));

    /* renamed from: c */
    private static final String f64992c;

    /* renamed from: d */
    private static final String f64993d;

    /* renamed from: e */
    private static final String f64994e;

    /* renamed from: f */
    private static final String f64995f;

    /* renamed from: g */
    private static final String f64996g;

    /* renamed from: h */
    private static final String f64997h;

    /* renamed from: i */
    private static final String f64998i;

    /* renamed from: com.ss.android.ugc.aweme.challenge.api.ChallengeApi$RealApi */
    public interface RealApi {
        @C53075f(mo110603a = "/aweme/v1/challenge/create/")
        C17832m<ChallengeCreateResponse> createChallenge(@C53089t(mo110619a = "source_type") int i, @C53089t(mo110619a = "challenge_name") String str);

        @C53075f(mo110603a = "/aweme/v1/challenge/detail/")
        C0013i<ChallengeDetail> fetchChallengeDetail(@C53089t(mo110619a = "ch_id") String str, @C53089t(mo110619a = "hashtag_name") String str2, @C53089t(mo110619a = "query_type") int i, @C53089t(mo110619a = "click_reason") int i2);

        @C53075f(mo110603a = "/aweme/v1/commerce/challenge/detail/")
        C0013i<ChallengeDetail> fetchCommerceChallengeDetail(@C53089t(mo110619a = "ch_id") String str, @C53089t(mo110619a = "hashtag_name") String str2, @C53089t(mo110619a = "query_type") int i, @C53089t(mo110619a = "click_reason") int i2);

        @C53075f
        C17832m<ChallengeAwemeList> getChallengeAwemeList(@C53093x String str, @C53090u Map<String, String> map);

        @C53075f
        C17832m<ChallengeDetail> getChallengeDetail(@C53093x String str, @C53090u Map<String, String> map);

        @C53075f(mo110603a = "/aweme/v1/recommend/challenge/")
        C17832m<ChallengeList> getChallengeList(@C53090u Map<String, String> map);

        @C53075f(mo110603a = "/aweme/v1/live/challenge/recommend/")
        C17832m<LiveChallengeRecommendResponse> getRecommendLiveChallenge(@C53089t(mo110619a = "room_id") String str);

        @C53075f(mo110603a = "/aweme/v1/challenge/aweme/single/")
        C0013i<Object> loadChallengeMixFeedList(@C53089t(mo110619a = "pull_type") int i, @C53089t(mo110619a = "ch_id") String str, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "hashtag_name") String str2, @C53089t(mo110619a = "query_type") int i3);

        @C53075f(mo110603a = "/aweme/v1/challenge/fresh/aweme/single/")
        C0013i<Object> loadFreshChallengeMixFeedList(@C53089t(mo110619a = "pull_type") int i, @C53089t(mo110619a = "ch_id") String str, @C53089t(mo110619a = "cursor") long j, @C53089t(mo110619a = "count") int i2, @C53089t(mo110619a = "hashtag_name") String str2, @C53089t(mo110619a = "query_type") int i3);

        @C53084o(mo110612a = "/aweme/v1/challenge/search/")
        @C53074e
        C17832m<SearchChallengeList> searchChallenge(@C53073d Map<String, String> map);

        @C53075f(mo110603a = "/aweme/v1/search/challengesug/")
        C17832m<SearchSugChallengeList> searchSugChallenge(@C53089t(mo110619a = "keyword") String str, @C53089t(mo110619a = "source") String str2);
    }

    static {
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f61282b);
        sb.append("/aweme/v1/commit/challenge/");
        f64992c = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Api.f61282b);
        sb2.append("/aweme/v1/challenge/detail/");
        f64993d = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Api.f61282b);
        sb3.append("/aweme/v1/challenge/aweme/");
        f64994e = sb3.toString();
        StringBuilder sb4 = new StringBuilder();
        sb4.append(Api.f61282b);
        sb4.append("/aweme/v1/challenge/fresh/aweme/");
        f64995f = sb4.toString();
        StringBuilder sb5 = new StringBuilder();
        sb5.append(Api.f61282b);
        sb5.append("/aweme/v1/commerce/challenge/detail/");
        f64996g = sb5.toString();
        StringBuilder sb6 = new StringBuilder();
        sb6.append(Api.f61282b);
        sb6.append("/aweme/v1/commerce/challenge/aweme/");
        f64997h = sb6.toString();
        StringBuilder sb7 = new StringBuilder();
        sb7.append(Api.f61282b);
        sb7.append("/aweme/v1/commerce/challenge/fresh/aweme/");
        f64998i = sb7.toString();
    }

    /* renamed from: a */
    private static <T> T m59967a(String str, Type type) {
        try {
            return C47759cc.m103382a().getGson().mo34885a(str, type);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: a */
    public static ChallengeDetail m59966a(String str, int i, boolean z) throws Exception {
        String str2;
        if (C26403au.m63867b(str)) {
            str2 = f64996g;
        } else {
            str2 = f64993d;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("hashtag_name", str);
            hashMap.put("query_type", "1");
        } else {
            hashMap.put("ch_id", str);
            hashMap.put("query_type", "0");
        }
        hashMap.put("click_reason", String.valueOf(i));
        ChallengeDetail challengeDetail = (ChallengeDetail) f64991b.getChallengeDetail(str2, hashMap).get();
        if (!(challengeDetail == null || challengeDetail.challenge == null || challengeDetail.challenge.getCommerceChallengeTask() == null)) {
            C25945k.m62924o().mo52800a("challenge", (List) m59967a(challengeDetail.challenge.getCommerceChallengeTask().getExampleAwemes(), new C17956a<List<Aweme>>() {
            }.f49843c));
        }
        return challengeDetail;
    }

    /* renamed from: a */
    public static C0013i<ChallengeDetail> m59964a(String str, String str2, int i, int i2) {
        return f64991b.fetchCommerceChallengeDetail(str, str2, 0, 0);
    }

    /* renamed from: a */
    public static ChallengeAwemeList m59965a(String str, long j, int i, int i2, boolean z, String str2, String str3) throws Exception {
        String str4;
        boolean b = C26403au.m63867b(str);
        if (i2 == 2) {
            if (b) {
                str4 = f64997h;
            } else {
                str4 = f64994e;
            }
        } else if (b) {
            str4 = f64998i;
        } else {
            str4 = f64995f;
        }
        HashMap hashMap = new HashMap();
        if (z) {
            hashMap.put("hashtag_name", str);
            hashMap.put("query_type", "1");
        } else {
            hashMap.put("ch_id", str);
            hashMap.put("query_type", "0");
        }
        if (str3 != null) {
            hashMap.put("search_id", str3);
        }
        hashMap.put("cursor", String.valueOf(j));
        hashMap.put("count", String.valueOf(i));
        hashMap.put("type", "5");
        hashMap.put("source", String.valueOf(str2));
        hashMap.put("mac_address", null);
        ChallengeAwemeList challengeAwemeList = (ChallengeAwemeList) f64991b.getChallengeAwemeList(str4, hashMap).get();
        C25945k.m62924o().mo52800a("challenge", challengeAwemeList.items);
        return challengeAwemeList;
    }
}
