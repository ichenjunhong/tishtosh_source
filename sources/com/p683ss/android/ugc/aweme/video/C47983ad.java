package com.p683ss.android.ugc.aweme.video;

import com.p683ss.android.ugc.playerkit.p2494c.C50111c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.ss.android.ugc.aweme.video.ad */
public enum C47983ad implements C50111c {
    Normal(true, "prepare_time", "first_frame_time"),
    Local(true, "prepare_time", "first_frame_time"),
    Story(false, "story_prepare_time", "story_first_frame_time");
    

    /* renamed from: d */
    private static Map<String, String> f120613d;

    /* renamed from: a */
    boolean f120615a;

    /* renamed from: b */
    String f120616b;

    /* renamed from: c */
    String f120617c;

    public final boolean isLoop() {
        return this.f120615a;
    }

    public final String getFirstFrameKey() {
        if (VideoBitRateABManager.m103801c().mo95132d()) {
            return (String) f120613d.get(this.f120617c);
        }
        return this.f120617c;
    }

    public final String getPrepareKey() {
        if (VideoBitRateABManager.m103801c().mo95132d()) {
            return (String) f120613d.get(this.f120616b);
        }
        return this.f120616b;
    }

    static {
        HashMap hashMap = new HashMap();
        f120613d = hashMap;
        hashMap.put("prepare_time", "video_bitrate_prepare_time");
        f120613d.put("story_prepare_time", "story_video_bitrate_prepare_time");
        f120613d.put("first_frame_time", "aweme_video_bitrate_first_frame_log");
        f120613d.put("story_first_frame_time", "story_video_bitrate_first_frame_time");
    }

    private C47983ad(boolean z, String str, String str2) {
        this.f120615a = z;
        this.f120616b = str;
        this.f120617c = str2;
    }
}
