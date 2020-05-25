package com.p683ss.ttvideoengine;

import com.p683ss.ttvideoengine.model.VideoRef;

/* renamed from: com.ss.ttvideoengine.Resolution */
public enum Resolution {
    Undefine("", ""),
    Standard("360p", "medium"),
    High("480p", "higher"),
    SuperHigh("720p", "highest"),
    ExtremelyHigh("1080p", "original"),
    FourK("4k", ""),
    HDR("hdr", ""),
    Auto("auto", ""),
    L_Standard("240p", ""),
    H_High("540p", ""),
    TwoK("2k", "");
    
    private final String audioquality;
    private final String resolution;

    public final String toString() {
        return this.resolution;
    }

    public final int getIndex() {
        return ordinal();
    }

    public static Resolution[] getAllResolutions() {
        try {
            return new Resolution[]{Undefine, L_Standard, Standard, High, H_High, SuperHigh, ExtremelyHigh, TwoK, FourK, HDR};
        } catch (Exception unused) {
            return new Resolution[0];
        }
    }

    public final String toString(int i) {
        if (i == VideoRef.TYPE_AUDIO) {
            return this.audioquality;
        }
        if (i == VideoRef.TYPE_VIDEO) {
            return this.resolution;
        }
        return "";
    }

    private Resolution(String str, String str2) {
        this.resolution = str;
        this.audioquality = str2;
    }
}
