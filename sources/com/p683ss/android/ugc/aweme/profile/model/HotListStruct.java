package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.HotListStruct */
public class HotListStruct implements Serializable {
    @C17952c(mo34828a = "footer")
    public String footer;
    @C17952c(mo34828a = "header")
    public String header;
    @C17952c(mo34828a = "image_url")
    public String imageUrl;
    @C17952c(mo34828a = "schema")
    public String schema;
    @C17952c(mo34828a = "title")
    public String titile;
    @C17952c(mo34828a = "type")
    public int type;

    public String getFooter() {
        return this.footer;
    }

    public String getHeader() {
        return this.header;
    }

    public String getImageUrl() {
        return this.imageUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getTitile() {
        return this.titile;
    }

    public int getType() {
        return this.type;
    }

    public void setFooter(String str) {
        this.footer = str;
    }

    public void setHeader(String str) {
        this.header = str;
    }

    public void setImageUrl(String str) {
        this.imageUrl = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setTitile(String str) {
        this.titile = str;
    }

    public void setType(int i) {
        this.type = i;
    }
}
