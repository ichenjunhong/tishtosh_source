package com.bytedance.android.livesdk.gift.relay.p381a;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.gift.relay.a.d */
public final class C7633d implements C2888b<C7629a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15626a(gVar);
    }

    /* renamed from: a */
    public static C7629a m15626a(C2895g gVar) throws Exception {
        C7629a aVar = new C7629a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f20970b = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        aVar.f20971c = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        aVar.f20972d = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        aVar.f20973e = C2896h.m8232c(gVar);
                        break;
                    case 5:
                        aVar.f20974f = C2896h.m8232c(gVar);
                        break;
                    case 6:
                        aVar.f20975g = C2896h.m8232c(gVar);
                        break;
                    case 7:
                        aVar.f20976h = C2896h.m8230a(gVar);
                        break;
                    case 8:
                        aVar.f20977i = C2896h.m8230a(gVar);
                        break;
                    case 9:
                        aVar.f20978j = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 10:
                        aVar.f20979k = C2896h.m8232c(gVar);
                        break;
                    case 11:
                        aVar.f20980l = C2896h.m8232c(gVar);
                        break;
                    case 12:
                        aVar.f20981m = C2896h.m8232c(gVar);
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
