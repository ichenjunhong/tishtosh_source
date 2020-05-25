package com.p683ss.avframework.livestreamv2.core;

import com.p683ss.video.rtc.interact.controller.AnchorController.StreamMixer;
import com.p683ss.video.rtc.interact.model.MixStreamInfo;
import java.util.List;

/* renamed from: com.ss.avframework.livestreamv2.core.Anchor$$Lambda$0 */
final /* synthetic */ class Anchor$$Lambda$0 implements StreamMixer {
    private final Anchor arg$1;

    Anchor$$Lambda$0(Anchor anchor) {
        this.arg$1 = anchor;
    }

    public final MixStreamInfo mixStream(int i, int i2, String str, List list, List list2) {
        return this.arg$1.lambda$stop$0$Anchor(i, i2, str, list, list2);
    }
}
