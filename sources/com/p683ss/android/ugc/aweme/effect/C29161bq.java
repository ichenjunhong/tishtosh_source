package com.p683ss.android.ugc.aweme.effect;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.apm.agent.instrumentation.ClickInstrumentation;

/* renamed from: com.ss.android.ugc.aweme.effect.bq */
final /* synthetic */ class C29161bq implements OnClickListener {

    /* renamed from: a */
    private final C29160b f76420a;

    C29161bq(C29160b bVar) {
        this.f76420a = bVar;
    }

    public final void onClick(View view) {
        ClickInstrumentation.onClick(view);
        C29160b bVar = this.f76420a;
        int adapterPosition = bVar.getAdapterPosition();
        if (adapterPosition != -1 && ((EffectModel) C29158bp.this.f76413a.get(adapterPosition)).isEnabled) {
            boolean z = false;
            if (C29158bp.this.f76414b != null) {
                z = C29158bp.this.f76414b.mo59034a(adapterPosition);
            }
            if (z) {
                C29158bp.this.f76415c = adapterPosition;
                C29158bp.this.notifyDataSetChanged();
            }
        }
    }
}
