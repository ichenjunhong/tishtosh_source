package com.bytedance.android.livesdkapi.depend.model.live;

import com.google.gson.p1076a.C17952c;

/* renamed from: com.bytedance.android.livesdkapi.depend.model.live.m */
public enum C8710m {
    VIDEO("general", false, true),
    AUDIO("general", false, false),
    THIRD_PARTY("thirdparty", true, false),
    SCREEN_RECORD("game", true, false),
    OFFICIAL_ACTIVITY("official_activity", false, false);
    
    @C17952c(mo34828a = "isStreamingBackground")
    public final boolean isStreamingBackground;
    @C17952c(mo34828a = "isUsingCamera")
    public final boolean isUsingCamera;
    @C17952c(mo34828a = "logStreamingType")
    public final String logStreamingType;

    public static C8710m valueOf(int i) {
        if (i < 0 || i >= values().length) {
            return VIDEO;
        }
        return values()[i];
    }

    private C8710m(String str, boolean z, boolean z2) {
        this.logStreamingType = str;
        this.isStreamingBackground = z;
        this.isUsingCamera = z2;
    }
}
