package com.p683ss.android.ugc.aweme.notice.api.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.notice.api.bean.LiveMessage */
public class LiveMessage extends C38034b {
    public static final int LIVE_START = 1;
    @C17952c(mo34828a = "anchor_avatar")
    private UrlModel anchorAvatar;
    @C17952c(mo34828a = "anchor_id")
    private String anchorId;
    @C17952c(mo34828a = "type")
    private int liveMessageType;

    public UrlModel getAnchorAvatar() {
        return this.anchorAvatar;
    }

    public String getAnchorId() {
        return this.anchorId;
    }

    public int getLiveMessageType() {
        return this.liveMessageType;
    }

    public LiveMessage() {
        this.msgType = C38037d.LIVE;
    }

    public void setAnchorAvatar(UrlModel urlModel) {
        this.anchorAvatar = urlModel;
    }

    public void setAnchorId(String str) {
        this.anchorId = str;
    }

    public void setLiveMessageType(int i) {
        this.liveMessageType = i;
    }
}
