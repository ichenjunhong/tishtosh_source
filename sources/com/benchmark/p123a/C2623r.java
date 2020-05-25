package com.benchmark.p123a;

import com.benchmark.Benchmark;
import com.benchmark.BenchmarkResult;
import com.benchmark.C2658l;
import com.benchmark.C2665o;
import com.p683ss.android.vesdk.VEBenchmark;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.benchmark.a.r */
public final class C2623r implements C2658l {

    /* renamed from: a */
    private Benchmark f8033a;

    /* renamed from: c */
    public final void mo7171c() {
        VEBenchmark a = VEBenchmark.m108870a();
        a.f126671c.mo98738a();
        if (a.f126669a) {
            a.nativeClearCLInfo(a.f126670b);
            a.f126671c.mo98737a("clearCLInfo");
        }
    }

    /* renamed from: a */
    public final BenchmarkResult mo7173a() {
        Map map;
        VEBenchmark a = VEBenchmark.m108870a();
        a.f126671c.mo98738a();
        if (!a.f126669a) {
            map = new HashMap();
        } else {
            Map nativeGetALlCLInfo = a.nativeGetALlCLInfo(a.f126670b);
            a.f126671c.mo98737a("clearCLInfo");
            map = nativeGetALlCLInfo;
        }
        return new BenchmarkResult(this.f8033a, 0, "", map);
    }

    /* renamed from: b */
    public final int mo7170b() {
        int b = C2665o.m7657a().mo7218b();
        if (b != 0) {
            return b;
        }
        VEBenchmark a = VEBenchmark.m108870a();
        a.f126671c.mo98738a();
        if (!a.f126669a) {
            return -108;
        }
        int nativeInitOpenCL = a.nativeInitOpenCL(a.f126670b);
        a.f126671c.mo98737a("initOpenCL");
        return nativeInitOpenCL;
    }

    public C2623r(Benchmark benchmark) {
        this.f8033a = benchmark;
    }
}
