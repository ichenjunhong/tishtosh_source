package com.bytedance.ies.p675g.p678c;

import java.util.List;
import java.util.SortedMap;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.ies.g.c.n */
public final class C10858n {

    /* renamed from: a */
    public String f29146a;

    /* renamed from: b */
    public String f29147b;

    /* renamed from: c */
    public long f29148c = 20000;

    /* renamed from: d */
    public List<String> f29149d;

    /* renamed from: e */
    public SortedMap<String, String> f29150e;

    /* renamed from: f */
    public SortedMap<String, C10861q> f29151f;

    /* renamed from: g */
    public SortedMap<String, C10861q> f29152g;

    public final String toString() {
        StringBuilder sb = new StringBuilder("hashCode: ");
        sb.append(hashCode());
        sb.append(", url: ");
        String str = this.f29146a;
        if (str == null) {
            C52711k.m112237a("apiUrl");
        }
        sb.append(str);
        sb.append(", method: ");
        String str2 = this.f29147b;
        if (str2 == null) {
            C52711k.m112237a("method");
        }
        sb.append(str2);
        sb.append(", expireTimeout: ");
        sb.append(this.f29148c);
        return sb.toString();
    }
}
