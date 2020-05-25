package com.p683ss.android.ugc.aweme.player.p2050a;

import android.text.TextUtils;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.player.a.c */
public final class C38834c {

    /* renamed from: a */
    public static final C38834c f98861a = new C38834c();

    /* renamed from: b */
    private static List<String> f98862b;

    private C38834c() {
    }

    static {
        List<String> arrayList = new ArrayList<>();
        f98862b = arrayList;
        arrayList.add("TCP_HIT");
        List<String> list = f98862b;
        if (list == null) {
            C52711k.m112234a();
        }
        list.add("TCP_MISS");
        List<String> list2 = f98862b;
        if (list2 == null) {
            C52711k.m112234a();
        }
        list2.add("HIT, HIT");
        List<String> list3 = f98862b;
        if (list3 == null) {
            C52711k.m112234a();
        }
        list3.add("HIT, MISS");
        List<String> list4 = f98862b;
        if (list4 == null) {
            C52711k.m112234a();
        }
        list4.add("MISS, HIT");
        List<String> list5 = f98862b;
        if (list5 == null) {
            C52711k.m112234a();
        }
        list5.add("MISS, MISS");
        List<String> list6 = f98862b;
        if (list6 == null) {
            C52711k.m112234a();
        }
        list6.add("HIT");
        List<String> list7 = f98862b;
        if (list7 == null) {
            C52711k.m112234a();
        }
        list7.add("MISS");
        List<String> list8 = f98862b;
        if (list8 == null) {
            C52711k.m112234a();
        }
        list8.add("TCP_MEM_HIT");
        List<String> list9 = f98862b;
        if (list9 == null) {
            C52711k.m112234a();
        }
        list9.add("TCP_REFRESH_HIT");
        List<String> list10 = f98862b;
        if (list10 == null) {
            C52711k.m112234a();
        }
        list10.add("TCP_REFRESH_MISS");
        List<String> list11 = f98862b;
        if (list11 == null) {
            C52711k.m112234a();
        }
        list11.add("TCP_REFRESH_FAIL_HIT");
        List<String> list12 = f98862b;
        if (list12 == null) {
            C52711k.m112234a();
        }
        list12.add("TCP_IMS_HIT");
        List<String> list13 = f98862b;
        if (list13 == null) {
            C52711k.m112234a();
        }
        list13.add("TCP_NEGATIVE_HIT");
    }

    /* renamed from: a */
    public static int m86267a(String str) {
        if (TextUtils.isEmpty(str)) {
            return 0;
        }
        List<String> list = f98862b;
        if (list == null) {
            C52711k.m112234a();
        }
        for (String str2 : list) {
            if (str == null) {
                C52711k.m112234a();
            }
            if (C52830p.m112411b(str, str2, false, 2, null)) {
                List<String> list2 = f98862b;
                if (list2 == null) {
                    C52711k.m112234a();
                }
                return list2.indexOf(str2) + 1;
            }
        }
        return 0;
    }
}
