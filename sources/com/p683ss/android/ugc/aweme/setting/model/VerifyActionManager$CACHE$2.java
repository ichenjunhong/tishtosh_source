package com.p683ss.android.ugc.aweme.setting.model;

import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.base.p1417h.C23540d;
import p2628d.p2639f.p2640a.C52670a;
import p2628d.p2639f.p2641b.C52712l;

/* renamed from: com.ss.android.ugc.aweme.setting.model.VerifyActionManager$CACHE$2 */
final class VerifyActionManager$CACHE$2 extends C52712l implements C52670a<IVerifyActionCache> {
    public static final VerifyActionManager$CACHE$2 INSTANCE = new VerifyActionManager$CACHE$2();

    VerifyActionManager$CACHE$2() {
        super(0);
    }

    public final IVerifyActionCache invoke() {
        return (IVerifyActionCache) C23540d.m57713a(AwemeApplication.m56199a(), IVerifyActionCache.class);
    }
}
