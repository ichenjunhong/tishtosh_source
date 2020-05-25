package com.bytedance.android.livesdk.feed.p331a;

import android.arch.lifecycle.C0199s;
import com.bytedance.android.live.core.p230g.C3921y;

/* renamed from: com.bytedance.android.livesdk.feed.a.m */
public final /* synthetic */ class C6824m implements C0199s {

    /* renamed from: a */
    private final C6812e f18709a;

    public C6824m(C6812e eVar) {
        this.f18709a = eVar;
    }

    public final void onChanged(Object obj) {
        C6812e eVar = this.f18709a;
        Integer num = (Integer) obj;
        if (num != null && eVar.f18676b != null) {
            C3921y.m9898a(eVar.f18676b, 0);
            if (eVar.f18677c.mo13269h()) {
                C3921y.m9898a(eVar.f18676b, num.intValue());
            } else {
                eVar.f18676b.mo4814b(num.intValue());
            }
        }
    }
}
