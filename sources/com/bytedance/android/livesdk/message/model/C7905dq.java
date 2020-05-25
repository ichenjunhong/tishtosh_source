package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2893e;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import com.google.gson.p1077b.C17956a;

/* renamed from: com.bytedance.android.livesdk.message.model.dq */
public final class C7905dq implements C2888b<C8012v> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C8012v vVar = new C8012v();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        vVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        vVar.f21923a = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        vVar.f21927e = (int) C2896h.m8232c(gVar);
                        break;
                    case 4:
                        vVar.f21924b = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        vVar.f21928f = (int) C2896h.m8232c(gVar);
                        break;
                    case 7:
                        vVar.f21929g = (C8013w) C2893e.m8214a(C2896h.m8234e(gVar), new C17956a<C8013w>() {
                        }.f49843c);
                        break;
                    case 8:
                        vVar.f21935m = C2896h.m8234e(gVar);
                        break;
                    case 9:
                        vVar.f21926d = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 10:
                        vVar.f21931i = (int) C2896h.m8232c(gVar);
                        break;
                    case 11:
                        vVar.f21932j = C2896h.m8234e(gVar);
                        break;
                    case 12:
                        vVar.f21925c = C2896h.m8234e(gVar);
                        break;
                    case 13:
                        vVar.f21933k = C2896h.m8232c(gVar);
                        break;
                    case 14:
                        vVar.f21934l = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return vVar;
            }
        }
    }
}
