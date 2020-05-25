package com.p683ss.p2549c.p2550a.p2551a.p2554b;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.c.a.a.b.k */
public final class C51208k {

    /* renamed from: a */
    public final String f127894a;

    /* renamed from: b */
    public final List<String> f127895b = new ArrayList();

    /* renamed from: c */
    public final long f127896c;

    public final String toString() {
        StringBuilder sb = new StringBuilder("\"");
        sb.append(this.f127894a);
        sb.append("\":[");
        String sb2 = sb.toString();
        if (this.f127895b != null) {
            for (int i = 0; i < this.f127895b.size(); i++) {
                StringBuilder sb3 = new StringBuilder();
                sb3.append(sb2);
                sb3.append("\"");
                sb3.append((String) this.f127895b.get(i));
                sb3.append("\"");
                sb2 = sb3.toString();
                if (i != this.f127895b.size() - 1) {
                    StringBuilder sb4 = new StringBuilder();
                    sb4.append(sb2);
                    sb4.append(",");
                    sb2 = sb4.toString();
                }
            }
        }
        StringBuilder sb5 = new StringBuilder();
        sb5.append(sb2);
        sb5.append("]");
        return sb5.toString();
    }

    public C51208k(String str, List<String> list, long j) {
        this.f127894a = str;
        this.f127896c = 0;
        if (list != null) {
            this.f127895b.addAll(list);
        }
    }
}
