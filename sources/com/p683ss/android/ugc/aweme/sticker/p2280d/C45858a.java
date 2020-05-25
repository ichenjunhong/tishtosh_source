package com.p683ss.android.ugc.aweme.sticker.p2280d;

import android.os.Bundle;
import com.p683ss.android.ugc.aweme.sticker.StickerWrapper;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45815a;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45817c;
import com.p683ss.android.ugc.aweme.sticker.p2275a.p2277b.C45818d;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45874b;
import com.p683ss.android.ugc.aweme.sticker.p2281e.C45872c.C45875c;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.d.a */
public final class C45858a {
    /* renamed from: a */
    public static final C45818d m99693a() {
        C45818d dVar = new C45818d(new StickerWrapper(), -1, C45815a.MANUAL_SET, null, 8, null);
        return dVar;
    }

    /* renamed from: a */
    public static /* synthetic */ C45818d m99694a(StickerWrapper stickerWrapper, int i, C45815a aVar, Bundle bundle, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = -1;
        }
        if ((i2 & 2) != 0) {
            aVar = C45815a.UI_CLICK;
        }
        C52711k.m112240b(stickerWrapper, "$this$createUnselectRequest");
        C52711k.m112240b(aVar, "requestSource");
        return new C45818d(stickerWrapper, i, aVar, null);
    }

    /* renamed from: a */
    public static final C45817c m99690a(StickerWrapper stickerWrapper, int i, C45815a aVar, StickerWrapper stickerWrapper2, Bundle bundle, C45874b bVar, C45875c cVar) {
        C52711k.m112240b(stickerWrapper, "$this$createSelectedRequest");
        C52711k.m112240b(aVar, "requestSource");
        C45817c cVar2 = new C45817c(stickerWrapper, i, aVar, stickerWrapper2, bundle, bVar, cVar);
        return cVar2;
    }

    /* renamed from: a */
    public static /* synthetic */ C45817c m99691a(StickerWrapper stickerWrapper, int i, C45815a aVar, StickerWrapper stickerWrapper2, Bundle bundle, C45874b bVar, C45875c cVar, int i2, Object obj) {
        int i3;
        if ((i2 & 1) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            aVar = C45815a.UI_CLICK;
        }
        C45815a aVar2 = aVar;
        if ((i2 & 16) != 0) {
            bVar = null;
        }
        return m99690a(stickerWrapper, i3, aVar2, null, null, bVar, null);
    }

    /* renamed from: a */
    public static /* synthetic */ C45817c m99692a(Effect effect, int i, C45815a aVar, StickerWrapper stickerWrapper, Bundle bundle, C45874b bVar, C45875c cVar, int i2, Object obj) {
        int i3;
        C45874b bVar2;
        if ((i2 & 1) != 0) {
            i3 = -1;
        } else {
            i3 = i;
        }
        if ((i2 & 2) != 0) {
            aVar = C45815a.UI_CLICK;
        }
        C45815a aVar2 = aVar;
        if ((i2 & 16) != 0) {
            bVar2 = null;
        } else {
            bVar2 = bVar;
        }
        C52711k.m112240b(effect, "$this$createSelectedRequest");
        C52711k.m112240b(aVar2, "requestSource");
        C52711k.m112240b(effect, "$this$toStickerWrapper");
        StickerWrapper a = StickerWrapper.m99610a(effect, null, null);
        C52711k.m112236a((Object) a, "StickerWrapper.coverData…ategory, iEffectPlatform)");
        return m99690a(a, i3, aVar2, null, null, bVar2, null);
    }
}
