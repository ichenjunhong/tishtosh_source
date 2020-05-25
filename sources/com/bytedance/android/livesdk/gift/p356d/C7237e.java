package com.bytedance.android.livesdk.gift.p356d;

import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.livesdk.gift.combo.ComboTarget;
import com.bytedance.android.livesdk.gift.model.C7506e;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.model.p379a.C7494e;
import com.ss.android.ugc.trill.R;

/* renamed from: com.bytedance.android.livesdk.gift.d.e */
public final class C7237e extends C7232c<C7494e> {

    /* renamed from: a */
    TextView f19644a;

    /* renamed from: a */
    public final ComboTarget mo13462a() {
        return null;
    }

    public C7237e(View view) {
        super(view);
        this.f19644a = (TextView) view.findViewById(R.id.d_w);
    }

    /* renamed from: a */
    public final /* synthetic */ void mo13464a(C7491b bVar) {
        C7494e eVar = (C7494e) bVar;
        super.mo13464a(eVar);
        if (eVar == null || eVar.f20516d == null || ((C7506e) eVar.f20516d).f20567b <= 0) {
            this.f19644a.setVisibility(0);
        } else {
            this.f19644a.setVisibility(0);
            this.f19644a.setText(C3922z.m9905a((int) R.string.ei8, Integer.valueOf(((C7506e) eVar.f20516d).f20567b)));
        }
        if (eVar != null) {
            this.f19634i.setText(eVar.mo13915l());
        }
        this.f19634i.setTextColor(C3922z.m9909b((int) R.color.ac5));
        this.f19635j.setVisibility(8);
    }
}
