package com.p683ss.android.ugc.aweme.main.experiment.pneumonia;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.main.experiment.pneumonia.DynamicTabSettingStruct */
public final class DynamicTabSettingStruct {
    @C17952c(mo34828a = "virus_map_url")
    public String mapUrl;
    @C17952c(mo34828a = "virus_refresh_interval")
    public long time;

    public DynamicTabSettingStruct() {
        this(0, null, 3, null);
    }

    public static /* synthetic */ DynamicTabSettingStruct copy$default(DynamicTabSettingStruct dynamicTabSettingStruct, long j, String str, int i, Object obj) {
        if ((i & 1) != 0) {
            j = dynamicTabSettingStruct.time;
        }
        if ((i & 2) != 0) {
            str = dynamicTabSettingStruct.mapUrl;
        }
        return dynamicTabSettingStruct.copy(j, str);
    }

    public final long component1() {
        return this.time;
    }

    public final String component2() {
        return this.mapUrl;
    }

    public final DynamicTabSettingStruct copy(long j, String str) {
        C52711k.m112240b(str, "mapUrl");
        return new DynamicTabSettingStruct(j, str);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof DynamicTabSettingStruct) {
                DynamicTabSettingStruct dynamicTabSettingStruct = (DynamicTabSettingStruct) obj;
                if (!(this.time == dynamicTabSettingStruct.time) || !C52711k.m112239a((Object) this.mapUrl, (Object) dynamicTabSettingStruct.mapUrl)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final String getMapUrl() {
        return this.mapUrl;
    }

    public final long getTime() {
        return this.time;
    }

    public final int hashCode() {
        long j = this.time;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        String str = this.mapUrl;
        return i + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DynamicTabSettingStruct(time=");
        sb.append(this.time);
        sb.append(", mapUrl=");
        sb.append(this.mapUrl);
        sb.append(")");
        return sb.toString();
    }

    public final void setTime(long j) {
        this.time = j;
    }

    public final void setMapUrl(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.mapUrl = str;
    }

    public DynamicTabSettingStruct(long j, String str) {
        C52711k.m112240b(str, "mapUrl");
        this.time = j;
        this.mapUrl = str;
    }

    public /* synthetic */ DynamicTabSettingStruct(long j, String str, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            j = 1800000;
        }
        if ((i & 2) != 0) {
            str = "https://pb3.pstatp.com/obj/douyin-admin-obj/pneumonia_map_v2.png";
        }
        this(j, str);
    }
}
