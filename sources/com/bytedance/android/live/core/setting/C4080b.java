package com.bytedance.android.live.core.setting;

import android.view.View;
import android.view.View.OnClickListener;
import p064c.p065a.p072e.p087j.C2131h;

/* renamed from: com.bytedance.android.live.core.setting.b */
final /* synthetic */ class C4080b implements OnClickListener {

    /* renamed from: a */
    private final C4078a f11236a;

    C4080b(C4078a aVar) {
        this.f11236a = aVar;
    }

    public final void onClick(View view) {
        C4078a aVar = this.f11236a;
        C4098q.m10219a(aVar.f11231b, "");
        try {
            aVar.f11233d.accept(Integer.valueOf(aVar.f11232c));
            aVar.dismiss();
        } catch (Throwable th) {
            throw C2131h.m6422a(th);
        }
    }
}
