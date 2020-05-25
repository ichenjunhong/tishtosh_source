package com.p683ss.android.ugc.aweme.p1807im.sdk.utils;

import android.support.p043v7.p051e.C1208c.C1210a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.utils.k */
public final class C35273k extends C1210a {

    /* renamed from: a */
    private final List f90611a;

    /* renamed from: b */
    private final List f90612b;

    /* renamed from: a */
    public final int mo159a() {
        return this.f90611a.size();
    }

    /* renamed from: b */
    public final int mo161b() {
        return this.f90612b.size();
    }

    public C35273k(List list, List list2) {
        this.f90611a = list;
        this.f90612b = list2;
    }

    /* renamed from: b */
    public final boolean mo162b(int i, int i2) {
        return this.f90611a.get(i).equals(this.f90612b.get(i2));
    }

    /* renamed from: c */
    public final boolean mo163c(int i, int i2) {
        return this.f90611a.get(i).equals(this.f90612b.get(i2));
    }
}
