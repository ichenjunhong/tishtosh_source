package com.bytedance.android.live.broadcast.effect.sticker.p210ui;

import com.bytedance.android.livesdkapi.depend.model.C8688c;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48710o;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48715t;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.u */
final /* synthetic */ class C3359u implements C48715t {

    /* renamed from: a */
    private final C3353s f9649a;

    /* renamed from: b */
    private final C8688c f9650b;

    /* renamed from: c */
    private final C3357b f9651c;

    C3359u(C3353s sVar, C8688c cVar, C3357b bVar) {
        this.f9649a = sVar;
        this.f9650b = cVar;
        this.f9651c = bVar;
    }

    /* renamed from: a */
    public final void mo8708a() {
        C3353s sVar = this.f9649a;
        sVar.mo8725a(this.f9650b, (C48710o) new C48710o(this.f9651c) {

            /* renamed from: a */
            final /* synthetic */ C3357b f9637a;

            /* renamed from: a */
            public final void mo8641a() {
                this.f9637a.f9643e.setVisibility(0);
            }

            /* renamed from: b */
            public final void mo8642b() {
                this.f9637a.f9643e.setVisibility(8);
            }

            {
                this.f9637a = r2;
            }
        });
    }
}
