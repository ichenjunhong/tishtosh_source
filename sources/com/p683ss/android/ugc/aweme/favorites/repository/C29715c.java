package com.p683ss.android.ugc.aweme.favorites.repository;

import com.bytedance.jedi.p725a.p740j.C11698b;
import com.p683ss.android.ugc.aweme.favorites.adapter.C29677g;
import com.p683ss.android.ugc.aweme.favorites.p1701a.C29659b;
import com.p683ss.android.ugc.aweme.favorites.p1701a.C29660c;
import java.util.ArrayList;
import java.util.List;
import p064c.p065a.C1680ad;
import p064c.p065a.C2206z;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.favorites.repository.c */
public final class C29715c extends C11698b {

    /* renamed from: a */
    public final List<C29660c> f77630a = new ArrayList();

    /* renamed from: b */
    public int f77631b;

    /* renamed from: c */
    private final C29714b f77632c = new C29714b();

    /* renamed from: b */
    public final int mo59980b() {
        if (this.f77630a.size() > this.f77631b) {
            return 2;
        }
        return 3;
    }

    /* renamed from: a */
    public final List<C29677g> mo59979a(int i) {
        List<C29677g> arrayList = new ArrayList<>();
        int i2 = 0;
        while (i2 < i && this.f77631b + i2 < this.f77630a.size()) {
            arrayList.add(new C29677g(0, this.f77630a.get(this.f77631b + i2)));
            i2++;
        }
        this.f77631b += i2;
        return arrayList;
    }

    /* renamed from: a */
    public final C1680ad<C29659b> mo59978a(int i, int i2) {
        C1680ad<C29659b> a = C1680ad.m5960a((C2206z<? extends T>) this.f77632c.mo22318c(new C29713a(i2, 12)));
        C52711k.m112236a((Object) a, "Single.fromObservable(po…stParams(cursor, count)))");
        return a;
    }
}
