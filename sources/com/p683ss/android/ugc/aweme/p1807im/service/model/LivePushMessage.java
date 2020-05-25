package com.p683ss.android.ugc.aweme.p1807im.service.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.im.service.model.LivePushMessage */
public final class LivePushMessage implements Serializable {
    @C17952c(mo34828a = "anchor_id")
    private long anchorId;
    @C17952c(mo34828a = "anchor_type")
    private int anchorType;
    @C17952c(mo34828a = "avatar")
    private UrlModel avatar;
    @C17952c(mo34828a = "log_pb")
    private String logPb = "";
    @C17952c(mo34828a = "nickname")
    private String nickname = "";
    @C17952c(mo34828a = "request_id")
    private String requestId = "";
    @C17952c(mo34828a = "room_id")
    private long roomId;
    @C17952c(mo34828a = "schema")
    private String schema = "";
    @C17952c(mo34828a = "text")
    private String text = "";

    public final long getAnchorId() {
        return this.anchorId;
    }

    public final int getAnchorType() {
        return this.anchorType;
    }

    public final UrlModel getAvatar() {
        return this.avatar;
    }

    public final String getLogPb() {
        return this.logPb;
    }

    public final String getNickname() {
        return this.nickname;
    }

    public final String getRequestId() {
        return this.requestId;
    }

    public final long getRoomId() {
        return this.roomId;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final String getText() {
        return this.text;
    }

    public final void setAnchorId(long j) {
        this.anchorId = j;
    }

    public final void setAnchorType(int i) {
        this.anchorType = i;
    }

    public final void setAvatar(UrlModel urlModel) {
        this.avatar = urlModel;
    }

    public final void setRoomId(long j) {
        this.roomId = j;
    }

    public final void setLogPb(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.logPb = str;
    }

    public final void setNickname(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.nickname = str;
    }

    public final void setRequestId(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.requestId = str;
    }

    public final void setSchema(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.schema = str;
    }

    public final void setText(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.text = str;
    }
}
