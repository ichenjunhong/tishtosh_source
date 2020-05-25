package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.TaskAnchorInfo */
public class TaskAnchorInfo implements Serializable {
    @C17952c(mo34828a = "content")
    String content;
    @C17952c(mo34828a = "icon")
    UrlModel icon;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    String f74688id;
    @C17952c(mo34828a = "mp_url")
    String mpUrl;
    @C17952c(mo34828a = "open_url")
    String openUrl;
    @C17952c(mo34828a = "title")
    String title;
    @C17952c(mo34828a = "type")
    int type = -1;
    @C17952c(mo34828a = "web_url")
    String webUrl;

    public String getContent() {
        return this.content;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getId() {
        return this.f74688id;
    }

    public String getMpUrl() {
        return this.mpUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public int getType() {
        return this.type;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setContent(String str) {
        this.content = str;
    }

    public void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public void setId(String str) {
        this.f74688id = str;
    }

    public void setMpUrl(String str) {
        this.mpUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
