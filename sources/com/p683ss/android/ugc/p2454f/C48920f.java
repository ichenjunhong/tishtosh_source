package com.p683ss.android.ugc.p2454f;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;

/* renamed from: com.ss.android.ugc.f.f */
public final class C48920f implements Comparable<C48920f> {

    /* renamed from: a */
    public static boolean f123080a = true;

    /* renamed from: b */
    public double f123081b;

    /* renamed from: c */
    public double f123082c;

    /* renamed from: d */
    public long f123083d;

    /* renamed from: e */
    public long f123084e;

    public final String toString() {
        StringBuilder sb = new StringBuilder("SpeedRecord{mSpeed=");
        sb.append(this.f123081b);
        sb.append(", mWeight=");
        sb.append(this.f123082c);
        sb.append(", mCostTime=");
        sb.append(this.f123083d);
        sb.append(", currentTime=");
        sb.append(this.f123084e);
        sb.append('}');
        return sb.toString();
    }

    public final /* bridge */ /* synthetic */ int compareTo(Object obj) {
        C48920f fVar = (C48920f) obj;
        if (this.f123081b == fVar.f123081b) {
            return 0;
        }
        if (this.f123081b < fVar.f123081b) {
            return -1;
        }
        return 1;
    }

    public C48920f(double d, double d2, long j, long j2) {
        this.f123081b = d;
        this.f123082c = d2;
        this.f123083d = j;
        this.f123084e = j2;
        if (!f123080a) {
            return;
        }
        if (this.f123081b < ProfileUiInitOptimizeEnterThreshold.DEFAULT || this.f123082c < ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            throw new IllegalArgumentException(toString());
        }
    }
}
