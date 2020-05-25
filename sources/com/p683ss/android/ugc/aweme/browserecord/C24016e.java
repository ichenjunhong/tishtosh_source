package com.p683ss.android.ugc.aweme.browserecord;

import java.io.Serializable;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.browserecord.e */
public final class C24016e implements Serializable {

    /* renamed from: a */
    private final String f63739a;

    /* renamed from: b */
    private final long f63740b;

    /* renamed from: c */
    private final String f63741c;

    public static /* synthetic */ C24016e copy$default(C24016e eVar, String str, long j, String str2, int i, Object obj) {
        if ((i & 1) != 0) {
            str = eVar.f63739a;
        }
        if ((i & 2) != 0) {
            j = eVar.f63740b;
        }
        if ((i & 4) != 0) {
            str2 = eVar.f63741c;
        }
        return eVar.copy(str, j, str2);
    }

    public final String component1() {
        return this.f63739a;
    }

    public final long component2() {
        return this.f63740b;
    }

    public final String component3() {
        return this.f63741c;
    }

    public final C24016e copy(String str, long j, String str2) {
        C52711k.m112240b(str, "aid");
        return new C24016e(str, j, str2);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C24016e) {
                C24016e eVar = (C24016e) obj;
                if (C52711k.m112239a((Object) this.f63739a, (Object) eVar.f63739a)) {
                    if (!(this.f63740b == eVar.f63740b) || !C52711k.m112239a((Object) this.f63741c, (Object) eVar.f63741c)) {
                        return false;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final String getAid() {
        return this.f63739a;
    }

    public final long getBrowseCount() {
        return this.f63740b;
    }

    public final String getPreviousPage() {
        return this.f63741c;
    }

    public final int hashCode() {
        String str = this.f63739a;
        int i = 0;
        int hashCode = (((str != null ? str.hashCode() : 0) * 31) + Long.hashCode(this.f63740b)) * 31;
        String str2 = this.f63741c;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BrowseRecordListDialogParams(aid=");
        sb.append(this.f63739a);
        sb.append(", browseCount=");
        sb.append(this.f63740b);
        sb.append(", previousPage=");
        sb.append(this.f63741c);
        sb.append(")");
        return sb.toString();
    }

    public C24016e(String str, long j, String str2) {
        C52711k.m112240b(str, "aid");
        this.f63739a = str;
        this.f63740b = j;
        this.f63741c = str2;
    }
}
