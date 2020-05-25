package com.p683ss.avframework.livestreamv2;

import com.p683ss.avframework.livestreamv2.log.ILogUploader;
import org.json.JSONObject;

/* renamed from: com.ss.avframework.livestreamv2.LiveStreamBuilder$$Lambda$0 */
final /* synthetic */ class LiveStreamBuilder$$Lambda$0 implements ILogUploader {
    static final ILogUploader $instance = new LiveStreamBuilder$$Lambda$0();

    private LiveStreamBuilder$$Lambda$0() {
    }

    public final void uploadLog(JSONObject jSONObject) {
        LiveStreamBuilder.lambda$releaseHandles$0$LiveStreamBuilder(jSONObject);
    }
}
