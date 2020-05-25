package com.benchmark.p123a;

import android.os.SystemClock;
import com.benchmark.Benchmark;
import com.benchmark.BenchmarkResult;
import com.benchmark.C2658l;

/* renamed from: com.benchmark.a.t */
public abstract class C2625t implements C2658l {

    /* renamed from: a */
    protected Benchmark f8035a;

    /* renamed from: d */
    public abstract int mo7172d();

    /* renamed from: a */
    public final BenchmarkResult mo7173a() {
        long[] jArr = new long[this.f8035a.times];
        C2626u uVar = new C2626u(this);
        int i = 0;
        int i2 = 0;
        while (true) {
            if (i >= jArr.length) {
                break;
            }
            long uptimeMillis = SystemClock.uptimeMillis();
            int a = uVar.mo7174a();
            if (a != 0) {
                i2 = a;
                break;
            }
            jArr[i] = SystemClock.uptimeMillis() - uptimeMillis;
            i++;
            i2 = a;
        }
        return new BenchmarkResult(this.f8035a, i2, "", jArr);
    }

    public C2625t(Benchmark benchmark) {
        this.f8035a = benchmark;
    }
}
