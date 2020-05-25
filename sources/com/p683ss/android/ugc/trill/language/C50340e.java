package com.p683ss.android.ugc.trill.language;

import android.content.DialogInterface;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.bytedance.ies.dmt.p664ui.p666b.C10641a.C10643a;
import com.p683ss.android.ugc.aweme.setting.serverpush.p2145a.C41684a;
import com.ss.android.ugc.trill.R;

/* renamed from: com.ss.android.ugc.trill.language.e */
final /* synthetic */ class C50340e implements OnClickListener {

    /* renamed from: a */
    private final C50337c f126238a;

    /* renamed from: b */
    private final C41684a f126239b;

    /* renamed from: c */
    private final int f126240c;

    C50340e(C50337c cVar, C41684a aVar, int i) {
        this.f126238a = cVar;
        this.f126239b = aVar;
        this.f126240c = i;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C50337c cVar = this.f126238a;
        C41684a aVar = this.f126239b;
        int i = this.f126240c;
        if (aVar != null) {
            C10643a aVar2 = new C10643a(cVar.f126233b);
            aVar2.mo18902b(cVar.f126233b.getString(R.string.d6m, new Object[]{aVar.getLocalName()}));
            C50341f fVar = new C50341f(cVar, aVar);
            aVar2.mo18903b(cVar.f126233b.getString(R.string.wf), (DialogInterface.OnClickListener) fVar);
            aVar2.mo18893a(cVar.f126233b.getString(R.string.d6l), (DialogInterface.OnClickListener) fVar);
            aVar2.mo18897a().mo18882b().setCancelable(false);
        }
    }
}
