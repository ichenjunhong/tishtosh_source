package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2893e;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;
import com.google.gson.p1077b.C17956a;

/* renamed from: com.bytedance.android.livesdk.message.model.dt */
public final class C7909dt implements C2888b<C8017z> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C8017z zVar = new C8017z();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        zVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        zVar.f21946c = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        zVar.f21948e = C2896h.m8232c(gVar);
                        break;
                    case 4:
                        zVar.f21944a = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 5:
                        zVar.f21945b = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        zVar.f21950g = (C7794aa) C2893e.m8214a(C2896h.m8234e(gVar), new C17956a<C7794aa>() {
                        }.f49843c);
                        break;
                    case 7:
                        zVar.f21949f = C2896h.m8232c(gVar);
                        break;
                    case 8:
                        zVar.f21951h = C7925eh.m15892a(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return zVar;
            }
        }
    }
}
