package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.gp */
public final class C7987gp implements C2888b<C7872cm> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15912a(gVar);
    }

    /* renamed from: a */
    public static C7872cm m15912a(C2895g gVar) throws Exception {
        C7872cm cmVar = new C7872cm();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cmVar.f21799a = C7986go.m15911a(gVar);
                        break;
                    case 2:
                        cmVar.f21800b = C7986go.m15911a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return cmVar;
            }
        }
    }
}
