package com.google.android.play.core.p1053e.p1055b;

import android.os.SystemClock;
import java.util.List;

/* renamed from: com.google.android.play.core.e.b.f */
final class C17336f implements Runnable {

    /* renamed from: a */
    private final /* synthetic */ long f48842a;

    /* renamed from: b */
    private final /* synthetic */ List f48843b;

    /* renamed from: c */
    private final /* synthetic */ List f48844c;

    /* renamed from: d */
    private final /* synthetic */ C17330a f48845d;

    C17336f(C17330a aVar, long j, List list, List list2) {
        this.f48845d = aVar;
        this.f48842a = j;
        this.f48843b = list;
        this.f48844c = list2;
    }

    public final void run() {
        long j = this.f48842a / 3;
        long j2 = 0;
        for (int i = 0; ((long) i) < 3; i++) {
            j2 = Math.min(this.f48842a, j2 + j);
            this.f48845d.m42433b(2, 0, Long.valueOf(j2), null, null, null);
            SystemClock.sleep(C17330a.f48820a);
        }
        if (this.f48845d.f48826g.get()) {
            this.f48845d.m42432b(6, -6);
        } else {
            this.f48845d.mo33623a(this.f48843b, this.f48844c, this.f48842a, false);
        }
    }
}
