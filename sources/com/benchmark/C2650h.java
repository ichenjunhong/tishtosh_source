package com.benchmark;

import android.os.RemoteException;

/* renamed from: com.benchmark.h */
public final class C2650h implements Runnable {

    /* renamed from: a */
    public Benchmark f8092a;

    /* renamed from: b */
    public C2658l f8093b;

    /* renamed from: c */
    public C2651i f8094c;

    /* renamed from: d */
    public boolean f8095d;

    public final void run() {
        try {
            this.f8094c.mo7178a(this.f8092a);
        } catch (RemoteException e) {
            C2605a.m7549a((Throwable) e);
        }
        try {
            BenchmarkResult a = this.f8093b.mo7173a();
            if (a.f8015a == 0) {
                this.f8094c.mo7179a(this.f8092a, a);
            } else {
                this.f8094c.mo7180b(this.f8092a, a);
            }
        } catch (Throwable th) {
            try {
                C2651i iVar = this.f8094c;
                Benchmark benchmark = this.f8092a;
                BenchmarkResult benchmarkResult = new BenchmarkResult(this.f8092a, 10000, C2605a.m7554b(th), null, null);
                iVar.mo7180b(benchmark, benchmarkResult);
            } catch (RemoteException unused) {
                C2605a.m7549a(th);
            }
        }
    }

    public C2650h(Benchmark benchmark, C2658l lVar, C2651i iVar) {
        this.f8092a = benchmark;
        this.f8093b = lVar;
        this.f8094c = iVar;
    }
}
