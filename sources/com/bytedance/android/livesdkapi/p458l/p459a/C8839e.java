package com.bytedance.android.livesdkapi.p458l.p459a;

import java.util.ArrayList;
import java.util.List;

/* renamed from: com.bytedance.android.livesdkapi.l.a.e */
public final class C8839e {

    /* renamed from: a */
    public final List<C8835a> f24123a;

    /* renamed from: b */
    public String f24124b;

    /* renamed from: c */
    public String f24125c;

    public final String toString() {
        return mo15824a();
    }

    public C8839e() {
        this.f24123a = new ArrayList();
        this.f24125c = "UTF-8";
        this.f24124b = null;
    }

    /* renamed from: a */
    public final String mo15824a() {
        if (this.f24123a.isEmpty()) {
            return this.f24124b;
        }
        String a = C8838d.m17352a(this.f24123a, this.f24125c);
        if (this.f24124b == null || this.f24124b.length() == 0) {
            return a;
        }
        int indexOf = this.f24124b.indexOf(63);
        if (indexOf < 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f24124b);
            sb.append("?");
            sb.append(a);
            return sb.toString();
        } else if (this.f24124b.indexOf(61, indexOf) > 0) {
            int i = indexOf + 1;
            String substring = this.f24124b.substring(0, i);
            String substring2 = this.f24124b.substring(i);
            StringBuilder sb2 = new StringBuilder();
            sb2.append(substring);
            sb2.append(a);
            sb2.append("&");
            sb2.append(substring2);
            return sb2.toString();
        } else {
            StringBuilder sb3 = new StringBuilder();
            sb3.append(this.f24124b);
            sb3.append("&");
            sb3.append(a);
            return sb3.toString();
        }
    }

    public C8839e(String str) {
        this.f24123a = new ArrayList();
        this.f24125c = "UTF-8";
        this.f24124b = str;
    }

    /* renamed from: a */
    public final void mo15825a(String str, int i) {
        this.f24123a.add(new C8835a(str, String.valueOf(i)));
    }

    /* renamed from: a */
    public final void mo15826a(String str, long j) {
        this.f24123a.add(new C8835a(str, String.valueOf(j)));
    }

    /* renamed from: a */
    public final void mo15827a(String str, String str2) {
        this.f24123a.add(new C8835a(str, str2));
    }
}
