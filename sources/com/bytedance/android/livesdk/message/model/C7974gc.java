package com.bytedance.android.livesdk.message.model;

import com.bytedance.android.livesdkapi.message._CommonMessageData_ProtoDecoder;
import com.bytedance.android.livesdkapi.message._Text_ProtoDecoder;
import com.bytedance.android.p173d.p174a.p175a.C2888b;
import com.bytedance.android.p173d.p174a.p175a.C2895g;
import com.bytedance.android.p173d.p174a.p175a.C2896h;

/* renamed from: com.bytedance.android.livesdk.message.model.gc */
public final class C7974gc implements C2888b<C7861cb> {
    public final /* synthetic */ Object decode(C2895g gVar) throws Exception {
        C7861cb cbVar = new C7861cb();
        long a = gVar.mo7514a();
        while (true) {
            int b = gVar.mo7517b();
            if (b != -1) {
                switch (b) {
                    case 1:
                        cbVar.baseMessage = _CommonMessageData_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 2:
                        cbVar.f21738a = C2896h.m8234e(gVar);
                        break;
                    case 3:
                        cbVar.f21739b = (int) C2896h.m8232c(gVar);
                        break;
                    case 4:
                        cbVar.f21740c = C2896h.m8234e(gVar);
                        break;
                    case 5:
                        cbVar.f21741d = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 6:
                        cbVar.f21742e = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 7:
                        cbVar.f21743f = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 8:
                        cbVar.f21744g = _Text_ProtoDecoder.decodeStatic(gVar);
                        break;
                    case 9:
                        cbVar.f21745h = C2896h.m8234e(gVar);
                        break;
                    default:
                        C2896h.m8236g(gVar);
                        break;
                }
            } else {
                gVar.mo7516a(a);
                return cbVar;
            }
        }
    }
}
