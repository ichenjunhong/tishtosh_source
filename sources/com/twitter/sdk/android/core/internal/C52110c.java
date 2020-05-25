package com.twitter.sdk.android.core.internal;

import android.content.Context;
import android.text.TextUtils;
import com.twitter.sdk.android.core.internal.p2618b.C52106b;

/* renamed from: com.twitter.sdk.android.core.internal.c */
final class C52110c {

    /* renamed from: a */
    final C52106b f129715a;

    /* renamed from: b */
    private final Context f129716b;

    /* renamed from: b */
    private C52113f m111452b() {
        return new C52112e(this.f129716b);
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public C52104b mo108812a() {
        C52104b a = m111452b().mo108815a();
        m111453b(a);
        return a;
    }

    /* renamed from: b */
    static boolean m111453b(C52104b bVar) {
        if (bVar == null || TextUtils.isEmpty(bVar.f129708a)) {
            return false;
        }
        return true;
    }

    /* access modifiers changed from: 0000 */
    /* renamed from: a */
    public void mo108813a(C52104b bVar) {
        if (m111453b(bVar)) {
            this.f129715a.mo108808a(this.f129715a.mo108809b().putString("advertising_id", bVar.f129708a).putBoolean("limit_ad_tracking_enabled", bVar.f129709b));
        } else {
            this.f129715a.mo108808a(this.f129715a.mo108809b().remove("advertising_id").remove("limit_ad_tracking_enabled"));
        }
    }

    C52110c(Context context, C52106b bVar) {
        this.f129716b = context.getApplicationContext();
        this.f129715a = bVar;
    }
}
