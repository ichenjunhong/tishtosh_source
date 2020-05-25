package com.p683ss.android.ugc.aweme.comment.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.feed.model.LogPbBean;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.comment.model.GifEmoji */
public final class GifEmoji implements Serializable {
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    private final String f66857id = "";
    @C17952c(mo34828a = "image_id")
    private final long imageId;
    private LogPbBean logPb;
    @C17952c(mo34828a = "origin")
    private final UrlModel origin;
    @C17952c(mo34828a = "stcker_type")
    private final int stickerType;
    @C17952c(mo34828a = "thumbnail")
    private final UrlModel thumbnail;

    public final String getId() {
        return this.f66857id;
    }

    public final long getImageId() {
        return this.imageId;
    }

    public final LogPbBean getLogPb() {
        return this.logPb;
    }

    public final UrlModel getOrigin() {
        return this.origin;
    }

    public final int getStickerType() {
        return this.stickerType;
    }

    public final UrlModel getThumbnail() {
        return this.thumbnail;
    }

    public final void setLogPb(LogPbBean logPbBean) {
        this.logPb = logPbBean;
    }
}
