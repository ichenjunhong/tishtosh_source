package com.p683ss.android.ugc.aweme.services.video;

/* renamed from: com.ss.android.ugc.aweme.services.video.VEVolumeChangeOp */
public class VEVolumeChangeOp {
    public final int mEnd;
    public final int mStart;
    public final int mType;
    public final int mVoiceType;
    public final float mVolume;

    public String toString() {
        StringBuilder sb = new StringBuilder("VEVolumeChangeOp{mType=");
        sb.append(this.mType);
        sb.append(", mVolume=");
        sb.append(this.mVolume);
        sb.append('}');
        return sb.toString();
    }

    public static VEVolumeChangeOp ofMusic(float f) {
        return new VEVolumeChangeOp(1, f);
    }

    public static VEVolumeChangeOp ofVoice(float f) {
        return new VEVolumeChangeOp(0, f);
    }

    private VEVolumeChangeOp(int i, float f) {
        this.mType = i;
        this.mVolume = f;
        this.mStart = -1;
        this.mEnd = -1;
    }

    public static VEVolumeChangeOp ofVoice(float f, int i, int i2, int i3) {
        VEVolumeChangeOp vEVolumeChangeOp = new VEVolumeChangeOp(0, f, i, i2, i3);
        return vEVolumeChangeOp;
    }

    private VEVolumeChangeOp(int i, float f, int i2, int i3, int i4) {
        this.mType = i;
        this.mVolume = f;
        this.mStart = i2;
        this.mEnd = i3;
        this.mVoiceType = i4;
    }
}
