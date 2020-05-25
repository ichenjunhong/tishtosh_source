package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel */
public final class AwemeHybridLabelModel implements Serializable {
    @C17952c(mo34828a = "background_color")
    public String backgroundColor;
    @C17952c(mo34828a = "image")
    public UrlModel imageUrl;
    @C17952c(mo34828a = "ref_url")
    public String refUrl;
    @C17952c(mo34828a = "text")
    public String text;
    @C17952c(mo34828a = "text_color")
    public String textColor;

    public AwemeHybridLabelModel() {
    }

    public static /* synthetic */ AwemeHybridLabelModel copy$default(AwemeHybridLabelModel awemeHybridLabelModel, String str, String str2, String str3, UrlModel urlModel, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = awemeHybridLabelModel.backgroundColor;
        }
        if ((i & 2) != 0) {
            str2 = awemeHybridLabelModel.text;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = awemeHybridLabelModel.textColor;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            urlModel = awemeHybridLabelModel.imageUrl;
        }
        UrlModel urlModel2 = urlModel;
        if ((i & 16) != 0) {
            str4 = awemeHybridLabelModel.refUrl;
        }
        return awemeHybridLabelModel.copy(str, str5, str6, urlModel2, str4);
    }

    public final String component1() {
        return this.backgroundColor;
    }

    public final String component2() {
        return this.text;
    }

    public final String component3() {
        return this.textColor;
    }

    public final UrlModel component4() {
        return this.imageUrl;
    }

    public final String component5() {
        return this.refUrl;
    }

    public final AwemeHybridLabelModel copy(String str, String str2, String str3, UrlModel urlModel, String str4) {
        AwemeHybridLabelModel awemeHybridLabelModel = new AwemeHybridLabelModel(str, str2, str3, urlModel, str4);
        return awemeHybridLabelModel;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.refUrl, (java.lang.Object) r3.refUrl) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel r3 = (com.p683ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel) r3
            java.lang.String r0 = r2.backgroundColor
            java.lang.String r1 = r3.backgroundColor
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.text
            java.lang.String r1 = r3.text
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.textColor
            java.lang.String r1 = r3.textColor
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.imageUrl
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.imageUrl
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.refUrl
            java.lang.String r3 = r3.refUrl
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x003b
            goto L_0x003d
        L_0x003b:
            r3 = 0
            return r3
        L_0x003d:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.model.AwemeHybridLabelModel.equals(java.lang.Object):boolean");
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final UrlModel getImageUrl() {
        return this.imageUrl;
    }

    public final String getRefUrl() {
        return this.refUrl;
    }

    public final String getText() {
        return this.text;
    }

    public final String getTextColor() {
        return this.textColor;
    }

    public final int hashCode() {
        String str = this.backgroundColor;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.textColor;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        UrlModel urlModel = this.imageUrl;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str4 = this.refUrl;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeHybridLabelModel(backgroundColor=");
        sb.append(this.backgroundColor);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", textColor=");
        sb.append(this.textColor);
        sb.append(", imageUrl=");
        sb.append(this.imageUrl);
        sb.append(", refUrl=");
        sb.append(this.refUrl);
        sb.append(")");
        return sb.toString();
    }

    public final void setBackgroundColor(String str) {
        this.backgroundColor = str;
    }

    public final void setImageUrl(UrlModel urlModel) {
        this.imageUrl = urlModel;
    }

    public final void setRefUrl(String str) {
        this.refUrl = str;
    }

    public final void setText(String str) {
        this.text = str;
    }

    public final void setTextColor(String str) {
        this.textColor = str;
    }

    public AwemeHybridLabelModel(String str, String str2, String str3, UrlModel urlModel, String str4) {
        this.backgroundColor = str;
        this.text = str2;
        this.textColor = str3;
        this.imageUrl = urlModel;
        this.refUrl = str4;
    }
}
