package com.p683ss.android.ugc.aweme.share;

import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import com.p683ss.android.ugc.aweme.services.sticker.IStickerUtilsService;
import com.p683ss.android.ugc.aweme.sticker.model.C46069d;
import com.p683ss.android.ugc.aweme.sticker.model.C46070e;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import java.util.List;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.share.ae */
final /* synthetic */ class C41960ae implements C0011g {

    /* renamed from: a */
    private final C419529 f106213a;

    /* renamed from: b */
    private final Effect f106214b;

    /* renamed from: c */
    private final String f106215c;

    C41960ae(C419529 r1, Effect effect, String str) {
        this.f106213a = r1;
        this.f106214b = effect;
        this.f106215c = str;
    }

    public final Object then(C0013i iVar) {
        C419529 r0 = this.f106213a;
        Effect effect = this.f106214b;
        String str = this.f106215c;
        boolean z = false;
        if (!iVar.mo31c() && !iVar.mo33d() && iVar.mo34e() != null) {
            List<C46069d> list = ((C46070e) iVar.mo34e()).mStickers;
            if (!(list == null || list.size() == 0)) {
                IStickerUtilsService stickerInfo = AVExternalServiceImpl.getAVServiceImpl_Monster().infoService().stickerInfo();
                C46069d dVar = (C46069d) list.get(0);
                if (stickerInfo != null && stickerInfo.isLockCommerceFaceSticker(dVar)) {
                    stickerInfo.showCommerceStickerDialog(C41941ab.this.f106166f, dVar, "homepage_hot");
                    z = true;
                }
            }
        }
        if (!z) {
            C41941ab.this.mo86054b(effect, str);
        }
        return null;
    }
}
