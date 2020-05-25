package com.bytedance.android.livesdk.feed.p338f;

import android.support.p043v7.widget.RecyclerView.C1352v;
import com.bytedance.android.livesdk.feed.p341i.C6959a;

/* renamed from: com.bytedance.android.livesdk.feed.f.s */
final /* synthetic */ class C6937s implements Runnable {

    /* renamed from: a */
    private final C6926k f18985a;

    /* renamed from: b */
    private final C1352v f18986b;

    C6937s(C6926k kVar, C1352v vVar) {
        this.f18985a = kVar;
        this.f18986b = vVar;
    }

    public final void run() {
        C6926k kVar = this.f18985a;
        C1352v vVar = this.f18986b;
        if (kVar.getUserVisibleHint() && kVar.isResumed()) {
            ((C6959a) vVar).mo13152f();
        }
    }
}
