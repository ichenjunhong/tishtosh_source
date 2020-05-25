package com.p683ss.android.ugc.aweme.account.p1276i;

import com.bytedance.lobby.C12322b;
import com.bytedance.lobby.auth.AuthResult;
import com.p683ss.android.ugc.aweme.account.login.C21355h;
import com.p683ss.android.ugc.aweme.account.login.authorize.platforms.C21087a;
import com.p683ss.android.ugc.aweme.account.login.authorize.platforms.C21087a.C21089a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import com.p683ss.android.ugc.aweme.framework.p1780a.C32458a;
import com.p683ss.android.ugc.trill.p2516b.p2517a.C50310a;
import p2628d.p2639f.p2641b.C52711k;
import p2628d.p2650m.C52830p;

/* renamed from: com.ss.android.ugc.aweme.account.i.a */
public final class C20982a implements C20987e {
    /* renamed from: a */
    public final void mo44980a(AuthResult authResult) {
        String str;
        int i;
        int i2;
        if (authResult != null) {
            if (authResult.f32453a) {
                C50310a.m108576a(authResult.f32458f, authResult.f32460h);
                C21087a.m53561a(C21089a.SUCCESS, null, "facebook");
                return;
            }
            String str2 = "";
            C12322b bVar = authResult.f32455c;
            boolean z = false;
            if (bVar != null) {
                C52711k.m112236a((Object) bVar, "this");
                i = bVar.getErrorCode();
                str = bVar.getMessage();
            } else {
                str = str2;
                i = 0;
            }
            if (authResult.f32454b) {
                C21087a.m53561a(C21089a.CANCEL, null, "facebook");
                C22093d.f59607b.mo46195a(2, "facebook", i, str);
                return;
            }
            C32458a.m75148a((Throwable) authResult.f32455c);
            StringBuilder sb = new StringBuilder();
            sb.append(str);
            sb.append(" | ");
            C12322b bVar2 = authResult.f32455c;
            if (!(bVar2 == null || bVar2.getStackTrace() == null)) {
                C12322b bVar3 = authResult.f32455c;
                if (bVar3 == null) {
                    C52711k.m112234a();
                }
                C52711k.m112236a((Object) bVar3, "authResult.errorCause!!");
                for (StackTraceElement stackTraceElement : bVar3.getStackTrace()) {
                    sb.append(stackTraceElement.toString());
                }
            }
            String sb2 = sb.toString();
            C52711k.m112236a((Object) sb2, "builder.toString()");
            CharSequence charSequence = str;
            if (charSequence == null || charSequence.length() == 0) {
                z = true;
            }
            if (!z) {
                if (str == null) {
                    C52711k.m112234a();
                }
                if (C52830p.m112455b(charSequence, (CharSequence) "connection", true)) {
                    i2 = -10002;
                    C21355h.m53978a(sb2, "facebook");
                    C22093d.f59607b.mo46195a(1, "facebook", i2, sb2);
                    C21087a.m53561a(C21089a.FAILURE, sb2, "facebook");
                }
            }
            i2 = -10000;
            C21355h.m53978a(sb2, "facebook");
            C22093d.f59607b.mo46195a(1, "facebook", i2, sb2);
            C21087a.m53561a(C21089a.FAILURE, sb2, "facebook");
        }
    }
}
