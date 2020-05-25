package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.FollowerDetail */
public class FollowerDetail implements Serializable {
    @C17952c(mo34828a = "app_name")
    public String appName;
    @C17952c(mo34828a = "apple_id")
    public String appleId;
    @C17952c(mo34828a = "download_url")
    public String downloadUrl;
    @C17952c(mo34828a = "fans_count")
    public int fansCount;
    @C17952c(mo34828a = "icon")
    public String icon;
    @C17952c(mo34828a = "name")
    public String name;
    @C17952c(mo34828a = "open_url")
    public String openUrl;
    @C17952c(mo34828a = "package_name")
    public String packageName;

    public String getAppName() {
        return this.appName;
    }

    public String getAppleId() {
        return this.appleId;
    }

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public int getFansCount() {
        return this.fansCount;
    }

    public String getIcon() {
        return this.icon;
    }

    public String getName() {
        return this.name;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getPackageName() {
        return this.packageName;
    }

    public void setAppName(String str) {
        this.appName = str;
    }

    public void setAppleId(String str) {
        this.appleId = str;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setFansCount(int i) {
        this.fansCount = i;
    }

    public void setIcon(String str) {
        this.icon = str;
    }

    public void setName(String str) {
        this.name = str;
    }

    public void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public void setPackageName(String str) {
        this.packageName = str;
    }
}
