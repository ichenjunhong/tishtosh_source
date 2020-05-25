package com.p683ss.android.ugc.aweme.discover.model;

import android.text.TextUtils;
import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.HomeStay */
public final class HomeStay implements Serializable {
    @C17952c(mo34828a = "doc_id")
    private final String docId;
    @C17952c(mo34828a = "icon_url")
    private final UrlModel homeStayIcon;
    @C17952c(mo34828a = "roomtype_list")
    private final List<RoomType> roomType;
    @C17952c(mo34828a = "title")
    private final String title;
    @C17952c(mo34828a = "view_more_url")
    private final String viewMore;

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<com.ss.android.ugc.aweme.discover.model.RoomType>, for r8v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.discover.model.HomeStay copy$default(com.p683ss.android.ugc.aweme.discover.model.HomeStay r3, java.lang.String r4, java.lang.String r5, java.lang.String r6, com.p683ss.android.ugc.aweme.base.model.UrlModel r7, java.util.List<com.p683ss.android.ugc.aweme.discover.model.RoomType> r8, int r9, java.lang.Object r10) {
        /*
            r10 = r9 & 1
            if (r10 == 0) goto L_0x0006
            java.lang.String r4 = r3.viewMore
        L_0x0006:
            r10 = r9 & 2
            if (r10 == 0) goto L_0x000c
            java.lang.String r5 = r3.title
        L_0x000c:
            r10 = r5
            r5 = r9 & 4
            if (r5 == 0) goto L_0x0013
            java.lang.String r6 = r3.docId
        L_0x0013:
            r0 = r6
            r5 = r9 & 8
            if (r5 == 0) goto L_0x001a
            com.ss.android.ugc.aweme.base.model.UrlModel r7 = r3.homeStayIcon
        L_0x001a:
            r1 = r7
            r5 = r9 & 16
            if (r5 == 0) goto L_0x0021
            java.util.List<com.ss.android.ugc.aweme.discover.model.RoomType> r8 = r3.roomType
        L_0x0021:
            r2 = r8
            r5 = r3
            r6 = r4
            r7 = r10
            r8 = r0
            r9 = r1
            r10 = r2
            com.ss.android.ugc.aweme.discover.model.HomeStay r3 = r5.copy(r6, r7, r8, r9, r10)
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.HomeStay.copy$default(com.ss.android.ugc.aweme.discover.model.HomeStay, java.lang.String, java.lang.String, java.lang.String, com.ss.android.ugc.aweme.base.model.UrlModel, java.util.List, int, java.lang.Object):com.ss.android.ugc.aweme.discover.model.HomeStay");
    }

    public final String component1() {
        return this.viewMore;
    }

    public final String component2() {
        return this.title;
    }

    public final String component3() {
        return this.docId;
    }

    public final UrlModel component4() {
        return this.homeStayIcon;
    }

    public final List<RoomType> component5() {
        return this.roomType;
    }

    public final HomeStay copy(String str, String str2, String str3, UrlModel urlModel, List<RoomType> list) {
        C52711k.m112240b(str, "viewMore");
        C52711k.m112240b(str2, "title");
        C52711k.m112240b(str3, "docId");
        C52711k.m112240b(list, "roomType");
        HomeStay homeStay = new HomeStay(str, str2, str3, urlModel, list);
        return homeStay;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.roomType, (java.lang.Object) r3.roomType) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.HomeStay
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.discover.model.HomeStay r3 = (com.p683ss.android.ugc.aweme.discover.model.HomeStay) r3
            java.lang.String r0 = r2.viewMore
            java.lang.String r1 = r3.viewMore
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.docId
            java.lang.String r1 = r3.docId
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.homeStayIcon
            com.ss.android.ugc.aweme.base.model.UrlModel r1 = r3.homeStayIcon
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.util.List<com.ss.android.ugc.aweme.discover.model.RoomType> r0 = r2.roomType
            java.util.List<com.ss.android.ugc.aweme.discover.model.RoomType> r3 = r3.roomType
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.HomeStay.equals(java.lang.Object):boolean");
    }

    public final String getDocId() {
        return this.docId;
    }

    public final UrlModel getHomeStayIcon() {
        return this.homeStayIcon;
    }

    public final List<RoomType> getRoomType() {
        return this.roomType;
    }

    public final String getTitle() {
        return this.title;
    }

    public final String getViewMore() {
        return this.viewMore;
    }

    public final int hashCode() {
        String str = this.viewMore;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.title;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.docId;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        UrlModel urlModel = this.homeStayIcon;
        int hashCode4 = (hashCode3 + (urlModel != null ? urlModel.hashCode() : 0)) * 31;
        List<RoomType> list = this.roomType;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("HomeStay(viewMore=");
        sb.append(this.viewMore);
        sb.append(", title=");
        sb.append(this.title);
        sb.append(", docId=");
        sb.append(this.docId);
        sb.append(", homeStayIcon=");
        sb.append(this.homeStayIcon);
        sb.append(", roomType=");
        sb.append(this.roomType);
        sb.append(")");
        return sb.toString();
    }

    public final int getSize() {
        return this.roomType.size();
    }

    public final boolean isShowMore() {
        if (TextUtils.isEmpty(this.viewMore) || getSize() <= 2) {
            return false;
        }
        return true;
    }

    public HomeStay(String str, String str2, String str3, UrlModel urlModel, List<RoomType> list) {
        C52711k.m112240b(str, "viewMore");
        C52711k.m112240b(str2, "title");
        C52711k.m112240b(str3, "docId");
        C52711k.m112240b(list, "roomType");
        this.viewMore = str;
        this.title = str2;
        this.docId = str3;
        this.homeStayIcon = urlModel;
        this.roomType = list;
    }

    public /* synthetic */ HomeStay(String str, String str2, String str3, UrlModel urlModel, List list, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        String str4 = str;
        if ((i & 2) != 0) {
            str2 = "";
        }
        String str5 = str2;
        if ((i & 4) != 0) {
            str3 = "";
        }
        String str6 = str3;
        if ((i & 16) != 0) {
            list = new ArrayList();
        }
        this(str4, str5, str6, urlModel, list);
    }
}
