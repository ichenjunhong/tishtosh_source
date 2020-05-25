package com.benchmark;

/* renamed from: com.benchmark.e */
final /* synthetic */ class C2647e implements Runnable {

    /* renamed from: a */
    private final C2629a f8084a;

    /* renamed from: b */
    private final Benchmark f8085b;

    /* renamed from: c */
    private final BenchmarkResult f8086c;

    C2647e(C2629a aVar, Benchmark benchmark, BenchmarkResult benchmarkResult) {
        this.f8084a = aVar;
        this.f8085b = benchmark;
        this.f8086c = benchmarkResult;
    }

    public final void run() {
        C2629a aVar = this.f8084a;
        Benchmark benchmark = this.f8085b;
        BenchmarkResult benchmarkResult = this.f8086c;
        aVar.f8049a = null;
        if (C2627b.this.f8040b != null) {
            C2627b.this.f8040b.mo7189a(benchmark, benchmarkResult);
        }
    }
}
