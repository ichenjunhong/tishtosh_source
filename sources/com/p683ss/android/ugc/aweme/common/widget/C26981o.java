package com.p683ss.android.ugc.aweme.common.widget;

import p2628d.p2639f.p2640a.C52670a;

/* renamed from: com.ss.android.ugc.aweme.common.widget.o */
final /* synthetic */ class C26981o implements C52670a {

    /* renamed from: a */
    private final Exception f71129a;

    C26981o(Exception exc) {
        this.f71129a = exc;
    }

    public final Object invoke() {
        Exception exc = this.f71129a;
        StringBuilder sb = new StringBuilder("VerticalViewPager draw error->");
        sb.append(exc);
        return sb.toString();
    }
}
