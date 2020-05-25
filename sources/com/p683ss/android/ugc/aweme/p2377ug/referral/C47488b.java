package com.p683ss.android.ugc.aweme.p2377ug.referral;

import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.facebook.common.p920d.C13683f;
import com.p683ss.android.ugc.aweme.base.component.C23505g;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.login.C27965f;
import java.util.concurrent.ExecutionException;

/* renamed from: com.ss.android.ugc.aweme.ug.referral.b */
final /* synthetic */ class C47488b implements OnClickListener {

    /* renamed from: a */
    private final C47486a f119776a;

    C47488b(C47486a aVar) {
        this.f119776a = aVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C47486a aVar = this.f119776a;
        C26890h.m65011a("referral_sign_up_click", C13683f.m27638of("referral_code", aVar.f119766b, "invite_user_id", aVar.f119765a));
        aVar.dismiss();
        C27965f.m66722a(aVar.f119767c, "", "creator_referral", (C23505g) new C23505g() {
            /* renamed from: a */
            public final void mo46280a(Bundle bundle) {
            }

            /* renamed from: a */
            public final void mo46279a() {
                try {
                    ((RealApi) ReferCommitApi.f119763a.create(RealApi.class)).referralCommit(C47486a.this.f119766b).get();
                } catch (ExecutionException e) {
                    throw ReferCommitApi.f119764b.propagateCompatibleException(e);
                } catch (Exception unused) {
                }
            }
        });
    }
}
