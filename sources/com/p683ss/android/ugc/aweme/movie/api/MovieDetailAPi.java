package com.p683ss.android.ugc.aweme.movie.api;

import com.bytedance.retrofit2.p831b.C12704f;
import com.bytedance.retrofit2.p831b.C12705g;
import com.bytedance.retrofit2.p831b.C12706h;
import com.bytedance.retrofit2.p831b.C12718t;
import com.bytedance.retrofit2.p831b.C12724z;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.movie.p1968b.C37178b;
import com.p683ss.android.ugc.aweme.movie.p1968b.C37179c;
import java.util.Map;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.movie.api.MovieDetailAPi */
public final class MovieDetailAPi {

    /* renamed from: a */
    public static final int f94891a = 1;

    /* renamed from: b */
    public static final String f94892b = f94892b;

    /* renamed from: c */
    public static final String f94893c = f94893c;

    /* renamed from: d */
    public static final String f94894d = f94894d;

    /* renamed from: e */
    public static final String f94895e = Api.f61282b;

    /* renamed from: f */
    public static final C37175a f94896f = new C37175a(null);

    /* renamed from: com.ss.android.ugc.aweme.movie.api.MovieDetailAPi$MvDetail */
    public interface MvDetail {
        @C12718t(mo23886a = "/aweme/v1/ulike/collect/template/")
        @C12705g
        C17832m<Object> collectTemplate(@C12704f Map<String, Object> map);

        @C12706h(mo23876a = "/aweme/v1/mv/detail/")
        C17832m<C37179c> getMvDetail(@C12724z(mo23894a = "mv_id") String str);

        @C12706h(mo23876a = "/aweme/v1/mv/aweme/")
        C17832m<C37178b> getMvDetailList(@C12724z(mo23894a = "mv_id") String str, @C12724z(mo23894a = "cursor") long j);

        @C12706h(mo23876a = "/aweme/v1/ulike/template/detail/")
        C17832m<C37179c> getNewMvDetail(@C12724z(mo23894a = "template_id") String str, @C12724z(mo23894a = "longitude") Double d, @C12724z(mo23894a = "latitude") Double d2, @C12724z(mo23894a = "city_code") String str2, @C12724z(mo23894a = "cut_same_sdk_version") String str3);
    }

    /* renamed from: com.ss.android.ugc.aweme.movie.api.MovieDetailAPi$a */
    public static final class C37175a {
        private C37175a() {
        }

        /* renamed from: a */
        public static int m83417a() {
            return MovieDetailAPi.f94891a;
        }

        /* renamed from: b */
        public static String m83418b() {
            return MovieDetailAPi.f94895e;
        }

        public /* synthetic */ C37175a(C52707g gVar) {
            this();
        }
    }
}
