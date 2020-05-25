package com.p683ss.android.ugc.gamora.recorder.p2482p.p2483a;

import android.support.p043v7.p051e.C1208c.C1210a;
import com.p683ss.android.ugc.gamora.recorder.p2482p.C49971b;
import java.util.List;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.gamora.recorder.p.a.d */
public final class C49950d extends C1210a {

    /* renamed from: a */
    private final List<C49971b> f125140a;

    /* renamed from: b */
    private final List<C49971b> f125141b;

    /* renamed from: a */
    public final int mo159a() {
        return this.f125140a.size();
    }

    /* renamed from: b */
    public final int mo161b() {
        return this.f125141b.size();
    }

    public C49950d(List<? extends C49971b> list, List<? extends C49971b> list2) {
        C52711k.m112240b(list, "oldItems");
        C52711k.m112240b(list2, "newItems");
        this.f125140a = list;
        this.f125141b = list2;
    }

    /* renamed from: b */
    public final boolean mo162b(int i, int i2) {
        if (((C49971b) this.f125140a.get(i)).f125188a == ((C49971b) this.f125141b.get(i2)).f125188a) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo163c(int i, int i2) {
        if (((C49971b) this.f125140a.get(i)).f125198k != ((C49971b) this.f125141b.get(i2)).f125198k || !C52711k.m112239a((Object) (C49971b) this.f125140a.get(i), (Object) (C49971b) this.f125141b.get(i2))) {
            return false;
        }
        return true;
    }
}
