package com.bytedance.android.live.core.performance;

import android.view.Choreographer;
import android.view.Choreographer.FrameCallback;
import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.util.HashMap;

public class FpsSampler extends BaseSampler<Double> implements FrameCallback {

    /* renamed from: f */
    Choreographer f11065f;

    /* renamed from: g */
    public int f11066g = -1;

    /* renamed from: h */
    boolean f11067h;

    /* renamed from: i */
    private long f11068i = -1;

    /* renamed from: j */
    private long f11069j = -1;

    public void run() {
    }

    public void doFrame(long j) {
        if (!this.f11067h) {
            if (this.f11068i == -1) {
                this.f11068i = j;
            } else {
                this.f11066g++;
            }
            this.f11069j = j;
            this.f11065f.postFrameCallback(this);
        }
    }

    /* renamed from: a */
    public final void mo9361a(HashMap<String, String> hashMap) {
        double d;
        if (this.f11069j == this.f11068i) {
            d = 0.0d;
        } else {
            double d2 = (double) this.f11066g;
            Double.isNaN(d2);
            double d3 = d2 * 1.0E9d;
            double d4 = (double) (this.f11069j - this.f11068i);
            Double.isNaN(d4);
            d = d3 / d4;
        }
        if (d != ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            mo9360a(Double.valueOf(d));
        }
        super.mo9361a(hashMap);
        this.f11067h = true;
        this.f11065f.removeFrameCallback(this);
        this.f11068i = -1;
        this.f11069j = -1;
        this.f11066g = 0;
    }

    public FpsSampler(Choreographer choreographer, int i, int i2) {
        super(i, 3000);
        this.f11065f = choreographer;
    }
}
