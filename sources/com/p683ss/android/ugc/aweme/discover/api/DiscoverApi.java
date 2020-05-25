package com.p683ss.android.ugc.aweme.discover.api;

import android.text.TextUtils;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.bytedance.retrofit2.C12690b;
import com.bytedance.retrofit2.p831b.C12694aa;
import com.bytedance.retrofit2.p831b.C12699af;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12724z;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.discover.model.BannerList;
import com.p683ss.android.ugc.aweme.discover.model.CategoryList;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverCellDetailResponse;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverCellSectionListResponse;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverTrendingReponseV4;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4CategoryResponse;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4NewTrendingReponse;
import com.p683ss.android.ugc.aweme.discover.model.DiscoverV4PlayListResponse;
import com.p683ss.android.ugc.aweme.discover.model.DiscoveryV3CellListResponse;
import com.p683ss.android.ugc.aweme.discover.model.DiscoveryV4CellDetailResponse;
import com.p683ss.android.ugc.aweme.discover.model.WideSearchResponse;
import com.p683ss.android.ugc.aweme.feed.api.ComplianceEncryptCheckInterceptor;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.Collections;
import java.util.Map;
import p001a.C0013i;
import p064c.p065a.C2201v;

/* renamed from: com.ss.android.ugc.aweme.discover.api.DiscoverApi */
public final class DiscoverApi {

    /* renamed from: a */
    private static final String f73686a;

    /* renamed from: b */
    private static final String f73687b;

    /* renamed from: c */
    private static final String f73688c;

    /* renamed from: d */
    private static DiscoverService f73689d;

    /* renamed from: e */
    private static final DiscoverService f73690e;

    /* renamed from: com.ss.android.ugc.aweme.discover.api.DiscoverApi$DiscoverService */
    public interface DiscoverService {
        @C12706h(mo23876a = "/aweme/v2/discovery/v4/category/list/")
        C2201v<DiscoverV4CategoryResponse> categoryListV4(@C12724z(mo23894a = "category_list_type") int i, @C12724z(mo23894a = "new_option_type") int i2);

        @C12706h(mo23876a = "/aweme/v1/discover/cell/detail/")
        C0013i<DiscoverCellDetailResponse> cellDetail(@C12724z(mo23894a = "type") int i, @C12724z(mo23894a = "is_recommend") boolean z, @C12724z(mo23894a = "cell_id") String str);

        @C12706h(mo23876a = "/aweme/v2/discovery/v4/cell/detail/")
        C0013i<DiscoveryV4CellDetailResponse> cellDetailV4(@C12724z(mo23894a = "ab_type") int i, @C12724z(mo23894a = "cell_id") String str, @C12724z(mo23894a = "tab_name") String str2, @C12724z(mo23894a = "new_option_type") int i2, @C12724z(mo23894a = "count") int i3);

        @C12706h(mo23876a = "/aweme/v2/discovery/cell/list/")
        C2201v<DiscoveryV3CellListResponse> cellListV3(@C12724z(mo23894a = "cursor") int i, @C12724z(mo23894a = "count") int i2, @C12724z(mo23894a = "ab_type") int i3);

        @C12706h(mo23876a = "/aweme/v2/discovery/v4/cell/list/")
        C2201v<DiscoverV4PlayListResponse> cellListV4(@C12724z(mo23894a = "cursor") int i, @C12724z(mo23894a = "count") int i2, @C12724z(mo23894a = "tab_name") String str, @C12724z(mo23894a = "ab_type") int i3, @C12724z(mo23894a = "new_option_type") int i4);

        @C12706h(mo23876a = "/aweme/v1/discover/cell/list/")
        C0013i<DiscoverCellSectionListResponse> cellSectionList();

        @C12706h(mo23876a = "/aweme/v1/find/")
        C12690b<BannerList> fetchBanners(@C12694aa Map<String, String> map);

        @C12706h
        C12690b<CategoryList> fetchCategoryList(@C12699af String str, @C12694aa Map<String, String> map);

        @C12706h(mo23876a = "/aweme/v1/hot/search/")
        C12690b<WideSearchResponse> fetchHotSearch();

        @C12706h(mo23876a = "/aweme/v2/discovery/v4/new/category/list/")
        C2201v<DiscoverV4NewTrendingReponse> newTrendingListV4(@C12724z(mo23894a = "option_type") int i, @C12724z(mo23894a = "cursor") int i2, @C12724z(mo23894a = "count") int i3);

        @C12706h(mo23876a = "/aweme/v2/discovery/v4/trending/")
        C2201v<DiscoverTrendingReponseV4> trendingListV4(@C12724z(mo23894a = "trending_type") int i, @C12724z(mo23894a = "cursor") int i2, @C12724z(mo23894a = "count") int i3);
    }

    /* renamed from: a */
    public static DiscoverService m66818a() {
        if (f73689d == null) {
            f73689d = (DiscoverService) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(DiscoverService.class);
        }
        return f73689d;
    }

    static {
        DiscoverService discoverService;
        StringBuilder sb = new StringBuilder();
        sb.append(Api.f61282b);
        sb.append("/aweme/v1/category/list/");
        f73686a = sb.toString();
        StringBuilder sb2 = new StringBuilder();
        sb2.append(Api.f61282b);
        sb2.append("/aweme/v2/category/list/");
        f73687b = sb2.toString();
        StringBuilder sb3 = new StringBuilder();
        sb3.append(Api.f61282b);
        sb3.append("/aweme/v1/category/fascinating/list/");
        f73688c = sb3.toString();
        if (TextUtils.equals(C11010c.m22295p(), "local_test")) {
            discoverService = (DiscoverService) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b, Collections.singletonList(new ComplianceEncryptCheckInterceptor())).create(DiscoverService.class);
        } else {
            discoverService = (DiscoverService) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(DiscoverService.class);
        }
        f73690e = discoverService;
    }
}
