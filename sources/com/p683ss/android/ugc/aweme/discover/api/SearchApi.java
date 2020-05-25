package com.p683ss.android.ugc.aweme.discover.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.discover.mixfeed.C28334m;
import com.p683ss.android.ugc.aweme.discover.model.SearchChallengeList;
import com.p683ss.android.ugc.aweme.discover.model.SearchCommodityList;
import com.p683ss.android.ugc.aweme.discover.model.SearchLiveList;
import com.p683ss.android.ugc.aweme.discover.model.SearchMix;
import com.p683ss.android.ugc.aweme.discover.model.SearchMusicList;
import com.p683ss.android.ugc.aweme.discover.model.SearchPoiList;
import com.p683ss.android.ugc.aweme.discover.model.SearchUserList;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofit;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.ExecutionException;
import p001a.C0013i;
import p064c.p065a.C2201v;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53084o;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApi */
public final class SearchApi {

    /* renamed from: a */
    public static final String f73699a = Api.f61282b;

    /* renamed from: b */
    static final IRetrofit f73700b = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f73699a);

    /* renamed from: c */
    static final IRetrofit f73701c = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit("https://search.amemv.com");

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchApi$RealApi */
    interface RealApi {
        @C53084o(mo110612a = "/aweme/v1/music/rank/")
        @C53074e
        C17832m<SearchMusicList> rankMusicList(@C53072c(mo110600a = "cursor") long j, @C53072c(mo110600a = "count") int i);

        @C53084o(mo110612a = "/aweme/v1/recommend/challenge/")
        @C53074e
        C17832m<SearchChallengeList> recommendChallengeList(@C53072c(mo110600a = "max_cursor") long j, @C53072c(mo110600a = "count") int i);

        @C53084o(mo110612a = "/aweme/v1/challenge/search/")
        @C53074e
        C17832m<SearchChallengeList> searchChallengeList(@C53072c(mo110600a = "cursor") long j, @C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "hot_search") int i2, @C53072c(mo110600a = "is_pull_refresh") int i3, @C53072c(mo110600a = "source") String str2, @C53072c(mo110600a = "search_source") String str3, @C53072c(mo110600a = "search_id") String str4, @C53072c(mo110600a = "query_correct_type") int i4);

        @C53084o(mo110612a = "/aweme/v2/shop/search/vertical/")
        @C53074e
        C0013i<SearchCommodityList> searchCommodityList(@C53072c(mo110600a = "query") String str, @C53072c(mo110600a = "type") int i, @C53072c(mo110600a = "sort") int i2, @C53072c(mo110600a = "cursor") int i3, @C53072c(mo110600a = "count") int i4, @C53072c(mo110600a = "is_pull_refresh") int i5, @C53072c(mo110600a = "hot_search") int i6, @C53072c(mo110600a = "search_id") String str2, @C53072c(mo110600a = "query_correct_type") int i7);

        @C53084o(mo110612a = "/aweme/v1/search/item/")
        @C53074e
        C17832m<SearchMix> searchFeedList(@C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "offset") long j, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "source") String str2, @C53072c(mo110600a = "is_pull_refresh") int i2, @C53072c(mo110600a = "hot_search") int i3, @C53072c(mo110600a = "search_id") String str3, @C53072c(mo110600a = "query_correct_type") int i4);

        @C53084o(mo110612a = "/aweme/v1/live/search/")
        @C53074e
        C17832m<SearchLiveList> searchLiveList(@C53072c(mo110600a = "offset") long j, @C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "search_source") String str2);

        @C53084o(mo110612a = "/aweme/v1/general/search/single/")
        @C53074e
        C2201v<C28334m> searchMTMixFeedList(@C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "offset") int i, @C53072c(mo110600a = "count") int i2, @C53072c(mo110600a = "is_pull_refresh") int i3, @C53072c(mo110600a = "search_source") String str2, @C53072c(mo110600a = "hot_search") int i4, @C53072c(mo110600a = "latitude") double d, @C53072c(mo110600a = "longitude") double d2, @C53072c(mo110600a = "search_id") String str3, @C53072c(mo110600a = "query_correct_type") int i5);

        @C53084o(mo110612a = "/aweme/v1/general/search/single/")
        @C53074e
        C0013i<C28334m> searchMixFeedList(@C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "offset") int i, @C53072c(mo110600a = "count") int i2, @C53072c(mo110600a = "is_pull_refresh") int i3, @C53072c(mo110600a = "search_source") String str2, @C53072c(mo110600a = "hot_search") int i4, @C53072c(mo110600a = "latitude") double d, @C53072c(mo110600a = "longitude") double d2, @C53072c(mo110600a = "search_id") String str3, @C53072c(mo110600a = "query_correct_type") int i5, @C53072c(mo110600a = "mac_address") String str4);

        @C53084o(mo110612a = "/aweme/v1/general/search/")
        @C53074e
        C17832m<SearchMix> searchMixList(@C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "offset") long j, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "is_pull_refresh") int i2, @C53072c(mo110600a = "hot_search") int i3, @C53072c(mo110600a = "latitude") double d, @C53072c(mo110600a = "longitude") double d2, @C53072c(mo110600a = "search_id") String str2, @C53072c(mo110600a = "query_correct_type") int i4);

        @C53084o(mo110612a = "/aweme/v1/music/search/")
        @C53074e
        C17832m<SearchMusicList> searchMusicList(@C53072c(mo110600a = "cursor") long j, @C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "is_pull_refresh") int i2, @C53072c(mo110600a = "hot_search") int i3, @C53072c(mo110600a = "search_id") String str2, @C53072c(mo110600a = "source") String str3, @C53072c(mo110600a = "search_source") String str4, @C53072c(mo110600a = "query_correct_type") int i4);

        @C53084o(mo110612a = "/aweme/v1/general/poi/search/")
        @C53074e
        C17832m<SearchPoiList> searchPoiList(@C53072c(mo110600a = "cursor") long j, @C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "source") String str2, @C53072c(mo110600a = "search_source") String str3, @C53072c(mo110600a = "hot_search") int i2, @C53072c(mo110600a = "latitude") double d, @C53072c(mo110600a = "longitude") double d2, @C53072c(mo110600a = "search_id") String str4, @C53072c(mo110600a = "query_correct_type") int i3);

        @C53084o(mo110612a = "/aweme/v1/discover/search/")
        @C53074e
        C17832m<SearchUserList> searchUserList(@C53072c(mo110600a = "cursor") long j, @C53072c(mo110600a = "keyword") String str, @C53072c(mo110600a = "count") int i, @C53072c(mo110600a = "type") int i2, @C53072c(mo110600a = "is_pull_refresh") int i3, @C53072c(mo110600a = "hot_search") int i4, @C53072c(mo110600a = "search_source") String str2, @C53072c(mo110600a = "search_id") String str3, @C53072c(mo110600a = "query_correct_type") int i5, @C53072c(mo110600a = "city") String str4, @C53072c(mo110600a = "city_code") String str5, @C53072c(mo110600a = "search_channel") String str6);
    }

    /* renamed from: a */
    public static SearchChallengeList m66824a(long j, int i) throws Exception {
        try {
            return (SearchChallengeList) ((RealApi) f73700b.create(RealApi.class)).recommendChallengeList(j, i).get();
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }

    /* renamed from: b */
    public static SearchMusicList m66830b(long j, int i) throws Exception {
        try {
            return (SearchMusicList) ((RealApi) f73700b.create(RealApi.class)).rankMusicList(j, i).get();
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static SearchChallengeList m66825a(String str, long j, int i, int i2, int i3, String str2, String str3, int i4) throws Exception {
        try {
            return (SearchChallengeList) ((RealApi) f73700b.create(RealApi.class)).searchChallengeList(j, str, i, i3, i2, "challenge", str3, str2, i4).get();
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }

    /* renamed from: b */
    public static SearchMusicList m66831b(String str, long j, int i, int i2, int i3, String str2, String str3, int i4) throws Exception {
        try {
            return (SearchMusicList) ((RealApi) f73700b.create(RealApi.class)).searchMusicList(j, str, i, i2, i3, str2, "music", str3, i4).get();
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static SearchMix m66827a(String str, long j, int i, String str2, int i2, int i3, String str3, int i4) throws Exception {
        try {
            return (SearchMix) ((RealApi) f73700b.create(RealApi.class)).searchFeedList(str, j, i, str2, i2, i3, str3, i4).get();
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static SearchMix m66826a(String str, long j, int i, int i2, int i3, double d, double d2, String str2, int i4) throws Exception {
        try {
            return (SearchMix) ((RealApi) f73700b.create(RealApi.class)).searchMixList(str, j, i, i2, i3, d, d2, str2, i4).get();
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static SearchPoiList m66828a(String str, long j, int i, int i2, double d, double d2, String str2, String str3, int i3) throws Exception {
        try {
            return (SearchPoiList) ((RealApi) f73700b.create(RealApi.class)).searchPoiList(j, str, i, "poi", str3, i2, d, d2, str2, i3).get();
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }

    /* renamed from: a */
    public static SearchUserList m66829a(String str, long j, int i, int i2, int i3, String str2, String str3, int i4, String str4, String str5, String str6) throws Exception {
        try {
            return (SearchUserList) ((RealApi) f73700b.create(RealApi.class)).searchUserList(j, str, i, 1, i2, i3, str2, str3, i4, str4, str5, str6).get();
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }
}
