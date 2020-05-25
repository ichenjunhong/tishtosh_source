package com.bytedance.android.live.core.performance;

public class CpuSampler extends BaseSampler<Double> {
    public void run() {
        mo9360a(Double.valueOf(C3973a.m10055a()));
        if (this.f11061c != null) {
            this.f11061c.postDelayed(this, (long) this.f11059a);
        }
    }

    public CpuSampler(int i, int i2) {
        super(i, 3000);
    }
}
