package com.p683ss.android.ugc.aweme.effect;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.aweme.effect.C29089aa.C29091b;

/* renamed from: com.ss.android.ugc.aweme.effect.ac */
final /* synthetic */ class C29093ac implements OnClickListener {

    /* renamed from: a */
    private final C29091b f76263a;

    C29093ac(C29091b bVar) {
        this.f76263a = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C29091b bVar = this.f76263a;
        int adapterPosition = bVar.getAdapterPosition();
        if (-1 != adapterPosition) {
            C29089aa.this.f76255a.mo58936a(5, adapterPosition, (EffectModel) C29089aa.this.f76253c.get(adapterPosition));
        }
    }
}
