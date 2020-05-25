package com.p683ss.android.ugc.aweme.profile.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.Video;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.profile.model.VideoCover */
public final class VideoCover implements Serializable {
    @C17952c(mo34828a = "offset")
    private Integer offset;
    @C17952c(mo34828a = "video")
    private Video video;
    @C17952c(mo34828a = "video_id")
    private String videoId;

    public final Integer getOffset() {
        return this.offset;
    }

    public final Video getVideo() {
        return this.video;
    }

    public final String getVideoId() {
        return this.videoId;
    }

    public final void setOffset(Integer num) {
        this.offset = num;
    }

    public final void setVideo(Video video2) {
        this.video = video2;
    }

    public final void setVideoId(String str) {
        this.videoId = str;
    }
}
