package com.p683ss.android.ugc.aweme.filter.repository.p1746a;

import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.d */
public final class C31491d {

    /* renamed from: a */
    public final int f82397a;

    /* renamed from: b */
    public final C31494g f82398b;

    /* renamed from: c */
    public final String f82399c;

    /* renamed from: d */
    public final String f82400d;

    /* renamed from: e */
    public final String f82401e;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C31491d) {
                C31491d dVar = (C31491d) obj;
                if (!(this.f82397a == dVar.f82397a) || !C52711k.m112239a((Object) this.f82398b, (Object) dVar.f82398b) || !C52711k.m112239a((Object) this.f82399c, (Object) dVar.f82399c) || !C52711k.m112239a((Object) this.f82400d, (Object) dVar.f82400d) || !C52711k.m112239a((Object) this.f82401e, (Object) dVar.f82401e)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f82397a * 31;
        C31494g gVar = this.f82398b;
        int i2 = 0;
        int hashCode = (i + (gVar != null ? gVar.hashCode() : 0)) * 31;
        String str = this.f82399c;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.f82400d;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.f82401e;
        if (str3 != null) {
            i2 = str3.hashCode();
        }
        return hashCode3 + i2;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("FilterInfo(id=");
        sb.append(this.f82397a);
        sb.append(", state=");
        sb.append(this.f82398b);
        sb.append(", filterFilePath=");
        sb.append(this.f82399c);
        sb.append(", filterFolder=");
        sb.append(this.f82400d);
        sb.append(", thumbnailFilePath=");
        sb.append(this.f82401e);
        sb.append(")");
        return sb.toString();
    }

    public C31491d(int i, C31494g gVar, String str, String str2, String str3) {
        C52711k.m112240b(gVar, "state");
        C52711k.m112240b(str, "filterFilePath");
        C52711k.m112240b(str2, "filterFolder");
        C52711k.m112240b(str3, "thumbnailFilePath");
        this.f82397a = i;
        this.f82398b = gVar;
        this.f82399c = str;
        this.f82400d = str2;
        this.f82401e = str3;
    }
}
