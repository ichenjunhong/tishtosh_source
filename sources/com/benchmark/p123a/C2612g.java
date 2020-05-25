package com.benchmark.p123a;

import com.benchmark.Benchmark;
import com.benchmark.C2665o;
import com.p683ss.android.vesdk.C50792y;
import com.p683ss.android.vesdk.VEBenchmark;

/* renamed from: com.benchmark.a.g */
public final class C2612g extends C2625t {
    /* renamed from: c */
    public final void mo7171c() {
    }

    /* renamed from: b */
    public final int mo7170b() {
        return C2665o.m7657a().mo7218b();
    }

    /* renamed from: d */
    public final int mo7172d() {
        int i;
        VEBenchmark a = VEBenchmark.m108870a();
        int i2 = this.f8035a.innerTimes;
        a.f126671c.mo98738a();
        if (!a.f126669a) {
            i = -105;
        } else {
            if (i2 < 0) {
                i2 = 1;
            }
            StringBuilder sb = new StringBuilder("runFaceDetection: times = ");
            sb.append(i2);
            C50792y.m109911b("VEBenchmark", sb.toString());
            int i3 = 0;
            for (int i4 = 0; i4 < i2; i4++) {
                i3 = a.faceDetection(a.f126670b);
                if (i3 < 0) {
                    break;
                }
            }
            a.f126671c.mo98737a("runFaceDetection");
            i = i3;
        }
        if (i >= 0) {
            return 0;
        }
        return i;
    }

    public C2612g(Benchmark benchmark) {
        super(benchmark);
    }
}
