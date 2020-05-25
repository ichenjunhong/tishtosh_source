package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.el */
public final class C7929el implements C2888b<C7813ar> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15894a(gVar);
    }

    /* renamed from: a */
    public static C7813ar m15894a(C2895g gVar) throws Exception {
        C7813ar arVar = new C7813ar();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        arVar.f21515d = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        arVar.f21513b = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        arVar.f21514c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        arVar.f21512a = C2896h.m8232c(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return arVar;
            }
        }
    }
}
