package com.bytedance.android.livesdk.feed.drawerfeed;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.core.p226e.C3842b;
import com.bytedance.android.live.core.p226e.C3842b.C3843a;

/* renamed from: com.bytedance.android.livesdk.feed.drawerfeed.t */
final /* synthetic */ class C6901t implements C0199s {

    /* renamed from: a */
    private final C6890l f18895a;

    C6901t(C6890l lVar) {
        this.f18895a = lVar;
    }

    public final void onChanged(Object obj) {
        C6890l lVar = this.f18895a;
        C3842b bVar = (C3842b) obj;
        lVar.f18931s.setRefreshing(bVar != null && lVar.f18880k && bVar.mo9203a() && lVar.f18882n);
        lVar.f18882n = true;
        if (bVar.f10823a.equals(C3843a.SUCCESS) && lVar.f18881m != null) {
            lVar.f18881m.mo12987g();
        }
        if (lVar.f18872c != null && lVar.f18872c.f19439a) {
            lVar.f18872c.mo13276b();
        }
        if (bVar.f10823a != C3843a.RUNNING && lVar.f18878i != null) {
            lVar.f18878i.mo12857c();
        }
    }
}
