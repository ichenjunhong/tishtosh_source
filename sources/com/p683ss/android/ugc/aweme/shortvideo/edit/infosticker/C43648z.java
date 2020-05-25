package com.p683ss.android.ugc.aweme.shortvideo.edit.infosticker;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import dmt.p2652av.video.C53030y;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.edit.infosticker.z */
final /* synthetic */ class C43648z implements OnClickListener {

    /* renamed from: a */
    private final C43535i f110549a;

    C43648z(C43535i iVar) {
        this.f110549a = iVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C43535i iVar = this.f110549a;
        iVar.f110162e.setVisibility(8);
        iVar.f110168k.mo88489a().setValue(C53030y.m112772a());
    }
}
