package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C8004p.C8005a;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.di */
public final class C7897di implements C2888b<C8005a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15887a(gVar);
    }

    /* renamed from: a */
    public static C8005a m15887a(C2895g gVar) throws Exception {
        C8005a aVar = new C8005a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f21891a = C2896h.m8234e(gVar);
                        break;
                    case 2:
                        aVar.f21892b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        aVar.f21893c = C2896h.m8234e(gVar);
                        break;
                    case 4:
                        aVar.f21894d = (int) C2896h.m8232c(gVar);
                        break;
                    case 5:
                        aVar.f21895e = (int) C2896h.m8232c(gVar);
                        break;
                    case 6:
                        aVar.f21896f = _ImageModel_ProtoDecoder.decodeStatic(gVar);
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
