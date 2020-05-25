package com.p683ss.android.ugc.aweme.comment.p1523h;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.comment.h.d */
public final class C25205d {

    /* renamed from: a */
    public final String f66781a;

    /* renamed from: b */
    public final int f66782b;

    /* renamed from: c */
    public final String f66783c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25205d) {
                C25205d dVar = (C25205d) obj;
                if (C52711k.m112239a((Object) this.f66781a, (Object) dVar.f66781a)) {
                    if (!(this.f66782b == dVar.f66782b) || !C52711k.m112239a((Object) this.f66783c, (Object) dVar.f66783c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f66781a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.f66782b)) * 31;
        String str2 = this.f66783c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("GifEmojiListRequestParam(keyword=");
        sb.append(this.f66781a);
        sb.append(", cursor=");
        sb.append(this.f66782b);
        sb.append(", awemeId=");
        sb.append(this.f66783c);
        sb.append(")");
        return sb.toString();
    }

    public C25205d(String str, int i, String str2) {
        C52711k.m112240b(str, "keyword");
        C52711k.m112240b(str2, "awemeId");
        this.f66781a = str;
        this.f66782b = i;
        this.f66783c = str2;
    }
}
