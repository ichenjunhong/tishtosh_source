package com.p683ss.android.ugc.aweme.music.p1978ui.p1983e;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.app.api.Api;
import com.p683ss.android.ugc.aweme.music.p1978ui.api.MusicAwemeApi;
import com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.C37680b;
import com.p683ss.android.ugc.aweme.music.p1978ui.viewmodel.C37682d;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import java.util.List;
import p064c.p065a.C2201v;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.music.ui.e.a */
public final class C37605a extends C11585a<C37607b, List<? extends C37682d>, C37607b, C37680b> {

    /* renamed from: a */
    public static final C37606a f95910a = new C37606a(null);

    /* renamed from: b */
    private final MusicAwemeApi f95911b;

    /* renamed from: com.ss.android.ugc.aweme.music.ui.e.a$a */
    public static final class C37606a {
        private C37606a() {
        }

        public /* synthetic */ C37606a(C52707g gVar) {
            this();
        }
    }

    public C37605a() {
        Object create = RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(Api.f61282b).create(MusicAwemeApi.class);
        C52711k.m112236a(create, "ServiceManager.get().get…usicAwemeApi::class.java)");
        this.f95911b = (MusicAwemeApi) create;
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C37607b bVar = (C37607b) obj;
        C52711k.m112240b(bVar, "req");
        return bVar;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C37607b bVar = (C37607b) obj;
        C52711k.m112240b(bVar, "req");
        return this.f95911b.queryRecommendMusicAwemeList(bVar.f95912a, bVar.f95913b, bVar.f95914c, bVar.f95915d);
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        C37680b bVar = (C37680b) obj2;
        C52711k.m112240b((C37607b) obj, "req");
        C52711k.m112240b(bVar, "resp");
        List<C37682d> list = bVar.f96087c;
        if (list == null) {
            return C52575l.m112097a();
        }
        return list;
    }
}
