package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.gs */
public final class C7990gs implements C2888b<C7876cp> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15913a(gVar);
    }

    /* renamed from: a */
    public static C7876cp m15913a(C2895g gVar) throws Exception {
        C7876cp cpVar = new C7876cp();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cpVar.f21824a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        cpVar.f21825b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        cpVar.f21826c = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return cpVar;
            }
        }
    }
}
