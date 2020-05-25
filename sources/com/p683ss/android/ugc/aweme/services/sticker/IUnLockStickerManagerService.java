package com.p683ss.android.ugc.aweme.services.sticker;

import com.p683ss.android.ugc.aweme.sticker.types.unlock.LockStickerTextBean;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.ArrayList;
import java.util.List;
import p2628d.C52860x;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2640a.C52671b;

/* renamed from: com.ss.android.ugc.aweme.services.sticker.IUnLockStickerManagerService */
public interface IUnLockStickerManagerService {
    void addUnlockedStickerId(String str);

    void clearUnlockedStickerIds();

    LockStickerTextBean getDefaultTextBean();

    LockStickerTextBean getShareString(Effect effect);

    LockStickerTextBean getTextBeanForActivity(Effect effect);

    ArrayList<String> getUnlockedStickerIds();

    boolean getUpdateState();

    void resolve2UnlockSticker(Effect effect, C52671b<? super Integer, C52860x> bVar, C52670a<C52860x> aVar);

    void updateLockStickerTextBeans(List<? extends LockStickerTextBean> list);

    void updateUnlockedStickerIdList(List<String> list);
}
