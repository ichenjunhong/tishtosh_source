package com.bytedance.android.livesdk.rank.p413f;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.rank.model.C8219f;

/* renamed from: com.bytedance.android.livesdk.rank.f.h */
final /* synthetic */ class C8181h implements OnClickListener {

    /* renamed from: a */
    private final C8177a f22334a;

    C8181h(C8177a aVar) {
        this.f22334a = aVar;
    }

    public final void onClick(View view) {
        C8177a aVar = this.f22334a;
        if (aVar.f22329p != null && aVar.f22329p.size() >= 3) {
            aVar.mo14353a((C8219f) aVar.f22329p.get(1));
        }
    }
}
