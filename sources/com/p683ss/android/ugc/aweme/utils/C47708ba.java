package com.p683ss.android.ugc.aweme.utils;

import android.support.p043v7.p051e.C1208c.C1210a;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.utils.ba */
public final class C47708ba extends C1210a {

    /* renamed from: a */
    public final List<?> f120197a;

    /* renamed from: b */
    private final List<?> f120198b;

    /* renamed from: a */
    public final int mo159a() {
        return this.f120198b.size();
    }

    /* renamed from: b */
    public final int mo161b() {
        return this.f120197a.size();
    }

    public C47708ba(List<?> list, List<?> list2) {
        C52711k.m112240b(list, "oldList");
        C52711k.m112240b(list2, "newList");
        this.f120198b = list;
        this.f120197a = list2;
    }

    /* renamed from: b */
    public final boolean mo162b(int i, int i2) {
        return C52711k.m112239a(this.f120198b.get(i), this.f120197a.get(i2));
    }

    /* renamed from: c */
    public final boolean mo163c(int i, int i2) {
        return C52711k.m112239a(this.f120198b.get(i), this.f120197a.get(i2));
    }
}
