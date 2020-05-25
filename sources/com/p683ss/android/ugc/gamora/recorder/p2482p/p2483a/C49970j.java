package com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a;

import com.p683ss.android.ugc.gamora.recorder.p2482p.C49971b;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.p.a.j */
public final class C49970j {

    /* renamed from: a */
    public static final C49970j f125187a = new C49970j();

    private C49970j() {
    }

    /* renamed from: a */
    public static final List<C49971b> m107820a(C49942b bVar) {
        int i;
        C52711k.m112240b(bVar, "toolbarManager");
        ArrayList arrayList = new ArrayList();
        List a = bVar.mo97744a();
        int c = bVar.mo97752c();
        if (a.size() > c) {
            if (bVar.mo97749b() != null) {
                i = 1;
            } else {
                i = 0;
            }
            arrayList.addAll(a.subList(c - i, a.size()));
        }
        return arrayList;
    }

    /* renamed from: a */
    private static final List<C49971b> m107821a(List<? extends C49971b> list, int i) {
        ArrayList arrayList = new ArrayList();
        if (list.size() > i) {
            arrayList.addAll(list.subList(0, i));
        } else {
            arrayList.addAll(list);
        }
        return arrayList;
    }

    /* renamed from: a */
    public static final List<C49971b> m107822a(List<? extends C49971b> list, int i, C49971b bVar) {
        int i2;
        C52711k.m112240b(list, "items");
        if (list.size() <= i) {
            return m107821a(list, i);
        }
        if (bVar != null) {
            i2 = 1;
        } else {
            i2 = 0;
        }
        List<C49971b> a = m107821a(list, i - i2);
        if (bVar == null) {
            return a;
        }
        a.add(bVar);
        return a;
    }
}
