package com.p683ss.android.ugc.aweme.video.bitrate.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48524b;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.bean.BandwidthSet */
public class BandwidthSet implements C48524b {
    @C17952c(mo34828a = "bitrate")
    private double bitRate;
    @C17952c(mo34828a = "speed")
    private double speed;

    public double getBitrate() {
        return this.bitRate;
    }

    public double getSpeed() {
        return this.speed;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BandwidthSet{speed=");
        sb.append(this.speed);
        sb.append(", bitRate=");
        sb.append(this.bitRate);
        sb.append('}');
        return sb.toString();
    }

    public void setBitRate(long j) {
        this.bitRate = (double) j;
    }

    public void setSpeed(int i) {
        this.speed = (double) i;
    }
}
