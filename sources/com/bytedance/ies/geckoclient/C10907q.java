package com.bytedance.ies.geckoclient;

import com.bytedance.common.utility.C9414h;
import com.bytedance.ies.geckoclient.p682d.C10881a;
import com.bytedance.ies.geckoclient.p686e.C10938c;
import java.util.List;

/* renamed from: com.bytedance.ies.geckoclient.q */
public final class C10907q extends C10864a {

    /* renamed from: b */
    private List<C10906p> f29276b;

    /* renamed from: c */
    private C10881a f29277c;

    /* renamed from: d */
    private C10885e f29278d;

    public final void run() {
        C10903m mVar = new C10903m(this.f29278d);
        if (!C9414h.m18630a(this.f29276b)) {
            for (C10906p pVar : this.f29276b) {
                try {
                    pVar.f29265b = mVar.f29263a;
                    pVar.run();
                } catch (Exception unused) {
                }
            }
            mVar.f29263a.f29451b.addAll(C10938c.m22193a(C10885e.m22079c()).mo19723a());
            C10904n nVar = new C10904n(this.f29277c);
            nVar.f29264b = mVar;
            nVar.run();
        }
    }

    public C10907q(C10881a aVar, List<C10906p> list, C10885e eVar) {
        super(aVar);
        this.f29276b = list;
        this.f29277c = aVar;
        this.f29278d = eVar;
    }
}
