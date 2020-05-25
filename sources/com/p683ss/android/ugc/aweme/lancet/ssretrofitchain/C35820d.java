package com.p683ss.android.ugc.aweme.lancet.ssretrofitchain;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import com.bytedance.ies.ugc.p694a.C11016e;
import com.bytedance.retrofit2.C12799u;
import com.bytedance.retrofit2.p830a.C12686c;
import com.p683ss.android.ugc.aweme.framework.services.IUserService;
import com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.C35818c.C35819a;
import com.p683ss.android.ugc.aweme.lancet.ssretrofitchain.C35823f.C35824a;
import com.p683ss.android.ugc.aweme.login.p1932ui.C36325a;
import com.p683ss.android.ugc.aweme.login.p1932ui.C36325a.C36326a;
import com.p683ss.android.ugc.aweme.login.p1932ui.LogoutDialogActivity;
import com.p683ss.android.ugc.aweme.services.BaseUserService;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.lancet.ssretrofitchain.d */
public final class C35820d extends C35818c {
    public C35820d(C35818c cVar) {
        C52711k.m112240b(cVar, "next");
        super(cVar);
    }

    /* access modifiers changed from: protected */
    /* renamed from: a */
    public final C35819a mo74476a(C35823f fVar, C12686c cVar, C12799u<?> uVar) {
        if (fVar != null) {
            C35824a aVar = fVar.f91996a;
            if (aVar != null && aVar.f91998a == 8) {
                C36325a a = C36326a.m81962a();
                try {
                    if (a.f92957a.compareAndSet(false, true)) {
                        Activity g = C11016e.m22312g();
                        IUserService baseUserService_Monster = BaseUserService.getBaseUserService_Monster();
                        if (g == null || baseUserService_Monster == null || !baseUserService_Monster.isLogin()) {
                            a.mo75220a();
                        } else {
                            C36325a.m81959a(cVar);
                            C36325a.m81960b(cVar);
                            Context context = g;
                            C52711k.m112240b(context, "context");
                            context.startActivity(new Intent(context, LogoutDialogActivity.class));
                        }
                    }
                } catch (Exception unused) {
                }
                return new C35819a(true, false);
            }
        }
        C35819a aVar2 = C35817b.f91989a;
        C52711k.m112236a((Object) aVar2, "ChainManager.IGNORE_RESULT");
        return aVar2;
    }
}
