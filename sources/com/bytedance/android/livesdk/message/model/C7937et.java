package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C7820ay.C7821a.C7822a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.et */
public final class C7937et implements C2888b<C7822a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15896a(gVar);
    }

    /* renamed from: a */
    public static C7822a m15896a(C2895g gVar) throws Exception {
        C7822a aVar = new C7822a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f21533a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        aVar.f21534b = (int) C2896h.m8232c(gVar);
                        break;
                    case 3:
                        aVar.f21535c = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        aVar.f21536d = _ImageModel_ProtoDecoder.decodeStatic(gVar);
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
