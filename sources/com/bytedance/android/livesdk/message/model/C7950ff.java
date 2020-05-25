package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C7835bj.C7836a;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.ff */
public final class C7950ff implements C2888b<C7836a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15899a(gVar);
    }

    /* renamed from: a */
    public static C7836a m15899a(C2895g gVar) throws Exception {
        C7836a aVar = new C7836a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f21647a = (int) C2896h.m8232c(gVar);
                        break;
                    case 2:
                        aVar.f21648b = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 3:
                        aVar.f21650d = (int) C2896h.m8232c(gVar);
                        break;
                    case 4:
                        aVar.f21649c = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        aVar.f21651e = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        aVar.f21652f = C2896h.m8231b(gVar);
                        break;
                    case 7:
                        aVar.f21653g = C2896h.m8232c(gVar);
                        break;
                    case 8:
                        aVar.f21654h = _ImageModel_ProtoDecoder.decodeStatic(gVar);
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
