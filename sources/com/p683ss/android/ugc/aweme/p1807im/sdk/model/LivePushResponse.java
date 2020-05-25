package com.p683ss.android.ugc.aweme.p1807im.sdk.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.p1807im.service.model.LivePushMessage;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.model.LivePushResponse */
public final class LivePushResponse extends BaseResponse implements Serializable {
    @C17952c(mo34828a = "data")
    private LivePushMessage data;

    public final LivePushMessage getData() {
        return this.data;
    }

    public final void setData(LivePushMessage livePushMessage) {
        this.data = livePushMessage;
    }
}
