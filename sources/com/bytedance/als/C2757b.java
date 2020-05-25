package com.bytedance.als;

import android.arch.lifecycle.C0176h.C0178b;
import com.bytedance.p780m.C12361b;
import p2628d.p2639f.p2641b.C52711k;

/* renamed from: com.bytedance.als.b */
public final class C2757b {

    /* renamed from: a */
    public final AlsLogicContainer f8321a;

    /* renamed from: a */
    public final void mo7344a() {
        C2764h hVar;
        AlsLogicContainer alsLogicContainer = this.f8321a;
        alsLogicContainer.f8309d = alsLogicContainer.f8308c.mo23376a();
        for (Class cls : alsLogicContainer.f8310e) {
            C12361b bVar = alsLogicContainer.f8309d;
            if (bVar != null) {
                hVar = (C2764h) bVar.mo23372a(cls);
            } else {
                hVar = null;
            }
            if (hVar != null) {
                C52711k.m112240b(hVar, "logic");
                if (alsLogicContainer.f8306a.mo323a() == C0178b.DESTROYED) {
                    continue;
                } else if (alsLogicContainer.f8307b.add(hVar)) {
                    alsLogicContainer.f8311f.mo7340a(hVar.mo7353a());
                    if (alsLogicContainer.f8306a.mo323a().isAtLeast(C0178b.CREATED)) {
                        hVar.bO_();
                        if (alsLogicContainer.f8306a.mo323a().isAtLeast(C0178b.STARTED)) {
                            hVar.mo7357s_();
                            if (alsLogicContainer.f8306a.mo323a().isAtLeast(C0178b.RESUMED)) {
                                hVar.mo7358t_();
                            }
                        }
                    }
                } else {
                    throw new IllegalArgumentException("LogicComponent already exists");
                }
            }
        }
    }

    public C2757b(AlsLogicContainer alsLogicContainer) {
        C52711k.m112240b(alsLogicContainer, "alsLogicContainer");
        this.f8321a = alsLogicContainer;
    }
}
