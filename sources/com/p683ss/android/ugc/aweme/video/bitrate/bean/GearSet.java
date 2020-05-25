package com.p683ss.android.ugc.aweme.video.bitrate.bean;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48527e;

/* renamed from: com.ss.android.ugc.aweme.video.bitrate.bean.GearSet */
public class GearSet implements C48527e {
    @C17952c(mo34828a = "bit_rate")
    private int bitRate;
    @C17952c(mo34828a = "network_lower")
    private int networkLower;
    @C17952c(mo34828a = "network_upper")
    private int networkUpper;

    public int getBitRate() {
        return this.bitRate;
    }

    public int getNetworkLower() {
        return this.networkLower;
    }

    public int getNetworkUpper() {
        return this.networkUpper;
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("GearSet{networkUpper=");
        sb.append(this.networkUpper);
        sb.append(", networkLower=");
        sb.append(this.networkLower);
        sb.append(", bitRate=");
        sb.append(this.bitRate);
        sb.append('}');
        return sb.toString();
    }

    public void setBitRate(int i) {
        this.bitRate = i;
    }

    public void setNetworkLower(int i) {
        this.networkLower = i;
    }

    public void setNetworkUpper(int i) {
        this.networkUpper = i;
    }
}
