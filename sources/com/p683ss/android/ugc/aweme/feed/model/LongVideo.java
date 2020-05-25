package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.LongVideo */
public class LongVideo implements Serializable {
    @C17952c(mo34828a = "long_video_type")
    public int longVideoType;
    @C17952c(mo34828a = "trailer_start_time")
    public int trailerStartTime;
    @C17952c(mo34828a = "video")
    public Video video;
    @C17952c(mo34828a = "video_control")
    public VideoControl videoControl;

    public int getLongVideoType() {
        return this.longVideoType;
    }

    public int getTrailerStartTime() {
        return this.trailerStartTime;
    }

    public Video getVideo() {
        return this.video;
    }

    public VideoControl getVideoControl() {
        return this.videoControl;
    }

    public void setLongVideoType(int i) {
        this.longVideoType = i;
    }

    public void setTrailerStartTime(int i) {
        this.trailerStartTime = i;
    }

    public void setVideo(Video video2) {
        this.video = video2;
    }

    public void setVideoControl(VideoControl videoControl2) {
        this.videoControl = videoControl2;
    }
}
