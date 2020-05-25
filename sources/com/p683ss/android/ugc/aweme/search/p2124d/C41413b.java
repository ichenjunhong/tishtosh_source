package com.p683ss.android.ugc.aweme.search.p2124d;

/* renamed from: com.ss.android.ugc.aweme.search.d.b */
public final class C41413b {

    /* renamed from: a */
    public static final C41413b f104977a = new C41413b();

    private C41413b() {
    }

    /* renamed from: a */
    public static final int m91226a(C41412a aVar) {
        if (aVar == null) {
            return 0;
        }
        if (aVar.getSortType() == C41415d.SORT_GENERAL.getValue() && aVar.getPublishTime() == C41414c.LIMIT_NO.getValue()) {
            return 0;
        }
        return 1;
    }

    /* renamed from: b */
    public static final C41412a m91227b(C41412a aVar) {
        if (aVar == null) {
            return new C41412a(C41415d.SORT_GENERAL.getValue(), C41414c.LIMIT_NO.getValue());
        }
        return aVar;
    }
}
