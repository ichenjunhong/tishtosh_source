package com.p683ss.android.ugc.gamora.editor.sticker.donation;

import java.io.Serializable;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.b */
public final class C49479b implements Serializable {

    /* renamed from: a */
    private final String f124155a;

    /* renamed from: b */
    private final String f124156b;

    /* renamed from: c */
    private final String f124157c;

    /* renamed from: d */
    private final String f124158d;

    public static /* synthetic */ C49479b copy$default(C49479b bVar, String str, String str2, String str3, String str4, int i, Object obj) {
        if ((i & 1) != 0) {
            str = bVar.f124155a;
        }
        if ((i & 2) != 0) {
            str2 = bVar.f124156b;
        }
        if ((i & 4) != 0) {
            str3 = bVar.f124157c;
        }
        if ((i & 8) != 0) {
            str4 = bVar.f124158d;
        }
        return bVar.copy(str, str2, str3, str4);
    }

    public final String component1() {
        return this.f124155a;
    }

    public final String component2() {
        return this.f124156b;
    }

    public final String component3() {
        return this.f124157c;
    }

    public final String component4() {
        return this.f124158d;
    }

    public final C49479b copy(String str, String str2, String str3, String str4) {
        return new C49479b(str, str2, str3, str4);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:10:0x002e, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f124158d, (java.lang.Object) r3.f124158d) != false) goto L_0x0033;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0033
            boolean r0 = r3 instanceof com.p683ss.android.ugc.gamora.editor.sticker.donation.C49479b
            if (r0 == 0) goto L_0x0031
            com.ss.android.ugc.gamora.editor.sticker.donation.b r3 = (com.p683ss.android.ugc.gamora.editor.sticker.donation.C49479b) r3
            java.lang.String r0 = r2.f124155a
            java.lang.String r1 = r3.f124155a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f124156b
            java.lang.String r1 = r3.f124156b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f124157c
            java.lang.String r1 = r3.f124157c
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0031
            java.lang.String r0 = r2.f124158d
            java.lang.String r3 = r3.f124158d
            boolean r3 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r3)
            if (r3 == 0) goto L_0x0031
            goto L_0x0033
        L_0x0031:
            r3 = 0
            return r3
        L_0x0033:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.sticker.donation.C49479b.equals(java.lang.Object):boolean");
    }

    public final String getContentSource() {
        return this.f124157c;
    }

    public final String getContentType() {
        return this.f124158d;
    }

    public final String getCreationId() {
        return this.f124156b;
    }

    public final String getShootWay() {
        return this.f124155a;
    }

    public final int hashCode() {
        String str = this.f124155a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f124156b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f124157c;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.f124158d;
        if (str4 != null) {
            i = str4.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("DonationStickerMobParams(shootWay=");
        sb.append(this.f124155a);
        sb.append(", creationId=");
        sb.append(this.f124156b);
        sb.append(", contentSource=");
        sb.append(this.f124157c);
        sb.append(", contentType=");
        sb.append(this.f124158d);
        sb.append(")");
        return sb.toString();
    }

    public C49479b(String str, String str2, String str3, String str4) {
        this.f124155a = str;
        this.f124156b = str2;
        this.f124157c = str3;
        this.f124158d = str4;
    }
}
