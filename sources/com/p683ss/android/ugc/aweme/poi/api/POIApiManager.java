package com.p683ss.android.ugc.aweme.poi.api;

import android.os.Handler;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.base.C23566n;
import com.p683ss.android.ugc.aweme.base.api.C23453a;
import com.p683ss.android.ugc.aweme.poi.model.C39116av;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.poi.api.POIApiManager */
public final class POIApiManager {

    /* renamed from: a */
    public static POIApi f99523a = ((POIApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(POIApi.class));

    /* renamed from: com.ss.android.ugc.aweme.poi.api.POIApiManager$POIApi */
    public interface POIApi {
        @C53075f(mo110603a = "/aweme/v1/poi/search/")
        C17832m<C39116av> searchPoi(@C53089t(mo110619a = "keywords") String str, @C53089t(mo110619a = "longitude") String str2, @C53089t(mo110619a = "latitude") String str3, @C53089t(mo110619a = "search_type") int i, @C53089t(mo110619a = "page") int i2, @C53089t(mo110619a = "count") int i3, @C53089t(mo110619a = "get_current_loc") int i4, @C53089t(mo110619a = "candidate_loc") String str4);

        @C53075f(mo110603a = "/aweme/v1/poi/recommend/")
        C17832m<C39116av> speedRecommendPoi(@C53089t(mo110619a = "longitude") String str, @C53089t(mo110619a = "latitude") String str2, @C53089t(mo110619a = "city_code") int i, @C53089t(mo110619a = "top_ids") String str3, @C53089t(mo110619a = "candidate_loc") String str4);
    }

    /* renamed from: a */
    public static void m86871a(Handler handler, String str, String str2, int i, String str3, String str4) {
        C23566n a = C23566n.m57766a();
        final String str5 = str;
        final String str6 = str2;
        final int i2 = i;
        final String str7 = str3;
        final String str8 = str4;
        C390381 r1 = new Callable() {
            public final Object call() throws Exception {
                try {
                    return POIApiManager.f99523a.speedRecommendPoi(str5, str6, i2, str7, str8).get();
                } catch (ExecutionException e) {
                    throw C23453a.getCompatibleException(e);
                }
            }
        };
        a.mo48750a(handler, r1, 2);
    }

    /* renamed from: a */
    public static C39116av m86870a(String str, String str2, String str3, int i, int i2, int i3, int i4, String str4) throws Exception {
        try {
            return (C39116av) f99523a.searchPoi(str, str2, str3, i, i2, i3, i4, str4).get();
        } catch (ExecutionException e) {
            throw C23453a.getCompatibleException(e);
        }
    }
}
