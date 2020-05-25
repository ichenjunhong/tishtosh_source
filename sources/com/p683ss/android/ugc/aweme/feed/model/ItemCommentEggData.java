package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.ItemCommentEggData */
public class ItemCommentEggData implements Serializable {
    @C17952c(mo34828a = "egg_id")
    String eggId;
    @C17952c(mo34828a = "file_type")
    String fileType;
    @C17952c(mo34828a = "material_url")
    String materialUrl;
    @C17952c(mo34828a = "open_url")
    String openUrl;
    @C17952c(mo34828a = "regex")
    String regex;
    @C17952c(mo34828a = "web_url")
    String webUrl;

    public String getEggId() {
        return this.eggId;
    }

    public String getFileType() {
        return this.fileType;
    }

    public String getMaterialUrl() {
        return this.materialUrl;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getRegex() {
        return this.regex;
    }

    public String getWebUrl() {
        return this.webUrl;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("ItemCommentEggData{regex='");
        sb.append(this.regex);
        sb.append('\'');
        sb.append(", fileType='");
        sb.append(this.fileType);
        sb.append('\'');
        sb.append(", webUrl='");
        sb.append(this.webUrl);
        sb.append('\'');
        sb.append(", openUrl='");
        sb.append(this.openUrl);
        sb.append('\'');
        sb.append(", materialUrl='");
        sb.append(this.materialUrl);
        sb.append('\'');
        sb.append(", eggId='");
        sb.append(this.eggId);
        sb.append('\'');
        sb.append('}');
        return sb.toString();
    }

    public void setEggId(String str) {
        this.eggId = str;
    }

    public void setFileType(String str) {
        this.fileType = str;
    }

    public void setMaterialUrl(String str) {
        this.materialUrl = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setRegex(String str) {
        this.regex = str;
    }

    public void setWebUrl(String str) {
        this.webUrl = str;
    }
}
