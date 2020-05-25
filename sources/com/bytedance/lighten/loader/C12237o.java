package com.bytedance.lighten.loader;

import com.bytedance.lighten.p766a.C12193g;
import com.bytedance.lighten.p766a.C12199m;
import com.bytedance.lighten.p766a.p769c.C12177l;
import com.facebook.imagepipeline.p970j.C14044e;
import com.facebook.imagepipeline.p974n.C14123ai.C14124a;
import com.facebook.imagepipeline.p974n.C14140an;
import com.facebook.imagepipeline.p974n.C14176c;
import com.facebook.imagepipeline.p974n.C14178e;
import com.facebook.imagepipeline.p974n.C14188k;
import com.facebook.imagepipeline.p974n.C14207t;
import com.p992g.p993a.C14711d;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.lighten.loader.o */
final class C12237o extends C14176c<C12239a> {

    /* renamed from: a */
    private C12199m f32328a;

    /* renamed from: b */
    private String f32329b;

    /* renamed from: com.bytedance.lighten.loader.o$a */
    public static class C12239a extends C14207t {

        /* renamed from: a */
        public C12193g f32332a;

        public C12239a(C14188k<C14044e> kVar, C14140an anVar) {
            super(kVar, anVar);
        }
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("use fetcher: ");
        sb.append(this.f32329b);
        return sb.toString();
    }

    public C12237o(C12199m mVar) {
        this.f32328a = mVar;
    }

    public final /* synthetic */ C14207t createFetchState(C14188k kVar, C14140an anVar) {
        C12239a aVar = new C12239a(kVar, anVar);
        aVar.f32332a = new C12193g();
        return aVar;
    }

    public final /* synthetic */ void onFetchCompletion(C14207t tVar, int i) {
        C12239a aVar = (C12239a) tVar;
        if (aVar.f32332a.f32134j != null) {
            aVar.f32332a.f32134j.run();
        }
    }

    public final /* synthetic */ void fetch(C14207t tVar, C14124a aVar) {
        C12239a aVar2 = (C12239a) tVar;
        if (aVar2 != null) {
            C12235m mVar = new C12235m(aVar);
            aVar2.f32332a.f32132h = aVar2.mo26420c();
            aVar2.f32332a.f32133i = new C12236n(aVar2.f37087e);
            aVar2.f32332a.f32130f = aVar2.mo26418a();
            aVar2.f32332a.f32136l = aVar2.mo26421d();
            C14711d a = C12253r.m24729a();
            if (a != null) {
                aVar2.f32332a.f32135k = a.f38115b;
            }
            final C12177l a2 = this.f32328a.mo23108a();
            this.f32329b = a2.getClass().getName();
            a2.mo23097a(aVar2.f32332a, mVar);
            aVar2.f37087e.mo26385a(new C14178e() {
                /* renamed from: a */
                public final void mo23173a() {
                    a2.mo23096a();
                }
            });
            a2.mo23098b(aVar2.f32332a, mVar);
        }
    }

    public final /* synthetic */ Map getExtraMap(C14207t tVar, int i) {
        String str;
        C12239a aVar = (C12239a) tVar;
        HashMap hashMap = new HashMap(5);
        if (aVar.f32332a.f32126b == 0 || aVar.f32332a.f32125a == 0) {
            hashMap.put("queue_time", Long.toString(-1));
        } else {
            hashMap.put("queue_time", Long.toString(aVar.f32332a.f32126b - aVar.f32332a.f32125a));
        }
        if (aVar.f32332a.f32128d == 0 || aVar.f32332a.f32126b == 0) {
            hashMap.put("fetch_time", Long.toString(-1));
        } else {
            hashMap.put("fetch_time", Long.toString(aVar.f32332a.f32128d - aVar.f32332a.f32126b));
        }
        if (aVar.f32332a.f32128d == 0 || aVar.f32332a.f32125a == 0) {
            hashMap.put("total_time", Long.toString(-1));
        } else {
            hashMap.put("total_time", Long.toString(aVar.f32332a.f32128d - aVar.f32332a.f32125a));
        }
        hashMap.put("image_size", Integer.toString(i));
        String str2 = "hit_cdn_cache";
        if (aVar.f32332a.f32131g) {
            str = "1";
        } else {
            str = "0";
        }
        hashMap.put(str2, str);
        hashMap.put("content_length", Long.toString(aVar.f32332a.f32137m));
        return hashMap;
    }
}
