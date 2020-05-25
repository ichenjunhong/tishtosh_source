package com.p683ss.android.ugc.aweme.filter;

import android.support.p043v7.p051e.C1208c.C1210a;
import java.util.List;

/* renamed from: com.ss.android.ugc.aweme.filter.d */
public final class C31455d extends C1210a {

    /* renamed from: a */
    private List<C31459g> f82318a;

    /* renamed from: b */
    private List<C31459g> f82319b;

    /* renamed from: a */
    public final int mo159a() {
        return this.f82318a.size();
    }

    /* renamed from: b */
    public final int mo161b() {
        return this.f82319b.size();
    }

    public C31455d(List<C31459g> list, List<C31459g> list2) {
        this.f82318a = list;
        this.f82319b = list2;
    }

    /* renamed from: b */
    public final boolean mo162b(int i, int i2) {
        if (i == i2 || ((C31459g) this.f82318a.get(i)).f82324a == ((C31459g) this.f82319b.get(i2)).f82324a) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo163c(int i, int i2) {
        return ((C31459g) this.f82318a.get(i)).equals(this.f82319b.get(i2));
    }
}
