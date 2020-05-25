package com.p683ss.android.ugc.aweme.feed.model;

import android.text.TextUtils;
import com.google.gson.C17955b;
import com.google.gson.C17957c;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.p2419d.p2420a.p2421a.p2422a.p2423a.C48525c;
import java.io.Serializable;
import java.util.Collections;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.feed.model.BitRate */
public class BitRate implements C48525c, Serializable {
    private static final long serialVersionUID = 4166900069421013042L;
    @C17952c(mo34828a = "bit_rate")
    public int bitRate;
    @C17952c(mo34828a = "gear_name")
    public String gearName;
    @C17952c(mo34828a = "is_h265")
    public int isH265;
    @C17952c(mo34828a = "play_addr")
    public UrlModel playAddr;
    @C17952c(mo34828a = "quality_type")
    public int qualityType;

    /* renamed from: com.ss.android.ugc.aweme.feed.model.BitRate$ExcludeStrategy */
    public static class ExcludeStrategy implements C17955b {
        public boolean shouldSkipClass(Class<?> cls) {
            return false;
        }

        public boolean shouldSkipField(C17957c cVar) {
            if (cVar.mo34835a() != BitRate.class || (!cVar.mo34836b().equals("playAddr") && !cVar.mo34836b().equals("playAddrH265") && !cVar.mo34836b().equals("gear_name"))) {
                return false;
            }
            return true;
        }
    }

    public int getBitRate() {
        return this.bitRate;
    }

    public String getGearName() {
        return this.gearName;
    }

    public UrlModel getPlayAddr() {
        return this.playAddr;
    }

    public int getQualityType() {
        return this.qualityType;
    }

    public int isH265() {
        return this.isH265;
    }

    public int getSize() {
        if (this.playAddr != null) {
            return (int) this.playAddr.getSize();
        }
        return 0;
    }

    public String getUrlKey() {
        if (this.playAddr == null || TextUtils.isEmpty(this.playAddr.getUrlKey())) {
            return null;
        }
        return this.playAddr.getUrlKey();
    }

    public List<String> urlList() {
        if (getPlayAddr() != null) {
            return getPlayAddr().getUrlList();
        }
        return Collections.emptyList();
    }

    public String getChecksum() {
        if (this.playAddr == null || !(this.playAddr instanceof VideoUrlModel) || TextUtils.isEmpty(((VideoUrlModel) this.playAddr).getFileCheckSum())) {
            return null;
        }
        return ((VideoUrlModel) this.playAddr).getFileCheckSum();
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("BitRate{bitRate=");
        sb.append(this.bitRate);
        sb.append(", gearName='");
        sb.append(this.gearName);
        sb.append('\'');
        sb.append(", qualityType=");
        sb.append(this.qualityType);
        sb.append(", isH265=");
        sb.append(this.isH265);
        sb.append('}');
        return sb.toString();
    }

    public void setBitRate(int i) {
        this.bitRate = i;
    }

    public void setGearName(String str) {
        this.gearName = str;
    }

    public void setH265(int i) {
        this.isH265 = i;
    }

    public void setPlayAddr(UrlModel urlModel) {
        this.playAddr = urlModel;
    }

    public void setQualityType(int i) {
        this.qualityType = i;
    }
}
