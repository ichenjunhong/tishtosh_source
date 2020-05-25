package com.p683ss.android.ugc.aweme.feed.model.xigua;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.xigua.XiGuaTaskStruct */
public class XiGuaTaskStruct implements Serializable {
    static final long serialVersionUID = 18;
    @C17952c(mo34828a = "desc")
    public String desc;
    @C17952c(mo34828a = "entrance_url")
    public String entranceUrl;
    @C17952c(mo34828a = "icon_url")
    public String iconUrl;
    @C17952c(mo34828a = "is_xigua_task")
    public boolean isXiGuaTask;
    @C17952c(mo34828a = "jump_url")
    public String jumpUrl;
    @C17952c(mo34828a = "switch_type")
    public int switchType;
    @C17952c(mo34828a = "title")
    public String title;

    public String getDesc() {
        return this.desc;
    }

    public String getEntranceUrl() {
        return this.entranceUrl;
    }

    public String getIconUrl() {
        return this.iconUrl;
    }

    public String getJumpUrl() {
        return this.jumpUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public boolean isXiGuaTask() {
        return this.isXiGuaTask;
    }

    public void setDesc(String str) {
        this.desc = str;
    }

    public void setEntranceUrl(String str) {
        this.entranceUrl = str;
    }

    public void setIconUrl(String str) {
        this.iconUrl = str;
    }

    public void setJumpUrl(String str) {
        this.jumpUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setXiGuaTask(boolean z) {
        this.isXiGuaTask = z;
    }
}
