package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.RecommendAwemeItem */
public class RecommendAwemeItem implements Serializable {
    @C17952c(mo34828a = "aweme_id")
    public String aid;
    @C17952c(mo34828a = "cover")
    public UrlModel cover;
    @C17952c(mo34828a = "dynamic_cover")
    public UrlModel dynamicCover;
    @C17952c(mo34828a = "media_type")
    public String mediaType;

    public String getAid() {
        return this.aid;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public String getMediaType() {
        return this.mediaType;
    }

    public void setAid(String str) {
        this.aid = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }

    public void setMediaType(String str) {
        this.mediaType = str;
    }
}
