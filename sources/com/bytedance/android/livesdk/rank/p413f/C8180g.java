package com.bytedance.android.livesdk.rank.p413f;

import android.view.View;
import android.view.View.OnClickListener;
import com.bytedance.android.livesdk.rank.model.C8219f;

/* renamed from: com.bytedance.android.livesdk.rank.f.g */
final /* synthetic */ class C8180g implements OnClickListener {

    /* renamed from: a */
    private final C8177a f22333a;

    C8180g(C8177a aVar) {
        this.f22333a = aVar;
    }

    public final void onClick(View view) {
        C8177a aVar = this.f22333a;
        if (aVar.f22329p != null && aVar.f22329p.size() >= 3) {
            aVar.mo14353a((C8219f) aVar.f22329p.get(0));
        }
    }
}
