package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C15948hq;
import com.google.android.gms.internal.ads.ama;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.w */
final class C15036w implements C15948hq<ama> {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f38847a;

    C15036w(CountDownLatch countDownLatch) {
        this.f38847a = countDownLatch;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        ama ama = (ama) obj;
        this.f38847a.countDown();
        ama.getView().setVisibility(0);
    }
}
