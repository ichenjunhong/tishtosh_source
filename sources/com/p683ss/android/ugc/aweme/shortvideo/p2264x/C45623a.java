package com.p683ss.android.ugc.aweme.shortvideo.p2264x;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.x.a */
public final class C45623a implements Serializable {
    @C17952c(mo34828a = "video_id")

    /* renamed from: a */
    private String f115405a;
    @C17952c(mo34828a = "ai_cut_id")

    /* renamed from: b */
    private String f115406b;
    @C17952c(mo34828a = "video_count")

    /* renamed from: c */
    private Integer f115407c = Integer.valueOf(0);
    @C17952c(mo34828a = "video_src_len_list")

    /* renamed from: d */
    private String f115408d;
    @C17952c(mo34828a = "video_cut_len_list")

    /* renamed from: e */
    private String f115409e;
    @C17952c(mo34828a = "video_cut_start_time")

    /* renamed from: f */
    private String f115410f;

    public final String getAiCutId() {
        return this.f115406b;
    }

    public final Integer getVideoCount() {
        return this.f115407c;
    }

    public final String getVideoCutLenListStr() {
        return this.f115409e;
    }

    public final String getVideoCutStartTimeListStr() {
        return this.f115410f;
    }

    public final String getVideoId() {
        return this.f115405a;
    }

    public final String getVideoSrcLenListStr() {
        return this.f115408d;
    }

    public final void setAiCutId(String str) {
        this.f115406b = str;
    }

    public final void setVideoCount(Integer num) {
        this.f115407c = num;
    }

    public final void setVideoCutLenListStr(String str) {
        this.f115409e = str;
    }

    public final void setVideoCutStartTimeListStr(String str) {
        this.f115410f = str;
    }

    public final void setVideoId(String str) {
        this.f115405a = str;
    }

    public final void setVideoSrcLenListStr(String str) {
        this.f115408d = str;
    }
}
