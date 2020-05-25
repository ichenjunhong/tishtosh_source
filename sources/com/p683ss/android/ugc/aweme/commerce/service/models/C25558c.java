package com.p683ss.android.ugc.aweme.commerce.service.models;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import com.p683ss.android.ugc.aweme.commerce.model.PromotionVisitor;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.models.c */
public final class C25558c {
    @C17952c(mo34828a = "elastic_title")

    /* renamed from: a */
    public String f67557a;
    @C17952c(mo34828a = "title")

    /* renamed from: b */
    public String f67558b;
    @C17952c(mo34828a = "elastic_img")

    /* renamed from: c */
    public List<? extends UrlModel> f67559c;
    @C17952c(mo34828a = "image")

    /* renamed from: d */
    public UrlModel f67560d = null;
    @C17952c(mo34828a = "label")

    /* renamed from: e */
    public List<String> f67561e;
    @C17952c(mo34828a = "visitor")

    /* renamed from: f */
    public PromotionVisitor f67562f;

    /* JADX WARNING: Code restructure failed: missing block: B:14:0x0042, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f67562f, (java.lang.Object) r3.f67562f) != false) goto L_0x0047;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0047
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.commerce.service.models.C25558c
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.commerce.service.models.c r3 = (com.p683ss.android.ugc.aweme.commerce.service.models.C25558c) r3
            java.lang.String r0 = r2.f67557a
            java.lang.String r1 = r3.f67557a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.lang.String r0 = r2.f67558b
            java.lang.String r1 = r3.f67558b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> r0 = r2.f67559c
            java.util.List<? extends com.ss.android.ugc.aweme.base.model.UrlModel> r1 = r3.f67559c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.f67560d
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.f67560d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            java.util.List<java.lang.String> r0 = r2.f67561e
            java.util.List<java.lang.String> r1 = r3.f67561e
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0045
            com.ss.android.ugc.aweme.commerce.model.PromotionVisitor r0 = r2.f67562f
            com.ss.android.ugc.aweme.commerce.model.PromotionVisitor r3 = r3.f67562f
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commerce.service.models.C25558c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f67557a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f67558b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        List<? extends UrlModel> list = this.f67559c;
        int hashCode3 = (hashCode2 + (list != null ? list.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f67560d;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        List<String> list2 = this.f67561e;
        int hashCode5 = (hashCode4 + (list2 != null ? list2.hashCode() : 0)) * 31;
        PromotionVisitor promotionVisitor = this.f67562f;
        if (promotionVisitor != null) {
            i = promotionVisitor.hashCode();
        }
        return hashCode5 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CardPromotion(elasticTitle=");
        sb.append(this.f67557a);
        sb.append(", title=");
        sb.append(this.f67558b);
        sb.append(", elasticImages=");
        sb.append(this.f67559c);
        sb.append(", image=");
        sb.append(this.f67560d);
        sb.append(", labels=");
        sb.append(this.f67561e);
        sb.append(", visitor=");
        sb.append(this.f67562f);
        sb.append(")");
        return sb.toString();
    }

    public C25558c(String str, String str2, List<? extends UrlModel> list, UrlModel urlModel, List<String> list2, PromotionVisitor promotionVisitor) {
        C52711k.m112240b(list2, "labels");
        this.f67557a = str;
        this.f67558b = str2;
        this.f67559c = list;
        this.f67561e = list2;
        this.f67562f = promotionVisitor;
    }
}
