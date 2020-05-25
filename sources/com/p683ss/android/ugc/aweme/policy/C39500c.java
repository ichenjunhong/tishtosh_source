package com.p683ss.android.ugc.aweme.policy;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.policy.c */
public final /* synthetic */ class C39500c implements Callable {

    /* renamed from: a */
    public static final Callable f101049a = new C39500c();

    private C39500c() {
    }

    public final Object call() {
        return (Policy) PolicyApi.f101040a.checkPolicyVersion().get();
    }
}
