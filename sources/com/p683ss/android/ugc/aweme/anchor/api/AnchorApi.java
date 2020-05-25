package com.p683ss.android.ugc.aweme.anchor.api;

import com.bytedance.ies.ugc.aweme.network.C11030f;
import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.google.p1057b.p1065h.p1066a.C17832m;
import com.p683ss.android.ugc.aweme.anchor.api.p1343a.C22592a;
import com.p683ss.android.ugc.aweme.anchor.api.p1343a.C22593b;
import com.p683ss.android.ugc.aweme.anchor.api.p1343a.C22594c;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53072c;
import p2666g.p2672c.C53074e;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53084o;
import p2666g.p2672c.C53089t;

/* renamed from: com.ss.android.ugc.aweme.anchor.api.AnchorApi */
public final class AnchorApi {

    /* renamed from: a */
    public static final C11030f f60731a = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().createBuilder("https://aweme.snssdk.com").mo19925a();

    /* renamed from: b */
    public static final AnchorApi f60732b = new AnchorApi();

    /* renamed from: com.ss.android.ugc.aweme.anchor.api.AnchorApi$RealApi */
    public interface RealApi {
        @C53084o(mo110612a = "https://aweme.snssdk.com/aweme/v1/anchor/history/delete/")
        @C53074e
        C0013i<C22592a> getAnchorDeleteHistoryResponse(@C53072c(mo110600a = "type") int i, @C53072c(mo110600a = "ids") String str, @C53072c(mo110600a = "clear_all") boolean z);

        @C53075f(mo110603a = "https://aweme.snssdk.com/aweme/v1/anchor/search/")
        C17832m<C22593b> getAnchorSearchResponse(@C53089t(mo110619a = "type") int i, @C53089t(mo110619a = "keyword") String str);

        @C53075f(mo110603a = "https://aweme.snssdk.com/aweme/v1/anchor/selection/")
        C17832m<C22594c> getAnchorSelectionResponse(@C53089t(mo110619a = "type") int i, @C53089t(mo110619a = "tab_id") int i2, @C53089t(mo110619a = "page") int i3, @C53089t(mo110619a = "page_size") int i4);
    }

    private AnchorApi() {
    }

    /* renamed from: a */
    public static C0013i<C22592a> m55788a(int i, String str, boolean z) {
        C52711k.m112240b(str, "keyword");
        return ((RealApi) f60731a.mo19930a(RealApi.class)).getAnchorDeleteHistoryResponse(i, str, z);
    }
}
