package com.p683ss.android.ugc.aweme.protection.gradientpunish;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.aweme.protection.gradientpunish.GradientPunishWarning */
public final class GradientPunishWarning {
    @C17952c(mo34828a = "toast_text")
    public final String bubbleText;
    @C17952c(mo34828a = "detail_url")
    public final String detailUrl;
    @C17952c(mo34828a = "popup_confirm")
    public final String dialogButton;
    @C17952c(mo34828a = "popup_text")
    public final String dialogMessage;
    @C17952c(mo34828a = "warn_type")
    public final int warnType;

    public GradientPunishWarning() {
        this(null, null, null, 0, null, 31, null);
    }

    public static /* synthetic */ GradientPunishWarning copy$default(GradientPunishWarning gradientPunishWarning, String str, String str2, String str3, int i, String str4, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            str = gradientPunishWarning.dialogMessage;
        }
        if ((i2 & 2) != 0) {
            str2 = gradientPunishWarning.dialogButton;
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = gradientPunishWarning.bubbleText;
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i = gradientPunishWarning.warnType;
        }
        int i3 = i;
        if ((i2 & 16) != 0) {
            str4 = gradientPunishWarning.detailUrl;
        }
        return gradientPunishWarning.copy(str, str5, str6, i3, str4);
    }

    public final String component1() {
        return this.dialogMessage;
    }

    public final String component2() {
        return this.dialogButton;
    }

    public final String component3() {
        return this.bubbleText;
    }

    public final int component4() {
        return this.warnType;
    }

    public final String component5() {
        return this.detailUrl;
    }

    public final GradientPunishWarning copy(String str, String str2, String str3, int i, String str4) {
        C52711k.m112240b(str, "dialogMessage");
        C52711k.m112240b(str2, "dialogButton");
        C52711k.m112240b(str3, "bubbleText");
        C52711k.m112240b(str4, "detailUrl");
        GradientPunishWarning gradientPunishWarning = new GradientPunishWarning(str, str2, str3, i, str4);
        return gradientPunishWarning;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof GradientPunishWarning) {
                GradientPunishWarning gradientPunishWarning = (GradientPunishWarning) obj;
                if (C52711k.m112239a((Object) this.dialogMessage, (Object) gradientPunishWarning.dialogMessage) && C52711k.m112239a((Object) this.dialogButton, (Object) gradientPunishWarning.dialogButton) && C52711k.m112239a((Object) this.bubbleText, (Object) gradientPunishWarning.bubbleText)) {
                    if (!(this.warnType == gradientPunishWarning.warnType) || !C52711k.m112239a((Object) this.detailUrl, (Object) gradientPunishWarning.detailUrl)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getBubbleText() {
        return this.bubbleText;
    }

    public final String getDetailUrl() {
        return this.detailUrl;
    }

    public final String getDialogButton() {
        return this.dialogButton;
    }

    public final String getDialogMessage() {
        return this.dialogMessage;
    }

    public final int getWarnType() {
        return this.warnType;
    }

    public final int hashCode() {
        String str = this.dialogMessage;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.dialogButton;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.bubbleText;
        int hashCode3 = (((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + Integer.hashCode(this.warnType)) * 31;
        String str4 = this.detailUrl;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GradientPunishWarning(dialogMessage=");
        sb.append(this.dialogMessage);
        sb.append(", dialogButton=");
        sb.append(this.dialogButton);
        sb.append(", bubbleText=");
        sb.append(this.bubbleText);
        sb.append(", warnType=");
        sb.append(this.warnType);
        sb.append(", detailUrl=");
        sb.append(this.detailUrl);
        sb.append(")");
        return sb.toString();
    }

    public GradientPunishWarning(String str, String str2, String str3, int i, String str4) {
        C52711k.m112240b(str, "dialogMessage");
        C52711k.m112240b(str2, "dialogButton");
        C52711k.m112240b(str3, "bubbleText");
        C52711k.m112240b(str4, "detailUrl");
        this.dialogMessage = str;
        this.dialogButton = str2;
        this.bubbleText = str3;
        this.warnType = i;
        this.detailUrl = str4;
    }

    public /* synthetic */ GradientPunishWarning(String str, String str2, String str3, int i, String str4, int i2, C52707g gVar) {
        int i3;
        if ((i2 & 1) != 0) {
            str = "";
        }
        if ((i2 & 2) != 0) {
            str2 = "";
        }
        String str5 = str2;
        if ((i2 & 4) != 0) {
            str3 = "";
        }
        String str6 = str3;
        if ((i2 & 8) != 0) {
            i3 = 0;
        } else {
            i3 = i;
        }
        if ((i2 & 16) != 0) {
            str4 = "";
        }
        this(str, str5, str6, i3, str4);
    }
}
