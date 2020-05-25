package com.p683ss.android.ugc.aweme.notice.repo.list.bean;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.notice.repo.list.bean.Search */
public final class Search {
    @C17952c(mo34828a = "display_keyword")
    private String displayKeyword;
    @C17952c(mo34828a = "keyword")
    private String keyword;

    public Search() {
        this(null, null, 3, null);
    }

    public static /* synthetic */ Search copy$default(Search search, String str, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = search.keyword;
        }
        if ((i & 2) != 0) {
            str2 = search.displayKeyword;
        }
        return search.copy(str, str2);
    }

    public final String component1() {
        return this.keyword;
    }

    public final String component2() {
        return this.displayKeyword;
    }

    public final Search copy(String str, String str2) {
        C52711k.m112240b(str, "keyword");
        C52711k.m112240b(str2, "displayKeyword");
        return new Search(str, str2);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.displayKeyword, (java.lang.Object) r3.displayKeyword) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.notice.repo.list.bean.Search
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.notice.repo.list.bean.Search r3 = (com.p683ss.android.ugc.aweme.notice.repo.list.bean.Search) r3
            java.lang.String r0 = r2.keyword
            java.lang.String r1 = r3.keyword
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.displayKeyword
            java.lang.String r3 = r3.displayKeyword
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.notice.repo.list.bean.Search.equals(java.lang.Object):boolean");
    }

    public final String getDisplayKeyword() {
        return this.displayKeyword;
    }

    public final String getKeyword() {
        return this.keyword;
    }

    public final int hashCode() {
        String str = this.keyword;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.displayKeyword;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Search(keyword=");
        sb.append(this.keyword);
        sb.append(", displayKeyword=");
        sb.append(this.displayKeyword);
        sb.append(")");
        return sb.toString();
    }

    public final void setDisplayKeyword(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.displayKeyword = str;
    }

    public final void setKeyword(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.keyword = str;
    }

    public Search(String str, String str2) {
        C52711k.m112240b(str, "keyword");
        C52711k.m112240b(str2, "displayKeyword");
        this.keyword = str;
        this.displayKeyword = str2;
    }

    public /* synthetic */ Search(String str, String str2, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            str = "";
        }
        if ((i & 2) != 0) {
            str2 = "";
        }
        this(str, str2);
    }
}
