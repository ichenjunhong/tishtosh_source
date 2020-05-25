package com.google.firebase.iid;

import android.content.BroadcastReceiver.PendingResult;
import android.content.Intent;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

/* renamed from: com.google.firebase.iid.ag */
final class C17896ag {

    /* renamed from: a */
    final Intent f49730a;

    /* renamed from: b */
    private final PendingResult f49731b;

    /* renamed from: c */
    private boolean f49732c;

    /* renamed from: d */
    private final ScheduledFuture<?> f49733d;

    C17896ag(Intent intent, PendingResult pendingResult, ScheduledExecutorService scheduledExecutorService) {
        this.f49730a = intent;
        this.f49731b = pendingResult;
        this.f49733d = scheduledExecutorService.schedule(new C17897ah(this, intent), 4000, TimeUnit.MILLISECONDS);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public final synchronized void mo34738a() {
        if (!this.f49732c) {
            this.f49731b.finish();
            this.f49733d.cancel(false);
            this.f49732c = true;
        }
    }
}
