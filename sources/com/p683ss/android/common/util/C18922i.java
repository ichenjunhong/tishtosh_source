package com.p683ss.android.common.util;

import com.p683ss.android.http.p1169a.p1170a.p1171a.C19173b;
import com.p683ss.android.http.p1169a.p1172b.C19180e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.common.util.i */
public final class C18922i {

    /* renamed from: a */
    public final List<C19180e> f52131a;

    /* renamed from: b */
    public String f52132b;

    /* renamed from: c */
    public String f52133c;

    public final String toString() {
        return mo38774a();
    }

    public C18922i() {
        this.f52131a = new ArrayList();
        this.f52133c = "UTF-8";
        this.f52132b = null;
    }

    /* renamed from: a */
    public final String mo38774a() {
        if (this.f52131a.isEmpty()) {
            return this.f52132b;
        }
        String a = C19173b.m46744a(this.f52131a, this.f52133c);
        if (this.f52132b == null || this.f52132b.length() == 0) {
            return a;
        }
        if (this.f52132b.indexOf(63) >= 0) {
            StringBuilder sb = new StringBuilder();
            sb.append(this.f52132b);
            sb.append("&");
            sb.append(a);
            return sb.toString();
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append(this.f52132b);
        sb2.append("?");
        sb2.append(a);
        return sb2.toString();
    }

    public C18922i(String str) {
        this.f52131a = new ArrayList();
        this.f52133c = "UTF-8";
        this.f52132b = str;
    }

    /* renamed from: a */
    public final void mo38775a(String str, double d) {
        this.f52131a.add(new C19180e(str, String.valueOf(d)));
    }

    /* renamed from: a */
    public final void mo38776a(String str, int i) {
        this.f52131a.add(new C19180e(str, String.valueOf(i)));
    }

    /* renamed from: a */
    public final void mo38777a(String str, long j) {
        this.f52131a.add(new C19180e(str, String.valueOf(j)));
    }

    /* renamed from: a */
    public final void mo38778a(String str, String str2) {
        this.f52131a.add(new C19180e(str, str2));
    }
}
