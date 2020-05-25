package com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2292c;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48711p;
import java.util.List;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d.c.c */
public final class C45948c extends C11585a<C52860x, C45951d, C45951d, List<? extends String>> {

    /* renamed from: a */
    public final String f115952a;

    /* renamed from: b */
    public final C29252f f115953b;

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.c.c$a */
    static final class C45949a<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ C45948c f115954a;

        /* renamed from: b */
        final /* synthetic */ C45951d f115955b;

        C45949a(C45948c cVar, C45951d dVar) {
            this.f115954a = cVar;
            this.f115955b = dVar;
        }

        public final void subscribe(final C2204x<List<String>> xVar) {
            C52711k.m112240b(xVar, "emitter");
            this.f115954a.f115953b.mo59135a(this.f115954a.f115952a, C52575l.m112092a(this.f115955b.f115957a.getEffectId()), Boolean.valueOf(this.f115955b.f115958b), (C48711p) new C48711p() {
                /* renamed from: a */
                public final void mo92558a(C48649d dVar) {
                    C52711k.m112240b(dVar, "e");
                    C2204x xVar = xVar;
                    C52711k.m112236a((Object) xVar, "emitter");
                    if (!xVar.isDisposed()) {
                        xVar.mo6274a((Throwable) dVar.f122281c);
                    }
                }

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    List list = (List) obj;
                    C2204x xVar = xVar;
                    C52711k.m112236a((Object) xVar, "emitter");
                    if (!xVar.isDisposed()) {
                        if (list != null) {
                            xVar.mo6282a(list);
                            xVar.mo6273a();
                            if (list != null) {
                                return;
                            }
                        }
                        xVar.mo6274a((Throwable) new IllegalArgumentException("modify favorite sticker failed"));
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C52711k.m112240b((C45951d) obj, "req");
        return C52860x.f131107a;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C45951d dVar = (C45951d) obj;
        C52711k.m112240b(dVar, "req");
        C2201v a = C2201v.m6601a((C2205y<T>) new C45949a<T>(this, dVar));
        C52711k.m112236a((Object) a, "Observable.create { emit…             })\n        }");
        return a;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        C45951d dVar = (C45951d) obj;
        List list = (List) obj2;
        C52711k.m112240b(dVar, "req");
        C52711k.m112240b(list, "resp");
        return dVar;
    }

    public C45948c(String str, C29252f fVar) {
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(fVar, "effectPlatform");
        this.f115952a = str;
        this.f115953b = fVar;
    }
}
