package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.discover.model.MovieBanner */
public final class MovieBanner implements Serializable {
    @C17952c(mo34828a = "image")
    private UrlModel image;
    @C17952c(mo34828a = "banner_url")
    private UrlModel image1;
    @C17952c(mo34828a = "url")
    private String url;
    @C17952c(mo34828a = "schema")
    private String url1;

    public final UrlModel getImage() {
        UrlModel urlModel = this.image;
        if (urlModel == null) {
            return this.image1;
        }
        return urlModel;
    }

    public final String getUrl() {
        String str = this.url;
        if (str == null) {
            return this.url1;
        }
        return str;
    }

    public final void setImage(UrlModel urlModel) {
        this.image = urlModel;
    }

    public final void setUrl(String str) {
        this.url = str;
    }
}
