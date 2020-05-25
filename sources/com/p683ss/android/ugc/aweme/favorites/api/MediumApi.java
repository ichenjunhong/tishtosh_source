package com.p683ss.android.ugc.aweme.favorites.api;

import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p2628d.p2639f.p2641b.C52707g;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.favorites.api.MediumApi */
public final class MediumApi {

    /* renamed from: a */
    public static final String f77581a = Api.f61282b;

    /* renamed from: b */
    public static MediumDataApi f77582b = ((MediumDataApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(f77581a).create(MediumDataApi.class));

    /* renamed from: c */
    public static final C29679a f77583c = new C29679a(null);

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.MediumApi$MediumDataApi */
    public interface MediumDataApi {
        @C53075f(mo110603a = "/aweme/v1/anchor/medium/collect/")
        C17832m<Object> changeMediumState(@C53089t(mo110619a = "medium_id") String str, @C53089t(mo110619a = "action") int i);

        @C53075f(mo110603a = "/aweme/v1/anchor/medium/collection/")
        C17832m<Object> getMediumList(@C53089t(mo110619a = "cursor") int i, @C53089t(mo110619a = "count") int i2);
    }

    /* renamed from: com.ss.android.ugc.aweme.favorites.api.MediumApi$a */
    public static final class C29679a {
        private C29679a() {
        }

        public /* synthetic */ C29679a(C52707g gVar) {
            this();
        }
    }
}
