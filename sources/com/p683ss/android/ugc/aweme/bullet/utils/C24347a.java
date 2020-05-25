package com.p683ss.android.ugc.aweme.bullet.utils;

import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e;
import com.bytedance.ies.bullet.p628b.p633e.p634a.C10268e.C10269a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.bytedance.ies.p675g.p676a.C10762d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.utils.a */
public final class C24347a {

    /* renamed from: a */
    public static final C24347a f64655a = new C24347a();

    private C24347a() {
    }

    /* renamed from: a */
    public static C10268e m59706a(C10326b bVar, String str, C10762d dVar, C10269a aVar) {
        C52711k.m112240b(bVar, "contextProviderFactory");
        C52711k.m112240b(str, "methodName");
        C52711k.m112240b(dVar, "method");
        C52711k.m112240b(aVar, "methodAccess");
        BulletMethodAdapter$javaMethodToBullet$1 bulletMethodAdapter$javaMethodToBullet$1 = new BulletMethodAdapter$javaMethodToBullet$1(dVar, str, aVar, bVar, bVar);
        return bulletMethodAdapter$javaMethodToBullet$1;
    }
}
