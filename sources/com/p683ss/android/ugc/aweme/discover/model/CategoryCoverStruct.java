package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.CategoryCoverStruct */
public class CategoryCoverStruct implements Serializable {
    private static final long serialVersionUID = 1;
    @C17952c(mo34828a = "aweme_id")
    public String awemeId;
    @C17952c(mo34828a = "cover")
    public UrlModel cover;
    @C17952c(mo34828a = "dynamic_cover")
    public UrlModel dynamicCover;

    public String getAwemeId() {
        return this.awemeId;
    }

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getDynamicCover() {
        return this.dynamicCover;
    }

    public void setAwemeId(String str) {
        this.awemeId = str;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setDynamicCover(UrlModel urlModel) {
        this.dynamicCover = urlModel;
    }
}
