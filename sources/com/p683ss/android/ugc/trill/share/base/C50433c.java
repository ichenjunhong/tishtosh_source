package com.p683ss.android.ugc.trill.share.base;

import com.p683ss.android.ugc.aweme.services.watermark.IWaterMarkService;
import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.trill.share.base.c */
final /* synthetic */ class C50433c implements Callable {

    /* renamed from: a */
    private final C50418a f126476a;

    C50433c(C50418a aVar) {
        this.f126476a = aVar;
    }

    public final Object call() {
        C50418a aVar = this.f126476a;
        ((IWaterMarkService) aVar.f126410D.get()).prepareDataForI18n(aVar.f126446v);
        return null;
    }
}
