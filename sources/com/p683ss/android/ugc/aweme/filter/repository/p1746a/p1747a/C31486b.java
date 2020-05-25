package com.p683ss.android.ugc.aweme.filter.repository.p1746a.p1747a;

import java.io.File;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.filter.repository.a.a.b */
public final class C31486b {
    /* renamed from: a */
    public static final String m73322a(String str) {
        C52711k.m112240b(str, "$this$joinSeparator");
        String str2 = File.separator;
        C52711k.m112236a((Object) str2, "File.separator");
        if (C52830p.m112413c(str, str2, false, 2, null)) {
            return str;
        }
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(File.separator);
        return sb.toString();
    }
}
