package com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2290a;

import com.bytedance.jedi.p725a.p733f.C11585a;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2296e.C46023d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.PanelInfoModel;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48707l;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d.a.b */
public final class C45933b extends C11585a<C52860x, PanelInfoModel, C46023d, PanelInfoModel> {

    /* renamed from: a */
    public final String f115927a;

    /* renamed from: b */
    public final C29252f f115928b;

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.a.b$a */
    static final class C45934a<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ C45933b f115929a;

        /* renamed from: b */
        final /* synthetic */ C46023d f115930b;

        C45934a(C45933b bVar, C46023d dVar) {
            this.f115929a = bVar;
            this.f115930b = dVar;
        }

        public final void subscribe(final C2204x<PanelInfoModel> xVar) {
            C52711k.m112240b(xVar, "emitter");
            this.f115929a.f115928b.mo59139a(this.f115929a.f115927a, this.f115930b.f116156d, this.f115930b.f116153a, this.f115930b.f116154b, this.f115930b.f116155c, (C48707l) new C48707l() {
                /* renamed from: a */
                public final void mo59192a(C48649d dVar) {
                    C52711k.m112240b(dVar, "e");
                    C2204x xVar = xVar;
                    C52711k.m112236a((Object) xVar, "emitter");
                    if (!xVar.isDisposed()) {
                        xVar.mo6274a((Throwable) dVar.f122281c);
                    }
                }

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    PanelInfoModel panelInfoModel = (PanelInfoModel) obj;
                    C2204x xVar = xVar;
                    C52711k.m112236a((Object) xVar, "emitter");
                    if (!xVar.isDisposed()) {
                        if (panelInfoModel != null) {
                            xVar.mo6282a(panelInfoModel);
                            xVar.mo6273a();
                            if (panelInfoModel != null) {
                                return;
                            }
                        }
                        xVar.mo6274a((Throwable) new IllegalArgumentException("sticker panel fetching failed"));
                    }
                }
            });
        }
    }

    /* renamed from: b */
    public final /* bridge */ /* synthetic */ Object mo22310b(Object obj) {
        C52711k.m112240b((C46023d) obj, "req");
        return C52860x.f131107a;
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C46023d dVar = (C46023d) obj;
        C52711k.m112240b(dVar, "req");
        C2201v a = C2201v.m6601a((C2205y<T>) new C45934a<T>(this, dVar));
        C52711k.m112236a((Object) a, "Observable.create { emit…}\n            )\n        }");
        return a;
    }

    /* renamed from: a */
    public final /* synthetic */ Object mo22309a(Object obj, Object obj2) {
        PanelInfoModel panelInfoModel = (PanelInfoModel) obj2;
        C52711k.m112240b((C46023d) obj, "req");
        C52711k.m112240b(panelInfoModel, "resp");
        return panelInfoModel;
    }

    public C45933b(String str, C29252f fVar) {
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(fVar, "effectPlatform");
        this.f115927a = str;
        this.f115928b = fVar;
    }
}
