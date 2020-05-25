package com.p683ss.android.ugc.aweme.commercialize.model;

import com.google.gson.p1076a.C17952c;
import java.util.List;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.commercialize.model.ac */
public final class C26108ac {
    @C17952c(mo34828a = "seconds")

    /* renamed from: a */
    public final int f68917a;
    @C17952c(mo34828a = "url_list")

    /* renamed from: b */
    public final List<String> f68918b;

    public C26108ac() {
        this(0, null, 3, null);
    }

    public final boolean equals(Object obj) {
        if (this != obj) {
            if (obj instanceof C26108ac) {
                C26108ac acVar = (C26108ac) obj;
                if (!(this.f68917a == acVar.f68917a) || !C52711k.m112239a((Object) this.f68918b, (Object) acVar.f68918b)) {
                    return false;
                }
            }
            return false;
        }
        return true;
    }

    public final int hashCode() {
        int i = this.f68917a * 31;
        List<String> list = this.f68918b;
        return i + (list != null ? list.hashCode() : 0);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("PlaybackSecondsTrack(seconds=");
        sb.append(this.f68917a);
        sb.append(", urlList=");
        sb.append(this.f68918b);
        sb.append(")");
        return sb.toString();
    }

    private C26108ac(int i, List<String> list) {
        this.f68917a = i;
        this.f68918b = list;
    }

    private /* synthetic */ C26108ac(int i, List list, int i2, C52707g gVar) {
        this(0, null);
    }
}
