package com.p683ss.android.ugc.aweme.services.sticker;

import com.google.p1057b.p1065h.p1066a.C17824h;
import com.p683ss.android.p1137b.p1138a.p1139a.C18842a;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46606d;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 */
public final class UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1 implements C17824h<C46606d> {
    final /* synthetic */ Effect $effect;
    final /* synthetic */ C52670a $onUnlockFailed;
    final /* synthetic */ C52671b $onUnlockSucceed;

    public final void onFailure(Throwable th) {
        C52711k.m112240b(th, "t");
        C18842a.m45934b(new C41506x69cdf331(this));
    }

    public final void onSuccess(C46606d dVar) {
        boolean z;
        if (dVar != null) {
            if (dVar.f117585a == 0) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                dVar = null;
            }
            if (dVar != null) {
                C18842a.m45934b(new C41505x6f63f0f3(dVar, this));
            }
        }
    }

    UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1(Effect effect, C52671b bVar, C52670a aVar) {
        this.$effect = effect;
        this.$onUnlockSucceed = bVar;
        this.$onUnlockFailed = aVar;
    }
}
