package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.Tag */
public final class Tag {
    @C17952c(mo34828a = "schema")
    public String scheme;
    @C17952c(mo34828a = "text")
    public String text;
    @C17952c(mo34828a = "text_color")
    public String textColor;

    public static /* synthetic */ Tag copy$default(Tag tag, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = tag.textColor;
        }
        if ((i & 2) != 0) {
            str2 = tag.text;
        }
        if ((i & 4) != 0) {
            str3 = tag.scheme;
        }
        return tag.copy(str, str2, str3);
    }

    public final Tag copy(String str, String str2, String str3) {
        C52711k.m112240b(str, "textColor");
        C52711k.m112240b(str2, "text");
        C52711k.m112240b(str3, "scheme");
        return new Tag(str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.scheme, (java.lang.Object) r3.scheme) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.Tag
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.discover.model.Tag r3 = (com.p683ss.android.ugc.aweme.discover.model.Tag) r3
            java.lang.String r0 = r2.textColor
            java.lang.String r1 = r3.textColor
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.text
            java.lang.String r1 = r3.text
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.scheme
            java.lang.String r3 = r3.scheme
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.Tag.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.textColor;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.scheme;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Tag(textColor=");
        sb.append(this.textColor);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(", scheme=");
        sb.append(this.scheme);
        sb.append(")");
        return sb.toString();
    }

    public final void setScheme(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.scheme = str;
    }

    public final void setText(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.text = str;
    }

    public final void setTextColor(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.textColor = str;
    }

    public Tag(String str, String str2, String str3) {
        C52711k.m112240b(str, "textColor");
        C52711k.m112240b(str2, "text");
        C52711k.m112240b(str3, "scheme");
        this.textColor = str;
        this.text = str2;
        this.scheme = str3;
    }
}
