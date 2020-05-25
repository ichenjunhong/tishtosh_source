package com.bytedance.ies.bullet.kit.p644rn.p646c;

import com.bytedance.ies.bullet.p628b.p643i.C10368a;
import com.bytedance.ies.bullet.p628b.p643i.C10369b;
import com.bytedance.ies.bullet.p628b.p643i.C10383d;
import com.bytedance.ies.bullet.p628b.p643i.C10385f;
import com.bytedance.ies.bullet.p628b.p643i.C10389j;
import com.bytedance.ies.bullet.p628b.p643i.C10390k;
import com.bytedance.ies.bullet.p628b.p643i.C10419n;
import com.bytedance.ies.bullet.p628b.p643i.C10421p;
import com.bytedance.ies.bullet.p653ui.common.p657d.C10578a;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.bytedance.ies.bullet.kit.rn.c.c */
public final class C10460c extends C10578a {

    /* renamed from: b */
    public final C10385f<String> f27861b = new C10368a(null, 1, null);

    /* renamed from: d */
    public final C10385f<String> f27862d = new C10383d(null, 1, null);

    /* renamed from: e */
    public C10385f<String> f27863e = new C10390k(null, 1, null);

    /* renamed from: f */
    public final C10385f<Boolean> f27864f = new C10369b("force_h5", false, 2, null);

    /* renamed from: g */
    public final C10385f<Boolean> f27865g = new C10369b("dev", false, 2, null);

    /* renamed from: h */
    public final C10385f<String> f27866h;

    /* renamed from: i */
    public final C10389j f27867i;

    /* renamed from: j */
    public final C10385f<String> f27868j;

    /* renamed from: a */
    public final List<C10385f<?>> mo18322a() {
        return C52575l.m112133c(super.mo18322a(), C52575l.m112099b((Object[]) new C10385f[]{this.f27861b, this.f27863e, this.f27862d, this.f27864f, this.f27865g, this.f27866h, this.f27867i, this.f27868j}));
    }

    /* renamed from: b */
    public final boolean mo18524b() {
        boolean z;
        if (C52711k.m112239a((Object) (Boolean) this.f27865g.mo18457b(), (Object) Boolean.valueOf(true))) {
            CharSequence charSequence = (CharSequence) this.f27866h.mo18457b();
            if (charSequence == null || C52830p.m112402a(charSequence)) {
                z = true;
            } else {
                z = false;
            }
            if (!z) {
                return true;
            }
        }
        return false;
    }

    public C10460c() {
        C10419n nVar = new C10419n("rn_bundle_url", C10421p.m20979f(), null, 4, null);
        this.f27866h = nVar;
        this.f27867i = new C10389j("dynamic", 0);
        C10419n nVar2 = new C10419n("a_surl", C10421p.m20979f(), null, 4, null);
        this.f27868j = nVar2;
    }
}
