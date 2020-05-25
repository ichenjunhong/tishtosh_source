package com.bytedance.jedi.arch.ext.list;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.bytedance.jedi.arch.ext.list.e */
final /* synthetic */ class C11856e extends C52720t {

    /* renamed from: a */
    public static final C52771j f31442a = new C11856e();

    C11856e() {
    }

    public final String getName() {
        return "hasMore";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(ListState.class);
    }

    public final String getSignature() {
        return "getHasMore()Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;";
    }

    public final Object get(Object obj) {
        return ((ListState) obj).getHasMore();
    }
}
