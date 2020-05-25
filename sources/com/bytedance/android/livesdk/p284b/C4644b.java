package com.bytedance.android.livesdk.p284b;

import android.support.p043v7.p051e.C1208c.C1210a;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.b.b */
public final class C4644b extends C1210a {

    /* renamed from: a */
    private final List<?> f12689a;

    /* renamed from: b */
    private final List<?> f12690b;

    /* renamed from: a */
    public final int mo159a() {
        if (this.f12689a != null) {
            return this.f12689a.size();
        }
        return 0;
    }

    /* renamed from: b */
    public final int mo161b() {
        if (this.f12690b != null) {
            return this.f12690b.size();
        }
        return 0;
    }

    public C4644b(List<?> list, List<?> list2) {
        this.f12689a = list;
        this.f12690b = list2;
    }

    /* renamed from: b */
    public final boolean mo162b(int i, int i2) {
        if ((this.f12689a.get(i) instanceof C4643a) && (this.f12690b.get(i2) instanceof C4643a)) {
            return ((C4643a) this.f12689a.get(i)).mo10430a(this.f12690b.get(i2));
        }
        if (this.f12689a.get(i) == this.f12690b.get(i2)) {
            return true;
        }
        return false;
    }

    /* renamed from: c */
    public final boolean mo163c(int i, int i2) {
        if (!(this.f12689a.get(i) instanceof C4643a) || !(this.f12690b.get(i2) instanceof C4643a)) {
            return false;
        }
        return ((C4643a) this.f12689a.get(i)).mo10431b(this.f12690b.get(i2));
    }
}
