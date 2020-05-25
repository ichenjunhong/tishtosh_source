package com.bytedance.android.livesdk.player;

import com.bytedance.android.live.core.p230g.C3920x;
import com.bytedance.android.livesdkapi.depend.p436d.C8626b;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.livesdk.player.n */
final /* synthetic */ class C8104n implements Callable {

    /* renamed from: a */
    private final C8097k f22132a;

    C8104n(C8097k kVar) {
        this.f22132a = kVar;
    }

    public final Object call() {
        C8626b.m17014a().mo15105a((Runnable) new C8105o(this.f22132a, ((float) C3920x.m9896a()) / 1024.0f));
        return null;
    }
}
