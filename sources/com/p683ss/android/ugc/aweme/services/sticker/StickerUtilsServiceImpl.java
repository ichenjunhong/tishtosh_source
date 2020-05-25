package com.p683ss.android.ugc.aweme.services.sticker;

import android.content.Context;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.StickerUtilsServiceImpl */
public final class StickerUtilsServiceImpl implements IStickerUtilsService {
    public final boolean isCommerceLockSticker(Effect effect) {
        return C46059g.m100086j(effect);
    }

    public final boolean isLockSticker(Effect effect) {
        return C46059g.m100085i(effect);
    }

    public final boolean hasUnlocked(Effect effect) {
        C52711k.m112240b(effect, "effect");
        return C46059g.m100093q(effect);
    }

    public final boolean isLockCommerceFaceSticker(C46069d dVar) {
        C52711k.m112240b(dVar, "newFaceStickerBean");
        return C46059g.m100075b(dVar);
    }

    public final boolean isLockFaceSticker(C46069d dVar) {
        C52711k.m112240b(dVar, "newFaceStickerBean");
        return C46059g.m100068a(dVar);
    }

    public final boolean isStickerPreviewable(Effect effect) {
        C52711k.m112240b(effect, "effect");
        return C46059g.m100088l(effect);
    }

    public final boolean showCommerceStickerDialog(Context context, C46069d dVar, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "enterFrom");
        return C46059g.m100065a(context, dVar, str);
    }
}
