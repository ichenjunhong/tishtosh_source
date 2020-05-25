package com.p683ss.android.ugc.aweme.discover.jedi.viewmodel;

import com.p683ss.android.ugc.aweme.search.model.C41440e;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.discover.jedi.viewmodel.g */
public final class C28295g {

    /* renamed from: a */
    public final String f74205a;

    /* renamed from: b */
    public final int f74206b;

    /* renamed from: c */
    public final String f74207c;

    /* renamed from: d */
    public final int f74208d;

    /* renamed from: e */
    public final int f74209e;

    /* renamed from: f */
    public String f74210f;

    /* renamed from: g */
    public final C41440e f74211g;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C28295g) {
                C28295g gVar = (C28295g) obj;
                if (C52711k.m112239a((Object) this.f74205a, (Object) gVar.f74205a)) {
                    if ((this.f74206b == gVar.f74206b) && C52711k.m112239a((Object) this.f74207c, (Object) gVar.f74207c)) {
                        if (this.f74208d == gVar.f74208d) {
                            if (!(this.f74209e == gVar.f74209e) || !C52711k.m112239a((Object) this.f74210f, (Object) gVar.f74210f) || !C52711k.m112239a((Object) this.f74211g, (Object) gVar.f74211g)) {
                                return false;
                            }
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f74205a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Integer.hashCode(this.f74206b)) * 31;
        String str2 = this.f74207c;
        int hashCode2 = (((((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31) + Integer.hashCode(this.f74208d)) * 31) + Integer.hashCode(this.f74209e)) * 31;
        String str3 = this.f74210f;
        int hashCode3 = (hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31;
        C41440e eVar = this.f74211g;
        if (eVar != null) {
            i = eVar.hashCode();
        }
        return hashCode3 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchRequestParam(keyword=");
        sb.append(this.f74205a);
        sb.append(", refreshType=");
        sb.append(this.f74206b);
        sb.append(", searchSource=");
        sb.append(this.f74207c);
        sb.append(", hotSearch=");
        sb.append(this.f74208d);
        sb.append(", correctType=");
        sb.append(this.f74209e);
        sb.append(", searchId=");
        sb.append(this.f74210f);
        sb.append(", searchParam=");
        sb.append(this.f74211g);
        sb.append(")");
        return sb.toString();
    }

    private C28295g(String str, int i, String str2, int i2, int i3, String str3, C41440e eVar) {
        C52711k.m112240b(str, "keyword");
        this.f74205a = str;
        this.f74206b = i;
        this.f74207c = str2;
        this.f74208d = i2;
        this.f74209e = i3;
        this.f74210f = str3;
        this.f74211g = eVar;
    }

    public /* synthetic */ C28295g(String str, int i, String str2, int i2, int i3, String str3, C41440e eVar, int i4, C52707g gVar) {
        int i5;
        String str4;
        int i6;
        int i7 = 0;
        if ((i4 & 2) != 0) {
            i5 = 0;
        } else {
            i5 = i;
        }
        C41440e eVar2 = null;
        if ((i4 & 4) != 0) {
            str4 = null;
        } else {
            str4 = str2;
        }
        if ((i4 & 8) != 0) {
            i6 = 0;
        } else {
            i6 = i2;
        }
        if ((i4 & 16) == 0) {
            i7 = i3;
        }
        if ((i4 & 64) == 0) {
            eVar2 = eVar;
        }
        this(str, i5, str4, i6, i7, null, eVar2);
    }
}
