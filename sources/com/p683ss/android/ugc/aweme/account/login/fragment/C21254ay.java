package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p845a.C12993e;
import com.bytedance.sdk.account.p861f.p862a.C13120s;
import com.bytedance.sdk.account.p861f.p863b.p864a.C13139p;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.C22165u;
import com.p683ss.android.ugc.aweme.account.login.p1282b.C21095ad;
import com.p683ss.android.ugc.aweme.account.util.C22284v;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.ay */
final /* synthetic */ class C21254ay implements OnClickListener {

    /* renamed from: a */
    private final C21227aw f57724a;

    C21254ay(C21227aw awVar) {
        this.f57724a = awVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C21227aw awVar = this.f57724a;
        if (awVar.f57670I || awVar.f57697y.getRemainTick() <= 0) {
            if (awVar.f57697y.getRemainTick() <= 0) {
                awVar.f57697y.mo45750a();
            }
            awVar.f57669H = awVar.f57665D ? C22165u.f59761a : C22165u.f59781u;
            awVar.f57671J.mo24642b(awVar.mo45384l(), "", awVar.f57669H, (C13139p) new C21095ad(awVar) {
                /* renamed from: a */
                public final void mo45149a(C12993e<C13120s> eVar) {
                }

                public final /* synthetic */ void onNeedSecureCaptcha(C12990b bVar) {
                    super.onNeedSecureCaptcha((C12993e) bVar);
                    if (C21227aw.this.isViewValid()) {
                        C21227aw.this.mo45383k();
                    }
                }

                public final void onSuccess(C12993e<C13120s> eVar) {
                    if (C21227aw.this.isViewValid() && C21227aw.this.getActivity() != null) {
                        C22284v.m55156a(C21227aw.this.getActivity()).mo20135a((int) R.string.cob).mo20144b((int) R.string.coc).mo20145b((int) R.string.bdf, (DialogInterface.OnClickListener) null).mo20141a(false).mo20148b();
                    }
                }
            });
            awVar.f57670I = false;
            return;
        }
        C10691a.m21545b((Context) C23826bi.m58460b(), awVar.getResources().getString(R.string.fd1)).mo19066a();
    }
}
