package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.InquiryStruct */
public class InquiryStruct implements Serializable {
    @C17952c(mo34828a = "desc")
    private String desc;
    @C17952c(mo34828a = "icon")
    private UrlModel icon;
    @C17952c(mo34828a = "open_url")
    private String openUrl;
    @C17952c(mo34828a = "web_url")
    private String webUrl;

    public String getDesc() {
        return this.desc;
    }

    public UrlModel getIcon() {
        return this.icon;
    }

    public String getOpenUrl() {
        return this.openUrl;
    }

    public String getWebUrl() {
        return this.webUrl;
    }
}
