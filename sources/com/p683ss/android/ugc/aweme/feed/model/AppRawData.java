package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.experiment.UnReadVideoExperiment;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AppRawData */
public final class AppRawData implements Serializable {
    @C17952c(mo34828a = "download_mode")
    private final int downloadMode;
    @C17952c(mo34828a = "download_url")
    private final String downloadUrl;
    @C17952c(mo34828a = "event_tag")
    private final String eventTag;
    @C17952c(mo34828a = "group_id")
    private final String groupId;
    @C17952c(mo34828a = "id")

    /* renamed from: id */
    private final String f79727id;
    @C17952c(mo34828a = "is_ad")
    private final int isAd;
    @C17952c(mo34828a = "log_extra")
    private final String logExtra;
    @C17952c(mo34828a = "name")
    private final String name;
    @C17952c(mo34828a = "pkg_name")
    private final String pkgName;
    @C17952c(mo34828a = "quick_app_url")
    private final String quickAppUrl;

    public AppRawData() {
        this(null, null, null, null, null, null, 0, null, null, 0, 1023, null);
    }

    public static /* synthetic */ AppRawData copy$default(AppRawData appRawData, String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2, int i3, Object obj) {
        AppRawData appRawData2 = appRawData;
        int i4 = i3;
        return appRawData.copy((i4 & 1) != 0 ? appRawData2.f79727id : str, (i4 & 2) != 0 ? appRawData2.name : str2, (i4 & 4) != 0 ? appRawData2.pkgName : str3, (i4 & 8) != 0 ? appRawData2.downloadUrl : str4, (i4 & 16) != 0 ? appRawData2.eventTag : str5, (i4 & 32) != 0 ? appRawData2.groupId : str6, (i4 & 64) != 0 ? appRawData2.isAd : i, (i4 & 128) != 0 ? appRawData2.logExtra : str7, (i4 & UnReadVideoExperiment.BROWSE_RECORD_LIST) != 0 ? appRawData2.quickAppUrl : str8, (i4 & UnReadVideoExperiment.LIKE_USER_LIST) != 0 ? appRawData2.downloadMode : i2);
    }

    public final String component1() {
        return this.f79727id;
    }

    public final int component10() {
        return this.downloadMode;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.pkgName;
    }

    public final String component4() {
        return this.downloadUrl;
    }

    public final String component5() {
        return this.eventTag;
    }

    public final String component6() {
        return this.groupId;
    }

    public final int component7() {
        return this.isAd;
    }

    public final String component8() {
        return this.logExtra;
    }

    public final String component9() {
        return this.quickAppUrl;
    }

    public final AppRawData copy(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2) {
        AppRawData appRawData = new AppRawData(str, str2, str3, str4, str5, str6, i, str7, str8, i2);
        return appRawData;
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof AppRawData) {
                AppRawData appRawData = (AppRawData) obj;
                if (C52711k.m112239a((Object) this.f79727id, (Object) appRawData.f79727id) && C52711k.m112239a((Object) this.name, (Object) appRawData.name) && C52711k.m112239a((Object) this.pkgName, (Object) appRawData.pkgName) && C52711k.m112239a((Object) this.downloadUrl, (Object) appRawData.downloadUrl) && C52711k.m112239a((Object) this.eventTag, (Object) appRawData.eventTag) && C52711k.m112239a((Object) this.groupId, (Object) appRawData.groupId)) {
                    if ((this.isAd == appRawData.isAd) && C52711k.m112239a((Object) this.logExtra, (Object) appRawData.logExtra) && C52711k.m112239a((Object) this.quickAppUrl, (Object) appRawData.quickAppUrl)) {
                        if (this.downloadMode == appRawData.downloadMode) {
                            return true;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int getDownloadMode() {
        return this.downloadMode;
    }

    public final String getDownloadUrl() {
        return this.downloadUrl;
    }

    public final String getEventTag() {
        return this.eventTag;
    }

    public final String getGroupId() {
        return this.groupId;
    }

    public final String getId() {
        return this.f79727id;
    }

    public final String getLogExtra() {
        return this.logExtra;
    }

    public final String getName() {
        return this.name;
    }

    public final String getPkgName() {
        return this.pkgName;
    }

    public final String getQuickAppUrl() {
        return this.quickAppUrl;
    }

    public final int hashCode() {
        String str = this.f79727id;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.pkgName;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.downloadUrl;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.eventTag;
        int hashCode5 = (hashCode4 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.groupId;
        int hashCode6 = (((hashCode5 + (str6 != null ? str6.hashCode() : 0)) * 31) + this.isAd) * 31;
        String str7 = this.logExtra;
        int hashCode7 = (hashCode6 + (str7 != null ? str7.hashCode() : 0)) * 31;
        String str8 = this.quickAppUrl;
        if (str8 != null) {
            i = str8.hashCode();
        }
        return ((hashCode7 + i) * 31) + this.downloadMode;
    }

    public final int isAd() {
        return this.isAd;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AppRawData(id=");
        sb.append(this.f79727id);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", pkgName=");
        sb.append(this.pkgName);
        sb.append(", downloadUrl=");
        sb.append(this.downloadUrl);
        sb.append(", eventTag=");
        sb.append(this.eventTag);
        sb.append(", groupId=");
        sb.append(this.groupId);
        sb.append(", isAd=");
        sb.append(this.isAd);
        sb.append(", logExtra=");
        sb.append(this.logExtra);
        sb.append(", quickAppUrl=");
        sb.append(this.quickAppUrl);
        sb.append(", downloadMode=");
        sb.append(this.downloadMode);
        sb.append(")");
        return sb.toString();
    }

    public AppRawData(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2) {
        this.f79727id = str;
        this.name = str2;
        this.pkgName = str3;
        this.downloadUrl = str4;
        this.eventTag = str5;
        this.groupId = str6;
        this.isAd = i;
        this.logExtra = str7;
        this.quickAppUrl = str8;
        this.downloadMode = i2;
    }

    public /* synthetic */ AppRawData(String str, String str2, String str3, String str4, String str5, String str6, int i, String str7, String str8, int i2, int i3, C52707g gVar) {
        String str9;
        String str10;
        String str11;
        String str12;
        String str13;
        String str14;
        int i4;
        String str15;
        int i5 = i3;
        String str16 = null;
        if ((i5 & 1) != 0) {
            str9 = null;
        } else {
            str9 = str;
        }
        if ((i5 & 2) != 0) {
            str10 = null;
        } else {
            str10 = str2;
        }
        if ((i5 & 4) != 0) {
            str11 = null;
        } else {
            str11 = str3;
        }
        if ((i5 & 8) != 0) {
            str12 = null;
        } else {
            str12 = str4;
        }
        if ((i5 & 16) != 0) {
            str13 = null;
        } else {
            str13 = str5;
        }
        if ((i5 & 32) != 0) {
            str14 = null;
        } else {
            str14 = str6;
        }
        int i6 = 0;
        if ((i5 & 64) != 0) {
            i4 = 0;
        } else {
            i4 = i;
        }
        if ((i5 & 128) != 0) {
            str15 = null;
        } else {
            str15 = str7;
        }
        if ((i5 & UnReadVideoExperiment.BROWSE_RECORD_LIST) == 0) {
            str16 = str8;
        }
        if ((i5 & UnReadVideoExperiment.LIKE_USER_LIST) == 0) {
            i6 = i2;
        }
        this(str9, str10, str11, str12, str13, str14, i4, str15, str16, i6);
    }
}
