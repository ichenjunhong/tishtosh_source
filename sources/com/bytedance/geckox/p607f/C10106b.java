package com.bytedance.geckox.p607f;

import com.bytedance.p782n.C12382d;
import com.bytedance.p782n.p784b.C12379a;
import com.bytedance.p782n.p784b.C12380b;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.geckox.f.b */
public final class C10106b {

    /* renamed from: a */
    private final Map<Class<? extends C12382d<?, ?>>, C12380b> f27393a = new HashMap();

    /* renamed from: a */
    public final C12379a mo18082a(Class<? extends C12382d<?, ?>> cls) {
        C12379a aVar;
        synchronized (this.f27393a) {
            aVar = (C12379a) this.f27393a.get(cls);
        }
        return aVar;
    }

    /* renamed from: a */
    public final void mo18083a(Class<? extends C12382d<?, ?>> cls, C12379a aVar) {
        synchronized (this.f27393a) {
            C12380b bVar = (C12380b) this.f27393a.get(cls);
            if (bVar == null) {
                bVar = new C12380b(new C12379a[0]);
                this.f27393a.put(cls, bVar);
            }
            bVar.mo23394a(aVar);
        }
    }
}
