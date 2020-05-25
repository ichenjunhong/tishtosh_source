package com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b;

import com.google.gson.p1076a.C17952c;
import java.io.Serializable;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.b.a */
public final class C49480a implements Serializable {
    @C17952c(mo34828a = "double_donation_sticker")

    /* renamed from: a */
    private final String f124159a;
    @C17952c(mo34828a = "double_donation_text")

    /* renamed from: b */
    private final String f124160b;
    @C17952c(mo34828a = "double_donation_highlight")

    /* renamed from: c */
    private final String f124161c;

    public static /* synthetic */ C49480a copy$default(C49480a aVar, String str, String str2, String str3, int i, Object obj) {
        if ((i & 1) != 0) {
            str = aVar.f124159a;
        }
        if ((i & 2) != 0) {
            str2 = aVar.f124160b;
        }
        if ((i & 4) != 0) {
            str3 = aVar.f124161c;
        }
        return aVar.copy(str, str2, str3);
    }

    public final String component1() {
        return this.f124159a;
    }

    public final String component2() {
        return this.f124160b;
    }

    public final String component3() {
        return this.f124161c;
    }

    public final C49480a copy(String str, String str2, String str3) {
        return new C49480a(str, str2, str3);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (p2628d.p2639f.p2641b.C52711k.m112239a((java.lang.Object) r2.f124161c, (java.lang.Object) r3.f124161c) != false) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49480a
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.gamora.editor.sticker.donation.b.a r3 = (com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49480a) r3
            java.lang.String r0 = r2.f124159a
            java.lang.String r1 = r3.f124159a
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f124160b
            java.lang.String r1 = r3.f124160b
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.f124161c
            java.lang.String r3 = r3.f124161c
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
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49480a.equals(java.lang.Object):boolean");
    }

    public final String getMatchDonateText() {
        return this.f124160b;
    }

    public final String getMatchDonationHighlightText() {
        return this.f124161c;
    }

    public final String getMatchDonationTextForSticker() {
        return this.f124159a;
    }

    public final int hashCode() {
        String str = this.f124159a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f124160b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f124161c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("MatchDonationText(matchDonationTextForSticker=");
        sb.append(this.f124159a);
        sb.append(", matchDonateText=");
        sb.append(this.f124160b);
        sb.append(", matchDonationHighlightText=");
        sb.append(this.f124161c);
        sb.append(")");
        return sb.toString();
    }

    public C49480a(String str, String str2, String str3) {
        this.f124159a = str;
        this.f124160b = str2;
        this.f124161c = str3;
    }
}
