package com.p683ss.android.ugc.aweme.shortvideo;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.d */
public final class C43203d implements Serializable {
    @C17952c(mo34828a = "music_wave_ary")

    /* renamed from: a */
    private float[] f109232a = new float[0];
    @C17952c(mo34828a = "music_path")

    /* renamed from: b */
    private String f109233b = "";
    @C17952c(mo34828a = "music_length")

    /* renamed from: c */
    private long f109234c;
    @C17952c(mo34828a = "video_length")

    /* renamed from: d */
    private long f109235d;

    public final long getMusicLength() {
        return this.f109234c;
    }

    public final String getMusicPath() {
        return this.f109233b;
    }

    public final float[] getMusicWavePointArray() {
        return this.f109232a;
    }

    public final long getVideoLenght() {
        return this.f109235d;
    }

    public final void setMusicLength(long j) {
        this.f109234c = j;
    }

    public final void setVideoLenght(long j) {
        this.f109235d = j;
    }

    public final void setMusicPath(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f109233b = str;
    }

    public final void setMusicWavePointArray(float[] fArr) {
        C52711k.m112240b(fArr, "<set-?>");
        this.f109232a = fArr;
    }
}
