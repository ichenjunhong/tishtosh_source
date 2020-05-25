package com.p683ss.android.ugc.aweme.discover.api;

import android.net.Uri;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.discover.helper.C28195d;
import com.p683ss.android.ugc.aweme.discover.model.SearchHistory;
import com.p683ss.android.ugc.aweme.discover.model.SearchSugResponse;
import com.p683ss.android.ugc.aweme.framework.services.IRetrofitService;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutionException;
import org.json.JSONArray;
import p2628d.C52857u;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.discover.api.SearchSugApi */
public final class SearchSugApi {

    /* renamed from: a */
    private static IRetrofitService f73725a;

    /* renamed from: b */
    private static API f73726b;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.SearchSugApi$API */
    public interface API {
        @C53075f(mo110603a = "/aweme/v1/search/sug/")
        C17832m<SearchSugResponse> getSearchSugList(@C53089t(mo110619a = "keyword") String str, @C53089t(mo110619a = "source") String str2, @C53089t(mo110619a = "from_group_id") String str3);

        @C53075f(mo110603a = "/aweme/v1/search/sug/")
        C17832m<SearchSugResponse> getSearchSugListMT(@C53089t(mo110619a = "keyword") String str, @C53089t(mo110619a = "source") String str2, @C53089t(mo110619a = "history_list") String str3);
    }

    static {
        IRetrofitService createIRetrofitServicebyMonsterPlugin = RetrofitService.createIRetrofitServicebyMonsterPlugin();
        f73725a = createIRetrofitServicebyMonsterPlugin;
        f73726b = (API) createIRetrofitServicebyMonsterPlugin.createNewRetrofit(Api.f61282b).create(API.class);
    }

    /* renamed from: a */
    public static SearchSugResponse m66837a(String str, String str2, String str3, C28195d dVar) throws Exception {
        SearchHistory[] searchHistoryArr;
        try {
            API api = f73726b;
            List<SearchHistory> list = dVar.f74022a;
            if (list != null) {
                Object[] array = list.toArray(new SearchHistory[0]);
                if (array != null) {
                    searchHistoryArr = (SearchHistory[]) array;
                } else {
                    throw new C52857u("null cannot be cast to non-null type kotlin.Array<T>");
                }
            } else {
                searchHistoryArr = null;
            }
            if (!Arrays.equals(searchHistoryArr, dVar.f74023b)) {
                JSONArray jSONArray = new JSONArray();
                if (searchHistoryArr != null) {
                    int length = searchHistoryArr.length;
                    for (int i = 0; i < length; i++) {
                        jSONArray.put(searchHistoryArr[i].keyword);
                    }
                }
                dVar.f74023b = searchHistoryArr;
                String encode = Uri.encode(jSONArray.toString());
                C52711k.m112236a((Object) encode, "Uri.encode(historiesJsonArray.toString())");
                dVar.f74024c = encode;
            }
            return (SearchSugResponse) api.getSearchSugListMT(str, str2, dVar.f74024c).get();
        } catch (ExecutionException e) {
            throw f73725a.propagateCompatibleException(e);
        }
    }
}
