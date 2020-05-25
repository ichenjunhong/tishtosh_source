package com.p683ss.android.ugc.aweme.tools.mvtemplate.net;

import com.p683ss.android.ugc.effectmanager.common.model.BaseNetResponse;

/* renamed from: com.ss.android.ugc.aweme.tools.mvtemplate.net.VideoResponse */
public final class VideoResponse extends BaseNetResponse {
    private VideoItemInfo data;

    public final VideoItemInfo getData() {
        return this.data;
    }

    public final void setData(VideoItemInfo videoItemInfo) {
        this.data = videoItemInfo;
    }
}
