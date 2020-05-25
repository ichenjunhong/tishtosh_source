package com.p683ss.android.ugc.aweme.services.sticker;

import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46606d;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46610h;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1$onSuccess$$inlined$let$lambda$1 */
final class C41505x6f63f0f3 implements Runnable {
    final /* synthetic */ C46606d $it;
    final /* synthetic */ UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 this$0;

    C41505x6f63f0f3(C46606d dVar, UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 unLockStickerManagerServiceImpl$resolve2UnlockSticker$1) {
        this.$it = dVar;
        this.this$0 = unLockStickerManagerServiceImpl$resolve2UnlockSticker$1;
    }

    public final void run() {
        C46610h.m101164a(this.this$0.$effect.getEffectId());
        this.this$0.$onUnlockSucceed.invoke(Integer.valueOf(this.$it.f117585a));
    }
}
