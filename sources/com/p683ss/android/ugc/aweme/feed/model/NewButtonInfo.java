package com.p683ss.android.ugc.aweme.feed.model;

import com.bytedance.android.livesdk.gift.effect.normal.view.NormalGiftView;
import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.feed.model.NewButtonInfo */
public final class NewButtonInfo implements Serializable {
    @C17952c(mo34828a = "app_data")
    private final AppRawData appData;
    @C17952c(mo34828a = "apple_id")
    private final String appleId;
    @C17952c(mo34828a = "button_background_color")
    private final String buttonBackgroundColor;
    @C17952c(mo34828a = "button_text")
    private final String buttonText;
    @C17952c(mo34828a = "image_url_list")
    private final AwemeUrl imageUrlList;
    @C17952c(mo34828a = "source")
    private final String source;
    @C17952c(mo34828a = "style_type")
    private final Integer styleType;
    @C17952c(mo34828a = "title")
    private final String title;

    public NewButtonInfo() {
        this(null, null, null, null, null, null, null, null, NormalGiftView.ALPHA_255, null);
    }

    public static /* synthetic */ NewButtonInfo copy$default(NewButtonInfo newButtonInfo, Integer num, String str, String str2, AppRawData appRawData, String str3, String str4, String str5, AwemeUrl awemeUrl, int i, Object obj) {
        NewButtonInfo newButtonInfo2 = newButtonInfo;
        int i2 = i;
        return newButtonInfo.copy((i2 & 1) != 0 ? newButtonInfo2.styleType : num, (i2 & 2) != 0 ? newButtonInfo2.buttonText : str, (i2 & 4) != 0 ? newButtonInfo2.buttonBackgroundColor : str2, (i2 & 8) != 0 ? newButtonInfo2.appData : appRawData, (i2 & 16) != 0 ? newButtonInfo2.appleId : str3, (i2 & 32) != 0 ? newButtonInfo2.source : str4, (i2 & 64) != 0 ? newButtonInfo2.title : str5, (i2 & 128) != 0 ? newButtonInfo2.imageUrlList : awemeUrl);
    }

    public final Integer component1() {
        return this.styleType;
    }

    public final String component2() {
        return this.buttonText;
    }

    public final String component3() {
        return this.buttonBackgroundColor;
    }

    public final AppRawData component4() {
        return this.appData;
    }

    public final String component5() {
        return this.appleId;
    }

    public final String component6() {
        return this.source;
    }

    public final String component7() {
        return this.title;
    }

    public final AwemeUrl component8() {
        return this.imageUrlList;
    }

    public final NewButtonInfo copy(Integer num, String str, String str2, AppRawData appRawData, String str3, String str4, String str5, AwemeUrl awemeUrl) {
        NewButtonInfo newButtonInfo = new NewButtonInfo(num, str, str2, appRawData, str3, str4, str5, awemeUrl);
        return newButtonInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:18:0x0056, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.imageUrlList, (java.lang.Object) r3.imageUrlList) != false) goto L_0x005b;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x005b
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.feed.model.NewButtonInfo
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.feed.model.NewButtonInfo r3 = (com.p683ss.android.ugc.aweme.feed.model.NewButtonInfo) r3
            java.lang.Integer r0 = r2.styleType
            java.lang.Integer r1 = r3.styleType
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.buttonText
            java.lang.String r1 = r3.buttonText
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.buttonBackgroundColor
            java.lang.String r1 = r3.buttonBackgroundColor
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.feed.model.AppRawData r0 = r2.appData
            com.ss.android.ugc.aweme.feed.model.AppRawData r1 = r3.appData
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.appleId
            java.lang.String r1 = r3.appleId
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.source
            java.lang.String r1 = r3.source
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0059
            com.ss.android.ugc.aweme.feed.model.AwemeUrl r0 = r2.imageUrlList
            com.ss.android.ugc.aweme.feed.model.AwemeUrl r3 = r3.imageUrlList
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0059
            goto L_0x005b
        L_0x0059:
            r3 = 0
            return r3
        L_0x005b:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.model.NewButtonInfo.equals(java.lang.Object):boolean");
    }

    public final AppRawData getAppData() {
        return this.appData;
    }

    public final String getAppleId() {
        return this.appleId;
    }

    public final String getButtonBackgroundColor() {
        return this.buttonBackgroundColor;
    }

    public final String getButtonText() {
        return this.buttonText;
    }

    public final AwemeUrl getImageUrlList() {
        return this.imageUrlList;
    }

    public final String getSource() {
        return this.source;
    }

    public final Integer getStyleType() {
        return this.styleType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        Integer num = this.styleType;
        int i = 0;
        int hashCode = (num != null ? num.hashCode() : 0) * 31;
        String str = this.buttonText;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.buttonBackgroundColor;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        AppRawData appRawData = this.appData;
        int hashCode4 = (hashCode3 + (appRawData != null ? appRawData.hashCode() : 0)) * 31;
        String str3 = this.appleId;
        int hashCode5 = (hashCode4 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.source;
        int hashCode6 = (hashCode5 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.title;
        int hashCode7 = (hashCode6 + (str5 != null ? str5.hashCode() : 0)) * 31;
        AwemeUrl awemeUrl = this.imageUrlList;
        if (awemeUrl != null) {
            i = awemeUrl.hashCode();
        }
        return hashCode7 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NewButtonInfo(styleType=");
        sb.append(this.styleType);
        sb.append(", buttonText=");
        sb.append(this.buttonText);
        sb.append(", buttonBackgroundColor=");
        sb.append(this.buttonBackgroundColor);
        sb.append(", appData=");
        sb.append(this.appData);
        sb.append(", appleId=");
        sb.append(this.appleId);
        sb.append(", source=");
        sb.append(this.source);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", imageUrlList=");
        sb.append(this.imageUrlList);
        sb.append(")");
        return sb.toString();
    }

    public NewButtonInfo(Integer num, String str, String str2, AppRawData appRawData, String str3, String str4, String str5, AwemeUrl awemeUrl) {
        this.styleType = num;
        this.buttonText = str;
        this.buttonBackgroundColor = str2;
        this.appData = appRawData;
        this.appleId = str3;
        this.source = str4;
        this.title = str5;
        this.imageUrlList = awemeUrl;
    }

    public /* synthetic */ NewButtonInfo(Integer num, String str, String str2, AppRawData appRawData, String str3, String str4, String str5, AwemeUrl awemeUrl, int i, C52707g gVar) {
        Integer num2;
        String str6;
        String str7;
        AppRawData appRawData2;
        String str8;
        String str9;
        String str10;
        int i2 = i;
        if ((i2 & 1) != 0) {
            num2 = Integer.valueOf(0);
        } else {
            num2 = num;
        }
        AwemeUrl awemeUrl2 = null;
        if ((i2 & 2) != 0) {
            str6 = null;
        } else {
            str6 = str;
        }
        if ((i2 & 4) != 0) {
            str7 = null;
        } else {
            str7 = str2;
        }
        if ((i2 & 8) != 0) {
            appRawData2 = null;
        } else {
            appRawData2 = appRawData;
        }
        if ((i2 & 16) != 0) {
            str8 = null;
        } else {
            str8 = str3;
        }
        if ((i2 & 32) != 0) {
            str9 = null;
        } else {
            str9 = str4;
        }
        if ((i2 & 64) != 0) {
            str10 = null;
        } else {
            str10 = str5;
        }
        if ((i2 & 128) == 0) {
            awemeUrl2 = awemeUrl;
        }
        this(num2, str6, str7, appRawData2, str8, str9, str10, awemeUrl2);
    }
}
