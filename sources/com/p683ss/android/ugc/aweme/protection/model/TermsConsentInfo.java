package com.p683ss.android.ugc.aweme.protection.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.protection.model.TermsConsentInfo */
public final class TermsConsentInfo implements Serializable {
    @C17952c(mo34828a = "business")
    private final String business;
    @C17952c(mo34828a = "button")
    private final String button;
    @C17952c(mo34828a = "checkbox_agree_all_terms")
    private final String checkboxAll;
    @C17952c(mo34828a = "checkbox_privacy_policy")
    private final String checkboxPP;
    @C17952c(mo34828a = "checkbox_terms_of_use")
    private final String checkboxTerms;
    @C17952c(mo34828a = "desc")
    private final String description;
    @C17952c(mo34828a = "tiktok_privacy_policy_url")
    private final String privacyPolicyUrl;
    @C17952c(mo34828a = "tiktok_terms_of_use_url")
    private final String termsOfUseUrl;
    @C17952c(mo34828a = "title")
    private final String title;

    public TermsConsentInfo() {
        this(null, null, null, null, null, null, null, null, null, 511, null);
    }

    public static /* synthetic */ TermsConsentInfo copy$default(TermsConsentInfo termsConsentInfo, String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, Object obj) {
        TermsConsentInfo termsConsentInfo2 = termsConsentInfo;
        int i2 = i;
        return termsConsentInfo.copy((i2 & 1) != 0 ? termsConsentInfo2.termsOfUseUrl : str, (i2 & 2) != 0 ? termsConsentInfo2.privacyPolicyUrl : str2, (i2 & 4) != 0 ? termsConsentInfo2.title : str3, (i2 & 8) != 0 ? termsConsentInfo2.description : str4, (i2 & 16) != 0 ? termsConsentInfo2.checkboxAll : str5, (i2 & 32) != 0 ? termsConsentInfo2.checkboxTerms : str6, (i2 & 64) != 0 ? termsConsentInfo2.checkboxPP : str7, (i2 & 128) != 0 ? termsConsentInfo2.button : str8, (i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? termsConsentInfo2.business : str9);
    }

    public final String component1() {
        return this.termsOfUseUrl;
    }

    public final String component2() {
        return this.privacyPolicyUrl;
    }

    public final String component3() {
        return this.title;
    }

    public final String component4() {
        return this.description;
    }

    public final String component5() {
        return this.checkboxAll;
    }

    public final String component6() {
        return this.checkboxTerms;
    }

    public final String component7() {
        return this.checkboxPP;
    }

    public final String component8() {
        return this.button;
    }

    public final String component9() {
        return this.business;
    }

    public final TermsConsentInfo copy(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        TermsConsentInfo termsConsentInfo = new TermsConsentInfo(str, str2, str3, str4, str5, str6, str7, str8, str9);
        return termsConsentInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:20:0x0060, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.business, (java.lang.Object) r3.business) != false) goto L_0x0065;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0065
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.protection.model.TermsConsentInfo
            if (r0 == 0) goto L_0x0063
            com.ss.android.ugc.aweme.protection.model.TermsConsentInfo r3 = (com.p683ss.android.ugc.aweme.protection.model.TermsConsentInfo) r3
            java.lang.String r0 = r2.termsOfUseUrl
            java.lang.String r1 = r3.termsOfUseUrl
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.privacyPolicyUrl
            java.lang.String r1 = r3.privacyPolicyUrl
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.description
            java.lang.String r1 = r3.description
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.checkboxAll
            java.lang.String r1 = r3.checkboxAll
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.checkboxTerms
            java.lang.String r1 = r3.checkboxTerms
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.checkboxPP
            java.lang.String r1 = r3.checkboxPP
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.button
            java.lang.String r1 = r3.button
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0063
            java.lang.String r0 = r2.business
            java.lang.String r3 = r3.business
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0063
            goto L_0x0065
        L_0x0063:
            r3 = 0
            return r3
        L_0x0065:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.protection.model.TermsConsentInfo.equals(java.lang.Object):boolean");
    }

    public final String getBusiness() {
        return this.business;
    }

    public final String getButton() {
        return this.button;
    }

    public final String getCheckboxAll() {
        return this.checkboxAll;
    }

    public final String getCheckboxPP() {
        return this.checkboxPP;
    }

    public final String getCheckboxTerms() {
        return this.checkboxTerms;
    }

    public final String getDescription() {
        return this.description;
    }

    public final String getPrivacyPolicyUrl() {
        return this.privacyPolicyUrl;
    }

    public final String getTermsOfUseUrl() {
        return this.termsOfUseUrl;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.termsOfUseUrl;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.privacyPolicyUrl;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.title;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.description;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.checkboxAll;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.checkboxTerms;
        int hashCode6 = (hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31;
        String str7 = this.checkboxPP;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.button;
        int hashCode8 = (hashCode7 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.business;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode8 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TermsConsentInfo(termsOfUseUrl=");
        sb.append(this.termsOfUseUrl);
        sb.append(", privacyPolicyUrl=");
        sb.append(this.privacyPolicyUrl);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", description=");
        sb.append(this.description);
        sb.append(", checkboxAll=");
        sb.append(this.checkboxAll);
        sb.append(", checkboxTerms=");
        sb.append(this.checkboxTerms);
        sb.append(", checkboxPP=");
        sb.append(this.checkboxPP);
        sb.append(", button=");
        sb.append(this.button);
        sb.append(", business=");
        sb.append(this.business);
        sb.append(")");
        return sb.toString();
    }

    public TermsConsentInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9) {
        this.termsOfUseUrl = str;
        this.privacyPolicyUrl = str2;
        this.title = str3;
        this.description = str4;
        this.checkboxAll = str5;
        this.checkboxTerms = str6;
        this.checkboxPP = str7;
        this.button = str8;
        this.business = str9;
    }

    public /* synthetic */ TermsConsentInfo(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, String str9, int i, C52707g gVar) {
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        String str15;
        String str16;
        String str17;
        String str18;
        int i2 = i;
        if ((i2 & 1) != 0) {
            str10 = "";
        } else {
            str10 = str;
        }
        if ((i2 & 2) != 0) {
            str11 = "";
        } else {
            str11 = str2;
        }
        if ((i2 & 4) != 0) {
            str12 = "";
        } else {
            str12 = str3;
        }
        if ((i2 & 8) != 0) {
            str13 = "";
        } else {
            str13 = str4;
        }
        if ((i2 & 16) != 0) {
            str14 = "";
        } else {
            str14 = str5;
        }
        if ((i2 & 32) != 0) {
            str15 = "";
        } else {
            str15 = str6;
        }
        if ((i2 & 64) != 0) {
            str16 = "";
        } else {
            str16 = str7;
        }
        if ((i2 & 128) != 0) {
            str17 = "";
        } else {
            str17 = str8;
        }
        if ((i2 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0) {
            str18 = "";
        } else {
            str18 = str9;
        }
        this(str10, str11, str12, str13, str14, str15, str16, str17, str18);
    }
}
