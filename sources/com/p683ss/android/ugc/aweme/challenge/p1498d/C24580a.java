package com.p683ss.android.ugc.aweme.challenge.p1498d;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.challenge.api.BiColAwemeListApi;
import com.p683ss.android.ugc.aweme.challenge.api.C24550a;
import com.p683ss.android.ugc.aweme.feed.model.Aweme;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import p064c.p065a.C2201v;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.challenge.d.a */
public final class C24580a extends C11585a<C24583c, List<? extends Aweme>, C24583c, C24550a> {

    /* renamed from: a */
    public static final C24581a f65040a = new C24581a(null);

    /* renamed from: b */
    private final BiColAwemeListApi f65041b;

    /* renamed from: com.ss.android.ugc.aweme.challenge.d.a$a */
    public static final class C24581a {
        private C24581a() {
        }

        public /* synthetic */ C24581a(C52707g gVar) {
            this();
        }
    }

    public C24580a() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(BiColAwemeListApi.class);
        C52711k.m112236a(create, "ServiceManager.get().get…AwemeListApi::class.java)");
        this.f65041b = (BiColAwemeListApi) create;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C24583c cVar = (C24583c) obj;
        C52711k.m112240b(cVar, "req");
        return cVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C24583c cVar = (C24583c) obj;
        C52711k.m112240b(cVar, "req");
        Map hashMap = new HashMap();
        if (cVar.f65046d) {
            hashMap.put("hashtag_name", cVar.f65043a);
            hashMap.put("query_type", "1");
        } else {
            hashMap.put("ch_id", cVar.f65043a);
            hashMap.put("query_type", "0");
        }
        hashMap.put("cursor", String.valueOf(cVar.f65044b));
        hashMap.put("count", String.valueOf(cVar.f65045c));
        hashMap.put("type", "5");
        hashMap.put("source", "challenge_video");
        return this.f65041b.queryChallengeAwemeList(hashMap);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        C24550a aVar = (C24550a) obj2;
        C52711k.m112240b((C24583c) obj, "req");
        C52711k.m112240b(aVar, "resp");
        List<Aweme> list = aVar.f65002d;
        if (list == null) {
            return C52575l.m112097a();
        }
        return list;
    }
}
