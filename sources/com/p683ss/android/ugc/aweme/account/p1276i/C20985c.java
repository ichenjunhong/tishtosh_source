package com.p683ss.android.ugc.aweme.account.p1276i;

import android.util.Log;
import com.bytedance.lobby.C12322b;
import com.bytedance.lobby.auth.AuthResult;
import com.p683ss.android.ugc.aweme.account.login.C21355h;
import com.p683ss.android.ugc.aweme.account.login.authorize.platforms.C21087a;
import com.p683ss.android.ugc.aweme.account.login.authorize.platforms.C21087a.C21089a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.i.c */
public final class C20985c implements C20987e {
    /* renamed from: a */
    public final void mo44980a(AuthResult authResult) {
        int i;
        String str;
        if (authResult != null) {
            C12322b bVar = authResult.f32455c;
            if (bVar != null) {
                C52711k.m112236a((Object) bVar, "this");
                i = bVar.getErrorCode();
                str = bVar.getMessage();
            } else {
                str = null;
                i = 0;
            }
            if (authResult.f32453a) {
                C21087a.m53561a(C21089a.SUCCESS, null, "kakaotalk");
            } else if (authResult.f32454b) {
                StringBuilder sb = new StringBuilder();
                sb.append(str);
                sb.append(" | ");
                sb.append(Log.getStackTraceString(authResult.f32455c));
                String sb2 = sb.toString();
                C52711k.m112236a((Object) sb2, "StringBuilder()\n        …              .toString()");
                C21087a.m53561a(C21089a.CANCEL, sb2, "kakaotalk");
                C22093d.f59607b.mo46195a(2, "kakaotalk", 0, "");
            } else {
                C22093d.f59607b.mo46195a(1, "kakaotalk", i, str);
                C21355h.m53977a(i, str, "kakaotalk");
                StringBuilder sb3 = new StringBuilder("Error code = ");
                sb3.append(i);
                sb3.append(", desc = ");
                sb3.append(str);
                String sb4 = sb3.toString();
                C52711k.m112236a((Object) sb4, "StringBuilder()\n        …              .toString()");
                C21087a.m53561a(C21089a.FAILURE, sb4, "kakaotalk");
            }
        }
    }
}
