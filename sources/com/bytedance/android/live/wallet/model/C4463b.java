package com.bytedance.android.live.wallet.model;

import android.view.View;
import android.view.View.OnClickListener;

/* renamed from: com.bytedance.android.live.wallet.model.b */
final /* synthetic */ class C4463b implements OnClickListener {

    /* renamed from: a */
    private final C4461a f12188a;

    C4463b(C4461a aVar) {
        this.f12188a = aVar;
    }

    public final void onClick(View view) {
        C4461a aVar = this.f12188a;
        if (aVar.f12187r != null) {
            aVar.f12187r.mo10146a(aVar, aVar.f12177h.isChecked());
        }
    }
}
