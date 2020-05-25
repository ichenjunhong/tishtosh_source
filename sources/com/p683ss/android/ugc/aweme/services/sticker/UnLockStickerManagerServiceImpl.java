package com.p683ss.android.ugc.aweme.services.sticker;

import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.ugc.aweme.port.p2082in.C39618d;
import com.p683ss.android.ugc.aweme.sticker.p2301k.C46059g;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46608f;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.C46610h;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.LockStickerTextBean;
import com.p683ss.android.ugc.aweme.sticker.types.unlock.UnlockStickerApi;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.UnLockStickerManagerServiceImpl */
public final class UnLockStickerManagerServiceImpl implements IUnLockStickerManagerService {
    public final void clearUnlockedStickerIds() {
        C46610h.m101169c();
    }

    public final boolean getUpdateState() {
        return C46610h.m101168b();
    }

    public final LockStickerTextBean getDefaultTextBean() {
        LockStickerTextBean d = C46610h.m101170d();
        C52711k.m112236a((Object) d, "UnlockedStickersManager.getDefaultTextBean()");
        return d;
    }

    public final ArrayList<String> getUnlockedStickerIds() {
        ArrayList<String> a = C46610h.m101163a();
        C52711k.m112236a((Object) a, "UnlockedStickersManager.getUnlockedStickerIds()");
        return a;
    }

    public final void addUnlockedStickerId(String str) {
        C46610h.m101164a(str);
    }

    public final void updateLockStickerTextBeans(List<? extends LockStickerTextBean> list) {
        C46610h.m101167b(list);
    }

    public final void updateUnlockedStickerIdList(List<String> list) {
        C46610h.m101165a(list);
    }

    public final LockStickerTextBean getShareString(Effect effect) {
        return C46610h.m101162a(effect);
    }

    public final LockStickerTextBean getTextBeanForActivity(Effect effect) {
        C52711k.m112240b(effect, "effect");
        return C46610h.m101166b(C46059g.m100089m(effect));
    }

    public final void resolve2UnlockSticker(Effect effect, C52671b<? super Integer, C52860x> bVar, C52670a<C52860x> aVar) {
        C52711k.m112240b(effect, "effect");
        C52711k.m112240b(bVar, "onUnlockSucceed");
        C52711k.m112240b(aVar, "onUnlockFailed");
        C46608f fVar = new C46608f();
        fVar.f117592a = C46059g.m100089m(effect);
        fVar.f117593b = C52575l.m112092a(effect.getEffectId());
        C17825i.m43739a(UnlockStickerApi.m101157a(C39618d.f101161b.mo34889b(fVar)), new UnLockStickerManagerServiceImpl$resolve2UnlockSticker$1(effect, bVar, aVar));
    }
}
