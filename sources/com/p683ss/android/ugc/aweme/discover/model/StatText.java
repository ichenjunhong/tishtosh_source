package com.p683ss.android.ugc.aweme.discover.model;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.model.StatText */
public final class StatText {
    @C17952c(mo34828a = "text")
    public String numberText;
    @C17952c(mo34828a = "color")
    public String textColor;
    @C17952c(mo34828a = "font")
    public float textFont;

    public static /* synthetic */ StatText copy$default(StatText statText, String str, String str2, float f, int i, Object obj) {
        if ((i & 1) != 0) {
            str = statText.textColor;
        }
        if ((i & 2) != 0) {
            str2 = statText.numberText;
        }
        if ((i & 4) != 0) {
            f = statText.textFont;
        }
        return statText.copy(str, str2, f);
    }

    public final StatText copy(String str, String str2, float f) {
        C52711k.m112240b(str, "textColor");
        C52711k.m112240b(str2, "numberText");
        return new StatText(str, str2, f);
    }

    /* JADX WARNING: Code restructure failed: missing block: B:8:0x0024, code lost:
        if (java.lang.Float.compare(r2.textFont, r3.textFont) == 0) goto L_0x0029;
     */
    /* Code decompiled incorrectly, please refer to instructions dump. */
    public final boolean equals(java.lang.Object r3) {
        /*
            r2 = this;
            if (r2 == r3) goto L_0x0029
            boolean r0 = r3 instanceof com.p683ss.android.ugc.aweme.discover.model.StatText
            if (r0 == 0) goto L_0x0027
            com.ss.android.ugc.aweme.discover.model.StatText r3 = (com.p683ss.android.ugc.aweme.discover.model.StatText) r3
            java.lang.String r0 = r2.textColor
            java.lang.String r1 = r3.textColor
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            java.lang.String r0 = r2.numberText
            java.lang.String r1 = r3.numberText
            boolean r0 = p2628d.p2639f.p2641b.C52711k.m112239a(r0, r1)
            if (r0 == 0) goto L_0x0027
            float r0 = r2.textFont
            float r3 = r3.textFont
            int r3 = java.lang.Float.compare(r0, r3)
            if (r3 != 0) goto L_0x0027
            goto L_0x0029
        L_0x0027:
            r3 = 0
            return r3
        L_0x0029:
            r3 = 1
            return r3
        */
        throw new UnsupportedOperationException("Method not decompiled: com.p683ss.android.ugc.aweme.discover.model.StatText.equals(java.lang.Object):boolean");
    }

    public final int hashCode() {
        String str = this.textColor;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.numberText;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + Float.hashCode(this.textFont);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("StatText(textColor=");
        sb.append(this.textColor);
        sb.append(", numberText=");
        sb.append(this.numberText);
        sb.append(", textFont=");
        sb.append(this.textFont);
        sb.append(")");
        return sb.toString();
    }

    public final void setNumberText(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.numberText = str;
    }

    public final void setTextColor(String str) {
        C52711k.m112240b(str, "<set-?>");
        this.textColor = str;
    }

    public StatText(String str, String str2, float f) {
        C52711k.m112240b(str, "textColor");
        C52711k.m112240b(str2, "numberText");
        this.textColor = str;
        this.numberText = str2;
        this.textFont = f;
    }
}
