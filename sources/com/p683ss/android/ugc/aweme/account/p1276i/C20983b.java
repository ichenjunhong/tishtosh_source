package com.p683ss.android.ugc.aweme.account.p1276i;

import com.bytedance.lobby.C12322b;
import com.bytedance.lobby.auth.AuthResult;
import com.p683ss.android.ugc.aweme.account.login.C21355h;
import com.p683ss.android.ugc.aweme.account.login.authorize.platforms.C21087a;
import com.p683ss.android.ugc.aweme.account.login.authorize.platforms.C21087a.C21089a;
import com.p683ss.android.ugc.aweme.account.p1302o.C22093d;
import java.util.List;
import p2628d.p2629a.C52575l;
import p2628d.p2639f.p2641b.C52707g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.i.b */
public final class C20983b implements C20987e {

    /* renamed from: a */
    public static final List<Integer> f57094a = C52575l.m112099b((Object[]) new Integer[]{Integer.valueOf(7), Integer.valueOf(8), Integer.valueOf(16), Integer.valueOf(12501), Integer.valueOf(12502)});

    /* renamed from: b */
    public static final C20984a f57095b = new C20984a(null);

    /* renamed from: com.ss.android.ugc.aweme.account.i.b$a */
    static final class C20984a {
        private C20984a() {
        }

        public /* synthetic */ C20984a(C52707g gVar) {
            this();
        }
    }

    /* renamed from: a */
    public final void mo44980a(AuthResult authResult) {
        if (authResult != null) {
            String str = null;
            if (authResult.f32453a) {
                C21087a.m53561a(C21089a.SUCCESS, null, "google");
                return;
            }
            int i = 0;
            C12322b bVar = authResult.f32455c;
            if (bVar != null) {
                C52711k.m112236a((Object) bVar, "this");
                i = bVar.getProviderErrorCode();
                bVar.getErrorCode();
                str = bVar.getMessage();
            }
            if (authResult.f32454b || f57094a.contains(Integer.valueOf(i))) {
                C22093d.f59607b.mo46195a(2, "google", i, str);
                return;
            }
            C21355h.m53977a(i, str, "google");
            C22093d.f59607b.mo46195a(1, "google", i, str);
            C21089a aVar = C21089a.FAILURE;
            StringBuilder sb = new StringBuilder("googleErrorCode: ");
            sb.append(i);
            sb.append(", errorDesc: ");
            sb.append(str);
            C21087a.m53561a(aVar, sb.toString(), "google");
        }
    }
}
