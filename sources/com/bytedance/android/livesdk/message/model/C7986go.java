package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model._ImageModel_ProtoDecoder;
import com.bytedance.android.livesdk.message.model.C7872cm.C7873a;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.go */
public final class C7986go implements C2888b<C7873a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15911a(gVar);
    }

    /* renamed from: a */
    public static C7873a m15911a(C2895g gVar) throws Exception {
        C7873a aVar = new C7873a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.f21801a = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        aVar.f21802b = C2896h.m8231b(gVar);
                        break;
                    case 3:
                        aVar.f21803c = _ImageModel_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        aVar.f21804d = (long) C2896h.m8231b(gVar);
                        break;
                    case 5:
                        aVar.f21805e = (long) C2896h.m8231b(gVar);
                        break;
                    case 6:
                        aVar.f21806f = C2896h.m8231b(gVar);
                        break;
                    case 7:
                        aVar.f21807g = C2896h.m8231b(gVar);
                        break;
                    case 8:
                        aVar.f21808h = C2896h.m8231b(gVar);
                        break;
                    case 9:
                        aVar.f21809i = C2896h.m8231b(gVar);
                        break;
                    case 10:
                        aVar.f21810j = C2896h.m8231b(gVar);
                        break;
                    case 11:
                        aVar.f21811k = C2896h.m8231b(gVar);
                        break;
                    case 12:
                        aVar.f21812l = C2896h.m8231b(gVar);
                        break;
                    case 13:
                        aVar.f21813m = C2896h.m8234e(gVar);
                        break;
                    case 14:
                        aVar.f21814n = C2896h.m8234e(gVar);
                        break;
                    case 15:
                        aVar.f21815o = C2896h.m8231b(gVar);
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
