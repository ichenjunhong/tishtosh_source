package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.StarActivityEntrance */
public class StarActivityEntrance implements Serializable {
    @C17952c(mo34828a = "description")
    String description;
    @C17952c(mo34828a = "head_image")
    UrlModel headImage;
    @C17952c(mo34828a = "open_url")
    String openUrl;
    @C17952c(mo34828a = "type")
    int type;
    @C17952c(mo34828a = "web_url")
    String webUrl;

    /* renamed from: com.ss.android.ugc.aweme.profile.model.StarActivityEntrance$StarActivityEntranceType */
    public @interface StarActivityEntranceType {
    }

    public String getDescription() {
        return this.description;
    }

    public UrlModel getHeadImage() {
        return this.headImage;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public int getType() {
        return this.type;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setHeadImage(UrlModel urlModel) {
        this.headImage = urlModel;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setType(int i) {
        this.type = i;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
