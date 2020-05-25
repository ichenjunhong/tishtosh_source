package com.bytedance.android.live.broadcast;

import com.bytedance.android.live.core.p225d.C3837e;
import com.bytedance.android.livesdk.p272ad.C4525b;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.t */
final /* synthetic */ class C3623t implements C1710e {

    /* renamed from: a */
    private final C3617q f10326a;

    C3623t(C3617q qVar) {
        this.f10326a = qVar;
    }

    public final void accept(Object obj) {
        C3617q qVar = this.f10326a;
        Boolean bool = (Boolean) obj;
        if (bool.booleanValue()) {
            qVar.f10315c = false;
            C4525b.f12435i.mo10346a("0.0.20");
            qVar.isLoadedRes.setValue(Boolean.valueOf(true));
        } else {
            qVar.f10315c = false;
            qVar.isLoadedRes.setValue(Boolean.valueOf(false));
        }
        if (!bool.booleanValue()) {
            qVar.f10313a.put("error_code", Integer.valueOf(10001));
            qVar.f10313a.put("error_msg", "load_res_error");
        }
        boolean z = !bool.booleanValue();
        C3837e.m9743a("ttlive_start_live_resource_load_all", z ? 1 : 0, qVar.f10313a);
        qVar.f10313a.clear();
    }
}
