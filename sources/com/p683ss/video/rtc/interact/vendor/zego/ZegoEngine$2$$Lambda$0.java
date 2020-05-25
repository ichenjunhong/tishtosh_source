package com.p683ss.video.rtc.interact.vendor.zego;

import com.p683ss.video.rtc.interact.vendor.zego.ZegoVideoClient.ZegoVideoCallback;

/* renamed from: com.ss.video.rtc.interact.vendor.zego.ZegoEngine$2$$Lambda$0 */
final /* synthetic */ class ZegoEngine$2$$Lambda$0 implements ZegoVideoCallback {
    private final C517182 arg$1;

    ZegoEngine$2$$Lambda$0(C517182 r1) {
        this.arg$1 = r1;
    }

    public final void onVideoFrameRenderSuccess() {
        this.arg$1.lambda$create$0$ZegoEngine$2();
    }
}
