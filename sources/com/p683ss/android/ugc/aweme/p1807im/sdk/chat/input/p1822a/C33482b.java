package com.p683ss.android.ugc.aweme.p1807im.sdk.chat.input.p1822a;

import android.support.p043v7.widget.RecyclerView.C1352v;
import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.im.sdk.chat.input.a.b */
final /* synthetic */ class C33482b implements OnClickListener {

    /* renamed from: a */
    private final C33476a f86765a;

    /* renamed from: b */
    private final C1352v f86766b;

    C33482b(C33476a aVar, C1352v vVar) {
        this.f86765a = aVar;
        this.f86766b = vVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C33476a aVar = this.f86765a;
        C1352v vVar = this.f86766b;
        if (aVar.f86759f != null) {
            aVar.f86759f.mo70897a(vVar.getAdapterPosition());
        }
    }
}
