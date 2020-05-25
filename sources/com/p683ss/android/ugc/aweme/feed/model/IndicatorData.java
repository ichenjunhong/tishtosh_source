package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.feed.model.IndicatorData */
public final class IndicatorData implements Serializable {
    @C17952c(mo34828a = "box_url")
    private final AwemeUrl boxUrl;
    @C17952c(mo34828a = "conversion_area")
    private final NewButtonInfo conversionArea;
    @C17952c(mo34828a = "indicator_icon")
    private final UrlModel indicatorIcon;
    @C17952c(mo34828a = "indicator_start_box")
    private final BoxData indicatorStartBox;

    public IndicatorData() {
        this(null, null, null, null, 15, null);
    }

    public static /* synthetic */ IndicatorData copy$default(IndicatorData indicatorData, UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo, int i, Object obj) {
        if ((i & 1) != 0) {
            urlModel = indicatorData.indicatorIcon;
        }
        if ((i & 2) != 0) {
            boxData = indicatorData.indicatorStartBox;
        }
        if ((i & 4) != 0) {
            awemeUrl = indicatorData.boxUrl;
        }
        if ((i & 8) != 0) {
            newButtonInfo = indicatorData.conversionArea;
        }
        return indicatorData.copy(urlModel, boxData, awemeUrl, newButtonInfo);
    }

    public final UrlModel component1() {
        return this.indicatorIcon;
    }

    public final BoxData component2() {
        return this.indicatorStartBox;
    }

    public final AwemeUrl component3() {
        return this.boxUrl;
    }

    public final NewButtonInfo component4() {
        return this.conversionArea;
    }

    public final IndicatorData copy(UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo) {
        return new IndicatorData(urlModel, boxData, awemeUrl, newButtonInfo);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.conversionArea, (java.lang.Object) r3.conversionArea) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.feed.model.IndicatorData
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.IndicatorData r3 = (com.p683ss.android.ugc.aweme.feed.model.IndicatorData) r3
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.indicatorIcon
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.indicatorIcon
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.BoxData r0 = r2.indicatorStartBox
            com.ss.android.ugc.aweme.feed.model.BoxData r1 = r3.indicatorStartBox
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.AwemeUrl r0 = r2.boxUrl
            com.ss.android.ugc.aweme.feed.model.AwemeUrl r1 = r3.boxUrl
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.aweme.feed.model.NewButtonInfo r0 = r2.conversionArea
            com.ss.android.ugc.aweme.feed.model.NewButtonInfo r3 = r3.conversionArea
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.model.IndicatorData.equals(java.lang.Object):boolean");
    }

    public final AwemeUrl getBoxUrl() {
        return this.boxUrl;
    }

    public final NewButtonInfo getConversionArea() {
        return this.conversionArea;
    }

    public final UrlModel getIndicatorIcon() {
        return this.indicatorIcon;
    }

    public final BoxData getIndicatorStartBox() {
        return this.indicatorStartBox;
    }

    public final int hashCode() {
        UrlModel urlModel = this.indicatorIcon;
        int i = 0;
        int hashCode = (urlModel != null ? urlModel.hashCode() : 0) * 31;
        BoxData boxData = this.indicatorStartBox;
        int hashCode2 = (hashCode + (boxData != null ? boxData.hashCode() : 0)) * 31;
        AwemeUrl awemeUrl = this.boxUrl;
        int hashCode3 = (hashCode2 + (awemeUrl != null ? awemeUrl.hashCode() : 0)) * 31;
        NewButtonInfo newButtonInfo = this.conversionArea;
        if (newButtonInfo != null) {
            i = newButtonInfo.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("IndicatorData(indicatorIcon=");
        sb.append(this.indicatorIcon);
        sb.append(", indicatorStartBox=");
        sb.append(this.indicatorStartBox);
        sb.append(", boxUrl=");
        sb.append(this.boxUrl);
        sb.append(", conversionArea=");
        sb.append(this.conversionArea);
        sb.append(")");
        return sb.toString();
    }

    public IndicatorData(UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo) {
        this.indicatorIcon = urlModel;
        this.indicatorStartBox = boxData;
        this.boxUrl = awemeUrl;
        this.conversionArea = newButtonInfo;
    }

    public /* synthetic */ IndicatorData(UrlModel urlModel, BoxData boxData, AwemeUrl awemeUrl, NewButtonInfo newButtonInfo, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            urlModel = null;
        }
        if ((i & 2) != 0) {
            boxData = null;
        }
        if ((i & 4) != 0) {
            awemeUrl = null;
        }
        if ((i & 8) != 0) {
            newButtonInfo = null;
        }
        this(urlModel, boxData, awemeUrl, newButtonInfo);
    }
}
