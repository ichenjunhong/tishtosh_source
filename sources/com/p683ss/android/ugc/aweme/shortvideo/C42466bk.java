package com.p683ss.android.ugc.aweme.shortvideo;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.shortvideo.bk */
final /* synthetic */ class C42466bk implements OnClickListener {

    /* renamed from: a */
    private final C42464bj f107403a;

    C42466bk(C42464bj bjVar) {
        this.f107403a = bjVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C42464bj bjVar = this.f107403a;
        bjVar.mo86596a(bjVar.f107382d.substring(bjVar.f107382d.lastIndexOf(35) + 1, bjVar.f107382d.length()));
    }
}
