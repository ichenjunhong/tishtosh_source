package com.p683ss.android.ugc.aweme.effect;

import android.app.Application;
import com.p683ss.android.ugc.aweme.effect.p1679f.C29201d;
import com.p683ss.android.ugc.aweme.effectplatform.C29242c;
import com.p683ss.android.ugc.aweme.effectplatform.C29252f;
import com.p683ss.android.ugc.aweme.port.p2082in.C39629l;
import com.p683ss.android.ugc.effectmanager.effect.p2444c.C48702g;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.ss.android.ugc.aweme.effect.q */
public final class C29212q implements C29201d {

    /* renamed from: a */
    private C29252f f76518a;

    /* renamed from: a */
    public final void mo59105a() {
        C29252f fVar = this.f76518a;
        if (fVar != null) {
            fVar.destroy();
        }
        this.f76518a = null;
    }

    /* renamed from: a */
    public final void mo59106a(C48702g gVar) {
        C52711k.m112240b(gVar, "listener");
        if (this.f76518a == null) {
            Application b = C39629l.m88233b();
            C52711k.m112236a((Object) b, "CameraClient.getApplication()");
            this.f76518a = C29242c.m68869a(b, null);
        }
        C29252f fVar = this.f76518a;
        if (fVar != null) {
            fVar.mo59143b("editingeffect", false, gVar);
        }
    }
}
