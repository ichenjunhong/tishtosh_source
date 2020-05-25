package com.bytedance.android.live.broadcast.effect.sticker.p210ui;

import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.effect.sticker.p210ui.C3360v.C3362b;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.livesdkapi.depend.model.C8688c;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.q */
final /* synthetic */ class C3351q implements C3362b {

    /* renamed from: a */
    private final C3344m f9626a;

    C3351q(C3344m mVar) {
        this.f9626a = mVar;
    }

    /* renamed from: a */
    public final void mo8723a(C8688c cVar, C8688c cVar2) {
        C3344m mVar = this.f9626a;
        if (cVar2 == null) {
            mVar.f9611b.lambda$put$1$DataCenter("cmd_sticker_tip", "");
        } else {
            mVar.f9611b.lambda$put$1$DataCenter("cmd_sticker_tip", cVar2.f23762w);
        }
        C3395f.m9156f().mo8740a().mo8269a(C3037b.f8914b, cVar, cVar2);
    }
}
