package com.bytedance.android.live.core.p230g;

import android.graphics.Bitmap;
import com.bytedance.android.live.core.p230g.C3909r.C3911b;

/* renamed from: com.bytedance.android.live.core.g.n */
final /* synthetic */ class C3904n implements Runnable {

    /* renamed from: a */
    private final C3911b f10919a;

    /* renamed from: b */
    private final Bitmap f10920b;

    C3904n(C3911b bVar, Bitmap bitmap) {
        this.f10919a = bVar;
        this.f10920b = bitmap;
    }

    public final void run() {
        this.f10919a.mo9273a(this.f10920b);
    }
}
