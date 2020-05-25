package com.p683ss.android.ugc.aweme.services;

import java.util.concurrent.Callable;

/* renamed from: com.ss.android.ugc.aweme.services.AVPublishServiceImpl$$Lambda$3 */
final /* synthetic */ class AVPublishServiceImpl$$Lambda$3 implements Callable {
    private final AVPublishServiceImpl arg$1;
    private final long arg$2;
    private final long arg$3;

    AVPublishServiceImpl$$Lambda$3(AVPublishServiceImpl aVPublishServiceImpl, long j, long j2) {
        this.arg$1 = aVPublishServiceImpl;
        this.arg$2 = j;
        this.arg$3 = j2;
    }

    public final Object call() {
        return this.arg$1.lambda$setLiveThumCallback$3$AVPublishServiceImpl(this.arg$2, this.arg$3);
    }
}
