package com.benchmark;

/* renamed from: com.benchmark.f */
final /* synthetic */ class C2648f implements Runnable {

    /* renamed from: a */
    private final C2629a f8087a;

    /* renamed from: b */
    private final Benchmark f8088b;

    /* renamed from: c */
    private final BenchmarkResult f8089c;

    C2648f(C2629a aVar, Benchmark benchmark, BenchmarkResult benchmarkResult) {
        this.f8087a = aVar;
        this.f8088b = benchmark;
        this.f8089c = benchmarkResult;
    }

    public final void run() {
        C2629a aVar = this.f8087a;
        Benchmark benchmark = this.f8088b;
        BenchmarkResult benchmarkResult = this.f8089c;
        aVar.f8049a = null;
        if (C2627b.this.f8040b != null) {
            C2627b.this.f8040b.mo7194b(benchmark, benchmarkResult);
        }
    }
}
