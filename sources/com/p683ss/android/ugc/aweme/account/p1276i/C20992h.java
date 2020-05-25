package com.p683ss.android.ugc.aweme.account.p1276i;

import com.bytedance.lobby.C12322b;
import com.bytedance.lobby.auth.AuthResult;
import com.p683ss.android.ugc.aweme.account.login.C21355h;
import com.p683ss.android.ugc.aweme.account.login.authorize.platforms.C21087a;
import com.p683ss.android.ugc.aweme.account.login.authorize.platforms.C21087a.C21089a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.i.h */
public final class C20992h implements C20987e {
    /* renamed from: a */
    public final void mo44980a(AuthResult authResult) {
        if (authResult != null) {
            int i = 0;
            String str = null;
            C12322b bVar = authResult.f32455c;
            if (bVar != null) {
                C52711k.m112236a((Object) bVar, "this");
                i = bVar.getErrorCode();
                str = bVar.getMessage();
            }
            if (authResult.f32453a) {
                C21087a.m53561a(C21089a.SUCCESS, "", "vk");
            } else if (authResult.f32454b) {
                C22093d.f59607b.mo46195a(2, "vk", i, str);
                C21087a.m53561a(C21089a.CANCEL, "", "vk");
            } else {
                C22093d.f59607b.mo46195a(1, "vk", i, str);
                C21355h.m53978a(str, "vk");
                C21087a.m53561a(C21089a.FAILURE, "", "vk");
            }
        }
    }
}
