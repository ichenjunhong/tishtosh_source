package com.p683ss.android.ugc.aweme.profile.p2090ui.widget;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.p1140c.C18845b;
import com.p683ss.android.ugc.aweme.app.p1376f.C23089d;
import com.p683ss.android.ugc.aweme.common.C26890h;
import com.p683ss.android.ugc.aweme.profile.api.RemarkApi;
import com.p683ss.android.ugc.aweme.services.RetrofitService;
import p001a.C0011g;
import p001a.C0013i;

/* renamed from: com.ss.android.ugc.aweme.profile.ui.widget.r */
final /* synthetic */ class C40457r implements OnClickListener {

    /* renamed from: a */
    private final C40454p f103294a;

    C40457r(C40454p pVar) {
        this.f103294a = pVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C40454p pVar = this.f103294a;
        if (pVar.f103287h == 1) {
            C26890h.m65011a("remark_toast", C23089d.m56640a().mo47829a("action_type", "confirm").f61491a);
        }
        String obj = pVar.f103281b.getText().toString();
        if (!(pVar.f103285f == null || pVar.f103280a == null)) {
            ((RemarkApi) RetrofitService.createIRetrofitServicebyMonsterPlugin().createNewRetrofit(C18845b.f52040e).create(RemarkApi.class)).commitRemarkName(obj, pVar.f103285f.getUid(), pVar.f103285f.getSecUid()).mo20a((C0011g<TResult, TContinuationResult>) new C40460u<TResult,TContinuationResult>(pVar, obj), C0013i.f25b);
        }
        pVar.dismiss();
    }
}
