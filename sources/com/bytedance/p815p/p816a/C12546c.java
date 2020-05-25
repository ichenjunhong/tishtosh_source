package com.bytedance.p815p.p816a;

import com.bytedance.p815p.p816a.p817a.C12533a;
import com.bytedance.p815p.p816a.p817a.C12534b;
import com.bytedance.p815p.p816a.p817a.C12535c;
import com.bytedance.p815p.p816a.p818b.C12545c;
import com.bytedance.p815p.p816a.p819c.C12548b;

/* renamed from: com.bytedance.p.a.c */
public final class C12546c {

    /* renamed from: a */
    public static C12534b<C12548b> f32933a = new C12535c();

    /* renamed from: b */
    private static C12534b<C12545c> f32934b = new C12533a();

    /* renamed from: a */
    public static C12545c m25172a(byte b) {
        return (C12545c) f32934b.mo23583a(b);
    }

    /* renamed from: a */
    public static void m25173a(C12527a aVar) {
        if (aVar != null) {
            C12545c cVar = aVar.f32897f;
            if (cVar != null) {
                cVar.mo23584a(aVar);
            }
        }
    }

    /* renamed from: b */
    public static boolean m25174b(C12527a aVar) {
        if (aVar == null) {
            return false;
        }
        if (aVar.f32892a == null || aVar.f32892a.isEmpty()) {
            return true;
        }
        C12545c cVar = aVar.f32897f;
        if (cVar == null) {
            return false;
        }
        return cVar.mo23585b(aVar).containsAll(aVar.f32892a);
    }
}
