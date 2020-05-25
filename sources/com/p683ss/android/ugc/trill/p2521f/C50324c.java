package com.p683ss.android.ugc.trill.p2521f;

import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.trill.f.c */
final /* synthetic */ class C50324c {
    /* renamed from: a */
    private static final String m108604a(Object obj) {
        if (obj == null) {
            return "";
        }
        return obj.toString();
    }

    /* renamed from: a */
    public static final String m108605a(String str, List<? extends Object> list) {
        boolean z;
        String str2;
        C52711k.m112240b(list, "list");
        if (list.isEmpty()) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        int i = 0;
        for (Object next : list) {
            int i2 = i + 1;
            if (i < 0) {
                C52575l.m112100b();
            }
            String a = m108604a(next);
            sb.append(a);
            if (a.length() > 0) {
                z = true;
            } else {
                z = false;
            }
            if (z && i != list.size() - 1) {
                if (str == null) {
                    str2 = ",";
                } else {
                    str2 = str;
                }
                sb.append(str2);
            }
            i = i2;
        }
        String sb2 = sb.toString();
        C52711k.m112236a((Object) sb2, "builder.toString()");
        return sb2;
    }
}
