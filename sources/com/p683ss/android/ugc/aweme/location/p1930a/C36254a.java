package com.p683ss.android.ugc.aweme.location.p1930a;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.location.a.a */
public final class C36254a implements Serializable {

    /* renamed from: a */
    private final double f92820a;

    /* renamed from: b */
    private final double f92821b;

    /* renamed from: c */
    private final long f92822c;

    /* renamed from: d */
    private final float f92823d;

    public final float getAccuracy() {
        return this.f92823d;
    }

    public final double getLatitude() {
        return this.f92820a;
    }

    public final long getLocateTime() {
        return this.f92822c;
    }

    public final double getLongitude() {
        return this.f92821b;
    }

    public final boolean isValid() {
        if (this.f92820a == ProfileUiInitOptimizeEnterThreshold.DEFAULT || this.f92821b == ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            return false;
        }
        return true;
    }

    public C36254a(double d, double d2, long j, float f) {
        this.f92820a = d;
        this.f92821b = d2;
        this.f92822c = j;
        this.f92823d = f;
    }
}
