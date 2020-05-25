package com.bytedance.android.livesdk.player;

import com.bytedance.android.live.core.p230g.C3891f;
import com.bytedance.android.livesdkapi.depend.p436d.C8626b;
import java.util.concurrent.Callable;

/* renamed from: com.bytedance.android.livesdk.player.b */
final /* synthetic */ class C8077b implements Callable {

    /* renamed from: a */
    private final C8072a f22063a;

    C8077b(C8072a aVar) {
        this.f22063a = aVar;
    }

    public final Object call() {
        C8626b.m17014a().mo15105a((Runnable) new C8079c(this.f22063a, C3891f.m9840a()));
        return null;
    }
}
