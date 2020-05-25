package com.p683ss.android.ugc.p2454f;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.p2454f.C48918e.C48919a;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.f.a */
public final class C48911a implements C48919a {

    /* renamed from: a */
    private double f123061a = -1.0d;

    /* renamed from: a */
    public final double mo77253a(Queue<C48920f> queue, C48920f[] fVarArr) {
        return mo77254b(queue, fVarArr);
    }

    /* renamed from: b */
    public final double mo77254b(Queue<C48920f> queue, C48920f[] fVarArr) {
        if (queue.size() <= 0) {
            return -1.0d;
        }
        queue.toArray(fVarArr);
        long j = 0;
        int i = 0;
        for (int i2 = 0; i2 < queue.size(); i2++) {
            double d = (double) i;
            double d2 = fVarArr[i2].f123082c;
            Double.isNaN(d);
            i = (int) (d + d2);
            j += fVarArr[i2].f123083d;
        }
        double d3 = (double) i;
        Double.isNaN(d3);
        double d4 = d3 * 8.0d;
        double d5 = (double) j;
        Double.isNaN(d5);
        double d6 = d4 / (d5 / 1000.0d);
        if (d6 >= ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            this.f123061a = d6;
            return d6;
        }
        throw new IllegalArgumentException();
    }
}
