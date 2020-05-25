package com.benchmark.p123a;

import com.benchmark.Benchmark;
import com.benchmark.BenchmarkResult;
import com.benchmark.C2658l;

/* renamed from: com.benchmark.a.s */
public final class C2624s implements C2658l {

    /* renamed from: a */
    private Benchmark f8034a;

    /* renamed from: b */
    public final int mo7170b() {
        return 0;
    }

    /* renamed from: c */
    public final void mo7171c() {
    }

    /* renamed from: a */
    public final BenchmarkResult mo7173a() {
        try {
            Thread.sleep(10);
        } catch (InterruptedException unused) {
        }
        return new BenchmarkResult(this.f8034a, 10005, "default task", (long[]) null);
    }

    public C2624s(Benchmark benchmark) {
        this.f8034a = benchmark;
    }
}
