package com.p683ss.android.ugc.aweme.account.login.authorize;

import android.content.Intent;
import android.text.TextUtils;
import com.bytedance.lobby.auth.AuthResult;
import com.p683ss.android.ugc.aweme.C22475af;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.agegate.C20860a;
import com.p683ss.android.ugc.aweme.account.agegate.C20884b;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.base.C21850i;
import com.p683ss.android.ugc.aweme.account.login.p1292v2.p1295ui.SignUpOrLoginActivity;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21468a;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21468a.C21469a;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21470b;
import com.p683ss.android.ugc.aweme.account.login.termsconstent.C21472c;
import com.p683ss.android.ugc.aweme.account.p1276i.C20989f;
import com.p683ss.android.ugc.aweme.utils.p2388b.C47705a;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.account.login.authorize.g */
final /* synthetic */ class C21082g implements Runnable {

    /* renamed from: a */
    private final AuthorizeActivity f57320a;

    /* renamed from: b */
    private final int f57321b;

    C21082g(AuthorizeActivity authorizeActivity, int i) {
        this.f57320a = authorizeActivity;
        this.f57321b = i;
    }

    public final void run() {
        AuthorizeActivity authorizeActivity = this.f57320a;
        int i = this.f57321b;
        if (!authorizeActivity.mStatusDestroyed) {
            if (i != 0) {
                C20884b bVar = new C20884b();
                AuthResult authResult = authorizeActivity.f57279l;
                bVar.f56855b = new C20860a(authorizeActivity.f57279l, authorizeActivity);
                String d = C20989f.m53355d(authResult);
                int f = ((C22475af) C23826bi.m58450a(C22475af.class)).mo46779f();
                if (f == 0 || (f == 1 && (TextUtils.equals(d, "facebook") || TextUtils.equals(d, "google")))) {
                    if (bVar.f56855b != null) {
                        bVar.f56855b.mo44781a();
                    }
                    return;
                }
                C47705a aVar = new C47705a(authorizeActivity);
                Intent intent = new Intent(authorizeActivity, SignUpOrLoginActivity.class);
                intent.putExtra("enter_type", "click_login");
                intent.putExtra("key_auth_result", authResult);
                intent.putExtra("platform", authResult.f32456d);
                intent.putExtra("is_trans_login_user", false);
                if (f == 1) {
                    intent.putExtra("next_page", C21850i.THIRD_PARTY_FTC_AGE_GATE.getValue());
                } else {
                    intent.putExtra("next_page", C21850i.THIRD_PARTY_AGE_GATE.getValue());
                }
                aVar.mo94988a(intent, 998, bVar);
            } else if (C21472c.m54111a()) {
                C21468a aVar2 = new C21468a();
                AuthResult authResult2 = authorizeActivity.f57279l;
                C21470b bVar2 = new C21470b(authorizeActivity.f57279l, authorizeActivity);
                C52711k.m112240b(authorizeActivity, "activity");
                C52711k.m112240b(authResult2, "authResult");
                C52711k.m112240b(bVar2, "listener");
                aVar2.f58243a = bVar2;
                if (!C21472c.m54111a()) {
                    C21469a aVar3 = aVar2.f58243a;
                    if (aVar3 != null) {
                        aVar3.mo45651a();
                    }
                } else {
                    C47705a aVar4 = new C47705a(authorizeActivity);
                    Intent intent2 = new Intent(authorizeActivity, SignUpOrLoginActivity.class);
                    intent2.putExtra("enter_type", "click_login");
                    intent2.putExtra("next_page", C21850i.TERMS_CONSENT_SIGN_UP_THIRD_PARTY.getValue());
                    intent2.putExtra("key_auth_result", authResult2);
                    aVar4.mo94988a(intent2, 10086, aVar2);
                }
            } else {
                authorizeActivity.mo45116a(authorizeActivity.f57279l, false);
            }
        }
    }
}
