package com.bytedance.jedi.arch.ext.list;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.bytedance.jedi.arch.ext.list.h */
final /* synthetic */ class C11859h extends C52720t {

    /* renamed from: a */
    public static final C52771j f31445a = new C11859h();

    C11859h() {
    }

    public final String getName() {
        return "loadMore";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(ListState.class);
    }

    public final String getSignature() {
        return "getLoadMore()Lcom/bytedance/jedi/arch/Async;";
    }

    public final Object get(Object obj) {
        return ((ListState) obj).getLoadMore();
    }
}
