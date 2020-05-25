package com.p683ss.avframework.livestreamv2.core.interact;

import com.p683ss.video.rtc.interact.model.MixStreamInfo;

/* renamed from: com.ss.avframework.livestreamv2.core.interact.AnchorInternal$$Lambda$0 */
final /* synthetic */ class AnchorInternal$$Lambda$0 implements Runnable {
    private final AnchorInternal arg$1;
    private final MixStreamInfo arg$2;

    AnchorInternal$$Lambda$0(AnchorInternal anchorInternal, MixStreamInfo mixStreamInfo) {
        this.arg$1 = anchorInternal;
        this.arg$2 = mixStreamInfo;
    }

    public final void run() {
        this.arg$1.lambda$mixStream$0$AnchorInternal(this.arg$2);
    }
}
