package com.benchmark.p123a;

import com.benchmark.Benchmark;
import com.benchmark.C2665o;
import com.p683ss.android.vesdk.C50792y;
import com.p683ss.android.vesdk.VEBenchmark;

/* renamed from: com.benchmark.a.j */
public final class C2615j extends C2625t {
    /* renamed from: c */
    public final void mo7171c() {
    }

    /* renamed from: b */
    public final int mo7170b() {
        return C2665o.m7657a().mo7218b();
    }

    /* renamed from: d */
    public final int mo7172d() {
        VEBenchmark a = VEBenchmark.m108870a();
        int i = this.f8035a.innerTimes;
        a.f126671c.mo98738a();
        if (i < 0) {
            i = 1;
        }
        StringBuilder sb = new StringBuilder("runGaussianBlurCPU: times = ");
        sb.append(i);
        C50792y.m109911b("VEBenchmark", sb.toString());
        int i2 = 0;
        for (int i3 = 0; i3 < i; i3++) {
            i2 = a.gaussianBlurCPU(a.f126670b);
            if (i2 != 0) {
                break;
            }
        }
        a.f126671c.mo98737a("runGaussianBlurCPU");
        return i2;
    }

    public C2615j(Benchmark benchmark) {
        super(benchmark);
    }
}
