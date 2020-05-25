package com.bytedance.opensdk.p800b;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import leakcanary.internal.LeakCanaryFileProvider;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.opensdk.b.o */
public final class C12478o {

    /* renamed from: a */
    private final LinkedHashMap<String, List<String>> f32781a = new LinkedHashMap<>();

    /* renamed from: b */
    private final String f32782b;

    public final String toString() {
        return mo23510a();
    }

    /* renamed from: a */
    public final String mo23510a() {
        boolean z;
        if (this.f32781a.isEmpty()) {
            return this.f32782b;
        }
        String a = C12479p.f32783a.mo23512a((Map<String, ? extends List<String>>) this.f32781a, C12479p.m25081a());
        if (this.f32782b.length() == 0) {
            z = true;
        } else {
            z = false;
        }
        if (z) {
            return a;
        }
        if (C52830p.m112415a((CharSequence) this.f32782b, '?', 0, false, 6, (Object) null) >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f32782b);
            sb.append('&');
            sb.append(a);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f32782b);
        sb2.append('?');
        sb2.append(a);
        return sb2.toString();
    }

    public C12478o(String str) {
        C52711k.m112240b(str, "mUrl");
        this.f32782b = str;
    }

    /* renamed from: a */
    public final C12478o mo23508a(String str, int i) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        List list = (List) this.f32781a.get(str);
        if (list == null) {
            list = new LinkedList();
        }
        list.add(String.valueOf(i));
        this.f32781a.put(str, list);
        return this;
    }

    /* renamed from: a */
    public final C12478o mo23509a(String str, String str2) {
        C52711k.m112240b(str, LeakCanaryFileProvider.f132049i);
        C52711k.m112240b(str2, "value");
        List list = (List) this.f32781a.get(str);
        if (list == null) {
            list = new LinkedList();
        }
        list.add(str2);
        this.f32781a.put(str, list);
        return this;
    }
}
