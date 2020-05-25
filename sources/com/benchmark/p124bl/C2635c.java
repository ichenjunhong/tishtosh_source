package com.benchmark.p124bl;

import com.benchmark.C2605a;
import com.bytedance.ies.ugc.p694a.C11010c;
import com.p683ss.android.ugc.aweme.p1439bl.C23859b;
import com.p683ss.android.ugc.aweme.utils.C47760cd;
import java.util.concurrent.Callable;

/* renamed from: com.benchmark.bl.c */
final /* synthetic */ class C2635c implements Callable {

    /* renamed from: a */
    private final boolean f8068a;

    C2635c(boolean z) {
        this.f8068a = z;
    }

    public final Object call() {
        if (this.f8068a) {
            return (BenchmarkResponse) C47760cd.m103384a(C2605a.m7553b("/sdcard/benchmark.json"), BenchmarkResponse.class);
        }
        return (BenchmarkResponse) C23859b.m58575b().mo49459a(C11010c.m22280a(), "benchmark", BenchmarkResponse.class);
    }
}
