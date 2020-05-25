package com.p683ss.android.ugc.aweme.compliance.business.api.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.compliance.business.api.model.AppealStatusResponse */
public final class AppealStatusResponse extends BaseResponse {
    @C17952c(mo34828a = "appeal_type")
    private final int appealType;
    @C17952c(mo34828a = "appeal_url")
    private final String appealUrl;
    @C17952c(mo34828a = "ban_time")
    private final long banTime;
    @C17952c(mo34828a = "ban_type")
    private final int banType;
    @C17952c(mo34828a = "pop_content")
    private final String popContent;
    @C17952c(mo34828a = "pop_title")
    private final String popTitle;
    @C17952c(mo34828a = "status")
    private final int status;

    public AppealStatusResponse() {
        this(0, 0, 0, 0, null, null, null, 127, null);
    }

    public static /* synthetic */ AppealStatusResponse copy$default(AppealStatusResponse appealStatusResponse, int i, int i2, long j, int i3, String str, String str2, String str3, int i4, Object obj) {
        AppealStatusResponse appealStatusResponse2 = appealStatusResponse;
        return appealStatusResponse.copy((i4 & 1) != 0 ? appealStatusResponse2.status : i, (i4 & 2) != 0 ? appealStatusResponse2.banType : i2, (i4 & 4) != 0 ? appealStatusResponse2.banTime : j, (i4 & 8) != 0 ? appealStatusResponse2.appealType : i3, (i4 & 16) != 0 ? appealStatusResponse2.popTitle : str, (i4 & 32) != 0 ? appealStatusResponse2.popContent : str2, (i4 & 64) != 0 ? appealStatusResponse2.appealUrl : str3);
    }

    public final int component1() {
        return this.status;
    }

    public final int component2() {
        return this.banType;
    }

    public final long component3() {
        return this.banTime;
    }

    public final int component4() {
        return this.appealType;
    }

    public final String component5() {
        return this.popTitle;
    }

    public final String component6() {
        return this.popContent;
    }

    public final String component7() {
        return this.appealUrl;
    }

    public final AppealStatusResponse copy(int i, int i2, long j, int i3, String str, String str2, String str3) {
        AppealStatusResponse appealStatusResponse = new AppealStatusResponse(i, i2, j, i3, str, str2, str3);
        return appealStatusResponse;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppealStatusResponse) {
                AppealStatusResponse appealStatusResponse = (AppealStatusResponse) obj;
                if (this.status == appealStatusResponse.status) {
                    if (this.banType == appealStatusResponse.banType) {
                        if (this.banTime == appealStatusResponse.banTime) {
                            if (!(this.appealType == appealStatusResponse.appealType) || !C52711k.m112239a((Object) this.popTitle, (Object) appealStatusResponse.popTitle) || !C52711k.m112239a((Object) this.popContent, (Object) appealStatusResponse.popContent) || !C52711k.m112239a((Object) this.appealUrl, (Object) appealStatusResponse.appealUrl)) {
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

    public final int getAppealType() {
        return this.appealType;
    }

    public final String getAppealUrl() {
        return this.appealUrl;
    }

    public final long getBanTime() {
        return this.banTime;
    }

    public final int getBanType() {
        return this.banType;
    }

    public final String getPopContent() {
        return this.popContent;
    }

    public final String getPopTitle() {
        return this.popTitle;
    }

    public final int getStatus() {
        return this.status;
    }

    public final int hashCode() {
        int i = ((this.status * 31) + this.banType) * 31;
        long j = this.banTime;
        int i2 = (((i + ((int) (j ^ (j >>> 32)))) * 31) + this.appealType) * 31;
        String str = this.popTitle;
        int i3 = 0;
        int hashCode = (i2 + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.popContent;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.appealUrl;
        if (str3 != null) {
            i3 = str3.hashCode();
        }
        return hashCode2 + i3;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppealStatusResponse(status=");
        sb.append(this.status);
        sb.append(", banType=");
        sb.append(this.banType);
        sb.append(", banTime=");
        sb.append(this.banTime);
        sb.append(", appealType=");
        sb.append(this.appealType);
        sb.append(", popTitle=");
        sb.append(this.popTitle);
        sb.append(", popContent=");
        sb.append(this.popContent);
        sb.append(", appealUrl=");
        sb.append(this.appealUrl);
        sb.append(")");
        return sb.toString();
    }

    public AppealStatusResponse(int i, int i2, long j, int i3, String str, String str2, String str3) {
        this.status = i;
        this.banType = i2;
        this.banTime = j;
        this.appealType = i3;
        this.popTitle = str;
        this.popContent = str2;
        this.appealUrl = str3;
    }

    public /* synthetic */ AppealStatusResponse(int i, int i2, long j, int i3, String str, String str2, String str3, int i4, C52707g gVar) {
        int i5;
        int i6;
        long j2;
        String str4;
        String str5;
        int i7 = -1;
        if ((i4 & 1) != 0) {
            i5 = -1;
        } else {
            i5 = i;
        }
        if ((i4 & 2) != 0) {
            i6 = -1;
        } else {
            i6 = i2;
        }
        if ((i4 & 4) != 0) {
            j2 = 0;
        } else {
            j2 = j;
        }
        if ((i4 & 8) == 0) {
            i7 = i3;
        }
        String str6 = null;
        if ((i4 & 16) != 0) {
            str4 = null;
        } else {
            str4 = str;
        }
        if ((i4 & 32) != 0) {
            str5 = null;
        } else {
            str5 = str2;
        }
        if ((i4 & 64) == 0) {
            str6 = str3;
        }
        this(i5, i6, j2, i7, str4, str5, str6);
    }
}
