package com.p683ss.android.ugc.aweme.miniapp_api.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.miniapp_api.model.e */
public final class C36966e implements Serializable {
    @C17952c(mo34828a = "app_id")
    public String appId;
    @C17952c(mo34828a = "description")
    public String desc;
    @C17952c(mo34828a = "icon")
    public String icon;
    @C17952c(mo34828a = "card")
    public C36969h miniAppCard;
    @C17952c(mo34828a = "app_name")
    public String name;
    @C17952c(mo34828a = "orientation")
    public int orientation;
    @C17952c(mo34828a = "schema")
    public String schema;
    @C17952c(mo34828a = "state")
    public int state;
    @C17952c(mo34828a = "summary")
    public String summary;
    @C17952c(mo34828a = "title")
    public String title;
    @C17952c(mo34828a = "type")
    public int type;
    @C17952c(mo34828a = "web_url")
    public String webUrl;

    public final String getAppId() {
        return this.appId;
    }

    public final String getDesc() {
        return this.desc;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final C36969h getMiniAppCard() {
        return this.miniAppCard;
    }

    public final String getName() {
        return this.name;
    }

    public final int getOrientation() {
        return this.orientation;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getState() {
        return this.state;
    }

    public final String getSummary() {
        return this.summary;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int getType() {
        return this.type;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final boolean isApp() {
        if (this.type == 1 || this.type == 3) {
            return true;
        }
        return false;
    }

    public final boolean isGame() {
        if (this.type == 2) {
            return true;
        }
        return false;
    }

    public final void setAppId(String str) {
        this.appId = str;
    }

    public final void setDesc(String str) {
        this.desc = str;
    }

    public final void setIcon(String str) {
        this.icon = str;
    }

    public final void setMiniAppCard(C36969h hVar) {
        this.miniAppCard = hVar;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setOrientation(int i) {
        this.orientation = i;
    }

    public final void setSchema(String str) {
        this.schema = str;
    }

    public final void setState(int i) {
        this.state = i;
    }

    public final void setSummary(String str) {
        this.summary = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(int i) {
        this.type = i;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }
}
