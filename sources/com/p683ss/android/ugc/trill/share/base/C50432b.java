package com.p683ss.android.ugc.trill.share.base;

import com.p683ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.trill.share.base.b */
final /* synthetic */ class C50432b implements Callable {

    /* renamed from: a */
    private final C50418a f126475a;

    C50432b(C50418a aVar) {
        this.f126475a = aVar;
    }

    public final Object call() {
        C50418a aVar = this.f126475a;
        ((IWaterMarkService) aVar.f126410D.get()).prepareDataForI18n(aVar.f126446v);
        return null;
    }
}
