package com.p683ss.android.ugc.gamora.editor.sticker.donation.viewmodel;

import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49480a;
import com.p683ss.android.ugc.gamora.editor.sticker.donation.p2463b.C49481b;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.editor.sticker.donation.viewmodel.a */
public final class C49521a {

    /* renamed from: a */
    public final List<C49481b> f124244a;

    /* renamed from: b */
    public final String f124245b;

    /* renamed from: c */
    public final C49480a f124246c;

    /* renamed from: d */
    public final boolean f124247d;

    /* renamed from: e */
    public final boolean f124248e;

    /* renamed from: f */
    public final boolean f124249f;

    /* renamed from: g */
    public final boolean f124250g;

    public C49521a() {
        this(null, null, null, false, false, false, false, 127, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C49521a) {
                C49521a aVar = (C49521a) obj;
                if (C52711k.m112239a((Object) this.f124244a, (Object) aVar.f124244a) && C52711k.m112239a((Object) this.f124245b, (Object) aVar.f124245b) && C52711k.m112239a((Object) this.f124246c, (Object) aVar.f124246c)) {
                    if (this.f124247d == aVar.f124247d) {
                        if (this.f124248e == aVar.f124248e) {
                            if (this.f124249f == aVar.f124249f) {
                                if (this.f124250g == aVar.f124250g) {
                                    return true;
                                }
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
        List<C49481b> list = this.f124244a;
        int i = 0;
        int hashCode = (list != null ? list.hashCode() : 0) * 31;
        String str = this.f124245b;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        C49480a aVar = this.f124246c;
        if (aVar != null) {
            i = aVar.hashCode();
        }
        int i2 = (hashCode2 + i) * 31;
        boolean z = this.f124247d;
        if (z) {
            z = true;
        }
        int i3 = (i2 + (z ? 1 : 0)) * 31;
        boolean z2 = this.f124248e;
        if (z2) {
            z2 = true;
        }
        int i4 = (i3 + (z2 ? 1 : 0)) * 31;
        boolean z3 = this.f124249f;
        if (z3) {
            z3 = true;
        }
        int i5 = (i4 + (z3 ? 1 : 0)) * 31;
        boolean z4 = this.f124250g;
        if (z4) {
            z4 = true;
        }
        return i5 + (z4 ? 1 : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Result(data=");
        sb.append(this.f124244a);
        sb.append(", poweredByUrl=");
        sb.append(this.f124245b);
        sb.append(", matchDonationText=");
        sb.append(this.f124246c);
        sb.append(", isLoading=");
        sb.append(this.f124247d);
        sb.append(", loadSuccess=");
        sb.append(this.f124248e);
        sb.append(", isLoadMore=");
        sb.append(this.f124249f);
        sb.append(", hasMore=");
        sb.append(this.f124250g);
        sb.append(")");
        return sb.toString();
    }

    public C49521a(List<C49481b> list, String str, C49480a aVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.f124244a = list;
        this.f124245b = str;
        this.f124246c = aVar;
        this.f124247d = z;
        this.f124248e = z2;
        this.f124249f = z3;
        this.f124250g = z4;
    }

    public /* synthetic */ C49521a(List list, String str, C49480a aVar, boolean z, boolean z2, boolean z3, boolean z4, int i, C52707g gVar) {
        boolean z5;
        boolean z6;
        boolean z7;
        if ((i & 1) != 0) {
            list = null;
        }
        List list2 = list;
        if ((i & 8) != 0) {
            z5 = true;
        } else {
            z5 = z;
        }
        if ((i & 32) != 0) {
            z6 = false;
        } else {
            z6 = z3;
        }
        if ((i & 64) != 0) {
            z7 = false;
        } else {
            z7 = z4;
        }
        this(list2, null, null, z5, false, z6, z7);
    }
}
