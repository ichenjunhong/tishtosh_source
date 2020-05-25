package com.p683ss.android.sdk.webview;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.sdk.webview.c */
public final class C19748c {

    /* renamed from: a */
    public final String f54412a;

    /* JADX WARNING: Code restructure failed: missing block: B:4:0x0010, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r1.f54412a, (java.lang.Object) ((com.p683ss.android.sdk.webview.C19748c) r2).f54412a) != false) goto L_0x0015;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r2) {
        /*
            r1 = this;
            if (r1 == r2) goto L_0x0015
            boolean r0 = r2 instanceof com.p683ss.android.sdk.webview.C19748c
            if (r0 == 0) goto L_0x0013
            com.ss.android.sdk.webview.c r2 = (com.p683ss.android.sdk.webview.C19748c) r2
            java.lang.String r0 = r1.f54412a
            java.lang.String r2 = r2.f54412a
            boolean r2 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r2)
            if (r2 == 0) goto L_0x0013
            goto L_0x0015
        L_0x0013:
            r2 = 0
            return r2
        L_0x0015:
            r2 = 1
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.sdk.webview.C19748c.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.f54412a;
        if (str != null) {
            return str.hashCode();
        }
        return 0;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CloseWebActivityEvent(id=");
        sb.append(this.f54412a);
        sb.append(")");
        return sb.toString();
    }

    public C19748c(String str) {
        C52711k.m112240b(str, "id");
        this.f54412a = str;
    }
}
