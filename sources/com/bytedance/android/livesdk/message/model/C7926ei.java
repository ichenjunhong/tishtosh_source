package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.ei */
public final class C7926ei implements C2888b<C7810ao> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        return m15893a(gVar);
    }

    /* renamed from: a */
    public static C7810ao m15893a(C2895g gVar) throws Exception {
        C7810ao aoVar = new C7810ao();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aoVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        aoVar.f21494c = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        aoVar.f21496e = (int) C2896h.m8232c(gVar);
                        break;
                    case 4:
                        aoVar.f21500i = (int) C2896h.m8232c(gVar);
                        break;
                    case 5:
                        aoVar.f21495d = (int) C2896h.m8232c(gVar);
                        break;
                    case 6:
                        aoVar.f21499h = (int) C2896h.m8232c(gVar);
                        break;
                    case 7:
                        aoVar.f21492a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 8:
                        aoVar.f21493b = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        aoVar.f21498g = C2896h.m8231b(gVar);
                        break;
                    case 10:
                        aoVar.f21502k = C7987gp.m15912a(gVar);
                        break;
                    case 11:
                        aoVar.f21501j = C2896h.m8232c(gVar);
                        break;
                    case 12:
                        aoVar.f21503l = C2896h.m8232c(gVar);
                        break;
                    case 13:
                        aoVar.f21497f = C2896h.m8232c(gVar);
                        break;
                    case 14:
                        aoVar.f21506o = C7925eh.m15892a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return aoVar;
            }
        }
    }
}
