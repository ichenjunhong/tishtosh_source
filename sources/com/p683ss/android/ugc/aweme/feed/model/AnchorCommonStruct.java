package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AnchorCommonStruct */
public final class AnchorCommonStruct implements Serializable {
    @C17952c(mo34828a = "deep_link")
    public String deepLink = "";
    @C17952c(mo34828a = "extra")
    public String extra = "";
    @C17952c(mo34828a = "icon")
    public UrlModel icon;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public String f79725id = "";
    @C17952c(mo34828a = "keyword")
    public String keyword;
    @C17952c(mo34828a = "language")
    public String language = "";
    @C17952c(mo34828a = "log_extra")
    public String logExtra = "";
    @C17952c(mo34828a = "schema")
    public String schema = "";
    @C17952c(mo34828a = "show_type")
    public int showType = 1;
    @C17952c(mo34828a = "type")
    public int type;
    @C17952c(mo34828a = "universal_link")
    public String universalLink = "";
    @C17952c(mo34828a = "url")
    public String url;

    public final String getDeepLink() {
        return this.deepLink;
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.f79725id;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final String getLanguage() {
        return this.language;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getSchema() {
        return this.schema;
    }

    public final int getShowType() {
        return this.showType;
    }

    public final int getType() {
        return this.type;
    }

    public final String getUniversalLink() {
        return this.universalLink;
    }

    public final String getUrl() {
        return this.url;
    }

    public final void setKeyword(String str) {
        this.keyword = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
