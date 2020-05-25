package com.p683ss.android.ugc.aweme.profile.unlogin;

import com.google.gson.p1076a.C17952c;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.profile.unlogin.n */
public final class C40514n {
    @C17952c(mo34828a = "aweme_id")

    /* renamed from: a */
    public final String f103394a;
    @C17952c(mo34828a = "digg_time")

    /* renamed from: b */
    public final String f103395b;
    @C17952c(mo34828a = "channel_id")

    /* renamed from: c */
    public final int f103396c;

    public C40514n() {
        this(null, null, 0, 7, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C40514n) {
                C40514n nVar = (C40514n) obj;
                if (C52711k.m112239a((Object) this.f103394a, (Object) nVar.f103394a) && C52711k.m112239a((Object) this.f103395b, (Object) nVar.f103395b)) {
                    if (this.f103396c == nVar.f103396c) {
                        return true;
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f103394a;
        int i = 0;
        int hashCode = (str != null ? str.hashCode() : 0) * 31;
        String str2 = this.f103395b;
        if (str2 != null) {
            i = str2.hashCode();
        }
        return ((hashCode + i) * 31) + this.f103396c;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("VideoDiggInfo(aweme_id=");
        sb.append(this.f103394a);
        sb.append(", digg_time=");
        sb.append(this.f103395b);
        sb.append(", channel_id=");
        sb.append(this.f103396c);
        sb.append(")");
        return sb.toString();
    }

    public C40514n(String str, String str2, int i) {
        C52711k.m112240b(str, "aweme_id");
        C52711k.m112240b(str2, "digg_time");
        this.f103394a = str;
        this.f103395b = str2;
        this.f103396c = i;
    }

    private /* synthetic */ C40514n(String str, String str2, int i, int i2, C52707g gVar) {
        this("", "", -1);
    }
}
