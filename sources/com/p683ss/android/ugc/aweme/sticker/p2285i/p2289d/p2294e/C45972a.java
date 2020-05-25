package com.p683ss.android.ugc.aweme.sticker.p2285i.p2289d.p2294e;

import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2285i.p2286a.C45911i;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.d.e.a */
public final class C45972a implements C45911i {

    /* renamed from: a */
    private final C29252f f116005a;

    /* renamed from: a */
    public final boolean mo92511a(Effect effect) {
        return StickerWrapper.m99614a(effect, this.f116005a);
    }

    public C45972a(C29252f fVar) {
        C52711k.m112240b(fVar, "effectPlatform");
        this.f116005a = fVar;
    }

    /* renamed from: a */
    public final StickerWrapper mo92509a(StickerWrapper stickerWrapper) {
        C52711k.m112240b(stickerWrapper, "wrapper");
        StickerWrapper a = StickerWrapper.m99608a(stickerWrapper, this.f116005a);
        C52711k.m112236a((Object) a, "StickerWrapper.coverData(wrapper, effectPlatform)");
        return a;
    }

    /* renamed from: b */
    public final StickerWrapper mo92512b(StickerWrapper stickerWrapper) {
        C52711k.m112240b(stickerWrapper, "wrapper");
        StickerWrapper b = StickerWrapper.m99616b(stickerWrapper, this.f116005a);
        C52711k.m112236a((Object) b, "StickerWrapper.setState(wrapper, effectPlatform)");
        return b;
    }

    /* renamed from: a */
    public final StickerWrapper mo92510a(Effect effect, String str) {
        StickerWrapper a = StickerWrapper.m99610a(effect, str, this.f116005a);
        C52711k.m112236a((Object) a, "StickerWrapper.coverData…category, effectPlatform)");
        return a;
    }
}
