package com.p683ss.android.ugc.aweme.commercialize.anchor;

import com.google.gson.p1076a.C17952c;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.anchor.c */
public final class C25618c {
    @C17952c(mo34828a = "status_code")

    /* renamed from: a */
    public final int f67813a;
    @C17952c(mo34828a = "status_msg")

    /* renamed from: b */
    public final String f67814b;
    @C17952c(mo34828a = "anchor_list")

    /* renamed from: c */
    public final List<C25626g> f67815c;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C25618c) {
                C25618c cVar = (C25618c) obj;
                if (!(this.f67813a == cVar.f67813a) || !C52711k.m112239a((Object) this.f67814b, (Object) cVar.f67814b) || !C52711k.m112239a((Object) this.f67815c, (Object) cVar.f67815c)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int hashCode = Integer.hashCode(this.f67813a) * 31;
        String str = this.f67814b;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        List<C25626g> list = this.f67815c;
        if (list != null) {
            i = list.hashCode();
        }
        return hashCode2 + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("AnchorListResp(statusCode=");
        sb.append(this.f67813a);
        sb.append(", statusMsg=");
        sb.append(this.f67814b);
        sb.append(", anchorList=");
        sb.append(this.f67815c);
        sb.append(")");
        return sb.toString();
    }
}
