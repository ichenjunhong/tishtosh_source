package com.bytedance.android.livesdk.gift.p356d;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.bytedance.android.live.core.p230g.C3922z;
import com.bytedance.android.live.p245d.C4116c;
import com.bytedance.android.live.user.C4282a;
import com.bytedance.android.livesdk.gift.C7654y;
import com.bytedance.android.livesdk.gift.model.p379a.C7491b;
import com.bytedance.android.livesdk.gift.model.p379a.C7499j;
import com.ss.android.ugc.trill.R;
import java.util.List;

/* renamed from: com.bytedance.android.livesdk.gift.d.i */
public final class C7242i extends C7230b<C7499j> {

    /* renamed from: n */
    private final TextView f19653n;

    public C7242i(View view) {
        super(view);
        this.f19653n = (TextView) view.findViewById(R.id.d_w);
    }

    /* access modifiers changed from: private */
    /* renamed from: a */
    public void mo13464a(C7499j jVar) {
        long j;
        super.mo13464a(jVar);
        if (((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            j = C7654y.m15668a().mo14018b();
        } else {
            j = 0;
        }
        this.f19653n.setText(C3922z.m9905a((int) R.string.ei8, Long.valueOf(j)));
        this.f19653n.setVisibility(0);
        this.f19624c.setVisibility(8);
        this.f19634i.setVisibility(4);
        if (j <= 0) {
            jVar.f20514b = false;
            this.f19633h.setAlpha(0.32f);
            this.f19625d.setBackgroundResource(0);
        }
    }

    /* renamed from: a */
    public final /* synthetic */ void mo13466a(C7491b bVar, List list) {
        long j;
        C7499j jVar = (C7499j) bVar;
        Bundle bundle = (Bundle) list.get(0);
        if (((C4282a) C4116c.m10249a(C4282a.class)).user().mo14532c()) {
            j = C7654y.m15668a().mo14018b();
        } else {
            j = 0;
        }
        for (String str : bundle.keySet()) {
            char c = 65535;
            if (str.hashCode() == 1611446874 && str.equals("key_task_gift_count")) {
                c = 0;
            }
            if (c == 0) {
                this.f19653n.setText(C3922z.m9905a((int) R.string.ei8, Long.valueOf(j)));
                mo13465a(jVar.f20514b);
                if (j <= 0) {
                    jVar.f20514b = false;
                    this.f19633h.setAlpha(0.32f);
                    this.f19625d.setBackgroundResource(0);
                }
            }
        }
    }
}
