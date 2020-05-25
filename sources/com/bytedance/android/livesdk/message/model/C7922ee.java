package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdk.message.model.C7805ak.C7806a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.ee */
public final class C7922ee implements C2888b<C7806a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15891a(gVar);
    }

    /* renamed from: a */
    public static C7806a m15891a(C2895g gVar) throws Exception {
        C7806a aVar = new C7806a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f21479a = C2896h.m8231b(gVar);
                        break;
                    case 2:
                        aVar.f21480b = C2896h.m8230a(gVar);
                        break;
                    case 3:
                        aVar.f21481c = C2896h.m8230a(gVar);
                        break;
                    case 4:
                        aVar.f21482d = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return aVar;
            }
        }
    }
}
