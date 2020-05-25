package com.bytedance.android.live.broadcast;

import com.bytedance.android.live.core.p224c.C3831a;
import com.bytedance.android.live.core.p225d.C3837e;
import p064c.p065a.p071d.C1710e;

/* renamed from: com.bytedance.android.live.broadcast.u */
final /* synthetic */ class C3624u implements C1710e {

    /* renamed from: a */
    private final C3617q f10327a;

    C3624u(C3617q qVar) {
        this.f10327a = qVar;
    }

    public final void accept(Object obj) {
        C3617q qVar = this.f10327a;
        Throwable th = (Throwable) obj;
        qVar.isLoadedRes.setValue(Boolean.valueOf(false));
        qVar.f10315c = false;
        qVar.f10314b = th.toString();
        C3831a.m9716d("LiveCameraResManager", th.toString());
        qVar.f10313a.put("load_function_error", th.toString());
        qVar.f10313a.put("error_code", Integer.valueOf(10002));
        qVar.f10313a.put("error_msg", "load_function_error");
        C3837e.m9743a("ttlive_start_live_resource_load_all", 1, qVar.f10313a);
        qVar.f10313a.clear();
    }
}
