package com.p683ss.android.ugc.trill.settings;

import android.support.annotation.Keep;
import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

@Keep
/* renamed from: com.ss.android.ugc.trill.settings.ContentLangDialogContent */
public final class ContentLangDialogContent {
    @C17952c(mo34828a = "text")
    public final String text;
    @C17952c(mo34828a = "title")
    public final String title;

    public ContentLangDialogContent() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ ContentLangDialogContent copy$default(ContentLangDialogContent contentLangDialogContent, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = contentLangDialogContent.title;
        }
        if ((i & 2) != 0) {
            str2 = contentLangDialogContent.text;
        }
        return contentLangDialogContent.copy(str, str2);
    }

    public final String component1() {
        return this.title;
    }

    public final String component2() {
        return this.text;
    }

    public final ContentLangDialogContent copy(String str, String str2) {
        C52711k.m112240b(str, "title");
        C52711k.m112240b(str2, "text");
        return new ContentLangDialogContent(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.text, (java.lang.Object) r3.text) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.trill.settings.ContentLangDialogContent
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.trill.settings.ContentLangDialogContent r3 = (com.p683ss.android.ugc.trill.settings.ContentLangDialogContent) r3
            java.lang.String r0 = r2.title
            java.lang.String r1 = r3.title
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.text
            java.lang.String r3 = r3.text
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x001d
            goto L_0x001f
        L_0x001d:
            r3 = 0
            return r3
        L_0x001f:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.trill.settings.ContentLangDialogContent.equals(java.lang.Object):boolean");
    }

    public final String getText() {
        return this.text;
    }

    public final String getTitle() {
        return this.title;
    }

    public final int hashCode() {
        String str = this.title;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.text;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ContentLangDialogContent(title=");
        sb.append(this.title);
        sb.append(", text=");
        sb.append(this.text);
        sb.append(")");
        return sb.toString();
    }

    public ContentLangDialogContent(String str, String str2) {
        C52711k.m112240b(str, "title");
        C52711k.m112240b(str2, "text");
        this.title = str;
        this.text = str2;
    }

    public /* synthetic */ ContentLangDialogContent(String str, String str2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        this(str, str2);
    }
}
