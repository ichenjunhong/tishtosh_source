package com.p683ss.android.ugc.aweme.feed.model;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.model.AwemeUrl */
public final class AwemeUrl implements Serializable {
    @C17952c(mo34828a = "uri")
    private final String uri;
    @C17952c(mo34828a = "url_list")
    private final List<String> urlList;

    public AwemeUrl() {
        this(null, null, 3, null);
    }

    /* JADX WARNING: Incorrect type for immutable var: ssa=java.util.List, code=java.util.List<java.lang.String>, for r1v0, types: [java.util.List] */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public static /* synthetic */ com.p683ss.android.ugc.aweme.feed.model.AwemeUrl copy$default(com.p683ss.android.ugc.aweme.feed.model.AwemeUrl r0, java.util.List<java.lang.String> r1, java.lang.String r2, int r3, java.lang.Object r4) {
        /*
            r4 = r3 & 1
            if (r4 == 0) goto L_0x0006
            java.util.List<java.lang.String> r1 = r0.urlList
        L_0x0006:
            r3 = r3 & 2
            if (r3 == 0) goto L_0x000c
            java.lang.String r2 = r0.uri
        L_0x000c:
            com.ss.android.ugc.aweme.feed.model.AwemeUrl r0 = r0.copy(r1, r2)
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.model.AwemeUrl.copy$default(com.ss.android.ugc.aweme.feed.model.AwemeUrl, java.util.List, java.lang.String, int, java.lang.Object):com.ss.android.ugc.aweme.feed.model.AwemeUrl");
    }

    public final List<String> component1() {
        return this.urlList;
    }

    public final String component2() {
        return this.uri;
    }

    public final AwemeUrl copy(List<String> list, String str) {
        C52711k.m112240b(list, "urlList");
        return new AwemeUrl(list, str);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.uri, (java.lang.Object) r3.uri) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.feed.model.AwemeUrl
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.feed.model.AwemeUrl r3 = (com.p683ss.android.ugc.aweme.feed.model.AwemeUrl) r3
            java.util.List<java.lang.String> r0 = r2.urlList
            java.util.List<java.lang.String> r1 = r3.urlList
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            java.lang.String r0 = r2.uri
            java.lang.String r3 = r3.uri
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.feed.model.AwemeUrl.equals(java.lang.Object):boolean");
    }

    public final String getUri() {
        return this.uri;
    }

    public final List<String> getUrlList() {
        return this.urlList;
    }

    public final int hashCode() {
        List<String> list = this.urlList;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.uri;
        if (str != null) {
            i = str.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AwemeUrl(urlList=");
        sb.append(this.urlList);
        sb.append(", uri=");
        sb.append(this.uri);
        sb.append(")");
        return sb.toString();
    }

    public AwemeUrl(List<String> list, String str) {
        C52711k.m112240b(list, "urlList");
        this.urlList = list;
        this.uri = str;
    }

    public /* synthetic */ AwemeUrl(List list, String str, int i, C52707g gVar) {
        if ((i & 1) != 0) {
            list = new ArrayList();
        }
        if ((i & 2) != 0) {
            str = null;
        }
        this(list, str);
    }
}
