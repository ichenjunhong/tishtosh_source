package com.bytedance.android.livesdk.gift.p356d;

import android.support.constraint.ConstraintLayout.LayoutParams;
import android.view.View;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.model.p379a.C7498i;
import com.bytedance.android.livesdk.p279af.C4577ap;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.d.h */
public final class C7241h extends C7230b<C7498i> {

    /* renamed from: n */
    private final View f19652n;

    /* renamed from: a */
    public final ComboTarget mo13462a() {
        return null;
    }

    public C7241h(View view) {
        super(view);
        this.f19652n = view.findViewById(R.id.d_w);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo13464a(C7498i iVar) {
        super.mo13464a(iVar);
        this.f19631f.setText(iVar.mo13915l());
        this.f19652n.setVisibility(8);
        this.f19634i.setVisibility(8);
        this.f19635j.setVisibility(8);
        if (this.f19631f.getLayoutParams() instanceof LayoutParams) {
            LayoutParams layoutParams = (LayoutParams) this.f19631f.getLayoutParams();
            layoutParams.bottomMargin = (int) C4577ap.m10990a(this.f19630e, 5.0f);
            this.f19631f.setLayoutParams(layoutParams);
        }
    }
}
