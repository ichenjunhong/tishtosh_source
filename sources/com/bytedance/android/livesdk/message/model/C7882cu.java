package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.live.base.model.user._User_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.cu */
public final class C7882cu implements C2888b<C7793a> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7793a aVar = new C7793a();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        aVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        aVar.f21426a = C2896h.m8232c(gVar);
                        break;
                    case 3:
                        aVar.f21427b = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 4:
                        aVar.f21428c = C2896h.m8230a(gVar);
                        break;
                    case 5:
                        aVar.f21429d = C2896h.m8230a(gVar);
                        break;
                    case 6:
                        aVar.f21430e = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 7:
                        aVar.f21431f = _User_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 8:
                        aVar.f21432g = C7925eh.m15892a(gVar);
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
