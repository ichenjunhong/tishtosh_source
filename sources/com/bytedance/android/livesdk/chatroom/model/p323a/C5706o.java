package com.bytedance.android.livesdk.chatroom.model.p323a;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.chatroom.model.a.o */
public final class C5706o implements C2888b<C5703l> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m12613a(gVar);
    }

    /* renamed from: a */
    public static C5703l m12613a(C2895g gVar) throws Exception {
        C5703l lVar = new C5703l();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        lVar.f14989a = C2896h.m8232c(gVar);
                        break;
                    case 2:
                        lVar.f14990b = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        lVar.f14991c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        lVar.f14992d = (int) C2896h.m8232c(gVar);
                        break;
                    case 5:
                        lVar.f14993e = C2896h.m8232c(gVar);
                        break;
                    case 6:
                        lVar.f14994f = (int) C2896h.m8232c(gVar);
                        break;
                    case 7:
                        lVar.f14995g = C2896h.m8230a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return lVar;
            }
        }
    }
}
