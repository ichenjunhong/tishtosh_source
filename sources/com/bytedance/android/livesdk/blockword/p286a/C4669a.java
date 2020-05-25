package com.bytedance.android.livesdk.blockword.p286a;

import com.google.gson.p1076a.C17952c;
import com.p683ss.android.ugc.aweme.sharer.p2172b.C42311c;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.android.livesdk.blockword.a.a */
public final class C4669a {
    @C17952c(mo34828a = "id")

    /* renamed from: a */
    public int f12736a = -1;
    @C17952c(mo34828a = "content")

    /* renamed from: b */
    public String f12737b;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C4669a) {
                C4669a aVar = (C4669a) obj;
                if (!(this.f12736a == aVar.f12736a) || !C52711k.m112239a((Object) this.f12737b, (Object) aVar.f12737b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f12736a) * 31;
        String str = this.f12737b;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BlockWord(id=");
        sb.append(this.f12736a);
        sb.append(", content=");
        sb.append(this.f12737b);
        sb.append(")");
        return sb.toString();
    }

    public C4669a(int i, String str) {
        C52711k.m112240b(str, C42311c.f106865i);
        this.f12737b = str;
    }
}
