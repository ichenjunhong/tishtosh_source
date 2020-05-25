package com.p683ss.android.ugc.aweme.poi.p2059b;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.poi.b.h */
public final class C39048h {

    /* renamed from: a */
    public final String f99543a;

    /* renamed from: b */
    public final String f99544b;

    /* renamed from: c */
    public final String f99545c;

    /* renamed from: d */
    public final int f99546d;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C39048h) {
                C39048h hVar = (C39048h) obj;
                if (C52711k.m112239a((Object) this.f99543a, (Object) hVar.f99543a) && C52711k.m112239a((Object) this.f99544b, (Object) hVar.f99544b) && C52711k.m112239a((Object) this.f99545c, (Object) hVar.f99545c)) {
                    if (this.f99546d == hVar.f99546d) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f99543a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f99544b;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f99545c;
        if (str3 != null) {
            i = str3.hashCode();
        }
        return ((hashCode2 + i) * 31) + this.f99546d;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("UpdateQA(poiId=");
        sb.append(this.f99543a);
        sb.append(", questionId=");
        sb.append(this.f99544b);
        sb.append(", answerId=");
        sb.append(this.f99545c);
        sb.append(", action=");
        sb.append(this.f99546d);
        sb.append(")");
        return sb.toString();
    }

    public C39048h(String str, String str2, String str3, int i) {
        C52711k.m112240b(str, "poiId");
        C52711k.m112240b(str2, "questionId");
        C52711k.m112240b(str3, "answerId");
        this.f99543a = str;
        this.f99544b = str2;
        this.f99545c = str3;
        this.f99546d = i;
    }
}
