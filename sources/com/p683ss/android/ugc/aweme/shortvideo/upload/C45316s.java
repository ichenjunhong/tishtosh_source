package com.p683ss.android.ugc.aweme.shortvideo.upload;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.upload.s */
public final class C45316s {

    /* renamed from: a */
    public HandlerThread f114571a = new HandlerThread("PublishCommandExecutor");

    /* renamed from: b */
    private Handler f114572b;

    public C45316s() {
        this.f114571a.start();
        this.f114572b = new Handler(this.f114571a.getLooper());
    }

    /* renamed from: a */
    public final void mo91596a(C45313p pVar) throws InterruptedException {
        if (this.f114571a.isAlive()) {
            this.f114572b.post(new C45317t(pVar));
            return;
        }
        throw new InterruptedException("PublishCommandExecutor has quit");
    }
}
