package com.p683ss.android.ugc.aweme.commercialize.loft.p1575b;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.base.model.UrlModel;
import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.loft.b.c */
public final class C26008c implements Serializable {
    @C17952c(mo34828a = "desc")

    /* renamed from: a */
    private String f68662a;
    @C17952c(mo34828a = "icon")

    /* renamed from: b */
    private UrlModel f68663b;

    public static /* synthetic */ C26008c copy$default(C26008c cVar, String str, UrlModel urlModel, int i, Object obj) {
        if ((i & 1) != 0) {
            str = cVar.f68662a;
        }
        if ((i & 2) != 0) {
            urlModel = cVar.f68663b;
        }
        return cVar.copy(str, urlModel);
    }

    public final String component1() {
        return this.f68662a;
    }

    public final UrlModel component2() {
        return this.f68663b;
    }

    public final C26008c copy(String str, UrlModel urlModel) {
        C52711k.m112240b(str, "desc");
        C52711k.m112240b(urlModel, "imageUrl");
        return new C26008c(str, urlModel);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:6:0x001a, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f68663b, (java.lang.Object) r3.f68663b) != false) goto L_0x001f;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x001f
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26008c
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.commercialize.loft.b.c r3 = (com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26008c) r3
            java.lang.String r0 = r2.f68662a
            java.lang.String r1 = r3.f68662a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x001d
            com.ss.android.ugc.aweme.base.model.UrlModel r0 = r2.f68663b
            com.ss.android.ugc.aweme.base.model.UrlModel r3 = r3.f68663b
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.commercialize.loft.p1575b.C26008c.equals(java.lang.Object):boolean");
    }

    public final String getDesc() {
        return this.f68662a;
    }

    public final UrlModel getImageUrl() {
        return this.f68663b;
    }

    public final int hashCode() {
        String str = this.f68662a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        UrlModel urlModel = this.f68663b;
        if (urlModel != null) {
            i = urlModel.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("LoftGuide(desc=");
        sb.append(this.f68662a);
        sb.append(", imageUrl=");
        sb.append(this.f68663b);
        sb.append(")");
        return sb.toString();
    }

    public final void setDesc(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.f68662a = str;
    }

    public final void setImageUrl(UrlModel urlModel) {
        C52711k.m112240b(urlModel, "<set-?>");
        this.f68663b = urlModel;
    }

    public C26008c(String str, UrlModel urlModel) {
        C52711k.m112240b(str, "desc");
        C52711k.m112240b(urlModel, "imageUrl");
        this.f68662a = str;
        this.f68663b = urlModel;
    }
}
