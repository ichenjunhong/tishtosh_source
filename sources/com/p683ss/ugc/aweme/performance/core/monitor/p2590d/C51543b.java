package com.p683ss.ugc.aweme.performance.core.monitor.p2590d;

import com.p683ss.ugc.aweme.performance.core.monitor.p2588b.C51535d;

/* renamed from: com.ss.ugc.aweme.performance.core.monitor.d.b */
public interface C51543b {
    void flush(C51535d dVar);

    void onJankHappened(String str, long j, long j2, long j3);

    void onMessageArrive(String str, long j);

    void onMessageLeave(String str, long j);

    void setThreshold(long j);
}
