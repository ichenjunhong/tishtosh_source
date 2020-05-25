package com.p683ss.android.ugc.aweme.profile.jedi.p2089a;

import com.bytedance.jedi.p725a.p726a.C11544e;
import com.bytedance.jedi.p725a.p728c.C11571b;
import com.bytedance.jedi.p725a.p728c.C11575f;
import com.bytedance.jedi.p725a.p733f.C11587b;
import com.bytedance.jedi.p725a.p739i.C11682a;
import com.bytedance.jedi.p725a.p739i.C11682a.C11686b;
import com.bytedance.jedi.p725a.p740j.C11698b;
import com.p683ss.android.ugc.aweme.draft.model.C29059c;
import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.profile.jedi.p2089a.C39883c.C39884a;
import com.p683ss.android.ugc.aweme.utils.C47718bf;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C2206z;
import p064c.p065a.p071d.C1711f;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52682m;
import p2628d.p2639f.p2640a.C52686q;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.jedi.a.b */
public final class C39879b extends C11698b {

    /* renamed from: a */
    public static final C39878a f101727a = C39878a.f101726c;

    /* renamed from: b */
    static final C39888e f101728b = new C39888e();

    /* renamed from: c */
    public static final C39879b f101729c;

    /* renamed from: d */
    private static final C39885d f101730d = new C39885d();

    /* renamed from: com.ss.android.ugc.aweme.profile.jedi.a.b$a */
    public static final class C39882a<T, R> implements C1711f<T, R> {

        /* renamed from: a */
        public static final C39882a f101732a = new C39882a();

        C39882a() {
        }

        public final /* synthetic */ Object apply(Object obj) {
            C11575f fVar = (C11575f) obj;
            C52711k.m112240b(fVar, "it");
            List list = (List) fVar.mo22313a();
            if (list == null) {
                return C52575l.m112097a();
            }
            return list;
        }
    }

    private C39879b() {
    }

    /* renamed from: c */
    public static void m88655c() {
        f101727a.mo22293c();
    }

    /* renamed from: b */
    public static C1680ad<List<C29059c>> m88654b() {
        C1680ad<List<C29059c>> a = C1680ad.m5960a((C2206z<? extends T>) f101730d.mo22318c(C52860x.f131107a));
        C52711k.m112236a((Object) a, "Single.fromObservable(ge…ftsFetcher.request(Unit))");
        return a;
    }

    static {
        C39879b bVar = new C39879b();
        f101729c = bVar;
        bVar.mo22478a(C11571b.m23675a((C11587b<K, V, REQ, RESP>) f101730d), C11571b.m23674a((C11544e<K, V>) f101727a), C11686b.m24026a(C11682a.f31134a, (C52682m) null, (C52686q) C11697a.f31149a, 1, (Object) null));
        bVar.mo22478a(C11571b.m23675a((C11587b<K, V, REQ, RESP>) f101728b), C11571b.m23674a((C11544e<K, V>) f101727a), C11686b.m24025a(C11682a.f31134a, (C52682m) null, (C52682m) C398801.f101731a, 1, (Object) null));
        C47718bf.m103290c(C39883c.f101733a);
        AVExternalServiceImpl.getAVServiceImpl_Monster().draftService().registerListener(new C39884a());
    }
}
