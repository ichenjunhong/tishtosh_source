package com.p683ss.android.ugc.aweme.net.p1993f;

import com.p683ss.android.ugc.aweme.experiment.ProfileUiInitOptimizeEnterThreshold;
import com.p683ss.android.ugc.p2454f.C48918e.C48919a;
import com.p683ss.android.ugc.p2454f.C48920f;
import com.toutiao.proxyserver.p2613e.C51822a;
import java.util.Queue;

/* renamed from: com.ss.android.ugc.aweme.net.f.a */
public final class C37771a implements C48919a {

    /* renamed from: a */
    private double f96236a;

    /* renamed from: a */
    public final double mo77253a(Queue<C48920f> queue, C48920f[] fVarArr) {
        return this.f96236a;
    }

    /* renamed from: b */
    public final double mo77254b(Queue<C48920f> queue, C48920f[] fVarArr) {
        double b = C51822a.m111147a().mo107320b() * 1000.0d;
        if (b < ProfileUiInitOptimizeEnterThreshold.DEFAULT) {
            b = -1.0d;
        }
        this.f96236a = b;
        return this.f96236a;
    }
}
