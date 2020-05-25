package com.p683ss.android.ugc.aweme.discover.p1659ui;

import com.p683ss.android.ugc.aweme.search.model.C41440e;
import java.util.ArrayList;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.discover.ui.ba */
public final class C28540ba<T> {

    /* renamed from: a */
    T f74998a;

    /* renamed from: b */
    C41440e f74999b;

    /* renamed from: c */
    boolean f75000c;

    private C28540ba(T t, C41440e eVar, boolean z) {
        this.f74998a = t;
        this.f74999b = eVar;
        this.f75000c = z;
    }

    /* renamed from: a */
    static <T> List<C28540ba<T>> m67706a(List<T> list, C41440e eVar, boolean z) {
        ArrayList arrayList = new ArrayList(list.size());
        for (T baVar : list) {
            arrayList.add(new C28540ba(baVar, eVar, z));
        }
        return arrayList;
    }
}
