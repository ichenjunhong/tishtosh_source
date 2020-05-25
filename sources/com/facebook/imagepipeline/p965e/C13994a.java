package com.facebook.imagepipeline.p965e;

import java.util.concurrent.Executor;

/* renamed from: com.facebook.imagepipeline.e.a */
public final class C13994a implements C13999f {

    /* renamed from: a */
    private final Executor f36474a = C13995b.m28534a(2, new C14018l(10, "FrescoIoBoundExecutor", true));

    /* renamed from: b */
    private final Executor f36475b;

    /* renamed from: c */
    private final Executor f36476c;

    /* renamed from: d */
    private final Executor f36477d;

    /* renamed from: a */
    public final Executor mo26174a() {
        return this.f36474a;
    }

    /* renamed from: b */
    public final Executor mo26175b() {
        return this.f36474a;
    }

    /* renamed from: c */
    public final Executor mo26176c() {
        return this.f36475b;
    }

    /* renamed from: d */
    public final Executor mo26177d() {
        return this.f36476c;
    }

    /* renamed from: e */
    public final Executor mo26178e() {
        return this.f36477d;
    }

    public C13994a(int i) {
        this.f36475b = C13995b.m28534a(i, new C14018l(10, "FrescoDecodeExecutor", true));
        this.f36476c = C13995b.m28534a(i, new C14018l(10, "FrescoBackgroundExecutor", true));
        this.f36477d = C13995b.m28534a(1, new C14018l(10, "FrescoLightWeightBackgroundExecutor", true));
    }
}
