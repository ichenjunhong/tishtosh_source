package com.p683ss.android.ugc.aweme.filter.repository.internal.p1748a;

import com.p683ss.android.ugc.aweme.filter.repository.p1746a.C31498k;
import com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a.C31486b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.internal.a.d */
public final class C31508d implements C31498k {

    /* renamed from: a */
    private final String f82425a;

    /* renamed from: b */
    public final String mo64404b(int i) {
        return this.f82425a;
    }

    public C31508d(String str) {
        C52711k.m112240b(str, "filterRootDir");
        this.f82425a = str;
    }

    /* renamed from: a */
    public final String mo64403a(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(i);
        sb.append(".zip");
        return sb.toString();
    }

    /* renamed from: c */
    public final String mo64405c(int i) {
        StringBuilder sb = new StringBuilder();
        sb.append(C31486b.m73322a(this.f82425a));
        sb.append(i);
        return C31486b.m73322a(sb.toString());
    }
}
