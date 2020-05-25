package com.bytedance.android.livesdk.feed.p338f;

import android.arch.lifecycle.C0199s;
import android.support.p043v7.widget.RecyclerView.C1352v;
import com.bytedance.android.livesdk.feed.p341i.C6959a;

/* renamed from: com.bytedance.android.livesdk.feed.f.l */
final /* synthetic */ class C6930l implements C0199s {

    /* renamed from: a */
    private final C6926k f18978a;

    C6930l(C6926k kVar) {
        this.f18978a = kVar;
    }

    public final void onChanged(Object obj) {
        C6926k kVar = this.f18978a;
        Integer num = (Integer) obj;
        if (num != null) {
            C1352v f = kVar.f18921q.mo4847f(num.intValue());
            if (f instanceof C6959a) {
                kVar.f18921q.postDelayed(new C6937s(kVar, f), 500);
            }
        }
    }
}
