package com.bytedance.android.live.base.model.share;

import com.bytedance.android.live.base.model.ImageModel;
import com.google.gson.p1076a.C17952c;

public class ShareSourceInfo {
    @C17952c(mo34828a = "app_name")
    private String appName;
    @C17952c(mo34828a = "img_title")
    private String imgTitle;
    @C17952c(mo34828a = "img_url")
    private ImageModel imgUrl;
    @C17952c(mo34828a = "pkg_name")
    private String pkgName;
    @C17952c(mo34828a = "schema_url")
    private String schemaUrl;
    @C17952c(mo34828a = "title")
    private String title;

    public String getAppName() {
        return this.appName;
    }

    public String getImgTitle() {
        return this.imgTitle;
    }

    public ImageModel getImgUrl() {
        return this.imgUrl;
    }

    public String getPkgName() {
        return this.pkgName;
    }

    public String getSchemaUrl() {
        return this.schemaUrl;
    }

    public String getTitle() {
        return this.title;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setImgTitle(String str) {
        this.imgTitle = str;
    }

    public void setImgUrl(ImageModel imageModel) {
        this.imgUrl = imageModel;
    }

    public void setPkgName(String str) {
        this.pkgName = str;
    }

    public void setSchemaUrl(String str) {
        this.schemaUrl = str;
    }

    public void setTitle(String str) {
        this.title = str;
    }
}
