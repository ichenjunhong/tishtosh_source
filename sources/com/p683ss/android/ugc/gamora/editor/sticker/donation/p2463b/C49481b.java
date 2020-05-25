package com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.b.b */
public final class C49481b implements Serializable {
    @C17952c(mo34828a = "name")

    /* renamed from: a */
    private final String f124162a;
    @C17952c(mo34828a = "desc")

    /* renamed from: b */
    private final String f124163b;
    @C17952c(mo34828a = "icon")

    /* renamed from: c */
    private final UrlModel f124164c;
    @C17952c(mo34828a = "web_url")

    /* renamed from: d */
    private final String f124165d;
    @C17952c(mo34828a = "donation_link")

    /* renamed from: e */
    private final String f124166e;

    public static /* synthetic */ C49481b copy$default(C49481b bVar, String str, String str2, UrlModel urlModel, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f124162a;
        }
        if ((i & 2) != 0) {
            str2 = bVar.f124163b;
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            urlModel = bVar.f124164c;
        }
        UrlModel urlModel2 = urlModel;
        if ((i & 8) != 0) {
            str3 = bVar.f124165d;
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            str4 = bVar.f124166e;
        }
        return bVar.copy(str, str5, urlModel2, str6, str4);
    }

    public final String component1() {
        return this.f124162a;
    }

    public final String component2() {
        return this.f124163b;
    }

    public final UrlModel component3() {
        return this.f124164c;
    }

    public final String component4() {
        return this.f124165d;
    }

    public final String component5() {
        return this.f124166e;
    }

    public final C49481b copy(String str, String str2, UrlModel urlModel, String str3, String str4) {
        C49481b bVar = new C49481b(str, str2, urlModel, str3, str4);
        return bVar;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f124166e, (java.lang.Object) r3.f124166e) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49481b
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.gamora.editor.sticker.donation.b.b r3 = (com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49481b) r3
            java.lang.String r0 = r2.f124162a
            java.lang.String r1 = r3.f124162a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f124163b
            java.lang.String r1 = r3.f124163b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.f124164c
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.f124164c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f124165d
            java.lang.String r1 = r3.f124165d
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.f124166e
            java.lang.String r3 = r3.f124166e
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49481b.equals(java.lang.Object):boolean");
    }

    public final String getDesc() {
        return this.f124163b;
    }

    public final String getDetailUrl() {
        return this.f124165d;
    }

    public final String getDonateLink() {
        return this.f124166e;
    }

    public final UrlModel getIcon() {
        return this.f124164c;
    }

    public final String getName() {
        return this.f124162a;
    }

    public final int hashCode() {
        String str = this.f124162a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f124163b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        UrlModel urlModel = this.f124164c;
        int hashCode3 = (hashCode2 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        String str3 = this.f124165d;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f124166e;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("OrganizationModel(name=");
        sb.append(this.f124162a);
        sb.append(", desc=");
        sb.append(this.f124163b);
        sb.append(", icon=");
        sb.append(this.f124164c);
        sb.append(", detailUrl=");
        sb.append(this.f124165d);
        sb.append(", donateLink=");
        sb.append(this.f124166e);
        sb.append(")");
        return sb.toString();
    }

    public C49481b(String str, String str2, UrlModel urlModel, String str3, String str4) {
        this.f124162a = str;
        this.f124163b = str2;
        this.f124164c = urlModel;
        this.f124165d = str3;
        this.f124166e = str4;
    }
}
