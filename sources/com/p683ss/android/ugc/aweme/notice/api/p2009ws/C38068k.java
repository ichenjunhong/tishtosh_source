package com.p683ss.android.ugc.aweme.notice.api.p2009ws;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.geckoclient.C10885e;
import com.bytedance.ies.geckoclient.model.C10967l;
import com.p683ss.android.ugc.aweme.utils.C47925go;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.k */
final /* synthetic */ class C38068k implements Runnable {

    /* renamed from: a */
    private final C10967l f96855a;

    C38068k(C10967l lVar) {
        this.f96855a = lVar;
    }

    public final void run() {
        C10967l lVar = this.f96855a;
        C10885e normalGeckoClient = C47925go.m103695a().getNormalGeckoClient();
        if (normalGeckoClient != null) {
            new Handler(Looper.getMainLooper()).post(new C38069l(normalGeckoClient, lVar));
        }
    }
}
