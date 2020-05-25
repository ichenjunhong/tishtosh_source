package com.p683ss.android.ugc.aweme.bullet.module.p1476a;

import com.bytedance.ies.bullet.kit.p644rn.C10457c;
import com.bytedance.ies.bullet.kit.p644rn.C10469e;
import com.bytedance.ies.bullet.kit.p644rn.C10470f;
import com.bytedance.ies.bullet.kit.p644rn.core.C10462b;
import com.bytedance.ies.bullet.kit.p644rn.core.C10464d;
import com.bytedance.ies.bullet.kit.p644rn.core.C10465e;
import com.bytedance.ies.bullet.p625a.p626a.p627a.C10221a;
import com.bytedance.ies.bullet.p628b.p637g.p638a.C10326b;
import com.p683ss.android.ugc.aweme.bullet.reactpackage.RNCommonModule;
import com.p683ss.android.ugc.aweme.bullet.reactpackage.p1480a.C24346a;
import com.p683ss.android.ugc.aweme.commerce.service.C25539a;
import java.util.ArrayList;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.module.a.b */
public final class C24283b extends C10221a {

    /* renamed from: a */
    public final C10326b f64419a;

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.a.b$a */
    public static final class C24284a implements C10457c {
        C24284a() {
        }

        /* renamed from: b */
        public final List<C10465e<?>> mo18520b(C10470f fVar, C10326b bVar) {
            C52711k.m112240b(fVar, "instance");
            C52711k.m112240b(bVar, "providerFactory");
            return C52575l.m112097a();
        }

        /* renamed from: a */
        public final List<C10462b> mo18519a(C10470f fVar, C10326b bVar) {
            C52711k.m112240b(fVar, "instance");
            C52711k.m112240b(bVar, "providerFactory");
            return C52575l.m112101c(new RNCommonModule());
        }
    }

    /* renamed from: com.ss.android.ugc.aweme.bullet.module.a.b$b */
    public static final class C24285b implements C10469e {
        C24285b() {
        }

        /* renamed from: a */
        public final List<C10464d> mo18537a(C10470f fVar, C10326b bVar) {
            C52711k.m112240b(fVar, "instance");
            C52711k.m112240b(bVar, "providerFactory");
            ArrayList arrayList = new ArrayList();
            arrayList.add(new C24346a());
            C10464d bulletFootprintPackageInstance = C25539a.m62079a().getBulletFootprintPackageInstance();
            if (bulletFootprintPackageInstance != null) {
                arrayList.add(bulletFootprintPackageInstance);
            }
            return arrayList;
        }
    }

    /* renamed from: a */
    public final C10457c mo18252a() {
        return new C24284a();
    }

    /* renamed from: b */
    public final C10469e mo18253b() {
        return new C24285b();
    }

    public C24283b(C10326b bVar) {
        C52711k.m112240b(bVar, "providerFactory");
        this.f64419a = bVar;
    }
}
