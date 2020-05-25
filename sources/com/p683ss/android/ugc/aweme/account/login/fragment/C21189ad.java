package com.p683ss.android.ugc.aweme.account.login.fragment;

import android.content.Context;
import android.text.TextUtils;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p668d.C10691a;
import com.bytedance.sdk.account.p844a.p845a.C12990b;
import com.bytedance.sdk.account.p844a.p846b.C13005f;
import com.bytedance.sdk.account.p844a.p848d.C13019h;
import com.p683ss.android.ugc.aweme.C23826bi;
import com.p683ss.android.ugc.aweme.account.login.MusLoginManager;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.account.login.fragment.ad */
final /* synthetic */ class C21189ad implements OnClickListener {

    /* renamed from: a */
    private final C21176ac f57566a;

    C21189ad(C21176ac acVar) {
        this.f57566a = acVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C21176ac acVar = this.f57566a;
        if (!TextUtils.equals(acVar.f57544q.getText().toString(), acVar.f57546s.getText().toString())) {
            acVar.mo45336c(true);
            acVar.f57550w.setText(acVar.getResources().getString(R.string.ccx));
            return;
        }
        acVar.f57548u.mo45161c();
        MusLoginManager f = acVar.mo45328f();
        String obj = acVar.f57542o.getText().toString();
        String obj2 = acVar.f57544q.getText().toString();
        String str = acVar.f57551x;
        f.f57210b.mo24618a(obj, obj2, (C13005f) new C13005f() {
            public final /* synthetic */ void onSuccess(C12990b bVar) {
                C13019h hVar = (C13019h) bVar;
                if (C21176ac.this.isViewValid() && C21176ac.this.getContext() != null) {
                    C21176ac.this.f57548u.mo45160a();
                    C21176ac acVar = C21176ac.this;
                    acVar.mo45336c(false);
                    if (acVar.getContext() != null) {
                        C10691a.m21538a((Context) C23826bi.m58460b(), acVar.getString(R.string.cbe), 0).mo19066a();
                    }
                    if (acVar.getActivity() != null) {
                        acVar.getActivity().finish();
                    }
                }
            }

            public final /* synthetic */ void onError(C12990b bVar, int i) {
                C13019h hVar = (C13019h) bVar;
                if (C21176ac.this.isViewValid() && C21176ac.this.getContext() != null) {
                    C21176ac.this.f57548u.mo45160a();
                    if (i > 0) {
                        C21176ac.this.mo45335a(hVar);
                    } else {
                        C21176ac.this.f57548u.clearAnimation();
                    }
                }
            }
        });
    }
}
