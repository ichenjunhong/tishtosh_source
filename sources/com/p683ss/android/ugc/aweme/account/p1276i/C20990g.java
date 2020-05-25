package com.p683ss.android.ugc.aweme.account.p1276i;

import com.bytedance.lobby.C12322b;
import com.bytedance.lobby.auth.AuthResult;
import com.p683ss.android.ugc.aweme.account.login.C21355h;
import com.p683ss.android.ugc.aweme.account.login.authorize.platforms.C21087a;
import com.p683ss.android.ugc.aweme.account.login.authorize.platforms.C21087a.C21089a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import p2628d.p2629a.C52568f;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.i.g */
public final class C20990g implements C20987e {

    /* renamed from: a */
    public static final String[] f57099a = {"Authorize failed.", "Authorization failed, request was canceled.", "Failed to get authorization, bundle incomplete"};

    /* renamed from: b */
    public static final C20991a f57100b = new C20991a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.i.g$a */
    static final class C20991a {
        private C20991a() {
        }

        public /* synthetic */ C20991a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo44980a(AuthResult authResult) {
        int i;
        String str;
        if (authResult != null) {
            if (authResult.f32453a) {
                C21087a.m53561a(C21089a.SUCCESS, null, "twitter");
                return;
            }
            C12322b bVar = authResult.f32455c;
            if (bVar != null) {
                C52711k.m112236a((Object) bVar, "this");
                i = bVar.getErrorCode();
                str = bVar.getMessage();
            } else {
                str = null;
                i = 0;
            }
            if (C52568f.m112077a((Object[]) f57099a, (Object) str)) {
                C21087a.m53561a(C21089a.CANCEL, null, "twitter");
                C22093d.f59607b.mo46195a(2, "twitter", i, str);
                return;
            }
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
            C21355h.m53978a(sb2, "twitter");
            C22093d.f59607b.mo46195a(1, "twitter", -10000, sb2);
            C21087a.m53561a(C21089a.FAILURE, sb2, "twitter");
        }
    }
}
