package com.p683ss.android.ugc.aweme.effect;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;
import com.p683ss.android.ugc.tools.utils.C50200d;

/* renamed from: com.ss.android.ugc.aweme.effect.bo */
final /* synthetic */ class C29157bo implements OnClickListener {

    /* renamed from: a */
    private final C29156b f76412a;

    C29157bo(C29156b bVar) {
        this.f76412a = bVar;
    }

    public final void onClick(View view) {
        int i;
        ClickInstrumentation.onClick(view);
        C29156b bVar = this.f76412a;
        int adapterPosition = bVar.getAdapterPosition();
        if (adapterPosition != -1) {
            if (C29154bn.this.f76406b == adapterPosition) {
                C29154bn.this.f76406b = -1;
                i = 2;
            } else {
                if (C50200d.m108346a(((EffectModel) C29154bn.this.f76253c.get(adapterPosition)).resDir)) {
                    C29154bn.this.f76406b = adapterPosition;
                } else {
                    C29154bn.this.f76406b = -1;
                }
                i = 1;
            }
            if (C29154bn.this.f76405a != null) {
                C29154bn.this.f76405a.mo59026a((EffectModel) C29154bn.this.f76253c.get(bVar.getAdapterPosition()), i, adapterPosition);
            }
            C29154bn.this.notifyDataSetChanged();
        }
    }
}
