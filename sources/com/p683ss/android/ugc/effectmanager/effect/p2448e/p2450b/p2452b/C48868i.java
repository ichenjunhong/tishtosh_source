package com.p683ss.android.ugc.effectmanager.effect.p2448e.p2450b.p2452b;

import android.os.Handler;
import com.p683ss.android.ugc.effectmanager.C48890g;
import com.p683ss.android.ugc.effectmanager.common.p2434b.C48620c;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48649d;
import com.p683ss.android.ugc.effectmanager.common.p2440g.C48656j;
import com.p683ss.android.ugc.effectmanager.effect.model.Effect;
import com.p683ss.android.ugc.effectmanager.effect.p2448e.p2449a.C48749e;
import com.p683ss.android.ugc.effectmanager.p2430a.C48565a;

/* renamed from: com.ss.android.ugc.effectmanager.effect.e.b.b.i */
public final class C48868i extends C48656j {

    /* renamed from: a */
    private C48890g f122833a;

    /* renamed from: b */
    private Effect f122834b;

    /* renamed from: a */
    public final void mo96139a() {
        C48620c cVar = this.f122833a.f122972r;
        if (this.f122834b == null || cVar == null) {
            mo96238a(15, new C48749e(this.f122834b, new C48649d(10003)));
            return;
        }
        try {
            if (cVar.mo96155d(this.f122834b.getId())) {
                mo96238a(15, new C48749e(this.f122834b, null));
            } else {
                mo96238a(15, new C48749e(this.f122834b, new C48649d(10003)));
            }
        } catch (Exception e) {
            mo96238a(15, new C48749e(this.f122834b, new C48649d(e)));
        }
    }

    public C48868i(C48565a aVar, Effect effect, Handler handler, String str) {
        super(handler, str);
        this.f122833a = aVar.f122047a;
        this.f122834b = effect;
    }
}
