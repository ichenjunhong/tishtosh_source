package com.p683ss.android.ugc.aweme.sticker.p2285i.p2296e;

import java.util.Map;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.sticker.i.e.c */
public final class C46022c {

    /* renamed from: a */
    public final String f116149a;

    /* renamed from: b */
    public final int f116150b = 0;

    /* renamed from: c */
    public final int f116151c = 0;

    /* renamed from: d */
    public final Map<String, String> f116152d = null;

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C46022c) {
                C46022c cVar = (C46022c) obj;
                if (C52711k.m112239a((Object) this.f116149a, (Object) cVar.f116149a)) {
                    if (this.f116150b == cVar.f116150b) {
                        if (!(this.f116151c == cVar.f116151c) || !C52711k.m112239a((Object) this.f116152d, (Object) cVar.f116152d)) {
                            return false;
                        }
                    }
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        String str = this.f116149a;
        int i = 0;
        int hashCode = (((((str != null ? str.hashCode() : 0) * 31) + this.f116150b) * 31) + this.f116151c) * 31;
        Map<String, String> map = this.f116152d;
        if (map != null) {
            i = map.hashCode();
        }
        return hashCode + i;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("SearchStickerRequest(keyword=");
        sb.append(this.f116149a);
        sb.append(", count=");
        sb.append(this.f116150b);
        sb.append(", cursor=");
        sb.append(this.f116151c);
        sb.append(", extraParams=");
        sb.append(this.f116152d);
        sb.append(")");
        return sb.toString();
    }

    public C46022c(String str, int i, int i2, Map<String, String> map) {
        C52711k.m112240b(str, "keyword");
        this.f116149a = str;
    }
}
