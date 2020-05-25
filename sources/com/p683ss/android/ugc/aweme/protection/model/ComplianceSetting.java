package com.p683ss.android.ugc.aweme.protection.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.AlgoFreeInfo;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import com.p683ss.android.ugc.aweme.video.preload.experiment.VideoCacheReadBuffersizeExperiment;
import com.p683ss.android.ugc.aweme.video.preload.model.PreloadTask;
import java.io.Serializable;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.protection.model.ComplianceSetting */
public final class ComplianceSetting extends BaseResponse implements Serializable {
    @C17952c(mo34828a = "ad_personality_settings")
    private final AdPersonalitySettings adPersonalitySettings;
    @C17952c(mo34828a = "add_terms_consent_for_register")
    private final Boolean addTermsConsentForRegister;
    @C17952c(mo34828a = "age_gate_info")
    private final AgeGateInfo ageGateInfo;
    @C17952c(mo34828a = "algo_free_enabled")
    private final Boolean algoFreeEnabled;
    @C17952c(mo34828a = "algo_free_info")
    private final AlgoFreeInfo algoFreeInfo;
    @C17952c(mo34828a = "settings_black_menu_list")
    private final List<String> blackSetting;
    @C17952c(mo34828a = "cmpl_enc")
    private final String complianceEncrypt;
    @C17952c(mo34828a = "default_vpa_content_choice")
    private final Integer defaultVpaContentChoice;
    @C17952c(mo34828a = "enable_do_not_sell_data")
    private final Integer enableDoNotSell;
    @C17952c(mo34828a = "enable_impressum")
    private final Integer enableImpressum;
    @C17952c(mo34828a = "enable_terms_consent_popup")
    private final Boolean enableTermsConsentPopup;
    @C17952c(mo34828a = "enable_vpa")
    private final Boolean enableVpa;
    @C17952c(mo34828a = "parental_guardian_name")
    private final String familyPairing;
    @C17952c(mo34828a = "force_private_account")
    private final Boolean forcePrivateAccount;
    @C17952c(mo34828a = "impressum_url")
    private final String impressumUrl;
    @C17952c(mo34828a = "is_minor")
    private Boolean isMinor;
    @C17952c(mo34828a = "teen_mode_self")
    private Boolean isTeenageModeSelf;
    @C17952c(mo34828a = "minor_control_type")
    private Integer minorControlType;
    @C17952c(mo34828a = "notify_private_account")
    private final Integer notifyPrivateAccount;
    @C17952c(mo34828a = "about_privacy_policy_url")
    private final String privacyPolicyUrl;
    @C17952c(mo34828a = "teens_mode_alert_count")
    private final Integer teensModeAlertCount;
    @C17952c(mo34828a = "terms_consent_for_register_info")
    private final TermsConsentInfo termsConsentInfo;
    @C17952c(mo34828a = "screen_time_management_self")
    private Integer timeLockSelfInMin;
    @C17952c(mo34828a = "vpa_info_bar_url")
    private final String vpaInfoBarUrl;

    public ComplianceSetting() {
        this(null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, 16777215, null);
    }

    public static /* synthetic */ ComplianceSetting copy$default(ComplianceSetting complianceSetting, List list, Integer num, String str, String str2, Integer num2, String str3, Boolean bool, Integer num3, Integer num4, Boolean bool2, AlgoFreeInfo algoFreeInfo2, AdPersonalitySettings adPersonalitySettings2, Integer num5, Boolean bool3, Boolean bool4, Boolean bool5, TermsConsentInfo termsConsentInfo2, String str4, String str5, Boolean bool6, Integer num6, Boolean bool7, Integer num7, AgeGateInfo ageGateInfo2, int i, Object obj) {
        Boolean bool8;
        Boolean bool9;
        Boolean bool10;
        TermsConsentInfo termsConsentInfo3;
        TermsConsentInfo termsConsentInfo4;
        String str6;
        String str7;
        String str8;
        String str9;
        Boolean bool11;
        Boolean bool12;
        Integer num8;
        Integer num9;
        Boolean bool13;
        Boolean bool14;
        Integer num10;
        ComplianceSetting complianceSetting2 = complianceSetting;
        int i2 = i;
        List list2 = (i2 & 1) != 0 ? complianceSetting2.blackSetting : list;
        Integer num11 = (i2 & 2) != 0 ? complianceSetting2.enableImpressum : num;
        String str10 = (i2 & 4) != 0 ? complianceSetting2.impressumUrl : str;
        String str11 = (i2 & 8) != 0 ? complianceSetting2.privacyPolicyUrl : str2;
        Integer num12 = (i2 & 16) != 0 ? complianceSetting2.enableDoNotSell : num2;
        String str12 = (i2 & 32) != 0 ? complianceSetting2.vpaInfoBarUrl : str3;
        Boolean bool15 = (i2 & 64) != 0 ? complianceSetting2.enableVpa : bool;
        Integer num13 = (i2 & 128) != 0 ? complianceSetting2.defaultVpaContentChoice : num3;
        Integer num14 = (i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? complianceSetting2.teensModeAlertCount : num4;
        Boolean bool16 = (i2 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? complianceSetting2.algoFreeEnabled : bool2;
        AlgoFreeInfo algoFreeInfo3 = (i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0 ? complianceSetting2.algoFreeInfo : algoFreeInfo2;
        AdPersonalitySettings adPersonalitySettings3 = (i2 & 2048) != 0 ? complianceSetting2.adPersonalitySettings : adPersonalitySettings2;
        Integer num15 = (i2 & 4096) != 0 ? complianceSetting2.notifyPrivateAccount : num5;
        Boolean bool17 = (i2 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0 ? complianceSetting2.forcePrivateAccount : bool3;
        Boolean bool18 = (i2 & 16384) != 0 ? complianceSetting2.addTermsConsentForRegister : bool4;
        if ((i2 & 32768) != 0) {
            bool8 = bool18;
            bool9 = complianceSetting2.enableTermsConsentPopup;
        } else {
            bool8 = bool18;
            bool9 = bool5;
        }
        if ((i2 & 65536) != 0) {
            bool10 = bool9;
            termsConsentInfo3 = complianceSetting2.termsConsentInfo;
        } else {
            bool10 = bool9;
            termsConsentInfo3 = termsConsentInfo2;
        }
        if ((i2 & 131072) != 0) {
            termsConsentInfo4 = termsConsentInfo3;
            str6 = complianceSetting2.complianceEncrypt;
        } else {
            termsConsentInfo4 = termsConsentInfo3;
            str6 = str4;
        }
        if ((i2 & 262144) != 0) {
            str7 = str6;
            str8 = complianceSetting2.familyPairing;
        } else {
            str7 = str6;
            str8 = str5;
        }
        if ((i2 & 524288) != 0) {
            str9 = str8;
            bool11 = complianceSetting2.isMinor;
        } else {
            str9 = str8;
            bool11 = bool6;
        }
        if ((i2 & 1048576) != 0) {
            bool12 = bool11;
            num8 = complianceSetting2.minorControlType;
        } else {
            bool12 = bool11;
            num8 = num6;
        }
        if ((i2 & 2097152) != 0) {
            num9 = num8;
            bool13 = complianceSetting2.isTeenageModeSelf;
        } else {
            num9 = num8;
            bool13 = bool7;
        }
        if ((i2 & 4194304) != 0) {
            bool14 = bool13;
            num10 = complianceSetting2.timeLockSelfInMin;
        } else {
            bool14 = bool13;
            num10 = num7;
        }
        return complianceSetting.copy(list2, num11, str10, str11, num12, str12, bool15, num13, num14, bool16, algoFreeInfo3, adPersonalitySettings3, num15, bool17, bool8, bool10, termsConsentInfo4, str7, str9, bool12, num9, bool14, num10, (i2 & 8388608) != 0 ? complianceSetting2.ageGateInfo : ageGateInfo2);
    }

    public final List<String> component1() {
        return this.blackSetting;
    }

    public final Boolean component10() {
        return this.algoFreeEnabled;
    }

    public final AlgoFreeInfo component11() {
        return this.algoFreeInfo;
    }

    public final AdPersonalitySettings component12() {
        return this.adPersonalitySettings;
    }

    public final Integer component13() {
        return this.notifyPrivateAccount;
    }

    public final Boolean component14() {
        return this.forcePrivateAccount;
    }

    public final Boolean component15() {
        return this.addTermsConsentForRegister;
    }

    public final Boolean component16() {
        return this.enableTermsConsentPopup;
    }

    public final TermsConsentInfo component17() {
        return this.termsConsentInfo;
    }

    public final String component18() {
        return this.complianceEncrypt;
    }

    public final String component19() {
        return this.familyPairing;
    }

    public final Integer component2() {
        return this.enableImpressum;
    }

    public final Boolean component20() {
        return this.isMinor;
    }

    public final Integer component21() {
        return this.minorControlType;
    }

    public final Boolean component22() {
        return this.isTeenageModeSelf;
    }

    public final Integer component23() {
        return this.timeLockSelfInMin;
    }

    public final AgeGateInfo component24() {
        return this.ageGateInfo;
    }

    public final String component3() {
        return this.impressumUrl;
    }

    public final String component4() {
        return this.privacyPolicyUrl;
    }

    public final Integer component5() {
        return this.enableDoNotSell;
    }

    public final String component6() {
        return this.vpaInfoBarUrl;
    }

    public final Boolean component7() {
        return this.enableVpa;
    }

    public final Integer component8() {
        return this.defaultVpaContentChoice;
    }

    public final Integer component9() {
        return this.teensModeAlertCount;
    }

    public final ComplianceSetting copy(List<String> list, Integer num, String str, String str2, Integer num2, String str3, Boolean bool, Integer num3, Integer num4, Boolean bool2, AlgoFreeInfo algoFreeInfo2, AdPersonalitySettings adPersonalitySettings2, Integer num5, Boolean bool3, Boolean bool4, Boolean bool5, TermsConsentInfo termsConsentInfo2, String str4, String str5, Boolean bool6, Integer num6, Boolean bool7, Integer num7, AgeGateInfo ageGateInfo2) {
        ComplianceSetting complianceSetting = new ComplianceSetting(list, num, str, str2, num2, str3, bool, num3, num4, bool2, algoFreeInfo2, adPersonalitySettings2, num5, bool3, bool4, bool5, termsConsentInfo2, str4, str5, bool6, num6, bool7, num7, ageGateInfo2);
        return complianceSetting;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:50:0x00f6, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.ageGateInfo, (java.lang.Object) r3.ageGateInfo) != false) goto L_0x00fb;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x00fb
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting
            if (r0 == 0) goto L_0x00f9
            com.ss.android.ugc.aweme.protection.model.ComplianceSetting r3 = (com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting) r3
            java.util.List<java.lang.String> r0 = r2.blackSetting
            java.util.List<java.lang.String> r1 = r3.blackSetting
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Integer r0 = r2.enableImpressum
            java.lang.Integer r1 = r3.enableImpressum
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = r2.impressumUrl
            java.lang.String r1 = r3.impressumUrl
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = r2.privacyPolicyUrl
            java.lang.String r1 = r3.privacyPolicyUrl
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Integer r0 = r2.enableDoNotSell
            java.lang.Integer r1 = r3.enableDoNotSell
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = r2.vpaInfoBarUrl
            java.lang.String r1 = r3.vpaInfoBarUrl
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Boolean r0 = r2.enableVpa
            java.lang.Boolean r1 = r3.enableVpa
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Integer r0 = r2.defaultVpaContentChoice
            java.lang.Integer r1 = r3.defaultVpaContentChoice
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Integer r0 = r2.teensModeAlertCount
            java.lang.Integer r1 = r3.teensModeAlertCount
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Boolean r0 = r2.algoFreeEnabled
            java.lang.Boolean r1 = r3.algoFreeEnabled
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            com.ss.android.ugc.aweme.AlgoFreeInfo r0 = r2.algoFreeInfo
            com.ss.android.ugc.aweme.AlgoFreeInfo r1 = r3.algoFreeInfo
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r0 = r2.adPersonalitySettings
            com.ss.android.ugc.aweme.protection.model.AdPersonalitySettings r1 = r3.adPersonalitySettings
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Integer r0 = r2.notifyPrivateAccount
            java.lang.Integer r1 = r3.notifyPrivateAccount
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Boolean r0 = r2.forcePrivateAccount
            java.lang.Boolean r1 = r3.forcePrivateAccount
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Boolean r0 = r2.addTermsConsentForRegister
            java.lang.Boolean r1 = r3.addTermsConsentForRegister
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Boolean r0 = r2.enableTermsConsentPopup
            java.lang.Boolean r1 = r3.enableTermsConsentPopup
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            com.ss.android.ugc.aweme.protection.model.TermsConsentInfo r0 = r2.termsConsentInfo
            com.ss.android.ugc.aweme.protection.model.TermsConsentInfo r1 = r3.termsConsentInfo
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = r2.complianceEncrypt
            java.lang.String r1 = r3.complianceEncrypt
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.String r0 = r2.familyPairing
            java.lang.String r1 = r3.familyPairing
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Boolean r0 = r2.isMinor
            java.lang.Boolean r1 = r3.isMinor
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Integer r0 = r2.minorControlType
            java.lang.Integer r1 = r3.minorControlType
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Boolean r0 = r2.isTeenageModeSelf
            java.lang.Boolean r1 = r3.isTeenageModeSelf
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            java.lang.Integer r0 = r2.timeLockSelfInMin
            java.lang.Integer r1 = r3.timeLockSelfInMin
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x00f9
            com.ss.android.ugc.aweme.protection.model.AgeGateInfo r0 = r2.ageGateInfo
            com.ss.android.ugc.aweme.protection.model.AgeGateInfo r3 = r3.ageGateInfo
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x00f9
            goto L_0x00fb
        L_0x00f9:
            r3 = 0
            return r3
        L_0x00fb:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.model.ComplianceSetting.equals(java.lang.Object):boolean");
    }

    public final AdPersonalitySettings getAdPersonalitySettings() {
        return this.adPersonalitySettings;
    }

    public final Boolean getAddTermsConsentForRegister() {
        return this.addTermsConsentForRegister;
    }

    public final AgeGateInfo getAgeGateInfo() {
        return this.ageGateInfo;
    }

    public final Boolean getAlgoFreeEnabled() {
        return this.algoFreeEnabled;
    }

    public final AlgoFreeInfo getAlgoFreeInfo() {
        return this.algoFreeInfo;
    }

    public final List<String> getBlackSetting() {
        return this.blackSetting;
    }

    public final String getComplianceEncrypt() {
        return this.complianceEncrypt;
    }

    public final Integer getDefaultVpaContentChoice() {
        return this.defaultVpaContentChoice;
    }

    public final Integer getEnableDoNotSell() {
        return this.enableDoNotSell;
    }

    public final Integer getEnableImpressum() {
        return this.enableImpressum;
    }

    public final Boolean getEnableTermsConsentPopup() {
        return this.enableTermsConsentPopup;
    }

    public final Boolean getEnableVpa() {
        return this.enableVpa;
    }

    public final String getFamilyPairing() {
        return this.familyPairing;
    }

    public final Boolean getForcePrivateAccount() {
        return this.forcePrivateAccount;
    }

    public final String getImpressumUrl() {
        return this.impressumUrl;
    }

    public final Integer getMinorControlType() {
        return this.minorControlType;
    }

    public final Integer getNotifyPrivateAccount() {
        return this.notifyPrivateAccount;
    }

    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public final Integer getTeensModeAlertCount() {
        return this.teensModeAlertCount;
    }

    public final TermsConsentInfo getTermsConsentInfo() {
        return this.termsConsentInfo;
    }

    public final Integer getTimeLockSelfInMin() {
        return this.timeLockSelfInMin;
    }

    public final String getVpaInfoBarUrl() {
        return this.vpaInfoBarUrl;
    }

    public final int hashCode() {
        List<String> list = this.blackSetting;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        Integer num = this.enableImpressum;
        int hashCode2 = (hashCode + (num != null ? num.hashCode() : 0)) * 31;
        String str = this.impressumUrl;
        int hashCode3 = (hashCode2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.privacyPolicyUrl;
        int hashCode4 = (hashCode3 + (str2 != null ? str2.hashCode() : 0)) * 31;
        Integer num2 = this.enableDoNotSell;
        int hashCode5 = (hashCode4 + (num2 != null ? num2.hashCode() : 0)) * 31;
        String str3 = this.vpaInfoBarUrl;
        int hashCode6 = (hashCode5 + (str3 != null ? str3.hashCode() : 0)) * 31;
        Boolean bool = this.enableVpa;
        int hashCode7 = (hashCode6 + (bool != null ? bool.hashCode() : 0)) * 31;
        Integer num3 = this.defaultVpaContentChoice;
        int hashCode8 = (hashCode7 + (num3 != null ? num3.hashCode() : 0)) * 31;
        Integer num4 = this.teensModeAlertCount;
        int hashCode9 = (hashCode8 + (num4 != null ? num4.hashCode() : 0)) * 31;
        Boolean bool2 = this.algoFreeEnabled;
        int hashCode10 = (hashCode9 + (bool2 != null ? bool2.hashCode() : 0)) * 31;
        AlgoFreeInfo algoFreeInfo2 = this.algoFreeInfo;
        int hashCode11 = (hashCode10 + (algoFreeInfo2 != null ? algoFreeInfo2.hashCode() : 0)) * 31;
        AdPersonalitySettings adPersonalitySettings2 = this.adPersonalitySettings;
        int hashCode12 = (hashCode11 + (adPersonalitySettings2 != null ? adPersonalitySettings2.hashCode() : 0)) * 31;
        Integer num5 = this.notifyPrivateAccount;
        int hashCode13 = (hashCode12 + (num5 != null ? num5.hashCode() : 0)) * 31;
        Boolean bool3 = this.forcePrivateAccount;
        int hashCode14 = (hashCode13 + (bool3 != null ? bool3.hashCode() : 0)) * 31;
        Boolean bool4 = this.addTermsConsentForRegister;
        int hashCode15 = (hashCode14 + (bool4 != null ? bool4.hashCode() : 0)) * 31;
        Boolean bool5 = this.enableTermsConsentPopup;
        int hashCode16 = (hashCode15 + (bool5 != null ? bool5.hashCode() : 0)) * 31;
        TermsConsentInfo termsConsentInfo2 = this.termsConsentInfo;
        int hashCode17 = (hashCode16 + (termsConsentInfo2 != null ? termsConsentInfo2.hashCode() : 0)) * 31;
        String str4 = this.complianceEncrypt;
        int hashCode18 = (hashCode17 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.familyPairing;
        int hashCode19 = (hashCode18 + (str5 != null ? str5.hashCode() : 0)) * 31;
        Boolean bool6 = this.isMinor;
        int hashCode20 = (hashCode19 + (bool6 != null ? bool6.hashCode() : 0)) * 31;
        Integer num6 = this.minorControlType;
        int hashCode21 = (hashCode20 + (num6 != null ? num6.hashCode() : 0)) * 31;
        Boolean bool7 = this.isTeenageModeSelf;
        int hashCode22 = (hashCode21 + (bool7 != null ? bool7.hashCode() : 0)) * 31;
        Integer num7 = this.timeLockSelfInMin;
        int hashCode23 = (hashCode22 + (num7 != null ? num7.hashCode() : 0)) * 31;
        AgeGateInfo ageGateInfo2 = this.ageGateInfo;
        if (ageGateInfo2 != null) {
            i = ageGateInfo2.hashCode();
        }
        return hashCode23 + i;
    }

    public final Boolean isMinor() {
        return this.isMinor;
    }

    public final Boolean isTeenageModeSelf() {
        return this.isTeenageModeSelf;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ComplianceSetting(blackSetting=");
        sb.append(this.blackSetting);
        sb.append(", enableImpressum=");
        sb.append(this.enableImpressum);
        sb.append(", impressumUrl=");
        sb.append(this.impressumUrl);
        sb.append(", privacyPolicyUrl=");
        sb.append(this.privacyPolicyUrl);
        sb.append(", enableDoNotSell=");
        sb.append(this.enableDoNotSell);
        sb.append(", vpaInfoBarUrl=");
        sb.append(this.vpaInfoBarUrl);
        sb.append(", enableVpa=");
        sb.append(this.enableVpa);
        sb.append(", defaultVpaContentChoice=");
        sb.append(this.defaultVpaContentChoice);
        sb.append(", teensModeAlertCount=");
        sb.append(this.teensModeAlertCount);
        sb.append(", algoFreeEnabled=");
        sb.append(this.algoFreeEnabled);
        sb.append(", algoFreeInfo=");
        sb.append(this.algoFreeInfo);
        sb.append(", adPersonalitySettings=");
        sb.append(this.adPersonalitySettings);
        sb.append(", notifyPrivateAccount=");
        sb.append(this.notifyPrivateAccount);
        sb.append(", forcePrivateAccount=");
        sb.append(this.forcePrivateAccount);
        sb.append(", addTermsConsentForRegister=");
        sb.append(this.addTermsConsentForRegister);
        sb.append(", enableTermsConsentPopup=");
        sb.append(this.enableTermsConsentPopup);
        sb.append(", termsConsentInfo=");
        sb.append(this.termsConsentInfo);
        sb.append(", complianceEncrypt=");
        sb.append(this.complianceEncrypt);
        sb.append(", familyPairing=");
        sb.append(this.familyPairing);
        sb.append(", isMinor=");
        sb.append(this.isMinor);
        sb.append(", minorControlType=");
        sb.append(this.minorControlType);
        sb.append(", isTeenageModeSelf=");
        sb.append(this.isTeenageModeSelf);
        sb.append(", timeLockSelfInMin=");
        sb.append(this.timeLockSelfInMin);
        sb.append(", ageGateInfo=");
        sb.append(this.ageGateInfo);
        sb.append(")");
        return sb.toString();
    }

    public final void setMinor(Boolean bool) {
        this.isMinor = bool;
    }

    public final void setMinorControlType(Integer num) {
        this.minorControlType = num;
    }

    public final void setTeenageModeSelf(Boolean bool) {
        this.isTeenageModeSelf = bool;
    }

    public final void setTimeLockSelfInMin(Integer num) {
        this.timeLockSelfInMin = num;
    }

    public ComplianceSetting(List<String> list, Integer num, String str, String str2, Integer num2, String str3, Boolean bool, Integer num3, Integer num4, Boolean bool2, AlgoFreeInfo algoFreeInfo2, AdPersonalitySettings adPersonalitySettings2, Integer num5, Boolean bool3, Boolean bool4, Boolean bool5, TermsConsentInfo termsConsentInfo2, String str4, String str5, Boolean bool6, Integer num6, Boolean bool7, Integer num7, AgeGateInfo ageGateInfo2) {
        this.blackSetting = list;
        this.enableImpressum = num;
        this.impressumUrl = str;
        this.privacyPolicyUrl = str2;
        this.enableDoNotSell = num2;
        this.vpaInfoBarUrl = str3;
        this.enableVpa = bool;
        this.defaultVpaContentChoice = num3;
        this.teensModeAlertCount = num4;
        this.algoFreeEnabled = bool2;
        this.algoFreeInfo = algoFreeInfo2;
        this.adPersonalitySettings = adPersonalitySettings2;
        this.notifyPrivateAccount = num5;
        this.forcePrivateAccount = bool3;
        this.addTermsConsentForRegister = bool4;
        this.enableTermsConsentPopup = bool5;
        this.termsConsentInfo = termsConsentInfo2;
        this.complianceEncrypt = str4;
        this.familyPairing = str5;
        this.isMinor = bool6;
        this.minorControlType = num6;
        this.isTeenageModeSelf = bool7;
        this.timeLockSelfInMin = num7;
        this.ageGateInfo = ageGateInfo2;
    }

    public /* synthetic */ ComplianceSetting(List list, Integer num, String str, String str2, Integer num2, String str3, Boolean bool, Integer num3, Integer num4, Boolean bool2, AlgoFreeInfo algoFreeInfo2, AdPersonalitySettings adPersonalitySettings2, Integer num5, Boolean bool3, Boolean bool4, Boolean bool5, TermsConsentInfo termsConsentInfo2, String str4, String str5, Boolean bool6, Integer num6, Boolean bool7, Integer num7, AgeGateInfo ageGateInfo2, int i, C52707g gVar) {
        List list2;
        Integer num8;
        String str6;
        String str7;
        Integer num9;
        String str8;
        Boolean bool8;
        Integer num10;
        Integer num11;
        Boolean bool9;
        AlgoFreeInfo algoFreeInfo3;
        AdPersonalitySettings adPersonalitySettings3;
        Integer num12;
        Boolean bool10;
        Boolean bool11;
        Boolean bool12;
        TermsConsentInfo termsConsentInfo3;
        String str9;
        String str10;
        Boolean bool13;
        Integer num13;
        Boolean bool14;
        Integer num14;
        AgeGateInfo ageGateInfo3;
        int i2 = i;
        if ((i2 & 1) != 0) {
            list2 = null;
        } else {
            list2 = list;
        }
        if ((i2 & 2) != 0) {
            num8 = Integer.valueOf(0);
        } else {
            num8 = num;
        }
        if ((i2 & 4) != 0) {
            str6 = null;
        } else {
            str6 = str;
        }
        if ((i2 & 8) != 0) {
            str7 = null;
        } else {
            str7 = str2;
        }
        if ((i2 & 16) != 0) {
            num9 = Integer.valueOf(0);
        } else {
            num9 = num2;
        }
        if ((i2 & 32) != 0) {
            str8 = null;
        } else {
            str8 = str3;
        }
        if ((i2 & 64) != 0) {
            bool8 = Boolean.valueOf(false);
        } else {
            bool8 = bool;
        }
        if ((i2 & 128) != 0) {
            num10 = Integer.valueOf(1);
        } else {
            num10 = num3;
        }
        if ((i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            num11 = Integer.valueOf(0);
        } else {
            num11 = num4;
        }
        if ((i2 & UnReadVideoExperiment.LIKE_USER_LIST) != 0) {
            bool9 = Boolean.valueOf(false);
        } else {
            bool9 = bool2;
        }
        if ((i2 & PreloadTask.BYTE_UNIT_NUMBER) != 0) {
            algoFreeInfo3 = null;
        } else {
            algoFreeInfo3 = algoFreeInfo2;
        }
        if ((i2 & 2048) != 0) {
            adPersonalitySettings3 = null;
        } else {
            adPersonalitySettings3 = adPersonalitySettings2;
        }
        if ((i2 & 4096) != 0) {
            num12 = Integer.valueOf(0);
        } else {
            num12 = num5;
        }
        if ((i2 & VideoCacheReadBuffersizeExperiment.DEFAULT) != 0) {
            bool10 = Boolean.valueOf(false);
        } else {
            bool10 = bool3;
        }
        Boolean bool15 = bool10;
        if ((i2 & 16384) != 0) {
            bool11 = Boolean.valueOf(false);
        } else {
            bool11 = bool4;
        }
        if ((i2 & 32768) != 0) {
            bool12 = Boolean.valueOf(false);
        } else {
            bool12 = bool5;
        }
        if ((i2 & 65536) != 0) {
            termsConsentInfo3 = null;
        } else {
            termsConsentInfo3 = termsConsentInfo2;
        }
        if ((i2 & 131072) != 0) {
            str9 = null;
        } else {
            str9 = str4;
        }
        if ((i2 & 262144) != 0) {
            str10 = null;
        } else {
            str10 = str5;
        }
        if ((i2 & 524288) != 0) {
            bool13 = Boolean.valueOf(false);
        } else {
            bool13 = bool6;
        }
        if ((i2 & 1048576) != 0) {
            num13 = Integer.valueOf(0);
        } else {
            num13 = num6;
        }
        if ((i2 & 2097152) != 0) {
            bool14 = Boolean.valueOf(false);
        } else {
            bool14 = bool7;
        }
        if ((i2 & 4194304) != 0) {
            num14 = Integer.valueOf(0);
        } else {
            num14 = num7;
        }
        if ((i2 & 8388608) != 0) {
            ageGateInfo3 = null;
        } else {
            ageGateInfo3 = ageGateInfo2;
        }
        this(list2, num8, str6, str7, num9, str8, bool8, num10, num11, bool9, algoFreeInfo3, adPersonalitySettings3, num12, bool15, bool11, bool12, termsConsentInfo3, str9, str10, bool13, num13, bool14, num14, ageGateInfo3);
    }
}
