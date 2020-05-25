package com.p683ss.video.rtc.base.net;

import java.util.List;
import okhttp3.C53662o;

/* renamed from: com.ss.video.rtc.base.net.RtcNet$$Lambda$0 */
final /* synthetic */ class RtcNet$$Lambda$0 implements C53662o {
    private final RtcNetBaseRequestModel arg$1;

    RtcNet$$Lambda$0(RtcNetBaseRequestModel rtcNetBaseRequestModel) {
        this.arg$1 = rtcNetBaseRequestModel;
    }

    public final List lookup(String str) {
        return RtcNet.lambda$setCustomDnsReslov$0$RtcNet(this.arg$1, str);
    }
}
