package com.p683ss.android.ugc.aweme.bullet;

import android.content.Context;
import android.os.Bundle;
import com.p683ss.android.ugc.aweme.bullet.api.IBulletService;
import com.p683ss.android.ugc.aweme.bullet.impl.BulletService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.bullet.a */
public final class C24098a {

    /* renamed from: a */
    public static final C24098a f63972a = new C24098a();

    private C24098a() {
    }

    /* renamed from: a */
    public static final IBulletService m58973a() {
        IBulletService provideBulletService_Monster = BulletService.provideBulletService_Monster();
        C52711k.m112236a((Object) provideBulletService_Monster, "ServiceManager.get().get…ulletService::class.java)");
        return provideBulletService_Monster;
    }

    /* renamed from: a */
    public static final void m58974a(Context context, String str) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "schema");
        m58975a(context, str, null, null);
    }

    /* renamed from: a */
    public static final void m58975a(Context context, String str, String str2, Bundle bundle) {
        C52711k.m112240b(context, "context");
        C52711k.m112240b(str, "schema");
        BulletService.provideBulletService_Monster().open(context, str, str2, bundle);
    }
}
