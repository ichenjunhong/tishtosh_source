package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.NewFaceSticker */
public final class NewFaceSticker implements Serializable {
    @C17952c(mo34828a = "desc")
    private String desc;
    @C17952c(mo34828a = "effect_id")
    private String effectId;
    @C17952c(mo34828a = "icon_url")
    private UrlModel iconUrl;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    private String f79731id;
    @C17952c(mo34828a = "log_pb")
    private LogPbBean logPb;
    @C17952c(mo34828a = "name")
    private String name;
    @C17952c(mo34828a = "owner_id")
    private String ownerId;
    @C17952c(mo34828a = "owner_nickname")
    private String ownerNickName;
    @C17952c(mo34828a = "user_count")
    private int userCount;

    public final String getDesc() {
        return this.desc;
    }

    public final String getEffectId() {
        return this.effectId;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getId() {
        return this.f79731id;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final String getName() {
        return this.name;
    }

    public final String getOwnerId() {
        return this.ownerId;
    }

    public final String getOwnerNickName() {
        return this.ownerNickName;
    }

    public final int getUserCount() {
        return this.userCount;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setEffectId(String str) {
        this.effectId = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setId(String str) {
        this.f79731id = str;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOwnerId(String str) {
        this.ownerId = str;
    }

    public final void setOwnerNickName(String str) {
        this.ownerNickName = str;
    }

    public final void setUserCount(int i) {
        this.userCount = i;
    }
}
