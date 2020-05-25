package com.p683ss.android.ugc.aweme.shortvideo.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.MvModel */
public final class MvModel implements Serializable {
    @C17952c(mo34828a = "desc")
    private String desc;
    @C17952c(mo34828a = "extra")
    private String extra;
    @C17952c(mo34828a = "icon_url")
    private UrlModel iconUrl;
    @C17952c(mo34828a = "is_collected")
    private boolean isCollected;
    @C17952c(mo34828a = "id")
    private String mvId;
    @C17952c(mo34828a = "name")
    private String name;
    @C17952c(mo34828a = "user_count")
    private Long userCount;

    public final String getDesc() {
        return this.desc;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIconUrl() {
        return this.iconUrl;
    }

    public final String getMvId() {
        return this.mvId;
    }

    public final String getName() {
        return this.name;
    }

    public final Long getUserCount() {
        return this.userCount;
    }

    public final boolean isCollected() {
        return this.isCollected;
    }

    public final void setCollected(boolean z) {
        this.isCollected = z;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIconUrl(UrlModel urlModel) {
        this.iconUrl = urlModel;
    }

    public final void setMvId(String str) {
        this.mvId = str;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setUserCount(Long l) {
        this.userCount = l;
    }
}
