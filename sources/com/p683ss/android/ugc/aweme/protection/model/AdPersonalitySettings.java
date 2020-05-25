package com.p683ss.android.ugc.aweme.protection.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings */
public final class AdPersonalitySettings implements Serializable {
    @C17952c(mo34828a = "pop_up_copywriting")
    private final CopyWritingInfo copyWriting;
    @C17952c(mo34828a = "description")
    private final String description;
    @C17952c(mo34828a = "is_follow_sys_config")
    private final Boolean isFollowSysTemConfig;
    @C17952c(mo34828a = "is_show_settings")
    private final Boolean isShowSettings;
    @C17952c(mo34828a = "mode")
    private final Integer mode;
    @C17952c(mo34828a = "need_pop_up")
    private final Boolean needPopUp;
    @C17952c(mo34828a = "pers_ad_data_received_partner_mode")
    private final Integer partnerAdMode;
    @C17952c(mo34828a = "pers_ad_show_interest_label")
    private final Boolean showInterestLabel;
    @C17952c(mo34828a = "pers_ad_show_data_received_partner")
    private final Boolean showPartnerAd;
    @C17952c(mo34828a = "pers_ad_show_third_party_networks")
    private final Boolean showThirdAd;
    @C17952c(mo34828a = "pers_ad_show_third_part_measurement")
    private final Boolean showThirdPartyMeasurement;
    @C17952c(mo34828a = "pers_ad_third_party_networks_mode")
    private final Integer thirdAdMode;

    public AdPersonalitySettings() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, 4095, null);
    }

    public static /* synthetic */ AdPersonalitySettings copy$default(AdPersonalitySettings adPersonalitySettings, Integer num, Boolean bool, Boolean bool2, String str, CopyWritingInfo copyWritingInfo, Boolean bool3, Integer num2, Integer num3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i, Object obj) {
        AdPersonalitySettings adPersonalitySettings2 = adPersonalitySettings;
        int i2 = i;
        return adPersonalitySettings.copy((i2 & 1) != 0 ? adPersonalitySettings2.mode : num, (i2 & 2) != 0 ? adPersonalitySettings2.needPopUp : bool, (i2 & 4) != 0 ? adPersonalitySettings2.isFollowSysTemConfig : bool2, (i2 & 8) != 0 ? adPersonalitySettings2.description : str, (i2 & 16) != 0 ? adPersonalitySettings2.copyWriting : copyWritingInfo, (i2 & 32) != 0 ? adPersonalitySettings2.isShowSettings : bool3, (i2 & 64) != 0 ? adPersonalitySettings2.thirdAdMode : num2, (i2 & 128) != 0 ? adPersonalitySettings2.partnerAdMode : num3, (i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? adPersonalitySettings2.showThirdAd : bool4, (i2 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? adPersonalitySettings2.showPartnerAd : bool5, (i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? adPersonalitySettings2.showInterestLabel : bool6, (i2 & 2048) != 0 ? adPersonalitySettings2.showThirdPartyMeasurement : bool7);
    }

    public final Integer component1() {
        return this.mode;
    }

    public final Boolean component10() {
        return this.showPartnerAd;
    }

    public final Boolean component11() {
        return this.showInterestLabel;
    }

    public final Boolean component12() {
        return this.showThirdPartyMeasurement;
    }

    public final Boolean component2() {
        return this.needPopUp;
    }

    public final Boolean component3() {
        return this.isFollowSysTemConfig;
    }

    public final String component4() {
        return this.description;
    }

    public final CopyWritingInfo component5() {
        return this.copyWriting;
    }

    public final Boolean component6() {
        return this.isShowSettings;
    }

    public final Integer component7() {
        return this.thirdAdMode;
    }

    public final Integer component8() {
        return this.partnerAdMode;
    }

    public final Boolean component9() {
        return this.showThirdAd;
    }

    public final AdPersonalitySettings copy(Integer num, Boolean bool, Boolean bool2, String str, CopyWritingInfo copyWritingInfo, Boolean bool3, Integer num2, Integer num3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        AdPersonalitySettings adPersonalitySettings = new AdPersonalitySettings(num, bool, bool2, str, copyWritingInfo, bool3, num2, num3, bool4, bool5, bool6, bool7);
        return adPersonalitySettings;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:26:0x007e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.showThirdPartyMeasurement, (java.lang.Object) r3.showThirdPartyMeasurement) != false) goto L_0x0083;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0083
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.protection.model.AdPersonalitySettings
            if (r0 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r3 = (com.p683ss.android.ugc.aweme.protection.model.AdPersonalitySettings) r3
            java.lang.Integer r0 = r2.mode
            java.lang.Integer r1 = r3.mode
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.Boolean r0 = r2.needPopUp
            java.lang.Boolean r1 = r3.needPopUp
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.Boolean r0 = r2.isFollowSysTemConfig
            java.lang.Boolean r1 = r3.isFollowSysTemConfig
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.String r0 = r2.description
            java.lang.String r1 = r3.description
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0081
            com.ss.android.ugc.aweme.protection.model.CopyWritingInfo r0 = r2.copyWriting
            com.ss.android.ugc.aweme.protection.model.CopyWritingInfo r1 = r3.copyWriting
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.Boolean r0 = r2.isShowSettings
            java.lang.Boolean r1 = r3.isShowSettings
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.Integer r0 = r2.thirdAdMode
            java.lang.Integer r1 = r3.thirdAdMode
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.Integer r0 = r2.partnerAdMode
            java.lang.Integer r1 = r3.partnerAdMode
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.Boolean r0 = r2.showThirdAd
            java.lang.Boolean r1 = r3.showThirdAd
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.Boolean r0 = r2.showPartnerAd
            java.lang.Boolean r1 = r3.showPartnerAd
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.Boolean r0 = r2.showInterestLabel
            java.lang.Boolean r1 = r3.showInterestLabel
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0081
            java.lang.Boolean r0 = r2.showThirdPartyMeasurement
            java.lang.Boolean r3 = r3.showThirdPartyMeasurement
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0081
            goto L_0x0083
        L_0x0081:
            r3 = 0
            return r3
        L_0x0083:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.model.AdPersonalitySettings.equals(java.lang.Object):boolean");
    }

    public final CopyWritingInfo getCopyWriting() {
        return this.copyWriting;
    }

    public final String getDescription() {
        return this.description;
    }

    public final Integer getMode() {
        return this.mode;
    }

    public final Boolean getNeedPopUp() {
        return this.needPopUp;
    }

    public final Integer getPartnerAdMode() {
        return this.partnerAdMode;
    }

    public final Boolean getShowInterestLabel() {
        return this.showInterestLabel;
    }

    public final Boolean getShowPartnerAd() {
        return this.showPartnerAd;
    }

    public final Boolean getShowThirdAd() {
        return this.showThirdAd;
    }

    public final Boolean getShowThirdPartyMeasurement() {
        return this.showThirdPartyMeasurement;
    }

    public final Integer getThirdAdMode() {
        return this.thirdAdMode;
    }

    public final int hashCode() {
        Integer num = this.mode;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        Boolean bool = this.needPopUp;
        int hashCode2 = (hashCode + (bool != null ? bool.hashCode() : 0)) * 31;
        Boolean bool2 = this.isFollowSysTemConfig;
        int hashCode3 = (hashCode2 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        String str = this.description;
        int hashCode4 = (hashCode3 + (str != null ? str.hashCode() : 0)) * 31;
        CopyWritingInfo copyWritingInfo = this.copyWriting;
        int hashCode5 = (hashCode4 + (copyWritingInfo != null ? copyWritingInfo.hashCode() : 0)) * 31;
        Boolean bool3 = this.isShowSettings;
        int hashCode6 = (hashCode5 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Integer num2 = this.thirdAdMode;
        int hashCode7 = (hashCode6 + (num2 != null ? num2.hashCode() : 0)) * 31;
        Integer num3 = this.partnerAdMode;
        int hashCode8 = (hashCode7 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Boolean bool4 = this.showThirdAd;
        int hashCode9 = (hashCode8 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.showPartnerAd;
        int hashCode10 = (hashCode9 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        Boolean bool6 = this.showInterestLabel;
        int hashCode11 = (hashCode10 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
        Boolean bool7 = this.showThirdPartyMeasurement;
        if (bool7 != null) {
            i = bool7.hashCode();
        }
        return hashCode11 + i;
    }

    public final Boolean isFollowSysTemConfig() {
        return this.isFollowSysTemConfig;
    }

    public final Boolean isShowSettings() {
        return this.isShowSettings;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AdPersonalitySettings(mode=");
        sb.append(this.mode);
        sb.append(", needPopUp=");
        sb.append(this.needPopUp);
        sb.append(", isFollowSysTemConfig=");
        sb.append(this.isFollowSysTemConfig);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", copyWriting=");
        sb.append(this.copyWriting);
        sb.append(", isShowSettings=");
        sb.append(this.isShowSettings);
        sb.append(", thirdAdMode=");
        sb.append(this.thirdAdMode);
        sb.append(", partnerAdMode=");
        sb.append(this.partnerAdMode);
        sb.append(", showThirdAd=");
        sb.append(this.showThirdAd);
        sb.append(", showPartnerAd=");
        sb.append(this.showPartnerAd);
        sb.append(", showInterestLabel=");
        sb.append(this.showInterestLabel);
        sb.append(", showThirdPartyMeasurement=");
        sb.append(this.showThirdPartyMeasurement);
        sb.append(")");
        return sb.toString();
    }

    public AdPersonalitySettings(Integer num, Boolean bool, Boolean bool2, String str, CopyWritingInfo copyWritingInfo, Boolean bool3, Integer num2, Integer num3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7) {
        this.mode = num;
        this.needPopUp = bool;
        this.isFollowSysTemConfig = bool2;
        this.description = str;
        this.copyWriting = copyWritingInfo;
        this.isShowSettings = bool3;
        this.thirdAdMode = num2;
        this.partnerAdMode = num3;
        this.showThirdAd = bool4;
        this.showPartnerAd = bool5;
        this.showInterestLabel = bool6;
        this.showThirdPartyMeasurement = bool7;
    }

    public /* synthetic */ AdPersonalitySettings(Integer num, Boolean bool, Boolean bool2, String str, CopyWritingInfo copyWritingInfo, Boolean bool3, Integer num2, Integer num3, Boolean bool4, Boolean bool5, Boolean bool6, Boolean bool7, int i, C52707g gVar) {
        Integer num4;
        Boolean bool8;
        Boolean bool9;
        String str2;
        CopyWritingInfo copyWritingInfo2;
        Boolean bool10;
        Integer num5;
        Integer num6;
        Boolean bool11;
        Boolean bool12;
        Boolean bool13;
        Boolean bool14;
        int i2 = i;
        if ((i2 & 1) != 0) {
            num4 = Integer.valueOf(0);
        } else {
            num4 = num;
        }
        if ((i2 & 2) != 0) {
            bool8 = Boolean.valueOf(false);
        } else {
            bool8 = bool;
        }
        if ((i2 & 4) != 0) {
            bool9 = Boolean.valueOf(false);
        } else {
            bool9 = bool2;
        }
        if ((i2 & 8) != 0) {
            str2 = "";
        } else {
            str2 = str;
        }
        if ((i2 & 16) != 0) {
            copyWritingInfo2 = null;
        } else {
            copyWritingInfo2 = copyWritingInfo;
        }
        if ((i2 & 32) != 0) {
            bool10 = Boolean.valueOf(false);
        } else {
            bool10 = bool3;
        }
        if ((i2 & 64) != 0) {
            num5 = Integer.valueOf(0);
        } else {
            num5 = num2;
        }
        if ((i2 & 128) != 0) {
            num6 = Integer.valueOf(0);
        } else {
            num6 = num3;
        }
        if ((i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            bool11 = Boolean.valueOf(false);
        } else {
            bool11 = bool4;
        }
        if ((i2 & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            bool12 = Boolean.valueOf(false);
        } else {
            bool12 = bool5;
        }
        if ((i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            bool13 = Boolean.valueOf(false);
        } else {
            bool13 = bool6;
        }
        if ((i2 & 2048) != 0) {
            bool14 = Boolean.valueOf(false);
        } else {
            bool14 = bool7;
        }
        this(num4, bool8, bool9, str2, copyWritingInfo2, bool10, num5, num6, bool11, bool12, bool13, bool14);
    }
}
