package com.p683ss.android.ugc.aweme.effect;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import dmt.p2652av.video.C53026u;

/* renamed from: com.ss.android.ugc.aweme.effect.au */
final /* synthetic */ class C29119au implements OnClickListener {

    /* renamed from: a */
    private final C29094ad f76347a;

    C29119au(C29094ad adVar) {
        this.f76347a = adVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C29094ad adVar = this.f76347a;
        C53026u uVar = (C53026u) adVar.f76296c.getValue();
        if (uVar == null || uVar.f131492f != 0) {
            adVar.f76308o.setCurrentItem(((Integer) view.getTag()).intValue());
        }
    }
}
