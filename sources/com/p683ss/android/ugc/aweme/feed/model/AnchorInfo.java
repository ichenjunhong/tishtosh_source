package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AnchorInfo */
public final class AnchorInfo implements Serializable {
    public static final Companion Companion = new Companion(null);
    @C17952c(mo34828a = "extra")
    public String extra;
    @C17952c(mo34828a = "icon")
    public UrlModel icon;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    public String f79726id;
    @C17952c(mo34828a = "log_extra")
    public String logExtra;
    @C17952c(mo34828a = "mp_url")
    public String mpUrl;
    @C17952c(mo34828a = "open_url")
    public String openUrl;
    @C17952c(mo34828a = "title")
    public String title;
    @C17952c(mo34828a = "type")
    public Integer type = Integer.valueOf(-1);
    @C17952c(mo34828a = "web_url")
    public String webUrl;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.AnchorInfo$Companion */
    public static final class Companion {
        private Companion() {
        }

        public /* synthetic */ Companion(C52707g gVar) {
            this();
        }
    }

    public final String getExtra() {
        return this.extra;
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final String getId() {
        return this.f79726id;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getMpUrl() {
        return this.mpUrl;
    }

    public final String getOpenUrl() {
        return this.openUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final Integer getType() {
        return this.type;
    }

    public final String getWebUrl() {
        return this.webUrl;
    }

    public final void setExtra(String str) {
        this.extra = str;
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setId(String str) {
        this.f79726id = str;
    }

    public final void setLogExtra(String str) {
        this.logExtra = str;
    }

    public final void setMpUrl(String str) {
        this.mpUrl = str;
    }

    public final void setOpenUrl(String str) {
        this.openUrl = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setType(Integer num) {
        this.type = num;
    }

    public final void setWebUrl(String str) {
        this.webUrl = str;
    }
}
