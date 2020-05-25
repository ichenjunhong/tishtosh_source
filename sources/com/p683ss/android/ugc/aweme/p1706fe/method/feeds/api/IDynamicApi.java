package com.p683ss.android.ugc.aweme.p1706fe.method.feeds.api;

import com.bytedance.ies.ugc.aweme.network.RetrofitFactory;
import com.p683ss.android.ugc.aweme.p1706fe.method.feeds.p1710b.C29898a;
import java.util.Map;
import p064c.p065a.C2201v;
import p2628d.p2639f.p2641b.C52711k;
import p2666g.p2672c.C53075f;
import p2666g.p2672c.C53090u;
import p2666g.p2672c.C53093x;

/* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.api.IDynamicApi */
public interface IDynamicApi {

    /* renamed from: a */
    public static final C29894a f78024a = C29894a.f78025a;

    /* renamed from: com.ss.android.ugc.aweme.fe.method.feeds.api.IDynamicApi$a */
    public static final class C29894a {

        /* renamed from: a */
        static final /* synthetic */ C29894a f78025a = new C29894a();

        private C29894a() {
        }

        /* renamed from: a */
        public static IDynamicApi m70050a(String str) {
            C52711k.m112240b(str, "baseUrl");
            Object a = RetrofitFactory.createIRetrofitFactorybyMonsterPlugin().create(str).mo19930a(IDynamicApi.class);
            C52711k.m112236a(a, "ServiceManager.get().get…(IDynamicApi::class.java)");
            return (IDynamicApi) a;
        }
    }

    @C53075f
    C2201v<C29898a> loadVideos(@C53093x String str, @C53090u Map<String, String> map);
}
