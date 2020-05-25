package com.p683ss.android.ugc.aweme.sticker.presenter.handler;

import com.p683ss.android.ugc.aweme.sticker.model.FaceStickerBean;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46057f;
import com.p683ss.android.ugc.aweme.sticker.presenter.C46352j;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.C46340k.C46341a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46315a;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46316b;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46317c;
import com.p683ss.android.ugc.aweme.sticker.presenter.handler.p2312c.C46318d;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.n */
public final class C46344n implements C46340k {

    /* renamed from: a */
    public static final C46345a f116932a = new C46345a(null);

    /* renamed from: b */
    private final C46352j f116933b;

    /* renamed from: com.ss.android.ugc.aweme.sticker.presenter.handler.n$a */
    public static final class C46345a {
        private C46345a() {
        }

        public /* synthetic */ C46345a(C52707g gVar) {
            this();
        }
    }

    public C46344n(C46352j jVar) {
        this.f116933b = jVar;
    }

    /* renamed from: a */
    public final C46316b mo93033a(C46317c cVar, C46341a aVar) {
        C52711k.m112240b(cVar, "session");
        C52711k.m112240b(aVar, "chain");
        C46316b a = aVar.mo93036a(cVar);
        if (this.f116933b != null) {
            if (cVar instanceof C46315a) {
                FaceStickerBean a2 = C46057f.m100055a(((C46315a) cVar).f116852a);
                C52711k.m112236a((Object) a2, "StickerConfig.covert(session.sticker)");
                this.f116933b.mo93073a(a2);
                if (a2.getTypes().contains("AR")) {
                    this.f116933b.mo93074b(a2);
                } else if (a2.getTags().contains("transfer_touch")) {
                    this.f116933b.mo93077e(a2);
                } else if (a2.getTypes().contains("FaceReplace3D")) {
                    this.f116933b.mo93076d(a2);
                } else {
                    this.f116933b.mo93075c(a2);
                }
            } else if (cVar instanceof C46318d) {
                this.f116933b.mo93073a(FaceStickerBean.NONE);
                this.f116933b.mo93075c(FaceStickerBean.NONE);
            }
        }
        return a;
    }
}
