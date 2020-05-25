package com.bytedance.jedi.arch.ext.list;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.bytedance.jedi.arch.ext.list.i */
final /* synthetic */ class C11860i extends C52720t {

    /* renamed from: a */
    public static final C52771j f31446a = new C11860i();

    C11860i() {
    }

    public final String getName() {
        return "list";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(ListState.class);
    }

    public final String getSignature() {
        return "getList()Ljava/util/List;";
    }

    public final Object get(Object obj) {
        return ((ListState) obj).getList();
    }
}
