package com.p683ss.android.ugc.p2454f;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.p2454f.C48918e.C48919a;
import java.util.Arrays;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.f.b */
public final class C48912b implements C48919a {

    /* renamed from: a */
    private double f123062a = -1.0d;

    /* renamed from: a */
    public final double mo77253a(Queue<C48920f> queue, C48920f[] fVarArr) {
        return mo77254b(queue, fVarArr);
    }

    /* renamed from: b */
    public final double mo77254b(Queue<C48920f> queue, C48920f[] fVarArr) {
        double d = -1.0d;
        if (queue.size() <= 0) {
            return -1.0d;
        }
        queue.toArray(fVarArr);
        int i = 0;
        Arrays.sort(fVarArr, 0, queue.size());
        int size = queue.size();
        double d2 = 0.0d;
        for (int i2 = 0; i2 < size; i2++) {
            d2 += fVarArr[i2].f123082c;
        }
        double d3 = d2 / 2.0d;
        while (true) {
            if (i >= size) {
                break;
            }
            d3 -= fVarArr[i].f123082c;
            if (d3 <= ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
                d = fVarArr[i].f123081b;
                break;
            }
            i++;
        }
        if (d >= ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            this.f123062a = d;
            return d;
        }
        throw new IllegalArgumentException();
    }
}
