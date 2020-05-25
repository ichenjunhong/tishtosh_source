package com.p683ss.android.ugc.aweme.commerce.service;

/* renamed from: com.ss.android.ugc.aweme.commerce.service.a */
public final class C25539a {

    /* renamed from: a */
    public static final C25539a f67521a = new C25539a();

    private C25539a() {
    }

    /* renamed from: a */
    public static final ICommerceService m62079a() {
        ICommerceService provideICommerceService_Monster = EmptyCommerceService.provideICommerceService_Monster();
        if (provideICommerceService_Monster == null) {
            return new EmptyCommerceService();
        }
        return provideICommerceService_Monster;
    }
}
