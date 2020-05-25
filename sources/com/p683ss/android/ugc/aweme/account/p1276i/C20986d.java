package com.p683ss.android.ugc.aweme.account.p1276i;

import android.text.TextUtils;
import com.bytedance.lobby.C12322b;
import com.bytedance.lobby.auth.AuthResult;
import com.p683ss.android.ugc.aweme.account.login.C21355h;
import com.p683ss.android.ugc.aweme.account.login.authorize.platforms.C21087a;
import com.p683ss.android.ugc.aweme.account.login.authorize.platforms.C21087a.C21089a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.i.d */
public final class C20986d implements C20987e {
    /* renamed from: a */
    public final void mo44980a(AuthResult authResult) {
        int i;
        String str;
        if (authResult != null) {
            if (!authResult.f32453a) {
                C12322b bVar = authResult.f32455c;
                if (bVar != null) {
                    C52711k.m112236a((Object) bVar, "this");
                    i = bVar.getErrorCode();
                    str = bVar.getMessage();
                } else {
                    str = null;
                    i = 0;
                }
                if (authResult.f32454b) {
                    C21087a.m53561a(C21089a.CANCEL, null, "line");
                    C22093d.f59607b.mo46195a(2, "line", i, str);
                    return;
                }
                int i2 = authResult.f32462j.getInt("line_response_ordinal", 0);
                C21355h.m53977a(i2, str, "line");
                C21089a aVar = C21089a.FAILURE;
                StringBuilder sb = new StringBuilder("Internal error {code = ");
                sb.append(i2);
                sb.append(", desc = ");
                sb.append(str);
                sb.append('}');
                C21087a.m53561a(aVar, sb.toString(), "line");
                C22093d.f59607b.mo46195a(1, "line", i2, str);
                C21355h.m53977a(i2, str, "line");
            } else if (!TextUtils.isEmpty(authResult.f32458f)) {
                C21087a.m53561a(C21089a.SUCCESS, null, "line");
            } else {
                C21087a.m53561a(C21089a.FAILURE, "token = null", "line");
            }
        }
    }
}
