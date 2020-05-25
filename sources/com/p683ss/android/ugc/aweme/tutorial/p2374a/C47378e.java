package com.p683ss.android.ugc.aweme.tutorial.p2374a;

import com.google.gson.p1076a.C17952c;
import java.util.ArrayList;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.tutorial.a.e */
public final class C47378e {
    @C17952c(mo34828a = "cursor")

    /* renamed from: a */
    public final long f119562a;
    @C17952c(mo34828a = "has_more")

    /* renamed from: b */
    public final boolean f119563b;
    @C17952c(mo34828a = "status_code")

    /* renamed from: c */
    public final int f119564c;
    @C17952c(mo34828a = "tutorial_list")

    /* renamed from: d */
    public final ArrayList<C47373a> f119565d;

    /* renamed from: e */
    public int f119566e;

    public C47378e() {
        this(0, false, 0, null, 0, 31, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C47378e) {
                C47378e eVar = (C47378e) obj;
                if (this.f119562a == eVar.f119562a) {
                    if (this.f119563b == eVar.f119563b) {
                        if ((this.f119564c == eVar.f119564c) && C52711k.m112239a((Object) this.f119565d, (Object) eVar.f119565d)) {
                            if (this.f119566e == eVar.f119566e) {
                                return true;
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
        long j = this.f119562a;
        int i = ((int) (j ^ (j >>> 32))) * 31;
        boolean z = this.f119563b;
        if (z) {
            z = true;
        }
        int i2 = (((i + (z ? 1 : 0)) * 31) + this.f119564c) * 31;
        ArrayList<C47373a> arrayList = this.f119565d;
        return ((i2 + (arrayList != null ? arrayList.hashCode() : 0)) * 31) + this.f119566e;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TutorialListResponse(cursor=");
        sb.append(this.f119562a);
        sb.append(", hasMore=");
        sb.append(this.f119563b);
        sb.append(", statusCode=");
        sb.append(this.f119564c);
        sb.append(", tutorialList=");
        sb.append(this.f119565d);
        sb.append(", pageIndex=");
        sb.append(this.f119566e);
        sb.append(")");
        return sb.toString();
    }

    private C47378e(long j, boolean z, int i, ArrayList<C47373a> arrayList, int i2) {
        C52711k.m112240b(arrayList, "tutorialList");
        this.f119562a = j;
        this.f119563b = z;
        this.f119564c = i;
        this.f119565d = arrayList;
        this.f119566e = i2;
    }

    private /* synthetic */ C47378e(long j, boolean z, int i, ArrayList arrayList, int i2, int i3, C52707g gVar) {
        this(0, false, 0, new ArrayList(), 0);
    }
}
