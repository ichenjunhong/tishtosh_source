package com.p683ss.android.ugc.aweme.shortvideo.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.model.MusicWaveBean */
public final class MusicWaveBean implements Serializable {
    @C17952c(mo34828a = "music_length")
    private long musicLength;
    @C17952c(mo34828a = "music_wave_ary")
    private float[] musicWavePointArray = new float[0];
    @C17952c(mo34828a = "video_length")
    private long videoLenght;

    public final long getMusicLength() {
        return this.musicLength;
    }

    public final float[] getMusicWavePointArray() {
        return this.musicWavePointArray;
    }

    public final long getVideoLenght() {
        return this.videoLenght;
    }

    public final void setMusicLength(long j) {
        this.musicLength = j;
    }

    public final void setVideoLenght(long j) {
        this.videoLenght = j;
    }

    public final void setMusicWavePointArray(float[] fArr) {
        C52711k.m112240b(fArr, "<set-?>");
        this.musicWavePointArray = fArr;
    }
}
