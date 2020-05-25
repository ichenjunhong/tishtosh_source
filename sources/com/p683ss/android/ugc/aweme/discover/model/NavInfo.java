package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.NavInfo */
public final class NavInfo {
    @C17952c(mo34828a = "live_icon_end_color")
    public String liveIconEndColor;
    @C17952c(mo34828a = "live_icon_start_color")
    public String liveIconStartColor;
    @C17952c(mo34828a = "live_text")
    public String liveText;
    @C17952c(mo34828a = "schema")
    public String schema;
    @C17952c(mo34828a = "text")
    public String text;

    public static /* synthetic */ NavInfo copy$default(NavInfo navInfo, String str, String str2, String str3, String str4, String str5, int i, Object obj) {
        if ((i & 1) != 0) {
            str = navInfo.text;
        }
        if ((i & 2) != 0) {
            str2 = navInfo.liveText;
        }
        String str6 = str2;
        if ((i & 4) != 0) {
            str3 = navInfo.liveIconStartColor;
        }
        String str7 = str3;
        if ((i & 8) != 0) {
            str4 = navInfo.liveIconEndColor;
        }
        String str8 = str4;
        if ((i & 16) != 0) {
            str5 = navInfo.schema;
        }
        return navInfo.copy(str, str6, str7, str8, str5);
    }

    public final NavInfo copy(String str, String str2, String str3, String str4, String str5) {
        C52711k.m112240b(str, "text");
        C52711k.m112240b(str2, "liveText");
        C52711k.m112240b(str3, "liveIconStartColor");
        C52711k.m112240b(str4, "liveIconEndColor");
        C52711k.m112240b(str5, "schema");
        NavInfo navInfo = new NavInfo(str, str2, str3, str4, str5);
        return navInfo;
    }

    /* JADX WARNING: Code restructure failed: missing block: B:12:0x0038, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.schema, (java.lang.Object) r3.schema) != false) goto L_0x003d;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x003d
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.NavInfo
            if (r0 == 0) goto L_0x003b
            com.ss.android.ugc.aweme.discover.model.NavInfo r3 = (com.p683ss.android.ugc.aweme.discover.model.NavInfo) r3
            java.lang.String r0 = r2.text
            java.lang.String r1 = r3.text
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.liveText
            java.lang.String r1 = r3.liveText
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.liveIconStartColor
            java.lang.String r1 = r3.liveIconStartColor
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.liveIconEndColor
            java.lang.String r1 = r3.liveIconEndColor
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x003b
            java.lang.String r0 = r2.schema
            java.lang.String r3 = r3.schema
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.NavInfo.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.text;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.liveText;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.liveIconStartColor;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.liveIconEndColor;
        int hashCode4 = (hashCode3 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.schema;
        if (str5 != null) {
            i = str5.hashCode();
        }
        return hashCode4 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("NavInfo(text=");
        sb.append(this.text);
        sb.append(", liveText=");
        sb.append(this.liveText);
        sb.append(", liveIconStartColor=");
        sb.append(this.liveIconStartColor);
        sb.append(", liveIconEndColor=");
        sb.append(this.liveIconEndColor);
        sb.append(", schema=");
        sb.append(this.schema);
        sb.append(")");
        return sb.toString();
    }

    public final void setLiveIconEndColor(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.liveIconEndColor = str;
    }

    public final void setLiveIconStartColor(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.liveIconStartColor = str;
    }

    public final void setLiveText(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.liveText = str;
    }

    public final void setSchema(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.schema = str;
    }

    public final void setText(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.text = str;
    }

    public NavInfo(String str, String str2, String str3, String str4, String str5) {
        C52711k.m112240b(str, "text");
        C52711k.m112240b(str2, "liveText");
        C52711k.m112240b(str3, "liveIconStartColor");
        C52711k.m112240b(str4, "liveIconEndColor");
        C52711k.m112240b(str5, "schema");
        this.text = str;
        this.liveText = str2;
        this.liveIconStartColor = str3;
        this.liveIconEndColor = str4;
        this.schema = str5;
    }
}
