package com.benchmark;

import com.p683ss.android.ugc.aweme.out.AVExternalServiceImpl;
import java.util.concurrent.Callable;

/* renamed from: com.benchmark.d */
final /* synthetic */ class C2646d implements Callable {

    /* renamed from: a */
    static final Callable f8083a = new C2646d();

    private C2646d() {
    }

    public final Object call() {
        AVExternalServiceImpl.getAVServiceImpl_Monster().abilityService().libraryLoaderService().setLoader(C2645c.f8082a);
        return null;
    }
}
