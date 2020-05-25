package com.benchmark.p123a;

import com.benchmark.Benchmark;
import com.benchmark.C2665o;
import com.p683ss.android.vesdk.C50792y;
import com.p683ss.android.vesdk.VEBenchmark;

/* renamed from: com.benchmark.a.n */
public final class C2619n extends C2625t {
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
        StringBuilder sb = new StringBuilder("runHistogramEqualization: times = ");
        sb.append(i);
        C50792y.m109911b("VEBenchmark", sb.toString());
        for (int i2 = 0; i2 < i; i2++) {
            a.histogramEqualization(a.f126670b);
        }
        a.f126671c.mo98737a("runHistogramEqualization");
        return 0;
    }

    public C2619n(Benchmark benchmark) {
        super(benchmark);
    }
}
