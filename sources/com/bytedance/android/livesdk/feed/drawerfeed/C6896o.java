package com.bytedance.android.livesdk.feed.drawerfeed;

import android.support.p043v7.widget.RecyclerView.C1352v;
import com.bytedance.android.livesdk.feed.p341i.C6959a;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.o */
final /* synthetic */ class C6896o implements Runnable {

    /* renamed from: a */
    private final C6890l f18889a;

    /* renamed from: b */
    private final C1352v f18890b;

    C6896o(C6890l lVar, C1352v vVar) {
        this.f18889a = lVar;
        this.f18890b = vVar;
    }

    public final void run() {
        C6890l lVar = this.f18889a;
        C1352v vVar = this.f18890b;
        if (lVar.getUserVisibleHint() && lVar.isResumed()) {
            ((C6959a) vVar).mo13152f();
        }
    }
}
