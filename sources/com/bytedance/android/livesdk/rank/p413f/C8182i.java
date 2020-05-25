package com.bytedance.android.livesdk.rank.p413f;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.rank.model.C8219f;

/* renamed from: com.bytedance.android.livesdk.rank.f.i */
final /* synthetic */ class C8182i implements OnClickListener {

    /* renamed from: a */
    private final C8177a f22335a;

    C8182i(C8177a aVar) {
        this.f22335a = aVar;
    }

    public final void onClick(View view) {
        C8177a aVar = this.f22335a;
        if (aVar.f22329p != null && aVar.f22329p.size() >= 3) {
            aVar.mo14353a((C8219f) aVar.f22329p.get(2));
        }
    }
}
