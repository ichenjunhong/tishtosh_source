package com.p683ss.android.ugc.aweme.share;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.feed.model.VideoUrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.share.p */
public class C42228p implements Serializable {
    @C17952c(mo34828a = "snapchat")

    /* renamed from: a */
    VideoUrlModel f106755a;
    @C17952c(mo34828a = "lite")

    /* renamed from: b */
    VideoUrlModel f106756b;
    @C17952c(mo34828a = "suffix_scene")

    /* renamed from: c */
    VideoUrlModel f106757c;

    public VideoUrlModel getLiteDownloadAddr() {
        return this.f106756b;
    }

    public VideoUrlModel getSnapchatDownloadAddr() {
        return this.f106755a;
    }

    public VideoUrlModel getSuffixSceneDownloadAddr() {
        return this.f106757c;
    }

    public void setLiteDownloadAddr(VideoUrlModel videoUrlModel) {
        this.f106756b = videoUrlModel;
    }

    public void setSnapchatDownloadAddr(VideoUrlModel videoUrlModel) {
        this.f106755a = videoUrlModel;
    }

    public void setSuffixSceneDownloadAddr(VideoUrlModel videoUrlModel) {
        this.f106757c = videoUrlModel;
    }
}
