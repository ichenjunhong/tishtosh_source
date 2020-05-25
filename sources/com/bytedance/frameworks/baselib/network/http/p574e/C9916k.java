package com.bytedance.frameworks.baselib.network.http.p574e;

import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

/* renamed from: com.bytedance.frameworks.baselib.network.http.e.k */
public final class C9916k {

    /* renamed from: a */
    public final Map<String, List<String>> f26986a;

    /* renamed from: b */
    public String f26987b;

    public final String toString() {
        return mo17849a();
    }

    public C9916k() {
        this.f26986a = new LinkedHashMap();
        this.f26987b = null;
    }

    /* renamed from: a */
    public final String mo17849a() {
        String str;
        if (this.f26986a.isEmpty()) {
            return this.f26987b;
        }
        Map<String, List<String>> map = this.f26986a;
        String str2 = "UTF-8";
        StringBuilder sb = new StringBuilder();
        for (Entry entry : map.entrySet()) {
            String a = C9917l.m19877a((String) entry.getKey(), str2);
            List<String> list = (List) entry.getValue();
            if (list != null && list.size() > 0) {
                for (String str3 : list) {
                    if (str3 != null) {
                        str = C9917l.m19877a(str3, str2);
                    } else {
                        str = "";
                    }
                    if (sb.length() > 0) {
                        sb.append("&");
                    }
                    sb.append(a);
                    if (!str.isEmpty()) {
                        sb.append("=");
                        sb.append(str);
                    }
                }
            }
        }
        String sb2 = sb.toString();
        if (this.f26987b == null || this.f26987b.length() == 0) {
            return sb2;
        }
        if (this.f26987b.indexOf(63) >= 0) {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f26987b);
            sb3.append("&");
            sb3.append(sb2);
            return sb3.toString();
        }
        StringBuilder sb4 = new StringBuilder();
        sb4.append(this.f26987b);
        sb4.append("?");
        sb4.append(sb2);
        return sb4.toString();
    }

    public C9916k(String str) {
        this.f26986a = new LinkedHashMap();
        this.f26987b = str;
    }

    /* renamed from: a */
    public final void mo17850a(String str, double d) {
        List list = (List) this.f26986a.get(str);
        if (list == null) {
            list = new LinkedList();
        }
        list.add(String.valueOf(d));
        this.f26986a.put(str, list);
    }

    /* renamed from: a */
    public final void mo17851a(String str, long j) {
        List list = (List) this.f26986a.get(str);
        if (list == null) {
            list = new LinkedList();
        }
        list.add(String.valueOf(j));
        this.f26986a.put(str, list);
    }

    /* renamed from: a */
    public final void mo17852a(String str, String str2) {
        List list = (List) this.f26986a.get(str);
        if (list == null) {
            list = new LinkedList();
        }
        list.add(String.valueOf(str2));
        this.f26986a.put(str, list);
    }
}
