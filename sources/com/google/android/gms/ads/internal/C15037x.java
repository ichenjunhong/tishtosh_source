package com.google.android.gms.ads.internal;

import com.google.android.gms.internal.ads.C15948hq;
import com.google.android.gms.internal.ads.abv;
import com.google.android.gms.internal.ads.ama;
import java.util.Map;
import java.util.concurrent.CountDownLatch;

/* renamed from: com.google.android.gms.ads.internal.x */
final class C15037x implements C15948hq<ama> {

    /* renamed from: a */
    private final /* synthetic */ CountDownLatch f38848a;

    C15037x(CountDownLatch countDownLatch) {
        this.f38848a = countDownLatch;
    }

    /* renamed from: a */
    public final /* synthetic */ void mo27606a(Object obj, Map map) {
        ama ama = (ama) obj;
        abv.m32798e("Adapter returned an ad, but assets substitution failed");
        this.f38848a.countDown();
        ama.destroy();
    }
}
