package com.bytedance.p815p.p816a.p817a;

import com.bytedance.p815p.p816a.p819c.C12547a;
import com.bytedance.p815p.p816a.p819c.C12548b;
import com.bytedance.p815p.p816a.p819c.C12549c;
import java.util.HashMap;
import java.util.Map;

/* renamed from: com.bytedance.p.a.a.c */
public final class C12535c implements C12534b<C12548b> {

    /* renamed from: a */
    private Map<Byte, C12548b> f32907a = new HashMap();

    /* renamed from: a */
    public final /* synthetic */ Object mo23583a(byte b) {
        Object obj;
        C12548b bVar = (C12548b) this.f32907a.get(Byte.valueOf(b));
        if (bVar != null) {
            return bVar;
        }
        if (b != 1) {
            obj = new C12547a();
        } else {
            obj = new C12549c();
        }
        this.f32907a.put(Byte.valueOf(b), obj);
        return obj;
    }
}
