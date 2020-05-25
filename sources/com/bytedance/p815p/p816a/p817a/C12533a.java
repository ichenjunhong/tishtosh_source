package com.bytedance.p815p.p816a.p817a;

import com.bytedance.p815p.p816a.p818b.C12537a;
import com.bytedance.p815p.p816a.p818b.C12541b;
import com.bytedance.p815p.p816a.p818b.C12545c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.p.a.a.a */
public final class C12533a implements C12534b<C12545c> {

    /* renamed from: a */
    private Map<Byte, C12545c> f32906a = new HashMap();

    /* renamed from: a */
    public final /* synthetic */ Object mo23583a(byte b) {
        Object obj;
        C12545c cVar = (C12545c) this.f32906a.get(Byte.valueOf(b));
        if (cVar != null) {
            return cVar;
        }
        if (b != 2) {
            obj = new C12537a();
        } else {
            obj = new C12541b();
        }
        this.f32906a.put(Byte.valueOf(b), obj);
        return obj;
    }
}
