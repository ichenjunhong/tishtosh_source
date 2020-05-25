package com.p683ss.android.ugc.aweme.feed.adapter;

import com.bytedance.common.utility.p522b.C9376b;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.feed.adapter.j */
public final class C30085j {
    /* renamed from: a */
    public static final <E> void m70621a(ArrayList<E> arrayList, List<? extends E> list) {
        C52711k.m112240b(arrayList, "$this$addAll");
        Collection collection = list;
        if (!C9376b.m18558a(collection)) {
            if (list == null) {
                C52711k.m112234a();
            }
            arrayList.addAll(collection);
        }
    }
}
