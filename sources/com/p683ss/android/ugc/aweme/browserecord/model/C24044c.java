package com.p683ss.android.ugc.aweme.browserecord.model;

import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p064c.p065a.C2201v;
import p064c.p065a.p093k.C2168a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.browserecord.model.c */
public final class C24044c {

    /* renamed from: a */
    public static final C24044c f63820a = new C24044c();

    /* renamed from: b */
    private static final BrowseRecordApi f63821b;

    private C24044c() {
    }

    static {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(BrowseRecordApi.class);
        C52711k.m112236a(create, "ServiceManager.get().get…wseRecordApi::class.java)");
        f63821b = (BrowseRecordApi) create;
    }

    /* renamed from: a */
    public static final C2201v<C24043b> m58866a(String str, int i, int i2, long j, long j2) {
        C52711k.m112240b(str, "aid");
        C2201v<C24043b> b = f63821b.getBrowseListResponse(str, i, i2, j, j2).mo6529b(C2168a.m6521b());
        C52711k.m112236a((Object) b, "mApi.getBrowseListRespon…scribeOn(Schedulers.io())");
        return b;
    }
}
