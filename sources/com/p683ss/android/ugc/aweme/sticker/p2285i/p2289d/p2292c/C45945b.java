package com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2292c;

import com.bytedance.jedi.p725a.p733f.C11597d;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.effect.model.net.FetchFavoriteListResponse;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48706k;
import p064c.p065a.C2201v;
import p064c.p065a.C2204x;
import p064c.p065a.C2205y;
import p2628d.C52860x;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d.c.b */
public final class C45945b extends C11597d<C52860x, FetchFavoriteListResponse> {

    /* renamed from: a */
    public final String f115948a;

    /* renamed from: b */
    public final C29252f f115949b;

    /* renamed from: com.ss.android.ugc.aweme.sticker.i.d.c.b$a */
    static final class C45946a<T> implements C2205y<T> {

        /* renamed from: a */
        final /* synthetic */ C45945b f115950a;

        C45946a(C45945b bVar) {
            this.f115950a = bVar;
        }

        public final void subscribe(final C2204x<FetchFavoriteListResponse> xVar) {
            C52711k.m112240b(xVar, "emitter");
            this.f115950a.f115949b.mo59127a(this.f115950a.f115948a, (C48706k) new C48706k() {
                /* renamed from: a */
                public final void mo92557a(C48649d dVar) {
                    C52711k.m112240b(dVar, "e");
                    C2204x xVar = xVar;
                    C52711k.m112236a((Object) xVar, "emitter");
                    if (!xVar.isDisposed()) {
                        xVar.mo6274a((Throwable) dVar.f122281c);
                    }
                }

                /* renamed from: a */
                public final /* synthetic */ void mo8638a(Object obj) {
                    FetchFavoriteListResponse fetchFavoriteListResponse = (FetchFavoriteListResponse) obj;
                    C2204x xVar = xVar;
                    C52711k.m112236a((Object) xVar, "emitter");
                    if (!xVar.isDisposed()) {
                        if (fetchFavoriteListResponse != null) {
                            xVar.mo6282a(fetchFavoriteListResponse);
                            xVar.mo6273a();
                            if (fetchFavoriteListResponse != null) {
                                return;
                            }
                        }
                        xVar.mo6274a((Throwable) new IllegalArgumentException("favorite list fetching failed"));
                    }
                }
            });
        }
    }

    /* renamed from: a */
    public final /* synthetic */ C2201v mo22308a(Object obj) {
        C52711k.m112240b((C52860x) obj, "req");
        C2201v a = C2201v.m6601a((C2205y<T>) new C45946a<T>(this));
        C52711k.m112236a((Object) a, "Observable.create { emit…\n            })\n        }");
        return a;
    }

    public C45945b(String str, C29252f fVar) {
        C52711k.m112240b(str, "panel");
        C52711k.m112240b(fVar, "effectPlatform");
        this.f115948a = str;
        this.f115949b = fVar;
    }
}
