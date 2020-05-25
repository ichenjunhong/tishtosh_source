package com.p683ss.android.ugc.aweme.feed.p1736ui;

import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.feed.p1723h.C30332aw;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.aweme.feed.ui.l */
final /* synthetic */ class C31016l implements OnClickListener {

    /* renamed from: a */
    private final C31013k f81216a;

    C31016l(C31013k kVar) {
        this.f81216a = kVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C31013k kVar = this.f81216a;
        C10643a aVar = new C10643a(kVar.f81207d);
        aVar.mo18885a((int) R.string.aob);
        aVar.mo18900b((int) R.string.wf, (DialogInterface.OnClickListener) null).mo18886a((int) R.string.ao9, (DialogInterface.OnClickListener) new DialogInterface.OnClickListener() {
            public final void onClick(DialogInterface dialogInterface, int i) {
                C31013k kVar = C31013k.this;
                if (kVar.f81208e != null) {
                    kVar.f81208e.mo60714a(new C30332aw(2, kVar.f81209f));
                }
                C31013k.this.dismiss();
            }
        }).mo18897a().mo18882b();
    }
}
