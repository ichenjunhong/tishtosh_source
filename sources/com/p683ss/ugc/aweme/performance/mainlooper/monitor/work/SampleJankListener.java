package com.p683ss.ugc.aweme.performance.mainlooper.monitor.work;

import com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51535d;
import com.p683ss.ugc.aweme.performance.core.monitor.p2590d.C51537a.C51541c;
import com.p683ss.ugc.aweme.performance.core.monitor.p2590d.C51543b;
import com.p683ss.ugc.aweme.performance.core.monitor.p2591e.C51545b;
import com.p683ss.ugc.aweme.performance.mainlooper.monitor.work.C51552a.C51553a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.ugc.aweme.performance.mainlooper.monitor.work.SampleJankListener */
public final class SampleJankListener implements C51543b {
    private long threshold = 100;

    public final long getThreshold() {
        return this.threshold;
    }

    public final void stop() {
        C51553a.m110681a().f128776i.removeCallbacksAndMessages(null);
    }

    public SampleJankListener() {
        C51552a a = C51553a.m110681a();
        long threshold2 = getThreshold();
        a.f128775h = threshold2;
        double d = (double) threshold2;
        double d2 = C51552a.f128771m;
        Double.isNaN(d);
        a.f128777j = (long) (d * d2);
    }

    public final void setThreshold(long j) {
        this.threshold = j;
    }

    public final void flush(C51535d dVar) {
        C51545b.f128762b.mo39173a(new C51541c(C51553a.m110681a(), dVar));
    }

    public final void onMessageArrive(String str, long j) {
        C52711k.m112240b(str, "messageName");
        C51552a a = C51553a.m110681a();
        C52711k.m112240b(str, "jankName");
        C51555c cVar = a.f128778k;
        C52711k.m112240b(str, "<set-?>");
        cVar.f128782a = str;
        a.f128778k.f128783b = j;
        a.f128776i.postDelayed(a.f128778k, a.f128777j);
    }

    public final void onMessageLeave(String str, long j) {
        C52711k.m112240b(str, "messageName");
        C51552a a = C51553a.m110681a();
        C52711k.m112240b(str, "messageName");
        if (j - a.f128778k.f128783b < a.f128777j) {
            a.f128776i.removeCallbacks(a.f128778k);
        }
    }

    public final void onJankHappened(String str, long j, long j2, long j3) {
        C52711k.m112240b(str, "messageName");
        C51553a.m110681a().mo103736a(str, j2);
    }
}
