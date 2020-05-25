package com.p683ss.android.p1163f;

import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.ss.android.f.c */
public final class C19154c {

    /* renamed from: a */
    public String f52790a;

    /* renamed from: b */
    public int f52791b;

    /* renamed from: c */
    public Map<String, Object> f52792c;

    /* renamed from: a */
    public final boolean mo39099a() {
        if (C19149b.f52772h == (this.f52791b & C19149b.f52772h)) {
            return true;
        }
        return false;
    }

    /* renamed from: b */
    public final boolean mo39100b() {
        if (C19149b.f52773i == (this.f52791b & C19149b.f52773i)) {
            return true;
        }
        return false;
    }

    public final String toString() {
        String str = "";
        if (this.f52792c != null) {
            for (Entry entry : this.f52792c.entrySet()) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append("[key:");
                sb.append(entry.getKey());
                sb.append(" value: ");
                sb.append(entry.getValue());
                sb.append("]");
                str = sb.toString();
            }
        }
        StringBuilder sb2 = new StringBuilder("event: ");
        sb2.append(this.f52790a);
        sb2.append(" send channels: ");
        sb2.append(this.f52791b);
        sb2.append(" info: ");
        sb2.append(str);
        return sb2.toString();
    }

    public C19154c(String str, Map<String, Object> map, int i) {
        this.f52790a = str;
        this.f52792c = map;
        this.f52791b = i;
    }
}
