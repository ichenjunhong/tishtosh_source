package com.p683ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data;

import com.bytedance.p879t.p882c.C13248c;
import com.google.gson.p1076a.C17952c;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.sticker.infoSticker.interact.consume.data.BusinessExtraData */
public class BusinessExtraData {
    @C17952c(mo34828a = "clickable_open_url")
    private String clickableOpenUrl;
    @C17952c(mo34828a = "clickable_web_url")
    private String clickableWebUrl;
    @C17952c(mo34828a = "interaction_type")
    private int interactionType;
    @C17952c(mo34828a = "interaction_url")
    private String interactionUrl;
    @C17952c(mo34828a = "interaction_icon")
    private String popIcon;
    @C17952c(mo34828a = "interaction_text")
    private String popText;
    @C17952c(mo34828a = "sticker_id")
    private String stickerId;

    public String getClickableOpenUrl() {
        return this.clickableOpenUrl;
    }

    public String getClickableWebUrl() {
        return this.clickableWebUrl;
    }

    public int getInteractionType() {
        return this.interactionType;
    }

    public String getInteractionUrl() {
        return this.interactionUrl;
    }

    public String getPopIcon() {
        return this.popIcon;
    }

    public String getPopText() {
        return this.popText;
    }

    public String getStickerId() {
        return this.stickerId;
    }

    public String getSchemaUrlOpenFirst() {
        if (!C13248c.m26638a(this.clickableOpenUrl)) {
            return this.clickableOpenUrl;
        }
        if (!C13248c.m26638a(this.clickableWebUrl)) {
            return this.clickableWebUrl;
        }
        return this.interactionUrl;
    }

    public String getSchemaUrlWebFirst() {
        if (!C13248c.m26638a(this.clickableWebUrl)) {
            return this.clickableWebUrl;
        }
        if (!C13248c.m26638a(this.clickableOpenUrl)) {
            return this.clickableOpenUrl;
        }
        return this.interactionUrl;
    }

    public void setClickableOpenUrl(String str) {
        this.clickableOpenUrl = str;
    }

    public void setClickableWebUrl(String str) {
        this.clickableWebUrl = str;
    }

    public void setInteractionType(int i) {
        this.interactionType = i;
    }

    public void setInteractionUrl(String str) {
        this.interactionUrl = str;
    }

    public void setPopIcon(String str) {
        this.popIcon = str;
    }

    public void setPopText(String str) {
        this.popText = str;
    }

    public void setStickerId(String str) {
        this.stickerId = str;
    }
}
