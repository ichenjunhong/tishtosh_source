package com.p683ss.android.ugc.aweme.p1807im.sdk.abtest;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.im.sdk.abtest.ImCreateChatV2Config */
public final class ImCreateChatV2Config {
    @C17952c(mo34828a = "freq_day")
    public final int frequencyDay;
    @C17952c(mo34828a = "freq_num")
    public final int frequencyNum;
    @C17952c(mo34828a = "show_flag")
    public final int showFlag;
    @C17952c(mo34828a = "cn_tip")
    public final String tipCn;
    @C17952c(mo34828a = "en_tip")
    public final String tipEn;
    @C17952c(mo34828a = "version")
    public final int version;

    public static /* synthetic */ ImCreateChatV2Config copy$default(ImCreateChatV2Config imCreateChatV2Config, int i, int i2, int i3, int i4, String str, String str2, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            i = imCreateChatV2Config.version;
        }
        if ((i5 & 2) != 0) {
            i2 = imCreateChatV2Config.frequencyDay;
        }
        int i6 = i2;
        if ((i5 & 4) != 0) {
            i3 = imCreateChatV2Config.frequencyNum;
        }
        int i7 = i3;
        if ((i5 & 8) != 0) {
            i4 = imCreateChatV2Config.showFlag;
        }
        int i8 = i4;
        if ((i5 & 16) != 0) {
            str = imCreateChatV2Config.tipCn;
        }
        String str3 = str;
        if ((i5 & 32) != 0) {
            str2 = imCreateChatV2Config.tipEn;
        }
        return imCreateChatV2Config.copy(i, i6, i7, i8, str3, str2);
    }

    public final int component1() {
        return this.version;
    }

    public final int component2() {
        return this.frequencyDay;
    }

    public final int component3() {
        return this.frequencyNum;
    }

    public final int component4() {
        return this.showFlag;
    }

    public final String component5() {
        return this.tipCn;
    }

    public final String component6() {
        return this.tipEn;
    }

    public final ImCreateChatV2Config copy(int i, int i2, int i3, int i4, String str, String str2) {
        ImCreateChatV2Config imCreateChatV2Config = new ImCreateChatV2Config(i, i2, i3, i4, str, str2);
        return imCreateChatV2Config;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof ImCreateChatV2Config) {
                ImCreateChatV2Config imCreateChatV2Config = (ImCreateChatV2Config) obj;
                if (this.version == imCreateChatV2Config.version) {
                    if (this.frequencyDay == imCreateChatV2Config.frequencyDay) {
                        if (this.frequencyNum == imCreateChatV2Config.frequencyNum) {
                            if (!(this.showFlag == imCreateChatV2Config.showFlag) || !C52711k.m112239a((Object) this.tipCn, (Object) imCreateChatV2Config.tipCn) || !C52711k.m112239a((Object) this.tipEn, (Object) imCreateChatV2Config.tipEn)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getFrequencyDay() {
        return this.frequencyDay;
    }

    public final int getFrequencyNum() {
        return this.frequencyNum;
    }

    public final int getShowFlag() {
        return this.showFlag;
    }

    public final String getTipCn() {
        return this.tipCn;
    }

    public final String getTipEn() {
        return this.tipEn;
    }

    public final int getVersion() {
        return this.version;
    }

    public final int hashCode() {
        int i = ((((((this.version * 31) + this.frequencyDay) * 31) + this.frequencyNum) * 31) + this.showFlag) * 31;
        String str = this.tipCn;
        int i2 = 0;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.tipEn;
        if (str2 != null) {
            i2 = str2.hashCode();
        }
        return hashCode + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ImCreateChatV2Config(version=");
        sb.append(this.version);
        sb.append(", frequencyDay=");
        sb.append(this.frequencyDay);
        sb.append(", frequencyNum=");
        sb.append(this.frequencyNum);
        sb.append(", showFlag=");
        sb.append(this.showFlag);
        sb.append(", tipCn=");
        sb.append(this.tipCn);
        sb.append(", tipEn=");
        sb.append(this.tipEn);
        sb.append(")");
        return sb.toString();
    }

    public ImCreateChatV2Config(int i, int i2, int i3, int i4, String str, String str2) {
        this.version = i;
        this.frequencyDay = i2;
        this.frequencyNum = i3;
        this.showFlag = i4;
        this.tipCn = str;
        this.tipEn = str2;
    }
}
