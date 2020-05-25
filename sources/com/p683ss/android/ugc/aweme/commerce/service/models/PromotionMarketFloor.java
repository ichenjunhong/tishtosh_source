package com.p683ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor */
public final class PromotionMarketFloor implements Serializable {
    @C17952c(mo34828a = "icon")
    private UrlModel icon;
    @C17952c(mo34828a = "image")
    private UrlModel image;
    @C17952c(mo34828a = "name")
    private String name;
    @C17952c(mo34828a = "title")
    private String title;
    @C17952c(mo34828a = "tma_url")
    private String tma_url;
    @C17952c(mo34828a = "url")
    private String url;

    public PromotionMarketFloor() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ PromotionMarketFloor copy$default(PromotionMarketFloor promotionMarketFloor, String str, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = promotionMarketFloor.title;
        }
        if ((i & 2) != 0) {
            str2 = promotionMarketFloor.name;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = promotionMarketFloor.url;
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = promotionMarketFloor.tma_url;
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            urlModel = promotionMarketFloor.icon;
        }
        UrlModel urlModel3 = urlModel;
        if ((i & 32) != 0) {
            urlModel2 = promotionMarketFloor.image;
        }
        return promotionMarketFloor.copy(str, str5, str6, str7, urlModel3, urlModel2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.name;
    }

    public final String component3() {
        return this.url;
    }

    public final String component4() {
        return this.tma_url;
    }

    public final UrlModel component5() {
        return this.icon;
    }

    public final UrlModel component6() {
        return this.image;
    }

    public final PromotionMarketFloor copy(String str, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2) {
        PromotionMarketFloor promotionMarketFloor = new PromotionMarketFloor(str, str2, str3, str4, urlModel, urlModel2);
        return promotionMarketFloor;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.image, (java.lang.Object) r3.image) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor r3 = (com.p683ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor) r3
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.name
            java.lang.String r1 = r3.name
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.url
            java.lang.String r1 = r3.url
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.tma_url
            java.lang.String r1 = r3.tma_url
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.icon
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.icon
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.image
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.image
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0045
            goto L_0x0047
        L_0x0045:
            r3 = 0
            return r3
        L_0x0047:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commerce.service.models.PromotionMarketFloor.equals(java.lang.Object):boolean");
    }

    public final UrlModel getIcon() {
        return this.icon;
    }

    public final UrlModel getImage() {
        return this.image;
    }

    public final String getName() {
        return this.name;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getTma_url() {
        return this.tma_url;
    }

    public final String getUrl() {
        return this.url;
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.name;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.url;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.tma_url;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        UrlModel urlModel = this.icon;
        int hashCode5 = (hashCode4 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        UrlModel urlModel2 = this.image;
        if (urlModel2 != null) {
            i = urlModel2.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PromotionMarketFloor(title=");
        sb.append(this.title);
        sb.append(", name=");
        sb.append(this.name);
        sb.append(", url=");
        sb.append(this.url);
        sb.append(", tma_url=");
        sb.append(this.tma_url);
        sb.append(", icon=");
        sb.append(this.icon);
        sb.append(", image=");
        sb.append(this.image);
        sb.append(")");
        return sb.toString();
    }

    public final void setIcon(UrlModel urlModel) {
        this.icon = urlModel;
    }

    public final void setImage(UrlModel urlModel) {
        this.image = urlModel;
    }

    public final void setName(String str) {
        this.name = str;
    }

    public final void setTitle(String str) {
        this.title = str;
    }

    public final void setTma_url(String str) {
        this.tma_url = str;
    }

    public final void setUrl(String str) {
        this.url = str;
    }

    public PromotionMarketFloor(String str, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2) {
        this.title = str;
        this.name = str2;
        this.url = str3;
        this.tma_url = str4;
        this.icon = urlModel;
        this.image = urlModel2;
    }

    public /* synthetic */ PromotionMarketFloor(String str, String str2, String str3, String str4, UrlModel urlModel, UrlModel urlModel2, int i, C52707g gVar) {
        UrlModel urlModel3;
        UrlModel urlModel4;
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = "";
        }
        String str6 = str3;
        if ((i & 8) != 0) {
            str4 = "";
        }
        String str7 = str4;
        if ((i & 16) != 0) {
            urlModel3 = null;
        } else {
            urlModel3 = urlModel;
        }
        if ((i & 32) != 0) {
            urlModel4 = null;
        } else {
            urlModel4 = urlModel2;
        }
        this(str, str5, str6, str7, urlModel3, urlModel4);
    }
}
