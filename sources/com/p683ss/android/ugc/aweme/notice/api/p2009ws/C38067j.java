package com.p683ss.android.ugc.aweme.notice.api.p2009ws;

import android.os.Handler;
import android.os.Looper;
import com.bytedance.ies.geckoclient.C10885e;
import com.p683ss.android.ugc.aweme.utils.C47925go;

/* renamed from: com.ss.android.ugc.aweme.notice.api.ws.j */
final /* synthetic */ class C38067j implements Runnable {

    /* renamed from: a */
    static final Runnable f96854a = new C38067j();

    private C38067j() {
    }

    public final void run() {
        C10885e normalGeckoClient = C47925go.m103695a().getNormalGeckoClient();
        if (normalGeckoClient != null) {
            Handler handler = new Handler(Looper.getMainLooper());
            normalGeckoClient.getClass();
            handler.post(new C38070m(normalGeckoClient));
        }
    }
}
