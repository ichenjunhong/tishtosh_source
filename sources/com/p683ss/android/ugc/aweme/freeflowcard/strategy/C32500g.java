package com.p683ss.android.ugc.aweme.freeflowcard.strategy;

import com.google.p1057b.p1065h.p1066a.C17824h;
import com.google.p1057b.p1065h.p1066a.C17825i;
import com.p683ss.android.ugc.aweme.IAccountUserService;
import com.p683ss.android.ugc.aweme.account.C20902b;
import com.p683ss.android.ugc.aweme.app.AwemeApplication;
import com.p683ss.android.ugc.aweme.base.api.BaseResponse;
import com.p683ss.android.ugc.aweme.base.utils.C23718g;
import com.p683ss.android.ugc.aweme.base.utils.C23726m;
import com.p683ss.android.ugc.aweme.freeflowcard.data.FreeflowNoticeApi.C32473a;
import p001a.C0013i;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.freeflowcard.strategy.g */
public final class C32500g extends C32497f {

    /* renamed from: b */
    public static final C32500g f84601b = new C32500g();

    /* renamed from: com.ss.android.ugc.aweme.freeflowcard.strategy.g$a */
    public static final class C32501a implements C17824h<BaseResponse> {
        C32501a() {
        }

        public final void onFailure(Throwable th) {
            C52711k.m112240b(th, "t");
        }

        public final /* bridge */ /* synthetic */ void onSuccess(Object obj) {
        }
    }

    private C32500g() {
    }

    /* renamed from: b */
    public final boolean mo65808b() {
        C23718g b = C23718g.m58207b();
        C52711k.m112236a((Object) b, "NetworkStateManager.getInstance()");
        return b.mo49152c();
    }

    /* renamed from: a */
    public final boolean mo65807a(boolean z) {
        if (!super.mo65807a(z)) {
            IAccountUserService a = C20902b.m53242a();
            C52711k.m112236a((Object) a, "AccountUserProxyService.get()");
            if (a.isLogin()) {
                StringBuilder sb = new StringBuilder();
                sb.append(String.valueOf(C23726m.m58234a(AwemeApplication.m56199a())));
                C17825i.m43740a(C32473a.m75187a(sb.toString()), new C32501a(), C0013i.f25b);
            }
        }
        return true;
    }
}
