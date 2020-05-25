package com.p683ss.android.ugc.aweme.commercialize.coupon.model;

import p2628d.p2639f.p2641b.C52707g;

/* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.model.e */
public enum C25690e {
    FREE_COUPON(1),
    PAY_COUPON(2);
    
    public static final C25691a Companion = null;

    /* renamed from: b */
    private final int f67963b;

    /* renamed from: com.ss.android.ugc.aweme.commercialize.coupon.model.e$a */
    public static final class C25691a {
        private C25691a() {
        }

        public /* synthetic */ C25691a(C52707g gVar) {
            this();
        }
    }

    public final int getValue() {
        return this.f67963b;
    }

    static {
        Companion = new C25691a(null);
    }

    private C25690e(int i) {
        this.f67963b = i;
    }
}
