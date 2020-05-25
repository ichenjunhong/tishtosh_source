package com.bytedance.android.livesdk.feed.drawerfeed;

import android.arch.lifecycle.C0199s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import com.bytedance.android.livesdk.feed.p341i.C6959a;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.p */
final /* synthetic */ class C6897p implements C0199s {

    /* renamed from: a */
    private final C6890l f18891a;

    C6897p(C6890l lVar) {
        this.f18891a = lVar;
    }

    public final void onChanged(Object obj) {
        C6890l lVar = this.f18891a;
        Integer num = (Integer) obj;
        if (num != null) {
            C1352v f = lVar.f18921q.mo4847f(num.intValue());
            if (f instanceof C6959a) {
                lVar.f18921q.postDelayed(new C6896o(lVar, f), 500);
            }
        }
    }
}
