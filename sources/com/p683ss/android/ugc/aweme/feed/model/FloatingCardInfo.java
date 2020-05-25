package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.FloatingCardInfo */
public class FloatingCardInfo implements Serializable {
    static final long serialVersionUID = 42;
    @C17952c(mo34828a = "button_bg")
    public UrlModel buttonBackground;
    @C17952c(mo34828a = "button_desc")
    public String buttonDesc;
    @C17952c(mo34828a = "description")
    public String description;
    @C17952c(mo34828a = "icons")
    public List<UrlModel> icons;
    @C17952c(mo34828a = "schema")
    public String schema;
    @C17952c(mo34828a = "schema_desc")
    public String schemaDesc;
    @C17952c(mo34828a = "title")
    public String title;

    public UrlModel getButtonBackground() {
        return this.buttonBackground;
    }

    public String getButtonDesc() {
        return this.buttonDesc;
    }

    public String getDescription() {
        return this.description;
    }

    public List<UrlModel> getIcons() {
        return this.icons;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getSchemaDesc() {
        return this.schemaDesc;
    }

    public String getTitle() {
        return this.title;
    }

    public void setButtonBackground(UrlModel urlModel) {
        this.buttonBackground = urlModel;
    }

    public void setButtonDesc(String str) {
        this.buttonDesc = str;
    }

    public void setDescription(String str) {
        this.description = str;
    }

    public void setIcons(List<UrlModel> list) {
        this.icons = list;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setSchemaDesc(String str) {
        this.schemaDesc = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
