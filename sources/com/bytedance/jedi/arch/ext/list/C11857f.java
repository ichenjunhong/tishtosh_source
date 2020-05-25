package com.bytedance.jedi.arch.ext.list;

import p2628d.p2639f.p2641b.C52720t;
import p2628d.p2639f.p2641b.C52728w;
import p2628d.p2648k.C52761d;
import p2628d.p2648k.C52771j;

/* renamed from: com.bytedance.jedi.arch.ext.list.f */
final /* synthetic */ class C11857f extends C52720t {

    /* renamed from: a */
    public static final C52771j f31443a = new C11857f();

    C11857f() {
    }

    public final String getName() {
        return "isEmpty";
    }

    public final C52761d getOwner() {
        return C52728w.m112245a(ListState.class);
    }

    public final String getSignature() {
        return "isEmpty()Lcom/bytedance/jedi/arch/ext/list/DistinctBoolean;";
    }

    public final Object get(Object obj) {
        return ((ListState) obj).isEmpty();
    }
}
