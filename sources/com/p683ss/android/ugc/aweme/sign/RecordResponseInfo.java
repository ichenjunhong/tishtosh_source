package com.p683ss.android.ugc.aweme.sign;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;

/* renamed from: com.ss.android.ugc.aweme.sign.RecordResponseInfo */
public class RecordResponseInfo extends BaseResponse {
    @C17952c(mo34828a = "cover")
    UrlModel cover;
    @C17952c(mo34828a = "video")
    UrlModel video;
    private String videoId;

    public UrlModel getCover() {
        return this.cover;
    }

    public UrlModel getVideo() {
        return this.video;
    }

    public String getVideoId() {
        return this.videoId;
    }

    public void setCover(UrlModel urlModel) {
        this.cover = urlModel;
    }

    public void setVideo(UrlModel urlModel) {
        this.video = urlModel;
    }

    public void setVideoId(String str) {
        this.videoId = str;
    }
}
