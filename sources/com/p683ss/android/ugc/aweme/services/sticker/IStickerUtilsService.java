package com.p683ss.android.ugc.aweme.services.sticker;

import android.content.Context;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.IStickerUtilsService */
public interface IStickerUtilsService {
    boolean hasUnlocked(Effect effect);

    boolean isCommerceLockSticker(Effect effect);

    boolean isLockCommerceFaceSticker(C46069d dVar);

    boolean isLockFaceSticker(C46069d dVar);

    boolean isLockSticker(Effect effect);

    boolean isStickerPreviewable(Effect effect);

    boolean showCommerceStickerDialog(Context context, C46069d dVar, String str);
}
