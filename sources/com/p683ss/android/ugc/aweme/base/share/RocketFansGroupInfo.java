package com.p683ss.android.ugc.aweme.base.share;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.base.share.RocketFansGroupInfo */
public class RocketFansGroupInfo implements Serializable {
    @C17952c(mo34828a = "download_url")
    public String downloadUrl;
    @C17952c(mo34828a = "schema")
    public String schema;
    @C17952c(mo34828a = "token")
    public String token;

    public String getDownloadUrl() {
        return this.downloadUrl;
    }

    public String getSchema() {
        return this.schema;
    }

    public String getToken() {
        return this.token;
    }

    public void setDownloadUrl(String str) {
        this.downloadUrl = str;
    }

    public void setSchema(String str) {
        this.schema = str;
    }

    public void setToken(String str) {
        this.token = str;
    }
}
