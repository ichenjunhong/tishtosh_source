package com.bytedance.android.live.broadcast.effect.sticker.p210ui;

import com.bytedance.android.live.broadcast.api.C3037b;
import com.bytedance.android.live.broadcast.effect.sticker.p210ui.C3338i.C3340b;
import com.bytedance.android.live.broadcast.p211f.C3395f;
import com.bytedance.android.livesdkapi.depend.model.C8688c;

/* renamed from: com.bytedance.android.live.broadcast.effect.sticker.ui.f */
final /* synthetic */ class C3308f implements C3340b {

    /* renamed from: a */
    private final C3306e f9524a;

    C3308f(C3306e eVar) {
        this.f9524a = eVar;
    }

    /* renamed from: a */
    public final void mo8685a(Boolean bool, C8688c cVar) {
        C3306e eVar = this.f9524a;
        if (!bool.booleanValue()) {
            C3395f.m9156f().mo8740a().mo8274b(C3037b.f8913a, cVar);
        } else if (eVar.f9513a.mo8282a(cVar)) {
            C3395f.m9156f().mo8740a().mo8268a(C3037b.f8913a, cVar);
        }
    }
}
